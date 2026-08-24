package train.client.renderhelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelRendererTurbo;
import train.client.render.lighting.ClientRollingStockLighting;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightState;
import train.common.api.Locomotive;
import train.common.api.RollingStockHeadlightLevel;
import train.common.api.RollingStockLightChannel;


public class ModelRenderHelper
{
	private static final int COMMANDER_BEACON_PERIOD_TICKS = 20;
	private static final int COMMANDER_BEACON_ON_TICKS = COMMANDER_BEACON_PERIOD_TICKS / 2;
    /**
     * Renders rolling-stock model parts through the enhanced lighting adapter when a lighting
     * scope is active. Otherwise, the compatibility path applies the original lightmap, beacon, and
     * culling behavior to the recognized part tags: lamp, instrument, numberboard, marker, ditch,
     * commander, prime1 through prime4, rotary, and cull.
     *
     * @param bodyModel ordered model parts to render
     * @param entity rolling-stock entity implementing {@link IRollingStockLightState}
     * @param f5 TMT model scale passed to each part render
     */
    public static void renderModelWithRollingStockLightControls(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        renderModelWithRollingStockLightState(bodyModel, (IRollingStockLightState) entity, f5);
    }

    /** Renders model parts through the compatibility helper using read-only synchronized light state. */
    private static void renderModelWithRollingStockLightState(
        ModelRendererTurbo[] bodyModel, IRollingStockLightState rollingStock, float f5)
    {
        if (ClientRollingStockLighting.isActive())
        {
            renderWithLightingAdapter(bodyModel, f5);
            return;
        }
        for (ModelRendererTurbo bm : bodyModel)
        {
            switch (bm.boxName)
            {
                case "cull":
                    GL11.glDisable(GL11.GL_CULL_FACE);
                    bm.render(f5);
                    GL11.glEnable(GL11.GL_CULL_FACE);
                break;
                case "lamp":
                case "instrument":
                    if (hasHeadlights(rollingStock))
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                break;
                case "numberboard":
                case "marker":
                    if (rollingStock.isLightChannelEnabled(RollingStockLightChannel.AUX))
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                break;
                case "ditch":
                    if (rollingStock.isLightChannelEnabled(RollingStockLightChannel.DITCH))
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                break;
                case "commander":
                    if (rollingStock.isLightChannelEnabled(RollingStockLightChannel.BEACON)
                            && ((EntityRollingStock)rollingStock).ticksExisted
                               % COMMANDER_BEACON_PERIOD_TICKS < COMMANDER_BEACON_ON_TICKS)
                    {
                        Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        bm.render(f5);
                        Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                break;
                case "prime1":
                case "prime2":
                case "prime3":
                case "prime4":
                    if (rollingStock.isLightChannelEnabled(RollingStockLightChannel.BEACON))
                    {
                        renderPrimeLight(bm, beaconPhase((EntityRollingStock) rollingStock), f5);
                    }
                    else
                    {
                        bm.render(f5);
                    }
                break;
                case "rotary":
                    break;
                default:
                    bm.render(f5);
                break;
            }
        }
    }

    public static void renderSlugModel(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        if (ClientRollingStockLighting.isActive())
        {
            renderWithLightingAdapter(bodyModel, f5);
            return;
        }
        for (ModelRendererTurbo bm : bodyModel)
        {
            if (bm.boxName.contains("lamp")
                    || bm.boxName.contains("numberboard")
                    || bm.boxName.contains("marker")
                    || bm.boxName.contains("instrument")
                    || bm.boxName.contains("ditch")
                    || bm.boxName.contains("commander")
                    || bm.boxName.contains("prime"))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else
            { if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }
    }

    public static void renderLocomotiveModelWithoutBeacon(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        renderLocomotiveModelWithoutBeacon(bodyModel, (Locomotive)entity, f5);
    }

    /**
     * Renders a locomotive model Can Render the following Special items lamp, cull
     *
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    private static void renderLocomotiveModelWithoutBeacon(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        if (ClientRollingStockLighting.isActive())
        {
            renderWithLightingAdapter(bodyModel, f5);
            return;
        }
        for (ModelRendererTurbo bm : bodyModel)
        {
            if ((bm.boxName.contains("lamp") || bm.boxName.contains("instrument"))
                    && hasHeadlights(locomotive)
                    || (bm.boxName.contains("numberboard") || bm.boxName.contains("marker"))
                    && locomotive.isLightChannelEnabled(RollingStockLightChannel.AUX))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else
            { if (bm.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                bm.render(f5);
                GL11.glEnable(GL11.GL_CULL_FACE);
            }
            else
            {
                bm.render(f5);
            }
        }
    }
    }

    /**
     * Renders a locomotive model Can Render the following Special items lamp,
     *
     * @param bodyModel
     * @param locomotive
     * @param f5
     */
    public static void renderLocomotiveModelWithLamp(ModelRendererTurbo[] bodyModel, Locomotive locomotive, float f5)
    {
        if (ClientRollingStockLighting.isActive())
        {
            renderWithLightingAdapter(bodyModel, f5);
            return;
        }
        for (ModelRendererTurbo bm : bodyModel)
        {
            if ((bm.boxName.contains("lamp") || bm.boxName.contains("instrument"))
                    && hasHeadlights(locomotive)
                    || (bm.boxName.contains("numberboard") || bm.boxName.contains("marker"))
                    && locomotive.isLightChannelEnabled(RollingStockLightChannel.AUX))
            {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bm.render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
            else
            {
                bm.render(f5);
            }
        }
    }

    private static void renderPrimeLight(ModelRendererTurbo bodyModel, byte cycleIndex, float f5)
    {
        // prime1 -- Front Facing #1
        // prime2 -- Right Facing #2
        // prime3 -- Rear Facing #3
        // Prime4 -- Left Facing #4
        switch (cycleIndex)
        {
            case 0:
                if (bodyModel.boxName.contains("prime1"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 1:
                if (bodyModel.boxName.contains("prime2"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 2:
                if (bodyModel.boxName.contains("prime3"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
            case 3:
                if (bodyModel.boxName.contains("prime4"))
                {
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bodyModel.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                }
                else
                {
                    bodyModel.render(f5);
                }
            break;
        }
    }

    public static void renderModelWithStandardFreightRollingStock(ModelRendererTurbo[] bodyModel, Entity entity, float f5)
    {
        if (ClientRollingStockLighting.isActive())
        {
            renderWithLightingAdapter(bodyModel, f5);
            return;
        }
        for (ModelRendererTurbo bm : bodyModel)
        {
            switch (bm.boxName)
            {
                case "lamp":
                case "numberboard":
                case "marker":
                case "instrument":
                    Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                    bm.render(f5);
                    Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                break;
                case "cull":
                    GL11.glDisable(GL11.GL_CULL_FACE);
                    bm.render(f5);
                    GL11.glEnable(GL11.GL_CULL_FACE);
                break;
                default:
                    bm.render(f5);
                break;
            }
        }
    }

    /** Reports whether either synchronized headlight end is active. */
    private static boolean hasHeadlights(IRollingStockLightState lightState)
    {
        return lightState.getFrontHeadlightLevel() != RollingStockHeadlightLevel.OFF
               || lightState.getRearHeadlightLevel() != RollingStockHeadlightLevel.OFF;
    }

    private static byte beaconPhase(EntityRollingStock stock)
    {
        long ticks =
            stock.worldObj == null ? stock.ticksExisted : stock.worldObj.getTotalWorldTime();
        return (byte)((ticks / 5L) & 3L);
    }

    private static void renderWithLightingAdapter(ModelRendererTurbo[] bodyModel, float scale)
    {
        for (ModelRendererTurbo part : bodyModel)
        {
            if (part == null || "rotary".equals(part.boxName))
            {
                continue;
            }
            if (part.boxName != null && part.boxName.contains("cull"))
            {
                GL11.glDisable(GL11.GL_CULL_FACE);
                try
                {
                    part.render(scale);
                }
                finally
                {
                    GL11.glEnable(GL11.GL_CULL_FACE);
                }
            }
            else
            {
                part.render(scale);
            }
        }
    }

    public static void SetupDynamicBallastColour(int ballastColour)
    {
        float r = (float)(ballastColour >> 16 & 255) / 255.0F;
        float g = (float)(ballastColour >> 8 & 255) / 255.0F;
        float b = (float)(ballastColour & 255) / 255.0F;
        GL11.glColor4f(r,g,b,1);
    }

    public static String[] SetupDynamicBallast(String ballast)
    {
        // Dynamic texture identifier: [0] = resource domain, [1] = resource path.
        String[] ballastTexture = new String[2];

        if (ballast.contains(":")) {
            ballastTexture = ballast.split(":", 5);
        }
        else {
            ballastTexture[0] = "minecraft";
            ballastTexture[1] = ballast;
        }

        return ballastTexture;
    }

}
