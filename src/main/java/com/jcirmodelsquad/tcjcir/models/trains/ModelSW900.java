//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SW900-SW8
// Model Creator: Bidahochi
// Created on: 26.04.2022 - 17:25:48
// Last changed on: 26.04.2022 - 17:25:48

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBluntTruck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeAnew;
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

public class ModelSW900 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW900() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[438];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 89
		bodyModel[1] = new ModelRendererTurbo(this, 216, 210, textureX, textureY); // Box 202
		bodyModel[2] = new ModelRendererTurbo(this, 175, 214, textureX, textureY); // Box 203
		bodyModel[3] = new ModelRendererTurbo(this, 18, 192, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 28, 173, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 166
		bodyModel[8] = new ModelRendererTurbo(this, 59, 76, textureX, textureY); // Box 167
		bodyModel[9] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 170
		bodyModel[10] = new ModelRendererTurbo(this, 49, 156, textureX, textureY); // Box 489
		bodyModel[11] = new ModelRendererTurbo(this, 16, 97, textureX, textureY); // Box 546
		bodyModel[12] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 389
		bodyModel[13] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 390
		bodyModel[14] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 391
		bodyModel[15] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 392
		bodyModel[16] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 393
		bodyModel[17] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 394
		bodyModel[18] = new ModelRendererTurbo(this, 36, 156, textureX, textureY); // Box 135
		bodyModel[19] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 146
		bodyModel[21] = new ModelRendererTurbo(this, 63, 173, textureX, textureY); // Box 184
		bodyModel[22] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 388
		bodyModel[23] = new ModelRendererTurbo(this, 49, 148, textureX, textureY); // Box 490
		bodyModel[24] = new ModelRendererTurbo(this, 36, 148, textureX, textureY); // Box 491
		bodyModel[25] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 108
		bodyModel[26] = new ModelRendererTurbo(this, 40, 190, textureX, textureY); // Box 196
		bodyModel[27] = new ModelRendererTurbo(this, 40, 188, textureX, textureY); // Box 199
		bodyModel[28] = new ModelRendererTurbo(this, 290, 164, textureX, textureY); // Box 5 hood
		bodyModel[29] = new ModelRendererTurbo(this, 298, 153, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 298, 142, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 381, 166, textureX, textureY); // Box 107
		bodyModel[32] = new ModelRendererTurbo(this, 262, 178, textureX, textureY, "cull"); // Box 138 cull fan cover
		bodyModel[33] = new ModelRendererTurbo(this, 389, 155, textureX, textureY); // Box 396
		bodyModel[34] = new ModelRendererTurbo(this, 389, 144, textureX, textureY); // Box 397
		bodyModel[35] = new ModelRendererTurbo(this, 457, 84, textureX, textureY); // Box 9
		bodyModel[36] = new ModelRendererTurbo(this, 429, 109, textureX, textureY); // Box 18
		bodyModel[37] = new ModelRendererTurbo(this, 489, 84, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 478, 89, textureX, textureY); // Box 61 door swign right
		bodyModel[39] = new ModelRendererTurbo(this, 305, 135, textureX, textureY); // Box 390
		bodyModel[40] = new ModelRendererTurbo(this, 305, 135, textureX, textureY); // Box 391
		bodyModel[41] = new ModelRendererTurbo(this, 365, 135, textureX, textureY); // Box 392
		bodyModel[42] = new ModelRendererTurbo(this, 365, 135, textureX, textureY); // Box 393
		bodyModel[43] = new ModelRendererTurbo(this, 412, 70, textureX, textureY); // Box 125
		bodyModel[44] = new ModelRendererTurbo(this, 361, 92, textureX, textureY); // Box 9
		bodyModel[45] = new ModelRendererTurbo(this, 434, 92, textureX, textureY); // Box 10
		bodyModel[46] = new ModelRendererTurbo(this, 384, 75, textureX, textureY); // Box 15
		bodyModel[47] = new ModelRendererTurbo(this, 423, 89, textureX, textureY); // Box 315 door swing right
		bodyModel[48] = new ModelRendererTurbo(this, 454, 52, textureX, textureY); // Box 371
		bodyModel[49] = new ModelRendererTurbo(this, 454, 70, textureX, textureY); // Box 372
		bodyModel[50] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 373
		bodyModel[51] = new ModelRendererTurbo(this, 473, 61, textureX, textureY); // Box 39
		bodyModel[52] = new ModelRendererTurbo(this, 472, 55, textureX, textureY); // Box 347
		bodyModel[53] = new ModelRendererTurbo(this, 473, 48, textureX, textureY); // Box 348
		bodyModel[54] = new ModelRendererTurbo(this, 423, 60, textureX, textureY); // Box 411
		bodyModel[55] = new ModelRendererTurbo(this, 423, 42, textureX, textureY); // Box 412
		bodyModel[56] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 129
		bodyModel[58] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 130
		bodyModel[59] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 133
		bodyModel[60] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 134
		bodyModel[61] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 337
		bodyModel[62] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 338
		bodyModel[63] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 339
		bodyModel[64] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 340
		bodyModel[65] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 341
		bodyModel[66] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 342
		bodyModel[67] = new ModelRendererTurbo(this, 449, 170, textureX, textureY); // Box 188
		bodyModel[68] = new ModelRendererTurbo(this, 442, 170, textureX, textureY); // Box 190
		bodyModel[69] = new ModelRendererTurbo(this, 449, 168, textureX, textureY); // Box 358
		bodyModel[70] = new ModelRendererTurbo(this, 442, 168, textureX, textureY); // Box 359
		bodyModel[71] = new ModelRendererTurbo(this, 254, 157, textureX, textureY); // Box 147
		bodyModel[72] = new ModelRendererTurbo(this, 256, 153, textureX, textureY); // Box 148
		bodyModel[73] = new ModelRendererTurbo(this, 275, 153, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[74] = new ModelRendererTurbo(this, 275, 153, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[75] = new ModelRendererTurbo(this, 256, 153, textureX, textureY); // Box 173
		bodyModel[76] = new ModelRendererTurbo(this, 246, 154, textureX, textureY, "lamp"); // Box 167 numberboard front single
		bodyModel[77] = new ModelRendererTurbo(this, 246, 154, textureX, textureY, "lamp"); // Box 168 numberboard front single
		bodyModel[78] = new ModelRendererTurbo(this, 245, 157, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[79] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 371
		bodyModel[80] = new ModelRendererTurbo(this, 230, 8, textureX, textureY); // Box 372
		bodyModel[81] = new ModelRendererTurbo(this, 230, 25, textureX, textureY); // Box 373
		bodyModel[82] = new ModelRendererTurbo(this, 230, 23, textureX, textureY); // Box 374
		bodyModel[83] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 375
		bodyModel[84] = new ModelRendererTurbo(this, 238, 8, textureX, textureY); // Box 376
		bodyModel[85] = new ModelRendererTurbo(this, 238, 23, textureX, textureY); // Box 377
		bodyModel[86] = new ModelRendererTurbo(this, 453, 62, textureX, textureY); // Box 378
		bodyModel[87] = new ModelRendererTurbo(this, 411, 44, textureX, textureY); // Box 379
		bodyModel[88] = new ModelRendererTurbo(this, 453, 44, textureX, textureY); // Box 380
		bodyModel[89] = new ModelRendererTurbo(this, 411, 62, textureX, textureY); // Box 381
		bodyModel[90] = new ModelRendererTurbo(this, 283, 157, textureX, textureY); // Box 382
		bodyModel[91] = new ModelRendererTurbo(this, 274, 158, textureX, textureY); // Box 383
		bodyModel[92] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 384
		bodyModel[93] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 387
		bodyModel[94] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 388
		bodyModel[95] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 389
		bodyModel[96] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 390
		bodyModel[97] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 391
		bodyModel[98] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 392
		bodyModel[99] = new ModelRendererTurbo(this, 328, 120, textureX, textureY); // Box 383
		bodyModel[100] = new ModelRendererTurbo(this, 424, 63, textureX, textureY); // Box 395
		bodyModel[101] = new ModelRendererTurbo(this, 424, 45, textureX, textureY); // Box 396
		bodyModel[102] = new ModelRendererTurbo(this, 491, 4, textureX, textureY); // Box 147
		bodyModel[103] = new ModelRendererTurbo(this, 475, 6, textureX, textureY); // Box 148
		bodyModel[104] = new ModelRendererTurbo(this, 475, 6, textureX, textureY); // Box 173
		bodyModel[105] = new ModelRendererTurbo(this, 482, 4, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[106] = new ModelRendererTurbo(this, 482, 25, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[107] = new ModelRendererTurbo(this, 482, 25, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[108] = new ModelRendererTurbo(this, 490, 29, textureX, textureY); // Box 382
		bodyModel[109] = new ModelRendererTurbo(this, 481, 30, textureX, textureY); // Box 383
		bodyModel[110] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 384
		bodyModel[111] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 387
		bodyModel[112] = new ModelRendererTurbo(this, 464, 49, textureX, textureY); // Box 1070
		bodyModel[113] = new ModelRendererTurbo(this, 465, 43, textureX, textureY); // Box 1071
		bodyModel[114] = new ModelRendererTurbo(this, 465, 56, textureX, textureY); // Box 1072
		bodyModel[115] = new ModelRendererTurbo(this, 464, 62, textureX, textureY); // Box 1073
		bodyModel[116] = new ModelRendererTurbo(this, 465, 69, textureX, textureY); // Box 1074
		bodyModel[117] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 1081 air tank support
		bodyModel[118] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Box 398
		bodyModel[119] = new ModelRendererTurbo(this, 62, 162, textureX, textureY); // Box 399
		bodyModel[120] = new ModelRendererTurbo(this, 62, 154, textureX, textureY); // Box 400
		bodyModel[121] = new ModelRendererTurbo(this, 27, 154, textureX, textureY); // Box 401
		bodyModel[122] = new ModelRendererTurbo(this, 19, 78, textureX, textureY); // Box 1086
		bodyModel[123] = new ModelRendererTurbo(this, 382, 125, textureX, textureY); // Box 1089 dynamic bullshit
		bodyModel[124] = new ModelRendererTurbo(this, 460, 178, textureX, textureY); // Box 67
		bodyModel[125] = new ModelRendererTurbo(this, 463, 178, textureX, textureY); // Box 68
		bodyModel[126] = new ModelRendererTurbo(this, 463, 168, textureX, textureY); // Box 231
		bodyModel[127] = new ModelRendererTurbo(this, 460, 168, textureX, textureY); // Box 232
		bodyModel[128] = new ModelRendererTurbo(this, 241, 10, textureX, textureY); // Box 1096
		bodyModel[129] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1097
		bodyModel[130] = new ModelRendererTurbo(this, 241, 8, textureX, textureY); // Box 261
		bodyModel[131] = new ModelRendererTurbo(this, 485, 118, textureX, textureY, "cull"); // Box 43 cull
		bodyModel[132] = new ModelRendererTurbo(this, 485, 124, textureX, textureY, "cull"); // Box 1100 cull
		bodyModel[133] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 184
		bodyModel[134] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 185
		bodyModel[135] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 186
		bodyModel[136] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 187 air tank support
		bodyModel[137] = new ModelRendererTurbo(this, 296, 114, textureX, textureY); // Box 114
		bodyModel[138] = new ModelRendererTurbo(this, 296, 111, textureX, textureY); // Box 74
		bodyModel[139] = new ModelRendererTurbo(this, 296, 117, textureX, textureY); // Box 78
		bodyModel[140] = new ModelRendererTurbo(this, 295, 107, textureX, textureY); // Box 245
		bodyModel[141] = new ModelRendererTurbo(this, 296, 102, textureX, textureY); // Box 418
		bodyModel[142] = new ModelRendererTurbo(this, 367, 171, textureX, textureY); // Box 651 yes this is a real bit
		bodyModel[143] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 623
		bodyModel[144] = new ModelRendererTurbo(this, 293, 121, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[145] = new ModelRendererTurbo(this, 293, 121, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[146] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 627
		bodyModel[147] = new ModelRendererTurbo(this, 271, 178, textureX, textureY); // Box 204
		bodyModel[148] = new ModelRendererTurbo(this, 272, 185, textureX, textureY); // Box 205
		bodyModel[149] = new ModelRendererTurbo(this, 272, 174, textureX, textureY); // Box 206
		bodyModel[150] = new ModelRendererTurbo(this, 270, 196, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[151] = new ModelRendererTurbo(this, 272, 189, textureX, textureY, "lamp"); // Box 208 sp trashcan light front
		bodyModel[152] = new ModelRendererTurbo(this, 244, 165, textureX, textureY); // Box 209
		bodyModel[153] = new ModelRendererTurbo(this, 246, 172, textureX, textureY, "lamp"); // Box 363 sp headlight front
		bodyModel[154] = new ModelRendererTurbo(this, 246, 172, textureX, textureY, "lamp"); // Box 364 sp headlight front
		bodyModel[155] = new ModelRendererTurbo(this, 235, 166, textureX, textureY); // Box 212
		bodyModel[156] = new ModelRendererTurbo(this, 255, 166, textureX, textureY); // Box 213
		bodyModel[157] = new ModelRendererTurbo(this, 288, 134, textureX, textureY); // Box 214
		bodyModel[158] = new ModelRendererTurbo(this, 290, 134, textureX, textureY); // Box 215
		bodyModel[159] = new ModelRendererTurbo(this, 385, 37, textureX, textureY); // Box 385
		bodyModel[160] = new ModelRendererTurbo(this, 385, 40, textureX, textureY); // Box 386
		bodyModel[161] = new ModelRendererTurbo(this, 400, 44, textureX, textureY, "cull"); // Box 512 cull
		bodyModel[162] = new ModelRendererTurbo(this, 267, 158, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[163] = new ModelRendererTurbo(this, 474, 30, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[164] = new ModelRendererTurbo(this, 391, 30, textureX, textureY); // Box 184
		bodyModel[165] = new ModelRendererTurbo(this, 396, 29, textureX, textureY); // Box 364 prime base
		bodyModel[166] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[167] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[168] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[169] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[170] = new ModelRendererTurbo(this, 384, 31, textureX, textureY); // Box 183
		bodyModel[171] = new ModelRendererTurbo(this, 396, 17, textureX, textureY); // Box 364 prime base
		bodyModel[172] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[173] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[174] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[175] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[176] = new ModelRendererTurbo(this, 396, 21, textureX, textureY, "cull"); // Box 478 cull
		bodyModel[177] = new ModelRendererTurbo(this, 419, 25, textureX, textureY); // Box 364
		bodyModel[178] = new ModelRendererTurbo(this, 408, 20, textureX, textureY); // Box 365
		bodyModel[179] = new ModelRendererTurbo(this, 408, 26, textureX, textureY); // Box 366
		bodyModel[180] = new ModelRendererTurbo(this, 313, 115, textureX, textureY); // Box 538
		bodyModel[181] = new ModelRendererTurbo(this, 313, 110, textureX, textureY); // Box 539
		bodyModel[182] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 540
		bodyModel[183] = new ModelRendererTurbo(this, 327, 113, textureX, textureY); // Box 240
		bodyModel[184] = new ModelRendererTurbo(this, 395, 40, textureX, textureY); // Box 241
		bodyModel[185] = new ModelRendererTurbo(this, 345, 112, textureX, textureY); // Box 523
		bodyModel[186] = new ModelRendererTurbo(this, 345, 112, textureX, textureY); // Box 524
		bodyModel[187] = new ModelRendererTurbo(this, 337, 118, textureX, textureY); // Box 525
		bodyModel[188] = new ModelRendererTurbo(this, 45, 100, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[189] = new ModelRendererTurbo(this, 34, 100, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[190] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 590
		bodyModel[191] = new ModelRendererTurbo(this, 40, 72, textureX, textureY); // Box 591
		bodyModel[192] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 396
		bodyModel[193] = new ModelRendererTurbo(this, 326, 107, textureX, textureY, "cull"); // Box 260 cull
		bodyModel[194] = new ModelRendererTurbo(this, 390, 22, textureX, textureY); // Box 409 commander base
		bodyModel[195] = new ModelRendererTurbo(this, 390, 18, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[196] = new ModelRendererTurbo(this, 145, 100, textureX, textureY, "cull"); // Box 263 cull
		bodyModel[197] = new ModelRendererTurbo(this, 134, 100, textureX, textureY, "cull"); // Box 264 cull
		bodyModel[198] = new ModelRendererTurbo(this, 156, 100, textureX, textureY); // Box 268
		bodyModel[199] = new ModelRendererTurbo(this, 391, 27, textureX, textureY); // Box 269
		bodyModel[200] = new ModelRendererTurbo(this, 393, 46, textureX, textureY, "cull"); // Box 270 cull
		bodyModel[201] = new ModelRendererTurbo(this, 401, 40, textureX, textureY); // Box 271
		bodyModel[202] = new ModelRendererTurbo(this, 268, 133, textureX, textureY); // Box 393
		bodyModel[203] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 273
		bodyModel[204] = new ModelRendererTurbo(this, 32, 67, textureX, textureY); // Box 274
		bodyModel[205] = new ModelRendererTurbo(this, 132, 67, textureX, textureY); // Box 275
		bodyModel[206] = new ModelRendererTurbo(this, 140, 67, textureX, textureY); // Box 276
		bodyModel[207] = new ModelRendererTurbo(this, 42, 79, textureX, textureY); // Box 50
		bodyModel[208] = new ModelRendererTurbo(this, 142, 79, textureX, textureY); // Box 179
		bodyModel[209] = new ModelRendererTurbo(this, 362, 23, textureX, textureY); // Box 354
		bodyModel[210] = new ModelRendererTurbo(this, 371, 29, textureX, textureY); // Box 355
		bodyModel[211] = new ModelRendererTurbo(this, 360, 29, textureX, textureY); // Box 356
		bodyModel[212] = new ModelRendererTurbo(this, 362, 35, textureX, textureY); // Box 357
		bodyModel[213] = new ModelRendererTurbo(this, 364, 32, textureX, textureY); // Box 358
		bodyModel[214] = new ModelRendererTurbo(this, 364, 26, textureX, textureY); // Box 359
		bodyModel[215] = new ModelRendererTurbo(this, 344, 125, textureX, textureY); // Box 285
		bodyModel[216] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 287 compressed pipework
		bodyModel[217] = new ModelRendererTurbo(this, 19, 100, textureX, textureY, "cull"); // Box 186 cull
		bodyModel[218] = new ModelRendererTurbo(this, 119, 100, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[219] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 78
		bodyModel[220] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 188
		bodyModel[221] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up
		bodyModel[222] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up
		bodyModel[223] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 78
		bodyModel[224] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 188
		bodyModel[225] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[226] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[227] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 239
		bodyModel[228] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r up
		bodyModel[229] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up
		bodyModel[230] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 242
		bodyModel[231] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 239
		bodyModel[232] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[233] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[234] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 242
		bodyModel[235] = new ModelRendererTurbo(this, 381, 57, textureX, textureY); // box64
		bodyModel[236] = new ModelRendererTurbo(this, 381, 53, textureX, textureY); // box65
		bodyModel[237] = new ModelRendererTurbo(this, 373, 44, textureX, textureY); // Box 293
		bodyModel[238] = new ModelRendererTurbo(this, 364, 47, textureX, textureY); // Box 294
		bodyModel[239] = new ModelRendererTurbo(this, 362, 44, textureX, textureY); // Box 295
		bodyModel[240] = new ModelRendererTurbo(this, 364, 41, textureX, textureY); // Box 296
		bodyModel[241] = new ModelRendererTurbo(this, 6, 117, textureX, textureY); // Box 282
		bodyModel[242] = new ModelRendererTurbo(this, 19, 121, textureX, textureY); // Box 283
		bodyModel[243] = new ModelRendererTurbo(this, 28, 109, textureX, textureY); // Box 4
		bodyModel[244] = new ModelRendererTurbo(this, 19, 109, textureX, textureY); // Box 448
		bodyModel[245] = new ModelRendererTurbo(this, 41, 111, textureX, textureY); // Box 322
		bodyModel[246] = new ModelRendererTurbo(this, 54, 111, textureX, textureY); // Box 323
		bodyModel[247] = new ModelRendererTurbo(this, 8, 107, textureX, textureY); // Box 280
		bodyModel[248] = new ModelRendererTurbo(this, 65, 109, textureX, textureY); // Box 285
		bodyModel[249] = new ModelRendererTurbo(this, 119, 121, textureX, textureY); // Box 305
		bodyModel[250] = new ModelRendererTurbo(this, 106, 117, textureX, textureY); // Box 306
		bodyModel[251] = new ModelRendererTurbo(this, 128, 109, textureX, textureY); // Box 307
		bodyModel[252] = new ModelRendererTurbo(this, 141, 111, textureX, textureY); // Box 308
		bodyModel[253] = new ModelRendererTurbo(this, 154, 111, textureX, textureY); // Box 309
		bodyModel[254] = new ModelRendererTurbo(this, 165, 109, textureX, textureY); // Box 310
		bodyModel[255] = new ModelRendererTurbo(this, 119, 109, textureX, textureY); // Box 311
		bodyModel[256] = new ModelRendererTurbo(this, 108, 107, textureX, textureY); // Box 312
		bodyModel[257] = new ModelRendererTurbo(this, 74, 109, textureX, textureY); // Box 24
		bodyModel[258] = new ModelRendererTurbo(this, 87, 111, textureX, textureY); // Box 25
		bodyModel[259] = new ModelRendererTurbo(this, 187, 111, textureX, textureY); // Box 315
		bodyModel[260] = new ModelRendererTurbo(this, 174, 109, textureX, textureY); // Box 316
		bodyModel[261] = new ModelRendererTurbo(this, 399, 57, textureX, textureY); // Box 350
		bodyModel[262] = new ModelRendererTurbo(this, 396, 57, textureX, textureY); // Box 351
		bodyModel[263] = new ModelRendererTurbo(this, 328, 117, textureX, textureY); // Box 319
		bodyModel[264] = new ModelRendererTurbo(this, 281, 165, textureX, textureY); // Box 362 ane shit
		bodyModel[265] = new ModelRendererTurbo(this, 274, 167, textureX, textureY, "lamp"); // Box 363 ane front light gyra
		bodyModel[266] = new ModelRendererTurbo(this, 267, 167, textureX, textureY, "lamp"); // Box 364 ane front light gyra
		bodyModel[267] = new ModelRendererTurbo(this, 466, 22, textureX, textureY); // Box 365 ane shit
		bodyModel[268] = new ModelRendererTurbo(this, 452, 24, textureX, textureY, "lamp"); // Box 366 ane rear light gyra
		bodyModel[269] = new ModelRendererTurbo(this, 459, 24, textureX, textureY, "lamp"); // Box 367 ane rear light gyra
		bodyModel[270] = new ModelRendererTurbo(this, 350, 35, textureX, textureY); // Box 81
		bodyModel[271] = new ModelRendererTurbo(this, 350, 23, textureX, textureY); // Box 82
		bodyModel[272] = new ModelRendererTurbo(this, 348, 32, textureX, textureY); // Box 83
		bodyModel[273] = new ModelRendererTurbo(this, 348, 26, textureX, textureY); // Box 84
		bodyModel[274] = new ModelRendererTurbo(this, 348, 29, textureX, textureY); // Box 85
		bodyModel[275] = new ModelRendererTurbo(this, 480, 13, textureX, textureY); // Box 209
		bodyModel[276] = new ModelRendererTurbo(this, 464, 15, textureX, textureY, "lamp"); // Box 363 sp headlight rear
		bodyModel[277] = new ModelRendererTurbo(this, 464, 15, textureX, textureY, "lamp"); // Box 364 sp headlight rear
		bodyModel[278] = new ModelRendererTurbo(this, 491, 14, textureX, textureY); // Box 212
		bodyModel[279] = new ModelRendererTurbo(this, 471, 14, textureX, textureY); // Box 213
		bodyModel[280] = new ModelRendererTurbo(this, 271, 178, textureX, textureY); // Box 204
		bodyModel[281] = new ModelRendererTurbo(this, 272, 185, textureX, textureY); // Box 205
		bodyModel[282] = new ModelRendererTurbo(this, 272, 174, textureX, textureY); // Box 206
		bodyModel[283] = new ModelRendererTurbo(this, 270, 196, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[284] = new ModelRendererTurbo(this, 272, 189, textureX, textureY, "lamp"); // Box 208 sp trashcan light rear
		bodyModel[285] = new ModelRendererTurbo(this, 292, 130, textureX, textureY, "cull"); // Box 354 cull
		bodyModel[286] = new ModelRendererTurbo(this, 292, 130, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[287] = new ModelRendererTurbo(this, 76, 91, textureX, textureY, BoxName.ditch); // Box 356 front ditchlight canook
		bodyModel[288] = new ModelRendererTurbo(this, 76, 91, textureX, textureY, BoxName.ditch); // Box 357 front ditchlight canook
		bodyModel[289] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 358
		bodyModel[290] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 359
		bodyModel[291] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 360
		bodyModel[292] = new ModelRendererTurbo(this, 176, 91, textureX, textureY, BoxName.ditch); // Box 361 rear ditchlight canook
		bodyModel[293] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 362
		bodyModel[294] = new ModelRendererTurbo(this, 176, 91, textureX, textureY, BoxName.ditch); // Box 363 rear ditchlight canook
		bodyModel[295] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[296] = new ModelRendererTurbo(this, 264, 137, textureX, textureY, "lamp"); // Box Glow
		bodyModel[297] = new ModelRendererTurbo(this, 263, 133, textureX, textureY, "lamp"); // Box Glow
		bodyModel[298] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[299] = new ModelRendererTurbo(this, 307, 202, textureX, textureY); // Box 372
		bodyModel[300] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Box 373
		bodyModel[301] = new ModelRendererTurbo(this, 91, 83, textureX, textureY); // Box 374 mu box thing
		bodyModel[302] = new ModelRendererTurbo(this, 190, 92, textureX, textureY); // Box 399
		bodyModel[303] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 400
		bodyModel[304] = new ModelRendererTurbo(this, 90, 92, textureX, textureY); // Box 401
		bodyModel[305] = new ModelRendererTurbo(this, 90, 87, textureX, textureY); // Box 402
		bodyModel[306] = new ModelRendererTurbo(this, 460, 171, textureX, textureY); // Box 379
		bodyModel[307] = new ModelRendererTurbo(this, 463, 171, textureX, textureY); // Box 380
		bodyModel[308] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 523
		bodyModel[309] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 510
		bodyModel[310] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 511 compressed pipework
		bodyModel[311] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 512
		bodyModel[312] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 513
		bodyModel[313] = new ModelRendererTurbo(this, 275, 145, textureX, textureY); // Box 409 commander base
		bodyModel[314] = new ModelRendererTurbo(this, 275, 141, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[315] = new ModelRendererTurbo(this, 469, 8, textureX, textureY); // Box 409 commander base
		bodyModel[316] = new ModelRendererTurbo(this, 469, 4, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[317] = new ModelRendererTurbo(this, 424, 138, textureX, textureY); // Box 297 ec
		bodyModel[318] = new ModelRendererTurbo(this, 415, 121, textureX, textureY); // Box 302
		bodyModel[319] = new ModelRendererTurbo(this, 472, 151, textureX, textureY); // Box 586 cs2
		bodyModel[320] = new ModelRendererTurbo(this, 457, 155, textureX, textureY); // Box 587 cs2
		bodyModel[321] = new ModelRendererTurbo(this, 458, 145, textureX, textureY); // Box 588 cs2
		bodyModel[322] = new ModelRendererTurbo(this, 457, 151, textureX, textureY); // Box 589 cs2
		bodyModel[323] = new ModelRendererTurbo(this, 489, 150, textureX, textureY); // Box 590 cs2
		bodyModel[324] = new ModelRendererTurbo(this, 438, 138, textureX, textureY, "lamp"); // Box 275 cs2 speedo glow
		bodyModel[325] = new ModelRendererTurbo(this, 498, 134, textureX, textureY); // Box 397 hb
		bodyModel[326] = new ModelRendererTurbo(this, 501, 145, textureX, textureY); // Box 398 hb
		bodyModel[327] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 529
		bodyModel[328] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 530
		bodyModel[329] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 531
		bodyModel[330] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 532
		bodyModel[331] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 533
		bodyModel[332] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 534
		bodyModel[333] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 535
		bodyModel[334] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 536
		bodyModel[335] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 537
		bodyModel[336] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 538
		bodyModel[337] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 539
		bodyModel[338] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 540
		bodyModel[339] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 541
		bodyModel[340] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 542
		bodyModel[341] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 543
		bodyModel[342] = new ModelRendererTurbo(this, 117, 57, textureX, textureY); // Box 544
		bodyModel[343] = new ModelRendererTurbo(this, 140, 72, textureX, textureY); // Box 545
		bodyModel[344] = new ModelRendererTurbo(this, 128, 72, textureX, textureY); // Box 547
		bodyModel[345] = new ModelRendererTurbo(this, 117, 76, textureX, textureY); // Box 548
		bodyModel[346] = new ModelRendererTurbo(this, 159, 76, textureX, textureY); // Box 551
		bodyModel[347] = new ModelRendererTurbo(this, 119, 78, textureX, textureY); // Box 554
		bodyModel[348] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 555
		bodyModel[349] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // Box 556 mu box thing
		bodyModel[350] = new ModelRendererTurbo(this, 474, 42, textureX, textureY); // Box 557
		bodyModel[351] = new ModelRendererTurbo(this, 474, 68, textureX, textureY); // Box 558
		bodyModel[352] = new ModelRendererTurbo(this, 289, 102, textureX, textureY); // Box 559
		bodyModel[353] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 560
		bodyModel[354] = new ModelRendererTurbo(this, 289, 111, textureX, textureY); // Box 561
		bodyModel[355] = new ModelRendererTurbo(this, 289, 114, textureX, textureY); // Box 562
		bodyModel[356] = new ModelRendererTurbo(this, 289, 117, textureX, textureY); // Box 563
		bodyModel[357] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[358] = new ModelRendererTurbo(this, 264, 137, textureX, textureY); // Box Glow
		bodyModel[359] = new ModelRendererTurbo(this, 263, 133, textureX, textureY); // Box Glow
		bodyModel[360] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[361] = new ModelRendererTurbo(this, 412, 37, textureX, textureY); // Box 405
		bodyModel[362] = new ModelRendererTurbo(this, 405, 57, textureX, textureY); // Box 570
		bodyModel[363] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 571
		bodyModel[364] = new ModelRendererTurbo(this, 359, 117, textureX, textureY); // Box 572 amsnack box
		bodyModel[365] = new ModelRendererTurbo(this, 40, 68, textureX, textureY); // Box 573
		bodyModel[366] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 574
		bodyModel[367] = new ModelRendererTurbo(this, 124, 68, textureX, textureY); // Box 575
		bodyModel[368] = new ModelRendererTurbo(this, 140, 68, textureX, textureY); // Box 576
		bodyModel[369] = new ModelRendererTurbo(this, 231, 106, textureX, textureY); // Box 260
		bodyModel[370] = new ModelRendererTurbo(this, 246, 107, textureX, textureY); // Box 264
		bodyModel[371] = new ModelRendererTurbo(this, 229, 109, textureX, textureY); // Box 268
		bodyModel[372] = new ModelRendererTurbo(this, 246, 110, textureX, textureY); // Box 274
		bodyModel[373] = new ModelRendererTurbo(this, 241, 114, textureX, textureY); // Box 283
		bodyModel[374] = new ModelRendererTurbo(this, 228, 114, textureX, textureY); // Box 284
		bodyModel[375] = new ModelRendererTurbo(this, 246, 129, textureX, textureY); // Box 293
		bodyModel[376] = new ModelRendererTurbo(this, 229, 128, textureX, textureY); // Box 294
		bodyModel[377] = new ModelRendererTurbo(this, 231, 125, textureX, textureY); // Box 295
		bodyModel[378] = new ModelRendererTurbo(this, 246, 126, textureX, textureY); // Box 296
		bodyModel[379] = new ModelRendererTurbo(this, 241, 133, textureX, textureY); // Box 360
		bodyModel[380] = new ModelRendererTurbo(this, 228, 133, textureX, textureY); // Box 361
		bodyModel[381] = new ModelRendererTurbo(this, 462, 56, textureX, textureY); // Box 404
		bodyModel[382] = new ModelRendererTurbo(this, 461, 49, textureX, textureY); // Box 405
		bodyModel[383] = new ModelRendererTurbo(this, 462, 43, textureX, textureY); // Box 406
		bodyModel[384] = new ModelRendererTurbo(this, 461, 62, textureX, textureY); // Box 407
		bodyModel[385] = new ModelRendererTurbo(this, 462, 69, textureX, textureY); // Box 408
		bodyModel[386] = new ModelRendererTurbo(this, 298, 228, textureX, textureY); // Box 409 vent
		bodyModel[387] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 410 vent
		bodyModel[388] = new ModelRendererTurbo(this, 340, 228, textureX, textureY); // Box 411 vent
		bodyModel[389] = new ModelRendererTurbo(this, 361, 222, textureX, textureY); // Box 412 vent
		bodyModel[390] = new ModelRendererTurbo(this, 381, 222, textureX, textureY); // Box 413 vent
		bodyModel[391] = new ModelRendererTurbo(this, 277, 234, textureX, textureY); // Box 414
		bodyModel[392] = new ModelRendererTurbo(this, 477, 174, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[393] = new ModelRendererTurbo(this, 479, 169, textureX, textureY); // Box 5 aww
		bodyModel[394] = new ModelRendererTurbo(this, 477, 191, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[395] = new ModelRendererTurbo(this, 479, 186, textureX, textureY); // Box 5 aww
		bodyModel[396] = new ModelRendererTurbo(this, 236, 185, textureX, textureY); // Box 419 fan
		bodyModel[397] = new ModelRendererTurbo(this, 439, 195, textureX, textureY); // Box 412 cs
		bodyModel[398] = new ModelRendererTurbo(this, 451, 194, textureX, textureY); // Box 413 cs
		bodyModel[399] = new ModelRendererTurbo(this, 437, 187, textureX, textureY); // Box 86 cs
		bodyModel[400] = new ModelRendererTurbo(this, 432, 208, textureX, textureY); // Box 531 cs
		bodyModel[401] = new ModelRendererTurbo(this, 430, 180, textureX, textureY, "lamp"); // Box 71 cs glow speedometer
		bodyModel[402] = new ModelRendererTurbo(this, 430, 175, textureX, textureY); // Box 307 cs speedo
		bodyModel[403] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 168 numberboard front double
		bodyModel[404] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 167 numberboard front double
		bodyModel[405] = new ModelRendererTurbo(this, 483, 1, textureX, textureY, "lamp"); // Box 167 numberboard rear single
		bodyModel[406] = new ModelRendererTurbo(this, 483, 1, textureX, textureY, "lamp"); // Box 168 numberboard rear single
		bodyModel[407] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 168 numberboard rear double
		bodyModel[408] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 167 numberboard rear double
		bodyModel[409] = new ModelRendererTurbo(this, 368, 64, textureX, textureY); // Box 184 o2 generator
		bodyModel[410] = new ModelRendererTurbo(this, 215, 41, textureX, textureY); // Box 215 trolleybit
		bodyModel[411] = new ModelRendererTurbo(this, 254, 44, textureX, textureY); // Box 228 trolleybit
		bodyModel[412] = new ModelRendererTurbo(this, 228, 43, textureX, textureY); // Box 231trolleybit
		bodyModel[413] = new ModelRendererTurbo(this, 237, 43, textureX, textureY); // Box 232 trolleybit
		bodyModel[414] = new ModelRendererTurbo(this, 341, 97, textureX, textureY); // Box 428 trolleybit
		bodyModel[415] = new ModelRendererTurbo(this, 230, 48, textureX, textureY); // Box 231 trolleybit
		bodyModel[416] = new ModelRendererTurbo(this, 258, 53, textureX, textureY); // Box 415
		bodyModel[417] = new ModelRendererTurbo(this, 245, 53, textureX, textureY, "lamp"); // Box 416 more sp numberboard
		bodyModel[418] = new ModelRendererTurbo(this, 284, 49, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[419] = new ModelRendererTurbo(this, 271, 49, textureX, textureY, "cull"); // Box 418 cull
		bodyModel[420] = new ModelRendererTurbo(this, 258, 49, textureX, textureY); // Box 419
		bodyModel[421] = new ModelRendererTurbo(this, 245, 49, textureX, textureY, "lamp"); // Box 420 more sp numberboard
		bodyModel[422] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[423] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[424] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[425] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[426] = new ModelRendererTurbo(this, 27, 169, textureX, textureY); // Box 426 flexicoil short skirt
		bodyModel[427] = new ModelRendererTurbo(this, 66, 169, textureX, textureY); // Box 427 flexicoil short skirt
		bodyModel[428] = new ModelRendererTurbo(this, 61, 169, textureX, textureY); // Box 428 flexicoil short skirt
		bodyModel[429] = new ModelRendererTurbo(this, 32, 169, textureX, textureY); // Box 429 flexicoil short skirt
		bodyModel[430] = new ModelRendererTurbo(this, 411, 16, textureX, textureY); // Box 409 commander base
		bodyModel[431] = new ModelRendererTurbo(this, 411, 12, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[432] = new ModelRendererTurbo(this, 406, 16, textureX, textureY); // Box 409 commander base
		bodyModel[433] = new ModelRendererTurbo(this, 406, 12, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[434] = new ModelRendererTurbo(this, 418, 3, textureX, textureY, "cull"); // Box 434 cull beacon holder
		bodyModel[435] = new ModelRendererTurbo(this, 167, 100, textureX, textureY); // Box 268
		bodyModel[436] = new ModelRendererTurbo(this, 23, 46, textureX, textureY); // Box 436 mu cable confuckery
		bodyModel[437] = new ModelRendererTurbo(this, 123, 46, textureX, textureY); // Box 437 mu cable confuckery

		bodyModel[0].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 89
		bodyModel[0].setRotationPoint(-5F, 3F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 202
		bodyModel[1].setRotationPoint(-5F, 7F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[2].setRotationPoint(-5F, 8F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
		bodyModel[3].setRotationPoint(-27F, 1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 1
		bodyModel[4].setRotationPoint(-31F, 1F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[5].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 166
		bodyModel[7].setRotationPoint(-31.01F, -9F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[8].setRotationPoint(-31.01F, -7F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[9].setRotationPoint(-31.01F, -7F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[10].setRotationPoint(-27F, 2F, 4.75F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 546
		bodyModel[11].setRotationPoint(-31F, -7F, -0.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 389
		bodyModel[12].setRotationPoint(-31F, 6F, 9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 390
		bodyModel[13].setRotationPoint(-31F, 8F, 9F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 391
		bodyModel[14].setRotationPoint(-31F, 6F, 7.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 392
		bodyModel[15].setRotationPoint(-31F, 4F, 7.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 393
		bodyModel[16].setRotationPoint(-31F, 4F, 6F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 394
		bodyModel[17].setRotationPoint(-31F, 2F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[18].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[19].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[20].setRotationPoint(31F, 2.5F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 184
		bodyModel[21].setRotationPoint(27F, 1F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 388
		bodyModel[22].setRotationPoint(-31F, 1.5F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[23].setRotationPoint(27F, 2F, 4.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[24].setRotationPoint(27F, 2F, -10.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 54, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 108
		bodyModel[25].setRotationPoint(-27F, 2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[26].setRotationPoint(-27F, 2F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[27].setRotationPoint(-27F, 2F, 11F);

		bodyModel[28].addBox(0F, 0F, 0F, 29, 15, 16, 0F); // Box 5 hood
		bodyModel[28].setRotationPoint(-25F, -14F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[29].setRotationPoint(-25F, -15F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[30].setRotationPoint(-25F, -15F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[31].setRotationPoint(4F, -12F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 138 cull fan cover
		bodyModel[32].setRotationPoint(-26F, -11.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[33].setRotationPoint(4F, -14F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[34].setRotationPoint(4F, -14F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 9
		bodyModel[35].setRotationPoint(22F, -17F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 16, 5, 22, 0F); // Box 18
		bodyModel[36].setRotationPoint(11F, -4F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 71
		bodyModel[37].setRotationPoint(22F, -17F, 2F);

		bodyModel[38].addShapeBox(-0.5F, 0F, 0F, 1, 13, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 61 door swign right
		bodyModel[38].setRotationPoint(22.5F, -17F, -2F);

		bodyModel[39].addBox(0F, 0F, 0F, 29, 0, 1, 0F); // Box 390
		bodyModel[39].setRotationPoint(-25F, -12F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 29, 0, 1, 0F); // Box 391
		bodyModel[40].setRotationPoint(-25F, -12F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 392
		bodyModel[41].setRotationPoint(4F, -12F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		bodyModel[42].setRotationPoint(4F, -12F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[43].setRotationPoint(11F, -20F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 9
		bodyModel[44].setRotationPoint(12F, -17F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 10
		bodyModel[45].setRotationPoint(12F, -17F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 15
		bodyModel[46].setRotationPoint(11F, -17F, -7F);

		bodyModel[47].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[47].setRotationPoint(11.5F, -17F, -10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[48].setRotationPoint(22F, -20F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[49].setRotationPoint(11F, -20F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[50].setRotationPoint(22F, -20F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[51].setRotationPoint(12F, -22F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 2F, 12, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[52].setRotationPoint(11F, -22F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 348
		bodyModel[53].setRotationPoint(12F, -22F, 0F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[54].setRotationPoint(11F, -20F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[55].setRotationPoint(22F, -20F, -7F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[56].setRotationPoint(-18F, 3.5F, -2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[57].setRotationPoint(-17.5F, 2F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[58].setRotationPoint(-17.5F, 2F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[59].setRotationPoint(-16.5F, 2F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[60].setRotationPoint(-16.5F, 2F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 337
		bodyModel[61].setRotationPoint(-31F, 2F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 338
		bodyModel[62].setRotationPoint(-31F, 4F, -8F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 339
		bodyModel[63].setRotationPoint(-31F, 4F, -7.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 340
		bodyModel[64].setRotationPoint(-31F, 6F, -9.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 341
		bodyModel[65].setRotationPoint(-31F, 6F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 342
		bodyModel[66].setRotationPoint(-31F, 8F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 188
		bodyModel[67].setRotationPoint(25F, -6F, -11.01F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 190
		bodyModel[68].setRotationPoint(25F, -6F, 11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[69].setRotationPoint(25F, -7F, -11.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[70].setRotationPoint(25F, -7F, 11.01F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[71].setRotationPoint(-27F, -15F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[72].setRotationPoint(-27F, -14.5F, -2.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[73].setRotationPoint(-27.25F, -15F, -0.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[74].setRotationPoint(-27.25F, -13.5F, -0.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[75].setRotationPoint(-27F, -14.5F, 1.5F);

		bodyModel[76].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front single
		bodyModel[76].setRotationPoint(-27F, -14F, -1.5F);
		bodyModel[76].rotateAngleY = -0.4712389F;

		bodyModel[77].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front single
		bodyModel[77].setRotationPoint(-27F, -14F, 1.5F);
		bodyModel[77].rotateAngleY = 0.4712389F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[78].setRotationPoint(-27.25F, -14.75F, -1.25F);

		bodyModel[79].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 371
		bodyModel[79].setRotationPoint(-28F, -7F, -11.01F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[80].setRotationPoint(-28F, -7F, -11.02F);

		bodyModel[81].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 373
		bodyModel[81].setRotationPoint(-28F, -7F, 11.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[82].setRotationPoint(-28F, -7F, 11.02F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 375
		bodyModel[83].setRotationPoint(27F, 1.5F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[84].setRotationPoint(-24F, -7F, -11.02F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[85].setRotationPoint(-24F, -7F, 11.02F);

		bodyModel[86].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[86].setRotationPoint(11F, -22F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[87].setRotationPoint(22F, -22F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[88].setRotationPoint(22F, -22F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[89].setRotationPoint(11F, -22F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[90].setRotationPoint(-26F, -15F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[91].setRotationPoint(-27F, -15F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[92].setRotationPoint(-27F, -14.5F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387
		bodyModel[93].setRotationPoint(-27F, -14.5F, 1F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 388
		bodyModel[94].setRotationPoint(14F, 3.5F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[95].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 390
		bodyModel[96].setRotationPoint(15.5F, 2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 391
		bodyModel[97].setRotationPoint(15.5F, 2F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 392
		bodyModel[98].setRotationPoint(14.5F, 2F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[99].setRotationPoint(-7F, -21F, -1F);

		bodyModel[100].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 395
		bodyModel[100].setRotationPoint(11F, -21F, -4F);

		bodyModel[101].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 396
		bodyModel[101].setRotationPoint(22F, -21F, -4F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[102].setRotationPoint(23F, -21F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[103].setRotationPoint(23F, -20.5F, -2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 173
		bodyModel[104].setRotationPoint(23F, -20.5F, 1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[105].setRotationPoint(24.25F, -20.75F, -1.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[106].setRotationPoint(24.25F, -21F, -0.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[107].setRotationPoint(24.25F, -19.5F, -0.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[108].setRotationPoint(23F, -21F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383
		bodyModel[109].setRotationPoint(23F, -21F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[110].setRotationPoint(23F, -20.5F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387
		bodyModel[111].setRotationPoint(23F, -20.5F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1070
		bodyModel[112].setRotationPoint(10F, -20F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-0.5F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 1071
		bodyModel[113].setRotationPoint(10F, -18F, 5F);

		bodyModel[114].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 1072
		bodyModel[114].setRotationPoint(10F, -21.5F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 1073
		bodyModel[115].setRotationPoint(10F, -20F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 1074
		bodyModel[116].setRotationPoint(10F, -18F, -13F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081 air tank support
		bodyModel[117].setRotationPoint(-4F, 3.25F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[118].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[119].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[120].setRotationPoint(23F, 2F, 10.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[121].setRotationPoint(23F, 2F, -10.75F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 1086
		bodyModel[122].setRotationPoint(-31F, -0.5F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1089 dynamic bullshit
		bodyModel[123].setRotationPoint(4F, -14F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[124].setRotationPoint(26F, -7F, -3F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[125].setRotationPoint(26F, -7F, 3F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[126].setRotationPoint(23F, -13F, 3F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[127].setRotationPoint(23F, -13F, -3F);

		bodyModel[128].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 1096
		bodyModel[128].setRotationPoint(-23F, -7F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 1097
		bodyModel[129].setRotationPoint(-23F, -7F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[130].setRotationPoint(7F, -7F, -11.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 43 cull
		bodyModel[131].setRotationPoint(9F, -1F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 1100 cull
		bodyModel[132].setRotationPoint(27F, -1F, -2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[133].setRotationPoint(-4F, 3F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[134].setRotationPoint(-4F, 4F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[135].setRotationPoint(-4F, 4F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 air tank support
		bodyModel[136].setRotationPoint(-4F, 3.25F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[137].setRotationPoint(-9F, -17F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[138].setRotationPoint(-9F, -18F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[139].setRotationPoint(-8.75F, -16.5F, -0.25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[140].setRotationPoint(-9F, -19F, -0.550000000000001F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[141].setRotationPoint(-9F, -18F, 0.45F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 651 yes this is a real bit
		bodyModel[142].setRotationPoint(9F, -3F, 7F);

		bodyModel[143].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[143].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[143].rotateAngleY = -0.78539816F;

		bodyModel[144].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[144].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[144].rotateAngleY = -0.78539816F;

		bodyModel[145].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[145].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[145].rotateAngleY = 0.78539816F;

		bodyModel[146].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[146].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[146].rotateAngleY = 0.78539816F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[147].setRotationPoint(-28F, -20F, -1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[148].setRotationPoint(-28F, -19F, 1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[149].setRotationPoint(-28F, -19F, -2F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[150].setRotationPoint(-28F, -16.25F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 208 sp trashcan light front
		bodyModel[151].setRotationPoint(-28.1F, -19.25F, -1.25F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 209
		bodyModel[152].setRotationPoint(-26F, -14F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 sp headlight front
		bodyModel[153].setRotationPoint(-26.25F, -14F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 sp headlight front
		bodyModel[154].setRotationPoint(-26.25F, -14F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 212
		bodyModel[155].setRotationPoint(-26F, -14F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[156].setRotationPoint(-26F, -14F, -5F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 214
		bodyModel[157].setRotationPoint(-26.5F, -6F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 215
		bodyModel[158].setRotationPoint(-26.5F, -7F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 385
		bodyModel[159].setRotationPoint(8F, -21F, 0F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 386
		bodyModel[160].setRotationPoint(7.25F, -21F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 512 cull
		bodyModel[161].setRotationPoint(9F, -19F, -1.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[162].setRotationPoint(-28F, -15F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[163].setRotationPoint(25F, -21F, -1F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[164].setRotationPoint(19F, -23.5F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[165].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[166].setRotationPoint(16F, -23F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[167].setRotationPoint(16F, -23F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[168].setRotationPoint(16F, -23F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[169].setRotationPoint(16F, -23F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[170].setRotationPoint(12F, -22.5F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[171].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[172].setRotationPoint(12F, -24F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[173].setRotationPoint(12F, -24F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[174].setRotationPoint(12F, -24F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[175].setRotationPoint(12F, -24F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 478 cull
		bodyModel[176].setRotationPoint(12F, -22.5F, -1F);

		bodyModel[177].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[177].setRotationPoint(16.5F, -23.5F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[178].setRotationPoint(15.5F, -23.5F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[179].setRotationPoint(15.5F, -22.5F, -2F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[180].setRotationPoint(-7.5F, -21F, -1.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[181].setRotationPoint(-7.5F, -22F, -1.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[182].setRotationPoint(-7.5F, -19F, -1.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[183].setRotationPoint(-7.5F, -22F, -1F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[184].setRotationPoint(9.25F, -20F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[185].setRotationPoint(-4F, -22F, -0.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[186].setRotationPoint(-9F, -22F, -0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[187].setRotationPoint(-9.5F, -19F, -1.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull
		bodyModel[188].setRotationPoint(-31.5F, -4F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[189].setRotationPoint(-31.5F, -5F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 590
		bodyModel[190].setRotationPoint(-31.01F, -9F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[191].setRotationPoint(-31.01F, -9F, -8F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 396
		bodyModel[192].setRotationPoint(-30.5F, -1F, -2F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 260 cull
		bodyModel[193].setRotationPoint(-7.5F, -22F, -1.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[194].setRotationPoint(13F, -22.5F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[195].setRotationPoint(13F, -23.5F, -0.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 263 cull
		bodyModel[196].setRotationPoint(30.5F, -4F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264 cull
		bodyModel[197].setRotationPoint(30.5F, -5F, -2F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 268
		bodyModel[198].setRotationPoint(29.5F, -1F, -2F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 269
		bodyModel[199].setRotationPoint(12F, -23.5F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 270 cull
		bodyModel[200].setRotationPoint(9F, -19F, -0.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[201].setRotationPoint(7.25F, -21F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 0, 14, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[202].setRotationPoint(-26.75F, -6F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 273
		bodyModel[203].setRotationPoint(-31.02F, 4F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[204].setRotationPoint(-31.02F, 4F, 6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[205].setRotationPoint(31.02F, 4F, 6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[206].setRotationPoint(31.02F, 4F, -9F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[207].setRotationPoint(-34F, 9F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 179
		bodyModel[208].setRotationPoint(31.01F, 9F, -10F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[209].setRotationPoint(9.5F, -23.25F, 0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[210].setRotationPoint(11F, -22.5F, -0.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[211].setRotationPoint(8.5F, -23.5F, -0.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[212].setRotationPoint(9F, -23.25F, -1.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[213].setRotationPoint(10F, -24.5F, -1F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[214].setRotationPoint(10F, -24.5F, 0.25F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[215].setRotationPoint(-7F, -17F, 0F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 287 compressed pipework
		bodyModel[216].setRotationPoint(-5F, 3F, 11.01F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 cull
		bodyModel[217].setRotationPoint(-33.01F, 7F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[218].setRotationPoint(31.01F, 7F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[219].setRotationPoint(-31.5F, 0F, 4.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[220].setRotationPoint(-31.5F, 0F, -6.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[221].setRotationPoint(-31.75F, 0F, 4.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[222].setRotationPoint(-31.75F, 0F, -6.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[223].setRotationPoint(-31F, -2F, 3.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[224].setRotationPoint(-31F, -2F, -5.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[225].setRotationPoint(-31.25F, -2F, 3.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[226].setRotationPoint(-31.25F, -2F, -5.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[227].setRotationPoint(30.5F, 0F, -6.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[228].setRotationPoint(30.75F, 0F, -6.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[229].setRotationPoint(30.75F, 0F, 4.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[230].setRotationPoint(30.5F, 0F, 4.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[231].setRotationPoint(30F, -2F, -5.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[232].setRotationPoint(30.25F, -2F, -5.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[233].setRotationPoint(30.25F, -2F, 3.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[234].setRotationPoint(30F, -2F, 3.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[235].setRotationPoint(14F, -17F, 11F);
		bodyModel[235].rotateAngleX = 0.26179939F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[236].setRotationPoint(14F, -17.25F, -11.97F);
		bodyModel[236].rotateAngleX = -0.26179939F;

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[237].setRotationPoint(11.25F, -21.4F, 4.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[238].setRotationPoint(9.25F, -22.15F, 3.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[239].setRotationPoint(10.75F, -22.4F, 4.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[240].setRotationPoint(9.75F, -22.15F, 5.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[241].setRotationPoint(-35F, 7F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[242].setRotationPoint(-35F, 7F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[243].setRotationPoint(-34F, 6F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[244].setRotationPoint(-34F, 5F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[245].setRotationPoint(-34F, 6F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[246].setRotationPoint(-34F, 5F, -10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[247].setRotationPoint(-34F, 4F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[248].setRotationPoint(-34F, 4F, -8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 305
		bodyModel[249].setRotationPoint(34F, 7F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[250].setRotationPoint(34F, 7F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 307
		bodyModel[251].setRotationPoint(33F, 6F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 308
		bodyModel[252].setRotationPoint(33F, 6F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 309
		bodyModel[253].setRotationPoint(33F, 5F, 2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 310
		bodyModel[254].setRotationPoint(33F, 4F, 2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[255].setRotationPoint(33F, 5F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[256].setRotationPoint(33F, 4F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[257].setRotationPoint(-34F, 6F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[258].setRotationPoint(-34F, 6F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 315
		bodyModel[259].setRotationPoint(33F, 6F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 316
		bodyModel[260].setRotationPoint(33F, 6F, -10F);

		bodyModel[261].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[261].setRotationPoint(14F, -16F, -12F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[262].setRotationPoint(14F, -16F, 11F);

		bodyModel[263].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 319
		bodyModel[263].setRotationPoint(-7F, -21F, -1F);
		bodyModel[263].rotateAngleX = 0.9250245F;

		bodyModel[264].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 362 ane shit
		bodyModel[264].setRotationPoint(-27F, -17F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 ane front light gyra
		bodyModel[265].setRotationPoint(-27.25F, -17F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 ane front light gyra
		bodyModel[266].setRotationPoint(-27.25F, -17F, 0F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 365 ane shit
		bodyModel[267].setRotationPoint(23F, -23F, -2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 366 ane rear light gyra
		bodyModel[268].setRotationPoint(24.25F, -23F, -2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ane rear light gyra
		bodyModel[269].setRotationPoint(24.25F, -23F, 0F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[270].setRotationPoint(8.5F, -20.5F, -2.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[271].setRotationPoint(8.5F, -20.5F, 1.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[272].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[273].setRotationPoint(7.5F, -21F, 0.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[274].setRotationPoint(7.5F, -21F, -0.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 209
		bodyModel[275].setRotationPoint(23F, -20F, -2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 363 sp headlight rear
		bodyModel[276].setRotationPoint(23.25F, -20F, -2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 364 sp headlight rear
		bodyModel[277].setRotationPoint(23.25F, -20F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[278].setRotationPoint(23F, -20F, 2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[279].setRotationPoint(23F, -20F, -5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[280].setRotationPoint(23F, -26F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[281].setRotationPoint(23F, -25F, 1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[282].setRotationPoint(23F, -25F, -2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[283].setRotationPoint(23F, -22.25F, -1.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 208 sp trashcan light rear
		bodyModel[284].setRotationPoint(25.1F, -25.25F, -1.25F);

		bodyModel[285].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 354 cull
		bodyModel[285].setRotationPoint(-10.5F, -15F, 5F);
		bodyModel[285].rotateAngleY = 0.78539816F;

		bodyModel[286].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 355 cull
		bodyModel[286].setRotationPoint(-10.5F, -15F, -5F);
		bodyModel[286].rotateAngleY = -0.78539816F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356 front ditchlight canook
		bodyModel[287].setRotationPoint(-31.75F, -2F, -8.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 front ditchlight canook
		bodyModel[288].setRotationPoint(-31.75F, -2F, 6.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[289].setRotationPoint(-31.25F, -1F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[290].setRotationPoint(-31.25F, -1F, 7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[291].setRotationPoint(30.75F, -1F, -8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 361 rear ditchlight canook
		bodyModel[292].setRotationPoint(31.25F, -2F, -8.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[293].setRotationPoint(30.75F, -1F, 7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 rear ditchlight canook
		bodyModel[294].setRotationPoint(31.25F, -2F, 6.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[295].setRotationPoint(-27.25F, -13.5F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[296].setRotationPoint(-27.6F, -13F, -7.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[297].setRotationPoint(-26.75F, -13F, -8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[298].setRotationPoint(-26.75F, -11.75F, -7.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 372
		bodyModel[299].setRotationPoint(-24F, -15.26F, 0F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, -1.25F, 0F, -11F, -1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -11F, 1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[300].setRotationPoint(-24F, -15.26F, -8F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374 mu box thing
		bodyModel[301].setRotationPoint(-31.5F, -3F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[302].setRotationPoint(30F, -4F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[303].setRotationPoint(30.5F, -3.5F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[304].setRotationPoint(-31F, -4F, -5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[305].setRotationPoint(-31.5F, -3.5F, -5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[306].setRotationPoint(27F, -13F, -3F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[307].setRotationPoint(27F, -13F, 3F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 523
		bodyModel[308].setRotationPoint(-4F, 3F, -10.47F);
		bodyModel[308].rotateAngleX = -0.78539816F;

		bodyModel[309].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 510
		bodyModel[309].setRotationPoint(-4F, 3F, 10.47F);
		bodyModel[309].rotateAngleX = 0.78539816F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 511 compressed pipework
		bodyModel[310].setRotationPoint(-5F, 3F, -11.01F);

		bodyModel[311].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 512
		bodyModel[311].setRotationPoint(4F, 3.5F, -10.75F);
		bodyModel[311].rotateAngleX = -0.52359878F;

		bodyModel[312].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 513
		bodyModel[312].setRotationPoint(4F, 3.5F, 10.75F);
		bodyModel[312].rotateAngleX = 0.52359878F;

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[313].setRotationPoint(-26.9F, -16F, -0.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[314].setRotationPoint(-26.9F, -17F, -0.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[315].setRotationPoint(23.9F, -22F, -0.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[316].setRotationPoint(23.9F, -23F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 8, 8, 0F); // Box 297 ec
		bodyModel[317].setRotationPoint(12F, -12F, -7F);

		bodyModel[318].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 302
		bodyModel[318].setRotationPoint(12F, -5F, 3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 586 cs2
		bodyModel[319].setRotationPoint(11.5F, -11F, 5F);
		bodyModel[319].rotateAngleY = -0.80285146F;

		bodyModel[320].addShapeBox(0F, 0F, 1F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587 cs2
		bodyModel[320].setRotationPoint(11.5F, -12F, 5F);
		bodyModel[320].rotateAngleY = -0.80285146F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 588 cs2
		bodyModel[321].setRotationPoint(11.5F, -14F, 5F);
		bodyModel[321].rotateAngleY = -0.80285146F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 589 cs2
		bodyModel[322].setRotationPoint(11.5F, -12F, 5F);
		bodyModel[322].rotateAngleY = -0.80285146F;

		bodyModel[323].addBox(5F, 0F, -5F, 3, 8, 3, 0F); // Box 590 cs2
		bodyModel[323].setRotationPoint(11.25F, -12F, 5F);

		bodyModel[324].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 275 cs2 speedo glow
		bodyModel[324].setRotationPoint(12F, -17.5F, 6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 397 hb
		bodyModel[325].setRotationPoint(21.49F, -12F, 1F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 398 hb
		bodyModel[326].setRotationPoint(21.5F, -10F, 3F);

		bodyModel[327].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 529
		bodyModel[327].setRotationPoint(27F, 4F, 6F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 530
		bodyModel[328].setRotationPoint(27F, 2F, 6F);

		bodyModel[329].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 531
		bodyModel[329].setRotationPoint(27F, 4F, 7.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 532
		bodyModel[330].setRotationPoint(27F, 6F, 7.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 533
		bodyModel[331].setRotationPoint(27F, 6F, 9F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 534
		bodyModel[332].setRotationPoint(27F, 8F, 9F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 535
		bodyModel[333].setRotationPoint(27F, 8F, -11F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 536
		bodyModel[334].setRotationPoint(27F, 6F, -9F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 537
		bodyModel[335].setRotationPoint(27F, 6F, -9.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 538
		bodyModel[336].setRotationPoint(27F, 4F, -7.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 539
		bodyModel[337].setRotationPoint(27F, 4F, -8F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 540
		bodyModel[338].setRotationPoint(27F, 2F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[339].setRotationPoint(-4F, 4F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[340].setRotationPoint(-4F, 3F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[341].setRotationPoint(-4F, 4F, 10F);

		bodyModel[342].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 544
		bodyModel[342].setRotationPoint(31.01F, -9F, -11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[343].setRotationPoint(31.01F, -9F, -8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 547
		bodyModel[344].setRotationPoint(31.01F, -9F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[345].setRotationPoint(31.01F, -7F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[346].setRotationPoint(31.01F, -7F, -11F);

		bodyModel[347].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 554
		bodyModel[347].setRotationPoint(31F, -0.5F, -10F);

		bodyModel[348].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 555
		bodyModel[348].setRotationPoint(31F, -7F, -0.5F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 556 mu box thing
		bodyModel[349].setRotationPoint(30.5F, -3F, -3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 557
		bodyModel[350].setRotationPoint(12F, -20F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[351].setRotationPoint(12F, -20F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[352].setRotationPoint(-12F, -18F, 0.45F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[353].setRotationPoint(-12F, -19F, -0.550000000000001F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[354].setRotationPoint(-12F, -18F, -0.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 562
		bodyModel[355].setRotationPoint(-12F, -17F, -0.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
		bodyModel[356].setRotationPoint(-11.75F, -16.5F, -0.25F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[357].setRotationPoint(-27.25F, -13.5F, 6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[358].setRotationPoint(-27.6F, -13F, 6.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[359].setRotationPoint(-26.75F, -13F, 6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[360].setRotationPoint(-26.75F, -11.75F, 6.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[361].setRotationPoint(9F, -21.5F, -1.5F);

		bodyModel[362].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 570
		bodyModel[362].setRotationPoint(23F, -16F, -11.5F);
		bodyModel[362].rotateAngleY = -0.52359878F;

		bodyModel[363].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 571
		bodyModel[363].setRotationPoint(23F, -16F, -10.5F);

		bodyModel[364].addBox(0F, 0F, 0F, 9, 3, 4, 0F); // Box 572 amsnack box
		bodyModel[364].setRotationPoint(-8F, -17F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[365].setRotationPoint(-31F, -9F, -10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 574
		bodyModel[366].setRotationPoint(-31F, -9F, 3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 575
		bodyModel[367].setRotationPoint(31F, -9F, 3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[368].setRotationPoint(31F, -9F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[369].setRotationPoint(16F, -26F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[370].setRotationPoint(18F, -26F, 10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[371].setRotationPoint(15F, -25F, 9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[372].setRotationPoint(18F, -25F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 283
		bodyModel[373].setRotationPoint(17F, -23F, 8F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 284
		bodyModel[374].setRotationPoint(15F, -23F, 8F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 1F); // Box 293
		bodyModel[375].setRotationPoint(18F, -25F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 294
		bodyModel[376].setRotationPoint(15F, -25F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 295
		bodyModel[377].setRotationPoint(16F, -26F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[378].setRotationPoint(18F, -26F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F); // Box 360
		bodyModel[379].setRotationPoint(17F, -23F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F); // Box 361
		bodyModel[380].setRotationPoint(15F, -23F, -11F);

		bodyModel[381].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 404
		bodyModel[381].setRotationPoint(23F, -21.5F, -4F);

		bodyModel[382].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[382].setRotationPoint(23F, -20F, 0F);

		bodyModel[383].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, 2F, 0F, -0.5F, 2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 406
		bodyModel[383].setRotationPoint(23F, -18F, 5F);

		bodyModel[384].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 407
		bodyModel[384].setRotationPoint(23F, -20F, -9F);

		bodyModel[385].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 408
		bodyModel[385].setRotationPoint(23F, -18F, -13F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[386].setRotationPoint(1F, -7F, -8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[387].setRotationPoint(-2F, -7F, -8F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[388].setRotationPoint(-5F, -7F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[389].setRotationPoint(-8F, -7F, -8F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 413 vent
		bodyModel[390].setRotationPoint(24F, -3F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[391].setRotationPoint(-11F, -7F, -8F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[392].setRotationPoint(14F, -16F, 10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[393].setRotationPoint(14F, -17F, 10F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[394].setRotationPoint(14F, -16F, -15F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5 aww
		bodyModel[395].setRotationPoint(14F, -17F, -13F);

		bodyModel[396].addBox(0F, 0F, 0F, 0, 12, 12, 0F); // Box 419 fan
		bodyModel[396].setRotationPoint(-25.02F, -11.5F, -6F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[397].setRotationPoint(17.95F, -14F, 2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[398].setRotationPoint(11.25F, -12F, 4F);
		bodyModel[398].rotateAngleY = -0.45378561F;

		bodyModel[399].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[399].setRotationPoint(11.25F, -14F, 4F);
		bodyModel[399].rotateAngleY = -0.45378561F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[400].setRotationPoint(11.25F, -8F, 4F);
		bodyModel[400].rotateAngleY = -0.45378561F;

		bodyModel[401].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 cs glow speedometer
		bodyModel[401].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[401].rotateAngleY = 0.78539816F;

		bodyModel[402].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 cs speedo
		bodyModel[402].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[402].rotateAngleY = 0.78539816F;

		bodyModel[403].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front double
		bodyModel[403].setRotationPoint(-27F, -14F, 1F);
		bodyModel[403].rotateAngleY = 0.4712389F;

		bodyModel[404].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front double
		bodyModel[404].setRotationPoint(-27F, -14F, -1F);
		bodyModel[404].rotateAngleY = -0.4712389F;

		bodyModel[405].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear single
		bodyModel[405].setRotationPoint(25F, -20F, -1.5F);
		bodyModel[405].rotateAngleY = 0.4712389F;

		bodyModel[406].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear single
		bodyModel[406].setRotationPoint(25F, -20F, 1.5F);
		bodyModel[406].rotateAngleY = -0.4712389F;

		bodyModel[407].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear double
		bodyModel[407].setRotationPoint(25F, -20F, 1F);
		bodyModel[407].rotateAngleY = -0.4712389F;

		bodyModel[408].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear double
		bodyModel[408].setRotationPoint(25F, -20F, -1F);
		bodyModel[408].rotateAngleY = 0.4712389F;

		bodyModel[409].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[409].setRotationPoint(14.5F, -22.75F, -4F);

		bodyModel[410].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 215 trolleybit
		bodyModel[410].setRotationPoint(-13F, -19F, -1.5F);

		bodyModel[411].addBox(-20F, 0F, -0.5F, 22, 1, 0, 0F); // Box 228 trolleybit
		bodyModel[411].setRotationPoint(-13.5F, -20F, 0F);
		bodyModel[411].rotateAngleZ = -0.05235988F;

		bodyModel[412].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 231trolleybit
		bodyModel[412].setRotationPoint(-13F, -20F, -0.5F);

		bodyModel[413].addBox(-19F, 0F, 0F, 3, 1, 1, 0F); // Box 232 trolleybit
		bodyModel[413].setRotationPoint(-13.5F, -20F, -1F);
		bodyModel[413].rotateAngleZ = -0.05235988F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 trolleybit
		bodyModel[414].setRotationPoint(-24F, -21F, -1.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 231 trolleybit
		bodyModel[415].setRotationPoint(12F, -22.5F, -1.5F);

		bodyModel[416].addBox(-2.5F, 0F, -1F, 5, 2, 1, 0F); // Box 415
		bodyModel[416].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[416].rotateAngleY = -1.04719755F;

		bodyModel[417].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 416 more sp numberboard
		bodyModel[417].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[417].rotateAngleY = -1.04719755F;

		bodyModel[418].addBox(-2.5F, 0F, -1F, 5, 1, 1, 0F); // Box 417 cull
		bodyModel[418].setRotationPoint(-22.75F, -15F, -5F);
		bodyModel[418].rotateAngleY = -1.04719755F;

		bodyModel[419].addBox(-2.5F, 0F, 0F, 5, 1, 1, 0F); // Box 418 cull
		bodyModel[419].setRotationPoint(-22.75F, -15F, 5F);
		bodyModel[419].rotateAngleY = 1.04719755F;

		bodyModel[420].addBox(-2.5F, 0F, 0F, 5, 2, 1, 0F); // Box 419
		bodyModel[420].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[420].rotateAngleY = 1.04719755F;

		bodyModel[421].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 420 more sp numberboard
		bodyModel[421].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[421].rotateAngleY = 1.04719755F;

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[422].setRotationPoint(-25.5F, -13F, -7.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[423].setRotationPoint(-25.5F, -13F, 6.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[424].setRotationPoint(22.5F, -19F, -7.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[425].setRotationPoint(22.5F, -19F, 6.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 426 flexicoil short skirt
		bodyModel[426].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 427 flexicoil short skirt
		bodyModel[427].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 428 flexicoil short skirt
		bodyModel[428].setRotationPoint(25F, 2F, 10.75F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 429 flexicoil short skirt
		bodyModel[429].setRotationPoint(25F, 2F, -10.75F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[430].setRotationPoint(16F, -22.5F, -6.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[431].setRotationPoint(16F, -23.5F, -6.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[432].setRotationPoint(16F, -22.5F, 5.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[433].setRotationPoint(16F, -23.5F, 5.5F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 434 cull beacon holder
		bodyModel[434].setRotationPoint(15F, -21.5F, -7F);

		bodyModel[435].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 268
		bodyModel[435].setRotationPoint(26.5F, -1F, -2F);

		bodyModel[436].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 436 mu cable confuckery
		bodyModel[436].setRotationPoint(-31.03F, 2F, -8F);

		bodyModel[437].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 437 mu cable confuckery
		bodyModel[437].setRotationPoint(31.03F, 2F, -8F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeAnew theTypeA = new ModelTypeAnew();
	ModelBluntTruck fatBlunt = new ModelBluntTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1342 || GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black2.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 346) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 5) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.95, 0.27, 0);
			fatBlunt.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			fatBlunt.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}