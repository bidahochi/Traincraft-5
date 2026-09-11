package train.common.tile;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.library.track.TrackHostConstants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Optional captured-host state for a rail tile.
 *
 * True-embedded and slab-mounted rails replace world blocks and must remember those original blocks so the client
 * can render the captured host material and the server can restore it on removal. Keeping this in a lazy holder keeps
 * ordinary surface rails from allocating the host map, render version, and restore guards they will never use.
 *
 * This is deliberately not a separate TileEntity: existing rail saves and block registrations expect TileTCRail.
 * TileTCRail remains the tile identity, while this object owns only the optional captured-host payload.
 */
public final class TileTCRailHostData
{
	private static final String HOST_BLOCKS_TAG = "CapturedHostBlocks";
	private static final String OFFSET_X_TAG = "offsetX";
	private static final String OFFSET_Y_TAG = "offsetY";
	private static final String OFFSET_Z_TAG = "offsetZ";
	private static final String BLOCK_ID_TAG = "blockId";
	private static final String METADATA_TAG = "metadata";
	private static final String COLOUR_TAG = "colour";
	private static final String SHAPES_TAG = "shapes";
	private static final String MIN_X_TAG = "minX";
	private static final String MIN_Y_TAG = "minY";
	private static final String MIN_Z_TAG = "minZ";
	private static final String MAX_X_TAG = "maxX";
	private static final String MAX_Y_TAG = "maxY";
	private static final String MAX_Z_TAG = "maxZ";
	private static final String RENDER_SOURCE_X_TAG = "TrackHostRenderSourceX";
	private static final String RENDER_SOURCE_Y_TAG = "TrackHostRenderSourceY";
	private static final String RENDER_SOURCE_Z_TAG = "TrackHostRenderSourceZ";
	private final TileTCRail owner;
	private final LinkedHashMap<String, CapturedHostBlock> hostBlocks = new LinkedHashMap<String, CapturedHostBlock>();
	private final Map<String, CapturedHostBlock> readOnlyHostBlocks = Collections.unmodifiableMap(hostBlocks);
	private Map<String, CapturedHostBlock> rebasedRenderBlocks = Collections.emptyMap();
	private int renderSourceOffsetX;
	private int renderSourceOffsetY;
	private int renderSourceOffsetZ;
	private double surfaceHeight = TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
	private int renderVersion = 0;
	private boolean restoring = false;
	private static boolean restoringGlobally = false;

	/**
	 * Creates captured-host state for one parent rail tile.
	 *
	 * @param owner rail tile that owns the captured coordinates
	 */
	public TileTCRailHostData(TileTCRail owner)
	{
		this.owner = owner;
	}

	/**
	 * A captured host block stored relative to the parent rail tile.
	 *
	 * Local offsets are important for long tracks and switches: a single parent can cover many blocks, and each
	 * captured block may have a different id, metadata, or grass/biome color. The map key is derived from these
	 * offsets so render and restore can address each saved host cell without duplicating data into gag tiles.
	 */
	public static final class CapturedHostBlock
	{
		public final int offsetX;
		public final int offsetY;
		public final int offsetZ;
		public final int blockId;
		public final int metadata;
		public final int colour;
		public final List<CapturedHostShape> shapes;

		/**
		 * Creates one captured host entry.
		 *
		 * @param offsetX owner-relative X coordinate
		 * @param offsetY owner-relative Y coordinate
		 * @param offsetZ owner-relative Z coordinate
		 * @param blockId captured block registry ID
		 * @param metadata captured block metadata
		 * @param colour captured biome or block tint
		 */
		public CapturedHostBlock(int offsetX, int offsetY, int offsetZ, int blockId, int metadata, int colour)
		{
			this(offsetX, offsetY, offsetZ, blockId, metadata, colour,
					Collections.<CapturedHostShape>emptyList());
		}

		/**
		 * Creates one captured host entry with an exact local collision and render shape.
		 *
		 * @param offsetX owner-relative X coordinate
		 * @param offsetY owner-relative Y coordinate
		 * @param offsetZ owner-relative Z coordinate
		 * @param blockId captured block registry ID
		 * @param metadata captured block metadata
		 * @param colour captured biome or block tint
		 * @param shapes immutable-source local cuboids for a non-cuboid host
		 */
		public CapturedHostBlock(int offsetX, int offsetY, int offsetZ, int blockId, int metadata, int colour,
				List<CapturedHostShape> shapes)
		{
			this.offsetX = offsetX;
			this.offsetY = offsetY;
			this.offsetZ = offsetZ;
			this.blockId = blockId;
			this.metadata = metadata;
			this.colour = colour;
			this.shapes = Collections.unmodifiableList(new ArrayList<CapturedHostShape>(shapes));
		}

		/**
		 * Returns this entry's owner-relative coordinate key.
		 *
		 * @return stable coordinate key
		 */
		private String getKey()
		{
			return key(offsetX, offsetY, offsetZ);
		}
	}

	/** One axis-aligned cuboid from a captured host block, expressed in local zero-to-one coordinates. */
	public static final class CapturedHostShape
	{
		public final double minX;
		public final double minY;
		public final double minZ;
		public final double maxX;
		public final double maxY;
		public final double maxZ;

		/**
		 * Creates one immutable local host cuboid.
		 *
		 * @param minX minimum local X coordinate
		 * @param minY minimum local Y coordinate
		 * @param minZ minimum local Z coordinate
		 * @param maxX maximum local X coordinate
		 * @param maxY maximum local Y coordinate
		 * @param maxZ maximum local Z coordinate
		 */
		public CapturedHostShape(double minX, double minY, double minZ,
				double maxX, double maxY, double maxZ)
		{
			this.minX = minX;
			this.minY = minY;
			this.minZ = minZ;
			this.maxX = maxX;
			this.maxY = maxY;
			this.maxZ = maxZ;
		}
	}

	/**
	 * Builds the stable coordinate key shared by captured-host storage, placement, and rendering.
	 *
	 * @param offsetX owner-relative host X coordinate
	 * @param offsetY owner-relative host Y coordinate
	 * @param offsetZ owner-relative host Z coordinate
	 * @return comma-separated coordinate key in {@code x,y,z} order
	 */
	public static String key(int offsetX, int offsetY, int offsetZ)
	{
		return offsetX + "," + offsetY + "," + offsetZ;
	}

	/** Clears all captured hosts and invalidates their render cache. */
	public void clear()
	{
		hostBlocks.clear();
		rebasedRenderBlocks = Collections.emptyMap();
		surfaceHeight = TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
		owner.markDirty();
		incrementRenderVersion();
	}

	/**
	 * Captures one host block in owner-relative coordinates.
	 *
	 * @param worldX captured block X coordinate
	 * @param worldY captured block Y coordinate
	 * @param worldZ captured block Z coordinate
	 * @param block captured block type
	 * @param metadata captured block metadata
	 * @param colour captured biome or block tint
	 */
	public void add(int worldX, int worldY, int worldZ, Block block, int metadata, int colour)
	{
		if (block == null)
		{
			return;
		}
		int blockId = Block.getIdFromBlock(block);
		if (blockId <= 0)
		{
			return;
		}
		CapturedHostBlock hostBlock = new CapturedHostBlock(worldX - owner.xCoord, worldY - owner.yCoord, worldZ - owner.zCoord, blockId, metadata, colour);
		hostBlocks.put(hostBlock.getKey(), hostBlock);
		owner.markDirty();
		incrementRenderVersion();
	}

	/**
	 * Replaces the complete captured-host map and its render-source offset.
	 *
	 * @param replacementBlocks complete replacement host collection
	 * @param sourceOffsetX render-source X offset from the owner
	 * @param sourceOffsetY render-source Y offset from the owner
	 * @param sourceOffsetZ render-source Z offset from the owner
	 */
	public void replace(Collection<CapturedHostBlock> replacementBlocks, int sourceOffsetX, int sourceOffsetY, int sourceOffsetZ)
	{
		LinkedHashMap<String, CapturedHostBlock> replacement = new LinkedHashMap<String, CapturedHostBlock>();
		for (CapturedHostBlock hostBlock : replacementBlocks)
		{
			replacement.put(hostBlock.getKey(), hostBlock);
		}
		hostBlocks.clear();
		hostBlocks.putAll(replacement);
		renderSourceOffsetX = sourceOffsetX;
		renderSourceOffsetY = sourceOffsetY;
		renderSourceOffsetZ = sourceOffsetZ;
		rebasedRenderBlocks = Collections.emptyMap();
		surfaceHeight = resolveSurfaceHeight(hostBlocks.values());
		owner.markDirty();
		incrementRenderVersion();
	}

	/**
	 * Returns captured hosts rebased to a requested render-source tile.
	 *
	 * @param source tile requesting render-relative host entries
	 * @return immutable render-relative host map, or an empty map when the source does not match
	 */
	public Map<String, CapturedHostBlock> getRenderBlocks(TileTCRail source)
	{
		if (source == null || source.xCoord != owner.xCoord + renderSourceOffsetX
				|| source.yCoord != owner.yCoord + renderSourceOffsetY
				|| source.zCoord != owner.zCoord + renderSourceOffsetZ)
		{
			return Collections.emptyMap();
		}
		if (renderSourceOffsetX == 0 && renderSourceOffsetY == 0 && renderSourceOffsetZ == 0)
		{
			return readOnlyHostBlocks;
		}
		if (rebasedRenderBlocks.isEmpty() && hostBlocks.isEmpty() == false)
		{
			LinkedHashMap<String, CapturedHostBlock> rebased = new LinkedHashMap<String, CapturedHostBlock>();
			for (CapturedHostBlock block : hostBlocks.values())
			{
				CapturedHostBlock shifted = new CapturedHostBlock(block.offsetX - renderSourceOffsetX,
						block.offsetY - renderSourceOffsetY, block.offsetZ - renderSourceOffsetZ,
						block.blockId, block.metadata, block.colour, block.shapes);
				rebased.put(shifted.getKey(), shifted);
			}
			rebasedRenderBlocks = Collections.unmodifiableMap(rebased);
		}
		return rebasedRenderBlocks;
	}

	/**
	 * Returns the captured host at one owner-relative coordinate.
	 *
	 * @param offsetX owner-relative X coordinate
	 * @param offsetY owner-relative Y coordinate
	 * @param offsetZ owner-relative Z coordinate
	 * @return captured host entry, or {@code null} when absent
	 */
	public CapturedHostBlock getAtLocalOffset(int offsetX, int offsetY, int offsetZ)
	{
		return hostBlocks.get(key(offsetX, offsetY, offsetZ));
	}

	/**
	 * Returns whether any host blocks are captured.
	 *
	 * @return whether the captured-host map is nonempty
	 */
	public boolean hasBlocks()
	{
		return hostBlocks.isEmpty() == false;
	}

	/** Returns the immutable owner-relative captured footprint for destruction-time cleanup. */
	Collection<CapturedHostBlock> getBlocks()
	{
		return readOnlyHostBlocks.values();
	}

	/**
	 * Returns the common top surface of the captured footprint.
	 *
	 * @return one-half block for bottom slabs, or one block for full and top-slab hosts
	 */
	public double getSurfaceHeight()
	{
		return surfaceHeight;
	}

	/**
	 * Returns the current captured-host render-cache version.
	 *
	 * @return monotonically increasing render version
	 */
	public int getRenderVersion()
	{
		return renderVersion;
	}

	/**
	 * Advances the shared render version after a neighboring block changes. The client renderer rebuilds when visibility
	 * changes and otherwise refreshes placement lighting immediately from the same event.
	 */
	public void markDirty()
	{
		incrementRenderVersion();
	}

	/**
	 * Bumps the client render cache version and marks both storage and rendering tiles.
	 *
	 * Neighbor changes can expose or hide host block sides. The renderer bakes those visible faces into a cache, so
	 * we invalidate by version instead of doing neighbor occlusion checks every frame. A compound switch may render
	 * from a different tile than the hidden parent that stores this data, so both coordinates must receive the update.
	 */
	private void incrementRenderVersion()
	{
		renderVersion++;
		if (owner.getWorldObj() != null)
		{
			owner.getWorldObj().markBlockForUpdate(owner.xCoord, owner.yCoord, owner.zCoord);
			if (renderSourceOffsetX != 0 || renderSourceOffsetY != 0 || renderSourceOffsetZ != 0)
			{
				owner.getWorldObj().markBlockForUpdate(owner.xCoord + renderSourceOffsetX,
						owner.yCoord + renderSourceOffsetY, owner.zCoord + renderSourceOffsetZ);
			}
		}
	}

	/**
	 * Restores every captured host into its original world coordinate.
	 *
	 * @param world server world receiving restored blocks
	 */
	public void restore(World world)
	{
		if (world == null || world.isRemote || hostBlocks.isEmpty() || restoring)
		{
			return;
		}
		/*
		 * Removal can cascade through linked rails and gags. The local and global guards keep restoration from
		 * re-entering while these captured blocks are being written back into the world.
		 */
		restoring = true;
		restoringGlobally = true;
		try
		{
			/*
			 * World.setBlock refuses coordinates in unloaded chunks. A long switch can cross a chunk boundary, so some
			 * captured cells may be unloaded even while the broken cell is beside the player. Load each exact captured
			 * coordinate before writing anything; otherwise the failed writes would be lost when the parent tile is removed.
			 */
			for (CapturedHostBlock hostBlock : hostBlocks.values())
			{
				world.getChunkFromBlockCoords(owner.xCoord + hostBlock.offsetX,
						owner.zCoord + hostBlock.offsetZ);
			}
			for (CapturedHostBlock hostBlock : hostBlocks.values())
			{
				int restoreX = owner.xCoord + hostBlock.offsetX;
				int restoreY = owner.yCoord + hostBlock.offsetY;
				int restoreZ = owner.zCoord + hostBlock.offsetZ;
				Block block = Block.getBlockById(hostBlock.blockId);
				if (block == null)
				{
					world.setBlockToAir(restoreX, restoreY, restoreZ);
				}
				else
				{
					world.setBlock(restoreX, restoreY, restoreZ, block, hostBlock.metadata,
							TrackHostConstants.NOTIFY_NEIGHBORS_AND_CLIENTS);
				}
			}
			hostBlocks.clear();
		}
		finally
		{
			restoringGlobally = false;
			restoring = false;
			incrementRenderVersion();
		}
	}

	/**
	 * Loads captured hosts and their render-source offset from tile NBT.
	 *
	 * @param nbt compound containing saved rail data
	 */
	public void readFromNBT(NBTTagCompound nbt)
	{
		/*
		 * Older saves and all normal rails may not have this tag. TileTCRail only creates this holder when the tag has
		 * entries, so regular rails remain light after loading.
		 */
		hostBlocks.clear();
		rebasedRenderBlocks = Collections.emptyMap();
		renderSourceOffsetX = nbt.getInteger(RENDER_SOURCE_X_TAG);
		renderSourceOffsetY = nbt.getInteger(RENDER_SOURCE_Y_TAG);
		renderSourceOffsetZ = nbt.getInteger(RENDER_SOURCE_Z_TAG);
		NBTTagList trackHostTagList = nbt.getTagList(HOST_BLOCKS_TAG, Constants.NBT.TAG_COMPOUND);
		for (int i = 0; i < trackHostTagList.tagCount(); i++)
		{
			NBTTagCompound hostTag = trackHostTagList.getCompoundTagAt(i);
			CapturedHostBlock hostBlock = new CapturedHostBlock(
					hostTag.getInteger(OFFSET_X_TAG),
					hostTag.getInteger(OFFSET_Y_TAG),
					hostTag.getInteger(OFFSET_Z_TAG),
					hostTag.getInteger(BLOCK_ID_TAG),
					hostTag.getInteger(METADATA_TAG),
					hostTag.hasKey(COLOUR_TAG) ? hostTag.getInteger(COLOUR_TAG)
							: TrackHostConstants.DEFAULT_HOST_TINT,
					readShapes(hostTag));
			 hostBlocks.put(hostBlock.getKey(), hostBlock);
		}
		surfaceHeight = resolveSurfaceHeight(hostBlocks.values());
		renderVersion++;
	}

	/** Reads optional exact host cuboids persisted for non-cuboid blocks such as stairs. */
	private static List<CapturedHostShape> readShapes(NBTTagCompound hostTag)
	{
		NBTTagList shapeTags = hostTag.getTagList(SHAPES_TAG, Constants.NBT.TAG_COMPOUND);
		List<CapturedHostShape> shapes = new ArrayList<CapturedHostShape>(shapeTags.tagCount());
		for (int index = 0; index < shapeTags.tagCount(); index++)
		{
			NBTTagCompound shapeTag = shapeTags.getCompoundTagAt(index);
			shapes.add(new CapturedHostShape(shapeTag.getDouble(MIN_X_TAG), shapeTag.getDouble(MIN_Y_TAG),
					shapeTag.getDouble(MIN_Z_TAG), shapeTag.getDouble(MAX_X_TAG),
					shapeTag.getDouble(MAX_Y_TAG), shapeTag.getDouble(MAX_Z_TAG)));
		}
		return shapes;
	}

	/**
	 * Derives the shared track-host surface height from unchanged captured-host data.
	 *
	 * @param blocks captured host blocks whose common surface is inspected
	 * @return one-half block for a bottom-slab footprint, or one block otherwise
	 */
	private static double resolveSurfaceHeight(Collection<CapturedHostBlock> blocks)
	{
		for (CapturedHostBlock host : blocks)
		{
			return resolveHostSurfaceHeight(Block.getBlockById(host.blockId), host.metadata);
		}
		return TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
	}

	/**
	 * Resolves one captured host's top surface from its block shape and metadata.
	 *
	 * @param block captured host block type
	 * @param metadata captured host metadata
	 * @return one-half block for a bottom slab, or one block otherwise
	 */
	public static double resolveHostSurfaceHeight(Block block, int metadata)
	{
		return block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0
				? TrackHostConstants.HALF_BLOCK_HEIGHT
				: TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
	}

	/**
	 * Writes captured hosts and their render-source offset to tile NBT.
	 *
	 * @param nbt compound receiving saved rail data
	 */
	public void writeToNBT(NBTTagCompound nbt)
	{
		if (hostBlocks.isEmpty())
		{
			return;
		}
		NBTTagList trackHostTagList = new NBTTagList();
		for (CapturedHostBlock hostBlock : hostBlocks.values())
		{
			NBTTagCompound hostTag = new NBTTagCompound();
			hostTag.setInteger(OFFSET_X_TAG, hostBlock.offsetX);
			hostTag.setInteger(OFFSET_Y_TAG, hostBlock.offsetY);
			hostTag.setInteger(OFFSET_Z_TAG, hostBlock.offsetZ);
			hostTag.setInteger(BLOCK_ID_TAG, hostBlock.blockId);
			hostTag.setInteger(METADATA_TAG, hostBlock.metadata);
			hostTag.setInteger(COLOUR_TAG, hostBlock.colour);
			if (hostBlock.shapes.isEmpty() == false)
			{
				NBTTagList shapeTags = new NBTTagList();
				for (CapturedHostShape shape : hostBlock.shapes)
				{
					NBTTagCompound shapeTag = new NBTTagCompound();
					shapeTag.setDouble(MIN_X_TAG, shape.minX);
					shapeTag.setDouble(MIN_Y_TAG, shape.minY);
					shapeTag.setDouble(MIN_Z_TAG, shape.minZ);
					shapeTag.setDouble(MAX_X_TAG, shape.maxX);
					shapeTag.setDouble(MAX_Y_TAG, shape.maxY);
					shapeTag.setDouble(MAX_Z_TAG, shape.maxZ);
					shapeTags.appendTag(shapeTag);
				}
				hostTag.setTag(SHAPES_TAG, shapeTags);
			}
			trackHostTagList.appendTag(hostTag);
		}
		nbt.setTag(HOST_BLOCKS_TAG, trackHostTagList);
		nbt.setInteger(RENDER_SOURCE_X_TAG, renderSourceOffsetX);
		nbt.setInteger(RENDER_SOURCE_Y_TAG, renderSourceOffsetY);
		nbt.setInteger(RENDER_SOURCE_Z_TAG, renderSourceOffsetZ);
	}

	/**
	 * Returns whether any captured-host map is currently restoring blocks.
	 *
	 * @return global restoration guard
	 */
	public static boolean isRestoringGlobally()
	{
		return restoringGlobally;
	}
}
