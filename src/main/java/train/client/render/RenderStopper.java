/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelStopper;
import train.common.library.track.EnumTracks;
import train.common.tile.BaseStopperTileEntity;

public class RenderStopper extends TileEntitySpecialRenderer {

	private static final ModelStopper modelStopper = new ModelStopper();

	EnumTracks EnumTrack;

	public RenderStopper(EnumTracks enumTrack)
	{
		EnumTrack = enumTrack;
	}

	public void render(TileEntity var1, double x, double y, double z) {
		GL11.glPushMatrix();

		GL11.glTranslated(x, y, z);
		//FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);

		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		modelStopper.render(0.0625F, ((BaseStopperTileEntity) var1).getFacing(), EnumTrack);

		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
		render(var1, var2, var4, var6);
	}
}
