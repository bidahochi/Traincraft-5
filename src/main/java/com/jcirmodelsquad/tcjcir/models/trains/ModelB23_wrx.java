//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B23_logging
// Model Creator: Biba
// Created on: 20.04.2023 - 21:59:09
// Last changed on: 20.04.2023 - 21:59:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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
import train.common.library.Info;

public class ModelB23_wrx extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelB23_wrx() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[308];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[8] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[9] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[10] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[11] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[12] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[13] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[14] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[15] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[16] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[17] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[18] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[19] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[21] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[22] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[23] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[24] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[25] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[26] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[27] = new ModelRendererTurbo(this, 77, 120, textureX, textureY); // Box 2603
		bodyModel[28] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[29] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[30] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[31] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[32] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[33] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[35] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[36] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[37] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[38] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[39] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[40] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[41] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[42] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[43] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[44] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[45] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[46] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[47] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[48] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[49] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[50] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[51] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[52] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[53] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[54] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[55] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[56] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[57] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[58] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[59] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[60] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[61] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[62] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318 ph1 mounting stuff
		bodyModel[64] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322 ph1 mounting stuff
		bodyModel[65] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757 ph1 mounting stuff
		bodyModel[66] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758 ph1 mounting stuff
		bodyModel[67] = new ModelRendererTurbo(this, 256, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[68] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[69] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[70] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[71] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[72] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[73] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[74] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[75] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[76] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[77] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[78] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[79] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[80] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[81] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[82] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[83] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[84] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "ditch"); // Box 307 glowey marker
		bodyModel[85] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "ditch"); // Box 308 glowey marker
		bodyModel[86] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[87] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[89] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[90] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[91] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[92] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "prime3"); // Box 247 Headlight Front nose
		bodyModel[93] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[94] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[95] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[96] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[97] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[98] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[99] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[100] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[101] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[102] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[103] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[104] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[105] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[106] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[107] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[108] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[109] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[110] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[111] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[112] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[113] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[114] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[115] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[116] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[117] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[118] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[119] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[120] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[122] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[123] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[124] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[125] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[127] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[128] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[129] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "ditch"); // Box 117 numberboard
		bodyModel[130] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "ditch"); // Box 118 numberboard
		bodyModel[131] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[132] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[133] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[134] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[135] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[136] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[137] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[138] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[139] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[140] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[141] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[142] = new ModelRendererTurbo(this, 249, 29, textureX, textureY); // Box 285
		bodyModel[143] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 157
		bodyModel[144] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18 early stack
		bodyModel[145] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21 early stack
		bodyModel[146] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 18 late stack
		bodyModel[147] = new ModelRendererTurbo(this, 246, 49, textureX, textureY); // Box 21 late stack
		bodyModel[148] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[149] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 133
		bodyModel[150] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[152] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[153] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down early
		bodyModel[154] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up early
		bodyModel[155] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "ditch"); // Box 165 numberboard early
		bodyModel[156] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "ditch"); // Box 167 numberboard early
		bodyModel[157] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 215 numberboard late HOLDER
		bodyModel[158] = new ModelRendererTurbo(this, 474, 92, textureX, textureY); // Box 216 numberboard late HOLDER
		bodyModel[159] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 284 Headlight Rear down late
		bodyModel[160] = new ModelRendererTurbo(this, 487, 100, textureX, textureY, "lamp"); // Box 285 Headlight Rear up late
		bodyModel[161] = new ModelRendererTurbo(this, 487, 93, textureX, textureY); // Box 219 late headlight plate
		bodyModel[162] = new ModelRendererTurbo(this, 336, 112, textureX, textureY); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[163] = new ModelRendererTurbo(this, 334, 122, textureX, textureY); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[164] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 355 brakewheel
		bodyModel[165] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[166] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 535 b23-7 radi
		bodyModel[167] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 293 b23-7 radi
		bodyModel[168] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 293 regular thin radi
		bodyModel[169] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 229 smol low radiator smol
		bodyModel[170] = new ModelRendererTurbo(this, 484, 53, textureX, textureY); // Box 230 smol low radiator 2
		bodyModel[171] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 293  smol low radiator 1
		bodyModel[172] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 232 smol low radiator smol
		bodyModel[173] = new ModelRendererTurbo(this, 484, 60, textureX, textureY); // Box 233 smol low radiator 2
		bodyModel[174] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 234 regular thin radi
		bodyModel[175] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 235 smol low radiator 1
		bodyModel[176] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 236 b30-7a early
		bodyModel[177] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 237 b30-7a early
		bodyModel[178] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "ditch"); // Box 215 numberboard late
		bodyModel[179] = new ModelRendererTurbo(this, 499, 91, textureX, textureY, "ditch"); // Box 216 numberboard late
		bodyModel[180] = new ModelRendererTurbo(this, 460, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[181] = new ModelRendererTurbo(this, 98, 145, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[182] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "ditch"); // Box 339 glowey marker
		bodyModel[183] = new ModelRendererTurbo(this, 499, 140, textureX, textureY, "ditch"); // Box 340 glowey marker
		bodyModel[184] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[185] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[186] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[187] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[188] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[189] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[190] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[191] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[192] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[193] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[194] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[195] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[196] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[197] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[198] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[199] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[200] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[201] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[202] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[203] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[204] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[205] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[206] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[207] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[208] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[209] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[210] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[211] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[212] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[213] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[214] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[215] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[216] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[217] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[218] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[219] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[220] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[221] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[222] = new ModelRendererTurbo(this, 63, 6, textureX, textureY); // Box 309 cab roof vent
		bodyModel[223] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 310
		bodyModel[224] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 311
		bodyModel[225] = new ModelRendererTurbo(this, 145, 82, textureX, textureY); // Box 312
		bodyModel[226] = new ModelRendererTurbo(this, 145, 84, textureX, textureY); // Box 313
		bodyModel[227] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 336 tiny mini mexico tank
		bodyModel[228] = new ModelRendererTurbo(this, 339, 122, textureX, textureY); // Box 340 spee pee lol
		bodyModel[229] = new ModelRendererTurbo(this, 341, 112, textureX, textureY); // Box 341 spee pee lol
		bodyModel[230] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[231] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[232] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[233] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[234] = new ModelRendererTurbo(this, 162, 108, textureX, textureY); // Box 250
		bodyModel[235] = new ModelRendererTurbo(this, 162, 99, textureX, textureY); // Box 410
		bodyModel[236] = new ModelRendererTurbo(this, 92, 117, textureX, textureY); // Box 406
		bodyModel[237] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 407
		bodyModel[238] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 293
		bodyModel[239] = new ModelRendererTurbo(this, 142, 117, textureX, textureY); // Box 294
		bodyModel[240] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[241] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[242] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[243] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[244] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[245] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[246] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[247] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[248] = new ModelRendererTurbo(this, 442, 109, textureX, textureY); // Box 296
		bodyModel[249] = new ModelRendererTurbo(this, 444, 124, textureX, textureY); // Box 280
		bodyModel[250] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[251] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[252] = new ModelRendererTurbo(this, 155, 99, textureX, textureY); // Box 411
		bodyModel[253] = new ModelRendererTurbo(this, 155, 108, textureX, textureY); // Box 412
		bodyModel[254] = new ModelRendererTurbo(this, 30, 197, textureX, textureY); // Box 412 cs
		bodyModel[255] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[256] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[257] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[258] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "ditch"); // Box 275 cs speedo glow
		bodyModel[259] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[260] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[261] = new ModelRendererTurbo(this, 67, 186, textureX, textureY); // Box 429 backwall
		bodyModel[262] = new ModelRendererTurbo(this, 90, 192, textureX, textureY, "cull"); // Box 430 backwall cull bit
		bodyModel[263] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[264] = new ModelRendererTurbo(this, 344, 198, textureX, textureY); // Box 144
		bodyModel[265] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[266] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[267] = new ModelRendererTurbo(this, 439, 244, textureX, textureY); // Box 371
		bodyModel[268] = new ModelRendererTurbo(this, 442, 231, textureX, textureY); // Box 361
		bodyModel[269] = new ModelRendererTurbo(this, 384, 243, textureX, textureY); // Box 365
		bodyModel[270] = new ModelRendererTurbo(this, 436, 234, textureX, textureY); // Box 368
		bodyModel[271] = new ModelRendererTurbo(this, 378, 233, textureX, textureY); // Box 369
		bodyModel[272] = new ModelRendererTurbo(this, 415, 213, textureX, textureY); // Box 370
		bodyModel[273] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 371
		bodyModel[274] = new ModelRendererTurbo(this, 486, 235, textureX, textureY); // Box 133
		bodyModel[275] = new ModelRendererTurbo(this, 376, 235, textureX, textureY); // Box 138
		bodyModel[276] = new ModelRendererTurbo(this, 421, 204, textureX, textureY); // Box 455
		bodyModel[277] = new ModelRendererTurbo(this, 363, 235, textureX, textureY); // Box 456
		bodyModel[278] = new ModelRendererTurbo(this, 377, 232, textureX, textureY); // Box 459
		bodyModel[279] = new ModelRendererTurbo(this, 370, 232, textureX, textureY); // Box 461
		bodyModel[280] = new ModelRendererTurbo(this, 492, 232, textureX, textureY); // Box 462
		bodyModel[281] = new ModelRendererTurbo(this, 485, 235, textureX, textureY); // Box 465
		bodyModel[282] = new ModelRendererTurbo(this, 487, 232, textureX, textureY); // Box 467
		bodyModel[283] = new ModelRendererTurbo(this, 415, 233, textureX, textureY); // Box 468
		bodyModel[284] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[285] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[286] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[287] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[288] = new ModelRendererTurbo(this, 147, 124, textureX, textureY); // Box 543
		bodyModel[289] = new ModelRendererTurbo(this, 79, 135, textureX, textureY); // Box 544
		bodyModel[290] = new ModelRendererTurbo(this, 439, 139, textureX, textureY); // Box 545
		bodyModel[291] = new ModelRendererTurbo(this, 504, 131, textureX, textureY); // Box 546
		bodyModel[292] = new ModelRendererTurbo(this, 129, 146, textureX, textureY); // Box 547
		bodyModel[293] = new ModelRendererTurbo(this, 129, 146, textureX, textureY); // Box 548
		bodyModel[294] = new ModelRendererTurbo(this, 129, 146, textureX, textureY); // Box 549
		bodyModel[295] = new ModelRendererTurbo(this, 129, 146, textureX, textureY); // Box 550
		bodyModel[296] = new ModelRendererTurbo(this, 210, 46, textureX, textureY); // Box 354
		bodyModel[297] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 355
		bodyModel[298] = new ModelRendererTurbo(this, 208, 49, textureX, textureY); // Box 356
		bodyModel[299] = new ModelRendererTurbo(this, 210, 52, textureX, textureY); // Box 357
		bodyModel[300] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 358
		bodyModel[301] = new ModelRendererTurbo(this, 210, 55, textureX, textureY); // Box 359
		bodyModel[302] = new ModelRendererTurbo(this, 187, 4, textureX, textureY); // Box 104
		bodyModel[303] = new ModelRendererTurbo(this, 493, 103, textureX, textureY); // Box 414 sp e gyra holdy rear
		bodyModel[304] = new ModelRendererTurbo(this, 494, 98, textureX, textureY, "prime1"); // Box 415 sp e gyra reart
		bodyModel[305] = new ModelRendererTurbo(this, 370, 88, textureX, textureY); // Box 379 big box boye
		bodyModel[306] = new ModelRendererTurbo(this, 206, 59, textureX, textureY); // Box 306
		bodyModel[307] = new ModelRendererTurbo(this, 206, 59, textureX, textureY); // Box 307

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[2].setRotationPoint(-42F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[3].setRotationPoint(-9F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[4].setRotationPoint(10F, 4F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[5].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[6].setRotationPoint(-38F, 2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[7].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[8].setRotationPoint(-39F, -1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[9].setRotationPoint(-39F, 7F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[10].setRotationPoint(-42F, 8F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[11].setRotationPoint(-39F, 7F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[12].setRotationPoint(-42F, -1F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[13].setRotationPoint(-42F, 2F, 7F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[14].setRotationPoint(-42F, -1F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[15].setRotationPoint(-42F, 2F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[16].setRotationPoint(-42F, 8F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[17].setRotationPoint(38F, -1F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[18].setRotationPoint(38F, 7F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[19].setRotationPoint(38F, 7F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[20].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[21].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[22].setRotationPoint(10F, 4F, -9.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[23].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[24].setRotationPoint(-11F, 4F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[25].setRotationPoint(-11F, 4F, -9.5F);

		bodyModel[26].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[26].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[26].rotateAngleZ = -0.2268928F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[27].setRotationPoint(-38F, 1F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[28].setRotationPoint(-39F, -1F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[29].setRotationPoint(36F, 1F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[30].setRotationPoint(38F, -1F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[31].setRotationPoint(-42F, 1F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[32].setRotationPoint(37F, 1F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[34].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270434
		bodyModel[35].setRotationPoint(36F, 1F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[36].setRotationPoint(38F, -1F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[37].setRotationPoint(9F, 3F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[38].setRotationPoint(-12F, 3F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 2, 22, 0F); // Box 320
		bodyModel[39].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 2, 22, 0F); // Box 321
		bodyModel[40].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[41].setRotationPoint(-42F, 6F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[42].setRotationPoint(-42F, 6F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[43].setRotationPoint(39F, 6F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[44].setRotationPoint(39F, 6F, -8F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[45].setRotationPoint(39F, 8F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[46].setRotationPoint(39F, 2F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[47].setRotationPoint(39F, 8F, 8F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[48].setRotationPoint(39F, 2F, 7F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[49].setRotationPoint(39F, -1F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[50].setRotationPoint(-42F, 5F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[51].setRotationPoint(-42F, 5F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[52].setRotationPoint(39F, 5F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[53].setRotationPoint(39F, 5F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[54].setRotationPoint(39F, 4F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[55].setRotationPoint(-42F, 4F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[56].setRotationPoint(-42F, 4F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[57].setRotationPoint(39F, 4F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[58].setRotationPoint(-12F, 5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[59].setRotationPoint(-10F, 5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[60].setRotationPoint(9F, 5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[61].setRotationPoint(11F, 5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[62].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318 ph1 mounting stuff
		bodyModel[63].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322 ph1 mounting stuff
		bodyModel[64].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757 ph1 mounting stuff
		bodyModel[65].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758 ph1 mounting stuff
		bodyModel[66].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[67].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[68].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[69].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[70].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[71].setRotationPoint(-38F, 1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[72].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[73].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[73].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[73].rotateAngleX = 1.57079633F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[74].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[74].rotateAngleX = -1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[75].setRotationPoint(-38F, 1F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[76].setRotationPoint(39F, -1F, -8F);

		bodyModel[77].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[77].setRotationPoint(-36F, -5F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[78].setRotationPoint(-37F, -3F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[79].setRotationPoint(-37F, -5F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[80].setRotationPoint(-38F, -13F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[81].setRotationPoint(-39F, -13F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[82].setRotationPoint(-39F, -13F, 1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[83].setRotationPoint(-39F, -13F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[84].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[85].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[86].setRotationPoint(-37F, -5F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[87].setRotationPoint(-11F, -3F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[88].setRotationPoint(-11F, -3F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[89].setRotationPoint(-11F, -5F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[90].setRotationPoint(-11F, -5F, 10F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[91].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose
		bodyModel[92].setRotationPoint(-39.5F, -13.7F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[93].setRotationPoint(-38F, -14F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[94].setRotationPoint(-38F, -14F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[95].setRotationPoint(-38F, -14F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[96].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[97].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[98].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[99].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[100].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[101].setRotationPoint(-32F, -18F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[102].setRotationPoint(-32F, -18F, 10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[103].setRotationPoint(-21F, -18F, -11F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[104].setRotationPoint(-33F, -18F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[105].setRotationPoint(-33F, -21F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[106].setRotationPoint(-33F, -21F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[107].setRotationPoint(-21F, -21F, -7F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[108].setRotationPoint(-33F, -21F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[109].setRotationPoint(-32F, -22F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[110].setRotationPoint(-33F, -22F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[111].setRotationPoint(-21F, -22F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[112].setRotationPoint(-33F, -22F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[113].setRotationPoint(-21F, -22F, 1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[114].setRotationPoint(-21F, -21F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[115].setRotationPoint(-21F, -21F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[116].setRotationPoint(-32F, -22F, 1F);

		bodyModel[117].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[117].setRotationPoint(-33F, -22F, -1F);

		bodyModel[118].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[118].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[119].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[119].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[120].setRotationPoint(-31F, -18F, -11F);
		bodyModel[120].rotateAngleX = -0.61086524F;

		bodyModel[121].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[121].setRotationPoint(-29F, -16F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[122].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[123].setRotationPoint(-31F, -18F, 11F);
		bodyModel[123].rotateAngleX = 0.61086524F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[124].setRotationPoint(-32F, -19F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[125].setRotationPoint(-32F, -19F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[126].setRotationPoint(-34F, -21.75F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[127].setRotationPoint(-34.25F, -21.75F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[128].setRotationPoint(-34.25F, -19.75F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[129].setRotationPoint(-34.1F, -20.75F, -1F);
		bodyModel[129].rotateAngleY = 0.14835299F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[130].setRotationPoint(-34.1F, -20.75F, 1F);
		bodyModel[130].rotateAngleY = -0.14835299F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[131].setRotationPoint(-34F, -20.75F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[132].setRotationPoint(-34F, -20.75F, 1F);

		bodyModel[133].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[133].setRotationPoint(-20F, -20F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[134].setRotationPoint(-20F, -21F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[135].setRotationPoint(-20F, -21F, 3F);

		bodyModel[136].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[136].setRotationPoint(-20F, -21F, -3F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[137].setRotationPoint(38F, -21F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[138].setRotationPoint(38F, -21F, 1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[139].setRotationPoint(38F, -21F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 283
		bodyModel[140].setRotationPoint(10F, -20F, -7.75F);

		bodyModel[141].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 284
		bodyModel[141].setRotationPoint(10F, -20F, 6.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[142].setRotationPoint(10F, -21F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[143].setRotationPoint(10F, -21F, 3F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 early stack
		bodyModel[144].setRotationPoint(11.5F, -22.5F, -2.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21 early stack
		bodyModel[145].setRotationPoint(11F, -21.5F, -3F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[146].setRotationPoint(10.5F, -22.5F, -3F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[147].setRotationPoint(10F, -21.5F, -3.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[148].setRotationPoint(10.5F, -23.5F, -3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[149].setRotationPoint(-34F, -18F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[150].setRotationPoint(-34F, -22.5F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[151].setRotationPoint(37F, -22F, -1F);

		bodyModel[152].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[152].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down early
		bodyModel[153].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up early
		bodyModel[154].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard early
		bodyModel[155].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard early
		bodyModel[156].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 215 numberboard late HOLDER
		bodyModel[157].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 216 numberboard late HOLDER
		bodyModel[158].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down late
		bodyModel[159].setRotationPoint(38.45F, -16F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up late
		bodyModel[160].setRotationPoint(38.45F, -18F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 219 late headlight plate
		bodyModel[161].setRotationPoint(38.2F, -18F, -1F);

		bodyModel[162].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[162].setRotationPoint(6F, 1.5F, -11.25F);
		bodyModel[162].rotateAngleX = 1.57079633F;

		bodyModel[163].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[163].setRotationPoint(-7F, 1.5F, 11.25F);
		bodyModel[163].rotateAngleX = -1.57079633F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[164].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[165].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 535 b23-7 radi
		bodyModel[166].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 293 b23-7 radi
		bodyModel[167].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 293 regular thin radi
		bodyModel[168].setRotationPoint(25F, -14F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229 smol low radiator smol
		bodyModel[169].setRotationPoint(27.5F, -6.5F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230 smol low radiator 2
		bodyModel[170].setRotationPoint(31F, -6.5F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293  smol low radiator 1
		bodyModel[171].setRotationPoint(17F, -7F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232 smol low radiator smol
		bodyModel[172].setRotationPoint(27.5F, -6.5F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233 smol low radiator 2
		bodyModel[173].setRotationPoint(31F, -6.5F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234 regular thin radi
		bodyModel[174].setRotationPoint(25F, -14F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 235 smol low radiator 1
		bodyModel[175].setRotationPoint(17F, -7F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 236 b30-7a early
		bodyModel[176].setRotationPoint(22.5F, -14F, -8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 237 b30-7a early
		bodyModel[177].setRotationPoint(22.5F, -14F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 215 numberboard late
		bodyModel[178].setRotationPoint(38.6F, -18F, -6.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F); // Box 216 numberboard late 
		bodyModel[179].setRotationPoint(38.6F, -18F, 1.25F);

		bodyModel[180].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[180].setRotationPoint(42F, -1F, 2F);
		bodyModel[180].rotateAngleY = -3.14159265F;
		bodyModel[180].rotateAngleZ = -1.48352986F;

		bodyModel[181].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[181].setRotationPoint(-42F, -1F, -2F);
		bodyModel[181].rotateAngleZ = -1.48352986F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[182].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[182].rotateAngleY = -0.05235988F;

		bodyModel[183].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[183].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[183].rotateAngleY = 0.05235988F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[184].setRotationPoint(-46F, 7F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[185].setRotationPoint(-46F, 7F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[186].setRotationPoint(-45F, 6F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[187].setRotationPoint(-45F, 6F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[188].setRotationPoint(-45F, 5F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[189].setRotationPoint(-45F, 5F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[190].setRotationPoint(44F, 6F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[191].setRotationPoint(44F, 6F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[192].setRotationPoint(45F, 7F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[193].setRotationPoint(45F, 7F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[194].setRotationPoint(44F, 5F, 2F);

		bodyModel[195].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[195].setRotationPoint(44F, 5F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[196].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[197].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[198].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[199].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[200].setRotationPoint(42F, -1F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[201].setRotationPoint(42F, -1F, 2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[202].setRotationPoint(-43F, -1F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[203].setRotationPoint(-43F, -1F, 2F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[204].setRotationPoint(-42F, -1F, 10F);

		bodyModel[205].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[205].setRotationPoint(-42F, -1F, -11F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[206].setRotationPoint(-42F, -9F, -8F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[207].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[208].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[209].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[210].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[210].rotateAngleY = -3.14159265F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[211].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[211].rotateAngleY = -3.14159265F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[212].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[213].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[213].rotateAngleY = -3.14159265F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[214].setRotationPoint(42F, -1F, -7F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[215].setRotationPoint(42F, -9F, -2F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[216].setRotationPoint(42F, -9F, 2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[217].setRotationPoint(42F, -1F, 2F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[218].setRotationPoint(-43F, -9F, -2F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[219].setRotationPoint(-43F, -9F, 2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[220].setRotationPoint(-43F, -1F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[221].setRotationPoint(-43F, -1F, 2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 309 cab roof vent
		bodyModel[222].setRotationPoint(-22F, -21.5F, -5F);
		bodyModel[222].rotateAngleX = 0.15707963F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 310
		bodyModel[223].setRotationPoint(-40F, -1F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 311
		bodyModel[224].setRotationPoint(-40F, -1F, 8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 312
		bodyModel[225].setRotationPoint(39F, -1F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[226].setRotationPoint(39F, -1F, -9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 18, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 336 tiny mini mexico tank
		bodyModel[227].setRotationPoint(-9F, 5F, -10F);

		bodyModel[228].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 340 spee pee lol
		bodyModel[228].setRotationPoint(-7F, 1.5F, -11.25F);
		bodyModel[228].rotateAngleX = 1.57079633F;

		bodyModel[229].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 341 spee pee lol
		bodyModel[229].setRotationPoint(6F, 1.5F, 11.25F);
		bodyModel[229].rotateAngleX = -1.57079633F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[230].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[231].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[232].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[233].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[234].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 250
		bodyModel[234].setRotationPoint(-37F, -13F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 410
		bodyModel[235].setRotationPoint(-37F, -13F, 11F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[236].setRotationPoint(-39F, -10F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[237].setRotationPoint(-39F, -6F, 10.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[238].setRotationPoint(-39F, -6F, -11.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[239].setRotationPoint(-39F, -10F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[240].setRotationPoint(-39F, -13F, 11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[241].setRotationPoint(-39F, -13F, -11F);

		bodyModel[242].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[242].setRotationPoint(-20F, -13F, 11F);

		bodyModel[243].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[243].setRotationPoint(-5F, -9F, 11F);

		bodyModel[244].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[244].setRotationPoint(-20F, -13F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[245].setRotationPoint(-5F, -9F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[246].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[247].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[248].setRotationPoint(39F, -9F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[249].setRotationPoint(39F, -6F, -11.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[250].setRotationPoint(39F, -6F, 10.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[251].setRotationPoint(39F, -9F, 9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 411
		bodyModel[252].setRotationPoint(-39F, -13F, 11.01F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F); // Box 412
		bodyModel[253].setRotationPoint(-39F, -13F, -11.01F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[254].setRotationPoint(-26.05F, -15F, 1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[255].setRotationPoint(-32.75F, -13F, 3F);
		bodyModel[255].rotateAngleY = -0.45378561F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[256].setRotationPoint(-32.75F, -15F, 3F);
		bodyModel[256].rotateAngleY = -0.45378561F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[257].setRotationPoint(-32.75F, -9F, 3F);
		bodyModel[257].rotateAngleY = -0.45378561F;

		bodyModel[258].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[258].setRotationPoint(-32F, -17F, 7.5F);
		//bodyModel[258].rotateAngleY = 0.17453293F;

		bodyModel[259].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[259].setRotationPoint(-33F, 1F, 9F);
		bodyModel[259].rotateAngleZ = -0.27925268F;

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[260].setRotationPoint(-36F, 1F, 9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[261].setRotationPoint(-22F, -21F, -5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Box 430 backwall cull bit
		bodyModel[262].setRotationPoint(-22F, -15F, 1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[263].setRotationPoint(-22F, -20F, 0F);

		bodyModel[264].addBox(0F, 0F, 0F, 20, 2, 20, 0F); // Box 144
		bodyModel[264].setRotationPoint(17F, -20F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, -0.34F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[265].setRotationPoint(17F, -18F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[266].setRotationPoint(17F, -18F, 7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[267].setRotationPoint(17F, -22F, -2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[268].setRotationPoint(17F, -21F, 9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[269].setRotationPoint(17F, -21F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[270].setRotationPoint(17F, -22F, 2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[271].setRotationPoint(17F, -22F, -9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -1.5F, -7F, -17F, -1.5F, -7F, -17F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, -7F, -17F, 1.5F, -7F, -17F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 370
		bodyModel[272].setRotationPoint(19F, -22.51F, -16F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0.25F, 0F, -17F, 0.25F, 0F, -17F, 1.5F, -7F, 0F, 1.5F, -7F); // Box 371
		bodyModel[273].setRotationPoint(19F, -22.51F, 2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133
		bodyModel[274].setRotationPoint(37F, -20F, 7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 138
		bodyModel[275].setRotationPoint(37F, -20F, -10.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 34, 0, 8, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F); // Box 455
		bodyModel[276].setRotationPoint(19F, -22.26F, -2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0F, -1.185F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 456
		bodyModel[277].setRotationPoint(37F, -22F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.34F, -0.5F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[278].setRotationPoint(37F, -21F, -10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[279].setRotationPoint(37F, -22F, -2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 462
		bodyModel[280].setRotationPoint(37F, -22F, 1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0.25F, -1F, 0F, 0.25F, 0F, -1.185F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[281].setRotationPoint(37F, -22F, 1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[282].setRotationPoint(37F, -21F, 9F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F, -0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F); // Box 468
		bodyModel[283].setRotationPoint(37F, -21F, -9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[284].setRotationPoint(20.25F, -16F, -8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[285].setRotationPoint(20.25F, -8F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[286].setRotationPoint(20.25F, -16F, 7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[287].setRotationPoint(20.25F, -8F, 7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[288].setRotationPoint(-36F, 2F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[289].setRotationPoint(-36F, 1F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 545
		bodyModel[290].setRotationPoint(34F, 1F, 11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 546
		bodyModel[291].setRotationPoint(34F, 1F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[292].setRotationPoint(-42.01F, 8F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[293].setRotationPoint(-42.01F, 8F, 11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 549
		bodyModel[294].setRotationPoint(36.01F, 8F, 11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 550
		bodyModel[295].setRotationPoint(36.01F, 8F, -11F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 354
		bodyModel[296].setRotationPoint(-32.75F, -23.25F, 0.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[297].setRotationPoint(-32.25F, -22.5F, -0.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[298].setRotationPoint(-33.75F, -23.5F, -0.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 357
		bodyModel[299].setRotationPoint(-32.25F, -23.25F, -1.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[300].setRotationPoint(-33.25F, -24.5F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[301].setRotationPoint(-32.25F, -24.5F, 0.25F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[302].setRotationPoint(-29F, -27.5F, 4F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 414 sp e gyra holdy rear
		bodyModel[303].setRotationPoint(39.01F, -22.6F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415 sp e gyra reart
		bodyModel[304].setRotationPoint(39.9F, -22.6F, -1F);

		bodyModel[305].addBox(0F, 0F, 0F, 9, 5, 15, 0F); // Box 379 big box boye
		bodyModel[305].setRotationPoint(-13F, -23F, -7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, -2F, 0F, 0F, -2F, 0F); // Box 306
		bodyModel[306].setRotationPoint(-28.25F, -7F, -11.01F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, -2F, 0F, 0F, -2F, 0F); // Box 307
		bodyModel[307].setRotationPoint(-28.25F, -7F, 11.01F);
	}

	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1345) {
			//fb2 black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1632){
			//type b silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1987){
			//fb2 blac early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}