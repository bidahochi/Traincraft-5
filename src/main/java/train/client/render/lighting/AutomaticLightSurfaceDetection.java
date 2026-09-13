package train.client.render.lighting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;

/**
 * Non-mutating extraction of physical lens surfaces from TMT polygons. Results are cached by
 * part identity and authored-transform signature for the resource generation. Returned surfaces
 * are immutable/read-only snapshots; {@link #clear()} releases the strong identity references.
 */
public final class AutomaticLightSurfaceDetection
{
    private static final float MODEL_VERTEX_SCALE = 0.0625F;
    private static final float MODEL_VERTEX_SCALE_SQUARED = MODEL_VERTEX_SCALE * MODEL_VERTEX_SCALE;
    private static final float MINIMUM_TRIANGLE_AREA = 1.0E-7F;
    private static final float MINIMUM_GEOMETRY_LENGTH = 1.0E-5F;
    private static final float MINIMUM_OUTWARD_ALIGNMENT = 0.25F;
    private static final float SELECTION_EPSILON = 1.0E-5F;
    private static final float DEFAULT_EMPTY_SURFACE_RADIUS = 0.1F;
    private static final float MAXIMUM_CONTRADICTORY_FACE_DISTANCE_SQUARED = 1.0E-4F;
    private static final float MINIMUM_CONTRADICTORY_AREA_RATIO = 0.5F;
    private static final float MAXIMUM_CONTRADICTORY_AREA_RATIO = 2.0F;
    private static final float MAXIMUM_OPPOSING_NORMAL_DOT = -0.9F;
    private static final Map<ModelRendererTurbo, CacheEntry> CACHE =
        new IdentityHashMap<ModelRendererTurbo, CacheEntry>();

    private AutomaticLightSurfaceDetection() {}

    /** Detects and caches the aggregate lens in the part's authored coordinate space. */
    public static synchronized DetectedLightSurface detect(ModelRendererTurbo part)
    {
        return detect(part, null, null, null);
    }

    static synchronized DetectedLightSurface detect(
        ModelRendererTurbo part,
        float[] modelOffset,
        float[] modelRotation,
        float[] modelScale)
    {
        int transformSignature = transformSignature(modelOffset, modelRotation, modelScale);
        CacheEntry cached = CACHE.get(part);
        if (cached != null && cached.transformSignature == transformSignature)
        {
            return cached.surface;
        }
        DetectedLightFace automaticSelection = null;
        DetectedLightFace authoredSelection = null;
        DetectedLightFace fallbackSelection = null;
        List<DetectedLightFace> candidates = new ArrayList<DetectedLightFace>();
        float bestOutwardScore = Float.NEGATIVE_INFINITY;
        float partMinimumX = Float.POSITIVE_INFINITY;
        float partMinimumY = Float.POSITIVE_INFINITY;
        float partMinimumZ = Float.POSITIVE_INFINITY;
        float partMaximumX = Float.NEGATIVE_INFINITY;
        float partMaximumY = Float.NEGATIVE_INFINITY;
        float partMaximumZ = Float.NEGATIVE_INFINITY;
        for (int faceIndex = 0; faceIndex < part.faces.size(); faceIndex++)
        {
            TexturedPolygon polygon = part.faces.get(faceIndex);
            TexturedVertex[] polygonVertices = polygon.vertices;
            if (polygonVertices == null || polygonVertices.length < 3)
            {
                continue;
            }
            // Use the largest non-degenerate triangle for the normal and an
            // area-weighted fan center for shape-box handling.
            // Prime tops intentionally contain collapsed corners, so using
            // only vertices 0/1/2 discards the authored top polygon.
            float normalX = 0,
                  normalY = 0,
                  normalZ = 0,
                  largestTriangleCrossProductLength = 0,
                  weightedCenterX = 0,
                  weightedCenterY = 0,
                  weightedCenterZ = 0,
                  area = 0;
            for (int triangleVertexIndex = 1;
                 triangleVertexIndex + 1 < polygonVertices.length;
                 triangleVertexIndex++)
            {
                float firstEdgeX =
                          polygonVertices[triangleVertexIndex].vector3F.xCoord
                          - polygonVertices[0].vector3F.xCoord,
                      firstEdgeY =
                          polygonVertices[triangleVertexIndex].vector3F.yCoord
                          - polygonVertices[0].vector3F.yCoord,
                      firstEdgeZ =
                          polygonVertices[triangleVertexIndex].vector3F.zCoord
                          - polygonVertices[0].vector3F.zCoord,
                      secondEdgeX =
                          polygonVertices[triangleVertexIndex + 1].vector3F.xCoord
                          - polygonVertices[0].vector3F.xCoord,
                      secondEdgeY =
                          polygonVertices[triangleVertexIndex + 1].vector3F.yCoord
                          - polygonVertices[0].vector3F.yCoord,
                      secondEdgeZ =
                          polygonVertices[triangleVertexIndex + 1].vector3F.zCoord
                          - polygonVertices[0].vector3F.zCoord,
                      crossProductX = firstEdgeY * secondEdgeZ - firstEdgeZ * secondEdgeY,
                      crossProductY = firstEdgeZ * secondEdgeX - firstEdgeX * secondEdgeZ,
                      crossProductZ = firstEdgeX * secondEdgeY - firstEdgeY * secondEdgeX,
                      crossProductLength =
                          (float)
                          Math.sqrt(
                              crossProductX * crossProductX
                              + crossProductY * crossProductY
                              + crossProductZ * crossProductZ),
                      triangleArea = crossProductLength * 0.5F;
                if (crossProductLength > largestTriangleCrossProductLength)
                {
                    largestTriangleCrossProductLength = crossProductLength;
                    normalX = crossProductX / crossProductLength;
                    normalY = crossProductY / crossProductLength;
                    normalZ = crossProductZ / crossProductLength;
                }
                if (triangleArea > MINIMUM_TRIANGLE_AREA)
                {
                    weightedCenterX +=
                        (polygonVertices[0].vector3F.xCoord
                         + polygonVertices[triangleVertexIndex].vector3F.xCoord
                         + polygonVertices[triangleVertexIndex + 1].vector3F.xCoord)
                        / 3
                        * triangleArea;
                    weightedCenterY +=
                        (polygonVertices[0].vector3F.yCoord
                         + polygonVertices[triangleVertexIndex].vector3F.yCoord
                         + polygonVertices[triangleVertexIndex + 1].vector3F.yCoord)
                        / 3
                        * triangleArea;
                    weightedCenterZ +=
                        (polygonVertices[0].vector3F.zCoord
                         + polygonVertices[triangleVertexIndex].vector3F.zCoord
                         + polygonVertices[triangleVertexIndex + 1].vector3F.zCoord)
                        / 3
                        * triangleArea;
                    area += triangleArea;
                }
            }
            if (largestTriangleCrossProductLength < MINIMUM_GEOMETRY_LENGTH
                    || area <= MINIMUM_TRIANGLE_AREA)
            {
                continue;
            }
            float centerX = weightedCenterX / area;
            float centerY = weightedCenterY / area;
            float centerZ = weightedCenterZ / area;
            float minU = Float.MAX_VALUE,
                  minV = Float.MAX_VALUE,
                  maxU = -Float.MAX_VALUE,
                  maxV = -Float.MAX_VALUE;
            for (TexturedVertex vertex : polygonVertices)
            {
                minU = Math.min(minU, vertex.textureX);
                minV = Math.min(minV, vertex.textureY);
                maxU = Math.max(maxU, vertex.textureX);
                maxV = Math.max(maxV, vertex.textureY);
            }
            // Match the modern importer: prefer a horizontally outward-facing
            // face relative to the model origin. Using abs(normal.x) can select
            // the back of the lens and project the cone through the locomotive.
            float[] modelCenter = toModelSpace(part, centerX, centerY, centerZ, true),
                    modelNormal = toModelSpace(part, normalX, normalY, normalZ, false);
            float[] scoringCenter =
                toRenderedSpace(modelCenter, true, modelOffset, modelRotation, modelScale),
                scoringNormal =
                    toRenderedSpace(modelNormal, false, modelOffset, modelRotation, modelScale);
            float radial =
                (float)
                Math.sqrt(
                    scoringCenter[0] * scoringCenter[0]
                    + scoringCenter[2] * scoringCenter[2]);
            float horizontal =
                (float)
                Math.sqrt(
                    scoringNormal[0] * scoringNormal[0]
                    + scoringNormal[2] * scoringNormal[2]);
            float outward =
                radial > MINIMUM_GEOMETRY_LENGTH && horizontal > MINIMUM_GEOMETRY_LENGTH
                ? (scoringNormal[0] * scoringCenter[0]
                   + scoringNormal[2] * scoringCenter[2])
                / (radial * horizontal)
                : Float.NEGATIVE_INFINITY;
            float[][] vertices = new float[polygonVertices.length][3];
            float[] textureU = new float[polygonVertices.length];
            float[] textureV = new float[polygonVertices.length];
            for (int vertexIndex = 0; vertexIndex < polygonVertices.length; vertexIndex++)
            {
                vertices[vertexIndex][0] = polygonVertices[vertexIndex].vector3F.xCoord;
                vertices[vertexIndex][1] = polygonVertices[vertexIndex].vector3F.yCoord;
                vertices[vertexIndex][2] = polygonVertices[vertexIndex].vector3F.zCoord;
                textureU[vertexIndex] = polygonVertices[vertexIndex].textureX;
                textureV[vertexIndex] = polygonVertices[vertexIndex].textureY;
                float[] modelVertex =
                    toModelSpace(
                        part,
                        polygonVertices[vertexIndex].vector3F.xCoord,
                        polygonVertices[vertexIndex].vector3F.yCoord,
                        polygonVertices[vertexIndex].vector3F.zCoord,
                        true);
                partMinimumX = Math.min(partMinimumX, modelVertex[0]);
                partMinimumY = Math.min(partMinimumY, modelVertex[1]);
                partMinimumZ = Math.min(partMinimumZ, modelVertex[2]);
                partMaximumX = Math.max(partMaximumX, modelVertex[0]);
                partMaximumY = Math.max(partMaximumY, modelVertex[1]);
                partMaximumZ = Math.max(partMaximumZ, modelVertex[2]);
            }
            DetectedLightFace candidate =
                new DetectedLightFace(
                faceIndex,
                centerX,
                centerY,
                centerZ,
                normalX,
                normalY,
                normalZ,
                modelCenter[0],
                modelCenter[1],
                modelCenter[2],
                modelNormal[0],
                modelNormal[1],
                modelNormal[2],
                area,
                minU,
                minV,
                maxU,
                maxV,
                vertices,
                textureU,
                textureV);
            candidates.add(candidate);
            if (faceIndex == part.lightExteriorFaceIndex)
            {
                authoredSelection = candidate;
            }
            if (fallbackSelection == null || area > fallbackSelection.area)
            {
                fallbackSelection = candidate;
            }
            if (outward >= MINIMUM_OUTWARD_ALIGNMENT
                    && (automaticSelection == null
                        || outward > bestOutwardScore + SELECTION_EPSILON
                        || (Math.abs(outward - bestOutwardScore) <= SELECTION_EPSILON
                            && area > automaticSelection.area)))
            {
                automaticSelection = candidate;
                bestOutwardScore = outward;
            }
        }
        DetectedLightFace selected =
            authoredSelection != null
            ? authoredSelection
            : automaticSelection != null ? automaticSelection : fallbackSelection;
        DetectedLightSurface best;
        if (selected == null)
        {
            best = new DetectedLightSurface(
                0, 0, 0, 1, 0, 0, 1, 0, 0, 0, DEFAULT_EMPTY_SURFACE_RADIUS, 0, 0, 1, 1);
        }
        else
        {
            float authoredNormalSign = 1.0F;
            if (authoredSelection != null && partMinimumX != Float.POSITIVE_INFINITY)
            {
                float[] renderedFace =
                    toRenderedSpace(
                        new float[]
                        {
                            selected.modelX, selected.modelY, selected.modelZ
                        },
                        true,
                        modelOffset,
                        modelRotation,
                        modelScale),
                    renderedPartCenter =
                        toRenderedSpace(
                            new float[]
                            {
                                (partMinimumX + partMaximumX) * 0.5F,
                                (partMinimumY + partMaximumY) * 0.5F,
                                (partMinimumZ + partMaximumZ) * 0.5F
                            },
                            true,
                            modelOffset,
                            modelRotation,
                            modelScale),
                        renderedNormal =
                            toRenderedSpace(
                                new float[]
                                {
                                    selected.modelNormalX,
                                    selected.modelNormalY,
                                    selected.modelNormalZ
                                },
                                false,
                                modelOffset,
                                modelRotation,
                                modelScale);
                float dot =
                    (renderedFace[0] - renderedPartCenter[0]) * renderedNormal[0]
                    + (renderedFace[1] - renderedPartCenter[1]) * renderedNormal[1]
                    + (renderedFace[2] - renderedPartCenter[2]) * renderedNormal[2];
                if (dot < 0.0F)
                {
                    authoredNormalSign = -1.0F;
                }
            }
            boolean contradictory = false;
            if (automaticSelection != null)
            {
                for (DetectedLightFace other : candidates)
                {
                    if (other == automaticSelection)
                    {
                        continue;
                    }
                    float px = other.modelX - automaticSelection.modelX,
                          py = other.modelY - automaticSelection.modelY,
                          pz = other.modelZ - automaticSelection.modelZ,
                          ratio = other.area / automaticSelection.area,
                          dot =
                              other.modelNormalX * automaticSelection.modelNormalX
                              + other.modelNormalY * automaticSelection.modelNormalY
                              + other.modelNormalZ
                              * automaticSelection.modelNormalZ;
                    if ((px * px + py * py + pz * pz) * MODEL_VERTEX_SCALE_SQUARED
                            <= MAXIMUM_CONTRADICTORY_FACE_DISTANCE_SQUARED
                            && ratio >= MINIMUM_CONTRADICTORY_AREA_RATIO
                            && ratio <= MAXIMUM_CONTRADICTORY_AREA_RATIO
                            && dot < MAXIMUM_OPPOSING_NORMAL_DOT)
                    {
                        contradictory = true;
                        break;
                    }
                }
            }
            best =
                new DetectedLightSurface(
                selected.x,
                selected.y,
                selected.z,
                selected.normalX * authoredNormalSign,
                selected.normalY * authoredNormalSign,
                selected.normalZ * authoredNormalSign,
                selected.modelNormalX * authoredNormalSign,
                selected.modelNormalY * authoredNormalSign,
                selected.modelNormalZ * authoredNormalSign,
                selected.area,
                (float) Math.sqrt(selected.area / Math.PI),
                selected.minU,
                selected.minV,
                selected.maxU,
                selected.maxV,
                automaticSelection != null && contradictory == false,
                candidates,
                selected);
        }
        CACHE.put(part, new CacheEntry(transformSignature, best));
        return best;
    }

    private static int transformSignature(
        float[] modelOffset, float[] modelRotation, float[] modelScale)
    {
        int result = Arrays.hashCode(modelOffset);
        result = 31 * result + Arrays.hashCode(modelRotation);
        return 31 * result + Arrays.hashCode(modelScale);
    }

    /** Converts one model-space vector through the part's authored TMT transform into rendered space. */
    private static float[] toRenderedSpace(
        float[] value,
        boolean translate,
        float[] modelOffset,
        float[] modelRotation,
        float[] modelScale)
    {
        float[] rendered = value.clone();
        if (translate)
        {
            rendered[0] *= MODEL_VERTEX_SCALE;
            rendered[1] *= MODEL_VERTEX_SCALE;
            rendered[2] *= MODEL_VERTEX_SCALE;
        }
        if (modelScale != null && modelScale.length >= 3)
        {
            if (translate)
            {
                rendered[0] *= modelScale[0];
                rendered[1] *= modelScale[1];
                rendered[2] *= modelScale[2];
            }
            else
            {
                rendered[0] = modelScale[0] == 0 ? 0 : rendered[0] / modelScale[0];
                rendered[1] = modelScale[1] == 0 ? 0 : rendered[1] / modelScale[1];
                rendered[2] = modelScale[2] == 0 ? 0 : rendered[2] / modelScale[2];
            }
        }
        if (modelRotation != null && modelRotation.length >= 3)
        {
            rotateZ(rendered, (float) Math.toRadians(modelRotation[2]));
            rotateY(rendered, (float) Math.toRadians(modelRotation[1]));
            rotateX(rendered, (float) Math.toRadians(modelRotation[0]));
        }
        if (translate && modelOffset != null && modelOffset.length >= 3)
        {
            rendered[0] += modelOffset[0];
            rendered[1] += modelOffset[1];
            rendered[2] += modelOffset[2];
        }
        return rendered;
    }

    private static final class CacheEntry
    {
        final int transformSignature;
        final DetectedLightSurface surface;

        CacheEntry(int transformSignature, DetectedLightSurface surface)
        {
            this.transformSignature = transformSignature;
            this.surface = surface;
        }
    }

    private static float[] toModelSpace(
        ModelRendererTurbo part, float x, float y, float z, boolean translate)
    {
        float[] value = new float[] {x, y, z};
        rotateX(value, part.rotateAngleX);
        if (part.rotorder)
        {
            rotateY(value, part.rotateAngleY);
            rotateZ(value, part.rotateAngleZ);
        }
        else
        {
            rotateZ(value, part.rotateAngleZ);
            rotateY(value, part.rotateAngleY);
        }
        if (translate)
        {
            value[0] += part.rotationPointX;
            value[1] += part.rotationPointY;
            value[2] += part.rotationPointZ;
        }
        return value;
    }

    private static void rotateX(float[] v, float a)
    {
        if (a == 0)
        {
            return;
        }
        float c = (float) Math.cos(a),
              s = (float) Math.sin(a),
              y = v[1] * c - v[2] * s,
              z = v[1] * s + v[2] * c;
        v[1] = y;
        v[2] = z;
    }

    private static void rotateY(float[] v, float a)
    {
        if (a == 0)
        {
            return;
        }
        float c = (float) Math.cos(a),
              s = (float) Math.sin(a),
              x = v[0] * c + v[2] * s,
              z = -v[0] * s + v[2] * c;
        v[0] = x;
        v[2] = z;
    }

    private static void rotateZ(float[] v, float a)
    {
        if (a == 0)
        {
            return;
        }
        float c = (float) Math.cos(a),
              s = (float) Math.sin(a),
              x = v[0] * c - v[1] * s,
              y = v[0] * s + v[1] * c;
        v[0] = x;
        v[1] = y;
    }

    /** Clears all part-identity extraction results, normally during resource reload. */
    public static synchronized void clear()
    {
        CACHE.clear();
    }
}
