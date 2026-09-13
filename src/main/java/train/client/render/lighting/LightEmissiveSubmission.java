package train.client.render.lighting;

/**
 * Immutable illuminated-surface geometry queued for the world-last emissive pass.
 *
 * <p>A submission contains either fixture-local vertex offsets plus the captured 4x4 model-view
 * pose, or vertices that were already transformed when submitted. The factory methods validate
 * and copy caller-owned arrays so queued geometry cannot change before it is flushed.</p>
 */
final class LightEmissiveSubmission
{
    final int ownerId;
    final int color;
    final String key;
    final float[] cameraRelativePose;
    final float originX;
    final float originY;
    final float originZ;
    final float[][] vertexOffsets;
    final boolean fixtureLocal;
    final float intensity;

    private LightEmissiveSubmission(
        int ownerId,
        String key,
        float[] cameraRelativePose,
        float originX,
        float originY,
        float originZ,
        float[][] vertexOffsets,
        boolean fixtureLocal,
        int color,
        float intensity)
    {
        this.ownerId = ownerId;
        this.key = key;
        this.cameraRelativePose =
            cameraRelativePose == null ? null : cameraRelativePose.clone();
        this.originX = originX;
        this.originY = originY;
        this.originZ = originZ;
        this.vertexOffsets = copyVertices(vertexOffsets);
        this.fixtureLocal = fixtureLocal;
        this.color = color;
        this.intensity = intensity;
    }

    /** Creates a submission whose offsets must be transformed by the captured draw pose. */
    static LightEmissiveSubmission fixtureLocal(
        int ownerId,
        String key,
        float[] cameraRelativePose,
        float originX,
        float originY,
        float originZ,
        float[][] vertexOffsets,
        int color,
        float intensity)
    {
        if (cameraRelativePose == null || cameraRelativePose.length != 16)
        {
            throw new IllegalArgumentException(
                "A fixture-local emissive surface requires a 4x4 pose");
        }
        return new LightEmissiveSubmission(
                   ownerId,
                   key,
                   cameraRelativePose,
                   originX,
                   originY,
                   originZ,
                   vertexOffsets,
                   true,
                   color,
                   intensity);
    }

    /** Creates a submission whose vertices are already in the render batch's coordinate space. */
    static LightEmissiveSubmission alreadyTransformed(
        int ownerId,
        String key,
        float[][] vertices,
        int color,
        float intensity)
    {
        return new LightEmissiveSubmission(
                   ownerId,
                   key,
                   null,
                   0.0F,
                   0.0F,
                   0.0F,
                   vertices,
                   false,
                   color,
                   intensity);
    }

    private static float[][] copyVertices(float[][] vertices)
    {
        if (vertices == null)
        {
            throw new IllegalArgumentException("Emissive vertices must not be null");
        }
        float[][] copy = new float[vertices.length][];
        for (int index = 0; index < vertices.length; index++)
        {
            if (vertices[index] == null || vertices[index].length < 3)
            {
                throw new IllegalArgumentException(
                    "Every emissive vertex must contain three coordinates");
            }
            copy[index] = vertices[index].clone();
        }
        return copy;
    }
}
