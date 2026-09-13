package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.entity.TrustedPlayer;
import train.common.items.ItemPadlock;
import train.common.items.TCRailTypes;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.library.track.TrackHostConstants;
import train.common.tile.TileSwitchStand;
import train.common.tile.TileTCRail;

import java.util.List;
import java.util.Random;

/** Base block behavior shared by the existing on/off switch stands. */
public abstract class BlockSwitchStand extends BlockLever
{
	private static final int FLOOR_MOUNTED_METADATA = 5;
	private static final int ALTERNATE_FLOOR_MOUNTED_METADATA = 6;
	private static final int POWERED_METADATA_BIT = 8;
	private static final float LOWERED_SELECTION_MINIMUM = -0.5F;
	private static final float LOWERED_SELECTION_MAXIMUM = 0.5F;
	protected IIcon texture;

	public BlockSwitchStand()
	{
		super();
		setCreativeTab(Traincraft.tcTab);
		setTickRandomly(true);
	}

	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z,
			AxisAlignedBB collisionMask, List collisions, Entity entity)
	{
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand != null && switchStand.isEmbedded())
		{
			for (AxisAlignedBB localShape : switchStand.getEmbeddedHostShapes())
			{
				double maximumY = Math.min(localShape.maxY, switchStand.getMountRenderOffset());
				AxisAlignedBB hostBounds = AxisAlignedBB.getBoundingBox(
					x + localShape.minX, y + localShape.minY, z + localShape.minZ,
					x + localShape.maxX, y + maximumY, z + localShape.maxZ);
				if (collisionMask.intersectsWith(hostBounds))
				{
					collisions.add(hostBounds);
				}
			}
			return;
		}
	}

	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public abstract TileEntity createTileEntity(World world, int metadata);

	/**
	 * Returns whether this stand may align with a true-embedded switch control by capturing a full block, slab, or stair.
	 * Specialized stand blocks may override this capability when they require a different mounting system.
	 *
	 * @return whether the shared item may use true-embedded alignment and host replacement for this stand
	 */
	public boolean supportsTrueEmbeddedHostReplacement()
	{
		return true;
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	/**
	 * <p>A randomly called display update to be able to add particles or other items for display</p>
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random)
	{
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	{
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand != null && switchStand.isEmbedded())
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F,
					(float)(switchStand.getMountRenderOffset() + 1.0D), 1.0F);
			return;
		}
		if (isLoweredMountSupport(world, x, y - 1, z))
		{
			setBlockBounds(0.0F, LOWERED_SELECTION_MINIMUM, 0.0F,
					1.0F, LOWERED_SELECTION_MAXIMUM, 1.0F);
			return;
		}
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int side)
	{
		return (side == ForgeDirection.UP.ordinal() && isLoweredMountSupport(world, x, y - 1, z))
				|| super.canPlaceBlockOnSide(world, x, y, z, side);
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
		return isLoweredMountSupport(world, x, y - 1, z) || super.canPlaceBlockAt(world, x, y, z);
	}

	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side,
			float hitX, float hitY, float hitZ, int metadata)
	{
		if (side == ForgeDirection.UP.ordinal() && isLoweredMountSupport(world, x, y - 1, z))
		{
			return FLOOR_MOUNTED_METADATA | (metadata & POWERED_METADATA_BIT);
		}
		return super.onBlockPlaced(world, x, y, z, side, hitX, hitY, hitZ, metadata);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock)
	{
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand != null && switchStand.isEmbedded())
		{
			return;
		}
		int mountMetadata = world.getBlockMetadata(x, y, z) & 7;
		boolean floorMounted = mountMetadata == FLOOR_MOUNTED_METADATA
				|| mountMetadata == ALTERNATE_FLOOR_MOUNTED_METADATA;
		if (floorMounted && isLoweredMountSupport(world, x, y - 1, z))
		{
			return;
		}
		super.onNeighborBlockChange(world, x, y, z, neighborBlock);
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, Block removedBlock, int removedMetadata)
	{
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand != null && switchStand.isEmbedded()
				&& TileSwitchStand.isRestoringEmbeddedHost() == false)
		{
			switchStand.restoreEmbeddedHost(world);
		}
		super.breakBlock(world, x, y, z, removedBlock, removedMetadata);
	}

	/** Returns the switch-stand tile at a coordinate when one is present. */
	private static TileSwitchStand getSwitchStand(IBlockAccess world, int x, int y, int z)
	{
		TileEntity tile = world != null ? world.getTileEntity(x, y, z) : null;
		return tile instanceof TileSwitchStand ? (TileSwitchStand)tile : null;
	}

	/**
	 * Returns whether a support cell exposes a stable half-block-high surface for a switch stand.
	 *
	 * @param world block-access view containing the support cell
	 * @param x support-cell X coordinate
	 * @param y support-cell Y coordinate
	 * @param z support-cell Z coordinate
	 * @return whether the stand should mount one-half block below its ordinary position
	 */
	public static boolean isLoweredMountSupport(IBlockAccess world, int x, int y, int z)
	{
		if (world == null)
		{
			return false;
		}
		Block support = world.getBlock(x, y, z);
		int metadata = world.getBlockMetadata(x, y, z);
		boolean lowerSlab = support instanceof BlockSlab && support.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0;
		return lowerSlab || TrackHostBlockSupport.hasHost(world, x, y, z)
				&& TrackHostBlockSupport.getCollisionMinY(world, x, y, z) == 0.0F
				&& TrackHostBlockSupport.getHostCollisionMaxY(world, x, y, z) == 0.5F;
	}

	private static void updateSlabMountedSwitchControls(World world, int standX, int standY, int standZ)
	{
		for (int offsetX = -1; offsetX <= 1; offsetX++)
		{
			for (int offsetZ = -1; offsetZ <= 1; offsetZ++)
			{
				if (isWithinLoweredControlReach(offsetX, offsetZ) == false)
				{
					continue;
				}
				updateSlabMountedSwitchControl(world,
						standX + offsetX, standY - 1, standZ + offsetZ);
			}
		}
	}

	private static void updateSlabMountedSwitchControl(World world, int railX, int railY, int railZ)
	{
		if ((world.getBlock(railX, railY, railZ) instanceof BlockTCRailSlabMounted) == false)
		{
			return;
		}
		TileEntity tileEntity = world.getTileEntity(railX, railY, railZ);
		if (tileEntity instanceof TileTCRail)
		{
			TileTCRail rail = (TileTCRail)tileEntity;
			if (TCRailTypes.isSwitchTrack(rail) || rail.canTypeBeModifiedBySwitch)
			{
				rail.changeSwitchState(world, rail, railX, railY, railZ);
			}
		}
	}

	/**
	 * Returns whether a lowered switch stand at the requested position is currently powered.
	 *
	 * @param world block-access view containing the possible switch stand
	 * @param x switch-stand X coordinate
	 * @param y switch-stand Y coordinate
	 * @param z switch-stand Z coordinate
	 * @return whether the position contains a powered switch stand mounted over a half-height support
	 */
	private static boolean isPoweredLoweredStandAt(IBlockAccess world, int x, int y, int z)
	{
		return world != null && world.getBlock(x, y, z) instanceof BlockSwitchStand
				&& isLoweredMountSupport(world, x, y - 1, z)
				&& (world.getBlockMetadata(x, y, z) & POWERED_METADATA_BIT) != 0;
	}

	/**
	 * Returns whether a powered lowered stand occupies the support layer surrounding a slab-mounted control cell.
	 *
	 * @param world block-access view containing the control cell and possible switch stands
	 * @param controlX switch-control X coordinate
	 * @param controlY switch-control Y coordinate
	 * @param controlZ switch-control Z coordinate
	 * @return whether the control cell lies within a powered lowered stand's support footprint
	 */
	public static boolean hasPoweredLoweredStandNear(IBlockAccess world,
			int controlX, int controlY, int controlZ)
	{
		for (int offsetX = -1; offsetX <= 1; offsetX++)
		{
			for (int offsetZ = -1; offsetZ <= 1; offsetZ++)
			{
				if (isWithinLoweredControlReach(offsetX, offsetZ) == false)
				{
					continue;
				}
				if (isPoweredLoweredStandAt(world,
						controlX + offsetX, controlY + 1, controlZ + offsetZ))
				{
					return true;
				}
			}
		}
		return false;
	}

	/** Returns whether an offset is horizontally adjacent to a slab-mounted control cell. */
	private static boolean isWithinLoweredControlReach(int offsetX, int offsetZ)
	{
		return Math.abs(offsetX) + Math.abs(offsetZ) == 1;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack stack)
	{
		super.onBlockPlacedBy(world, x, y, z, placer, stack);
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand != null)
		{
			int horizontalDirection = MathHelper.floor_double(
					(double)((placer.rotationYaw * 4.0F) / 360.0F) + 0.5D) & 3;
			switch (horizontalDirection)
			{
				case 0:
					switchStand.setFacing(ForgeDirection.NORTH);
					break;
				case 1:
					switchStand.setFacing(ForgeDirection.EAST);
					break;
				case 2:
					switchStand.setFacing(ForgeDirection.SOUTH);
					break;
				default:
					switchStand.setFacing(ForgeDirection.WEST);
					break;
			}
			if (placer instanceof EntityPlayer)
			{
				switchStand.setOwner(((EntityPlayer)placer).getDisplayName());
			}
			world.markBlockForUpdate(x, y, z);
		}
	}

	/**
	 * Can this block provide power. Only wire currently seems to have this change based on its state.
	 */
	@Override
	public boolean canProvidePower()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}

	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return texture;
	}

    @Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,
			int side, float hitX, float hitY, float hitZ)
	{
		TileSwitchStand switchStand = getSwitchStand(world, x, y, z);
		if (switchStand == null)
		{
			return false;
		}
		boolean holdsPadlock = player != null && player.inventory.getCurrentItem() != null
				&& player.inventory.getCurrentItem().getItem() instanceof ItemPadlock;
		boolean ownsStand = player != null
				&& player.getDisplayName().equalsIgnoreCase(switchStand.getOwner());
		boolean hasOperatorPermission = player != null && player.canCommandSenderUseCommand(2, "");
		boolean requestsLockMenu = player != null && player.isSneaking() && holdsPadlock
				&& (ownsStand || hasOperatorPermission);

		if (world.isRemote == false)
		{
			int initialMetadata = world.getBlockMetadata(x, y, z);
			if (player == null)
			{
				super.onBlockActivated(world, x, y, z, null, side, hitX, hitY, hitZ);
			}
			else if (requestsLockMenu == false)
			{
				boolean mayActivate = switchStand.isLocked() == false || ownsStand
						|| TrustedPlayer.isPlayerTrusted(player.getDisplayName(), switchStand.getTrustedList());
				if (mayActivate)
				{
					super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
				}
				else
				{
					player.addChatMessage(new ChatComponentText(
							"This switch stand is locked by " + switchStand.getOwner() + "!"));
					return false;
				}
			}
			else if (hasOperatorPermission)
			{
				player.addChatMessage(new ChatComponentText(
						"Force activating switch stand owned by " + switchStand.getOwner()
								+ " using operator permission."));
				super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
			}
			if (world.getBlockMetadata(x, y, z) != initialMetadata
					&& isLoweredMountSupport(world, x, y - 1, z))
			{
				world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
				updateSlabMountedSwitchControls(world, x, y, z);
			}
		}
		else if (requestsLockMenu)
		{
			player.openGui(Traincraft.instance, GuiIDs.LOCK_MENU_LOCKABLES, world, x, y, z);
		}
		return true;
	}
}
