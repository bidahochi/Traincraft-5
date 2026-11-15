package com.jcirmodelsquad.tcjcir.extras;

import train.common.seats.RollingStockSeatManager;
import net.minecraft.entity.Entity;

import com.jcirmodelsquad.tcjcir.features.TiltingHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.EntityRollingStock;
import train.common.library.Info;

import java.lang.reflect.Field;
import java.text.DecimalFormat;

public class HudTiltingHandler extends GuiScreen {
    private Minecraft game;
    @SubscribeEvent
    public void onGameRender(RenderGameOverlayEvent.Text event)
    {
        Entity ridingStock = game == null ? null : RollingStockSeatManager.getRidingStock(game.thePlayer);
        if (game != null && game.thePlayer != null && ridingStock != null && ridingStock instanceof EntityRollingStock && Minecraft.isGuiEnabled())
        {
            try
            {
                if (ridingStock.getClass().getField("tiltingHandler") != null)
                {
                    Object handlerField = ridingStock.getClass().getField("tiltingHandler").get(ridingStock);
                    if (handlerField instanceof TiltingHandler) {
                        renderSkillHUD(event, (TiltingHandler)handlerField);
                    }


                }
            }
            catch (NoSuchFieldException | IllegalAccessException e)
            {
                //Train does not have a tilt hadnler
            }

        }
        else
        {
            this.game = this.mc = Minecraft.getMinecraft();
            this.fontRendererObj = this.game.fontRenderer;
        }
    }

    public void renderSkillHUD(RenderGameOverlayEvent event, TiltingHandler tiltingHandler) {
        int width = 40;
        GL11.glEnable(3042 /* GL_BLEND */);
        GL11.glEnable(32826);

        int height = this.game.fontRenderer.FONT_HEIGHT;
        int padding = 2;
        int margin = 4;

        int xPos = margin;
        int yPos = margin;

       GL11.glDisable(0xDE1);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glColor4f(3, 121, 95, 70);
       // Gui.drawRect(margin, margin, margin + width + padding * 2 + 70, margin + height + padding + padding + 35, 0x3105195);
        GL11.glEnable(0xDE1);
        drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "tilthandler_guitrain.png"), 16, 7, 0, 0, 184, 231, 184, 231, 0.25, tiltingHandler.tiltingProgress);
       // drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcdisable.png"), 12, 45, 0, 0, 64, 64, 64, 64, 0.25, 0);

        this.drawString(this.game.fontRenderer, new DecimalFormat("###.###").format(tiltingHandler.tiltingProgress) + "°", xPos + 23, yPos + 65, 14737632);
        this.drawString(this.game.fontRenderer, "JCIR-Traincraft TiltHandler", xPos + 70, yPos + 10, 14737632);

        this.drawString(this.game.fontRenderer, "Tilting to the " + tiltingHandler.tiltingDirection, xPos + 70, yPos + 20, 14737632);
        if ( tiltingHandler.tiltingStatus.equals("tiltin")) {
            this.drawString(this.game.fontRenderer, "Tilting in.", xPos + 70, yPos + 30, 14737632);
        } else {
            this.drawString(this.game.fontRenderer, "Tilting out.", xPos + 70, yPos + 30, 14737632);
        }
        this.drawString(this.game.fontRenderer, "Maximum Tilt: " + tiltingHandler.maxTilt + "°", xPos + 70, yPos + 40, 14737632);
        if (tiltingHandler.testTilting) {
            this.drawString(this.game.fontRenderer, "Stationary Tilt Test", xPos + 70, yPos + 50, 14737632);
        }

        GL11.glDisable(32826);
        GL11.glDisable(3042 /* GL_BLEND */);
    }

    public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale, float rotate) {
        GL11.glPushMatrix();
        GL11.glTranslatef(20,40,0);
        GL11.glRotatef(-rotate, 0, 0, 1);
        GL11.glTranslatef(-20, -40, 0);
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        double minU = (double)u / (double)imageWidth;
        double maxU = (double)(u + width) / (double)imageWidth;
        double minV = (double)v / (double)imageHeight;
        double maxV = (double)(v + height) / (double)imageHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
        tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
        tessellator.addVertexWithUV(x, y, 0, minU, minV);
        tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
        tessellator.draw();
        GL11.glPopMatrix();
    }
}
