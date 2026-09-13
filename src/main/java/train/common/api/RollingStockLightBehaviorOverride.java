package train.common.api;

import java.util.Objects;

/**
 * Immutable partial skin override for a model-authored light fixture.
 * A {@code null} property inherits the fixture definition. Overrides may change behavior
 * and visual tuning, but cannot replace physical identity, position, direction, tagged
 * geometry, or explicit source surfaces.
 */
public final class RollingStockLightBehaviorOverride
{
    private final RollingStockLightChannel circuit;
    private final RollingStockLightFunction function;
    private final Integer color;
    private final RollingStockLightDefinition.Effect effect;
    private final LightBeamRotation beamRotation;
    private final Float beamLength,
            beamWidth,
            glowRadius,
            glowIntensity,
            glowWidth,
            glowHeight,
            glowRight,
            glowUp;
    private final Boolean hotspot, projector;
    private final RollingStockLightActivationPolicy activationPolicy;
    private final RollingStockDitchHornMode ditchHornMode;
    private final RollingStockLightFunction hornFunction;
    private final Integer hornPhase, lightmapFloor;

    /**
     * Creates a partial override; every nullable argument means "inherit from the model."
     * Beam and glow dimensions are model units, offsets are in the fixture-facing plane,
     * glow intensity is {@code [0,1]}, and color is packed {@code 0xRRGGBB}.
     */
    public RollingStockLightBehaviorOverride(
        RollingStockLightChannel circuit,
        RollingStockLightFunction function,
        Integer color,
        RollingStockLightDefinition.Effect effect,
        Float beamLength,
        Float beamWidth,
        Float glowRadius,
        Float glowIntensity,
        Float glowWidth,
        Float glowHeight,
        Float glowRight,
        Float glowUp,
        Boolean hotspot,
        Boolean projector)
    {
        this(
            circuit,
            function,
            color,
            effect,
            null,
            beamLength,
            beamWidth,
            glowRadius,
            glowIntensity,
            glowWidth,
            glowHeight,
            glowRight,
            glowUp,
            hotspot,
            projector,
            null,
            null,
            null,
            null,
            null);
    }

    /** Creates one immutable partial behavior override from validated optional properties. */
    private RollingStockLightBehaviorOverride(
        RollingStockLightChannel circuit,
        RollingStockLightFunction function,
        Integer color,
        RollingStockLightDefinition.Effect effect,
        LightBeamRotation beamRotation,
        Float beamLength,
        Float beamWidth,
        Float glowRadius,
        Float glowIntensity,
        Float glowWidth,
        Float glowHeight,
        Float glowRight,
        Float glowUp,
        Boolean hotspot,
        Boolean projector,
        RollingStockLightActivationPolicy activationPolicy,
        RollingStockDitchHornMode ditchHornMode,
        RollingStockLightFunction hornFunction,
        Integer hornPhase,
        Integer lightmapFloor)
    {
        this.circuit = circuit;
        this.function = function;
        this.color = color;
        this.effect = effect;
        this.beamRotation = beamRotation;
        this.beamLength = beamLength;
        this.beamWidth = beamWidth;
        this.glowRadius = glowRadius;
        this.glowIntensity = glowIntensity;
        this.glowWidth = glowWidth;
        this.glowHeight = glowHeight;
        this.glowRight = glowRight;
        this.glowUp = glowUp;
        this.hotspot = hotspot;
        this.projector = projector;
        this.activationPolicy = activationPolicy;
        this.ditchHornMode = ditchHornMode;
        this.hornFunction = hornFunction;
        this.hornPhase = hornPhase;
        this.lightmapFloor = lightmapFloor;
    }

    /** Starts an empty override that inherits every model-authored property. */
    public static Builder builder()
    {
        return new Builder();
    }

    public static RollingStockLightBehaviorOverride steadyHeadlight()
    {
        return builder()
               .controlCircuit(RollingStockLightChannel.HEADLIGHT)
               .function(RollingStockLightFunction.STEADY)
               .effect(RollingStockLightDefinition.Effect.BEAM)
               .hotspotEnabled(true)
               .clientProjectorEligible(true)
               .build();
    }

    public static RollingStockLightBehaviorOverride marker(int color)
    {
        return builder()
               .controlCircuit(RollingStockLightChannel.AUX)
               .function(RollingStockLightFunction.STEADY)
               .color(color)
               .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
               .beamDimensions(0, 0)
               .hotspotEnabled(false)
               .clientProjectorEligible(false)
               .build();
    }

    /**
     * Keeps the model-authored source emission while suppressing every projected-light effect.
     * Control circuit, function, color, availability, and source-glow values remain inherited.
     */
    public static RollingStockLightBehaviorOverride emissiveOnly()
    {
        return builder()
               .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
               .beamDimensions(0, 0)
               .hotspotEnabled(false)
               .clientProjectorEligible(false)
               .build();
    }

    public static RollingStockLightBehaviorOverride gyralite()
    {
        return builder()
               .controlCircuit(RollingStockLightChannel.GYRA)
               .activationPolicy(RollingStockLightActivationPolicy.FACING_HEADLIGHT)
               .function(RollingStockLightFunction.gyralite())
               .hotspotEnabled(true)
               .clientProjectorEligible(false)
               .build();
    }

    public static RollingStockLightBehaviorOverride mars()
    {
        return builder()
               .controlCircuit(RollingStockLightChannel.GYRA)
               .activationPolicy(RollingStockLightActivationPolicy.FACING_HEADLIGHT)
               .function(RollingStockLightFunction.mars())
               .hotspotEnabled(true)
               .clientProjectorEligible(false)
               .build();
    }

    public static RollingStockLightBehaviorOverride alternatingDitch(int phase)
    {
        return alternatingDitch(RollingStockLightFunction.alternatingDitch(phase));
    }

    public static RollingStockLightBehaviorOverride alternatingDitch(
        int phase, RollingStockLightFunction.LampResponse response)
    {
        return alternatingDitch(RollingStockLightFunction.alternatingDitch(phase, response));
    }

    public static RollingStockLightBehaviorOverride alternatingDitch(
        RollingStockLightFunction function)
    {
        if (function == null)
        {
            throw new NullPointerException("function");
        }
        if (function.pattern() != RollingStockLightFunction.Pattern.ALTERNATING)
        {
            throw new IllegalArgumentException(
                "Alternating ditch behavior requires an alternating function");
        }
        return builder()
               .controlCircuit(RollingStockLightChannel.DITCH)
               .activationPolicy(RollingStockLightActivationPolicy.FACING_HEADLIGHT)
               .ditchHornResponse(RollingStockDitchHornMode.ACTIVE_END, null, null)
               .function(function)
               .hotspotEnabled(true)
               .clientProjectorEligible(true)
               .build();
    }

    public static RollingStockLightBehaviorOverride beacon(RollingStockLightFunction f)
    {
        if (f == null
                || (f.pattern() != RollingStockLightFunction.Pattern.FLASH
                    && f.pattern() != RollingStockLightFunction.Pattern.PHASED))
        {
            throw new IllegalArgumentException(
                "Beacon behavior requires a flash or phased function");
        }
        return builder()
               .controlCircuit(RollingStockLightChannel.BEACON)
               .function(f)
               .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
               .beamDimensions(0, 0)
               .hotspotEnabled(false)
               .clientProjectorEligible(false)
               .build();
    }

    public RollingStockLightBehaviorOverride merge(RollingStockLightBehaviorOverride n)
    {
        return new RollingStockLightBehaviorOverride(
                   n.circuit != null ? n.circuit : circuit,
                   n.function != null ? n.function : function,
                   n.color != null ? n.color : color,
                   n.effect != null ? n.effect : effect,
                   n.beamRotation != null ? n.beamRotation : beamRotation,
                   n.beamLength != null ? n.beamLength : beamLength,
                   n.beamWidth != null ? n.beamWidth : beamWidth,
                   n.glowRadius != null ? n.glowRadius : glowRadius,
                   n.glowIntensity != null ? n.glowIntensity : glowIntensity,
                   n.glowWidth != null ? n.glowWidth : glowWidth,
                   n.glowHeight != null ? n.glowHeight : glowHeight,
                   n.glowRight != null ? n.glowRight : glowRight,
                   n.glowUp != null ? n.glowUp : glowUp,
                   n.hotspot != null ? n.hotspot : hotspot,
                   n.projector != null ? n.projector : projector,
                   n.activationPolicy != null ? n.activationPolicy : activationPolicy,
                   n.ditchHornMode != null ? n.ditchHornMode : ditchHornMode,
                   n.hornFunction != null ? n.hornFunction : hornFunction,
                   n.hornPhase != null ? n.hornPhase : hornPhase,
                   n.lightmapFloor != null ? n.lightmapFloor : lightmapFloor);
    }

    public RollingStockLightDefinition apply(RollingStockLightDefinition base)
    {
        RollingStockLightDefinition.Builder b = base.toBuilder();
        if (circuit != null)
        {
            b.controlCircuit(circuit);
        }
        if (function != null)
        {
            b.function(function);
        }
        if (color != null)
        {
            b.color(color);
        }
        if (effect != null)
        {
            b.effect(effect);
        }
        if (beamRotation != null)
        {
            b.beamRotation(beamRotation);
        }
        if (beamLength != null || beamWidth != null)
        {
            b.beamDimensions(
                beamLength == null ? base.beamLength() : beamLength,
                beamWidth == null ? base.beamWidth() : beamWidth);
        }
        if (glowRadius != null || glowIntensity != null)
        {
            b.sourceGlow(
                glowRadius == null ? base.sourceGlowRadius() : glowRadius,
                glowIntensity == null ? base.sourceGlowIntensity() : glowIntensity);
        }
        if (glowWidth != null || glowHeight != null || glowRight != null || glowUp != null)
        {
            b.sourceGlowShape(
                glowWidth == null ? base.sourceGlowWidthScale() : glowWidth,
                glowHeight == null ? base.sourceGlowHeightScale() : glowHeight,
                glowRight == null ? base.sourceGlowRightOffset() : glowRight,
                glowUp == null ? base.sourceGlowUpOffset() : glowUp);
        }
        if (hotspot != null)
        {
            b.hotspotEnabled(hotspot);
        }
        if (projector != null)
        {
            b.clientProjectorEligible(projector);
        }
        if (activationPolicy != null)
        {
            b.activationPolicy(activationPolicy);
        }
        if (ditchHornMode != null || hornFunction != null || hornPhase != null)
        {
            b.ditchHornResponse(
                ditchHornMode == null ? base.ditchHornMode() : ditchHornMode,
                hornFunction == null ? base.hornFunction() : hornFunction,
                hornPhase == null ? base.hornPhase() : hornPhase);
        }
        if (lightmapFloor != null)
        {
            b.lightmapFloor(lightmapFloor);
        }
        return b.build();
    }

    public RollingStockLightChannel controlCircuit()
    {
        return circuit;
    }

    public RollingStockLightFunction function()
    {
        return function;
    }

    public Integer color()
    {
        return color;
    }

    public RollingStockLightDefinition.Effect effect()
    {
        return effect;
    }

    /** Returns the skin beam rotation, or {@code null} when the model/default should be retained. */
    public LightBeamRotation beamRotation()
    {
        return beamRotation;
    }

    public Float beamLength()
    {
        return beamLength;
    }

    public Float beamWidth()
    {
        return beamWidth;
    }

    public Float sourceGlowRadius()
    {
        return glowRadius;
    }

    public Float sourceGlowIntensity()
    {
        return glowIntensity;
    }

    public Float sourceGlowWidthScale()
    {
        return glowWidth;
    }

    public Float sourceGlowHeightScale()
    {
        return glowHeight;
    }

    public Float sourceGlowRightOffset()
    {
        return glowRight;
    }

    public Float sourceGlowUpOffset()
    {
        return glowUp;
    }

    public Boolean hotspotEnabled()
    {
        return hotspot;
    }

    public Boolean clientProjectorEligible()
    {
        return projector;
    }

    /** @return activation policy override, or {@code null} when inherited */
    public RollingStockLightActivationPolicy activationPolicy()
    {
        return activationPolicy;
    }

    /** @return horn-response scope override, or {@code null} when inherited */
    public RollingStockDitchHornMode ditchHornMode()
    {
        return ditchHornMode;
    }

    /** @return temporary horn function override, or {@code null} when inherited */
    public RollingStockLightFunction hornFunction()
    {
        return hornFunction;
    }

    /** @return explicit alternating phase {@code 0..1}, or {@code null} when automatic/inherited */
    public Integer hornPhase()
    {
        return hornPhase;
    }

    /** @return Minecraft lightmap-floor override {@code 0..240}, or {@code null} when inherited */
    public Integer lightmapFloor()
    {
        return lightmapFloor;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof RollingStockLightBehaviorOverride) == false)
        {
            return false;
        }
        RollingStockLightBehaviorOverride v = (RollingStockLightBehaviorOverride) other;
        return circuit == v.circuit
               && Objects.equals(function, v.function)
               && Objects.equals(color, v.color)
               && effect == v.effect
               && Objects.equals(beamRotation, v.beamRotation)
               && Objects.equals(beamLength, v.beamLength)
               && Objects.equals(beamWidth, v.beamWidth)
               && Objects.equals(glowRadius, v.glowRadius)
               && Objects.equals(glowIntensity, v.glowIntensity)
               && Objects.equals(glowWidth, v.glowWidth)
               && Objects.equals(glowHeight, v.glowHeight)
               && Objects.equals(glowRight, v.glowRight)
               && Objects.equals(glowUp, v.glowUp)
               && Objects.equals(hotspot, v.hotspot)
               && Objects.equals(projector, v.projector)
               && activationPolicy == v.activationPolicy
               && ditchHornMode == v.ditchHornMode
               && Objects.equals(hornFunction, v.hornFunction)
               && Objects.equals(hornPhase, v.hornPhase)
               && Objects.equals(lightmapFloor, v.lightmapFloor);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                   circuit,
                   function,
                   color,
                   effect,
                   beamRotation,
                   beamLength,
                   beamWidth,
                   glowRadius,
                   glowIntensity,
                   glowWidth,
                   glowHeight,
                   glowRight,
                   glowUp,
                   hotspot,
                   projector,
                   activationPolicy,
                   ditchHornMode,
                   hornFunction,
                   hornPhase,
                   lightmapFloor);
    }

    /** Fluent builder whose unset fields retain the corresponding model value. */
    public static final class Builder
    {
        private RollingStockLightChannel c;
        private RollingStockLightFunction f;
        private Integer color;
        private RollingStockLightDefinition.Effect e;
        private LightBeamRotation beamRotation;
        private Float bl, bw, gr, gi, gw, gh, gx, gy;
        private Boolean h, p;
        private RollingStockLightActivationPolicy activationPolicy;
        private RollingStockDitchHornMode ditchHornMode;
        private RollingStockLightFunction hornFunction;
        private Integer hornPhase, lightmapFloor;

        public Builder controlCircuit(RollingStockLightChannel controlCircuit)
        {
            c = controlCircuit;
            return this;
        }

        public Builder function(RollingStockLightFunction lightFunction)
        {
            f = lightFunction;
            return this;
        }

        /** Overrides the packed {@code 0xRRGGBB} color. */
        public Builder color(int packedColor)
        {
            color = packedColor;
            return this;
        }

        public Builder effect(RollingStockLightDefinition.Effect lightEffect)
        {
            e = lightEffect;
            return this;
        }

        /** Overrides model-authored beam rotation without changing the selected source face. */
        public Builder beamRotation(float pitchDegrees, float yawDegrees)
        {
            beamRotation = new LightBeamRotation(pitchDegrees, yawDegrees);
            return this;
        }

        /** Overrides beam reach and width in model units. */
        public Builder beamDimensions(float length, float width)
        {
            bl = length;
            bw = width;
            return this;
        }

        /** Overrides beam reach while preserving the detected or configured width. */
        public Builder beamLength(float length)
        {
            bl = length;
            return this;
        }

        /** Overrides source radius in model units and opacity in {@code [0,1]}. */
        public Builder sourceGlow(float radius, float intensity)
        {
            gr = radius;
            gi = intensity;
            return this;
        }

        /** Overrides glow scales and right/up offsets in the fixture-facing plane. */
        public Builder sourceGlowShape(
            float widthScale, float heightScale, float rightOffset, float upOffset)
        {
            gw = widthScale;
            gh = heightScale;
            gx = rightOffset;
            gy = upOffset;
            return this;
        }

        public Builder hotspotEnabled(boolean enabled)
        {
            h = enabled;
            return this;
        }

        public Builder clientProjectorEligible(boolean eligible)
        {
            p = eligible;
            return this;
        }

        /**
         * Overrides how the fixture circuit is qualified by its facing headlight end.
         *
         * @param policy activation policy, or {@code null} to inherit
         * @return this builder
         */
        public Builder activationPolicy(RollingStockLightActivationPolicy policy)
        {
            activationPolicy = policy;
            return this;
        }

        /**
         * Overrides the temporary horn response for a ditch-light fixture.
         *
         * @param mode affected end or ends; {@code null} inherits the model value
         * @param temporaryFunction function used during the response; {@code null} uses the
         *     model function when alternating, otherwise the standard alternating function
         * @param phase explicit alternating phase {@code 0..1}; {@code null} selects phase from
         *     model-local fixture position
         * @return this builder
         * @throws IllegalArgumentException when phase is neither {@code null}, {@code 0}, nor {@code 1}
         */
        public Builder ditchHornResponse(
            RollingStockDitchHornMode mode,
            RollingStockLightFunction temporaryFunction,
            Integer phase)
        {
            if (phase != null && (phase < 0 || phase > 1))
            {
                throw new IllegalArgumentException("Horn phase must be 0, 1, or null");
            }
            ditchHornMode = mode;
            hornFunction = temporaryFunction;
            hornPhase = phase;
            return this;
        }

        /**
         * Overrides the minimum lightmap component value used for the emissive surface.
         *
         * @param value validated Minecraft lightmap floor in {@code 0..240}
         * @return this builder
         * @throws IllegalArgumentException when the value lies outside {@code 0..240}
         */
        public Builder lightmapFloor(int value)
        {
        if (value < 0 || value > RollingStockLightDefinition.MAXIMUM_LIGHTMAP_FLOOR)
            {
                throw new IllegalArgumentException("Lightmap floor must be 0..240");
            }
            lightmapFloor = value;
            return this;
        }

        /** Creates the immutable partial override. */
        public RollingStockLightBehaviorOverride build()
        {
            return new RollingStockLightBehaviorOverride(
                       c,
                       f,
                       color,
                       e,
                       beamRotation,
                       bl,
                       bw,
                       gr,
                       gi,
                       gw,
                       gh,
                       gx,
                       gy,
                       h,
                       p,
                       activationPolicy,
                       ditchHornMode,
                       hornFunction,
                       hornPhase,
                       lightmapFloor);
        }
    }
}
