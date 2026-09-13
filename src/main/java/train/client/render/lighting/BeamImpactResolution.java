package train.client.render.lighting;

/**
 * Exact center-path impact plus a conservative foreign-stock boundary for fallback rendering.
 *
 * <p>The shader path may preserve unobstructed cone edges using model-geometry shadows. The
 * fixed-function path cannot, so it additionally truncates at the first expanded stock bound.
 */
final class BeamImpactResolution
{
    private static final float MINIMUM_NOMINAL_LENGTH = 1.0E-5F;

    static final BeamImpactResolution NONE =
        new BeamImpactResolution(null, Float.POSITIVE_INFINITY);

    final BeamImpact impact;
    final float conservativeStockDistance;

    BeamImpactResolution(BeamImpact impact, float conservativeStockDistance)
    {
        this.impact = impact;
        this.conservativeStockDistance = conservativeStockDistance;
    }

    /**
     * Resolves rendered cone length while preserving the original nominal falloff domain.
     *
     * @param nominalLength unobstructed visible beam length
     * @param shaderPath whether partial overlap can be handled by light-space shadowing
     * @return non-negative length for the selected renderer
     */
    float visibleLength(float nominalLength, boolean shaderPath)
    {
        float visibleLength = nominalLength;
        if (impact != null)
        {
            visibleLength = Math.min(
                visibleLength,
                impact.distance + BeamSurfacePlacement.RAY_ORIGIN_NUDGE);
        }
        if (shaderPath == false && conservativeStockDistance < Float.POSITIVE_INFINITY)
        {
            visibleLength = Math.min(
                visibleLength,
                conservativeStockDistance + BeamSurfacePlacement.RAY_ORIGIN_NUDGE);
        }
        return Math.max(0.0F, visibleLength);
    }

    /**
     * Maps a truncated cone fraction back into the original beam's falloff distance.
     *
     * @param nominalLength unobstructed beam length
     * @param resolvedLength truncated beam length
     * @param localFraction normalized position along the truncated geometry
     * @return normalized position in the original falloff domain
     */
    static float originalDistanceFraction(
        float nominalLength, float resolvedLength, float localFraction)
    {
        if (nominalLength <= MINIMUM_NOMINAL_LENGTH)
        {
            return 0.0F;
        }
        return Math.max(
            0.0F,
            Math.min(1.0F, localFraction * resolvedLength / nominalLength));
    }

}
