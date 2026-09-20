package train.common.appearance;

import train.common.api.RollingStockHornLightResponsePolicy;

/** Bridges current integer entity selections to the skin-keyed server policy lookup. */
public final class LegacyHornLightPolicyAdapter
{
    private LegacyHornLightPolicyAdapter()
    {
    }

    /**
     * Uses one snapshot for mapping and lookup, preventing mixed generations during dev reload.
     * Future string-based entities can call ServerHornLightPolicies.resolve directly instead.
     * A missing stock returns null to preserve the existing Java fallback.
     */
    public static RollingStockHornLightResponsePolicy resolve(String stockId, int color)
    {
        ServerHornLightPolicies.StockPolicies stock = ServerHornLightPolicies.forStock(stockId);
        if (stock == null)
        {
            return null;
        }
        String skinId = stock.legacyMapping().resolve(stockId, color);
        return stock.resolve(skinId);
    }
}
