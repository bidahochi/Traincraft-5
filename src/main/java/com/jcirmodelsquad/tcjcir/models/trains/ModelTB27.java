//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.10.2022 - 19:53:51
// Last changed on: 04.10.2022 - 19:53:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelHiAd;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelTB27 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelTB27() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[341];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 6, 21, textureX, textureY, "ditch"); // Box 555 ditchlight r mccloud
		bodyModel[1] = new ModelRendererTurbo(this, 6, 21, textureX, textureY, "ditch"); // Box 554 ditchlight r mccloud
		bodyModel[2] = new ModelRendererTurbo(this, 13, 21, textureX, textureY, "cull"); // Box 553 cull
		bodyModel[3] = new ModelRendererTurbo(this, 13, 21, textureX, textureY, "cull"); // Box 552 cull
		bodyModel[4] = new ModelRendererTurbo(this, 6, 26, textureX, textureY, "ditch"); // Box 551 ditchlight f mccloud
		bodyModel[5] = new ModelRendererTurbo(this, 6, 26, textureX, textureY, "ditch"); // Box 550 ditchlight f mccloud
		bodyModel[6] = new ModelRendererTurbo(this, 13, 26, textureX, textureY, "cull"); // Box 549 cull
		bodyModel[7] = new ModelRendererTurbo(this, 13, 26, textureX, textureY, "cull"); // Box 548 cull
		bodyModel[8] = new ModelRendererTurbo(this, 131, 20, textureX, textureY); // Box 1203
		bodyModel[9] = new ModelRendererTurbo(this, 47, 11, textureX, textureY); // Box 245
		bodyModel[10] = new ModelRendererTurbo(this, 56, 17, textureX, textureY); // Box 78
		bodyModel[11] = new ModelRendererTurbo(this, 56, 14, textureX, textureY); // Box 74
		bodyModel[12] = new ModelRendererTurbo(this, 56, 11, textureX, textureY); // Box 114
		bodyModel[13] = new ModelRendererTurbo(this, 64, 9, textureX, textureY); // Box 413
		bodyModel[14] = new ModelRendererTurbo(this, 67, 14, textureX, textureY); // Box 412
		bodyModel[15] = new ModelRendererTurbo(this, 64, 11, textureX, textureY); // Box 411
		bodyModel[16] = new ModelRendererTurbo(this, 69, 9, textureX, textureY); // Box 410
		bodyModel[17] = new ModelRendererTurbo(this, 61, 17, textureX, textureY); // Box 393
		bodyModel[18] = new ModelRendererTurbo(this, 74, 16, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[19] = new ModelRendererTurbo(this, 75, 13, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 75, 10, textureX, textureY); // Box 74
		bodyModel[21] = new ModelRendererTurbo(this, 75, 7, textureX, textureY); // Box 114
		bodyModel[22] = new ModelRendererTurbo(this, 88, 30, textureX, textureY); // Box 330
		bodyModel[23] = new ModelRendererTurbo(this, 82, 21, textureX, textureY); // Box 329
		bodyModel[24] = new ModelRendererTurbo(this, 84, 27, textureX, textureY); // Box 328
		bodyModel[25] = new ModelRendererTurbo(this, 82, 24, textureX, textureY); // Box 327
		bodyModel[26] = new ModelRendererTurbo(this, 94, 23, textureX, textureY); // Box 307
		bodyModel[27] = new ModelRendererTurbo(this, 108, 22, textureX, textureY); // Box 446
		bodyModel[28] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 450
		bodyModel[29] = new ModelRendererTurbo(this, 75, 24, textureX, textureY); // Box 364
		bodyModel[30] = new ModelRendererTurbo(this, 75, 21, textureX, textureY); // Box 363
		bodyModel[31] = new ModelRendererTurbo(this, 75, 27, textureX, textureY); // Box 362
		bodyModel[32] = new ModelRendererTurbo(this, 66, 24, textureX, textureY, "cull"); // Box 361 cull
		bodyModel[33] = new ModelRendererTurbo(this, 75, 34, textureX, textureY); // Box 405
		bodyModel[34] = new ModelRendererTurbo(this, 66, 30, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[35] = new ModelRendererTurbo(this, 80, 34, textureX, textureY); // Box 404
		bodyModel[36] = new ModelRendererTurbo(this, 85, 34, textureX, textureY); // Box 403
		bodyModel[37] = new ModelRendererTurbo(this, 94, 28, textureX, textureY); // Box 564
		bodyModel[38] = new ModelRendererTurbo(this, 94, 26, textureX, textureY); // Box 563
		bodyModel[39] = new ModelRendererTurbo(this, 107, 32, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[40] = new ModelRendererTurbo(this, 107, 28, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[41] = new ModelRendererTurbo(this, 107, 28, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[42] = new ModelRendererTurbo(this, 107, 28, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[43] = new ModelRendererTurbo(this, 107, 28, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[44] = new ModelRendererTurbo(this, 116, 28, textureX, textureY); // Box 421 prime base
		bodyModel[45] = new ModelRendererTurbo(this, 94, 31, textureX, textureY); // Box 574
		bodyModel[46] = new ModelRendererTurbo(this, 94, 37, textureX, textureY); // Box 573
		bodyModel[47] = new ModelRendererTurbo(this, 103, 37, textureX, textureY); // Box 572
		bodyModel[48] = new ModelRendererTurbo(this, 94, 34, textureX, textureY); // Box 571
		bodyModel[49] = new ModelRendererTurbo(this, 80, 58, textureX, textureY, "cull"); // Box 285 cull brake lever
		bodyModel[50] = new ModelRendererTurbo(this, 87, 61, textureX, textureY); // Box 43
		bodyModel[51] = new ModelRendererTurbo(this, 90, 66, textureX, textureY); // Box 43
		bodyModel[52] = new ModelRendererTurbo(this, 59, 40, textureX, textureY); // Box 282
		bodyModel[53] = new ModelRendererTurbo(this, 84, 52, textureX, textureY); // Box 327
		bodyModel[54] = new ModelRendererTurbo(this, 78, 45, textureX, textureY); // Box 86
		bodyModel[55] = new ModelRendererTurbo(this, 99, 45, textureX, textureY); // Box 413
		bodyModel[56] = new ModelRendererTurbo(this, 32, 213, textureX, textureY); // Box 289
		bodyModel[57] = new ModelRendererTurbo(this, 35, 210, textureX, textureY); // Box 288
		bodyModel[58] = new ModelRendererTurbo(this, 34, 208, textureX, textureY); // Box 287
		bodyModel[59] = new ModelRendererTurbo(this, 35, 203, textureX, textureY); // Box 286
		bodyModel[60] = new ModelRendererTurbo(this, 34, 199, textureX, textureY); // Box 285
		bodyModel[61] = new ModelRendererTurbo(this, 34, 201, textureX, textureY); // Box 284
		bodyModel[62] = new ModelRendererTurbo(this, 34, 197, textureX, textureY); // Box 283
		bodyModel[63] = new ModelRendererTurbo(this, 22, 213, textureX, textureY); // Box 282
		bodyModel[64] = new ModelRendererTurbo(this, 25, 210, textureX, textureY); // Box 281
		bodyModel[65] = new ModelRendererTurbo(this, 24, 208, textureX, textureY); // Box 280
		bodyModel[66] = new ModelRendererTurbo(this, 24, 201, textureX, textureY); // Box 279
		bodyModel[67] = new ModelRendererTurbo(this, 25, 203, textureX, textureY); // Box 278
		bodyModel[68] = new ModelRendererTurbo(this, 24, 199, textureX, textureY); // Box 277
		bodyModel[69] = new ModelRendererTurbo(this, 24, 197, textureX, textureY); // Box 276
		bodyModel[70] = new ModelRendererTurbo(this, 24, 197, textureX, textureY); // Box 275
		bodyModel[71] = new ModelRendererTurbo(this, 189, 85, textureX, textureY); // Box 274
		bodyModel[72] = new ModelRendererTurbo(this, 185, 95, textureX, textureY); // Box 273
		bodyModel[73] = new ModelRendererTurbo(this, 192, 85, textureX, textureY); // Box 273
		bodyModel[74] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 272
		bodyModel[75] = new ModelRendererTurbo(this, 241, 189, textureX, textureY); // Box 271
		bodyModel[76] = new ModelRendererTurbo(this, 241, 181, textureX, textureY); // Box 270
		bodyModel[77] = new ModelRendererTurbo(this, 212, 190, textureX, textureY); // Box 269
		bodyModel[78] = new ModelRendererTurbo(this, 212, 183, textureX, textureY); // Box 268
		bodyModel[79] = new ModelRendererTurbo(this, 252, 189, textureX, textureY); // Box 267
		bodyModel[80] = new ModelRendererTurbo(this, 375, 162, textureX, textureY); // Box 266
		bodyModel[81] = new ModelRendererTurbo(this, 378, 162, textureX, textureY); // Box 265
		bodyModel[82] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 264
		bodyModel[83] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 263
		bodyModel[84] = new ModelRendererTurbo(this, 371, 185, textureX, textureY); // Box 262
		bodyModel[85] = new ModelRendererTurbo(this, 157, 23, textureX, textureY, "cull"); // Box 261
		bodyModel[86] = new ModelRendererTurbo(this, 181, 2, textureX, textureY); // Box 260
		bodyModel[87] = new ModelRendererTurbo(this, 163, 5, textureX, textureY, "commander"); // Box 259 glow commander beacon
		bodyModel[88] = new ModelRendererTurbo(this, 160, 62, textureX, textureY, "cull"); // Box 258
		bodyModel[89] = new ModelRendererTurbo(this, 94, 4, textureX, textureY); // Box 1088
		bodyModel[90] = new ModelRendererTurbo(this, 92, 9, textureX, textureY, "cull"); // Box 1087 cull aww
		bodyModel[91] = new ModelRendererTurbo(this, 121, 4, textureX, textureY); // Box 5
		bodyModel[92] = new ModelRendererTurbo(this, 119, 9, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[93] = new ModelRendererTurbo(this, 174, 17, textureX, textureY); // Box 184 o2 generator
		bodyModel[94] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 458
		bodyModel[95] = new ModelRendererTurbo(this, 163, 1, textureX, textureY); // Box 457
		bodyModel[96] = new ModelRendererTurbo(this, 179, 9, textureX, textureY); // Box 456
		bodyModel[97] = new ModelRendererTurbo(this, 179, 9, textureX, textureY); // Box 455
		bodyModel[98] = new ModelRendererTurbo(this, 174, 2, textureX, textureY); // Box 316
		bodyModel[99] = new ModelRendererTurbo(this, 169, 5, textureX, textureY, "commander"); // Box 315 glow commander beacon
		bodyModel[100] = new ModelRendererTurbo(this, 6, 31, textureX, textureY, "cull"); // Box 317 cull
		bodyModel[101] = new ModelRendererTurbo(this, 13, 31, textureX, textureY, "ditch"); // Box 316 ditchlight r l
		bodyModel[102] = new ModelRendererTurbo(this, 6, 31, textureX, textureY, "ditch"); // Box 313 ditchlight r l
		bodyModel[103] = new ModelRendererTurbo(this, 13, 31, textureX, textureY, "cull"); // Box 312 cull
		bodyModel[104] = new ModelRendererTurbo(this, 6, 36, textureX, textureY, "ditch"); // Box 445 ditchlight f l
		bodyModel[105] = new ModelRendererTurbo(this, 13, 36, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[106] = new ModelRendererTurbo(this, 6, 36, textureX, textureY, "ditch"); // Box 275 ditchlight f l
		bodyModel[107] = new ModelRendererTurbo(this, 13, 36, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[108] = new ModelRendererTurbo(this, 55, 232, textureX, textureY); // Box 247
		bodyModel[109] = new ModelRendererTurbo(this, 90, 229, textureX, textureY); // Box 246
		bodyModel[110] = new ModelRendererTurbo(this, 52, 232, textureX, textureY); // Box 245
		bodyModel[111] = new ModelRendererTurbo(this, 58, 232, textureX, textureY); // Box 244
		bodyModel[112] = new ModelRendererTurbo(this, 100, 235, textureX, textureY); // Box 243
		bodyModel[113] = new ModelRendererTurbo(this, 100, 215, textureX, textureY); // Box 242
		bodyModel[114] = new ModelRendererTurbo(this, 100, 217, textureX, textureY); // Box 241
		bodyModel[115] = new ModelRendererTurbo(this, 55, 234, textureX, textureY); // Box 240
		bodyModel[116] = new ModelRendererTurbo(this, 95, 229, textureX, textureY); // Box 239
		bodyModel[117] = new ModelRendererTurbo(this, 46, 232, textureX, textureY); // Box 238
		bodyModel[118] = new ModelRendererTurbo(this, 58, 234, textureX, textureY); // Box 237
		bodyModel[119] = new ModelRendererTurbo(this, 100, 226, textureX, textureY); // Box 236
		bodyModel[120] = new ModelRendererTurbo(this, 111, 215, textureX, textureY); // Box 235
		bodyModel[121] = new ModelRendererTurbo(this, 61, 208, textureX, textureY); // Box 350
		bodyModel[122] = new ModelRendererTurbo(this, 55, 215, textureX, textureY); // Box 345
		bodyModel[123] = new ModelRendererTurbo(this, 58, 215, textureX, textureY); // Box 344
		bodyModel[124] = new ModelRendererTurbo(this, 55, 213, textureX, textureY); // Box 343
		bodyModel[125] = new ModelRendererTurbo(this, 58, 213, textureX, textureY); // Box 342
		bodyModel[126] = new ModelRendererTurbo(this, 95, 210, textureX, textureY); // Box 341
		bodyModel[127] = new ModelRendererTurbo(this, 52, 213, textureX, textureY); // Box 340
		bodyModel[128] = new ModelRendererTurbo(this, 46, 213, textureX, textureY); // Box 339
		bodyModel[129] = new ModelRendererTurbo(this, 90, 210, textureX, textureY); // Box 338
		bodyModel[130] = new ModelRendererTurbo(this, 64, 208, textureX, textureY); // Box 336
		bodyModel[131] = new ModelRendererTurbo(this, 122, 217, textureX, textureY); // Box 224
		bodyModel[132] = new ModelRendererTurbo(this, 128, 220, textureX, textureY); // Box 223
		bodyModel[133] = new ModelRendererTurbo(this, 131, 220, textureX, textureY); // Box 222
		bodyModel[134] = new ModelRendererTurbo(this, 125, 217, textureX, textureY); // Box 349
		bodyModel[135] = new ModelRendererTurbo(this, 129, 220, textureX, textureY); // Box 253
		bodyModel[136] = new ModelRendererTurbo(this, 111, 217, textureX, textureY); // Box 721
		bodyModel[137] = new ModelRendererTurbo(this, 310, 224, textureX, textureY); // Box 1170
		bodyModel[138] = new ModelRendererTurbo(this, 337, 229, textureX, textureY); // Box 1169
		bodyModel[139] = new ModelRendererTurbo(this, 347, 229, textureX, textureY); // Box 1168
		bodyModel[140] = new ModelRendererTurbo(this, 306, 234, textureX, textureY); // Box 1167
		bodyModel[141] = new ModelRendererTurbo(this, 323, 231, textureX, textureY); // Box 1164
		bodyModel[142] = new ModelRendererTurbo(this, 321, 218, textureX, textureY); // Box 1163
		bodyModel[143] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[144] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[145] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[146] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[147] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[148] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[149] = new ModelRendererTurbo(this, 23, 217, textureX, textureY); // Box 202
		bodyModel[150] = new ModelRendererTurbo(this, 32, 217, textureX, textureY); // Box 201
		bodyModel[151] = new ModelRendererTurbo(this, 398, 72, textureX, textureY); // Box 200
		bodyModel[152] = new ModelRendererTurbo(this, 392, 76, textureX, textureY); // Box 199
		bodyModel[153] = new ModelRendererTurbo(this, 398, 72, textureX, textureY); // Box 198
		bodyModel[154] = new ModelRendererTurbo(this, 392, 76, textureX, textureY); // Box 197
		bodyModel[155] = new ModelRendererTurbo(this, 126, 49, textureX, textureY); // Box 27
		bodyModel[156] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 26
		bodyModel[157] = new ModelRendererTurbo(this, 126, 57, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 137, 51, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 428
		bodyModel[160] = new ModelRendererTurbo(this, 247, 12, textureX, textureY); // Box 427
		bodyModel[161] = new ModelRendererTurbo(this, 215, 11, textureX, textureY); // Box 426
		bodyModel[162] = new ModelRendererTurbo(this, 271, 18, textureX, textureY); // Box 185
		bodyModel[163] = new ModelRendererTurbo(this, 143, 64, textureX, textureY); // Box 184
		bodyModel[164] = new ModelRendererTurbo(this, 279, 18, textureX, textureY); // Box 183
		bodyModel[165] = new ModelRendererTurbo(this, 143, 64, textureX, textureY); // Box 182
		bodyModel[166] = new ModelRendererTurbo(this, 228, 22, textureX, textureY); // Box 181
		bodyModel[167] = new ModelRendererTurbo(this, 228, 26, textureX, textureY); // Box 180
		bodyModel[168] = new ModelRendererTurbo(this, 259, 24, textureX, textureY); // Box 318
		bodyModel[169] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 179
		bodyModel[170] = new ModelRendererTurbo(this, 321, 11, textureX, textureY); // Box 69
		bodyModel[171] = new ModelRendererTurbo(this, 156, 58, textureX, textureY); // Box 362
		bodyModel[172] = new ModelRendererTurbo(this, 215, 11, textureX, textureY); // Box 141
		bodyModel[173] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 141
		bodyModel[174] = new ModelRendererTurbo(this, 247, 12, textureX, textureY); // Box 115
		bodyModel[175] = new ModelRendererTurbo(this, 287, 18, textureX, textureY); // Box 53
		bodyModel[176] = new ModelRendererTurbo(this, 215, 26, textureX, textureY); // Box 68
		bodyModel[177] = new ModelRendererTurbo(this, 143, 64, textureX, textureY); // Box 67
		bodyModel[178] = new ModelRendererTurbo(this, 215, 22, textureX, textureY); // Box 62
		bodyModel[179] = new ModelRendererTurbo(this, 143, 64, textureX, textureY); // Box 246
		bodyModel[180] = new ModelRendererTurbo(this, 295, 18, textureX, textureY); // Box 245
		bodyModel[181] = new ModelRendererTurbo(this, 259, 24, textureX, textureY); // Box 201
		bodyModel[182] = new ModelRendererTurbo(this, 26, 217, textureX, textureY); // Box 169
		bodyModel[183] = new ModelRendererTurbo(this, 332, 37, textureX, textureY); // Box 167
		bodyModel[184] = new ModelRendererTurbo(this, 332, 41, textureX, textureY); // Box 166
		bodyModel[185] = new ModelRendererTurbo(this, 365, 82, textureX, textureY); // Box 165
		bodyModel[186] = new ModelRendererTurbo(this, 365, 73, textureX, textureY); // Box 164
		bodyModel[187] = new ModelRendererTurbo(this, 396, 152, textureX, textureY); // Box 163
		bodyModel[188] = new ModelRendererTurbo(this, 364, 138, textureX, textureY, "lamp"); // Box 162 numberboard glow
		bodyModel[189] = new ModelRendererTurbo(this, 359, 142, textureX, textureY, "lamp"); // Box 161 markerlight glow
		bodyModel[190] = new ModelRendererTurbo(this, 359, 135, textureX, textureY, "lamp"); // Box 160 markerlight glow
		bodyModel[191] = new ModelRendererTurbo(this, 364, 131, textureX, textureY, "lamp"); // Box 159 numberboard glow
		bodyModel[192] = new ModelRendererTurbo(this, 362, 146, textureX, textureY); // Box 158
		bodyModel[193] = new ModelRendererTurbo(this, 354, 147, textureX, textureY); // Box 157
		bodyModel[194] = new ModelRendererTurbo(this, 367, 147, textureX, textureY); // Box 156
		bodyModel[195] = new ModelRendererTurbo(this, 346, 133, textureX, textureY, "lamp"); // Box 155 markerlight glow
		bodyModel[196] = new ModelRendererTurbo(this, 326, 139, textureX, textureY, "lamp"); // Box 154 numberboard glow
		bodyModel[197] = new ModelRendererTurbo(this, 206, 168, textureX, textureY); // Box 157
		bodyModel[198] = new ModelRendererTurbo(this, 219, 178, textureX, textureY); // Box 156
		bodyModel[199] = new ModelRendererTurbo(this, 223, 170, textureX, textureY); // Box 155
		bodyModel[200] = new ModelRendererTurbo(this, 224, 178, textureX, textureY); // Box 154
		bodyModel[201] = new ModelRendererTurbo(this, 231, 178, textureX, textureY); // Box 153
		bodyModel[202] = new ModelRendererTurbo(this, 226, 170, textureX, textureY); // Box 152
		bodyModel[203] = new ModelRendererTurbo(this, 219, 173, textureX, textureY); // Box 151
		bodyModel[204] = new ModelRendererTurbo(this, 333, 133, textureX, textureY, "lamp"); // Box 150 markerlight glow
		bodyModel[205] = new ModelRendererTurbo(this, 234, 197, textureX, textureY); // Box 149
		bodyModel[206] = new ModelRendererTurbo(this, 339, 139, textureX, textureY, "lamp"); // Box 145 numberboad glow
		bodyModel[207] = new ModelRendererTurbo(this, 325, 131, textureX, textureY); // Box 144
		bodyModel[208] = new ModelRendererTurbo(this, 229, 170, textureX, textureY); // Box 143
		bodyModel[209] = new ModelRendererTurbo(this, 232, 170, textureX, textureY); // Box 142
		bodyModel[210] = new ModelRendererTurbo(this, 338, 131, textureX, textureY); // Box 141
		bodyModel[211] = new ModelRendererTurbo(this, 388, 145, textureX, textureY); // Box 623
		bodyModel[212] = new ModelRendererTurbo(this, 407, 138, textureX, textureY); // Box 624
		bodyModel[213] = new ModelRendererTurbo(this, 407, 141, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[214] = new ModelRendererTurbo(this, 391, 141, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[215] = new ModelRendererTurbo(this, 403, 145, textureX, textureY); // Box 627
		bodyModel[216] = new ModelRendererTurbo(this, 391, 138, textureX, textureY); // Box 628
		bodyModel[217] = new ModelRendererTurbo(this, 402, 142, textureX, textureY, "lamp"); // Box 254 markerlight glow
		bodyModel[218] = new ModelRendererTurbo(this, 418, 142, textureX, textureY, "lamp"); // Box 264 markerlight glow
		bodyModel[219] = new ModelRendererTurbo(this, 199, 168, textureX, textureY); // Box 160
		bodyModel[220] = new ModelRendererTurbo(this, 226, 173, textureX, textureY); // Box 159
		bodyModel[221] = new ModelRendererTurbo(this, 233, 173, textureX, textureY); // Box 158
		bodyModel[222] = new ModelRendererTurbo(this, 310, 37, textureX, textureY); // Box 157
		bodyModel[223] = new ModelRendererTurbo(this, 321, 37, textureX, textureY); // Box 438 brc stack
		bodyModel[224] = new ModelRendererTurbo(this, 231, 104, textureX, textureY); // Box 157
		bodyModel[225] = new ModelRendererTurbo(this, 246, 104, textureX, textureY); // Box 155
		bodyModel[226] = new ModelRendererTurbo(this, 235, 85, textureX, textureY); // Box 156
		bodyModel[227] = new ModelRendererTurbo(this, 263, 85, textureX, textureY); // Box 503
		bodyModel[228] = new ModelRendererTurbo(this, 250, 86, textureX, textureY); // Box 502
		bodyModel[229] = new ModelRendererTurbo(this, 186, 122, textureX, textureY, "lamp"); // Box 146 headlight cabend down
		bodyModel[230] = new ModelRendererTurbo(this, 186, 117, textureX, textureY, "lamp"); // Box 145 headlight cabend down
		bodyModel[231] = new ModelRendererTurbo(this, 170, 105, textureX, textureY); // Box 144
		bodyModel[232] = new ModelRendererTurbo(this, 179, 112, textureX, textureY, "lamp"); // Box 142 headlight cabend up
		bodyModel[233] = new ModelRendererTurbo(this, 186, 112, textureX, textureY, "lamp"); // Box 141 headlight cabend up
		bodyModel[234] = new ModelRendererTurbo(this, 179, 105, textureX, textureY); // Box 140
		bodyModel[235] = new ModelRendererTurbo(this, 201, 122, textureX, textureY, "lamp"); // Box 149 headlight front 6c
		bodyModel[236] = new ModelRendererTurbo(this, 192, 105, textureX, textureY); // Box 150 chop headlight supportis
		bodyModel[237] = new ModelRendererTurbo(this, 201, 117, textureX, textureY, "lamp"); // Box 149 headlight front 5c
		bodyModel[238] = new ModelRendererTurbo(this, 199, 105, textureX, textureY); // Box 612
		bodyModel[239] = new ModelRendererTurbo(this, 194, 112, textureX, textureY, "lamp"); // Box 611 gyralight double front sp
		bodyModel[240] = new ModelRendererTurbo(this, 201, 112, textureX, textureY, "lamp"); // Box 610 gyralight double front sp
		bodyModel[241] = new ModelRendererTurbo(this, 159, 103, textureX, textureY); // Box 607
		bodyModel[242] = new ModelRendererTurbo(this, 383, 66, textureX, textureY); // Box 127
		bodyModel[243] = new ModelRendererTurbo(this, 359, 67, textureX, textureY); // Box 126
		bodyModel[244] = new ModelRendererTurbo(this, 370, 66, textureX, textureY); // Box 125
		bodyModel[245] = new ModelRendererTurbo(this, 459, 76, textureX, textureY); // Box 122
		bodyModel[246] = new ModelRendererTurbo(this, 478, 76, textureX, textureY); // Box 121
		bodyModel[247] = new ModelRendererTurbo(this, 29, 217, textureX, textureY); // Box 135
		bodyModel[248] = new ModelRendererTurbo(this, 2, 212, textureX, textureY); // Box 134
		bodyModel[249] = new ModelRendererTurbo(this, 64, 191, textureX, textureY); // Box 133
		bodyModel[250] = new ModelRendererTurbo(this, 75, 191, textureX, textureY); // Box 126
		bodyModel[251] = new ModelRendererTurbo(this, 64, 182, textureX, textureY); // Box 119
		bodyModel[252] = new ModelRendererTurbo(this, 24, 199, textureX, textureY); // Box 118
		bodyModel[253] = new ModelRendererTurbo(this, 25, 203, textureX, textureY); // Box 117
		bodyModel[254] = new ModelRendererTurbo(this, 25, 210, textureX, textureY); // Box 116
		bodyModel[255] = new ModelRendererTurbo(this, 24, 208, textureX, textureY); // Box 115
		bodyModel[256] = new ModelRendererTurbo(this, 24, 201, textureX, textureY); // Box 114
		bodyModel[257] = new ModelRendererTurbo(this, 22, 213, textureX, textureY); // Box 113
		bodyModel[258] = new ModelRendererTurbo(this, 75, 182, textureX, textureY); // Box 112
		bodyModel[259] = new ModelRendererTurbo(this, 34, 201, textureX, textureY); // Box 440
		bodyModel[260] = new ModelRendererTurbo(this, 35, 203, textureX, textureY); // Box 432
		bodyModel[261] = new ModelRendererTurbo(this, 35, 210, textureX, textureY); // Box 412
		bodyModel[262] = new ModelRendererTurbo(this, 34, 208, textureX, textureY); // Box 201
		bodyModel[263] = new ModelRendererTurbo(this, 34, 199, textureX, textureY); // Box 200
		bodyModel[264] = new ModelRendererTurbo(this, 34, 197, textureX, textureY); // Box 199
		bodyModel[265] = new ModelRendererTurbo(this, 32, 213, textureX, textureY); // Box 197
		bodyModel[266] = new ModelRendererTurbo(this, 1, 116, textureX, textureY); // Box 493 424 radiator compartment
		bodyModel[267] = new ModelRendererTurbo(this, 460, 83, textureX, textureY); // Box 500
		bodyModel[268] = new ModelRendererTurbo(this, 308, 57, textureX, textureY); // Box 494
		bodyModel[269] = new ModelRendererTurbo(this, 308, 52, textureX, textureY); // Box 117
		bodyModel[270] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 235
		bodyModel[271] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 234
		bodyModel[272] = new ModelRendererTurbo(this, 333, 24, textureX, textureY); // Box 233
		bodyModel[273] = new ModelRendererTurbo(this, 298, 78, textureX, textureY); // Box 498
		bodyModel[274] = new ModelRendererTurbo(this, 299, 71, textureX, textureY); // Box 497
		bodyModel[275] = new ModelRendererTurbo(this, 299, 84, textureX, textureY); // Box 496
		bodyModel[276] = new ModelRendererTurbo(this, 163, 55, textureX, textureY); // Box 2
		bodyModel[277] = new ModelRendererTurbo(this, 55, 229, textureX, textureY); // Box 324
		bodyModel[278] = new ModelRendererTurbo(this, 64, 230, textureX, textureY); // Box 323
		bodyModel[279] = new ModelRendererTurbo(this, 58, 229, textureX, textureY); // Box 322
		bodyModel[280] = new ModelRendererTurbo(this, 77, 230, textureX, textureY); // Box 321
		bodyModel[281] = new ModelRendererTurbo(this, 55, 232, textureX, textureY); // Box 320
		bodyModel[282] = new ModelRendererTurbo(this, 52, 237, textureX, textureY); // Box 301
		bodyModel[283] = new ModelRendererTurbo(this, 46, 237, textureX, textureY); // Box 300
		bodyModel[284] = new ModelRendererTurbo(this, 49, 237, textureX, textureY); // Box 269
		bodyModel[285] = new ModelRendererTurbo(this, 49, 229, textureX, textureY); // Box 259
		bodyModel[286] = new ModelRendererTurbo(this, 218, 84, textureX, textureY); // Box 61
		bodyModel[287] = new ModelRendererTurbo(this, 207, 100, textureX, textureY); // Box 60
		bodyModel[288] = new ModelRendererTurbo(this, 201, 92, textureX, textureY); // Box 59
		bodyModel[289] = new ModelRendererTurbo(this, 2, 200, textureX, textureY); // Box 52
		bodyModel[290] = new ModelRendererTurbo(this, 58, 210, textureX, textureY); // Box 310
		bodyModel[291] = new ModelRendererTurbo(this, 55, 210, textureX, textureY); // Box 363
		bodyModel[292] = new ModelRendererTurbo(this, 55, 213, textureX, textureY); // Box 308
		bodyModel[293] = new ModelRendererTurbo(this, 77, 211, textureX, textureY); // Box 307
		bodyModel[294] = new ModelRendererTurbo(this, 201, 84, textureX, textureY); // Box 164
		bodyModel[295] = new ModelRendererTurbo(this, 220, 100, textureX, textureY); // Box 163
		bodyModel[296] = new ModelRendererTurbo(this, 218, 92, textureX, textureY); // Box 162
		bodyModel[297] = new ModelRendererTurbo(this, 52, 218, textureX, textureY); // Box 299
		bodyModel[298] = new ModelRendererTurbo(this, 46, 218, textureX, textureY); // Box 298
		bodyModel[299] = new ModelRendererTurbo(this, 64, 211, textureX, textureY); // Box 80
		bodyModel[300] = new ModelRendererTurbo(this, 49, 218, textureX, textureY); // Box 63
		bodyModel[301] = new ModelRendererTurbo(this, 49, 210, textureX, textureY); // Box 61
		bodyModel[302] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 95
		bodyModel[303] = new ModelRendererTurbo(this, 272, 158, textureX, textureY); // Box 38
		bodyModel[304] = new ModelRendererTurbo(this, 334, 159, textureX, textureY); // Box 37
		bodyModel[305] = new ModelRendererTurbo(this, 252, 181, textureX, textureY); // Box 36
		bodyModel[306] = new ModelRendererTurbo(this, 313, 198, textureX, textureY); // Box 314 door swing right
		bodyModel[307] = new ModelRendererTurbo(this, 303, 158, textureX, textureY); // Box 332
		bodyModel[308] = new ModelRendererTurbo(this, 198, 191, textureX, textureY); // Box 313
		bodyModel[309] = new ModelRendererTurbo(this, 247, 201, textureX, textureY); // Box 190
		bodyModel[310] = new ModelRendererTurbo(this, 324, 201, textureX, textureY); // Box 72
		bodyModel[311] = new ModelRendererTurbo(this, 276, 185, textureX, textureY); // Box 70
		bodyModel[312] = new ModelRendererTurbo(this, 223, 198, textureX, textureY); // Box 52 door swing right
		bodyModel[313] = new ModelRendererTurbo(this, 322, 190, textureX, textureY); // Box 304 phase1 bat box
		bodyModel[314] = new ModelRendererTurbo(this, 322, 180, textureX, textureY); // Box 304 phase1 bat box
		bodyModel[315] = new ModelRendererTurbo(this, 398, 210, textureX, textureY); // Box 554 fuel tank lorge
		bodyModel[316] = new ModelRendererTurbo(this, 413, 202, textureX, textureY); // Box 553 fuel tank lorge
		bodyModel[317] = new ModelRendererTurbo(this, 398, 202, textureX, textureY); // Box 552 fuel tank lorge
		bodyModel[318] = new ModelRendererTurbo(this, 349, 201, textureX, textureY); // Box 551 fuel tank lorge
		bodyModel[319] = new ModelRendererTurbo(this, 342, 175, textureX, textureY); // Box 550
		bodyModel[320] = new ModelRendererTurbo(this, 342, 175, textureX, textureY); // Box 549
		bodyModel[321] = new ModelRendererTurbo(this, 342, 175, textureX, textureY); // Box 548
		bodyModel[322] = new ModelRendererTurbo(this, 363, 186, textureX, textureY); // Box 305
		bodyModel[323] = new ModelRendererTurbo(this, 366, 186, textureX, textureY); // Box 305
		bodyModel[324] = new ModelRendererTurbo(this, 342, 175, textureX, textureY); // Box 19
		bodyModel[325] = new ModelRendererTurbo(this, 388, 173, textureX, textureY); // Box 19
		bodyModel[326] = new ModelRendererTurbo(this, 381, 162, textureX, textureY); // Box 305
		bodyModel[327] = new ModelRendererTurbo(this, 384, 162, textureX, textureY); // Box 305
		bodyModel[328] = new ModelRendererTurbo(this, 375, 151, textureX, textureY); // Box 19
		bodyModel[329] = new ModelRendererTurbo(this, 155, 49, textureX, textureY); // Box 206
		bodyModel[330] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 52
		bodyModel[331] = new ModelRendererTurbo(this, 317, 3, textureX, textureY); // Box 0
		bodyModel[332] = new ModelRendererTurbo(this, 265, 108, textureX, textureY); // Box 63
		bodyModel[333] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[334] = new ModelRendererTurbo(this, 50, 21, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[335] = new ModelRendererTurbo(this, 59, 22, textureX, textureY); // Box 307
		bodyModel[336] = new ModelRendererTurbo(this, 168, 9, textureX, textureY, "commander"); // Box 336 commander bacon
		bodyModel[337] = new ModelRendererTurbo(this, 161, 10, textureX, textureY); // Box 337
		bodyModel[338] = new ModelRendererTurbo(this, 434, 197, textureX, textureY); // Box 415
		bodyModel[339] = new ModelRendererTurbo(this, 429, 197, textureX, textureY); // Box 19
		bodyModel[340] = new ModelRendererTurbo(this, 56, 109, textureX, textureY); // Box 396

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 555 ditchlight r mccloud
		bodyModel[0].setRotationPoint(40.5F, -1.1F, -5.75F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight r mccloud
		bodyModel[1].setRotationPoint(40.5F, -1.1F, 3.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553 cull
		bodyModel[2].setRotationPoint(39.5F, -1.1F, 3.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 552 cull
		bodyModel[3].setRotationPoint(39.5F, -1.1F, -5.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight f mccloud
		bodyModel[4].setRotationPoint(-41.55F, -1.25F, 3.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight f mccloud
		bodyModel[5].setRotationPoint(-41.55F, -1.25F, -5.75F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549 cull
		bodyModel[6].setRotationPoint(-41.25F, -1.25F, 3.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548 cull
		bodyModel[7].setRotationPoint(-41.25F, -1.25F, -5.75F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[8].setRotationPoint(-16F, -10F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[9].setRotationPoint(-17.75F, -23F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[10].setRotationPoint(-16F, -20.5F, -0.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[11].setRotationPoint(-16.25F, -22F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[12].setRotationPoint(-16.25F, -21F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[13].setRotationPoint(-9F, -18F, -8.5F);
		bodyModel[13].rotateAngleX = 0.78539816F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 412
		bodyModel[14].setRotationPoint(-11.5F, -15F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[15].setRotationPoint(-13F, -15F, -7.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[16].setRotationPoint(-9F, -18F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[17].setRotationPoint(-13F, -15F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[18].setRotationPoint(-10.5F, 0F, -8.65F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[19].setRotationPoint(-10.25F, 2.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[20].setRotationPoint(-10.5F, 1F, -8.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[21].setRotationPoint(-10.5F, 2F, -8.25F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[22].setRotationPoint(-31.5F, -23.5F, -6.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[23].setRotationPoint(-33.5F, -24.25F, -7.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[24].setRotationPoint(-33F, -24.25F, -5.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[25].setRotationPoint(-34F, -24.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[26].setRotationPoint(-25F, -24F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[27].setRotationPoint(-24F, -25F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[28].setRotationPoint(-25F, -24F, -6F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[29].setRotationPoint(3F, -16.5F, -5.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[30].setRotationPoint(2F, -16.5F, -6.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[31].setRotationPoint(1F, -16.5F, -4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 cull
		bodyModel[32].setRotationPoint(3F, -15.5F, -6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[33].setRotationPoint(10.25F, -17F, -0.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[34].setRotationPoint(10F, -18.5F, -1.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[35].setRotationPoint(10F, -17.5F, -0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[36].setRotationPoint(10F, -18.5F, -0.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 564
		bodyModel[37].setRotationPoint(-27.5F, -24F, 9F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 563
		bodyModel[38].setRotationPoint(-27.5F, -24F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[39].setRotationPoint(-22F, -25F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[40].setRotationPoint(-22F, -26.5F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[41].setRotationPoint(-22F, -26.5F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[42].setRotationPoint(-22F, -26.5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[43].setRotationPoint(-22F, -26.5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[44].setRotationPoint(-22F, -26F, -1F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 574
		bodyModel[45].setRotationPoint(-20.5F, -24.25F, 5.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 573
		bodyModel[46].setRotationPoint(-21F, -24.25F, 3.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 572
		bodyModel[47].setRotationPoint(-20.5F, -23.5F, 4.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 571
		bodyModel[48].setRotationPoint(-23F, -24.5F, 4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285 cull brake lever
		bodyModel[49].setRotationPoint(-30.5F, -14F, -9.98F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[50].setRotationPoint(-29.5F, -11.5F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[51].setRotationPoint(-30F, -13.5F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[52].setRotationPoint(-22F, -15F, 0F);

		bodyModel[53].addBox(3F, 0F, 0F, 4, 2, 3, 0F); // Box 327
		bodyModel[53].setRotationPoint(-27F, -16F, -5.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[54].setRotationPoint(-27F, -16F, -4.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[55].setRotationPoint(-27F, -14F, -5.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 289
		bodyModel[56].setRotationPoint(35.5F, 8F, 8F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 288
		bodyModel[57].setRotationPoint(35.5F, 6F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 287
		bodyModel[58].setRotationPoint(35.5F, 5.5F, 7.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 286
		bodyModel[59].setRotationPoint(35.5F, 1.5F, 7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 285
		bodyModel[60].setRotationPoint(35.5F, 3F, 7.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 284
		bodyModel[61].setRotationPoint(35.5F, 1F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 283
		bodyModel[62].setRotationPoint(35.5F, -1F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 282
		bodyModel[63].setRotationPoint(35.5F, 8F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 281
		bodyModel[64].setRotationPoint(35.5F, 6F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 280
		bodyModel[65].setRotationPoint(35.5F, 5.5F, -8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 279
		bodyModel[66].setRotationPoint(35.5F, 3F, -8.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 278
		bodyModel[67].setRotationPoint(35.5F, 1.5F, -7.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 277
		bodyModel[68].setRotationPoint(35.5F, 1F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 276
		bodyModel[69].setRotationPoint(35.5F, -1F, -8F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 275
		bodyModel[70].setRotationPoint(-39.5F, -1F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[71].setRotationPoint(-10.5F, -4F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 273
		bodyModel[72].setRotationPoint(-11.5F, -3.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[73].setRotationPoint(-10.5F, -4F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 272
		bodyModel[74].setRotationPoint(-11.5F, -3.5F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[75].setRotationPoint(-20F, -23F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[76].setRotationPoint(-32F, -23F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[77].setRotationPoint(-31F, -23F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 268
		bodyModel[78].setRotationPoint(-31F, -23F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[79].setRotationPoint(-20F, -23F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 266
		bodyModel[80].setRotationPoint(7.5F, 0F, 5.1F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 265
		bodyModel[81].setRotationPoint(7.5F, 0F, -5.1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 264
		bodyModel[82].setRotationPoint(9.5F, 4.5F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[83].setRotationPoint(5.5F, 4.5F, -5F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Box 262
		bodyModel[84].setRotationPoint(6.5F, 3.5F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[85].setRotationPoint(-28F, -23F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 260
		bodyModel[86].setRotationPoint(-26F, -24F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 259 glow commander beacon
		bodyModel[87].setRotationPoint(-26.15F, -25F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 258
		bodyModel[88].setRotationPoint(-28F, -23F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[89].setRotationPoint(-28F, -20F, -13F);

		bodyModel[90].addShapeBox(0F, 0F, -2F, 8, 5, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull aww
		bodyModel[90].setRotationPoint(-28F, -19F, -13F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[91].setRotationPoint(-28F, -20F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 3 cull aww
		bodyModel[92].setRotationPoint(-28F, -19F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[93].setRotationPoint(-30.5F, -24.75F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 458
		bodyModel[94].setRotationPoint(33.68F, -18.5F, 3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 457
		bodyModel[95].setRotationPoint(33.53F, -19.5F, 3.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 456
		bodyModel[96].setRotationPoint(33.5F, -17.5F, 4.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 455
		bodyModel[97].setRotationPoint(33.5F, -17.5F, 3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[98].setRotationPoint(-26F, -24F, -9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow commander beacon
		bodyModel[99].setRotationPoint(-26.15F, -25F, -9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 317 cull
		bodyModel[100].setRotationPoint(39F, 0F, 4.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 316 ditchlight r l
		bodyModel[101].setRotationPoint(39.25F, 0F, 4.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 ditchlight r l
		bodyModel[102].setRotationPoint(39.25F, 0F, -6.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 312 cull
		bodyModel[103].setRotationPoint(39F, 0F, -6.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f l
		bodyModel[104].setRotationPoint(-40.25F, 0F, 4.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444 cull
		bodyModel[105].setRotationPoint(-40F, 0F, 4.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f l
		bodyModel[106].setRotationPoint(-40.25F, 0F, -6.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101 cull
		bodyModel[107].setRotationPoint(-40F, 0F, -6.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[108].setRotationPoint(35.5F, 3F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 246
		bodyModel[109].setRotationPoint(36F, -9F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 245
		bodyModel[110].setRotationPoint(36F, -5F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[111].setRotationPoint(35F, -9F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 243
		bodyModel[112].setRotationPoint(-9F, -9F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[113].setRotationPoint(-14F, -14F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 241
		bodyModel[114].setRotationPoint(-19F, -14F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[115].setRotationPoint(35.5F, 3F, 11F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 239
		bodyModel[116].setRotationPoint(36F, -9F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 238
		bodyModel[117].setRotationPoint(36F, -5F, 10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[118].setRotationPoint(35F, -9F, 11F);

		bodyModel[119].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 236
		bodyModel[119].setRotationPoint(-9F, -9F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[120].setRotationPoint(-14F, -14F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[121].setRotationPoint(-35.5F, -9F, 11.02F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 345
		bodyModel[122].setRotationPoint(-36.5F, 3F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 344
		bodyModel[123].setRotationPoint(-36.5F, 3F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 343
		bodyModel[124].setRotationPoint(-36.5F, -9F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		bodyModel[125].setRotationPoint(-36.5F, -9F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 341
		bodyModel[126].setRotationPoint(-36F, -9F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 340
		bodyModel[127].setRotationPoint(-36F, -5F, 10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 339
		bodyModel[128].setRotationPoint(-36F, -5F, -11.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 338
		bodyModel[129].setRotationPoint(-36F, -9F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[130].setRotationPoint(-35.5F, -9F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[131].setRotationPoint(-35F, -9F, -5.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 223
		bodyModel[132].setRotationPoint(-32F, -14F, -5.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 222
		bodyModel[133].setRotationPoint(-32F, -14F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[134].setRotationPoint(-35F, -9F, -0.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 253
		bodyModel[135].setRotationPoint(-35F, -3.5F, -5.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 721
		bodyModel[136].setRotationPoint(-19F, -14F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[137].setRotationPoint(41.5F, 5F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[138].setRotationPoint(41.5F, 5F, 2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[139].setRotationPoint(39.5F, 6F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[140].setRotationPoint(39.5F, 6F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[141].setRotationPoint(42.5F, 7F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[142].setRotationPoint(42.5F, 7F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[143].setRotationPoint(-42.5F, 5F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[144].setRotationPoint(-42.5F, 5F, 2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[145].setRotationPoint(-42.5F, 6F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[146].setRotationPoint(-42.5F, 6F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[147].setRotationPoint(-43.5F, 7F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[148].setRotationPoint(-43.5F, 7F, 0F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 202
		bodyModel[149].setRotationPoint(39.51F, 7F, 10F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 201
		bodyModel[150].setRotationPoint(-39.51F, 7F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -15F, -0.5F, 0F, -15F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		bodyModel[151].setRotationPoint(17.5F, -14.5F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 30, 0, 6, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 1F, 0F, 0F, 1F, 0F); // Box 199
		bodyModel[152].setRotationPoint(17.5F, -15.5F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -15F, -0.5F, 0F, -15F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		bodyModel[153].setRotationPoint(17.5F, -14.5F, -8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 30, 0, 6, 0F,0F, -1F, 0F, -15F, -1F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -15F, 1F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[154].setRotationPoint(17.5F, -15.5F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[155].setRotationPoint(39.5F, 2.5F, -2F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[156].setRotationPoint(40.5F, 3F, -1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[157].setRotationPoint(-40.5F, 2.5F, -2F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[158].setRotationPoint(-43.5F, 3F, -1.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 428
		bodyModel[159].setRotationPoint(37.5F, 3F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 427
		bodyModel[160].setRotationPoint(36.5F, 5F, -3F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 426
		bodyModel[161].setRotationPoint(36.5F, 3F, -3F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 185
		bodyModel[162].setRotationPoint(21.5F, 0F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 184
		bodyModel[163].setRotationPoint(21F, 0F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 183
		bodyModel[164].setRotationPoint(21.5F, 0F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 182
		bodyModel[165].setRotationPoint(21F, 0F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[166].setRotationPoint(21F, 2.5F, 5.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[167].setRotationPoint(21F, 2.5F, -6.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
		bodyModel[168].setRotationPoint(20.5F, 3F, -2F);

		bodyModel[169].addBox(0F, 0F, 0F, 71, 1, 0, 0F); // Box 179
		bodyModel[169].setRotationPoint(-35.5F, 0F, 11F);

		bodyModel[170].addBox(0F, 0F, 0F, 71, 1, 0, 0F); // Box 69
		bodyModel[170].setRotationPoint(-35.5F, 0F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 362
		bodyModel[171].setRotationPoint(-32F, 0F, -10F);
		bodyModel[171].rotateAngleZ = -0.31415927F;

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 141
		bodyModel[172].setRotationPoint(-37.5F, 3F, -3F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 141
		bodyModel[173].setRotationPoint(-39.5F, 3F, -3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[174].setRotationPoint(-37.5F, 5F, -3F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 53
		bodyModel[175].setRotationPoint(-23.5F, 0F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[176].setRotationPoint(-24F, 2.5F, 5.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67
		bodyModel[177].setRotationPoint(-24F, 0F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[178].setRotationPoint(-24F, 2.5F, -6.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
		bodyModel[179].setRotationPoint(-24F, 0F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 245
		bodyModel[180].setRotationPoint(-23.5F, 0F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[181].setRotationPoint(-24.5F, 3F, -2F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 169
		bodyModel[182].setRotationPoint(-39.51F, 7F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[183].setRotationPoint(-7F, -21.25F, -1.5F);
		bodyModel[183].rotateAngleZ = 0.87266463F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[184].setRotationPoint(6F, -21.25F, -1.5F);
		bodyModel[184].rotateAngleZ = 0.87266463F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[185].setRotationPoint(-19F, -15F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[186].setRotationPoint(-19F, -15F, -7F);

		bodyModel[187].addBox(0F, 0F, 0F, 6, 2, 14, 0F); // Box 163
		bodyModel[187].setRotationPoint(-14.5F, -16F, -7F);

		bodyModel[188].addShapeBox(-1F, 0F, -1.9F, 2, 2, 4, 0F,-0.55F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.55F, -0.05F, 0F, -0.55F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.55F, -0.05F, 0F); // Box 162 numberboard glow
		bodyModel[188].setRotationPoint(-18.7F, -22F, 3.7F);
		bodyModel[188].rotateAngleY = 0.29670597F;

		bodyModel[189].addShapeBox(0F, 1F, -3F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 161 markerlight glow
		bodyModel[189].setRotationPoint(-18.7F, -22F, 3.7F);
		bodyModel[189].rotateAngleY = 0.29670597F;

		bodyModel[190].addShapeBox(0F, 1F, 2F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 160 markerlight glow
		bodyModel[190].setRotationPoint(-18.7F, -22F, -3.7F);
		bodyModel[190].rotateAngleY = -0.29670597F;

		bodyModel[191].addShapeBox(-1F, 0F, -2.1F, 2, 2, 4, 0F,-0.55F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.55F, -0.05F, 0F, -0.55F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.55F, -0.05F, 0F); // Box 159 numberboard glow
		bodyModel[191].setRotationPoint(-18.7F, -22F, -3.7F);
		bodyModel[191].rotateAngleY = -0.29670597F;

		bodyModel[192].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 158
		bodyModel[192].setRotationPoint(-19F, -23F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[193].setRotationPoint(-19F, -23F, 1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[194].setRotationPoint(-19F, -23F, -6F);

		bodyModel[195].addShapeBox(-1F, 1F, -3F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 155 markerlight glow
		bodyModel[195].setRotationPoint(-32.3F, -22F, 3.7F);
		bodyModel[195].rotateAngleY = -0.29670597F;

		bodyModel[196].addShapeBox(-1F, 0F, -1.9F, 1, 2, 4, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 154 numberboard glow
		bodyModel[196].setRotationPoint(-32.3F, -22F, 3.7F);
		bodyModel[196].rotateAngleY = -0.29670597F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[197].setRotationPoint(-33F, -23F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[198].setRotationPoint(-35F, -23F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[199].setRotationPoint(-33F, -20F, 11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F); // Box 154
		bodyModel[200].setRotationPoint(-35F, -23F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 153
		bodyModel[201].setRotationPoint(-35F, -23F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[202].setRotationPoint(-33F, -20F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[203].setRotationPoint(-35F, -23F, -11F);

		bodyModel[204].addShapeBox(-1F, 1F, 2F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 150 markerlight glow
		bodyModel[204].setRotationPoint(-32.3F, -22F, -3.7F);
		bodyModel[204].rotateAngleY = 0.29670597F;

		bodyModel[205].addBox(-0.5F, 0F, -0.5F, 1, 14, 5, 0F); // Box 149
		bodyModel[205].setRotationPoint(-31.5F, -20F, -9.5F);

		bodyModel[206].addShapeBox(-1F, 0F, -2.1F, 1, 2, 4, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 145 numberboad glow
		bodyModel[206].setRotationPoint(-32.3F, -22F, -3.7F);
		bodyModel[206].rotateAngleY = 0.29670597F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[207].setRotationPoint(-33F, -22F, 1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[208].setRotationPoint(-19F, -20F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[209].setRotationPoint(-19F, -20F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 141
		bodyModel[210].setRotationPoint(-33F, -22F, -6F);

		bodyModel[211].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[211].setRotationPoint(14F, -18F, -4F);
		bodyModel[211].rotateAngleY = 1.13446401F;

		bodyModel[212].addBox(-2.5F, 2F, 0F, 5, 2, 0, 0F); // Box 624
		bodyModel[212].setRotationPoint(14F, -18F, -4F);
		bodyModel[212].rotateAngleY = 1.13446401F;

		bodyModel[213].addShapeBox(-2.5F, 0F, -1.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[213].setRotationPoint(14F, -18F, -4F);
		bodyModel[213].rotateAngleY = 1.13446401F;

		bodyModel[214].addShapeBox(-2.5F, 0F, 0.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[214].setRotationPoint(14F, -18F, 4F);
		bodyModel[214].rotateAngleY = -1.13446401F;

		bodyModel[215].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[215].setRotationPoint(14F, -18F, 4F);
		bodyModel[215].rotateAngleY = -1.13446401F;

		bodyModel[216].addBox(-2.5F, 2F, 0F, 5, 2, 0, 0F); // Box 628
		bodyModel[216].setRotationPoint(14F, -18F, 4F);
		bodyModel[216].rotateAngleY = -1.13446401F;

		bodyModel[217].addShapeBox(1.5F, 0F, -1.1F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 254 markerlight glow
		bodyModel[217].setRotationPoint(14F, -17.5F, -4F);
		bodyModel[217].rotateAngleY = 1.13446401F;

		bodyModel[218].addShapeBox(1.5F, 0.5F, 0.1F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 264 markerlight glow
		bodyModel[218].setRotationPoint(14F, -18F, 4F);
		bodyModel[218].rotateAngleY = -1.13446401F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[219].setRotationPoint(-19F, -23F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[220].setRotationPoint(-19F, -23F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 3F, 0F); // Box 158
		bodyModel[221].setRotationPoint(-19F, -23F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[222].setRotationPoint(6F, -20.75F, -1.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438 brc stack
		bodyModel[223].setRotationPoint(-7F, -20.75F, -1.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[224].setRotationPoint(33.5F, -15F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[225].setRotationPoint(33.5F, -15F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[226].setRotationPoint(33.5F, -14F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[227].setRotationPoint(33.5F, -14F, 2F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 14, 4, 0F); // Box 502
		bodyModel[228].setRotationPoint(33.5F, -15F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 146 headlight cabend down
		bodyModel[229].setRotationPoint(-34.75F, -21F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 145 headlight cabend down
		bodyModel[230].setRotationPoint(-34.75F, -23F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 144
		bodyModel[231].setRotationPoint(-34F, -23F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 142 headlight cabend up
		bodyModel[232].setRotationPoint(-34.25F, -25F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 141 headlight cabend up
		bodyModel[233].setRotationPoint(-34.25F, -25F, -2F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 140
		bodyModel[234].setRotationPoint(-34F, -25F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 149 headlight front 6c
		bodyModel[235].setRotationPoint(36F, -14F, -1F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 150 chop headlight supportis
		bodyModel[236].setRotationPoint(35.25F, -16F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 149 headlight front 5c
		bodyModel[237].setRotationPoint(36F, -16F, -1F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 612
		bodyModel[238].setRotationPoint(35.75F, -18F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 611 gyralight double front sp
		bodyModel[239].setRotationPoint(36F, -18F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 610 gyralight double front sp
		bodyModel[240].setRotationPoint(36F, -18F, 0F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 607
		bodyModel[241].setRotationPoint(34.75F, -18F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[242].setRotationPoint(32.5F, -15F, 2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[243].setRotationPoint(32.5F, -15F, -2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[244].setRotationPoint(32.5F, -15F, -7F);

		bodyModel[245].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 122
		bodyModel[245].setRotationPoint(24.5F, -6.5F, 6.25F);

		bodyModel[246].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 121
		bodyModel[246].setRotationPoint(24.5F, -6.5F, -7.25F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 135
		bodyModel[247].setRotationPoint(39.51F, 7F, -11F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 134
		bodyModel[248].setRotationPoint(39.51F, -1F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 133
		bodyModel[249].setRotationPoint(35.5F, 0F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[250].setRotationPoint(35.5F, 0F, 6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[251].setRotationPoint(-35.5F, 0F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 118
		bodyModel[252].setRotationPoint(-39.5F, 1F, -8F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 117
		bodyModel[253].setRotationPoint(-39.5F, 1.5F, -7.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 116
		bodyModel[254].setRotationPoint(-39.5F, 6F, -8F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 115
		bodyModel[255].setRotationPoint(-39.5F, 5.5F, -8.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 114
		bodyModel[256].setRotationPoint(-39.5F, 3F, -8.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 113
		bodyModel[257].setRotationPoint(-39.5F, 8F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[258].setRotationPoint(-35.5F, 0F, 6F);

		bodyModel[259].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 440
		bodyModel[259].setRotationPoint(-39.5F, 1F, 7F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 432
		bodyModel[260].setRotationPoint(-39.5F, 1.5F, 7.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 412
		bodyModel[261].setRotationPoint(-39.5F, 6F, 8F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 201
		bodyModel[262].setRotationPoint(-39.5F, 5.5F, 7.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 200
		bodyModel[263].setRotationPoint(-39.5F, 3F, 7.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 199
		bodyModel[264].setRotationPoint(-39.5F, -1F, 7F);

		bodyModel[265].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 197
		bodyModel[265].setRotationPoint(-39.5F, 8F, 8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 493 424 radiator compartment
		bodyModel[266].setRotationPoint(17.5F, -11F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[267].setRotationPoint(17.5F, -15.5F, -2F);

		bodyModel[268].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 494
		bodyModel[268].setRotationPoint(17.5F, -14F, 7F);

		bodyModel[269].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 117
		bodyModel[269].setRotationPoint(17.5F, -14F, -8F);

		bodyModel[270].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 235
		bodyModel[270].setRotationPoint(8.5F, -15.5F, 2F);
		bodyModel[270].rotateAngleX = -0.19198622F;

		bodyModel[271].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 234
		bodyModel[271].setRotationPoint(8.5F, -15.5F, -2F);
		bodyModel[271].rotateAngleX = 0.19198622F;

		bodyModel[272].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 233
		bodyModel[272].setRotationPoint(8.5F, -15.5F, -2F);

		bodyModel[273].addBox(0F, 0F, 0F, 29, 1, 4, 0F); // Box 498
		bodyModel[273].setRotationPoint(-11.5F, -15F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[274].setRotationPoint(-9.5F, -15F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[275].setRotationPoint(-9.5F, -15F, -7F);

		bodyModel[276].addBox(0F, 0F, 0F, 53, 13, 14, 0F); // Box 2
		bodyModel[276].setRotationPoint(-19.5F, -14F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[277].setRotationPoint(39.5F, -8F, 8F);
		bodyModel[277].rotateAngleY = 0.38397244F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[278].setRotationPoint(39.5F, -9F, 2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 322
		bodyModel[279].setRotationPoint(39.5F, -8F, -8F);
		bodyModel[279].rotateAngleY = -0.38397244F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 321
		bodyModel[280].setRotationPoint(39.5F, -9F, -8F);

		bodyModel[281].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 320
		bodyModel[281].setRotationPoint(41.5F, -9F, -2F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[282].setRotationPoint(39.51F, -9F, 11F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[283].setRotationPoint(39.51F, -9F, -10F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[284].setRotationPoint(39.51F, -3F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[285].setRotationPoint(39.51F, -3F, 10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[286].setRotationPoint(39.5F, -1F, -8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[287].setRotationPoint(39.5F, -1F, -2F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[288].setRotationPoint(39.5F, -1F, 2F);

		bodyModel[289].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 52
		bodyModel[289].setRotationPoint(-39.51F, -1F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[290].setRotationPoint(-39.5F, -8F, 8F);
		bodyModel[290].rotateAngleY = -0.38397244F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[291].setRotationPoint(-39.5F, -8F, -8F);
		bodyModel[291].rotateAngleY = 0.38397244F;

		bodyModel[292].addBox(0F, 0F, 0F, 0, 8, 4, 0F); // Box 308
		bodyModel[292].setRotationPoint(-41.5F, -9F, -2F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[293].setRotationPoint(-39.5F, -9F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164
		bodyModel[294].setRotationPoint(-41.5F, -1F, 2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[295].setRotationPoint(-41.5F, -1F, -2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[296].setRotationPoint(-41.5F, -1F, -8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[297].setRotationPoint(-39.5F, -9F, 11F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[298].setRotationPoint(-39.5F, -9F, -10F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[299].setRotationPoint(-39.5F, -9F, -8F);

		bodyModel[300].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[300].setRotationPoint(-39.5F, -3F, -11F);

		bodyModel[301].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[301].setRotationPoint(-39.5F, -3F, 10F);

		bodyModel[302].addBox(0F, 0F, 0F, 22, 5, 22, 0F); // Box 95
		bodyModel[302].setRotationPoint(-33.5F, -6F, -11F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 38
		bodyModel[303].setRotationPoint(-20F, -22F, -7F);

		bodyModel[304].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 37
		bodyModel[304].setRotationPoint(-32F, -23F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[305].setRotationPoint(-32F, -23F, -11F);

		bodyModel[306].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[306].setRotationPoint(-19.5F, -20F, 10.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 332
		bodyModel[307].setRotationPoint(-32F, -22F, -7F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 14, 11, 0F); // Box 313
		bodyModel[308].setRotationPoint(-32F, -20F, -1F);

		bodyModel[309].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 190
		bodyModel[309].setRotationPoint(-32F, -20F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 72
		bodyModel[310].setRotationPoint(-32F, -20F, 10F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[311].setRotationPoint(-20F, -20F, -10F);

		bodyModel[312].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 52 door swing right
		bodyModel[312].setRotationPoint(-31.5F, -20F, -4.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 304 phase1 bat box
		bodyModel[313].setRotationPoint(5.5F, 1F, 6F);

		bodyModel[314].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 304 phase1 bat box
		bodyModel[314].setRotationPoint(5.5F, 1F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 554 fuel tank lorge
		bodyModel[315].setRotationPoint(-7F, 5F, 8F);

		bodyModel[316].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Box 553 fuel tank lorge
		bodyModel[316].setRotationPoint(-7F, 5F, -8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552 fuel tank lorge
		bodyModel[317].setRotationPoint(-7F, 5F, -11F);

		bodyModel[318].addBox(0F, 0F, 0F, 12, 3, 22, 0F); // Box 551 fuel tank lorge
		bodyModel[318].setRotationPoint(-7F, 2F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[319].setRotationPoint(-10F, 5F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 549
		bodyModel[320].setRotationPoint(-8F, 5F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[321].setRotationPoint(-11F, 5F, -9F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 305
		bodyModel[322].setRotationPoint(-12F, 0F, 9.01F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 305
		bodyModel[323].setRotationPoint(-12F, 0F, -9.01F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[324].setRotationPoint(-13F, 5F, -9F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[325].setRotationPoint(-12F, 4F, -9F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 305
		bodyModel[326].setRotationPoint(-9F, 0F, 9.01F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 305
		bodyModel[327].setRotationPoint(-9F, 0F, -9.01F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[328].setRotationPoint(-9F, 4F, -9F);

		bodyModel[329].addBox(0F, 0F, 0F, 71, 1, 4, 0F); // Box 206
		bodyModel[329].setRotationPoint(-35.5F, -1F, 7F);

		bodyModel[330].addBox(0F, 0F, 0F, 79, 1, 14, 0F); // Box 52
		bodyModel[330].setRotationPoint(-39.5F, -1F, -7F);

		bodyModel[331].addBox(0F, 0F, 0F, 71, 1, 4, 0F); // Box 0
		bodyModel[331].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 79, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[332].setRotationPoint(-39.5F, 3F, -6.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 79, 3, 12, 0F); // Box 23
		bodyModel[333].setRotationPoint(-39.5F, 0F, -6F);

		bodyModel[334].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[334].setRotationPoint(-23F, -18.25F, -4.25F);
		bodyModel[334].rotateAngleY = -2.35619449F;

		bodyModel[335].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[335].setRotationPoint(-23F, -18.25F, -4.25F);
		bodyModel[335].rotateAngleY = -2.35619449F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 336 commander bacon
		bodyModel[336].setRotationPoint(-25.15F, -25F, -0.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 337
		bodyModel[337].setRotationPoint(-25F, -24F, -0.5F);

		bodyModel[338].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 415
		bodyModel[338].setRotationPoint(3.5F, 1F, 11F);
		bodyModel[338].rotateAngleX = -0.78539816F;

		bodyModel[339].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 19
		bodyModel[339].setRotationPoint(3.5F, 1F, -11F);
		bodyModel[339].rotateAngleX = 0.78539816F;

		bodyModel[340].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 396
		bodyModel[340].setRotationPoint(-33.5F, -6.75F, -8.5F);
		bodyModel[340].rotateAngleZ = 0.34906585F;
	}
	ModelTypeBnew theB = new ModelTypeBnew();
	ModelHiAd theH = new ModelHiAd();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 239||GetColor(entity) == 226){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/HiAd_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theH.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theH.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}