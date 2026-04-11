//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP earlys
// Model Creator: Bida
// Created on: 18.02.2022 - 00:06:01
// Last changed on: 18.02.2022 - 00:06:01

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.Modelane_slab_antenna;
import com.jcirmodelsquad.tcjcir.models.detailkits.Modelgp7_deets_wm;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeAnew;
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

public class ModelGP7newer extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7newer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[630];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 203, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 271
		bodyModel[2] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 272
		bodyModel[3] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 273
		bodyModel[4] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 275
		bodyModel[5] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 276
		bodyModel[6] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 271
		bodyModel[7] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 272
		bodyModel[8] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 273
		bodyModel[9] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 274
		bodyModel[10] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 275
		bodyModel[11] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 276
		bodyModel[12] = new ModelRendererTurbo(this, 5, 220, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 115, 242, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 144, 203, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 33, 174, textureX, textureY); // Box 266
		bodyModel[18] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 5
		bodyModel[19] = new ModelRendererTurbo(this, 185, 220, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 141, 220, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 127, 242, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 52, 219, textureX, textureY); // Box 209
		bodyModel[23] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 210
		bodyModel[24] = new ModelRendererTurbo(this, 52, 212, textureX, textureY); // Box 211
		bodyModel[25] = new ModelRendererTurbo(this, 12, 198, textureX, textureY); // Box 214
		bodyModel[26] = new ModelRendererTurbo(this, 148, 198, textureX, textureY); // Box 364
		bodyModel[27] = new ModelRendererTurbo(this, 188, 220, textureX, textureY); // Box 365
		bodyModel[28] = new ModelRendererTurbo(this, 188, 213, textureX, textureY); // Box 366
		bodyModel[29] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 143
		bodyModel[30] = new ModelRendererTurbo(this, 5, 213, textureX, textureY); // Box 143
		bodyModel[31] = new ModelRendererTurbo(this, 141, 213, textureX, textureY); // Box 143
		bodyModel[32] = new ModelRendererTurbo(this, 185, 213, textureX, textureY); // Box 143
		bodyModel[33] = new ModelRendererTurbo(this, 48, 165, textureX, textureY); // Box 1
		bodyModel[34] = new ModelRendererTurbo(this, 48, 156, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 53, 172, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 53, 163, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 263, 229, textureX, textureY); // Box 486
		bodyModel[38] = new ModelRendererTurbo(this, 263, 217, textureX, textureY); // Box 487
		bodyModel[39] = new ModelRendererTurbo(this, 251, 236, textureX, textureY); // Box 488
		bodyModel[40] = new ModelRendererTurbo(this, 263, 224, textureX, textureY); // Box 489
		bodyModel[41] = new ModelRendererTurbo(this, 322, 229, textureX, textureY); // Box 242 extended tank
		bodyModel[42] = new ModelRendererTurbo(this, 310, 236, textureX, textureY); // Box 243 extended tank
		bodyModel[43] = new ModelRendererTurbo(this, 322, 217, textureX, textureY); // Box 244 extended tank
		bodyModel[44] = new ModelRendererTurbo(this, 322, 224, textureX, textureY); // Box 245 extended tank
		bodyModel[45] = new ModelRendererTurbo(this, 263, 212, textureX, textureY); // Box 805
		bodyModel[46] = new ModelRendererTurbo(this, 322, 212, textureX, textureY); // Box 245 extended tank
		bodyModel[47] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 498
		bodyModel[53] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 430
		bodyModel[54] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 431
		bodyModel[55] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 432
		bodyModel[56] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 433
		bodyModel[57] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[58] = new ModelRendererTurbo(this, 355, 240, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 361, 228, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 361, 216, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 361, 221, textureX, textureY); // Box 77
		bodyModel[63] = new ModelRendererTurbo(this, 257, 200, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[66] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[67] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[68] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[69] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[70] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[71] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[72] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[73] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[74] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[75] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[77] = new ModelRendererTurbo(this, 261, 191, textureX, textureY); // Box 490
		bodyModel[78] = new ModelRendererTurbo(this, 270, 194, textureX, textureY); // Box 329
		bodyModel[79] = new ModelRendererTurbo(this, 268, 191, textureX, textureY); // Box 330
		bodyModel[80] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 331
		bodyModel[81] = new ModelRendererTurbo(this, 434, 250, textureX, textureY); // Box 332
		bodyModel[82] = new ModelRendererTurbo(this, 49, 228, textureX, textureY); // Box 334
		bodyModel[83] = new ModelRendererTurbo(this, 5, 228, textureX, textureY); // Box 335
		bodyModel[84] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 336
		bodyModel[85] = new ModelRendererTurbo(this, 141, 228, textureX, textureY); // Box 337
		bodyModel[86] = new ModelRendererTurbo(this, 315, 194, textureX, textureY); // Box 338
		bodyModel[87] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 339
		bodyModel[88] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 340
		bodyModel[89] = new ModelRendererTurbo(this, 270, 186, textureX, textureY); // Box 341
		bodyModel[90] = new ModelRendererTurbo(this, 268, 183, textureX, textureY); // Box 342
		bodyModel[91] = new ModelRendererTurbo(this, 261, 183, textureX, textureY); // Box 343
		bodyModel[92] = new ModelRendererTurbo(this, 315, 186, textureX, textureY); // Box 344
		bodyModel[93] = new ModelRendererTurbo(this, 315, 183, textureX, textureY); // Box 345
		bodyModel[94] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 346
		bodyModel[95] = new ModelRendererTurbo(this, 406, 211, textureX, textureY); // Box 347 side air tank
		bodyModel[96] = new ModelRendererTurbo(this, 406, 211, textureX, textureY); // Box 348 side air tank
		bodyModel[97] = new ModelRendererTurbo(this, 239, 140, textureX, textureY); // Box 344
		bodyModel[98] = new ModelRendererTurbo(this, 218, 157, textureX, textureY); // Box 345 gp16 cutback frontbit
		bodyModel[99] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 346 gp16 cutback frontbit
		bodyModel[100] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 131
		bodyModel[101] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 132
		bodyModel[102] = new ModelRendererTurbo(this, 343, 40, textureX, textureY); // Box 133
		bodyModel[103] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[104] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 135
		bodyModel[105] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[106] = new ModelRendererTurbo(this, 199, 161, textureX, textureY); // Box 139
		bodyModel[107] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 140
		bodyModel[108] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 141
		bodyModel[109] = new ModelRendererTurbo(this, 199, 149, textureX, textureY); // Box 142
		bodyModel[110] = new ModelRendererTurbo(this, 103, 120, textureX, textureY); // Box 216
		bodyModel[111] = new ModelRendererTurbo(this, 73, 120, textureX, textureY); // Box 217
		bodyModel[112] = new ModelRendererTurbo(this, 92, 124, textureX, textureY); // Box 218
		bodyModel[113] = new ModelRendererTurbo(this, 130, 112, textureX, textureY); // Box 215
		bodyModel[114] = new ModelRendererTurbo(this, 192, 112, textureX, textureY); // Box 367
		bodyModel[115] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 368
		bodyModel[116] = new ModelRendererTurbo(this, 160, 116, textureX, textureY); // Box 369 gp16 brake cover
		bodyModel[117] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 370
		bodyModel[118] = new ModelRendererTurbo(this, 333, 28, textureX, textureY); // Box 372
		bodyModel[119] = new ModelRendererTurbo(this, 333, 44, textureX, textureY); // Box 373
		bodyModel[120] = new ModelRendererTurbo(this, 205, 157, textureX, textureY); // Box 374
		bodyModel[121] = new ModelRendererTurbo(this, 167, 119, textureX, textureY); // Box 375
		bodyModel[122] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 350
		bodyModel[123] = new ModelRendererTurbo(this, 103, 97, textureX, textureY); // Box 351
		bodyModel[124] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Box 352
		bodyModel[125] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 353
		bodyModel[126] = new ModelRendererTurbo(this, 108, 97, textureX, textureY); // Box 357
		bodyModel[127] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 117 numberboard front high
		bodyModel[128] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 118 numberboard front high
		bodyModel[129] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 383
		bodyModel[130] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[131] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 216
		bodyModel[132] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[133] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 311
		bodyModel[134] = new ModelRendererTurbo(this, 25, 130, textureX, textureY); // Box 265
		bodyModel[135] = new ModelRendererTurbo(this, 32, 130, textureX, textureY, "lamp"); // Box 247 headlight front 3
		bodyModel[136] = new ModelRendererTurbo(this, 39, 142, textureX, textureY, "lamp"); // Box 149 headlight front 5c
		bodyModel[137] = new ModelRendererTurbo(this, 25, 140, textureX, textureY); // Box 150 chop headlight supportis
		bodyModel[138] = new ModelRendererTurbo(this, 32, 135, textureX, textureY, "lamp"); // Box 151 headlight front 4
		bodyModel[139] = new ModelRendererTurbo(this, 25, 135, textureX, textureY); // Box 393
		bodyModel[140] = new ModelRendererTurbo(this, 32, 142, textureX, textureY, "lamp"); // Box 149 headlight front 6c
		bodyModel[141] = new ModelRendererTurbo(this, 188, 160, textureX, textureY); // Box 137
		bodyModel[142] = new ModelRendererTurbo(this, 188, 148, textureX, textureY); // Box 138
		bodyModel[143] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[144] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[145] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 119
		bodyModel[146] = new ModelRendererTurbo(this, 218, 45, textureX, textureY); // Box 125
		bodyModel[147] = new ModelRendererTurbo(this, 308, 89, textureX, textureY); // Box 9
		bodyModel[148] = new ModelRendererTurbo(this, 235, 89, textureX, textureY); // Box 10
		bodyModel[149] = new ModelRendererTurbo(this, 185, 72, textureX, textureY); // Box 15
		bodyModel[150] = new ModelRendererTurbo(this, 258, 72, textureX, textureY); // Box 21
		bodyModel[151] = new ModelRendererTurbo(this, 297, 86, textureX, textureY); // Box 314 door swing right
		bodyModel[152] = new ModelRendererTurbo(this, 224, 86, textureX, textureY); // Box 315 door swing right
		bodyModel[153] = new ModelRendererTurbo(this, 258, 45, textureX, textureY); // Box 371
		bodyModel[154] = new ModelRendererTurbo(this, 218, 76, textureX, textureY); // Box 372
		bodyModel[155] = new ModelRendererTurbo(this, 258, 76, textureX, textureY); // Box 373
		bodyModel[156] = new ModelRendererTurbo(this, 229, 45, textureX, textureY); // Box 374
		bodyModel[157] = new ModelRendererTurbo(this, 152, 54, textureX, textureY); // Box 411
		bodyModel[158] = new ModelRendererTurbo(this, 189, 54, textureX, textureY); // Box 412
		bodyModel[159] = new ModelRendererTurbo(this, 226, 68, textureX, textureY); // Box 39
		bodyModel[160] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 347
		bodyModel[161] = new ModelRendererTurbo(this, 226, 53, textureX, textureY); // Box 348
		bodyModel[162] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[163] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[164] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[165] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[166] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[167] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[168] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[169] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[170] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[171] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[172] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[173] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[174] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[175] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[176] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[177] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[178] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[179] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[180] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[181] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[182] = new ModelRendererTurbo(this, 314, 81, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 325, 81, textureX, textureY); // Box 185
		bodyModel[184] = new ModelRendererTurbo(this, 314, 75, textureX, textureY); // Box 247 extra stack
		bodyModel[185] = new ModelRendererTurbo(this, 325, 75, textureX, textureY); // Box 248 extra stack
		bodyModel[186] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 186
		bodyModel[187] = new ModelRendererTurbo(this, 389, 99, textureX, textureY); // Box 187
		bodyModel[188] = new ModelRendererTurbo(this, 392, 106, textureX, textureY); // Box 89 big fan
		bodyModel[189] = new ModelRendererTurbo(this, 334, 53, textureX, textureY); // Box 196 farr filter
		bodyModel[190] = new ModelRendererTurbo(this, 437, 97, textureX, textureY); // Box 188
		bodyModel[191] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 189
		bodyModel[192] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[193] = new ModelRendererTurbo(this, 434, 106, textureX, textureY); // Box 89 big fan
		bodyModel[194] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 190
		bodyModel[195] = new ModelRendererTurbo(this, 413, 86, textureX, textureY, "cull"); // Box 196 winterization hatch EXTRA THICC
		bodyModel[196] = new ModelRendererTurbo(this, 421, 67, textureX, textureY, "cull"); // Box 196 winterization hatch tall
		bodyModel[197] = new ModelRendererTurbo(this, 421, 77, textureX, textureY, "cull"); // Box 196 winterization hatch smol
		bodyModel[198] = new ModelRendererTurbo(this, 364, 15, textureX, textureY); // Box 239
		bodyModel[199] = new ModelRendererTurbo(this, 364, 12, textureX, textureY); // Box 240
		bodyModel[200] = new ModelRendererTurbo(this, 364, 18, textureX, textureY); // Box 241
		bodyModel[201] = new ModelRendererTurbo(this, 364, 4, textureX, textureY); // Box 236
		bodyModel[202] = new ModelRendererTurbo(this, 364, 7, textureX, textureY); // Box 237
		bodyModel[203] = new ModelRendererTurbo(this, 381, 126, textureX, textureY); // Box 457
		bodyModel[204] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[205] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[206] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[207] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Box 313
		bodyModel[208] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[209] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[210] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[211] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[212] = new ModelRendererTurbo(this, 308, 158, textureX, textureY); // Box 363
		bodyModel[213] = new ModelRendererTurbo(this, 321, 162, textureX, textureY); // Box 238
		bodyModel[214] = new ModelRendererTurbo(this, 324, 148, textureX, textureY); // Box 363
		bodyModel[215] = new ModelRendererTurbo(this, 345, 152, textureX, textureY); // Box 238
		bodyModel[216] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[217] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[218] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[219] = new ModelRendererTurbo(this, 368, 24, textureX, textureY); // Box 503
		bodyModel[220] = new ModelRendererTurbo(this, 379, 24, textureX, textureY); // Box 314
		bodyModel[221] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[222] = new ModelRendererTurbo(this, 415, 113, textureX, textureY); // Box 220
		bodyModel[223] = new ModelRendererTurbo(this, 480, 126, textureX, textureY); // Box 220
		bodyModel[224] = new ModelRendererTurbo(this, 448, 126, textureX, textureY); // Box 220
		bodyModel[225] = new ModelRendererTurbo(this, 453, 115, textureX, textureY); // Box 220
		bodyModel[226] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[227] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[228] = new ModelRendererTurbo(this, 433, 170, textureX, textureY, "lamp"); // Box 221 headlight rear 3
		bodyModel[229] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[230] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[231] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[232] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[233] = new ModelRendererTurbo(this, 426, 170, textureX, textureY); // Box 312
		bodyModel[234] = new ModelRendererTurbo(this, 426, 175, textureX, textureY); // Box 488
		bodyModel[235] = new ModelRendererTurbo(this, 433, 175, textureX, textureY, "lamp"); // Box 489 headlight rear 4
		bodyModel[236] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 246 roof air tank
		bodyModel[237] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 249 roof air tank
		bodyModel[238] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 250
		bodyModel[239] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 251
		bodyModel[240] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 252
		bodyModel[241] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 253
		bodyModel[242] = new ModelRendererTurbo(this, 351, 14, textureX, textureY); // Box 207
		bodyModel[243] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Box 208
		bodyModel[244] = new ModelRendererTurbo(this, 351, 11, textureX, textureY); // Box 209
		bodyModel[245] = new ModelRendererTurbo(this, 351, 20, textureX, textureY); // Box 210
		bodyModel[246] = new ModelRendererTurbo(this, 325, 1, textureX, textureY); // Box 227
		bodyModel[247] = new ModelRendererTurbo(this, 325, 4, textureX, textureY); // Box 228
		bodyModel[248] = new ModelRendererTurbo(this, 351, 4, textureX, textureY); // Box 254
		bodyModel[249] = new ModelRendererTurbo(this, 351, 1, textureX, textureY); // Box 255
		bodyModel[250] = new ModelRendererTurbo(this, 351, 7, textureX, textureY); // Box 256
		bodyModel[251] = new ModelRendererTurbo(this, 338, 4, textureX, textureY); // Box 361
		bodyModel[252] = new ModelRendererTurbo(this, 338, 10, textureX, textureY); // Box 362
		bodyModel[253] = new ModelRendererTurbo(this, 338, 1, textureX, textureY); // Box 363
		bodyModel[254] = new ModelRendererTurbo(this, 338, 7, textureX, textureY); // Box 364
		bodyModel[255] = new ModelRendererTurbo(this, 280, 26, textureX, textureY); // Box 192
		bodyModel[256] = new ModelRendererTurbo(this, 280, 23, textureX, textureY); // Box 193
		bodyModel[257] = new ModelRendererTurbo(this, 280, 17, textureX, textureY); // Box 194
		bodyModel[258] = new ModelRendererTurbo(this, 280, 20, textureX, textureY); // Box 195
		bodyModel[259] = new ModelRendererTurbo(this, 314, 1, textureX, textureY); // Box 203
		bodyModel[260] = new ModelRendererTurbo(this, 314, 4, textureX, textureY); // Box 204
		bodyModel[261] = new ModelRendererTurbo(this, 314, 11, textureX, textureY); // Box 205
		bodyModel[262] = new ModelRendererTurbo(this, 314, 8, textureX, textureY); // Box 206
		bodyModel[263] = new ModelRendererTurbo(this, 292, 4, textureX, textureY); // Box 238
		bodyModel[264] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 239
		bodyModel[265] = new ModelRendererTurbo(this, 280, 7, textureX, textureY); // Box 240
		bodyModel[266] = new ModelRendererTurbo(this, 280, 4, textureX, textureY); // Box 241
		bodyModel[267] = new ModelRendererTurbo(this, 280, 1, textureX, textureY); // Box 242
		bodyModel[268] = new ModelRendererTurbo(this, 278, 10, textureX, textureY); // Box 243
		bodyModel[269] = new ModelRendererTurbo(this, 292, 1, textureX, textureY); // Box 244
		bodyModel[270] = new ModelRendererTurbo(this, 292, 7, textureX, textureY); // Box 245
		bodyModel[271] = new ModelRendererTurbo(this, 302, 15, textureX, textureY); // Box 246
		bodyModel[272] = new ModelRendererTurbo(this, 302, 18, textureX, textureY); // Box 247
		bodyModel[273] = new ModelRendererTurbo(this, 310, 28, textureX, textureY); // Box 114
		bodyModel[274] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 74
		bodyModel[275] = new ModelRendererTurbo(this, 310, 31, textureX, textureY); // Box 78
		bodyModel[276] = new ModelRendererTurbo(this, 309, 21, textureX, textureY); // Box 245
		bodyModel[277] = new ModelRendererTurbo(this, 325, 8, textureX, textureY); // Box 354
		bodyModel[278] = new ModelRendererTurbo(this, 325, 11, textureX, textureY); // Box 356
		bodyModel[279] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 357
		bodyModel[280] = new ModelRendererTurbo(this, 60, 115, textureX, textureY); // Box 233 some other steam gen thing
		bodyModel[281] = new ModelRendererTurbo(this, 47, 130, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[282] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box 235 steam gen exhaust
		bodyModel[283] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 236 steam gen exhaust
		bodyModel[284] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[285] = new ModelRendererTurbo(this, 62, 125, textureX, textureY); // Box 235 steam gen exhaust
		bodyModel[286] = new ModelRendererTurbo(this, 62, 120, textureX, textureY); // Box 236 steam gen exhaust
		bodyModel[287] = new ModelRendererTurbo(this, 53, 105, textureX, textureY); // Box 259
		bodyModel[288] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 74
		bodyModel[289] = new ModelRendererTurbo(this, 63, 84, textureX, textureY, "lamp"); // Box 186 headlight f chop 1
		bodyModel[290] = new ModelRendererTurbo(this, 63, 89, textureX, textureY, "lamp"); // Box 187 headlight f chop 2
		bodyModel[291] = new ModelRendererTurbo(this, 71, 75, textureX, textureY); // Box 644
		bodyModel[292] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 645
		bodyModel[293] = new ModelRendererTurbo(this, 61, 71, textureX, textureY); // Box 646
		bodyModel[294] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 647
		bodyModel[295] = new ModelRendererTurbo(this, 45, 75, textureX, textureY); // Box 648
		bodyModel[296] = new ModelRendererTurbo(this, 67, 71, textureX, textureY); // Box 649
		bodyModel[297] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 363 numberboard chop A
		bodyModel[298] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 364 numberboard chop A
		bodyModel[299] = new ModelRendererTurbo(this, 26, 82, textureX, textureY, "cull"); // Box 286 antenna plate cull
		bodyModel[300] = new ModelRendererTurbo(this, 40, 84, textureX, textureY); // Box 287
		bodyModel[301] = new ModelRendererTurbo(this, 148, 4, textureX, textureY); // Box 260
		bodyModel[302] = new ModelRendererTurbo(this, 141, 5, textureX, textureY); // Box 264
		bodyModel[303] = new ModelRendererTurbo(this, 146, 8, textureX, textureY); // Box 268
		bodyModel[304] = new ModelRendererTurbo(this, 141, 10, textureX, textureY); // Box 274
		bodyModel[305] = new ModelRendererTurbo(this, 133, 16, textureX, textureY); // Box 283
		bodyModel[306] = new ModelRendererTurbo(this, 146, 16, textureX, textureY); // Box 284
		bodyModel[307] = new ModelRendererTurbo(this, 162, 16, textureX, textureY); // Box 291
		bodyModel[308] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 292
		bodyModel[309] = new ModelRendererTurbo(this, 175, 12, textureX, textureY); // Box 293
		bodyModel[310] = new ModelRendererTurbo(this, 164, 10, textureX, textureY); // Box 294
		bodyModel[311] = new ModelRendererTurbo(this, 166, 6, textureX, textureY); // Box 295
		bodyModel[312] = new ModelRendererTurbo(this, 175, 7, textureX, textureY); // Box 296
		bodyModel[313] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 372
		bodyModel[314] = new ModelRendererTurbo(this, 115, 75, textureX, textureY); // Box 576
		bodyModel[315] = new ModelRendererTurbo(this, 91, 75, textureX, textureY); // Box 577
		bodyModel[316] = new ModelRendererTurbo(this, 108, 80, textureX, textureY); // Box 578
		bodyModel[317] = new ModelRendererTurbo(this, 105, 72, textureX, textureY, "lamp"); // Box 579 numberboard chop B
		bodyModel[318] = new ModelRendererTurbo(this, 105, 72, textureX, textureY, "lamp"); // Box 580 numberboard chop B
		bodyModel[319] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[320] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 257
		bodyModel[321] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[322] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 584
		bodyModel[323] = new ModelRendererTurbo(this, 155, 115, textureX, textureY); // Box 43
		bodyModel[324] = new ModelRendererTurbo(this, 156, 118, textureX, textureY); // Box 43
		bodyModel[325] = new ModelRendererTurbo(this, 324, 38, textureX, textureY); // Box 81
		bodyModel[326] = new ModelRendererTurbo(this, 321, 39, textureX, textureY); // Box 81
		bodyModel[327] = new ModelRendererTurbo(this, 334, 40, textureX, textureY); // Box 261
		bodyModel[328] = new ModelRendererTurbo(this, 329, 40, textureX, textureY); // Box 341
		bodyModel[329] = new ModelRendererTurbo(this, 330, 42, textureX, textureY); // Box 342
		bodyModel[330] = new ModelRendererTurbo(this, 334, 24, textureX, textureY); // Box 343
		bodyModel[331] = new ModelRendererTurbo(this, 330, 26, textureX, textureY); // Box 344
		bodyModel[332] = new ModelRendererTurbo(this, 329, 24, textureX, textureY); // Box 345
		bodyModel[333] = new ModelRendererTurbo(this, 324, 22, textureX, textureY); // Box 346
		bodyModel[334] = new ModelRendererTurbo(this, 321, 23, textureX, textureY); // Box 347
		bodyModel[335] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[336] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[337] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[338] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[339] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[340] = new ModelRendererTurbo(this, 302, 10, textureX, textureY); // Box 355
		bodyModel[341] = new ModelRendererTurbo(this, 302, 1, textureX, textureY); // Box 356
		bodyModel[342] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 357
		bodyModel[343] = new ModelRendererTurbo(this, 302, 7, textureX, textureY); // Box 358
		bodyModel[344] = new ModelRendererTurbo(this, 1, 67, textureX, textureY, "cull"); // Box 338 cage cull a
		bodyModel[345] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 78
		bodyModel[346] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 188
		bodyModel[347] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[348] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[349] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 239
		bodyModel[350] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[351] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[352] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 242
		bodyModel[353] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 188
		bodyModel[354] = new ModelRendererTurbo(this, 8, 112, textureX, textureY); // Box 190
		bodyModel[355] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 190
		bodyModel[356] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 188
		bodyModel[357] = new ModelRendererTurbo(this, 8, 122, textureX, textureY); // Box 190
		bodyModel[358] = new ModelRendererTurbo(this, 8, 127, textureX, textureY); // Box 190
		bodyModel[359] = new ModelRendererTurbo(this, 458, 173, textureX, textureY); // Box 188
		bodyModel[360] = new ModelRendererTurbo(this, 465, 170, textureX, textureY); // Box 190
		bodyModel[361] = new ModelRendererTurbo(this, 465, 175, textureX, textureY); // Box 190
		bodyModel[362] = new ModelRendererTurbo(this, 458, 163, textureX, textureY); // Box 188
		bodyModel[363] = new ModelRendererTurbo(this, 465, 160, textureX, textureY); // Box 190
		bodyModel[364] = new ModelRendererTurbo(this, 465, 165, textureX, textureY); // Box 190
		bodyModel[365] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 409 commander base
		bodyModel[366] = new ModelRendererTurbo(this, 26, 73, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[367] = new ModelRendererTurbo(this, 26, 84, textureX, textureY); // Box 409 commander base
		bodyModel[368] = new ModelRendererTurbo(this, 26, 80, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[369] = new ModelRendererTurbo(this, 66, 100, textureX, textureY); // Box 409 commander base
		bodyModel[370] = new ModelRendererTurbo(this, 66, 96, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[371] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 364 prime base
		bodyModel[372] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[373] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[374] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[375] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[376] = new ModelRendererTurbo(this, 15, 86, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[377] = new ModelRendererTurbo(this, 444, 170, textureX, textureY); // Box 392
		bodyModel[378] = new ModelRendererTurbo(this, 444, 165, textureX, textureY); // Box 393
		bodyModel[379] = new ModelRendererTurbo(this, 451, 170, textureX, textureY); // Box 394
		bodyModel[380] = new ModelRendererTurbo(this, 451, 165, textureX, textureY); // Box 395
		bodyModel[381] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 396
		bodyModel[382] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 397
		bodyModel[383] = new ModelRendererTurbo(this, 8, 137, textureX, textureY); // Box 398
		bodyModel[384] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 399
		bodyModel[385] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 78
		bodyModel[386] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[387] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[388] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[389] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[390] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[391] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[392] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[393] = new ModelRendererTurbo(this, 109, 69, textureX, textureY); // Box 409 commander base
		bodyModel[394] = new ModelRendererTurbo(this, 109, 65, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[395] = new ModelRendererTurbo(this, 109, 69, textureX, textureY); // Box 409 commander base
		bodyModel[396] = new ModelRendererTurbo(this, 109, 65, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[397] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[398] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[399] = new ModelRendererTurbo(this, 62, 242, textureX, textureY); // Box 22
		bodyModel[400] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 23
		bodyModel[401] = new ModelRendererTurbo(this, 65, 230, textureX, textureY); // Box 24
		bodyModel[402] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Box 25
		bodyModel[403] = new ModelRendererTurbo(this, 221, 242, textureX, textureY); // Box 431
		bodyModel[404] = new ModelRendererTurbo(this, 198, 242, textureX, textureY); // Box 432
		bodyModel[405] = new ModelRendererTurbo(this, 201, 230, textureX, textureY); // Box 433
		bodyModel[406] = new ModelRendererTurbo(this, 224, 230, textureX, textureY); // Box 434
		bodyModel[407] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 4
		bodyModel[408] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 322
		bodyModel[409] = new ModelRendererTurbo(this, 71, 206, textureX, textureY); // Box 438
		bodyModel[410] = new ModelRendererTurbo(this, 94, 206, textureX, textureY); // Box 439
		bodyModel[411] = new ModelRendererTurbo(this, 204, 218, textureX, textureY); // Box 441
		bodyModel[412] = new ModelRendererTurbo(this, 230, 206, textureX, textureY); // Box 442
		bodyModel[413] = new ModelRendererTurbo(this, 207, 206, textureX, textureY); // Box 443
		bodyModel[414] = new ModelRendererTurbo(this, 420, 141, textureX, textureY, ""); // Box 211 wp large headlight
		bodyModel[415] = new ModelRendererTurbo(this, 19, 100, textureX, textureY, ""); // Box 213 wp large headlight
		bodyModel[416] = new ModelRendererTurbo(this, 39, 114, textureX, textureY, "lamp"); // Box 218 headlight front 1 gyra
		bodyModel[417] = new ModelRendererTurbo(this, 23, 112, textureX, textureY); // Box 219
		bodyModel[418] = new ModelRendererTurbo(this, 32, 114, textureX, textureY, "lamp"); // Box 220 headlight front 2 gyra
		bodyModel[419] = new ModelRendererTurbo(this, 23, 107, textureX, textureY); // Box 312 emergency gyralight front mount
		bodyModel[420] = new ModelRendererTurbo(this, 32, 107, textureX, textureY, "lamp"); // Box 313 emergency gyralight front
		bodyModel[421] = new ModelRendererTurbo(this, 440, 155, textureX, textureY, "lamp"); // Box 224 headlight rear 1 gyra
		bodyModel[422] = new ModelRendererTurbo(this, 424, 153, textureX, textureY); // Box 225
		bodyModel[423] = new ModelRendererTurbo(this, 433, 155, textureX, textureY, "lamp"); // Box 226 headlight rear 2 gyra
		bodyModel[424] = new ModelRendererTurbo(this, 424, 148, textureX, textureY); // Box 306 emergency gyralight rear mount
		bodyModel[425] = new ModelRendererTurbo(this, 433, 148, textureX, textureY, "lamp"); // Box 308 emergency gyralight rear
		bodyModel[426] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[427] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[428] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 336
		bodyModel[429] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam front
		bodyModel[430] = new ModelRendererTurbo(this, 39, 95, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam front
		bodyModel[431] = new ModelRendererTurbo(this, 444, 141, textureX, textureY); // Box 336
		bodyModel[432] = new ModelRendererTurbo(this, 464, 143, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam rear
		bodyModel[433] = new ModelRendererTurbo(this, 457, 143, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam rear
		bodyModel[434] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[435] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[436] = new ModelRendererTurbo(this, 283, 73, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[437] = new ModelRendererTurbo(this, 283, 62, textureX, textureY, "cull"); // Box 306 cull aww
		bodyModel[438] = new ModelRendererTurbo(this, 295, 218, textureX, textureY); // Box 455
		bodyModel[439] = new ModelRendererTurbo(this, 285, 186, textureX, textureY); // Box 456
		bodyModel[440] = new ModelRendererTurbo(this, 279, 186, textureX, textureY); // Box 457
		bodyModel[441] = new ModelRendererTurbo(this, 279, 195, textureX, textureY); // Box 458
		bodyModel[442] = new ModelRendererTurbo(this, 285, 195, textureX, textureY); // Box 459
		bodyModel[443] = new ModelRendererTurbo(this, 271, 189, textureX, textureY); // Box 460
		bodyModel[444] = new ModelRendererTurbo(this, 271, 197, textureX, textureY); // Box 461
		bodyModel[445] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 462
		bodyModel[446] = new ModelRendererTurbo(this, 293, 22, textureX, textureY); // Box 403
		bodyModel[447] = new ModelRendererTurbo(this, 293, 25, textureX, textureY); // Box 404
		bodyModel[448] = new ModelRendererTurbo(this, 293, 28, textureX, textureY); // Box 405
		bodyModel[449] = new ModelRendererTurbo(this, 291, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[450] = new ModelRendererTurbo(this, 47, 103, textureX, textureY); // Box 114
		bodyModel[451] = new ModelRendererTurbo(this, 47, 100, textureX, textureY); // Box 74
		bodyModel[452] = new ModelRendererTurbo(this, 47, 106, textureX, textureY); // Box 78
		bodyModel[453] = new ModelRendererTurbo(this, 0, 232, textureX, textureY); // Box 50
		bodyModel[454] = new ModelRendererTurbo(this, 7, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[455] = new ModelRendererTurbo(this, 136, 232, textureX, textureY); // Box 475
		bodyModel[456] = new ModelRendererTurbo(this, 143, 233, textureX, textureY, "cull"); // Box 476 cull
		bodyModel[457] = new ModelRendererTurbo(this, 12, 181, textureX, textureY); // Box 480
		bodyModel[458] = new ModelRendererTurbo(this, 9, 183, textureX, textureY); // Box 481
		bodyModel[459] = new ModelRendererTurbo(this, 12, 175, textureX, textureY); // Box 482
		bodyModel[460] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 483
		bodyModel[461] = new ModelRendererTurbo(this, 9, 171, textureX, textureY); // Box 484
		bodyModel[462] = new ModelRendererTurbo(this, 12, 169, textureX, textureY); // Box 485
		bodyModel[463] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[464] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[465] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 496
		bodyModel[466] = new ModelRendererTurbo(this, 21, 181, textureX, textureY); // Box 497
		bodyModel[467] = new ModelRendererTurbo(this, 18, 177, textureX, textureY); // Box 498
		bodyModel[468] = new ModelRendererTurbo(this, 21, 175, textureX, textureY); // Box 499
		bodyModel[469] = new ModelRendererTurbo(this, 18, 171, textureX, textureY); // Box 500
		bodyModel[470] = new ModelRendererTurbo(this, 21, 169, textureX, textureY); // Box 501
		bodyModel[471] = new ModelRendererTurbo(this, 449, 155, textureX, textureY); // Box 514
		bodyModel[472] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 515
		bodyModel[473] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 516
		bodyModel[474] = new ModelRendererTurbo(this, 64, 107, textureX, textureY); // Box 364 prime base
		bodyModel[475] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[476] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[477] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[478] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[479] = new ModelRendererTurbo(this, 130, 114, textureX, textureY); // Box 355
		bodyModel[480] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 347
		bodyModel[481] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 262
		bodyModel[482] = new ModelRendererTurbo(this, 375, 3, textureX, textureY); // Box 293 prr trainphoje
		bodyModel[483] = new ModelRendererTurbo(this, 502, 1, textureX, textureY); // Box 520 prr bullshit
		bodyModel[484] = new ModelRendererTurbo(this, 51, 111, textureX, textureY); // Box 521 prr shiot
		bodyModel[485] = new ModelRendererTurbo(this, 52, 108, textureX, textureY); // Box 522 pee are are
		bodyModel[486] = new ModelRendererTurbo(this, 466, 92, textureX, textureY); // Box 412 cs1
		bodyModel[487] = new ModelRendererTurbo(this, 477, 92, textureX, textureY); // Box 413 cs1
		bodyModel[488] = new ModelRendererTurbo(this, 469, 86, textureX, textureY); // Box 86 cs1
		bodyModel[489] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // Box 364 prime base
		bodyModel[490] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[491] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[492] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[493] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[494] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 403
		bodyModel[495] = new ModelRendererTurbo(this, 59, 106, textureX, textureY); // Box 404
		bodyModel[496] = new ModelRendererTurbo(this, 59, 109, textureX, textureY); // Box 405
		bodyModel[497] = new ModelRendererTurbo(this, 57, 96, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[498] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 515
		bodyModel[499] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 526

		bodyModel[0].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[0].setRotationPoint(-37.01F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[1].setRotationPoint(-37F, 1F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[2].setRotationPoint(-37F, 8F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[3].setRotationPoint(-37F, 5F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[4].setRotationPoint(-37F, 7F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[5].setRotationPoint(-37F, 4F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[6].setRotationPoint(-37F, 1F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[7].setRotationPoint(-37F, 8F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[8].setRotationPoint(-37F, 5F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[9].setRotationPoint(-37F, 3F, 7F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[10].setRotationPoint(-37F, 7F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[11].setRotationPoint(-37F, 4F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[12].setRotationPoint(-37F, -1F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[13].setRotationPoint(-37F, -1F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[14].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[16].setRotationPoint(38.01F, 1F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 75, 2, 12, 0F); // Box 266
		bodyModel[17].setRotationPoint(-37F, 1F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[18].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(38F, -1F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[20].setRotationPoint(38F, -1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[21].setRotationPoint(38F, 2.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[22].setRotationPoint(-33F, 2F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[23].setRotationPoint(-37F, 3F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[24].setRotationPoint(-33F, 2F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[25].setRotationPoint(-37F, -7F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[26].setRotationPoint(38F, -7F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[27].setRotationPoint(34F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[28].setRotationPoint(34F, 2F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[29].setRotationPoint(-37F, -7F, -10F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[30].setRotationPoint(-37F, -7F, 11F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[31].setRotationPoint(38F, -7F, -10F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[32].setRotationPoint(38F, -7F, 11F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 1
		bodyModel[33].setRotationPoint(-33F, 1F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 47
		bodyModel[34].setRotationPoint(-33F, 1F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 48
		bodyModel[35].setRotationPoint(-33F, 2F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 49
		bodyModel[36].setRotationPoint(-33F, 2F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[37].setRotationPoint(-10F, 6F, -10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[38].setRotationPoint(-10F, 6F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 14, 4, 15, 0F); // Box 488
		bodyModel[39].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 489
		bodyModel[40].setRotationPoint(-10F, 5F, -10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242 extended tank
		bodyModel[41].setRotationPoint(4F, 6F, -10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 7, 4, 15, 0F); // Box 243 extended tank
		bodyModel[42].setRotationPoint(4F, 5F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 244 extended tank
		bodyModel[43].setRotationPoint(4F, 6F, 7.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 245 extended tank
		bodyModel[44].setRotationPoint(4F, 5F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 805
		bodyModel[45].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 245 extended tank
		bodyModel[46].setRotationPoint(4F, 5F, 7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[47].setRotationPoint(-10F, 3F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[48].setRotationPoint(-14F, 3F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[49].setRotationPoint(-14F, 3F, 5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[50].setRotationPoint(11F, 3F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[51].setRotationPoint(11F, 3F, -6F);

		bodyModel[52].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[52].setRotationPoint(9.5F, 6.5F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 430
		bodyModel[53].setRotationPoint(5.5F, 3F, -10.01F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 431
		bodyModel[54].setRotationPoint(9F, 3F, -10.01F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 432
		bodyModel[55].setRotationPoint(9F, 3F, 10.01F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 433
		bodyModel[56].setRotationPoint(5.5F, 3F, 10.01F);

		bodyModel[57].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[57].setRotationPoint(-10F, 3F, 5F);

		bodyModel[58].addBox(0F, 0F, 0F, 14, 6, 9, 0F); // Box 73
		bodyModel[58].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[59].setRotationPoint(-10F, 6F, -7.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 75
		bodyModel[60].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 76
		bodyModel[61].setRotationPoint(-10F, 5F, 4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 77
		bodyModel[62].setRotationPoint(-10F, 6F, 4.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 78
		bodyModel[63].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[64].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[65].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[66].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[67].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[68].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[69].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[70].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[71].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[72].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[73].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[74].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[75].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[76].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[77].setRotationPoint(-14F, 3F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[78].setRotationPoint(-9F, 3F, 11F);

		bodyModel[79].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[79].setRotationPoint(-11F, 3F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[80].setRotationPoint(12F, 3F, 11F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[81].setRotationPoint(5.75F, 6F, -10.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 334
		bodyModel[82].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 335
		bodyModel[83].setRotationPoint(-37.01F, 7F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 336
		bodyModel[84].setRotationPoint(38.01F, 7F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 337
		bodyModel[85].setRotationPoint(38.01F, 7F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[86].setRotationPoint(12F, 3F, 11F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 339
		bodyModel[87].setRotationPoint(9F, 3F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 340
		bodyModel[88].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[89].setRotationPoint(-9F, 3F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[90].setRotationPoint(-11F, 3F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[91].setRotationPoint(-14F, 3F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[92].setRotationPoint(12F, 3F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[93].setRotationPoint(12F, 3F, -11F);

		bodyModel[94].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 346
		bodyModel[94].setRotationPoint(6F, 6.5F, -10F);

		bodyModel[95].addBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F); // Box 347 side air tank
		bodyModel[95].setRotationPoint(9.5F, 3.5F, -8F);
		bodyModel[95].rotateAngleY = 1.57079633F;
		bodyModel[95].rotateAngleZ = 0.78539816F;

		bodyModel[96].addBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F); // Box 348 side air tank
		bodyModel[96].setRotationPoint(9.5F, 3.5F, 8F);
		bodyModel[96].rotateAngleY = 1.57079633F;
		bodyModel[96].rotateAngleZ = 0.78539816F;

		bodyModel[97].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[97].setRotationPoint(-22F, -4F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 345 gp16 cutback frontbit
		bodyModel[98].setRotationPoint(-28F, -4F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 346 gp16 cutback frontbit
		bodyModel[99].setRotationPoint(-28F, -4F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[100].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[100].rotateAngleY = -3.14159265F;

		bodyModel[101].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[101].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[102].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[103].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[104].setRotationPoint(-33.01F, -12F, 11.02F);
		bodyModel[104].rotateAngleY = -3.14159265F;

		bodyModel[105].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[105].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[106].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[107].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[108].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[109].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[110].setRotationPoint(-34F, -12F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[111].setRotationPoint(-34F, -12F, 1F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[112].setRotationPoint(-34F, -12F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 215
		bodyModel[113].setRotationPoint(-31F, -12F, -7F);

		bodyModel[114].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 367
		bodyModel[114].setRotationPoint(-28F, -12F, -7F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 368
		bodyModel[115].setRotationPoint(-30F, -12F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 369 gp16 brake cover
		bodyModel[116].setRotationPoint(-30F, -7F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 370
		bodyModel[117].setRotationPoint(-30F, -4F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[118].setRotationPoint(-29F, -4F, 11.01F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[119].setRotationPoint(-29F, -4F, -11.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 374
		bodyModel[120].setRotationPoint(-30F, -4F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 375
		bodyModel[121].setRotationPoint(-30F, -12F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 350
		bodyModel[122].setRotationPoint(-31F, -19F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[123].setRotationPoint(-34F, -19F, -7F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[124].setRotationPoint(-34F, -19F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[125].setRotationPoint(-34F, -19F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 357
		bodyModel[126].setRotationPoint(-32F, -18F, -7F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 numberboard front high
		bodyModel[127].setRotationPoint(-31.55F, -16.5F, -6F);
		bodyModel[127].rotateAngleY = 0.46687557F;

		bodyModel[128].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 numberboard front high
		bodyModel[128].setRotationPoint(-31.55F, -16.5F, 6F);
		bodyModel[128].rotateAngleY = -0.46687557F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 383
		bodyModel[129].setRotationPoint(-32F, -11F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[130].setRotationPoint(-35.25F, -18F, -1F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[131].setRotationPoint(-34.5F, -18F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[132].setRotationPoint(-35.25F, -16F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[133].setRotationPoint(-34.5F, -16F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[134].setRotationPoint(-34.5F, -14F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 3
		bodyModel[135].setRotationPoint(-35.25F, -14F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front 5c
		bodyModel[136].setRotationPoint(-35.25F, -11F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 150 chop headlight supportis
		bodyModel[137].setRotationPoint(-34.5F, -11F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 headlight front 4
		bodyModel[138].setRotationPoint(-35.25F, -12F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 393
		bodyModel[139].setRotationPoint(-34.5F, -12F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front 6c
		bodyModel[140].setRotationPoint(-35.25F, -9F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[141].setRotationPoint(-32F, -1F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[142].setRotationPoint(-32F, -1F, 5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[143].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[144].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[145].setRotationPoint(-21F, -19F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[146].setRotationPoint(-22F, -19F, 7F);

		bodyModel[147].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 9
		bodyModel[147].setRotationPoint(-21F, -16F, 10F);

		bodyModel[148].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 10
		bodyModel[148].setRotationPoint(-21F, -16F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 15
		bodyModel[149].setRotationPoint(-22F, -16F, -7F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 21
		bodyModel[150].setRotationPoint(-11F, -16F, -11F);

		bodyModel[151].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[151].setRotationPoint(-10.5F, -16F, 10.5F);

		bodyModel[152].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[152].setRotationPoint(-21.5F, -16F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[153].setRotationPoint(-11F, -19F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[154].setRotationPoint(-22F, -19F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[155].setRotationPoint(-11F, -19F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[156].setRotationPoint(-21F, -19F, 7F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[157].setRotationPoint(-22F, -19F, -7F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[158].setRotationPoint(-11F, -19F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[159].setRotationPoint(-22F, -21F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[160].setRotationPoint(-22F, -21F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[161].setRotationPoint(-22F, -21F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[162].setRotationPoint(32F, -19F, -7F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[163].setRotationPoint(32F, -19F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[164].setRotationPoint(32F, -19F, 1F);

		bodyModel[165].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[165].setRotationPoint(-10F, -19F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[166].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[166].rotateAngleY = -1.11701072F;

		bodyModel[167].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[167].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[167].rotateAngleY = -1.11701072F;

		bodyModel[168].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[168].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[169].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[170].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[171].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[172].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[173].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[174].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[175].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[176].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[177].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[178].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[179].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[180].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[181].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[182].setRotationPoint(3.5F, -21F, -1.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[183].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[184].setRotationPoint(3.5F, -23F, -1.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[185].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[186].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[187].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 big fan
		bodyModel[188].setRotationPoint(-8F, -20F, -3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 farr filter
		bodyModel[189].setRotationPoint(1F, -21F, -7.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[190].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[191].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[192].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[193].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 big fan
		bodyModel[193].setRotationPoint(23F, -20F, -3.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[194].setRotationPoint(-32F, -19.5F, -1F);

		bodyModel[195].addBox(0F, 0F, 0F, 13, 2, 8, 0F); // Box 196 winterization hatch EXTRA THICC
		bodyModel[195].setRotationPoint(18F, -21F, -4F);

		bodyModel[196].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch tall
		bodyModel[196].setRotationPoint(18F, -22F, -3F);

		bodyModel[197].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 196 winterization hatch smol
		bodyModel[197].setRotationPoint(18F, -21F, -3F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[198].setRotationPoint(19.5F, -24F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[199].setRotationPoint(18F, -24F, 0F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[200].setRotationPoint(19.5F, -23F, -0.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 236
		bodyModel[201].setRotationPoint(30F, -21F, 5F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		bodyModel[202].setRotationPoint(30.25F, -20F, 5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 457
		bodyModel[203].setRotationPoint(32F, -18F, -7F);

		bodyModel[204].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[204].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[205].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[205].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[206].setRotationPoint(-5F, -12F, -11.02F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[207].setRotationPoint(-10F, -12F, -11.02F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[208].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[209].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[210].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[210].setRotationPoint(-10F, -4F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[211].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[212].setRotationPoint(-10F, -4F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[213].setRotationPoint(-8F, -4F, -11.01F);

		bodyModel[214].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 363
		bodyModel[214].setRotationPoint(-10F, -4F, 7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[215].setRotationPoint(-4F, -4F, 11.01F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[216].setRotationPoint(-10F, -4F, 7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[217].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[218].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[218].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[219].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 503
		bodyModel[219].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 314
		bodyModel[220].setRotationPoint(-5F, -12F, 11.02F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 314
		bodyModel[221].setRotationPoint(-10F, -12F, 11.02F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 12, 14, 0F); // Box 220
		bodyModel[222].setRotationPoint(32F, -11F, -7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[223].setRotationPoint(34F, -11F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 220
		bodyModel[224].setRotationPoint(34F, -11F, 6F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 220
		bodyModel[225].setRotationPoint(34F, -11F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[226].setRotationPoint(34.75F, -18F, -1F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[227].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 headlight rear 3
		bodyModel[228].setRotationPoint(34.75F, -14F, -1F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[229].setRotationPoint(34.5F, -16F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[230].setRotationPoint(34.75F, -16F, -1F);

		bodyModel[231].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[231].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[231].rotateAngleY = -0.46687557F;

		bodyModel[232].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[232].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[232].rotateAngleY = 0.46687557F;

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 312
		bodyModel[233].setRotationPoint(34.5F, -14F, -1F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 488
		bodyModel[234].setRotationPoint(34.5F, -12F, -1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 489 headlight rear 4
		bodyModel[235].setRotationPoint(34.75F, -12F, -1F);

		bodyModel[236].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[236].setRotationPoint(1F, -21.5F, -7F);

		bodyModel[237].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[237].setRotationPoint(1F, -21.5F, 5F);

		bodyModel[238].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[238].setRotationPoint(0.989999999999998F, -21F, -6.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[239].setRotationPoint(0.989999999999998F, -21F, 5.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[240].setRotationPoint(20.01F, -21F, 5.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[241].setRotationPoint(20.01F, -21F, -6.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[242].setRotationPoint(10F, -22F, -8F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[243].setRotationPoint(11.25F, -21.85F, -9F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[244].setRotationPoint(11.25F, -21.85F, -7F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[245].setRotationPoint(12F, -21F, -8F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227
		bodyModel[246].setRotationPoint(-2F, -18F, -9F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 228
		bodyModel[247].setRotationPoint(-1.75F, -18F, -8F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 254
		bodyModel[248].setRotationPoint(1F, -21.5F, -1F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 255
		bodyModel[249].setRotationPoint(0.5F, -21.5F, 0F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 256
		bodyModel[250].setRotationPoint(1.5F, -20.5F, -0.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[251].setRotationPoint(-3.5F, -21F, -6F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		bodyModel[252].setRotationPoint(-3F, -20F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[253].setRotationPoint(-4.5F, -21F, -5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[254].setRotationPoint(-5F, -21F, -7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[255].setRotationPoint(-29F, -20F, -6F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[256].setRotationPoint(-31F, -21F, -6F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 194
		bodyModel[257].setRotationPoint(-30.5F, -21F, -4F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[258].setRotationPoint(-29.5F, -21F, -5F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 203
		bodyModel[259].setRotationPoint(-12F, -19F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 204
		bodyModel[260].setRotationPoint(-11.5F, -18F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 205
		bodyModel[261].setRotationPoint(-21.5F, -18F, 9F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 206
		bodyModel[262].setRotationPoint(-23F, -19F, 9F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 238
		bodyModel[263].setRotationPoint(-26F, -18F, 7.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 239
		bodyModel[264].setRotationPoint(-24F, -18F, 6.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[265].setRotationPoint(-29F, -21F, -1F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 241
		bodyModel[266].setRotationPoint(-27.5F, -21F, 0F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 242
		bodyModel[267].setRotationPoint(-28.5F, -21F, 1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[268].setRotationPoint(-27F, -20F, -1F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 244
		bodyModel[269].setRotationPoint(-25.25F, -19F, 7.25F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 245
		bodyModel[270].setRotationPoint(-25.25F, -17F, 7.25F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 246
		bodyModel[271].setRotationPoint(-25F, -21F, 5F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 247
		bodyModel[272].setRotationPoint(-23.25F, -20F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[273].setRotationPoint(0.5F, -17.5F, 7.7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[274].setRotationPoint(0.5F, -18.5F, 7.7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[275].setRotationPoint(0.75F, -17F, 7.95F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[276].setRotationPoint(0.5F, -19.5F, 6.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[277].setRotationPoint(-16.5F, -22F, 0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[278].setRotationPoint(-17.5F, -22.25F, -0.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[279].setRotationPoint(-17F, -22F, -1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 some other steam gen thing
		bodyModel[280].setRotationPoint(-25F, -20F, -3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[281].setRotationPoint(-31F, -20F, 3F);

		bodyModel[282].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235 steam gen exhaust
		bodyModel[282].setRotationPoint(-30.5F, -22F, 3.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236 steam gen exhaust
		bodyModel[283].setRotationPoint(-30.5F, -24F, 3.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[284].setRotationPoint(-31F, -20F, -6F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235 steam gen exhaust
		bodyModel[285].setRotationPoint(-30.5F, -22F, -5.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236 steam gen exhaust
		bodyModel[286].setRotationPoint(-30.5F, -24F, -5.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 259
		bodyModel[287].setRotationPoint(-30F, -21F, -2F);

		bodyModel[288].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[288].setRotationPoint(-24F, -20.5F, -1F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight f chop 1
		bodyModel[289].setRotationPoint(-24.25F, -20.5F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight f chop 2
		bodyModel[290].setRotationPoint(-24.25F, -18.5F, -1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[291].setRotationPoint(-24F, -18.5F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 645
		bodyModel[292].setRotationPoint(-24F, -20.5F, -7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[293].setRotationPoint(-23F, -20.5F, -2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[294].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[295].setRotationPoint(-24F, -18.5F, 1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[296].setRotationPoint(-23F, -20.5F, 1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 363 numberboard chop A
		bodyModel[297].setRotationPoint(-22.4F, -18.55F, -6F);
		bodyModel[297].rotateAngleY = 0.32288591F;

		bodyModel[298].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 364 numberboard chop A
		bodyModel[298].setRotationPoint(-22.4F, -18.55F, 6F);
		bodyModel[298].rotateAngleY = -0.32288591F;

		bodyModel[299].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 286 antenna plate cull
		bodyModel[299].setRotationPoint(-21F, -20F, -9F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 287
		bodyModel[300].setRotationPoint(-20F, -22F, -7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[301].setRotationPoint(-18F, -26F, 6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[302].setRotationPoint(-18F, -26F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[303].setRotationPoint(-18F, -25F, 5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[304].setRotationPoint(-18F, -25F, 8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[305].setRotationPoint(-18F, -23F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[306].setRotationPoint(-18F, -23F, 5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[307].setRotationPoint(-18F, -23F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[308].setRotationPoint(-18F, -23F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[309].setRotationPoint(-18F, -25F, -9F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[310].setRotationPoint(-18F, -25F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[311].setRotationPoint(-18F, -26F, -8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[312].setRotationPoint(-18F, -26F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[313].setRotationPoint(-20.5F, -21F, -6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[314].setRotationPoint(-24F, -19F, -6.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 577
		bodyModel[315].setRotationPoint(-24F, -19F, 0.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 578
		bodyModel[316].setRotationPoint(-24F, -19F, -0.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 579 numberboard chop B
		bodyModel[317].setRotationPoint(-22.65F, -18.55F, -6F);
		bodyModel[317].rotateAngleY = 0.2443461F;

		bodyModel[318].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 580 numberboard chop B
		bodyModel[318].setRotationPoint(-22.65F, -18.55F, 6F);
		bodyModel[318].rotateAngleY = -0.2443461F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[319].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[320].setRotationPoint(-9F, -17.5F, -7.05F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[321].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 584
		bodyModel[322].setRotationPoint(-9F, -17.5F, 6.05F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[323].setRotationPoint(-29.5F, -6.5F, -7F);

		bodyModel[324].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[324].setRotationPoint(-29F, -4.5F, -7F);

		bodyModel[325].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[325].setRotationPoint(-33.5F, -7F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[326].setRotationPoint(-33.5F, -3F, -11.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[327].setRotationPoint(-31F, -7F, -11.02F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[328].setRotationPoint(-33.5F, -7F, -11.01F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 342
		bodyModel[329].setRotationPoint(-32.5F, -6F, -11.01F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[330].setRotationPoint(-31F, -7F, 11.02F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 344
		bodyModel[331].setRotationPoint(-32.5F, -6F, 11.01F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[332].setRotationPoint(-33.5F, -7F, 11.01F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 346
		bodyModel[333].setRotationPoint(-33.5F, -7F, 9.01F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 347
		bodyModel[334].setRotationPoint(-33.5F, -3F, 10.51F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[335].setRotationPoint(-11.5F, 3F, -10.25F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[336].setRotationPoint(-11.5F, 2F, -10.25F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[337].setRotationPoint(-11.25F, 3.5F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 19 front fuel fill
		bodyModel[338].setRotationPoint(-10F, 3F, -11F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 19 front fuel fill
		bodyModel[339].setRotationPoint(-10F, 3F, 6F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[340].setRotationPoint(-21.5F, -21.25F, -0.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[341].setRotationPoint(-23F, -22F, 0.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 357
		bodyModel[342].setRotationPoint(-24F, -22.25F, -0.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 358
		bodyModel[343].setRotationPoint(-23.5F, -22F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 cage cull a
		bodyModel[344].setRotationPoint(-24.01F, -25.51F, -3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[345].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[346].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[347].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[348].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[349].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[350].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[351].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[352].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[353].setRotationPoint(-37F, -5F, -4.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[354].setRotationPoint(-37.25F, -5F, -4.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[355].setRotationPoint(-37.25F, -3F, -4.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[356].setRotationPoint(-37F, -5F, 2.75F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[357].setRotationPoint(-37.25F, -5F, 2.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[358].setRotationPoint(-37.25F, -3F, 2.75F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[359].setRotationPoint(37F, -5F, -4.75F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[360].setRotationPoint(37.25F, -5F, -4.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[361].setRotationPoint(37.25F, -3F, -4.75F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[362].setRotationPoint(37F, -5F, 2.75F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[363].setRotationPoint(37.25F, -5F, 2.75F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[364].setRotationPoint(37.25F, -3F, 2.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[365].setRotationPoint(-21F, -21.5F, -0.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[366].setRotationPoint(-21F, -22.5F, -0.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[367].setRotationPoint(-12F, -21.5F, -0.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[368].setRotationPoint(-12F, -22.5F, -0.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[369].setRotationPoint(-29F, -20F, -0.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[370].setRotationPoint(-29F, -21F, -0.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[371].setRotationPoint(-20.5F, -20F, 7F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[372].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[373].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[374].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[375].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[376].setRotationPoint(-21F, -19F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[377].setRotationPoint(37F, -1F, -4.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[378].setRotationPoint(37F, -1F, 2.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394
		bodyModel[379].setRotationPoint(37.25F, -1F, -4.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395
		bodyModel[380].setRotationPoint(37.25F, -1F, 2.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[381].setRotationPoint(-37F, -1F, -4.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[382].setRotationPoint(-37F, -1F, 2.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398
		bodyModel[383].setRotationPoint(-37.25F, -1F, -4.75F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399
		bodyModel[384].setRotationPoint(-37.25F, -1F, 2.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[385].setRotationPoint(-37F, -2F, 3.75F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[386].setRotationPoint(-37F, -2F, -5.75F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[387].setRotationPoint(-37.25F, -2F, 3.75F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[388].setRotationPoint(-37.25F, -2F, -5.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[389].setRotationPoint(37F, -2F, -5.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[390].setRotationPoint(37.25F, -2F, -5.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[391].setRotationPoint(37.25F, -2F, 3.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[392].setRotationPoint(37F, -2F, 3.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[393].setRotationPoint(-23F, -20F, 5.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[394].setRotationPoint(-23F, -21F, 5.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[395].setRotationPoint(-23F, -20F, -6.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[396].setRotationPoint(-23F, -21F, -6.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[397].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[398].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[399].setRotationPoint(-41F, 7F, 0F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[400].setRotationPoint(-41F, 7F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[401].setRotationPoint(-40F, 6F, 0F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[402].setRotationPoint(-40F, 6F, -10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[403].setRotationPoint(41F, 7F, 0F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[404].setRotationPoint(41F, 7F, -10F);

		bodyModel[405].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[405].setRotationPoint(41F, 6F, -10F);

		bodyModel[406].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[406].setRotationPoint(41F, 6F, 0F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[407].setRotationPoint(-40F, 6F, 0F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[408].setRotationPoint(-40F, 6F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[409].setRotationPoint(-40F, 5F, 0F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[410].setRotationPoint(-40F, 5F, -10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[411].setRotationPoint(40F, 6F, -10F);

		bodyModel[412].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[412].setRotationPoint(41F, 5F, 0F);

		bodyModel[413].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[413].setRotationPoint(41F, 5F, -10F);

		bodyModel[414].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 211 wp large headlight
		bodyModel[414].setRotationPoint(34F, -18F, -1.5F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213 wp large headlight
		bodyModel[415].setRotationPoint(-36F, -18F, -1.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 headlight front 1 gyra
		bodyModel[416].setRotationPoint(-36.25F, -18F, -1F);

		bodyModel[417].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[417].setRotationPoint(-35.5F, -18F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 headlight front 2 gyra
		bodyModel[418].setRotationPoint(-36.25F, -16F, -1F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 312 emergency gyralight front mount
		bodyModel[419].setRotationPoint(-35.5F, -20F, -1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 emergency gyralight front
		bodyModel[420].setRotationPoint(-36.25F, -20F, -1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 headlight rear 1 gyra
		bodyModel[421].setRotationPoint(35.75F, -18F, -1F);

		bodyModel[422].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225
		bodyModel[422].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 headlight rear 2 gyra
		bodyModel[423].setRotationPoint(35.75F, -16F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 306 emergency gyralight rear mount
		bodyModel[424].setRotationPoint(34.5F, -20F, -1F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 308 emergency gyralight rear
		bodyModel[425].setRotationPoint(35.75F, -20F, -1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[426].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[427].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[428].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[428].setRotationPoint(-35.75F, -18F, -1F);
		bodyModel[428].rotateAngleX = 1.57079633F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam front
		bodyModel[429].setRotationPoint(-36.5F, -20F, -1F);
		bodyModel[429].rotateAngleX = 1.57079633F;

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam front
		bodyModel[430].setRotationPoint(-36.5F, -18F, -1F);
		bodyModel[430].rotateAngleX = 1.57079633F;

		bodyModel[431].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[431].setRotationPoint(34.75F, -18F, -1F);
		bodyModel[431].rotateAngleX = 1.57079633F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam rear
		bodyModel[432].setRotationPoint(36.5F, -20F, -1F);
		bodyModel[432].rotateAngleX = 1.57079633F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam rear
		bodyModel[433].setRotationPoint(36.5F, -18F, -1F);
		bodyModel[433].rotateAngleX = 1.57079633F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 452 rear fuel fill
		bodyModel[434].setRotationPoint(4F, 3F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 452 rear fuel fill
		bodyModel[435].setRotationPoint(4F, 3F, 6F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[436].setRotationPoint(-19F, -16F, 10F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306 cull aww
		bodyModel[437].setRotationPoint(-19F, -16F, -12.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 455
		bodyModel[438].setRotationPoint(4F, 5F, -6F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[439].setRotationPoint(5F, 4F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 457
		bodyModel[440].setRotationPoint(1F, 4F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 458
		bodyModel[441].setRotationPoint(1F, 4F, 11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[442].setRotationPoint(5F, 4F, 11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[443].setRotationPoint(-8F, 4F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[444].setRotationPoint(-8F, 4F, 11F);

		bodyModel[445].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 462
		bodyModel[445].setRotationPoint(-22F, -22.5F, 0F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[446].setRotationPoint(10F, -22F, -0.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[447].setRotationPoint(10F, -21F, -0.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[448].setRotationPoint(10.25F, -20.5F, -0.25F);

		bodyModel[449].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 bell holder cull
		bodyModel[449].setRotationPoint(10F, -22F, -1.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[450].setRotationPoint(-35.5F, -19.5F, -0.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[451].setRotationPoint(-35.5F, -20.5F, -0.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[452].setRotationPoint(-35.25F, -19F, -0.25F);

		bodyModel[453].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[453].setRotationPoint(-40F, 9F, -10F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 456 cull
		bodyModel[454].setRotationPoint(-38F, 7F, -10F);

		bodyModel[455].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 475
		bodyModel[455].setRotationPoint(38F, 9F, -10F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 476 cull
		bodyModel[456].setRotationPoint(38F, 7F, -10F);

		bodyModel[457].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 480
		bodyModel[457].setRotationPoint(-37F, 5.25F, -7.25F);

		bodyModel[458].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 481
		bodyModel[458].setRotationPoint(-37F, 6.25F, -10.25F);

		bodyModel[459].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 482
		bodyModel[459].setRotationPoint(-37F, 3.5F, -6.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 483
		bodyModel[460].setRotationPoint(-37F, 4.5F, -9.5F);

		bodyModel[461].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 484
		bodyModel[461].setRotationPoint(-37F, 2.75F, -9F);

		bodyModel[462].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 485
		bodyModel[462].setRotationPoint(-37F, 1.75F, -6F);

		bodyModel[463].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[463].setRotationPoint(-37F, 2F, 7F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[464].setRotationPoint(-37F, 2F, -7F);

		bodyModel[465].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 496
		bodyModel[465].setRotationPoint(-37F, 6.25F, 7.25F);

		bodyModel[466].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 497
		bodyModel[466].setRotationPoint(-37F, 5.25F, 7.25F);

		bodyModel[467].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 498
		bodyModel[467].setRotationPoint(-37F, 4.5F, 6.5F);

		bodyModel[468].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 499
		bodyModel[468].setRotationPoint(-37F, 3.5F, 6.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 500
		bodyModel[469].setRotationPoint(-37F, 2.75F, 6F);

		bodyModel[470].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 501
		bodyModel[470].setRotationPoint(-37F, 1.75F, 6F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 514
		bodyModel[471].setRotationPoint(35.5F, -19.5F, -0.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[472].setRotationPoint(35.5F, -20.5F, -0.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 516
		bodyModel[473].setRotationPoint(35.25F, -19F, -0.25F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[474].setRotationPoint(-29F, -20F, -1F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[475].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[476].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[477].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[478].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[479].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[479].setRotationPoint(-24F, -10F, 7F);

		bodyModel[480].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[480].setRotationPoint(-19F, -22.5F, -2F);

		bodyModel[481].addBox(0F, 0F, 2F, 3, 1, 0, 0F); // Box 262
		bodyModel[481].setRotationPoint(-17F, -21.5F, -2F);

		bodyModel[482].addBox(0F, 0F, 0F, 63, 4, 0, 0F); // Box 293 prr trainphoje
		bodyModel[482].setRotationPoint(-31F, -23F, 6F);

		bodyModel[483].addBox(0F, 0F, 0F, 0, 24, 2, 0F); // Box 520 prr bullshit
		bodyModel[483].setRotationPoint(32F, -23F, 6F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521 prr shiot
		bodyModel[484].setRotationPoint(-27.5F, -22F, -3F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522 pee are are
		bodyModel[485].setRotationPoint(-26F, -21F, -2.5F);

		bodyModel[486].addBox(0.5F, 0F, 0.5F, 2, 9, 3, 0F); // Box 412 cs1
		bodyModel[486].setRotationPoint(-16.5F, -13F, -2F);
		bodyModel[486].rotateAngleY = -0.26179939F;

		bodyModel[487].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[487].setRotationPoint(-21.6F, -11F, 2F);
		bodyModel[487].rotateAngleY = -0.59341195F;

		bodyModel[488].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[488].setRotationPoint(-21.6F, -13F, 2F);
		bodyModel[488].rotateAngleY = -0.59341195F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[489].setRotationPoint(-17F, -21.5F, -1F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[490].setRotationPoint(-17F, -22F, -1F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[491].setRotationPoint(-17F, -22F, -1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[492].setRotationPoint(-17F, -22F, -1F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[493].setRotationPoint(-17F, -22F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[494].setRotationPoint(-28F, -22F, -0.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[495].setRotationPoint(-28F, -21F, -0.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[496].setRotationPoint(-27.75F, -20.5F, -0.25F);

		bodyModel[497].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 bell holder cull
		bodyModel[497].setRotationPoint(-28F, -22F, -1.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[498].setRotationPoint(15.5F, -21.5F, -1F);

		bodyModel[499].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[499].setRotationPoint(3.5F, -21.5F, -1F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[501] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[502] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[503] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 554
		bodyModel[504] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[505] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[506] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[507] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[508] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[509] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[510] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[511] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[512] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[513] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[514] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[515] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[516] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[517] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[518] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 569
		bodyModel[519] = new ModelRendererTurbo(this, 12, 181, textureX, textureY); // Box 570
		bodyModel[520] = new ModelRendererTurbo(this, 9, 183, textureX, textureY); // Box 571
		bodyModel[521] = new ModelRendererTurbo(this, 12, 175, textureX, textureY); // Box 572
		bodyModel[522] = new ModelRendererTurbo(this, 9, 171, textureX, textureY); // Box 573
		bodyModel[523] = new ModelRendererTurbo(this, 12, 169, textureX, textureY); // Box 574
		bodyModel[524] = new ModelRendererTurbo(this, 21, 169, textureX, textureY); // Box 575
		bodyModel[525] = new ModelRendererTurbo(this, 18, 171, textureX, textureY); // Box 576
		bodyModel[526] = new ModelRendererTurbo(this, 21, 175, textureX, textureY); // Box 577
		bodyModel[527] = new ModelRendererTurbo(this, 18, 177, textureX, textureY); // Box 578
		bodyModel[528] = new ModelRendererTurbo(this, 21, 181, textureX, textureY); // Box 579
		bodyModel[529] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 580
		bodyModel[530] = new ModelRendererTurbo(this, 316, 200, textureX, textureY); // Box 581
		bodyModel[531] = new ModelRendererTurbo(this, 295, 237, textureX, textureY); // Box 582
		bodyModel[532] = new ModelRendererTurbo(this, 91, 116, textureX, textureY, "lamp"); // Box 583 numberboard front low
		bodyModel[533] = new ModelRendererTurbo(this, 91, 116, textureX, textureY, "lamp"); // Box 584 numberboard front low
		bodyModel[534] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[535] = new ModelRendererTurbo(this, 122, 124, textureX, textureY, "lamp"); // Box 560 markerlight
		bodyModel[536] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[537] = new ModelRendererTurbo(this, 122, 124, textureX, textureY, "lamp"); // Box 560 markerlight
		bodyModel[538] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[539] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[540] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 565
		bodyModel[541] = new ModelRendererTurbo(this, 32, 100, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[542] = new ModelRendererTurbo(this, 433, 141, textureX, textureY, "lamp"); // Box 170 headlight rear big
		bodyModel[543] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 568
		bodyModel[544] = new ModelRendererTurbo(this, 45, 57, textureX, textureY); // Box 570
		bodyModel[545] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 573 numberboard milw chop
		bodyModel[546] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 574 numberboard milw chop
		bodyModel[547] = new ModelRendererTurbo(this, 45, 48, textureX, textureY); // Box 575
		bodyModel[548] = new ModelRendererTurbo(this, 70, 48, textureX, textureY); // Box 576
		bodyModel[549] = new ModelRendererTurbo(this, 39, 135, textureX, textureY); // Box 113 fuck you
		bodyModel[550] = new ModelRendererTurbo(this, 86, 143, textureX, textureY); // Box 114 fuck you
		bodyModel[551] = new ModelRendererTurbo(this, 92, 141, textureX, textureY); // Box 115 fuck you
		bodyModel[552] = new ModelRendererTurbo(this, 72, 141, textureX, textureY); // Box 117 fuck you
		bodyModel[553] = new ModelRendererTurbo(this, 105, 143, textureX, textureY); // Box 202 fuck you
		bodyModel[554] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 578
		bodyModel[555] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 579
		bodyModel[556] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 580
		bodyModel[557] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 581
		bodyModel[558] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 582
		bodyModel[559] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 583
		bodyModel[560] = new ModelRendererTurbo(this, 472, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[561] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[562] = new ModelRendererTurbo(this, 476, 73, textureX, textureY); // Box 586 cs2
		bodyModel[563] = new ModelRendererTurbo(this, 477, 69, textureX, textureY); // Box 587 cs2
		bodyModel[564] = new ModelRendererTurbo(this, 473, 59, textureX, textureY); // Box 588 cs2
		bodyModel[565] = new ModelRendererTurbo(this, 477, 65, textureX, textureY); // Box 589 cs2
		bodyModel[566] = new ModelRendererTurbo(this, 463, 72, textureX, textureY); // Box 590 cs2
		bodyModel[567] = new ModelRendererTurbo(this, 493, 75, textureX, textureY, "lamp"); // Box 591 speedoooo
		bodyModel[568] = new ModelRendererTurbo(this, 374, 18, textureX, textureY); // Box 592
		bodyModel[569] = new ModelRendererTurbo(this, 374, 9, textureX, textureY); // Box 593
		bodyModel[570] = new ModelRendererTurbo(this, 374, 12, textureX, textureY); // Box 594
		bodyModel[571] = new ModelRendererTurbo(this, 374, 15, textureX, textureY); // Box 595
		bodyModel[572] = new ModelRendererTurbo(this, 75, 242, textureX, textureY); // Box 448
		bodyModel[573] = new ModelRendererTurbo(this, 81, 218, textureX, textureY); // Box 323
		bodyModel[574] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 280
		bodyModel[575] = new ModelRendererTurbo(this, 84, 206, textureX, textureY); // Box 285
		bodyModel[576] = new ModelRendererTurbo(this, 220, 206, textureX, textureY); // Box 517
		bodyModel[577] = new ModelRendererTurbo(this, 217, 218, textureX, textureY); // Box 518
		bodyModel[578] = new ModelRendererTurbo(this, 211, 242, textureX, textureY); // Box 519
		bodyModel[579] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 520
		bodyModel[580] = new ModelRendererTurbo(this, 325, 17, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[581] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 356
		bodyModel[582] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 278
		bodyModel[583] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 280
		bodyModel[584] = new ModelRendererTurbo(this, 266, 15, textureX, textureY); // Box 404
		bodyModel[585] = new ModelRendererTurbo(this, 262, 10, textureX, textureY); // Box 405
		bodyModel[586] = new ModelRendererTurbo(this, 47, 95, textureX, textureY, "cull"); // Box 470 Nose bell hang cull
		bodyModel[587] = new ModelRendererTurbo(this, 441, 148, textureX, textureY, "cull"); // Box 517 rear bell hang cull
		bodyModel[588] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[589] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[590] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[591] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[592] = new ModelRendererTurbo(this, 355, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[593] = new ModelRendererTurbo(this, 403, 131, textureX, textureY); // Box 43
		bodyModel[594] = new ModelRendererTurbo(this, 402, 129, textureX, textureY); // Box 355 brakewheel
		bodyModel[595] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[596] = new ModelRendererTurbo(this, 355, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[597] = new ModelRendererTurbo(this, 354, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[598] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[599] = new ModelRendererTurbo(this, 361, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[600] = new ModelRendererTurbo(this, 342, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[601] = new ModelRendererTurbo(this, 335, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[602] = new ModelRendererTurbo(this, 318, 46, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[603] = new ModelRendererTurbo(this, 318, 39, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[604] = new ModelRendererTurbo(this, 318, 30, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[605] = new ModelRendererTurbo(this, 318, 23, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[606] = new ModelRendererTurbo(this, 479, 41, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[607] = new ModelRendererTurbo(this, 479, 25, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[608] = new ModelRendererTurbo(this, 479, 22, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[609] = new ModelRendererTurbo(this, 479, 38, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[610] = new ModelRendererTurbo(this, 472, 21, textureX, textureY); // Box 346 GMD handrails
		bodyModel[611] = new ModelRendererTurbo(this, 472, 37, textureX, textureY); // Box 346 GMD handrails
		bodyModel[612] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 621 low ditchlight f
		bodyModel[613] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[614] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 623 low ditchlight f
		bodyModel[615] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[616] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 625 low ditchlight r
		bodyModel[617] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 626 low ditchlight r
		bodyModel[618] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[619] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[620] = new ModelRendererTurbo(this, 225, 110, textureX, textureY); // Box 123 sunshade
		bodyModel[621] = new ModelRendererTurbo(this, 225, 107, textureX, textureY); // Box 311 sunshade
		bodyModel[622] = new ModelRendererTurbo(this, 20, 94, textureX, textureY); // Box 631 mount
		bodyModel[623] = new ModelRendererTurbo(this, 445, 142, textureX, textureY); // Box 632 mount
		bodyModel[624] = new ModelRendererTurbo(this, 39, 120, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[625] = new ModelRendererTurbo(this, 419, 160, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[626] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 635 locomotive plate
		bodyModel[627] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 636 locomotive plate
		bodyModel[628] = new ModelRendererTurbo(this, 332, 115, textureX, textureY); // Box 628 cull fncc numberboard
		bodyModel[629] = new ModelRendererTurbo(this, 332, 111, textureX, textureY); // Box 629 cull fncc numberboard

		bodyModel[500].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 559
		bodyModel[500].setRotationPoint(-12F, -19F, -7F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[501].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[502].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[503].setRotationPoint(40F, 6F, 0F);

		bodyModel[504].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[504].setRotationPoint(34F, 5F, -10F);

		bodyModel[505].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[505].setRotationPoint(34F, 7F, -8F);

		bodyModel[506].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[506].setRotationPoint(34F, 8F, -11F);

		bodyModel[507].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[507].setRotationPoint(34F, 4F, -7F);

		bodyModel[508].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[508].setRotationPoint(34F, 2F, -7F);

		bodyModel[509].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[509].setRotationPoint(34F, 3F, -9F);

		bodyModel[510].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[510].setRotationPoint(34F, 1F, -8F);

		bodyModel[511].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[511].setRotationPoint(34F, 7F, 8F);

		bodyModel[512].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[512].setRotationPoint(34F, 8F, 8F);

		bodyModel[513].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[513].setRotationPoint(34F, 5F, 7F);

		bodyModel[514].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[514].setRotationPoint(34F, 4F, 7F);

		bodyModel[515].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[515].setRotationPoint(34F, 3F, 7F);

		bodyModel[516].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[516].setRotationPoint(34F, 2F, 7F);

		bodyModel[517].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[517].setRotationPoint(34F, 1F, 6F);

		bodyModel[518].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 569
		bodyModel[518].setRotationPoint(34F, 4.5F, -9.5F);

		bodyModel[519].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 570
		bodyModel[519].setRotationPoint(34F, 5.25F, -7.25F);

		bodyModel[520].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 571
		bodyModel[520].setRotationPoint(34F, 6.25F, -10.25F);

		bodyModel[521].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 572
		bodyModel[521].setRotationPoint(34F, 3.5F, -6.5F);

		bodyModel[522].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 573
		bodyModel[522].setRotationPoint(34F, 2.75F, -9F);

		bodyModel[523].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 574
		bodyModel[523].setRotationPoint(34F, 1.75F, -6F);

		bodyModel[524].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 575
		bodyModel[524].setRotationPoint(34F, 1.75F, 6F);

		bodyModel[525].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 576
		bodyModel[525].setRotationPoint(34F, 2.75F, 6F);

		bodyModel[526].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 577
		bodyModel[526].setRotationPoint(34F, 3.5F, 6.5F);

		bodyModel[527].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 578
		bodyModel[527].setRotationPoint(34F, 4.5F, 6.5F);

		bodyModel[528].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 579
		bodyModel[528].setRotationPoint(34F, 5.25F, 7.25F);

		bodyModel[529].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 580
		bodyModel[529].setRotationPoint(34F, 6.25F, 7.25F);

		bodyModel[530].addBox(0F, 0F, 0F, 7, 2, 9, 0F); // Box 581
		bodyModel[530].setRotationPoint(4F, 3F, -4.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 582
		bodyModel[531].setRotationPoint(-10F, 5F, -6F);

		bodyModel[532].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 583 numberboard front low
		bodyModel[532].setRotationPoint(-31.55F, -9.5F, -6F);
		bodyModel[532].rotateAngleY = 0.46687557F;

		bodyModel[533].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 584 numberboard front low
		bodyModel[533].setRotationPoint(-31.55F, -9.5F, 6F);
		bodyModel[533].rotateAngleY = -0.46687557F;

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[534].setRotationPoint(-32F, -18F, -6.51F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 560 markerlight
		bodyModel[535].setRotationPoint(-32F, -11F, -6.51F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[536].setRotationPoint(-32F, -18F, 6.51F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 560 markerlight
		bodyModel[537].setRotationPoint(-32F, -11F, 6.51F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[538].setRotationPoint(32F, -18F, -6.51F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[539].setRotationPoint(32F, -18F, 6.51F);

		bodyModel[540].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 565
		bodyModel[540].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[541].setRotationPoint(-36.25F, -17.75F, -1.25F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 headlight rear big
		bodyModel[542].setRotationPoint(36.75F, -17.75F, -1.25F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[543].setRotationPoint(-24F, -20.5F, -7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 570
		bodyModel[544].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[545].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 573 numberboard milw chop
		bodyModel[545].setRotationPoint(-22.4F, -19.55F, 6F);
		bodyModel[545].rotateAngleY = -0.32288591F;

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 574 numberboard milw chop
		bodyModel[546].setRotationPoint(-22.4F, -19.55F, -6F);
		bodyModel[546].rotateAngleY = 0.32288591F;

		bodyModel[547].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[547].setRotationPoint(-22F, -20.5F, 1F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F); // Box 576
		bodyModel[548].setRotationPoint(-22F, -20.5F, -7F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113 fuck you
		bodyModel[549].setRotationPoint(-31F, -12F, -7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114 fuck you
		bodyModel[550].setRotationPoint(-34F, -12F, -1F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-3F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 fuck you
		bodyModel[551].setRotationPoint(-34F, -12F, -7F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 117 fuck you
		bodyModel[552].setRotationPoint(-34F, -12F, 1F);

		bodyModel[553].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202 fuck you
		bodyModel[553].setRotationPoint(-33F, -11.7F, -1F);

		bodyModel[554].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 578
		bodyModel[554].setRotationPoint(0.989999999999998F, -21F, -4.25F);

		bodyModel[555].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 579
		bodyModel[555].setRotationPoint(1F, -21.5F, -4.75F);

		bodyModel[556].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 580
		bodyModel[556].setRotationPoint(20.01F, -21F, -4.25F);

		bodyModel[557].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 581
		bodyModel[557].setRotationPoint(1F, -21.5F, 2.75F);

		bodyModel[558].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 582
		bodyModel[558].setRotationPoint(0.989999999999998F, -21F, 3.25F);

		bodyModel[559].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 583
		bodyModel[559].setRotationPoint(20.01F, -21F, 3.25F);

		bodyModel[560].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[560].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[561].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[562].addBox(0F, 0F, 0F, 5, 7, 3, 0F); // Box 586 cs2
		bodyModel[562].setRotationPoint(-22.1F, -11F, 4F);
		bodyModel[562].rotateAngleY = -0.80285146F;

		bodyModel[563].addShapeBox(0F, 0F, 1F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587 cs2
		bodyModel[563].setRotationPoint(-22.1F, -12F, 4F);
		bodyModel[563].rotateAngleY = -0.80285146F;

		bodyModel[564].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 588 cs2
		bodyModel[564].setRotationPoint(-22.1F, -14F, 4F);
		bodyModel[564].rotateAngleY = -0.80285146F;

		bodyModel[565].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 589 cs2
		bodyModel[565].setRotationPoint(-22.1F, -12F, 4F);
		bodyModel[565].rotateAngleY = -0.80285146F;

		bodyModel[566].addBox(5F, 0F, -5F, 3, 8, 3, 0F); // Box 590 cs2
		bodyModel[566].setRotationPoint(-22.1F, -12F, 4F);
		bodyModel[566].rotateAngleY = 0.2268928F;

		bodyModel[567].addShapeBox(0F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo
		bodyModel[567].setRotationPoint(-22.1F, -17F, 4F);
		bodyModel[567].rotateAngleY = -1.11701072F;

		bodyModel[568].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 592
		bodyModel[568].setRotationPoint(30F, -20F, 5F);

		bodyModel[569].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 593
		bodyModel[569].setRotationPoint(29.25F, -20.85F, 6F);

		bodyModel[570].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 594
		bodyModel[570].setRotationPoint(28F, -21F, 5F);

		bodyModel[571].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 595
		bodyModel[571].setRotationPoint(29.25F, -20.85F, 4F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[572].setRotationPoint(-40F, 5F, 2F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[573].setRotationPoint(-40F, 5F, -10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[574].setRotationPoint(-40F, 4F, 2F);

		bodyModel[575].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[575].setRotationPoint(-40F, 4F, -8F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[576].setRotationPoint(40F, 4F, 2F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[577].setRotationPoint(40F, 5F, 2F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[578].setRotationPoint(40F, 5F, -10F);

		bodyModel[579].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[579].setRotationPoint(40F, 4F, -8F);

		bodyModel[580].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355 cull
		bodyModel[580].setRotationPoint(-15F, -21.25F, -0.5F);

		bodyModel[581].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[581].setRotationPoint(-17F, -22.25F, -0.5F);

		bodyModel[582].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[582].setRotationPoint(-15F, -22.5F, -1.5F);

		bodyModel[583].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[583].setRotationPoint(-16F, -22.5F, 0.5F);

		bodyModel[584].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404
		bodyModel[584].setRotationPoint(-25F, -23F, -4F);

		bodyModel[585].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[585].setRotationPoint(-26.5F, -21F, -6F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470 Nose bell hang cull
		bodyModel[586].setRotationPoint(-36F, -20.5F, -1F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 517 rear bell hang cull
		bodyModel[587].setRotationPoint(35F, -20.5F, -1F);

		bodyModel[588].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[588].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[589].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[589].setRotationPoint(7.5F, -23F, -1.5F);

		bodyModel[590].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[590].setRotationPoint(11.5F, -21F, -1.5F);

		bodyModel[591].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[591].setRotationPoint(11.5F, -23F, -1.5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[592].setRotationPoint(1F, -21F, -9F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[593].setRotationPoint(33.65F, -5F, 3.6F);
		bodyModel[593].rotateAngleY = 0.45378561F;

		bodyModel[594].addShapeBox(1F, -1.25F, -1.25F, 0, 5, 5, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 355 brakewheel
		bodyModel[594].setRotationPoint(34F, -5.75F, 2.95F);
		bodyModel[594].rotateAngleY = 0.45378561F;

		bodyModel[595].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[595].setRotationPoint(1F, -21F, 7F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[596].setRotationPoint(1F, -19F, -9F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[597].setRotationPoint(-0.5F, -18F, -9F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[598].setRotationPoint(1F, -19F, 7F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[599].setRotationPoint(3F, -18F, -9F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[600].setRotationPoint(-0.5F, -18F, 7F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[601].setRotationPoint(3F, -18F, 7F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81 GMD Handrails
		bodyModel[602].setRotationPoint(-33.5F, -6F, -11.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-2.5F, -1.5F, 2F, 2.5F, -1.5F, 2F, 2.5F, 0F, -3F, -2.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[603].setRotationPoint(-33.5F, -12F, -9F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81 GMD Handrails
		bodyModel[604].setRotationPoint(-33.5F, -6F, 10.5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-2.5F, 0F, -3F, 2.5F, 0F, -3F, 2.5F, -1.5F, 2F, -2.5F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[605].setRotationPoint(-33.5F, -12F, 8F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81 GMD Handrails
		bodyModel[606].setRotationPoint(34.5F, -6F, -11.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81 GMD Handrails
		bodyModel[607].setRotationPoint(34.5F, -6F, 10.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[608].setRotationPoint(34.5F, -7F, 9.01F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[609].setRotationPoint(34.5F, -7F, -11.01F);

		bodyModel[610].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 346 GMD handrails
		bodyModel[610].setRotationPoint(34.5F, -7F, -11F);

		bodyModel[611].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 346 GMD handrails
		bodyModel[611].setRotationPoint(34.5F, -7F, 8.01F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[612].setRotationPoint(-37.75F, 1F, -6.75F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[613].setRotationPoint(-37.5F, 1F, -6.75F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[614].setRotationPoint(-37.75F, 1F, 4.75F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[615].setRotationPoint(-37.5F, 1F, 4.75F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[616].setRotationPoint(37.75F, 1F, -6.75F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[617].setRotationPoint(37.75F, 1F, 4.75F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[618].setRotationPoint(37.5F, 1F, 4.75F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[619].setRotationPoint(37.5F, 1F, -6.75F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123 sunshade
		bodyModel[620].setRotationPoint(-20.5F, -16F, -11F);
		bodyModel[620].rotateAngleX = -0.78539816F;

		bodyModel[621].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311 sunshade
		bodyModel[621].setRotationPoint(-20.5F, -16F, 11F);
		bodyModel[621].rotateAngleX = 0.78539816F;

		bodyModel[622].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 631 mount
		bodyModel[622].setRotationPoint(-33.75F, -19F, -1F);
		bodyModel[622].rotateAngleX = 1.57079633F;

		bodyModel[623].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 632 mount
		bodyModel[623].setRotationPoint(32.75F, -19F, -1F);
		bodyModel[623].rotateAngleX = 1.57079633F;

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[624].setRotationPoint(-35F, -18F, -1F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[625].setRotationPoint(35F, -18F, -1F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 635 locomotive plate
		bodyModel[626].setRotationPoint(-32F, -2F, -11.02F);

		bodyModel[627].addShapeBox(-2F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 636 locomotive plate
		bodyModel[627].setRotationPoint(-32F, -2F, 11.02F);
		bodyModel[627].rotateAngleY = -3.14159265F;

		bodyModel[628].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628 cull fncc numberboard
		bodyModel[628].setRotationPoint(8F, -20.6F, -9.01F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629 cull fncc numberboard
		bodyModel[629].setRotationPoint(8F, -20.6F, 8.01F);

	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();
	ModelTypeAnew theA = new ModelTypeAnew();
	Modelane_slab_antenna aneOnSomeShitFr = new Modelane_slab_antenna();
	Modelgp7_deets_wm wmdeets = new Modelgp7_deets_wm();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15||GetColor(entity) == 24
				||GetColor(entity) == 25234) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 22){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.02, 0);//front & rear
			theA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 27){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black_oops_im_cheesed_to_meet_you.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/gp7_ane_radioslab_owo.png"));
			GL11.glPushMatrix();
			aneOnSomeShitFr.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 32 ||GetColor(entity) == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 5 ||GetColor(entity) == 25){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 58){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			if (((AbstractTrains) entity).getColor() == 54){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wm_chop_details_black.png"));
				GL11.glPushMatrix();
				wmdeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}else if (((AbstractTrains) entity).getColor() == 55){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wm_chop_details_circus.png"));
				GL11.glPushMatrix();
				wmdeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		}
	}
}