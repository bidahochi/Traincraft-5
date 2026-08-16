package train.client.render;

final class LightGlowSubmission {
    final int ownerId;
    final int color;
    final String key;
    final float x, y, z;
    final float dx, dy, dz;
    final float rightX, rightY, rightZ;
    final float upX, upY, upZ;
    final float radius, intensity;
    final float widthScale, heightScale, rightOffset, upOffset;

    LightGlowSubmission(
            int ownerId,
            String key,
            float x,
            float y,
            float z,
            float dx,
            float dy,
            float dz,
            float radius,
            float intensity,
            float widthScale,
            float heightScale,
            float rightOffset,
            float upOffset,
            int color) {
        this(
                ownerId,
                key,
                x,
                y,
                z,
                dx,
                dy,
                dz,
                AnimatedLightDirection.basis(dx, dy, dz),
                radius,
                intensity,
                widthScale,
                heightScale,
                rightOffset,
                upOffset,
                color);
    }

    LightGlowSubmission(
            int ownerId,
            String key,
            float x,
            float y,
            float z,
            float dx,
            float dy,
            float dz,
            float[] basis,
            float radius,
            float intensity,
            float widthScale,
            float heightScale,
            float rightOffset,
            float upOffset,
            int color) {
        this.ownerId = ownerId;
        this.key = key;
        this.x = x;
        this.y = y;
        this.z = z;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rightX = basis[3];
        this.rightY = basis[4];
        this.rightZ = basis[5];
        this.upX = basis[6];
        this.upY = basis[7];
        this.upZ = basis[8];
        this.radius = radius;
        this.intensity = intensity;
        this.widthScale = widthScale;
        this.heightScale = heightScale;
        this.rightOffset = rightOffset;
        this.upOffset = upOffset;
        this.color = color;
    }
}
