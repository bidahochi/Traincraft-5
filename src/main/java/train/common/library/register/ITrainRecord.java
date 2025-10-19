package train.common.library.register;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.library.EnumTrainType;

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

    String[] getAdditionnalTooltip();

    int getCargoCapacity();

    String name();

}
