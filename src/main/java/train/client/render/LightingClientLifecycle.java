package train.client.render;

import net.minecraft.world.World;

/** Coordinates client-world cleanup without invalidating reusable model metadata. */
final class LightingClientLifecycle {
    private static World activeWorld;

    private LightingClientLifecycle() {}

    static void observe(World world) {
        if (world == activeWorld) return;
        LightEffectRenderBatch.clearWorldState();
        ClientRollingStockLighting.clearWorldState();
        PlacedModelLighting.clearWorldState();
        ClientDynamicHeadlightManager.clearAll();
        ClientDynamicHeadlightRenderer.clear();
        activeWorld = world;
    }

    static void clear() {
        LightEffectRenderBatch.clearWorldState();
        ClientRollingStockLighting.clearWorldState();
        PlacedModelLighting.clearWorldState();
        ClientDynamicHeadlightManager.clearAll();
        ClientDynamicHeadlightRenderer.clear();
        activeWorld = null;
    }
}
