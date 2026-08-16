package train.common.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Immutable physical and behavioral description of one rolling-stock light fixture.
 * Positions and directions use model-local coordinates; lengths, widths, radii, and
 * offsets use model units. Colors are packed {@code 0xRRGGBB} values. Definitions are
 * safe to cache: collection arguments are defensively copied and exposed read-only.
 */
public final class RollingStockLightDefinition
{
    /** Selects which visual products a fixture may submit to the client renderer. */
    public enum Effect
    {
        ILLUMINATED_SURFACE,
        EMISSIVE_ONLY,
        BEAM
    }

    private final String id, taggedPartName;
    private final RollingStockLightChannel channel, controlCircuit;
    private final float x, y, z, directionX, directionY, directionZ;
    private final float referenceDirectionX, referenceDirectionY, referenceDirectionZ;
    private final LightBeamRotation beamRotation;
    private final int color;
    private final Effect effect;
    private final float beamLength, beamWidth, sourceGlowRadius, sourceGlowIntensity;
    private final float sourceGlowWidthScale,
            sourceGlowHeightScale,
            sourceGlowRightOffset,
            sourceGlowUpOffset;
    private final List<SourceGlowSurface> sourceGlowSurfaces;
    private final RollingStockLightFunction function;
    private final boolean hotspotEnabled, clientProjectorEligible, instrument;
    private final List<UvRegion> taggedUvRegions;

    /**
     * Creates a fixture definition without an additional beam rotation.
     *
     * @param id stable model-scoped fixture identifier used by skin overrides
     * @param channel semantic light channel
     * @param controlCircuit circuit whose synchronized level drives the fixture
     * @param x model-local source X coordinate
     * @param y model-local source Y coordinate
     * @param z model-local source Z coordinate
     * @param directionX model-local beam direction X component
     * @param directionY model-local beam direction Y component
     * @param directionZ model-local beam direction Z component
     * @param color packed {@code 0xRRGGBB} light color
     * @param effect rendered effect category
     * @param beamLength beam reach in model units
     * @param beamWidth beam width in model units
     * @param sourceGlowRadius source glow radius in model units
     * @param sourceGlowIntensity source glow opacity in the range {@code [0,1]}
     * @param sourceGlowWidthScale horizontal source-glow scale
     * @param sourceGlowHeightScale vertical source-glow scale
     * @param sourceGlowRightOffset rightward source-glow offset in model units
     * @param sourceGlowUpOffset upward source-glow offset in model units
     * @param sourceGlowSurfaces optional explicitly authored source surfaces
     * @param function temporal pattern and lamp response
     * @param hotspotEnabled whether the source hotspot is rendered
     * @param clientProjectorEligible whether this fixture may project a dynamic beam
     * @param taggedPartName optional model part used for emissive surface discovery
     * @param taggedUvRegions optional UV restrictions for the tagged part
     */
    public RollingStockLightDefinition(
        String id,
        RollingStockLightChannel channel,
        RollingStockLightChannel controlCircuit,
        float x,
        float y,
        float z,
        float directionX,
        float directionY,
        float directionZ,
        int color,
        Effect effect,
        float beamLength,
        float beamWidth,
        float sourceGlowRadius,
        float sourceGlowIntensity,
        float sourceGlowWidthScale,
        float sourceGlowHeightScale,
        float sourceGlowRightOffset,
        float sourceGlowUpOffset,
        List<SourceGlowSurface> sourceGlowSurfaces,
        RollingStockLightFunction function,
        boolean hotspotEnabled,
        boolean clientProjectorEligible,
        String taggedPartName,
        List<UvRegion> taggedUvRegions)
    {
        this(
            id,
            channel,
            controlCircuit,
            x,
            y,
            z,
            directionX,
            directionY,
            directionZ,
            LightBeamRotation.NONE,
            color,
            effect,
            beamLength,
            beamWidth,
            sourceGlowRadius,
            sourceGlowIntensity,
            sourceGlowWidthScale,
            sourceGlowHeightScale,
            sourceGlowRightOffset,
            sourceGlowUpOffset,
            sourceGlowSurfaces,
            function,
            hotspotEnabled,
            clientProjectorEligible,
            false,
            taggedPartName,
            taggedUvRegions);
    }

    private RollingStockLightDefinition(
        String id,
        RollingStockLightChannel channel,
        RollingStockLightChannel controlCircuit,
        float x,
        float y,
        float z,
        float referenceDirectionX,
        float referenceDirectionY,
        float referenceDirectionZ,
        LightBeamRotation beamRotation,
        int color,
        Effect effect,
        float beamLength,
        float beamWidth,
        float sourceGlowRadius,
        float sourceGlowIntensity,
        float sourceGlowWidthScale,
        float sourceGlowHeightScale,
        float sourceGlowRightOffset,
        float sourceGlowUpOffset,
        List<SourceGlowSurface> sourceGlowSurfaces,
        RollingStockLightFunction function,
        boolean hotspotEnabled,
        boolean clientProjectorEligible,
        boolean instrument,
        String taggedPartName,
        List<UvRegion> taggedUvRegions)
    {
        if (id == null || id.trim().isEmpty())
        {
            throw new IllegalArgumentException("Light id must not be blank");
        }
        if (channel == null
                || controlCircuit == null
                || effect == null
                || function == null
                || beamRotation == null)
        {
            throw new NullPointerException("Light fields must not be null");
        }
        if (referenceDirectionX * referenceDirectionX
                    + referenceDirectionY * referenceDirectionY
                    + referenceDirectionZ * referenceDirectionZ
                < 1.0E-8F)
        {
            throw new IllegalArgumentException("Light direction must not be zero");
        }
        if (beamLength < 0
                || beamWidth < 0
                || finite(sourceGlowRadius) == false
                || finite(sourceGlowIntensity) == false
                || sourceGlowRadius < 0
                || sourceGlowIntensity < 0
                || sourceGlowIntensity > 1)
        {
            throw new IllegalArgumentException("Invalid light dimensions");
        }
        if (finite(sourceGlowWidthScale) == false
                || finite(sourceGlowHeightScale) == false
                || finite(sourceGlowRightOffset) == false
                || finite(sourceGlowUpOffset) == false
                || sourceGlowWidthScale <= 0
                || sourceGlowHeightScale <= 0)
        {
            throw new IllegalArgumentException("Invalid glow shape");
        }
        this.id = id;
        this.channel = channel;
        this.controlCircuit = controlCircuit;
        this.x = x;
        this.y = y;
        this.z = z;
        this.referenceDirectionX = referenceDirectionX;
        this.referenceDirectionY = referenceDirectionY;
        this.referenceDirectionZ = referenceDirectionZ;
        this.beamRotation = beamRotation;
        float[] aimedDirection =
            beamRotation.apply(
                referenceDirectionX, referenceDirectionY, referenceDirectionZ);
        directionX = aimedDirection[0];
        directionY = aimedDirection[1];
        directionZ = aimedDirection[2];
        this.color = color;
        this.effect = effect;
        this.beamLength = beamLength;
        this.beamWidth = beamWidth;
        this.sourceGlowRadius = sourceGlowRadius;
        this.sourceGlowIntensity = sourceGlowIntensity;
        this.sourceGlowWidthScale = sourceGlowWidthScale;
        this.sourceGlowHeightScale = sourceGlowHeightScale;
        this.sourceGlowRightOffset = sourceGlowRightOffset;
        this.sourceGlowUpOffset = sourceGlowUpOffset;
        this.sourceGlowSurfaces = immutable(sourceGlowSurfaces);
        this.function = function;
        this.hotspotEnabled = hotspotEnabled;
        this.clientProjectorEligible = clientProjectorEligible;
        this.instrument = instrument;
        this.taggedPartName = taggedPartName;
        this.taggedUvRegions = immutable(taggedUvRegions);
    }

    private static boolean finite(float v)
    {
        return Float.isNaN(v) == false && Float.isInfinite(v) == false;
    }

    private static <T> List<T> immutable(List<T> value)
    {
        return value == null
               ? Collections.<T>emptyList()
               : Collections.unmodifiableList(new ArrayList<T>(value));
    }

    /** Creates the conventional forward, warm-white headlight preset at a model-local point. */
    public static RollingStockLightDefinition headlight(String id, float x, float y, float z)
    {
        return builder(id, RollingStockLightChannel.HEADLIGHT)
               .position(x, y, z)
               .direction(1, 0, 0)
               .color(RollingStockLightColors.WARM_WHITE)
               .effect(Effect.BEAM)
               .beamDimensions(5, 0.45F)
               .sourceGlow(0.10F, 0.85F)
               .hotspotEnabled(true)
               .clientProjectorEligible(true)
               .taggedPart("lamp", null)
               .build();
    }

    /** Starts a definition with defaults appropriate to {@code channel}. */
    public static Builder builder(String id, RollingStockLightChannel channel)
    {
        return new Builder(id, channel);
    }

    /** Returns a mutable copy builder that preserves every authored property. */
    public Builder toBuilder()
    {
        return new Builder(id, channel)
               .controlCircuit(controlCircuit)
               .position(x, y, z)
               .direction(
                   referenceDirectionX, referenceDirectionY, referenceDirectionZ)
               .beamRotation(beamRotation)
               .color(color)
               .effect(effect)
               .beamDimensions(beamLength, beamWidth)
               .sourceGlow(sourceGlowRadius, sourceGlowIntensity)
               .sourceGlowShape(
                   sourceGlowWidthScale,
                   sourceGlowHeightScale,
                   sourceGlowRightOffset,
                   sourceGlowUpOffset)
               .sourceGlowSurfaces(sourceGlowSurfaces)
               .function(function)
               .hotspotEnabled(hotspotEnabled)
               .clientProjectorEligible(clientProjectorEligible)
               .instrument(instrument)
               .taggedPart(taggedPartName, taggedUvRegions);
    }

    public RollingStockLightDefinition withFunction(RollingStockLightFunction f)
    {
        return toBuilder().function(f).build();
    }

    public RollingStockLightDefinition withTaggedUvRegions(String name, List<UvRegion> regions)
    {
        return toBuilder().taggedPart(name, regions).build();
    }

    public String id()
    {
        return id;
    }

    public RollingStockLightChannel channel()
    {
        return channel;
    }

    public RollingStockLightChannel controlCircuit()
    {
        return controlCircuit;
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

    public float directionX()
    {
        return directionX;
    }

    public float directionY()
    {
        return directionY;
    }

    public float directionZ()
    {
        return directionZ;
    }

    /** Returns the optional beam-only rotation resolved from model and skin metadata. */
    public LightBeamRotation beamRotation()
    {
        return beamRotation;
    }

    public int color()
    {
        return color;
    }

    public Effect effect()
    {
        return effect;
    }

    public float beamLength()
    {
        return beamLength;
    }

    public float beamWidth()
    {
        return beamWidth;
    }

    public float sourceGlowRadius()
    {
        return sourceGlowRadius;
    }

    public float sourceGlowIntensity()
    {
        return sourceGlowIntensity;
    }

    public float sourceGlowWidthScale()
    {
        return sourceGlowWidthScale;
    }

    public float sourceGlowHeightScale()
    {
        return sourceGlowHeightScale;
    }

    public float sourceGlowRightOffset()
    {
        return sourceGlowRightOffset;
    }

    public float sourceGlowUpOffset()
    {
        return sourceGlowUpOffset;
    }

    public List<SourceGlowSurface> sourceGlowSurfaces()
    {
        return sourceGlowSurfaces;
    }

    public RollingStockLightFunction function()
    {
        return function;
    }

    public boolean hotspotEnabled()
    {
        return hotspotEnabled;
    }

    public boolean clientProjectorEligible()
    {
        return clientProjectorEligible;
    }

    /** Returns whether model authors locked this fixture to disable-and-color-only overrides. */
    public boolean instrument()
    {
        return instrument;
    }

    public String taggedPartName()
    {
        return taggedPartName;
    }

    public List<UvRegion> taggedUvRegions()
    {
        return taggedUvRegions;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof RollingStockLightDefinition) == false)
        {
            return false;
        }
        RollingStockLightDefinition value = (RollingStockLightDefinition) other;
        return color == value.color
               && hotspotEnabled == value.hotspotEnabled
               && clientProjectorEligible == value.clientProjectorEligible
               && instrument == value.instrument
               && Float.compare(x, value.x) == 0
               && Float.compare(y, value.y) == 0
               && Float.compare(z, value.z) == 0
               && Float.compare(directionX, value.directionX) == 0
               && Float.compare(directionY, value.directionY) == 0
               && Float.compare(directionZ, value.directionZ) == 0
               && Float.compare(referenceDirectionX, value.referenceDirectionX) == 0
               && Float.compare(referenceDirectionY, value.referenceDirectionY) == 0
               && Float.compare(referenceDirectionZ, value.referenceDirectionZ) == 0
               && Float.compare(beamLength, value.beamLength) == 0
               && Float.compare(beamWidth, value.beamWidth) == 0
               && Float.compare(sourceGlowRadius, value.sourceGlowRadius) == 0
               && Float.compare(sourceGlowIntensity, value.sourceGlowIntensity) == 0
               && Float.compare(sourceGlowWidthScale, value.sourceGlowWidthScale) == 0
               && Float.compare(sourceGlowHeightScale, value.sourceGlowHeightScale) == 0
               && Float.compare(sourceGlowRightOffset, value.sourceGlowRightOffset) == 0
               && Float.compare(sourceGlowUpOffset, value.sourceGlowUpOffset) == 0
               && id.equals(value.id)
               && channel == value.channel
               && controlCircuit == value.controlCircuit
               && effect == value.effect
               && beamRotation.equals(value.beamRotation)
               && Objects.equals(taggedPartName, value.taggedPartName)
               && sourceGlowSurfaces.equals(value.sourceGlowSurfaces)
               && function.equals(value.function)
               && taggedUvRegions.equals(value.taggedUvRegions);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                   id,
                   channel,
                   controlCircuit,
                   x,
                   y,
                   z,
                   directionX,
                   directionY,
                   directionZ,
                   referenceDirectionX,
                   referenceDirectionY,
                   referenceDirectionZ,
                   beamRotation,
                   color,
                   effect,
                   beamLength,
                   beamWidth,
                   sourceGlowRadius,
                   sourceGlowIntensity,
                   sourceGlowWidthScale,
                   sourceGlowHeightScale,
                   sourceGlowRightOffset,
                   sourceGlowUpOffset,
                   sourceGlowSurfaces,
                   function,
                   hotspotEnabled,
                   clientProjectorEligible,
                   instrument,
                   taggedPartName,
                   taggedUvRegions);
    }

    /**
     * Fluent fixture authoring helper. Spatial values are model-local and dimensional
     * values use model units; {@link #build()} validates the resulting definition.
     */
    public static final class Builder
    {
        private final String id;
        private final RollingStockLightChannel channel;
        private RollingStockLightChannel circuit;
        private float x,
                y,
                z,
                dx = 1,
                dy,
                dz,
                beamLength,
                beamWidth,
                glowRadius = 0.1F,
                glowIntensity = 0.85F,
                glowW = 1,
                glowH = 1,
                glowRight,
                glowUp;
        private int color = RollingStockLightColors.WHITE;
        private Effect effect = Effect.EMISSIVE_ONLY;
        private List<SourceGlowSurface> surfaces = Collections.emptyList();
        private RollingStockLightFunction function = RollingStockLightFunction.STEADY;
        private LightBeamRotation beamRotation = LightBeamRotation.NONE;
        private boolean hotspot, projector, instrument;
        private String taggedName;
        private List<UvRegion> regions = Collections.emptyList();

        private Builder(String id, RollingStockLightChannel channel)
        {
            this.id = id;
            this.channel = channel;
            this.circuit = channel;
            this.hotspot =
                channel == RollingStockLightChannel.HEADLIGHT
                || channel == RollingStockLightChannel.DITCH;
            this.projector =
                channel == RollingStockLightChannel.HEADLIGHT
                || channel == RollingStockLightChannel.DITCH;
        }

        public Builder controlCircuit(RollingStockLightChannel controlCircuit)
        {
            circuit = controlCircuit;
            return this;
        }

        /** Sets the model-local light-source position. */
        public Builder position(float positionX, float positionY, float positionZ)
        {
            x = positionX;
            y = positionY;
            z = positionZ;
            return this;
        }

        /** Sets the non-zero model-local reference direction. */
        public Builder direction(float directionX, float directionY, float directionZ)
        {
            dx = directionX;
            dy = directionY;
            dz = directionZ;
            return this;
        }

        /** Applies a beam-only rotation while retaining the reference source direction. */
        public Builder beamRotation(LightBeamRotation rotation)
        {
            if (rotation == null)
            {
                throw new NullPointerException("rotation");
            }
            beamRotation = rotation;
            return this;
        }

        /** Applies a beam-only rotation while retaining the reference source direction. */
        public Builder beamRotation(float pitchDegrees, float yawDegrees)
        {
            return beamRotation(new LightBeamRotation(pitchDegrees, yawDegrees));
        }

        /** Sets the packed {@code 0xRRGGBB} light color. */
        public Builder color(int packedColor)
        {
            color = packedColor;
            return this;
        }

        public Builder effect(Effect lightEffect)
        {
            effect = lightEffect;
            return this;
        }

        /** Sets beam reach and width in model units. */
        public Builder beamDimensions(float length, float width)
        {
            beamLength = length;
            beamWidth = width;
            return this;
        }

        /** Sets source radius in model units and opacity in the range {@code [0,1]}. */
        public Builder sourceGlow(float radius, float intensity)
        {
            glowRadius = radius;
            glowIntensity = intensity;
            return this;
        }

        /** Sets source-glow scales and right/up offsets in the fixture-facing plane. */
        public Builder sourceGlowShape(
            float widthScale, float heightScale, float rightOffset, float upOffset)
        {
            glowW = widthScale;
            glowH = heightScale;
            glowRight = rightOffset;
            glowUp = upOffset;
            return this;
        }

        public Builder sourceGlowSurfaces(List<SourceGlowSurface> sourceGlowSurfaces)
        {
            surfaces = sourceGlowSurfaces;
            return this;
        }

        public Builder function(RollingStockLightFunction lightFunction)
        {
            function = lightFunction;
            return this;
        }

        public Builder hotspotEnabled(boolean enabled)
        {
            hotspot = enabled;
            return this;
        }

        public Builder clientProjectorEligible(boolean eligible)
        {
            projector = eligible;
            return this;
        }

        /** Locks skin resolution to instrument availability and color overrides only. */
        public Builder instrument(boolean value)
        {
            instrument = value;
            return this;
        }

        public Builder taggedPart(String partName, List<UvRegion> ultravioletRegions)
        {
            taggedName = partName;
            regions = ultravioletRegions;
            return this;
        }

        /** Validates and creates an immutable fixture definition. */
        public RollingStockLightDefinition build()
        {
            return new RollingStockLightDefinition(
                       id,
                       channel,
                       circuit,
                       x,
                       y,
                       z,
                       dx,
                       dy,
                       dz,
                       beamRotation,
                       color,
                       effect,
                       beamLength,
                       beamWidth,
                       glowRadius,
                       glowIntensity,
                       glowW,
                       glowH,
                       glowRight,
                       glowUp,
                       surfaces,
                       function,
                       hotspot,
                       projector,
                       instrument,
                       taggedName,
                       regions);
        }
    }

    /**
     * Immutable model-local polygon used instead of an inferred billboard source glow.
     * Vertex arrays are copied on construction; normals point away from the lit face.
     */
    public static final class SourceGlowSurface
    {
        private final float x, y, z, normalX, normalY, normalZ, area;

        /**
         * Creates a source surface from parallel model-local vertex arrays.
         *
         * @param x vertex X coordinates in model units
         * @param y vertex Y coordinates in model units
         * @param z vertex Z coordinates in model units
         * @param normalX outward model-local normal X component
         * @param normalY outward model-local normal Y component
         * @param normalZ outward model-local normal Z component
         * @param area polygon area in squared model units
         */
        public SourceGlowSurface(
            float x, float y, float z, float nx, float ny, float nz, float area)
        {
            if (finite(x) == false
                    || finite(y) == false
                    || finite(z) == false
                    || finite(nx) == false
                    || finite(ny) == false
                    || finite(nz) == false
                    || finite(area) == false
                    || area <= 0
                    || nx * nx + ny * ny + nz * nz < 1.0E-8F)
            {
                throw new IllegalArgumentException("Invalid source glow surface");
            }
            this.x = x;
            this.y = y;
            this.z = z;
            normalX = nx;
            normalY = ny;
            normalZ = nz;
            this.area = area;
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

        public float normalX()
        {
            return normalX;
        }

        public float normalY()
        {
            return normalY;
        }

        public float normalZ()
        {
            return normalZ;
        }

        public float area()
        {
            return area;
        }

        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if ((other instanceof SourceGlowSurface) == false)
            {
                return false;
            }
            SourceGlowSurface v = (SourceGlowSurface) other;
            return Float.compare(x, v.x) == 0
                   && Float.compare(y, v.y) == 0
                   && Float.compare(z, v.z) == 0
                   && Float.compare(normalX, v.normalX) == 0
                   && Float.compare(normalY, v.normalY) == 0
                   && Float.compare(normalZ, v.normalZ) == 0
                   && Float.compare(area, v.area) == 0;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(x, y, z, normalX, normalY, normalZ, area);
        }
    }

    /** Immutable normalized UV rectangle used to restrict tagged-part surface discovery. */
    public static final class UvRegion
    {
        private final float minimumU, minimumV, maximumU, maximumV;

        /** Creates a rectangle from two normalized UV corners. */
        public UvRegion(float u0, float v0, float u1, float v1)
        {
            if (finite(u0) == false || finite(v0) == false || finite(u1) == false || finite(v1) == false)
            {
                throw new IllegalArgumentException("UV coordinates must be finite");
            }
            minimumU = Math.min(u0, u1);
            minimumV = Math.min(v0, v1);
            maximumU = Math.max(u0, u1);
            maximumV = Math.max(v0, v1);
        }

        public float minimumU()
        {
            return minimumU;
        }

        public float minimumV()
        {
            return minimumV;
        }

        public float maximumU()
        {
            return maximumU;
        }

        public float maximumV()
        {
            return maximumV;
        }

        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if ((other instanceof UvRegion) == false)
            {
                return false;
            }
            UvRegion v = (UvRegion) other;
            return Float.compare(minimumU, v.minimumU) == 0
                   && Float.compare(minimumV, v.minimumV) == 0
                   && Float.compare(maximumU, v.maximumU) == 0
                   && Float.compare(maximumV, v.maximumV) == 0;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(minimumU, minimumV, maximumU, maximumV);
        }
    }
}
