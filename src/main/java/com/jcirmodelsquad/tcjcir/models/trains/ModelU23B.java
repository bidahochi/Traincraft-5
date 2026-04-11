//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U23B
// Model Creator: Bidahochi
// Created on: 15.07.2021 - 18:10:46
// Last changed on: 15.07.2021 - 18:10:46

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.client.Minecraft;
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

public class ModelU23B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU23B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[440];

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
		bodyModel[65] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[66] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[67] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[68] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[69] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[70] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[71] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[72] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[73] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[74] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[75] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[76] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[77] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[78] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[79] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[80] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 electrical locker
		bodyModel[81] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[82] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[83] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[84] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[85] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[86] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[87] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[88] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[89] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[90] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[91] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[92] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[93] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[94] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[95] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[96] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[97] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[98] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[99] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[100] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[102] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[103] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[104] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[105] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[106] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[107] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[108] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[109] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[110] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[111] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[112] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[113] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[114] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[115] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 298 headlight f hh
		bodyModel[116] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 299 headlight f hh
		bodyModel[117] = new ModelRendererTurbo(this, 19, 75, textureX, textureY); // Box 303
		bodyModel[118] = new ModelRendererTurbo(this, 34, 79, textureX, textureY); // Box 304
		bodyModel[119] = new ModelRendererTurbo(this, 41, 75, textureX, textureY); // Box 305
		bodyModel[120] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[121] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[122] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[123] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[124] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[125] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[126] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[127] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[128] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[129] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[130] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[131] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[132] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[133] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[134] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[135] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 300
		bodyModel[136] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Box 301
		bodyModel[137] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[138] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[139] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[140] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[141] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[142] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[143] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[144] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[145] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[146] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[147] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[148] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[149] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[150] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[151] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[152] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[153] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[154] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[155] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[156] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[157] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[158] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[159] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[160] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[161] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[162] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[163] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[164] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 418 atsf bit
		bodyModel[165] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[166] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[167] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[168] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[169] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[170] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[171] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 364 prime base
		bodyModel[172] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[173] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[174] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[175] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[176] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[177] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[178] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[179] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[180] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[181] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[182] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[183] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[184] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[185] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[186] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[187] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[188] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[189] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[190] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[191] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[192] = new ModelRendererTurbo(this, 129, 56, textureX, textureY, "cull"); // Box 330
		bodyModel[193] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[194] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[195] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[196] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[197] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[198] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[199] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[200] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[201] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[202] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[203] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[204] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[205] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[206] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[207] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[208] = new ModelRendererTurbo(this, 147, 14, textureX, textureY); // Box 352
		bodyModel[209] = new ModelRendererTurbo(this, 147, 17, textureX, textureY); // Box 353
		bodyModel[210] = new ModelRendererTurbo(this, 147, 11, textureX, textureY); // Box 354
		bodyModel[211] = new ModelRendererTurbo(this, 138, 21, textureX, textureY, "cull"); // Box 332 bell mount cull
		bodyModel[212] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[213] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[214] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[215] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[216] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[217] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[218] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[219] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[220] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[221] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[222] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[223] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[224] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[225] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[226] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[227] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[228] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[229] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[230] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[231] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[232] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[233] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[234] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[235] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[236] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[237] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[238] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[239] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[240] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[241] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[242] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[243] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[244] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[245] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[246] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[247] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[248] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[249] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[250] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[251] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[252] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[253] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[254] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[255] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[256] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[257] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[258] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[259] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[260] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[261] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[262] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[263] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[264] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[265] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[266] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[267] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[268] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[269] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[270] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[271] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[272] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[273] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[274] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[275] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[276] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[277] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[278] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[279] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[280] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[281] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[282] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[283] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[284] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[285] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[286] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[287] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[288] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[289] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[290] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[291] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[292] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[293] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 206 early stairwell pillar
		bodyModel[294] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 207 early stairwell pillar
		bodyModel[295] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217 early stairwell pillar
		bodyModel[296] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 221 early stairwell pillar
		bodyModel[297] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[298] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[299] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[300] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[301] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[302] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[303] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[304] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[305] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[306] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[307] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[308] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[309] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[310] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[311] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[312] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 410
		bodyModel[313] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[314] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 81
		bodyModel[315] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[316] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[317] = new ModelRendererTurbo(this, 95, 95, textureX, textureY); // Box 250
		bodyModel[318] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[319] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 293 oilbath filter (early units)
		bodyModel[320] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402
		bodyModel[321] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[322] = new ModelRendererTurbo(this, 176, 16, textureX, textureY); // Box 401
		bodyModel[323] = new ModelRendererTurbo(this, 173, 15, textureX, textureY); // Box 402
		bodyModel[324] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[325] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[326] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 388 numberboard
		bodyModel[327] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 389 numberboard
		bodyModel[328] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[329] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[330] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[331] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[332] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[333] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[334] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[335] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[336] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[337] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[338] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[339] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[340] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[341] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[342] = new ModelRendererTurbo(this, 173, 7, textureX, textureY); // Box 409 commander base
		bodyModel[343] = new ModelRendererTurbo(this, 173, 3, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[344] = new ModelRendererTurbo(this, 182, 8, textureX, textureY); // Box 409 commander base
		bodyModel[345] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[346] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[347] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 332
		bodyModel[348] = new ModelRendererTurbo(this, 132, 39, textureX, textureY); // Box 331
		bodyModel[349] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[350] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[351] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[352] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[353] = new ModelRendererTurbo(this, 212, 29, textureX, textureY); // Box 526
		bodyModel[354] = new ModelRendererTurbo(this, 212, 41, textureX, textureY); // Box 527
		bodyModel[355] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[356] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[357] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[358] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[359] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[360] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 537 oilbath filter (early units)
		bodyModel[361] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[362] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[363] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[364] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[365] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[366] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[367] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[368] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[369] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[370] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[371] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[372] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[373] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[374] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[375] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[376] = new ModelRendererTurbo(this, 414, 109, textureX, textureY); // Box 324
		bodyModel[377] = new ModelRendererTurbo(this, 414, 125, textureX, textureY); // Box 327
		bodyModel[378] = new ModelRendererTurbo(this, 68, 121, textureX, textureY); // Box 302
		bodyModel[379] = new ModelRendererTurbo(this, 84, 121, textureX, textureY); // Box 303
		bodyModel[380] = new ModelRendererTurbo(this, 78, 120, textureX, textureY); // Box 279
		bodyModel[381] = new ModelRendererTurbo(this, 416, 118, textureX, textureY); // Box 280
		bodyModel[382] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[383] = new ModelRendererTurbo(this, 87, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[384] = new ModelRendererTurbo(this, 413, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[385] = new ModelRendererTurbo(this, 424, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[386] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[387] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[388] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[389] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[390] = new ModelRendererTurbo(this, 143, 101, textureX, textureY); // Box 790
		bodyModel[391] = new ModelRendererTurbo(this, 132, 104, textureX, textureY); // Box 791
		bodyModel[392] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[393] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[394] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[395] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[396] = new ModelRendererTurbo(this, 173, 28, textureX, textureY, "lamp"); // Box 401 sp emergency gyra
		bodyModel[397] = new ModelRendererTurbo(this, 163, 28, textureX, textureY); // Box 400 sp E gyra box
		bodyModel[398] = new ModelRendererTurbo(this, 170, 26, textureX, textureY); // Box 335 sp e gyra box holder stick
		bodyModel[399] = new ModelRendererTurbo(this, 12, 86, textureX, textureY); // Box 401 schnoz gyra
		bodyModel[400] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[401] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[402] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[403] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[404] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[405] = new ModelRendererTurbo(this, 437, 78, textureX, textureY); // Box 430 early nonsense
		bodyModel[406] = new ModelRendererTurbo(this, 437, 74, textureX, textureY); // Box 431 early nonsense
		bodyModel[407] = new ModelRendererTurbo(this, 303, 204, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[408] = new ModelRendererTurbo(this, 257, 197, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[409] = new ModelRendererTurbo(this, 251, 218, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[410] = new ModelRendererTurbo(this, 303, 219, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[411] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[412] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[413] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[414] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[415] = new ModelRendererTurbo(this, 304, 229, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[416] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, "prime1"); // Box 6 PRIME5-1
		bodyModel[417] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, "prime3"); // Box 7 PRIME5-3
		bodyModel[418] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, "prime2"); // Box 8 PRIME5-2
		bodyModel[419] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, "prime4"); // Box 9 PRIME5-4
		bodyModel[420] = new ModelRendererTurbo(this, 183, 59, textureX, textureY); // Box 428 prime base
		bodyModel[421] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[422] = new ModelRendererTurbo(this, 161, 7, textureX, textureY); // Box 364 prime base
		bodyModel[423] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "prime1"); // Box 6 PRIME6-1
		bodyModel[424] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "prime3"); // Box 7 PRIME6-3
		bodyModel[425] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "prime2"); // Box 8 PRIME6-2
		bodyModel[426] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "prime4"); // Box 9 PRIME6-4
		bodyModel[427] = new ModelRendererTurbo(this, 128, 61, textureX, textureY, "cull"); // Box 426 cull atsf bit
		bodyModel[428] = new ModelRendererTurbo(this, 168, 36, textureX, textureY); // Box 433
		bodyModel[429] = new ModelRendererTurbo(this, 177, 36, textureX, textureY); // Box 434
		bodyModel[430] = new ModelRendererTurbo(this, 168, 33, textureX, textureY); // Box 436
		bodyModel[431] = new ModelRendererTurbo(this, 192, 24, textureX, textureY); // Box 361 rv ac
		bodyModel[432] = new ModelRendererTurbo(this, 185, 21, textureX, textureY); // Box 362 rv ac
		bodyModel[433] = new ModelRendererTurbo(this, 185, 27, textureX, textureY); // Box 363 rv ac
		bodyModel[434] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 48 ph2 headlight
		bodyModel[435] = new ModelRendererTurbo(this, 8, 101, textureX, textureY, "lamp"); // Box 186 Headlight Front up ph2
		bodyModel[436] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, "lamp"); // Box 187 Headlight Front down ph2
		bodyModel[437] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 133 ph2 headlight
		bodyModel[438] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 187 ph2 headlight
		bodyModel[439] = new ModelRendererTurbo(this, 187, 4, textureX, textureY); // Box 104 cnrc antenna

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

		bodyModel[65].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[65].setRotationPoint(-25F, -23.5F, 3F);

		bodyModel[66].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[66].setRotationPoint(-20F, -13F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[67].setRotationPoint(-5F, -9F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[68].setRotationPoint(-20F, -13F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[69].setRotationPoint(-5F, -9F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[70].setRotationPoint(39F, -9F, -11F);

		bodyModel[71].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[71].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[71].rotateAngleZ = -0.10471976F;

		bodyModel[72].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[72].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[73].setRotationPoint(-11F, 4F, -9F);

		bodyModel[74].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[74].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[74].rotateAngleZ = 0.10471976F;

		bodyModel[75].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[75].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[75].rotateAngleZ = -0.2268928F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[76].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[77].setRotationPoint(42F, -1F, -6.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[78].setRotationPoint(-44F, 8F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[79].setRotationPoint(42F, 8F, -10F);

		bodyModel[80].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[80].setRotationPoint(-19F, -9F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[81].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[82].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[83].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[84].setRotationPoint(-38F, 1F, 7F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[85].setRotationPoint(-39F, -1F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[86].setRotationPoint(36F, 1F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[87].setRotationPoint(38F, -1F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[88].setRotationPoint(-42F, 1F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[89].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[90].setRotationPoint(37F, 1F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[91].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[92].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[93].setRotationPoint(42.25F, -1F, -6.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[94].setRotationPoint(-34.1F, -22F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[95].setRotationPoint(-34.1F, -20F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[96].setRotationPoint(-39.35F, -13.7F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[97].setRotationPoint(-39.35F, -13.7F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[98].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[99].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[100].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[101].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[102].setRotationPoint(36F, 1F, 7F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[103].setRotationPoint(38F, -1F, 7F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[104].setRotationPoint(-28F, -23.5F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[105].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[106].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[107].setRotationPoint(39F, -9F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 7, 14, 0F); // Box 289
		bodyModel[108].setRotationPoint(-38F, -20F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[109].setRotationPoint(-20F, -21F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[110].setRotationPoint(-20F, -21F, 3F);

		bodyModel[111].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[111].setRotationPoint(-20F, -21F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[112].setRotationPoint(-38F, -21F, -7F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 296
		bodyModel[113].setRotationPoint(-38F, -21F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[114].setRotationPoint(-38F, -21F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f hh
		bodyModel[115].setRotationPoint(-39.1F, -18.5F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f hh
		bodyModel[116].setRotationPoint(-39.1F, -16.5F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[117].setRotationPoint(-39F, -20F, 1F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 304
		bodyModel[118].setRotationPoint(-39F, -20F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 19, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[119].setRotationPoint(-39F, -20F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[120].setRotationPoint(-39F, -21F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[121].setRotationPoint(-39F, -21F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[122].setRotationPoint(-39F, -21F, 1F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[123].setRotationPoint(-39F, -22.5F, -3F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[124].setRotationPoint(-38F, -22.25F, -2F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[125].setRotationPoint(-38.5F, -22.25F, -4F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[126].setRotationPoint(-36.5F, -21.5F, -3F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[127].setRotationPoint(36F, -23.5F, 3.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[128].setRotationPoint(37.5F, -22.75F, 2.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[129].setRotationPoint(36.5F, -23.5F, 1.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[130].setRotationPoint(36F, -23.75F, 2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[131].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[132].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[133].setRotationPoint(-38F, -13F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[134].setRotationPoint(-38F, -14F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[135].setRotationPoint(-38F, -14F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[136].setRotationPoint(-38F, -14F, 1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[137].setRotationPoint(-39F, -13F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[138].setRotationPoint(-39F, -13F, 1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[139].setRotationPoint(-39F, -13F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[140].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[141].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[142].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[142].setRotationPoint(-33F, -22F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[143].setRotationPoint(9F, 3F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[144].setRotationPoint(-12F, 3F, -6F);

		bodyModel[145].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[145].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[146].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[146].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[147].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[148].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[149].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[149].rotateAngleY = -0.05235988F;

		bodyModel[150].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[150].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[150].rotateAngleY = 0.05235988F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[151].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[152].setRotationPoint(-32F, 1F, 9F);
		bodyModel[152].rotateAngleZ = -0.27925268F;

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[153].setRotationPoint(-35F, 1F, 9F);

		bodyModel[154].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[154].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[155].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[155].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[156].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[157].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[158].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[159].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[159].rotateAngleY = -3.14159265F;

		bodyModel[160].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[160].setRotationPoint(-42F, 6F, -8F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[161].setRotationPoint(-42F, 6F, 8F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[162].setRotationPoint(39F, 6F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[163].setRotationPoint(39F, 6F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 418 atsf bit
		bodyModel[164].setRotationPoint(-25.25F, -23.05F, -3F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull atsf bit
		bodyModel[165].setRotationPoint(-24F, -23F, 3.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[166].setRotationPoint(-24F, -24F, 5F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[167].setRotationPoint(-34F, -23.5F, -1.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[168].setRotationPoint(-33F, -23.5F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[169].setRotationPoint(-34F, -23.5F, 0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[170].setRotationPoint(-32.5F, -22.5F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[171].setRotationPoint(-37F, -22F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[172].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[173].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[174].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[175].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[176].setRotationPoint(42F, -1F, 4.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[177].setRotationPoint(42.25F, -1F, 4.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[178].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[179].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[180].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[181].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[182].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[183].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[184].setRotationPoint(39F, 8F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[185].setRotationPoint(39F, 2F, -9F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[186].setRotationPoint(39F, -1F, -8F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[187].setRotationPoint(39F, 8F, 8F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[188].setRotationPoint(39F, 2F, 7F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[189].setRotationPoint(39F, -1F, 7F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[190].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[191].setRotationPoint(-31.5F, -21F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[192].setRotationPoint(-31.5F, -21F, 7F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[193].setRotationPoint(-19F, -22.5F, 3.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[194].setRotationPoint(-17.5F, -22F, 4.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[195].setRotationPoint(-18F, -23F, 4.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[196].setRotationPoint(-19F, -22.5F, 5.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[197].setRotationPoint(-19F, -23F, -1.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[198].setRotationPoint(4.5F, -21.5F, -6.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[199].setRotationPoint(3F, -22.25F, -5.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[200].setRotationPoint(2F, -22.5F, -6.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[201].setRotationPoint(3.5F, -22.25F, -7.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[202].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[203].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[204].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[205].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[206].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[207].setRotationPoint(-30F, -22F, 7.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[208].setRotationPoint(39.5F, -21F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[209].setRotationPoint(39.75F, -20.5F, -0.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[210].setRotationPoint(39.5F, -22F, -0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 332 bell mount cull
		bodyModel[211].setRotationPoint(38.5F, -22F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[212].setRotationPoint(-24F, -23F, 0F);

		bodyModel[213].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[213].setRotationPoint(17F, -21F, -8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[214].setRotationPoint(17F, -22F, 1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[215].setRotationPoint(17F, -22F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[216].setRotationPoint(17F, -22F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[217].setRotationPoint(37F, -22F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[218].setRotationPoint(38F, -22F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[219].setRotationPoint(38F, -22F, 1F);

		bodyModel[220].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[220].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[221].setRotationPoint(11.5F, -22.5F, -2.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[222].setRotationPoint(11F, -21.5F, -3F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[223].setRotationPoint(-37F, -5F, -11F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[224].setRotationPoint(-11F, -3F, -10F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[225].setRotationPoint(-11F, -3F, 7F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[226].setRotationPoint(-11F, -5F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[227].setRotationPoint(-11F, -5F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[228].setRotationPoint(37.8F, -20F, -7.5F);
		bodyModel[228].rotateAngleY = -0.05235988F;

		bodyModel[229].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[229].setRotationPoint(37.8F, -20F, 7.5F);
		bodyModel[229].rotateAngleY = 0.05235988F;

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[230].setRotationPoint(38.75F, -20.25F, -2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[231].setRotationPoint(39.5F, -20.2F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[232].setRotationPoint(39.5F, -20.2F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[233].setRotationPoint(42F, -1F, -7F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[234].setRotationPoint(42F, -9F, -2F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[235].setRotationPoint(42F, -9F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[236].setRotationPoint(42F, -1F, 2F);

		bodyModel[237].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[237].setRotationPoint(42F, -1F, 2F);
		bodyModel[237].rotateAngleY = -3.14159265F;
		bodyModel[237].rotateAngleZ = -1.48352986F;

		bodyModel[238].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[238].setRotationPoint(-42F, -1F, -2F);
		bodyModel[238].rotateAngleZ = -1.48352986F;

		bodyModel[239].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[239].setRotationPoint(-43F, -9F, -2F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[240].setRotationPoint(-43F, -9F, 2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[241].setRotationPoint(-43F, -1F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[242].setRotationPoint(-43F, -1F, 2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[243].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[244].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[245].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[246].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[247].setRotationPoint(-31F, -18F, -11F);
		bodyModel[247].rotateAngleX = -0.61086524F;

		bodyModel[248].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[248].setRotationPoint(-29F, -16F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[249].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[250].setRotationPoint(-29F, -17F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[251].setRotationPoint(-29F, -18F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[252].setRotationPoint(-31F, -18F, 11F);
		bodyModel[252].rotateAngleX = 0.61086524F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[253].setRotationPoint(-46F, 7F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[254].setRotationPoint(-46F, 7F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[255].setRotationPoint(-45F, 6F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[256].setRotationPoint(-45F, 5F, 2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[257].setRotationPoint(-45F, 6F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[258].setRotationPoint(-45F, 5F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[259].setRotationPoint(-45F, 4F, 2F);

		bodyModel[260].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[260].setRotationPoint(-45F, 4F, -8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[261].setRotationPoint(44F, 6F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[262].setRotationPoint(44F, 6F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[263].setRotationPoint(45F, 7F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[264].setRotationPoint(45F, 7F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[265].setRotationPoint(44F, 5F, 2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[266].setRotationPoint(44F, 4F, 2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[267].setRotationPoint(44F, 5F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[268].setRotationPoint(44F, 4F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[269].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[270].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[271].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[272].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[273].setRotationPoint(-16F, -16.5F, 6.15F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[274].setRotationPoint(-18.5F, -16.5F, 6.15F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[275].setRotationPoint(-18.5F, -19F, 6.15F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[276].setRotationPoint(-14.5F, -22F, -0.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[277].setRotationPoint(-17F, -23F, -0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[278].setRotationPoint(-16F, -22.75F, 0.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[279].setRotationPoint(-15.5F, -22.75F, -1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[280].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[281].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[282].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[283].setRotationPoint(-25F, -23.5F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[284].setRotationPoint(-25F, -23F, -1F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[285].setRotationPoint(-42F, 5F, 8F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[286].setRotationPoint(-42F, 5F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[287].setRotationPoint(39F, 5F, -10F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[288].setRotationPoint(39F, 5F, 8F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[289].setRotationPoint(39F, 4F, 8F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[290].setRotationPoint(-42F, 4F, 8F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[291].setRotationPoint(-42F, 4F, -8F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[292].setRotationPoint(39F, 4F, -8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early stairwell pillar
		bodyModel[293].setRotationPoint(-39F, 3F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 early stairwell pillar
		bodyModel[294].setRotationPoint(-39F, 3F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217 early stairwell pillar
		bodyModel[295].setRotationPoint(38F, 3F, 10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 early stairwell pillar
		bodyModel[296].setRotationPoint(38F, 3F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[297].setRotationPoint(-12F, 5F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[298].setRotationPoint(-10F, 5F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[299].setRotationPoint(9F, 5F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[300].setRotationPoint(11F, 5F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[301].setRotationPoint(26.75F, -14F, 7.25F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[302].setRotationPoint(24F, -14F, 7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[303].setRotationPoint(21F, -14F, 7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[304].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[305].setRotationPoint(-38.8F, -19.5F, -7F);
		bodyModel[305].rotateAngleY = 0.05235988F;

		bodyModel[306].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[306].setRotationPoint(-38.8F, -19.5F, 7F);
		bodyModel[306].rotateAngleY = -0.05235988F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[307].setRotationPoint(-18F, -22F, 0F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[308].setRotationPoint(-16.5F, -21.5F, -4.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[309].setRotationPoint(-17F, -22.25F, -3.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[310].setRotationPoint(-19F, -22.5F, -4.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[311].setRotationPoint(-18F, -22.25F, -5.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[312].setRotationPoint(-38F, -13F, 11F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[313].setRotationPoint(-39F, -13F, 11F);

		bodyModel[314].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[314].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[315].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[316].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[317].setRotationPoint(-39F, -13F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[318].setRotationPoint(-39F, -13F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 oilbath filter (early units)
		bodyModel[319].setRotationPoint(17.5F, -17F, 7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[320].setRotationPoint(-38.75F, -21.5F, -1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[321].setRotationPoint(-22.5F, -21F, -6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[322].setRotationPoint(-33F, -24F, -0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[323].setRotationPoint(-32F, -24F, -0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[324].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[325].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 388 numberboard
		bodyModel[326].setRotationPoint(-39.3F, -17F, 1.25F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 numberboard
		bodyModel[327].setRotationPoint(-39.3F, -17F, -6.25F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[328].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[329].setRotationPoint(-30F, -23.5F, -4F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[330].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[331].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[332].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[333].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[334].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[335].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[336].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[337].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[338].setRotationPoint(-31F, -22F, 7.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[339].setRotationPoint(-31F, -23F, 7.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[340].setRotationPoint(-31F, -22F, -8.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[341].setRotationPoint(-31F, -23F, -8.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[342].setRotationPoint(-29.5F, -23F, -0.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[343].setRotationPoint(-29.5F, -24F, -0.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[344].setRotationPoint(-23F, -23F, -0.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[345].setRotationPoint(-23F, -24F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[346].setRotationPoint(-38F, 1F, -11F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[347].setRotationPoint(-37.5F, -23.5F, -3.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[348].setRotationPoint(-37.5F, -23.5F, -2.25F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[349].setRotationPoint(-33.75F, -23F, 5F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[350].setRotationPoint(-32.5F, -22F, 4F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[351].setRotationPoint(-32.5F, -23F, 4F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[352].setRotationPoint(-34.25F, -23F, 3F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 526
		bodyModel[353].setRotationPoint(36.5F, -24.75F, 3.25F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 527
		bodyModel[354].setRotationPoint(36.5F, -24.75F, 2F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[355].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[356].setRotationPoint(-23F, -13F, -5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[357].setRotationPoint(24F, -14F, -8F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[358].setRotationPoint(26.75F, -14F, -8.25F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[359].setRotationPoint(21F, -14F, -8F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 537 oilbath filter (early units)
		bodyModel[360].setRotationPoint(17.5F, -17F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[361].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[362].setRotationPoint(-25.8F, -15F, 1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[363].setRotationPoint(-32.5F, -13F, 3F);
		bodyModel[363].rotateAngleY = -0.45378561F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[364].setRotationPoint(-32.5F, -15F, 3F);
		bodyModel[364].rotateAngleY = -0.45378561F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[365].setRotationPoint(-32.5F, -9F, 3F);
		bodyModel[365].rotateAngleY = -0.45378561F;

		bodyModel[366].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[366].setRotationPoint(-32F, -18F, 7.5F);
		//bodyModel[366].rotateAngleY = 0.17453293F;

		bodyModel[367].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[367].setRotationPoint(-18.5F, -19F, -7.15F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[368].setRotationPoint(-18.5F, -16.5F, -7.15F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[369].setRotationPoint(-16F, -16.5F, -7.15F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[370].setRotationPoint(18F, -22.51F, 1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[371].setRotationPoint(18F, -22.51F, -15F);

		bodyModel[372].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[372].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[372].rotateAngleX = 1.57079633F;

		bodyModel[373].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[373].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[373].rotateAngleX = -1.57079633F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[374].setRotationPoint(-32F, -19F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[375].setRotationPoint(-32F, -19F, 7F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[376].setRotationPoint(42F, -1F, -8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[377].setRotationPoint(42F, -1F, 2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[378].setRotationPoint(-43F, -1F, -8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[379].setRotationPoint(-43F, -1F, 2F);

		bodyModel[380].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279
		bodyModel[380].setRotationPoint(-43F, -1F, -2F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280
		bodyModel[381].setRotationPoint(42F, -1F, -2F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[382].setRotationPoint(-43F, -1F, -5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[383].setRotationPoint(-43F, -1F, 3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[384].setRotationPoint(42F, -1F, -5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[385].setRotationPoint(42F, -1F, 3F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[386].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[387].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[388].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[389].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[390].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 790
		bodyModel[390].setRotationPoint(-19F, -9F, -11F);

		bodyModel[391].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 791
		bodyModel[391].setRotationPoint(-15F, -7F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[392].setRotationPoint(-45F, 6F, 0F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[393].setRotationPoint(-45F, 6F, -10F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[394].setRotationPoint(44F, 6F, 0F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[395].setRotationPoint(44F, 6F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 sp emergency gyra
		bodyModel[396].setRotationPoint(-34.1F, -24.5F, -1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 sp E gyra box
		bodyModel[397].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[398].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 335 sp e gyra box holder stick
		bodyModel[398].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 schnoz gyra
		bodyModel[399].setRotationPoint(-39F, -13.7F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[400].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[401].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[401].setRotationPoint(-34.05F, -21F, -1.5F);
		bodyModel[401].rotateAngleY = 0.13089969F;

		bodyModel[402].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[402].setRotationPoint(-34.05F, -21F, 1F);
		bodyModel[402].rotateAngleY = -0.13089969F;

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[403].setRotationPoint(-34F, -21F, -6.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[404].setRotationPoint(-34F, -21F, 1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F); // Box 430 early nonsense
		bodyModel[405].setRotationPoint(13F, -20F, -8F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 431 early nonsense
		bodyModel[406].setRotationPoint(13F, -20F, 7F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[407].setRotationPoint(-7F, 5F, -11F);

		bodyModel[408].addBox(0F, 0F, 0F, 14, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[408].setRotationPoint(-7F, 5F, -8F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 14, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[409].setRotationPoint(-7F, 2F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[410].setRotationPoint(-7F, 5F, 8F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[411].setRotationPoint(-9F, 3F, -5.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[412].setRotationPoint(-9F, 3F, 5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[413].setRotationPoint(7F, 3F, -5.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[414].setRotationPoint(7F, 3F, 5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[415].setRotationPoint(7F, 1.5F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[416].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[417].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[418].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[419].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[420].setRotationPoint(-33.5F, -23F, -1F);

		bodyModel[421].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[421].setRotationPoint(-34.25F, -23F, 3F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[422].setRotationPoint(-32F, -23.25F, -2.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME6-1
		bodyModel[423].setRotationPoint(-32F, -24F, -2.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME6-3
		bodyModel[424].setRotationPoint(-32F, -24F, -2.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME6-2
		bodyModel[425].setRotationPoint(-32F, -24F, -2.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME6-4
		bodyModel[426].setRotationPoint(-32F, -24F, -2.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 426 cull atsf bit
		bodyModel[427].setRotationPoint(-32F, -22.25F, -2.5F);

		bodyModel[428].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 433
		bodyModel[428].setRotationPoint(-32.5F, -23.25F, 2F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 434
		bodyModel[429].setRotationPoint(-32.5F, -22.25F, 2F);

		bodyModel[430].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		bodyModel[430].setRotationPoint(-34.25F, -23F, 1F);

		bodyModel[431].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 361 rv ac
		bodyModel[431].setRotationPoint(-26.5F, -24F, -2F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362 rv ac
		bodyModel[432].setRotationPoint(-27.5F, -24F, -2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 363 rv ac
		bodyModel[433].setRotationPoint(-27.5F, -23F, -2F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48 ph2 headlight
		bodyModel[434].setRotationPoint(-34F, -21.75F, -1F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up ph2
		bodyModel[435].setRotationPoint(-34.1F, -21.85F, -1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down ph2
		bodyModel[436].setRotationPoint(-34.1F, -19.95F, -1F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133 ph2 headlight
		bodyModel[437].setRotationPoint(-34F, -18.25F, -1F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 ph2 headlight
		bodyModel[438].setRotationPoint(-34F, -22.5F, -1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[439].setRotationPoint(-28F, -25.5F, 0F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14||GetColor(entity) == 5
				||GetColor(entity) == 16 ||GetColor(entity) == 34) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 13||GetColor(entity) == 6
				||GetColor(entity) == 25){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11 || GetColor(entity) == 27
				|| GetColor(entity) == 30){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_up_early.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 2 ||GetColor(entity) == 18 || GetColor(entity) == 23){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324 ||GetColor(entity) == 29000){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 29){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 35 || GetColor(entity) == 36
				|| GetColor(entity) == 37 ||GetColor(entity) == 38){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
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