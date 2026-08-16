package train.client.render.lighting;

/** Physical size inference shared by rolling-stock and placed geometry adapters. */
final class LightGeometryMetrics
{
    private LightGeometryMetrics() {}

    static float sourceGlowRadius(float area)
    {
        if (Float.isNaN(area) || Float.isInfinite(area) || area <= 0)
        {
            return 0.10F;
        }
        float inferred = (float) Math.sqrt(area / Math.PI) * 1.35F;
        return Math.max(0.04F, Math.min(0.18F, inferred));
    }

    static float expandedSurfaceGlowRadius(float area)
    {
        return sourceGlowRadius(area) * 1.20F;
    }
}
