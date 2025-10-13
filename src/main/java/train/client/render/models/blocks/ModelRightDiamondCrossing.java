package train.client.render.models.blocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.items.RailVariants;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightDiamondCrossing extends ModelBase{
    private IModelCustom modelDiamondCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track/crossing/diamond_right.obj"));


    public void render()
    {
        modelDiamondCrossing.renderAll();
    }

    public void render(TileTCRail tcRail, double x, double y, double z)
    {
        render(tcRail.getTrackType().getVariant(), x, y, z, tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord), 1, 1, 1, 1);
    }

    public void render(RailVariants variants, double x, double y, double z, int facing, float r, float g, float b, float a) {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();

        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

        // Bind the texture, so that OpenGL properly textures our block.
        tmt.Tessellator.bindTexture(train.common.enums.TrackResourceLocations.GetResourceLocation(variants));
        GL11.glColor4f(r, g, b, a);
        //GL11.glScalef(0.5f, 0.5f, 0.5f);

        if (facing == 1 || facing == 3)
        {
            GL11.glRotatef(90, 0, 1,0);
        }


        this.render();
        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }
}
