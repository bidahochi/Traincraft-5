package train.common.library.track;

import net.minecraft.item.Item;

public enum TrackItemIDs
{
    /** Normal Tracks **/
    //straights
    tcRailSmallStraight("track_straight_1", 5),
    tcRailMediumStraight("track_straight_3", 5),
    tcRailLongStraight("track_straight_6", 5),
    tcRailVeryLongStraight("track_straight_12", 5),

    //turns
    tcRail1X1Turn("track_turn_1", 5),
    tcRailMediumTurn("track_turn_3", 5),
    tcRailLargeTurn("track_turn_5", 5),
    tcRailVeryLargeTurn("track_turn_10", 5),
    tcRailSuperLargeTurn("track_turn_16", 5),
    tcRail29X29Turn("track_turn_29", 5),
    tcRail32X32Turn("track_turn_32", 5),

    //45 degree turns
    tcRailMedium45DegreeTurn("track_45degree_turn_3x4", 5),
    tcRailLarge45DegreeTurn("track_45degree_turn_3x6", 5),
    tcRailVeryLarge45DegreeTurn("track_45degree_turn_4x8", 5),
    tcRailSuperLarge45DegreeTurn("track_45degree_turn_5x11", 5),
    tcRail45DegreeTurn9x20("track_45degree_turn_9x20", 5),
    tcRail45DegreeTurn10x22("track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRailSmallParallelCurve("track_s-curve_2x8", 3),
    tcRailMediumParallelCurve("track_s-curve_3x12", 3),
    tcRailLargeParallelCurve("track_s-curve_4x16", 3),
    tcRail20x2SCurve("track_s-curve_2x20", 3),

    //switches
    tcRailMediumSwitch("track_switch_4x4", 5),
    tcRailLargeSwitch("track_switch_6x6", 5),
    tcRailVeryLargeSwitch("track_switch_11x11", 5),

    tcRailMediumParallelSwitch("track_switch_p_4x11", 5),
    tcRailLargeParallelSwitch("track_switch_p_4x17", 5),

    tcRailMedium45DegreeSwitch("track_switch_45degree_3x5", 5),
    tcRailLarge45DegreeSwitch("track_switch_45degree_4x8", 5),

    tcRailCrossoverSwitch10x2("track_switch_crossover_10x2", 5),

    //diamonds
    tcRailTwoWaysCrossing("track_plus_crossing",5),
    tcRailDiamondCrossing("track_x_crossing", 5),
    tcRailDoubleDiamondCrossing("track_double_x_crossing", 5),
    tcRailFourWaysCrossing("track_xplus_crossing", 5),

    //1x3 slope
    tcRail1X3SlopeDynamic("item_rail_straight_slope_dynamic", 3),

    //1x6 slopes
    @Deprecated
    tcRailSlopeWood("item_rail_straight_slope_wood", 3),
    @Deprecated
    tcRailSlopeGravel("item_rail_straight_slope_gravel", 3),
    @Deprecated
    tcRailSlopeBallast("item_rail_straight_slope_ballast", 3),
    @Deprecated
    tcRailSlopeSnowGravel("item_rail_straight_slope_snow_gravel", 3),
    @Deprecated
    tcRailSlopePeaGravel("item_rail_straight_slope_pea_gravel", 3),
    tcRailSlopeDynamic("item_rail_straight_slope_dynamic", 3),

    //1x12 slopes

    tcRailLargeSlopeWood("item_rail_straight_slope_wood", 3),
    @Deprecated
    tcRailLargeSlopeGravel("item_rail_straight_slope_gravel", 3),
    @Deprecated
    tcRailLargeSlopeBallast("item_rail_straight_slope_ballast", 3),
    @Deprecated
    tcRailLargeSlopeSnowGravel("item_rail_straight_slope_snow_gravel", 3),
    @Deprecated
    tcRailLargeSlopePeaGravel("item_rail_straight_slope_pea_gravel", 3),
    tcRailLargeSlopeDynamic("item_rail_straight_slope_dynamic", 3),

    //1x18 slopes
    @Deprecated
    tcRailVeryLargeSlopeWood("item_rail_straight_slope_wood", 3),
    @Deprecated
    tcRailVeryLargeSlopeGravel("item_rail_straight_slope_gravel", 3),
    @Deprecated
    tcRailVeryLargeSlopeBallast("item_rail_straight_slope_ballast", 3),
    @Deprecated
    tcRailVeryLargeSlopeSnowGravel("item_rail_straight_slope_snow_gravel", 3),
    @Deprecated
    tcRailVeryLargeSlopePeaGravel("item_rail_straight_slope_pea_gravel", 3),
    tcRailVeryLargeSlopeDynamic("item_rail_straight_slope_dynamic", 3),

    // Half-height slopes retain the 1x6, 1x12, and 1x18 full-slope pitches.
    tcRailHalfHeightSlope3Dynamic("item_rail_straight_slope_dynamic", 3),
    tcRailHalfHeightSlope6Dynamic("item_rail_straight_slope_dynamic", 3),
    tcRailHalfHeightSlope9Dynamic("item_rail_straight_slope_dynamic", 3),


    /** Sleeperless Tracks **/
    //straights
    tcRailEmbeddedSmallStraight("track_straight_1_e", 5),
    tcRailEmbeddedMediumStraight("track_straight_3_e", 5),
    tcRailEmbeddedLongStraight("track_straight_6_e", 5),
    tcRailEmbeddedVeryLongStraight("track_straight_12_e", 5),

    //turns
    tcRailEmbedded1X1Turn("track_turn_1_e", 5),
    tcRailEmbeddedMediumTurn("track_turn_3_e", 5),
    tcRailEmbeddedLargeTurn("track_turn_5_e", 5),
    tcRailEmbeddedVeryLargeTurn("track_turn_10_e", 5),
    tcRailEmbeddedSuperLargeTurn("track_turn_16_e", 5),
    tcRailEmbedded29X29Turn("track_turn_29_e", 5),
    tcRailEmbedded32X32Turn("track_turn_32_e", 5),

    //45 degree turns
    tcRailEmbeddedMedium45DegreeTurn("track_45degree_turn_3x4_e", 5),
    tcRailEmbeddedLarge45DegreeTurn("track_45degree_turn_3x6_e", 5),
    tcRailEmbeddedVeryLarge45DegreeTurn("track_45degree_turn_4x8_e", 5),
    tcRailEmbeddedSuperLarge45DegreeTurn("track_45degree_turn_5x11_e", 5),
    tcRailEmbedded45DegreeTurn9x20("track_45degree_turn_9x20_e", 5),
    tcRailEmbedded45DegreeTurn10x22("track_45degree_turn_10x22_e", 5),

    //parallel curves / s curves
    tcRailEmbeddedSmallParallelCurve("track_s-curve_2x8_e", 3),
    tcRailEmbeddedMediumParallelCurve("track_s-curve_3x12_e", 3),
    tcRailEmbeddedLargeParallelCurve("track_s-curve_4x16_e", 3),
    tcRailEmbedded20x2SCurve("track_s-curve_2x20_e", 3),

    //switches
    tcRailEmbeddedMediumSwitch( "track_switch_4x4_e", 5),
    tcRailEmbeddedLargeSwitch( "track_switch_6x6_e", 5),
    tcRailEmbeddedVeryLargeSwitch( "track_switch_11x11_e", 5),

    tcRailEmbeddedMediumParallelSwitch( "track_switch_p_4x11_e", 5),
    tcRailEmbeddedLargeParallelSwitch( "track_switch_p_4x17_e", 5),

    tcRailEmbeddedMedium45DegreeSwitch("track_switch_45degree_3x5_e", 5),
    tcRailEmbeddedLarge45DegreeSwitch( "track_switch_45degree_4x8_e", 5),
    tcRailEmbeddedCrossoverSwitch10x2("track_switch_crossover_10x2_e", 5),

    //diamonds
    tcRailEmbeddedTwoWaysCrossing("track_plus_crossing_e",5),
    tcRailEmbeddedDiamondCrossing( "track_x_crossing_e",5),
    tcRailEmbeddedDoubleDiamondCrossing( "track_double_x_crossing_e",5),
    tcRailEmbeddedFourWaysCrossing( "track_xplus_crossing_e",5),

    //slopes
    tcRailEmbedded1x3SlopeDynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedSlopeDynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedLargeSlopeDynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedVeryLargeSlopeDynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedHalfHeightSlope3Dynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedHalfHeightSlope6Dynamic("item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedHalfHeightSlope9Dynamic("item_rail_embedded_slope_dynamic", 5),

    /**
     * Concrete Type1
     */
    //straights
    tcRail_CONCRETE_TYPE1_SmallStraight("concrete/track_straight_1", 5),
    tcRail_CONCRETE_TYPE1_MediumStraight("concrete/track_straight_3", 5),
    tcRail_CONCRETE_TYPE1_LongStraight("concrete/track_straight_6", 5),
    tcRail_CONCRETE_TYPE1_VeryLongStraight("concrete/track_straight_12", 5),

    //turns
    tcRail_CONCRETE_TYPE1_1X1Turn("concrete/track_turn_1", 5),
    tcRail_CONCRETE_TYPE1_MediumTurn("concrete/track_turn_3", 5),
    tcRail_CONCRETE_TYPE1_LargeTurn("concrete/track_turn_5", 5),
    tcRail_CONCRETE_TYPE1_VeryLargeTurn("concrete/track_turn_10", 5),
    tcRail_CONCRETE_TYPE1_SuperLargeTurn("concrete/track_turn_16", 5),
    tcRail_CONCRETE_TYPE1_29X29Turn("concrete/track_turn_29", 5),
    tcRail_CONCRETE_TYPE1_32X32Turn("concrete/track_turn_32", 5),

    //45 degree turns
    tcRail_CONCRETE_TYPE1_Medium45DegreeTurn("concrete/track_45degree_turn_3x4", 5),
    tcRail_CONCRETE_TYPE1_Large45DegreeTurn("concrete/track_45degree_turn_3x6", 5),
    tcRail_CONCRETE_TYPE1_VeryLarge45DegreeTurn("concrete/track_45degree_turn_4x8", 5),
    tcRail_CONCRETE_TYPE1_SuperLarge45DegreeTurn("concrete/track_45degree_turn_5x11", 5),
    tcRail_CONCRETE_TYPE1_45DegreeTurn9x20("concrete/track_45degree_turn_9x20", 5),
    tcRail_CONCRETE_TYPE1_45DegreeTurn10x22("concrete/track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRail_CONCRETE_TYPE1_SmallParallelCurve("concrete/track_s-curve_2x8", 3),
    tcRail_CONCRETE_TYPE1_MediumParallelCurve("concrete/track_s-curve_3x12", 3),
    tcRail_CONCRETE_TYPE1_LargeParallelCurve("concrete/track_s-curve_4x16", 3),
    tcRail_CONCRETE_TYPE1_20x2SCurve("concrete/track_s-curve_2x20", 3),

    //switches
    tcRail_CONCRETE_TYPE1_MediumSwitch("concrete/track_switch_4x4", 5),
    tcRail_CONCRETE_TYPE1_LargeSwitch("concrete/track_switch_6x6", 5),
    tcRail_CONCRETE_TYPE1_VeryLargeSwitch("concrete/track_switch_11x11", 5),

    tcRail_CONCRETE_TYPE1_MediumParallelSwitch("concrete/track_switch_p_4x11", 5),
    tcRail_CONCRETE_TYPE1_LargeParallelSwitch("concrete/track_switch_p_4x17", 5),

    tcRail_CONCRETE_TYPE1_Medium45DegreeSwitch("concrete/track_switch_45degree_3x5", 5),
    tcRail_CONCRETE_TYPE1_Large45DegreeSwitch("concrete/track_switch_45degree_4x8", 5),
    tcRail_CONCRETE_TYPE1_CrossoverSwitch10x2("concrete/track_switch_crossover_10x2", 5),

    //diamonds
    tcRail_CONCRETE_TYPE1_TwoWaysCrossing("concrete/track_plus_crossing",5),
    tcRail_CONCRETE_TYPE1_DiamondCrossing("concrete/track_x_crossing",5),
    tcRail_CONCRETE_TYPE1_DoubleDiamondCrossing("concrete/track_double_x_crossing",5),
    tcRail_CONCRETE_TYPE1_FourWaysCrossing("concrete/track_xplus_crossing",5),

    //slopes
    tcRail_CONCRETE_TYPE1_1x3SlopeDynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_SlopeDynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_LargeSlopeDynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_VeryLargeSlopeDynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_HalfHeightSlope3Dynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_HalfHeightSlope6Dynamic("concrete/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE1_HalfHeightSlope9Dynamic("concrete/item_rail_straight_slope_dynamic", 5),


    /**
     * Concrete Type2
     */
    //straights
    tcRail_CONCRETE_TYPE2_SmallStraight("concrete_2/track_straight_1", 5),
    tcRail_CONCRETE_TYPE2_MediumStraight("concrete_2/track_straight_3", 5),
    tcRail_CONCRETE_TYPE2_LongStraight("concrete_2/track_straight_6", 5),
    tcRail_CONCRETE_TYPE2_VeryLongStraight("concrete_2/track_straight_12", 5),

    //turns
    tcRail_CONCRETE_TYPE2_1X1Turn("concrete_2/track_turn_1", 5),
    tcRail_CONCRETE_TYPE2_MediumTurn("concrete_2/track_turn_3", 5),
    tcRail_CONCRETE_TYPE2_LargeTurn("concrete_2/track_turn_5", 5),
    tcRail_CONCRETE_TYPE2_VeryLargeTurn("concrete_2/track_turn_10", 5),
    tcRail_CONCRETE_TYPE2_SuperLargeTurn("concrete_2/track_turn_16", 5),
    tcRail_CONCRETE_TYPE2_29X29Turn("concrete_2/track_turn_29", 5),
    tcRail_CONCRETE_TYPE2_32X32Turn("concrete_2/track_turn_32", 5),

    //45 degree turns
    tcRail_CONCRETE_TYPE2_Medium45DegreeTurn("concrete_2/track_45degree_turn_3x4", 5),
    tcRail_CONCRETE_TYPE2_Large45DegreeTurn("concrete_2/track_45degree_turn_3x6", 5),
    tcRail_CONCRETE_TYPE2_VeryLarge45DegreeTurn("concrete_2/track_45degree_turn_4x8", 5),
    tcRail_CONCRETE_TYPE2_SuperLarge45DegreeTurn("concrete_2/track_45degree_turn_5x11", 5),
    tcRail_CONCRETE_TYPE2_45DegreeTurn9x20("concrete_2/track_45degree_turn_9x20", 5),
    tcRail_CONCRETE_TYPE2_45DegreeTurn10x22("concrete_2/track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRail_CONCRETE_TYPE2_SmallParallelCurve("concrete_2/track_s-curve_2x8", 3),
    tcRail_CONCRETE_TYPE2_MediumParallelCurve("concrete_2/track_s-curve_3x12", 3),
    tcRail_CONCRETE_TYPE2_LargeParallelCurve("concrete_2/track_s-curve_4x16", 3),
    tcRail_CONCRETE_TYPE2_20x2SCurve("concrete_2/track_s-curve_2x20", 3),

    //switches
    tcRail_CONCRETE_TYPE2_MediumSwitch("concrete_2/track_switch_4x4", 5),
    tcRail_CONCRETE_TYPE2_LargeSwitch("concrete_2/track_switch_6x6", 5),
    tcRail_CONCRETE_TYPE2_VeryLargeSwitch("concrete_2/track_switch_11x11", 5),

    tcRail_CONCRETE_TYPE2_MediumParallelSwitch("concrete_2/track_switch_p_4x11", 5),
    tcRail_CONCRETE_TYPE2_LargeParallelSwitch("concrete_2/track_switch_p_4x17", 5),

    tcRail_CONCRETE_TYPE2_Medium45DegreeSwitch("concrete_2/track_switch_45degree_3x5", 5),
    tcRail_CONCRETE_TYPE2_Large45DegreeSwitch("concrete_2/track_switch_45degree_4x8", 5),
    tcRail_CONCRETE_TYPE2_CrossoverSwitch10x2("concrete_2/track_switch_crossover_10x2", 5),

    //diamonds
    tcRail_CONCRETE_TYPE2_TwoWaysCrossing("concrete_2/track_plus_crossing",5),
    tcRail_CONCRETE_TYPE2_DiamondCrossing("concrete_2/track_x_crossing",5),
    tcRail_CONCRETE_TYPE2_DoubleDiamondCrossing("concrete_2/track_double_x_crossing",5),
    tcRail_CONCRETE_TYPE2_FourWaysCrossing("concrete_2/track_xplus_crossing",5),

    //slopes
    tcRail_CONCRETE_TYPE2_1x3SlopeDynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_SlopeDynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_LargeSlopeDynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_VeryLargeSlopeDynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_HalfHeightSlope3Dynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_HalfHeightSlope6Dynamic("concrete_2/item_rail_straight_slope_dynamic", 5),
    tcRail_CONCRETE_TYPE2_HalfHeightSlope9Dynamic("concrete_2/item_rail_straight_slope_dynamic", 5),

    /**
     * TREATED_WOOD_TYPE1
     */
    //straights
    tcRail_WOOD_TYPE1_SmallStraight("wood_treated/track_straight_1", 5),
    tcRail_WOOD_TYPE1_MediumStraight("wood_treated/track_straight_3", 5),
    tcRail_WOOD_TYPE1_LongStraight("wood_treated/track_straight_6", 5),
    tcRail_WOOD_TYPE1_VeryLongStraight("wood_treated/track_straight_12", 5),

    //turns
    tcRail_WOOD_TYPE1_1X1Turn("wood_treated/track_turn_1", 5),
    tcRail_WOOD_TYPE1_MediumTurn("wood_treated/track_turn_3", 5),
    tcRail_WOOD_TYPE1_LargeTurn("wood_treated/track_turn_5", 5),
    tcRail_WOOD_TYPE1_VeryLargeTurn("wood_treated/track_turn_10", 5),
    tcRail_WOOD_TYPE1_SuperLargeTurn("wood_treated/track_turn_16", 5),
    tcRail_WOOD_TYPE1_29X29Turn("wood_treated/track_turn_29", 5),
    tcRail_WOOD_TYPE1_32X32Turn("wood_treated/track_turn_32", 5),

    //45 degree turns
    tcRail_WOOD_TYPE1_Medium45DegreeTurn("wood_treated/track_45degree_turn_3x4", 5),
    tcRail_WOOD_TYPE1_Large45DegreeTurn("wood_treated/track_45degree_turn_3x6", 5),
    tcRail_WOOD_TYPE1_VeryLarge45DegreeTurn("wood_treated/track_45degree_turn_4x8", 5),
    tcRail_WOOD_TYPE1_SuperLarge45DegreeTurn("wood_treated/track_45degree_turn_5x11", 5),
    tcRail_WOOD_TYPE1_45DegreeTurn9x20("wood_treated/track_45degree_turn_9x20", 5),
    tcRail_WOOD_TYPE1_45DegreeTurn10x22("wood_treated/track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRail_WOOD_TYPE1_SmallParallelCurve("wood_treated/track_s-curve_2x8", 3),
    tcRail_WOOD_TYPE1_MediumParallelCurve("wood_treated/track_s-curve_3x12", 3),
    tcRail_WOOD_TYPE1_LargeParallelCurve("wood_treated/track_s-curve_4x16", 3),
    tcRail_WOOD_TYPE1_20x2SCurve("wood_treated/track_s-curve_2x20", 3),

    //switches
    tcRail_WOOD_TYPE1_MediumSwitch("wood_treated/track_switch_4x4", 5),
    tcRail_WOOD_TYPE1_LargeSwitch("wood_treated/track_switch_6x6", 5),
    tcRail_WOOD_TYPE1_VeryLargeSwitch("wood_treated/track_switch_11x11", 5),

    tcRail_WOOD_TYPE1_MediumParallelSwitch("wood_treated/track_switch_p_4x11", 5),
    tcRail_WOOD_TYPE1_LargeParallelSwitch("wood_treated/track_switch_p_4x17", 5),

    tcRail_WOOD_TYPE1_Medium45DegreeSwitch("wood_treated/track_switch_45degree_3x5", 5),
    tcRail_WOOD_TYPE1_Large45DegreeSwitch("wood_treated/track_switch_45degree_4x8", 5),
    tcRail_WOOD_TYPE1_CrossoverSwitch10x2("wood_treated/track_switch_crossover_10x2", 5),

    //diamonds
    tcRail_WOOD_TYPE1_TwoWaysCrossing("wood_treated/track_plus_crossing",5),
    tcRail_WOOD_TYPE1_DiamondCrossing("wood_treated/track_x_crossing",5),
    tcRail_WOOD_TYPE1_DoubleDiamondCrossing("wood_treated/track_double_x_crossing",5),
    tcRail_WOOD_TYPE1_FourWaysCrossing("wood_treated/track_xplus_crossing",5),

    //slopes
    tcRail_WOOD_TYPE1_1x3SlopeDynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_SlopeDynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_LargeSlopeDynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_VeryLargeSlopeDynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_HalfHeightSlope3Dynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_HalfHeightSlope6Dynamic("wood_treated/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE1_HalfHeightSlope9Dynamic("wood_treated/item_rail_straight_slope_dynamic", 5),

    /**
     * WOOD_TYPE2
     */
    //straights
    tcRail_WOOD_TYPE2_SmallStraight("wood_spurce/track_straight_1", 5),
    tcRail_WOOD_TYPE2_MediumStraight("wood_spurce/track_straight_3", 5),
    tcRail_WOOD_TYPE2_LongStraight("wood_spurce/track_straight_6", 5),
    tcRail_WOOD_TYPE2_VeryLongStraight("wood_spurce/track_straight_12", 5),

    //turns
    tcRail_WOOD_TYPE2_1X1Turn("wood_spurce/track_turn_1", 5),
    tcRail_WOOD_TYPE2_MediumTurn("wood_spurce/track_turn_3", 5),
    tcRail_WOOD_TYPE2_LargeTurn("wood_spurce/track_turn_5", 5),
    tcRail_WOOD_TYPE2_VeryLargeTurn("wood_spurce/track_turn_10", 5),
    tcRail_WOOD_TYPE2_SuperLargeTurn("wood_spurce/track_turn_16", 5),
    tcRail_WOOD_TYPE2_29X29Turn("wood_spurce/track_turn_29", 5),
    tcRail_WOOD_TYPE2_32X32Turn("wood_spurce/track_turn_32", 5),

    //45 degree turns
    tcRail_WOOD_TYPE2_Medium45DegreeTurn("wood_spurce/track_45degree_turn_3x4", 5),
    tcRail_WOOD_TYPE2_Large45DegreeTurn("wood_spurce/track_45degree_turn_3x6", 5),
    tcRail_WOOD_TYPE2_VeryLarge45DegreeTurn("wood_spurce/track_45degree_turn_4x8", 5),
    tcRail_WOOD_TYPE2_SuperLarge45DegreeTurn("wood_spurce/track_45degree_turn_5x11", 5),
    tcRail_WOOD_TYPE2_45DegreeTurn9x20("wood_spurce/track_45degree_turn_9x20", 5),
    tcRail_WOOD_TYPE2_45DegreeTurn10x22("wood_spurce/track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRail_WOOD_TYPE2_SmallParallelCurve("wood_spurce/track_s-curve_2x8", 3),
    tcRail_WOOD_TYPE2_MediumParallelCurve("wood_spurce/track_s-curve_3x12", 3),
    tcRail_WOOD_TYPE2_LargeParallelCurve("wood_spurce/track_s-curve_4x16", 3),
    tcRail_WOOD_TYPE2_20x2SCurve("wood_spurce/track_s-curve_2x20", 3),

    //switches
    tcRail_WOOD_TYPE2_MediumSwitch("wood_spurce/track_switch_4x4", 5),
    tcRail_WOOD_TYPE2_LargeSwitch("wood_spurce/track_switch_6x6", 5),
    tcRail_WOOD_TYPE2_VeryLargeSwitch("wood_spurce/track_switch_11x11", 5),

    tcRail_WOOD_TYPE2_MediumParallelSwitch("wood_spurce/track_switch_p_4x11", 5),
    tcRail_WOOD_TYPE2_LargeParallelSwitch("wood_spurce/track_switch_p_4x17", 5),

    tcRail_WOOD_TYPE2_Medium45DegreeSwitch("wood_spurce/track_switch_45degree_3x5", 5),
    tcRail_WOOD_TYPE2_Large45DegreeSwitch("wood_spurce/track_switch_45degree_4x8", 5),
    tcRail_WOOD_TYPE2_CrossoverSwitch10x2("wood_spurce/track_switch_crossover_10x2", 5),

    //diamonds
    tcRail_WOOD_TYPE2_TwoWaysCrossing("wood_spurce/track_plus_crossing",5),
    tcRail_WOOD_TYPE2_DiamondCrossing("wood_spurce/track_x_crossing",5),
    tcRail_WOOD_TYPE2_DoubleDiamondCrossing("wood_spurce/track_double_x_crossing",5),
    tcRail_WOOD_TYPE2_FourWaysCrossing("wood_spurce/track_xplus_crossing",5),

    //slopes
    tcRail_WOOD_TYPE2_1x3SlopeDynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_SlopeDynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_LargeSlopeDynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_VeryLargeSlopeDynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_HalfHeightSlope3Dynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_HalfHeightSlope6Dynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),
    tcRail_WOOD_TYPE2_HalfHeightSlope9Dynamic("wood_spurce/item_rail_straight_slope_dynamic", 5),

    /**
     * NON STANDARD
     */

    //road crossings
    tcRailSmallRoadCrossing("item_rail_small_road_crossing", 5),
    tcRailSmallRoadCrossing1("item_rail_small_road_crossing_1", 5),
    tcRailSmallRoadCrossing2("item_rail_small_road_crossing_2", 5),
    tcRailSmallRoadCrossingDynamic("item_rail_small_road_crossing_dynamic", 5);

    public Item item;
    public String iconName;

    /**
     * amount for one emerald. For ItemRollingStock, it is the price for one train
     */
    public int amountForEmerald;

    /**
     * @param iconName
     * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
     */
    private TrackItemIDs(String iconName, int amountForEmerald) {
        this.iconName = iconName;
        this.amountForEmerald = amountForEmerald;
    }
}
