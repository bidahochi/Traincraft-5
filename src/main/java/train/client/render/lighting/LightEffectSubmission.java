package train.client.render.lighting;

import train.common.api.RollingStockLightDefinition;

/**
 * One fixture captured while its model part is drawn.
 *
 * <p>All three axes are derived in fixture-local space and then transformed by the same
 * submission-time model-view. The later world-last camera is never used to reconstruct either
 * cross-section from the stored-pose behavior.
 * Three-element arrays use {@code [0] = x}, {@code [1] = y}, and {@code [2] = z}. Nine-element
 * optical bases use {@code [0..2] = direction x/y/z}, {@code [3..5] = right x/y/z}, and
 * {@code [6..8] = up x/y/z}. Sixteen-element poses use OpenGL column-major order:
 * {@code [0..3]} column 0, {@code [4..7]} column 1, {@code [8..11]} column 2, and
 * {@code [12..15]} the translation/homogeneous column.
 */
public final class LightEffectSubmission
{
    private static final float DEFAULT_HOTSPOT_ALPHA = 0.85F;
    private static final float MINIMUM_DIRECTION_LENGTH = 1.0E-5F;
    private static final float REFERENCE_AXIS_PARALLEL_THRESHOLD = 0.95F;

    private static final float[] IDENTITY =
        new float[]
    {
        1, 0, 0, 0,
        0, 1, 0, 0,
        0, 0, 1, 0,
        0, 0, 0, 1
    };
    public final int ownerId;
    public final String fixtureId;
    public final RollingStockLightDefinition definition;
    /** Submission-time OpenGL model-view using the documented 16-slot pose layout. */
    public final float[] cameraRelativePose;

    /** True when all spatial fields must be transformed by {@link #cameraRelativePose}. */
    public final boolean fixtureLocal;
    /** Source point and source-facing orthonormal basis in the submission coordinate space. */
    public float x, y, z;
    public float sourceDx, sourceDy, sourceDz;
    public float sourceRightX, sourceRightY, sourceRightZ;
    public float sourceUpX, sourceUpY, sourceUpZ;
    /** Animated beam direction and cross-section basis in the submission coordinate space. */
    public float dx, dy, dz;
    public float rightX, rightY, rightZ;
    public float upX, upY, upZ;
    /** Normalized effect intensities and multiplicative beam geometry/alpha controls. */
    public float intensity, sourceIntensity;
    public float beamScale, beamAlpha, hotspotAlpha, fixtureReach;
    /** Frame-local collision result, populated after all rolling-stock poses are captured. */
    BeamImpactResolution impactResolution = BeamImpactResolution.NONE;
    /** Optional world block omitted by shadow/depth sampling to avoid self-occlusion. */
    public boolean hasExcludedBlock;
    public int excludedBlockX, excludedBlockY, excludedBlockZ;
    /** Number of compatible fixture submissions folded into this batch entry. */
    public int members = 1;

    /** Creates an already-transformed submission using one direction for source and beam. */
    public LightEffectSubmission(
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float dx,
        float dy,
        float dz,
        float intensity)
    {
        this(
            ownerId,
            fixtureId,
            definition,
            x,
            y,
            z,
            dx,
            dy,
            dz,
            dx,
            dy,
            dz,
            intensity,
            intensity,
            1.0F,
            1.0F,
            DEFAULT_HOTSPOT_ALPHA,
            1.0F);
    }

    /** Creates an already-transformed submission and derives stable fallback bases. */
    public LightEffectSubmission(
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach)
    {
        this(
            ownerId,
            fixtureId,
            definition,
            x,
            y,
            z,
            sourceDx,
            sourceDy,
            sourceDz,
            dx,
            dy,
            dz,
            fallbackBasis(sourceDx, sourceDy, sourceDz),
            fallbackBasis(dx, dy, dz),
            intensity,
            sourceIntensity,
            beamScale,
            beamAlpha,
            hotspotAlpha,
            fixtureReach,
            false,
            0,
            0,
            0);
    }

    /** Creates an already-transformed submission with explicit source and beam bases. */
    public LightEffectSubmission(
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach)
    {
        this(
            ownerId,
            fixtureId,
            definition,
            x,
            y,
            z,
            sourceDx,
            sourceDy,
            sourceDz,
            dx,
            dy,
            dz,
            sourceBasis,
            beamBasis,
            intensity,
            sourceIntensity,
            beamScale,
            beamAlpha,
            hotspotAlpha,
            fixtureReach,
            false,
            0,
            0,
            0);
    }

    /** Creates an already-transformed submission with an excluded world block. */
    public LightEffectSubmission(
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach,
        int excludedBlockX,
        int excludedBlockY,
        int excludedBlockZ)
    {
        this(
            ownerId,
            fixtureId,
            definition,
            x,
            y,
            z,
            sourceDx,
            sourceDy,
            sourceDz,
            dx,
            dy,
            dz,
            sourceBasis,
            beamBasis,
            intensity,
            sourceIntensity,
            beamScale,
            beamAlpha,
            hotspotAlpha,
            fixtureReach,
            true,
            excludedBlockX,
            excludedBlockY,
            excludedBlockZ);
    }

    private LightEffectSubmission(
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach,
        boolean hasExcludedBlock,
        int excludedBlockX,
        int excludedBlockY,
        int excludedBlockZ)
    {
        this(
            IDENTITY,
            false,
            ownerId,
            fixtureId,
            definition,
            x,
            y,
            z,
            sourceDx,
            sourceDy,
            sourceDz,
            dx,
            dy,
            dz,
            sourceBasis,
            beamBasis,
            intensity,
            sourceIntensity,
            beamScale,
            beamAlpha,
            hotspotAlpha,
            fixtureReach,
            hasExcludedBlock,
            excludedBlockX,
            excludedBlockY,
            excludedBlockZ);
    }

    private LightEffectSubmission(
        float[] cameraRelativePose,
        boolean fixtureLocal,
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach,
        boolean hasExcludedBlock,
        int excludedBlockX,
        int excludedBlockY,
        int excludedBlockZ)
    {
        this.ownerId = ownerId;
        this.fixtureId = fixtureId;
        this.definition = definition;
        this.cameraRelativePose = cameraRelativePose.clone();
        this.fixtureLocal = fixtureLocal;
        this.x = x;
        this.y = y;
        this.z = z;
        this.sourceDx = sourceDx;
        this.sourceDy = sourceDy;
        this.sourceDz = sourceDz;
        this.sourceRightX = sourceBasis[3];
        this.sourceRightY = sourceBasis[4];
        this.sourceRightZ = sourceBasis[5];
        this.sourceUpX = sourceBasis[6];
        this.sourceUpY = sourceBasis[7];
        this.sourceUpZ = sourceBasis[8];
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.rightX = beamBasis[3];
        this.rightY = beamBasis[4];
        this.rightZ = beamBasis[5];
        this.upX = beamBasis[6];
        this.upY = beamBasis[7];
        this.upZ = beamBasis[8];
        this.intensity = intensity;
        this.sourceIntensity = sourceIntensity;
        this.beamScale = beamScale;
        this.beamAlpha = beamAlpha;
        this.hotspotAlpha = hotspotAlpha;
        this.fixtureReach = fixtureReach;
        this.hasExcludedBlock = hasExcludedBlock;
        this.excludedBlockX = excludedBlockX;
        this.excludedBlockY = excludedBlockY;
        this.excludedBlockZ = excludedBlockZ;
    }

    /**
     * Creates a fixture-local submission with an excluded world block for depth sampling. This
     * factory retains the pose and transforms the complete cone during the world-last pass;
     * normalizing an already transformed direction would discard scale from the authored pose.
     */
    public static LightEffectSubmission fixtureLocal(
        float[] cameraRelativePose,
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach)
    {
        if (cameraRelativePose == null || cameraRelativePose.length != 16)
        {
            throw new IllegalArgumentException("cameraRelativePose must contain 16 values");
        }
        return new LightEffectSubmission(
                   cameraRelativePose,
                   true,
                   ownerId,
                   fixtureId,
                   definition,
                   x,
                   y,
                   z,
                   sourceDx,
                   sourceDy,
                   sourceDz,
                   dx,
                   dy,
                   dz,
                   sourceBasis,
                   beamBasis,
                   intensity,
                   sourceIntensity,
                   beamScale,
                   beamAlpha,
                   hotspotAlpha,
                   fixtureReach,
                   false,
                   0,
                   0,
                   0);
    }

    public static LightEffectSubmission fixtureLocal(
        float[] cameraRelativePose,
        int ownerId,
        String fixtureId,
        RollingStockLightDefinition definition,
        float x,
        float y,
        float z,
        float sourceDx,
        float sourceDy,
        float sourceDz,
        float dx,
        float dy,
        float dz,
        float[] sourceBasis,
        float[] beamBasis,
        float intensity,
        float sourceIntensity,
        float beamScale,
        float beamAlpha,
        float hotspotAlpha,
        float fixtureReach,
        int excludedBlockX,
        int excludedBlockY,
        int excludedBlockZ)
    {
        if (cameraRelativePose == null || cameraRelativePose.length != 16)
        {
            throw new IllegalArgumentException("cameraRelativePose must contain 16 values");
        }
        return new LightEffectSubmission(
                   cameraRelativePose,
                   true,
                   ownerId,
                   fixtureId,
                   definition,
                   x,
                   y,
                   z,
                   sourceDx,
                   sourceDy,
                   sourceDz,
                   dx,
                   dy,
                   dz,
                   sourceBasis,
                   beamBasis,
                   intensity,
                   sourceIntensity,
                   beamScale,
                   beamAlpha,
                   hotspotAlpha,
                   fixtureReach,
                   true,
                   excludedBlockX,
                   excludedBlockY,
                   excludedBlockZ);
    }

    float[] eyePoint(float localX, float localY, float localZ)
    {
        float[] destination = new float[3];
        eyePoint(localX, localY, localZ, destination);
        return destination;
    }

    void eyePoint(float localX, float localY, float localZ, float[] destination)
    {
        if (fixtureLocal == false)
        {
            destination[0] = localX;
            destination[1] = localY;
            destination[2] = localZ;
            return;
        }
        float[] m = cameraRelativePose;
        destination[0] = m[0] * localX + m[4] * localY + m[8] * localZ + m[12];
        destination[1] = m[1] * localX + m[5] * localY + m[9] * localZ + m[13];
        destination[2] = m[2] * localX + m[6] * localY + m[10] * localZ + m[14];
    }

    float[] eyeDirection(float localX, float localY, float localZ)
    {
        float[] destination = new float[3];
        eyeDirection(localX, localY, localZ, destination);
        return destination;
    }

    void eyeDirection(float localX, float localY, float localZ, float[] destination)
    {
        if (fixtureLocal == false)
        {
            normalize(localX, localY, localZ, destination);
            return;
        }
        float[] m = cameraRelativePose;
        normalize(
            m[0] * localX + m[4] * localY + m[8] * localZ,
            m[1] * localX + m[5] * localY + m[9] * localZ,
            m[2] * localX + m[6] * localY + m[10] * localZ,
            destination);
    }

    void merge(LightEffectSubmission other)
    {
        float count = members + 1.0F;
        x = average(x, other.x, count);
        y = average(y, other.y, count);
        z = average(z, other.z, count);
        sourceDx = average(sourceDx, other.sourceDx, count);
        sourceDy = average(sourceDy, other.sourceDy, count);
        sourceDz = average(sourceDz, other.sourceDz, count);
        sourceRightX = average(sourceRightX, other.sourceRightX, count);
        sourceRightY = average(sourceRightY, other.sourceRightY, count);
        sourceRightZ = average(sourceRightZ, other.sourceRightZ, count);
        sourceUpX = average(sourceUpX, other.sourceUpX, count);
        sourceUpY = average(sourceUpY, other.sourceUpY, count);
        sourceUpZ = average(sourceUpZ, other.sourceUpZ, count);
        dx = average(dx, other.dx, count);
        dy = average(dy, other.dy, count);
        dz = average(dz, other.dz, count);
        rightX = average(rightX, other.rightX, count);
        rightY = average(rightY, other.rightY, count);
        rightZ = average(rightZ, other.rightZ, count);
        upX = average(upX, other.upX, count);
        upY = average(upY, other.upY, count);
        upZ = average(upZ, other.upZ, count);
        intensity = Math.max(intensity, other.intensity);
        sourceIntensity = Math.max(sourceIntensity, other.sourceIntensity);
        beamScale = other.beamScale;
        beamAlpha = other.beamAlpha;
        hotspotAlpha = other.hotspotAlpha;
        fixtureReach = Math.max(fixtureReach, other.fixtureReach);
        if (hasExcludedBlock == false && other.hasExcludedBlock)
        {
            hasExcludedBlock = true;
            excludedBlockX = other.excludedBlockX;
            excludedBlockY = other.excludedBlockY;
            excludedBlockZ = other.excludedBlockZ;
        }
        members++;
    }

    private float average(float current, float next, float count)
    {
        return (current * members + next) / count;
    }

    /** Creates a stable orthonormal basis when a submission lacks an authored source-face basis. */
    private static float[] fallbackBasis(float dx, float dy, float dz)
    {
        float length = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (length <= MINIMUM_DIRECTION_LENGTH)
        {
            return new float[] {0, 0, 1, 1, 0, 0, 0, 1, 0};
        }
        dx /= length;
        dy /= length;
        dz /= length;
        float referenceY =
            Math.abs(dy) < REFERENCE_AXIS_PARALLEL_THRESHOLD ? 1.0F : 0.0F;
        float referenceZ = referenceY == 0.0F ? 1.0F : 0.0F;
        float rightX = dy * referenceZ - dz * referenceY;
        float rightY = -dx * referenceZ;
        float rightZ = dx * referenceY;
        float rightLength = (float) Math.sqrt(rightX * rightX + rightY * rightY + rightZ * rightZ);
        rightX /= rightLength;
        rightY /= rightLength;
        rightZ /= rightLength;
        float upX = rightY * dz - rightZ * dy;
        float upY = rightZ * dx - rightX * dz;
        float upZ = rightX * dy - rightY * dx;
        return new float[]
               {
                   dx, dy, dz,
                   rightX, rightY, rightZ,
                   upX, upY, upZ
               };
    }

    /** Returns a newly allocated normalized vector, using forward for a degenerate input. */
    private static float[] normalize(float x, float y, float z)
    {
        float[] destination = new float[3];
        normalize(x, y, z, destination);
        return destination;
    }

    /** Writes a normalized vector into reusable destination storage. */
    private static void normalize(float x, float y, float z, float[] destination)
    {
        float length = (float) Math.sqrt(x * x + y * y + z * z);
        if (length <= MINIMUM_DIRECTION_LENGTH)
        {
            destination[0] = 0.0F;
            destination[1] = 0.0F;
            destination[2] = 1.0F;
            return;
        }
        destination[0] = x / length;
        destination[1] = y / length;
        destination[2] = z / length;
    }
}
