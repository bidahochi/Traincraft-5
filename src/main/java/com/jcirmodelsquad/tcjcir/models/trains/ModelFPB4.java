//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 23:40:24
// Last changed on: 21.08.2020 - 23:40:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFPB4 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFPB4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[335];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 320, 56, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 260, 109, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 487, 121, textureX, textureY); // Box 128
		bodyModel[4] = new ModelRendererTurbo(this, 487, 153, textureX, textureY); // Box 128
		bodyModel[5] = new ModelRendererTurbo(this, 490, 144, textureX, textureY); // Box 128
		bodyModel[6] = new ModelRendererTurbo(this, 498, 144, textureX, textureY); // Box 128
		bodyModel[7] = new ModelRendererTurbo(this, 503, 143, textureX, textureY); // Box 128
		bodyModel[8] = new ModelRendererTurbo(this, 485, 163, textureX, textureY); // Box 128
		bodyModel[9] = new ModelRendererTurbo(this, 485, 131, textureX, textureY); // Box 128
		bodyModel[10] = new ModelRendererTurbo(this, 98, 16, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 96, 8, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 100, 4, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 101, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 96, 22, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 100, 30, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 101, 34, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 276, 85, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 264, 91, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 283, 99, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 292, 101, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 265, 99, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 264, 101, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 491, 66, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 303, 128, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 187, 128, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 332, 80, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 388, 35, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 444, 33, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 361, 29, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 441, 28, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 444, 41, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 468, 41, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 364, 42, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 388, 42, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 260, 150, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 263, 150, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 298, 145, textureX, textureY); // Box 150
		bodyModel[40] = new ModelRendererTurbo(this, 300, 150, textureX, textureY); // Box 151
		bodyModel[41] = new ModelRendererTurbo(this, 297, 150, textureX, textureY); // Box 152
		bodyModel[42] = new ModelRendererTurbo(this, 251, 147, textureX, textureY); // Box 120
		bodyModel[43] = new ModelRendererTurbo(this, 251, 152, textureX, textureY); // Box 120
		bodyModel[44] = new ModelRendererTurbo(this, 251, 150, textureX, textureY); // Box 120
		bodyModel[45] = new ModelRendererTurbo(this, 303, 147, textureX, textureY); // Box 120
		bodyModel[46] = new ModelRendererTurbo(this, 303, 152, textureX, textureY); // Box 120
		bodyModel[47] = new ModelRendererTurbo(this, 303, 150, textureX, textureY); // Box 120
		bodyModel[48] = new ModelRendererTurbo(this, 483, 143, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 321, 66, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 64, 121, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 64, 153, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 67, 144, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 75, 144, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 80, 143, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 62, 163, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 62, 131, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 60, 143, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 283, 90, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 299, 66, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 287, 72, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 306, 80, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 315, 82, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 288, 80, textureX, textureY); // Box 32
		bodyModel[64] = new ModelRendererTurbo(this, 287, 82, textureX, textureY); // Box 33
		bodyModel[65] = new ModelRendererTurbo(this, 379, 146, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 173, 146, textureX, textureY); // Box 120
		bodyModel[67] = new ModelRendererTurbo(this, 379, 131, textureX, textureY); // Right side door
		bodyModel[68] = new ModelRendererTurbo(this, 173, 131, textureX, textureY); // Left side door
		bodyModel[69] = new ModelRendererTurbo(this, 379, 128, textureX, textureY); // Box 193
		bodyModel[70] = new ModelRendererTurbo(this, 173, 128, textureX, textureY); // Box 122
		bodyModel[71] = new ModelRendererTurbo(this, 376, 128, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 390, 128, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 184, 128, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 170, 128, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 92, 145, textureX, textureY); // Box 54
		bodyModel[76] = new ModelRendererTurbo(this, 94, 150, textureX, textureY); // Box 54
		bodyModel[77] = new ModelRendererTurbo(this, 91, 150, textureX, textureY); // Box 54
		bodyModel[78] = new ModelRendererTurbo(this, 298, 145, textureX, textureY); // Box 150
		bodyModel[79] = new ModelRendererTurbo(this, 300, 150, textureX, textureY); // Box 151
		bodyModel[80] = new ModelRendererTurbo(this, 297, 150, textureX, textureY); // Box 152
		bodyModel[81] = new ModelRendererTurbo(this, 100, 147, textureX, textureY); // Box 120
		bodyModel[82] = new ModelRendererTurbo(this, 100, 152, textureX, textureY); // Box 120
		bodyModel[83] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Box 120
		bodyModel[84] = new ModelRendererTurbo(this, 454, 147, textureX, textureY); // Box 120
		bodyModel[85] = new ModelRendererTurbo(this, 454, 152, textureX, textureY); // Box 120
		bodyModel[86] = new ModelRendererTurbo(this, 454, 150, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 393, 128, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 97, 128, textureX, textureY); // Box 6
		bodyModel[89] = new ModelRendererTurbo(this, 76, 118, textureX, textureY,"cull"); // Box 6 vent cull
		bodyModel[90] = new ModelRendererTurbo(this, 162, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[91] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[92] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[93] = new ModelRendererTurbo(this, 219, 91, textureX, textureY); // Box 6 FPB-4 vent
		bodyModel[94] = new ModelRendererTurbo(this, 360, 7, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 369, 13, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 352, 1, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 386, 1, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 352, 13, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 386, 13, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 340, 19, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 326, 5, textureX, textureY); // exhaust 1
		bodyModel[103] = new ModelRendererTurbo(this, 232, 188, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 254, 185, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 247, 189, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 249, 164, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 232, 164, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 266, 164, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 266, 155, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 266, 173, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 232, 155, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 232, 173, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 337, 7, textureX, textureY); // exhaust 2
		bodyModel[114] = new ModelRendererTurbo(this, 237, 210, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 237, 223, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 237, 200, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 237, 218, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 237, 228, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 237, 195, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 237, 205, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 173, 214, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 174, 235, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 174, 200, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 174, 228, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 174, 242, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 174, 193, textureX, textureY); // Box 691
		bodyModel[127] = new ModelRendererTurbo(this, 174, 207, textureX, textureY); // Box 692
		bodyModel[128] = new ModelRendererTurbo(this, 160, 214, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 161, 235, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 161, 228, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 161, 242, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 161, 200, textureX, textureY); // Box 697
		bodyModel[133] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 698
		bodyModel[134] = new ModelRendererTurbo(this, 161, 207, textureX, textureY); // Box 699
		bodyModel[135] = new ModelRendererTurbo(this, 145, 227, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 145, 232, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 145, 222, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 153, 220, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 153, 215, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 145, 212, textureX, textureY); // Box 714
		bodyModel[142] = new ModelRendererTurbo(this, 145, 207, textureX, textureY); // Box 716
		bodyModel[143] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 719
		bodyModel[144] = new ModelRendererTurbo(this, 192, 233, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 192, 239, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 192, 157, textureX, textureY); // Box 513
		bodyModel[147] = new ModelRendererTurbo(this, 192, 161, textureX, textureY); // Box 516
		bodyModel[148] = new ModelRendererTurbo(this, 326, 1, textureX, textureY); // exhaust 1
		bodyModel[149] = new ModelRendererTurbo(this, 186, 220, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 192, 209, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 188, 171, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 192, 183, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 188, 194, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // exhaust 2
		bodyModel[155] = new ModelRendererTurbo(this, 267, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[156] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 0 Dynamics
		bodyModel[157] = new ModelRendererTurbo(this, 293, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[158] = new ModelRendererTurbo(this, 301, 1, textureX, textureY); // Box 0 Dynamics
		bodyModel[159] = new ModelRendererTurbo(this, 253, 1, textureX, textureY); // Box 0 Dynamics
		bodyModel[160] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 0 Dynamics
		bodyModel[161] = new ModelRendererTurbo(this, 342, 178, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[162] = new ModelRendererTurbo(this, 282, 178, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[163] = new ModelRendererTurbo(this, 295, 165, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[164] = new ModelRendererTurbo(this, 299, 169, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[165] = new ModelRendererTurbo(this, 308, 26, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[166] = new ModelRendererTurbo(this, 310, 16, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[167] = new ModelRendererTurbo(this, 297, 19, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[168] = new ModelRendererTurbo(this, 329, 19, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[169] = new ModelRendererTurbo(this, 322, 43, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[170] = new ModelRendererTurbo(this, 337, 33, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[171] = new ModelRendererTurbo(this, 341, 45, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[172] = new ModelRendererTurbo(this, 352, 39, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[173] = new ModelRendererTurbo(this, 247, 185, textureX, textureY); // Box 716
		bodyModel[174] = new ModelRendererTurbo(this, 303, 217, textureX, textureY); // Box 2 US FPB-2 tank
		bodyModel[175] = new ModelRendererTurbo(this, 307, 221, textureX, textureY); // Box 2 US FPA-2 tank
		bodyModel[176] = new ModelRendererTurbo(this, 339, 244, textureX, textureY); // Box 2 US FPA-2 tank
		bodyModel[177] = new ModelRendererTurbo(this, 303, 244, textureX, textureY); // Box 2 US FPA-2 tank
		bodyModel[178] = new ModelRendererTurbo(this, 304, 190, textureX, textureY); // Box 2 FB-2 Freight tank
		bodyModel[179] = new ModelRendererTurbo(this, 306, 192, textureX, textureY); // Box 2 FA-2 Freight tank
		bodyModel[180] = new ModelRendererTurbo(this, 305, 207, textureX, textureY); // Box 2 FA-2 Freight tank
		bodyModel[181] = new ModelRendererTurbo(this, 341, 207, textureX, textureY); // Box 2 FA-2 Freight tank
		bodyModel[182] = new ModelRendererTurbo(this, 192, 179, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 192, 167, textureX, textureY); // Box 0
		bodyModel[184] = new ModelRendererTurbo(this, 190, 243, textureX, textureY); // Box 0
		bodyModel[185] = new ModelRendererTurbo(this, 256, 215, textureX, textureY); // Box 0 Batteries
		bodyModel[186] = new ModelRendererTurbo(this, 256, 202, textureX, textureY); // Box 0 Batteries
		bodyModel[187] = new ModelRendererTurbo(this, 108, 205, textureX, textureY); // Box 0 Electrical box
		bodyModel[188] = new ModelRendererTurbo(this, 82, 216, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[189] = new ModelRendererTurbo(this, 64, 217, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[190] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[191] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[192] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[193] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[194] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[195] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[196] = new ModelRendererTurbo(this, 82, 216, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[197] = new ModelRendererTurbo(this, 64, 217, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[198] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[199] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[200] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[201] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[202] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[203] = new ModelRendererTurbo(this, 46, 221, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[204] = new ModelRendererTurbo(this, 126, 190, textureX, textureY); // Box 0 Air tanks
		bodyModel[205] = new ModelRendererTurbo(this, 135, 190, textureX, textureY); // Box 0 Air tanks
		bodyModel[206] = new ModelRendererTurbo(this, 55, 220, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[207] = new ModelRendererTurbo(this, 55, 220, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[208] = new ModelRendererTurbo(this, 55, 220, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[209] = new ModelRendererTurbo(this, 55, 220, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[210] = new ModelRendererTurbo(this, 269, 33, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[211] = new ModelRendererTurbo(this, 259, 33, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[212] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[213] = new ModelRendererTurbo(this, 259, 29, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[214] = new ModelRendererTurbo(this, 174, 151, textureX, textureY); // Box 120
		bodyModel[215] = new ModelRendererTurbo(this, 174, 156, textureX, textureY); // Box 120
		bodyModel[216] = new ModelRendererTurbo(this, 174, 154, textureX, textureY); // Box 120
		bodyModel[217] = new ModelRendererTurbo(this, 380, 151, textureX, textureY); // Box 120
		bodyModel[218] = new ModelRendererTurbo(this, 380, 156, textureX, textureY); // Box 120
		bodyModel[219] = new ModelRendererTurbo(this, 380, 154, textureX, textureY); // Box 120
		bodyModel[220] = new ModelRendererTurbo(this, 294, 146, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 312, 146, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 266, 146, textureX, textureY); // Box 79
		bodyModel[223] = new ModelRendererTurbo(this, 248, 146, textureX, textureY); // Box 80
		bodyModel[224] = new ModelRendererTurbo(this, 463, 146, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 451, 146, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 79
		bodyModel[227] = new ModelRendererTurbo(this, 97, 146, textureX, textureY); // Box 80
		bodyModel[228] = new ModelRendererTurbo(this, 142, 48, textureX, textureY); // Box 301
		bodyModel[229] = new ModelRendererTurbo(this, 153, 48, textureX, textureY); // Box 302
		bodyModel[230] = new ModelRendererTurbo(this, 485, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[231] = new ModelRendererTurbo(this, 490, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[232] = new ModelRendererTurbo(this, 503, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[233] = new ModelRendererTurbo(this, 498, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[234] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[235] = new ModelRendererTurbo(this, 67, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[236] = new ModelRendererTurbo(this, 80, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[237] = new ModelRendererTurbo(this, 75, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[238] = new ModelRendererTurbo(this, 379, 165, textureX, textureY); // Box 2 MLW FPA-2 tank
		bodyModel[239] = new ModelRendererTurbo(this, 380, 173, textureX, textureY); // Box 2 MLW FPA-2 tank
		bodyModel[240] = new ModelRendererTurbo(this, 378, 163, textureX, textureY); // Box 2 MLW FPA-2 tank
		bodyModel[241] = new ModelRendererTurbo(this, 428, 173, textureX, textureY); // Box 2 MLW FPA-2 tank
		bodyModel[242] = new ModelRendererTurbo(this, 428, 163, textureX, textureY); // Box 2 MLW FPA-2 tank
		bodyModel[243] = new ModelRendererTurbo(this, 134, 157, textureX, textureY); // Box 2 FA-1 and FPA-2 tank
		bodyModel[244] = new ModelRendererTurbo(this, 124, 157, textureX, textureY); // Box 2 FA-1 filler shit
		bodyModel[245] = new ModelRendererTurbo(this, 134, 162, textureX, textureY); // Box 2 FA-1 and FPA-2 tank
		bodyModel[246] = new ModelRendererTurbo(this, 124, 162, textureX, textureY); // Box 2 FA-1 and FA-2 filler shit
		bodyModel[247] = new ModelRendererTurbo(this, 351, 197, textureX, textureY); // Box 2 FA-2 filler
		bodyModel[248] = new ModelRendererTurbo(this, 342, 197, textureX, textureY); // Box 2 FA-2 filler
		bodyModel[249] = new ModelRendererTurbo(this, 351, 202, textureX, textureY); // Box 2 FA-2 filler
		bodyModel[250] = new ModelRendererTurbo(this, 342, 202, textureX, textureY); // Box 2 FA-2 filler
		bodyModel[251] = new ModelRendererTurbo(this, 134, 152, textureX, textureY); // Box 2 FA-1 and FA-2 filler shit
		bodyModel[252] = new ModelRendererTurbo(this, 413, 155, textureX, textureY); // Box 2 CP moment fillers
		bodyModel[253] = new ModelRendererTurbo(this, 413, 160, textureX, textureY); // Box 2 CP moment fillers
		bodyModel[254] = new ModelRendererTurbo(this, 407, 153, textureX, textureY); // Box 2 CP moment fillers
		bodyModel[255] = new ModelRendererTurbo(this, 407, 158, textureX, textureY); // Box 2 CP moment fillers
		bodyModel[256] = new ModelRendererTurbo(this, 426, 231, textureX, textureY); // Box 2 FPA-4 fillers
		bodyModel[257] = new ModelRendererTurbo(this, 432, 228, textureX, textureY); // Box 2 FPA-4 fillers
		bodyModel[258] = new ModelRendererTurbo(this, 432, 233, textureX, textureY); // Box 2 FPA-4 fillers
		bodyModel[259] = new ModelRendererTurbo(this, 426, 226, textureX, textureY); // Box 2 FPA-4 fillers
		bodyModel[260] = new ModelRendererTurbo(this, 377, 191, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[261] = new ModelRendererTurbo(this, 381, 220, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[262] = new ModelRendererTurbo(this, 397, 216, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[263] = new ModelRendererTurbo(this, 382, 195, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[264] = new ModelRendererTurbo(this, 380, 205, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[265] = new ModelRendererTurbo(this, 390, 201, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[266] = new ModelRendererTurbo(this, 397, 216, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[267] = new ModelRendererTurbo(this, 428, 195, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[268] = new ModelRendererTurbo(this, 428, 205, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[269] = new ModelRendererTurbo(this, 428, 201, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[270] = new ModelRendererTurbo(this, 430, 198, textureX, textureY); // Box 2 CP tank
		bodyModel[271] = new ModelRendererTurbo(this, 430, 198, textureX, textureY); // Box 2 CN tank Passenger
		bodyModel[272] = new ModelRendererTurbo(this, 76, 118, textureX, textureY,"cull"); // Box 6 vent cull
		bodyModel[273] = new ModelRendererTurbo(this, 162, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[274] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[275] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[276] = new ModelRendererTurbo(this, 219, 91, textureX, textureY); // Box 6 FPB-4 vent
		bodyModel[277] = new ModelRendererTurbo(this, 306, 100, textureX, textureY,"lamp"); // backing light type 1
		bodyModel[278] = new ModelRendererTurbo(this, 313, 105, textureX, textureY,"lamp"); // backing light type 2
		bodyModel[279] = new ModelRendererTurbo(this, 306, 105, textureX, textureY); // backing light type 1 socket
		bodyModel[280] = new ModelRendererTurbo(this, 306, 100, textureX, textureY,"lamp"); // backing light type 1
		bodyModel[281] = new ModelRendererTurbo(this, 313, 105, textureX, textureY,"lamp"); // backing light type 2
		bodyModel[282] = new ModelRendererTurbo(this, 306, 105, textureX, textureY); // backing light type 1 socket
		bodyModel[283] = new ModelRendererTurbo(this, 413, 7, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[284] = new ModelRendererTurbo(this, 421, 1, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[285] = new ModelRendererTurbo(this, 420, 13, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[286] = new ModelRendererTurbo(this, 403, 1, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[287] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[288] = new ModelRendererTurbo(this, 403, 13, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[289] = new ModelRendererTurbo(this, 437, 13, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[290] = new ModelRendererTurbo(this, 417, 19, textureX, textureY); // Box 0 FA-1 fan
		bodyModel[291] = new ModelRendererTurbo(this, 479, 199, textureX, textureY); // Box 0 FA-1
		bodyModel[292] = new ModelRendererTurbo(this, 452, 206, textureX, textureY); // Box 0 FA-1
		bodyModel[293] = new ModelRendererTurbo(this, 443, 174, textureX, textureY); // Box 0 FA-1
		bodyModel[294] = new ModelRendererTurbo(this, 447, 178, textureX, textureY); // Box 0 FA-1
		bodyModel[295] = new ModelRendererTurbo(this, 264, 47, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FA-1
		bodyModel[296] = new ModelRendererTurbo(this, 265, 37, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FA-1
		bodyModel[297] = new ModelRendererTurbo(this, 253, 41, textureX, textureY,"cull"); // Box 0 CP winterization hatch cull FA-1
		bodyModel[298] = new ModelRendererTurbo(this, 313, 100, textureX, textureY,"lamp"); // backing light type 1
		bodyModel[299] = new ModelRendererTurbo(this, 320, 100, textureX, textureY,"lamp"); // backing light type 2
		bodyModel[300] = new ModelRendererTurbo(this, 313, 100, textureX, textureY,"lamp"); // backing light type 1
		bodyModel[301] = new ModelRendererTurbo(this, 320, 100, textureX, textureY,"lamp"); // backing light type 2
		bodyModel[302] = new ModelRendererTurbo(this, 89, 154, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[303] = new ModelRendererTurbo(this, 124, 147, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[304] = new ModelRendererTurbo(this, 159, 178, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[305] = new ModelRendererTurbo(this, 161, 175, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[306] = new ModelRendererTurbo(this, 161, 175, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[307] = new ModelRendererTurbo(this, 161, 183, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[308] = new ModelRendererTurbo(this, 161, 175, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[309] = new ModelRendererTurbo(this, 161, 183, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[310] = new ModelRendererTurbo(this, 161, 183, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[311] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[312] = new ModelRendererTurbo(this, 107, 182, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[313] = new ModelRendererTurbo(this, 107, 182, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[314] = new ModelRendererTurbo(this, 107, 182, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[315] = new ModelRendererTurbo(this, 107, 190, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[316] = new ModelRendererTurbo(this, 107, 190, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[317] = new ModelRendererTurbo(this, 107, 190, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[318] = new ModelRendererTurbo(this, 128, 172, textureX, textureY); // Box 2 FA-1 tanks stuff
		bodyModel[319] = new ModelRendererTurbo(this, 248, 229, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[320] = new ModelRendererTurbo(this, 248, 246, textureX, textureY); // Box 0 FA-1
		bodyModel[321] = new ModelRendererTurbo(this, 289, 221, textureX, textureY); // Box 0
		bodyModel[322] = new ModelRendererTurbo(this, 282, 221, textureX, textureY); // Box 0
		bodyModel[323] = new ModelRendererTurbo(this, 281, 238, textureX, textureY); // Box 0
		bodyModel[324] = new ModelRendererTurbo(this, 234, 242, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[325] = new ModelRendererTurbo(this, 82, 234, textureX, textureY); // Box 0
		bodyModel[326] = new ModelRendererTurbo(this, 70, 233, textureX, textureY); // Box 0
		bodyModel[327] = new ModelRendererTurbo(this, 455, 1, textureX, textureY); // Box 499
		bodyModel[328] = new ModelRendererTurbo(this, 464, 1, textureX, textureY); // Box 500
		bodyModel[329] = new ModelRendererTurbo(this, 151, 97, textureX, textureY,"cull"); // Box 6 FA-1 cull
		bodyModel[330] = new ModelRendererTurbo(this, 194, 81, textureX, textureY,"cull"); // Box 6 FA-1 cull
		bodyModel[331] = new ModelRendererTurbo(this, 151, 97, textureX, textureY,"cull"); // Box 6 FA-1 cull
		bodyModel[332] = new ModelRendererTurbo(this, 194, 81, textureX, textureY,"cull"); // Box 6 FA-1 cull
		bodyModel[333] = new ModelRendererTurbo(this, 486, 110, textureX, textureY); // Box 153
		bodyModel[334] = new ModelRendererTurbo(this, 63, 107, textureX, textureY); // Box 153

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 72, 1, 22, 0F); // Box 0
		bodyModel[1].setRotationPoint(-36F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[2].setRotationPoint(35F, -16F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[3].setRotationPoint(36F, -15F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[4].setRotationPoint(36F, 1F, -4F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[5].setRotationPoint(36F, -14F, -4F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[6].setRotationPoint(36F, -14F, 3F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[7].setRotationPoint(37F, -14F, 3F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[8].setRotationPoint(37F, 1F, -5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[9].setRotationPoint(37F, -15F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 72, 1, 4, 0F); // Box 0
		bodyModel[10].setRotationPoint(-36F, -19F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 72, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-36F, -19F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 72, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-36F, -18F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-36F, -17F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 72, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[14].setRotationPoint(-36F, -19F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 72, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-36F, -18F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-36F, -17F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[17].setRotationPoint(35F, -18F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[18].setRotationPoint(35F, -17F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(35F, -18F, 2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(35F, -17F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[21].setRotationPoint(35F, -18F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(35F, -17F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[23].setRotationPoint(36F, 3F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(33F, 2F, -3.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 34, 17, 1, 0F); // Box 0
		bodyModel[25].setRotationPoint(2F, -16F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 34, 17, 1, 0F); // Box 6
		bodyModel[26].setRotationPoint(2F, -16F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 70, 1, 12, 0F); // Box 0
		bodyModel[27].setRotationPoint(-35F, 2F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[28].setRotationPoint(-23F, 2.5F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[29].setRotationPoint(19F, 2.5F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[30].setRotationPoint(-22F, 2F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 0
		bodyModel[31].setRotationPoint(20F, 2F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[32].setRotationPoint(20F, 3F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[33].setRotationPoint(20F, 3F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-22F, 3F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-22F, 3F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 54
		bodyModel[36].setRotationPoint(36F, 2F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[37].setRotationPoint(36F, 4.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 54
		bodyModel[38].setRotationPoint(36F, 4.5F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 150
		bodyModel[39].setRotationPoint(36F, 2F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[40].setRotationPoint(36F, 4.5F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[41].setRotationPoint(36F, 4.5F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[42].setRotationPoint(32F, 2F, -11.01F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[43].setRotationPoint(32F, 5F, -10.76F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[44].setRotationPoint(32F, 4F, -11.01F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[45].setRotationPoint(32F, 2F, 11.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[46].setRotationPoint(32F, 5F, 10.76F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[47].setRotationPoint(32F, 4F, 11.01F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[48].setRotationPoint(37F, -14F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[49].setRotationPoint(-36F, 2F, -3.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[50].setRotationPoint(-37F, -15F, -4F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 128
		bodyModel[51].setRotationPoint(-37F, 1F, -4F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[52].setRotationPoint(-37F, -14F, -4F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 128
		bodyModel[53].setRotationPoint(-37F, -14F, 3F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[54].setRotationPoint(-38F, -14F, 3F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[55].setRotationPoint(-38F, 1F, -5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[56].setRotationPoint(-38F, -15F, -5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 15, 2, 0F); // Box 128
		bodyModel[57].setRotationPoint(-38F, -14F, -5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 0
		bodyModel[58].setRotationPoint(-36F, -16F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[59].setRotationPoint(-36F, -18F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 0
		bodyModel[60].setRotationPoint(-36F, -17F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[61].setRotationPoint(-36F, -18F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-36F, -17F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[63].setRotationPoint(-36F, -18F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[64].setRotationPoint(-36F, -17F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[65].setRotationPoint(-2F, -2F, 10F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 120
		bodyModel[66].setRotationPoint(-2F, -2F, -11F);

		bodyModel[67].addBox(-3F, 0F, 0F, 4, 13, 1, 0F); // Right side door
		bodyModel[67].setRotationPoint(1F, -15F, 10F);

		bodyModel[68].addBox(-3F, 0F, -1F, 4, 13, 1, 0F); // Left side door
		bodyModel[68].setRotationPoint(1F, -15F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[69].setRotationPoint(-2F, -16F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[70].setRotationPoint(-2F, -16F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[71].setRotationPoint(2.5F, -14F, 11F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 0
		bodyModel[72].setRotationPoint(-2.5F, -14F, 11F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 79
		bodyModel[73].setRotationPoint(2.5F, -14F, -12F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 17, 1, 0F); // Box 80
		bodyModel[74].setRotationPoint(-2.5F, -14F, -12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 54
		bodyModel[75].setRotationPoint(-36F, 2F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		bodyModel[76].setRotationPoint(-36F, 4.5F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 54
		bodyModel[77].setRotationPoint(-36F, 4.5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 150
		bodyModel[78].setRotationPoint(-36F, 2F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[79].setRotationPoint(-36F, 4.5F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[80].setRotationPoint(-36F, 4.5F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[81].setRotationPoint(-36F, 2F, -11.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[82].setRotationPoint(-36F, 5F, -10.76F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[83].setRotationPoint(-36F, 4F, -11.01F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[84].setRotationPoint(-36F, 2F, 11.01F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[85].setRotationPoint(-36F, 5F, 10.76F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[86].setRotationPoint(-36F, 4F, 11.01F);

		bodyModel[87].addBox(0F, 0F, 0F, 34, 17, 1, 0F); // Box 0
		bodyModel[87].setRotationPoint(-36F, -16F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 34, 17, 1, 0F); // Box 6
		bodyModel[88].setRotationPoint(-36F, -16F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 64, 8, 1, 0F,0F, 0F, -0.75F, -32F, 0F, -0.75F, -32F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -32F, -4F, -0.75F, -32F, -4F, 0F, 0F, -4F, 0F); // Box 6 vent cull
		bodyModel[89].setRotationPoint(-35F, -15F, 10.02F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, -0.75F, -12F, 0F, -0.75F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -12F, -4F, -0.75F, -12F, -4F, 0F, 0F, -4F, 0F); // Box 6 late FB-2 and later
		bodyModel[90].setRotationPoint(3F, -15F, 10.02F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -11F, 0F, -0.75F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[91].setRotationPoint(15F, -15F, 10.02F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, -0.75F, -9F, 0F, -0.75F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -9F, -4F, -0.75F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 6 late FB-2 and later
		bodyModel[92].setRotationPoint(26F, -15F, 10.02F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 21, 10, 1, 0F,0F, 0F, -0.75F, -10F, 0F, -0.75F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -10F, -4F, -0.75F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 6 FPB-4 vent
		bodyModel[93].setRotationPoint(15F, -11F, 10.02F);

		bodyModel[94].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 0
		bodyModel[94].setRotationPoint(14.5F, -19.5F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[95].setRotationPoint(18.5F, -19.5F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[96].setRotationPoint(18.5F, -19.5F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 0
		bodyModel[97].setRotationPoint(14.5F, -19.5F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[98].setRotationPoint(22.5F, -19.5F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[99].setRotationPoint(14.5F, -19.5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(22.5F, -19.5F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(14.5F, -19.51F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // exhaust 1
		bodyModel[102].setRotationPoint(7F, -19.5F, 1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[103].setRotationPoint(5.55F, -7F, -1.55F);
		bodyModel[103].rotateAngleX = -0.78539816F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 0
		bodyModel[104].setRotationPoint(8.7F, -10F, -1.55F);
		bodyModel[104].rotateAngleY = -0.78539816F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.425F, -0.575F, 0F, -1F, -0.575F, 0F, 0F, 0F, 0F, 0F, 0F, -0.575F, -1F, -2F, -0.575F, -1F, -2F, -0.575F, 0F, 0F, -0.575F, 0F); // Box 0
		bodyModel[105].setRotationPoint(10.1F, -5.6F, -2.55F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(7.55F, -14F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(5.55F, -12F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(9.55F, -12F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(9.55F, -14F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(9.55F, -10F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[111].setRotationPoint(5.55F, -14F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[112].setRotationPoint(5.55F, -10F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // exhaust 2
		bodyModel[113].setRotationPoint(6.55F, -19.5F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 0
		bodyModel[114].setRotationPoint(6.55F, -14F, -1.3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 0
		bodyModel[115].setRotationPoint(6.55F, -12.3F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 0
		bodyModel[116].setRotationPoint(6.55F, -12.3F, 0.4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		bodyModel[117].setRotationPoint(6.55F, -14F, -3.3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		bodyModel[118].setRotationPoint(6.55F, -10.6F, -3.3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 0
		bodyModel[119].setRotationPoint(6.55F, -14F, 0.4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F); // Box 0
		bodyModel[120].setRotationPoint(6.55F, -10.6F, 0.4F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 9, 4, 0F); // Box 0
		bodyModel[121].setRotationPoint(-9F, -8F, -2F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 0
		bodyModel[122].setRotationPoint(-9F, -5F, -5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 0
		bodyModel[123].setRotationPoint(-9F, -5F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[124].setRotationPoint(-9F, -8F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[125].setRotationPoint(-9F, -2F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[126].setRotationPoint(-9F, -8F, 2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 692
		bodyModel[127].setRotationPoint(-9F, -2F, 2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 9, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[128].setRotationPoint(-11F, -8F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[129].setRotationPoint(-11F, -5F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-11F, -8F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-11F, -2F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 697
		bodyModel[132].setRotationPoint(-11F, -5F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 698
		bodyModel[133].setRotationPoint(-11F, -8F, 2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F); // Box 699
		bodyModel[134].setRotationPoint(-11F, -2F, 2F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[135].setRotationPoint(-13F, -3.5F, -2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(-13F, -3.5F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[137].setRotationPoint(-13F, -3.5F, -1.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 0
		bodyModel[138].setRotationPoint(-13F, -6.5F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-13F, -6.5F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-13F, -6.5F, 0.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 714
		bodyModel[141].setRotationPoint(-13F, -3.5F, 1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 716
		bodyModel[142].setRotationPoint(-13F, -3.5F, 2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[143].setRotationPoint(-13F, -3.5F, 0.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, -0.45F, -0.055F, -4.45F, -0.45F, -0.055F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.38F, -4.45F, 0F, -0.38F, -4.45F, 0F, 0.38F, 0F, 0F, 0.38F); // Box 0
		bodyModel[144].setRotationPoint(-6.99999999999995F, -9F, -6.63F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4.45F, -1F, 0F, -4.45F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 0
		bodyModel[145].setRotationPoint(-6.99999999999995F, -6F, -6.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -4.45F, 0F, 0.125F, -4.45F, -1F, 0F, 0F, -1F, 0F); // Box 513
		bodyModel[146].setRotationPoint(-6.99999999999995F, -6F, 4.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, -0.45F, -0.055F, 0F, -0.45F, -0.055F, 0F, 0F, 0.38F, -4.45F, 0F, 0.38F, -4.45F, 0F, -0.38F, 0F, 0F, -0.38F); // Box 516
		bodyModel[147].setRotationPoint(-6.99999999999995F, -9F, 4.63F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // exhaust 1
		bodyModel[148].setRotationPoint(7F, -20.5F, 1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4.45F, 1F, 0F, -4.45F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[149].setRotationPoint(-7F, -4F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -4.45F, 0F, -1F, -4.45F, -1F, 1F, 0F, -1F, 1F); // Box 0
		bodyModel[150].setRotationPoint(-6.99999999999995F, -12F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[151].setRotationPoint(-6.99999999999995F, -14F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F,0F, 1F, 0F, -4.45F, 1F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -4.45F, -1F, 1F, -4.45F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[152].setRotationPoint(-6.99999999999995F, -12F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4.45F, 0F, -1F, -4.45F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[153].setRotationPoint(-6.99999999999995F, -13F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // exhaust 2
		bodyModel[154].setRotationPoint(6.55F, -20.5F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[155].setRotationPoint(-12.45F, -19.5F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[156].setRotationPoint(-7.95F, -19.5F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[157].setRotationPoint(-3.45F, -19.5F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 0 Dynamics
		bodyModel[158].setRotationPoint(1.05F, -19.5F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 0 Dynamics
		bodyModel[159].setRotationPoint(-14.95F, -19.5F, -2F);

		bodyModel[160].addBox(0F, 0F, 0F, 18, 3, 4, 0F); // Box 0 Dynamics
		bodyModel[160].setRotationPoint(-13F, -18F, -2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[161].setRotationPoint(14F, -14F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[162].setRotationPoint(14F, -14F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[163].setRotationPoint(14F, -17F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[164].setRotationPoint(14F, -18F, -8F);

		bodyModel[165].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[165].setRotationPoint(10.5F, -19.65F, -4F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[166].setRotationPoint(11.5F, -20.65F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[167].setRotationPoint(10.5F, -20.65F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[168].setRotationPoint(15.5F, -20.65F, -4F);

		bodyModel[169].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[169].setRotationPoint(23.5F, -19.65F, -4F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[170].setRotationPoint(24.5F, -20.65F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[171].setRotationPoint(23.5F, -20.65F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[172].setRotationPoint(27.5F, -20.65F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.575F, 0F, 0F, -0.575F, 0F, -1F, 0F, 0F, 0.425F, 0F, -0.575F, 0F, -2F, -0.575F, 0F, -2F, -0.575F, -1F, 0F, -0.575F, -1F); // Box 716
		bodyModel[173].setRotationPoint(10.1F, -5.6F, -1.55F);

		bodyModel[174].addBox(0F, 0F, 0F, 15, 6, 20, 0F); // Box 2 US FPB-2 tank
		bodyModel[174].setRotationPoint(-7.5F, 2F, -10F);

		bodyModel[175].addBox(0F, 0F, 0F, 15, 1, 16, 0F); // Box 2 US FPA-2 tank
		bodyModel[175].setRotationPoint(-7.5F, 8F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 US FPA-2 tank
		bodyModel[176].setRotationPoint(-7.5F, 8F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2 US FPA-2 tank
		bodyModel[177].setRotationPoint(-7.5F, 8F, 8F);

		bodyModel[178].addBox(0F, 0F, 0F, 8, 6, 20, 0F); // Box 2 FB-2 Freight tank
		bodyModel[178].setRotationPoint(-4F, 2F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 8, 1, 18, 0F); // Box 2 FA-2 Freight tank
		bodyModel[179].setRotationPoint(-4F, 8F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-2 Freight tank
		bodyModel[180].setRotationPoint(-4F, 8F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2 FA-2 Freight tank
		bodyModel[181].setRotationPoint(-4F, 8F, 9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -1F, 0F, -4.45F, -1F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[182].setRotationPoint(-7F, -5F, -4F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[183].setRotationPoint(-7.00000000000005F, -5F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.45F, 0F, 0F, -4.45F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[184].setRotationPoint(-7F, -5F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Batteries
		bodyModel[185].setRotationPoint(29F, -5F, 4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Batteries
		bodyModel[186].setRotationPoint(29F, -5F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 17, 10, 0F); // Box 0 Electrical box
		bodyModel[187].setRotationPoint(-18F, -16F, -5F);

		bodyModel[188].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[188].setRotationPoint(-26F, -10F, 1F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[189].setRotationPoint(-30F, -8F, 0F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[190].setRotationPoint(-32F, -8F, 2F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[191].setRotationPoint(-28F, -8F, 2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[192].setRotationPoint(-28F, -8F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[193].setRotationPoint(-28F, -8F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[194].setRotationPoint(-32F, -8F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[195].setRotationPoint(-32F, -8F, 0F);

		bodyModel[196].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[196].setRotationPoint(-26F, -10F, -6F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[197].setRotationPoint(-30F, -8F, -6F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[198].setRotationPoint(-32F, -8F, -4F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[199].setRotationPoint(-28F, -8F, -4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[200].setRotationPoint(-28F, -8F, -2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[201].setRotationPoint(-28F, -8F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[202].setRotationPoint(-32F, -8F, -2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[203].setRotationPoint(-32F, -8F, -6F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 0 Air tanks
		bodyModel[204].setRotationPoint(-24F, -13F, -9F);
		bodyModel[204].rotateAngleY = -0.78539816F;

		bodyModel[205].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 0 Air tanks
		bodyModel[205].setRotationPoint(-34F, -13F, -9F);
		bodyModel[205].rotateAngleY = -0.78539816F;

		bodyModel[206].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[206].setRotationPoint(-30F, -18F, -4F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[207].setRotationPoint(-30F, -18F, 2F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[208].setRotationPoint(-24F, -18F, -4F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[209].setRotationPoint(-24F, -18F, 2F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[210].setRotationPoint(-30F, -19.65F, -4F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[211].setRotationPoint(-30F, -19.65F, 2F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[212].setRotationPoint(-24F, -19.65F, -4F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[213].setRotationPoint(-24F, -19.65F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[214].setRotationPoint(-2F, 2F, -11.01F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[215].setRotationPoint(-2F, 5F, -10.76F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 120
		bodyModel[216].setRotationPoint(-2F, 4F, -11.01F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[217].setRotationPoint(-2F, 2F, 11.01F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 120
		bodyModel[218].setRotationPoint(-2F, 5F, 10.76F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[219].setRotationPoint(-2F, 4F, 11.01F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[220].setRotationPoint(35.5F, -5F, 11F);

		bodyModel[221].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[221].setRotationPoint(32.5F, -5F, 11F);

		bodyModel[222].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[222].setRotationPoint(35.5F, -5F, -12F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[223].setRotationPoint(32.5F, -5F, -12F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[224].setRotationPoint(-32.5F, -5F, 11F);

		bodyModel[225].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[225].setRotationPoint(-35.5F, -5F, 11F);

		bodyModel[226].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[226].setRotationPoint(-32.5F, -5F, -12F);

		bodyModel[227].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[227].setRotationPoint(-35.5F, -5F, -12F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[228].setRotationPoint(-20F, -20.5F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[229].setRotationPoint(-18F, -19.5F, -0.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[230].setRotationPoint(37F, -17F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[231].setRotationPoint(37F, -17F, -4F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[232].setRotationPoint(37F, -17F, 4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[233].setRotationPoint(37F, -17F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[234].setRotationPoint(-38F, -17F, -5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[235].setRotationPoint(-38F, -17F, -4F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[236].setRotationPoint(-38F, -17F, 4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[237].setRotationPoint(-38F, -17F, 3F);

		bodyModel[238].addBox(0F, 0F, 0F, 15, 7, 18, 0F); // Box 2 MLW FPA-2 tank
		bodyModel[238].setRotationPoint(-7.5F, 2F, -9F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2 MLW FPA-2 tank
		bodyModel[239].setRotationPoint(-7.5F, 2F, 9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2 MLW FPA-2 tank
		bodyModel[240].setRotationPoint(0.5F, 2F, 9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 MLW FPA-2 tank
		bodyModel[241].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 MLW FPA-2 tank
		bodyModel[242].setRotationPoint(0.5F, 2F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-1 and FPA-2 tank
		bodyModel[243].setRotationPoint(7.5F, 2F, -11F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-1 filler shit
		bodyModel[244].setRotationPoint(5F, 2F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-1 and FPA-2 tank
		bodyModel[245].setRotationPoint(7.5F, 2F, 8F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-1 and FA-2 filler shit
		bodyModel[246].setRotationPoint(-8.5F, 2F, 8F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-2 filler
		bodyModel[247].setRotationPoint(4F, 2F, 8F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-2 filler
		bodyModel[248].setRotationPoint(2F, 2F, 8F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-2 filler
		bodyModel[249].setRotationPoint(4F, 2F, -11F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-2 filler
		bodyModel[250].setRotationPoint(2F, 2F, -11F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FA-1 and FA-2 filler shit
		bodyModel[251].setRotationPoint(-8.5F, 2F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 CP moment fillers
		bodyModel[252].setRotationPoint(5.5F, 2F, -11.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 CP moment fillers
		bodyModel[253].setRotationPoint(5.5F, 2F, 8.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 CP moment fillers
		bodyModel[254].setRotationPoint(-6.5F, 2F, 8.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 CP moment fillers
		bodyModel[255].setRotationPoint(-6.5F, 2F, -11.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FPA-4 fillers
		bodyModel[256].setRotationPoint(2.51F, 2F, -11.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FPA-4 fillers
		bodyModel[257].setRotationPoint(-3.51F, 2F, -11.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FPA-4 fillers
		bodyModel[258].setRotationPoint(-3.51F, 2F, 8.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2 FPA-4 fillers
		bodyModel[259].setRotationPoint(2.51F, 2F, 8.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 15, 4, 20, 0F); // Box 2 CN tank Passenger
		bodyModel[260].setRotationPoint(-7.5F, 2F, -10F);

		bodyModel[261].addBox(0F, 0F, 0F, 13, 3, 18, 0F); // Box 2 CN tank Passenger
		bodyModel[261].setRotationPoint(-6.5F, 6F, -9F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2 CN tank Passenger
		bodyModel[262].setRotationPoint(-7.5F, 6F, -11F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[263].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[264].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[264].setRotationPoint(0.5F, 2F, -11F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[265].setRotationPoint(-1.5F, 3F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2 CN tank Passenger
		bodyModel[266].setRotationPoint(-7.5F, 6F, 9F);

		bodyModel[267].addBox(0F, 0F, 0F, 6, 4, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[267].setRotationPoint(-7.5F, 2F, 10F);

		bodyModel[268].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[268].setRotationPoint(0.5F, 2F, 10F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 2 CN tank Passenger
		bodyModel[269].setRotationPoint(-1.5F, 3F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2 CP tank
		bodyModel[270].setRotationPoint(-7.5F, 6F, -9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2 CN tank Passenger
		bodyModel[271].setRotationPoint(6.5F, 6F, -9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 64, 8, 1, 0F,0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -32F, -4F, 0F, -32F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 vent cull
		bodyModel[272].setRotationPoint(-35F, -15F, -11.02F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -12F, -4F, 0F, -12F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 late FB-2 and later
		bodyModel[273].setRotationPoint(3F, -15F, -11.02F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[274].setRotationPoint(15F, -15F, -11.02F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 late FB-2 and later
		bodyModel[275].setRotationPoint(26F, -15F, -11.02F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 21, 10, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FPB-4 vent
		bodyModel[276].setRotationPoint(15F, -11F, -11.02F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[277].setRotationPoint(36.5F, -8F, 5.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 2
		bodyModel[278].setRotationPoint(36F, -12F, 6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[279].setRotationPoint(35.75F, -8F, 5.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // backing light type 1
		bodyModel[280].setRotationPoint(-37.5F, -8F, -7.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // backing light type 2
		bodyModel[281].setRotationPoint(-37F, -12F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[282].setRotationPoint(-36.75F, -8F, -7.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 0 FA-1 fan
		bodyModel[283].setRotationPoint(21.5F, -19.5F, -2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0 FA-1 fan
		bodyModel[284].setRotationPoint(25.5F, -19.5F, 2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1 fan
		bodyModel[285].setRotationPoint(25.5F, -19.5F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 0 FA-1 fan
		bodyModel[286].setRotationPoint(21.5F, -19.5F, 2F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0 FA-1 fan
		bodyModel[287].setRotationPoint(29.5F, -19.5F, 2F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1 fan
		bodyModel[288].setRotationPoint(21.5F, -19.5F, -6F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1 fan
		bodyModel[289].setRotationPoint(29.5F, -19.5F, -6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 12, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1 fan
		bodyModel[290].setRotationPoint(21.5F, -19.51F, -6F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0 FA-1
		bodyModel[291].setRotationPoint(21F, -14F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1
		bodyModel[292].setRotationPoint(21F, -14F, 7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1
		bodyModel[293].setRotationPoint(21F, -17F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1
		bodyModel[294].setRotationPoint(21F, -18F, -8F);

		bodyModel[295].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 0 CP winterization hatch cull FA-1
		bodyModel[295].setRotationPoint(11.5F, -19.65F, -4F);

		bodyModel[296].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 0 CP winterization hatch cull FA-1
		bodyModel[296].setRotationPoint(12.5F, -20.65F, -4F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FA-1
		bodyModel[297].setRotationPoint(11.5F, -20.65F, -4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[298].setRotationPoint(36F, -9F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 2
		bodyModel[299].setRotationPoint(36F, -12F, -7.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[300].setRotationPoint(-36.5F, -9F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 2
		bodyModel[301].setRotationPoint(-36.5F, -12F, 5.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 8, 7, 18, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[302].setRotationPoint(-8F, 2F, -9F);

		bodyModel[303].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[303].setRotationPoint(0F, 2F, -10F);

		bodyModel[304].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[304].setRotationPoint(0F, 7F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[305].setRotationPoint(0F, 6F, -10F);

		bodyModel[306].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[306].setRotationPoint(0F, 6F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[307].setRotationPoint(0F, 6F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[308].setRotationPoint(0F, 8F, -10F);

		bodyModel[309].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[309].setRotationPoint(0F, 8F, -9F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 FA-1 tanks stuff
		bodyModel[310].setRotationPoint(0F, 8F, -8F);

		bodyModel[311].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[311].setRotationPoint(0F, 7F, 7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[312].setRotationPoint(0F, 6F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[313].setRotationPoint(0F, 6F, 8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[314].setRotationPoint(0F, 6F, 9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[315].setRotationPoint(0F, 8F, 7F);

		bodyModel[316].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[316].setRotationPoint(0F, 8F, 8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 FA-1 tanks stuff
		bodyModel[317].setRotationPoint(0F, 8F, 9F);

		bodyModel[318].addBox(0F, 0F, 0F, 8, 3, 14, 0F); // Box 2 FA-1 tanks stuff
		bodyModel[318].setRotationPoint(0F, 6F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[319].setRotationPoint(7.5F, -5F, 0.75F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-1
		bodyModel[320].setRotationPoint(12.5F, -5F, 0.75F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[321].setRotationPoint(26.8F, -14F, 0F);
		bodyModel[321].rotateAngleY = -0.76794487F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[322].setRotationPoint(19.8F, -14F, 0F);
		bodyModel[322].rotateAngleY = -0.76794487F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[323].setRotationPoint(18.5F, -1F, -2F);

		bodyModel[324].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 0 cull
		bodyModel[324].setRotationPoint(5.5F, -3F, 0F);
		bodyModel[324].rotateAngleX = -0.78539816F;

		bodyModel[325].addBox(0F, 0F, 0F, 5, 10, 5, 0F); // Box 0
		bodyModel[325].setRotationPoint(-29.5F, -9F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[326].setRotationPoint(-29.5F, -9F, -5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 499
		bodyModel[327].setRotationPoint(-29F, -19.5F, -4.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[328].setRotationPoint(-28F, -20F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6 FA-1 cull
		bodyModel[329].setRotationPoint(20F, -15F, -11.02F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 34, 8, 1, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -17F, -4F, 0F, -17F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 FA-1 cull
		bodyModel[330].setRotationPoint(3F, -15F, -11.02F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F,0F, 0F, -0.75F, -15F, 0F, -0.75F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -15F, 0F, -0.75F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 6 FA-1 cull
		bodyModel[331].setRotationPoint(20F, -15F, 10.02F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 34, 8, 1, 0F,0F, 0F, -0.75F, -17F, 0F, -0.75F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.75F, -17F, -4F, -0.75F, -17F, -4F, 0F, 0F, -4F, 0F); // Box 6 FA-1 cull
		bodyModel[332].setRotationPoint(3F, -15F, 10.02F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[333].setRotationPoint(36F, -17F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[334].setRotationPoint(-38F, -17F, -4F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderLocomotiveModelWithoutBeacon(bodyModel, entity, f5);

		if (GetColor(entity) == 1234556) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.31, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.62, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.31, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.62, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}