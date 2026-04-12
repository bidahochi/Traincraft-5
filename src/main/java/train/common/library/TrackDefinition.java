package train.common.library;

import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;

public class TrackDefinition implements ITrackDefinition
{
    private final String label;
    private final String type;
    private final TCRailTypes.RailTypes railType;
    private final BallastTypes ballastType;

    private final EnumCoreTrack enumCoreTrack;

    private final RailVariants variant;
    private final TrackItemIDs item;

    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, EnumCoreTrack enumCoreTrack, TrackItemIDs item)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.variant = variant;
        this.ballastType = null;
        this.enumCoreTrack = enumCoreTrack;
    }

    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, BallastTypes ballastType, EnumCoreTrack enumCoreTrack, TrackItemIDs item)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.variant = variant;
        this.ballastType = ballastType;
        this.enumCoreTrack = enumCoreTrack;
    }

    @Override
    public String getLabel()
    {
        return label;
    }

    @Override
    public RailVariants getVariant()
    {
        return variant;
    }

    @Override
    public EnumCoreTrack getCoreTrack()
    {
        return enumCoreTrack;
    }

    @Override
    public TrackItemIDs getItem()
    {
        return item;
    }

    @Override
    public BallastTypes getBallastType()
    {
        return ballastType;
    }

    @Override
    public TCRailTypes.RailTypes getRailType()
    {
        return railType;
    }

    @Override
    public String getType()
    {
        return type;
    }
}
