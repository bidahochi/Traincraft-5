package train.client.render;

import train.client.render.lighting.PlacedModelLighting;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.api.client.model.animation.PlacedModelLightProfile;
import train.client.render.models.blocks.Crossings.ModelLargeCantilever;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileLargeCantilever;

public class RenderLargeCantilever extends TileEntitySpecialRenderer {
    private long updateTicks = 0;
    private boolean flip = true;
    private static final ModelLargeCantilever modelSwitch = new ModelLargeCantilever();
    private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/LargeCantileverLeft.png");
    private static final ResourceLocation textureOn1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/LargeCantileverRight.png");
    private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/LargeCantileverOff.png");

    private static final PlacedModelLightProfile lightProfile = PlacedModelLightProfile.alternatingWarning("warning",

        textureOff, textureOn, textureOn1, 7).withReversedFixtureDirection();


    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.625,z+0.5);
        GL11.glRotated(180,0,1,0);
        boolean skipRender = false;
        TileLargeCantilever tile = ((TileLargeCantilever)tileEntity);


        switch (tile.getFacing()){
            case NORTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                GL11.glTranslated(-.0315,0,0);
                break;
            }
            case SOUTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(-90,0,1,0);
                GL11.glTranslated(-.0315,0,0);
                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);
                GL11.glTranslated(-.0315,0,0);
                break;
            }
            case WEST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(-.0315,0,0);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        if (skipRender == false) {
            updateTicks = tileEntity.getWorldObj().getTotalWorldTime();
            flip = ((updateTicks / 7L) & 1L) == 0L;
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
            PlacedModelLighting.begin(
                tileEntity, modelSwitch, lightProfile, tile.powered, flip ? 0 : 1, tick);
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
