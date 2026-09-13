package train.api.client.model.animation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.minecraft.util.ResourceLocation;

/**
 * Immutable lighting and animation policy for a placed TMT model such as a crossing signal.
 *
 * <p>The profile relates one logical control to an off texture and either one steady or two
 * alternating active textures. Beam and glow dimensions use model units. Fixture-direction
 * options describe how tagged geometry is interpreted; they never mutate the model itself.
 * Collection inputs are defensively copied for safe reuse by renderer caches.</p>
 */
public final class PlacedModelLightProfile
{
    private final String control;
    private final ResourceLocation offTexture;
    private final List<ResourceLocation> activeTextures;
    private final int phaseTicks, color;
    private final float beamLength, beamWidth, sourceGlowIntensity;
    private final boolean hotspotEnabled, reverseFixtureDirection, bidirectionalFixtures;
    private final Set<String> bidirectionalFixtureGroups, fullSurfaceFixtureGroups;
    private final FixtureDirectionAxis fixtureDirectionAxis;

    /**
     * Creates a complete placed-model lighting profile.
     *
     * @param control non-blank runtime control name
     * @param offTexture texture used while the control is inactive
     * @param activeTextures one steady texture or two alternating phase textures
     * @param phaseTicks positive number of ticks per alternating phase
     * @param color packed {@code 0xRRGGBB} effect color
     * @param beamLength non-negative beam reach in model units
     * @param beamWidth non-negative beam width in model units
     * @param sourceGlowIntensity glow opacity in the inclusive range zero through one
     * @param hotspotEnabled whether a beam hit may draw a surface hotspot
     * @param reverseFixtureDirection whether every inferred fixture direction is reversed
     * @param bidirectionalFixtures whether every fixture emits in both directions
     * @param bidirectionalFixtureGroups groups that emit in both directions
     * @param fullSurfaceFixtureGroups groups whose complete tagged surface is illuminated
     * @param fixtureDirectionAxis optional normalized model-space direction axis; null uses geometry
     */
    public PlacedModelLightProfile(
        String control,
        ResourceLocation offTexture,
        List<ResourceLocation> activeTextures,
        int phaseTicks,
        int color,
        float beamLength,
        float beamWidth,
        float sourceGlowIntensity,
        boolean hotspotEnabled,
        boolean reverseFixtureDirection,
        boolean bidirectionalFixtures,
        Set<String> bidirectionalFixtureGroups,
        Set<String> fullSurfaceFixtureGroups,
        FixtureDirectionAxis fixtureDirectionAxis)
    {
        if (control == null || control.trim().isEmpty())
        {
            throw new IllegalArgumentException("Placed-model light control must not be blank");
        }
        this.control = control;
        this.offTexture = Objects.requireNonNull(offTexture, "offTexture");
        this.activeTextures =
            Collections.unmodifiableList(new ArrayList<ResourceLocation>(activeTextures));
        this.bidirectionalFixtureGroups =
            copyGroups(bidirectionalFixtureGroups, "bidirectionalFixtureGroups");
        this.fullSurfaceFixtureGroups =
            copyGroups(fullSurfaceFixtureGroups, "fullSurfaceFixtureGroups");
        if (this.activeTextures.size() < 1
                || this.activeTextures.size() > 2
                || this.activeTextures.contains(null))
        {
            throw new IllegalArgumentException(
                "Placed-model lighting requires one steady or two alternating textures");
        }
        if (phaseTicks <= 0
                || finite(beamLength) == false
                || finite(beamWidth) == false
                || finite(sourceGlowIntensity) == false
                || beamLength < 0
                || beamWidth < 0
                || sourceGlowIntensity < 0
                || sourceGlowIntensity > 1)
        {
            throw new IllegalArgumentException("Invalid placed-model light dimensions or timing");
        }
        this.phaseTicks = phaseTicks;
        this.color = color;
        this.beamLength = beamLength;
        this.beamWidth = beamWidth;
        this.sourceGlowIntensity = sourceGlowIntensity;
        this.hotspotEnabled = hotspotEnabled;
        this.reverseFixtureDirection = reverseFixtureDirection;
        this.bidirectionalFixtures = bidirectionalFixtures;
        this.fixtureDirectionAxis = fixtureDirectionAxis;
    }

    /** Creates a complete profile using geometry-derived fixture direction. */
    public PlacedModelLightProfile(
        String control,
        ResourceLocation offTexture,
        List<ResourceLocation> activeTextures,
        int phaseTicks,
        int color,
        float beamLength,
        float beamWidth,
        float sourceGlowIntensity,
        boolean hotspotEnabled,
        boolean reverseFixtureDirection,
        boolean bidirectionalFixtures,
        Set<String> bidirectionalFixtureGroups,
        Set<String> fullSurfaceFixtureGroups)
    {
        this(
            control,
            offTexture,
            activeTextures,
            phaseTicks,
            color,
            beamLength,
            beamWidth,
            sourceGlowIntensity,
            hotspotEnabled,
            reverseFixtureDirection,
            bidirectionalFixtures,
            bidirectionalFixtureGroups,
            fullSurfaceFixtureGroups,
            null);
    }

    /** Creates a profile without group-specific direction or full-surface exceptions. */
    public PlacedModelLightProfile(
        String control,
        ResourceLocation offTexture,
        List<ResourceLocation> activeTextures,
        int phaseTicks,
        int color,
        float beamLength,
        float beamWidth,
        float sourceGlowIntensity,
        boolean hotspotEnabled,
        boolean reverseFixtureDirection,
        boolean bidirectionalFixtures)
    {
        this(
            control,
            offTexture,
            activeTextures,
            phaseTicks,
            color,
            beamLength,
            beamWidth,
            sourceGlowIntensity,
            hotspotEnabled,
            reverseFixtureDirection,
            bidirectionalFixtures,
            Collections.<String>emptySet(),
            Collections.<String>emptySet(),
            null);
    }

    /** Creates a unidirectional profile without group-specific exceptions. */
    public PlacedModelLightProfile(
        String control,
        ResourceLocation offTexture,
        List<ResourceLocation> activeTextures,
        int phaseTicks,
        int color,
        float beamLength,
        float beamWidth,
        float sourceGlowIntensity,
        boolean hotspotEnabled,
        boolean reverseFixtureDirection)
    {
        this(
            control,
            offTexture,
            activeTextures,
            phaseTicks,
            color,
            beamLength,
            beamWidth,
            sourceGlowIntensity,
            hotspotEnabled,
            reverseFixtureDirection,
            false);
    }

    /** Creates a forward-facing profile with no group-specific exceptions. */
    public PlacedModelLightProfile(
        String control,
        ResourceLocation offTexture,
        List<ResourceLocation> activeTextures,
        int phaseTicks,
        int color,
        float beamLength,
        float beamWidth,
        float sourceGlowIntensity,
        boolean hotspotEnabled)
    {
        this(
            control,
            offTexture,
            activeTextures,
            phaseTicks,
            color,
            beamLength,
            beamWidth,
            sourceGlowIntensity,
            hotspotEnabled,
            false);
    }

    /** Returns the standard red steady-warning profile for one active texture. */
    public static PlacedModelLightProfile steadyWarning(
        String control, ResourceLocation off, ResourceLocation on)
    {
        return warning(control, off, Collections.singletonList(on), 1);
    }

    /** Returns the standard red warning profile alternating between two texture phases. */
    public static PlacedModelLightProfile alternatingWarning(
        String control,
        ResourceLocation off,
        ResourceLocation first,
        ResourceLocation second,
        int phaseTicks)
    {
        List<ResourceLocation> active = new ArrayList<ResourceLocation>();
        active.add(first);
        active.add(second);
        return warning(control, off, active, phaseTicks);
    }

    private static PlacedModelLightProfile warning(
        String control, ResourceLocation off, List<ResourceLocation> active, int ticks)
    {
        return new PlacedModelLightProfile(
                   control, off, active, ticks, 0xFF2020, 0.75F, 0.35F, 0.85F, true);
    }

    public boolean alternating()
    {
        return activeTextures.size() == 2;
    }

    /** Returns a copy with every geometry-derived fixture direction reversed. */
    public PlacedModelLightProfile withReversedFixtureDirection()
    {
        return copy(
                   true,
                   bidirectionalFixtures,
                   bidirectionalFixtureGroups,
                   fullSurfaceFixtureGroups,
                   fixtureDirectionAxis);
    }

    /** Returns a copy in which every detected fixture emits in both directions. */
    public PlacedModelLightProfile withBidirectionalFixtures()
    {
        return copy(
                   reverseFixtureDirection,
                   true,
                   bidirectionalFixtureGroups,
                   fullSurfaceFixtureGroups,
                   fixtureDirectionAxis);
    }

    /** Returns a copy marking one non-blank fixture group as bidirectional. */
    public PlacedModelLightProfile withBidirectionalFixtureGroup(String group)
    {
        return copy(
                   reverseFixtureDirection,
                   bidirectionalFixtures,
                   withGroup(bidirectionalFixtureGroups, group),
                   fullSurfaceFixtureGroups,
                   fixtureDirectionAxis);
    }

    /** Returns a copy illuminating the complete tagged surface for one fixture group. */
    public PlacedModelLightProfile withFullSurfaceFixtureGroup(String group)
    {
        return copy(
                   reverseFixtureDirection,
                   bidirectionalFixtures,
                   bidirectionalFixtureGroups,
                   withGroup(fullSurfaceFixtureGroups, group),
                   fixtureDirectionAxis);
    }

    /**
     * Returns a copy using an explicit model-space axis to classify fixture direction.
     *
     * @throws IllegalArgumentException when the vector is non-finite or has zero length
     */
    public PlacedModelLightProfile withFixtureDirectionAxis(float x, float y, float z)
    {
        return copy(
                   reverseFixtureDirection,
                   bidirectionalFixtures,
                   bidirectionalFixtureGroups,
                   fullSurfaceFixtureGroups,
                   new FixtureDirectionAxis(x, y, z));
    }

    private PlacedModelLightProfile copy(
        boolean reverse,
        boolean bidirectional,
        Set<String> bidirectionalGroups,
        Set<String> fullGroups,
        FixtureDirectionAxis axis)
    {
        return new PlacedModelLightProfile(
                   control,
                   offTexture,
                   activeTextures,
                   phaseTicks,
                   color,
                   beamLength,
                   beamWidth,
                   sourceGlowIntensity,
                   hotspotEnabled,
                   reverse,
                   bidirectional,
                   bidirectionalGroups,
                   fullGroups,
                   axis);
    }

    private static Set<String> copyGroups(Set<String> values, String name)
    {
        if (values == null)
        {
            throw new NullPointerException(name);
        }
        Set<String> copy = new HashSet<String>();
        for (String value : values)
        {
            if (value == null || value.trim().isEmpty())
            {
                throw new IllegalArgumentException(
                    "Placed-model light group names must not be blank");
            }
            copy.add(value);
        }
        return Collections.unmodifiableSet(copy);
    }

    private static Set<String> withGroup(Set<String> values, String group)
    {
        if (group == null || group.trim().isEmpty())
        {
            throw new IllegalArgumentException("Placed-model light group name must not be blank");
        }
        Set<String> copy = new HashSet<String>(values);
        copy.add(group);
        return copy;
    }

    private static boolean finite(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false;
    }

    public String control()
    {
        return control;
    }

    public ResourceLocation offTexture()
    {
        return offTexture;
    }

    public List<ResourceLocation> activeTextures()
    {
        return activeTextures;
    }

    public int phaseTicks()
    {
        return phaseTicks;
    }

    public int color()
    {
        return color;
    }

    public float beamLength()
    {
        return beamLength;
    }

    public float beamWidth()
    {
        return beamWidth;
    }

    public float sourceGlowIntensity()
    {
        return sourceGlowIntensity;
    }

    public boolean hotspotEnabled()
    {
        return hotspotEnabled;
    }

    public boolean reverseFixtureDirection()
    {
        return reverseFixtureDirection;
    }

    public boolean bidirectionalFixtures()
    {
        return bidirectionalFixtures;
    }

    public Set<String> bidirectionalFixtureGroups()
    {
        return bidirectionalFixtureGroups;
    }

    public Set<String> fullSurfaceFixtureGroups()
    {
        return fullSurfaceFixtureGroups;
    }

    public FixtureDirectionAxis fixtureDirectionAxis()
    {
        return fixtureDirectionAxis;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof PlacedModelLightProfile) == false)
        {
            return false;
        }
        PlacedModelLightProfile value = (PlacedModelLightProfile) other;
        return phaseTicks == value.phaseTicks
               && color == value.color
               && Float.compare(beamLength, value.beamLength) == 0
               && Float.compare(beamWidth, value.beamWidth) == 0
               && Float.compare(sourceGlowIntensity, value.sourceGlowIntensity) == 0
               && hotspotEnabled == value.hotspotEnabled
               && reverseFixtureDirection == value.reverseFixtureDirection
               && bidirectionalFixtures == value.bidirectionalFixtures
               && control.equals(value.control)
               && offTexture.equals(value.offTexture)
               && activeTextures.equals(value.activeTextures)
               && bidirectionalFixtureGroups.equals(value.bidirectionalFixtureGroups)
               && fullSurfaceFixtureGroups.equals(value.fullSurfaceFixtureGroups)
               && Objects.equals(fixtureDirectionAxis, value.fixtureDirectionAxis);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                   control,
                   offTexture,
                   activeTextures,
                   phaseTicks,
                   color,
                   beamLength,
                   beamWidth,
                   sourceGlowIntensity,
                   hotspotEnabled,
                   reverseFixtureDirection,
                   bidirectionalFixtures,
                   bidirectionalFixtureGroups,
                   fullSurfaceFixtureGroups,
                   fixtureDirectionAxis);
    }

    /** Immutable normalized model-space axis used to classify placed-model fixture direction. */
    public static final class FixtureDirectionAxis
    {
        private final float x, y, z;

        /** Creates and normalizes a finite, non-zero direction vector. */
        public FixtureDirectionAxis(float x, float y, float z)
        {
            if (finite(x) == false || finite(y) == false || finite(z) == false || x * x + y * y + z * z <= 1.0E-8F)
            {
                throw new IllegalArgumentException(
                    "Placed fixture direction axis must be finite and non-zero");
            }
            float length = (float) Math.sqrt(x * x + y * y + z * z);
            this.x = x / length;
            this.y = y / length;
            this.z = z / length;
        }

        public float x()
        {
            return x;
        }

        public float y()
        {
            return y;
        }

        public float z()
        {
            return z;
        }

        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if ((other instanceof FixtureDirectionAxis) == false)
            {
                return false;
            }
            FixtureDirectionAxis value = (FixtureDirectionAxis) other;
            return Float.compare(x, value.x) == 0
                   && Float.compare(y, value.y) == 0
                   && Float.compare(z, value.z) == 0;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(x, y, z);
        }
    }
}
