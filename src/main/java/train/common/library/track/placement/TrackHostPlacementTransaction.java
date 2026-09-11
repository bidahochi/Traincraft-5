package train.common.library.track.placement;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import train.common.library.track.EnumTracks;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackPlacementType;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Server-side transaction for replacing host blocks during true-embedded, slab-mounted, or stair-mounted placement.
 * The first value captured for a coordinate is authoritative until the transaction commits or rolls back.
 */
public final class TrackHostPlacementTransaction
{
	private final boolean active;
	private final ITrackDefinition selectedTrack;
	private final TrackPlacementType placementType;
	private final LinkedHashMap<String, HostCapture> captures = new LinkedHashMap<String, HostCapture>();
	private final LinkedHashMap<String, List<TileTCRailHostData.CapturedHostShape>> validatedShapes =
			new LinkedHashMap<String, List<TileTCRailHostData.CapturedHostShape>>();
	private final LinkedHashMap<String, ParentCoordinate> parentCoordinates = new LinkedHashMap<String, ParentCoordinate>();
	private boolean completed;
	private boolean placementFailed;
	private boolean parentCoordinateAssigned;
	private int parentX;
	private int parentY;
	private int parentZ;
	private boolean surfaceHeightAssigned;
	private double surfaceHeight;

	/**
	 * Creates a transaction using only the placement behavior declared by the track definition.
	 *
	 * @param selectedTrack track definition being placed
	 */
	public TrackHostPlacementTransaction(ITrackDefinition selectedTrack)
	{
		this(selectedTrack, selectedTrack != null
				? selectedTrack.getPlacementType() : TrackPlacementType.SURFACE);
	}

	/**
	 * Creates a transaction with an explicitly supplied effective placement variant.
	 *
	 * @param selectedTrack resource and shape definition being placed
	 * @param placementType effective placement variant for this placement
	 */
	public TrackHostPlacementTransaction(ITrackDefinition selectedTrack, TrackPlacementType placementType)
	{
		this.selectedTrack = selectedTrack;
		this.placementType = placementType != null ? placementType : TrackPlacementType.SURFACE;
		this.active = selectedTrack != null && this.placementType.replacesTarget();
	}

	/**
	 * Returns the independently selected placement behavior used throughout this transaction.
	 *
	 * @return effective placement variant
	 */
	public TrackPlacementType getPlacementType()
	{
		return placementType;
	}

	/**
	 * Reports whether this transaction replaces and captures target blocks.
	 *
	 * @return whether host-replacing transaction behavior is active
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Locks the footprint to the first captured host height and validates subsequent cells. Host-mounted placement
	 * additionally requires every candidate to have the corresponding supported surface height and shape. Stair
	 * components are captured for both intact stair-mounted and true-embedded rendering.
	 *
	 * @param world world containing the candidate host
	 * @param x candidate world X coordinate
	 * @param y candidate world Y coordinate
	 * @param z candidate world Z coordinate
	 * @return {@code true} when capture is inactive or the candidate has the transaction's common surface height;
	 *         {@code false} for an invalid or completed active transaction
	 */
	public boolean acceptHostSurface(World world, int x, int y, int z)
	{
		Block block = world != null ? world.getBlock(x, y, z) : null;
		int metadata = world != null ? world.getBlockMetadata(x, y, z) : 0;
		if (active == false || completed || block == null)
		{
			return active == false;
		}
		if (placementType == TrackPlacementType.SLAB_MOUNTED
				&& (block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0) == false)
		{
			placementFailed = true;
			return false;
		}
		if (placementType == TrackPlacementType.STAIR_MOUNTED)
		{
			boolean solidTop = World.doesBlockHaveSolidTopSurface(world, x, y, z);
			if (solidTop == false || ((block instanceof BlockStairs) == false && block.isOpaqueCube() == false))
			{
				placementFailed = true;
				return false;
			}
		}
		if (block instanceof BlockStairs)
		{
			if (World.doesBlockHaveSolidTopSurface(world, x, y, z) == false)
			{
				placementFailed = true;
				return false;
			}
			List<TileTCRailHostData.CapturedHostShape> shapes = captureHostShapes(world, x, y, z, block);
			if (shapes.isEmpty())
			{
				placementFailed = true;
				return false;
			}
			validatedShapes.put(TileTCRailHostData.key(x, y, z), shapes);
		}
		double candidateHeight = block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0
				? TrackHostConstants.HALF_BLOCK_HEIGHT
				: TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
		if (surfaceHeightAssigned == false)
		{
			surfaceHeight = candidateHeight;
			surfaceHeightAssigned = true;
			return true;
		}
		if (Double.compare(surfaceHeight, candidateHeight) == 0)
		{
			return true;
		}
		placementFailed = true;
		return false;
	}

	/** Captures a non-cuboid block's resolved collision components before the rail replaces it. */
	private static List<TileTCRailHostData.CapturedHostShape> captureHostShapes(World world,
			int x, int y, int z, Block block)
	{
		List<AxisAlignedBB> collisionBoxes = new ArrayList<AxisAlignedBB>();
		AxisAlignedBB cellBounds = AxisAlignedBB.getBoundingBox(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D);
		block.addCollisionBoxesToList(world, x, y, z, cellBounds, collisionBoxes, (Entity)null);
		List<TileTCRailHostData.CapturedHostShape> shapes =
				new ArrayList<TileTCRailHostData.CapturedHostShape>(collisionBoxes.size());
		for (AxisAlignedBB box : collisionBoxes)
		{
			shapes.add(new TileTCRailHostData.CapturedHostShape(box.minX - x, box.minY - y, box.minZ - z,
					box.maxX - x, box.maxY - y, box.maxZ - z));
		}
		return shapes;
	}

	/**
	 * Records a unique placed parent rail coordinate for an active unfinished transaction and designates the first
	 * recorded coordinate as the authoritative owner of the captured host blocks.
	 *
	 * @param x parent world X coordinate
	 * @param y parent world Y coordinate
	 * @param z parent world Z coordinate
	 */
	public void recordParentCoordinate(int x, int y, int z)
	{
		if (active && completed == false)
		{
			String key = TileTCRailHostData.key(x, y, z);
			if (parentCoordinates.containsKey(key) == false)
			{
				parentCoordinates.put(key, new ParentCoordinate(x, y, z));
			}
			if (parentCoordinateAssigned == false)
			{
				parentX = x;
				parentY = y;
				parentZ = z;
				parentCoordinateAssigned = true;
			}
		}
	}

	/** Marks an active unfinished transaction as failed when a required rail footprint cell could not be placed. */
	public void recordPlacementFailure()
	{
		if (active && completed == false)
		{
			placementFailed = true;
		}
	}

	/**
	 * Records the first host block observed at a world coordinate.
	 *
	 * @param x host world X coordinate
	 * @param y host world Y coordinate
	 * @param z host world Z coordinate
	 * @param block captured host block
	 * @param metadata captured host metadata
	 */
	public void capture(int x, int y, int z, Block block, int metadata)
	{
		if (active == false || completed || block == null)
		{
			return;
		}
		String key = TileTCRailHostData.key(x, y, z);
		if (captures.containsKey(key) == false)
		{
			List<TileTCRailHostData.CapturedHostShape> shapes = validatedShapes.get(key);
			captures.put(key, new HostCapture(x, y, z, block, metadata,
					shapes != null ? shapes : java.util.Collections.<TileTCRailHostData.CapturedHostShape>emptyList()));
		}
	}

	/**
	 * Copies the originally captured host material at one replaced rail coordinate into that rail's dynamic ballast.
	 * This allows replacement placement to bind the slab or block that occupied the rail cell before mutation.
	 *
	 * @param rail placed parent rail receiving the dynamic ballast material
	 * @param x replaced rail-cell X coordinate
	 * @param y replaced rail-cell Y coordinate
	 * @param z replaced rail-cell Z coordinate
	 * @return whether a captured host was found and applied
	 */
	public boolean applyCapturedBallast(TileTCRail rail, int x, int y, int z)
	{
		if (rail == null || active == false || completed)
		{
			return false;
		}
		HostCapture capture = captures.get(TileTCRailHostData.key(x, y, z));
		if (capture == null)
		{
			return false;
		}
		rail.setBallastMaterial(Block.getIdFromBlock(capture.block));
		rail.ballastMetadata = capture.metadata;
		return true;
	}

	/**
	 * Completes an inactive placement immediately. For active replacement placement, validates and attaches every
	 * captured host block to the rail tile that owns the completed footprint, closing the transaction only on success;
	 * a failed commit remains available for rollback.
	 *
	 * @param world world containing the newly placed rail footprint
	 * @return whether every captured host was attached to the authoritative placed parent successfully; callers must
	 *         invoke {@link #rollback(World)} from their placement cleanup path after a failed commit
	 */
	public boolean commit(World world)
	{
		if (completed)
		{
			return false;
		}
		if (active == false)
		{
			completed = true;
			return true;
		}
		if (world == null || captures.isEmpty() || placementFailed || parentCoordinateAssigned == false)
		{
			return false;
		}

		TileTCRail parent = TrackCellResolver.resolveParent(world, parentX, parentY, parentZ);
		if (parent == null)
		{
			return false;
		}

		List<TileTCRailHostData.CapturedHostBlock> replacement =
				new ArrayList<TileTCRailHostData.CapturedHostBlock>(captures.size());
		for (HostCapture capture : captures.values())
		{
			int blockId = Block.getIdFromBlock(capture.block);
			if (blockId <= 0)
			{
				return false;
			}
			replacement.add(new TileTCRailHostData.CapturedHostBlock(
					capture.x - parent.xCoord, capture.y - parent.yCoord, capture.z - parent.zCoord,
					blockId, capture.metadata, TrackHostConstants.DEFAULT_HOST_TINT, capture.shapes));
		}
		TileTCRail renderSource = findRenderSource(world, parent);
		parent.replaceCapturedHostBlocks(replacement, renderSource.xCoord - parent.xCoord,
				renderSource.yCoord - parent.yCoord, renderSource.zCoord - parent.zCoord);
		normalizePlacedFootprintOwnership(world, parent);
		for (ParentCoordinate coordinate : parentCoordinates.values())
		{
			TileEntity placedTile = world.getTileEntity(coordinate.x, coordinate.y, coordinate.z);
			if (placedTile instanceof TileTCRail)
			{
				TileTCRail rail = (TileTCRail)placedTile;
				if (placementType == TrackPlacementType.SLAB_MOUNTED
						|| placementType == TrackPlacementType.STAIR_MOUNTED)
				{
					ITrackDefinition placedDefinition = getPlacedTrackDefinition(rail.getType(), placementType);
					if (placedDefinition == null)
					{
						return false;
					}
					rail.setType(placedDefinition.getLabel());
				}
			}
		}
		completed = true;
		captures.clear();
		validatedShapes.clear();
		parentCoordinates.clear();
		return true;
	}

	/**
	 * Connects every parent created by replacement placement to the tile that owns the captured host map. Gags retain
	 * their local model parent so attachment path sampling can distinguish separate straight and turn sections; that
	 * parent then resolves the shared captured-host owner through its normalized link.
	 *
	 * @param world world containing the completed placement
	 * @param owner authoritative parent holding the captured host map
	 */
	private void normalizePlacedFootprintOwnership(World world, TileTCRail owner)
	{
		for (ParentCoordinate coordinate : parentCoordinates.values())
		{
			TileEntity tile = world.getTileEntity(coordinate.x, coordinate.y, coordinate.z);
			if (tile instanceof TileTCRail && tile != owner)
			{
				TileTCRail rail = (TileTCRail)tile;
				rail.isLinkedToRail = true;
				rail.linkedX = owner.xCoord;
				rail.linkedY = owner.yCoord;
				rail.linkedZ = owner.zCoord;
				rail.markDirty();
				world.markBlockForUpdate(coordinate.x, coordinate.y, coordinate.z);
			}
		}
	}

	/**
	 * Resolves the registry label stored on a placed parent without changing its underlying shape or resource family.
	 *
	 * @param sourceLabel label produced by the ordinary placement routine
	 * @param placementType effective placement variant
	 * @return automatically injected host-mounted label, or the unchanged source label
	 */
	public static String getPlacedTrackLabel(String sourceLabel, TrackPlacementType placementType)
	{
		ITrackDefinition source = EnumTracks.GetTrackByLabel(sourceLabel);
		if (source != null && source.getPlacementType() == placementType)
		{
			return sourceLabel;
		}
		switch (placementType)
		{
			case REPLACE_TARGET:
				return "TRUE_" + sourceLabel;
			case SLAB_MOUNTED:
				return "SLAB_MOUNTED_" + sourceLabel;
			case STAIR_MOUNTED:
				return "STAIR_MOUNTED_" + sourceLabel;
			default:
				return sourceLabel;
		}
	}

	/**
	 * Resolves the definition stored on a placed parent for the effective host-mounted placement type.
	 *
	 * @param sourceLabel label produced by the placement routine
	 * @param placementType effective placement variant
	 * @return matching placed definition, or {@code null} when no compatible definition exists
	 */
	private static ITrackDefinition getPlacedTrackDefinition(String sourceLabel, TrackPlacementType placementType)
	{
		return EnumTracks.GetTrackByLabel(getPlacedTrackLabel(sourceLabel, placementType));
	}

	/**
	 * Finds the placed parent whose model represents the captured footprint.
	 *
	 * @param world world containing the placed parent candidates
	 * @param owner parent that owns the captured host data
	 * @return model-bearing render source, or {@code owner} when no separate source exists
	 */
	private TileTCRail findRenderSource(World world, TileTCRail owner)
	{
		for (ParentCoordinate coordinate : parentCoordinates.values())
		{
			TileEntity tile = world.getTileEntity(coordinate.x, coordinate.y, coordinate.z);
			if (tile instanceof TileTCRail)
			{
				TileTCRail candidate = (TileTCRail)tile;
				if (candidate.hasModel && isSelectedTrack(selectedTrack, candidate.getType()))
				{
					return candidate;
				}
			}
		}
		return owner;
	}

	/**
	 * Returns whether a placed handed label belongs to the selected track definition. Most handed labels place the
	 * direction inside the label, while crossover switches append it as a suffix.
	 *
	 * @param selectedTrack definition selected before placement
	 * @param candidateLabel label stored on a placed parent candidate
	 * @return whether the candidate is a handed form of the selected definition
	 */
	private static boolean isSelectedTrack(ITrackDefinition selectedTrack, String candidateLabel)
	{
		if (selectedTrack == null || candidateLabel == null)
		{
			return false;
		}
		String baseLabel = candidateLabel.replace("_LEFT_", "_").replace("_RIGHT_", "_");
		if (baseLabel.endsWith("_LEFT") || baseLabel.endsWith("_RIGHT"))
		{
			baseLabel = baseLabel.substring(0, baseLabel.lastIndexOf('_'));
		}
		return selectedTrack.getLabel().equals(baseLabel);
	}

	/**
	 * Restores every captured coordinate once and closes this transaction.
	 *
	 * @param world world receiving restored host blocks
	 */
	public void rollback(World world)
	{
		if (completed)
		{
			return;
		}
		if (active && world != null)
		{
			for (HostCapture capture : captures.values())
			{
				world.setBlock(capture.x, capture.y, capture.z, capture.block, capture.metadata,
						TrackHostConstants.NOTIFY_NEIGHBORS_AND_CLIENTS);
				world.func_147451_t(capture.x, capture.y, capture.z);
			}
		}
		completed = true;
		captures.clear();
		validatedShapes.clear();
		parentCoordinates.clear();
	}

	private static final class HostCapture
	{
		private final int x;
		private final int y;
		private final int z;
		private final Block block;
		private final int metadata;
		private final List<TileTCRailHostData.CapturedHostShape> shapes;

		/**
		 * Creates one immutable captured-host record.
		 *
		 * @param x world X coordinate
		 * @param y world Y coordinate
		 * @param z world Z coordinate
		 * @param block captured block
		 * @param metadata captured metadata
		 */
		private HostCapture(int x, int y, int z, Block block, int metadata,
				List<TileTCRailHostData.CapturedHostShape> shapes)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			this.block = block;
			this.metadata = metadata;
			this.shapes = shapes;
		}
	}

	private static final class ParentCoordinate
	{
		private final int x;
		private final int y;
		private final int z;

		/**
		 * Creates one parent-coordinate record.
		 *
		 * @param x world X coordinate
		 * @param y world Y coordinate
		 * @param z world Z coordinate
		 */
		private ParentCoordinate(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
}
