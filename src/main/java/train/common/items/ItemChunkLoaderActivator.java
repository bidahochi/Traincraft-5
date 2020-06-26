package train.common.items;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;

public class ItemChunkLoaderActivator extends Item {

	public ItemChunkLoaderActivator() {
		super();
		maxStackSize = 1;
		setCreativeTab(Traincraft.tcTab);
		setMaxDamage(10);
	}

	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":chunk_loader");
	}*/

	@Override
	@SideOnly(Side.CLIENT)
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining){
		return new ModelResourceLocation(new ResourceLocation(Info.modID.toLowerCase(), "chunk_loader"),"inventory");
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "Right click on a Locomotive");
		par3List.add("\u00a77" + " to start/stop chunk loading.");
		par3List.add("\u00a77" + "Locomotives will load chunks");
		par3List.add("\u00a77" + "around attached carts.");
	}
}
