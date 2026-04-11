package train.common.library;

import net.minecraft.item.Item;
import train.common.Traincraft;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.*;
import train.common.entity.rollingStock.diesel.*;
import train.common.entity.rollingStock.steam.*;
import train.common.entity.rollingStock.electric.*;
import train.common.entity.rollingStock.freight.*;
import train.common.entity.rollingStock.passenger.*;
import train.common.entity.rollingStock.passenger.baggagecar.*;
import train.common.entity.rollingStock.passenger.rpo.*;
import train.common.entity.rollingStock.tanker.*;
import train.common.entity.rollingStock.tender.*;
import train.common.entity.rollingStock.workcart.*;
import train.common.library.register.ITrainRecord;
import train.common.library.register.TrainRecord;

import java.util.LinkedHashMap;

import static train.common.enums.InventorySize.STYLE_PROFILE_4x9;
import static train.common.enums.InventorySize.STYLE_PROFILE_6x9;

public class RegisterTrains
{
    public RegisterTrains()
    {
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntities(
                        new LinkedHashMap<Item, ITrainRecord>()
                        {{
                            put(ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                18));


                               put(ItemIDs.minecartPassengerBlue.item,
                                        new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                                18)
                                );

                               put(ItemIDs.minecartPassenger2.item,
                                        new TrainRecord("Passenger Small Black", EntityPassenger2.class, ItemIDs.minecartPassenger2.item, EnumTrainType.Passenger, 0.5,
                                                new String[]{"Black"},
                                                18)
                                );


                               put(ItemIDs.minecartPassenger5.item,
                                        new TrainRecord("Passenger Green Long", EntityPassenger5.class, ItemIDs.minecartPassenger5.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Green", "Yellow"},
                                                18)
                                );


                               put(ItemIDs.minecartPassenger7.item,
                                        new TrainRecord("Passenger Short Green", EntityPassenger7.class, ItemIDs.minecartPassenger7.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Black"},
                                                18)
                                );


                               put(ItemIDs.minecartPassenger8_1class_DB.item,
                                        new TrainRecord("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, EnumTrainType.Passenger, 1.5,
                                                new String[]{"Black"},
                                                18)
                                );
                                //passenger_1class_DB("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),

                               put(ItemIDs.minecartPassenger9_2class_DB.item,
                                        new TrainRecord("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, EnumTrainType.Passenger, 1.5,
                                                new String[]{"Green", "Cyan"},
                                                18)
                                );

                                //passenger_2class_DB("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Cyan"}));, 18, 0),

                               put(ItemIDs.minecartPassengerHighSpeedCarZeroED.item,
                                        new TrainRecord("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, EnumTrainType.Passenger, 2,
                                                new String[]{"White", "LightGrey", "Grey"},
                                                18)
                                );
                                //passengerHighSpeedZeroED("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey", "Grey"}));, 18, 0),


                               put(ItemIDs.minecartNYTram.item,
                                        new TrainRecord("Loco Electric Tram NY", EntityLocoElectricTramNY.class, ItemIDs.minecartNYTram.item, EnumTrainType.Passenger, 1,
                                                new String[] {"Grey", "White"},
                                                18).setMHP(2428).setMaxSpeed(160).setFuelConsumption(6).setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.965).setBogieLocoPosition(-3)
                                );

                               put(ItemIDs.minecartPassengerTramNY.item,
                                        new TrainRecord("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, EnumTrainType.Passenger, 1,
                                                new String[] {"Grey", "White"},
                                                18)
                                );
                             //passengerTramNY("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "White"}));, 18, 0),

                               put(ItemIDs.minecartPassengerAdler.item,
                                        new TrainRecord("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, EnumTrainType.Passenger, 0.5,
                                                new String[] {"Black"},
                                                18)
                                );
                                //passengerAdler("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),

                               put(ItemIDs.minecartPassengerDBOriental.item,
                                        new TrainRecord("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, EnumTrainType.Passenger, 1,
                                                new String[] {"Yellow", "Blue", "White"},
                                                18)
                                );
                                //passengerDBOriental("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "White"}));, 18, 0),

                               put(ItemIDs.minecartICE1_1stClass.item,
                                        new TrainRecord("Passenger ICE 1st Class", EntityPassengerICE_1class.class, ItemIDs.minecartICE1_1stClass.item, EnumTrainType.Passenger, 1.5,
                                                new String[]{"White", "Red"},
                                                10)
                                );


                               put(ItemIDs.minecartICE1_2ndClass.item,
                                        new TrainRecord("Passenger ICE 2nd Class", EntityPassengerICE_2class.class, ItemIDs.minecartICE1_2ndClass.item, EnumTrainType.Passenger, 1.5,
                                                new String[]{"White", "Red"},
                                                10)
                                );


                               put(ItemIDs.minecartICE1_Restaurant.item,
                                        new TrainRecord("ICE Restaurant", EntityPassengerICE_Restaurant.class, ItemIDs.minecartICE1_Restaurant.item, EnumTrainType.Passenger, 1.5,
                                                new String[]{"White", "Red"},
                                                10)
                                );


                               put(ItemIDs.minecartGS4_Passenger.item,
                                        new TrainRecord("Passenger GS4", EntityPassengerGS4.class, ItemIDs.minecartGS4_Passenger.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Orange", "White", "Yellow", "Brown", "Green", "Lime", "Red", "Grey", "Green", "LightGrey", "Blue", "Black", "LightBlue"},
                                                11)
                                );


                               put(ItemIDs.minecartGS4_Observatory.item,
                                        new TrainRecord("Passenger GS4 Observatory", EntityPassengerGS4_Observatory.class, ItemIDs.minecartGS4_Observatory.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"},
                                                11)
                                );


                               put(ItemIDs.minecartGS4_Tail.item,
                                        new TrainRecord("Passenger GS4 Tail", EntityPassengerGS4_Tail.class, ItemIDs.minecartGS4_Tail.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"},
                                                11)
                                );


                               put(ItemIDs.minecartDenverRioGrandePassenger.item,
                                        new TrainRecord("Passenger Denver Rio Grande", EntityPassengerDenverRioGrande.class, ItemIDs.minecartDenverRioGrandePassenger.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Yellow", "Red", "Green"},
                                                10)
                                );


                               put(ItemIDs.minecartDenverRioGrandeCombo.item,
                                        new TrainRecord("Passenger Denver Rio Grande Combo", EntityPassengerDenverRioGrandeCombo.class, ItemIDs.minecartDenverRioGrandeCombo.item, EnumTrainType.Passenger_Combine, 1,
                                                new String[]{"Yellow", "Red", "Green"},
                                                10).setCargoCapacity(18)
                                );


                               put(ItemIDs.minecartPassengerRheingold.item,
                                        new TrainRecord("Passenger Rheingold", EntityPassengerRheingold.class, ItemIDs.minecartPassengerRheingold.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime", "Cyan"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerRheingoldDining1.item,
                                        new TrainRecord("Rheingold Dining", EntityPassengerRheingoldDining1.class, ItemIDs.minecartPassengerRheingoldDining1.item, EnumTrainType.Passenger_Combine, 1.5,
                                                new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerRheingoldDining2.item,
                                        new TrainRecord("Rheingold Dining Alternate", EntityPassengerRheingoldDining2.class, ItemIDs.minecartPassengerRheingoldDining2.item, EnumTrainType.Passenger_Combine, 1.5,
                                                new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerRheingoldPanorama.item,
                                        new TrainRecord("Rheingold Panorama", EntityPassengerRheingoldPanorama.class, ItemIDs.minecartPassengerRheingoldPanorama.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Blue", "Red"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerMILW.item,
                                        new TrainRecord("Passenger MILW", EntityPassengerMILW.class, ItemIDs.minecartPassengerMILW.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Black"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerMILWTail.item,
                                        new TrainRecord("Passenger MILW Tail", EntityPassengerMILWTail.class, ItemIDs.minecartPassengerMILWTail.item, EnumTrainType.Passenger, 1,
                                                new String[]{"Black"},
                                                18)
                                );

                               put(ItemIDs.minecartPassengerBamboo.item,
                                        new TrainRecord("Bamboo Flatcar Passenger", EntityPassengerBamboo.class, ItemIDs.minecartPassengerBamboo.item, EnumTrainType.Passenger, 0.1,
                                                new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"},
                                                18)
                                );
                                /**
                                 * Caboose
                                 */

                               put(ItemIDs.minecartCaboose.item,
                                        new TrainRecord("Caboose Red", EntityCaboose.class, ItemIDs.minecartCaboose.item, EnumTrainType.Caboose, 0.5,
                                                new String[] {"Red"},
                                                18)
                                );

                               put(ItemIDs.minecartCaboose3.item,
                                        new TrainRecord("Caboose Black", EntityCaboose3.class, ItemIDs.minecartCaboose3.item, EnumTrainType.Caboose, 0.5,
                                                new String[] {"Black"},
                                                18)
                                );

                                /**
                                 * Specials
                                 **/
                               put(ItemIDs.minecartGWRBrakeVan.item,
                                        new TrainRecord("GWR Toad Brake Van", EntityGWRBrakeVan.class, ItemIDs.minecartGWRBrakeVan.item, "work", 0.7,
                                                new String[]{"Black"},
                                                18)
                               );

                               put(ItemIDs.minecartStockCar.item,
                                        new TrainRecord("Stock Cart", EntityStockCar.class, ItemIDs.minecartStockCar.item, "stock car", 2,
                                                new String[]{"Blue", "Red", "Yellow", "White"},
                                                18)
                               );
                               put(ItemIDs.minecartDRWGStockCar.item,
                                        new TrainRecord("DRWG Stock Cart", EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item, "stock car", 2,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartWork.item,
                                        new TrainRecord("Work Cart Yellow", EntityWorkCart.class, ItemIDs.minecartWork.item, "work", 0.7,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartFlatCart.item,
                                        new TrainRecord("Flat Cart", EntityFlatCart.class, ItemIDs.minecartFlatCart.item, EnumTrainType.Flatcars, 0.2,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartCabooseWork.item,
                                        new TrainRecord("Work Caboose", EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item, "work", 0.6,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartCabooseLogging.item,
                                        new TrainRecord("Caboose Logging", EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item, "work", 0.2,
                                                new String[]{"Red", "Cyan", "Grey"},
                                                18)
                               );
                               put(ItemIDs.minecartCabooseLoggingPRR.item,
                                        new TrainRecord("PRR Caboose Logging", EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item, "work", 0.2,
                                                new String[]{"Red", "Blue", "Green", "Orange"},
                                                18)
                               );
                               put(ItemIDs.minecartMailWagon_DB.item,
                                        new TrainRecord("Mail Wagon DB", EntityMailWagen_DB.class, ItemIDs.minecartMailWagon_DB.item, "work", 1,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartJukeBoxCart.item,
                                        new TrainRecord("JukeBox Cart", EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item, "special", 0.2,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartFlatCartSU.item,
                                        new TrainRecord("Flat Cart SU", EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item, EnumTrainType.Flatcars, 0.2,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartFlatCartUS.item,
                                        new TrainRecord("Flat Cart US", EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item, EnumTrainType.Flatcars, 0.4,
                                                new String[]{"Black"},
                                                18)
                               );
                               put(ItemIDs.minecartBuilder.item,
                                        new TrainRecord("Tracks Builder", EntityTracksBuilder.class, ItemIDs.minecartBuilder.item, "special", 0,
                                                new String[]{"Black"},
                                                14)
                               );
                               put(ItemIDs.minecartFlatCart_DB.item,
                                        new TrainRecord("Flat Cart DB", EntityFlatCar_DB.class, ItemIDs.minecartFlatCart_DB.item, "flat", 0.2,
                                                new String[]{"Red", "Green"},
                                                18)
                               );
                               put(ItemIDs.minecartLocoDD35B.item,
                                        new TrainRecord("DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 8,
                                                new String[]{"Orange", "Black"},
                                                18)
                               );
                               put(ItemIDs.minecartPropagandaUs.item,
                                        new TrainRecord("Propaganda USA", EntityPropagandaUS.class, ItemIDs.minecartPropagandaUs.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Red", "Green", "Orange", "Lime"},
                                                14)
                               );
                               put(ItemIDs.minecartPropagandaUSSR.item,
                                        new TrainRecord("Propaganda USSR", EntityPropagandaUSSR.class, ItemIDs.minecartPropagandaUSSR.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Red"},
                                                14)
                               );
                               put(ItemIDs.minecartPropagandaJapan.item,
                                        new TrainRecord("Propaganda Japan", EntityPropagandaJapan.class, ItemIDs.minecartPropagandaJapan.item, "decorative", 0.1,
                                                new String[]{"Red", "White", "Yellow"},
                                                14)
                               );
                               put(ItemIDs.minecartPropagandaBritish.item,
                                        new TrainRecord("Propaganda Britain", EntityPropagandaBritain.class, ItemIDs.minecartPropagandaBritish.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Yellow"},
                                                14)
                               );
                               put(ItemIDs.minecartFreightCart2.item,
                                        new TrainRecord("Freight Cart Red", EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item, EnumTrainType.Boxcar, 3,
                                                new String[]{"Red", "White", "Orange"},
                                                18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"})
                               );


                               put(ItemIDs.minecartChest.item,
                                        new TrainRecord("Freight Cart Yellow", EntityFreightCart.class, ItemIDs.minecartChest.item, EnumTrainType.Boxcar, 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(STYLE_PROFILE_4x9)
                               );

                               put(ItemIDs.minecartWood.item,
                                        new TrainRecord("Freight Flat Cart Log", EntityFreightWood.class, ItemIDs.minecartWood.item, "freight", 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(27));


                               put(ItemIDs.minecartGrain.item,
                                        new TrainRecord("Freight Hopper Green", EntityFreightGrain.class, ItemIDs.minecartGrain.item, "freight", 4,
                                                new String[]{"Green", "White"},
                                                18).setCargoCapacity(STYLE_PROFILE_4x9));


                               put(ItemIDs.minecartKClassRailBox.item,
                                        new TrainRecord("Freight K Class Rail Box", EntityFreightKClassRailBox.class, ItemIDs.minecartKClassRailBox.item, "freight", 4,
                                                new String[]{"Yellow", "Orange"},
                                                18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"}));


                               put(ItemIDs.minecartShortCoveredHopper.item,
                                        new TrainRecord("Freight Short Covered Hopper", EntityFreightShortCoveredHopper.class, ItemIDs.minecartShortCoveredHopper.item, EnumTrainType.CoveredHopper, 4,
                                                new String[]{"Grey", "Orange", "LightBlue", "Lime", "Yellow", "Blue", "Cyan", "Skin16"},
                                                18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"}));


                               put(ItemIDs.minecartLongCoveredHopper.item,
                                        new TrainRecord("Freight Long Covered Hopper", EntityFreightLongCoveredHopper.class, ItemIDs.minecartLongCoveredHopper.item, "freight", 6,
                                                new String[]{"LightGrey", "Grey","Pink", "White", "Green", "Orange", "Lime", "Cyan"},
                                                18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));


                               put(ItemIDs.minecartOpenWagon.item,
                                        new TrainRecord("Freight Open Wagon", EntityFreightOpenWagon.class, ItemIDs.minecartOpenWagon.item, "freight", 2,
                                                new String[]{"Red", "Brown", "Pink"},
                                                18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: blocks, vanilla items"}));//"train_hopper" for open wagon => weird


                               put(ItemIDs.minecartFreightHopperUS.item,
                                        new TrainRecord("Freight Hopper US", EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item, "freight", 4,
                                                new String[]{"Brown", "Grey", "LightGrey", "Blue", "Red", "Yellow", "Black", "LightBlue", "Purple", "Green", "Magenta", "Orange","Skin17"},
                                                18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: blocks"}));


                               put(ItemIDs.minecartFreight100TonHopper.item,
                                        new TrainRecord("Freight 100 Ton Hopper", EntityFreight100TonHopper.class, ItemIDs.minecartFreight100TonHopper.item, "freight", 4,
                                                new String[]{"Red", "Black", "Blue", "Grey", "LightGrey", "Brown"},
                                                18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: blocks"}));



                               put(ItemIDs.minecartFlatCartWoodUS.item,
                                        new TrainRecord("Freight Flat Cart Wood US", EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item, "freight", 3,
                                                new String[]{"Red", "White"},
                                                18).setCargoCapacity(27));


                               put(ItemIDs.minecartBulkheadFlatCart.item,
                                        new TrainRecord("Freight Bulkhead Flat Cart", EntityBulkheadFlatCart.class, ItemIDs.minecartBulkheadFlatCart.item, "freight", 3,
                                                new String[]{"Brown", "Yellow", "Green"},
                                                18).setCargoCapacity(27));


                               put(ItemIDs.minecartFreightCartUS.item,
                                        new TrainRecord("Freight Cart US", EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item, "freight", 3.5,
                                                new String[]{"Brown", "Yellow", "Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White"},
                                        18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: blocks, vanilla items"}));


                               put(ItemIDs.minecartBoxCartUS.item,
                                        new TrainRecord("Freight Box Cart US", EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item, "freight", 2,
                                                new String[]{"Brown", "Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Purple", "Orange", "Grey", "Skin16", "Skin17", "Skin18"},
                                        18).setCargoCapacity(45));


                               put(ItemIDs.minecartBoxCartPRR.item,
                                        new TrainRecord("Freight Box Cart PRR", EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item, "freight", 2,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(45));


                               put(ItemIDs.minecartFreightCartSmall.item,
                                        new TrainRecord("Freight Cart Small", EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item, "freight", 1,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(STYLE_PROFILE_4x9));


                               put(ItemIDs.minecartMineTrain.item,
                                        new TrainRecord("Freight Minecart Yellow", EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: opaque blocks"}));


                               put(ItemIDs.minecartFreightGTNG.item,
                                        new TrainRecord("Freight GTNG Ore Wagon", EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: opaque blocks"}));


                               put(ItemIDs.minecartFreightWood2.item,
                                        new TrainRecord("Freight Flat Logs", EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item, "freight", 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18));


                               put(ItemIDs.minecartFreightClosed.item,
                                        new TrainRecord("Freight Cart Closed RedBrown", EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item, "freight", 2.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(STYLE_PROFILE_4x9));


                               put(ItemIDs.minecartFreightOpen2.item,
                                        new TrainRecord("Freight Open RedBrown", EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item, "freight", 5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(21));


                               put(ItemIDs.minecartFreightWagon_DB.item,
                                        new TrainRecord("Freight Wagon DB", EntityFreightWagenDB.class, ItemIDs.minecartFreightWagon_DB.item, "freight", 4,
                                                new String[] {"Red", "Green", "Yellow", "Orange", "Pink"},
                                        18).setCargoCapacity(STYLE_PROFILE_6x9));


                               put(ItemIDs.minecartFlatCartRail_DB.item,
                                        new TrainRecord("Freight Flat Cart Rails DB", EntityFlatCarRails_DB.class, ItemIDs.minecartFlatCartRail_DB.item, "freight", 5,
                                                new String[] {"Red", "Green", "Cyan", "Yellow"},
                                        18).setCargoCapacity(STYLE_PROFILE_4x9));


                               put(ItemIDs.minecartASTFAutorack.item,
                                        new TrainRecord("Freight ASTF Autorack", EntityFreightASTFAutorack.class, ItemIDs.minecartASTFAutorack.item, "freight", 5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any | Stack limit 1"}));


                               put(ItemIDs.minecartFlatCartLogs_DB.item,
                                        new TrainRecord("Freight Flat Cart Logs DB", EntityFlatCarLogs_DB.class, ItemIDs.minecartFlatCartLogs_DB.item, "freight", 4,
                                                new String[]{"Red", "Green", "Black", "Blue", "Brown", "Cyan", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"},
                                                18).setCargoCapacity(45));


                               put(ItemIDs.minecartSlateWagon.item,
                                        new TrainRecord("Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(38).setAdditionalTooltip(new String[]{"Cargo: only stone and ores"}));


                               put(ItemIDs.minecartIceWagon.item,
                                        new TrainRecord("Freight Ice Wagon", EntityFreightIceWagon.class, ItemIDs.minecartIceWagon.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(38));

                               put(ItemIDs.minecartGS4_Baggage.item,
                                        new TrainRecord("Freight Cart GS4 Baggage", EntityFreightGS4_Baggage.class, ItemIDs.minecartGS4_Baggage.item, "freight", 1,
                                                new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"},
                                                11).setCargoCapacity(45).setAdditionalTooltip(new String[]{"Cargo: any"}));

                               put(ItemIDs.minecartFreightGondola_DB.item,
                                       new TrainRecord("Freight Gondola DB", EntityFreightGondola_DB.class, ItemIDs.minecartFreightGondola_DB.item, "freight", 3.5,
                                               new String[]{"Red", "Green", "Black", "Brown", "Grey", "LightGrey", "Lime", "Orange", "Pink", "White", "Yellow"},
                                               18).setCargoCapacity(45).setAdditionalTooltip(new String[]{"Cargo: blocks, vanilla items"}));

                            put(ItemIDs.minecartFreightCenterBeam_Empty.item,
                                    new TrainRecord("Freight Center Beam Empty", EntityFreightCenterbeam_Empty.class, ItemIDs.minecartFreightCenterBeam_Empty.item, "freight", 0.5,
                                            new String[]{"Grey", "LightGrey"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartFreightCenterBeam_Wood_1.item,
                                    new TrainRecord("Freight Center Beam Wood1", EntityFreightCenterbeam_Wood_1.class, ItemIDs.minecartFreightCenterBeam_Wood_1.item, "freight", 3,
                                            new String[]{"Brown", "Blue", "White"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9));
                            put(ItemIDs.minecartFreightCenterBeam_Wood_2.item,
                                    new TrainRecord("Freight Center Beam Wood2", EntityFreightCenterbeam_Wood_2.class, ItemIDs.minecartFreightCenterBeam_Wood_2.item, "freight", 3,
                                            new String[]{"Brown", "Blue", "White"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9));

                            put(ItemIDs.minecartFreightWellcar.item,
                                    new TrainRecord("Freight Well Car", EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item, "freight", 3,
                                            new String[]{"Blue", "Red", "Green", "Black", "Grey", "Cyan", "Brown", "Lime", "LightBlue", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartFreightTrailer.item,
                                    new TrainRecord("Freight Trailer", EntityFreightTrailer.class, ItemIDs.minecartFreightTrailer.item, "freight", 3,
                                            new String[]{"Blue", "Yellow", "LightBlue", "Red", "Grey", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "Lime", "White", "Green"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));

                            put(ItemIDs.minecartDenverRioGrandeBaggage.item,
                                    new TrainRecord("Denver Rio Grande Baggage", EntityFreightDenverRioGrande.class, ItemIDs.minecartDenverRioGrandeBaggage.item, "freight", 0.5,
                                            new String[]{"Yellow", "Red", "Green"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartBaggageMILW.item,
                                    new TrainRecord("MILW Baggage", EntityFreightBaggageMILW.class, ItemIDs.minecartBaggageMILW.item, "freight", 0.5,
                                            new String[]{"Black"},
                                            18).setCargoCapacity(STYLE_PROFILE_6x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartHeavyweightMailcar.item,
                                    new TrainRecord("Heavyweight Freight Car", EntityFreightHeavyweight.class, ItemIDs.minecartHeavyweightMailcar.item, "freight", 0.5,
                                            new String[]{"Black"},
                                            18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: any"}));

                            put(ItemIDs.minecartFreightBamboo.item,
                                    new TrainRecord("Bamboo Flatcar Freight", EntityFreightBamboo.class, ItemIDs.minecartFreightBamboo.item, "freight", 0.1,
                                            new String[]{"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"},
                                            18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartFreightGermanPost.item,
                                    new TrainRecord("Freight German Post", EntityFreightGermanPost.class, ItemIDs.minecartFreightGermanPost.item, "freight", 0.1,
                                            new String[]{"Yellow", "Red", "Blue"},
                                            18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: non-blocks"}));

                            put(ItemIDs.minecartFreightDepressedFlatbed.item,
                                    new TrainRecord("Freight Depressed Flatcar", EntityFreightDepressedFlatbed.class, ItemIDs.minecartFreightDepressedFlatbed.item, "freight", 0.1,
                                            new String[]{"LightGrey", "Blue", "Yellow"},
                                            8).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartFreightL.item,
                                    new TrainRecord("Freight Car L", EntityFreightCartL.class, ItemIDs.minecartFreightL.item, "freight", 3,
                                            new String[]{"Red", "Blue"},
                                            18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: any"}));
                            put(ItemIDs.minecartHeavyweightFreight.item,
                                    new TrainRecord("Freight Heavyweight Baggage", EntityFreightHeavyweightBaggage.class, ItemIDs.minecartHeavyweightFreight.item, "freight", 3,
                                            new String[]{"Red", "Grey"},
                                            18).setCargoCapacity(STYLE_PROFILE_4x9).setAdditionalTooltip(new String[]{"Cargo: any"}));

                            put(ItemIDs.minecartTankWagon_DB.item,
                                    new TrainRecord("Tank Wagon DB", EntityTankWagon_DB.class, ItemIDs.minecartTankWagon_DB.item, EnumTrainType.Tankcar, 6,
                                            new String[]{"Blue", "Green"},
                                            18));
                            put(ItemIDs.minecartTankWagonThreeDome.item,
                                    new TrainRecord("Tank Wagon Three Dome", EntityTankWagonThreeDome.class, ItemIDs.minecartTankWagonThreeDome.item, EnumTrainType.Tankcar, 7.5,
                                            new String[]{"Green", "White"},
                                            18));
                            put(ItemIDs.minecartTankWagonUS.item,
                                    new TrainRecord("Tank Wagon US", EntityTankWagonUS.class, ItemIDs.minecartTankWagonUS.item, EnumTrainType.Tankcar, 6,
                                            new String[]{"Black", "Grey", "Yellow", "White", "LightGrey", "Green", "Blue", "Lime", "Orange", "Cyan", "Pink", "Purple", "LightBlue", "Magenta","Red","Brown"},
                                            18));
                            put(ItemIDs.minecartTankWagon2.item,
                                    new TrainRecord("Tank Wagon Grey", EntityTankWagon2.class, ItemIDs.minecartTankWagon2.item, EnumTrainType.Tankcar, 3,
                                            new String[]{"Blue", "White", "Orange", "Black"},
                                            18));
                            put(ItemIDs.minecartWatertransp.item,
                                    new TrainRecord("Tank Lava", EntityTankLava.class, ItemIDs.minecartWatertransp.item, EnumTrainType.Tankcar, 5,
                                            new String[]{"Empty", "Full"},
                                            18));
                            put(ItemIDs.minecartTankWagon.item,
                                    new TrainRecord("Tank Wagon Yellow", EntityTankWagon.class, ItemIDs.minecartTankWagon.item, EnumTrainType.Tankcar, 6,
                                            new String[]{"Black"},
                                            18));

                            /**
                             * Tenders
                             */
                            put(ItemIDs.minecartTender.item,
                                    new TrainRecord("Tender Small Black", EntityTenderSmall.class, ItemIDs.minecartTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.1)
                                            .setColors(new String[]{"Black", "Red", "Blue", "Green", "Yellow"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(5000));

                            put(ItemIDs.minecartTenderHeavy.item,
                                    new TrainRecord("Tender Heavy", EntityTenderHeavy.class, ItemIDs.minecartTenderHeavy.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Grey", "LightGrey"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(14000));

                            put(ItemIDs.minecartGS4_Tender.item,
                                    new TrainRecord("Tender GS4", EntityTenderGS4.class, ItemIDs.minecartGS4_Tender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Orange", "White"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(18000));

                            put(ItemIDs.minecart4000GallonTender.item,
                                    new TrainRecord("4000GallonTender", EntityTender4000.class, ItemIDs.minecart4000GallonTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Green", "Blue", "Red", "Lime"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(15000));

                            put(ItemIDs.minecartFowler4FTender.item,
                                    new TrainRecord("Fowler 4F Tender", EntityTenderFowler4F.class, ItemIDs.minecartFowler4FTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(15000));

                            put(ItemIDs.minecarttenderBerk1225.item,
                                    new TrainRecord("1225 tender", EntityTenderBerk1225.class, ItemIDs.minecarttenderBerk1225.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Black", "Grey", "LightGrey"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(15000));

                            put(ItemIDs.minecartSteamRedTender.item,
                                    new TrainRecord("Tender 4-4-0", EntityTender4_4_0.class, ItemIDs.minecartSteamRedTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.2)
                                            .setColors(new String[]{"Black", "White", "Brown", "Blue", "Green", "Red", "Purple"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(8000));

                            put(ItemIDs.minecartLocoA4MallardTender.item,
                                    new TrainRecord("Tender A4 Mallard", EntityTenderA4.class, ItemIDs.minecartLocoA4MallardTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.2)
                                            .setColors(new String[]{"Blue", "Lime", "Black", "Green", "White"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(6000));

                            put(ItemIDs.minecartTenderBR01_DB.item,
                                    new TrainRecord("Tender BR01", EntityTenderBR01_DB.class, ItemIDs.minecartTenderBR01_DB.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(20000));

                            put(ItemIDs.minecartLocoCoranationClassTender.item,
                                    new TrainRecord("Tender Coranation Class", EntityTenderCoranationClass.class, ItemIDs.minecartLocoCoranationClassTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(20000));

                            put(ItemIDs.minecartTenderEr.item,
                                    new TrainRecord("Tender ER_USSR", EntityTenderEr_Ussr.class, ItemIDs.minecartTenderEr.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(2)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(16000));

                            put(ItemIDs.minecartTenderC62Class.item,
                                    new TrainRecord("Tender C62Class", EntityTenderC62Class.class, ItemIDs.minecartTenderC62Class.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.5)
                                            .setColors(new String[]{"Black", "Red"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(14000));

                            put(ItemIDs.minecartTenderD51.item,
                                    new TrainRecord("Tender D51", EntityTenderD51.class, ItemIDs.minecartTenderD51.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(14000));

                            put(ItemIDs.minecartTenderAdler.item,
                                    new TrainRecord("Tender Adler", EntityTenderAdler.class, ItemIDs.minecartTenderAdler.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(0.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(4000));

                            put(ItemIDs.minecartTenderC41.item,
                                    new TrainRecord("Tender C41", EntityTender_C41.class, ItemIDs.minecartTenderC41.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(1.5)
                                            .setColors(new String[]{"Black", "Grey"})
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(16000));

                            put(ItemIDs.minecartTenderSouthern1102.item,
                                    new TrainRecord("Tender Southern1102", EntityTender_Southern1102.class, ItemIDs.minecartTenderSouthern1102.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(1.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(16000));

                            put(ItemIDs.minecartMILWTender.item,
                                    new TrainRecord("Tender MILW", EntityTenderMILW.class, ItemIDs.minecartMILWTender.item)
                                            .setTrainType(EnumTrainType.Tender)
                                            .setMass(1.5)
                                            .setColors(new String[]{"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setTankCapacity(16000));

                            /**
                             * Diesel
                             */

                            put(ItemIDs.minecartKof_DB.item,
                                    new TrainRecord("Loco Diesel KOF DB", EntityLocoDieselKof_DB.class, ItemIDs.minecartKof_DB.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(750)
                                            .setMaxSpeed(45)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.66)
                                            .setBrakeRate(0.96)
                                            .setTankCapacity(5000)
                                            .setColors(new String[] {"Red","Green","Yellow","Black","Blue","Cyan"})
                                            .setGuiRenderScale(17)
                                            .setBogieLocoPosition(-1.6)
                            );

                            put(ItemIDs.minecartCD742.item,
                                    new TrainRecord("Loco Diesel CD742", EntityLocoDieselCD742.class, ItemIDs.minecartCD742.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(1727)
                                            .setMaxSpeed(70)
                                            .setMass(0)
                                            .setFuelConsumption(50)
                                            .setHeatingTime(250)
                                            .setAccelerationRate(0.8)
                                            .setBrakeRate(0.966)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Yellow", "White", "Blue", "Orange", "LightBlue"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-2.5)
                            );

                            put(ItemIDs.minecartChmE3.item,
                                    new TrainRecord("Loco Diesel ChME3", EntityLocoDieselChME3.class, ItemIDs.minecartChmE3.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(2383)
                                            .setMaxSpeed(95)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.66)
                                            .setBrakeRate(0.96)
                                            .setTankCapacity(5000)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.2)
                            );

                            put(ItemIDs.minecartGP7Red.item,
                                    new TrainRecord("Loco Diesel GP7", EntityLocoDieselGP7Red.class, ItemIDs.minecartGP7Red.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(2464)
                                            .setMaxSpeed(105)
                                            .setMass(0)
                                            .setFuelConsumption(50)
                                            .setHeatingTime(200)
                                            .setAccelerationRate(0.74)
                                            .setBrakeRate(0.96)
                                            .setTankCapacity(20000)
                                            .setColors(new String[] {"Red","Blue","Black","Yellow","Magenta","Cyan","Pink","LightGrey","Green","White","LightBlue","Lime","Brown","Purple","Orange","Grey","Skin16","Skin17","Skin18","Skin19","Skin20","Skin21"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.4)
                            );

                            put(ItemIDs.minecartLocoSD40.item,
                                    new TrainRecord("Loco Diesel SD40", EntityLocoDieselSD40.class, ItemIDs.minecartLocoSD40.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(3041)
                                            .setMaxSpeed(105)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(200)
                                            .setAccelerationRate(0.8)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(20000)
                                            .setColors(new String[] {"Red","Yellow","Black","Green","Orange","Magenta","Blue","Pink"})
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-2.3)
                            );

                            put(ItemIDs.minecartLocoSD70.item,
                                    new TrainRecord("Loco Diesel SD70", EntityLocoDieselSD70.class, ItemIDs.minecartLocoSD70.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(4055)
                                            .setMaxSpeed(120)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(200)
                                            .setAccelerationRate(0.8)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(20000)
                                            .setColors(new String[] {"Orange","Yellow","Red","Blue","Magenta","Black","Pink","Green"})
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-2.3)
                            );

                            put(ItemIDs.minecartShunter.item,
                                    new TrainRecord("Loco Diesel Shunter", EntityLocoDieselShunter.class, ItemIDs.minecartShunter.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(354)
                                            .setMaxSpeed(32)
                                            .setMass(0)
                                            .setFuelConsumption(70)
                                            .setHeatingTime(260)
                                            .setAccelerationRate(0.6)
                                            .setBrakeRate(0.94)
                                            .setTankCapacity(8000)
                                            .setColors(new String[] {"Blue","Green","Red","Black","Cyan"})
                                            .setGuiRenderScale(14)
                                            .setBogieLocoPosition(-2.58)
                            );

                            put(ItemIDs.minecartV60_DB.item,
                                    new TrainRecord("Loco Diesel V60 DB", EntityLocoDieselV60_DB.class, ItemIDs.minecartV60_DB.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(1058)
                                            .setMaxSpeed(60)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.66)
                                            .setBrakeRate(0.96)
                                            .setTankCapacity(8000)
                                            .setColors(new String[] {"Red","Green","Yellow","Cyan","LightBlue"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.3)
                            );

                            put(ItemIDs.minecartLocoEWSClass66.item,
                                    new TrainRecord("Loco Electric EWS Class 66", EntityLocoDieselClass66.class, ItemIDs.minecartLocoEWSClass66.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(3678)
                                            .setMaxSpeed(121)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(6400)
                                            .setColors(new String[] {"Pink", "Green", "Red"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-5.5)
                            );

                            put(ItemIDs.minecartLocoDeltic.item,
                                    new TrainRecord("Loco Diesel Deltic", EntityLocoDieselDeltic.class, ItemIDs.minecartLocoDeltic.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(1997)
                                            .setMaxSpeed(161)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(6400)
                                            .setColors(new String[] {"Blue", "Cyan"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-5)
                            );

                            put(ItemIDs.minecartLocoDD35A.item,
                                    new TrainRecord("Loco Diesel DD35A", EntityLocoDieselDD35A.class, ItemIDs.minecartLocoDD35A.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(5000)
                                            .setMaxSpeed(90)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(6850)
                                            .setColors(new String[] {"Orange", "Black", "Pink"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-4.75)
                            );

                            put(ItemIDs.minecartLoco44TonSwitcher.item,
                                    new TrainRecord("GE 44-ton Diesel switcher", EntityLocoDiesel44TonSwitcher.class, ItemIDs.minecartLoco44TonSwitcher.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(400)
                                            .setMaxSpeed(56)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(6850)
                                            .setColors(new String[] {"Black", "Cyan"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-2.75)
                            );

                            put(ItemIDs.minecartTrainBamboo.item,
                                    new TrainRecord("Bamboo Flatcar Engine", EntityLocoDieselBamboo.class, ItemIDs.minecartTrainBamboo.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(30)
                                            .setMaxSpeed(20)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(3000)
                                            .setColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-2)
                            );

                            put(ItemIDs.minecartLocoWLs40.item,
                                    new TrainRecord("Loco WLs40", EntityLocoDieselWLs40.class, ItemIDs.minecartLocoWLs40.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(60)
                                            .setMaxSpeed(17)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(3000)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-3)
                            );

                            put(ItemIDs.minecartLocoFOLM1.item,
                                    new TrainRecord("Loco FOL-M1", EntityLocoDieselFOLM1.class, ItemIDs.minecartLocoFOLM1.item)
                                            .setTrainType(EnumTrainType.Diesel)
                                            .setMHP(5000)
                                            .setMaxSpeed(110)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(15000)
                                            .setColors(new String[] {"Grey", "Blue", "Black"})
                                            .setGuiRenderScale(12)
                                            .setBogieLocoPosition(-3.9)
                                            .setAdditionalTooltip(new String[] {"Fictional loco from Factorio"})
                            );

                            /** Electric */
                            put(ItemIDs.minecartVL10.item,
                                    new TrainRecord("Loco Electric VL10", EntityLocoElectricVL10.class, ItemIDs.minecartVL10.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(6250)
                                            .setMaxSpeed(100)
                                            .setMass(0)
                                            .setFuelConsumption(8)
                                            .setHeatingTime(400)
                                            .setAccelerationRate(1.1)
                                            .setBrakeRate(0.956)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(14)
                                            .setBogieLocoPosition(-2.3)
                            );

                            put(ItemIDs.minecartBR_E69.item,
                                    new TrainRecord("Loco Electric BR_E69", EntityLocoElectricBR_E69.class, ItemIDs.minecartBR_E69.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(400)
                                            .setMaxSpeed(50)
                                            .setMass(0)
                                            .setFuelConsumption(5)
                                            .setHeatingTime(400)
                                            .setAccelerationRate(0.9)
                                            .setBrakeRate(0.946)
                                            .setColors(new String[] {"Green","Red","Black","Grey","Blue","Cyan"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(0)
                            );

                            put(ItemIDs.minecartLocoMineTrain.item,
                                    new TrainRecord("Loco Electric Minetrain", EntityLocoElectricMinetrain.class, ItemIDs.minecartLocoMineTrain.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(500)
                                            .setMaxSpeed(40)
                                            .setMass(0)
                                            .setFuelConsumption(80)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.5)
                                            .setBrakeRate(0.97)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-1)
                            );

                            put(ItemIDs.minecartLocoHighSpeedZeroED.item,
                                    new TrainRecord("Loco Electric High Speed ZeroED", EntityLocoElectricHighSpeedZeroED.class, ItemIDs.minecartLocoHighSpeedZeroED.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(700)
                                            .setMaxSpeed(240)
                                            .setMass(0)
                                            .setFuelConsumption(3)
                                            .setHeatingTime(230)
                                            .setAccelerationRate(1.4)
                                            .setBrakeRate(0.98)
                                            .setColors(new String[] {"White", "LightGrey", "Grey"})
                                            .setGuiRenderScale(13)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartICE1_Loco.item,
                                    new TrainRecord("Loco Electric ICE 1", EntityLocoElectricICE1.class, ItemIDs.minecartICE1_Loco.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(4300)
                                            .setMaxSpeed(280)
                                            .setMass(0)
                                            .setFuelConsumption(4)
                                            .setHeatingTime(250)
                                            .setAccelerationRate(1.5)
                                            .setBrakeRate(0.98)
                                            .setColors(new String[] {"White", "Red"})
                                            .setGuiRenderScale(13)
                                            .setBogieLocoPosition(-5)
                            );

                            put(ItemIDs.minecartTramWood.item,
                                    new TrainRecord("Loco Electric Yellow Wood Tram", EntityLocoElectricTramWood.class, ItemIDs.minecartTramWood.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(300)
                                            .setMaxSpeed(55)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(140)
                                            .setAccelerationRate(0.5)
                                            .setBrakeRate(0.965)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(14)
                                            .setBogieLocoPosition(-2)
                            );

                            put(ItemIDs.minecartLocoBR185.item,
                                    new TrainRecord("Loco Electric BR 185", EntityLocoElectricBR185.class, ItemIDs.minecartLocoBR185.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(2428)
                                            .setMaxSpeed(160)
                                            .setMass(0)
                                            .setFuelConsumption(6)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setColors(new String[] {"Red", "Blue", "Magenta", "Cyan", "Grey", "LightBlue", "LightGrey", "Orange", "Pink", "Purple", "White", "Yellow", "Black", "Brown", "Skin16", "Skin17"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-5)
                            );

                            put(ItemIDs.minecartE10_DB.item,
                                    new TrainRecord("Loco Electric E10 DB", EntityLocoElectricE10_DB.class, ItemIDs.minecartE10_DB.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(2473)
                                            .setMaxSpeed(150)
                                            .setMass(0)
                                            .setFuelConsumption(8)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.66)
                                            .setBrakeRate(0.96)
                                            .setColors(new String[] {"Blue","Red","Grey","Brown","Green","LightGrey","Lime","Pink","Purple","Cyan"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-3.8)
                            );

                            put(ItemIDs.minecartE103.item,
                                    new TrainRecord("Loco Electric E103", EntityLocoElectricE103.class, ItemIDs.minecartE103.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(2806)
                                            .setMaxSpeed(200)
                                            .setMass(0)
                                            .setFuelConsumption(8)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.66)
                                            .setBrakeRate(0.96)
                                            .setColors(new String[] {"Red","Blue"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-3.6)
                            );

                            put(ItemIDs.minecartLocoClass85.item,
                                    new TrainRecord("Loco Electric Class 85", EntityLocoElectricClass85.class, ItemIDs.minecartLocoClass85.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(1997)
                                            .setMaxSpeed(160)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setColors(new String[] {"Black"}) // manually added because original color list was null
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-5)
                            );

                            put(ItemIDs.minecartLocoCD151.item,
                                    new TrainRecord("Loco Electric CD151", EntityLocoElectricCD151.class, ItemIDs.minecartLocoCD151.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(1133)
                                            .setMaxSpeed(150)
                                            .setMass(0)
                                            .setFuelConsumption(10)
                                            .setHeatingTime(170)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.965)
                                            .setColors(new String[] {"Blue", "Yellow", "Red"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-4)
                            );

                            put(ItemIDs.minecartLocoBP4.item,
                                    new TrainRecord("Loco Electric BP4", EntityLocoElectricBP4.class, ItemIDs.minecartLocoBP4.item)
                                            .setTrainType(EnumTrainType.Electric)
                                            .setMHP(1520)
                                            .setMaxSpeed(105)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setHeatingTime(200)
                                            .setAccelerationRate(0.8)
                                            .setBrakeRate(0.97)
                                            .setColors(new String[] {"Green", "Purple", "Cyan", "Grey", "Blue"})
                                            .setGuiRenderScale(14)
                                            .setBogieLocoPosition(-3)
                            );

                            /** Steam */
                            put(ItemIDs.minecartLocoA4Mallard.item,
                                    new TrainRecord("Loco Steam A4 Mallard", EntityLocoSteamMallardA4.class, ItemIDs.minecartLocoA4Mallard.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1418)
                                            .setMaxSpeed(203)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Blue", "Lime", "Black", "Green", "White"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-5)
                            );

                            put(ItemIDs.minecartLocoHallClass.item,
                                    new TrainRecord("Loco Hall Class", EntityLocoSteamHallClass.class, ItemIDs.minecartLocoHallClass.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1091)
                                            .setMaxSpeed(164)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Green", "Red", "Lime"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-4.95)
                            );

                            put(ItemIDs.minecartLocoBerk1225.item,
                                    new TrainRecord("Loco Berkshire 1225", EntityLocoSteamBerk1225.class, ItemIDs.minecartLocoBerk1225.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(2775)
                                            .setMaxSpeed(164)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black", "LightGrey"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-4.25)
                            );

                            put(ItemIDs.minecartLocoBerk765.item,
                                    new TrainRecord("Loco Berkshire 765", EntityLocoSteamBerk765.class, ItemIDs.minecartLocoBerk765.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(2563)
                                            .setMaxSpeed(164)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-4.25)
                            );

                            put(ItemIDs.minecartLocoFowler.item,
                                    new TrainRecord("Loco Fowler", EntityLocoSteamFowler.class, ItemIDs.minecartLocoFowler.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(980)
                                            .setMaxSpeed(102)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-3.25)
                            );

                            put(ItemIDs.minecartLocoKingClass.item,
                                    new TrainRecord("Loco King Class", EntityLocoSteamKingClass.class, ItemIDs.minecartLocoKingClass.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1613)
                                            .setMaxSpeed(174)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Green", "Blue", "Lime"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-5.35)
                            );

                            put(ItemIDs.minecartLocoMILWClassA.item,
                                    new TrainRecord("Loco Steam MILW Class A", EntityLocoSteamMILWClassA.class, ItemIDs.minecartLocoMILWClassA.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1228)
                                            .setMaxSpeed(193)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(150)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-4.5)
                            );

                            put(ItemIDs.minecartLocoCherepanov.item,
                                    new TrainRecord("Loco Steam Cherepanov", EntityLocoSteamCherepanov.class, ItemIDs.minecartLocoCherepanov.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(60)
                                            .setMaxSpeed(30)
                                            .setMass(0)
                                            .setFuelConsumption(40)
                                            .setWaterConsumption(120)
                                            .setHeatingTime(120)
                                            .setAccelerationRate(0.3)
                                            .setBrakeRate(0.98)
                                            .setTankCapacity(3000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-1.7)
                            );

                            put(ItemIDs.minecartLocoBR80_DB.item,
                                    new TrainRecord("Loco Steam BR80", EntityLocoSteamBR80_DB.class, ItemIDs.minecartLocoBR80_DB.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(575)
                                            .setMaxSpeed(45)
                                            .setMass(0)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(130)
                                            .setHeatingTime(135)
                                            .setAccelerationRate(0.45)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(7000)
                                            .setColors(new String[] {"Black", "Green"})
                                            .setGuiRenderScale(16)
                                            .setBogieLocoPosition(-1.1)
                            );

                            put(ItemIDs.minecartPower.item,
                                    new TrainRecord("Loco Steam 4-4-0", EntityLocoSteam4_4_0.class, ItemIDs.minecartPower.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(400)
                                            .setMaxSpeed(50)
                                            .setMass(0)
                                            .setFuelConsumption(40)
                                            .setWaterConsumption(160)
                                            .setHeatingTime(190)
                                            .setAccelerationRate(0.65)
                                            .setBrakeRate(0.95)
                                            .setTankCapacity(5000)
                                            .setColors(new String[] {"Red","White","Blue","Brown","Green","Black","Purple"})
                                            .setGuiRenderScale(16)
                                            .setBogieLocoPosition(-2)
                            );

                            put(ItemIDs.minecartLoco3.item,
                                    new TrainRecord("Loco Steam Small", EntityLocoSteamSmall.class, ItemIDs.minecartLoco3.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(250)
                                            .setMaxSpeed(45)
                                            .setMass(0)
                                            .setFuelConsumption(140)
                                            .setWaterConsumption(140)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.5)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(5000)
                                            .setColors(new String[] {"Blue","Red","Green","Yellow","Black","LightBlue"})
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-1.7)
                            );

                            put(ItemIDs.minecartLocoLSSP7.item,
                                    new TrainRecord("Loco Steam LSSP7", EntityLocoSteamLSSP7.class, ItemIDs.minecartLocoLSSP7.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(250)
                                            .setMaxSpeed(45)
                                            .setMass(0)
                                            .setFuelConsumption(140)
                                            .setWaterConsumption(140)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.5)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(5000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-1.1)
                            );

                            put(ItemIDs.minecartHeavySteam.item,
                                    new TrainRecord("Loco Steam Heavy", EntityLocoSteamHeavy.class, ItemIDs.minecartHeavySteam.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(3000)
                                            .setMaxSpeed(65)
                                            .setMass(0)
                                            .setFuelConsumption(40)
                                            .setWaterConsumption(140)
                                            .setHeatingTime(190)
                                            .setAccelerationRate(0.4)
                                            .setBrakeRate(0.9)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-3)
                            );

                            put(ItemIDs.minecartLocoC62Class.item,
                                    new TrainRecord("Loco Steam C62Class", EntityLocoSteamC62Class.class, ItemIDs.minecartLocoC62Class.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1223)
                                            .setMaxSpeed(129)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(180)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black","Red"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-5.66)
                            );

                            put(ItemIDs.minecartLocoD51Short.item,
                                    new TrainRecord("Loco Steam D51 Short Streamlining", EntityLocoSteamD51.class, ItemIDs.minecartLocoD51Short.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1658)
                                            .setMaxSpeed(85)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(180)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black","Grey"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-5.66)
                            );

                            put(ItemIDs.minecartLocoD51Long.item,
                                    new TrainRecord("Loco Steam D51 Long Streamlining", EntityLocoSteamD51Long.class, ItemIDs.minecartLocoD51Long.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1658)
                                            .setMaxSpeed(85)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(180)
                                            .setHeatingTime(160)
                                            .setAccelerationRate(0.7)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black","Grey"})
                                            .setGuiRenderScale(7)
                                            .setBogieLocoPosition(-5.66)
                            );


                            put(ItemIDs.minecartLocoBR01_DB.item,
                                    new TrainRecord("Loco Steam BR01", EntityLocoSteamBR01_DB.class, ItemIDs.minecartLocoBR01_DB.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(2120)
                                            .setMaxSpeed(130)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(300)
                                            .setAccelerationRate(0.6)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.7)
                            );

                            put(ItemIDs.minecartLocoCoranationClass.item,
                                    new TrainRecord("Loco Steam Coranation Class", EntityLocoSteamCoranationClass.class, ItemIDs.minecartLocoCoranationClass.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1619)
                                            .setMaxSpeed(183)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(200)
                                            .setHeatingTime(300)
                                            .setAccelerationRate(0.6)
                                            .setBrakeRate(0.97)
                                            .setTankCapacity(10000)
                                            .setColors(new String[] {"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-6)
                            );

                            put(ItemIDs.minecartGS4_Loco.item,
                                    new TrainRecord("Loco Steam GS4", EntityLocoSteamGS4.class, ItemIDs.minecartGS4_Loco.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(2653)
                                            .setMaxSpeed(180)
                                            .setMass(0)
                                            .setFuelConsumption(60)
                                            .setWaterConsumption(350)
                                            .setHeatingTime(450)
                                            .setAccelerationRate(0.6)
                                            .setBrakeRate(0.95)
                                            .setTankCapacity(8800)
                                            .setColors(new String[] {"Orange","White"})
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-6)
                            );

                            put(ItemIDs.minecartLocoEr.item,
                                    new TrainRecord("Loco Steam ER_USSR", EntityLocoSteamEr_Ussr.class, ItemIDs.minecartLocoEr.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(800)
                                            .setMaxSpeed(80)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(10000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.7)
                            );

                            put(ItemIDs.minecartLocoC41.item,
                                    new TrainRecord("Loco Steam C41", EntityLocoSteamC41.class, ItemIDs.minecartLocoC41.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1484)
                                            .setMaxSpeed(120)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(4000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartLocoC41_080.item,
                                    new TrainRecord("Loco Steam C41 0-8-0", EntityLocoSteamC41_080.class, ItemIDs.minecartLocoC41_080.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1484)
                                            .setMaxSpeed(120)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(4000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartLocoAlcoSC4.item,
                                    new TrainRecord("Loco Steam Alco SC4", EntityLocoSteamAlcoSC4.class, ItemIDs.minecartLocoAlcoSC4.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(800)
                                            .setMaxSpeed(120)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(4000)
                                            .setColors(new String[]{"Black","Grey"})
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartLocoSouthern1102.item,
                                    new TrainRecord("Loco Steam Southern 1102", EntityLocoSteamSouthern1102.class, ItemIDs.minecartLocoSouthern1102.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1236)
                                            .setMaxSpeed(118)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(10000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartLocoUSATCUS.item,
                                    new TrainRecord("Loco Steam USATCUS", EntityLocoSteamUSATCUS.class, ItemIDs.minecartLocoUSATCUS.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(197)
                                            .setMaxSpeed(75)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(10000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-2.5)
                            );

                            put(ItemIDs.minecartLocoUSATCUK.item,
                                    new TrainRecord("Loco Steam USATCUK", EntityLocoSteamUSATCUK.class, ItemIDs.minecartLocoUSATCUK.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(197)
                                            .setMaxSpeed(75)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(10000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-2.5)
                            );

                            put(ItemIDs.minecartLocoC41T.item,
                                    new TrainRecord("Loco Steam C41T", EntityLocoSteamC41T.class, ItemIDs.minecartLocoC41T.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(1484)
                                            .setMaxSpeed(110)
                                            .setMass(0.35)
                                            .setFuelConsumption(100)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.975)
                                            .setBrakeRate(0.975)
                                            .setTankCapacity(16000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(10)
                                            .setBogieLocoPosition(-3.4)
                            );

                            put(ItemIDs.minecartLocoForneyRed.item,
                                    new TrainRecord("Loco Steam Forney", EntityLocoSteamForneyRed.class, ItemIDs.minecartLocoForneyRed.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(600)
                                            .setMaxSpeed(70)
                                            .setMass(0.44)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(130)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(8000)
                                            .setColors(new String[]{"Red","Grey","Yellow","Brown","Blue","Green"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.35)
                            );

                            put(ItemIDs.minecartLocomogulBlue.item,
                                    new TrainRecord("Loco Steam Mogul", EntityLocoSteamMogulBlue.class, ItemIDs.minecartLocomogulBlue.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(500)
                                            .setMaxSpeed(65)
                                            .setMass(0.56)
                                            .setFuelConsumption(180)
                                            .setWaterConsumption(180)
                                            .setAccelerationRate(0.967)
                                            .setBrakeRate(0.967)
                                            .setTankCapacity(5000)
                                            .setColors(new String[]{"Blue","Black","Brown","Green","Red","White"})
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-2.2)
                            );

                            put(ItemIDs.minecartLocoSteamShay.item,
                                    new TrainRecord("Loco Steam Shay", EntityLocoSteamShay.class, ItemIDs.minecartLocoSteamShay.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(250)
                                            .setMaxSpeed(50)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(130)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(4000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1)
                            );

                            put(ItemIDs.minecartLocoSteamVBShay.item,
                                    new TrainRecord("Loco Steam VB Shay", EntityLocoSteamVBShay.class, ItemIDs.minecartLocoSteamVBShay.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(250)
                                            .setMaxSpeed(32)
                                            .setMass(0.5)
                                            .setFuelConsumption(140)
                                            .setWaterConsumption(100)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(3000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-0.5)
                            );

                            put(ItemIDs.minecartLocoSteamClimax.item,
                                    new TrainRecord("Loco Steam Climax", EntityLocoSteamClimax.class, ItemIDs.minecartLocoSteamClimax.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(250)
                                            .setMaxSpeed(45)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(130)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(4000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.5)
                            );

                            put(ItemIDs.minecartLocoSteamPannier.item,
                                    new TrainRecord("Loco Steam Pannier", EntityLocoSteamPannier.class, ItemIDs.minecartLocoSteamPannier.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(903)
                                            .setMaxSpeed(80)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(130)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(8000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-3.5)
                            );

                            put(ItemIDs.minecartLocoSteamAlice.item,
                                    new TrainRecord("Loco Steam Alice", EntityLocoSteamAlice0_4_0.class, ItemIDs.minecartLocoSteamAlice.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(200)
                                            .setMaxSpeed(32)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(3750)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-2)
                            );

                            put(ItemIDs.minecartLocoSteamGLYN.item,
                                    new TrainRecord("Loco Steam glyn", EntityLocoSteamGLYN042T.class, ItemIDs.minecartLocoSteamGLYN.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(600)
                                            .setMaxSpeed(32)
                                            .setMass(0.45)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(3750)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-2.5)
                            );

                            put(ItemIDs.minecartLocoSteam262T.item,
                                    new TrainRecord("Loco Steam 262T", EntityLocoSteam262T.class, ItemIDs.minecartLocoSteam262T.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(300)
                                            .setMaxSpeed(70)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(300)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(4250)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-3)
                            );

                            put(ItemIDs.minecartLocoSteam040vb.item,
                                    new TrainRecord("Loco Steam 040VB", EntityLocoSteam040VB.class, ItemIDs.minecartLocoSteam040vb.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(200)
                                            .setMaxSpeed(32)
                                            .setMass(0.5)
                                            .setFuelConsumption(120)
                                            .setWaterConsumption(200)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(2500)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.1)
                            );

                            put(ItemIDs.minecartLocoSteamAdler.item,
                                    new TrainRecord("Loco Steam Adler", EntityLocoSteamAdler.class, ItemIDs.minecartLocoSteamAdler.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(200)
                                            .setMaxSpeed(65)
                                            .setMass(0.5)
                                            .setFuelConsumption(160)
                                            .setWaterConsumption(300)
                                            .setAccelerationRate(0.968)
                                            .setBrakeRate(0.968)
                                            .setTankCapacity(3000)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(15)
                                            .setBogieLocoPosition(-1.5)
                            );

                            put(ItemIDs.minecartLocoSnowPlow.item,
                                    new TrainRecord("Loco Steam Snow Plow", EntityLocoSteamSnowPlow.class, ItemIDs.minecartLocoSnowPlow.item)
                                            .setTrainType(EnumTrainType.Steam)
                                            .setMHP(200)
                                            .setMaxSpeed(20)
                                            .setMass(0.7)
                                            .setFuelConsumption(120)
                                            .setWaterConsumption(170)
                                            .setAccelerationRate(0.965)
                                            .setBrakeRate(0.965)
                                            .setTankCapacity(6850)
                                            .setColors(new String[]{"Black"}) // manually put in
                                            .setGuiRenderScale(18)
                                            .setBogieLocoPosition(-4.75)
                            );


                        }}, Traincraft.instance

                );
    }
}
