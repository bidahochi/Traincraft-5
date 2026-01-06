package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import train.common.Traincraft;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class OverlayFontRegistry {

    public static class OverlayFont {
        public final String resourceDomain;
        public final String fileName;
        private OverlayFont(String resourceDomain, String fileName) {
            this.resourceDomain = resourceDomain;
            this.fileName = fileName;
        }
        @SideOnly(Side.CLIENT)
        public Font getFont() {
            Font font;
            try {
                font = Font.createFont(Font.TRUETYPE_FONT, Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(resourceDomain, "textures/overlayfonts/" + fileName)).getInputStream());
            } catch (IOException | FontFormatException ioException) {
                Traincraft.tcLog.error("[TC] Dynamic Texture Font Loading Failed");
                font = Font.getFont(Font.SANS_SERIF);
            }
            return font;
        }
    }

    private static final HashMap<IOverlayFont, OverlayFont> fontMap = new HashMap<>();
    public static void registerFont(IOverlayFont font) {
        if (!fontMap.containsKey(font))
            fontMap.put(font, new OverlayFont(font.getResourceDomain(), font.getFileName()));
        else
            throw new IllegalArgumentException("Failed to register font: the font " + font.getName() + " is already in the font registry!");
    }
    public static OverlayFontRegistry.OverlayFont getFont(IOverlayFont font) {
        if (fontMap.containsKey(font))
            return fontMap.get(font);
        else
            throw new IllegalArgumentException("Failed to load font: the font " + font.getName() + " is not in the font registry!");
    }

}