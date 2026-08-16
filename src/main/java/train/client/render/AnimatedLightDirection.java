package train.client.render;

import train.common.api.RollingStockLightFunction;

/** Fixture-local moving-optic math. */
final class AnimatedLightDirection {
    private AnimatedLightDirection() {}

    static float[] sample(
            float directionX,
            float directionY,
            float directionZ,
            RollingStockLightFunction function,
            double timeTicks) {
        float[] basis = basis(directionX, directionY, directionZ);
        if (function.pattern() != RollingStockLightFunction.Pattern.GYRALITE
                && function.pattern() != RollingStockLightFunction.Pattern.MARS) {
            return new float[] {basis[0], basis[1], basis[2]};
        }
        double theta = timeTicks / function.cycleTicks() * Math.PI * 2.0D;
        float horizontal = (float) Math.sin(theta) * function.horizontalSweepDegrees();
        float vertical =
                function.pattern() == RollingStockLightFunction.Pattern.MARS
                        ? (float) Math.sin(theta * 2.0D) * function.verticalSweepDegrees()
                        : (float) Math.cos(theta) * function.verticalSweepDegrees();
        float x =
                basis[0]
                        + basis[3] * (float) Math.tan(Math.toRadians(horizontal))
                        + basis[6] * (float) Math.tan(Math.toRadians(vertical));
        float y =
                basis[1]
                        + basis[4] * (float) Math.tan(Math.toRadians(horizontal))
                        + basis[7] * (float) Math.tan(Math.toRadians(vertical));
        float z =
                basis[2]
                        + basis[5] * (float) Math.tan(Math.toRadians(horizontal))
                        + basis[8] * (float) Math.tan(Math.toRadians(vertical));
        float inverse = inverseLength(x, y, z);
        return new float[] {x * inverse, y * inverse, z * inverse};
    }

    static float inverseLength(float x, float y, float z) {
        return (float) (1.0D / Math.sqrt(x * x + y * y + z * z));
    }

    static float viewerGlowScale(
            float eyeX,
            float eyeY,
            float eyeZ,
            float eyeDirectionX,
            float eyeDirectionY,
            float eyeDirectionZ) {
        float lengthSquared = eyeX * eyeX + eyeY * eyeY + eyeZ * eyeZ;
        if (lengthSquared <= 1.0E-8F) return 1.0F;
        float inverse = (float) (1.0D / Math.sqrt(lengthSquared));
        float alignment =
                Math.max(
                        0.0F,
                        eyeDirectionX * (-eyeX * inverse)
                                + eyeDirectionY * (-eyeY * inverse)
                                + eyeDirectionZ * (-eyeZ * inverse));
        float t = Math.max(0.0F, Math.min(1.0F, (alignment - 0.92F) / 0.075F));
        float smooth = t * t * (3.0F - 2.0F * t);
        return 0.35F + 0.65F * smooth;
    }

    static float viewerSurfaceGlowScale(
            float eyeX,
            float eyeY,
            float eyeZ,
            float eyeNormalX,
            float eyeNormalY,
            float eyeNormalZ) {
        float lengthSquared = eyeX * eyeX + eyeY * eyeY + eyeZ * eyeZ;
        if (lengthSquared <= 1.0E-8F) return 1.0F;
        float inverse = (float) (1.0D / Math.sqrt(lengthSquared));
        float alignment =
                Math.max(
                        0.0F,
                        eyeNormalX * (-eyeX * inverse)
                                + eyeNormalY * (-eyeY * inverse)
                                + eyeNormalZ * (-eyeZ * inverse));
        float t = Math.max(0.0F, Math.min(1.0F, alignment / 0.15F));
        return t * t * (3.0F - 2.0F * t);
    }

    static float[] basis(float directionX, float directionY, float directionZ) {
        float inverse = inverseLength(directionX, directionY, directionZ);
        float dx = directionX * inverse;
        float dy = directionY * inverse;
        float dz = directionZ * inverse;
        float referenceY = Math.abs(dy) < 0.95F ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = dy * referenceZ - dz * referenceY;
        float rightY = -dx * referenceZ;
        float rightZ = dx * referenceY;
        float rightInverse = inverseLength(rightX, rightY, rightZ);
        rightX *= rightInverse;
        rightY *= rightInverse;
        rightZ *= rightInverse;
        float upX = rightY * dz - rightZ * dy;
        float upY = rightZ * dx - rightX * dz;
        float upZ = rightX * dy - rightY * dx;
        return new float[] {
            dx, dy, dz,
            rightX, rightY, rightZ,
            upX, upY, upZ
        };
    }
}
