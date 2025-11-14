package train.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLever;
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
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.tile.TileSwitchStand;

import java.util.List;
import java.util.Random;

public abstract class BlockSwitchStand extends BlockLever {
	protected IIcon texture;

	public BlockSwitchStand() {
		super();
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		//this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
	}

	@Override
	public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
	{
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

	@Override
	public abstract TileEntity createTileEntity(World world, int metadata);

	@Override
	public int getRenderType() {
		return -1;
	}

	/**
	 * <p>A randomly called display update to be able to add particles or other items for display</p>
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {

	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {

	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, i, j, k, entityliving, stack);
		TileSwitchStand te = (TileSwitchStand) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			te.setOwner(((EntityPlayer) entityliving).getDisplayName());
			world.markBlockForUpdate(i, j, k);
		}
	}

	/**
	 * Can this block provide power. Only wire currently seems to have this change based on its state.
	 */
	public boolean canProvidePower()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        TileSwitchStand switchStand = ((TileSwitchStand) world.getTileEntity(x, y, z));
        if (!world.isRemote) { // Server side.
            if (player == null) { // For activation without a player...
                super.onBlockActivated(world, x, y, z, null, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
            } else if (!((player.isSneaking()) && (player.inventory.getCurrentItem() != null) && (player.inventory.getCurrentItem().getItem() instanceof ItemPadlock)
                    &&  ((player.getDisplayName().equalsIgnoreCase(switchStand.getOwner())) || (player.canCommandSenderUseCommand(2, ""))))) {
                if (!switchStand.isLocked() || player.getDisplayName().equalsIgnoreCase(switchStand.getOwner()) || TrustedPlayer.isPlayerTrusted(player.getDisplayName(), switchStand.getTrustedList()))
                    super.onBlockActivated(world, x, y, z, player, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
                else {
                    player.addChatMessage(new ChatComponentText("This switch stand is locked by " + switchStand.getOwner() + "!"));
                    return false;
                }
            } else if (player.canCommandSenderUseCommand(2, "") && player.inventory.getCurrentItem() != null &&
                    player.inventory.getCurrentItem().getItem() instanceof ItemPadlock) {
                player.addChatMessage(new ChatComponentText("Force activating switch stand owned by " + switchStand.getOwner() + " using operator permission."));
                super.onBlockActivated(world, x, y, z, player, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
            }
        } else { // Client side.
            if ((player.isSneaking()) && (player.inventory.getCurrentItem() != null) && (player.inventory.getCurrentItem().getItem() instanceof ItemPadlock)
                    &&  ((player.getDisplayName().equalsIgnoreCase(switchStand.getOwner())) || (player.canCommandSenderUseCommand(2, "")))) {
                player.openGui(Traincraft.instance, GuiIDs.LOCK_MENU_SWITCHES, world, x, y, z);
            }
        }
        return true;
    }
}
