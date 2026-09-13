package train.client.render.lighting;

/** Physical size inference shared by rolling-stock and placed geometry adapters. */
final class LightGeometryMetrics
{
    private static final float DEFAULT_SOURCE_GLOW_RADIUS = 0.10F;
    private static final float AREA_TO_RADIUS_SCALE = 1.35F;
    private static final float MINIMUM_SOURCE_GLOW_RADIUS = 0.04F;
    private static final float MAXIMUM_SOURCE_GLOW_RADIUS = 0.18F;
    private static final float SURFACE_GLOW_EXPANSION = 1.20F;

    private LightGeometryMetrics() {}

    static float sourceGlowRadius(float area)
    {
        if (Float.isNaN(area) || Float.isInfinite(area) || area <= 0)
        {
            return DEFAULT_SOURCE_GLOW_RADIUS;
        }
        float inferred = (float) Math.sqrt(area / Math.PI) * AREA_TO_RADIUS_SCALE;
        return Math.max(
            MINIMUM_SOURCE_GLOW_RADIUS, Math.min(MAXIMUM_SOURCE_GLOW_RADIUS, inferred));
    }

    static float expandedSurfaceGlowRadius(float area)
    {
        return sourceGlowRadius(area) * SURFACE_GLOW_EXPANSION;
    }
}
