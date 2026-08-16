package train.client.render.lighting;

/** Per-owner smoothing state for the quarter-second sky response. */
final class AdaptiveLightTracker
{
    private float daylight = Float.NaN;
    private long sampledAt;

    AdaptiveLightVisibility sample(int spatialSky, float temporalSky, long now)
    {
        float elapsed = sampledAt == 0 ? 0 : (now - sampledAt) / 1.0E9F;
        sampledAt = now;
        daylight =
            AdaptiveLightVisibility.smoothDaylight(
                daylight,
                AdaptiveLightVisibility.targetDaylight(spatialSky, temporalSky),
                elapsed);
        return AdaptiveLightVisibility.fromDaylight(daylight);
    }
}
