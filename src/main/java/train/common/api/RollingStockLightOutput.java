package train.common.api;

/** Immutable resolved visual output for one fixture at one instant. */
public final class RollingStockLightOutput
{
    /** Shared inactive result used when neither the fixture nor its projection should render. */
    public static final RollingStockLightOutput OFF = new RollingStockLightOutput(0.0F, 0.0F);

    private final float sourceIntensity;
    private final float projectedIntensity;

    /**
     * Creates a resolved output, clamping both intensities to the normalized range.
     *
     * @param sourceIntensity emissive lens or illuminated-surface intensity
     * @param projectedIntensity cone and hotspot intensity
     */
    public RollingStockLightOutput(float sourceIntensity, float projectedIntensity)
    {
        this.sourceIntensity = clamp(sourceIntensity);
        this.projectedIntensity = clamp(projectedIntensity);
    }

    /** @return normalized emissive lens or illuminated-surface intensity */
    public float sourceIntensity()
    {
        return sourceIntensity;
    }

    /** @return normalized cone and hotspot intensity */
    public float projectedIntensity()
    {
        return projectedIntensity;
    }

    /** @return whether either source emission or projected effects should render */
    public boolean active()
    {
        return sourceIntensity > 0 || projectedIntensity > 0;
    }

    /** Clamps a resolved intensity to the normalized rendering range. */
    private static float clamp(float value)
    {
        return Float.isNaN(value) || Float.isInfinite(value)
               ? 0.0F
               : Math.max(0.0F, Math.min(1.0F, value));
    }
}
