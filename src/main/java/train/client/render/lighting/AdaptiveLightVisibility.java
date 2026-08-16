package train.client.render.lighting;

/** Pure skylight response for transient effects. */
final class AdaptiveLightVisibility
{
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
              size = smoothstep(0.20F, 0.85F, value),
              alpha = smoothstep(0.35F, 0.90F, value);
        return new AdaptiveLightVisibility(
                   value, lerp(size, 1.0F, 0.15F), 1.0F - alpha, lerp(size, 0.85F, 0.25F));
    }

    static float targetDaylight(int spatialSkyLight, float temporalSkyBrightness)
    {
        return clamp(spatialSkyLight / 15.0F) * clamp(temporalSkyBrightness);
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
        float elapsed = Math.min(elapsedSeconds, 0.25F),
              blend = 1 - (float) Math.exp(-elapsed / 0.25F);
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
