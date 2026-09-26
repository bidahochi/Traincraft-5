package train.client.render.models.blocks.track.switchs;

import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.track.AbstractTrackModel;

public abstract class AbstractSwitchTCTrack extends AbstractTrackModel
{
    protected int listMediumSwitchActive = -1;
    protected int listMediumSwitchInactive = -1;
    protected int listMediumParallelSwitchInactive = -1;
    protected int listMediumParallelSwitchActive = -1;

    protected int listLargeParallelSwitchInactive = -1;
    protected int listLargeParallelSwitchActive = -1;
    protected int listLargeSwitchActive = -1;
    protected int listLargeSwitchInactive = -1;

    protected int listVeryLargeSwitchActive = -1;
    protected int listVeryLargeSwitchInactive = -1;

    protected int listMedium45degreeSwitchActive = -1;
    protected int listMedium45degreeSwitchInActive = -1;

    protected int listLarge45degreeSwitchActive = -1;
    protected int listLarge45degreeSwitchInActive = -1;

    protected int listCrossover10x2SwitchActive = -1;
    protected int listCrossover10x2SwitchInactive = -1;


    protected int listDiagonal4x3SwitchActive = -1;
    protected int listDiagonal4x3SwitchInactive = -1;

    protected final void bake(String rotation)
    {
        listMediumSwitchActive = getDisplayList("track/switch/active/4x4_" + rotation + ".obj");
        listMediumSwitchInactive = getDisplayList("track/switch/inactive/4x4_" + rotation + ".obj");
        listMediumParallelSwitchActive = getDisplayList("track/switch/active/4x11_" + rotation + ".obj");
        listMediumParallelSwitchInactive = getDisplayList("track/switch/inactive/4x11_" + rotation + ".obj");
        listLargeParallelSwitchActive = getDisplayList("track/switch/active/4x17_" + rotation + ".obj");
        listLargeParallelSwitchInactive = getDisplayList("track/switch/inactive/4x17_" + rotation + ".obj");
        listLargeSwitchActive = getDisplayList("track/switch/active/6x6_" + rotation + ".obj");
        listLargeSwitchInactive = getDisplayList("track/switch/inactive/6x6_" + rotation + ".obj");
        listMedium45degreeSwitchActive = getDisplayList("track/switch/active/3x5_" + rotation + ".obj");
        listMedium45degreeSwitchInActive = getDisplayList("track/switch/inactive/3x5_" + rotation + ".obj");
        listLarge45degreeSwitchActive = getDisplayList("track/switch/active/4x8_" + rotation + ".obj");
        listLarge45degreeSwitchInActive = getDisplayList("track/switch/inactive/4x8_" + rotation + ".obj");
        listVeryLargeSwitchActive = getDisplayList("track/switch/active/11x11_" + rotation + ".obj");
        listVeryLargeSwitchInactive = getDisplayList("track/switch/inactive/11x11_" + rotation + ".obj");
        listCrossover10x2SwitchActive = getDisplayList("track/switch/active/crossover_10x2_" + rotation + ".obj");
        listCrossover10x2SwitchInactive = getDisplayList("track/switch/inactive/crossover_10x2_" + rotation + ".obj");
        listDiagonal4x3SwitchActive = getDisplayList("track/switch/active/45/4x3_" + rotation + ".obj");
        listDiagonal4x3SwitchInactive = getDisplayList("track/switch/inactive/45/4x3_" + rotation + ".obj");
    }
    
   public final void renderMediumActive()
    {
        GL11.glCallList(listMediumSwitchActive);
    }
   public final void renderMediumInactive()
    {
        GL11.glCallList(listMediumSwitchInactive);
    }
   public final void renderMediumParallelInactive()
    {
        GL11.glCallList(listMediumParallelSwitchInactive);
    }
   public final void renderMediumParallelActive()
    {
        GL11.glCallList(listMediumParallelSwitchActive);
    }
   public final void renderLargeParallelInactive()
    {
        GL11.glCallList(listLargeParallelSwitchInactive);
    }
   public final void renderLargeParallelActive()
    {
        GL11.glCallList(listLargeParallelSwitchActive);
    }

   public final void renderLarge90Active()
    {
        GL11.glCallList(listLargeSwitchActive);
    }
   public final void renderLarge90Inactive()
    {
        GL11.glCallList(listLargeSwitchInactive);
    }

   public final void renderVeryLarge90Active()
    {
        GL11.glCallList(listVeryLargeSwitchActive);
    }
   public final void renderVeryLarge90Inactive()
    {
        GL11.glCallList(listVeryLargeSwitchInactive);
    }

   public final void renderMedium45degreeActive()
    {
        GL11.glCallList(listMedium45degreeSwitchActive);
    }
   public final void renderMedium45degreeInActive()
    {
        GL11.glCallList(listMedium45degreeSwitchInActive);
    }
   public final void renderLarge45degreeActive()
    {
        GL11.glCallList(listLarge45degreeSwitchActive);
    }
   public final void renderLarge45degreeInActive()
    {
        GL11.glCallList(listLarge45degreeSwitchInActive);
    }

    public final void renderCrossover10x2Active()
    {
        GL11.glCallList(listCrossover10x2SwitchActive);
    }

   public final void renderCrossover10x2Inactive()
    {
        GL11.glCallList(listCrossover10x2SwitchInactive);
    }


    public final void renderDiagonal4x3Active() {
        GL11.glCallList(listDiagonal4x3SwitchActive);
    }

    public final void renderDiagonal4x3Inactive() {
        GL11.glCallList(listDiagonal4x3SwitchInactive);
    }
}
