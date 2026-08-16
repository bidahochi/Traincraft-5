package train.client.render;

/** Pure attenuation math shared by the dynamic-headlight shader and tests. */
final class DynamicHeadlightMath {
    static final float BRIGHT_RADIUS = 5.0F;
    static final float BRIGHT_LEVEL = 14.0F;
    static final float MAXIMUM_STRENGTH = 0.45F;

    private DynamicHeadlightMath() {}

    static float brightness(float lightLevel) {
        float level = clamp(lightLevel, 0.0F, 15.0F);
        float darkness = 1.0F - level / 15.0F;
        return (1.0F - darkness) / (darkness * 3.0F + 1.0F);
    }

    static float radius(float sourceLevel) {
        return Math.max(0.0F, sourceLevel) * BRIGHT_RADIUS / BRIGHT_LEVEL;
    }

    static float radius(float configuredLength, float daylightScale, float fixtureReach) {
        return Math.max(0.0F, configuredLength)
                * Math.max(0.0F, daylightScale)
                * Math.max(0.0F, fixtureReach);
    }

    static float sourceForwardOffset(
            float configuredLength, float daylightScale, float fixtureReach) {
        return Math.min(
                2.5F,
                radius(configuredLength, daylightScale, fixtureReach) * 0.5F);
    }

    static float influence(float sourceLevel, float distance, float daylight) {
        return influence(sourceLevel, distance, daylight, 1.0F);
    }

    static float influence(
            float sourceLevel,
            float distance,
            float daylight,
            float directionDot) {
        float sourceRadius = radius(sourceLevel);
        if (sourceRadius <= 0.0F || distance >= sourceRadius) {
            return 0.0F;
        }
        float falloff = 1.0F - clamp(distance / sourceRadius, 0.0F, 1.0F);
        falloff *= falloff;
        float directional = smoothstep(0.0F, 0.35F, directionDot);
        return brightness(sourceLevel)
                * falloff
                * directional
                * MAXIMUM_STRENGTH
                * (1.0F - clamp(daylight, 0.0F, 1.0F));
    }

    static float stockSurfaceInfluence(float influence) {
        float value = clamp(influence, 0.0F, 1.0F);
        return value * value;
    }

    static float distanceToForwardSegment(
            float offsetX,
            float offsetY,
            float offsetZ,
            float directionX,
            float directionY,
            float directionZ,
            float forwardReach) {
        float along = clamp(
                offsetX * directionX + offsetY * directionY + offsetZ * directionZ,
                0.0F,
                Math.max(0.0F, forwardReach));
        float x = offsetX - directionX * along;
        float y = offsetY - directionY * along;
        float z = offsetZ - directionZ * along;
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    static float union(float first, float second) {
        float a = clamp(first, 0.0F, 1.0F);
        float b = clamp(second, 0.0F, 1.0F);
        return a + b * (1.0F - a);
    }

    private static float smoothstep(float minimum, float maximum, float value) {
        float amount = clamp((value - minimum) / (maximum - minimum), 0.0F, 1.0F);
        return amount * amount * (3.0F - 2.0F * amount);
    }

    private static float clamp(float value, float minimum, float maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }
}
