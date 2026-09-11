package train.common.library.track.placement;

import train.common.library.track.EnumCoreTrack;
import train.common.library.track.EnumTracks;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;

import java.util.HashMap;

/** Immutable definition and transaction state for one track validation or placement operation. */
public final class TrackPlacementContext
{
	private final ITrackDefinition selectedTrack;
	private final ITrackDefinition directionalTrack;
	private final TrackPlacementType placementType;
	private final TrackHostPlacementTransaction transaction;
	private final String straightLabel;
	private final String mediumStraightLabel;
	private final String diagonalStraightLabel;
	private final boolean valid;

	/**
	 * Creates the complete context shared by one validation or placement call chain.
	 *
	 * @param selectedTrack definition selected on the item stack
	 * @param directionalTrack handed or directional definition selected for this operation
	 * @param placementType effective host-placement behavior
	 * @param transaction host-replacement transaction, or {@code null} for non-mutating validation
	 */
	public TrackPlacementContext(ITrackDefinition selectedTrack, ITrackDefinition directionalTrack,
			TrackPlacementType placementType, TrackHostPlacementTransaction transaction)
	{
		this.selectedTrack = selectedTrack;
		this.directionalTrack = directionalTrack;
		this.placementType = placementType;
		this.transaction = transaction;

		// Resolve these once so every helper in this operation uses the same placement variant.
		HashMap<EnumCoreTrack, HashMap<String, ITrackDefinition>> tracks = selectedTrack != null
				&& selectedTrack.getVariant() != null && placementType != null
				? EnumTracks.GetTracksByGroup(selectedTrack.getVariant(), placementType) : null;
		straightLabel = getLabel(tracks, EnumCoreTrack.CORE_SMALL_STRAIGHT);
		mediumStraightLabel = getLabel(tracks, EnumCoreTrack.CORE_MEDIUM_STRAIGHT);
		diagonalStraightLabel = getLabel(tracks, EnumCoreTrack.CORE_SMALL_DIAGONAL_STRAIGHT);

		valid = selectedTrack != null && directionalTrack != null && placementType != null;
	}

	private static String getLabel(HashMap<EnumCoreTrack, HashMap<String, ITrackDefinition>> tracks,
			EnumCoreTrack core)
	{
		HashMap<String, ITrackDefinition> definitions = tracks != null ? tracks.get(core) : null;
		ITrackDefinition definition = definitions != null ? definitions.get("") : null;
		return definition != null ? definition.getLabel() : null;
	}

	/** @return whether the operation's universally required definition and placement state was resolved */
	public boolean isValid()
	{
		return valid;
	}

	/** @return definition selected on the item stack */
	public ITrackDefinition getSelectedTrack()
	{
		return selectedTrack;
	}

	/** @return handed or directional definition selected for this operation */
	public ITrackDefinition getDirectionalTrack()
	{
		return directionalTrack;
	}

	/** @return effective host-placement behavior */
	public TrackPlacementType getPlacementType()
	{
		return placementType;
	}

	/** @return host-replacement transaction, or {@code null} for non-mutating validation */
	public TrackHostPlacementTransaction getTransaction()
	{
		return transaction;
	}

	/** @return small-straight label matching this placement variant, or {@code null} when unavailable */
	public String getStraightLabel()
	{
		return straightLabel;
	}

	/** @return medium-straight label matching this placement variant, or {@code null} when unavailable */
	public String getMediumStraightLabel()
	{
		return mediumStraightLabel;
	}

	/** @return diagonal-straight label matching this placement variant, or {@code null} when unavailable */
	public String getDiagonalStraightLabel()
	{
		return diagonalStraightLabel;
	}
}
