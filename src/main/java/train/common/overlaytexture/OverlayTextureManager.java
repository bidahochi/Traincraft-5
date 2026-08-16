package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import train.client.render.RenderRollingStock;
import train.client.render.lighting.TextureAlphaMaskCache;
import train.common.api.AbstractTrains;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 02skaplan
 * <p>Overlay texture manager class for the overlay texture system.</p>
 * <p>Contains configuration and render utilities.</p>
 */
public class OverlayTextureManager {

    public enum Type {
        DYNAMIC,
        FIXED
    }

    public OverlayTextureManager(AbstractTrains rollingStock) {
        this.rollingStock = rollingStock;
    }
    public boolean markedForUpdate = false;
    private final AbstractTrains rollingStock;
    private final ArrayList<OTSpecification> overlays = new ArrayList<>();
    private boolean hasActiveOverlays = false;
    @SideOnly(Side.CLIENT)
    private BufferedImage overlaidTexture;
    @SideOnly(Side.CLIENT)
    private ResourceLocation overlaidTextureResource;

    public void markForUpdate() {
        markedForUpdate = true;
    }

    /**
     * @author 02skaplan
     * <p>Renders overlay of given type onto base texture of RollingStock.</p>
     */
    @SideOnly(Side.CLIENT)
    public void renderTexture() {
        ArrayList<OTSpecification> renderList = new ArrayList<>();

        // Render each active overlay and add it to the drawing queue.
        for (OTSpecification overlaySpecification : overlays) {
            if (overlaySpecification.isActive()) {
                overlaySpecification.renderOverlay();
                renderList.add(overlaySpecification);
            }
        }

        // Take the rendered overlay(s) and draw them on top of the base texture.
        try {
            BufferedImage baseTexture = ImageIO.read(Minecraft.getMinecraft().getResourceManager().getResource(RenderRollingStock.getTexture(rollingStock)).getInputStream());
            overlaidTexture = new BufferedImage(baseTexture.getWidth(), baseTexture.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics graphics = overlaidTexture.getGraphics();
            graphics.drawImage(baseTexture, 0, 0, null);

            for (OTSpecification overlaySpecification : renderList) {
                for (Point point : overlaySpecification.getDrawingPointsList()) {
                    graphics.drawImage(overlaySpecification.getOverlayImage(), point.x, point.y, null);
                }
            }

            graphics.dispose();

            // Assign the new texture to a ResourceLocation as a DynamicTexture, so it can be accessed by RenderRollingStock when rendering the model.
            overlaidTextureResource = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("", new DynamicTexture(overlaidTexture));
            TextureAlphaMaskCache.register(overlaidTextureResource, overlaidTexture);
            markedForUpdate = false;
        } catch (IOException ignored) {
            System.out.println("[TC] Overlay application onto base texture failed.");
        }
    }

    /**
     * <p>Setup and configure fixed overlays.</p>
     * @author 02skaplan
     * <p>Add a new fixed overlay to a specific model.</p>
     * <p>Can only be called once per model.</p>
     */
    public OTSpecification initOverlaySpecification(OTSpecification overlaySpecification) {
        overlays.add(overlaySpecification);
        return overlaySpecification;
    }


    @SideOnly(Side.CLIENT)


    public ResourceLocation getOverlaidTextureResource() {
        // A resource reload clears the bounded mask cache without recreating
        // existing DynamicTextures, so ensure the live image is registered on
        // every retrieval. Registration is a cheap cache hit after the first.
        TextureAlphaMaskCache.register(overlaidTextureResource, overlaidTexture);
        return overlaidTextureResource;
    }

    public ArrayList<OTSpecification> getAllOverlays() { return overlays; }


    /**
     * @author 02skaplan
     * <p>Retrieve the overlay configuration as an NBTTagCompound.</p>
     * @return NBTTagCompound containing overlay information.
     */
    public NBTTagCompound getOverlayConfigTag() {
        NBTTagCompound nbtTagOverlayConfig = new NBTTagCompound();
        if (!overlays.isEmpty()) {
            NBTTagList overlaysTagList = new NBTTagList();
            NBTTagCompound overlayTag;
            boolean active;
            for (int i = 0; i < overlays.size(); i++) {
                overlayTag = new NBTTagCompound();
                overlayTag.setInteger("ordinal", i);
                overlayTag.setInteger("typeOrdinal", overlays.get(i).getType().ordinal());
                active = overlays.get(i).isActive();
                overlayTag.setBoolean("active", active);
                if (active) {
                    hasActiveOverlays = true;
                    overlays.get(i).getOverlayConfigTag(overlayTag);
                }
                overlaysTagList.appendTag(overlayTag);
            }

            nbtTagOverlayConfig.setTag("overlays", overlaysTagList);
        }
        return nbtTagOverlayConfig;
    }

    /**
     * @author 02skaplan
     * <p>Import overlay configuration from NBTTagCompound containing overlay information.</p>
     * @param nbtTagOverlayConfig NBTTagCompound containing overlay information.
     */
    public void importFromConfigTag(NBTTagCompound nbtTagOverlayConfig) {
            if (nbtTagOverlayConfig.hasKey("overlays")) // Import overlays from tag list.
        {
                NBTTagList overlaysList = nbtTagOverlayConfig.getTagList("overlays", 10); // No idea what the "10" int is for. It doesn't work without it, though!
                NBTTagCompound tag;
                for (int i = 0; i < overlaysList.tagCount(); i++) {
                    hasActiveOverlays = true;
                    tag = overlaysList.getCompoundTagAt(i);
                    int ordinal = tag.getInteger("ordinal");
                    if (ordinal >= 0 && ordinal < overlays.size()) {
                        /* First, let us perform a sanity check that the type stored in the NBT and the type stored in
                        the list are the same. If not, they may have been updated and may now be screwed up.
                         */
                        Type type = Type.values()[tag.getInteger("typeOrdinal")];
                        OTSpecification specification = overlays.get(ordinal);
                        if (type == specification.getType()) {
                            // Now that things *should* be in sync, let's import the data.
                            specification.importFromConfigTag(tag);
                        }
                    }
                }
                this.markForUpdate();
            }
        }

    /**
     * @author 02skaplan
     */
    public ArrayList<OTSpecification> getAcceptedOverlaysForTexture(int textureIndex) {
        ArrayList<OTSpecification> acceptedOverlays = new ArrayList<>();
        for (OTSpecification overlay : overlays) {
            if (overlay.canBeAppliedTo(textureIndex))
            {
                acceptedOverlays.add(overlay);
        }
        }
        return acceptedOverlays;
    }

    public boolean hasActiveOverlays() {
        return hasActiveOverlays;
    }
}
