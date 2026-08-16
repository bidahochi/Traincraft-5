package train.common.api;

import java.util.*;

/**
 * Immutable lighting metadata after model detection and skin overrides have been combined.
 *
 * <p>The emitter list contains the definitions that may be evaluated for the current skin.
 * {@code known} records every semantic model part considered during resolution, while
 * {@code available} is the subset whose texture and authored availability permit rendering.
 * Collections supplied to the constructor are defensively copied.</p>
 */
public final class ResolvedSkinLighting
{
    public static final ResolvedSkinLighting EMPTY =
        new ResolvedSkinLighting(
        Collections.<RollingStockLightDefinition>emptyList(),
        Collections.<String>emptySet(),
        Collections.<String>emptySet());
    private final List<RollingStockLightDefinition> emitters;
    private final Set<String> known, available;

    /**
     * Creates one resolved snapshot.
     *
     * @param emitters resolved immutable fixture definitions
     * @param known stable IDs or tagged-part names discovered on the model
     * @param available known parts available for the selected skin
     */
    public ResolvedSkinLighting(
        List<RollingStockLightDefinition> emitters, Set<String> known, Set<String> available)
    {
        this.emitters =
            Collections.unmodifiableList(new ArrayList<RollingStockLightDefinition>(emitters));
        this.known = Collections.unmodifiableSet(new HashSet<String>(known));
        this.available = Collections.unmodifiableSet(new HashSet<String>(available));
    }

    public List<RollingStockLightDefinition> emitters()
    {
        return emitters;
    }

    public Set<String> knownTaggedParts()
    {
        return known;
    }

    public Set<String> availableTaggedParts()
    {
        return available;
    }

    /**
     * Reports whether a tagged part should render for this skin.
     *
     * <p>Null and unknown names remain available so optional metadata cannot hide legacy parts.
     * Only a known part absent from the available set is suppressed.</p>
     */
    public boolean isTaggedPartAvailable(String part)
    {
        return part == null || known.contains(part) == false || available.contains(part);
    }

    /** Returns the definition matching either a stable fixture ID or tagged-part name. */
    public RollingStockLightDefinition definitionForPart(String part)
    {
        if (part == null)
        {
            return null;
        }
        for (RollingStockLightDefinition d : emitters)
        {
            if (part.equals(d.id()) || part.equals(d.taggedPartName()))
            {
                return d;
            }
        }
        return null;
    }

    /** Returns the definition with the exact stable fixture ID, or {@code null} when absent. */
    public RollingStockLightDefinition definition(String id)
    {
        if (id == null)
        {
            return null;
        }
        for (RollingStockLightDefinition d : emitters)
        {
            if (id.equals(d.id()))
            {
                return d;
            }
        }
        return null;
    }

    /**
     * Reports whether a steady, client-projector-eligible headlight faces one locomotive end.
     *
     * @param direction negative for the model's rearward X direction, otherwise forward
     */
    public boolean hasClientProjectorFacing(int direction)
    {
        for (RollingStockLightDefinition d : emitters)
        {
            if (d.clientProjectorEligible()
                    && d.channel() == RollingStockLightChannel.HEADLIGHT
                    && d.controlCircuit() == RollingStockLightChannel.HEADLIGHT
                    && d.effect() == RollingStockLightDefinition.Effect.BEAM
                    && d.function().pattern() == RollingStockLightFunction.Pattern.STEADY
                    && ((direction < 0 && d.directionX() < -0.05F)
                        || (direction >= 0 && d.directionX() > 0.05F)))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof ResolvedSkinLighting) == false)
        {
            return false;
        }
        ResolvedSkinLighting value = (ResolvedSkinLighting) other;
        return emitters.equals(value.emitters)
               && known.equals(value.known)
               && available.equals(value.available);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(emitters, known, available);
    }
}
