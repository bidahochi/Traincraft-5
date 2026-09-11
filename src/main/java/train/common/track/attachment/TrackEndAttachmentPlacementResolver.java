package train.common.track.attachment;

import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;

/** Resolves a selected track-end slot and its canonical outward yaw from track path geometry. */
public final class TrackEndAttachmentPlacementResolver
{
	private TrackEndAttachmentPlacementResolver()
	{
	}

	/**
	 * Selects one logical track end from a world-space click and assigns its canonical outward yaw. Track families
	 * whose persisted end ordering is reversed are normalized here so attachment items do not duplicate that rule.
	 *
	 * @param owner authoritative track owner defining end ordering
	 * @param pathSample selected track path point and tangent
	 * @param worldHitX selected world X coordinate
	 * @param worldHitZ selected world Z coordinate
	 * @return placement at the selected track end
	 */
	public static TrackAttachmentPlacement resolve(TileTCRail owner, TrackPathSample pathSample,
			double worldHitX, double worldHitZ)
	{
		if (owner == null || pathSample == null)
		{
			throw new IllegalArgumentException("Track-end placement requires an owner and path sample");
		}
		double centeredHitX = worldHitX - pathSample.getWorldX();
		double centeredHitZ = worldHitZ - pathSample.getWorldZ();
		boolean forwardEnd = centeredHitX * pathSample.getTangentX()
				+ centeredHitZ * pathSample.getTangentZ() >= 0.0D;
		if (hasReversedEndOrdering(owner))
		{
			forwardEnd = forwardEnd == false;
		}
		float yaw = (float)Math.toDegrees(Math.atan2(
				pathSample.getTangentX(), pathSample.getTangentZ()));
		if (forwardEnd == false)
		{
			yaw += 180.0F;
		}
		return new TrackAttachmentPlacement(
				forwardEnd ? TrackAttachmentSlots.TRACK_END_B : TrackAttachmentSlots.TRACK_END_A,
				yaw);
	}

	/** Returns whether this legacy track family renders its ends opposite its persisted orientation. */
	private static boolean hasReversedEndOrdering(TileTCRail owner)
	{
		ITrackDefinition track = owner.getTrackType();
		return track != null && track.getPlacementType() == TrackPlacementType.REPLACE_TARGET
				&& owner.getCoreType().isHalfHeightSlope();
	}
}
