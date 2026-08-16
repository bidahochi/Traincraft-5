package train.client.render.lighting;

import java.util.List;
import train.common.api.RollingStockLightDefinition;

/** UV/alpha visibility calculation used by skin lighting. */
final class TaggedLightTextureVisibility
{
    static final int CUTOUT_ALPHA_THRESHOLD = 26;

    private TaggedLightTextureVisibility() {}

    static boolean isVisible(
        int width,
        int height,
        int[] pixels,
        List<RollingStockLightDefinition.UvRegion> regions)
    {
        if (width <= 0
                || height <= 0
                || pixels.length < width * height
                || regions == null
                || regions.isEmpty())
        {
            return true;
        }
        for (RollingStockLightDefinition.UvRegion region : regions)
        {
            int minimumX = lowerPixel(region.minimumU(), width);
            int maximumX = upperPixel(region.maximumU(), width);
            int minimumY = lowerPixel(region.minimumV(), height);
            int maximumY = upperPixel(region.maximumV(), height);
            for (int y = minimumY; y <= maximumY; y++)
            {
                for (int x = minimumX; x <= maximumX; x++)
                {
                    if (pixels[y * width + x] >>> 24 >= CUTOUT_ALPHA_THRESHOLD)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean isVisible(
        int width,
        int height,
        byte[] alpha,
        List<RollingStockLightDefinition.UvRegion> regions)
    {
        if (width <= 0
                || height <= 0
                || alpha.length < width * height
                || regions == null
                || regions.isEmpty())
        {
            return true;
        }
        for (RollingStockLightDefinition.UvRegion region : regions)
        {
            int minimumX = lowerPixel(region.minimumU(), width);
            int maximumX = upperPixel(region.maximumU(), width);
            int minimumY = lowerPixel(region.minimumV(), height);
            int maximumY = upperPixel(region.maximumV(), height);
            for (int y = minimumY; y <= maximumY; y++)
            {
                for (int x = minimumX; x <= maximumX; x++)
                {
                    if ((alpha[y * width + x] & 255) >= CUTOUT_ALPHA_THRESHOLD)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean isVisible(
        int width,
        int height,
        byte[] alpha,
        DetectedLightSurface surface)
    {
        if (width <= 0
                || height <= 0
                || alpha == null
                || alpha.length < width * height
                || surface == null)
        {
            return true;
        }
        boolean usablePolygonFound = false;
        for (DetectedLightFace face : surface.faces)
        {
            if (hasUsablePolygon(face) == false)
            {
                continue;
            }
            usablePolygonFound = true;
            if (polygonVisible(width, height, alpha, face))
            {
                return true;
            }
        }
        return usablePolygonFound == false;
    }

    static boolean isVisible(
        int width,
        int height,
        byte[] alpha,
        DetectedLightFace face)
    {
        if (width <= 0
                || height <= 0
                || alpha == null
                || alpha.length < width * height
                || hasUsablePolygon(face) == false)
        {
            return true;
        }
        return polygonVisible(width, height, alpha, face);
    }

    private static boolean polygonVisible(
        int width,
        int height,
        byte[] alpha,
        DetectedLightFace face)
    {
        int minimumX = Math.max(0, (int) Math.floor(face.minU * width));
        int maximumX = Math.min(width - 1, (int) Math.ceil(face.maxU * width) - 1);
        int minimumY = Math.max(0, (int) Math.floor(face.minV * height));
        int maximumY = Math.min(height - 1, (int) Math.ceil(face.maxV * height) - 1);
        if (minimumX > maximumX || minimumY > maximumY)
        {
            return false;
        }

        for (int y = minimumY; y <= maximumY; y++)
        {
            float v = (y + 0.5F) / height;
            for (int x = minimumX; x <= maximumX; x++)
            {
                if ((alpha[y * width + x] & 255) < CUTOUT_ALPHA_THRESHOLD)
                {
                    continue;
                }
                float u = (x + 0.5F) / width;
                if (insidePolygon(u, v, face.textureU, face.textureV))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasUsablePolygon(DetectedLightFace face)
    {
        return face != null
               && face.textureU != null
               && face.textureV != null
               && face.textureU.length >= 3
               && face.textureU.length == face.textureV.length
               && face.maxU - face.minU > 1.0E-7F
               && face.maxV - face.minV > 1.0E-7F;
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
        if (Math.abs(cross) > 1.0E-6F)
        {
            return false;
        }
        float dot = pointU * edgeU + pointV * edgeV;
        float lengthSquared = edgeU * edgeU + edgeV * edgeV;
        return dot >= -1.0E-6F && dot <= lengthSquared + 1.0E-6F;
    }

    private static int lowerPixel(float normalized, int size)
    {
        float wrapped = normalized - (float) Math.floor(normalized);
        if (normalized > 0.0F && wrapped == 0.0F)
        {
            wrapped = 1.0F;
        }
        return Math.max(0, Math.min(size - 1, (int) Math.floor(wrapped * size)));
    }

    private static int upperPixel(float normalized, int size)
    {
        float wrapped = normalized - (float) Math.floor(normalized);
        if (normalized > 0.0F && wrapped == 0.0F)
        {
            wrapped = 1.0F;
        }
        return Math.max(0, Math.min(size - 1, (int) Math.ceil(wrapped * size) - 1));
    }
}
