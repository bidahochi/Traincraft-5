package train.common.api;

/** Shared activation and intensity rules used by model and effect rendering. */
public final class RollingStockLightState
{
    public static final float DIM_INTENSITY = 0.40F;

    private RollingStockLightState() {}

    /**
     * Resolves synchronized controls and the fixture time function to normalized intensity.
     * A {@code null} control source represents stock without light controls: both headlight ends
     * are bright and every named circuit is enabled.
     */
    public static float intensity(
        IRollingStockLightControls stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        float levelIntensity = 1.0F;
        if (definition.controlCircuit() == RollingStockLightChannel.HEADLIGHT)
        {
            RollingStockHeadlightLevel level = headlightLevel(stock, definition);
            if (definition.function().permits(level) == false)
            {
                return 0;
            }
            if (level == RollingStockHeadlightLevel.DIM)
            {
                levelIntensity = DIM_INTENSITY;
            }
        }
        else
        {
            if (stock != null
                    && stock.isLightChannelEnabled(definition.controlCircuit()) == false)
            {
                return 0;
            }
        }
        return levelIntensity * definition.function().sampleIntensity(timeTicks);
    }

    public static boolean isActive(
        IRollingStockLightControls stock,
        RollingStockLightDefinition definition,
        double timeTicks)
    {
        return intensity(stock, definition, timeTicks) > 0;
    }

    /**
     * Chooses front/rear control from model-local X direction; sideways fixtures use the
     * brighter end so they remain usable on bidirectional stock.
     */
    public static RollingStockHeadlightLevel headlightLevel(
        IRollingStockLightControls stock, RollingStockLightDefinition definition)
    {
        if (stock == null)
        {
            return RollingStockHeadlightLevel.BRIGHT;
        }
        if (definition.directionX() > 0.05F)
        {
            return stock.getFrontHeadlightLevel();
        }
        if (definition.directionX() < -0.05F)
        {
            return stock.getRearHeadlightLevel();
        }
        RollingStockHeadlightLevel front = stock.getFrontHeadlightLevel(),
                                   rear = stock.getRearHeadlightLevel();
        return front.ordinal() >= rear.ordinal() ? front : rear;
    }
}
