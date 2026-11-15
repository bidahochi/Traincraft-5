package train.common.seats;

import org.apache.logging.log4j.LogManager;

/** One section's pose relative to the straight body. Angles are degrees: yaw turns
 * forward toward left, pitch raises forward. Pitch is applied before yaw. */
public final class SeatSection
{
    private final double forward;
    private final double up;
    private final double left;
    private final double yaw;
    private final double pitch;

    public SeatSection(double pivotForward, double pivotUp, double pivotLeft, double yaw, double pitch)
    {
        if (Double.isFinite(pivotForward) == false || Double.isFinite(pivotUp) == false || Double.isFinite(pivotLeft) == false
                || Double.isFinite(yaw) == false || Double.isFinite(pitch) == false)
        {
            LogManager.getLogger("Traincraft").warn("[Seats] Invalid section pose; using the body transform");
            pivotForward = pivotUp = pivotLeft = yaw = pitch = 0.0D;
        }
        forward = pivotForward;
        up = pivotUp;
        left = pivotLeft;
        this.yaw = Math.toRadians(yaw);
        this.pitch = Math.toRadians(pitch);
    }

    /** Transforms a body-relative point in place; adds neither world origin nor rider height. */
    public void transform(double[] position)
    {
        double x = position[0] - forward;
        double y = position[1] - up;
        double z = position[2] - left;
        double pitchedForward = x * Math.cos(pitch) - y * Math.sin(pitch);
        position[0] = forward + pitchedForward * Math.cos(yaw) - z * Math.sin(yaw);
        position[1] = up + x * Math.sin(pitch) + y * Math.cos(pitch);
        position[2] = left + pitchedForward * Math.sin(yaw) + z * Math.cos(yaw);
    }
}
