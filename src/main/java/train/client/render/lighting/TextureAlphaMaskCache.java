package train.client.render.lighting;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import tmt.TexturedPolygon;
import train.common.api.RollingStockLightDefinition;
import train.client.render.translucency.ITranslucentFaceFilter;

/**
 * Bounded asynchronous texture-alpha analysis shared by resolved skin lighting and TMT
 * translucency.
 *
 * <p>Lighting visibility waits for a ready mask so effects cannot flash incorrectly. Translucency
 * queries fail open while pending or unreadable so partially transparent geometry cannot vanish.
 * Generated overlay textures register their composed pixels directly through {@link #register}.</p>
 */
public final class TextureAlphaMaskCache
{
    private static final float MINIMUM_UV_SPAN = 1.0E-7F;
    private static final float EDGE_TEST_EPSILON = 1.0E-6F;
    static final int MAXIMUM_MASKS = 256;
    static final long IDLE_MINUTES = 10L;
    private static final int MAXIMUM_VISIBILITY_RESULTS = 4096;
    private static final Cache<ResourceLocation, Entry> CACHE =
        CacheBuilder.newBuilder()
        .maximumSize(MAXIMUM_MASKS)
        .expireAfterAccess(IDLE_MINUTES, TimeUnit.MINUTES)
        .build();
    private static volatile int resourceGeneration;

    private TextureAlphaMaskCache() {}

    /**
     * Tests normalized fixture UV regions against a cached texture alpha mask. A pending
     * asynchronous load returns false so texture-dependent effects cannot flash incorrectly.
     */
    public static boolean visible(
        final ResourceLocation texture,
        List<RollingStockLightDefinition.UvRegion> regions)
    {
        if (texture == null || regions == null || regions.isEmpty())
        {
            return true;
        }
        Entry entry = request(texture);
        Mask mask = entry.ready;
        return mask != null && mask.isVisible(regions);
    }

    /** Tests all retained faces of a detected surface against the cached texture alpha mask. */
    public static boolean visible(
        final ResourceLocation texture,
        DetectedLightSurface surface)
    {
        if (texture == null || surface == null)
        {
            return true;
        }
        Entry entry = request(texture);
        Mask mask = entry == null ? null : entry.ready;
        return mask != null && mask.isVisible(surface);
    }

    /** Tests one detected face and its per-vertex UV coverage against the cached alpha mask. */
    public static boolean visible(
        final ResourceLocation texture,
        DetectedLightFace face)
    {
        if (texture == null || face == null)
        {
            return true;
        }
        Entry entry = request(texture);
        Mask mask = entry == null ? null : entry.ready;
        return mask != null && mask.isVisible(face);
    }

    private static Entry request(final ResourceLocation texture)
    {
        if (texture == null)
        {
            return null;
        }
        final int generation = resourceGeneration;
        Entry entry = CACHE.getIfPresent(texture);
        if (entry != null)
        {
            return entry;
        }

        final Entry pending = new Entry();
        Entry raced = CACHE.asMap().putIfAbsent(texture, pending);
        entry = raced == null ? pending : raced;
        if (raced == null)
        {
            try
            {
                LightingTextureAnalysisService.execute(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Mask loaded = load(texture);
                        if (resourceGeneration == generation)
                        {
                            pending.complete(loaded);
                        }
                    }
                });
            }
            catch (RejectedExecutionException rejected)
            {
                pending.complete(Mask.PERMISSIVE);
            }
        }
        return entry;
    }

    /**
     * Supplies pixels for a client-generated texture which cannot be reopened
     * through the resource manager. This is the 1.7 overlay-texture adapter for
     * the skin alpha-mask pipeline.
     *
     * @param texture generated texture identity
     * @param image final composed pixels registered under that identity
     */
    public static void register(ResourceLocation texture, BufferedImage image)
    {
        if (texture == null || image == null)
        {
            return;
        }
        if (CACHE.getIfPresent(texture) != null)
        {
            return;
        }
        Entry ready = new Entry();
        ready.complete(mask(image));
        CACHE.asMap().putIfAbsent(texture, ready);
    }

    /**
     * Advances the resource generation, cancels pending work, and invalidates all masks and
     * derived visibility results.
     */
    public static void clear()
    {
        resourceGeneration++;
        LightingTextureAnalysisService.clearPending();
        CACHE.invalidateAll();
        CACHE.cleanUp();
    }

    static long size()
    {
        CACHE.cleanUp();
        return CACHE.size();
    }

    static int resourceGeneration()
    {
        return resourceGeneration;
    }

    static boolean ready(ResourceLocation texture)
    {
        if (texture == null)
        {
            return true;
        }
        Entry entry = CACHE.getIfPresent(texture);
        return entry != null && entry.ready != null;
    }

    /**
     * Conservatively reports whether a texture may require a translucent TMT replay pass.
     * Pending and unreadable textures return true so asynchronous analysis cannot hide glass.
     *
     * @param texture resolved texture identity
     * @return {@code false} only when a ready, readable mask proves the texture contains no alpha
     *         values from {@code 1} through {@code 254}
     */
    public static boolean mayContainTranslucentPixels(ResourceLocation texture)
    {
        if (texture == null)
        {
            return true;
        }
        Entry entry = request(texture);
        Mask mask = entry == null ? null : entry.ready;
        return mask == null || mask.mayContainTranslucentPixels();
    }

    /**
     * Resolves one reusable per-texture face filter. Callers should retain it while the same
     * texture remains bound instead of performing a cache lookup for every polygon.
     *
     * @param texture resolved texture identity
     * @return immutable-query filter backed by the ready mask, or {@code null} when filtering is
     *         unsafe and the caller must preserve complete geometry
     */
    public static ITranslucentFaceFilter translucentFaceFilter(ResourceLocation texture)
    {
        if (texture == null)
        {
            return null;
        }
        Entry entry = request(texture);
        Mask mask = entry == null ? null : entry.ready;
        return mask == null || mask.permissive ? null : mask;
    }

    /**
     * Reports whether a TMT polygon covers any explicit partial-alpha source texel.
     * Invalid dimensions, alpha data, polygons, or UVs return {@code true} to fail open.
     *
     * @param width source texture width in pixels
     * @param height source texture height in pixels
     * @param alpha row-major unsigned alpha bytes
     * @param polygon polygon with normalized per-vertex UV coordinates
     * @return {@code true} when alpha {@code 1-254} lies inside the polygon or analysis is unsafe
     */
    static boolean containsTranslucentPixels(
        int width,
        int height,
        byte[] alpha,
        TexturedPolygon polygon)
    {
        if (width <= 0
                || height <= 0
                || alpha == null
                || alpha.length < width * height
                || polygon == null
                || polygon.vertices == null
                || polygon.vertices.length < 3)
        {
            return true;
        }
        float[] polygonU = new float[polygon.vertices.length];
        float[] polygonV = new float[polygon.vertices.length];
        float minimumU = Float.POSITIVE_INFINITY;
        float maximumU = Float.NEGATIVE_INFINITY;
        float minimumV = Float.POSITIVE_INFINITY;
        float maximumV = Float.NEGATIVE_INFINITY;
        for (int index = 0; index < polygon.vertices.length; index++)
        {
            tmt.TexturedVertex vertex = polygon.vertices[index];
            if (vertex == null
                    || finite(vertex.textureX) == false
                    || finite(vertex.textureY) == false
                    || vertex.textureX < 0.0F
                    || vertex.textureX > 1.0F
                    || vertex.textureY < 0.0F
                    || vertex.textureY > 1.0F)
            {
                return true;
            }
            polygonU[index] = vertex.textureX;
            polygonV[index] = vertex.textureY;
            minimumU = Math.min(minimumU, vertex.textureX);
            maximumU = Math.max(maximumU, vertex.textureX);
            minimumV = Math.min(minimumV, vertex.textureY);
            maximumV = Math.max(maximumV, vertex.textureY);
        }
        if (maximumU - minimumU <= MINIMUM_UV_SPAN
                || maximumV - minimumV <= MINIMUM_UV_SPAN)
        {
            return true;
        }
        int minimumX = Math.max(0, (int)Math.floor(minimumU * width));
        int maximumX = Math.min(width - 1, (int)Math.ceil(maximumU * width) - 1);
        int minimumY = Math.max(0, (int)Math.floor(minimumV * height));
        int maximumY = Math.min(height - 1, (int)Math.ceil(maximumV * height) - 1);
        for (int y = minimumY; y <= maximumY; y++)
        {
            float v = (y + 0.5F) / height;
            for (int x = minimumX; x <= maximumX; x++)
            {
                int value = alpha[y * width + x] & 255;
                if (value > 0
                        && value < 255
                        && insidePolygon((x + 0.5F) / width, v, polygonU, polygonV))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean finite(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    private static boolean insidePolygon(float u, float v, float[] polygonU, float[] polygonV)
    {
        boolean inside = false;
        int previous = polygonU.length - 1;
        for (int current = 0; current < polygonU.length; current++)
        {
            float currentU = polygonU[current];
            float currentV = polygonV[current];
            float previousU = polygonU[previous];
            float previousV = polygonV[previous];
            if (onSegment(u, v, previousU, previousV, currentU, currentV))
            {
                return true;
            }
            boolean crosses = (currentV > v) != (previousV > v);
            if (crosses
                    && u
                    < (previousU - currentU)
                    * (v - currentV)
                    / (previousV - currentV)
                    + currentU)
            {
                inside = inside == false;
            }
            previous = current;
        }
        return inside;
    }

    private static boolean onSegment(
        float u,
        float v,
        float startU,
        float startV,
        float endU,
        float endV)
    {
        float edgeU = endU - startU;
        float edgeV = endV - startV;
        float pointU = u - startU;
        float pointV = v - startV;
        float cross = edgeU * pointV - edgeV * pointU;
        if (Math.abs(cross) > EDGE_TEST_EPSILON)
        {
            return false;
        }
        float dot = pointU * edgeU + pointV * edgeV;
        float lengthSquared = edgeU * edgeU + edgeV * edgeV;
        return dot >= -EDGE_TEST_EPSILON && dot <= lengthSquared + EDGE_TEST_EPSILON;
    }

    private static Mask load(ResourceLocation texture)
    {
        try
            (InputStream stream =
                        Minecraft.getMinecraft()
                        .getResourceManager()
                        .getResource(texture)
                        .getInputStream())
        {
            BufferedImage image = ImageIO.read(stream);
            if (image == null)
            {
                return Mask.PERMISSIVE;
            }
            return mask(image);
        }
        catch (IOException ignored)
        {
            // Missing/unreadable metadata must not permanently remove lights.
            return Mask.PERMISSIVE;
        }

    }

    private static Mask mask(BufferedImage image)
    {
        int width = image.getWidth();
        int height = image.getHeight();
        byte[] alpha = new byte[width * height];
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                alpha[y * width + x] = (byte)(image.getRGB(x, y) >>> 24);
            }
        }
        return new Mask(width, height, alpha, false);
    }

    private static final class Entry
    {
        volatile Mask ready;

        void complete(Mask value)
        {
            ready = value;
        }
    }

    static final class Mask implements ITranslucentFaceFilter
    {
        static final Mask PERMISSIVE = new Mask(0, 0, new byte[0], true);
        final int width;
        final int height;
        final byte[] alpha;
        final boolean permissive;
        final boolean hasTranslucentPixels;
        private final Map<DetectedLightSurface, Boolean> surfaceVisibility =
            new IdentityHashMap<DetectedLightSurface, Boolean>();
        private final Map<DetectedLightFace, Boolean> faceVisibility =
            new IdentityHashMap<DetectedLightFace, Boolean>();
        private final Map<TexturedPolygon, Boolean> translucentFaces =
            new IdentityHashMap<TexturedPolygon, Boolean>();
        private final Map<List<TexturedPolygon>, List<TexturedPolygon>> translucentFaceLists =
            new IdentityHashMap<List<TexturedPolygon>, List<TexturedPolygon>>();

        Mask(int width, int height, byte[] alpha, boolean permissive)
        {
            this.width = width;
            this.height = height;
            this.alpha = alpha;
            this.permissive = permissive;
            boolean partial = false;
            for (byte value : alpha)
            {
                int unsigned = value & 255;
                if (unsigned > 0 && unsigned < 255)
                {
                    partial = true;
                    break;
                }
            }
            hasTranslucentPixels = partial;
        }

        boolean mayContainTranslucentPixels()
        {
            return permissive || hasTranslucentPixels;
        }

        synchronized boolean containsTranslucentPixels(TexturedPolygon polygon)
        {
            if (permissive)
            {
                return true;
            }
            if (hasTranslucentPixels == false)
            {
                return false;
            }
            Boolean cached = translucentFaces.get(polygon);
            if (cached != null)
            {
                return cached;
            }
            boolean translucent =
                TextureAlphaMaskCache.containsTranslucentPixels(
                    width, height, alpha, polygon);
            putBounded(translucentFaces, polygon, translucent);
            return translucent;
        }

        @Override
        public synchronized List<TexturedPolygon> filter(List<TexturedPolygon> polygons)
        {
            if (polygons == null || polygons.isEmpty() || hasTranslucentPixels == false)
            {
                return Collections.emptyList();
            }
            List<TexturedPolygon> cached = translucentFaceLists.get(polygons);
            if (cached != null)
            {
                return cached;
            }
            List<TexturedPolygon> filtered = new ArrayList<TexturedPolygon>();
            for (TexturedPolygon polygon : polygons)
            {
                if (polygon != null && containsTranslucentPixels(polygon))
                {
                    filtered.add(polygon);
                }
            }
            List<TexturedPolygon> result = Collections.unmodifiableList(filtered);
            if (translucentFaceLists.size() >= MAXIMUM_VISIBILITY_RESULTS)
            {
                translucentFaceLists.clear();
            }
            translucentFaceLists.put(polygons, result);
            return result;
        }

        boolean isVisible(List<RollingStockLightDefinition.UvRegion> regions)
        {
            return permissive
                   || TaggedLightTextureVisibility.isVisible(width, height, alpha, regions);
        }

        synchronized boolean isVisible(DetectedLightSurface surface)
        {
            if (permissive)
            {
                return true;
            }
            Boolean cached = surfaceVisibility.get(surface);
            if (cached != null)
            {
                return cached;
            }
            boolean visible =
                TaggedLightTextureVisibility.isVisible(width, height, alpha, surface);
            putBounded(surfaceVisibility, surface, visible);
            return visible;
        }

        synchronized boolean isVisible(DetectedLightFace face)
        {
            if (permissive)
            {
                return true;
            }
            Boolean cached = faceVisibility.get(face);
            if (cached != null)
            {
                return cached;
            }
            boolean visible = TaggedLightTextureVisibility.isVisible(width, height, alpha, face);
            putBounded(faceVisibility, face, visible);
            return visible;
        }

        private static <T> void putBounded(Map<T, Boolean> values, T key, boolean value)
        {
            if (values.size() >= MAXIMUM_VISIBILITY_RESULTS)
            {
                values.clear();
            }
            values.put(key, value);
        }

        synchronized int cachedFaceResultCount()
        {
            return faceVisibility.size();
        }
    }
}
