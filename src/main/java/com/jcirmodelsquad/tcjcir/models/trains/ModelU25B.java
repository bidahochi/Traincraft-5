//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U25B PH2-4
// Model Creator: Bidahochi
// Created on: 15.09.2021 - 07:13:12
// Last changed on: 15.09.2021 - 07:13:12

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
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelU25B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU25B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[385];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 309, 113, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 276, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 303, 86, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 452, 42, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 97, 90, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 102, 83, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 96, 99, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[20] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[21] = new ModelRendererTurbo(this, 422, 38, textureX, textureY); // Box 156
		bodyModel[22] = new ModelRendererTurbo(this, 322, 133, textureX, textureY); // Box 157
		bodyModel[23] = new ModelRendererTurbo(this, 322, 140, textureX, textureY); // Box 158
		bodyModel[24] = new ModelRendererTurbo(this, 110, 8, textureX, textureY); // Box 160
		bodyModel[25] = new ModelRendererTurbo(this, 36, 46, textureX, textureY); // Box 161
		bodyModel[26] = new ModelRendererTurbo(this, 91, 46, textureX, textureY); // Box 162
		bodyModel[27] = new ModelRendererTurbo(this, 51, 46, textureX, textureY); // Box 163
		bodyModel[28] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 164
		bodyModel[29] = new ModelRendererTurbo(this, 111, 2, textureX, textureY); // Box 165
		bodyModel[30] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[31] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 167
		bodyModel[32] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[33] = new ModelRendererTurbo(this, 110, 21, textureX, textureY); // Box 169
		bodyModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 34, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[37] = new ModelRendererTurbo(this, 34, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[38] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[39] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[40] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[41] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[42] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[43] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[44] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[45] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[47] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[48] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[51] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[52] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[53] = new ModelRendererTurbo(this, 487, 138, textureX, textureY); // Box 259
		bodyModel[54] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[55] = new ModelRendererTurbo(this, 445, 138, textureX, textureY); // Box 269
		bodyModel[56] = new ModelRendererTurbo(this, 49, 195, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[57] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[58] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[59] = new ModelRendererTurbo(this, 59, 54, textureX, textureY); // Box 285
		bodyModel[60] = new ModelRendererTurbo(this, 59, 67, textureX, textureY); // Box 300
		bodyModel[61] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[62] = new ModelRendererTurbo(this, 452, 50, textureX, textureY); // Box 305
		bodyModel[63] = new ModelRendererTurbo(this, 459, 48, textureX, textureY); // Box 305
		bodyModel[64] = new ModelRendererTurbo(this, 452, 42, textureX, textureY); // Box 19
		bodyModel[65] = new ModelRendererTurbo(this, 452, 46, textureX, textureY); // Box 305
		bodyModel[66] = new ModelRendererTurbo(this, 459, 42, textureX, textureY); // Box 305
		bodyModel[67] = new ModelRendererTurbo(this, 422, 44, textureX, textureY); // Box 440
		bodyModel[68] = new ModelRendererTurbo(this, 320, 124, textureX, textureY); // Box 19
		bodyModel[69] = new ModelRendererTurbo(this, 320, 124, textureX, textureY); // Box 19
		bodyModel[70] = new ModelRendererTurbo(this, 121, 115, textureX, textureY); // Box 205
		bodyModel[71] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[72] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Box 114
		bodyModel[73] = new ModelRendererTurbo(this, 142, 2, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 142, 8, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[76] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[77] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[78] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[79] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[80] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[81] = new ModelRendererTurbo(this, 456, 161, textureX, textureY); // Box 273
		bodyModel[82] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[83] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[84] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[85] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[86] = new ModelRendererTurbo(this, 11, 71, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[87] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[88] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[89] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[91] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[92] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[93] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[94] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[95] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[96] = new ModelRendererTurbo(this, 167, 9, textureX, textureY); // Box 292
		bodyModel[97] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 293
		bodyModel[98] = new ModelRendererTurbo(this, 157, 16, textureX, textureY); // Box 294
		bodyModel[99] = new ModelRendererTurbo(this, 172, 67, textureX, textureY); // Box 296
		bodyModel[100] = new ModelRendererTurbo(this, 172, 54, textureX, textureY); // Box 297
		bodyModel[101] = new ModelRendererTurbo(this, 110, 177, textureX, textureY); // Box 298
		bodyModel[102] = new ModelRendererTurbo(this, 218, 199, textureX, textureY); // Box 299 nose late
		bodyModel[103] = new ModelRendererTurbo(this, 217, 205, textureX, textureY); // Box 300 nose late
		bodyModel[104] = new ModelRendererTurbo(this, 217, 192, textureX, textureY); // Box 301 nose late
		bodyModel[105] = new ModelRendererTurbo(this, 148, 160, textureX, textureY); // Box 302
		bodyModel[106] = new ModelRendererTurbo(this, 124, 160, textureX, textureY); // Box 303
		bodyModel[107] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 304
		bodyModel[108] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 309
		bodyModel[109] = new ModelRendererTurbo(this, 473, 43, textureX, textureY); // Box 310
		bodyModel[110] = new ModelRendererTurbo(this, 473, 43, textureX, textureY); // Box 311
		bodyModel[111] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[112] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[113] = new ModelRendererTurbo(this, 423, 66, textureX, textureY); // Box 318
		bodyModel[114] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[115] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[116] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[117] = new ModelRendererTurbo(this, 422, 50, textureX, textureY); // Box 253
		bodyModel[118] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[119] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[120] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[121] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[122] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[123] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[124] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[125] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[126] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[127] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[128] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[129] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[130] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[131] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[132] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[133] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[134] = new ModelRendererTurbo(this, 430, 67, textureX, textureY); // Box 322
		bodyModel[135] = new ModelRendererTurbo(this, 18, 203, textureX, textureY); // Box 412 cs air brake pannel
		bodyModel[136] = new ModelRendererTurbo(this, 22, 187, textureX, textureY); // Box 86 cs dials
		bodyModel[137] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[138] = new ModelRendererTurbo(this, 252, 34, textureX, textureY); // Box 18 exhaust 3
		bodyModel[139] = new ModelRendererTurbo(this, 250, 48, textureX, textureY); // Box 21 exhaust 2
		bodyModel[140] = new ModelRendererTurbo(this, 203, 97, textureX, textureY); // Box 37
		bodyModel[141] = new ModelRendererTurbo(this, 242, 97, textureX, textureY); // Box 38
		bodyModel[142] = new ModelRendererTurbo(this, 240, 94, textureX, textureY); // Box 558
		bodyModel[143] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288
		bodyModel[144] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[145] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[146] = new ModelRendererTurbo(this, 488, 141, textureX, textureY); // Box 324
		bodyModel[147] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[148] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[149] = new ModelRendererTurbo(this, 497, 147, textureX, textureY); // Box 327
		bodyModel[150] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[151] = new ModelRendererTurbo(this, 97, 117, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[152] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[153] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[154] = new ModelRendererTurbo(this, 68, 121, textureX, textureY); // Box 302
		bodyModel[155] = new ModelRendererTurbo(this, 84, 121, textureX, textureY); // Box 303
		bodyModel[156] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[157] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[158] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[159] = new ModelRendererTurbo(this, 12, 54, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[160] = new ModelRendererTurbo(this, 14, 49, textureX, textureY); // Box 5
		bodyModel[161] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[162] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[163] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[164] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[165] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[166] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[167] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[168] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[169] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[170] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[171] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[172] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[173] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[174] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[175] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[176] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[177] = new ModelRendererTurbo(this, 89, 166, textureX, textureY); // Box 734
		bodyModel[178] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[179] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[180] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[181] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[182] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[183] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[184] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[185] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[186] = new ModelRendererTurbo(this, 429, 130, textureX, textureY); // Box 217
		bodyModel[187] = new ModelRendererTurbo(this, 431, 46, textureX, textureY); // Box 19
		bodyModel[188] = new ModelRendererTurbo(this, 431, 46, textureX, textureY); // Box 548
		bodyModel[189] = new ModelRendererTurbo(this, 431, 46, textureX, textureY); // Box 19
		bodyModel[190] = new ModelRendererTurbo(this, 431, 46, textureX, textureY); // Box 548
		bodyModel[191] = new ModelRendererTurbo(this, 417, 183, textureX, textureY); // Box 293 radiator
		bodyModel[192] = new ModelRendererTurbo(this, 59, 89, textureX, textureY); // Box 410
		bodyModel[193] = new ModelRendererTurbo(this, 76, 89, textureX, textureY); // Box 310
		bodyModel[194] = new ModelRendererTurbo(this, 87, 78, textureX, textureY); // Box 81
		bodyModel[195] = new ModelRendererTurbo(this, 92, 86, textureX, textureY); // Box 81
		bodyModel[196] = new ModelRendererTurbo(this, 92, 81, textureX, textureY); // Box 275
		bodyModel[197] = new ModelRendererTurbo(this, 59, 80, textureX, textureY); // Box 250
		bodyModel[198] = new ModelRendererTurbo(this, 92, 79, textureX, textureY); // Box 276
		bodyModel[199] = new ModelRendererTurbo(this, 171, 170, textureX, textureY); // Box 389
		bodyModel[200] = new ModelRendererTurbo(this, 194, 165, textureX, textureY); // Box 390
		bodyModel[201] = new ModelRendererTurbo(this, 152, 177, textureX, textureY); // Box 391
		bodyModel[202] = new ModelRendererTurbo(this, 129, 189, textureX, textureY); // Box 392
		bodyModel[203] = new ModelRendererTurbo(this, 192, 81, textureX, textureY); // Box 393
		bodyModel[204] = new ModelRendererTurbo(this, 462, 113, textureX, textureY); // Box 395
		bodyModel[205] = new ModelRendererTurbo(this, 449, 112, textureX, textureY); // Box 396
		bodyModel[206] = new ModelRendererTurbo(this, 473, 112, textureX, textureY); // Box 397
		bodyModel[207] = new ModelRendererTurbo(this, 489, 107, textureX, textureY); // Box 400
		bodyModel[208] = new ModelRendererTurbo(this, 481, 109, textureX, textureY); // Box 401
		bodyModel[209] = new ModelRendererTurbo(this, 481, 109, textureX, textureY); // Box 402
		bodyModel[210] = new ModelRendererTurbo(this, 442, 104, textureX, textureY, "lamp"); // Box 403 numberboard
		bodyModel[211] = new ModelRendererTurbo(this, 442, 104, textureX, textureY, "lamp"); // Box 404 numberboard
		bodyModel[212] = new ModelRendererTurbo(this, 401, 2, textureX, textureY, "cull"); // Box 407 cull
		bodyModel[213] = new ModelRendererTurbo(this, 248, 94, textureX, textureY); // Box 408
		bodyModel[214] = new ModelRendererTurbo(this, 209, 94, textureX, textureY); // Box 409
		bodyModel[215] = new ModelRendererTurbo(this, 201, 94, textureX, textureY); // Box 410
		bodyModel[216] = new ModelRendererTurbo(this, 242, 88, textureX, textureY, "cull"); // Box 411 cull
		bodyModel[217] = new ModelRendererTurbo(this, 203, 88, textureX, textureY, "cull"); // Box 412 cull
		bodyModel[218] = new ModelRendererTurbo(this, 179, 97, textureX, textureY, "cull"); // Box 413 cull
		bodyModel[219] = new ModelRendererTurbo(this, 109, 81, textureX, textureY); // Box 414
		bodyModel[220] = new ModelRendererTurbo(this, 101, 81, textureX, textureY); // Box 415
		bodyModel[221] = new ModelRendererTurbo(this, 84, 90, textureX, textureY); // Box 264
		bodyModel[222] = new ModelRendererTurbo(this, 84, 88, textureX, textureY); // Box 265
		bodyModel[223] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 266
		bodyModel[224] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 267
		bodyModel[225] = new ModelRendererTurbo(this, 3, 67, textureX, textureY, "lamp"); // Box 268 markerlight glowey
		bodyModel[226] = new ModelRendererTurbo(this, 3, 67, textureX, textureY, "lamp"); // Box 268 markerlight glowey
		bodyModel[227] = new ModelRendererTurbo(this, 442, 105, textureX, textureY, "lamp"); // Box 268 markerlight glowey
		bodyModel[228] = new ModelRendererTurbo(this, 442, 105, textureX, textureY, "lamp"); // Box 268 markerlight glowey
		bodyModel[229] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[230] = new ModelRendererTurbo(this, 186, 40, textureX, textureY); // Box 787
		bodyModel[231] = new ModelRendererTurbo(this, 184, 43, textureX, textureY); // Box 788
		bodyModel[232] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[233] = new ModelRendererTurbo(this, 148, 24, textureX, textureY); // Box 279
		bodyModel[234] = new ModelRendererTurbo(this, 78, 120, textureX, textureY); // Box 279
		bodyModel[235] = new ModelRendererTurbo(this, 497, 140, textureX, textureY); // Box 280
		bodyModel[236] = new ModelRendererTurbo(this, 124, 41, textureX, textureY); // Box 43
		bodyModel[237] = new ModelRendererTurbo(this, 125, 44, textureX, textureY); // Box 43
		bodyModel[238] = new ModelRendererTurbo(this, 499, 32, textureX, textureY, "cull"); // Box 284 ladder cull
		bodyModel[239] = new ModelRendererTurbo(this, 172, 69, textureX, textureY); // Box 287
		bodyModel[240] = new ModelRendererTurbo(this, 172, 56, textureX, textureY); // Box 288
		bodyModel[241] = new ModelRendererTurbo(this, 172, 71, textureX, textureY); // Box 291
		bodyModel[242] = new ModelRendererTurbo(this, 172, 58, textureX, textureY); // Box 292
		bodyModel[243] = new ModelRendererTurbo(this, 117, 100, textureX, textureY); // Box 293 crab signals
		bodyModel[244] = new ModelRendererTurbo(this, 2, 30, textureX, textureY, "lamp"); // Box 336 gyralight front red SP
		bodyModel[245] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 337 sp supportis
		bodyModel[246] = new ModelRendererTurbo(this, 144, 12, textureX, textureY); // Box 403
		bodyModel[247] = new ModelRendererTurbo(this, 144, 15, textureX, textureY); // Box 404
		bodyModel[248] = new ModelRendererTurbo(this, 144, 18, textureX, textureY); // Box 405
		bodyModel[249] = new ModelRendererTurbo(this, 149, 12, textureX, textureY, "cull"); // Box 407 sp bell holder cull
		bodyModel[250] = new ModelRendererTurbo(this, 145, 22, textureX, textureY); // Box 413
		bodyModel[251] = new ModelRendererTurbo(this, 247, 198, textureX, textureY); // Box 293 prr trainphoje
		bodyModel[252] = new ModelRendererTurbo(this, 247, 191, textureX, textureY); // Box 293 prr trainphoje
		bodyModel[253] = new ModelRendererTurbo(this, 15, 91, textureX, textureY, "lamp"); // Box 295 rocc island frog light cab
		bodyModel[254] = new ModelRendererTurbo(this, 15, 91, textureX, textureY, "lamp"); // Box 295 rocc island frog light cab
		bodyModel[255] = new ModelRendererTurbo(this, 2, 96, textureX, textureY); // Box 298
		bodyModel[256] = new ModelRendererTurbo(this, 2, 96, textureX, textureY); // Box 299
		bodyModel[257] = new ModelRendererTurbo(this, 148, 2, textureX, textureY); // Box 402 milw egirl
		bodyModel[258] = new ModelRendererTurbo(this, 147, 9, textureX, textureY); // Box 0 milw egirl
		bodyModel[259] = new ModelRendererTurbo(this, 148, 6, textureX, textureY); // Box 213 milw egirl
		bodyModel[260] = new ModelRendererTurbo(this, 186, 52, textureX, textureY); // Box 303
		bodyModel[261] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 304
		bodyModel[262] = new ModelRendererTurbo(this, 158, 12, textureX, textureY); // Box 401 milw ebell
		bodyModel[263] = new ModelRendererTurbo(this, 163, 11, textureX, textureY); // Box 402 milw ebell
		bodyModel[264] = new ModelRendererTurbo(this, 166, 23, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[265] = new ModelRendererTurbo(this, 166, 23, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[266] = new ModelRendererTurbo(this, 166, 23, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[267] = new ModelRendererTurbo(this, 166, 23, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[268] = new ModelRendererTurbo(this, 166, 27, textureX, textureY); // Box 428
		bodyModel[269] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[270] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[271] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[272] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[273] = new ModelRendererTurbo(this, 89, 176, textureX, textureY); // Box 311
		bodyModel[274] = new ModelRendererTurbo(this, 78, 181, textureX, textureY); // Box 312
		bodyModel[275] = new ModelRendererTurbo(this, 89, 186, textureX, textureY); // Box 313
		bodyModel[276] = new ModelRendererTurbo(this, 78, 191, textureX, textureY); // Box 314
		bodyModel[277] = new ModelRendererTurbo(this, 153, 5, textureX, textureY); // Box 364 prime base
		bodyModel[278] = new ModelRendererTurbo(this, 153, 1, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[279] = new ModelRendererTurbo(this, 153, 1, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[280] = new ModelRendererTurbo(this, 153, 1, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[281] = new ModelRendererTurbo(this, 153, 1, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[282] = new ModelRendererTurbo(this, 170, 97, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[283] = new ModelRendererTurbo(this, 176, 23, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[284] = new ModelRendererTurbo(this, 176, 23, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[285] = new ModelRendererTurbo(this, 176, 23, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[286] = new ModelRendererTurbo(this, 176, 23, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[287] = new ModelRendererTurbo(this, 174, 31, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[288] = new ModelRendererTurbo(this, 176, 27, textureX, textureY); // Box 428
		bodyModel[289] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 327 radiator
		bodyModel[290] = new ModelRendererTurbo(this, 236, 26, textureX, textureY); // Box 365 mk stack
		bodyModel[291] = new ModelRendererTurbo(this, 236, 26, textureX, textureY); // Box 366 mk stack
		bodyModel[292] = new ModelRendererTurbo(this, 209, 30, textureX, textureY); // Box 329 mk air intake
		bodyModel[293] = new ModelRendererTurbo(this, 209, 30, textureX, textureY); // Box 330 mk air intake
		bodyModel[294] = new ModelRendererTurbo(this, 114, 45, textureX, textureY); // Box 386 brakewheel
		bodyModel[295] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 538
		bodyModel[296] = new ModelRendererTurbo(this, 206, 25, textureX, textureY); // Box 539
		bodyModel[297] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 357
		bodyModel[298] = new ModelRendererTurbo(this, 206, 25, textureX, textureY); // Box 358
		bodyModel[299] = new ModelRendererTurbo(this, 145, 24, textureX, textureY); // Box 373
		bodyModel[300] = new ModelRendererTurbo(this, 226, 36, textureX, textureY); // Box 403
		bodyModel[301] = new ModelRendererTurbo(this, 219, 38, textureX, textureY); // Box 404
		bodyModel[302] = new ModelRendererTurbo(this, 219, 41, textureX, textureY); // Box 405
		bodyModel[303] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 406
		bodyModel[304] = new ModelRendererTurbo(this, 217, 170, textureX, textureY); // Box 251
		bodyModel[305] = new ModelRendererTurbo(this, 224, 153, textureX, textureY); // Box 63
		bodyModel[306] = new ModelRendererTurbo(this, 247, 62, textureX, textureY); // Box 630
		bodyModel[307] = new ModelRendererTurbo(this, 423, 66, textureX, textureY); // Box 631
		bodyModel[308] = new ModelRendererTurbo(this, 451, 43, textureX, textureY); // Box 632
		bodyModel[309] = new ModelRendererTurbo(this, 430, 67, textureX, textureY); // Box 757
		bodyModel[310] = new ModelRendererTurbo(this, 422, 44, textureX, textureY); // Box 758
		bodyModel[311] = new ModelRendererTurbo(this, 430, 67, textureX, textureY); // Box 882
		bodyModel[312] = new ModelRendererTurbo(this, 430, 67, textureX, textureY); // Box 883
		bodyModel[313] = new ModelRendererTurbo(this, 439, 45, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[314] = new ModelRendererTurbo(this, 188, 192, textureX, textureY); // Box 885 nose early
		bodyModel[315] = new ModelRendererTurbo(this, 188, 205, textureX, textureY); // Box 886 nose early
		bodyModel[316] = new ModelRendererTurbo(this, 189, 199, textureX, textureY); // Box 887 nose early
		bodyModel[317] = new ModelRendererTurbo(this, 421, 226, textureX, textureY); // Box 899 dynamic break grid
		bodyModel[318] = new ModelRendererTurbo(this, 421, 201, textureX, textureY); // Box 900 dynamic brake grid
		bodyModel[319] = new ModelRendererTurbo(this, 409, 12, textureX, textureY); // Box 901
		bodyModel[320] = new ModelRendererTurbo(this, 409, 23, textureX, textureY); // Box 902
		bodyModel[321] = new ModelRendererTurbo(this, 349, 215, textureX, textureY, "cull"); // Box 903 cull thying holy engine inside cube
		bodyModel[322] = new ModelRendererTurbo(this, 383, 203, textureX, textureY); // Box 904 equipment blower
		bodyModel[323] = new ModelRendererTurbo(this, 391, 192, textureX, textureY); // Box 906
		bodyModel[324] = new ModelRendererTurbo(this, 391, 192, textureX, textureY); // Box 907
		bodyModel[325] = new ModelRendererTurbo(this, 252, 41, textureX, textureY); // Box 908 exhaust 1
		bodyModel[326] = new ModelRendererTurbo(this, 429, 126, textureX, textureY); // Box 909
		bodyModel[327] = new ModelRendererTurbo(this, 66, 136, textureX, textureY); // Box 910
		bodyModel[328] = new ModelRendererTurbo(this, 66, 132, textureX, textureY); // Box 911
		bodyModel[329] = new ModelRendererTurbo(this, 168, 136, textureX, textureY); // Box 912
		bodyModel[330] = new ModelRendererTurbo(this, 168, 132, textureX, textureY); // Box 913
		bodyModel[331] = new ModelRendererTurbo(this, 504, 130, textureX, textureY); // Box 914
		bodyModel[332] = new ModelRendererTurbo(this, 504, 126, textureX, textureY); // Box 915
		bodyModel[333] = new ModelRendererTurbo(this, 131, 145, textureX, textureY); // Box 916
		bodyModel[334] = new ModelRendererTurbo(this, 131, 145, textureX, textureY); // Box 917
		bodyModel[335] = new ModelRendererTurbo(this, 407, 124, textureX, textureY); // Box 918
		bodyModel[336] = new ModelRendererTurbo(this, 406, 134, textureX, textureY); // Box 919
		bodyModel[337] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[338] = new ModelRendererTurbo(this, 87, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[339] = new ModelRendererTurbo(this, 471, 93, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[340] = new ModelRendererTurbo(this, 464, 93, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[341] = new ModelRendererTurbo(this, 157, 27, textureX, textureY); // Box 409 commander base
		bodyModel[342] = new ModelRendererTurbo(this, 157, 23, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[343] = new ModelRendererTurbo(this, 239, 86, textureX, textureY); // Box 400 atsf equipment air cleaner
		bodyModel[344] = new ModelRendererTurbo(this, 283, 102, textureX, textureY, "cull"); // Box 413 cull
		bodyModel[345] = new ModelRendererTurbo(this, 274, 102, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[346] = new ModelRendererTurbo(this, 172, 60, textureX, textureY); // Box 403
		bodyModel[347] = new ModelRendererTurbo(this, 172, 73, textureX, textureY); // Box 404
		bodyModel[348] = new ModelRendererTurbo(this, 3, 192, textureX, textureY); // Box 405
		bodyModel[349] = new ModelRendererTurbo(this, 1, 210, textureX, textureY); // Box 406
		bodyModel[350] = new ModelRendererTurbo(this, 29, 205, textureX, textureY); // Box 407 cs button pannel backer
		bodyModel[351] = new ModelRendererTurbo(this, 32, 198, textureX, textureY); // Box 408 cs button pannel
		bodyModel[352] = new ModelRendererTurbo(this, 30, 194, textureX, textureY); // Box 409 cs throttle box
		bodyModel[353] = new ModelRendererTurbo(this, 20, 198, textureX, textureY); // Box 411 cs PHOEN
		bodyModel[354] = new ModelRendererTurbo(this, 44, 195, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[355] = new ModelRendererTurbo(this, 223, 45, textureX, textureY); // Box 413 hi im GN and i think this is cool
		bodyModel[356] = new ModelRendererTurbo(this, 138, 29, textureX, textureY); // Box 184 o2 generator
		bodyModel[357] = new ModelRendererTurbo(this, 225, 114, textureX, textureY); // Box 260
		bodyModel[358] = new ModelRendererTurbo(this, 218, 115, textureX, textureY); // Box 264
		bodyModel[359] = new ModelRendererTurbo(this, 223, 118, textureX, textureY); // Box 268
		bodyModel[360] = new ModelRendererTurbo(this, 218, 120, textureX, textureY); // Box 274
		bodyModel[361] = new ModelRendererTurbo(this, 210, 124, textureX, textureY); // Box 283
		bodyModel[362] = new ModelRendererTurbo(this, 223, 124, textureX, textureY); // Box 284
		bodyModel[363] = new ModelRendererTurbo(this, 253, 124, textureX, textureY); // Box 291
		bodyModel[364] = new ModelRendererTurbo(this, 240, 124, textureX, textureY); // Box 292
		bodyModel[365] = new ModelRendererTurbo(this, 253, 120, textureX, textureY); // Box 293
		bodyModel[366] = new ModelRendererTurbo(this, 242, 118, textureX, textureY); // Box 294
		bodyModel[367] = new ModelRendererTurbo(this, 244, 114, textureX, textureY); // Box 295
		bodyModel[368] = new ModelRendererTurbo(this, 253, 115, textureX, textureY); // Box 296
		bodyModel[369] = new ModelRendererTurbo(this, 251, 23, textureX, textureY); // Box 336 ANE HIGHBEAM
		bodyModel[370] = new ModelRendererTurbo(this, 260, 22, textureX, textureY, "lamp"); // Box 337 ANE Highbeam Light
		bodyModel[371] = new ModelRendererTurbo(this, 260, 22, textureX, textureY, "lamp"); // Box 338 ANE Highbeam Light
		bodyModel[372] = new ModelRendererTurbo(this, 238, 40, textureX, textureY); // Box 296
		bodyModel[373] = new ModelRendererTurbo(this, 238, 37, textureX, textureY); // Box 295
		bodyModel[374] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 297
		bodyModel[375] = new ModelRendererTurbo(this, 236, 34, textureX, textureY); // Box 294
		bodyModel[376] = new ModelRendererTurbo(this, 229, 22, textureX, textureY); // Box 311
		bodyModel[377] = new ModelRendererTurbo(this, 238, 22, textureX, textureY); // Box 312
		bodyModel[378] = new ModelRendererTurbo(this, 167, 39, textureX, textureY); // Box 323
		bodyModel[379] = new ModelRendererTurbo(this, 167, 42, textureX, textureY); // Box 324
		bodyModel[380] = new ModelRendererTurbo(this, 167, 36, textureX, textureY); // Box 325
		bodyModel[381] = new ModelRendererTurbo(this, 166, 32, textureX, textureY); // Box 326
		bodyModel[382] = new ModelRendererTurbo(this, 320, 119, textureX, textureY); // Box 382
		bodyModel[383] = new ModelRendererTurbo(this, 320, 119, textureX, textureY); // Box 383
		bodyModel[384] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 384 nose cover

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 17, 3, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-8.5F, 6F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 55, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-17F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-29F, -18F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 4, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-8.5F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(10F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[7].setRotationPoint(-29F, -18F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[8].setRotationPoint(-30F, -5F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[9].setRotationPoint(-18F, -18F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[10].setRotationPoint(-30F, -18F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 31
		bodyModel[11].setRotationPoint(-35F, -5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 32
		bodyModel[12].setRotationPoint(-36F, -3F, -10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 33
		bodyModel[13].setRotationPoint(-36F, -5F, 7F);

		bodyModel[14].addBox(0F, 0F, 0F, 5, 4, 22, 0F); // Box 36
		bodyModel[14].setRotationPoint(-17F, -5F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[15].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[16].setRotationPoint(-38F, 1F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[17].setRotationPoint(-30F, -21F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[18].setRotationPoint(-30F, -21F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[19].setRotationPoint(-18F, -21F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[20].setRotationPoint(-30F, -21F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 156
		bodyModel[21].setRotationPoint(-23F, 1.5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[22].setRotationPoint(-8.5F, 6F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[23].setRotationPoint(-8.5F, 6F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[24].setRotationPoint(-29F, -22F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[25].setRotationPoint(-30F, -22F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[26].setRotationPoint(-18F, -22F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[27].setRotationPoint(-30F, -22F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[28].setRotationPoint(-18F, -22F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[29].setRotationPoint(-29F, -19F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[30].setRotationPoint(-18F, -21F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[31].setRotationPoint(-29F, -19F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[32].setRotationPoint(-18F, -21F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[33].setRotationPoint(-29F, -22F, 2F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[34].setRotationPoint(-31F, -22F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-31F, -20.5F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[36].setRotationPoint(-31.05F, -20.5F, -1F);
		bodyModel[36].rotateAngleY = 0.15707963F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[37].setRotationPoint(-31.05F, -20.5F, 1F);
		bodyModel[37].rotateAngleY = -0.15707963F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[38].setRotationPoint(-31F, -20.5F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[39].setRotationPoint(-38.75F, -12.75F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[40].setRotationPoint(-39F, -1F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[41].setRotationPoint(-42F, 8F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[42].setRotationPoint(-42F, 2F, 7F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[43].setRotationPoint(-42F, 2F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[44].setRotationPoint(-42F, 8F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[45].setRotationPoint(-42F, 8F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[46].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[47].setRotationPoint(42F, 8F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(-42F, -1F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[49].setRotationPoint(-42F, -1F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[50].setRotationPoint(-42F, -9F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[51].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[52].setRotationPoint(42F, -1F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[53].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[54].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[55].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 275 cs speedo glow
		bodyModel[56].setRotationPoint(-29F, -15.5F, 6F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[57].setRotationPoint(-34.5F, -9.5F, -7.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[58].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 56, 12, 0, 0F); // Box 285
		bodyModel[59].setRotationPoint(-17F, -13F, 11F);

		bodyModel[60].addBox(0F, 0F, 0F, 56, 12, 0, 0F); // Box 300
		bodyModel[60].setRotationPoint(-17F, -13F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[61].setRotationPoint(39F, -9F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 305
		bodyModel[62].setRotationPoint(8F, 5F, -9.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[63].setRotationPoint(9F, 2F, 9.01F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[64].setRotationPoint(-11F, 4F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 305
		bodyModel[65].setRotationPoint(-11F, 3F, -9.01F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[66].setRotationPoint(-11F, 1F, 10.01F);
		bodyModel[66].rotateAngleX = -0.19198622F;

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[67].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[68].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[68].setRotationPoint(-7F, 1.5F, -11.25F);
		bodyModel[68].rotateAngleX = 1.57079633F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[69].setRotationPoint(-7F, 1.5F, 11.25F);
		bodyModel[69].rotateAngleX = -1.57079633F;

		bodyModel[70].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 205
		bodyModel[70].setRotationPoint(-44F, 8F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 205
		bodyModel[71].setRotationPoint(42F, 8F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[72].setRotationPoint(-12.5F, 2.5F, 9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-12.5F, 1.5F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[74].setRotationPoint(-12.25F, 3F, 9.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[75].setRotationPoint(-38F, 1F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[76].setRotationPoint(-39F, -1F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[77].setRotationPoint(36F, 1F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[78].setRotationPoint(38F, -1F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[79].setRotationPoint(-42F, 1F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[80].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[81].setRotationPoint(37F, 1F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[82].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[83].setRotationPoint(-31.1F, -22F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[84].setRotationPoint(-31.1F, -20F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[85].setRotationPoint(-39.35F, -12.7F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[86].setRotationPoint(-39.35F, -12.7F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[87].setRotationPoint(38.1F, -20F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[88].setRotationPoint(38.1F, -22F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[89].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[90].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[91].setRotationPoint(36F, 1F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[92].setRotationPoint(38F, -1F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[93].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[94].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[95].setRotationPoint(39F, -9F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 55, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[96].setRotationPoint(-17F, -22F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 55, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[97].setRotationPoint(-17F, -22F, 2F);

		bodyModel[98].addBox(0F, 0F, 0F, 55, 1, 4, 0F); // Box 294
		bodyModel[98].setRotationPoint(-17F, -22F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[99].setRotationPoint(-13F, -13F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[100].setRotationPoint(-13F, -13F, 11F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 11, 14, 0F); // Box 298
		bodyModel[101].setRotationPoint(-38F, -12F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 299 nose late
		bodyModel[102].setRotationPoint(-38F, -13F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 300 nose late
		bodyModel[103].setRotationPoint(-38F, -13F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301 nose late
		bodyModel[104].setRotationPoint(-38F, -13F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[105].setRotationPoint(-39F, -12F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[106].setRotationPoint(-39F, -12F, 2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[107].setRotationPoint(-39F, -12F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Box 309
		bodyModel[108].setRotationPoint(-30F, -22F, -2F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 310
		bodyModel[109].setRotationPoint(8F, 3F, -7F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 311
		bodyModel[110].setRotationPoint(-12F, 3F, -7F);

		bodyModel[111].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[111].setRotationPoint(-29.5F, -18F, -10.5F);

		bodyModel[112].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[112].setRotationPoint(-17.5F, -18F, 10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[113].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[114].setRotationPoint(42F, 7F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[115].setRotationPoint(-42F, 7F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[116].setRotationPoint(-37F, -13F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[117].setRotationPoint(-35F, 1.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[118].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[118].rotateAngleY = -3.14159265F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[119].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[119].rotateAngleY = -3.14159265F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[120].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[120].rotateAngleY = -3.14159265F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[121].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[121].rotateAngleY = -3.14159265F;

		bodyModel[122].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[122].setRotationPoint(-42F, 6F, -8F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[123].setRotationPoint(-42F, 6F, 8F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[124].setRotationPoint(39F, 6F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[125].setRotationPoint(39F, 6F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[126].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[127].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[128].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[129].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[130].setRotationPoint(39F, 8F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[131].setRotationPoint(39F, 2F, -9F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[132].setRotationPoint(39F, 8F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[133].setRotationPoint(39F, 2F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[134].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 412 cs air brake pannel
		bodyModel[135].setRotationPoint(-26F, -12F, -6F);

		bodyModel[136].addShapeBox(-1F, 0F, -1F, 11, 3, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs dials
		bodyModel[136].setRotationPoint(-28.5F, -12F, -2F);
		bodyModel[136].rotateAngleY = -0.82030475F;

		bodyModel[137].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[137].setRotationPoint(37.5F, -22.5F, 0F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 exhaust 3
		bodyModel[138].setRotationPoint(11.5F, -23.25F, -2.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21 exhaust 2
		bodyModel[139].setRotationPoint(11F, -22.5F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[140].setRotationPoint(17F, -3F, -10.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[141].setRotationPoint(17F, -3F, 7.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[142].setRotationPoint(17F, -5F, 10F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[143].setRotationPoint(38.5F, -17.75F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[144].setRotationPoint(39.1F, -17.7F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[145].setRotationPoint(39.1F, -17.7F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[146].setRotationPoint(42F, -1F, -8F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[147].setRotationPoint(42F, -9F, -2F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[148].setRotationPoint(42F, -9F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[149].setRotationPoint(42F, -1F, 2F);

		bodyModel[150].addBox(-3F, -1F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[150].setRotationPoint(42F, -1F, 2F);
		bodyModel[150].rotateAngleY = -3.14159265F;

		bodyModel[151].addBox(-3F, -1F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[151].setRotationPoint(-42F, -1F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[152].setRotationPoint(-43F, -9F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[153].setRotationPoint(-43F, -9F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[154].setRotationPoint(-43F, -1F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[155].setRotationPoint(-43F, -1F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[156].setRotationPoint(-28F, -18F, -11F);
		bodyModel[156].rotateAngleX = -0.61086524F;

		bodyModel[157].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[157].setRotationPoint(-26F, -16F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[158].setRotationPoint(-26.01F, -16F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[159].setRotationPoint(-26F, -16F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[160].setRotationPoint(-26F, -17F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[161].setRotationPoint(-28F, -18F, 11F);
		bodyModel[161].rotateAngleX = 0.61086524F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[162].setRotationPoint(-46F, 7F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[163].setRotationPoint(-46F, 7F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[164].setRotationPoint(-45F, 6F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[165].setRotationPoint(-45F, 5F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[166].setRotationPoint(-45F, 6F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[167].setRotationPoint(-45F, 5F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[168].setRotationPoint(-45F, 4F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[169].setRotationPoint(-45F, 4F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[170].setRotationPoint(44F, 6F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[171].setRotationPoint(44F, 6F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[172].setRotationPoint(45F, 7F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[173].setRotationPoint(45F, 7F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[174].setRotationPoint(44F, 5F, 2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[175].setRotationPoint(44F, 4F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[176].setRotationPoint(44F, 5F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[177].setRotationPoint(44F, 4F, -8F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[178].setRotationPoint(-42F, 5F, 8F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[179].setRotationPoint(-42F, 5F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[180].setRotationPoint(39F, 5F, -10F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[181].setRotationPoint(39F, 5F, 8F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[182].setRotationPoint(39F, 4F, 8F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[183].setRotationPoint(-42F, 4F, 8F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[184].setRotationPoint(-42F, 4F, -8F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[185].setRotationPoint(39F, 4F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 217
		bodyModel[186].setRotationPoint(38F, 1F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[187].setRotationPoint(-12F, 5F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[188].setRotationPoint(-10F, 5F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[189].setRotationPoint(9F, 5F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[190].setRotationPoint(11F, 5F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 40, 16, 1, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -20F, -8F, 0F, -20F, -8F, 0F, 0F, -8F, 0F); // Box 293 radiator
		bodyModel[191].setRotationPoint(17F, -17F, -7.25F);

		bodyModel[192].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 410
		bodyModel[192].setRotationPoint(-38F, -13F, 11F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[193].setRotationPoint(-39F, -13F, 11F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[194].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[195].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[196].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 250
		bodyModel[197].setRotationPoint(-39F, -13F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[198].setRotationPoint(-39F, -13F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[199].setRotationPoint(-36F, -11F, -7F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 390
		bodyModel[200].setRotationPoint(-36F, -5F, -7F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 11, 14, 0F); // Box 391
		bodyModel[201].setRotationPoint(-32F, -12F, -7F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 392
		bodyModel[202].setRotationPoint(-36F, -12F, -7F);

		bodyModel[203].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 393
		bodyModel[203].setRotationPoint(18F, -5F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[204].setRotationPoint(38F, -21F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 20, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[205].setRotationPoint(38F, -21F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 20, 5, 0F,0F, 1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[206].setRotationPoint(38F, -21F, 2F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 400
		bodyModel[207].setRotationPoint(38F, -22F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[208].setRotationPoint(38F, -20.75F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[209].setRotationPoint(38F, -20.75F, 1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 403 numberboard
		bodyModel[210].setRotationPoint(38.05F, -20.75F, 1F);
		bodyModel[210].rotateAngleY = 0.15707963F;

		bodyModel[211].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 404 numberboard
		bodyModel[211].setRotationPoint(38.05F, -20.75F, -1F);
		bodyModel[211].rotateAngleY = -0.15707963F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 40, 1, 8, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -4F, 0F, 0F, -4F); // Box 407 cull
		bodyModel[212].setRotationPoint(17F, -22.75F, -2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 408
		bodyModel[213].setRotationPoint(17F, -5F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 409
		bodyModel[214].setRotationPoint(17F, -5F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[215].setRotationPoint(17F, -5F, -8F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 411 cull
		bodyModel[216].setRotationPoint(30F, -3F, 7.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 412 cull
		bodyModel[217].setRotationPoint(30F, -3F, -10.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 413 cull
		bodyModel[218].setRotationPoint(-12F, -3F, 7.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		bodyModel[219].setRotationPoint(-36F, -5F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[220].setRotationPoint(-36F, -5F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 264
		bodyModel[221].setRotationPoint(-39F, -12F, 8.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[222].setRotationPoint(-39F, -13F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 266
		bodyModel[223].setRotationPoint(-39.01F, -5F, 10.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 267
		bodyModel[224].setRotationPoint(-39.01F, -8F, 9F);

		bodyModel[225].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 268 markerlight glowey
		bodyModel[225].setRotationPoint(-37.75F, -11F, -6.75F);
		bodyModel[225].rotateAngleY = 0.78539816F;

		bodyModel[226].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 268 markerlight glowey
		bodyModel[226].setRotationPoint(-37.75F, -11F, 6.75F);
		bodyModel[226].rotateAngleY = -0.78539816F;

		bodyModel[227].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 268 markerlight glowey
		bodyModel[227].setRotationPoint(37.85F, -18F, -6.75F);
		bodyModel[227].rotateAngleY = -0.78539816F;

		bodyModel[228].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 268 markerlight glowey
		bodyModel[228].setRotationPoint(37.85F, -18F, 6.75F);
		bodyModel[228].rotateAngleY = 0.78539816F;

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[229].setRotationPoint(-14.5F, -22F, -5.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[230].setRotationPoint(-15F, -23F, -4.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[231].setRotationPoint(-17F, -23F, -5.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[232].setRotationPoint(-16F, -22.5F, -6.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[233].setRotationPoint(-24F, -24F, 0F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279
		bodyModel[234].setRotationPoint(-43F, -1F, -2F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280
		bodyModel[235].setRotationPoint(42F, -1F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[236].setRotationPoint(-35.5F, -11.5F, -7F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[237].setRotationPoint(-35.5F, -9.5F, -7F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 19, 1, 0F); // Box 284 ladder cull
		bodyModel[238].setRotationPoint(32F, -20F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 287
		bodyModel[239].setRotationPoint(13F, -13F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 288
		bodyModel[240].setRotationPoint(13F, -13F, 11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[241].setRotationPoint(30F, -13F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[242].setRotationPoint(30F, -13F, 11F);

		bodyModel[243].addBox(0F, 0F, 0F, 6, 4, 3, 0F); // Box 293 crab signals
		bodyModel[243].setRotationPoint(-36F, -9F, 7.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 336 gyralight front red SP
		bodyModel[244].setRotationPoint(-31.25F, -24.25F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 337 sp supportis
		bodyModel[245].setRotationPoint(-30.75F, -24.25F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[246].setRotationPoint(-9F, -25F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[247].setRotationPoint(-9F, -24F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[248].setRotationPoint(-8.75F, -23.5F, -0.75F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 sp bell holder cull
		bodyModel[249].setRotationPoint(-9F, -25F, -2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[250].setRotationPoint(-27F, -23F, 0F);

		bodyModel[251].addBox(0F, 0F, 0F, 64, 6, 0, 0F); // Box 293 prr trainphoje
		bodyModel[251].setRotationPoint(-31F, -24F, -7F);

		bodyModel[252].addBox(0F, 0F, 0F, 64, 6, 0, 0F); // Box 293 prr trainphoje
		bodyModel[252].setRotationPoint(-31F, -24F, 7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 rocc island frog light cab
		bodyModel[253].setRotationPoint(-30F, -21F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 rocc island frog light cab
		bodyModel[254].setRotationPoint(-30F, -21F, 9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 298
		bodyModel[255].setRotationPoint(-29.75F, -21F, 9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 299
		bodyModel[256].setRotationPoint(-29.75F, -21F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 milw egirl
		bodyModel[257].setRotationPoint(-29F, -23.5F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.15F); // Box 0 milw egirl
		bodyModel[258].setRotationPoint(-30F, -23.5F, -1.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.15F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, 0.25F, 0.25F); // Box 213 milw egirl
		bodyModel[259].setRotationPoint(-30F, -23.5F, 0.25F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 303
		bodyModel[260].setRotationPoint(-15F, -23.5F, -6.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 304
		bodyModel[261].setRotationPoint(-15F, -24F, -5.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401 milw ebell
		bodyModel[262].setRotationPoint(-29F, -24F, -0.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402 milw ebell
		bodyModel[263].setRotationPoint(-28F, -24F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[264].setRotationPoint(-22F, -23.5F, -1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[265].setRotationPoint(-22F, -23.5F, -1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[266].setRotationPoint(-22F, -23.5F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[267].setRotationPoint(-22F, -23.5F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[268].setRotationPoint(-22F, -23F, -1F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[269].setRotationPoint(-13.5F, -23F, -0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[270].setRotationPoint(-16F, -24F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[271].setRotationPoint(-15F, -23.75F, 0.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[272].setRotationPoint(-14.5F, -23.75F, -1.5F);

		bodyModel[273].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 311
		bodyModel[273].setRotationPoint(-45F, 6F, -8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 312
		bodyModel[274].setRotationPoint(-45F, 6F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 313
		bodyModel[275].setRotationPoint(44F, 6F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[276].setRotationPoint(44F, 6F, -8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[277].setRotationPoint(-29F, -23F, -1F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[278].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[279].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[280].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[281].setRotationPoint(-29F, -23.5F, -1F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 320 cull
		bodyModel[282].setRotationPoint(-12F, -3F, -10.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[283].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[284].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[285].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[286].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[287].setRotationPoint(-25.5F, -21F, 7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[288].setRotationPoint(-25F, -22F, 7.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 40, 16, 1, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -20F, -8F, 0F, -20F, -8F, 0F, 0F, -8F, 0F); // Box 327 radiator
		bodyModel[289].setRotationPoint(17F, -17F, 6.25F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 365 mk stack
		bodyModel[290].setRotationPoint(-1.5F, -24F, -2F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 366 mk stack
		bodyModel[291].setRotationPoint(6.5F, -24F, -2F);

		bodyModel[292].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 329 mk air intake
		bodyModel[292].setRotationPoint(-15F, -19.5F, -7.25F);

		bodyModel[293].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 330 mk air intake
		bodyModel[293].setRotationPoint(-15F, -19.5F, 6.25F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 386 brakewheel
		bodyModel[294].setRotationPoint(-36.5F, -11.5F, -7.25F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[295].setRotationPoint(-2F, -26F, -1.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[296].setRotationPoint(-2F, -27F, -1.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 357
		bodyModel[297].setRotationPoint(6F, -26F, -1.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[298].setRotationPoint(6F, -27F, -1.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[299].setRotationPoint(-19.25F, -24F, -0.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 403
		bodyModel[300].setRotationPoint(-14F, -22.5F, 4F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404
		bodyModel[301].setRotationPoint(-14F, -23.5F, 4.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[302].setRotationPoint(-16F, -23.5F, 5.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[303].setRotationPoint(-15F, -23.5F, 3.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 84, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[304].setRotationPoint(-42F, -1F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[305].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[306].setRotationPoint(-38F, 1F, -11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[307].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 632
		bodyModel[308].setRotationPoint(-11F, 3F, -9.01F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[309].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[310].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[311].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[312].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[313].setRotationPoint(10F, 1F, 8.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885 nose early
		bodyModel[314].setRotationPoint(-38F, -13F, 2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 886 nose early
		bodyModel[315].setRotationPoint(-38F, -13F, -7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 887 nose early
		bodyModel[316].setRotationPoint(-38F, -13F, -2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 899 dynamic break grid
		bodyModel[317].setRotationPoint(18F, -15.5F, 6.1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 900 dynamic brake grid
		bodyModel[318].setRotationPoint(18F, -15.5F, -7.1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 40, 0, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 1F, -5F, 0F, 1F, -5F); // Box 901
		bodyModel[319].setRotationPoint(17F, -22.01F, 2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 40, 0, 10, 0F,0F, -1F, -5F, -20F, -1F, -5F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -20F, 1F, -5F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 902
		bodyModel[320].setRotationPoint(17F, -22.01F, -12F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 20, 8, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 903 cull thying holy engine inside cube
		bodyModel[321].setRotationPoint(17F, -17F, -6F);

		bodyModel[322].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 904 equipment blower
		bodyModel[322].setRotationPoint(24F, -13F, -3F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 906
		bodyModel[323].setRotationPoint(21F, -17F, -1F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 907
		bodyModel[324].setRotationPoint(31F, -17F, -1F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 908 exhaust 1
		bodyModel[325].setRotationPoint(11.5F, -22.25F, -2.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[326].setRotationPoint(38F, -1F, 10F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 910
		bodyModel[327].setRotationPoint(-39F, 1F, 10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[328].setRotationPoint(-39F, -1F, 10F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 912
		bodyModel[329].setRotationPoint(-39F, 1F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		bodyModel[330].setRotationPoint(-39F, -1F, -11F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 914
		bodyModel[331].setRotationPoint(38F, 1F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		bodyModel[332].setRotationPoint(38F, -1F, -11F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 916
		bodyModel[333].setRotationPoint(-43F, 6F, -9F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 917
		bodyModel[334].setRotationPoint(-43F, 6F, 3F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 918
		bodyModel[335].setRotationPoint(42F, 6F, 3F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 919
		bodyModel[336].setRotationPoint(42F, 6F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[337].setRotationPoint(-43F, -1F, -5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[338].setRotationPoint(-43F, -1F, 3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[339].setRotationPoint(42F, -1F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[340].setRotationPoint(42F, -1F, 3F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[341].setRotationPoint(-30.5F, -23F, -0.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[342].setRotationPoint(-30.5F, -24F, -0.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 6, 4, 22, 0F); // Box 400 atsf equipment air cleaner
		bodyModel[343].setRotationPoint(30F, -5F, -11F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 413 cull
		bodyModel[344].setRotationPoint(36F, -3F, 7.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 320 cull
		bodyModel[345].setRotationPoint(36F, -3F, -10.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[346].setRotationPoint(35F, -13F, 11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[347].setRotationPoint(35F, -13F, -11F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 13, 4, 0F); // Box 405
		bodyModel[348].setRotationPoint(-20F, -21F, -2F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 406
		bodyModel[349].setRotationPoint(-20F, -8F, -3F);

		bodyModel[350].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 407 cs button pannel backer
		bodyModel[350].setRotationPoint(-30.1F, -10F, -2F);
		bodyModel[350].rotateAngleY = -0.82030475F;

		bodyModel[351].addShapeBox(1F, 0F, 2F, 2, 5, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408 cs button pannel
		bodyModel[351].setRotationPoint(-30.1F, -10F, -2F);
		bodyModel[351].rotateAngleY = -0.82030475F;

		bodyModel[352].addBox(-1F, 1F, -1F, 3, 1, 2, 0F); // Box 409 cs throttle box
		bodyModel[352].setRotationPoint(-28.5F, -12F, -2F);
		bodyModel[352].rotateAngleY = -0.82030475F;

		bodyModel[353].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 411 cs PHOEN
		bodyModel[353].setRotationPoint(-26F, -15F, -5.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[354].setRotationPoint(-29F, -20F, -0.5F);
		bodyModel[354].rotateAngleY = 0.43633231F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 413 hi im GN and i think this is cool
		bodyModel[355].setRotationPoint(-13.75F, -24F, -2F);

		bodyModel[356].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[356].setRotationPoint(-26.5F, -23.75F, -4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[357].setRotationPoint(-22F, -28F, 6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[358].setRotationPoint(-22F, -28F, 8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[359].setRotationPoint(-22F, -27F, 5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[360].setRotationPoint(-22F, -27F, 8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[361].setRotationPoint(-22F, -25F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[362].setRotationPoint(-22F, -25F, 5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[363].setRotationPoint(-22F, -25F, -8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[364].setRotationPoint(-22F, -25F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[365].setRotationPoint(-22F, -27F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[366].setRotationPoint(-22F, -27F, -8F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[367].setRotationPoint(-22F, -28F, -8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[368].setRotationPoint(-22F, -28F, -9F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 ANE HIGHBEAM
		bodyModel[369].setRotationPoint(-31F, -24F, -2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ANE Highbeam Light
		bodyModel[370].setRotationPoint(-31.75F, -24F, 0F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ANE Highbeam Light
		bodyModel[371].setRotationPoint(-31.75F, -24F, -2F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[372].setRotationPoint(2F, -23F, -7F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[373].setRotationPoint(3F, -23F, -6F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297
		bodyModel[374].setRotationPoint(4F, -22F, -6F);

		bodyModel[375].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 294
		bodyModel[375].setRotationPoint(1F, -23F, -5F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[376].setRotationPoint(37F, -22.5F, 5F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[377].setRotationPoint(37F, -21.5F, 5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[378].setRotationPoint(3F, -19.5F, 7.7F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[379].setRotationPoint(3.25F, -19F, 7.95F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[380].setRotationPoint(3F, -20.5F, 7.7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[381].setRotationPoint(3F, -21.5F, 7F);

		bodyModel[382].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[382].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[382].rotateAngleX = 1.57079633F;

		bodyModel[383].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[383].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[383].rotateAngleX = -1.57079633F;

		bodyModel[384].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 384 nose cover
		bodyModel[384].setRotationPoint(-34F, -11F, -7F);
	}
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		
		if (GetColor(entity) == 14354) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0.335, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6||GetColor(entity) == 18){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}