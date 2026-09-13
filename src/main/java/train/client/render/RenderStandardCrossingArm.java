package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.Crossings.ModelStandardCrossingArm;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileStandardCrossingArm;

public class RenderStandardCrossingArm extends TileEntitySpecialRenderer {
	private long updateTicks = 0;
	private boolean flip = true;
	private static final ModelStandardCrossingArm modelSwitch = new ModelStandardCrossingArm();
	private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardLeft.png");
	private static final ResourceLocation textureOn1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardRight.png");
	private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/StandardOff.png");


	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.375,y+0.625,z+0.5);
		GL11.glRotated(180,0,1,0);
		boolean skipRender = false;
		TileStandardCrossingArm tile = ((TileStandardCrossingArm)tileEntity);


		switch (tile.getFacing()){
			case NORTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(180,0,1,0);
				GL11.glTranslated(-0.125,0,0);
				break;
			}
			case SOUTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glTranslated(0.125,0,0);
				break;
			}
			case EAST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(270,0,1,0);
				GL11.glTranslated(0,0,-0.125);
				break;
			}
			case WEST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(90,0,1,0);
				GL11.glTranslated(0,0,0.125);
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
			modelSwitch.render(null, tile.rotation, 0, 0, 0, 0, 0.0625f);
		}
		GL11.glPopMatrix();
	}
}
