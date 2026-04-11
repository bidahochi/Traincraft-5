//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7 PTCX
// Model Creator: Bidahochi
// Created on: 26.12.2021 - 10:15:49
// Last changed on: 26.12.2021 - 10:15:49

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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
import train.common.api.Locomotive;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelCF7hh extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCF7hh() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[338];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[5] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[6] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[7] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[8] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[9] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[10] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 336
		bodyModel[12] = new ModelRendererTurbo(this, 123, 241, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 146, 241, textureX, textureY); // Box 346
		bodyModel[14] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[15] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[16] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[17] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 15, 165, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 356
		bodyModel[23] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 151
		bodyModel[24] = new ModelRendererTurbo(this, 93, 201, textureX, textureY); // Box 184
		bodyModel[25] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[27] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[29] = new ModelRendererTurbo(this, 42, 204, textureX, textureY); // Box 374
		bodyModel[30] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 33, 203, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 410, 193, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 423, 196, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 55
		bodyModel[39] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[40] = new ModelRendererTurbo(this, 430, 193, textureX, textureY); // Box 235
		bodyModel[41] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[42] = new ModelRendererTurbo(this, 408, 152, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 402, 213, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 443, 200, textureX, textureY); // Box 338
		bodyModel[45] = new ModelRendererTurbo(this, 456, 200, textureX, textureY); // Box 340
		bodyModel[46] = new ModelRendererTurbo(this, 454, 198, textureX, textureY); // Box 344
		bodyModel[47] = new ModelRendererTurbo(this, 100, 186, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 240, 194, textureX, textureY); // Box 37
		bodyModel[49] = new ModelRendererTurbo(this, 4, 186, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 4, 187, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 9, 187, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 33, 205, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 42, 205, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 109, 216, textureX, textureY); // Box 38
		bodyModel[66] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[67] = new ModelRendererTurbo(this, 176, 244, textureX, textureY); // Box 40
		bodyModel[68] = new ModelRendererTurbo(this, 67, 222, textureX, textureY); // Box 42
		bodyModel[69] = new ModelRendererTurbo(this, 44, 243, textureX, textureY); // Box 44
		bodyModel[70] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 45
		bodyModel[71] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 46
		bodyModel[72] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 48
		bodyModel[73] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 50
		bodyModel[74] = new ModelRendererTurbo(this, 166, 219, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 34, 222, textureX, textureY); // Box 324
		bodyModel[78] = new ModelRendererTurbo(this, 44, 243, textureX, textureY); // Box 325
		bodyModel[79] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[80] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[81] = new ModelRendererTurbo(this, 176, 249, textureX, textureY); // Box 600
		bodyModel[82] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 270, 221, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 249, 220, textureX, textureY); // Box 130
		bodyModel[86] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 131
		bodyModel[87] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 69
		bodyModel[90] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 143
		bodyModel[91] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[92] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 115, 226, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[95] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[97] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[103] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[104] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[105] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[106] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[107] = new ModelRendererTurbo(this, 244, 106, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[108] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[109] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[110] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[111] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[113] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[114] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[115] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Box 51
		bodyModel[116] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 78
		bodyModel[117] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 319
		bodyModel[118] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 320
		bodyModel[119] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 321
		bodyModel[120] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[121] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[122] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[123] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[124] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 52 door swing right
		bodyModel[125] = new ModelRendererTurbo(this, 379, 103, textureX, textureY); // Box 68
		bodyModel[126] = new ModelRendererTurbo(this, 395, 96, textureX, textureY); // Box 69
		bodyModel[127] = new ModelRendererTurbo(this, 348, 117, textureX, textureY); // Box 70
		bodyModel[128] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[129] = new ModelRendererTurbo(this, 348, 101, textureX, textureY); // Box 75
		bodyModel[130] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 76
		bodyModel[131] = new ModelRendererTurbo(this, 396, 133, textureX, textureY); // Box 72
		bodyModel[132] = new ModelRendererTurbo(this, 315, 133, textureX, textureY); // Box 190
		bodyModel[133] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[134] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[135] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[136] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[137] = new ModelRendererTurbo(this, 269, 118, textureX, textureY); // Box 313
		bodyModel[138] = new ModelRendererTurbo(this, 385, 130, textureX, textureY); // Box 314 door swing right
		bodyModel[139] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[140] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 332
		bodyModel[141] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 333
		bodyModel[142] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 67
		bodyModel[143] = new ModelRendererTurbo(this, 428, 114, textureX, textureY); // Box 334
		bodyModel[144] = new ModelRendererTurbo(this, 428, 107, textureX, textureY); // Box 335
		bodyModel[145] = new ModelRendererTurbo(this, 93, 135, textureX, textureY); // Box 106
		bodyModel[146] = new ModelRendererTurbo(this, 73, 39, textureX, textureY); // Box 81
		bodyModel[147] = new ModelRendererTurbo(this, 70, 40, textureX, textureY); // Box 81
		bodyModel[148] = new ModelRendererTurbo(this, 70, 19, textureX, textureY); // Box 176
		bodyModel[149] = new ModelRendererTurbo(this, 73, 18, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[151] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[152] = new ModelRendererTurbo(this, 56, 135, textureX, textureY); // Box 188 high enji box
		bodyModel[153] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 73 low engi box
		bodyModel[154] = new ModelRendererTurbo(this, 78, 41, textureX, textureY); // Box 61
		bodyModel[155] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[156] = new ModelRendererTurbo(this, 78, 43, textureX, textureY); // Box 191
		bodyModel[157] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 192
		bodyModel[158] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 196
		bodyModel[159] = new ModelRendererTurbo(this, 89, 20, textureX, textureY); // Box 317
		bodyModel[160] = new ModelRendererTurbo(this, 78, 25, textureX, textureY); // Box 319
		bodyModel[161] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[162] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[163] = new ModelRendererTurbo(this, 191, 18, textureX, textureY); // Box 243
		bodyModel[164] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 244
		bodyModel[165] = new ModelRendererTurbo(this, 188, 20, textureX, textureY); // Box 245
		bodyModel[166] = new ModelRendererTurbo(this, 185, 40, textureX, textureY); // Box 249
		bodyModel[167] = new ModelRendererTurbo(this, 180, 39, textureX, textureY); // Box 250
		bodyModel[168] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 251
		bodyModel[169] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[170] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[171] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[172] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[173] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[174] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[175] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[176] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[177] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[178] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[179] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[180] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[181] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[182] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[183] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[184] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[185] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[186] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[187] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[188] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[189] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[190] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 322
		bodyModel[191] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 244
		bodyModel[192] = new ModelRendererTurbo(this, 92, 20, textureX, textureY); // Box 245
		bodyModel[193] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 246
		bodyModel[194] = new ModelRendererTurbo(this, 110, 20, textureX, textureY); // Box 247
		bodyModel[195] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[196] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[197] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[198] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[199] = new ModelRendererTurbo(this, 422, 221, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[200] = new ModelRendererTurbo(this, 376, 230, textureX, textureY); // Box 185
		bodyModel[201] = new ModelRendererTurbo(this, 344, 230, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[202] = new ModelRendererTurbo(this, 344, 233, textureX, textureY); // Box 272
		bodyModel[203] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 273
		bodyModel[204] = new ModelRendererTurbo(this, 339, 233, textureX, textureY); // Box 274
		bodyModel[205] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base
		bodyModel[206] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[207] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[208] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[209] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[210] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 78
		bodyModel[211] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 188
		bodyModel[212] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "ditch"); // Box 189 ditchlight f up2
		bodyModel[213] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "ditch"); // Box 190 ditchlight f up2
		bodyModel[214] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[215] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "ditch"); // Box 24 ditchlight r up2
		bodyModel[216] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "ditch"); // Box 241 ditchlight r up2
		bodyModel[217] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[218] = new ModelRendererTurbo(this, 382, 181, textureX, textureY); // Box 409 commander base
		bodyModel[219] = new ModelRendererTurbo(this, 387, 180, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[220] = new ModelRendererTurbo(this, 380, 212, textureX, textureY); // Box 364 prime base
		bodyModel[221] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[222] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[223] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[224] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[225] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[226] = new ModelRendererTurbo(this, 333, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[227] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[228] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[229] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[230] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[231] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 361
		bodyModel[232] = new ModelRendererTurbo(this, 302, 232, textureX, textureY); // Box 362
		bodyModel[233] = new ModelRendererTurbo(this, 311, 231, textureX, textureY); // Box 363
		bodyModel[234] = new ModelRendererTurbo(this, 311, 237, textureX, textureY); // Box 364
		bodyModel[235] = new ModelRendererTurbo(this, 263, 136, textureX, textureY); // Box 350
		bodyModel[236] = new ModelRendererTurbo(this, 266, 136, textureX, textureY); // Box 351
		bodyModel[237] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // box64
		bodyModel[238] = new ModelRendererTurbo(this, 235, 133, textureX, textureY); // box65
		bodyModel[239] = new ModelRendererTurbo(this, 376, 228, textureX, textureY); // Box 448
		bodyModel[240] = new ModelRendererTurbo(this, 376, 219, textureX, textureY); // Box 435
		bodyModel[241] = new ModelRendererTurbo(this, 382, 193, textureX, textureY); // Box 409 commander base
		bodyModel[242] = new ModelRendererTurbo(this, 387, 192, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[243] = new ModelRendererTurbo(this, 379, 219, textureX, textureY); // Box 446
		bodyModel[244] = new ModelRendererTurbo(this, 382, 185, textureX, textureY); // Box 409 commander base
		bodyModel[245] = new ModelRendererTurbo(this, 387, 184, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[246] = new ModelRendererTurbo(this, 398, 230, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[247] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[248] = new ModelRendererTurbo(this, 438, 129, textureX, textureY); // Box 412 cs1
		bodyModel[249] = new ModelRendererTurbo(this, 458, 131, textureX, textureY); // Box 413 cs1
		bodyModel[250] = new ModelRendererTurbo(this, 450, 125, textureX, textureY); // Box 86 cs1
		bodyModel[251] = new ModelRendererTurbo(this, 501, 144, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[252] = new ModelRendererTurbo(this, 415, 222, textureX, textureY, "cull"); // Box 462 smol antenna plane cull
		bodyModel[253] = new ModelRendererTurbo(this, 388, 219, textureX, textureY); // Box 463
		bodyModel[254] = new ModelRendererTurbo(this, 502, 132, textureX, textureY); // Box 131 cs2
		bodyModel[255] = new ModelRendererTurbo(this, 500, 136, textureX, textureY); // Box 131 cs2
		bodyModel[256] = new ModelRendererTurbo(this, 481, 132, textureX, textureY); // Box 131 cs2
		bodyModel[257] = new ModelRendererTurbo(this, 486, 130, textureX, textureY); // Box 131 cs2
		bodyModel[258] = new ModelRendererTurbo(this, 495, 132, textureX, textureY); // Box 131 cs2
		bodyModel[259] = new ModelRendererTurbo(this, 486, 125, textureX, textureY); // Box 131 cs2
		bodyModel[260] = new ModelRendererTurbo(this, 489, 142, textureX, textureY); // Box 131 cs2
		bodyModel[261] = new ModelRendererTurbo(this, 480, 142, textureX, textureY); // Box 360 cs2
		bodyModel[262] = new ModelRendererTurbo(this, 435, 123, textureX, textureY); // Box 476 cs1 radio
		bodyModel[263] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 482
		bodyModel[264] = new ModelRendererTurbo(this, 405, 240, textureX, textureY); // Box 364
		bodyModel[265] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 365
		bodyModel[266] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 366
		bodyModel[267] = new ModelRendererTurbo(this, 322, 204, textureX, textureY); // Box 490 TXR bell
		bodyModel[268] = new ModelRendererTurbo(this, 322, 207, textureX, textureY); // Box 491 TXR bell
		bodyModel[269] = new ModelRendererTurbo(this, 322, 210, textureX, textureY); // Box 492 TXR bell
		bodyModel[270] = new ModelRendererTurbo(this, 322, 201, textureX, textureY); // Box 493 TXR bell sponson
		bodyModel[271] = new ModelRendererTurbo(this, 42, 192, textureX, textureY); // Box 616
		bodyModel[272] = new ModelRendererTurbo(this, 33, 192, textureX, textureY); // Box 617
		bodyModel[273] = new ModelRendererTurbo(this, 33, 190, textureX, textureY); // Box 618
		bodyModel[274] = new ModelRendererTurbo(this, 4, 200, textureX, textureY); // Box 619
		bodyModel[275] = new ModelRendererTurbo(this, 9, 198, textureX, textureY); // Box 620
		bodyModel[276] = new ModelRendererTurbo(this, 9, 200, textureX, textureY); // Box 621
		bodyModel[277] = new ModelRendererTurbo(this, 4, 199, textureX, textureY); // Box 622
		bodyModel[278] = new ModelRendererTurbo(this, 42, 191, textureX, textureY); // Box 623
		bodyModel[279] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[280] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[281] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[282] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[283] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[284] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[285] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[286] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[287] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[288] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[289] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[290] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[291] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[292] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[293] = new ModelRendererTurbo(this, 463, 116, textureX, textureY); // Box 487 cab heater
		bodyModel[294] = new ModelRendererTurbo(this, 158, 29, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[295] = new ModelRendererTurbo(this, 144, 50, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[296] = new ModelRendererTurbo(this, 277, 220, textureX, textureY); // Box 503 tcw moment
		bodyModel[297] = new ModelRendererTurbo(this, 276, 220, textureX, textureY); // Box 504 tcw moment
		bodyModel[298] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 526
		bodyModel[299] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 527
		bodyModel[300] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[301] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[302] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[303] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[304] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[305] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[306] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[307] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[308] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[309] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[310] = new ModelRendererTurbo(this, 446, 166, textureX, textureY); // Box 520 hh
		bodyModel[311] = new ModelRendererTurbo(this, 477, 192, textureX, textureY); // Box 521
		bodyModel[312] = new ModelRendererTurbo(this, 484, 189, textureX, textureY); // Box 522
		bodyModel[313] = new ModelRendererTurbo(this, 464, 189, textureX, textureY); // Box 523
		bodyModel[314] = new ModelRendererTurbo(this, 337, 92, textureX, textureY); // Box 74
		bodyModel[315] = new ModelRendererTurbo(this, 348, 89, textureX, textureY); // Box 75
		bodyModel[316] = new ModelRendererTurbo(this, 322, 89, textureX, textureY); // Box 76
		bodyModel[317] = new ModelRendererTurbo(this, 348, 81, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[318] = new ModelRendererTurbo(this, 348, 81, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[319] = new ModelRendererTurbo(this, 339, 82, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[320] = new ModelRendererTurbo(this, 339, 87, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[321] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[322] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[323] = new ModelRendererTurbo(this, 378, 170, textureX, textureY); // Box 1203
		bodyModel[324] = new ModelRendererTurbo(this, 394, 170, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[325] = new ModelRendererTurbo(this, 394, 164, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[326] = new ModelRendererTurbo(this, 113, 8, textureX, textureY); // Box 536
		bodyModel[327] = new ModelRendererTurbo(this, 104, 8, textureX, textureY); // Box 537
		bodyModel[328] = new ModelRendererTurbo(this, 213, 19, textureX, textureY); // Box 538
		bodyModel[329] = new ModelRendererTurbo(this, 376, 224, textureX, textureY); // Box 287
		bodyModel[330] = new ModelRendererTurbo(this, 382, 189, textureX, textureY); // Box 409 commander base
		bodyModel[331] = new ModelRendererTurbo(this, 387, 188, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[332] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 409
		bodyModel[333] = new ModelRendererTurbo(this, 391, 219, textureX, textureY); // Box 463
		bodyModel[334] = new ModelRendererTurbo(this, 403, 191, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[335] = new ModelRendererTurbo(this, 403, 191, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[336] = new ModelRendererTurbo(this, 382, 178, textureX, textureY); // Box 409 commander base
		bodyModel[337] = new ModelRendererTurbo(this, 387, 177, textureX, textureY, "commander"); // Box 410 commander beacon

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-39.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-36.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[2].setRotationPoint(-38.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[3].setRotationPoint(-38.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[4].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[5].setRotationPoint(-36.01F, 7.5F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[6].setRotationPoint(-36.01F, 8.5F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[7].setRotationPoint(36.01F, 1F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[8].setRotationPoint(36.01F, 7.5F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[9].setRotationPoint(36.01F, 8.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[10].setRotationPoint(36F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[11].setRotationPoint(-37F, 3F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-36F, 2F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[13].setRotationPoint(31F, 2F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[14].setRotationPoint(36F, 1F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[15].setRotationPoint(36F, 1F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[16].setRotationPoint(36F, 1F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-36.01F, 8.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-36.01F, 8.5F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[19].setRotationPoint(36.01F, 8.5F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(36.01F, 8.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[21].setRotationPoint(-37F, 1F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[22].setRotationPoint(-37F, 1F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[23].setRotationPoint(-37F, 1F, -2.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 72, 2, 12, 0F); // Box 184
		bodyModel[24].setRotationPoint(-36F, 1F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(-32F, 1F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[26].setRotationPoint(-36F, 8.5F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[27].setRotationPoint(-36F, 7.5F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[28].setRotationPoint(-31F, 0F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[29].setRotationPoint(-31F, 2F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-36F, 6.25F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-36F, 4.5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-36F, 2.75F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[33].setRotationPoint(-31F, 2F, -9F);
		bodyModel[33].rotateAngleY = 0.5846853F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(-36F, 5.25F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(-36F, 3.5F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[36].setRotationPoint(-33F, -13F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[37].setRotationPoint(-33F, -13F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[38].setRotationPoint(-32F, -13F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[39].setRotationPoint(-32.25F, -12F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[40].setRotationPoint(-33F, -13F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[41].setRotationPoint(-32.25F, -12F, 3.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[42].setRotationPoint(-32F, -14F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[43].setRotationPoint(-32.5F, -13.5F, -1F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[44].setRotationPoint(-32.5F, -14F, -5.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[45].setRotationPoint(-32.5F, -14F, 5.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[46].setRotationPoint(-29.5F, -14F, 5.5F);
		bodyModel[46].rotateAngleY = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 64, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-32F, 3F, -6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[48].setRotationPoint(9F, 0F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-31F, 2F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-31F, 2F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-31F, 2F, 9F);
		bodyModel[51].rotateAngleY = -0.5846853F;

		bodyModel[52].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[52].setRotationPoint(-31F, 4F, 9F);
		bodyModel[52].rotateAngleY = -0.5846853F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-32F, 1F, 6F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[54].setRotationPoint(-36F, 8.5F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[55].setRotationPoint(-36F, 7.5F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[56].setRotationPoint(-36.01F, 7F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(-36F, 6.25F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(-36F, 5.25F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(-36F, 4.5F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[60].setRotationPoint(-36F, 3.5F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[61].setRotationPoint(-36F, 2.75F, 5.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[62].setRotationPoint(-31F, 4F, -9F);
		bodyModel[62].rotateAngleY = 0.5846853F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[63].setRotationPoint(-31F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[64].setRotationPoint(36.01F, 7F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[65].setRotationPoint(-9F, 0F, -10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[66].setRotationPoint(9F, 2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[67].setRotationPoint(-13F, 2F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 20, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 42
		bodyModel[68].setRotationPoint(-1F, 4F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 44
		bodyModel[69].setRotationPoint(-1F, 6F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[70].setRotationPoint(-9F, 4.5F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 46
		bodyModel[71].setRotationPoint(-9F, 3.5F, -9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[72].setRotationPoint(-9F, 7.5F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[73].setRotationPoint(-9F, 4.5F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[74].setRotationPoint(-9F, 0F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[75].setRotationPoint(-9F, 3.5F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[76].setRotationPoint(-9F, 3.5F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 324
		bodyModel[77].setRotationPoint(-1F, 6F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F); // Box 325
		bodyModel[78].setRotationPoint(-1F, 6F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[79].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[80].setRotationPoint(9F, 2F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[81].setRotationPoint(-13F, 2F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[82].setRotationPoint(-9F, 7.5F, 2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 95
		bodyModel[83].setRotationPoint(-9F, 3.5F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(-10F, 3F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 8, 4, 2, 0F); // Box 130
		bodyModel[85].setRotationPoint(-9F, 4.5F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[86].setRotationPoint(-9F, 5.5F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[87].setRotationPoint(-9F, 5.5F, 1F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[88].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[89].setRotationPoint(-22.75F, 2.75F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[90].setRotationPoint(18.75F, 2.75F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[91].setRotationPoint(30F, 1F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[92].setRotationPoint(30F, 1F, 6F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[93].setRotationPoint(9F, 3.5F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[94].setRotationPoint(-22.25F, 2F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[95].setRotationPoint(-22.25F, 2F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[96].setRotationPoint(19.25F, 2F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[97].setRotationPoint(19.25F, 2F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[98].setRotationPoint(-21.25F, 2F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[99].setRotationPoint(-21.25F, 2F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[100].setRotationPoint(20.25F, 2F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[101].setRotationPoint(20.25F, 2F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[102].setRotationPoint(31F, -20F, 1F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[103].setRotationPoint(31F, -20F, -1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[104].setRotationPoint(31F, -20F, -7F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[105].setRotationPoint(33.5F, -18.5F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[106].setRotationPoint(33.75F, -18.5F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[107].setRotationPoint(33.75F, -16.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[108].setRotationPoint(31F, -1F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[109].setRotationPoint(31F, -8F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[110].setRotationPoint(31F, -8F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[111].setRotationPoint(30.75F, -7F, 3.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[112].setRotationPoint(30.75F, -5F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[113].setRotationPoint(33F, -8F, 2.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[114].setRotationPoint(30.5F, -20.5F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[115].setRotationPoint(-11F, -20F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[116].setRotationPoint(-10F, -20.75F, -3F);

		bodyModel[117].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[117].setRotationPoint(-3F, -20.75F, -3F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[118].setRotationPoint(16F, -20.75F, -3F);

		bodyModel[119].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[119].setRotationPoint(23F, -20.75F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[120].setRotationPoint(5.5F, -22F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[121].setRotationPoint(8.25F, -22F, -1.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[122].setRotationPoint(10.75F, -22F, -1.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[123].setRotationPoint(13.5F, -22F, -1.5F);

		bodyModel[124].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[124].setRotationPoint(-25.5F, -18F, -9.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[125].setRotationPoint(-26F, -22F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[126].setRotationPoint(-26F, -22F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[127].setRotationPoint(-12F, -18F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[128].setRotationPoint(-29F, -22F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[129].setRotationPoint(-28F, -22F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[130].setRotationPoint(-28F, -22F, 1F);

		bodyModel[131].addBox(0F, 0F, 0F, 14, 13, 1, 0F); // Box 72
		bodyModel[131].setRotationPoint(-26F, -18F, 10F);

		bodyModel[132].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 190
		bodyModel[132].setRotationPoint(-26F, -18F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[133].setRotationPoint(-26.05F, -21F, -6F);
		bodyModel[133].rotateAngleY = 0.38397244F;

		bodyModel[134].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[134].setRotationPoint(-26.05F, -21F, 6F);
		bodyModel[134].rotateAngleY = -0.38397244F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[135].setRotationPoint(-28.75F, -22F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[136].setRotationPoint(-28.75F, -20F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 313
		bodyModel[137].setRotationPoint(-26F, -18F, -6F);

		bodyModel[138].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[138].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[139].setRotationPoint(-26F, -5F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[140].setRotationPoint(-26F, -21F, -9F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[141].setRotationPoint(-12F, -21F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[142].setRotationPoint(-26F, -22F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[143].setRotationPoint(-25F, -21F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[144].setRotationPoint(-25F, -21F, -9F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 106
		bodyModel[145].setRotationPoint(-31F, -5F, -11.01F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 81
		bodyModel[146].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[147].setRotationPoint(-31.5F, -5F, -11.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[148].setRotationPoint(-31.5F, -5F, 10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 18, 2, 0F); // Box 177
		bodyModel[149].setRotationPoint(-31.5F, -13F, 9F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[150].setRotationPoint(-29F, -4F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[151].setRotationPoint(-30F, -2F, -11F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 188 high enji box
		bodyModel[152].setRotationPoint(-31F, -4F, 6F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 73 low engi box
		bodyModel[153].setRotationPoint(-31F, -2F, 6F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[154].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[155].setRotationPoint(-29.5F, -11F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 191
		bodyModel[156].setRotationPoint(-31F, -10F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 192
		bodyModel[157].setRotationPoint(-31F, -10F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.25F, 0F, 0F); // Box 196
		bodyModel[158].setRotationPoint(-27.5F, -11F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[159].setRotationPoint(-26.5F, -13F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[160].setRotationPoint(-31.5F, -11F, 11F);

		bodyModel[161].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[161].setRotationPoint(-6F, -8F, 11F);

		bodyModel[162].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[162].setRotationPoint(-11F, -8F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[163].setRotationPoint(31.5F, -8F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[164].setRotationPoint(31.5F, -6F, 10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[165].setRotationPoint(31F, -8F, 11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[166].setRotationPoint(31.5F, -6F, -11.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[167].setRotationPoint(31.5F, -8F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[168].setRotationPoint(31F, -8F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[169].setRotationPoint(-36.01F, 0F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[170].setRotationPoint(-36.01F, 0F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[171].setRotationPoint(-36.01F, -7F, -7F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[172].setRotationPoint(-36.01F, -7F, -8F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[173].setRotationPoint(-37.01F, -7F, -2.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[174].setRotationPoint(-36.01F, -7F, 3F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[175].setRotationPoint(-36.01F, -7F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[176].setRotationPoint(-36.01F, -7F, -8F);
		bodyModel[176].rotateAngleY = -3.14159265F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[177].setRotationPoint(-36.01F, -7F, 9F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[178].setRotationPoint(36.01F, -7F, -8F);
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[179].setRotationPoint(36.01F, 0F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[180].setRotationPoint(36.01F, -7F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[181].setRotationPoint(36.01F, -7F, -7F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[182].setRotationPoint(37.01F, -7F, -2.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[183].setRotationPoint(36.01F, -7F, 3F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[184].setRotationPoint(36.01F, -7F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[185].setRotationPoint(36.01F, -7F, 9F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[186].setRotationPoint(36.01F, 0F, 10F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[187].setRotationPoint(-11F, -4F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[188].setRotationPoint(-11F, -5F, 11.01F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[189].setRotationPoint(-10F, -2F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0.25F, -0.5F, 0F); // Box 322
		bodyModel[190].setRotationPoint(-8F, -10F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, -2F, 0F); // Box 244
		bodyModel[191].setRotationPoint(-11.5F, -11F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 245
		bodyModel[192].setRotationPoint(-11.5F, -13F, 11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
		bodyModel[193].setRotationPoint(-9F, -10.5F, 11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 247
		bodyModel[194].setRotationPoint(-6.5F, -8F, 11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[195].setRotationPoint(-10F, -18.5F, 6.1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[196].setRotationPoint(18F, -18.5F, 6.1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[197].setRotationPoint(18F, -18.5F, -7.1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[198].setRotationPoint(-10F, -18.5F, -7.1F);

		bodyModel[199].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 282 antenna plate cull
		bodyModel[199].setRotationPoint(-16F, -24F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[200].setRotationPoint(-26F, -25F, -2F);

		bodyModel[201].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[201].setRotationPoint(-28F, -24F, 7F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[202].setRotationPoint(-25F, -24F, 6F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[203].setRotationPoint(-27F, -24F, 5F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[204].setRotationPoint(-25F, -23F, 6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[205].setRotationPoint(-25F, -23F, -8.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[206].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[207].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[208].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[209].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[210].setRotationPoint(-36.5F, -2F, 4.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[211].setRotationPoint(-36.5F, -2F, -6.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[212].setRotationPoint(-36.75F, -2F, 4.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[213].setRotationPoint(-36.75F, -2F, -6.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[214].setRotationPoint(35.5F, -2F, -6.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[215].setRotationPoint(35.75F, -2F, -6.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[216].setRotationPoint(35.75F, -2F, 4.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[217].setRotationPoint(35.5F, -2F, 4.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[218].setRotationPoint(31F, -21F, 2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[219].setRotationPoint(31F, -22F, 2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[220].setRotationPoint(-32F, -23F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[221].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[222].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[223].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[224].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[225].setRotationPoint(-36.25F, -3F, -4.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[226].setRotationPoint(-36.5F, -3F, -4.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[227].setRotationPoint(35.5F, -3F, 2.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[228].setRotationPoint(35.75F, -3F, 2.75F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[229].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[230].setRotationPoint(-37.25F, 1F, -2.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[231].setRotationPoint(-3.5F, -22F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		bodyModel[232].setRotationPoint(-3F, -21F, -7F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[233].setRotationPoint(-4.5F, -22F, -5F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[234].setRotationPoint(-5F, -22F, -7F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[235].setRotationPoint(-25F, -16F, -12F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[236].setRotationPoint(-25F, -16F, 11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[237].setRotationPoint(-24F, -18F, 11F);
		bodyModel[237].rotateAngleX = 0.26179939F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[238].setRotationPoint(-24F, -18.25F, -11.97F);
		bodyModel[238].rotateAngleX = -0.26179939F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[239].setRotationPoint(-30F, -23F, 0F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 435
		bodyModel[240].setRotationPoint(-32F, -24F, -3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[241].setRotationPoint(-31F, -23F, 4.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[242].setRotationPoint(-31F, -24F, 4.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[243].setRotationPoint(-32F, -24F, 3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[244].setRotationPoint(-31F, -23F, -5.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[245].setRotationPoint(-31F, -24F, -5.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[246].setRotationPoint(-27F, -24F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[247].setRotationPoint(-26F, -25F, 0F);

		bodyModel[248].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs1
		bodyModel[248].setRotationPoint(-20F, -14F, 0F);
		bodyModel[248].rotateAngleY = -0.26179939F;

		bodyModel[249].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[249].setRotationPoint(-25.1F, -12F, 4F);
		bodyModel[249].rotateAngleY = -0.59341195F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[250].setRotationPoint(-25.1F, -14F, 4F);
		bodyModel[250].rotateAngleY = -0.59341195F;

		bodyModel[251].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[251].setRotationPoint(-25F, -12F, -4F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 462 smol antenna plane cull
		bodyModel[252].setRotationPoint(-14F, -23F, -1.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 463
		bodyModel[253].setRotationPoint(-10.5F, -23F, -9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131 cs2
		bodyModel[254].setRotationPoint(-24F, -12F, 8.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131 cs2
		bodyModel[255].setRotationPoint(-24.5F, -10F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs2
		bodyModel[256].setRotationPoint(-21F, -12F, 2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[257].setRotationPoint(-22F, -12F, 1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[258].setRotationPoint(-23F, -12F, 2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131 cs2
		bodyModel[259].setRotationPoint(-22.5F, -14F, 1.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131 cs2
		bodyModel[260].setRotationPoint(-25.5F, -14.5F, 5.75F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 360 cs2
		bodyModel[261].setRotationPoint(-25F, -9.3F, 4.5F);

		bodyModel[262].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[262].setRotationPoint(-20F, -16F, 0F);
		bodyModel[262].rotateAngleY = -0.26179939F;

		bodyModel[263].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 482
		bodyModel[263].setRotationPoint(-13F, -21F, -6F);

		bodyModel[264].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[264].setRotationPoint(-20.5F, -24F, 4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[265].setRotationPoint(-21.5F, -24F, 4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[266].setRotationPoint(-21.5F, -23F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490 TXR bell
		bodyModel[267].setRotationPoint(-10.5F, 4F, 9.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 491 TXR bell
		bodyModel[268].setRotationPoint(-10.5F, 5F, 9.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492 TXR bell
		bodyModel[269].setRotationPoint(-10.25F, 5.5F, 9.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 493 TXR bell sponson
		bodyModel[270].setRotationPoint(-10.5F, 3F, 9.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
		bodyModel[271].setRotationPoint(31F, 2F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[272].setRotationPoint(31F, 4F, -9F);
		bodyModel[272].rotateAngleY = -0.5846853F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[273].setRotationPoint(31F, 2F, -9F);
		bodyModel[273].rotateAngleY = -0.5846853F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
		bodyModel[274].setRotationPoint(31F, 2F, 9F);

		bodyModel[275].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[275].setRotationPoint(31F, 2F, 9F);
		bodyModel[275].rotateAngleY = 0.5846853F;

		bodyModel[276].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[276].setRotationPoint(31F, 4F, 9F);
		bodyModel[276].rotateAngleY = 0.5846853F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[277].setRotationPoint(29F, 2F, 11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[278].setRotationPoint(29F, 2F, -11F);

		bodyModel[279].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[279].setRotationPoint(31F, 7.5F, -9F);

		bodyModel[280].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[280].setRotationPoint(31F, 8.5F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[281].setRotationPoint(31F, 6.25F, -9F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[282].setRotationPoint(32F, 5.25F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[283].setRotationPoint(32F, 4.5F, -8.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[284].setRotationPoint(32F, 3.5F, -6.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[285].setRotationPoint(33F, 2.75F, -7.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[286].setRotationPoint(31F, 7.5F, 9F);

		bodyModel[287].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[287].setRotationPoint(31F, 8.5F, 9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[288].setRotationPoint(32F, 5.25F, 7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[289].setRotationPoint(31F, 6.25F, 7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[290].setRotationPoint(32F, 3.5F, 6.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[291].setRotationPoint(32F, 4.5F, 6.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[292].setRotationPoint(33F, 2.75F, 5.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[293].setRotationPoint(-25F, -10F, -6F);

		bodyModel[294].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[294].setRotationPoint(-6F, 0.5F, 10F);

		bodyModel[295].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[295].setRotationPoint(-6F, 0.5F, -11F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 503 tcw moment
		bodyModel[296].setRotationPoint(-11F, -21F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 504 tcw moment
		bodyModel[297].setRotationPoint(-11F, -18F, -10.99F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526
		bodyModel[298].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527
		bodyModel[299].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[300].setRotationPoint(-3.5F, 0.5F, 9.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[301].setRotationPoint(-3.5F, 0.5F, -10.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[302].setRotationPoint(5.5F, -24F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[303].setRotationPoint(5.5F, -25F, -2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[304].setRotationPoint(13.5F, -24F, -2F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[305].setRotationPoint(13.5F, -25F, -2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[306].setRotationPoint(8.25F, -24F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[307].setRotationPoint(8.25F, -25F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[308].setRotationPoint(10.75F, -24F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[309].setRotationPoint(10.75F, -25F, -2F);

		bodyModel[310].addBox(0F, 0F, 0F, 6, 9, 12, 0F); // Box 520 hh
		bodyModel[310].setRotationPoint(-32F, -22F, -6F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 521
		bodyModel[311].setRotationPoint(-33F, -18F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[312].setRotationPoint(-33F, -18F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 523
		bodyModel[313].setRotationPoint(-33F, -18F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[314].setRotationPoint(-35F, -22F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[315].setRotationPoint(-34F, -22F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[316].setRotationPoint(-34F, -22F, 1F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[317].setRotationPoint(-32.05F, -21F, -6F);
		bodyModel[317].rotateAngleY = 0.38397244F;

		bodyModel[318].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[318].setRotationPoint(-32.05F, -21F, 6F);
		bodyModel[318].rotateAngleY = -0.38397244F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[319].setRotationPoint(-34.75F, -22F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[320].setRotationPoint(-34.75F, -20F, -1F);

		bodyModel[321].addBox(0F, 0F, 0F, 8, 12, 2, 0F); // Box 271
		bodyModel[321].setRotationPoint(-10F, -12F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[322].setRotationPoint(-10F, -14F, -9F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[323].setRotationPoint(-30F, -8F, 7F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[324].setRotationPoint(36.5F, -2F, -2F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[325].setRotationPoint(36.5F, -3F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 120, 10, 0, 0F,0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -60F, -5F, 0F, -60F, -5F, 0F, 0F, -5F, 0F); // Box 536
		bodyModel[326].setRotationPoint(-29F, -4F, 11.01F);

		bodyModel[327].addShapeBox(0F, -4F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 537
		bodyModel[327].setRotationPoint(-29F, -4F, 11.01F);
		bodyModel[327].rotateAngleX = 0.38397244F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 20, 10, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 538
		bodyModel[328].setRotationPoint(31F, -4F, 11.01F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[329].setRotationPoint(-15F, -25F, -5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[330].setRotationPoint(-13F, -25F, -4.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[331].setRotationPoint(-13F, -26F, -4.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 409
		bodyModel[332].setRotationPoint(-13F, -26F, -2F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 463
		bodyModel[333].setRotationPoint(-13F, -25F, 1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[334].setRotationPoint(-32.25F, -17.5F, -5.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[335].setRotationPoint(-32.25F, -17.5F, 3.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[336].setRotationPoint(29.25F, -21F, -0.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[337].setRotationPoint(29.25F, -22F, -0.5F);
	}
	ModelBlombergBnew theBlomb = new ModelBlombergBnew();
	//ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 13241) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}