package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>An abstract parent class of different types of overlay specifications.</p>
 * @author 02skaplan
 */
public abstract class OTSpecification {

    public enum Restriction {
        BLACKLIST,
        WHITELIST
    }

    protected OTSpecification(Point[] drawingPointsList, String overlayName) {
        this.drawingPointsList = drawingPointsList;
        this.overlayName = overlayName;
        restriction = null;
        restrictedTextures = null;
    }

    @SideOnly(Side.CLIENT)
    protected BufferedImage overlayImage;
    @SideOnly(Side.CLIENT)
    public BufferedImage getOverlayImage() { return overlayImage; }
    @SideOnly(Side.CLIENT)
    abstract void renderOverlay();

    protected Restriction restriction;
    protected Set<Integer> restrictedTextures;
    private final Point[] drawingPointsList;
    private boolean isActive;
    private final String overlayName;
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    public Point[] getDrawingPointsList() {
        return drawingPointsList;
    }
    public String getOverlayName() {
        return overlayName;
    }


    public abstract void getOverlayConfigTag(NBTTagCompound nbtTag);
    public abstract void importFromConfigTag(NBTTagCompound nbtTag);
    public abstract OverlayTextureManager.Type getType();

    /**
     * @author 02skaplan
     * <p>Sets a restriction on what textures this overlay can be used.</p>>
     * @param restriction Restriction type, either a blacklist or a whitelist.
     * @param restrictedTextures Indices of textures to be considered for the restriction.
     */
    public void setRestriction(Restriction restriction, Set<Integer> restrictedTextures) {
        this.restriction = restriction;
        if (this.restrictedTextures != null)
            this.restrictedTextures.clear();
        else
            this.restrictedTextures = new TreeSet<>();
        this.restrictedTextures.addAll(restrictedTextures);
    }

    /**
     * @author 02skaplan
     * <p>Determines whether this overlay can be applied to a given texture index.</p>
     * @param textureIndex The texture index we are testing.
     * @return True if the overlay can be applied to the given texture index; else, false.
     */
    public boolean canBeAppliedTo(int textureIndex) {
        if ((restriction != null) && (restrictedTextures != null)) {
            if (restriction == Restriction.WHITELIST) {
                return restrictedTextures.contains(textureIndex);
            } else {
                return !restrictedTextures.contains(textureIndex);
            }
        } else {
            return true;
        }
    }

}