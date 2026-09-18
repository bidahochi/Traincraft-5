package train.common.api;

import java.util.Objects;

/**
 * Immutable function patch. A complete replacement resets inherited settings; a partial patch
 * retains omitted values until a stock/profile/model baseline is available. Composition is cold
 * work: resolved definitions contain ordinary functions, not patches or JSON.
 */
public final class LightFunctionOverride
{
    private final RollingStockLightFunction replacement;
    private final RollingStockLightFunction.HeadlightRequirement requirement;
    private final Float cycle, horizontal, vertical, duty, fadeIn, fadeOut;
    private final Integer phase, count;

    /** Creates a partial patch; null fields inherit. Numeric validation occurs at the JSON boundary. */
    public LightFunctionOverride(RollingStockLightFunction.HeadlightRequirement requirement,
        Float cycle, Float horizontal, Float vertical, Float duty, Integer phase, Integer count,
        Float fadeIn, Float fadeOut)
    {
        this(null, requirement, cycle, horizontal, vertical, duty, phase, count, fadeIn, fadeOut);
    }

    private LightFunctionOverride(RollingStockLightFunction replacement,
        RollingStockLightFunction.HeadlightRequirement requirement,
        Float cycle, Float horizontal, Float vertical, Float duty, Integer phase, Integer count,
        Float fadeIn, Float fadeOut)
    {
        this.replacement = replacement;
        this.requirement = requirement;
        this.cycle = cycle;
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.duty = duty;
        this.phase = phase;
        this.count = count;
        this.fadeIn = fadeIn;
        this.fadeOut = fadeOut;
    }

    /** Wraps a Java-authored function as a full replacement; null means no override. */
    public static LightFunctionOverride replacing(RollingStockLightFunction function)
    {
        if (function == null)
        {
            return null;
        }
        return new LightFunctionOverride(function, null, null, null, null, null, null, null, null, null);
    }

    /** Returns the complete value, or null while this patch still needs an inherited baseline. */
    public RollingStockLightFunction completeFunction()
    {
        return replacement;
    }

    /** Higher-priority replacements reset the function; partial patches inherit omitted properties. */
    public LightFunctionOverride merge(LightFunctionOverride next)
    {
        if (next == null)
        {
            return this;
        }
        if (next.replacement != null)
        {
            return next;
        }
        if (replacement != null)
        {
            return replacing(next.apply(replacement));
        }
        return new LightFunctionOverride(
            next.requirement == null ? requirement : next.requirement,
            next.cycle == null ? cycle : next.cycle,
            next.horizontal == null ? horizontal : next.horizontal,
            next.vertical == null ? vertical : next.vertical,
            next.duty == null ? duty : next.duty,
            next.phase == null ? phase : next.phase,
            next.count == null ? count : next.count,
            next.fadeIn == null ? fadeIn : next.fadeIn,
            next.fadeOut == null ? fadeOut : next.fadeOut);
    }

    /** Materializes and validates the final function once a baseline is known. */
    public RollingStockLightFunction apply(RollingStockLightFunction baseline)
    {
        if (replacement != null)
        {
            return replacement;
        }
        RollingStockLightFunction.LampResponse response = baseline.lampResponse();
        if (fadeIn != null || fadeOut != null)
        {
            response = RollingStockLightFunction.LampResponse.custom(
                fadeIn == null ? response.fadeInTicks() : fadeIn,
                fadeOut == null ? response.fadeOutTicks() : fadeOut);
        }
        return new RollingStockLightFunction(baseline.pattern(),
            requirement == null ? baseline.headlightRequirement() : requirement,
            cycle == null ? baseline.cycleTicks() : cycle,
            horizontal == null ? baseline.horizontalSweepDegrees() : horizontal,
            vertical == null ? baseline.verticalSweepDegrees() : vertical,
            duty == null ? baseline.dutyCycle() : duty,
            phase == null ? baseline.phaseIndex() : phase,
            count == null ? baseline.phaseCount() : count, response);
    }

    @Override
    public boolean equals(Object other)
    {
        if ((other instanceof LightFunctionOverride) == false)
        {
            return false;
        }
        LightFunctionOverride value = (LightFunctionOverride) other;
        return Objects.equals(replacement, value.replacement) && requirement == value.requirement
            && Objects.equals(cycle, value.cycle) && Objects.equals(horizontal, value.horizontal)
            && Objects.equals(vertical, value.vertical) && Objects.equals(duty, value.duty)
            && Objects.equals(phase, value.phase) && Objects.equals(count, value.count)
            && Objects.equals(fadeIn, value.fadeIn) && Objects.equals(fadeOut, value.fadeOut);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(replacement, requirement, cycle, horizontal, vertical, duty, phase, count, fadeIn, fadeOut);
    }
}
