package train.client.render;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;
import train.common.api.EntityRollingStock;

/** Frame-owned rolling-stock geometry and poses used only by lighting masks and shadows. */
public final class RollingStockLightOcclusion {
    private static final int MAXIMUM_MODEL_BOUNDS = 256;
    private static final int MAXIMUM_POOLED_ENTRIES = 256;
    private static final int MAXIMUM_POOLED_PART_POSES = 8192;
    private static final float MODEL_VERTEX_SCALE = 0.0625F;
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final BoundedIdentityCache<Object, Bounds> MODEL_BOUNDS =
            new BoundedIdentityCache<Object, Bounds>(MAXIMUM_MODEL_BOUNDS);
    private static final List<Entry> FRAME_ENTRIES = new ArrayList<Entry>();
    private static final ArrayDeque<Entry> ENTRY_POOL = new ArrayDeque<Entry>();
    private static final ArrayDeque<PartPose> PART_POSE_POOL = new ArrayDeque<PartPose>();
    private static Entry activeEntry;

    private RollingStockLightOcclusion() {}

    static void beginStock(EntityRollingStock stock) {
        activeEntry = null;
        if (stock == null || stock.modelInstance == null) {
            return;
        }
        Bounds bounds = MODEL_BOUNDS.get(stock.modelInstance);
        if (bounds == null) {
            bounds = extractBounds(stock.modelInstance);
            MODEL_BOUNDS.put(stock.modelInstance, bounds);
        }
        if (bounds.valid == false) {
            return;
        }
        Entry entry = acquireEntry();
        entry.ownerId = stock.getEntityId();
        entry.bounds = bounds;
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        MATRIX_BUFFER.get(entry.pose);
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        MATRIX_BUFFER.get(entry.projection);
        FRAME_ENTRIES.add(entry);
        activeEntry = entry;
    }

    static void endStock() {
        activeEntry = null;
    }

    /** Called before batching can consume a requested TMT part. */
    public static void capturePart(ModelRendererTurbo part, float scale, boolean rotationOrder) {
        Entry entry = activeEntry;
        if (entry == null || part == null || entry.seenParts.put(part, Boolean.TRUE) != null) {
            return;
        }
        PartPose pose = acquirePartPose();
        pose.part = part;
        pose.scale = scale;
        pose.rotationOrder = rotationOrder;
        pose.rotationPointX = part.rotationPointX;
        pose.rotationPointY = part.rotationPointY;
        pose.rotationPointZ = part.rotationPointZ;
        pose.rotateAngleX = part.rotateAngleX;
        pose.rotateAngleY = part.rotateAngleY;
        pose.rotateAngleZ = part.rotateAngleZ;
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        MATRIX_BUFFER.get(pose.parentPose);
        entry.parts.add(pose);
    }

    static List<Entry> entries() {
        return FRAME_ENTRIES;
    }

    static boolean activeScreenRectangle(int width, int height, int[] destination) {
        Entry entry = activeEntry;
        if (entry == null || width <= 0 || height <= 0) {
            return false;
        }
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        for (int corner = 0; corner < 8; corner++) {
            float x = (corner & 1) == 0 ? entry.bounds.minimumX : entry.bounds.maximumX;
            float y = (corner & 2) == 0 ? entry.bounds.minimumY : entry.bounds.maximumY;
            float z = (corner & 4) == 0 ? entry.bounds.minimumZ : entry.bounds.maximumZ;
            float eyeX = entry.pose[0] * x + entry.pose[4] * y + entry.pose[8] * z + entry.pose[12];
            float eyeY = entry.pose[1] * x + entry.pose[5] * y + entry.pose[9] * z + entry.pose[13];
            float eyeZ = entry.pose[2] * x + entry.pose[6] * y + entry.pose[10] * z + entry.pose[14];
            float eyeW = entry.pose[3] * x + entry.pose[7] * y + entry.pose[11] * z + entry.pose[15];
            float clipX = entry.projection[0] * eyeX
                    + entry.projection[4] * eyeY
                    + entry.projection[8] * eyeZ
                    + entry.projection[12] * eyeW;
            float clipY = entry.projection[1] * eyeX
                    + entry.projection[5] * eyeY
                    + entry.projection[9] * eyeZ
                    + entry.projection[13] * eyeW;
            float clipW = entry.projection[3] * eyeX
                    + entry.projection[7] * eyeY
                    + entry.projection[11] * eyeZ
                    + entry.projection[15] * eyeW;
            if (clipW <= 1.0E-5F) {
                destination[0] = 0;
                destination[1] = 0;
                destination[2] = width;
                destination[3] = height;
                return true;
            }
            float screenX = (clipX / clipW * 0.5F + 0.5F) * width;
            float screenY = (clipY / clipW * 0.5F + 0.5F) * height;
            minimumX = Math.min(minimumX, screenX);
            minimumY = Math.min(minimumY, screenY);
            maximumX = Math.max(maximumX, screenX);
            maximumY = Math.max(maximumY, screenY);
        }
        int left = Math.max(0, (int) Math.floor(minimumX) - 2);
        int bottom = Math.max(0, (int) Math.floor(minimumY) - 2);
        int right = Math.min(width, (int) Math.ceil(maximumX) + 2);
        int top = Math.min(height, (int) Math.ceil(maximumY) + 2);
        if (right <= left || top <= bottom) {
            return false;
        }
        destination[0] = left;
        destination[1] = bottom;
        destination[2] = right - left;
        destination[3] = top - bottom;
        return true;
    }

    static void clearFrame() {
        activeEntry = null;
        for (Entry entry : FRAME_ENTRIES) {
            recycleEntry(entry);
        }
        FRAME_ENTRIES.clear();
    }

    static void clearAll() {
        clearFrame();
        ENTRY_POOL.clear();
        PART_POSE_POOL.clear();
        MODEL_BOUNDS.clear();
    }

    private static Entry acquireEntry() {
        Entry entry = ENTRY_POOL.pollFirst();
        return entry == null ? new Entry() : entry;
    }

    private static PartPose acquirePartPose() {
        PartPose pose = PART_POSE_POOL.pollFirst();
        return pose == null ? new PartPose() : pose;
    }

    private static void recycleEntry(Entry entry) {
        for (PartPose pose : entry.parts) {
            pose.clearReferences();
            if (PART_POSE_POOL.size() < MAXIMUM_POOLED_PART_POSES) {
                PART_POSE_POOL.addFirst(pose);
            }
        }
        entry.parts.clear();
        entry.seenParts.clear();
        entry.bounds = null;
        entry.ownerId = 0;
        if (ENTRY_POOL.size() < MAXIMUM_POOLED_ENTRIES) {
            ENTRY_POOL.addFirst(entry);
        }
    }

    static int pooledEntryCount() {
        return ENTRY_POOL.size();
    }

    static int pooledPartPoseCount() {
        return PART_POSE_POOL.size();
    }

    private static Bounds extractBounds(Object model) {
        IdentityHashMap<ModelRendererTurbo, Boolean> seen =
                new IdentityHashMap<ModelRendererTurbo, Boolean>();
        List<ModelRendererTurbo> parts = new ArrayList<ModelRendererTurbo>();
        collectParts(model, parts, seen);
        Bounds bounds = new Bounds();
        for (ModelRendererTurbo part : parts) {
            for (TexturedPolygon polygon : part.faces) {
                if (polygon == null || polygon.vertices == null) {
                    continue;
                }
                for (TexturedVertex vertex : polygon.vertices) {
                    if (vertex == null || vertex.vector3F == null) {
                        continue;
                    }
                    float[] point = {
                        vertex.vector3F.xCoord,
                        vertex.vector3F.yCoord,
                        vertex.vector3F.zCoord
                    };
                    transformPartPoint(part, point);
                    bounds.include(
                            point[0] * MODEL_VERTEX_SCALE,
                            point[1] * MODEL_VERTEX_SCALE,
                            point[2] * MODEL_VERTEX_SCALE);
                }
            }
        }
        return bounds;
    }

    private static void collectParts(
            Object model,
            List<ModelRendererTurbo> destination,
            IdentityHashMap<ModelRendererTurbo, Boolean> seen) {
        for (Class<?> type = model.getClass();
                type != null && type != Object.class;
                type = type.getSuperclass()) {
            for (Field field : type.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                try {
                    field.setAccessible(true);
                    collectValue(field.get(model), destination, seen);
                } catch (Throwable ignored) {
                    // Unsupported legacy fields do not contribute rendered TMT geometry.
                }
            }
        }
    }

    private static void collectValue(
            Object value,
            List<ModelRendererTurbo> destination,
            IdentityHashMap<ModelRendererTurbo, Boolean> seen) {
        if (value instanceof ModelRendererTurbo) {
            ModelRendererTurbo part = (ModelRendererTurbo) value;
            if (seen.put(part, Boolean.TRUE) == null) {
                destination.add(part);
            }
            return;
        }
        if (value instanceof ModelRendererTurbo[]) {
            for (ModelRendererTurbo part : (ModelRendererTurbo[]) value) {
                collectValue(part, destination, seen);
            }
            return;
        }
        if (value instanceof Iterable<?>) {
            for (Object member : (Iterable<?>) value) {
                collectValue(member, destination, seen);
            }
        }
    }

    private static void transformPartPoint(ModelRendererTurbo part, float[] point) {
        rotateX(point, part.rotateAngleX);
        if (part.rotorder) {
            rotateY(point, part.rotateAngleY);
            rotateZ(point, part.rotateAngleZ);
        } else {
            rotateZ(point, part.rotateAngleZ);
            rotateY(point, part.rotateAngleY);
        }
        point[0] += part.rotationPointX;
        point[1] += part.rotationPointY;
        point[2] += part.rotationPointZ;
    }

    private static void rotateX(float[] point, float angle) {
        if (angle == 0.0F) return;
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float y = point[1] * cosine - point[2] * sine;
        float z = point[1] * sine + point[2] * cosine;
        point[1] = y;
        point[2] = z;
    }

    private static void rotateY(float[] point, float angle) {
        if (angle == 0.0F) return;
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float x = point[0] * cosine + point[2] * sine;
        float z = point[2] * cosine - point[0] * sine;
        point[0] = x;
        point[2] = z;
    }

    private static void rotateZ(float[] point, float angle) {
        if (angle == 0.0F) return;
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float x = point[0] * cosine - point[1] * sine;
        float y = point[0] * sine + point[1] * cosine;
        point[0] = x;
        point[1] = y;
    }

    static final class Entry {
        int ownerId;
        Bounds bounds;
        final float[] pose = new float[16];
        final float[] projection = new float[16];
        final List<PartPose> parts = new ArrayList<PartPose>();
        final IdentityHashMap<ModelRendererTurbo, Boolean> seenParts =
                new IdentityHashMap<ModelRendererTurbo, Boolean>();
    }

    static final class PartPose {
        ModelRendererTurbo part;
        float scale;
        boolean rotationOrder;
        float rotationPointX;
        float rotationPointY;
        float rotationPointZ;
        float rotateAngleX;
        float rotateAngleY;
        float rotateAngleZ;
        final float[] parentPose = new float[16];

        void clearReferences() {
            part = null;
        }
    }

    static final class Bounds {
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float minimumZ = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        float maximumZ = Float.NEGATIVE_INFINITY;
        boolean valid;

        void include(float x, float y, float z) {
            minimumX = Math.min(minimumX, x);
            minimumY = Math.min(minimumY, y);
            minimumZ = Math.min(minimumZ, z);
            maximumX = Math.max(maximumX, x);
            maximumY = Math.max(maximumY, y);
            maximumZ = Math.max(maximumZ, z);
            valid = true;
        }
    }
}
