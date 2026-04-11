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
import train.common.tile.TileCrafterTierAbstract;
import train.common.tile.TileCrafterTierI;
import train.common.tile.TileHelper;

import java.util.Random;

public class BlockAssemblyTableI extends BlockAbstractAssemblyTable
{

	public BlockAssemblyTableI(Material material) {
		super(material);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				if (te instanceof TileCrafterTierI) {
					player.openGui(Traincraft.instance, GuiIDs.CRAFTER_TIER_I, world, i, j, k);
				}
			}
			else {
				return false;
			}
		}
		return true;
	}



	@Override
	public TileEntity createNewTileEntity(World var1, int meta) {
		return new TileCrafterTierI();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textureTop = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_top");
		textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
		textureFront = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_front");
		textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_side");
	}
}