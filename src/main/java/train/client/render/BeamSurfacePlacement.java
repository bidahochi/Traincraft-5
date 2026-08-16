package train.client.render;

/** Transient cone placement rules. */
final class BeamSurfacePlacement {
    static final float ORIGIN_OVERLAP = 0.03F;
    static final float RAY_ORIGIN_NUDGE = 0.01F;

    private BeamSurfacePlacement() {}

    static Placement place(
            float surfaceX,
            float surfaceY,
            float surfaceZ,
            float directionX,
            float directionY,
            float directionZ,
            float visibleLength) {
        return new Placement(
                surfaceX - directionX * ORIGIN_OVERLAP,
                surfaceY - directionY * ORIGIN_OVERLAP,
                surfaceZ - directionZ * ORIGIN_OVERLAP,
                visibleLength + ORIGIN_OVERLAP);
    }

    static Point rayOrigin(
            float surfaceX,
            float surfaceY,
            float surfaceZ,
            float directionX,
            float directionY,
            float directionZ) {
        return new Point(
                surfaceX + directionX * RAY_ORIGIN_NUDGE,
                surfaceY + directionY * RAY_ORIGIN_NUDGE,
                surfaceZ + directionZ * RAY_ORIGIN_NUDGE);
    }

    static final class Placement {
        private final float startX;
        private final float startY;
        private final float startZ;
        private final float length;

        Placement(float startX, float startY, float startZ, float length) {
            this.startX = startX;
            this.startY = startY;
            this.startZ = startZ;
            this.length = length;
        }

        float startX() {
            return startX;
        }

        float startY() {
            return startY;
        }

        float startZ() {
            return startZ;
        }

        float length() {
            return length;
        }
    }

    static final class Point {
        private final float x;
        private final float y;
        private final float z;

        Point(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        float x() {
            return x;
        }

        float y() {
            return y;
        }

        float z() {
            return z;
        }
    }
}
