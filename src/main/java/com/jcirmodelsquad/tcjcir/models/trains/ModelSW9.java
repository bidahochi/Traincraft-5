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

public class ModelSW9 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW9() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[502];

		initbodyModel_1();
		initbodyModel_2();

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
		bodyModel[99] = new ModelRendererTurbo(this, 321, 117, textureX, textureY); // Box 383
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
		bodyModel[123] = new ModelRendererTurbo(this, 460, 178, textureX, textureY); // Box 67
		bodyModel[124] = new ModelRendererTurbo(this, 463, 178, textureX, textureY); // Box 68
		bodyModel[125] = new ModelRendererTurbo(this, 463, 168, textureX, textureY); // Box 231
		bodyModel[126] = new ModelRendererTurbo(this, 460, 168, textureX, textureY); // Box 232
		bodyModel[127] = new ModelRendererTurbo(this, 241, 10, textureX, textureY); // Box 1096
		bodyModel[128] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1097
		bodyModel[129] = new ModelRendererTurbo(this, 241, 8, textureX, textureY); // Box 261
		bodyModel[130] = new ModelRendererTurbo(this, 485, 118, textureX, textureY, "cull"); // Box 43 cull
		bodyModel[131] = new ModelRendererTurbo(this, 485, 124, textureX, textureY, "cull"); // Box 1100 cull
		bodyModel[132] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 184
		bodyModel[133] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 185
		bodyModel[134] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 186
		bodyModel[135] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 187 air tank support
		bodyModel[136] = new ModelRendererTurbo(this, 296, 114, textureX, textureY); // Box 114
		bodyModel[137] = new ModelRendererTurbo(this, 296, 111, textureX, textureY); // Box 74
		bodyModel[138] = new ModelRendererTurbo(this, 296, 117, textureX, textureY); // Box 78
		bodyModel[139] = new ModelRendererTurbo(this, 367, 171, textureX, textureY); // Box 651 yes this is a real bit
		bodyModel[140] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 623
		bodyModel[141] = new ModelRendererTurbo(this, 293, 121, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[142] = new ModelRendererTurbo(this, 293, 121, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[143] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 627
		bodyModel[144] = new ModelRendererTurbo(this, 288, 134, textureX, textureY); // Box 214
		bodyModel[145] = new ModelRendererTurbo(this, 290, 134, textureX, textureY); // Box 215
		bodyModel[146] = new ModelRendererTurbo(this, 385, 37, textureX, textureY); // Box 385
		bodyModel[147] = new ModelRendererTurbo(this, 385, 40, textureX, textureY); // Box 386
		bodyModel[148] = new ModelRendererTurbo(this, 267, 158, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[149] = new ModelRendererTurbo(this, 474, 30, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[150] = new ModelRendererTurbo(this, 391, 30, textureX, textureY); // Box 184
		bodyModel[151] = new ModelRendererTurbo(this, 396, 29, textureX, textureY); // Box 364 prime base
		bodyModel[152] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[153] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[154] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[155] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[156] = new ModelRendererTurbo(this, 384, 31, textureX, textureY); // Box 183
		bodyModel[157] = new ModelRendererTurbo(this, 396, 17, textureX, textureY); // Box 364 prime base
		bodyModel[158] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[159] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[160] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[161] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[162] = new ModelRendererTurbo(this, 396, 21, textureX, textureY, "cull"); // Box 478 cull
		bodyModel[163] = new ModelRendererTurbo(this, 419, 25, textureX, textureY); // Box 364
		bodyModel[164] = new ModelRendererTurbo(this, 408, 20, textureX, textureY); // Box 365
		bodyModel[165] = new ModelRendererTurbo(this, 408, 26, textureX, textureY); // Box 366
		bodyModel[166] = new ModelRendererTurbo(this, 307, 115, textureX, textureY); // Box 538
		bodyModel[167] = new ModelRendererTurbo(this, 307, 110, textureX, textureY); // Box 539
		bodyModel[168] = new ModelRendererTurbo(this, 307, 121, textureX, textureY); // Box 540
		bodyModel[169] = new ModelRendererTurbo(this, 320, 113, textureX, textureY); // Box 240
		bodyModel[170] = new ModelRendererTurbo(this, 395, 40, textureX, textureY); // Box 241
		bodyModel[171] = new ModelRendererTurbo(this, 326, 94, textureX, textureY); // Box 523
		bodyModel[172] = new ModelRendererTurbo(this, 326, 94, textureX, textureY); // Box 524
		bodyModel[173] = new ModelRendererTurbo(this, 315, 100, textureX, textureY); // Box 525
		bodyModel[174] = new ModelRendererTurbo(this, 45, 100, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[175] = new ModelRendererTurbo(this, 34, 100, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[176] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 590
		bodyModel[177] = new ModelRendererTurbo(this, 40, 72, textureX, textureY); // Box 591
		bodyModel[178] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 396
		bodyModel[179] = new ModelRendererTurbo(this, 319, 107, textureX, textureY, "cull"); // Box 260 cull
		bodyModel[180] = new ModelRendererTurbo(this, 390, 22, textureX, textureY); // Box 409 commander base
		bodyModel[181] = new ModelRendererTurbo(this, 390, 18, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[182] = new ModelRendererTurbo(this, 145, 100, textureX, textureY, "cull"); // Box 263 cull
		bodyModel[183] = new ModelRendererTurbo(this, 134, 100, textureX, textureY, "cull"); // Box 264 cull
		bodyModel[184] = new ModelRendererTurbo(this, 156, 100, textureX, textureY); // Box 268
		bodyModel[185] = new ModelRendererTurbo(this, 391, 27, textureX, textureY); // Box 269
		bodyModel[186] = new ModelRendererTurbo(this, 393, 46, textureX, textureY, "cull"); // Box 270 cull
		bodyModel[187] = new ModelRendererTurbo(this, 401, 40, textureX, textureY); // Box 271
		bodyModel[188] = new ModelRendererTurbo(this, 268, 133, textureX, textureY); // Box 393
		bodyModel[189] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 273
		bodyModel[190] = new ModelRendererTurbo(this, 32, 67, textureX, textureY); // Box 274
		bodyModel[191] = new ModelRendererTurbo(this, 132, 67, textureX, textureY); // Box 275
		bodyModel[192] = new ModelRendererTurbo(this, 140, 67, textureX, textureY); // Box 276
		bodyModel[193] = new ModelRendererTurbo(this, 42, 79, textureX, textureY); // Box 50
		bodyModel[194] = new ModelRendererTurbo(this, 142, 79, textureX, textureY); // Box 179
		bodyModel[195] = new ModelRendererTurbo(this, 362, 23, textureX, textureY); // Box 354
		bodyModel[196] = new ModelRendererTurbo(this, 371, 29, textureX, textureY); // Box 355
		bodyModel[197] = new ModelRendererTurbo(this, 360, 29, textureX, textureY); // Box 356
		bodyModel[198] = new ModelRendererTurbo(this, 362, 35, textureX, textureY); // Box 357
		bodyModel[199] = new ModelRendererTurbo(this, 364, 32, textureX, textureY); // Box 358
		bodyModel[200] = new ModelRendererTurbo(this, 364, 26, textureX, textureY); // Box 359
		bodyModel[201] = new ModelRendererTurbo(this, 318, 95, textureX, textureY); // Box 285
		bodyModel[202] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 287 compressed pipework
		bodyModel[203] = new ModelRendererTurbo(this, 19, 100, textureX, textureY, "cull"); // Box 186 cull
		bodyModel[204] = new ModelRendererTurbo(this, 119, 100, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[205] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 78
		bodyModel[206] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 188
		bodyModel[207] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up
		bodyModel[208] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up
		bodyModel[209] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 78
		bodyModel[210] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 188
		bodyModel[211] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[212] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[213] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 239
		bodyModel[214] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r up
		bodyModel[215] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up
		bodyModel[216] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 242
		bodyModel[217] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 239
		bodyModel[218] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[219] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[220] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 242
		bodyModel[221] = new ModelRendererTurbo(this, 381, 57, textureX, textureY); // box64
		bodyModel[222] = new ModelRendererTurbo(this, 381, 53, textureX, textureY); // box65
		bodyModel[223] = new ModelRendererTurbo(this, 373, 44, textureX, textureY); // Box 293
		bodyModel[224] = new ModelRendererTurbo(this, 364, 47, textureX, textureY); // Box 294
		bodyModel[225] = new ModelRendererTurbo(this, 362, 44, textureX, textureY); // Box 295
		bodyModel[226] = new ModelRendererTurbo(this, 364, 41, textureX, textureY); // Box 296
		bodyModel[227] = new ModelRendererTurbo(this, 6, 117, textureX, textureY); // Box 282
		bodyModel[228] = new ModelRendererTurbo(this, 19, 121, textureX, textureY); // Box 283
		bodyModel[229] = new ModelRendererTurbo(this, 28, 109, textureX, textureY); // Box 4
		bodyModel[230] = new ModelRendererTurbo(this, 19, 109, textureX, textureY); // Box 448
		bodyModel[231] = new ModelRendererTurbo(this, 41, 111, textureX, textureY); // Box 322
		bodyModel[232] = new ModelRendererTurbo(this, 54, 111, textureX, textureY); // Box 323
		bodyModel[233] = new ModelRendererTurbo(this, 8, 107, textureX, textureY); // Box 280
		bodyModel[234] = new ModelRendererTurbo(this, 65, 109, textureX, textureY); // Box 285
		bodyModel[235] = new ModelRendererTurbo(this, 119, 121, textureX, textureY); // Box 305
		bodyModel[236] = new ModelRendererTurbo(this, 106, 117, textureX, textureY); // Box 306
		bodyModel[237] = new ModelRendererTurbo(this, 128, 109, textureX, textureY); // Box 307
		bodyModel[238] = new ModelRendererTurbo(this, 141, 111, textureX, textureY); // Box 308
		bodyModel[239] = new ModelRendererTurbo(this, 154, 111, textureX, textureY); // Box 309
		bodyModel[240] = new ModelRendererTurbo(this, 165, 109, textureX, textureY); // Box 310
		bodyModel[241] = new ModelRendererTurbo(this, 119, 109, textureX, textureY); // Box 311
		bodyModel[242] = new ModelRendererTurbo(this, 108, 107, textureX, textureY); // Box 312
		bodyModel[243] = new ModelRendererTurbo(this, 74, 109, textureX, textureY); // Box 24
		bodyModel[244] = new ModelRendererTurbo(this, 87, 111, textureX, textureY); // Box 25
		bodyModel[245] = new ModelRendererTurbo(this, 187, 111, textureX, textureY); // Box 315
		bodyModel[246] = new ModelRendererTurbo(this, 174, 109, textureX, textureY); // Box 316
		bodyModel[247] = new ModelRendererTurbo(this, 399, 57, textureX, textureY); // Box 350
		bodyModel[248] = new ModelRendererTurbo(this, 396, 57, textureX, textureY); // Box 351
		bodyModel[249] = new ModelRendererTurbo(this, 281, 165, textureX, textureY); // Box 362 ane shit
		bodyModel[250] = new ModelRendererTurbo(this, 274, 167, textureX, textureY, "lamp"); // Box 363 ane front light gyra
		bodyModel[251] = new ModelRendererTurbo(this, 267, 167, textureX, textureY, "lamp"); // Box 364 ane front light gyra
		bodyModel[252] = new ModelRendererTurbo(this, 466, 22, textureX, textureY); // Box 365 ane shit
		bodyModel[253] = new ModelRendererTurbo(this, 452, 24, textureX, textureY, "lamp"); // Box 366 ane rear light gyra
		bodyModel[254] = new ModelRendererTurbo(this, 459, 24, textureX, textureY, "lamp"); // Box 367 ane rear light gyra
		bodyModel[255] = new ModelRendererTurbo(this, 350, 35, textureX, textureY); // Box 81
		bodyModel[256] = new ModelRendererTurbo(this, 350, 23, textureX, textureY); // Box 82
		bodyModel[257] = new ModelRendererTurbo(this, 348, 32, textureX, textureY); // Box 83
		bodyModel[258] = new ModelRendererTurbo(this, 348, 26, textureX, textureY); // Box 84
		bodyModel[259] = new ModelRendererTurbo(this, 348, 29, textureX, textureY); // Box 85
		bodyModel[260] = new ModelRendererTurbo(this, 292, 130, textureX, textureY, "cull"); // Box 354 cull
		bodyModel[261] = new ModelRendererTurbo(this, 292, 130, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[262] = new ModelRendererTurbo(this, 76, 91, textureX, textureY, BoxName.ditch); // Box 356 front ditchlight canook
		bodyModel[263] = new ModelRendererTurbo(this, 76, 91, textureX, textureY, BoxName.ditch); // Box 357 front ditchlight canook
		bodyModel[264] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 358
		bodyModel[265] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 359
		bodyModel[266] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 360
		bodyModel[267] = new ModelRendererTurbo(this, 176, 91, textureX, textureY, BoxName.ditch); // Box 361 rear ditchlight canook
		bodyModel[268] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 362
		bodyModel[269] = new ModelRendererTurbo(this, 176, 91, textureX, textureY, BoxName.ditch); // Box 363 rear ditchlight canook
		bodyModel[270] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[271] = new ModelRendererTurbo(this, 264, 137, textureX, textureY, "lamp"); // Box Glow
		bodyModel[272] = new ModelRendererTurbo(this, 263, 133, textureX, textureY, "lamp"); // Box Glow
		bodyModel[273] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 307, 202, textureX, textureY); // Box 372
		bodyModel[275] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Box 373
		bodyModel[276] = new ModelRendererTurbo(this, 91, 83, textureX, textureY); // Box 374 mu box thing
		bodyModel[277] = new ModelRendererTurbo(this, 190, 92, textureX, textureY); // Box 399
		bodyModel[278] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 400
		bodyModel[279] = new ModelRendererTurbo(this, 90, 92, textureX, textureY); // Box 401
		bodyModel[280] = new ModelRendererTurbo(this, 90, 87, textureX, textureY); // Box 402
		bodyModel[281] = new ModelRendererTurbo(this, 460, 171, textureX, textureY); // Box 379
		bodyModel[282] = new ModelRendererTurbo(this, 463, 171, textureX, textureY); // Box 380
		bodyModel[283] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 523
		bodyModel[284] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 510
		bodyModel[285] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 511 compressed pipework
		bodyModel[286] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 512
		bodyModel[287] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 513
		bodyModel[288] = new ModelRendererTurbo(this, 275, 145, textureX, textureY); // Box 409 commander base
		bodyModel[289] = new ModelRendererTurbo(this, 275, 141, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[290] = new ModelRendererTurbo(this, 469, 8, textureX, textureY); // Box 409 commander base
		bodyModel[291] = new ModelRendererTurbo(this, 469, 4, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[292] = new ModelRendererTurbo(this, 424, 138, textureX, textureY); // Box 297 ec
		bodyModel[293] = new ModelRendererTurbo(this, 415, 121, textureX, textureY); // Box 302
		bodyModel[294] = new ModelRendererTurbo(this, 472, 151, textureX, textureY); // Box 586 cs2
		bodyModel[295] = new ModelRendererTurbo(this, 457, 155, textureX, textureY); // Box 587 cs2
		bodyModel[296] = new ModelRendererTurbo(this, 458, 145, textureX, textureY); // Box 588 cs2
		bodyModel[297] = new ModelRendererTurbo(this, 457, 151, textureX, textureY); // Box 589 cs2
		bodyModel[298] = new ModelRendererTurbo(this, 489, 150, textureX, textureY); // Box 590 cs2
		bodyModel[299] = new ModelRendererTurbo(this, 438, 138, textureX, textureY, "lamp"); // Box 275 cs2 speedo glow
		bodyModel[300] = new ModelRendererTurbo(this, 498, 134, textureX, textureY); // Box 397 hb
		bodyModel[301] = new ModelRendererTurbo(this, 501, 145, textureX, textureY); // Box 398 hb
		bodyModel[302] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 529
		bodyModel[303] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 530
		bodyModel[304] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 531
		bodyModel[305] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 532
		bodyModel[306] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 533
		bodyModel[307] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 534
		bodyModel[308] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 535
		bodyModel[309] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 536
		bodyModel[310] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 537
		bodyModel[311] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 538
		bodyModel[312] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 539
		bodyModel[313] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 540
		bodyModel[314] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 541
		bodyModel[315] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 542
		bodyModel[316] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 543
		bodyModel[317] = new ModelRendererTurbo(this, 117, 57, textureX, textureY); // Box 544
		bodyModel[318] = new ModelRendererTurbo(this, 140, 72, textureX, textureY); // Box 545
		bodyModel[319] = new ModelRendererTurbo(this, 128, 72, textureX, textureY); // Box 547
		bodyModel[320] = new ModelRendererTurbo(this, 117, 76, textureX, textureY); // Box 548
		bodyModel[321] = new ModelRendererTurbo(this, 159, 76, textureX, textureY); // Box 551
		bodyModel[322] = new ModelRendererTurbo(this, 119, 78, textureX, textureY); // Box 554
		bodyModel[323] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 555
		bodyModel[324] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // Box 556 mu box thing
		bodyModel[325] = new ModelRendererTurbo(this, 474, 42, textureX, textureY); // Box 557
		bodyModel[326] = new ModelRendererTurbo(this, 474, 68, textureX, textureY); // Box 558
		bodyModel[327] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[328] = new ModelRendererTurbo(this, 264, 137, textureX, textureY, "lamp"); // Box Glow
		bodyModel[329] = new ModelRendererTurbo(this, 263, 133, textureX, textureY, "lamp"); // Box Glow
		bodyModel[330] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[331] = new ModelRendererTurbo(this, 412, 37, textureX, textureY); // Box 405
		bodyModel[332] = new ModelRendererTurbo(this, 405, 57, textureX, textureY); // Box 570
		bodyModel[333] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 571
		bodyModel[334] = new ModelRendererTurbo(this, 40, 68, textureX, textureY); // Box 573
		bodyModel[335] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 574
		bodyModel[336] = new ModelRendererTurbo(this, 124, 68, textureX, textureY); // Box 575
		bodyModel[337] = new ModelRendererTurbo(this, 140, 68, textureX, textureY); // Box 576
		bodyModel[338] = new ModelRendererTurbo(this, 231, 106, textureX, textureY); // Box 260
		bodyModel[339] = new ModelRendererTurbo(this, 246, 107, textureX, textureY); // Box 264
		bodyModel[340] = new ModelRendererTurbo(this, 229, 109, textureX, textureY); // Box 268
		bodyModel[341] = new ModelRendererTurbo(this, 246, 110, textureX, textureY); // Box 274
		bodyModel[342] = new ModelRendererTurbo(this, 241, 114, textureX, textureY); // Box 283
		bodyModel[343] = new ModelRendererTurbo(this, 228, 114, textureX, textureY); // Box 284
		bodyModel[344] = new ModelRendererTurbo(this, 246, 129, textureX, textureY); // Box 293
		bodyModel[345] = new ModelRendererTurbo(this, 229, 128, textureX, textureY); // Box 294
		bodyModel[346] = new ModelRendererTurbo(this, 231, 125, textureX, textureY); // Box 295
		bodyModel[347] = new ModelRendererTurbo(this, 246, 126, textureX, textureY); // Box 296
		bodyModel[348] = new ModelRendererTurbo(this, 241, 133, textureX, textureY); // Box 360
		bodyModel[349] = new ModelRendererTurbo(this, 228, 133, textureX, textureY); // Box 361
		bodyModel[350] = new ModelRendererTurbo(this, 462, 56, textureX, textureY); // Box 404
		bodyModel[351] = new ModelRendererTurbo(this, 461, 49, textureX, textureY); // Box 405
		bodyModel[352] = new ModelRendererTurbo(this, 462, 43, textureX, textureY); // Box 406
		bodyModel[353] = new ModelRendererTurbo(this, 461, 62, textureX, textureY); // Box 407
		bodyModel[354] = new ModelRendererTurbo(this, 462, 69, textureX, textureY); // Box 408
		bodyModel[355] = new ModelRendererTurbo(this, 298, 228, textureX, textureY); // Box 409 vent
		bodyModel[356] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 410 vent
		bodyModel[357] = new ModelRendererTurbo(this, 340, 228, textureX, textureY); // Box 411 vent
		bodyModel[358] = new ModelRendererTurbo(this, 361, 222, textureX, textureY); // Box 412 vent
		bodyModel[359] = new ModelRendererTurbo(this, 381, 222, textureX, textureY); // Box 413 vent
		bodyModel[360] = new ModelRendererTurbo(this, 277, 234, textureX, textureY); // Box 414
		bodyModel[361] = new ModelRendererTurbo(this, 477, 174, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[362] = new ModelRendererTurbo(this, 479, 169, textureX, textureY); // Box 5 aww
		bodyModel[363] = new ModelRendererTurbo(this, 477, 191, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[364] = new ModelRendererTurbo(this, 479, 186, textureX, textureY); // Box 5 aww
		bodyModel[365] = new ModelRendererTurbo(this, 236, 185, textureX, textureY); // Box 419 fan
		bodyModel[366] = new ModelRendererTurbo(this, 439, 195, textureX, textureY); // Box 412 cs
		bodyModel[367] = new ModelRendererTurbo(this, 451, 194, textureX, textureY); // Box 413 cs
		bodyModel[368] = new ModelRendererTurbo(this, 437, 187, textureX, textureY); // Box 86 cs
		bodyModel[369] = new ModelRendererTurbo(this, 432, 208, textureX, textureY); // Box 531 cs
		bodyModel[370] = new ModelRendererTurbo(this, 430, 180, textureX, textureY, "lamp"); // Box 71 cs glow speedometer
		bodyModel[371] = new ModelRendererTurbo(this, 430, 175, textureX, textureY); // Box 307 cs speedo
		bodyModel[372] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 168 numberboard front double
		bodyModel[373] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 167 numberboard front double
		bodyModel[374] = new ModelRendererTurbo(this, 483, 1, textureX, textureY, "lamp"); // Box 167 numberboard rear single
		bodyModel[375] = new ModelRendererTurbo(this, 483, 1, textureX, textureY, "lamp"); // Box 168 numberboard rear single
		bodyModel[376] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 168 numberboard rear double
		bodyModel[377] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 167 numberboard rear double
		bodyModel[378] = new ModelRendererTurbo(this, 368, 64, textureX, textureY); // Box 184 o2 generator
		bodyModel[379] = new ModelRendererTurbo(this, 230, 48, textureX, textureY); // Box 231 trolleybit
		bodyModel[380] = new ModelRendererTurbo(this, 258, 53, textureX, textureY); // Box 415
		bodyModel[381] = new ModelRendererTurbo(this, 245, 53, textureX, textureY, "lamp"); // Box 416 more sp numberboard
		bodyModel[382] = new ModelRendererTurbo(this, 284, 49, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[383] = new ModelRendererTurbo(this, 271, 49, textureX, textureY, "cull"); // Box 418 cull
		bodyModel[384] = new ModelRendererTurbo(this, 258, 49, textureX, textureY); // Box 419
		bodyModel[385] = new ModelRendererTurbo(this, 245, 49, textureX, textureY, "lamp"); // Box 420 more sp numberboard
		bodyModel[386] = new ModelRendererTurbo(this, 275, 131, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[387] = new ModelRendererTurbo(this, 275, 131, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[388] = new ModelRendererTurbo(this, 27, 169, textureX, textureY); // Box 426 flexicoil short skirt
		bodyModel[389] = new ModelRendererTurbo(this, 66, 169, textureX, textureY); // Box 427 flexicoil short skirt
		bodyModel[390] = new ModelRendererTurbo(this, 61, 169, textureX, textureY); // Box 428 flexicoil short skirt
		bodyModel[391] = new ModelRendererTurbo(this, 32, 169, textureX, textureY); // Box 429 flexicoil short skirt
		bodyModel[392] = new ModelRendererTurbo(this, 167, 100, textureX, textureY); // Box 268
		bodyModel[393] = new ModelRendererTurbo(this, 342, 117, textureX, textureY); // Box 33 tall stack
		bodyModel[394] = new ModelRendererTurbo(this, 185, 134, textureX, textureY); // Box 557
		bodyModel[395] = new ModelRendererTurbo(this, 188, 151, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[396] = new ModelRendererTurbo(this, 188, 151, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[397] = new ModelRendererTurbo(this, 187, 156, textureX, textureY); // Box 383
		bodyModel[398] = new ModelRendererTurbo(this, 197, 151, textureX, textureY); // Box 384
		bodyModel[399] = new ModelRendererTurbo(this, 197, 151, textureX, textureY); // Box 387
		bodyModel[400] = new ModelRendererTurbo(this, 188, 148, textureX, textureY, "lamp"); // Box 168 numberboard front double
		bodyModel[401] = new ModelRendererTurbo(this, 188, 148, textureX, textureY, "lamp"); // Box 167 numberboard front double
		bodyModel[402] = new ModelRendererTurbo(this, 196, 155, textureX, textureY); // Box 382
		bodyModel[403] = new ModelRendererTurbo(this, 157, 123, textureX, textureY); // Box 607
		bodyModel[404] = new ModelRendererTurbo(this, 175, 134, textureX, textureY, "lamp"); // Box 385 headlight f SP
		bodyModel[405] = new ModelRendererTurbo(this, 175, 134, textureX, textureY, "lamp"); // Box 386 headlight f SP
		bodyModel[406] = new ModelRendererTurbo(this, 179, 123, textureX, textureY, "lamp"); // Box 610 gyralight double front sp
		bodyModel[407] = new ModelRendererTurbo(this, 179, 123, textureX, textureY, "lamp"); // Box 611 gyralight double front sp
		bodyModel[408] = new ModelRendererTurbo(this, 168, 121, textureX, textureY); // Box 612
		bodyModel[409] = new ModelRendererTurbo(this, 168, 128, textureX, textureY); // Box 613
		bodyModel[410] = new ModelRendererTurbo(this, 177, 129, textureX, textureY, "lamp"); // Box 614 gyralight red front sp
		bodyModel[411] = new ModelRendererTurbo(this, 133, 237, textureX, textureY); // Box 409 vent
		bodyModel[412] = new ModelRendererTurbo(this, 154, 234, textureX, textureY); // Box 410 vent
		bodyModel[413] = new ModelRendererTurbo(this, 182, 237, textureX, textureY); // Box 411 vent
		bodyModel[414] = new ModelRendererTurbo(this, 219, 237, textureX, textureY); // Box 412 vent
		bodyModel[415] = new ModelRendererTurbo(this, 240, 234, textureX, textureY); // Box 414
		bodyModel[416] = new ModelRendererTurbo(this, 12, 238, textureX, textureY); // Box 409 vent
		bodyModel[417] = new ModelRendererTurbo(this, 33, 235, textureX, textureY); // Box 410 vent
		bodyModel[418] = new ModelRendererTurbo(this, 54, 238, textureX, textureY); // Box 411 vent
		bodyModel[419] = new ModelRendererTurbo(this, 75, 235, textureX, textureY); // Box 412 vent
		bodyModel[420] = new ModelRendererTurbo(this, 96, 238, textureX, textureY); // Box 414
		bodyModel[421] = new ModelRendererTurbo(this, 247, 183, textureX, textureY); // Box 655 re engineered
		bodyModel[422] = new ModelRendererTurbo(this, 252, 174, textureX, textureY); // Box 656 re engineered
		bodyModel[423] = new ModelRendererTurbo(this, 340, 107, textureX, textureY); // Box 538
		bodyModel[424] = new ModelRendererTurbo(this, 352, 110, textureX, textureY); // Box 539
		bodyModel[425] = new ModelRendererTurbo(this, 352, 121, textureX, textureY); // Box 540
		bodyModel[426] = new ModelRendererTurbo(this, 341, 113, textureX, textureY); // Box 240
		bodyModel[427] = new ModelRendererTurbo(this, 348, 94, textureX, textureY); // Box 523
		bodyModel[428] = new ModelRendererTurbo(this, 348, 94, textureX, textureY); // Box 524
		bodyModel[429] = new ModelRendererTurbo(this, 336, 100, textureX, textureY); // Box 525
		bodyModel[430] = new ModelRendererTurbo(this, 352, 115, textureX, textureY, "cull"); // Box 260 cull
		bodyModel[431] = new ModelRendererTurbo(this, 339, 95, textureX, textureY); // Box 285
		bodyModel[432] = new ModelRendererTurbo(this, 343, 78, textureX, textureY); // Box 515
		bodyModel[433] = new ModelRendererTurbo(this, 320, 78, textureX, textureY); // Box 526
		bodyModel[434] = new ModelRendererTurbo(this, 336, 71, textureX, textureY); // Box 171
		bodyModel[435] = new ModelRendererTurbo(this, 336, 66, textureX, textureY); // Box 174
		bodyModel[436] = new ModelRendererTurbo(this, 317, 71, textureX, textureY); // Box 580
		bodyModel[437] = new ModelRendererTurbo(this, 329, 78, textureX, textureY, "cull"); // Box 581 cull
		bodyModel[438] = new ModelRendererTurbo(this, 325, 66, textureX, textureY); // Box 583
		bodyModel[439] = new ModelRendererTurbo(this, 343, 84, textureX, textureY); // Box 310 nasa cap
		bodyModel[440] = new ModelRendererTurbo(this, 320, 84, textureX, textureY); // Box 311 nasa cap
		bodyModel[441] = new ModelRendererTurbo(this, 347, 139, textureX, textureY); // Box 398
		bodyModel[442] = new ModelRendererTurbo(this, 356, 139, textureX, textureY); // Box 399
		bodyModel[443] = new ModelRendererTurbo(this, 381, 196, textureX, textureY); // Box 629 dynamic brake
		bodyModel[444] = new ModelRendererTurbo(this, 412, 216, textureX, textureY); // Box 633 dynamic brake
		bodyModel[445] = new ModelRendererTurbo(this, 372, 197, textureX, textureY); // Box 278 dynamic brake fan
		bodyModel[446] = new ModelRendererTurbo(this, 383, 205, textureX, textureY); // Box 635 dynamic brake bit
		bodyModel[447] = new ModelRendererTurbo(this, 383, 205, textureX, textureY); // Box 636 dynamic brake bit
		bodyModel[448] = new ModelRendererTurbo(this, 390, 205, textureX, textureY); // Box 637 dynamic brake bit
		bodyModel[449] = new ModelRendererTurbo(this, 390, 205, textureX, textureY); // Box 638 dynamic brake bit
		bodyModel[450] = new ModelRendererTurbo(this, 379, 134, textureX, textureY); // Box 639 torpedo tube
		bodyModel[451] = new ModelRendererTurbo(this, 379, 129, textureX, textureY); // Box 640 torpedo tube
		bodyModel[452] = new ModelRendererTurbo(this, 379, 139, textureX, textureY); // Box 641 torpedo tube
		bodyModel[453] = new ModelRendererTurbo(this, 379, 118, textureX, textureY); // Box 642 torpedo tube
		bodyModel[454] = new ModelRendererTurbo(this, 379, 113, textureX, textureY); // Box 643 torpedo tube
		bodyModel[455] = new ModelRendererTurbo(this, 379, 123, textureX, textureY); // Box 644 torpedo tube
		bodyModel[456] = new ModelRendererTurbo(this, 425, 139, textureX, textureY); // Box 647
		bodyModel[457] = new ModelRendererTurbo(this, 425, 139, textureX, textureY); // Box 648
		bodyModel[458] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 649
		bodyModel[459] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 650
		bodyModel[460] = new ModelRendererTurbo(this, 346, 128, textureX, textureY); // Box 561 canfor bit
		bodyModel[461] = new ModelRendererTurbo(this, 370, 122, textureX, textureY); // Box 654 canfor bit
		bodyModel[462] = new ModelRendererTurbo(this, 419, 13, textureX, textureY); // Box 380
		bodyModel[463] = new ModelRendererTurbo(this, 408, 14, textureX, textureY); // Box 381
		bodyModel[464] = new ModelRendererTurbo(this, 408, 8, textureX, textureY); // Box 382
		bodyModel[465] = new ModelRendererTurbo(this, 224, 155, textureX, textureY, BoxName.commander); // Box 162 commander beacon
		bodyModel[466] = new ModelRendererTurbo(this, 223, 159, textureX, textureY); // Box 165
		bodyModel[467] = new ModelRendererTurbo(this, 232, 159, textureX, textureY); // Box 344
		bodyModel[468] = new ModelRendererTurbo(this, 233, 155, textureX, textureY, BoxName.commander); // Box 345 commander beacon
		bodyModel[469] = new ModelRendererTurbo(this, 222, 162, textureX, textureY, "cull"); // Box 346 cull
		bodyModel[470] = new ModelRendererTurbo(this, 231, 162, textureX, textureY, "cull"); // Box 347 cull
		bodyModel[471] = new ModelRendererTurbo(this, 186, 123, textureX, textureY); // Box 615
		bodyModel[472] = new ModelRendererTurbo(this, 204, 134, textureX, textureY, "lamp"); // Box 616 headlight r sp
		bodyModel[473] = new ModelRendererTurbo(this, 204, 134, textureX, textureY, "lamp"); // Box 617 headlight r sp
		bodyModel[474] = new ModelRendererTurbo(this, 206, 129, textureX, textureY, "lamp"); // Box 618 gyralight red sp rear
		bodyModel[475] = new ModelRendererTurbo(this, 197, 130, textureX, textureY); // Box 619
		bodyModel[476] = new ModelRendererTurbo(this, 197, 123, textureX, textureY); // Box 620
		bodyModel[477] = new ModelRendererTurbo(this, 208, 123, textureX, textureY, "lamp"); // Box 621 gyralight double sp rear
		bodyModel[478] = new ModelRendererTurbo(this, 208, 123, textureX, textureY, "lamp"); // Box 622 gyralight double sp rear
		bodyModel[479] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[480] = new ModelRendererTurbo(this, 275, 134, textureX, textureY, "lamp"); // Box 422 crl markerlight
		bodyModel[481] = new ModelRendererTurbo(this, 318, 87, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[482] = new ModelRendererTurbo(this, 341, 87, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[483] = new ModelRendererTurbo(this, 500, 174, textureX, textureY); // Box 296
		bodyModel[484] = new ModelRendererTurbo(this, 500, 181, textureX, textureY); // Box 296
		bodyModel[485] = new ModelRendererTurbo(this, 498, 174, textureX, textureY); // Box 296
		bodyModel[486] = new ModelRendererTurbo(this, 501, 169, textureX, textureY); // Box 296
		bodyModel[487] = new ModelRendererTurbo(this, 348, 29, textureX, textureY); // Box 85
		bodyModel[488] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[489] = new ModelRendererTurbo(this, 398, 37, textureX, textureY); // Box 409 commander base
		bodyModel[490] = new ModelRendererTurbo(this, 398, 33, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[491] = new ModelRendererTurbo(this, 441, 26, textureX, textureY); // Box 241
		bodyModel[492] = new ModelRendererTurbo(this, 441, 29, textureX, textureY, "cull"); // Box 270 cull
		bodyModel[493] = new ModelRendererTurbo(this, 441, 23, textureX, textureY); // Box 83
		bodyModel[494] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 84
		bodyModel[495] = new ModelRendererTurbo(this, 450, 20, textureX, textureY); // Box 85
		bodyModel[496] = new ModelRendererTurbo(this, 441, 20, textureX, textureY); // Box 85
		bodyModel[497] = new ModelRendererTurbo(this, 361, 139, textureX, textureY); // Box 398
		bodyModel[498] = new ModelRendererTurbo(this, 370, 139, textureX, textureY); // Box 399
		bodyModel[499] = new ModelRendererTurbo(this, 294, 104, textureX, textureY, "cull"); // Box 245 cull

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
		bodyModel[99].setRotationPoint(-10F, -21F, -1F);

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

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[123].setRotationPoint(26F, -7F, -3F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[124].setRotationPoint(26F, -7F, 3F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[125].setRotationPoint(23F, -13F, 3F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[126].setRotationPoint(23F, -13F, -3F);

		bodyModel[127].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 1096
		bodyModel[127].setRotationPoint(-23F, -7F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 1097
		bodyModel[128].setRotationPoint(-23F, -7F, 11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[129].setRotationPoint(7F, -7F, -11.01F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 43 cull
		bodyModel[130].setRotationPoint(9F, -1F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 1100 cull
		bodyModel[131].setRotationPoint(27F, -1F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[132].setRotationPoint(-4F, 3F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[133].setRotationPoint(-4F, 4F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[134].setRotationPoint(-4F, 4F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 air tank support
		bodyModel[135].setRotationPoint(-4F, 3.25F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[136].setRotationPoint(-12F, -17F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[137].setRotationPoint(-12F, -18F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[138].setRotationPoint(-11.75F, -16.5F, -0.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 651 yes this is a real bit
		bodyModel[139].setRotationPoint(9F, -3F, 7F);

		bodyModel[140].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[140].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[140].rotateAngleY = -0.78539816F;

		bodyModel[141].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[141].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[141].rotateAngleY = -0.78539816F;

		bodyModel[142].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[142].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[142].rotateAngleY = 0.78539816F;

		bodyModel[143].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[143].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[143].rotateAngleY = 0.78539816F;

		bodyModel[144].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 214
		bodyModel[144].setRotationPoint(-26.5F, -6F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 215
		bodyModel[145].setRotationPoint(-26.5F, -7F, -2F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 385
		bodyModel[146].setRotationPoint(8F, -21F, 0F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 386
		bodyModel[147].setRotationPoint(7.25F, -21F, -1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[148].setRotationPoint(-28F, -15F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[149].setRotationPoint(25F, -21F, -1F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[150].setRotationPoint(19F, -23.5F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[151].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[152].setRotationPoint(16F, -23F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[153].setRotationPoint(16F, -23F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[154].setRotationPoint(16F, -23F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[155].setRotationPoint(16F, -23F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[156].setRotationPoint(12F, -22.5F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[157].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[158].setRotationPoint(12F, -24F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[159].setRotationPoint(12F, -24F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[160].setRotationPoint(12F, -24F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[161].setRotationPoint(12F, -24F, -1F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 478 cull
		bodyModel[162].setRotationPoint(12F, -22.5F, -1F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[163].setRotationPoint(16.5F, -23.5F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[164].setRotationPoint(15.5F, -23.5F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[165].setRotationPoint(15.5F, -22.5F, -2F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[166].setRotationPoint(-10.5F, -21F, -1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[167].setRotationPoint(-10.5F, -22F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[168].setRotationPoint(-10.5F, -19F, -1.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[169].setRotationPoint(-10.5F, -22F, -1F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[170].setRotationPoint(9.25F, -20F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[171].setRotationPoint(-7F, -22F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[172].setRotationPoint(-12F, -22F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[173].setRotationPoint(-12.5F, -19F, -1.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull
		bodyModel[174].setRotationPoint(-31.5F, -4F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[175].setRotationPoint(-31.5F, -5F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 590
		bodyModel[176].setRotationPoint(-31.01F, -9F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[177].setRotationPoint(-31.01F, -9F, -8F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 396
		bodyModel[178].setRotationPoint(-30.5F, -1F, -2F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 260 cull
		bodyModel[179].setRotationPoint(-10.5F, -22F, -1.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[180].setRotationPoint(13F, -22.5F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[181].setRotationPoint(13F, -23.5F, -0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 263 cull
		bodyModel[182].setRotationPoint(30.5F, -4F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264 cull
		bodyModel[183].setRotationPoint(30.5F, -5F, -2F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 268
		bodyModel[184].setRotationPoint(29.5F, -1F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 269
		bodyModel[185].setRotationPoint(12F, -23.5F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 270 cull
		bodyModel[186].setRotationPoint(9F, -19F, -0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[187].setRotationPoint(7.25F, -21F, -0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 0, 14, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[188].setRotationPoint(-26.75F, -6F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 273
		bodyModel[189].setRotationPoint(-31.02F, 4F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[190].setRotationPoint(-31.02F, 4F, 6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[191].setRotationPoint(31.02F, 4F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[192].setRotationPoint(31.02F, 4F, -9F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[193].setRotationPoint(-34F, 9F, -10F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 179
		bodyModel[194].setRotationPoint(31.01F, 9F, -10F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[195].setRotationPoint(9.5F, -23.25F, 0.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[196].setRotationPoint(11F, -22.5F, -0.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[197].setRotationPoint(8.5F, -23.5F, -0.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[198].setRotationPoint(9F, -23.25F, -1.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[199].setRotationPoint(10F, -24.5F, -1F);

		bodyModel[200].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[200].setRotationPoint(10F, -24.5F, 0.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[201].setRotationPoint(-10F, -17F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 287 compressed pipework
		bodyModel[202].setRotationPoint(-5F, 3F, 11.01F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 cull
		bodyModel[203].setRotationPoint(-33.01F, 7F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[204].setRotationPoint(31.01F, 7F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[205].setRotationPoint(-31.5F, 0F, 4.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[206].setRotationPoint(-31.5F, 0F, -6.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[207].setRotationPoint(-31.75F, 0F, 4.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[208].setRotationPoint(-31.75F, 0F, -6.75F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[209].setRotationPoint(-31F, -2F, 3.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[210].setRotationPoint(-31F, -2F, -5.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[211].setRotationPoint(-31.25F, -2F, 3.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[212].setRotationPoint(-31.25F, -2F, -5.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[213].setRotationPoint(30.5F, 0F, -6.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[214].setRotationPoint(30.75F, 0F, -6.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[215].setRotationPoint(30.75F, 0F, 4.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[216].setRotationPoint(30.5F, 0F, 4.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[217].setRotationPoint(30F, -2F, -5.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[218].setRotationPoint(30.25F, -2F, -5.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[219].setRotationPoint(30.25F, -2F, 3.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[220].setRotationPoint(30F, -2F, 3.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[221].setRotationPoint(14F, -17F, 11F);
		bodyModel[221].rotateAngleX = 0.26179939F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[222].setRotationPoint(14F, -17.25F, -11.97F);
		bodyModel[222].rotateAngleX = -0.26179939F;

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[223].setRotationPoint(11.25F, -21.4F, 4.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[224].setRotationPoint(9.25F, -22.15F, 3.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[225].setRotationPoint(10.75F, -22.4F, 4.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[226].setRotationPoint(9.75F, -22.15F, 5.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[227].setRotationPoint(-35F, 7F, 0F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[228].setRotationPoint(-35F, 7F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[229].setRotationPoint(-34F, 6F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[230].setRotationPoint(-34F, 5F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[231].setRotationPoint(-34F, 6F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[232].setRotationPoint(-34F, 5F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[233].setRotationPoint(-34F, 4F, 2F);

		bodyModel[234].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[234].setRotationPoint(-34F, 4F, -8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 305
		bodyModel[235].setRotationPoint(34F, 7F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[236].setRotationPoint(34F, 7F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 307
		bodyModel[237].setRotationPoint(33F, 6F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 308
		bodyModel[238].setRotationPoint(33F, 6F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 309
		bodyModel[239].setRotationPoint(33F, 5F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 310
		bodyModel[240].setRotationPoint(33F, 4F, 2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[241].setRotationPoint(33F, 5F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[242].setRotationPoint(33F, 4F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[243].setRotationPoint(-34F, 6F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[244].setRotationPoint(-34F, 6F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 315
		bodyModel[245].setRotationPoint(33F, 6F, 0F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 316
		bodyModel[246].setRotationPoint(33F, 6F, -10F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[247].setRotationPoint(14F, -16F, -12F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[248].setRotationPoint(14F, -16F, 11F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 362 ane shit
		bodyModel[249].setRotationPoint(-27F, -17F, -2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 ane front light gyra
		bodyModel[250].setRotationPoint(-27.25F, -17F, -2F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 ane front light gyra
		bodyModel[251].setRotationPoint(-27.25F, -17F, 0F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 365 ane shit
		bodyModel[252].setRotationPoint(23F, -23F, -2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 366 ane rear light gyra
		bodyModel[253].setRotationPoint(24.25F, -23F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ane rear light gyra
		bodyModel[254].setRotationPoint(24.25F, -23F, 0F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[255].setRotationPoint(8.5F, -20.5F, -2.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[256].setRotationPoint(8.5F, -20.5F, 1.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[257].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[258].setRotationPoint(7.5F, -21F, 0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[259].setRotationPoint(7.5F, -21F, -0.5F);

		bodyModel[260].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 354 cull
		bodyModel[260].setRotationPoint(-10.5F, -15F, 5F);
		bodyModel[260].rotateAngleY = 0.78539816F;

		bodyModel[261].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 355 cull
		bodyModel[261].setRotationPoint(-10.5F, -15F, -5F);
		bodyModel[261].rotateAngleY = -0.78539816F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356 front ditchlight canook
		bodyModel[262].setRotationPoint(-31.75F, -2F, -8.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 front ditchlight canook
		bodyModel[263].setRotationPoint(-31.75F, -2F, 6.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[264].setRotationPoint(-31.25F, -1F, -8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[265].setRotationPoint(-31.25F, -1F, 7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[266].setRotationPoint(30.75F, -1F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 361 rear ditchlight canook
		bodyModel[267].setRotationPoint(31.25F, -2F, -8.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[268].setRotationPoint(30.75F, -1F, 7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 rear ditchlight canook
		bodyModel[269].setRotationPoint(31.25F, -2F, 6.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[270].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[271].setRotationPoint(-27.6F, -14F, -7.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[272].setRotationPoint(-26.75F, -14F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[273].setRotationPoint(-26.75F, -12.75F, -7.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 372
		bodyModel[274].setRotationPoint(-24F, -15.26F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, -1.25F, 0F, -11F, -1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -11F, 1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[275].setRotationPoint(-24F, -15.26F, -8F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374 mu box thing
		bodyModel[276].setRotationPoint(-31.5F, -3F, 2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[277].setRotationPoint(30F, -4F, 3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[278].setRotationPoint(30.5F, -3.5F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[279].setRotationPoint(-31F, -4F, -5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[280].setRotationPoint(-31.5F, -3.5F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[281].setRotationPoint(27F, -13F, -3F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[282].setRotationPoint(27F, -13F, 3F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 523
		bodyModel[283].setRotationPoint(-4F, 3F, -10.47F);
		bodyModel[283].rotateAngleX = -0.78539816F;

		bodyModel[284].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 510
		bodyModel[284].setRotationPoint(-4F, 3F, 10.47F);
		bodyModel[284].rotateAngleX = 0.78539816F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 511 compressed pipework
		bodyModel[285].setRotationPoint(-5F, 3F, -11.01F);

		bodyModel[286].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 512
		bodyModel[286].setRotationPoint(4F, 3.5F, -10.75F);
		bodyModel[286].rotateAngleX = -0.52359878F;

		bodyModel[287].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 513
		bodyModel[287].setRotationPoint(4F, 3.5F, 10.75F);
		bodyModel[287].rotateAngleX = 0.52359878F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[288].setRotationPoint(-26.9F, -16F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[289].setRotationPoint(-26.9F, -17F, -0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[290].setRotationPoint(23.9F, -22F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[291].setRotationPoint(23.9F, -23F, -0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 8, 8, 0F); // Box 297 ec
		bodyModel[292].setRotationPoint(12F, -12F, -7F);

		bodyModel[293].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 302
		bodyModel[293].setRotationPoint(12F, -5F, 3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 586 cs2
		bodyModel[294].setRotationPoint(11.5F, -11F, 5F);
		bodyModel[294].rotateAngleY = -0.80285146F;

		bodyModel[295].addShapeBox(0F, 0F, 1F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587 cs2
		bodyModel[295].setRotationPoint(11.5F, -12F, 5F);
		bodyModel[295].rotateAngleY = -0.80285146F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 588 cs2
		bodyModel[296].setRotationPoint(11.5F, -14F, 5F);
		bodyModel[296].rotateAngleY = -0.80285146F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 589 cs2
		bodyModel[297].setRotationPoint(11.5F, -12F, 5F);
		bodyModel[297].rotateAngleY = -0.80285146F;

		bodyModel[298].addBox(5F, 0F, -5F, 3, 8, 3, 0F); // Box 590 cs2
		bodyModel[298].setRotationPoint(11.25F, -12F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 275 cs2 speedo glow
		bodyModel[299].setRotationPoint(12F, -17.5F, 6F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 397 hb
		bodyModel[300].setRotationPoint(21.49F, -12F, 1F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 398 hb
		bodyModel[301].setRotationPoint(21.5F, -10F, 3F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 529
		bodyModel[302].setRotationPoint(27F, 4F, 6F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 530
		bodyModel[303].setRotationPoint(27F, 2F, 6F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 531
		bodyModel[304].setRotationPoint(27F, 4F, 7.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 532
		bodyModel[305].setRotationPoint(27F, 6F, 7.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 533
		bodyModel[306].setRotationPoint(27F, 6F, 9F);

		bodyModel[307].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 534
		bodyModel[307].setRotationPoint(27F, 8F, 9F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 535
		bodyModel[308].setRotationPoint(27F, 8F, -11F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 536
		bodyModel[309].setRotationPoint(27F, 6F, -9F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 537
		bodyModel[310].setRotationPoint(27F, 6F, -9.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 538
		bodyModel[311].setRotationPoint(27F, 4F, -7.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 539
		bodyModel[312].setRotationPoint(27F, 4F, -8F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 540
		bodyModel[313].setRotationPoint(27F, 2F, -6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[314].setRotationPoint(-4F, 4F, 7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[315].setRotationPoint(-4F, 3F, 8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[316].setRotationPoint(-4F, 4F, 10F);

		bodyModel[317].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 544
		bodyModel[317].setRotationPoint(31.01F, -9F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[318].setRotationPoint(31.01F, -9F, -8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 547
		bodyModel[319].setRotationPoint(31.01F, -9F, 3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[320].setRotationPoint(31.01F, -7F, 10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[321].setRotationPoint(31.01F, -7F, -11F);

		bodyModel[322].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 554
		bodyModel[322].setRotationPoint(31F, -0.5F, -10F);

		bodyModel[323].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 555
		bodyModel[323].setRotationPoint(31F, -7F, -0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 556 mu box thing
		bodyModel[324].setRotationPoint(30.5F, -3F, -3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 557
		bodyModel[325].setRotationPoint(12F, -20F, 7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[326].setRotationPoint(12F, -20F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[327].setRotationPoint(-27.25F, -14.5F, 6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[328].setRotationPoint(-27.6F, -14F, 6.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[329].setRotationPoint(-26.75F, -14F, 6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[330].setRotationPoint(-26.75F, -12.75F, 6.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[331].setRotationPoint(9F, -21.5F, -1.5F);

		bodyModel[332].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 570
		bodyModel[332].setRotationPoint(23F, -16F, -11.5F);
		bodyModel[332].rotateAngleY = -0.52359878F;

		bodyModel[333].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 571
		bodyModel[333].setRotationPoint(23F, -16F, -10.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[334].setRotationPoint(-31F, -9F, -10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 574
		bodyModel[335].setRotationPoint(-31F, -9F, 3F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 575
		bodyModel[336].setRotationPoint(31F, -9F, 3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[337].setRotationPoint(31F, -9F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[338].setRotationPoint(16F, -26F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[339].setRotationPoint(18F, -26F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[340].setRotationPoint(15F, -25F, 9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[341].setRotationPoint(18F, -25F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 283
		bodyModel[342].setRotationPoint(17F, -23F, 8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 284
		bodyModel[343].setRotationPoint(15F, -23F, 8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 1F); // Box 293
		bodyModel[344].setRotationPoint(18F, -25F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 294
		bodyModel[345].setRotationPoint(15F, -25F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 295
		bodyModel[346].setRotationPoint(16F, -26F, -11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[347].setRotationPoint(18F, -26F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F); // Box 360
		bodyModel[348].setRotationPoint(17F, -23F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F); // Box 361
		bodyModel[349].setRotationPoint(15F, -23F, -11F);

		bodyModel[350].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 404
		bodyModel[350].setRotationPoint(23F, -21.5F, -4F);

		bodyModel[351].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[351].setRotationPoint(23F, -20F, 0F);

		bodyModel[352].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, 2F, 0F, -0.5F, 2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 406
		bodyModel[352].setRotationPoint(23F, -18F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 407
		bodyModel[353].setRotationPoint(23F, -20F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 408
		bodyModel[354].setRotationPoint(23F, -18F, -13F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[355].setRotationPoint(1F, -7F, -8F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[356].setRotationPoint(-2F, -7F, -8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[357].setRotationPoint(-5F, -7F, -8F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[358].setRotationPoint(-8F, -7F, -8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 413 vent
		bodyModel[359].setRotationPoint(24F, -3F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[360].setRotationPoint(-11F, -7F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[361].setRotationPoint(14F, -16F, 10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[362].setRotationPoint(14F, -17F, 10F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[363].setRotationPoint(14F, -16F, -15F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5 aww
		bodyModel[364].setRotationPoint(14F, -17F, -13F);

		bodyModel[365].addBox(0F, 0F, 0F, 0, 12, 12, 0F); // Box 419 fan
		bodyModel[365].setRotationPoint(-25.02F, -11.5F, -6F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[366].setRotationPoint(17.95F, -14F, 2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[367].setRotationPoint(11.25F, -12F, 4F);
		bodyModel[367].rotateAngleY = -0.45378561F;

		bodyModel[368].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[368].setRotationPoint(11.25F, -14F, 4F);
		bodyModel[368].rotateAngleY = -0.45378561F;

		bodyModel[369].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[369].setRotationPoint(11.25F, -8F, 4F);
		bodyModel[369].rotateAngleY = -0.45378561F;

		bodyModel[370].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 cs glow speedometer
		bodyModel[370].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[370].rotateAngleY = 0.78539816F;

		bodyModel[371].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 cs speedo
		bodyModel[371].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[371].rotateAngleY = 0.78539816F;

		bodyModel[372].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front double
		bodyModel[372].setRotationPoint(-27F, -14F, 1F);
		bodyModel[372].rotateAngleY = 0.4712389F;

		bodyModel[373].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front double
		bodyModel[373].setRotationPoint(-27F, -14F, -1F);
		bodyModel[373].rotateAngleY = -0.4712389F;

		bodyModel[374].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear single
		bodyModel[374].setRotationPoint(25F, -20F, -1.5F);
		bodyModel[374].rotateAngleY = 0.4712389F;

		bodyModel[375].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear single
		bodyModel[375].setRotationPoint(25F, -20F, 1.5F);
		bodyModel[375].rotateAngleY = -0.4712389F;

		bodyModel[376].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear double
		bodyModel[376].setRotationPoint(25F, -20F, 1F);
		bodyModel[376].rotateAngleY = -0.4712389F;

		bodyModel[377].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear double
		bodyModel[377].setRotationPoint(25F, -20F, -1F);
		bodyModel[377].rotateAngleY = 0.4712389F;

		bodyModel[378].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[378].setRotationPoint(14.5F, -22.75F, -4F);

		bodyModel[379].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 231 trolleybit
		bodyModel[379].setRotationPoint(12F, -22.5F, -1.5F);

		bodyModel[380].addBox(-2.5F, 0F, -1F, 5, 2, 1, 0F); // Box 415
		bodyModel[380].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[380].rotateAngleY = -1.04719755F;

		bodyModel[381].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 416 more sp numberboard
		bodyModel[381].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[381].rotateAngleY = -1.04719755F;

		bodyModel[382].addBox(-2.5F, 0F, -1F, 5, 1, 1, 0F); // Box 417 cull
		bodyModel[382].setRotationPoint(-22.75F, -15F, -5F);
		bodyModel[382].rotateAngleY = -1.04719755F;

		bodyModel[383].addBox(-2.5F, 0F, 0F, 5, 1, 1, 0F); // Box 418 cull
		bodyModel[383].setRotationPoint(-22.75F, -15F, 5F);
		bodyModel[383].rotateAngleY = 1.04719755F;

		bodyModel[384].addBox(-2.5F, 0F, 0F, 5, 2, 1, 0F); // Box 419
		bodyModel[384].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[384].rotateAngleY = 1.04719755F;

		bodyModel[385].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 420 more sp numberboard
		bodyModel[385].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[385].rotateAngleY = 1.04719755F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[386].setRotationPoint(22.5F, -19F, -7.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[387].setRotationPoint(22.5F, -19F, 6.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 426 flexicoil short skirt
		bodyModel[388].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 427 flexicoil short skirt
		bodyModel[389].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 428 flexicoil short skirt
		bodyModel[390].setRotationPoint(25F, 2F, 10.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 429 flexicoil short skirt
		bodyModel[391].setRotationPoint(25F, 2F, -10.75F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 268
		bodyModel[392].setRotationPoint(26.5F, -1F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33 tall stack
		bodyModel[393].setRotationPoint(0F, -21F, -1F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.95F, 0.25F, 0F, 0.95F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 557
		bodyModel[394].setRotationPoint(-25.75F, -21F, -2.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[395].setRotationPoint(-28F, -21F, -0.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[396].setRotationPoint(-28F, -19.5F, -0.75F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[397].setRotationPoint(-27.75F, -21F, -1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[398].setRotationPoint(-27.75F, -20.5F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387
		bodyModel[399].setRotationPoint(-27.75F, -20.5F, 1F);

		bodyModel[400].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front double
		bodyModel[400].setRotationPoint(-27.75F, -20F, 1F);
		bodyModel[400].rotateAngleY = 0.4712389F;

		bodyModel[401].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front double
		bodyModel[401].setRotationPoint(-27.75F, -20F, -1F);
		bodyModel[401].rotateAngleY = -0.4712389F;

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[402].setRotationPoint(-26.75F, -21F, -1.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 607
		bodyModel[403].setRotationPoint(-26F, -18F, -2F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f SP
		bodyModel[404].setRotationPoint(-26.25F, -14F, 0F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f SP
		bodyModel[405].setRotationPoint(-26.25F, -14F, -2F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 610 gyralight double front sp
		bodyModel[406].setRotationPoint(-27.25F, -18F, -2F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 611 gyralight double front sp
		bodyModel[407].setRotationPoint(-27.25F, -18F, 0F);

		bodyModel[408].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 612
		bodyModel[408].setRotationPoint(-27F, -18F, -2F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 613
		bodyModel[409].setRotationPoint(-26.75F, -16F, -1.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 614 gyralight red front sp
		bodyModel[410].setRotationPoint(-27F, -16F, -1F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[411].setRotationPoint(1F, -11F, -8F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[412].setRotationPoint(-2F, -11F, -8F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[413].setRotationPoint(-5F, -11F, -8F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[414].setRotationPoint(-8F, -11F, -8F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[415].setRotationPoint(-11F, -11F, -8F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[416].setRotationPoint(1F, -3F, -8F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[417].setRotationPoint(-2F, -3F, -8F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[418].setRotationPoint(-5F, -3F, -8F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[419].setRotationPoint(-8F, -3F, -8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[420].setRotationPoint(-11F, -3F, -8F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 3F, 1F, -0.5F, 3F, 1F, -0.5F, 3F, 1F, -0.5F, 3F); // Box 655 re engineered
		bodyModel[421].setRotationPoint(-23F, -16.5F, -5F);

		bodyModel[422].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 656 re engineered
		bodyModel[422].setRotationPoint(-22F, -17.25F, -3.5F);

		bodyModel[423].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[423].setRotationPoint(-0.5F, -21F, -1.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[424].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[425].setRotationPoint(-0.5F, -19F, -1.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[426].setRotationPoint(-0.5F, -22F, -1F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[427].setRotationPoint(3F, -22F, -0.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[428].setRotationPoint(-2F, -22F, -0.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[429].setRotationPoint(-2.5F, -19F, -1.5F);

		bodyModel[430].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 260 cull
		bodyModel[430].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[431].setRotationPoint(0F, -17F, 0F);

		bodyModel[432].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[432].setRotationPoint(0F, -17F, -1F);

		bodyModel[433].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[433].setRotationPoint(-10F, -17F, -1F);

		bodyModel[434].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 171
		bodyModel[434].setRotationPoint(-3.5F, -19F, -1.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[435].setRotationPoint(-3.5F, -20F, -1.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 580
		bodyModel[436].setRotationPoint(-10.5F, -19F, -1.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 581 cull
		bodyModel[437].setRotationPoint(-5.5F, -16.5F, -1.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 583
		bodyModel[438].setRotationPoint(-6.5F, -20F, -1.5F);

		bodyModel[439].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[439].setRotationPoint(0.75F, -22.5F, -1F);
		bodyModel[439].rotateAngleZ = -0.87266463F;

		bodyModel[440].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[440].setRotationPoint(-9.25F, -22.5F, -1F);
		bodyModel[440].rotateAngleZ = -0.87266463F;

		bodyModel[441].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 398
		bodyModel[441].setRotationPoint(0F, -16F, 5F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[442].setRotationPoint(2F, -15F, 5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 629 dynamic brake
		bodyModel[443].setRotationPoint(4F, -19F, -8F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 633 dynamic brake
		bodyModel[444].setRotationPoint(4F, -20F, -8F);

		bodyModel[445].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278 dynamic brake fan
		bodyModel[445].setRotationPoint(4.5F, -20.75F, -3F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 635 dynamic brake bit
		bodyModel[446].setRotationPoint(4.5F, -19F, -8F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 636 dynamic brake bit
		bodyModel[447].setRotationPoint(8.5F, -19F, -7.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 637 dynamic brake bit
		bodyModel[448].setRotationPoint(8.5F, -19F, 6.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 638 dynamic brake bit
		bodyModel[449].setRotationPoint(4.5F, -19F, 7F);

		bodyModel[450].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Box 639 torpedo tube
		bodyModel[450].setRotationPoint(-12.5F, -17F, -6F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640 torpedo tube
		bodyModel[451].setRotationPoint(-12.5F, -18F, -6F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 641 torpedo tube
		bodyModel[452].setRotationPoint(-12.5F, -16F, -6F);

		bodyModel[453].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Box 642 torpedo tube
		bodyModel[453].setRotationPoint(-12.5F, -17F, 3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643 torpedo tube
		bodyModel[454].setRotationPoint(-12.5F, -18F, 3F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 644 torpedo tube
		bodyModel[455].setRotationPoint(-12.5F, -16F, 3F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 647
		bodyModel[456].setRotationPoint(-10.5F, -16F, -5.5F);

		bodyModel[457].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 648
		bodyModel[457].setRotationPoint(0.5F, -16F, -5.5F);

		bodyModel[458].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 649
		bodyModel[458].setRotationPoint(0.5F, -16F, 3.5F);

		bodyModel[459].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 650
		bodyModel[459].setRotationPoint(-10.5F, -16F, 3.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 561 canfor bit
		bodyModel[460].setRotationPoint(-10.5F, -20F, -1.5F);

		bodyModel[461].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 654 canfor bit
		bodyModel[461].setRotationPoint(-12.5F, -21F, -1F);

		bodyModel[462].addBox(0F, 0F, -2F, 6, 2, 4, 0F); // Box 380
		bodyModel[462].setRotationPoint(16.5F, -22.5F, -5.65F);
		bodyModel[462].rotateAngleX = 0.29670597F;

		bodyModel[463].addShapeBox(-1F, 1F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 381
		bodyModel[463].setRotationPoint(16.5F, -22.5F, -5.65F);
		bodyModel[463].rotateAngleX = 0.29670597F;

		bodyModel[464].addShapeBox(-1F, 0F, -2F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[464].setRotationPoint(16.5F, -22.5F, -5.65F);
		bodyModel[464].rotateAngleX = 0.29670597F;

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[465].setRotationPoint(12F, -23.5F, -6.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[466].setRotationPoint(12.15F, -22.5F, -6.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 344
		bodyModel[467].setRotationPoint(12.15F, -22.5F, 5.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 345 commander beacon
		bodyModel[468].setRotationPoint(12F, -23.5F, 5.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 346 cull
		bodyModel[469].setRotationPoint(11.5F, -21.5F, -7F);

		bodyModel[470].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 347 cull
		bodyModel[470].setRotationPoint(11.5F, -21.5F, 5F);

		bodyModel[471].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 615
		bodyModel[471].setRotationPoint(23F, -24F, -2F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 616 headlight r sp
		bodyModel[472].setRotationPoint(23.25F, -20F, -2F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 617 headlight r sp
		bodyModel[473].setRotationPoint(23.25F, -20F, 0F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 618 gyralight red sp rear
		bodyModel[474].setRotationPoint(24F, -22F, -1F);

		bodyModel[475].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 619
		bodyModel[475].setRotationPoint(23.75F, -22F, -1.5F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 620
		bodyModel[476].setRotationPoint(24F, -24F, -2F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 621 gyralight double sp rear
		bodyModel[477].setRotationPoint(24.25F, -24F, 0F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 622 gyralight double sp rear
		bodyModel[478].setRotationPoint(24.25F, -24F, -2F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[479].setRotationPoint(-25.5F, -13F, -7.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[480].setRotationPoint(-25.5F, -13F, 6.5F);

		bodyModel[481].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 419 cull
		bodyModel[481].setRotationPoint(-10.5F, -23F, -1.5F);

		bodyModel[482].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 420 cull
		bodyModel[482].setRotationPoint(-0.5F, -23F, -1.5F);

		bodyModel[483].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 296
		bodyModel[483].setRotationPoint(23F, -19F, 11F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[484].setRotationPoint(23F, -12F, 11F);

		bodyModel[485].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 296
		bodyModel[485].setRotationPoint(20F, -20F, 12.5F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 296
		bodyModel[486].setRotationPoint(22F, -21F, 11F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[487].setRotationPoint(8F, -21F, -0.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[488].setRotationPoint(-28.75F, -21F, -1F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[489].setRotationPoint(21.9F, -22.5F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[490].setRotationPoint(21.9F, -23.5F, -0.5F);

		bodyModel[491].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[491].setRotationPoint(23.75F, -20F, -0.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 270 cull
		bodyModel[492].setRotationPoint(23F, -19F, -0.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[493].setRotationPoint(23.25F, -21F, 0.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[494].setRotationPoint(23F, -21F, -1.5F);

		bodyModel[495].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[495].setRotationPoint(23F, -21F, -0.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[496].setRotationPoint(23.5F, -21F, -0.5F);

		bodyModel[497].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 398
		bodyModel[497].setRotationPoint(18F, -21.5F, -8F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 399
		bodyModel[498].setRotationPoint(20F, -20.5F, -8F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 cull
		bodyModel[499].setRotationPoint(-12F, -18F, -1.55F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 23, 46, textureX, textureY); // Box 436 mu cable confuckery
		bodyModel[501] = new ModelRendererTurbo(this, 123, 46, textureX, textureY); // Box 437 mu cable confuckery

		bodyModel[500].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 436 mu cable confuckery
		bodyModel[500].setRotationPoint(-31.03F, 2F, -8F);

		bodyModel[501].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 437 mu cable confuckery
		bodyModel[501].setRotationPoint(31.03F, 2F, -8F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeAnew theTypeA = new ModelTypeAnew();
	ModelBluntTruck fatBlunt = new ModelBluntTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1342) {
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
		} else if (GetColor(entity) == 123) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blunttruck_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.95, 0.27, 0);
			fatBlunt.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			fatBlunt.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else{
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