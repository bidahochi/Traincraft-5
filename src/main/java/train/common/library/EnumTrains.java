package train.common.library;

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
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.controlcar.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tanker.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart.*;
import net.minecraft.item.Item;
import train.common.core.util.TraincraftUtil;
import train.common.library.register.ITrainRecord;

public enum EnumTrains implements ITrainRecord
{
	/** Heritage*/
	//CF7_H_Angle("CF7_H_Angle", DieselCF7_H_Angle.class, ItemIDs.minecartCF7_H_Angle.item, EnumTrainType.Diesel, 1500, 116, 0, 50,0,200,0.74,0.96,18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Pink", "White", "Purple"}), 16, -2, (new String[] {"Heritage"})),
	//CF7_H_Round("CF7_H_Round", DieselCF7_H_Round.class, ItemIDs.minecartCF7_H_Round.item, EnumTrainType.Diesel, 1500, 116, 0, 50,0,200,0.74,0.96,18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow"}), 16, -2, (new String[] {"Heritage"})),


	/** Fox-TC*/

	//stEAmeeee//
	Climax2("2TruckClimax", SteamClimaxNew.class, ItemIDs.minecartClimaxNew.item, EnumTrainType.Steam, 680,35,0,50,160,120,0.7,0.8,8000, null,15,-1.0),
	VBShay("2TruckVerticalBoilerShay", SteamVBShay2.class, ItemIDs.minecartVBShay2.item, EnumTrainType.Steam, 630,35,0,50,160,120,0.7,0.8,6000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey"}),15,-1.3),
	Skook("Skookum", SteamSkook.class, ItemIDs.minecartSkook.item, EnumTrainType.Steam, 1470, 75, 0, 75, 75, 190, 0.8, 0.91, 2000, null, 10, -2.4),
	SkookTender("Skookum Tender", TenderSkookTender.class, ItemIDs.minecartSkookTender.item,EnumTrainType.Tender,0,0,2,0,0,0,0,0,15000,null,18,0),
	Shay3Truck("3 Truck Shay", SteamShay3Truck.class, ItemIDs.minecartShay3Truck.item, EnumTrainType.Steam, 838, 35, 0, 75, 75, 190, 0.8, 0.9, 4000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "White"}), 15, -1.8),
	Shay3TruckTender("3 Truck Shay Tender", TenderShay3Truck.class, ItemIDs.minecartShay3TruckTender.item,EnumTrainType.Tender,0,0,2,0,0,0,0,0,10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "White"}),22,0),
	ClimaxB("ClimaxB", SteamClimaxB.class, ItemIDs.minecartClimaxB.item, EnumTrainType.Steam, 838, 35, 0, 80, 80, 190, 0.8, 0.9, 9000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "LightGrey", "Cyan"}), 15, -1.8),

	F01("F01", SteamF01.class, ItemIDs.minecartF01.item, EnumTrainType.Steam, 450,65,0,50,160,120,0.7,0.8,9000, TraincraftUtil.getBytesFromColors(new String[] {"Grey"}),16,-1.7),
	P01a("P01a", SteamP01a.class, ItemIDs.minecartP01a.item, EnumTrainType.Steam, 1475, 85, 0, 75, 75, 190, 0.85, 0.8, 4000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Green"}), 18, -1.8),
	VanderbackTender("VanderbackTender", TenderVanderback.class, ItemIDs.minecartVanderbackTender.item,EnumTrainType.Tender,0,0,2,0,0,0,0,0,29000, TraincraftUtil.getBytesFromColors(new String[] {"Grey"}),18,0),
	SquanderbackTender("SquanderbackTender", TenderSquanderback.class, ItemIDs.minecartSquanderbackTender.item,EnumTrainType.Tender,0,0,2.1,0,0,0,0,0,34000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green"}),18,0,(new String[] {" this started life a shitpost but i liked it too much"})),

	BKno2a("BKno2a", SteamBKno2a.class, ItemIDs.minecartBKno2a.item, EnumTrainType.Steam, 1450,80,0,50,160,120,0.7,0.8,15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange"}),18,-1.3,(new String[] {"Place facing forward"})),
	BKno2b("BKno2b", SteamBKno2b.class, ItemIDs.minecartBKno2b.item, EnumTrainType.Steam, 1450,80,0,50,160,120,0.7,0.8,15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange"}),15,-1.2,(new String[] {"Place facing backward"})),
	WCPBuckingBull("WCPBuckingBull", SteamBuckingBull.class, ItemIDs.minecartWCPBuckingBull.item, EnumTrainType.Steam, 2200, 70, 0, 25, 70, 170, 0.78, 0.9, 2000, null, 10, -2.4),
	WCPBaler("WCPBaler", TenderBaler.class, ItemIDs.minecartWCPBaler.item,EnumTrainType.Tender,0,0,3,0,0,0,0,0,15000, null,18,0),
	WCPMacky("WCPMacky", SteamMacky.class, ItemIDs.minecartWCPMacky.item, EnumTrainType.Steam, 2069, 66, 0, 25, 90, 170, 0.66, 0.9, 2000, null, 10, -2.2),

	Alco2102("Alco2102", SteamAlco2102.class, ItemIDs.minecartalco2102.item, EnumTrainType.Steam, 1613, 65, 0, 75, 75, 190, 0.85, 0.8, 17000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 14, -2.4),
	MK60("MK60", SteamMK60.class, ItemIDs.minecartMK60.item, EnumTrainType.Steam, 2765, 98, 0, 75, 75, 190, 0.85, 0.8, 2000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Purple", "Cyan", "Skin22"}), 14, -2.6),
	Tender10k("Tender10k", Tender10k.class, ItemIDs.minecartTender10k.item,EnumTrainType.Tender,0,0,3,0,0,0,0,0,38000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Yellow", "Purple", "Pink", "Skin19", "Skin20", "Skin21", "Skin22"}),18,0),
	TenderDeseret("TenderDeseret", TenderDeseret.class, ItemIDs.minecartTenderDeseret.item,EnumTrainType.Tender,0,0,4,0,0,0,0,0,57000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18"}),18,0),
	HCS_c57("HCS_c57", SteamHCS_c57.class, ItemIDs.minecartHCS_c57.item, EnumTrainType.Steam, 1753, 85, 0, 75, 75, 190, 0.85, 0.8, 2000, TraincraftUtil.getBytesFromColors(new String[] {"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Cyan", "Skin25", "Skin23", "Skin24", "Skin26", "Skin27"}), 14, -2.20),
	HCS_9k_Tender("HCS_9k_Tender", HCS_9k_Tender.class, ItemIDs.minecartHCS_9k_Tender.item,EnumTrainType.Tender,0,0,4,0,0,0,0,0,34000, TraincraftUtil.getBytesFromColors(new String[] {"Skin19","Skin21", "Skin20", "Skin16", "Skin17", "Skin18"}),18,0),
	HotTubTender("HotTubTender", HotTubTender.class, ItemIDs.minecartHotTubTender.item,EnumTrainType.Tender,0,0,3,0,0,0,0,0,41000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Skin16", "Skin17"}),18,0),

	C11("Loco Steam C11", SteamC11.class, ItemIDs.minecartLocoC11.item,EnumTrainType.Steam, 1030, 97, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.0),
	Onion("Onion", SteamOnion.class, ItemIDs.minecartOnion.item, EnumTrainType.Steam, 350,191,0,10,240,190,0.9999,14.99999,8000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}),17,-1.3),
	OnionTender("Onion Tender", TenderOnion.class, ItemIDs.minecartOnionTender.item, EnumTrainType.Tender, 0, 0, 0.1, 0, 0, 0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}), 17, 0),
	NP_L9("NP_L9", SteamNP_L9.class, ItemIDs.minecartNP_L9.item, EnumTrainType.Steam, 1200,65,0,80,180,140,0.7,0.725,3000, TraincraftUtil.getBytesFromColors(new String[] {"Grey"}),16,-1.7),
	NP_11C_Tender("NP_11C_Tender", TenderNP_11C.class, ItemIDs.minecartNP_11C_tender.item,EnumTrainType.Tender,0,0,3.5,0,0,0,0,0,26000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}),18,0),
	NP_13C_Tender("NP_13C_Tender", TenderNP_13C.class, ItemIDs.minecartNP_13C_tender.item,EnumTrainType.Tender,0,0,3.75,0,0,0,0,0,31000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}),18,0),
	Alco460("Alco460", SteamAlco460.class, ItemIDs.minecartAlco460.item, EnumTrainType.Steam, 973,110,0,90,130,160,0.7,0.75,3000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Red", "Yellow", "Skin17", "Skin18"}),16,-1.8),
	Tender460("Tender460", Tender460.class, ItemIDs.minecartTender460.item,EnumTrainType.Tender,0,0,3,0,0,0,0,0,26000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Red", "Yellow", "Skin17"}),18,0),

	PELoco("Loco Steam PELoco", SteamPELoco.class, ItemIDs.minecartPELocomotive.item,EnumTrainType.Steam, 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	PETender("Tender PETender",TenderPETender.class, ItemIDs.minecartPETender.item,EnumTrainType.Tender,0,0,1.5,0,0,0,0,0,20000,null,18,0),
	PMNstender("PMNstender",TenderPMNstender.class, ItemIDs.minecartPMNstender.item,EnumTrainType.Tender,0,0,1.5,0,0,0,0,0,83000,TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Yellow", "Orange", "White"}),15,0),
	PMNandN1("PMNandN1", SteamPMNandN1.class, ItemIDs.minecartPMNandN1.item,EnumTrainType.Steam, 3000, 113, 0, 80, 100, 200, 0.65, 0.6, 6000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Yellow", "Grey", "Orange", "White"}), 12, -3.6 ),

	Alco0_6_0T("Alco0-6-0T", SteamAlco0_6_0T.class, ItemIDs.minecartAlco0_6_0T.item, EnumTrainType.Steam, 360,50,0,50,160,120,0.7,0.8,8000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Purple"}),15,-1.2),
	Brank("Brank2-6-2T", SteamBrank.class, ItemIDs.minecartBrank.item, EnumTrainType.Steam, 360,50,0,50,160,120,0.7,0.8,8000, TraincraftUtil.getBytesFromColors(new String[] {"Green"}),17,-1.0),
	Lima2_8_0("Lima2-8-0", SteamLima2_8_0.class, ItemIDs.minecartLima2_8_0.item, EnumTrainType.Steam, 1250,65,0,90,130,160,0.7,0.75,3000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Lime", "Grey", "Yellow", "Red"}),16,-1.65),
	TenderLima2_8_0("TenderLima2_8_0", TenderLima2_8_0.class, ItemIDs.minecartTenderLima2_8_0.item,EnumTrainType.Tender,0,0,3,0,0,0,0,0,26000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Yellow", "Red"}),18,0),

	//EMD//
	F3A("F3A", DieselF3A.class, ItemIDs.minecartF3A.item, EnumTrainType.Diesel, 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan", "Skin31", "Skin17", "Magenta", "Skin16", "Red", "Black", "Yellow", "Grey", "Orange", "White", "Pink", "Blue", "Purple", "LightBlue", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin32", "Skin33"}), 18, -2.6),
	F3B("F3B", DieselF3B.class, ItemIDs.minecartF3B.item, EnumTrainType.Diesel, 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan", "Skin31", "Skin17", "Black", "Yellow", "Grey", "Orange", "LightBlue", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}), 18, -2.4),
	F7A("F7A", DieselF7A.class, ItemIDs.minecartF7A.item, EnumTrainType.Diesel, 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin17", "Magenta", "Yellow", "Grey", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Red", "Pink", "LightGrey", "White", "Skin34", "Skin35", "Skin36", "Skin37","Skin38"}), 18, -2.6),
	F7B("F7B", DieselF7B.class, ItemIDs.minecartF7B.item, EnumTrainType.Diesel, 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin17", "Magenta", "Yellow", "Grey", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Red", "LightGrey", "Skin34", "Skin36", "Skin37","Skin38"}), 18, -2.4),
	F9A("F9A", DieselF9A.class, ItemIDs.minecartF9A.item, EnumTrainType.Diesel, 1750, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Cyan", "Skin20", "Brown", "Black", "Yellow", "Grey", "Orange", "Skin17", "Skin18", "Skin19"}), 18, -2.6),
	F9B("F9B", DieselF9B.class, ItemIDs.minecartF9B.item, EnumTrainType.Diesel, 1750, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan", "Skin20", "Yellow", "Grey", "Orange", "Skin16"}), 18, -2.4),
	FP7A("FP7A", DieselFP7A.class, ItemIDs.minecartFP7A.item, EnumTrainType.Diesel, 1500, 192, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Skin16", "Orange", "Skin17", "Cyan", "Purple"}), 16, -2.70),
	FP9A("FP9A", DieselFP9A.class, ItemIDs.minecartFP9A.item, EnumTrainType.Diesel, 1750, 169, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Blue"}), 16, -2.70),

	CF7angle("CF7angle", DieselCF7angle.class, ItemIDs.minecartCF7angle.item, EnumTrainType.Diesel, 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Skin29", "Red", "Green", "Brown", "Skin16", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Black", "Magenta", "Purple", "LightBlue", "Skin27", "Skin33", "Skin34", "Skin38"}), 15, -2.5),
	CF7round("CF7round", DieselCF7round.class, ItemIDs.minecartCF7round.item, EnumTrainType.Diesel, 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Skin18", "Grey"}), 15, -2.5),
	CF7round3("CF7round3", DieselCF7round3.class, ItemIDs.minecartCF7round3.item, EnumTrainType.Diesel, 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Skin19", "White", "LightBlue", "Skin20", "Skin24", "Lime", "Skin17", "Skin16"}), 15, -2.5),
	CF7angle2("CF7angle2", DieselCF7angle2.class, ItemIDs.minecartCF7angle2.item, EnumTrainType.Diesel, 1470, 90, 0, 15, 0, 200, 0.6, 0.9, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Skin16", "Green", "White", "Skin17", "Cyan"}), 15, -2.5),
	CF7angle3("CF7angle3", DieselCF7angle3.class, ItemIDs.minecartCF7angle3.item, EnumTrainType.Diesel, 1500, 116, 0, 25, 0, 200, 0.825, 0.8, 10000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Green", "Skin20", "Grey", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Brown", "Skin26", "Purple", "Lime", "LightGrey", "Pink", "Skin27", "Skin28"}), 15, -2.5),
	CF7b("CF7b", DieselCF7b.class, ItemIDs.minecartCF7b.item, EnumTrainType.Diesel, 1500, 116, 0, 25, 0, 200, 0.825, 0.8, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan"}), 15, -2.5),
	CF7hh("CF7hh", DieselCF7hh.class, ItemIDs.minecartCF7hh.item, EnumTrainType.Diesel, 1500, 120, 0, 20, 0, 200, 0.6, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Lime"}), 15, -2.5),
	F40PH("F40PH", DieselF40PH.class, ItemIDs.minecartF40PH.item, EnumTrainType.Diesel, 3000, 103, 0, 20, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Red", "Yellow"}), 14, -3.5),

	E7A("E7A", DieselE7A.class, ItemIDs.minecartE7A.item, EnumTrainType.Diesel, 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Cyan", "Skin43", "Green", "Lime", "Brown", "Black", "Orange", "Blue", "LightBlue", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin42", "Skin37" ,"Skin41", "Skin38", "Skin39", "Skin40"}), 12, -3.65),
	E7B("E7B", DieselE7B.class, ItemIDs.minecartE7B.item, EnumTrainType.Diesel, 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Orange", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "Skin27", "Skin37", "Black", "Skin28", "Skin29"}), 12, -3.77),
	E8A("E8A", DieselE8A.class, ItemIDs.minecartE8A.item, EnumTrainType.Diesel, 2250, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Purple", "Cyan", "Blue", "Brown", "Red", "Pink", "Skin21", "Yellow", "Lime", "Grey", "LightGrey", "White", "Green", "LightBlue", "Black", "Magenta", "Skin17", "Skin18", "Skin19", "Skin20"}), 12, -3.65),
	E8B("E8B", DieselE8B.class, ItemIDs.minecartE8B.item, EnumTrainType.Diesel, 2250, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Red", "Grey", "LightGrey"}), 12, -3.77),
	E9A("E9A", DieselE9A.class, ItemIDs.minecartE9A.item, EnumTrainType.Diesel, 2400, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Skin16"}), 12, -3.75),
	E9B("E9B", DieselE9B.class, ItemIDs.minecartE9B.item, EnumTrainType.Diesel, 2400, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 12, -3.6875),
	CE8("CE8", DieselCE8.class, ItemIDs.minecartCE8.item, EnumTrainType.Diesel, 2250, 116, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Brown", "LightGrey"}), 12, -3.65),

	GP7("GP7", DieselGP7.class, ItemIDs.minecartGP7.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Green", "Black", "Skin26", "Skin19", "LightGrey", "Skin20", "Skin21", "Lime", "Purple", "Blue", "Skin25", "Skin16", "Skin17", "Skin18", "Skin59", "Grey", "Orange", "Pink", "Skin35", "Skin36", "Skin37", "Skin38", "Skin22", "Brown", "Skin23", "LightBlue", "Skin24", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Red", "Magenta", "Skin46", "Skin47", "Skin48", "Skin49", "Skin50", "Skin51", "Skin52", "Skin53", "Skin54", "Skin55", "Skin56", "Skin57", "Skin58", "Skin60"}), 16, -2.9),
	GP7b("GP7b", DieselGP7b.class, ItemIDs.minecartGP7b.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "White"}), 16, -2.9),
	GP7u("GP7u",DieselGP7u.class, ItemIDs.minecartGP7u.item, EnumTrainType.Diesel, 1500, 100, 0, 25, 0, 200, 0.65, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "LightGrey", "White", "Skin16", "Grey", "Green", "Cyan", "Skin17"}), 16, -2.9),
	GP7f("GP7f", DieselGP7f.class, ItemIDs.minecartGP7f.item, EnumTrainType.Diesel, 1800, 100, 0, 25, 0, 200, 0.85, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Blue", "Skin16", "LightGrey", "Skin17", "Skin18"}), 16, -2.9),
	GPFDL("GPFDL", DieselGPFDL.class, ItemIDs.minecartGPFDL.item, EnumTrainType.Diesel, 2250, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan","LightGrey", "Skin16", "Green"}), 16, -2.9),
	GP9("GP9", DieselGP9.class, ItemIDs.minecartGP9.item, EnumTrainType.Diesel, 1750, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Black", "Skin21", "Orange", "Skin25", "White", "Skin18", "Skin16", "Skin17", "LightGrey", "Skin19", "Skin20", "Pink", "Magenta", "Skin35", "Skin36", "Skin37", "LightBlue", "Skin23", "Brown", "Skin26", "Skin31", "Skin28", "Skin29", "Skin30", "Skin33", "Skin34", "Skin38", "Yellow", "Blue", "Skin39", "Skin40", "Purple", "Lime", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Skin46", "Skin47", "Skin48", "Skin49", "Skin50", "Red", "Skin51", "Skin52", "Skin53", "Skin22", "Skin24", "Skin27", "Skin54", "Skin55"}), 16, -2.9),
	GP9b("GP9b", DieselGP9b.class, ItemIDs.minecartGP9b.item, EnumTrainType.Diesel, 1750, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Black", "Grey"}), 16, -2.9),
	GP13("GP13", DieselGP13.class, ItemIDs.minecartGP13.item, EnumTrainType.Diesel, 2510,90,0,25,0,200,0.74,0.85,15000, TraincraftUtil.getBytesFromColors(new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Blue", "LightBlue", "Black", "Orange", "White", "Yellow", "Cyan"}), 18, 1.4, (new String[] {"Uses the heritage GP40 Model"})),
	GP15("GP15", DieselGP15.class, ItemIDs.minecartGP15.item, EnumTrainType.Diesel, 1500, 105, 0, 15, 0, 200, 0.85, 0.85, 15000, TraincraftUtil.getBytesFromColors(new  String[] {"Yellow", "LightGrey", "LightBlue", "Skin26", "Skin16", "Blue", "Skin17", "Skin21", "Skin18", "Skin19", "Skin20", "Skin22"}), 16, -2.6),
	GP15T("GP15T", DieselGP15T.class, ItemIDs.minecartGP15T.item, EnumTrainType.Diesel, 1500, 105, 0, 15, 0, 200, 0.85, 0.85, 15000, TraincraftUtil.getBytesFromColors(new  String[] {"Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32"}), 16, -2.6),
	GP18("GP18", DieselGP18.class, ItemIDs.minecartGP18.item, EnumTrainType.Diesel, 1800, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Blue", "Pink", "Skin16", "Skin17", "Purple", "Skin18", "Skin19", "LightGrey", "Skin20", "Skin21"}), 16, -2.9),
	GP20("GP20", DieselGP20.class, ItemIDs.minecartGP20.item, EnumTrainType.Diesel, 2000, 105, 0, 30, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey","Orange","Yellow","Skin25","Red","Skin24","Black","Blue","Green","Skin21","Skin22","LightBlue","Skin23","Skin17","Skin18","Skin19","Skin20"}), 16, -2.9),
	GP30("GP30", DieselGP30.class, ItemIDs.minecartGP30.item, EnumTrainType.Diesel, 2250, 134, 0, 30, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Black", "Blue", "Skin23", "Skin24", "LightBlue", "Grey", "Skin17", "Yellow", "Green", "Skin18", "Skin16", "Purple", "Pink", "Red", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22", "Magenta", "Lime", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29"}), 15, -2.9),
	GP35("GP35", DieselGP35.class, ItemIDs.minecartGP35.item, EnumTrainType.Diesel, 2500, 105, 0, 25, 0, 190, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new  String[] {"Red", "Skin19", "Black", "Magenta", "Skin16", "Grey", "Skin17", "LightBlue", "LightGrey", "Skin18", "Pink", "Yellow", "Purple", "Lime", "Cyan", "Skin20", "Skin21", "White", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Green", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin37", "Brown", "Skin36", "Skin38", "Skin39", "Skin40"}), 15, -2.9),
	GP38dash9W("GP38dash9W", DieselGP38dash9W.class, ItemIDs.minecartGP38dash9W.item, EnumTrainType.Diesel, 2000, 105, 0, 45, 0, 200, 0.5, 0.85, 10000, null, 14, -3.2),
	GP38H3("GP38H3", DieselGP38H3.class, ItemIDs.minecartGP38h3.item, EnumTrainType.Diesel, 2000, 169, 0, 25, 0, 200, 0.8, 0.85, 16000, TraincraftUtil.getBytesFromColors(new  String[] {"White", "Blue"}), 14, -3.25),
	GP38("GP38", DieselGP38.class, ItemIDs.minecartGP38.item, EnumTrainType.Diesel, 2000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"LightGrey", "Cyan", "Grey", "Skin18", "Skin26", "Skin21", "Skin22", "Skin23", "Skin24", "Magenta", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Red", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41"}), 14, -2.9),
	GP38Dash2("GP38Dash2", DieselGP38dash2.class, ItemIDs.minecartGP38dash2.item, EnumTrainType.Diesel, 2000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Yellow", "Green", "Skin16", "Black", "Skin17", "Skin19", "Skin20", "Orange", "Skin25", "Skin29", "Skin30", "Skin31", "Blue", "LightBlue"}), 14, -3.1),
	GP39("GP39", DieselGP39.class, ItemIDs.minecartGP39.item, EnumTrainType.Diesel, 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green", "Grey", "Blue", "Skin38", "Skin39"}), 14, -2.9),
	GP39Dash2("GP39Dash2", DieselGP39Dash2.class, ItemIDs.minecartGP39Dash2.item, EnumTrainType.Diesel, 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green", "Skin16", "Skin18", "Skin19", "LightBlue"}), 14, -2.9),
	GP39TDash2("GP39TDash2", DieselGP39TDash2.class, ItemIDs.minecartGP39TDash2.item, EnumTrainType.Diesel, 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green"}), 14, -2.9),
	GP39TDash2B("GP39TDash2B", DieselGP39TDash2B.class, ItemIDs.minecartGP39TDash2B.item, EnumTrainType.Diesel, 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green"}), 14, -2.9),
	GP40("GP40", DieselGP40.class, ItemIDs.minecartGP40.item, EnumTrainType.Diesel, 3000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Pink", "Red", "Skin20", "Grey", "Orange", "Skin21", "Skin22", "Green", "Magenta", "Skin19", "Skin23", "Skin24", "Skin25", "Skin28", "Skin30", "Skin32", "Skin33", "Skin34", "Cyan", "Skin35", "Lime", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43"}), 14, -2.9),
	GP40Dash2("GP40Dash2", DieselGP40Dash2.class, ItemIDs.minecartGP40Dash2.item, EnumTrainType.Diesel, 3000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Skin31", "Skin16", "Skin17", "Skin27", "Lime", "White", "Skin18", "LightGrey", "Black", "Skin26", "Skin29", "Grey", "Blue", "LightBlue", "Skin32", "Skin42"}), 14, -2.9),
	GP40TC("GP40TC", DieselGP40TC.class, ItemIDs.minecartGP40tc.item, EnumTrainType.Diesel, 3000, 169, 0, 25, 0, 200, 0.8, 0.85, 16000, TraincraftUtil.getBytesFromColors(new  String[] {"Blue", "White"}), 14, -3.25),
	GP49("GP49", DieselGP49.class, ItemIDs.minecartGP49.item, EnumTrainType.Diesel, 2800, 105, 0, 35, 0, 200, 0.65, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Blue", "LightGrey", "Purple"}), 14, -3.1),

	SD9("SD9", DieselSD9.class, ItemIDs.minecartSD9.item, EnumTrainType.Diesel, 1750, 104, 0, 35, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Orange", "Skin17", "Cyan", "LightGrey", "Skin18", "Yellow", "Magenta", "Skin19", "Skin20", "Pink", "Skin21", "Skin22"}), 14, -3.05),
	SD38("SD38", DieselSD38.class, ItemIDs.minecartSD38.item, EnumTrainType.Diesel, 2000, 105, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "LightBlue", "Blue", "Skin16", "Cyan", "Skin17", "Black", "Skin18", "Grey", "Skin20", "Skin21", "Skin19"}), 12, -3.45),
	SD39("SD39", DieselSD39.class, ItemIDs.minecartSD39.item, EnumTrainType.Diesel, 2300, 105, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "LightGrey", "Brown", "Skin18", "Skin19", "Skin20", "Cyan", "Purple"}), 12, -3.45),
	SDL39("SDL39", DieselSDL39.class, ItemIDs.minecartSDL39.item, EnumTrainType.Diesel, 2300, 152, 0, 5, 0, 200, 0.75, 0.85, 7000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Pink", "Magenta", "Red", "Skin16", "Skin17"}), 14, -2.9),
	SD40("SD40", DieselSD40.class, ItemIDs.minecartSD40.item, EnumTrainType.Diesel, 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Skin16", "Red", "Skin17", "Cyan", "Black", "Skin18", "Skin20", "Skin21", "Skin22", "Grey", "Skin23", "Skin41", "Skin42", "Skin43"}), 12, -3.45),
	SD40dash2("SD40-2", DieselSD40dash2.class, ItemIDs.minecartSD40dash2.item, EnumTrainType.Diesel, 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Green", "White", "Skin18", "Yellow", "Orange", "Skin20", "Purple", "Skin21", "LightBlue", "Red", "Pink", "Black", "Skin22", "Skin23", "Skin16", "Skin17", "Skin19", "Brown", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Lime", "Grey", "Skin39", "Skin40", "Skin41", "Skin42"}), 12, -3.45),
	SD40T2("SD40T-2", DieselSD40T2.class, ItemIDs.minecartSD40T2.item, EnumTrainType.Diesel, 3000, 105, 0, 10, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Red", "Skin17", "Yellow", "Magenta", "Blue", "LightGrey", "LightBlue", "Skin16", "Skin18", "Green", "White", "Cyan", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"}), 12, -3.45),
	SD40dash2B("SD40-2B", DieselSD40dash2B.class, ItemIDs.minecartSD40dash2B.item, EnumTrainType.Diesel, 3000, 105, 0, 5, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red"}), 12, -3.8),
	SD40R("SD40R", DieselSD40R.class, ItemIDs.minecartSD40R.item, EnumTrainType.Diesel, 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Skin16", "Skin17"}), 12, -3.45),
	SD40A("SD40A", DieselSD40A.class, ItemIDs.minecartSD40A.item, EnumTrainType.Diesel, 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Black", "Skin17", "Orange", "Grey"}), 12, -3.45),
	SDP40("SDP40", DieselSDP40.class, ItemIDs.minecartSDP40.item, EnumTrainType.Diesel, 3000, 160, 0, 5, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Skin17", "Grey", "LightGrey", "Skin18", "Purple", "Blue", "Orange", "Skin19"}), 12, -3.45),
	SDP40F("SDP40F",DieselSDP40F.class, ItemIDs.minecartSDP40F.item, EnumTrainType.Diesel, 3000, 160, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "White", "LightGrey", "Grey", "Yellow"}), 12, -3.95),
	SD40dash3("SD40-3", DieselSD40dash3.class, ItemIDs.minecartSD40dash3.item, EnumTrainType.Diesel, 3000, 113, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Orange"}), 12, -3.45),
	SD45("SD45", DieselSD45dash2.class, ItemIDs.minecartSD45dash2.item, EnumTrainType.Diesel, 3600, 132, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue","Skin16","Green","Pink","Grey","Black","Skin17","Skin18","Orange","Skin19","Yellow","Skin20","Red","Skin21","Skin22","Skin23","Skin24","Skin25","Skin26","LightGrey","Skin27","Skin28", "Skin29", "Skin30", "Purple", "Skin31", "Skin32"}), 12, -3.45),
	SD45dash2B("SD45-2B", DieselSD45dash2B.class, ItemIDs.minecartSD45dash2B.item, EnumTrainType.Diesel, 3600, 132, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Red", "White"}), 12, -3.8),
	SDP45("SDP45", DieselSDP45.class, ItemIDs.minecartSDP45.item, EnumTrainType.Diesel, 3600, 160, 0, 20, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Blue", "Green", "Skin16", "Purple", "Pink"}), 12, -3.45),
	FP45("FP45",DieselFP45.class, ItemIDs.minecartFP45.item, EnumTrainType.Diesel, 3600, 145, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Yellow", "LightGrey", "Grey"}), 12, -3.95),
	F45("F45",DieselF45.class, ItemIDs.minecartF45.item, EnumTrainType.Diesel, 3600, 145, 0, 10, 0, 200, 0.75, 0.58, 16000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Green", "Blue", "Yellow", "Red"}), 12, -3.65),
	SD50("SD50", DieselSD50.class, ItemIDs.minecartSD50.item, EnumTrainType.Diesel, 3600, 142, 0, 20, 0, 200, 0.75, 0.85, 23000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Pink", "Blue", "LightBlue", "Brown", "Black", "White", "LightGrey", "Green", "Cyan", "Grey", "Yellow"}), 12, -3.725),
	SD60("SD60", DieselSD60.class, ItemIDs.minecartSD60.item, EnumTrainType.Diesel, 3800, 113, 0, 20, 0, 200, 0.75, 0.85, 23000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Red", "Yellow", "Brown", "LightBlue", "LightGrey", "Purple", "Green", "Lime", "Skin18", "Skin19", "Skin20", "White", "Skin17"}), 12, -3.725),
	SD70Mac("SD70Mac", DieselSD70Mac.class, ItemIDs.minecartSD70Mac.item, EnumTrainType.Diesel, 4000, 112, 0, 10, 0, 200, 0.7, 0.85, 20000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Grey", "LightGrey", "LightBlue", "Yellow", "Black","Green", "Orange", "Lime", "Pink", "Magenta", "Brown", "Cyan"}), 12, -4),
	SD70ACe("SD70ACe", DieselSD70ACe.class, ItemIDs.minecartSD70ACe.item, EnumTrainType.Diesel, 4300, 110, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Blue", "LightBlue", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Black", "Skin27", "Skin28", "Skin29"}), 12, -4.0),
	SD70ACe_H("SD70ACe_H", DieselSD70ACe_H.class, ItemIDs.minecartSD70ACe_H.item, EnumTrainType.Diesel, 4300, 110, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Skin16", "Purple", "Grey", "Yellow", "Green", "Orange", "White", "Blue", "Lime", "Black", "LightGrey"}), 12, -4.0),

	SW1("SW1", DieselSW1.class, ItemIDs.minecartSW1.item, EnumTrainType.Diesel, 600, 105, 0, 35, 0, 160, 0.6, 0.890, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Green", "Skin22", "LightBlue", "Skin16", "Black", "Skin17", "Pink", "Purple", "Skin18", "Skin19", "Lime", "Skin20", "Skin21", "Skin23", "Skin24", "Skin25", "Skin26", "Cyan", "Skin27", "Skin28", "Skin29"}), 16, -2),
	SW8("SW8", DieselSW8.class, ItemIDs.minecartSW8.item, EnumTrainType.Diesel, 800, 105, 0, 35, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20" }), 16, -2.0),
	SW9("SW9", DieselSW9.class, ItemIDs.minecartSW9.item, EnumTrainType.Diesel, 1200, 105, 0, 35, 0, 180, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green", "Cyan", "Blue", "Magenta"}), 16, -2),
	SW10("SW10", DieselSW10.class, ItemIDs.minecartSW10.item, EnumTrainType.Diesel, 1200, 81, 0, 45, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "LightGrey", "Cyan", "Skin16", "Skin17", "Skin18", "Purple", "Orange"}), 16, -2.0),
	SW900("SW900", DieselSW900.class, ItemIDs.minecartSW900.item, EnumTrainType.Diesel, 900, 105, 0, 35, 0, 180, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "LightBlue", "White", "LightGrey", "Magenta", "Skin16", "Skin17", "Purple", "Skin18", "Blue", "Orange", "Skin19", "Pink"}), 16, -2),
	SW1000("SW1000", DieselSW1000.class, ItemIDs.minecartSW1000.item, EnumTrainType.Diesel, 1000, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "Purple", "Yellow", "Skin16", "Skin19", "Skin20", "Magenta", "Skin21", "Skin22", "Brown"}), 16, -2),
	SW1200("SW1200", DieselSW1200.class, ItemIDs.minecartSW1200.item, EnumTrainType.Diesel, 1200, 105, 0, 25, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Green", "Black", "Grey", "Yellow", "Pink", "Orange", "Blue", "Purple", "Magenta", "Brown", "LightGrey", "Skin17", "Skin18"}), 16, -2),
	SW1500("SW1500", DieselSW1500.class, ItemIDs.minecartSW1500.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "LightGrey", "Grey", "Purple", "Black", "Magenta", "Pink", "Cyan", "Skin18", "Orange", "Skin16", "Blue", "Skin17", "Green", "Skin24", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Red", "Lime", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"}), 16, -2),
	SW1600("SW1600", DieselSW1600.class, ItemIDs.minecartSW1600.item, EnumTrainType.Diesel, 1600, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 16, -2),
	MP900("MP900", DieselMP900.class, ItemIDs.minecartMP900.item, EnumTrainType.Diesel, 950, 81, 0, 45, 0, 200, 0.95, 0.65, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Cyan"}), 16, -2),
	MP15DCW9("MP15DCW9", DieselMP15DCW9.class, ItemIDs.minecartMP15DCW9.item, EnumTrainType.Diesel, 1500, 97, 0, 0, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Skin16", "White"}), 16, -2.3),

	TR4("TR4", DieselTR4.class, ItemIDs.minecartTR4.item, EnumTrainType.Diesel, 1200, 105, 0, 25, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Orange", "Purple", "Cyan", "Magenta", "LightGrey"}), 16, -2),
	TR4B("TR4B", DieselTR4B.class, ItemIDs.minecartTR4B.item, EnumTrainType.Diesel, 1200, 105, 0, 25, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Orange", "Purple", "Cyan", "Magenta", "LightGrey"}), 16, -2),

	Beep("Beep", DieselBeep.class, ItemIDs.minecartBeep.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.89, 0.8, 9000, null, 10, -2.2),

	//GE//
	GE44Ton("GE 44-ton", DieselGE44Ton.class, ItemIDs.minecart44Ton.item, EnumTrainType.Diesel, 360, 56, 0, 10, 0, 200, 0.7, 0.75, 7000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Pink", "LightGrey", "Skin16", "Black", "Skin17", "Skin18", "Magenta", "Purple", "Skin19", "Red", "Skin20", "Skin21", "Skin22"}), 18, -2.0),
	Boxcab23Ton("23 Ton Boxcab", DieselBoxcab23Ton.class, ItemIDs.minecartBoxcab23Ton.item, EnumTrainType.Diesel, 150, 40, 0, 10, 0, 200, 0.6, 0.6, 4000,  TraincraftUtil.getBytesFromColors(new String[] {"Blue", "White", "Black", "Green"}), 16, -1.5),
	//note on the boxcab: check the RenderEnum for more info related to its hitboxes
	GE25Ton("GE 25-ton", DieselGE25Ton.class, ItemIDs.minecart25Ton.item, EnumTrainType.Diesel, 150, 50, 0, 10, 0, 200, 0.65, 0.7, 4000, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Pink", "Cyan", "Orange", "Green"}), 20, -1),

	U18B("U18B", DieselU18B.class, ItemIDs.minecartU18B.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Orange","Skin16", "Red", "Skin17", "LightGrey", "Pink", "Magenta", "Purple", "Lime", "Yellow", "Grey", "Skin18", "Skin19", "Black", "Skin20", "Skin22", "Brown", "LightBlue", "Blue", "Skin23", "Skin24", "Skin25", "Skin26"}), 16, -2.5),
	U18BB("U18BB", DieselU18BB.class, ItemIDs.minecartU18BB.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Skin27"}), 16, -2.5),
	U18BW("U18BW", DieselU18BW.class, ItemIDs.minecartU18BW.item, EnumTrainType.Diesel, 1800, 120, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "White", "Orange", "Grey", "Lime"}), 16, -2.5),
	U18Balt("U18Balt", DieselU18Balt.class, ItemIDs.minecartU18Balt.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Cyan", "White", "LightGrey", "Skin16", "Skin17", "Skin18", "Lime", "Skin19", "Skin22", "Skin23", "Skin24", "Skin25", "Skin21", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30"}), 16, -2.6),
	U18BWH("U18BWH", DieselU18BWH.class, ItemIDs.minecartU18BWH.item, EnumTrainType.Diesel, 1800, 188, 0, 25, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Pink", "LightGrey", "Purple"}), 14, -3.1),
	U23B("U23B", DieselU23B.class, ItemIDs.minecartU23B.item, EnumTrainType.Diesel, 2250, 113, 0, 25, 0, 180, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Grey", "LightBlue", "LightGrey", "Skin17", "Skin21", "Skin22", "Blue", "Skin25", "Magenta", "Black", "Pink", "Green", "Skin18", "Skin20", "Skin24", "Skin26", "Skin27", "Skin28", "Orange", "Skin19", "Skin29", "Skin30", "Red", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin23", "Skin38"}), 14, -3.1),
	U23BU("U23BU", DieselU23BU.class, ItemIDs.minecartU23BU.item, EnumTrainType.Diesel, 2250, 113, 0, 30, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Skin16", "Skin17", "White", "Skin18", "LightBlue", "Skin19", "Yellow", "Skin20", "Blue", "Purple", "Pink"}), 14, -3.1),
	U23BW("U23BW", DieselU23BW.class, ItemIDs.minecartU23BW.item, EnumTrainType.Diesel, 2250, 113, 0, 30, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 14, -3.1),
	SF30B("SF30B", DieselSF30B.class, ItemIDs.minecartSF30B.item, EnumTrainType.Diesel, 3000, 113, 0, 30, 0, 160, 0.75, 0.86, 25000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Brown", "Skin16", "Blue", "Yellow", "LightBlue", "Orange", "Cyan", "Red"}), 14, -3.1),
	U25B("U25B", DieselU25B.class, ItemIDs.minecartU25B.item, EnumTrainType.Diesel, 2500, 113, 0, 25, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Skin18", "Blue", "Orange", "Pink", "Green", "Skin16", "Red", "Skin17", "Skin19", "Skin20", "Skin21", "Brown"}), 14, -3.3),
	U30BH("U30BH", DieselU30BH.class, ItemIDs.minecartU30BH.item, EnumTrainType.Diesel, 2950, 188, 0, 35, 0, 180, 0.8, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "LightGrey", "Purple", "Skin17", "Skin18", "Skin19"}), 14, -3.1),
	U36B("U36B", DieselU36B.class, ItemIDs.minecartU36B.item, EnumTrainType.Diesel, 3600, 121, 0, 20, 0, 180, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Blue", "Grey", "LightGrey", "Skin19", "Skin20", "Skin21", "Skin22", "LightBlue", "Green", "Skin16", "Skin17"}), 14, -3.1),
	U23C("U23C", DieselU23C.class, ItemIDs.minecartU23C.item, EnumTrainType.Diesel, 2250, 113, 0, 25, 0, 200, 0.7, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Skin17", "LightGrey", "Blue", "Skin24"}), 12, -3.3),
	U30C("U30C", DieselU30C.class, ItemIDs.minecartU30C.item, EnumTrainType.Diesel, 3000, 113, 0, 20, 0, 200, 0.7, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "Cyan", "Grey", "Skin17", "Skin18", "Lime", "Orange", "Skin19", "Skin20", "Yellow", "Skin21", "Skin22", "Skin23", "Skin24" }), 12, -3.3),
	SF30C("SF30C", DieselSF30C.class, ItemIDs.minecartSF30C.item, EnumTrainType.Diesel, 3000, 121, 0, 20, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red"}), 12, -4.3),
	U36C("U36C", DieselU36C.class, ItemIDs.minecartU36C.item, EnumTrainType.Diesel, 3600, 113, 0, 20, 0, 200, 0.75, 0.84, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Blue", "Red", "Yellow", "Orange", "Cyan"}), 12, -3.75),
	U50("U50", DieselU50.class, ItemIDs.minecartU50.item, EnumTrainType.Diesel, 5000, 110, 0, 10, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "LightGrey", "Skin16", "Skin17", "Black", "Skin18"}), 10, -4.35),
	U56("U56", DieselU56.class, ItemIDs.minecartU56.item, EnumTrainType.Diesel, 5600, 110, 0, 10, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Cyan", "Skin16"}), 10, -4.35),

	SB18R("SB18R", DieselSB18R.class, ItemIDs.minecartSB18R.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green", "Skin17", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"}), 16, -2.6),
	SB18E("SB18E", DieselSB18E.class, ItemIDs.minecartSB18E.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Blue", "Green", "Skin17", "Skin20", "Skin21", "Skin22"}), 16, -2.6),
	SB18B("SB18B", DieselSB18B.class, ItemIDs.minecartSB18B.item, EnumTrainType.Diesel, 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Skin20", "Skin21", "Skin22", "Skin23"}), 16, -2.6),
	B23("B23-7", DieselB23.class, ItemIDs.minecartB23.item, EnumTrainType.Diesel, 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Skin17", "Cyan", "Skin16", "Magenta", "Purple", "Skin20", "Pink", "LightBlue", "Black", "LightGrey", "Brown", "Skin18", "Blue", "Yellow", "Skin19", "Skin21", "Green", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin29", "Orange", "Skin27", "Skin28", "Skin32", "Skin33", "Skin35", "Skin36", "Skin37"}), 14, -3.1),
	B23_wrx("B23-7_wrx", DieselB23_wrx.class, ItemIDs.minecartB23_wrx.item, EnumTrainType.Diesel, 2250, 101, 0, 23, 0, 185, 0.84, 0.92, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Skin16", "Skin17"}), 14, -3.1),
	B23S7("B23-S7", DieselB23S7.class, ItemIDs.minecartB23S7.item, EnumTrainType.Diesel, 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Skin17", "LightGrey", "Cyan", "Green", "Skin18", "Blue"}), 14, -3.1),
	BQ23("BQ23-7", DieselBQ23.class, ItemIDs.minecartBQ23.item, EnumTrainType.Diesel, 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Red", "Skin17", "LightGrey", "Skin18", "LightBlue", "Pink", "Skin16", "Cyan"}), 14, -3.1),
	SB23R("SB23R", DieselSB23R.class, ItemIDs.minecartSB23R.item, EnumTrainType.Diesel, 2300, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Cyan", "Magenta", "LightGrey"}), 14, -3.1),
	SB23E("SB23E", DieselSB23E.class, ItemIDs.minecartSB23E.item, EnumTrainType.Diesel, 2300, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Cyan", "LightGrey", "Blue", "Magenta"}), 14, -3.1),
	B30("B30-7", DieselB30.class, ItemIDs.minecartB30.item, EnumTrainType.Diesel, 3000, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin34", "Skin31", "Blue", "Skin38", "Skin36", "Skin35", "Skin37", "Skin42" }), 14, -3.1),
	B36("B36-7", DieselB36.class, ItemIDs.minecartB36.item, EnumTrainType.Diesel, 3600, 113, 0, 20, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin30", "Skin31", "Skin40", "Skin38", "Skin41", "Skin36", "Skin39", "Lime", "Skin16"}), 14, -3.1),
	SB36X("SB36X", DieselSB36X.class, ItemIDs.minecartSB36X.item, EnumTrainType.Diesel, 3600, 113, 0, 15, 0, 200, 0.54, 0.96, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightBlue", "Cyan", "Purple", "Green", "Orange", "Pink", "Red", "Magenta", "Yellow", "White"}), 14, -3.1),

	Dash818BE("Dash818BE", DieselDash818BE.class, ItemIDs.minecartDash818BE.item, EnumTrainType.Diesel, 1850, 113, 0, 50, 0, 180, 0.8, 0.75, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 14, -3.1),
	Dash832BWH("Dash832BWH", DieselDash832BWH.class, ItemIDs.minecartDash832BWH.item, EnumTrainType.Diesel, 3200, 166, 0, 20, 0, 200, 0.85, 0.9, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Blue", "Orange", "Skin16"}), 12, -3.6),
	Dash839C("Dash839C", DieselDash839C.class, ItemIDs.minecartDash839C.item, EnumTrainType.Diesel, 3900, 120, 0, 45, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Grey", "Skin19", "Black", "Blue", "Skin17", "Cyan", "LightGrey", "Skin16", "Brown", "Orange", "Skin18", "Skin20"}), 12, -4.0),
	Dash839CE("Dash839CE", DieselDash839CE.class, ItemIDs.minecartDash839CE.item, EnumTrainType.Diesel, 3900, 113, 0, 45, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Skin18", "Skin19", "Black", "LightGrey"}), 12, -4.0),
	Dash839B("Dash839B", DieselDash839B.class, ItemIDs.minecartDash839B.item, EnumTrainType.Diesel, 3900, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Orange", "Skin16", "Skin17", "LightGrey", "Cyan", "Skin18", "Brown"}), 12, -3.6),
	Dash840B("Dash840B", DieselDash840B.class, ItemIDs.minecartDash840B.item, EnumTrainType.Diesel, 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Blue", "Yellow", "Orange", "LightBlue", "Pink", "Purple", "Black"}), 12, -3.6),
	Dash840BB("Dash840BB", DieselDash840BB.class, ItemIDs.minecartDash840BB.item, EnumTrainType.Diesel, 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Skin17"}), 14, -3.3),
	Dash840BW("Dash840BW", DieselDash840BW.class, ItemIDs.minecartDash840BW.item, EnumTrainType.Diesel, 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "LightGrey", "Skin16", "Pink"}), 12, -3.6),
	Dash840C("Dash840C", DieselDash840C.class, ItemIDs.minecartDash840C.item, EnumTrainType.Diesel, 4000, 113, 0, 40, 0, 200, 0.8, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Grey", "LightBlue", "Skin24", "Skin22", "Skin25", "Blue", "Skin16", "LightGrey", "Skin17", "Purple", "Skin23"}), 12, -4),
	Dash841C("Dash841C", DieselDash841C.class, ItemIDs.minecartDash841C.item, EnumTrainType.Diesel, 4100, 113, 0, 39, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "LightGrey", "Pink", "Orange", "Skin16", "Green", "Skin17", "Lime"}), 12, -4.0),

	Dash940C("Dash940C", DieselDash940C.class, ItemIDs.minecartDash940C.item, EnumTrainType.Diesel, 4000, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 12, -4.0),
	Dash944CW("Dash944CW", DieselDash944CW.class, ItemIDs.minecartDash944CW.item, EnumTrainType.Diesel, 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "LightGrey", "Grey", "Orange", "Magenta", "Skin17", "Pink", "Green", "White", "Skin27", "Skin18", "Red", "Skin19", "LightBlue", "Skin28"}), 12, -4.0),
	AC4400CW("AC4400CW", DieselAC4400CW.class, ItemIDs.minecartAC4400CW.item, EnumTrainType.Diesel, 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Blue", "Skin16", "LightGrey"}), 12, -4.0),
	AC4400C("AC4400C", DieselAC4400C.class, ItemIDs.minecartAC4400C.item, EnumTrainType.Diesel, 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Cyan", "Skin16", "LightBlue", "Grey", "Blue"}), 12, -4.0),

	ES44("ES44", DieselES44.class, ItemIDs.minecartES44.item, EnumTrainType.Diesel, 4400, 120, 0, 10, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Orange", "Skin17", "Red", "Yellow", "Blue", "LightGrey", "Grey", "Black", "Skin18", "Skin19", "Pink", "Purple", "Lime", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"}), 12, -4.0),
	ES44h("ES44h", DieselES44h.class, ItemIDs.minecartES44h.item, EnumTrainType.Diesel, 4400, 120, 0, 10, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey","LightBlue", "Green", "Black", "Cyan", "Brown", "Blue", "White", "Lime", "Orange", "Red", "Skin16", "Skin22", "Skin18", "Skin19", "Skin20", "Skin21", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin35", "Skin36", "Skin37", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin32", "Skin33", "Skin34", "Skin23", "Skin24" }), 12, -4.0),
	P32("P32", DieselP32.class, ItemIDs.minecartP32.item, EnumTrainType.Diesel, 3200, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Red", "LightGrey"}), 10, -3.5),
	geGenesis("P40", DieselP40.class, ItemIDs.minecartGeGenesis.item, EnumTrainType.Diesel, 4000, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 10, -3.5),
	P42("P42", DieselP42.class, ItemIDs.minecartP42.item, EnumTrainType.Diesel, 4250, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Cyan", "Skin16", "Blue"}), 10, -3.5),

	//CEE (pre GE)
	CEE4ED172T("4ED172T", Diesel4ED172T.class, ItemIDs.minecart4ED172T.item, EnumTrainType.Diesel, 1725, 95, 0, 25, 0, 200, 0.74, 0.91, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Orange", "Black", "LightGrey", "Skin16", "Skin17", "Green", "Grey", "Skin18", "Skin19", "Skin20"}), 14, -2.85),
	CEE4ED172T_E("4ED172T_E", Diesel4ED172T_E.class, ItemIDs.minecart4ED172T_E.item, EnumTrainType.Diesel, 1500, 95, 0, 50, 0, 175, 0.8, 0.91, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "LightGrey", "Orange"}), 14, -2.85),
	CEE4ED172T_G("4ED172T_G", Diesel4ED172T_G.class, ItemIDs.minecart4ED172T_G.item, EnumTrainType.Diesel, 1800, 95, 0, 25, 0, 210, 0.68, 0.91, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Lime", "LightGrey"}), 14, -2.85),
	CEE4ED172T_C("4ED172T_C", Diesel4ED172T_C.class, ItemIDs.minecart4ED172T_C.item, EnumTrainType.Diesel, 1200, 95, 0, 30, 0, 125, 0.7, 0.89, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "LightGrey", "Purple"}), 14, -2.85),

	//ALCO//
	AlcoPA1("PA1", DieselPA1.class, ItemIDs.minecartAlcoPA1.item, EnumTrainType.Diesel, 2000, 188, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Pink", "Skin24", "Cyan", "Blue", "Purple", "Magenta", "Yellow", "Orange", "Skin23", "White", "Grey", "Brown", "LightGrey", "Green", "Lime", "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19", "Skin22", "Skin20", "Skin21", "Black"}), 12, -3.15),
	AlcoPB1("PB1", DieselPB1.class, ItemIDs.minecartAlcoPB1.item, EnumTrainType.Diesel, 2000, 188, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Skin24", "Magenta", "Yellow", "Orange", "LightGrey", "Skin19", "Black"}), 12, -3.1),
	FA1("FA1", DieselFA1.class, ItemIDs.minecartFA1.item, EnumTrainType.Diesel, 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"}), 15, -2.845),
	FB1("FB1", DieselFB1.class, ItemIDs.minecartFB1.item, EnumTrainType.Diesel, 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White"}), 15, -2.825),
	FA2("FA2", DieselFA2.class, ItemIDs.minecartFA2.item, EnumTrainType.Diesel, 1600, 120, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Yellow", "Blue", "Black", "Orange", "Green", "Purple", "Lime", "LightGrey", "White", "Magenta", "Skin17", "Skin18"}), 15, -2.845),
	FB2("FB2", DieselFB2.class, ItemIDs.minecartFB2.item, EnumTrainType.Diesel, 1600, 120, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Yellow", "Black", "Orange", "Green", "LightGrey", "White", "Magenta"}), 15, -2.825),
	FPA4("FPA4", DieselFPA4.class, ItemIDs.minecartFPA4.item, EnumTrainType.Diesel, 1800, 148, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Green", "Red", "LightBlue", "Purple", "Brown", "Lime", "White", "Yellow", "Black", "Grey"}), 15, -2.845),
	FPB4("FPB4", DieselFPB4.class, ItemIDs.minecartFPB4.item, EnumTrainType.Diesel, 1800, 148, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Green", "Red", "Purple", "Brown", "Lime", "White", "Yellow"}), 15, -2.825),
	FAFDL("FAFDL", DieselFAFDL.class, ItemIDs.minecartFAFDL.item, EnumTrainType.Diesel, 1800, 120, 0, 30, 0, 200, 0.7, 0.79, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "LightGrey", "Grey"}), 15, -2.845),
	FBFDL("FBFDL", DieselFBFDL.class, ItemIDs.minecartFBFDL.item, EnumTrainType.Diesel, 1800, 120, 0, 30, 0, 200, 0.7, 0.79, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "LightGrey", "Grey"}), 15, -2.825),

	RS1("RS1", DieselRS1.class, ItemIDs.minecartRS1.item, EnumTrainType.Diesel, 1000, 105, 0, 30, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Green", "LightGrey", "Skin17", "Skin18", "Cyan", "LightBlue", "Purple", "Skin19", "White"}), 16, -2.5),
	RS2("RS2", DieselRS2.class, ItemIDs.minecartRS2.item, EnumTrainType.Diesel, 1500, 105, 0, 28, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "LightBlue", "White", "Magenta", "Brown", "Skin19", "Skin23", "Black"}), 16, -2.5),
	RS3("RS3", DieselRS3.class, ItemIDs.minecartRS3.item, EnumTrainType.Diesel, 1600, 137, 0, 28, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "LightGrey", "Yellow", "Magenta", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"}), 16, -2.5),
	RSFDL("RSFDL", DieselRSFDL.class, ItemIDs.minecartRSFDL.item, EnumTrainType.Diesel, 1800, 105, 0, 40, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey"}), 16, -2.5),

	C415H("C415H", DieselC415H.class, ItemIDs.minecartC415H.item, EnumTrainType.Diesel, 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Magenta", "Brown", "Red", "Pink", "Green", "Cyan"}), 16, -2.4),
	C415S("C415S", DieselC415S.class, ItemIDs.minecartC415S.item, EnumTrainType.Diesel, 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow", "Blue", "LightGrey", "Skin18", "Skin19"}), 16, -2.5),
	C415L("C415L", DieselC415L.class, ItemIDs.minecartC415L.item, EnumTrainType.Diesel, 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 17000, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 16, -2.5),
	C424("C424",DieselC424.class, ItemIDs.minecartC424.item, EnumTrainType.Diesel, 2400, 113, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Black", "Pink", "Brown", "Magenta", "Skin17", "LightGrey", "Skin16", "Skin18", "Skin19", "Cyan", "Green", "Purple", "Skin20"}), 14, -2.8),
	C425("C425", DieselC425.class, ItemIDs.minecartC425.item, EnumTrainType.Diesel, 2500, 113, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Yellow", "Skin16", "Green"}), 14, -2.8),
	DH643("DH643", DieselDH643.class, ItemIDs.minecartDH643.item, EnumTrainType.Diesel, 4300, 124, 0, 60, 0, 200, 0.7, 0.87, 16000, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 12, -4.0),
	C855a("C855a", DieselC855a.class, ItemIDs.minecartC855a.item, EnumTrainType.Diesel, 5500, 106, 0, 40, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Cyan", "Skin16"}), 10, -4.25),
	C855b("C855b", DieselC855b.class, ItemIDs.minecartC855b.item, EnumTrainType.Diesel, 5500, 106, 0, 40, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Cyan", "Skin16"}), 10, -4.25),

	HH660("HH660", DieselHH660.class, ItemIDs.minecartHH660.item, EnumTrainType.Diesel, 660, 50, 0, 15, 0, 200, 0.9, 0.95, 6000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Orange", "Black", "Red", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}), 16, -2),
	S2("S2",  DieselS2.class, ItemIDs.minecartS2.item, EnumTrainType.Diesel, 1000, 96, 0, 15, 0, 200, 0.7, 0.965, 6000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Green", "Orange", "Pink", "White", "Blue", "LightGrey", "Magenta", "Red", "Skin16", "Skin17", "Skin18"}), 16, -2),

	RSD15("RSD15", DieselRSD15.class, ItemIDs.minecartRSD15.item, EnumTrainType.Diesel, 2400, 105, 0, 30, 0, 200, 0.7, 0.91, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue","Cyan", "Grey", "Red"}), 12, -3.7),

	M420("M420", DieselM420.class, ItemIDs.minecartM420.item, EnumTrainType.Diesel, 2000, 108, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Pink", "Cyan", "Grey", "Purple"}), 15, -2.8),
	M420B("M420B", DieselM420B.class, ItemIDs.minecartM420B.item, EnumTrainType.Diesel, 2000, 108, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Pink", "Cyan"}), 15, -2.8),

	M630("M630", DieselM630.class, ItemIDs.minecartM630.item, EnumTrainType.Diesel, 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Skin17", "LightGrey", "Cyan", "Purple", "Brown"}), 12, -3.45),
	M630R("M630R", DieselM630R.class, ItemIDs.minecartM630R.item, EnumTrainType.Diesel, 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey"}), 12, -3.45),
	M630W("M630W", DieselM630W.class, ItemIDs.minecartM630W.item, EnumTrainType.Diesel, 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan", "Red"}), 12, -3.45),
	M636("M636", DieselM636.class, ItemIDs.minecartM636.item, EnumTrainType.Diesel, 3600, 120, 0, 10, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Blue", "Grey", "LightGrey"}), 12, -3.45),
	M636R("M636R", DieselM636R.class, ItemIDs.minecartM636R.item, EnumTrainType.Diesel, 3600, 120, 0, 10, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "LightGrey"}), 12, -3.45),
	M640("M640", DieselM640.class, ItemIDs.minecartM640.item, EnumTrainType.Diesel, 4000, 120, 0, 7, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Skin16", "LightGrey", "Skin17", "Skin18", "Skin19"}), 12, -3.45),
	M640W("M640W", DieselM640W.class, ItemIDs.minecartM640W.item, EnumTrainType.Diesel, 4000, 120, 0, 7, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Brown", "LightGrey", "Skin17"}), 12, -3.45),

	//BRuhMOMent//
	VO1000("VO1000", DieselVO1000.class, ItemIDs.minecartVO1000.item, EnumTrainType.Diesel, 1000, 67, 0, 20, 0, 200, 0.8, 0.9, 6000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Pink", "Blue", "LightBlue", "Skin16"}), 16, -2.2),
	DS441000("DS441000", DieselDS441000.class, ItemIDs.minecartDS441000.item, EnumTrainType.Diesel, 1000, 97, 0, 35, 0, 180, 0.75, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Green", "Grey", "Black", "Orange","Skin20"}), 16, -2.2),
	S12("S12", DieselS12.class, ItemIDs.minecartS12.item, EnumTrainType.Diesel, 1200, 97, 0, 35, 0, 180, 0.75, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Brown", "Skin16", "White", "Cyan", "Skin18", "Black", "Orange"}), 16, -2.2),

	DR441500Phase2("DR441500Phase2", DieselDR441500Phase2.class, ItemIDs.minecartDR441500Phase2.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Yellow", "Red", "White", "Grey", "Magenta", "Purple", "Skin16"}), 15, -2.845),
	DR441500BPhase2("DR441500BPhase2", DieselDR441500BPhase2.class, ItemIDs.minecartDR441500BPhase2.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Red", "White", "Grey", "Magenta", "Purple"}), 15, -2.675),
	DR441500Shark("DR441500Shark", DieselDR441500Shark.class, ItemIDs.minecartDR441500Shark.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "Blue", "Cyan", "LightBlue", "Grey"}), 15, -2.845),
	DR441500BShark("DR441500BShark", DieselDR441500BShark.class, ItemIDs.minecartDR441500BShark.item, EnumTrainType.Diesel, 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "Blue", "Cyan", "Grey"}), 15, -2.675),
	RF16("RF16", DieselRF16.class, ItemIDs.minecartRF16.item, EnumTrainType.Diesel, 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow", "LightGrey", "Blue", "Cyan", "LightBlue", "Grey", "Black", "Orange", "Magenta", "Red"}), 15, -2.845),
	RF16B("RF16B", DieselRF16B.class, ItemIDs.minecartRF16B.item, EnumTrainType.Diesel, 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Blue", "Cyan", "Grey", "Black", "Orange", "Magenta", "Red", "Purple"}), 15, -2.675),

	//Fairbanks Morse//
	H1044("H1044", DieselH1044.class, ItemIDs.minecartH1044.item, EnumTrainType.Diesel, 1000, 97, 0, 25, 0, 200, 0.75, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Orange", "White", "Lime", "LightGrey", "Skin16"}), 18, -2.2),
	H16_66("H16-66", DieselH16_66.class, ItemIDs.minecartH16_66.item, EnumTrainType.Diesel, 1600, 130, 0, 45, 0, 200, 0.87, 0.93, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "LightGrey", "Green", "Lime", "Black", "Grey", "Orange", "Brown", "Red", "Pink", "Magenta", "Skin16"}), 12, -3.35),
	H24_66("H24-66", DieselH24_66.class, ItemIDs.minecartH24_66.item, EnumTrainType.Diesel, 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Brown", "Yellow", "Grey", "LightGrey", "Lime"}), 12, -3.75),
	H24_66L("H24-66L", DieselH24_66L.class, ItemIDs.minecartH24_66L.item, EnumTrainType.Diesel, 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Green"}), 12, -3.75),
	H24_66C("H24-66C", DieselH24_66C.class, ItemIDs.minecartH24_66C.item, EnumTrainType.Diesel, 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Grey", "Yellow"}), 12, -3.75),

	//other MOtOEr Shuite//
	NRE3gs21b("NRE3gs21b", DieselNRE3gs21b.class, ItemIDs.minecartNRE3gs21b.item, "diesel genset", 2100, 104, 0, 10,0,  200, 0.78, 0.8, 14000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Grey", "LightGrey", "Skin16", "Blue"}), 12, -3.1),
	gtavthing("gtavthing", Dieselgtavthing.class, ItemIDs.minecartgtavthing.item, EnumTrainType.Diesel, 1550, 110, 0, 45, 0, 200, 0.85, 0.9, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow"}), 14, -3.2, (new String[] {"Fictional locomotive from GTA-V"})),
	FOLM1B("FOL-M1B", DieselFOLM1B.class, ItemIDs.minecartFOLM1B.item, EnumTrainType.Diesel, 5000, 110, 0, 10, 0, 200, 0.7, 0.965, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue", "Black"}), 12, -3.8, (new String[] {"Fictional B unit for the Fictional loco from Factorio"})),
	Krautt("Krautt", DieselKrautt.class, ItemIDs.minecartKrautt.item, EnumTrainType.Diesel, 3540, 113, 0, 65, 0, 200, 0.75, 0.85, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Black", "Red"}), 13, -3.3),
	DD55("DD55", DieselDD55.class, ItemIDs.minecartDD55.item, EnumTrainType.Diesel, 2000, 80, 0, 80, 0, 190, 0.7, 0.9555, 10000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Purple", "LightGrey", "Pink", "Blue"}), 15, -2.9),
	TB27("TB27",DieselTB27.class, ItemIDs.minecartTB27.item, EnumTrainType.Diesel, 2700, 110, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "LightGrey", "White", "Purple"}), 14, -2.8),

	SlugMA("SlugMA", SlugMA.class, ItemIDs.minecartSlugMA.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 18000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Skin16", "Magenta", "Blue", "Yellow"}), 16, 0),
	F7BSlug("F7BSlug", BUnitF7.class, ItemIDs.minecartF7BSlug.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Skin19"}), 18, 0),
	SMSC1("SMSC1", SMSC1.class, ItemIDs.minecartSMSC1.item, "slug", 0, 0, 8, 0, 0, 0, 0, 0, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 12, 0, (new String[] {"It'le pull your socks off, if it wasnt busy having frame sag"})),
	CEEslug("CEEslug", ElectricCEEslug.class, ItemIDs.minecartCEEslug.item, "'slug'", 3000, 113, 0, 15, 0, 200, 0.89, 0.91, 0, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Skin16", "LightGrey"}), 14, -3.1),
	SBMS("SBMS", SBMS.class, ItemIDs.minecartSBMS.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Pink", "Black"}), 12, 0),

	RotaryPlow("RotaryPlow", RotaryPlow1.class, ItemIDs.minecartRotaryPlow.item, "snowplow", 1750, 60, 0, 30, 0, 200, 0.70, 0.75, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16"}), 14, -1.95),

	//based electrics//
	EF1("EF1",ElectricEF1.class, ItemIDs.minecartEF1.item, EnumTrainType.Electric, 1720, 64, 0, 55, 0, 200, 0.65, 0.75, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Yellow", "Red", "Green", "Black", "Grey"}), 10, -3.4375),
	EF1B("EF1B",ElectricEF1B.class, ItemIDs.minecartEF1B.item, EnumTrainType.Electric, 1720, 64, 0, 55, 0, 200, 0.65, 0.75, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Black", "Pink"}), 10, -2.3125),
	EP1A("EP1A", ElectricEP1A.class, ItemIDs.minecartEP1A.item, EnumTrainType.Electric, 2500, 120, 0, 55, 0, 200, 0.75, 0.85, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red"}), 10, -3.4375),

	GM6C("GM6C",ElectricGM6C_2.class, ItemIDs.minecartGM6C.item, EnumTrainType.Electric, 6000, 115, 0, 55, 0, 200, 0.65, 0.79, 12500, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "LightBlue", "Black", "Skin17", "Cyan", "Skin18"}), 12, -3.45),

	JT7("JT7", ElectricJT7.class, ItemIDs.minecartJT7.item,EnumTrainType.Electric,3900,90,0,5,0,200,0.7,0.7,0,TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Green", "LightGrey"}),12,-4),

	AEM7("AEM7", ElectricAEM7.class, ItemIDs.minecartAEM7.item,EnumTrainType.Electric,7000,201,0,10,0,200,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}),10,-2),

	B_BEL("B-BEL", ElectricB_BEL.class, ItemIDs.minecartB_BEL.item, "battery electric", 2000, 113, 0, 15, 0, 200, 0.89, 0.91, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Skin16", "Green", "Pink", "LightGrey", "Purple", "Yellow"}), 14, -3.1),

	//FrERf//
	RoundHopper("Freight Round Covered Hopper", RoundHopper.class, ItemIDs.minecartRoundHopper.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Black", "White", "LightGrey"}), 15, 36,(new String[] {"Cargo: Any."})),
	RibbedHopper("Freight Ribbed Covered Hopper", RibbedHopper.class, ItemIDs.minecartRibbedHopper.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Cyan", "LightGrey", "Red", "Brown", "White", "Pink", "Skin16", "Orange", "Skin20", "Skin17", "Skin18", "Skin19", "Skin21", "Green", "Skin22"}), 15, 36,(new String[] {"Cargo: Any."})),
	Hopper5201("5201 Cu Foot Hopper", Hopper5201.class, ItemIDs.minecartHopper5201.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Cyan", "Black", "Skin16", "Skin17", "LightGrey", "Blue", "Skin18", "Skin19", "Skin20"}), 15, 36,(new String[] {"Cargo: Any."})),
	Hopper6260("6260 Cu Foot Jumbo Hopper", Hopper6260.class, ItemIDs.minecartHopper6260.item, EnumTrainType.CoveredHopper, 4, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Skin16", "Skin17"}), 14, 45,(new String[] {"Cargo: Any."})),
	FNCC2375Hopper("FNCC2375Hopper", FNCC2375Hopper.class, ItemIDs.minecartFNCC2375Hopper.item, EnumTrainType.CoveredHopper, 2.5, TraincraftUtil.getBytesFromColors(new String[]{"Cyan", "Green", "Black", "LightGrey", "Blue", "Skin16", "Skin17", "Purple", "Magenta", "Pink", "Yellow", "Red", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 15, 27,(new String[] {"Cargo: Any."})),
	PDH2800("PDH2800", PDH2800.class, ItemIDs.minecartPDH2800.item, EnumTrainType.CoveredHopper, 2, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey","Yellow","Grey","Brown","Magenta", "Skin16", "Skin17"}), 18, 27,(new String[] {"Cargo: Any."})),
	ACF2Bay("ACF2Bay", ACF2Bay.class, ItemIDs.minecartACF2Bay.item, EnumTrainType.CoveredHopper, 2.5, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "Black", "Magenta", "Skin16", "Grey", "Red", "Orange", "Skin17", "Skin18", "Blue", "Skin19", "Skin20", "Brown"}), 15, 27,(new String[] {"Cargo: Any."})),
	ACF4650("ACF4650", ACF4650.class, ItemIDs.minecartACF4650.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Skin18", "Grey", "LightGrey", "Skin16", "Skin17", "Brown", "White", "Skin19", "Blue", "Orange", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Purple"}), 15, 36,(new String[] {"Cargo: Any."})),
	PS2_4750("PS2_4750", PS2_4750.class, ItemIDs.minecartPS2_4750.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "White", "Skin17", "Skin18", "Skin16", "Skin20", "Grey", "Skin19", "LightBlue", "Skin21", "Yellow", "Skin22", "Orange", "Magenta", "Green", "Lime", "Purple", "Skin23", "Cyan", "Brown", "Pink", "Skin24", "Skin25", "Skin28", "Skin27", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Black", "Skin34", "Blue", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin44"}), 15, 36,(new String[] {"Cargo: Any."})),
	GATC4180Airslide("GATC4180Airslide", GATC4180Airslide.class, ItemIDs.minecartGATC4180Airslide.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Grey", "Skin17", "LightGrey", "Skin18", "Skin21", "Skin19", "Green", "Orange", "Yellow", "Skin20", "Pink", "Magenta", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}), 15, 36,(new String[] {"Cargo: Any."})),
	ACF3500("ACF3500", ACF3500.class, ItemIDs.minecartACF3500.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Yellow", "Skin17", "Pink", "Skin18", "Brown", "Skin19", "Orange", "Black", "LightGrey", "Skin20", "Skin21", "Skin22", "Skin23"}), 15, 36,(new String[] {"Cargo: Any."})),
	ACF3960("ACF3960", ACF3960.class, ItemIDs.minecartACF3960.item, EnumTrainType.CoveredHopper, 3, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "Green", "White", "Skin16", "Skin17", "Skin18", "Grey"}), 15, 36,(new String[] {"Cargo: Any."})),

	Freight60centerbeam("60centerbeam",  Freight60centerbeam.class, ItemIDs.minecart60centerbeam.item, EnumTrainType.CenterbeamFlat, 3, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Yellow", "Green", "LightGrey"}), 10, 54, null),
	Freight66centerbeam("66centerbeam",  Freight66centerbeam.class, ItemIDs.minecart66centerbeam.item, EnumTrainType.CenterbeamFlat, 3, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Cyan", "Black", "Green", "Lime", "Red", "Purple", "LightBlue", "Pink", "Blue", "Yellow"}), 10, 54, null),
	Freight73centerbeam("73centerbeam",  Freight73centerbeam.class, ItemIDs.minecart73centerbeam.item, EnumTrainType.CenterbeamFlat, 3.5, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Green", "Orange", "Yellow", "Red", "Purple"}), 10, 54, null),
	GSI60FootBulkhead("GSI_Bulkhead", GSI60FootBulkhead.class, ItemIDs.minecartGSI60FootBulkhead.item, EnumTrainType.BulkheadFlat, 3, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Green", "Black", "Skin17", "Brown", "Cyan"}), 10, 45, (new String[] {"Cargo: Bulkhead Items."})),
	GSC60FootFlatcar("GSC_Flatcar", GSC60FootFlat.class, ItemIDs.minecartGSC60FootFlatcar.item, EnumTrainType.Flatcars, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Orange", "Yellow", "Skin17", "Brown", "Green", "Skin16"}), 12, 45, (new String[] {"Cargo: whatever flatcars carry i guess"})),
	Thrall63centerbeam("63centerbeam",  Thrall63centerbeam.class, ItemIDs.minecartthrall63centerbeam.item, EnumTrainType.CenterbeamFlat, 3, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow", "Red", "Black", "Cyan", "Skin16", "Skin17", "Purple"}), 12, 45, null),
	FNCC60FootBulk("FNCC60FootBulk", FNCC60FootBulk.class, ItemIDs.minecartFNCC60FootBulk.item, EnumTrainType.BulkheadFlat, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "Yellow", "Skin16", "Skin17", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 12, 45, (new String[] {"Cargo: Bulkhead Stuff."})),
	GSC53FootFlatcar("GSC_53Flatcar", GSC53FootFlat.class, ItemIDs.minecartGSC53FootFlatcar.item, EnumTrainType.Flatcars, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Brown", "Green", "Lime", "Black", "White", "Grey", "LightGrey"}), 12, 45, (new String[] {"Cargo: whatever flatcars carry i guess"})),
	GSC53Foot6_6Bulkhead("GSC_53_66Bulkhead", GSC53Foot66Bulkhead.class, ItemIDs.minecartGSC5366FootBulkhead.item, EnumTrainType.BulkheadFlat, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Black", "Grey", "Blue"}), 12, 45, (new String[] {"Cargo: Bulkhead Items."})),
	GSC53Foot8_6Bulkhead("GSC_53_86Bulkhead", GSC53Foot86Bulkhead.class, ItemIDs.minecartGSC5386FootBulkhead.item, EnumTrainType.BulkheadFlat, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Green", "Red", "Purple", "Black", "Lime", "White", "Grey", "Yellow"}), 12, 45, (new String[] {"Cargo: Bulkhead Items."})),
	MaPa35FootFlatcar("MaPa_35Flatcar", MaPa35FootFlat.class, ItemIDs.minecartMaPa35FootFlatcar.item, EnumTrainType.Flatcars, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Grey","Magenta", "LightGrey", "Black", "Green", "Lime", "Orange", "Purple", "Red"}), 12, 18, (new String[] {"Cargo: whatever flatcars carry i guess"})),

	PS140("PS140", PS140.class, ItemIDs.minecartPS140.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "LightBlue", "Green", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Yellow", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Magenta", "Skin26", "Skin27", "Skin28", "Orange"}), 15, 27, (new String[] {"Cargo: Any."})),
	PS150("PS150", PS150.class, ItemIDs.minecartPS150.item, EnumTrainType.Boxcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"White", "Lime", "Red", "Yellow", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Brown", "Cyan", "Skin21", "Skin22", "Skin23"}), 14, 36, (new String[] {"Cargo: Any."})),
	PS160("PS160", PS160.class, ItemIDs.minecartPS160.item, EnumTrainType.Boxcar, 3.25, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Orange", "Cyan", "White"}), 13, 45, (new String[] {"Cargo: Any."})),
	OWO60Verticube("OWO 60 Verticube", OWO60Verticube.class, ItemIDs.minecartOWO60Verticube.item, EnumTrainType.HighcubeBoxcar, 3.75, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Lime", "Green", "Brown", "White", "Pink", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Yellow", "Skin25"}), 10, 54, (new String[] {"Cargo: Any."})),
	MILW40boxcar("MILW40boxcar", MILW40boxcar.class, ItemIDs.minecartMILW40boxcar.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Brown", "Yellow", "Green", "Blue", "Purple", "Orange", "Lime"}), 15, 27, (new String[] {"Cargo: Any."})),
	Freight40highcube("40highcube", Freight40highcube.class, ItemIDs.minecart40highcube.item, EnumTrainType.HighcubeBoxcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Green", "Cyan", "Orange", "Grey", "Red", "Lime", "LightGrey", "Pink", "Purple", "Blue", "Black", "White", "Magenta", "Skin16", "Skin17","Skin18"}), 15, 40, (new String[] {"Cargo: Any."})),
	Hicube60("60 Foot Hi-Cube Boxcar", Hicube60foot.class, ItemIDs.minecarthicube60foot.item, EnumTrainType.HighcubeBoxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Pink", "Blue", "Skin16", "Skin17", "Lime", "White", "Cyan", "Green", "Purple", "Skin18"}), 12, 54, (new String[] {"Cargo: Any."})),
	Reefer64("Reefer64", Reefer64Foot.class, ItemIDs.minecartReefer64.item, EnumTrainType.RefrigeratedBoxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "Grey", "Orange", "Green", "Red", "Black", "Cyan", "Skin16", "Skin17"}), 10, 54, (new String[] {"Cargo: Any."})),
	FNCC50Foot("FNCC50FootBoxcar",  FNCC50Foot.class, ItemIDs.minecartFNCC50Foot.item, EnumTrainType.Boxcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "Black", "Skin18", "Skin19", "Brown", "Pink", "Skin16", "Blue", "Skin23", "Skin22", "Skin21", "Yellow", "White", "Skin17", "Magenta", "Skin24", "Skin25", "Skin26"}), 16, 36, (new String[] {"Cargo: Any."})),
	GN40("GN40",  GN40.class, ItemIDs.minecartGN40.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Red"}), 16, 27, (new String[] {"Cargo: Any."})),
	R70Reefer("R70Reefer", R70Reefer.class, ItemIDs.minecartR70Reefer.item, EnumTrainType.RefrigeratedBoxcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Cyan", "White", "Yellow", "Skin16", "Orange", "Skin17", "Skin18", "Green", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"}), 10, 54, (new String[] {"Cargo: Cold Stuff lol"})),
	R70Reefer2("R70Reefer2", R70Reefer2.class, ItemIDs.minecartR70Reefer2.item, EnumTrainType.RefrigeratedBoxcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "White", "Orange", "Skin19", "Yellow", "Red", "Skin20", "Skin21"}), 10, 54, (new String[] {"Cargo: Cold Stuff lol"})),
	NSCReefer("NSCReefer",  NSCReefer.class, ItemIDs.minecartNSCchildHUH.item, EnumTrainType.RefrigeratedBoxcar, 2.75, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Orange"}), 16, 36, (new String[] {"Cargo: meet and HUH!?"})),
	PCF6033("PCF6033", PCF6033.class, ItemIDs.minecartPCF6033.item, EnumTrainType.HighcubeBoxcar, 3.75, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Skin16", "Pink", "Blue", "Red", "Skin17", "Yellow", "Magenta", "Cyan", "Skin18", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22"}), 10, 54, (new String[] {"Cargo: Any."})),
	PCF_RBL_Smooth("PCF_RBL_Smooth", PCF_RBL_Smooth.class, ItemIDs.minecartPCF_RBL_Smooth.item, EnumTrainType.Boxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Brown", "Skin16", "Skin17", "Skin29", "Green", "Cyan", "Skin22", "Skin18", "Skin19", "Skin20", "Skin21", "Yellow", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28"}), 10, 45, (new String[] {"Cargo: Any."})),
	PCF_RBL_Ribbed("PCF_RBL_Ribbed", PCF_RBL_Ribbed.class, ItemIDs.minecartPCF_RBL_Ribbed.item, EnumTrainType.Boxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Blue", "Red", "Pink", "Grey", "Magenta", "Lime", "Orange", "Brown", "White", "Yellow", "Black", "LightGrey"}), 10, 45, (new String[] {"Cargo: Any."})),
	PCF_B100("PCF_B100", PCF_B100.class, ItemIDs.minecartPCF_B100.item, EnumTrainType.Boxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Brown", "Skin16", "Grey", "Green", "LightGrey", "Skin17"}), 10, 45, (new String[] {"Cargo: Any."})),
	ACFRailbox("ACF Railbox", ACFRailbox.class, ItemIDs.minecartACFRailbox.item, EnumTrainType.Boxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Blue", "Black", "Orange", "Pink", "LightBlue", "White", "Magenta", "Cyan", "Grey"}), 12, 54, (new String[] {"Cargo: Any."})),
	ACFRailboxCushioned("ACF Railbox (Cushioned)", ACFRailboxCushioned.class, ItemIDs.minecartACFRailboxCushioned.item, EnumTrainType.Boxcar, 4, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Lime", "White", "Brown", "Red", "Blue", "Grey", "Orange", "Yellow","Skin16"}), 12, 54, (new String[] {"Cargo: Any."})),
	Evans5100("Evans5100", Evans5100.class, ItemIDs.minecartEvans5100.item, EnumTrainType.Boxcar, 4.5, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Green", "Orange", "Red", "Skin16", "Pink", "Cyan", "Blue", "Yellow", "Brown", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Purple", "Magenta", "Skin22", "Skin23", "Skin24", "LightGrey", "Black", "Skin25", "White", "Skin26", "Skin27", "Grey"}), 12, 54, (new String[] {"Cargo: Any."})),
	Wood1912Boxcar("1912WoodBoxcar", Wood1912Boxcar.class, ItemIDs.minecart1912WoodBoxcar.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Magenta", "Red", "Yellow", "Green"}), 15, 27, (new String[] {"Cargo: Any."})),
	PS_40t_ss_box("PS_40t_ss_box",  PS_40t_ss_box.class, ItemIDs.minecartPS_40t_ss_box.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Lime", "Brown", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 16, 27, (new String[] {"Cargo: Any."})),
	SP_B50("SP_B50",  SP_B50.class, ItemIDs.minecartSP_B50.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Magenta", "Brown", "Orange", "Green", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 16, 27, (new String[] {"Cargo: Any."})),
	SP_B50_AAR("SP_B50_AAR",  SP_B50_AAR.class, ItemIDs.minecartSP_B50_AAR.item, EnumTrainType.Boxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Red","Skin17","Skin18","Skin19","Skin20","Skin21","Skin22","Skin23","Skin24","Skin25","Skin33","Skin26","Skin27","Skin28","Skin29","Skin30","Skin31","Skin34","Skin32","Skin35"}), 16, 27, (new String[] {"Cargo: Whatever a boxcar can hold."})),
	PFEr_40_23Reefer("PFEr_40_23Reefer",  PFEr_40_23Reefer.class, ItemIDs.minecartPFEr_40_23Reefer.item, EnumTrainType.RefrigeratedBoxcar, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Brown", "Yellow", "Purple", "Grey"}), 16, 27, (new String[] {"Cargo: Cold Things you Dumbass."})),

	VersaLongi("VersaLongi", VersaLongi.class, ItemIDs.minecartVersaLongi.item, EnumTrainType.OpenTopHopper, 2.75, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Black", "Orange", "Brown", "Skin16", "Grey", "Pink", "LightBlue", "Yellow"}), 15, 36, null),
	VersaTrans("VersaTrans", VersaTrans.class, ItemIDs.minecartVersaTrans.item, EnumTrainType.OpenTopHopper, 2.75, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Grey", "LightGrey", "Black"}), 15, 36, null),
	MillGondola("52footMillGondola", MillGondola.class, ItemIDs.minecartMillGondola.item, EnumTrainType.Gondola, 3, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Orange", "Green", "Grey", "Skin16", "Skin18", "Blue", "Lime", "Skin17", "Brown", "Pink", "LightGrey", "Skin19", "Yellow"}), 14, 45, (new String[] {"Cargo: Any."})),
	WoodchipHopper("Woodchip Hopper", WoodchipHopper.class, ItemIDs.minecartWoodchipHopper.item, EnumTrainType.OpenTopHopper, 3, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Blue", "Green", "Orange", "Red", "White", "Cyan", "Skin18", "Skin19", "Skin16", "Skin17"}), 14, 45, null),
	OreJenny("Ore Jenny", OreJenny.class, ItemIDs.minecartOreJenny.item, EnumTrainType.OpenTopHopper, 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "Orange", "Pink", "Black"}), 18, 27, null),
	PRRGLaHopper("PRR GLa hopper", PRRGLaHopper.class, ItemIDs.minecartPRRGLaHopper.item, EnumTrainType.OpenTopHopper, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Yellow", "Magenta", "Blue", "LightGrey"}), 16, 27, null),
	ACF41Gon("ACF41Gon", ACF41Gon.class, ItemIDs.minecartACF41Gon.item, EnumTrainType.Gondola, 2.75, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Grey", "Brown", "Skin16"}), 15, 27, (new String[] {"Cargo: Gonstuff"})),
	BethgonII("BethgonII", BethgonII.class, ItemIDs.minecartBethgonII.item, EnumTrainType.OpenTopHopper, 4, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Orange", "Yellow", "Grey", "Magenta", "Pink", "Purple", "Skin16", "Skin17"}), 14, 45, (new String[] {"Cargo: Coal n shid"})),
	gsco67millgon("67millgon", gsco67millgon.class, ItemIDs.minecart67millgon.item, EnumTrainType.Gondola, 3.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Brown", "Blue", "Grey", "Skin16", "Skin17", "Purple", "Skin18"}), 12, 45, (new String[] {"Cargo: Any."})),
	gsco52millgon("52millgon", gsco52millgon.class, ItemIDs.minecart52millgon.item, EnumTrainType.Gondola, 3.0, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Lime", "Red", "Skin16", "Black", "Grey", "Purple", "Brown", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 12, 45, (new String[] {"Cargo: Any."})),
	AAR50TonHopper("AAR 50 Ton Hopper", AAR50TonHopper.class, ItemIDs.minecartAAR50TonHopper.item, EnumTrainType.OpenTopHopper, 2, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Purple", "Skin16"}), 16, 27, null),
	AAR70TonHopper("AAR 70 Ton Hopper", AAR70TonHopper.class, ItemIDs.minecartAAR70TonHopper.item, EnumTrainType.OpenTopHopper, 2, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Magenta", "Skin16", "Skin17", "Skin18"}), 16, 27, null),
	MaPa35FootGondola("MaPa_35Gondola", MaPa35FootGondola.class, ItemIDs.minecartMaPa35FootGondola.item, EnumTrainType.Gondola, 3.0, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Grey"}), 12, 27, (new String[] {"Cargo: Any."})),

	DOT11111000( "DOT11000", DOT11111000.class, ItemIDs.minecart11000DOT111.item, EnumTrainType.Tankcar, 0, 0, 2.25, 0, 0, 0, 0, 0, 41000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Grey"}), 16, 0),
	DOT11120600( "DOT20600", DOT11120600.class, ItemIDs.minecart20600DOT111.item, EnumTrainType.Tankcar, 0, 0, 3, 0, 0, 0, 0, 0, 78000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black", "White", "Green", "LightGrey"}), 14, 0),
	DOT11129080( "DOT29080", DOT11129080.class, ItemIDs.minecart29080DOT111.item, EnumTrainType.Tankcar, 0, 0, 3.25, 0, 0, 0, 0, 0, 110000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange", "LightGrey", "White", "Grey", "Skin16", "Skin17", "Skin18"}), 12, 0),
	DOT11117600( "DOT17600", DOT11117600.class, ItemIDs.minecart17600DOT111.item, EnumTrainType.Tankcar, 0, 0, 2.5, 0, 0, 0, 0, 0, 67000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Black", "Blue", "LightGrey", "Grey", "Yellow", "Brown", "Purple", "Skin16", "Skin17", "Skin18"}), 16, 0),
	NATX30600( "NATX30600", NATX30600.class, ItemIDs.minecartNATX30600.item, EnumTrainType.Tankcar, 0, 0, 3.25, 0, 0, 0, 0, 0, 116000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Green", "Red", "Yellow", "Pink", "Skin16", "Skin17", "LightBlue", "Skin18"}), 12, 0),
	gatc10000( "gatc10000", GATC10000.class, ItemIDs.minecartgatc10000.item, EnumTrainType.Tankcar, 0, 0, 2, 0, 0, 0, 0, 0, 38000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "LightBlue", "Grey", "Skin18", "Skin19"}), 15, 0),
	DUPX39200( "DUPX39200", DUPX39200.class, ItemIDs.minecartDUPX39200.item, EnumTrainType.Tankcar, 0, 0, 5, 0, 0, 0, 0, 0, 148000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "White", "Green", "Black"}), 10, 0),

	CoffinCar( "CoffinCar", CoffinCar.class, ItemIDs.minecartCoffinCar.item, EnumTrainType.Tankcar, 0, 0, 1.5, 0, 0, 0, 0, 0, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 14, 0),
	SkeletonCar("Skeleton", SkeletonLogCar.class, ItemIDs.minecartSkeletonLogCar.item, EnumTrainType.LogFlat, 1, TraincraftUtil.getBytesFromColors(new String[]{"Black","Grey", "LightGrey"}), 18, 18, null),
	EarlyFlat("EarlyFlat", EarlyFlat.class, ItemIDs.minecartEarlyFlat.item, EnumTrainType.Flatcars,0.7, null, 18, 18, (new String[] {"Cargo: Any."})),

	Gunderson89FootAutorack("89ftAutorack", Gunderson89ftAutorack.class, ItemIDs.minecartGunderson89ftAutorack.item, EnumTrainType.Autorack, 4.75, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "LightGrey", "Blue", "Black", "Brown", "Pink"}), 8, 54, (new String[] {"Cargo: Any"})),
	Gunderson89FootFlat("89ftFlat", Gunderson89ftFlat.class, ItemIDs.minecartGunderson89ftFlat.item, EnumTrainType.Flatcars, 3.25, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Purple"}), 8, 54, (new String[] {"Cargo: Any"})),
	StampedeRack("StampedeRack", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.StampedeRack.class, ItemIDs.minecartStampedeRack.item, "Livestock Car", 0, 0, 3.75, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Brown"}), 10, 0),
	HuskyStackWellcar("40ftHuskyStackWellcar", HuskyStack2.class, ItemIDs.minecartHuskyStackWellcar.item, EnumTrainType.Wellcar, 3, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Blue", "Brown", "Green", "Pink", "Skin16"}), 10,54, (new String[] {"Will carry containers (for REAL) Eventually!"})),

	IngotPig("IngotPig", IngotPig.class, ItemIDs.minecartIngotPig.item, EnumTrainType.Other, 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Black"}), 18, 9, null),
	SteelSlabFlat("SteelSlabFlat", SteelSlabFlat.class, ItemIDs.minecartSteelSlabFlat.item, EnumTrainType.Other, 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Black"}), 16, 9, (new String[] {"Cargo: steel and metal ig."})),
	EvansCoilCar("EvansCoilCar", EvansCoilCar.class, ItemIDs.minecartEvansCoilCar.item, EnumTrainType.Other, 3, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23"}), 16, 36, (new String[] {"Cargo: Steel Coils & Likewise"})),


	// Passenger //
	pch120commute("PCH-120 Commute", PCH120Commute.class, ItemIDs.minecartPCH120Commute.item, EnumTrainType.Electric,1400, 120, 0, 55, 0, 160, 0.8, 0.985, 0, TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green", "Lime"}), 14, -2.7),
	pch120coach("PCH-120 Commute Car", PCH120Coach.class, ItemIDs.minecartPCH120Car.item, EnumTrainType.Passenger,0, 0, 2, 0, 0, 0, 0, 0, 0,TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green", "Lime", "Purple", "Pink", "Yellow"}), 14, 0),

	pch130commute2("PCH-130 Commute2", PCH130Commute2.class, ItemIDs.minecartPCH130Commute2.item, EnumTrainType.Electric,1450, 130, 0, 60, 0, 160, 0.9, 0.995, 0, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 18, -3.7 ),
	pch130car2("PCH-130 Commute2 Car", PCH130Coach.class, ItemIDs.minecartPCH130Car2.item, EnumTrainType.Passenger,0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 10,0),

	PCH100H("PCH-100H", PCH100H.class, ItemIDs.minecartExperimentalHydrogenTrain.item, EnumTrainType.Hydrogen,900, 100, 0, 6, 0, 160, 0.8, 0.985, 7000, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue", "Lime", "Red"}), 18,  -2.6, (new String[] {"Powered by Mekanism Hydrogen"})),
	PCH100Coach("PCH-100H Coach", PCH100HCoach.class, ItemIDs.minecartPCH100HCoach.item, EnumTrainType.Passenger,0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue", "Lime", "Red"}), 10, 0),

	aipkitExplorer("Aipkit Explorer", AipkitExplorer.class, ItemIDs.minecartAipkitExplorer.item, EnumTrainType.Passenger,0, 0, 2, 0, 0, 0, 0, 0, 0, null, 10, 0),
	aipkitExplorer2("Aipkit Explorer-II", AipkitExplorer2.class, ItemIDs.minecartAipkitExplorer2.item, EnumTrainType.Passenger,0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Grey","Lime"}), 10, 0),

	PSRPO("PSRPO", PSRPO.class, ItemIDs.minecartPSRPO.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Cyan", "Orange"}), 12, 27,null),
	PS85Baggage("Freight PS 85 Baggage", PS85Baggage.class, ItemIDs.minecartPS85Baggage.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Orange"}), 10, 27, null),
	PSCombine("PS Combine Coach", PSCombine.class, ItemIDs.minecartPScombine.item, EnumTrainType.Passenger_Combine, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Orange", "LightGrey", "Grey", "White", "Red"}), 10, 0, 18, null),
	PS52SeatCoach("PS 52 Seat Coach", PS52SeatCoach.class, ItemIDs.minecartPS52seatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "LightBlue", "Yellow", "Orange", "Cyan", "Grey", "LightGrey", "Purple", "Green", "Lime", "White", "Red"}), 10, 0),
	PSDamnitAnotherDiner("PS Center Diner 2", PSDamnitAnotherDiner.class, ItemIDs.minecartPSDamnitAnotherDiner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Blue", "Cyan"}), 10, 0),
	PSSleeper565("PS 5-6-5 Sleeper", PSSleeper565.class, ItemIDs.minecartPSSleeper565.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Brown", "Orange", "LightBlue", "Grey", "Yellow", "LightGrey"}), 10, 0),
	PSSleeper565DRGW("PS 5-6-5 Sleeper DRGW Edition", PSSleeper565DRGW.class, ItemIDs.minecartPSSleeper565DRGW.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange"}), 10, 0),
	PSLunchCounter_Lounge("PS Lunch Counter-Lounge", PSLunchCounter_Lounge.class, ItemIDs.minecartPSLunchCounter_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Yellow", "Orange", "LightBlue", "Purple", "LightGrey", "Grey", "White", "Red"}), 10, 0, null),
	PS30SeatParlor("PS 30 Seat Parlor", PS30SeatParlor.class, ItemIDs.minecartPS30SeatParlor.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Orange", "Red"}), 10, 0, null),

	DRGWRPO620Series("D&RGW RPO 620 Series", DRGWRPO620Series.class, ItemIDs.minecartDRGWRPO620Series.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Green", "Lime", "Grey", "Purple", "Yellow"}), 12, 27,null),
	DRGWRPO630Series("D&RGW RPO 630 Series", DRGWRPO630Series.class, ItemIDs.minecartDRGWRPO630Series.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow"}), 12, 27,null),
	DRGWBaggage700Series("D&RGW Baggage 700 Series", DRGWBaggage700Series.class, ItemIDs.minecartDRGWBaggage700Series.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Green", "Lime", "Brown", "Yellow", "Black", "Grey", "LightGrey", "White", "Orange", "Purple"}), 12, 27,null),
	DRGWBaggage740Series("D&RGW Baggage 740 Series", DRGWBaggage740Series.class, ItemIDs.minecartDRGWBaggage740Series.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Black", "Brown", "Yellow", "Grey", "Magenta", "LightGrey", "White"}), 12, 27,null),
	DRGWCoach1000Series("D&RGW Coach 1000 Series", DRGWCoach1000Series.class, ItemIDs.minecartDRGWCoach1000Series.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Blue", "Black", "Yellow", "Grey"}), 12, 0),
	DRGWCoach1005Series("D&RGW Coach 1005 Series", DRGWCoach1005Series.class, ItemIDs.minecartDRGWCoach1005Series.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Black", "Grey", "LightGrey", "White", "Brown", "Red"}), 12, 0),

	PSRPOPM("PSPMRPO", PSRPOPM.class, ItemIDs.minecartPSRPOPM.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow"}), 12, 27,null),
	PS73Baggage("Freight PS 73 Baggage", PS73Baggage.class, ItemIDs.minecartPS73Baggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Green", "Red", "Magenta", "Orange"}), 12, 27, null),
	PS54SeatCoach_Lounge("PS 54 Seat Coach-Lounge", PS54SeatCoach_Lounge.class, ItemIDs.minecartPS54SeatCoach_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "LightGrey", "Grey"}), 10, 0, null),
	PS54SeatCoach_Lounge_1950("PS 54 Seat Coach-Lounge 1950", PS54SeatCoach_Lounge_1950.class, ItemIDs.minecartPS54SeatCoach_Lounge_1950.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0, null),
	PScenterDiner("PS Center Diner", PScenterDiner.class, ItemIDs.minecartPSCenterDiner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0),
	PS58SeatCoach_Observation("PS 58 Seat Coach-Observation", PS58SeatCoach_Observation.class, ItemIDs.minecartPS58SeatCoach_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Purple", "Orange", "Red", "Magenta", "Pink", "Green", "Lime", "Brown", "Black", "LightGrey", "Grey", "White", "Skin16", "Yellow"}), 10, 0, null),

	PSBMCombine("PS B&M Combine", PSBMCombine.class, ItemIDs.minecartPSBMCombine.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Brown", "Green", "Blue"}), 10, 0, 18,null),
	PSBM56SeatCoach("PS B&M 56 Seat Coach", PSBM56SeatCoach.class, ItemIDs.minecartPSBM56SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "LightGrey", "Grey", "Brown", "Red", "Pink", "Green", "Lime", "Yellow", "Blue", "Cyan", "LightBlue", "Purple", "White", "Black"}), 10, 0, null),
	PSBMDiner_Lounge("PS B&M Diner_Lounge", PSBMDiner_Lounge.class, ItemIDs.minecartPSBMDiner_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Brown", "Green", "Blue", "Cyan", "LightGrey"}), 10, 0, null),

	ACFGNRPO_30("AC&F GN RPO (30' mail)", ACFGNRPO_30.class, ItemIDs.minecartACFGNRPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Green", "Lime"}), 10, 27,null),
	ACFGN60SeatCoach("AC&F GN 60 Seat Coach", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN60SeatCoach.class, ItemIDs.minecartACFGN60SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Brown", "LightBlue", "Green", "LightGrey", "Black", "White", "Cyan", "Blue", "Lime", "Grey", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}), 10, 0, null),
	ACFGNDinerObservation("AC&F GN Diner-Observation", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGNDinerObservation.class, ItemIDs.minecartACFGNDiner_Observation.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green"}), 10, 27,null),
	ACFGN28SeatCoach_Dinette("AC&F GN 28 Seat Coach-Dinette", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN28SeatCoach_Dinette.class, ItemIDs.minecartACFGN28SeatCoach_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Blue", "White"}), 10, 0, null),
	ACFGN1DR_17SeatParlorObservation("AC&F GN 1DR-17 Seat Parlor-Observation", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACFGN1DR_17SeatParlorObservation.class, ItemIDs.minecartACFGN1DR_17SeatParlor_Observation.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Blue", "White"}), 10, 27,null),
	PSGNRPO_30("PS GN RPO (30' mail)", PSGNRPO_30.class, ItemIDs.minecartPSGNRPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Yellow", "Lime"}), 10, 27,null),

	OB84SeatCoach("OB 84 Seat Coach", OB84SeatCoach.class, ItemIDs.minecartOB84SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Brown", "Black", "White", "Grey", "LightBlue", "Yellow", "Magenta", "Red", "Pink", "Blue", "LightGrey", "Purple", "Cyan", "Orange", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}), 10, 0, null),
	OB92SeatCoach("OB 92 Seat Coach", OB92SeatCoach.class, ItemIDs.minecartOB92SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "LightGrey", "Grey", "Brown", "Red", "Black", "White", "Yellow"}), 10, 0, null),
	OBNHGrillCar("OB NH Grill Car", OBNHGrillCar.class, ItemIDs.minecartOBNHGrillCar.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "Lime"}), 10, 0, null),
	OBNHLounge5107("OB NH Commuter Lounge 5107", OBNHLounge5107.class, ItemIDs.minecartOBNHLounge5107.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Red"}), 10, 0, null),
	OBBaggage_52SeatDividedCoach("OB Baggage-52 Seat Divided Coach", OBBaggage_52SeatDividedCoach.class, ItemIDs.minecartOBBaggage_52SeatDividedCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "LightGrey", "Lime", "Grey", "Yellow"}), 10, 0, 18, null),
	OB76SeatDividedCoach("OB 76 Seat Divided Coach", OB76SeatDividedCoach.class, ItemIDs.minecartOB76SeatDividedCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Grey", "Yellow", "Lime", "Black", "Blue", "Orange", "Brown", "LightGrey", "Red", "Cyan"}), 10, 0, null),
	OBLV82_92SeatCoach("OB LV 82/92 Seat Coach", OBLV82_92SeatCoach.class, ItemIDs.minecartOBLV82_92SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "White", "Pink"}), 10, 0, null),
	OBRPO15("OB RPO (15' mail)", OBRPO15.class, ItemIDs.minecartOBRPO15.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Grey", "Cyan", "LightGrey", "Blue"}), 12, 27,null),
	OB24SeatCoach_Dinette("OB 24 Seat Coach-Dinette", OB24SeatCoach_Dinette.class, ItemIDs.minecartOB24SeatCoach_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Green", "Pink", "Lime", "Grey", "Blue"}), 10, 0, null),
	OBBAR52SeatCoach_Dinette("OB BAR 52 Seat Coach-Dinette", OBBAR52SeatCoach_Dinette.class, ItemIDs.minecartOBBAR52SeatCoach_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue"}), 10, 0, null),

	PSCNW56SeatCoach("PS CNW 56 Seat Coach", PSCNW56SeatCoach.class, ItemIDs.minecartPSCNW56SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Skin19", "Green", "Lime", "Skin20", "White", "Brown", "Skin21", "Grey", "LightGrey", "Skin22", "Skin16", "Skin17", "Skin18", "Purple", "Orange", "Red", "Blue", "Skin23", "Cyan", "LightBlue", "Pink", "Magenta"}), 10, 0, null),
	PSCNW48SeatCoach_Lounge("PS CNW 48 Seat Coach-Lounge", PSCNW48SeatCoach_Lounge.class, ItemIDs.minecartPSCNW48SeatCoachLounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black"}), 10, 0, null),
	PSCNW20SeatCoach_Lounge("PS CNW 20 Seat Coach-Lounge", PSCNW20SeatCoach_Lounge.class, ItemIDs.minecartPSCNW20SeatCoachLounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black"}), 10, 0, null),
	PSCNW36SeatCoach_Dinette("PS CNW 36 Seat Coach-Dinette", PSCNW36SeatCoach_Dinette.class, ItemIDs.minecartPSCNW36SeatCoach_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW56SeatDiner("PS CNW 56 Seat Diner", PSCNW56SeatDiner.class, ItemIDs.minecartPSCNW56SeatDiner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green"}), 10, 0, null),
	PSCNW48SeatDiner("PS CNW 48 Seat Diner", PSCNW48SeatDiner.class, ItemIDs.minecartPSCNW48SeatDiner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW1DR_22SeatParlor("PS CNW 1DR-22 Seat Parlor", PSCNW1DR_22SeatParlor.class, ItemIDs.minecartPSCNW1DR_22SeatParlor.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Blue", "White", "Grey", "LightBlue", "Cyan", "LightGrey", "Brown", "Orange", "Red", "Pink", "Magenta", "Purple", "Skin16"}), 10, 0, null),
	PSCNW16_1_3Sleeper("PS CNW 16-1-3 Sleeper", PSCNW16_1_3Sleeper.class, ItemIDs.minecartPSCNW16_1_3Sleeper.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green"}), 10, 0, null),
	PSCNW12SeatParlor_Observation("PS CNW 12 Seat Parlor-Observation", PSCNW12SeatParlor_Observation.class, ItemIDs.minecartPSCNW12SeatParlor_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime"}), 10, 0, null),
	PSCNWRPO15("PS CNW RPO(15')", PSCNWRPO15.class, ItemIDs.minecartPSCNWRPO15.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 27,null),
	PSCNWRPO60("PS CNW RPO(60')", PSCNWRPO60.class, ItemIDs.minecartPSCNWRPO60.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green", "Orange", "Red", "Grey", "LightGrey", "White", "Magenta", "Brown", "Lime"}), 10, 27,null),
	PSCNWBaggage_LC_Lounge("PS CNW Baggage-LC-Lounge", PSCNWBaggage_LC_Lounge.class, ItemIDs.minecartPSCNWBaggage_LC_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey", "White", "Magenta"}), 10, 0, 18,null),
	PSCNWRPO15_Baggage_LC_Lounge("PS CNW RPO(15')-Baggage-LC-Lounge", PSCNWRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCNWRPO15_Baggage_LC_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey"}), 10, 0, 18, null),
	PSCNWBaggage_LC_Diner("PS CNW Baggage-LC-Diner", PSCNWBaggage_LC_Diner.class, ItemIDs.minecartPSCNWBaggage_LC_Diner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey"}), 10, 0, 18, null),
	PSCNW20SeatCoach_Lounge_1959("PS CNW 20 Seat Coach-Lounge (1959)", PSCNW20SeatCoach_Lounge_1959.class, ItemIDs.minecartPSCNW20SeatCoachLounge_1959.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow"}), 10, 0, null),
	PSCNWCommuterLounge("PS CNW Commuter Lounge", PSCNWCommuterLounge.class, ItemIDs.minecartPSCNWCommuterLounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW27SeatParlor_Observation("PS CNW 27 Seat Parlor-Observation", PSCNW27SeatParlor_Observation.class, ItemIDs.minecartPSCNW27SeatParlor_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green", "Black", "Lime"}), 10, 0, null),

	BuddRDG56SeatCoach_Lounge("Budd RDG 56 Seat Coach-Lounge", BuddRDG56SeatCoach_Lounge.class, ItemIDs.minecartBuddRDG56SeatCoachLounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey"}), 10, 0, null),
	BuddRDGDiner_Lounge("Budd RDG Diner-Lounge", BuddRDGDiner_Lounge.class, ItemIDs.minecartBuddRDGDiner_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0, null),
	BuddRDG56SeatCoach_Observation("Budd RDG 56 Seat Coach-Observation", BuddRDG56SeatCoach_Observation.class, ItemIDs.minecartBuddRDG56SeatCoach_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey", "LightBlue", "White"}), 10, 0, null),

	BuddCRIP52SeatCoach("Budd CRIP 52 Seat Coach", BuddCRIP52SeatCoach.class, ItemIDs.minecartBuddCRIP52SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "Blue", "White", "Cyan"}), 10, 0, null),

	BuddNYC52SeatCoach("Budd NYC 52 Seat Coach", BuddNYC52SeatCoach.class, ItemIDs.minecartBuddNYC52SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Red"}), 10, 0, null),

	BuddCBQ52SeatCoach("Budd CB&Q 52 Seat Coach", BuddCBQ52SeatCoach.class, ItemIDs.minecartBuddCBQ52SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Brown", "Purple"}), 10, 0, null),
	BuddDome46SeatCoach("Budd Dome-46 Seat Coach", BuddDome46SeatCoach.class, ItemIDs.minecartBuddDome46SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Green", "Lime", "Orange", "Blue", "Black", "Magenta", "Yellow", "Red", "Pink", "Cyan", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}), 10, 0),
	BuddCBQDome50SeatCoach("Budd CB&Q Dome-50 Seat Coach", BuddCBQDome50SeatCoach.class, ItemIDs.minecartBuddCBQDome50SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey"}), 10, 0),
	BuddPrewarBaggage("Budd Prewar Baggage", BuddPrewarBaggage.class, ItemIDs.minecartBuddPrewarBaggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Red", "Yellow", "Black"}), 12, 27, null),

	BuddATSF52SeatCoach("Budd ATSF 52 Seat Coach", BuddATSF52SeatCoach.class, ItemIDs.minecartBuddATSF52SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Green", "Pink", "Blue", "Lime", "Purple", "Brown", "Grey"}), 10, 0, null),
	BuddATSF48SeatCoach("Budd ATSF 48 Seat Coach", BuddATSF48SeatCoach.class, ItemIDs.minecartBuddATSF48SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Cyan"}), 10, 0, null),
	BuddATSF50SeatCoach_observation("Budd ATSF 50 Seat Coach-Observation", BuddATSF50SeatCoach_Observation.class, ItemIDs.minecartBuddATSF50SeatCoachObservation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey"}), 10, 0, null),
	BuddATSF34SeatParlor_observation("Budd ATSF 34 Seat Parlor-Observation", BuddATSF34SeatParlor_Observation.class, ItemIDs.minecartBuddATSF34SeatParlorObservation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Brown", "Blue"}), 10, 0, null),
	BuddATSF58SeatCoach_observation("Budd ATSF 58 Seat Coach-Observation", BuddATSF58SeatCoach_Observation.class, ItemIDs.minecartBuddATSF58SeatCoachObservation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Cyan", "Purple"}), 10, 0, null),
	PSATSF50SeatCoach_observation("PS ATSF 50 Seat Coach-Observation", PSATSF50SeatCoach_Observation.class, ItemIDs.minecartPSATSF50SeatCoachObservation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "Blue", "Orange"}), 10, 0, null),

	ACF_SP_98seatcoach("AC&F SP 98 Seat Coach", ACF_SP_98seatcoach.class, ItemIDs.minecartACF_SP_98seatcoach.item, EnumTrainType.Passenger, 0, 0, 5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "LightGrey", "Grey", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20","Skin21","Skin22"}), 10, 0, null),

	ACFUPRPO60("AC&F UP RPO(60')", ACFUPRPO60.class, ItemIDs.minecartACFUPRPO60.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Orange", "Brown", "Green", "Blue", "Lime", "Grey", "LightGrey", "Black", "White"}), 10, 27,null),

	BuddDome54SeatCoach("Budd Dome-54 Seat Coach", BuddDome54SeatCoach.class, ItemIDs.minecartBuddDome54SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Grey", "LightGrey", "White", "Red"}), 10, 0),

	PSCEIRPO15_Baggage_LC_Lounge("PS C&EI RPO(15')-Baggage-LC-Lounge", PSCEIRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCEIRPO15_Baggage_LC_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "Red"}), 10, 0, 18, null),
	PSCEIRPO15_Baggage_38SeatCoach("PS C&EI RPO(15')-Baggage-38 Seat Coach", PSCEIRPO15_Baggage_38SeatCoach.class, ItemIDs.minecartPSCEIRPO15_Baggage_38SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "Red"}), 10, 0, 18, null),
	PSCEI60SeatCoach("PS C&EI 60 Seat Coach", PSCEI60SeatCoach.class, ItemIDs.minecartPSCEI60SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "LightBlue", "Purple", "Yellow", "Pink", "Grey", "Green", "LightGrey", "Black", "Lime", "Brown", "Magenta", "Red"}), 10, 0, null),
	PSCEIDiner("PS C&EI Diner", PSCEIDiner.class, ItemIDs.minecartPSCEIDiner.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Red"}), 10, 0, null),
	PSCEI1DR_28SeatParlor_Observation("PS C&EI 1DR-28 Seat Parlor-Observation", PSCEI1DR_28SeatParlor_Observation.class, ItemIDs.minecartPSCEI1DR28SeatParlorObservation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Red"}), 10, 0, null),

	OBHWNH5570_5589Baggage("OB HW NH 5570-5589 Series Baggage", OBHWNH5570_5589Baggage.class, ItemIDs.minecartOBHWNH5570_5589Baggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Yellow", "Grey", "LightGrey", "Black", "Red"}), 12, 27,null),

	BuddCN68SeatCoach_Observation("Budd CN 68 Seat Coach-Observation", BuddCN68SeatCoach_Observation.class, ItemIDs.minecartBuddCN68SeatCoach_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"}), 10, 0, null),
	BuddCNCoach("Budd CN 72 or 54 Seat Coach-Observation", BuddCNCoach.class, ItemIDs.minecartBuddCNCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"}), 10, 0, null),
	BuddCNDiner_Lounge("Budd CN Diner-Lounge", BuddCNDiner_Lounge.class, ItemIDs.minecartBuddCNDiner_Lounge.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey"}), 10, 0, null),
	BuddCN39SeatParlor_Observation("Budd CN 39 Seat Parlor-Observation", BuddCN39SeatParlor_Observation.class, ItemIDs.minecartBuddCN39SeatParlor_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red"}), 10, 0, null),
	BuddCN59SeatCoach_Observation("Budd CN 59 Seat Coach-Observation", BuddCN59SeatCoach_Observation.class, ItemIDs.minecartBuddCN59SeatCoach_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey"}), 10, 0, null),
	NSCCNBaggage("NSC CN Baggage", NSCCNBaggage.class, ItemIDs.minecartNSCCNBaggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "LightBlue", "Black", "Lime", "Orange", "Red", "Pink", "Grey", "LightGrey", "Brown", "White", "Blue", "Cyan", "Purple", "Magenta", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 12, 27, null),

	PSSOUBaggage("PS SOU Baggage", PSSOUBaggage.class, ItemIDs.minecartPSSOUBaggage.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Black", "Brown", "Magenta"}), 10, 27, null),
	PSSOURPO_30("PS SOU RPO (30' mail)", PSSOURPO_30.class, ItemIDs.minecartPSSOURPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Black"}), 10, 27,null),

	PRECOPendulumCoach("PRECO Pendulum Coach", PRECOPendulumCoach.class, ItemIDs.minecartPRECOPendulumCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Black", "White", "Grey", "LightGrey", "Magenta", "LightBlue", "Cyan", "Lime", "Orange", "Green", "Red"}), 10, 0, null),

	PSFNCCBaggage_Dinette("PS FNCC Baggage-Dinette", PSFNCCBaggage_Dinette.class, ItemIDs.minecartPSFNCCBaggage_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green"}), 10, 0, null),

	NYCPrewar56SeatCoach("NYC Prewar 56 Seat Coach", NYCPrewar56SeatCoach.class, ItemIDs.minecartNYCPrewar56SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Red", "Grey", "Magenta", "LightGrey", "White", "Blue", "Lime", "Cyan", "Brown", "Pink", "Yellow", "Purple", "Black", "Orange", "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39"}), 10, 0),

	MILWPrewarBaggage("MILW Prewar Baggage", MILWPrewarBaggage.class, ItemIDs.minecartMILWPrewarBaggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30"}), 12, 27, null),
	MILW1935Baggage_Dinette("MILW 1935 Baggage-Dinette", MILW1935Baggage_Dinette.class, ItemIDs.minecartMILW1935Baggage_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black"}), 12, 0, 18,null),
	MILW1935Tap_Dinette("MILW 1935 Tap-Dinette", MILW1935Tap_Dinette.class, ItemIDs.minecartMILW1935Tap_Dinette.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"}), 12, 0, null),
	MILW1935_48SeatCoach("MILW 1935 48 Seat Coach", MILW1935_48SeatCoach.class, ItemIDs.minecartMILW1935_48SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink", "Lime"}), 10, 0, null),
	MILW1935_22SeatParlor("MILW 1935 22 Seat Parlor", MILW1935_22SeatParlor.class, ItemIDs.minecartMILW1935_22SeatParlor.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green"}), 10, 0, null),
	MILW1935_21SeatParlor_Observation("MILW 1935 21 Seat Parlor Observation", MILW1935_21SeatParlor_Observation.class, ItemIDs.minecartMILW1935_21SeatParlor_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple"}), 10, 0, null),
	MILW1935_44SeatCoach_Observation("MILW 1935 44 Seat Coach Observation", MILW1935_44SeatCoach_Observation.class, ItemIDs.minecartMILW1935_44SeatCoach_Observation.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black"}), 10, 0, null),
	MILW1935Dorm_56SeatCoach("MILW 1935 Dormitory-56 Seat Coach", MILW1935Dorm_56SeatCoach.class, ItemIDs.minecartMILW1935Dorm_56SeatCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"}), 10, 0, null),

	ACF_LN_KCS60SeatDividedCoach("AC&F L&N and KCS 60 Seat Divided Coach", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.ACF_LN_KCS60SeatDividedCoach.class, ItemIDs.minecartACF_LN_KCS60SeatDividedCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple"}), 10, 0, null),
	LNCoach2551Series("L&N Coach 2551 Series", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.LNCoach2551Series.class, ItemIDs.minecartLNCoach2551Series.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"}), 10, 0, null),

	ACF_MON_LightweightCoach("Monon 21 Series Lightweight Coach", MON_LightweightCoach.class, ItemIDs.minecartMON_lightweightCoach.item, EnumTrainType.Passenger, 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey", "Pink"}), 10, 0, null),

	amfleet("Amfleet", Amfleet.class, ItemIDs.minecartAmfleet.item, EnumTrainType.Passenger, 3, TraincraftUtil.getBytesFromColors(new String[] {"Red", "White", "LightGrey", "Grey", "Blue", "LightBlue", "Green", "Skin16", "Skin17", "Skin18", "Skin19"}), 14, 0, null),
	amfleet2("Amfleet2", Amfleet2.class, ItemIDs.minecartAmfleet2.item, EnumTrainType.Passenger, 3, TraincraftUtil.getBytesFromColors(new String[] {"Grey" ,"LightGrey", "Red", "Blue",  "LightBlue", "Skin16", "Skin17", "Skin18", "Skin19"}), 14, 0, null),
	amfleetcab("AmfleetCab", AmfleetCab.class, ItemIDs.minecartAmfleetCab.item, EnumTrainType.Passenger, 3, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "LightGrey", "LightBlue", "White", "Skin16", "Skin17", "Skin18", "Skin19"}), 14, 0, null),
	amcafe("AmCafe", AmCafe.class, ItemIDs.minecartAmCafe.item, EnumTrainType.Passenger, 3, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Red", "White", "Grey", "Blue", "LightBlue", "LightGrey", "Skin16", "Skin17", "Skin18", "Skin19"}), 14, 0, null),
	amcafe2("AmCafe2", AmCafe2.class, ItemIDs.minecartAmCafe2.item, EnumTrainType.Passenger, 3, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Red", "Blue", "Skin16", "Skin17", "Skin18", "Skin19"}), 14, 0, null),

	PEcoach("PEcoach", PEcoach.class, ItemIDs.minecartPEcooch.item, "festive passenger",  0, 0, 6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Green", "Lime", "Skin16", "Purple"}), 10, 0),
	PEobserve("PEobserve", PEobserve.class, ItemIDs.minecartPEobserve.item, "festive passenger",  0, 0, 6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0),

	//or as i like to call it the cabussy//
	WVcaboose("WVcaboose",WVcaboose.class, ItemIDs.minecartWVcaboose.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Lime", "Cyan", "White", "Purple", "Skin16"}), 16, 0, null),
	HBC1C("HBC1C", HBC1Cboose.class, ItemIDs.minecartHBC1Ccaboose.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Purple", "Magenta", "Skin18", "Skin19"}), 16, 0, null),
	HBC1B("HBC1B", HBC1Bboose.class, ItemIDs.minecartHBC1Bcaboose.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Pink", "Purple", "Green", "Skin17", "Skin18"}), 16, 0, null),
	DRGWCaboose("DRGWCaboose", DRGWboose.class, ItemIDs.minecartDRGWCaboose.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Brown", "Green", "Lime", "Yellow", "Cyan", "Black", "White", "Magenta", "Red", "Orange", "Pink", "Skin16", "Purple"}), 16, 0, null),
	ICC_Bobber("ICC_Bobber", ICC_Bobber.class, ItemIDs.minecartICC_Bobber.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Green", "Blue"}), 16, 0, null),
	ICCBaywindowWP("ICCBaywindowWP", ICCBaywindowWP.class, ItemIDs.minecartICCBaywindowWP.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "Skin16", "Green", "Cyan", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21"}), 16, 0, null),
	CA11("CA11", CA11.class, ItemIDs.minecartCA11.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Cyan", "Skin17", "Skin18", "Purple", "Skin19"}), 16, 0, null),
	WPShops600Series("WPShops600Series",WPShops600Series.class, ItemIDs.minecartWPShops600Series.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Brown", "Yellow", "Green"}), 16, 0, null),
	CDCScaboose("CDCScaboose", CDCScaboose.class, ItemIDs.minecartCDCScaboose.item, EnumTrainType.Caboose, 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Pink", "Orange", "Brown", "Grey", "Green"}), 16, 0, null),

	//interurbans and streetcars
	W_A11("SEC W-A11", ElectricW_A11.class,  ItemIDs.minecartW_A11.item, EnumTrainType.Electric, 200, 80, 0, 10, 0, 170, 0.7, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green"}), 10, -2.5, null),
	W_A55("SEC W-A55", ElectricW_A55.class,  ItemIDs.minecartW_A55.item, EnumTrainType.Electric, 200, 80, 0, 10, 0, 170, 0.7, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 10, -2.55, null),
	W_A55_Combine("SEC W-A55 Combine", ElectricW_A55_Combine.class,  ItemIDs.minecartW_A55_Combine.item, EnumTrainType.Electric, 200, 80, 0, 10, 0, 170, 0.7, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 10, -2.55, null),


	//meme
	BigMeme("BigMeme", BigMeme.class, ItemIDs.minecartBigMeme.item, "awesome", 1, 200, 0, 50, 0, 0, 0.9, 0.9, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}),16 , -1.1),
	BombCart("Payload", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.funny.BombCart.class, ItemIDs.minecartBombCart.item, "misc", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Red", "Black", "Blue", "Cyan", "Green", "Grey", "Brown", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Yellow", "White"}), 18, 0, (new String[] {"Who is not pushing ze Cart!?"})),
	Thanos("Thanos", Thanos.class, ItemIDs.minecartThanos.item, EnumTrainType.Electric, 696969, 6210000, 0, 69, 0, 1, 6, 30, 0, null, 18, -1, (new String[] {"You don't want to mess with the Universe's Best"})),
	TGVmobile("TGVmobile", DieselTGVmobile.class, ItemIDs.minecartTGVMobile.item, EnumTrainType.Diesel, 200, 350, 0, 10, 0, 140, 0.9, 0.9, 1000,null,18, 2.7),
	HHgregg("HHgregg", DieselHHgregg.class, ItemIDs.minecartHHgregg.item, "awesome", 9932, 299, 0, 42, 0, 48, 0.9, 0.9, 7000, null, 10, -2, (new String[] {"hhhgregg, Panasonic Blu-ray nintey-nine dollars, thirty-two inch LCD TV two-nintey nine, LG fourty-two inch HD TV only four eighty-nine, everything on sale during chirstmas in"})),

	//dont speak americano
	//Class345("Class 345", ElectricClass345.class, ItemIDs.minecartClass345engine.item, EnumTrainType.Electric, 1500, 290, 0,6, 0, 100, 2, 1.5, 1000, null, 18, -3),
	//Class345Coach("Class345", Class345Coach.class, ItemIDs.minecartClass345car.item, EnumTrainType.Passenger, 0, 0, 1.5,0 , 0, 0, 0,0,0,null,0,0),
	//LUengine("London Underground Engine", ElectricLUengine.class, ItemIDs.minecartLUengine.item, EnumTrainType.Electric, 600, 100, 0, 10, 0, 100, 0.7, 0.8, 1000, null, 18, -2),
	//LUpassenger("London Underground Passenger Car", LUpassenger.class, ItemIDs.minecartLUcar.item, EnumTrainType.Passenger, 0.3, null, 0, 0, null),
	Class74("Class74",ElectricClass74.class, ItemIDs.minecartClass74.item, EnumTrainType.Electric, 2426, 140, 0, 50, 0, 10, 0.6, 0.7, 13, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Purple", "Red", "Skin16", "Skin17"}), 10, -2, (new String[] {"Not BAP, but gets to be included"})),
	TwoBil("TwoBil",ElectricTwoBil.class, ItemIDs.minecartTwoBil.item, EnumTrainType.Electric, 428, 121, 0, 7, 0, 0, 0.5, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"}), 11, -3.15, (new String[] {"Not BAP, but gets to be included"})),
	TwoBilTail("TwoBilTail", PassengerTwoBilTail.class, ItemIDs.minecartTwoBilTail.item, EnumTrainType.Passenger, 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),
	FourCor("FourCor",ElectricFourCor.class, ItemIDs.minecartFourCor.item, EnumTrainType.Electric, 900, 121, 0, 7, 0, 0, 0.5, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"}), 11, -3.6, (new String[] {"Not BAP, but gets to be included"})),
	FourCorTrailerComposite("FourCorTrailerComposite", PassengerFourCorTrailerComposite.class, ItemIDs.minecartFourCorTrailerComposite.item, EnumTrainType.Passenger, 0, 0, 1.6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),
	FourCorTrailerSecond("FourCorTrailerSecond", PassengerFourCorTrailerSecond.class, ItemIDs.minecartFourCorTrailerSecond.item, EnumTrainType.Passenger, 0, 0, 1.6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),
	FourBuf("FourBuf", PassengerFourBuf.class, ItemIDs.minecartFourBuf.item, EnumTrainType.Passenger, 0, 0, 1.7, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Purple", "LightGrey", "Grey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),
	FourCorTail("FourCorTail", PassengerFourCorTail.class, ItemIDs.minecartFourCorTail.item, EnumTrainType.Passenger, 0, 0, 1.8, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGrey", "Grey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),
	tenderNS3700("Tender NS 3700", EntityTenderNS3700.class, ItemIDs.minecartTenderNS3700.item,EnumTrainType.Tender,0,0,4.3,0,0,0,0,0,16000,null,18,0, (new String[] {"Not BAP, but gets to be included"})),
	locoSteamNS3700Class("Loco Steam NS 3700 Class", EntityLocoSteamNS3700Class.class, ItemIDs.minecartLocoNS3700Class.item,EnumTrainType.Steam, 1286, 110, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -2.6, (new String[] {"Not BAP, but gets to be included"})),

	KawasakiLRV("KawasakiLRV", ElectricKawasakiLRV.class,  ItemIDs.minecartKawasakiLRV.item, EnumTrainType.Electric, 200, 80, 0, 10, 0, 170, 0.7, 0.9, 0, null, 10, -3, (new String[] {"Not BAP, but gets to be included"})),
	CQ310PO("CQ310PO", ElectricCQ310PO.class,  ItemIDs.minecartCQ310PO.item, EnumTrainType.Electric, 350, 100, 0, 10, 0, 170, 0.7, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black", "Skin16"}), 10, -3, (new String[] {"Not BAP, but gets to be included"})),
	CQ310PA("CQ310PA", CQ310PA.class, ItemIDs.minecartCQ310PA.item, EnumTrainType.Passenger, 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black", "Skin16"}), 18, 0, (new String[] {"Not BAP, but gets to be included"})),
	PCC("PCC", ElectricPCC.class,  ItemIDs.minecartPCC.item, EnumTrainType.Electric, 220, 80, 0, 10, 0, 170, 0.7, 0.875, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "White"}), 10, -3, (new String[] {"Not BAP, but gets to be included"})),

	//old and extras
	geometryCar("NXTrack Geometry Car", ExperimentalGeometryCar.class, ItemIDs.minecartGeometryCar.item, "geometry car", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey"}), 18, 0, (new String[] {"Checks the railroad for things up to standard"})),
	HighrailTruck("Highrail Truck", DieselHighrailTruck.class, ItemIDs.minecartHighrailTruck.item, EnumTrainType.Diesel, 90, 80, 0, 10, 0, 140, 0.7, 0.8, 1000,TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "White", "LightGrey"}),18, 2.7),
	FRED("FRED", com.jcirmodelsquad.tcjcir.vehicles.rollingstock.misc.FRED.class, ItemIDs.minecartFRED.item, "misc", 0.2, null, 0, 1, (new String[] {"the least used item in the mod"})),
	//testControlCar("Test Control Car", TestControlCar.class, ItemIDs.testControlCar.item, EnumTrainType.Passenger, 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey"}), 18, 0),
	//Hustler("Hustler", DieselHustler.class, ItemIDs.minecartHustler.item, EnumTrainType.Diesel, 150, 30, 0, 50, 0, 170, 0.6, 0.7, 9000,  TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Black", "Blue", "Brown"}), 10, -2),
	BoulderWagon("BoulderWagon", BoulderWagon.class, ItemIDs.minecartBoulderWagon.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[]{"Grey","skin16"}), 0, 9, null),
	//LogcarNP("LogcarNP",LogcarNP.class, ItemIDs.minecartLogcarNP.item,"freight",2, TraincraftUtil.getBytesFromColors(new String[]{"Brown","Black"}), 0, 18, null),
	//CF7R("CF7R", DieselCF7R.class, ItemIDs.minecartCF7R.item, EnumTrainType.Diesel, 2350, 105, 0, 5, 0, 185, 0.8, 0.9, 7000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Black"}), 10, -3, TraincraftUtil.getBytesFromColors(new String[] {"CF7 Rebuild Rebuilt"})),
	HighrailVan("Highrail Van", DieselHighrailVan.class, ItemIDs.minecartHighrailVan.item, EnumTrainType.Diesel, 90, 80, 0, 10, 0, 140, 0.7, 0.8, 1000,TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "White", "Grey", "Orange", "Green"}),18, 2.7),


	WorkdayHyrail("WorkdayHyrail", DieselWorkdayHyrail.class, ItemIDs.minecartWorkdayHyrail.item, EnumTrainType.Diesel, 110, 115, 0, 2, 0, 10, 0.95, 0.8, 2000,TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Cyan", "Yellow", "Skin17", "Orange", "Skin18"}),20, -2.0),

	;

//String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors,

	private String internalName;
	private Class entityClass;
	private Item item;
	private String trainType;
	private int MHP;
	public int maxSpeed;
	private double mass;
	private int fuelConsumption;
	private int waterConsumption;
	private int heatingTime;
	private double accelerationRate;
	private double brakeRate;
	private int tankCapacity;
	private int[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String[] additionnalTooltip;
	private int cargoCapacity;

	
	
	/**
	 *
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPosition;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition)
	{
		this(  internalName, entityClass,  item,  trainType.TrainType, MHP, maxSpeed,  mass,  fuelConsumption,  waterConsumption,  heatingTime,  accelerationRate,  brakeRate,  tankCapacity,  colors,  guiRenderScale,  bogieLocoPosition);
	}

	/**
	 * Constructor for additionnal tooltips on the item
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param MHP
	 * @param maxSpeed
	 * @param mass
	 * @param fuelConsumption
	 * @param waterConsumption
	 * @param heatingTime
	 * @param accelerationRate
	 * @param brakeRate
	 * @param tankCapacity
	 * @param colors
	 * @param guiRenderScale
	 * @param bogieLocoPositions
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String[] additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionnalTooltip=additionnalTooltip;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, int cargoCapacity, String[] additionnalTooltip)
	{
		this(internalName, entityClass, item, trainType.TrainType,MHP, maxSpeed,  mass,  fuelConsumption, waterConsumption,  heatingTime,  accelerationRate,  brakeRate,  tankCapacity, colors,  guiRenderScale,  bogieLocoPositions,  cargoCapacity,  additionnalTooltip);
	}

	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, int cargoCapacity, String[] additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionnalTooltip = additionnalTooltip;
		this.cargoCapacity = cargoCapacity;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String[] additionnalTooltip)
	{
		this( internalName, entityClass, item, trainType.TrainType, MHP, maxSpeed,  mass,  fuelConsumption, waterConsumption,  heatingTime,  accelerationRate,  brakeRate,  tankCapacity,  colors,  guiRenderScale,  bogieLocoPositions,  additionnalTooltip);
	}


	/**
	 * Constructor for freight carts
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param mass
	 * @param colors
	 * @param guiRenderScale
	 * //@param bogieLocoPositions
	 * //@param bogieUtilityPositions
	 * @param cargoCapacity
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String[] additionnalTooltip)
	{
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.mass=mass;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.additionnalTooltip=additionnalTooltip;
		this.cargoCapacity = cargoCapacity;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String[] additionnalTooltip)
	{
		this(internalName, entityClass, item, trainType.TrainType, mass, colors, guiRenderScale, cargoCapacity, additionnalTooltip);
	}

	public String getInternalName(){
		return this.internalName;
	}

	public Item getItem(){
		return this.item;
	}

	public String getTrainType(){
		return this.trainType;
	}

	@Deprecated
	public int getMHP(){
		return this.MHP;
	}

	public int getMaxSpeed(){
		return this.maxSpeed;
	}

	public double getMass(){
		return this.mass;
	}

	public int getFuelConsumption(){
		return this.fuelConsumption;
	}

	public int getWaterConsumption(){
		return this.waterConsumption;
	}

	public int getHeatingTime(){
		return this.heatingTime;
	}

	public double getAccelerationRate(){
		return this.accelerationRate;
	}

	public double getBrakeRate(){
		return this.brakeRate;
	}

	@Deprecated
	public int getTankCapacity(){
		return this.tankCapacity;
	}

	public int[] getColors(){
		return this.colors;
	}

	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}


	public Class getEntityClass() {
		return this.entityClass;
	}

	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}

	public String[] getAdditionalTooltip(){
		return this.additionnalTooltip;
	}

	public int getCargoCapacity(){
		return cargoCapacity;
	}
}
