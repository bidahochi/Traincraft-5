package train.common.library.track;

import net.minecraft.util.AxisAlignedBB;
import train.common.items.TCRailTypes;
import train.common.tile.TileTCRail;

/** Calculates conservative client render bounds for complete multi-cell track models. */
public final class TrackRenderBounds
{
	private static final int ORIENTED_TURN_BACK_PADDING_BLOCKS = 2;

	private TrackRenderBounds()
	{
	}

	/**
	 * Calculates the world-space render bounds for a model-bearing rail tile.
	 *
	 * @param rail authoritative model-bearing tile
	 * @param track resolved track definition
	 * @return conservative world-space render bounds
	 */
	public static AxisAlignedBB calculate(TileTCRail rail, ITrackDefinition track)
	{
		EnumCoreTrack coreTrack = track.getCoreTrack();
		int radius = getRadius(coreTrack);
		int maximumRenderHeight = coreTrack.isEmbeddedTransitionSlope() == false
				&& TCRailTypes.RailTypes.SLOPE.equals(coreTrack.getRailType()) ? 4 : 2;
		AxisAlignedBB orientedBounds = calculateOrientedTurnBounds(
				rail, coreTrack, radius, maximumRenderHeight);
		return orientedBounds != null ? orientedBounds : AxisAlignedBB.getBoundingBox(
				rail.xCoord - radius, rail.yCoord - 1, rail.zCoord - radius,
				rail.xCoord + radius + 1, rail.yCoord + maximumRenderHeight, rail.zCoord + radius + 1);
	}

	/** Calculates asymmetric bounds for an oriented 90-degree turn. */
	private static AxisAlignedBB calculateOrientedTurnBounds(TileTCRail rail,
			EnumCoreTrack coreTrack, int radius, int maximumRenderHeight)
	{
		if (coreTrack.isOriented90DegreeTurn() == false)
		{
			return null;
		}

		boolean rightTurn = coreTrack.isRight90DegreeTurn();
		boolean positiveX;
		boolean positiveZ;
		switch (rail.getBlockMetadata())
		{
			case 0:
				positiveX = rightTurn == false;
				positiveZ = true;
				break;
			case 1:
				positiveX = false;
				positiveZ = rightTurn == false;
				break;
			case 2:
				positiveX = rightTurn;
				positiveZ = false;
				break;
			case 3:
				positiveX = true;
				positiveZ = rightTurn;
				break;
			default:
				return null;
		}

		int minimumX = positiveX ? rail.xCoord - ORIENTED_TURN_BACK_PADDING_BLOCKS : rail.xCoord - radius;
		int maximumX = positiveX ? rail.xCoord + radius + 1
				: rail.xCoord + ORIENTED_TURN_BACK_PADDING_BLOCKS + 1;
		int minimumZ = positiveZ ? rail.zCoord - ORIENTED_TURN_BACK_PADDING_BLOCKS : rail.zCoord - radius;
		int maximumZ = positiveZ ? rail.zCoord + radius + 1
				: rail.zCoord + ORIENTED_TURN_BACK_PADDING_BLOCKS + 1;
		return AxisAlignedBB.getBoundingBox(minimumX, rail.yCoord - 1, minimumZ,
				maximumX, rail.yCoord + maximumRenderHeight, maximumZ);
	}

	/** Returns the conservative horizontal model radius for a track core. */
	private static int getRadius(EnumCoreTrack coreTrack)
	{
		switch (coreTrack)
		{
			case CORE_EMBEDDED_TRANSITION_SLOPE:
			case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
			case CORE_SMALL_STRAIGHT:
			case CORE_SMALL_DIAGONAL_STRAIGHT:
			case CORE_TWO_WAYS_CROSSING:
			case CORE_DIAGONAL_TWO_WAYS_CROSSING:
			case CORE_1X_TURN:
			case CORE_1X_TURN_L:
			case CORE_1X_TURN_R:
				return 2;

			case CORE_MEDIUM_STRAIGHT:
			case CORE_MEDIUM_DIAGONAL_STRAIGHT:
			case CORE_3_SLOPE:
			case CORE_3_HALF_HEIGHT_SLOPE:
			case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_3_DIAGONAL_SLOPE:
			case CORE_3X_TURN:
			case CORE_3X_TURN_L:
			case CORE_3X_TURN_R:
				return 4;

			case CORE_LONG_STRAIGHT:
			case CORE_LONG_DIAGONAL_STRAIGHT:
			case CORE_6_SLOPE:
			case CORE_6_HALF_HEIGHT_SLOPE:
			case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_6_DIAGONAL_SLOPE:
			case CORE_5X_TURN:
			case CORE_5X_TURN_L:
			case CORE_5X_TURN_R:
			case CORE_3X4_45DEGREE_TURN:
			case CORE_3X4_45DEGREE_TURN_L:
			case CORE_3X4_45DEGREE_TURN_R:
			case CORE_3X6_45DEGREE_TURN:
			case CORE_3X6_45DEGREE_TURN_L:
			case CORE_3X6_45DEGREE_TURN_R:
			case CORE_3x5_45DEGREE_SWITCH:
			case CORE_3x5_45DEGREE_SWITCH_L:
			case CORE_3x5_45DEGREE_SWITCH_R:
				return 7;

			case CORE_VERY_LONG_STRAIGHT:
			case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
			case CORE_12_SLOPE:
			case CORE_9_HALF_HEIGHT_SLOPE:
			case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
			case CORE_12_DIAGONAL_SLOPE:
			case CORE_10X_TURN:
			case CORE_10X_TURN_L:
			case CORE_10X_TURN_R:
			case CORE_4X8_45DEGREE_TURN:
			case CORE_4X8_45DEGREE_TURN_L:
			case CORE_4X8_45DEGREE_TURN_R:
			case CORE_5X11_45DEGREE_TURN:
			case CORE_5X11_45DEGREE_TURN_L:
			case CORE_5X11_45DEGREE_TURN_R:
			case CORE_4x4_SWITCH:
			case CORE_4x4_SWITCH_L:
			case CORE_4x4_SWITCH_R:
			case CORE_6x6_SWITCH:
			case CORE_6x6_SWITCH_L:
			case CORE_6x6_SWITCH_R:
			case CORE_11x11_SWITCH:
			case CORE_11x11_SWITCH_L:
			case CORE_11x11_SWITCH_R:
			case CORE_10x2_CROSSOVER_SWITCH:
			case CORE_10x2_CROSSOVER_SWITCH_L:
			case CORE_10x2_CROSSOVER_SWITCH_R:
			case CORE_4x8_45DEGREE_SWITCH:
			case CORE_4x8_45DEGREE_SWITCH_L:
			case CORE_4x8_45DEGREE_SWITCH_R:
			case CORE_S_CURVE_2x8:
			case CORE_S_CURVE_2x8_L:
			case CORE_S_CURVE_2x8_R:
			case CORE_S_CURVE_3x12:
			case CORE_S_CURVE_3x12_L:
			case CORE_S_CURVE_3x12_R:
			case CORE_DIAMOND_CROSSING:
			case CORE_DIAMOND_CROSSING_L:
			case CORE_DIAMOND_CROSSING_R:
			case CORE_DOUBLE_DIAMOND_CROSSING:
			case CORE_FOUR_WAYS_CROSSING:
				return 13;

			case CORE_18_SLOPE:
			case CORE_18_DIAGONAL_SLOPE:
			case CORE_16X_TURN:
			case CORE_16X_TURN_L:
			case CORE_16X_TURN_R:
			case CORE_4x11_PARALLEL_SWITCH:
			case CORE_4x11_PARALLEL_SWITCH_L:
			case CORE_4x11_PARALLEL_SWITCH_R:
			case CORE_4x17_PARALLEL_SWITCH:
			case CORE_4x17_PARALLEL_SWITCH_L:
			case CORE_4x17_PARALLEL_SWITCH_R:
			case CORE_S_CURVE_4x16:
			case CORE_S_CURVE_4x16_L:
			case CORE_S_CURVE_4x16_R:
			case CORE_S_CURVE_20x2:
			case CORE_S_CURVE_20x2_L:
			case CORE_S_CURVE_20x2_R:
			case CORE_9X20_45DEGREE_TURN:
			case CORE_9X20_45DEGREE_TURN_L:
			case CORE_9X20_45DEGREE_TURN_R:
			case CORE_10x22_45DEGREE_TURN:
			case CORE_10x22_45DEGREE_TURN_L:
			case CORE_10x22_45DEGREE_TURN_R:
				return 23;

			case CORE_29X_TURN:
			case CORE_29X_TURN_L:
			case CORE_29X_TURN_R:
				return 30;

			case CORE_32X_TURN:
			case CORE_32X_TURN_L:
			case CORE_32X_TURN_R:
				return 33;

			default:
				return 4;
		}
	}
}
