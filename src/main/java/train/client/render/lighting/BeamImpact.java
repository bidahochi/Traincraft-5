package train.client.render.lighting;

/**
 * Immutable frame-local endpoint where a projected beam meets an accepted terminating block or
 * rolling-stock surface.
 */
final class BeamImpact
{
    /** Physical surface category used to select hotspot and shadow behavior. */
    enum Target
    {
        /** Opaque world block accepted by the existing hotspot exclusion rules. */
        BLOCK,
        /** Exact triangle belonging to rolling stock other than the emitting owner. */
        ROLLING_STOCK
    }

    final Target target;
    final float distance;
    final float pointX, pointY, pointZ;
    final float normalX, normalY, normalZ;
    final int targetOwnerId;

    BeamImpact(
        Target target, float distance,
        float pointX, float pointY, float pointZ,
        float normalX, float normalY, float normalZ)
    {
        this(
            target, distance,
            pointX, pointY, pointZ,
            normalX, normalY, normalZ,
            Integer.MIN_VALUE);
    }

    BeamImpact(
        Target target, float distance,
        float pointX, float pointY, float pointZ,
        float normalX, float normalY, float normalZ,
        int targetOwnerId)
    {
        this.target = target;
        this.distance = distance;
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
        this.normalX = normalX;
        this.normalY = normalY;
        this.normalZ = normalZ;
        this.targetOwnerId = targetOwnerId;
    }

    /** Returns the same geometric hit associated with its rolling-stock entity owner. */
    BeamImpact withRollingStockOwner(int ownerId)
    {
        return new BeamImpact(
            target, distance,
            pointX, pointY, pointZ,
            normalX, normalY, normalZ,
            ownerId);
    }

    /** Returns the nearer non-null impact, preferring {@code first} when distances tie. */
    static BeamImpact nearest(BeamImpact first, BeamImpact second)
    {
        if (first == null)
        {
            return second;
        }
        if (second == null)
        {
            return first;
        }
        return first.distance <= second.distance ? first : second;
    }
}
