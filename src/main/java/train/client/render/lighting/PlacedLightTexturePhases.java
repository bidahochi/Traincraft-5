package train.client.render.lighting;

import java.util.List;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;

/** UV/texture-difference classifier for placed warning lights. */
final class PlacedLightTexturePhases
{
    static final int NONE = Integer.MIN_VALUE;
    static final int STEADY = -1;
    private static final float MINIMUM_TEXTURE_CHANGE = 0.20F;

    private PlacedLightTexturePhases() {}

    static int phase(
        ModelRendererTurbo part, int width, int height, int[] off, List<int[]> active)
    {
        boolean[] changed = new boolean[active.size()];
        for (TexturedPolygon polygon : part.faces)
        {
            for (int phase = 0; phase < active.size(); phase++)
            {
                if (changed[phase] == false && changed(polygon, width, height, off, active.get(phase)))
                {
                    changed[phase] = true;
                }
            }
        }
        if (changed.length == 1)
        {
            return changed[0] ? STEADY : NONE;
        }
        if (changed[0] && changed[1])
        {
            return activeTexturesAgree(part, width, height, off, active.get(0), active.get(1))
                   ? STEADY
                   : NONE;
        }
        if (changed[0])
        {
            return 0;
        }
        return changed[1] ? 1 : NONE;
    }

    static int faceIndex(
        ModelRendererTurbo part,
        int phase,
        int width,
        int height,
        int[] off,
        List<int[]> active)
    {
        boolean[] mask = faceMask(part, phase, width, height, off, active);
        int selected = -1;
        float selectedScore = MINIMUM_TEXTURE_CHANGE;
        for (int index = 0; index < part.faces.size(); index++)
        {
            if (mask[index] == false)
            {
                continue;
            }
            TexturedPolygon polygon = part.faces.get(index);
            if (bounds(polygon, width, height) == null)
            {
                continue;
            }
            float score =
                phase == STEADY
                ? steadyScore(polygon, width, height, off, active)
                : changeRatio(polygon, width, height, off, active.get(phase));
            if (score > selectedScore || (selected < 0 && score >= selectedScore))
            {
                selected = index;
                selectedScore = score;
            }
        }
        return selected;
    }

    static boolean[] faceMask(
        ModelRendererTurbo part,
        int phase,
        int width,
        int height,
        int[] off,
        List<int[]> active)
    {
        boolean[] result = new boolean[part.faces.size()];
        for (int index = 0; index < part.faces.size(); index++)
        {
            TexturedPolygon polygon = part.faces.get(index);
            float score =
                phase == STEADY
                ? steadyScore(polygon, width, height, off, active)
                : changeRatio(polygon, width, height, off, active.get(phase));
            result[index] = score >= MINIMUM_TEXTURE_CHANGE;
        }
        return result;
    }

    private static float steadyScore(
        TexturedPolygon polygon, int width, int height, int[] off, List<int[]> active)
    {
        float score = changeRatio(polygon, width, height, off, active.get(0));
        for (int i = 1; i < active.size(); i++)
        {
            score = Math.min(score, changeRatio(polygon, width, height, off, active.get(i)));
        }
        return score;
    }

    private static boolean activeTexturesAgree(
        ModelRendererTurbo part, int width, int height, int[] off, int[] first, int[] second)
    {
        for (TexturedPolygon polygon : part.faces)
        {
            PixelBounds bounds = bounds(polygon, width, height);
            if (bounds == null)
            {
                continue;
            }
            for (int y = bounds.minimumY; y <= bounds.maximumY; y++)
            {
                int row = y * width;
                for (int x = bounds.minimumX; x <= bounds.maximumX; x++)
                {
                    int index = row + x;
                    if (containsPixel(polygon, x, y, width, height)
                            && (off[index] != first[index] || off[index] != second[index])
                            && first[index] != second[index])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean changed(
        TexturedPolygon polygon, int width, int height, int[] off, int[] active)
    {
        return changeRatio(polygon, width, height, off, active) >= MINIMUM_TEXTURE_CHANGE;
    }

    private static float changeRatio(
        TexturedPolygon polygon, int width, int height, int[] off, int[] active)
    {
        PixelBounds bounds = bounds(polygon, width, height);
        if (bounds == null)
        {
            return 0;
        }
        int changed = 0, covered = 0;
        for (int y = bounds.minimumY; y <= bounds.maximumY; y++)
        {
            int row = y * width;
            for (int x = bounds.minimumX; x <= bounds.maximumX; x++)
            {
                if (containsPixel(polygon, x, y, width, height) == false)
                {
                    continue;
                }
                covered++;
                if (off[row + x] != active[row + x])
                {
                    changed++;
                }
            }
        }
        return changed / (float) Math.max(1, covered);
    }

    private static boolean containsPixel(
        TexturedPolygon polygon, int pixelX, int pixelY, int width, int height)
    {
        float u = (pixelX + 0.5F) / width, v = (pixelY + 0.5F) / height;
        boolean inside = false;
        TexturedVertex[] vertices = polygon.vertices;
        for (int current = 0, previous = vertices.length - 1;
                current < vertices.length;
                previous = current++)
        {
            TexturedVertex a = vertices[current], b = vertices[previous];
            boolean crosses = (a.textureY > v) != (b.textureY > v);
            if (crosses)
            {
                float intersection =
                    (b.textureX - a.textureX) * (v - a.textureY) / (b.textureY - a.textureY)
                    + a.textureX;
                if (u < intersection)
                {
                    inside = inside == false;
                }
            }
        }
        return inside;
    }

    private static PixelBounds bounds(TexturedPolygon polygon, int width, int height)
    {
        if (polygon == null || polygon.vertices == null || polygon.vertices.length == 0)
        {
            return null;
        }
        float minimumU = Float.POSITIVE_INFINITY,
              minimumV = Float.POSITIVE_INFINITY,
              maximumU = Float.NEGATIVE_INFINITY,
              maximumV = Float.NEGATIVE_INFINITY;
        for (TexturedVertex vertex : polygon.vertices)
        {
            minimumU = Math.min(minimumU, vertex.textureX);
            minimumV = Math.min(minimumV, vertex.textureY);
            maximumU = Math.max(maximumU, vertex.textureX);
            maximumV = Math.max(maximumV, vertex.textureY);
        }
        int minimumX = clamp((int) Math.floor(minimumU * width), width),
            minimumY = clamp((int) Math.floor(minimumV * height), height),
            maximumX = clamp((int) Math.ceil(maximumU * width) - 1, width),
            maximumY = clamp((int) Math.ceil(maximumV * height) - 1, height);
        return new PixelBounds(
                   Math.min(minimumX, maximumX),
                   Math.min(minimumY, maximumY),
                   Math.max(minimumX, maximumX),
                   Math.max(minimumY, maximumY));
    }

    private static int clamp(int value, int size)
    {
        return Math.max(0, Math.min(size - 1, value));
    }

    private static final class PixelBounds
    {
        final int minimumX, minimumY, maximumX, maximumY;

        PixelBounds(int minimumX, int minimumY, int maximumX, int maximumY)
        {
            this.minimumX = minimumX;
            this.minimumY = minimumY;
            this.maximumX = maximumX;
            this.maximumY = maximumY;
        }
    }
}
