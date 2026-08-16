package train.client.render;

import train.client.render.lighting.PlacedModelLighting;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.api.client.model.animation.PlacedModelLightProfile;
import tmt.Tessellator;
import train.client.render.models.blocks.Crossings.ModelWigWag;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileWigWag;

public class RenderWigWag extends TileEntitySpecialRenderer {
	private static final ModelWigWag modelSwitch = new ModelWigWag();
	private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/WigWag/WigWagCrossingOn.png");
	private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/WigWag/WigWagCrossingOff.png");
    private static final PlacedModelLightProfile lightProfile = PlacedModelLightProfile.steadyWarning("warning", textureOff,
        textureOn);


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.375,y+0.625,z+0.5);
		GL11.glRotated(180,0,1,0);
		boolean skipRender = false;
		TileWigWag tile = ((TileWigWag)tileEntity);


		switch (tile.getFacing()){
			case NORTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(90,0,1,0);
				GL11.glTranslated(0,0,0.125);
				break;
			}
			case SOUTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(270,0,1,0);
				GL11.glTranslated(0,0,-0.125);
				break;
			}
			case EAST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(180,0,1,0);
				GL11.glTranslated(-0.125,0,0);
				break;
			}
			case WEST:{
				GL11.glRotated(180,0,0,1);
				GL11.glTranslated(0.125,0,0);
				break;
			}
			default:{
				skipRender = true;
			}
		}

		if (!skipRender) {
			Tessellator.bindTexture(tile.powered?textureOn:textureOff);
            PlacedModelLighting.begin(
                tileEntity, modelSwitch, lightProfile, tile.powered, 0, tick);
            try
            {
			modelSwitch.render(null, tile.rotation, 0, 0, 0, 0, 0.0625f);
		}
            finally
            {
                PlacedModelLighting.end();
            }
		}
		GL11.glPopMatrix();
	}
}
