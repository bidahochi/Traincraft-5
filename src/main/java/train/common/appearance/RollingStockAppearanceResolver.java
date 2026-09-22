package train.common.appearance;

import train.common.api.RollingStockSkinLighting;

/**
 * Side-safe bridge from common rolling-stock entities to the client-only appearance loader.
 *
 * <p>The provider remains absent on dedicated servers, returning no visual overrides
 * without referencing client resource classes from common entity bytecode.</p>
 */
public final class RollingStockAppearanceResolver
{
    private static IRollingStockAppearanceProvider clientProvider;

    private RollingStockAppearanceResolver()
    {
    }

    /** Installs the client resource provider during client proxy initialization. */
    public static void setClientProvider(IRollingStockAppearanceProvider provider)
    {
        clientProvider = provider;
    }

    /**
     * Returns JSON-authored lighting, or no overrides when resources/provider are absent.
     *
     * @param stockId namespaced stock configuration id
     * @param skinIdentity current canonical skin key
     * @return JSON result or the shared empty override set; built-in model tags remain functional
     */
    public static RollingStockSkinLighting resolve(
        String stockId,
        String skinIdentity)
    {
        if (clientProvider == null || stockId == null || stockId.trim().isEmpty())
        {
            return RollingStockSkinLighting.EMPTY;
        }
        RollingStockSkinLighting resolved =
            clientProvider.resolveLighting(stockId, skinIdentity);
        return resolved == null ? RollingStockSkinLighting.EMPTY : resolved;
    }

    /** Removes the client provider during teardown or tests. */
    public static void clearClientProvider()
    {
        clientProvider = null;
    }

    /** Maps legacy selection without changing entity state, textures, permissions or saved data. */
    public static String resolveLegacySkin(String stockId, int color)
    {
        if (stockId == null || stockId.isEmpty())
        {
            return "";
        }
        return clientProvider == null
            ? LegacySkinMapping.defaultId(stockId, color)
            : clientProvider.resolveLegacySkin(stockId, color);
    }
}
