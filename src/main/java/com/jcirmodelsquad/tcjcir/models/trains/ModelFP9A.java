//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F7a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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

public class ModelFP9A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFP9A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[484];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 274, 167, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 176, 128, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[2] = new ModelRendererTurbo(this, 342, 128, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[3] = new ModelRendererTurbo(this, 417, 135, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 137, 135, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 290, 165, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 267, 153, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 268, 153, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 290, 153, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 267, 116, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 137, 23, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 135, 15, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 138, 29, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 138, 4, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 140, 34, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 140, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 264, 102, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 261, 118, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 273, 118, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 259, 112, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 273, 112, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 85, 150, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 96, 142, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 58, 150, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 85, 204, textureX, textureY); // Box 112
		bodyModel[29] = new ModelRendererTurbo(this, 85, 197, textureX, textureY); // Box 117
		bodyModel[30] = new ModelRendererTurbo(this, 81, 191, textureX, textureY); // Box 118
		bodyModel[31] = new ModelRendererTurbo(this, 118, 150, textureX, textureY); // Box 129
		bodyModel[32] = new ModelRendererTurbo(this, 401, 144, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 165, 144, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 155, 128, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 146, 128, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 160, 128, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 165, 128, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 315, 202, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 300, 206, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 255, 201, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 251, 174, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 224, 178, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 255, 205, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 319, 181, textureX, textureY); // Box 324
		bodyModel[45] = new ModelRendererTurbo(this, 300, 200, textureX, textureY); // Box 325
		bodyModel[46] = new ModelRendererTurbo(this, 224, 197, textureX, textureY); // Box 139
		bodyModel[47] = new ModelRendererTurbo(this, 324, 207, textureX, textureY); // Box 140
		bodyModel[48] = new ModelRendererTurbo(this, 288, 207, textureX, textureY); // Box 141
		bodyModel[49] = new ModelRendererTurbo(this, 84, 240, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 153
		bodyModel[52] = new ModelRendererTurbo(this, 167, 151, textureX, textureY); // Box 156
		bodyModel[53] = new ModelRendererTurbo(this, 401, 151, textureX, textureY); // Box 157
		bodyModel[54] = new ModelRendererTurbo(this, 160, 151, textureX, textureY); // Box 160
		bodyModel[55] = new ModelRendererTurbo(this, 410, 151, textureX, textureY); // Box 161
		bodyModel[56] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 179
		bodyModel[57] = new ModelRendererTurbo(this, 395, 146, textureX, textureY); // Box 180
		bodyModel[58] = new ModelRendererTurbo(this, 236, 151, textureX, textureY); // Box 189
		bodyModel[59] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 190
		bodyModel[60] = new ModelRendererTurbo(this, 325, 151, textureX, textureY); // Box 191
		bodyModel[61] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 192
		bodyModel[62] = new ModelRendererTurbo(this, 167, 119, textureX, textureY); // Box 196
		bodyModel[63] = new ModelRendererTurbo(this, 317, 119, textureX, textureY); // Box 197
		bodyModel[64] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 200
		bodyModel[65] = new ModelRendererTurbo(this, 392, 146, textureX, textureY); // Box 201
		bodyModel[66] = new ModelRendererTurbo(this, 253, 4, textureX, textureY); // Box 202
		bodyModel[67] = new ModelRendererTurbo(this, 264, 4, textureX, textureY); // Box 203
		bodyModel[68] = new ModelRendererTurbo(this, 413, 60, textureX, textureY); // Box 314
		bodyModel[69] = new ModelRendererTurbo(this, 420, 60, textureX, textureY); // Box 316
		bodyModel[70] = new ModelRendererTurbo(this, 273, 2, textureX, textureY); // Box 231
		bodyModel[71] = new ModelRendererTurbo(this, 70, 202, textureX, textureY); // Box 278
		bodyModel[72] = new ModelRendererTurbo(this, 57, 207, textureX, textureY); // Box 279
		bodyModel[73] = new ModelRendererTurbo(this, 50, 207, textureX, textureY); // Box 280
		bodyModel[74] = new ModelRendererTurbo(this, 43, 186, textureX, textureY); // Box 281
		bodyModel[75] = new ModelRendererTurbo(this, 60, 180, textureX, textureY); // Box 282
		bodyModel[76] = new ModelRendererTurbo(this, 61, 188, textureX, textureY); // Box 284
		bodyModel[77] = new ModelRendererTurbo(this, 46, 197, textureX, textureY); // Box 289
		bodyModel[78] = new ModelRendererTurbo(this, 38, 199, textureX, textureY); // Box 291
		bodyModel[79] = new ModelRendererTurbo(this, 96, 202, textureX, textureY); // Box 294
		bodyModel[80] = new ModelRendererTurbo(this, 111, 207, textureX, textureY); // Box 295
		bodyModel[81] = new ModelRendererTurbo(this, 124, 207, textureX, textureY); // Box 296
		bodyModel[82] = new ModelRendererTurbo(this, 58, 153, textureX, textureY); // Box 311
		bodyModel[83] = new ModelRendererTurbo(this, 115, 186, textureX, textureY); // Box 313
		bodyModel[84] = new ModelRendererTurbo(this, 98, 180, textureX, textureY); // Box 314
		bodyModel[85] = new ModelRendererTurbo(this, 105, 188, textureX, textureY); // Box 315
		bodyModel[86] = new ModelRendererTurbo(this, 96, 149, textureX, textureY); // Box 323
		bodyModel[87] = new ModelRendererTurbo(this, 109, 151, textureX, textureY); // Box 324
		bodyModel[88] = new ModelRendererTurbo(this, 118, 153, textureX, textureY); // Box 325
		bodyModel[89] = new ModelRendererTurbo(this, 72, 149, textureX, textureY); // Box 327
		bodyModel[90] = new ModelRendererTurbo(this, 63, 151, textureX, textureY); // Box 328
		bodyModel[91] = new ModelRendererTurbo(this, 39, 194, textureX, textureY); // Box 329
		bodyModel[92] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 330
		bodyModel[93] = new ModelRendererTurbo(this, 63, 146, textureX, textureY); // Box 331
		bodyModel[94] = new ModelRendererTurbo(this, 69, 232, textureX, textureY); // Box 332
		bodyModel[95] = new ModelRendererTurbo(this, 97, 232, textureX, textureY); // Box 333
		bodyModel[96] = new ModelRendererTurbo(this, 56, 233, textureX, textureY); // Box 335
		bodyModel[97] = new ModelRendererTurbo(this, 81, 186, textureX, textureY); // Box 167
		bodyModel[98] = new ModelRendererTurbo(this, 91, 186, textureX, textureY); // Box 166
		bodyModel[99] = new ModelRendererTurbo(this, 91, 181, textureX, textureY); // Box 165
		bodyModel[100] = new ModelRendererTurbo(this, 77, 181, textureX, textureY); // Box 164
		bodyModel[101] = new ModelRendererTurbo(this, 96, 193, textureX, textureY); // Box 866
		bodyModel[102] = new ModelRendererTurbo(this, 105, 196, textureX, textureY); // Box 867
		bodyModel[103] = new ModelRendererTurbo(this, 59, 196, textureX, textureY); // Box 868
		bodyModel[104] = new ModelRendererTurbo(this, 70, 193, textureX, textureY); // Box 869
		bodyModel[105] = new ModelRendererTurbo(this, 112, 233, textureX, textureY); // Box 1296
		bodyModel[106] = new ModelRendererTurbo(this, 47, 204, textureX, textureY); // Box 1302
		bodyModel[107] = new ModelRendererTurbo(this, 121, 204, textureX, textureY); // Box 1303
		bodyModel[108] = new ModelRendererTurbo(this, 116, 197, textureX, textureY); // Box 1304
		bodyModel[109] = new ModelRendererTurbo(this, 133, 194, textureX, textureY); // Box 1305
		bodyModel[110] = new ModelRendererTurbo(this, 132, 199, textureX, textureY); // Box 1306
		bodyModel[111] = new ModelRendererTurbo(this, 165, 131, textureX, textureY); // Box 329 door swing left cab
		bodyModel[112] = new ModelRendererTurbo(this, 401, 131, textureX, textureY); // Box 332 door swing right cab
		bodyModel[113] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 326
		bodyModel[114] = new ModelRendererTurbo(this, 104, 139, textureX, textureY); // Box 327
		bodyModel[115] = new ModelRendererTurbo(this, 64, 139, textureX, textureY); // Box 328
		bodyModel[116] = new ModelRendererTurbo(this, 235, 135, textureX, textureY); // Box 329 door swing left hood
		bodyModel[117] = new ModelRendererTurbo(this, 246, 128, textureX, textureY); // Box 333
		bodyModel[118] = new ModelRendererTurbo(this, 310, 128, textureX, textureY); // Box 334
		bodyModel[119] = new ModelRendererTurbo(this, 78, 173, textureX, textureY); // Box 103
		bodyModel[120] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // Box 103
		bodyModel[121] = new ModelRendererTurbo(this, 91, 173, textureX, textureY); // Box 103
		bodyModel[122] = new ModelRendererTurbo(this, 98, 173, textureX, textureY); // Box 103
		bodyModel[123] = new ModelRendererTurbo(this, 78, 177, textureX, textureY); // Box 103
		bodyModel[124] = new ModelRendererTurbo(this, 98, 177, textureX, textureY); // Box 103
		bodyModel[125] = new ModelRendererTurbo(this, 83, 177, textureX, textureY); // Box 103
		bodyModel[126] = new ModelRendererTurbo(this, 91, 177, textureX, textureY); // Box 103
		bodyModel[127] = new ModelRendererTurbo(this, 79, 204, textureX, textureY); // Box 380
		bodyModel[128] = new ModelRendererTurbo(this, 104, 167, textureX, textureY,"lamp"); // Box 186 headlight 2beam top A
		bodyModel[129] = new ModelRendererTurbo(this, 104, 172, textureX, textureY,"lamp"); // Box 187 headlight 2beam top A
		bodyModel[130] = new ModelRendererTurbo(this, 83, 226, textureX, textureY); // Box 386
		bodyModel[131] = new ModelRendererTurbo(this, 91, 226, textureX, textureY); // Box 387
		bodyModel[132] = new ModelRendererTurbo(this, 98, 226, textureX, textureY); // Box 388
		bodyModel[133] = new ModelRendererTurbo(this, 98, 230, textureX, textureY); // Box 389
		bodyModel[134] = new ModelRendererTurbo(this, 91, 230, textureX, textureY); // Box 390
		bodyModel[135] = new ModelRendererTurbo(this, 83, 230, textureX, textureY); // Box 391
		bodyModel[136] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 392
		bodyModel[137] = new ModelRendererTurbo(this, 78, 226, textureX, textureY); // Box 393
		bodyModel[138] = new ModelRendererTurbo(this, 170, 232, textureX, textureY); // Box 419 pilot b, c
		bodyModel[139] = new ModelRendererTurbo(this, 192, 232, textureX, textureY); // Box 420 pilot b
		bodyModel[140] = new ModelRendererTurbo(this, 181, 232, textureX, textureY); // Box 421 pilot b
		bodyModel[141] = new ModelRendererTurbo(this, 159, 232, textureX, textureY); // Box 422 pilot b
		bodyModel[142] = new ModelRendererTurbo(this, 152, 232, textureX, textureY); // Box 423 pilot b
		bodyModel[143] = new ModelRendererTurbo(this, 110, 235, textureX, textureY); // Box 424
		bodyModel[144] = new ModelRendererTurbo(this, 64, 235, textureX, textureY); // Box 425
		bodyModel[145] = new ModelRendererTurbo(this, 170, 225, textureX, textureY); // Box 427 pilot b, c
		bodyModel[146] = new ModelRendererTurbo(this, 155, 223, textureX, textureY); // Box 429 pilot b
		bodyModel[147] = new ModelRendererTurbo(this, 196, 224, textureX, textureY); // Box 432 pilot b
		bodyModel[148] = new ModelRendererTurbo(this, 181, 223, textureX, textureY); // Box 433 pilot b
		bodyModel[149] = new ModelRendererTurbo(this, 142, 224, textureX, textureY); // Box 434 pilot b
		bodyModel[150] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 439
		bodyModel[151] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 440
		bodyModel[152] = new ModelRendererTurbo(this, 179, 150, textureX, textureY); // Box 441
		bodyModel[153] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 442
		bodyModel[154] = new ModelRendererTurbo(this, 392, 57, textureX, textureY); // Box 443
		bodyModel[155] = new ModelRendererTurbo(this, 397, 57, textureX, textureY); // Box 444
		bodyModel[156] = new ModelRendererTurbo(this, 409, 50, textureX, textureY); // Box 445
		bodyModel[157] = new ModelRendererTurbo(this, 363, 58, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 371, 56, textureX, textureY); // Box 153
		bodyModel[159] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 448
		bodyModel[160] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[161] = new ModelRendererTurbo(this, 379, 51, textureX, textureY); // Box 453
		bodyModel[162] = new ModelRendererTurbo(this, 379, 56, textureX, textureY); // Box 454
		bodyModel[163] = new ModelRendererTurbo(this, 360, 65, textureX, textureY); // Box 455
		bodyModel[164] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 483
		bodyModel[165] = new ModelRendererTurbo(this, 179, 148, textureX, textureY); // Box 484
		bodyModel[166] = new ModelRendererTurbo(this, 104, 221, textureX, textureY,"lamp"); // Box 186 headlight 2beam bottom A
		bodyModel[167] = new ModelRendererTurbo(this, 104, 226, textureX, textureY,"lamp"); // Box 187 headlight 2beam bottom A
		bodyModel[168] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 403 headlight backpart
		bodyModel[169] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 405 headlight backpart
		bodyModel[170] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 406 headlight backpart
		bodyModel[171] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 404 headlight backpart
		bodyModel[172] = new ModelRendererTurbo(this, 417, 128, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 422, 128, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 412, 128, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 401, 128, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 51, 152, textureX, textureY); // Box 312
		bodyModel[177] = new ModelRendererTurbo(this, 331, 135, textureX, textureY); // Box 332 door swing right hood
		bodyModel[178] = new ModelRendererTurbo(this, 331, 128, textureX, textureY); // Box 335
		bodyModel[179] = new ModelRendererTurbo(this, 331, 148, textureX, textureY); // Box 337
		bodyModel[180] = new ModelRendererTurbo(this, 235, 128, textureX, textureY); // Box 336
		bodyModel[181] = new ModelRendererTurbo(this, 235, 148, textureX, textureY); // Box 338
		bodyModel[182] = new ModelRendererTurbo(this, 123, 152, textureX, textureY); // Box 326
		bodyModel[183] = new ModelRendererTurbo(this, 95, 125, textureX, textureY); // Box 413
		bodyModel[184] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Box 414
		bodyModel[185] = new ModelRendererTurbo(this, 106, 127, textureX, textureY); // Box 416
		bodyModel[186] = new ModelRendererTurbo(this, 68, 127, textureX, textureY); // Box 417
		bodyModel[187] = new ModelRendererTurbo(this, 275, 13, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 288, 15, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 301, 13, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 314, 15, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 82 stack 1
		bodyModel[192] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 85 stack 4
		bodyModel[193] = new ModelRendererTurbo(this, 224, 187, textureX, textureY); // Box 431
		bodyModel[194] = new ModelRendererTurbo(this, 251, 185, textureX, textureY); // Box 432
		bodyModel[195] = new ModelRendererTurbo(this, 229, 200, textureX, textureY); // Box 433
		bodyModel[196] = new ModelRendererTurbo(this, 230, 196, textureX, textureY); // Box 434
		bodyModel[197] = new ModelRendererTurbo(this, 230, 207, textureX, textureY); // Box 435
		bodyModel[198] = new ModelRendererTurbo(this, 233, 211, textureX, textureY); // Box 436
		bodyModel[199] = new ModelRendererTurbo(this, 253, 148, textureX, textureY, "cull"); // Box 437 cull
		bodyModel[200] = new ModelRendererTurbo(this, 343, 148, textureX, textureY, "cull"); // Box 438 cull
		bodyModel[201] = new ModelRendererTurbo(this, 282, 77, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 438
		bodyModel[203] = new ModelRendererTurbo(this, 270, 201, textureX, textureY); // Box 439
		bodyModel[204] = new ModelRendererTurbo(this, 284, 99, textureX, textureY); // Box 441
		bodyModel[205] = new ModelRendererTurbo(this, 259, 232, textureX, textureY); // Box 444
		bodyModel[206] = new ModelRendererTurbo(this, 283, 229, textureX, textureY); // Box 445
		bodyModel[207] = new ModelRendererTurbo(this, 237, 229, textureX, textureY); // Box 446
		bodyModel[208] = new ModelRendererTurbo(this, 212, 234, textureX, textureY); // Box 447
		bodyModel[209] = new ModelRendererTurbo(this, 306, 234, textureX, textureY); // Box 213
		bodyModel[210] = new ModelRendererTurbo(this, 333, 231, textureX, textureY); // Box 214
		bodyModel[211] = new ModelRendererTurbo(this, 284, 212, textureX, textureY); // Box 123
		bodyModel[212] = new ModelRendererTurbo(this, 275, 212, textureX, textureY); // Box 254
		bodyModel[213] = new ModelRendererTurbo(this, 324, 212, textureX, textureY); // Box 138
		bodyModel[214] = new ModelRendererTurbo(this, 305, 212, textureX, textureY); // Box 221
		bodyModel[215] = new ModelRendererTurbo(this, 284, 217, textureX, textureY); // Box 222
		bodyModel[216] = new ModelRendererTurbo(this, 275, 217, textureX, textureY); // Box 223
		bodyModel[217] = new ModelRendererTurbo(this, 324, 217, textureX, textureY); // Box 224
		bodyModel[218] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 225
		bodyModel[219] = new ModelRendererTurbo(this, 97, 242, textureX, textureY); // Box 1
		bodyModel[220] = new ModelRendererTurbo(this, 97, 204, textureX, textureY); // Box 106
		bodyModel[221] = new ModelRendererTurbo(this, 92, 205, textureX, textureY); // Box 381
		bodyModel[222] = new ModelRendererTurbo(this, 84, 205, textureX, textureY); // Box 382
		bodyModel[223] = new ModelRendererTurbo(this, 486, 113, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 444, 68, textureX, textureY); // Box 131
		bodyModel[225] = new ModelRendererTurbo(this, 447, 70, textureX, textureY); // Box 131
		bodyModel[226] = new ModelRendererTurbo(this, 462, 87, textureX, textureY); // Box 131
		bodyModel[227] = new ModelRendererTurbo(this, 467, 85, textureX, textureY); // Box 131
		bodyModel[228] = new ModelRendererTurbo(this, 476, 87, textureX, textureY); // Box 131
		bodyModel[229] = new ModelRendererTurbo(this, 436, 70, textureX, textureY); // Box 131
		bodyModel[230] = new ModelRendererTurbo(this, 461, 82, textureX, textureY); // Box 131
		bodyModel[231] = new ModelRendererTurbo(this, 462, 74, textureX, textureY); // Box 131
		bodyModel[232] = new ModelRendererTurbo(this, 427, 97, textureX, textureY); // Box 293
		bodyModel[233] = new ModelRendererTurbo(this, 427, 85, textureX, textureY); // Box 865
		bodyModel[234] = new ModelRendererTurbo(this, 474, 96, textureX, textureY); // Box 602
		bodyModel[235] = new ModelRendererTurbo(this, 486, 96, textureX, textureY); // Box 603
		bodyModel[236] = new ModelRendererTurbo(this, 478, 96, textureX, textureY); // Box 604
		bodyModel[237] = new ModelRendererTurbo(this, 491, 96, textureX, textureY); // Box 605
		bodyModel[238] = new ModelRendererTurbo(this, 497, 115, textureX, textureY); // Box 606
		bodyModel[239] = new ModelRendererTurbo(this, 475, 125, textureX, textureY); // Box 356
		bodyModel[240] = new ModelRendererTurbo(this, 478, 105, textureX, textureY); // Box 357
		bodyModel[241] = new ModelRendererTurbo(this, 474, 104, textureX, textureY); // Box 358
		bodyModel[242] = new ModelRendererTurbo(this, 470, 65, textureX, textureY); // Box 359
		bodyModel[243] = new ModelRendererTurbo(this, 461, 78, textureX, textureY); // Box 360
		bodyModel[244] = new ModelRendererTurbo(this, 431, 78, textureX, textureY); // Box 361
		bodyModel[245] = new ModelRendererTurbo(this, 472, 123, textureX, textureY); // Box 362
		bodyModel[246] = new ModelRendererTurbo(this, 465, 131, textureX, textureY); // Box 407
		bodyModel[247] = new ModelRendererTurbo(this, 458, 121, textureX, textureY); // Box 409
		bodyModel[248] = new ModelRendererTurbo(this, 451, 121, textureX, textureY); // Box 410
		bodyModel[249] = new ModelRendererTurbo(this, 441, 131, textureX, textureY); // Box 411
		bodyModel[250] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 366, 156, textureX, textureY); // Box 13
		bodyModel[252] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 513
		bodyModel[253] = new ModelRendererTurbo(this, 417, 237, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 417, 222, textureX, textureY); // Box 2
		bodyModel[255] = new ModelRendererTurbo(this, 417, 192, textureX, textureY); // Box 3
		bodyModel[256] = new ModelRendererTurbo(this, 417, 176, textureX, textureY); // Box 4
		bodyModel[257] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 5
		bodyModel[258] = new ModelRendererTurbo(this, 425, 155, textureX, textureY); // Box 6
		bodyModel[259] = new ModelRendererTurbo(this, 396, 204, textureX, textureY); // Box 10
		bodyModel[260] = new ModelRendererTurbo(this, 407, 204, textureX, textureY); // Box 11
		bodyModel[261] = new ModelRendererTurbo(this, 385, 204, textureX, textureY); // Box 12
		bodyModel[262] = new ModelRendererTurbo(this, 394, 213, textureX, textureY); // Box 13
		bodyModel[263] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 14
		bodyModel[264] = new ModelRendererTurbo(this, 417, 208, textureX, textureY); // Box 3
		bodyModel[265] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[266] = new ModelRendererTurbo(this, 397, 187, textureX, textureY); // Box 9
		bodyModel[267] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[268] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[269] = new ModelRendererTurbo(this, 392, 182, textureX, textureY); // Box 21
		bodyModel[270] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 393, 202, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[273] = new ModelRendererTurbo(this, 370, 210, textureX, textureY); // Box 10
		bodyModel[274] = new ModelRendererTurbo(this, 425, 162, textureX, textureY); // Box 7
		bodyModel[275] = new ModelRendererTurbo(this, 379, 236, textureX, textureY); // Box 110
		bodyModel[276] = new ModelRendererTurbo(this, 369, 230, textureX, textureY); // Box 111
		bodyModel[277] = new ModelRendererTurbo(this, 384, 229, textureX, textureY); // Box 112
		bodyModel[278] = new ModelRendererTurbo(this, 401, 230, textureX, textureY); // Box 113
		bodyModel[279] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 116
		bodyModel[280] = new ModelRendererTurbo(this, 407, 239, textureX, textureY); // Box 522
		bodyModel[281] = new ModelRendererTurbo(this, 374, 222, textureX, textureY); // Box 523
		bodyModel[282] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		bodyModel[283] = new ModelRendererTurbo(this, 385, 221, textureX, textureY); // Box 256
		bodyModel[284] = new ModelRendererTurbo(this, 501, 75, textureX, textureY); // Box 412
		bodyModel[285] = new ModelRendererTurbo(this, 491, 63, textureX, textureY); // Box 413
		bodyModel[286] = new ModelRendererTurbo(this, 485, 56, textureX, textureY); // Box 86
		bodyModel[287] = new ModelRendererTurbo(this, 332, 13, textureX, textureY); // Single Steam Genorator
		bodyModel[288] = new ModelRendererTurbo(this, 342, 13, textureX, textureY); // Single Steam Genorator
		bodyModel[289] = new ModelRendererTurbo(this, 332, 17, textureX, textureY); // Duel Steam Genorator
		bodyModel[290] = new ModelRendererTurbo(this, 342, 17, textureX, textureY); // Duel Steam Genorator
		bodyModel[291] = new ModelRendererTurbo(this, 332, 17, textureX, textureY); // Duel Steam Genorator
		bodyModel[292] = new ModelRendererTurbo(this, 342, 17, textureX, textureY); // Duel Steam Genorator
		bodyModel[293] = new ModelRendererTurbo(this, 369, 34, textureX, textureY); // exhaust 1
		bodyModel[294] = new ModelRendererTurbo(this, 357, 34, textureX, textureY); // exhaust 1
		bodyModel[295] = new ModelRendererTurbo(this, 358, 27, textureX, textureY); // Box 32
		bodyModel[296] = new ModelRendererTurbo(this, 391, 35, textureX, textureY); // Box 32
		bodyModel[297] = new ModelRendererTurbo(this, 389, 34, textureX, textureY); // Box 549
		bodyModel[298] = new ModelRendererTurbo(this, 401, 34, textureX, textureY); // Box 550
		bodyModel[299] = new ModelRendererTurbo(this, 390, 27, textureX, textureY); // Box 551
		bodyModel[300] = new ModelRendererTurbo(this, 379, 24, textureX, textureY); // exhaust 1
		bodyModel[301] = new ModelRendererTurbo(this, 385, 24, textureX, textureY); // Box 549
		bodyModel[302] = new ModelRendererTurbo(this, 381, 20, textureX, textureY); // Box 32
		bodyModel[303] = new ModelRendererTurbo(this, 359, 35, textureX, textureY); // Box 561
		bodyModel[304] = new ModelRendererTurbo(this, 373, 20, textureX, textureY); // Box 562
		bodyModel[305] = new ModelRendererTurbo(this, 373, 24, textureX, textureY); // exhaust 1
		bodyModel[306] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 9
		bodyModel[307] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 457
		bodyModel[308] = new ModelRendererTurbo(this, 289, 4, textureX, textureY); // Box 458
		bodyModel[309] = new ModelRendererTurbo(this, 195, 228, textureX, textureY); // Box 310
		bodyModel[310] = new ModelRendererTurbo(this, 256, 21, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[311] = new ModelRendererTurbo(this, 256, 30, textureX, textureY, "cull"); // Box 312 winterization hatch extendous cull
		bodyModel[312] = new ModelRendererTurbo(this, 94, 137, textureX, textureY); // Box 364 prime base
		bodyModel[313] = new ModelRendererTurbo(this, 94, 133, textureX, textureY,BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[314] = new ModelRendererTurbo(this, 94, 133, textureX, textureY,BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[315] = new ModelRendererTurbo(this, 94, 133, textureX, textureY,BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[316] = new ModelRendererTurbo(this, 94, 133, textureX, textureY,BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[317] = new ModelRendererTurbo(this, 118, 167, textureX, textureY,"lamp"); // Box 186 headlight 2beam top B
		bodyModel[318] = new ModelRendererTurbo(this, 111, 167, textureX, textureY,"lamp"); // Box 187 headlight 2beam top B
		bodyModel[319] = new ModelRendererTurbo(this, 118, 221, textureX, textureY); // Box 186 headlight 2beam bottom B
		bodyModel[320] = new ModelRendererTurbo(this, 111, 221, textureX, textureY); // Box 187 headlight 2beam bottom B
		bodyModel[321] = new ModelRendererTurbo(this, 111, 172, textureX, textureY,"lamp"); // Box 169 headlight big top
		bodyModel[322] = new ModelRendererTurbo(this, 134, 240, textureX, textureY,BoxName.ditch); // Box 443 ditchlight front a
		bodyModel[323] = new ModelRendererTurbo(this, 129, 243, textureX, textureY); // Box 444
		bodyModel[324] = new ModelRendererTurbo(this, 134, 240, textureX, textureY,BoxName.ditch); // Box 445 ditchlight front a
		bodyModel[325] = new ModelRendererTurbo(this, 129, 243, textureX, textureY); // Box 446
		bodyModel[326] = new ModelRendererTurbo(this, 154, 193, textureX, textureY); // Box 474 pilot c
		bodyModel[327] = new ModelRendererTurbo(this, 176, 205, textureX, textureY); // Box 476 pilot c
		bodyModel[328] = new ModelRendererTurbo(this, 176, 193, textureX, textureY); // Box 477 pilot c
		bodyModel[329] = new ModelRendererTurbo(this, 197, 205, textureX, textureY); // Box 478 pilot c
		bodyModel[330] = new ModelRendererTurbo(this, 158, 205, textureX, textureY); // Box 479 pilot c
		bodyModel[331] = new ModelRendererTurbo(this, 176, 215, textureX, textureY); // Box 480 pilot c
		bodyModel[332] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 481 pilot c
		bodyModel[333] = new ModelRendererTurbo(this, 197, 193, textureX, textureY); // Box 482 pilot c
		bodyModel[334] = new ModelRendererTurbo(this, 170, 244, textureX, textureY); // Box 1 pilot a
		bodyModel[335] = new ModelRendererTurbo(this, 159, 244, textureX, textureY); // Box 1297 pilot a
		bodyModel[336] = new ModelRendererTurbo(this, 181, 244, textureX, textureY); // Box 1299 pilot a
		bodyModel[337] = new ModelRendererTurbo(this, 152, 246, textureX, textureY); // Box 1300 pilot a
		bodyModel[338] = new ModelRendererTurbo(this, 192, 246, textureX, textureY); // Box 1301 pilot a
		bodyModel[339] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 215
		bodyModel[340] = new ModelRendererTurbo(this, 145, 59, textureX, textureY); // Box 216
		bodyModel[341] = new ModelRendererTurbo(this, 145, 62, textureX, textureY); // Box 217
		bodyModel[342] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 218
		bodyModel[343] = new ModelRendererTurbo(this, 171, 53, textureX, textureY); // Box 404
		bodyModel[344] = new ModelRendererTurbo(this, 158, 51, textureX, textureY); // Box 405
		bodyModel[345] = new ModelRendererTurbo(this, 171, 53, textureX, textureY); // Box 404
		bodyModel[346] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Can be used as antenna
		bodyModel[347] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 404
		bodyModel[348] = new ModelRendererTurbo(this, 86, 126, textureX, textureY); // Box 415
		bodyModel[349] = new ModelRendererTurbo(this, 171, 48, textureX, textureY); // Box 486
		bodyModel[350] = new ModelRendererTurbo(this, 153, 46, textureX, textureY); // Box 299
		bodyModel[351] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 300
		bodyModel[352] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Box 301
		bodyModel[353] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // Box 302
		bodyModel[354] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Box 145
		bodyModel[355] = new ModelRendererTurbo(this, 79, 245, textureX, textureY); // Box 146
		bodyModel[356] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Box 147
		bodyModel[357] = new ModelRendererTurbo(this, 79, 243, textureX, textureY); // Box 148
		bodyModel[358] = new ModelRendererTurbo(this, 74, 243, textureX, textureY); // Box 435
		bodyModel[359] = new ModelRendererTurbo(this, 74, 245, textureX, textureY); // Box 436
		bodyModel[360] = new ModelRendererTurbo(this, 74, 243, textureX, textureY); // Box 437
		bodyModel[361] = new ModelRendererTurbo(this, 74, 245, textureX, textureY); // Box 438
		bodyModel[362] = new ModelRendererTurbo(this, 298, 1, textureX, textureY); // Box 398 trainphone
		bodyModel[363] = new ModelRendererTurbo(this, 298, 1, textureX, textureY); // Box 399 trainphone
		bodyModel[364] = new ModelRendererTurbo(this, 174, 48, textureX, textureY); // Box 194
		bodyModel[365] = new ModelRendererTurbo(this, 256, 13, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 390, 17, textureX, textureY); // Box 0
		bodyModel[367] = new ModelRendererTurbo(this, 400, 24, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 390, 24, textureX, textureY); // Box 0
		bodyModel[369] = new ModelRendererTurbo(this, 361, -7, textureX, textureY); // Box 0
		bodyModel[370] = new ModelRendererTurbo(this, 358, 11, textureX, textureY); // Box 0
		bodyModel[371] = new ModelRendererTurbo(this, 400, 11, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 358, 17, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 358, 24, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 368, 24, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 363, 24, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 395, 24, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 179, 40, textureX, textureY); // M3 Hork
		bodyModel[378] = new ModelRendererTurbo(this, 180, 37, textureX, textureY); // M3 Hork
		bodyModel[379] = new ModelRendererTurbo(this, 187, 40, textureX, textureY); // M3 Hork
		bodyModel[380] = new ModelRendererTurbo(this, 179, 43, textureX, textureY); // M3 Hork
		bodyModel[381] = new ModelRendererTurbo(this, 121, 48, textureX, textureY,"lamp"); // Box 385 Searchlight left
		bodyModel[382] = new ModelRendererTurbo(this, 121, 48, textureX, textureY,"lamp"); // Box 386 Searchlight right
		bodyModel[383] = new ModelRendererTurbo(this, 118, 58, textureX, textureY); // Box 387 searchlight sockets
		bodyModel[384] = new ModelRendererTurbo(this, 120, 53, textureX, textureY); // Box 387
		bodyModel[385] = new ModelRendererTurbo(this, 177, 52, textureX, textureY); // M5 Hork
		bodyModel[386] = new ModelRendererTurbo(this, 178, 58, textureX, textureY); // M5 Hork
		bodyModel[387] = new ModelRendererTurbo(this, 179, 46, textureX, textureY); // M5 Hork
		bodyModel[388] = new ModelRendererTurbo(this, 179, 49, textureX, textureY); // M5 Hork
		bodyModel[389] = new ModelRendererTurbo(this, 179, 55, textureX, textureY); // M5 Hork
		bodyModel[390] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 114
		bodyModel[391] = new ModelRendererTurbo(this, 134, 43, textureX, textureY); // Box 74
		bodyModel[392] = new ModelRendererTurbo(this, 134, 49, textureX, textureY); // Box 78
		bodyModel[393] = new ModelRendererTurbo(this, 139, 47, textureX, textureY); // Box 470
		bodyModel[394] = new ModelRendererTurbo(this, 131, 48, textureX, textureY); // Box 471
		bodyModel[395] = new ModelRendererTurbo(this, 133, 40, textureX, textureY); // Box 472
		bodyModel[396] = new ModelRendererTurbo(this, 251, 49, textureX, textureY, "cull"); // Box 0 winterization hatch CN cull
		bodyModel[397] = new ModelRendererTurbo(this, 249, 56, textureX, textureY, "cull"); // Box 0 winterization hatch CN cull
		bodyModel[398] = new ModelRendererTurbo(this, 251, 65, textureX, textureY, "cull"); // Box 0 winterization hatch CN cull
		bodyModel[399] = new ModelRendererTurbo(this, 250, 39, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[400] = new ModelRendererTurbo(this, 311, 25, textureX, textureY); // Box 82 stack 1
		bodyModel[401] = new ModelRendererTurbo(this, 311, 25, textureX, textureY); // Box 85 stack 4
		bodyModel[402] = new ModelRendererTurbo(this, 292, 24, textureX, textureY); // Box 0
		bodyModel[403] = new ModelRendererTurbo(this, 292, 24, textureX, textureY); // Box 0
		bodyModel[404] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // M5 Hork
		bodyModel[405] = new ModelRendererTurbo(this, 384, 69, textureX, textureY,"lamp"); // Box 247 headlight rear left
		bodyModel[406] = new ModelRendererTurbo(this, 384, 64, textureX, textureY,"lamp"); // Box 418 headlight rear right
		bodyModel[407] = new ModelRendererTurbo(this, 124, 240, textureX, textureY,BoxName.ditch); // Box 443 ditchlight front a
		bodyModel[408] = new ModelRendererTurbo(this, 117, 243, textureX, textureY); // Ditchlight box
		bodyModel[409] = new ModelRendererTurbo(this, 124, 240, textureX, textureY,BoxName.ditch); // Box 445 ditchlight front a
		bodyModel[410] = new ModelRendererTurbo(this, 117, 243, textureX, textureY); // Ditchlight box
		bodyModel[411] = new ModelRendererTurbo(this, 115, 178, textureX, textureY); // Box 111
		bodyModel[412] = new ModelRendererTurbo(this, 51, 178, textureX, textureY); // Box 144
		bodyModel[413] = new ModelRendererTurbo(this, 125, 175, textureX, textureY,"lamp"); // Box 184 numberboard glow
		bodyModel[414] = new ModelRendererTurbo(this, 45, 175, textureX, textureY,"lamp"); // Box 185 numberboard glow
		bodyModel[415] = new ModelRendererTurbo(this, 209, 44, textureX, textureY); // M3 Hork
		bodyModel[416] = new ModelRendererTurbo(this, 209, 38, textureX, textureY); // M3 Hork
		bodyModel[417] = new ModelRendererTurbo(this, 218, 41, textureX, textureY); // M3 Hork
		bodyModel[418] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // M3 Hork
		bodyModel[419] = new ModelRendererTurbo(this, 165, 43, textureX, textureY); // Box 193
		bodyModel[420] = new ModelRendererTurbo(this, 167, 37, textureX, textureY); // Box 195
		bodyModel[421] = new ModelRendererTurbo(this, 146, 40, textureX, textureY,"lamp"); // Box 348 commander beacon
		bodyModel[422] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[423] = new ModelRendererTurbo(this, 209, 54, textureX, textureY); // ARR Horn
		bodyModel[424] = new ModelRendererTurbo(this, 209, 60, textureX, textureY); // ARR Horn
		bodyModel[425] = new ModelRendererTurbo(this, 209, 48, textureX, textureY); // ARR Horn
		bodyModel[426] = new ModelRendererTurbo(this, 209, 51, textureX, textureY); // ARR Horn
		bodyModel[427] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // ARR Horn
		bodyModel[428] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 194
		bodyModel[429] = new ModelRendererTurbo(this, 160, 59, textureX, textureY); // Box 405
		bodyModel[430] = new ModelRendererTurbo(this, 166, 59, textureX, textureY); // Box 406
		bodyModel[431] = new ModelRendererTurbo(this, 319, 24, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[432] = new ModelRendererTurbo(this, 299, 12, textureX, textureY); // Box 82 stack 1
		bodyModel[433] = new ModelRendererTurbo(this, 299, 12, textureX, textureY); // Box 82 stack 1
		bodyModel[434] = new ModelRendererTurbo(this, 299, 12, textureX, textureY); // Box 82 stack 1
		bodyModel[435] = new ModelRendererTurbo(this, 299, 12, textureX, textureY); // Box 82 stack 1
		bodyModel[436] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 515
		bodyModel[437] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 526
		bodyModel[438] = new ModelRendererTurbo(this, 311, 60, textureX, textureY); // Box 171
		bodyModel[439] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Box 172
		bodyModel[440] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Box 173
		bodyModel[441] = new ModelRendererTurbo(this, 321, 55, textureX, textureY); // Box 174
		bodyModel[442] = new ModelRendererTurbo(this, 311, 60, textureX, textureY); // Box 580
		bodyModel[443] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Box 581
		bodyModel[444] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Box 582
		bodyModel[445] = new ModelRendererTurbo(this, 321, 55, textureX, textureY); // Box 583
		bodyModel[446] = new ModelRendererTurbo(this, 194, 43, textureX, textureY); // M5 Hork
		bodyModel[447] = new ModelRendererTurbo(this, 194, 49, textureX, textureY); // M5 Hork
		bodyModel[448] = new ModelRendererTurbo(this, 194, 37, textureX, textureY); // M5 Hork
		bodyModel[449] = new ModelRendererTurbo(this, 194, 40, textureX, textureY); // M5 Hork
		bodyModel[450] = new ModelRendererTurbo(this, 194, 46, textureX, textureY); // M5 Hork
		bodyModel[451] = new ModelRendererTurbo(this, 312, 143, textureX, textureY); // Box 222
		bodyModel[452] = new ModelRendererTurbo(this, 312, 149, textureX, textureY); // Box 223
		bodyModel[453] = new ModelRendererTurbo(this, 83, 221, textureX, textureY); // Box 556
		bodyModel[454] = new ModelRendererTurbo(this, 91, 221, textureX, textureY); // Box 557
		bodyModel[455] = new ModelRendererTurbo(this, 492, 75, textureX, textureY,"lamp"); // Box 71 glow speedometer
		bodyModel[456] = new ModelRendererTurbo(this, 492, 82, textureX, textureY); // Box 307
		bodyModel[457] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Box 149
		bodyModel[458] = new ModelRendererTurbo(this, 74, 221, textureX, textureY); // Box 150
		bodyModel[459] = new ModelRendererTurbo(this, 330, 33, textureX, textureY); // Duel Steam Genorator
		bodyModel[460] = new ModelRendererTurbo(this, 339, 26, textureX, textureY); // Duel Steam Genorator
		bodyModel[461] = new ModelRendererTurbo(this, 125, 177, textureX, textureY,"lamp"); // Box 352 markerlight
		bodyModel[462] = new ModelRendererTurbo(this, 51, 177, textureX, textureY,"lamp"); // Box 353 markerlight
		bodyModel[463] = new ModelRendererTurbo(this, 372, 67, textureX, textureY,"lamp"); // Box 247 headlight rear left bottom gyra
		bodyModel[464] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 152
		bodyModel[465] = new ModelRendererTurbo(this, 177, 146, textureX, textureY); // Box 153
		bodyModel[466] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 177
		bodyModel[467] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 178
		bodyModel[468] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 198
		bodyModel[469] = new ModelRendererTurbo(this, 191, 147, textureX, textureY); // Box 199
		bodyModel[470] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 154
		bodyModel[471] = new ModelRendererTurbo(this, 398, 146, textureX, textureY); // Box 155
		bodyModel[472] = new ModelRendererTurbo(this, 452, 12, textureX, textureY); // Box 0 steam gen
		bodyModel[473] = new ModelRendererTurbo(this, 453, 28, textureX, textureY); // Box 0 steam gen
		bodyModel[474] = new ModelRendererTurbo(this, 448, 6, textureX, textureY); // Box 0 steam gen
		bodyModel[475] = new ModelRendererTurbo(this, 443, 17, textureX, textureY); // Box 0 steam gen
		bodyModel[476] = new ModelRendererTurbo(this, 452, 12, textureX, textureY); // Box 0 steam gen
		bodyModel[477] = new ModelRendererTurbo(this, 453, 28, textureX, textureY); // Box 0 steam gen
		bodyModel[478] = new ModelRendererTurbo(this, 448, 6, textureX, textureY); // Box 0 steam gen
		bodyModel[479] = new ModelRendererTurbo(this, 443, 17, textureX, textureY); // Box 0 steam gen
		bodyModel[480] = new ModelRendererTurbo(this, 491, 13, textureX, textureY); // Box 0 steam gen
		bodyModel[481] = new ModelRendererTurbo(this, 492, 29, textureX, textureY); // Box 0 steam gen
		bodyModel[482] = new ModelRendererTurbo(this, 487, 7, textureX, textureY); // Box 0 steam gen
		bodyModel[483] = new ModelRendererTurbo(this, 482, 18, textureX, textureY); // Box 0 steam gen

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(34.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0 cull
		bodyModel[1].setRotationPoint(-11.5F, -15F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 17, 1, 0F); // Box 0 cull
		bodyModel[2].setRotationPoint(-11.5F, -15F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-26F, -10F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-26F, -10F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[5].setRotationPoint(33.5F, 3F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[6].setRotationPoint(33.5F, 1F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[7].setRotationPoint(33.5F, 3F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[8].setRotationPoint(33.5F, 3F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 0
		bodyModel[9].setRotationPoint(33.5F, -15F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-20.5F, -19F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 55, 1, 6, 0F); // Box 0
		bodyModel[11].setRotationPoint(-20.5F, -19F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-20.5F, -19F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-20.5F, -18F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-20.5F, -18F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 55, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-20.5F, -16F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 55, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-20.5F, -16F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[17].setRotationPoint(33.5F, -17F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[18].setRotationPoint(33.5F, -18F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(33.5F, -17F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(33.5F, -17F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(33.5F, -18F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(33.5F, -18F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-25F, -18F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-22.5F, -19F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -2F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-22.5F, -19F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -0.5F, -1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(-22.5F, -18F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-21.5F, -16F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[28].setRotationPoint(-35F, -10F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[29].setRotationPoint(-32F, -14F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 118
		bodyModel[30].setRotationPoint(-29F, -14F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[31].setRotationPoint(-21.5F, -16F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-15.5F, -3F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[33].setRotationPoint(-15.5F, -3F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[34].setRotationPoint(-17F, -15F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-20.5F, -15F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-16F, -15F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(-15.5F, -15F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 42
		bodyModel[38].setRotationPoint(2.5F, 2F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[39].setRotationPoint(2.5F, 6F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(-1.5F, 3.5F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 3, 7, 0F); // Box 46
		bodyModel[41].setRotationPoint(-1.5F, 3.5F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[42].setRotationPoint(-1.5F, 6.5F, 2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[43].setRotationPoint(-1.5F, 3.5F, 9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[44].setRotationPoint(2.5F, 6F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[45].setRotationPoint(2.5F, 6F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 21, 0F); // Box 139
		bodyModel[46].setRotationPoint(-1.5F, 1.5F, -10.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[47].setRotationPoint(6.5F, 2F, -10.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[48].setRotationPoint(6.5F, 2F, 9.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[49].setRotationPoint(-35.5F, 1F, -2.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[50].setRotationPoint(-11F, -11F, -11.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[51].setRotationPoint(-16F, -11F, -11.75F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[52].setRotationPoint(-15.5F, 2F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[53].setRotationPoint(-15.5F, 2F, 11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[54].setRotationPoint(-25F, 2F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[55].setRotationPoint(-25F, 2F, 11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 179
		bodyModel[56].setRotationPoint(26F, -9F, 10.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[57].setRotationPoint(21F, -9F, 10.75F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[58].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[59].setRotationPoint(21.5F, 2F, 11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[60].setRotationPoint(31F, 2F, 11F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[61].setRotationPoint(30.5F, 2F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 43, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 196
		bodyModel[62].setRotationPoint(-10F, -14.5F, -11.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 43, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 197
		bodyModel[63].setRotationPoint(-10F, -14.5F, 10.25F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[64].setRotationPoint(34F, -4F, 10.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[65].setRotationPoint(31F, -4F, 10.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[66].setRotationPoint(34.5F, -19F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[67].setRotationPoint(34.5F, -19F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[68].setRotationPoint(34.5F, -14F, -4F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[69].setRotationPoint(34.5F, -14F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[70].setRotationPoint(34.5F, -19F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 278
		bodyModel[71].setRotationPoint(-32F, -10F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F); // Box 279
		bodyModel[72].setRotationPoint(-31F, -10F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[73].setRotationPoint(-28F, -10F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, -1.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1.5F, 0F, 1F, 3F, 0F); // Box 281
		bodyModel[74].setRotationPoint(-29F, -14F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5F, 1.5F, 0F); // Box 282
		bodyModel[75].setRotationPoint(-29F, -14F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 284
		bodyModel[76].setRotationPoint(-30F, -14F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -2F, -2.75F, 0F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F, -2F, 1.75F, -1F, 0F, 1F, -3F); // Box 289
		bodyModel[77].setRotationPoint(-30F, -13F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 291
		bodyModel[78].setRotationPoint(-26F, -13F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 294
		bodyModel[79].setRotationPoint(-32F, -10F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 2F); // Box 295
		bodyModel[80].setRotationPoint(-31F, -10F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[81].setRotationPoint(-28F, -10F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1.5F, 1F, 0F); // Box 311
		bodyModel[82].setRotationPoint(-24F, -15F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, -3F, 0F, 0F, -1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[83].setRotationPoint(-29F, -14F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[84].setRotationPoint(-29F, -14F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[85].setRotationPoint(-30F, -14F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 323
		bodyModel[86].setRotationPoint(-25F, -17F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3.5F, -1F, 0F, 3.5F, -1F, 0F, 3F, 1F, 0F, -3F, 1F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[87].setRotationPoint(-25F, -16F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 325
		bodyModel[88].setRotationPoint(-24F, -15F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-2.5F, 1F, 0F, 2.5F, 1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 327
		bodyModel[89].setRotationPoint(-25F, -17F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-3F, 1F, 0F, 3F, 1F, 0F, 3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 328
		bodyModel[90].setRotationPoint(-25F, -16F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.9F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F); // Box 329
		bodyModel[91].setRotationPoint(-24F, -13F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F); // Box 330
		bodyModel[92].setRotationPoint(-22.5F, -19F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 331
		bodyModel[93].setRotationPoint(-22.5F, -18F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 332
		bodyModel[94].setRotationPoint(-35F, 2F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[95].setRotationPoint(-35F, 2F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -5F, 0F, -2F); // Box 335
		bodyModel[96].setRotationPoint(-33F, 2F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[97].setRotationPoint(-32.5F, -12F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[98].setRotationPoint(-32.5F, -12F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[99].setRotationPoint(-32.5F, -14F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[100].setRotationPoint(-32.5F, -14F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 866
		bodyModel[101].setRotationPoint(-32F, -12F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -3F, 0F, -1F, -2F, 0F, -1F, 0.75F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 867
		bodyModel[102].setRotationPoint(-31F, -13F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,1F, -1F, 0F, -1F, 0.75F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 868
		bodyModel[103].setRotationPoint(-31F, -13F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 869
		bodyModel[104].setRotationPoint(-32F, -12F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		bodyModel[105].setRotationPoint(-33F, 2F, -13F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.75F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 1302
		bodyModel[106].setRotationPoint(-31F, -11F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -1F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1303
		bodyModel[107].setRotationPoint(-31F, -11F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, -3F, -2F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, -2F, 1.75F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 1304
		bodyModel[108].setRotationPoint(-30F, -13F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2.5F, 0F, 0.9F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 1305
		bodyModel[109].setRotationPoint(-24F, -13F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -2.75F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 1306
		bodyModel[110].setRotationPoint(-26F, -13F, -11F);

		bodyModel[111].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[111].setRotationPoint(-12F, -14F, -10.5F);

		bodyModel[112].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right cab
		bodyModel[112].setRotationPoint(-12F, -14F, 10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 326
		bodyModel[113].setRotationPoint(-21F, -19F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 327
		bodyModel[114].setRotationPoint(-21F, -19F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 328
		bodyModel[115].setRotationPoint(-21F, -19F, 2F);

		bodyModel[116].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[116].setRotationPoint(25F, -10F, -10.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 333
		bodyModel[117].setRotationPoint(25.5F, -15F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 9, 17, 1, 0F); // Box 334
		bodyModel[118].setRotationPoint(25.5F, -15F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[119].setRotationPoint(-33.5F, -14F, 1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[120].setRotationPoint(-33.5F, -14F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[121].setRotationPoint(-33.5F, -14F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[122].setRotationPoint(-33.5F, -14F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[123].setRotationPoint(-33.5F, -12F, 1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[124].setRotationPoint(-33.5F, -12F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[125].setRotationPoint(-33.5F, -11F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[126].setRotationPoint(-33.5F, -11F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[127].setRotationPoint(-33F, -12F, 1F);

		bodyModel[128].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[128].setRotationPoint(-32.75F, -12F, 0F);

		bodyModel[129].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[129].setRotationPoint(-32.75F, -12F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 386
		bodyModel[130].setRotationPoint(-34.5F, -8F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 387
		bodyModel[131].setRotationPoint(-34.5F, -8F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 388
		bodyModel[132].setRotationPoint(-34.5F, -8F, -2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 389
		bodyModel[133].setRotationPoint(-34.5F, -6F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[134].setRotationPoint(-34.5F, -5F, -2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 391
		bodyModel[135].setRotationPoint(-34.5F, -5F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 392
		bodyModel[136].setRotationPoint(-34.5F, -6F, 1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[137].setRotationPoint(-34.5F, -8F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 419 pilot b, c
		bodyModel[138].setRotationPoint(-35F, 5F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.55F, 0F, 0.75F, 0.5F, 0F, 0.75F); // Box 420 pilot b
		bodyModel[139].setRotationPoint(-33F, 5F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 421 pilot b
		bodyModel[140].setRotationPoint(-35F, 5F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 422 pilot b
		bodyModel[141].setRotationPoint(-35F, 5F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.5F, 0F, 0.75F, -0.55F, 0F, 0.75F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 423 pilot b
		bodyModel[142].setRotationPoint(-33F, 5F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[143].setRotationPoint(-28F, 2F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[144].setRotationPoint(-28F, 2F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427 pilot b, c
		bodyModel[145].setRotationPoint(-34F, 3F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 429 pilot b
		bodyModel[146].setRotationPoint(-34F, 3F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-4F, 0F, -2F, 4F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 432 pilot b
		bodyModel[147].setRotationPoint(-32F, 3F, -13F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433 pilot b
		bodyModel[148].setRotationPoint(-34F, 3F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 3F, 0F, -3F, -3F, 0F, -3F); // Box 434 pilot b
		bodyModel[149].setRotationPoint(-32F, 3F, 8F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 439
		bodyModel[150].setRotationPoint(-15F, 1F, -11.75F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 440
		bodyModel[151].setRotationPoint(-15F, -3F, -11.75F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 441
		bodyModel[152].setRotationPoint(-15F, -3F, 10.75F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 442
		bodyModel[153].setRotationPoint(-15F, 1F, 10.75F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 443
		bodyModel[154].setRotationPoint(35.5F, -15F, 4F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 444
		bodyModel[155].setRotationPoint(35.5F, -15F, -5F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 445
		bodyModel[156].setRotationPoint(34.5F, -15F, -4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[157].setRotationPoint(35.5F, -16F, -5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[158].setRotationPoint(35.5F, -16F, 0F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 448
		bodyModel[159].setRotationPoint(34.5F, 1F, -4F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[160].setRotationPoint(34F, -13F, -2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[161].setRotationPoint(35.5F, -14F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[162].setRotationPoint(35.5F, -14F, -3F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 455
		bodyModel[163].setRotationPoint(34.5F, 2F, -3.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 483
		bodyModel[164].setRotationPoint(-15F, -1F, 10.75F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 484
		bodyModel[165].setRotationPoint(-15F, -1F, -11.75F);

		bodyModel[166].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[166].setRotationPoint(-34.1F, -6F, 0F);

		bodyModel[167].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[167].setRotationPoint(-34.1F, -6F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight backpart
		bodyModel[168].setRotationPoint(-33.7F, -8F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 405 headlight backpart
		bodyModel[169].setRotationPoint(-33.7F, -6F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 406 headlight backpart
		bodyModel[170].setRotationPoint(-33.7F, -6F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight backpart
		bodyModel[171].setRotationPoint(-33.7F, -8F, -2F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[172].setRotationPoint(-17F, -15F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[173].setRotationPoint(-20.5F, -15F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[174].setRotationPoint(-16F, -15F, 10F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[175].setRotationPoint(-15.5F, -15F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 312
		bodyModel[176].setRotationPoint(-23F, -15F, 10F);

		bodyModel[177].addShapeBox(-3.5F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[177].setRotationPoint(25F, -10F, 10.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[178].setRotationPoint(21.5F, -15F, 10F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 337
		bodyModel[179].setRotationPoint(21.5F, 1F, 10F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[180].setRotationPoint(21.5F, -15F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 338
		bodyModel[181].setRotationPoint(21.5F, 1F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
		bodyModel[182].setRotationPoint(-23F, -15F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 413
		bodyModel[183].setRotationPoint(-20.5F, -19F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[184].setRotationPoint(-20.5F, -19F, 2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 416
		bodyModel[185].setRotationPoint(-20.5F, -17F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[186].setRotationPoint(-20.5F, -17F, 7F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[187].setRotationPoint(-0.5F, -20F, -2F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[188].setRotationPoint(5.5F, -20F, -2F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[189].setRotationPoint(10.5F, -20F, -2F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[190].setRotationPoint(16.5F, -20F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82 stack 1
		bodyModel[191].setRotationPoint(4F, -20.75F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85 stack 4
		bodyModel[192].setRotationPoint(15F, -20.75F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 431
		bodyModel[193].setRotationPoint(-1.5F, 6.5F, -9.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 3, 7, 0F); // Box 432
		bodyModel[194].setRotationPoint(-1.5F, 3.5F, 2.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 433
		bodyModel[195].setRotationPoint(-1.5F, 4F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 434
		bodyModel[196].setRotationPoint(-1.5F, 5F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[197].setRotationPoint(-1.5F, 5F, 1F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 436
		bodyModel[198].setRotationPoint(-2F, 3F, -0.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 437 cull
		bodyModel[199].setRotationPoint(16.5F, -15F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 5, 17, 1, 0F); // Box 438 cull
		bodyModel[200].setRotationPoint(16.5F, -15F, 10F);

		bodyModel[201].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 0
		bodyModel[201].setRotationPoint(-28.5F, 0F, -10F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[202].setRotationPoint(20F, 3F, -2F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[203].setRotationPoint(-19F, 3F, -2F);

		bodyModel[204].addBox(0F, 0F, 0F, 66, 2, 14, 0F); // Box 441
		bodyModel[204].setRotationPoint(-32.5F, 1F, -7F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 4, 19, 0F); // Box 444
		bodyModel[205].setRotationPoint(-4.5F, 3F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[206].setRotationPoint(-5.5F, 4F, -9.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 446
		bodyModel[207].setRotationPoint(-2.5F, 4F, -9.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 447
		bodyModel[208].setRotationPoint(-5.5F, 3F, -9F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 3, 18, 0F); // Box 213
		bodyModel[209].setRotationPoint(-5.5F, 4F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[210].setRotationPoint(-5.5F, 7F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[211].setRotationPoint(-6F, 2F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[212].setRotationPoint(-9F, 2F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[213].setRotationPoint(11F, 2F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 221
		bodyModel[214].setRotationPoint(3F, 2F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222
		bodyModel[215].setRotationPoint(-6F, 2F, 10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 223
		bodyModel[216].setRotationPoint(-9F, 2F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 224
		bodyModel[217].setRotationPoint(11F, 2F, 10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225
		bodyModel[218].setRotationPoint(3F, 2F, 10F);

		bodyModel[219].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 1
		bodyModel[219].setRotationPoint(-37.5F, 3F, -1.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[220].setRotationPoint(-33F, -12F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[221].setRotationPoint(-33F, -11F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[222].setRotationPoint(-33F, -11F, 0F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 0
		bodyModel[223].setRotationPoint(-24F, -11F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[224].setRotationPoint(-22F, -11F, 8.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[225].setRotationPoint(-22.5F, -9F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131
		bodyModel[226].setRotationPoint(-20F, -11F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[227].setRotationPoint(-21F, -11F, 1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131
		bodyModel[228].setRotationPoint(-22F, -11F, 2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[229].setRotationPoint(-23F, -12.3F, 4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[230].setRotationPoint(-21.5F, -13F, 1.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[231].setRotationPoint(-23.5F, -13.5F, 2.75F);

		bodyModel[232].addBox(0F, 0F, 0F, 13, 3, 20, 0F); // Box 293
		bodyModel[232].setRotationPoint(-23.5F, -3F, -10F);

		bodyModel[233].addBox(0F, 0F, 0F, 8, 1, 9, 0F); // Box 865
		bodyModel[233].setRotationPoint(-23.5F, -4F, 1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[234].setRotationPoint(-24F, -12F, -10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[235].setRotationPoint(-24F, -12F, 7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[236].setRotationPoint(-24F, -13F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[237].setRotationPoint(-24F, -13F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[238].setRotationPoint(-26F, -13F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[239].setRotationPoint(-23F, -10F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[240].setRotationPoint(-23F, -13F, -7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[241].setRotationPoint(-23F, -12F, -10F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 11, 8, 0F); // Box 359
		bodyModel[242].setRotationPoint(-24F, -11F, 2F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360
		bodyModel[243].setRotationPoint(-23F, -9.3F, 6F);

		bodyModel[244].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 361
		bodyModel[244].setRotationPoint(-23.5F, -4F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 362
		bodyModel[245].setRotationPoint(-21F, -9F, -5F);

		bodyModel[246].addBox(-1F, 0F, -1F, 2, 3, 2, 0F); // Box 407
		bodyModel[246].setRotationPoint(-20F, -12F, -4F);
		bodyModel[246].rotateAngleY = -0.78539816F;

		bodyModel[247].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 409
		bodyModel[247].setRotationPoint(-26F, -13F, 2F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 410
		bodyModel[248].setRotationPoint(-26F, -13F, -3F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 411
		bodyModel[249].setRotationPoint(-27F, -13F, -3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(-11.5F, -18F, -10F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[251].setRotationPoint(-11.5F, -18F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[252].setRotationPoint(-11.5F, -18F, 6F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[253].setRotationPoint(0.5F, -3F, -6F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[254].setRotationPoint(0.5F, -5F, -6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[255].setRotationPoint(0.5F, -9F, -6F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[256].setRotationPoint(0.5F, -12F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[257].setRotationPoint(0.5F, -14F, -6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[258].setRotationPoint(0.5F, -14F, 2F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[259].setRotationPoint(-0.5F, -16F, -2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[260].setRotationPoint(-0.5F, -16F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[261].setRotationPoint(-0.5F, -16F, 2F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[262].setRotationPoint(-0.5F, -12F, -3F);

		bodyModel[263].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[263].setRotationPoint(20.5F, -4F, -5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[264].setRotationPoint(0.5F, -6F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[265].setRotationPoint(1.5F, -16F, -1.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[266].setRotationPoint(20.5F, -12F, -4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[267].setRotationPoint(11.5F, -16F, -1.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[268].setRotationPoint(11.5F, -15F, -1.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[269].setRotationPoint(20.5F, -8F, -2F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[270].setRotationPoint(4F, -18F, -1F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[271].setRotationPoint(15F, -18F, -1F);

		bodyModel[272].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[272].setRotationPoint(-5.5F, -15F, 3F);

		bodyModel[273].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[273].setRotationPoint(-5.5F, -15F, -6F);

		bodyModel[274].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 7
		bodyModel[274].setRotationPoint(0.5F, -14F, -2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[275].setRotationPoint(-4.5F, -5.5F, -4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[276].setRotationPoint(-4.5F, -8F, 1.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[277].setRotationPoint(-4.5F, -8F, -1.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[278].setRotationPoint(-4.5F, -8F, -3.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[279].setRotationPoint(-4.5F, -3F, 1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[280].setRotationPoint(-7.5F, -5F, -1.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 523
		bodyModel[281].setRotationPoint(-4.5F, -11F, -1.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[282].setRotationPoint(-2.5F, -9.5F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[283].setRotationPoint(-2.5F, -10.5F, -1F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[284].setRotationPoint(-22.9F, -11F, 5F);

		bodyModel[285].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[285].setRotationPoint(-23F, -10F, 3F);
		bodyModel[285].rotateAngleY = -0.38397244F;

		bodyModel[286].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[286].setRotationPoint(-21.4F, -12F, 3F);
		bodyModel[286].rotateAngleY = -0.38397244F;

		bodyModel[287].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[287].setRotationPoint(24.5F, -20F, 0F);

		bodyModel[288].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Single Steam Genorator
		bodyModel[288].setRotationPoint(29F, -20F, -2F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[289].setRotationPoint(24.5F, -19.7F, -4F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[290].setRotationPoint(29F, -19.7F, -4F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[291].setRotationPoint(24.5F, -19.7F, 2F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Duel Steam Genorator
		bodyModel[292].setRotationPoint(29F, -19.7F, 2F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // exhaust 1
		bodyModel[293].setRotationPoint(-13.5F, -21F, -3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // exhaust 1
		bodyModel[294].setRotationPoint(-13.5F, -20.15F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[295].setRotationPoint(-13.5F, -22.15F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[296].setRotationPoint(-16.5F, -18.24F, -5.5F);
		bodyModel[296].rotateAngleZ = 0.74176493F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 549
		bodyModel[297].setRotationPoint(-13.5F, -21F, 2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 550
		bodyModel[298].setRotationPoint(-13.5F, -20.15F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 551
		bodyModel[299].setRotationPoint(-13.5F, -22.15F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // exhaust 1
		bodyModel[300].setRotationPoint(21F, -22F, -0.5F);
		bodyModel[300].rotateAngleZ = 0.61086524F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 549
		bodyModel[301].setRotationPoint(21F, -21F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[302].setRotationPoint(21F, -22.5F, -3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[303].setRotationPoint(-16.5F, -18.24F, 4.5F);
		bodyModel[303].rotateAngleZ = 0.74176493F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 562
		bodyModel[304].setRotationPoint(21F, -22.5F, 0F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // exhaust 1
		bodyModel[305].setRotationPoint(21F, -21F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[306].setRotationPoint(1.5F, -15F, -1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[307].setRotationPoint(3.5F, -21.75F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[308].setRotationPoint(14.5F, -21.75F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 310
		bodyModel[309].setRotationPoint(-5.5F, 3F, -7F);

		bodyModel[310].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull
		bodyModel[310].setRotationPoint(16.35F, -21F, -3F);

		bodyModel[311].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 312 winterization hatch extendous cull
		bodyModel[311].setRotationPoint(16.35F, -23F, -3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[312].setRotationPoint(-20.5F, -20F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[313].setRotationPoint(-20.5F, -20.5F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[314].setRotationPoint(-20.5F, -20.5F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[315].setRotationPoint(-20.5F, -20.5F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[316].setRotationPoint(-20.5F, -20.5F, -1F);

		bodyModel[317].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[317].setRotationPoint(-32.75F, -12F, 0F);
		bodyModel[317].rotateAngleX = 1.57079633F;

		bodyModel[318].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[318].setRotationPoint(-32.75F, -12F, 0F);
		bodyModel[318].rotateAngleX = 1.57079633F;

		bodyModel[319].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[319].setRotationPoint(-34.1F, -6F, 0F);
		bodyModel[319].rotateAngleX = 1.57079633F;

		bodyModel[320].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[320].setRotationPoint(-34.1F, -6F, 0F);
		bodyModel[320].rotateAngleX = 1.57079633F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[321].setRotationPoint(-32.75F, -13.25F, -1.25F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 ditchlight front a
		bodyModel[322].setRotationPoint(-37.25F, -1.25F, -5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 444
		bodyModel[323].setRotationPoint(-36.5F, -1.25F, -5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front a
		bodyModel[324].setRotationPoint(-37.25F, -1.25F, 3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 446
		bodyModel[325].setRotationPoint(-36.5F, -1.25F, 3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -3F, 0F, -1F); // Box 474 pilot c
		bodyModel[326].setRotationPoint(-34F, 3F, 2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476 pilot c
		bodyModel[327].setRotationPoint(-35F, 5F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477 pilot c
		bodyModel[328].setRotationPoint(-34F, 3F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 0F, 3F, 0F, 0F); // Box 478 pilot c
		bodyModel[329].setRotationPoint(-30F, 3F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 479 pilot c
		bodyModel[330].setRotationPoint(-35F, 5F, 2F);

		bodyModel[331].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-3.36F, 0F, 0.5F, 3.36F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -2.36F, 0F, 0F, 2.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480 pilot c
		bodyModel[331].setRotationPoint(-35F, 5F, -9F);

		bodyModel[332].addShapeBox(-1F, 2F, 2F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3.36F, 0F, 0.5F, -3.36F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2.36F, 0F, 0F, -2.36F, 0F, 0F); // Box 481 pilot c
		bodyModel[332].setRotationPoint(-35F, 5F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 482 pilot c
		bodyModel[333].setRotationPoint(-30F, 3F, 2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1 pilot a
		bodyModel[334].setRotationPoint(-35.5F, 3F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1297 pilot a
		bodyModel[335].setRotationPoint(-35.5F, 3F, 2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1299 pilot a
		bodyModel[336].setRotationPoint(-35.5F, 3F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 1F, -4F, 0F, 1F, 0.65F, 0F, 0.85F, -0.7F, 0F, 0.85F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 1300 pilot a
		bodyModel[337].setRotationPoint(-33.5F, 3F, 7F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-4F, 0F, 1F, 4F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.7F, 0F, 0.85F, 0.65F, 0F, 0.85F); // Box 1301 pilot a
		bodyModel[338].setRotationPoint(-33.5F, 3F, -9F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 215
		bodyModel[339].setRotationPoint(-20F, -20.5F, 4F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 216
		bodyModel[340].setRotationPoint(-19F, -20F, 5F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 217
		bodyModel[341].setRotationPoint(-21F, -19.5F, 6F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		bodyModel[342].setRotationPoint(-18F, -19F, 5F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[343].setRotationPoint(-12F, -20.5F, 2F);

		bodyModel[344].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[344].setRotationPoint(-15F, -20.5F, -2F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[345].setRotationPoint(-15F, -20.5F, 2F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Can be used as antenna
		bodyModel[346].setRotationPoint(-12F, -20.5F, -2F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[347].setRotationPoint(-15F, -20.5F, -2F);

		bodyModel[348].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 415
		bodyModel[348].setRotationPoint(-21F, -20F, -2F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 486
		bodyModel[349].setRotationPoint(-21F, -21F, 0F);

		bodyModel[350].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299
		bodyModel[350].setRotationPoint(-18F, -20.5F, -5F);

		bodyModel[351].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[351].setRotationPoint(-18F, -19.5F, -5F);

		bodyModel[352].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[352].setRotationPoint(-18F, -20.5F, 4F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[353].setRotationPoint(-15F, -19.5F, 4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 145
		bodyModel[354].setRotationPoint(-36F, 0F, -4F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		bodyModel[355].setRotationPoint(-36F, 0F, 4F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[356].setRotationPoint(-36F, -1F, -4F);

		bodyModel[357].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
		bodyModel[357].setRotationPoint(-36F, -1F, 4F);

		bodyModel[358].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 435
		bodyModel[358].setRotationPoint(-34.5F, -7F, -4F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 436
		bodyModel[359].setRotationPoint(-34.5F, -6F, -4F);

		bodyModel[360].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 437
		bodyModel[360].setRotationPoint(-34.5F, -7F, 4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 438
		bodyModel[361].setRotationPoint(-34.5F, -6F, 4F);

		bodyModel[362].addBox(0F, 0F, 0F, 52, 3, 0, 0F); // Box 398 trainphone
		bodyModel[362].setRotationPoint(-18F, -21F, -6F);

		bodyModel[363].addBox(0F, 0F, 0F, 52, 3, 0, 0F); // Box 399 trainphone
		bodyModel[363].setRotationPoint(-18F, -21F, 6F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 194
		bodyModel[364].setRotationPoint(-16F, -21F, -2.5F);

		bodyModel[365].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[365].setRotationPoint(-10.5F, -20F, -3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1F, 0F, 2.5F, -1F); // Box 0
		bodyModel[366].setRotationPoint(3.5F, -24F, 4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[367].setRotationPoint(3.5F, -21F, 10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[368].setRotationPoint(3.5F, -24F, 3F);

		bodyModel[369].addBox(0F, 0F, 0F, 0, 8, 19, 0F); // Box 0
		bodyModel[369].setRotationPoint(22.5F, -24F, -9.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[370].setRotationPoint(22.5F, -24F, -5.5F);
		bodyModel[370].rotateAngleZ = 0.62831853F;

		bodyModel[371].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[371].setRotationPoint(22.5F, -24F, 4.5F);
		bodyModel[371].rotateAngleZ = 0.62831853F;

		bodyModel[372].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1F, 0F, 2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[372].setRotationPoint(3.5F, -24F, -10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[373].setRotationPoint(3.5F, -21F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[374].setRotationPoint(3.5F, -24F, -4F);

		bodyModel[375].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[375].setRotationPoint(3.5F, -22F, -7.5F);
		bodyModel[375].rotateAngleZ = 0.62831853F;

		bodyModel[376].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 0
		bodyModel[376].setRotationPoint(3.5F, -22F, 6.5F);
		bodyModel[376].rotateAngleZ = 0.62831853F;

		bodyModel[377].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M3 Hork
		bodyModel[377].setRotationPoint(-13.5F, -20.5F, -0.5F);

		bodyModel[378].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M3 Hork
		bodyModel[378].setRotationPoint(-14.5F, -20.5F, -1.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // M3 Hork
		bodyModel[379].setRotationPoint(-13.5F, -19.5F, -0.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // M3 Hork
		bodyModel[380].setRotationPoint(-14.5F, -20.5F, 0.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 Searchlight left
		bodyModel[381].setRotationPoint(-3.35F, -21.9F, 0F);
		bodyModel[381].rotateAngleZ = -0.52359878F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 Searchlight right
		bodyModel[382].setRotationPoint(-3.35F, -21.9F, -2F);
		bodyModel[382].rotateAngleZ = -0.52359878F;

		bodyModel[383].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387 searchlight sockets
		bodyModel[383].setRotationPoint(-3.25F, -21.85F, -2F);
		bodyModel[383].rotateAngleZ = -0.52359878F;

		bodyModel[384].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 387
		bodyModel[384].setRotationPoint(-3.25F, -20.75F, -1F);

		bodyModel[385].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // M5 Hork
		bodyModel[385].setRotationPoint(-16F, -20.5F, -0.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[386].setRotationPoint(-15F, -20.25F, 0.5F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[387].setRotationPoint(-15.5F, -20.25F, -1.5F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[388].setRotationPoint(-14.5F, -21.5F, -1F);

		bodyModel[389].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[389].setRotationPoint(-14.5F, -21.5F, 0.25F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[390].setRotationPoint(-10.5F, -20.25F, -5.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[391].setRotationPoint(-10.5F, -21.25F, -5.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[392].setRotationPoint(-10.25F, -19.75F, -5.25F);

		bodyModel[393].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 470
		bodyModel[393].setRotationPoint(-10.5F, -21.25F, -6F);
		bodyModel[393].rotateAngleX = -0.13089969F;

		bodyModel[394].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 471
		bodyModel[394].setRotationPoint(-10.5F, -21.25F, -4F);
		bodyModel[394].rotateAngleX = 0.13089969F;

		bodyModel[395].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // Box 472
		bodyModel[395].setRotationPoint(-10.5F, -21.25F, -6F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 winterization hatch CN cull
		bodyModel[396].setRotationPoint(9.5F, -21F, -7F);

		bodyModel[397].addBox(0F, 0F, 0F, 13, 2, 6, 0F); // Box 0 winterization hatch CN cull
		bodyModel[397].setRotationPoint(9.5F, -21F, -3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0 winterization hatch CN cull
		bodyModel[398].setRotationPoint(9.5F, -21F, 3F);

		bodyModel[399].addBox(0F, 0F, 0F, 11, 2, 7, 0F); // Box 186 winterization hatch cull
		bodyModel[399].setRotationPoint(10.25F, -21F, -3.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82 stack 1
		bodyModel[400].setRotationPoint(8F, -20.75F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85 stack 4
		bodyModel[401].setRotationPoint(11F, -20.75F, -1F);

		bodyModel[402].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[402].setRotationPoint(-0.5F, -20F, -3F);

		bodyModel[403].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[403].setRotationPoint(14.5F, -20F, -3F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // M5 Hork
		bodyModel[404].setRotationPoint(-18F, -20F, 1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left
		bodyModel[405].setRotationPoint(34F, -11.5F, -9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 418 headlight rear right
		bodyModel[406].setRotationPoint(34F, -6F, 6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 ditchlight front a
		bodyModel[407].setRotationPoint(-35.75F, -0.25F, -6.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[408].setRotationPoint(-35F, -0.25F, -6.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front a
		bodyModel[409].setRotationPoint(-35.75F, -0.25F, 4.5F);

		bodyModel[410].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Ditchlight box
		bodyModel[410].setRotationPoint(-35F, -0.25F, 4.5F);

		bodyModel[411].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[411].setRotationPoint(-30F, -8.5F, -10F);
		bodyModel[411].rotateAngleY = 0.6981317F;

		bodyModel[412].addBox(0F, 0F, -5F, 2, 2, 5, 0F); // Box 144
		bodyModel[412].setRotationPoint(-30F, -8.5F, 10F);
		bodyModel[412].rotateAngleY = -0.6981317F;

		bodyModel[413].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 184 numberboard glow
		bodyModel[413].setRotationPoint(-30.01F, -8.5F, -10F);
		bodyModel[413].rotateAngleY = 0.6981317F;

		bodyModel[414].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 185 numberboard glow
		bodyModel[414].setRotationPoint(-30.01F, -8.5F, 10F);
		bodyModel[414].rotateAngleY = -0.6981317F;

		bodyModel[415].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M3 Hork
		bodyModel[415].setRotationPoint(-1.5F, -22F, -0.5F);

		bodyModel[416].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M3 Hork
		bodyModel[416].setRotationPoint(-2.5F, -22F, -1.5F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // M3 Hork
		bodyModel[417].setRotationPoint(-1.5F, -21F, -0.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // M3 Hork
		bodyModel[418].setRotationPoint(-2.5F, -22F, 0.5F);

		bodyModel[419].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[419].setRotationPoint(-17F, -20.5F, 3.5F);

		bodyModel[420].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 195
		bodyModel[420].setRotationPoint(-16F, -20.5F, 4.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 commander beacon
		bodyModel[421].setRotationPoint(-20F, -20F, -0.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, -0.9F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 349
		bodyModel[422].setRotationPoint(-20F, -20F, -0.5F);

		bodyModel[423].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // ARR Horn
		bodyModel[423].setRotationPoint(-3F, -22.25F, -0.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // ARR Horn
		bodyModel[424].setRotationPoint(-2F, -22F, 0.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // ARR Horn
		bodyModel[425].setRotationPoint(-2.5F, -22F, -1.5F);

		bodyModel[426].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // ARR Horn
		bodyModel[426].setRotationPoint(-2F, -23.25F, -1F);

		bodyModel[427].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // ARR Horn
		bodyModel[427].setRotationPoint(-2F, -23.25F, 0.25F);

		bodyModel[428].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 194
		bodyModel[428].setRotationPoint(-13F, -21F, 2.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[429].setRotationPoint(-16F, -21F, 3F);

		bodyModel[430].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 406
		bodyModel[430].setRotationPoint(-17F, -20.5F, 4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 0 cull
		bodyModel[431].setRotationPoint(-8.5F, -21F, -3F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 82 stack 1
		bodyModel[432].setRotationPoint(3.5F, -21.5F, -1.51F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 82 stack 1
		bodyModel[433].setRotationPoint(3.5F, -21.5F, 1.51F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 82 stack 1
		bodyModel[434].setRotationPoint(14.5F, -21.5F, -1.51F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 82 stack 1
		bodyModel[435].setRotationPoint(14.5F, -21.5F, 1.51F);

		bodyModel[436].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[436].setRotationPoint(14.5F, -21.5F, -1F);

		bodyModel[437].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[437].setRotationPoint(3.5F, -21.5F, -1F);

		bodyModel[438].addBox(-7F, 0F, -3F, 6, 3, 3, 0F); // Box 171
		bodyModel[438].setRotationPoint(10F, -23.5F, -1.5F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 172
		bodyModel[439].setRotationPoint(11F, -21F, -1.5F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 173
		bodyModel[440].setRotationPoint(11F, -21F, 1.5F);

		bodyModel[441].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[441].setRotationPoint(11F, -24.5F, -1.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 580
		bodyModel[442].setRotationPoint(3F, -23.5F, -1.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 581
		bodyModel[443].setRotationPoint(8F, -21F, -1.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 582
		bodyModel[444].setRotationPoint(8F, -21F, 1.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 583
		bodyModel[445].setRotationPoint(7F, -24.5F, -1.5F);

		bodyModel[446].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // M5 Hork
		bodyModel[446].setRotationPoint(-18F, -20.5F, 4F);

		bodyModel[447].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[447].setRotationPoint(-17F, -20.25F, 5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[448].setRotationPoint(-17.5F, -20.25F, 3F);

		bodyModel[449].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[449].setRotationPoint(-16.5F, -21.5F, 3.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[450].setRotationPoint(-16.5F, -21.5F, 4.75F);

		bodyModel[451].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[451].setRotationPoint(34.51F, 2F, -10F);

		bodyModel[452].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[452].setRotationPoint(34.51F, 2F, 5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[453].setRotationPoint(-33.5F, -8F, 0F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[454].setRotationPoint(-33.5F, -8F, -2F);

		bodyModel[455].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[455].setRotationPoint(-21F, -14.25F, 4F);
		bodyModel[455].rotateAngleY = 0.78539816F;

		bodyModel[456].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[456].setRotationPoint(-21F, -14.25F, 4F);
		bodyModel[456].rotateAngleY = 0.78539816F;

		bodyModel[457].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
		bodyModel[457].setRotationPoint(-33.75F, -8F, -3F);
		bodyModel[457].rotateAngleZ = -0.15707963F;

		bodyModel[458].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 150
		bodyModel[458].setRotationPoint(-33.75F, -8F, 3F);
		bodyModel[458].rotateAngleZ = -0.15707963F;

		bodyModel[459].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Duel Steam Genorator
		bodyModel[459].setRotationPoint(23.5F, -19.7F, -4F);

		bodyModel[460].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Duel Steam Genorator
		bodyModel[460].setRotationPoint(25.5F, -21.2F, -1F);

		bodyModel[461].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 352 markerlight
		bodyModel[461].setRotationPoint(-30.9F, -9.5F, -7.7F);
		bodyModel[461].rotateAngleY = 0.6981317F;

		bodyModel[462].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 353 markerlight
		bodyModel[462].setRotationPoint(-30.9F, -9.5F, 7.7F);
		bodyModel[462].rotateAngleY = -0.6981317F;

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear left bottom gyra
		bodyModel[463].setRotationPoint(34F, -10F, -9F);

		bodyModel[464].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[464].setRotationPoint(-11F, -11F, -11.75F);

		bodyModel[465].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[465].setRotationPoint(-16F, -11F, -11.75F);

		bodyModel[466].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 177
		bodyModel[466].setRotationPoint(26F, -9F, -11.75F);

		bodyModel[467].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 178
		bodyModel[467].setRotationPoint(21F, -9F, -11.75F);

		bodyModel[468].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[468].setRotationPoint(34F, -4F, -11.75F);

		bodyModel[469].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[469].setRotationPoint(31F, -4F, -11.75F);

		bodyModel[470].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 154
		bodyModel[470].setRotationPoint(-16F, -11F, 10.75F);

		bodyModel[471].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 155
		bodyModel[471].setRotationPoint(-11F, -11F, 10.75F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[472].setRotationPoint(23F, -10F, -5F);

		bodyModel[473].addShapeBox(0F, 0F, 5F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[473].setRotationPoint(28F, -6F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[474].setRotationPoint(24.5F, -18F, -4F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[475].setRotationPoint(29F, -18F, -4F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[476].setRotationPoint(23F, -10F, 1F);

		bodyModel[477].addShapeBox(0F, 0F, 5F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[477].setRotationPoint(28F, -6F, -4F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[478].setRotationPoint(24.5F, -18F, 2F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[479].setRotationPoint(29F, -18F, 2F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 5, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[480].setRotationPoint(23F, -10F, -1F);

		bodyModel[481].addShapeBox(0F, 0F, 5F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[481].setRotationPoint(28F, -6F, -8F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[482].setRotationPoint(24.5F, -18F, 0F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0 steam gen
		bodyModel[483].setRotationPoint(29F, -18F, -2F);
	}
	ModelBlombergBnew theTrucc = new ModelBlombergBnew();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 21321321) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.06, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 123214) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.06, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.44, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.06, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.44, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}