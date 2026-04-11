//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD40
// Model Creator: Bida
// Created on: 22.08.2022 - 18:09:58
// Last changed on: 22.08.2022 - 18:09:58

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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

public class ModelSD40R extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40R() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[537];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 225, 31, textureX, textureY); // Box 570
		bodyModel[1] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[2] = new ModelRendererTurbo(this, 59, 113, textureX, textureY); // Box 566
		bodyModel[3] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 565
		bodyModel[4] = new ModelRendererTurbo(this, 59, 107, textureX, textureY); // Box 564
		bodyModel[5] = new ModelRendererTurbo(this, 57, 102, textureX, textureY); // Box 563
		bodyModel[6] = new ModelRendererTurbo(this, 66, 103, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[7] = new ModelRendererTurbo(this, 410, 128, textureX, textureY, "cull"); // Box 399 cull bell holder
		bodyModel[8] = new ModelRendererTurbo(this, 401, 127, textureX, textureY); // Box 397
		bodyModel[9] = new ModelRendererTurbo(this, 403, 138, textureX, textureY); // Box 396
		bodyModel[10] = new ModelRendererTurbo(this, 403, 135, textureX, textureY); // Box 395
		bodyModel[11] = new ModelRendererTurbo(this, 403, 132, textureX, textureY); // Box 394
		bodyModel[12] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[13] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[14] = new ModelRendererTurbo(this, 430, 128, textureX, textureY); // Box 389 sp mount
		bodyModel[15] = new ModelRendererTurbo(this, 423, 128, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[16] = new ModelRendererTurbo(this, 423, 133, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[17] = new ModelRendererTurbo(this, 423, 133, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[18] = new ModelRendererTurbo(this, 426, 134, textureX, textureY); // Box 31 sp mount
		bodyModel[19] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 381 sp mount
		bodyModel[20] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[21] = new ModelRendererTurbo(this, 197, 15, textureX, textureY); // Box 245
		bodyModel[22] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 198, 19, textureX, textureY); // Box 74
		bodyModel[24] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 114
		bodyModel[25] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[26] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[27] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[28] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[29] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[30] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[31] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[32] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[33] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[34] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[35] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[36] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[37] = new ModelRendererTurbo(this, 348, 221, textureX, textureY); // Box 34
		bodyModel[38] = new ModelRendererTurbo(this, 328, 221, textureX, textureY); // Box 34
		bodyModel[39] = new ModelRendererTurbo(this, 347, 216, textureX, textureY); // Box 34
		bodyModel[40] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 34
		bodyModel[41] = new ModelRendererTurbo(this, 318, 208, textureX, textureY); // Box 34
		bodyModel[42] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[43] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[44] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[45] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[46] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[47] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[48] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[49] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 314 mega bubble
		bodyModel[50] = new ModelRendererTurbo(this, 279, 58, textureX, textureY); // Box 132 mega bubble
		bodyModel[51] = new ModelRendererTurbo(this, 281, 42, textureX, textureY); // Box 131 mega bubble
		bodyModel[52] = new ModelRendererTurbo(this, 279, 45, textureX, textureY); // Box 130 mega bubble
		bodyModel[53] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 289
		bodyModel[54] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 288
		bodyModel[55] = new ModelRendererTurbo(this, 175, 5, textureX, textureY); // Box 287
		bodyModel[56] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[57] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[58] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[59] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[60] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[61] = new ModelRendererTurbo(this, 208, 12, textureX, textureY); // Box 421 prime base
		bodyModel[62] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[63] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[64] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[65] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[66] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[67] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[68] = new ModelRendererTurbo(this, 403, 171, textureX, textureY); // Box 419
		bodyModel[69] = new ModelRendererTurbo(this, 355, 171, textureX, textureY); // Box 418
		bodyModel[70] = new ModelRendererTurbo(this, 449, 30, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[71] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5 aww
		bodyModel[72] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[73] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[74] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[75] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[76] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[77] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[78] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[79] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[80] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[81] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[82] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[83] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[84] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[85] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[86] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r 1
		bodyModel[87] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r 1
		bodyModel[88] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 415
		bodyModel[89] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 414
		bodyModel[90] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f 1
		bodyModel[91] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f 1
		bodyModel[92] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[93] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[94] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[95] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[96] = new ModelRendererTurbo(this, 53, 2, textureX, textureY); // Box 394 awvr window
		bodyModel[97] = new ModelRendererTurbo(this, 63, 7, textureX, textureY); // Box 394 awvr window
		bodyModel[98] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 389 ditchlight r 3
		bodyModel[99] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 388 ditchlight r 3
		bodyModel[100] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[101] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[102] = new ModelRendererTurbo(this, 234, 43, textureX, textureY); // Box 372
		bodyModel[103] = new ModelRendererTurbo(this, 229, 45, textureX, textureY, "cull"); // Box 369 cull
		bodyModel[104] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 357
		bodyModel[105] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 356
		bodyModel[106] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 355
		bodyModel[107] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 354
		bodyModel[108] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[109] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 numberboard hh
		bodyModel[110] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 350 numberboard hh
		bodyModel[111] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[112] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f hh
		bodyModel[113] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f hh
		bodyModel[114] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[115] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[116] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 382
		bodyModel[117] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 441
		bodyModel[118] = new ModelRendererTurbo(this, 38, 98, textureX, textureY); // Box 440
		bodyModel[119] = new ModelRendererTurbo(this, 225, 42, textureX, textureY); // Box 439
		bodyModel[120] = new ModelRendererTurbo(this, 487, 83, textureX, textureY, "lamp"); // Box 438 headlight o canada
		bodyModel[121] = new ModelRendererTurbo(this, 214, 37, textureX, textureY); // Box 202
		bodyModel[122] = new ModelRendererTurbo(this, 220, 37, textureX, textureY); // Box 895
		bodyModel[123] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 894
		bodyModel[124] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[125] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[126] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[127] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[128] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[129] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[130] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[131] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[132] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[133] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[134] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[135] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[136] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[137] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[138] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight f 3
		bodyModel[139] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[140] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight f 3
		bodyModel[141] = new ModelRendererTurbo(this, 225, 40, textureX, textureY); // Box 415
		bodyModel[142] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[143] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[144] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[145] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[146] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[147] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r 2
		bodyModel[148] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r 2
		bodyModel[149] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[150] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f 2
		bodyModel[151] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f 2
		bodyModel[152] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[153] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[154] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[155] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[156] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[157] = new ModelRendererTurbo(this, 230, 52, textureX, textureY); // Box 382
		bodyModel[158] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[159] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[160] = new ModelRendererTurbo(this, 210, 31, textureX, textureY); // Box 379
		bodyModel[161] = new ModelRendererTurbo(this, 234, 60, textureX, textureY); // Box 378
		bodyModel[162] = new ModelRendererTurbo(this, 234, 52, textureX, textureY); // Box 377
		bodyModel[163] = new ModelRendererTurbo(this, 229, 54, textureX, textureY, "cull"); // Box 374 cull
		bodyModel[164] = new ModelRendererTurbo(this, 229, 62, textureX, textureY, "cull"); // Box 367 cull
		bodyModel[165] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[166] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[167] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[168] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[169] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[170] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[171] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[172] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[173] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[174] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[175] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[176] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 cnw bELL
		bodyModel[177] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105
		bodyModel[178] = new ModelRendererTurbo(this, 413, 15, textureX, textureY); // Box 104
		bodyModel[179] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 103
		bodyModel[180] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 102
		bodyModel[181] = new ModelRendererTurbo(this, 378, 15, textureX, textureY); // Box 101
		bodyModel[182] = new ModelRendererTurbo(this, 378, 22, textureX, textureY); // Box 100
		bodyModel[183] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[184] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[185] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[186] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[187] = new ModelRendererTurbo(this, 119, 50, textureX, textureY); // Box 322 ptc forehead
		bodyModel[188] = new ModelRendererTurbo(this, 145, 50, textureX, textureY); // Box 321 ptc forehead
		bodyModel[189] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 320 ptc forehead
		bodyModel[190] = new ModelRendererTurbo(this, 482, 81, textureX, textureY); // Box 318
		bodyModel[191] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[192] = new ModelRendererTurbo(this, 195, 136, textureX, textureY); // Box 316
		bodyModel[193] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[194] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[195] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[196] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[197] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[198] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[199] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[200] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[201] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[202] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 301
		bodyModel[203] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[204] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[205] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[206] = new ModelRendererTurbo(this, 333, 15, textureX, textureY); // Box 286
		bodyModel[207] = new ModelRendererTurbo(this, 333, 22, textureX, textureY); // Box 285
		bodyModel[208] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[209] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[210] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[211] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[212] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[213] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[214] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[215] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[216] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[217] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[218] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[219] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[220] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[221] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[222] = new ModelRendererTurbo(this, 101, 125, textureX, textureY); // Box 267
		bodyModel[223] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[224] = new ModelRendererTurbo(this, 88, 125, textureX, textureY); // Box 265
		bodyModel[225] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[226] = new ModelRendererTurbo(this, 104, 136, textureX, textureY); // Box 260
		bodyModel[227] = new ModelRendererTurbo(this, 89, 136, textureX, textureY); // Box 258
		bodyModel[228] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[229] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[230] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[231] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[232] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[233] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 245
		bodyModel[234] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[235] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[236] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[237] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[238] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[239] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[240] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[241] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[242] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[243] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[244] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[245] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[246] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[247] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[248] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[249] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[250] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[251] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[252] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 204
		bodyModel[253] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[254] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[255] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[256] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[257] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[258] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[259] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[260] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[261] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[262] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[263] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[264] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[265] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[266] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[267] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[268] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[269] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[270] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 7
		bodyModel[271] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 6
		bodyModel[272] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[274] = new ModelRendererTurbo(this, 297, 231, textureX, textureY); // Box 23
		bodyModel[275] = new ModelRendererTurbo(this, 95, 233, textureX, textureY); // Box 63
		bodyModel[276] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[277] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 409
		bodyModel[278] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[279] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[280] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[281] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[282] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[283] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 408
		bodyModel[284] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[285] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[286] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[287] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // Box 195
		bodyModel[288] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[289] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[290] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[291] = new ModelRendererTurbo(this, 133, 90, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[292] = new ModelRendererTurbo(this, 125, 87, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[293] = new ModelRendererTurbo(this, 173, 57, textureX, textureY); // Box 184 o2 generator
		bodyModel[294] = new ModelRendererTurbo(this, 170, 25, textureX, textureY); // Box 361
		bodyModel[295] = new ModelRendererTurbo(this, 175, 22, textureX, textureY); // Box 362
		bodyModel[296] = new ModelRendererTurbo(this, 177, 28, textureX, textureY); // Box 363
		bodyModel[297] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 364
		bodyModel[298] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[299] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[300] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[301] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[302] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[303] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[304] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[305] = new ModelRendererTurbo(this, 279, 164, textureX, textureY); // Box 564
		bodyModel[306] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 565
		bodyModel[307] = new ModelRendererTurbo(this, 275, 160, textureX, textureY); // Box 566
		bodyModel[308] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 567
		bodyModel[309] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 568
		bodyModel[310] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 569
		bodyModel[311] = new ModelRendererTurbo(this, 307, 176, textureX, textureY); // Box 570
		bodyModel[312] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[313] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[314] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[315] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[316] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 576
		bodyModel[317] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 577
		bodyModel[318] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[319] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[320] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[321] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box 563
		bodyModel[322] = new ModelRendererTurbo(this, 231, 153, textureX, textureY); // Box 575
		bodyModel[323] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 436
		bodyModel[324] = new ModelRendererTurbo(this, 325, 137, textureX, textureY); // Box 437
		bodyModel[325] = new ModelRendererTurbo(this, 330, 142, textureX, textureY); // Box 438
		bodyModel[326] = new ModelRendererTurbo(this, 325, 142, textureX, textureY); // Box 439
		bodyModel[327] = new ModelRendererTurbo(this, 383, 65, textureX, textureY); // Box 201
		bodyModel[328] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 200
		bodyModel[329] = new ModelRendererTurbo(this, 353, 110, textureX, textureY); // Box 197
		bodyModel[330] = new ModelRendererTurbo(this, 372, 114, textureX, textureY); // Box 113
		bodyModel[331] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[332] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 199
		bodyModel[333] = new ModelRendererTurbo(this, 380, 65, textureX, textureY); // Box 198
		bodyModel[334] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[335] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 116
		bodyModel[336] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[337] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[338] = new ModelRendererTurbo(this, 374, 149, textureX, textureY); // Box 261
		bodyModel[339] = new ModelRendererTurbo(this, 392, 149, textureX, textureY); // Box 262
		bodyModel[340] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[341] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[342] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[343] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[344] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[345] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[346] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[347] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 546
		bodyModel[348] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[349] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 554
		bodyModel[350] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[351] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[352] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[353] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[354] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[355] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[356] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[357] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[358] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[359] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[360] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 271
		bodyModel[361] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[362] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[363] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[364] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[365] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[366] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[367] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[368] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[369] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[370] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[371] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[372] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[373] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[374] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[375] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[376] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[377] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[378] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[379] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[380] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[381] = new ModelRendererTurbo(this, 404, 168, textureX, textureY); // Box 560
		bodyModel[382] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 561
		bodyModel[383] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[384] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 244
		bodyModel[385] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 249
		bodyModel[386] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[387] = new ModelRendererTurbo(this, 370, 160, textureX, textureY); // Box 542
		bodyModel[388] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 543
		bodyModel[389] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[390] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[391] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[392] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[393] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[394] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[395] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[396] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[397] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[398] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[399] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[400] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[401] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[402] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[403] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[404] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[405] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[406] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[407] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[408] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[409] = new ModelRendererTurbo(this, 84, 45, textureX, textureY); // Box 43
		bodyModel[410] = new ModelRendererTurbo(this, 151, 69, textureX, textureY); // Box 355 brakewheel
		bodyModel[411] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[412] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[413] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 headlight front gyralight sp red
		bodyModel[414] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317 sp light nose housing
		bodyModel[415] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20 sp nose filler
		bodyModel[416] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[417] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[418] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[419] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[420] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[421] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 303
		bodyModel[422] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 304
		bodyModel[423] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 305
		bodyModel[424] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 836
		bodyModel[425] = new ModelRendererTurbo(this, 369, 22, textureX, textureY); // Box 879 dynamics short
		bodyModel[426] = new ModelRendererTurbo(this, 369, 15, textureX, textureY); // Box 880 dynamics short
		bodyModel[427] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[428] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[429] = new ModelRendererTurbo(this, 456, 191, textureX, textureY); // Box 1165
		bodyModel[430] = new ModelRendererTurbo(this, 409, 188, textureX, textureY); // Box 1166
		bodyModel[431] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 1167
		bodyModel[432] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 1168
		bodyModel[433] = new ModelRendererTurbo(this, 441, 165, textureX, textureY); // Box 1169
		bodyModel[434] = new ModelRendererTurbo(this, 426, 163, textureX, textureY); // Box 1170
		bodyModel[435] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 1171
		bodyModel[436] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 1172
		bodyModel[437] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 1173
		bodyModel[438] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 1174
		bodyModel[439] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[440] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[441] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 24
		bodyModel[442] = new ModelRendererTurbo(this, 38, 195, textureX, textureY); // Box 25
		bodyModel[443] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[444] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 4
		bodyModel[445] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[446] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 4
		bodyModel[447] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[448] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[449] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[450] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[451] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 4
		bodyModel[452] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[453] = new ModelRendererTurbo(this, 59, 240, textureX, textureY); // Box 352
		bodyModel[454] = new ModelRendererTurbo(this, 60, 231, textureX, textureY); // Box 353
		bodyModel[455] = new ModelRendererTurbo(this, 2, 231, textureX, textureY); // Box 354
		bodyModel[456] = new ModelRendererTurbo(this, 2, 221, textureX, textureY); // Box 356
		bodyModel[457] = new ModelRendererTurbo(this, 60, 221, textureX, textureY); // Box 357
		bodyModel[458] = new ModelRendererTurbo(this, 22, 228, textureX, textureY); // Box 358
		bodyModel[459] = new ModelRendererTurbo(this, 1, 240, textureX, textureY); // Box 355
		bodyModel[460] = new ModelRendererTurbo(this, 61, 234, textureX, textureY); // Box 542
		bodyModel[461] = new ModelRendererTurbo(this, 38, 217, textureX, textureY); // Box 544 snoot sandcap
		bodyModel[462] = new ModelRendererTurbo(this, 48, 236, textureX, textureY); // Box 386 brakewheel snoot
		bodyModel[463] = new ModelRendererTurbo(this, 21, 236, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[464] = new ModelRendererTurbo(this, 21, 236, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[465] = new ModelRendererTurbo(this, 29, 236, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[466] = new ModelRendererTurbo(this, 21, 231, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[467] = new ModelRendererTurbo(this, 36, 220, textureX, textureY); // Box 391
		bodyModel[468] = new ModelRendererTurbo(this, 45, 228, textureX, textureY); // Box 392
		bodyModel[469] = new ModelRendererTurbo(this, 31, 228, textureX, textureY); // Box 393
		bodyModel[470] = new ModelRendererTurbo(this, 32, 83, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[471] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[472] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 444
		bodyModel[473] = new ModelRendererTurbo(this, 449, 101, textureX, textureY); // Box 445
		bodyModel[474] = new ModelRendererTurbo(this, 449, 109, textureX, textureY); // Box 527 brakewheel rear
		bodyModel[475] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[476] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[477] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[478] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[479] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[480] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[481] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[482] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[483] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[484] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[485] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[486] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[487] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[488] = new ModelRendererTurbo(this, 219, 12, textureX, textureY); // Box 409 commander base
		bodyModel[489] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[490] = new ModelRendererTurbo(this, 219, 19, textureX, textureY); // Box 409 commander base
		bodyModel[491] = new ModelRendererTurbo(this, 219, 15, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[492] = new ModelRendererTurbo(this, 160, 57, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[493] = new ModelRendererTurbo(this, 167, 55, textureX, textureY); // Box 450
		bodyModel[494] = new ModelRendererTurbo(this, 247, 32, textureX, textureY); // Box 606
		bodyModel[495] = new ModelRendererTurbo(this, 238, 26, textureX, textureY); // Box 607
		bodyModel[496] = new ModelRendererTurbo(this, 240, 29, textureX, textureY); // Box 608
		bodyModel[497] = new ModelRendererTurbo(this, 240, 35, textureX, textureY); // Box 609
		bodyModel[498] = new ModelRendererTurbo(this, 238, 38, textureX, textureY); // Box 610
		bodyModel[499] = new ModelRendererTurbo(this, 236, 32, textureX, textureY); // Box 611

		bodyModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[0].setRotationPoint(34.5F, -22.75F, 5.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[1].setRotationPoint(36F, -22.75F, 3.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[2].setRotationPoint(-43.25F, -21.5F, -0.25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[3].setRotationPoint(-43.5F, -22F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[4].setRotationPoint(-43.5F, -23F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
		bodyModel[5].setRotationPoint(-43.25F, -23.51F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[6].setRotationPoint(-42.5F, -23F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399 cull bell holder
		bodyModel[7].setRotationPoint(39.5F, -23F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 397
		bodyModel[8].setRotationPoint(41.25F, -23.51F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[9].setRotationPoint(41.25F, -21.5F, -0.25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[10].setRotationPoint(41.5F, -22F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[11].setRotationPoint(41.5F, -23F, -0.5F);

		bodyModel[12].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[12].setRotationPoint(-25.5F, -16.25F, -4F);
		bodyModel[12].rotateAngleY = 0.78539816F;

		bodyModel[13].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[13].setRotationPoint(-25.5F, -16.25F, -4F);
		bodyModel[13].rotateAngleY = 0.78539816F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[14].setRotationPoint(41.25F, -23F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[15].setRotationPoint(41.5F, -23F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[16].setRotationPoint(41.5F, -21F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[17].setRotationPoint(41.5F, -21F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[18].setRotationPoint(41.25F, -21F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 381 sp mount
		bodyModel[19].setRotationPoint(40.25F, -23F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[20].setRotationPoint(-19F, -20F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[21].setRotationPoint(15.5F, -21.5F, 6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[22].setRotationPoint(15.75F, -19F, 7.95F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[23].setRotationPoint(15.5F, -20.5F, 7.7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[24].setRotationPoint(15.5F, -19.5F, 7.7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[25].setRotationPoint(-22.5F, -28F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[26].setRotationPoint(-22.5F, -28F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[27].setRotationPoint(-22.5F, -27F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[28].setRotationPoint(-22.5F, -27F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[29].setRotationPoint(-22.5F, -25F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[30].setRotationPoint(-22.5F, -25F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[31].setRotationPoint(-22.5F, -25F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[32].setRotationPoint(-22.5F, -25F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[33].setRotationPoint(-22.5F, -27F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[34].setRotationPoint(-22.5F, -27F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[35].setRotationPoint(-22.5F, -28F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[36].setRotationPoint(-22.5F, -28F, 6F);

		bodyModel[37].addShapeBox(-6F, 0F, 1F, 1, 0, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F); // Box 34
		bodyModel[37].setRotationPoint(38F, -21.01F, 7F);
		bodyModel[37].rotateAngleZ = -1.57079633F;

		bodyModel[38].addShapeBox(-6F, 0F, -4F, 1, 0, 3, 0F,-1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[38].setRotationPoint(38F, -21.01F, -7F);
		bodyModel[38].rotateAngleZ = -1.57079633F;

		bodyModel[39].addShapeBox(-4F, 0F, 1F, 1, 0, 4, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 34
		bodyModel[39].setRotationPoint(38F, -21.01F, 7F);
		bodyModel[39].rotateAngleZ = -1.57079633F;

		bodyModel[40].addShapeBox(-4F, 0F, -5F, 1, 0, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 34
		bodyModel[40].setRotationPoint(38F, -21.01F, -7F);
		bodyModel[40].rotateAngleZ = -1.57079633F;

		bodyModel[41].addBox(-8F, 0F, -1F, 8, 0, 16, 0F); // Box 34
		bodyModel[41].setRotationPoint(38F, -21.01F, -7F);
		bodyModel[41].rotateAngleZ = -1.57079633F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[42].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[43].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[44].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[45].setRotationPoint(-25F, -22.5F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[46].setRotationPoint(-25F, -22F, -1F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[47].setRotationPoint(-28.5F, -23F, -3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[48].setRotationPoint(-29.5F, -23F, -3.5F);

		bodyModel[49].addShapeBox(3F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 mega bubble
		bodyModel[49].setRotationPoint(-18F, -4F, -11F);

		bodyModel[50].addShapeBox(3F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 mega bubble
		bodyModel[50].setRotationPoint(-18F, -5F, -10F);

		bodyModel[51].addShapeBox(3F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 mega bubble
		bodyModel[51].setRotationPoint(-18F, -15F, -8F);

		bodyModel[52].addShapeBox(3F, 0F, 0F, 8, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130 mega bubble
		bodyModel[52].setRotationPoint(-18F, -14F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[53].setRotationPoint(-13.5F, 3.25F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[54].setRotationPoint(-14F, 2.75F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[55].setRotationPoint(-14F, 1.75F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[56].setRotationPoint(-14F, 3.25F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[57].setRotationPoint(-30F, -22.5F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[58].setRotationPoint(-30F, -22.5F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[59].setRotationPoint(-30F, -22.5F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[60].setRotationPoint(-30F, -22.5F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[61].setRotationPoint(-30F, -22F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[62].setRotationPoint(-28F, -23F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[63].setRotationPoint(-28F, -23F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[64].setRotationPoint(-28F, -23F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[65].setRotationPoint(-28F, -23F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[66].setRotationPoint(-28F, -22.5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[67].setRotationPoint(-28.5F, -21.5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[68].setRotationPoint(47F, 0F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[69].setRotationPoint(47F, 0F, 0F);

		bodyModel[70].addBox(0F, 0F, 0F, 9, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[70].setRotationPoint(15F, -22.75F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[71].setRotationPoint(-26F, -17F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[72].setRotationPoint(-26F, -16F, 10F);

		bodyModel[73].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[73].setRotationPoint(-26.5F, -14F, -5F);
		bodyModel[73].rotateAngleY = -0.38397244F;

		bodyModel[74].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[74].setRotationPoint(-28.1F, -12F, -5F);
		bodyModel[74].rotateAngleY = -0.38397244F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[75].setRotationPoint(-28F, -13F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[76].setRotationPoint(-28.5F, -21F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[77].setRotationPoint(-28F, -22.5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[78].setRotationPoint(-28F, -22.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[79].setRotationPoint(-28F, -22.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[80].setRotationPoint(-28F, -22.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[81].setRotationPoint(-28F, -22F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[82].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[83].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[84].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[85].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r 1
		bodyModel[86].setRotationPoint(47.25F, -3F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r 1
		bodyModel[87].setRotationPoint(47.25F, -3F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[88].setRotationPoint(47F, -3F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[89].setRotationPoint(47F, -3F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f 1
		bodyModel[90].setRotationPoint(-48.25F, -3F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f 1
		bodyModel[91].setRotationPoint(-48.25F, -3F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[92].setRotationPoint(-48F, -3F, 3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[93].setRotationPoint(-48F, -3F, -5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[94].setRotationPoint(-37F, -2F, 7F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[95].setRotationPoint(-36F, -2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[96].setRotationPoint(-30F, -17F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[97].setRotationPoint(-30F, -17F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r 3
		bodyModel[98].setRotationPoint(46.75F, 1F, 3.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r 3
		bodyModel[99].setRotationPoint(46.75F, 1F, -5.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[100].setRotationPoint(46.5F, 1F, -5.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[101].setRotationPoint(46.5F, 1F, 3.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[102].setRotationPoint(-18F, -24F, 4F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 369 cull
		bodyModel[103].setRotationPoint(-18F, -23F, 2F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[104].setRotationPoint(-30F, -22F, -0.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[105].setRotationPoint(-32F, -22.75F, -1.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[106].setRotationPoint(-31.5F, -22.75F, 0.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[107].setRotationPoint(-32.5F, -23F, -0.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[108].setRotationPoint(-39F, -21.5F, -0.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 numberboard hh
		bodyModel[109].setRotationPoint(-39.5F, -16F, -6F);
		bodyModel[109].rotateAngleY = 0.40142573F;

		bodyModel[110].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 numberboard hh
		bodyModel[110].setRotationPoint(-39.5F, -16F, 6F);
		bodyModel[110].rotateAngleY = -0.40142573F;

		bodyModel[111].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[111].setRotationPoint(-42.25F, -19F, -2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f hh
		bodyModel[112].setRotationPoint(-42.5F, -19F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f hh
		bodyModel[113].setRotationPoint(-42.5F, -19F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[114].setRotationPoint(-42F, -21F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[115].setRotationPoint(-42F, -21F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[116].setRotationPoint(-39F, -21F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[117].setRotationPoint(-43.5F, -7.5F, -0.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 440
		bodyModel[118].setRotationPoint(-43F, -8F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[119].setRotationPoint(-13F, -23F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight o canada
		bodyModel[120].setRotationPoint(40.5F, -19F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[121].setRotationPoint(37F, -23.5F, 3.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[122].setRotationPoint(36F, -22F, 4.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[123].setRotationPoint(36F, -23F, 4.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[124].setRotationPoint(7F, -23.5F, -9F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[125].setRotationPoint(7F, -23.5F, -7.75F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[126].setRotationPoint(8F, -21.5F, -8.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[127].setRotationPoint(6F, -22.25F, -9.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[128].setRotationPoint(6.5F, -22.25F, -7.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[129].setRotationPoint(5.5F, -22.5F, -8.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[130].setRotationPoint(-31.75F, -23F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[131].setRotationPoint(-31.75F, -23F, 0F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[132].setRotationPoint(-31F, -23F, -2F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[133].setRotationPoint(-28F, -16F, 11F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[134].setRotationPoint(-28F, -16F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[135].setRotationPoint(-26F, -18F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[136].setRotationPoint(-26F, -18F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[137].setRotationPoint(-47.5F, 1F, 3.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f 3
		bodyModel[138].setRotationPoint(-47.75F, 1F, 3.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[139].setRotationPoint(-47.5F, 1F, -5.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f 3
		bodyModel[140].setRotationPoint(-47.75F, 1F, -5.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[141].setRotationPoint(-22F, -22F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[142].setRotationPoint(-16.5F, -21.5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[143].setRotationPoint(-16.25F, -19F, -8.95F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[144].setRotationPoint(-16.5F, -20.5F, -9.2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[145].setRotationPoint(-16.5F, -19.5F, -9.2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[146].setRotationPoint(46F, -2F, 4.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r 2
		bodyModel[147].setRotationPoint(46.25F, -2F, 4.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r 2
		bodyModel[148].setRotationPoint(46.25F, -2F, -6.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[149].setRotationPoint(46F, -2F, -6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f 2
		bodyModel[150].setRotationPoint(-47.25F, -2F, -6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f 2
		bodyModel[151].setRotationPoint(-47.25F, -2F, 4.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[152].setRotationPoint(-47F, -2F, -6.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[153].setRotationPoint(-47F, -2F, 4.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[154].setRotationPoint(-13.25F, 3.25F, -10.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[155].setRotationPoint(-13.5F, 1.75F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[156].setRotationPoint(-13.5F, 2.75F, -10.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 382
		bodyModel[157].setRotationPoint(-23.5F, -22F, -8F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[158].setRotationPoint(12F, -23.5F, -5.25F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[159].setRotationPoint(13F, -23.5F, -6.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[160].setRotationPoint(14F, -22.5F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[161].setRotationPoint(-23F, -23F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[162].setRotationPoint(-26F, -23F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 374 cull
		bodyModel[163].setRotationPoint(-26F, -22F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 367 cull
		bodyModel[164].setRotationPoint(-26F, -22F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[165].setRotationPoint(-27F, -22F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[166].setRotationPoint(-27F, -23F, 2F);

		bodyModel[167].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[167].setRotationPoint(-26F, -23F, 2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[168].setRotationPoint(-27F, -22F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[169].setRotationPoint(-27F, -23F, -6F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[170].setRotationPoint(-26F, -23F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[171].setRotationPoint(-32.5F, -21F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[172].setRotationPoint(-32.25F, -18.5F, -0.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[173].setRotationPoint(-32.5F, -20F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[174].setRotationPoint(-32.5F, -19F, -0.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[175].setRotationPoint(-37F, -11F, -7.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[176].setRotationPoint(-42F, -13F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[177].setRotationPoint(-7F, -21F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[178].setRotationPoint(12F, -21F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[179].setRotationPoint(12F, -21F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[180].setRotationPoint(-7F, -21F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[181].setRotationPoint(-3F, -21F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[182].setRotationPoint(-3F, -21F, -9F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[183].setRotationPoint(-38F, -9F, -7F);

		bodyModel[184].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[184].setRotationPoint(-36F, -13F, -7F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[185].setRotationPoint(-37F, -6.5F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[186].setRotationPoint(-37.5F, -8.5F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[187].setRotationPoint(-34F, -21F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[188].setRotationPoint(-34F, -21F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[189].setRotationPoint(-33F, -21F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[190].setRotationPoint(37.75F, -21.5F, -0.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[191].setRotationPoint(13.5F, -22F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[192].setRotationPoint(24F, -8F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[193].setRotationPoint(22F, -10F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[194].setRotationPoint(-17F, -12F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 312
		bodyModel[195].setRotationPoint(-15F, -10F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[196].setRotationPoint(40.5F, -19F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[197].setRotationPoint(40.5F, -19F, -2F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[198].setRotationPoint(39.25F, -19F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[199].setRotationPoint(-48F, 0F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[200].setRotationPoint(-48F, 0F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[201].setRotationPoint(-48F, 0F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[202].setRotationPoint(47F, 0F, 5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F); // Box 296
		bodyModel[203].setRotationPoint(-16F, -10F, 11.01F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[204].setRotationPoint(-17F, -12F, 11F);

		bodyModel[205].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[205].setRotationPoint(-13F, -8F, 11F);

		bodyModel[206].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[206].setRotationPoint(-16.05F, -20.5F, 6.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[207].setRotationPoint(-16.05F, -20.5F, -7.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[208].setRotationPoint(-37F, -4F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[209].setRotationPoint(-38F, -4F, 11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[210].setRotationPoint(-38F, -4F, -11.01F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 281
		bodyModel[211].setRotationPoint(-37F, -4F, -11.01F);

		bodyModel[212].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[212].setRotationPoint(6F, -22F, -3F);

		bodyModel[213].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[213].setRotationPoint(-1F, -22F, -3F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[214].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[215].setRotationPoint(-6F, -22.5F, -2.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[216].setRotationPoint(-15F, -22F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[217].setRotationPoint(-15F, -15F, -9F);

		bodyModel[218].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[218].setRotationPoint(-15F, -13F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[219].setRotationPoint(-17F, -10F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[220].setRotationPoint(-49F, 0F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[221].setRotationPoint(-49F, 0F, -7F);

		bodyModel[222].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 267
		bodyModel[222].setRotationPoint(-37F, -12F, 11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[223].setRotationPoint(-39F, -8F, 11F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[224].setRotationPoint(-43F, -8F, 11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[225].setRotationPoint(-39F, -8F, -11F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[226].setRotationPoint(-35F, -12F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 258
		bodyModel[227].setRotationPoint(-43F, -8F, -11F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[228].setRotationPoint(-43F, -8F, 9F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[229].setRotationPoint(-43F, -6F, 10.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[230].setRotationPoint(-43F, -6F, -11.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[231].setRotationPoint(-43F, -8F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[232].setRotationPoint(-36F, -4F, 7F);

		bodyModel[233].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 245
		bodyModel[233].setRotationPoint(-35F, -4F, -11F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[234].setRotationPoint(-47F, 7F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[235].setRotationPoint(-47F, 8F, -10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[236].setRotationPoint(47F, 8F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[237].setRotationPoint(-29F, -21F, 7F);

		bodyModel[238].addShapeBox(-0.5F, 0F, -3.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[238].setRotationPoint(-17.5F, -21F, 10.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[239].setRotationPoint(-28F, -21F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[240].setRotationPoint(-28F, -21F, -11F);

		bodyModel[241].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[241].setRotationPoint(-28F, -21F, -7F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[242].setRotationPoint(-18F, -21F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[243].setRotationPoint(-31.5F, -19F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[244].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[245].setRotationPoint(-31F, -21F, 1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[246].setRotationPoint(-31F, -21F, -6F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[247].setRotationPoint(-31F, -21F, -1F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[248].setRotationPoint(-29F, -21F, -7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[249].setRotationPoint(-18F, -21F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[250].setRotationPoint(-29F, -21F, -11F);

		bodyModel[251].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[251].setRotationPoint(47F, 7F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[252].setRotationPoint(47F, 0F, -6F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[253].setRotationPoint(47F, 0F, -5F);

		bodyModel[254].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[254].setRotationPoint(-29F, -4F, -11F);

		bodyModel[255].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[255].setRotationPoint(-17.5F, -18F, 10.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[256].setRotationPoint(-29F, -18F, -7F);

		bodyModel[257].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[257].setRotationPoint(-28F, -18F, -11F);

		bodyModel[258].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[258].setRotationPoint(-28F, -18F, 10F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[259].setRotationPoint(-18F, -18F, -11F);

		bodyModel[260].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[260].setRotationPoint(-28.5F, -18F, -10.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[261].setRotationPoint(47F, 2.5F, -2F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[262].setRotationPoint(47F, 3F, -1.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[263].setRotationPoint(47F, 0F, -10F);

		bodyModel[264].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[264].setRotationPoint(-42F, 0F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[265].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[266].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[266].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[267].setRotationPoint(-47F, 0F, -10F);

		bodyModel[268].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[268].setRotationPoint(-17F, -21F, -7F);

		bodyModel[269].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[269].setRotationPoint(-17F, -2F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[270].setRotationPoint(38F, -21F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[271].setRotationPoint(38F, -21F, 0F);

		bodyModel[272].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[272].setRotationPoint(-42F, 0F, -11F);

		bodyModel[273].addBox(0F, 0F, 0F, 94, 1, 14, 0F); // Box 170
		bodyModel[273].setRotationPoint(-47F, 0F, -7F);

		bodyModel[274].addBox(0F, 0F, 0F, 94, 2, 12, 0F); // Box 23
		bodyModel[274].setRotationPoint(-47F, 1F, -6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[275].setRotationPoint(-47F, 3F, -6.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[276].setRotationPoint(-29.5F, 3F, -2F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[277].setRotationPoint(-29F, 1F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[278].setRotationPoint(-29F, 2F, -10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[279].setRotationPoint(-29F, 2F, 6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[280].setRotationPoint(-28F, 2F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[281].setRotationPoint(-28F, 2F, 9F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[282].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[283].setRotationPoint(26F, 1F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[284].setRotationPoint(26F, 2F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[285].setRotationPoint(27F, 2F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[286].setRotationPoint(26F, 2F, 6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[287].setRotationPoint(27F, 2F, 9F);

		bodyModel[288].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[288].setRotationPoint(31F, -22.5F, -3F);

		bodyModel[289].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[289].setRotationPoint(24F, -22.5F, -3F);

		bodyModel[290].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[290].setRotationPoint(17F, -22.5F, -3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[291].setRotationPoint(-29.05F, -19.5F, -6F);
		bodyModel[291].rotateAngleY = 0.38397244F;

		bodyModel[292].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[292].setRotationPoint(-29.05F, -19.5F, 6F);
		bodyModel[292].rotateAngleY = -0.38397244F;

		bodyModel[293].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[293].setRotationPoint(-26F, -22.75F, -4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[294].setRotationPoint(17.5F, -22.5F, 5F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[295].setRotationPoint(15.5F, -23.5F, 6.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[296].setRotationPoint(16.5F, -23.5F, 4.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[297].setRotationPoint(17.5F, -23.5F, 5.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[298].setRotationPoint(-7.5F, 3F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[299].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[300].setRotationPoint(-7.5F, 6F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[301].setRotationPoint(-7.5F, 6F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[302].setRotationPoint(-7.5F, 2F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[303].setRotationPoint(-7.5F, 6F, 9F);

		bodyModel[304].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[304].setRotationPoint(-7.5F, 2F, -8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[305].setRotationPoint(8.5F, 6F, -9F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[306].setRotationPoint(8.5F, 6F, -11F);

		bodyModel[307].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[307].setRotationPoint(8.5F, 3F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[308].setRotationPoint(8.5F, 2F, -11F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[309].setRotationPoint(8.5F, 2F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[310].setRotationPoint(8.5F, 2F, 8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[311].setRotationPoint(8.5F, 6F, 9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[312].setRotationPoint(-11.5F, 6F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[313].setRotationPoint(-11.5F, 6F, -11F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[314].setRotationPoint(-11.5F, 3F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[315].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[316].setRotationPoint(-11.5F, 6F, 9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[317].setRotationPoint(-11.5F, 2F, 8F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[318].setRotationPoint(-6.5F, 2F, -11.25F);
		bodyModel[318].rotateAngleX = 1.02974426F;

		bodyModel[319].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[319].setRotationPoint(-6.5F, 2F, 11.25F);
		bodyModel[319].rotateAngleX = 1.02974426F;
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[320].setRotationPoint(-4F, 1.3F, -9.5F);
		bodyModel[320].rotateAngleX = 0.78539816F;

		bodyModel[321].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[321].setRotationPoint(-4F, 1.3F, 9.5F);
		bodyModel[321].rotateAngleX = 0.78539816F;

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[322].setRotationPoint(-11.5F, 2F, -8F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[323].setRotationPoint(-10.5F, 2F, -11.25F);
		bodyModel[323].rotateAngleX = 1.02974426F;

		bodyModel[324].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[324].setRotationPoint(-10.5F, 2F, 11.25F);
		bodyModel[324].rotateAngleX = 1.02974426F;
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[325].setRotationPoint(11.25F, 2F, -11.25F);
		bodyModel[325].rotateAngleX = 1.02974426F;

		bodyModel[326].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[326].setRotationPoint(11.25F, 2F, 11.25F);
		bodyModel[326].rotateAngleX = 1.02974426F;
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[327].setRotationPoint(12F, 1F, 11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[328].setRotationPoint(13F, 1F, 11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[329].setRotationPoint(12F, 1F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[330].setRotationPoint(13F, 1F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[331].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[332].setRotationPoint(-42F, 1F, 11F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[333].setRotationPoint(-13F, 1F, 11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[334].setRotationPoint(-42F, 1F, -11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[335].setRotationPoint(-13F, 1F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[336].setRotationPoint(42F, 1F, -11F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[337].setRotationPoint(42F, 1F, 7F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[338].setRotationPoint(42F, 0F, -11F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[339].setRotationPoint(42F, 0F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[340].setRotationPoint(42F, 5F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[341].setRotationPoint(42F, 5F, 7F);

		bodyModel[342].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[342].setRotationPoint(43F, 4F, -8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[343].setRotationPoint(43F, 5F, -10F);

		bodyModel[344].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[344].setRotationPoint(43F, 7F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[345].setRotationPoint(43F, 8F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[346].setRotationPoint(43F, 3F, -9F);

		bodyModel[347].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[347].setRotationPoint(43F, 1F, -8F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[348].setRotationPoint(43F, 3F, 7F);

		bodyModel[349].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[349].setRotationPoint(43F, 1F, 7F);

		bodyModel[350].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[350].setRotationPoint(43F, 4F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[351].setRotationPoint(43F, 5F, 8F);

		bodyModel[352].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[352].setRotationPoint(43F, 7F, 9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[353].setRotationPoint(43F, 8F, 9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[354].setRotationPoint(-43F, 1F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[355].setRotationPoint(-43F, 1F, 7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[356].setRotationPoint(-43F, 0F, 7F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[357].setRotationPoint(-43F, 5F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[358].setRotationPoint(-43F, 5F, 7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[359].setRotationPoint(-43F, 0F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[360].setRotationPoint(-47F, 1F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[361].setRotationPoint(-47F, 3F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[362].setRotationPoint(-47F, 8F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[363].setRotationPoint(-47F, 5F, -10F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[364].setRotationPoint(-47F, 7F, -9F);

		bodyModel[365].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[365].setRotationPoint(-47F, 4F, -8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[366].setRotationPoint(-47F, 3F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[367].setRotationPoint(-47F, 1F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[368].setRotationPoint(-47F, 5F, 8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[369].setRotationPoint(-47F, 8F, 9F);

		bodyModel[370].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[370].setRotationPoint(-47F, 7F, 9F);

		bodyModel[371].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[371].setRotationPoint(-47F, 4F, 8F);

		bodyModel[372].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[372].setRotationPoint(47F, -1F, 10F);

		bodyModel[373].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[373].setRotationPoint(47F, -1F, -11F);

		bodyModel[374].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[374].setRotationPoint(47F, -8F, -8F);

		bodyModel[375].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[375].setRotationPoint(47F, -8F, 6F);

		bodyModel[376].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[376].setRotationPoint(48F, -8F, -4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[377].setRotationPoint(47F, -8F, -6F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[378].setRotationPoint(47F, -8F, 4F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[379].setRotationPoint(47.01F, -7F, 7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[380].setRotationPoint(47.01F, -7F, -8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[381].setRotationPoint(47F, -8F, 9F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[382].setRotationPoint(47F, -8F, -8F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[383].setRotationPoint(43F, -8F, 9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[384].setRotationPoint(43F, -7F, 10.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[385].setRotationPoint(43F, -7F, -11.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[386].setRotationPoint(43F, -8F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[387].setRotationPoint(43F, -3F, -11.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[388].setRotationPoint(43F, -3F, 10.5F);

		bodyModel[389].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[389].setRotationPoint(38.5F, -15.5F, -6F);
		bodyModel[389].rotateAngleY = -0.41887902F;

		bodyModel[390].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[390].setRotationPoint(38.5F, -15.5F, 6F);
		bodyModel[390].rotateAngleY = 0.41887902F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[391].setRotationPoint(37.7F, -12F, -6.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[392].setRotationPoint(37.7F, -12F, 4.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[393].setRotationPoint(37.7F, -18F, -6.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[394].setRotationPoint(37.7F, -18F, 4.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[395].setRotationPoint(-42F, -8F, -7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[396].setRotationPoint(-42F, -10F, -7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[397].setRotationPoint(-42F, -10F, 1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[398].setRotationPoint(-42F, -13F, 1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[399].setRotationPoint(-42F, -13F, -7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[400].setRotationPoint(-42F, -8F, 0F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[401].setRotationPoint(-40.98F, -13F, -1F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[402].setRotationPoint(-42F, -13F, 0F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[403].setRotationPoint(-42F, -13F, -1F);

		bodyModel[404].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[404].setRotationPoint(-38F, -13F, -6F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[405].setRotationPoint(-38F, -13F, -7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[406].setRotationPoint(-39.65F, -12F, -6.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[407].setRotationPoint(-39.65F, -12F, 4.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[408].setRotationPoint(-40F, -13.5F, -1F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[409].setRotationPoint(-39F, -13F, -7F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[410].setRotationPoint(-39F, -13F, -7.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[411].setRotationPoint(-41.75F, -12F, -2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[412].setRotationPoint(-41.75F, -12F, 0F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 headlight front gyralight sp red
		bodyModel[413].setRotationPoint(-41.75F, -14F, -1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317 sp light nose housing
		bodyModel[414].setRotationPoint(-40.98F, -14F, -1.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20 sp nose filler
		bodyModel[415].setRotationPoint(-41.15F, -13F, -2F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[416].setRotationPoint(-42F, -11F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[417].setRotationPoint(-42F, -13F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[418].setRotationPoint(-42F, -12F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[419].setRotationPoint(-42F, -10F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[420].setRotationPoint(-31F, -17F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[421].setRotationPoint(-15F, -4F, 11F);

		bodyModel[422].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[422].setRotationPoint(-16F, -2F, 7F);

		bodyModel[423].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[423].setRotationPoint(-17F, -4F, 11F);

		bodyModel[424].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[424].setRotationPoint(-17F, -4F, 7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 879 dynamics short
		bodyModel[425].setRotationPoint(-5F, -21F, -9F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 880 dynamics short
		bodyModel[426].setRotationPoint(-5F, -21F, 7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[427].setRotationPoint(50F, 7F, 0F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[428].setRotationPoint(50F, 7F, -10F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[429].setRotationPoint(49F, 6F, 0F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[430].setRotationPoint(49F, 6F, -10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[431].setRotationPoint(47F, 6F, -10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[432].setRotationPoint(47F, 6F, 0F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[433].setRotationPoint(49F, 5F, 2F);

		bodyModel[434].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[434].setRotationPoint(49F, 5F, -8F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 1171
		bodyModel[435].setRotationPoint(47F, 4F, -10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1172
		bodyModel[436].setRotationPoint(47F, 4F, 2F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 1F, -1F, 1F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1173
		bodyModel[437].setRotationPoint(47F, 3F, 2F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 1F, -2F, 1F, 1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 1174
		bodyModel[438].setRotationPoint(47.5F, 3F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[439].setRotationPoint(-51F, 7F, 0F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[440].setRotationPoint(-51F, 7F, -10F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[441].setRotationPoint(-50F, 6F, 0F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[442].setRotationPoint(-50F, 6F, -10F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[443].setRotationPoint(-50F, 6F, 0F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 1F, -1.5F, 1F, 1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[444].setRotationPoint(-50F, 3F, 2F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[445].setRotationPoint(-50F, 6F, -10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 1F, -0.5F, 1F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[446].setRotationPoint(-50.5F, 3F, -10F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[447].setRotationPoint(-50F, 4F, 2F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[448].setRotationPoint(-50F, 4F, -10F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[449].setRotationPoint(-50F, 5F, 2F);

		bodyModel[450].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[450].setRotationPoint(-50F, 5F, -8F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[451].setRotationPoint(-47F, 3F, -2.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[452].setRotationPoint(42F, 3F, -2.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[453].setRotationPoint(-45F, -8F, -7F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[454].setRotationPoint(-45F, -10F, -7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[455].setRotationPoint(-45F, -10F, 1F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[456].setRotationPoint(-45F, -13F, 1F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[457].setRotationPoint(-45F, -13F, -7F);

		bodyModel[458].addBox(0F, 0F, 0F, 3, 13, 14, 0F); // Box 358
		bodyModel[458].setRotationPoint(-42F, -13F, -7F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[459].setRotationPoint(-45F, -8F, 0F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 542
		bodyModel[460].setRotationPoint(-40F, -11F, -7.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 544 snoot sandcap
		bodyModel[461].setRotationPoint(-42.5F, -13.5F, -0.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 386 brakewheel snoot
		bodyModel[462].setRotationPoint(-42F, -13F, -7.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[463].setRotationPoint(-45F, -11F, -1F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[464].setRotationPoint(-45F, -13F, -1F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[465].setRotationPoint(-45F, -12F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[466].setRotationPoint(-45F, -10F, -1F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 391
		bodyModel[467].setRotationPoint(-43.98F, -13F, -1F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[468].setRotationPoint(-45F, -13F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 393
		bodyModel[469].setRotationPoint(-45F, -13F, 0F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[470].setRotationPoint(-42.65F, -12F, -6.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[471].setRotationPoint(-42.65F, -12F, 4.5F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[472].setRotationPoint(41.5F, -7.5F, -0.5F);

		bodyModel[473].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 445
		bodyModel[473].setRotationPoint(41F, -8F, -2F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527 brakewheel rear
		bodyModel[474].setRotationPoint(42.5F, -9.5F, -2.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[475].setRotationPoint(-47F, -8F, -8F);
		bodyModel[475].rotateAngleY = -3.14159265F;

		bodyModel[476].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[476].setRotationPoint(-47F, -1F, 10F);

		bodyModel[477].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[477].setRotationPoint(-47F, -1F, -11F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[478].setRotationPoint(-47F, -8F, -6F);

		bodyModel[479].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[479].setRotationPoint(-47F, -8F, -8F);

		bodyModel[480].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[480].setRotationPoint(-48F, -8F, -4F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[481].setRotationPoint(-47F, -8F, 4F);

		bodyModel[482].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[482].setRotationPoint(-47F, -8F, 6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[483].setRotationPoint(-47.01F, -7F, -8F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[484].setRotationPoint(-47.01F, -7F, 7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[485].setRotationPoint(-47F, -8F, 9F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[486].setRotationPoint(-48.5F, -3F, -2F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[487].setRotationPoint(-48.5F, -4F, -2F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[488].setRotationPoint(-24.5F, -22F, -0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[489].setRotationPoint(-24.5F, -23F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[490].setRotationPoint(-28.5F, -22F, -0.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[491].setRotationPoint(-28.5F, -23F, -0.5F);

		bodyModel[492].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[492].setRotationPoint(-20.5F, -23F, -2.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[493].setRotationPoint(-19.5F, -24F, 0F);

		bodyModel[494].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 606
		bodyModel[494].setRotationPoint(-38F, -21.5F, -5.5F);

		bodyModel[495].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 607
		bodyModel[495].setRotationPoint(-39.5F, -22.25F, -4.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 608
		bodyModel[496].setRotationPoint(-39F, -23.5F, -4.75F);

		bodyModel[497].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 609
		bodyModel[497].setRotationPoint(-39F, -23.5F, -6F);

		bodyModel[498].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 610
		bodyModel[498].setRotationPoint(-40F, -22.25F, -6.5F);

		bodyModel[499].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 611
		bodyModel[499].setRotationPoint(-40.5F, -22.5F, -5.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 38, 106, textureX, textureY); // Box 612 front brakewheel
		bodyModel[501] = new ModelRendererTurbo(this, 419, 162, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[502] = new ModelRendererTurbo(this, 419, 156, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[503] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[504] = new ModelRendererTurbo(this, 327, 181, textureX, textureY, "cull"); // Box 546 cull
		bodyModel[505] = new ModelRendererTurbo(this, 44, 190, textureX, textureY, "cull"); // Box 567 cull
		bodyModel[506] = new ModelRendererTurbo(this, 92, 123, textureX, textureY); // Box 521
		bodyModel[507] = new ModelRendererTurbo(this, 92, 134, textureX, textureY); // Box 522
		bodyModel[508] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 297 sd40 vent
		bodyModel[509] = new ModelRendererTurbo(this, 384, 220, textureX, textureY); // Box 272 sd40 vent
		bodyModel[510] = new ModelRendererTurbo(this, 427, 220, textureX, textureY); // Box 297 sd40 vent
		bodyModel[511] = new ModelRendererTurbo(this, 384, 220, textureX, textureY); // Box 272 sd40 vent
		bodyModel[512] = new ModelRendererTurbo(this, 471, 219, textureX, textureY); // Box 533 sd40-2 vent
		bodyModel[513] = new ModelRendererTurbo(this, 471, 225, textureX, textureY); // Box 534 sd40-2 vent
		bodyModel[514] = new ModelRendererTurbo(this, 471, 219, textureX, textureY); // Box 533 sd40-2 vent
		bodyModel[515] = new ModelRendererTurbo(this, 471, 225, textureX, textureY); // Box 534 sd40-2 vent
		bodyModel[516] = new ModelRendererTurbo(this, 304, 15, textureX, textureY, "cull"); // Box 524 snowshield cull
		bodyModel[517] = new ModelRendererTurbo(this, 304, 23, textureX, textureY, "cull"); // Box 525 snowshield cull
		bodyModel[518] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[519] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[520] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[521] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[522] = new ModelRendererTurbo(this, 199, 11, textureX, textureY); // Box 421 prime base
		bodyModel[523] = new ModelRendererTurbo(this, 333, 180, textureX, textureY); // Box 546
		bodyModel[524] = new ModelRendererTurbo(this, 50, 189, textureX, textureY); // Box 567
		bodyModel[525] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[526] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[527] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[528] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[529] = new ModelRendererTurbo(this, 409, 186, textureX, textureY); // Box 392
		bodyModel[530] = new ModelRendererTurbo(this, 422, 190, textureX, textureY); // Box 393
		bodyModel[531] = new ModelRendererTurbo(this, 409, 181, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[532] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 395 not a ditchlight will not glow
		bodyModel[533] = new ModelRendererTurbo(this, 19, 170, textureX, textureY, BoxName.ditch); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[534] = new ModelRendererTurbo(this, 19, 170, textureX, textureY, BoxName.ditch); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[535] = new ModelRendererTurbo(this, 411, 191, textureX, textureY, BoxName.ditch); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[536] = new ModelRendererTurbo(this, 411, 191, textureX, textureY, BoxName.ditch); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH

		bodyModel[500].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 612 front brakewheel
		bodyModel[500].setRotationPoint(-43.5F, -9.5F, -2.5F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[501].setRotationPoint(47.5F, -3F, -2F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[502].setRotationPoint(47.5F, -4F, -2F);

		bodyModel[503].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[503].setRotationPoint(-13.5F, 0.75F, -10.9F);

		bodyModel[504].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 546 cull
		bodyModel[504].setRotationPoint(47F, 6F, -9F);

		bodyModel[505].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 567 cull
		bodyModel[505].setRotationPoint(-49F, 6F, -9F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[506].setRotationPoint(-39F, -8F, 11.01F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[507].setRotationPoint(-36F, -8F, -11.01F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 sd40 vent
		bodyModel[508].setRotationPoint(27.65F, -19.5F, -7.15F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 sd40 vent
		bodyModel[509].setRotationPoint(17.65F, -20.5F, -7.15F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10.25F, -5F, 0F, -10.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 sd40 vent
		bodyModel[510].setRotationPoint(27.65F, -19.5F, 6.15F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10.25F, -1F, 0F, -10.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10.25F, -4F, 0F, -10.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 sd40 vent
		bodyModel[511].setRotationPoint(17.65F, -20.5F, 6.15F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 533 sd40-2 vent
		bodyModel[512].setRotationPoint(17.65F, -19.5F, 6.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 534 sd40-2 vent
		bodyModel[513].setRotationPoint(27.65F, -19.5F, 6.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 533 sd40-2 vent
		bodyModel[514].setRotationPoint(17.65F, -19.5F, -7.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F); // Box 534 sd40-2 vent
		bodyModel[515].setRotationPoint(27.65F, -19.5F, -7.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524 snowshield cull
		bodyModel[516].setRotationPoint(-17F, -21F, 7F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525 snowshield cull
		bodyModel[517].setRotationPoint(-17F, -21F, -11F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[518].setRotationPoint(-28.5F, -22.5F, -3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[519].setRotationPoint(-28.5F, -22.5F, -3F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[520].setRotationPoint(-28.5F, -22.5F, -3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[521].setRotationPoint(-28.5F, -22.5F, -3F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[522].setRotationPoint(-28.5F, -22F, -3F);

		bodyModel[523].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 546
		bodyModel[523].setRotationPoint(49F, 8F, -9F);

		bodyModel[524].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 567
		bodyModel[524].setRotationPoint(-51F, 8F, -9F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[525].setRotationPoint(-48F, -2F, -5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[526].setRotationPoint(-48F, -2F, 3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[527].setRotationPoint(-48.25F, -2F, -5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[528].setRotationPoint(-48.25F, -2F, 3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[529].setRotationPoint(47F, -2F, -5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[530].setRotationPoint(47F, -2F, 3F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[531].setRotationPoint(47.25F, -2F, -5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 not a ditchlight will not glow
		bodyModel[532].setRotationPoint(47.25F, -2F, 3F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[533].setRotationPoint(-48.25F, -2.1F, -5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[534].setRotationPoint(-48.25F, -2.1F, 3F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[535].setRotationPoint(47.25F, -2.1F, 3F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[536].setRotationPoint(47.25F, -2.1F, -5F);
	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		
		if (GetColor(entity) == 43324 ) {
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16 || GetColor(entity) == 17) {
			//black regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//sp regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}