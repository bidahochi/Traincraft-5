package train.client.render.lighting;

import train.common.api.RollingStockLightFunction;

/** Fixture-local moving-optic math. */
final class AnimatedLightDirection
{
    private static final float MINIMUM_VIEW_VECTOR_LENGTH_SQUARED = 1.0E-8F;
    private static final float SOURCE_GLOW_ALIGNMENT_START = 0.92F;
    private static final float SOURCE_GLOW_ALIGNMENT_RANGE = 0.075F;
    private static final float MINIMUM_SOURCE_GLOW_SCALE = 0.35F;
    private static final float SOURCE_GLOW_SCALE_RANGE = 0.65F;
    private static final float SURFACE_GLOW_ALIGNMENT_RANGE = 0.15F;
    private static final float REFERENCE_AXIS_PARALLEL_THRESHOLD = 0.95F;

    private AnimatedLightDirection() {}

    static float[] sample(
        float directionX,
        float directionY,
        float directionZ,
        RollingStockLightFunction function,
        double timeTicks)
    {
        float[] basis = basis(directionX, directionY, directionZ);
        if (function.pattern() != RollingStockLightFunction.Pattern.GYRALITE
                && function.pattern() != RollingStockLightFunction.Pattern.MARS)
        {
            return new float[] {basis[0], basis[1], basis[2]};
        }
        double cycleAngleRadians = timeTicks / function.cycleTicks() * Math.PI * 2.0D;
        float horizontalSweepDegrees =
            (float) Math.sin(cycleAngleRadians) * function.horizontalSweepDegrees();
        float verticalSweepDegrees =
            function.pattern() == RollingStockLightFunction.Pattern.MARS
            ? (float) Math.sin(cycleAngleRadians * 2.0D) * function.verticalSweepDegrees()
            : (float) Math.cos(cycleAngleRadians) * function.verticalSweepDegrees();
        float sampledDirectionX =
            basis[0]
            + basis[3] * (float) Math.tan(Math.toRadians(horizontalSweepDegrees))
            + basis[6] * (float) Math.tan(Math.toRadians(verticalSweepDegrees));
        float sampledDirectionY =
            basis[1]
            + basis[4] * (float) Math.tan(Math.toRadians(horizontalSweepDegrees))
            + basis[7] * (float) Math.tan(Math.toRadians(verticalSweepDegrees));
        float sampledDirectionZ =
            basis[2]
            + basis[5] * (float) Math.tan(Math.toRadians(horizontalSweepDegrees))
            + basis[8] * (float) Math.tan(Math.toRadians(verticalSweepDegrees));
        float inverseLength =
            inverseLength(sampledDirectionX, sampledDirectionY, sampledDirectionZ);
        return new float[]
               {
                   sampledDirectionX * inverseLength,
                   sampledDirectionY * inverseLength,
                   sampledDirectionZ * inverseLength
               };
    }

    static float inverseLength(float x, float y, float z)
    {
        return (float)(1.0D / Math.sqrt(x * x + y * y + z * z));
    }

    static float viewerGlowScale(
        float eyeX,
        float eyeY,
        float eyeZ,
        float eyeDirectionX,
        float eyeDirectionY,
        float eyeDirectionZ)
    {
        float lengthSquared = eyeX * eyeX + eyeY * eyeY + eyeZ * eyeZ;
        if (lengthSquared <= MINIMUM_VIEW_VECTOR_LENGTH_SQUARED)
        {
            return 1.0F;
        }
        float inverseViewLength = (float)(1.0D / Math.sqrt(lengthSquared));
        float alignment =
            Math.max(
                0.0F,
                eyeDirectionX * (-eyeX * inverseViewLength)
                + eyeDirectionY * (-eyeY * inverseViewLength)
                + eyeDirectionZ * (-eyeZ * inverseViewLength));
        float interpolationFactor = Math.max(
            0.0F,
            Math.min(
                1.0F,
                (alignment - SOURCE_GLOW_ALIGNMENT_START) / SOURCE_GLOW_ALIGNMENT_RANGE));
        float smoothInterpolation =
            interpolationFactor
            * interpolationFactor
            * (3.0F - 2.0F * interpolationFactor);
        return MINIMUM_SOURCE_GLOW_SCALE + SOURCE_GLOW_SCALE_RANGE * smoothInterpolation;
    }

    static float viewerSurfaceGlowScale(
        float eyeX,
        float eyeY,
        float eyeZ,
        float eyeNormalX,
        float eyeNormalY,
        float eyeNormalZ)
    {
        float lengthSquared = eyeX * eyeX + eyeY * eyeY + eyeZ * eyeZ;
        if (lengthSquared <= MINIMUM_VIEW_VECTOR_LENGTH_SQUARED)
        {
            return 1.0F;
        }
        float inverseViewLength = (float)(1.0D / Math.sqrt(lengthSquared));
        float alignment =
            Math.max(
                0.0F,
                eyeNormalX * (-eyeX * inverseViewLength)
                + eyeNormalY * (-eyeY * inverseViewLength)
                + eyeNormalZ * (-eyeZ * inverseViewLength));
        float interpolationFactor = Math.max(
            0.0F, Math.min(1.0F, alignment / SURFACE_GLOW_ALIGNMENT_RANGE));
        return interpolationFactor
               * interpolationFactor
               * (3.0F - 2.0F * interpolationFactor);
    }

    static float[] basis(float directionX, float directionY, float directionZ)
    {
        float inverseDirectionLength = inverseLength(directionX, directionY, directionZ);
        float normalizedDirectionX = directionX * inverseDirectionLength;
        float normalizedDirectionY = directionY * inverseDirectionLength;
        float normalizedDirectionZ = directionZ * inverseDirectionLength;
        float referenceY =
            Math.abs(normalizedDirectionY) < REFERENCE_AXIS_PARALLEL_THRESHOLD ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = normalizedDirectionY * referenceZ - normalizedDirectionZ * referenceY;
        float rightY = -normalizedDirectionX * referenceZ;
        float rightZ = normalizedDirectionX * referenceY;
        float rightInverse = inverseLength(rightX, rightY, rightZ);
        rightX *= rightInverse;
        rightY *= rightInverse;
        rightZ *= rightInverse;
        float upX = rightY * normalizedDirectionZ - rightZ * normalizedDirectionY;
        float upY = rightZ * normalizedDirectionX - rightX * normalizedDirectionZ;
        float upZ = rightX * normalizedDirectionY - rightY * normalizedDirectionX;
        return new float[]
               {
                   normalizedDirectionX, normalizedDirectionY, normalizedDirectionZ,
                   rightX, rightY, rightZ,
                   upX, upY, upZ
               };
    }
}
