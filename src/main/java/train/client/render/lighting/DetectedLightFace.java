package train.client.render.lighting;

/**
 * One immutable polygon measurement produced while inspecting a TMT light part.
 * {@code x/y/z}, normals, and vertices are part-local; {@code modelX/Y/Z} and
 * {@code modelNormalX/Y/Z} include the part's authored transform. Area is measured in
 * squared model units and UV bounds use normalized texture coordinates. Arrays are owned
 * by the detection cache and callers must treat them as read-only.
 */
public final class DetectedLightFace
{
    /** Stable polygon index within the inspected part. */
    public final int faceIndex;
    /** Part-local centroid/normal followed by assembled-model centroid/normal and measurements. */
    public final float x,
           y,
           z,
           normalX,
           normalY,
           normalZ,
           modelX,
           modelY,
           modelZ,
           modelNormalX,
           modelNormalY,
           modelNormalZ,
           area,
           minU,
           minV,
           maxU,
           maxV;
    /** Part-local polygon vertices and optional parallel per-vertex UV arrays. */
    public final float[][] vertices;
    public final float[] textureU, textureV;

    DetectedLightFace(
        int faceIndex,
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelX,
        float modelY,
        float modelZ,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float minU,
        float minV,
        float maxU,
        float maxV,
        float[][] vertices)
    {
        this(
            faceIndex,
            x,
            y,
            z,
            nx,
            ny,
            nz,
            modelX,
            modelY,
            modelZ,
            modelNx,
            modelNy,
            modelNz,
            area,
            minU,
            minV,
            maxU,
            maxV,
            vertices,
            null,
            null);
    }

    DetectedLightFace(
        int faceIndex,
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelX,
        float modelY,
        float modelZ,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float minU,
        float minV,
        float maxU,
        float maxV,
        float[][] vertices,
        float[] textureU,
        float[] textureV)
    {
        this.faceIndex = faceIndex;
        this.x = x;
        this.y = y;
        this.z = z;
        normalX = nx;
        normalY = ny;
        normalZ = nz;
        this.modelX = modelX;
        this.modelY = modelY;
        this.modelZ = modelZ;
        modelNormalX = modelNx;
        modelNormalY = modelNy;
        modelNormalZ = modelNz;
        this.area = area;
        this.minU = minU;
        this.minV = minV;
        this.maxU = maxU;
        this.maxV = maxV;
        this.vertices = vertices;
        this.textureU = textureU;
        this.textureV = textureV;
    }
}
