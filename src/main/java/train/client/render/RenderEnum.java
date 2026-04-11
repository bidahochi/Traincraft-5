package train.client.render;

import com.jcirmodelsquad.tcjcir.models.ModelThisErrorIsERatedForEveryone;
import com.jcirmodelsquad.tcjcir.models.trains.*;
import com.jcirmodelsquad.tcjcir.vehicles.ERatedForEveryone;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.foxdrives.DieselWorkdayHyrail;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.controlcar.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.funny.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tanker.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart.*;
import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.client.render.models.*;
import train.client.render.register.ISubTrainRenderRecord;
import train.client.render.register.SubTrainRenderRecord;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.entity.rollingStock.*;
import train.common.entity.rollingStock.diesel.*;
import train.common.entity.rollingStock.electric.*;
import train.common.entity.rollingStock.freight.*;
import train.common.entity.rollingStock.passenger.baggagecar.*;
import train.common.entity.rollingStock.passenger.rpo.EntityFreightGermanPost;
import train.common.entity.rollingStock.passenger.rpo.EntityFreightHeavyweight;
import train.common.entity.rollingStock.steam.*;
import train.common.entity.rollingStock.tanker.*;
import train.common.entity.rollingStock.tender.*;
import train.common.entity.rollingStock.workcart.*;
import train.client.render.register.ITrainRenderRecord;
import train.common.library.Info;

import java.util.ArrayList;

public enum RenderEnum implements ITrainRenderRecord, ISubTrainRenderRecord
{
	fallback(ERatedForEveryone.class, new ModelThisErrorIsERatedForEveryone(), "Skin_Plane_ThisErrorIsERatedForEveryone", false, new float[] { 0.0F, -0.47F, 0.0F }, null, new float[] { 5F, 5F, 5F }, "", 0, null, "", null, 0, false),

	/** Passengers */
	//passengerCartBlue(EntityPassengerBlue.class, new ModelPassenger6(), "passenger", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerCartBlackSmall(EntityPassenger2.class, new ModelPassenger2(), "passenger3", false, new float[] { 0.0F, -0.32F, -0.1F }, null, null, "", 0, null, "", null, 0, false),
	//passengerLongGreen(EntityPassenger5.class, new ModelPassenger5(), "passenger5_", true, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerShortGreen(EntityPassenger7.class, new ModelPassenger7(), "passenger7", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	//passenger_1class_DB(EntityPassenger_1class_DB.class, new ModelPassenger_1class_DB(), "passenger_1class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passenger_2class_DB(EntityPassenger_2class_DB.class, new ModelPassenger_2class_DB(), "passenger_2class_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerHighSpeedZeroED(EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerTramNY(EntityPassengerTramNY.class, new ModelTramNY(), "locoTramNY_", true, new float[] { 0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerAdler(EntityPassengerAdler.class, new ModelPassengerAdler(), "passengerAdler", false, new float[] { 0F, 1.04F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	//passenger_DB_oriental(EntityPassengerDBOriental.class, new ModelPassenger_DB_oriental(), "passenger_DB_oriental_", true, new float[] { 0F, -0.42F, 0.0F }, new float[] { 180F, 0F, 0F }, new float[] { -1F, -1F, 1F }, "", 0, null, "", null, 0,false),
	//passengerCE1Class1(EntityPassengerICE_1class.class, new ModelICE1Passenger(), "ICE1_1st_class_", true,
	//		new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
	//		"", null, 0, false),
	//passengerCE1Class2(EntityPassengerICE_2class.class, new ModelICE1Passenger(), "ICE1_2nd_class_", true,
	//		new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
	//		"", null, 0, false),
	//passengerCE1Restaurant(EntityPassengerICE_Restaurant.class, new ModelICE1Restaurant(), "ICE1_Restaurant_", true, new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//passengerGS4(EntityPassengerGS4.class, new ModelGS4Passenger(), "GS4_Passenger_", true, new float[] { 0.0F, 0.03F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//passengerGS4_Tail(EntityPassengerGS4_Tail.class, new ModelGS4Tail(), "GS4_Tail_", true, new float[] { -0.2F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//passengerGS4_Observatory(EntityPassengerGS4_Observatory.class, new ModelGS4Tavern(), "GS4_Tavern_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//passengerRheingold(EntityPassengerRheingold.class, new ModelRheingoldPassenger(), "Rheingold_passenger_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//passengerRheingoldDining1(EntityPassengerRheingoldDining1.class, new ModelRheingoldPassenger_Dining1(), "Rheingold_passenger_dining1_", true, new float[] { 1.7F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//passengerRheingoldDining2(EntityPassengerRheingoldDining2.class, new ModelRheingoldPassenger_Dining2(), "Rheingold_passenger_dining2_", true, new float[] { 0.05F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//passengerRheingoldPanorama(EntityPassengerRheingoldPanorama.class, new ModelRheingoldPassenger_Panorama(), "Rheingold_passenger_panorama_", true, new float[] { -0.1F, 0.15F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//drgPasenger(EntityPassengerDenverRioGrande.class, new ModelDRGPassenger(), "drg_passenger_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//drgPasengerCombo(EntityPassengerDenverRioGrandeCombo.class, new ModelDRGCombo(), "drg_combo_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	//MILWPasenger(EntityPassengerMILW.class, new ModelMILWPassenger(), "milw_passenger", false, new float[] { 0.2F, 0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	//MILWPasengerTail(EntityPassengerMILWTail.class, new ModelMILWTail(), "milw_passenger_tail", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	//MILWPasengerDiner(EntityPassengerMILWDiner.class, new ModelMILW1935Passenger(), "milw_passenger_diner", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),

	//PasengerBamboo(EntityPassengerBamboo.class, new ModelBambooTrainPassenger(), "passenger_bamboo_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Caboose */
	//cabooseRed(EntityCaboose3.class, new ModelCaboose3(), "caboose3", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	//cabooseBlack(EntityCaboose.class, new ModelCaboose(), "caboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//cabooseLogging(EntityCabooseLogging.class, new ModelCabooseLogging(), "cabLogging_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//cabooseLoggingPRR(EntityCabooseLoggingPRR.class, new ModelPRRCaboose(), "PRRCaboose_", true, new float[] { 0.0F, -0.38F, 0.0F },new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	//GWRBrakeVan(EntityGWRBrakeVan.class, new ModelGWRBrakeVan(), "GWRBrakeVan", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Specials **/
	//stockCar(EntityStockCar.class, new ModelStockCar(), "stockcar_", true, new float[] { -.0F, -0.40F, 0.0F }, new float[]{0,0,0}, null, "", 0, null, "", null, 0, false),
	//original height for the stock car set was -0.32
	//drwgStockCar(EntityStockCarDRWG.class, new ModelDRWGStockCar(), "drwgstockcar", false, new float[] { 1.0F, -0.4F, 0.0F }, new float[]{0,0,180}, null, "", 0, null, "", null, 0, false),
	//workCart(EntityWorkCart.class, new ModelWorkCart(), "workcart", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//flatCart(EntityFlatCart.class, new ModelFlatCar(), "flatcart", false, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//workCaboose(EntityCabooseWorkCart.class, new ModelWorkCaboose(), "workcaboose", false, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//jukeBoxCart(EntityJukeBoxCart.class, new ModelJukeBox(), "jukebox", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//flatCartSU(EntityFlatCartSU.class, new ModelFlatCarSU(), "flatcarsu", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//flatCartUS(EntityFlatCartUS.class, new ModelFlatCarUS(), "flatCartUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//tracksBuilder(EntityTracksBuilder.class, new ModelBuilder(), "builder2", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
	//	{
	//		add(new double[] { -1.3D, 2.1D, 0.0D });
	//	}
	//}, "", null, 0, true),

	/** Freight */
	freightCartRed(EntityFreightCart2.class, new ModelFreightCart2(), "freightcart2_", true, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartYellow(EntityFreightCart.class, new ModelFreightCart2(), "freightcart", false, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWood(EntityFreightWood.class, new ModelWood(), "wood_Full", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightHopper(EntityFreightGrain.class, new ModelGrain(), "hopper_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightOpenWagon(EntityFreightOpenWagon.class, new ModelOpenWagon(), "openwagon_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passenger4(EntityPassenger4.class, new ModelPassenger4(), "passenger4",false,new float[] {0.0F, -0.32F, 0.0F},null,null,"",0,null,"",null,0),//apparently has been removed
	freightHopperUS(EntityFreightHopperUS.class, new ModelFreightHopper(), "freightHopperUS_", true,
			new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodUS(EntityFlatCartWoodUS.class, new ModelFlatCarWoodUS(), "flatCartWoodUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartUS(EntityFreightCartUS.class, new ModelFreightCartUS(), "freightCartUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartUS(EntityBoxCartUS.class, new ModelBoxCartUS(), "boxCartUS_", true, new float[] { 0.0F, -0.45F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartPRR(EntityBoxCartPRR.class, new ModelPRRX31Wagon(), "PRR_X31a", false, new float[] { 0.0F, -0.38F, 0.0F }, new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	freightTGNG(EntityFreightGTNG.class, new ModelGTNG(), "GTNGOreWagon", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[]{0,0,180}, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightCartSmall(EntityFreightCartSmall.class, new ModelSmallFreightCart(), "freightCartSmall", false, new float[] { 0.0F, -0.20F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightMinetrain(EntityFreightMinetrain.class, new ModelMinetrain(), "minetrain", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodLogs(EntityFreightWood2.class, new ModelFreightWood(), "flatCartWood2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightClosedRedBrown(EntityFreightClosed.class, new ModelFreightClosed(), "freightClosed", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightOpenRedBrown(EntityFreightOpen2.class, new ModelFreightOpen2(), "freightOpen2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	mailWagen_DB(EntityMailWagen_DB.class, new ModelMailWagen(), "mailWagen_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWagen_DB(EntityFreightWagenDB.class, new ModelFreightWagenDB(), "freightWagen_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarRails_DB(EntityFlatCarRails_DB.class, new ModelFlatCarRails_DB(), "flatCarRails_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCar_DB(EntityFlatCar_DB.class, new ModelFlatCar_DB(), "flatCar_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarLogs_DB(EntityFlatCarLogs_DB.class, new ModelFlatCarLogs_DB(), "flatCarLogs_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightGondola_DB(EntityFreightGondola_DB.class, new ModelFreightGondola_DB(), "freightGondola_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Empty(EntityFreightCenterbeam_Empty.class, new ModelFreightCenterBeam_Empty(), "freight_centerbeam_empty_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood1(EntityFreightCenterbeam_Wood_1.class, new ModelFreightCenterBeam_Wood_1(), "freight_centerbeam_wood_1_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood2(EntityFreightCenterbeam_Wood_2.class, new ModelFreightCenterBeam_Wood_2(), "freight_centerbeam_wood_2_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	//freightWellcar(EntityFreightWellcar.class, new ModelFreightWellcar(), "freightWellcar_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightWellcar(EntityFreightWellcar.class, new ModelWellcar(), "wellcar_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightTrailer(EntityFreightTrailer.class, new ModelFreightTrailer(), "freightTrailer_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightGS4(EntityFreightGS4_Baggage.class, new ModelGS4Baggage(), "GS4_baggage_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	freightSlateWagon(EntityFreightSlateWagon.class, new ModelSlateWagon(), "freightslatewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightIceeWagon(EntityFreightIceWagon.class, new ModelIceWagon(), "icewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freight100TonHopper(EntityFreight100TonHopper.class, new Model100TonHopper(), "freight_100tonhopper_", true, new float[] { -0.1F, 0.0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightBulkheadFlatCar(EntityBulkheadFlatCart.class, new ModelBulkheadFlat(), "BulkheadFlat_", true, new float[]{-0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgBaggage(EntityFreightDenverRioGrande.class, new ModelDRGBaggage(), "drg_baggage_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	MILW1935Baggage(EntityFreightBaggageMILW.class, new ModelMILWBaggage(), "milw_baggage", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	HeavyweightMailcar(EntityFreightHeavyweight.class, new ModelHeavyweight(), "heavyweight_mailcar", false, new float[] { 0.1F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	BambooFreightcar(EntityFreightBamboo.class, new ModelBambooTrainCargo(), "bamboo_freight_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightGermanPost(EntityFreightGermanPost.class, new ModelGermanPost(), "german_post_", true, new float[] { -1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightDepressedFlatbed(EntityFreightDepressedFlatbed.class, new ModelDepressedFlatbed(), "depressed_flatbed_", true, new float[] { -0.1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightCartL(EntityFreightCartL.class, new ModelFreightCarL(), "freightCarL_", true, new float[] { 0F, 0.2F, 0.825F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightKclassrailBox(EntityFreightKClassRailBox.class, new ModelKClassRailBox(), "KClassRailBox_", true, new float[] { -1.5F, 0.1F, 0.125F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightShortCoveredHopper(EntityFreightShortCoveredHopper.class, new ModelShortCoveredHopper(), "ShortCoveredHopper_", true, new float[] { -2.2F, -0.25F, 0.7F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightLongCoveredHopper(EntityFreightLongCoveredHopper.class, new ModelLongCoveredHopper(), "LongCoveredHopper_", true, new float[] { -1F, -0.25F, 0.65F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightHeavyweightBoxcar(EntityFreightHeavyweightBaggage.class, new ModelHeavyweightBaggage(), "heavyweightBoxcar_", true, new float[] { 0F, 0.1F, -0.05F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightASTFAutorack(EntityFreightASTFAutorack.class, new ModelASTFAutorack(), "astf_autorack", false, new float[] { -1F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Tanks **/
	tankWagon_DB(EntityTankWagon_DB.class, new ModelTankWagon_DB(), "tankWagon_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonUS(EntityTankWagonUS.class, new ModelTankWagonUS(), "tankWagonUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonGrey(EntityTankWagon2.class, new ModelTankWagon2(), "tankwagon2_", true, new float[] { 0.0F, -0.40F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankCartLava(EntityTankLava.class, new ModelWatertransp(), "lavacar_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonYellow(EntityTankWagon.class, new ModelTankWagon(), "tankwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonThreeDome(EntityTankWagonThreeDome.class, new ModelTankWagonThreeDome(), "tanker_three_dome_", true, new float[] { 0.0F, 0.17F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Tenders */
	tenderSmall(EntityTenderSmall.class, new ModelTender(), "tender2_", true, new float[] { 0.0F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.75F, 0.75F, 0.75F }, "", 0, null, "", null, 0, false),
	tenderHeavy(EntityTenderHeavy.class, new ModelTenderHeavy(), "heavytender_", true, new float[] { 0.0F, -0.38F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tender4_4_0(EntityTender4_4_0.class, new ModelNormalSteamTender(), "4-4-0-loco_tender_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderBR01(EntityTenderBR01_DB.class, new ModelTenderBR01_DB(), "tenderBR01_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderEr_Ussr(EntityTenderEr_Ussr.class, new ModelTenderEr_Ussr(), "tenderEr_Ussr", false, new float[] { 0.06F, -0.44F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderC62Class(EntityTenderC62Class.class, new ModelC62Tender(), "c62_tender_", true,
			new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderD51(EntityTenderD51.class, new ModelD51Tender(), "d51_tender", false,
			new float[] { -3.0F, 0.35F, 0.0F }, new float[]{0,180f,180f}, null, "", 0, null, "", null, 0, false),
	tenderAdler(EntityTenderAdler.class, new ModelTenderAdler(), "tender_adler", false, new float[] { 0.0F, 1.05F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderGS4(EntityTenderGS4.class, new ModelGS4Tender(), "GS4_tender_", true, new float[] { 0.0F, 0.15F, -0.05F },
			new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null, "", null, 0, false),
	Model4000GallonTender(EntityTender4000.class, new Model4000GallonTender(), "GWR_Tender_",  true, new float[] { -4.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ModelFowler4FTender(EntityTenderFowler4F.class, new ModelFowler4FTender(), "Fowler_4F_Tender",  false, new float[] { -5.25F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderCoranationClass(EntityTenderCoranationClass.class, new ModelCoranationClassTender(), "CoranationClassTender", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderBerk1225(EntityTenderBerk1225.class, new Model1225Tender(), "Berkshire_tender_",  true, new float[] { 2.75F, -0.65F, 0.0625F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderC41(EntityTender_C41.class, new ModelTenderC41(), "C41Tender_", true, new float[] { 0.1F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderSouthern1102(EntityTender_Southern1102.class, new ModelSouthern1102Tender(), "Southern1102Tender", false, new float[] { -5.25F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderMILW(EntityTenderMILW.class, new ModelMILWTender(), "milw_tender", false, new float[] {0.15F, 0.055F, 0.025F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),

	/** Diesel */
	locoKOF(EntityLocoDieselKof_DB.class, new ModelKof(), "locoKof_DB_", true, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, 1.1D, 0.0D });
		}
	}, "", null, 0, true),
	locoGP40(EntityLocoDieselCD742.class, new ModelGP40(), "cd742_", true, new float[] { -0.8F, 0.75F, 0.0F }, new float[] { 180F, 180F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.25D, 1.15D, 0.0D });
		}
	}, "", null, 0, false),
	locoChME3(EntityLocoDieselChME3.class, new ModelChME3(), "chme3", false, new float[] { -0.5F, -0.47F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, new train.client.render.models.ModelGP7(), "gp7_", true, new float[] { -0.8F, -0.55F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.3D, 0.0D });
			add(new double[] { 0.45D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	loco44tonner(EntityLocoDiesel44TonSwitcher.class, new ModelLoco44TonSwitcher(), "loco_44tonswitcher_", true, new float[] { -2.75F, -0.425F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
			add(new double[] { 2D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD40(EntityLocoDieselSD40.class, new com.jcirmodelsquad.tcjcir.models.trains.ModelSD40heritage(), "locoSD40_", true, new float[] { -1.2F, -0.47F, 0.0F }, new float[] { 180F, 90F, 0F }, new float[] { -1F, -1F, 1F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	locoSD70(EntityLocoDieselSD70.class, new ModelSD70(), "locoSD70_", true, new float[] { -1.2F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 0.4D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),

	locoShunter(EntityLocoDieselShunter.class, new ModelShunter(), "shunter_", true, new float[] { -1.2F, -0.42F, 0.0F }, null, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.1D });
			add(new double[] { 2.4D, 1.5D, 0.1D });
		}
	}, "", null, 0, true),
	locoWLs40(EntityLocoDieselWLs40.class, new ModelWLs40(), "wls40", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.0D, 1.4D, 0.0D });
		}
	}, "", null, 0, true),
	locoV60_DB(EntityLocoDieselV60_DB.class, new ModelV60(), "locoV60_DB_", true, new float[] { -0.5F, -0.44F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.75D, 1.7D, 0.0D });
		}
	}, "", null, 0, false),
	locoMILW_H1044(EntityLocoDieselMILW_H1044.class, new ModelMILW_H1044(), "MILW_H1044_", true, new float[]{0,0.14f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.7D, 1.7D, 0D });
		}
	}, "", null, 0, false),
	/*locoEMDF7(EntityLocoDieselEMDF7.class, new ModelEMDF7(), "emdf7_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.5D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF3(EntityLocoDieselEMDF3.class, new ModelEMDF3(), "emdf3_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.55D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF7b(EntityBUnitEMDF7.class, new ModelEMDF7B(), "emdf7b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	locoEMDF3b(EntityBUnitEMDF3.class, new ModelEMDF3B(), "emdf3b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),*/
	DD35b(EntityBUnitDD35.class, new ModelDD35B(), "dd35b_", true, new float[]{0,0.18f,0}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoDieselDD35A(EntityLocoDieselDD35A.class, new ModelDD35A(), "dd35a_", true, new float[]{-5,0.18f,0}, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.9D, 1.6D, 0.0D });

			add(new double[] { -0.4D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoBamboo(EntityLocoDieselBamboo.class, new ModelBambooTrainEngine(), "loco_bamboo_", true, new float[] { -1.0F, 0F, 0.0F }, new float[]{180,180,0}, null, "smoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { -0.05D, -0.05D, 0.0D });
		}
	}, "", null, 0, true),
	/** Electric */
	locoE10DB(EntityLocoElectricE10_DB.class, new ModelE10DB(), "locoe10_db_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	locoCD151(EntityLocoElectricCD151.class, new ModelLocoCD151(), "CD151_", true, new float[]{-2,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoE103(EntityLocoElectricE103.class, new ModelE103(), "E103_", true, new float[]{-2,0.05f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoVL10(EntityLocoElectricVL10.class, new ModelVL10(), "vl10", false, new float[] { -1.2F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, new ModelBR_E69(), "locoBR_E69_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, new ModelLocoMinetrain(), "locoMinetrain", false, new float[] { -0.8F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoSpeedZeroED(EntityLocoElectricHighSpeedZeroED.class, new ModelLocoHighSpeedZeroED(), "locoHighSpeedZeroED_", true, new float[] { -1.7F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoICE1(EntityLocoElectricICE1.class, new ModelICE1(), "ICE1_Engine_", true, new float[] { 0.0F, 0.18F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//locoSpeedGrey(EntityNewHighSpeedLoco.class, new ModelNewHighSpeedLoco(), "newhighspeedloco", false, new float[] { -0.05F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "", 0, null, "", null, 0),
	locoTramYellow(EntityLocoElectricTramWood.class, new ModelTram(), "tram", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//locoTramNY(EntityLocoElectricTramNY.class, new ModelTramNY(), "locoTramNY_", true, new float[] { -1.5F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),

	//passengerC4FG(PassengerIC4_DSB_FG.class, new ModelLocoDieselIC4_DSB_FG(), "IC4_DSB_FG", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passengerC4FH(PassengerIC4_DSB_FH.class, new ModelLocoDieselIC4_DSB_FH(), "IC4_DSB_FH", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//locoIC4MG(EntityLocoDieselIC4_DSB_MG.class, new ModelLocoDieselIC4_DSB_MG(), "IC4_DSB_MG_", true, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR185(EntityLocoElectricBR185.class, new BR185_EngineModel(), "BR185_Engine_", true, new float[] { -2.0F, 0.1F, 0.0F },  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoClass85(EntityLocoElectricClass85.class, new ModelClass85(), "Class85", false, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "", 0, null, "", null, 0, false),
	locoBP4(EntityLocoElectricBP4.class, new ModelBP4(), "bp4_", true, new float[] { -1.4F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoDeltic(EntityLocoDieselDeltic.class, new ModelDeltic(), "Deltic_", true, new float[] { -2.25F, 0.8F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2.3D, 1.6D, 0D});
		}
	}, "", null, 0, false),
	locoEWSClass66(EntityLocoDieselClass66.class, new ModelEWSClass66(), "Class66_", true, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	locoFOL_M1(EntityLocoDieselFOLM1.class, new ModelFOL_M1(), "FOL_M1_", true, new float[] { -2.8F, 0.05F, 0.9F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	/** Steam */
	locoCherepanov(EntityLocoSteamCherepanov.class, new ModelLocoCherepanov(), "locoCherepanov", false, new float[] { -0.875F, -0.47F, 0.0F }, new float[] { 0, 180, 0 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, 2.1D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.875D, 0.2D, 0.2D });
		}
	}, 2, true),
	locoPannier(EntityLocoSteamPannier.class, new ModelLocoPannier(), "locoPannier", false, new float[] { 0.15F, 0.2F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, 1.8D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.575D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41(EntityLocoSteamC41.class, new ModelLocoC41(), "locoC41", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41_080(EntityLocoSteamC41_080.class, new ModelC41_080(), "locoC41_080", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoAlcoSC4(EntityLocoSteamAlcoSC4.class, new ModelAlcoSC4(), "AlcoSC4_", true, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41T(EntityLocoSteamC41T.class, new ModelLocoC41T(), "locoC41t", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoSouthern1102(EntityLocoSteamSouthern1102.class, new ModelSouthern1102(), "Southern1102", false, new float[] { -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoUSATCUS(EntityLocoSteamUSATCUS.class, new ModelUSATCUS(), "USATCUS", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoUSATCUK(EntityLocoSteamUSATCUK.class, new ModelUSATCUK(), "USATCUK", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, new ModelCoranationClass(), "CoranationClass", false, new float[] { -3.8F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
					add(new double[] { 5.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
					add(new double[] {4.8D, 0.15D, 0.5D });
		}
	}, 2, true),
	locoBR80(EntityLocoSteamBR80_DB.class, new ModelLocoBR80_DB(), "locoBR80_DB_", true, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 4, true),
	loco4_4_0(EntityLocoSteam4_4_0.class, new ModelLoco(), "4-4-0-loco_", true, new float[] { -0.66F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 2.05D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.56D, -0.2D, 0.8D });
		}
	}, 4, true),
	locoSteamSmall(EntityLocoSteamSmall.class, new ModelLoco3(), "loco3_", true, new float[] { -0.99F, -0.5F, 0.0F }, new float[] { 0F, -90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.69D, 1.1D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, new ModelLSSP7(), "LSSP7", false, new float[] { -1F, -0.2F, 0.8F }, new float[] { 0F, 180F, 180F }, new float[] { 1F, 1F, 1F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.1D, 1.15D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.7D, -0.4D, 0.5D });
			add(new double[] { 0.7D, -0.4D, -0.5D });
		}
	}, 2, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, new ModelHeavySteamLoco(), "heavysteam", false, new float[] { 0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamC62Class(EntityLocoSteamC62Class.class, new ModelC62Locomotive(), "c62_engine_", true,
			new float[] { 0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.0D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Short(EntityLocoSteamD51.class, new ModelD51ShortStreamlining(), "d51_short_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Long(EntityLocoSteamD51Long.class, new ModelD51LongStreamlining(), "d51_long_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, new ModelLocoBR01_DB(), "locoBR01_DB", false, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.8D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamGS4(EntityLocoSteamGS4.class, new ModelGS4Loco(), "GS4_engine_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.95f,0.95f,0.95f}, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 5.8D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, new ModelLocoEr_Ussr(), "locoEr_Ussr", false, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamForney(EntityLocoSteamForneyRed.class, new ModelLocoForney(), "locoForney", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, new ModelLocoMogul(), "locoMogul", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamShay(EntityLocoSteamShay.class, new ModelLocoSteamShay(), "locoShay", false, new float[] { -0.4F, -0.45F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.7D, 0.2D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamVBShay(EntityLocoSteamVBShay.class, new ModelVBShay(), "vbshay", false, new float[] { 0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.55D, 2.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamClimax(EntityLocoSteamClimax.class, new ModelLocoClimax(), "loco_climax", false, new float[] { 0F, 0.18F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.05D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAdler(EntityLocoSteamAdler.class, new ModelLocoSteamAdler(), "locoAdler", false, new float[] { -0.8F, 1.05F, 0F }, new float[] { 180F, -90F, 0F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 1.3D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, new ModelLocoAlice040(), "0-4-0-loco-alice", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam040VB(EntityLocoSteam040VB.class, new ModelVB040(), "loco040VB", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, new Model042TGLYN(), "0-4-2-loco-glyn", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam626T(EntityLocoSteam262T.class, new ModelT262(), "262t", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.65D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamA4Mallard(EntityLocoSteamMallardA4.class, new ModelA4Locomotive(), "locoA4_UK_", true, new float[] {-3.0F, 0.2F, 0F },new float[] { 0F, 180F, 180F }, new float[]{0.975f,0.975f,0.975f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.9D, -0.4D, 0.8D });
		}
	}, 2, true),
	LocoSteamHallClass(EntityLocoSteamHallClass.class, new ModelHallClass(), "Hall_Class_Locomotive_", true, new float[] {-0.65F, 0.15F, -0.25F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.25D, 1.55D, 0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamKingClass(EntityLocoSteamKingClass.class, new ModelKingClass(), "King_Class_Locomotive_", true, new float[] {-1.75F, 0.15F, 0.0F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.6D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.6D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk1225(EntityLocoSteamBerk1225.class, new Model1225(), "Berk1225_Locomotive_", true, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk765(EntityLocoSteamBerk765.class, new Model765(), "Berk765_Locomotive", false, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, new ModelMILWClassA(), "locoMILW_ClassA", false, new float[] {0.0F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.4D, 1.35D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamFowler(EntityLocoSteamFowler.class, new ModelFowler(), "loco_Fowler", false, new float[] { -3F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 3.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2D, -0.4D, 0D });
		}
	}, 2, true),
	locoSteamA4Tender(EntityTenderA4.class, new ModelTenderA4(), "tenderA4_UK_", true, new float[] { -0.2F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUS(EntityPropagandaUS.class, new ModelPropaganda2(), "propaganda_new_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaJapan(EntityPropagandaJapan.class, new ModelPropagandaCar(), "propaganda_Japan_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUSSR(EntityPropagandaUSSR.class, new ModelPropagandaCar(), "propaganda_USSR_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaBritain(EntityPropagandaBritain.class, new ModelPropagandaCar(), "propaganda_Britain_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SnowPlow(EntityLocoSteamSnowPlow.class, new ModelSnowPlow(), "train_snowplow", false, new float[] { -2F, 0.12F, 0F }, new float[] { 0F, 180F, 180F }, null,  "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.15D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),


	/*CF7_H_Angle(DieselCF7_H_Angle.class,  new ModelCF7_H_Angle(), "18PX_CF7_Angle_", true,new float[] {-1.0F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.55D, 1.0D, 0.0D});//front 0.62
			add(new double[]{0.3D, 1.0D, 0.0D});//rear
		}
	}, "", null, 0, false),
	CF7_H_Round(DieselCF7_H_Round.class,  new ModelCF7_H_Round(), "18PX_CF7_Round_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.55D, 1.0D, 0.0D});//front 0.62
			add(new double[]{0.3D, 1.0D, 0.0D});//rear
		}
	}, "", null, 0, false),*/


	/** JCIR-TC **/
	geometryCar(ExperimentalGeometryCar.class,new ModelGeometryCar(), "geometrycar_", true, new float[] {0F, 0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HighrailTruck( DieselHighrailTruck.class,  new ModelHighrailTruck(), "highrail_", true,new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 1,  new ArrayList<double[]>() {
		{
			add(new double[]{-0.3D, -0.4D, 0.2D});
		}
	}, "", null, 0, false),
	FRED(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.FRED.class, new ModelFRED(),"fred", false, new float[]{0F, 0.05F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	/*CF7R( com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7R.class,  new ModelCF7R(), "cf7r_", true,new float[] {-1.5F, -0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.4D, 0.0D});
			add(new double[]{1.1D, 1.4D, 0.0D});

		}
	}, "", null, 0, false),*/

	//LogcarNP(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.LogcarNP.class, new ModelLogcarNP(), "logcarNP_", true,new float[]{0F,0,0F,}, new float[] {0F,0F,180F,}, null, "",0, null, "", null, 0, false),
	testControlCar(TestControlCar.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	pch100(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, new ModelPCH100H(), "pch100h_", true, new float[]{-3.2F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch100coach(PCH100HCoach.class, new ModelPCH100HCoach(), "pch100hcoach_", true, new float[]{-2F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//LUengine(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, new com.jcirmodelsquad.tcjcir.models.trains.ModelLUengine(), "lu_engine", false,new float[] {-1.0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//LUpassenger(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.LUpassenger.class, new com.jcirmodelsquad.tcjcir.models.trains.ModelLUpassenger(), "lu_passenger",false,new float[] {0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	aipkitExplorer(AipkitExplorer.class, new ModelAipkitExplorer(), "aipkit_explorer", false, new float[]{0F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	aipkitExplorer2(AipkitExplorer2.class, new ModelExplorer2(), "aipkit_explorerii_", true, new float[]{0.8F, -0.02F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//Class345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric.ElectricClass345.class, new ModelClass345(), "class345", false,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	//Class345Coach( com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Class345Coach.class, new ModelClass345Coach(),"class345coach", false, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BoulderWagon(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight.BoulderWagon.class, new ModelBoulderWagon(),"BoulderWagon_",true, new float[]{0F,0.2F,0F}, new float[] { 0F, 180F, 180F },null, "",0,null,  "",null, 0,false),
	//Hustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, new ModelHustler(), "hustler_", true, new float[]{-1F, 0.2F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HighrailVan( DieselHighrailVan.class,  new ModelHighrailVan(), "highrailvan_", true,new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 1,  new ArrayList<double[]>() {
		{
			add(new double[]{-0.3D, -0.4D, 0.2D});
		}
	}, "", null, 0, false),


	/**STEAM**/
	Climax2(SteamClimaxNew.class, new ModelClimaxNew(), "climax_Grey", false, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.0D, -0.0D, 0.8D });
		}
	}, 2, true),
	VBShay(SteamVBShay2.class, new ModelVBShay2(), "vbshay2_", true, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 0F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.9D, -0.1D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, -0.4D, 0.8D });
			add(new double[] { 0.3D, 2.3D, 0.0D });
		}
	}, 2, true),
	Skook(SteamSkook.class, new ModelSkookum(), "skookum", false, new float[] {-1.15F, 0.15F, 0.07F}, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.8D });
			add(new double[] { 2.5D, -0.4D, 0.8D });
			add(new double[] { -0.5D, 1.5D, 0.0D });
		}
	}, 2, true),
	SkookTender(TenderSkookTender.class, new ModelSkookumTender(), "skookumtender", false, new float[] {0.0F, 0.08F, -0.13F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	Shay3Truck(SteamShay3Truck.class,  new ModelShay3Truck(), "3truckShay_", true,new float[] {0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.3D, -0.17D });//1.1D
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.6D });
			//add(new double[] { 0.6D, 1.1D, 0.0D });
		}
	}, 2, true),
	Shay3TruckTender(TenderShay3Truck.class, new ModelShay3TruckTender(), "3truckShay_", true, new float[] {0F, 0.15F, 0.00F}, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	ClimaxB(SteamClimaxB.class,  new ModelClimaxB(), "50ton_climax_b_", true,new float[] {-0.875F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] {2.1D, 1.40D, 0.0D});//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.9D, -0.2D, 0.6D });//piston steam
			add(new double[] { 1.0D, 1.3D, 0.0D });//dynamo
			add(new double[] { 2.2D, 1.4D, 0.0D });//stack
		}
	}, 2, true),

	F01(SteamF01.class, new ModelF01(), "F01_texture_", true, new float[] {-1.25F, 0.15F, 0.00F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] {2.2D, 1.4D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, -0.2D, 0.75D });//pistons
			//add(new double[] { -0.7D, 1.4D, 0.0D });//dynamo
		}
	}, 2, true),
	P01a(SteamP01a.class,  new ModelP01a(), "p01a_", true,new float[] {-0.8F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.025D, 1.4D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.9D, -0.4D, 0.6D });//piston steam
			add(new double[] { 0.0D, 1.3D, 0.0D });//dynamo
			add(new double[] { 2.1D, 1.4D, 0.0D });//stack
		}
	}, 2, true),
	VanderbackTender(TenderVanderback.class, new ModelVanderbackTender(), "vanderback_", true, new float[] {-0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SquanderbackTender(TenderSquanderback.class, new ModelSquanderbackTender(), "squanderback_", true, new float[] {-0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BKno2a(SteamBKno2a.class, new ModelBKno2a(), "BoothKelly_", true, new float[] {0.7F, 0.155F, 0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			//add(new double[] { 0D, 0D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, -0.2D, 0.75D });//pistons
		}
	}, 2, true),
	BKno2b(SteamBKno2b.class, new ModelBKno2b(), "BoothKelly_", true, new float[] {0.5F, 0.155F, 0F}, new float[] { 0, 0, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] {-1.9D, 1.6D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { -2.2D, -0.2D, 0.75D });//pistons
		}
	}, 2, true),
	WCPBuckingBull(SteamBuckingBull.class, new Modelwcp_bucking_bull(), "wcp_bucking_bull", false, new float[] {-1.15F, 0.15F, 0.0F}, new float[] { 0F, 180F, 180F }, null, "largesmoke", 15, new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, 1.5D, -0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.0D, -0.4D, 0.8D });
			add(new double[] { 1.0D, -0.4D, 0.8D });
		}
	}, 2, true),
	WCPBaler(TenderBaler.class, new Modelwcp_baler_tender(), "wcp_baler", false, new float[] {0F, 0.05F, 0.0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	WCPMacky(SteamMacky.class, new ModelWCPMacky(), "WCP_macky_three", false, new float[] {-1.15F, 0.15F, 0.0F}, new float[] { 0F, 180F, 180F }, null, "largesmoke", 15, new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, 1.5D, -0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.0D, -0.4D, 0.8D });
			//add(new double[] { 1.0D, -0.4D, 0.8D });
		}
	}, 2, true),

	Alco2102(SteamAlco2102.class,  new Modelalco2102(), "alco_2-10-2st_", true,new float[] {-1.2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, 1.40D, 0.0D});//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.7D, -0.4D, 0.6D });//piston steam
			//add(new double[] { 0.0D, 1.3D, 0.0D });//dynamo
			add(new double[] { 2.8D, 1.40D, 0.0D });//stack
		}
	}, 2, true),
	MK60(SteamMK60.class,  new Modelmk60(), "mk60-71_", true,new float[] {-1.2F, 0.16F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{3.3D, 1.60D, 0.0D});//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, -0.4D, 0.6D });//piston steam
			add(new double[] { 3.3D, 1.60D, 0.0D });//stack
		}
	}, 2, true),
	Tender10k(Tender10k.class, new ModelTender10k(), "wp_10k_", true, new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	TenderDeseret(TenderDeseret.class, new ModelTenderDeseret(), "wp_deserettender_", true, new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PMNstender(TenderPMNstender.class, new ModelPMNstender(), "pm_n_tender_", true, new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PMNandN1(SteamPMNandN1.class, new ModelPMNandN1(), "pm_n_locomotive_", true, new float[]{-2F, 0.155F, 0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{3.8D, 1.55D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.7D, 0.0D, 0.75D });
		}
	}, 2, true),

	HCS_c57(SteamHCS_c57.class,  new ModelHCS_c57(), "HCS_c57_", true,new float[] {-1.2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.50D, 0.0D});//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.45D, -0.4D, 0.6D });//piston steam
			//add(new double[] { 0.0D, 1.3D, 0.0D });//dynamo
			add(new double[] { 2.5D, 1.50D, 0.0D });//stack
		}
	}, 2, true),
	HCS_9k_Tender(HCS_9k_Tender.class, new ModelHCS_9k_tender(), "hcs_9kgal_", true, new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	HotTubTender(HotTubTender.class, new ModelHotTubTender(), "hottub_tender_", true, new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	locoC11(SteamC11.class, new ModelC11(), "locoC11", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.05D, 1.25D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.00D, 0.75D });
		}
	}, 3, true),
	Onion(SteamOnion.class, new ModelOnion(), "Onion_", true, new float[] { -0.7F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.5D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	OnionTender(TenderOnion.class, new ModelOnionTender(), "Onion_Tender_", true, new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	NP_L9(SteamNP_L9.class, new ModelNP_L9(), "np_l9_", true, new float[] {  -1.0F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 2.05D, 1.5D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, -0.2D, 0.75D });//pistons
		}
	}, 2, true),
	NP_11C_Tender(TenderNP_11C.class, new ModelNP_11C_12C_tender(), "np_11c_n_12c_tender_", true, new float[] {-0F, 0.155F, 0F}, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	NP_13C_Tender(TenderNP_13C.class, new ModelNP_13C_tender(), "np_13c_tender_", true, new float[] {-0F, 0.155F, 0F}, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	Alco460(SteamAlco460.class, new ModelAlco460(), "4-6-0_", true, new float[] {-0.9F, 0.155F, 0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] {2.3D, 1.5D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] {2.2D, -0.2D, 0.75D});//pistons
		}
	}, 2, true),
	Tender460(Tender460.class, new ModelTender460(), "4-6-0_tender_", true, new float[] {0.15F, 0.155F, 0F}, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	PELoco(SteamPELoco.class, new ModelPE_Loco(), "PELoco", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 1.4D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	PETender(TenderPETender.class, new ModelPE_Tender(), "PETender", false, new float[] { 0.1F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	Alco0_6_0T(SteamAlco0_6_0T.class, new ModelAlco0_6_0T(), "Alco0_6_0T_", true, new float[] { -0.55F, 0.16F, -0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.65D, 1.32D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.3D, -0.25D, 0.8D });
		}
	}, 2, true),
	Brank(SteamBrank.class, new ModelBrank(), "Brank_", true, new float[] { -0.5F, 0.16F, -0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.65D, 1.32D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.3D, -0.25D, 0.8D });
		}
	}, 2, true),
	Lima2_8_0(SteamLima2_8_0.class, new ModelLima2_8_0(), "Lima2_8_0_", true, new float[] {-0.9F, 0.155F, 0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] {2.1D, 1.65D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] {1.8D, -0.2D, 0.75D});//pistons
		}
	}, 2, true),
	TenderLima2_8_0(TenderLima2_8_0.class, new ModelTenderLima2_8_0(), "Lima_Tender2_8_0_", true, new float[] {-1.1F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**EMD**/
	F3A( DieselF3A.class,  new ModelF3a_new(), "f3a_", true,new float[] {-1.3F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	F3B( DieselF3B.class,  new ModelF3b(), "f3b_", true,new float[] {-1.22F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	F7A( DieselF7A.class,  new ModelF7a_new(), "f7a_", true,new float[] {-1.3F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	F7B( DieselF7B.class,  new ModelF7b(), "f7b_", true,new float[] {-1.22F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	F9A( DieselF9A.class,  new ModelF9a_new(), "f9a_", true,new float[] {-1.298F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	F9B( DieselF9B.class,  new ModelF9b(), "f9b_", true,new float[] {-1.22F, 0.145F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9675D, 1.25D, 0.0D});
			add(new double[]{0.19D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	FP7A( DieselFP7A.class,  new ModelFP7A(), "FP7A_", true,new float[] {-1.375F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.1075D, 1.3D, 0.0D});
			add(new double[]{0.42D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	FP9A( DieselFP9A.class,  new ModelFP9A(), "FP9A_", true,new float[] {-1.375F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.1075D, 1.3D, 0.0D});
			add(new double[]{0.42D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	CF7angle( DieselCF7angle.class,  new ModelCF7angle2(), "CF7_Angle_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7round( DieselCF7round.class,  new ModelCF7rouny2(), "CF7_Round_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7round3( DieselCF7round3.class,  new ModelCF7rouny3(), "CF7_Round_F_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7angle2( DieselCF7angle2.class,  new ModelCF7angle2(), "CF7_Angle_DBRR_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7angle3( DieselCF7angle3.class,  new ModelCF7angle_freelance(), "CF7a_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7b( DieselCF7b.class,  new ModelCF7b(), "CF7b_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	CF7hh( DieselCF7hh.class,  new ModelCF7hh(), "CF7_highhood_", true,new float[] {-1.25F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.35D, 1.4D, 0.0D});//rear
			add(new double[]{0.85D, 1.4D, 0.0D});//front
		}
	}, "", null, 0, false),
	F40PH( DieselF40PH.class,  new ModelF40PH(), "f40ph_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	EMDE7A( DieselE7A.class,  new ModelE7A(), "EMDE7A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.48D, 1.21D, 0D});
			add(new double[]{2.3D, 1.21D, 0D});
			add(new double[]{2.04D, 1.21D, 0D});
			add(new double[]{1.86D, 1.21D, 0D});
			add(new double[]{0.92D, 1.21D, 0D});
			add(new double[]{0.74D, 1.21D, 0D});
			add(new double[]{0.48D, 1.21D, 0D});
			add(new double[]{0.3D, 1.21D, 0D});
		}
	}, "", null, 0, false),

	EMDE7B( DieselE7B.class,  new ModelE7B(), "EMDE7B_", true,new float[] {-1.75F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.56D, 1.21D, 0D});
			add(new double[]{2.38D, 1.21D, 0D});
			add(new double[]{2.12D, 1.21D, 0D});
			add(new double[]{1.94D, 1.21D, 0D});
			add(new double[]{1.0D, 1.21D, 0D});
			add(new double[]{0.82D, 1.21D, 0D});
			add(new double[]{0.56D, 1.21D, 0D});
			add(new double[]{0.38D, 1.21D, 0D});
		}
	}, "", null, 0, false),
	BUnitEMDE7B( BUnitE7B.class,  new ModelE7B(), "EMDE7B_", true,new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	E8A( DieselE8A.class,  new ModelE8A(), "EMDE8A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.93D, 1.23D, 0D});
			add(new double[]{1.3D, 1.23D, 0D});
		}
	}, "", null, 0, false),

	E8B( DieselE8B.class,  new ModelE8B(), "EMDE8B_", true,new float[] {-1.75F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.08D, 1.23D, 0D});
			add(new double[]{1.45D, 1.23D, 0D});
		}
	}, "", null, 0, false),

	BUnitE8B( BUnitE8B.class,  new ModelE8B(), "EMDE8B_", true,new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	E9A( DieselE9A.class,  new ModelE9A(), "EMDE9A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.93D, 1.23D, 0D});
			add(new double[]{1.3D, 1.23D, 0D});
		}
	}, "", null, 0, false),

	E9B( DieselE9B.class,  new ModelE9B(), "EMDE9B_", true,new float[] {-1.75F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.08D, 1.23D, 0D});
			add(new double[]{1.45D, 1.23D, 0D});
		}
	}, "", null, 0, false),

	BUnitE9B( BUnitE9B.class,  new ModelE9B(), "EMDE9B_", true,new float[] {0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	CE8( DieselCE8.class,  new ModelCE8(), "CE8_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.94D, 1.3D, 0D});
			add(new double[]{2.1D, 1.3D, 0D});
			add(new double[]{0.55D, 1.3D, 0D});
			add(new double[]{0.4D, 1.3D, 0D});
		}
	}, "", null, 0, false),

	GP7( DieselGP7.class,  new ModelGP7newer(), "gp7new_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP7b( DieselGP7b.class,  new ModelGP7b(), "gp7b_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	BUnitGP7b(BUnitGP7b.class, new ModelGP7b(), "gp7b_", true, new float[]{0,-0.05f,0}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),
	GP7u( DieselGP7u.class,  new ModelGP7U_ATSF(), "gp7u_atsf_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP7f( DieselGP7f.class,  new ModelGP7U_ARR(), "gp7u_arr_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GPFDL( DieselGPFDL.class,  new ModelGPFDL(), "gpfdl_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.3D, 0.0D});//front
			//add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP9( DieselGP9.class,  new ModelGP9newer(), "gp9_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP9b( DieselGP9b.class,  new ModelGP7b(), "gp9b_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP13( DieselGP13.class, new ModelGP13(), "gp13_", true, new float[] { -0.8F, -0.55F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.2D, 0.0D });
			add(new double[] { 0.45D, 1.2D, 0.0D });
		}
	}, "", null, 0, false),
	GP15( DieselGP15.class,  new ModelGP15(), "gp15_", true,new float[] {-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.33D, 1.45D, 0.0D});
			add(new double[]{0.75D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	GP15T( DieselGP15T.class,  new ModelGP15(), "gp15t_", true,new float[] {-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.5D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	GP18( DieselGP18.class,  new ModelGP18(), "gp18_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.225D, 1.3D, 0.0D});//front
			add(new double[]{0.475D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP20( DieselGP20.class,  new ModelGP20(), "gp20_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.275D, 0.0D});//front
		}
	}, "", null, 0, false),
	GP30( DieselGP30.class,  new ModelGP30new(), "gp30_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.65D, 1.3D, 0.0D});//front
		}
	}, "", null, 0, false),
	GP35( DieselGP35.class,  new ModelGP35(), "gp35_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.65D, 1.3D, 0.0D});//front
		}
	}, "", null, 0, false),

	GP38dash9W( DieselGP38dash9W.class, new ModelGP38dash9W(), "GP38-2W_Fixxed_MTS_2", false,new float[] {-1.8F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.5D, 0.0D});//front
			add(new double[]{1.2D, 1.5D, 0.0D});//mid 1
			add(new double[]{0.9D, 1.5D, 0.0D});//mid 2
			add(new double[]{0.65D, 1.5D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP38H3( DieselGP38H3.class,  new ModelGP38H3(), "gp38h3_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
			add(new double[]{1.6D, 1.35D, 0.0D});

			add(new double[]{1.3D, 1.35D, 0.0D});
			add(new double[]{1.15D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP38( DieselGP38.class,  new ModelGP38(), "gp38_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.3D, 0.0D});//front
			add(new double[]{0.6D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP38Dash2( DieselGP38dash2.class,  new ModelGP38(), "gp38dash2_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.3D, 0.0D});//front
			add(new double[]{0.6D, 1.3D, 0.0D});//rear
		}
	}, "", null, 0, false),
	GP39( DieselGP39.class,  new ModelGP40new(), "gp39_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP39Dash2( DieselGP39Dash2.class,  new ModelGP40new(), "gp39Dash2_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP39TDash2( DieselGP39TDash2.class,  new ModelGP39T(), "gp39t_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP39TDash2B( DieselGP39TDash2B.class,  new ModelGP39TB(), "gp39tb_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP40( DieselGP40.class,  new ModelGP40new(), "gp40_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP40Dash2( DieselGP40Dash2.class,  new ModelGP40new(), "gp40Dash2_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP40TC( DieselGP40TC.class,  new ModelGP40TC(), "gp40tc_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.05D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP49( DieselGP49.class,  new ModelGP49(), "gp49_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.6D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),

	SD9(DieselSD9.class,  new ModelSD9new(), "sd9_", true,new float[]{-1.525F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.6D, 1.3D, 0.0D});
			add(new double[]{0.65D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	SD38(DieselSD38.class, new ModelSD38(), "sd38_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.8D, 1.3D, 0.0D});
			add(new double[]{0.85D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	SD39(DieselSD39.class, new ModelSD39(), "sd39_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.1D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SDL39( DieselSDL39.class, new ModelSDL39(), "sdl39_", true,new float[] {-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.425D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	SD40(DieselSD40.class, new ModelSD40(), "sd40_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.055D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40dash2(DieselSD40dash2.class, new ModelSD40dash2(), "sd40-2_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.055D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40T2( DieselSD40T2.class,  new ModelSD40T(), "SD40T_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.15D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40dash2B(DieselSD40dash2B.class, new ModelSD40dash2B(), "sd40dash2b_", true,new float[]{-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.25D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40R(DieselSD40R.class, new ModelSD40R(), "sd40r_espee_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.055D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40A(DieselSD40A.class, new ModelSD40A(), "sd40a_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.055D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SDP40(DieselSDP40.class, new ModelSDP40(), "sdp40_", true,new float[] {-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.23D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SDP40F( DieselSDP40F.class,  new ModelSDP40F(), "sdp40f_", true,new float[] {-2F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.55D, 1.5D, 0.0D});
		}
	},"", null, 0, false),
	SD40dash3(DieselSD40dash3.class, new ModelSD40dash3(), "sd40-3_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.055D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD45(DieselSD45dash2.class,  new ModelSD45dash2(), "sd45_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.05D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD45dash2B( DieselSD45dash2B.class,  new ModelSD45dash2B(), "sd45dash2b_", true,new float[] {-1.9F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.5D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	SDP45(DieselSDP45.class, new ModelSDP45(), "sdp45_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.405D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	FP45( DieselFP45.class,  new ModelFP45(), "fp45_", true,new float[] {-2F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.55D, 1.5D, 0.0D});
		}
	},"", null, 0, false),
	F45( DieselF45.class,  new ModelF45(), "f45_", true,new float[] {-1.75F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.25D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	SD50(DieselSD50.class, new ModelSD50(), "sd50_", true,new float[]{-1.875F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.875D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD60(DieselSD60.class, new ModelSD60(), "sd60_", true,new float[]{-1.875F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.875D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD70Mac( DieselSD70Mac.class, new ModelSD70Mac(), "sd70mac_", true,new float[] {-2.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{2.2D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	SD70ACe( DieselSD70ACe.class,  new ModelSD70ACe(), "sd70ace_", true,new float[]{-2.025F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{2.31D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD70ACe_H( DieselSD70ACe_H.class,  new ModelSD70ACe(), "sd70ace_h_", true,new float[]{-2.025F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{2.31D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	SW1( DieselSW1.class,  new ModelSW1(), "sw1_new_", true,new float[]{-1.0F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.2D, 1.20D, 0.0D});
		}
	}, "", null, 0, false),
	SW8( DieselSW8.class,  new ModelSW900(), "SW8_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),
	SW9( DieselSW9.class,  new ModelSW9(), "SW9_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.95D, 1.30D, 0.0D});
			add(new double[]{1.575D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),
	SW10( DieselSW10.class,  new ModelSW10(), "sw10_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.95D, 1.27D, 0.0D});
			add(new double[]{1.6D, 1.27D, 0.0D});
		}
	}, "", null, 0, false),
	SW900( DieselSW900.class,  new ModelSW900(), "SW900_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),
	SW1000( DieselSW1000.class,  new ModelSW1000(), "sw1000_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.65D, 1.40D, 0.0D});
		}
	}, "", null, 0, false),
	SW1200( DieselSW1200.class,  new ModelSW1200(), "sw1200_", true,new float[]{-1.0F, 0.15F, 0.00F},   new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.96D, 1.30D, 0.0D});
			add(new double[]{1.58D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),
	SW1500(DieselSW1500.class,  new ModelSW1500(), "sw1500_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.90D, 1.40D, 0.0D});
			add(new double[]{1.65D, 1.40D, 0.0D});
		}
	}, "", null, 0, false),
	SW1600(DieselSW1600.class,  new ModelSW1600(), "sw1600_", true,new float[]{-1.0F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.90D, 1.40D, 0.0D});
			add(new double[]{1.625D, 1.40D, 0.0D});
		}
	}, "", null, 0, false),
	MP900(DieselMP900.class,  new ModelMP900(), "mp900_", true,new float[]{-1.1F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.10D, 1.25D, 0.0D});
			add(new double[]{2.1D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	MP15DCW9( DieselMP15DCW9.class,  new ModelMP15DCW9(), "mp15dcw-9_", true,new float[] {-1.2F, -0.01F, 0F},  new float[] { 180F, 180F, 0F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.05D, 1.5D, 0.0D});
			add(new double[]{0.25D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	TR4( DieselTR4.class,  new ModelTR4(), "tr4_", true,new float[]{-1.0F, 0.15F, 0.00F},   new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.96D, 1.30D, 0.0D});
			add(new double[]{1.58D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),
	TR4B( DieselTR4B.class,  new ModelTR4B(), "tr4b_", true,new float[]{-1.0F, 0.15F, 0.00F},   new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.96D, 1.30D, 0.0D});
			add(new double[]{1.58D, 1.30D, 0.0D});
		}
	}, "", null, 0, false),

	Beep( DieselBeep.class,  new ModelBeep(), "atsfbeep", false,new float[]{-1.1F, 0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.25D, 0.0D});
			add(new double[]{1.65D, 1.25D, 0.0D});
			add(new double[]{1.05D, 1.25D, 0.0D});
			add(new double[]{1.25D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),

	/**GE**/
	GE44Ton( DieselGE44Ton.class,  new ModelGE44Ton(), "44_ton_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
			add(new double[]{1.4D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),
	Boxcab23Ton( DieselBoxcab23Ton.class,  new ModelBoxcab23Ton(), "boxcab_", true,new float[] {-0.75F, 0.2F, 0F},  new float[] { 0F, 0F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ //note: use {-0.5F, 0.2F, 0F} and -1 for main hitbox and bogie position if the "fliparound" error is fixed, knowing eternal, not likely. sorry about extra thicc hitboxes -bid
			add(new double[]{0.6D, 1.2D, 0.0D});
		}
	}, "", null, 0, false),
	GE25Ton( DieselGE25Ton.class,  new ModelGE25Ton(), "25ton_", true,new float[]{-0.5F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.425D, 0.9D, 0.0D});
		}
	}, "", null, 0, false),

	U18B( DieselU18B.class,  new ModelU18B(), "U18B_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	U18BB( DieselU18BB.class,  new ModelU18BB(), "U18BB_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	U18BW( DieselU18BW.class,  new ModelU18BW(), "U18BW_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	U18Balt( DieselU18Balt.class,  new ModelU18Bnew(), "u18b_new_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.81D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U18BWH( DieselU18BWH.class,  new ModelU23BW(), "U18BWH_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U23B( DieselU23B.class,  new ModelU23B(), "U23B_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U23BU( DieselU23BU.class,  new ModelU23BU(), "U23BU_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U23BW( DieselU23BW.class,  new ModelU23BW(), "U23BW_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	SF30B( DieselSF30B.class,  new ModelSF30B(), "sf30b_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U25B( DieselU25B.class,  new ModelU25B(), "u25b_", true,new float[]{-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.925D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	U30BH( DieselU30BH.class,  new ModelU30BH(), true, "U30BH_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U36B( DieselU36B.class,  new ModelU36B(), "U36B_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	U23C( DieselU23C.class,  new ModelU30C_new(), "U23C_", true,new float[]{-1.6F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.5D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	U30C( DieselU30C.class,  new ModelU30C_new(), "U30C_new_", true,new float[]{-1.6F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.5D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	SF30C( DieselSF30C.class,  new ModelSF30C(), "sf30c_", true,new float[] {-2.5F, -0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	U36C( DieselU36C.class,  new ModelU36C(), "u36c_", true,new float[] {-2.3125F, -0.20F/* -0.15F*/, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	U50( DieselU50.class,  new ModelU50(), "U50_", true,new float[]{-2.15F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{3.6D, 1.5D, 0.0D});
			add(new double[]{-0.15D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	U56( DieselU56.class,  new ModelU50(), "U56_", true,new float[]{-2.15F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{3.6D, 1.5D, 0.0D});
			add(new double[]{-0.15D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	SB18R( DieselSB18R.class,  new ModelSB18R(), "SB18R_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	SB18E( DieselSB18E.class,  new ModelSB18E(), "SB18E_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	SB18B( DieselSB18B.class,  new ModelSB18B(), "SB18B_", true,new float[]{-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	B23( DieselB23.class,  new ModelB23(), "b23-7_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	B23_wrx( DieselB23_wrx.class,  new ModelB23_wrx(), "b23-7_wrx_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	B23S7( DieselB23S7.class,  new ModelB23S7(), "b23-s7_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.675D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	BQ23( DieselBQ23.class,  new ModelBQ23(), "bq23-7_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	SB23R( DieselSB23R.class,  new ModelSB23R(), "SB23R_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SB23E( DieselSB23E.class,  new ModelSB23E(), "SB23E_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	B30( DieselB30.class,  new ModelB23(), "b30-7_", true,new float[] {-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
    B36( DieselB36.class,  new ModelB23(), "b36-7_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
        {
            add(new double[]{0.8D, 1.45D, 0.0D});
        }
    }, "", null, 0, false),
	SB36X( DieselSB36X.class,  new ModelSB36X(), "SB36X_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	Dash818BE( DieselDash818BE.class,  new ModelDash818BE(), "b18-8e_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	Dash832BWH( DieselDash832BWH.class,  new ModelDash832BWH(), "b32-8wh_", true,new float[]{-1.85F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	Dash839C( DieselDash839C.class,  new ModelDash839C(), "c39-8_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.925D, 1.5D, 0.0D});
		}
	}, "", null, 0, true),
	Dash839CE( DieselDash839CE.class,  new ModelDash840Cnew(), "c39-8e_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.925D, 1.5D, 0.0D});
		}
	}, "", null, 0, true),
	Dash839B( DieselDash839B.class,  new ModelDash839B(), "b39-8_", true,new float[]{-1.85F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	Dash840B( DieselDash840B.class,  new ModelDash840B(), "b40-8_", true,new float[]{-1.85F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	Dash840BB( DieselDash840BB.class,  new ModelDash840BB(), "dash8_40b_b_", true,new float[] {-1.6F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	//BUnitDash840BB(BUnitDash840B.class, new ModelDash840BB(), "dash8_40b_b_", true, new float[]{0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Dash840BW( DieselDash840BW.class,  new ModelDash840BW(), "b40-8w_", true,new float[]{-1.85F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	Dash840C( DieselDash840C.class,  new ModelDash840Cnew(), "c40-8_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.925D, 1.5D, 0.0D});
		}
	}, "", null, 0, true),
	Dash841C( DieselDash841C.class,  new ModelDash840Cnew(), "c41-8_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.925D, 1.5D, 0.0D});
		}
	}, "", null, 0, true),

	Dash940C( DieselDash940C.class,  new ModelAC44C(), "dash9_40c_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.98D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	Dash944CW( DieselDash944CW.class,  new ModelDash944CW(), "dash9_44cw_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.03D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	AC4400CW( DieselAC4400CW.class,  new ModelDash944CW(), "ac4400cw_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.03D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	AC4400C( DieselAC4400C.class,  new ModelAC44C(), "ac4400c_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.98D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	ES44( DieselES44.class,  new ModelES44new(), "es44_new_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.03D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	ES44h( DieselES44h.class,  new ModelES44new(), "es44_h_", true,new float[]{-2.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.03D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	P32(DieselP32.class, new ModelP32(), "p32dc_", true, new float[]{-1.8F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke",  5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	geGenesis(DieselP40.class, new ModelP42(), "p40dc_", true, new float[]{-1.8F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke",  5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	P42(DieselP42.class, new ModelP42(), "p42dc_", true, new float[]{-1.8F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke",  5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),

	//CEE4ED172T( Diesel4ED172T.class,  new Model4ED172T(), "4ED-172T_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
	//	{
	//		add(new double[]{0.45D, 1.5D, 0.0D});
	//	}
	//}, "", null, 0, true),
	CEE4ED172T_E( Diesel4ED172T_E.class,  new Model4ED172T(), "4ED-172T_E_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.55D, 1.4D, 0.0D});//front
			add(new double[]{0.775D, 1.4D, 0.0D});//rear
		}
	}, "", null, 0, true),
	CEE4ED172T_G( Diesel4ED172T_G.class,  new Model4ED172T(), "4ED-172T_G_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
		}
	}, "", null, 0, true),
	CEE4ED172T_C( Diesel4ED172T_C.class,  new Model4ED172T(), "4ED-172T_C_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
		}
	}, "", null, 0, true),

	/**ALCO**/
	AlcoPA1( DieselPA1.class,  new ModelPA(), "AlcoPA1_", true,new float[] {-1.6F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.06D, 1.19D, 0.12D});
		}
	}, "", null, 0, false),
	AlcoPB1( DieselPB1.class,  new ModelPB(), "AlcoPB1_", true,new float[] {-1.55F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.12D, 1.19D, 0.12D});
		}
	}, "", null, 0, false),
	FA1( DieselFA1.class,  new ModelFA1(), "FA1_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.86D, 1.19D, 0.12D});
		}
	}, "", null, 0, false),
	FB1( DieselFB1.class,  new ModelFB1(), "FB1_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, 1.19D, 0.12D});
		}
	}, "", null, 0, false),
	FA2( DieselFA2.class,  new ModelFA2(), "FA2_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.91D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),
	FB2( DieselFB2.class,  new ModelFB2(), "FB2__", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.95D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),
	FPA4( DieselFPA4.class,  new ModelFPA4(), "FPA4_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.91D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),
	FPB4( DieselFPB4.class,  new ModelFPB4(), "FPB4_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.95D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),
	FAFDL( DieselFAFDL.class,  new ModelFAFDL(), "fafdl_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),
	FBFDL( DieselFBFDL.class,  new ModelFBFDL(), "fbfdl_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.19D, 0.0D});
		}
	}, "", null, 0, false),

	RS1( DieselRS1.class,  new ModelRS1(), "rs1_", true,new float[]{-1.225F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.425D, 1.3D, -0.16D});
		}
	}, "", null, 0, false),
	RS2( DieselRS2.class,  new ModelRS2(), "rs2_", true,new float[]{-1.225F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.025D, 1.35D, -0.0D});
		}
	}, "", null, 0, false),
	RS3( DieselRS3.class,  new ModelRS2(), "rs3_", true,new float[]{-1.225F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.025D, 1.35D, -0.0D});
		}
	}, "", null, 0, false),
	RSFDL( DieselRSFDL.class,  new ModelRSFDL(), "rsfdl_", true,new float[]{-1.225F, 0.15F, 0F},  new float[] { 0F, 0F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.075D, 1.4D, -0.0D});
		}
	}, "", null, 0, false),

	C415H( DieselC415H.class,  new ModelC415H(), "C415h_", true,new float[]{-1.2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.77D, 1.55D, 0.0D});
		}
	}, "", null, 0, false),
	C415S( DieselC415S.class,  new ModelC415S(), "C415s_", true,new float[]{-1.2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.77D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	C415L( DieselC415L.class,  new ModelC415L(), "C415l_", true,new float[]{-1.2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	C424( DieselC424.class,  new ModelC424new(), "c424_", true,new float[]{-1.4F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{0.575D, 1.5D, 0.0D});
		}
	}, "", null, 0, true),
	C425( DieselC425.class,  new ModelC424new(), "c425_", true,new float[]{-1.4F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{0.575D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	DH643( DieselDH643.class,  new ModelDH643_fixed(), "DH643_", true,new float[]{-2F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.2D, 1.4D, 0.0D});
			add(new double[]{3.6D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	C855a( DieselC855a.class,  new ModelC855a(), "c855_", true,new float[]{-2.15F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{3.0D, 1.5D, 0.0D});
			add(new double[]{0.3D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	C855b( DieselC855b.class,  new ModelC855b(), "c855b_", true,new float[]{-2.15F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{3.0D, 1.5D, 0.0D});
			add(new double[]{0.3D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	HH660( DieselHH660.class,  new ModelHH660(), "hh660_", true,new float[] {-1F, -0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	S2( DieselS2.class,  new ModelAlcoS2(), "alcos2_", true,new float[]{-1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.3D, -0.18D});
		}
	}, "", null, 0, false),

	RSD15( DieselRSD15.class,  new ModelRSD15(), "rsd15_", true,new float[]{-1.8F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.65D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),

	M420( DieselM420.class,  new ModelM420(), "m420_", true,new float[]{-1.4F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.65D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	M420B( DieselM420B.class,  new ModelM420B(), "m420b_", true, new float[]{-1.4F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.65D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	M630(DieselM630.class, new ModelM63X_divets(), "M630_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M630R(DieselM630R.class, new ModelM63X_round(), "M630R_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M630W(DieselM630W.class, new ModelM63XW(), "M630W_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M636(DieselM636.class, new ModelM63X_divets(), "M636_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M636R(DieselM636R.class, new ModelM63X_round(), "M636R_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M640(DieselM640.class, new ModelM640(), "M640_", true,new float[] {-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	M640W(DieselM640W.class, new ModelM63XW(), "M640W_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	/**BRUHWIN**/
	VO1000( DieselVO1000.class,  new ModelVO1000(), "vo1000_", true,new float[] {-1.1F, 0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.40D, 1.3D, 0D});
		}
	}, "", null, 0, false),
	DS441000( DieselDS441000.class,  new ModelS12(), "DS441000_", true,new float[]{-1.1F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.30D, -0.18D});
		}
	}, "", null, 0, false),
	S12( DieselS12.class,  new ModelS12(), "S12_", true,new float[]{-1.1F, 0.15F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.8D, 1.30D, -0.18D});
		}
	}, "", null, 0, false),
	DR441500Phase2( DieselDR441500Phase2.class,  new ModelDR441500Phase2(), "DR441500Phase2_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.64D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),
	DR441500BPhase2( DieselDR441500BPhase2.class,  new ModelDR441500BPhase2(), "DR441500BPhase2_", true,new float[]{-1.35F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.68D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),
	DR441500Shark( DieselDR441500Shark.class,  new ModelDR441500Shark(), "DR441500Shark_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.66D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),
	DR441500BShark( DieselDR441500BShark.class,  new ModelDR441500BShark(), "DR441500BShark_", true,new float[]{-1.35F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.68D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),
	RF16( DieselRF16.class,  new ModelRF16(), "RF-16_", true,new float[]{-1.4F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.66D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),
	RF16B( DieselRF16B.class,  new ModelRF16B(), "RF-16B_", true,new float[]{-1.35F, 0.125F, 0.00F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.68D, 1.32D, 0.22D});
		}
	}, "", null, 0, false),

	/**Fairbanks Morse**/
	H1044( DieselH1044.class,  new ModelH1044(), "FM_H10-44_", true,new float[] {-1.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.35D, -0.16D});
			add(new double[]{1.9D, 1.35D, 0.16D});
		}
	}, "", null, 0, false),

	FMH16_66( DieselH16_66.class,  new ModelH16_66(), "FM_H16-66_", true,new float[] {-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.35D, 0.15D});
			add(new double[]{0.75D, 1.35D, -0.15D});
		}
	}, "", null, 0, false),

	FMH24_66( DieselH24_66.class,  new ModelH24_66(), "FM_H24-66_", true,new float[] {-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.78D, 1.35D, 0.15D});
			add(new double[]{0.78D, 1.35D, -0.15D});
		}
	}, "", null, 0, false),

	FMH24_66L( DieselH24_66L.class,  new ModelH24_66L(), "FM_H24-66_L_", true,new float[] {-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.78D, 1.35D, 0.15D});
			add(new double[]{0.78D, 1.35D, -0.15D});
		}
	}, "", null, 0, false),

	FMH24_66C( DieselH24_66C.class,  new ModelH24_66C(), "FM_H24-66_C_", true,new float[] {-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.78D, 1.35D, 0.15D});
			add(new double[]{0.78D, 1.35D, -0.15D});
		}
	}, "", null, 0, false),

	/**OTHER DIESELS**/
	NRE3gs21b( DieselNRE3gs21b.class,  new ModelNRE3gs21b(), "3gs21b_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.15D, 1.3D, 0.0D}); //farthest from cab
			add(new double[]{1.05D, 1.3D, 0.0D}); //middle
			add(new double[]{2.0D, 1.3D, 0.0D}); // closest to cab
		}
	}, "", null, 0, false),
	gtavthing( Dieselgtavthing.class,  new Modelgtavthing(), "gtavthing_", true,new float[] {-1.5F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.8D, 1.2D, 0.0D});
		}
	}, "", null, 0, false),
	FOLM1B(DieselFOLM1B.class, new ModelFOLM1B(), "FOL_M1b_", true, new float[] { -2.2F, 0.05F, 0.F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.6D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	//BUnitFOLM1B(BUnitFOLM1B.class, new ModelFOLM1B(), "FOL_M1b_", true, new float[]{-0.25F, 0.05F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),

	Krautt(DieselKrautt.class,  new ModelKrautt(), "KM_ML4000_", true,new float[]{-1.6F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.57D, 1.3D, 0.0D});
			add(new double[]{2.5D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),

	DD55( DieselDD55.class,  new ModelDD55(), "DD55_", true,new float[]{-1.45F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 12,  new ArrayList<double[]>() {
		{
			add(new double[]{2.1D, 1.2D, 0.475D});
			add(new double[]{2.1D, 1.2D, -0.475D});
		}
	}, "", null, 0, false),
	TB27( DieselTB27.class,  new ModelTB27(), "tb27_", true,new float[] {-1.4F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{0.95D, 1.25D, 0.0D});
			add(new double[]{1.75D, 1.25D, 0.0D});
		}
	}, "", null, 0, true),

	SlugMA(SlugMA.class, new Modelslugma(), "SMA_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),
	SMSC1(SMSC1.class, new ModelSMSC1(), "SMSC1_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),
	CEEslug(ElectricCEEslug.class,  new ModelCEEslug(), "CEEslug_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SBMS(SBMS.class, new ModelSBMS(), "SBMS_", true, new float[]{-0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),
	//F7BSlug(F7BSlug.class, new ModelF7b(), "SBMS_", true, new float[]{-0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "", 0, null, "", null, 0, false),
	//gonna come back and fix this at a later date

	RotaryPlow(RotaryPlow1.class, new ModelRotaryPlow(), "RotaryPlow_", true,new float[]{-0.90F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**ELECTRICC**/
	EF1(ElectricEF1.class,  new ModelEF1(), "ef1_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EF1B(ElectricEF1B.class,  new ModelEF1B(), "ef1b_", true,new float[] {-1.15635F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EP1A(ElectricEP1A.class,  new ModelEP1A(), "ep1a_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	GM6C(ElectricGM6C_2.class,  new ModelGM6C_V2(), "gm6c_", true,new float[]{-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	JT7(ElectricJT7.class, new ModelJT7(), "jt7_bigJ_", true, new float[]{-2F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	AEM7(ElectricAEM7.class, new ModelAEM7(), "AEM-7_", true, new float[]{-1.15F, 2.5F, 0F}, new float[] { 0F, 180F, 180F }, new float[] { 4F, 4.5F, 4F }, "", 0, null, "", null, 0, false),

	B_BEL(ElectricB_BEL.class,  new ModelB_BEL(), "b-bel_", true,new float[]{-1.525F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**FREIGHT**/
	RoundHopper(RoundHopper.class, new ModelRoundHopper(), "roundedhopper_", true, new float[] { -0F,0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	RibbedHopper(RibbedHopper.class, new ModelRibbedHopper(), "ribbed_hopper_", true, new float[] { -0F,0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper5201(Hopper5201.class, new ModelHopper5201(), "5201_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper6260(Hopper6260.class, new ModelHopper6260(), "6260_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC2375Hopper(FNCC2375Hopper.class, new ModelFNCC2375Hopper(), "FNCC2375_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PDH2800(PDH2800.class, new ModelPDH2800(), "gatx_2800_pdh_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACF2Bay(ACF2Bay.class, new ModelACF2Bay(), "acf_2980_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACF4650(ACF4650.class, new ModelACF4650(), "acf_4650_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS2_4750(PS2_4750.class, new ModelPS2_4750(), "ps2cd_4750_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GATC4180Airslide(GATC4180Airslide.class, new ModelGATC4180Airslide(), "GATX_Airslide_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACF3500(ACF3500.class, new ModelACF3500(), "ACF_3500_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACF3960(ACF3960.class, new ModelACF3500(), "ACF_3960_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Freight60centerbeam(Freight60centerbeam.class, new Model60centerbeam(),"60ftcb_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight66centerbeam(Freight66centerbeam.class, new Model66centerbeam(),"66ftcb_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight73centerbeam(Freight73centerbeam.class, new Model73centerbeam(),"73ftcb_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSI60FootBulkhead(GSI60FootBulkhead.class, new ModelGSI60FootBulkheadFlat(),"gsi_60bulk_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSC60FootFlat(GSC60FootFlat.class, new ModelGSI60FootBulkheadFlat(),"gsc_60flat_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Thrall63centerbeam(Thrall63centerbeam.class, new Modelthrall63centerbeam(),"thrall63centerbeam_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC60FootBulk(FNCC60FootBulk.class, new ModelFNCC60FootBulk_fix(),"FNCC60FootBulk_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSC53FootFlat(GSC53FootFlat.class, new ModelGSC53FootBulkheadFlat(),"gsc_53flat_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSC53Foot6_6Bulkhead(GSC53Foot66Bulkhead.class, new ModelGSC53FootBulkheadFlat(),"gsc_53_66flat_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSC53Foot8_6Bulkhead(GSC53Foot86Bulkhead.class, new ModelGSC53FootBulkheadFlat(),"gsc_53_86flat_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MaPa35FootFlat(MaPa35FootFlat.class, new ModelMaPa35FootFlat(),"MaPa_35flat_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PS140(PS140.class, new ModelPS140(),"ps140_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS150(PS150.class, new ModelPS150(),"ps150_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS160(PS160.class, new ModelPS160(),"ps160_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OWO60Verticube(OWO60Verticube.class, new ModelFNCC60FootVerticube(),"verticube60_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW40boxcar(MILW40boxcar.class, new ModelMILW40boxcar(),"milw40_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight40highcube(Freight40highcube.class, new Model40highcube(),"40highcube_", true, new float[]{-0F, 0.09F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hicube60(Hicube60foot.class, new Modelhicube60foot(),"hicube60_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Reefer64(Reefer64Foot.class, new ModelReefer64Foot(),"reefer_64_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC50Foot(FNCC50Foot.class, new ModelFNCC50Foot(),"FNCC50Foot_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GN40(GN40.class, new ModelGN40box(),"gn40_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	R70Reefer(R70Reefer.class, new ModelR70Reefer(),"R70Reefer_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	R70Reefer2(R70Reefer2.class, new ModelR70Reefer2(),"R-70-15_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	NSCReefer(NSCReefer.class, new ModelNSCReefer(),"NSCReefer_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PCF6033(PCF6033.class, new ModelPCF6033(),"pcf_6033_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PCF_RBL_Smooth(PCF_RBL_Smooth.class, new ModelPCF_RBL_Smoothbrain(),"pcf_rbl_smooth_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PCF_RBL_Ribbed(PCF_RBL_Ribbed.class, new ModelPCF_RBL_Ribbed(),"pcf_rbl_ribbed_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PCF_B100(PCF_B100.class, new ModelPCF_B100_40(),"pcf_b_100_40_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFRailbox(ACFRailbox.class, new ModelACFRailbox(),"ACFRailbox_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFRailboxCushioned(ACFRailboxCushioned.class, new ModelACFRailboxCushioned(),"ACFRailboxCushioned_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Evans5100(Evans5100.class, new ModelEvans5100(),"Evans_5100_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Wood1912Boxcar(Wood1912Boxcar.class, new Model1912WoodBoxcar(),"1912_wood_boxcar_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS_40t_ss_box(PS_40t_ss_box.class, new ModelPS_40t_ss_box(),"ps_40t_ss_box_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SP_B50(SP_B50.class, new ModelSP_B50(),"sp_b_50_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SP_B50_AAR(SP_B50_AAR.class, new ModelSP_B50_AAR(),"sp_b_50_28_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PFEr_40_23Reefer(PFEr_40_23Reefer.class, new ModelPFEr_40_23Reefer(),"PFEr_40_23Reefer_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	VersaLongi(VersaLongi.class, new ModelVersaLongi(),"versa_longi_", true,  new float[]{-0F, 0.10F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	VersaTrans(VersaTrans.class, new ModelVersaTrans(),"versa_trans_", true, new float[]{-0F, 0.10F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MillGondola(MillGondola.class, new ModelMillGondola(),"MillGondola_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	WoodchipHopper(WoodchipHopper.class, new ModelWoodchipHopper(),"woodchiphopper_", true, new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OreJenny(OreJenny.class, new ModelOreJenny(),"orejenny_", true,  new float[]{-0F, 0.1F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PRRGLaHopper(PRRGLaHopper.class, new ModelPRRGLaHopper(),"PRR_GLa_hopper_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACF41Gon(ACF41Gon.class, new ModelACF41Gon(),"acf_41-6_gon_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BethgonII(BethgonII.class, new ModelBethgonII(),"Bethgon_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	gsco67millgon(gsco67millgon.class, new Model67millgon(),"gsco_67_millgon_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	gsco52millgon(gsco52millgon.class, new Modelgsco52millgon(),"gsco_52_millgon_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	AAR50TonHopper(AAR50TonHopper.class, new ModelAAR50TonHopper(),"AAR_50_ton_hopper_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	AAR70TonHopper(AAR70TonHopper.class, new ModelAAR70TonHopper(),"AAR_70_ton_hopper_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MaPa35FootGondola(MaPa35FootGondola.class, new ModelMaPa35FootGondola(),"MaPa_35gondola_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	DOT11111000(DOT11111000.class, new Model11000DOT111(),"dot11K_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11120600(DOT11120600.class, new Model20600DOT111(),"dot206K_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11129080(DOT11129080.class, new Model29080DOT111(),"dot290K_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11117600(DOT11117600.class, new Model17600DOT111(),"17600galTank_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	NATX30600(NATX30600.class, new ModelNATX30600(),"natx_30600_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	gatc10000(GATC10000.class, new Modelgatc10000(),"gatc_10000_gal_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DUPX39200(DUPX39200.class, new ModelDUPX39200(),"dupx_39200_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	CoffinCar(CoffinCar.class, new ModelCoffinCar(), "CoffinCar_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Skeleton(SkeletonLogCar.class, new ModelSkeletonLogCar(), "SkeletonLogCar_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EarlyFlat(EarlyFlat.class, new ModelEarlyFlat(), "EarlyFlatCar", false, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Gunderson89FootAutorack(Gunderson89ftAutorack.class, new ModelGunderson89FootAutorack(), "89ftAutorack_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Gunderson89FootFlat(Gunderson89ftFlat.class, new ModelGunderson89FootFlat(), "89ftFlat_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	StampedeRack(StampedeRack.class, new ModelStampedeRack(), "cswr_stampederack_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HuskyStackWellcar(HuskyStack2.class, new ModelHuskyStackWellcar(), "40FT_Husky_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	IngotPig(IngotPig.class, new ModelIngotPig(),"MoltenIngotPig_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SteelSlabFlat(SteelSlabFlat.class, new ModelSteelSlabFlat(),"steelslab15_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EvansCoilCar(EvansCoilCar.class, new ModelEvansCoilCar(), true,"EvansCoilCar_", true, new float[]{-0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**PASSENGER**/
	pch120commute(PCH120Commute.class, new ModelPCH120Commute(), "pch120commute_", true,new float[] {-1.3F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch120coach(PCH120Coach.class, new ModelPCH120Car(), "pch120car_", true,new float[] {0F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch130commute2(PCH130Commute2.class, new ModelPCH130Commute2(), "pch130commute2_", true,new float[]{-1.7F, 0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch130coach2(PCH130Coach.class, new ModelPCH130Coach2(), "pch130coach_", true,new float[]{0.05F, 0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSRPO(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.PSRPO.class, new ModelPSRPO(), "PS_lightweight_RPO_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS85Baggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.PS85Baggage.class, new ModelPS85Baggage(), "PS_lightweight_85_baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCombine(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCombine.class, new ModelPSCombine(), "PS_lightweight_baggage-coach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS52SeatCoach(PS52SeatCoach.class, new ModelPS52SeatCoach(), "PS_lightweight_52seat_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSDamnitAnotherDiner(PSDamnitAnotherDiner.class, new ModelPSscrewyoutoomanydiners(), "PS_lightweight_center_diner_2_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSSleeper565(PSSleeper565.class, new ModelPSSleeper565(), "PS_lightweight_5-6-5_sleeper_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSSleeper565DRGW(PSSleeper565DRGW.class, new ModelPSSleeper565DRGW(), "PS_DRGW_lightweight_5-6-5_sleeper_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPSLunchCounter_Lounge(PSLunchCounter_Lounge.class, new ModelPSLunchCounter_Lounge(), "PS_lightweight_LunchCounter_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPS30SeatParlor(PS30SeatParlor.class, new ModelPS30SeatParlor(), "PS_lightweight_30SeatParlor_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	DRGWRPO620Series(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.DRGWRPO620Series.class, new ModelDRGWRPO620Series(), "DRGW_RPO_620_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWRPO630Series(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.DRGWRPO630Series.class, new ModelDRGWRPO630Series(), "DRGW_RPO_630_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWBaggage700Series(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.DRGWBaggage700Series.class, new ModelDRGWBaggage700Series(), "DRGW_Baggage_700_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWBaggage740Series(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.DRGWBaggage740Series.class, new ModelDRGWBaggage740Series(), "DRGW_Baggage_740_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWCoach1000Series(DRGWCoach1000Series.class, new ModelDRGWCoach1000Series(), "DRGW_Coach_1000_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWCoach1005Series(DRGWCoach1005Series.class, new ModelDRGWCoach1005Series(), "DRGW_Coach_1005_Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSRPOPM(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.PSRPOPM.class, new ModelPSRPOPM(), "PS_lightweight_RPO_PM_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS73Baggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.PS73Baggage.class, new ModelPS73Baggage(), "PS_lightweight_73_Baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS54SeatCoach_Lounge(PS54SeatCoach_Lounge.class, new ModelPS54SeatCoach_Lounge(), "PS_lightweight_54SeatCoach_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS54SeatCoach_Lounge1950(PS54SeatCoach_Lounge_1950.class, new ModelPS54SeatCoach_Lounge_1950(), "PS_lightweight_54SeatCoach_Lounge_1950_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PScenterDiner(PScenterDiner.class, new ModelPScenterDiner(), "PS_lightweight_center_diner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS58SeatCoach_Observation(PS58SeatCoach_Observation.class, new ModelPS58SeatCoach_Observation(), "PS_lightweight_58SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSBMCombine(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSBMCombine.class, new ModelPSBMCombine(), "PS_lightweight_BMCombine_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSBM56SeatCoach(PSBM56SeatCoach.class, new ModelPSBM56SeatCoach(), "PS_lightweight_BM56SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSBMDiner_Lounge(PSBMDiner_Lounge.class, new ModelPSBMDiner_Lounge(), "PS_lightweight_BMDiner_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ACFGNRPO_30(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.ACFGNRPO_30.class, new ModelACFGNRPO_30(), "AC&F_lightweight_GNRPO30_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGN60SeatCoach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN60SeatCoach.class, new ModelACFGN60SeatCoach(), "AC&F_lightweight_GN60SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGNDinerObservation(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGNDinerObservation.class, new ModelACFGNDinerObservation(), "AC&F_lightweight_GNDiner_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGN28SeatCoach_Dinette(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN28SeatCoach_Dinette.class, new ModelACFGN28SeatCoach_Dinette(), "AC&F_lightweight_GN28SeatCoach_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGN1DR_17SeatParlor_Observation(ACFGN1DR_17SeatParlorObservation.class, new ModelACFGN1DR_17SeatParlorObservation(), "AC&F_lightweight_1DR_177SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSGNRPO_30(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.PSGNRPO_30.class, new ModelPSGNRPO_30(), "PS_lightweight_GNRPO30_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	OB84SeatCoach(OB84SeatCoach.class, new ModelOB84SeatCoach(), "OB_lightweight_84SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OB92SeatCoach(OB92SeatCoach.class, new ModelOB92SeatCoach(), "OB_lightweight_92SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBNHGrillCar(OBNHGrillCar.class, new ModelOBNHGrillCar(), "OB_lightweight_NHGrillCar_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBNHLounge5107(OBNHLounge5107.class, new ModelOBNHLounge5107(), "OB_lightweight_NHLounge5107_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBBaggage_52SeatDividedCoach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.OBBaggage_52SeatDividedCoach.class, new ModelOBBaggage_52SeatDividedCoach(), "OB_lightweight_Baggage_52SeatDividedCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OB76SeatDividedCoach(OB76SeatDividedCoach.class, new ModelOB76SeatDividedCoach(), "OB_lightweight_76SeatDividedCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBLV82_92SeatCoach(OBLV82_92SeatCoach.class, new ModelOBLV82_92SeatCoach(), "OB_lightweight_LV82_92SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBRPO15(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.OBRPO15.class, new ModelOBRPO15(), "OB_lightweight_RPO15_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OB24SeatCoach_Dinette(OB24SeatCoach_Dinette.class, new ModelOB24SeatCoach_Dinette(), "OB_lightweight_24SeatCoach_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OBBAR52SeatCoach_Dinette(OBBAR52SeatCoach_Dinette.class, new ModelOBBAR52SeatCoach_Dinette(), "OB_lightweight_BAR52SeatCoach_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSCNW56SeatCoach(PSCNW56SeatCoach.class, new ModelPSCNW56SeatCoach(), "PS_lightweight_CNW56SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW48SeatCoach_Lounge(PSCNW48SeatCoach_Lounge.class, new ModelPSCNW48SeatCoach_Lounge(), "PS_lightweight_CNW48SeatCoach_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW20SeatCoach_Lounge(PSCNW20SeatCoach_Lounge.class, new ModelPSCNW20SeatCoach_Lounge(), "PS_lightweight_CNW20SeatCoach_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW36SeatCoach_Dinette(PSCNW36SeatCoach_Dinette.class, new ModelPSCNW36SeatCoach_Dinette(), "PS_lightweight_CNW36SeatCoach_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW56SeatDiner(PSCNW56SeatDiner.class, new ModelPSCNW56SeatDiner(), "PS_lightweight_CNW56SeatCoachDiner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW48SeatDiner(PSCNW48SeatDiner.class, new ModelPSCNW48SeatDiner(), "PS_lightweight_CNW48SeatCoachDiner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW1DR_22SeatParlor(PSCNW1DR_22SeatParlor.class, new ModelPSCNW1DR_22SeatParlor(), "PS_lightweight_CNW1DR_22SeatParlor_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW16_1_3Sleeper(PSCNW16_1_3Sleeper.class, new ModelPSCNW16_1_3Sleeper(), "PS_lightweight_CNW16_1_3Sleeper_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW12SeatParlor_Observation(PSCNW12SeatParlor_Observation.class, new ModelPSCNW12SeatParlor_Observation(), "PS_lightweight_CNW12SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWRPO15(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.PSCNWRPO15.class, new ModelPSCNWRPO15(), "PS_lightweight_CNWRPO15_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWRPO60(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.PSCNWRPO60.class, new ModelPSCNWRPO60(), "PS_lightweight_CNWRPO60_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWBaggage_LC_Lounge(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCNWBaggage_LC_Lounge.class, new ModelPSCNWBaggage_LC_Lounge(), "PS_lightweight_CNWBaggage_LC_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWRPO15_Baggage_LC_Lounge(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCNWRPO15_Baggage_LC_Lounge.class, new ModelPSCNWRPO15_Baggage_LC_Lounge(), "PS_lightweight_CNWRPO15_Baggage_LC_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWBaggage_LC_Diner(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCNWBaggage_LC_Diner.class, new ModelPSCNWBaggage_LC_Diner(), "PS_lightweight_CNWBaggage_LC_Diner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW20SeatCoach_Lounge_1959(PSCNW20SeatCoach_Lounge_1959.class, new ModelPSCNW20SeatCoach_Lounge_1959(), "PS_lightweight_CNW20SeatCoach_Lounge_1959_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNWCommuterLounge(PSCNWCommuterLounge.class, new ModelPSCNW20SeatCoach_Lounge_1959(), "PS_lightweight_CNWCommuterLounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCNW27SeatParlor_Observation(PSCNW27SeatParlor_Observation.class, new ModelPSCNW27SeatParlor_Observation(), "PS_lightweight_CNW27SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddRDG56SeatCoach_Lounge(BuddRDG56SeatCoach_Lounge.class, new ModelBuddRDG56SeatCoach_Lounge(), "Budd_lightweight_RDG56SeatCoach_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddRDGDiner_Lounge(BuddRDGDiner_Lounge.class, new ModelBuddRDGDiner_Lounge(), "Budd_lightweight_RDGDiner_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddRDG56SeatCoach_Observation(BuddRDG56SeatCoach_Observation.class, new ModelBuddRDG56SeatCoach_Observation(), "Budd_lightweight_RDG56SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddCRIP52SeatCoach(BuddCRIP52SeatCoach.class, new ModelBudd52SeatCoach(), "Budd_lightweight_52SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddNYC52SeatCoach(BuddNYC52SeatCoach.class, new ModelBudd52SeatCoach(), "Budd_lightweight_52SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddCBQ52SeatCoach(BuddCBQ52SeatCoach.class, new ModelBudd52SeatCoach(), "Budd_lightweight_52SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddDome46SeatCoach(BuddDome46SeatCoach.class, new ModelBuddDome46SeatCoach(), "Budd_lightweight_Dome46SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddCBQDome50SeatCoach(BuddCBQDome50SeatCoach.class, new ModelBuddCBQDome50SeatCoach(), "Budd_lightweight_CBQDome50SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddPrewarBaggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.BuddPrewarBaggage.class, new ModelBuddPrewarBaggage(), "Budd_lightweight_Prewar_Baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddATSF52SeatCoach(BuddATSF52SeatCoach.class, new ModelBuddATSF52SeatCoach(), "Budd_lightweight_ATSF52SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddATSF48SeatCoach(BuddATSF48SeatCoach.class, new ModelBuddATSF52SeatCoach(), "Budd_lightweight_ATSF52SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddATSF50SeatCoach_Observation(BuddATSF50SeatCoach_Observation.class, new ModelBuddATSF50SeatCoach_Observation(), "Budd_lightweight_ATSF50SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddATSF34SeatParlor_Observation(BuddATSF34SeatParlor_Observation.class, new ModelBuddATSF50SeatCoach_Observation(), "Budd_lightweight_ATSF50SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddATSF58SeatCoach_Observation(BuddATSF58SeatCoach_Observation.class, new ModelBuddATSF50SeatCoach_Observation(), "Budd_lightweight_ATSF50SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSATSF50SeatCoach_Observation(PSATSF50SeatCoach_Observation.class, new ModelPSATSF50SeatCoach_Observation(), "PS_lightweight_ATSF50SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ACF_SP_98seatcoach(ACF_SP_98seatcoach.class, new ModelACF_SP_98seatcoach(), "acf_sp_72_c_1_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ACFUPRPO60(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.ACFUPRPO60.class, new ModelACFUPRPO60(), "AC&F_lightweight_UPRPO60_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddDome54SeatCoach(BuddDome54SeatCoach.class, new ModelBuddDome54SeatCoach(), "Budd_lightweight_Dome54SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSCEIRPO15_Baggage_LC_Lounge(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCEIRPO15_Baggage_LC_Lounge.class, new ModelPSCEIRPO15_Baggage_LC_Lounge(), "PS_lightweight_CEIRPO15_Baggage_LC_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCEIRPO15_Baggage_38SeatCoach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSCEIRPO15_Baggage_38SeatCoach.class, new ModelPSCEIRPO15_Baggage_38SeatCoach(), "PS_lightweight_CEIRPO15_Baggage_38SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCEI60SeatCoach(PSCEI60SeatCoach.class, new ModelPSCEI60SeatCoach(), "PS_lightweight_CEI60SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCEIDiner(PSCEIDiner.class, new ModelPSCEIDiner(), "PS_lightweight_CEIDiner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCEI1DR_28SeatParlor_Observation(PSCEI1DR_28SeatParlor_Observation.class, new ModelPSCEI1DR_28SeatParlor_Observation(), "PS_lightweight_CEI1DR_28SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	OBHWNH5570_5589(OBHWNH5570_5589Baggage.class, new ModelOBHWNH5570_5589Baggage(), "OB_heavyweight_NH5570_5589Baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	BuddCN68SeatCoach_Observation(BuddCN68SeatCoach_Observation.class, new ModelBuddCN68SeatCoach_Observation(), "Budd_lightweight_CN68SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddCNCoach(BuddCNCoach.class, new ModelBuddCNCoach(), "Budd_lightweight_CNCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddCNDiner_Lounge(BuddCNDiner_Lounge.class, new ModelBuddCNDiner_Lounge(), "Budd_lightweight_CNDiner_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddCN39SeatParlor_Observation(BuddCN39SeatParlor_Observation.class, new ModelBuddCN39SeatParlor_Observation(), "Budd_lightweight_CN39SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	BuddCN59SeatCoach_Observation(BuddCN59SeatCoach_Observation.class, new ModelBuddCN59SeatCoach_Observation(), "Budd_lightweight_CN59SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	NSCCNBaggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.NSCCNBaggage.class, new ModelNSCCNBaggage(), "NSC_lightweight_CNBaggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSSOUBaggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.PSSOUBaggage.class, new ModelPSSOUBaggage(), "PS_lightweight_SOUBaggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSSOURPO_30(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.PSSOURPO_30.class, new ModelPSSOURPO_30(), "PS_lightweight_SOUPO30_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PRECOPendulumCoach(PRECOPendulumCoach.class, new ModelPRECOPendulumCoach(), "PRECO_lightweight_PendulumCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSFNCCBaggage_Dinette(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.PSFNCCBaggage_Dinette.class, new ModelPSFNCCBaggage_Dinette(), "PS_lightweight_FNCCBaggage_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	NYCPrewar56SeatCoach(NYCPrewar56SeatCoach.class, new ModelNYCPrewar56SeatCoach(), "NYC_lightweight_Prewar56SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	MILWPrewarBaggage(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.MILWPrewarBaggage.class, new ModelMILWPrewarBaggage(), "MILW_prewar_baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935Baggage_Dinette(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.MILW1935Baggage_Dinette.class, new ModelMILW1935Baggage_Dinette(), "MILW1935Baggage_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935Tap_Dinette(MILW1935Tap_Dinette.class, new ModelMILW1935Tap_Dinette(), "MILW1935Tap_Dinette_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935_48SeatCoach(MILW1935_48SeatCoach.class, new ModelMILW1935_48SeatCoach(), "MILW1935_48SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935_22SeatParlor(MILW1935_22SeatParlor.class, new ModelMILW1935_22SeatParlor(), "MILW1935_22SeatParlor_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935_21SeatParlor_Observation(MILW1935_21SeatParlor_Observation.class, new ModelMILW1935_21SeatParlor_Observation(), "MILW1935_21SeatParlor_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935_44SeatCoach_Observation(MILW1935_44SeatCoach_Observation.class, new ModelMILW1935_44SeatCoach_Observation(), "MILW1935_44SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW1935Dorm_56SeatCoach(MILW1935Dorm_56SeatCoach.class, new ModelMILW1935Dorm_56SeatCoach(), "MILW1935Dorm_56SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ACF_LN_KCS60SeatDividedCoach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACF_LN_KCS60SeatDividedCoach.class, new ModelACF_LN_KCS60SeatDividedCoach(), "AC&F_LN_KCS60SeatDividedCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	LNCoach2551Series(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.LNCoach2551Series.class, new ModelLNCoach2551Series(), "LNCoach2551Series_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	MON_LightweightCoach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.MON_LightweightCoach.class, new ModelMON_LightweightCoach(), "MON_LightweightCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	amfleet(Amfleet.class, new ModelAmfleet(),"amfleet_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amfleet2(Amfleet2.class, new ModelAmfleet2(),"amfleet2_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amfleetCab(AmfleetCab.class, new ModelAmfleetCab(),"amfleet_Cabber_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amCafe(AmCafe.class, new ModelAmCafe(),"amcafe_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amCafe2(AmCafe2.class, new ModelAmCafe2(),"amcafe2_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PEcoach(PEcoach.class, new ModelPEcoach(),"PECoach_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PEobserve(PEobserve.class, new ModelPEobserve(),"PEObserve_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**CABOOSE**/
	WVcaboose(WVcaboose.class, new ModelWVcaboose(),"wvcaboose_", true, new float[]{0F, 0.1675F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HBC1C(HBC1Cboose.class, new ModelHBC1C(),"HBC1C_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HBC1B(HBC1Bboose.class, new ModelHBC1B(),"HBC1B_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DRGWCaboose(DRGWboose.class, new ModelDRGW01400Caboose(),"BAP_DRGW_01400_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ICC_Bobber(ICC_Bobber.class, new ModelICC_Bobber(),"icc_bobber_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ICCBaywindowWP(ICCBaywindowWP.class, new ModelICCBaywindowWP(),"iccbaywindow_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CA11(CA11.class, new ModelCA11(),"icc_ca11_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	WPShops600Series(WPShops600Series.class, new ModelWPShops600Series(),"wp680series_", true, new float[]{-0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CDCScaboose(CDCScaboose.class, new ModelCDCScaboose(),"CDCScaboose_", true, new float[]{0F, 0.1675F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**INTERURBAN AND STREETCAR **/
	W_A11(ElectricW_A11.class, new ModelW_A11(), "W_A11_", true, new float[]{-1.25F, 0.16F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	W_A55(ElectricW_A55.class, new ModelW_A55(), "W_A55_", true, new float[]{-1.25F, 0.16F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	W_A55_Combine(ElectricW_A55_Combine.class, new ModelW_A55_Combine(), "W_A55_Combine_", true, new float[]{-1.25F, 0.16F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**OTHER ROLLING SHIZZLE**/
	BigMeme(BigMeme.class, new ModelBigMeme(),"bigmeme_", true, new float[]{-1F, 0.1875F, 0F}, new float[] { 180F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	BombCart(BombCart.class, new ModelBombCart(), "payload_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Thanos(Thanos.class, new ModelLocoMinetrain(), "thanos", false, new float[] {-0.8F, -0.47F, 0.0F},  new float[] { 0F, 0F, 0F }, null, "", 0, null, "", null, 0, false),
	TGVmobile(DieselTGVmobile.class,  new ModelTGVMobile(), "tgvmobile_Orange", false, new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HHgregg(DieselHHgregg.class,  new ModelHH660(), "hhgregg", false, new float[] {-1F, -0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),


	KawasakiLRV(ElectricKawasakiLRV.class, new ModelSeptaLRV(), "kawasaki_white", false, new float[]{-1.5F, 0.12F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CQ310PO(ElectricCQ310PO.class, new Modelcq310(), "CQ_310_", true, new float[]{-1.5F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CQ310PA(CQ310PA.class, new Modelcq310_again(), "CQ_310_", true, new float[]{0.0F, 0.155F, 0F}, new float[] { 180F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	PCC(ElectricPCC.class, new ModelPCC(), "Pcc_", true, new float[]{-1.5F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Class74(ElectricClass74.class, new Modelclass74(), "Class_74_", true, new float[]{-1.0F, 0.15F, 0.00F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	TwoBil(ElectricTwoBil.class, new ModelTwoBilEngine(), "2-bil_", true, new float[]{-1.65F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	TwoBilTail(PassengerTwoBilTail.class, new ModelTwoBilTail(), "2-bil_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	FourCor(ElectricFourCor.class, new ModelFourCorEngine(), "4-cor_", true, new float[]{-1.8F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FourCorTrailerComposite(PassengerFourCorTrailerComposite.class, new ModelFourCorTrailerComposite(), "4-cor_trailer_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	FourCorTrailerSecond(PassengerFourCorTrailerSecond.class, new ModelFourCorTrailerSecond(), "4-cor_trailer_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	FourBuf(PassengerFourBuf.class, new ModelFourBuf(), "4-buf_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	FourCorTail(PassengerFourCorTail.class, new ModelFourCorTail(), "4-cor_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	tenderNS3700(EntityTenderNS3700.class, new ModelNS3700Tender(), "ns_3700_tender", false, new float[]{ 0.0f, 0.18f, 0.0f}, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	locoNS3700Class(EntityLocoSteamNS3700Class.class, new ModelNS3700Class(), "ns_3700_class", false, new float[]{ -1.3f, 0.18f, 0.0f}, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.5D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.65D, -0.05D, 0.65D });
		}
	}, 2, true),

	WorkdayHyrail( DieselWorkdayHyrail.class,  new ModelWorkdayHyrail(), "workday_hyrail_", true,new float[] {-1.0F, 0.155F, 0.00F},  new float[] { 0F, 180F, 180F }, null, "smoke", 1,  new ArrayList<double[]>() {
		{
			add(new double[]{-0.2D, -0.6D, -0.6D});
		}
	}, "", null, 0, false),
	;

	private Class<? extends AbstractTrains> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private boolean isTextureInsideFolder = false;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 * @see RenderRollingStock
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass,
			   ModelBase model, String texture,
			   boolean multiTexture,
			   float[] trans,
			   float[] rotate,
			   float[] scale,
			   String smokeType,
			   int smokeIterations,
			   ArrayList<double[]> smokeFX,
			   String explosionType,
			   ArrayList<double[]> explosionFX,
			   int explosionFXIterations,
			   boolean hasSmokeOnSlopes)
	{
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
	}

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param isTextureInsideFolder isTextureInsideFolder identifes if the textures are inside a folder for that specific rollingstock
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 * @see RenderRollingStock
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass,
			   ModelBase model,
			   boolean isTextureInsideFolder,
			   String texture,
			   boolean multiTexture,
			   float[] trans,
			   float[] rotate,
			   float[] scale,
			   String smokeType,
			   int smokeIterations,
			   ArrayList<double[]> smokeFX,
			   String explosionType,
			   ArrayList<double[]> explosionFX,
			   int explosionFXIterations,
			   boolean hasSmokeOnSlopes
	)
	{
		this (entityClass, model, texture, multiTexture, trans, rotate, scale, smokeType, smokeIterations, smokeFX, explosionType, explosionFX, explosionFXIterations, hasSmokeOnSlopes);
		this.isTextureInsideFolder = isTextureInsideFolder;
	}

	public Class<? extends AbstractTrains> getEntityClass() {
		return entityClass;
	}

	public ModelBase getModel() {
		return model;
	}

	@Override
	public String getTexturePrefix()
	{
		return texture;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

	public float[] getTrans() {
		return trans;
	}

	public float[] getRotate() {
		return rotate;
	}

	public float[] getScale() {
		return scale;
	}

	public String getTexture() {
		return texture;
	}

	/** True if the textures for the RollingStock have a folder dedicated for that RollingStock
	 *
	 * @return
	 */
	public boolean isInsideFolder()
	{
		return isTextureInsideFolder;
	}

	@Override
	public String GetModID()
	{
		return Info.resourceLocation;
	}

	public ResourceLocation getTextureFile(String colorAsString)
	{
		if (this.getIsMultiTextured())
		{
			if (this.isInsideFolder())
			{
				return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + this.getTexture() + "/" + this.getTexture() + colorAsString + ".png");
			}
			else
			{
				return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + this.getTexture() + colorAsString + ".png");
			}
		}
		else
		{
			return new ResourceLocation(Info.resourceLocation, Info.trainsPrefix + this.getTexture() + ".png");
		}
	}

	@Override
	public SubTrainRenderRecord getSubTrainRenderRecord(short recordID)
	{
		return new SubTrainRenderRecord(this.smokeType, this.smokeFX, this.explosionType, this.explosionFX, (short) this.smokeIterations, (short)this.explosionFXIterations);
	}
}
