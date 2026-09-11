package train.common.track.attachment;

import train.common.items.TCRailTypes;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;

import java.util.EnumMap;
import java.util.Map;

/** Classifies track cells and resolves the geometry-dependent placement of road-crossing attachments. */
public final class RoadCrossingAttachmentResolver implements TrackAttachmentBoundsResolver
{
	private static final Map<RoadCrossingGeometry, TrackAttachmentBounds> REGISTERED_GEOMETRY =
			new EnumMap<RoadCrossingGeometry, TrackAttachmentBounds>(RoadCrossingGeometry.class);
	private static final TrackAttachmentBounds CARDINAL_BOUNDS =
			new TrackAttachmentBounds(-0.5D, 0.0D, -0.5D, 0.5D, 0.125D, 0.5D);
	/** Shared resolver used by every road-crossing appearance. */
	public static final RoadCrossingAttachmentResolver INSTANCE = new RoadCrossingAttachmentResolver();

	static
	{
		INSTANCE.registerGeometry(RoadCrossingGeometry.CARDINAL_STRAIGHT, CARDINAL_BOUNDS);
	}

	private RoadCrossingAttachmentResolver()
	{
	}

	/** @return cardinal bounds used as the attachment type's startup validation default */
	public TrackAttachmentBounds getDefaultBounds()
	{
		return CARDINAL_BOUNDS;
	}

	/**
	 * Registers placement and targeting bounds for one crossing geometry. Client model registration must enable the
	 * matching visual design before attachments using the geometry are placed.
	 *
	 * @param geometry classified crossing geometry
	 * @param bounds local selection and collision dimensions
	 * @return whether the previously unregistered geometry was accepted
	 */
	public boolean registerGeometry(RoadCrossingGeometry geometry, TrackAttachmentBounds bounds)
	{
		if (geometry == null || bounds == null || bounds.isEmpty() || REGISTERED_GEOMETRY.containsKey(geometry))
		{
			return false;
		}
		REGISTERED_GEOMETRY.put(geometry, bounds);
		return true;
	}

	/**
	 * Resolves a supported road-crossing mount. Diagonal paths are classified but remain unsupported until their
	 * geometry is registered alongside a matching client model.
	 *
	 * @param owner authoritative track owner
	 * @param cellX selected track-cell X coordinate
	 * @param cellZ selected track-cell Z coordinate
	 * @return geometry and mounting placement, or {@code null} for an unsupported track cell
	 */
	public Resolution resolve(TileTCRail owner, int cellX, int cellZ)
	{
		RoadCrossingGeometry geometry = classify(owner);
		if (geometry == null || REGISTERED_GEOMETRY.containsKey(geometry) == false)
		{
			return null;
		}
		TrackPathSample pathSample = TrackPathGeometry.sampleAttachmentPath(owner, cellX, cellZ);
		if (pathSample == null)
		{
			return null;
		}
		float yaw = (float)Math.toDegrees(Math.atan2(pathSample.getTangentX(), pathSample.getTangentZ()));
		return new Resolution(geometry,
				new TrackAttachmentPlacement(TrackAttachmentSlots.TRACK_SURFACE, yaw));
	}

	/**
	 * Returns the registered geometry family for a track owner, including unsupported diagonal straights.
	 *
	 * @param owner authoritative track owner
	 * @return classified geometry, or {@code null} when road crossings cannot use the track
	 */
	public RoadCrossingGeometry classify(TileTCRail owner)
	{
		if (owner == null)
		{
			return null;
		}
		ITrackDefinition track = owner.getTrackType();
		if (track == null || supportsPlacementType(track.getPlacementType()) == false
				|| track.getLabel().contains("ROAD_CROSSING"))
		{
			return null;
		}
		if (TCRailTypes.isStraightTrack(owner))
		{
			return RoadCrossingGeometry.CARDINAL_STRAIGHT;
		}
		return TCRailTypes.isDiagonalTrack(owner) ? RoadCrossingGeometry.DIAGONAL_STRAIGHT : null;
	}

	private static boolean supportsPlacementType(TrackPlacementType placementType)
	{
		return placementType == TrackPlacementType.SURFACE
				|| placementType == TrackPlacementType.SLAB_MOUNTED
				|| placementType == TrackPlacementType.STAIR_MOUNTED;
	}

	/** Returns geometry-dependent bounds without adding geometry identity to attachment persistence. */
	@Override
	public TrackAttachmentBounds resolveBounds(TileTCRail owner, TrackAttachment attachment)
	{
		TrackAttachmentBounds bounds = REGISTERED_GEOMETRY.get(classify(owner));
		return bounds != null ? bounds : TrackAttachmentBounds.EMPTY;
	}

	/** Immutable result shared by preview and authoritative installation. */
	public static final class Resolution
	{
		private final RoadCrossingGeometry geometry;
		private final TrackAttachmentPlacement placement;

		private Resolution(RoadCrossingGeometry geometry, TrackAttachmentPlacement placement)
		{
			this.geometry = geometry;
			this.placement = placement;
		}

		/** @return registered geometry family selected for the track cell */
		public RoadCrossingGeometry getGeometry()
		{
			return geometry;
		}

		/** @return canonical slot and yaw used by the attachment */
		public TrackAttachmentPlacement getPlacement()
		{
			return placement;
		}
	}
}
