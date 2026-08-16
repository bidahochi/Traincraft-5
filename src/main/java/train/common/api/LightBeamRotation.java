package train.common.api;

import java.util.Objects;

/**
 * Optional pitch and yaw applied to a beam independently of its visible source face.
 *
 * <p>Pitch rotates toward the fixture-local up direction and yaw rotates toward its right
 * direction. Negative pitch therefore aims an ordinary forward-facing locomotive light downward.
 * The source polygon, texture-alpha mask, and source glow orientation are unaffected.
 */
public final class LightBeamRotation
{
    /** Identity rotation used when neither the model nor skin specifies custom beam aim. */
    public static final LightBeamRotation NONE = new LightBeamRotation(0.0F, 0.0F);

    private final float pitchDegrees;
    private final float yawDegrees;

    /**
     * Creates a beam-only rotation in degrees.
     *
     * @param pitchDegrees positive toward fixture-local up and negative toward down
     * @param yawDegrees positive toward fixture-local right
     */
    public LightBeamRotation(float pitchDegrees, float yawDegrees)
    {
        if (isFinite(pitchDegrees) == false || isFinite(yawDegrees) == false)
        {
            throw new IllegalArgumentException("Light beam rotation must be finite");
        }
        this.pitchDegrees = pitchDegrees;
        this.yawDegrees = yawDegrees;
    }

    /** Returns vertical beam rotation in degrees. */
    public float pitchDegrees()
    {
        return pitchDegrees;
    }

    /** Returns horizontal beam rotation in degrees. */
    public float yawDegrees()
    {
        return yawDegrees;
    }

    /**
     * Applies this rotation to a reference direction.
     *
     * @return normalized forward direction after pitch and yaw
     */
    public float[] apply(float directionX, float directionY, float directionZ)
    {
        float inverseLength = inverseLength(directionX, directionY, directionZ);
        float forwardX = directionX * inverseLength;
        float forwardY = directionY * inverseLength;
        float forwardZ = directionZ * inverseLength;
        float referenceY = Math.abs(forwardY) < 0.95F ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = forwardY * referenceZ - forwardZ * referenceY;
        float rightY = -forwardX * referenceZ;
        float rightZ = forwardX * referenceY;
        float rightInverseLength = inverseLength(rightX, rightY, rightZ);
        rightX *= rightInverseLength;
        rightY *= rightInverseLength;
        rightZ *= rightInverseLength;
        float upX = rightY * forwardZ - rightZ * forwardY;
        float upY = rightZ * forwardX - rightX * forwardZ;
        float upZ = rightX * forwardY - rightY * forwardX;
        float yawRadians = (float) Math.toRadians(yawDegrees);
        float pitchRadians = (float) Math.toRadians(pitchDegrees);
        float yawCosine = (float) Math.cos(yawRadians);
        float yawSine = (float) Math.sin(yawRadians);
        float pitchCosine = (float) Math.cos(pitchRadians);
        float pitchSine = (float) Math.sin(pitchRadians);
        float yawedX = forwardX * yawCosine + rightX * yawSine;
        float yawedY = forwardY * yawCosine + rightY * yawSine;
        float yawedZ = forwardZ * yawCosine + rightZ * yawSine;
        float rotatedX = yawedX * pitchCosine + upX * pitchSine;
        float rotatedY = yawedY * pitchCosine + upY * pitchSine;
        float rotatedZ = yawedZ * pitchCosine + upZ * pitchSine;
        float rotatedInverseLength = inverseLength(rotatedX, rotatedY, rotatedZ);
        return new float[]
               {
                   rotatedX * rotatedInverseLength,
                   rotatedY * rotatedInverseLength,
                   rotatedZ * rotatedInverseLength
               };
    }

    private static float inverseLength(float x, float y, float z)
    {
        float lengthSquared = x * x + y * y + z * z;
        if (lengthSquared < 1.0E-8F)
        {
            throw new IllegalArgumentException("Light beam direction must not be zero");
        }
        return (float) (1.0D / Math.sqrt(lengthSquared));
    }

    private static boolean isFinite(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof LightBeamRotation) == false)
        {
            return false;
        }
        LightBeamRotation value = (LightBeamRotation) other;
        return Float.compare(pitchDegrees, value.pitchDegrees) == 0
               && Float.compare(yawDegrees, value.yawDegrees) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(pitchDegrees, yawDegrees);
    }
}
