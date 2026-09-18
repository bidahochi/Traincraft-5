package train.client.render.lighting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import train.common.api.RollingStockLightDefinition;

/** Immutable physical aperture assembled in the lighting scope's common coordinate frame. */
public final class GroupedLightGeometry
{
    /** Existing source-halo margin, shared with ungrouped automatic lens sizing. */
    public static final float SOURCE_GLOW_MARGIN = 1.35F;
    /** Lower automatic halo-radius limit in render-local blocks, matching Fanto. */
    public static final float MINIMUM_SOURCE_GLOW_RADIUS = 0.04F;
    /** Upper automatic halo-radius limit in render-local blocks, matching Fanto. */
    public static final float MAXIMUM_SOURCE_GLOW_RADIUS = 0.18F;
    private static final float EPSILON = 0.00001F;
    private static final float POSE_TOLERANCE = 0.0001F;
    private static final float MINIMUM_AFFINE_DETERMINANT = 1.0E-12F;
    private final DetectedLightSurface surface;
    private final RollingStockLightDefinition definition;
    private final List<String> members;

    private GroupedLightGeometry(DetectedLightSurface surface,
        RollingStockLightDefinition definition, List<String> members)
    {
        this.surface = surface;
        this.definition = definition;
        this.members = Collections.unmodifiableList(new ArrayList<String>(members));
    }

    /** Returns the common-frame aperture used for the single effect submission. */
    public DetectedLightSurface surface()
    {
        return surface;
    }

    /** Returns shared behavior with automatically assembled glow dimensions. */
    public RollingStockLightDefinition definition()
    {
        return definition;
    }

    /** Returns stable member locators, retained for diagnostics without retaining model objects. */
    public List<String> members()
    {
        return members;
    }

    /**
     * Entity-owned reusable collection and last-result cache. Geometry is rebuilt only when
     * membership, selected faces, effective definitions, or relative poses change. Camera motion
     * is removed before comparison. Invalid assemblies are cached too, avoiding repeated work.
     */
    public static final class Cache
    {
        private final Map<String, Member> members = new TreeMap<String, Member>();
        private final float[] relative = new float[16];
        private boolean dirty;
        private GroupedLightGeometry result;
        private String failure;

        /** Creates an empty cache owned by one entity and physical group. */
        public Cache()
        {
        }

        /** Starts a draw without discarding the previous immutable assembly. */
        public void begin()
        {
            for (Member member : members.values())
            {
                member.seen = false;
            }
        }

        /** Collects an available emitting surface; repeated draws of a member are idempotent. */
        public void add(String key, DetectedLightSurface surface, float scale,
            float[] inverseScope, float[] pose, RollingStockLightDefinition definition,
            Float authoredRadius)
        {
            multiply(inverseScope, pose, relative);
            for (int column = 0; column < 3; column++)
            {
                for (int row = 0; row < 3; row++)
                {
                    relative[column * 4 + row] *= scale;
                }
            }
            Member member = members.get(key);
            if (member == null)
            {
                member = new Member();
                members.put(key, member);
                dirty = true;
            }
            Object source = surface.sourceFace == null ? surface : surface.sourceFace;
            if (member.active == false || member.source != source || member.definition != definition
                || Objects.equals(member.authoredRadius, authoredRadius) == false
                || samePose(member.pose, relative) == false)
            {
                dirty = true;
                System.arraycopy(relative, 0, member.pose, 0, relative.length);
                member.surface = surface;
                member.source = source;
                member.definition = definition;
                member.authoredRadius = authoredRadius;
            }
            member.seen = true;
        }

        /** Finalizes only changed assemblies; null means empty or invalid, with failure() explaining invalidity. */
        public GroupedLightGeometry finish()
        {
            boolean any = false;
            for (Member member : members.values())
            {
                if (member.active != member.seen)
                {
                    dirty = true;
                }
                member.active = member.seen;
                any |= member.active;
            }
            if (dirty)
            {
                failure = null;
                result = null;
                if (any)
                {
                    result = assemble();
                }
                dirty = false;
            }
            return result;
        }

        /** Returns the cached actionable rejection reason, or null for valid/empty groups. */
        public String failure()
        {
            return failure;
        }

        /** Measures cached polygons in scope space; this cold rebuild never runs on a valid cache hit. */
        private GroupedLightGeometry assemble()
        {
            List<String> keys = new ArrayList<String>();
            List<float[]> normals = new ArrayList<float[]>();
            Member first = null;
            float area = 0, x = 0, y = 0, z = 0, nx = 0, ny = 0, nz = 0;
            for (Map.Entry<String, Member> entry : members.entrySet())
            {
                Member member = entry.getValue();
                if (member.active == false)
                {
                    continue;
                }
                keys.add(entry.getKey());
                if (first == null)
                {
                    first = member;
                }
                if (sameBehavior(first.definition, member.definition) == false
                    || Objects.equals(first.authoredRadius, member.authoredRadius) == false)
                {
                    failure = "Conflicting shared effect settings between " + keys.get(0) + " and " + entry.getKey();
                    return null;
                }
                DetectedLightFace face = member.surface.sourceFace;
                if (face == null || face.vertices.length < 3)
                {
                    failure = "No usable selected source polygon at " + entry.getKey();
                    return null;
                }
                List<float[]> polygon = new ArrayList<float[]>();
                for (float[] vertex : face.vertices)
                {
                    float[] point = point(member.pose, vertex);
                    polygon.add(point);
                }
                float[] normal = normal(member.pose, member.surface.normalX,
                    member.surface.normalY, member.surface.normalZ);
                if (normal == null)
                {
                    failure = "Degenerate source transform at " + entry.getKey();
                    return null;
                }
                for (float[] other : normals)
                {
                    if (dot(normal, other) <= EPSILON)
                    {
                        failure = "Opposing source faces at " + entry.getKey() + "; use separate groups";
                        return null;
                    }
                }
                normals.add(normal);
                float[] origin = polygon.get(0);
                for (int index = 1; index + 1 < polygon.size(); index++)
                {
                    float[] a = polygon.get(index), b = polygon.get(index + 1);
                    float cx = (a[1] - origin[1]) * (b[2] - origin[2]) - (a[2] - origin[2]) * (b[1] - origin[1]);
                    float cy = (a[2] - origin[2]) * (b[0] - origin[0]) - (a[0] - origin[0]) * (b[2] - origin[2]);
                    float cz = (a[0] - origin[0]) * (b[1] - origin[1]) - (a[1] - origin[1]) * (b[0] - origin[0]);
                    float triangleArea = (float) Math.sqrt(cx * cx + cy * cy + cz * cz) * 0.5F;
                    area += triangleArea;
                    x += (origin[0] + a[0] + b[0]) * triangleArea / 3;
                    y += (origin[1] + a[1] + b[1]) * triangleArea / 3;
                    z += (origin[2] + a[2] + b[2]) * triangleArea / 3;
                    nx += normal[0] * triangleArea;
                    ny += normal[1] * triangleArea;
                    nz += normal[2] * triangleArea;
                }
            }
            if (Float.isFinite(area) == false || area <= EPSILON)
            {
                failure = "Source polygons have no measurable area";
                return null;
            }
            x /= area;
            y /= area;
            z /= area;
            float[] basis = AnimatedLightDirection.basis(nx, ny, nz);
            // Match Fanto's circular, area-derived halo. Shape comes only from authored settings,
            // not bounding-box aspect or corner coverage, which over-expanded diamond lenses.
            float measuredRadius = (float) Math.sqrt(area / Math.PI);
            float radius = Math.max(MINIMUM_SOURCE_GLOW_RADIUS,
                Math.min(MAXIMUM_SOURCE_GLOW_RADIUS, measuredRadius * SOURCE_GLOW_MARGIN));
            RollingStockLightDefinition base = first.definition;
            float glowRadius = first.authoredRadius == null ? radius : first.authoredRadius;
            RollingStockLightDefinition resolved = base.toBuilder()
                .sourceGlow(glowRadius, base.sourceGlowIntensity()).build();
            DetectedLightSurface surface = new DetectedLightSurface(x, y, z,
                basis[0], basis[1], basis[2], basis[0], basis[1], basis[2], area, measuredRadius, 0, 0, 0, 0);
            return new GroupedLightGeometry(surface, resolved, keys);
        }
    }

    private static final class Member
    {
        private final float[] pose = new float[16];
        private Object source;
        private DetectedLightSurface surface;
        private RollingStockLightDefinition definition;
        private Float authoredRadius;
        private boolean seen;
        private boolean active;
    }

    /** Compares behavior, deliberately excluding per-piece measured geometry and automatic radius. */
    private static boolean sameBehavior(RollingStockLightDefinition a, RollingStockLightDefinition b)
    {
        return a.controlCircuit() == b.controlCircuit() && a.effect() == b.effect()
            && a.function().equals(b.function()) && a.color() == b.color()
            && a.beamRotation().equals(b.beamRotation())
            && a.beamLength() == b.beamLength() && a.beamWidth() == b.beamWidth()
            && a.sourceGlowIntensity() == b.sourceGlowIntensity()
            && a.sourceGlowWidthScale() == b.sourceGlowWidthScale()
            && a.sourceGlowHeightScale() == b.sourceGlowHeightScale()
            && a.sourceGlowRightOffset() == b.sourceGlowRightOffset()
            && a.sourceGlowUpOffset() == b.sourceGlowUpOffset()
            && a.hotspotEnabled() == b.hotspotEnabled()
            && a.clientProjectorEligible() == b.clientProjectorEligible()
            && a.activationPolicy() == b.activationPolicy() && a.ditchHornMode() == b.ditchHornMode()
            && Objects.equals(a.hornFunction(), b.hornFunction())
            && Objects.equals(a.hornPhase(), b.hornPhase());
    }

    private static boolean samePose(float[] a, float[] b)
    {
        for (int index = 0; index < 16; index++)
        {
            if (Float.isFinite(a[index]) == false || Float.isFinite(b[index]) == false
                || Math.abs(a[index] - b[index]) > POSE_TOLERANCE)
            {
                return false;
            }
        }
        return true;
    }

    /** Multiplies column-major affine poses into caller-owned storage. */
    public static void multiply(float[] a, float[] b, float[] result)
    {
        for (int column = 0; column < 4; column++)
        {
            for (int row = 0; row < 4; row++)
            {
                result[column * 4 + row] = a[row] * b[column * 4]
                    + a[4 + row] * b[column * 4 + 1] + a[8 + row] * b[column * 4 + 2]
                    + a[12 + row] * b[column * 4 + 3];
            }
        }
    }

    /** Inverts an affine pose; singular/non-finite transforms disable assembly for this draw. */
    public static boolean invert(float[] m, float[] result)
    {
        float a = m[0], b = m[4], c = m[8], d = m[1], e = m[5], f = m[9];
        float g = m[2], h = m[6], i = m[10];
        float determinant = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
        if (Float.isFinite(determinant) == false || Math.abs(determinant) < MINIMUM_AFFINE_DETERMINANT)
        {
            return false;
        }
        result[0] = (e * i - f * h) / determinant;
        result[4] = (c * h - b * i) / determinant;
        result[8] = (b * f - c * e) / determinant;
        result[1] = (f * g - d * i) / determinant;
        result[5] = (a * i - c * g) / determinant;
        result[9] = (c * d - a * f) / determinant;
        result[2] = (d * h - e * g) / determinant;
        result[6] = (b * g - a * h) / determinant;
        result[10] = (a * e - b * d) / determinant;
        result[3] = 0;
        result[7] = 0;
        result[11] = 0;
        result[15] = 1;
        for (int row = 0; row < 3; row++)
        {
            result[12 + row] = -(result[row] * m[12] + result[4 + row] * m[13] + result[8 + row] * m[14]);
        }
        for (float value : result)
        {
            if (Float.isFinite(value) == false)
            {
                return false;
            }
        }
        return true;
    }

    private static float[] point(float[] m, float[] p)
    {
        return new float[] {m[0] * p[0] + m[4] * p[1] + m[8] * p[2] + m[12],
            m[1] * p[0] + m[5] * p[1] + m[9] * p[2] + m[13],
            m[2] * p[0] + m[6] * p[1] + m[10] * p[2] + m[14]};
    }

    /** Inverse-transpose normals preserve the emitting side under nonuniform or mirrored scale. */
    private static float[] normal(float[] pose, float x, float y, float z)
    {
        float[] inverse = new float[16];
        if (invert(pose, inverse) == false)
        {
            return null;
        }
        float nx = inverse[0] * x + inverse[1] * y + inverse[2] * z;
        float ny = inverse[4] * x + inverse[5] * y + inverse[6] * z;
        float nz = inverse[8] * x + inverse[9] * y + inverse[10] * z;
        float length = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);
        if (Float.isFinite(length) == false || length <= EPSILON)
        {
            return null;
        }
        return new float[] {nx / length, ny / length, nz / length};
    }

    private static float dot(float[] a, float[] b)
    {
        return a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
    }
}
