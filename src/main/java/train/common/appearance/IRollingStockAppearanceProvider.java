package train.common.appearance;

import train.common.api.RollingStockSkinLighting;

/**
 * Client integration boundary that resolves authored appearance lighting without loading
 * Minecraft client classes on a dedicated server.
 */
public interface IRollingStockAppearanceProvider
{
    /**
     * Resolves JSON-authored lighting for one stock and skin.
     *
     * @param stockId namespaced stable rolling-stock id
     * @param skinIdentity resolved namespaced lighting skin key, never a display name or integer
     * @return resolved JSON lighting, or {@code null} when no valid document exists
     */
    public RollingStockSkinLighting resolveLighting(String stockId, String skinIdentity);

    /** Temporary integer bridge; Delta will instead supply its resolved canonical selection. */
    public default String resolveLegacySkin(String stockId, int color)
    {
        return LegacySkinMapping.defaultId(stockId, color);
    }
}
