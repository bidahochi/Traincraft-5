package train.common.api;

/** Resolves synchronized, read-only rolling-stock light state into fixture rendering output. */
public final class RollingStockLightState
{
    /** Ignores nearly sideways fixture vectors when selecting a longitudinal stock end. */
    private static final float FACING_DIRECTION_THRESHOLD = 0.05F;

    private RollingStockLightState() {}

    /**
     * Compatibility overload that resolves mutable controls to normalized source intensity.
     * Delegates to {@link #intensityForState(IRollingStockLightState,
     * RollingStockLightDefinition, double)} so mutable controls and read-only mirrors use the same
     * activation rules. A {@code null} value preserves uncontrolled-preview behavior: both
     * headlight ends are bright and every named circuit is enabled.
     *
     * @param stock mutable synchronized controls, or {@code null} when no readable state is supplied
     * @param definition immutable fixture behavior
     * @param timeTicks animation time in ticks
     * @return source intensity retained for compatibility with the original API
     */
    public static float intensity(
        IRollingStockLightControls stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return intensityForState(stock, definition, timeTicks);
    }

    /**
     * Resolves source intensity from either mutable controls or a read-only synchronized mirror.
     *
     * @param stock synchronized light state, or {@code null} for uncontrolled preview rendering
     * @param definition immutable fixture behavior
     * @param timeTicks animation time in ticks
     * @return source intensity retained for compatibility with the original API
     */
    public static float intensityForState(
        IRollingStockLightState stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return outputForState(stock, definition, timeTicks).sourceIntensity();
    }

    /**
     * Compatibility overload that resolves mutable controls into source and projected output.
     *
     * <p>A DIM-facing fixture may therefore render its lens at full authored intensity while
     * suppressing its cone and hotspot. Transient horn behavior is applied after circuit and
     * facing-end selection so a profile can safely opt into active-end or both-end response.
     *
     * @param stock mutable synchronized controls, or {@code null} when no readable state is supplied
     * @param definition immutable fixture behavior
     * @param timeTicks animation time in ticks
     * @return resolved source and projected-effect intensities
     */
    public static RollingStockLightOutput output(
        IRollingStockLightControls stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return outputForState(stock, definition, timeTicks);
    }

    /**
     * Resolves source emission and projected effects from mutable controls or a read-only mirror.
     *
     * <p>This is the state-oriented implementation used internally. The original
     * {@link #output(IRollingStockLightControls, RollingStockLightDefinition, double)} signature
     * remains as a compatibility wrapper for external callers.
     *
     * @param stock synchronized light state, or {@code null} for uncontrolled preview rendering
     * @param definition immutable fixture behavior
     * @param timeTicks animation time in ticks
     * @return resolved source and projected-effect intensities
     */
    public static RollingStockLightOutput outputForState(
        IRollingStockLightState stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        if (stock == null)
        {
            float sampledIntensity = definition.function().sampleIntensity(timeTicks);
            return new RollingStockLightOutput(sampledIntensity, sampledIntensity);
        }

        RollingStockLightFunction function = definition.function();
        boolean hornResponseActive =
            definition.channel() == RollingStockLightChannel.DITCH
            && stock.isTransientLightSignalEnabled(RollingStockTransientLightSignal.HORN)
            && definition.ditchHornMode() != RollingStockDitchHornMode.NONE;
        RollingStockHeadlightLevel facingHeadlightLevel = null;
        if (definition.controlCircuit() == RollingStockLightChannel.HEADLIGHT)
        {
            facingHeadlightLevel = headlightLevelForState(stock, definition);
            if (facingHeadlightLevel == RollingStockHeadlightLevel.OFF)
            {
                return RollingStockLightOutput.OFF;
            }
        }
        else
        {
            if (stock.isLightChannelEnabled(definition.controlCircuit()) == false)
            {
                return RollingStockLightOutput.OFF;
            }

            if (definition.activationPolicy()
                    != RollingStockLightActivationPolicy.CIRCUIT_ONLY)
            {
                facingHeadlightLevel = headlightLevelForState(stock, definition);
                if (definition.activationPolicy()
                        == RollingStockLightActivationPolicy.FACING_HEADLIGHT_BRIGHT_ONLY
                        && facingHeadlightLevel != RollingStockHeadlightLevel.BRIGHT)
                {
                    return RollingStockLightOutput.OFF;
                }
                if (facingHeadlightLevel == RollingStockHeadlightLevel.OFF
                        && (hornResponseActive == false
                            || definition.ditchHornMode()
                               != RollingStockDitchHornMode.BOTH_ENDS))
                {
                    return RollingStockLightOutput.OFF;
                }
            }
        }

        if (hornResponseActive)
        {
            if (definition.ditchHornMode() == RollingStockDitchHornMode.BOTH_ENDS
                    && (facingHeadlightLevel == null
                        || facingHeadlightLevel == RollingStockHeadlightLevel.OFF))
            {
                // DIM is the internal representation of a lens-active, projection-suppressed end.
                facingHeadlightLevel = RollingStockHeadlightLevel.DIM;
            }
            function = hornFunction(definition);
        }

        if (facingHeadlightLevel != null && function.permits(facingHeadlightLevel) == false)
        {
            return RollingStockLightOutput.OFF;
        }

        float sampledIntensity = function.sampleIntensity(timeTicks);
        boolean projectedEffectsEnabled =
            facingHeadlightLevel == null
            || facingHeadlightLevel == RollingStockHeadlightLevel.BRIGHT;
        return new RollingStockLightOutput(
            sampledIntensity, projectedEffectsEnabled ? sampledIntensity : 0);
    }

    /** Resolves the temporary horn function, preserving an authored alternating function when present. */
    private static RollingStockLightFunction hornFunction(RollingStockLightDefinition definition)
    {
        if (definition.hornFunction() != null)
        {
            return definition.hornFunction();
        }
        if (definition.function().pattern() == RollingStockLightFunction.Pattern.ALTERNATING)
        {
            return definition.function();
        }
        int phase = definition.hornPhase() != null
                    ? definition.hornPhase()
                    : definition.z() < 0 ? 0 : 1;
        return RollingStockLightFunction.alternatingDitch(phase);
    }

    /**
     * Compatibility overload that reports whether mutable controls produce visible fixture output.
     *
     * @param stock mutable synchronized controls, or {@code null} when no readable state is supplied
     * @param definition immutable fixture behavior
     * @param timeTicks animation time in ticks
     * @return whether the resolved fixture output is active
     */
    public static boolean isActive(
        IRollingStockLightControls stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return isActiveForState(stock, definition, timeTicks);
    }

    /** Reports whether mutable controls or a read-only mirror produce active fixture output. */
    public static boolean isActiveForState(
        IRollingStockLightState stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return outputForState(stock, definition, timeTicks).active();
    }

    /**
     * Compatibility overload that selects a facing headlight level from mutable controls.
     * Model-local X selects front or rear; sideways fixtures use the brighter end so they remain
     * usable on bidirectional stock.
     *
     * @param stock mutable synchronized controls, or {@code null} for a bright preview
     * @param definition fixture whose model-local direction selects the end
     * @return facing headlight level, or the brighter end for a sideways fixture
     */
    public static RollingStockHeadlightLevel headlightLevel(
        IRollingStockLightControls stock, RollingStockLightDefinition definition)
    {
        return headlightLevelForState(stock, definition);
    }

    /** Selects the applicable headlight end from mutable controls or a read-only mirror. */
    public static RollingStockHeadlightLevel headlightLevelForState(
        IRollingStockLightState stock, RollingStockLightDefinition definition)
    {
        if (stock == null)
        {
            return RollingStockHeadlightLevel.BRIGHT;
        }
        if (definition.directionX() > FACING_DIRECTION_THRESHOLD)
        {
            return stock.getFrontHeadlightLevel();
        }
        if (definition.directionX() < -FACING_DIRECTION_THRESHOLD)
        {
            return stock.getRearHeadlightLevel();
        }
        RollingStockHeadlightLevel front = stock.getFrontHeadlightLevel();
        RollingStockHeadlightLevel rear = stock.getRearHeadlightLevel();
        return front.ordinal() >= rear.ordinal() ? front : rear;
    }
}
