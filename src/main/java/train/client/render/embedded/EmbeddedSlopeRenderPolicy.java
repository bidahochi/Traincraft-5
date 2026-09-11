package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.common.items.BallastTypes;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackSlopeParameters;
import train.common.tile.TileTCRail;

/**
 * Owns the shape and placement classifications that select generated embedded half-height slope rendering.
 * Keeping these decisions outside the mesh emitter prevents previews, placed rendering, and route selection from
 * acquiring separate definitions of the supported slope family.
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedSlopeRenderPolicy
{
	/** Creates no instances; slope-render classifications are stateless. */
	private EmbeddedSlopeRenderPolicy()
	{
	}

	/**
	 * Returns whether a regular cardinal or diagonal half-height slope replaces its ballast OBJ with generated host
	 * geometry. Embedded and host-mounted variants do not use this uncut-host path.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether synthetic host cells should provide this slope's in-world ballast
	 */
	public static boolean usesUncutRegularHalfHeightBallast(TileTCRail railTile)
	{
		return railTile != null && railTile.isReplaceTargetTrack() == false && railTile.isIntactHostMountedTrack() == false
				&& usesAuthoredWoodSupport(railTile) == false
				&& getHalfHeightSlopeLength(railTile.getCoreType()) > 0;
	}

	/**
	 * Returns whether a half-height slope receives generated ballast instead of an authored ballast OBJ.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether generated half-height ballast accompanies this rail
	 */
	public static boolean usesGeneratedHalfHeightBallast(TileTCRail railTile)
	{
		return railTile != null && getHalfHeightSlopeLength(railTile.getCoreType()) > 0
				&& usesAuthoredWoodSupport(railTile) == false
				&& (railTile.isReplaceTargetTrack() == false || railTile.isIntactHostMountedTrack());
	}

	/**
	 * Determines whether a true-embedded diagonal half-height slope requires one continuous host strip.
	 *
	 * @param railTile visible rail tile whose placement mode and core are being classified
	 * @return whether continuous diagonal embedded geometry is required
	 */
	public static boolean usesContinuousTrueEmbeddedDiagonalHalfHeightSlope(TileTCRail railTile)
	{
		return railTile != null && railTile.isReplaceTargetTrack() && railTile.isIntactHostMountedTrack() == false
				&& isDiagonalHalfHeightSlopeCore(railTile.getCoreType());
	}

	/**
	 * Returns the complete footprint length for one supported half-height slope core.
	 *
	 * @param core cardinal or diagonal half-height core
	 * @return three, six, or nine cells for a supported core; otherwise zero
	 */
	public static int getHalfHeightSlopeLength(EnumCoreTrack core)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(core);
		return slope != null && core.isHalfHeightSlope() ? (int)slope.getLength() : 0;
	}

	/**
	 * Returns whether a core uses the generated diagonal half-height geometry route.
	 *
	 * @param core effective track core
	 * @return whether the core is a supported diagonal half-height slope
	 */
	public static boolean isDiagonalHalfHeightSlopeCore(EnumCoreTrack core)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(core);
		return slope != null && core.isHalfHeightSlope() && slope.isDiagonal();
	}

	/**
	 * Returns whether the selected slope intentionally retains its authored wood-support OBJ.
	 *
	 * @param railTile visible rail tile supplying the selected ballast family
	 * @return whether the rail uses authored wooden slope supports
	 */
	private static boolean usesAuthoredWoodSupport(TileTCRail railTile)
	{
		ITrackDefinition track = railTile != null ? railTile.getTrackType() : null;
		return track != null && BallastTypes.WOODSUPPORT.equals(track.getBallastType());
	}
}
