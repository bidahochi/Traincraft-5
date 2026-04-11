//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: earlyGP_B
// Model Creator: bida
// Created on: 17.10.2023 - 16:18:14
// Last changed on: 17.10.2023 - 16:18:14

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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

import java.util.ArrayList;

public class ModelGP7b extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[510];

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
		bodyModel[129] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[130] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 216
		bodyModel[131] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[132] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 311
		bodyModel[133] = new ModelRendererTurbo(this, 25, 130, textureX, textureY); // Box 265
		bodyModel[134] = new ModelRendererTurbo(this, 32, 130, textureX, textureY, "lamp"); // Box 247 headlight front 3
		bodyModel[135] = new ModelRendererTurbo(this, 32, 135, textureX, textureY, "lamp"); // Box 151 headlight front 4
		bodyModel[136] = new ModelRendererTurbo(this, 25, 135, textureX, textureY); // Box 393
		bodyModel[137] = new ModelRendererTurbo(this, 188, 160, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 188, 148, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[140] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[141] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[142] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[143] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[144] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[145] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[146] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[147] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[148] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[149] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[150] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[151] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[152] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[153] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[154] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[155] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[156] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[157] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[158] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[159] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[160] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[161] = new ModelRendererTurbo(this, 314, 81, textureX, textureY); // Box 184
		bodyModel[162] = new ModelRendererTurbo(this, 325, 81, textureX, textureY); // Box 185
		bodyModel[163] = new ModelRendererTurbo(this, 314, 75, textureX, textureY); // Box 247 extra stack
		bodyModel[164] = new ModelRendererTurbo(this, 325, 75, textureX, textureY); // Box 248 extra stack
		bodyModel[165] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 186
		bodyModel[166] = new ModelRendererTurbo(this, 389, 99, textureX, textureY); // Box 187
		bodyModel[167] = new ModelRendererTurbo(this, 392, 106, textureX, textureY); // Box 89 big fan
		bodyModel[168] = new ModelRendererTurbo(this, 334, 53, textureX, textureY); // Box 196 farr filter
		bodyModel[169] = new ModelRendererTurbo(this, 437, 97, textureX, textureY); // Box 188
		bodyModel[170] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 189
		bodyModel[171] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[172] = new ModelRendererTurbo(this, 434, 106, textureX, textureY); // Box 89 big fan
		bodyModel[173] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 190
		bodyModel[174] = new ModelRendererTurbo(this, 413, 86, textureX, textureY, "cull"); // Box 196 winterization hatch EXTRA THICC
		bodyModel[175] = new ModelRendererTurbo(this, 421, 67, textureX, textureY, "cull"); // Box 196 winterization hatch tall
		bodyModel[176] = new ModelRendererTurbo(this, 421, 77, textureX, textureY, "cull"); // Box 196 winterization hatch smol
		bodyModel[177] = new ModelRendererTurbo(this, 364, 15, textureX, textureY); // Box 239
		bodyModel[178] = new ModelRendererTurbo(this, 364, 12, textureX, textureY); // Box 240
		bodyModel[179] = new ModelRendererTurbo(this, 364, 18, textureX, textureY); // Box 241
		bodyModel[180] = new ModelRendererTurbo(this, 364, 4, textureX, textureY); // Box 236
		bodyModel[181] = new ModelRendererTurbo(this, 364, 7, textureX, textureY); // Box 237
		bodyModel[182] = new ModelRendererTurbo(this, 381, 126, textureX, textureY); // Box 457
		bodyModel[183] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[184] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[185] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[186] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Box 313
		bodyModel[187] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[188] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[189] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[190] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[191] = new ModelRendererTurbo(this, 308, 158, textureX, textureY); // Box 363
		bodyModel[192] = new ModelRendererTurbo(this, 321, 162, textureX, textureY); // Box 238
		bodyModel[193] = new ModelRendererTurbo(this, 324, 148, textureX, textureY); // Box 363
		bodyModel[194] = new ModelRendererTurbo(this, 345, 152, textureX, textureY); // Box 238
		bodyModel[195] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[196] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[197] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[198] = new ModelRendererTurbo(this, 368, 24, textureX, textureY); // Box 503
		bodyModel[199] = new ModelRendererTurbo(this, 379, 24, textureX, textureY); // Box 314
		bodyModel[200] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[201] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[202] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[203] = new ModelRendererTurbo(this, 433, 170, textureX, textureY, "lamp"); // Box 221 headlight rear 3
		bodyModel[204] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[205] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[206] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[207] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[208] = new ModelRendererTurbo(this, 426, 170, textureX, textureY); // Box 312
		bodyModel[209] = new ModelRendererTurbo(this, 426, 175, textureX, textureY); // Box 488
		bodyModel[210] = new ModelRendererTurbo(this, 433, 175, textureX, textureY, "lamp"); // Box 489 headlight rear 4
		bodyModel[211] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 246 roof air tank
		bodyModel[212] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 249 roof air tank
		bodyModel[213] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 250
		bodyModel[214] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 251
		bodyModel[215] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 252
		bodyModel[216] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 253
		bodyModel[217] = new ModelRendererTurbo(this, 302, 15, textureX, textureY); // Box 246
		bodyModel[218] = new ModelRendererTurbo(this, 302, 18, textureX, textureY); // Box 247
		bodyModel[219] = new ModelRendererTurbo(this, 310, 28, textureX, textureY); // Box 114
		bodyModel[220] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 74
		bodyModel[221] = new ModelRendererTurbo(this, 310, 31, textureX, textureY); // Box 78
		bodyModel[222] = new ModelRendererTurbo(this, 309, 21, textureX, textureY); // Box 245
		bodyModel[223] = new ModelRendererTurbo(this, 60, 115, textureX, textureY); // Box 233 some other steam gen thing
		bodyModel[224] = new ModelRendererTurbo(this, 47, 130, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[225] = new ModelRendererTurbo(this, 49, 125, textureX, textureY); // Box 235 steam gen exhaust
		bodyModel[226] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 236 steam gen exhaust
		bodyModel[227] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[228] = new ModelRendererTurbo(this, 62, 125, textureX, textureY); // Box 235 steam gen exhaust
		bodyModel[229] = new ModelRendererTurbo(this, 62, 120, textureX, textureY); // Box 236 steam gen exhaust
		bodyModel[230] = new ModelRendererTurbo(this, 53, 105, textureX, textureY); // Box 259
		bodyModel[231] = new ModelRendererTurbo(this, 26, 82, textureX, textureY, "cull"); // Box 286 antenna plate cull
		bodyModel[232] = new ModelRendererTurbo(this, 40, 84, textureX, textureY); // Box 287
		bodyModel[233] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 372
		bodyModel[234] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[235] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 257
		bodyModel[236] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[237] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 584
		bodyModel[238] = new ModelRendererTurbo(this, 155, 115, textureX, textureY); // Box 43
		bodyModel[239] = new ModelRendererTurbo(this, 156, 118, textureX, textureY); // Box 43
		bodyModel[240] = new ModelRendererTurbo(this, 324, 38, textureX, textureY); // Box 81
		bodyModel[241] = new ModelRendererTurbo(this, 321, 39, textureX, textureY); // Box 81
		bodyModel[242] = new ModelRendererTurbo(this, 334, 40, textureX, textureY); // Box 261
		bodyModel[243] = new ModelRendererTurbo(this, 329, 40, textureX, textureY); // Box 341
		bodyModel[244] = new ModelRendererTurbo(this, 330, 42, textureX, textureY); // Box 342
		bodyModel[245] = new ModelRendererTurbo(this, 334, 24, textureX, textureY); // Box 343
		bodyModel[246] = new ModelRendererTurbo(this, 330, 26, textureX, textureY); // Box 344
		bodyModel[247] = new ModelRendererTurbo(this, 329, 24, textureX, textureY); // Box 345
		bodyModel[248] = new ModelRendererTurbo(this, 324, 22, textureX, textureY); // Box 346
		bodyModel[249] = new ModelRendererTurbo(this, 321, 23, textureX, textureY); // Box 347
		bodyModel[250] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[251] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[252] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[253] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[254] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[255] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 78
		bodyModel[256] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 188
		bodyModel[257] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[258] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[259] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 239
		bodyModel[260] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[261] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[262] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 242
		bodyModel[263] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 188
		bodyModel[264] = new ModelRendererTurbo(this, 8, 112, textureX, textureY); // Box 190
		bodyModel[265] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 190
		bodyModel[266] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 188
		bodyModel[267] = new ModelRendererTurbo(this, 8, 122, textureX, textureY); // Box 190
		bodyModel[268] = new ModelRendererTurbo(this, 8, 127, textureX, textureY); // Box 190
		bodyModel[269] = new ModelRendererTurbo(this, 458, 173, textureX, textureY); // Box 188
		bodyModel[270] = new ModelRendererTurbo(this, 465, 170, textureX, textureY); // Box 190
		bodyModel[271] = new ModelRendererTurbo(this, 465, 175, textureX, textureY); // Box 190
		bodyModel[272] = new ModelRendererTurbo(this, 458, 163, textureX, textureY); // Box 188
		bodyModel[273] = new ModelRendererTurbo(this, 465, 160, textureX, textureY); // Box 190
		bodyModel[274] = new ModelRendererTurbo(this, 465, 165, textureX, textureY); // Box 190
		bodyModel[275] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 409 commander base
		bodyModel[276] = new ModelRendererTurbo(this, 26, 73, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[277] = new ModelRendererTurbo(this, 26, 84, textureX, textureY); // Box 409 commander base
		bodyModel[278] = new ModelRendererTurbo(this, 26, 80, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[279] = new ModelRendererTurbo(this, 66, 100, textureX, textureY); // Box 409 commander base
		bodyModel[280] = new ModelRendererTurbo(this, 66, 96, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[281] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 364 prime base
		bodyModel[282] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[283] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[284] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[285] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[286] = new ModelRendererTurbo(this, 15, 86, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[287] = new ModelRendererTurbo(this, 444, 170, textureX, textureY); // Box 392
		bodyModel[288] = new ModelRendererTurbo(this, 444, 165, textureX, textureY); // Box 393
		bodyModel[289] = new ModelRendererTurbo(this, 451, 170, textureX, textureY); // Box 394
		bodyModel[290] = new ModelRendererTurbo(this, 451, 165, textureX, textureY); // Box 395
		bodyModel[291] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 396
		bodyModel[292] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 397
		bodyModel[293] = new ModelRendererTurbo(this, 8, 137, textureX, textureY); // Box 398
		bodyModel[294] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 399
		bodyModel[295] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 78
		bodyModel[296] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[297] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[298] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[299] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[300] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[301] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[302] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[303] = new ModelRendererTurbo(this, 109, 69, textureX, textureY); // Box 409 commander base
		bodyModel[304] = new ModelRendererTurbo(this, 109, 65, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[305] = new ModelRendererTurbo(this, 109, 69, textureX, textureY); // Box 409 commander base
		bodyModel[306] = new ModelRendererTurbo(this, 109, 65, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[307] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[308] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[309] = new ModelRendererTurbo(this, 62, 242, textureX, textureY); // Box 22
		bodyModel[310] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 23
		bodyModel[311] = new ModelRendererTurbo(this, 65, 230, textureX, textureY); // Box 24
		bodyModel[312] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Box 25
		bodyModel[313] = new ModelRendererTurbo(this, 221, 242, textureX, textureY); // Box 431
		bodyModel[314] = new ModelRendererTurbo(this, 198, 242, textureX, textureY); // Box 432
		bodyModel[315] = new ModelRendererTurbo(this, 201, 230, textureX, textureY); // Box 433
		bodyModel[316] = new ModelRendererTurbo(this, 224, 230, textureX, textureY); // Box 434
		bodyModel[317] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 4
		bodyModel[318] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 322
		bodyModel[319] = new ModelRendererTurbo(this, 71, 206, textureX, textureY); // Box 438
		bodyModel[320] = new ModelRendererTurbo(this, 94, 206, textureX, textureY); // Box 439
		bodyModel[321] = new ModelRendererTurbo(this, 204, 218, textureX, textureY); // Box 441
		bodyModel[322] = new ModelRendererTurbo(this, 230, 206, textureX, textureY); // Box 442
		bodyModel[323] = new ModelRendererTurbo(this, 207, 206, textureX, textureY); // Box 443
		bodyModel[324] = new ModelRendererTurbo(this, 420, 141, textureX, textureY); // Box 211 wp large headlight
		bodyModel[325] = new ModelRendererTurbo(this, 19, 100, textureX, textureY); // Box 213 wp large headlight
		bodyModel[326] = new ModelRendererTurbo(this, 39, 114, textureX, textureY, "lamp"); // Box 218 headlight front 1 gyra
		bodyModel[327] = new ModelRendererTurbo(this, 23, 112, textureX, textureY); // Box 219
		bodyModel[328] = new ModelRendererTurbo(this, 32, 114, textureX, textureY, "lamp"); // Box 220 headlight front 2 gyra
		bodyModel[329] = new ModelRendererTurbo(this, 23, 107, textureX, textureY); // Box 312 emergency gyralight front mount
		bodyModel[330] = new ModelRendererTurbo(this, 32, 107, textureX, textureY, "lamp"); // Box 313 emergency gyralight front
		bodyModel[331] = new ModelRendererTurbo(this, 440, 155, textureX, textureY, "lamp"); // Box 224 headlight rear 1 gyra
		bodyModel[332] = new ModelRendererTurbo(this, 424, 153, textureX, textureY); // Box 225
		bodyModel[333] = new ModelRendererTurbo(this, 433, 155, textureX, textureY, "lamp"); // Box 226 headlight rear 2 gyra
		bodyModel[334] = new ModelRendererTurbo(this, 424, 148, textureX, textureY); // Box 306 emergency gyralight rear mount
		bodyModel[335] = new ModelRendererTurbo(this, 433, 148, textureX, textureY, "lamp"); // Box 308 emergency gyralight rear
		bodyModel[336] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[337] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[338] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 336
		bodyModel[339] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam front
		bodyModel[340] = new ModelRendererTurbo(this, 39, 95, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam front
		bodyModel[341] = new ModelRendererTurbo(this, 444, 141, textureX, textureY); // Box 336
		bodyModel[342] = new ModelRendererTurbo(this, 464, 143, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam rear
		bodyModel[343] = new ModelRendererTurbo(this, 457, 143, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam rear
		bodyModel[344] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[345] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[346] = new ModelRendererTurbo(this, 295, 218, textureX, textureY); // Box 455
		bodyModel[347] = new ModelRendererTurbo(this, 285, 186, textureX, textureY); // Box 456
		bodyModel[348] = new ModelRendererTurbo(this, 279, 186, textureX, textureY); // Box 457
		bodyModel[349] = new ModelRendererTurbo(this, 279, 195, textureX, textureY); // Box 458
		bodyModel[350] = new ModelRendererTurbo(this, 285, 195, textureX, textureY); // Box 459
		bodyModel[351] = new ModelRendererTurbo(this, 271, 189, textureX, textureY); // Box 460
		bodyModel[352] = new ModelRendererTurbo(this, 271, 197, textureX, textureY); // Box 461
		bodyModel[353] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 462
		bodyModel[354] = new ModelRendererTurbo(this, 293, 22, textureX, textureY); // Box 403
		bodyModel[355] = new ModelRendererTurbo(this, 293, 25, textureX, textureY); // Box 404
		bodyModel[356] = new ModelRendererTurbo(this, 293, 28, textureX, textureY); // Box 405
		bodyModel[357] = new ModelRendererTurbo(this, 291, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[358] = new ModelRendererTurbo(this, 47, 103, textureX, textureY); // Box 114
		bodyModel[359] = new ModelRendererTurbo(this, 47, 100, textureX, textureY); // Box 74
		bodyModel[360] = new ModelRendererTurbo(this, 47, 106, textureX, textureY); // Box 78
		bodyModel[361] = new ModelRendererTurbo(this, 0, 232, textureX, textureY); // Box 50
		bodyModel[362] = new ModelRendererTurbo(this, 7, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[363] = new ModelRendererTurbo(this, 136, 232, textureX, textureY); // Box 475
		bodyModel[364] = new ModelRendererTurbo(this, 143, 233, textureX, textureY, "cull"); // Box 476 cull
		bodyModel[365] = new ModelRendererTurbo(this, 12, 181, textureX, textureY); // Box 480
		bodyModel[366] = new ModelRendererTurbo(this, 9, 183, textureX, textureY); // Box 481
		bodyModel[367] = new ModelRendererTurbo(this, 12, 175, textureX, textureY); // Box 482
		bodyModel[368] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 483
		bodyModel[369] = new ModelRendererTurbo(this, 9, 171, textureX, textureY); // Box 484
		bodyModel[370] = new ModelRendererTurbo(this, 12, 169, textureX, textureY); // Box 485
		bodyModel[371] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[372] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[373] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 496
		bodyModel[374] = new ModelRendererTurbo(this, 21, 181, textureX, textureY); // Box 497
		bodyModel[375] = new ModelRendererTurbo(this, 18, 177, textureX, textureY); // Box 498
		bodyModel[376] = new ModelRendererTurbo(this, 21, 175, textureX, textureY); // Box 499
		bodyModel[377] = new ModelRendererTurbo(this, 18, 171, textureX, textureY); // Box 500
		bodyModel[378] = new ModelRendererTurbo(this, 21, 169, textureX, textureY); // Box 501
		bodyModel[379] = new ModelRendererTurbo(this, 449, 155, textureX, textureY); // Box 514
		bodyModel[380] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 515
		bodyModel[381] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 516
		bodyModel[382] = new ModelRendererTurbo(this, 64, 107, textureX, textureY); // Box 364 prime base
		bodyModel[383] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[384] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[385] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[386] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[387] = new ModelRendererTurbo(this, 130, 114, textureX, textureY); // Box 355
		bodyModel[388] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 347
		bodyModel[389] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 262
		bodyModel[390] = new ModelRendererTurbo(this, 375, 3, textureX, textureY); // Box 293 prr trainphoje
		bodyModel[391] = new ModelRendererTurbo(this, 502, 1, textureX, textureY); // Box 520 prr bullshit
		bodyModel[392] = new ModelRendererTurbo(this, 51, 111, textureX, textureY); // Box 521 prr shiot
		bodyModel[393] = new ModelRendererTurbo(this, 52, 108, textureX, textureY); // Box 522 pee are are
		bodyModel[394] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // Box 364 prime base
		bodyModel[395] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[396] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[397] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[398] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[399] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 403
		bodyModel[400] = new ModelRendererTurbo(this, 59, 106, textureX, textureY); // Box 404
		bodyModel[401] = new ModelRendererTurbo(this, 59, 109, textureX, textureY); // Box 405
		bodyModel[402] = new ModelRendererTurbo(this, 57, 96, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[403] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 515
		bodyModel[404] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Box 526
		bodyModel[405] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[406] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[407] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[408] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 554
		bodyModel[409] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[410] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[411] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[412] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[413] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[414] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[415] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[416] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[417] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[418] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[419] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[420] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[421] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[422] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[423] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 569
		bodyModel[424] = new ModelRendererTurbo(this, 12, 181, textureX, textureY); // Box 570
		bodyModel[425] = new ModelRendererTurbo(this, 9, 183, textureX, textureY); // Box 571
		bodyModel[426] = new ModelRendererTurbo(this, 12, 175, textureX, textureY); // Box 572
		bodyModel[427] = new ModelRendererTurbo(this, 9, 171, textureX, textureY); // Box 573
		bodyModel[428] = new ModelRendererTurbo(this, 12, 169, textureX, textureY); // Box 574
		bodyModel[429] = new ModelRendererTurbo(this, 21, 169, textureX, textureY); // Box 575
		bodyModel[430] = new ModelRendererTurbo(this, 18, 171, textureX, textureY); // Box 576
		bodyModel[431] = new ModelRendererTurbo(this, 21, 175, textureX, textureY); // Box 577
		bodyModel[432] = new ModelRendererTurbo(this, 18, 177, textureX, textureY); // Box 578
		bodyModel[433] = new ModelRendererTurbo(this, 21, 181, textureX, textureY); // Box 579
		bodyModel[434] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 580
		bodyModel[435] = new ModelRendererTurbo(this, 316, 200, textureX, textureY); // Box 581
		bodyModel[436] = new ModelRendererTurbo(this, 295, 237, textureX, textureY); // Box 582
		bodyModel[437] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[438] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[439] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[440] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[441] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 565
		bodyModel[442] = new ModelRendererTurbo(this, 32, 100, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[443] = new ModelRendererTurbo(this, 433, 141, textureX, textureY, "lamp"); // Box 170 headlight rear big
		bodyModel[444] = new ModelRendererTurbo(this, 86, 143, textureX, textureY); // Box 114 fuck you
		bodyModel[445] = new ModelRendererTurbo(this, 105, 143, textureX, textureY); // Box 202 fuck you
		bodyModel[446] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 578
		bodyModel[447] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 579
		bodyModel[448] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 580
		bodyModel[449] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 581
		bodyModel[450] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 582
		bodyModel[451] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 583
		bodyModel[452] = new ModelRendererTurbo(this, 472, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[453] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[454] = new ModelRendererTurbo(this, 463, 72, textureX, textureY); // Box 590 cs2
		bodyModel[455] = new ModelRendererTurbo(this, 75, 242, textureX, textureY); // Box 448
		bodyModel[456] = new ModelRendererTurbo(this, 81, 218, textureX, textureY); // Box 323
		bodyModel[457] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 280
		bodyModel[458] = new ModelRendererTurbo(this, 84, 206, textureX, textureY); // Box 285
		bodyModel[459] = new ModelRendererTurbo(this, 220, 206, textureX, textureY); // Box 517
		bodyModel[460] = new ModelRendererTurbo(this, 217, 218, textureX, textureY); // Box 518
		bodyModel[461] = new ModelRendererTurbo(this, 211, 242, textureX, textureY); // Box 519
		bodyModel[462] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 520
		bodyModel[463] = new ModelRendererTurbo(this, 266, 15, textureX, textureY); // Box 404
		bodyModel[464] = new ModelRendererTurbo(this, 262, 10, textureX, textureY); // Box 405
		bodyModel[465] = new ModelRendererTurbo(this, 47, 95, textureX, textureY, "cull"); // Box 470 Nose bell hang cull
		bodyModel[466] = new ModelRendererTurbo(this, 441, 148, textureX, textureY, "cull"); // Box 517 rear bell hang cull
		bodyModel[467] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[468] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[469] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[470] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[471] = new ModelRendererTurbo(this, 355, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[472] = new ModelRendererTurbo(this, 403, 131, textureX, textureY); // Box 43
		bodyModel[473] = new ModelRendererTurbo(this, 402, 129, textureX, textureY); // Box 355 brakewheel
		bodyModel[474] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[475] = new ModelRendererTurbo(this, 355, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[476] = new ModelRendererTurbo(this, 354, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[477] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[478] = new ModelRendererTurbo(this, 361, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[479] = new ModelRendererTurbo(this, 342, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[480] = new ModelRendererTurbo(this, 335, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[481] = new ModelRendererTurbo(this, 318, 46, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[482] = new ModelRendererTurbo(this, 318, 39, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[483] = new ModelRendererTurbo(this, 318, 30, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[484] = new ModelRendererTurbo(this, 318, 23, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[485] = new ModelRendererTurbo(this, 479, 41, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[486] = new ModelRendererTurbo(this, 479, 25, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[487] = new ModelRendererTurbo(this, 479, 22, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[488] = new ModelRendererTurbo(this, 479, 38, textureX, textureY); // Box 81 GMD Handrails
		bodyModel[489] = new ModelRendererTurbo(this, 472, 21, textureX, textureY); // Box 346 GMD handrails
		bodyModel[490] = new ModelRendererTurbo(this, 472, 37, textureX, textureY); // Box 346 GMD handrails
		bodyModel[491] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 621 low ditchlight f
		bodyModel[492] = new ModelRendererTurbo(this, 1, 147, textureX, textureY); // Box 622 cull
		bodyModel[493] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 623 low ditchlight f
		bodyModel[494] = new ModelRendererTurbo(this, 1, 147, textureX, textureY); // Box 624 cull
		bodyModel[495] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 625 low ditchlight r
		bodyModel[496] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 626 low ditchlight r
		bodyModel[497] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[498] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[499] = new ModelRendererTurbo(this, 202, 72, textureX, textureY); // Box 631

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

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[129].setRotationPoint(-35.25F, -18F, -1F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[130].setRotationPoint(-34.5F, -18F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[131].setRotationPoint(-35.25F, -16F, -1F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[132].setRotationPoint(-34.5F, -16F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 265
		bodyModel[133].setRotationPoint(-34.5F, -14F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 3
		bodyModel[134].setRotationPoint(-35.25F, -14F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 151 headlight front 4
		bodyModel[135].setRotationPoint(-35.25F, -12F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 393
		bodyModel[136].setRotationPoint(-34.5F, -12F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[137].setRotationPoint(-32F, -1F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[138].setRotationPoint(-32F, -1F, 5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[139].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[140].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[141].setRotationPoint(32F, -19F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[142].setRotationPoint(32F, -19F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[143].setRotationPoint(32F, -19F, 1F);

		bodyModel[144].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[144].setRotationPoint(-10F, -19F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[145].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[145].rotateAngleY = -1.11701072F;

		bodyModel[146].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[146].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[146].rotateAngleY = -1.11701072F;

		bodyModel[147].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[147].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[148].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[149].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[150].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[151].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[152].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[153].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[154].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[155].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[156].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[157].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[158].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[159].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[160].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[161].setRotationPoint(3.5F, -21F, -1.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[162].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[163].setRotationPoint(3.5F, -23F, -1.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[164].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[165].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[166].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 big fan
		bodyModel[167].setRotationPoint(-8F, -20F, -3.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 farr filter
		bodyModel[168].setRotationPoint(1F, -21F, -7.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[169].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[170].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[171].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 big fan
		bodyModel[172].setRotationPoint(23F, -20F, -3.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[173].setRotationPoint(-32F, -19.5F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 13, 2, 8, 0F); // Box 196 winterization hatch EXTRA THICC
		bodyModel[174].setRotationPoint(18F, -21F, -4F);

		bodyModel[175].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch tall
		bodyModel[175].setRotationPoint(18F, -22F, -3F);

		bodyModel[176].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 196 winterization hatch smol
		bodyModel[176].setRotationPoint(18F, -21F, -3F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[177].setRotationPoint(19.5F, -24F, -1F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[178].setRotationPoint(18F, -24F, 0F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[179].setRotationPoint(19.5F, -23F, -0.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 236
		bodyModel[180].setRotationPoint(30F, -21F, 5F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		bodyModel[181].setRotationPoint(30.25F, -20F, 5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 457
		bodyModel[182].setRotationPoint(32F, -18F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[183].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[184].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[184].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[185].setRotationPoint(-5F, -12F, -11.02F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[186].setRotationPoint(-10F, -12F, -11.02F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[187].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[188].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[189].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[189].setRotationPoint(-10F, -4F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[190].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[191].setRotationPoint(-10F, -4F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[192].setRotationPoint(-8F, -4F, -11.01F);

		bodyModel[193].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 363
		bodyModel[193].setRotationPoint(-10F, -4F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[194].setRotationPoint(-4F, -4F, 11.01F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[195].setRotationPoint(-10F, -4F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[196].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[197].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[197].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[198].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 503
		bodyModel[198].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 314
		bodyModel[199].setRotationPoint(-5F, -12F, 11.02F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 314
		bodyModel[200].setRotationPoint(-10F, -12F, 11.02F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[201].setRotationPoint(34.75F, -18F, -1F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[202].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 221 headlight rear 3
		bodyModel[203].setRotationPoint(34.75F, -14F, -1F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[204].setRotationPoint(34.5F, -16F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[205].setRotationPoint(34.75F, -16F, -1F);

		bodyModel[206].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[206].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[206].rotateAngleY = -0.46687557F;

		bodyModel[207].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[207].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[207].rotateAngleY = 0.46687557F;

		bodyModel[208].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 312
		bodyModel[208].setRotationPoint(34.5F, -14F, -1F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 488
		bodyModel[209].setRotationPoint(34.5F, -12F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 489 headlight rear 4
		bodyModel[210].setRotationPoint(34.75F, -12F, -1F);

		bodyModel[211].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[211].setRotationPoint(1F, -21.5F, -7F);

		bodyModel[212].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[212].setRotationPoint(1F, -21.5F, 5F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[213].setRotationPoint(0.989999999999998F, -21F, -6.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[214].setRotationPoint(0.989999999999998F, -21F, 5.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[215].setRotationPoint(20.01F, -21F, 5.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[216].setRotationPoint(20.01F, -21F, -6.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 246
		bodyModel[217].setRotationPoint(-32F, -21F, -6F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 247
		bodyModel[218].setRotationPoint(-30.25F, -20F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[219].setRotationPoint(0.5F, -17.5F, 7.7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[220].setRotationPoint(0.5F, -18.5F, 7.7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[221].setRotationPoint(0.75F, -17F, 7.95F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[222].setRotationPoint(0.5F, -19.5F, 6.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233 some other steam gen thing
		bodyModel[223].setRotationPoint(-25.5F, -20F, -3F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[224].setRotationPoint(-31F, -20F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235 steam gen exhaust
		bodyModel[225].setRotationPoint(-30.5F, -22F, 3.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236 steam gen exhaust
		bodyModel[226].setRotationPoint(-30.5F, -24F, 3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[227].setRotationPoint(-31F, -20F, -6F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235 steam gen exhaust
		bodyModel[228].setRotationPoint(-30.5F, -22F, -5.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236 steam gen exhaust
		bodyModel[229].setRotationPoint(-30.5F, -24F, -5.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 259
		bodyModel[230].setRotationPoint(-30F, -21F, -2F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 286 antenna plate cull
		bodyModel[231].setRotationPoint(-18F, -21.75F, -2.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 287
		bodyModel[232].setRotationPoint(-17F, -23.75F, -0.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[233].setRotationPoint(-17.5F, -22.75F, 0.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[234].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[235].setRotationPoint(-9F, -17.5F, -7.05F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[236].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 584
		bodyModel[237].setRotationPoint(-9F, -17.5F, 6.05F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[238].setRotationPoint(-29.5F, -6.5F, -7F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[239].setRotationPoint(-29F, -4.5F, -7F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[240].setRotationPoint(-33.5F, -7F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[241].setRotationPoint(-33.5F, -3F, -11.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[242].setRotationPoint(-31F, -7F, -11.02F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[243].setRotationPoint(-33.5F, -7F, -11.01F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 342
		bodyModel[244].setRotationPoint(-32.5F, -6F, -11.01F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[245].setRotationPoint(-31F, -7F, 11.02F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 344
		bodyModel[246].setRotationPoint(-32.5F, -6F, 11.01F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[247].setRotationPoint(-33.5F, -7F, 11.01F);

		bodyModel[248].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 346
		bodyModel[248].setRotationPoint(-33.5F, -7F, 9.01F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 347
		bodyModel[249].setRotationPoint(-33.5F, -3F, 10.51F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[250].setRotationPoint(-11.5F, 3F, -10.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[251].setRotationPoint(-11.5F, 2F, -10.25F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[252].setRotationPoint(-11.25F, 3.5F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 19 front fuel fill
		bodyModel[253].setRotationPoint(-10F, 3F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 19 front fuel fill
		bodyModel[254].setRotationPoint(-10F, 3F, 6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[255].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[256].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[257].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[258].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[259].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[260].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[261].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[262].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[263].setRotationPoint(-37F, -5F, -4.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[264].setRotationPoint(-37.25F, -5F, -4.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[265].setRotationPoint(-37.25F, -3F, -4.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[266].setRotationPoint(-37F, -5F, 2.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[267].setRotationPoint(-37.25F, -5F, 2.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[268].setRotationPoint(-37.25F, -3F, 2.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[269].setRotationPoint(37F, -5F, -4.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[270].setRotationPoint(37.25F, -5F, -4.75F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[271].setRotationPoint(37.25F, -3F, -4.75F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[272].setRotationPoint(37F, -5F, 2.75F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[273].setRotationPoint(37.25F, -5F, 2.75F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[274].setRotationPoint(37.25F, -3F, 2.75F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[275].setRotationPoint(-17F, -22.75F, -1.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[276].setRotationPoint(-17F, -23.75F, -1.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[277].setRotationPoint(-12F, -20.75F, -0.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[278].setRotationPoint(-12F, -21.75F, -0.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[279].setRotationPoint(-29F, -20F, -0.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[280].setRotationPoint(-29F, -21F, -0.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[281].setRotationPoint(-20.5F, -20F, 7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[282].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[283].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[284].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[285].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 356 support cull
		bodyModel[286].setRotationPoint(-21F, -19F, 7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[287].setRotationPoint(37F, -1F, -4.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[288].setRotationPoint(37F, -1F, 2.75F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394
		bodyModel[289].setRotationPoint(37.25F, -1F, -4.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395
		bodyModel[290].setRotationPoint(37.25F, -1F, 2.75F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[291].setRotationPoint(-37F, -1F, -4.75F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[292].setRotationPoint(-37F, -1F, 2.75F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398
		bodyModel[293].setRotationPoint(-37.25F, -1F, -4.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399
		bodyModel[294].setRotationPoint(-37.25F, -1F, 2.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[295].setRotationPoint(-37F, -2F, 3.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[296].setRotationPoint(-37F, -2F, -5.75F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[297].setRotationPoint(-37.25F, -2F, 3.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[298].setRotationPoint(-37.25F, -2F, -5.75F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[299].setRotationPoint(37F, -2F, -5.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[300].setRotationPoint(37.25F, -2F, -5.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[301].setRotationPoint(37.25F, -2F, 3.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[302].setRotationPoint(37F, -2F, 3.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[303].setRotationPoint(-23.5F, -20F, 5.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[304].setRotationPoint(-23.5F, -21F, 5.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[305].setRotationPoint(-23.5F, -20F, -6.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[306].setRotationPoint(-23.5F, -21F, -6.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[307].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[308].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[309].setRotationPoint(-41F, 7F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[310].setRotationPoint(-41F, 7F, -10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[311].setRotationPoint(-40F, 6F, 0F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[312].setRotationPoint(-40F, 6F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[313].setRotationPoint(41F, 7F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[314].setRotationPoint(41F, 7F, -10F);

		bodyModel[315].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[315].setRotationPoint(41F, 6F, -10F);

		bodyModel[316].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[316].setRotationPoint(41F, 6F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[317].setRotationPoint(-40F, 6F, 0F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[318].setRotationPoint(-40F, 6F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[319].setRotationPoint(-40F, 5F, 0F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[320].setRotationPoint(-40F, 5F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[321].setRotationPoint(40F, 6F, -10F);

		bodyModel[322].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[322].setRotationPoint(41F, 5F, 0F);

		bodyModel[323].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[323].setRotationPoint(41F, 5F, -10F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 211 wp large headlight
		bodyModel[324].setRotationPoint(34F, -18F, -1.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 213 wp large headlight
		bodyModel[325].setRotationPoint(-36F, -18F, -1.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 headlight front 1 gyra
		bodyModel[326].setRotationPoint(-36.25F, -18F, -1F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 219
		bodyModel[327].setRotationPoint(-35.5F, -18F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 headlight front 2 gyra
		bodyModel[328].setRotationPoint(-36.25F, -16F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 312 emergency gyralight front mount
		bodyModel[329].setRotationPoint(-35.5F, -20F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 emergency gyralight front
		bodyModel[330].setRotationPoint(-36.25F, -20F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 224 headlight rear 1 gyra
		bodyModel[331].setRotationPoint(35.75F, -18F, -1F);

		bodyModel[332].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 225
		bodyModel[332].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 226 headlight rear 2 gyra
		bodyModel[333].setRotationPoint(35.75F, -16F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 306 emergency gyralight rear mount
		bodyModel[334].setRotationPoint(34.5F, -20F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 308 emergency gyralight rear
		bodyModel[335].setRotationPoint(35.75F, -20F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[336].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[337].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[338].setRotationPoint(-35.75F, -18F, -1F);
		bodyModel[338].rotateAngleX = 1.57079633F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam front
		bodyModel[339].setRotationPoint(-36.5F, -20F, -1F);
		bodyModel[339].rotateAngleX = 1.57079633F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam front
		bodyModel[340].setRotationPoint(-36.5F, -18F, -1F);
		bodyModel[340].rotateAngleX = 1.57079633F;

		bodyModel[341].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[341].setRotationPoint(34.75F, -18F, -1F);
		bodyModel[341].rotateAngleX = 1.57079633F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam rear
		bodyModel[342].setRotationPoint(36.5F, -20F, -1F);
		bodyModel[342].rotateAngleX = 1.57079633F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam rear
		bodyModel[343].setRotationPoint(36.5F, -18F, -1F);
		bodyModel[343].rotateAngleX = 1.57079633F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 452 rear fuel fill
		bodyModel[344].setRotationPoint(4F, 3F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 452 rear fuel fill
		bodyModel[345].setRotationPoint(4F, 3F, 6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 455
		bodyModel[346].setRotationPoint(4F, 5F, -6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[347].setRotationPoint(5F, 4F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 457
		bodyModel[348].setRotationPoint(1F, 4F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 458
		bodyModel[349].setRotationPoint(1F, 4F, 11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[350].setRotationPoint(5F, 4F, 11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[351].setRotationPoint(-8F, 4F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[352].setRotationPoint(-8F, 4F, 11F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 462
		bodyModel[353].setRotationPoint(-22F, -21.75F, 0F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[354].setRotationPoint(10F, -22F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[355].setRotationPoint(10F, -21F, -1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[356].setRotationPoint(10.25F, -20.5F, -0.75F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 bell holder cull
		bodyModel[357].setRotationPoint(10F, -22F, -2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[358].setRotationPoint(-35.5F, -19.5F, -0.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[359].setRotationPoint(-35.5F, -20.5F, -0.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[360].setRotationPoint(-35.25F, -19F, -0.25F);

		bodyModel[361].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[361].setRotationPoint(-40F, 9F, -10F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 456 cull
		bodyModel[362].setRotationPoint(-38F, 7F, -10F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 475
		bodyModel[363].setRotationPoint(38F, 9F, -10F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 476 cull
		bodyModel[364].setRotationPoint(38F, 7F, -10F);

		bodyModel[365].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 480
		bodyModel[365].setRotationPoint(-37F, 5.25F, -7.25F);

		bodyModel[366].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 481
		bodyModel[366].setRotationPoint(-37F, 6.25F, -10.25F);

		bodyModel[367].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 482
		bodyModel[367].setRotationPoint(-37F, 3.5F, -6.5F);

		bodyModel[368].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 483
		bodyModel[368].setRotationPoint(-37F, 4.5F, -9.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 484
		bodyModel[369].setRotationPoint(-37F, 2.75F, -9F);

		bodyModel[370].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 485
		bodyModel[370].setRotationPoint(-37F, 1.75F, -6F);

		bodyModel[371].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[371].setRotationPoint(-37F, 2F, 7F);

		bodyModel[372].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[372].setRotationPoint(-37F, 2F, -7F);

		bodyModel[373].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 496
		bodyModel[373].setRotationPoint(-37F, 6.25F, 7.25F);

		bodyModel[374].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 497
		bodyModel[374].setRotationPoint(-37F, 5.25F, 7.25F);

		bodyModel[375].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 498
		bodyModel[375].setRotationPoint(-37F, 4.5F, 6.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 499
		bodyModel[376].setRotationPoint(-37F, 3.5F, 6.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 500
		bodyModel[377].setRotationPoint(-37F, 2.75F, 6F);

		bodyModel[378].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 501
		bodyModel[378].setRotationPoint(-37F, 1.75F, 6F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 514
		bodyModel[379].setRotationPoint(35.5F, -19.5F, -0.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[380].setRotationPoint(35.5F, -20.5F, -0.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 516
		bodyModel[381].setRotationPoint(35.25F, -19F, -0.25F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[382].setRotationPoint(-29F, -20F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[383].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[384].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[385].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[386].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[387].setRotationPoint(-26F, -10F, 9F);
		bodyModel[387].rotateAngleY = -1.57079633F;

		bodyModel[388].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[388].setRotationPoint(-19F, -21.75F, -2F);

		bodyModel[389].addBox(0F, 0F, 2F, 3, 1, 0, 0F); // Box 262
		bodyModel[389].setRotationPoint(-17F, -20.75F, -2F);

		bodyModel[390].addBox(0F, 0F, 0F, 63, 4, 0, 0F); // Box 293 prr trainphoje
		bodyModel[390].setRotationPoint(-31F, -23F, 6F);

		bodyModel[391].addBox(0F, 0F, 0F, 0, 24, 2, 0F); // Box 520 prr bullshit
		bodyModel[391].setRotationPoint(32F, -23F, 6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 521 prr shiot
		bodyModel[392].setRotationPoint(-27.5F, -22F, -3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522 pee are are
		bodyModel[393].setRotationPoint(-26F, -21F, -2.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[394].setRotationPoint(-17F, -20.75F, -1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[395].setRotationPoint(-17F, -21.25F, -1F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[396].setRotationPoint(-17F, -21.25F, -1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[397].setRotationPoint(-17F, -21.25F, -1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[398].setRotationPoint(-17F, -21.25F, -1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[399].setRotationPoint(-28F, -22F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[400].setRotationPoint(-28F, -21F, -1F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[401].setRotationPoint(-27.75F, -20.5F, -0.75F);

		bodyModel[402].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 bell holder cull
		bodyModel[402].setRotationPoint(-28F, -22F, -2F);

		bodyModel[403].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[403].setRotationPoint(15.5F, -21.5F, -1F);

		bodyModel[404].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[404].setRotationPoint(3.5F, -21.5F, -1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 15, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 559
		bodyModel[405].setRotationPoint(-12F, -19F, -7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[406].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[407].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[408].setRotationPoint(40F, 6F, 0F);

		bodyModel[409].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[409].setRotationPoint(34F, 5F, -10F);

		bodyModel[410].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[410].setRotationPoint(34F, 7F, -8F);

		bodyModel[411].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[411].setRotationPoint(34F, 8F, -11F);

		bodyModel[412].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[412].setRotationPoint(34F, 4F, -7F);

		bodyModel[413].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[413].setRotationPoint(34F, 2F, -7F);

		bodyModel[414].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[414].setRotationPoint(34F, 3F, -9F);

		bodyModel[415].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[415].setRotationPoint(34F, 1F, -8F);

		bodyModel[416].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[416].setRotationPoint(34F, 7F, 8F);

		bodyModel[417].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[417].setRotationPoint(34F, 8F, 8F);

		bodyModel[418].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[418].setRotationPoint(34F, 5F, 7F);

		bodyModel[419].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[419].setRotationPoint(34F, 4F, 7F);

		bodyModel[420].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[420].setRotationPoint(34F, 3F, 7F);

		bodyModel[421].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[421].setRotationPoint(34F, 2F, 7F);

		bodyModel[422].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[422].setRotationPoint(34F, 1F, 6F);

		bodyModel[423].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 569
		bodyModel[423].setRotationPoint(34F, 4.5F, -9.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 570
		bodyModel[424].setRotationPoint(34F, 5.25F, -7.25F);

		bodyModel[425].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 571
		bodyModel[425].setRotationPoint(34F, 6.25F, -10.25F);

		bodyModel[426].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 572
		bodyModel[426].setRotationPoint(34F, 3.5F, -6.5F);

		bodyModel[427].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 573
		bodyModel[427].setRotationPoint(34F, 2.75F, -9F);

		bodyModel[428].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 574
		bodyModel[428].setRotationPoint(34F, 1.75F, -6F);

		bodyModel[429].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 575
		bodyModel[429].setRotationPoint(34F, 1.75F, 6F);

		bodyModel[430].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 576
		bodyModel[430].setRotationPoint(34F, 2.75F, 6F);

		bodyModel[431].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 577
		bodyModel[431].setRotationPoint(34F, 3.5F, 6.5F);

		bodyModel[432].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 578
		bodyModel[432].setRotationPoint(34F, 4.5F, 6.5F);

		bodyModel[433].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 579
		bodyModel[433].setRotationPoint(34F, 5.25F, 7.25F);

		bodyModel[434].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 580
		bodyModel[434].setRotationPoint(34F, 6.25F, 7.25F);

		bodyModel[435].addBox(0F, 0F, 0F, 7, 2, 9, 0F); // Box 581
		bodyModel[435].setRotationPoint(4F, 3F, -4.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 582
		bodyModel[436].setRotationPoint(-10F, 5F, -6F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[437].setRotationPoint(-32F, -18F, -6.51F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[438].setRotationPoint(-32F, -18F, 6.51F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[439].setRotationPoint(32F, -18F, -6.51F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[440].setRotationPoint(32F, -18F, 6.51F);

		bodyModel[441].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 565
		bodyModel[441].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[442].setRotationPoint(-36.25F, -17.75F, -1.25F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170 headlight rear big
		bodyModel[443].setRotationPoint(36.75F, -17.75F, -1.25F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114 fuck you
		bodyModel[444].setRotationPoint(-34F, -12F, -1F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 202 fuck you
		bodyModel[445].setRotationPoint(-33F, -11.7F, -1F);

		bodyModel[446].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 578
		bodyModel[446].setRotationPoint(0.989999999999998F, -21F, -4.25F);

		bodyModel[447].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 579
		bodyModel[447].setRotationPoint(1F, -21.5F, -4.75F);

		bodyModel[448].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 580
		bodyModel[448].setRotationPoint(20.01F, -21F, -4.25F);

		bodyModel[449].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 581
		bodyModel[449].setRotationPoint(1F, -21.5F, 2.75F);

		bodyModel[450].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 582
		bodyModel[450].setRotationPoint(0.989999999999998F, -21F, 3.25F);

		bodyModel[451].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 583
		bodyModel[451].setRotationPoint(20.01F, -21F, 3.25F);

		bodyModel[452].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[452].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[453].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[454].addBox(5F, 0F, -5F, 3, 8, 3, 0F); // Box 590 cs2
		bodyModel[454].setRotationPoint(-22.1F, -12F, 4F);
		bodyModel[454].rotateAngleY = -0.78539816F;

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[455].setRotationPoint(-40F, 5F, 2F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[456].setRotationPoint(-40F, 5F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[457].setRotationPoint(-40F, 4F, 2F);

		bodyModel[458].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[458].setRotationPoint(-40F, 4F, -8F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[459].setRotationPoint(40F, 4F, 2F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[460].setRotationPoint(40F, 5F, 2F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[461].setRotationPoint(40F, 5F, -10F);

		bodyModel[462].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[462].setRotationPoint(40F, 4F, -8F);

		bodyModel[463].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404
		bodyModel[463].setRotationPoint(-25F, -23F, -4F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[464].setRotationPoint(-26.5F, -21F, -6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470 Nose bell hang cull
		bodyModel[465].setRotationPoint(-36F, -20.5F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 517 rear bell hang cull
		bodyModel[466].setRotationPoint(35F, -20.5F, -1F);

		bodyModel[467].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[467].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[468].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[468].setRotationPoint(7.5F, -23F, -1.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[469].setRotationPoint(11.5F, -21F, -1.5F);

		bodyModel[470].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[470].setRotationPoint(11.5F, -23F, -1.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[471].setRotationPoint(1F, -21F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[472].setRotationPoint(33.65F, -5F, 3.6F);
		bodyModel[472].rotateAngleY = 0.45378561F;

		bodyModel[473].addShapeBox(1F, -1.25F, -1.25F, 0, 5, 5, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 355 brakewheel
		bodyModel[473].setRotationPoint(34F, -5.75F, 2.95F);
		bodyModel[473].rotateAngleY = 0.45378561F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[474].setRotationPoint(1F, -21F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[475].setRotationPoint(1F, -19F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[476].setRotationPoint(-0.5F, -18F, -9F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[477].setRotationPoint(1F, -19F, 7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[478].setRotationPoint(3F, -18F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[479].setRotationPoint(-0.5F, -18F, 7F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[480].setRotationPoint(3F, -18F, 7F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81 GMD Handrails
		bodyModel[481].setRotationPoint(-33.5F, -6F, -11.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-2.5F, -1.5F, 2F, 2.5F, -1.5F, 2F, 2.5F, 0F, -3F, -2.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[482].setRotationPoint(-33.5F, -12F, -9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81 GMD Handrails
		bodyModel[483].setRotationPoint(-33.5F, -6F, 10.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-2.5F, 0F, -3F, 2.5F, 0F, -3F, 2.5F, -1.5F, 2F, -2.5F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[484].setRotationPoint(-33.5F, -12F, 8F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81 GMD Handrails
		bodyModel[485].setRotationPoint(34.5F, -6F, -11.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81 GMD Handrails
		bodyModel[486].setRotationPoint(34.5F, -6F, 10.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[487].setRotationPoint(34.5F, -7F, 9.01F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81 GMD Handrails
		bodyModel[488].setRotationPoint(34.5F, -7F, -11.01F);

		bodyModel[489].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 346 GMD handrails
		bodyModel[489].setRotationPoint(34.5F, -7F, -11F);

		bodyModel[490].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 346 GMD handrails
		bodyModel[490].setRotationPoint(34.5F, -7F, 8.01F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[491].setRotationPoint(-37.75F, 1F, -6.75F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[492].setRotationPoint(-37.5F, 1F, -6.75F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[493].setRotationPoint(-37.75F, 1F, 4.75F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[494].setRotationPoint(-37.5F, 1F, 4.75F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[495].setRotationPoint(37.75F, 1F, -6.75F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[496].setRotationPoint(37.75F, 1F, 4.75F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[497].setRotationPoint(37.5F, 1F, 4.75F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[498].setRotationPoint(37.5F, 1F, -6.75F);

		bodyModel[499].addBox(0F, 0F, 0F, 12, 15, 1, 0F); // Box 631
		bodyModel[499].setRotationPoint(-22F, -19F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 229, 72, textureX, textureY); // Box 632
		bodyModel[501] = new ModelRendererTurbo(this, 203, 56, textureX, textureY); // Box 308
		bodyModel[502] = new ModelRendererTurbo(this, 373, 53, textureX, textureY); // Box 634
		bodyModel[503] = new ModelRendererTurbo(this, 373, 62, textureX, textureY); // Box 635
		bodyModel[504] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 635 locomotive plate
		bodyModel[505] = new ModelRendererTurbo(this, 194, 167, textureX, textureY); // Box 636 locomotive plate
		bodyModel[506] = new ModelRendererTurbo(this, 39, 120, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[507] = new ModelRendererTurbo(this, 419, 160, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[508] = new ModelRendererTurbo(this, 20, 94, textureX, textureY); // Box 631 mount
		bodyModel[509] = new ModelRendererTurbo(this, 445, 142, textureX, textureY); // Box 632 mount

		bodyModel[500].addBox(0F, 0F, 0F, 12, 15, 1, 0F); // Box 632
		bodyModel[500].setRotationPoint(-22F, -19F, 6F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 12, 1, 13, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[501].setRotationPoint(-22F, -20F, -6.5F);

		bodyModel[502].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 634
		bodyModel[502].setRotationPoint(-22F, -12F, -11.01F);

		bodyModel[503].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 635
		bodyModel[503].setRotationPoint(-22F, -12F, 11.01F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 635 locomotive plate
		bodyModel[504].setRotationPoint(-32F, -2F, -11.02F);

		bodyModel[505].addShapeBox(-2F, 0F, 0F, 4, 6, 0, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 0F, 0F, -3.125F, 0F); // Box 636 locomotive plate
		bodyModel[505].setRotationPoint(-32F, -2F, 11.02F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[506].setRotationPoint(-35F, -18F, -1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[507].setRotationPoint(35F, -18F, -1F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 631 mount
		bodyModel[508].setRotationPoint(-33.75F, -19F, -1F);
		bodyModel[508].rotateAngleX = 1.57079633F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 632 mount
		bodyModel[509].setRotationPoint(32.75F, -19F, -1F);
		bodyModel[509].rotateAngleX = 1.57079633F;
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15||GetColor(entity) == 2324
				||GetColor(entity) == 25234) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 4332 ||GetColor(entity) == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 235){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
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
		}
	}
}