package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)

public class ModelLeft45DegreeTurnTCTrack {

    private IModelCustom modelMediumLeft45DegreeTurn;
    private IModelCustom modelLargeLeft45DegreeTurn;
    private IModelCustom modelVeryLarge45DegreeTurn;
    private IModelCustom modelSuperLarge45DegreeTurn;
    private IModelCustom model9x2045DegreeTurn;
    private IModelCustom model10x2245DegreeTurn;

    public ModelLeft45DegreeTurnTCTrack(){
        modelMediumLeft45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/3x4_left.obj"));
        modelLargeLeft45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/3x6_left.obj"));
        modelVeryLarge45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/4x8_left.obj"));
        modelSuperLarge45DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/5x11_left.obj"));
        model9x2045DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/9x20_left.obj"));
        model10x2245DegreeTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/45-deg/10x22_left.obj"));
    }

    public void renderMedium() {modelMediumLeft45DegreeTurn.renderAll();}
    public void renderLarge() {modelLargeLeft45DegreeTurn.renderAll();}
    public void renderVeryLarge() {modelVeryLarge45DegreeTurn.renderAll();}
    public void renderSuperLarge() {modelSuperLarge45DegreeTurn.renderAll();}
    public void render9x20() {model9x2045DegreeTurn.renderAll();}
    public void render10x22() {model10x2245DegreeTurn.renderAll();}


    public void render(String turnSize, TileTCRail tcRail, double x, double y, double z)
    {
        render( turnSize, tcRail.getTrackType().getVariant(), tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), x, y, z, 1, 1, 1, 1);
    }

    public void render(String turnSize, RailVariants variant, int facing, double x, double y, double z, float r, float g, float b, float a) {

        // Bind the texture, so that OpenGL properly textures our block.
        tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(variant));

        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);

        switch (facing)
        {
            case 0:
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(0.5f,0,0.5f);
                break;
            case 1:
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(0.5f,0,0.5f);
                break;
            case 2:
                GL11.glTranslatef(0.5f,0,0.5f);
                break;
            case 3:
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(0.5f,0,0.5f);
                break;
        }

        switch (turnSize)
        {
            case "medium":
                this.renderMedium();
                break;
            case "large":
                this.renderLarge();
                break;
            case "verylarge":
                this.renderVeryLarge();
                break;
            case "superlarge":
                this.renderSuperLarge();
                break;
            case "9x20":
                this.render9x20();
                break;
            case "10x22":
                this.render10x22();
                break;
        }

        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
