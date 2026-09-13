package train.common.library.track.path;

import train.common.items.TCRailTypes;
import train.common.tile.TileTCRail;

/** Supplies attachment-facing samples from the path geometry already persisted by a placed track. */
public final class TrackPathGeometry
{
	private static final double CELL_CENTER = 0.5D;
	private static final double MINIMUM_TURN_RADIUS = 0.0001D;
	private static final double[] LINEAR_FORWARD_X = {0.0D, -1.0D, 0.0D, 1.0D,
			-0.5D, -0.5D, 0.5D, 0.5D};
	private static final double[] LINEAR_FORWARD_Z = {1.0D, 0.0D, -1.0D, 0.0D,
			0.5D, -0.5D, -0.5D, 0.5D};

	private TrackPathGeometry()
	{
	}

	/**
	 * Samples the path passing through a selected track cell. Turns use their persisted rolling-stock circle; linear
	 * tracks retain the selected cell center.
	 *
	 * @param owner authoritative track owner
	 * @param cellX selected world X coordinate
	 * @param cellZ selected world Z coordinate
	 * @return sampled mount point and tangent, or {@code null} when the track has no attachment path
	 */
	public static TrackPathSample sampleAttachmentPath(TileTCRail owner, int cellX, int cellZ)
	{
		if (owner == null || owner.getRailType() == null)
		{
			return null;
		}
		if (TCRailTypes.isTurnTrack(owner))
		{
			return sampleTurnPath(owner, cellX + CELL_CENTER, cellZ + CELL_CENTER);
		}
		if (TCRailTypes.isStraightTrack(owner) || TCRailTypes.isDiagonalTrack(owner)
				|| TCRailTypes.isSlopeTrack(owner))
		{
			int facing = normalizeFacing(owner.getFacing());
			return new TrackPathSample(cellX + CELL_CENTER, cellZ + CELL_CENTER,
					LINEAR_FORWARD_X[facing], LINEAR_FORWARD_Z[facing]);
		}
		return null;
	}

	/**
	 * Returns slope progress in blocks for one owner-relative cell.
	 *
	 * @param owner authoritative linear track owner
	 * @param offsetX owner-relative cell X coordinate
	 * @param offsetZ owner-relative cell Z coordinate
	 * @return distance along the stored forward path
	 */
	public static double getLinearProgress(TileTCRail owner, int offsetX, int offsetZ)
	{
		int facing = normalizeFacing(owner.getFacing());
		return offsetX * LINEAR_FORWARD_X[facing] + offsetZ * LINEAR_FORWARD_Z[facing] + CELL_CENTER;
	}

	/**
	 * Returns the track's vertical change per world-X block.
	 *
	 * @param owner authoritative linear track owner
	 * @return vertical change per world-X block
	 */
	public static double getSlopeGradientX(TileTCRail owner)
	{
		if (owner == null || owner.slopeHeight <= 0.0D || owner.slopeLength <= 0.0D)
		{
			return 0.0D;
		}
		return owner.slopeHeight / owner.slopeLength * LINEAR_FORWARD_X[normalizeFacing(owner.getFacing())];
	}

	/**
	 * Returns the track's vertical change per world-Z block.
	 *
	 * @param owner authoritative linear track owner
	 * @return vertical change per world-Z block
	 */
	public static double getSlopeGradientZ(TileTCRail owner)
	{
		if (owner == null || owner.slopeHeight <= 0.0D || owner.slopeLength <= 0.0D)
		{
			return 0.0D;
		}
		return owner.slopeHeight / owner.slopeLength * LINEAR_FORWARD_Z[normalizeFacing(owner.getFacing())];
	}

	/**
	 * Projects a world coordinate onto the radial route used by rolling stock on the supplied turn.
	 *
	 * @param owner authoritative turn tile containing its circle center and radius
	 * @param worldX world X coordinate to project
	 * @param worldZ world Z coordinate to project
	 * @return projected path point and tangent, or {@code null} for invalid turn geometry
	 */
	public static TrackPathSample sampleTurnPath(TileTCRail owner, double worldX, double worldZ)
	{
		if (owner == null)
		{
			return null;
		}
		double radius = Math.abs(owner.r);
		if (radius < MINIMUM_TURN_RADIUS)
		{
			return null;
		}
		double radialX = worldX - owner.cx;
		double radialZ = worldZ - owner.cz;
		double radialLength = Math.sqrt(radialX * radialX + radialZ * radialZ);
		if (radialLength < MINIMUM_TURN_RADIUS)
		{
			return null;
		}
		double normalizedRadialX = radialX / radialLength;
		double normalizedRadialZ = radialZ / radialLength;
		return new TrackPathSample(owner.cx + normalizedRadialX * radius,
				owner.cz + normalizedRadialZ * radius, -normalizedRadialZ, normalizedRadialX);
	}

	private static int normalizeFacing(int facing)
	{
		int normalized = facing % LINEAR_FORWARD_X.length;
		return normalized < 0 ? normalized + LINEAR_FORWARD_X.length : normalized;
	}
}
