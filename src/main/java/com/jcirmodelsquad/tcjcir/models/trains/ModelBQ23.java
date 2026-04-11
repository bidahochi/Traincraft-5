//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BQ23-7
// Model Creator: bida
// Created on: 23.09.2023 - 16:51:07
// Last changed on: 23.09.2023 - 16:51:07

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
import train.common.api.Locomotive;
import train.common.library.Info;

public class ModelBQ23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelBQ23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[386];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[7] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[8] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[9] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[10] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[11] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[12] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[13] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[14] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[15] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[16] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[17] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[18] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[20] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[21] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[22] = new ModelRendererTurbo(this, 371, 124, textureX, textureY,"cull"); // Box 305 pipe cull
		bodyModel[23] = new ModelRendererTurbo(this, 359, 124, textureX, textureY,"cull"); // Box 305 pipe cull
		bodyModel[24] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[25] = new ModelRendererTurbo(this, 371, 124, textureX, textureY,"cull"); // Box 305 pipe cull
		bodyModel[26] = new ModelRendererTurbo(this, 362, 116, textureX, textureY,"cull"); // Box 305 pipe cull
		bodyModel[27] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[28] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[29] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[30] = new ModelRendererTurbo(this, 77, 120, textureX, textureY); // Box 2603
		bodyModel[31] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[32] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[33] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[34] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[35] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[37] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[38] = new ModelRendererTurbo(this, 314, 117, textureX, textureY,"cull"); // Box 310 cull fueltank support
		bodyModel[39] = new ModelRendererTurbo(this, 314, 117, textureX, textureY,"cull"); // Box 311 cull fueltank support
		bodyModel[40] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[41] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[42] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[43] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[44] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[45] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[46] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[47] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[48] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[49] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[50] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[51] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[52] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[54] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[55] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[56] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[57] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[58] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[59] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[60] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[61] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[62] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[63] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318 ph1 mounting stuff
		bodyModel[65] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322 ph1 mounting stuff
		bodyModel[66] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757 ph1 mounting stuff
		bodyModel[67] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758 ph1 mounting stuff
		bodyModel[68] = new ModelRendererTurbo(this, 256, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[69] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[70] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[71] = new ModelRendererTurbo(this, 240, 127, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[72] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[73] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[74] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[75] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[76] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[77] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[78] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[79] = new ModelRendererTurbo(this, 68, 76, textureX, textureY); // Box 688
		bodyModel[80] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[81] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[82] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[83] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[84] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[85] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[86] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[87] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[88] = new ModelRendererTurbo(this, 1, 47, textureX, textureY,"lamp"); // Box 186 Headlight Front up
		bodyModel[89] = new ModelRendererTurbo(this, 1, 52, textureX, textureY,"lamp"); // Box 187 Headlight Front down
		bodyModel[90] = new ModelRendererTurbo(this, 2, 91, textureX, textureY,"lamp"); // Box 117 numberboard
		bodyModel[91] = new ModelRendererTurbo(this, 2, 91, textureX, textureY,"lamp"); // Box 118 numberboard
		bodyModel[92] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[93] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[94] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[95] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[96] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[97] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[98] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[99] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[100] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[101] = new ModelRendererTurbo(this, 249, 29, textureX, textureY); // Box 285
		bodyModel[102] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 157
		bodyModel[103] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18 early stack
		bodyModel[104] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21 early stack
		bodyModel[105] = new ModelRendererTurbo(this, 248, 41, textureX, textureY); // Box 18 late stack
		bodyModel[106] = new ModelRendererTurbo(this, 246, 49, textureX, textureY); // Box 21 late stack
		bodyModel[107] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[108] = new ModelRendererTurbo(this, 256, 115, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[109] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[110] = new ModelRendererTurbo(this, 176, 140, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[111] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[112] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[113] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[114] = new ModelRendererTurbo(this, 447, 112, textureX, textureY,"lamp"); // Box 284 Headlight Rear down early
		bodyModel[115] = new ModelRendererTurbo(this, 447, 112, textureX, textureY,"lamp"); // Box 285 Headlight Rear up early
		bodyModel[116] = new ModelRendererTurbo(this, 481, 109, textureX, textureY,"lamp"); // Box 165 numberboard early
		bodyModel[117] = new ModelRendererTurbo(this, 481, 109, textureX, textureY,"lamp"); // Box 167 numberboard early
		bodyModel[118] = new ModelRendererTurbo(this, 336, 112, textureX, textureY); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[119] = new ModelRendererTurbo(this, 334, 122, textureX, textureY); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[120] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 355 brakewheel
		bodyModel[121] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[122] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 535 b23-7 radi
		bodyModel[123] = new ModelRendererTurbo(this, 444, 60, textureX, textureY); // Box 293 b23-7 radi
		bodyModel[124] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 293 regular thin radi
		bodyModel[125] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 229 smol low radiator smol
		bodyModel[126] = new ModelRendererTurbo(this, 484, 53, textureX, textureY); // Box 230 smol low radiator 2
		bodyModel[127] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 293  smol low radiator 1
		bodyModel[128] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 232 smol low radiator smol
		bodyModel[129] = new ModelRendererTurbo(this, 484, 60, textureX, textureY); // Box 233 smol low radiator 2
		bodyModel[130] = new ModelRendererTurbo(this, 493, 25, textureX, textureY); // Box 234 regular thin radi
		bodyModel[131] = new ModelRendererTurbo(this, 476, 16, textureX, textureY); // Box 235 smol low radiator 1
		bodyModel[132] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 236 b30-7a early
		bodyModel[133] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 237 b30-7a early
		bodyModel[134] = new ModelRendererTurbo(this, 444, 46, textureX, textureY); // Box 238 b30-7 radi
		bodyModel[135] = new ModelRendererTurbo(this, 444, 53, textureX, textureY); // Box 239 b30-7 radi
		bodyModel[136] = new ModelRendererTurbo(this, 444, 46, textureX, textureY); // Box 240 b30-7 radi
		bodyModel[137] = new ModelRendererTurbo(this, 444, 53, textureX, textureY); // Box 241 b30-7 radi
		bodyModel[138] = new ModelRendererTurbo(this, 460, 98, textureX, textureY,"cull"); // Box 328 cull crossover
		bodyModel[139] = new ModelRendererTurbo(this, 98, 145, textureX, textureY,"cull"); // Box 339 cull crossover
		bodyModel[140] = new ModelRendererTurbo(this, 499, 140, textureX, textureY,"lamp"); // Box 339 glowey marker
		bodyModel[141] = new ModelRendererTurbo(this, 499, 140, textureX, textureY,"lamp"); // Box 340 glowey marker
		bodyModel[142] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[143] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[144] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[145] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[146] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[147] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[148] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[149] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[150] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[151] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[152] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[153] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[154] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[155] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[156] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[157] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[158] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[159] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[160] = new ModelRendererTurbo(this, 424, 129, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[161] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[162] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[163] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[164] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[165] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[166] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[167] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[168] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[169] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[170] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[171] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[172] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[173] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[174] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[175] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[176] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[177] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[178] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[179] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[180] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[181] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[182] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[183] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[184] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[185] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[186] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[187] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[188] = new ModelRendererTurbo(this, 136, 66, textureX, textureY,"cull"); // Box 418 cull platform atsf
		bodyModel[189] = new ModelRendererTurbo(this, 178, 65, textureX, textureY,"cull"); // Box 419 cull atsf bit
		bodyModel[190] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[191] = new ModelRendererTurbo(this, 156, 68, textureX, textureY); // Box 308
		bodyModel[192] = new ModelRendererTurbo(this, 125, 138, textureX, textureY,"cull"); // Box 314 cull anticlimber
		bodyModel[193] = new ModelRendererTurbo(this, 148, 144, textureX, textureY,"cull"); // Box 315 cull anticlimber
		bodyModel[194] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[195] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[196] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[197] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[198] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[199] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[200] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[201] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[202] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[203] = new ModelRendererTurbo(this, 148, 8, textureX, textureY,"prime1"); // Box 6 PRIME2-1
		bodyModel[204] = new ModelRendererTurbo(this, 148, 8, textureX, textureY,"prime3"); // Box 7 PRIME2-3
		bodyModel[205] = new ModelRendererTurbo(this, 148, 8, textureX, textureY,"prime2"); // Box 8 PRIME2-2
		bodyModel[206] = new ModelRendererTurbo(this, 148, 8, textureX, textureY,"prime4"); // Box 9 PRIME2-4
		bodyModel[207] = new ModelRendererTurbo(this, 339, 122, textureX, textureY); // Box 340 spee pee lol
		bodyModel[208] = new ModelRendererTurbo(this, 341, 112, textureX, textureY); // Box 341 spee pee lol
		bodyModel[209] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[210] = new ModelRendererTurbo(this, 174, 55, textureX, textureY,"prime1"); // Box 6 PRIME4-1
		bodyModel[211] = new ModelRendererTurbo(this, 174, 55, textureX, textureY,"prime3"); // Box 7 PRIME4-3
		bodyModel[212] = new ModelRendererTurbo(this, 174, 55, textureX, textureY,"prime2"); // Box 8 PRIME4-2
		bodyModel[213] = new ModelRendererTurbo(this, 174, 55, textureX, textureY,"prime4"); // Box 9 PRIME4-4
		bodyModel[214] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428 prime base
		bodyModel[215] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[216] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[217] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[218] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[219] = new ModelRendererTurbo(this, 151, 55, textureX, textureY,"prime1"); // Box 6 PRIME3-1
		bodyModel[220] = new ModelRendererTurbo(this, 151, 55, textureX, textureY,"prime3"); // Box 7 PRIME3-3
		bodyModel[221] = new ModelRendererTurbo(this, 151, 55, textureX, textureY,"prime2"); // Box 8 PRIME3-2
		bodyModel[222] = new ModelRendererTurbo(this, 151, 55, textureX, textureY,"prime4"); // Box 9 PRIME3-4
		bodyModel[223] = new ModelRendererTurbo(this, 161, 56, textureX, textureY,"cull"); // Box 426 cull
		bodyModel[224] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428 prime base
		bodyModel[225] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[226] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[227] = new ModelRendererTurbo(this, 201, 60, textureX, textureY,"ditch"); // Box 190 ditchlight f1
		bodyModel[228] = new ModelRendererTurbo(this, 193, 61, textureX, textureY,"ditch"); // Box 275 ditchlight f2
		bodyModel[229] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[230] = new ModelRendererTurbo(this, 193, 61, textureX, textureY,"ditch"); // Box 445 ditchlight f2
		bodyModel[231] = new ModelRendererTurbo(this, 201, 60, textureX, textureY,"ditch"); // Box 446 ditchlight f1
		bodyModel[232] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[233] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[234] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[235] = new ModelRendererTurbo(this, 213, 60, textureX, textureY,"ditch"); // Box 276 ditchlight r1
		bodyModel[236] = new ModelRendererTurbo(this, 222, 60, textureX, textureY,"ditch"); // Box 278 ditchlight r2
		bodyModel[237] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[238] = new ModelRendererTurbo(this, 222, 60, textureX, textureY,"ditch"); // Box 441 ditchlight r2
		bodyModel[239] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[240] = new ModelRendererTurbo(this, 213, 60, textureX, textureY,"ditch"); // Box 443 ditchlight r1
		bodyModel[241] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[242] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[243] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[244] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[245] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[246] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[247] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[248] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[249] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[250] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[251] = new ModelRendererTurbo(this, 442, 109, textureX, textureY); // Box 296
		bodyModel[252] = new ModelRendererTurbo(this, 444, 124, textureX, textureY); // Box 280
		bodyModel[253] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[254] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[255] = new ModelRendererTurbo(this, 370, 88, textureX, textureY); // Box 379 big box boye
		bodyModel[256] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[257] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[258] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[259] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[260] = new ModelRendererTurbo(this, 55, 188, textureX, textureY,"lamp"); // Box 275 cs speedo glow
		bodyModel[261] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[262] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[263] = new ModelRendererTurbo(this, 67, 186, textureX, textureY); // Box 429 backwall
		bodyModel[264] = new ModelRendererTurbo(this, 90, 192, textureX, textureY,"cull"); // Box 430 backwall cull bit
		bodyModel[265] = new ModelRendererTurbo(this, 101, 186, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[266] = new ModelRendererTurbo(this, 344, 198, textureX, textureY); // Box 144
		bodyModel[267] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[268] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[269] = new ModelRendererTurbo(this, 439, 244, textureX, textureY); // Box 371
		bodyModel[270] = new ModelRendererTurbo(this, 442, 231, textureX, textureY); // Box 361
		bodyModel[271] = new ModelRendererTurbo(this, 384, 243, textureX, textureY); // Box 365
		bodyModel[272] = new ModelRendererTurbo(this, 436, 234, textureX, textureY); // Box 368
		bodyModel[273] = new ModelRendererTurbo(this, 378, 233, textureX, textureY); // Box 369
		bodyModel[274] = new ModelRendererTurbo(this, 415, 213, textureX, textureY); // Box 370
		bodyModel[275] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 371
		bodyModel[276] = new ModelRendererTurbo(this, 486, 235, textureX, textureY); // Box 133
		bodyModel[277] = new ModelRendererTurbo(this, 376, 235, textureX, textureY); // Box 138
		bodyModel[278] = new ModelRendererTurbo(this, 421, 204, textureX, textureY); // Box 455
		bodyModel[279] = new ModelRendererTurbo(this, 363, 235, textureX, textureY); // Box 456
		bodyModel[280] = new ModelRendererTurbo(this, 377, 232, textureX, textureY); // Box 459
		bodyModel[281] = new ModelRendererTurbo(this, 370, 232, textureX, textureY); // Box 461
		bodyModel[282] = new ModelRendererTurbo(this, 492, 232, textureX, textureY); // Box 462
		bodyModel[283] = new ModelRendererTurbo(this, 485, 235, textureX, textureY); // Box 465
		bodyModel[284] = new ModelRendererTurbo(this, 487, 232, textureX, textureY); // Box 467
		bodyModel[285] = new ModelRendererTurbo(this, 415, 233, textureX, textureY); // Box 468
		bodyModel[286] = new ModelRendererTurbo(this, 492, 140, textureX, textureY,"lamp"); // Box 339 glowey marker 2
		bodyModel[287] = new ModelRendererTurbo(this, 492, 140, textureX, textureY,"lamp"); // Box 340 glowey marker 2
		bodyModel[288] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[289] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[290] = new ModelRendererTurbo(this, 491, 6, textureX, textureY); // Box 471 funky double radiator
		bodyModel[291] = new ModelRendererTurbo(this, 491, 15, textureX, textureY); // Box 472 funky double radiator
		bodyModel[292] = new ModelRendererTurbo(this, 146, 148, textureX, textureY); // Box 407
		bodyModel[293] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 445
		bodyModel[294] = new ModelRendererTurbo(this, 12, 188, textureX, textureY); // Box 446
		bodyModel[295] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 48
		bodyModel[296] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 43
		bodyModel[297] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 175
		bodyModel[298] = new ModelRendererTurbo(this, 18, 26, textureX, textureY); // Box 52 door swing left
		bodyModel[299] = new ModelRendererTurbo(this, 88, 26, textureX, textureY); // Box 314 door swing right
		bodyModel[300] = new ModelRendererTurbo(this, 100, 12, textureX, textureY); // Box 343
		bodyModel[301] = new ModelRendererTurbo(this, 100, 4, textureX, textureY); // Box 344
		bodyModel[302] = new ModelRendererTurbo(this, 101, 20, textureX, textureY); // Box 345
		bodyModel[303] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 348
		bodyModel[304] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 351
		bodyModel[305] = new ModelRendererTurbo(this, 106, 28, textureX, textureY); // Box 352
		bodyModel[306] = new ModelRendererTurbo(this, 53, 79, textureX, textureY); // Box 353
		bodyModel[307] = new ModelRendererTurbo(this, 64, 72, textureX, textureY); // Box 357
		bodyModel[308] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 358
		bodyModel[309] = new ModelRendererTurbo(this, 49, 60, textureX, textureY); // Box 359
		bodyModel[310] = new ModelRendererTurbo(this, 59, 60, textureX, textureY); // Box 360
		bodyModel[311] = new ModelRendererTurbo(this, 64, 10, textureX, textureY); // Box 361
		bodyModel[312] = new ModelRendererTurbo(this, 27, 63, textureX, textureY); // Box 362
		bodyModel[313] = new ModelRendererTurbo(this, 34, 59, textureX, textureY); // Box 361
		bodyModel[314] = new ModelRendererTurbo(this, 55, 13, textureX, textureY); // Box 361
		bodyModel[315] = new ModelRendererTurbo(this, 68, 59, textureX, textureY); // Box 361
		bodyModel[316] = new ModelRendererTurbo(this, 100, 1, textureX, textureY); // Box 362
		bodyModel[317] = new ModelRendererTurbo(this, 83, 63, textureX, textureY); // Box 362
		bodyModel[318] = new ModelRendererTurbo(this, 101, 28, textureX, textureY); // Box 362
		bodyModel[319] = new ModelRendererTurbo(this, 30, 22, textureX, textureY); // Box 269 door swing left
		bodyModel[320] = new ModelRendererTurbo(this, 29, 31, textureX, textureY); // Box 52 door swing left
		bodyModel[321] = new ModelRendererTurbo(this, 25, 22, textureX, textureY); // Box 264 door swing left
		bodyModel[322] = new ModelRendererTurbo(this, 81, 31, textureX, textureY); // Box 265 door swing right
		bodyModel[323] = new ModelRendererTurbo(this, 87, 22, textureX, textureY); // Box 266 door swing right
		bodyModel[324] = new ModelRendererTurbo(this, 82, 22, textureX, textureY); // Box 267 door swing right
		bodyModel[325] = new ModelRendererTurbo(this, 82, 10, textureX, textureY); // Box 268
		bodyModel[326] = new ModelRendererTurbo(this, 73, 13, textureX, textureY); // Box 269
		bodyModel[327] = new ModelRendererTurbo(this, 91, 14, textureX, textureY); // Box 270
		bodyModel[328] = new ModelRendererTurbo(this, 136, 1, textureX, textureY); // Box 271
		bodyModel[329] = new ModelRendererTurbo(this, 137, 28, textureX, textureY); // Box 272
		bodyModel[330] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 276
		bodyModel[331] = new ModelRendererTurbo(this, 66, 78, textureX, textureY); // Box 284
		bodyModel[332] = new ModelRendererTurbo(this, 42, 74, textureX, textureY); // Box 402
		bodyModel[333] = new ModelRendererTurbo(this, 66, 74, textureX, textureY); // Box 286
		bodyModel[334] = new ModelRendererTurbo(this, 68, 48, textureX, textureY); // Box 341
		bodyModel[335] = new ModelRendererTurbo(this, 14, 48, textureX, textureY); // Box 346
		bodyModel[336] = new ModelRendererTurbo(this, 14, 40, textureX, textureY); // Box 347
		bodyModel[337] = new ModelRendererTurbo(this, 65, 40, textureX, textureY); // Box 351
		bodyModel[338] = new ModelRendererTurbo(this, 45, 40, textureX, textureY); // Box 347
		bodyModel[339] = new ModelRendererTurbo(this, 1, 67, textureX, textureY,"lamp"); // Box 307 glowey marker
		bodyModel[340] = new ModelRendererTurbo(this, 1, 67, textureX, textureY,"lamp"); // Box 308 glowey marker
		bodyModel[341] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 499
		bodyModel[342] = new ModelRendererTurbo(this, 182, 4, textureX, textureY,"commander"); // Box 410 commander beacon
		bodyModel[343] = new ModelRendererTurbo(this, 182, 4, textureX, textureY,"commander"); // Box 309 commander beacon
		bodyModel[344] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 273
		bodyModel[345] = new ModelRendererTurbo(this, 143, 131, textureX, textureY); // Box 503
		bodyModel[346] = new ModelRendererTurbo(this, 139, 124, textureX, textureY); // Box 504
		bodyModel[347] = new ModelRendererTurbo(this, 93, 134, textureX, textureY); // Box 505
		bodyModel[348] = new ModelRendererTurbo(this, 97, 124, textureX, textureY); // Box 506
		bodyModel[349] = new ModelRendererTurbo(this, 174, 29, textureX, textureY,"cull"); // Box 561 cull ptc antenna shiz
		bodyModel[350] = new ModelRendererTurbo(this, 155, 29, textureX, textureY,"cull"); // Box 562 cull ptc antenna shiz
		bodyModel[351] = new ModelRendererTurbo(this, 178, 27, textureX, textureY); // Box 563
		bodyModel[352] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 564
		bodyModel[353] = new ModelRendererTurbo(this, 146, 16, textureX, textureY,"cull"); // Box 330 cull sp beacon holder
		bodyModel[354] = new ModelRendererTurbo(this, 105, 188, textureX, textureY); // Box 370
		bodyModel[355] = new ModelRendererTurbo(this, 58, 231, textureX, textureY); // Box 371 engineer heater
		bodyModel[356] = new ModelRendererTurbo(this, 1, 196, textureX, textureY); // Box 372
		bodyModel[357] = new ModelRendererTurbo(this, 1, 212, textureX, textureY); // Box 373
		bodyModel[358] = new ModelRendererTurbo(this, 1, 204, textureX, textureY); // Box 374
		bodyModel[359] = new ModelRendererTurbo(this, 78, 213, textureX, textureY); // Box 285 AC's Alien Nation
		bodyModel[360] = new ModelRendererTurbo(this, 77, 114, textureX, textureY); // Box 376
		bodyModel[361] = new ModelRendererTurbo(this, 68, 109, textureX, textureY); // Box 377
		bodyModel[362] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 378
		bodyModel[363] = new ModelRendererTurbo(this, 156, 126, textureX, textureY); // Box 379
		bodyModel[364] = new ModelRendererTurbo(this, 147, 124, textureX, textureY); // Box 380
		bodyModel[365] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 381
		bodyModel[366] = new ModelRendererTurbo(this, 488, 145, textureX, textureY); // Box 382
		bodyModel[367] = new ModelRendererTurbo(this, 432, 142, textureX, textureY); // Box 383
		bodyModel[368] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 384
		bodyModel[369] = new ModelRendererTurbo(this, 431, 136, textureX, textureY); // Box 385
		bodyModel[370] = new ModelRendererTurbo(this, 495, 148, textureX, textureY); // Box 386
		bodyModel[371] = new ModelRendererTurbo(this, 58, 231, textureX, textureY); // Box 387 fireman heater
		bodyModel[372] = new ModelRendererTurbo(this, 1, 221, textureX, textureY); // Box 388
		bodyModel[373] = new ModelRendererTurbo(this, 2, 226, textureX, textureY); // Box 389
		bodyModel[374] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Box 390
		bodyModel[375] = new ModelRendererTurbo(this, 26, 221, textureX, textureY); // Box 391
		bodyModel[376] = new ModelRendererTurbo(this, 54, 221, textureX, textureY); // Box 392
		bodyModel[377] = new ModelRendererTurbo(this, 44, 220, textureX, textureY); // Box 393
		bodyModel[378] = new ModelRendererTurbo(this, 1, 234, textureX, textureY); // Box 394
		bodyModel[379] = new ModelRendererTurbo(this, 10, 237, textureX, textureY); // Box 395
		bodyModel[380] = new ModelRendererTurbo(this, 21, 234, textureX, textureY); // Box 396
		bodyModel[381] = new ModelRendererTurbo(this, 30, 231, textureX, textureY); // Box 397
		bodyModel[382] = new ModelRendererTurbo(this, 40, 240, textureX, textureY); // Box 398
		bodyModel[383] = new ModelRendererTurbo(this, 10, 234, textureX, textureY); // Box 399
		bodyModel[384] = new ModelRendererTurbo(this, 36, 10, textureX, textureY); // Box 28
		bodyModel[385] = new ModelRendererTurbo(this, 33, 218, textureX, textureY); // Box 401

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[3].setRotationPoint(-42F, -1F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(-9F, 2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[5].setRotationPoint(10F, 4F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[6].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[7].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[8].setRotationPoint(-9F, 5F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[9].setRotationPoint(-9F, 5F, 8F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[10].setRotationPoint(-39F, -1F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[11].setRotationPoint(-42F, 8F, 8F);

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

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[17].setRotationPoint(-42F, 8F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[18].setRotationPoint(38F, -1F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[19].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[20].setRotationPoint(42F, 8F, -9F);

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

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[27].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[28].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[29].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[30].setRotationPoint(-38F, 2F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[31].setRotationPoint(-39F, -1F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[32].setRotationPoint(38F, -1F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[33].setRotationPoint(-42F, 1F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[34].setRotationPoint(37F, 1F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[35].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[36].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[37].setRotationPoint(38F, -1F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[38].setRotationPoint(9F, 3F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[39].setRotationPoint(-12F, 3F, -6F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[40].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[41].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[42].setRotationPoint(-42F, 6F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[43].setRotationPoint(-42F, 6F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[44].setRotationPoint(39F, 6F, 8F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[45].setRotationPoint(39F, 6F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[46].setRotationPoint(39F, 8F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[47].setRotationPoint(39F, 2F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[48].setRotationPoint(39F, 8F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[49].setRotationPoint(39F, 2F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[50].setRotationPoint(39F, -1F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[51].setRotationPoint(-42F, 5F, 7.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[52].setRotationPoint(-42F, 5F, -9.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[53].setRotationPoint(39F, 5F, -9.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[54].setRotationPoint(39F, 5F, 7.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[55].setRotationPoint(39F, 4F, 7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[56].setRotationPoint(-42F, 4F, 7.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[57].setRotationPoint(-42F, 4F, -7.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[58].setRotationPoint(39F, 4F, -7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[59].setRotationPoint(-12F, 5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[60].setRotationPoint(-10F, 5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[61].setRotationPoint(9F, 5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[62].setRotationPoint(11F, 5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318 ph1 mounting stuff
		bodyModel[64].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322 ph1 mounting stuff
		bodyModel[65].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757 ph1 mounting stuff
		bodyModel[66].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758 ph1 mounting stuff
		bodyModel[67].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[68].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[69].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[70].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[71].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[72].setRotationPoint(-38F, 1F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[73].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[74].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[74].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[74].rotateAngleX = 1.57079633F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[75].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[75].rotateAngleX = -1.57079633F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[76].setRotationPoint(-38F, 1F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[77].setRotationPoint(39F, -1F, -8F);

		bodyModel[78].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[78].setRotationPoint(-36F, -5F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 688
		bodyModel[79].setRotationPoint(-37F, -5F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[80].setRotationPoint(-11F, -3F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[81].setRotationPoint(-11F, -3F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[82].setRotationPoint(-11F, -5F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[83].setRotationPoint(-11F, -5F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[84].setRotationPoint(-35F, -20F, -10F);
		bodyModel[84].rotateAngleX = -0.62831853F;

		bodyModel[85].addBox(0F, -4F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[85].setRotationPoint(-34F, -14F, -11F);
		bodyModel[85].rotateAngleX = -0.19198622F;

		bodyModel[86].addBox(0F, -4F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[86].setRotationPoint(-34.01F, -14F, 11F);
		bodyModel[86].rotateAngleX = 0.19198622F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[87].setRotationPoint(-35F, -20F, 10F);
		bodyModel[87].rotateAngleX = 0.62831853F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[88].setRotationPoint(-37.5F, -22.5F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[89].setRotationPoint(-37.5F, -20.5F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, -5.08F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[90].setRotationPoint(-37.1F, -22.5F, -1F);
		bodyModel[90].rotateAngleY = 0.20071286F;

		bodyModel[91].addShapeBox(0F, 0F, 0.08F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[91].setRotationPoint(-37.1F, -22.5F, 1F);
		bodyModel[91].rotateAngleY = -0.20071286F;

		bodyModel[92].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[92].setRotationPoint(-20F, -20F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[93].setRotationPoint(-20F, -21F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[94].setRotationPoint(-20F, -21F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[95].setRotationPoint(-20F, -21F, -3F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[96].setRotationPoint(38F, -21F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[97].setRotationPoint(38F, -21F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[98].setRotationPoint(38F, -21F, -8F);

		bodyModel[99].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 283
		bodyModel[99].setRotationPoint(10F, -20F, -7.75F);

		bodyModel[100].addBox(0F, 0F, 0F, 28, 19, 1, 0F); // Box 284
		bodyModel[100].setRotationPoint(10F, -20F, 6.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[101].setRotationPoint(10F, -21F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[102].setRotationPoint(10F, -21F, 3F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 early stack
		bodyModel[103].setRotationPoint(11.5F, -22.5F, -2.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21 early stack
		bodyModel[104].setRotationPoint(11F, -21.5F, -3F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[105].setRotationPoint(10.5F, -22.5F, -3F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[106].setRotationPoint(10F, -21.5F, -3.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[107].setRotationPoint(10.5F, -23.5F, -3F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[108].setRotationPoint(23.5F, 2.5F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[109].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[110].setRotationPoint(23.5F, 1F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[111].setRotationPoint(24.5F, 2F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[112].setRotationPoint(37F, -22F, -1F);

		bodyModel[113].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[113].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down early
		bodyModel[114].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up early
		bodyModel[115].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard early
		bodyModel[116].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard early
		bodyModel[117].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[118].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 220 what'le it be fellas? ketchup? or mustard!
		bodyModel[118].setRotationPoint(6F, 1.5F, -11.25F);
		bodyModel[118].rotateAngleX = 1.57079633F;

		bodyModel[119].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 221 what'le it be fellas? ketchup? or mustard!
		bodyModel[119].setRotationPoint(-7F, 1.5F, 11.25F);
		bodyModel[119].rotateAngleX = -1.57079633F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[120].setRotationPoint(-41.4F, -9F, 6F);
		bodyModel[120].rotateAngleY = -1.57079633F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[121].setRotationPoint(-41.9F, -7F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 535 b23-7 radi
		bodyModel[122].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 293 b23-7 radi
		bodyModel[123].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 293 regular thin radi
		bodyModel[124].setRotationPoint(25F, -14F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229 smol low radiator smol
		bodyModel[125].setRotationPoint(27.5F, -6.5F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230 smol low radiator 2
		bodyModel[126].setRotationPoint(31F, -6.5F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293  smol low radiator 1
		bodyModel[127].setRotationPoint(17F, -7F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232 smol low radiator smol
		bodyModel[128].setRotationPoint(27.5F, -6.5F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233 smol low radiator 2
		bodyModel[129].setRotationPoint(31F, -6.5F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234 regular thin radi
		bodyModel[130].setRotationPoint(25F, -14F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 235 smol low radiator 1
		bodyModel[131].setRotationPoint(17F, -7F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 236 b30-7a early
		bodyModel[132].setRotationPoint(22.5F, -14F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 237 b30-7a early
		bodyModel[133].setRotationPoint(22.5F, -14F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 238 b30-7 radi
		bodyModel[134].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 239 b30-7 radi
		bodyModel[135].setRotationPoint(27.75F, -8F, 7.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 240 b30-7 radi
		bodyModel[136].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 241 b30-7 radi
		bodyModel[137].setRotationPoint(27.75F, -8F, -8.25F);

		bodyModel[138].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[138].setRotationPoint(42F, -1F, 2F);
		bodyModel[138].rotateAngleY = -3.14159265F;
		bodyModel[138].rotateAngleZ = -1.48352986F;

		bodyModel[139].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[139].setRotationPoint(-42F, -1F, -2F);
		bodyModel[139].rotateAngleZ = -1.48352986F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[140].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[140].rotateAngleY = -0.05235988F;

		bodyModel[141].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[141].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[141].rotateAngleY = 0.05235988F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[142].setRotationPoint(-46F, 7F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[143].setRotationPoint(-46F, 7F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[144].setRotationPoint(-45F, 6F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[145].setRotationPoint(-45F, 4F, 2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[146].setRotationPoint(-45F, 6F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[147].setRotationPoint(-45F, 4F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[148].setRotationPoint(-45F, 4F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[149].setRotationPoint(-45F, 4F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[150].setRotationPoint(44F, 6F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[151].setRotationPoint(44F, 6F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[152].setRotationPoint(45F, 7F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[153].setRotationPoint(45F, 7F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[154].setRotationPoint(44F, 5F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[155].setRotationPoint(44F, 4F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[156].setRotationPoint(44F, 5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[157].setRotationPoint(44F, 4F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[158].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[159].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[160].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[161].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[162].setRotationPoint(42F, -1F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[163].setRotationPoint(42F, -1F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[164].setRotationPoint(-43F, -1F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[165].setRotationPoint(-43F, -1F, 2F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[166].setRotationPoint(4.5F, -21F, -6.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[167].setRotationPoint(3F, -21.75F, -5.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[168].setRotationPoint(2F, -22F, -6.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[169].setRotationPoint(3.5F, -21.75F, -7.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[170].setRotationPoint(-42F, -1F, 10F);

		bodyModel[171].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[171].setRotationPoint(-42F, -1F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[172].setRotationPoint(-42F, -9F, -8F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 259
		bodyModel[173].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[174].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 269
		bodyModel[175].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[176].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[176].rotateAngleY = -3.14159265F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[177].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[178].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[179].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[179].rotateAngleY = -3.14159265F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[180].setRotationPoint(42F, -1F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[181].setRotationPoint(42F, -9F, -2F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[182].setRotationPoint(42F, -9F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[183].setRotationPoint(42F, -1F, 2F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[184].setRotationPoint(-43F, -9F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[185].setRotationPoint(-43F, -9F, 2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[186].setRotationPoint(-43F, -1F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[187].setRotationPoint(-43F, -1F, 2F);

		bodyModel[188].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[188].setRotationPoint(-26F, -23.5F, -2.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[189].setRotationPoint(-26F, -22.5F, 3.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[190].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[191].setRotationPoint(-25F, -24.5F, 0F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[192].setRotationPoint(-43F, -1F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[193].setRotationPoint(-44.5F, -1F, -8F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[194].setRotationPoint(-13.5F, -22F, -0.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[195].setRotationPoint(-16F, -23F, -0.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[196].setRotationPoint(-15F, -22.75F, 0.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[197].setRotationPoint(-13.5F, -22.75F, -1.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[198].setRotationPoint(-18F, -22.5F, 3.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[199].setRotationPoint(-16.5F, -22F, 4.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[200].setRotationPoint(-17F, -23F, 4.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[201].setRotationPoint(-18F, -22.5F, 5.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[202].setRotationPoint(-37.5F, -24F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[203].setRotationPoint(-37.5F, -24.5F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[204].setRotationPoint(-37.5F, -24.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[205].setRotationPoint(-37.5F, -24.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[206].setRotationPoint(-37.5F, -24.5F, -1F);

		bodyModel[207].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 340 spee pee lol
		bodyModel[207].setRotationPoint(-7F, 1.5F, -11.25F);
		bodyModel[207].rotateAngleX = 1.57079633F;

		bodyModel[208].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 341 spee pee lol
		bodyModel[208].setRotationPoint(6F, 1.5F, 11.25F);
		bodyModel[208].rotateAngleX = -1.57079633F;

		bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[209].setRotationPoint(-27F, -24F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[210].setRotationPoint(-30F, -23.5F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[211].setRotationPoint(-30F, -23.5F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[212].setRotationPoint(-30F, -23.5F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[213].setRotationPoint(-30F, -23.5F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[214].setRotationPoint(-30F, -23F, -1F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[215].setRotationPoint(-34.5F, -23.5F, -1.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[216].setRotationPoint(-33.5F, -23.5F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[217].setRotationPoint(-34.5F, -23.5F, 0.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[218].setRotationPoint(-33F, -22.5F, -0.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[219].setRotationPoint(-30F, -23.5F, 6.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[220].setRotationPoint(-30F, -23.5F, 6.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[221].setRotationPoint(-30F, -23.5F, 6.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[222].setRotationPoint(-30F, -23.5F, 6.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[223].setRotationPoint(-30.5F, -22F, 6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[224].setRotationPoint(-30F, -23F, 6.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[225].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[226].setRotationPoint(-42.5F, 0F, -8.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[227].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[228].setRotationPoint(-42.75F, 0F, -8.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[229].setRotationPoint(-42.5F, 0F, 6.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[230].setRotationPoint(-42.75F, 0F, 6.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[231].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[232].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[233].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[234].setRotationPoint(42F, 0F, -8.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[235].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[236].setRotationPoint(42.25F, 0F, -8.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[237].setRotationPoint(42F, 0F, 6.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[238].setRotationPoint(42.25F, 0F, 6.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[239].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[240].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[241].setRotationPoint(-3F, -18.25F, -9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[242].setRotationPoint(-3F, -19.25F, -9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[243].setRotationPoint(-2.75F, -17.75F, -8.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[244].setRotationPoint(-3F, -20.25F, -8.8F);

		bodyModel[245].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[245].setRotationPoint(-20F, -13F, 11F);

		bodyModel[246].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[246].setRotationPoint(-5F, -9F, 11F);

		bodyModel[247].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[247].setRotationPoint(-20F, -13F, -11F);

		bodyModel[248].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[248].setRotationPoint(-5F, -9F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[249].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[250].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[251].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[251].setRotationPoint(39F, -9F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[252].setRotationPoint(39F, -6F, -11.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[253].setRotationPoint(39F, -6F, 10.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[254].setRotationPoint(39F, -9F, 9F);

		bodyModel[255].addBox(0F, 0F, 0F, 9, 5, 15, 0F); // Box 379 big box boye
		bodyModel[255].setRotationPoint(-13F, -23F, -7.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[256].setRotationPoint(-30.8F, -17F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[257].setRotationPoint(-37.5F, -15F, 2F);
		bodyModel[257].rotateAngleY = -0.45378561F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[258].setRotationPoint(-37.5F, -17F, 2F);
		bodyModel[258].rotateAngleY = -0.45378561F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 531 cs
		bodyModel[259].setRotationPoint(-37.5F, -11F, 2F);
		bodyModel[259].rotateAngleY = -0.45378561F;

		bodyModel[260].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[260].setRotationPoint(-35.75F, -20F, 1.5F);
		bodyModel[260].rotateAngleY = 0.75049158F;

		bodyModel[261].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[261].setRotationPoint(-33F, 1F, 9F);
		bodyModel[261].rotateAngleZ = -0.27925268F;

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[262].setRotationPoint(-36F, 1F, 9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[263].setRotationPoint(-22F, -21F, -5F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Box 430 backwall cull bit
		bodyModel[264].setRotationPoint(-22F, -15F, 1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[265].setRotationPoint(-22F, -20F, 0F);

		bodyModel[266].addBox(0F, 0F, 0F, 20, 2, 20, 0F); // Box 144
		bodyModel[266].setRotationPoint(17F, -20F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, -0.34F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[267].setRotationPoint(17F, -18F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.34F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[268].setRotationPoint(17F, -18F, 7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[269].setRotationPoint(17F, -22F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[270].setRotationPoint(17F, -21F, 9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[271].setRotationPoint(17F, -21F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[272].setRotationPoint(17F, -22F, 2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 20, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[273].setRotationPoint(17F, -22F, -9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -1.5F, -7F, -17F, -1.5F, -7F, -17F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, -7F, -17F, 1.5F, -7F, -17F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 370
		bodyModel[274].setRotationPoint(19F, -22.51F, -16F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0.25F, 0F, -17F, 0.25F, 0F, -17F, 1.5F, -7F, 0F, 1.5F, -7F); // Box 371
		bodyModel[275].setRotationPoint(19F, -22.51F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.34F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133
		bodyModel[276].setRotationPoint(37F, -20F, 7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, -0.34F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 138
		bodyModel[277].setRotationPoint(37F, -20F, -10.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 34, 0, 8, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F); // Box 455
		bodyModel[278].setRotationPoint(19F, -22.26F, -2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0F, -1.185F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 456
		bodyModel[279].setRotationPoint(37F, -22F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.34F, -0.5F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.185F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[280].setRotationPoint(37F, -21F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[281].setRotationPoint(37F, -22F, -2F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 462
		bodyModel[282].setRotationPoint(37F, -22F, 1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0.25F, -1F, 0F, 0.25F, 0F, -1.185F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.185F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[283].setRotationPoint(37F, -22F, 1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.185F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[284].setRotationPoint(37F, -21F, 9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F, -0.82F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.82F, 0F, 0F); // Box 468
		bodyModel[285].setRotationPoint(37F, -21F, -9F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker 2
		bodyModel[286].setRotationPoint(37.85F, -20F, -7F);
		bodyModel[286].rotateAngleY = -0.05235988F;

		bodyModel[287].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker 2
		bodyModel[287].setRotationPoint(37.85F, -20F, 7F);
		bodyModel[287].rotateAngleY = 0.05235988F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[288].setRotationPoint(20.25F, -16F, -8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[289].setRotationPoint(20.25F, -8F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 471 funky double radiator
		bodyModel[290].setRotationPoint(20.25F, -16F, 7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 472 funky double radiator
		bodyModel[291].setRotationPoint(20.25F, -8F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[292].setRotationPoint(-44.5F, 0F, -2.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 445
		bodyModel[293].setRotationPoint(-45F, 3F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[294].setRotationPoint(-45F, 3F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 48
		bodyModel[295].setRotationPoint(-37F, -20.5F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[296].setRotationPoint(-37F, -22.5F, -6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[297].setRotationPoint(-37F, -22.5F, 1F);

		bodyModel[298].addBox(-0.5F, 0F, -0.5F, 1, 9, 4, 0F); // Box 52 door swing left
		bodyModel[298].setRotationPoint(-20.5F, -14F, 7.5F);

		bodyModel[299].addBox(-0.5F, 0F, -3.5F, 1, 9, 4, 0F); // Box 314 door swing right
		bodyModel[299].setRotationPoint(-20.5F, -14F, -7.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 343
		bodyModel[300].setRotationPoint(-35F, -22F, -3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 344
		bodyModel[301].setRotationPoint(-35F, -22F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[302].setRotationPoint(-35F, -22F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[303].setRotationPoint(-35F, -21F, 9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[304].setRotationPoint(-35F, -20F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[305].setRotationPoint(-35F, -21F, -10F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 353
		bodyModel[306].setRotationPoint(-39.25F, -14F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 13, 11, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[307].setRotationPoint(-39F, -14F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 13, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 358
		bodyModel[308].setRotationPoint(-39F, -14F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-3F, 0F, 0F, 2.2F, -0.01F, 0F, 2.4F, -0.01F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.725F, 0F, 0F, 0.725F, 0F, 0F); // Box 359
		bodyModel[309].setRotationPoint(-38F, -22F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-3F, 0F, 0F, 2.4F, -0.01F, 0F, 2.2F, -0.01F, 0F, -3F, 0F, 0F, 0.725F, 0F, 0F, -0.725F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 360
		bodyModel[310].setRotationPoint(-38F, -22F, -3F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-3F, 0F, 0F, 2F, -1F, 0F, 2F, -2F, 0F, -3F, -1F, 0F, -2.065F, 0F, 0F, 1.6F, 0F, 0F, 2F, 0F, 0F, -2.55F, 0F, 0F); // Box 361
		bodyModel[311].setRotationPoint(-38F, -22F, 3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-1.55F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, 1.175F, 0F, 0F, -1.175F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 362
		bodyModel[312].setRotationPoint(-37F, -20F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-2.065F, 0F, 0F, 1.61F, 0F, 0F, 2F, 0F, 0F, -2.545F, 0F, 0F, 0.725F, 0F, 0F, -0.725F, 0F, 0F, -0.1725F, 0F, 0F, 0.1725F, 0F, 0F); // Box 361
		bodyModel[313].setRotationPoint(-38F, -20F, 3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-3F, -1F, 0F, 2F, -2F, 0F, 2F, -1F, 0F, -3F, 0F, 0F, -2.55F, 0F, 0F, 2F, 0F, 0F, 1.6F, 0F, 0F, -2.065F, 0F, 0F); // Box 361
		bodyModel[314].setRotationPoint(-38F, -22F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-2.545F, 0F, 0F, 2F, 0F, 0F, 1.61F, 0F, 0F, -2.065F, 0F, 0F, 0.1725F, 0F, 0F, -0.1725F, 0F, 0F, -0.725F, 0F, 0F, 0.725F, 0F, 0F); // Box 361
		bodyModel[315].setRotationPoint(-38F, -20F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 362
		bodyModel[316].setRotationPoint(-36F, -21F, 9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.55F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.175F, 0F, 0F, 1.175F, 0F, 0F); // Box 362
		bodyModel[317].setRotationPoint(-37F, -20F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F); // Box 362
		bodyModel[318].setRotationPoint(-36F, -21F, -10F);

		bodyModel[319].addShapeBox(-0.5F, 0F, 2.5F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269 door swing left
		bodyModel[319].setRotationPoint(-20.5F, -20F, 7.5F);

		bodyModel[320].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52 door swing left
		bodyModel[320].setRotationPoint(-20.5F, -20F, 7.5F);

		bodyModel[321].addShapeBox(-0.5F, 0F, 1.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264 door swing left
		bodyModel[321].setRotationPoint(-20.5F, -20F, 7.5F);

		bodyModel[322].addBox(-0.5F, 0F, -1.5F, 1, 6, 2, 0F); // Box 265 door swing right
		bodyModel[322].setRotationPoint(-20.5F, -20F, -7.5F);

		bodyModel[323].addShapeBox(-0.5F, 0F, -2.5F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266 door swing right
		bodyModel[323].setRotationPoint(-20.5F, -20F, -7.5F);

		bodyModel[324].addShapeBox(-0.5F, 0F, -3.5F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267 door swing right
		bodyModel[324].setRotationPoint(-20.5F, -20F, -7.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 268
		bodyModel[325].setRotationPoint(-21F, -22F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[326].setRotationPoint(-21F, -22F, 3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[327].setRotationPoint(-21F, -22F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[328].setRotationPoint(-21F, -21F, 9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[329].setRotationPoint(-21F, -21F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 276
		bodyModel[330].setRotationPoint(-40F, -13F, 5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 284
		bodyModel[331].setRotationPoint(-40F, -13F, -7F);

		bodyModel[332].addShapeBox(-0.8F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 402
		bodyModel[332].setRotationPoint(-39.5F, -12.75F, 5F);
		bodyModel[332].rotateAngleZ = 0.4712389F;

		bodyModel[333].addShapeBox(-0.8F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 286
		bodyModel[333].setRotationPoint(-39.5F, -12.75F, -7F);
		bodyModel[333].rotateAngleZ = 0.4712389F;

		bodyModel[334].addBox(0F, 0F, 0F, 16, 9, 1, 0F); // Box 341
		bodyModel[334].setRotationPoint(-37F, -14F, -11F);

		bodyModel[335].addBox(0F, 0F, 0F, 16, 9, 1, 0F); // Box 346
		bodyModel[335].setRotationPoint(-37F, -14F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[336].setRotationPoint(-35F, -20F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[337].setRotationPoint(-37F, -20F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[338].setRotationPoint(-37F, -20F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[339].setRotationPoint(-38.85F, -10F, -10.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[340].setRotationPoint(-38.85F, -10F, 8.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 499
		bodyModel[341].setRotationPoint(-37F, -22.5F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[342].setRotationPoint(-34.5F, -22.75F, 7.5F);
		bodyModel[342].rotateAngleX = -0.19198622F;

		bodyModel[343].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 309 commander beacon
		bodyModel[343].setRotationPoint(-34.5F, -22.75F, -7.5F);
		bodyModel[343].rotateAngleX = 0.19198622F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 273
		bodyModel[344].setRotationPoint(-42.9F, -7F, 2F);

		bodyModel[345].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 503
		bodyModel[345].setRotationPoint(-38.25F, -1F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[346].setRotationPoint(-38.26F, -9F, -10F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 505
		bodyModel[347].setRotationPoint(-38.25F, -1F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[348].setRotationPoint(-38.26F, -9F, 11F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[349].setRotationPoint(-28F, -22F, -9.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[350].setRotationPoint(-28F, -22F, 6.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[351].setRotationPoint(-27.5F, -23F, -8F);

		bodyModel[352].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[352].setRotationPoint(-27.5F, -23F, 8F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[353].setRotationPoint(-37.5F, -23F, -1.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 370
		bodyModel[354].setRotationPoint(-38F, -14F, -10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, -0.5F, -2F, -3F); // Box 371 engineer heater
		bodyModel[355].setRotationPoint(-37.5F, -14F, 4F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[356].setRotationPoint(-35.5F, -21F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 373
		bodyModel[357].setRotationPoint(-35.5F, -21F, 3F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 374
		bodyModel[358].setRotationPoint(-35.5F, -21F, -3F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 285 AC's Alien Nation
		bodyModel[359].setRotationPoint(-34.5F, -21F, -2F);

		bodyModel[360].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 376
		bodyModel[360].setRotationPoint(-38F, 1.5F, 7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[361].setRotationPoint(-38F, 6F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[362].setRotationPoint(-38F, 2F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[363].setRotationPoint(-38F, 6F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[364].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 381
		bodyModel[365].setRotationPoint(36F, 2F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[366].setRotationPoint(37F, 6F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 383
		bodyModel[367].setRotationPoint(37F, 6F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 384
		bodyModel[368].setRotationPoint(36F, 2F, 7F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 385
		bodyModel[369].setRotationPoint(36F, 1.5F, 7F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 386
		bodyModel[370].setRotationPoint(36F, 1.5F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0.25F, -2F, -3F, -0.5F, -2F, -3F); // Box 387 fireman heater
		bodyModel[371].setRotationPoint(-37.5F, -14F, -8.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 7, 2, 10, 0F); // Box 388
		bodyModel[372].setRotationPoint(-37F, -7F, 0F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389
		bodyModel[373].setRotationPoint(-30F, -7F, 0F);

		bodyModel[374].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 390
		bodyModel[374].setRotationPoint(-30F, -6F, 2F);

		bodyModel[375].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 391
		bodyModel[375].setRotationPoint(-37F, -7F, -10F);

		bodyModel[376].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 392
		bodyModel[376].setRotationPoint(-29F, -7F, -10F);

		bodyModel[377].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 393
		bodyModel[377].setRotationPoint(-32F, -7F, -10F);

		bodyModel[378].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 394
		bodyModel[378].setRotationPoint(-37F, -14F, -4F);

		bodyModel[379].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 395
		bodyModel[379].setRotationPoint(-29F, -15F, -4F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 396
		bodyModel[380].setRotationPoint(-34F, -16F, -5F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 397
		bodyModel[381].setRotationPoint(-26F, -15F, -10F);

		bodyModel[382].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398
		bodyModel[382].setRotationPoint(-27.5F, -12.5F, -10F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 399
		bodyModel[383].setRotationPoint(-37F, -12.5F, -5F);

		bodyModel[384].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 28
		bodyModel[384].setRotationPoint(-21F, -20F, -7F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 401
		bodyModel[385].setRotationPoint(-32F, -6F, -5F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3241||GetColor(entity) == 0324
				||GetColor(entity) == 3243) {
			//fb2 black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9||GetColor(entity) == 14236){
			//type b silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1||GetColor(entity) == 14236){
			//fb2 blac early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11324){
			//fb2 u p is where the poop is early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_up_early.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 6){
			//fb2 silver early
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 734){
			//fb2 grey late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 2567){
			//type b black late
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.015, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.12, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}