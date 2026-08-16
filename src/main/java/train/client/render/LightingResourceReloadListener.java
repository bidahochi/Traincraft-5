package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import tmt.ModelRendererTurboBatch;

public final class LightingResourceReloadListener implements IResourceManagerReloadListener {
    @Override
    public void onResourceManagerReload(IResourceManager manager) {
        ClientDynamicHeadlightManager.clearAll();
        ClientDynamicHeadlightRenderer.clear();
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
    }
}
