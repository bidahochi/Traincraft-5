package train.common.library.track;

import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;

/**
 * Describes one stable combination of track geometry, resources, inventory identity, and placement behavior.
 */
public interface ITrackDefinition
{
	/**
	 * Returns the stable registry label stored by items and rail tiles.
	 *
	 * @return persistent track-definition label
	 */
	public String getLabel();

	/**
	 * Returns the visible rail-and-ballast resource family.
	 *
	 * @return resource variant used by models and textures
	 */
	public RailVariants getVariant();

	/**
	 * Returns the geometry and placement footprint shared across resource variants.
	 *
	 * @return core track shape
	 */
	public EnumCoreTrack getCoreTrack();

	/**
	 * Returns the inventory item identifier representing this definition.
	 *
	 * @return associated track item identifier
	 */
	public TrackItemIDs getItem();

	/**
	 * Returns the authored ballast material family, if the definition uses one.
	 *
	 * @return ballast material classification
	 */
	public BallastTypes getBallastType();

	/**
	 * Returns the broad rail behavior used by movement and placement dispatch.
	 *
	 * @return rail behavior classification
	 */
	public TCRailTypes.RailTypes getRailType();

	/**
	 * Returns the placement behavior selected for this track definition.
	 *
	 * @return placement behavior used when placing this track
	 */
	public TrackPlacementType getPlacementType();

	/**
	 * Returns the legacy type string retained for compatibility with existing callers.
	 *
	 * @return legacy track type string
	 */
	public String getType();

	/**
	 * Returns whether this definition has an authored bridge-support mesh.
	 *
	 * @return whether a bridge pillar may select wooden supports for this track
	 */
	public default boolean supportsBridgeSupport()
	{
		if (getBallastType() != BallastTypes.DYNAMIC)
		{
			return false;
		}
		switch (getCoreTrack())
		{
			case CORE_6_SLOPE:
			case CORE_12_SLOPE:
			case CORE_18_SLOPE:
				return true;
			default:
				return false;
		}
	}
}
