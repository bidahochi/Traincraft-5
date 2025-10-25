package train.common.library.register;

import net.minecraft.item.Item;

public interface ITrainRecord
{
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

    int[] getColors();

    double getBogieLocoPosition();

    Class getEntityClass();

    int getGuiRenderScale();

    String[] getAdditionalTooltip();

    int getCargoCapacity();

    String name();

}
