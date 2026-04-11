/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import train.common.Traincraft;
import train.common.adminbook.ItemAdminBook;
import train.common.library.EnumTracks;
import train.common.library.Info;
import train.common.library.ItemIDs;
import train.common.library.TrackItemIDs;

public class TCItems {

	public static void init() {
		loadItems();
		registerItems();
	}

	private static void loadItems()
	{
		for (ItemIDs items : ItemIDs.values())
		{
			if (items.className != null)
			{
                switch (items.className)
				{
                    case "ItemTrain":
                        items.item = new ItemPart(items.iconName);
                        break;
                    case "ItemRollingStock":
                        items.item = new ItemTCRollingStock(items.iconName, items.TypeOfRollingStock);
                        break;
                    case "ItemContainer":
                        items.item = new ItemContainer(items.iconName);
                        break;
                }
			}
		}
		ItemIDs.minecartRotativeDigger.item = new ItemRotativeDigger();
		//ItemIDs.signal.item = new ItemSignal(ItemIDs.signal.itemID, BlockIDs.activeSignal.block).setIconIndex(ItemIDs.signal.iconIndex);
		ItemIDs.chunkLoaderActivator.item = new ItemChunkLoaderActivator();
		ItemIDs.recipeBook.item = new ItemRecipeBook();
		ItemIDs.adminBook.item = new ItemAdminBook();
		ItemIDs.trackDebugger.item = new ItemTrackDebugger();
		//ItemIDs.creditsBook.item = new ItemCreditsBook();
		ItemIDs.paintbrushThing.item = new ItemPaintbrushThing();
		ItemIDs.padlock.item = new ItemPadlock();

		ItemIDs.stake.item = new ItemStacked(1200);
		ItemIDs.brakeStick.item = new ItemBrakeStick();
		ItemIDs.interchangeTransferReportBoard.item = new ItemInterchangeTransferReportBoard();
		ItemIDs.airship.item = new ItemZeppelins(0);
		ItemIDs.zeppelin.item = new ItemZeppelins(1);
		ItemIDs.overalls.item = new ItemTCArmor(ItemIDs.overalls.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 2,0);
		ItemIDs.jacket.item = new ItemTCArmor(ItemIDs.jacket.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 1,0);
		ItemIDs.hat.item = new ItemTCArmor(ItemIDs.hat.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 0,0);

		/**Paintable armors:*/
		ItemIDs.pants_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.pants_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0xdedede);
		ItemIDs.jacket_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.jacket_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x002cdb);
		ItemIDs.hat_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.hat_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x9fafb5);

		ItemIDs.pants_driver_paintable.item = new ItemTCArmor(ItemIDs.pants_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0x1535d4);
		ItemIDs.jacket_driver_paintable.item = new ItemTCArmor(ItemIDs.jacket_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x1469d9);
		ItemIDs.hat_driver_paintable.item = new ItemTCArmor(ItemIDs.hat_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x1469d9);

		ItemIDs.boots_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.boots_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 3,0x1535d4);
		ItemIDs.pants_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.pants_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 2,0x1535d4);
		ItemIDs.jacket_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.jacket_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 1,0x1469d9);
		ItemIDs.helmet_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.helmet_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 0,0x1469d9);

		ItemIDs.composite_wrench.item = new ItemWrench();
		// region standard track
		/**Tracks*/
		TrackItemIDs.tcRailSmallStraight.item = new ItemTCRail(EnumTracks.SMALL_STRAIGHT);
		TrackItemIDs.tcRailMediumStraight.item = new ItemTCRail(EnumTracks.MEDIUM_STRAIGHT);
		TrackItemIDs.tcRailLongStraight.item = new ItemTCRail(EnumTracks.LONG_STRAIGHT);
		TrackItemIDs.tcRailVeryLongStraight.item = new ItemTCRail(EnumTracks.VERY_LONG_STRAIGHT);

		TrackItemIDs.tcRail1X1Turn.item = new ItemTCRail(EnumTracks.TURN_1X1);
		TrackItemIDs.tcRailMediumTurn.item = new ItemTCRail(EnumTracks.MEDIUM_TURN);
		TrackItemIDs.tcRailLargeTurn.item = new ItemTCRail(EnumTracks.LARGE_TURN);
		TrackItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(EnumTracks.VERY_LARGE_TURN);
		TrackItemIDs.tcRailSuperLargeTurn.item = new ItemTCRail(EnumTracks.SUPER_LARGE_TURN);
		TrackItemIDs.tcRail29X29Turn.item = new ItemTCRail(EnumTracks.TURN_29X29);
		TrackItemIDs.tcRail32X32Turn.item = new ItemTCRail(EnumTracks.TURN_32X32);

		TrackItemIDs.tcRailMediumSwitch.item = new ItemTCRail(EnumTracks.MEDIUM_SWITCH);
		TrackItemIDs.tcRailLargeSwitch.item = new ItemTCRail(EnumTracks.LARGE_SWITCH);
		TrackItemIDs.tcRailSmallRoadCrossing.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING);
		TrackItemIDs.tcRailSmallRoadCrossing1.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING_1);
		TrackItemIDs.tcRailSmallRoadCrossing2.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING_2);
		TrackItemIDs.tcRailSmallRoadCrossingDynamic.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING_DYNAMIC);

		TrackItemIDs.tcRailMedium45DegreeSwitch.item = new ItemTCRail(EnumTracks.MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRailLarge45DegreeSwitch.item = new ItemTCRail(EnumTracks.LARGE_45DEGREE_SWITCH);
		TrackItemIDs.tcRailVeryLargeSwitch.item = new ItemTCRail(EnumTracks.VERY_LARGE_SWITCH);

		TrackItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(EnumTracks.MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRailLargeParallelSwitch.item = new ItemTCRail(EnumTracks.LARGE_PARALLEL_SWITCH);

		TrackItemIDs.tcRailCrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.CROSSOVER_SWITCH_10X2);

		TrackItemIDs.tcRailSmallParallelCurve.item = new ItemTCRail(EnumTracks.SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRailMediumParallelCurve.item = new ItemTCRail(EnumTracks.MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRailLargeParallelCurve.item = new ItemTCRail(EnumTracks.LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRail20x2SCurve.item = new ItemTCRail(EnumTracks.S_CURVE_20x2);

		/** Normal Slopes*/
		TrackItemIDs.tcRail1X3SlopeDynamic.item = new ItemTCRail(EnumTracks.SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRailSlopeDynamic.item = new ItemTCRail(EnumTracks.SLOPE_DYNAMIC);
		TrackItemIDs.tcRailLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRailVeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_DYNAMIC);


		// region Deprecated Slopes
		TrackItemIDs.tcRailSlopeWood.item = new ItemTCRail(EnumTracks.SLOPE_WOOD);
		TrackItemIDs.tcRailSlopeGravel.item = new ItemTCRail(EnumTracks.SLOPE_GRAVEL);
		TrackItemIDs.tcRailSlopeBallast.item = new ItemTCRail(EnumTracks.SLOPE_BALLAST);

		TrackItemIDs.tcRailLargeSlopeWood.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_WOOD);
		TrackItemIDs.tcRailLargeSlopeGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_GRAVEL);
		TrackItemIDs.tcRailLargeSlopeBallast.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_BALLAST);
		TrackItemIDs.tcRailVeryLargeSlopeWood.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_WOOD);
		TrackItemIDs.tcRailVeryLargeSlopeGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_GRAVEL);
		TrackItemIDs.tcRailVeryLargeSlopeBallast.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_BALLAST);

		TrackItemIDs.tcRailSlopeSnowGravel.item = new ItemTCRail(EnumTracks.SLOPE_SNOW_GRAVEL);
		TrackItemIDs.tcRailLargeSlopeSnowGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_SNOW_GRAVEL);
		TrackItemIDs.tcRailVeryLargeSlopeSnowGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_SNOW_GRAVEL);
		TrackItemIDs.tcRailSlopePeaGravel.item = new ItemTCRail(EnumTracks.SLOPE_PEA_GRAVEL);
		TrackItemIDs.tcRailLargeSlopePeaGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_PEA_GRAVEL);
		TrackItemIDs.tcRailVeryLargeSlopePeaGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_PEA_GRAVEL);
		// endregion Deprecated Slopes


		/** Normal Crossways*/
		TrackItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(EnumTracks.TWO_WAYS_CROSSING);
		TrackItemIDs.tcRailDiamondCrossing.item = new ItemTCRail(EnumTracks.DIAMOND_CROSSING);
		TrackItemIDs.tcRailDoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRailFourWaysCrossing.item = new ItemTCRail(EnumTracks.FOUR_WAYS_CROSSING);

		// endregion standard track

		/*Embedded Crossways*/
		TrackItemIDs.tcRailEmbeddedTwoWaysCrossing.item = new ItemTCRail(EnumTracks.EMBEDDED_TWO_WAYS_CROSSING);
		TrackItemIDs.tcRailEmbeddedDiamondCrossing.item = new ItemTCRail(EnumTracks.EMBEDDED_DIAMOND_CROSSING);
		TrackItemIDs.tcRailEmbeddedDoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.EMBEDDED_DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRailEmbeddedFourWaysCrossing.item = new ItemTCRail(EnumTracks.EMBEDDED_FOUR_WAYS_CROSSING);

		/* Embedded Switches*/
		TrackItemIDs.tcRailEmbeddedMediumSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_SWITCH);
		TrackItemIDs.tcRailEmbeddedLargeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_SWITCH);
		TrackItemIDs.tcRailEmbeddedVeryLargeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_SWITCH);
		TrackItemIDs.tcRailEmbeddedMediumParallelSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRailEmbeddedLargeParallelSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_PARALLEL_SWITCH);
		TrackItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRailEmbeddedLarge45DegreeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_45DEGREE_SWITCH);

		TrackItemIDs.tcRailEmbeddedCrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.EMBEDDED_CROSSOVER_SWITCH_10X2);


		/*Embedded Straights*/
		TrackItemIDs.tcRailEmbeddedSmallStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_SMALL_STRAIGHT);
		TrackItemIDs.tcRailEmbeddedMediumStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_STRAIGHT);
		TrackItemIDs.tcRailEmbeddedLongStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_LONG_STRAIGHT);
		TrackItemIDs.tcRailEmbeddedVeryLongStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LONG_STRAIGHT);

		/* Embedded Parallel Curves*/
		TrackItemIDs.tcRailEmbeddedSmallParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRailEmbeddedMediumParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRailEmbeddedLargeParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRailEmbedded20x2SCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_S_CURVE_20x2);

		/* Embedded Turns */
		TrackItemIDs.tcRailEmbedded1X1Turn.item = new ItemTCRail(EnumTracks.EMBEDDED_TURN_1X1);
		TrackItemIDs.tcRailEmbeddedMediumTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_TURN);
		TrackItemIDs.tcRailEmbeddedLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_TURN);
		TrackItemIDs.tcRailEmbeddedVeryLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_TURN);
		TrackItemIDs.tcRailEmbeddedSuperLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_SUPER_LARGE_TURN);
		TrackItemIDs.tcRailEmbedded29X29Turn.item = new ItemTCRail(EnumTracks.EMBEDDED_TURN_29X29);
		TrackItemIDs.tcRailEmbedded32X32Turn.item = new ItemTCRail(EnumTracks.EMBEDDED_TURN_32X32);

		/*Normal 45Degree Turns*/
		TrackItemIDs.tcRailMedium45DegreeTurn.item = new ItemTCRail(EnumTracks.MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRailLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRailVeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRailSuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRail45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.DIAGONAL_TURN_10X22);


		/*Embedded 45Degree Turns*/
		TrackItemIDs.tcRailEmbeddedMedium45DegreeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRailEmbeddedLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRailEmbedded45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.EMBEDDED_DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRailEmbedded45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.EMBEDDED_DIAGONAL_TURN_10X22);

		/* Embedded Slopes*/
		TrackItemIDs.tcRailEmbedded1x3SlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRailEmbeddedSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_SLOPE_DYNAMIC);
		TrackItemIDs.tcRailEmbeddedLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC);

		//===================================================Concrete Type 1=============================================================
		/*CONCRETE_TYPE1 Crossways*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_TwoWaysCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_TWO_WAYS_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_DiamondCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_DoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_FourWaysCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_FOUR_WAYS_CROSSING);

		/* CONCRETE_TYPE1 Switches*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_MediumSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LargeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_VeryLargeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_VERY_LARGE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_MediumParallelSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LargeParallelSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_Medium45DegreeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_Large45DegreeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_45DEGREE_SWITCH);

		TrackItemIDs.tcRail_CONCRETE_TYPE1_CrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_CROSSOVER_SWITCH_10X2);


		/*CONCRETE_TYPE1 Straights*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SMALL_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_MediumStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LongStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LONG_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_VeryLongStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_VERY_LONG_STRAIGHT);

		/* CONCRETE_TYPE1 Parallel Curves*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_SmallParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_MediumParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LargeParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_20x2SCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_S_CURVE_20x2);

		/* CONCRETE_TYPE1 Turns */
		TrackItemIDs.tcRail_CONCRETE_TYPE1_1X1Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_TURN_1X1);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_MediumTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_VeryLargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_VERY_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_SuperLargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SUPER_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_29X29Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_TURN_29X29);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_32X32Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_TURN_32X32);

		/*CONCRETE_TYPE1 45Degree Turns*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_Medium45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_Large45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_VeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_SuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_DIAGONAL_TURN_10X22);

		/* CONCRETE_TYPE1 Slopes*/
		TrackItemIDs.tcRail_CONCRETE_TYPE1_1x3SlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_SlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_LargeSlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE1_VeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE1_VERY_LARGE_SLOPE_DYNAMIC);

		//===================================================Concrete Type 2=============================================================
		/*CONCRETE_TYPE2 Crossways*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_TwoWaysCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_TWO_WAYS_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_DiamondCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_DoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_FourWaysCrossing.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_FOUR_WAYS_CROSSING);

		/* CONCRETE_TYPE2 Switches*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_MediumSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LargeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_VeryLargeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_VERY_LARGE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_MediumParallelSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LargeParallelSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_Medium45DegreeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_Large45DegreeSwitch.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_45DEGREE_SWITCH);

		TrackItemIDs.tcRail_CONCRETE_TYPE2_CrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_CROSSOVER_SWITCH_10X2);


		/*CONCRETE_TYPE2 Straights*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SMALL_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_MediumStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LongStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LONG_STRAIGHT);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_VeryLongStraight.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_VERY_LONG_STRAIGHT);

		/* CONCRETE_TYPE2 Parallel Curves*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_SmallParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_MediumParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LargeParallelCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_20x2SCurve.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_S_CURVE_20x2);

		/* CONCRETE_TYPE2 Turns */
		TrackItemIDs.tcRail_CONCRETE_TYPE2_1X1Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_TURN_1X1);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_MediumTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_VeryLargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_VERY_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_SuperLargeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SUPER_LARGE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_29X29Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_TURN_29X29);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_32X32Turn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_TURN_32X32);

		/*CONCRETE_TYPE2 45Degree Turns*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_Medium45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_Large45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_VeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_SuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_DIAGONAL_TURN_10X22);

		/* CONCRETE_TYPE2 Slopes*/
		TrackItemIDs.tcRail_CONCRETE_TYPE2_1x3SlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_SlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_LargeSlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_CONCRETE_TYPE2_VeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.CONCRETE_TYPE2_VERY_LARGE_SLOPE_DYNAMIC);

		//===================================================TREATED_WOOD_TYPE1=============================================================
		/*TREATED_WOOD_TYPE1 Crossways*/
		TrackItemIDs.tcRail_WOOD_TYPE1_TwoWaysCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_TWO_WAYS_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE1_DiamondCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE1_DoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE1_FourWaysCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_FOUR_WAYS_CROSSING);

		/* TREATED_WOOD_TYPE1 Switches*/
		TrackItemIDs.tcRail_WOOD_TYPE1_MediumSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_LargeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_VeryLargeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_VERY_LARGE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_MediumParallelSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_LargeParallelSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_Medium45DegreeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE1_Large45DegreeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_45DEGREE_SWITCH);

		TrackItemIDs.tcRail_WOOD_TYPE1_CrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_CROSSOVER_SWITCH_10X2);


		/*TREATED_WOOD_TYPE1 Straights*/
		TrackItemIDs.tcRail_WOOD_TYPE1_SmallStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SMALL_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE1_MediumStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE1_LongStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LONG_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE1_VeryLongStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_VERY_LONG_STRAIGHT);

		/* TREATED_WOOD_TYPE1 Parallel Curves*/
		TrackItemIDs.tcRail_WOOD_TYPE1_SmallParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE1_MediumParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE1_LargeParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE1_20x2SCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_S_CURVE_20x2);

		/* TREATED_WOOD_TYPE1 Turns */
		TrackItemIDs.tcRail_WOOD_TYPE1_1X1Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_TURN_1X1);
		TrackItemIDs.tcRail_WOOD_TYPE1_MediumTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_LargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_VeryLargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_VERY_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_SuperLargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SUPER_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_29X29Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_TURN_29X29);
		TrackItemIDs.tcRail_WOOD_TYPE1_32X32Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_TURN_32X32);

		/*TREATED_WOOD_TYPE1 45Degree Turns*/
		TrackItemIDs.tcRail_WOOD_TYPE1_Medium45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_Large45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_VeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_SuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE1_45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRail_WOOD_TYPE1_45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_DIAGONAL_TURN_10X22);

		/* TREATED_WOOD_TYPE1 Slopes*/
		TrackItemIDs.tcRail_WOOD_TYPE1_1x3SlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE1_SlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE1_LargeSlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE1_VeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE1_VERY_LARGE_SLOPE_DYNAMIC);

		//===================================================WOOD_TYPE2=============================================================
		/*WOOD_TYPE2 Crossways*/
		TrackItemIDs.tcRail_WOOD_TYPE2_TwoWaysCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_TWO_WAYS_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE2_DiamondCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE2_DoubleDiamondCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_DOUBLE_DIAMOND_CROSSING);
		TrackItemIDs.tcRail_WOOD_TYPE2_FourWaysCrossing.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_FOUR_WAYS_CROSSING);

		/* WOOD_TYPE2 Switches*/
		TrackItemIDs.tcRail_WOOD_TYPE2_MediumSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_LargeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_VeryLargeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_VERY_LARGE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_MediumParallelSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_LargeParallelSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_PARALLEL_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_Medium45DegreeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_45DEGREE_SWITCH);
		TrackItemIDs.tcRail_WOOD_TYPE2_Large45DegreeSwitch.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_45DEGREE_SWITCH);

		TrackItemIDs.tcRail_WOOD_TYPE2_CrossoverSwitch10x2.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_CROSSOVER_SWITCH_10X2);


		/*WOOD_TYPE2 Straights*/
		TrackItemIDs.tcRail_WOOD_TYPE2_SmallStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SMALL_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE2_MediumStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE2_LongStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LONG_STRAIGHT);
		TrackItemIDs.tcRail_WOOD_TYPE2_VeryLongStraight.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_VERY_LONG_STRAIGHT);

		/* WOOD_TYPE2 Parallel Curves*/
		TrackItemIDs.tcRail_WOOD_TYPE2_SmallParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SMALL_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE2_MediumParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE2_LargeParallelCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_PARALLEL_CURVE);
		TrackItemIDs.tcRail_WOOD_TYPE2_20x2SCurve.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_S_CURVE_20x2);

		/* WOOD_TYPE2 Turns */
		TrackItemIDs.tcRail_WOOD_TYPE2_1X1Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_TURN_1X1);
		TrackItemIDs.tcRail_WOOD_TYPE2_MediumTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_LargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_VeryLargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_VERY_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_SuperLargeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SUPER_LARGE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_29X29Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_TURN_29X29);
		TrackItemIDs.tcRail_WOOD_TYPE2_32X32Turn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_TURN_32X32);

		/*WOOD_TYPE2 45Degree Turns*/
		TrackItemIDs.tcRail_WOOD_TYPE2_Medium45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_MEDIUM_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_Large45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_VeryLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_VERY_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_SuperLarge45DegreeTurn.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SUPER_LARGE_45DEGREE_TURN);
		TrackItemIDs.tcRail_WOOD_TYPE2_45DegreeTurn9x20.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_DIAGONAL_TURN_9X20);
		TrackItemIDs.tcRail_WOOD_TYPE2_45DegreeTurn10x22.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_DIAGONAL_TURN_10X22);

		/* WOOD_TYPE2 Slopes*/
		TrackItemIDs.tcRail_WOOD_TYPE2_1x3SlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SLOPE_1X3_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE2_SlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE2_LargeSlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_LARGE_SLOPE_DYNAMIC);
		TrackItemIDs.tcRail_WOOD_TYPE2_VeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.WOOD_TYPE2_VERY_LARGE_SLOPE_DYNAMIC);



		//=========================================================END===================================================================
			ItemIDs.wirelessTransmitter.item = new ItemWirelessTransmitter();
			ItemIDs.atoCard.item = new ItemATOCard();
			ItemIDs.pennCentral.item = new ItemPennCentralSimCard();

		//ItemIDs.signalPairingDevice.item = new ItemSignalPairingDevice();
		ItemIDs.remoteController.item = new ItemRemoteController();
		ItemIDs.remoteControllerModule.item = new ItemRemoteControllerModule();
	}

	private static void registerItems()
	{
		for (ItemIDs items : ItemIDs.values())
		{
			if (items.item != null) {
				items.item.setUnlocalizedName(Info.modID + ":" + items.name());
				GameRegistry.registerItem(items.item, items.name());
			}
		}

		for (TrackItemIDs item : TrackItemIDs.values())
		{
			if (item.item != null) {
				item.item.setUnlocalizedName(Info.modID + ":" + item.name());
				GameRegistry.registerItem(item.item, item.name());
			}
		}
	}

}
