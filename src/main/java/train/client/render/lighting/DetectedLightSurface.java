package train.client.render.lighting;

import java.util.Collections;
import java.util.List;

/**
 * Immutable aggregate lens surface measured from one TMT model part.
 * The centroid and primary normal are part-local, while {@code modelNormal*} includes
 * the part's authored transform. Radius and area use model units. Face collections are
 * cache-owned and exposed read-only; {@link #select(DetectedLightFace)} creates a new view.
 */
public final class DetectedLightSurface
{
    /** Part-local centroid/normal, assembled-model normal, area/radius, and normalized UV bounds. */
    public final float x,
           y,
           z,
           normalX,
           normalY,
           normalZ,
           modelNormalX,
           modelNormalY,
           modelNormalZ,
           area,
           radius,
           minU,
           minV,
           maxU,
           maxV;
    /** Whether the beam direction was inferred from the aggregate rather than a selected face. */
    public final boolean beamInferred;
    /** Read-only detected faces and the optional explicitly selected source face. */
    public final List<DetectedLightFace> faces;
    public final DetectedLightFace sourceFace;

    /** Creates an inferred aggregate surface with no retained component faces. */
    public DetectedLightSurface(
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float radius,
        float minU,
        float minV,
        float maxU,
        float maxV)
    {
        this(
            x,
            y,
            z,
            nx,
            ny,
            nz,
            modelNx,
            modelNy,
            modelNz,
            area,
            radius,
            minU,
            minV,
            maxU,
            maxV,
            true,
            Collections.<DetectedLightFace>emptyList());
    }

    /** Creates an aggregate surface with no retained component faces. */
    public DetectedLightSurface(
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float radius,
        float minU,
        float minV,
        float maxU,
        float maxV,
        boolean beamInferred)
    {
        this(
            x,
            y,
            z,
            nx,
            ny,
            nz,
            modelNx,
            modelNy,
            modelNz,
            area,
            radius,
            minU,
            minV,
            maxU,
            maxV,
            beamInferred,
            Collections.<DetectedLightFace>emptyList());
    }

    /** Creates an aggregate surface and retains the supplied detection faces read-only. */
    public DetectedLightSurface(
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float radius,
        float minU,
        float minV,
        float maxU,
        float maxV,
        boolean beamInferred,
        List<DetectedLightFace> faces)
    {
        this(
            x,
            y,
            z,
            nx,
            ny,
            nz,
            modelNx,
            modelNy,
            modelNz,
            area,
            radius,
            minU,
            minV,
            maxU,
            maxV,
            beamInferred,
            faces,
            null);
    }

    /**
     * Creates the canonical aggregate surface representation.
     * Spatial values use part-local model units except the assembled-model normal.
     */
    public DetectedLightSurface(
        float x,
        float y,
        float z,
        float nx,
        float ny,
        float nz,
        float modelNx,
        float modelNy,
        float modelNz,
        float area,
        float radius,
        float minU,
        float minV,
        float maxU,
        float maxV,
        boolean beamInferred,
        List<DetectedLightFace> faces,
        DetectedLightFace sourceFace)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        normalX = nx;
        normalY = ny;
        normalZ = nz;
        modelNormalX = modelNx;
        modelNormalY = modelNy;
        modelNormalZ = modelNz;
        this.area = area;
        this.radius = radius;
        this.minU = minU;
        this.minV = minV;
        this.maxU = maxU;
        this.maxV = maxV;
        this.beamInferred = beamInferred;
        this.faces = Collections.unmodifiableList(faces);
        this.sourceFace = sourceFace;
    }

    /** Returns a surface view centered and aimed from {@code face}, or this object for null. */
    public DetectedLightSurface select(DetectedLightFace face)
    {
        return face == null
               ? this
               : new DetectedLightSurface(
                   face.x,
                   face.y,
                   face.z,
                   face.normalX,
                   face.normalY,
                   face.normalZ,
                   face.modelNormalX,
                   face.modelNormalY,
                   face.modelNormalZ,
                   face.area,
                   (float) Math.sqrt(face.area / Math.PI),
                   minU,
                   minV,
                   maxU,
                   maxV,
                   false,
                   faces,
                   face);
    }

    /** Selects the best horizontal face for Prime phase {@code 1..4}, or null if absent. */
    public DetectedLightFace primeFace(int phase)
    {
        float tx = phase == 1 ? -1 : phase == 3 ? 1 : 0,
              tz = phase == 2 ? -1 : phase == 4 ? 1 : 0,
              best = 0.5F;
        DetectedLightFace result = null;
        for (DetectedLightFace face : faces)
        {
            float horizontal =
                (float)
                Math.sqrt(
                    face.modelNormalX * face.modelNormalX
                    + face.modelNormalZ * face.modelNormalZ);
            if (horizontal < 0.5F)
            {
                continue;
            }
            float score = (face.modelNormalX * tx + face.modelNormalZ * tz) / horizontal;
            if (score > best + 1.0E-5F
                    || (Math.abs(score - best) <= 1.0E-5F
                        && result != null
                        && face.area > result.area))
            {
                best = score;
                result = face;
            }
        }
        return result;
    }

    /** Selects the most upward-facing polygon, preferring greater area on ties. */
    public DetectedLightFace upwardFace()
    {
        DetectedLightFace result = null;
        for (DetectedLightFace face : faces)
        {
            if (face.modelNormalY > 0.5F
                    && (result == null
                        || face.modelNormalY > result.modelNormalY + 1.0E-5F
                        || Math.abs(face.modelNormalY - result.modelNormalY) <= 1.0E-5F
                        && face.area > result.area))
            {
                result = face;
            }
        }
        return result;
    }
}
