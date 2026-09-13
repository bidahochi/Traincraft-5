package train.client.render;

import train.client.render.lighting.PlacedModelLighting;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.api.client.model.animation.PlacedModelLightProfile;
import train.client.render.models.blocks.Crossings.ModelFlashersWithGate2;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileFlashersWithGate2;

public class RenderFlashersWithGate2 extends TileEntitySpecialRenderer {
	private long updateTicks = 0;
	private boolean flip = true;
	private static final ModelFlashersWithGate2 modelSwitch = new ModelFlashersWithGate2();
	private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardRight.png");
	private static final ResourceLocation textureOn1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardLeft.png");
	private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardOff.png");
    private static final PlacedModelLightProfile lightProfile = PlacedModelLightProfile.alternatingWarning("warning",
        textureOff, textureOn, textureOn1, 6).withBidirectionalFixtureGroup("group1").withFullSurfaceFixtureGroup("group1");


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.375,y+0.625,z+0.5);
		GL11.glRotated(180,0,1,0);
		boolean skipRender = false;
		TileFlashersWithGate2 tile = ((TileFlashersWithGate2)tileEntity);


		switch (tile.getFacing()){
			case NORTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(-90,0,1,0);
				GL11.glTranslated(0,0,-0.125);
				break;
			}
			case SOUTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(90,0,1,0);
				GL11.glTranslated(0,0,.125);
				break;
			}
			case EAST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(-180,0,1,0);
				GL11.glTranslated(-0.125,0,0);
				break;
			}
			case WEST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(180,0,1,0);
				GL11.glTranslated(-0.125,0,0);
				break;
			}
			default:{
				skipRender = true;
			}
		}

		if (skipRender == false) {
			updateTicks = tileEntity.getWorldObj().getTotalWorldTime();
            flip = ((updateTicks / 6L) & 1L) == 0L;
			if(tile.powered) {
				if(updateTicks % 30 == 0) {
					if (flip)
                    {
						tmt.Tessellator.bindTexture(textureOn);
                    }
					else
                    {
						tmt.Tessellator.bindTexture(textureOn1);
                    }
				}
				else
                {
					if (flip)
                    {
						tmt.Tessellator.bindTexture(textureOn);
                    }
					else
                    {
						tmt.Tessellator.bindTexture(textureOn1);
			}
                }
			}
			else {
				if (tile.rotation < -5 || tile.rotation > 5) {
					if(updateTicks % 30 == 0) {
						if (flip)
                        {
							tmt.Tessellator.bindTexture(textureOn);
                        }
						else
                        {
							tmt.Tessellator.bindTexture(textureOn1);
                        }
					}
					else {
						if (flip)
                        {
							tmt.Tessellator.bindTexture(textureOn);
                        }
						else
                        {
							tmt.Tessellator.bindTexture(textureOn1);
					}
				}
				} else
                {
					tmt.Tessellator.bindTexture(textureOff);
			}
            }
            PlacedModelLighting.begin(tileEntity, modelSwitch, lightProfile,
                                      tile.powered || tile.rotation < -5 || tile.rotation > 5,
                                      flip ? 0 : 1,
                                      tick);
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
