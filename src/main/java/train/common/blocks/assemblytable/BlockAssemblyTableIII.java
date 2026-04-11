package train.common.blocks.assemblytable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.Traincraft;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.tile.TileCrafterTierIII;
import train.common.tile.TileHelper;

import java.util.Random;

public class BlockAssemblyTableIII extends BlockAbstractAssemblyTable
{
	public BlockAssemblyTableIII(Material material) {
		super(material);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileCrafterTierIII) {
				player.openGui(Traincraft.instance, GuiIDs.CRAFTER_TIER_III, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int meta) {
		return new TileCrafterTierIII();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textureTop = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_3_top");
		textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_3_bottom");
		textureFront = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_3_front");
		textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_3_side");
	}
}