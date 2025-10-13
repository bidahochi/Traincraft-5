package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightParallelCurveTCTrack extends ModelBase {

    private IModelCustom modelSmallRightParallelCurve;
    private IModelCustom modelMediumRightParallelCurve;
    private IModelCustom modelLargeRightParallelCurve;
    private IModelCustom model20x2SCurveRight;

    public ModelRightParallelCurveTCTrack() {
        modelSmallRightParallelCurve = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/s/2x8_right.obj"));
        modelMediumRightParallelCurve = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/s/3x12_right.obj"));
        modelLargeRightParallelCurve = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/s/4x16_right.obj"));
        model20x2SCurveRight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/curve/s/20x2_right.obj"));
    }

    public void renderSmall() {modelSmallRightParallelCurve.renderAll();}
    public void renderMedium() {modelMediumRightParallelCurve.renderAll();}
    public void renderLarge() {modelLargeRightParallelCurve.renderAll();}
    public void render20x2() {model20x2SCurveRight.renderAll();}

    public void render(String type, TileTCRail tcRail, double x, double y, double z)
    {
        int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
        render( type, tcRail.getTrackType().getVariant(), facing, x, y, z, 1, 1, 1, 1 );
    }

    public void render(String type, RailVariants variant, int facing, double x, double y, double z, float r, float g, float b, float a) {

        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 1.5f, (float) y, (float) z + 5.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(variant));

        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);
        /** where l = 0 is SOUTH
         *        l = 1 is WEST
         *        l = 2 is NORTH
         *        l = 3 is EAST
         */
        switch (facing)
        {
            case 0:
                GL11.glRotatef(180, 0, 1, 0);
                GL11.glTranslatef(1, 0.0f, 5);
                break;
            case 1:
                GL11.glRotatef(90, 0, 1, 0);
                GL11.glTranslatef(5, 0.0f, - 1);
                break;
            case 2:
                GL11.glRotatef(0, 0, 1, 0);
                GL11.glTranslatef(-1,0.0f, - 5);
                break;
            case 3:
                GL11.glRotatef(-90, 0, 1, 0);
                GL11.glTranslatef(-5, 0.0f, 1);
                break;
        }


        switch (type)
        {
            case "small":
                this.renderSmall();
                break;
            case "medium":
                this.renderMedium();
                break;
            case "large":
                this.renderLarge();
                break;
            case "20x2":
                this.render20x2();
                break;
        }

        GL11.glPopMatrix();
    }

}