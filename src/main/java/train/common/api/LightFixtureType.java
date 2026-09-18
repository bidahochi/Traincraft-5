package train.common.api;

/**
 * Stock- or skin-authored operational role for a physical light fixture.
 *
 * <p>The model owns fixture identity and physical geometry. A profile assigns one of these
 * operational roles, allowing rolling stock that share a model to use the same physical lens
 * differently.</p>
 */
public enum LightFixtureType
{
    HEADLIGHT(
        RollingStockLightBehaviorOverride.steadyHeadlight(),
        "A directional headlight that can emit a beam and source glow."),
    DITCH_LIGHT(
        RollingStockLightBehaviorOverride.builder()
        .controlCircuit(RollingStockLightChannel.DITCH)
        .activationPolicy(RollingStockLightActivationPolicy.FACING_HEADLIGHT)
        .ditchHornResponse(RollingStockDitchHornMode.ACTIVE_END, null, null)
        .function(RollingStockLightFunction.STEADY)
        .effect(RollingStockLightDefinition.Effect.BEAM)
        .beamLength(RollingStockLightDefinition.DEFAULT_DITCH_LIGHT_BEAM_LENGTH)
        .hotspotEnabled(true)
        .clientProjectorEligible(true)
        .build(),
        "A ditch light requiring its configured circuit and facing headlight; DIM emits only the source, while BRIGHT also projects."),
    NUMBERBOARD(
        RollingStockLightBehaviorOverride.builder()
        .controlCircuit(RollingStockLightChannel.AUX)
        .color(RollingStockLightColors.WHITE)
        .function(RollingStockLightFunction.STEADY)
        .effect(RollingStockLightDefinition.Effect.ILLUMINATED_SURFACE)
        .lightmapFloor(RollingStockLightDefinition.DEFAULT_NUMBERBOARD_LIGHTMAP_FLOOR)
        .beamDimensions(0, 0)
        .hotspotEnabled(false)
        .clientProjectorEligible(false)
        .build(),
        "An auxiliary illuminated numberboard surface without a projected beam."),
    INTERIOR_LIGHT(
        RollingStockLightBehaviorOverride.builder()
        .controlCircuit(RollingStockLightChannel.AUX)
        .color(RollingStockLightColors.WHITE)
        .function(RollingStockLightFunction.STEADY)
        .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
        .beamDimensions(0, 0)
        .sourceGlow(0, 0)
        .hotspotEnabled(false)
        .clientProjectorEligible(false)
        .build(),
        "Non-projecting passenger-compartment illumination controlled by the auxiliary circuit."),
    INSTRUMENT(
        RollingStockLightBehaviorOverride.builder()
        .controlCircuit(RollingStockLightChannel.HEADLIGHT)
        .color(RollingStockLightColors.WHITE)
        .function(RollingStockLightFunction.STEADY)
        .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
        .beamDimensions(0, 0)
        .sourceGlow(0, 0)
        .hotspotEnabled(false)
        .clientProjectorEligible(false)
        .build(),
        "Headlight-powered instrument backlighting without projected effects."),
    BEACON(
        steadyBeacon(),
        "A steady beacon controlled by the beacon circuit."),
    COMMANDER(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.commander())
        .merge(RollingStockLightBehaviorOverride.builder().color(RollingStockLightColors.AMBER)
            .sourceGlowRadius(0).build()),
        "A flashing Commander-style beacon controlled by the beacon circuit."),
    PRIME_1(
        prime(1),
        "The first illuminated phase of a four-part Prime beacon."),
    PRIME_2(
        prime(2),
        "The second illuminated phase of a four-part Prime beacon."),
    PRIME_3(
        prime(3),
        "The third illuminated phase of a four-part Prime beacon."),
    PRIME_4(
        prime(4),
        "The fourth illuminated phase of a four-part Prime beacon."),
    MARKER_LIGHT(
        RollingStockLightBehaviorOverride.marker(RollingStockLightColors.WHITE),
        "A steady non-projecting marker light controlled by the auxiliary-light circuit.");

    private final RollingStockLightBehaviorOverride behavior;
    private final String description;

    LightFixtureType(
        RollingStockLightBehaviorOverride behavior,
        String description)
    {
        this.behavior = behavior;
        this.description = description;
    }

    /** @return the behavior applied when a stock or skin assigns this role */
    public RollingStockLightBehaviorOverride behavior()
    {
        return behavior;
    }

    /** @return a concise author-facing explanation of the fixture type */
    public String description()
    {
        return description;
    }

    private static RollingStockLightBehaviorOverride steadyBeacon()
    {
        return RollingStockLightBehaviorOverride.builder()
               .controlCircuit(RollingStockLightChannel.BEACON)
               .function(RollingStockLightFunction.STEADY)
               .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
               .beamDimensions(0, 0)
               .hotspotEnabled(false)
               .clientProjectorEligible(false)
               .build();
    }

    private static RollingStockLightBehaviorOverride prime(int phase)
    {
        return RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.prime(phase))
            .merge(RollingStockLightBehaviorOverride.builder().color(RollingStockLightColors.AMBER).build());
    }

    /** Returns the authored exterior phase, or zero for a non-Prime source. */
    public int primePhase()
    {
        switch (this)
        {
            case PRIME_1: return 1;
            case PRIME_2: return 2;
            case PRIME_3: return 3;
            case PRIME_4: return 4;
            default: return 0;
        }
    }
}
