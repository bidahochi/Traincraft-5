package train.client.gui.locomotive;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import org.lwjgl.opengl.GL11;
import train.client.gui.AbstractGuiLocomotive;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.inventory.InventoryLiquidFiredLocomotive;
import train.common.library.Info;

import java.util.Collections;

public class GuiLiquidFiredSteamLocomotive extends AbstractGuiLocomotive {
    private static final ResourceLocation FUEL_OVERLAY =
            new ResourceLocation(Info.modID, "textures/gui/fuel_overlay.png");

    private final SteamTrain liquidSteam;

    public GuiLiquidFiredSteamLocomotive(
            InventoryPlayer inventoryplayer,
            SteamTrain locomotive
    )
    {
        super(new InventoryLiquidFiredLocomotive(inventoryplayer, locomotive), locomotive);
        this.liquidSteam = locomotive;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);

        int left = (width - xSize) / 2;
        int top = (height - ySize) / 2;

        if (mouseX > left + 33 && mouseX < left + 51
                && mouseY > top + 18 && mouseY < top + 68) {
            int amount = liquidSteam.getSecondaryTankAmount();
            int capacity = liquidSteam.getSecondaryTankCapacity();
            Fluid fluid = getSecondaryFluid();
            String text = amount > 0 && fluid != null
                    ? fluid.getLocalizedName(new FluidStack(fluid, amount))
                            + " " + amount + "mb / " + capacity + "mb"
                    : "Fuel: 0mb / " + capacity + "mb";

            drawHoveringText(Collections.singletonList(text), mouseX, mouseY, fontRendererObj);
        }
    }

    @Override
    protected String getGuiTexture() {
        return Info.guiPrefix + "gui_loco_liquidfiredsteam.png";
    }

    @Override
    protected void drawLocomotiveContents(int left, int top, String guiTexture) {
        if (loco.getIsFuelled()) {
            int fuel = loco.getFuelDiv(12);
            drawTexturedModalRect(left + 8, (top + 30) - fuel, 176, 12 - fuel, 14, fuel + 2);
        }

        int waterAmount = liquidSteam.getWaterAmount();
        int waterCapacity = liquidSteam.getCartTankCapacity();
        int waterHeight = waterCapacity > 0 ? Math.abs((waterAmount * 50) / waterCapacity) : 0;

        if (liquidSteam.getLiquidItemID() == LiquidManager.WATER_FILTER.getFluidID()) {
            drawTexturedModalRect(left + 143, (top + 68) - waterHeight, 190, 69 - waterHeight, 18, waterHeight + 1);
        }

        int fuelCapacity = liquidSteam.getSecondaryTankCapacity();
        int fuelHeight = fuelCapacity > 0
                ? Math.abs((liquidSteam.getSecondaryTankAmount() * 50) / fuelCapacity)
                : 0;

        if (fuelHeight <= 0) {
            return;
        }

        Fluid fluid = getSecondaryFluid();

        drawFluidBar(fluid, left + 33, ((top + 67) - fuelHeight) + 2, 18, fuelHeight);

        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, guiTexture));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        drawTexturedModalRect(left + 43, top + 17, 210, 0, 18, 50);

        mc.renderEngine.bindTexture(FUEL_OVERLAY);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        drawTextureExactSize(left + 33, top + 18, 18, 52);
        GL11.glDisable(GL11.GL_BLEND);
    }

    private void drawFluidBar(Fluid fluid, int x, int y, int width, int height) {
        if (fluid == null || height <= 0 || width <= 0 || fluid.getStillIcon() == null) {
            return;
        }

        IIcon icon = fluid.getStillIcon();
        mc.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        for (int remainingHeight = height, drawY = y + height; remainingHeight > 0;) {
            int tileHeight = Math.min(16, remainingHeight);
            drawY -= tileHeight;

            for (int remainingWidth = width, drawX = x; remainingWidth > 0;) {
                int tileWidth = Math.min(16, remainingWidth);
                drawFluidIcon(drawX, drawY, icon, tileWidth, tileHeight);
                drawX += tileWidth;
                remainingWidth -= tileWidth;
            }

            remainingHeight -= tileHeight;
        }
    }

    private void drawFluidIcon(int x, int y, IIcon icon, int width, int height) {
        double minU = icon.getMinU();
        double minV = icon.getMinV();
        double maxU = minU + ((icon.getMaxU() - minU) * width / 16.0D);
        double maxV = minV + ((icon.getMaxV() - minV) * height / 16.0D);
        Tessellator tessellator = Tessellator.instance;

        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x, y + height, zLevel, minU, maxV);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, maxU, maxV);
        tessellator.addVertexWithUV(x + width, y, zLevel, maxU, minV);
        tessellator.addVertexWithUV(x, y, zLevel, minU, minV);
        tessellator.draw();
    }

    private Fluid getSecondaryFluid() {
        Fluid fluid = FluidRegistry.getFluid(liquidSteam.getSecondaryLiquidName());

        if (fluid == null) {
            fluid = FluidRegistry.getFluid(liquidSteam.getSecondaryLiquidId());
        }

        return fluid;
    }

    private void drawTextureExactSize(int x, int y, int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x, y + height, zLevel, 0.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y + height, zLevel, 1.0D, 1.0D);
        tessellator.addVertexWithUV(x + width, y, zLevel, 1.0D, 0.0D);
        tessellator.addVertexWithUV(x, y, zLevel, 0.0D, 0.0D);
        tessellator.draw();
    }
}
