package train.client.render.lighting;

/** Pure skylight response for transient effects. */
final class AdaptiveLightVisibility
{
    private static final float BEAM_SCALE_DAYLIGHT_START = 0.20F;
    private static final float BEAM_SCALE_DAYLIGHT_END = 0.85F;
    private static final float ALPHA_DAYLIGHT_START = 0.35F;
    private static final float ALPHA_DAYLIGHT_END = 0.90F;
    private static final float MINIMUM_DAYLIGHT_BEAM_SCALE = 0.15F;
    private static final float MAXIMUM_DAYLIGHT_HOTSPOT_SCALE = 0.85F;
    private static final float MINIMUM_DAYLIGHT_HOTSPOT_SCALE = 0.25F;
    private static final float MAXIMUM_SKY_LIGHT = 15.0F;
    private static final float MAXIMUM_SMOOTHING_STEP_SECONDS = 0.25F;
    private static final float SMOOTHING_TIME_CONSTANT_SECONDS = 0.25F;

    final float daylight, beamScale, beamAlpha, hotspotAlpha;

    AdaptiveLightVisibility(float daylight, float beamScale, float beamAlpha, float hotspotAlpha)
    {
        this.daylight = daylight;
        this.beamScale = beamScale;
        this.beamAlpha = beamAlpha;
        this.hotspotAlpha = hotspotAlpha;
    }

    static AdaptiveLightVisibility fromDaylight(float daylight)
    {
        float value = clamp(daylight),
              size = smoothstep(BEAM_SCALE_DAYLIGHT_START, BEAM_SCALE_DAYLIGHT_END, value),
              alpha = smoothstep(ALPHA_DAYLIGHT_START, ALPHA_DAYLIGHT_END, value);
        return new AdaptiveLightVisibility(
                   value,
                   lerp(size, 1.0F, MINIMUM_DAYLIGHT_BEAM_SCALE),
                   1.0F - alpha,
                   lerp(
                       size,
                       MAXIMUM_DAYLIGHT_HOTSPOT_SCALE,
                       MINIMUM_DAYLIGHT_HOTSPOT_SCALE));
    }

    static float targetDaylight(int spatialSkyLight, float temporalSkyBrightness)
    {
        return clamp(spatialSkyLight / MAXIMUM_SKY_LIGHT) * clamp(temporalSkyBrightness);
    }

    static float smoothDaylight(float previous, float target, float elapsedSeconds)
    {
        if (Float.isNaN(previous)
                || Float.isInfinite(previous)
                || elapsedSeconds <= 0
                || elapsedSeconds > 1)
        {
            return clamp(target);
        }
        float elapsed = Math.min(elapsedSeconds, MAXIMUM_SMOOTHING_STEP_SECONDS),
              blend = 1 - (float) Math.exp(-elapsed / SMOOTHING_TIME_CONSTANT_SECONDS);
        return lerp(blend, previous, clamp(target));
    }

    private static float smoothstep(float low, float high, float value)
    {
        float n = clamp((value - low) / (high - low));
        return n * n * (3 - 2 * n);
    }

    private static float clamp(float value)
    {
        return Math.max(0, Math.min(1, value));
    }

    private static float lerp(float amount, float low, float high)
    {
        return low + amount * (high - low);
    }
}
