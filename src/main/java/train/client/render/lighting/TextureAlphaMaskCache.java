package train.client.render.lighting;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import train.common.api.RollingStockLightDefinition;

/**
 * Bounded asynchronous texture-alpha analysis used by resolved skin lighting.
 * A pending mask deliberately hides texture-dependent effects for that draw.
 */
public final class TextureAlphaMaskCache
{
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
        final int generation = resourceGeneration;
        Entry entry = CACHE.getIfPresent(texture);
        if (entry == null)
        {
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
        }
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

    /** Advances the resource generation, cancels pending work, and invalidates all masks. */
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

    static final class Mask
    {
        static final Mask PERMISSIVE = new Mask(0, 0, new byte[0], true);
        final int width;
        final int height;
        final byte[] alpha;
        final boolean permissive;
        private final Map<DetectedLightSurface, Boolean> surfaceVisibility =
            new IdentityHashMap<DetectedLightSurface, Boolean>();
        private final Map<DetectedLightFace, Boolean> faceVisibility =
            new IdentityHashMap<DetectedLightFace, Boolean>();

        Mask(int width, int height, byte[] alpha, boolean permissive)
        {
            this.width = width;
            this.height = height;
            this.alpha = alpha;
            this.permissive = permissive;
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
