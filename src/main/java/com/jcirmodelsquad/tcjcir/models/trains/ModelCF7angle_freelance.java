//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7 Angle Cab
// Model Creator: Bidahochi
// Created on: 26.12.2021 - 10:15:49
// Last changed on: 26.12.2021 - 10:15:49

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.ModelCF7_ANE_Antennae;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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

public class ModelCF7angle_freelance extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCF7angle_freelance() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[482];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132 front triangle
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133 front triangle
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
		bodyModel[29] = new ModelRendererTurbo(this, 42, 202, textureX, textureY); // Box 374
		bodyModel[30] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 32, 203, textureX, textureY); // Box 49
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
		bodyModel[49] = new ModelRendererTurbo(this, 4, 184, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 3, 187, textureX, textureY, "cull"); // Box 66 stairbit cull
		bodyModel[51] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 10, 187, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 41, 205, textureX, textureY, "cull"); // Box 79 stairbit cull
		bodyModel[64] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 109, 216, textureX, textureY); // Box 38
		bodyModel[66] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[67] = new ModelRendererTurbo(this, 176, 244, textureX, textureY); // Box 40
		bodyModel[68] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 45
		bodyModel[69] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 46
		bodyModel[70] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 48
		bodyModel[71] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 50
		bodyModel[72] = new ModelRendererTurbo(this, 166, 219, textureX, textureY); // Box 93
		bodyModel[73] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 94
		bodyModel[74] = new ModelRendererTurbo(this, 189, 253, textureX, textureY); // Box 95
		bodyModel[75] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[76] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[77] = new ModelRendererTurbo(this, 176, 249, textureX, textureY); // Box 600
		bodyModel[78] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 99
		bodyModel[79] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 268, 220, textureX, textureY, "cull"); // Box 96 cull air resivour pipe
		bodyModel[81] = new ModelRendererTurbo(this, 249, 220, textureX, textureY); // Box 130
		bodyModel[82] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 132
		bodyModel[84] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[85] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 69
		bodyModel[86] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 143
		bodyModel[87] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[88] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[89] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[91] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[92] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[93] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[94] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[95] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[96] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[97] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[98] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[99] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[100] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[101] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[102] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[103] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[104] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[105] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[106] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[107] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[108] = new ModelRendererTurbo(this, 238, 87, textureX, textureY); // Box 333 rear ane gyra holder
		bodyModel[109] = new ModelRendererTurbo(this, 247, 86, textureX, textureY, "lamp"); // Box 334 Rear Gyralight L
		bodyModel[110] = new ModelRendererTurbo(this, 254, 86, textureX, textureY, "lamp"); // Box 335 Rear Gyralight R
		bodyModel[111] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[112] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[113] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[114] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[115] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Box 51
		bodyModel[116] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[117] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[118] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[119] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[120] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 52 door swing right
		bodyModel[121] = new ModelRendererTurbo(this, 379, 103, textureX, textureY); // Box 68
		bodyModel[122] = new ModelRendererTurbo(this, 395, 96, textureX, textureY); // Box 69
		bodyModel[123] = new ModelRendererTurbo(this, 348, 117, textureX, textureY); // Box 70
		bodyModel[124] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[125] = new ModelRendererTurbo(this, 348, 101, textureX, textureY); // Box 75
		bodyModel[126] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 76
		bodyModel[127] = new ModelRendererTurbo(this, 396, 133, textureX, textureY); // Box 72
		bodyModel[128] = new ModelRendererTurbo(this, 315, 133, textureX, textureY); // Box 190
		bodyModel[129] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[130] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[131] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[132] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[133] = new ModelRendererTurbo(this, 269, 118, textureX, textureY); // Box 313
		bodyModel[134] = new ModelRendererTurbo(this, 385, 130, textureX, textureY); // Box 314 door swing right
		bodyModel[135] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[136] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 332
		bodyModel[137] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 333
		bodyModel[138] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 67
		bodyModel[139] = new ModelRendererTurbo(this, 428, 114, textureX, textureY); // Box 334
		bodyModel[140] = new ModelRendererTurbo(this, 428, 107, textureX, textureY); // Box 335
		bodyModel[141] = new ModelRendererTurbo(this, 71, 39, textureX, textureY, "cull"); // Box 81 handrail cull
		bodyModel[142] = new ModelRendererTurbo(this, 68, 40, textureX, textureY); // Box 81
		bodyModel[143] = new ModelRendererTurbo(this, 68, 19, textureX, textureY); // Box 176
		bodyModel[144] = new ModelRendererTurbo(this, 71, 20, textureX, textureY, "cull"); // Box 177 handrail cull
		bodyModel[145] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[146] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[147] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 73 low engi box
		bodyModel[148] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[149] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 192
		bodyModel[150] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 196
		bodyModel[151] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[152] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[153] = new ModelRendererTurbo(this, 189, 18, textureX, textureY, "cull"); // Box 243 handrail cull
		bodyModel[154] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 244
		bodyModel[155] = new ModelRendererTurbo(this, 185, 40, textureX, textureY); // Box 249
		bodyModel[156] = new ModelRendererTurbo(this, 178, 39, textureX, textureY, "cull"); // Box 250 handrail cull
		bodyModel[157] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[158] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[159] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[160] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[161] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[162] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[163] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[164] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[165] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[166] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[167] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[168] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[169] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[170] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[171] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[172] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[173] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[174] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[175] = new ModelRendererTurbo(this, 331, 111, textureX, textureY); // Box 336 fncc gyra housing
		bodyModel[176] = new ModelRendererTurbo(this, 317, 113, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[177] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[178] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[179] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Box 574 nose light mount
		bodyModel[180] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[181] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[182] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[183] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[184] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[185] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[186] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[187] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[188] = new ModelRendererTurbo(this, 308, 187, textureX, textureY); // Box 268 arsr bell/glnt bell/ msv
		bodyModel[189] = new ModelRendererTurbo(this, 309, 191, textureX, textureY); // Box 269
		bodyModel[190] = new ModelRendererTurbo(this, 309, 194, textureX, textureY); // Box 270
		bodyModel[191] = new ModelRendererTurbo(this, 309, 197, textureX, textureY); // Box 271
		bodyModel[192] = new ModelRendererTurbo(this, 205, 78, textureX, textureY, "cull"); // Box 391 cull arrestor cagy
		bodyModel[193] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 392 cull arrestor cagy
		bodyModel[194] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 393 cull arrestor cagy
		bodyModel[195] = new ModelRendererTurbo(this, 205, 78, textureX, textureY, "cull"); // Box 394 cull arrestor cagy
		bodyModel[196] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 395 cull arrestor cagy
		bodyModel[197] = new ModelRendererTurbo(this, 222, 78, textureX, textureY, "cull"); // Box 396 cull arrestor cagy
		bodyModel[198] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 397 cull arrestor cagy
		bodyModel[199] = new ModelRendererTurbo(this, 222, 78, textureX, textureY, "cull"); // Box 398 cull arrestor cagy
		bodyModel[200] = new ModelRendererTurbo(this, 316, 207, textureX, textureY); // Box 323
		bodyModel[201] = new ModelRendererTurbo(this, 316, 210, textureX, textureY); // Box 324
		bodyModel[202] = new ModelRendererTurbo(this, 316, 204, textureX, textureY); // Box 325
		bodyModel[203] = new ModelRendererTurbo(this, 315, 200, textureX, textureY); // Box 326 ane bell
		bodyModel[204] = new ModelRendererTurbo(this, 327, 204, textureX, textureY); // Box 378
		bodyModel[205] = new ModelRendererTurbo(this, 327, 210, textureX, textureY); // Box 379
		bodyModel[206] = new ModelRendererTurbo(this, 327, 207, textureX, textureY); // Box 380
		bodyModel[207] = new ModelRendererTurbo(this, 375, 234, textureX, textureY); // Box 184 o2 generator
		bodyModel[208] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 301 blatt
		bodyModel[209] = new ModelRendererTurbo(this, 356, 241, textureX, textureY); // Box 302
		bodyModel[210] = new ModelRendererTurbo(this, 382, 219, textureX, textureY); // Box 345
		bodyModel[211] = new ModelRendererTurbo(this, 344, 244, textureX, textureY); // Box 401
		bodyModel[212] = new ModelRendererTurbo(this, 339, 244, textureX, textureY); // Box 402
		bodyModel[213] = new ModelRendererTurbo(this, 95, 73, textureX, textureY); // Box 360 torpedo tueb amtk 585
		bodyModel[214] = new ModelRendererTurbo(this, 96, 78, textureX, textureY, "cull"); // Box 361 cull torp tube support
		bodyModel[215] = new ModelRendererTurbo(this, 95, 73, textureX, textureY); // Box 364 torpedo tueb amtk 585
		bodyModel[216] = new ModelRendererTurbo(this, 182, 70, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[217] = new ModelRendererTurbo(this, 291, 222, textureX, textureY); // Box 275 amtrak horn
		bodyModel[218] = new ModelRendererTurbo(this, 291, 219, textureX, textureY); // Box 276 amtrak horn
		bodyModel[219] = new ModelRendererTurbo(this, 344, 230, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[220] = new ModelRendererTurbo(this, 344, 233, textureX, textureY); // Box 272
		bodyModel[221] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 273
		bodyModel[222] = new ModelRendererTurbo(this, 339, 233, textureX, textureY); // Box 274
		bodyModel[223] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base tall
		bodyModel[224] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[225] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[226] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[227] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[228] = new ModelRendererTurbo(this, 291, 229, textureX, textureY); // Box 354 horn fcen 48
		bodyModel[229] = new ModelRendererTurbo(this, 286, 232, textureX, textureY); // Box 355 horn fcen 48
		bodyModel[230] = new ModelRendererTurbo(this, 291, 232, textureX, textureY); // Box 356 horn fcen 48
		bodyModel[231] = new ModelRendererTurbo(this, 291, 235, textureX, textureY); // Box 357 horn fcen 48
		bodyModel[232] = new ModelRendererTurbo(this, 344, 241, textureX, textureY); // Box 346
		bodyModel[233] = new ModelRendererTurbo(this, 339, 241, textureX, textureY); // Box 347
		bodyModel[234] = new ModelRendererTurbo(this, 447, 219, textureX, textureY, "cull"); // Box 338 cage cull a cagy 803
		bodyModel[235] = new ModelRendererTurbo(this, 447, 237, textureX, textureY, "cull"); // Box 305 cage cull b zacky farms
		bodyModel[236] = new ModelRendererTurbo(this, 447, 231, textureX, textureY, "cull"); // Box 306 cage cull b zacky farms
		bodyModel[237] = new ModelRendererTurbo(this, 341, 206, textureX, textureY); // Box 78
		bodyModel[238] = new ModelRendererTurbo(this, 341, 206, textureX, textureY); // Box 188
		bodyModel[239] = new ModelRendererTurbo(this, 348, 206, textureX, textureY, "ditch"); // Box 189 ditchlight f up
		bodyModel[240] = new ModelRendererTurbo(this, 348, 206, textureX, textureY, "ditch"); // Box 190 ditchlight f up
		bodyModel[241] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // Box 239
		bodyModel[242] = new ModelRendererTurbo(this, 363, 206, textureX, textureY, "ditch"); // Box 240 ditchlight r up
		bodyModel[243] = new ModelRendererTurbo(this, 363, 206, textureX, textureY, "ditch"); // Box 241 ditchlight r up
		bodyModel[244] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // Box 242
		bodyModel[245] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 78
		bodyModel[246] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 188
		bodyModel[247] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "ditch"); // Box 189 ditchlight f up2
		bodyModel[248] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "ditch"); // Box 190 ditchlight f up2
		bodyModel[249] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[250] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "ditch"); // Box 24 ditchlight r up2
		bodyModel[251] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "ditch"); // Box 241 ditchlight r up2
		bodyModel[252] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[253] = new ModelRendererTurbo(this, 348, 196, textureX, textureY, "ditch"); // Box 359 ditchlight f down3
		bodyModel[254] = new ModelRendererTurbo(this, 339, 196, textureX, textureY, "cull"); // Box 360 ditchlight cull fcen50
		bodyModel[255] = new ModelRendererTurbo(this, 339, 196, textureX, textureY, "cull"); // Box 361 ditchlight cull fcen 50
		bodyModel[256] = new ModelRendererTurbo(this, 348, 196, textureX, textureY, "ditch"); // Box 362 ditchlight f down3
		bodyModel[257] = new ModelRendererTurbo(this, 341, 201, textureX, textureY); // Box 188 ditch mount
		bodyModel[258] = new ModelRendererTurbo(this, 348, 201, textureX, textureY, "ditch"); // Box 190 ditchlight f down2 AR
		bodyModel[259] = new ModelRendererTurbo(this, 348, 201, textureX, textureY, "ditch"); // Box 371 ditchlight f down2 AR
		bodyModel[260] = new ModelRendererTurbo(this, 341, 201, textureX, textureY); // Box 372 ditch mount
		bodyModel[261] = new ModelRendererTurbo(this, 341, 191, textureX, textureY); // Box 398 ditch mount
		bodyModel[262] = new ModelRendererTurbo(this, 348, 191, textureX, textureY, "ditch"); // Box 399 ditchlight f down
		bodyModel[263] = new ModelRendererTurbo(this, 348, 191, textureX, textureY, "ditch"); // Box 400 ditchlight f down
		bodyModel[264] = new ModelRendererTurbo(this, 341, 191, textureX, textureY); // Box 401 ditch mount
		bodyModel[265] = new ModelRendererTurbo(this, 363, 191, textureX, textureY, "ditch"); // Box 394 ditchlight r down
		bodyModel[266] = new ModelRendererTurbo(this, 356, 191, textureX, textureY); // Box 395 ditch mount
		bodyModel[267] = new ModelRendererTurbo(this, 363, 191, textureX, textureY, "ditch"); // Box 396 ditchlight r down
		bodyModel[268] = new ModelRendererTurbo(this, 356, 191, textureX, textureY); // Box 397 ditch mount
		bodyModel[269] = new ModelRendererTurbo(this, 356, 201, textureX, textureY); // Box 188 ditch mount AR
		bodyModel[270] = new ModelRendererTurbo(this, 363, 201, textureX, textureY, "ditch"); // Box 190 ditchlight r down2
		bodyModel[271] = new ModelRendererTurbo(this, 363, 201, textureX, textureY, "ditch"); // Box 371 ditchlight r down2
		bodyModel[272] = new ModelRendererTurbo(this, 356, 201, textureX, textureY); // Box 372 ditch mount AR
		bodyModel[273] = new ModelRendererTurbo(this, 344, 226, textureX, textureY); // Box 296 horn scbg fncc
		bodyModel[274] = new ModelRendererTurbo(this, 327, 240, textureX, textureY); // Box 341 horn ane/fncc/wcrc
		bodyModel[275] = new ModelRendererTurbo(this, 327, 237, textureX, textureY); // Box 342 horn ane/fncc/wcrc
		bodyModel[276] = new ModelRendererTurbo(this, 327, 243, textureX, textureY); // Box 343 horn ane/fncc/wcrc
		bodyModel[277] = new ModelRendererTurbo(this, 344, 223, textureX, textureY); // Box 295 horn scbg fncc
		bodyModel[278] = new ModelRendererTurbo(this, 339, 223, textureX, textureY); // Box 297 horn scbg fncc
		bodyModel[279] = new ModelRendererTurbo(this, 322, 240, textureX, textureY); // Box 344 horn ane/fncc/wcrc
		bodyModel[280] = new ModelRendererTurbo(this, 344, 220, textureX, textureY); // Box 294 horn scbg fncc
		bodyModel[281] = new ModelRendererTurbo(this, 311, 242, textureX, textureY); // Box 311 horn ane backup/ fcen
		bodyModel[282] = new ModelRendererTurbo(this, 306, 242, textureX, textureY); // Box 312 horn ane backup / fcen
		bodyModel[283] = new ModelRendererTurbo(this, 382, 197, textureX, textureY); // Box 409 commander base pvrr
		bodyModel[284] = new ModelRendererTurbo(this, 387, 196, textureX, textureY, "commander"); // Box 410 commander beacon pvrr
		bodyModel[285] = new ModelRendererTurbo(this, 333, 118, textureX, textureY); // Box 352 amtk 585 gyro mount
		bodyModel[286] = new ModelRendererTurbo(this, 326, 118, textureX, textureY, "prime1"); // Box 353 Amtrak 585 Red Gyro Front
		bodyModel[287] = new ModelRendererTurbo(this, 361, 226, textureX, textureY); // Box 278 horn front and center
		bodyModel[288] = new ModelRendererTurbo(this, 361, 223, textureX, textureY); // Box 279 horn front and center
		bodyModel[289] = new ModelRendererTurbo(this, 361, 220, textureX, textureY); // Box 280 horn front and center
		bodyModel[290] = new ModelRendererTurbo(this, 356, 223, textureX, textureY, "cull"); // Box 281 cull horn front and center
		bodyModel[291] = new ModelRendererTurbo(this, 382, 181, textureX, textureY); // Box 409 commander base generic
		bodyModel[292] = new ModelRendererTurbo(this, 387, 180, textureX, textureY, "commander"); // Box 410 commander beacon generic
		bodyModel[293] = new ModelRendererTurbo(this, 380, 212, textureX, textureY); // Box 364 prime base ane
		bodyModel[294] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[295] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[296] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[297] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[298] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 409
		bodyModel[299] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[300] = new ModelRendererTurbo(this, 333, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[301] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[302] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[303] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[304] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[305] = new ModelRendererTurbo(this, 252, 129, textureX, textureY); // box64 sunshield early
		bodyModel[306] = new ModelRendererTurbo(this, 235, 129, textureX, textureY); // box65 sunshield early
		bodyModel[307] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // box64 sunshield late
		bodyModel[308] = new ModelRendererTurbo(this, 235, 133, textureX, textureY); // box65 sunshield late
		bodyModel[309] = new ModelRendererTurbo(this, 311, 223, textureX, textureY); // Box 238 mdde 2632/brw 42 moment
		bodyModel[310] = new ModelRendererTurbo(this, 304, 222, textureX, textureY); // Box 239 mdde 2632/brw 42 moment
		bodyModel[311] = new ModelRendererTurbo(this, 311, 220, textureX, textureY); // Box 244 mdde 2632/brw 42 moment
		bodyModel[312] = new ModelRendererTurbo(this, 311, 226, textureX, textureY); // Box 245 mdde 2632/brw 42 moment
		bodyModel[313] = new ModelRendererTurbo(this, 376, 228, textureX, textureY); // Box 448
		bodyModel[314] = new ModelRendererTurbo(this, 163, 171, textureX, textureY); // Box 22 front plow
		bodyModel[315] = new ModelRendererTurbo(this, 215, 171, textureX, textureY); // Box 23 front plow
		bodyModel[316] = new ModelRendererTurbo(this, 176, 169, textureX, textureY); // Box 24 front plow scbg rrvw
		bodyModel[317] = new ModelRendererTurbo(this, 228, 169, textureX, textureY); // Box 25 front plow scbg rrvw
		bodyModel[318] = new ModelRendererTurbo(this, 319, 171, textureX, textureY); // Box 431 rear plow
		bodyModel[319] = new ModelRendererTurbo(this, 267, 171, textureX, textureY); // Box 432 rear plow
		bodyModel[320] = new ModelRendererTurbo(this, 280, 169, textureX, textureY); // Box 433 rear plow pvrr
		bodyModel[321] = new ModelRendererTurbo(this, 332, 169, textureX, textureY); // Box 434 rear plow pvrr
		bodyModel[322] = new ModelRendererTurbo(this, 376, 219, textureX, textureY); // Box 435
		bodyModel[323] = new ModelRendererTurbo(this, 189, 167, textureX, textureY); // Box 4 plow glont
		bodyModel[324] = new ModelRendererTurbo(this, 241, 167, textureX, textureY); // Box 322 plow glont
		bodyModel[325] = new ModelRendererTurbo(this, 202, 165, textureX, textureY); // Box 438 plow glont
		bodyModel[326] = new ModelRendererTurbo(this, 254, 165, textureX, textureY); // Box 439 plow glont
		bodyModel[327] = new ModelRendererTurbo(this, 382, 193, textureX, textureY); // Box 409 commander base ir5
		bodyModel[328] = new ModelRendererTurbo(this, 387, 192, textureX, textureY, "commander"); // Box 410 commander beacon ir5
		bodyModel[329] = new ModelRendererTurbo(this, 382, 185, textureX, textureY); // Box 409 commander base msv d5
		bodyModel[330] = new ModelRendererTurbo(this, 387, 184, textureX, textureY, "commander"); // Box 410 commander beacon msv d5
		bodyModel[331] = new ModelRendererTurbo(this, 423, 230, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[332] = new ModelRendererTurbo(this, 376, 222, textureX, textureY); // Box 450
		bodyModel[333] = new ModelRendererTurbo(this, 380, 208, textureX, textureY); // Box 364 prime base
		bodyModel[334] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[335] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[336] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[337] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[338] = new ModelRendererTurbo(this, 398, 230, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[339] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[340] = new ModelRendererTurbo(this, 438, 129, textureX, textureY); // Box 412 cs1
		bodyModel[341] = new ModelRendererTurbo(this, 458, 131, textureX, textureY); // Box 413 cs1
		bodyModel[342] = new ModelRendererTurbo(this, 450, 125, textureX, textureY); // Box 86 cs1
		bodyModel[343] = new ModelRendererTurbo(this, 501, 144, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[344] = new ModelRendererTurbo(this, 415, 222, textureX, textureY, "cull"); // Box 462 smol antenna plane cull
		bodyModel[345] = new ModelRendererTurbo(this, 388, 219, textureX, textureY); // Box 463
		bodyModel[346] = new ModelRendererTurbo(this, 382, 201, textureX, textureY); // Box 409 commander base cagy 810
		bodyModel[347] = new ModelRendererTurbo(this, 387, 200, textureX, textureY, "commander"); // Box 410 commander beacon cagy 810
		bodyModel[348] = new ModelRendererTurbo(this, 502, 132, textureX, textureY); // Box 131 cs2
		bodyModel[349] = new ModelRendererTurbo(this, 500, 136, textureX, textureY); // Box 131 cs2
		bodyModel[350] = new ModelRendererTurbo(this, 481, 132, textureX, textureY); // Box 131 cs2
		bodyModel[351] = new ModelRendererTurbo(this, 486, 130, textureX, textureY); // Box 131 cs2
		bodyModel[352] = new ModelRendererTurbo(this, 495, 132, textureX, textureY); // Box 131 cs2
		bodyModel[353] = new ModelRendererTurbo(this, 486, 125, textureX, textureY); // Box 131 cs2
		bodyModel[354] = new ModelRendererTurbo(this, 489, 142, textureX, textureY); // Box 131 cs2
		bodyModel[355] = new ModelRendererTurbo(this, 480, 142, textureX, textureY); // Box 360 cs2
		bodyModel[356] = new ModelRendererTurbo(this, 435, 123, textureX, textureY); // Box 476 cs1 radio
		bodyModel[357] = new ModelRendererTurbo(this, 306, 250, textureX, textureY); // Box 478 schnoz horn admx 7001
		bodyModel[358] = new ModelRendererTurbo(this, 311, 253, textureX, textureY); // Box 479 schnoz horn admx 7001
		bodyModel[359] = new ModelRendererTurbo(this, 311, 250, textureX, textureY); // Box 480 schnoz horn admx 7001
		bodyModel[360] = new ModelRendererTurbo(this, 311, 247, textureX, textureY); // Box 481 schnoz horn admx 7001
		bodyModel[361] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 482
		bodyModel[362] = new ModelRendererTurbo(this, 405, 240, textureX, textureY); // Box 364 rv aircon
		bodyModel[363] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 365 rv aircon
		bodyModel[364] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 366 rv aircon
		bodyModel[365] = new ModelRendererTurbo(this, 322, 204, textureX, textureY); // Box 490 TXR bell
		bodyModel[366] = new ModelRendererTurbo(this, 322, 207, textureX, textureY); // Box 491 TXR bell
		bodyModel[367] = new ModelRendererTurbo(this, 322, 210, textureX, textureY); // Box 492 TXR bell
		bodyModel[368] = new ModelRendererTurbo(this, 361, 244, textureX, textureY); // Box 299 blatt
		bodyModel[369] = new ModelRendererTurbo(this, 356, 244, textureX, textureY); // Box 300
		bodyModel[370] = new ModelRendererTurbo(this, 487, 189, textureX, textureY, "cull"); // Box 3 cull AWW 2window
		bodyModel[371] = new ModelRendererTurbo(this, 489, 184, textureX, textureY); // Box 5 AWW 2window
		bodyModel[372] = new ModelRendererTurbo(this, 462, 189, textureX, textureY, "cull"); // Box 412 cull AWW 1window
		bodyModel[373] = new ModelRendererTurbo(this, 464, 184, textureX, textureY); // Box 413 AWW 1window
		bodyModel[374] = new ModelRendererTurbo(this, 41, 192, textureX, textureY, "cull"); // Box 616 stairbit cull
		bodyModel[375] = new ModelRendererTurbo(this, 32, 192, textureX, textureY); // Box 617
		bodyModel[376] = new ModelRendererTurbo(this, 32, 190, textureX, textureY); // Box 618
		bodyModel[377] = new ModelRendererTurbo(this, 3, 200, textureX, textureY, "cull"); // Box 619 stairbit cull
		bodyModel[378] = new ModelRendererTurbo(this, 10, 198, textureX, textureY); // Box 620
		bodyModel[379] = new ModelRendererTurbo(this, 10, 200, textureX, textureY); // Box 621
		bodyModel[380] = new ModelRendererTurbo(this, 4, 197, textureX, textureY); // Box 622
		bodyModel[381] = new ModelRendererTurbo(this, 42, 189, textureX, textureY); // Box 623
		bodyModel[382] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[383] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[384] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[385] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[386] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[387] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[388] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[389] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[390] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[391] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[392] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[393] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[394] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[395] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[396] = new ModelRendererTurbo(this, 187, 13, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[397] = new ModelRendererTurbo(this, 393, 199, textureX, textureY); // Box 364 prime base
		bodyModel[398] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[399] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[400] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[401] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[402] = new ModelRendererTurbo(this, 463, 116, textureX, textureY); // Box 487 cab heater
		bodyModel[403] = new ModelRendererTurbo(this, 344, 250, textureX, textureY); // Box 495
		bodyModel[404] = new ModelRendererTurbo(this, 344, 247, textureX, textureY); // Box 496
		bodyModel[405] = new ModelRendererTurbo(this, 351, 253, textureX, textureY); // Box 497
		bodyModel[406] = new ModelRendererTurbo(this, 344, 253, textureX, textureY); // Box 498
		bodyModel[407] = new ModelRendererTurbo(this, 487, 206, textureX, textureY, "cull"); // Box 3 cull AWW 2window
		bodyModel[408] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 5 AWW 2window
		bodyModel[409] = new ModelRendererTurbo(this, 462, 206, textureX, textureY, "cull"); // Box 412 cull AWW 1window
		bodyModel[410] = new ModelRendererTurbo(this, 464, 201, textureX, textureY); // Box 413 AWW 1window
		bodyModel[411] = new ModelRendererTurbo(this, 276, 220, textureX, textureY); // Box 503 tcw moment
		bodyModel[412] = new ModelRendererTurbo(this, 275, 220, textureX, textureY); // Box 504 tcw moment
		bodyModel[413] = new ModelRendererTurbo(this, 382, 177, textureX, textureY); // Box 409 commander base
		bodyModel[414] = new ModelRendererTurbo(this, 387, 176, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[415] = new ModelRendererTurbo(this, 220, 246, textureX, textureY, "cull"); // Box 526 cull fuel filler buildup area
		bodyModel[416] = new ModelRendererTurbo(this, 220, 246, textureX, textureY, "cull"); // Box 527 cull fuel filler buildup area
		bodyModel[417] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[418] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[419] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[420] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[421] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[422] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[423] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[424] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[425] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[426] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[427] = new ModelRendererTurbo(this, 136, 53, textureX, textureY); // Box 519 frame stripe fix
		bodyModel[428] = new ModelRendererTurbo(this, 150, 32, textureX, textureY); // Box 520 frame stripe fix
		bodyModel[429] = new ModelRendererTurbo(this, 96, 78, textureX, textureY, "cull"); // Box 521 cull torp tube support
		bodyModel[430] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 522
		bodyModel[431] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 523
		bodyModel[432] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 524
		bodyModel[433] = new ModelRendererTurbo(this, 93, 129, textureX, textureY); // Box 526
		bodyModel[434] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 527
		bodyModel[435] = new ModelRendererTurbo(this, 67, 222, textureX, textureY); // Box 42
		bodyModel[436] = new ModelRendererTurbo(this, 34, 222, textureX, textureY); // Box 324
		bodyModel[437] = new ModelRendererTurbo(this, 5, 233, textureX, textureY); // Box 506
		bodyModel[438] = new ModelRendererTurbo(this, 376, 230, textureX, textureY); // Box 185
		bodyModel[439] = new ModelRendererTurbo(this, 376, 224, textureX, textureY); // Box 287
		bodyModel[440] = new ModelRendererTurbo(this, 382, 189, textureX, textureY); // Box 409 commander base owo
		bodyModel[441] = new ModelRendererTurbo(this, 387, 188, textureX, textureY, "commander"); // Box 410 commander beacon owo
		bodyModel[442] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 186 fan
		bodyModel[443] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 682 fan
		bodyModel[444] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 683 fan
		bodyModel[445] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 684 fan
		bodyModel[446] = new ModelRendererTurbo(this, 239, 238, textureX, textureY); // Box 504
		bodyModel[447] = new ModelRendererTurbo(this, 243, 249, textureX, textureY); // Box 512
		bodyModel[448] = new ModelRendererTurbo(this, 243, 249, textureX, textureY); // Box 513
		bodyModel[449] = new ModelRendererTurbo(this, 7, 144, textureX, textureY); // Box 514 brw 42 rear triangle
		bodyModel[450] = new ModelRendererTurbo(this, 28, 144, textureX, textureY); // Box 515 brw 42 rear triangle
		bodyModel[451] = new ModelRendererTurbo(this, 286, 246, textureX, textureY); // Box 510 horn amtk 582
		bodyModel[452] = new ModelRendererTurbo(this, 291, 243, textureX, textureY); // Box 511 horn amtk 582
		bodyModel[453] = new ModelRendererTurbo(this, 291, 246, textureX, textureY); // Box 512 horn amtk 582
		bodyModel[454] = new ModelRendererTurbo(this, 291, 249, textureX, textureY); // Box 513 horn amtk 582
		bodyModel[455] = new ModelRendererTurbo(this, 261, 88, textureX, textureY, "lamp"); // Box 322 brw 42 markerlight
		bodyModel[456] = new ModelRendererTurbo(this, 261, 88, textureX, textureY, "lamp"); // Box 324 brw 42 markerlight
		bodyModel[457] = new ModelRendererTurbo(this, 260, 91, textureX, textureY); // Box 298 marker box  brw 42
		bodyModel[458] = new ModelRendererTurbo(this, 260, 91, textureX, textureY); // Box 299 marker box brw 42
		bodyModel[459] = new ModelRendererTurbo(this, 462, 108, textureX, textureY, "lamp"); // Box 591 speedo glow
		bodyModel[460] = new ModelRendererTurbo(this, 356, 196, textureX, textureY, "cull"); // Box 516 ditchlight cull fcen 50
		bodyModel[461] = new ModelRendererTurbo(this, 363, 196, textureX, textureY, "ditch"); // Box 517 ditchlight rear down 3
		bodyModel[462] = new ModelRendererTurbo(this, 363, 196, textureX, textureY, "ditch"); // Box 518 ditchlight rear down 3
		bodyModel[463] = new ModelRendererTurbo(this, 356, 196, textureX, textureY, "cull"); // Box 519 ditchlight cull fcen 50
		bodyModel[464] = new ModelRendererTurbo(this, 377, 197, textureX, textureY, "cull"); // Box 524 cull beacon mount
		bodyModel[465] = new ModelRendererTurbo(this, 274, 241, textureX, textureY); // Box 525 scbg mystery box
		bodyModel[466] = new ModelRendererTurbo(this, 467, 223, textureX, textureY); // Box 526 CGRX 2508 batbox
		bodyModel[467] = new ModelRendererTurbo(this, 467, 223, textureX, textureY); // Box 527 CGRX 2508 batbox
		bodyModel[468] = new ModelRendererTurbo(this, 275, 228, textureX, textureY); // Box 528 tcw moment
		bodyModel[469] = new ModelRendererTurbo(this, 197, 62, textureX, textureY); // Box 529 watx 6 spark arrestor
		bodyModel[470] = new ModelRendererTurbo(this, 197, 62, textureX, textureY); // Box 530 watx 6 spark arrestor
		bodyModel[471] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 531 ecrx spark arrestor
		bodyModel[472] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 532 ecrx spark arrestor
		bodyModel[473] = new ModelRendererTurbo(this, 327, 253, textureX, textureY); // Box 533
		bodyModel[474] = new ModelRendererTurbo(this, 327, 247, textureX, textureY); // Box 534
		bodyModel[475] = new ModelRendererTurbo(this, 327, 250, textureX, textureY); // Box 535
		bodyModel[476] = new ModelRendererTurbo(this, 370, 196, textureX, textureY, "cull"); // Box 536 cull c&c / cagy beacon protector
		bodyModel[477] = new ModelRendererTurbo(this, 302, 239, textureX, textureY); // Box 537 fcen rear horn
		bodyModel[478] = new ModelRendererTurbo(this, 302, 245, textureX, textureY); // Box 538 rear horn fcen
		bodyModel[479] = new ModelRendererTurbo(this, 210, 60, textureX, textureY, "cull"); // Box 539 cull fcen 48 spark arrestor
		bodyModel[480] = new ModelRendererTurbo(this, 212, 56, textureX, textureY, "cull"); // Box 540 cull fcen 48 spark arrestor
		bodyModel[481] = new ModelRendererTurbo(this, 391, 219, textureX, textureY); // Box 104 cnrc antenna

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-39.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-36.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 front triangle
		bodyModel[2].setRotationPoint(-38.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133 front triangle
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
		bodyModel[29].setRotationPoint(-30.25F, 2F, -11F);

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
		bodyModel[49].setRotationPoint(-30.25F, 2F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66 stairbit cull
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

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79 stairbit cull
		bodyModel[63].setRotationPoint(-31F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[64].setRotationPoint(36.01F, 7F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[65].setRotationPoint(-9F, 0F, -10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[66].setRotationPoint(9F, 2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[67].setRotationPoint(-13F, 2F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[68].setRotationPoint(-8.63F, 4.5F, -10.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 46
		bodyModel[69].setRotationPoint(-8.63F, 3.5F, -9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[70].setRotationPoint(-8.63F, 7.5F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[71].setRotationPoint(-8.63F, 4.5F, 9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[72].setRotationPoint(-9F, 0F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 94
		bodyModel[73].setRotationPoint(-9F, 3.5F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[74].setRotationPoint(-9F, 3.5F, 10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[75].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[76].setRotationPoint(9F, 2F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[77].setRotationPoint(-13F, 2F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[78].setRotationPoint(-8.63F, 7.5F, 2.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 95
		bodyModel[79].setRotationPoint(-8.63F, 3.5F, 2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -4F, -0.125F, -1F, -4F, -0.125F, -1F, -4F, -0.125F, 0F, -4F, -0.125F); // Box 96 cull air resivour pipe
		bodyModel[80].setRotationPoint(-9.45F, 3F, -0.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 7, 4, 2, 0F); // Box 130
		bodyModel[81].setRotationPoint(-8.63F, 4.5F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[82].setRotationPoint(-8.63F, 5.5F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[83].setRotationPoint(-8.63F, 5.5F, 1F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[84].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[85].setRotationPoint(-22.75F, 2.75F, -2F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[86].setRotationPoint(18.75F, 2.75F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[87].setRotationPoint(30F, 1F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[88].setRotationPoint(30F, 1F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[89].setRotationPoint(-22.25F, 2F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[90].setRotationPoint(-22.25F, 2F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[91].setRotationPoint(19.25F, 2F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[92].setRotationPoint(19.25F, 2F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[93].setRotationPoint(-21.25F, 2F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[94].setRotationPoint(-21.25F, 2F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[95].setRotationPoint(20.25F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[96].setRotationPoint(20.25F, 2F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[97].setRotationPoint(31F, -20F, 1F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[98].setRotationPoint(31F, -20F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[99].setRotationPoint(31F, -20F, -7F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[100].setRotationPoint(33.5F, -18.5F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[101].setRotationPoint(33.75F, -18.5F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[102].setRotationPoint(33.75F, -16.5F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[103].setRotationPoint(31F, -1F, 1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[104].setRotationPoint(31F, -8F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[105].setRotationPoint(31F, -8F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[106].setRotationPoint(30.75F, -7F, 3.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[107].setRotationPoint(30.75F, -5F, 4F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333 rear ane gyra holder
		bodyModel[108].setRotationPoint(33F, -20.5F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 Rear Gyralight L
		bodyModel[109].setRotationPoint(34.25F, -20.5F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 Rear Gyralight R
		bodyModel[110].setRotationPoint(34.25F, -20.5F, 0F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[111].setRotationPoint(33F, -8F, 2.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[112].setRotationPoint(30.5F, -20.5F, -1F);

		bodyModel[113].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[113].setRotationPoint(31.51F, -17F, -6F);
		bodyModel[113].rotateAngleY = -0.4712389F;

		bodyModel[114].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[114].setRotationPoint(31.51F, -17F, 6F);
		bodyModel[114].rotateAngleY = 0.4712389F;

		bodyModel[115].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[115].setRotationPoint(-11F, -20F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[116].setRotationPoint(5.5F, -22F, -1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[117].setRotationPoint(8.25F, -22F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[118].setRotationPoint(10.75F, -22F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[119].setRotationPoint(13.5F, -22F, -1.5F);

		bodyModel[120].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[120].setRotationPoint(-25.5F, -18F, -9.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[121].setRotationPoint(-26F, -22F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[122].setRotationPoint(-26F, -22F, 9F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[123].setRotationPoint(-12F, -18F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[124].setRotationPoint(-29F, -22F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 75
		bodyModel[125].setRotationPoint(-28F, -22F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[126].setRotationPoint(-28F, -22F, 1F);

		bodyModel[127].addBox(0F, 0F, 0F, 14, 13, 1, 0F); // Box 72
		bodyModel[127].setRotationPoint(-26F, -18F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 190
		bodyModel[128].setRotationPoint(-26F, -18F, -11F);

		bodyModel[129].addBox(0F, 0F, 0.25F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[129].setRotationPoint(-26.05F, -21F, -6F);
		bodyModel[129].rotateAngleY = 0.42760567F;

		bodyModel[130].addBox(0F, 0F, -5.25F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[130].setRotationPoint(-26.05F, -21F, 6F);
		bodyModel[130].rotateAngleY = -0.42760567F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[131].setRotationPoint(-28.75F, -22F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[132].setRotationPoint(-28.75F, -20F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 313
		bodyModel[133].setRotationPoint(-26F, -18F, -6F);

		bodyModel[134].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[134].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[135].setRotationPoint(-26F, -5F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[136].setRotationPoint(-26F, -21F, -9F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[137].setRotationPoint(-12F, -21F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[138].setRotationPoint(-26F, -22F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[139].setRotationPoint(-25F, -21F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[140].setRotationPoint(-25F, -21F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81 handrail cull
		bodyModel[141].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[142].setRotationPoint(-31.5F, -5F, -11.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[143].setRotationPoint(-31.5F, -5F, 10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177 handrail cull
		bodyModel[144].setRotationPoint(-31.5F, -11F, 9F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[145].setRotationPoint(-29F, -4F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[146].setRotationPoint(-30F, -2F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 73 low engi box
		bodyModel[147].setRotationPoint(-31F, -3F, 6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[148].setRotationPoint(-30F, -11F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 192
		bodyModel[149].setRotationPoint(-31F, -11F, 11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.75F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F); // Box 196
		bodyModel[150].setRotationPoint(-27.5F, -11F, 11.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[151].setRotationPoint(-6F, -8F, 11F);

		bodyModel[152].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[152].setRotationPoint(-11F, -8F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243 handrail cull
		bodyModel[153].setRotationPoint(31F, -8F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[154].setRotationPoint(31.5F, -6F, 10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[155].setRotationPoint(31.5F, -6F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250 handrail cull
		bodyModel[156].setRotationPoint(31F, -8F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[157].setRotationPoint(-36.01F, 0F, 10F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[158].setRotationPoint(-36.01F, 0F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[159].setRotationPoint(-36.01F, -7F, -7F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[160].setRotationPoint(-36.01F, -7F, -8F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[161].setRotationPoint(-37.01F, -7F, -2.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[162].setRotationPoint(-36.01F, -7F, 3F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[163].setRotationPoint(-36.01F, -7F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[164].setRotationPoint(-36.01F, -7F, -8F);
		bodyModel[164].rotateAngleY = -3.14159265F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[165].setRotationPoint(-36.01F, -7F, 9F);
		bodyModel[165].rotateAngleY = -3.14159265F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[166].setRotationPoint(36.01F, -7F, -8F);
		bodyModel[166].rotateAngleY = -3.14159265F;

		bodyModel[167].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[167].setRotationPoint(36.01F, 0F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[168].setRotationPoint(36.01F, -7F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[169].setRotationPoint(36.01F, -7F, -7F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[170].setRotationPoint(37.01F, -7F, -2.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[171].setRotationPoint(36.01F, -7F, 3F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[172].setRotationPoint(36.01F, -7F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[173].setRotationPoint(36.01F, -7F, 9F);
		bodyModel[173].rotateAngleY = -3.14159265F;

		bodyModel[174].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[174].setRotationPoint(36.01F, 0F, 10F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 fncc gyra housing
		bodyModel[175].setRotationPoint(-29F, -24F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[176].setRotationPoint(-29.75F, -24F, 0F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[177].setRotationPoint(-29.75F, -24F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[178].setRotationPoint(-33.35F, -10F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[179].setRotationPoint(-33.6F, -12F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[180].setRotationPoint(-33.35F, -12F, -1F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[181].setRotationPoint(-11F, -4F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[182].setRotationPoint(-11F, -5F, 11.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[183].setRotationPoint(-10F, -2F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[184].setRotationPoint(-10F, -18.5F, 6.1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[185].setRotationPoint(18F, -18.5F, 6.1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[186].setRotationPoint(18F, -18.5F, -7.1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[187].setRotationPoint(-10F, -18.5F, -7.1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268 arsr bell/glnt bell/ msv
		bodyModel[188].setRotationPoint(-1F, -20F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[189].setRotationPoint(-1F, -19F, -8.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 270
		bodyModel[190].setRotationPoint(-1F, -18F, -8.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		bodyModel[191].setRotationPoint(-0.75F, -17.5F, -8.45F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 391 cull arrestor cagy
		bodyModel[192].setRotationPoint(5.5F, -21.5F, -3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392 cull arrestor cagy
		bodyModel[193].setRotationPoint(5.5F, -23.5F, -3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull arrestor cagy
		bodyModel[194].setRotationPoint(13.5F, -23.5F, -3F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 394 cull arrestor cagy
		bodyModel[195].setRotationPoint(13.5F, -21.5F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395 cull arrestor cagy
		bodyModel[196].setRotationPoint(10.75F, -23.5F, -3F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 396 cull arrestor cagy
		bodyModel[197].setRotationPoint(10.75F, -21.5F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull arrestor cagy
		bodyModel[198].setRotationPoint(8.25F, -23.5F, -3F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398 cull arrestor cagy
		bodyModel[199].setRotationPoint(8.25F, -21.5F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[200].setRotationPoint(3F, -18F, 7.7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[201].setRotationPoint(3.25F, -17.5F, 7.95F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[202].setRotationPoint(3F, -19F, 7.7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326 ane bell
		bodyModel[203].setRotationPoint(3F, -20F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[204].setRotationPoint(-34.5F, 3F, 4.3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[205].setRotationPoint(-34.25F, 4.5F, 4.55F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[206].setRotationPoint(-34.5F, 4F, 4.3F);

		bodyModel[207].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[207].setRotationPoint(-21.5F, -23.75F, -4F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301 blatt
		bodyModel[208].setRotationPoint(-20F, -24F, 7F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[209].setRotationPoint(-18F, -23F, 7F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 345
		bodyModel[210].setRotationPoint(-25F, -26F, 0F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 401
		bodyModel[211].setRotationPoint(-15F, -24F, -8F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		bodyModel[212].setRotationPoint(-15F, -23F, -8F);

		bodyModel[213].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 360 torpedo tueb amtk 585
		bodyModel[213].setRotationPoint(1F, -22.5F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 361 cull torp tube support
		bodyModel[214].setRotationPoint(1F, -21.5F, 4.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 364 torpedo tueb amtk 585
		bodyModel[215].setRotationPoint(1F, -22.5F, -6F);

		bodyModel[216].addBox(0F, 0F, 0F, 7, 3, 7, 0F); // Box 196 winterization hatch cull
		bodyModel[216].setRotationPoint(16F, -22.5F, -3.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 275 amtrak horn
		bodyModel[217].setRotationPoint(-29F, -20F, 8F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 276 amtrak horn
		bodyModel[218].setRotationPoint(-11F, -20F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[219].setRotationPoint(-28F, -24F, 7F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[220].setRotationPoint(-25F, -24F, 6F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[221].setRotationPoint(-27F, -24F, 5F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[222].setRotationPoint(-25F, -23F, 6F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base tall
		bodyModel[223].setRotationPoint(-25F, -23F, -8.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[224].setRotationPoint(-25F, -24F, -8.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[225].setRotationPoint(-25F, -24F, -8.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[226].setRotationPoint(-25F, -24F, -8.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[227].setRotationPoint(-25F, -24F, -8.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354 horn fcen 48
		bodyModel[228].setRotationPoint(-17.5F, -25F, -1.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 355 horn fcen 48
		bodyModel[229].setRotationPoint(-16F, -24.25F, -2.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356 horn fcen 48
		bodyModel[230].setRotationPoint(-18.5F, -25.25F, -2.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357 horn fcen 48
		bodyModel[231].setRotationPoint(-18F, -25F, -3.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 346
		bodyModel[232].setRotationPoint(-26F, -24F, 7.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[233].setRotationPoint(-24F, -23F, 7.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 cage cull a cagy 803
		bodyModel[234].setRotationPoint(-27.01F, -27.01F, 4F);

		bodyModel[235].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 305 cage cull b zacky farms
		bodyModel[235].setRotationPoint(-27F, -24F, 4.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306 cage cull b zacky farms
		bodyModel[236].setRotationPoint(-27F, -25F, 4.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[237].setRotationPoint(-36.25F, -1F, 4.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[238].setRotationPoint(-36.25F, -1F, -6.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[239].setRotationPoint(-36.5F, -1F, 4.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[240].setRotationPoint(-36.5F, -1F, -6.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[241].setRotationPoint(35.25F, -1F, -6.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[242].setRotationPoint(35.5F, -1F, -6.75F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[243].setRotationPoint(35.5F, -1F, 4.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[244].setRotationPoint(35.25F, -1F, 4.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[245].setRotationPoint(-36F, -2F, 4.75F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[246].setRotationPoint(-36F, -2F, -6.75F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[247].setRotationPoint(-36.25F, -2F, 4.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[248].setRotationPoint(-36.25F, -2F, -6.75F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[249].setRotationPoint(35F, -2F, -6.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[250].setRotationPoint(35.25F, -2F, -6.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[251].setRotationPoint(35.25F, -2F, 4.75F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[252].setRotationPoint(35F, -2F, 4.75F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f down3
		bodyModel[253].setRotationPoint(-37.25F, 1F, -6.75F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 ditchlight cull fcen50
		bodyModel[254].setRotationPoint(-37F, 0.99F, -6.75F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361 ditchlight cull fcen 50
		bodyModel[255].setRotationPoint(-37F, 0.99F, 4.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 ditchlight f down3
		bodyModel[256].setRotationPoint(-37.25F, 1F, 4.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188 ditch mount
		bodyModel[257].setRotationPoint(-36.5F, 2F, 7.25F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f down2 AR
		bodyModel[258].setRotationPoint(-36.75F, 2F, 7.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371 ditchlight f down2 AR
		bodyModel[259].setRotationPoint(-36.75F, 2F, -9.25F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372 ditch mount
		bodyModel[260].setRotationPoint(-36.5F, 2F, -9.25F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398 ditch mount
		bodyModel[261].setRotationPoint(-36.5F, 2.75F, 2.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 ditchlight f down
		bodyModel[262].setRotationPoint(-36.75F, 2.75F, 2.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 400 ditchlight f down
		bodyModel[263].setRotationPoint(-36.75F, 2.75F, -4.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401 ditch mount
		bodyModel[264].setRotationPoint(-36.5F, 2.75F, -4.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 ditchlight r down
		bodyModel[265].setRotationPoint(35.75F, 3F, -4.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 395 ditch mount
		bodyModel[266].setRotationPoint(35.5F, 3F, -4.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 396 ditchlight r down
		bodyModel[267].setRotationPoint(35.75F, 3F, 2.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 397 ditch mount
		bodyModel[268].setRotationPoint(35.5F, 3F, 2.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188 ditch mount AR
		bodyModel[269].setRotationPoint(35.5F, 2F, 7.25F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight r down2
		bodyModel[270].setRotationPoint(35.75F, 2F, 7.25F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 371 ditchlight r down2
		bodyModel[271].setRotationPoint(35.75F, 2F, -9.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372 ditch mount AR
		bodyModel[272].setRotationPoint(35.5F, 2F, -9.25F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296 horn scbg fncc
		bodyModel[273].setRotationPoint(12F, -22F, -7F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341 horn ane/fncc/wcrc
		bodyModel[274].setRotationPoint(11F, -22.5F, -5.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 342 horn ane/fncc/wcrc
		bodyModel[275].setRotationPoint(9F, -22.5F, -4.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 343 horn ane/fncc/wcrc
		bodyModel[276].setRotationPoint(10F, -22.5F, -6.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295 horn scbg fncc
		bodyModel[277].setRotationPoint(13F, -22F, -6F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297 horn scbg fncc
		bodyModel[278].setRotationPoint(14F, -21F, -6F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 344 horn ane/fncc/wcrc
		bodyModel[279].setRotationPoint(12F, -21.5F, -5.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 294 horn scbg fncc
		bodyModel[280].setRotationPoint(11F, -22F, -5F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311 horn ane backup/ fcen
		bodyModel[281].setRotationPoint(29F, -21.5F, 5F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312 horn ane backup / fcen
		bodyModel[282].setRotationPoint(29F, -20.5F, 5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base pvrr
		bodyModel[283].setRotationPoint(34.5F, -21F, -0.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon pvrr
		bodyModel[284].setRotationPoint(34.5F, -22F, -0.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352 amtk 585 gyro mount
		bodyModel[285].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 Amtrak 585 Red Gyro Front
		bodyModel[286].setRotationPoint(-28.75F, -24F, -1F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278 horn front and center
		bodyModel[287].setRotationPoint(-30F, -24.5F, -1.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279 horn front and center
		bodyModel[288].setRotationPoint(-29F, -24.5F, -0.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280 horn front and center
		bodyModel[289].setRotationPoint(-31F, -24.5F, 0.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull horn front and center
		bodyModel[290].setRotationPoint(-28F, -23.5F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base generic
		bodyModel[291].setRotationPoint(-14F, -23F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon generic
		bodyModel[292].setRotationPoint(-14F, -24F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base ane
		bodyModel[293].setRotationPoint(-29F, -25F, -1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[294].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[295].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[296].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[297].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 409
		bodyModel[298].setRotationPoint(-13F, -26F, -2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[299].setRotationPoint(-36.25F, -3F, -4.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[300].setRotationPoint(-36.5F, -3F, -4.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[301].setRotationPoint(35.5F, -3F, 2.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[302].setRotationPoint(35.75F, -3F, 2.75F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[303].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[304].setRotationPoint(-37.25F, 1F, -2.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64 sunshield early
		bodyModel[305].setRotationPoint(-25F, -18F, 11F);
		bodyModel[305].rotateAngleX = 0.26179939F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65 sunshield early
		bodyModel[306].setRotationPoint(-25F, -18.25F, -11.97F);
		bodyModel[306].rotateAngleX = -0.26179939F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64 sunshield late
		bodyModel[307].setRotationPoint(-24F, -18F, 11F);
		bodyModel[307].rotateAngleX = 0.26179939F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65 sunshield late
		bodyModel[308].setRotationPoint(-24F, -18.25F, -11.97F);
		bodyModel[308].rotateAngleX = -0.26179939F;

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 238 mdde 2632/brw 42 moment
		bodyModel[309].setRotationPoint(4F, -20F, -9.25F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Box 239 mdde 2632/brw 42 moment
		bodyModel[310].setRotationPoint(4F, -20F, -9F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 244 mdde 2632/brw 42 moment
		bodyModel[311].setRotationPoint(2.75F, -21F, -9F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 245 mdde 2632/brw 42 moment
		bodyModel[312].setRotationPoint(4.25F, -19F, -9.75F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[313].setRotationPoint(-27F, -23F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22 front plow
		bodyModel[314].setRotationPoint(-40F, 7.5F, 0F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23 front plow
		bodyModel[315].setRotationPoint(-40F, 7.5F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24 front plow scbg rrvw
		bodyModel[316].setRotationPoint(-39F, 6.5F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25 front plow scbg rrvw
		bodyModel[317].setRotationPoint(-39F, 6.5F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431 rear plow
		bodyModel[318].setRotationPoint(39F, 7.5F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432 rear plow
		bodyModel[319].setRotationPoint(39F, 7.5F, -10F);

		bodyModel[320].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433 rear plow pvrr
		bodyModel[320].setRotationPoint(39F, 6.5F, -10F);

		bodyModel[321].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434 rear plow pvrr
		bodyModel[321].setRotationPoint(39F, 6.5F, 0F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 435
		bodyModel[322].setRotationPoint(-28F, -24F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4 plow glont
		bodyModel[323].setRotationPoint(-39F, 6.5F, 0F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322 plow glont
		bodyModel[324].setRotationPoint(-39F, 6.5F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438 plow glont
		bodyModel[325].setRotationPoint(-39F, 5.5F, 0F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439 plow glont
		bodyModel[326].setRotationPoint(-39F, 5.5F, -10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base ir5
		bodyModel[327].setRotationPoint(-20F, -23F, -0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon ir5
		bodyModel[328].setRotationPoint(-20F, -24F, -0.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base msv d5
		bodyModel[329].setRotationPoint(-25F, -23F, -4.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon msv d5
		bodyModel[330].setRotationPoint(-25F, -24F, -4.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[331].setRotationPoint(-16F, -24F, -2.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[332].setRotationPoint(-15F, -25F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[333].setRotationPoint(-26.5F, -25F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[334].setRotationPoint(-26.5F, -25.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[335].setRotationPoint(-26.5F, -25.5F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[336].setRotationPoint(-26.5F, -25.5F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[337].setRotationPoint(-26.5F, -25.5F, -1F);

		bodyModel[338].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[338].setRotationPoint(-27F, -24F, -3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[339].setRotationPoint(-26F, -25F, 0F);

		bodyModel[340].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs1
		bodyModel[340].setRotationPoint(-20F, -14F, 0F);
		bodyModel[340].rotateAngleY = -0.26179939F;

		bodyModel[341].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[341].setRotationPoint(-25.1F, -12F, 4F);
		bodyModel[341].rotateAngleY = -0.59341195F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[342].setRotationPoint(-25.1F, -14F, 4F);
		bodyModel[342].rotateAngleY = -0.59341195F;

		bodyModel[343].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[343].setRotationPoint(-25F, -12F, -4F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 462 smol antenna plane cull
		bodyModel[344].setRotationPoint(-14F, -23F, -1.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 463
		bodyModel[345].setRotationPoint(-13F, -25F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base cagy 810
		bodyModel[346].setRotationPoint(-28F, -24.5F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon cagy 810
		bodyModel[347].setRotationPoint(-28F, -25.5F, -0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131 cs2
		bodyModel[348].setRotationPoint(-24F, -12F, 8.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131 cs2
		bodyModel[349].setRotationPoint(-24.5F, -10F, 8F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs2
		bodyModel[350].setRotationPoint(-21F, -12F, 2F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[351].setRotationPoint(-22F, -12F, 1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[352].setRotationPoint(-23F, -12F, 2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131 cs2
		bodyModel[353].setRotationPoint(-22.5F, -14F, 1.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131 cs2
		bodyModel[354].setRotationPoint(-25.5F, -14.5F, 5.75F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 360 cs2
		bodyModel[355].setRotationPoint(-25F, -9.3F, 4.5F);

		bodyModel[356].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[356].setRotationPoint(-20F, -16F, 0F);
		bodyModel[356].rotateAngleY = -0.26179939F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 478 schnoz horn admx 7001
		bodyModel[357].setRotationPoint(-30.5F, -14.25F, -0.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 479 schnoz horn admx 7001
		bodyModel[358].setRotationPoint(-32.5F, -15F, -1.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 480 schnoz horn admx 7001
		bodyModel[359].setRotationPoint(-33F, -15.25F, -0.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 481 schnoz horn admx 7001
		bodyModel[360].setRotationPoint(-32F, -15F, 0.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 482
		bodyModel[361].setRotationPoint(-13F, -21F, -6F);

		bodyModel[362].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364 rv aircon
		bodyModel[362].setRotationPoint(-23.5F, -24F, -2F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365 rv aircon
		bodyModel[363].setRotationPoint(-24.5F, -24F, -2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366 rv aircon
		bodyModel[364].setRotationPoint(-24.5F, -23F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490 TXR bell
		bodyModel[365].setRotationPoint(-10.5F, 3.35F, 9.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 491 TXR bell
		bodyModel[366].setRotationPoint(-10.5F, 4.35F, 9.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492 TXR bell
		bodyModel[367].setRotationPoint(-10.25F, 4.85F, 9.75F);

		bodyModel[368].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299 blatt
		bodyModel[368].setRotationPoint(-20F, -24F, -8F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[369].setRotationPoint(-20F, -23F, -8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[370].setRotationPoint(-25F, -17F, 10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[371].setRotationPoint(-25F, -18F, 10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 412 cull AWW 1window
		bodyModel[372].setRotationPoint(-24F, -17F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413 AWW 1window
		bodyModel[373].setRotationPoint(-24F, -18F, 10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 616 stairbit cull
		bodyModel[374].setRotationPoint(30F, 2F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[375].setRotationPoint(31F, 4F, -9F);
		bodyModel[375].rotateAngleY = -0.5846853F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[376].setRotationPoint(31F, 2F, -9F);
		bodyModel[376].rotateAngleY = -0.5846853F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 619 stairbit cull
		bodyModel[377].setRotationPoint(30F, 2F, 9F);

		bodyModel[378].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[378].setRotationPoint(31F, 2F, 9F);
		bodyModel[378].rotateAngleY = 0.5846853F;

		bodyModel[379].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[379].setRotationPoint(31F, 4F, 9F);
		bodyModel[379].rotateAngleY = 0.5846853F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[380].setRotationPoint(28.25F, 2F, 11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[381].setRotationPoint(28.25F, 2F, -11F);

		bodyModel[382].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[382].setRotationPoint(31F, 7.5F, -9F);

		bodyModel[383].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[383].setRotationPoint(31F, 8.5F, -11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[384].setRotationPoint(31F, 6.25F, -9F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[385].setRotationPoint(32F, 5.25F, -7F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[386].setRotationPoint(32F, 4.5F, -8.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[387].setRotationPoint(32F, 3.5F, -6.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[388].setRotationPoint(33F, 2.75F, -7.5F);

		bodyModel[389].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[389].setRotationPoint(31F, 7.5F, 9F);

		bodyModel[390].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[390].setRotationPoint(31F, 8.5F, 9F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[391].setRotationPoint(32F, 5.25F, 7F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[392].setRotationPoint(31F, 6.25F, 7F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[393].setRotationPoint(32F, 3.5F, 6.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[394].setRotationPoint(32F, 4.5F, 6.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[395].setRotationPoint(33F, 2.75F, 5.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 36, 1, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F); // Box 488 handrail extension cull
		bodyModel[396].setRotationPoint(-6F, 0.5F, -11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[397].setRotationPoint(-14F, -25F, -1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[398].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[399].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[400].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[401].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[402].setRotationPoint(-25F, -10F, -6F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 495
		bodyModel[403].setRotationPoint(-15.5F, -24F, -9F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 496
		bodyModel[404].setRotationPoint(-15.5F, -24F, -7F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 497
		bodyModel[405].setRotationPoint(-15F, -25F, -8.5F);

		bodyModel[406].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 498
		bodyModel[406].setRotationPoint(-15.5F, -25F, -7.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[407].setRotationPoint(-18F, -17F, -10F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[408].setRotationPoint(-18F, -18F, -10F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 412 cull AWW 1window
		bodyModel[409].setRotationPoint(-17F, -17F, -10F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413 AWW 1window
		bodyModel[410].setRotationPoint(-17F, -18F, -10F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503 tcw moment
		bodyModel[411].setRotationPoint(-11F, -11F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 504 tcw moment
		bodyModel[412].setRotationPoint(-10F, -8F, -10.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[413].setRotationPoint(-27F, -23F, -0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[414].setRotationPoint(-27F, -24F, -0.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526 cull fuel filler buildup area
		bodyModel[415].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[416].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527 cull fuel filler buildup area
		bodyModel[416].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[417].setRotationPoint(-3.5F, 0.5F, 9.75F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[418].setRotationPoint(-3.5F, 0.5F, -10.75F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[419].setRotationPoint(5.5F, -24F, -2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[420].setRotationPoint(5.5F, -25F, -2F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[421].setRotationPoint(13.5F, -24F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[422].setRotationPoint(13.5F, -25F, -2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[423].setRotationPoint(8.25F, -24F, -2F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[424].setRotationPoint(8.25F, -25F, -2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[425].setRotationPoint(10.75F, -24F, -2F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[426].setRotationPoint(10.75F, -25F, -2F);

		bodyModel[427].addBox(0F, 0F, 0F, 18, 4, 0, 0F); // Box 519 frame stripe fix
		bodyModel[427].setRotationPoint(-9F, 0F, -10.51F);

		bodyModel[428].addBox(0F, 0F, 0F, 18, 4, 0, 0F); // Box 520 frame stripe fix
		bodyModel[428].setRotationPoint(-9F, 0F, 10.51F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 521 cull torp tube support
		bodyModel[429].setRotationPoint(1F, -21.5F, -5.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[430].setRotationPoint(-8F, -10F, 11.01F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1.25F, -3F, 0F, -1.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, 0.25F, 0F, 0F); // Box 523
		bodyModel[431].setRotationPoint(-11F, -13F, 11.01F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 524
		bodyModel[432].setRotationPoint(-9F, -10F, 11.01F);

		bodyModel[433].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 526
		bodyModel[433].setRotationPoint(-31F, -11F, -11.01F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 527
		bodyModel[434].setRotationPoint(-31.5F, -10F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 10, 3, 20, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[435].setRotationPoint(-1.25F, 4.1F, -10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[436].setRotationPoint(-1.25F, 7.1F, -8F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 506
		bodyModel[437].setRotationPoint(-1.25F, 3.85F, -9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[438].setRotationPoint(-26F, -25F, -2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[439].setRotationPoint(-15F, -23F, -5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base owo
		bodyModel[440].setRotationPoint(-26F, -25F, -2.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon owo
		bodyModel[441].setRotationPoint(-26F, -26F, -2.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[442].setRotationPoint(-3.5F, -21F, -2.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[443].setRotationPoint(-9.5F, -21F, -2.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 683 fan
		bodyModel[444].setRotationPoint(23.5F, -21F, -2.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 684 fan
		bodyModel[445].setRotationPoint(17.5F, -21F, -2.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 1F, 15.5F, 0F, 1F, 15.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[446].setRotationPoint(-9.25F, 3.5F, -8F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 1F, 0F, 0F, 1F); // Box 512
		bodyModel[447].setRotationPoint(-9.25F, 1.5F, -9F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 15.5F, 0F, 1F, 15.5F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[448].setRotationPoint(-9.25F, 1.5F, 7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 514 brw 42 rear triangle
		bodyModel[449].setRotationPoint(38.01F, 6.5F, 0F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515 brw 42 rear triangle
		bodyModel[450].setRotationPoint(38.01F, 6.5F, 8F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 510 horn amtk 582
		bodyModel[451].setRotationPoint(2.5F, -21.5F, -0.5F);

		bodyModel[452].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 511 horn amtk 582
		bodyModel[452].setRotationPoint(0.5F, -22.5F, 0.5F);

		bodyModel[453].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 512 horn amtk 582
		bodyModel[453].setRotationPoint(2.5F, -22.5F, -0.5F);

		bodyModel[454].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 513 horn amtk 582
		bodyModel[454].setRotationPoint(0.5F, -22.5F, -1.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F); // Box 322 brw 42 markerlight
		bodyModel[455].setRotationPoint(31.1F, -19.25F, 5.51F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F); // Box 324 brw 42 markerlight
		bodyModel[456].setRotationPoint(31.1F, -19.25F, -6.51F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F); // Box 298 marker box  brw 42
		bodyModel[457].setRotationPoint(31.1F, -19.5F, -7F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F); // Box 299 marker box brw 42
		bodyModel[458].setRotationPoint(31.1F, -19.5F, 5F);

		bodyModel[459].addShapeBox(-0.5F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedo glow
		bodyModel[459].setRotationPoint(-26.1F, -17.5F, 7.25F);
		bodyModel[459].rotateAngleY = -1.57079633F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516 ditchlight cull fcen 50
		bodyModel[460].setRotationPoint(37F, 0.99F, -4.75F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 517 ditchlight rear down 3
		bodyModel[461].setRotationPoint(37.75F, 1F, -4.75F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 518 ditchlight rear down 3
		bodyModel[462].setRotationPoint(37.75F, 1F, 6.75F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519 ditchlight cull fcen 50
		bodyModel[463].setRotationPoint(37F, 0.99F, 6.75F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.5F, 0F, 0.25F); // Box 524 cull beacon mount
		bodyModel[464].setRotationPoint(34.5F, -20F, -0.5F);

		bodyModel[465].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 525 scbg mystery box
		bodyModel[465].setRotationPoint(-11F, -5F, -11F);

		bodyModel[466].addBox(0F, 0F, 0F, 7, 5, 8, 0F); // Box 526 CGRX 2508 batbox
		bodyModel[466].setRotationPoint(-8.63F, 4F, -10.5F);

		bodyModel[467].addBox(0F, 0F, 0F, 7, 5, 8, 0F); // Box 527 CGRX 2508 batbox
		bodyModel[467].setRotationPoint(-8.63F, 4F, 2.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528 tcw moment
		bodyModel[468].setRotationPoint(-11F, -8F, -11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 529 watx 6 spark arrestor
		bodyModel[469].setRotationPoint(5F, -23F, -1.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 530 watx 6 spark arrestor
		bodyModel[470].setRotationPoint(13F, -23F, -1.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 531 ecrx spark arrestor
		bodyModel[471].setRotationPoint(7.75F, -23F, -1.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 532 ecrx spark arrestor
		bodyModel[472].setRotationPoint(10.25F, -23F, -1.5F);

		bodyModel[473].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 533
		bodyModel[473].setRotationPoint(-26F, -25F, 6.75F);

		bodyModel[474].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 534
		bodyModel[474].setRotationPoint(-26F, -25F, 5.5F);

		bodyModel[475].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 535
		bodyModel[475].setRotationPoint(-26.75F, -24F, 6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -2F, 0.5F, -2.5F, -2F); // Box 536 cull c&c / cagy beacon protector
		bodyModel[476].setRotationPoint(-28F, -25F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 537 fcen rear horn
		bodyModel[477].setRotationPoint(29F, -21.25F, 4F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 538 rear horn fcen
		bodyModel[478].setRotationPoint(29F, -21.25F, 6F);

		bodyModel[479].addBox(0F, 0F, 0F, 11, 3, 4, 0F); // Box 539 cull fcen 48 spark arrestor
		bodyModel[479].setRotationPoint(5F, -23F, -2F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 540 cull fcen 48 spark arrestor
		bodyModel[480].setRotationPoint(5F, -24F, -1F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[481].setRotationPoint(-15F, -28F, 0F);
	}

	ModelBlombergBnew theBlomb = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();
	ModelCF7_ANE_Antennae ear = new ModelCF7_ANE_Antennae();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6||GetColor(entity) == 19
				||GetColor(entity) == 1219||GetColor(entity) == 119
		) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8||GetColor(entity) == 21
				||GetColor(entity) == 23||GetColor(entity) == 10) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 17) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 18) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Beansniff_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 15||GetColor(entity) == 24
		||GetColor(entity) == 25) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			if (((AbstractTrains) entity).getColor() == 15) {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/CF7a_White.png"));
				GL11.glPushMatrix();
				//GL11.glTranslated(-1.3, -0.025, 0);
				ear.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		} else if (GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_FNCC.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}