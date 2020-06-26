package train.common.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileBridgePillar extends TileEntity {

	@SideOnly(Side.CLIENT)
	@Override
	public double getMaxRenderDistanceSquared() {
		if(FMLClientHandler.instance()!=null && FMLClientHandler.instance().getClient()!=null && FMLClientHandler.instance().getClient().gameSettings!=null){
			if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 0) {
				return 30000.0D;
			}
			else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 1) {
				return 15900.0D;
			}
			else if (FMLClientHandler.instance().getClient().gameSettings.renderDistanceChunks == 2) {
				return 4000.0D;
			} else return 4096.0;
		}else{
			return 4096.0;
		}
	}
	
	/*
	@Override // Why would you even do this..?
	public void updateEntity() {
		super.updateEntity();
	}*/
}