package com.jcirmodelsquad.tcjcir;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.foxdrives.DieselWorkdayHyrail;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.ExperimentalGeometryCar;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.controlcar.AmfleetCab;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tanker.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart.*;
import net.minecraft.item.Item;
import train.common.api.stock.TenderStoragePolicy;
import train.common.library.EnumTrainType;
import train.common.library.ItemIDs;
import train.common.library.register.ITrainRecord;
import train.common.library.register.TenderRecord;
import train.common.library.register.TrainRecord;

import java.util.LinkedHashMap;

public class RegisterBAPTrains
{
    public RegisterBAPTrains()
    { }

    public LinkedHashMap<Item, ITrainRecord> getRegister()
    {
        return new LinkedHashMap<Item, ITrainRecord>()
        {{
            //BAP Steam//

            // Climax2
            put(ItemIDs.minecartClimaxNew.item,
                    new TrainRecord("2TruckClimax", SteamClimaxNew.class, ItemIDs.minecartClimaxNew.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(680)
                            .setMaxSpeed(35)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.0)
            );

            // VBShay
            put(ItemIDs.minecartVBShay2.item,
                    new TrainRecord("2TruckVerticalBoilerShay", SteamVBShay2.class, ItemIDs.minecartVBShay2.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(630)
                            .setMaxSpeed(35)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(6000)
                            .setColors(new String[] {"Black", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.3)
            );

            // Skook
            put(ItemIDs.minecartSkook.item,
                    new TrainRecord("Skookum", SteamSkook.class, ItemIDs.minecartSkook.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1470)
                            .setMaxSpeed(75)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.91)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.4)
            );

            // SkookTender
            put(ItemIDs.minecartSkookTender.item,
                    new TrainRecord("Skookum Tender", TenderSkookTender.class, ItemIDs.minecartSkookTender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(2)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
            );

            // Shay3Truck
            put(ItemIDs.minecartShay3Truck.item,
                    new TrainRecord("3 Truck Shay", SteamShay3Truck.class, ItemIDs.minecartShay3Truck.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(838)
                            .setMaxSpeed(35)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.9)
                            .setTankCapacity(4000)
                            .setColors(new String[] {"Black", "Grey", "White"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.8)
            );

            // Shay3TruckTender
            put(ItemIDs.minecartShay3TruckTender.item,
                    new TrainRecord("3 Truck Shay Tender", TenderShay3Truck.class, ItemIDs.minecartShay3TruckTender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(2)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Black", "Grey", "White"})
                            .setGuiRenderScale(22)
            );

            // ClimaxB
            put(ItemIDs.minecartClimaxB.item,
                    new TrainRecord("ClimaxB", SteamClimaxB.class, ItemIDs.minecartClimaxB.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(838)
                            .setMaxSpeed(35)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(80)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.9)
                            .setTankCapacity(9000)
                            .setColors(new String[] {"Black", "Grey", "LightGrey", "Cyan"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.8)
            );

            // F01
            put(ItemIDs.minecartF01.item,
                    new TrainRecord("F01", SteamF01.class, ItemIDs.minecartF01.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(450)
                            .setMaxSpeed(65)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(9000)
                            .setColors(new String[] {"Grey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.7)
            );

            // P01a
            put(ItemIDs.minecartP01a.item,
                    new TrainRecord("P01a", SteamP01a.class, ItemIDs.minecartP01a.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1475)
                            .setMaxSpeed(85)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.8)
                            .setTankCapacity(4000)
                            .setSecondaryCapacity(1000)
                            .setColors(new String[] {"Grey", "LightGrey", "Green"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-1.8)
            );

            // VanderbackTender
            put(ItemIDs.minecartVanderbackTender.item,
                    new TenderRecord("VanderbackTender", TenderVanderback.class, ItemIDs.minecartVanderbackTender.item)
                            .setTenderStoragePolicy(TenderStoragePolicy.DUAL_CHAMBER_ONLY)
                            .setSecondaryTankCapacity(7000)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(2)
                            .setTankCapacity(29000)
                            .setColors(new String[] {"Grey"})
                            .setGuiRenderScale(18)
            );

            // SquanderbackTender
            put(ItemIDs.minecartSquanderbackTender.item,
                    new TenderRecord("SquanderbackTender", TenderSquanderback.class, ItemIDs.minecartSquanderbackTender.item)
                            .setTenderStoragePolicy(TenderStoragePolicy.DUAL_CHAMBER_ONLY)
                            .setSecondaryTankCapacity(7000)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(2.1)
                            .setTankCapacity(34000)
                            .setColors(new String[] {"LightGrey", "Grey", "Green"})
                            .setGuiRenderScale(18)
                            .setAdditionalTooltip(new String[] {" this started life a shitpost but i liked it too much"})
            );

            // BKno2a
            put(ItemIDs.minecartBKno2a.item,
                    new TrainRecord("BKno2a", SteamBKno2a.class, ItemIDs.minecartBKno2a.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1450)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Black", "Orange"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-1.3)
                            .setAdditionalTooltip(new String[] {"Place facing forward"})
            );

            // BKno2b
            put(ItemIDs.minecartBKno2b.item,
                    new TrainRecord("BKno2b", SteamBKno2b.class, ItemIDs.minecartBKno2b.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1450)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Black", "Orange"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.2)
                            .setAdditionalTooltip(new String[] {"Place facing backward"})
            );

            // WCPBuckingBull
            put(ItemIDs.minecartWCPBuckingBull.item,
                    new TrainRecord("WCPBuckingBull", SteamBuckingBull.class, ItemIDs.minecartWCPBuckingBull.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(2200)
                            .setMaxSpeed(70)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setWaterConsumption(70)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.78)
                            .setBrakeRate(0.9)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.4)
            );

            // WCPBaler
            put(ItemIDs.minecartWCPBaler.item,
                    new TrainRecord("WCPBaler", TenderBaler.class, ItemIDs.minecartWCPBaler.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
            );

            // WCPMacky
            put(ItemIDs.minecartWCPMacky.item,
                    new TrainRecord("WCPMacky", SteamMacky.class, ItemIDs.minecartWCPMacky.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(2069)
                            .setMaxSpeed(66)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setWaterConsumption(90)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.66)
                            .setBrakeRate(0.9)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.2)
            );

            // Alco2102
            put(ItemIDs.minecartalco2102.item,
                    new TrainRecord("Alco2102", SteamAlco2102.class, ItemIDs.minecartalco2102.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1613)
                            .setMaxSpeed(65)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.8)
                            .setTankCapacity(17000)
                            .setColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.4)
            );

            // MK60
            put(ItemIDs.minecartMK60.item,
                    new TrainRecord("MK60", SteamMK60.class, ItemIDs.minecartMK60.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(2765)
                            .setMaxSpeed(98)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.8)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Purple", "Cyan", "Skin22"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.6)
            );

            // Tender10k
            put(ItemIDs.minecartTender10k.item,
                    new TrainRecord("Tender10k", Tender10k.class, ItemIDs.minecartTender10k.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3)
                            .setTankCapacity(38000)
                            .setColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Yellow", "Purple", "Pink", "Skin19", "Skin20", "Skin21", "Skin22"})
                            .setGuiRenderScale(18)
            );

            // TenderDeseret
            put(ItemIDs.minecartTenderDeseret.item,
                    new TrainRecord("TenderDeseret", TenderDeseret.class, ItemIDs.minecartTenderDeseret.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(4)
                            .setTankCapacity(57000)
                            .setColors(new String[] {"Black", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(18)
            );

            // HCS_c57
            put(ItemIDs.minecartHCS_c57.item,
                    new TrainRecord("HCS_c57", SteamHCS_c57.class, ItemIDs.minecartHCS_c57.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1753)
                            .setMaxSpeed(85)
                            .setMass(0)
                            .setFuelConsumption(75)
                            .setWaterConsumption(75)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.8)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Cyan", "Skin25", "Skin23", "Skin24", "Skin26", "Skin27"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.20)
            );

            // HCS_9k_Tender
            put(ItemIDs.minecartHCS_9k_Tender.item,
                    new TrainRecord("HCS_9k_Tender", HCS_9k_Tender.class, ItemIDs.minecartHCS_9k_Tender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(4)
                            .setTankCapacity(34000)
                            .setColors(new String[] {"Skin19","Skin21", "Skin20", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(18)
            );

            // HotTubTender
            put(ItemIDs.minecartHotTubTender.item,
                    new TrainRecord("HotTubTender", HotTubTender.class, ItemIDs.minecartHotTubTender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3)
                            .setTankCapacity(41000)
                            .setColors(new String[] {"Cyan", "Skin16", "Skin17"})
                            .setGuiRenderScale(18)
            );

            // C11
            put(ItemIDs.minecartLocoC11.item,
                    new TrainRecord("Loco Steam C11", SteamC11.class, ItemIDs.minecartLocoC11.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1030)
                            .setMaxSpeed(97)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(100)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.35)
                            .setBrakeRate(0.975)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.0)
            );

            // Onion
            put(ItemIDs.minecartOnion.item,
                    new TrainRecord("Onion", SteamOnion.class, ItemIDs.minecartOnion.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(350)
                            .setMaxSpeed(191)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setWaterConsumption(240)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.9999)
                            .setBrakeRate(14.99999)
                            .setTankCapacity(8000)
                            .setColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"})
                            .setGuiRenderScale(17)
                            .setBogieLocoPosition(-1.3)
            );

            // OnionTender
            put(ItemIDs.minecartOnionTender.item,
                    new TrainRecord("Onion Tender", TenderOnion.class, ItemIDs.minecartOnionTender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(0.1)
                            .setTankCapacity(12000)
                            .setColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"})
                            .setGuiRenderScale(17)
            );

            // NP_L9
            put(ItemIDs.minecartNP_L9.item,
                    new TrainRecord("NP_L9", SteamNP_L9.class, ItemIDs.minecartNP_L9.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1200)
                            .setMaxSpeed(65)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(180)
                            .setHeatingTime(140)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.725)
                            .setTankCapacity(3000)
                            .setColors(new String[] {"Grey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.7)
            );

            // NP_11C_Tender
            put(ItemIDs.minecartNP_11C_tender.item,
                    new TrainRecord("NP_11C_Tender", TenderNP_11C.class, ItemIDs.minecartNP_11C_tender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3.5)
                            .setTankCapacity(26000)
                            .setColors(new String[] {"Grey", "Black"})
                            .setGuiRenderScale(18)
            );

            // NP_13C_Tender
            put(ItemIDs.minecartNP_13C_tender.item,
                    new TrainRecord("NP_13C_Tender", TenderNP_13C.class, ItemIDs.minecartNP_13C_tender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3.75)
                            .setTankCapacity(31000)
                            .setColors(new String[] {"Grey", "Black"})
                            .setGuiRenderScale(18)
            );

            // Alco460
            put(ItemIDs.minecartAlco460.item,
                    new TrainRecord("Alco460", SteamAlco460.class, ItemIDs.minecartAlco460.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(973)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(90)
                            .setWaterConsumption(130)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.75)
                            .setTankCapacity(3000)
                            .setColors(new String[] {"Black", "Skin16", "Red", "Yellow", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.8)
            );

            // Tender460
            put(ItemIDs.minecartTender460.item,
                    new TrainRecord("Tender460", Tender460.class, ItemIDs.minecartTender460.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3)
                            .setTankCapacity(26000)
                            .setColors(new String[] {"Black", "Skin16", "Red", "Yellow", "Skin17"})
                            .setGuiRenderScale(18)
            );

            // PELoco
            put(ItemIDs.minecartPELocomotive.item,
                    new TrainRecord("Loco Steam PELoco", SteamPELoco.class, ItemIDs.minecartPELocomotive.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1484)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(100)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.35)
                            .setBrakeRate(0.975)
                            .setTankCapacity(4000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.4)
            );

            // PETender
            put(ItemIDs.minecartPETender.item,
                    new TrainRecord("Tender PETender", TenderPETender.class, ItemIDs.minecartPETender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(1.5)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
            );

            // PMNstender
            put(ItemIDs.minecartPMNstender.item,
                    new TrainRecord("PMNstender", TenderPMNstender.class, ItemIDs.minecartPMNstender.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(1.5)
                            .setTankCapacity(83000)
                            .setColors(new String[] {"LightGrey", "Yellow", "Orange", "White"})
                            .setGuiRenderScale(15)
            );

            // PMNandN1
            put(ItemIDs.minecartPMNandN1.item,
                    new TrainRecord("PMNandN1", SteamPMNandN1.class, ItemIDs.minecartPMNandN1.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(100)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.6)
                            .setTankCapacity(6000)
                            .setColors(new String[] {"LightGrey", "Yellow", "Grey", "Orange", "White"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6)
            );

            // Alco0_6_0T
            put(ItemIDs.minecartAlco0_6_0T.item,
                    new TrainRecord("Alco0-6-0T", SteamAlco0_6_0T.class, ItemIDs.minecartAlco0_6_0T.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(360)
                            .setMaxSpeed(50)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Black", "Green", "Purple"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-1.2)
            );

            // Brank
            put(ItemIDs.minecartBrank.item,
                    new TrainRecord("Brank2-6-2T", SteamBrank.class, ItemIDs.minecartBrank.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(360)
                            .setMaxSpeed(50)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setWaterConsumption(160)
                            .setHeatingTime(120)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Green"})
                            .setGuiRenderScale(17)
                            .setBogieLocoPosition(-1.0)
            );

            // Lima2_8_0
            put(ItemIDs.minecartLima2_8_0.item,
                    new TrainRecord("Lima2-8-0", SteamLima2_8_0.class, ItemIDs.minecartLima2_8_0.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1250)
                            .setMaxSpeed(65)
                            .setMass(0)
                            .setFuelConsumption(90)
                            .setWaterConsumption(130)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.75)
                            .setTankCapacity(3000)
                            .setColors(new String[] {"Black", "Green", "Lime", "Grey", "Yellow", "Red"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.65)
            );

            // TenderLima2_8_0
            put(ItemIDs.minecartTenderLima2_8_0.item,
                    new TrainRecord("TenderLima2_8_0", TenderLima2_8_0.class, ItemIDs.minecartTenderLima2_8_0.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(3)
                            .setTankCapacity(26000)
                            .setColors(new String[] {"Black", "Green", "Yellow", "Red"})
                            .setGuiRenderScale(18)
            );

            //EMD Electro-Motive Division of GM//

            // F3A
            put(ItemIDs.minecartF3A.item,
                    new TrainRecord("F3A", DieselF3A.class, ItemIDs.minecartF3A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Cyan", "Skin31", "Skin17", "Magenta", "Skin16", "Red", "Black", "Yellow", "Grey", "Orange", "White", "Pink", "Blue", "Purple", "LightBlue", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin32", "Skin33", "Skin34"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.6)
            );

            // F3B
            put(ItemIDs.minecartF3B.item,
                    new TrainRecord("F3B", DieselF3B.class, ItemIDs.minecartF3B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Cyan", "Skin31", "Skin17", "Black", "Yellow", "Grey", "Orange", "LightBlue", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin34"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.4)
            );

            // F7A
            put(ItemIDs.minecartF7A.item,
                    new TrainRecord("F7A", DieselF7A.class, ItemIDs.minecartF7A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Black", "Skin17", "Magenta", "Yellow", "Grey", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Red", "Pink", "LightGrey", "White", "Skin34", "Skin35", "Skin36", "Skin37","Skin38", "Lime", "Green", "Skin39"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.6)
            );

            // F7B
            put(ItemIDs.minecartF7B.item,
                    new TrainRecord("F7B", DieselF7B.class, ItemIDs.minecartF7B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Black", "Skin17", "Magenta", "Yellow", "Grey", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Red", "LightGrey", "Skin34", "Skin36", "Skin37","Skin38", "Lime", "Green", "Skin39"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.4)
            );

            // F9A
            put(ItemIDs.minecartF9A.item,
                    new TrainRecord("F9A", DieselF9A.class, ItemIDs.minecartF9A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Green", "Cyan", "Skin20", "Brown", "Black", "Yellow", "Grey", "Orange", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.6)
            );

            // F9B
            put(ItemIDs.minecartF9B.item,
                    new TrainRecord("F9B", DieselF9B.class, ItemIDs.minecartF9B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(133)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Cyan", "Skin20", "Yellow", "Grey", "Orange", "Skin16"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.4)
            );

            // FP7A
            put(ItemIDs.minecartFP7A.item,
                    new TrainRecord("FP7A", DieselFP7A.class, ItemIDs.minecartFP7A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(192)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Black", "LightGrey", "Skin16", "Orange", "Skin17", "Cyan", "Purple"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.70)
            );

            // FP9A
            put(ItemIDs.minecartFP9A.item,
                    new TrainRecord("FP9A", DieselFP9A.class, ItemIDs.minecartFP9A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(169)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Blue"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.70)
            );

            // CF7angle
            put(ItemIDs.minecartCF7angle.item,
                    new TrainRecord("CF7angle", DieselCF7angle.class, ItemIDs.minecartCF7angle.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Yellow", "Skin29", "Red", "Green", "Brown", "Skin16", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Black", "Magenta", "Purple", "LightBlue", "Skin27", "Skin33", "Skin34", "Skin38"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7round
            put(ItemIDs.minecartCF7round.item,
                    new TrainRecord("CF7round", DieselCF7round.class, ItemIDs.minecartCF7round.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Blue", "Yellow", "Skin18", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7round3 roundcab freelances
            put(ItemIDs.minecartCF7round3.item,
                    new TrainRecord("CF7round3", DieselCF7round3.class, ItemIDs.minecartCF7round3.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Pink", "Cyan", "Skin19", "White", "LightBlue", "Skin20", "Skin24", "Lime", "Skin17", "Skin16"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7angle2 shitass units
            put(ItemIDs.minecartCF7angle2.item,
                    new TrainRecord("CF7angle2", DieselCF7angle2.class, ItemIDs.minecartCF7angle2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1470)
                            .setMaxSpeed(90)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.6)
                            .setBrakeRate(0.9)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Yellow", "Skin16", "Green", "White", "Skin17", "Cyan"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7angle3 angle freelances
            put(ItemIDs.minecartCF7angle3.item,
                    new TrainRecord("CF7angle3", DieselCF7angle3.class, ItemIDs.minecartCF7angle3.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.825)
                            .setBrakeRate(0.8)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"White", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Green", "Skin20", "Grey", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Brown", "Skin26", "Purple", "Lime", "LightGrey", "Pink", "Skin27", "Skin28", "Yellow"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7b
            put(ItemIDs.minecartCF7b.item,
                    new TrainRecord("CF7b", DieselCF7b.class, ItemIDs.minecartCF7b.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.825)
                            .setBrakeRate(0.8)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Cyan"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // CF7hh
            put(ItemIDs.minecartCF7hh.item,
                    new TrainRecord("CF7hh", DieselCF7hh.class, ItemIDs.minecartCF7hh.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.6)
                            .setBrakeRate(0.7)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Lime"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.5)
            );

            // F40PH
            put(ItemIDs.minecartF40PH.item,
                    new TrainRecord("F40PH", DieselF40PH.class, ItemIDs.minecartF40PH.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(103)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Grey", "Red", "Yellow"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.5)
            );

            // E7A
            put(ItemIDs.minecartE7A.item,
                    new TrainRecord("E7A", DieselE7A.class, ItemIDs.minecartE7A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(188)
                            .setMass(4.5)
                            .setFuelConsumption(10)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Magenta", "Cyan", "Skin43", "Green", "Lime", "Brown", "Black", "Orange", "Blue", "LightBlue", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin42", "Skin37" ,"Skin41", "Skin38", "Skin39", "Skin40"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.65)
            );

            // E7B
            put(ItemIDs.minecartE7B.item,
                    new TrainRecord("E7B", DieselE7B.class, ItemIDs.minecartE7B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(188)
                            .setMass(4.5)
                            .setFuelConsumption(10)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Magenta", "Orange", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "Skin27", "Skin37", "Black", "Skin28", "Skin29"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.77)
            );

            // E8A
            put(ItemIDs.minecartE8A.item,
                    new TrainRecord("E8A", DieselE8A.class, ItemIDs.minecartE8A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.69)
                            .setTankCapacity(11000)
                            .setColors(new String[] {"Orange", "Purple", "Cyan", "Blue", "Brown", "Red", "Pink", "Skin21", "Yellow", "Lime", "Grey", "LightGrey", "White", "Green", "LightBlue", "Black", "Magenta", "Skin17", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.65)
            );

            // E8B
            put(ItemIDs.minecartE8B.item,
                    new TrainRecord("E8B", DieselE8B.class, ItemIDs.minecartE8B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.69)
                            .setTankCapacity(11000)
                            .setColors(new String[] {"Orange", "Blue", "Red", "Grey", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.77)
            );

            // E9A
            put(ItemIDs.minecartE9A.item,
                    new TrainRecord("E9A", DieselE9A.class, ItemIDs.minecartE9A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.69)
                            .setTankCapacity(11000)
                            .setColors(new String[] {"LightGrey", "Grey", "Skin16"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.75)
            );

            // E9B
            put(ItemIDs.minecartE9B.item,
                    new TrainRecord("E9B", DieselE9B.class, ItemIDs.minecartE9B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.69)
                            .setTankCapacity(11000)
                            .setColors(new String[] {"LightGrey", "Grey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6875)
            );

            // CE8
            put(ItemIDs.minecartCE8.item,
                    new TrainRecord("CE8", DieselCE8.class, ItemIDs.minecartCE8.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(116)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.69)
                            .setTankCapacity(11000)
                            .setColors(new String[] {"Cyan", "Brown", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.65)
            );

            // GP7
            put(ItemIDs.minecartGP7.item,
                    new TrainRecord("GP7", DieselGP7.class, ItemIDs.minecartGP7.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"White", "Green", "Black", "Skin26", "Skin19", "LightGrey", "Skin20", "Skin21", "Lime", "Purple", "Blue", "Skin25", "Skin16", "Skin17", "Skin18", "Skin59", "Grey", "Orange", "Pink", "Skin35", "Skin36", "Skin37", "Skin38", "Skin22", "Brown", "Skin23", "LightBlue", "Skin24", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Red", "Magenta", "Skin46", "Skin47", "Skin48", "Skin49", "Skin50", "Skin51", "Skin52", "Skin53", "Skin54", "Skin55", "Skin56", "Skin57", "Skin58", "Skin60", "Skin61", "Skin62", "Skin63"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP7b
            put(ItemIDs.minecartGP7b.item,
                    new TrainRecord("GP7b", DieselGP7b.class, ItemIDs.minecartGP7b.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Blue", "LightGrey", "White"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP7u
            put(ItemIDs.minecartGP7u.item,
                    new TrainRecord("GP7u", DieselGP7u.class, ItemIDs.minecartGP7u.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Red", "Blue", "LightGrey", "White", "Skin16", "Grey", "Green", "Cyan", "Skin17"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP7f
            put(ItemIDs.minecartGP7f.item,
                    new TrainRecord("GP7f", DieselGP7f.class, ItemIDs.minecartGP7f.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Yellow", "Blue", "Skin16", "LightGrey", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GPFDL
            put(ItemIDs.minecartGPFDL.item,
                    new TrainRecord("GPFDL", DieselGPFDL.class, ItemIDs.minecartGPFDL.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(4)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Cyan","LightGrey", "Skin16", "Green"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP9
            put(ItemIDs.minecartGP9.item,
                    new TrainRecord("GP9", DieselGP9.class, ItemIDs.minecartGP9.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Green", "Black", "Skin21", "Orange", "Skin25", "White", "Skin18", "Skin16", "Skin17", "LightGrey", "Skin19", "Skin20", "Pink", "Magenta", "Skin35", "Skin36", "Skin37", "LightBlue", "Skin23", "Brown", "Skin26", "Skin31", "Skin28", "Skin29", "Skin30", "Skin33", "Skin34", "Skin38", "Yellow", "Blue", "Skin39", "Skin40", "Purple", "Lime", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Skin46", "Skin47", "Skin48", "Skin49", "Skin50", "Red", "Skin51", "Skin52", "Skin53", "Skin22", "Skin24", "Skin27", "Skin54", "Skin55", "Skin32", "Skin56"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP9b
            put(ItemIDs.minecartGP9b.item,
                    new TrainRecord("GP9b", DieselGP9b.class, ItemIDs.minecartGP9b.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Yellow", "Black", "Grey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP13
            put(ItemIDs.minecartGP13.item,
                    new TrainRecord("GP13", DieselGP13.class, ItemIDs.minecartGP13.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2510)
                            .setMaxSpeed(90)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Blue", "LightBlue", "Black", "Orange", "White", "Yellow", "Cyan"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(1.4)
                            .setAdditionalTooltip(new String[] {"Uses the heritage GP40 Model"})
            );

            // GP15
            put(ItemIDs.minecartGP15.item,
                    new TrainRecord("GP15", DieselGP15.class, ItemIDs.minecartGP15.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new  String[] {"Yellow", "LightGrey", "LightBlue", "Skin26", "Skin16", "Blue", "Skin17", "Skin21", "Skin18", "Skin19", "Skin20", "Skin22"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // GP15T
            put(ItemIDs.minecartGP15T.item,
                    new TrainRecord("GP15T", DieselGP15T.class, ItemIDs.minecartGP15T.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new  String[] {"Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // GP18
            put(ItemIDs.minecartGP18.item,
                    new TrainRecord("GP18", DieselGP18.class, ItemIDs.minecartGP18.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Black", "Green", "Blue", "Pink", "Skin16", "Skin17", "Purple", "Skin18", "Skin19", "LightGrey", "Skin20", "Skin21"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP20
            put(ItemIDs.minecartGP20.item,
                    new TrainRecord("GP20", DieselGP20.class, ItemIDs.minecartGP20.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(12)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.80)
                            .setBrakeRate(0.85)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"LightGrey","Orange","Yellow","Skin25","Red","Skin24","Black","Blue","Green","Skin21","Skin22","LightBlue","Skin23","Skin17","Skin18","Skin19","Skin20"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.9)
            );

            // GP30
            put(ItemIDs.minecartGP30.item,
                    new TrainRecord("GP30", DieselGP30.class, ItemIDs.minecartGP30.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(134)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Orange", "Black", "Blue", "Skin23", "Skin24", "LightBlue", "Grey", "Skin17", "Yellow", "Green", "Skin18", "Skin16", "Purple", "Pink", "Red", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22", "Magenta", "Lime", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.9)
            );

            // GP35
            put(ItemIDs.minecartGP35.item,
                    new TrainRecord("GP35", DieselGP35.class, ItemIDs.minecartGP35.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(14)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new  String[] {"Red", "Skin19", "Black", "Magenta", "Skin16", "Grey", "Skin17", "LightBlue", "LightGrey", "Skin18", "Pink", "Yellow", "Purple", "Lime", "Cyan", "Skin20", "Skin21", "White", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Green", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin37", "Brown", "Skin36", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.9)
            );

            // GP38dash9W
            put(ItemIDs.minecartGP38dash9W.item,
                    new TrainRecord("GP38dash9W", DieselGP38dash9W.class, ItemIDs.minecartGP38dash9W.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.5)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.2)
            );

            // GP38H3
            put(ItemIDs.minecartGP38h3.item,
                    new TrainRecord("GP38H3", DieselGP38H3.class, ItemIDs.minecartGP38h3.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(169)
                            .setMass(0)
                            .setFuelConsumption(12)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(16000)
                            .setColors(new  String[] {"White", "Blue"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.25)
            );

            // GP38
            put(ItemIDs.minecartGP38.item,
                    new TrainRecord("GP38", DieselGP38.class, ItemIDs.minecartGP38.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"LightGrey", "Cyan", "Grey", "Skin18", "Skin26", "Skin21", "Skin22", "Skin23", "Skin24", "Magenta", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Red", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP38Dash2
            put(ItemIDs.minecartGP38dash2.item,
                    new TrainRecord("GP38Dash2", DieselGP38dash2.class, ItemIDs.minecartGP38dash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Yellow", "Green", "Skin16", "Black", "Skin17", "Skin19", "Skin20", "Orange", "Skin25", "Skin29", "Skin30", "Skin31", "Blue", "LightBlue"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // GP39
            put(ItemIDs.minecartGP39.item,
                    new TrainRecord("GP39", DieselGP39.class, ItemIDs.minecartGP39.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Green", "Grey", "Blue", "Skin38", "Skin39"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP39Dash2
            put(ItemIDs.minecartGP39Dash2.item,
                    new TrainRecord("GP39Dash2", DieselGP39Dash2.class, ItemIDs.minecartGP39Dash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Green", "Skin16", "Skin18", "Skin19", "LightBlue"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP39TDash2
            put(ItemIDs.minecartGP39TDash2.item,
                    new TrainRecord("GP39TDash2", DieselGP39TDash2.class, ItemIDs.minecartGP39TDash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Green"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP39TDash2B
            put(ItemIDs.minecartGP39TDash2B.item,
                    new TrainRecord("GP39TDash2B", DieselGP39TDash2B.class, ItemIDs.minecartGP39TDash2B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Green"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP40
            put(ItemIDs.minecartGP40.item,
                    new TrainRecord("GP40", DieselGP40.class, ItemIDs.minecartGP40.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Pink", "Red", "Skin20", "Grey", "Orange", "Skin21", "Skin22", "Green", "Magenta", "Skin19", "Skin23", "Skin24", "Skin25", "Skin28", "Skin30", "Skin32", "Skin33", "Skin34", "Cyan", "Skin35", "Lime", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP40Dash2
            put(ItemIDs.minecartGP40Dash2.item,
                    new TrainRecord("GP40Dash2", DieselGP40Dash2.class, ItemIDs.minecartGP40Dash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Skin31", "Skin16", "Skin17", "Skin27", "Lime", "White", "Skin18", "LightGrey", "Black", "Skin26", "Skin29", "Grey", "Blue", "LightBlue", "Skin32", "Skin42"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // GP40TC
            put(ItemIDs.minecartGP40tc.item,
                    new TrainRecord("GP40TC", DieselGP40TC.class, ItemIDs.minecartGP40tc.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(169)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(16000)
                            .setColors(new  String[] {"Blue", "White"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.25)
            );

            // GP49
            put(ItemIDs.minecartGP49.item,
                    new TrainRecord("GP49", DieselGP49.class, ItemIDs.minecartGP49.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2800)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(18)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Blue", "LightGrey", "Purple"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SD9
            put(ItemIDs.minecartSD9.item,
                    new TrainRecord("SD9", DieselSD9.class, ItemIDs.minecartSD9.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1750)
                            .setMaxSpeed(104)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Red", "Black", "Orange", "Skin17", "Cyan", "LightGrey", "Skin18", "Yellow", "Magenta", "Skin19", "Skin20", "Pink", "Skin21", "Skin22", "Purple", "Skin23"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.05)
            );

            // SD38
            put(ItemIDs.minecartSD38.item,
                    new TrainRecord("SD38", DieselSD38.class, ItemIDs.minecartSD38.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"White", "LightGrey", "LightBlue", "Blue", "Skin16", "Cyan", "Skin17", "Black", "Skin18", "Grey", "Skin20", "Skin21", "Skin19"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD39
            put(ItemIDs.minecartSD39.item,
                    new TrainRecord("SD39", DieselSD39.class, ItemIDs.minecartSD39.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Orange", "LightGrey", "Brown", "Skin18", "Skin19", "Skin20", "Cyan", "Purple"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SDL39
            put(ItemIDs.minecartSDL39.item,
                    new TrainRecord("SDL39", DieselSDL39.class, ItemIDs.minecartSDL39.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(152)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(7000)
                            .setColors(new String[] {"Orange", "Pink", "Magenta", "Red", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.9)
            );

            // SD40
            put(ItemIDs.minecartSD40.item,
                    new TrainRecord("SD40", DieselSD40.class, ItemIDs.minecartSD40.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Blue", "LightGrey", "Skin16", "Red", "Skin17", "Cyan", "Black", "Skin18", "Skin20", "Skin21", "Skin22", "Grey", "Skin23", "Skin41", "Skin42", "Skin43", "Skin19", "Skin24"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD40dash2
            put(ItemIDs.minecartSD40dash2.item,
                    new TrainRecord("SD40-2", DieselSD40dash2.class, ItemIDs.minecartSD40dash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Magenta", "Green", "White", "Skin18", "Yellow", "Orange", "Skin20", "Purple", "Skin21", "LightBlue", "Red", "Pink", "Black", "Skin22", "Skin23", "Skin16", "Skin17", "Skin19", "Brown", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Lime", "Grey", "Skin39", "Skin40", "Skin41", "Skin42"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD40T2
            put(ItemIDs.minecartSD40T2.item,
                    new TrainRecord("SD40T-2", DieselSD40T2.class, ItemIDs.minecartSD40T2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(14000)
                            .setColors(new String[] {"Black", "Grey", "Red", "Skin17", "Yellow", "Magenta", "Blue", "LightGrey", "LightBlue", "Skin16", "Skin18", "Green", "White", "Cyan", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD40dash2B
            put(ItemIDs.minecartSD40dash2B.item,
                    new TrainRecord("SD40-2B", DieselSD40dash2B.class, ItemIDs.minecartSD40dash2B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Red"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.8)
            );

            // SD40R
            put(ItemIDs.minecartSD40R.item,
                    new TrainRecord("SD40R", DieselSD40R.class, ItemIDs.minecartSD40R.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Grey", "LightGrey", "Skin16", "Skin17"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD40A
            put(ItemIDs.minecartSD40A.item,
                    new TrainRecord("SD40A", DieselSD40A.class, ItemIDs.minecartSD40A.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(14000)
                            .setColors(new String[] {"Blue", "Skin16", "Black", "Skin17", "Orange", "Grey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SDP40
            put(ItemIDs.minecartSDP40.item,
                    new TrainRecord("SDP40", DieselSDP40.class, ItemIDs.minecartSDP40.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(160)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(14000)
                            .setColors(new String[] {"Green", "Skin16", "Skin17", "Grey", "LightGrey", "Skin18", "Purple", "Blue", "Orange", "Skin19"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SDP40F
            put(ItemIDs.minecartSDP40F.item,
                    new TrainRecord("SDP40F", DieselSDP40F.class, ItemIDs.minecartSDP40F.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(160)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"LightBlue", "White", "LightGrey", "Grey", "Yellow"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.95)
            );

            // SD40dash3
            put(ItemIDs.minecartSD40dash3.item,
                    new TrainRecord("SD40-3", DieselSD40dash3.class, ItemIDs.minecartSD40dash3.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(30)//its a crap rebuild its gonna use more fuel tee hee
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Blue", "Yellow", "Orange"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD45
            put(ItemIDs.minecartSD45dash2.item,
                    new TrainRecord("SD45", DieselSD45dash2.class, ItemIDs.minecartSD45dash2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(132)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Blue","Skin16","Green","Pink","Grey","Black","Skin17","Skin18","Orange","Skin19","Yellow","Skin20","Red","Skin21","Skin22","Skin23","Skin24","Skin25","Skin26","LightGrey","Skin27","Skin28", "Skin29", "Skin30", "Purple", "Skin31", "Skin32"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // SD45dash2B
            put(ItemIDs.minecartSD45dash2B.item,
                    new TrainRecord("SD45-2B", DieselSD45dash2B.class, ItemIDs.minecartSD45dash2B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(132)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Blue", "Yellow", "Red", "White"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.8)
            );

            // SDP45
            put(ItemIDs.minecartSDP45.item,
                    new TrainRecord("SDP45", DieselSDP45.class, ItemIDs.minecartSDP45.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(160)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(14000)
                            .setColors(new String[] {"Red", "Grey", "Blue", "Green", "Skin16", "Purple", "Pink"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // FP45
            put(ItemIDs.minecartFP45.item,
                    new TrainRecord("FP45", DieselFP45.class, ItemIDs.minecartFP45.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(145)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Orange", "Yellow", "LightGrey", "Grey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.95)
            );

            // F45
            put(ItemIDs.minecartF45.item,
                    new TrainRecord("F45", DieselF45.class, ItemIDs.minecartF45.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(145)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.58)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"LightBlue", "Green", "Blue", "Yellow", "Red"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.65)
            );

            // SD50
            put(ItemIDs.minecartSD50.item,
                    new TrainRecord("SD50", DieselSD50.class, ItemIDs.minecartSD50.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(142)
                            .setMass(0)
                            .setFuelConsumption(26)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(23000)
                            .setColors(new String[] {"Purple", "Pink", "Blue", "LightBlue", "Brown", "Black", "White", "LightGrey", "Green", "Cyan", "Skin16", "Grey", "Yellow"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.725)
            );

            // SD60
            put(ItemIDs.minecartSD60.item,
                    new TrainRecord("SD60", DieselSD60.class, ItemIDs.minecartSD60.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(27)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(23000)
                            .setColors(new String[] {"Blue", "Skin16", "Red", "Yellow", "Brown", "LightBlue", "LightGrey", "Purple", "Green", "Lime", "Skin18", "Skin19", "Skin20", "White", "Skin17"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.725)
            );

            // SD70M
            put(ItemIDs.minecartSD70M.item,
                    new TrainRecord("SD70M", DieselSD70M.class, ItemIDs.minecartSD70M.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(112)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Black", "LightGrey", "Blue", "Skin16"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // SD70Mac
            put(ItemIDs.minecartSD70Mac.item,
                    new TrainRecord("SD70Mac", DieselSD70Mac.class, ItemIDs.minecartSD70Mac.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(112)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new String[]{"Blue", "Grey", "Skin16", "Skin17", "LightGrey", "Cyan"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.25)
            );

            // SD70ACe
            put(ItemIDs.minecartSD70ACe.item,
                    new TrainRecord("SD70ACe", DieselSD70ACe.class, ItemIDs.minecartSD70ACe.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4300)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"LightGrey", "Grey", "Blue", "LightBlue", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Black", "Skin27", "Skin28", "Skin29"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // SD70ACe_H
            put(ItemIDs.minecartSD70ACe_H.item,
                    new TrainRecord("SD70ACe_H", DieselSD70ACe_H.class, ItemIDs.minecartSD70ACe_H.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4300)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Skin16", "Purple", "Grey", "Yellow", "Green", "Orange", "White", "Blue", "Lime", "Black", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // SW1
            put(ItemIDs.minecartSW1.item,
                    new TrainRecord("SW1", DieselSW1.class, ItemIDs.minecartSW1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(4)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.6)
                            .setBrakeRate(0.890)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Orange", "Green", "Skin22", "LightBlue", "Skin16", "Black", "Skin17", "Pink", "Purple", "Skin18", "Skin19", "Lime", "Skin20", "Skin21", "Skin23", "Skin24", "Skin25", "Skin26", "Cyan", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Red", "Magenta"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW8
            put(ItemIDs.minecartSW8.item,
                    new TrainRecord("SW8", DieselSW8.class, ItemIDs.minecartSW8.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(800)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[]{"Red", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20" })
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.0)
            );

            // SW9
            put(ItemIDs.minecartSW9.item,
                    new TrainRecord("SW9", DieselSW9.class, ItemIDs.minecartSW9.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"LightGrey", "Grey", "Green", "Cyan", "Blue", "Magenta", "Black", "Skin16"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW10
            put(ItemIDs.minecartSW10.item,
                    new TrainRecord("SW10", DieselSW10.class, ItemIDs.minecartSW10.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(81)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[]{"Yellow", "LightGrey", "Cyan", "Skin16", "Skin17", "Skin18", "Purple", "Orange", "Pink"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.0)
            );

            // SW900
            put(ItemIDs.minecartSW900.item,
                    new TrainRecord("SW900", DieselSW900.class, ItemIDs.minecartSW900.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(900)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Brown", "LightBlue", "White", "LightGrey", "Magenta", "Skin16", "Skin17", "Purple", "Skin18", "Blue", "Orange", "Skin19", "Pink"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW1000
            put(ItemIDs.minecartSW1000.item,
                    new TrainRecord("SW1000", DieselSW1000.class, ItemIDs.minecartSW1000.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(4)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Green", "LightGrey", "Purple", "Yellow", "Skin16", "Skin19", "Skin20", "Magenta", "Skin21", "Skin22", "Brown"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW1200
            put(ItemIDs.minecartSW1200.item,
                    new TrainRecord("SW1200", DieselSW1200.class, ItemIDs.minecartSW1200.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Lime", "Green", "Black", "Grey", "Yellow", "Pink", "Orange", "Blue", "Purple", "Magenta", "Brown", "LightGrey", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW1500
            put(ItemIDs.minecartSW1500.item,
                    new TrainRecord("SW1500", DieselSW1500.class, ItemIDs.minecartSW1500.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightBlue", "LightGrey", "Grey", "Purple", "Black", "Magenta", "Pink", "Cyan", "Skin18", "Orange", "Skin16", "Blue", "Skin17", "Green", "Skin24", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Red", "Lime", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // SW1600
            put(ItemIDs.minecartSW1600.item,
                    new TrainRecord("SW1600", DieselSW1600.class, ItemIDs.minecartSW1600.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Cyan", "Skin16"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // MP900
            put(ItemIDs.minecartMP900.item,
                    new TrainRecord("MP900", DieselMP900.class, ItemIDs.minecartMP900.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(950)
                            .setMaxSpeed(81)
                            .setMass(0)
                            .setFuelConsumption(4)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.95)
                            .setBrakeRate(0.65)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Blue", "LightGrey", "Cyan"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // MP15DCW9
            put(ItemIDs.minecartMP15DCW9.item,
                    new TrainRecord("MP15DCW9", DieselMP15DCW9.class, ItemIDs.minecartMP15DCW9.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(97)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Orange", "Skin16", "White"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.3)
            );

            // TR4
            put(ItemIDs.minecartTR4.item,
                    new TrainRecord("TR4", DieselTR4.class, ItemIDs.minecartTR4.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Grey", "Orange", "Purple", "Cyan", "Magenta", "LightGrey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // TR4B
            put(ItemIDs.minecartTR4B.item,
                    new TrainRecord("TR4B", DieselTR4B.class, ItemIDs.minecartTR4B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Grey", "Orange", "Purple", "Cyan", "Magenta", "LightGrey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // Beep
            put(ItemIDs.minecartBeep.item,
                    new TrainRecord("Beep", DieselBeep.class, ItemIDs.minecartBeep.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.89)
                            .setBrakeRate(0.8)
                            .setTankCapacity(9000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.2)
            );

            //GE Transportation//

            // GE44Ton
            put(ItemIDs.minecart44Ton.item,
                    new TrainRecord("GE 44-ton", DieselGE44Ton.class, ItemIDs.minecart44Ton.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(360)
                            .setMaxSpeed(56)
                            .setMass(0)
                            .setFuelConsumption(3)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.75)
                            .setTankCapacity(7000)
                            .setColors(new String[]{"Yellow", "Pink", "LightGrey", "Skin16", "Black", "Skin17", "Skin18", "Magenta", "Purple", "Skin19", "Red", "Skin20", "Skin21", "Skin22", "Brown", "Skin23"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.0)
            );

            // Boxcab23Ton
            put(ItemIDs.minecartBoxcab23Ton.item,
                    new TrainRecord("23 Ton Boxcab", DieselBoxcab23Ton.class, ItemIDs.minecartBoxcab23Ton.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(150)
                            .setMaxSpeed(40)
                            .setMass(0)
                            .setFuelConsumption(2)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.6)
                            .setBrakeRate(0.6)
                            .setTankCapacity(4000)
                            .setColors(new String[] {"Blue", "White", "Black", "Green"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.5)
            );

            // GE25Ton
            put(ItemIDs.minecart25Ton.item,
                    new TrainRecord("GE 25-ton", DieselGE25Ton.class, ItemIDs.minecart25Ton.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(150)
                            .setMaxSpeed(50)
                            .setMass(0)
                            .setFuelConsumption(2)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.7)
                            .setTankCapacity(4000)
                            .setColors(new String[]{"Brown", "Pink", "Cyan", "Orange", "Green"})
                            .setGuiRenderScale(20)
                            .setBogieLocoPosition(-1)
            );

            // U18B old model
            put(ItemIDs.minecartU18B.item,
                    new TrainRecord("U18B", DieselU18B.class, ItemIDs.minecartU18B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Orange","Skin16", "Red", "Skin17", "LightGrey", "Pink", "Magenta", "Purple", "Lime", "Yellow", "Grey", "Skin18", "Skin19", "Black", "Skin20", "Skin22", "Brown", "LightBlue", "Blue", "Skin23", "Skin24", "Skin25", "Skin26"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
                            .setAdditionalTooltip(new String[] {"SOON TO BE REMOVED"})
            );

            // U18BB
            put(ItemIDs.minecartU18BB.item,
                    new TrainRecord("U18BB", DieselU18BB.class, ItemIDs.minecartU18BB.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Lime", "Skin27"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // U18BW
            put(ItemIDs.minecartU18BW.item,
                    new TrainRecord("U18BW", DieselU18BW.class, ItemIDs.minecartU18BW.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Brown", "White", "Orange", "Grey", "Lime"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // U18B new model
            put(ItemIDs.minecartU18Balt.item,
                    new TrainRecord("U18Balt", DieselU18Balt.class, ItemIDs.minecartU18Balt.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Brown", "Cyan", "White", "LightGrey", "Skin16", "Skin17", "Skin18", "Lime", "Skin19", "Skin22", "Skin23", "Skin24", "Skin25", "Skin21", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Grey", "Orange", "Black"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // U18BWH
            put(ItemIDs.minecartU18BWH.item,
                    new TrainRecord("U18BWH", DieselU18BWH.class, ItemIDs.minecartU18BWH.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.86)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Pink", "LightGrey", "Purple"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U23B
            put(ItemIDs.minecartU23B.item,
                    new TrainRecord("U23B", DieselU23B.class, ItemIDs.minecartU23B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Yellow", "Grey", "LightBlue", "LightGrey", "Skin17", "Skin21", "Skin22", "Blue", "Skin25", "Magenta", "Black", "Pink", "Green", "Skin18", "Skin20", "Skin24", "Skin26", "Skin27", "Skin28", "Orange", "Skin19", "Skin29", "Skin30", "Red", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin23", "Skin38", "Skin39", "Skin40", "Skin41"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U23BU
            put(ItemIDs.minecartU23BU.item,
                    new TrainRecord("U23BU", DieselU23BU.class, ItemIDs.minecartU23BU.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.86)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Cyan", "Skin16", "Skin17", "White", "Skin18", "LightBlue", "Skin19", "Yellow", "Skin20", "Blue", "Purple", "Pink"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U23BW
            put(ItemIDs.minecartU23BW.item,
                    new TrainRecord("U23BW", DieselU23BW.class, ItemIDs.minecartU23BW.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.86)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"LightGrey", "Grey"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SF30B
            put(ItemIDs.minecartSF30B.item,
                    new TrainRecord("SF30B", DieselSF30B.class, ItemIDs.minecartSF30B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.86)
                            .setTankCapacity(25000)
                            .setColors(new String[] {"LightGrey", "Brown", "Skin16", "Blue", "Yellow", "LightBlue", "Orange", "Cyan", "Red"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U25B
            put(ItemIDs.minecartU25B.item,
                    new TrainRecord("U25B", DieselU25B.class, ItemIDs.minecartU25B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2500)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Black", "LightGrey", "Skin18", "Blue", "Orange", "Pink", "Green", "Skin16", "Red", "Skin17", "Skin19", "Skin20", "Skin21", "Brown"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.3)
            );

            // U30BH
            put(ItemIDs.minecartU30BH.item,
                    new TrainRecord("U30BH", DieselU30BH.class, ItemIDs.minecartU30BH.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2950)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Brown", "LightGrey", "Purple", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U36B
            put(ItemIDs.minecartU36B.item,
                    new TrainRecord("U36B", DieselU36B.class, ItemIDs.minecartU36B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(121)
                            .setMass(0)
                            .setFuelConsumption(26)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Purple", "Blue", "Grey", "LightGrey", "Skin19", "Skin20", "Skin21", "Skin22", "LightBlue", "Green", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // U23C
            put(ItemIDs.minecartU23C.item,
                    new TrainRecord("U23C", DieselU23C.class, ItemIDs.minecartU23C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"LightBlue", "Skin17", "LightGrey", "Blue", "Skin24"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.3)
            );

            // U30C
            put(ItemIDs.minecartU30C.item,
                    new TrainRecord("U30C", DieselU30C.class, ItemIDs.minecartU30C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Green", "LightGrey", "Cyan", "Skin16", "Grey", "Skin17", "Skin18", "Lime", "Orange", "Skin19", "Skin20", "Yellow", "Skin21", "Skin22", "Skin23", "Skin24" })
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.3)
            );

            // SF30C
            put(ItemIDs.minecartSF30C.item,
                    new TrainRecord("SF30C", DieselSF30C.class, ItemIDs.minecartSF30C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(121)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Yellow", "Red"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.3)
            );

            // U36C
            put(ItemIDs.minecartU36C.item,
                    new TrainRecord("U36C", DieselU36C.class, ItemIDs.minecartU36C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(26)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.84)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Grey", "Blue", "Red", "Yellow", "Orange", "Cyan"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.75)
            );

            // U50
            put(ItemIDs.minecartU50.item,
                    new TrainRecord("U50", DieselU50.class, ItemIDs.minecartU50.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(5000)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(40)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Yellow", "Red", "LightGrey", "Skin16", "Skin17", "Black", "Skin18"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-4.35)
            );

            // U56
            put(ItemIDs.minecartU56.item,
                    new TrainRecord("U56", DieselU56.class, ItemIDs.minecartU56.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(5600)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Cyan", "Skin16"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-4.35)
            );

            // SB18R
            put(ItemIDs.minecartSB18R.item,
                    new TrainRecord("SB18R", DieselSB18R.class, ItemIDs.minecartSB18R.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Grey", "Green", "Skin17", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // SB18E
            put(ItemIDs.minecartSB18E.item,
                    new TrainRecord("SB18E", DieselSB18E.class, ItemIDs.minecartSB18E.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Blue", "Green", "Skin17", "Skin20", "Skin21", "Skin22"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // SB18B
            put(ItemIDs.minecartSB18B.item,
                    new TrainRecord("SB18B", DieselSB18B.class, ItemIDs.minecartSB18B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"LightGrey", "Skin20", "Skin21", "Skin22", "Skin23"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.6)
            );

            // B23
            put(ItemIDs.minecartB23.item,
                    new TrainRecord("B23-7", DieselB23.class, ItemIDs.minecartB23.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Grey", "Skin17", "Cyan", "Skin16", "White", "Magenta", "Purple", "Skin20", "Pink", "LightBlue", "Black", "LightGrey", "Brown", "Skin18", "Blue", "Yellow", "Skin19", "Skin21", "Green", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin29", "Orange", "Skin27", "Skin28", "Skin32", "Skin33", "Skin35", "Skin36", "Skin37"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // B23_wrx
            put(ItemIDs.minecartB23_wrx.item,
                    new TrainRecord("B23-7_wrx", DieselB23_wrx.class, ItemIDs.minecartB23_wrx.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(101)
                            .setMass(0)
                            .setFuelConsumption(12)
                            .setHeatingTime(185)
                            .setAccelerationRate(0.84)
                            .setBrakeRate(0.92)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // B23S7
            put(ItemIDs.minecartB23S7.item,
                    new TrainRecord("B23-S7", DieselB23S7.class, ItemIDs.minecartB23S7.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Grey", "Skin17", "LightGrey", "Cyan", "Green", "Skin18", "Blue", "Skin19"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // BQ23
            put(ItemIDs.minecartBQ23.item,
                    new TrainRecord("BQ23-7", DieselBQ23.class, ItemIDs.minecartBQ23.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2250)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Grey", "Red", "Skin17", "LightGrey", "Skin18", "LightBlue", "Pink", "Skin16", "Cyan"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SB23R
            put(ItemIDs.minecartSB23R.item,
                    new TrainRecord("SB23R", DieselSB23R.class, ItemIDs.minecartSB23R.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Cyan", "Magenta", "LightGrey"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SB23E
            put(ItemIDs.minecartSB23E.item,
                    new TrainRecord("SB23E", DieselSB23E.class, ItemIDs.minecartSB23E.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2300)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(13)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Green", "Skin16", "Cyan", "LightGrey", "Blue", "Magenta"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // B30
            put(ItemIDs.minecartB30.item,
                    new TrainRecord("B30-7", DieselB30.class, ItemIDs.minecartB30.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Black", "Skin34", "Skin31", "Blue", "Skin38", "Skin36", "Skin35", "Skin37", "Skin42" })
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // B36
            put(ItemIDs.minecartB36.item,
                    new TrainRecord("B36-7", DieselB36.class, ItemIDs.minecartB36.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(26)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Black", "Skin30", "Skin31", "Skin40", "Skin38", "Skin41", "Skin36", "Skin39", "Lime", "Skin16"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SB36X
            put(ItemIDs.minecartSB36X.item,
                    new TrainRecord("SB36X", DieselSB36X.class, ItemIDs.minecartSB36X.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(28)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.54)
                            .setBrakeRate(0.96)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Blue", "LightBlue", "Cyan", "Purple", "Green", "Orange", "Pink", "Red", "Magenta", "Yellow", "White"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // Dash818BE
            put(ItemIDs.minecartDash818BE.item,
                    new TrainRecord("Dash818BE", DieselDash818BE.class, ItemIDs.minecartDash818BE.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1850)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.75)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Cyan"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // Dash832BWH
            put(ItemIDs.minecartDash832BWH.item,
                    new TrainRecord("Dash832BWH", DieselDash832BWH.class, ItemIDs.minecartDash832BWH.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3200)
                            .setMaxSpeed(166)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.9)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Grey", "LightGrey", "Blue", "Orange", "Skin16"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6)
            );

            // Dash839C
            put(ItemIDs.minecartDash839C.item,
                    new TrainRecord("Dash839C", DieselDash839C.class, ItemIDs.minecartDash839C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3900)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(27)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"LightBlue", "Grey", "Skin19", "Black", "Blue", "Skin17", "Cyan", "LightGrey", "Skin16", "Brown", "Orange", "Skin18", "Skin20"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // Dash839CE
            put(ItemIDs.minecartDash839CE.item,
                    new TrainRecord("Dash839CE", DieselDash839CE.class, ItemIDs.minecartDash839CE.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3900)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Cyan", "Skin18", "Skin19", "Black", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // Dash839B
            put(ItemIDs.minecartDash839B.item,
                    new TrainRecord("Dash839B", DieselDash839B.class, ItemIDs.minecartDash839B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3900)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Grey", "Orange", "Skin16", "Skin17", "LightGrey", "Cyan", "Skin18", "Brown", "Skin19"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6)
            );

            // Dash840B
            put(ItemIDs.minecartDash840B.item,
                    new TrainRecord("Dash840B", DieselDash840B.class, ItemIDs.minecartDash840B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Grey", "Blue", "Yellow", "Orange", "LightBlue", "Pink", "Purple", "Black"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6)
            );

            // Dash840BB
            put(ItemIDs.minecartDash840BB.item,
                    new TrainRecord("Dash840BB", DieselDash840BB.class, ItemIDs.minecartDash840BB.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Skin17"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.3)
            );

            // Dash840BW
            put(ItemIDs.minecartDash840BW.item,
                    new TrainRecord("Dash840BW", DieselDash840BW.class, ItemIDs.minecartDash840BW.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.88)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "Orange", "LightGrey", "Skin16", "Pink", "Skin17"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.6)
            );

            // Dash840C
            put(ItemIDs.minecartDash840C.item,
                    new TrainRecord("Dash840C", DieselDash840C.class, ItemIDs.minecartDash840C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.88)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Yellow", "Grey", "LightBlue", "Skin24", "Skin22", "Skin25", "Blue", "Skin16", "LightGrey", "Skin17", "Purple", "Skin23", "Skin26"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4)
            );

            // Dash841C
            put(ItemIDs.minecartDash841C.item,
                    new TrainRecord("Dash841C", DieselDash841C.class, ItemIDs.minecartDash841C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4100)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(31)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Red", "LightGrey", "Pink", "Orange", "Skin16", "Green", "Skin17", "Lime"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // Dash940C
            put(ItemIDs.minecartDash940C.item,
                    new TrainRecord("Dash940C", DieselDash940C.class, ItemIDs.minecartDash940C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(119)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"White"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // Dash944CW
            put(ItemIDs.minecartDash944CW.item,
                    new TrainRecord("Dash944CW", DieselDash944CW.class, ItemIDs.minecartDash944CW.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4400)
                            .setMaxSpeed(119)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Black", "Skin16", "LightGrey", "Grey", "Orange", "Magenta", "Skin17", "Pink", "Green", "White", "Skin27", "Skin18", "Red", "Skin19", "LightBlue", "Skin28"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // AC4400CW
            put(ItemIDs.minecartAC4400CW.item,
                    new TrainRecord("AC4400CW", DieselAC4400CW.class, ItemIDs.minecartAC4400CW.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4400)
                            .setMaxSpeed(119)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"LightBlue", "Blue", "Skin16", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // AC4400C
            put(ItemIDs.minecartAC4400C.item,
                    new TrainRecord("AC4400C", DieselAC4400C.class, ItemIDs.minecartAC4400C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4400)
                            .setMaxSpeed(119)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.87)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Green", "Cyan", "Skin16", "LightBlue", "Grey", "Blue"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // ES44
            put(ItemIDs.minecartES44.item,
                    new TrainRecord("ES44", DieselES44.class, ItemIDs.minecartES44.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4400)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"Cyan", "Orange", "Skin17", "Red", "Yellow", "Blue", "LightGrey", "Grey", "Black", "Skin18", "Skin19", "Pink", "Purple", "Lime", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // ES44h
            put(ItemIDs.minecartES44h.item,
                    new TrainRecord("ES44h", DieselES44h.class, ItemIDs.minecartES44h.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4400)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(21000)
                            .setColors(new String[] {"LightGrey","LightBlue", "Green", "Black", "Cyan", "Brown", "Blue", "White", "Lime", "Orange", "Red", "Skin16", "Skin22", "Skin18", "Skin19", "Skin20", "Skin21", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin35", "Skin36", "Skin37", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin32", "Skin33", "Skin34", "Skin23", "Skin24" })
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // P32
            put(ItemIDs.minecartP32.item,
                    new TrainRecord("P32", DieselP32.class, ItemIDs.minecartP32.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3200)
                            .setMaxSpeed(177)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(175)
                            .setAccelerationRate(0.93)
                            .setBrakeRate(0.84)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Blue", "Red", "LightGrey"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.5)
            );

            // geGenesis
            put(ItemIDs.minecartGeGenesis.item,
                    new TrainRecord("P40", DieselP40.class, ItemIDs.minecartGeGenesis.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(177)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(175)
                            .setAccelerationRate(0.93)
                            .setBrakeRate(0.84)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"LightGrey", "Grey"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.5)
            );

            // P42
            put(ItemIDs.minecartP42.item,
                    new TrainRecord("P42", DieselP42.class, ItemIDs.minecartP42.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4250)
                            .setMaxSpeed(177)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(175)
                            .setAccelerationRate(0.93)
                            .setBrakeRate(0.84)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Black", "Cyan", "Skin16", "Blue"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.5)
            );

            //CEE (Pre GE Involvement)//

            // CEE4ED172T
            put(ItemIDs.minecart4ED172T.item,
                    new TrainRecord("4ED172T", Diesel4ED172T.class, ItemIDs.minecart4ED172T.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1725)
                            .setMaxSpeed(95)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.74)
                            .setBrakeRate(0.91)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Pink", "Cyan", "Orange", "Black", "LightGrey", "Skin16", "Skin17", "Green", "Grey", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.85)
            );

            // CEE4ED172T_E
            put(ItemIDs.minecart4ED172T_E.item,
                    new TrainRecord("4ED172T_E", Diesel4ED172T_E.class, ItemIDs.minecart4ED172T_E.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(95)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(175)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.91)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Purple", "LightGrey", "Orange"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.85)
            );

            // CEE4ED172T_G
            put(ItemIDs.minecart4ED172T_G.item,
                    new TrainRecord("4ED172T_G", Diesel4ED172T_G.class, ItemIDs.minecart4ED172T_G.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(95)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(210)
                            .setAccelerationRate(0.68)
                            .setBrakeRate(0.91)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Lime", "LightGrey"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.85)
            );

            // CEE4ED172T_C
            put(ItemIDs.minecart4ED172T_C.item,
                    new TrainRecord("4ED172T_C", Diesel4ED172T_C.class, ItemIDs.minecart4ED172T_C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(95)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(125)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.89)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Yellow", "LightGrey", "Purple"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.85)
            );

            //ALCO-MLW//

            // AlcoPA1
            put(ItemIDs.minecartAlcoPA1.item,
                    new TrainRecord("PA1", DieselPA1.class, ItemIDs.minecartAlcoPA1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Pink", "Skin24", "Cyan", "Blue", "Purple", "Magenta", "Yellow", "Orange", "Skin23", "White", "Grey", "Brown", "LightGrey", "Green", "Lime", "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19", "Skin22", "Skin20", "Skin21", "Black"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.15)
            );

            // AlcoPB1
            put(ItemIDs.minecartAlcoPB1.item,
                    new TrainRecord("PB1", DieselPB1.class, ItemIDs.minecartAlcoPB1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(188)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Skin24", "Magenta", "Yellow", "Orange", "LightGrey", "Skin19", "Black"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.1)
            );

            // FA1
            put(ItemIDs.minecartFA1.item,
                    new TrainRecord("FA1", DieselFA1.class, ItemIDs.minecartFA1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // FB1
            put(ItemIDs.minecartFB1.item,
                    new TrainRecord("FB1", DieselFB1.class, ItemIDs.minecartFB1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.825)
            );

            // FA2
            put(ItemIDs.minecartFA2.item,
                    new TrainRecord("FA2", DieselFA2.class, ItemIDs.minecartFA2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Grey", "Yellow", "Blue", "Black", "Orange", "Green", "Purple", "Lime", "LightGrey", "White", "Magenta", "Skin17", "Skin18"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // FB2
            put(ItemIDs.minecartFB2.item,
                    new TrainRecord("FB2", DieselFB2.class, ItemIDs.minecartFB2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Grey", "Yellow", "Black", "Orange", "Green", "LightGrey", "White", "Magenta"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.825)
            );

            // FPA4
            put(ItemIDs.minecartFPA4.item,
                    new TrainRecord("FPA4", DieselFPA4.class, ItemIDs.minecartFPA4.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(148)
                            .setMass(0)
                            .setFuelConsumption(12)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Blue", "Cyan", "Green", "Red", "LightBlue", "Purple", "Brown", "Lime", "White", "Yellow", "Black", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // FPB4
            put(ItemIDs.minecartFPB4.item,
                    new TrainRecord("FPB4", DieselFPB4.class, ItemIDs.minecartFPB4.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(148)
                            .setMass(0)
                            .setFuelConsumption(12)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Blue", "Green", "Red", "Purple", "Brown", "Lime", "White", "Yellow"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.825)
            );

            // FAFDL
            put(ItemIDs.minecartFAFDL.item,
                    new TrainRecord("FAFDL", DieselFAFDL.class, ItemIDs.minecartFAFDL.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Cyan", "LightGrey", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // FBFDL
            put(ItemIDs.minecartFBFDL.item,
                    new TrainRecord("FBFDL", DieselFBFDL.class, ItemIDs.minecartFBFDL.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Cyan", "LightGrey", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.825)
            );

            // RS1
            put(ItemIDs.minecartRS1.item,
                    new TrainRecord("RS1", DieselRS1.class, ItemIDs.minecartRS1.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Orange", "Blue", "Green", "LightGrey", "Skin17", "Skin18", "Cyan", "LightBlue", "Purple", "Skin19", "White"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // RS2
            put(ItemIDs.minecartRS2.item,
                    new TrainRecord("RS2", DieselRS2.class, ItemIDs.minecartRS2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Blue", "LightGrey", "LightBlue", "White", "Magenta", "Brown", "Skin19", "Skin23", "Black", "Yellow", "Grey", "Red", "Pink"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // RS3
            put(ItemIDs.minecartRS3.item,
                    new TrainRecord("RS3", DieselRS3.class, ItemIDs.minecartRS3.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(137)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"LightBlue", "LightGrey", "Yellow", "Magenta", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // RSFDL
            put(ItemIDs.minecartRSFDL.item,
                    new TrainRecord("RSFDL", DieselRSFDL.class, ItemIDs.minecartRSFDL.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1800)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"LightGrey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // C415H
            put(ItemIDs.minecartC415H.item,
                    new TrainRecord("C415H", DieselC415H.class, ItemIDs.minecartC415H.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(106)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Purple", "Magenta", "Brown", "Red", "Pink", "Green", "Cyan"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.4)
            );

            // C415S
            put(ItemIDs.minecartC415S.item,
                    new TrainRecord("C415S", DieselC415S.class, ItemIDs.minecartC415S.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(106)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Green", "Yellow", "Blue", "LightGrey", "Skin18", "Skin19"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // C415L
            put(ItemIDs.minecartC415L.item,
                    new TrainRecord("C415L", DieselC415L.class, ItemIDs.minecartC415L.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(106)
                            .setMass(0)
                            .setFuelConsumption(5)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(17000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.5)
            );

            // C424
            put(ItemIDs.minecartC424.item,
                    new TrainRecord("C424", DieselC424.class, ItemIDs.minecartC424.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(14)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(18000)
                            .setColors(new String[]{"Yellow", "Red", "Black", "Pink", "Brown", "Magenta", "Skin17", "LightGrey", "Skin16", "Skin18", "Skin19", "Cyan", "Green", "Purple", "Skin20"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.8)
            );

            // C425
            put(ItemIDs.minecartC425.item,
                    new TrainRecord("C425", DieselC425.class, ItemIDs.minecartC425.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2500)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(18000)
                            .setColors(new String[]{"Black", "Yellow", "Skin16", "Green"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.8)
            );

            // DH643
            put(ItemIDs.minecartDH643.item,
                    new TrainRecord("DH643", DieselDH643.class, ItemIDs.minecartDH643.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4300)
                            .setMaxSpeed(124)
                            .setMass(0)
                            .setFuelConsumption(35)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.87)
                            .setTankCapacity(16000)
                            .setColors(new String[]{"Brown"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4.0)
            );

            // C855a
            put(ItemIDs.minecartC855a.item,
                    new TrainRecord("C855a", DieselC855a.class, ItemIDs.minecartC855a.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(5500)
                            .setMaxSpeed(106)
                            .setMass(0)
                            .setFuelConsumption(45)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Yellow", "Cyan", "Skin16"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-4.25)
            );

            // C855b
            put(ItemIDs.minecartC855b.item,
                    new TrainRecord("C855b", DieselC855b.class, ItemIDs.minecartC855b.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(5500)
                            .setMaxSpeed(106)
                            .setMass(0)
                            .setFuelConsumption(45)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Yellow", "Cyan", "Skin16"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-4.25)
            );

            // HH660
            put(ItemIDs.minecartHH660.item,
                    new TrainRecord("HH660", DieselHH660.class, ItemIDs.minecartHH660.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(660)
                            .setMaxSpeed(50)
                            .setMass(0)
                            .setFuelConsumption(8)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.95)
                            .setTankCapacity(6000)
                            .setColors(new String[] {"Yellow", "Orange", "Black", "Red", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // S2
            put(ItemIDs.minecartS2.item,
                    new TrainRecord("S2", DieselS2.class, ItemIDs.minecartS2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(96)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.965)
                            .setTankCapacity(6000)
                            .setColors(new String[] {"Black", "Grey", "Green", "Orange", "Pink", "White", "Blue", "LightGrey", "Magenta", "Red", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2)
            );

            // RSD15
            put(ItemIDs.minecartRSD15.item,
                    new TrainRecord("RSD15", DieselRSD15.class, ItemIDs.minecartRSD15.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(14)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.91)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Blue","Cyan", "Grey", "Red"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.7)
            );

            // M420
            put(ItemIDs.minecartM420.item,
                    new TrainRecord("M420", DieselM420.class, ItemIDs.minecartM420.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(108)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Lime", "Pink", "Cyan", "Grey", "Purple"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.8)
            );

            // M420B
            put(ItemIDs.minecartM420B.item,
                    new TrainRecord("M420B", DieselM420B.class, ItemIDs.minecartM420B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(108)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new  String[] {"Lime", "Pink", "Cyan"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.8)
            );

            // M630
            put(ItemIDs.minecartM630.item,
                    new TrainRecord("M630", DieselM630.class, ItemIDs.minecartM630.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Skin17", "LightGrey", "Cyan", "Purple", "Brown"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M630R
            put(ItemIDs.minecartM630R.item,
                    new TrainRecord("M630R", DieselM630R.class, ItemIDs.minecartM630R.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M630W
            put(ItemIDs.minecartM630W.item,
                    new TrainRecord("M630W", DieselM630W.class, ItemIDs.minecartM630W.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3000)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"LightGrey", "Cyan", "Red"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M636
            put(ItemIDs.minecartM636.item,
                    new TrainRecord("M636", DieselM636.class, ItemIDs.minecartM636.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Green", "Skin16", "Blue", "Grey", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M636R
            put(ItemIDs.minecartM636R.item,
                    new TrainRecord("M636R", DieselM636R.class, ItemIDs.minecartM636R.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3600)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(25)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Black", "Grey", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M640
            put(ItemIDs.minecartM640.item,
                    new TrainRecord("M640", DieselM640.class, ItemIDs.minecartM640.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Red", "Skin16", "LightGrey", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // M640W
            put(ItemIDs.minecartM640W.item,
                    new TrainRecord("M640W", DieselM640W.class, ItemIDs.minecartM640W.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(4000)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(40)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(12000)
                            .setColors(new String[] {"Green", "Brown", "LightGrey", "Skin17"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            //BLH-BLW//

            // VO1000
            put(ItemIDs.minecartVO1000.item,
                    new TrainRecord("VO1000", DieselVO1000.class, ItemIDs.minecartVO1000.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(67)
                            .setMass(0)
                            .setFuelConsumption(9)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.9)
                            .setTankCapacity(6000)
                            .setColors(new String[]{"Green", "Pink", "Blue", "LightBlue", "Skin16"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.2)
            );

            // DS441000
            put(ItemIDs.minecartDS441000.item,
                    new TrainRecord("DS441000", DieselDS441000.class, ItemIDs.minecartDS441000.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(97)
                            .setMass(0)
                            .setFuelConsumption(9)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Yellow", "Green", "Grey", "Black", "Orange","Skin20"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.2)
            );

            // S12
            put(ItemIDs.minecartS12.item,
                    new TrainRecord("S12", DieselS12.class, ItemIDs.minecartS12.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1200)
                            .setMaxSpeed(97)
                            .setMass(0)
                            .setFuelConsumption(9)
                            .setHeatingTime(180)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.7)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"Blue", "LightGrey", "Brown", "Skin16", "White", "Cyan", "Skin18", "Black", "Orange"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-2.2)
            );

            // DR441500Phase2
            put(ItemIDs.minecartDR441500Phase2.item,
                    new TrainRecord("DR441500Phase2", DieselDR441500Phase2.class, ItemIDs.minecartDR441500Phase2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Yellow", "Red", "White", "Grey", "Magenta", "Purple", "Skin16"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // DR441500BPhase2
            put(ItemIDs.minecartDR441500BPhase2.item,
                    new TrainRecord("DR441500BPhase2", DieselDR441500BPhase2.class, ItemIDs.minecartDR441500BPhase2.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Red", "White", "Grey", "Magenta", "Purple"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.675)
            );

            // DR441500Shark
            put(ItemIDs.minecartDR441500Shark.item,
                    new TrainRecord("DR441500Shark", DieselDR441500Shark.class, ItemIDs.minecartDR441500Shark.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Orange", "Blue", "Cyan", "LightBlue", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // DR441500BShark
            put(ItemIDs.minecartDR441500BShark.item,
                    new TrainRecord("DR441500BShark", DieselDR441500BShark.class, ItemIDs.minecartDR441500BShark.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1500)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Red", "Orange", "Blue", "Cyan", "Grey"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.675)
            );

            // RF16
            put(ItemIDs.minecartRF16.item,
                    new TrainRecord("RF16", DieselRF16.class, ItemIDs.minecartRF16.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Green", "Yellow", "LightGrey", "Blue", "Cyan", "LightBlue", "Grey", "Black", "Orange", "Magenta", "Red"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.845)
            );

            // RF16B
            put(ItemIDs.minecartRF16B.item,
                    new TrainRecord("RF16B", DieselRF16B.class, ItemIDs.minecartRF16B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(105)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.79)
                            .setTankCapacity(15000)
                            .setColors(new String[] {"Green", "Blue", "Cyan", "Grey", "Black", "Orange", "Magenta", "Red", "Purple"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.675)
            );

            //FM//

            // H1044
            put(ItemIDs.minecartH1044.item,
                    new TrainRecord("H1044", DieselH1044.class, ItemIDs.minecartH1044.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1000)
                            .setMaxSpeed(97)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(10000)
                            .setColors(new String[]{"Green", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Orange", "White", "Lime", "LightGrey", "Skin16", "Skin17"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.2)
            );

            // H16_66
            put(ItemIDs.minecartH16_66.item,
                    new TrainRecord("H16-66", DieselH16_66.class, ItemIDs.minecartH16_66.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1600)
                            .setMaxSpeed(130)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Blue", "Yellow", "LightGrey", "Green", "Lime", "Black", "Grey", "Orange", "Brown", "Red", "Pink", "Magenta", "Skin16"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.35)
            );

            // H24_66
            put(ItemIDs.minecartH24_66.item,
                    new TrainRecord("H24-66", DieselH24_66.class, ItemIDs.minecartH24_66.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(130)
                            .setMass(0)
                            .setFuelConsumption(14)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Red", "Black", "Brown", "Yellow", "Grey", "LightGrey", "Lime"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.75)
            );

            // H24_66L
            put(ItemIDs.minecartH24_66L.item,
                    new TrainRecord("H24-66L", DieselH24_66L.class, ItemIDs.minecartH24_66L.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(130)
                            .setMass(0)
                            .setFuelConsumption(14)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Blue", "Green"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.75)
            );

            // H24_66C
            put(ItemIDs.minecartH24_66C.item,
                    new TrainRecord("H24-66C", DieselH24_66C.class, ItemIDs.minecartH24_66C.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2400)
                            .setMaxSpeed(130)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.87)
                            .setBrakeRate(0.93)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"Magenta", "Grey", "Yellow"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.75)
            );

            //MISC//

            // NRE3gs21b
            put(ItemIDs.minecartNRE3gs21b.item,
                    new TrainRecord("NRE3gs21b", DieselNRE3gs21b.class, ItemIDs.minecartNRE3gs21b.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2100)
                            .setMaxSpeed(104)
                            .setMass(0)
                            .setFuelConsumption(4)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.78)
                            .setBrakeRate(0.8)
                            .setTankCapacity(14000)
                            .setColors(new String[]{"Yellow", "Orange", "Grey", "LightGrey", "Skin16", "Blue"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.1)
            );

            // gtavthing
            put(ItemIDs.minecartgtavthing.item,
                    new TrainRecord("gtavthing", Dieselgtavthing.class, ItemIDs.minecartgtavthing.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(1550)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.85)
                            .setBrakeRate(0.9)
                            .setTankCapacity(10000)
                            .setColors(new String[] {"Yellow"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.2)
                            .setAdditionalTooltip(new String[] {"Fictional locomotive from GTA-V"})
            );

            // FOLM1B
            put(ItemIDs.minecartFOLM1B.item,
                    new TrainRecord("FOL-M1B", DieselFOLM1B.class, ItemIDs.minecartFOLM1B.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(5000)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(20)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.965)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Grey", "Blue", "Black"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.8)
                            .setAdditionalTooltip(new String[] {"Fictional B unit for the Fictional loco from Factorio"})
            );

            // Krautt
            put(ItemIDs.minecartKrautt.item,
                    new TrainRecord("Krautt", DieselKrautt.class, ItemIDs.minecartKrautt.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(3540)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(26)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Grey", "LightGrey", "Black", "Red"})
                            .setGuiRenderScale(13)
                            .setBogieLocoPosition(-3.3)
            );

            // DD55
            put(ItemIDs.minecartDD55.item,
                    new TrainRecord("DD55", DieselDD55.class, ItemIDs.minecartDD55.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2000)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(67)
                            .setHeatingTime(190)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9555)
                            .setTankCapacity(10000)
                            .setColors(new  String[] {"Lime", "Purple", "LightGrey", "Pink", "Blue"})
                            .setGuiRenderScale(15)
                            .setBogieLocoPosition(-2.9)
            );

            // TB27
            put(ItemIDs.minecartTB27.item,
                    new TrainRecord("TB27", DieselTB27.class, ItemIDs.minecartTB27.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(2700)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(18000)
                            .setColors(new String[]{"Red", "LightGrey", "White", "Purple"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.8)
            );

            //SLUGS & EXTRAS//

            // SlugMA
            put(ItemIDs.minecartSlugMA.item,
                    new TrainRecord("SlugMA", SlugMA.class, ItemIDs.minecartSlugMA.item)
                            .setTrainType("slug")
                            .setMass(7)
                            .setTankCapacity(18000)
                            .setColors(new String[] {"White", "Skin16", "Magenta", "Blue", "Yellow", "Green"})
                            .setGuiRenderScale(16)
            );

            // F7BSlug
            put(ItemIDs.minecartF7BSlug.item,
                    new TrainRecord("F7BSlug", BUnitF7.class, ItemIDs.minecartF7BSlug.item)
                            .setTrainType("slug")
                            .setMass(7)
                            .setTankCapacity(15000)
                            .setColors(new String[]{"Skin19"})
                            .setGuiRenderScale(18)
            );

            // SMSC1
            put(ItemIDs.minecartSMSC1.item,
                    new TrainRecord("SMSC1", SMSC1.class, ItemIDs.minecartSMSC1.item)
                            .setTrainType("slug")
                            .setMass(8)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Cyan"})
                            .setGuiRenderScale(12)
                            .setAdditionalTooltip(new String[] {"It'le pull your socks off, if it wasnt busy having frame sag"})
            );

            // CEEslug
            put(ItemIDs.minecartCEEslug.item,
                    new TrainRecord("CEEslug", ElectricCEEslug.class, ItemIDs.minecartCEEslug.item)
                            .setTrainType("'slug'")
                            .setMHP(3000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(15)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.89)
                            .setBrakeRate(0.91)
                            .setColors(new String[] {"Blue", "Cyan", "Skin16", "LightGrey"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            // SBMS
            put(ItemIDs.minecartSBMS.item,
                    new TrainRecord("SBMS", SBMS.class, ItemIDs.minecartSBMS.item)
                            .setTrainType("slug")
                            .setMass(7)
                            .setTankCapacity(20000)
                            .setColors(new String[] {"Cyan", "Green", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Pink", "Black"})
                            .setGuiRenderScale(12)
            );

            // RotaryPlow
            put(ItemIDs.minecartRotaryPlow.item,
                    new TrainRecord("RotaryPlow", RotaryPlow1.class, ItemIDs.minecartRotaryPlow.item)
                            .setTrainType("snowplow")
                            .setMHP(1750)
                            .setMaxSpeed(60)
                            .setMass(0)
                            .setFuelConsumption(30)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.70)
                            .setBrakeRate(0.75)
                            .setColors(new String[] {"Black", "Skin16"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-1.95)
            );

            //ELECTRICS//

            // EF1
            put(ItemIDs.minecartEF1.item,
                    new TrainRecord("EF1", ElectricEF1.class, ItemIDs.minecartEF1.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(1720)
                            .setMaxSpeed(64)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.75)
                            .setTankCapacity(12500)
                            .setColors(new String[] {"Orange", "Yellow", "Red", "Green", "Black", "Grey"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.4375)
            );

            // EF1B
            put(ItemIDs.minecartEF1B.item,
                    new TrainRecord("EF1B", ElectricEF1B.class, ItemIDs.minecartEF1B.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(1720)
                            .setMaxSpeed(64)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.75)
                            .setTankCapacity(12500)
                            .setColors(new String[] {"Orange", "Red", "Black", "Pink"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.3125)
            );

            // EP1A
            put(ItemIDs.minecartEP1A.item,
                    new TrainRecord("EP1A", ElectricEP1A.class, ItemIDs.minecartEP1A.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(2500)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.75)
                            .setBrakeRate(0.85)
                            .setTankCapacity(12500)
                            .setColors(new String[] {"Orange", "Red"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3.4375)
            );

            // GM6C
            put(ItemIDs.minecartGM6C.item,
                    new TrainRecord("GM6C", ElectricGM6C_2.class, ItemIDs.minecartGM6C.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(6000)
                            .setMaxSpeed(115)
                            .setMass(0)
                            .setFuelConsumption(70)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.65)
                            .setBrakeRate(0.79)
                            .setTankCapacity(12500)
                            .setColors(new String[] {"White", "LightGrey", "LightBlue", "Black", "Skin17", "Cyan", "Skin18"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-3.45)
            );

            // JT7
            put(ItemIDs.minecartJT7.item,
                    new TrainRecord("JT7", ElectricJT7.class, ItemIDs.minecartJT7.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(3900)
                            .setMaxSpeed(90)
                            .setMass(0)
                            .setFuelConsumption(150)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.7)
                            .setColors(new String[] {"Lime", "Green", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setBogieLocoPosition(-4)
            );

            // AEM7
            put(ItemIDs.minecartAEM7.item,
                    new TrainRecord("AEM7", ElectricAEM7.class, ItemIDs.minecartAEM7.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(7000)
                            .setMaxSpeed(201)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.946)
                            .setColors(new String[] {"LightGrey", "Grey"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2)
            );

            // B_BEL
            put(ItemIDs.minecartB_BEL.item,
                    new TrainRecord("B-BEL", ElectricB_BEL.class, ItemIDs.minecartB_BEL.item)
                            .setTrainType("battery electric")
                            .setMHP(2000)
                            .setMaxSpeed(113)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.89)
                            .setBrakeRate(0.91)
                            .setColors(new String[] {"Grey", "Skin16", "Green", "Pink", "LightGrey", "Purple", "Yellow"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-3.1)
            );

            //Freight - Hoppers//

            // RoundHopper
            put(ItemIDs.minecartRoundHopper.item,
                    new TrainRecord("Freight Round Covered Hopper", RoundHopper.class, ItemIDs.minecartRoundHopper.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Red", "Black", "White", "LightGrey"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // RibbedHopper
            put(ItemIDs.minecartRibbedHopper.item,
                    new TrainRecord("Freight Ribbed Covered Hopper", RibbedHopper.class, ItemIDs.minecartRibbedHopper.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "Cyan", "LightGrey", "Red", "Brown", "White", "Pink", "Skin16", "Orange", "Skin20", "Skin17", "Skin18", "Skin19", "Skin21", "Green", "Skin22"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Hopper5201
            put(ItemIDs.minecartHopper5201.item,
                    new TrainRecord("5201 Cu Foot Hopper", Hopper5201.class, ItemIDs.minecartHopper5201.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "Cyan", "Black", "Skin16", "Skin17", "LightGrey", "Blue", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Hopper6260
            put(ItemIDs.minecartHopper6260.item,
                    new TrainRecord("6260 Cu Foot Jumbo Hopper", Hopper6260.class, ItemIDs.minecartHopper6260.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(4)
                            .setColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // FNCC2375Hopper
            put(ItemIDs.minecartFNCC2375Hopper.item,
                    new TrainRecord("FNCC2375Hopper", FNCC2375Hopper.class, ItemIDs.minecartFNCC2375Hopper.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(2.5)
                            .setColors(new String[]{"Cyan", "Green", "Black", "LightGrey", "Blue", "Skin16", "Skin17", "Purple", "Magenta", "Pink", "Yellow", "Red", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PDH2800
            put(ItemIDs.minecartPDH2800.item,
                    new TrainRecord("PDH2800", PDH2800.class, ItemIDs.minecartPDH2800.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(2)
                            .setColors(new String[]{"LightGrey","Yellow","Grey","Brown","Magenta", "Skin16", "Skin17"})
                            .setGuiRenderScale(18)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACF2Bay
            put(ItemIDs.minecartACF2Bay.item,
                    new TrainRecord("ACF2Bay", ACF2Bay.class, ItemIDs.minecartACF2Bay.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(2.5)
                            .setColors(new String[]{"LightGrey", "Black", "Magenta", "Skin16", "Grey", "Red", "Orange", "Skin17", "Skin18", "Blue", "Skin19", "Skin20", "Brown"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACF4650
            put(ItemIDs.minecartACF4650.item,
                    new TrainRecord("ACF4650", ACF4650.class, ItemIDs.minecartACF4650.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "Skin18", "Grey", "LightGrey", "Skin16", "Skin17", "Brown", "White", "Skin19", "Blue", "Orange", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Purple"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PS2_4750
            put(ItemIDs.minecartPS2_4750.item,
                    new TrainRecord("PS2_4750", PS2_4750.class, ItemIDs.minecartPS2_4750.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"LightGrey", "White", "Skin17", "Skin18", "Skin16", "Skin20", "Grey", "Skin19", "LightBlue", "Skin21", "Yellow", "Skin22", "Orange", "Magenta", "Green", "Lime", "Purple", "Skin23", "Cyan", "Brown", "Pink", "Skin24", "Skin25", "Skin28", "Skin27", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Black", "Skin34", "Blue", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin44"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // GATC4180Airslide
            put(ItemIDs.minecartGATC4180Airslide.item,
                    new TrainRecord("GATC4180Airslide", GATC4180Airslide.class, ItemIDs.minecartGATC4180Airslide.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Grey", "Skin17", "LightGrey", "Skin18", "Skin21", "Skin19", "Green", "Orange", "Yellow", "Skin20", "Pink", "Magenta", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACF3500
            put(ItemIDs.minecartACF3500.item,
                    new TrainRecord("ACF3500", ACF3500.class, ItemIDs.minecartACF3500.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "Yellow", "Skin17", "Pink", "Skin18", "Brown", "Skin19", "Orange", "Black", "LightGrey", "Skin20", "Skin21", "Skin22", "Skin23"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACF3960
            put(ItemIDs.minecartACF3960.item,
                    new TrainRecord("ACF3960", ACF3960.class, ItemIDs.minecartACF3960.item)
                            .setTrainType(EnumTrainType.CoveredHopper)
                            .setMass(3)
                            .setColors(new String[]{"LightGrey", "Green", "White", "Skin16", "Skin17", "Skin18", "Grey"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            //Freight - Centerbeams & Flats//

            // Freight60centerbeam
            put(ItemIDs.minecart60centerbeam.item,
                    new TrainRecord("60centerbeam", Freight60centerbeam.class, ItemIDs.minecart60centerbeam.item)
                            .setTrainType(EnumTrainType.CenterbeamFlat)
                            .setMass(3)
                            .setColors(new String[] {"Black", "Yellow", "Green", "LightGrey"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
            );

            // Freight66centerbeam
            put(ItemIDs.minecart66centerbeam.item,
                    new TrainRecord("66centerbeam", Freight66centerbeam.class, ItemIDs.minecart66centerbeam.item)
                            .setTrainType(EnumTrainType.CenterbeamFlat)
                            .setMass(3)
                            .setColors(new String[] {"Orange", "Cyan", "Black", "Green", "Lime", "Red", "Purple", "LightBlue", "Pink", "Blue", "Yellow"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
            );

            // Freight73centerbeam
            put(ItemIDs.minecart73centerbeam.item,
                    new TrainRecord("73centerbeam", Freight73centerbeam.class, ItemIDs.minecart73centerbeam.item)
                            .setTrainType(EnumTrainType.CenterbeamFlat)
                            .setMass(3.5)
                            .setColors(new String[] {"Pink", "Cyan", "Green", "Orange", "Yellow", "Red", "Purple"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
            );

            // GSI60FootBulkhead
            put(ItemIDs.minecartGSI60FootBulkhead.item,
                    new TrainRecord("GSI_Bulkhead", GSI60FootBulkhead.class, ItemIDs.minecartGSI60FootBulkhead.item)
                            .setTrainType(EnumTrainType.BulkheadFlat)
                            .setMass(3)
                            .setColors(new String[] {"Blue", "Skin16", "Green", "Black", "Skin17", "Brown", "Cyan"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Bulkhead Items."})
            );

            // GSC60FootFlatcar
            put(ItemIDs.minecartGSC60FootFlatcar.item,
                    new TrainRecord("GSC_Flatcar", GSC60FootFlat.class, ItemIDs.minecartGSC60FootFlatcar.item)
                            .setTrainType(EnumTrainType.Flatcars)
                            .setMass(2.5)
                            .setColors(new String[] {"LightBlue", "Orange", "Yellow", "Skin17", "Brown", "Green", "Skin16"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: whatever flatcars carry i guess"})
            );

            // Thrall63centerbeam
            put(ItemIDs.minecartthrall63centerbeam.item,
                    new TrainRecord("63centerbeam", Thrall63centerbeam.class, ItemIDs.minecartthrall63centerbeam.item)
                            .setTrainType(EnumTrainType.CenterbeamFlat)
                            .setMass(3)
                            .setColors(new String[] {"Green", "Yellow", "Red", "Black", "Cyan", "Skin16", "Skin17", "Purple", "Skin18"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
            );

            // FNCC60FootBulk
            put(ItemIDs.minecartFNCC60FootBulk.item,
                    new TrainRecord("FNCC60FootBulk", FNCC60FootBulk.class, ItemIDs.minecartFNCC60FootBulk.item)
                            .setTrainType(EnumTrainType.BulkheadFlat)
                            .setMass(2.5)
                            .setColors(new String[] {"Cyan", "Green", "Yellow", "Skin16", "Skin17", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Bulkhead Stuff."})
            );

            // GSC53FootFlatcar
            put(ItemIDs.minecartGSC53FootFlatcar.item,
                    new TrainRecord("GSC_53Flatcar", GSC53FootFlat.class, ItemIDs.minecartGSC53FootFlatcar.item)
                            .setTrainType(EnumTrainType.Flatcars)
                            .setMass(2.5)
                            .setColors(new String[] {"Yellow", "Brown", "Green", "Lime", "Black", "White", "Grey", "LightGrey"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: whatever flatcars carry i guess"})
            );

            // GSC53Foot6_6Bulkhead
            put(ItemIDs.minecartGSC5366FootBulkhead.item,
                    new TrainRecord("GSC_53_66Bulkhead", GSC53Foot66Bulkhead.class, ItemIDs.minecartGSC5366FootBulkhead.item)
                            .setTrainType(EnumTrainType.BulkheadFlat)
                            .setMass(2.5)
                            .setColors(new String[] {"Orange", "Red", "Black", "Grey", "Blue", "Skin16"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Bulkhead Items."})
            );

            // GSC53Foot8_6Bulkhead
            put(ItemIDs.minecartGSC5386FootBulkhead.item,
                    new TrainRecord("GSC_53_86Bulkhead", GSC53Foot86Bulkhead.class, ItemIDs.minecartGSC5386FootBulkhead.item)
                            .setTrainType(EnumTrainType.BulkheadFlat)
                            .setMass(2.5)
                            .setColors(new String[] {"Brown", "Green", "Red", "Purple", "Black", "Lime", "White", "Grey", "Yellow", "Skin16"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Bulkhead Items."})
            );

            // MaPa35FootFlatcar
            put(ItemIDs.minecartMaPa35FootFlatcar.item,
                    new TrainRecord("MaPa_35Flatcar", MaPa35FootFlat.class, ItemIDs.minecartMaPa35FootFlatcar.item)
                            .setTrainType(EnumTrainType.Flatcars)
                            .setMass(2.5)
                            .setColors(new String[] {"Brown", "Grey","Magenta", "LightGrey", "Black", "Green", "Lime", "Orange", "Purple", "Red"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(18)
                            .setAdditionalTooltip(new String[] {"Cargo: whatever flatcars carry i guess"})
            );

            //Freight - Boxcars//

            // PS140
            put(ItemIDs.minecartPS140.item,
                    new TrainRecord("PS140", PS140.class, ItemIDs.minecartPS140.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Brown", "Red", "LightBlue", "Green", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Yellow", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Magenta", "Skin26", "Skin27", "Skin28", "Orange"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PS150
            put(ItemIDs.minecartPS150.item,
                    new TrainRecord("PS150", PS150.class, ItemIDs.minecartPS150.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(3)
                            .setColors(new String[] {"White", "Lime", "Red", "Yellow", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Brown", "Cyan", "Skin21", "Skin22", "Skin23"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PS160
            put(ItemIDs.minecartPS160.item,
                    new TrainRecord("PS160", PS160.class, ItemIDs.minecartPS160.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(3.25)
                            .setColors(new String[] {"Blue", "Orange", "Cyan", "White"})
                            .setGuiRenderScale(13)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // OWO60Verticube
            put(ItemIDs.minecartOWO60Verticube.item,
                    new TrainRecord("OWO 60 Verticube", OWO60Verticube.class, ItemIDs.minecartOWO60Verticube.item)
                            .setTrainType(EnumTrainType.HighcubeBoxcar)
                            .setMass(3.75)
                            .setColors(new String[] {"Cyan", "Lime", "Green", "Brown", "White", "Pink", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Yellow", "Skin25"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // MILW40boxcar
            put(ItemIDs.minecartMILW40boxcar.item,
                    new TrainRecord("MILW40boxcar", MILW40boxcar.class, ItemIDs.minecartMILW40boxcar.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Red", "Brown", "Yellow", "Green", "Blue", "Purple", "Orange", "Lime"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Freight40highcube
            put(ItemIDs.minecart40highcube.item,
                    new TrainRecord("40highcube", Freight40highcube.class, ItemIDs.minecart40highcube.item)
                            .setTrainType(EnumTrainType.HighcubeBoxcar)
                            .setMass(3)
                            .setColors(new String[] {"Brown", "Green", "Cyan", "Orange", "Grey", "Red", "Lime", "LightGrey", "Pink", "Purple", "Blue", "Black", "White", "Magenta", "Skin16", "Skin17","Skin18"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(40)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Hicube60
            put(ItemIDs.minecarthicube60foot.item,
                    new TrainRecord("60 Foot Hi-Cube Boxcar", Hicube60foot.class, ItemIDs.minecarthicube60foot.item)
                            .setTrainType(EnumTrainType.HighcubeBoxcar)
                            .setMass(4)
                            .setColors(new String[] {"Yellow", "Red", "Pink", "Blue", "Skin16", "Skin17", "Lime", "White", "Cyan", "Green", "Purple", "Skin18"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Reefer64
            put(ItemIDs.minecartReefer64.item,
                    new TrainRecord("Reefer64", Reefer64Foot.class, ItemIDs.minecartReefer64.item)
                            .setTrainType(EnumTrainType.RefrigeratedBoxcar)
                            .setMass(4)
                            .setColors(new String[] {"White", "LightGrey", "Grey", "Orange", "Green", "Red", "Black", "Cyan", "Skin16", "Skin17"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // FNCC50Foot
            put(ItemIDs.minecartFNCC50Foot.item,
                    new TrainRecord("FNCC50FootBoxcar", FNCC50Foot.class, ItemIDs.minecartFNCC50Foot.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(3)
                            .setColors(new String[] {"Cyan", "Green", "Black", "Skin18", "Skin19", "Brown", "Pink", "Skin16", "Blue", "Skin23", "Skin22", "Skin21", "Yellow", "White", "Skin17", "Magenta", "Skin24", "Skin25", "Skin26"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // GN40
            put(ItemIDs.minecartGN40.item,
                    new TrainRecord("GN40", GN40.class, ItemIDs.minecartGN40.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"LightGrey", "Red"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // R70Reefer
            put(ItemIDs.minecartR70Reefer.item,
                    new TrainRecord("R70Reefer", R70Reefer.class, ItemIDs.minecartR70Reefer.item)
                            .setTrainType(EnumTrainType.RefrigeratedBoxcar)
                            .setMass(3)
                            .setColors(new String[] {"Grey", "LightGrey", "Cyan", "White", "Yellow", "Skin16", "Orange", "Skin17", "Skin18", "Green", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Cold Stuff lol"})
            );

            // R70Reefer2
            put(ItemIDs.minecartR70Reefer2.item,
                    new TrainRecord("R70Reefer2", R70Reefer2.class, ItemIDs.minecartR70Reefer2.item)
                            .setTrainType(EnumTrainType.RefrigeratedBoxcar)
                            .setMass(3)
                            .setColors(new String[] {"LightGrey", "Grey", "White", "Orange", "Skin19", "Yellow", "Red", "Skin20", "Skin21"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Cold Stuff lol"})
            );

            // NSCReefer
            put(ItemIDs.minecartNSCchildHUH.item,
                    new TrainRecord("NSCReefer", NSCReefer.class, ItemIDs.minecartNSCchildHUH.item)
                            .setTrainType(EnumTrainType.RefrigeratedBoxcar)
                            .setMass(2.75)
                            .setColors(new String[] {"Grey", "LightGrey", "Orange"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: meet and HUH!?"})
            );

            // PCF6033
            put(ItemIDs.minecartPCF6033.item,
                    new TrainRecord("PCF6033", PCF6033.class, ItemIDs.minecartPCF6033.item)
                            .setTrainType(EnumTrainType.HighcubeBoxcar)
                            .setMass(3.75)
                            .setColors(new String[] {"Brown", "Skin16", "Pink", "Blue", "Red", "Skin17", "Yellow", "Magenta", "Cyan", "Skin18", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PCF_RBL_Smooth
            put(ItemIDs.minecartPCF_RBL_Smooth.item,
                    new TrainRecord("PCF_RBL_Smooth", PCF_RBL_Smooth.class, ItemIDs.minecartPCF_RBL_Smooth.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4)
                            .setColors(new String[] {"Red", "Brown", "Skin16", "Skin17", "Skin29", "Green", "Cyan", "Skin22", "Skin18", "Skin19", "Skin20", "Skin21", "Yellow", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PCF_RBL_Ribbed
            put(ItemIDs.minecartPCF_RBL_Ribbed.item,
                    new TrainRecord("PCF_RBL_Ribbed", PCF_RBL_Ribbed.class, ItemIDs.minecartPCF_RBL_Ribbed.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4)
                            .setColors(new String[] {"Green", "Blue", "Red", "Pink", "Grey", "Magenta", "Lime", "Orange", "Brown", "White", "Yellow", "Black", "LightGrey"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PCF_B100
            put(ItemIDs.minecartPCF_B100.item,
                    new TrainRecord("PCF_B100", PCF_B100.class, ItemIDs.minecartPCF_B100.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4)
                            .setColors(new String[] {"Blue", "Brown", "Skin16", "Grey", "Green", "LightGrey", "Skin17"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACFRailbox
            put(ItemIDs.minecartACFRailbox.item,
                    new TrainRecord("ACF Railbox", ACFRailbox.class, ItemIDs.minecartACFRailbox.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4)
                            .setColors(new String[] {"Yellow", "Red", "Blue", "Black", "Orange", "Pink", "LightBlue", "White", "Magenta", "Cyan", "Grey"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // ACFRailboxCushioned
            put(ItemIDs.minecartACFRailboxCushioned.item,
                    new TrainRecord("ACF Railbox (Cushioned)", ACFRailboxCushioned.class, ItemIDs.minecartACFRailboxCushioned.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4)
                            .setColors(new String[] {"Green", "Lime", "White", "Brown", "Red", "Blue", "Grey", "Orange", "Yellow","Skin16"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Evans5100
            put(ItemIDs.minecartEvans5100.item,
                    new TrainRecord("Evans5100", Evans5100.class, ItemIDs.minecartEvans5100.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(4.5)
                            .setColors(new String[] {"LightBlue", "Green", "Orange", "Red", "Skin16", "Pink", "Cyan", "Blue", "Yellow", "Brown", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Purple", "Magenta", "Skin22", "Skin23", "Skin24", "LightGrey", "Black", "Skin25", "White", "Skin26", "Skin27", "Grey"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Wood1912Boxcar
            put(ItemIDs.minecart1912WoodBoxcar.item,
                    new TrainRecord("1912WoodBoxcar", Wood1912Boxcar.class, ItemIDs.minecart1912WoodBoxcar.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Brown", "Magenta", "Red", "Yellow", "Green"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // PS_40t_ss_box
            put(ItemIDs.minecartPS_40t_ss_box.item,
                    new TrainRecord("PS_40t_ss_box", PS_40t_ss_box.class, ItemIDs.minecartPS_40t_ss_box.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Red", "Green", "Lime", "Brown", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // SP_B50
            put(ItemIDs.minecartSP_B50.item,
                    new TrainRecord("SP_B50", SP_B50.class, ItemIDs.minecartSP_B50.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Red", "Magenta", "Brown", "Orange", "Green", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // SP_B50_AAR
            put(ItemIDs.minecartSP_B50_AAR.item,
                    new TrainRecord("SP_B50_AAR", SP_B50_AAR.class, ItemIDs.minecartSP_B50_AAR.item)
                            .setTrainType(EnumTrainType.Boxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Red","Skin17","Skin18","Skin19","Skin20","Skin21","Skin22","Skin23","Skin24","Skin25","Skin33","Skin26","Skin27","Skin28","Skin29","Skin30","Skin31","Skin34","Skin32","Skin35"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Whatever a boxcar can hold."})
            );

            // PFEr_40_23Reefer
            put(ItemIDs.minecartPFEr_40_23Reefer.item,
                    new TrainRecord("PFEr_40_23Reefer", PFEr_40_23Reefer.class, ItemIDs.minecartPFEr_40_23Reefer.item)
                            .setTrainType(EnumTrainType.RefrigeratedBoxcar)
                            .setMass(2.5)
                            .setColors(new String[] {"Orange", "Red", "Brown", "Yellow", "Purple", "Grey"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Cold Things you Dumbass."})
            );

            //Freight - Gondola//

            // VersaLongi
            put(ItemIDs.minecartVersaLongi.item,
                    new TrainRecord("VersaLongi", VersaLongi.class, ItemIDs.minecartVersaLongi.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2.75)
                            .setColors(new String[] {"LightGrey", "Black", "Orange", "Brown", "Skin16", "Grey", "Pink", "LightBlue", "Yellow"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
            );

            // VersaTrans
            put(ItemIDs.minecartVersaTrans.item,
                    new TrainRecord("VersaTrans", VersaTrans.class, ItemIDs.minecartVersaTrans.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2.75)
                            .setColors(new String[] {"LightBlue", "Grey", "LightGrey", "Black"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(36)
            );

            // MillGondola
            put(ItemIDs.minecartMillGondola.item,
                    new TrainRecord("52footMillGondola", MillGondola.class, ItemIDs.minecartMillGondola.item)
                            .setTrainType(EnumTrainType.Gondola)
                            .setMass(3)
                            .setColors(new String[] {"Red", "Black", "Orange", "Green", "Grey", "Skin16", "Skin18", "Blue", "Lime", "Skin17", "Brown", "Pink", "LightGrey", "Skin19", "Yellow"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // WoodchipHopper
            put(ItemIDs.minecartWoodchipHopper.item,
                    new TrainRecord("Woodchip Hopper", WoodchipHopper.class, ItemIDs.minecartWoodchipHopper.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(3)
                            .setColors(new String[] {"Brown", "Blue", "Green", "Orange", "Red", "White", "Cyan", "Skin18", "Skin19", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
            );

            // gunderson fmc woodchip hopper
            put(ItemIDs.minecartFMCWoodchip.item,
                    new TrainRecord("FMCWoodchip", FMCWoodchip.class, ItemIDs.minecartFMCWoodchip.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(3)
                            .setColors(new String[] {"LightGrey", "Cyan", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
            );

            // OreJenny
            put(ItemIDs.minecartOreJenny.item,
                    new TrainRecord("Ore Jenny", OreJenny.class, ItemIDs.minecartOreJenny.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2)
                            .setColors(new String[] {"Brown", "Red", "Orange", "Pink", "Black"})
                            .setGuiRenderScale(18)
                            .setCargoCapacity(27)
            );

            // PRRGLaHopper
            put(ItemIDs.minecartPRRGLaHopper.item,
                    new TrainRecord("PRR GLa hopper", PRRGLaHopper.class, ItemIDs.minecartPRRGLaHopper.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Black", "Yellow", "Magenta", "Blue", "LightGrey"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
            );

            // ACF41Gon
            put(ItemIDs.minecartACF41Gon.item,
                    new TrainRecord("ACF41Gon", ACF41Gon.class, ItemIDs.minecartACF41Gon.item)
                            .setTrainType(EnumTrainType.Gondola)
                            .setMass(2.75)
                            .setColors(new String[] {"Red", "Black", "Grey", "Brown", "Skin16"})
                            .setGuiRenderScale(15)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Gonstuff"})
            );

            // BSC 3483
            put(ItemIDs.minecartBSC3483.item,
                    new TrainRecord("BSC3483", BSC3483.class, ItemIDs.minecartBSC3483.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(4)
                            .setColors(new String[] {"Black", "Blue", "Brown", "Cyan", "Green", "Grey", "Pink", "Yellow", "Red", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Coal n shid"})
            );

            // BethgonII
            put(ItemIDs.minecartBethgonII.item,
                    new TrainRecord("BethgonII", BethgonII.class, ItemIDs.minecartBethgonII.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(4)
                            .setColors(new String[] {"Black", "Green", "Orange", "Yellow", "Grey", "Magenta", "Pink", "Purple", "Skin16", "Skin17"})
                            .setGuiRenderScale(14)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Coal n shid"})
            );

            // gsco67millgon
            put(ItemIDs.minecart67millgon.item,
                    new TrainRecord("67millgon", gsco67millgon.class, ItemIDs.minecart67millgon.item)
                            .setTrainType(EnumTrainType.Gondola)
                            .setMass(3.5)
                            .setColors(new String[] {"Red", "Green", "Brown", "Blue", "Grey", "Skin16", "Skin17", "Purple", "Skin18"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // gsco52millgon
            put(ItemIDs.minecart52millgon.item,
                    new TrainRecord("52millgon", gsco52millgon.class, ItemIDs.minecart52millgon.item)
                            .setTrainType(EnumTrainType.Gondola)
                            .setMass(3.0)
                            .setColors(new String[] {"Green", "Lime", "Red", "Skin16", "Black", "Grey", "Purple", "Brown", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(45)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // AAR50TonHopper
            put(ItemIDs.minecartAAR50TonHopper.item,
                    new TrainRecord("AAR 50 Ton Hopper", AAR50TonHopper.class, ItemIDs.minecartAAR50TonHopper.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2)
                            .setColors(new String[] {"Black", "Purple", "Skin16"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
            );

            // AAR70TonHopper
            put(ItemIDs.minecartAAR70TonHopper.item,
                    new TrainRecord("AAR 70 Ton Hopper", AAR70TonHopper.class, ItemIDs.minecartAAR70TonHopper.item)
                            .setTrainType(EnumTrainType.OpenTopHopper)
                            .setMass(2)
                            .setColors(new String[] {"Black", "Magenta", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(27)
            );

            // MaPa35FootGondola
            put(ItemIDs.minecartMaPa35FootGondola.item,
                    new TrainRecord("MaPa_35Gondola", MaPa35FootGondola.class, ItemIDs.minecartMaPa35FootGondola.item)
                            .setTrainType(EnumTrainType.Gondola)
                            .setMass(3.0)
                            .setColors(new String[] {"Brown", "Grey"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            //Freight - Tanks//

            // DOT11111000
            put(ItemIDs.minecart11000DOT111.item,
                    new TrainRecord("DOT11000", DOT11111000.class, ItemIDs.minecart11000DOT111.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(2.25)
                            .setTankCapacity(41000)
                            .setColors(new String[] {"Black", "LightGrey", "Grey"})
                            .setGuiRenderScale(16)
            );

            // DOT11120600
            put(ItemIDs.minecart20600DOT111.item,
                    new TrainRecord("DOT20600", DOT11120600.class, ItemIDs.minecart20600DOT111.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(3)
                            .setTankCapacity(78000)
                            .setColors(new String[] {"Grey", "Black", "White", "Green", "LightGrey"})
                            .setGuiRenderScale(14)
            );

            // DOT11129080
            put(ItemIDs.minecart29080DOT111.item,
                    new TrainRecord("DOT29080", DOT11129080.class, ItemIDs.minecart29080DOT111.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(3.25)
                            .setTankCapacity(110000)
                            .setColors(new String[] {"Black", "Orange", "LightGrey", "White", "Grey", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(12)
            );

            // DOT11117600
            put(ItemIDs.minecart17600DOT111.item,
                    new TrainRecord("DOT17600", DOT11117600.class, ItemIDs.minecart17600DOT111.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(2.5)
                            .setTankCapacity(67000)
                            .setColors(new String[] {"White", "Black", "Blue", "LightGrey", "Grey", "Yellow", "Brown", "Purple", "Skin16", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
            );

            // NATX30600
            put(ItemIDs.minecartNATX30600.item,
                    new TrainRecord("NATX30600", NATX30600.class, ItemIDs.minecartNATX30600.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(3.25)
                            .setTankCapacity(116000)
                            .setColors(new String[] {"Black", "Grey", "Green", "Red", "Yellow", "Pink", "Skin16", "Skin17", "LightBlue", "Skin18"})
                            .setGuiRenderScale(12)
            );

            // gatc10000
            put(ItemIDs.minecartgatc10000.item,
                    new TrainRecord("gatc10000", GATC10000.class, ItemIDs.minecartgatc10000.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(2)
                            .setTankCapacity(38000)
                            .setColors(new String[] {"Black", "Skin16", "Skin17", "LightBlue", "Grey", "Skin18", "Skin19"})
                            .setGuiRenderScale(15)
            );

            // DUPX39200
            put(ItemIDs.minecartDUPX39200.item,
                    new TrainRecord("DUPX39200", DUPX39200.class, ItemIDs.minecartDUPX39200.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(5)
                            .setTankCapacity(148000)
                            .setColors(new String[] {"Grey", "White", "Green", "Black"})
                            .setGuiRenderScale(10)
            );

            // CoffinCar
            put(ItemIDs.minecartCoffinCar.item,
                    new TrainRecord("CoffinCar", CoffinCar.class, ItemIDs.minecartCoffinCar.item)
                            .setTrainType(EnumTrainType.Tankcar)
                            .setMass(1.5)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(14)
            );

            //Freight - Various//

            // SkeletonCar
            put(ItemIDs.minecartSkeletonLogCar.item,
                    new TrainRecord("Skeleton", SkeletonLogCar.class, ItemIDs.minecartSkeletonLogCar.item)
                            .setTrainType(EnumTrainType.LogFlat)
                            .setMass(1)
                            .setColors(new String[]{"Black","Grey", "LightGrey"})
                            .setGuiRenderScale(18)
                            .setCargoCapacity(18)
            );

            // EarlyFlat
            put(ItemIDs.minecartEarlyFlat.item,
                    new TrainRecord("EarlyFlat", EarlyFlat.class, ItemIDs.minecartEarlyFlat.item)
                            .setTrainType(EnumTrainType.Flatcars)
                            .setMass(0.7)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
                            .setCargoCapacity(18)
                            .setAdditionalTooltip(new String[] {"Cargo: Any."})
            );

            // Gunderson89FootAutorack
            put(ItemIDs.minecartGunderson89ftAutorack.item,
                    new TrainRecord("89ftAutorack", Gunderson89ftAutorack.class, ItemIDs.minecartGunderson89ftAutorack.item)
                            .setTrainType(EnumTrainType.Autorack)
                            .setMass(4.75)
                            .setColors(new String[]{"Yellow", "Orange", "LightGrey", "Blue", "Black", "Brown", "Pink"})
                            .setGuiRenderScale(8)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any"})
            );

            // Gunderson89FootFlat
            put(ItemIDs.minecartGunderson89ftFlat.item,
                    new TrainRecord("89ftFlat", Gunderson89ftFlat.class, ItemIDs.minecartGunderson89ftFlat.item)
                            .setTrainType(EnumTrainType.Flatcars)
                            .setMass(3.25)
                            .setColors(new String[]{"Yellow", "Blue", "Purple"})
                            .setGuiRenderScale(8)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Cargo: Any"})
            );

            // StampedeRack
            put(ItemIDs.minecartStampedeRack.item,
                    new TrainRecord("StampedeRack", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.StampedeRack.class, ItemIDs.minecartStampedeRack.item)
                            .setTrainType("Livestock Car")
                            .setMass(3.75)
                            .setColors(new String[]{"White", "Brown"})
                            .setGuiRenderScale(10)
            );

            // HuskyStackWellcar
            put(ItemIDs.minecartHuskyStackWellcar.item,
                    new TrainRecord("40ftHuskyStackWellcar", HuskyStack2.class, ItemIDs.minecartHuskyStackWellcar.item)
                            .setTrainType(EnumTrainType.Wellcar)
                            .setMass(3)
                            .setColors(new String[] {"Yellow", "Blue", "Brown", "Green", "Pink", "Skin16"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(54)
                            .setAdditionalTooltip(new String[] {"Will carry containers (for REAL) Eventually!"})
            );

            // IngotPig
            put(ItemIDs.minecartIngotPig.item,
                    new TrainRecord("IngotPig", IngotPig.class, ItemIDs.minecartIngotPig.item)
                            .setTrainType(EnumTrainType.Other)
                            .setMass(2)
                            .setColors(new String[] {"Brown", "Black"})
                            .setGuiRenderScale(18)
                            .setCargoCapacity(9)
            );

            // SteelSlabFlat
            put(ItemIDs.minecartSteelSlabFlat.item,
                    new TrainRecord("SteelSlabFlat", SteelSlabFlat.class, ItemIDs.minecartSteelSlabFlat.item)
                            .setTrainType(EnumTrainType.Other)
                            .setMass(2.5)
                            .setColors(new String[] {"Brown", "Black"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(9)
                            .setAdditionalTooltip(new String[] {"Cargo: steel and metal ig."})
            );

            // EvansCoilCar
            put(ItemIDs.minecartEvansCoilCar.item,
                    new TrainRecord("EvansCoilCar", EvansCoilCar.class, ItemIDs.minecartEvansCoilCar.item)
                            .setTrainType(EnumTrainType.Other)
                            .setMass(3)
                            .setColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23"})
                            .setGuiRenderScale(16)
                            .setCargoCapacity(36)
                            .setAdditionalTooltip(new String[] {"Cargo: Steel Coils & Likewise"})
            );

            //Passenger - PCH//

            // pch120commute
            put(ItemIDs.minecartPCH120Commute.item,
                    new TrainRecord("PCH-120 Commute", PCH120Commute.class, ItemIDs.minecartPCH120Commute.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(1400)
                            .setMaxSpeed(120)
                            .setMass(0)
                            .setFuelConsumption(55)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.985)
                            .setColors(new String[] {"White", "Blue", "Red", "Green", "Lime"})
                            .setGuiRenderScale(14)
                            .setBogieLocoPosition(-2.7)
            );

            // pch120coach
            put(ItemIDs.minecartPCH120Car.item,
                    new TrainRecord("PCH-120 Commute Car", PCH120Coach.class, ItemIDs.minecartPCH120Car.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(2)
                            .setColors(new String[] {"White", "Blue", "Red", "Green", "Lime", "Purple", "Pink", "Yellow"})
                            .setGuiRenderScale(14)
            );

            // pch130commute2
            put(ItemIDs.minecartPCH130Commute2.item,
                    new TrainRecord("PCH-130 Commute2", PCH130Commute2.class, ItemIDs.minecartPCH130Commute2.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(1450)
                            .setMaxSpeed(130)
                            .setMass(0)
                            .setFuelConsumption(60)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.995)
                            .setColors(new String[] {"White"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-3.7)
            );

            // pch130car2
            put(ItemIDs.minecartPCH130Car2.item,
                    new TrainRecord("PCH-130 Commute2 Car", PCH130Coach.class, ItemIDs.minecartPCH130Car2.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(2)
                            .setColors(new String[] {"White"})
                            .setGuiRenderScale(10)
            );

            // PCH100H
            put(ItemIDs.minecartExperimentalHydrogenTrain.item,
                    new TrainRecord("PCH-100H", PCH100H.class, ItemIDs.minecartExperimentalHydrogenTrain.item)
                            .setTrainType(EnumTrainType.Hydrogen)
                            .setMHP(900)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(6)
                            .setHeatingTime(160)
                            .setAccelerationRate(0.8)
                            .setBrakeRate(0.985)
                            .setTankCapacity(7000)
                            .setColors(new String[]{"LightBlue", "Blue", "Lime", "Red"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-2.6)
                            .setAdditionalTooltip(new String[] {"Powered by Mekanism Hydrogen"})
            );

            // PCH100Coach
            put(ItemIDs.minecartPCH100HCoach.item,
                    new TrainRecord("PCH-100H Coach", PCH100HCoach.class, ItemIDs.minecartPCH100HCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(2)
                            .setColors(new String[]{"LightBlue", "Blue", "Lime", "Red"})
                            .setGuiRenderScale(10)
            );

            // aipkitExplorer
            put(ItemIDs.minecartAipkitExplorer.item,
                    new TrainRecord("Aipkit Explorer", AipkitExplorer.class, ItemIDs.minecartAipkitExplorer.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(2)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
            );

            // aipkitExplorer2
            put(ItemIDs.minecartAipkitExplorer2.item,
                    new TrainRecord("Aipkit Explorer-II", AipkitExplorer2.class, ItemIDs.minecartAipkitExplorer2.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(2)
                            .setColors(new String[]{"White", "Grey","Lime"})
                            .setGuiRenderScale(10)
            );

            //Passenger - Dominiks collection//

            // PSRPO
            put(ItemIDs.minecartPSRPO.item,
                    new TrainRecord("PSRPO", PSRPO.class, ItemIDs.minecartPSRPO.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Yellow", "Blue", "Cyan", "Orange"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // PS85Baggage
            put(ItemIDs.minecartPS85Baggage.item,
                    new TrainRecord("Freight PS 85 Baggage", PS85Baggage.class, ItemIDs.minecartPS85Baggage.item)
                            .setTrainType("freight")
                            .setMass(2)
                            .setColors(new String[]{"Yellow", "Blue", "Orange"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PSCombine
            put(ItemIDs.minecartPScombine.item,
                    new TrainRecord("PS Combine Coach", PSCombine.class, ItemIDs.minecartPScombine.item)
                            .setTrainType(EnumTrainType.Passenger_Combine)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Yellow", "Orange", "LightGrey", "Grey", "White", "Red"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PS52SeatCoach
            put(ItemIDs.minecartPS52seatCoach.item,
                    new TrainRecord("PS 52 Seat Coach", PS52SeatCoach.class, ItemIDs.minecartPS52seatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "LightBlue", "Yellow", "Orange", "Cyan", "Grey", "LightGrey", "Purple", "Green", "Lime", "White", "Red"})
                            .setGuiRenderScale(10)
            );

            // PSDamnitAnotherDiner
            put(ItemIDs.minecartPSDamnitAnotherDiner.item,
                    new TrainRecord("PS Center Diner 2", PSDamnitAnotherDiner.class, ItemIDs.minecartPSDamnitAnotherDiner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Orange", "Blue", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // PSSleeper565
            put(ItemIDs.minecartPSSleeper565.item,
                    new TrainRecord("PS 5-6-5 Sleeper", PSSleeper565.class, ItemIDs.minecartPSSleeper565.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "Brown", "Orange", "LightBlue", "Grey", "Yellow", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // PSSleeper565DRGW
            put(ItemIDs.minecartPSSleeper565DRGW.item,
                    new TrainRecord("PS 5-6-5 Sleeper DRGW Edition", PSSleeper565DRGW.class, ItemIDs.minecartPSSleeper565DRGW.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Orange"})
                            .setGuiRenderScale(10)
            );

            // PSLunchCounter_Lounge
            put(ItemIDs.minecartPSLunchCounter_Lounge.item,
                    new TrainRecord("PS Lunch Counter-Lounge", PSLunchCounter_Lounge.class, ItemIDs.minecartPSLunchCounter_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "Yellow", "Orange", "LightBlue", "Purple", "LightGrey", "Grey", "White", "Red"})
                            .setGuiRenderScale(10)
            );

            // PS30SeatParlor
            put(ItemIDs.minecartPS30SeatParlor.item,
                    new TrainRecord("PS 30 Seat Parlor", PS30SeatParlor.class, ItemIDs.minecartPS30SeatParlor.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "LightBlue", "Orange", "Red"})
                            .setGuiRenderScale(10)
            );

            // DRGWRPO620Series
            put(ItemIDs.minecartDRGWRPO620Series.item,
                    new TrainRecord("D&RGW RPO 620 Series", DRGWRPO620Series.class, ItemIDs.minecartDRGWRPO620Series.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Magenta", "Green", "Lime", "Grey", "Purple", "Yellow"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // DRGWRPO630Series
            put(ItemIDs.minecartDRGWRPO630Series.item,
                    new TrainRecord("D&RGW RPO 630 Series", DRGWRPO630Series.class, ItemIDs.minecartDRGWRPO630Series.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Green", "Yellow"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // DRGWBaggage700Series
            put(ItemIDs.minecartDRGWBaggage700Series.item,
                    new TrainRecord("D&RGW Baggage 700 Series", DRGWBaggage700Series.class, ItemIDs.minecartDRGWBaggage700Series.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Magenta", "Green", "Lime", "Brown", "Yellow", "Black", "Grey", "LightGrey", "White", "Orange", "Purple"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // DRGWBaggage740Series
            put(ItemIDs.minecartDRGWBaggage740Series.item,
                    new TrainRecord("D&RGW Baggage 740 Series", DRGWBaggage740Series.class, ItemIDs.minecartDRGWBaggage740Series.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Green", "Lime", "Black", "Brown", "Yellow", "Grey", "Magenta", "LightGrey", "White"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // DRGWCoach1000Series
            put(ItemIDs.minecartDRGWCoach1000Series.item,
                    new TrainRecord("D&RGW Coach 1000 Series", DRGWCoach1000Series.class, ItemIDs.minecartDRGWCoach1000Series.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "Blue", "Black", "Yellow", "Grey"})
                            .setGuiRenderScale(12)
            );

            // DRGWCoach1005Series
            put(ItemIDs.minecartDRGWCoach1005Series.item,
                    new TrainRecord("D&RGW Coach 1005 Series", DRGWCoach1005Series.class, ItemIDs.minecartDRGWCoach1005Series.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Orange", "Black", "Grey", "LightGrey", "White", "Brown", "Red"})
                            .setGuiRenderScale(12)
            );

            // Pullman 69' Chair Car
            put(ItemIDs.minecartPullman69ChairCar.item,
                    new TrainRecord("Pullman 69' Chair Car", Pullman69ChairCar.class, ItemIDs.minecartPullman69ChairCar.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "Black", "Grey", "LightGrey", "White", "Red"})
                            .setGuiRenderScale(12)
            );
            // PSRPOPM
            put(ItemIDs.minecartPSRPOPM.item,
                    new TrainRecord("PSPMRPO", PSRPOPM.class, ItemIDs.minecartPSRPOPM.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Blue", "Yellow"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // PS73Baggage
            put(ItemIDs.minecartPS73Baggage.item,
                    new TrainRecord("Freight PS 73 Baggage", PS73Baggage.class, ItemIDs.minecartPS73Baggage.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Blue", "Yellow", "Green", "Red", "Magenta", "Orange"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // PS54SeatCoach_Lounge
            put(ItemIDs.minecartPS54SeatCoach_Lounge.item,
                    new TrainRecord("PS 54 Seat Coach-Lounge", PS54SeatCoach_Lounge.class, ItemIDs.minecartPS54SeatCoach_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "LightBlue", "LightGrey", "Grey"})
                            .setGuiRenderScale(10)
            );

            // PS54SeatCoach_Lounge_1950
            put(ItemIDs.minecartPS54SeatCoach_Lounge_1950.item,
                    new TrainRecord("PS 54 Seat Coach-Lounge 1950", PS54SeatCoach_Lounge_1950.class, ItemIDs.minecartPS54SeatCoach_Lounge_1950.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // PScenterDiner
            put(ItemIDs.minecartPSCenterDiner.item,
                    new TrainRecord("PS Center Diner", PScenterDiner.class, ItemIDs.minecartPSCenterDiner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // PS58SeatCoach_Observation
            put(ItemIDs.minecartPS58SeatCoach_Observation.item,
                    new TrainRecord("PS 58 Seat Coach-Observation", PS58SeatCoach_Observation.class, ItemIDs.minecartPS58SeatCoach_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "LightBlue", "Purple", "Orange", "Red", "Magenta", "Pink", "Green", "Lime", "Brown", "Black", "LightGrey", "Grey", "White", "Skin16", "Yellow"})
                            .setGuiRenderScale(10)
            );

            // PSBMCombine
            put(ItemIDs.minecartPSBMCombine.item,
                    new TrainRecord("PS B&M Combine", PSBMCombine.class, ItemIDs.minecartPSBMCombine.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Magenta", "Brown", "Green", "Blue"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSBM56SeatCoach
            put(ItemIDs.minecartPSBM56SeatCoach.item,
                    new TrainRecord("PS B&M 56 Seat Coach", PSBM56SeatCoach.class, ItemIDs.minecartPSBM56SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Magenta", "LightGrey", "Grey", "Brown", "Red", "Pink", "Green", "Lime", "Yellow", "Blue", "Cyan", "LightBlue", "Purple", "White", "Black"})
                            .setGuiRenderScale(10)
            );

            // PSBMDiner_Lounge
            put(ItemIDs.minecartPSBMDiner_Lounge.item,
                    new TrainRecord("PS B&M Diner_Lounge", PSBMDiner_Lounge.class, ItemIDs.minecartPSBMDiner_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Magenta", "Brown", "Green", "Blue", "Cyan", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // ACFGNRPO_30
            put(ItemIDs.minecartACFGNRPO_30.item,
                    new TrainRecord("AC&F GN RPO (30' mail)", ACFGNRPO_30.class, ItemIDs.minecartACFGNRPO_30.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Orange", "Yellow", "Green", "Lime"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // ACFGN60SeatCoach
            put(ItemIDs.minecartACFGN60SeatCoach.item,
                    new TrainRecord("AC&F GN 60 Seat Coach", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN60SeatCoach.class, ItemIDs.minecartACFGN60SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Orange", "Yellow", "Brown", "LightBlue", "Green", "LightGrey", "Black", "White", "Cyan", "Blue", "Lime", "Grey", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"})
                            .setGuiRenderScale(10)
            );

            // ACFGNDinerObservation
            put(ItemIDs.minecartACFGNDiner_Observation.item,
                    new TrainRecord("AC&F GN Diner-Observation", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGNDinerObservation.class, ItemIDs.minecartACFGNDiner_Observation.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Orange", "Green"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // ACFGN28SeatCoach_Dinette
            put(ItemIDs.minecartACFGN28SeatCoach_Dinette.item,
                    new TrainRecord("AC&F GN 28 Seat Coach-Dinette", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN28SeatCoach_Dinette.class, ItemIDs.minecartACFGN28SeatCoach_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Orange", "Green", "Blue", "White"})
                            .setGuiRenderScale(10)
            );

            // ACFGN1DR_17SeatParlorObservation
            put(ItemIDs.minecartACFGN1DR_17SeatParlor_Observation.item,
                    new TrainRecord("AC&F GN 1DR-17 Seat Parlor-Observation", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN1DR_17SeatParlorObservation.class, ItemIDs.minecartACFGN1DR_17SeatParlor_Observation.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Orange", "Green", "Blue", "White"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PSGNRPO_30
            put(ItemIDs.minecartPSGNRPO_30.item,
                    new TrainRecord("PS GN RPO (30' mail)", PSGNRPO_30.class, ItemIDs.minecartPSGNRPO_30.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Orange", "Green", "Yellow", "Lime"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // OB84SeatCoach
            put(ItemIDs.minecartOB84SeatCoach.item,
                    new TrainRecord("OB 84 Seat Coach", OB84SeatCoach.class, ItemIDs.minecartOB84SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "Brown", "Black", "White", "Grey", "LightBlue", "Yellow", "Magenta", "Red", "Pink", "Blue", "LightGrey", "Purple", "Cyan", "Orange", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"})
                            .setGuiRenderScale(10)
            );

            // OB92SeatCoach
            put(ItemIDs.minecartOB92SeatCoach.item,
                    new TrainRecord("OB 92 Seat Coach", OB92SeatCoach.class, ItemIDs.minecartOB92SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "LightGrey", "Grey", "Brown", "Red", "Black", "White", "Yellow"})
                            .setGuiRenderScale(10)
            );

            // OBNHGrillCar
            put(ItemIDs.minecartOBNHGrillCar.item,
                    new TrainRecord("OB NH Grill Car", OBNHGrillCar.class, ItemIDs.minecartOBNHGrillCar.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Yellow", "Lime"})
                            .setGuiRenderScale(10)
            );

            // OBNHLounge5107
            put(ItemIDs.minecartOBNHLounge5107.item,
                    new TrainRecord("OB NH Commuter Lounge 5107", OBNHLounge5107.class, ItemIDs.minecartOBNHLounge5107.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Red"})
                            .setGuiRenderScale(10)
            );

            // OBBaggage_52SeatDividedCoach
            put(ItemIDs.minecartOBBaggage_52SeatDividedCoach.item,
                    new TrainRecord("OB Baggage-52 Seat Divided Coach", OBBaggage_52SeatDividedCoach.class, ItemIDs.minecartOBBaggage_52SeatDividedCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "LightGrey", "Lime", "Grey", "Yellow"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // OB76SeatDividedCoach
            put(ItemIDs.minecartOB76SeatDividedCoach.item,
                    new TrainRecord("OB 76 Seat Divided Coach", OB76SeatDividedCoach.class, ItemIDs.minecartOB76SeatDividedCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Grey", "Yellow", "Lime", "Black", "Blue", "Orange", "Brown", "LightGrey", "Red", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // OBLV82_92SeatCoach
            put(ItemIDs.minecartOBLV82_92SeatCoach.item,
                    new TrainRecord("OB LV 82/92 Seat Coach", OBLV82_92SeatCoach.class, ItemIDs.minecartOBLV82_92SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "White", "Pink"})
                            .setGuiRenderScale(10)
            );

            // OBRPO15
            put(ItemIDs.minecartOBRPO15.item,
                    new TrainRecord("OB RPO (15' mail)", OBRPO15.class, ItemIDs.minecartOBRPO15.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Green", "Lime", "Grey", "Cyan", "LightGrey", "Blue"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // OB24SeatCoach_Dinette
            put(ItemIDs.minecartOB24SeatCoach_Dinette.item,
                    new TrainRecord("OB 24 Seat Coach-Dinette", OB24SeatCoach_Dinette.class, ItemIDs.minecartOB24SeatCoach_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Brown", "Green", "Pink", "Lime", "Grey", "Blue"})
                            .setGuiRenderScale(10)
            );

            // OBBAR52SeatCoach_Dinette
            put(ItemIDs.minecartOBBAR52SeatCoach_Dinette.item,
                    new TrainRecord("OB BAR 52 Seat Coach-Dinette", OBBAR52SeatCoach_Dinette.class, ItemIDs.minecartOBBAR52SeatCoach_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "Blue"})
                            .setGuiRenderScale(10)
            );

            // PSCNW56SeatCoach
            put(ItemIDs.minecartPSCNW56SeatCoach.item,
                    new TrainRecord("PS CNW 56 Seat Coach", PSCNW56SeatCoach.class, ItemIDs.minecartPSCNW56SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Skin19", "Green", "Lime", "Skin20", "White", "Brown", "Skin21", "Grey", "LightGrey", "Skin22", "Skin16", "Skin17", "Skin18", "Purple", "Orange", "Red", "Blue", "Skin23", "Cyan", "LightBlue", "Pink", "Magenta"})
                            .setGuiRenderScale(10)
            );

            // PSCNW48SeatCoach_Lounge
            put(ItemIDs.minecartPSCNW48SeatCoachLounge.item,
                    new TrainRecord("PS CNW 48 Seat Coach-Lounge", PSCNW48SeatCoach_Lounge.class, ItemIDs.minecartPSCNW48SeatCoachLounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black"})
                            .setGuiRenderScale(10)
            );

            // PSCNW20SeatCoach_Lounge
            put(ItemIDs.minecartPSCNW20SeatCoachLounge.item,
                    new TrainRecord("PS CNW 20 Seat Coach-Lounge", PSCNW20SeatCoach_Lounge.class, ItemIDs.minecartPSCNW20SeatCoachLounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black"})
                            .setGuiRenderScale(10)
            );

            // PSCNW36SeatCoach_Dinette
            put(ItemIDs.minecartPSCNW36SeatCoach_Dinette.item,
                    new TrainRecord("PS CNW 36 Seat Coach-Dinette", PSCNW36SeatCoach_Dinette.class, ItemIDs.minecartPSCNW36SeatCoach_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Green"})
                            .setGuiRenderScale(10)
            );

            // PSCNW56SeatDiner
            put(ItemIDs.minecartPSCNW56SeatDiner.item,
                    new TrainRecord("PS CNW 56 Seat Diner", PSCNW56SeatDiner.class, ItemIDs.minecartPSCNW56SeatDiner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green"})
                            .setGuiRenderScale(10)
            );

            // PSCNW48SeatDiner
            put(ItemIDs.minecartPSCNW48SeatDiner.item,
                    new TrainRecord("PS CNW 48 Seat Diner", PSCNW48SeatDiner.class, ItemIDs.minecartPSCNW48SeatDiner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Green"})
                            .setGuiRenderScale(10)
            );

            // PSCNW1DR_22SeatParlor
            put(ItemIDs.minecartPSCNW1DR_22SeatParlor.item,
                    new TrainRecord("PS CNW 1DR-22 Seat Parlor", PSCNW1DR_22SeatParlor.class, ItemIDs.minecartPSCNW1DR_22SeatParlor.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green", "Lime", "Blue", "White", "Grey", "LightBlue", "Cyan", "LightGrey", "Brown", "Orange", "Red", "Pink", "Magenta", "Purple", "Skin16"})
                            .setGuiRenderScale(10)
            );

            // PSCNW16_1_3Sleeper
            put(ItemIDs.minecartPSCNW16_1_3Sleeper.item,
                    new TrainRecord("PS CNW 16-1-3 Sleeper", PSCNW16_1_3Sleeper.class, ItemIDs.minecartPSCNW16_1_3Sleeper.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green"})
                            .setGuiRenderScale(10)
            );

            // PSCNW12SeatParlor_Observation
            put(ItemIDs.minecartPSCNW12SeatParlor_Observation.item,
                    new TrainRecord("PS CNW 12 Seat Parlor-Observation", PSCNW12SeatParlor_Observation.class, ItemIDs.minecartPSCNW12SeatParlor_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green", "Lime"})
                            .setGuiRenderScale(10)
            );

            // PSCNWRPO15
            put(ItemIDs.minecartPSCNWRPO15.item,
                    new TrainRecord("PS CNW RPO(15')", PSCNWRPO15.class, ItemIDs.minecartPSCNWRPO15.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Yellow", "Green"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PSCNWRPO60
            put(ItemIDs.minecartPSCNWRPO60.item,
                    new TrainRecord("PS CNW RPO(60')", PSCNWRPO60.class, ItemIDs.minecartPSCNWRPO60.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Yellow", "Green", "Orange", "Red", "Grey", "LightGrey", "White", "Magenta", "Brown", "Lime"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PSCNWBaggage_LC_Lounge
            put(ItemIDs.minecartPSCNWBaggage_LC_Lounge.item,
                    new TrainRecord("PS CNW Baggage-LC-Lounge", PSCNWBaggage_LC_Lounge.class, ItemIDs.minecartPSCNWBaggage_LC_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey", "White", "Magenta"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSCNWRPO15_Baggage_LC_Lounge
            put(ItemIDs.minecartPSCNWRPO15_Baggage_LC_Lounge.item,
                    new TrainRecord("PS CNW RPO(15')-Baggage-LC-Lounge", PSCNWRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCNWRPO15_Baggage_LC_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSCNWBaggage_LC_Diner
            put(ItemIDs.minecartPSCNWBaggage_LC_Diner.item,
                    new TrainRecord("PS CNW Baggage-LC-Diner", PSCNWBaggage_LC_Diner.class, ItemIDs.minecartPSCNWBaggage_LC_Diner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSCNW20SeatCoach_Lounge_1959
            put(ItemIDs.minecartPSCNW20SeatCoachLounge_1959.item,
                    new TrainRecord("PS CNW 20 Seat Coach-Lounge (1959)", PSCNW20SeatCoach_Lounge_1959.class, ItemIDs.minecartPSCNW20SeatCoachLounge_1959.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow"})
                            .setGuiRenderScale(10)
            );

            // PSCNWCommuterLounge
            put(ItemIDs.minecartPSCNWCommuterLounge.item,
                    new TrainRecord("PS CNW Commuter Lounge", PSCNWCommuterLounge.class, ItemIDs.minecartPSCNWCommuterLounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Green"})
                            .setGuiRenderScale(10)
            );

            // PSCNW27SeatParlor_Observation
            put(ItemIDs.minecartPSCNW27SeatParlor_Observation.item,
                    new TrainRecord("PS CNW 27 Seat Parlor-Observation", PSCNW27SeatParlor_Observation.class, ItemIDs.minecartPSCNW27SeatParlor_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Green", "Black", "Lime"})
                            .setGuiRenderScale(10)
            );

            // BuddRDG56SeatCoach_Lounge
            put(ItemIDs.minecartBuddRDG56SeatCoachLounge.item,
                    new TrainRecord("Budd RDG 56 Seat Coach-Lounge", BuddRDG56SeatCoach_Lounge.class, ItemIDs.minecartBuddRDG56SeatCoachLounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // BuddRDGDiner_Lounge
            put(ItemIDs.minecartBuddRDGDiner_Lounge.item,
                    new TrainRecord("Budd RDG Diner-Lounge", BuddRDGDiner_Lounge.class, ItemIDs.minecartBuddRDGDiner_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // BuddRDG56SeatCoach_Observation
            put(ItemIDs.minecartBuddRDG56SeatCoach_Observation.item,
                    new TrainRecord("Budd RDG 56 Seat Coach-Observation", BuddRDG56SeatCoach_Observation.class, ItemIDs.minecartBuddRDG56SeatCoach_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey", "LightBlue", "White"})
                            .setGuiRenderScale(10)
            );

            // BuddCRIP52SeatCoach
            put(ItemIDs.minecartBuddCRIP52SeatCoach.item,
                    new TrainRecord("Budd CRIP 52 Seat Coach", BuddCRIP52SeatCoach.class, ItemIDs.minecartBuddCRIP52SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "LightGrey", "Blue", "White", "Cyan"})
                            .setGuiRenderScale(10)
            );

            // BuddNYC52SeatCoach
            put(ItemIDs.minecartBuddNYC52SeatCoach.item,
                    new TrainRecord("Budd NYC 52 Seat Coach", BuddNYC52SeatCoach.class, ItemIDs.minecartBuddNYC52SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Orange", "Red"})
                            .setGuiRenderScale(10)
            );

            // BuddCBQ52SeatCoach
            put(ItemIDs.minecartBuddCBQ52SeatCoach.item,
                    new TrainRecord("Budd CB&Q 52 Seat Coach", BuddCBQ52SeatCoach.class, ItemIDs.minecartBuddCBQ52SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Brown", "Purple"})
                            .setGuiRenderScale(10)
            );

            // BuddDome46SeatCoach
            put(ItemIDs.minecartBuddDome46SeatCoach.item,
                    new TrainRecord("Budd Dome-46 Seat Coach", BuddDome46SeatCoach.class, ItemIDs.minecartBuddDome46SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Green", "Lime", "Orange", "Blue", "Black", "Magenta", "Yellow", "Red", "Pink", "Cyan", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"})
                            .setGuiRenderScale(10)
            );

            // BuddCBQDome50SeatCoach
            put(ItemIDs.minecartBuddCBQDome50SeatCoach.item,
                    new TrainRecord("Budd CB&Q Dome-50 Seat Coach", BuddCBQDome50SeatCoach.class, ItemIDs.minecartBuddCBQDome50SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey"})
                            .setGuiRenderScale(10)
            );

            // BuddPrewarBaggage
            put(ItemIDs.minecartBuddPrewarBaggage.item,
                    new TrainRecord("Budd Prewar Baggage", BuddPrewarBaggage.class, ItemIDs.minecartBuddPrewarBaggage.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Grey", "LightGrey", "White", "Red", "Yellow", "Black"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // BuddATSF52SeatCoach
            put(ItemIDs.minecartBuddATSF52SeatCoach.item,
                    new TrainRecord("Budd ATSF 52 Seat Coach", BuddATSF52SeatCoach.class, ItemIDs.minecartBuddATSF52SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Yellow", "Orange", "Green", "Pink", "Blue", "Lime", "Purple", "Brown", "Grey"})
                            .setGuiRenderScale(10)
            );

            // BuddATSF48SeatCoach
            put(ItemIDs.minecartBuddATSF48SeatCoach.item,
                    new TrainRecord("Budd ATSF 48 Seat Coach", BuddATSF48SeatCoach.class, ItemIDs.minecartBuddATSF48SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Cyan"})
                            .setGuiRenderScale(10)
            );

            // BuddATSF50SeatCoach_observation
            put(ItemIDs.minecartBuddATSF50SeatCoachObservation.item,
                    new TrainRecord("Budd ATSF 50 Seat Coach-Observation", BuddATSF50SeatCoach_Observation.class, ItemIDs.minecartBuddATSF50SeatCoachObservation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // BuddATSF34SeatParlor_observation
            put(ItemIDs.minecartBuddATSF34SeatParlorObservation.item,
                    new TrainRecord("Budd ATSF 34 Seat Parlor-Observation", BuddATSF34SeatParlor_Observation.class, ItemIDs.minecartBuddATSF34SeatParlorObservation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Lime", "Brown", "Blue"})
                            .setGuiRenderScale(10)
            );

            // BuddATSF58SeatCoach_observation
            put(ItemIDs.minecartBuddATSF58SeatCoachObservation.item,
                    new TrainRecord("Budd ATSF 58 Seat Coach-Observation", BuddATSF58SeatCoach_Observation.class, ItemIDs.minecartBuddATSF58SeatCoachObservation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Orange", "Cyan", "Purple"})
                            .setGuiRenderScale(10)
            );

            // PSATSF50SeatCoach_observation
            put(ItemIDs.minecartPSATSF50SeatCoachObservation.item,
                    new TrainRecord("PS ATSF 50 Seat Coach-Observation", PSATSF50SeatCoach_Observation.class, ItemIDs.minecartPSATSF50SeatCoachObservation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Grey", "LightGrey", "Blue", "Orange"})
                            .setGuiRenderScale(10)
            );

            // ACF_SP_98seatcoach
            put(ItemIDs.minecartACF_SP_98seatcoach.item,
                    new TrainRecord("AC&F SP 98 Seat Coach", ACF_SP_98seatcoach.class, ItemIDs.minecartACF_SP_98seatcoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(5)
                            .setColors(new String[]{"Green", "Lime", "LightGrey", "Grey", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20","Skin21","Skin22"})
                            .setGuiRenderScale(10)
            );

            // ACFUPRPO60
            put(ItemIDs.minecartACFUPRPO60.item,
                    new TrainRecord("AC&F UP RPO(60')", ACFUPRPO60.class, ItemIDs.minecartACFUPRPO60.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Yellow", "Red", "Orange", "Brown", "Green", "Blue", "Lime", "Grey", "LightGrey", "Black", "White"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // BuddDome54SeatCoach
            put(ItemIDs.minecartBuddDome54SeatCoach.item,
                    new TrainRecord("Budd Dome-54 Seat Coach", BuddDome54SeatCoach.class, ItemIDs.minecartBuddDome54SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "LightBlue", "Grey", "LightGrey", "White", "Red"})
                            .setGuiRenderScale(10)
            );

            // PSCEIRPO15_Baggage_LC_Lounge
            put(ItemIDs.minecartPSCEIRPO15_Baggage_LC_Lounge.item,
                    new TrainRecord("PS C&EI RPO(15')-Baggage-LC-Lounge", PSCEIRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCEIRPO15_Baggage_LC_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Orange", "Cyan", "Red"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSCEIRPO15_Baggage_38SeatCoach
            put(ItemIDs.minecartPSCEIRPO15_Baggage_38SeatCoach.item,
                    new TrainRecord("PS C&EI RPO(15')-Baggage-38 Seat Coach", PSCEIRPO15_Baggage_38SeatCoach.class, ItemIDs.minecartPSCEIRPO15_Baggage_38SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Orange", "Cyan", "Red"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(18)
            );

            // PSCEI60SeatCoach
            put(ItemIDs.minecartPSCEI60SeatCoach.item,
                    new TrainRecord("PS C&EI 60 Seat Coach", PSCEI60SeatCoach.class, ItemIDs.minecartPSCEI60SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Orange", "Cyan", "LightBlue", "Purple", "Yellow", "Pink", "Grey", "Green", "LightGrey", "Black", "Lime", "Brown", "Magenta", "Red"})
                            .setGuiRenderScale(10)
            );

            // PSCEIDiner
            put(ItemIDs.minecartPSCEIDiner.item,
                    new TrainRecord("PS C&EI Diner", PSCEIDiner.class, ItemIDs.minecartPSCEIDiner.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Cyan", "Red"})
                            .setGuiRenderScale(10)
            );

            // PSCEI1DR_28SeatParlor_Observation
            put(ItemIDs.minecartPSCEI1DR28SeatParlorObservation.item,
                    new TrainRecord("PS C&EI 1DR-28 Seat Parlor-Observation", PSCEI1DR_28SeatParlor_Observation.class, ItemIDs.minecartPSCEI1DR28SeatParlorObservation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Orange", "Red"})
                            .setGuiRenderScale(10)
            );

            // OBHWNH5570_5589Baggage
            put(ItemIDs.minecartOBHWNH5570_5589Baggage.item,
                    new TrainRecord("OB HW NH 5570-5589 Series Baggage", OBHWNH5570_5589Baggage.class, ItemIDs.minecartOBHWNH5570_5589Baggage.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Green", "Lime", "Yellow", "Grey", "LightGrey", "Black", "Red"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // BuddCN68SeatCoach_Observation
            put(ItemIDs.minecartBuddCN68SeatCoach_Observation.item,
                    new TrainRecord("Budd CN 68 Seat Coach-Observation", BuddCN68SeatCoach_Observation.class, ItemIDs.minecartBuddCN68SeatCoach_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"})
                            .setGuiRenderScale(10)
            );

            // BuddCNCoach
            put(ItemIDs.minecartBuddCNCoach.item,
                    new TrainRecord("Budd CN 72 or 54 Seat Coach-Observation", BuddCNCoach.class, ItemIDs.minecartBuddCNCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"})
                            .setGuiRenderScale(10)
            );

            // BuddCNDiner_Lounge
            put(ItemIDs.minecartBuddCNDiner_Lounge.item,
                    new TrainRecord("Budd CN Diner-Lounge", BuddCNDiner_Lounge.class, ItemIDs.minecartBuddCNDiner_Lounge.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Grey", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // BuddCN39SeatParlor_Observation
            put(ItemIDs.minecartBuddCN39SeatParlor_Observation.item,
                    new TrainRecord("Budd CN 39 Seat Parlor-Observation", BuddCN39SeatParlor_Observation.class, ItemIDs.minecartBuddCN39SeatParlor_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Grey", "LightGrey", "Red"})
                            .setGuiRenderScale(10)
            );

            // BuddCN59SeatCoach_Observation
            put(ItemIDs.minecartBuddCN59SeatCoach_Observation.item,
                    new TrainRecord("Budd CN 59 Seat Coach-Observation", BuddCN59SeatCoach_Observation.class, ItemIDs.minecartBuddCN59SeatCoach_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Grey"})
                            .setGuiRenderScale(10)
            );

            // NSCCNBaggage
            put(ItemIDs.minecartNSCCNBaggage.item,
                    new TrainRecord("NSC CN Baggage", NSCCNBaggage.class, ItemIDs.minecartNSCCNBaggage.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Green", "Yellow", "LightBlue", "Black", "Lime", "Orange", "Red", "Pink", "Grey", "LightGrey", "Brown", "White", "Blue", "Cyan", "Purple", "Magenta", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // PSSOUBaggage
            put(ItemIDs.minecartPSSOUBaggage.item,
                    new TrainRecord("PS SOU Baggage", PSSOUBaggage.class, ItemIDs.minecartPSSOUBaggage.item)
                            .setTrainType("freight")
                            .setMass(2)
                            .setColors(new String[]{"Grey", "LightGrey", "White", "Black", "Brown", "Magenta"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PSSOURPO_30
            put(ItemIDs.minecartPSSOURPO_30.item,
                    new TrainRecord("PS SOU RPO (30' mail)", PSSOURPO_30.class, ItemIDs.minecartPSSOURPO_30.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Grey", "LightGrey", "White", "Black"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // PRECOPendulumCoach
            put(ItemIDs.minecartPRECOPendulumCoach.item,
                    new TrainRecord("PRECO Pendulum Coach", PRECOPendulumCoach.class, ItemIDs.minecartPRECOPendulumCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Blue", "Black", "White", "Grey", "LightGrey", "Magenta", "LightBlue", "Cyan", "Lime", "Orange", "Green", "Red"})
                            .setGuiRenderScale(10)
            );

            // PSFNCCBaggage_Dinette
            put(ItemIDs.minecartPSFNCCBaggage_Dinette.item,
                    new TrainRecord("PS FNCC Baggage-Dinette", PSFNCCBaggage_Dinette.class, ItemIDs.minecartPSFNCCBaggage_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green"})
                            .setGuiRenderScale(10)
            );

            // NYCPrewar56SeatCoach
            put(ItemIDs.minecartNYCPrewar56SeatCoach.item,
                    new TrainRecord("NYC Prewar 56 Seat Coach", NYCPrewar56SeatCoach.class, ItemIDs.minecartNYCPrewar56SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Green", "Red", "Grey", "Magenta", "LightGrey", "White", "Blue", "Lime", "Cyan", "Brown", "Pink", "Yellow", "Purple", "Black", "Orange", "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39"})
                            .setGuiRenderScale(10)
            );

            // MILWPrewarBaggage
            put(ItemIDs.minecartMILWPrewarBaggage.item,
                    new TrainRecord("MILW Prewar Baggage", MILWPrewarBaggage.class, ItemIDs.minecartMILWPrewarBaggage.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(27)
            );

            // MILW1935Baggage_Dinette
            put(ItemIDs.minecartMILW1935Baggage_Dinette.item,
                    new TrainRecord("MILW 1935 Baggage-Dinette", MILW1935Baggage_Dinette.class, ItemIDs.minecartMILW1935Baggage_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black"})
                            .setGuiRenderScale(12)
                            .setCargoCapacity(18)
            );

            // MILW1935Tap_Dinette
            put(ItemIDs.minecartMILW1935Tap_Dinette.item,
                    new TrainRecord("MILW 1935 Tap-Dinette", MILW1935Tap_Dinette.class, ItemIDs.minecartMILW1935Tap_Dinette.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"})
                            .setGuiRenderScale(12)
            );

            // MILW1935_48SeatCoach
            put(ItemIDs.minecartMILW1935_48SeatCoach.item,
                    new TrainRecord("MILW 1935 48 Seat Coach", MILW1935_48SeatCoach.class, ItemIDs.minecartMILW1935_48SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime"})
                            .setGuiRenderScale(10)
            );

            // MILW1935_22SeatParlor
            put(ItemIDs.minecartMILW1935_22SeatParlor.item,
                    new TrainRecord("MILW 1935 22 Seat Parlor", MILW1935_22SeatParlor.class, ItemIDs.minecartMILW1935_22SeatParlor.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green"})
                            .setGuiRenderScale(10)
            );

            // MILW1935_21SeatParlor_Observation
            put(ItemIDs.minecartMILW1935_21SeatParlor_Observation.item,
                    new TrainRecord("MILW 1935 21 Seat Parlor Observation", MILW1935_21SeatParlor_Observation.class, ItemIDs.minecartMILW1935_21SeatParlor_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple"})
                            .setGuiRenderScale(10)
            );

            // MILW1935_44SeatCoach_Observation
            put(ItemIDs.minecartMILW1935_44SeatCoach_Observation.item,
                    new TrainRecord("MILW 1935 44 Seat Coach Observation", MILW1935_44SeatCoach_Observation.class, ItemIDs.minecartMILW1935_44SeatCoach_Observation.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black"})
                            .setGuiRenderScale(10)
            );

            // MILW1935Dorm_56SeatCoach
            put(ItemIDs.minecartMILW1935Dorm_56SeatCoach.item,
                    new TrainRecord("MILW 1935 Dormitory-56 Seat Coach", MILW1935Dorm_56SeatCoach.class, ItemIDs.minecartMILW1935Dorm_56SeatCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"})
                            .setGuiRenderScale(10)
            );

            // ACF_LN_KCS60SeatDividedCoach
            put(ItemIDs.minecartACF_LN_KCS60SeatDividedCoach.item,
                    new TrainRecord("AC&F L&N and KCS 60 Seat Divided Coach", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACF_LN_KCS60SeatDividedCoach.class, ItemIDs.minecartACF_LN_KCS60SeatDividedCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple"})
                            .setGuiRenderScale(10)
            );

            // LNCoach2551Series
            put(ItemIDs.minecartLNCoach2551Series.item,
                    new TrainRecord("L&N Coach 2551 Series", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.LNCoach2551Series.class, ItemIDs.minecartLNCoach2551Series.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"})
                            .setGuiRenderScale(10)
            );

            // MON_LightweightRPO_30
            put(ItemIDs.minecartMON_lightweightRPO30.item,
                    new TrainRecord("Monon Lightweight RPO (30' mail)", MONRPO_30.class, ItemIDs.minecartMON_lightweightRPO30.item)
                            .setTrainType("freight")
                            .setMass(1.5)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown"})
                            .setGuiRenderScale(10)
                            .setCargoCapacity(27)
            );

            // MON_LightweightCoach
            put(ItemIDs.minecartMON_lightweightCoach.item,
                    new TrainRecord("Monon 21 Series Lightweight Coach", MON_LightweightCoach.class, ItemIDs.minecartMON_lightweightCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime", "Yellow", "LightBlue"})
                            .setGuiRenderScale(10)
            );

            // MON_LightweightDeluxeCoach
            put(ItemIDs.minecartMON_lightweightDeluxeCoach.item,
                    new TrainRecord("Monon 27 Series Lightweight Deluxe Coach", MON_LightweightDeluxeCoach.class, ItemIDs.minecartMON_lightweightDeluxeCoach.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple"})
                            .setGuiRenderScale(10)
            );

            //Passenger - Amfleets//

            // amfleet
            put(ItemIDs.minecartAmfleet.item,
                    new TrainRecord("Amfleet", Amfleet.class, ItemIDs.minecartAmfleet.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[] {"Red", "White", "LightGrey", "Grey", "Blue", "LightBlue", "Green", "Skin16", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
            );

            // amfleet2
            put(ItemIDs.minecartAmfleet2.item,
                    new TrainRecord("Amfleet2", Amfleet2.class, ItemIDs.minecartAmfleet2.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[] {"Grey" ,"LightGrey", "Red", "Blue",  "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
            );

            // amfleetcab
            put(ItemIDs.minecartAmfleetCab.item,
                    new TrainRecord("AmfleetCab", AmfleetCab.class, ItemIDs.minecartAmfleetCab.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[] {"Red", "Grey", "LightGrey", "LightBlue", "White", "Skin16", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
            );

            // amcafe
            put(ItemIDs.minecartAmCafe.item,
                    new TrainRecord("AmCafe", AmCafe.class, ItemIDs.minecartAmCafe.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[] {"Cyan", "Red", "White", "Grey", "Blue", "LightBlue", "LightGrey", "Skin16", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
            );

            // amcafe2
            put(ItemIDs.minecartAmCafe2.item,
                    new TrainRecord("AmCafe2", AmCafe2.class, ItemIDs.minecartAmCafe2.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(3)
                            .setColors(new String[] {"Grey", "LightGrey", "Red", "Blue", "Skin16", "Skin17", "Skin18", "Skin19"})
                            .setGuiRenderScale(14)
            );

            //Passenger - Polar Express//

            // PEcoach
            put(ItemIDs.minecartPEcooch.item,
                    new TrainRecord("PEcoach", PEcoach.class, ItemIDs.minecartPEcooch.item)
                            .setTrainType("festive passenger")
                            .setMass(6)
                            .setColors(new String[]{"Blue", "Cyan", "Green", "Lime", "Skin16", "Purple"})
                            .setGuiRenderScale(10)
            );

            // PEobserve
            put(ItemIDs.minecartPEobserve.item,
                    new TrainRecord("PEobserve", PEobserve.class, ItemIDs.minecartPEobserve.item)
                            .setTrainType("festive passenger")
                            .setMass(6)
                            .setColors(new String[]{"Blue", "Cyan"})
                            .setGuiRenderScale(10)
            );

            //Caboose//

            // WVcaboose
            put(ItemIDs.minecartWVcaboose.item,
                    new TrainRecord("WVcaboose", WVcaboose.class, ItemIDs.minecartWVcaboose.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Green", "Lime", "Cyan", "White", "Purple", "Skin16"})
                            .setGuiRenderScale(16)
            );

            // HBC1C
            put(ItemIDs.minecartHBC1Ccaboose.item,
                    new TrainRecord("HBC1C", HBC1Cboose.class, ItemIDs.minecartHBC1Ccaboose.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Purple", "Magenta", "Skin18", "Skin19"})
                            .setGuiRenderScale(16)
            );

            // HBC1B
            put(ItemIDs.minecartHBC1Bcaboose.item,
                    new TrainRecord("HBC1B", HBC1Bboose.class, ItemIDs.minecartHBC1Bcaboose.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Blue", "Pink", "Purple", "Green", "Skin17", "Skin18"})
                            .setGuiRenderScale(16)
            );

            // DRGWCaboose
            put(ItemIDs.minecartDRGWCaboose.item,
                    new TrainRecord("DRGWCaboose", DRGWboose.class, ItemIDs.minecartDRGWCaboose.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"LightGrey", "Grey", "Brown", "Green", "Lime", "Yellow", "Cyan", "Black", "White", "Magenta", "Red", "Orange", "Pink", "Skin16", "Purple"})
                            .setGuiRenderScale(16)
            );

            // ICC_Bobber
            put(ItemIDs.minecartICC_Bobber.item,
                    new TrainRecord("ICC_Bobber", ICC_Bobber.class, ItemIDs.minecartICC_Bobber.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Orange", "Red", "Green", "Blue"})
                            .setGuiRenderScale(16)
            );

            // ICCBaywindowWP
            put(ItemIDs.minecartICCBaywindowWP.item,
                    new TrainRecord("ICCBaywindowWP", ICCBaywindowWP.class, ItemIDs.minecartICCBaywindowWP.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Brown", "Red", "Skin16", "Green", "Cyan", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21"})
                            .setGuiRenderScale(16)
            );

            // CA11
            put(ItemIDs.minecartCA11.item,
                    new TrainRecord("CA11", CA11.class, ItemIDs.minecartCA11.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Yellow", "Red", "Cyan", "Skin17", "Skin18", "Purple", "Skin19"})
                            .setGuiRenderScale(16)
            );

            // WPShops600Series
            put(ItemIDs.minecartWPShops600Series.item,
                    new TrainRecord("WPShops600Series", WPShops600Series.class, ItemIDs.minecartWPShops600Series.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Brown", "Yellow", "Green"})
                            .setGuiRenderScale(16)
            );

            // CDCScaboose
            put(ItemIDs.minecartCDCScaboose.item,
                    new TrainRecord("CDCScaboose", CDCScaboose.class, ItemIDs.minecartCDCScaboose.item)
                            .setTrainType(EnumTrainType.Caboose)
                            .setMass(2)
                            .setColors(new String[] {"Red", "Pink", "Orange", "Brown", "Grey", "Green"})
                            .setGuiRenderScale(16)
            );

            //Interurban & Street//

            // W_A11
            put(ItemIDs.minecartW_A11.item,
                    new TrainRecord("SEC W-A11", ElectricW_A11.class, ItemIDs.minecartW_A11.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(200)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black", "Red", "Green"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.5)
            );

            // W_A55
            put(ItemIDs.minecartW_A55.item,
                    new TrainRecord("SEC W-A55", ElectricW_A55.class, ItemIDs.minecartW_A55.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(200)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.55)
            );

            // W_A55_Combine
            put(ItemIDs.minecartW_A55_Combine.item,
                    new TrainRecord("SEC W-A55 Combine", ElectricW_A55_Combine.class, ItemIDs.minecartW_A55_Combine.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(200)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.55)
            );

            //Funny shit

            // BigMeme
            put(ItemIDs.minecartBigMeme.item,
                    new TrainRecord("BigMeme", BigMeme.class, ItemIDs.minecartBigMeme.item)
                            .setTrainType("awesome")
                            .setMHP(1)
                            .setMaxSpeed(200)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.9)
                            .setTankCapacity(8000)
                            .setColors(new String[] {"LightGrey", "Grey"})
                            .setGuiRenderScale(16)
                            .setBogieLocoPosition(-1.1)
            );

            // BombCart
            put(ItemIDs.minecartBombCart.item,
                    new TrainRecord("Payload", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.funny.BombCart.class, ItemIDs.minecartBombCart.item)
                            .setTrainType("misc")
                            .setMass(1.5)
                            .setColors(new String[]{"LightBlue", "Red", "Black", "Blue", "Cyan", "Green", "Grey", "Brown", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Yellow", "White"})
                            .setGuiRenderScale(18)
                            .setAdditionalTooltip(new String[] {"Who is not pushing ze Cart!?"})
            );

            // Thanos
            put(ItemIDs.minecartThanos.item,
                    new TrainRecord("Thanos", Thanos.class, ItemIDs.minecartThanos.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(696969)
                            .setMaxSpeed(6210000)
                            .setMass(0)
                            .setFuelConsumption(69)
                            .setHeatingTime(1)
                            .setAccelerationRate(6)
                            .setBrakeRate(30)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(-1)
                            .setAdditionalTooltip(new String[] {"You don't want to mess with the Universe's Best"})
            );

            // TGVmobile
            put(ItemIDs.minecartTGVMobile.item,
                    new TrainRecord("TGVmobile", DieselTGVmobile.class, ItemIDs.minecartTGVMobile.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(20)
                            .setMaxSpeed(150)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(140)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.9)
                            .setTankCapacity(1000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(2.7)
            );

            // HHgregg
            put(ItemIDs.minecartHHgregg.item,
                    new TrainRecord("HHgregg", DieselHHgregg.class, ItemIDs.minecartHHgregg.item)
                            .setTrainType("awesome")
                            .setMHP(9932)
                            .setMaxSpeed(299)
                            .setMass(0)
                            .setFuelConsumption(42)
                            .setHeatingTime(48)
                            .setAccelerationRate(0.9)
                            .setBrakeRate(0.9)
                            .setTankCapacity(7000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2)
                            .setAdditionalTooltip(new String[] {"hhhgregg, Panasonic Blu-ray nintey-nine dollars, thirty-two inch LCD TV two-nintey nine, LG fourty-two inch HD TV only four eighty-nine, everything on sale during chirstmas in"})
            );

            //Across the pond//

            // Class74
            put(ItemIDs.minecartClass74.item,
                    new TrainRecord("Class74", ElectricClass74.class, ItemIDs.minecartClass74.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(2426)
                            .setMaxSpeed(140)
                            .setMass(0)
                            .setFuelConsumption(50)
                            .setHeatingTime(10)
                            .setAccelerationRate(0.6)
                            .setBrakeRate(0.7)
                            .setTankCapacity(13)
                            .setColors(new String[] {"Blue", "Purple", "Red", "Skin16", "Skin17"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // TwoBil
            put(ItemIDs.minecartTwoBil.item,
                    new TrainRecord("TwoBil", ElectricTwoBil.class, ItemIDs.minecartTwoBil.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(428)
                            .setMaxSpeed(121)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setAccelerationRate(0.5)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"})
                            .setGuiRenderScale(11)
                            .setBogieLocoPosition(-3.15)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // TwoBilTail
            put(ItemIDs.minecartTwoBilTail.item,
                    new TrainRecord("TwoBilTail", PassengerTwoBilTail.class, ItemIDs.minecartTwoBilTail.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1)
                            .setColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"})
                            .setGuiRenderScale(11)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // FourCor
            put(ItemIDs.minecartFourCor.item,
                    new TrainRecord("FourCor", ElectricFourCor.class, ItemIDs.minecartFourCor.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(900)
                            .setMaxSpeed(121)
                            .setMass(0)
                            .setFuelConsumption(7)
                            .setAccelerationRate(0.5)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"})
                            .setGuiRenderScale(11)
                            .setBogieLocoPosition(-3.6)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // FourCorTrailerComposite
            put(ItemIDs.minecartFourCorTrailerComposite.item,
                    new TrainRecord("FourCorTrailerComposite", PassengerFourCorTrailerComposite.class, ItemIDs.minecartFourCorTrailerComposite.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1.6)
                            .setColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"})
                            .setGuiRenderScale(11)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // FourCorTrailerSecond
            put(ItemIDs.minecartFourCorTrailerSecond.item,
                    new TrainRecord("FourCorTrailerSecond", PassengerFourCorTrailerSecond.class, ItemIDs.minecartFourCorTrailerSecond.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1.6)
                            .setColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"})
                            .setGuiRenderScale(11)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // FourBuf
            put(ItemIDs.minecartFourBuf.item,
                    new TrainRecord("FourBuf", PassengerFourBuf.class, ItemIDs.minecartFourBuf.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1.7)
                            .setColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"})
                            .setGuiRenderScale(11)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // FourCorTail
            put(ItemIDs.minecartFourCorTail.item,
                    new TrainRecord("FourCorTail", PassengerFourCorTail.class, ItemIDs.minecartFourCorTail.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1.8)
                            .setColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"})
                            .setGuiRenderScale(11)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // tenderNS3700
            put(ItemIDs.minecartTenderNS3700.item,
                    new TrainRecord("Tender NS 3700", EntityTenderNS3700.class, ItemIDs.minecartTenderNS3700.item)
                            .setTrainType(EnumTrainType.Tender)
                            .setMass(4.3)
                            .setTankCapacity(16000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(18)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // locoSteamNS3700Class
            put(ItemIDs.minecartLocoNS3700Class.item,
                    new TrainRecord("Loco Steam NS 3700 Class", EntityLocoSteamNS3700Class.class, ItemIDs.minecartLocoNS3700Class.item)
                            .setTrainType(EnumTrainType.Steam)
                            .setMHP(1286)
                            .setMaxSpeed(110)
                            .setMass(0)
                            .setFuelConsumption(80)
                            .setWaterConsumption(100)
                            .setHeatingTime(200)
                            .setAccelerationRate(0.35)
                            .setBrakeRate(0.975)
                            .setTankCapacity(4000)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-2.6)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // KawasakiLRV
            put(ItemIDs.minecartKawasakiLRV.item,
                    new TrainRecord("KawasakiLRV", ElectricKawasakiLRV.class, ItemIDs.minecartKawasakiLRV.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(200)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // CQ310PO
            put(ItemIDs.minecartCQ310PO.item,
                    new TrainRecord("CQ310PO", ElectricCQ310PO.class, ItemIDs.minecartCQ310PO.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(350)
                            .setMaxSpeed(100)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.9)
                            .setColors(new String[] {"Grey", "Black", "Skin16"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // CQ310PA
            put(ItemIDs.minecartCQ310PA.item,
                    new TrainRecord("CQ310PA", CQ310PA.class, ItemIDs.minecartCQ310PA.item)
                            .setTrainType(EnumTrainType.Passenger)
                            .setMass(1)
                            .setColors(new String[] {"Grey", "Black", "Skin16"})
                            .setGuiRenderScale(18)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // PCC
            put(ItemIDs.minecartPCC.item,
                    new TrainRecord("PCC", ElectricPCC.class, ItemIDs.minecartPCC.item)
                            .setTrainType(EnumTrainType.Electric)
                            .setMHP(220)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(170)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.875)
                            .setColors(new String[] {"Black", "White"})
                            .setGuiRenderScale(10)
                            .setBogieLocoPosition(-3)
                            .setAdditionalTooltip(new String[] {"Not BAP, but gets to be included"})
            );

            // geometryCar
            put(ItemIDs.minecartGeometryCar.item,
                    new TrainRecord("NXTrack Geometry Car", ExperimentalGeometryCar.class, ItemIDs.minecartGeometryCar.item)
                            .setTrainType("geometry car")
                            .setMass(2)
                            .setColors(new String[] {"Grey", "LightGrey"})
                            .setGuiRenderScale(18)
                            .setAdditionalTooltip(new String[] {"Checks the railroad for things up to standard"})
            );

            // FRED
            put(ItemIDs.minecartFRED.item,
                    new TrainRecord("FRED", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.FRED.class, ItemIDs.minecartFRED.item)
                            .setTrainType("misc")
                            .setMass(0.2)
                            .setColors(new String[] {"Black"})
                            .setGuiRenderScale(0)
                            .setCargoCapacity(1)
                            .setAdditionalTooltip(new String[] {"the least used item in the mod"})
            );

            // BoulderWagon
            put(ItemIDs.minecartBoulderWagon.item,
                    new TrainRecord("BoulderWagon", BoulderWagon.class, ItemIDs.minecartBoulderWagon.item)
                            .setTrainType("freight")
                            .setMass(5)
                            .setColors(new String[]{"Grey","skin16"})
                            .setGuiRenderScale(0)
                            .setCargoCapacity(9)
            );

            //Vehicles//

            // HighrailVan
            put(ItemIDs.minecartHighrailVan.item,
                    new TrainRecord("Highrail Van", DieselHighrailVan.class, ItemIDs.minecartHighrailVan.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(90)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(140)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(1000)
                            .setColors(new String[] {"Yellow", "White", "Grey", "Orange", "Green", "Red"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(2.7)
            );

            // HighrailTruck
            put(ItemIDs.minecartHighrailTruck.item,
                    new TrainRecord("Highrail Truck", DieselHighrailTruck.class, ItemIDs.minecartHighrailTruck.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(90)
                            .setMaxSpeed(80)
                            .setMass(0)
                            .setFuelConsumption(10)
                            .setHeatingTime(140)
                            .setAccelerationRate(0.7)
                            .setBrakeRate(0.8)
                            .setTankCapacity(1000)
                            .setColors(new String[] {"Yellow", "White", "LightGrey"})
                            .setGuiRenderScale(18)
                            .setBogieLocoPosition(2.7)
            );

            // WorkdayHyrail
            put(ItemIDs.minecartWorkdayHyrail.item,
                    new TrainRecord("WorkdayHyrail", DieselWorkdayHyrail.class, ItemIDs.minecartWorkdayHyrail.item)
                            .setTrainType(EnumTrainType.Diesel)
                            .setMHP(110)
                            .setMaxSpeed(115)
                            .setMass(0)
                            .setFuelConsumption(2)
                            .setHeatingTime(10)
                            .setAccelerationRate(0.95)
                            .setBrakeRate(0.8)
                            .setTankCapacity(2000)
                            .setColors(new String[] {"LightGrey", "Grey", "Cyan", "Yellow", "Skin17", "Orange", "Skin18", "Red"})
                            .setGuiRenderScale(20)
                            .setBogieLocoPosition(-2.0)
            );
        }};
    }

}
