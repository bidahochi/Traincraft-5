package train.client.render;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;

/** Non-mutating, class-lifetime extraction of physical tagged lens surfaces. */
public final class AutomaticLightSurfaceDetection {
    private static final Map<ModelRendererTurbo, CacheEntry> CACHE =
            new IdentityHashMap<ModelRendererTurbo, CacheEntry>();

    private AutomaticLightSurfaceDetection() {}

    public static synchronized DetectedLightSurface detect(ModelRendererTurbo part) {
        return detect(part, null, null, null);
    }

    static synchronized DetectedLightSurface detect(
            ModelRendererTurbo part,
            float[] modelOffset,
            float[] modelRotation,
            float[] modelScale) {
        int transformSignature = transformSignature(modelOffset, modelRotation, modelScale);
        CacheEntry cached = CACHE.get(part);
        if (cached != null && cached.transformSignature == transformSignature) {
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
        for (int faceIndex = 0; faceIndex < part.faces.size(); faceIndex++) {
            TexturedPolygon polygon = part.faces.get(faceIndex);
            TexturedVertex[] v = polygon.vertices;
            if (v == null || v.length < 3) continue;
            // Use the largest non-degenerate triangle for the normal and an
            // area-weighted fan center for shape-box handling.
            // Prime tops intentionally contain collapsed corners, so using
            // only vertices 0/1/2 discards the authored top polygon.
            float nx = 0, ny = 0, nz = 0, bestTriangle = 0, cx = 0, cy = 0, cz = 0, area = 0;
            for (int ti = 1; ti + 1 < v.length; ti++) {
                float ax = v[ti].vector3F.xCoord - v[0].vector3F.xCoord,
                        ay = v[ti].vector3F.yCoord - v[0].vector3F.yCoord,
                        az = v[ti].vector3F.zCoord - v[0].vector3F.zCoord,
                        bx = v[ti + 1].vector3F.xCoord - v[0].vector3F.xCoord,
                        by = v[ti + 1].vector3F.yCoord - v[0].vector3F.yCoord,
                        bz = v[ti + 1].vector3F.zCoord - v[0].vector3F.zCoord,
                        tx = ay * bz - az * by,
                        ty = az * bx - ax * bz,
                        tz = ax * by - ay * bx,
                        length = (float) Math.sqrt(tx * tx + ty * ty + tz * tz),
                        triangleArea = length * 0.5F;
                if (length > bestTriangle) {
                    bestTriangle = length;
                    nx = tx / length;
                    ny = ty / length;
                    nz = tz / length;
                }
                if (triangleArea > 1.0E-7F) {
                    cx +=
                            (v[0].vector3F.xCoord
                                            + v[ti].vector3F.xCoord
                                            + v[ti + 1].vector3F.xCoord)
                                    / 3
                                    * triangleArea;
                    cy +=
                            (v[0].vector3F.yCoord
                                            + v[ti].vector3F.yCoord
                                            + v[ti + 1].vector3F.yCoord)
                                    / 3
                                    * triangleArea;
                    cz +=
                            (v[0].vector3F.zCoord
                                            + v[ti].vector3F.zCoord
                                            + v[ti + 1].vector3F.zCoord)
                                    / 3
                                    * triangleArea;
                    area += triangleArea;
                }
            }
            if (bestTriangle < 1.0E-5F || area <= 1.0E-7F) continue;
            cx /= area;
            cy /= area;
            cz /= area;
            float minU = Float.MAX_VALUE,
                    minV = Float.MAX_VALUE,
                    maxU = -Float.MAX_VALUE,
                    maxV = -Float.MAX_VALUE;
            for (TexturedVertex p : v) {
                minU = Math.min(minU, p.textureX);
                minV = Math.min(minV, p.textureY);
                maxU = Math.max(maxU, p.textureX);
                maxV = Math.max(maxV, p.textureY);
            }
            // Match the modern importer: prefer a horizontally outward-facing
            // face relative to the model origin. Using abs(normal.x) can select
            // the back of the lens and project the cone through the locomotive.
            float[] modelCenter = toModelSpace(part, cx, cy, cz, true),
                    modelNormal = toModelSpace(part, nx, ny, nz, false);
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
                    radial > 1.0E-5F && horizontal > 1.0E-5F
                            ? (scoringNormal[0] * scoringCenter[0]
                                            + scoringNormal[2] * scoringCenter[2])
                                    / (radial * horizontal)
                            : Float.NEGATIVE_INFINITY;
            float[][] vertices = new float[v.length][3];
            float[] textureU = new float[v.length];
            float[] textureV = new float[v.length];
            for (int vi = 0; vi < v.length; vi++) {
                vertices[vi][0] = v[vi].vector3F.xCoord;
                vertices[vi][1] = v[vi].vector3F.yCoord;
                vertices[vi][2] = v[vi].vector3F.zCoord;
                textureU[vi] = v[vi].textureX;
                textureV[vi] = v[vi].textureY;
                float[] modelVertex =
                        toModelSpace(
                                part,
                                v[vi].vector3F.xCoord,
                                v[vi].vector3F.yCoord,
                                v[vi].vector3F.zCoord,
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
                            cx,
                            cy,
                            cz,
                            nx,
                            ny,
                            nz,
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
            if (faceIndex == part.lightExteriorFaceIndex) {
                authoredSelection = candidate;
            }
            if (fallbackSelection == null || area > fallbackSelection.area) {
                fallbackSelection = candidate;
            }
            if (outward >= 0.25F
                    && (automaticSelection == null
                            || outward > bestOutwardScore + 1.0E-5F
                            || (Math.abs(outward - bestOutwardScore) <= 1.0E-5F
                                    && area > automaticSelection.area))) {
                automaticSelection = candidate;
                bestOutwardScore = outward;
            }
        }
        DetectedLightFace selected =
                authoredSelection != null
                        ? authoredSelection
                        : automaticSelection != null ? automaticSelection : fallbackSelection;
        DetectedLightSurface best;
        if (selected == null) {
            best = new DetectedLightSurface(0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0.1F, 0, 0, 1, 1);
        } else {
            float authoredNormalSign = 1.0F;
            if (authoredSelection != null && partMinimumX != Float.POSITIVE_INFINITY) {
                float[] renderedFace =
                                toRenderedSpace(
                                        new float[] {
                                            selected.modelX, selected.modelY, selected.modelZ
                                        },
                                        true,
                                        modelOffset,
                                        modelRotation,
                                        modelScale),
                        renderedPartCenter =
                                toRenderedSpace(
                                        new float[] {
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
                                        new float[] {
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
                if (dot < 0.0F) {
                    authoredNormalSign = -1.0F;
                }
            }
            boolean contradictory = false;
            if (automaticSelection != null) {
                for (DetectedLightFace other : candidates) {
                    if (other == automaticSelection) continue;
                    float px = other.modelX - automaticSelection.modelX,
                            py = other.modelY - automaticSelection.modelY,
                            pz = other.modelZ - automaticSelection.modelZ,
                            ratio = other.area / automaticSelection.area,
                            dot =
                                    other.modelNormalX * automaticSelection.modelNormalX
                                            + other.modelNormalY * automaticSelection.modelNormalY
                                            + other.modelNormalZ
                                                    * automaticSelection.modelNormalZ;
                    if ((px * px + py * py + pz * pz) * 0.00390625F <= 1.0E-4F
                            && ratio >= 0.5F
                            && ratio <= 2
                            && dot < -0.9F) {
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
            float[] modelOffset, float[] modelRotation, float[] modelScale) {
        int result = Arrays.hashCode(modelOffset);
        result = 31 * result + Arrays.hashCode(modelRotation);
        return 31 * result + Arrays.hashCode(modelScale);
    }

    private static float[] toRenderedSpace(
            float[] value,
            boolean translate,
            float[] modelOffset,
            float[] modelRotation,
            float[] modelScale) {
        float[] rendered = value.clone();
        if (translate) {
            rendered[0] *= 0.0625F;
            rendered[1] *= 0.0625F;
            rendered[2] *= 0.0625F;
        }
        if (modelScale != null && modelScale.length >= 3) {
            if (translate) {
                rendered[0] *= modelScale[0];
                rendered[1] *= modelScale[1];
                rendered[2] *= modelScale[2];
            } else {
                rendered[0] = modelScale[0] == 0 ? 0 : rendered[0] / modelScale[0];
                rendered[1] = modelScale[1] == 0 ? 0 : rendered[1] / modelScale[1];
                rendered[2] = modelScale[2] == 0 ? 0 : rendered[2] / modelScale[2];
            }
        }
        if (modelRotation != null && modelRotation.length >= 3) {
            rotateZ(rendered, (float) Math.toRadians(modelRotation[2]));
            rotateY(rendered, (float) Math.toRadians(modelRotation[1]));
            rotateX(rendered, (float) Math.toRadians(modelRotation[0]));
        }
        if (translate && modelOffset != null && modelOffset.length >= 3) {
            rendered[0] += modelOffset[0];
            rendered[1] += modelOffset[1];
            rendered[2] += modelOffset[2];
        }
        return rendered;
    }

    private static final class CacheEntry {
        final int transformSignature;
        final DetectedLightSurface surface;

        CacheEntry(int transformSignature, DetectedLightSurface surface) {
            this.transformSignature = transformSignature;
            this.surface = surface;
        }
    }

    private static float[] toModelSpace(
            ModelRendererTurbo part, float x, float y, float z, boolean translate) {
        float[] value = new float[] {x, y, z};
        rotateX(value, part.rotateAngleX);
        if (part.rotorder) {
            rotateY(value, part.rotateAngleY);
            rotateZ(value, part.rotateAngleZ);
        } else {
            rotateZ(value, part.rotateAngleZ);
            rotateY(value, part.rotateAngleY);
        }
        if (translate) {
            value[0] += part.rotationPointX;
            value[1] += part.rotationPointY;
            value[2] += part.rotationPointZ;
        }
        return value;
    }

    private static void rotateX(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                y = v[1] * c - v[2] * s,
                z = v[1] * s + v[2] * c;
        v[1] = y;
        v[2] = z;
    }

    private static void rotateY(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                x = v[0] * c + v[2] * s,
                z = -v[0] * s + v[2] * c;
        v[0] = x;
        v[2] = z;
    }

    private static void rotateZ(float[] v, float a) {
        if (a == 0) return;
        float c = (float) Math.cos(a),
                s = (float) Math.sin(a),
                x = v[0] * c - v[1] * s,
                y = v[0] * s + v[1] * c;
        v[0] = x;
        v[1] = y;
    }

    public static synchronized void clear() {
        CACHE.clear();
    }
}
