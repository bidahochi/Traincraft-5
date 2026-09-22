package train.client.render;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.translucency.TmtTranslucencyContext;
import train.common.api.EntityRollingStock;

/**
 * End-of-world queue for rolling-stock pixels with partial alpha.
 *
 * <p>Entity render order is not a transparency order: tracks, mobs, and other stock may render
 * after a particular vehicle. This queue captures the vehicle transform during its normal render
 * and replays translucent faces after opaque world and entity rendering. Entries are sorted
 * far-to-near at vehicle granularity; individual faces remain in model order.</p>
 *
 * <p>The queue is render-thread owned. It deliberately contains the entity, camera-distance,
 * lightmap, and world-phase policy which does not belong in the reusable TMT translucency
 * context.</p>
 */
public final class RollingStockTranslucencyQueue
{
    private static final Comparator<Entry> FAR_TO_NEAR = new Comparator<Entry>()
    {
        @Override
        public int compare(Entry left, Entry right)
        {
            return compareDistances(left.distanceSquared, right.distanceSquared);
        }
    };
    private static final List<Entry> QUEUE = new ArrayList<Entry>();
    private static final FloatBuffer MODEL_VIEW_BUFFER = BufferUtils.createFloatBuffer(16);

    private RollingStockTranslucencyQueue() {}

    /**
     * Captures one rolling-stock draw for translucent replay at the end of the current world
     * frame. Invalid or not-yet-instantiated stock is ignored.
     *
     * @param stock rendered vehicle whose model will be replayed
     * @param texture base texture bound before model-specific texture swaps
     * @param packedLight packed block/sky lightmap value used by the opaque draw
     */
    public static void submit(EntityRollingStock stock, ResourceLocation texture, int packedLight)
    {
        if (stock == null || stock.modelInstance == null || texture == null)
        {
            return;
        }
        MODEL_VIEW_BUFFER.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODEL_VIEW_BUFFER);
        float[] modelView = new float[16];
        MODEL_VIEW_BUFFER.get(modelView);
        double cameraX = TileEntityRendererDispatcher.staticPlayerX;
        double cameraY = TileEntityRendererDispatcher.staticPlayerY;
        double cameraZ = TileEntityRendererDispatcher.staticPlayerZ;
        double offsetX = stock.posX - cameraX;
        double offsetY = stock.posY - cameraY;
        double offsetZ = stock.posZ - cameraZ;
        QUEUE.add(new Entry(
            stock,
            texture,
            packedLight,
            modelView,
            offsetX * offsetX + offsetY * offsetY + offsetZ * offsetZ));
    }

    /**
     * Replays and releases every queued stock draw, ordered far-to-near.
     *
     * <p>This must run after opaque world/entity rendering and before Traincraft's enhanced-light
     * effects. It restores the previous OpenGL attribute, model-view, matrix-mode, and lightmap
     * state in a {@code finally} block and clears queued entity references even when replay fails.</p>
     */
    public static void flush()
    {
        if (QUEUE.isEmpty())
        {
            return;
        }
        Collections.sort(QUEUE, FAR_TO_NEAR);

        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        float oldLightX = OpenGlHelper.lastBrightnessX;
        float oldLightY = OpenGlHelper.lastBrightnessY;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try
        {
            TmtTranslucencyContext.beginReplay();
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_LESS, 1.0F);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(false);
            for (Entry entry : QUEUE)
            {
                MODEL_VIEW_BUFFER.clear();
                MODEL_VIEW_BUFFER.put(entry.modelView);
                MODEL_VIEW_BUFFER.flip();
                GL11.glLoadMatrix(MODEL_VIEW_BUFFER);
                OpenGlHelper.setLightmapTextureCoords(
                    OpenGlHelper.lightmapTexUnit,
                    entry.packedLight % 65536,
                    entry.packedLight / 65536.0F);
                Tessellator.bindTexture(entry.texture);
                RenderRollingStock.renderModelGeometry(entry.stock);
            }
        }
        finally
        {
            TmtTranslucencyContext.endReplay();
            QUEUE.clear();
            OpenGlHelper.setLightmapTextureCoords(
                OpenGlHelper.lightmapTexUnit, oldLightX, oldLightY);
            GL11.glPopMatrix();
            GL11.glMatrixMode(matrixMode);
            GL11.glPopAttrib();
        }
    }

    /**
     * Releases all frame-owned stock references without rendering them.
     * Used during resource reload so entries captured against old textures cannot be replayed.
     */
    public static void clear()
    {
        QUEUE.clear();
    }

    /**
     * Compares squared camera distances in descending order.
     *
     * @param left first squared distance
     * @param right second squared distance
     * @return comparator result which places the farther value first
     */
    static int compareDistances(double left, double right)
    {
        return Double.compare(right, left);
    }

    private static final class Entry
    {
        private final EntityRollingStock stock;
        private final ResourceLocation texture;
        private final int packedLight;
        private final float[] modelView;
        private final double distanceSquared;

        private Entry(
            EntityRollingStock stock,
            ResourceLocation texture,
            int packedLight,
            float[] modelView,
            double distanceSquared)
        {
            this.stock = stock;
            this.texture = texture;
            this.packedLight = packedLight;
            this.modelView = modelView;
            this.distanceSquared = distanceSquared;
        }
    }
}
