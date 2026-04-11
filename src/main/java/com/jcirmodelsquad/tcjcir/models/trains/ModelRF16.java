//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 23:40:24
// Last changed on: 21.08.2020 - 23:40:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelRF16 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRF16() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[568];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 347, 127, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 294, 88, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 446, 127, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 296, 113, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 303, 139, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 423, 149, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 347, 154, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 442, 61, textureX, textureY); // Box 120
		bodyModel[9] = new ModelRendererTurbo(this, 441, 29, textureX, textureY); // Box 481
		bodyModel[10] = new ModelRendererTurbo(this, 290, 77, textureX, textureY); // Box 120
		bodyModel[11] = new ModelRendererTurbo(this, 290, 35, textureX, textureY); // Box 481
		bodyModel[12] = new ModelRendererTurbo(this, 247, 90, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 208, 96, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 266, 113, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 219, 113, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 161, 109, textureX, textureY); // Box 1
		bodyModel[17] = new ModelRendererTurbo(this, 205, 102, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 191, 112, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 181, 110, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 186, 118, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 179, 159, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 266, 86, textureX, textureY); // Box 495
		bodyModel[23] = new ModelRendererTurbo(this, 219, 90, textureX, textureY); // Box 496
		bodyModel[24] = new ModelRendererTurbo(this, 205, 115, textureX, textureY); // Box 497
		bodyModel[25] = new ModelRendererTurbo(this, 191, 103, textureX, textureY); // Box 498
		bodyModel[26] = new ModelRendererTurbo(this, 181, 102, textureX, textureY); // Box 499
		bodyModel[27] = new ModelRendererTurbo(this, 186, 99, textureX, textureY); // Box 500
		bodyModel[28] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 501
		bodyModel[29] = new ModelRendererTurbo(this, 179, 145, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 179, 122, textureX, textureY); // Box 504
		bodyModel[31] = new ModelRendererTurbo(this, 179, 131, textureX, textureY); // Box 505
		bodyModel[32] = new ModelRendererTurbo(this, 184, 162, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[33] = new ModelRendererTurbo(this, 181, 118, textureX, textureY); // Box 508
		bodyModel[34] = new ModelRendererTurbo(this, 187, 159, textureX, textureY); // Box 509
		bodyModel[35] = new ModelRendererTurbo(this, 195, 162, textureX, textureY); // Box 509
		bodyModel[36] = new ModelRendererTurbo(this, 184, 124, textureX, textureY, "cull"); // Box 512 cull
		bodyModel[37] = new ModelRendererTurbo(this, 187, 121, textureX, textureY); // Box 513
		bodyModel[38] = new ModelRendererTurbo(this, 195, 124, textureX, textureY); // Box 514
		bodyModel[39] = new ModelRendererTurbo(this, 200, 159, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 200, 121, textureX, textureY); // Box 516
		bodyModel[41] = new ModelRendererTurbo(this, 493, 87, textureX, textureY); // Box 120
		bodyModel[42] = new ModelRendererTurbo(this, 467, 87, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 445, 151, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 298, 127, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 325, 139, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 325, 129, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 114
		bodyModel[50] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 78
		bodyModel[52] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 257, 127, textureX, textureY); // Box 2
		bodyModel[54] = new ModelRendererTurbo(this, 282, 127, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 276, 61, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 289, 68, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 325, 61, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 325, 54, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 276, 19, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 289, 26, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 325, 19, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 325, 12, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 456, 23, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 428, 61, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Rear side door L
		bodyModel[66] = new ModelRendererTurbo(this, 450, 25, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 438, 25, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 451, 53, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 439, 53, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 477, 27, textureX, textureY); // Rear door
		bodyModel[71] = new ModelRendererTurbo(this, 488, 24, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 460, 10, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 477, 13, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 453, 15, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 505, 15, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 75, 76, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 75, 50, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 71, 61, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 70, 68, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 493, 68, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 471, 88, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 471, 47, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 463, 68, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 470, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[87] = new ModelRendererTurbo(this, 475, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[88] = new ModelRendererTurbo(this, 489, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[89] = new ModelRendererTurbo(this, 484, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[90] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 489, 100, textureX, textureY); // Box 99
		bodyModel[92] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 99
		bodyModel[93] = new ModelRendererTurbo(this, 476, 2, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 461, 1, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 250, 44, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 250, 2, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 307, 60, textureX, textureY); // Box 79
		bodyModel[99] = new ModelRendererTurbo(this, 283, 60, textureX, textureY); // Box 80
		bodyModel[100] = new ModelRendererTurbo(this, 307, 18, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 283, 18, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 277, 55, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 307, 56, textureX, textureY); // Box 79
		bodyModel[104] = new ModelRendererTurbo(this, 283, 56, textureX, textureY); // Box 79
		bodyModel[105] = new ModelRendererTurbo(this, 307, 14, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 283, 14, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 289, 55, textureX, textureY); // Front side door L
		bodyModel[108] = new ModelRendererTurbo(this, 286, 68, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 286, 65, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 286, 26, textureX, textureY); // Box 121
		bodyModel[112] = new ModelRendererTurbo(this, 286, 23, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 302, 13, textureX, textureY); // Box 124
		bodyModel[114] = new ModelRendererTurbo(this, 289, 13, textureX, textureY); // Front side door R
		bodyModel[115] = new ModelRendererTurbo(this, 105, 207, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 300, 67, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 300, 59, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 143, 193, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 160, 217, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 148, 181, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 150, 188, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 150, 176, textureX, textureY); // Box 138
		bodyModel[123] = new ModelRendererTurbo(this, 142, 196, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 142, 189, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 300, 25, textureX, textureY); // Box 146
		bodyModel[126] = new ModelRendererTurbo(this, 300, 17, textureX, textureY); // Box 147
		bodyModel[127] = new ModelRendererTurbo(this, 179, 222, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 179, 216, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 162, 197, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 168, 197, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 180, 192, textureX, textureY); // Box 152
		bodyModel[132] = new ModelRendererTurbo(this, 180, 186, textureX, textureY); // Box 153
		bodyModel[133] = new ModelRendererTurbo(this, 505, 69, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 451, 69, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 500, 69, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 458, 69, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 473, 67, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 471, 60, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 482, 60, textureX, textureY); // Box 153
		bodyModel[140] = new ModelRendererTurbo(this, 479, 59, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 470, 76, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 505, 50, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[143] = new ModelRendererTurbo(this, 167, 45, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 165, 40, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 167, 11, textureX, textureY); // Box 169
		bodyModel[147] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 170
		bodyModel[148] = new ModelRendererTurbo(this, 168, 9, textureX, textureY); // Box 171
		bodyModel[149] = new ModelRendererTurbo(this, 310, 61, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 272, 44, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 145, 24, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 151, 35, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 151, 19, textureX, textureY); // Box 182
		bodyModel[154] = new ModelRendererTurbo(this, 108, 27, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 95, 23, textureX, textureY); // Box 0 exhaust
		bodyModel[156] = new ModelRendererTurbo(this, 206, 9, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 91, 27, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 94, 33, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 40, 68, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 41, 61, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 240, 44, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 245, 44, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 49, 69, textureX, textureY); // Box 182
		bodyModel[164] = new ModelRendererTurbo(this, 31, 66, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 64, 69, textureX, textureY); // Box 182
		bodyModel[166] = new ModelRendererTurbo(this, 55, 68, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 28, 74, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 33, 85, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 41, 71, textureX, textureY); // Box 194
		bodyModel[170] = new ModelRendererTurbo(this, 40, 53, textureX, textureY); // Box 205
		bodyModel[171] = new ModelRendererTurbo(this, 49, 61, textureX, textureY); // Box 206
		bodyModel[172] = new ModelRendererTurbo(this, 31, 58, textureX, textureY); // Box 207
		bodyModel[173] = new ModelRendererTurbo(this, 64, 61, textureX, textureY); // Box 208
		bodyModel[174] = new ModelRendererTurbo(this, 55, 53, textureX, textureY); // Box 209
		bodyModel[175] = new ModelRendererTurbo(this, 28, 47, textureX, textureY); // Box 210
		bodyModel[176] = new ModelRendererTurbo(this, 242, 47, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 242, 52, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 242, 10, textureX, textureY); // Box 214
		bodyModel[179] = new ModelRendererTurbo(this, 264, 55, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 269, 61, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 260, 61, textureX, textureY); // Box 0
		bodyModel[182] = new ModelRendererTurbo(this, 262, 65, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 247, 47, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[184] = new ModelRendererTurbo(this, 247, 52, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[185] = new ModelRendererTurbo(this, 252, 49, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[186] = new ModelRendererTurbo(this, 257, 49, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[187] = new ModelRendererTurbo(this, 264, 49, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[188] = new ModelRendererTurbo(this, 244, 61, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 244, 66, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 237, 61, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 237, 68, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 237, 58, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 226, 61, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 224, 67, textureX, textureY); // Box 0
		bodyModel[195] = new ModelRendererTurbo(this, 264, 13, textureX, textureY); // Box 235
		bodyModel[196] = new ModelRendererTurbo(this, 269, 19, textureX, textureY); // Box 236
		bodyModel[197] = new ModelRendererTurbo(this, 247, 5, textureX, textureY, "cull"); // Box 239 cull
		bodyModel[198] = new ModelRendererTurbo(this, 247, 10, textureX, textureY, "cull"); // Box 240 cull
		bodyModel[199] = new ModelRendererTurbo(this, 252, 7, textureX, textureY, "cull"); // Box 241 cull
		bodyModel[200] = new ModelRendererTurbo(this, 257, 7, textureX, textureY, "cull"); // Box 242 cull
		bodyModel[201] = new ModelRendererTurbo(this, 264, 7, textureX, textureY, "cull"); // Box 243 cull
		bodyModel[202] = new ModelRendererTurbo(this, 244, 19, textureX, textureY); // Box 244
		bodyModel[203] = new ModelRendererTurbo(this, 244, 24, textureX, textureY); // Box 245
		bodyModel[204] = new ModelRendererTurbo(this, 277, 13, textureX, textureY); // Box 252
		bodyModel[205] = new ModelRendererTurbo(this, 237, 65, textureX, textureY); // Box 0
		bodyModel[206] = new ModelRendererTurbo(this, 237, 19, textureX, textureY); // Box 254
		bodyModel[207] = new ModelRendererTurbo(this, 237, 26, textureX, textureY); // Box 257
		bodyModel[208] = new ModelRendererTurbo(this, 224, 25, textureX, textureY); // Box 258
		bodyModel[209] = new ModelRendererTurbo(this, 237, 23, textureX, textureY); // Box 259
		bodyModel[210] = new ModelRendererTurbo(this, 78, 131, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 91, 133, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 20, 116, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 36, 124, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 243
		bodyModel[215] = new ModelRendererTurbo(this, 7, 116, textureX, textureY); // Box 245
		bodyModel[216] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 246
		bodyModel[217] = new ModelRendererTurbo(this, 263, 70, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 244, 72, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 237, 74, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 224, 70, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 244, 69, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 253, 65, textureX, textureY); // Box 0
		bodyModel[223] = new ModelRendererTurbo(this, 251, 61, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 269, 65, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 237, 71, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 224, 73, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 226, 64, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 221, 64, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 269
		bodyModel[230] = new ModelRendererTurbo(this, 251, 28, textureX, textureY); // Box 270
		bodyModel[231] = new ModelRendererTurbo(this, 244, 30, textureX, textureY); // Box 271
		bodyModel[232] = new ModelRendererTurbo(this, 224, 28, textureX, textureY); // Box 272
		bodyModel[233] = new ModelRendererTurbo(this, 244, 27, textureX, textureY); // Box 273
		bodyModel[234] = new ModelRendererTurbo(this, 253, 23, textureX, textureY); // Box 274
		bodyModel[235] = new ModelRendererTurbo(this, 237, 29, textureX, textureY); // Box 277
		bodyModel[236] = new ModelRendererTurbo(this, 224, 31, textureX, textureY); // Box 278
		bodyModel[237] = new ModelRendererTurbo(this, 260, 19, textureX, textureY); // Box 279
		bodyModel[238] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 280
		bodyModel[239] = new ModelRendererTurbo(this, 251, 19, textureX, textureY); // Box 281
		bodyModel[240] = new ModelRendererTurbo(this, 262, 23, textureX, textureY); // Box 282
		bodyModel[241] = new ModelRendererTurbo(this, 14, 79, textureX, textureY); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 21, 79, textureX, textureY); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 112, 133, textureX, textureY); // Box 0
		bodyModel[244] = new ModelRendererTurbo(this, 101, 133, textureX, textureY); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 96, 133, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 237, 16, textureX, textureY); // Box 289
		bodyModel[247] = new ModelRendererTurbo(this, 14, 41, textureX, textureY); // Box 291
		bodyModel[248] = new ModelRendererTurbo(this, 21, 41, textureX, textureY); // Box 292
		bodyModel[249] = new ModelRendererTurbo(this, 111, 102, textureX, textureY); // Box 293
		bodyModel[250] = new ModelRendererTurbo(this, 100, 102, textureX, textureY); // Box 294
		bodyModel[251] = new ModelRendererTurbo(this, 95, 102, textureX, textureY); // Box 295
		bodyModel[252] = new ModelRendererTurbo(this, 90, 102, textureX, textureY); // Box 296
		bodyModel[253] = new ModelRendererTurbo(this, 226, 22, textureX, textureY); // Box 297
		bodyModel[254] = new ModelRendererTurbo(this, 221, 22, textureX, textureY); // Box 298
		bodyModel[255] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 9, 64, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 0
		bodyModel[258] = new ModelRendererTurbo(this, 14, 76, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 112, 130, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 97, 119, textureX, textureY); // Box 0
		bodyModel[261] = new ModelRendererTurbo(this, 111, 105, textureX, textureY); // Box 325
		bodyModel[262] = new ModelRendererTurbo(this, 97, 108, textureX, textureY); // Box 326
		bodyModel[263] = new ModelRendererTurbo(this, 85, 117, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 85, 106, textureX, textureY); // Box 328
		bodyModel[265] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 332
		bodyModel[266] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 333
		bodyModel[267] = new ModelRendererTurbo(this, 73, 103, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 226, 19, textureX, textureY); // Box 339
		bodyModel[269] = new ModelRendererTurbo(this, 73, 126, textureX, textureY); // Box 340
		bodyModel[270] = new ModelRendererTurbo(this, 79, 119, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 69, 117, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 79, 108, textureX, textureY); // Box 348
		bodyModel[273] = new ModelRendererTurbo(this, 69, 110, textureX, textureY); // Box 349
		bodyModel[274] = new ModelRendererTurbo(this, 59, 115, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 59, 108, textureX, textureY); // Box 351
		bodyModel[276] = new ModelRendererTurbo(this, 51, 113, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 51, 106, textureX, textureY); // Box 353
		bodyModel[278] = new ModelRendererTurbo(this, 26, 131, textureX, textureY); // Box 103
		bodyModel[279] = new ModelRendererTurbo(this, 31, 134, textureX, textureY); // Box 103
		bodyModel[280] = new ModelRendererTurbo(this, 26, 140, textureX, textureY); // Box 103
		bodyModel[281] = new ModelRendererTurbo(this, 31, 137, textureX, textureY); // Box 103
		bodyModel[282] = new ModelRendererTurbo(this, 31, 131, textureX, textureY); // Box 103
		bodyModel[283] = new ModelRendererTurbo(this, 31, 140, textureX, textureY); // Box 103
		bodyModel[284] = new ModelRendererTurbo(this, 48, 128, textureX, textureY, BoxName.lamp); // Headlight TL
		bodyModel[285] = new ModelRendererTurbo(this, 41, 128, textureX, textureY, BoxName.lamp); // Headlight TR
		bodyModel[286] = new ModelRendererTurbo(this, 27, 124, textureX, textureY); // Box 0
		bodyModel[287] = new ModelRendererTurbo(this, 16, 124, textureX, textureY); // Box 0
		bodyModel[288] = new ModelRendererTurbo(this, 11, 131, textureX, textureY); // Box 312
		bodyModel[289] = new ModelRendererTurbo(this, 6, 134, textureX, textureY); // Box 313
		bodyModel[290] = new ModelRendererTurbo(this, 11, 140, textureX, textureY); // Box 314
		bodyModel[291] = new ModelRendererTurbo(this, 6, 137, textureX, textureY); // Box 315
		bodyModel[292] = new ModelRendererTurbo(this, 6, 140, textureX, textureY); // Box 316
		bodyModel[293] = new ModelRendererTurbo(this, 6, 124, textureX, textureY); // Box 317
		bodyModel[294] = new ModelRendererTurbo(this, 6, 131, textureX, textureY); // Box 319
		bodyModel[295] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 103
		bodyModel[296] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 103
		bodyModel[297] = new ModelRendererTurbo(this, 16, 131, textureX, textureY); // Box 335
		bodyModel[298] = new ModelRendererTurbo(this, 21, 137, textureX, textureY); // Box 103
		bodyModel[299] = new ModelRendererTurbo(this, 16, 134, textureX, textureY); // Box 340
		bodyModel[300] = new ModelRendererTurbo(this, 16, 137, textureX, textureY); // Box 341
		bodyModel[301] = new ModelRendererTurbo(this, 21, 140, textureX, textureY); // Box 103
		bodyModel[302] = new ModelRendererTurbo(this, 16, 140, textureX, textureY); // Box 345
		bodyModel[303] = new ModelRendererTurbo(this, 55, 150, textureX, textureY); // Box 103
		bodyModel[304] = new ModelRendererTurbo(this, 60, 153, textureX, textureY); // Box 103
		bodyModel[305] = new ModelRendererTurbo(this, 55, 159, textureX, textureY); // Box 103
		bodyModel[306] = new ModelRendererTurbo(this, 60, 156, textureX, textureY); // Box 103
		bodyModel[307] = new ModelRendererTurbo(this, 60, 150, textureX, textureY); // Box 103
		bodyModel[308] = new ModelRendererTurbo(this, 60, 159, textureX, textureY); // Box 103
		bodyModel[309] = new ModelRendererTurbo(this, 72, 152, textureX, textureY, BoxName.lamp); // Headlight TL
		bodyModel[310] = new ModelRendererTurbo(this, 65, 152, textureX, textureY, BoxName.lamp); // Headlight TR
		bodyModel[311] = new ModelRendererTurbo(this, 55, 143, textureX, textureY); // Box 0
		bodyModel[312] = new ModelRendererTurbo(this, 45, 143, textureX, textureY); // Box 0
		bodyModel[313] = new ModelRendererTurbo(this, 50, 150, textureX, textureY); // Box 103
		bodyModel[314] = new ModelRendererTurbo(this, 50, 153, textureX, textureY); // Box 103
		bodyModel[315] = new ModelRendererTurbo(this, 50, 156, textureX, textureY); // Box 103
		bodyModel[316] = new ModelRendererTurbo(this, 50, 159, textureX, textureY); // Box 103
		bodyModel[317] = new ModelRendererTurbo(this, 21, 143, textureX, textureY); // Box 0
		bodyModel[318] = new ModelRendererTurbo(this, 22, 157, textureX, textureY); // Box 0
		bodyModel[319] = new ModelRendererTurbo(this, 21, 149, textureX, textureY); // Box 0
		bodyModel[320] = new ModelRendererTurbo(this, 10, 143, textureX, textureY); // Box 380
		bodyModel[321] = new ModelRendererTurbo(this, 10, 157, textureX, textureY); // Box 381
		bodyModel[322] = new ModelRendererTurbo(this, 10, 149, textureX, textureY); // Box 382
		bodyModel[323] = new ModelRendererTurbo(this, 35, 143, textureX, textureY); // Box 383
		bodyModel[324] = new ModelRendererTurbo(this, 40, 150, textureX, textureY); // Box 384
		bodyModel[325] = new ModelRendererTurbo(this, 35, 153, textureX, textureY); // Box 385
		bodyModel[326] = new ModelRendererTurbo(this, 40, 159, textureX, textureY); // Box 386
		bodyModel[327] = new ModelRendererTurbo(this, 35, 156, textureX, textureY); // Box 387
		bodyModel[328] = new ModelRendererTurbo(this, 35, 150, textureX, textureY); // Box 388
		bodyModel[329] = new ModelRendererTurbo(this, 35, 159, textureX, textureY); // Box 389
		bodyModel[330] = new ModelRendererTurbo(this, 45, 150, textureX, textureY); // Box 390
		bodyModel[331] = new ModelRendererTurbo(this, 45, 153, textureX, textureY); // Box 391
		bodyModel[332] = new ModelRendererTurbo(this, 45, 156, textureX, textureY); // Box 392
		bodyModel[333] = new ModelRendererTurbo(this, 45, 159, textureX, textureY); // Box 393
		bodyModel[334] = new ModelRendererTurbo(this, 172, 112, textureX, textureY); // Box 0
		bodyModel[335] = new ModelRendererTurbo(this, 19, 93, textureX, textureY, BoxName.lamp); // Box 362 markerlight glow
		bodyModel[336] = new ModelRendererTurbo(this, 1, 93, textureX, textureY, BoxName.lamp); // Box 363 markerlight glow
		bodyModel[337] = new ModelRendererTurbo(this, 32, 143, textureX, textureY); // Box 362
		bodyModel[338] = new ModelRendererTurbo(this, 7, 143, textureX, textureY); // Box 369
		bodyModel[339] = new ModelRendererTurbo(this, 213, 73, textureX, textureY); // Box 362
		bodyModel[340] = new ModelRendererTurbo(this, 213, 31, textureX, textureY); // Box 372
		bodyModel[341] = new ModelRendererTurbo(this, 214, 35, textureX, textureY, BoxName.lamp); // Box 372 glow
		bodyModel[342] = new ModelRendererTurbo(this, 214, 77, textureX, textureY, BoxName.lamp); // Box 362 glow
		bodyModel[343] = new ModelRendererTurbo(this, 68, 24, textureX, textureY); // Box 88
		bodyModel[344] = new ModelRendererTurbo(this, 64, 27, textureX, textureY); // Box 88
		bodyModel[345] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 378
		bodyModel[346] = new ModelRendererTurbo(this, 68, 38, textureX, textureY); // Box 378
		bodyModel[347] = new ModelRendererTurbo(this, 54, 207, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 31, 199, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 26, 184, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 245, 2, textureX, textureY); // Box 386
		bodyModel[351] = new ModelRendererTurbo(this, 2, 196, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 2, 211, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 30, 211, textureX, textureY); // Box 389
		bodyModel[354] = new ModelRendererTurbo(this, 54, 184, textureX, textureY); // Box 390
		bodyModel[355] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 389
		bodyModel[356] = new ModelRendererTurbo(this, 54, 210, textureX, textureY); // Box 389
		bodyModel[357] = new ModelRendererTurbo(this, 21, 211, textureX, textureY); // Box 389
		bodyModel[358] = new ModelRendererTurbo(this, 54, 205, textureX, textureY); // Box 389
		bodyModel[359] = new ModelRendererTurbo(this, 54, 187, textureX, textureY); // Box 197
		bodyModel[360] = new ModelRendererTurbo(this, 31, 177, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 57, 189, textureX, textureY); // Box 389
		bodyModel[362] = new ModelRendererTurbo(this, 63, 203, textureX, textureY); // Box 0
		bodyModel[363] = new ModelRendererTurbo(this, 63, 209, textureX, textureY); // Box 0
		bodyModel[364] = new ModelRendererTurbo(this, 65, 215, textureX, textureY); // Box 0
		bodyModel[365] = new ModelRendererTurbo(this, 79, 197, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 72, 199, textureX, textureY); // Box 0
		bodyModel[367] = new ModelRendererTurbo(this, 67, 199, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 60, 199, textureX, textureY); // Box 389
		bodyModel[369] = new ModelRendererTurbo(this, 380, 193, textureX, textureY); // Box 0
		bodyModel[370] = new ModelRendererTurbo(this, 385, 205, textureX, textureY); // Box 0
		bodyModel[371] = new ModelRendererTurbo(this, 382, 186, textureX, textureY); // Box 394
		bodyModel[372] = new ModelRendererTurbo(this, 421, 186, textureX, textureY); // Box 394
		bodyModel[373] = new ModelRendererTurbo(this, 318, 216, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 326, 196, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 340, 204, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 343, 204, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 346, 204, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Box 0
		bodyModel[380] = new ModelRendererTurbo(this, 352, 204, textureX, textureY); // Box 0
		bodyModel[381] = new ModelRendererTurbo(this, 355, 204, textureX, textureY); // Box 0
		bodyModel[382] = new ModelRendererTurbo(this, 358, 204, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 286, 184, textureX, textureY); // Box 0
		bodyModel[384] = new ModelRendererTurbo(this, 297, 187, textureX, textureY); // Box 0
		bodyModel[385] = new ModelRendererTurbo(this, 323, 210, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 308, 184, textureX, textureY); // Box 0
		bodyModel[387] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 0
		bodyModel[388] = new ModelRendererTurbo(this, 330, 184, textureX, textureY); // Box 0
		bodyModel[389] = new ModelRendererTurbo(this, 341, 187, textureX, textureY); // Box 0
		bodyModel[390] = new ModelRendererTurbo(this, 352, 184, textureX, textureY); // Box 0
		bodyModel[391] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 0
		bodyModel[392] = new ModelRendererTurbo(this, 295, 174, textureX, textureY); // Box 394
		bodyModel[393] = new ModelRendererTurbo(this, 304, 170, textureX, textureY); // Box 394
		bodyModel[394] = new ModelRendererTurbo(this, 351, 179, textureX, textureY); // Box 394
		bodyModel[395] = new ModelRendererTurbo(this, 381, 224, textureX, textureY); // Box 394
		bodyModel[396] = new ModelRendererTurbo(this, 383, 222, textureX, textureY); // Box 394
		bodyModel[397] = new ModelRendererTurbo(this, 383, 215, textureX, textureY); // Box 394
		bodyModel[398] = new ModelRendererTurbo(this, 406, 223, textureX, textureY); // Box 394
		bodyModel[399] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 394
		bodyModel[400] = new ModelRendererTurbo(this, 407, 212, textureX, textureY); // Box 394
		bodyModel[401] = new ModelRendererTurbo(this, 396, 225, textureX, textureY); // Box 394
		bodyModel[402] = new ModelRendererTurbo(this, 422, 210, textureX, textureY); // Box 169
		bodyModel[403] = new ModelRendererTurbo(this, 437, 233, textureX, textureY); // Box 169
		bodyModel[404] = new ModelRendererTurbo(this, 437, 202, textureX, textureY); // Box 439
		bodyModel[405] = new ModelRendererTurbo(this, 434, 185, textureX, textureY); // Box 0
		bodyModel[406] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 0
		bodyModel[407] = new ModelRendererTurbo(this, 433, 176, textureX, textureY); // Box 103
		bodyModel[408] = new ModelRendererTurbo(this, 470, 214, textureX, textureY); // Box 394
		bodyModel[409] = new ModelRendererTurbo(this, 470, 188, textureX, textureY); // Box 444
		bodyModel[410] = new ModelRendererTurbo(this, 486, 191, textureX, textureY); // Box 394
		bodyModel[411] = new ModelRendererTurbo(this, 499, 191, textureX, textureY); // Box 394
		bodyModel[412] = new ModelRendererTurbo(this, 501, 200, textureX, textureY); // Box 0
		bodyModel[413] = new ModelRendererTurbo(this, 481, 176, textureX, textureY); // Box 394
		bodyModel[414] = new ModelRendererTurbo(this, 488, 212, textureX, textureY); // Box 394
		bodyModel[415] = new ModelRendererTurbo(this, 484, 200, textureX, textureY); // Box 394
		bodyModel[416] = new ModelRendererTurbo(this, 263, 213, textureX, textureY); // Box 0
		bodyModel[417] = new ModelRendererTurbo(this, 244, 212, textureX, textureY); // Box 0
		bodyModel[418] = new ModelRendererTurbo(this, 282, 212, textureX, textureY); // Box 0
		bodyModel[419] = new ModelRendererTurbo(this, 244, 203, textureX, textureY); // Box 0
		bodyModel[420] = new ModelRendererTurbo(this, 282, 203, textureX, textureY); // Box 691
		bodyModel[421] = new ModelRendererTurbo(this, 205, 229, textureX, textureY); // Box 0
		bodyModel[422] = new ModelRendererTurbo(this, 309, 225, textureX, textureY); // Box 0
		bodyModel[423] = new ModelRendererTurbo(this, 204, 222, textureX, textureY); // Box 0
		bodyModel[424] = new ModelRendererTurbo(this, 206, 212, textureX, textureY); // Box 0
		bodyModel[425] = new ModelRendererTurbo(this, 208, 218, textureX, textureY); // Box 0
		bodyModel[426] = new ModelRendererTurbo(this, 208, 208, textureX, textureY); // Box 757
		bodyModel[427] = new ModelRendererTurbo(this, 197, 215, textureX, textureY); // Box 0
		bodyModel[428] = new ModelRendererTurbo(this, 199, 209, textureX, textureY); // Box 0
		bodyModel[429] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 190, 215, textureX, textureY); // Box 0
		bodyModel[431] = new ModelRendererTurbo(this, 265, 171, textureX, textureY); // Box 0
		bodyModel[432] = new ModelRendererTurbo(this, 266, 203, textureX, textureY); // Box 0
		bodyModel[433] = new ModelRendererTurbo(this, 267, 208, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 228, 221, textureX, textureY); // Box 0
		bodyModel[435] = new ModelRendererTurbo(this, 235, 214, textureX, textureY); // Box 0
		bodyModel[436] = new ModelRendererTurbo(this, 194, 211, textureX, textureY); // Box 0
		bodyModel[437] = new ModelRendererTurbo(this, 195, 223, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 235, 220, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 219, 220, textureX, textureY); // Box 471
		bodyModel[440] = new ModelRendererTurbo(this, 231, 207, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 222, 209, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 215, 202, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 215, 207, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 222, 199, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 265, 184, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 266, 194, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 288, 189, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 244, 221, textureX, textureY); // Box 0
		bodyModel[451] = new ModelRendererTurbo(this, 282, 221, textureX, textureY); // Box 486
		bodyModel[452] = new ModelRendererTurbo(this, 279, 193, textureX, textureY); // Box 0
		bodyModel[453] = new ModelRendererTurbo(this, 229, 190, textureX, textureY); // Box 394
		bodyModel[454] = new ModelRendererTurbo(this, 244, 192, textureX, textureY); // Box 394
		bodyModel[455] = new ModelRendererTurbo(this, 229, 181, textureX, textureY); // Box 394
		bodyModel[456] = new ModelRendererTurbo(this, 287, 167, textureX, textureY); // Box 394
		bodyModel[457] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 394
		bodyModel[458] = new ModelRendererTurbo(this, 274, 175, textureX, textureY); // Box 394
		bodyModel[459] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 0
		bodyModel[460] = new ModelRendererTurbo(this, 233, 107, textureX, textureY); // Box 0
		bodyModel[461] = new ModelRendererTurbo(this, 55, 126, textureX, textureY, BoxName.lamp); // Large single headlight T
		bodyModel[462] = new ModelRendererTurbo(this, 79, 150, textureX, textureY, BoxName.lamp); // Large single headlight B
		bodyModel[463] = new ModelRendererTurbo(this, 44, 133, textureX, textureY, BoxName.lamp); // Headlight TB
		bodyModel[464] = new ModelRendererTurbo(this, 44, 123, textureX, textureY, BoxName.lamp); // Headlight TT
		bodyModel[465] = new ModelRendererTurbo(this, 68, 157, textureX, textureY, BoxName.lamp); // Headlight BB
		bodyModel[466] = new ModelRendererTurbo(this, 68, 147, textureX, textureY, BoxName.lamp); // Headlight BT
		bodyModel[467] = new ModelRendererTurbo(this, 495, 50, textureX, textureY, BoxName.lamp); // backing light type 3
		bodyModel[468] = new ModelRendererTurbo(this, 500, 47, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[469] = new ModelRendererTurbo(this, 166, 158, textureX, textureY); // Box 509
		bodyModel[470] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 0
		bodyModel[471] = new ModelRendererTurbo(this, 164, 144, textureX, textureY); // Box 0
		bodyModel[472] = new ModelRendererTurbo(this, 161, 160, textureX, textureY); // Box 508
		bodyModel[473] = new ModelRendererTurbo(this, 149, 144, textureX, textureY); // Box 0
		bodyModel[474] = new ModelRendererTurbo(this, 156, 159, textureX, textureY); // Box 0
		bodyModel[475] = new ModelRendererTurbo(this, 119, 144, textureX, textureY); // Box 0
		bodyModel[476] = new ModelRendererTurbo(this, 134, 144, textureX, textureY); // Box 0
		bodyModel[477] = new ModelRendererTurbo(this, 156, 164, textureX, textureY); // Box 0
		bodyModel[478] = new ModelRendererTurbo(this, 156, 168, textureX, textureY); // Box 0
		bodyModel[479] = new ModelRendererTurbo(this, 164, 131, textureX, textureY); // Box 510
		bodyModel[480] = new ModelRendererTurbo(this, 161, 123, textureX, textureY); // Box 511
		bodyModel[481] = new ModelRendererTurbo(this, 149, 134, textureX, textureY); // Box 512
		bodyModel[482] = new ModelRendererTurbo(this, 156, 122, textureX, textureY); // Box 513
		bodyModel[483] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 514
		bodyModel[484] = new ModelRendererTurbo(this, 134, 135, textureX, textureY); // Box 515
		bodyModel[485] = new ModelRendererTurbo(this, 156, 127, textureX, textureY); // Box 516
		bodyModel[486] = new ModelRendererTurbo(this, 156, 131, textureX, textureY); // Box 517
		bodyModel[487] = new ModelRendererTurbo(this, 166, 121, textureX, textureY); // Box 518
		bodyModel[488] = new ModelRendererTurbo(this, 166, 124, textureX, textureY); // Box 519
		bodyModel[489] = new ModelRendererTurbo(this, 213, 45, textureX, textureY); // Box 512
		bodyModel[490] = new ModelRendererTurbo(this, 208, 87, textureX, textureY); // Box 517
		bodyModel[491] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 481
		bodyModel[492] = new ModelRendererTurbo(this, 172, 168, textureX, textureY); // Box 481
		bodyModel[493] = new ModelRendererTurbo(this, 7, 90, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 8, 93, textureX, textureY, BoxName.lamp); // Box 0 glow
		bodyModel[495] = new ModelRendererTurbo(this, 9, 97, textureX, textureY, BoxName.lamp); // Box 0 glow
		bodyModel[496] = new ModelRendererTurbo(this, 7, 103, textureX, textureY); // Box 0
		bodyModel[497] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.lamp); // Box 0 glow
		bodyModel[498] = new ModelRendererTurbo(this, 9, 110, textureX, textureY, BoxName.lamp); // Box 0 glow
		bodyModel[499] = new ModelRendererTurbo(this, 239, 49, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 15, 6, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, 2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[1].setRotationPoint(-28.5F, 0F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(37.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(35.5F, 2F, -3.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 74, 1, 12, 0F); // Box 0
		bodyModel[4].setRotationPoint(-37.5F, 2F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[5].setRotationPoint(-21.5F, 2.5F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(20F, 2.5F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[7].setRotationPoint(-6F, 8F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[8].setRotationPoint(32.5F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[9].setRotationPoint(32.5F, 2F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[10].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[11].setRotationPoint(-21.5F, 2F, 11F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 20, 0F); // Box 0
		bodyModel[12].setRotationPoint(-31.5F, 0F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 0
		bodyModel[13].setRotationPoint(-36.5F, 0F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-31.5F, 0F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-36.5F, 0F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[16].setRotationPoint(-40.5F, 3F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-38.5F, 1F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-37.5F, 0F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-38.5F, 0F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-37.5F, 0F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-37.5F, 2F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 495
		bodyModel[22].setRotationPoint(-31.5F, 0F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 496
		bodyModel[23].setRotationPoint(-36.5F, 0F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 497
		bodyModel[24].setRotationPoint(-38.5F, 1F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 498
		bodyModel[25].setRotationPoint(-37.5F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F); // Box 499
		bodyModel[26].setRotationPoint(-38.5F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 500
		bodyModel[27].setRotationPoint(-37.5F, 0F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 501
		bodyModel[28].setRotationPoint(-37.5F, 1F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-38.5F, 2F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F); // Box 504
		bodyModel[30].setRotationPoint(-37.5F, 2F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 505
		bodyModel[31].setRotationPoint(-38.5F, 2F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0.07F, 0F, -3F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0.07F, 0F, 3F, 0.43F, 0F, -3F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0.43F, 0F, 3F); // Box 0 cull
		bodyModel[32].setRotationPoint(-36.5F, 3F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[33].setRotationPoint(-37.5F, 1F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0.07F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, 0F, 3F); // Box 509
		bodyModel[34].setRotationPoint(-36.5F, 2F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[35].setRotationPoint(-32.5F, 3F, -9.41F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0.07F, 0F, 3F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0.07F, 0F, -3F, 0.43F, 0F, 3F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0.43F, 0F, -3F); // Box 512 cull
		bodyModel[36].setRotationPoint(-36.5F, 3F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.07F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, 0F, -3F); // Box 513
		bodyModel[37].setRotationPoint(-36.5F, 2F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[38].setRotationPoint(-32.5F, 3F, 8.41F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33F, 0F, 0F, -0.33F, -1F, 0F, -0.33F, -1F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[39].setRotationPoint(-31.5F, 2F, -10.33F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, 0F, 0.33F, -1F, 0F, 0.33F, -1F, 0F, -0.33F, 0F, 0F, -0.33F); // Box 516
		bodyModel[40].setRotationPoint(-31.5F, 2F, 9.33F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[41].setRotationPoint(37.5F, 2F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(37.5F, 2F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[43].setRotationPoint(21F, 2F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(21F, 2.5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[45].setRotationPoint(21F, 2.5F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-20.5F, 2F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-20.5F, 2.5F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-20.5F, 2.5F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[49].setRotationPoint(-32.3F, 2.75F, 6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[50].setRotationPoint(-32.3F, 2F, 6.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[51].setRotationPoint(-32.05F, 3F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[52].setRotationPoint(32.5F, 2F, -3.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[53].setRotationPoint(-37.78F, 2F, -3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[54].setRotationPoint(-32.5F, 2F, -3.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 0
		bodyModel[55].setRotationPoint(-23.5F, -14F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 0
		bodyModel[56].setRotationPoint(-21.5F, -7F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 50, 14, 1, 0F); // Box 0
		bodyModel[57].setRotationPoint(-17.5F, -14F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 55, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(-17.5F, -19F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 60
		bodyModel[59].setRotationPoint(-23.5F, -14F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 61
		bodyModel[60].setRotationPoint(-21.5F, -7F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 55, 14, 1, 0F); // Box 62
		bodyModel[61].setRotationPoint(-17.5F, -14F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 55, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(-17.5F, -19F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 14, 9, 0F); // Box 0
		bodyModel[63].setRotationPoint(36.5F, -14F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 0
		bodyModel[64].setRotationPoint(32.5F, -14F, -11F);

		bodyModel[65].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[65].setRotationPoint(36.5F, -12F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[66].setRotationPoint(36.5F, -7F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[67].setRotationPoint(32.5F, -7F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 79
		bodyModel[68].setRotationPoint(37F, -11F, -12F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 80
		bodyModel[69].setRotationPoint(32F, -11F, -12F);

		bodyModel[70].addBox(0F, 0F, -4F, 1, 15, 4, 0F); // Rear door
		bodyModel[70].setRotationPoint(36.5F, -15F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[71].setRotationPoint(36.5F, -14F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[72].setRotationPoint(36.5F, -19F, -8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 0
		bodyModel[73].setRotationPoint(36.5F, -19F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[74].setRotationPoint(36.5F, -19F, 1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[75].setRotationPoint(36.5F, -19F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[76].setRotationPoint(36.5F, -19F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(-26.5F, -20F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(-26.5F, -20F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 64, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[79].setRotationPoint(-26.5F, -22F, -2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[80].setRotationPoint(-26.5F, -22F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[81].setRotationPoint(-26.5F, -22F, 2.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[82].setRotationPoint(37.5F, -17F, 3F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[83].setRotationPoint(37.5F, 0F, -5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[84].setRotationPoint(37.5F, -18F, -5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[85].setRotationPoint(37.5F, -17F, -5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[86].setRotationPoint(37.5F, -19F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[87].setRotationPoint(37.5F, -19F, -4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[88].setRotationPoint(37.5F, -19F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[89].setRotationPoint(37.5F, -19F, 3F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[90].setRotationPoint(37.5F, 1F, -5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[91].setRotationPoint(37.5F, 1F, 4F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[92].setRotationPoint(38.5F, 0F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[93].setRotationPoint(36.5F, -21F, -2.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[94].setRotationPoint(36.5F, -21F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(36.5F, -21F, 2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-26.5F, -19F, -9.8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[97].setRotationPoint(-26.5F, -19F, 8.8F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 79
		bodyModel[98].setRotationPoint(-17F, -14F, -12F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 80
		bodyModel[99].setRotationPoint(-22F, -14F, -12F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 108
		bodyModel[100].setRotationPoint(-17F, -14F, 11F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 109
		bodyModel[101].setRotationPoint(-22F, -14F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(-22.5F, -18F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[103].setRotationPoint(-17F, -17F, -12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[104].setRotationPoint(-22F, -17F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[105].setRotationPoint(-17F, -17F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[106].setRotationPoint(-22F, -17F, 11F);

		bodyModel[107].addShapeBox(-4F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door L
		bodyModel[107].setRotationPoint(-17.5F, -18F, -9.3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 0
		bodyModel[108].setRotationPoint(-21.51F, -14F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.3F, 0F, 0.35F, -0.3F); // Box 0
		bodyModel[109].setRotationPoint(-21.51F, -16.35F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.3F, 0F, 0.35F, -0.3F); // Box 0
		bodyModel[110].setRotationPoint(-17.51F, -16.35F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[111].setRotationPoint(-21.51F, -14F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.35F, -0.3F, 0F, 0.35F, -0.3F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 122
		bodyModel[112].setRotationPoint(-21.51F, -16.35F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.35F, -0.3F, 0F, 0.35F, -0.3F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 124
		bodyModel[113].setRotationPoint(-17.51F, -16.35F, 9F);

		bodyModel[114].addShapeBox(-4F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door R
		bodyModel[114].setRotationPoint(-17.5F, -18F, 9.3F);

		bodyModel[115].addBox(0F, 0F, 0F, 7, 7, 20, 0F); // Box 0
		bodyModel[115].setRotationPoint(-23.5F, -7F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[116].setRotationPoint(-17.5F, -14F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[117].setRotationPoint(-17.5F, -19F, -10F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 13, 10, 0F); // Box 0
		bodyModel[118].setRotationPoint(-20.5F, -20F, -5F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 7, 10, 0F); // Box 0
		bodyModel[119].setRotationPoint(-16.5F, -7F, -5F);

		bodyModel[120].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 0
		bodyModel[120].setRotationPoint(-20.5F, -21F, -2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[121].setRotationPoint(-20.5F, -21F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[122].setRotationPoint(-20.5F, -21F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.17F, 0F, 0F, 0.17F, 0F, 0F, 0.17F, -0.5F, 0F, 0.17F, -0.5F); // Box 0
		bodyModel[123].setRotationPoint(-17.5F, -20.17F, -8.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.17F, -0.5F, 0F, 0.17F, -0.5F, 0F, 0.17F, 0F, 0F, 0.17F, 0F); // Box 141
		bodyModel[124].setRotationPoint(-17.5F, -20.17F, 4.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[125].setRotationPoint(-17.5F, -14F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[126].setRotationPoint(-17.5F, -19F, 8F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[127].setRotationPoint(-16.5F, -3F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[128].setRotationPoint(-16.5F, -7F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 0
		bodyModel[129].setRotationPoint(-16.5F, -4.66F, -9F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 0
		bodyModel[130].setRotationPoint(-14.5F, -2.33F, -9F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 152
		bodyModel[131].setRotationPoint(-16.5F, -3F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[132].setRotationPoint(-16.5F, -7F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(39F, -16F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(39F, -16F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[135].setRotationPoint(38.5F, -17F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[136].setRotationPoint(38.5F, -17F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[137].setRotationPoint(38.5F, -17.5F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(39F, -19F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[139].setRotationPoint(39F, -19F, 1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(39F, -19F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(39F, -17F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[142].setRotationPoint(37.5F, -9F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[143].setRotationPoint(19.5F, -20F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[144].setRotationPoint(19.5F, -20.5F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[145].setRotationPoint(19.5F, -20F, -9.51F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[146].setRotationPoint(19.5F, -20F, 8.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[147].setRotationPoint(19.5F, -20.5F, 5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 171
		bodyModel[148].setRotationPoint(19.5F, -20F, 9.51F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[149].setRotationPoint(-10.5F, -10F, -11.01F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 84, 8, 1, 0F,0F, 0F, -1.2F, -44F, 0F, -1.2F, -44F, 0F, 1.22F, 0F, 0F, 1.22F, 0F, -4F, 0F, -44F, -4F, 0F, -44F, -4F, 0.02F, 0F, -4F, 0.02F); // Box 0
		bodyModel[150].setRotationPoint(-8.5F, -18F, -11.01F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 24, 0, 10, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5F, 0F, 0F, -5F); // Box 0
		bodyModel[151].setRotationPoint(19.5F, -22.01F, -2.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, -0.65F, 0F, -12F, -0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F, 0F, 0.65F, 0F, -12F, 0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[152].setRotationPoint(19.5F, -22.01F, -4.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, 0F, -2F, -12F, 0F, -2F, -12F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0.65F, 0F, 0F, 0.65F, 0F); // Box 182
		bodyModel[153].setRotationPoint(19.5F, -22.01F, 0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[154].setRotationPoint(-1.5F, -22.5F, -2F);

		bodyModel[155].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 exhaust
		bodyModel[155].setRotationPoint(-5.5F, -22F, 2.5F);
		bodyModel[155].rotateAngleX = -0.31415927F;

		bodyModel[156].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 0
		bodyModel[156].setRotationPoint(34F, -21.58F, -4.5F);

		bodyModel[157].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 0
		bodyModel[157].setRotationPoint(-7.25F, -20.74F, -6.3F);
		bodyModel[157].rotateAngleX = 0.32288591F;

		bodyModel[158].addShapeBox(0F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[158].setRotationPoint(-7.25F, -20.42F, -7.25F);
		bodyModel[158].rotateAngleX = 0.32288591F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0F, 0F, -2F, 0F, -0.7F, 0F, 0F, 0.7F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 0
		bodyModel[159].setRotationPoint(-27.5F, -22F, -8.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(-27.5F, -20F, -9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1.3F, 0.21F, 0F, -0.3F); // Box 0
		bodyModel[161].setRotationPoint(-27.5F, -19F, -9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.21F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0.21F, 0F, -0.3F); // Box 0
		bodyModel[162].setRotationPoint(-27.5F, -19F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -1F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		bodyModel[163].setRotationPoint(-28.5F, -22F, -2.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0.5F, 0F, -0.7F, 0.5F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 0
		bodyModel[164].setRotationPoint(-28.5F, -21F, -2.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		bodyModel[165].setRotationPoint(-27.5F, -22F, -2.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.75F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.05F, 0F, 0F, -0.75F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.05F, 0F, 0F); // Box 0
		bodyModel[166].setRotationPoint(-27.25F, -22F, -8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 1F, 1.8F, 0F, -1F, 1.8F, 0F, -1.7F, 0.5F, 0F, 1.75F, 0.5F, 0F); // Box 0
		bodyModel[167].setRotationPoint(-27.5F, -21F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0.05F, 0.22F, -0.85F, 0.05F, 0.22F, -1F, -0.2F, 0F, 1F, -0.2F, 0F); // Box 0
		bodyModel[168].setRotationPoint(-27.5F, -19F, -9.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 194
		bodyModel[169].setRotationPoint(-27.5F, -20F, 8.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.7F, -1F, 0F, -0.7F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 205
		bodyModel[170].setRotationPoint(-27.5F, -22F, 2.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 206
		bodyModel[171].setRotationPoint(-28.5F, -22F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.7F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Box 207
		bodyModel[172].setRotationPoint(-28.5F, -21F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 208
		bodyModel[173].setRotationPoint(-27.5F, -22F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.05F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.75F, -2F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.75F, 2F, 0F); // Box 209
		bodyModel[174].setRotationPoint(-27.25F, -22F, 2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1.75F, 0.5F, 0F, -1.7F, 0.5F, 0F, -1F, 1.8F, 0F, 1F, 1.8F, 0F); // Box 210
		bodyModel[175].setRotationPoint(-27.5F, -21F, 2.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.2F, -0.21F, 0F, -1.2F, -0.21F, 0F, 1.2F, 0.21F, 0F, 1.2F, 0.65F, 0.05F, -0.28F, -0.85F, 0.05F, -0.28F, -0.85F, 0.05F, 0.28F, 0.85F, 0.05F, 0.28F); // Box 0
		bodyModel[176].setRotationPoint(-27.5F, -18F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.65F, 0F, -0.28F, -0.85F, 0F, -0.28F, -0.85F, 0F, 0.28F, 0.85F, 0F, 0.28F, 0.85F, -0.05F, 0F, -0.85F, -0.05F, 0F, -0.85F, -0.05F, 0F, 1.05F, -0.05F, 0F); // Box 0
		bodyModel[177].setRotationPoint(-27.5F, -14.95F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.85F, 0F, 0.28F, -0.85F, 0F, 0.28F, -0.85F, 0F, -0.28F, 0.65F, 0F, -0.28F, 1.05F, -0.05F, 0F, -0.85F, -0.05F, 0F, -0.85F, -0.05F, 0F, 0.85F, -0.05F, 0F); // Box 214
		bodyModel[178].setRotationPoint(-27.5F, -14.95F, 10F);

		bodyModel[179].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 0
		bodyModel[179].setRotationPoint(-28.5F, -14F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 0
		bodyModel[180].setRotationPoint(-25.5F, -10F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[181].setRotationPoint(-28.5F, -10F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[182].setRotationPoint(-25.5F, -8F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.21F, -0.01F, -1.7F, -1.2F, -0.01F, -1.7F, -1.21F, -0.01F, 1.2F, 0.21F, -0.01F, 1.2F, 0.84F, 0.05F, -0.78F, -1.2F, 0.05F, -0.78F, -1.2F, 0.05F, 0.28F, 0.84F, 0.05F, 0.28F); // Box 0 cull
		bodyModel[183].setRotationPoint(-26.5F, -18F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.49F, 0F, -0.78F, -0.85F, 0F, -0.78F, -0.85F, 0F, 0.28F, 0.49F, 0F, 0.28F, 0.49F, -0.06F, -0.5F, -0.85F, -0.06F, -0.5F, -0.85F, -0.06F, 0F, 0.49F, -0.06F, 0F); // Box 0 cull
		bodyModel[184].setRotationPoint(-26.85F, -14.95F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, -1.7F, 0F, -0.01F, -1.7F, 0F, -0.01F, 1.2F, 0F, -0.01F, 1.2F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 0 cull
		bodyModel[185].setRotationPoint(-26.7F, -18F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.01F, -1.7F, -0.4F, -0.01F, -1.7F, -0.4F, -0.01F, 1.2F, 0F, -0.01F, 1.2F, 0F, -0.01F, -0.5F, -0.4F, -0.01F, -0.5F, -0.4F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 0 cull
		bodyModel[186].setRotationPoint(-25.7F, -18F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.01F, -1.7F, -0.41F, -0.01F, -1.7F, -0.41F, -0.01F, 1.2F, 0F, -0.01F, 1.2F, 0F, -0.01F, -0.5F, -0.41F, -0.01F, -0.5F, -0.41F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 0 cull
		bodyModel[187].setRotationPoint(-24.1F, -18F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 0
		bodyModel[188].setRotationPoint(-30.5F, -14F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F); // Box 0
		bodyModel[189].setRotationPoint(-30.5F, -11F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F); // Box 0
		bodyModel[190].setRotationPoint(-32.5F, -13.75F, -10.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, -1F, -1.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1.4F); // Box 0
		bodyModel[191].setRotationPoint(-32.5F, -11F, -10.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F); // Box 0
		bodyModel[192].setRotationPoint(-32.5F, -14.5F, -10.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.85F, -0.5F, -3.5F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -1.9F, -0.5F, 2.35F, -0.85F, -0.5F, -3.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.9F, -0.5F, 2.35F); // Box 0
		bodyModel[193].setRotationPoint(-37.5F, -13.5F, -9.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -4.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3.25F, 0F, -1F, -4.25F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, -1F, -1F, 3.25F); // Box 0
		bodyModel[194].setRotationPoint(-37.5F, -12F, -9.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 235
		bodyModel[195].setRotationPoint(-28.5F, -14F, 10F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 236
		bodyModel[196].setRotationPoint(-25.5F, -10F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.21F, -0.01F, 1.2F, -1.21F, -0.01F, 1.2F, -1.2F, -0.01F, -1.7F, 0.21F, -0.01F, -1.7F, 0.84F, 0.05F, 0.28F, -1.2F, 0.05F, 0.28F, -1.2F, 0.05F, -0.78F, 0.84F, 0.05F, -0.78F); // Box 239 cull
		bodyModel[197].setRotationPoint(-26.5F, -18F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.49F, 0F, 0.28F, -0.85F, 0F, 0.28F, -0.85F, 0F, -0.78F, 0.49F, 0F, -0.78F, 0.49F, -0.06F, 0F, -0.85F, -0.06F, 0F, -0.85F, -0.06F, -0.5F, 0.49F, -0.06F, -0.5F); // Box 240 cull
		bodyModel[198].setRotationPoint(-26.85F, -14.95F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.01F, 1.2F, 0F, -0.01F, 1.2F, 0F, -0.01F, -1.7F, 0F, -0.01F, -1.7F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 241 cull
		bodyModel[199].setRotationPoint(-26.7F, -18F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.01F, 1.2F, -0.4F, -0.01F, 1.2F, -0.4F, -0.01F, -1.7F, 0F, -0.01F, -1.7F, 0F, -0.01F, 0F, -0.4F, -0.01F, 0F, -0.4F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 242 cull
		bodyModel[200].setRotationPoint(-25.7F, -18F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.01F, 1.2F, -0.41F, -0.01F, 1.2F, -0.41F, -0.01F, -1.7F, 0F, -0.01F, -1.7F, 0F, -0.01F, 0F, -0.41F, -0.01F, 0F, -0.41F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 243 cull
		bodyModel[201].setRotationPoint(-24.1F, -18F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 244
		bodyModel[202].setRotationPoint(-30.5F, -14F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F); // Box 245
		bodyModel[203].setRotationPoint(-30.5F, -11F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[204].setRotationPoint(-22.5F, -18F, 10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F); // Box 0
		bodyModel[205].setRotationPoint(-32.5F, -12F, -10.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F); // Box 254
		bodyModel[206].setRotationPoint(-32.5F, -13.75F, 9.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -1F, 1.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.4F); // Box 257
		bodyModel[207].setRotationPoint(-32.5F, -11F, 9.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, -1F, -1F, 3.25F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, -1F, -4.25F); // Box 258
		bodyModel[208].setRotationPoint(-37.5F, -12F, 8.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F); // Box 259
		bodyModel[209].setRotationPoint(-32.5F, -12F, 9.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -3F, 0.25F, -0.28F, -1.75F, 0.25F, -1.2F, 0F, 0F, 1.2F, -1F, 0F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, -1.2F, 0F, 0F, 1.2F, 0F, 0F); // Box 0
		bodyModel[210].setRotationPoint(-37.5F, -15F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, 0F, -0.25F, -1.35F, 0F, -0.25F, -1.48F, 0.25F, 0F, 1.2F, -1F, 0F, -0.7F, -1F, -0.1F, -1.48F, -1.25F, -1F, -1.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 0
		bodyModel[211].setRotationPoint(-36.3F, -13F, -6.25F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0.25F, 0F, -2F, 0.25F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.91F, 0F, 0F, 0.91F, 0F, 0F); // Box 0
		bodyModel[212].setRotationPoint(-37.5F, -14F, -5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.17F, 0F, 0F, 0.17F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-37.5F, -12F, -5.25F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.2F, -1F, 0F, -1.2F, 0F, 0F, -0.28F, -1.75F, 0.25F, 0F, -3F, 0.25F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 2F, 0.25F, 0F, 2F, 0.25F); // Box 243
		bodyModel[214].setRotationPoint(-37.5F, -15F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0.91F, 0F, 0F, -0.91F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 245
		bodyModel[215].setRotationPoint(-37.5F, -14F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0.17F, 0F, 0F, -0.17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 246
		bodyModel[216].setRotationPoint(-37.5F, -12F, 4.25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 0
		bodyModel[217].setRotationPoint(-28.5F, -5F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0.21F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.21F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 0
		bodyModel[218].setRotationPoint(-30.5F, -10F, -10.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.73F, 0F, 0F, 0.71F, 0F, 0F, -0.71F, 0F, 0F, 0.73F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 0
		bodyModel[219].setRotationPoint(-32.5F, -10F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, -3.25F, -1F, -1F, 0.85F, -1F, -1F, -0.85F, 0F, 0F, 2.25F, 0.915F, 0F, -3.335F, -1F, 0F, 0.85F, -1F, 0F, -0.85F, -0.085F, 0F, 2.335F); // Box 0
		bodyModel[220].setRotationPoint(-36.5F, -12F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, -1F, 0.21F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.21F); // Box 0
		bodyModel[221].setRotationPoint(-30.5F, -10F, -10.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.5F); // Box 0
		bodyModel[222].setRotationPoint(-28.5F, -8F, -11.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F); // Box 0
		bodyModel[223].setRotationPoint(-28.5F, -10F, -11.4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F); // Box 0
		bodyModel[224].setRotationPoint(-25.5F, -8F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.65F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.65F, 0F, 0F, -0.73F, 0F, 0F, 0.71F, 0F, 0F, -0.71F, 0F, 0F, 0.73F); // Box 0
		bodyModel[225].setRotationPoint(-32.5F, -11F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0.915F, 0F, -3.335F, -1F, 0F, 0.85F, -1F, 0F, -0.85F, -0.085F, 0F, 2.335F, 0F, 0F, -4.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3.25F); // Box 0
		bodyModel[226].setRotationPoint(-36.5F, -11F, -8.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.15F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 2.35F, 0.12F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, 0F, 2.5F); // Box 0
		bodyModel[227].setRotationPoint(-36.5F, -13F, -9.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.85F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0.9F, 0F, -0.65F, -1.9F, 0F, -0.65F, 0F, 0F, -1.25F, -0.12F, 0F, -0.5F, 0.92F, 0F, -0.5F, -1F, 0F, 0.25F); // Box 0
		bodyModel[228].setRotationPoint(-37.5F, -13F, -6.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 269
		bodyModel[229].setRotationPoint(-28.5F, -5F, 10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -0.21F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.21F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 270
		bodyModel[230].setRotationPoint(-30.5F, -10F, 9.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0.73F, 0F, 0F, -0.71F, 0F, 0F, 0.71F, 0F, 0F, -0.73F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 271
		bodyModel[231].setRotationPoint(-32.5F, -10F, 9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 2.25F, -1F, -1F, -0.85F, -1F, -1F, 0.85F, 1F, 0F, -3.25F, -0.085F, 0F, 2.335F, -1F, 0F, -0.85F, -1F, 0F, 0.85F, 0.915F, 0F, -3.335F); // Box 272
		bodyModel[232].setRotationPoint(-36.5F, -12F, 7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.25F, 0F, -1F, -0.21F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.21F); // Box 273
		bodyModel[233].setRotationPoint(-30.5F, -10F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, 0F, 0.5F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.5F); // Box 274
		bodyModel[234].setRotationPoint(-28.5F, -8F, 10.25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.65F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, 0.73F, 0F, 0F, -0.71F, 0F, 0F, 0.71F, 0F, 0F, -0.73F); // Box 277
		bodyModel[235].setRotationPoint(-32.5F, -11F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,-0.085F, 0F, 2.335F, -1F, 0F, -0.85F, -1F, 0F, 0.85F, 0.915F, 0F, -3.335F, -1F, 0F, 3.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.25F); // Box 278
		bodyModel[236].setRotationPoint(-36.5F, -11F, 7.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 279
		bodyModel[237].setRotationPoint(-28.5F, -10F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 280
		bodyModel[238].setRotationPoint(-25.5F, -8F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F); // Box 281
		bodyModel[239].setRotationPoint(-28.5F, -10F, 10.4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 282
		bodyModel[240].setRotationPoint(-25.5F, -8F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.05F, 0F, 0.005F, 0F, 0F, 0.25F); // Box 0
		bodyModel[241].setRotationPoint(-30.5F, -15F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.85F, -1F, 0F, -0.78F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -1.05F, 0F, 0.001F, 0.05F, 0F, 0.001F); // Box 0
		bodyModel[242].setRotationPoint(-28.5F, -15F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1.25F, -1.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.25F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.005F, 0F, 0.25F, 1.25F); // Box 0
		bodyModel[243].setRotationPoint(-32.5F, -15F, -10.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.15F, -1.75F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0F, -0.9F, -1.09F, 2.35F, 0.15F, 0.75F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0.005F, -0.9F, 0.75F, 2.35F); // Box 0
		bodyModel[244].setRotationPoint(-36.5F, -14.75F, -9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.15F, 0.05F, 0.01F, 0F, 0.05F, 0.01F, -1F, 0.13F, -0.4F, -0.1F, 0F, -0.35F, -0.15F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, -1F, 0.13F, -0.6F, -0.1F); // Box 0
		bodyModel[245].setRotationPoint(-36.65F, -13.65F, -6.15F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F); // Box 289
		bodyModel[246].setRotationPoint(-32.5F, -14.5F, 9.75F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, 0.25F, -0.05F, 0F, 0.005F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 291
		bodyModel[247].setRotationPoint(-30.5F, -15F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.78F, 0F, 0F, -0.85F, -1F, 0F, 0F, -1F, 0F, 0.05F, 0F, 0.001F, -1.05F, 0F, 0.001F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[248].setRotationPoint(-28.5F, -15F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -1.25F, 0F, 0.25F, 1.25F, 0F, 0F, 0.005F, 0F, 0F, 0F, 0F, 0.25F, -1.25F); // Box 293
		bodyModel[249].setRotationPoint(-32.5F, -15F, 9.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.9F, -1.09F, 2.35F, 0F, 0F, 0F, 0F, -1F, 0F, 0.15F, -1.75F, -3.5F, -0.9F, 0.75F, 2.35F, 0F, 0F, 0.005F, 0F, 0F, 0F, 0.15F, 0.75F, -3.5F); // Box 294
		bodyModel[250].setRotationPoint(-36.5F, -14.75F, 8.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.13F, -0.4F, -0.1F, 0.05F, 0.01F, -1F, 0.05F, 0.01F, 0F, 0F, -0.65F, -0.15F, 0.13F, -0.6F, -0.1F, 0.05F, -0.35F, -1F, 0.05F, -0.35F, 0F, 0F, -0.35F, -0.15F); // Box 295
		bodyModel[251].setRotationPoint(-36.65F, -13.65F, 5.15F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.2F, -1F, 0F, -1.48F, 0.25F, 0F, -1.35F, 0F, -0.25F, 0.35F, 0F, -0.25F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.48F, -1.25F, -1F, -0.7F, -1F, -0.1F); // Box 296
		bodyModel[252].setRotationPoint(-36.3F, -13F, 5.25F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.9F, 0F, 2.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, -3.5F, -0.92F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, -3.5F); // Box 297
		bodyModel[253].setRotationPoint(-36.5F, -13F, 8.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.9F, 0F, -0.65F, 0.9F, 0F, -0.65F, -0.15F, 0F, -0.5F, -0.85F, 0F, -0.5F, -1F, 0F, 0.25F, 0.92F, 0F, -0.5F, -0.12F, 0F, -0.5F, 0F, 0F, -1.25F); // Box 298
		bodyModel[254].setRotationPoint(-37.5F, -13F, 5.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1.94F, -0.55F, 0F, -1.92F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.94F, -0.55F, 0F, 1.93F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[255].setRotationPoint(-30.5F, -17F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -1.92F, -0.55F, 0.14F, -1.9F, -0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.93F, -0.55F, 0.14F, 1.92F, -0.55F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[256].setRotationPoint(-29.5F, -17F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.86F, 0.1F, -0.45F, 0F, 0.09F, -0.45F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.86F, -0.08F, -0.45F, 0F, -0.08F, -0.45F); // Box 0
		bodyModel[257].setRotationPoint(-28.5F, -15F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.09F, -0.45F, 0F, 0.06F, -0.45F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.08F, -0.45F, 0F, -0.06F, -0.45F); // Box 0
		bodyModel[258].setRotationPoint(-30.5F, -15F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, 0F, 0F, 0F, 0.255F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, -0.255F, 0.25F, 0F, 0.25F, 0.25F); // Box 0
		bodyModel[259].setRotationPoint(-32.5F, -15F, -9.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -1.995F, -0.5F, 0F, -1.745F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.995F, -0.5F, 0F, 1.745F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[260].setRotationPoint(-31.5F, -17F, -9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, 0.255F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, -0.255F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, -1.25F); // Box 325
		bodyModel[261].setRotationPoint(-32.5F, -15F, 8.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.745F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.745F, -0.5F, 0F, 2F, -0.5F); // Box 326
		bodyModel[262].setRotationPoint(-31.5F, -17F, 0F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -2.25F, -0.5F, 0F, -1.995F, -0.5F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, 2.25F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0.175F, 0F); // Box 0
		bodyModel[263].setRotationPoint(-32.5F, -17F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.175F, 0F, 0F, 0F, 0F, 0F, -1.995F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0.175F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2.25F, -0.5F); // Box 328
		bodyModel[264].setRotationPoint(-32.5F, -17F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.92F, -0.55F, 0F, -1.94F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.93F, -0.55F, 0F, 1.94F, -0.55F); // Box 332
		bodyModel[265].setRotationPoint(-30.5F, -17F, 0F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.14F, -1.9F, -0.55F, 0F, -1.92F, -0.55F, 0F, 0F, 0F, -1F, 0F, 0F, 0.14F, 1.92F, -0.55F, 0F, 1.93F, -0.55F); // Box 333
		bodyModel[266].setRotationPoint(-29.5F, -17F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0.28F, -1.5F, -3.25F, 0F, 0F, 0F, 0F, 0.8F, 0.25F, 0.28F, -1.5F, 0.25F, 0.06F, 1.5F, -3.25F, 0F, 0F, 0F, 0F, -0.8F, 0.25F, 0.06F, 1.5F, 0.25F); // Box 0
		bodyModel[267].setRotationPoint(-36.5F, -14.75F, -8.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.9F, -0.5F, 2.35F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.85F, -0.5F, -3.5F, -1.9F, -0.5F, 2.35F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.85F, -0.5F, -3.5F); // Box 339
		bodyModel[268].setRotationPoint(-37.5F, -13.5F, 8.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0.28F, -1.5F, 0.25F, 0F, 0.8F, 0.25F, 0F, 0F, 0F, 0.28F, -1.5F, -3.25F, 0.06F, 1.5F, 0.25F, 0F, -0.8F, 0.25F, 0F, 0F, 0F, 0.06F, 1.5F, -3.25F); // Box 340
		bodyModel[269].setRotationPoint(-36.5F, -14.75F, 5.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, -1.3F, 0.25F, 0F, -1.3F, 0.25F, 0F, -0.025F, 0F, 0F, -0.35F, 0F, -2F, 1.3F, 0.25F, 0F, 1.3F, 0.25F, 0F, 0.025F, 0F, 0F, 0.35F, 0F); // Box 0
		bodyModel[270].setRotationPoint(-34.5F, -16.85F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -2.375F, 0.25F, 0F, -1.3F, 0.25F, -2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 2.435F, 0.25F, 0F, 1.3F, 0.25F, -2F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 0
		bodyModel[271].setRotationPoint(-34.5F, -16.85F, -5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.025F, 0F, 0F, -1.3F, 0.25F, -2F, -1.3F, 0.25F, 0F, 0.35F, 0F, 0F, 0.025F, 0F, 0F, 1.3F, 0.25F, -2F, 1.3F, 0.25F); // Box 348
		bodyModel[272].setRotationPoint(-34.5F, -16.85F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.35F, 0F, -2F, -0.35F, 0F, 0F, -1.3F, 0.25F, 0F, -2.375F, 0.25F, 0F, 0.35F, 0F, -2F, 0.35F, 0F, 0F, 1.3F, 0.25F, 0F, 2.435F, 0.25F); // Box 349
		bodyModel[273].setRotationPoint(-34.5F, -16.85F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.03F, -2.6F, 0.25F, 0.25F, -1.37F, 0.25F, 0.25F, 0.65F, 0F, 0.03F, -0.42F, 0F, -0.19F, 2.6F, 0.25F, 0.25F, 1.43F, 0.25F, 0.25F, -0.65F, 0F, 0.03F, 0.42F, 0F); // Box 0
		bodyModel[274].setRotationPoint(-36.75F, -15.85F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.03F, -0.42F, 0F, 0.25F, 0.65F, 0F, 0.25F, -1.37F, 0.25F, 0.03F, -2.6F, 0.25F, 0.03F, 0.42F, 0F, 0.25F, -0.65F, 0F, 0.25F, 1.43F, 0.25F, -0.19F, 2.6F, 0.25F); // Box 351
		bodyModel[275].setRotationPoint(-36.75F, -15.85F, 0F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -1.6F, 0.25F, 0F, -1.6F, 0.25F, 0F, 0.58F, 0F, -0.08F, 0.15F, 0F, -1.225F, 1.6F, 0.25F, 0.225F, 1.6F, 0.25F, 0F, -0.58F, 0F, -0.08F, -0.15F, 0F); // Box 0
		bodyModel[276].setRotationPoint(-37.78F, -14.85F, -5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.08F, 0.15F, 0F, 0F, 0.58F, 0F, 0F, -1.6F, 0.25F, -1F, -1.6F, 0.25F, -0.08F, -0.15F, 0F, 0F, -0.58F, 0F, 0.225F, 1.6F, 0.25F, -1.225F, 1.6F, 0.25F); // Box 353
		bodyModel[277].setRotationPoint(-37.78F, -14.85F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.24F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.41F, 0F, 0F, 0.18F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0.41F, -1F, 0F); // Box 103
		bodyModel[278].setRotationPoint(-38F, -12F, -1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.09F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.18F, 0F, -0.5F, -0.04F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.04F, 0F, -1F); // Box 103
		bodyModel[279].setRotationPoint(-38F, -11.5F, -1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.08F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.01F, -1F, 0F, -0.16F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F); // Box 103
		bodyModel[280].setRotationPoint(-38F, -10F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.04F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.04F, 0F, -1F, -0.17F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.08F, 0F, -0.5F); // Box 103
		bodyModel[281].setRotationPoint(-38F, -10.5F, -1.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.24F, 0F, -0.5F, 0.09F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0.18F, -0.5F, -0.5F); // Box 103
		bodyModel[282].setRotationPoint(-38F, -12F, -1.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.17F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.08F, -0.5F, -0.5F, -0.23F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.16F, 0F, -0.5F); // Box 103
		bodyModel[283].setRotationPoint(-38F, -10F, -1.5F);

		bodyModel[284].addShapeBox(0F, -0.6F, -1.2F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TL
		bodyModel[284].setRotationPoint(-37.75F, -10.5F, 0F);

		bodyModel[285].addShapeBox(0F, -0.6F, 0.1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TR
		bodyModel[285].setRotationPoint(-37.75F, -10.5F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, -0.12F, 0F, 0F, 0.12F, 0F, 0F, -0.27F, 0F, -0.25F, 0.27F, 0F, -0.25F); // Box 0
		bodyModel[286].setRotationPoint(-37.5F, -12F, -4.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[287].setRotationPoint(-37.25F, -12F, -1.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.41F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.24F, 0F, 0F, 0.41F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, 0.18F, -0.5F, 0F); // Box 312
		bodyModel[288].setRotationPoint(-38F, -12F, 0F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.18F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.09F, 0F, 0F, -0.04F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.04F, 0F, 0F); // Box 313
		bodyModel[289].setRotationPoint(-38F, -11.5F, 0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.01F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.08F, -0.5F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.16F, 0F, 0F); // Box 314
		bodyModel[290].setRotationPoint(-38F, -10F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.04F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.04F, 0F, 0F, -0.08F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.17F, 0F, 0F); // Box 315
		bodyModel[291].setRotationPoint(-38F, -10.5F, 0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.08F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.17F, -0.5F, 0F, -0.16F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.23F, 0F, 0F); // Box 316
		bodyModel[292].setRotationPoint(-38F, -10F, 0.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.17F, 0F, 0F, 0.17F, 0F, 0F, 0.27F, 0F, -0.25F, -0.27F, 0F, -0.25F, 0.12F, 0F, 0F, -0.12F, 0F, 0F); // Box 317
		bodyModel[293].setRotationPoint(-37.5F, -12F, 1.25F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.24F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.18F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.09F, -0.5F, 0F); // Box 319
		bodyModel[294].setRotationPoint(-38F, -12F, 0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.01F, -0.5F, -0.5F, -0.74F, -0.5F, -0.5F, -1.01F, 0.05F, 0.65F, 0.26F, 0.05F, 0.65F, 0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F, -0.98F, -0.85F, 0.65F, 0.23F, -0.85F, 0.65F); // Box 103
		bodyModel[295].setRotationPoint(-38.43F, -12.15F, -1.65F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.01F, -0.5F, -0.5F, -0.74F, -0.5F, -0.5F, -0.75F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, -0.26F, 0.65F, 0.05F, -0.49F, 0.65F, 0.05F, -0.53F, 0.65F, -0.85F, -0.22F, 0.65F, -0.85F); // Box 103
		bodyModel[296].setRotationPoint(-38.43F, -12.15F, -1.65F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.26F, 0.05F, 0.65F, -1.01F, 0.05F, 0.65F, -0.74F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, 0.23F, -0.85F, 0.65F, -0.98F, -0.85F, 0.65F, -0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 335
		bodyModel[297].setRotationPoint(-38.43F, -12.15F, 0.65F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.57F, 0.65F, 0.05F, -0.18F, 0.65F, 0.05F, -0.22F, 0.65F, -0.85F, -0.53F, 0.65F, -0.85F, -0.62F, -0.5F, -0.5F, -0.13F, -0.5F, -0.5F, -0.18F, -0.65F, -0.35F, -0.57F, -0.65F, -0.35F); // Box 103
		bodyModel[298].setRotationPoint(-38.74F, -9.85F, -1.65F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.74F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.22F, 0.65F, -0.85F, -0.53F, 0.65F, -0.85F, -0.49F, 0.65F, 0.05F, -0.26F, 0.65F, 0.05F); // Box 340
		bodyModel[299].setRotationPoint(-38.43F, -12.15F, 0.65F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.53F, 0.65F, -0.85F, -0.22F, 0.65F, -0.85F, -0.18F, 0.65F, 0.05F, -0.57F, 0.65F, 0.05F, -0.57F, -0.65F, -0.35F, -0.18F, -0.65F, -0.35F, -0.13F, -0.5F, -0.5F, -0.62F, -0.5F, -0.5F); // Box 341
		bodyModel[300].setRotationPoint(-38.74F, -9.85F, 0.65F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F, -0.82F, -0.85F, 0.65F, 0.07F, -0.85F, 0.65F, -0.05F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.79F, 0.05F, 0.65F, 0.04F, 0.05F, 0.65F); // Box 103
		bodyModel[301].setRotationPoint(-38.17F, -9.85F, -1.65F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.85F, 0.65F, -0.82F, -0.85F, 0.65F, -0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0.04F, 0.05F, 0.65F, -0.79F, 0.05F, 0.65F, -0.7F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F); // Box 345
		bodyModel[302].setRotationPoint(-38.17F, -9.85F, 0.65F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.27F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.21F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0.4F, -1F, 0F); // Box 103
		bodyModel[303].setRotationPoint(-37.45F, -8F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.14F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.21F, 0F, -0.5F, 0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.01F, 0F, -1F); // Box 103
		bodyModel[304].setRotationPoint(-37.45F, -7.5F, -1.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.04F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.01F, -1F, 0F, -0.12F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F); // Box 103
		bodyModel[305].setRotationPoint(-37.45F, -6F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.01F, 0F, -1F, -0.11F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.04F, 0F, -0.5F); // Box 103
		bodyModel[306].setRotationPoint(-37.45F, -6.5F, -1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.27F, 0F, -0.5F, 0.14F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0.21F, -0.5F, -0.5F); // Box 103
		bodyModel[307].setRotationPoint(-37.45F, -8F, -1.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.11F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.04F, -0.5F, -0.5F, -0.17F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.12F, 0F, -0.5F); // Box 103
		bodyModel[308].setRotationPoint(-37.45F, -6F, -1.5F);

		bodyModel[309].addShapeBox(0F, -0.6F, -1.2F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TL
		bodyModel[309].setRotationPoint(-37.2F, -6.5F, 0F);

		bodyModel[310].addShapeBox(0F, -0.6F, 0.1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TR
		bodyModel[310].setRotationPoint(-37.2F, -6.5F, 0F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.54F, 0F, -0.25F, 0.54F, 0F, -0.25F, -0.12F, 0F, 0F, 0.12F, 0F, 0F, -0.17F, 0F, -0.25F, 0.17F, 0F, -0.25F); // Box 0
		bodyModel[311].setRotationPoint(-37.11F, -8F, -4.25F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[312].setRotationPoint(-36.7F, -8F, -1.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.03F, -0.5F, -0.5F, -0.78F, -0.5F, -0.5F, -1F, 0.05F, 0.65F, 0.25F, 0.05F, 0.65F, 0.03F, -0.35F, -0.65F, -0.78F, -0.35F, -0.65F, -0.97F, -0.85F, 0.65F, 0.22F, -0.85F, 0.65F); // Box 103
		bodyModel[313].setRotationPoint(-37.88F, -8.15F, -1.65F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.03F, -0.5F, -0.5F, -0.78F, -0.5F, -0.5F, -0.78F, -0.65F, -0.35F, 0.03F, -0.65F, -0.35F, -0.19F, 0.65F, 0.05F, -0.56F, 0.65F, 0.05F, -0.58F, 0.65F, -0.85F, -0.17F, 0.65F, -0.85F); // Box 103
		bodyModel[314].setRotationPoint(-37.88F, -8.15F, -1.65F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.65F, 0.05F, -0.25F, 0.65F, 0.05F, -0.27F, 0.65F, -0.85F, -0.48F, 0.65F, -0.85F, -0.58F, -0.5F, -0.5F, -0.17F, -0.5F, -0.5F, -0.22F, -0.65F, -0.35F, -0.53F, -0.65F, -0.35F); // Box 103
		bodyModel[315].setRotationPoint(-38.19F, -5.85F, -1.65F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.04F, -0.35F, -0.65F, -0.79F, -0.35F, -0.65F, -0.82F, -0.85F, 0.65F, 0.07F, -0.85F, 0.65F, -0.01F, -0.5F, -0.5F, -0.74F, -0.5F, -0.5F, -0.79F, 0.05F, 0.65F, 0.04F, 0.05F, 0.65F); // Box 103
		bodyModel[316].setRotationPoint(-37.62F, -5.85F, -1.65F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.12F, 0F, 0.25F, 0.12F, 0F, 0.25F, -0.49F, 0F, 0F, 0.49F, 0F, 0F, -0.22F, 0F, 0.25F, 0.22F, 0F, 0.25F, -0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 0
		bodyModel[317].setRotationPoint(-37.5F, -9F, -4F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.11F, 0F, 0.25F, 0.11F, 0F, 0.25F, -0.34F, 0F, 0F, 0.34F, 0F, 0F, -0.6F, 0F, 0.25F, 0.6F, 0F, 0.25F, 0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 0
		bodyModel[318].setRotationPoint(-37.1F, -5F, -4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.12F, 0F, 0.25F, 0.12F, 0F, 0.25F, -0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.41F, 0F, 0.25F, 0.41F, 0F, 0.25F, -0.04F, 0F, 0F, 0.04F, 0F, 0F); // Box 0
		bodyModel[319].setRotationPoint(-37.4F, -8F, -4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.49F, 0F, 0F, -0.49F, 0F, 0F, 0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.22F, 0F, 0.25F, -0.22F, 0F, 0.25F); // Box 380
		bodyModel[320].setRotationPoint(-37.5F, -9F, 0F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.34F, 0F, 0F, -0.34F, 0F, 0F, 0.11F, 0F, 0.25F, -0.11F, 0F, 0.25F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.6F, 0F, 0.25F, -0.6F, 0F, 0.25F); // Box 381
		bodyModel[321].setRotationPoint(-37.1F, -5F, 0F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, 0.04F, 0F, 0F, -0.04F, 0F, 0F, 0.41F, 0F, 0.25F, -0.41F, 0F, 0.25F); // Box 382
		bodyModel[322].setRotationPoint(-37.4F, -8F, 0F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.54F, 0F, -0.25F, -0.54F, 0F, -0.25F, -0.17F, 0F, 0F, 0.17F, 0F, 0F, 0.17F, 0F, -0.25F, -0.17F, 0F, -0.25F, 0.12F, 0F, 0F, -0.12F, 0F, 0F); // Box 383
		bodyModel[323].setRotationPoint(-37.11F, -8F, 1.25F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.27F, 0F, 0F, 0.4F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, 0.21F, -0.5F, 0F); // Box 384
		bodyModel[324].setRotationPoint(-37.45F, -8F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.21F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.14F, 0F, 0F, 0.01F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.01F, 0F, 0F); // Box 385
		bodyModel[325].setRotationPoint(-37.45F, -7.5F, 0.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.01F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.04F, -0.5F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.12F, 0F, 0F); // Box 386
		bodyModel[326].setRotationPoint(-37.45F, -6F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0.01F, 0F, 0F, -0.04F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.11F, 0F, 0F); // Box 387
		bodyModel[327].setRotationPoint(-37.45F, -6.5F, 0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.27F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.2F, 0F, 0F, 0.21F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.14F, -0.5F, 0F); // Box 388
		bodyModel[328].setRotationPoint(-37.45F, -8F, 0.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.04F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.11F, -0.5F, 0F, -0.12F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.17F, 0F, 0F); // Box 389
		bodyModel[329].setRotationPoint(-37.45F, -6F, 0.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.05F, 0.65F, -1F, 0.05F, 0.65F, -0.78F, -0.5F, -0.5F, 0.03F, -0.5F, -0.5F, 0.22F, -0.85F, 0.65F, -0.97F, -0.85F, 0.65F, -0.78F, -0.35F, -0.65F, 0.03F, -0.35F, -0.65F); // Box 390
		bodyModel[330].setRotationPoint(-37.88F, -8.15F, 0.65F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.03F, -0.65F, -0.35F, -0.78F, -0.65F, -0.35F, -0.78F, -0.5F, -0.5F, 0.03F, -0.5F, -0.5F, -0.17F, 0.65F, -0.85F, -0.58F, 0.65F, -0.85F, -0.56F, 0.65F, 0.05F, -0.19F, 0.65F, 0.05F); // Box 391
		bodyModel[331].setRotationPoint(-37.88F, -8.15F, 0.65F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.48F, 0.65F, -0.85F, -0.27F, 0.65F, -0.85F, -0.25F, 0.65F, 0.05F, -0.5F, 0.65F, 0.05F, -0.53F, -0.65F, -0.35F, -0.22F, -0.65F, -0.35F, -0.17F, -0.5F, -0.5F, -0.58F, -0.5F, -0.5F); // Box 392
		bodyModel[332].setRotationPoint(-38.19F, -5.85F, 0.65F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.85F, 0.65F, -0.82F, -0.85F, 0.65F, -0.79F, -0.35F, -0.65F, 0.04F, -0.35F, -0.65F, 0.04F, 0.05F, 0.65F, -0.79F, 0.05F, 0.65F, -0.74F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F); // Box 393
		bodyModel[333].setRotationPoint(-37.62F, -5.85F, 0.65F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, -0.25F, 0.54F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0.54F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[334].setRotationPoint(-39.5F, 1F, -3F);

		bodyModel[335].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[335].setRotationPoint(-37.84F, -10.25F, -3.6F);
		bodyModel[335].rotateAngleY = 0.15707963F;
		bodyModel[335].rotateAngleZ = 0.10471976F;

		bodyModel[336].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363 markerlight glow
		bodyModel[336].setRotationPoint(-37.86F, -10.25F, 3.6F);
		bodyModel[336].rotateAngleY = -0.15707963F;
		bodyModel[336].rotateAngleZ = 0.10471976F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[337].setRotationPoint(-38.4F, -8.5F, -3.8F);
		bodyModel[337].rotateAngleX = 0.03490659F;
		bodyModel[337].rotateAngleY = 0.15707963F;
		bodyModel[337].rotateAngleZ = 0.10646508F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[338].setRotationPoint(-38.4F, -8.5F, 3.8F);
		bodyModel[338].rotateAngleX = -0.03490659F;
		bodyModel[338].rotateAngleY = -0.15707963F;
		bodyModel[338].rotateAngleZ = 0.10646508F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		bodyModel[339].setRotationPoint(-36.76F, -10.75F, -6.02F);
		bodyModel[339].rotateAngleY = -0.70511302F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[340].setRotationPoint(-36.11F, -10.75F, 5.26F);
		bodyModel[340].rotateAngleY = 0.70860368F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372 glow
		bodyModel[341].setRotationPoint(-36.77F, -10.75F, 6.03F);
		bodyModel[341].rotateAngleY = 0.70860368F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362 glow
		bodyModel[342].setRotationPoint(-36.76F, -10.75F, -6.03F);
		bodyModel[342].rotateAngleY = -0.70511302F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[343].setRotationPoint(-25.5F, -21.62F, 6.8F);
		bodyModel[343].rotateAngleX = -0.32288591F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[344].setRotationPoint(-27.5F, -21.94F, 5.85F);
		bodyModel[344].rotateAngleX = -0.32288591F;

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[345].setRotationPoint(-25.5F, -21.3F, -7.75F);
		bodyModel[345].rotateAngleX = 0.32288591F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[346].setRotationPoint(-25.5F, -21.62F, -6.8F);
		bodyModel[346].rotateAngleX = 0.32288591F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 5, 7, 20, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.49F); // Box 0
		bodyModel[347].setRotationPoint(-28.5F, -7F, -10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.14F); // Box 0
		bodyModel[348].setRotationPoint(-28.35F, -14F, -10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, -0.95F, -0.315F, -0.35F, -0.95F, -0.315F, -0.35F, 0.15F, 0F, 0.15F, 1F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.15F, 0F, 0F); // Box 0
		bodyModel[349].setRotationPoint(-28.35F, -16F, -10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.21F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0.21F, 0F, -0.7F); // Box 386
		bodyModel[350].setRotationPoint(-27.5F, -19F, 8.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[351].setRotationPoint(-27.35F, -13F, -4F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[352].setRotationPoint(-27.35F, -8F, -10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[353].setRotationPoint(-27.35F, -8F, 4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0.15F, 1F, 0F, -0.35F, 0.15F, 0F, -0.35F, -0.95F, -0.315F, -1F, -0.95F, -0.315F, 0.15F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F); // Box 390
		bodyModel[354].setRotationPoint(-28.35F, -16F, 0F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 389
		bodyModel[355].setRotationPoint(-26.7F, -14F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[356].setRotationPoint(-26.7F, -14F, 2F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 389
		bodyModel[357].setRotationPoint(-26.7F, -11F, 0F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		bodyModel[358].setRotationPoint(-26.25F, -14.5F, 2.75F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[359].setRotationPoint(-27.64F, -18.5F, 3F);
		bodyModel[359].rotateAngleY = -1.22173048F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[360].setRotationPoint(-27.35F, -14F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[361].setRotationPoint(-26.69F, -14.5F, 4.75F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[362].setRotationPoint(-27.35F, -13F, 4.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[363].setRotationPoint(-26.7F, -13F, 4.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[364].setRotationPoint(-26.05F, -12.75F, 5.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[365].setRotationPoint(-27.35F, -13F, 7.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.5F, -1F, 0F, -0.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1F, 0F, -0.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		bodyModel[366].setRotationPoint(-26.35F, -13F, 8F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[367].setRotationPoint(-26.7F, -14.75F, 8.25F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 389
		bodyModel[368].setRotationPoint(-26.58F, -14.5F, 6.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[369].setRotationPoint(-1.5F, -4F, -3.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[370].setRotationPoint(-1.5F, -4F, -5.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[371].setRotationPoint(-1.5F, -4F, 3.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[372].setRotationPoint(15.5F, -4F, 3.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[373].setRotationPoint(-1.5F, -13F, -3.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[374].setRotationPoint(-0.7F, -15F, -2.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[375].setRotationPoint(-0.4F, -15F, -3.83F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[376].setRotationPoint(1.98F, -15F, -3.83F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[377].setRotationPoint(4.36F, -15F, -3.83F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[378].setRotationPoint(6.71F, -15F, -3.83F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[379].setRotationPoint(9.08F, -15F, -3.83F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[380].setRotationPoint(11.46F, -15F, -3.83F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[381].setRotationPoint(13.84F, -15F, -3.83F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[382].setRotationPoint(16.22F, -15F, -3.83F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[383].setRotationPoint(-0.7F, -17F, -3.83F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[384].setRotationPoint(1.68F, -17F, -3.83F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[385].setRotationPoint(-1.5F, -10F, -4.83F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[386].setRotationPoint(4.06F, -17F, -3.83F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[387].setRotationPoint(6.41F, -17F, -3.83F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[388].setRotationPoint(8.78F, -17F, -3.83F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[389].setRotationPoint(11.16F, -17F, -3.83F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[390].setRotationPoint(13.54F, -17F, -3.83F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[391].setRotationPoint(15.9F, -17F, -3.83F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, 0F, -4.37F, 0F, 0F, -4.37F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -4.37F, -1F, 0F, -4.37F, -1F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[392].setRotationPoint(-3.5F, -15F, 2.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[393].setRotationPoint(-1.5F, -17F, 2.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.63F, -0.25F, 0F, -0.63F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 394
		bodyModel[394].setRotationPoint(15.13F, -15F, 2.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[395].setRotationPoint(17.5F, -4.75F, 0F);
		bodyModel[395].rotateAngleX = -0.78539816F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[396].setRotationPoint(19.5F, -5F, -2.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[397].setRotationPoint(19.5F, -6F, -2.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[398].setRotationPoint(20.5F, -4.75F, -1.8F);
		bodyModel[398].rotateAngleX = -0.78539816F;

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[399].setRotationPoint(22.5F, -5.5F, -4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[400].setRotationPoint(22.5F, -6.5F, -4F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[401].setRotationPoint(20.5F, -3.3F, -3.25F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 12, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[402].setRotationPoint(19.5F, -19F, -8.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[403].setRotationPoint(19.5F, -19F, -10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[404].setRotationPoint(19.5F, -19F, 8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[405].setRotationPoint(19.5F, -21F, -2.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[406].setRotationPoint(19.5F, -21F, -8.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[407].setRotationPoint(19.5F, -21F, 2.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[408].setRotationPoint(8.5F, -10F, 9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 444
		bodyModel[409].setRotationPoint(8.5F, -9.5F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[410].setRotationPoint(25.5F, -7F, 9F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[411].setRotationPoint(31.5F, -7F, 9F);

		bodyModel[412].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 0
		bodyModel[412].setRotationPoint(32.9F, -4F, 7.5F);
		bodyModel[412].rotateAngleY = -1.04719755F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[413].setRotationPoint(33.5F, -20F, -5F);

		bodyModel[414].addShapeBox(-1F, 0F, -1F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[414].setRotationPoint(26.5F, -10.5F, -4.5F);
		bodyModel[414].rotateAngleY = -0.78539816F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[415].setRotationPoint(29.5F, -7F, -4F);

		bodyModel[416].addBox(0F, 0F, 0F, 5, 9, 4, 0F); // Box 0
		bodyModel[416].setRotationPoint(-8F, -9F, -2F);

		bodyModel[417].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 0
		bodyModel[417].setRotationPoint(-8F, -5F, -6F);

		bodyModel[418].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 0
		bodyModel[418].setRotationPoint(-8F, -5F, 2F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[419].setRotationPoint(-8F, -9F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[420].setRotationPoint(-8F, -9F, 2F);

		bodyModel[421].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[421].setRotationPoint(-11F, -1F, -2.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[422].setRotationPoint(-3F, -3.7F, 0F);
		bodyModel[422].rotateAngleX = -0.78539816F;

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[423].setRotationPoint(-11.5F, -2.3F, -2.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[424].setRotationPoint(-11.5F, -4.3F, -1.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[425].setRotationPoint(-11.5F, -4.3F, -2.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[426].setRotationPoint(-11.5F, -4.3F, 1.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[427].setRotationPoint(-11.5F, -7.3F, -1F);

		bodyModel[428].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[428].setRotationPoint(-10.5F, -3.3F, 2F);
		bodyModel[428].rotateAngleX = -1.10828408F;

		bodyModel[429].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[429].setRotationPoint(-10.5F, -3.3F, -2F);
		bodyModel[429].rotateAngleX = 1.10828408F;

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[430].setRotationPoint(-11.85F, -7.5F, -0.7F);
		bodyModel[430].rotateAngleY = 0.78539816F;

		bodyModel[431].addShapeBox(0F, -0.5F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[431].setRotationPoint(-5.5F, -20.5F, 2.5F);

		bodyModel[432].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[432].setRotationPoint(-8F, -11.21F, -4.79F);
		bodyModel[432].rotateAngleX = -0.78539816F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[433].setRotationPoint(-8F, -9.79F, -3.37F);
		bodyModel[433].rotateAngleX = -0.78539816F;

		bodyModel[434].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[434].setRotationPoint(-9F, -4F, -1F);

		bodyModel[435].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[435].setRotationPoint(-9F, -6F, 1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[436].setRotationPoint(-10.1F, -3.5F, 4F);
		bodyModel[436].rotateAngleY = -0.78539816F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[437].setRotationPoint(-9.4F, -3.5F, -4.7F);
		bodyModel[437].rotateAngleY = 0.78539816F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[438].setRotationPoint(-9F, -4F, 1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[439].setRotationPoint(-9F, -4F, -4F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[440].setRotationPoint(-9F, -9F, 1F);

		bodyModel[441].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[441].setRotationPoint(-9F, -9F, -4F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[442].setRotationPoint(-9F, -11.21F, -4.79F);
		bodyModel[442].rotateAngleX = -0.78539816F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[443].setRotationPoint(-9F, -9F, -6F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[444].setRotationPoint(-9F, -11F, -4F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[445].setRotationPoint(-9.5F, -2.99F, 0F);
		bodyModel[445].rotateAngleX = -0.78539816F;

		bodyModel[446].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[446].setRotationPoint(-7.5F, -16F, 2.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[447].setRotationPoint(-7.5F, -14F, 0.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[448].setRotationPoint(-7.5F, -14F, 5.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[449].setRotationPoint(-7.51F, -16F, 0.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[450].setRotationPoint(-8F, -1F, -6F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 486
		bodyModel[451].setRotationPoint(-8F, -1F, 2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[452].setRotationPoint(-5.51F, -12F, 0.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[453].setRotationPoint(-11F, -15.25F, 2F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[454].setRotationPoint(-8F, -15.37F, 4F);
		bodyModel[454].rotateAngleX = -0.78539816F;

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[455].setRotationPoint(-11F, -16.25F, 4F);
		bodyModel[455].rotateAngleX = -0.78539816F;

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[456].setRotationPoint(-3.5F, -17F, -0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[457].setRotationPoint(-7.5F, -17F, -0.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		bodyModel[458].setRotationPoint(-7.5F, -15F, -0.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 0
		bodyModel[459].setRotationPoint(-34.25F, -0.5F, -8.2F);
		bodyModel[459].rotateAngleY = -0.54105207F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 0
		bodyModel[460].setRotationPoint(-33.94F, -0.5F, 7.69F);
		bodyModel[460].rotateAngleY = 0.54105207F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Large single headlight T
		bodyModel[461].setRotationPoint(-37.75F, -11.4F, -0.9F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Large single headlight B
		bodyModel[462].setRotationPoint(-37.2F, -7.4F, -0.9F);

		bodyModel[463].addShapeBox(0F, 0.1F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TB
		bodyModel[463].setRotationPoint(-37.75F, -10.5F, 0F);

		bodyModel[464].addShapeBox(0F, -1.2F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight TT
		bodyModel[464].setRotationPoint(-37.75F, -10.5F, 0F);

		bodyModel[465].addShapeBox(0F, 0.1F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BB
		bodyModel[465].setRotationPoint(-37.2F, -6.5F, 0F);

		bodyModel[466].addShapeBox(0F, -1.2F, -0.6F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Headlight BT
		bodyModel[466].setRotationPoint(-37.2F, -6.5F, 0F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[467].setRotationPoint(37.5F, -9F, -9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[468].setRotationPoint(37.5F, -21F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 509
		bodyModel[469].setRotationPoint(-36.5F, 2F, -10F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0F, 0F, 3F); // Box 0
		bodyModel[470].setRotationPoint(-36.5F, 3F, -10F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[471].setRotationPoint(-38.5F, 2F, -6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[472].setRotationPoint(-37.5F, 2F, -7F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[473].setRotationPoint(-39F, 1.5F, -6F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[474].setRotationPoint(-38F, 1.5F, -7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[475].setRotationPoint(-39.25F, 8F, -6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[476].setRotationPoint(-39.5F, 6F, -6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[477].setRotationPoint(-38.5F, 6F, -7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[478].setRotationPoint(-38.25F, 8F, -7F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 510
		bodyModel[479].setRotationPoint(-38.5F, 2F, 0F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 511
		bodyModel[480].setRotationPoint(-37.5F, 2F, 6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 512
		bodyModel[481].setRotationPoint(-39F, 1.5F, 0F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 513
		bodyModel[482].setRotationPoint(-38F, 1.5F, 6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 514
		bodyModel[483].setRotationPoint(-39.25F, 8F, 0F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F); // Box 515
		bodyModel[484].setRotationPoint(-39.5F, 6F, 0F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F); // Box 516
		bodyModel[485].setRotationPoint(-38.5F, 6F, 6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 517
		bodyModel[486].setRotationPoint(-38.25F, 8F, 6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 518
		bodyModel[487].setRotationPoint(-36.5F, 2F, 9F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 3F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0F, 0F, -3F); // Box 519
		bodyModel[488].setRotationPoint(-36.5F, 3F, 9F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, 2.68F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0F, 0F, -2.39F, 0F, 0F, 2.68F, 0F, 0F, 0.59F, 0F, 0F, -0.59F, 0F, 0F, -2.39F); // Box 512
		bodyModel[489].setRotationPoint(-35.5F, -7F, 7.99F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, -2.39F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0F, 0F, 2.68F, 0F, 0F, -2.39F, 0F, 0F, -0.59F, 0F, 0F, 0.59F, 0F, 0F, 2.68F); // Box 517
		bodyModel[490].setRotationPoint(-35.5F, -7F, -9.99F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[491].setRotationPoint(-31.5F, 2F, 10F);
		bodyModel[491].rotateAngleY = 0.31852259F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[492].setRotationPoint(-31.5F, 2F, -10F);
		bodyModel[492].rotateAngleY = -0.31852259F;

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[493].setRotationPoint(-38.15F, -8.25F, -2F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 glow
		bodyModel[494].setRotationPoint(-38.16F, -8.25F, -2F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 glow
		bodyModel[495].setRotationPoint(-38.16F, -8.25F, -1.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[496].setRotationPoint(-37.6F, -4.25F, -2F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 glow
		bodyModel[497].setRotationPoint(-37.61F, -4.25F, -2F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 glow
		bodyModel[498].setRotationPoint(-37.61F, -4.25F, -1.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[499].setRotationPoint(-27.04F, -18.28F, -10.75F);
		bodyModel[499].rotateAngleX = -0.28797933F;
		bodyModel[499].rotateAngleZ = -0.20943951F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 239, 7, textureX, textureY); // Box 0
		bodyModel[501] = new ModelRendererTurbo(this, 242, 5, textureX, textureY); // Box 529
		bodyModel[502] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 530
		bodyModel[503] = new ModelRendererTurbo(this, 240, 2, textureX, textureY); // Box 531
		bodyModel[504] = new ModelRendererTurbo(this, 69, 35, textureX, textureY); // Box 80
		bodyModel[505] = new ModelRendererTurbo(this, 72, 36, textureX, textureY); // Box 80
		bodyModel[506] = new ModelRendererTurbo(this, 65, 12, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[507] = new ModelRendererTurbo(this, 65, 9, textureX, textureY, BoxName.lamp); // beacon 1 R
		bodyModel[508] = new ModelRendererTurbo(this, 66, 47, textureX, textureY, "cull"); // Box 612 cull
		bodyModel[509] = new ModelRendererTurbo(this, 66, 44, textureX, textureY, BoxName.lamp); // beacon 1 L
		bodyModel[510] = new ModelRendererTurbo(this, 13, 83, textureX, textureY); // Box 0
		bodyModel[511] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 537
		bodyModel[512] = new ModelRendererTurbo(this, 232, 59, textureX, textureY); // Box 0
		bodyModel[513] = new ModelRendererTurbo(this, 222, 59, textureX, textureY); // Box 0
		bodyModel[514] = new ModelRendererTurbo(this, 214, 59, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 217, 59, textureX, textureY); // Box 0
		bodyModel[516] = new ModelRendererTurbo(this, 211, 59, textureX, textureY); // Box 0
		bodyModel[517] = new ModelRendererTurbo(this, 227, 59, textureX, textureY); // Box 0
		bodyModel[518] = new ModelRendererTurbo(this, 232, 17, textureX, textureY); // Box 549
		bodyModel[519] = new ModelRendererTurbo(this, 222, 17, textureX, textureY); // Box 550
		bodyModel[520] = new ModelRendererTurbo(this, 214, 17, textureX, textureY); // Box 551
		bodyModel[521] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 552
		bodyModel[522] = new ModelRendererTurbo(this, 211, 17, textureX, textureY); // Box 553
		bodyModel[523] = new ModelRendererTurbo(this, 227, 17, textureX, textureY); // Box 554
		bodyModel[524] = new ModelRendererTurbo(this, 64, 18, textureX, textureY); // Box 88
		bodyModel[525] = new ModelRendererTurbo(this, 66, 15, textureX, textureY); // Box 88
		bodyModel[526] = new ModelRendererTurbo(this, 64, 21, textureX, textureY); // Box 88
		bodyModel[527] = new ModelRendererTurbo(this, 214, 38, textureX, textureY); // Box 372
		bodyModel[528] = new ModelRendererTurbo(this, 215, 42, textureX, textureY, BoxName.lamp); // Box 372 glow
		bodyModel[529] = new ModelRendererTurbo(this, 214, 80, textureX, textureY); // Box 362
		bodyModel[530] = new ModelRendererTurbo(this, 215, 84, textureX, textureY, BoxName.lamp); // Box 362 glow
		bodyModel[531] = new ModelRendererTurbo(this, 19, 90, textureX, textureY, BoxName.lamp); // Box 362 markerlight glow
		bodyModel[532] = new ModelRendererTurbo(this, 1, 90, textureX, textureY, BoxName.lamp); // Box 363 markerlight glow
		bodyModel[533] = new ModelRendererTurbo(this, 225, 44, textureX, textureY); // Box 481
		bodyModel[534] = new ModelRendererTurbo(this, 82, 1, textureX, textureY); // Box 82
		bodyModel[535] = new ModelRendererTurbo(this, 82, 5, textureX, textureY); // Box 561
		bodyModel[536] = new ModelRendererTurbo(this, 64, 34, textureX, textureY); // Box 409 commander base
		bodyModel[537] = new ModelRendererTurbo(this, 64, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[538] = new ModelRendererTurbo(this, 272, 2, textureX, textureY); // Box 565
		bodyModel[539] = new ModelRendererTurbo(this, 310, 19, textureX, textureY); // Box 566
		bodyModel[540] = new ModelRendererTurbo(this, 75, 33, textureX, textureY); // Box 88
		bodyModel[541] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 88
		bodyModel[542] = new ModelRendererTurbo(this, 80, 33, textureX, textureY); // Box 88
		bodyModel[543] = new ModelRendererTurbo(this, 80, 30, textureX, textureY); // Box 88
		bodyModel[544] = new ModelRendererTurbo(this, 21, 44, textureX, textureY); // Box 562
		bodyModel[545] = new ModelRendererTurbo(this, 14, 44, textureX, textureY); // Box 563
		bodyModel[546] = new ModelRendererTurbo(this, 172, 107, textureX, textureY); // Box 565
		bodyModel[547] = new ModelRendererTurbo(this, 252, 187, textureX, textureY); // Box 0
		bodyModel[548] = new ModelRendererTurbo(this, 286, 62, textureX, textureY); // Box 0
		bodyModel[549] = new ModelRendererTurbo(this, 286, 20, textureX, textureY); // Box 550
		bodyModel[550] = new ModelRendererTurbo(this, 300, 53, textureX, textureY); // Box 0
		bodyModel[551] = new ModelRendererTurbo(this, 300, 11, textureX, textureY); // Box 552
		bodyModel[552] = new ModelRendererTurbo(this, 115, 207, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 554
		bodyModel[554] = new ModelRendererTurbo(this, 246, 42, textureX, textureY); // Box 0
		bodyModel[555] = new ModelRendererTurbo(this, 246, 1, textureX, textureY); // Box 556
		bodyModel[556] = new ModelRendererTurbo(this, 305, 53, textureX, textureY); // Box 0
		bodyModel[557] = new ModelRendererTurbo(this, 305, 11, textureX, textureY); // Box 558
		bodyModel[558] = new ModelRendererTurbo(this, 88, 199, textureX, textureY); // Box 0
		bodyModel[559] = new ModelRendererTurbo(this, 54, 200, textureX, textureY); // Box 389
		bodyModel[560] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 389
		bodyModel[561] = new ModelRendererTurbo(this, 85, 207, textureX, textureY); // Box 0
		bodyModel[562] = new ModelRendererTurbo(this, 79, 186, textureX, textureY); // Box 0
		bodyModel[563] = new ModelRendererTurbo(this, 4, 183, textureX, textureY); // Box 0
		bodyModel[564] = new ModelRendererTurbo(this, 235, 127, textureX, textureY); // Box 566
		bodyModel[565] = new ModelRendererTurbo(this, 235, 143, textureX, textureY); // Box 0
		bodyModel[566] = new ModelRendererTurbo(this, 490, 67, textureX, textureY); // Box 128
		bodyModel[567] = new ModelRendererTurbo(this, 471, 67, textureX, textureY); // Box 567

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F, 0F, 0.27F, 0F); // Box 0
		bodyModel[500].setRotationPoint(-27.1F, -18F, 9.79F);
		bodyModel[500].rotateAngleX = 0.28797933F;
		bodyModel[500].rotateAngleZ = -0.20943951F;

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.21F, 0F, 1.2F, -0.21F, 0F, 1.2F, -0.21F, 0F, -1.2F, 0F, 0F, -1.2F, 0.85F, 0.05F, 0.28F, -0.85F, 0.05F, 0.28F, -0.85F, 0.05F, -0.28F, 0.65F, 0.05F, -0.28F); // Box 529
		bodyModel[501].setRotationPoint(-27.5F, -18F, 10F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.85F, 0.05F, 0.22F, 0.85F, 0.05F, 0.22F); // Box 530
		bodyModel[502].setRotationPoint(-27.5F, -19F, 8.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0.3F, 0.21F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 531
		bodyModel[503].setRotationPoint(-27.5F, -19F, 8.5F);

		bodyModel[504].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[504].setRotationPoint(-24F, -24F, -1F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[505].setRotationPoint(-24F, -23F, -1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 cull
		bodyModel[506].setRotationPoint(-26.5F, -20F, 8.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // beacon 1 R
		bodyModel[507].setRotationPoint(-26.5F, -21.01F, 9F);
		bodyModel[507].rotateAngleY = -0.78539816F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612 cull
		bodyModel[508].setRotationPoint(-26.5F, -20F, -9.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F); // beacon 1 L
		bodyModel[509].setRotationPoint(-26.7F, -21.01F, -9.22F);
		bodyModel[509].rotateAngleY = -0.78539816F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-0.01F, -2F, 0.25F, 0.01F, -2F, 0.25F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.09F, 2F, 0.17F, 0.09F, 2F, 0.17F, -1.06F, 0F, 0F, 1.06F, 0F, 0F); // Box 0
		bodyModel[510].setRotationPoint(-37.51F, -14F, -5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.01F, -2F, 0.25F, -0.01F, -2F, 0.25F, 1.06F, 0F, 0F, -1.06F, 0F, 0F, 0.09F, 2F, 0.17F, -0.09F, 2F, 0.17F); // Box 537
		bodyModel[511].setRotationPoint(-37.51F, -14F, 0F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1.25F, 0F, 1F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1.25F); // Box 0
		bodyModel[512].setRotationPoint(-32.5F, -14.5F, -10.76F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.06F, -0.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, -0.5F, 1.75F, 0.06F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 1.75F); // Box 0
		bodyModel[513].setRotationPoint(-36.58F, -13F, -7.75F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.13F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.13F, -0.5F, 0.75F); // Box 0
		bodyModel[514].setRotationPoint(-37.64F, -12.5F, -6F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.06F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, 1.75F, 0.06F, -0.5F, -1.84F, 0F, -1F, 0F, 0F, -1F, 0F, 0.06F, -0.5F, 1.84F); // Box 0
		bodyModel[515].setRotationPoint(-36.58F, -12F, -7.75F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.13F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0.75F, -0.22F, 0F, -0.83F, 0F, -0.5F, -0.09F, 0F, -0.5F, 0.09F, -0.22F, 0F, 0.83F); // Box 0
		bodyModel[516].setRotationPoint(-37.64F, -12F, -6F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.08F, -0.5F, -1.76F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.5F, 1.76F, 0.08F, 0.5F, -1.76F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, 0.5F, 1.76F); // Box 0
		bodyModel[517].setRotationPoint(-34.5F, -13.5F, -9.51F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.25F, 0F, 1F, 1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1.25F); // Box 549
		bodyModel[518].setRotationPoint(-32.5F, -14.5F, 10.76F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.06F, -0.5F, 1.74F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, -0.5F, -1.74F, 0.06F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, -1.75F); // Box 550
		bodyModel[519].setRotationPoint(-36.58F, -13F, 7.75F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, -1F, 0F, 0.01F, -0.13F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.13F, -0.5F, -0.75F); // Box 551
		bodyModel[520].setRotationPoint(-37.64F, -12.5F, 6F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.06F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.06F, 0F, -1.75F, 0.06F, -0.5F, 1.84F, 0F, -1F, 0F, 0F, -1F, 0F, 0.06F, -0.5F, -1.84F); // Box 552
		bodyModel[521].setRotationPoint(-36.58F, -12F, 7.75F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.13F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, -0.75F, -0.22F, 0F, 0.83F, 0F, -0.5F, 0.09F, 0F, -0.5F, -0.09F, -0.22F, 0F, -0.83F); // Box 553
		bodyModel[522].setRotationPoint(-37.64F, -12F, 6F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.08F, -0.5F, 1.76F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.5F, -1.76F, 0.08F, 0.5F, 1.76F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, 0.5F, -1.76F); // Box 554
		bodyModel[523].setRotationPoint(-34.5F, -13.5F, 9.51F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[524].setRotationPoint(-27.5F, -22.57F, 7.12F);
		bodyModel[524].rotateAngleX = -0.32288591F;

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[525].setRotationPoint(-26.5F, -22.25F, 8.07F);
		bodyModel[525].rotateAngleX = -0.32288591F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[526].setRotationPoint(-27F, -22.89F, 6.17F);
		bodyModel[526].rotateAngleX = -0.32288591F;

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.66F, -0.25F, -0.5F, -0.66F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[527].setRotationPoint(-36.11F, -10.75F, 5.26F);
		bodyModel[527].rotateAngleY = 0.70860368F;

		bodyModel[528].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372 glow
		bodyModel[528].setRotationPoint(-36.76F, -10.75F, 6.03F);
		bodyModel[528].rotateAngleY = 0.70860368F;

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.57F, 0F, -0.5F, -0.57F); // Box 362
		bodyModel[529].setRotationPoint(-36.76F, -10.75F, -6.02F);
		bodyModel[529].rotateAngleY = -0.70511302F;

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362 glow
		bodyModel[530].setRotationPoint(-36.76F, -10.75F, -6.03F);
		bodyModel[530].rotateAngleY = -0.70511302F;

		bodyModel[531].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[531].setRotationPoint(-37.92F, -11F, -3.6F);
		bodyModel[531].rotateAngleY = 0.15707963F;
		bodyModel[531].rotateAngleZ = 0.10471976F;

		bodyModel[532].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363 markerlight glow
		bodyModel[532].setRotationPoint(-37.94F, -11F, 3.6F);
		bodyModel[532].rotateAngleY = -0.15707963F;
		bodyModel[532].rotateAngleZ = 0.10471976F;

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[533].setRotationPoint(-31.4F, -13F, 9.6F);
		bodyModel[533].rotateAngleX = -0.01745329F;
		bodyModel[533].rotateAngleY = 0.26179939F;

		bodyModel[534].addShapeBox(0F, 0F, 0F, 64, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[534].setRotationPoint(-26.5F, -21.95F, 9.05F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 64, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 561
		bodyModel[535].setRotationPoint(-26.5F, -21.95F, -9.05F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[536].setRotationPoint(-26F, -23F, -0.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[537].setRotationPoint(-26F, -24F, -0.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 84, 8, 1, 0F,0F, 0F, 1.22F, -44F, 0F, 1.22F, -44F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -4F, 0.02F, -44F, -4F, 0.02F, -44F, -4F, 0F, 0F, -4F, 0F); // Box 565
		bodyModel[538].setRotationPoint(-8.5F, -18F, 10.01F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[539].setRotationPoint(-10.5F, -10F, 10.01F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[540].setRotationPoint(-23.5F, -23F, -0.5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[541].setRotationPoint(-26.5F, -24F, -0.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[542].setRotationPoint(-21.5F, -23F, -0.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[543].setRotationPoint(-21.5F, -24F, -0.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.09F, -0.45F, -0.86F, 0.1F, -0.45F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, -0.45F, -0.86F, -0.08F, -0.45F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[544].setRotationPoint(-28.5F, -15F, 9F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.06F, -0.45F, 0F, 0.09F, -0.45F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.06F, -0.45F, 0F, -0.08F, -0.45F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 563
		bodyModel[545].setRotationPoint(-30.5F, -15F, 9F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.54F, 0F, 0.25F, -0.25F, 0F, -0.25F); // Box 565
		bodyModel[546].setRotationPoint(-39.5F, 1F, 0F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[547].setRotationPoint(-3.49F, -16F, 0.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 0
		bodyModel[548].setRotationPoint(-21.49F, -18F, -9.3F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 550
		bodyModel[549].setRotationPoint(-21.49F, -18F, 8.3F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 0
		bodyModel[550].setRotationPoint(-17.51F, -18F, -9.3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 552
		bodyModel[551].setRotationPoint(-17.51F, -18F, 8.3F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 0
		bodyModel[552].setRotationPoint(-21.5F, -7.01F, -9.3F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[553].setRotationPoint(-21.5F, -7.01F, 8.3F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.7F, -0.8F, 0F, 0.7F); // Box 0
		bodyModel[554].setRotationPoint(-27.5F, -19F, -9.49F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -0.8F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, -0.8F, 0F, -0.7F); // Box 556
		bodyModel[555].setRotationPoint(-27.5F, -19F, 9.49F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 0
		bodyModel[556].setRotationPoint(-17.51F, -14F, -10F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[557].setRotationPoint(-17.51F, -14F, 9F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 0
		bodyModel[558].setRotationPoint(-26.35F, -13F, 8.75F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 389
		bodyModel[559].setRotationPoint(-25.3F, -14F, 2F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[560].setRotationPoint(-27.35F, -8F, 0F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[561].setRotationPoint(-26.7F, -12.5F, 4.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[562].setRotationPoint(-27.35F, -13F, 4F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[563].setRotationPoint(-27.35F, -13F, -10F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[564].setRotationPoint(-10.5F, -11F, 10.01F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[565].setRotationPoint(-10.5F, -11F, -11.01F);

		bodyModel[566].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[566].setRotationPoint(38.5F, -13F, 3.5F);

		bodyModel[567].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[567].setRotationPoint(38.5F, -13F, -3.5F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 11 || GetColor(entity) == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.22, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.22, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}