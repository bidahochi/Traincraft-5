package train.common.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Immutable ordered collection of resolved rolling-stock fixture definitions.
 *
 * <p>The input list is defensively copied so cached profiles can be shared safely between render
 * phases. Definition order is retained for deterministic rendering and tests.</p>
 */
public final class RollingStockLightProfile
{
    public static final RollingStockLightProfile EMPTY =
        new RollingStockLightProfile(Collections.<RollingStockLightDefinition>emptyList());
    private final List<RollingStockLightDefinition> definitions;

    /** @param definitions fixture definitions to copy into this profile */
    public RollingStockLightProfile(List<RollingStockLightDefinition> definitions)
    {
        this.definitions =
            Collections.unmodifiableList(
                new ArrayList<RollingStockLightDefinition>(definitions));
    }

    public List<RollingStockLightDefinition> definitions()
    {
        return definitions;
    }

    @Override
    public boolean equals(Object other)
    {
        return this == other
               || other instanceof RollingStockLightProfile
               && definitions.equals(((RollingStockLightProfile) other).definitions);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(definitions);
    }
}
