package train.common.library.track;

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
    private final TrackPlacementType placementType;

    /**
     * Creates an unballasted surface track definition.
     *
     * @param label unique track label
     * @param railType logical rail type
     * @param variant resource variant
     * @param enumCoreTrack geometry core
     * @param item backing item identifier
     */
    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, EnumCoreTrack enumCoreTrack, TrackItemIDs item)
    {
        this(label, railType, variant, enumCoreTrack, item, TrackPlacementType.SURFACE);
    }

    /**
     * Creates an unballasted track definition with explicit placement behavior.
     *
     * @param label unique track label
     * @param railType logical rail type
     * @param variant resource variant
     * @param enumCoreTrack geometry core
     * @param item backing item identifier
     * @param placementType placement behavior
     */
    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, EnumCoreTrack enumCoreTrack, TrackItemIDs item, TrackPlacementType placementType)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.variant = variant;
        this.ballastType = null;
        this.enumCoreTrack = enumCoreTrack;
        this.placementType = placementType;
    }

    /**
     * Creates a ballasted surface track definition.
     *
     * @param label unique track label
     * @param railType logical rail type
     * @param variant resource variant
     * @param ballastType ballast material family
     * @param enumCoreTrack geometry core
     * @param item backing item identifier
     */
    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, BallastTypes ballastType, EnumCoreTrack enumCoreTrack, TrackItemIDs item)
    {
        this(label, railType, variant, ballastType, enumCoreTrack, item, TrackPlacementType.SURFACE);
    }

    /**
     * Creates a ballasted track definition with explicit placement behavior.
     *
     * @param label unique track label
     * @param railType logical rail type
     * @param variant resource variant
     * @param ballastType ballast material family
     * @param enumCoreTrack geometry core
     * @param item backing item identifier
     * @param placementType placement behavior
     */
    public TrackDefinition(String label, TCRailTypes.RailTypes railType, RailVariants variant, BallastTypes ballastType, EnumCoreTrack enumCoreTrack, TrackItemIDs item, TrackPlacementType placementType)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.variant = variant;
        this.ballastType = ballastType;
        this.enumCoreTrack = enumCoreTrack;
        this.placementType = placementType;
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

    /**
     * Returns how this generated definition occupies its selected support block.
     *
     * @return placement behavior carried by the definition
     */
    @Override
    public TrackPlacementType getPlacementType()
    {
        return placementType;
    }

    @Override
    public String getType()
    {
        return type;
    }
}
