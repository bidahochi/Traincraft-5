package train.common.library;

import net.minecraft.entity.player.EntityPlayer;
import train.common.items.BallastTypes;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;

import javax.annotation.Nullable;
import java.util.HashMap;

import static train.common.items.BallastTypes.*;
import static train.common.items.RailVariants.EMBEDDED;
import static train.common.items.RailVariants.NORMAL;
import static train.common.items.TCRailTypes.RailTypes.*;
import static train.common.library.EnumCoreTrack.*;

public enum EnumTracks
{
    /**
     * Tooltip gets shown when hovering over item.
     * switchSize is the amount of tile entities that change when activating a switch, used in TileTCRail > changeSwitchState
     */

    SMALL_STRAIGHT("SMALL_STRAIGHT", STRAIGHT, NORMAL, CORE_SMALL_STRAIGHT, ItemIDs.tcRailSmallStraight, "1x1"),
    MEDIUM_STRAIGHT("MEDIUM_STRAIGHT", STRAIGHT, NORMAL, CORE_MEDIUM_STRAIGHT, ItemIDs.tcRailMediumStraight, "1x3"),
    LONG_STRAIGHT("LONG_STRAIGHT", STRAIGHT, NORMAL, CORE_LONG_STRAIGHT, ItemIDs.tcRailLongStraight, "1x6"),
    VERY_LONG_STRAIGHT("VERY_LONG_STRAIGHT", STRAIGHT, NORMAL, CORE_VERY_LONG_STRAIGHT, ItemIDs.tcRailVeryLongStraight, "1x12"),

    SMALL_DIAGONAL_STRAIGHT("SMALL_DIAGONAL_STRAIGHT", DIAGONAL, NORMAL, CORE_SMALL_DIAGONAL_STRAIGHT, ItemIDs.tcRailSmallStraight, "1x1"),
    MEDIUM_DIAGONAL_STRAIGHT("MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, NORMAL, CORE_MEDIUM_DIAGONAL_STRAIGHT, ItemIDs.tcRailMediumStraight, "1x3"),
    LONG_DIAGONAL_STRAIGHT("LONG_DIAGONAL_STRAIGHT", DIAGONAL, NORMAL, CORE_LONG_DIAGONAL_STRAIGHT, ItemIDs.tcRailLongStraight, "1x6"),
    VERY_LONG_DIAGONAL_STRAIGHT("VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, NORMAL, CORE_VERY_LONG_DIAGONAL_STRAIGHT, ItemIDs.tcRailVeryLongStraight, "1x12"),

    TURN_1X1("TURN_1X1", TURN, NORMAL, CORE_1X_TURN, ItemIDs.tcRail1X1Turn, "1x1"),
    LEFT_TURN_1X1("LEFT_TURN_1X1", TURN, NORMAL, CORE_1X_TURN_L, ItemIDs.tcRail1X1Turn, ""),
    RIGHT_TURN_1X1("RIGHT_TURN_1X1", TURN, NORMAL, CORE_1X_TURN_R, ItemIDs.tcRail1X1Turn, ""),

    MEDIUM_TURN("MEDIUM_TURN", TURN, NORMAL, CORE_3X_TURN, ItemIDs.tcRailMediumTurn, "3x3"),
    MEDIUM_RIGHT_TURN("MEDIUM_RIGHT_TURN", TURN, NORMAL, CORE_3X_TURN_R, ItemIDs.tcRailMediumTurn, ""),
    MEDIUM_LEFT_TURN("MEDIUM_LEFT_TURN", TURN, NORMAL, CORE_3X_TURN_L, ItemIDs.tcRailMediumTurn, ""),

    LARGE_TURN("LARGE_TURN", TURN, NORMAL, CORE_5X_TURN, ItemIDs.tcRailLargeTurn, "5x5"),
    LARGE_RIGHT_TURN("LARGE_RIGHT_TURN", TURN, NORMAL, CORE_5X_TURN_R, ItemIDs.tcRailLargeTurn, ""),
    LARGE_LEFT_TURN("LARGE_LEFT_TURN", TURN, NORMAL, CORE_5X_TURN_L, ItemIDs.tcRailLargeTurn, ""),

    VERY_LARGE_TURN("VERY_LARGE_TURN", TURN, NORMAL, CORE_10X_TURN, ItemIDs.tcRailVeryLargeTurn, "10x10"),
    VERY_LARGE_RIGHT_TURN("VERY_LARGE_RIGHT_TURN", TURN, NORMAL, CORE_10X_TURN_R, ItemIDs.tcRailVeryLargeTurn, ""),
    VERY_LARGE_LEFT_TURN("VERY_LARGE_LEFT_TURN", TURN, NORMAL, CORE_10X_TURN_L, ItemIDs.tcRailVeryLargeTurn, ""),

    SUPER_LARGE_TURN("SUPER_LARGE_TURN", TURN, NORMAL, CORE_16X_TURN, ItemIDs.tcRailSuperLargeTurn, "16x16"),
    SUPER_LARGE_LEFT_TURN("SUPER_LARGE_LEFT_TURN", TURN, NORMAL, CORE_16X_TURN_L, ItemIDs.tcRailSuperLargeTurn, ""),
    SUPER_LARGE_RIGHT_TURN("SUPER_LARGE_RIGHT_TURN", TURN, NORMAL, CORE_16X_TURN_R, ItemIDs.tcRailSuperLargeTurn, ""),

    TURN_29X29("TURN_29X29", TURN, NORMAL, CORE_29X_TURN, ItemIDs.tcRail29X29Turn, "29x29"),
    LEFT_TURN_29X29("LEFT_TURN_29X29", TURN, NORMAL, CORE_29X_TURN_L, ItemIDs.tcRail29X29Turn, ""),
    RIGHT_TURN_29X29("RIGHT_TURN_29X29", TURN, NORMAL, CORE_29X_TURN_R, ItemIDs.tcRail29X29Turn, ""),

    TURN_32X32("TURN_32X32", TURN, NORMAL, CORE_32X_TURN, ItemIDs.tcRail32X32Turn, "32x32"),
    LEFT_TURN_32X32("LEFT_TURN_32X32", TURN, NORMAL, CORE_32X_TURN_L, ItemIDs.tcRail32X32Turn, ""),
    RIGHT_TURN_32X32("RIGHT_TURN_32X32", TURN, NORMAL, CORE_32X_TURN_R, ItemIDs.tcRail32X32Turn, ""),
    
    MEDIUM_SWITCH("MEDIUM_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumSwitch, "4x4"),
    MEDIUM_RIGHT_SWITCH("MEDIUM_RIGHT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumSwitch, ""),
    MEDIUM_LEFT_SWITCH("MEDIUM_LEFT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumSwitch, ""),

    LARGE_SWITCH("LARGE_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeSwitch, "6x6"),
    LARGE_RIGHT_SWITCH("LARGE_RIGHT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeSwitch, ""),
    LARGE_LEFT_SWITCH("LARGE_LEFT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeSwitch, ""),

    VERY_LARGE_SWITCH("VERY_LARGE_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailVeryLargeSwitch, "11x11"),
    VERY_LARGE_RIGHT_SWITCH("VERY_LARGE_RIGHT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailVeryLargeSwitch, ""),
    VERY_LARGE_LEFT_SWITCH("VERY_LARGE_LEFT_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailVeryLargeSwitch, ""),

    CROSSOVER_SWITCH_10X2("CROSSOVER_SWITCH_10X2", SWITCH, NORMAL, ItemIDs.tcRailCrossoverSwitch10x2, "10x3"),
    CROSSOVER_SWITCH_10X2_LEFT("CROSSOVER_SWITCH_10X2_LEFT", SWITCH, NORMAL, ItemIDs.tcRailCrossoverSwitch10x2, ""),
    CROSSOVER_SWITCH_10X2_RIGHT("CROSSOVER_SWITCH_10X2_RIGHT", SWITCH, NORMAL, ItemIDs.tcRailCrossoverSwitch10x2, ""),

    MEDIUM_PARALLEL_SWITCH("MEDIUM_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumParallelSwitch, "4x11"),
    MEDIUM_RIGHT_PARALLEL_SWITCH("MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumParallelSwitch, ""),
    MEDIUM_LEFT_PARALLEL_SWITCH("MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailMediumParallelSwitch, ""),

    LARGE_PARALLEL_SWITCH("LARGE_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeParallelSwitch, "4x17"),
    LARGE_RIGHT_PARALLEL_SWITCH("LARGE_RIGHT_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeParallelSwitch, ""),
    LARGE_LEFT_PARALLEL_SWITCH("LARGE_LEFT_PARALLEL_SWITCH", SWITCH, NORMAL, ItemIDs.tcRailLargeParallelSwitch,  ""),

    MEDIUM_45DEGREE_TURN("MEDIUM_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X4_45DEGREE_TURN, ItemIDs.tcRailMedium45DegreeTurn, "3x4 hold sneak to attach to the back of another curve"),
    MEDIUM_RIGHT_45DEGREE_TURN("MEDIUM_RIGHT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X4_45DEGREE_TURN_R, ItemIDs.tcRailMedium45DegreeTurn, ""),
    MEDIUM_LEFT_45DEGREE_TURN("MEDIUM_LEFT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X4_45DEGREE_TURN_L, ItemIDs.tcRailMedium45DegreeTurn, ""),

    LARGE_45DEGREE_TURN("LARGE_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X6_45DEGREE_TURN, ItemIDs.tcRailLarge45DegreeTurn, "3x6 hold sneak to attach to the back of another curve"),
    LARGE_RIGHT_45DEGREE_TURN("LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X6_45DEGREE_TURN_R, ItemIDs.tcRailLarge45DegreeTurn, ""),
    LARGE_LEFT_45DEGREE_TURN("LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_3X6_45DEGREE_TURN_L, ItemIDs.tcRailLarge45DegreeTurn, ""),

    VERY_LARGE_45DEGREE_TURN("VERY_LARGE_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_4X8_45DEGREE_TURN, ItemIDs.tcRailVeryLarge45DegreeTurn, "4x8 hold sneak to attach to the back of another curve"),
    VERY_LARGE_RIGHT_45DEGREE_TURN("VERY_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_4X8_45DEGREE_TURN_R, ItemIDs.tcRailVeryLarge45DegreeTurn, ""),
    VERY_LARGE_LEFT_45DEGREE_TURN("VERY_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_4X8_45DEGREE_TURN_L, ItemIDs.tcRailVeryLarge45DegreeTurn, ""),

    SUPER_LARGE_45DEGREE_TURN("SUPER_LARGE_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_5X11_45DEGREE_TURN, ItemIDs.tcRailSuperLarge45DegreeTurn, "5x11 hold sneak to attach to the back of another curve"),
    SUPER_LARGE_RIGHT_45DEGREE_TURN("SUPER_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_5X11_45DEGREE_TURN_R, ItemIDs.tcRailSuperLarge45DegreeTurn, ""),
    SUPER_LARGE_LEFT_45DEGREE_TURN("SUPER_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, NORMAL, CORE_5X11_45DEGREE_TURN_L, ItemIDs.tcRailSuperLarge45DegreeTurn, ""),

    DIAGONAL_TURN_9X20("DIAGONAL_TURN_9X20", DIAGONALTURN, NORMAL, CORE_9X20_45DEGREE_TURN, ItemIDs.tcRail45DegreeTurn9x20,  "9x20 hold sneak to attach to the back of another curve"),
    DIAGONAL_LEFT_TURN_9X20("DIAGONAL_LEFT_TURN_9X20", DIAGONALTURN, NORMAL, CORE_9X20_45DEGREE_TURN_L,  ItemIDs.tcRail45DegreeTurn9x20, ""),
    DIAGONAL_RIGHT_TURN_9X20("DIAGONAL_RIGHT_TURN_9X20", DIAGONALTURN, NORMAL, CORE_9X20_45DEGREE_TURN_R,  ItemIDs.tcRail45DegreeTurn9x20, ""),

    DIAGONAL_TURN_10X22("DIAGONAL_TURN_10X22", DIAGONALTURN, NORMAL, CORE_10x22_45DEGREE_TURN, ItemIDs.tcRail45DegreeTurn10x22, "10x22 hold sneak to attach to the back of another curve"),
    DIAGONAL_LEFT_TURN_10X22("DIAGONAL_LEFT_TURN_10X22", DIAGONALTURN, NORMAL, CORE_10x22_45DEGREE_TURN_L, ItemIDs.tcRail45DegreeTurn10x22, ""),
    DIAGONAL_RIGHT_TURN_10X22("DIAGONAL_RIGHT_TURN_10X22", DIAGONALTURN, NORMAL, CORE_10x22_45DEGREE_TURN_R, ItemIDs.tcRail45DegreeTurn10x22, ""),
    
    MEDIUM_45DEGREE_SWITCH("MEDIUM_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_3x5_45DEGREE_SWITCH, ItemIDs.tcRailMedium45DegreeSwitch, "3x5 hold sneak to attach to the back of another curve"),
    MEDIUM_RIGHT_45DEGREE_SWITCH("MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_3x5_45DEGREE_SWITCH_R, ItemIDs.tcRailMedium45DegreeSwitch, ""),
    MEDIUM_LEFT_45DEGREE_SWITCH("MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_3x5_45DEGREE_SWITCH_L, ItemIDs.tcRailMedium45DegreeSwitch, ""),

    LARGE_45DEGREE_SWITCH("LARGE_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_4x8_45DEGREE_SWITCH, ItemIDs.tcRailLarge45DegreeSwitch, "4x8 hold sneak to attach to the back of another curve"),
    LARGE_RIGHT_45DEGREE_SWITCH("LARGE_RIGHT_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_4x8_45DEGREE_SWITCH_R, ItemIDs.tcRailLarge45DegreeSwitch,""),
    LARGE_LEFT_45DEGREE_SWITCH("LARGE_LEFT_45DEGREE_SWITCH", SWITCH, NORMAL, CORE_4x8_45DEGREE_SWITCH_L, ItemIDs.tcRailLarge45DegreeSwitch,""),

    TWO_WAYS_CROSSING("TWO_WAYS_CROSSING", CROSSING, NORMAL, ItemIDs.tcRailTwoWaysCrossing, "3x3"),
    DIAGONAL_TWO_WAYS_CROSSING("DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailTwoWaysCrossing, "3x3"),

    DIAMOND_CROSSING("DIAMOND_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailDiamondCrossing, "3x3"),
    RIGHT_DIAMOND_CROSSING("RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailDiamondCrossing,"3x3"),
    LEFT_DIAMOND_CROSSING("LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailDiamondCrossing, "3x3"),

    DOUBLE_DIAMOND_CROSSING("DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailDoubleDiamondCrossing, "3x3"),

    FOUR_WAYS_CROSSING("FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, NORMAL, ItemIDs.tcRailFourWaysCrossing, "3x3"),

    SLOPE_WOOD("SLOPE_WOOD", SLOPE, NORMAL, WOODSUPPORT, CORE_6_SLOPE, ItemIDs.tcRailSlopeWood, "1x6"),
    SLOPE_GRAVEL("SLOPE_GRAVEL", SLOPE, NORMAL, GRAVEL, CORE_6_SLOPE,ItemIDs.tcRailSlopeGravel, "1x6"),
    SLOPE_BALLAST("SLOPE_BALLAST", SLOPE, NORMAL, BALLAST, CORE_6_SLOPE,ItemIDs.tcRailSlopeBallast, "1x6"),

    LARGE_SLOPE_WOOD("LARGE_SLOPE_WOOD", SLOPE, NORMAL, WOODSUPPORT, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopeWood, "1x12"),
    LARGE_SLOPE_GRAVEL("LARGE_SLOPE_GRAVEL", SLOPE, NORMAL, GRAVEL, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopeGravel, "1x12"),
    LARGE_SLOPE_BALLAST("LARGE_SLOPE_BALLAST", SLOPE, NORMAL, BALLAST, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopeBallast, "1x12"),

    VERY_LARGE_SLOPE_WOOD("VERY_LARGE_SLOPE_WOOD", SLOPE, NORMAL, WOODSUPPORT, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopeWood, "1x18"),
    VERY_LARGE_SLOPE_GRAVEL("VERY_LARGE_SLOPE_GRAVEL", SLOPE, NORMAL, GRAVEL, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopeGravel, "1x18"),
    VERY_LARGE_SLOPE_BALLAST("VERY_LARGE_SLOPE_BALLAST", SLOPE, NORMAL, BALLAST, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopeBallast, "1x18"),

    SLOPE_SNOW_GRAVEL("SLOPE_SNOW_GRAVEL", SLOPE, NORMAL, SNOWGRAVEL, CORE_6_SLOPE, ItemIDs.tcRailSlopeSnowGravel, "1x6"),
    LARGE_SLOPE_SNOW_GRAVEL("LARGE_SLOPE_SNOW_GRAVEL", SLOPE, NORMAL, SNOWGRAVEL, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopeSnowGravel, "1x12"),
    VERY_LARGE_SLOPE_SNOW_GRAVEL("VERY_LARGE_SLOPE_SNOW_GRAVEL", SLOPE, NORMAL, SNOWGRAVEL, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopeSnowGravel, "1x18"),

    SLOPE_PEA_GRAVEL("SLOPE_PEA_GRAVEL", SLOPE, NORMAL, PEAGRAVEL, CORE_6_SLOPE, ItemIDs.tcRailSlopePeaGravel, "1x6"),
    LARGE_SLOPE_PEA_GRAVEL("LARGE_SLOPE_PEA_GRAVEL", SLOPE, NORMAL, PEAGRAVEL, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopePeaGravel, "1x12"),
    VERY_LARGE_SLOPE_PEA_GRAVEL("VERY_LARGE_SLOPE_PEA_GRAVEL", SLOPE, NORMAL, PEAGRAVEL, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopePeaGravel, "1x18"),

    SLOPE_1X3_DYNAMIC("SLOPE_1X3_DYNAMIC", SLOPE, NORMAL, DYNAMIC, CORE_3_SLOPE, ItemIDs.tcRail1X3SlopeDynamic, "1x3"),
    SLOPE_DYNAMIC("SLOPE_DYNAMIC", SLOPE, NORMAL, DYNAMIC, CORE_6_SLOPE, ItemIDs.tcRailSlopeDynamic, "1x6"),
    LARGE_SLOPE_DYNAMIC("LARGE_SLOPE_DYNAMIC", SLOPE,  NORMAL, DYNAMIC, CORE_12_SLOPE, ItemIDs.tcRailLargeSlopeDynamic, "1x12" ),
    VERY_LARGE_SLOPE_DYNAMIC("VERY_LARGE_SLOPE_DYNAMIC", SLOPE, NORMAL, DYNAMIC, CORE_18_SLOPE, ItemIDs.tcRailVeryLargeSlopeDynamic,"1x18"),

    SLOPE_1X3_DYNAMIC_DIAGONAL("SLOPE_1X3_DYNAMIC_DIAGONAL", SLOPE, NORMAL, DYNAMIC, CORE_3_DIAGONAL_SLOPE, ItemIDs.tcRail1X3SlopeDynamic, "1x3"),
    SLOPE_1X6_DYNAMIC_DIAGONAL("SLOPE_1X6_DYNAMIC_DIAGONAL", SLOPE, NORMAL, DYNAMIC, CORE_6_DIAGONAL_SLOPE,  ItemIDs.tcRailSlopeDynamic, "1x6"),
    SLOPE_1X12_DYNAMIC_DIAGONAL("SLOPE_1X12_DYNAMIC_DIAGONAL", SLOPE, NORMAL, DYNAMIC, CORE_12_DIAGONAL_SLOPE, ItemIDs.tcRailLargeSlopeDynamic, "1x12"),
    SLOPE_1X18_DYNAMIC_DIAGONAL("SLOPE_1X18_DYNAMIC_DIAGONAL", SLOPE, NORMAL, DYNAMIC, CORE_18_DIAGONAL_SLOPE, ItemIDs.tcRailVeryLargeSlopeDynamic, "1x18"),

    SMALL_PARALLEL_CURVE("SMALL_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_2x8, ItemIDs.tcRailSmallParallelCurve, "2x8"),
    SMALL_RIGHT_PARALLEL_CURVE("SMALL_RIGHT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_2x8_R, ItemIDs.tcRailSmallParallelCurve, ""),
    SMALL_LEFT_PARALLEL_CURVE("SMALL_LEFT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_2x8_L, ItemIDs.tcRailSmallParallelCurve, ""),

    MEDIUM_PARALLEL_CURVE("MEDIUM_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_3x12, ItemIDs.tcRailMediumParallelCurve, "3x12"),
    MEDIUM_RIGHT_PARALLEL_CURVE("MEDIUM_RIGHT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_3x12_R, ItemIDs.tcRailMediumParallelCurve, ""),
    MEDIUM_LEFT_PARALLEL_CURVE("MEDIUM_LEFT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_3x12_L, ItemIDs.tcRailMediumParallelCurve, ""),

    LARGE_PARALLEL_CURVE("LARGE_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_4x16, ItemIDs.tcRailLargeParallelCurve, "4x16"),
    LARGE_RIGHT_PARALLEL_CURVE("LARGE_RIGHT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_4x16_R, ItemIDs.tcRailLargeParallelCurve, ""),
    LARGE_LEFT_PARALLEL_CURVE("LARGE_LEFT_PARALLEL_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_4x16_L, ItemIDs.tcRailLargeParallelCurve, ""),
    S_CURVE_20x2("20x2_S_CURVE", PARALLEL, NORMAL, CORE_S_CURVE_20x2, ItemIDs.tcRail20x2SCurve,  "2x20"),
    S_CURVE_20x2_RIGHT("20x2_S_CURVE_RIGHT", PARALLEL, NORMAL, CORE_S_CURVE_20x2_R, ItemIDs.tcRail20x2SCurve, ""),
    S_CURVE_20x2_LEFT("20x2_S_CURVE_LEFT", PARALLEL, NORMAL, CORE_S_CURVE_20x2_L, ItemIDs.tcRail20x2SCurve, ""),

    /**
     * Embedded Tracks
     */

    EMBEDDED_SMALL_STRAIGHT("EMBEDDED_SMALL_STRAIGHT", STRAIGHT, EMBEDDED, CORE_SMALL_STRAIGHT, ItemIDs.tcRailEmbeddedSmallStraight, "1x1"),
    EMBEDDED_MEDIUM_STRAIGHT("EMBEDDED_MEDIUM_STRAIGHT", STRAIGHT, EMBEDDED, CORE_MEDIUM_STRAIGHT, ItemIDs.tcRailEmbeddedMediumStraight, "1x3"),
    EMBEDDED_LONG_STRAIGHT("EMBEDDED_LONG_STRAIGHT", STRAIGHT, EMBEDDED, CORE_LONG_STRAIGHT, ItemIDs.tcRailEmbeddedLongStraight,"1x6"),
    EMBEDDED_VERY_LONG_STRAIGHT("EMBEDDED_VERY_LONG_STRAIGHT", STRAIGHT, EMBEDDED, CORE_VERY_LONG_STRAIGHT, ItemIDs.tcRailEmbeddedVeryLongStraight, "1x12"),

    EMBEDDED_SMALL_DIAGONAL_STRAIGHT("EMBEDDED_SMALL_DIAGONAL_STRAIGHT", DIAGONAL, EMBEDDED, CORE_SMALL_DIAGONAL_STRAIGHT,ItemIDs.tcRailEmbeddedSmallStraight, "1x1"),
    EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT("EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT", DIAGONAL, EMBEDDED, CORE_MEDIUM_DIAGONAL_STRAIGHT, ItemIDs.tcRailEmbeddedMediumStraight, "1x3"),
    EMBEDDED_LONG_DIAGONAL_STRAIGHT("EMBEDDED_LONG_DIAGONAL_STRAIGHT", DIAGONAL, EMBEDDED, CORE_LONG_DIAGONAL_STRAIGHT, ItemIDs.tcRailEmbeddedLongStraight, "1x6"),
    EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT("EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT", DIAGONAL, EMBEDDED, CORE_VERY_LONG_DIAGONAL_STRAIGHT, ItemIDs.tcRailEmbeddedVeryLongStraight, "1x12"),

    EMBEDDED_TURN_1X1("EMBEDDED_TURN_1X1", TURN, EMBEDDED, CORE_1X_TURN, ItemIDs.tcRailEmbedded1X1Turn, "1x1"),
    EMBEDDED_LEFT_TURN_1X1("EMBEDDED_LEFT_TURN_1X1", TURN, EMBEDDED, CORE_1X_TURN_L, ItemIDs.tcRailEmbedded1X1Turn, ""),
    EMBEDDED_RIGHT_TURN_1X1("EMBEDDED_RIGHT_TURN_1X1", TURN, EMBEDDED, CORE_1X_TURN_R, ItemIDs.tcRailEmbedded1X1Turn, ""),

    EMBEDDED_MEDIUM_TURN("EMBEDDED_MEDIUM_TURN", TURN, EMBEDDED, CORE_3X_TURN, ItemIDs.tcRailEmbeddedMediumTurn, "3x3"),
    EMBEDDED_MEDIUM_RIGHT_TURN("EMBEDDED_MEDIUM_RIGHT_TURN", TURN, EMBEDDED, CORE_3X_TURN_R, ItemIDs.tcRailEmbeddedMediumTurn, ""),
    EMBEDDED_MEDIUM_LEFT_TURN("EMBEDDED_MEDIUM_LEFT_TURN", TURN, EMBEDDED, CORE_3X_TURN_L, ItemIDs.tcRailEmbeddedMediumTurn, ""),

    EMBEDDED_LARGE_TURN("EMBEDDED_LARGE_TURN", TURN, EMBEDDED, CORE_5X_TURN, ItemIDs.tcRailEmbeddedLargeTurn, "5x5"),
    EMBEDDED_LARGE_RIGHT_TURN("EMBEDDED_LARGE_RIGHT_TURN", TURN, EMBEDDED, CORE_5X_TURN_R, ItemIDs.tcRailEmbeddedLargeTurn,""),
    EMBEDDED_LARGE_LEFT_TURN("EMBEDDED_LARGE_LEFT_TURN", TURN, EMBEDDED, CORE_5X_TURN_L, ItemIDs.tcRailEmbeddedLargeTurn, ""),

    EMBEDDED_VERY_LARGE_TURN("EMBEDDED_VERY_LARGE_TURN", TURN, EMBEDDED, CORE_10X_TURN, ItemIDs.tcRailEmbeddedVeryLargeTurn, "10x10"),
    EMBEDDED_VERY_LARGE_RIGHT_TURN("EMBEDDED_VERY_LARGE_RIGHT_TURN", TURN, EMBEDDED, CORE_10X_TURN_R, ItemIDs.tcRailEmbeddedVeryLargeTurn, ""),
    EMBEDDED_VERY_LARGE_LEFT_TURN("EMBEDDED_VERY_LARGE_LEFT_TURN", TURN, EMBEDDED, CORE_10X_TURN_L, ItemIDs.tcRailEmbeddedVeryLargeTurn, ""),

    EMBEDDED_SUPER_LARGE_TURN("EMBEDDED_SUPER_LARGE_TURN", TURN, EMBEDDED, CORE_16X_TURN, ItemIDs.tcRailEmbeddedSuperLargeTurn, "16x16"),
    EMBEDDED_SUPER_LARGE_RIGHT_TURN("EMBEDDED_SUPER_LARGE_RIGHT_TURN", TURN, EMBEDDED, CORE_16X_TURN_R, ItemIDs.tcRailEmbeddedSuperLargeTurn, ""),
    EMBEDDED_SUPER_LARGE_LEFT_TURN("EMBEDDED_SUPER_LARGE_LEFT_TURN", TURN, EMBEDDED, CORE_16X_TURN_L, ItemIDs.tcRailEmbeddedSuperLargeTurn, ""),

    EMBEDDED_TURN_29X29("EMBEDDED_TURN_29X29", TURN, EMBEDDED, CORE_29X_TURN, ItemIDs.tcRailEmbedded29X29Turn, "29x29"),
    EMBEDDED_LEFT_TURN_29X29("EMBEDDED_LEFT_TURN_29X29", TURN, EMBEDDED, CORE_29X_TURN_L, ItemIDs.tcRailEmbedded29X29Turn, ""),
    EMBEDDED_RIGHT_TURN_29X29("EMBEDDED_RIGHT_TURN_29X29", TURN, EMBEDDED, CORE_29X_TURN_R, ItemIDs.tcRailEmbedded29X29Turn, ""),

    EMBEDDED_TURN_32X32("EMBEDDED_TURN_32X32", TURN, EMBEDDED, CORE_32X_TURN, ItemIDs.tcRailEmbedded32X32Turn, "32x32"),
    EMBEDDED_LEFT_TURN_32X32("EMBEDDED_LEFT_TURN_32X32", TURN, EMBEDDED, CORE_32X_TURN_L, ItemIDs.tcRailEmbedded32X32Turn, ""),
    EMBEDDED_RIGHT_TURN_32X32("EMBEDDED_RIGHT_TURN_32X32", TURN, EMBEDDED, CORE_32X_TURN_R, ItemIDs.tcRailEmbedded32X32Turn, ""),

    EMBEDDED_MEDIUM_45DEGREE_TURN("EMBEDDED_MEDIUM_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X4_45DEGREE_TURN, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, "3x4 hold sneak to attach to the back of another curve"),
    EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN("EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X4_45DEGREE_TURN_L, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, ""),
    EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN("EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X4_45DEGREE_TURN_R, ItemIDs.tcRailEmbeddedMedium45DegreeTurn, ""),

    EMBEDDED_LARGE_45DEGREE_TURN("EMBEDDED_LARGE_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X6_45DEGREE_TURN, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, "3x6 hold sneak to attach to the back of another curve"),
    EMBEDDED_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X6_45DEGREE_TURN_R, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, ""),
    EMBEDDED_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_3X6_45DEGREE_TURN_L, ItemIDs.tcRailEmbeddedLarge45DegreeTurn, ""),

    EMBEDDED_VERY_LARGE_45DEGREE_TURN("EMBEDDED_VERY_LARGE_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_4X8_45DEGREE_TURN, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, "4x8 hold sneak to attach to the back of another curve"),
    EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_4X8_45DEGREE_TURN_R, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, ""),
    EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_4X8_45DEGREE_TURN_L, ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn, ""),

    EMBEDDED_SUPER_LARGE_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_45DEGREE_TURN", DIAGONALTURN, EMBEDDED,  CORE_5X11_45DEGREE_TURN, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, "5x11 hold sneak to attach to the back of another curve"),
    EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_5X11_45DEGREE_TURN_R, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, ""),
    EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN("EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN", DIAGONALTURN, EMBEDDED, CORE_5X11_45DEGREE_TURN_L, ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn, ""),

    EMBEDDED_DIAGONAL_TURN_9X20("EMBEDDED_DIAGONAL_TURN_9X20", DIAGONALTURN, EMBEDDED, CORE_9X20_45DEGREE_TURN, ItemIDs.tcRailEmbedded45DegreeTurn9x20, "9x20 hold sneak to attach to the back of another curve"),
    EMBEDDED_DIAGONAL_LEFT_TURN_9X20("EMBEDDED_DIAGONAL_LEFT_TURN_9X20", DIAGONALTURN, EMBEDDED, CORE_9X20_45DEGREE_TURN_L, ItemIDs.tcRailEmbedded45DegreeTurn9x20,  ""),
    EMBEDDED_DIAGONAL_RIGHT_TURN_9X20("EMBEDDED_DIAGONAL_RIGHT_TURN_9X20", DIAGONALTURN, EMBEDDED, CORE_9X20_45DEGREE_TURN_R, ItemIDs.tcRailEmbedded45DegreeTurn9x20,  ""),

    EMBEDDED_DIAGONAL_TURN_10X22("EMBEDDED_DIAGONAL_TURN_10X22", DIAGONALTURN, EMBEDDED, CORE_10x22_45DEGREE_TURN, ItemIDs.tcRailEmbedded45DegreeTurn10x22,  "10x22 hold sneak to attach to the back of another curve"),
    EMBEDDED_DIAGONAL_LEFT_TURN_10X22("EMBEDDED_DIAGONAL_LEFT_TURN_10X22", DIAGONALTURN, EMBEDDED, CORE_10x22_45DEGREE_TURN_L, ItemIDs.tcRailEmbedded45DegreeTurn10x22,  ""),
    EMBEDDED_DIAGONAL_RIGHT_TURN_10X22("EMBEDDED_DIAGONAL_RIGHT_TURN_10X22", DIAGONALTURN, EMBEDDED, CORE_10x22_45DEGREE_TURN_R, ItemIDs.tcRailEmbedded45DegreeTurn10x22, ""),

    EMBEDDED_SMALL_PARALLEL_CURVE("EMBEDDED_SMALL_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_2x8, ItemIDs.tcRailEmbeddedSmallParallelCurve, "2x8"),
    EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE("EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_2x8_R, ItemIDs.tcRailEmbeddedSmallParallelCurve, ""),
    EMBEDDED_SMALL_LEFT_PARALLEL_CURVE("EMBEDDED_SMALL_LEFT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_2x8_L, ItemIDs.tcRailEmbeddedSmallParallelCurve, ""),

    EMBEDDED_MEDIUM_PARALLEL_CURVE("EMBEDDED_MEDIUM_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_3x12, ItemIDs.tcRailEmbeddedMediumParallelCurve, "3x12"),
    EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE("EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_3x12_R, ItemIDs.tcRailEmbeddedMediumParallelCurve, ""),
    EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE("EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_3x12_L, ItemIDs.tcRailEmbeddedMediumParallelCurve, ""),

    EMBEDDED_LARGE_PARALLEL_CURVE("EMBEDDED_LARGE_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_4x16, ItemIDs.tcRailEmbeddedLargeParallelCurve, "4x16"),
    EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE("EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_4x16_R, ItemIDs.tcRailEmbeddedLargeParallelCurve, ""),
    EMBEDDED_LARGE_LEFT_PARALLEL_CURVE("EMBEDDED_LARGE_LEFT_PARALLEL_CURVE", PARALLEL, EMBEDDED, CORE_S_CURVE_4x16_L, ItemIDs.tcRailEmbeddedLargeParallelCurve, ""),

    EMBEDDED_S_CURVE_20x2("EMBEDDED_20x2_S_CURVE", PARALLEL, EMBEDDED,  CORE_S_CURVE_20x2, ItemIDs.tcRailEmbedded20x2SCurve, "2x20"),
    EMBEDDED_S_CURVE_20x2_RIGHT("EMBEDDED_20x2_S_CURVE_RIGHT", PARALLEL, EMBEDDED,  CORE_S_CURVE_20x2_R, ItemIDs.tcRailEmbedded20x2SCurve,  ""),
    EMBEDDED_S_CURVE_20x2_LEFT("EMBEDDED_20x2_S_CURVE_LEFT", PARALLEL, EMBEDDED, CORE_S_CURVE_20x2_L, ItemIDs.tcRailEmbedded20x2SCurve,  ""),

    EMBEDDED_TWO_WAYS_CROSSING("EMBEDDED_TWO_WAYS_CROSSING", CROSSING, EMBEDDED, ItemIDs.tcRailEmbeddedTwoWaysCrossing,"3x3"),
    EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING("EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING", DIAGONAL_CROSSING, EMBEDDED, ItemIDs.tcRailEmbeddedTwoWaysCrossing, "3x3"),

    EMBEDDED_FOUR_WAYS_CROSSING("EMBEDDED_FOUR_WAYS_CROSSING", DIAGONAL_CROSSING, EMBEDDED,ItemIDs.tcRailEmbeddedFourWaysCrossing, "3x3"),

    EMBEDDED_DIAMOND_CROSSING("EMBEDDED_DIAMOND_CROSSING", DIAGONAL_CROSSING, EMBEDDED, ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
    EMBEDDED_RIGHT_DIAMOND_CROSSING("EMBEDDED_RIGHT_DIAMOND_CROSSING", DIAGONAL_CROSSING, EMBEDDED, ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
    EMBEDDED_LEFT_DIAMOND_CROSSING("EMBEDDED_LEFT_DIAMOND_CROSSING", DIAGONAL_CROSSING, EMBEDDED,ItemIDs.tcRailEmbeddedDiamondCrossing, "3x3"),
    EMBEDDED_DOUBLE_DIAMOND_CROSSING("EMBEDDED_DOUBLE_DIAMOND_CROSSING", DIAGONAL_CROSSING, EMBEDDED, ItemIDs.tcRailEmbeddedDoubleDiamondCrossing, "3x3"),


    EMBEDDED_MEDIUM_SWITCH("EMBEDDED_MEDIUM_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumSwitch, "4x4"),
    EMBEDDED_MEDIUM_RIGHT_SWITCH("EMBEDDED_MEDIUM_RIGHT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumSwitch, ""),
    EMBEDDED_MEDIUM_LEFT_SWITCH("EMBEDDED_MEDIUM_LEFT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumSwitch, ""),

    EMBEDDED_LARGE_SWITCH("EMBEDDED_LARGE_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeSwitch, "6x6"),
    EMBEDDED_LARGE_RIGHT_SWITCH("EMBEDDED_LARGE_RIGHT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeSwitch, ""),
    EMBEDDED_LARGE_LEFT_SWITCH("EMBEDDED_LARGE_LEFT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeSwitch, ""),

    EMBEDDED_VERY_LARGE_SWITCH("EMBEDDED_VERY_LARGE_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedVeryLargeSwitch, "11x11"),
    EMBEDDED_VERY_LARGE_RIGHT_SWITCH("EMBEDDED_VERY_LARGE_RIGHT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedVeryLargeSwitch, ""),
    EMBEDDED_VERY_LARGE_LEFT_SWITCH("EMBEDDED_VERY_LARGE_LEFT_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedVeryLargeSwitch, ""),

    EMBEDDED_MEDIUM_PARALLEL_SWITCH("EMBEDDED_MEDIUM_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumParallelSwitch, "4x11"),
    EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumParallelSwitch, ""),
    EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH("EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedMediumParallelSwitch, ""),

    EMBEDDED_LARGE_PARALLEL_SWITCH("EMBEDDED_LARGE_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeParallelSwitch, "4x17"),
    EMBEDDED_LARGE_RIGHT_PARALLEL_SWITCH("EMBEDDED_LARGE_RIGHT_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeParallelSwitch, ""),
    EMBEDDED_LARGE_LEFT_PARALLEL_SWITCH("EMBEDDED_LARGE_LEFT_PARALLEL_SWITCH", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedLargeParallelSwitch, ""),

    EMBEDDED_MEDIUM_45DEGREE_SWITCH("EMBEDDED_MEDIUM_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_3x5_45DEGREE_SWITCH, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch,  "3x5 hold sneak to attach to the back of another curve"),
    EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_3x5_45DEGREE_SWITCH_R, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch,  ""),
    EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH("EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_3x5_45DEGREE_SWITCH_L, ItemIDs.tcRailEmbeddedMedium45DegreeSwitch,  ""),

    EMBEDDED_LARGE_45DEGREE_SWITCH("EMBEDDED_LARGE_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_4x8_45DEGREE_SWITCH, ItemIDs.tcRailEmbeddedLarge45DegreeSwitch, "4x8 hold sneak to attach to the back of another curve"),
    EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH("EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_4x8_45DEGREE_SWITCH_R, ItemIDs.tcRailEmbeddedLarge45DegreeSwitch, ""),
    EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH("EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH", SWITCH, EMBEDDED, CORE_4x8_45DEGREE_SWITCH_L, ItemIDs.tcRailEmbeddedLarge45DegreeSwitch,  ""),

    EMBEDDED_SLOPE_1X3_DYNAMIC("EMBEDDED_SLOPE_1X3_DYNAMIC", SLOPE, EMBEDDED, DYNAMIC, CORE_3_SLOPE, ItemIDs.tcRailEmbedded1x3SlopeDynamic, "1x3"),
    EMBEDDED_SLOPE_DYNAMIC("EMBEDDED_SLOPE_DYNAMIC", SLOPE, EMBEDDED, DYNAMIC, CORE_6_SLOPE, ItemIDs.tcRailEmbeddedSlopeDynamic, "1x6"),
    EMBEDDED_LARGE_SLOPE_DYNAMIC("EMBEDDED_LARGE_SLOPE_DYNAMIC", SLOPE, EMBEDDED, DYNAMIC, CORE_12_SLOPE, ItemIDs.tcRailEmbeddedLargeSlopeDynamic, "1x12"),
    EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC", SLOPE, EMBEDDED, DYNAMIC, CORE_18_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic, "1x18"),
    EMBEDDED_CROSSOVER_SWITCH_10X2("EMBEDDED_CROSSOVER_SWITCH_10X2", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedCrossoverSwitch10x2, "10x3"),
    EMBEDDED_CROSSOVER_SWITCH_10X2_LEFT("EMBEDDED_CROSSOVER_SWITCH_10X2_LEFT", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedCrossoverSwitch10x2, ""),
    EMBEDDED_CROSSOVER_SWITCH_10X2_RIGHT("EMBEDDED_CROSSOVER_SWITCH_10X2_RIGHT", SWITCH, EMBEDDED, ItemIDs.tcRailEmbeddedCrossoverSwitch10x2, ""),

    EMBEDDED_SLOPE_1X3_DYNAMIC_DIAGONAL("EMBEDDED_SLOPE_1X3_DYNAMIC_DIAGONAL", SLOPE, EMBEDDED, DYNAMIC, CORE_3_DIAGONAL_SLOPE, ItemIDs.tcRailEmbedded1x3SlopeDynamic, "1x3"),
    EMBEDDED_SLOPE_1X6_DYNAMIC_DIAGONAL("EMBEDDED_SLOPE_1X6_DYNAMIC_DIAGONAL", SLOPE, EMBEDDED, DYNAMIC, CORE_6_DIAGONAL_SLOPE, ItemIDs.tcRailEmbeddedSlopeDynamic, "1x6"),
    EMBEDDED_SLOPE_1X12_DYNAMIC_DIAGONAL("EMBEDDED_SLOPE_1X12_DYNAMIC_DIAGONAL", SLOPE, EMBEDDED, DYNAMIC, CORE_12_DIAGONAL_SLOPE, ItemIDs.tcRailEmbeddedLargeSlopeDynamic, "1x12"),
    EMBEDDED_SLOPE_1X18_DYNAMIC_DIAGONAL("EMBEDDED_SLOPE_1X18_DYNAMIC_DIAGONAL", SLOPE, EMBEDDED, DYNAMIC, CORE_18_DIAGONAL_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic, "1x18"),

    //EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "5x5"),
    //EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "xxx"),
    //EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic, "xxx"),

    //EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "9x9"),
    //EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "xxx"),
    //EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic, "xxx"),

    //EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "16x16"),
    //EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "xxx"),
    //EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC("EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC", CURVED_SLOPE, ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic, "xxx"),

    SMALL_ROAD_CROSSING("SMALL_ROAD_CROSSING", STRAIGHT, NORMAL, CORE_SMALL_STRAIGHT, ItemIDs.tcRailSmallRoadCrossing, "1x1"),
    SMALL_ROAD_CROSSING_1("SMALL_ROAD_CROSSING_1", STRAIGHT, NORMAL, CORE_SMALL_STRAIGHT, ItemIDs.tcRailSmallRoadCrossing1, "1x1"),
    SMALL_ROAD_CROSSING_2("SMALL_ROAD_CROSSING_2", STRAIGHT, NORMAL, CORE_SMALL_STRAIGHT, ItemIDs.tcRailSmallRoadCrossing2, "1x1"),

    SMALL_ROAD_CROSSING_DYNAMIC("SMALL_ROAD_CROSSING_DYNAMIC", STRAIGHT, NORMAL, CORE_SMALL_STRAIGHT, ItemIDs.tcRailSmallRoadCrossingDynamic, "1x1");
    ;

    private final String label;
    private final String type;
    private final TCRailTypes.RailTypes railType;
    private final BallastTypes ballastType;

    private EnumCoreTrack enumCoreTrack;

    private final RailVariants variant;
    private final ItemIDs item;
    private final String tooltip;

    EnumTracks(String label, TCRailTypes.RailTypes railType, RailVariants variant, ItemIDs item, String tooltip)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.tooltip = tooltip;
        this.variant = variant;
        this.ballastType = null;
        this.enumCoreTrack = NONE;
    }

    EnumTracks(String label, TCRailTypes.RailTypes railType, RailVariants variant, EnumCoreTrack enumCoreTrack, ItemIDs item, String tooltip)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.tooltip = tooltip;
        this.variant = variant;
        this.ballastType = null;
        this.enumCoreTrack = enumCoreTrack;
    }

    EnumTracks(String label, TCRailTypes.RailTypes railType, RailVariants variant, BallastTypes ballastType, ItemIDs item, String tooltip)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.tooltip = tooltip;
        this.variant = variant;
        this.ballastType = ballastType;
        this.enumCoreTrack = NONE;
    }

    EnumTracks(String label, TCRailTypes.RailTypes railType, RailVariants variant, BallastTypes ballastType, EnumCoreTrack enumCoreTrack, ItemIDs item, String tooltip)
    {
        this.label = label;
        this.railType = railType;
        this.type = railType.toString();
        this.item = item;
        this.tooltip = tooltip;
        this.variant = variant;
        this.ballastType = ballastType;
        this.enumCoreTrack = enumCoreTrack;
    }

    private final static HashMap<String, EnumTracks> ENUM_TRACKS_HASHMAP = SetupsHashMap();

    public static EnumTracks GetTrackByLabel(String label)
    {
        return ENUM_TRACKS_HASHMAP.get(label);
    }

    private static HashMap<String, EnumTracks> SetupsHashMap()
    {
        HashMap<String, EnumTracks> tracksHashMap = new HashMap<>();
        for (EnumTracks track : EnumTracks.values())
        {
            tracksHashMap.put(track.label, track);
        }

        return tracksHashMap;
    }

    public String getLabel() {
        return this.label;
    }

    public RailVariants getVariant() {return variant; }

    public String getType() {
        return this.type;
    }

    public TCRailTypes.RailTypes getRailType()
    {
        return this.railType;
    }

    public BallastTypes getBallastType()
    {
        return this.ballastType;
    }

    public ItemIDs getItem() {
        return this.item;
    }

    public String getTooltip() {
        return this.tooltip;
    }

    public EnumCoreTrack getCoreTrack() { return enumCoreTrack; }

    public int[][] getUsedSpaceFromType(@Nullable EntityPlayer player)
    {
        switch (this)
        {
            case SMALL_STRAIGHT:
            case SMALL_ROAD_CROSSING:
            case SMALL_ROAD_CROSSING_1:
            case SMALL_ROAD_CROSSING_2:
            case EMBEDDED_SMALL_STRAIGHT:
            case TURN_1X1:
            case EMBEDDED_TURN_1X1:
                return new int[][]{ {0,0} };

            case SMALL_DIAGONAL_STRAIGHT:
            case EMBEDDED_SMALL_DIAGONAL_STRAIGHT:
                if (player.isSneaking()) {
                    return new int[][]{ {0,0} };
                }
                return new int[][]{{0, 0}, {1, 0}, {0, 1}};

            case MEDIUM_DIAGONAL_STRAIGHT:
            case EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT:
                if (player.isSneaking()) {
                    return new int[][]{ {0,0}, {1,0}, {0,1}, {1,1}, {2,1}, {1,2}, {2,2} };
                }
                return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}};
            case LONG_DIAGONAL_STRAIGHT:
            case EMBEDDED_LONG_DIAGONAL_STRAIGHT:
                if (player.isSneaking()) {
                    return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}};
                }
                return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}, {6, 5}, {5, 6}};
            case VERY_LONG_DIAGONAL_STRAIGHT:
            case EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT:
                if (player.isSneaking()) {
                    return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}, {6, 5}, {5, 6},
                            {6, 6}, {6, 7}, {7, 6}, {7, 7}, {8, 7}, {7, 8}, {8, 8}, {9, 8}, {8, 9}, {9, 9}, {10, 9}, {9, 10}, {10, 10}, {11, 10}, {10, 11}, {11, 11}};
                }
                return new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 2}, {2, 3}, {3, 3}, {4, 3}, {3, 4}, {4, 4}, {4, 5}, {5, 4}, {5, 5}, {6, 5}, {5, 6},
                        {6, 6}, {6, 7}, {7, 6}, {7, 7}, {8, 7}, {7, 8}, {8, 8}, {9, 8}, {8, 9}, {9, 9}, {10, 9}, {9, 10}, {10, 10}, {11, 10}, {10, 11}, {11, 11}, {12, 11}, {11, 12}};
            case MEDIUM_STRAIGHT:
            case EMBEDDED_MEDIUM_STRAIGHT:
                return new int[][]{ {0,0}, {1,0}, {2,0} };

            case LONG_STRAIGHT:
            case EMBEDDED_LONG_STRAIGHT:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0} };

            case VERY_LONG_STRAIGHT:
            case EMBEDDED_VERY_LONG_STRAIGHT:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0}};

            case EMBEDDED_SLOPE_1X3_DYNAMIC:
            case SLOPE_1X3_DYNAMIC:
                return new int[][]{ {0,0}, {1,0}, {2,0} };
            case EMBEDDED_SLOPE_1X3_DYNAMIC_DIAGONAL:
            case SLOPE_1X3_DYNAMIC_DIAGONAL:
                //return new int[][]{ {0,0}, {0,1}, {1,0}, {1,1}, {1,2}, {2,1}, {2,2}, {2,3}, {3,2} }; //in case the pure diagonal doesn't work
                return new int[][] { {0,0}, {1,1}, {2,2} };
            case EMBEDDED_SLOPE_1X6_DYNAMIC_DIAGONAL:
            case SLOPE_1X6_DYNAMIC_DIAGONAL:
                //return new int[][]{ {0,0}, {0,1}, {1,0}, {1,1}, {1,2}, {2,1}, {2,2}, {2,3}, {3,2}, {3,3}, {3,4}, {4,3}, {4,4}, {4,5}, {5,4}, {5,5}, {5,6}, {6,5} };
                return new int[][]{ {0,0}, {1,1}, {2,2}, {3,3}, {4,4}, {5,5} };
            case EMBEDDED_SLOPE_1X12_DYNAMIC_DIAGONAL:
            case SLOPE_1X12_DYNAMIC_DIAGONAL:
                //return new int[][]{ {0,0}, {0,1}, {1,0}, {1,1}, {1,2}, {2,1}, {2,2}, {2,3}, {3,2}, {3,3}, {3,4}, {4,3}, {4,4}, {4,5}, {5,4}, {5,5}, {5,6}, {6,5}, {6,6}, {6,7}, {7,6}, {7,7}, {7,8}, {8,7}, {8,8}, {8,9}, {9,8}, {9,9}, {9,10}, {10,9}, {10,10}, {10,11}, {11,10}, {11,11}, {11,12}, {12,11} };
                return new int[][]{ {0,0}, {1,1}, {2,2}, {3,3}, {4,4}, {5,5}, {6,6}, {7,7}, {8,8}, {9,9}, {10,10}, {11,11} };
            case EMBEDDED_SLOPE_1X18_DYNAMIC_DIAGONAL:
            case SLOPE_1X18_DYNAMIC_DIAGONAL:
                //return new int[][]{ {0,0}, {0,1}, {1,0}, {1,1}, {1,2}, {2,1}, {2,2}, {2,3}, {3,2}, {3,3}, {3,4}, {4,3}, {4,4}, {4,5}, {5,4}, {5,5}, {5,6}, {6,5}, {6,6}, {6,7}, {7,6}, {7,7}, {7,8}, {8,7}, {8,8}, {8,9}, {9,8}, {9,9}, {9,10}, {10,9}, {10,10}, {10,11}, {11,10}, {11,11}, {11,12}, {12,11}, {12,12}, {12,13}, {13,12}, {13,13}, {13,14}, {14,13}, {14,14}, {14,15}, {15,14}, {15,15}, {15,16}, {16,15}, {16,16}, {16,17}, {17,16}, {17,17}, {17,18}, {18,17} };
                return new int[][]{ {0,0}, {1,1}, {2,2}, {3,3}, {4,4}, {5,5}, {6,6}, {7,7}, {8,8}, {9,9}, {10,10}, {11,11}, {12,12}, {13,13}, {14,14}, {15,15}, {16,16}, {17,17} };
            case SLOPE_BALLAST:
            case SLOPE_GRAVEL:
            case SLOPE_WOOD:
            case SLOPE_SNOW_GRAVEL:
            case SLOPE_PEA_GRAVEL:
            case SLOPE_DYNAMIC:
            case EMBEDDED_SLOPE_DYNAMIC:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0} };

            case LARGE_SLOPE_BALLAST:
            case LARGE_SLOPE_GRAVEL:
            case LARGE_SLOPE_WOOD:
            case LARGE_SLOPE_SNOW_GRAVEL:
            case LARGE_SLOPE_PEA_GRAVEL:
            case LARGE_SLOPE_DYNAMIC:
            case EMBEDDED_LARGE_SLOPE_DYNAMIC:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0} };

            case VERY_LARGE_SLOPE_BALLAST:
            case VERY_LARGE_SLOPE_GRAVEL:
            case VERY_LARGE_SLOPE_WOOD:
            case VERY_LARGE_SLOPE_SNOW_GRAVEL:
            case VERY_LARGE_SLOPE_PEA_GRAVEL:
            case VERY_LARGE_SLOPE_DYNAMIC:
            case EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0},
                        {12,0}, {13,0}, {14,0}, {15,0}, {16,0}, {17,0}};

            /** Crossing */
            case TWO_WAYS_CROSSING:
            case EMBEDDED_TWO_WAYS_CROSSING:
                return new int[][] { {0,0}, {1,0}, {2,0}, {1,1}, {1,-1} };

            case DIAGONAL_TWO_WAYS_CROSSING:
            case EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING:
                return new int[][]{{0, 0}, {-1, -1}, {1, -1}, {1, 1}, {-1, 1}};
            case DIAMOND_CROSSING:
            case EMBEDDED_DIAMOND_CROSSING:
                return new int[][]{{0, 0}, {1, 0}, {2, 0}, {0, -1}, {2, 1}};
            case DOUBLE_DIAMOND_CROSSING:
            case EMBEDDED_DOUBLE_DIAMOND_CROSSING:
                return new int[][]{{0, 0}, {1, 0}, {2, 0}, {0, -1}, {2, -1}, {0, 1}, {2, 1}};
            case FOUR_WAYS_CROSSING:
            case EMBEDDED_FOUR_WAYS_CROSSING:
                return new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, -1}, {1, -1}, {-1, -1}, {0, 1}, {1, 1}, {-1, 1}};

            /** Turns */
            case MEDIUM_TURN:
            case EMBEDDED_MEDIUM_TURN:
                return new int[][] { {0,0}, {1,0}, {1,1}, {2,1}, {2,2} };

            case LARGE_TURN:
            case EMBEDDED_LARGE_TURN:
                return new int[][] { {0,0}, {1,0}, {2,0}, {1,1}, {2,1}, {3,1}, {2,2}, {3,2}, {4,2}, {3,3}, {4,3}, {4,4} };

            case VERY_LARGE_TURN:
            case EMBEDDED_VERY_LARGE_TURN:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {2,1}, {3,1}, {4,1}, {5,1}, {4,2}, {5,2}, {6,2},
                        {6,3}, {7,3}, {7,4}, {8,4}, {7,5}, {8,5}, {9,5}, {8,6}, {9,6}, {8,7}, {9,7}, {9,8}, {9,9} };

            case SUPER_LARGE_TURN:
            case EMBEDDED_SUPER_LARGE_TURN:
                return new int[][]{ {0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2},
                        {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}, {11, 5}, {12, 5}, {11, 6}, {12, 6}, {13, 6}, {12, 7}, {13, 7},
                        {12, 8}, {13, 8}, {14, 8}, {13, 9}, {14, 9}, {13, 10}, {14, 10}, {15, 10}, {14, 11}, {15, 11}, {14, 12}, {15, 12}, {14, 12,}, {15, 13}, {15, 14}, {15, 15}};
            case TURN_29X29:
            case EMBEDDED_TURN_29X29:
                return new int[][]{{0, 0}, {1, 0},{2, 0},{3, 0},{4, 0},{5, 0},{6, 0},{7, 0},{3, 1},{4, 1},{5, 1},{6, 1},{7, 1},{8, 1},{9, 1},{10, 1},{7,2},{8, 2},{9, 2},{10, 2},{11, 2},{12, 2},{10,3},{11, 3},{12, 3},{13, 3},{14, 3},{12,4},{13, 4},{14, 4},{15, 4},{14, 5},{15, 5},{16, 5},{17, 5},{16, 6},{17, 6},{18, 6},{17, 7},{18, 7},{19, 7},{18, 8},{19, 8},{20, 8},{19, 9},{20, 9},{21, 9},{20, 10},{21, 10},{22, 10},{21, 11},{22, 11},{23, 11},{22, 12},{23, 12},{23, 13},{24, 13},{23, 14},{24, 14},{25, 14},{24, 15},{25, 15},{24, 16},{25, 16},{26, 16},{25, 17},{26, 17},{25, 18},{26, 18},{27, 18},{26, 19},{27, 19},{26, 20},{27, 20},{26, 21},{27, 21},{28, 21},{27, 22},{28, 22},{27, 23},{28, 23},{27, 24},{28, 24},{27, 25},{28, 25},{28, 26},{28, 27},{28, 28}};

            case TURN_32X32:
            case EMBEDDED_TURN_32X32:
                return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1},
                        {10, 1}, {7,2}, {8, 2}, {9, 2}, {10, 2}, {11, 2}, {12, 2}, {10,3}, {11, 3}, {12, 3}, {13, 3}, {14, 3}, {15, 3}, {13, 4}, {14, 4},
                        {15, 4}, {16, 4}, {14,5}, {15, 5}, {16, 5}, {17, 5}, {18, 5}, {16, 6}, {17, 6}, {18, 6}, {19, 6}, {18, 7}, {19, 7}, {20, 7}, {19, 8}, {20, 8},
                        {21, 8}, {20, 9}, {21, 9}, {22, 9}, {21, 10}, {22, 10}, {23, 10}, {22, 11}, {23, 11}, {24, 11}, {23, 12}, {24, 12}, {25, 12}, {24, 13}, {25, 13},
                        {26, 13}, {25, 14}, {26, 14}, {25, 15}, {26, 15}, {27, 15}, {26, 16}, {27, 16}, {28, 16}, {26,17}, {27, 17}, {28, 17}, {27, 18}, {28, 18}, {28, 19},
                        {29, 19}, {28, 20}, {29, 20}, {28, 21}, {29, 21}, {30, 21}, {29, 22}, {30, 22}, {29, 23}, {30, 23}, {29,24}, {30, 24}, {31, 24}, {30, 25}, {31, 25}, {30, 26},
                        {31, 26}, {30, 27}, {31, 27}, {30, 28}, {31, 28}, {30, 29}, {31, 29}, {31, 30}, {31, 31}};

            /** Switches*/
            case MEDIUM_PARALLEL_SWITCH:
            case EMBEDDED_MEDIUM_PARALLEL_SWITCH:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0},
                        {2,1}, {3,1}, {4,1}, {5,1},	{4,2}, {5,2}, {6,2}, {7,2}, {8,2}, {6,3}, {7,3}, {8,3}, {9,3}, {10,3}};

            case LARGE_PARALLEL_SWITCH:
            case EMBEDDED_LARGE_PARALLEL_SWITCH:
                return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0},{11, 0},{12, 0},{13, 0},{14, 0},{15, 0},{16, 0}, {14, 3},{15, 3},{16, 3},{3, 1}, {4, 1}, {5, 1}, {6, 1}, {6, 2}, {7, 1}, {7, 2}, {8, 2}, {9, 2}, {10, 2}, {11, 2}, {9, 3}, {10, 3}, {11, 3}, {12, 3}, {13, 3}};

            case MEDIUM_SWITCH:
            case EMBEDDED_MEDIUM_SWITCH:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {2,1}, {3,1}, {3,2}, {3,3} };

            case LARGE_SWITCH:
            case EMBEDDED_LARGE_SWITCH:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0},
                        {2,1}, {3,1}, {4,1}, {3,2}, {4,2}, {5,2}, {4,3}, {5,3},	{5,4}, {5,5}};
            case VERY_LARGE_SWITCH:
            case EMBEDDED_VERY_LARGE_SWITCH:
                return new int[][]{{0,0},{1,0}, {2,0},{3,0},{4,0},{5,0},{6,0}, {2, 1},{3, 1},{4, 1},{5, 1},{6, 1},{6, 2},{6, 2},{7, 2},{7, 3},{8, 3},{8, 4},{9, 4},{8, 5},{9, 5},{10, 5},{9, 6},{10, 6},{9, 7},{10, 7},{10, 8},{10, 9}, {10,10}};

            case CROSSOVER_SWITCH_10X2:
            case EMBEDDED_CROSSOVER_SWITCH_10X2:
                return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0},
                        {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {9,1}, {9,2} };

            /** Parallel Curves */
            case SMALL_PARALLEL_CURVE:
            case EMBEDDED_SMALL_PARALLEL_CURVE:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}};

            case MEDIUM_PARALLEL_CURVE:
            case EMBEDDED_MEDIUM_PARALLEL_CURVE:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {7,2}, {8,2}, {9,2}, {10,2}, {11,2}};

            case LARGE_PARALLEL_CURVE:
            case EMBEDDED_LARGE_PARALLEL_CURVE:
                return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {7,2}, {8,2}, {9,2}, {10,2}, {11,2}, {10,3}, {11,3}, {12,3}, {13,3}, {14,3}, {15,3}};

            case S_CURVE_20x2:
            case EMBEDDED_S_CURVE_20x2:
                return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},{10,0},{11,0},{12,0},{13,0},{14,0},{15,0},{16,0},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{10,1},{11,1},{12,1},{13,1},{14,1},{15,1},{16,1},{17,1},{18,1},{19,1}};

            /** 45 Degree Turns */
            case MEDIUM_45DEGREE_TURN:
            case EMBEDDED_MEDIUM_45DEGREE_TURN:
                if (player.isSneaking())
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}};
                }
                else
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}, {3, 1}, {2, 2}};
                }
            case LARGE_45DEGREE_TURN:
            case EMBEDDED_LARGE_45DEGREE_TURN:
                if (player.isSneaking())
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}};
                }
                else
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {4, 2}, {5, 2}, {6, 2}, {5, 3}};
                }
            case VERY_LARGE_45DEGREE_TURN:
            case EMBEDDED_VERY_LARGE_45DEGREE_TURN:
                if (player.isSneaking())
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {6, 3}, {7, 3}};
                }
                else
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {6, 3}, {7, 3}, {8, 3}, {7, 4}};
                }
            case SUPER_LARGE_45DEGREE_TURN:
            case EMBEDDED_SUPER_LARGE_45DEGREE_TURN:
                if (player.isSneaking())
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 2}, {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}};
                }
                else
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 2}, {7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}};
                }
            case DIAGONAL_TURN_9X20:
            case EMBEDDED_DIAGONAL_TURN_9X20:
                if (player.isSneaking())
                {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{10,1},{7,2},{8,2},{9,2},{10,2},{11,2},{12,2},{10,3},{11,3},{12,3},{13,3},{14,3},{12,4},{13,4},{14,4},{15,4},{14,5},{15,5},{16,5},{17,5},{15,6},{16,6},{17,6},{18,6},{16,7},{17,7},{18,7},{19,7},{18,8},{19,8}};
                }
                else
                {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{10,1},{7,2},{8,2},{9,2},{10,2},{11,2},{12,2},{10,3},{11,3},{12,3},{13,3},{14,3},{12,4},{13,4},{14,4},{15,4},{14,5},{15,5},{16,5},{17,5},{15,6},{16,6},{17,6},{18,6},{16,7},{17,7},{18,7},{19,7},{18,8},{19,8},{20,8},{19,9}};
                }
            case DIAGONAL_TURN_10X22:
            case EMBEDDED_DIAGONAL_TURN_10X22:
                if (player.isSneaking()) {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{10,1},{7,2},{8,2},{9,2},{10,2},{11,2},{12,2},{13,2},{10,3},{11,3},{12,3},{13,3},{14,3},{13,4},{14,4},{15,4},{16,4},{15,5},{16,5},{17,5},{18,5},{16,6},{17,6},{18,6},{19,6},{17,7},{18,7},{19,7},{20,7},{19,8},{20,8},{21,8},{20,9},{21,9}};
                } else {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{10,1},{7,2},{8,2},{9,2},{10,2},{11,2},{12,2},{13,2},{10,3},{11,3},{12,3},{13,3},{14,3},{13,4},{14,4},{15,4},{16,4},{15,5},{16,5},{17,5},{18,5},{16,6},{17,6},{18,6},{19,6},{17,7},{18,7},{19,7},{20,7},{19,8},{20,8},{21,8},{20,9},{21,9},{22,9},{21,10}};
                }
                /** 45 Degree Switches */
            case MEDIUM_45DEGREE_SWITCH:
            case EMBEDDED_MEDIUM_45DEGREE_SWITCH:
                if (player.isSneaking())
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, 1}, {3, 1}};
                }
                else
                {
                    return new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, 1}, {3, 1}, {4, 1}, {3, 2}};
                }
            case LARGE_45DEGREE_SWITCH:
            case EMBEDDED_LARGE_45DEGREE_SWITCH:
                if (player.isSneaking())
                {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {5, 2}, {6, 2}};
                }
                else
                {
                    return new int[][]{{0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{3, 1}, {4, 1}, {5, 1}, {6, 1}, {5, 2}, {6, 2}, {7, 2}, {6, 3},};
                }
            default:
                return null;
        }
    }

    public static int GetSwitchSize(ItemIDs itemIDs)
    {
        switch (itemIDs)
        {
            case tcRailMediumSwitch:
            case tcRailEmbeddedMediumSwitch:
            case tcRailMedium45DegreeSwitch:
            case tcRailEmbeddedMedium45DegreeSwitch:
                return 2;

            case tcRailMediumParallelSwitch:
            case tcRailEmbeddedMediumParallelSwitch:
            case tcRailLargeSwitch:
            case tcRailEmbeddedLargeSwitch:
                return 3;

            case tcRailLarge45DegreeSwitch:
            case tcRailEmbeddedLarge45DegreeSwitch:
            case tcRailLargeParallelSwitch:
            case tcRailEmbeddedLargeParallelSwitch:
            case tcRailVeryLargeSwitch:
            case tcRailEmbeddedVeryLargeSwitch:
                return 4;

            case tcRailCrossoverSwitch10x2:
            case tcRailEmbeddedCrossoverSwitch10x2:
                return 7;
        }
        return 0;
    }
}
