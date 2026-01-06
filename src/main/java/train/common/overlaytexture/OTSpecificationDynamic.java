package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 02skaplan
 * <p>Dynamic overlays specifications contain all information for a specific dynamic overlay as part of the TC Overlay Texture system.</p>
 */
public class OTSpecificationDynamic extends OTSpecification
{
    final float fontSize;
    final float fontSpacing;
    final int maxWidth;
    final int maxHeight;
    final private OverlayFontRegistry.OverlayFont font;
    final private AlignmentMode alignmentMode;
    private String displayText = "";
    private Color foregroundColor = new Color(25, 25, 25, 255);
    private Color backgroundColor = new Color(0, 0, 0, 0);

    private final Integer characterLimit;

    public enum AlignmentMode {
        ALIGN_LEFT_AND_CLIP,
        ALIGN_CENTER_AND_FILL,
        ALIGN_RIGHT_AND_CLIP
    }

    /**
     * @author 02skaplan
     * @param overlayName Readable name for overlay. Ex: "Road Name", "Engine Number".
     * @param maxWidth Maximum width of overlay.
     * @param maxHeight Maximum height of overlay.
     * @param characterLimit Optional character limit. For default, set to null.
     * @param font Font registered in EnumOverlayFonts.
     * @param fontSize Font size.
     * @param fontSpacing Font spacing. Default is 0.0f.
     * @param alignmentMode Alignment mode dictating how the text will be drawn in the given overlay.
     * @param drawingPointsList List of points on the texture map for a given model on which to draw the overlay.
     */
    public OTSpecificationDynamic(String overlayName, int maxWidth, int maxHeight, Integer characterLimit, IOverlayFont font, float fontSize, float fontSpacing, AlignmentMode alignmentMode, Point[] drawingPointsList) {
        super(drawingPointsList, overlayName);
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.characterLimit = characterLimit;
        this.fontSize = fontSize;
        this.fontSpacing = fontSpacing;
        this.alignmentMode = alignmentMode;
        this.font = OverlayFontRegistry.getFont(font);
    }

    /**
     * @author 02skaplan
     * @param overlayName Readable name for overlay. Ex: "Road Name", "Engine Number".
     * @param maxWidth Maximum width of overlay.
     * @param maxHeight Maximum height of overlay.
     * @param characterLimit Optional character limit. For default, set to null.
     * @param font Font registered in EnumOverlayFonts.
     * @param fontSize Font size.
     * @param alignmentMode Alignment mode dictating how the text will be drawn in the given overlay.
     * @param drawingPointsList List of points on the texture map for a given model on which to draw the overlay.
     */
    public OTSpecificationDynamic(String overlayName, int maxWidth, int maxHeight, Integer characterLimit, IOverlayFont font, float fontSize, AlignmentMode alignmentMode, Point[] drawingPointsList) {
        super(drawingPointsList, overlayName);
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.characterLimit = characterLimit;
        this.fontSize = fontSize;
        this.fontSpacing = 0.0f;
        this.alignmentMode = alignmentMode;
        this.font = OverlayFontRegistry.getFont(font);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void renderOverlay() {
        Map<TextAttribute, Object> fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, fontSize);
        fontAttributes.put(TextAttribute.TRACKING, fontSpacing);
        Font renderFont = font.getFont().deriveFont(fontAttributes);
        overlayImage = new BufferedImage(maxWidth, maxHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = overlayImage.getGraphics();
        graphics.setColor(backgroundColor);
        // Draw the background color only as wide and tall as the string itself, but neither wider nor taller than the respective maximum.
        int stringWidth = (int) renderFont.getStringBounds(displayText, graphics.getFontMetrics().getFontRenderContext()).getWidth();
        int stringHeight = (int) renderFont.getStringBounds(displayText, graphics.getFontMetrics().getFontRenderContext()).getHeight();
        graphics.setColor(backgroundColor);
        graphics.setFont(renderFont);
        int drawStringAtY = (int) ((graphics.getFontMetrics().getAscent() * 0.25) + (maxHeight * 0.5));
        if (alignmentMode == AlignmentMode.ALIGN_LEFT_AND_CLIP) {
            graphics.fillRect(0, 0, Math.min(stringWidth, maxWidth), Math.min(stringHeight, maxHeight));
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, 0, drawStringAtY);
        } else if (alignmentMode == AlignmentMode.ALIGN_CENTER_AND_FILL) {
            graphics.fillRect(0, 0, maxWidth, maxHeight);
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, Math.max(0, ((maxWidth / 2) - (graphics.getFontMetrics().stringWidth(displayText)) / 2)), (int) ((graphics.getFontMetrics().getAscent() * 0.25) + (maxHeight * 0.5)));
        } else if (alignmentMode == AlignmentMode.ALIGN_RIGHT_AND_CLIP) {
            graphics.fillRect(Math.max(maxWidth - stringWidth, 0), 0, stringWidth, Math.min(stringHeight, maxHeight));
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, maxWidth - stringWidth, drawStringAtY);
        }
        graphics.dispose();
    }

    @Override
    public void getOverlayConfigTag(NBTTagCompound nbtTag) {
        nbtTag.setString("dynamicDisplayText", getDisplayText());
        nbtTag.setInteger("backgroundColorRGBA", getBackgroundColor().getRGB());
        nbtTag.setInteger("foregroundColorRGBA", getForegroundColor().getRGB());
    }

    @Override
    public void importFromConfigTag(NBTTagCompound nbtTag) {
        setDisplayText(nbtTag.getString("dynamicDisplayText"));
        setBackgroundColor(new Color(nbtTag.getInteger("backgroundColorRGBA"), true));
        setForegroundColor(new Color(nbtTag.getInteger("foregroundColorRGBA"), true));
    }

    @Override
    public OverlayTextureManager.Type getType() {
        return OverlayTextureManager.Type.DYNAMIC;
    }

    public void setDisplayText(String displayText) {
        setActive(!displayText.isEmpty());
        this.displayText = displayText;
    }
    public String getDisplayText() { return displayText; }

    @Override
    public void setActive(boolean active) {
        if (!active && !displayText.isEmpty()) // Clear the display text if we are setting the overlay to inactive.
            this.displayText = "";
        super.setActive(active);
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }
    public Color getForegroundColor() { return foregroundColor; }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Color getBackgroundColor() { return backgroundColor; }
    public Integer getCharacterLimit() { return characterLimit; }
}