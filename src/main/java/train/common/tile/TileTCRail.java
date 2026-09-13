package train.common.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.apache.logging.log4j.Level;
import train.common.Traincraft;
import train.common.blocks.BlockSwitchStand;
import train.common.items.TCRailTypes;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.EnumTracks;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.TrackRenderBounds;
import train.common.library.track.TrackSlopeParameters;
import train.common.library.track.placement.TrackHostPlacementTransaction;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;

import java.util.Collections;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TileTCRail extends TileEntity implements ITileTCRail {

	private static final double EMBEDDED_HOST_SURFACE_INSET = 0.0625D;
	private static final String ATTACHMENT_OWNER_COORDINATES_TAG = "TrackAttachmentOwnerCoordinates";
	private static final int COORDINATE_COMPONENTS = 3;
	private static final int[] NO_ATTACHMENT_OWNER_COORDINATES = new int[0];
	public double r;
	public double cx;
	public double cy;
	public double cz;
	public double slopeHeight;
	public double slopeLength;
	public double slopeAngle;

	public int ballastMaterial;
	public int ballastMetadata;
	public int ballastColour;
	private String type;

	private ITrackDefinition trackType = null;
	private boolean trackTypeResolved = false;
	/*
	 * Optional true-embedded payload.
	 *
	 * Most rails are normal surface rails and do not need captured host blocks, restore guards, or render-cache
	 * versioning. Keep that state in a lazy child object so TileTCRail stays compatible with existing saves while
	 * avoiding a permanent host map allocation on every regular rail tile.
	 */
	private TileTCRailHostData trackHostData = null;
	private int trackHostRenderEventVersion;
	public int facingMeta;
	public boolean isLinkedToRail = false;
	public int linkedX;
	public int linkedY;
	public int linkedZ;
	public boolean hasModel = true;
	private boolean switchActive = false;
	/** stores the latest redstone state */
	public boolean previousRedstoneState;
	public boolean canTypeBeModifiedBySwitch = false;

	public Item	idDrop;
	public boolean hasRotated = false;
	private int isLeftFlag = -5;
	public Integer displayList = null;
	public int exitDirection = -1;
	private final LinkedList<TileTrainDetector> pairedDetectors;
	/** Extensible attachments installed on cells owned and rendered by this rail tile. */
	private final TileTCRailAttachmentData attachmentData = new TileTCRailAttachmentData(this);
	private boolean attachmentClusterRemovalStarted;
	private int[] attachmentOwnerCoordinates = NO_ATTACHMENT_OWNER_COORDINATES;
	private boolean bridgeSupport;

	public TileTCRail()
	{
		pairedDetectors = new LinkedList<>();
		if (this.worldObj != null)
		{
			facingMeta = this.getBlockMetadata();
		}
	}

	/**
	 * Returns the lazily allocated captured-host state for this parent rail.
	 *
	 * @return mutable captured-host state owned by this tile
	 */
	private TileTCRailHostData getOrCreateTrackHostData()
	{
		if (trackHostData == null)
		{
			trackHostData = new TileTCRailHostData(this);
		}
		return trackHostData;
	}

	/**
	 * Atomically replaces the captured-host map and records the tile that renders it.
	 *
	 * @param hostBlocks complete replacement host collection
	 * @param renderSourceOffsetX render-source X offset from this owner
	 * @param renderSourceOffsetY render-source Y offset from this owner
	 * @param renderSourceOffsetZ render-source Z offset from this owner
	 */
	public void replaceCapturedHostBlocks(Collection<TileTCRailHostData.CapturedHostBlock> hostBlocks,
			int renderSourceOffsetX, int renderSourceOffsetY, int renderSourceOffsetZ)
	{
		getOrCreateTrackHostData().replace(hostBlocks, renderSourceOffsetX, renderSourceOffsetY, renderSourceOffsetZ);
	}

	/**
	 * Returns the attachments owned by this rail's render tile.
	 *
	 * @return immutable live view of the attachments associated with this rail owner
	 */
	public List<TrackAttachment> getTrackAttachments()
	{
		return attachmentData.getAttachments();
	}

	/**
	 * Returns whether the candidate can be installed without conflicting with an existing attachment.
	 *
	 * @param attachment candidate attachment
	 * @return whether the candidate can be installed
	 */
	public boolean canAddAttachment(TrackAttachment attachment)
	{
		return attachmentData.canAdd(attachment);
	}

	/**
	 * Returns whether an installed attachment supplies the requested behavior.
	 *
	 * @param behavior attachment behavior mask
	 * @return whether the behavior is present
	 */
	public boolean hasAttachmentBehavior(int behavior)
	{
		return attachmentData.hasBehavior(behavior);
	}

	/**
	 * Adds an attachment and synchronizes the changed collection when no conflict exists.
	 *
	 * @param attachment attachment to install
	 * @return {@code true} when the attachment was added
	 */
	public boolean addAttachment(TrackAttachment attachment)
	{
		if (attachmentData.add(attachment) == false)
		{
			return false;
		}
		registerAttachmentOwner();
		return true;
	}

	/**
	 * Removes the attachment occupying one exact owner-relative mounting slot and synchronizes the changed collection.
	 *
	 * @param offsetX owner-relative track-cell X coordinate
	 * @param offsetY owner-relative track-cell Y coordinate
	 * @param offsetZ owner-relative track-cell Z coordinate
	 * @param slotId namespaced mounting slot to remove
	 * @return removed attachment, or {@code null} when the slot is empty
	 */
	public TrackAttachment removeAttachmentAtSlot(int offsetX, int offsetY, int offsetZ, String slotId)
	{
		return attachmentData.removeAtSlot(offsetX, offsetY, offsetZ, slotId);
	}

	/**
	 * Removes every attachment without synchronizing, for use while the owning rail is being destroyed.
	 *
	 * @return removed attachments in their stored order
	 */
	public List<TrackAttachment> removeAllAttachments()
	{
		return attachmentData.removeAll();
	}

	/**
	 * Marks the linked rail cluster as having begun its one destruction-time attachment drain.
	 *
	 * The marker is deliberately transient: the root tile is already being destroyed, and it only prevents recursive
	 * block-removal callbacks from repeatedly scanning the same loaded cluster.
	 *
	 * @return {@code true} for the first removal callback reaching this cluster
	 */
	public boolean beginAttachmentClusterRemoval()
	{
		if (attachmentClusterRemovalStarted)
		{
			return false;
		}
		attachmentClusterRemovalStarted = true;
		return true;
	}

	/** Records this attachment-owning model tile on its greatest parent for exact destruction-time lookup. */
	private void registerAttachmentOwner()
	{
		if (worldObj == null || worldObj.isRemote)
		{
			return;
		}
		TileTCRail root = TrackCellResolver.resolveParentForRemoval(worldObj, this);
		if (root == null)
		{
			return;
		}
		for (int index = 0; index + 2 < root.attachmentOwnerCoordinates.length;
				index += COORDINATE_COMPONENTS)
		{
			if (root.attachmentOwnerCoordinates[index] == xCoord
					&& root.attachmentOwnerCoordinates[index + 1] == yCoord
					&& root.attachmentOwnerCoordinates[index + 2] == zCoord)
			{
				return;
			}
		}
		int previousLength = root.attachmentOwnerCoordinates.length;
		int[] expanded = new int[previousLength + COORDINATE_COMPONENTS];
		System.arraycopy(root.attachmentOwnerCoordinates, 0, expanded, 0, previousLength);
		expanded[previousLength] = xCoord;
		expanded[previousLength + 1] = yCoord;
		expanded[previousLength + 2] = zCoord;
		root.attachmentOwnerCoordinates = expanded;
		root.markDirty();
	}

	/**
	 * Takes and clears the exact attachment-owner coordinates recorded by this compound-track root.
	 *
	 * Clearing before block replacement makes recursive removal callbacks unable to produce duplicate drops.
	 *
	 * @return flattened world-coordinate triples in X, Y, Z order
	 */
	public int[] takeAttachmentOwnerCoordinates()
	{
		int[] coordinates = attachmentOwnerCoordinates;
		attachmentOwnerCoordinates = NO_ATTACHMENT_OWNER_COORDINATES;
		return coordinates;
	}

	/** Replaces only client attachment state, leaving slope, linkage, and captured-host data untouched. */
	public void replaceAttachmentsFromNetwork(List<TrackAttachment> replacement)
	{
		attachmentData.replaceFromNetwork(replacement);
	}

	/**
	 * Returns captured hosts rebased to the tile that supplies their visible track shape.
	 *
	 * @return immutable render-relative host map, or an empty map for a non-rendering tile
	 */
	public Map<String, TileTCRailHostData.CapturedHostBlock> getTrackHostRenderBlocks()
	{
		if (trackHostData != null)
		{
			Map<String, TileTCRailHostData.CapturedHostBlock> local = trackHostData.getRenderBlocks(this);
			if (local.isEmpty() == false)
			{
				return local;
			}
		}
		TileTCRail parent = resolveCapturedHostOwner();
		return parent != null && parent != this && parent.trackHostData != null
				? parent.trackHostData.getRenderBlocks(this)
				: Collections.<String, TileTCRailHostData.CapturedHostBlock>emptyMap();
	}

	/**
	 * Returns the captured host stored at an absolute world coordinate.
	 *
	 * @param worldX host X coordinate
	 * @param worldY host Y coordinate
	 * @param worldZ host Z coordinate
	 * @return captured host entry, or {@code null} when the coordinate is outside the footprint
	 */
	public TileTCRailHostData.CapturedHostBlock getCapturedHostBlockAtWorld(int worldX, int worldY, int worldZ)
	{
		if (trackHostData != null)
		{
			TileTCRailHostData.CapturedHostBlock hostBlock = trackHostData.getAtLocalOffset(worldX - xCoord, worldY - yCoord, worldZ - zCoord);
			if (hostBlock != null)
			{
				return hostBlock;
			}
		}

		TileTCRail parent = resolveCapturedHostOwner();
		return parent != null && parent != this && parent.trackHostData != null
				? parent.trackHostData.getAtLocalOffset(worldX - parent.xCoord, worldY - parent.yCoord, worldZ - parent.zCoord)
				: null;
	}

	/**
	 * Returns whether this tile directly owns captured host blocks.
	 *
	 * @return whether the local captured-host map is nonempty
	 */
	public boolean hasCapturedHostBlocks()
	{
		return trackHostData != null && trackHostData.hasBlocks();
	}

	/**
	 * Returns the captured cells owned directly by this tile in owner-relative coordinates.
	 *
	 * Destruction uses the complete footprint to drain attachment-owning rail tiles before restoration replaces them.
	 * Render callers should continue using {@link #getTrackHostRenderBlocks()}, which rebases cells to the model tile.
	 *
	 * @return immutable captured footprint, or an empty collection when this tile owns no captured hosts
	 */
	public Collection<TileTCRailHostData.CapturedHostBlock> getOwnedCapturedHostBlocks()
	{
		return trackHostData != null ? trackHostData.getBlocks()
				: Collections.<TileTCRailHostData.CapturedHostBlock>emptyList();
	}

	/**
	 * Returns the render-cache version of the captured or synthetic host surface shown by this tile.
	 *
	 * @return stored-host version for captured terrain or transient neighbor-event version for synthetic terrain
	 */
	public int getTrackHostRenderVersion()
	{
		if (trackHostData != null && trackHostData.getRenderBlocks(this).isEmpty() == false)
		{
			return trackHostData.getRenderVersion();
		}
		TileTCRail parent = resolveCapturedHostOwner();
		return parent != null && parent != this && parent.trackHostData != null
				&& parent.trackHostData.getRenderBlocks(this).isEmpty() == false
				? parent.trackHostData.getRenderVersion()
				: trackHostRenderEventVersion;
	}

	/**
	 * Returns whether this rail owns renderer-generated terrain that must react to neighboring block and lighting events.
	 * Captured embedded footprints and regular generated half-height ballast both use this path; ordinary OBJ-only rails
	 * do not.
	 *
	 * @return whether neighbor callbacks must invalidate this rail's host-surface renderer
	 */
	public boolean usesDynamicHostSurfaceRendering()
	{
		return hasCapturedHostBlocks() || isReplaceTargetTrack() == false && isIntactHostMountedTrack() == false
				&& getCoreType() != null && getCoreType().isHalfHeightSlope();
	}

	/**
	 * Returns whether this tile or its authoritative parent owns captured host blocks.
	 *
	 * @return whether the rail belongs to a true-embedded replacement footprint
	 */
	private boolean isTrueEmbeddedTrack()
	{
		TileTCRail owner = resolveCapturedHostOwner();
		return owner != null && owner.hasCapturedHostBlocks();
	}

	/**
	 * Returns the captured footprint's common surface height.
	 *
	 * @return one-half block for bottom slabs, or one block for full and top-slab hosts
	 */
	private double getTrackHostSurfaceHeight()
	{
		if (trackHostData != null && trackHostData.hasBlocks())
		{
			return trackHostData.getSurfaceHeight();
		}
		TileTCRail owner = resolveCapturedHostOwner();
		return owner != null && owner != this && owner.trackHostData != null
				? owner.trackHostData.getSurfaceHeight()
				: TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT;
	}

	/** Returns this tile or its greatest parent when that rail owns captured host blocks. */
	private TileTCRail resolveCapturedHostOwner()
	{
		return hasCapturedHostBlocks() || worldObj == null
				? this : TrackCellResolver.resolveGreatestParent(worldObj, this);
	}

	/**
	 * Invalidates this tile's captured or synthetic host-surface cache after a neighboring block changes. The transient
	 * event version covers generated ballast without creating persistent embedded-host data.
	 */
	public void markTrackHostRenderDirty()
	{
		if (trackHostData != null)
		{
			trackHostData.markDirty();
		}
		else
		{
			trackHostRenderEventVersion++;
			if (worldObj != null)
			{
				worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
			}
		}
	}

	/**
	 * Restores this tile's captured host blocks into the world.
	 *
	 * @param world server world receiving the restored hosts
	 */
	public void restoreCapturedHostBlocks(World world)
	{
		if (trackHostData != null)
		{
			trackHostData.restore(world);
		}
	}

	/**
	 * Returns whether any embedded footprint is currently restoring captured hosts.
	 *
	 * @return global captured-host restoration guard
	 */
	public static boolean isRestoringCapturedHostBlocksGlobally()
	{
		return TileTCRailHostData.isRestoringGlobally();
	}

	/**
	 * Returns whether this rail definition replaces its selected support block.
	 *
	 * @return whether the rail uses replacement placement
	 */
	public boolean isReplaceTargetTrack()
	{
		ITrackDefinition track = getTrackType();
		if (track == null && getType() != null)
		{
			track = EnumTracks.GetTrackByLabel(getType());
		}
		return track != null && track.getPlacementType().replacesTarget();
	}

	/**
	 * Returns the rail-supporting surface height within this tile's block coordinate.
	 *
	 * @return zero for surface rails, one-half for bottom-slab embedding, or one for full/top hosts
	 */
	public double getTrackSurfaceYOffset()
	{
		if (isTrueEmbeddedTrack())
		{
			return getTrackHostSurfaceHeight();
		}
		TileTCRail parent = worldObj != null ? getGreatestParent(worldObj) : this;
		return parent != null && parent != this && parent.isReplaceTargetTrack()
				? parent.getTrackHostSurfaceHeight() : isReplaceTargetTrack()
				? TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT : 0.0D;
	}

	/**
	 * Returns the absolute world Y coordinate of the rail-supporting surface.
	 *
	 * @return world-space surface Y coordinate
	 */
	public double getTrackSurfaceY()
	{
		return yCoord + getTrackSurfaceYOffset();
	}

	/**
	 * Returns the model translation relative to the tile's block coordinate.
	 *
	 * @return local model Y translation, including the embedded inset when applicable
	 */
	public double getTrackRenderYOffset()
	{
		double surfaceOffset = getTrackSurfaceYOffset();
		if (isIntactHostMountedTrack())
		{
			return surfaceOffset;
		}
		return isTrueEmbeddedTrack() || isReplaceTargetTrack()
				? surfaceOffset - TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET : surfaceOffset;
	}

	/**
	 * Returns whether this definition uses intact captured slabs beneath normally raised track geometry.
	 *
	 * @return whether the definition uses slab-mounted placement
	 */
	public boolean isSlabMountedTrack()
	{
		ITrackDefinition track = getTrackType();
		return track != null && track.getPlacementType() == TrackPlacementType.SLAB_MOUNTED;
	}

	/** Returns whether this definition preserves and reconstructs a captured stair host. */
	public boolean isStairMountedTrack()
	{
		ITrackDefinition track = getTrackType();
		return track != null && track.getPlacementType() == TrackPlacementType.STAIR_MOUNTED;
	}

	/** Returns whether this definition mounts normal track geometry over an intact captured host shape. */
	public boolean isIntactHostMountedTrack()
	{
		return isSlabMountedTrack() || isStairMountedTrack();
	}

	/**
	 * Returns the captured host's slightly inset rendered top height.
	 *
	 * @return local host-surface render height
	 */
	public double getTrackHostSurfaceRenderYOffset()
	{
		double surfaceOffset = getTrackSurfaceYOffset();
		return isTrueEmbeddedTrack() || isReplaceTargetTrack()
				? surfaceOffset - EMBEDDED_HOST_SURFACE_INSET : surfaceOffset;
	}

	/**
	 * Returns the vertical offset used by rolling-stock ride calculations.
	 *
	 * @return local ride height matching the rendered rail model
	 */
	public double getTrackRideYOffset()
	{
		return getTrackRenderYOffset();
	}

	public int getFacing() {

		return facingMeta;
	}

	public void setFacing(int facing) {

		this.facingMeta = facing;
	}

	/**
	 * Sets the serialized track label and invalidates cached definition data.
	 *
	 * @param type registered track label
	 */
	public void setType(String type) {
		if (worldObj != null)
		{
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}
		this.type = type;
		clearTrackTypeCache();
	}

	/** Clears the cached registry definition after the stored label changes. */
	private void clearTrackTypeCache()
	{
		this.trackType = null;
		this.trackTypeResolved = false;
	}

	public String getType() {

		return this.type;
	}

	/**
	 * Returns the geometry core for this tile's resolved track definition.
	 *
	 * @return geometry core, or {@link EnumCoreTrack#NONE} when the definition cannot be resolved
	 */
	public EnumCoreTrack getCoreType()
	{
		ITrackDefinition track = getTrackType();
		return track != null ? track.getCoreTrack() : EnumCoreTrack.NONE;
	}

	/**
	 * Returns the logical rail type for this tile's resolved definition.
	 *
	 * @return logical rail type, or {@code null} when the definition cannot be resolved
	 */
	public TCRailTypes.RailTypes getRailType()
	{
		ITrackDefinition track = getTrackType();
		return track != null ? track.getRailType() : null;
	}

	/**
	 * Returns the legacy diagonal-straight path length for the three extended diagonal cores, or one block for every
	 * other core.
	 *
	 * @return rail length in blocks
	 */
	public double getRailLength()
	{
		switch (getCoreType())
		{
			case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
				return 12;
			case CORE_LONG_DIAGONAL_STRAIGHT:
				return 6;
			case CORE_MEDIUM_DIAGONAL_STRAIGHT:
				return 3;
			default:
				return 1;
		}
	}

	/**
	 * Sets the dynamic ballast block identifier.
	 *
	 * @param ballast block identifier used for dynamic ballast rendering
	 */
	public void setBallastMaterial(int  ballast) {
		if (worldObj != null)
		{
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}
		this.ballastMaterial = ballast;
	}

	public int getBallastMaterial()
	{
		if (ballastMaterial != 0){

			return ballastMaterial;
		}
		else {
			return (0);
		}
	}

	/**
	 * Returns whether this placed slope uses its authored wooden bridge supports.
	 *
	 * @return whether bridge-support rendering is selected
	 */
	public boolean hasBridgeSupport()
	{
		return bridgeSupport;
	}

	/**
	 * Selects or clears the authored wooden supports when the current definition supports them.
	 *
	 * @param selected whether wooden bridge supports were selected
	 */
	public void setBridgeSupport(boolean selected)
	{
		boolean supportedSelection = selected && getTrackType() != null
				&& getTrackType().supportsBridgeSupport();
		if (bridgeSupport == supportedSelection)
		{
			return;
		}
		bridgeSupport = supportedSelection;
		markDirty();
		if (worldObj != null)
		{
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}
	}

	/**
	 * Returns whether a player may alter this track's selectable appearance state.
	 *
	 * @param player player attempting the change
	 * @return whether the player owns the track, has creative privileges, or the track has no assigned owner
	 */
	public boolean canUpdateDynamicMaterial(EntityPlayer player)
	{
		return player != null && (player.capabilities.isCreativeMode
				|| ownerUUID == null || "Villager Joe".equals(ownerUUID)
				|| player.getUniqueID().toString().equals(ownerUUID));
	}

	/**
	 * Resolves and caches the registered track definition represented by this tile.
	 *
	 * @return resolved track definition, or {@code null} when this tile has no resolvable track definition
	 */
	public ITrackDefinition getTrackType()
	{
		if (getType() == null)
		{
			return null;
		}

		if (trackTypeResolved == false)
		{
			trackType = EnumTracks.GetTrackByLabel(getType());
			trackTypeResolved = true;
		}
		return trackType;
	}

	/**
	 * Resolves the current definition by label for diagnostic callers.
	 *
	 * @return resolved track definition, or {@code null} when this tile has no resolvable track definition
	 */
	public ITrackDefinition getTrackTypeByLabel()
	{
		return getTrackType();
	}

	public boolean getSwitchState() {

		return switchActive;
	}

	@Override
	public boolean canUpdate()
	{
		return false;
	}

	/**
	 * Returns the legacy switch-size category for a rail tile.
	 *
	 * @param tileTCRail rail tile to classify
	 * @return legacy switch-size category
	 */
	public int GetSwitchSize(TileTCRail tileTCRail)
	{
		ITrackDefinition track = tileTCRail.getTrackType();
		return track != null ? EnumTracks.GetSwitchSize(track.getCoreTrack()) : 0;
	}

	/**
	 * Updates the switch direction. The manual-override argument is retained for call compatibility and is currently
	 * ignored.
	 *
	 * @param state requested switch direction
	 * @param manualOverride retained compatibility argument; currently ignored
	 */
	public void setSwitchState(boolean state, boolean manualOverride) {
		this.switchActive = state;
		this.markDirty();
		if (this.worldObj != null)
		{
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}
	}

	/**
	 * Returns a client render box large enough for this track's complete model footprint.
	 *
	 * @return world-space render bounding box
	 */
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox()
	{
		ITrackDefinition track = getTrackType();
		if ((hasModel == false && attachmentData.isEmpty()) || track == null)
		{
			return super.getRenderBoundingBox();
		}
		AxisAlignedBB railBounds = TrackCellResolver.isTraincraftRailBlock(getBlockType())
				? TrackRenderBounds.calculate(this, track) : INFINITE_EXTENT_AABB;
		return TrackAttachmentOperations.includeAttachmentRenderBounds(this, railBounds);
	}

	private String ownerUUID = "Villager Joe";

	public String getOwnerUUID()
	{
		return ownerUUID;
	}

	public void setOwnerUUID(String ownerUUID)
	{
		this.ownerUUID = ownerUUID;
	}

	/**
	 * Loads persisted rail state, normalizes canonical slope parameters, and invalidates transient generated-host
	 * rendering after a client tile-update packet.
	 *
	 * @param nbt compound containing the saved tile data
	 */
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		attachmentData.readFromNBT(nbt);
		int[] persistedAttachmentOwners = nbt.getIntArray(ATTACHMENT_OWNER_COORDINATES_TAG);
		attachmentOwnerCoordinates = persistedAttachmentOwners.length % COORDINATE_COMPONENTS == 0
				? persistedAttachmentOwners : NO_ATTACHMENT_OWNER_COORDINATES;
		ownerUUID = nbt.hasKey("ownerUUID") ? nbt.getString("ownerUUID") : "Villager Joe";
		facingMeta = nbt.getByte("Orientation");
		r = nbt.getDouble("r");
		cx = nbt.getDouble("cx");
		cy = nbt.getDouble("cy");
		cz = nbt.getDouble("cz");

		slopeHeight = nbt.getDouble("slopeHeight");
		slopeLength = nbt.getDouble("slopeLength");
		slopeAngle = nbt.getDouble("slopeAngle");
		linkedX = nbt.getInteger("linkedX");
		linkedY = nbt.getInteger("linkedY");
		linkedZ = nbt.getInteger("linkedZ");
		ballastMetadata = nbt.getInteger("ballastMetadata");
		ballastColour = nbt.getInteger("ballastColour");
		bridgeSupport = nbt.getBoolean("bridgeSupport");
		if(nbt.hasKey("ballastMaterial")) {
			ballastMaterial = nbt.getInteger("ballastMaterial");
		} else {
			ballastMaterial=0;
		}
		NBTTagList trackHostTagList = nbt.getTagList("CapturedHostBlocks", Constants.NBT.TAG_COMPOUND);
		if (trackHostTagList.tagCount() > 0)
		{
			getOrCreateTrackHostData().readFromNBT(nbt);
		}
		else
		{
			trackHostData = null;
		}

		String tempType = nbt.getString("type");
		if (tempType != null) {
			type = tempType;
		} else {
			type = EnumTracks.SMALL_STRAIGHT.getLabel();
		}
		clearTrackTypeCache();
		ITrackDefinition track = EnumTracks.GetTrackByLabel(type);
		if(track != null && type.contains("SLOPE"))
		{
			TrackSlopeParameters slope = TrackSlopeParameters.normalize(
					track, slopeHeight, slopeLength, slopeAngle);
			slopeHeight = slope.getHeight();
			slopeLength = slope.getLength();
			slopeAngle = slope.getAngle();
		}
		isLinkedToRail = nbt.getBoolean("isLinkedToRail");
		hasModel = nbt.getBoolean("hasModel");
		switchActive = nbt.getBoolean("switchActive");
		canTypeBeModifiedBySwitch = nbt.getBoolean("canTypeBeModifiedBySwitch");
		idDrop = Item.getItemById(nbt.getInteger("idDrop"));
		hasRotated = nbt.getBoolean("hasRotated");
		previousRedstoneState = nbt.getBoolean("previousRedstoneState");
		if (!nbt.hasKey("exitDirection")) {
			exitDirection = -1;
		}
		exitDirection = nbt.getInteger("exitDirection");
		// Get paired train detectors.
		NBTTagList tagList = nbt.getTagList("PairedDetectors", Constants.NBT.TAG_COMPOUND);
		if (tagList != null && worldObj != null) {
			for (int i = 0; i < tagList.tagCount(); i++) {
				NBTTagCompound tagCompound = tagList.getCompoundTagAt(i);
				int[] coordinateArray = tagCompound.getIntArray("Coordinates");
				TileEntity te = worldObj.getTileEntity(coordinateArray[0], coordinateArray[1], coordinateArray[2]);
				if (te instanceof TileTrainDetector) {
					pairedDetectors.add(((TileTrainDetector) te));
				}
			}
		}
		super.readFromNBT(nbt);
		if (trackHostData == null && usesDynamicHostSurfaceRendering())
		{
			trackHostRenderEventVersion++;
		}
	}

	/**
	 * Writes rail state and captured embedded hosts to persistent NBT.
	 *
	 * @param nbt destination compound
	 */
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		attachmentData.writeToNBT(nbt);
		if (attachmentOwnerCoordinates.length > 0)
		{
			nbt.setIntArray(ATTACHMENT_OWNER_COORDINATES_TAG, attachmentOwnerCoordinates);
		}
		nbt.setString("ownerUUID", ownerUUID);
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setDouble("r", r);
		nbt.setDouble("cx", cx);
		nbt.setDouble("cy", cy);
		nbt.setDouble("cz", cz);
		nbt.setDouble("slopeHeight", slopeHeight);
		nbt.setDouble("slopeLength", slopeLength);
		nbt.setDouble("slopeAngle", slopeAngle);
		nbt.setInteger("linkedX", linkedX);
		nbt.setInteger("linkedY", linkedY);
		nbt.setInteger("linkedZ", linkedZ);
		nbt.setInteger("ballastMetadata", ballastMetadata);
		nbt.setInteger("ballastColour", ballastColour);
		nbt.setBoolean("bridgeSupport", bridgeSupport);
		if (type != null)
		{
			nbt.setString("type", type);
		}
		if (ballastMaterial  != 0)
		{
			nbt.setInteger("ballastMaterial", ballastMaterial);
		}
		if (trackHostData != null)
		{
			trackHostData.writeToNBT(nbt);
		}

		nbt.setBoolean("isLinkedToRail", isLinkedToRail);
		nbt.setBoolean("hasModel", hasModel);
		nbt.setBoolean("switchActive", switchActive);
		nbt.setBoolean("canTypeBeModifiedBySwitch", canTypeBeModifiedBySwitch);
		nbt.setBoolean("hasRotated", hasRotated);
		nbt.setInteger("idDrop", Item.getIdFromItem(idDrop));
		nbt.setBoolean("previousRedstoneState", previousRedstoneState);
		nbt.setInteger("exitDirection", exitDirection);
		// Write saved train detectors to NBT.
		NBTTagList tagList = new NBTTagList();
		NBTTagCompound tagCompound;
		for (TileTrainDetector pairedDetector : pairedDetectors) {
			tagCompound = new NBTTagCompound();
			tagCompound.setIntArray("Coordinates", new int[]{pairedDetector.xCoord, pairedDetector.yCoord, pairedDetector.zCoord});
			tagList.appendTag(tagCompound);
		}
		nbt.setTag("PairedDetectors", tagList);
		super.writeToNBT(nbt);
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.func_148857_g());
		super.onDataPacket(net, pkt);
	}

	public void changeSwitchState(World world, TileTCRail tileEntity, int x, int y, int z)
	{
		if (tileEntity.getType() != null && (tileEntity.getType().contains("SWITCH")))
		{
			boolean newSwitchState;
			boolean receivingPower = tileEntity.isSlabMountedTrack()
					? isReceivingSwitchPower()
					: checkNonSwitchPieceForRedstonePower()
							|| worldObj.isBlockIndirectlyGettingPowered(x, y, z);
			if (receivingPower)
			{
				newSwitchState = true;
			}
			else
			{
				newSwitchState = false;
			}

			tileEntity.setSwitchState(newSwitchState,false);
			TileEntity te1;
			int a = 0;
			int b = 0;
			int c = 0;
			switch (tileEntity.getBlockMetadata()) {
				case 0:
					c = 1;
					break;
				case 1:
					a = -1;
					break;
				case 2:
					c = -1;
					break;
				case 3:
					a = 1;
					break;
				default:
					Traincraft.tcLog.log(Level.WARN, "Unsupported block meta for switch state.");
					return;
			}
			int offsetX = a;
			int offsetY = b;
			int offsetZ = c;

			int switchSize = GetSwitchSize(tileEntity);

			while (Math.abs(offsetX) < switchSize && Math.abs(offsetY) < switchSize && Math.abs(offsetZ) < switchSize)
			{
				te1 = world.getTileEntity(x + offsetX, y + offsetY, z + offsetZ);
				if (te1 instanceof TileTCRail)
				{
					TileTCRail routeRail = (TileTCRail)te1;
					if (newSwitchState)
					{
						if (tileEntity.getType().contains("SWITCH") && tileEntity.getType().contains("LEFT"))
						{
							setSwitchRouteType(routeRail, "MEDIUM_LEFT_TURN");
							routeRail.switchActive = true;
						}
						else if (tileEntity.getType().contains("SWITCH") && tileEntity.getType().contains("RIGHT"))
						{
							setSwitchRouteType(routeRail, "MEDIUM_RIGHT_TURN");
							routeRail.switchActive = true;
						}
					}
					else
					{
						setSwitchRouteType(routeRail, EnumTracks.SMALL_STRAIGHT.getLabel());
						routeRail.switchActive = false;
					}
				}
				offsetX += a;
				offsetY += b;
				offsetZ += c;
			}
		}
		else if (canTypeBeModifiedBySwitch)
		{
			UpdateLeftFlag();
		}
	}

	private static void setSwitchRouteType(TileTCRail routeRail, String surfaceLabel)
	{
		ITrackDefinition currentRoute = routeRail.getTrackType();
		TrackPlacementType placementType = currentRoute != null
				? currentRoute.getPlacementType() : TrackPlacementType.SURFACE;
		String placedLabel = TrackHostPlacementTransaction.getPlacedTrackLabel(
				surfaceLabel, placementType);
		routeRail.setType(placedLabel);
	}

	/**
	 * Returns whether this switch rail receives power directly or through its adjacent control cell.
	 *
	 * @return whether the switch should use its powered route
	 */
	public boolean isReceivingSwitchPower()
	{
		return checkNonSwitchPieceForRedstonePower()
				|| isTrackControlCellPowered(xCoord, yCoord, zCoord);
	}

	private boolean isTrackControlCellPowered(int controlX, int controlY, int controlZ)
	{
		if (worldObj.isBlockIndirectlyGettingPowered(controlX, controlY, controlZ))
		{
			return true;
		}
		return isSlabMountedTrack()
				&& BlockSwitchStand.hasPoweredLoweredStandNear(worldObj, controlX, controlY, controlZ);
	}

	private boolean checkNonSwitchPieceForRedstonePower()
	{
		int meta = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		switch (meta) {

			case 0: {
				return isTrackControlCellPowered(xCoord, yCoord, zCoord + 1);
			}
			case 1: {
				return isTrackControlCellPowered(xCoord - 1, yCoord, zCoord);
			}
			case 2: {
				return isTrackControlCellPowered(xCoord, yCoord, zCoord - 1);
			}
			case 3: {
				return isTrackControlCellPowered(xCoord + 1, yCoord, zCoord);
			}
		}

		return false;
	}

	/** Updates the legacy handedness flag from the current track definition. */
	private void UpdateLeftFlag()
	{
			TileEntity tile1 = null;
			int xCordInvertedDirection = xCoord;
			int yCordInvertedDirection = yCoord;
			int zCordInvertedDirection = zCoord;
			int meta = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
			switch (meta) {

				case 0: {
					tile1 = worldObj.getTileEntity(xCoord, yCoord, zCoord - 1);
					zCordInvertedDirection += 1;
					break;
				}
				case 1: {
					tile1 = worldObj.getTileEntity(xCoord + 1, yCoord, zCoord);
					xCordInvertedDirection -=1;
					break;
				}
				case 2: {
					tile1 = worldObj.getTileEntity(xCoord, yCoord, zCoord + 1);
					zCordInvertedDirection -= 1;
					break;
				}
				case 3: {
					tile1 = worldObj.getTileEntity(xCoord - 1, yCoord, zCoord);
					xCordInvertedDirection +=1;
					break;
				}
			}
			if (tile1 instanceof TileTCRail && TCRailTypes.isSwitchTrack((TileTCRail) tile1)) {

				TileTCRail tileSwitch = (TileTCRail) tile1;
				boolean controlRailPowered = isSlabMountedTrack()
						? isReceivingSwitchPower()
						: worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord);
				boolean switchRailPowered = tileSwitch.isSlabMountedTrack()
						? tileSwitch.isReceivingSwitchPower()
						: worldObj.isBlockIndirectlyGettingPowered(tile1.xCoord, tile1.yCoord, tile1.zCoord);
				if (tileSwitch.switchActive)
				{
					if (controlRailPowered == switchRailPowered)
					{
						tileSwitch.changeSwitchState(worldObj, tileSwitch, tile1.xCoord, tile1.yCoord, tile1.zCoord);
					}
				}
				else if (tileSwitch.switchActive != controlRailPowered)
				{
					tileSwitch.changeSwitchState(worldObj, tileSwitch, tile1.xCoord, tile1.yCoord, tile1.zCoord);
				}
			}

		if (!getSwitchState())
		{

			/* Right-handed switch types create a value of 1, left-handed switch types a value of type -1. If neither cases match, value is set to 0. */
			if (isLeftFlag == -5) {
				if (type != null && type.contains("SWITCH") && type.contains("RIGHT")) {
					isLeftFlag = 1;
				} else if (type != null && type.contains("SWITCH") && type.contains("LEFT")) {
					isLeftFlag = -1;
				} else {
					isLeftFlag = 0;
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 24567.0D;
	}//originally was 16384

    public LinkedList<TileTrainDetector> getPairedDetectors() {
        return pairedDetectors;
    }

	/**
	 * <p>A recursive method to find the parent of a tile.</p>
	 * <p>Some track pieces, like the 1x12 straight actually make use of three 1x3 straights, so the result will be
	 * one main TileTCRail tile, two "auxiliary" TileTCRail tiles, and nine TileTCRailGag tiles. This method can locate
	 * the parent TileTCRail from one of the auxiliary TileTCRails as part of the track.</p>
	 * @author 02skaplan
	 * @author broscolotos
	 * @return The tile itself, or the tile to which it is linked.
	 */
	public TileTCRail getGreatestParent(World worldObj) {
		return TrackCellResolver.resolveGreatestParent(worldObj, this);
	}
}
