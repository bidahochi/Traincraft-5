//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FBFDL
// Model Creator: binky & dominik & bidah
// Created on: 07.01.2023 - 17:14:39
// Last changed on: 07.01.2023 - 17:14:39

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
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

public class ModelFBFDL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFBFDL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[270];

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
		bodyModel[89] = new ModelRendererTurbo(this, 76, 118, textureX, textureY, "cull"); // Box 6 vent cull
		bodyModel[90] = new ModelRendererTurbo(this, 162, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[91] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[92] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[93] = new ModelRendererTurbo(this, 360, 7, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 369, 13, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 352, 1, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 386, 1, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 352, 13, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 386, 13, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 340, 19, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 267, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[102] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 0 Dynamics
		bodyModel[103] = new ModelRendererTurbo(this, 293, 4, textureX, textureY); // Box 0 Dynamics
		bodyModel[104] = new ModelRendererTurbo(this, 253, 1, textureX, textureY); // Box 0 Dynamics
		bodyModel[105] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 0 Dynamics
		bodyModel[106] = new ModelRendererTurbo(this, 342, 178, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[107] = new ModelRendererTurbo(this, 282, 178, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[108] = new ModelRendererTurbo(this, 295, 165, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[109] = new ModelRendererTurbo(this, 299, 169, textureX, textureY); // Box 0 Radiator and fan shaft
		bodyModel[110] = new ModelRendererTurbo(this, 308, 26, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[111] = new ModelRendererTurbo(this, 310, 16, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[112] = new ModelRendererTurbo(this, 297, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[113] = new ModelRendererTurbo(this, 329, 19, textureX, textureY, "cull"); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[114] = new ModelRendererTurbo(this, 276, 203, textureX, textureY); // Box 0 Batteries
		bodyModel[115] = new ModelRendererTurbo(this, 276, 203, textureX, textureY); // Box 0 Batteries
		bodyModel[116] = new ModelRendererTurbo(this, 108, 205, textureX, textureY); // Box 0 Electrical box
		bodyModel[117] = new ModelRendererTurbo(this, 85, 216, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[118] = new ModelRendererTurbo(this, 85, 216, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[119] = new ModelRendererTurbo(this, 126, 190, textureX, textureY); // Box 0 Air tanks
		bodyModel[120] = new ModelRendererTurbo(this, 136, 190, textureX, textureY); // Box 0 Air tanks
		bodyModel[121] = new ModelRendererTurbo(this, 92, 203, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[122] = new ModelRendererTurbo(this, 92, 203, textureX, textureY); // Box 0 Steam Gen 2 CN & Via
		bodyModel[123] = new ModelRendererTurbo(this, 174, 151, textureX, textureY); // Box 120
		bodyModel[124] = new ModelRendererTurbo(this, 380, 151, textureX, textureY); // Box 120
		bodyModel[125] = new ModelRendererTurbo(this, 294, 146, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 312, 146, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 266, 146, textureX, textureY); // Box 79
		bodyModel[128] = new ModelRendererTurbo(this, 248, 146, textureX, textureY); // Box 80
		bodyModel[129] = new ModelRendererTurbo(this, 463, 146, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 451, 146, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 79
		bodyModel[132] = new ModelRendererTurbo(this, 97, 146, textureX, textureY); // Box 80
		bodyModel[133] = new ModelRendererTurbo(this, 142, 48, textureX, textureY); // Box 301
		bodyModel[134] = new ModelRendererTurbo(this, 153, 48, textureX, textureY); // Box 302
		bodyModel[135] = new ModelRendererTurbo(this, 485, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[136] = new ModelRendererTurbo(this, 490, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[137] = new ModelRendererTurbo(this, 503, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[138] = new ModelRendererTurbo(this, 498, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[139] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[140] = new ModelRendererTurbo(this, 67, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[141] = new ModelRendererTurbo(this, 80, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[142] = new ModelRendererTurbo(this, 75, 137, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[143] = new ModelRendererTurbo(this, 76, 118, textureX, textureY, "cull"); // Box 6 vent cull
		bodyModel[144] = new ModelRendererTurbo(this, 162, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[145] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[146] = new ModelRendererTurbo(this, 221, 103, textureX, textureY); // Box 6 late FB-2 and later
		bodyModel[147] = new ModelRendererTurbo(this, 306, 100, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[148] = new ModelRendererTurbo(this, 306, 105, textureX, textureY); // backing light type 1 socket
		bodyModel[149] = new ModelRendererTurbo(this, 306, 100, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[150] = new ModelRendererTurbo(this, 306, 105, textureX, textureY); // backing light type 1 socket
		bodyModel[151] = new ModelRendererTurbo(this, 251, 240, textureX, textureY); // Box 0 FA-2 & after
		bodyModel[152] = new ModelRendererTurbo(this, 282, 236, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 256, 233, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 161, 187, textureX, textureY); // Box 21
		bodyModel[155] = new ModelRendererTurbo(this, 260, 137, textureX, textureY); // Box 602
		bodyModel[156] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 384
		bodyModel[157] = new ModelRendererTurbo(this, 326, 216, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 320, 190, textureX, textureY); // Box 10
		bodyModel[159] = new ModelRendererTurbo(this, 339, 245, textureX, textureY); // Box 157
		bodyModel[160] = new ModelRendererTurbo(this, 339, 237, textureX, textureY); // Box 158
		bodyModel[161] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[162] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[163] = new ModelRendererTurbo(this, 135, 55, textureX, textureY); // Box 644
		bodyModel[164] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 644
		bodyModel[165] = new ModelRendererTurbo(this, 158, 57, textureX, textureY); // Box 364 prime base
		bodyModel[166] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[167] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[168] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[169] = new ModelRendererTurbo(this, 167, 57, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[170] = new ModelRendererTurbo(this, 480, 128, textureX, textureY); // Box 31
		bodyModel[171] = new ModelRendererTurbo(this, 482, 123, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[172] = new ModelRendererTurbo(this, 482, 123, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[173] = new ModelRendererTurbo(this, 57, 128, textureX, textureY); // Box 31
		bodyModel[174] = new ModelRendererTurbo(this, 59, 123, textureX, textureY, "lamp"); // Box 247 headlight front 2 beam
		bodyModel[175] = new ModelRendererTurbo(this, 59, 123, textureX, textureY, "lamp"); // Box 248 headlight front 2 beam
		bodyModel[176] = new ModelRendererTurbo(this, 269, 149, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[177] = new ModelRendererTurbo(this, 276, 149, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[178] = new ModelRendererTurbo(this, 253, 155, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[179] = new ModelRendererTurbo(this, 246, 155, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[180] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 644
		bodyModel[181] = new ModelRendererTurbo(this, 129, 54, textureX, textureY); // Box 413
		bodyModel[182] = new ModelRendererTurbo(this, 122, 46, textureX, textureY); // Box 414 fncc numberboard
		bodyModel[183] = new ModelRendererTurbo(this, 122, 49, textureX, textureY); // Box 414 fncc numberboard
		bodyModel[184] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 369
		bodyModel[185] = new ModelRendererTurbo(this, 439, 98, textureX, textureY); // Box 370
		bodyModel[186] = new ModelRendererTurbo(this, 444, 107, textureX, textureY); // Box 371
		bodyModel[187] = new ModelRendererTurbo(this, 332, 95, textureX, textureY); // Box 547
		bodyModel[188] = new ModelRendererTurbo(this, 332, 109, textureX, textureY); // Box 548
		bodyModel[189] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[190] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[191] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[192] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[193] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[194] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[195] = new ModelRendererTurbo(this, 174, 225, textureX, textureY); // Box 242
		bodyModel[196] = new ModelRendererTurbo(this, 178, 246, textureX, textureY); // Box 243
		bodyModel[197] = new ModelRendererTurbo(this, 161, 213, textureX, textureY); // Box 244
		bodyModel[198] = new ModelRendererTurbo(this, 149, 194, textureX, textureY); // Box 245
		bodyModel[199] = new ModelRendererTurbo(this, 180, 194, textureX, textureY); // Box 246
		bodyModel[200] = new ModelRendererTurbo(this, 197, 194, textureX, textureY); // Box 247
		bodyModel[201] = new ModelRendererTurbo(this, 147, 202, textureX, textureY); // Box 248
		bodyModel[202] = new ModelRendererTurbo(this, 149, 198, textureX, textureY); // Box 249
		bodyModel[203] = new ModelRendererTurbo(this, 214, 201, textureX, textureY); // Box 250
		bodyModel[204] = new ModelRendererTurbo(this, 183, 211, textureX, textureY); // Box 252
		bodyModel[205] = new ModelRendererTurbo(this, 182, 206, textureX, textureY); // Box 253
		bodyModel[206] = new ModelRendererTurbo(this, 182, 206, textureX, textureY); // Box 253
		bodyModel[207] = new ModelRendererTurbo(this, 183, 211, textureX, textureY); // Box 254
		bodyModel[208] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 257
		bodyModel[209] = new ModelRendererTurbo(this, 214, 196, textureX, textureY); // Box 259
		bodyModel[210] = new ModelRendererTurbo(this, 225, 194, textureX, textureY); // Box 261
		bodyModel[211] = new ModelRendererTurbo(this, 245, 200, textureX, textureY); // Box 264
		bodyModel[212] = new ModelRendererTurbo(this, 233, 200, textureX, textureY); // Box 265
		bodyModel[213] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 267
		bodyModel[214] = new ModelRendererTurbo(this, 245, 193, textureX, textureY); // Box 268
		bodyModel[215] = new ModelRendererTurbo(this, 236, 241, textureX, textureY); // Box 270
		bodyModel[216] = new ModelRendererTurbo(this, 227, 208, textureX, textureY); // Box 271
		bodyModel[217] = new ModelRendererTurbo(this, 232, 221, textureX, textureY); // Box 272
		bodyModel[218] = new ModelRendererTurbo(this, 162, 234, textureX, textureY); // Box 273
		bodyModel[219] = new ModelRendererTurbo(this, 173, 230, textureX, textureY); // Box 274
		bodyModel[220] = new ModelRendererTurbo(this, 211, 210, textureX, textureY); // Box 275
		bodyModel[221] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 276
		bodyModel[222] = new ModelRendererTurbo(this, 241, 242, textureX, textureY); // Box 277
		bodyModel[223] = new ModelRendererTurbo(this, 238, 239, textureX, textureY); // Box 278
		bodyModel[224] = new ModelRendererTurbo(this, 227, 214, textureX, textureY); // Box 279
		bodyModel[225] = new ModelRendererTurbo(this, 213, 209, textureX, textureY); // Box 280
		bodyModel[226] = new ModelRendererTurbo(this, 236, 246, textureX, textureY); // Box 281
		bodyModel[227] = new ModelRendererTurbo(this, 142, 233, textureX, textureY); // Box 282
		bodyModel[228] = new ModelRendererTurbo(this, 180, 214, textureX, textureY); // Box 283
		bodyModel[229] = new ModelRendererTurbo(this, 180, 214, textureX, textureY); // Box 284
		bodyModel[230] = new ModelRendererTurbo(this, 128, 250, textureX, textureY); // Box 285
		bodyModel[231] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 286
		bodyModel[232] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 287 cull
		bodyModel[233] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 288 cull
		bodyModel[234] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[235] = new ModelRendererTurbo(this, 174, 227, textureX, textureY, "cull"); // Box 290 cull
		bodyModel[236] = new ModelRendererTurbo(this, 96, 235, textureX, textureY); // Box 291
		bodyModel[237] = new ModelRendererTurbo(this, 96, 235, textureX, textureY); // Box 292
		bodyModel[238] = new ModelRendererTurbo(this, 80, 239, textureX, textureY, "cull"); // Box 294 cull thin bits between cylinders
		bodyModel[239] = new ModelRendererTurbo(this, 80, 239, textureX, textureY, "cull"); // Box 294 cull thin bits between cylinders
		bodyModel[240] = new ModelRendererTurbo(this, 236, 193, textureX, textureY); // Box 297
		bodyModel[241] = new ModelRendererTurbo(this, 236, 200, textureX, textureY); // Box 298
		bodyModel[242] = new ModelRendererTurbo(this, 161, 195, textureX, textureY); // Box 301
		bodyModel[243] = new ModelRendererTurbo(this, 161, 204, textureX, textureY); // Box 303 u can also get jiggy an shake your 7fdl
		bodyModel[244] = new ModelRendererTurbo(this, 143, 210, textureX, textureY); // Box 298
		bodyModel[245] = new ModelRendererTurbo(this, 137, 218, textureX, textureY); // Box 299
		bodyModel[246] = new ModelRendererTurbo(this, 143, 233, textureX, textureY); // Box 300
		bodyModel[247] = new ModelRendererTurbo(this, 215, 239, textureX, textureY); // Box 303
		bodyModel[248] = new ModelRendererTurbo(this, 237, 228, textureX, textureY); // Box 69
		bodyModel[249] = new ModelRendererTurbo(this, 224, 229, textureX, textureY); // Box 75
		bodyModel[250] = new ModelRendererTurbo(this, 219, 228, textureX, textureY); // Box 34
		bodyModel[251] = new ModelRendererTurbo(this, 210, 225, textureX, textureY); // Box 71
		bodyModel[252] = new ModelRendererTurbo(this, 124, 242, textureX, textureY); // Box 308
		bodyModel[253] = new ModelRendererTurbo(this, 130, 236, textureX, textureY); // Box 309
		bodyModel[254] = new ModelRendererTurbo(this, 130, 239, textureX, textureY); // Box 310
		bodyModel[255] = new ModelRendererTurbo(this, 393, 240, textureX, textureY); // Box 639 late tank
		bodyModel[256] = new ModelRendererTurbo(this, 380, 211, textureX, textureY); // Box 640 late tank
		bodyModel[257] = new ModelRendererTurbo(this, 374, 185, textureX, textureY); // Box 641 late tank
		bodyModel[258] = new ModelRendererTurbo(this, 393, 232, textureX, textureY); // Box 642 late tank
		bodyModel[259] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 19
		bodyModel[260] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 19
		bodyModel[261] = new ModelRendererTurbo(this, 432, 215, textureX, textureY); // Box 548
		bodyModel[262] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 646
		bodyModel[263] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 647
		bodyModel[264] = new ModelRendererTurbo(this, 428, 185, textureX, textureY); // Box 648
		bodyModel[265] = new ModelRendererTurbo(this, 449, 194, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[266] = new ModelRendererTurbo(this, 431, 194, textureX, textureY, "cull"); // Box 650 cull piping
		bodyModel[267] = new ModelRendererTurbo(this, 438, 194, textureX, textureY, "cull"); // Box 650 cull piping
		bodyModel[268] = new ModelRendererTurbo(this, 337, 6, textureX, textureY); // exhaust original
		bodyModel[269] = new ModelRendererTurbo(this, 307, 36, textureX, textureY, "cull"); // Box 456 fmsr winterization hatch CULL

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

		bodyModel[93].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 0
		bodyModel[93].setRotationPoint(14.5F, -19.5F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[94].setRotationPoint(18.5F, -19.5F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(18.5F, -19.5F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 0
		bodyModel[96].setRotationPoint(14.5F, -19.5F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 0
		bodyModel[97].setRotationPoint(22.5F, -19.5F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[98].setRotationPoint(14.5F, -19.5F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[99].setRotationPoint(22.5F, -19.5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(14.5F, -19.51F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[101].setRotationPoint(-12.45F, -19.5F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[102].setRotationPoint(-7.95F, -19.5F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 Dynamics
		bodyModel[103].setRotationPoint(-3.45F, -19.5F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 0 Dynamics
		bodyModel[104].setRotationPoint(-14.95F, -19.5F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0 Dynamics
		bodyModel[105].setRotationPoint(-13F, -18F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[106].setRotationPoint(14F, -14F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[107].setRotationPoint(14F, -14F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[108].setRotationPoint(14F, -17F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Radiator and fan shaft
		bodyModel[109].setRotationPoint(14F, -18F, -8F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[110].setRotationPoint(10.5F, -19.65F, -4F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[111].setRotationPoint(11.5F, -20.65F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[112].setRotationPoint(10.5F, -20.65F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 CP winterization hatch cull FB/FPB-2
		bodyModel[113].setRotationPoint(15.5F, -20.65F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Batteries
		bodyModel[114].setRotationPoint(29F, -5F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 Batteries
		bodyModel[115].setRotationPoint(29F, -5F, -10F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 17, 10, 0F); // Box 0 Electrical box
		bodyModel[116].setRotationPoint(-19F, -16F, -5F);

		bodyModel[117].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[117].setRotationPoint(-26F, -10F, 1F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 11, 5, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[118].setRotationPoint(-26F, -10F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 0 Air tanks
		bodyModel[119].setRotationPoint(-24F, -13F, -9F);
		bodyModel[119].rotateAngleY = -0.78539816F;

		bodyModel[120].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 0 Air tanks
		bodyModel[120].setRotationPoint(-34F, -13F, -9F);
		bodyModel[120].rotateAngleY = -0.78539816F;

		bodyModel[121].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[121].setRotationPoint(-24F, -19.5F, -4F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 0 Steam Gen 2 CN & Via
		bodyModel[122].setRotationPoint(-24F, -19.5F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[123].setRotationPoint(-2F, 2F, -11.01F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[124].setRotationPoint(-2F, 2F, 11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[125].setRotationPoint(35.5F, -5F, 11F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[126].setRotationPoint(32.5F, -5F, 11F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[127].setRotationPoint(35.5F, -5F, -12F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[128].setRotationPoint(32.5F, -5F, -12F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[129].setRotationPoint(-32.5F, -5F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[130].setRotationPoint(-35.5F, -5F, 11F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 79
		bodyModel[131].setRotationPoint(-32.5F, -5F, -12F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 80
		bodyModel[132].setRotationPoint(-35.5F, -5F, -12F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[133].setRotationPoint(-20F, -20.5F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[134].setRotationPoint(-18F, -19.5F, -0.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[135].setRotationPoint(37F, -17F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[136].setRotationPoint(37F, -17F, -4F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[137].setRotationPoint(37F, -17F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[138].setRotationPoint(37F, -17F, 3F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[139].setRotationPoint(-38F, -17F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[140].setRotationPoint(-38F, -17F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[141].setRotationPoint(-38F, -17F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[142].setRotationPoint(-38F, -17F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 64, 8, 1, 0F,0F, 0F, 0F, -32F, 0F, 0F, -32F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -32F, -4F, 0F, -32F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 vent cull
		bodyModel[143].setRotationPoint(-35F, -15F, -11.02F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -12F, -4F, 0F, -12F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 late FB-2 and later
		bodyModel[144].setRotationPoint(3F, -15F, -11.02F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6 FB/FPB-2 and 4 vent
		bodyModel[145].setRotationPoint(15F, -15F, -11.02F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, -0.75F, 0F, -4F, -0.75F); // Box 6 late FB-2 and later
		bodyModel[146].setRotationPoint(26F, -15F, -11.02F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[147].setRotationPoint(36.5F, -8F, 5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[148].setRotationPoint(35.75F, -8F, 5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // backing light type 1
		bodyModel[149].setRotationPoint(-37.5F, -8F, -7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // backing light type 1 socket
		bodyModel[150].setRotationPoint(-36.75F, -8F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 FA-2 & after
		bodyModel[151].setRotationPoint(11.5F, -5F, 0.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(19.8F, -14F, 0F);
		bodyModel[152].rotateAngleY = -0.76794487F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(18.5F, -1F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		bodyModel[154].setRotationPoint(5F, -19.5F, -3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 602
		bodyModel[155].setRotationPoint(36.01F, 2F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 384
		bodyModel[156].setRotationPoint(-36.01F, 2F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 2
		bodyModel[157].setRotationPoint(-7.5F, 5F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 15, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[158].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[159].setRotationPoint(-7.5F, 5F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[160].setRotationPoint(-7.5F, 5F, 8F);

		bodyModel[161].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[161].setRotationPoint(-4.5F, 1.5F, -11.25F);
		bodyModel[161].rotateAngleX = 1.57079633F;

		bodyModel[162].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[162].setRotationPoint(-4.5F, 1.5F, 11.25F);
		bodyModel[162].rotateAngleX = -1.57079633F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[163].setRotationPoint(-33F, -20F, 1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[164].setRotationPoint(-31.5F, -20.8F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[165].setRotationPoint(-30F, -20F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[166].setRotationPoint(-30F, -20.5F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[167].setRotationPoint(-30F, -20.5F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[168].setRotationPoint(-30F, -20.5F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[169].setRotationPoint(-30F, -20.5F, -1F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[170].setRotationPoint(35.75F, -17.25F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[171].setRotationPoint(36F, -17.25F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[172].setRotationPoint(36F, -17.25F, 0F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[173].setRotationPoint(-36.75F, -17.25F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 2 beam
		bodyModel[174].setRotationPoint(-37.5F, -17.25F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight front 2 beam
		bodyModel[175].setRotationPoint(-37.5F, -17.25F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[176].setRotationPoint(35.75F, 0F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[177].setRotationPoint(35.75F, 0F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[178].setRotationPoint(-36.75F, 0F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[179].setRotationPoint(-36.75F, 0F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[180].setRotationPoint(-18F, -20.8F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[181].setRotationPoint(-18F, -20.8F, -3F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 414 fncc numberboard
		bodyModel[182].setRotationPoint(-2F, -17.5F, -11.01F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 414 fncc numberboard
		bodyModel[183].setRotationPoint(-2F, -17.5F, 11.01F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[184].setRotationPoint(9.5F, -19F, 1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[185].setRotationPoint(9.5F, -19F, -8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[186].setRotationPoint(9.5F, -19F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[187].setRotationPoint(10.5F, -19.51F, 1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[188].setRotationPoint(10.5F, -19.51F, -15F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[189].setRotationPoint(16.5F, -15F, -11.1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[190].setRotationPoint(19.25F, -15F, -11.35F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[191].setRotationPoint(13.5F, -15F, -11.1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[192].setRotationPoint(19.25F, -15F, 10.35F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[193].setRotationPoint(16.5F, -15F, 10.1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[194].setRotationPoint(13.5F, -15F, 10.1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 13, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[195].setRotationPoint(-5.5F, -11F, -4.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[196].setRotationPoint(-5.5F, 0F, -2.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 244
		bodyModel[197].setRotationPoint(7.05F, -16.5F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 245
		bodyModel[198].setRotationPoint(10F, -14F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 246
		bodyModel[199].setRotationPoint(6.5F, -16F, 3F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 247
		bodyModel[200].setRotationPoint(6.5F, -16F, -7F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 248
		bodyModel[201].setRotationPoint(10F, -13F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[202].setRotationPoint(10F, -11F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[203].setRotationPoint(10F, -13F, 4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[204].setRotationPoint(-5.5F, -9F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[205].setRotationPoint(-5.5F, -11.5F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[206].setRotationPoint(-5.5F, -11.5F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[207].setRotationPoint(-5.5F, -9F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.5F, 3F, -0.5F, 0F, 3F, -0.5F, 0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 257
		bodyModel[208].setRotationPoint(11.5F, -10F, 1.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[209].setRotationPoint(10F, -13F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -3F, -0.5F, -0.5F, -3F, -0.5F, -0.625F, -0.75F, -0.5F, 0.125F, -0.75F, -0.5F, 0F, 3F, -0.5F, -0.5F, 3F, -0.5F, -0.625F, 0F, 0F, 0.125F, 0F, 0F); // Box 261
		bodyModel[210].setRotationPoint(11.5F, -16F, -4.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 264
		bodyModel[211].setRotationPoint(10.5F, -13F, -3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, -1F, 0.5F, -0.375F, -1F, 0.5F); // Box 265
		bodyModel[212].setRotationPoint(10.5F, -11F, -3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.375F, -1F, 0.5F, -0.125F, -1F, 0.5F, -0.125F, 0F, -1F, -0.375F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F); // Box 267
		bodyModel[213].setRotationPoint(10.5F, -15F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		bodyModel[214].setRotationPoint(10.5F, -13F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 270
		bodyModel[215].setRotationPoint(10.5F, -6.5F, -6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[216].setRotationPoint(10.5F, -10.5F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272
		bodyModel[217].setRotationPoint(6.5F, -9F, -7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[218].setRotationPoint(8.5F, -6.5F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[219].setRotationPoint(7.5F, -6.5F, 5.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[220].setRotationPoint(6.5F, -9F, 3.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[221].setRotationPoint(7.5F, -3F, 0.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		bodyModel[222].setRotationPoint(9.5F, -5F, 1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[223].setRotationPoint(7.5F, -6F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 279
		bodyModel[224].setRotationPoint(9.5F, -8.5F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[225].setRotationPoint(7.5F, -13F, -4.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[226].setRotationPoint(7F, -3F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 1F, -0.05F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[227].setRotationPoint(7.5F, -7.5F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, -2F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[228].setRotationPoint(-5.6F, -14F, -4.25F);
		bodyModel[228].rotateAngleX = 0.31415927F;

		bodyModel[229].addShapeBox(0F, 0F, -2F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[229].setRotationPoint(-5.6F, -14F, 4.25F);
		bodyModel[229].rotateAngleX = -0.31415927F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[230].setRotationPoint(-5.5F, -13F, -1.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[231].setRotationPoint(-5.5F, -15.5F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 287 cull
		bodyModel[232].setRotationPoint(5F, -15.5F, -0.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 288 cull
		bodyModel[233].setRotationPoint(2F, -15.5F, -0.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 289 cull
		bodyModel[234].setRotationPoint(-1F, -15.5F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Box 290 cull
		bodyModel[235].setRotationPoint(-4F, -15.5F, -0.5F);

		bodyModel[236].addShapeBox(-1F, -0.5F, 2.5F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 291
		bodyModel[236].setRotationPoint(-5.6F, -14F, 4.25F);
		bodyModel[236].rotateAngleX = -0.52359878F;

		bodyModel[237].addShapeBox(-1F, -0.5F, -2.5F, 13, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 292
		bodyModel[237].setRotationPoint(-5.6F, -14F, -4.25F);
		bodyModel[237].rotateAngleX = 0.52359878F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 294 cull thin bits between cylinders
		bodyModel[238].setRotationPoint(1F, -14.25F, -6.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 294 cull thin bits between cylinders
		bodyModel[239].setRotationPoint(-5F, -14.25F, -6.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.375F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.625F, -1F, 0F, 0.125F, -1F, 0F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0.125F, 0F, -0.5F); // Box 297
		bodyModel[240].setRotationPoint(11F, -16F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, 0.125F, -1F, 0F, -0.625F, -1F, 0F, -0.125F, -0.75F, 0F, -0.375F, -0.75F, 0F); // Box 298
		bodyModel[241].setRotationPoint(11F, -10F, -2F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 301
		bodyModel[242].setRotationPoint(5.05F, -20.5F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 303 u can also get jiggy an shake your 7fdl
		bodyModel[243].setRotationPoint(6.05F, -18.5F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 298
		bodyModel[244].setRotationPoint(-13.5F, -10F, -2F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 299
		bodyModel[245].setRotationPoint(-13.5F, -7F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[246].setRotationPoint(-13.5F, -3F, -2F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 6, 8, 0F); // Box 303
		bodyModel[247].setRotationPoint(-7.5F, -6F, -4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[248].setRotationPoint(-7.5F, -11F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[249].setRotationPoint(-7.5F, -7F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[250].setRotationPoint(-7.5F, -11F, 1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[251].setRotationPoint(-7.5F, -13F, -1F);

		bodyModel[252].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 308
		bodyModel[252].setRotationPoint(6.5F, -16.5F, -5.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 309
		bodyModel[253].setRotationPoint(5.5F, -16.5F, -4.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[254].setRotationPoint(6.5F, -16.5F, 4.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639 late tank
		bodyModel[255].setRotationPoint(-6.25F, 5F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 640 late tank
		bodyModel[256].setRotationPoint(-6.25F, 5F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 15, 3, 22, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641 late tank
		bodyModel[257].setRotationPoint(-6.25F, 2F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 642 late tank
		bodyModel[258].setRotationPoint(-6.25F, 5F, 8F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[259].setRotationPoint(-8.25F, 6F, -9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[260].setRotationPoint(-9.25F, 7F, -9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[261].setRotationPoint(-7.25F, 7F, -9F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 646
		bodyModel[262].setRotationPoint(-8.25F, 2.5F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[263].setRotationPoint(-9.25F, 3.5F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 648
		bodyModel[264].setRotationPoint(-7.25F, 3.5F, -9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 527 why dont you filter some grass instead
		bodyModel[265].setRotationPoint(-9F, 1.5F, 9F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 650 cull piping
		bodyModel[266].setRotationPoint(-9.25F, 2F, -10F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 650 cull piping
		bodyModel[267].setRotationPoint(-9.25F, 2F, 9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, 0.01F, 0.2F, 0F, -0.01F, 0.2F, 0F); // exhaust original
		bodyModel[268].setRotationPoint(7F, -20.5F, -2F);

		bodyModel[269].addBox(0F, 0F, 0F, 7, 2, 8, 0F); // Box 456 fmsr winterization hatch CULL
		bodyModel[269].setRotationPoint(10.5F, -20.65F, -4F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();
	ModelFB2_new theF = new ModelFB2_new();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 623 ||GetColor(entity) == 944) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.31, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.62, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_b.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.31, -0.03, 0);
			theF.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.62, 0, 0);
			theF.render(entity, f, f1, f2, f3, f4, f5);
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