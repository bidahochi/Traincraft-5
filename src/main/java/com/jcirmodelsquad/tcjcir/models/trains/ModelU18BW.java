//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.01.2022 - 00:40:01
// Last changed on: 23.01.2022 - 00:40:01

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
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

public class ModelU18BW extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU18BW() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[290];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 257, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 284, 2, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[5] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 218, 102, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 156, 133, textureX, textureY); // Box 63
		bodyModel[12] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[13] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[14] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[15] = new ModelRendererTurbo(this, 271, 82, textureX, textureY); // Box 156
		bodyModel[16] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[17] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[18] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[19] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[20] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[21] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[22] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[23] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[24] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[25] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[26] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[27] = new ModelRendererTurbo(this, 100, 105, textureX, textureY); // box65
		bodyModel[28] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[29] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[30] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[32] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[33] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[34] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[36] = new ModelRendererTurbo(this, 263, 62, textureX, textureY); // Box 251
		bodyModel[37] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[38] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[39] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[40] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[41] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[42] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[43] = new ModelRendererTurbo(this, 159, 79, textureX, textureY); // Box 285
		bodyModel[44] = new ModelRendererTurbo(this, 186, 81, textureX, textureY); // Box 288
		bodyModel[45] = new ModelRendererTurbo(this, 159, 90, textureX, textureY); // Box 300
		bodyModel[46] = new ModelRendererTurbo(this, 186, 90, textureX, textureY); // Box 303
		bodyModel[47] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[48] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 305
		bodyModel[49] = new ModelRendererTurbo(this, 365, 125, textureX, textureY); // Box 305
		bodyModel[50] = new ModelRendererTurbo(this, 336, 85, textureX, textureY); // Box 19
		bodyModel[51] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 357, 98, textureX, textureY); // Box 305
		bodyModel[53] = new ModelRendererTurbo(this, 351, 97, textureX, textureY); // Box 305
		bodyModel[54] = new ModelRendererTurbo(this, 336, 81, textureX, textureY); // Box 440
		bodyModel[55] = new ModelRendererTurbo(this, 346, 81, textureX, textureY); // Box 441
		bodyModel[56] = new ModelRendererTurbo(this, 467, 23, textureX, textureY); // Box 293
		bodyModel[57] = new ModelRendererTurbo(this, 266, 122, textureX, textureY); // Box 19
		bodyModel[58] = new ModelRendererTurbo(this, 266, 105, textureX, textureY); // Box 19
		bodyModel[59] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 240 numberboard
		bodyModel[60] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 241 numberboard
		bodyModel[61] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[62] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[65] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[67] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 2603
		bodyModel[70] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[71] = new ModelRendererTurbo(this, 492, 127, textureX, textureY); // Box 263
		bodyModel[72] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[73] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[74] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[75] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[76] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[77] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear
		bodyModel[78] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear
		bodyModel[79] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[81] = new ModelRendererTurbo(this, 435, 127, textureX, textureY); // Box 270434
		bodyModel[82] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[83] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[84] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[85] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[86] = new ModelRendererTurbo(this, 203, 16, textureX, textureY); // Box 292
		bodyModel[87] = new ModelRendererTurbo(this, 215, 2, textureX, textureY); // Box 293
		bodyModel[88] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 294
		bodyModel[89] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[90] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[91] = new ModelRendererTurbo(this, 314, 117, textureX, textureY); // Box 310
		bodyModel[92] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 311
		bodyModel[93] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[94] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 319
		bodyModel[95] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[96] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[97] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[98] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[99] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[100] = new ModelRendererTurbo(this, 483, 32, textureX, textureY); // Box 342
		bodyModel[101] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 349
		bodyModel[102] = new ModelRendererTurbo(this, 467, 32, textureX, textureY); // Box 350
		bodyModel[103] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[104] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 280
		bodyModel[105] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[106] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[107] = new ModelRendererTurbo(this, 136, 126, textureX, textureY); // Box 298
		bodyModel[108] = new ModelRendererTurbo(this, 100, 126, textureX, textureY); // Box 299
		bodyModel[109] = new ModelRendererTurbo(this, 448, 140, textureX, textureY); // Box 300
		bodyModel[110] = new ModelRendererTurbo(this, 484, 140, textureX, textureY); // Box 301
		bodyModel[111] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[112] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[113] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[114] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[115] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 431
		bodyModel[116] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 432
		bodyModel[117] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 433
		bodyModel[118] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 434
		bodyModel[119] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[120] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[121] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[122] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[123] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[124] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[125] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[126] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[127] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[128] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[129] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[130] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[131] = new ModelRendererTurbo(this, 91, 20, textureX, textureY); // Box 321
		bodyModel[132] = new ModelRendererTurbo(this, 180, 112, textureX, textureY); // Box 322
		bodyModel[133] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 323
		bodyModel[134] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[135] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[136] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[137] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[138] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[139] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[140] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[141] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[142] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[143] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[144] = new ModelRendererTurbo(this, 15, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[145] = new ModelRendererTurbo(this, 17, 50, textureX, textureY); // Box 5
		bodyModel[146] = new ModelRendererTurbo(this, 476, 32, textureX, textureY); // Box 362
		bodyModel[147] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 364
		bodyModel[148] = new ModelRendererTurbo(this, 471, 11, textureX, textureY); // Box 365
		bodyModel[149] = new ModelRendererTurbo(this, 478, 10, textureX, textureY); // Box 366
		bodyModel[150] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[151] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[152] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[153] = new ModelRendererTurbo(this, 251, 40, textureX, textureY); // Box 373
		bodyModel[154] = new ModelRendererTurbo(this, 259, 45, textureX, textureY); // Box 374
		bodyModel[155] = new ModelRendererTurbo(this, 248, 45, textureX, textureY); // Box 375
		bodyModel[156] = new ModelRendererTurbo(this, 251, 28, textureX, textureY); // Box 376
		bodyModel[157] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[158] = new ModelRendererTurbo(this, 254, 24, textureX, textureY); // Box 378
		bodyModel[159] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 548
		bodyModel[160] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 549
		bodyModel[161] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 550
		bodyModel[162] = new ModelRendererTurbo(this, 260, 89, textureX, textureY); // Box 551 fuel tank lorge
		bodyModel[163] = new ModelRendererTurbo(this, 279, 139, textureX, textureY); // Box 552 fuel tank lorge
		bodyModel[164] = new ModelRendererTurbo(this, 266, 118, textureX, textureY); // Box 553 fuel tank lorge
		bodyModel[165] = new ModelRendererTurbo(this, 279, 148, textureX, textureY); // Box 554 fuel tank lorge
		bodyModel[166] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[167] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[168] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 278
		bodyModel[169] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 279
		bodyModel[170] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 60
		bodyModel[171] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 61
		bodyModel[172] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 62
		bodyModel[173] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 63
		bodyModel[174] = new ModelRendererTurbo(this, 78, 153, textureX, textureY); // Box 64
		bodyModel[175] = new ModelRendererTurbo(this, 32, 153, textureX, textureY); // Box 65
		bodyModel[176] = new ModelRendererTurbo(this, 43, 151, textureX, textureY); // Box 66
		bodyModel[177] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 67
		bodyModel[178] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288
		bodyModel[179] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[180] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290gyralight rear r
		bodyModel[181] = new ModelRendererTurbo(this, 463, 94, textureX, textureY); // Box 291
		bodyModel[182] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[183] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[184] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[185] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[186] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[187] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[188] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[189] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[190] = new ModelRendererTurbo(this, 76, 2, textureX, textureY); // Box 311
		bodyModel[191] = new ModelRendererTurbo(this, 122, 114, textureX, textureY); // Box 312
		bodyModel[192] = new ModelRendererTurbo(this, 110, 114, textureX, textureY); // Box 313
		bodyModel[193] = new ModelRendererTurbo(this, 425, 91, textureX, textureY); // Box 314
		bodyModel[194] = new ModelRendererTurbo(this, 421, 91, textureX, textureY); // Box 315
		bodyModel[195] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[196] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[197] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[198] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[199] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[200] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[201] = new ModelRendererTurbo(this, 94, 20, textureX, textureY); // Box 350
		bodyModel[202] = new ModelRendererTurbo(this, 120, 195, textureX, textureY); // Box 35
		bodyModel[203] = new ModelRendererTurbo(this, 139, 191, textureX, textureY); // Box 55
		bodyModel[204] = new ModelRendererTurbo(this, 150, 191, textureX, textureY); // Box 35
		bodyModel[205] = new ModelRendererTurbo(this, 79, 191, textureX, textureY); // Box 55
		bodyModel[206] = new ModelRendererTurbo(this, 139, 198, textureX, textureY); // Box 355
		bodyModel[207] = new ModelRendererTurbo(this, 79, 198, textureX, textureY); // Box 356
		bodyModel[208] = new ModelRendererTurbo(this, 64, 191, textureX, textureY); // Box 348
		bodyModel[209] = new ModelRendererTurbo(this, 15, 72, textureX, textureY); // Box 333
		bodyModel[210] = new ModelRendererTurbo(this, 18, 48, textureX, textureY); // Box 68
		bodyModel[211] = new ModelRendererTurbo(this, 105, 14, textureX, textureY); // Box 69
		bodyModel[212] = new ModelRendererTurbo(this, 80, 9, textureX, textureY); // Box 70
		bodyModel[213] = new ModelRendererTurbo(this, 128, 25, textureX, textureY); // Box 72
		bodyModel[214] = new ModelRendererTurbo(this, 51, 25, textureX, textureY); // Box 190
		bodyModel[215] = new ModelRendererTurbo(this, 8, 6, textureX, textureY); // Box 313
		bodyModel[216] = new ModelRendererTurbo(this, 117, 22, textureX, textureY); // Box 314 door swing right
		bodyModel[217] = new ModelRendererTurbo(this, 31, 3, textureX, textureY); // Box 332
		bodyModel[218] = new ModelRendererTurbo(this, 130, 3, textureX, textureY); // Box 333
		bodyModel[219] = new ModelRendererTurbo(this, 105, 7, textureX, textureY); // Box 67
		bodyModel[220] = new ModelRendererTurbo(this, 190, 26, textureX, textureY); // Box 350
		bodyModel[221] = new ModelRendererTurbo(this, 64, 51, textureX, textureY); // Box 334
		bodyModel[222] = new ModelRendererTurbo(this, 64, 44, textureX, textureY); // Box 335
		bodyModel[223] = new ModelRendererTurbo(this, 109, 61, textureX, textureY); // Box 412 cs
		bodyModel[224] = new ModelRendererTurbo(this, 129, 63, textureX, textureY); // Box 413 cs
		bodyModel[225] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 86 cs
		bodyModel[226] = new ModelRendererTurbo(this, 106, 55, textureX, textureY); // Box 476 cs radio
		bodyModel[227] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 358
		bodyModel[228] = new ModelRendererTurbo(this, 67, 14, textureX, textureY); // Box 74
		bodyModel[229] = new ModelRendererTurbo(this, 78, 11, textureX, textureY); // Box 75
		bodyModel[230] = new ModelRendererTurbo(this, 52, 11, textureX, textureY); // Box 76
		bodyModel[231] = new ModelRendererTurbo(this, 53, 3, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[232] = new ModelRendererTurbo(this, 53, 3, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[233] = new ModelRendererTurbo(this, 69, 9, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[234] = new ModelRendererTurbo(this, 69, 9, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[235] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 366
		bodyModel[236] = new ModelRendererTurbo(this, 106, 191, textureX, textureY); // Box 367
		bodyModel[237] = new ModelRendererTurbo(this, 109, 197, textureX, textureY); // Box 52 door swing right
		bodyModel[238] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 336
		bodyModel[239] = new ModelRendererTurbo(this, 103, 41, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[240] = new ModelRendererTurbo(this, 117, 41, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[241] = new ModelRendererTurbo(this, 156, 27, textureX, textureY); // Box 184 o2 generator
		bodyModel[242] = new ModelRendererTurbo(this, 154, 8, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[243] = new ModelRendererTurbo(this, 161, 16, textureX, textureY); // Box 450
		bodyModel[244] = new ModelRendererTurbo(this, 182, 101, textureX, textureY); // Box 375
		bodyModel[245] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[246] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[247] = new ModelRendererTurbo(this, 169, 90, textureX, textureY); // Box 378
		bodyModel[248] = new ModelRendererTurbo(this, 163, 99, textureX, textureY); // Box 379 crab signalling
		bodyModel[249] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[250] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[251] = new ModelRendererTurbo(this, 168, 190, textureX, textureY); // Box 61
		bodyModel[252] = new ModelRendererTurbo(this, 190, 190, textureX, textureY); // Box 356
		bodyModel[253] = new ModelRendererTurbo(this, 177, 188, textureX, textureY); // Box 151
		bodyModel[254] = new ModelRendererTurbo(this, 177, 196, textureX, textureY); // Box 415
		bodyModel[255] = new ModelRendererTurbo(this, 177, 204, textureX, textureY); // Box 386
		bodyModel[256] = new ModelRendererTurbo(this, 177, 212, textureX, textureY); // Box 387
		bodyModel[257] = new ModelRendererTurbo(this, 190, 206, textureX, textureY); // Box 388
		bodyModel[258] = new ModelRendererTurbo(this, 168, 206, textureX, textureY); // Box 389
		bodyModel[259] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[260] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[261] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[262] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[263] = new ModelRendererTurbo(this, 161, 60, textureX, textureY); // Box 409 commander base
		bodyModel[264] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[265] = new ModelRendererTurbo(this, 168, 56, textureX, textureY); // Box 354
		bodyModel[266] = new ModelRendererTurbo(this, 177, 62, textureX, textureY); // Box 355
		bodyModel[267] = new ModelRendererTurbo(this, 166, 62, textureX, textureY); // Box 356
		bodyModel[268] = new ModelRendererTurbo(this, 168, 68, textureX, textureY); // Box 357
		bodyModel[269] = new ModelRendererTurbo(this, 170, 65, textureX, textureY); // Box 358
		bodyModel[270] = new ModelRendererTurbo(this, 170, 59, textureX, textureY); // Box 359
		bodyModel[271] = new ModelRendererTurbo(this, 177, 47, textureX, textureY); // Box 402
		bodyModel[272] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 403
		bodyModel[273] = new ModelRendererTurbo(this, 166, 47, textureX, textureY); // Box 404
		bodyModel[274] = new ModelRendererTurbo(this, 168, 53, textureX, textureY); // Box 405
		bodyModel[275] = new ModelRendererTurbo(this, 170, 50, textureX, textureY); // Box 406
		bodyModel[276] = new ModelRendererTurbo(this, 170, 44, textureX, textureY); // Box 407
		bodyModel[277] = new ModelRendererTurbo(this, 70, 220, textureX, textureY); // Box 408
		bodyModel[278] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 409
		bodyModel[279] = new ModelRendererTurbo(this, 161, 18, textureX, textureY); // Box 285
		bodyModel[280] = new ModelRendererTurbo(this, 157, 66, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[281] = new ModelRendererTurbo(this, 148, 66, textureX, textureY); // Box 487 cab heater
		bodyModel[282] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[283] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[284] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 415
		bodyModel[285] = new ModelRendererTurbo(this, 136, 126, textureX, textureY); // Box 416
		bodyModel[286] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 417
		bodyModel[287] = new ModelRendererTurbo(this, 100, 126, textureX, textureY); // Box 418
		bodyModel[288] = new ModelRendererTurbo(this, 93, 52, textureX, textureY); // Box 288
		bodyModel[289] = new ModelRendererTurbo(this, 93, 58, textureX, textureY); // Box 289

		bodyModel[0].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-33F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-37.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 47, 20, 14, 0F); // Box 6
		bodyModel[2].setRotationPoint(-14F, -21F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-37F, -1F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[4].setRotationPoint(7.5F, -23.5F, -2.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[5].setRotationPoint(-5F, 4F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[6].setRotationPoint(7F, -22.5F, -3F);

		bodyModel[7].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[7].setRotationPoint(-27F, -5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 35
		bodyModel[8].setRotationPoint(-14F, -5F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[9].setRotationPoint(-6F, -3F, 7F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[10].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[11].setRotationPoint(-33F, 1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[12].setRotationPoint(33F, -22F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[13].setRotationPoint(33F, -22F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[14].setRotationPoint(33F, -22F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 27, 1, 3, 0F); // Box 156
		bodyModel[15].setRotationPoint(-33F, 1F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[16].setRotationPoint(-34F, -1F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[17].setRotationPoint(-34F, 7F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[18].setRotationPoint(-37F, 8F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[19].setRotationPoint(-34F, 7F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[20].setRotationPoint(-37F, -1F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[21].setRotationPoint(-37F, 2F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[22].setRotationPoint(-37F, 5F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[23].setRotationPoint(-37F, 5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[24].setRotationPoint(-37F, -1F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[25].setRotationPoint(-37F, 2F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[26].setRotationPoint(-37F, 8F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[27].setRotationPoint(-37F, 8F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 2, 14, 0F); // Box 215
		bodyModel[28].setRotationPoint(33F, -1F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[29].setRotationPoint(33F, 7F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[30].setRotationPoint(33F, 7F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[31].setRotationPoint(37F, 3F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[32].setRotationPoint(37F, 8F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[33].setRotationPoint(-37F, -3F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[34].setRotationPoint(-37F, -3F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[35].setRotationPoint(-37F, -9F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 66, 2, 16, 0F); // Box 251
		bodyModel[36].setRotationPoint(-33F, 1F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[37].setRotationPoint(-37F, -4F, -6.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[38].setRotationPoint(37.01F, -1F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[39].setRotationPoint(37.01F, -3F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[40].setRotationPoint(37.01F, -9F, -8F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[41].setRotationPoint(37.01F, -3F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[42].setRotationPoint(36F, -4F, -6.75F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 285
		bodyModel[43].setRotationPoint(-14F, -13F, 11.01F);

		bodyModel[44].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 288
		bodyModel[44].setRotationPoint(-2F, -9F, 11F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 10, 0, 0F); // Box 300
		bodyModel[45].setRotationPoint(-17F, -13F, -11.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 303
		bodyModel[46].setRotationPoint(-2F, -9F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[47].setRotationPoint(34F, -9F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[48].setRotationPoint(-5F, 1F, -9.01F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[49].setRotationPoint(-5F, 1F, 9.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[50].setRotationPoint(-8F, 4F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[51].setRotationPoint(-9F, 5F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[52].setRotationPoint(-8F, 2F, -9.01F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[53].setRotationPoint(-8F, 1F, 9.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 440
		bodyModel[54].setRotationPoint(-21.5F, 3F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 441
		bodyModel[55].setRotationPoint(19.5F, 3F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 293
		bodyModel[56].setRotationPoint(22F, -14F, -7.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[57].setRotationPoint(1F, 1.75F, -11.5F);
		bodyModel[57].rotateAngleX = 1.13446401F;

		bodyModel[58].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[58].setRotationPoint(1F, 1.75F, 11.5F);
		bodyModel[58].rotateAngleX = -1.13446401F;

		bodyModel[59].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 240 numberboard
		bodyModel[59].setRotationPoint(32.3F, -19F, 6F);
		bodyModel[59].rotateAngleY = 0.15707963F;

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 241 numberboard
		bodyModel[60].setRotationPoint(32.3F, -19F, -6F);
		bodyModel[60].rotateAngleY = -0.15707963F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[61].setRotationPoint(-13F, -19.25F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(-13F, -20.25F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[63].setRotationPoint(-12.75F, -18.75F, -8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[64].setRotationPoint(-13F, -21.25F, -8.8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[65].setRotationPoint(-8F, 3F, 9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[66].setRotationPoint(-8F, 2F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[67].setRotationPoint(-7.75F, 3.5F, 9.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[68].setRotationPoint(-7.75F, 1F, 7.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[69].setRotationPoint(-33F, 1F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[70].setRotationPoint(-34F, -1F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[71].setRotationPoint(32F, 1F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[72].setRotationPoint(33F, -1F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[73].setRotationPoint(-37F, 1F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[74].setRotationPoint(-37.25F, -4F, -6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[75].setRotationPoint(32F, 1F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[76].setRotationPoint(36.75F, -4F, -6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear
		bodyModel[77].setRotationPoint(33.25F, -17.5F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear
		bodyModel[78].setRotationPoint(33.25F, -19.5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[79].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[80].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[81].setRotationPoint(32F, 1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[82].setRotationPoint(33F, -1F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[83].setRotationPoint(34F, -5F, -11.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[84].setRotationPoint(34F, -5F, 10.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[85].setRotationPoint(34F, -9F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[86].setRotationPoint(-14F, -22F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[87].setRotationPoint(-14F, -22F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 26, 1, 6, 0F); // Box 294
		bodyModel[88].setRotationPoint(-14F, -22F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[89].setRotationPoint(-14F, -13F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[90].setRotationPoint(-6F, -13F, 11F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[91].setRotationPoint(-6F, 3F, -7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[92].setRotationPoint(-8F, 3F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[93].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[94].setRotationPoint(-22.5F, 1F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[95].setRotationPoint(37.01F, 7F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[96].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 21, 2, 16, 0F); // Box 298
		bodyModel[97].setRotationPoint(12F, -22F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[98].setRotationPoint(33F, -21.7F, -7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[99].setRotationPoint(33F, -21.7F, 5.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 342
		bodyModel[100].setRotationPoint(16.5F, -14F, -7.75F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 349
		bodyModel[101].setRotationPoint(13F, -7.5F, 6.75F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 350
		bodyModel[102].setRotationPoint(13F, -7.5F, -7.75F);

		bodyModel[103].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[103].setRotationPoint(-27F, 1F, 9F);
		bodyModel[103].rotateAngleZ = -0.27925268F;

		bodyModel[104].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 280
		bodyModel[104].setRotationPoint(-32F, 1F, 9F);

		bodyModel[105].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 283
		bodyModel[105].setRotationPoint(12F, -20F, -7.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 284
		bodyModel[106].setRotationPoint(12F, -20F, 6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[107].setRotationPoint(-37.01F, -9F, -10F);
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[108].setRotationPoint(-37.01F, -9F, 11F);
		bodyModel[108].rotateAngleY = -3.14159265F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[109].setRotationPoint(37.01F, -9F, -10F);
		bodyModel[109].rotateAngleY = -3.14159265F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[110].setRotationPoint(37.01F, -9F, 11F);
		bodyModel[110].rotateAngleY = -3.14159265F;

		bodyModel[111].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[111].setRotationPoint(-37F, 6F, -8F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[112].setRotationPoint(-37F, 6F, 8F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[113].setRotationPoint(34F, 6F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[114].setRotationPoint(34F, 6F, -8F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 431
		bodyModel[115].setRotationPoint(-37F, 1F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 432
		bodyModel[116].setRotationPoint(-37F, 1F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 433
		bodyModel[117].setRotationPoint(34F, 1F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 434
		bodyModel[118].setRotationPoint(34F, 1F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[119].setRotationPoint(36F, -4F, 4.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[120].setRotationPoint(36.75F, -4F, 4.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[121].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[122].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[123].setRotationPoint(34F, 8F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[124].setRotationPoint(34F, 5F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[125].setRotationPoint(34F, 2F, -9F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[126].setRotationPoint(34F, -1F, -8F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[127].setRotationPoint(34F, 8F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[128].setRotationPoint(34F, 5F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[129].setRotationPoint(34F, 2F, 7F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[130].setRotationPoint(34F, -1F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[131].setRotationPoint(-26.01F, -17F, 11F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[132].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[133].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[134].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[134].setRotationPoint(-37F, -1F, -2F);
		bodyModel[134].rotateAngleZ = -1.48352986F;

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[135].setRotationPoint(-0.5F, -22.5F, -6.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[136].setRotationPoint(-2F, -23.25F, -5.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[137].setRotationPoint(-3F, -23.5F, -6.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[138].setRotationPoint(-1.5F, -23.25F, -7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[139].setRotationPoint(-29F, -24.5F, 6.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[140].setRotationPoint(-29F, -24.5F, 6.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[141].setRotationPoint(-29F, -24.5F, 6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[142].setRotationPoint(-29F, -24.5F, 6.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[143].setRotationPoint(-29F, -24F, 6.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[144].setRotationPoint(-26F, -18F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[145].setRotationPoint(-26F, -19F, 10F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 362
		bodyModel[146].setRotationPoint(19F, -14F, -7.75F);

		bodyModel[147].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 364
		bodyModel[147].setRotationPoint(22F, -14F, 6.75F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 365
		bodyModel[148].setRotationPoint(19F, -14F, 6.75F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 366
		bodyModel[149].setRotationPoint(16.5F, -14F, 6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[150].setRotationPoint(12F, -23F, 1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[151].setRotationPoint(12F, -23F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[152].setRotationPoint(12F, -23F, -1F);

		bodyModel[153].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 373
		bodyModel[153].setRotationPoint(-13.5F, -20F, -7.25F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 374
		bodyModel[154].setRotationPoint(-13.5F, -17.5F, -7.25F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 375
		bodyModel[155].setRotationPoint(-11F, -17.5F, -7.25F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 376
		bodyModel[156].setRotationPoint(-11F, -17.5F, 6.25F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 377
		bodyModel[157].setRotationPoint(-13.5F, -17.5F, 6.25F);

		bodyModel[158].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 378
		bodyModel[158].setRotationPoint(-13.5F, -20F, 6.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[159].setRotationPoint(-7F, 5F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 549
		bodyModel[160].setRotationPoint(-4F, 5F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[161].setRotationPoint(-6F, 5F, -9F);

		bodyModel[162].addBox(0F, 0F, 0F, 12, 3, 22, 0F); // Box 551 fuel tank lorge
		bodyModel[162].setRotationPoint(-3F, 2F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552 fuel tank lorge
		bodyModel[163].setRotationPoint(-3F, 5F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Box 553 fuel tank lorge
		bodyModel[164].setRotationPoint(-3F, 5F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 554 fuel tank lorge
		bodyModel[165].setRotationPoint(-3F, 5F, 8F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[166].setRotationPoint(-6F, -5F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[167].setRotationPoint(32F, -23F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[168].setRotationPoint(33F, -23F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[169].setRotationPoint(33F, -23F, 1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 60
		bodyModel[170].setRotationPoint(-41F, 7F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[171].setRotationPoint(-41F, 7F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 62
		bodyModel[172].setRotationPoint(-40F, 6F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[173].setRotationPoint(-40F, 6F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 64
		bodyModel[174].setRotationPoint(-40F, 4F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 65
		bodyModel[175].setRotationPoint(-40F, 4F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 66
		bodyModel[176].setRotationPoint(-40F, 3F, 2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[177].setRotationPoint(-40F, 3F, -10F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[178].setRotationPoint(33.75F, -21.75F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[179].setRotationPoint(34.5F, -21.7F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290gyralight rear r
		bodyModel[180].setRotationPoint(34.5F, -21.7F, 0F);

		bodyModel[181].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[181].setRotationPoint(33F, -23.25F, 0F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[182].setRotationPoint(34F, 4F, 8F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[183].setRotationPoint(-37F, 4F, 8F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[184].setRotationPoint(-37F, 4F, -8F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[185].setRotationPoint(34F, 4F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[186].setRotationPoint(-38F, -9F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[187].setRotationPoint(-38F, -9F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[188].setRotationPoint(-38F, -1F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[189].setRotationPoint(-38F, -1F, 2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[190].setRotationPoint(-28F, -19F, 11F);
		bodyModel[190].rotateAngleX = 0.61086524F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[191].setRotationPoint(-35F, -1F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 313
		bodyModel[192].setRotationPoint(-35F, -1F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[193].setRotationPoint(34F, -1F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[194].setRotationPoint(34F, -1F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[195].setRotationPoint(37F, -1F, -7F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[196].setRotationPoint(37F, -9F, -2F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[197].setRotationPoint(37F, -9F, 2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[198].setRotationPoint(37F, -1F, 2F);

		bodyModel[199].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[199].setRotationPoint(37F, -1F, 2F);
		bodyModel[199].rotateAngleY = -3.14159265F;
		bodyModel[199].rotateAngleZ = -1.48352986F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[200].setRotationPoint(-28F, -19F, -11F);
		bodyModel[200].rotateAngleX = -0.61086524F;

		bodyModel[201].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[201].setRotationPoint(-26F, -17F, -11F);
		bodyModel[201].rotateAngleY = 0.52359878F;

		bodyModel[202].addShapeBox(0F, -1F, 0F, 4, 14, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[202].setRotationPoint(-34.5F, -14F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[203].setRotationPoint(-34F, -15F, -11F);

		bodyModel[204].addShapeBox(0F, -1F, 0F, 3, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[204].setRotationPoint(-33F, -12F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[205].setRotationPoint(-34F, -15F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 355
		bodyModel[206].setRotationPoint(-34F, -13F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[207].setRotationPoint(-34F, -13F, 7F);

		bodyModel[208].addShapeBox(0F, -1F, 0F, 3, 12, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[208].setRotationPoint(-33F, -12F, 7F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 4, 22, 0F); // Box 333
		bodyModel[209].setRotationPoint(-30F, -5F, -11F);

		bodyModel[210].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[210].setRotationPoint(-30F, -23F, -9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[211].setRotationPoint(-30F, -23F, 9F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[212].setRotationPoint(-18F, -19F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 12, 13, 1, 0F); // Box 72
		bodyModel[213].setRotationPoint(-30F, -19F, 10F);

		bodyModel[214].addBox(0F, 0F, 0F, 13, 13, 1, 0F); // Box 190
		bodyModel[214].setRotationPoint(-30F, -19F, -11F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 313
		bodyModel[215].setRotationPoint(-30F, -19F, -10F);

		bodyModel[216].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[216].setRotationPoint(-17.5F, -19F, 10.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[217].setRotationPoint(-30F, -22F, -9F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[218].setRotationPoint(-18F, -22F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[219].setRotationPoint(-30F, -23F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 18, 14, 0F); // Box 350
		bodyModel[220].setRotationPoint(-17F, -23F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[221].setRotationPoint(-29F, -22F, 6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[222].setRotationPoint(-29F, -22F, -9F);

		bodyModel[223].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs
		bodyModel[223].setRotationPoint(-24F, -15F, -7F);
		bodyModel[223].rotateAngleY = -0.26179939F;

		bodyModel[224].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs
		bodyModel[224].setRotationPoint(-29.1F, -13F, -3F);
		bodyModel[224].rotateAngleY = -0.59341195F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs
		bodyModel[225].setRotationPoint(-29.1F, -15F, -3F);
		bodyModel[225].rotateAngleY = -0.59341195F;

		bodyModel[226].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs radio
		bodyModel[226].setRotationPoint(-24F, -17F, -7F);
		bodyModel[226].rotateAngleY = -0.26179939F;

		bodyModel[227].addBox(0F, 0F, 0F, 13, 1, 22, 0F); // Box 358
		bodyModel[227].setRotationPoint(-30F, -6F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[228].setRotationPoint(-33F, -23F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[229].setRotationPoint(-32F, -23F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[230].setRotationPoint(-32F, -23F, 1F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[231].setRotationPoint(-30.05F, -22F, -6F);
		bodyModel[231].rotateAngleY = 0.38397244F;

		bodyModel[232].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[232].setRotationPoint(-30.05F, -22F, 6F);
		bodyModel[232].rotateAngleY = -0.38397244F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[233].setRotationPoint(-32.75F, -23F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[234].setRotationPoint(-32.75F, -21F, -1F);

		bodyModel[235].addShapeBox(0F, -1F, 0F, 4, 14, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[235].setRotationPoint(-34.5F, -14F, 2F);

		bodyModel[236].addShapeBox(0F, -1F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[236].setRotationPoint(-34.5F, -14F, -2F);

		bodyModel[237].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[237].setRotationPoint(-33.5F, -14F, -1.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[238].setRotationPoint(-33F, -25F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[239].setRotationPoint(-33.75F, -25F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[240].setRotationPoint(-33.75F, -25F, -2F);

		bodyModel[241].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[241].setRotationPoint(-27.5F, -24.75F, -4F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[242].setRotationPoint(-20F, -25F, -2.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[243].setRotationPoint(-19F, -26F, 0F);

		bodyModel[244].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 375
		bodyModel[244].setRotationPoint(-10F, -9F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[245].setRotationPoint(-14F, -3F, -10F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[246].setRotationPoint(-14F, -5F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 378
		bodyModel[247].setRotationPoint(-17F, -13F, 11F);

		bodyModel[248].addBox(0F, 0F, 0F, 6, 6, 3, 0F); // Box 379 crab signalling
		bodyModel[248].setRotationPoint(-12.5F, -7F, -10.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[249].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[250].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[251].setRotationPoint(-38F, -1F, 3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[252].setRotationPoint(-38F, -1F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[253].setRotationPoint(-38F, -1F, -2.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[254].setRotationPoint(-38.25F, -1F, -2.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 386
		bodyModel[255].setRotationPoint(37F, -1F, -2.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 387
		bodyModel[256].setRotationPoint(37.25F, -1F, -2.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 388
		bodyModel[257].setRotationPoint(37F, -1F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 389
		bodyModel[258].setRotationPoint(37F, -1F, -6F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[259].setRotationPoint(-30F, -24.5F, -8.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[260].setRotationPoint(-29F, -24.5F, -7.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[261].setRotationPoint(-30F, -24.5F, -6.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[262].setRotationPoint(-28.5F, -23.5F, -7.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[263].setRotationPoint(-22F, -24F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[264].setRotationPoint(-22F, -25F, -0.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[265].setRotationPoint(-20.5F, -24.5F, -5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[266].setRotationPoint(-19F, -23.75F, -6F);

		bodyModel[267].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[267].setRotationPoint(-21.5F, -24.75F, -6F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[268].setRotationPoint(-21F, -24.5F, -7F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[269].setRotationPoint(-20F, -25.75F, -6.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[270].setRotationPoint(-20F, -25.75F, -5.25F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		bodyModel[271].setRotationPoint(-2F, -22.5F, -5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 403
		bodyModel[272].setRotationPoint(-3.5F, -23.25F, -4F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 404
		bodyModel[273].setRotationPoint(-4.5F, -23.5F, -5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[274].setRotationPoint(-4F, -23.25F, -6F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[275].setRotationPoint(-3F, -24.5F, -5.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 407
		bodyModel[276].setRotationPoint(-3F, -24.5F, -4.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[277].setRotationPoint(37.01F, 6F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[278].setRotationPoint(37.01F, 6F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[279].setRotationPoint(-21.5F, -24F, 6F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[280].setRotationPoint(-29F, -13F, -4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[281].setRotationPoint(-29F, -11F, -6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[282].setRotationPoint(-34.9F, -13.7F, -9F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[283].setRotationPoint(-34.9F, -13.7F, 7F);

		bodyModel[284].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 415
		bodyModel[284].setRotationPoint(-34F, -3F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[285].setRotationPoint(-34.01F, -9F, -10F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 417
		bodyModel[286].setRotationPoint(-34F, -3F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[287].setRotationPoint(-34.01F, -9F, 11F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[288].setRotationPoint(-30F, -15F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[289].setRotationPoint(-30F, -15F, 7F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		
		if (GetColor(entity) == 6||GetColor(entity) == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324||GetColor(entity) == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 15 ||GetColor(entity) == 3
		||GetColor(entity) == 27){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14 || GetColor(entity) == 9234){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}