//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SW10
// Model Creator: bidalabochie
// Created on: 23.01.2024 - 20:23:41
// Last changed on: 23.01.2024 - 20:23:41

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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

public class ModelSW10 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[350];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 89
		bodyModel[1] = new ModelRendererTurbo(this, 18, 192, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 28, 173, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 17, 59, textureX, textureY); // Box 166
		bodyModel[6] = new ModelRendererTurbo(this, 59, 76, textureX, textureY); // Box 167
		bodyModel[7] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 170
		bodyModel[8] = new ModelRendererTurbo(this, 49, 156, textureX, textureY); // Box 489
		bodyModel[9] = new ModelRendererTurbo(this, 16, 97, textureX, textureY); // Box 546
		bodyModel[10] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 389
		bodyModel[11] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 390
		bodyModel[12] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 391
		bodyModel[13] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 392
		bodyModel[14] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 393
		bodyModel[15] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 394
		bodyModel[16] = new ModelRendererTurbo(this, 36, 156, textureX, textureY); // Box 135
		bodyModel[17] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 53
		bodyModel[18] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 146
		bodyModel[19] = new ModelRendererTurbo(this, 63, 173, textureX, textureY); // Box 184
		bodyModel[20] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 388
		bodyModel[21] = new ModelRendererTurbo(this, 49, 148, textureX, textureY); // Box 490
		bodyModel[22] = new ModelRendererTurbo(this, 36, 148, textureX, textureY); // Box 491
		bodyModel[23] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 40, 190, textureX, textureY); // Box 196
		bodyModel[25] = new ModelRendererTurbo(this, 40, 188, textureX, textureY); // Box 199
		bodyModel[26] = new ModelRendererTurbo(this, 290, 164, textureX, textureY); // Box 5 hood
		bodyModel[27] = new ModelRendererTurbo(this, 298, 153, textureX, textureY); // Box 19
		bodyModel[28] = new ModelRendererTurbo(this, 298, 142, textureX, textureY); // Box 20
		bodyModel[29] = new ModelRendererTurbo(this, 381, 166, textureX, textureY); // Box 107
		bodyModel[30] = new ModelRendererTurbo(this, 389, 155, textureX, textureY); // Box 396
		bodyModel[31] = new ModelRendererTurbo(this, 389, 144, textureX, textureY); // Box 397
		bodyModel[32] = new ModelRendererTurbo(this, 457, 84, textureX, textureY); // Box 9
		bodyModel[33] = new ModelRendererTurbo(this, 429, 109, textureX, textureY); // Box 18
		bodyModel[34] = new ModelRendererTurbo(this, 489, 84, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 478, 89, textureX, textureY); // Box 61 door swign right
		bodyModel[36] = new ModelRendererTurbo(this, 412, 70, textureX, textureY); // Box 125
		bodyModel[37] = new ModelRendererTurbo(this, 361, 92, textureX, textureY); // Box 9
		bodyModel[38] = new ModelRendererTurbo(this, 434, 92, textureX, textureY); // Box 10
		bodyModel[39] = new ModelRendererTurbo(this, 384, 75, textureX, textureY); // Box 15
		bodyModel[40] = new ModelRendererTurbo(this, 423, 89, textureX, textureY); // Box 315 door swing right
		bodyModel[41] = new ModelRendererTurbo(this, 454, 52, textureX, textureY); // Box 371
		bodyModel[42] = new ModelRendererTurbo(this, 454, 70, textureX, textureY); // Box 372
		bodyModel[43] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 373
		bodyModel[44] = new ModelRendererTurbo(this, 473, 61, textureX, textureY); // Box 39
		bodyModel[45] = new ModelRendererTurbo(this, 472, 55, textureX, textureY); // Box 347
		bodyModel[46] = new ModelRendererTurbo(this, 473, 48, textureX, textureY); // Box 348
		bodyModel[47] = new ModelRendererTurbo(this, 423, 60, textureX, textureY); // Box 411
		bodyModel[48] = new ModelRendererTurbo(this, 423, 42, textureX, textureY); // Box 412
		bodyModel[49] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 133
		bodyModel[53] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 134
		bodyModel[54] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 337
		bodyModel[55] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 338
		bodyModel[56] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 339
		bodyModel[57] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 340
		bodyModel[58] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 341
		bodyModel[59] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 342
		bodyModel[60] = new ModelRendererTurbo(this, 449, 170, textureX, textureY); // Box 188
		bodyModel[61] = new ModelRendererTurbo(this, 442, 170, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 449, 168, textureX, textureY); // Box 358
		bodyModel[63] = new ModelRendererTurbo(this, 442, 168, textureX, textureY); // Box 359
		bodyModel[64] = new ModelRendererTurbo(this, 275, 153, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[65] = new ModelRendererTurbo(this, 275, 153, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[66] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 371
		bodyModel[67] = new ModelRendererTurbo(this, 230, 8, textureX, textureY); // Box 372
		bodyModel[68] = new ModelRendererTurbo(this, 230, 25, textureX, textureY); // Box 373
		bodyModel[69] = new ModelRendererTurbo(this, 230, 23, textureX, textureY); // Box 374
		bodyModel[70] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 375
		bodyModel[71] = new ModelRendererTurbo(this, 238, 8, textureX, textureY); // Box 376
		bodyModel[72] = new ModelRendererTurbo(this, 238, 23, textureX, textureY); // Box 377
		bodyModel[73] = new ModelRendererTurbo(this, 453, 62, textureX, textureY); // Box 378
		bodyModel[74] = new ModelRendererTurbo(this, 411, 44, textureX, textureY); // Box 379
		bodyModel[75] = new ModelRendererTurbo(this, 453, 44, textureX, textureY); // Box 380
		bodyModel[76] = new ModelRendererTurbo(this, 411, 62, textureX, textureY); // Box 381
		bodyModel[77] = new ModelRendererTurbo(this, 283, 157, textureX, textureY); // Box 382
		bodyModel[78] = new ModelRendererTurbo(this, 274, 158, textureX, textureY); // Box 383
		bodyModel[79] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 384
		bodyModel[80] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 387
		bodyModel[81] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 388
		bodyModel[82] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 389
		bodyModel[83] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 390
		bodyModel[84] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 391
		bodyModel[85] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 392
		bodyModel[86] = new ModelRendererTurbo(this, 424, 63, textureX, textureY); // Box 395
		bodyModel[87] = new ModelRendererTurbo(this, 424, 45, textureX, textureY); // Box 396
		bodyModel[88] = new ModelRendererTurbo(this, 482, 25, textureX, textureY, "lamp"); // Box 171 headlight front 2beam
		bodyModel[89] = new ModelRendererTurbo(this, 482, 25, textureX, textureY, "lamp"); // Box 172 headlight front 2beam
		bodyModel[90] = new ModelRendererTurbo(this, 490, 29, textureX, textureY); // Box 382
		bodyModel[91] = new ModelRendererTurbo(this, 481, 30, textureX, textureY); // Box 383
		bodyModel[92] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 384
		bodyModel[93] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 387
		bodyModel[94] = new ModelRendererTurbo(this, 464, 49, textureX, textureY); // Box 1070
		bodyModel[95] = new ModelRendererTurbo(this, 465, 43, textureX, textureY); // Box 1071
		bodyModel[96] = new ModelRendererTurbo(this, 465, 56, textureX, textureY); // Box 1072
		bodyModel[97] = new ModelRendererTurbo(this, 464, 62, textureX, textureY); // Box 1073
		bodyModel[98] = new ModelRendererTurbo(this, 465, 69, textureX, textureY); // Box 1074
		bodyModel[99] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 1081 air tank support
		bodyModel[100] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Box 398
		bodyModel[101] = new ModelRendererTurbo(this, 62, 162, textureX, textureY); // Box 399
		bodyModel[102] = new ModelRendererTurbo(this, 62, 154, textureX, textureY); // Box 400
		bodyModel[103] = new ModelRendererTurbo(this, 27, 154, textureX, textureY); // Box 401
		bodyModel[104] = new ModelRendererTurbo(this, 19, 78, textureX, textureY); // Box 1086
		bodyModel[105] = new ModelRendererTurbo(this, 460, 178, textureX, textureY); // Box 67
		bodyModel[106] = new ModelRendererTurbo(this, 463, 178, textureX, textureY); // Box 68
		bodyModel[107] = new ModelRendererTurbo(this, 463, 168, textureX, textureY); // Box 231
		bodyModel[108] = new ModelRendererTurbo(this, 460, 168, textureX, textureY); // Box 232
		bodyModel[109] = new ModelRendererTurbo(this, 241, 8, textureX, textureY); // Box 1096
		bodyModel[110] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1097
		bodyModel[111] = new ModelRendererTurbo(this, 485, 118, textureX, textureY, "cull"); // Box 43 cull
		bodyModel[112] = new ModelRendererTurbo(this, 485, 124, textureX, textureY, "cull"); // Box 1100 cull
		bodyModel[113] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 184
		bodyModel[114] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 185
		bodyModel[115] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 186
		bodyModel[116] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 187 air tank support
		bodyModel[117] = new ModelRendererTurbo(this, 296, 114, textureX, textureY); // Box 114
		bodyModel[118] = new ModelRendererTurbo(this, 296, 111, textureX, textureY); // Box 74
		bodyModel[119] = new ModelRendererTurbo(this, 296, 117, textureX, textureY); // Box 78
		bodyModel[120] = new ModelRendererTurbo(this, 295, 107, textureX, textureY); // Box 245
		bodyModel[121] = new ModelRendererTurbo(this, 296, 102, textureX, textureY); // Box 418
		bodyModel[122] = new ModelRendererTurbo(this, 367, 171, textureX, textureY); // Box 651 yes this is a real bit
		bodyModel[123] = new ModelRendererTurbo(this, 385, 37, textureX, textureY); // Box 385 2chime horn
		bodyModel[124] = new ModelRendererTurbo(this, 385, 40, textureX, textureY); // Box 386 2chime horn
		bodyModel[125] = new ModelRendererTurbo(this, 400, 44, textureX, textureY, "cull"); // Box 512 cull
		bodyModel[126] = new ModelRendererTurbo(this, 267, 158, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[127] = new ModelRendererTurbo(this, 474, 30, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[128] = new ModelRendererTurbo(this, 391, 30, textureX, textureY); // Box 184
		bodyModel[129] = new ModelRendererTurbo(this, 396, 29, textureX, textureY); // Box 364 prime base
		bodyModel[130] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[131] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[132] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[133] = new ModelRendererTurbo(this, 396, 25, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[134] = new ModelRendererTurbo(this, 384, 31, textureX, textureY); // Box 183
		bodyModel[135] = new ModelRendererTurbo(this, 396, 17, textureX, textureY); // Box 364 prime base
		bodyModel[136] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[137] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[138] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[139] = new ModelRendererTurbo(this, 396, 13, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[140] = new ModelRendererTurbo(this, 396, 21, textureX, textureY, "cull"); // Box 478 cull
		bodyModel[141] = new ModelRendererTurbo(this, 419, 25, textureX, textureY); // Box 364
		bodyModel[142] = new ModelRendererTurbo(this, 408, 20, textureX, textureY); // Box 365
		bodyModel[143] = new ModelRendererTurbo(this, 408, 26, textureX, textureY); // Box 366
		bodyModel[144] = new ModelRendererTurbo(this, 313, 115, textureX, textureY); // Box 538
		bodyModel[145] = new ModelRendererTurbo(this, 313, 110, textureX, textureY); // Box 539
		bodyModel[146] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 540
		bodyModel[147] = new ModelRendererTurbo(this, 395, 40, textureX, textureY); // Box 241
		bodyModel[148] = new ModelRendererTurbo(this, 326, 107, textureX, textureY, "cull"); // Box 260 cull
		bodyModel[149] = new ModelRendererTurbo(this, 390, 22, textureX, textureY); // Box 409 commander base
		bodyModel[150] = new ModelRendererTurbo(this, 390, 18, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[151] = new ModelRendererTurbo(this, 401, 40, textureX, textureY); // Box 271
		bodyModel[152] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 273
		bodyModel[153] = new ModelRendererTurbo(this, 32, 67, textureX, textureY); // Box 274
		bodyModel[154] = new ModelRendererTurbo(this, 132, 67, textureX, textureY); // Box 275
		bodyModel[155] = new ModelRendererTurbo(this, 140, 67, textureX, textureY); // Box 276
		bodyModel[156] = new ModelRendererTurbo(this, 362, 23, textureX, textureY); // Box 354
		bodyModel[157] = new ModelRendererTurbo(this, 371, 29, textureX, textureY); // Box 355
		bodyModel[158] = new ModelRendererTurbo(this, 360, 29, textureX, textureY); // Box 356
		bodyModel[159] = new ModelRendererTurbo(this, 362, 35, textureX, textureY); // Box 357
		bodyModel[160] = new ModelRendererTurbo(this, 364, 32, textureX, textureY); // Box 358
		bodyModel[161] = new ModelRendererTurbo(this, 364, 26, textureX, textureY); // Box 359
		bodyModel[162] = new ModelRendererTurbo(this, 19, 100, textureX, textureY, "cull"); // Box 186 cull
		bodyModel[163] = new ModelRendererTurbo(this, 119, 100, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[164] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 78
		bodyModel[165] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 188
		bodyModel[166] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[167] = new ModelRendererTurbo(this, 83, 89, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[168] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 239
		bodyModel[169] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[170] = new ModelRendererTurbo(this, 183, 89, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[171] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 242
		bodyModel[172] = new ModelRendererTurbo(this, 381, 57, textureX, textureY); // box64
		bodyModel[173] = new ModelRendererTurbo(this, 381, 53, textureX, textureY); // box65
		bodyModel[174] = new ModelRendererTurbo(this, 373, 44, textureX, textureY); // Box 293
		bodyModel[175] = new ModelRendererTurbo(this, 364, 47, textureX, textureY); // Box 294
		bodyModel[176] = new ModelRendererTurbo(this, 362, 44, textureX, textureY); // Box 295
		bodyModel[177] = new ModelRendererTurbo(this, 364, 41, textureX, textureY); // Box 296
		bodyModel[178] = new ModelRendererTurbo(this, 328, 117, textureX, textureY); // Box 319
		bodyModel[179] = new ModelRendererTurbo(this, 281, 165, textureX, textureY); // Box 362 ane shit
		bodyModel[180] = new ModelRendererTurbo(this, 274, 167, textureX, textureY, "lamp"); // Box 363 ane front light gyra
		bodyModel[181] = new ModelRendererTurbo(this, 267, 167, textureX, textureY, "lamp"); // Box 364 ane front light gyra
		bodyModel[182] = new ModelRendererTurbo(this, 466, 22, textureX, textureY); // Box 365 ane shit
		bodyModel[183] = new ModelRendererTurbo(this, 452, 24, textureX, textureY, "lamp"); // Box 366 ane rear light gyra
		bodyModel[184] = new ModelRendererTurbo(this, 459, 24, textureX, textureY, "lamp"); // Box 367 ane rear light gyra
		bodyModel[185] = new ModelRendererTurbo(this, 348, 32, textureX, textureY); // Box 83
		bodyModel[186] = new ModelRendererTurbo(this, 348, 26, textureX, textureY); // Box 84
		bodyModel[187] = new ModelRendererTurbo(this, 460, 171, textureX, textureY); // Box 379
		bodyModel[188] = new ModelRendererTurbo(this, 463, 171, textureX, textureY); // Box 380
		bodyModel[189] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 523
		bodyModel[190] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 510
		bodyModel[191] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 512
		bodyModel[192] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 513
		bodyModel[193] = new ModelRendererTurbo(this, 275, 145, textureX, textureY); // Box 409 commander base
		bodyModel[194] = new ModelRendererTurbo(this, 275, 141, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[195] = new ModelRendererTurbo(this, 469, 8, textureX, textureY); // Box 409 commander base
		bodyModel[196] = new ModelRendererTurbo(this, 469, 4, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[197] = new ModelRendererTurbo(this, 424, 138, textureX, textureY); // Box 297 ec
		bodyModel[198] = new ModelRendererTurbo(this, 415, 121, textureX, textureY); // Box 302
		bodyModel[199] = new ModelRendererTurbo(this, 467, 188, textureX, textureY, "lamp"); // Box 275 cs2 speedo glow
		bodyModel[200] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 529
		bodyModel[201] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 530
		bodyModel[202] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 531
		bodyModel[203] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 532
		bodyModel[204] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 533
		bodyModel[205] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 534
		bodyModel[206] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 535
		bodyModel[207] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 536
		bodyModel[208] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 537
		bodyModel[209] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 538
		bodyModel[210] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 539
		bodyModel[211] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 540
		bodyModel[212] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 541
		bodyModel[213] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 542
		bodyModel[214] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 543
		bodyModel[215] = new ModelRendererTurbo(this, 117, 59, textureX, textureY); // Box 544
		bodyModel[216] = new ModelRendererTurbo(this, 117, 76, textureX, textureY); // Box 548
		bodyModel[217] = new ModelRendererTurbo(this, 159, 76, textureX, textureY); // Box 551
		bodyModel[218] = new ModelRendererTurbo(this, 119, 78, textureX, textureY); // Box 554
		bodyModel[219] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 555
		bodyModel[220] = new ModelRendererTurbo(this, 474, 42, textureX, textureY); // Box 557
		bodyModel[221] = new ModelRendererTurbo(this, 474, 68, textureX, textureY); // Box 558
		bodyModel[222] = new ModelRendererTurbo(this, 405, 57, textureX, textureY); // Box 570
		bodyModel[223] = new ModelRendererTurbo(this, 402, 57, textureX, textureY); // Box 571
		bodyModel[224] = new ModelRendererTurbo(this, 231, 106, textureX, textureY); // Box 260
		bodyModel[225] = new ModelRendererTurbo(this, 246, 107, textureX, textureY); // Box 264
		bodyModel[226] = new ModelRendererTurbo(this, 229, 109, textureX, textureY); // Box 268
		bodyModel[227] = new ModelRendererTurbo(this, 246, 110, textureX, textureY); // Box 274
		bodyModel[228] = new ModelRendererTurbo(this, 241, 114, textureX, textureY); // Box 283
		bodyModel[229] = new ModelRendererTurbo(this, 228, 114, textureX, textureY); // Box 284
		bodyModel[230] = new ModelRendererTurbo(this, 246, 129, textureX, textureY); // Box 293
		bodyModel[231] = new ModelRendererTurbo(this, 229, 128, textureX, textureY); // Box 294
		bodyModel[232] = new ModelRendererTurbo(this, 231, 125, textureX, textureY); // Box 295
		bodyModel[233] = new ModelRendererTurbo(this, 246, 126, textureX, textureY); // Box 296
		bodyModel[234] = new ModelRendererTurbo(this, 241, 133, textureX, textureY); // Box 360
		bodyModel[235] = new ModelRendererTurbo(this, 228, 133, textureX, textureY); // Box 361
		bodyModel[236] = new ModelRendererTurbo(this, 462, 56, textureX, textureY); // Box 404
		bodyModel[237] = new ModelRendererTurbo(this, 461, 49, textureX, textureY); // Box 405
		bodyModel[238] = new ModelRendererTurbo(this, 462, 43, textureX, textureY); // Box 406
		bodyModel[239] = new ModelRendererTurbo(this, 461, 62, textureX, textureY); // Box 407
		bodyModel[240] = new ModelRendererTurbo(this, 462, 69, textureX, textureY); // Box 408
		bodyModel[241] = new ModelRendererTurbo(this, 298, 228, textureX, textureY); // Box 409 vent
		bodyModel[242] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 410 vent
		bodyModel[243] = new ModelRendererTurbo(this, 340, 228, textureX, textureY); // Box 411 vent
		bodyModel[244] = new ModelRendererTurbo(this, 361, 222, textureX, textureY); // Box 412 vent
		bodyModel[245] = new ModelRendererTurbo(this, 381, 222, textureX, textureY); // Box 413 vent
		bodyModel[246] = new ModelRendererTurbo(this, 277, 234, textureX, textureY); // Box 414
		bodyModel[247] = new ModelRendererTurbo(this, 477, 174, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[248] = new ModelRendererTurbo(this, 479, 169, textureX, textureY); // Box 5 aww
		bodyModel[249] = new ModelRendererTurbo(this, 477, 191, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[250] = new ModelRendererTurbo(this, 479, 186, textureX, textureY); // Box 5 aww
		bodyModel[251] = new ModelRendererTurbo(this, 442, 197, textureX, textureY); // Box 412 cs
		bodyModel[252] = new ModelRendererTurbo(this, 454, 197, textureX, textureY); // Box 413 cs
		bodyModel[253] = new ModelRendererTurbo(this, 440, 189, textureX, textureY); // Box 86 cs
		bodyModel[254] = new ModelRendererTurbo(this, 435, 210, textureX, textureY); // Box 531 cs
		bodyModel[255] = new ModelRendererTurbo(this, 430, 180, textureX, textureY, "lamp"); // Box 71 cs glow speedometer
		bodyModel[256] = new ModelRendererTurbo(this, 430, 175, textureX, textureY); // Box 307 cs speedo
		bodyModel[257] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 168 numberboard front double
		bodyModel[258] = new ModelRendererTurbo(this, 275, 150, textureX, textureY, "lamp"); // Box 167 numberboard front double
		bodyModel[259] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 168 numberboard rear double
		bodyModel[260] = new ModelRendererTurbo(this, 482, 22, textureX, textureY, "lamp"); // Box 167 numberboard rear double
		bodyModel[261] = new ModelRendererTurbo(this, 368, 64, textureX, textureY); // Box 184 o2 generator
		bodyModel[262] = new ModelRendererTurbo(this, 27, 169, textureX, textureY); // Box 426 flexicoil short skirt
		bodyModel[263] = new ModelRendererTurbo(this, 66, 169, textureX, textureY); // Box 427 flexicoil short skirt
		bodyModel[264] = new ModelRendererTurbo(this, 61, 169, textureX, textureY); // Box 428 flexicoil short skirt
		bodyModel[265] = new ModelRendererTurbo(this, 32, 169, textureX, textureY); // Box 429 flexicoil short skirt
		bodyModel[266] = new ModelRendererTurbo(this, 233, 155, textureX, textureY); // Box 415
		bodyModel[267] = new ModelRendererTurbo(this, 221, 161, textureX, textureY); // Box 416
		bodyModel[268] = new ModelRendererTurbo(this, 203, 161, textureX, textureY); // Box 417
		bodyModel[269] = new ModelRendererTurbo(this, 214, 163, textureX, textureY); // Box 418
		bodyModel[270] = new ModelRendererTurbo(this, 300, 206, textureX, textureY); // Box 186
		bodyModel[271] = new ModelRendererTurbo(this, 279, 206, textureX, textureY); // Box 187
		bodyModel[272] = new ModelRendererTurbo(this, 234, 197, textureX, textureY); // Box 442
		bodyModel[273] = new ModelRendererTurbo(this, 341, 120, textureX, textureY); // Box 33 tall stack
		bodyModel[274] = new ModelRendererTurbo(this, 328, 120, textureX, textureY); // Box 383 tall stack
		bodyModel[275] = new ModelRendererTurbo(this, 245, 164, textureX, textureY); // Box 445
		bodyModel[276] = new ModelRendererTurbo(this, 278, 197, textureX, textureY); // Box 256
		bodyModel[277] = new ModelRendererTurbo(this, 278, 197, textureX, textureY); // Box 583
		bodyModel[278] = new ModelRendererTurbo(this, 316, 197, textureX, textureY); // Box 405
		bodyModel[279] = new ModelRendererTurbo(this, 352, 110, textureX, textureY); // Box 449
		bodyModel[280] = new ModelRendererTurbo(this, 352, 121, textureX, textureY); // Box 450
		bodyModel[281] = new ModelRendererTurbo(this, 352, 115, textureX, textureY); // Box 451
		bodyModel[282] = new ModelRendererTurbo(this, 339, 107, textureX, textureY, "cull"); // Box 260 cull
		bodyModel[283] = new ModelRendererTurbo(this, 341, 117, textureX, textureY); // Box 453
		bodyModel[284] = new ModelRendererTurbo(this, 213, 158, textureX, textureY); // Box 1251
		bodyModel[285] = new ModelRendererTurbo(this, 378, 43, textureX, textureY, "cull"); // Box 330
		bodyModel[286] = new ModelRendererTurbo(this, 384, 29, textureX, textureY); // Box 331
		bodyModel[287] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 396
		bodyModel[288] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[289] = new ModelRendererTurbo(this, 62, 92, textureX, textureY); // Box 334
		bodyModel[290] = new ModelRendererTurbo(this, 162, 87, textureX, textureY); // Box 396
		bodyModel[291] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[292] = new ModelRendererTurbo(this, 162, 92, textureX, textureY); // Box 334
		bodyModel[293] = new ModelRendererTurbo(this, 35, 63, textureX, textureY); // Box 338 mu cord holder
		bodyModel[294] = new ModelRendererTurbo(this, 341, 131, textureX, textureY); // Box 339 short stack
		bodyModel[295] = new ModelRendererTurbo(this, 328, 131, textureX, textureY); // Box 339 short stack
		bodyModel[296] = new ModelRendererTurbo(this, 135, 63, textureX, textureY); // Box 338 mu cord holder
		bodyModel[297] = new ModelRendererTurbo(this, 391, 27, textureX, textureY); // Box 269
		bodyModel[298] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 78
		bodyModel[299] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 188
		bodyModel[300] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up
		bodyModel[301] = new ModelRendererTurbo(this, 69, 90, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up
		bodyModel[302] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 239
		bodyModel[303] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r up
		bodyModel[304] = new ModelRendererTurbo(this, 169, 90, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up
		bodyModel[305] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 242
		bodyModel[306] = new ModelRendererTurbo(this, 508, 121, textureX, textureY); // Box 43
		bodyModel[307] = new ModelRendererTurbo(this, 507, 118, textureX, textureY); // Box 43
		bodyModel[308] = new ModelRendererTurbo(this, 270, 145, textureX, textureY); // Box 409 commander base
		bodyModel[309] = new ModelRendererTurbo(this, 270, 141, textureX, textureY, BoxName.commander); // Box 410 commander beacon mich limestone
		bodyModel[310] = new ModelRendererTurbo(this, 181, 216, textureX, textureY); // Box 355 fncc extension tank
		bodyModel[311] = new ModelRendererTurbo(this, 151, 194, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[312] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 357
		bodyModel[313] = new ModelRendererTurbo(this, 147, 68, textureX, textureY); // Box 358
		bodyModel[314] = new ModelRendererTurbo(this, 121, 68, textureX, textureY); // Box 359
		bodyModel[315] = new ModelRendererTurbo(this, 421, 140, textureX, textureY); // Box 360 up thing
		bodyModel[316] = new ModelRendererTurbo(this, 498, 124, textureX, textureY); // Box 438 parts and fpe
		bodyModel[317] = new ModelRendererTurbo(this, 498, 205, textureX, textureY); // Box 362 EB valve
		bodyModel[318] = new ModelRendererTurbo(this, 489, 207, textureX, textureY); // Box 363 fridge bit
		bodyModel[319] = new ModelRendererTurbo(this, 476, 203, textureX, textureY); // Box 364 fridge bit
		bodyModel[320] = new ModelRendererTurbo(this, 151, 188, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[321] = new ModelRendererTurbo(this, 412, 115, textureX, textureY); // Box 366 JTPX 1263 cone
		bodyModel[322] = new ModelRendererTurbo(this, 408, 122, textureX, textureY); // Box 367 JTPX 1263 cone
		bodyModel[323] = new ModelRendererTurbo(this, 238, 6, textureX, textureY); // Box 368
		bodyModel[324] = new ModelRendererTurbo(this, 6, 117, textureX, textureY); // Box 282
		bodyModel[325] = new ModelRendererTurbo(this, 19, 121, textureX, textureY); // Box 283
		bodyModel[326] = new ModelRendererTurbo(this, 119, 121, textureX, textureY); // Box 305
		bodyModel[327] = new ModelRendererTurbo(this, 106, 117, textureX, textureY); // Box 306
		bodyModel[328] = new ModelRendererTurbo(this, 74, 109, textureX, textureY); // Box 24
		bodyModel[329] = new ModelRendererTurbo(this, 87, 111, textureX, textureY); // Box 25
		bodyModel[330] = new ModelRendererTurbo(this, 187, 111, textureX, textureY); // Box 315
		bodyModel[331] = new ModelRendererTurbo(this, 174, 109, textureX, textureY); // Box 316
		bodyModel[332] = new ModelRendererTurbo(this, 362, 11, textureX, textureY); // Box 336
		bodyModel[333] = new ModelRendererTurbo(this, 362, 14, textureX, textureY); // Box 337
		bodyModel[334] = new ModelRendererTurbo(this, 362, 8, textureX, textureY); // Box 338
		bodyModel[335] = new ModelRendererTurbo(this, 371, 11, textureX, textureY); // Box 339
		bodyModel[336] = new ModelRendererTurbo(this, 47, 65, textureX, textureY, "cull"); // Box 360 cull hose holder
		bodyModel[337] = new ModelRendererTurbo(this, 19, 65, textureX, textureY, "cull"); // Box 361 cull hose holder
		bodyModel[338] = new ModelRendererTurbo(this, 119, 65, textureX, textureY, "cull"); // Box 360 cull hose holder
		bodyModel[339] = new ModelRendererTurbo(this, 147, 65, textureX, textureY, "cull"); // Box 361 cull hose holder
		bodyModel[340] = new ModelRendererTurbo(this, 256, 228, textureX, textureY); // Box 364
		bodyModel[341] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 341 up stripe
		bodyModel[342] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 342 up skirt
		bodyModel[343] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 341 up stripe
		bodyModel[344] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 342 up skirt
		bodyModel[345] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 341 up stripe
		bodyModel[346] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 342 up skirt
		bodyModel[347] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 341 up stripe
		bodyModel[348] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 342 up skirt
		bodyModel[349] = new ModelRendererTurbo(this, 384, 33, textureX, textureY); // Box 349

		bodyModel[0].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 89
		bodyModel[0].setRotationPoint(-5F, 3F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
		bodyModel[1].setRotationPoint(-27F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 1
		bodyModel[2].setRotationPoint(-31F, 1F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[3].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[4].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 166
		bodyModel[5].setRotationPoint(-31.01F, -7F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[6].setRotationPoint(-31.01F, -7F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[7].setRotationPoint(-31.01F, -7F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[8].setRotationPoint(-27F, 2F, 4.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 546
		bodyModel[9].setRotationPoint(-31F, -7F, -0.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 389
		bodyModel[10].setRotationPoint(-31F, 6F, 9F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 390
		bodyModel[11].setRotationPoint(-31F, 8F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 391
		bodyModel[12].setRotationPoint(-31F, 6F, 7.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 392
		bodyModel[13].setRotationPoint(-31F, 4F, 7.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 393
		bodyModel[14].setRotationPoint(-31F, 4F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 394
		bodyModel[15].setRotationPoint(-31F, 2F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[16].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[17].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[18].setRotationPoint(31F, 2.5F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 184
		bodyModel[19].setRotationPoint(27F, 1F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 388
		bodyModel[20].setRotationPoint(-31F, 1.5F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[21].setRotationPoint(27F, 2F, 4.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[22].setRotationPoint(27F, 2F, -10.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 54, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 108
		bodyModel[23].setRotationPoint(-27F, 2F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[24].setRotationPoint(-27F, 2F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[25].setRotationPoint(-27F, 2F, 11F);

		bodyModel[26].addBox(0F, 0F, 0F, 29, 15, 16, 0F); // Box 5 hood
		bodyModel[26].setRotationPoint(-25F, -14F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[27].setRotationPoint(-25F, -15F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[28].setRotationPoint(-25F, -15F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[29].setRotationPoint(4F, -12F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[30].setRotationPoint(4F, -14F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[31].setRotationPoint(4F, -14F, 0F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 9
		bodyModel[32].setRotationPoint(22F, -17F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 16, 5, 22, 0F); // Box 18
		bodyModel[33].setRotationPoint(11F, -4F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 71
		bodyModel[34].setRotationPoint(22F, -17F, 2F);

		bodyModel[35].addShapeBox(-0.5F, 0F, 0F, 1, 13, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 61 door swign right
		bodyModel[35].setRotationPoint(22.5F, -17F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[36].setRotationPoint(11F, -20F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 9
		bodyModel[37].setRotationPoint(12F, -17F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 10
		bodyModel[38].setRotationPoint(12F, -17F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 15
		bodyModel[39].setRotationPoint(11F, -17F, -7F);

		bodyModel[40].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[40].setRotationPoint(11.5F, -17F, -10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[41].setRotationPoint(22F, -20F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[42].setRotationPoint(11F, -20F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[43].setRotationPoint(22F, -20F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[44].setRotationPoint(12F, -22F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 2F, 12, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[45].setRotationPoint(11F, -22F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 348
		bodyModel[46].setRotationPoint(12F, -22F, 0F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[47].setRotationPoint(11F, -20F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[48].setRotationPoint(22F, -20F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[49].setRotationPoint(-18F, 3.5F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-17.5F, 2F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[51].setRotationPoint(-17.5F, 2F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[52].setRotationPoint(-16.5F, 2F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[53].setRotationPoint(-16.5F, 2F, 9F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 337
		bodyModel[54].setRotationPoint(-31F, 2F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 338
		bodyModel[55].setRotationPoint(-31F, 4F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 339
		bodyModel[56].setRotationPoint(-31F, 4F, -7.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 340
		bodyModel[57].setRotationPoint(-31F, 6F, -9.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 341
		bodyModel[58].setRotationPoint(-31F, 6F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 342
		bodyModel[59].setRotationPoint(-31F, 8F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 188
		bodyModel[60].setRotationPoint(25F, -6F, -11.01F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 11, 0, 0F); // Box 190
		bodyModel[61].setRotationPoint(25F, -6F, 11.01F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[62].setRotationPoint(25F, -7F, -11.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[63].setRotationPoint(25F, -7F, 11.01F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[64].setRotationPoint(-29.25F, -18.5F, -0.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[65].setRotationPoint(-29.25F, -17F, -0.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 371
		bodyModel[66].setRotationPoint(-28F, -7F, -11.01F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[67].setRotationPoint(-28F, -7F, -11.02F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 373
		bodyModel[68].setRotationPoint(-28F, -7F, 11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[69].setRotationPoint(-28F, -7F, 11.02F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 375
		bodyModel[70].setRotationPoint(27F, 1.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[71].setRotationPoint(-24F, -7F, -11.02F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[72].setRotationPoint(-24F, -7F, 11.02F);

		bodyModel[73].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[73].setRotationPoint(11F, -22F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[74].setRotationPoint(22F, -22F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[75].setRotationPoint(22F, -22F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[76].setRotationPoint(11F, -22F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[77].setRotationPoint(-28F, -18.5F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[78].setRotationPoint(-29F, -18.5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[79].setRotationPoint(-29F, -18F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387
		bodyModel[80].setRotationPoint(-29F, -18F, 1F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 388
		bodyModel[81].setRotationPoint(14F, 3.5F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[82].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 390
		bodyModel[83].setRotationPoint(15.5F, 2F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 391
		bodyModel[84].setRotationPoint(15.5F, 2F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 392
		bodyModel[85].setRotationPoint(14.5F, 2F, 8F);

		bodyModel[86].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 395
		bodyModel[86].setRotationPoint(11F, -21F, -4F);

		bodyModel[87].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 396
		bodyModel[87].setRotationPoint(22F, -21F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[88].setRotationPoint(24.25F, -21F, -0.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[89].setRotationPoint(24.25F, -19.5F, -0.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[90].setRotationPoint(23F, -21F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383
		bodyModel[91].setRotationPoint(23F, -21F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[92].setRotationPoint(23F, -20.5F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387
		bodyModel[93].setRotationPoint(23F, -20.5F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1070
		bodyModel[94].setRotationPoint(10F, -20F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-0.5F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 1071
		bodyModel[95].setRotationPoint(10F, -18F, 5F);

		bodyModel[96].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 1072
		bodyModel[96].setRotationPoint(10F, -21.5F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 1073
		bodyModel[97].setRotationPoint(10F, -20F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 1074
		bodyModel[98].setRotationPoint(10F, -18F, -13F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081 air tank support
		bodyModel[99].setRotationPoint(-4F, 3.25F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[100].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[101].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[102].setRotationPoint(23F, 2F, 10.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[103].setRotationPoint(23F, 2F, -10.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 1086
		bodyModel[104].setRotationPoint(-31F, -0.5F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[105].setRotationPoint(26F, -7F, -3F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[106].setRotationPoint(26F, -7F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[107].setRotationPoint(23F, -13F, 3F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[108].setRotationPoint(23F, -13F, -3F);

		bodyModel[109].addBox(0F, 0F, 0F, 34, 10, 0, 0F); // Box 1096
		bodyModel[109].setRotationPoint(-23F, -9F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 1097
		bodyModel[110].setRotationPoint(-23F, -7F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 43 cull
		bodyModel[111].setRotationPoint(9F, -1F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 1100 cull
		bodyModel[112].setRotationPoint(27F, -1F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[113].setRotationPoint(-4F, 3F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[114].setRotationPoint(-4F, 4F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[115].setRotationPoint(-4F, 4F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 air tank support
		bodyModel[116].setRotationPoint(-4F, 3.25F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[117].setRotationPoint(3F, -17F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[118].setRotationPoint(3F, -18F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[119].setRotationPoint(3.25F, -16.5F, -0.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[120].setRotationPoint(3F, -19F, -0.550000000000001F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[121].setRotationPoint(3F, -18F, 0.45F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 651 yes this is a real bit
		bodyModel[122].setRotationPoint(9F, -3F, 7F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 385 2chime horn
		bodyModel[123].setRotationPoint(8F, -21F, 0F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 386 2chime horn
		bodyModel[124].setRotationPoint(7.25F, -21F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 512 cull
		bodyModel[125].setRotationPoint(9F, -19F, -1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[126].setRotationPoint(-30F, -18.5F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[127].setRotationPoint(25F, -21F, -1F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[128].setRotationPoint(19F, -23.5F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[129].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[130].setRotationPoint(16F, -23F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[131].setRotationPoint(16F, -23F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[132].setRotationPoint(16F, -23F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[133].setRotationPoint(16F, -23F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[134].setRotationPoint(14F, -22.5F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[135].setRotationPoint(12F, -23.5F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[136].setRotationPoint(12F, -24F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[137].setRotationPoint(12F, -24F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[138].setRotationPoint(12F, -24F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[139].setRotationPoint(12F, -24F, -1F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 478 cull
		bodyModel[140].setRotationPoint(12F, -22.5F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[141].setRotationPoint(16.5F, -23.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[142].setRotationPoint(15.5F, -23.5F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[143].setRotationPoint(15.5F, -22.5F, -2F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[144].setRotationPoint(-11.5F, -22F, -1.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[145].setRotationPoint(-11.5F, -23F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[146].setRotationPoint(-11.5F, -20F, -1.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[147].setRotationPoint(9.25F, -20F, -0.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 260 cull
		bodyModel[148].setRotationPoint(-11.5F, -22F, -1.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[149].setRotationPoint(20F, -22.5F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[150].setRotationPoint(20F, -23.5F, -0.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[151].setRotationPoint(7.25F, -21F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 273
		bodyModel[152].setRotationPoint(-31.02F, 4F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[153].setRotationPoint(-31.02F, 4F, 6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[154].setRotationPoint(31.02F, 4F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[155].setRotationPoint(31.02F, 4F, -9F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[156].setRotationPoint(9.5F, -23.25F, 0.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[157].setRotationPoint(11F, -22.5F, -0.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[158].setRotationPoint(8.5F, -23.5F, -0.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[159].setRotationPoint(9F, -23.25F, -1.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[160].setRotationPoint(10F, -24.5F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[161].setRotationPoint(10F, -24.5F, 0.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 cull
		bodyModel[162].setRotationPoint(-33.01F, 7F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[163].setRotationPoint(31.01F, 7F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[164].setRotationPoint(-31.5F, -7F, 6.75F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[165].setRotationPoint(-31.5F, -7F, -8.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[166].setRotationPoint(-31.75F, -7F, 6.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[167].setRotationPoint(-31.75F, -7F, -8.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[168].setRotationPoint(30.5F, -7F, -8.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[169].setRotationPoint(30.75F, -7F, -8.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[170].setRotationPoint(30.75F, -7F, 6.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[171].setRotationPoint(30.5F, -7F, 6.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[172].setRotationPoint(14F, -17F, 11F);
		bodyModel[172].rotateAngleX = 0.26179939F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[173].setRotationPoint(14F, -17.25F, -11.97F);
		bodyModel[173].rotateAngleX = -0.26179939F;

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[174].setRotationPoint(16.25F, -21.4F, -7.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[175].setRotationPoint(14.25F, -22.15F, -8.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[176].setRotationPoint(15.75F, -22.4F, -7.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[177].setRotationPoint(14.75F, -22.15F, -6.5F);

		bodyModel[178].addBox(-2F, 0F, 0F, 2, 0, 2, 0F); // Box 319
		bodyModel[178].setRotationPoint(-9F, -21F, -1F);
		bodyModel[178].rotateAngleZ = -0.9250245F;

		bodyModel[179].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 362 ane shit
		bodyModel[179].setRotationPoint(-27.5F, -15.5F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 ane front light gyra
		bodyModel[180].setRotationPoint(-27.75F, -15.5F, -2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 ane front light gyra
		bodyModel[181].setRotationPoint(-27.75F, -15.5F, 0F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 365 ane shit
		bodyModel[182].setRotationPoint(23F, -23F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 366 ane rear light gyra
		bodyModel[183].setRotationPoint(24.25F, -23F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ane rear light gyra
		bodyModel[184].setRotationPoint(24.25F, -23F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[185].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[186].setRotationPoint(7.5F, -21F, 0.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[187].setRotationPoint(27F, -13F, -3F);
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[188].setRotationPoint(27F, -13F, 3F);
		bodyModel[188].rotateAngleY = -3.14159265F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 523
		bodyModel[189].setRotationPoint(-4F, 3F, -10.47F);
		bodyModel[189].rotateAngleX = -0.78539816F;

		bodyModel[190].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 510
		bodyModel[190].setRotationPoint(-4F, 3F, 10.47F);
		bodyModel[190].rotateAngleX = 0.78539816F;

		bodyModel[191].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 512
		bodyModel[191].setRotationPoint(4F, 3.5F, -10.75F);
		bodyModel[191].rotateAngleX = -0.52359878F;

		bodyModel[192].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 513
		bodyModel[192].setRotationPoint(4F, 3.5F, 10.75F);
		bodyModel[192].rotateAngleX = 0.52359878F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[193].setRotationPoint(-28.25F, -19.5F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[194].setRotationPoint(-28.25F, -20.5F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[195].setRotationPoint(23.9F, -22F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[196].setRotationPoint(23.9F, -23F, -0.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 8, 8, 0F); // Box 297 ec
		bodyModel[197].setRotationPoint(12F, -12F, -7F);

		bodyModel[198].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 302
		bodyModel[198].setRotationPoint(12F, -5F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 275 cs2 speedo glow
		bodyModel[199].setRotationPoint(12F, -17.5F, 6.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 529
		bodyModel[200].setRotationPoint(27F, 4F, 6F);

		bodyModel[201].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 530
		bodyModel[201].setRotationPoint(27F, 2F, 6F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 531
		bodyModel[202].setRotationPoint(27F, 4F, 7.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 532
		bodyModel[203].setRotationPoint(27F, 6F, 7.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 533
		bodyModel[204].setRotationPoint(27F, 6F, 9F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 534
		bodyModel[205].setRotationPoint(27F, 8F, 9F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 535
		bodyModel[206].setRotationPoint(27F, 8F, -11F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 536
		bodyModel[207].setRotationPoint(27F, 6F, -9F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 537
		bodyModel[208].setRotationPoint(27F, 6F, -9.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 538
		bodyModel[209].setRotationPoint(27F, 4F, -7.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 539
		bodyModel[210].setRotationPoint(27F, 4F, -8F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 540
		bodyModel[211].setRotationPoint(27F, 2F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[212].setRotationPoint(-4F, 4F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[213].setRotationPoint(-4F, 3F, 8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[214].setRotationPoint(-4F, 4F, 10F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 16, 22, 0F); // Box 544
		bodyModel[215].setRotationPoint(31.01F, -7F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[216].setRotationPoint(31.01F, -7F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[217].setRotationPoint(31.01F, -7F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 554
		bodyModel[218].setRotationPoint(31F, -0.5F, -10F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 555
		bodyModel[219].setRotationPoint(31F, -11F, -0.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 557
		bodyModel[220].setRotationPoint(12F, -20F, 7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[221].setRotationPoint(12F, -20F, -11F);

		bodyModel[222].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 570
		bodyModel[222].setRotationPoint(23F, -16F, -11.5F);
		bodyModel[222].rotateAngleY = -0.52359878F;

		bodyModel[223].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 571
		bodyModel[223].setRotationPoint(23F, -16F, -10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[224].setRotationPoint(16F, -26F, 10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[225].setRotationPoint(18F, -26F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[226].setRotationPoint(15F, -25F, 9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[227].setRotationPoint(18F, -25F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 283
		bodyModel[228].setRotationPoint(17F, -23F, 8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -2F, -0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 284
		bodyModel[229].setRotationPoint(15F, -23F, 8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 1F); // Box 293
		bodyModel[230].setRotationPoint(18F, -25F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 294
		bodyModel[231].setRotationPoint(15F, -25F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 295
		bodyModel[232].setRotationPoint(16F, -26F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[233].setRotationPoint(18F, -26F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -0.5F, -2F, 1F); // Box 360
		bodyModel[234].setRotationPoint(17F, -23F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, -0.5F, -2F, 1F, 1F, 0F, -2F); // Box 361
		bodyModel[235].setRotationPoint(15F, -23F, -11F);

		bodyModel[236].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 404
		bodyModel[236].setRotationPoint(23F, -21.5F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[237].setRotationPoint(23F, -20F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, 2F, 0F, -0.5F, 2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 406
		bodyModel[238].setRotationPoint(23F, -18F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 407
		bodyModel[239].setRotationPoint(23F, -20F, -9F);

		bodyModel[240].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 408
		bodyModel[240].setRotationPoint(23F, -18F, -13F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[241].setRotationPoint(1F, -7F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[242].setRotationPoint(-2F, -7F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[243].setRotationPoint(-5F, -7F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[244].setRotationPoint(-8F, -7F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 413 vent
		bodyModel[245].setRotationPoint(24F, -3F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[246].setRotationPoint(-11F, -7F, -8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[247].setRotationPoint(14F, -16F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[248].setRotationPoint(14F, -17F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[249].setRotationPoint(14F, -16F, -15F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5 aww
		bodyModel[250].setRotationPoint(14F, -17F, -13F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[251].setRotationPoint(17.95F, -14F, 2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[252].setRotationPoint(11.25F, -12F, 4F);
		bodyModel[252].rotateAngleY = -0.45378561F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[253].setRotationPoint(11.25F, -14F, 4F);
		bodyModel[253].rotateAngleY = -0.45378561F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[254].setRotationPoint(11.25F, -8F, 4F);
		bodyModel[254].rotateAngleY = -0.45378561F;

		bodyModel[255].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 cs glow speedometer
		bodyModel[255].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[255].rotateAngleY = 0.78539816F;

		bodyModel[256].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 cs speedo
		bodyModel[256].setRotationPoint(14F, -16.25F, 4.75F);
		bodyModel[256].rotateAngleY = 0.78539816F;

		bodyModel[257].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front double
		bodyModel[257].setRotationPoint(-29F, -17.5F, 1F);
		bodyModel[257].rotateAngleY = 0.4712389F;

		bodyModel[258].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front double
		bodyModel[258].setRotationPoint(-29F, -17.5F, -1F);
		bodyModel[258].rotateAngleY = -0.4712389F;

		bodyModel[259].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear double
		bodyModel[259].setRotationPoint(25F, -20F, 1F);
		bodyModel[259].rotateAngleY = -0.4712389F;

		bodyModel[260].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear double
		bodyModel[260].setRotationPoint(25F, -20F, -1F);
		bodyModel[260].rotateAngleY = 0.4712389F;

		bodyModel[261].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[261].setRotationPoint(14.5F, -22.75F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 426 flexicoil short skirt
		bodyModel[262].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 427 flexicoil short skirt
		bodyModel[263].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 428 flexicoil short skirt
		bodyModel[264].setRotationPoint(25F, 2F, 10.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 429 flexicoil short skirt
		bodyModel[265].setRotationPoint(25F, 2F, -10.75F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Box 415
		bodyModel[266].setRotationPoint(-28F, -11F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[267].setRotationPoint(-29F, -11F, -5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 417
		bodyModel[268].setRotationPoint(-29F, -11F, 1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[269].setRotationPoint(-29F, -11F, -1F);

		bodyModel[270].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[270].setRotationPoint(-19.75F, -19F, -2.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[271].setRotationPoint(-25.75F, -19F, -2.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 13, 4, 16, 0F); // Box 442
		bodyModel[272].setRotationPoint(-27F, -18F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33 tall stack
		bodyModel[273].setRotationPoint(0F, -21F, -1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383 tall stack
		bodyModel[274].setRotationPoint(-11F, -21F, -1F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 15, 16, 0F); // Box 445
		bodyModel[275].setRotationPoint(-27F, -14F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[276].setRotationPoint(-26F, -16.5F, -8.05F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[277].setRotationPoint(-26F, -16.5F, 7.05F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[278].setRotationPoint(-14F, -18F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[279].setRotationPoint(-0.5F, -23F, -1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 450
		bodyModel[280].setRotationPoint(-0.5F, -20F, -1.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 451
		bodyModel[281].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 260 cull
		bodyModel[282].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[283].addBox(-2F, 0F, 0F, 2, 0, 2, 0F); // Box 453
		bodyModel[283].setRotationPoint(2F, -21F, -1F);
		bodyModel[283].rotateAngleZ = -0.9250245F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[284].setRotationPoint(-29F, -11.25F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[285].setRotationPoint(15.75F, -20.4F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[286].setRotationPoint(11F, -22.5F, 0F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[287].setRotationPoint(-31.75F, -4F, -5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[288].setRotationPoint(-32F, -4F, -5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 334
		bodyModel[289].setRotationPoint(-31.5F, -3F, -5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 396
		bodyModel[290].setRotationPoint(30.75F, -4F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[291].setRotationPoint(31F, -4F, 3F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[292].setRotationPoint(30.5F, -3F, 3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 338 mu cord holder
		bodyModel[293].setRotationPoint(-33F, -3F, 4F);
		bodyModel[293].rotateAngleX = 0.89011792F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 339 short stack
		bodyModel[294].setRotationPoint(0F, -19F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 339 short stack
		bodyModel[295].setRotationPoint(-11F, -19F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 338 mu cord holder
		bodyModel[296].setRotationPoint(33F, -3F, -4F);
		bodyModel[296].rotateAngleX = 0.89011792F;
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 269
		bodyModel[297].setRotationPoint(12F, -23.5F, 0F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[298].setRotationPoint(-31.25F, -4F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[299].setRotationPoint(-31.25F, -4F, -7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[300].setRotationPoint(-31.5F, -4F, 5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[301].setRotationPoint(-31.5F, -4F, -7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[302].setRotationPoint(30.25F, -4F, -7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[303].setRotationPoint(30.5F, -4F, -7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[304].setRotationPoint(30.5F, -4F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[305].setRotationPoint(30.25F, -4F, 5F);

		bodyModel[306].addBox(0.5F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[306].setRotationPoint(24F, -8.5F, 2.5F);
		bodyModel[306].rotateAngleY = 1.57079633F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[307].setRotationPoint(24F, -10.5F, 2.5F);
		bodyModel[307].rotateAngleY = 1.57079633F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[308].setRotationPoint(-27.75F, -19F, 2.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon mich limestone
		bodyModel[309].setRotationPoint(-27.75F, -20F, 2.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 355 fncc extension tank
		bodyModel[310].setRotationPoint(-5F, 8F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[311].setRotationPoint(5F, 2F, -10.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 0, 4, 10, 0F); // Box 357
		bodyModel[312].setRotationPoint(31.01F, -11F, -5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F); // Box 358
		bodyModel[313].setRotationPoint(31.01F, -11F, 5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[314].setRotationPoint(31.01F, -11F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360 up thing
		bodyModel[315].setRotationPoint(12F, -14F, -6.5F);

		bodyModel[316].addShapeBox(-1F, 0F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 438 parts and fpe
		bodyModel[316].setRotationPoint(21F, -8F, 9F);
		bodyModel[316].rotateAngleY = -0.78539816F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 362 EB valve
		bodyModel[317].setRotationPoint(21.5F, -14F, -3.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363 fridge bit
		bodyModel[318].setRotationPoint(20F, -12F, -6F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 8, 5, 0F); // Box 364 fridge bit
		bodyModel[319].setRotationPoint(21F, -12F, -8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[320].setRotationPoint(5F, 2F, 8.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 366 JTPX 1263 cone
		bodyModel[321].setRotationPoint(24F, -9.25F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 367 JTPX 1263 cone
		bodyModel[322].setRotationPoint(23F, -4.25F, -6F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.125F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0.125F, -2F, 0F, 0.125F, -2F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[323].setRotationPoint(7F, -7F, -11.01F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[324].setRotationPoint(-35F, 7F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[325].setRotationPoint(-35F, 7F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 305
		bodyModel[326].setRotationPoint(34F, 7F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[327].setRotationPoint(34F, 7F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[328].setRotationPoint(-34F, 6F, 0F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[329].setRotationPoint(-34F, 6F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 315
		bodyModel[330].setRotationPoint(33F, 6F, 0F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 316
		bodyModel[331].setRotationPoint(33F, 6F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[332].setRotationPoint(-22F, -20F, -7.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[333].setRotationPoint(-21F, -19.75F, -8.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[334].setRotationPoint(-21.5F, -19.75F, -6.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[335].setRotationPoint(-20F, -19F, -7.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 360 cull hose holder
		bodyModel[336].setRotationPoint(-32F, 7F, -9F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 361 cull hose holder
		bodyModel[337].setRotationPoint(-32F, 7F, 4F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 360 cull hose holder
		bodyModel[338].setRotationPoint(31F, 7F, -9F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 361 cull hose holder
		bodyModel[339].setRotationPoint(31F, 7F, 4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 364
		bodyModel[340].setRotationPoint(-14F, -7F, -8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 341 up stripe
		bodyModel[341].setRotationPoint(-27F, 2F, -10.76F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 342 up skirt
		bodyModel[342].setRotationPoint(-27F, 2F, -10.76F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 341 up stripe
		bodyModel[343].setRotationPoint(-27F, 2F, 10.76F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 342 up skirt
		bodyModel[344].setRotationPoint(-27F, 2F, 10.76F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 341 up stripe
		bodyModel[345].setRotationPoint(26F, 2F, -10.76F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 342 up skirt
		bodyModel[346].setRotationPoint(26F, 2F, -10.76F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 341 up stripe
		bodyModel[347].setRotationPoint(26F, 2F, 10.76F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 342 up skirt
		bodyModel[348].setRotationPoint(26F, 2F, 10.76F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[349].setRotationPoint(20F, -22.5F, 0F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeAnew theTypeA = new ModelTypeAnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 11) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1342 || GetColor(entity) == 15456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black2.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 || GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
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