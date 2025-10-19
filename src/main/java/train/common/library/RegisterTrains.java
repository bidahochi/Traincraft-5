package train.common.library;

import train.common.Traincraft;
import train.common.entity.rollingStock.passenger.EntityPassengerBlue;
import train.common.library.register.ITrainRecord;
import train.common.library.register.TrainRecord;

public class RegisterTrains
{
    public RegisterTrains()
    {
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
    }
}
