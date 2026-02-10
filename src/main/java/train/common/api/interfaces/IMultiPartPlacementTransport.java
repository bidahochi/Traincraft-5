package train.common.api.interfaces;

import scala.collection.immutable.List;
import train.common.api.AbstractTrains;
import train.common.library.register.ITrainRecord;

public interface IMultiPartPlacementTransport
{
    boolean isMainPart();

    ITrainRecord subTransportModelPiece();

    float getSpawnOffset();

    boolean flipEntityOnSpawn();
}
