package train.common.library;

import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;

public interface ITrackDefinition
{
    String getLabel();
    RailVariants getVariant();
    EnumCoreTrack getCoreTrack();

    TrackItemIDs getItem();

    BallastTypes getBallastType();

    TCRailTypes.RailTypes getRailType();

    String getType();
}
