package train.client.render.lighting;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import tmt.ModelRendererTurboBatch;
import train.client.render.embedded.EmbeddedTrackHostSurfaceRenderer;

/**
 * Invalidates all model-, texture-, world-, and OpenGL-dependent lighting state on resource reload.
 *
 * <p>Minecraft invokes this listener on the client render thread with a current graphics context.
 * Clearing every participating cache together prevents definitions, display lists, masks, or
 * framebuffer objects from surviving after their source resources have changed.</p>
 */
public final class LightingResourceReloadListener implements IResourceManagerReloadListener
{
    /**
     * Releases cached lighting metadata and graphics objects for a new resource generation.
     *
     * @param manager reloaded resource manager
     */
    @Override
    public void onResourceManagerReload(IResourceManager manager)
    {
        AutomaticLightSurfaceDetection.clear();
        ClientRollingStockLighting.clearCaches();
        RollingStockLightOcclusion.clearAll();
        RollingStockDepthMask.clear();
        RollingStockShadowRenderer.clear();
        TextureAlphaMaskCache.clear();
        PlacedModelLighting.clear();
        LightEffectRenderBatch.clear();
        MaxOpacityLightCompositor.clear();
        ModelRendererTurboBatch.clearLightingCaches();
        EmbeddedTrackHostSurfaceRenderer.clear();
    }
}
