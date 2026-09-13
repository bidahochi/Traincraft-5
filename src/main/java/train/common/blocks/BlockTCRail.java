package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.core.ActionBarMessenger;
import train.common.items.ItemWrench;
import train.common.items.TCRailTypes;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.track.EnumTracks;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.TrackItemIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.tile.TileTrainDetector;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;
import train.common.track.attachment.ITrackAttachmentItem;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BlockTCRail extends Block {
	private IIcon texture;

	/** Creates the parent rail block with its legacy material and render properties. */
	public BlockTCRail() {
		super(Material.anvil);
		setCreativeTab(Traincraft.tcTab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, 1.0F);
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return false;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player)
	{
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(x, y, z);
		if (tileEntity != null && tileEntity.idDrop != null)
		{
			texture = tileEntity.idDrop.getIconFromDamage(0);
			return new ItemStack(tileEntity.idDrop);
		}
		return null;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}
	private static final int[] matrixXZ = {0,-1,-2,1,2}, matrixY = {0,-1,-2,1,2};

	/**
	 * Breaks a parent rail, restores captured hosts, and removes linked footprint cells.
	 *
	 * @param world world containing the rail
	 * @param railX rail X coordinate
	 * @param railY rail Y coordinate
	 * @param railZ rail Z coordinate
	 * @param removedBlock block being removed
	 * @param removedMetadata removed block metadata
	 */
	@Override
	public void breakBlock(World world, int railX, int railY, int railZ, Block removedBlock, int removedMetadata) {
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(railX, railY, railZ);
		TileTCRail removalOwner = tileEntity != null
				? TrackCellResolver.resolveParentForRemoval(world, tileEntity) : null;
		dropCapturedHostContents(world, railX, railY, railZ, removalOwner);
		dropLinkedClusterAttachments(world, removalOwner);
		dropAttachments(world, tileEntity);
		/*
		 * Restoring captured host blocks replaces every rail and gag in the
		 * footprint. Those replacements still invoke breakBlock. They must not
		 * run the normal linked-track cascade, otherwise a later callback can
		 * destroy a host cell that was restored earlier in the same pass.
		 */
		if (TileTCRail.isRestoringCapturedHostBlocksGlobally()) {
			dropStoredRailItems(world, railX, railY, railZ, tileEntity);
			world.removeTileEntity(railX, railY, railZ);
			return;
		}
		if (tileEntity != null) {
			restoreCapturedHostBlocksFromLinkedCluster(world, tileEntity);
		}

		// Check if track is paired to any detectors. If so, unpair it before breaking.
		if (tileEntity != null && !tileEntity.getPairedDetectors().isEmpty())
		{
			EntityPlayer player = world.getClosestPlayer(
					railX + 0.5D,
					railY + 0.5D,
					railZ + 0.5D,
					45.0D // search radius
			);

			if (player != null)
			{
				String detectorCords = "";
				for (TileTrainDetector trainDetector : tileEntity.getPairedDetectors())
				{
					detectorCords += "X:" + trainDetector.xCoord + " Y:" + trainDetector.yCoord + " Z:" +trainDetector.zCoord + ", ";
				}
				detectorCords = detectorCords.substring(0, detectorCords.length() - 2);

				player.addChatMessage(new ChatComponentText("Track was unpaired from " +  detectorCords));
			}

			for (TileTrainDetector trainDetector : tileEntity.getPairedDetectors())
			{
				trainDetector.getPairedTrack().remove(tileEntity);
			}

			tileEntity.getPairedDetectors().clear();
		}

		if (tileEntity != null && tileEntity.isLinkedToRail) {
			Block linkedBlock = world.getBlock(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
			if (isRailOrGag(linkedBlock)) {
				// NOTE: func_147480_a = destroyBlock
				world.func_147480_a(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ, false);
				world.removeTileEntity(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ);
			}
		}

		dropStoredRailItems(world, railX, railY, railZ, tileEntity);

		for(int x : matrixXZ){
			for(int z : matrixXZ){
				for(int y : matrixY){
					if (tileEntity != null && world.getBlock(x + tileEntity.xCoord, y + tileEntity.yCoord, z + tileEntity.zCoord)instanceof BlockTCRailGag){
						world.notifyBlockChange((x +  tileEntity.xCoord), (y + tileEntity.yCoord + 1), (z  + tileEntity.zCoord), Blocks.air);
						world.markBlockForUpdate((x + tileEntity.xCoord), (y + tileEntity.yCoord + 1), (z + tileEntity.zCoord));
					}
					if (tileEntity != null && world.getBlock(x + tileEntity.xCoord, y + tileEntity.yCoord, z + tileEntity.zCoord)instanceof BlockTCRail){
						world.notifyBlockChange((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1), (z  + tileEntity.zCoord), Blocks.air);
						world.markBlockForUpdate((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1 ), (z  + tileEntity.zCoord));
					}
				}
			}
		}

		if (isRailOrGag(world.getBlock(railX, railY, railZ))) {
			world.removeTileEntity(railX, railY, railZ);
		}
	}

	/**
	 * Restores the captured hosts owned by a rail's linked parent cluster.
	 *
	 * @param world server world receiving restored blocks
	 * @param rail removed rail tile used to resolve the storage owner
	 */
	private static void restoreCapturedHostBlocksFromLinkedCluster(World world, TileTCRail rail)
	{
		if (world == null || rail == null || TileTCRail.isRestoringCapturedHostBlocksGlobally())
		{
			return;
		}

		TileTCRail parent = TrackCellResolver.resolveParentForRemoval(world, rail);
		(parent != null ? parent : rail).restoreCapturedHostBlocks(world);
	}

	/**
	 * Returns whether a block is any Traincraft parent or gag rail cell.
	 *
	 * @param block block to classify
	 * @return whether the block belongs to a Traincraft rail footprint
	 */
	private static boolean isRailOrGag(Block block)
	{
		return TrackCellResolver.isTraincraftRailBlock(block);
	}

	/** Returns whether a persisted pre-attachment track combines rail and road-surface hardware. */
	private static boolean isLegacyRoadCrossing(TileTCRail rail)
	{
		return rail.getTrackType() != null && rail.getTrackType().getLabel().contains("ROAD_CROSSING");
	}

	/**
	 * Drops the captured footprint's stored rail item and attachments before restoration replaces their owning tiles. The
	 * rail item appears at the initiating break coordinate, while attachments retain their installed world positions.
	 *
	 * @param world server world performing the removal
	 * @param breakX initiating cell X coordinate
	 * @param breakY initiating cell Y coordinate
	 * @param breakZ initiating cell Z coordinate
	 * @param owner authoritative captured-footprint owner
	 */
	void dropCapturedHostContents(World world, int breakX, int breakY, int breakZ, TileTCRail owner)
	{
		if (owner != null && owner.hasCapturedHostBlocks())
		{
			dropStoredRailItems(world, breakX, breakY, breakZ, owner);
			Set<TileTCRail> drainedRails = new HashSet<TileTCRail>();
			dropAttachments(world, owner, drainedRails);
			for (TileTCRailHostData.CapturedHostBlock hostBlock : owner.getOwnedCapturedHostBlocks())
			{
				int trackX = owner.xCoord + hostBlock.offsetX;
				int trackY = owner.yCoord + hostBlock.offsetY;
				int trackZ = owner.zCoord + hostBlock.offsetZ;
				world.getChunkFromBlockCoords(trackX, trackZ);
				TileEntity footprintTile = world.getTileEntity(trackX, trackY, trackZ);
				if (footprintTile instanceof TileTCRail)
				{
					dropAttachments(world, (TileTCRail)footprintTile, drainedRails);
				}
			}
		}
	}

	/**
	 * Drops attachments from every loaded model rail linked to the same greatest parent.
	 *
	 * Compound tracks store child-to-parent links but no reverse child list, so a switch's straight and turn model tiles
	 * can independently own attachments even though they share one root. Iterating only attachment-bearing loaded rails
	 * reconstructs that relationship without a broad coordinate scan or touching adjacent independent tracks.
	 */
	void dropLinkedClusterAttachments(World world, TileTCRail root)
	{
		if (world == null || world.isRemote || root == null || root.beginAttachmentClusterRemoval() == false)
		{
			return;
		}
		int[] recordedOwners = root.takeAttachmentOwnerCoordinates();
		for (int index = 0; index + 2 < recordedOwners.length; index += 3)
		{
			int ownerX = recordedOwners[index];
			int ownerY = recordedOwners[index + 1];
			int ownerZ = recordedOwners[index + 2];
			world.getChunkFromBlockCoords(ownerX, ownerZ);
			TileEntity recordedOwner = world.getTileEntity(ownerX, ownerY, ownerZ);
			if (recordedOwner instanceof TileTCRail)
			{
				dropAttachments(world, (TileTCRail)recordedOwner);
			}
		}
		/*
		 * This fallback covers attachments installed before the reverse index existed. It only resolves loaded tiles that
		 * still contain attachments and can be removed after pre-production worlds no longer need that transition.
		 */
		Object[] loadedTiles = world.loadedTileEntityList.toArray();
		for (Object loadedTile : loadedTiles)
		{
			if (loadedTile instanceof TileTCRail == false)
			{
				continue;
			}
			TileTCRail candidate = (TileTCRail)loadedTile;
			if (candidate.getTrackAttachments().isEmpty())
			{
				continue;
			}
			TileTCRail candidateRoot = TrackCellResolver.resolveParentForRemoval(world, candidate);
			if (isSameRail(root, candidateRoot))
			{
				dropAttachments(world, candidate);
			}
		}
	}

	/** Returns whether two loaded rail objects identify the same world coordinate. */
	private static boolean isSameRail(TileTCRail first, TileTCRail second)
	{
		return first == second || first != null && second != null
				&& first.xCoord == second.xCoord && first.yCoord == second.yCoord && first.zCoord == second.zCoord;
	}

	/** Drains one rail at most once while walking a captured multi-parent footprint. */
	private void dropAttachments(World world, TileTCRail rail, Set<TileTCRail> drainedRails)
	{
		if (rail != null && drainedRails.add(rail))
		{
			dropAttachments(world, rail);
		}
	}

	/** Drops every attachment stored by one rail tile and clears its collection before linked removal begins. */
	private void dropAttachments(World world, TileTCRail rail)
	{
		if (rail == null || world.isRemote)
		{
			return;
		}
		for (TrackAttachment attachment : rail.removeAllAttachments())
		{
			TrackAttachmentOperations.drop(world, rail.xCoord + attachment.getOffsetX(),
					rail.yCoord + attachment.getOffsetY(), rail.zCoord + attachment.getOffsetZ(), attachment);
		}
	}

	/** Drops and clears the item identity stored by one rail tile so restoration callbacks cannot duplicate it. */
	private void dropStoredRailItems(World world, int x, int y, int z, TileTCRail rail)
	{
		if (rail == null || rail.idDrop == null || world.isRemote)
		{
			return;
		}
		ItemStack railDrop = new ItemStack(rail.idDrop, 1, 0);
		rail.idDrop = null;
		dropRailItem(world, x, y, z, rail, railDrop);
		if (isLegacyRoadCrossing(rail))
		{
			dropRailItem(world, x, y, z, rail, new ItemStack(TrackItemIDs.tcRailSmallStraight.item));
		}
	}

	/**
	 * Responds to support and linked-cell changes around a parent rail.
	 *
	 * @param world world containing the rail
	 * @param railX rail X coordinate
	 * @param railY rail Y coordinate
	 * @param railZ rail Z coordinate
	 * @param neighborBlock changed neighboring block
	 */
	@Override
	public void onNeighborBlockChange(World world, int railX, int railY, int railZ, Block neighborBlock) {
		TileEntity tile = world.getTileEntity(railX, railY, railZ);
		if (tile == null || !(tile instanceof TileTCRail))
			return;

		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(railX, railY, railZ);
		TileTCRail parentRail = tileEntity.getGreatestParent(world);
		if (parentRail != null && parentRail.usesDynamicHostSurfaceRendering()) {
			parentRail.markTrackHostRenderDirty();
		}
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			if (world.isAirBlock(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ)) {
				// NOTE: func_147480_a = destroyBlock
				world.removeTileEntity(railX, railY, railZ);
				world.func_147480_a(railX, railY, railZ, false);
			}
		}
		if (TrackHostBlockSupport.hasHost(world, railX, railY, railZ) == false
				&& World.doesBlockHaveSolidTopSurface(world, railX, railY - 1, railZ) == false
				&& world.getBlock(railX, railY - 1, railZ) != BlockIDs.bridgePillar.block)
		{
			// NOTE: func_147480_a = destroyBlock
			world.func_147480_a(railX, railY, railZ, false);
			world.removeTileEntity(railX, railY, railZ);
		}
		if (tileEntity != null && !world.isRemote)
		{
			boolean flag = tileEntity.isSlabMountedTrack()
					? tileEntity.isReceivingSwitchPower()
					: world.isBlockIndirectlyGettingPowered(railX, railY, railZ);
			if (tileEntity.getSwitchState() != flag) {
				tileEntity.changeSwitchState(world, tileEntity, railX, railY, railZ);
			}
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Returns whether the represented captured host provides a solid queried side.
	 *
	 * @param world block-access view containing this rail
	 * @param x rail X coordinate
	 * @param y rail Y coordinate
	 * @param z rail Z coordinate
	 * @param side queried side
	 * @return whether the side is solid
	 */
	@Override
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
		return TrackHostBlockSupport.isSideSolid(world, x, y, z, side)
				|| super.isSideSolid(world, x, y, z, side);
	}

	/**
	 * Returns whether this rail represents a full captured host cube.
	 *
	 * @param world block-access view containing this rail
	 * @param x rail X coordinate
	 * @param y rail Y coordinate
	 * @param z rail Z coordinate
	 * @return whether the represented host is a normal cube
	 */
	@Override
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z) {
		return isEmbeddedFullBlock(world, x, y, z) || super.isNormalCube(world, x, y, z);
	}

	/**
	 * Returns the light opacity of the captured host represented by this rail.
	 *
	 * @param world block-access view containing this rail
	 * @param x rail X coordinate
	 * @param y rail Y coordinate
	 * @param z rail Z coordinate
	 * @return captured-host opacity, or the normal rail opacity when no host is captured
	 */
	@Override
	public int getLightOpacity(IBlockAccess world, int x, int y, int z) {
		if (TrackHostBlockSupport.hasHost(world, x, y, z) == false)
		{
			return super.getLightOpacity(world, x, y, z);
		}
		/*
		 * True embedded rails visually replace the captured block. The vanilla lighting engine also needs to see
		 * that replacement as light-blocking, otherwise skylight leaks through the rail block and brightens nearby
		 * terrain as if the original host block had vanished.
		 */
		return TrackHostBlockSupport.getLightOpacity(world, x, y, z);
	}

	/**
	 * Returns whether this parent cell represents a captured full-block host.
	 *
	 * @param world block-access view containing the rail
	 * @param x rail world X coordinate
	 * @param y rail world Y coordinate
	 * @param z rail world Z coordinate
	 * @return whether the captured host occupies a complete block
	 */
	private boolean isEmbeddedFullBlock(IBlockAccess world, int x, int y, int z) {
		return TrackHostBlockSupport.isFullHost(world, x, y, z);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileTCRail();
	}

	@Override
	public boolean onBlockActivated(World world, int blockX, int blockY, int blockZ, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(blockX, blockY, blockZ);
		int l = world.getBlockMetadata(blockX, blockY, blockZ);

		if ((te instanceof TileTCRail) && player != null) {
			ItemStack heldStack = player.inventory.getCurrentItem();
			if (isBridgeSupportSelector(heldStack))
			{
				return selectBridgeSupport(world, blockX, blockY, blockZ, player);
			}
			if (heldStack != null && heldStack.getItem() instanceof ITrackAttachmentItem)
			{
				ITrackAttachmentItem attachmentItem = (ITrackAttachmentItem)heldStack.getItem();
				return attachmentItem.installOnTrackCell(heldStack, player, world,
						blockX, blockY, blockZ, par6, par7, par9);
			}

			NBTTagCompound entityData = player.getEntityData();
			if (!entityData.hasKey("TC_Train_Detector_Pairing")) {
				if (player.inventory != null && player.inventory.getCurrentItem() != null
						&& (player.inventory.getCurrentItem().getItem() instanceof ItemWrench)
						&& ((TileTCRail) te).getType() != null
						&& ((TileTCRail) te).getType().equals(EnumTracks.SMALL_STRAIGHT.getLabel())) {
					// If player is rotating the track…
					l++;
					if (l > 3)
						l = 0;
					world.setBlockMetadataWithNotify(blockX, blockY, blockZ, l, 2);
					((TileTCRail) te).hasRotated = true;
					return true;
				}
			} else { // If player is pairing track to detector…
				TileTCRail tileTCRail = ((TileTCRail) te);
				int detectorX = entityData.getInteger("TC_Train_Detector_BlockX");
				int detectorY = entityData.getInteger("TC_Train_Detector_BlockY");
				int detectorZ = entityData.getInteger("TC_Train_Detector_BlockZ");
				TileEntity tilePossibleDetector = world.getTileEntity(detectorX, detectorY, detectorZ);
				tileTCRail = tileTCRail.getGreatestParent(world);
				if (tilePossibleDetector instanceof TileTrainDetector) {
					TileTrainDetector trainDetector = (TileTrainDetector) tilePossibleDetector;
					if (!trainDetector.getPairedTrack().contains(tileTCRail)) {
						trainDetector.getPairedTrack().add(tileTCRail);
						tileTCRail.getPairedDetectors().add(trainDetector);
						tileTCRail.markDirty();
						if (!world.isRemote)
							player.addChatComponentMessage(new ChatComponentText("Added track."));
						entityData.setInteger("TC_Train_Detector_Pairing", entityData.getInteger("TC_Train_Detector_Pairing") + 1);
					} else {
						if (!world.isRemote)
							player.addChatComponentMessage(new ChatComponentText("Track already added."));
					}
				}
			}

			if (TCRailTypes.isSlopeTrack((TileTCRail) te) || TCRailTypes.isCurvedSlopeTrack((TileTCRail) te))
			{
				if (((TileTCRail)te).canUpdateDynamicMaterial(player)
						&& player.inventory != null
						&& player.inventory.getCurrentItem() != null
						&& player.inventory.getCurrentItem().getItem() instanceof ItemBlock)
				{
					Block block = Block.getBlockFromItem(player.inventory.getCurrentItem().getItem());
					int blockID = Block.getIdFromBlock(block);
					((TileTCRail)te).setBridgeSupport(false);
					((TileTCRail) te).setBallastMaterial(blockID);
					((TileTCRail) te).ballastMetadata = player.inventory.getCurrentItem().getItemDamage();
				}
			}

		}
		return false;
	}

	/** Returns whether the held stack selects the authored wooden bridge-support mesh. */
	static boolean isBridgeSupportSelector(ItemStack stack)
	{
		return stack != null && Block.getBlockFromItem(stack.getItem()) == BlockIDs.bridgePillar.block;
	}

	/**
	 * Applies wooden bridge supports to the authoritative owner of a selected track cell.
	 *
	 * @return whether the interaction selected or already represented a supported bridge-support slope
	 */
	static boolean selectBridgeSupport(World world, int cellX, int cellY, int cellZ, EntityPlayer player)
	{
		TileTCRail owner = TrackAttachmentOperations.resolveRenderOwner(world, cellX, cellY, cellZ);
		if (owner == null || owner.getTrackType() == null
				|| owner.getTrackType().supportsBridgeSupport() == false
				|| owner.canUpdateDynamicMaterial(player) == false)
		{
			return false;
		}
		if (world.isRemote == false)
		{
			owner.setBridgeSupport(true);
			ActionBarMessenger.display(player, "Selected wooden bridge supports for this slope.");
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":tracks/rail_normal_turned");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	/**
	 * Updates this block's collision and selection bounds from its captured host shape.
	 *
	 * @param world block-access view containing this rail
	 * @param railX rail X coordinate
	 * @param railY rail Y coordinate
	 * @param railZ rail Z coordinate
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int railX, int railY, int railZ)
	{
		setBaseBoundsBasedOnState(world, railX, railY, railZ);
	}

	/** Sets only the underlying rail or captured-host bounds, excluding optional attachment hardware. */
	private void setBaseBoundsBasedOnState(IBlockAccess world, int railX, int railY, int railZ)
	{
		TileEntity tileEntity = world.getTileEntity(railX, railY, railZ);
		if (tileEntity instanceof TileTCRail && TrackHostBlockSupport.hasHost(world, railX, railY, railZ))
		{
			this.setBlockBounds(0.0F, TrackHostBlockSupport.getCollisionMinY(world, railX, railY, railZ), 0.0F,
					1.0F, TrackHostBlockSupport.getCollisionMaxY(world, railX, railY, railZ), 1.0F);
			return;
		}
		if (this instanceof BlockTCRailSlabMounted)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F,
					TrackHostConstants.HALF_BLOCK_HEIGHT + TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, 1.0F);
			return;
		}
		if (this instanceof BlockTCRailEmbedded)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			return;
		}
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, 1.0F);
	}

	/**
	 * Returns collision bounds matching the captured full block, slab, or slope cell.
	 *
	 * @param world world containing the rail
	 * @param railX rail X coordinate
	 * @param railY rail Y coordinate
	 * @param railZ rail Z coordinate
	 * @return world-space embedded-host bounds, or the legacy client/server rail bounds when no host is captured
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int railX, int railY, int railZ) {
		TileEntity tileEntity = world != null ? world.getTileEntity(railX, railY, railZ) : null;
		if (tileEntity instanceof TileTCRail && TrackHostBlockSupport.hasHost(world, railX, railY, railZ))
		{
			return AxisAlignedBB.getBoundingBox(railX, railY + TrackHostBlockSupport.getCollisionMinY(world, railX, railY, railZ), railZ,
					railX + 1, railY + TrackHostBlockSupport.getCollisionMaxY(world, railX, railY, railZ), railZ + 1);
		}
		if (this instanceof BlockTCRailSlabMounted)
		{
			return AxisAlignedBB.getBoundingBox(railX, railY, railZ,
					railX + 1, railY + TrackHostConstants.HALF_BLOCK_HEIGHT
							+ TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, railZ + 1);
		}
		if (this instanceof BlockTCRailEmbedded)
		{
			return AxisAlignedBB.getBoundingBox(railX, railY, railZ, railX + 1, railY + 1, railZ + 1);
		}
		return AxisAlignedBB.getBoundingBox(railX, railY, railZ,
				railX + 1, railY + TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, railZ + 1);
	}

	/** Adds the underlying track or host and every attachment occupying this cell to entity collision. */
	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z,
			AxisAlignedBB collisionMask, List collisions, Entity entity)
	{
		if (TrackHostBlockSupport.shouldAddTrackBaseCollision(world, x, y, z, entity))
		{
			if (TrackHostBlockSupport.addCapturedHostCollisionBoxes(world, x, y, z,
					collisionMask, collisions) == false)
			{
				AxisAlignedBB baseBounds = getCollisionBoundingBoxFromPool(world, x, y, z);
				if (baseBounds != null && collisionMask.intersectsWith(baseBounds))
				{
					collisions.add(baseBounds);
				}
			}
		}
		TrackAttachmentOperations.addAttachmentCollisionBoxes(world, x, y, z, collisionMask, collisions);
	}

	/** Selects intersected attachment hardware ahead of the underlying track shape. */
	@Override
	public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 rayStart, Vec3 rayEnd)
	{
		setBaseBoundsBasedOnState(world, x, y, z);
		MovingObjectPosition baseHit = super.collisionRayTrace(world, x, y, z, rayStart, rayEnd);
		return TrackAttachmentOperations.selectNearestHit(world, x, y, z, rayStart, rayEnd, baseHit);
	}

	/** Returns the outline of the attachment targeted by the local player's sight ray. */
	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
	{
		AxisAlignedBB attachmentBounds = TrackAttachmentOperations.findPlayerTargetedAttachmentBounds(
				world, x, y, z, Minecraft.getMinecraft().thePlayer);
		if (attachmentBounds == null)
		{
			attachmentBounds = TrackAttachmentOperations.getTargetedAttachmentBounds(world, x, y, z);
		}
		if (attachmentBounds != null)
		{
			return attachmentBounds;
		}
		setBaseBoundsBasedOnState(world, x, y, z);
		return super.getSelectedBoundingBoxFromPool(world, x, y, z);
	}

	/**
	 * Drops a rail item without applying ordinary block-drop motion to embedded hosts.
	 *
	 * @param world world receiving the item
	 * @param x broken rail X coordinate
	 * @param y broken rail Y coordinate
	 * @param z broken rail Z coordinate
	 * @param tileEntity broken rail tile
	 * @param itemStack rail item to drop
	 */
	private void dropRailItem(World world, int x, int y, int z, TileTCRail tileEntity, ItemStack itemStack) {
		if (TrackHostBlockSupport.hasHost(world, x, y, z) == false)
		{
			this.dropBlockAsItem(world, x, y, z, itemStack);
			return;
		}

		EntityItem entityItem = new EntityItem(world, x + 0.5D, y + 1.2D, z + 0.5D, itemStack);
		entityItem.delayBeforeCanPickup = 10;
		entityItem.motionX = 0.0D;
		entityItem.motionY = 0.0D;
		entityItem.motionZ = 0.0D;
		world.spawnEntityInWorld(entityItem);
	}
}
