package train.client.render.lighting;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.FloatBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;
import train.common.api.EntityRollingStock;

/**
 * Frame-owned rolling-stock geometry and poses used by beam impact, masks, and shadows.
 *
 * <p>Capture is deliberately allocation-stable: entries are retained per stock identity, part-pose
 * storage is logically reset between frames, and inverse part matrices are constructed only when
 * a center ray reaches that stock. Callers must bracket each rendered vehicle with
 * {@link #beginStock(EntityRollingStock)} and {@link #endStock()}.
 * Three-element geometry arrays use {@code [0] = x}, {@code [1] = y}, and {@code [2] = z}.
 * Sixteen-element matrices use OpenGL column-major order: {@code [0..3]} are column 0,
 * {@code [4..7]} column 1, {@code [8..11]} column 2, and {@code [12..15]} the
 * translation/homogeneous column.
 */
public final class RollingStockLightOcclusion
{
    private static final int MAXIMUM_MODEL_BOUNDS = 256;
    private static final int MAXIMUM_STOCK_ENTRIES = 256;
    private static final float MODEL_VERTEX_SCALE = 0.0625F;
    private static final float MATRIX_DETERMINANT_EPSILON = 1.0E-8F;
    /** Safe broad-phase radius when a model has not supplied usable bounds. */
    private static final float UNKNOWN_STOCK_RADIUS = 16.0F;
    private static final float MINIMUM_STOCK_RADIUS = 2.0F;
    /** Covers tick interpolation and unusual fixture offsets outside extracted model bounds. */
    private static final float STOCK_RADIUS_PADDING = 2.0F;
    /** Prevents rounding from clipping the outermost projected model pixels. */
    private static final int SCREEN_RECTANGLE_PADDING = 2;
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final BoundedIdentityCache<Object, Bounds> MODEL_BOUNDS =
        new BoundedIdentityCache<Object, Bounds>(MAXIMUM_MODEL_BOUNDS);
    private static final List<Entry> FRAME_ENTRIES = new ArrayList<Entry>();
    private static final IdentityHashMap<EntityRollingStock, Entry> STOCK_ENTRIES =
        new IdentityHashMap<EntityRollingStock, Entry>();
    /** Reusable 16-slot matrices following the class-level OpenGL layout. */
    private static final float[] SHARED_PARENT_POSE = new float[16];
    private static final float[] FRAME_PROJECTION = new float[16];
    /** Reusable part-local point: {@code [0] = x}, {@code [1] = y}, {@code [2] = z}. */
    private static final float[] PART_POINT = new float[3];
    private static Entry activeEntry;
    private static boolean sharedPartCapture;
    private static boolean sharedStockRoot;
    private static boolean frameProjectionValid;
    private static long nextCaptureToken = 1L;

    private RollingStockLightOcclusion() {}

    /**
     * Starts frame capture for one rendered stock entity.
     *
     * @param stock entity whose current model-view pose is active
     */
    public static void beginStock(EntityRollingStock stock)
    {
        activeEntry = null;
        sharedPartCapture = false;
        sharedStockRoot = false;
        if (stock == null || stock.modelInstance == null)
        {
            return;
        }
        Bounds bounds = boundsFor(stock.modelInstance);
        if (bounds.valid == false)
        {
            return;
        }
        Entry entry = STOCK_ENTRIES.get(stock);
        if (entry == null)
        {
            // Keep render-loop lookup allocation-free while bounding references to unloaded stock.
            if (STOCK_ENTRIES.size() >= MAXIMUM_STOCK_ENTRIES)
            {
                STOCK_ENTRIES.clear();
            }
            entry = new Entry();
            STOCK_ENTRIES.put(stock, entry);
        }
        entry.parts.reset();
        entry.captureToken = nextCaptureToken++;
        if (nextCaptureToken == 0L)
        {
            nextCaptureToken = 1L;
        }
        entry.ownerId = stock.getEntityId();
        entry.bounds = bounds;
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        MATRIX_BUFFER.get(entry.eyeFromStock);
        if (frameProjectionValid == false)
        {
            if (LightEffectRenderBatch.copyCapturedProjection(FRAME_PROJECTION) == false)
            {
                MATRIX_BUFFER.clear();
                GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, MATRIX_BUFFER);
                MATRIX_BUFFER.rewind();
                MATRIX_BUFFER.get(FRAME_PROJECTION);
            }
            frameProjectionValid = true;
        }
        System.arraycopy(FRAME_PROJECTION, 0, entry.projection, 0, FRAME_PROJECTION.length);
        FRAME_ENTRIES.add(entry);
        activeEntry = entry;
    }

    /** Ends capture for the current stock and clears shared-batch state. */
    public static void endStock()
    {
        activeEntry = null;
        sharedPartCapture = false;
        sharedStockRoot = false;
    }

    /** Conservative world-space radius used before deciding whether stock needs exact capture. */
    static float stockBoundingRadius(EntityRollingStock stock)
    {
        if (stock == null || stock.modelInstance == null)
        {
            return UNKNOWN_STOCK_RADIUS;
        }
        Bounds bounds = boundsFor(stock.modelInstance);
        if (bounds.valid == false)
        {
            return UNKNOWN_STOCK_RADIUS;
        }
        float maximumX = Math.max(Math.abs(bounds.minimumX), Math.abs(bounds.maximumX));
        float maximumY = Math.max(Math.abs(bounds.minimumY), Math.abs(bounds.maximumY));
        float maximumZ = Math.max(Math.abs(bounds.minimumZ), Math.abs(bounds.maximumZ));
        float[] scale = stock.getRenderScale();
        if (scale != null && scale.length >= 3)
        {
            maximumX *= Math.abs(scale[0]);
            maximumY *= Math.abs(scale[1]);
            maximumZ *= Math.abs(scale[2]);
        }
        float radius = (float)Math.sqrt(
                           maximumX * maximumX
                           + maximumY * maximumY
                           + maximumZ * maximumZ);
        float[] offsets = stock.modelOffsets();
        if (offsets != null && offsets.length >= 3)
        {
            radius += (float)Math.sqrt(
                          offsets[0] * offsets[0]
                          + offsets[1] * offsets[1]
                          + offsets[2] * offsets[2]);
        }
        return Math.max(MINIMUM_STOCK_RADIUS, radius + STOCK_RADIUS_PADDING);
    }

    /** Returns cached model-local bounds used as the stock-level broad phase. */
    private static Bounds boundsFor(Object model)
    {
        Bounds bounds = MODEL_BOUNDS.get(model);
        if (bounds == null)
        {
            bounds = extractBounds(model);
            MODEL_BOUNDS.put(model, bounds);
        }
        return bounds;
    }

    /**
     * Captures one parent model-view matrix for a static TMT batch. Every part in that batch still
     * records its own local translation and rotation, but avoids a synchronous GPU matrix readback.
     */
    public static boolean beginSharedPartCapture()
    {
        return beginSharedPartCapture(false);
    }

    /**
     * Captures a parent transform shared by a static TMT batch.
     *
     * @param stockRoot whether parts are immediate children of the captured stock transform
     * @return whether a stock capture is active and the shared batch can be recorded
     */
    public static boolean beginSharedPartCapture(boolean stockRoot)
    {
        if (activeEntry == null)
        {
            return false;
        }
        if (stockRoot)
        {
            System.arraycopy(
                activeEntry.eyeFromStock,
                0,
                SHARED_PARENT_POSE,
                0,
                SHARED_PARENT_POSE.length);
        }
        else
        {
            MATRIX_BUFFER.clear();
            GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
            MATRIX_BUFFER.rewind();
            MATRIX_BUFFER.get(SHARED_PARENT_POSE);
        }
        sharedPartCapture = true;
        sharedStockRoot = stockRoot;
        return true;
    }

    /**
     * Records one static-batch part using the parent pose captured by the matching begin call.
     * Duplicate part identities are rejected by a per-entry capture token on the model part.
     */
    public static void captureSharedPart(
        ModelRendererTurbo part, float scale, boolean rotationOrder)
    {
        Entry entry = activeEntry;
        if (sharedPartCapture == false
                || entry == null
                || part == null
                || part.markRollingStockOcclusionCapture(entry.captureToken) == false)
        {
            return;
        }
        PartPose pose = entry.parts.acquire();
        populatePartPose(
            pose, part, scale, rotationOrder, SHARED_PARENT_POSE, sharedStockRoot);
    }

    /** Ends the shared parent-transform scope opened by {@link #beginSharedPartCapture()}. */
    public static void endSharedPartCapture()
    {
        sharedPartCapture = false;
        sharedStockRoot = false;
    }

    /**
     * Captures one independently rendered TMT part, including its current parent model-view matrix.
     */
    public static void capturePart(ModelRendererTurbo part, float scale, boolean rotationOrder)
    {
        Entry entry = activeEntry;
        if (entry == null
                || part == null
                || part.markRollingStockOcclusionCapture(entry.captureToken) == false)
        {
            return;
        }
        PartPose pose = entry.parts.acquire();
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        MATRIX_BUFFER.get(SHARED_PARENT_POSE);
        populatePartPose(pose, part, scale, rotationOrder, SHARED_PARENT_POSE, false);
    }

    /** Copies final animated TMT pose fields and matrices into one reusable captured part record. */
    private static void populatePartPose(
        PartPose pose,
        ModelRendererTurbo part,
        float scale,
        boolean rotationOrder,
        float[] parentPose,
        boolean stockRootParent)
    {
        pose.part = part;
        pose.scale = scale;
        pose.rotationOrder = rotationOrder;
        pose.rotationPointX = part.rotationPointX;
        pose.rotationPointY = part.rotationPointY;
        pose.rotationPointZ = part.rotationPointZ;
        pose.rotateAngleX = part.rotateAngleX;
        pose.rotateAngleY = part.rotateAngleY;
        pose.rotateAngleZ = part.rotateAngleZ;
        pose.stockRootParent = stockRootParent;
        System.arraycopy(parentPose, 0, pose.parentPose, 0, pose.parentPose.length);
        // Most captured stock never intersects a beam. Build inverse matrices lazily only for
        // parts belonging to an exact center-ray candidate, then reuse them for all frame beams.
        pose.matricesValid = false;
    }

    /** Builds the part-to-stock transform for a part captured directly below the stock root. */
    static boolean populateRootPartMatrix(PartPose pose, float[] matrix)
    {
        if (pose == null || matrix == null || matrix.length < 16)
        {
            return false;
        }
        float cosineX = pose.rotateAngleX == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleX);
        float sineX = pose.rotateAngleX == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleX);
        float cosineY = pose.rotateAngleY == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleY);
        float sineY = pose.rotateAngleY == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleY);
        float cosineZ = pose.rotateAngleZ == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleZ);
        float sineZ = pose.rotateAngleZ == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleZ);
        transformLocal(
            pose, 1, 0, 0, cosineX, sineX, cosineY, sineY, cosineZ, sineZ, PART_POINT);
        matrix[0] = PART_POINT[0];
        matrix[1] = PART_POINT[1];
        matrix[2] = PART_POINT[2];
        transformLocal(
            pose, 0, 1, 0, cosineX, sineX, cosineY, sineY, cosineZ, sineZ, PART_POINT);
        matrix[4] = PART_POINT[0];
        matrix[5] = PART_POINT[1];
        matrix[6] = PART_POINT[2];
        transformLocal(
            pose, 0, 0, 1, cosineX, sineX, cosineY, sineY, cosineZ, sineZ, PART_POINT);
        matrix[8] = PART_POINT[0];
        matrix[9] = PART_POINT[1];
        matrix[10] = PART_POINT[2];
        matrix[3] = 0.0F;
        matrix[7] = 0.0F;
        matrix[11] = 0.0F;
        matrix[12] = pose.rotationPointX * pose.scale;
        matrix[13] = pose.rotationPointY * pose.scale;
        matrix[14] = pose.rotationPointZ * pose.scale;
        matrix[15] = 1.0F;
        return true;
    }

    /**
     * Lazily derives both eye-from-local and local-from-eye matrices for one captured part.
     *
     * @return whether the part transform was invertible and both matrices are available
     */
    static boolean ensurePartMatrices(PartPose pose)
    {
        if (pose == null)
        {
            return false;
        }
        if (pose.matricesValid == false)
        {
            populatePartMatrices(pose);
        }
        return pose.matricesValid;
    }

    /** Builds both affine directions for one captured animated part pose. */
    private static void populatePartMatrices(PartPose pose)
    {
        float cosineX = pose.rotateAngleX == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleX);
        float sineX = pose.rotateAngleX == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleX);
        float cosineY = pose.rotateAngleY == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleY);
        float sineY = pose.rotateAngleY == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleY);
        float cosineZ = pose.rotateAngleZ == 0.0F ? 1.0F : (float) Math.cos(pose.rotateAngleZ);
        float sineZ = pose.rotateAngleZ == 0.0F ? 0.0F : (float) Math.sin(pose.rotateAngleZ);
        float[] matrix = pose.eyeFromLocal;
        transformPartPoint(
            pose, 0, 0, 0,
            cosineX, sineX, cosineY, sineY, cosineZ, sineZ,
            matrix, 12);
        transformPartDirection(
            pose, 1, 0, 0,
            cosineX, sineX, cosineY, sineY, cosineZ, sineZ,
            matrix, 0);
        transformPartDirection(
            pose, 0, 1, 0,
            cosineX, sineX, cosineY, sineY, cosineZ, sineZ,
            matrix, 4);
        transformPartDirection(
            pose, 0, 0, 1,
            cosineX, sineX, cosineY, sineY, cosineZ, sineZ,
            matrix, 8);
        matrix[3] = 0.0F;
        matrix[7] = 0.0F;
        matrix[11] = 0.0F;
        matrix[15] = 1.0F;
        pose.matricesValid = invertAffine(matrix, pose.localFromEye);
    }

    /** Transforms one model-local point through the captured part pose into stock-local space. */
    private static void transformPartPoint(
        PartPose pose, float x, float y, float z,
        float cosineX, float sineX, float cosineY, float sineY,
        float cosineZ, float sineZ, float[] output, int offset)
    {
        float[] local = PART_POINT;
        transformLocal(
            pose, x, y, z, cosineX, sineX, cosineY, sineY, cosineZ, sineZ, local);
        local[0] += pose.rotationPointX * pose.scale;
        local[1] += pose.rotationPointY * pose.scale;
        local[2] += pose.rotationPointZ * pose.scale;
        output[offset] = transformX(pose.parentPose, local[0], local[1], local[2]);
        output[offset + 1] = transformY(pose.parentPose, local[0], local[1], local[2]);
        output[offset + 2] = transformZ(pose.parentPose, local[0], local[1], local[2]);
    }

    /** Transforms one model-local direction through the captured part rotation and scale. */
    private static void transformPartDirection(
        PartPose pose, float x, float y, float z,
        float cosineX, float sineX, float cosineY, float sineY,
        float cosineZ, float sineZ, float[] output, int offset)
    {
        float[] local = PART_POINT;
        transformLocal(
            pose, x, y, z, cosineX, sineX, cosineY, sineY, cosineZ, sineZ, local);
        output[offset] = pose.parentPose[0] * local[0]
                         + pose.parentPose[4] * local[1]
                         + pose.parentPose[8] * local[2];
        output[offset + 1] = pose.parentPose[1] * local[0]
                             + pose.parentPose[5] * local[1]
                             + pose.parentPose[9] * local[2];
        output[offset + 2] = pose.parentPose[2] * local[0]
                             + pose.parentPose[6] * local[1]
                             + pose.parentPose[10] * local[2];
    }

    /** Applies the captured TMT rotation order to one local vector without allocating. */
    private static void transformLocal(
        PartPose pose, float x, float y, float z,
        float cosineX, float sineX, float cosineY, float sineY,
        float cosineZ, float sineZ, float[] output)
    {
        x *= pose.scale;
        y *= pose.scale;
        z *= pose.scale;
        float rotatedY = y * cosineX - z * sineX;
        z = y * sineX + z * cosineX;
        y = rotatedY;
        if (pose.rotationOrder)
        {
            float rotatedX = x * cosineY + z * sineY;
            z = z * cosineY - x * sineY;
            x = rotatedX;
            rotatedX = x * cosineZ - y * sineZ;
            y = x * sineZ + y * cosineZ;
            x = rotatedX;
        }
        else
        {
            float rotatedX = x * cosineZ - y * sineZ;
            y = x * sineZ + y * cosineZ;
            x = rotatedX;
            rotatedX = x * cosineY + z * sineY;
            z = z * cosineY - x * sineY;
            x = rotatedX;
        }
        output[0] = x;
        output[1] = y;
        output[2] = z;
    }

    /** Inverts a column-major affine matrix, returning false when its linear part is singular. */
    private static boolean invertAffine(float[] matrix, float[] inverse)
    {
        float matrix00 = matrix[0];
        float matrix01 = matrix[4];
        float matrix02 = matrix[8];
        float matrix10 = matrix[1];
        float matrix11 = matrix[5];
        float matrix12 = matrix[9];
        float matrix20 = matrix[2];
        float matrix21 = matrix[6];
        float matrix22 = matrix[10];
        float determinant =
            matrix00 * (matrix11 * matrix22 - matrix12 * matrix21)
            - matrix01 * (matrix10 * matrix22 - matrix12 * matrix20)
            + matrix02 * (matrix10 * matrix21 - matrix11 * matrix20);
        if (Math.abs(determinant) <= MATRIX_DETERMINANT_EPSILON)
        {
            return false;
        }
        float inverseDeterminant = 1.0F / determinant;
        float inverse00 =
            (matrix11 * matrix22 - matrix12 * matrix21) * inverseDeterminant;
        float inverse01 =
            (matrix02 * matrix21 - matrix01 * matrix22) * inverseDeterminant;
        float inverse02 =
            (matrix01 * matrix12 - matrix02 * matrix11) * inverseDeterminant;
        float inverse10 =
            (matrix12 * matrix20 - matrix10 * matrix22) * inverseDeterminant;
        float inverse11 =
            (matrix00 * matrix22 - matrix02 * matrix20) * inverseDeterminant;
        float inverse12 =
            (matrix02 * matrix10 - matrix00 * matrix12) * inverseDeterminant;
        float inverse20 =
            (matrix10 * matrix21 - matrix11 * matrix20) * inverseDeterminant;
        float inverse21 =
            (matrix01 * matrix20 - matrix00 * matrix21) * inverseDeterminant;
        float inverse22 =
            (matrix00 * matrix11 - matrix01 * matrix10) * inverseDeterminant;
        inverse[0] = inverse00;
        inverse[4] = inverse01;
        inverse[8] = inverse02;
        inverse[1] = inverse10;
        inverse[5] = inverse11;
        inverse[9] = inverse12;
        inverse[2] = inverse20;
        inverse[6] = inverse21;
        inverse[10] = inverse22;
        inverse[3] = 0.0F;
        inverse[7] = 0.0F;
        inverse[11] = 0.0F;
        float translationX = matrix[12];
        float translationY = matrix[13];
        float translationZ = matrix[14];
        inverse[12] = -(
            inverse00 * translationX
            + inverse01 * translationY
            + inverse02 * translationZ);
        inverse[13] = -(
            inverse10 * translationX
            + inverse11 * translationY
            + inverse12 * translationZ);
        inverse[14] = -(
            inverse20 * translationX
            + inverse21 * translationY
            + inverse22 * translationZ);
        inverse[15] = 1.0F;
        return true;
    }

    /** Calculates the transformed x component of one affine point. */
    private static float transformX(float[] matrix, float x, float y, float z)
    {
        return matrix[0] * x + matrix[4] * y + matrix[8] * z + matrix[12];
    }

    /** Calculates the transformed y component of one affine point. */
    private static float transformY(float[] matrix, float x, float y, float z)
    {
        return matrix[1] * x + matrix[5] * y + matrix[9] * z + matrix[13];
    }

    /** Calculates the transformed z component of one affine point. */
    private static float transformZ(float[] matrix, float x, float y, float z)
    {
        return matrix[2] * x + matrix[6] * y + matrix[10] * z + matrix[14];
    }

    /** @return live frame-owned entries; callers must not retain or mutate the returned list */
    static List<Entry> entries()
    {
        return FRAME_ENTRIES;
    }

    /**
     * Projects the active stock bounds to a conservative viewport rectangle.
     *
     * <p>If any corner crosses the camera plane, the full viewport is returned because a clipped
     * rectangle could omit visible geometry.
     *
     * @return whether a nonempty rectangle was written as x, y, width, and height
     */
    static boolean activeScreenRectangle(int width, int height, int[] destination)
    {
        Entry entry = activeEntry;
        if (entry == null || width <= 0 || height <= 0)
        {
            return false;
        }
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        for (int corner = 0; corner < 8; corner++)
        {
            float x = (corner & 1) == 0 ? entry.bounds.minimumX : entry.bounds.maximumX;
            float y = (corner & 2) == 0 ? entry.bounds.minimumY : entry.bounds.maximumY;
            float z = (corner & 4) == 0 ? entry.bounds.minimumZ : entry.bounds.maximumZ;
            float eyeX = transformX(entry.eyeFromStock, x, y, z);
            float eyeY = transformY(entry.eyeFromStock, x, y, z);
            float eyeZ = transformZ(entry.eyeFromStock, x, y, z);
            float eyeW = entry.eyeFromStock[3] * x
                         + entry.eyeFromStock[7] * y
                         + entry.eyeFromStock[11] * z
                         + entry.eyeFromStock[15];
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
            if (clipW <= 1.0E-5F)
            {
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
        int left = Math.max(0, (int) Math.floor(minimumX) - SCREEN_RECTANGLE_PADDING);
        int bottom = Math.max(0, (int) Math.floor(minimumY) - SCREEN_RECTANGLE_PADDING);
        int right = Math.min(width, (int) Math.ceil(maximumX) + SCREEN_RECTANGLE_PADDING);
        int top = Math.min(height, (int) Math.ceil(maximumY) + SCREEN_RECTANGLE_PADDING);
        if (right <= left || top <= bottom)
        {
            return false;
        }
        destination[0] = left;
        destination[1] = bottom;
        destination[2] = right - left;
        destination[3] = top - bottom;
        return true;
    }

    /** Releases all current-frame references while retaining bounded per-stock pose storage. */
    static void clearFrame()
    {
        activeEntry = null;
        sharedPartCapture = false;
        sharedStockRoot = false;
        FRAME_ENTRIES.clear();
        frameProjectionValid = false;
    }

    /** Clears frame state and every model/stock cache during world or resource cleanup. */
    static void clearAll()
    {
        clearFrame();
        STOCK_ENTRIES.clear();
        MODEL_BOUNDS.clear();
    }

    static int pooledEntryCount()
    {
        return STOCK_ENTRIES.size();
    }

    static int pooledPartPoseCount()
    {
        int count = 0;
        for (Entry entry : STOCK_ENTRIES.values())
        {
            count += entry.parts.capacity();
        }
        return count;
    }

    private static Bounds extractBounds(Object model)
    {
        IdentityHashMap<ModelRendererTurbo, Boolean> seen =
            new IdentityHashMap<ModelRendererTurbo, Boolean>();
        List<ModelRendererTurbo> parts = new ArrayList<ModelRendererTurbo>();
        collectParts(model, parts, seen);
        Bounds bounds = new Bounds();
        for (ModelRendererTurbo part : parts)
        {
            for (TexturedPolygon polygon : part.faces)
            {
                if (polygon == null || polygon.vertices == null)
                {
                    continue;
                }
                for (TexturedVertex vertex : polygon.vertices)
                {
                    if (vertex == null || vertex.vector3F == null)
                    {
                        continue;
                    }
                    float[] point =
                    {
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
        IdentityHashMap<ModelRendererTurbo, Boolean> seen)
    {
        for (Class<?> type = model.getClass();
                type != null && type != Object.class;
                type = type.getSuperclass())
        {
            for (Field field : type.getDeclaredFields())
            {
                if (Modifier.isStatic(field.getModifiers()))
                {
                    continue;
                }
                try
                {
                    field.setAccessible(true);
                    collectValue(field.get(model), destination, seen);
                }
                catch (IllegalAccessException ignored)
                {
                    // Inaccessible optional model fields do not contribute captured TMT geometry.
                }
            }
        }
    }

    private static void collectValue(
        Object value,
        List<ModelRendererTurbo> destination,
        IdentityHashMap<ModelRendererTurbo, Boolean> seen)
    {
        if (value instanceof ModelRendererTurbo)
        {
            ModelRendererTurbo part = (ModelRendererTurbo) value;
            if (seen.put(part, Boolean.TRUE) == null)
            {
                destination.add(part);
            }
            return;
        }
        if (value instanceof ModelRendererTurbo[])
        {
            for (ModelRendererTurbo part : (ModelRendererTurbo[]) value)
            {
                collectValue(part, destination, seen);
            }
            return;
        }
        if (value instanceof Iterable<?>)
        {
            for (Object member : (Iterable<?>) value)
            {
                collectValue(member, destination, seen);
            }
        }
    }

    private static void transformPartPoint(ModelRendererTurbo part, float[] point)
    {
        rotateX(point, part.rotateAngleX);
        if (part.rotorder)
        {
            rotateY(point, part.rotateAngleY);
            rotateZ(point, part.rotateAngleZ);
        }
        else
        {
            rotateZ(point, part.rotateAngleZ);
            rotateY(point, part.rotateAngleY);
        }
        point[0] += part.rotationPointX;
        point[1] += part.rotationPointY;
        point[2] += part.rotationPointZ;
    }

    private static void rotateX(float[] point, float angle)
    {
        if (angle == 0.0F)
        {
            return;
        }
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float y = point[1] * cosine - point[2] * sine;
        float z = point[1] * sine + point[2] * cosine;
        point[1] = y;
        point[2] = z;
    }

    private static void rotateY(float[] point, float angle)
    {
        if (angle == 0.0F)
        {
            return;
        }
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float x = point[0] * cosine + point[2] * sine;
        float z = point[2] * cosine - point[0] * sine;
        point[0] = x;
        point[2] = z;
    }

    private static void rotateZ(float[] point, float angle)
    {
        if (angle == 0.0F)
        {
            return;
        }
        float cosine = (float) Math.cos(angle);
        float sine = (float) Math.sin(angle);
        float x = point[0] * cosine - point[1] * sine;
        float y = point[0] * sine + point[1] * cosine;
        point[0] = x;
        point[1] = y;
    }

    /**
     * One vehicle captured in the current frame.
     *
     * <p>{@code eyeFromStock} transforms model-local stock coordinates into capture-time eye space;
     * {@code projection} is the matching projection matrix. Part poses are retained between frames
     * but logically reset whenever the vehicle begins a new capture.
     */
    static final class Entry
    {
        int ownerId;
        long captureToken;
        Bounds bounds;
        /** Both arrays use the class-level 16-slot OpenGL column-major matrix layout. */
        final float[] eyeFromStock = new float[16];
        final float[] projection = new float[16];
        final ReusablePartPoseList parts = new ReusablePartPoseList();
    }

    /** Array-backed logical list whose reset retains pose objects for the next frame. */
    static final class ReusablePartPoseList extends AbstractList<PartPose>
    {
        private final ArrayList<PartPose> storage = new ArrayList<PartPose>();
        private int logicalSize;

        /** Returns a retained pose slot and advances the logical size without allocating if possible. */
        PartPose acquire()
        {
            PartPose pose;
            if (logicalSize < storage.size())
            {
                pose = storage.get(logicalSize);
            }
            else
            {
                pose = new PartPose();
                storage.add(pose);
            }
            logicalSize++;
            modCount++;
            return pose;
        }

        /** Makes every retained slot available to the next stock capture. */
        void reset()
        {
            logicalSize = 0;
            modCount++;
        }

        /** @return number of retained pose objects, including currently inactive slots */
        int capacity()
        {
            return storage.size();
        }

        @Override
        public PartPose get(int index)
        {
            if (index < 0 || index >= logicalSize)
            {
                throw new IndexOutOfBoundsException(String.valueOf(index));
            }
            return storage.get(index);
        }

        @Override
        public int size()
        {
            return logicalSize;
        }

        @Override
        public boolean add(PartPose pose)
        {
            if (logicalSize < storage.size())
            {
                storage.set(logicalSize, pose);
            }
            else
            {
                storage.add(pose);
            }
            logicalSize++;
            modCount++;
            return true;
        }
    }

    /**
     * Captured model-part animation state plus lazily derived eye/local transforms.
     *
     * <p>{@code parentPose} is the eye-from-parent matrix captured during model rendering.
     * {@code eyeFromLocal} and {@code localFromEye} are populated together only when an exact
     * center-ray candidate reaches this part.
     */
    static final class PartPose
    {
        ModelRendererTurbo part;
        float scale;
        boolean rotationOrder;
        float rotationPointX;
        float rotationPointY;
        float rotationPointZ;
        float rotateAngleX;
        float rotateAngleY;
        float rotateAngleZ;
        /** All three arrays use the class-level 16-slot OpenGL column-major matrix layout. */
        final float[] parentPose = new float[16];
        final float[] eyeFromLocal = new float[16];
        final float[] localFromEye = new float[16];
        boolean matricesValid;
        boolean stockRootParent;

    }

    /** Model-local axis-aligned bounds retained per shared rolling-stock model instance. */
    static final class Bounds
    {
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float minimumZ = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        float maximumZ = Float.NEGATIVE_INFINITY;
        boolean valid;

        void include(float x, float y, float z)
        {
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
