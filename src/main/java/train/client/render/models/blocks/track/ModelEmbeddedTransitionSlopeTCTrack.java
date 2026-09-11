package train.client.render.models.blocks.track;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import train.common.enums.TrackResourceLocations;
import train.common.items.RailVariants;

@SideOnly(Side.CLIENT)
public class ModelEmbeddedTransitionSlopeTCTrack extends AbstractTrackModel
{
    private final int listTrack;

    /**
     * Loads the transition rail mesh into a display list.
     *
     * @param trackOBJ transition rail OBJ resource path
     */
    public ModelEmbeddedTransitionSlopeTCTrack(String trackOBJ)
    {
        listTrack = getDisplayList(trackOBJ);
    }

    /**
     * Renders the cardinal transition mesh with the selected rail texture.
     *
     * @param variant rail texture family
     * @param facing cardinal model facing
     * @param x local render X coordinate
     * @param y local render Y coordinate
     * @param z local render Z coordinate
     * @param r red color multiplier
     * @param g green color multiplier
     * @param b blue color multiplier
     * @param a alpha multiplier
     */
    public void render(RailVariants variant, int facing, double x, double y, double z, float r, float g, float b, float a)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
        GL11.glColor4f(r, g, b, a);

        switch (facing)
        {
            case 0:
                GL11.glRotatef(180, 0, 1, 0);
                break;
            case 7:
                GL11.glTranslatef(-0.5f, 0, -0.5f);
                GL11.glRotatef(180, 0, 1, 0);
                break;
            case 1:
                GL11.glRotatef(90, 0, 1, 0);
                break;
            case 4:
                GL11.glTranslatef(0.5f, 0, -0.5f);
                GL11.glRotatef(90, 0, 1, 0);
                break;
            case 3:
                GL11.glRotatef(-90, 0, 1, 0);
                break;
            case 6:
                GL11.glTranslatef(-0.5f, 0, 0.5f);
                GL11.glRotatef(-90, 0, 1, 0);
                break;
            case 5:
                GL11.glTranslatef(0.5f, 0, 0.5f);
                break;
            default:
                break;
        }

        tmt.Tessellator.bindTexture(TrackResourceLocations.GetResourceLocation(variant));
        GL11.glCallList(listTrack);
        GL11.glColor4f(1, 1, 1, 1);
        GL11.glPopMatrix();
    }

    /**
     * Renders the diagonal transition mesh with the same transforms as the 1x3 diagonal straight.
     *
     * @param variant rail texture family
     * @param facing diagonal model facing
     * @param x local render X coordinate
     * @param y local render Y coordinate
     * @param z local render Z coordinate
     * @param r red color multiplier
     * @param g green color multiplier
     * @param b blue color multiplier
     * @param a alpha multiplier
     */
    public void renderDiagonal(RailVariants variant, int facing, double x, double y, double z,
            float r, float g, float b, float a)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z);
        GL11.glColor4f(r, g, b, a);

        switch (facing)
        {
            case 4:
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
                break;
            case 5:
                GL11.glTranslatef(1.0F, 0.0F, 1.0F);
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                break;
            case 6:
                GL11.glTranslatef(0.0F, 0.0F, 1.0F);
                GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                break;
            case 7:
                break;
            default:
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glPopMatrix();
                return;
        }

        tmt.Tessellator.bindTexture(TrackResourceLocations.GetResourceLocation(variant));
        GL11.glCallList(listTrack);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }
}
