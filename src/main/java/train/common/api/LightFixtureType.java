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
        .function(RollingStockLightFunction.STEADY)
        .effect(RollingStockLightDefinition.Effect.EMISSIVE_ONLY)
        .beamDimensions(0, 0)
        .sourceGlow(0, 0)
        .hotspotEnabled(false)
        .clientProjectorEligible(false)
        .build(),
        "Non-projecting passenger-compartment illumination controlled by the auxiliary circuit."),
    BEACON(
        steadyBeacon(),
        "A steady beacon controlled by the beacon circuit."),
    COMMANDER(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.commander()),
        "A flashing Commander-style beacon controlled by the beacon circuit."),
    PRIME_1(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.prime(1)),
        "The first illuminated phase of a four-part Prime beacon."),
    PRIME_2(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.prime(2)),
        "The second illuminated phase of a four-part Prime beacon."),
    PRIME_3(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.prime(3)),
        "The third illuminated phase of a four-part Prime beacon."),
    PRIME_4(
        RollingStockLightBehaviorOverride.beacon(RollingStockLightFunction.prime(4)),
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
}
