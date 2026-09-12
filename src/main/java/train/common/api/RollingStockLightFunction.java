package train.common.api;

import java.util.Objects;

/**
 * Immutable time-domain behavior assigned to a physical light fixture.
 * Timing uses game ticks, sweeps use degrees, and sampled intensity is normalized to
 * {@code [0,1]}. Instances contain no mutable clock state and may be shared by fixtures.
 */
public final class RollingStockLightFunction
{
    /** One second at Minecraft's normal 20-tick simulation rate. */
    private static final float STANDARD_CYCLE_TICKS = 20.0F;
    private static final float HALF_CYCLE_DUTY = 0.5F;
    private static final float GYRALITE_SWEEP_DEGREES = 8.0F;
    private static final float MARS_HORIZONTAL_SWEEP_DEGREES = 10.0F;
    private static final float MARS_VERTICAL_SWEEP_DEGREES = 4.0F;
    private static final int DITCH_PHASE_COUNT = 2;
    private static final int PRIME_PHASE_COUNT = 4;

    /** Mathematical pattern used to sample intensity or beam aim over a cycle. */
    public enum Pattern
    {
        STEADY,
        GYRALITE,
        MARS,
        ALTERNATING,
        FLASH,
        PHASED
    }

    /** Minimum synchronized headlight level that permits the function to operate. */
    public enum HeadlightRequirement
    {
        ACTIVE,
        BRIGHT_ONLY
    }

    /**
     * Fade envelope that models the warm-up and cool-down of a lamp technology.
     * Both values are durations in game ticks.
     */
    public static final class LampResponse
    {
        public static final LampResponse INSTANT = new LampResponse(0, 0);
        public static final LampResponse LED = new LampResponse(0.25F, 0.25F);
        public static final LampResponse HALOGEN = new LampResponse(1, 1.5F);
        public static final LampResponse INCANDESCENT = new LampResponse(3, 4);
        private final float fadeInTicks, fadeOutTicks;

        /** Creates a non-negative, finite fade envelope measured in game ticks. */
        public LampResponse(float fadeInTicks, float fadeOutTicks)
        {
            if (finite(fadeInTicks) == false
                    || finite(fadeOutTicks) == false
                    || fadeInTicks < 0
                    || fadeOutTicks < 0)
            {
                throw new IllegalArgumentException(
                    "Lamp response timing must be finite and non-negative");
            }
            this.fadeInTicks = fadeInTicks;
            this.fadeOutTicks = fadeOutTicks;
        }

        public float fadeInTicks()
        {
            return fadeInTicks;
        }

        public float fadeOutTicks()
        {
            return fadeOutTicks;
        }

        /** Creates a custom fade envelope measured in game ticks. */
        public static LampResponse custom(float in, float out)
        {
            return new LampResponse(in, out);
        }

        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if ((other instanceof LampResponse) == false)
            {
                return false;
            }
            LampResponse value = (LampResponse) other;
            return Float.compare(fadeInTicks, value.fadeInTicks) == 0
                   && Float.compare(fadeOutTicks, value.fadeOutTicks) == 0;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(fadeInTicks, fadeOutTicks);
        }
    }

    public static final RollingStockLightFunction STEADY =
        new RollingStockLightFunction(
        Pattern.STEADY,
        HeadlightRequirement.ACTIVE,
        STANDARD_CYCLE_TICKS,
        0,
        0,
        1,
        0,
        1,
        LampResponse.INSTANT);
    private final Pattern pattern;
    private final HeadlightRequirement headlightRequirement;
    private final float cycleTicks, horizontalSweepDegrees, verticalSweepDegrees, dutyCycle;
    private final int phaseIndex, phaseCount;
    private final LampResponse lampResponse;

    /**
     * Creates a temporal light function.
     *
     * @param pattern sampling pattern
     * @param requirement minimum headlight setting required to operate
     * @param cycleTicks full cycle duration in game ticks
     * @param horizontal horizontal beam sweep amplitude in degrees
     * @param vertical vertical beam sweep amplitude in degrees
     * @param dutyCycle illuminated fraction of a cycle in {@code [0,1]}
     * @param phaseIndex zero-based phase assigned to this fixture
     * @param phaseCount number of cooperating phases
     * @param response lamp fade envelope
     */
    public RollingStockLightFunction(
        Pattern pattern,
        HeadlightRequirement requirement,
        float cycleTicks,
        float horizontal,
        float vertical,
        float dutyCycle,
        int phaseIndex,
        int phaseCount,
        LampResponse response)
    {
        if (pattern == null
                || requirement == null
                || response == null
                || finite(cycleTicks) == false
                || cycleTicks <= 0
                || finite(horizontal) == false
                || finite(vertical) == false
                || finite(dutyCycle) == false
                || dutyCycle < 0
                || dutyCycle > 1
                || phaseCount < 1
                || phaseIndex < 0
                || phaseIndex >= phaseCount)
        {
            throw new IllegalArgumentException("Invalid rolling-stock light function");
        }
        float phaseLength = cycleTicks / phaseCount;
        if (pattern == Pattern.ALTERNATING
                && (response.fadeInTicks() > phaseLength || response.fadeOutTicks() > phaseLength))
        {
            throw new IllegalArgumentException("Lamp response cannot exceed an alternating phase");
        }
        this.pattern = pattern;
        this.headlightRequirement = requirement;
        this.cycleTicks = cycleTicks;
        this.horizontalSweepDegrees = horizontal;
        this.verticalSweepDegrees = vertical;
        this.dutyCycle = dutyCycle;
        this.phaseIndex = phaseIndex;
        this.phaseCount = phaseCount;
        this.lampResponse = response;
    }

    private static boolean finite(float v)
    {
        return Float.isNaN(v) == false && Float.isInfinite(v) == false;
    }

    public static RollingStockLightFunction gyralite()
    {
        return new RollingStockLightFunction(
                   Pattern.GYRALITE,
                   HeadlightRequirement.ACTIVE,
                   STANDARD_CYCLE_TICKS,
                   GYRALITE_SWEEP_DEGREES,
                   GYRALITE_SWEEP_DEGREES,
                   1,
                   0,
                   1,
                   LampResponse.INSTANT);
    }

    public static RollingStockLightFunction mars()
    {
        return new RollingStockLightFunction(
                   Pattern.MARS,
                   HeadlightRequirement.ACTIVE,
                   STANDARD_CYCLE_TICKS,
                   MARS_HORIZONTAL_SWEEP_DEGREES,
                   MARS_VERTICAL_SWEEP_DEGREES,
                   1,
                   0,
                   1,
                   LampResponse.INSTANT);
    }

    public static RollingStockLightFunction alternatingDitch(int phase)
    {
        return alternatingDitch(phase, LampResponse.INCANDESCENT);
    }

    public static RollingStockLightFunction alternatingDitch(int phase, LampResponse response)
    {
        if (phase < 0 || phase > 1)
        {
            throw new IllegalArgumentException("Alternating ditch-light phase must be 0 or 1");
        }
        return new RollingStockLightFunction(
                   Pattern.ALTERNATING,
                   HeadlightRequirement.ACTIVE,
                   STANDARD_CYCLE_TICKS,
                   0,
                   0,
                   HALF_CYCLE_DUTY,
                   phase,
                   DITCH_PHASE_COUNT,
                   response);
    }

    public static RollingStockLightFunction commander()
    {
        return new RollingStockLightFunction(
                   Pattern.FLASH,
                   HeadlightRequirement.ACTIVE,
                   40,//how many blink per centimeter or somthin idk
                //higher the cycleticks the longer the delay or smthn
                   0,
                   0,
                   0.05f,//closer to 0 is more off // 0.05f
                   0,
                   1,
                   LampResponse.INSTANT);
    }

    public static RollingStockLightFunction prime(int phase)
    {
        if (phase < 1 || phase > PRIME_PHASE_COUNT)
        {
            throw new IllegalArgumentException("Prime phase must be 1..4");
        }
        return new RollingStockLightFunction(
                   Pattern.PHASED,
                   HeadlightRequirement.ACTIVE,
                   STANDARD_CYCLE_TICKS,
                   0,
                   0,
                   1.0F / PRIME_PHASE_COUNT,
                   phase - 1,
                   PRIME_PHASE_COUNT,
                   LampResponse.INSTANT);
    }

    /** Returns whether the supplied synchronized control level enables this function. */
    public boolean permits(RollingStockHeadlightLevel level)
    {
        return level != null
               && level != RollingStockHeadlightLevel.OFF
               && (headlightRequirement != HeadlightRequirement.BRIGHT_ONLY
                   || level == RollingStockHeadlightLevel.BRIGHT);
    }

    /**
     * Samples normalized output intensity at an absolute or relative game-tick time.
     * Periodic patterns wrap negative and positive times consistently.
     */
    public float sampleIntensity(double timeTicks)
    {
        if (pattern == Pattern.FLASH)
        {
            return modulo(Math.floor(timeTicks), cycleTicks) < cycleTicks * dutyCycle ? 1 : 0;
        }
        if (pattern == Pattern.PHASED)
        {
            double length = cycleTicks / phaseCount, pos = modulo(timeTicks, cycleTicks) / length;
            int current = (int) Math.floor(pos), next = (current + 1) % phaseCount;
            float p = (float)(pos - current), handoff = p * p * (3 - 2 * p);
            return phaseIndex == current ? 1 - handoff : phaseIndex == next ? handoff : 0;
        }
        if (pattern == Pattern.ALTERNATING)
        {
            double length = cycleTicks / phaseCount,
                   local = modulo(timeTicks - phaseIndex * length, cycleTicks);
            if (lampResponse.fadeInTicks() > 0 && local < lampResponse.fadeInTicks())
            {
                return smooth((float) local / lampResponse.fadeInTicks());
            }
            if (local < length)
            {
                return 1;
            }
            double after = local - length;
            if (lampResponse.fadeOutTicks() > 0 && after < lampResponse.fadeOutTicks())
            {
                return 1 - smooth((float) after / lampResponse.fadeOutTicks());
            }
            return 0;
        }
        return 1;
    }

    private static float smooth(float v)
    {
        v = Math.max(0, Math.min(1, v));
        return v * v * (3 - 2 * v);
    }

    private static double modulo(double v, double m)
    {
        double r = v % m;
        return r < 0 ? r + m : r;
    }

    public Pattern pattern()
    {
        return pattern;
    }

    public HeadlightRequirement headlightRequirement()
    {
        return headlightRequirement;
    }

    public float cycleTicks()
    {
        return cycleTicks;
    }

    public float horizontalSweepDegrees()
    {
        return horizontalSweepDegrees;
    }

    public float verticalSweepDegrees()
    {
        return verticalSweepDegrees;
    }

    public float dutyCycle()
    {
        return dutyCycle;
    }

    public int phaseIndex()
    {
        return phaseIndex;
    }

    public int phaseCount()
    {
        return phaseCount;
    }

    public LampResponse lampResponse()
    {
        return lampResponse;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof RollingStockLightFunction) == false)
        {
            return false;
        }
        RollingStockLightFunction value = (RollingStockLightFunction) other;
        return pattern == value.pattern
               && headlightRequirement == value.headlightRequirement
               && Float.compare(cycleTicks, value.cycleTicks) == 0
               && Float.compare(horizontalSweepDegrees, value.horizontalSweepDegrees) == 0
               && Float.compare(verticalSweepDegrees, value.verticalSweepDegrees) == 0
               && Float.compare(dutyCycle, value.dutyCycle) == 0
               && phaseIndex == value.phaseIndex
               && phaseCount == value.phaseCount
               && lampResponse.equals(value.lampResponse);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(
                   pattern,
                   headlightRequirement,
                   cycleTicks,
                   horizontalSweepDegrees,
                   verticalSweepDegrees,
                   dutyCycle,
                   phaseIndex,
                   phaseCount,
                   lampResponse);
    }
}
