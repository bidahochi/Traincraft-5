package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.TrackHostConstants;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import train.common.tile.TileTrainDetector;
import train.common.track.attachment.TrackAttachmentOperations;
import train.common.track.attachment.ITrackAttachmentItem;

import java.util.Random;
import java.util.List;

public class BlockTCRailGag extends Block {
	private IIcon texture;

	/** Creates a linked gag rail block with its legacy material and render properties. */
	public BlockTCRailGag() {
		super(Material.anvil);
		setCreativeTab(Traincraft.tcTab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, 1.0F);
	}

	@Override
	public boolean onBlockActivated(World world, int blockX, int blockY, int blockZ, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(blockX, blockY, blockZ);
		int l = world.getBlockMetadata(blockX, blockY, blockZ);

		if ((te instanceof TileTCRailGag) && player != null) {
			ItemStack heldStack = player.inventory.getCurrentItem();
			if (BlockTCRail.isBridgeSupportSelector(heldStack))
			{
				return BlockTCRail.selectBridgeSupport(world, blockX, blockY, blockZ, player);
			}
			if (heldStack != null && heldStack.getItem() instanceof ITrackAttachmentItem)
			{
				ITrackAttachmentItem attachmentItem = (ITrackAttachmentItem)heldStack.getItem();
				return attachmentItem.installOnTrackCell(heldStack, player, world,
						blockX, blockY, blockZ, par6, par7, par9);
			}

			NBTTagCompound entityData = player.getEntityData();
			if (entityData.hasKey("TC_Train_Detector_Pairing")) { // If player is pairing track to detector…
				TileTCRailGag tileTCRailGag = ((TileTCRailGag) te);
				TileEntity possibleTileTCRail = world.getTileEntity(tileTCRailGag.originX, tileTCRailGag.originY, tileTCRailGag.originZ);
				if (possibleTileTCRail instanceof TileTCRail) {
					TileTCRail tileTCRail = ((TileTCRail) possibleTileTCRail);
					int detectorX = entityData.getInteger("TC_Train_Detector_BlockX");
					int detectorY = entityData.getInteger("TC_Train_Detector_BlockY");
					int detectorZ = entityData.getInteger("TC_Train_Detector_BlockZ");
					tileTCRail = tileTCRail.getGreatestParent(world);
					TileEntity tilePossibleDetector = world.getTileEntity(detectorX, detectorY, detectorZ);
					if (tilePossibleDetector instanceof TileTrainDetector) {
						TileTrainDetector trainDetector = (TileTrainDetector) tilePossibleDetector;
						if (!trainDetector.getPairedTrack().contains(tileTCRail)) {
							trainDetector.getPairedTrack().add(tileTCRail);
							tileTCRail.getPairedDetectors().add(trainDetector);
							if (!world.isRemote)
								player.addChatComponentMessage(new ChatComponentText("Added track."));
							entityData.setInteger("TC_Train_Detector_Pairing", entityData.getInteger("TC_Train_Detector_Pairing") + 1);
						} else {
							if (!world.isRemote)
								player.addChatComponentMessage(new ChatComponentText("Track already added."));
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return false;
	}

	private static final int[] matrixXZ = {0,-1,-2,1,2}, matrixY = {0,-1,-2,1,2};

	/**
	 * Breaks a linked gag cell and coordinates parent removal or host restoration.
	 *
	 * @param world world containing the gag cell
	 * @param gagX gag X coordinate
	 * @param gagY gag Y coordinate
	 * @param gagZ gag Z coordinate
	 * @param removedBlock block being removed
	 * @param removedMetadata removed block metadata
	 */
	@Override
	public void breakBlock(World world, int gagX, int gagY, int gagZ, Block removedBlock, int removedMetadata) {
		TileTCRailGag tileEntity = (TileTCRailGag) world.getTileEntity(gagX, gagY, gagZ);
		// Host restoration replaces gag cells too. Do not let those replacement
		// callbacks destroy the gag origin or any already-restored linked cell.
		if (TileTCRail.isRestoringCapturedHostBlocksGlobally()) {
			world.removeTileEntity(gagX, gagY, gagZ);
			return;
		}
		if (tileEntity != null) {
			TileTCRail parent = TrackCellResolver.resolveParentForRemoval(world, tileEntity);
			if (parent != null) {
				Block parentBlock = parent.getBlockType();
				if (parentBlock instanceof BlockTCRail)
				{
					BlockTCRail railBlock = (BlockTCRail)parentBlock;
					railBlock.dropCapturedHostContents(world, gagX, gagY, gagZ, parent);
					railBlock.dropLinkedClusterAttachments(world, parent);
				}
				parent.restoreCapturedHostBlocks(world);
			}
			TileEntity originTile = world.getTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ);
			if (isRailOrGag(world.getBlock(tileEntity.originX, tileEntity.originY, tileEntity.originZ))) {
				world.func_147480_a(tileEntity.originX, tileEntity.originY, tileEntity.originZ, false);
				world.removeTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ);
			}
			// NOTE: func_147480_a = destroyBlock
			for(int x : matrixXZ){
				for(int z : matrixXZ){
					for(int y : matrixY){
						if (world.getBlock(x + tileEntity.xCoord, y + tileEntity.yCoord, z + tileEntity.zCoord)instanceof BlockTCRailGag){
							world.notifyBlockChange((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1), (z  + tileEntity.zCoord), Blocks.air);
							world.markBlockForUpdate((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1 ), (z  + tileEntity.zCoord));
						}
						if (world.getBlock(x + tileEntity.xCoord, y + tileEntity.yCoord, z + tileEntity.zCoord)instanceof BlockTCRail){
							world.notifyBlockChange((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1), (z  + tileEntity.zCoord), Blocks.air);
							world.markBlockForUpdate((x  + tileEntity.xCoord), (y + tileEntity.yCoord + 1 ), (z  + tileEntity.zCoord));
						}
					}
				}
			}

		}
		if (isRailOrGag(world.getBlock(gagX, gagY, gagZ))) {
			world.removeTileEntity(gagX, gagY, gagZ);
		}
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random) {
		return 0;
	}

	@Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
		return null;
	}

	/**
	 * Responds to support and linked-cell changes around a gag rail cell.
	 *
	 * @param world world containing the gag cell
	 * @param gagX gag X coordinate
	 * @param gagY gag Y coordinate
	 * @param gagZ gag Z coordinate
	 * @param neighborBlock changed neighboring block
	 */
	@Override
	public void onNeighborBlockChange(World world, int gagX, int gagY, int gagZ, Block neighborBlock) {
		TileEntity tileEntity = world.getTileEntity(gagX, gagY, gagZ);
		if (tileEntity instanceof TileTCRailGag) {
			if (world.isAirBlock(((TileTCRailGag)tileEntity).originX, ((TileTCRailGag)tileEntity).originY, ((TileTCRailGag)tileEntity).originZ)) {
				// NOTE: func_147480_a = destroyBlock
				world.func_147480_a(gagX, gagY, gagZ, false);
				world.removeTileEntity(gagX, gagY, gagZ);
			}
			TileTCRail parentRail = null;
			TileEntity originTile = world.getTileEntity(((TileTCRailGag) tileEntity).originX, ((TileTCRailGag) tileEntity).originY, ((TileTCRailGag) tileEntity).originZ);
			if (originTile instanceof TileTCRail) {
				parentRail = ((TileTCRail) originTile).getGreatestParent(world);
			}
			if (parentRail != null && parentRail.usesDynamicHostSurfaceRendering()) {
				parentRail.markTrackHostRenderDirty();
			}
			if (TrackHostBlockSupport.hasHost(world, gagX, gagY, gagZ) == false
					&& World.doesBlockHaveSolidTopSurface(world, gagX, gagY - 1, gagZ) == false
					&& world.getBlock(gagX, gagY - 1, gagZ) != BlockIDs.bridgePillar.block)
			{
				// NOTE: func_147480_a = destroyBlock
				world.func_147480_a(gagX, gagY, gagZ, false);
				world.removeTileEntity(gagX, gagY, gagZ);
			}
		}
	}

	/**
	 * Updates gag-cell selection bounds to match its resolved parent and captured host.
	 *
	 * @param blockAccess world access containing the gag cell
	 * @param gagX gag X coordinate
	 * @param gagY gag Y coordinate
	 * @param gagZ gag Z coordinate
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int gagX, int gagY, int gagZ)
	{
		setBaseBoundsBasedOnState(blockAccess, gagX, gagY, gagZ);
	}

	/** Sets only the gag's underlying rail or captured-host bounds, excluding optional attachment hardware. */
	private void setBaseBoundsBasedOnState(IBlockAccess blockAccess, int gagX, int gagY, int gagZ)
	{
		TileTCRailGag tileEntity = (TileTCRailGag) blockAccess.getTileEntity(gagX, gagY, gagZ);
		if (tileEntity != null) {
			TileEntity originTile = blockAccess.getTileEntity(tileEntity.originX, tileEntity.originY, tileEntity.originZ);
			if (originTile instanceof TileTCRail
					&& TrackHostBlockSupport.hasHost(blockAccess, gagX, gagY, gagZ))
			{
				this.setBlockBounds(0.0F, TrackHostBlockSupport.getCollisionMinY(blockAccess, gagX, gagY, gagZ), 0.0F,
						1.0F, TrackHostBlockSupport.getCollisionMaxY(blockAccess, gagX, gagY, gagZ), 1.0F);
				return;
			}
			if (this instanceof BlockTCRailGagSlabMounted)
			{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F,
						TrackHostConstants.HALF_BLOCK_HEIGHT + TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, 1.0F);
				return;
			}
			if (this instanceof BlockTCRailGagEmbedded)
			{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				return;
			}
			//System.out.println(tileEntity.type+" "+tileEntity.bbHeight);
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, tileEntity.bbHeight, 1.0F);
		}
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Returns whether the represented captured host provides a solid queried side.
	 *
	 * @param world block-access view containing this gag
	 * @param x gag X coordinate
	 * @param y gag Y coordinate
	 * @param z gag Z coordinate
	 * @param side queried side
	 * @return whether the side is solid
	 */
	@Override
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
		return TrackHostBlockSupport.isSideSolid(world, x, y, z, side)
				|| super.isSideSolid(world, x, y, z, side);
	}

	/**
	 * Returns whether this gag represents a full captured host cube.
	 *
	 * @param world block-access view containing this gag
	 * @param x gag X coordinate
	 * @param y gag Y coordinate
	 * @param z gag Z coordinate
	 * @return whether the represented host is a normal cube
	 */
	@Override
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z) {
		return isEmbeddedFullBlock(world, x, y, z) || super.isNormalCube(world, x, y, z);
	}

	/**
	 * Returns the light opacity of the captured host represented by this gag.
	 *
	 * @param world block-access view containing this gag
	 * @param x gag X coordinate
	 * @param y gag Y coordinate
	 * @param z gag Z coordinate
	 * @return captured-host opacity, or the normal gag opacity when no host is captured
	 */
	@Override
	public int getLightOpacity(IBlockAccess world, int x, int y, int z) {
		if (TrackHostBlockSupport.hasHost(world, x, y, z) == false)
		{
			return super.getLightOpacity(world, x, y, z);
		}
		/*
		 * Gags represent most occupied cells in long true embedded tracks. They must block skylight like the
		 * captured host block, or neighboring terrain will light as though the embedded rail cell is air.
		 */
		return TrackHostBlockSupport.getLightOpacity(world, x, y, z);
	}

	/**
	 * Returns whether this gag cell represents a captured full-block host.
	 *
	 * @param world block-access view containing the gag
	 * @param x gag world X coordinate
	 * @param y gag world Y coordinate
	 * @param z gag world Z coordinate
	 * @return whether the captured host occupies a complete block
	 */
	private boolean isEmbeddedFullBlock(IBlockAccess world, int x, int y, int z) {
		return TrackHostBlockSupport.isFullHost(world, x, y, z);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileTCRailGag();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int blockX, int blockY, int blockZ, int side) {
		return false;
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
	 * Returns collision bounds matching the gag cell's captured full block, slab, or slope cell.
	 *
	 * @param world world containing the gag cell
	 * @param gagX gag X coordinate
	 * @param gagY gag Y coordinate
	 * @param gagZ gag Z coordinate
	 * @return world-space collision bounds, or {@code null} when the gag has no collision
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int gagX, int gagY, int gagZ) {
		TileEntity tileEntity = world.getTileEntity(gagX, gagY, gagZ);
		if (tileEntity instanceof TileTCRailGag) {
			TileTCRailGag gag = (TileTCRailGag) tileEntity;
			TileEntity originTile = world.getTileEntity(gag.originX, gag.originY, gag.originZ);
			if (originTile instanceof TileTCRail && TrackHostBlockSupport.hasHost(world, gagX, gagY, gagZ))
			{
				return AxisAlignedBB.getBoundingBox(gagX, gagY + TrackHostBlockSupport.getCollisionMinY(world, gagX, gagY, gagZ), gagZ,
						gagX + 1, gagY + TrackHostBlockSupport.getCollisionMaxY(world, gagX, gagY, gagZ), gagZ + 1);
			}
			if (this instanceof BlockTCRailGagSlabMounted)
			{
				return AxisAlignedBB.getBoundingBox(gagX, gagY, gagZ,
						gagX + 1, gagY + TrackHostConstants.HALF_BLOCK_HEIGHT
								+ TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, gagZ + 1);
			}
			if (this instanceof BlockTCRailGagEmbedded)
			{
				return AxisAlignedBB.getBoundingBox(gagX, gagY, gagZ, gagX + 1, gagY + 1, gagZ + 1);
			}
			if (gag.type == null || gag.type.equals("null"))
			{
				return null;
			}
			return AxisAlignedBB.getBoundingBox(gagX, gagY, gagZ, gagX + 1, gagY + ((TileTCRailGag)tileEntity).bbHeight, gagZ + 1);
		}
		return null;
	}

	/** Adds the gag's normal host shape and every attachment occupying this cell to entity collision. */
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

	/** Selects intersected attachment hardware ahead of the underlying gag shape. */
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
	 * Returns whether a block is any Traincraft parent or gag rail cell.
	 *
	 * @param block block to classify
	 * @return whether the block belongs to a Traincraft rail footprint
	 */
	private boolean isRailOrGag(Block block) {
		return TrackCellResolver.isTraincraftRailBlock(block);
	}
}
