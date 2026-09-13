package train.client.render.lighting;

/**
 * Java 8 backend adapter for beam dimension math.
 *
 * <p>This class deliberately contains no fixed-function compensation. The configured fixture
 * dimensions, daylight scale, and lamp-response reach are the complete authoritative inputs in both
 * renderers.
 */
final class FixedFunctionBeamGeometry
{
    /**
     * The position-color shader interpolates the source-to-edge color over the cone. Long
     * fixed-function triangles can compress that transition against the far clip-space vertex, so
     * the fixed-function backend tessellates the identical surface at this world-space precision.
     */
    static final float MAX_FADE_SEGMENT_LENGTH = 0.125F;

    static final int MAX_FADE_SEGMENTS = 64;

    private FixedFunctionBeamGeometry() {}

    static float effectiveLength(float configuredLength, float daylightScale, float fixtureReach)
    {
        return BeamVisibilityScaling.effectiveDimension(
                   configuredLength, daylightScale, fixtureReach);
    }

    static float effectiveWidth(float configuredWidth, float daylightScale, float fixtureReach)
    {
        return BeamVisibilityScaling.effectiveDimension(
                   configuredWidth, daylightScale, fixtureReach);
    }

    static float visualOpacity(float opacity)
    {
        return Math.max(0.0F, Math.min(1.0F, opacity));
    }

    static int fadeSegments(float visibleLength)
    {
        if (visibleLength <= 0.0F)
        {
            return 1;
        }
        return Math.max(
                   1,
                   Math.min(
                       MAX_FADE_SEGMENTS,
                       (int) Math.ceil(visibleLength / MAX_FADE_SEGMENT_LENGTH)));
    }

    static float fadeAt(float distanceFraction)
    {
        return 1.0F - Math.max(0.0F, Math.min(1.0F, distanceFraction));
    }
}
