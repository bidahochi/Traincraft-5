package train.common.library.track;

import train.common.items.TCRailTypes;

/**
 * CORE TRACK PIECE WITH DISTINCT MODEL AND PATHING TO USE AND SPECIFIC TRACK PIECE
 */
public enum EnumCoreTrack
{
    NONE(null), // default value

    CORE_SMALL_STRAIGHT(TCRailTypes.RailTypes.STRAIGHT),
    CORE_MEDIUM_STRAIGHT(TCRailTypes.RailTypes.STRAIGHT),
    CORE_LONG_STRAIGHT(TCRailTypes.RailTypes.STRAIGHT),
    CORE_VERY_LONG_STRAIGHT(TCRailTypes.RailTypes.STRAIGHT),

    CORE_SMALL_DIAGONAL_STRAIGHT(TCRailTypes.RailTypes.DIAGONAL),
    CORE_MEDIUM_DIAGONAL_STRAIGHT(TCRailTypes.RailTypes.DIAGONAL),
    CORE_LONG_DIAGONAL_STRAIGHT(TCRailTypes.RailTypes.DIAGONAL),
    CORE_VERY_LONG_DIAGONAL_STRAIGHT(TCRailTypes.RailTypes.DIAGONAL),

    CORE_TWO_WAYS_CROSSING(TCRailTypes.RailTypes.CROSSING),
    CORE_DIAGONAL_TWO_WAYS_CROSSING(TCRailTypes.RailTypes.DIAGONAL_CROSSING),

    CORE_DIAMOND_CROSSING(TCRailTypes.RailTypes.DIAGONAL_CROSSING),
    CORE_DIAMOND_CROSSING_L(TCRailTypes.RailTypes.DIAGONAL_CROSSING),
    CORE_DIAMOND_CROSSING_R(TCRailTypes.RailTypes.DIAGONAL_CROSSING),

    CORE_DOUBLE_DIAMOND_CROSSING(TCRailTypes.RailTypes.DIAGONAL_CROSSING),

    CORE_FOUR_WAYS_CROSSING(TCRailTypes.RailTypes.DIAGONAL_CROSSING),

    // region 90 turns
    CORE_1X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_3X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_5X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_10X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_16X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_29X_TURN(TCRailTypes.RailTypes.TURN),
    CORE_32X_TURN(TCRailTypes.RailTypes.TURN),

    CORE_1X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_3X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_5X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_10X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_16X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_29X_TURN_L(TCRailTypes.RailTypes.TURN),
    CORE_32X_TURN_L(TCRailTypes.RailTypes.TURN),

    CORE_1X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_3X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_5X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_10X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_16X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_29X_TURN_R(TCRailTypes.RailTypes.TURN),
    CORE_32X_TURN_R(TCRailTypes.RailTypes.TURN),
    // endregion 90 turns

    // region 45 turns
    CORE_3X4_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_3X4_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_3X4_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    // Not used
    //CORE_3X5_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    //CORE_3X5_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    //CORE_3X5_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    CORE_3X6_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_3X6_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_3X6_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    CORE_4X8_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_4X8_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_4X8_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    CORE_5X11_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_5X11_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_5X11_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    CORE_9X20_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_9X20_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_9X20_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    CORE_10x22_45DEGREE_TURN(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_10x22_45DEGREE_TURN_L(TCRailTypes.RailTypes.DIAGONALTURN),
    CORE_10x22_45DEGREE_TURN_R(TCRailTypes.RailTypes.DIAGONALTURN),

    // endregion 45 turns

    // region S CURVE
     CORE_S_CURVE_2x8(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_2x8_L(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_2x8_R(TCRailTypes.RailTypes.PARALLEL),

     CORE_S_CURVE_3x12(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_3x12_L(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_3x12_R(TCRailTypes.RailTypes.PARALLEL),

     CORE_S_CURVE_4x16(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_4x16_L(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_4x16_R(TCRailTypes.RailTypes.PARALLEL),

     CORE_S_CURVE_20x2(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_20x2_L(TCRailTypes.RailTypes.PARALLEL),
     CORE_S_CURVE_20x2_R(TCRailTypes.RailTypes.PARALLEL),
    // endregion S CURVE

    // region 90 Switches
    CORE_4x4_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_4x4_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_4x4_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    CORE_6x6_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_6x6_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_6x6_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    CORE_11x11_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_11x11_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_11x11_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    CORE_4x11_PARALLEL_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_4x11_PARALLEL_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_4x11_PARALLEL_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    CORE_4x17_PARALLEL_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_4x17_PARALLEL_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_4x17_PARALLEL_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    // endregion 90 Switches

    CORE_10x2_CROSSOVER_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_10x2_CROSSOVER_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_10x2_CROSSOVER_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    // region 45 Switches
    CORE_3x5_45DEGREE_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_3x5_45DEGREE_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_3x5_45DEGREE_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    CORE_4x8_45DEGREE_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_4x8_45DEGREE_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_4x8_45DEGREE_SWITCH_R(TCRailTypes.RailTypes.SWITCH),
    // endregion 45 Switches

    // region 45-offset 45 Switches
    CORE_DIAGONAL_45DEGREE_4X3_SWITCH(TCRailTypes.RailTypes.SWITCH),
    CORE_DIAGONAL_45DEGREE_4X3_SWITCH_L(TCRailTypes.RailTypes.SWITCH),
    CORE_DIAGONAL_45DEGREE_4X3_SWITCH_R(TCRailTypes.RailTypes.SWITCH),

    // endregion 45-offset 45 Switches

    // region Slopes
    CORE_3_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_6_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_12_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_18_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_3_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_6_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_9_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_EMBEDDED_TRANSITION_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_3_DIAGONAL_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_6_DIAGONAL_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_12_DIAGONAL_SLOPE(TCRailTypes.RailTypes.SLOPE),
    CORE_18_DIAGONAL_SLOPE(TCRailTypes.RailTypes.SLOPE);
    // endregion Slopes


    private final TCRailTypes.RailTypes railType;

    public TCRailTypes.RailTypes getRailType()
    {
        return this.railType;
    }

    private EnumCoreTrack(TCRailTypes.RailTypes railType)
    {
        this.railType = railType;
    }

    public boolean isOriented90DegreeTurn()
    {
        return TCRailTypes.RailTypes.TURN.equals(railType) && isLeftRightCore();
    }

    public boolean isRight90DegreeTurn()
    {
        return TCRailTypes.RailTypes.TURN.equals(railType) && name().endsWith("_R");
    }

    /**
     * Determines whether this core climbs exactly one half block while retaining
     * the pitch of its corresponding full-height slope.
     *
	 * @return {@code true} for a cardinal or diagonal half-height slope core
     */
    public boolean isHalfHeightSlope()
    {
        return this == CORE_3_HALF_HEIGHT_SLOPE
                || this == CORE_6_HALF_HEIGHT_SLOPE
                || this == CORE_9_HALF_HEIGHT_SLOPE
                || this == CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE
                || this == CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE
                || this == CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE;
    }

    public boolean isLeftRightCore()
    {
        return name().endsWith("_L") || name().endsWith("_R");
    }

    public EnumCoreTrack getLeftRightVariant(boolean renderLeft)
    {
        return EnumCoreTrack.valueOf(name() + (renderLeft ? "_L" : "_R"));
    }

    /**
     * Returns whether this core connects an embedded track surface to the regular rail surface across the
     * embedded model inset.
     *
     * @return whether this is a cardinal or diagonal embedded transition core
     */
    public boolean isEmbeddedTransitionSlope()
    {
        return this == CORE_EMBEDDED_TRANSITION_SLOPE || this == CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE;
    }

    public boolean isCoreTrackValidForRollingStockPlaceable()
    {
        switch (this)
        {
            case CORE_SMALL_STRAIGHT :
            case CORE_MEDIUM_STRAIGHT :
            case CORE_LONG_STRAIGHT :
            case CORE_VERY_LONG_STRAIGHT :
            case CORE_SMALL_DIAGONAL_STRAIGHT :
            case CORE_MEDIUM_DIAGONAL_STRAIGHT :
            case CORE_LONG_DIAGONAL_STRAIGHT :
            case CORE_VERY_LONG_DIAGONAL_STRAIGHT :
                return true;

            default:
            {
                return false;
            }
        }
    }
}
