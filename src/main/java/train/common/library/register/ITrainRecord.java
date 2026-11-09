package train.common.library.register;

import net.minecraft.item.Item;

public interface ITrainRecord
{
    /** Returns the explicit stable local resource ID, or null to use the normalized internal name. */
    public String getStockId();

    String getInternalName();

    Item getItem();

    String getTrainType();

    int getMHP();

    int getMaxSpeed();

    double getMass();

    int getFuelConsumption();

    int getWaterConsumption();

    int getHeatingTime();

    double getAccelerationRate();

    double getBrakeRate();

    int getTankCapacity();

    int getSecondaryTankCapacity();

    int[] getColors();

    double getBogieLocoPosition();

    Class getEntityClass();

    /**
     * Returns the legacy fixed GUI scale retained for compatibility.
     *
     * @deprecated Rolling-stock GUI previews now size models automatically from visible bounds.
     */
    @Deprecated
    public int getGuiRenderScale();

    String[] getAdditionalTooltip();

    int getCargoCapacity();

    String name();

}
