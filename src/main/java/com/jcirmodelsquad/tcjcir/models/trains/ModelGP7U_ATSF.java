//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 13:36:20
// Last changed on: 21.08.2020 - 13:36:20

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

public class ModelGP7U_ATSF extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7U_ATSF() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[405];

		initbodyModel_1();

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
		bodyModel[41] = new ModelRendererTurbo(this, 263, 212, textureX, textureY); // Box 805
		bodyModel[42] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 498
		bodyModel[48] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 430
		bodyModel[49] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 431
		bodyModel[50] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 432
		bodyModel[51] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 433
		bodyModel[52] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 355, 240, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 361, 228, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 361, 216, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 361, 221, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 257, 200, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[61] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[63] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[67] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[68] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[69] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[70] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[72] = new ModelRendererTurbo(this, 261, 191, textureX, textureY); // Box 490
		bodyModel[73] = new ModelRendererTurbo(this, 270, 194, textureX, textureY); // Box 329
		bodyModel[74] = new ModelRendererTurbo(this, 268, 191, textureX, textureY); // Box 330
		bodyModel[75] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 331
		bodyModel[76] = new ModelRendererTurbo(this, 434, 250, textureX, textureY); // Box 332
		bodyModel[77] = new ModelRendererTurbo(this, 49, 228, textureX, textureY); // Box 334
		bodyModel[78] = new ModelRendererTurbo(this, 5, 228, textureX, textureY); // Box 335
		bodyModel[79] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 336
		bodyModel[80] = new ModelRendererTurbo(this, 141, 228, textureX, textureY); // Box 337
		bodyModel[81] = new ModelRendererTurbo(this, 315, 194, textureX, textureY); // Box 338
		bodyModel[82] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 339
		bodyModel[83] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 340
		bodyModel[84] = new ModelRendererTurbo(this, 270, 186, textureX, textureY); // Box 341
		bodyModel[85] = new ModelRendererTurbo(this, 268, 183, textureX, textureY); // Box 342
		bodyModel[86] = new ModelRendererTurbo(this, 261, 183, textureX, textureY); // Box 343
		bodyModel[87] = new ModelRendererTurbo(this, 315, 186, textureX, textureY); // Box 344
		bodyModel[88] = new ModelRendererTurbo(this, 315, 183, textureX, textureY); // Box 345
		bodyModel[89] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 346
		bodyModel[90] = new ModelRendererTurbo(this, 239, 140, textureX, textureY); // Box 344
		bodyModel[91] = new ModelRendererTurbo(this, 218, 157, textureX, textureY); // Box 345 gp16 cutback frontbit
		bodyModel[92] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 346 gp16 cutback frontbit
		bodyModel[93] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 131
		bodyModel[94] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 132
		bodyModel[95] = new ModelRendererTurbo(this, 343, 40, textureX, textureY); // Box 133
		bodyModel[96] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[97] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 135
		bodyModel[98] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[99] = new ModelRendererTurbo(this, 199, 161, textureX, textureY); // Box 139
		bodyModel[100] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 140
		bodyModel[101] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 141
		bodyModel[102] = new ModelRendererTurbo(this, 199, 149, textureX, textureY); // Box 142
		bodyModel[103] = new ModelRendererTurbo(this, 103, 120, textureX, textureY); // Box 216
		bodyModel[104] = new ModelRendererTurbo(this, 73, 120, textureX, textureY); // Box 217
		bodyModel[105] = new ModelRendererTurbo(this, 92, 124, textureX, textureY); // Box 218
		bodyModel[106] = new ModelRendererTurbo(this, 130, 112, textureX, textureY); // Box 215
		bodyModel[107] = new ModelRendererTurbo(this, 192, 112, textureX, textureY); // Box 367
		bodyModel[108] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 368
		bodyModel[109] = new ModelRendererTurbo(this, 160, 116, textureX, textureY); // Box 369 gp16 brake cover
		bodyModel[110] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 370
		bodyModel[111] = new ModelRendererTurbo(this, 205, 157, textureX, textureY); // Box 374
		bodyModel[112] = new ModelRendererTurbo(this, 167, 119, textureX, textureY); // Box 375
		bodyModel[113] = new ModelRendererTurbo(this, 39, 142, textureX, textureY, "lamp"); // Box 149 headlight front nose
		bodyModel[114] = new ModelRendererTurbo(this, 32, 142, textureX, textureY, "lamp"); // Box 149 headlight front nose
		bodyModel[115] = new ModelRendererTurbo(this, 188, 160, textureX, textureY); // Box 137
		bodyModel[116] = new ModelRendererTurbo(this, 188, 148, textureX, textureY); // Box 138
		bodyModel[117] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[118] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[119] = new ModelRendererTurbo(this, 308, 88, textureX, textureY); // Box 9
		bodyModel[120] = new ModelRendererTurbo(this, 235, 88, textureX, textureY); // Box 10
		bodyModel[121] = new ModelRendererTurbo(this, 185, 71, textureX, textureY); // Box 15
		bodyModel[122] = new ModelRendererTurbo(this, 258, 71, textureX, textureY); // Box 21
		bodyModel[123] = new ModelRendererTurbo(this, 297, 85, textureX, textureY); // Box 314 door swing right
		bodyModel[124] = new ModelRendererTurbo(this, 224, 85, textureX, textureY); // Box 315 door swing right
		bodyModel[125] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[126] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[127] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[128] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[129] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[130] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[131] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[132] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[133] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[134] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[135] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[136] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[137] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[138] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[139] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[140] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[141] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[142] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[143] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[144] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[145] = new ModelRendererTurbo(this, 314, 81, textureX, textureY); // Box 184
		bodyModel[146] = new ModelRendererTurbo(this, 325, 81, textureX, textureY); // Box 185
		bodyModel[147] = new ModelRendererTurbo(this, 314, 75, textureX, textureY); // Box 247 extra stack
		bodyModel[148] = new ModelRendererTurbo(this, 325, 75, textureX, textureY); // Box 248 extra stack
		bodyModel[149] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 389, 99, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 334, 53, textureX, textureY); // Box 196 farr filter
		bodyModel[152] = new ModelRendererTurbo(this, 437, 97, textureX, textureY); // Box 188
		bodyModel[153] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 189
		bodyModel[154] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[155] = new ModelRendererTurbo(this, 421, 67, textureX, textureY, "cull"); // Box 196 winterization hatch tall
		bodyModel[156] = new ModelRendererTurbo(this, 364, 15, textureX, textureY); // Box 239
		bodyModel[157] = new ModelRendererTurbo(this, 364, 12, textureX, textureY); // Box 240
		bodyModel[158] = new ModelRendererTurbo(this, 364, 18, textureX, textureY); // Box 241
		bodyModel[159] = new ModelRendererTurbo(this, 381, 126, textureX, textureY); // Box 457
		bodyModel[160] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[162] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[163] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Box 313
		bodyModel[164] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[165] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[166] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[167] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[168] = new ModelRendererTurbo(this, 308, 158, textureX, textureY); // Box 363
		bodyModel[169] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[170] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[171] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[172] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[173] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[174] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[175] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[176] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[177] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[178] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[179] = new ModelRendererTurbo(this, 351, 14, textureX, textureY); // Box 207
		bodyModel[180] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Box 208
		bodyModel[181] = new ModelRendererTurbo(this, 351, 11, textureX, textureY); // Box 209
		bodyModel[182] = new ModelRendererTurbo(this, 351, 20, textureX, textureY); // Box 210
		bodyModel[183] = new ModelRendererTurbo(this, 338, 4, textureX, textureY); // Box 361
		bodyModel[184] = new ModelRendererTurbo(this, 338, 10, textureX, textureY); // Box 362
		bodyModel[185] = new ModelRendererTurbo(this, 338, 1, textureX, textureY); // Box 363
		bodyModel[186] = new ModelRendererTurbo(this, 338, 7, textureX, textureY); // Box 364
		bodyModel[187] = new ModelRendererTurbo(this, 310, 28, textureX, textureY); // Box 114
		bodyModel[188] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 74
		bodyModel[189] = new ModelRendererTurbo(this, 310, 31, textureX, textureY); // Box 78
		bodyModel[190] = new ModelRendererTurbo(this, 309, 21, textureX, textureY); // Box 245
		bodyModel[191] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 372
		bodyModel[192] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[193] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 257
		bodyModel[194] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[195] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 584
		bodyModel[196] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[197] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[198] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[199] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[200] = new ModelRendererTurbo(this, 310, 242, textureX, textureY); // Box 19 front fuel fill
		bodyModel[201] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 188
		bodyModel[203] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[204] = new ModelRendererTurbo(this, 8, 142, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[205] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 239
		bodyModel[206] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[207] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[208] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 242
		bodyModel[209] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 409 commander base
		bodyModel[210] = new ModelRendererTurbo(this, 26, 73, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[211] = new ModelRendererTurbo(this, 26, 84, textureX, textureY); // Box 409 commander base
		bodyModel[212] = new ModelRendererTurbo(this, 26, 80, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[213] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 364 prime base
		bodyModel[214] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[215] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[216] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[217] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[218] = new ModelRendererTurbo(this, 444, 170, textureX, textureY); // Box 392
		bodyModel[219] = new ModelRendererTurbo(this, 444, 165, textureX, textureY); // Box 393
		bodyModel[220] = new ModelRendererTurbo(this, 451, 170, textureX, textureY); // Box 394
		bodyModel[221] = new ModelRendererTurbo(this, 451, 165, textureX, textureY); // Box 395
		bodyModel[222] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 396
		bodyModel[223] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 397
		bodyModel[224] = new ModelRendererTurbo(this, 8, 137, textureX, textureY); // Box 398
		bodyModel[225] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 399
		bodyModel[226] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 78
		bodyModel[227] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[228] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[229] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[230] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[231] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[232] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[233] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[234] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[235] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[236] = new ModelRendererTurbo(this, 62, 242, textureX, textureY); // Box 22
		bodyModel[237] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 23
		bodyModel[238] = new ModelRendererTurbo(this, 65, 230, textureX, textureY); // Box 24
		bodyModel[239] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Box 25
		bodyModel[240] = new ModelRendererTurbo(this, 221, 242, textureX, textureY); // Box 431
		bodyModel[241] = new ModelRendererTurbo(this, 198, 242, textureX, textureY); // Box 432
		bodyModel[242] = new ModelRendererTurbo(this, 201, 230, textureX, textureY); // Box 433
		bodyModel[243] = new ModelRendererTurbo(this, 224, 230, textureX, textureY); // Box 434
		bodyModel[244] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 4
		bodyModel[245] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 322
		bodyModel[246] = new ModelRendererTurbo(this, 71, 206, textureX, textureY); // Box 438
		bodyModel[247] = new ModelRendererTurbo(this, 94, 206, textureX, textureY); // Box 439
		bodyModel[248] = new ModelRendererTurbo(this, 204, 218, textureX, textureY); // Box 441
		bodyModel[249] = new ModelRendererTurbo(this, 230, 206, textureX, textureY); // Box 442
		bodyModel[250] = new ModelRendererTurbo(this, 207, 206, textureX, textureY); // Box 443
		bodyModel[251] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[252] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[253] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 336
		bodyModel[254] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam front
		bodyModel[255] = new ModelRendererTurbo(this, 39, 95, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam front
		bodyModel[256] = new ModelRendererTurbo(this, 444, 141, textureX, textureY); // Box 336
		bodyModel[257] = new ModelRendererTurbo(this, 464, 143, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam rear
		bodyModel[258] = new ModelRendererTurbo(this, 457, 143, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam rear
		bodyModel[259] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[260] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[261] = new ModelRendererTurbo(this, 283, 73, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[262] = new ModelRendererTurbo(this, 283, 62, textureX, textureY, "cull"); // Box 306 cull aww
		bodyModel[263] = new ModelRendererTurbo(this, 295, 218, textureX, textureY); // Box 455
		bodyModel[264] = new ModelRendererTurbo(this, 285, 186, textureX, textureY); // Box 456
		bodyModel[265] = new ModelRendererTurbo(this, 279, 186, textureX, textureY); // Box 457
		bodyModel[266] = new ModelRendererTurbo(this, 279, 195, textureX, textureY); // Box 458
		bodyModel[267] = new ModelRendererTurbo(this, 285, 195, textureX, textureY); // Box 459
		bodyModel[268] = new ModelRendererTurbo(this, 271, 189, textureX, textureY); // Box 460
		bodyModel[269] = new ModelRendererTurbo(this, 271, 197, textureX, textureY); // Box 461
		bodyModel[270] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 462
		bodyModel[271] = new ModelRendererTurbo(this, 7, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[272] = new ModelRendererTurbo(this, 143, 233, textureX, textureY, "cull"); // Box 476 cull
		bodyModel[273] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[274] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[275] = new ModelRendererTurbo(this, 130, 114, textureX, textureY); // Box 355
		bodyModel[276] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 347
		bodyModel[277] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 262
		bodyModel[278] = new ModelRendererTurbo(this, 466, 92, textureX, textureY); // Box 412 cs1
		bodyModel[279] = new ModelRendererTurbo(this, 477, 92, textureX, textureY); // Box 413 cs1
		bodyModel[280] = new ModelRendererTurbo(this, 469, 86, textureX, textureY); // Box 86 cs1
		bodyModel[281] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // Box 364 prime base
		bodyModel[282] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[283] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[284] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[285] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[286] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[287] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[288] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[289] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 554
		bodyModel[290] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[291] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[292] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[293] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[294] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[295] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[296] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[297] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[298] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[299] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[300] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[301] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[302] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[303] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[304] = new ModelRendererTurbo(this, 295, 237, textureX, textureY); // Box 582
		bodyModel[305] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[306] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[307] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 565
		bodyModel[308] = new ModelRendererTurbo(this, 472, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[309] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[310] = new ModelRendererTurbo(this, 493, 75, textureX, textureY, "lamp"); // Box 591 speedoooo
		bodyModel[311] = new ModelRendererTurbo(this, 75, 242, textureX, textureY); // Box 448
		bodyModel[312] = new ModelRendererTurbo(this, 81, 218, textureX, textureY); // Box 323
		bodyModel[313] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 280
		bodyModel[314] = new ModelRendererTurbo(this, 84, 206, textureX, textureY); // Box 285
		bodyModel[315] = new ModelRendererTurbo(this, 220, 206, textureX, textureY); // Box 517
		bodyModel[316] = new ModelRendererTurbo(this, 217, 218, textureX, textureY); // Box 518
		bodyModel[317] = new ModelRendererTurbo(this, 211, 242, textureX, textureY); // Box 519
		bodyModel[318] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 520
		bodyModel[319] = new ModelRendererTurbo(this, 264, 20, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[320] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 356
		bodyModel[321] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 278
		bodyModel[322] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 280
		bodyModel[323] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[324] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[325] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[326] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[327] = new ModelRendererTurbo(this, 355, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[328] = new ModelRendererTurbo(this, 403, 131, textureX, textureY); // Box 43
		bodyModel[329] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[330] = new ModelRendererTurbo(this, 355, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[331] = new ModelRendererTurbo(this, 354, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[332] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[333] = new ModelRendererTurbo(this, 361, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[334] = new ModelRendererTurbo(this, 342, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[335] = new ModelRendererTurbo(this, 335, 63, textureX, textureY); // Box 196 additional farr filter parts
		bodyModel[336] = new ModelRendererTurbo(this, 213, 57, textureX, textureY); // Box 68
		bodyModel[337] = new ModelRendererTurbo(this, 229, 50, textureX, textureY); // Box 69
		bodyModel[338] = new ModelRendererTurbo(this, 205, 64, textureX, textureY); // Box 74
		bodyModel[339] = new ModelRendererTurbo(this, 216, 61, textureX, textureY); // Box 75
		bodyModel[340] = new ModelRendererTurbo(this, 190, 61, textureX, textureY); // Box 76
		bodyModel[341] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[342] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[343] = new ModelRendererTurbo(this, 192, 39, textureX, textureY); // Box 332
		bodyModel[344] = new ModelRendererTurbo(this, 229, 77, textureX, textureY); // Box 67
		bodyModel[345] = new ModelRendererTurbo(this, 256, 39, textureX, textureY); // Box 333
		bodyModel[346] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[347] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[348] = new ModelRendererTurbo(this, 288, 27, textureX, textureY); // Box 184 o2 generator
		bodyModel[349] = new ModelRendererTurbo(this, 321, 58, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[350] = new ModelRendererTurbo(this, 321, 61, textureX, textureY); // Box 272
		bodyModel[351] = new ModelRendererTurbo(this, 321, 64, textureX, textureY); // Box 273
		bodyModel[352] = new ModelRendererTurbo(this, 316, 61, textureX, textureY); // Box 274
		bodyModel[353] = new ModelRendererTurbo(this, 325, 35, textureX, textureY); // Box 364 prime base
		bodyModel[354] = new ModelRendererTurbo(this, 325, 31, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[355] = new ModelRendererTurbo(this, 325, 31, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[356] = new ModelRendererTurbo(this, 325, 31, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[357] = new ModelRendererTurbo(this, 325, 31, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[358] = new ModelRendererTurbo(this, 321, 53, textureX, textureY); // Box 278
		bodyModel[359] = new ModelRendererTurbo(this, 321, 50, textureX, textureY); // Box 279
		bodyModel[360] = new ModelRendererTurbo(this, 321, 47, textureX, textureY); // Box 280
		bodyModel[361] = new ModelRendererTurbo(this, 316, 50, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[362] = new ModelRendererTurbo(this, 133, 16, textureX, textureY); // Box 285
		bodyModel[363] = new ModelRendererTurbo(this, 146, 16, textureX, textureY); // Box 286
		bodyModel[364] = new ModelRendererTurbo(this, 146, 8, textureX, textureY); // Box 287
		bodyModel[365] = new ModelRendererTurbo(this, 141, 10, textureX, textureY); // Box 288
		bodyModel[366] = new ModelRendererTurbo(this, 141, 5, textureX, textureY); // Box 289
		bodyModel[367] = new ModelRendererTurbo(this, 148, 4, textureX, textureY); // Box 290
		bodyModel[368] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 393
		bodyModel[369] = new ModelRendererTurbo(this, 164, 10, textureX, textureY); // Box 394
		bodyModel[370] = new ModelRendererTurbo(this, 162, 16, textureX, textureY); // Box 395
		bodyModel[371] = new ModelRendererTurbo(this, 175, 12, textureX, textureY); // Box 396
		bodyModel[372] = new ModelRendererTurbo(this, 175, 7, textureX, textureY); // Box 397
		bodyModel[373] = new ModelRendererTurbo(this, 166, 6, textureX, textureY); // Box 398
		bodyModel[374] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 659
		bodyModel[375] = new ModelRendererTurbo(this, 293, 11, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[376] = new ModelRendererTurbo(this, 292, 2, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[377] = new ModelRendererTurbo(this, 376, 222, textureX, textureY); // Box 450
		bodyModel[378] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[379] = new ModelRendererTurbo(this, 207, 84, textureX, textureY); // box64
		bodyModel[380] = new ModelRendererTurbo(this, 207, 80, textureX, textureY); // box65
		bodyModel[381] = new ModelRendererTurbo(this, 226, 30, textureX, textureY); // Box 666
		bodyModel[382] = new ModelRendererTurbo(this, 226, 40, textureX, textureY); // Box 667
		bodyModel[383] = new ModelRendererTurbo(this, 249, 186, textureX, textureY); // Box 669
		bodyModel[384] = new ModelRendererTurbo(this, 249, 189, textureX, textureY); // Box 670
		bodyModel[385] = new ModelRendererTurbo(this, 249, 183, textureX, textureY); // Box 671
		bodyModel[386] = new ModelRendererTurbo(this, 257, 199, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[387] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 621 low ditchlight f
		bodyModel[388] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[389] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 623 low ditchlight f
		bodyModel[390] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[391] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 625 low ditchlight r
		bodyModel[392] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 626 low ditchlight r
		bodyModel[393] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[394] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[395] = new ModelRendererTurbo(this, 269, 9, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[396] = new ModelRendererTurbo(this, 260, 9, textureX, textureY); // Box 563
		bodyModel[397] = new ModelRendererTurbo(this, 269, 2, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[398] = new ModelRendererTurbo(this, 260, 2, textureX, textureY); // Box 563
		bodyModel[399] = new ModelRendererTurbo(this, 94, 119, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[400] = new ModelRendererTurbo(this, 94, 119, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[401] = new ModelRendererTurbo(this, 359, 114, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[402] = new ModelRendererTurbo(this, 359, 114, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[403] = new ModelRendererTurbo(this, 332, 115, textureX, textureY, "cull"); // Box 628 cull fncc numberboard
		bodyModel[404] = new ModelRendererTurbo(this, 332, 111, textureX, textureY, "cull"); // Box 629 cull fncc numberboard

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

		bodyModel[41].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 805
		bodyModel[41].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[42].setRotationPoint(-10F, 3F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[43].setRotationPoint(-14F, 3F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-14F, 3F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(11F, 3F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[46].setRotationPoint(11F, 3F, -6F);

		bodyModel[47].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[47].setRotationPoint(9.5F, 6.5F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 430
		bodyModel[48].setRotationPoint(5.5F, 3F, -10.01F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 431
		bodyModel[49].setRotationPoint(9F, 3F, -10.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 432
		bodyModel[50].setRotationPoint(9F, 3F, 10.01F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 433
		bodyModel[51].setRotationPoint(5.5F, 3F, 10.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[52].setRotationPoint(-10F, 3F, 5F);

		bodyModel[53].addBox(0F, 0F, 0F, 14, 6, 9, 0F); // Box 73
		bodyModel[53].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[54].setRotationPoint(-10F, 6F, -7.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 75
		bodyModel[55].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 76
		bodyModel[56].setRotationPoint(-10F, 5F, 4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 77
		bodyModel[57].setRotationPoint(-10F, 6F, 4.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 78
		bodyModel[58].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[59].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[60].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[61].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[62].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[63].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[64].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[65].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[66].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[67].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[68].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[69].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[71].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[72].setRotationPoint(-14F, 3F, 11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[73].setRotationPoint(-9F, 3F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[74].setRotationPoint(-11F, 3F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[75].setRotationPoint(12F, 3F, 11F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[76].setRotationPoint(5.75F, 6F, -10.01F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 334
		bodyModel[77].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 335
		bodyModel[78].setRotationPoint(-37.01F, 7F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 336
		bodyModel[79].setRotationPoint(38.01F, 7F, 10F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 337
		bodyModel[80].setRotationPoint(38.01F, 7F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[81].setRotationPoint(12F, 3F, 11F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 339
		bodyModel[82].setRotationPoint(9F, 3F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 340
		bodyModel[83].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[84].setRotationPoint(-9F, 3F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[85].setRotationPoint(-11F, 3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[86].setRotationPoint(-14F, 3F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[87].setRotationPoint(12F, 3F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[88].setRotationPoint(12F, 3F, -11F);

		bodyModel[89].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 346
		bodyModel[89].setRotationPoint(6F, 6.5F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[90].setRotationPoint(-22F, -4F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 345 gp16 cutback frontbit
		bodyModel[91].setRotationPoint(-28F, -4F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 346 gp16 cutback frontbit
		bodyModel[92].setRotationPoint(-28F, -4F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[93].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[94].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[95].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[96].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[97].setRotationPoint(-33.01F, -12F, 11.02F);
		bodyModel[97].rotateAngleY = -3.14159265F;

		bodyModel[98].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[98].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[99].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[100].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[101].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[102].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[103].setRotationPoint(-34F, -12F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[104].setRotationPoint(-34F, -12F, 1F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[105].setRotationPoint(-34F, -12F, -1F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 215
		bodyModel[106].setRotationPoint(-31F, -12F, -7F);

		bodyModel[107].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 367
		bodyModel[107].setRotationPoint(-28F, -12F, -7F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 368
		bodyModel[108].setRotationPoint(-30F, -12F, -6F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 369 gp16 brake cover
		bodyModel[109].setRotationPoint(-30F, -7F, -7F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 370
		bodyModel[110].setRotationPoint(-30F, -4F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 374
		bodyModel[111].setRotationPoint(-30F, -4F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 375
		bodyModel[112].setRotationPoint(-30F, -12F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front nose
		bodyModel[113].setRotationPoint(-34.75F, -12F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front nose
		bodyModel[114].setRotationPoint(-34.75F, -10F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[115].setRotationPoint(-32F, -1F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[116].setRotationPoint(-32F, -1F, 5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[117].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[118].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[119].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 9
		bodyModel[119].setRotationPoint(-21F, -17F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 10
		bodyModel[120].setRotationPoint(-21F, -17F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 15
		bodyModel[121].setRotationPoint(-22F, -17F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 21
		bodyModel[122].setRotationPoint(-11F, -17F, -11F);

		bodyModel[123].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[123].setRotationPoint(-10.5F, -17F, 10.5F);

		bodyModel[124].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[124].setRotationPoint(-21.5F, -17F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[125].setRotationPoint(32F, -19F, -7F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[126].setRotationPoint(32F, -19F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[127].setRotationPoint(32F, -19F, 1F);

		bodyModel[128].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[128].setRotationPoint(-10F, -19F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[129].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[129].rotateAngleY = -1.11701072F;

		bodyModel[130].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[130].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[130].rotateAngleY = -1.11701072F;

		bodyModel[131].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[131].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[132].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[133].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[134].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[135].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[136].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[137].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[138].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[139].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[140].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[141].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[142].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[143].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[144].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[145].setRotationPoint(3.5F, -21F, -1.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[146].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[147].setRotationPoint(3.5F, -23F, -1.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 248 extra stack
		bodyModel[148].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[149].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[150].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 4, 15, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 farr filter
		bodyModel[151].setRotationPoint(1F, -21F, -7.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[152].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[153].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[154].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[155].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch tall
		bodyModel[155].setRotationPoint(18F, -22F, -3F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[156].setRotationPoint(19.5F, -24F, -1F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[157].setRotationPoint(18F, -24F, 0F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[158].setRotationPoint(19.5F, -23F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 457
		bodyModel[159].setRotationPoint(32F, -18F, -7F);

		bodyModel[160].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[160].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[161].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[161].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[162].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[163].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[164].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[165].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[166].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[166].setRotationPoint(-10F, -4F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[167].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[168].setRotationPoint(-10F, -4F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[169].setRotationPoint(-10F, -4F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[170].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[171].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[171].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[172].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[173].setRotationPoint(34.75F, -18F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[174].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[175].setRotationPoint(34.5F, -16F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[176].setRotationPoint(34.75F, -16F, -1F);

		bodyModel[177].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[177].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[177].rotateAngleY = -0.46687557F;

		bodyModel[178].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[178].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[178].rotateAngleY = 0.46687557F;

		bodyModel[179].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[179].setRotationPoint(10F, -22F, -8F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[180].setRotationPoint(11.25F, -21.85F, -9F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[181].setRotationPoint(11.25F, -21.85F, -7F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[182].setRotationPoint(12F, -21F, -8F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[183].setRotationPoint(-3.5F, -21F, -6F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		bodyModel[184].setRotationPoint(-3F, -20F, -6F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[185].setRotationPoint(-4.5F, -21F, -5F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[186].setRotationPoint(-5F, -21F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[187].setRotationPoint(-2.5F, -17.5F, 7.7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[188].setRotationPoint(-2.5F, -18.5F, 7.7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[189].setRotationPoint(-2.25F, -17F, 7.95F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[190].setRotationPoint(-2.5F, -19.5F, 6.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[191].setRotationPoint(-20.5F, -22F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[192].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[193].setRotationPoint(-9F, -17.5F, -7.05F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[194].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 584
		bodyModel[195].setRotationPoint(-9F, -17.5F, 6.05F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[196].setRotationPoint(-11.5F, 3F, -10.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[197].setRotationPoint(-11.5F, 2F, -10.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[198].setRotationPoint(-11.25F, 3.5F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 19 front fuel fill
		bodyModel[199].setRotationPoint(-10F, 3F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 19 front fuel fill
		bodyModel[200].setRotationPoint(-10F, 3F, 6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[201].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[202].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[203].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[204].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[205].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[206].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[207].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[208].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[209].setRotationPoint(-21F, -22F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[210].setRotationPoint(-21F, -23F, -0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[211].setRotationPoint(-12F, -22F, -0.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[212].setRotationPoint(-12F, -23F, -0.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[213].setRotationPoint(-21F, -22F, 6.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[214].setRotationPoint(-21F, -22.5F, 6.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[215].setRotationPoint(-21F, -22.5F, 6.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[216].setRotationPoint(-21F, -22.5F, 6.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[217].setRotationPoint(-21F, -22.5F, 6.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[218].setRotationPoint(37F, -1F, -4.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[219].setRotationPoint(37F, -1F, 2.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394
		bodyModel[220].setRotationPoint(37.25F, -1F, -4.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395
		bodyModel[221].setRotationPoint(37.25F, -1F, 2.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[222].setRotationPoint(-37F, -1F, -4.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[223].setRotationPoint(-37F, -1F, 2.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398
		bodyModel[224].setRotationPoint(-37.25F, -1F, -4.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399
		bodyModel[225].setRotationPoint(-37.25F, -1F, 2.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[226].setRotationPoint(-37F, -2F, 3.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[227].setRotationPoint(-37F, -2F, -5.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[228].setRotationPoint(-37.25F, -2F, 3.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[229].setRotationPoint(-37.25F, -2F, -5.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[230].setRotationPoint(37F, -2F, -5.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[231].setRotationPoint(37.25F, -2F, -5.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[232].setRotationPoint(37.25F, -2F, 3.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[233].setRotationPoint(37F, -2F, 3.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[234].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[235].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[236].setRotationPoint(-41F, 7F, 0F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[237].setRotationPoint(-41F, 7F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[238].setRotationPoint(-40F, 6F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[239].setRotationPoint(-40F, 6F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[240].setRotationPoint(41F, 7F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[241].setRotationPoint(41F, 7F, -10F);

		bodyModel[242].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[242].setRotationPoint(41F, 6F, -10F);

		bodyModel[243].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[243].setRotationPoint(41F, 6F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[244].setRotationPoint(-40F, 6F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[245].setRotationPoint(-40F, 6F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[246].setRotationPoint(-40F, 5F, 0F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[247].setRotationPoint(-40F, 5F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[248].setRotationPoint(40F, 6F, -10F);

		bodyModel[249].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[249].setRotationPoint(41F, 5F, 0F);

		bodyModel[250].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[250].setRotationPoint(41F, 5F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[251].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[252].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[253].setRotationPoint(-24.5F, -23F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam front
		bodyModel[254].setRotationPoint(-25.25F, -23F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam front
		bodyModel[255].setRotationPoint(-25.25F, -23F, -2F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[256].setRotationPoint(33.5F, -20F, -2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam rear
		bodyModel[257].setRotationPoint(35.25F, -20F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam rear
		bodyModel[258].setRotationPoint(35.25F, -20F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 452 rear fuel fill
		bodyModel[259].setRotationPoint(4F, 3F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 452 rear fuel fill
		bodyModel[260].setRotationPoint(4F, 3F, 6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[261].setRotationPoint(-19F, -16F, 10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306 cull aww
		bodyModel[262].setRotationPoint(-19F, -16F, -12.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 455
		bodyModel[263].setRotationPoint(4F, 5F, -6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[264].setRotationPoint(5F, 4F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 457
		bodyModel[265].setRotationPoint(1F, 4F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 458
		bodyModel[266].setRotationPoint(1F, 4F, 11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[267].setRotationPoint(5F, 4F, 11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[268].setRotationPoint(-8F, 4F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[269].setRotationPoint(-8F, 4F, 11F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 462
		bodyModel[270].setRotationPoint(-22F, -25F, 0F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 456 cull
		bodyModel[271].setRotationPoint(-38F, 7F, -10F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 476 cull
		bodyModel[272].setRotationPoint(38F, 7F, -10F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[273].setRotationPoint(-37F, 2F, 7F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[274].setRotationPoint(-37F, 2F, -7F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[275].setRotationPoint(-24F, -10F, 7F);

		bodyModel[276].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[276].setRotationPoint(-19F, -24.5F, -2F);

		bodyModel[277].addBox(0F, 0F, 2F, 3, 1, 0, 0F); // Box 262
		bodyModel[277].setRotationPoint(-17F, -22F, -2F);

		bodyModel[278].addBox(0.5F, 0F, 0.5F, 2, 9, 3, 0F); // Box 412 cs1
		bodyModel[278].setRotationPoint(-16.5F, -13F, -2F);
		bodyModel[278].rotateAngleY = -0.26179939F;

		bodyModel[279].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[279].setRotationPoint(-21.6F, -11F, 2F);
		bodyModel[279].rotateAngleY = -0.59341195F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[280].setRotationPoint(-21.6F, -13F, 2F);
		bodyModel[280].rotateAngleY = -0.59341195F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[281].setRotationPoint(-17F, -22F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[282].setRotationPoint(-17F, -22.5F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[283].setRotationPoint(-17F, -22.5F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[284].setRotationPoint(-17F, -22.5F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[285].setRotationPoint(-17F, -22.5F, -1F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 559
		bodyModel[286].setRotationPoint(-12F, -19F, -7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[287].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[288].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[289].setRotationPoint(40F, 6F, 0F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[290].setRotationPoint(34F, 5F, -10F);

		bodyModel[291].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[291].setRotationPoint(34F, 7F, -8F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[292].setRotationPoint(34F, 8F, -11F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[293].setRotationPoint(34F, 4F, -7F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[294].setRotationPoint(34F, 2F, -7F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[295].setRotationPoint(34F, 3F, -9F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[296].setRotationPoint(34F, 1F, -8F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[297].setRotationPoint(34F, 7F, 8F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[298].setRotationPoint(34F, 8F, 8F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[299].setRotationPoint(34F, 5F, 7F);

		bodyModel[300].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[300].setRotationPoint(34F, 4F, 7F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[301].setRotationPoint(34F, 3F, 7F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[302].setRotationPoint(34F, 2F, 7F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[303].setRotationPoint(34F, 1F, 6F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 582
		bodyModel[304].setRotationPoint(-10F, 5F, -6F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[305].setRotationPoint(32F, -18F, -6.51F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[306].setRotationPoint(32F, -18F, 6.51F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 565
		bodyModel[307].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[308].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[309].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[310].addShapeBox(-1F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo
		bodyModel[310].setRotationPoint(-22.1F, -17F, 7F);
		bodyModel[310].rotateAngleY = -1.48352986F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[311].setRotationPoint(-40F, 5F, 2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[312].setRotationPoint(-40F, 5F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[313].setRotationPoint(-40F, 4F, 2F);

		bodyModel[314].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[314].setRotationPoint(-40F, 4F, -8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[315].setRotationPoint(40F, 4F, 2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[316].setRotationPoint(40F, 5F, 2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[317].setRotationPoint(40F, 5F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[318].setRotationPoint(40F, 4F, -8F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 355 cull
		bodyModel[319].setRotationPoint(1F, -21F, -0.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[320].setRotationPoint(-1F, -22F, -0.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[321].setRotationPoint(1F, -22.25F, -1.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[322].setRotationPoint(0F, -22.25F, 0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[323].setRotationPoint(7.5F, -21F, -1.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[324].setRotationPoint(7.5F, -23F, -1.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[325].setRotationPoint(11.5F, -21F, -1.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[326].setRotationPoint(11.5F, -23F, -1.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[327].setRotationPoint(1F, -21F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[328].setRotationPoint(33.65F, -5F, 3.6F);
		bodyModel[328].rotateAngleY = 0.45378561F;

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[329].setRotationPoint(1F, -21F, 7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[330].setRotationPoint(1F, -19F, -9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[331].setRotationPoint(-0.5F, -18F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[332].setRotationPoint(1F, -19F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[333].setRotationPoint(3F, -18F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[334].setRotationPoint(-0.5F, -18F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196 additional farr filter parts
		bodyModel[335].setRotationPoint(3F, -18F, 7F);

		bodyModel[336].addBox(0F, 0F, 0F, 12, 1, 18, 0F); // Box 68
		bodyModel[336].setRotationPoint(-22F, -21F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[337].setRotationPoint(-22F, -21F, 9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[338].setRotationPoint(-25F, -21F, -1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[339].setRotationPoint(-24F, -21F, -6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[340].setRotationPoint(-24F, -21F, 1F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[341].setRotationPoint(-24.75F, -21F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[342].setRotationPoint(-24.75F, -19F, -1F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[343].setRotationPoint(-22F, -20F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[344].setRotationPoint(-22F, -21F, -11F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[345].setRotationPoint(-11F, -20F, -9F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[346].setRotationPoint(-22.05F, -20F, -6F);
		bodyModel[346].rotateAngleY = 0.38397244F;

		bodyModel[347].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[347].setRotationPoint(-22.05F, -20F, 6F);
		bodyModel[347].rotateAngleY = -0.38397244F;

		bodyModel[348].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[348].setRotationPoint(-17.5F, -22.75F, -4F);

		bodyModel[349].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[349].setRotationPoint(-24F, -23F, 7F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[350].setRotationPoint(-21F, -23F, 6F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[351].setRotationPoint(-23F, -23F, 5F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[352].setRotationPoint(-21F, -22F, 6F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[353].setRotationPoint(-21F, -22F, -8.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[354].setRotationPoint(-21F, -22.5F, -8.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[355].setRotationPoint(-21F, -22.5F, -8.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[356].setRotationPoint(-21F, -22.5F, -8.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[357].setRotationPoint(-21F, -22.5F, -8.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[358].setRotationPoint(-26F, -23.5F, -1.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[359].setRotationPoint(-25F, -23.5F, -0.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[360].setRotationPoint(-27F, -23.5F, 0.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[361].setRotationPoint(-24F, -22.5F, -0.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -1F, 1F, 1F, 0F, 1F, 1F); // Box 285
		bodyModel[362].setRotationPoint(-18F, -25F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[363].setRotationPoint(-18F, -25F, 5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[364].setRotationPoint(-18F, -27F, 5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[365].setRotationPoint(-18F, -27F, 8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[366].setRotationPoint(-18F, -28F, 8F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[367].setRotationPoint(-18F, -28F, 6F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 1F, 1F, -1F, 1F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[368].setRotationPoint(-18F, -25F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[369].setRotationPoint(-18F, -27F, -8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[370].setRotationPoint(-18F, -25F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[371].setRotationPoint(-18F, -27F, -9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[372].setRotationPoint(-18F, -28F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[373].setRotationPoint(-18F, -28F, -8F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 659
		bodyModel[374].setRotationPoint(-12F, -20F, -7F);

		bodyModel[375].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[375].setRotationPoint(-15F, -23F, -2.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[376].setRotationPoint(-23F, -23F, -3F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[377].setRotationPoint(-14F, -24F, 0F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[378].setRotationPoint(-22F, -24F, 0F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[379].setRotationPoint(-19F, -17F, 11F);
		bodyModel[379].rotateAngleX = 0.26179939F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[380].setRotationPoint(-19F, -17.25F, -11.97F);
		bodyModel[380].rotateAngleX = -0.26179939F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		bodyModel[381].setRotationPoint(-21F, -20F, 2F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 667
		bodyModel[382].setRotationPoint(-21F, -20F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 669
		bodyModel[383].setRotationPoint(-35.5F, 4F, 4.75F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 670
		bodyModel[384].setRotationPoint(-35.25F, 4.5F, 5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		bodyModel[385].setRotationPoint(-35.5F, 3F, 4.75F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[386].setRotationPoint(-13F, 2F, 8.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[387].setRotationPoint(-37.75F, 1F, -6.75F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[388].setRotationPoint(-37.5F, 1F, -6.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[389].setRotationPoint(-37.75F, 1F, 4.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[390].setRotationPoint(-37.5F, 1F, 4.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[391].setRotationPoint(37.75F, 1F, -6.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[392].setRotationPoint(37.75F, 1F, 4.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[393].setRotationPoint(37.5F, 1F, 4.75F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[394].setRotationPoint(37.5F, 1F, -6.75F);

		bodyModel[395].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[395].setRotationPoint(-19F, -21F, -11F);

		bodyModel[396].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[396].setRotationPoint(-18.5F, -22F, -10F);

		bodyModel[397].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[397].setRotationPoint(-19F, -21F, 9F);

		bodyModel[398].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[398].setRotationPoint(-18.5F, -22F, 10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[399].setRotationPoint(-31.75F, -11F, -6.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[400].setRotationPoint(-31.75F, -11F, 4.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[401].setRotationPoint(31.75F, -11F, -6.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[402].setRotationPoint(31.75F, -11F, 4.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628 cull fncc numberboard
		bodyModel[403].setRotationPoint(8F, -20.6F, -9.01F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629 cull fncc numberboard
		bodyModel[404].setRotationPoint(8F, -20.6F, 8.01F);
	}

	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1435){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_DarkGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 ||GetColor(entity) == 4
				||GetColor(entity) == 6 ||GetColor(entity) == 17){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3245){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}