//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sd70m
// Model Creator: bidahochi
// Created on: 15.02.2025 - 14:06:03
// Last changed on: 15.02.2025 - 14:06:03

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAlcoPATruck_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBLW_commonwealth_c;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.LightSourceFaceDirection;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelDT662000NA extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDT662000NA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[397];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 277, 175, textureX, textureY); // Box 301
		bodyModel[1] = new ModelRendererTurbo(this, 13, 176, textureX, textureY); // Box 217
		bodyModel[2] = new ModelRendererTurbo(this, 302, 129, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 92, 235, textureX, textureY); // Box 301
		bodyModel[4] = new ModelRendererTurbo(this, 92, 249, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[5] = new ModelRendererTurbo(this, 92, 244, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[6] = new ModelRendererTurbo(this, 13, 197, textureX, textureY); // Box 217
		bodyModel[7] = new ModelRendererTurbo(this, 59, 197, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 103, 236, textureX, textureY); // Box 217
		bodyModel[9] = new ModelRendererTurbo(this, 91, 233, textureX, textureY); // Box 301
		bodyModel[10] = new ModelRendererTurbo(this, 59, 178, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 60, 184, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 301
		bodyModel[13] = new ModelRendererTurbo(this, 69, 182, textureX, textureY); // Box 301
		bodyModel[14] = new ModelRendererTurbo(this, 72, 178, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[15] = new ModelRendererTurbo(this, 103, 245, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 92, 237, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 72, 185, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[18] = new ModelRendererTurbo(this, 254, 211, textureX, textureY); // Box 217
		bodyModel[19] = new ModelRendererTurbo(this, 275, 232, textureX, textureY); // Box 217
		bodyModel[20] = new ModelRendererTurbo(this, 272, 232, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 219, 178, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 220, 184, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 222, 182, textureX, textureY); // Box 301
		bodyModel[24] = new ModelRendererTurbo(this, 195, 182, textureX, textureY); // Box 301
		bodyModel[25] = new ModelRendererTurbo(this, 212, 178, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[26] = new ModelRendererTurbo(this, 212, 185, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[27] = new ModelRendererTurbo(this, 257, 191, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 97, 176, textureX, textureY); // Box 217
		bodyModel[29] = new ModelRendererTurbo(this, 135, 251, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[30] = new ModelRendererTurbo(this, 136, 229, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[31] = new ModelRendererTurbo(this, 121, 235, textureX, textureY); // Box 301
		bodyModel[32] = new ModelRendererTurbo(this, 159, 233, textureX, textureY); // Box 301
		bodyModel[33] = new ModelRendererTurbo(this, 159, 237, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 152, 236, textureX, textureY); // Box 217
		bodyModel[35] = new ModelRendererTurbo(this, 152, 245, textureX, textureY); // Box 32
		bodyModel[36] = new ModelRendererTurbo(this, 17, 54, textureX, textureY); // box03
		bodyModel[37] = new ModelRendererTurbo(this, 11, 43, textureX, textureY); // box03
		bodyModel[38] = new ModelRendererTurbo(this, 20, 37, textureX, textureY); // box03
		bodyModel[39] = new ModelRendererTurbo(this, 31, 51, textureX, textureY); // box03
		bodyModel[40] = new ModelRendererTurbo(this, 31, 34, textureX, textureY); // box03
		bodyModel[41] = new ModelRendererTurbo(this, 11, 40, textureX, textureY); // box03
		bodyModel[42] = new ModelRendererTurbo(this, 24, 59, textureX, textureY); // box03
		bodyModel[43] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 308
		bodyModel[44] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 94
		bodyModel[46] = new ModelRendererTurbo(this, 183, 54, textureX, textureY); // box03
		bodyModel[47] = new ModelRendererTurbo(this, 334, 67, textureX, textureY); // box03
		bodyModel[48] = new ModelRendererTurbo(this, 186, 37, textureX, textureY); // box03
		bodyModel[49] = new ModelRendererTurbo(this, 197, 34, textureX, textureY); // box03
		bodyModel[50] = new ModelRendererTurbo(this, 334, 64, textureX, textureY); // box03
		bodyModel[51] = new ModelRendererTurbo(this, 302, 67, textureX, textureY); // Box 105
		bodyModel[52] = new ModelRendererTurbo(this, 197, 51, textureX, textureY); // Box 106
		bodyModel[53] = new ModelRendererTurbo(this, 302, 64, textureX, textureY); // Box 107
		bodyModel[54] = new ModelRendererTurbo(this, 307, 56, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 307, 42, textureX, textureY); // Box 110
		bodyModel[56] = new ModelRendererTurbo(this, 136, 70, textureX, textureY); // Box 315 door swing left
		bodyModel[57] = new ModelRendererTurbo(this, 303, 145, textureX, textureY); // Box 16
		bodyModel[58] = new ModelRendererTurbo(this, 302, 136, textureX, textureY); // Box 117
		bodyModel[59] = new ModelRendererTurbo(this, 174, 147, textureX, textureY); // Box 118
		bodyModel[60] = new ModelRendererTurbo(this, 272, 143, textureX, textureY,"cull"); // Box 119 cull
		bodyModel[61] = new ModelRendererTurbo(this, 303, 152, textureX, textureY); // Box 120
		bodyModel[62] = new ModelRendererTurbo(this, 272, 139, textureX, textureY,"cull"); // Box 122 cull
		bodyModel[63] = new ModelRendererTurbo(this, 267, 143, textureX, textureY,"cull"); // Box 124 cull
		bodyModel[64] = new ModelRendererTurbo(this, 265, 139, textureX, textureY,"cull"); // Box 125 cull
		bodyModel[65] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 315
		bodyModel[66] = new ModelRendererTurbo(this, 196, 121, textureX, textureY); // Box 35
		bodyModel[67] = new ModelRendererTurbo(this, 136, 51, textureX, textureY); // Box 130
		bodyModel[68] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 315
		bodyModel[69] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 133
		bodyModel[70] = new ModelRendererTurbo(this, 172, 51, textureX, textureY); // Box 315 door swing right
		bodyModel[71] = new ModelRendererTurbo(this, 143, 34, textureX, textureY); // box03
		bodyModel[72] = new ModelRendererTurbo(this, 144, 42, textureX, textureY); // box03
		bodyModel[73] = new ModelRendererTurbo(this, 146, 49, textureX, textureY); // box03
		bodyModel[74] = new ModelRendererTurbo(this, 144, 27, textureX, textureY); // Box 139
		bodyModel[75] = new ModelRendererTurbo(this, 164, 22, textureX, textureY); // Box 140
		bodyModel[76] = new ModelRendererTurbo(this, 165, 16, textureX, textureY); // box03
		bodyModel[77] = new ModelRendererTurbo(this, 179, 48, textureX, textureY); // box03
		bodyModel[78] = new ModelRendererTurbo(this, 174, 19, textureX, textureY); // box03
		bodyModel[79] = new ModelRendererTurbo(this, 185, 46, textureX, textureY); // box03
		bodyModel[80] = new ModelRendererTurbo(this, 169, 8, textureX, textureY); // box03
		bodyModel[81] = new ModelRendererTurbo(this, 176, 31, textureX, textureY); // box03
		bodyModel[82] = new ModelRendererTurbo(this, 179, 11, textureX, textureY); // box03
		bodyModel[83] = new ModelRendererTurbo(this, 177, 39, textureX, textureY); // box03
		bodyModel[84] = new ModelRendererTurbo(this, 172, 2, textureX, textureY); // Box 149
		bodyModel[85] = new ModelRendererTurbo(this, 189, 15, textureX, textureY); // Box 150
		bodyModel[86] = new ModelRendererTurbo(this, 174, 16, textureX, textureY); // Box 151
		bodyModel[87] = new ModelRendererTurbo(this, 190, 22, textureX, textureY); // Box 152
		bodyModel[88] = new ModelRendererTurbo(this, 178, 3, textureX, textureY); // Box 153
		bodyModel[89] = new ModelRendererTurbo(this, 185, 28, textureX, textureY); // Box 154
		bodyModel[90] = new ModelRendererTurbo(this, 211, 134, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[91] = new ModelRendererTurbo(this, 202, 139, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[92] = new ModelRendererTurbo(this, 211, 139, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[93] = new ModelRendererTurbo(this, 236, 177, textureX, textureY,"cull"); // Box 197 cull
		bodyModel[94] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 109
		bodyModel[95] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 184
		bodyModel[96] = new ModelRendererTurbo(this, 89, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[97] = new ModelRendererTurbo(this, 104, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[98] = new ModelRendererTurbo(this, 92, 241, textureX, textureY,"cull"); // Box 189 cull
		bodyModel[99] = new ModelRendererTurbo(this, 129, 170, textureX, textureY); // Box 301
		bodyModel[100] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 301
		bodyModel[101] = new ModelRendererTurbo(this, 129, 184, textureX, textureY); // Box 713
		bodyModel[102] = new ModelRendererTurbo(this, 127, 172, textureX, textureY); // Box 301
		bodyModel[103] = new ModelRendererTurbo(this, 134, 197, textureX, textureY); // Box 196
		bodyModel[104] = new ModelRendererTurbo(this, 146, 201, textureX, textureY); // Box 197
		bodyModel[105] = new ModelRendererTurbo(this, 129, 190, textureX, textureY); // Box 198
		bodyModel[106] = new ModelRendererTurbo(this, 146, 170, textureX, textureY); // Box 301
		bodyModel[107] = new ModelRendererTurbo(this, 146, 177, textureX, textureY); // Box 301
		bodyModel[108] = new ModelRendererTurbo(this, 146, 184, textureX, textureY); // Box 713
		bodyModel[109] = new ModelRendererTurbo(this, 158, 172, textureX, textureY); // Box 301
		bodyModel[110] = new ModelRendererTurbo(this, 151, 197, textureX, textureY); // Box 196
		bodyModel[111] = new ModelRendererTurbo(this, 163, 201, textureX, textureY); // Box 197
		bodyModel[112] = new ModelRendererTurbo(this, 146, 190, textureX, textureY); // Box 198
		bodyModel[113] = new ModelRendererTurbo(this, 83, 17, textureX, textureY); // Box 175
		bodyModel[114] = new ModelRendererTurbo(this, 282, 10, textureX, textureY); // Box 175
		bodyModel[115] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 113, 96, textureX, textureY, "markerlight_type2_1"); // Markerlight glow
		bodyModel[117] = new ModelRendererTurbo(this, 113, 93, textureX, textureY, "markerlight_type2_2"); // Markerlight glow
		bodyModel[118] = new ModelRendererTurbo(this, 116, 102, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 115, 110, textureX, textureY, "markerlight_type2_3"); // Markerlight glow
		bodyModel[120] = new ModelRendererTurbo(this, 115, 113, textureX, textureY, "markerlight_type2_4"); // Markerlight glow
		bodyModel[121] = new ModelRendererTurbo(this, 120, 107, textureX, textureY, "numberboard_type1_1"); // Box 2 Numberboard type 1
		bodyModel[122] = new ModelRendererTurbo(this, 120, 95, textureX, textureY, "numberboard_type1_2"); // Box 245 numberboard type 1
		bodyModel[123] = new ModelRendererTurbo(this, 149, 97, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 160, 89, textureX, textureY, "markerlight_type2_5"); // Markerlight glow
		bodyModel[125] = new ModelRendererTurbo(this, 160, 92, textureX, textureY, "markerlight_type2_6"); // Markerlight glow
		bodyModel[126] = new ModelRendererTurbo(this, 149, 102, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 160, 110, textureX, textureY, "markerlight_type2_7"); // Markerlight glow
		bodyModel[128] = new ModelRendererTurbo(this, 160, 107, textureX, textureY, "markerlight_type2_8"); // Markerlight glow
		bodyModel[129] = new ModelRendererTurbo(this, 153, 107, textureX, textureY, "numberboard_type1_3"); // Box 2 Numberboard type 1
		bodyModel[130] = new ModelRendererTurbo(this, 153, 95, textureX, textureY, "numberboard_type1_4"); // Box 245 numberboard type 1
		bodyModel[131] = new ModelRendererTurbo(this, 46, 89, textureX, textureY,"big_headlight_top"); // Box 169 headlight front big high
		bodyModel[132] = new ModelRendererTurbo(this, 55, 90, textureX, textureY,"headlight2beamUA1"); // Box 171 headlight front 2beam high
		bodyModel[133] = new ModelRendererTurbo(this, 55, 95, textureX, textureY,"headlight2beamUA2"); // Box 172 headlight front 2beam high
		bodyModel[134] = new ModelRendererTurbo(this, 37, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[135] = new ModelRendererTurbo(this, 226, 89, textureX, textureY,"big_backlight_top"); // Box 169 headlight rear big high
		bodyModel[136] = new ModelRendererTurbo(this, 219, 90, textureX, textureY,"backlight2beamUB1"); // Box 171 headlight rear 2beam high
		bodyModel[137] = new ModelRendererTurbo(this, 219, 95, textureX, textureY,"backlight2beamUB2"); // Box 172 headlight rear 2beam high
		bodyModel[138] = new ModelRendererTurbo(this, 235, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[139] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 381, 129, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 444, 91, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 445, 110, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[143] = new ModelRendererTurbo(this, 360, 91, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 341, 110, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[145] = new ModelRendererTurbo(this, 159, 188, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[146] = new ModelRendererTurbo(this, 170, 175, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[147] = new ModelRendererTurbo(this, 159, 194, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[148] = new ModelRendererTurbo(this, 122, 188, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[149] = new ModelRendererTurbo(this, 74, 175, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[150] = new ModelRendererTurbo(this, 122, 194, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[151] = new ModelRendererTurbo(this, 99, 175, textureX, textureY); // Box 16
		bodyModel[152] = new ModelRendererTurbo(this, 103, 182, textureX, textureY); // Box 16
		bodyModel[153] = new ModelRendererTurbo(this, 99, 186, textureX, textureY); // Box 304
		bodyModel[154] = new ModelRendererTurbo(this, 103, 193, textureX, textureY); // Box 305
		bodyModel[155] = new ModelRendererTurbo(this, 175, 175, textureX, textureY); // Box 16
		bodyModel[156] = new ModelRendererTurbo(this, 179, 182, textureX, textureY); // Box 16
		bodyModel[157] = new ModelRendererTurbo(this, 175, 186, textureX, textureY); // Box 304
		bodyModel[158] = new ModelRendererTurbo(this, 179, 193, textureX, textureY); // Box 305
		bodyModel[159] = new ModelRendererTurbo(this, 116, 181, textureX, textureY); // Box 114
		bodyModel[160] = new ModelRendererTurbo(this, 116, 178, textureX, textureY); // Box 74
		bodyModel[161] = new ModelRendererTurbo(this, 116, 184, textureX, textureY); // Box 78
		bodyModel[162] = new ModelRendererTurbo(this, 114, 175, textureX, textureY,"cull"); // Box 74 cull
		bodyModel[163] = new ModelRendererTurbo(this, 170, 181, textureX, textureY); // Box 114
		bodyModel[164] = new ModelRendererTurbo(this, 170, 178, textureX, textureY); // Box 74
		bodyModel[165] = new ModelRendererTurbo(this, 170, 184, textureX, textureY); // Box 78
		bodyModel[166] = new ModelRendererTurbo(this, 169, 175, textureX, textureY,"cull"); // Box 74 cull
		bodyModel[167] = new ModelRendererTurbo(this, 385, 158, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 373, 161, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 373, 156, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[170] = new ModelRendererTurbo(this, 383, 151, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[171] = new ModelRendererTurbo(this, 408, 168, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[172] = new ModelRendererTurbo(this, 409, 166, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 405, 166, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 438, 153, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 404, 166, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 418, 170, textureX, textureY,"cull"); // Box 329 cull
		bodyModel[177] = new ModelRendererTurbo(this, 425, 173, textureX, textureY); // Box 322
		bodyModel[178] = new ModelRendererTurbo(this, 389, 163, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 366, 154, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 392, 163, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 393, 168, textureX, textureY); // Box 0
		bodyModel[182] = new ModelRendererTurbo(this, 358, 168, textureX, textureY,"cull"); // Box 322 cull
		bodyModel[183] = new ModelRendererTurbo(this, 374, 150, textureX, textureY); // Box 345
		bodyModel[184] = new ModelRendererTurbo(this, 374, 152, textureX, textureY,"cull"); // Box 345 cull
		bodyModel[185] = new ModelRendererTurbo(this, 364, 162, textureX, textureY,"cull"); // Box 345 cull
		bodyModel[186] = new ModelRendererTurbo(this, 373, 152, textureX, textureY); // Box 322
		bodyModel[187] = new ModelRendererTurbo(this, 411, 18, textureX, textureY); // Box 391 cab floor raised
		bodyModel[188] = new ModelRendererTurbo(this, 371, 10, textureX, textureY); // Box 395 cs
		bodyModel[189] = new ModelRendererTurbo(this, 387, 10, textureX, textureY,"gauges_1"); // Box 396 gauges
		bodyModel[190] = new ModelRendererTurbo(this, 364, 12, textureX, textureY); // Box 398 cs
		bodyModel[191] = new ModelRendererTurbo(this, 402, 10, textureX, textureY); // Box 399 cs
		bodyModel[192] = new ModelRendererTurbo(this, 382, 11, textureX, textureY); // Box 401 cs
		bodyModel[193] = new ModelRendererTurbo(this, 397, 21, textureX, textureY); // Box 402 cs ab
		bodyModel[194] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 403 cs ab
		bodyModel[195] = new ModelRendererTurbo(this, 385, 22, textureX, textureY); // Box 404 cs ab
		bodyModel[196] = new ModelRendererTurbo(this, 372, 21, textureX, textureY); // Box 408 cab pannel
		bodyModel[197] = new ModelRendererTurbo(this, 411, 12, textureX, textureY); // Box 391 cab floor raised
		bodyModel[198] = new ModelRendererTurbo(this, 424, 18, textureX, textureY); // Box 391 cab floor raised
		bodyModel[199] = new ModelRendererTurbo(this, 411, 24, textureX, textureY); // Box 375 cab pannel
		bodyModel[200] = new ModelRendererTurbo(this, 405, 30, textureX, textureY); // Box 277
		bodyModel[201] = new ModelRendererTurbo(this, 402, 24, textureX, textureY); // Box 355 brakewheel
		bodyModel[202] = new ModelRendererTurbo(this, 404, 33, textureX, textureY); // Box 394
		bodyModel[203] = new ModelRendererTurbo(this, 378, 74, textureX, textureY); // Box 381
		bodyModel[204] = new ModelRendererTurbo(this, 369, 68, textureX, textureY); // Box 382
		bodyModel[205] = new ModelRendererTurbo(this, 367, 74, textureX, textureY); // Box 383
		bodyModel[206] = new ModelRendererTurbo(this, 391, 57, textureX, textureY); // Box 384
		bodyModel[207] = new ModelRendererTurbo(this, 393, 58, textureX, textureY); // Box 385
		bodyModel[208] = new ModelRendererTurbo(this, 401, 58, textureX, textureY); // Box 386
		bodyModel[209] = new ModelRendererTurbo(this, 392, 69, textureX, textureY,"gauges_2"); // Box 387 gauges
		bodyModel[210] = new ModelRendererTurbo(this, 423, 71, textureX, textureY); // Box 389
		bodyModel[211] = new ModelRendererTurbo(this, 407, 70, textureX, textureY); // Box 390
		bodyModel[212] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 391
		bodyModel[213] = new ModelRendererTurbo(this, 150, 232, textureX, textureY); // Box 208
		bodyModel[214] = new ModelRendererTurbo(this, 53, 232, textureX, textureY); // Box 209
		bodyModel[215] = new ModelRendererTurbo(this, 69, 207, textureX, textureY); // Box 446 mu plug DOUBLE
		bodyModel[216] = new ModelRendererTurbo(this, 271, 206, textureX, textureY); // Box 447 mu plug DOUBLE
		bodyModel[217] = new ModelRendererTurbo(this, 26, 180, textureX, textureY); // Box 442
		bodyModel[218] = new ModelRendererTurbo(this, 26, 187, textureX, textureY); // Box 443
		bodyModel[219] = new ModelRendererTurbo(this, 279, 215, textureX, textureY); // Box 440
		bodyModel[220] = new ModelRendererTurbo(this, 279, 222, textureX, textureY); // Box 441
		bodyModel[221] = new ModelRendererTurbo(this, 62, 207, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[222] = new ModelRendererTurbo(this, 62, 203, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[223] = new ModelRendererTurbo(this, 90, 207, textureX, textureY); // Box 443 ELECTRIC MU TYPE 2
		bodyModel[224] = new ModelRendererTurbo(this, 90, 203, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[225] = new ModelRendererTurbo(this, 270, 185, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[226] = new ModelRendererTurbo(this, 270, 181, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[227] = new ModelRendererTurbo(this, 264, 218, textureX, textureY); // Box 447 ELECTRIC MU TYPE 2
		bodyModel[228] = new ModelRendererTurbo(this, 264, 214, textureX, textureY); // Box 448 ELECTRIC MU TYPE 2
		bodyModel[229] = new ModelRendererTurbo(this, 219, 100, textureX, textureY,"backlight2beamUA1"); // Box 171 headlight rear 2beam horizontal high
		bodyModel[230] = new ModelRendererTurbo(this, 226, 100, textureX, textureY,"backlight2beamUA2"); // Box 171 headlight rear 2beam horizontal high
		bodyModel[231] = new ModelRendererTurbo(this, 48, 100, textureX, textureY,"backlight2beamUB1"); // Box 171 headlight front 2beam horizontal high
		bodyModel[232] = new ModelRendererTurbo(this, 55, 100, textureX, textureY,"backlight2beamUB2"); // Box 171 headlight front 2beam horizontal high
		bodyModel[233] = new ModelRendererTurbo(this, 210, 96, textureX, textureY,"big_headlight_bottom"); // Box 169 headlight rear big low
		bodyModel[234] = new ModelRendererTurbo(this, 194, 90, textureX, textureY,"backlight2beamBA1"); // Box 171 headlight rear 2beam low
		bodyModel[235] = new ModelRendererTurbo(this, 194, 95, textureX, textureY,"backlight2beamBA2"); // Box 172 headlight rear 2beam low
		bodyModel[236] = new ModelRendererTurbo(this, 210, 89, textureX, textureY,"gauges_1"); // Box 358 cull headlight ring
		bodyModel[237] = new ModelRendererTurbo(this, 194, 100, textureX, textureY,"backlight2beamBB1"); // Box 171 headlight rear 2beam horizontal low
		bodyModel[238] = new ModelRendererTurbo(this, 201, 100, textureX, textureY,"backlight2beamBB2"); // Box 171 headlight rear 2beam horizontal low
		bodyModel[239] = new ModelRendererTurbo(this, 62, 96, textureX, textureY,"big_headlight_bottom"); // Box 169 headlight front big low
		bodyModel[240] = new ModelRendererTurbo(this, 80, 90, textureX, textureY,"headlight2beamBA1"); // Box 171 headlight front 2beam low
		bodyModel[241] = new ModelRendererTurbo(this, 80, 95, textureX, textureY,"headlight2beamBA2"); // Box 172 headlight front 2beam low
		bodyModel[242] = new ModelRendererTurbo(this, 62, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[243] = new ModelRendererTurbo(this, 73, 100, textureX, textureY,"headlight2beamBB1"); // Box 171 headlight front 2beam horizontal low
		bodyModel[244] = new ModelRendererTurbo(this, 80, 100, textureX, textureY,"headlight2beamBB2"); // Box 171 headlight front 2beam horizontal low
		bodyModel[245] = new ModelRendererTurbo(this, 389, 143, textureX, textureY); // Box 35
		bodyModel[246] = new ModelRendererTurbo(this, 389, 146, textureX, textureY); // Box 507
		bodyModel[247] = new ModelRendererTurbo(this, 245, 90, textureX, textureY, "numberboard_side_1"); // Box 387 sied numberboard glow
		bodyModel[248] = new ModelRendererTurbo(this, 341, 99, textureX, textureY, "numberboard_side_2"); // Box 387 sied numberboard glow
		bodyModel[249] = new ModelRendererTurbo(this, 151, 91, textureX, textureY); // Box 2
		bodyModel[250] = new ModelRendererTurbo(this, 153, 89, textureX, textureY, "numberboard_type2_1"); // Box 245 numberboard type 2
		bodyModel[251] = new ModelRendererTurbo(this, 153, 113, textureX, textureY, "numberboard_type2_2"); // Box 562 Numberboard type 2
		bodyModel[252] = new ModelRendererTurbo(this, 151, 109, textureX, textureY); // Box 563
		bodyModel[253] = new ModelRendererTurbo(this, 118, 91, textureX, textureY); // Box 2
		bodyModel[254] = new ModelRendererTurbo(this, 120, 89, textureX, textureY, "numberboard_type2_3"); // Box 245 numberboard type 2
		bodyModel[255] = new ModelRendererTurbo(this, 120, 113, textureX, textureY, "numberboard_type2_4"); // Box 562 Numberboard type 2
		bodyModel[256] = new ModelRendererTurbo(this, 120, 109, textureX, textureY); // Box 563
		bodyModel[257] = new ModelRendererTurbo(this, 197, 111, textureX, textureY); // Box 114
		bodyModel[258] = new ModelRendererTurbo(this, 197, 108, textureX, textureY); // Box 74
		bodyModel[259] = new ModelRendererTurbo(this, 197, 114, textureX, textureY); // Box 78
		bodyModel[260] = new ModelRendererTurbo(this, 195, 105, textureX, textureY); // Box 189 holder
		bodyModel[261] = new ModelRendererTurbo(this, 79, 105, textureX, textureY); // Box 601 holder
		bodyModel[262] = new ModelRendererTurbo(this, 79, 111, textureX, textureY); // Box 114
		bodyModel[263] = new ModelRendererTurbo(this, 79, 108, textureX, textureY); // Box 74
		bodyModel[264] = new ModelRendererTurbo(this, 79, 114, textureX, textureY); // Box 78
		bodyModel[265] = new ModelRendererTurbo(this, 98, 105, textureX, textureY); // Box 2
		bodyModel[266] = new ModelRendererTurbo(this, 99, 102, textureX, textureY, "markerlight_type1_1"); // Box Glow
		bodyModel[267] = new ModelRendererTurbo(this, 100, 99, textureX, textureY, "markerlight_type1_2"); // Box Glow
		bodyModel[268] = new ModelRendererTurbo(this, 99, 110, textureX, textureY); // Box 2
		bodyModel[269] = new ModelRendererTurbo(this, 107, 105, textureX, textureY); // Box 613
		bodyModel[270] = new ModelRendererTurbo(this, 108, 110, textureX, textureY); // Box 614
		bodyModel[271] = new ModelRendererTurbo(this, 108, 102, textureX, textureY, "markerlight_type1_3"); // Box Glow
		bodyModel[272] = new ModelRendererTurbo(this, 109, 99, textureX, textureY, "markerlight_type1_4"); // Box Glow
		bodyModel[273] = new ModelRendererTurbo(this, 174, 105, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 175, 102, textureX, textureY, "markerlight_type1_5"); // Box Glow
		bodyModel[275] = new ModelRendererTurbo(this, 176, 99, textureX, textureY, "markerlight_type1_6"); // Box Glow
		bodyModel[276] = new ModelRendererTurbo(this, 175, 110, textureX, textureY); // Box 2
		bodyModel[277] = new ModelRendererTurbo(this, 165, 105, textureX, textureY); // Box 613
		bodyModel[278] = new ModelRendererTurbo(this, 166, 110, textureX, textureY); // Box 614
		bodyModel[279] = new ModelRendererTurbo(this, 166, 102, textureX, textureY, "markerlight_type1_7"); // Box Glow
		bodyModel[280] = new ModelRendererTurbo(this, 167, 99, textureX, textureY, "markerlight_type1_8"); // Box Glow
		bodyModel[281] = new ModelRendererTurbo(this, 214, 12, textureX, textureY); // box64
		bodyModel[282] = new ModelRendererTurbo(this, 214, 22, textureX, textureY); // box65
		bodyModel[283] = new ModelRendererTurbo(this, 143, 19, textureX, textureY); // Box 426
		bodyModel[284] = new ModelRendererTurbo(this, 146, 16, textureX, textureY); // Box 426
		bodyModel[285] = new ModelRendererTurbo(this, 99, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[286] = new ModelRendererTurbo(this, 94, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[287] = new ModelRendererTurbo(this, 200, 136, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[288] = new ModelRendererTurbo(this, 252, 136, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[289] = new ModelRendererTurbo(this, 200, 133, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[290] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[291] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 405 air whistle
		bodyModel[292] = new ModelRendererTurbo(this, 302, 19, textureX, textureY); // Box 405 air whistle
		bodyModel[293] = new ModelRendererTurbo(this, 193, 1, textureX, textureY,"cull"); // Box 3 cull
		bodyModel[294] = new ModelRendererTurbo(this, 193, 22, textureX, textureY,"cull"); // Box 311 cull
		bodyModel[295] = new ModelRendererTurbo(this, 67, 10, textureX, textureY); // Box 183
		bodyModel[296] = new ModelRendererTurbo(this, 65, 4, textureX, textureY); // Box 184
		bodyModel[297] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 266
		bodyModel[298] = new ModelRendererTurbo(this, 293, 20, textureX, textureY); // Box 267
		bodyModel[299] = new ModelRendererTurbo(this, 138, 19, textureX, textureY); // Box 183
		bodyModel[300] = new ModelRendererTurbo(this, 137, 16, textureX, textureY); // Box 184
		bodyModel[301] = new ModelRendererTurbo(this, 143, 11, textureX, textureY); // Box 183
		bodyModel[302] = new ModelRendererTurbo(this, 139, 8, textureX, textureY); // Box 184
		bodyModel[303] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 448 awning
		bodyModel[304] = new ModelRendererTurbo(this, 197, 14, textureX, textureY); // Box 449 awning
		bodyModel[305] = new ModelRendererTurbo(this, 16, 241, textureX, textureY); // Box 22
		bodyModel[306] = new ModelRendererTurbo(this, 39, 241, textureX, textureY); // Box 23
		bodyModel[307] = new ModelRendererTurbo(this, 3, 233, textureX, textureY); // Box 4
		bodyModel[308] = new ModelRendererTurbo(this, 52, 233, textureX, textureY); // Box 322
		bodyModel[309] = new ModelRendererTurbo(this, 5, 221, textureX, textureY); // Box 438
		bodyModel[310] = new ModelRendererTurbo(this, 50, 221, textureX, textureY); // Box 439
		bodyModel[311] = new ModelRendererTurbo(this, 20, 231, textureX, textureY); // Box 448
		bodyModel[312] = new ModelRendererTurbo(this, 39, 231, textureX, textureY); // Box 323
		bodyModel[313] = new ModelRendererTurbo(this, 20, 221, textureX, textureY); // Box 280
		bodyModel[314] = new ModelRendererTurbo(this, 39, 221, textureX, textureY); // Box 285
		bodyModel[315] = new ModelRendererTurbo(this, 223, 240, textureX, textureY); // Box 431
		bodyModel[316] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 432
		bodyModel[317] = new ModelRendererTurbo(this, 187, 233, textureX, textureY); // Box 441
		bodyModel[318] = new ModelRendererTurbo(this, 234, 221, textureX, textureY); // Box 442
		bodyModel[319] = new ModelRendererTurbo(this, 189, 221, textureX, textureY); // Box 443
		bodyModel[320] = new ModelRendererTurbo(this, 247, 223, textureX, textureY); // Box 554
		bodyModel[321] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 517
		bodyModel[322] = new ModelRendererTurbo(this, 223, 230, textureX, textureY); // Box 518
		bodyModel[323] = new ModelRendererTurbo(this, 204, 230, textureX, textureY); // Box 519
		bodyModel[324] = new ModelRendererTurbo(this, 204, 220, textureX, textureY); // Box 520
		bodyModel[325] = new ModelRendererTurbo(this, 154, 12, textureX, textureY); // Box 364 prime base
		bodyModel[326] = new ModelRendererTurbo(this, 154, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[327] = new ModelRendererTurbo(this, 163, 4, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[328] = new ModelRendererTurbo(this, 154, 2, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[329] = new ModelRendererTurbo(this, 163, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[330] = new ModelRendererTurbo(this, 119, 10, textureX, textureY); // Box 354
		bodyModel[331] = new ModelRendererTurbo(this, 118, 13, textureX, textureY); // Box 356
		bodyModel[332] = new ModelRendererTurbo(this, 283, 20, textureX, textureY); // Box 716
		bodyModel[333] = new ModelRendererTurbo(this, 282, 17, textureX, textureY); // Box 717
		bodyModel[334] = new ModelRendererTurbo(this, 129, 10, textureX, textureY); // Box 354
		bodyModel[335] = new ModelRendererTurbo(this, 128, 7, textureX, textureY); // Box 356
		bodyModel[336] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 359
		bodyModel[337] = new ModelRendererTurbo(this, 272, 17, textureX, textureY); // Box 721
		bodyModel[338] = new ModelRendererTurbo(this, 271, 20, textureX, textureY); // Box 722
		bodyModel[339] = new ModelRendererTurbo(this, 273, 23, textureX, textureY); // Box 723
		bodyModel[340] = new ModelRendererTurbo(this, 294, 23, textureX, textureY); // Box 721
		bodyModel[341] = new ModelRendererTurbo(this, 294, 17, textureX, textureY); // Box 723
		bodyModel[342] = new ModelRendererTurbo(this, 66, 1, textureX, textureY); // Box 727
		bodyModel[343] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 728
		bodyModel[344] = new ModelRendererTurbo(this, 149, 15, textureX, textureY); // Box 409 commander base
		bodyModel[345] = new ModelRendererTurbo(this, 149, 11, textureX, textureY,"commander"); // Box 410 commander beacon
		bodyModel[346] = new ModelRendererTurbo(this, 154, 16, textureX, textureY); // Box 183
		bodyModel[347] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 426
		bodyModel[348] = new ModelRendererTurbo(this, 361, 22, textureX, textureY); // Box 404
		bodyModel[349] = new ModelRendererTurbo(this, 354, 17, textureX, textureY); // Box 405
		bodyModel[350] = new ModelRendererTurbo(this, 264, 89, textureX, textureY); // Box 400
		bodyModel[351] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 400
		bodyModel[352] = new ModelRendererTurbo(this, 303, 215, textureX, textureY); // Box 217
		bodyModel[353] = new ModelRendererTurbo(this, 245, 139, textureX, textureY,"cull"); // Box 683 cull
		bodyModel[354] = new ModelRendererTurbo(this, 245, 134, textureX, textureY,"cull"); // Box 684 cull
		bodyModel[355] = new ModelRendererTurbo(this, 252, 139, textureX, textureY,"cull"); // Box 685 cull
		bodyModel[356] = new ModelRendererTurbo(this, 159, 244, textureX, textureY,"cull"); // Box 686 cull
		bodyModel[357] = new ModelRendererTurbo(this, 159, 249, textureX, textureY,"cull"); // Box 687 cull
		bodyModel[358] = new ModelRendererTurbo(this, 159, 241, textureX, textureY,"cull"); // Box 688 cull
		bodyModel[359] = new ModelRendererTurbo(this, 28, 174, textureX, textureY); // Box 217
		bodyModel[360] = new ModelRendererTurbo(this, 28, 194, textureX, textureY); // Box 34
		bodyModel[361] = new ModelRendererTurbo(this, 290, 214, textureX, textureY); // Box 217
		bodyModel[362] = new ModelRendererTurbo(this, 279, 229, textureX, textureY); // Box 34
		bodyModel[363] = new ModelRendererTurbo(this, 310, 166, textureX, textureY); // Box 34
		bodyModel[364] = new ModelRendererTurbo(this, 301, 159, textureX, textureY); // Box 273
		bodyModel[365] = new ModelRendererTurbo(this, 310, 159, textureX, textureY); // Box 274
		bodyModel[366] = new ModelRendererTurbo(this, 301, 166, textureX, textureY); // Box 34
		bodyModel[367] = new ModelRendererTurbo(this, 126, 3, textureX, textureY); // Box 426
		bodyModel[368] = new ModelRendererTurbo(this, 135, 248, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[369] = new ModelRendererTurbo(this, 136, 232, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[370] = new ModelRendererTurbo(this, 374, 147, textureX, textureY); // Box 345
		bodyModel[371] = new ModelRendererTurbo(this, 93, 13, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 98, 13, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 103, 13, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 108, 13, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 331, 9, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 331, 17, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 33, 16, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 58, 16, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 162
		bodyModel[380] = new ModelRendererTurbo(this, 237, 104, textureX, textureY); // Box 162
		bodyModel[381] = new ModelRendererTurbo(this, 291, 6, textureX, textureY); // Box 414
		bodyModel[382] = new ModelRendererTurbo(this, 296, 6, textureX, textureY); // Box 415
		bodyModel[383] = new ModelRendererTurbo(this, 301, 6, textureX, textureY); // Box 416
		bodyModel[384] = new ModelRendererTurbo(this, 306, 6, textureX, textureY); // Box 417
		bodyModel[385] = new ModelRendererTurbo(this, 143, 5, textureX, textureY); // Box 183
		bodyModel[386] = new ModelRendererTurbo(this, 139, 2, textureX, textureY); // Box 184
		bodyModel[387] = new ModelRendererTurbo(this, 138, 27, textureX, textureY); // Box 396
		bodyModel[388] = new ModelRendererTurbo(this, 137, 24, textureX, textureY); // Box 397
		bodyModel[389] = new ModelRendererTurbo(this, 396, 139, textureX, textureY); // Box 0
		bodyModel[390] = new ModelRendererTurbo(this, 394, 143, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[391] = new ModelRendererTurbo(this, 328, 217, textureX, textureY,"cull"); // Box 440 cull
		bodyModel[392] = new ModelRendererTurbo(this, 298, 217, textureX, textureY,"cull"); // Box 401 cull
		bodyModel[393] = new ModelRendererTurbo(this, 102, 217, textureX, textureY,"cull"); // Box 440 cull
		bodyModel[394] = new ModelRendererTurbo(this, 73, 214, textureX, textureY,"cull"); // Box 401 cull
		bodyModel[395] = new ModelRendererTurbo(this, 271, 201, textureX, textureY); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[396] = new ModelRendererTurbo(this, 69, 202, textureX, textureY); // Box 190 ELECTRIC MU TYPE 1

		bodyModel[0].addBox(0F, 0F, 0F, 101, 3, 12, 0F); // Box 301
		bodyModel[0].setRotationPoint(-50.5F, -1F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 17, 24, 0F); // Box 217
		bodyModel[1].setRotationPoint(-50.51F, -9F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 16
		bodyModel[2].setRotationPoint(-46.5F, -1F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 301
		bodyModel[3].setRotationPoint(-50.5F, 5F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F); // Box 301 cull
		bodyModel[4].setRotationPoint(-50.5F, 5F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 301 cull
		bodyModel[5].setRotationPoint(-50.5F, 2F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[6].setRotationPoint(-50.51F, -1F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(-50.51F, -1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[8].setRotationPoint(-46.5F, 1F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 301
		bodyModel[9].setRotationPoint(-50.5F, -1F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[10].setRotationPoint(-54.5F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-51.5F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[12].setRotationPoint(-50.5F, 2F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[13].setRotationPoint(-45.5F, 2F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -2F, 3F, -0.5F, -2F); // Box 301 cull
		bodyModel[14].setRotationPoint(-43.5F, 2F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		bodyModel[15].setRotationPoint(-46.5F, 1F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 36
		bodyModel[16].setRotationPoint(-50.5F, -1F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, -2F, -3F, -0.5F, -2F, -3F, -0.5F, 0F, 3F, -0.5F, 0F); // Box 38 cull
		bodyModel[17].setRotationPoint(-43.5F, 2F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 17, 24, 0F); // Box 217
		bodyModel[18].setRotationPoint(50.51F, -9F, -12F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[19].setRotationPoint(49.51F, -1F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(50.51F, -1F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[21].setRotationPoint(51.5F, 3F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[22].setRotationPoint(50.5F, 2.5F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[23].setRotationPoint(45.5F, 2F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 301
		bodyModel[24].setRotationPoint(42.5F, 2F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, -2F, -3F, -0.5F, -2F); // Box 301 cull
		bodyModel[25].setRotationPoint(42.5F, 2F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -2F, 3F, -0.5F, -2F, 3F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 38 cull
		bodyModel[26].setRotationPoint(42.5F, 2F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 101, 0, 22, 0F); // Box 50
		bodyModel[27].setRotationPoint(-50.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[28].setRotationPoint(-46.51F, -8F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 3.02F, 0F, -1F, 3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[29].setRotationPoint(-50.51F, -9F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[30].setRotationPoint(-50.51F, -9F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 301
		bodyModel[31].setRotationPoint(46.5F, 5F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 301
		bodyModel[32].setRotationPoint(46.5F, -1F, 6F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 36
		bodyModel[33].setRotationPoint(46.5F, -1F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[34].setRotationPoint(46.5F, 1F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		bodyModel[35].setRotationPoint(46.5F, 1F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 45, 20, 14, 0F); // box03
		bodyModel[36].setRotationPoint(-49.5F, -21F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[37].setRotationPoint(-50.5F, -21F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 44, 1, 12, 0F); // box03
		bodyModel[38].setRotationPoint(-49.5F, -22F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[39].setRotationPoint(-49.5F, -22F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[40].setRotationPoint(-49.5F, -22F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[41].setRotationPoint(-50.5F, -22F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[42].setRotationPoint(-50.5F, -22F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[43].setRotationPoint(-50.5F, -21F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[44].setRotationPoint(-50.5F, -21F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[45].setRotationPoint(-50.5F, -22F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 45, 20, 14, 0F); // box03
		bodyModel[46].setRotationPoint(4.5F, -21F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // box03
		bodyModel[47].setRotationPoint(49.5F, -21F, 6F);

		bodyModel[48].addBox(0F, 0F, 0F, 44, 1, 12, 0F); // box03
		bodyModel[48].setRotationPoint(5.5F, -22F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[49].setRotationPoint(5.5F, -22F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // box03
		bodyModel[50].setRotationPoint(49.5F, -22F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[51].setRotationPoint(49.5F, -21F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[52].setRotationPoint(5.5F, -22F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[53].setRotationPoint(49.5F, -22F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[54].setRotationPoint(49.5F, -21F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[55].setRotationPoint(49.5F, -22F, -6F);

		bodyModel[56].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing left
		bodyModel[56].setRotationPoint(-5F, -20F, -10.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 16
		bodyModel[57].setRotationPoint(18.5F, -1F, 6F);

		bodyModel[58].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 117
		bodyModel[58].setRotationPoint(-46.5F, -1F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 37, 5, 22, 0F); // Box 118
		bodyModel[59].setRotationPoint(-18.5F, -3F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 0F, 21F); // Box 119 cull
		bodyModel[60].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 120
		bodyModel[61].setRotationPoint(18.5F, -1F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 122 cull
		bodyModel[62].setRotationPoint(18.5F, -3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -1F, 0F, 21F); // Box 124 cull
		bodyModel[63].setRotationPoint(-19.5F, 1F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -2F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 125 cull
		bodyModel[64].setRotationPoint(-20.5F, -3F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 315
		bodyModel[65].setRotationPoint(4.5F, -20F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 11, 3, 22, 0F); // Box 35
		bodyModel[66].setRotationPoint(-5.5F, -6F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 130
		bodyModel[67].setRotationPoint(-5.5F, -20F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 9, 14, 1, 0F); // Box 315
		bodyModel[68].setRotationPoint(-4.5F, -20F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 9, 14, 1, 0F); // Box 133
		bodyModel[69].setRotationPoint(-4.5F, -20F, 10F);

		bodyModel[70].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[70].setRotationPoint(5F, -20F, 10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // box03
		bodyModel[71].setRotationPoint(-5.5F, -23F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[72].setRotationPoint(-5.5F, -23F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[73].setRotationPoint(-4.5F, -22F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 139
		bodyModel[74].setRotationPoint(-5.5F, -23F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 140
		bodyModel[75].setRotationPoint(-4.5F, -22F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[76].setRotationPoint(-5.5F, -22F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[77].setRotationPoint(4.5F, -22F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[78].setRotationPoint(-5.5F, -21F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[79].setRotationPoint(4.5F, -21F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[80].setRotationPoint(-5.5F, -22F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[81].setRotationPoint(4.5F, -22F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[82].setRotationPoint(-5.5F, -22F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[83].setRotationPoint(4.5F, -22F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 149
		bodyModel[84].setRotationPoint(-5.5F, -22F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 150
		bodyModel[85].setRotationPoint(4.5F, -22F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[86].setRotationPoint(-5.5F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[87].setRotationPoint(4.5F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[88].setRotationPoint(-5.5F, -22F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[89].setRotationPoint(4.5F, -22F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 21F, -1.5F, 0F, 21F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, 20.99F, 0F, -0.5F, 20.99F); // Box 35 cull
		bodyModel[90].setRotationPoint(-7F, -7F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, -0.01F, -0.5F, 0F, 20.99F, 0F, -1.5F, 21F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 21F, 0F, -0.5F, 21F); // Box 35 cull
		bodyModel[91].setRotationPoint(-9.5F, -4.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 20.99F, -0.5F, 0F, 20.99F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 21F, -0.5F, -0.5F, 21F); // Box 35 cull
		bodyModel[92].setRotationPoint(-7.5F, -4.5F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, 0F, 100.04F, 0F, 0F, 100.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 100.04F, 0F, 0F, 100.04F, 0F, 0F, 0F, 0F, 0F); // Box 197 cull
		bodyModel[93].setRotationPoint(-50.52F, -2.5F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 93, 21, 0, 0F); // Box 109
		bodyModel[94].setRotationPoint(-46.5F, -13F, 11F);

		bodyModel[95].addBox(0F, 0F, 0F, 93, 21, 0, 0F); // Box 184
		bodyModel[95].setRotationPoint(-46.5F, -13F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[96].setRotationPoint(-18.5F, -11F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 21F, 1F, 0F, 21F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 21F, -1F, 0F, 21F); // Box 186 cull
		bodyModel[97].setRotationPoint(17.5F, -11F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F); // Box 189 cull
		bodyModel[98].setRotationPoint(-50.5F, 1F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301
		bodyModel[99].setRotationPoint(-30.5F, 0F, 6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301
		bodyModel[100].setRotationPoint(-30.5F, 1F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[101].setRotationPoint(-31F, 2F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[102].setRotationPoint(-29.75F, 1F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[103].setRotationPoint(-29.75F, 1F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[104].setRotationPoint(-30.5F, 0F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[105].setRotationPoint(-30.5F, 1F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301
		bodyModel[106].setRotationPoint(27.5F, 0F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301
		bodyModel[107].setRotationPoint(27.5F, 1F, 6F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[108].setRotationPoint(27F, 2F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[109].setRotationPoint(28.25F, 1F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[110].setRotationPoint(28.25F, 1F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[111].setRotationPoint(27.5F, 0F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[112].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[113].setRotationPoint(-28F, -22.5F, -2.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[114].setRotationPoint(8F, -22.5F, -2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[115].setRotationPoint(-51.9F, -21.95F, 5.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[116].setRotationPoint(-52.35F, -21.45F, 6.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[117].setRotationPoint(-51.5F, -21.45F, 7.45F);
		bodyModel[117].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[118].setRotationPoint(-51.9F, -21.95F, -7.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[119].setRotationPoint(-52.35F, -21.45F, -7.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[120].setRotationPoint(-51.5F, -21.45F, -7.75F);
		bodyModel[120].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Numberboard type 1
		bodyModel[121].setRotationPoint(-50.2F, -21.45F, -7.56F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 numberboard type 1
		bodyModel[122].setRotationPoint(-50.2F, -21.45F, 7.56F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[123].setRotationPoint(47.75F, -21.95F, 5.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[124].setRotationPoint(51.3F, -21.45F, 6.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[125].setRotationPoint(50.45F, -21.45F, 7.45F);
		bodyModel[125].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[126].setRotationPoint(47.75F, -21.95F, -7.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[127].setRotationPoint(51.3F, -21.45F, -7.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[128].setRotationPoint(50.45F, -21.45F, -7.75F);
		bodyModel[128].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Numberboard type 1
		bodyModel[129].setRotationPoint(48.4F, -21.45F, -7.56F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 numberboard type 1
		bodyModel[130].setRotationPoint(48.4F, -21.45F, 7.56F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big high
		bodyModel[131].setRotationPoint(-50.75F, -19.75F, -1.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam high
		bodyModel[132].setRotationPoint(-50.75F, -20F, -0.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam high
		bodyModel[133].setRotationPoint(-50.75F, -18.5F, -0.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[134].setRotationPoint(-51.5F, -20F, -1.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big high
		bodyModel[135].setRotationPoint(49.75F, -19.75F, -1.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam high
		bodyModel[136].setRotationPoint(49.75F, -20F, -0.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam high
		bodyModel[137].setRotationPoint(49.75F, -18.5F, -0.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[138].setRotationPoint(50.5F, -20F, -1.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 17, 4, 20, 0F); // Box 0
		bodyModel[139].setRotationPoint(-8.5F, 2F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 17, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-8.5F, 6F, -10F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[141].setRotationPoint(11.5F, 2.83F, -8F);
		bodyModel[141].rotateAngleZ = -0.78539816F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,-0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F); // Box 0 cull
		bodyModel[142].setRotationPoint(10F, 2F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[143].setRotationPoint(-11.5F, 2.83F, -8F);
		bodyModel[143].rotateAngleZ = -0.78539816F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,-0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F); // Box 0 cull
		bodyModel[144].setRotationPoint(-13F, 2F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 10.5F, 0F, 0F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 10.5F, 0F, 0F, 10.5F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 285 cull
		bodyModel[145].setRotationPoint(25.5F, 1F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 285 cull
		bodyModel[146].setRotationPoint(25.5F, 0F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 10.5F, -1F, -0.01F, 10.5F, 0F, 0F, 0F, 0F, 0F); // Box 285 cull
		bodyModel[147].setRotationPoint(25.5F, 1F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 10.5F, 0F, 0F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 10.5F, 0F, 0F, 10.5F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301 cull
		bodyModel[148].setRotationPoint(-37F, 1F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301 cull
		bodyModel[149].setRotationPoint(-37F, 0F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.01F, 10.5F, 0F, -0.01F, 10.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 10.5F, -1F, -0.01F, 10.5F, 0F, 0F, 0F, 0F, 0F); // Box 301 cull
		bodyModel[150].setRotationPoint(-37F, 1F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 16
		bodyModel[151].setRotationPoint(-46.35F, 0F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.99F, 1F, 0F, 0.99F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 16
		bodyModel[152].setRotationPoint(-45.35F, 2F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[153].setRotationPoint(-46.35F, 0F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0.99F, 1F, 0F, 0.99F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 305
		bodyModel[154].setRotationPoint(-45.35F, 2F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 16
		bodyModel[155].setRotationPoint(42.35F, 0F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.99F, 1F, 0F, 0.99F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 16
		bodyModel[156].setRotationPoint(43.35F, 2F, 8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[157].setRotationPoint(42.35F, 0F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0.99F, 1F, 0F, 0.99F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 305
		bodyModel[158].setRotationPoint(43.35F, 2F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[159].setRotationPoint(-40F, 1.75F, -10.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[160].setRotationPoint(-40F, 1F, -10.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[161].setRotationPoint(-39.75F, 2F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 74 cull
		bodyModel[162].setRotationPoint(-40.5F, 0F, -10.25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[163].setRotationPoint(39F, 1.75F, 9.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[164].setRotationPoint(39F, 1F, 9.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[165].setRotationPoint(39.25F, 2F, 9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 74 cull
		bodyModel[166].setRotationPoint(38.5F, 0F, 9.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[167].setRotationPoint(-10F, 2.75F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[168].setRotationPoint(-17F, 2.75F, 6F);
		bodyModel[168].rotateAngleY = -0.78539816F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.26F, 0F, -0.375F, -0.26F, 0F, -0.375F, -0.26F, -0.5F, -0.125F, -0.26F, -0.5F); // Box 0 cull
		bodyModel[169].setRotationPoint(-16F, 2F, 4.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 32, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19.03F, 0F, 0F, 19.03F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 19.03F, 0F, -2.5F, 19.03F); // Box 0 cull
		bodyModel[170].setRotationPoint(-17F, 2F, -10.01F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.01F, -0.5F, -0.5F, 0.01F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 cull
		bodyModel[171].setRotationPoint(11F, 4F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[172].setRotationPoint(7F, 3F, -10.01F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 0
		bodyModel[173].setRotationPoint(15F, 2F, -10.01F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 0
		bodyModel[174].setRotationPoint(9F, 3F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, -1F, 0.01F, 0.25F, -1F, -0.01F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0.01F, -0.3F, 0F, -0.01F, 0F, -0.5F, 0F); // Box 0
		bodyModel[175].setRotationPoint(9.5F, 3F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 329 cull
		bodyModel[176].setRotationPoint(11.25F, 3F, 8.01F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 322
		bodyModel[177].setRotationPoint(10F, 3.5F, 10.02F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[178].setRotationPoint(-11.75F, 4F, -8.01F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 0
		bodyModel[179].setRotationPoint(-12.25F, 5F, -8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[180].setRotationPoint(-10.5F, 2F, -8.01F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[181].setRotationPoint(-12.25F, 5F, -8.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.98F, -1F, 0F, -2.98F, 3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -2.98F, -1F, -0.5F, -2.98F); // Box 322 cull
		bodyModel[182].setRotationPoint(-9.5F, 3.5F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.03F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.03F, -0.5F, 0F); // Box 345
		bodyModel[183].setRotationPoint(-14F, 4F, 8.01F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0.01F, 0F, -1.25F, 0.01F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0.01F, 0F, 0.75F, 0.01F); // Box 345 cull
		bodyModel[184].setRotationPoint(-14.53F, 2.75F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, -0.25F, 0.02F, 0F, -0.25F, 0.02F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.5F, -0.25F, 0.02F, 0F, -0.25F, 0.02F); // Box 345 cull
		bodyModel[185].setRotationPoint(-17.5F, 2.75F, 6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322
		bodyModel[186].setRotationPoint(-13F, 5F, 8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[187].setRotationPoint(-1.5F, -7.5F, 4F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 395 cs
		bodyModel[188].setRotationPoint(-4F, -14F, 3.75F);
		bodyModel[188].rotateAngleY = -0.52359878F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 396 gauges
		bodyModel[189].setRotationPoint(-4F, -17F, 3.75F);
		bodyModel[189].rotateAngleY = -0.52359878F;

		bodyModel[190].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 398 cs
		bodyModel[190].setRotationPoint(-4F, -17F, 3.74F);
		bodyModel[190].rotateAngleY = -0.52359878F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 399 cs
		bodyModel[191].setRotationPoint(-0.5F, -14F, 2F);

		bodyModel[192].addShapeBox(1F, 0F, 2F, 1, 8, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401 cs
		bodyModel[192].setRotationPoint(-4F, -14F, 3.75F);
		bodyModel[192].rotateAngleY = -0.52359878F;

		bodyModel[193].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 cs ab
		bodyModel[193].setRotationPoint(-4F, -14F, 8F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 403 cs ab
		bodyModel[194].setRotationPoint(-4F, -12F, 6F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404 cs ab
		bodyModel[195].setRotationPoint(-4F, -13F, 6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, -4F, -6F); // Box 408 cab pannel
		bodyModel[196].setRotationPoint(-4.49F, -20F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[197].setRotationPoint(-4.5F, -7.5F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[198].setRotationPoint(1.5F, -7.5F, 4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 375 cab pannel
		bodyModel[199].setRotationPoint(4.49F, -20F, -12F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[200].setRotationPoint(-1F, -12F, 0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[201].setRotationPoint(-3F, -14F, 0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[202].setRotationPoint(-1.5F, -12.5F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[203].setRotationPoint(-1.5F, -7.5F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 382
		bodyModel[204].setRotationPoint(-3.5F, -7.5F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 383
		bodyModel[205].setRotationPoint(-3.5F, -7.5F, -7F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 384
		bodyModel[206].setRotationPoint(3F, -14F, -9F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 385
		bodyModel[207].setRotationPoint(2F, -12F, -9F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[208].setRotationPoint(2F, -13F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 387 gauges
		bodyModel[209].setRotationPoint(0.35F, -17F, -3.99F);
		bodyModel[209].rotateAngleY = -0.52359878F;

		bodyModel[210].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 389
		bodyModel[210].setRotationPoint(1.35F, -17F, -2.25F);
		bodyModel[210].rotateAngleY = -0.52359878F;

		bodyModel[211].addShapeBox(1F, 0F, 2F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 390
		bodyModel[211].setRotationPoint(-1.15F, -14F, -6.6F);
		bodyModel[211].rotateAngleY = -0.52359878F;

		bodyModel[212].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 391
		bodyModel[212].setRotationPoint(0.35F, -14F, -4F);
		bodyModel[212].rotateAngleY = -0.52359878F;

		bodyModel[213].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 208
		bodyModel[213].setRotationPoint(46.5F, 8F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 209
		bodyModel[214].setRotationPoint(-53.5F, 8F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 446 mu plug DOUBLE
		bodyModel[215].setRotationPoint(-51F, -3F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 447 mu plug DOUBLE
		bodyModel[216].setRotationPoint(50F, -3F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[217].setRotationPoint(-52.5F, 6F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[218].setRotationPoint(-52.5F, 6F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[219].setRotationPoint(50.5F, 6F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[220].setRotationPoint(50.5F, 6F, -3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[221].setRotationPoint(-51F, -6.5F, 2.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[222].setRotationPoint(-51F, -7.75F, 2.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ELECTRIC MU TYPE 2
		bodyModel[223].setRotationPoint(-51F, -6.5F, -4.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[224].setRotationPoint(-51F, -7.75F, -4.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[225].setRotationPoint(50.5F, -6.5F, 2.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[226].setRotationPoint(50.5F, -7.75F, 2.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 447 ELECTRIC MU TYPE 2
		bodyModel[227].setRotationPoint(50.5F, -6.5F, -4.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 ELECTRIC MU TYPE 2
		bodyModel[228].setRotationPoint(50.5F, -7.75F, -4.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal high
		bodyModel[229].setRotationPoint(49.75F, -19.25F, -1.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal high
		bodyModel[230].setRotationPoint(49.75F, -19.25F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal high
		bodyModel[231].setRotationPoint(-50.75F, -19.25F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal high
		bodyModel[232].setRotationPoint(-50.75F, -19.25F, -1.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big low
		bodyModel[233].setRotationPoint(49.75F, -15.75F, -1.25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam low
		bodyModel[234].setRotationPoint(49.75F, -16F, -0.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam low
		bodyModel[235].setRotationPoint(49.75F, -14.5F, -0.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[236].setRotationPoint(50.5F, -16F, -1.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal low
		bodyModel[237].setRotationPoint(49.75F, -15.25F, -1.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal low
		bodyModel[238].setRotationPoint(49.75F, -15.25F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big low
		bodyModel[239].setRotationPoint(-50.75F, -15.75F, -1.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam low
		bodyModel[240].setRotationPoint(-50.75F, -16F, -0.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam low
		bodyModel[241].setRotationPoint(-50.75F, -14.5F, -0.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[242].setRotationPoint(-51.5F, -16F, -1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal low
		bodyModel[243].setRotationPoint(-50.75F, -15.25F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal low
		bodyModel[244].setRotationPoint(-50.75F, -15.25F, -1.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[245].setRotationPoint(6.5F, 4F, 10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[246].setRotationPoint(-7.5F, 4F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 13.02F, 0F, -2F, 13.02F); // Box 387 sied numberboard glow
		bodyModel[247].setRotationPoint(-25F, -19.5F, 7.01F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 13.02F, 0F, -2F, 13.02F); // Box 387 sied numberboard glow
		bodyModel[248].setRotationPoint(29F, -19.5F, 7.01F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F); // Box 2
		bodyModel[249].setRotationPoint(47.85F, -21.95F, 7.55F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F); // Box 245 numberboard type 2
		bodyModel[250].setRotationPoint(48.15F, -21.45F, 8.44F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F); // Box 562 Numberboard type 2
		bodyModel[251].setRotationPoint(48.15F, -21.45F, -8.44F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 563
		bodyModel[252].setRotationPoint(47.85F, -21.95F, -8.55F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F); // Box 2
		bodyModel[253].setRotationPoint(-50.9F, -21.95F, 7.55F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F); // Box 245 numberboard type 2
		bodyModel[254].setRotationPoint(-50.2F, -21.45F, 8.44F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F); // Box 562 Numberboard type 2
		bodyModel[255].setRotationPoint(-50.2F, -21.45F, -8.44F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 563
		bodyModel[256].setRotationPoint(-50.9F, -21.95F, -8.55F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[257].setRotationPoint(51.25F, -18.99F, -4.01F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[258].setRotationPoint(51.25F, -19.99F, -4.01F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[259].setRotationPoint(51.5F, -18.49F, -3.76F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 189 holder
		bodyModel[260].setRotationPoint(50.25F, -20.75F, -4.01F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 601 holder
		bodyModel[261].setRotationPoint(-52.25F, -20.75F, 3.01F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[262].setRotationPoint(-52.25F, -18.99F, 3.01F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[263].setRotationPoint(-52.25F, -19.99F, 3.01F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[264].setRotationPoint(-52F, -18.49F, 3.26F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[265].setRotationPoint(-52.75F, -18.25F, 4.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[266].setRotationPoint(-52.75F, -17.75F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[267].setRotationPoint(-52.25F, -17.75F, 6.2F);
		bodyModel[267].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[268].setRotationPoint(-52.25F, -16.5F, 5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 613
		bodyModel[269].setRotationPoint(-52.75F, -18.25F, -6.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
		bodyModel[270].setRotationPoint(-52.25F, -16.5F, -6F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[271].setRotationPoint(-52.75F, -17.75F, -6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[272].setRotationPoint(-52.25F, -17.75F, -6.5F);
		bodyModel[272].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[273].setRotationPoint(50.75F, -18.25F, 4.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[274].setRotationPoint(51.75F, -17.75F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[275].setRotationPoint(51.25F, -17.75F, 6.2F);
		bodyModel[275].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[276].setRotationPoint(50.5F, -16.5F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 613
		bodyModel[277].setRotationPoint(50.75F, -18.25F, -6.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
		bodyModel[278].setRotationPoint(50.5F, -16.5F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[279].setRotationPoint(51.75F, -17.75F, -6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[280].setRotationPoint(51.25F, -17.75F, -6.5F);
		bodyModel[280].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[281].setRotationPoint(-3F, -20F, 11F);
		bodyModel[281].rotateAngleX = 0.36651914F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[282].setRotationPoint(-3F, -20.25F, -11.97F);
		bodyModel[282].rotateAngleX = -0.36651914F;

		bodyModel[283].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[283].setRotationPoint(3.5F, -25F, 0F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[284].setRotationPoint(-3.5F, -25F, 0F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 21F, 1F, 0F, 21F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 21F, -1F, 0F, 21F); // Box 186 cull
		bodyModel[285].setRotationPoint(7.5F, -13F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[286].setRotationPoint(-8.5F, -13F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, -1.66F, 0F, -0.98F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0.01F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[287].setRotationPoint(-9.5F, -4F, -11.01F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.98F, 0F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[288].setRotationPoint(5.5F, -4F, -11.01F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, -1.66F, 0F, -0.98F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0.01F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[289].setRotationPoint(-9.5F, -4F, 10.99F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.98F, 0F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[290].setRotationPoint(5.5F, -4F, 10.99F);

		bodyModel[291].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 air whistle
		bodyModel[291].setRotationPoint(-33.25F, -24F, 1.5F);
		bodyModel[291].rotateAngleY = 1.57079633F;

		bodyModel[292].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 405 air whistle
		bodyModel[292].setRotationPoint(32.25F, -24F, -4.5F);
		bodyModel[292].rotateAngleY = 1.57079633F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[293].setRotationPoint(-2.5F, -19F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[294].setRotationPoint(-2.5F, -19F, -15F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[295].setRotationPoint(-32F, -22.5F, 2.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[296].setRotationPoint(-34F, -23.5F, 2.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 266
		bodyModel[297].setRotationPoint(31F, -22.5F, -3.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 267
		bodyModel[298].setRotationPoint(31F, -23.5F, -3.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[299].setRotationPoint(-2.5F, -23.5F, 1F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[300].setRotationPoint(-4.5F, -24.5F, 1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[301].setRotationPoint(1.5F, -23.5F, -2F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[302].setRotationPoint(1.5F, -24.5F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, -2F, 7, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448 awning
		bodyModel[303].setRotationPoint(-3.5F, -20F, -11F);
		bodyModel[303].rotateAngleX = 0.38397244F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 7, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449 awning
		bodyModel[304].setRotationPoint(-3.5F, -20F, 11F);
		bodyModel[304].rotateAngleX = -0.38397244F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[305].setRotationPoint(-54.5F, 7F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[306].setRotationPoint(-54.5F, 7F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[307].setRotationPoint(-53.5F, 6F, 0F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[308].setRotationPoint(-53.5F, 6F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[309].setRotationPoint(-53.5F, 5F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[310].setRotationPoint(-53.5F, 5F, -10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[311].setRotationPoint(-53.5F, 5F, 2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[312].setRotationPoint(-53.5F, 5F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[313].setRotationPoint(-53.5F, 4F, 2F);

		bodyModel[314].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[314].setRotationPoint(-53.5F, 4F, -8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[315].setRotationPoint(53.5F, 7F, 0F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[316].setRotationPoint(53.5F, 7F, -10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[317].setRotationPoint(52.5F, 6F, -10F);

		bodyModel[318].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[318].setRotationPoint(53.5F, 5F, 0F);

		bodyModel[319].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[319].setRotationPoint(53.5F, 5F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[320].setRotationPoint(52.5F, 6F, 0F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[321].setRotationPoint(52.5F, 4F, 2F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[322].setRotationPoint(52.5F, 5F, 2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[323].setRotationPoint(52.5F, 5F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[324].setRotationPoint(52.5F, 4F, -8F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[325].setRotationPoint(-1F, -24F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[326].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[327].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[328].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[329].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[330].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[330].setRotationPoint(-33.5F, -23.5F, 3.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[331].setRotationPoint(-34.5F, -23.5F, 1.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 716
		bodyModel[332].setRotationPoint(30.5F, -23.5F, -4.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 717
		bodyModel[333].setRotationPoint(30.5F, -23.5F, -2.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[334].setRotationPoint(-34F, -23.5F, 1.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[335].setRotationPoint(-34.5F, -23.5F, 2.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[336].setRotationPoint(-33F, -23.5F, 3.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 721
		bodyModel[337].setRotationPoint(31F, -23.5F, -2.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 722
		bodyModel[338].setRotationPoint(30.5F, -23.5F, -3.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 723
		bodyModel[339].setRotationPoint(31F, -23.5F, -4.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 721
		bodyModel[340].setRotationPoint(30F, -23.5F, -4.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 723
		bodyModel[341].setRotationPoint(31F, -23.5F, -2.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 727
		bodyModel[342].setRotationPoint(-32F, -23.5F, 3.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 728
		bodyModel[343].setRotationPoint(-33F, -23.5F, 1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[344].setRotationPoint(-0.5F, -24F, -0.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[345].setRotationPoint(-0.5F, -25F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[346].setRotationPoint(1.5F, -24F, 0F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[347].setRotationPoint(-0.5F, -25F, 0F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404
		bodyModel[348].setRotationPoint(-32F, -26F, 0F);

		bodyModel[349].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[349].setRotationPoint(-33.5F, -24F, -2F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 13.02F, 0F, 0F, 13.02F); // Box 400
		bodyModel[350].setRotationPoint(-48.5F, -20F, -7.01F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 13.02F, 0F, 0F, 13.02F); // Box 400
		bodyModel[351].setRotationPoint(36.5F, -20F, -7.01F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[352].setRotationPoint(46.51F, -8F, -12F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, 20.99F, 0F, 0F, 20.99F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 21F, 0F, -0.5F, 21F); // Box 683 cull
		bodyModel[353].setRotationPoint(5.5F, -4.5F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 21F, -0.5F, 0F, 21F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 20.99F, -0.5F, -0.5F, 20.99F); // Box 684 cull
		bodyModel[354].setRotationPoint(5F, -7F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 21F, -0.5F, 0F, 21F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 21F, -0.5F, -0.5F, 21F); // Box 685 cull
		bodyModel[355].setRotationPoint(6.5F, -4.5F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 686 cull
		bodyModel[356].setRotationPoint(46.5F, 2F, -8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F); // Box 687 cull
		bodyModel[357].setRotationPoint(46.5F, 5F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F); // Box 688 cull
		bodyModel[358].setRotationPoint(46.5F, 1F, -7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[359].setRotationPoint(-45.5F, 1F, 11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[360].setRotationPoint(-45.5F, 1F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 217
		bodyModel[361].setRotationPoint(41.5F, 1F, 11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[362].setRotationPoint(41.5F, 1F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[363].setRotationPoint(11.5F, 2F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[364].setRotationPoint(-15.5F, 2F, 11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[365].setRotationPoint(11.5F, 2F, 11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[366].setRotationPoint(-15.5F, 2F, -11F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[367].setRotationPoint(-30F, -24F, 2F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 3.02F, 0F, -1F, 3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[368].setRotationPoint(46.49F, -9F, -12F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3.02F, 0F, 0F, 3.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[369].setRotationPoint(46.49F, -9F, 11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[370].setRotationPoint(-13.5F, 3.5F, 8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 0
		bodyModel[371].setRotationPoint(-25.7F, -23.5F, 3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 0
		bodyModel[372].setRotationPoint(-20.95F, -23.5F, 3F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 0
		bodyModel[373].setRotationPoint(-16.25F, -23.5F, 3F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 0
		bodyModel[374].setRotationPoint(-11.48F, -23.5F, 3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[375].setRotationPoint(36F, -22.75F, -3F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[376].setRotationPoint(43F, -22.75F, -3F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[377].setRotationPoint(-49F, -22.75F, -3F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[378].setRotationPoint(-42F, -22.75F, -3F);

		bodyModel[379].addBox(0F, 0F, 0F, 14, 0, 16, 0F); // Box 162
		bodyModel[379].setRotationPoint(7.5F, -16.5F, -8F);

		bodyModel[380].addBox(0F, 0F, 0F, 14, 0, 16, 0F); // Box 162
		bodyModel[380].setRotationPoint(-21.5F, -16.5F, -8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 414
		bodyModel[381].setRotationPoint(10.3F, -23.5F, -4F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 415
		bodyModel[382].setRotationPoint(15.05F, -23.5F, -4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 416
		bodyModel[383].setRotationPoint(19.75F, -23.5F, -4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F); // Box 417
		bodyModel[384].setRotationPoint(24.52F, -23.5F, -4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[385].setRotationPoint(7.5F, -21F, 7F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[386].setRotationPoint(7.5F, -21F, 7.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[387].setRotationPoint(-8.5F, -21F, -8F);

		bodyModel[388].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 397
		bodyModel[388].setRotationPoint(-10.5F, -21F, -8.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[389].setRotationPoint(-0.25F, 2F, 10.01F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -1.5F, 0F, 1F, -1.5F); // Box 0 cull
		bodyModel[390].setRotationPoint(-0.25F, 4.5F, 10.01F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 1F, -1F, 0F, -0.5F, -1F, -6F, 0F, -1F, -6F); // Box 440 cull
		bodyModel[391].setRotationPoint(50.5F, 6F, 0F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, -0.5F, -1F, 0F, 1F, -1F, -6F, 0F, -1F, -6F); // Box 401 cull
		bodyModel[392].setRotationPoint(50.5F, 6F, -7F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, -0.5F, -1F, -6F); // Box 440 cull
		bodyModel[393].setRotationPoint(-51.5F, 6F, 0F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 1F, -1F, -6F); // Box 401 cull
		bodyModel[394].setRotationPoint(-51.5F, 6F, -7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[395].setRotationPoint(50F, -7F, -4.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[396].setRotationPoint(-51F, -7F, 2.75F);
	}
	ModelBLW_commonwealth_c bogie = new ModelBLW_commonwealth_c();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_roller.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.81F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.62F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_silver_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.81F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.62F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.81F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.62F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}