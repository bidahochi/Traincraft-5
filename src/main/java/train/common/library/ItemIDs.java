/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package train.common.library;

import net.minecraft.item.Item;
import static train.common.library.TypeOfRollingStock.*;

public enum ItemIDs {
	diesel("ItemContainer", "item_diesel_filled", 20),
	stake("ItemStacked", "item_stake", 1),
	steeldust("ItemTrain", "item_steeldust", 0),
	coaldust("ItemTrain", "item_coaldust", 15),
	graphite("ItemTrain", "item_graphite", 10),
	boiler("ItemTrain", "item_boiler_steel", 5),
	firebox("ItemTrain", "item_firebox_steel", 5),
	bogie("ItemTrain", "item_bogie_steel", 4),
	steelframe("ItemTrain", "item_frame_steel", 6),
	steelcab("ItemTrain", "item_cab_steel", 5),
	steelchimney("ItemTrain", "item_chimney_steel", 5),
	airship("ItemZeppelin", "item_zeppelin", 1),
	balloon("ItemTrain", "item_balloon", 7),
	propeller("ItemTrain", "item_propeller", 6),
	steamengine("ItemTrain", "item_engine_steam", 2),
	dieselengine("ItemTrain", "item_engine_diesel", 1),
	piston("ItemTrain", "item_piston", 9),
	camshaft("ItemTrain", "item_camshaft", 8),
	cylinder("ItemTrain", "item_cylinder", 7),
	electmotor("ItemTrain", "item_engine_electric", 1),
	woodenFrame("ItemTrain", "item_frame_wood", 12),
	woodenBogie("ItemTrain", "item_bogie_wood", 15),
	woodenCab("ItemTrain", "item_cab_wood", 10),
	ironChimney("ItemTrain", "item_chimney_iron", 7),
	ironFirebox("ItemTrain", "item_firebox_iron", 4),
	ironBoiler("ItemTrain", "item_boiler_iron", 5),
	ironFrame("ItemTrain", "item_frame_iron", 6),
	ironBogie("ItemTrain", "item_bogie_iron", 8),
	ironCab("ItemTrain", "item_cab_iron", 5),
	steel("ItemTrain", "item_steel", 4),
	refinedFuel("ItemContainer", "item_fuel_filled", 15),
	signal("ItemSignal", "item_signal", 0),
	seats("ItemTrain", "item_seats", 15),
	transformer("ItemTrain", "item_transformer", 4),
	controls("ItemTrain", "item_controls", 7),
	transmition("ItemTrain", "item_transmition", 5),
	generator("ItemTrain", "item_generator", 5),
	overalls("ItemTCArmor", "armour_overalls", 1),
	jacket("ItemTCArmor", "armour_jacket", 1),
	hat("ItemTCArmor", "armour_hat", 1),
	rawPlastic("ItemTrain", "item_plastic", 20),
	ingotCopper("ItemTrain", "item_copper", 9),
	copperWireFine("ItemTrain", "item_wire", 4),
	electronicCircuit("ItemTrain", "item_circuit", 2),
	chunkLoaderActivator("ItemChunkLoaderActivator", "item_chunk_loader", 1),
	//refinedFuelLiquid("ItemTrain", "item_liquid_fuel"),
	//dieselLiquid("ItemTrain", "item_liquid_diesel"),
	emptyCanister("ItemContainer", "item_canister", 40),
	//copperRail("ItemRail", "item_rail_copper", 1),
	//steelRail("ItemRail", "item_rail_steel", 1),
	copperRail("ItemTrain", "item_rail_copper", 1),
	steelRail("ItemTrain", "item_rail_steel", 1),
	recipeBook("ItemRecipeBook", "item_book_blue", 1),
	creditsBook("ItemRecipeBook", "item_book_brown", 1),
	adminBook("ItemAdminBook", "item_book_blue", 0),
	trackDebugger("ItemTrackDebugger", "item_composite_wrench", 0),
	wirelessTransmitter("ItemWirelessTransmitter", "wireless_transmitter", 3),
	padlock("ItemPadlock", "padlock", 1),
	atoCard("ItemATOCard", "ato_card", 5),
	pennCentral("ItemPennCentralSimCard", "ato_card", 291),
	paintbrushThing("ItemPaintbrushThing", "paintbrushthing", 9),
	brakeStick("ItemBrakeStick", "item_brakestick", 2),
	interchangeTransferReportBoard("ItemInterchangeTransferReportBoard", "item_interchangetransferreportboard", 64),


	minecartWork("ItemRollingStock", "train_work", HERITAGE, 4),
	minecartTender("ItemRollingStock", "train_tender", HERITAGE, 4),
	minecartChest("ItemRollingStock", "train_freight_1", HERITAGE, 4),
	minecartFreightBamboo("ItemRollingStock", "train_freight_bamboo", HERITAGE, 2),
	minecartTrainBamboo("ItemRollingStock", "train_train_bamboo", HERITAGE, 3),
	minecartPassengerBamboo("ItemRollingStock", "train_passenger_bamboo", HERITAGE, 1),
	minecartFreightGermanPost("ItemRollingStock", "train_freight_german_post", HERITAGE, 2),
	minecartFreightDepressedFlatbed("ItemRollingStock", "train_freight_depressed_flatbed", HERITAGE, 2),
	minecartPower("ItemRollingStock", "train_steam_normal", HERITAGE, 10),
	minecartASTFAutorack("ItemRollingStock", "train_autorack", HERITAGE, 5),
	minecartLoco3("ItemRollingStock", "train_steam_small", HERITAGE, 7),
	minecartBuilder("ItemRollingStock", "train_builder", HERITAGE, 20),
	minecartCaboose("ItemRollingStock", "train_caboose", HERITAGE, 6),
	minecartGrain("ItemRollingStock", "train_hopper_grain", HERITAGE, 6),
	minecartWatertransp("ItemRollingStock", "train_tank_lava", HERITAGE, 7),
	minecartWood("ItemRollingStock", "train_transport_wood", HERITAGE, 3),
	minecartPassenger2("ItemRollingStock", "train_passenger_1", HERITAGE, 2),
	minecartBR_E69("ItemRollingStock", "train_bre69", HERITAGE, 10),
	minecartShunter("ItemRollingStock", "train_shunter", HERITAGE, 10),
	minecartVL10("ItemRollingStock", "train_vl10", HERITAGE, 10),
	minecartTramWood("ItemRollingStock", "train_tram", HERITAGE, 7),
	minecartChmE3("ItemRollingStock", "train_chme3", HERITAGE, 8),
	minecartHeavySteam("ItemRollingStock", "train_steam_heavy", HERITAGE, 7), //HandleMaxAttachedCarts.HEAVY_STEAM_CARTS, 0D, (int) SpeedHandler.HEAVYSTEAM, "train_steam_heavy"),
	minecartTenderHeavy("ItemRollingStock", "train_tender_heavy", HERITAGE, 5),
	minecartFlatCart("ItemRollingStock", "train_flat", HERITAGE, 1),
	//minecartNewHighSpeedLoco("ItemRollingStock","train_speed",10),
	minecartFreightCart2("ItemRollingStock", "train_freight_2", HERITAGE, 2),
	minecartOpenWagon("ItemRollingStock", "train_hopper", HERITAGE, 3),
	minecartTankWagon("ItemRollingStock", "train_tank_us", HERITAGE, 5),
	minecartJukeBoxCart("ItemRollingStock", "train_jukebox", HERITAGE, 10),
	minecartStockCar("ItemRollingStock", "train_stock", HERITAGE, 10),
	minecartDRWGStockCar("ItemRollingStock", "drwg_stockcar", HERITAGE, 10),
	minecartCabooseWork("ItemRollingStock", "train_caboose_work", HERITAGE, 3),
	minecartPassenger5("ItemRollingStock", "train_passenger_2", HERITAGE, 2),
	minecartTankWagon2("ItemRollingStock", "train_tank_blue", HERITAGE, 5),
	minecartPassengerBlue("ItemRollingStock", "train_passenger_3", HERITAGE, 2),
	minecartGP7Red("ItemRollingStock", "train_gp7", HERITAGE, 10),
	minecartCD742("ItemRollingStock", "train_cd742", HERITAGE, 10),
	minecartFlatCartSU("ItemRollingStock", "train_flat_su", HERITAGE, 1),
	minecartFlatCartUS("ItemRollingStock", "train_flat_us", HERITAGE, 1),
	minecartBoxCartUS("ItemRollingStock", "train_box_us", HERITAGE, 4),
	minecartBoxCartPRR("ItemRollingStock", "train_box_prr", HERITAGE, 4),
	minecartFreightHopperUS("ItemRollingStock", "train_hopper_us", HERITAGE, 6),
	minecartFreight100TonHopper("ItemRollingStock", "train_100_ton_hopper", HERITAGE, 8),
	minecartTankWagonUS("ItemRollingStock", "train_tank_us_2", HERITAGE, 8),
	minecartTankWagonThreeDome("ItemRollingStock", "train_tank_three_dome", HERITAGE, 7),
	minecartFlatCartWoodUS("ItemRollingStock", "train_flat_wood", HERITAGE, 3),
	minecartBulkheadFlatCart("ItemRollingStock", "train_bulkheadflat_wood", HERITAGE, 3),
	minecartFreightCartUS("ItemRollingStock", "train_freight_3", HERITAGE, 4),
	minecartFreightCartSmall("ItemRollingStock", "train_freight_4", HERITAGE, 2),
	minecartLocoCherepanov("ItemRollingStock", "train_cherpanov", HERITAGE, 4),
	minecartMineTrain("ItemRollingStock", "train_mine_cart", HERITAGE, 1),
	minecartLocoMineTrain("ItemRollingStock", "train_mine_train", HERITAGE, 2),
	minecartSteamRedTender("ItemRollingStock", "train_tender_steam", HERITAGE, 4),
	minecartFreightWood2("ItemRollingStock", "train_transport_wood_2", HERITAGE, 6),
	minecartCaboose3("ItemRollingStock", "train_caboose_2", HERITAGE, 3),
	minecartGWRBrakeVan("ItemRollingStock", "train_gwr_brakevan", HERITAGE, 3),
	minecartPassenger7("ItemRollingStock", "train_passenger_4", HERITAGE, 2),
	minecartFreightClosed("ItemRollingStock", "train_freight_closed", HERITAGE, 5),
	minecartFreightOpen2("ItemRollingStock", "train_freight_open", HERITAGE, 6),
	minecartLocomogulBlue("ItemRollingStock", "train_mogul", HERITAGE, 10),
	minecartLocoForneyRed("ItemRollingStock", "train_forney", HERITAGE, 10),
	minecartLocoBR01_DB("ItemRollingStock", "train_br01", HERITAGE, 15),
	minecartLocoCoranationClass("ItemRollingStock", "train_coronationclass", HERITAGE, 15),
	minecartLocoCoranationClassTender("ItemRollingStock", "train_coronationclasstender", HERITAGE, 15),
	minecartMailWagon_DB("ItemRollingStock", "train_mail", HERITAGE, 4),
	minecartFreightWagon_DB("ItemRollingStock", "train_freight_db", HERITAGE, 3),
	minecartPassenger8_1class_DB("ItemRollingStock", "train_passenger_5", HERITAGE, 6),
	minecartPassenger9_2class_DB("ItemRollingStock", "train_passenger_6", HERITAGE, 5),
	minecartLocoBR80_DB("ItemRollingStock", "train_br80", HERITAGE, 10),
	minecartTenderBR01_DB("ItemRollingStock", "train_tender_br01", HERITAGE, 15),
	minecartFlatCartRail_DB("ItemRollingStock", "train_transport_rail", HERITAGE, 6),
	minecartFlatCart_DB("ItemRollingStock", "train_flat_db", HERITAGE, 1),
	minecartFlatCartLogs_DB("ItemRollingStock", "train_transport_wood_3", HERITAGE, 2),
	minecartPropagandaJapan("ItemRollingStock", "propaganda_japan", HERITAGE, 2),
	minecartPropagandaBritish("ItemRollingStock", "propaganda_british", HERITAGE, 2),
	minecartPropagandaUSSR("ItemRollingStock", "propaganda_ussr", HERITAGE, 2),
	minecartPropagandaUs("ItemRollingStock", "propaganda_us", HERITAGE, 2),
	minecartFreightGondola_DB("ItemRollingStock", "train_freight_gondola", HERITAGE, 3),
	minecartFreightL("ItemRollingStock", "train_freight_l", HERITAGE, 3),
	minecartTankWagon_DB("ItemRollingStock", "train_tank_db", HERITAGE, 6),
	minecartLocoSD70("ItemRollingStock", "train_sd70", HERITAGE, 10),
	minecartLocoBP4("ItemRollingStock", "train_bp4", HERITAGE, 10),
	minecartHeavyweightFreight("ItemRollingStock", "train_heavyweight_freight", HERITAGE, 10),
	/*minecartLocoEMDF7("ItemRollingStock", "train_emdf7", HERITAGE, 10),
	minecartLocoEMDF3("ItemRollingStock", "train_emdf3", HERITAGE, 10),
	minecartLocoEMDF7B("ItemRollingStock", "train_emdf7b", HERITAGE, 10),
	minecartLocoEMDF3B("ItemRollingStock", "train_emdf3b", HERITAGE, 10),*/
	minecartLocoDD35B("ItemRollingStock", "train_dd35b", HERITAGE, 16),
	minecartLocoWLs40("ItemRollingStock", "train_wls40", HERITAGE, 10),
	minecartRotativeDigger("ItemRotativeDigger","modelrotaryexcavator_icon",10),
	minecartLocoEr("ItemRollingStock", "train_ussr", HERITAGE, 10),
	minecartTenderEr("ItemRollingStock", "train_tender_ussr", HERITAGE, 4),
	minecartTenderC41("ItemRollingStock", "train_tender_c41", HERITAGE, 4),
	minecartLocoC41("ItemRollingStock", "train_c41", HERITAGE, 6),
	minecartLocoC41_080("ItemRollingStock", "train_c41_080", HERITAGE, 6),
	minecartLocoAlcoSC4("ItemRollingStock", "train_alcosc4", HERITAGE, 6),
	minecartLocoC41T("ItemRollingStock", "train_c41t", HERITAGE, 6),
	minecartLocoSouthern1102("ItemRollingStock", "train_southern1102", HERITAGE, 6),
	minecartTenderSouthern1102("ItemRollingStock", "train_southern1102tender", HERITAGE, 3),
	minecartLocoUSATCUS("ItemRollingStock", "train_S100US", HERITAGE, 6),
	minecartLocoUSATCUK("ItemRollingStock", "train_S100UK", HERITAGE, 6),
	//minecartLocoU57("ItemRollingStock","train_",10),
	//minecartTenderU57("ItemRollingStock","train_",10),
	//minecartLocoSD40("ItemRollingStock","train_",10),
	minecartFreightCenterBeam_Empty("ItemRollingStock", "train_freight_empty", HERITAGE, 2),
	minecartFreightCenterBeam_Wood_1("ItemRollingStock", "train_freight_wood_1", HERITAGE, 3),
	minecartFreightCenterBeam_Wood_2("ItemRollingStock", "train_freight_wood_2", HERITAGE, 3),
	minecartFreightTrailer("ItemRollingStock", "train_freight_trailer", HERITAGE, 5),
	minecartFreightWellcar("ItemRollingStock", "train_freight_wellcar", HERITAGE, 5),
	minecartFreightGTNG("ItemRollingStock", "freight_gtng", HERITAGE, 5),
	minecartHeavyweightMailcar("ItemRollingStock", "heavyweight_mailcar", HERITAGE, 5),
	minecartKof_DB("ItemRollingStock", "train_kof", HERITAGE, 10),
	minecartV60_DB("ItemRollingStock", "train_v60", HERITAGE, 10),
	minecartLocoCD151("ItemRollingStock", "train_CD151", HERITAGE, 3),
	minecartE10_DB("ItemRollingStock", "train_e10db", HERITAGE, 10),
	minecartE103("ItemRollingStock", "train_e103", HERITAGE, 10),
	//minecartIC4_DSB_FG("ItemRollingStock", "train_ic4_dsb_fg", HERITAGE,10),
	//minecartIC4_DSB_FH("ItemRollingStock", "train_ic4_dsb_fh", HERITAGE, 10),
	//minecartIC4_DSB_MG("ItemRollingStock", "train_ic4_dsb_mg", HERITAGE, 10),
	minecartGS4_Loco("ItemRollingStock", "GS4_engine", HERITAGE, 10),
	minecartGS4_Passenger("ItemRollingStock", "GS4_passenger", HERITAGE, 10),
	minecartGS4_Baggage("ItemRollingStock", "GS4_baggage", HERITAGE, 10),
	minecartGS4_Observatory("ItemRollingStock", "GS4_observatory", HERITAGE, 10),
	minecartGS4_Tail("ItemRollingStock", "GS4_tail", HERITAGE, 10),
	minecartGS4_Tender("ItemRollingStock", "GS4_tender", HERITAGE, 10),
	minecart4000GallonTender("ItemRollingStock", "4000GallonTender", HERITAGE, 10),
	minecarttenderBerk1225("ItemRollingStock", "BerkshireTender", HERITAGE, 10),
	minecartLocoHallClass("ItemRollingStock", "HallClass", HERITAGE, 3),
	minecartLocoBerk1225("ItemRollingStock", "Berkshire1225", HERITAGE, 3),
	minecartLocoBerk765("ItemRollingStock", "Berkshire765", HERITAGE, 3),
	minecartLocoFowler("ItemRollingStock", "Fowler 4F", HERITAGE, 3),
	minecartFowler4FTender("ItemRollingStock", "Fowler 4F Tender", HERITAGE, 3),
	minecartLocoKingClass("ItemRollingStock", "KingClass", HERITAGE, 3),
	minecartLoco44TonSwitcher("ItemRollingStock", "train_44tonner", HERITAGE, 10),
	minecartDenverRioGrandePassenger("ItemRollingStock", "denverriogrande_passenger", HERITAGE, 10),
	minecartDenverRioGrandeCombo("ItemRollingStock", "denverriogrande_combo", HERITAGE, 10),
	minecartDenverRioGrandeBaggage("ItemRollingStock", "denverriogrande_baggage", HERITAGE, 10),
	//minecartMILW_H1044("ItemRollingStock", "MILW_H1044", 10),
	minecartSlateWagon("ItemRollingStock", "slatewagon", HERITAGE, 10),
	minecartIceWagon("ItemRollingStock", "icewagon", HERITAGE, 10),
	minecartICE1_Loco("ItemRollingStock", "train_ice1", HERITAGE, 10),
	minecartICE1_1stClass("ItemRollingStock", "train_ice1_passenger", HERITAGE, 10),
	minecartICE1_2ndClass("ItemRollingStock", "train_ice1_passenger", HERITAGE, 10),
	minecartICE1_Restaurant("ItemRollingStock", "train_ice1_restaurant", HERITAGE, 10),

	hat_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_hat", 1),
	pants_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_pants", 1),
	jacket_ticketMan_paintable("ItemTCArmor", "armor_ticket_man_jacket", 1),
	hat_driver_paintable("ItemTCArmor", "armor_driver_hat", 1),
	pants_driver_paintable("ItemTCArmor", "armor_driver_pants", 1),
	jacket_driver_paintable("ItemTCArmor", "armor_driver_jacket", 1),

	helmet_suit_paintable("ItemTCArmor", "armor_composite_helmet", 1),
	pants_suit_paintable("ItemTCArmor", "armor_composite_pants", 1),
	boots_suit_paintable("ItemTCArmor", "armor_composite_boots", 1),
	jacket_suit_paintable("ItemTCArmor", "armor_composite_chest", 1),
	reinforcedPlastic("ItemTrain", "item_fiberglass_plate", 10),
	reinforcedPlates("ItemTrain", "item_reinforced_plate", 10),
	composite_wrench("ItemWrench", "item_composite_wrench", 1),

	minecartPassengerHighSpeedCarZeroED("ItemRollingStock", "train_high_speed_cart_zeroed", HERITAGE, 14),
	minecartNYTram("ItemRollingStock", "train_tram_ny", HERITAGE, 7),
	minecartLocoHighSpeedZeroED("ItemRollingStock", "train_high_speed_loco_zeroed", HERITAGE, 17),
	minecartLocoA4Mallard("ItemRollingStock", "train_loco_a4_mallard", HERITAGE, 14),
	minecartLocoA4MallardTender("ItemRollingStock", "train_loco_a4_mallard_tender", HERITAGE, 5),
	minecartLocoC62Class("ItemRollingStock", "train_loco_c62_class", HERITAGE, 14),
	minecartLocoD51Short("ItemRollingStock", "train_loco_d51s", HERITAGE, 14),
	minecartLocoD51Long("ItemRollingStock", "train_loco_d51", HERITAGE, 14),
	minecartTenderC62Class("ItemRollingStock", "train_tender_c62_class", HERITAGE, 5),
	minecartTenderD51("ItemRollingStock", "train_tender_d51", HERITAGE, 5),

	minecartLocoSteamShay("ItemRollingStock", "train_shay", HERITAGE, 4),
	minecartLocoSteamVBShay("ItemRollingStock", "train_vbshay", HERITAGE, 4),
	minecartLocoSteamClimax("ItemRollingStock", "train_climax", HERITAGE, 4),
	minecartLocoSteamPannier("ItemRollingStock", "train_pannier", HERITAGE, 4),
	minecartLocoSteamAdler("ItemRollingStock", "train_adler", HERITAGE, 3),
	minecartLocoSteamAlice("ItemRollingStock", "train_alice", HERITAGE, 3),
	minecartLocoSteamGLYN("ItemRollingStock", "train_glyn", HERITAGE, 3),
	minecartLocoSteam262T("ItemRollingStock", "train_262t", HERITAGE, 3),
	minecartLocoSteam040vb("ItemRollingStock", "train_040VB", HERITAGE, 3),
	minecartLocoBR185("ItemRollingStock", "train_br101", HERITAGE, 3),
	minecartLocoClass85("ItemRollingStock", "train_class85", HERITAGE, 3),
	minecartLocoDeltic("ItemRollingStock", "train_deltic", HERITAGE, 3),
	minecartLocoDD35A("ItemRollingStock", "train_dd35a", HERITAGE, 3),
	minecartLocoSnowPlow("ItemRollingStock", "train_snowplow", HERITAGE, 3),
	minecartLocoEWSClass66("ItemRollingStock", "train_ewsclass66", HERITAGE, 3),
	minecartTenderAdler("ItemRollingStock", "train_tender_adler", HERITAGE, 1),
	minecartPassengerAdler("ItemRollingStock", "train_passenger_adler", HERITAGE, 2),
	minecartLocoFOLM1("ItemRollingStock", "train_fol_m1", HERITAGE, 10),
	minecartKClassRailBox("ItemRollingStock", "train_k_class_railbox", HERITAGE, 2),
	minecartLocoLSSP7("ItemRollingStock", "train_lssp7", HERITAGE, 4),
	minecartLongCoveredHopper("ItemRollingStock", "train_longcoveredhopper", HERITAGE, 3),
	minecartShortCoveredHopper("ItemRollingStock", "train_shortcoveredhopper", HERITAGE, 2),

	minecartPassengerRheingold("ItemRollingStock", "train_passenger_rheingold", HERITAGE, 5),
	minecartPassengerRheingoldDining1("ItemRollingStock", "train_passenger_rheingolddining1", HERITAGE, 5),
	minecartPassengerRheingoldDining2("ItemRollingStock", "train_passenger_rheingolddining2", HERITAGE, 5),
	minecartPassengerRheingoldPanorama("ItemRollingStock", "train_passenger_rheingoldpanorama", HERITAGE, 5),

	minecartPassengerMILW("ItemRollingStock", "train_passenger_milw", HERITAGE, 5),
	minecartPassengerMILWTail("ItemRollingStock", "train_passenger_milw_tail", HERITAGE, 5),
	minecartBaggageMILW("ItemRollingStock", "train_baggage_milw", HERITAGE, 5),
	//minecartPassengerMILWDiner("ItemRollingStock", "train_passenger_milw_diner", 5),
	minecartLocoMILWClassA("ItemRollingStock", "train_milw_class_a", HERITAGE, 7),
	minecartMILWTender("ItemRollingStock", "train_milw_tender", HERITAGE, 5),

	minecartCabooseLogging("ItemRollingStock", "train_logging_caboose", HERITAGE, 1),
	minecartCabooseLoggingPRR("ItemRollingStock", "train_prr_caboose", HERITAGE, 1),
	minecartPassengerTramNY("ItemRollingStock", "train_tram_ny", HERITAGE, 3),

	minecartPassengerDBOriental("ItemRollingStock", "train_passenger_orient", HERITAGE, 2),
	minecartLocoSD40("ItemRollingStock", "train_sd40", HERITAGE, 10),
	zeppelin("ItemZeppelin", "item_zeppelin_one_balloon", 1),


	/** Normal Tracks **/
	//straights
	tcRailSmallStraight("ItemTCRail", "track_straight_1", 5),
	tcRailMediumStraight("ItemTCRail", "track_straight_3", 5),
	tcRailLongStraight("ItemTCRail", "track_straight_6", 5),
	tcRailVeryLongStraight("ItemTCRail", "track_straight_12", 5),

	//turns
	tcRail1X1Turn("ItemTCRail", "track_turn_1", 5),
	tcRailMediumTurn("ItemTCRail", "track_turn_3", 5),
	tcRailLargeTurn("ItemTCRail", "track_turn_5", 5),
	tcRailVeryLargeTurn("ItemTCRail", "track_turn_10", 5),
	tcRailSuperLargeTurn("ItemTCRail", "track_turn_16", 5),
	tcRail29X29Turn("ItemTCRail", "track_turn_29", 5),
	tcRail32X32Turn("ItemTCRail", "track_turn_32", 5),

	//45 degree turns
	tcRailMedium45DegreeTurn("ItemTCRail", "track_45degree_turn_3x4", 5),
	tcRailLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_3x6", 5),
	tcRailVeryLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_4x8", 5),
	tcRailSuperLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_5x11", 5),
	tcRail45DegreeTurn9x20("ItemTCRail", "track_45degree_turn_9x20", 5),
	tcRail45DegreeTurn10x22("ItemTCRail", "track_45degree_turn_10x22", 5),

	//parallel curves / s curves
	tcRailSmallParallelCurve("ItemTCRail", "track_s-curve_2x8", 3),
	tcRailMediumParallelCurve("ItemTCRail", "track_s-curve_3x12", 3),
	tcRailLargeParallelCurve("ItemTCRail", "track_s-curve_4x16", 3),
	tcRail20x2SCurve("ItemTCRail", "track_s-curve_2x20", 3),

	//switches
	tcRailMediumSwitch("ItemTCRail", "track_switch_4x4", 5),
	tcRailLargeSwitch("ItemTCRail", "track_switch_6x6", 5),
	tcRailVeryLargeSwitch("ItemTCRail", "track_switch_11x11", 5),

	tcRailMediumParallelSwitch("ItemTCRail", "track_switch_p_4x11", 5),
	tcRailLargeParallelSwitch("ItemTCRail", "track_switch_p_4x17", 5),

	tcRailMedium45DegreeSwitch("ItemTCRail","track_switch_45degree_3x5", 5),
	tcRailLarge45DegreeSwitch("ItemTCRail", "track_switch_45degree_4x8", 5),

	//diamonds
	tcRailTwoWaysCrossing("ItemTCRail","track_plus_crossing",5),
	tcRailDiamondCrossing("ItemTCRail", "track_x_crossing", 5),
	tcRailDoubleDiamondCrossing("ItemTCRail", "track_double_x_crossing", 5),
	tcRailFourWaysCrossing("ItemTCRail", "track_xplus_crossing", 5),

	//1x3 slope
	tcRail1X3SlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

	//1x6 slopes
	tcRailSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
	tcRailSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

	//1x12 slopes
	tcRailLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailLargeSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
	tcRailLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

	//1x18 slopes
	tcRailVeryLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
	tcRailVeryLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
	tcRailVeryLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
	tcRailVeryLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
	tcRailVeryLargeSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
	tcRailVeryLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),


	/** Sleeperless Tracks **/
	//straights
	tcRailEmbeddedSmallStraight("ItemTCRail", "track_straight_1_e", 5),
	tcRailEmbeddedMediumStraight("ItemTCRail", "track_straight_3_e", 5),
	tcRailEmbeddedLongStraight("ItemTCRail", "track_straight_6_e", 5),
	tcRailEmbeddedVeryLongStraight("ItemTCRail", "track_straight_12_e", 5),

	//turns
	tcRailEmbedded1X1Turn("ItemTCRail", "track_turn_1_e", 5),
	tcRailEmbeddedMediumTurn("ItemTCRail", "track_turn_3_e", 5),
	tcRailEmbeddedLargeTurn("ItemTCRail", "track_turn_5_e", 5),
	tcRailEmbeddedVeryLargeTurn("ItemTCRail", "track_turn_10_e", 5),
	tcRailEmbeddedSuperLargeTurn("ItemTCRail", "track_turn_16_e", 5),
	tcRailEmbedded29X29Turn("ItemTCRail", "track_turn_29_e", 5),
	tcRailEmbedded32X32Turn("ItemTCRail", "track_turn_32_e", 5),

	//45 degree turns
	tcRailEmbeddedMedium45DegreeTurn("ItemTCRail", "track_45degree_turn_3x4_e", 5),
	tcRailEmbeddedLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_3x6_e", 5),
	tcRailEmbeddedVeryLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_4x8_e", 5),
	tcRailEmbeddedSuperLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_5x11_e", 5),
	tcRailEmbedded45DegreeTurn9x20("ItemTCRail", "track_45degree_turn_9x20_e", 5),
	tcRailEmbedded45DegreeTurn10x22("ItemTCRail", "track_45degree_turn_10x22_e", 5),

	//parallel curves / s curves
	tcRailEmbeddedSmallParallelCurve("ItemTCRail", "track_s-curve_2x8_e", 3),
	tcRailEmbeddedMediumParallelCurve("ItemTCRail", "track_s-curve_3x12_e", 3),
	tcRailEmbeddedLargeParallelCurve("ItemTCRail", "track_s-curve_4x16_e", 3),
	tcRailEmbedded20x2SCurve("ItemTCRail", "track_s-curve_2x20_e", 3),

	//switches
	tcRailEmbeddedMediumSwitch("ItemtcRailEmbedded", "track_switch_4x4_e", 5),
	tcRailEmbeddedLargeSwitch("ItemtcRailEmbedded", "track_switch_6x6_e", 5),
	tcRailEmbeddedVeryLargeSwitch("ItemtcRailEmbedded", "track_switch_11x11_e", 5),

	tcRailEmbeddedMediumParallelSwitch("ItemtcRailEmbedded", "track_switch_p_4x11_e", 5),
	tcRailEmbeddedLargeParallelSwitch("ItemtcRailEmbedded", "track_switch_p_4x17_e", 5),

	tcRailEmbeddedMedium45DegreeSwitch("ItemtcRailEmbedded","track_switch_45degree_3x5_e", 5),
	tcRailEmbeddedLarge45DegreeSwitch("ItemtcRailEmbedded", "track_switch_45degree_4x8_e", 5),

	//diamonds
	tcRailEmbeddedTwoWaysCrossing("ItemtcRailEmbedded","track_plus_crossing_e",5),
	tcRailEmbeddedDiamondCrossing("ItemtcRailEmbedded", "track_x_crossing_e",5),
	tcRailEmbeddedDoubleDiamondCrossing("ItemtcRailEmbedded", "track_double_x_crossing_e",5),
	tcRailEmbeddedFourWaysCrossing("ItemtcRailEmbedded", "track_xplus_crossing_e",5),

	//slopes
	tcRailEmbedded1x3SlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
	tcRailEmbeddedSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
	tcRailEmbeddedLargeSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
	tcRailEmbeddedVeryLargeSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),

	//road crossings
	tcRailSmallRoadCrossing("ItemTCRail", "item_rail_small_road_crossing", 5),
	tcRailSmallRoadCrossing1("ItemTCRail", "item_rail_small_road_crossing_1", 5),
	tcRailSmallRoadCrossing2("ItemTCRail", "item_rail_small_road_crossing_2", 5),
	tcRailSmallRoadCrossingDynamic("ItemTCRail", "item_rail_small_road_crossing_dynamic", 5),



	//some heritage model attempts. will likey be removed in the future
	//minecartCF7_H_Angle("ItemRollingStock", "cf7angle", DIESEL, 10),
	//minecartCF7_H_Round("ItemRollingStock", "cf7round", DIESEL, 10),


	/** FoxTC **/
	remoteController("ItemRemoteController", "remote_controller", 4),
	remoteControllerModule("ItemRemoteControllerModule", "remote_controller_module", 4),
	//signalPairingDevice("ItemSignalPairingDevice", "signal_pairing_device", 14),

	//stEAmeeee//
	minecartClimaxNew("ItemRollingStock", "train_climax2", STEAM, 5),
	minecartVBShay2("ItemRollingStock", "vbshay2", STEAM, 5),
	minecartSkook("ItemRollingStock", "skookum", STEAM, 5),
	minecartSkookTender("ItemRollingStock", "skookum_tender", STEAM, 4),
	minecartShay3Truck("ItemRollingStock", "3TruckShay", STEAM, 5),
	minecartShay3TruckTender("ItemRollingStock", "3TruckShayTender", STEAM, 4),
	minecartClimaxB("ItemRollingStock", "climaxb", STEAM, 3),

	minecartF01("ItemRollingStock", "f01", STEAM, 3),
	minecartP01a("ItemRollingStock", "p01a", STEAM, 4),
	minecartVanderbackTender("ItemRollingStock", "vanderbacktender", STEAM, 2),
	minecartSquanderbackTender("ItemRollingStock", "squanderbacktender", STEAM, 2),

	minecartBKno2a("ItemRollingStock", "bkno2", STEAM, 3),
	minecartBKno2b("ItemRollingStock", "bkno2", STEAM, 3),
	minecartWCPBuckingBull("ItemRollingStock", "wcp_buckingbull", STEAM, 4),
	minecartWCPBaler("ItemRollingStock", "wcp_baler", STEAM, 2),
	minecartWCPMacky("ItemRollingStock", "wcp_macky", STEAM, 4),

	minecartalco2102("ItemRollingStock", "2-10-2st_icon", STEAM, 4),
	minecartMK60("ItemRollingStock", "mk60-71_icone", STEAM, 4),
	minecartTender10k("ItemRollingStock", "10ktender_icon", STEAM, 2),
	minecartTenderDeseret("ItemRollingStock", "deseret_tender_icon", STEAM, 2),

	minecartHCS_9k_Tender("ItemRollingStock", "HCS_9k_Tender_icon", STEAM, 2),

	minecartLocoC11("ItemRollingStock", "train_C11", STEAM, 5),
	minecartOnion("ItemRollingStock", "Onion", STEAM, 10),
	minecartOnionTender("ItemRollingStock", "OnionTender", STEAM, 10),
	minecartNP_L9("ItemRollingStock", "NP_L-9", STEAM, 3),
	minecartNP_11C_tender("ItemRollingStock", "NP_11c-12c_tender", STEAM, 3),
	minecartNP_13C_tender("ItemRollingStock", "NP_13c_tender", STEAM, 3),
	minecartAlco460("ItemRollingStock", "4-6-0_icon", STEAM, 4),
	minecartTender460("ItemRollingStock", "4-6-0_tender_icon", STEAM, 3),

	minecartPELocomotive("ItemRollingStock", "PELocoIcon", STEAM,  5),
	minecartPETender("ItemRollingStock", "PETenderIcon", STEAM,3),
	minecartPMNstender("ItemRollingStock", "PMNstenderIcon", STEAM,3),
	minecartPMNandN1("ItemRollingStock", "PMNandN1Icon", STEAM,  7),

	minecartAlco0_6_0T("ItemRollingStock", "Alco0_6_0T", STEAM, 5),
	minecartBrank("ItemRollingStock", "Brank", STEAM, 5),
	minecartLima2_8_0("ItemRollingStock", "Lima2-8-0", STEAM, 4),
	minecartTenderLima2_8_0("ItemRollingStock", "TenderLima2-8-0", STEAM, 3),

	//EMD//
	minecartF3A( "ItemRollingStock", "f3a", DIESEL, 4),
	minecartF3B( "ItemRollingStock", "f3b", DIESEL, 4),
	minecartF7A("ItemRollingStock", "f7a", DIESEL, 4),
	minecartF7B("ItemRollingStock", "f7b", DIESEL, 4),
	minecartF9A( "ItemRollingStock", "f9a", DIESEL, 5),
	minecartF9B( "ItemRollingStock", "f9b", DIESEL, 5),
	minecartFP7A("ItemRollingStock", "fp7a", DIESEL, 4),
	minecartFP9A("ItemRollingStock", "fp9a", DIESEL, 5),
	//minecartBUnitF7B("ItemRollingStock", "f7b", 5),
	minecartCF7angle("ItemRollingStock", "cf7angle", DIESEL, 3),
	minecartCF7round("ItemRollingStock", "cf7round", DIESEL, 3),
	minecartCF7round3("ItemRollingStock", "cf7round3", DIESEL, 3),
	minecartCF7angle2("ItemRollingStock", "cf7dbrr", DIESEL, 2),
	minecartCF7angle3("ItemRollingStock", "cf7angle3", DIESEL, 3),
	minecartCF7hh("ItemRollingStock", "cf7highhood", DIESEL, 2),
	minecartF40PH("ItemRollingStock", "f40ph", DIESEL, 5),

	minecartE7A("ItemRollingStock", "e7a", DIESEL,5),
	minecartE7B("ItemRollingStock", "e7b", DIESEL,5),
	//minecartBUnitE7B("ItemRollingStock", "e7b",5),
	minecartE8A( "ItemRollingStock", "e8a", DIESEL, 5),
	minecartE8B( "ItemRollingStock", "e8b", DIESEL, 5),
	//minecartBUnitE8B( "ItemRollingStock", "e8b", 5),
	minecartE9A( "ItemRollingStock", "e9a", DIESEL, 5),
	minecartE9B( "ItemRollingStock", "e9b", DIESEL, 5),
	minecartCE8( "ItemRollingStock", "ce8", DIESEL, 4),

	minecartGP7("ItemRollingStock", "gp7", DIESEL, 3),
	minecartGP7b("ItemRollingStock", "gp7b", DIESEL, 3),
	//minecartBUnitGP7b("ItemRollingStock", "gp7b", 4),
	minecartGP7u("ItemRollingStock", "gp7u", DIESEL, 3),
	minecartGP7f("ItemRollingStock", "gp7f", DIESEL, 3),
	minecartGPFDL("ItemRollingStock", "gpfdl", DIESEL, 4),
	minecartGP9("ItemRollingStock", "gp9", DIESEL, 3),
	minecartGP9b("ItemRollingStock", "gp9b", DIESEL, 3),
	minecartGP13("ItemRollingStock", "gp13", DIESEL, 3),
	minecartGP15("ItemRollingStock", "gp15", DIESEL, 3),
	minecartGP18("ItemRollingStock", "gp18", DIESEL, 3),
	minecartGP30("ItemRollingStock", "gp30", DIESEL, 4),
	minecartGP35("ItemRollingStock", "gp35", DIESEL, 4),
	minecartGP38dash9W("ItemRollingStock", "gp38dash9w", DIESEL, 3),
	minecartGP38h3("ItemRollingStock", "gp38h3icon", DIESEL, 4),
	minecartGP38("ItemRollingStock", "gp38", DIESEL, 4),
	minecartGP38dash2("ItemRollingStock", "gp38dash2", DIESEL, 4),
	minecartGP39("ItemRollingStock", "gp39", DIESEL, 4),
	minecartGP39Dash2("ItemRollingStock", "gp39dash2", DIESEL, 4),
	minecartGP39TDash2("ItemRollingStock", "gp39t", DIESEL, 4),
	minecartGP39TDash2B("ItemRollingStock", "gp39tb", DIESEL, 4),
	minecartGP40("ItemRollingStock", "gp40", DIESEL, 4),
	minecartGP40Dash2("ItemRollingStock", "gp40dash2", DIESEL, 4),
	minecartGP40tc("ItemRollingStock", "gp40tcicon", DIESEL, 4),
	minecartGP49("ItemRollingStock", "gp49", DIESEL, 5),

	minecartSD9("ItemRollingStock", "sd9", DIESEL, 3),
	minecartSDL39("ItemRollingStock", "SDL39", DIESEL, 4),
	minecartSD38("ItemRollingStock", "sd38", DIESEL, 4),
	minecartSD39("ItemRollingStock", "sd39", DIESEL, 4),
	minecartSD40("ItemRollingStock", "sd40", DIESEL, 4),
	minecartSD40dash2("ItemRollingStock", "sd40dash2", DIESEL, 4),
	minecartSD40T2("ItemRollingStock", "sd40t2", DIESEL, 4),
	minecartSD40dash2B("ItemRollingStock", "sd40dash2b", DIESEL, 4),
	minecartSD40R("ItemRollingStock", "sd40r", DIESEL, 4),
	minecartSD40A("ItemRollingStock", "sd40a", DIESEL, 4),
	minecartSDP40("ItemRollingStock", "sdp40icon", DIESEL,5),
	minecartSDP40F("ItemRollingStock","sdp40f", DIESEL,5),
	minecartSD40dash3("ItemRollingStock", "sd40dash3", DIESEL, 4),
	minecartSD45dash2("ItemRollingStock", "sd45", DIESEL, 5),
	minecartSD45dash2B("ItemRollingStock", "sd45dash2b", DIESEL, 5),
	minecartSDP45("ItemRollingStock", "sdp45_iconograhy", DIESEL, 5),
	minecartF45("ItemRollingStock", "f45", DIESEL, 5),
	minecartFP45("ItemRollingStock", "fp45", DIESEL, 5),
	minecartSD50("ItemRollingStock", "sd50_icno", DIESEL, 5),
	minecartSD60("ItemRollingStock", "sd60icone", DIESEL, 6),
	minecartSD70Mac("ItemRollingStock", "sd70mac", DIESEL, 6),
	minecartSD70ACe("ItemRollingStock", "sd70ace", DIESEL, 6),
	minecartSD70ACe_H("ItemRollingStock", "sd70ace_h", DIESEL, 6),

	minecartSW1("ItemRollingStock","sw1", DIESEL, 2),
	minecartSW8("ItemRollingStock", "train_sw8", DIESEL, 3),
	minecartSW9("ItemRollingStock", "sw9", DIESEL, 3),
	minecartSW10("ItemRollingStock", "sw10", DIESEL, 3),
	minecartSW900("ItemRollingStock", "sw900", DIESEL, 3),
	minecartSW1000("ItemRollingStock", "sw1000", DIESEL, 3),
	minecartSW1200("ItemRollingStock","sw1200", DIESEL, 4),
	minecartSW1500("ItemRollingStock", "sw1500", DIESEL, 4),
	minecartSW1600("ItemRollingStock", "sw1600", DIESEL, 4),
	minecartMP900("ItemRollingStock", "mp900", DIESEL, 4),
	minecartMP15DCW9("ItemRollingStock", "mp15dcw9", DIESEL, 4),

	minecartTR4("ItemRollingStock","tr4", DIESEL, 3),
	minecartTR4B("ItemRollingStock","tr4b", DIESEL, 3),

	minecartBeep("ItemRollingStock", "BeepIcon", DIESEL, 2),

	//GE//
	minecart44Ton("ItemRollingStock", "44-tonner_icon", DIESEL, 2),
	minecartBoxcab23Ton("ItemRollingStock", "boxcab", DIESEL, 2),
	minecart25Ton("ItemRollingStock", "25-tonner_icon", DIESEL, 2),

	minecartU18B("ItemRollingStock", "U18B", DIESEL, 3),
	minecartU18BB("ItemRollingStock", "U18BB", DIESEL, 3),
	minecartU18BW("ItemRollingStock", "U18BW", DIESEL, 3),
	minecartU18Balt("ItemRollingStock", "U18Balt", DIESEL, 3),
	minecartU18BWH("ItemRollingStock", "u18bwh", DIESEL, 3),
	minecartU23B("ItemRollingStock", "u23b", DIESEL, 4),
	minecartU23BU("ItemRollingStock", "u23bu", DIESEL, 4),
	minecartU23BW("ItemRollingStock", "u23bw", DIESEL, 4),
	minecartSF30B("ItemRollingStock", "sf30b", DIESEL, 4),
	minecartU25B("ItemRollingStock", "u25b", DIESEL, 4),
	minecartU30BH("ItemRollingStock", "u30bh", DIESEL, 4),
	minecartU36B("ItemRollingStock", "u36b", DIESEL, 5),
	minecartU23C("ItemRollingStock", "u23c", DIESEL, 4),
	minecartU30C("ItemRollingStock", "u30c", DIESEL, 4),
	minecartSF30C("ItemRollingStock", "sf30c", DIESEL, 5),
	minecartU36C( "ItemRollingStock", "u36c", DIESEL, 5),
	minecartU50("ItemRollingStock", "u50", DIESEL, 6),
	minecartU56("ItemRollingStock", "u56", DIESEL, 6),

	minecartSB18R("ItemRollingStock", "sb18r", DIESEL, 3),
	minecartSB18E("ItemRollingStock", "sb18e", DIESEL, 3),
	minecartSB18B("ItemRollingStock", "sb18b", DIESEL, 3),
	minecartB23("ItemRollingStock", "b23", DIESEL, 4),
	minecartB23_wrx("ItemRollingStock", "b23_wrx", DIESEL, 4),
	minecartB23S7("ItemRollingStock", "b23s7", DIESEL, 4),
	minecartBQ23("ItemRollingStock", "bq23", DIESEL, 4),
	minecartSB23R("ItemRollingStock", "sb23r", DIESEL, 4),
	minecartSB23E("ItemRollingStock", "sb23e", DIESEL, 4),
	minecartB30("ItemRollingStock", "b30", DIESEL, 4),
	minecartB36("ItemRollingStock", "b36", DIESEL, 4),
	minecartSB36X("ItemRollingStock", "sb36x", DIESEL, 5),

	minecartDash818BE("ItemRollingStock", "B18-8E", DIESEL, 3),
	minecartDash832BWH("ItemRollingStock", "B32-8WH", DIESEL, 4),
	minecartDash839C("ItemRollingStock", "c39-8_icon", DIESEL, 5),
	minecartDash839CE("ItemRollingStock", "c39-8e", DIESEL, 5),
	minecartDash839B("ItemRollingStock", "b39-8_icone", DIESEL, 5),
	minecartDash840B("ItemRollingStock", "B40-8", DIESEL, 5),
	minecartDash840BB("ItemRollingStock", "B40-8B", DIESEL, 5),
	//minecartBUnitDash840BB("ItemRollingStock", "B40-8B", 4),
	minecartDash840BW("ItemRollingStock", "B40-8W", DIESEL, 5),
	minecartDash840C("ItemRollingStock", "C40-8", DIESEL, 5),
	minecartDash841C("ItemRollingStock", "c41-8", DIESEL, 5),

	minecartDash940C("ItemRollingStock", "d940c", DIESEL, 5),
	minecartDash944CW("ItemRollingStock", "d944cw", DIESEL, 5),
	minecartAC4400CW("ItemRollingStock", "ac4400cw", DIESEL, 5),
	minecartAC4400C("ItemRollingStock", "ac44c_iconographie", DIESEL, 5),

	minecartES44("ItemRollingStock", "es44", DIESEL, 6),
	minecartES44h("ItemRollingStock", "es44h", DIESEL, 6),
	minecartP32("ItemRollingStock", "geGenesis2", DIESEL, 5),
	minecartGeGenesis("ItemRollingStock", "geGenesis3", DIESEL, 5),
	minecartP42("ItemRollingStock", "geGenesis", DIESEL, 5),

	minecart4ED172T("ItemRollingStock", "4ed172t", DIESEL, 3),
	minecart4ED172T_E("ItemRollingStock", "4ed172t_e", DIESEL, 3),
	minecart4ED172T_G("ItemRollingStock", "4ed172t_g", DIESEL, 3),
	minecart4ED172T_C("ItemRollingStock", "4ed172t_c", DIESEL, 3),

	//ALCO and its canookistanian counterpart//
	minecartAlcoPA1("ItemRollingStock", "AlcoPA1Icon", DIESEL,5),
	minecartAlcoPB1("ItemRollingStock", "AlcoPB1Icon", DIESEL,4),
	minecartFA1("ItemRollingStock", "FA1", DIESEL,4),
	minecartFB1("ItemRollingStock", "FB1", DIESEL,3),
	minecartFA2("ItemRollingStock", "FA2", DIESEL,4),
	minecartFB2("ItemRollingStock", "FB2", DIESEL,3),
	minecartFPA4("ItemRollingStock", "FPA4", DIESEL,4),
	minecartFPB4("ItemRollingStock", "FPB4", DIESEL,3),
	minecartFAFDL("ItemRollingStock", "FAFDL", DIESEL,4),
	minecartFBFDL("ItemRollingStock", "FBFDL", DIESEL,4),

	minecartRS1("ItemRollingStock", "RS-1", DIESEL, 2),
	minecartRS2("ItemRollingStock", "RS-2", DIESEL, 2),
	minecartRS3("ItemRollingStock", "RS-3", DIESEL, 3),
	minecartRSFDL("ItemRollingStock", "RSFDL", DIESEL, 4),

	minecartC415H("ItemRollingStock", "c415h", DIESEL, 4),
	minecartC415S("ItemRollingStock", "c415s", DIESEL, 4),
	minecartC415L("ItemRollingStock", "c415l", DIESEL, 4),
	minecartC424("ItemRollingStock", "c424", DIESEL, 5),
	minecartC425("ItemRollingStock", "c425", DIESEL, 5),
	minecartDH643("ItemRollingStock", "DH643", DIESEL, 5),
	minecartC855a("ItemRollingStock", "c855a", DIESEL, 6),
	minecartC855b("ItemRollingStock", "c855b", DIESEL, 6),

	minecartM420("ItemRollingStock", "M420", DIESEL, 4),
	minecartM420B("ItemRollingStock", "M420B", DIESEL, 4),

	minecartM630("ItemRollingStock", "M630", DIESEL, 5),
	minecartM630R("ItemRollingStock", "M630_round", DIESEL, 5),
	minecartM630W("ItemRollingStock", "M630W", DIESEL, 5),
	minecartM636("ItemRollingStock", "M636_divit", DIESEL, 5),
	minecartM636R("ItemRollingStock", "M636", DIESEL, 5),
	minecartM640("ItemRollingStock", "M640", DIESEL, 6),
	minecartM640W("ItemRollingStock", "M640W", DIESEL, 6),

	minecartHH660("ItemRollingStock", "hh660", DIESEL, 2),
	minecartS2("ItemRollingStock", "alco_s2", DIESEL, 2),

	minecartRSD15("ItemRollingStock","RSD15_Icon", DIESEL, 4),

	//BRuhMOMent//
	minecartVO1000("ItemRollingStock", "vo1000", DIESEL, 2),
	minecartS12("ItemRollingStock", "s12", DIESEL, 3),
	minecartDS441000("ItemRollingStock", "ds441000", DIESEL, 3),
	minecartDR441500Phase2("ItemRollingStock", "DR441500Phase2", DIESEL,4),
	minecartDR441500BPhase2("ItemRollingStock", "DR441500BPhase2", DIESEL,4),
	minecartDR441500Shark("ItemRollingStock", "DR441500Shark", DIESEL,4),
	minecartDR441500BShark("ItemRollingStock", "DR441500BShark", DIESEL,4),
	minecartRF16("ItemRollingStock", "RF16", DIESEL,4),
	minecartRF16B("ItemRollingStock", "RF16B", DIESEL,4),

	//Fairbanks Morse//
	minecartH1044("ItemRollingStock", "h1044", DIESEL, 4),
	minecartH16_66("ItemRollingStock", "H16-66", DIESEL, 5),
	minecartH24_66("ItemRollingStock", "H24-66", DIESEL, 5),
	minecartH24_66L("ItemRollingStock", "H24-66L", DIESEL, 5),
	minecartH24_66C("ItemRollingStock", "H24-66C", DIESEL, 5),

	//other MOtOEr Shuite//
	minecartNRE3gs21b("ItemRollingStock", "3gs21b", DIESEL, 4),
	minecartgtavthing("ItemRollingStock", "gtavthing", DIESEL, 7),
	minecartFOLM1B("ItemRollingStock", "folm1b", DIESEL, 9),
	//minecartBUnitFOLM1B("ItemRollingStock", "folm1b", 4),
	minecartKrautt("ItemRollingStock", "ML4000", DIESEL, 5),
	//minecartILMC("ItemRollingStock", "ILMC_ICON", 2),
	minecartDD55("ItemRollingStock", "dd55", DIESEL, 3),
	minecartTB27("ItemRollingStock", "tb27", DIESEL, 4),

	minecartSlugMA("ItemRollingStock", "slugma", DIESEL, 2),
	minecartF7BSlug("ItemRollingStock", "f7b", DIESEL, 3),
	minecartSMSC1("ItemRollingStock", "smsc1", DIESEL, 5),
	minecartCEEslug("ItemRollingStock", "ceeslug", DIESEL, 4),
	minecartSBMS("ItemRollingStock", "sbms", DIESEL, 4),

	//E-lect-trock//
	minecartEF1("ItemRollingStock", "ef1", ELECTRIC, 6),
	minecartEF1B("ItemRollingStock", "ef1b", ELECTRIC, 5),
	minecartEP1A("ItemRollingStock", "ep1a", ELECTRIC, 6),

	minecartGM6C("ItemRollingStock", "GM6C_Icon", ELECTRIC, 5),

	//minecartILMA("ItemRollingStock", "I.L.MA_icon", 2),
	//minecartILMB("ItemRollingStock", "I.L.M.B", 2),
	minecartJT7("ItemRollingStock", "jt7", ELECTRIC, 8),

	minecartAEM7("ItemRollingStock", "aem7", ELECTRIC, 8),

	minecartB_BEL("ItemRollingStock", "b_bel", ELECTRIC, 5),

	//FrERf//
	minecartRoundHopper("ItemRollingStock", "train_RoundHopper", FREIGHT, 2),
	minecartRibbedHopper("ItemRollingStock", "ribbed_hopper", FREIGHT, 2),
	minecartHopper5201("ItemRollingStock", "Hopper5201", FREIGHT, 4),
	minecartHopper6260("ItemRollingStock", "Hopper6260", FREIGHT, 5),
	minecartFNCC2375Hopper("ItemRollingStock", "FNCCHopper", FREIGHT, 3),
	minecartPDH2800("ItemRollingStock", "pdh2800", FREIGHT, 3),
	minecartACF2Bay("ItemRollingStock", "ACF2Bay", FREIGHT, 3),
	minecartACF4650("ItemRollingStock", "ACF4650", FREIGHT, 4),
	minecartPS2_4750("ItemRollingStock", "PS2_4750", FREIGHT, 4),
	minecartGATC4180Airslide("ItemRollingStock", "Airslide_phase_1b", FREIGHT, 4),
	minecartACF3500("ItemRollingStock", "ACF_3500_icon", FREIGHT, 4),
	minecartACF3960("ItemRollingStock", "ACF_3960_icon", FREIGHT, 4),

	minecart60centerbeam("ItemRollingStock", "60centerbeam", FREIGHT, 3),
	minecart66centerbeam("ItemRollingStock", "66centerbeam", FREIGHT, 3),
	minecart73centerbeam("ItemRollingStock", "73centerbeam", FREIGHT, 4),
	minecartGSI60FootBulkhead("ItemRollingStock", "gsi_bulky", FREIGHT, 4),
	minecartGSC60FootFlatcar("ItemRollingStock", "gsc_flatass", FREIGHT, 3),
	minecartthrall63centerbeam("ItemRollingStock", "63centerbeam", FREIGHT, 3),
	minecartFNCC60FootBulk("ItemRollingStock", "FNCC60FootBulk", FREIGHT, 3),
	minecartGSC53FootFlatcar("ItemRollingStock", "gsc_53_flat", FREIGHT, 3),
	minecartGSC5366FootBulkhead("ItemRollingStock", "gsc_53_66bulkhead", FREIGHT, 3),
	minecartGSC5386FootBulkhead("ItemRollingStock", "gsc_53_86bulkhead", FREIGHT, 3),
	minecartMaPa35FootFlatcar("ItemRollingStock", "MaPa_35_flat", FREIGHT, 3),


	minecartPS140("ItemRollingStock", "ps140", FREIGHT, 3),
	minecartPS150("ItemRollingStock", "ps150", FREIGHT,4),
	minecartPS160("ItemRollingStock", "ps160", FREIGHT,5),
	minecartOWO60Verticube("ItemRollingStock", "owocube", FREIGHT, 6),
	minecartMILW40boxcar("ItemRollingStock", "milw40", FREIGHT, 3),
	minecart40highcube("ItemRollingStock", "40highcube", FREIGHT, 3),
	minecarthicube60foot("ItemRollingStock", "hicube60", FREIGHT, 5),
	minecartReefer64("ItemRollingStock", "Reefer64", FREIGHT, 5),
	minecartFNCC50Foot("ItemRollingStock", "FNCC50Foot", FREIGHT, 4),
	minecartGN40("ItemRollingStock", "gn40", FREIGHT, 3),
	minecartR70Reefer("ItemRollingStock", "r70", FREIGHT, 4),
	minecartR70Reefer2("ItemRollingStock", "r70_2", FREIGHT, 4),
	minecartNSCchildHUH("ItemRollingStock", "NSC_3294_mechanical_reefer", FREIGHT, 2),
	minecartPCF6033("ItemRollingStock", "6033_Icon", FREIGHT, 5),
	minecartPCF_RBL_Smooth("ItemRollingStock", "PCF_RBL_smooth_side_plug_door", FREIGHT, 4),
	minecartPCF_RBL_Ribbed("ItemRollingStock", "PCF_RBL_Exterior_post_plug_door", FREIGHT, 4),
	minecartPCF_B100("ItemRollingStock", "pcf_b_100_40_icon", FREIGHT, 4),
	minecartACFRailbox("ItemRollingStock", "ACFRailbox", FREIGHT, 5),
	minecartACFRailboxCushioned("ItemRollingStock", "ACFRailboxCushioned", FREIGHT, 5),
	minecartEvans5100("ItemRollingStock", "Evans_5100_icon", FREIGHT, 5),
	minecart1912WoodBoxcar("ItemRollingStock", "1912WoodBoxcar", FREIGHT, 3),
	minecartPS_40t_ss_box("ItemRollingStock", "PS_40t_ss_box_icon", FREIGHT, 3),
	minecartSP_B50("ItemRollingStock", "SP_B50_icon", FREIGHT, 3),
	minecartPFEr_40_23Reefer("ItemRollingStock", "PFEr_40_23Reefer_icon", FREIGHT, 4),

	minecartVersaLongi("ItemRollingStock", "versalongi", FREIGHT, 4),
	minecartVersaTrans("ItemRollingStock", "versatrans", FREIGHT, 4),
	minecartMillGondola("ItemRollingStock", "millgondola", FREIGHT, 4),
	minecartWoodchipHopper("ItemRollingStock", "woodchiphopper", FREIGHT, 4),
	minecartOreJenny("ItemRollingStock", "orejenny", FREIGHT, 2),
	minecartPRRGLaHopper("ItemRollingStock", "PRRGLaHopper", FREIGHT, 2),
	minecartACF41Gon("ItemRollingStock", "ACF_41_6_gon", FREIGHT, 3),
	minecartBethgonII("ItemRollingStock", "Bethgon_icon", FREIGHT, 5),
	minecart67millgon("ItemRollingStock", "gsco_67millgon_icon", FREIGHT, 4),
	minecart52millgon("ItemRollingStock", "gsco_52millgon_icon", FREIGHT, 4),
	minecartAAR50TonHopper("ItemRollingStock", "AAR50TonHopper", FREIGHT, 2),
	minecartAAR70TonHopper("ItemRollingStock", "AAR70TonHopper", FREIGHT, 3),
	minecartMaPa35FootGondola("ItemRollingStock", "MaPa_35_gondola", FREIGHT, 3),


	minecart11000DOT111("ItemRollingStock", "11000DOT", FREIGHT, 4),
	minecart20600DOT111("ItemRollingStock", "20600DOT", FREIGHT, 5),
	minecart29080DOT111("ItemRollingStock", "29080DOT", FREIGHT, 5),
	minecart17600DOT111("ItemRollingStock", "17600DOT", FREIGHT, 4),
	minecartNATX30600("ItemRollingStock", "natx30600", FREIGHT, 5),
	minecartgatc10000("ItemRollingStock", "gatc10000", FREIGHT, 3),
	minecartDUPX39200("ItemRollingStock", "dupx39200", FREIGHT, 6),

	minecartCoffinCar("ItemRollingStock", "CoffinCar", FREIGHT, 1),
	minecartSkeletonLogCar("ItemRollingStock", "Skeleton", FREIGHT, 1),
	minecartEarlyFlat("ItemRollingStock", "EarlyFlat", FREIGHT, 1),

	minecartGunderson89ftAutorack("ItemRollingStock", "gunderson_autorack", FREIGHT, 7),
	minecartGunderson89ftFlat("ItemRollingStock", "gunderson_flat", FREIGHT, 2),
	minecartStampedeRack("ItemRollingStock", "stampede", FREIGHT, 3),
	minecartHuskyStackWellcar("ItemRollingStock", "huskystack", FREIGHT, 3),

	minecartIngotPig("ItemRollingStock", "pigiron", FREIGHT, 3),
	minecartSteelSlabFlat("ItemRollingStock", "steelflat", FREIGHT, 3),

	//pAssenger//
	minecartPCH120Commute("ItemRollingStock", "pch120", PASSENGER, 4),
	minecartPCH120Car("ItemRollingStock", "pch120car", PASSENGER, 3),

	minecartPCH130Commute2("ItemRollingStock", "pch130commute2", PASSENGER, 4),
	minecartPCH130Car2("ItemRollingStock", "pch130coach", PASSENGER, 3),

	minecartPSRPO("ItemRollingStock", "PSRPOIcon", PASSENGER, 3),
	minecartPS85Baggage("ItemRollingStock", "PS_85_baggage_icon", PASSENGER, 3),
	minecartPScombine("ItemRollingStock", "PScombine", PASSENGER, 3),
	minecartPS52seatCoach("ItemRollingStock", "PS52seatCoach", PASSENGER, 3),
	minecartPSDamnitAnotherDiner("ItemRollingStock", "PScenterDiner2", PASSENGER, 3),
	minecartPSSleeper565("ItemRollingStock", "PS10-6Sleeper", PASSENGER, 3),
	minecartPSSleeper565DRGW("ItemRollingStock", "PS6-5-5Sleeper_icon", PASSENGER, 3),
	minecartPSLunchCounter_Lounge("ItemRollingStock", "PSLunchCounter_Lounge", PASSENGER, 3),
	minecartPS30SeatParlor("ItemRollingStock", "PS30SeatParlor", PASSENGER, 3),

	minecartDRGWRPO620Series("ItemRollingStock", "DRGWRPO620Series", PASSENGER, 3),
	minecartDRGWRPO630Series("ItemRollingStock", "DRGWRPO630Series", PASSENGER, 3),
	minecartDRGWBaggage700Series("ItemRollingStock", "DRGWBaggage700Series", PASSENGER, 3),
	minecartDRGWBaggage740Series("ItemRollingStock", "DRGWBaggage740Series", PASSENGER, 3),
	minecartDRGWCoach1000Series("ItemRollingStock", "DRGWCoach1000Series", PASSENGER, 3),
	minecartDRGWCoach1005Series("ItemRollingStock", "DRGWCoach1005Series", PASSENGER, 3),

	minecartPSRPOPM("ItemRollingStock", "PSRPOPMIcon", PASSENGER, 3),
	minecartPS73Baggage("ItemRollingStock", "PS_73_baggage_icon", PASSENGER, 3),
	minecartPS54SeatCoach_Lounge("ItemRollingStock", "PS54SeatCoach_Lounge", PASSENGER, 3),
	minecartPS54SeatCoach_Lounge_1950("ItemRollingStock", "PS54SeatCoach_Lounge_1950", PASSENGER, 3),
	minecartPSCenterDiner("ItemRollingStock", "PScenterDiner", PASSENGER, 3),
	minecartPS58SeatCoach_Observation("ItemRollingStock", "PS58SeatCoach_Observation", PASSENGER, 3),

	minecartPSBMCombine("ItemRollingStock", "PSBMCombine", PASSENGER, 3),
	minecartPSBM56SeatCoach("ItemRollingStock", "PSBM56SeatCoach", PASSENGER, 3),
	minecartPSBMDiner_Lounge("ItemRollingStock", "PSBMDiner_Lounge", PASSENGER, 3),

	minecartACFGNRPO_30("ItemRollingStock", "ACFGNRPO_30", PASSENGER, 3),
	minecartACFGN60SeatCoach("ItemRollingStock", "ACFGN60SeatCoach", PASSENGER, 3),
	minecartACFGNDiner_Observation("ItemRollingStock", "ACFGNDiner_Observation", PASSENGER, 3),
	minecartACFGN28SeatCoach_Dinette("ItemRollingStock", "ACFGN28SeatCoach_Dinette", PASSENGER, 3),
	minecartACFGN1DR_17SeatParlor_Observation("ItemRollingStock", "ACFGN1DR_17SeatParlor_Observation", PASSENGER, 3),
	minecartPSGNRPO_30("ItemRollingStock", "ACFGNRPO_30", PASSENGER, 3),

	minecartOB84SeatCoach("ItemRollingStock", "OB84-92SeatCoach", PASSENGER, 3),
	minecartOB92SeatCoach("ItemRollingStock", "OB84-92SeatCoach", PASSENGER, 3),
	minecartOBNHGrillCar("ItemRollingStock", "OBNHGrillCar", PASSENGER, 3),
	minecartOBNHLounge5107("ItemRollingStock", "OBNHLounge5107", PASSENGER, 3),
	minecartOBBaggage_52SeatDividedCoach("ItemRollingStock", "OBBaggage_SeatDividedCoach", PASSENGER, 3),
	minecartOB76SeatDividedCoach("ItemRollingStock", "OB76SeatDividedCoach", PASSENGER, 3),
	minecartOBLV82_92SeatCoach("ItemRollingStock", "OBLV84-92SeatCoach", PASSENGER, 3),
	minecartOBRPO15("ItemRollingStock", "OBRPO15", PASSENGER, 3),
	minecartOB24SeatCoach_Dinette("ItemRollingStock", "OB24SeatCoach_Dinette", PASSENGER, 3),
	minecartOBBAR52SeatCoach_Dinette("ItemRollingStock", "OBBAR52SeatCoach_Dinette", PASSENGER, 3),

	minecartPSCNW56SeatCoach("ItemRollingStock", "PSCNW56SeatCoach", PASSENGER, 3),
	minecartPSCNW48SeatCoachLounge("ItemRollingStock", "PSCNW56SeatCoach", PASSENGER, 3),
	minecartPSCNW20SeatCoachLounge("ItemRollingStock", "PSCNW20SeatCoach_Lounge", PASSENGER, 3),
	minecartPSCNW36SeatCoach_Dinette("ItemRollingStock", "PSCNW36SeatCoach_Dinette", PASSENGER, 3),
	minecartPSCNW56SeatDiner("ItemRollingStock", "PSCNWDiner", PASSENGER, 3),
	minecartPSCNW48SeatDiner("ItemRollingStock", "PSCNWDiner", PASSENGER, 3),
	minecartPSCNW1DR_22SeatParlor("ItemRollingStock", "PSCNW1DR_22SeatParlor", PASSENGER, 3),
	minecartPSCNW16_1_3Sleeper("ItemRollingStock", "PSCNW16_1_3Sleeper", PASSENGER, 3),
	minecartPSCNW12SeatParlor_Observation("ItemRollingStock", "PSCNW12SeatParlor_Observation", PASSENGER, 3),
	minecartPSCNWRPO15("ItemRollingStock", "PSCNWRPO15", PASSENGER, 3),
	minecartPSCNWRPO60("ItemRollingStock", "PSCNWRPO60", PASSENGER, 3),
	minecartPSCNWBaggage_LC_Lounge("ItemRollingStock", "PSCNWBaggage_LC_Lounge", PASSENGER, 3),
	minecartPSCNWRPO15_Baggage_LC_Lounge("ItemRollingStock", "PSCNWRPO15_Baggage_LC_Lounge", PASSENGER, 3),
	minecartPSCNWBaggage_LC_Diner("ItemRollingStock", "PSCNWBaggage_LC_Diner", PASSENGER, 3),
	minecartPSCNW20SeatCoachLounge_1959("ItemRollingStock", "PSCNW20SeatCoach_Lounge_1959", PASSENGER, 3),
	minecartPSCNWCommuterLounge("ItemRollingStock", "PSCNW20SeatCoach_Lounge_1959", PASSENGER, 3),
	minecartPSCNW27SeatParlor_Observation("ItemRollingStock", "PSCNW27SeatParlor_Observation", PASSENGER, 3),

	minecartBuddRDG56SeatCoachLounge("ItemRollingStock", "BuddRDG56SeatCoachLounge", PASSENGER, 3),
	minecartBuddRDGDiner_Lounge("ItemRollingStock", "BuddRDGDiner_Lounge", PASSENGER, 3),
	minecartBuddRDG56SeatCoach_Observation("ItemRollingStock", "BuddRDG56SeatCoach_Observation", PASSENGER, 3),

	minecartBuddCRIP52SeatCoach("ItemRollingStock", "BuddCRIP52SeatCoach", PASSENGER, 3),

	minecartBuddNYC52SeatCoach("ItemRollingStock", "BuddNYC52SeatCoach", PASSENGER, 3),

	minecartBuddCBQ52SeatCoach("ItemRollingStock", "BuddCBQ52SeatCoach", PASSENGER, 3),
	minecartBuddDome46SeatCoach("ItemRollingStock", "BuddDome46SeatCoach", PASSENGER, 3),
	minecartBuddCBQDome50SeatCoach("ItemRollingStock", "BuddCBQDome50SeatCoach", PASSENGER, 3),
	minecartBuddPrewarBaggage("ItemRollingStock", "BuddPrewarBaggage", PASSENGER, 3),

	minecartBuddATSF52SeatCoach("ItemRollingStock", "BuddATSF52SeatCoach", PASSENGER, 3),
	minecartBuddATSF48SeatCoach("ItemRollingStock", "BuddATSF48SeatCoach", PASSENGER, 3),
	minecartBuddATSF50SeatCoachObservation("ItemRollingStock", "BuddATSF50SeatCoachObservation", PASSENGER, 3),
	minecartBuddATSF34SeatParlorObservation("ItemRollingStock", "BuddATSF34SeatParlorObservation", PASSENGER, 3),
	minecartBuddATSF58SeatCoachObservation("ItemRollingStock", "BuddATSF34SeatParlorObservation", PASSENGER,3),
	minecartPSATSF50SeatCoachObservation("ItemRollingStock", "PSATSF50SeatCoachObservation", PASSENGER, 3),

	minecartACF_SP_98seatcoach("ItemRollingStock", "ACF_SP_98seatcoach_icon", PASSENGER, 64),

	minecartACFUPRPO60("ItemRollingStock", "ACFUPRPO60", PASSENGER, 3),

	minecartBuddDome54SeatCoach("ItemRollingStock", "BuddDome54SeatCoach", PASSENGER, 3),

	minecartPSCEIRPO15_Baggage_LC_Lounge("ItemRollingStock", "PSCEIRPO15_Baggage_LC_Lounge", PASSENGER, 3),
	minecartPSCEIRPO15_Baggage_38SeatCoach("ItemRollingStock", "PSCEIRPO15_Baggage_LC_Lounge", PASSENGER, 3),
	minecartPSCEI60SeatCoach("ItemRollingStock", "PSCEIRPO60SeatCoach", PASSENGER, 3),
	minecartPSCEIDiner("ItemRollingStock", "PSCEIDiner", PASSENGER, 3),
	minecartPSCEI1DR28SeatParlorObservation("ItemRollingStock", "PSCEI1DR28ParlorObservation", PASSENGER, 3),

	minecartOBHWNH5570_5589Baggage("ItemRollingStock", "OBHWNH5570_5589Baggage", PASSENGER, 3),

	minecartBuddCN68SeatCoach_Observation("ItemRollingStock", "BuddCN68SeatCoach_Observation", PASSENGER, 3),
	minecartBuddCNCoach("ItemRollingStock", "BuddCNCoach", PASSENGER, 3),
	minecartBuddCNDiner_Lounge("ItemRollingStock", "BuddCNDiner_Lounge", PASSENGER, 3),
	minecartBuddCN39SeatParlor_Observation("ItemRollingStock", "BuddCN39SeatParlor_Observation", PASSENGER, 3),
	minecartBuddCN59SeatCoach_Observation("ItemRollingStock", "BuddCN39SeatParlor_Observation", PASSENGER, 3),
	minecartNSCCNBaggage("ItemRollingStock", "NSCCNBaggage", PASSENGER, 3),

	minecartPSSOUBaggage("ItemRollingStock", "PSSOUBaggage", PASSENGER, 3),
	minecartPSSOURPO_30("ItemRollingStock", "PSSOURPO_30", PASSENGER, 3),

	minecartPRECOPendulumCoach("ItemRollingStock", "PRECOPendulumCoach", PASSENGER, 3),

	minecartPSFNCCBaggage_Dinette("ItemRollingStock", "PSFNCCBaggage_Dinette", PASSENGER, 3),

	minecartNYCPrewar56SeatCoach("ItemRollingStock", "NYCPrewar56SeatCoach", PASSENGER, 3),

	minecartAmfleet("ItemRollingStock", "Amfleet", PASSENGER, 3),
	minecartAmfleet2("ItemRollingStock", "Amfleet2", PASSENGER, 3),
	minecartAmfleetCab("ItemRollingStock", "AmfleetCab", PASSENGER, 3),
	minecartAmCafe("ItemRollingStock", "AmCafe", PASSENGER, 3),
	minecartAmCafe2("ItemRollingStock", "AmCafe2", PASSENGER, 3),

	minecartPEcooch("ItemRollingStock", "pecoach", PASSENGER, 6),
	minecartPEobserve("ItemRollingStock", "peobserve", PASSENGER, 6),

	//othershizzle//
	minecartWVcaboose("ItemRollingStock", "wvcaboose", BOOSE,3),
	minecartHBC1Ccaboose("ItemRollingStock", "HBC1C", BOOSE,3),
	minecartHBC1Bcaboose("ItemRollingStock", "HBC1B", BOOSE,3),
	minecartDRGWCaboose("ItemRollingStock", "DRGW_01400_series_caboose", BOOSE,3),
	minecartICC_Bobber("ItemRollingStock", "icc_bobber_icon", BOOSE,100),
	minecartICCBaywindowWP("ItemRollingStock", "wp_iccbaywindow_icon", BOOSE,3),
	minecartCA11("ItemRollingStock", "hop_on_paint_dot_net", BOOSE,3),
	minecartWPShops600Series("ItemRollingStock", "wp648680_series_icon", BOOSE,3),
	minecartCDCScaboose("ItemRollingStock", "CDCScaboose", BOOSE,3),

	minecartBigMeme("ItemRollingStock", "lol", 69),
	minecartBombCart("ItemRollingStock", "payload", 2),
	minecartThanos("ItemRollingStock", "thanos", 64),
	minecartTGVMobile("ItemRollingStock", "tgvmobile", 30),
	minecartHHgregg("ItemRollingStock", "hhgregg", 69),

	minecartCQ310PO("ItemRollingStock", "CQ_310_Loco_icon", PASSENGER,3),
	minecartCQ310PA("ItemRollingStock", "CQ_310_Tail_icon", PASSENGER,3),
	minecartKawasakiLRV("ItemRollingStock", "KawasakiLRV", PASSENGER,3),
	minecartPCC("ItemRollingStock", "PCC", PASSENGER, 3),

	//peach moments
	minecartGeometryCar("ItemRollingStock", "geometry_car", 15),
	minecartExperimentalHydrogenTrain("ItemRollingStock", "pch100h", PASSENGER, 21),
	minecartPCH100HCoach("ItemRollingStock", "pch100h_coach", PASSENGER, 15),
	//testControlCar("ItemRollingStock", "test_controlcar", 100000),
	minecartAipkitExplorer("ItemRollingStock", "explorer", PASSENGER, 14),
	minecartAipkitExplorer2("ItemRollingStock", "explorer2", PASSENGER, 15),

	//ah, but we, are british
	//minecartLUengine("ItemRollingStock","luengine", 3),
	//minecartLUcar("ItemRollingStock","lupassenger", 2),
	//minecartClass345engine("ItemRollingStock", "Class345Engine", 3),
	//minecartClass345car("ItemRollingStock", "class345coach", 2),
	minecartClass74("ItemRollingStock", "Class_74_icon", ELECTRIC, 6),
	minecartTwoBil("ItemRollingStock", "2-bil_icon", PASSENGER, 3),
	minecartTwoBilTail("ItemRollingStock", "2-bil_tail_icon", PASSENGER, 3),

	//undecided stuff//
	//minecartBaldwinMineLoco("ItemRollingStock", "baldwinmineloco", 1),
	minecartHighrailTruck("ItemRollingStock", "highrail", 3),
	minecartFRED("ItemRollingStock", "fred", 5),

	//minecartHustler("ItemRollingStock", "hustler", 2),
	minecartBoulderWagon("ItemRollingStock","BoulderWagon", FREIGHT,3),
	//minecartLogcarNP( "ItemRollingStock","logcarNP",3),
	//minecartCF7R("ItemRollingStock", "cf7r", 12),
	minecartHighrailVan("ItemRollingStock", "highrailvan", 3),


	minecartWorkdayHyrail("ItemRollingStock", "workday", 3),
	;

	public Item item;
	public String className;
	public String iconName;
	public TypeOfRollingStock TypeOfRollingStock;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param typeOfRollingStock IE: STEAM, DIESEL, AND ELECTRIC
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	ItemIDs(String classMethodName, String iconName, TypeOfRollingStock typeOfRollingStock, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		TypeOfRollingStock = typeOfRollingStock;
		this.amountForEmerald = amountForEmerald;
	}

}