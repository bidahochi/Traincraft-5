package train.client.gui;

import train.common.seats.RollingStockSeatManager;
import net.minecraft.entity.Entity;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric.PCH130Commute2;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.Locomotive;

public class HUDAipkit extends GuiScreen {

    private Minecraft game;
    private boolean inLoco;

    @SubscribeEvent
    public void onGameRender(RenderGameOverlayEvent.Text event)
    {
        Entity ridingStock = game == null ? null : RollingStockSeatManager.getRidingStock(game.thePlayer);

        if (game != null && game.thePlayer != null && ridingStock != null && ridingStock instanceof PCH130Commute2 && Minecraft.isGuiEnabled())
        {
            inLoco = true;
            renderSkillHUD(event, (Locomotive) ridingStock);
        }
        else
        {
            inLoco = false;
            this.game = this.mc = Minecraft.getMinecraft();
            this.fontRendererObj = this.game.fontRenderer;
        }
    }

    @SubscribeEvent(priority= EventPriority.NORMAL)
    public void onRenderPre(RenderGameOverlayEvent.Pre event) {
//8052d0
        //windowWidth = event.resolution.getScaledWidth_double();

        if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR && inLoco) {
            // event.setCanceled(true);
            GL11.glPushMatrix();
            //GL11.glTranslated((event.resolution.getScaledWidth_double() / 2 ) - 140, -1, 0.0);

        } else {
            //GL11.glTranslated(-0.6, 0.0, 0.0);
        }

    }

    @SubscribeEvent(priority= EventPriority.NORMAL)
    public void onRenderPost(RenderGameOverlayEvent.Post event) {

        if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR && inLoco) {
            GL11.glPopMatrix();
            // GL11.glTranslated(-0.6, 0.0, 0.0);
        }
    }

    public void renderSkillHUD(RenderGameOverlayEvent event, Locomotive loco) {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(),
                Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        int initialPos = (int) (height / 2.6);
        int fontSize = sr.getScaleFactor();

        //drawRect((int) (width * 0.01), (int) (height * 0.45), (int) (width / 2.1), (int) (height / 1.1), 0xFF00AAAA);
       // drawRect((int) (width * 0.11), (int) (height * 0.12), (int) (width / 1.11), (int) (height / 1.12), 0xFF101010);
    }

}
