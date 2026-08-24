package tmt;

/** Resolves stable face normals from TMT polygon winding. */
public final class TurboFaceNormal
{
    private static final float MINIMUM_NORMAL_LENGTH = 1.0E-4F;

    private TurboFaceNormal() {}

    /**
     * Returns the normal of the largest usable triangle in the polygon, or
     * {@code null} when every triangle is degenerate.
     */
    public static Vec3f resolve(TexturedVertex[] vertices)
    {
        if (vertices == null || vertices.length < 3)
        {
            return null;
        }

        Vec3f first = triangleNormal(vertices, 0, 1, 2);
        if (vertices.length == 3)
        {
            return first;
        }
        if (vertices.length == 4)
        {
            Vec3f second = triangleNormal(vertices, 0, 2, 3);
            float firstArea = triangleArea(vertices, 0, 1, 2);
            float secondArea = triangleArea(vertices, 0, 2, 3);
            if (firstArea >= secondArea && first != null)
            {
                return first;
            }
            if (second != null)
            {
                return second;
            }
            return first;
        }
        return largestFanNormal(vertices);
    }

    private static Vec3f largestFanNormal(TexturedVertex[] vertices)
    {
        Vec3f selected = triangleNormal(vertices, 0, 1, 2);
        float selectedArea = triangleArea(vertices, 0, 1, 2);
        for (int index = 2; index + 1 < vertices.length; index++)
        {
            Vec3f candidate = triangleNormal(vertices, 0, index, index + 1);
            float area = triangleArea(vertices, 0, index, index + 1);
            if (candidate != null && area > selectedArea)
            {
                selected = candidate;
                selectedArea = area;
            }
        }
        return selected;
    }

    private static Vec3f triangleNormal(
        TexturedVertex[] vertices,
        int firstIndex,
        int secondIndex,
        int thirdIndex)
    {
        Vec3f first = vertices[firstIndex].vector3F;
        Vec3f second = vertices[secondIndex].vector3F;
        Vec3f third = vertices[thirdIndex].vector3F;
        Vec3f normal = second.subtract(third).crossProduct(second.subtract(first));
        if (length(normal) <= MINIMUM_NORMAL_LENGTH)
        {
            return null;
        }
        return normal.normalize();
    }

    private static float triangleArea(
        TexturedVertex[] vertices,
        int firstIndex,
        int secondIndex,
        int thirdIndex)
    {
        Vec3f first = vertices[firstIndex].vector3F;
        Vec3f second = vertices[secondIndex].vector3F;
        Vec3f third = vertices[thirdIndex].vector3F;
        return length(second.subtract(first).crossProduct(third.subtract(first))) * 0.5F;
    }

    private static float length(Vec3f value)
    {
        return (float)
               Math.sqrt(
                   value.xCoord * value.xCoord
                   + value.yCoord * value.yCoord
                   + value.zCoord * value.zCoord);
    }
}
