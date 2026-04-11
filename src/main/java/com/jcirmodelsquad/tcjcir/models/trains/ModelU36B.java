//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U33B-U36B
// Model Creator: bidahochi
// Created on: 12.07.2023 - 07:14:58
// Last changed on: 12.07.2023 - 07:14:58

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

public class ModelU36B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU36B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[357];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 183, 102, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[25] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[32] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[33] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[34] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[35] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[36] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[39] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[40] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[41] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[42] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[43] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[44] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[45] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[46] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[47] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[48] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[49] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[50] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[51] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[53] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[54] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[58] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[59] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[60] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[61] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[62] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[63] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[64] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[65] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[66] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[67] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[68] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[69] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[70] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[71] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[72] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[74] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[75] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[76] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[77] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 electrical locker
		bodyModel[78] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[79] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[80] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[81] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[82] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[83] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[84] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[85] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[86] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[87] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[88] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[89] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[90] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[91] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[92] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[93] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[94] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[95] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[97] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[98] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[99] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[100] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[101] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[102] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[103] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[104] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[105] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[106] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[107] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[108] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[109] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[110] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[111] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[112] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[113] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[114] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[116] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[117] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[118] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[119] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[120] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[121] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[122] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[123] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[124] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[125] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[126] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[127] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[128] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[129] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[130] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[131] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[132] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[133] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[134] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[135] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[136] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[137] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull fncc bit
		bodyModel[138] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 419 
		bodyModel[139] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[140] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[141] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[142] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[143] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[144] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[145] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[146] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[147] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[148] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[149] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[150] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[151] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[152] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[153] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[154] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[155] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[156] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[157] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[158] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[159] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[160] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[161] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[162] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[163] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[164] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[165] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[166] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[167] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[168] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[169] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[170] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[171] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[172] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[173] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[174] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[175] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[176] = new ModelRendererTurbo(this, 492, 140, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[177] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[178] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[179] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[180] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[181] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[182] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[183] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[184] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[185] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[186] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[187] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[188] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[189] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[190] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[191] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[192] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[193] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[194] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[195] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[196] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[197] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[198] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[199] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[200] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[201] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[202] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[204] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[205] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[206] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[207] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[208] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[209] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[210] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[211] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[212] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[213] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[214] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[215] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[216] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[217] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[218] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[219] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[220] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[221] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[222] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[223] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[224] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[225] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[226] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[227] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[228] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[229] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[230] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[231] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[232] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[233] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[234] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[235] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[236] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[237] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[238] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[239] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[240] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 206 early stairwell pillar
		bodyModel[241] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 207 early stairwell pillar
		bodyModel[242] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217 early stairwell pillar
		bodyModel[243] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 221 early stairwell pillar
		bodyModel[244] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[245] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[246] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[247] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[248] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293 late radiator
		bodyModel[249] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293 late radiator
		bodyModel[250] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293 late radiator
		bodyModel[251] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[252] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[253] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[254] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[255] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[256] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[257] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 410
		bodyModel[258] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[259] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 81
		bodyModel[260] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[261] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[262] = new ModelRendererTurbo(this, 95, 95, textureX, textureY); // Box 250
		bodyModel[263] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[264] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 293 oilbath filter (early units)
		bodyModel[265] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[266] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[267] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[268] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[269] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[270] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[271] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[272] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[273] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[274] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[275] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[276] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[277] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[278] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[279] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[280] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[281] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[282] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[283] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[284] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[285] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534 late radiator
		bodyModel[286] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535 late radiator
		bodyModel[287] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536 late radiator
		bodyModel[288] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 537 oilbath filter (early units)
		bodyModel[289] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[290] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[291] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[292] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[293] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[294] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[295] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[296] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[297] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[298] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[299] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[300] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[301] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[302] = new ModelRendererTurbo(this, 414, 109, textureX, textureY); // Box 324
		bodyModel[303] = new ModelRendererTurbo(this, 414, 125, textureX, textureY); // Box 327
		bodyModel[304] = new ModelRendererTurbo(this, 68, 121, textureX, textureY); // Box 302
		bodyModel[305] = new ModelRendererTurbo(this, 84, 121, textureX, textureY); // Box 303
		bodyModel[306] = new ModelRendererTurbo(this, 78, 120, textureX, textureY); // Box 279
		bodyModel[307] = new ModelRendererTurbo(this, 416, 118, textureX, textureY); // Box 280
		bodyModel[308] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[309] = new ModelRendererTurbo(this, 87, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[310] = new ModelRendererTurbo(this, 413, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[311] = new ModelRendererTurbo(this, 424, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[312] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[313] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[314] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[315] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[316] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[317] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[318] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[319] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[320] = new ModelRendererTurbo(this, 344, 198, textureX, textureY); // Box 144
		bodyModel[321] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[322] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[323] = new ModelRendererTurbo(this, 494, 247, textureX, textureY); // Box 133
		bodyModel[324] = new ModelRendererTurbo(this, 368, 236, textureX, textureY); // Box 138
		bodyModel[325] = new ModelRendererTurbo(this, 8, 53, textureX, textureY, "cull"); // Box 308 cull baffle
		bodyModel[326] = new ModelRendererTurbo(this, 8, 48, textureX, textureY, "cull"); // Box 309 cull baffle
		bodyModel[327] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[328] = new ModelRendererTurbo(this, 253, 214, textureX, textureY, "cull"); // Box 428 early radiators cull
		bodyModel[329] = new ModelRendererTurbo(this, 253, 199, textureX, textureY, "cull"); // Box 429 early radiators cull
		bodyModel[330] = new ModelRendererTurbo(this, 386, 250, textureX, textureY); // Box 430 early nonsense
		bodyModel[331] = new ModelRendererTurbo(this, 397, 250, textureX, textureY); // Box 431 early nonsense
		bodyModel[332] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[333] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[334] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[335] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[336] = new ModelRendererTurbo(this, 222, 214, textureX, textureY, "cull"); // Box 350 early intakes cull
		bodyModel[337] = new ModelRendererTurbo(this, 222, 199, textureX, textureY, "cull"); // Box 351 early intakes cull
		bodyModel[338] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[339] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[340] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[341] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[342] = new ModelRendererTurbo(this, 442, 245, textureX, textureY); // Box 371
		bodyModel[343] = new ModelRendererTurbo(this, 442, 230, textureX, textureY); // Box 361
		bodyModel[344] = new ModelRendererTurbo(this, 422, 186, textureX, textureY); // Box 362
		bodyModel[345] = new ModelRendererTurbo(this, 385, 245, textureX, textureY); // Box 365
		bodyModel[346] = new ModelRendererTurbo(this, 422, 224, textureX, textureY); // Box 366
		bodyModel[347] = new ModelRendererTurbo(this, 437, 234, textureX, textureY); // Box 368
		bodyModel[348] = new ModelRendererTurbo(this, 380, 234, textureX, textureY); // Box 369
		bodyModel[349] = new ModelRendererTurbo(this, 412, 208, textureX, textureY); // Box 370
		bodyModel[350] = new ModelRendererTurbo(this, 412, 192, textureX, textureY); // Box 371
		bodyModel[351] = new ModelRendererTurbo(this, 374, 244, textureX, textureY); // Box 372
		bodyModel[352] = new ModelRendererTurbo(this, 364, 242, textureX, textureY); // Box 373
		bodyModel[353] = new ModelRendererTurbo(this, 427, 245, textureX, textureY); // Box 374
		bodyModel[354] = new ModelRendererTurbo(this, 490, 238, textureX, textureY); // Box 375
		bodyModel[355] = new ModelRendererTurbo(this, 490, 229, textureX, textureY); // Box 376
		bodyModel[356] = new ModelRendererTurbo(this, 487, 229, textureX, textureY); // Box 377

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-20F, -20F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-32F, -18F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-42F, -1F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-9F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(10F, 4F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[8].setRotationPoint(-32F, -18F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-33F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[10].setRotationPoint(-21F, -18F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[11].setRotationPoint(-33F, -18F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[12].setRotationPoint(-36F, -5F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[13].setRotationPoint(-37F, -3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[14].setRotationPoint(-37F, -5F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 35
		bodyModel[15].setRotationPoint(-20F, -5F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 36
		bodyModel[16].setRotationPoint(-20F, -5F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[17].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-38F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-33F, -21F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(-33F, -21F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[21].setRotationPoint(-21F, -21F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[22].setRotationPoint(-33F, -21F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[23].setRotationPoint(38F, -21F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[24].setRotationPoint(38F, -21F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(38F, -21F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[26].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-9F, 5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[28].setRotationPoint(-9F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[29].setRotationPoint(-32F, -22F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-33F, -22F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[31].setRotationPoint(-21F, -22F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[32].setRotationPoint(-33F, -22F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[33].setRotationPoint(-21F, -22F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[34].setRotationPoint(-21F, -21F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[35].setRotationPoint(-21F, -21F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[36].setRotationPoint(-32F, -22F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[37].setRotationPoint(-34F, -22F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[38].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[39].setRotationPoint(-39F, -1F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[40].setRotationPoint(-39F, 7F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[41].setRotationPoint(-42F, 8F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[42].setRotationPoint(-39F, 7F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[43].setRotationPoint(-42F, -1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[44].setRotationPoint(-42F, 2F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[45].setRotationPoint(-42F, -1F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[46].setRotationPoint(-42F, 2F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[47].setRotationPoint(-42F, 8F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[48].setRotationPoint(-42F, 8F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[49].setRotationPoint(38F, -1F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[50].setRotationPoint(38F, 7F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[51].setRotationPoint(38F, 7F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[52].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[53].setRotationPoint(42F, 8F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[54].setRotationPoint(-42F, -1F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[55].setRotationPoint(-42F, -1F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[56].setRotationPoint(-42F, -9F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[57].setRotationPoint(-38F, 1F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[58].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[59].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[60].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[61].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[62].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[63].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[64].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[65].setRotationPoint(-20F, -13F, 11F);

		bodyModel[66].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[66].setRotationPoint(-5F, -9F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[67].setRotationPoint(-20F, -13F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[68].setRotationPoint(-5F, -9F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[69].setRotationPoint(39F, -9F, -11F);

		bodyModel[70].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[70].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[70].rotateAngleZ = -0.10471976F;

		bodyModel[71].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[71].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[72].setRotationPoint(-11F, 4F, -9F);

		bodyModel[73].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[73].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[73].rotateAngleZ = 0.10471976F;

		bodyModel[74].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[74].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[74].rotateAngleZ = -0.2268928F;

		bodyModel[75].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[75].setRotationPoint(-44F, 8F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[76].setRotationPoint(42F, 8F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[77].setRotationPoint(-19F, -9F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[78].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[79].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[80].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[81].setRotationPoint(-38F, 1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[82].setRotationPoint(-39F, -1F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[83].setRotationPoint(36F, 1F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[84].setRotationPoint(38F, -1F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[85].setRotationPoint(-42F, 1F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[86].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[87].setRotationPoint(37F, 1F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[88].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[89].setRotationPoint(-34.1F, -22F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[90].setRotationPoint(-34.1F, -20F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[91].setRotationPoint(-39.35F, -13.7F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[92].setRotationPoint(-39.35F, -13.7F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[93].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[94].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[96].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[97].setRotationPoint(36F, 1F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[98].setRotationPoint(38F, -1F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[99].setRotationPoint(-25F, -24F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[100].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[101].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[102].setRotationPoint(39F, -9F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[103].setRotationPoint(-20F, -21F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[104].setRotationPoint(-20F, -21F, 3F);

		bodyModel[105].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[105].setRotationPoint(-20F, -21F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[106].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[107].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[108].setRotationPoint(-38F, -13F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[109].setRotationPoint(-38F, -14F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[110].setRotationPoint(-38F, -14F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[111].setRotationPoint(-38F, -14F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[112].setRotationPoint(-39F, -13F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[113].setRotationPoint(-39F, -13F, 1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[114].setRotationPoint(-39F, -13F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[115].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[116].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[117].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[117].setRotationPoint(-33F, -22F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[118].setRotationPoint(9F, 3F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[119].setRotationPoint(-12F, 3F, -6F);

		bodyModel[120].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[120].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[121].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[121].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[122].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[123].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[124].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[125].setRotationPoint(-32F, 1F, 9F);
		bodyModel[125].rotateAngleZ = -0.27925268F;

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[126].setRotationPoint(-35F, 1F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[127].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[128].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[128].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[129].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[130].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[131].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[131].rotateAngleY = -3.14159265F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[132].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[133].setRotationPoint(-42F, 6F, -8F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[134].setRotationPoint(-42F, 6F, 8F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[135].setRotationPoint(39F, 6F, 8F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[136].setRotationPoint(39F, 6F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 419 cull fncc bit
		bodyModel[137].setRotationPoint(-24F, -22.75F, -1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 
		bodyModel[138].setRotationPoint(-24F, -23.75F, 0F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[139].setRotationPoint(-34F, -23.5F, -1.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[140].setRotationPoint(-33F, -23.5F, -0.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[141].setRotationPoint(-34F, -23.5F, 0.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[142].setRotationPoint(-32.5F, -22.5F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[143].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[144].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[145].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[146].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[147].setRotationPoint(39F, 8F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[148].setRotationPoint(39F, 2F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[149].setRotationPoint(39F, -1F, -8F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[150].setRotationPoint(39F, 8F, 8F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[151].setRotationPoint(39F, 2F, 7F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[152].setRotationPoint(39F, -1F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[153].setRotationPoint(-34F, -23F, -1.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[154].setRotationPoint(-31F, -24F, 0F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[155].setRotationPoint(4.5F, -21.5F, -6.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[156].setRotationPoint(3F, -22.25F, -5.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[157].setRotationPoint(2F, -22.5F, -6.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[158].setRotationPoint(3.5F, -22.25F, -7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[159].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[160].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[161].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[162].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[163].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[164].setRotationPoint(-30F, -22F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[165].setRotationPoint(-24F, -23F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[166].setRotationPoint(37F, -22F, -1F);

		bodyModel[167].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[167].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[168].setRotationPoint(10.5F, -22.5F, -2.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[169].setRotationPoint(10F, -21.5F, -3F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[170].setRotationPoint(-37F, -5F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[171].setRotationPoint(-11F, -3F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[172].setRotationPoint(-11F, -3F, 7F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[173].setRotationPoint(-11F, -5F, -11F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[174].setRotationPoint(-11F, -5F, 10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[175].setRotationPoint(37.8F, -20F, -7.5F);
		bodyModel[175].rotateAngleY = -0.05235988F;

		bodyModel[176].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[176].setRotationPoint(37.8F, -20F, 7.5F);
		bodyModel[176].rotateAngleY = 0.05235988F;

		bodyModel[177].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[177].setRotationPoint(38.75F, -20.25F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[178].setRotationPoint(39.5F, -20.2F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[179].setRotationPoint(39.5F, -20.2F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[180].setRotationPoint(42F, -1F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[181].setRotationPoint(42F, -9F, -2F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[182].setRotationPoint(42F, -9F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[183].setRotationPoint(42F, -1F, 2F);

		bodyModel[184].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[184].setRotationPoint(42F, -1F, 2F);
		bodyModel[184].rotateAngleY = -3.14159265F;
		bodyModel[184].rotateAngleZ = -1.48352986F;

		bodyModel[185].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[185].setRotationPoint(-42F, -1F, -2F);
		bodyModel[185].rotateAngleZ = -1.48352986F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[186].setRotationPoint(-43F, -9F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[187].setRotationPoint(-43F, -9F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[188].setRotationPoint(-43F, -1F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[189].setRotationPoint(-43F, -1F, 2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[190].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[191].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[192].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[193].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[194].setRotationPoint(-31F, -18F, -11F);
		bodyModel[194].rotateAngleX = -0.61086524F;

		bodyModel[195].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[195].setRotationPoint(-29F, -16F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[196].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[197].setRotationPoint(-29F, -17F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[198].setRotationPoint(-29F, -18F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[199].setRotationPoint(-31F, -18F, 11F);
		bodyModel[199].rotateAngleX = 0.61086524F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[200].setRotationPoint(-46F, 7F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[201].setRotationPoint(-46F, 7F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[202].setRotationPoint(-45F, 6F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[203].setRotationPoint(-45F, 5F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[204].setRotationPoint(-45F, 6F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[205].setRotationPoint(-45F, 5F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[206].setRotationPoint(-45F, 4F, 2F);

		bodyModel[207].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[207].setRotationPoint(-45F, 4F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[208].setRotationPoint(44F, 6F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[209].setRotationPoint(44F, 6F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[210].setRotationPoint(45F, 7F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[211].setRotationPoint(45F, 7F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[212].setRotationPoint(44F, 5F, 2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[213].setRotationPoint(44F, 4F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[214].setRotationPoint(44F, 5F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[215].setRotationPoint(44F, 4F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[216].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[217].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[218].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[219].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[220].setRotationPoint(-16.5F, -16.5F, 6.15F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[221].setRotationPoint(-19F, -16.5F, 6.15F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[222].setRotationPoint(-19F, -19F, 6.15F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[223].setRotationPoint(-14.5F, -22F, -0.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[224].setRotationPoint(-17F, -23F, -0.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[225].setRotationPoint(-16F, -22.75F, 0.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[226].setRotationPoint(-15.5F, -22.75F, -1.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[227].setRotationPoint(-33F, -23.5F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[228].setRotationPoint(-33F, -23.5F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[229].setRotationPoint(-33F, -23.5F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[230].setRotationPoint(-33F, -23.5F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[231].setRotationPoint(-33F, -23F, -1F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[232].setRotationPoint(-42F, 5F, 8F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[233].setRotationPoint(-42F, 5F, -10F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[234].setRotationPoint(39F, 5F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[235].setRotationPoint(39F, 5F, 8F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[236].setRotationPoint(39F, 4F, 8F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[237].setRotationPoint(-42F, 4F, 8F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[238].setRotationPoint(-42F, 4F, -8F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[239].setRotationPoint(39F, 4F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early stairwell pillar
		bodyModel[240].setRotationPoint(-39F, 3F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 early stairwell pillar
		bodyModel[241].setRotationPoint(-39F, 3F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217 early stairwell pillar
		bodyModel[242].setRotationPoint(38F, 3F, 10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 early stairwell pillar
		bodyModel[243].setRotationPoint(38F, 3F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[244].setRotationPoint(-12F, 5F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[245].setRotationPoint(-10F, 5F, -9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[246].setRotationPoint(9F, 5F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[247].setRotationPoint(11F, 5F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293 late radiator
		bodyModel[248].setRotationPoint(26.75F, -14F, 7.25F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293 late radiator
		bodyModel[249].setRotationPoint(24F, -14F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293 late radiator
		bodyModel[250].setRotationPoint(21F, -14F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[251].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[252].setRotationPoint(-18F, -22F, 0F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[253].setRotationPoint(-16.5F, -21.5F, -4.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[254].setRotationPoint(-17F, -22.25F, -3.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[255].setRotationPoint(-19F, -22.5F, -4.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[256].setRotationPoint(-18F, -22.25F, -5.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[257].setRotationPoint(-38F, -13F, 11F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[258].setRotationPoint(-39F, -13F, 11F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[259].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[260].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[261].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[262].setRotationPoint(-39F, -13F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[263].setRotationPoint(-39F, -13F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 oilbath filter (early units)
		bodyModel[264].setRotationPoint(17.5F, -17F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[265].setRotationPoint(-22.5F, -21F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[266].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[267].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[268].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[269].setRotationPoint(-30F, -23.5F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[270].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[271].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[272].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[273].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[274].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[275].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[276].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[277].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[278].setRotationPoint(-38F, 1F, -11F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[279].setRotationPoint(-33.75F, -23F, 5F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[280].setRotationPoint(-32.5F, -22F, 4F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[281].setRotationPoint(-32.5F, -23F, 4F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[282].setRotationPoint(-34.25F, -23F, 3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[283].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[284].setRotationPoint(-23F, -13F, -5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534 late radiator
		bodyModel[285].setRotationPoint(24F, -14F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535 late radiator
		bodyModel[286].setRotationPoint(26.75F, -14F, -8.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536 late radiator
		bodyModel[287].setRotationPoint(21F, -14F, -8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 537 oilbath filter (early units)
		bodyModel[288].setRotationPoint(17.5F, -17F, -8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[289].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[290].setRotationPoint(-25.8F, -15F, -5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[291].setRotationPoint(-32.5F, -13F, -3F);
		bodyModel[291].rotateAngleY = -0.45378561F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[292].setRotationPoint(-32.5F, -15F, -3F);
		bodyModel[292].rotateAngleY = -0.45378561F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[293].setRotationPoint(-32.5F, -9F, -3F);
		bodyModel[293].rotateAngleY = -0.45378561F;

		bodyModel[294].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[294].setRotationPoint(-32F, -18F, 6.5F);
		bodyModel[294].rotateAngleY = 0.17453293F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[295].setRotationPoint(-19F, -19F, -7.15F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[296].setRotationPoint(-19F, -16.5F, -7.15F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[297].setRotationPoint(-16.5F, -16.5F, -7.15F);

		bodyModel[298].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[298].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[298].rotateAngleX = 1.57079633F;

		bodyModel[299].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[299].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[299].rotateAngleX = -1.57079633F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[300].setRotationPoint(-32F, -19F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[301].setRotationPoint(-32F, -19F, 7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[302].setRotationPoint(42F, -1F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[303].setRotationPoint(42F, -1F, 2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[304].setRotationPoint(-43F, -1F, -8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[305].setRotationPoint(-43F, -1F, 2F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279
		bodyModel[306].setRotationPoint(-43F, -1F, -2F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280
		bodyModel[307].setRotationPoint(42F, -1F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[308].setRotationPoint(-43F, -1F, -5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[309].setRotationPoint(-43F, -1F, 3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[310].setRotationPoint(42F, -1F, -5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[311].setRotationPoint(42F, -1F, 3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[312].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[313].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[314].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[315].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[316].setRotationPoint(-45F, 6F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[317].setRotationPoint(-45F, 6F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[318].setRotationPoint(44F, 6F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[319].setRotationPoint(44F, 6F, -10F);

		bodyModel[320].addBox(0F, 0F, 0F, 20, 2, 20, 0F); // Box 144
		bodyModel[320].setRotationPoint(17F, -20F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, -0.35F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[321].setRotationPoint(17F, -18F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[322].setRotationPoint(17F, -18F, 7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[323].setRotationPoint(37F, -20F, 7.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
		bodyModel[324].setRotationPoint(37F, -20F, -10.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 cull baffle
		bodyModel[325].setRotationPoint(-34.85F, -19F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 cull baffle
		bodyModel[326].setRotationPoint(-34.85F, -21F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[327].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 33, 14, 0, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -17F, -7F, 0F, -17F, -7F, 0F, 0F, -7F, 0F); // Box 428 early radiators cull
		bodyModel[328].setRotationPoint(21F, -14F, -7.76F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 33, 14, 0, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -17F, -7F, 0F, -17F, -7F, 0F, 0F, -7F, 0F); // Box 429 early radiators cull
		bodyModel[329].setRotationPoint(21F, -14F, 7.76F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1.35F, 0F, 0F, 0F, 0F); // Box 430 early nonsense
		bodyModel[330].setRotationPoint(13F, -20F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 431 early nonsense
		bodyModel[331].setRotationPoint(13F, -20F, 7F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[332].setRotationPoint(36.5F, -23.25F, 4.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[333].setRotationPoint(37F, -22.5F, 3.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[334].setRotationPoint(37F, -23.25F, 2.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[335].setRotationPoint(36.5F, -23.5F, 3.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 13, 13, 0, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 350 early intakes cull
		bodyModel[336].setRotationPoint(-19F, -19F, -7.01F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 13, 13, 0, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 351 early intakes cull
		bodyModel[337].setRotationPoint(-19F, -19F, 7.01F);

		bodyModel[338].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[338].setRotationPoint(-34.05F, -21F, -1.5F);
		bodyModel[338].rotateAngleY = 0.13089969F;

		bodyModel[339].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[339].setRotationPoint(-34.05F, -21F, 1F);
		bodyModel[339].rotateAngleY = -0.13089969F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[340].setRotationPoint(-34F, -21F, -6.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[341].setRotationPoint(-34F, -21F, 1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[342].setRotationPoint(17F, -22F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[343].setRotationPoint(17F, -21F, 8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 38, 0, 4, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0.75F, -2F, 0F, 0.75F, -2F); // Box 362
		bodyModel[344].setRotationPoint(18F, -21.01F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[345].setRotationPoint(17F, -21F, -10F);

		bodyModel[346].addShapeBox(0F, 0F, -2F, 38, 0, 4, 0F,0F, -0.75F, -2F, -19F, -0.75F, -2F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -2F, -19F, 0.75F, -2F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[346].setRotationPoint(18F, -21.01F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[347].setRotationPoint(17F, -22F, 1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[348].setRotationPoint(17F, -22F, -8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1.5F, -7F, -19F, -1.5F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -7F, -19F, 1.5F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[349].setRotationPoint(18F, -22.51F, -15F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1.5F, -7F, 0F, 1.5F, -7F); // Box 371
		bodyModel[350].setRotationPoint(18F, -22.51F, 1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 372
		bodyModel[351].setRotationPoint(37F, -21F, -10.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[352].setRotationPoint(37F, -21F, -8F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[353].setRotationPoint(38F, -22F, -8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 375
		bodyModel[354].setRotationPoint(38F, -22F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 376
		bodyModel[355].setRotationPoint(37F, -21F, 1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.35F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 377
		bodyModel[356].setRotationPoint(37F, -21F, 7.5F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 13244||GetColor(entity) == 3247) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Autosnacc.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 ||GetColor(entity) == 4
				||GetColor(entity) == 7 ||GetColor(entity) == 22){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 19 ||GetColor(entity) == 20
				||GetColor(entity) == 21){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3246){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 932){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}