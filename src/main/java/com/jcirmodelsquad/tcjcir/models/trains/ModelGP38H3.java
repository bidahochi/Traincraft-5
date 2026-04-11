//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.12.2021 - 11:32:37
// Last changed on: 30.12.2021 - 11:32:37

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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

public class ModelGP38H3 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGP38H3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[319];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 282, 101, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 268, 82, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 332, 108, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 13, 133, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 282, 76, textureX, textureY); // Box 159
		bodyModel[5] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[6] = new ModelRendererTurbo(this, 84, 4, textureX, textureY); // Box 70
		bodyModel[7] = new ModelRendererTurbo(this, 77, 6, textureX, textureY); // Box 72
		bodyModel[8] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[9] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[10] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[11] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[12] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[14] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[15] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[17] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[18] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[19] = new ModelRendererTurbo(this, 123, 6, textureX, textureY); // Box 220
		bodyModel[20] = new ModelRendererTurbo(this, 105, 12, textureX, textureY); // Box 221
		bodyModel[21] = new ModelRendererTurbo(this, 105, 4, textureX, textureY); // Box 222
		bodyModel[22] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[23] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[24] = new ModelRendererTurbo(this, 13, 143, textureX, textureY); // Box 226
		bodyModel[25] = new ModelRendererTurbo(this, 11, 139, textureX, textureY); // Box 227
		bodyModel[26] = new ModelRendererTurbo(this, 488, 116, textureX, textureY); // Box 164
		bodyModel[27] = new ModelRendererTurbo(this, 467, 116, textureX, textureY); // Box 259
		bodyModel[28] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 261
		bodyModel[29] = new ModelRendererTurbo(this, 458, 113, textureX, textureY); // Box 262
		bodyModel[30] = new ModelRendererTurbo(this, 488, 124, textureX, textureY); // Box 264
		bodyModel[31] = new ModelRendererTurbo(this, 468, 124, textureX, textureY); // Box 265
		bodyModel[32] = new ModelRendererTurbo(this, 463, 114, textureX, textureY); // Box 266
		bodyModel[33] = new ModelRendererTurbo(this, 459, 147, textureX, textureY); // Box 319
		bodyModel[34] = new ModelRendererTurbo(this, 460, 143, textureX, textureY); // Box 322
		bodyModel[35] = new ModelRendererTurbo(this, 460, 145, textureX, textureY); // Box 323
		bodyModel[36] = new ModelRendererTurbo(this, 488, 146, textureX, textureY); // Box 326
		bodyModel[37] = new ModelRendererTurbo(this, 489, 144, textureX, textureY); // Box 327
		bodyModel[38] = new ModelRendererTurbo(this, 489, 142, textureX, textureY); // Box 329
		bodyModel[39] = new ModelRendererTurbo(this, 452, 147, textureX, textureY); // Box 323
		bodyModel[40] = new ModelRendererTurbo(this, 453, 141, textureX, textureY); // Box 319
		bodyModel[41] = new ModelRendererTurbo(this, 461, 141, textureX, textureY); // Box 319
		bodyModel[42] = new ModelRendererTurbo(this, 497, 140, textureX, textureY); // Box 319
		bodyModel[43] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 319
		bodyModel[44] = new ModelRendererTurbo(this, 453, 113, textureX, textureY); // Box 259
		bodyModel[45] = new ModelRendererTurbo(this, 453, 116, textureX, textureY); // Box 259
		bodyModel[46] = new ModelRendererTurbo(this, 501, 121, textureX, textureY); // Box 259
		bodyModel[47] = new ModelRendererTurbo(this, 501, 124, textureX, textureY); // Box 259
		bodyModel[48] = new ModelRendererTurbo(this, 13, 169, textureX, textureY); // Box 3
		bodyModel[49] = new ModelRendererTurbo(this, 11, 175, textureX, textureY); // Box 207
		bodyModel[50] = new ModelRendererTurbo(this, 13, 179, textureX, textureY); // Box 225
		bodyModel[51] = new ModelRendererTurbo(this, 448, 71, textureX, textureY); // Box 4
		bodyModel[52] = new ModelRendererTurbo(this, 471, 71, textureX, textureY); // Box 193
		bodyModel[53] = new ModelRendererTurbo(this, 265, 107, textureX, textureY); // Box 229
		bodyModel[54] = new ModelRendererTurbo(this, 270, 70, textureX, textureY); // Box 230
		bodyModel[55] = new ModelRendererTurbo(this, 378, 70, textureX, textureY); // Box 231
		bodyModel[56] = new ModelRendererTurbo(this, 321, 115, textureX, textureY); // Box 241
		bodyModel[57] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 242
		bodyModel[58] = new ModelRendererTurbo(this, 371, 68, textureX, textureY); // Box 243
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[62] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[64] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 43
		bodyModel[65] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[66] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[67] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[68] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[69] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[70] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[71] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[72] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[73] = new ModelRendererTurbo(this, 114, 58, textureX, textureY); // Box 43
		bodyModel[74] = new ModelRendererTurbo(this, 75, 59, textureX, textureY); // Box 43
		bodyModel[75] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[76] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[77] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 274
		bodyModel[78] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[79] = new ModelRendererTurbo(this, 435, 2, textureX, textureY); // Box 276
		bodyModel[80] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[81] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[82] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 6
		bodyModel[83] = new ModelRendererTurbo(this, 467, 84, textureX, textureY); // Box 7
		bodyModel[84] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 308
		bodyModel[85] = new ModelRendererTurbo(this, 278, 25, textureX, textureY); // Box 309
		bodyModel[86] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 310
		bodyModel[87] = new ModelRendererTurbo(this, 278, 17, textureX, textureY); // Box 311
		bodyModel[88] = new ModelRendererTurbo(this, 50, 75, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 37, 139, textureX, textureY); // Box 80
		bodyModel[90] = new ModelRendererTurbo(this, 30, 133, textureX, textureY); // Box 144
		bodyModel[91] = new ModelRendererTurbo(this, 23, 133, textureX, textureY); // Box 145
		bodyModel[92] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 147
		bodyModel[93] = new ModelRendererTurbo(this, 34, 133, textureX, textureY); // Box 148
		bodyModel[94] = new ModelRendererTurbo(this, 85, 136, textureX, textureY); // Box 258
		bodyModel[95] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[96] = new ModelRendererTurbo(this, 117, 125, textureX, textureY); // Box 291
		bodyModel[97] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[98] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[99] = new ModelRendererTurbo(this, 114, 134, textureX, textureY); // Box 312
		bodyModel[100] = new ModelRendererTurbo(this, 108, 134, textureX, textureY); // Box 313
		bodyModel[101] = new ModelRendererTurbo(this, 98, 134, textureX, textureY); // Box 314
		bodyModel[102] = new ModelRendererTurbo(this, 227, 135, textureX, textureY); // Box 315
		bodyModel[103] = new ModelRendererTurbo(this, 232, 134, textureX, textureY); // Box 316
		bodyModel[104] = new ModelRendererTurbo(this, 159, 199, textureX, textureY); // Box 303
		bodyModel[105] = new ModelRendererTurbo(this, 464, 43, textureX, textureY, BoxName.ditch); // rear lamp
		bodyModel[106] = new ModelRendererTurbo(this, 471, 43, textureX, textureY, BoxName.ditch); // rear lamp
		bodyModel[107] = new ModelRendererTurbo(this, 463, 53, textureX, textureY); // Box 31
		bodyModel[108] = new ModelRendererTurbo(this, 332, 116, textureX, textureY); // Box 163
		bodyModel[109] = new ModelRendererTurbo(this, 132, 143, textureX, textureY); // Box 164
		bodyModel[110] = new ModelRendererTurbo(this, 222, 143, textureX, textureY); // Box 165
		bodyModel[111] = new ModelRendererTurbo(this, 217, 144, textureX, textureY); // Box 166
		bodyModel[112] = new ModelRendererTurbo(this, 457, 80, textureX, textureY, BoxName.ditch); // Box 115 numberboard rear
		bodyModel[113] = new ModelRendererTurbo(this, 457, 80, textureX, textureY); // Box 169
		bodyModel[114] = new ModelRendererTurbo(this, 453, 15, textureX, textureY); // Box 170
		bodyModel[115] = new ModelRendererTurbo(this, 437, 11, textureX, textureY); // Box 172
		bodyModel[116] = new ModelRendererTurbo(this, 378, 14, textureX, textureY); // Box 173
		bodyModel[117] = new ModelRendererTurbo(this, 369, 14, textureX, textureY); // Box 174
		bodyModel[118] = new ModelRendererTurbo(this, 352, 14, textureX, textureY); // Box 175
		bodyModel[119] = new ModelRendererTurbo(this, 360, 14, textureX, textureY); // Box 176
		bodyModel[120] = new ModelRendererTurbo(this, 270, 1, textureX, textureY); // Box 177
		bodyModel[121] = new ModelRendererTurbo(this, 268, 113, textureX, textureY); // Box 232
		bodyModel[122] = new ModelRendererTurbo(this, 321, 109, textureX, textureY); // Box 244
		bodyModel[123] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 181
		bodyModel[124] = new ModelRendererTurbo(this, 488, 116, textureX, textureY); // Box 182
		bodyModel[125] = new ModelRendererTurbo(this, 501, 124, textureX, textureY); // Box 183
		bodyModel[126] = new ModelRendererTurbo(this, 501, 121, textureX, textureY); // Box 184
		bodyModel[127] = new ModelRendererTurbo(this, 452, 145, textureX, textureY); // Box 185
		bodyModel[128] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 186
		bodyModel[129] = new ModelRendererTurbo(this, 489, 142, textureX, textureY); // Box 187
		bodyModel[130] = new ModelRendererTurbo(this, 488, 124, textureX, textureY); // Box 188
		bodyModel[131] = new ModelRendererTurbo(this, 497, 136, textureX, textureY); // Box 189
		bodyModel[132] = new ModelRendererTurbo(this, 488, 149, textureX, textureY); // Box 190
		bodyModel[133] = new ModelRendererTurbo(this, 453, 137, textureX, textureY); // Box 194
		bodyModel[134] = new ModelRendererTurbo(this, 459, 150, textureX, textureY); // Box 195
		bodyModel[135] = new ModelRendererTurbo(this, 460, 143, textureX, textureY); // Box 196
		bodyModel[136] = new ModelRendererTurbo(this, 461, 141, textureX, textureY); // Box 197
		bodyModel[137] = new ModelRendererTurbo(this, 460, 145, textureX, textureY); // Box 198
		bodyModel[138] = new ModelRendererTurbo(this, 463, 114, textureX, textureY); // Box 199
		bodyModel[139] = new ModelRendererTurbo(this, 452, 147, textureX, textureY); // Box 200
		bodyModel[140] = new ModelRendererTurbo(this, 458, 113, textureX, textureY); // Box 201
		bodyModel[141] = new ModelRendererTurbo(this, 467, 116, textureX, textureY); // Box 202
		bodyModel[142] = new ModelRendererTurbo(this, 468, 124, textureX, textureY); // Box 203
		bodyModel[143] = new ModelRendererTurbo(this, 453, 116, textureX, textureY); // Box 204
		bodyModel[144] = new ModelRendererTurbo(this, 453, 113, textureX, textureY); // Box 205
		bodyModel[145] = new ModelRendererTurbo(this, 452, 145, textureX, textureY); // Box 206
		bodyModel[146] = new ModelRendererTurbo(this, 253, 204, textureX, textureY); // Box 112
		bodyModel[147] = new ModelRendererTurbo(this, 266, 190, textureX, textureY); // Box 233
		bodyModel[148] = new ModelRendererTurbo(this, 266, 197, textureX, textureY); // Box 234
		bodyModel[149] = new ModelRendererTurbo(this, 267, 171, textureX, textureY); // Box 235
		bodyModel[150] = new ModelRendererTurbo(this, 267, 164, textureX, textureY); // Box 236
		bodyModel[151] = new ModelRendererTurbo(this, 272, 121, textureX, textureY); // Box 86
		bodyModel[152] = new ModelRendererTurbo(this, 272, 125, textureX, textureY); // Box 87
		bodyModel[153] = new ModelRendererTurbo(this, 265, 184, textureX, textureY); // Box 278
		bodyModel[154] = new ModelRendererTurbo(this, 265, 178, textureX, textureY); // Box 315
		bodyModel[155] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 255
		bodyModel[156] = new ModelRendererTurbo(this, 256, 152, textureX, textureY); // Box 256
		bodyModel[157] = new ModelRendererTurbo(this, 314, 125, textureX, textureY); // Box 247
		bodyModel[158] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 189
		bodyModel[159] = new ModelRendererTurbo(this, 463, 88, textureX, textureY, BoxName.ditch); // Box 384 markerlight glow
		bodyModel[160] = new ModelRendererTurbo(this, 501, 88, textureX, textureY, BoxName.ditch); // Box 385 markerlight glow
		bodyModel[161] = new ModelRendererTurbo(this, 101, 50, textureX, textureY); // Box 193
		bodyModel[162] = new ModelRendererTurbo(this, 105, 37, textureX, textureY, BoxName.ditch); // Box 117 numberboard front
		bodyModel[163] = new ModelRendererTurbo(this, 105, 34, textureX, textureY, BoxName.ditch); // Box 118 numberboard front
		bodyModel[164] = new ModelRendererTurbo(this, 110, 50, textureX, textureY); // Box 196
		bodyModel[165] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[166] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[167] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[168] = new ModelRendererTurbo(this, 62, 147, textureX, textureY); // Box 200
		bodyModel[169] = new ModelRendererTurbo(this, 68, 149, textureX, textureY); // Box 201
		bodyModel[170] = new ModelRendererTurbo(this, 78, 149, textureX, textureY); // Box 202
		bodyModel[171] = new ModelRendererTurbo(this, 75, 149, textureX, textureY); // Box 203
		bodyModel[172] = new ModelRendererTurbo(this, 71, 149, textureX, textureY); // Box 204
		bodyModel[173] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, BoxName.ditch); // emergency light
		bodyModel[174] = new ModelRendererTurbo(this, 103, 56, textureX, textureY, BoxName.ditch); // markerlight glow
		bodyModel[175] = new ModelRendererTurbo(this, 108, 56, textureX, textureY, BoxName.ditch); // markerlight glow
		bodyModel[176] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, BoxName.ditch); // Box 294 lamp canada front
		bodyModel[177] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, BoxName.ditch); // Box 295 lamp canada front
		bodyModel[178] = new ModelRendererTurbo(this, 282, 51, textureX, textureY); // Box 271
		bodyModel[179] = new ModelRendererTurbo(this, 282, 45, textureX, textureY); // Box 272
		bodyModel[180] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 285
		bodyModel[181] = new ModelRendererTurbo(this, 172, 5, textureX, textureY, BoxName.commander); // Box 340 glow commander
		bodyModel[182] = new ModelRendererTurbo(this, 171, 9, textureX, textureY); // Box 341
		bodyModel[183] = new ModelRendererTurbo(this, 172, 5, textureX, textureY, BoxName.commander); // glow commander
		bodyModel[184] = new ModelRendererTurbo(this, 171, 9, textureX, textureY); // Box 215
		bodyModel[185] = new ModelRendererTurbo(this, 88, 122, textureX, textureY); // Box 354
		bodyModel[186] = new ModelRendererTurbo(this, 90, 119, textureX, textureY); // Box 355
		bodyModel[187] = new ModelRendererTurbo(this, 90, 125, textureX, textureY); // Box 356
		bodyModel[188] = new ModelRendererTurbo(this, 99, 122, textureX, textureY); // Box 357
		bodyModel[189] = new ModelRendererTurbo(this, 67, 119, textureX, textureY); // Box 419
		bodyModel[190] = new ModelRendererTurbo(this, 67, 125, textureX, textureY); // Box 421
		bodyModel[191] = new ModelRendererTurbo(this, 319, 15, textureX, textureY); // Box 222
		bodyModel[192] = new ModelRendererTurbo(this, 474, 2, textureX, textureY); // Box 223
		bodyModel[193] = new ModelRendererTurbo(this, 480, 19, textureX, textureY); // Box 224
		bodyModel[194] = new ModelRendererTurbo(this, 233, 88, textureX, textureY); // Box 225
		bodyModel[195] = new ModelRendererTurbo(this, 212, 3, textureX, textureY); // Box 226
		bodyModel[196] = new ModelRendererTurbo(this, 240, 32, textureX, textureY); // Box 227
		bodyModel[197] = new ModelRendererTurbo(this, 213, 72, textureX, textureY); // Box 229
		bodyModel[198] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 230
		bodyModel[199] = new ModelRendererTurbo(this, 243, 74, textureX, textureY); // Box 231
		bodyModel[200] = new ModelRendererTurbo(this, 240, 53, textureX, textureY); // Box 232
		bodyModel[201] = new ModelRendererTurbo(this, 37, 137, textureX, textureY); // Box 236
		bodyModel[202] = new ModelRendererTurbo(this, 41, 133, textureX, textureY); // Box 237
		bodyModel[203] = new ModelRendererTurbo(this, 18, 138, textureX, textureY); // Box 238
		bodyModel[204] = new ModelRendererTurbo(this, 23, 133, textureX, textureY); // Box 239
		bodyModel[205] = new ModelRendererTurbo(this, 44, 138, textureX, textureY); // Box 240
		bodyModel[206] = new ModelRendererTurbo(this, 25, 139, textureX, textureY); // Box 241
		bodyModel[207] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 242
		bodyModel[208] = new ModelRendererTurbo(this, 26, 133, textureX, textureY); // Box 243
		bodyModel[209] = new ModelRendererTurbo(this, 96, 136, textureX, textureY); // Box 246
		bodyModel[210] = new ModelRendererTurbo(this, 199, 159, textureX, textureY); // Box 280
		bodyModel[211] = new ModelRendererTurbo(this, 138, 170, textureX, textureY); // Box 281
		bodyModel[212] = new ModelRendererTurbo(this, 174, 171, textureX, textureY); // Box 282
		bodyModel[213] = new ModelRendererTurbo(this, 197, 171, textureX, textureY); // Box 283
		bodyModel[214] = new ModelRendererTurbo(this, 173, 156, textureX, textureY); // Box 284
		bodyModel[215] = new ModelRendererTurbo(this, 189, 161, textureX, textureY); // Box 285
		bodyModel[216] = new ModelRendererTurbo(this, 140, 160, textureX, textureY); // Box 414
		bodyModel[217] = new ModelRendererTurbo(this, 151, 158, textureX, textureY); // Box 415
		bodyModel[218] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 255
		bodyModel[219] = new ModelRendererTurbo(this, 38, 133, textureX, textureY); // Box 256
		bodyModel[220] = new ModelRendererTurbo(this, 23, 170, textureX, textureY); // Box 257
		bodyModel[221] = new ModelRendererTurbo(this, 25, 174, textureX, textureY); // Box 258
		bodyModel[222] = new ModelRendererTurbo(this, 25, 176, textureX, textureY); // Box 259
		bodyModel[223] = new ModelRendererTurbo(this, 18, 174, textureX, textureY); // Box 260
		bodyModel[224] = new ModelRendererTurbo(this, 30, 170, textureX, textureY); // Box 261
		bodyModel[225] = new ModelRendererTurbo(this, 23, 170, textureX, textureY); // Box 262
		bodyModel[226] = new ModelRendererTurbo(this, 34, 170, textureX, textureY); // Box 263
		bodyModel[227] = new ModelRendererTurbo(this, 37, 174, textureX, textureY); // Box 264
		bodyModel[228] = new ModelRendererTurbo(this, 37, 176, textureX, textureY); // Box 265
		bodyModel[229] = new ModelRendererTurbo(this, 41, 170, textureX, textureY); // Box 266
		bodyModel[230] = new ModelRendererTurbo(this, 44, 174, textureX, textureY); // Box 267
		bodyModel[231] = new ModelRendererTurbo(this, 26, 170, textureX, textureY); // Box 268
		bodyModel[232] = new ModelRendererTurbo(this, 13, 173, textureX, textureY); // Box 269
		bodyModel[233] = new ModelRendererTurbo(this, 38, 170, textureX, textureY); // Box 270
		bodyModel[234] = new ModelRendererTurbo(this, 49, 173, textureX, textureY); // Box 271
		bodyModel[235] = new ModelRendererTurbo(this, 163, 12, textureX, textureY); // Box 114
		bodyModel[236] = new ModelRendererTurbo(this, 163, 9, textureX, textureY); // Box 74
		bodyModel[237] = new ModelRendererTurbo(this, 163, 15, textureX, textureY); // Box 78
		bodyModel[238] = new ModelRendererTurbo(this, 161, 6, textureX, textureY); // Box 245
		bodyModel[239] = new ModelRendererTurbo(this, 464, 60, textureX, textureY, BoxName.ditch); // rear emergency light
		bodyModel[240] = new ModelRendererTurbo(this, 463, 48, textureX, textureY); // Box 277
		bodyModel[241] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[242] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[243] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[244] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[245] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[246] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, BoxName.ditch); // Box 71 glow speedometer
		bodyModel[247] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[248] = new ModelRendererTurbo(this, 214, 43, textureX, textureY); // Box 285
		bodyModel[249] = new ModelRendererTurbo(this, 361, 126, textureX, textureY); // Box 288
		bodyModel[250] = new ModelRendererTurbo(this, 151, 22, textureX, textureY); // Box 289
		bodyModel[251] = new ModelRendererTurbo(this, 317, 173, textureX, textureY); // Box 290
		bodyModel[252] = new ModelRendererTurbo(this, 316, 180, textureX, textureY); // Box 291
		bodyModel[253] = new ModelRendererTurbo(this, 304, 192, textureX, textureY); // Box 292
		bodyModel[254] = new ModelRendererTurbo(this, 317, 166, textureX, textureY); // Box 293
		bodyModel[255] = new ModelRendererTurbo(this, 317, 159, textureX, textureY); // Box 294
		bodyModel[256] = new ModelRendererTurbo(this, 317, 152, textureX, textureY); // Box 295
		bodyModel[257] = new ModelRendererTurbo(this, 316, 186, textureX, textureY); // Box 296
		bodyModel[258] = new ModelRendererTurbo(this, 338, 179, textureX, textureY); // Box 297
		bodyModel[259] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 298
		bodyModel[260] = new ModelRendererTurbo(this, 328, 199, textureX, textureY); // Box 299
		bodyModel[261] = new ModelRendererTurbo(this, 338, 172, textureX, textureY); // Box 300
		bodyModel[262] = new ModelRendererTurbo(this, 338, 158, textureX, textureY); // Box 301
		bodyModel[263] = new ModelRendererTurbo(this, 338, 164, textureX, textureY); // Box 302
		bodyModel[264] = new ModelRendererTurbo(this, 337, 187, textureX, textureY); // Box 303
		bodyModel[265] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[266] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[267] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[268] = new ModelRendererTurbo(this, 172, 13, textureX, textureY); // Box 415
		bodyModel[269] = new ModelRendererTurbo(this, 485, 23, textureX, textureY); // Box 276
		bodyModel[270] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[271] = new ModelRendererTurbo(this, 79, 122, textureX, textureY); // Box 278
		bodyModel[272] = new ModelRendererTurbo(this, 341, 152, textureX, textureY); // Box 279
		bodyModel[273] = new ModelRendererTurbo(this, 332, 152, textureX, textureY); // Box 280
		bodyModel[274] = new ModelRendererTurbo(this, 169, 199, textureX, textureY); // Box 281
		bodyModel[275] = new ModelRendererTurbo(this, 156, 193, textureX, textureY); // Box 282
		bodyModel[276] = new ModelRendererTurbo(this, 169, 187, textureX, textureY); // Box 283
		bodyModel[277] = new ModelRendererTurbo(this, 156, 181, textureX, textureY); // Box 284
		bodyModel[278] = new ModelRendererTurbo(this, 159, 187, textureX, textureY); // Box 285
		bodyModel[279] = new ModelRendererTurbo(this, 63, 180, textureX, textureY); // Box 78
		bodyModel[280] = new ModelRendererTurbo(this, 63, 180, textureX, textureY); // Box 188
		bodyModel[281] = new ModelRendererTurbo(this, 70, 180, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f
		bodyModel[282] = new ModelRendererTurbo(this, 70, 180, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f
		bodyModel[283] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[284] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[285] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[286] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[287] = new ModelRendererTurbo(this, 79, 180, textureX, textureY, BoxName.ditch); // ditchlight glow
		bodyModel[288] = new ModelRendererTurbo(this, 79, 180, textureX, textureY, BoxName.ditch); // ditchlight glow
		bodyModel[289] = new ModelRendererTurbo(this, 78, 185, textureX, textureY); // Box 296
		bodyModel[290] = new ModelRendererTurbo(this, 78, 185, textureX, textureY); // Box 297
		bodyModel[291] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[292] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[293] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[294] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[295] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[296] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[297] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[298] = new ModelRendererTurbo(this, 480, 19, textureX, textureY); // Box 305
		bodyModel[299] = new ModelRendererTurbo(this, 480, 22, textureX, textureY); // Box 306
		bodyModel[300] = new ModelRendererTurbo(this, 506, 23, textureX, textureY, BoxName.commander); // glow commander
		bodyModel[301] = new ModelRendererTurbo(this, 505, 20, textureX, textureY); // Box 308
		bodyModel[302] = new ModelRendererTurbo(this, 499, 23, textureX, textureY, BoxName.commander); // glow commander
		bodyModel[303] = new ModelRendererTurbo(this, 498, 20, textureX, textureY); // Box 310
		bodyModel[304] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[305] = new ModelRendererTurbo(this, 220, 34, textureX, textureY); // Box 568
		bodyModel[306] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 569
		bodyModel[307] = new ModelRendererTurbo(this, 383, 153, textureX, textureY, "cull"); // Box 457 cull
		bodyModel[308] = new ModelRendererTurbo(this, 65, 122, textureX, textureY); // Box 315
		bodyModel[309] = new ModelRendererTurbo(this, 72, 122, textureX, textureY); // Box 316
		bodyModel[310] = new ModelRendererTurbo(this, 361, 138, textureX, textureY); // Box 317
		bodyModel[311] = new ModelRendererTurbo(this, 344, 129, textureX, textureY); // Box 411
		bodyModel[312] = new ModelRendererTurbo(this, 344, 136, textureX, textureY); // Box 412
		bodyModel[313] = new ModelRendererTurbo(this, 319, 130, textureX, textureY); // Box 413
		bodyModel[314] = new ModelRendererTurbo(this, 344, 123, textureX, textureY); // Box 414
		bodyModel[315] = new ModelRendererTurbo(this, 322, 122, textureX, textureY); // Box 629
		bodyModel[316] = new ModelRendererTurbo(this, 322, 126, textureX, textureY); // Box 727
		bodyModel[317] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[318] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65

		bodyModel[0].addBox(0F, 0F, 0F, 78, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 82, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-41.5F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 56, 2, 4, 0F); // Box 36
		bodyModel[2].setRotationPoint(-20.5F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[3].setRotationPoint(-44.51F, 0F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 78, 1, 4, 0F); // Box 159
		bodyModel[4].setRotationPoint(-39.5F, 0F, 7F);

		bodyModel[5].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[5].setRotationPoint(-33F, -18F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[6].setRotationPoint(-21.5F, -18F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 72
		bodyModel[7].setRotationPoint(-32.5F, -18F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 190
		bodyModel[8].setRotationPoint(-32.5F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[9].setRotationPoint(-33.5F, -18F, -7F);

		bodyModel[10].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[10].setRotationPoint(-21F, -18F, 10.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 316
		bodyModel[11].setRotationPoint(-33.5F, -4F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[12].setRotationPoint(-33.5F, -21F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[13].setRotationPoint(-21.5F, -21F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[14].setRotationPoint(-33.5F, -21F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[15].setRotationPoint(-35.5F, -21F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[16].setRotationPoint(-35.5F, -21F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[17].setRotationPoint(-35.5F, -21F, 1F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[18].setRotationPoint(-21.5F, -21F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 220
		bodyModel[19].setRotationPoint(-32.5F, -21F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[20].setRotationPoint(-32.5F, -21F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[21].setRotationPoint(-32.5F, -21F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[22].setRotationPoint(-21.5F, -21F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[23].setRotationPoint(-33.5F, -21F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[24].setRotationPoint(-44.5F, 8F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[25].setRotationPoint(-44.5F, 7F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[26].setRotationPoint(38.5F, 2F, -16F);

		bodyModel[27].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[27].setRotationPoint(38.5F, 2F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 5F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[28].setRotationPoint(38.5F, 0F, -16F);

		bodyModel[29].addShapeBox(0F, 0F, 5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[29].setRotationPoint(38.5F, 0F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[30].setRotationPoint(38.5F, 5F, -16F);

		bodyModel[31].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		bodyModel[31].setRotationPoint(38.5F, 5F, 2F);

		bodyModel[32].addBox(0F, 0F, 5F, 3, 2, 18, 0F); // Box 266
		bodyModel[32].setRotationPoint(40.5F, 0F, -14F);

		bodyModel[33].addShapeBox(0F, 0F, 5F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[33].setRotationPoint(40.5F, 8F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[34].setRotationPoint(40.5F, 5F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[35].setRotationPoint(40.5F, 3F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 5F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[36].setRotationPoint(40.5F, 8F, -16F);

		bodyModel[37].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[37].setRotationPoint(40.5F, 5F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[38].setRotationPoint(40.5F, 3F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[39].setRotationPoint(40.5F, 0F, 4F);

		bodyModel[40].addBox(0F, 0F, 5F, 3, 3, 0, 0F); // Box 319
		bodyModel[40].setRotationPoint(40.5F, 5F, 4F);

		bodyModel[41].addBox(0F, 0F, 5F, 3, 1, 0, 0F); // Box 319
		bodyModel[41].setRotationPoint(40.5F, 3F, 4F);

		bodyModel[42].addBox(0F, 0F, 5F, 3, 3, 0, 0F); // Box 319
		bodyModel[42].setRotationPoint(40.5F, 5F, -14F);

		bodyModel[43].addBox(0F, 0F, 5F, 3, 1, 0, 0F); // Box 319
		bodyModel[43].setRotationPoint(40.5F, 3F, -14F);

		bodyModel[44].addShapeBox(0F, 0F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[44].setRotationPoint(38.5F, 1F, 5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[45].setRotationPoint(38.5F, 2F, 5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[46].setRotationPoint(38.5F, 1F, -16.5F);

		bodyModel[47].addShapeBox(0F, 0F, 5F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[47].setRotationPoint(38.5F, 2F, -16.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[48].setRotationPoint(43.5F, 0F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[49].setRotationPoint(43.5F, 7F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[50].setRotationPoint(43.5F, 8F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[51].setRotationPoint(38.5F, 2F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[52].setRotationPoint(-44.5F, 2F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 24, 1, 4, 0F); // Box 229
		bodyModel[53].setRotationPoint(-39.5F, 1F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 24, 1, 4, 0F); // Box 230
		bodyModel[54].setRotationPoint(-39.5F, 1F, 7F);

		bodyModel[55].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 231
		bodyModel[55].setRotationPoint(17.5F, 1F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[56].setRotationPoint(-15.5F, 1F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[57].setRotationPoint(-15.5F, 1F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[58].setRotationPoint(16.5F, 1F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[59].setRotationPoint(-48.5F, 3F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[60].setRotationPoint(-45.5F, 2.5F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[61].setRotationPoint(43.5F, 3F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(43.5F, 2.5F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[63].setRotationPoint(-42.5F, -8F, 0F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 43
		bodyModel[64].setRotationPoint(-39.5F, -13F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[65].setRotationPoint(-38.5F, -13F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 43
		bodyModel[66].setRotationPoint(-38.5F, -13F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 13, 14, 0F); // Box 345
		bodyModel[67].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[68].setRotationPoint(-41.48F, -13F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[69].setRotationPoint(-42.5F, -13F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[70].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[71].setRotationPoint(-42.5F, -13F, 1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[72].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 43
		bodyModel[73].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 43
		bodyModel[74].setRotationPoint(-38.5F, -10F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[75].setRotationPoint(-20.5F, -21F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[76].setRotationPoint(-18.5F, -22F, -6F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[77].setRotationPoint(-9.5F, -22.5F, -2.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[78].setRotationPoint(-10.5F, -21.5F, -4F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[79].setRotationPoint(21.5F, -22F, -3F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[80].setRotationPoint(14.5F, -22F, -3F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[81].setRotationPoint(7.5F, -22F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[82].setRotationPoint(39.5F, -21F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 21, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[83].setRotationPoint(39.5F, -21F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[84].setRotationPoint(-20.5F, -21F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[85].setRotationPoint(-10.5F, -21F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[86].setRotationPoint(-20.5F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[87].setRotationPoint(-10.5F, -21F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 11, 4, 0F); // Box 122
		bodyModel[88].setRotationPoint(-38.5F, -11F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[89].setRotationPoint(-44.5F, -8F, -7F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[90].setRotationPoint(-44.5F, -8F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 8, 10, 0F); // Box 145
		bodyModel[91].setRotationPoint(-45.5F, -8F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[92].setRotationPoint(-44.5F, -8F, 5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[93].setRotationPoint(-44.5F, -8F, 7F);

		bodyModel[94].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 258
		bodyModel[94].setRotationPoint(-41.5F, -8F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[95].setRotationPoint(-36.5F, -8F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 57, 8, 0, 0F); // Box 291
		bodyModel[96].setRotationPoint(-16.5F, -8F, 11F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[97].setRotationPoint(-20.5F, -12F, 11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[98].setRotationPoint(-19.5F, -10F, 11F);

		bodyModel[99].addBox(0F, 0F, 0F, 52, 8, 0, 0F); // Box 312
		bodyModel[99].setRotationPoint(-17.5F, -10F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[100].setRotationPoint(-19.5F, -12F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[101].setRotationPoint(-20.5F, -12F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[102].setRotationPoint(34.5F, -10F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 316
		bodyModel[103].setRotationPoint(36.5F, -8F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 303
		bodyModel[104].setRotationPoint(-45.5F, 0F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rear lamp
		bodyModel[105].setRotationPoint(41.25F, -19.01F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rear lamp
		bodyModel[106].setRotationPoint(41.25F, -21.01F, -1F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[107].setRotationPoint(40F, -21.01F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 41, 2, 4, 0F); // Box 163
		bodyModel[108].setRotationPoint(-20.5F, -2F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 164
		bodyModel[109].setRotationPoint(-17.5F, -10F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 165
		bodyModel[110].setRotationPoint(21.5F, -8F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[111].setRotationPoint(19.5F, -10F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[112].setRotationPoint(39.7F, -16.5F, -6.5F);
		bodyModel[112].rotateAngleY = -0.27925268F;

		bodyModel[113].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 169
		bodyModel[113].setRotationPoint(39.7F, -16.5F, 6.5F);
		bodyModel[113].rotateAngleY = 0.27925268F;

		bodyModel[114].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 170
		bodyModel[114].setRotationPoint(29F, -21.5F, -2.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 172
		bodyModel[115].setRotationPoint(34.5F, -21.5F, -2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[116].setRotationPoint(-4.5F, -21.5F, -1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[117].setRotationPoint(-2.5F, -21.5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[118].setRotationPoint(4.5F, -21.5F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[119].setRotationPoint(2.5F, -21.5F, -1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 177
		bodyModel[120].setRotationPoint(-11F, -22F, -6F);

		bodyModel[121].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 232
		bodyModel[121].setRotationPoint(17.5F, 1F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[122].setRotationPoint(16.5F, 1F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 5F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[123].setRotationPoint(-41.5F, 0F, -16F);

		bodyModel[124].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[124].setRotationPoint(-41.5F, 2F, -16F);

		bodyModel[125].addShapeBox(0F, 0F, 5F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[125].setRotationPoint(-40.5F, 2F, -16.5F);

		bodyModel[126].addShapeBox(0F, 0F, 5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[126].setRotationPoint(-40.5F, 1F, -16.5F);

		bodyModel[127].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[127].setRotationPoint(-44.5F, 5F, -15F);

		bodyModel[128].addBox(0F, 0F, 5F, 3, 1, 0, 0F); // Box 186
		bodyModel[128].setRotationPoint(-44.5F, 3F, -14F);

		bodyModel[129].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[129].setRotationPoint(-44.5F, 3F, -15F);

		bodyModel[130].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 188
		bodyModel[130].setRotationPoint(-41.5F, 5F, -16F);

		bodyModel[131].addBox(0F, 0F, 5F, 3, 3, 0, 0F); // Box 189
		bodyModel[131].setRotationPoint(-44.5F, 5F, -14F);

		bodyModel[132].addShapeBox(0F, 0F, 5F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[132].setRotationPoint(-44.5F, 8F, -16F);

		bodyModel[133].addBox(0F, 0F, 5F, 3, 3, 0, 0F); // Box 194
		bodyModel[133].setRotationPoint(-44.5F, 5F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 5F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 195
		bodyModel[134].setRotationPoint(-44.5F, 8F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
		bodyModel[135].setRotationPoint(-44.5F, 5F, 4F);

		bodyModel[136].addBox(0F, 0F, 5F, 3, 1, 0, 0F); // Box 197
		bodyModel[136].setRotationPoint(-44.5F, 3F, 4F);

		bodyModel[137].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		bodyModel[137].setRotationPoint(-44.5F, 3F, 4F);

		bodyModel[138].addBox(0F, 0F, 5F, 3, 2, 18, 0F); // Box 199
		bodyModel[138].setRotationPoint(-44.5F, 0F, -14F);

		bodyModel[139].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 200
		bodyModel[139].setRotationPoint(-44.5F, 0F, 4F);

		bodyModel[140].addShapeBox(0F, 0F, 5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 201
		bodyModel[140].setRotationPoint(-41.5F, 0F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 202
		bodyModel[141].setRotationPoint(-41.5F, 2F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 203
		bodyModel[142].setRotationPoint(-41.5F, 5F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[143].setRotationPoint(-40.5F, 2F, 5.5F);

		bodyModel[144].addShapeBox(0F, 0F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[144].setRotationPoint(-40.5F, 1F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 5F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[145].setRotationPoint(-44.5F, 0F, -15F);

		bodyModel[146].addBox(0F, 0F, 0F, 13, 6, 16, 0F); // Box 112
		bodyModel[146].setRotationPoint(-5F, 3F, -8F);

		bodyModel[147].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 233
		bodyModel[147].setRotationPoint(-5F, 3F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[148].setRotationPoint(-5F, 6F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 235
		bodyModel[149].setRotationPoint(-5F, 3F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 236
		bodyModel[150].setRotationPoint(-5F, 6F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[151].setRotationPoint(-6.5F, 0.5F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[152].setRotationPoint(-6.5F, 1.5F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[153].setRotationPoint(-5F, 2F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[154].setRotationPoint(-5F, 2F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[155].setRotationPoint(-6.5F, 1.5F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[156].setRotationPoint(-6.5F, 0.5F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 5, 18, 0F); // Box 247
		bodyModel[157].setRotationPoint(-14F, 3F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[158].setRotationPoint(-42.5F, -8F, -7F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[159].setRotationPoint(39F, -13.5F, -6F);
		bodyModel[159].rotateAngleY = -0.27925268F;

		bodyModel[160].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[160].setRotationPoint(39F, -13.5F, 6F);
		bodyModel[160].rotateAngleY = 0.27925268F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193
		bodyModel[161].setRotationPoint(-34.5F, -21F, -6F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 numberboard front
		bodyModel[162].setRotationPoint(-33.55F, -19.25F, -6F);
		bodyModel[162].rotateAngleY = 0.38397244F;

		bodyModel[163].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 numberboard front
		bodyModel[163].setRotationPoint(-33.55F, -19.25F, 6F);
		bodyModel[163].rotateAngleY = -0.38397244F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 196
		bodyModel[164].setRotationPoint(-34.5F, -21F, 3F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[165].setRotationPoint(-34.5F, -4F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[166].setRotationPoint(-35.5F, -4F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[167].setRotationPoint(-34.5F, -2F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 7, 12, 0F); // Box 200
		bodyModel[168].setRotationPoint(-46F, -6.5F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[169].setRotationPoint(-46F, -6.5F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 202
		bodyModel[170].setRotationPoint(-46F, -6.5F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[171].setRotationPoint(-45F, -6.5F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[172].setRotationPoint(-45F, -6.5F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // emergency light
		bodyModel[173].setRotationPoint(-36F, -20F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // markerlight glow
		bodyModel[174].setRotationPoint(-34.75F, -20.75F, 4.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // markerlight glow
		bodyModel[175].setRotationPoint(-34.75F, -20.75F, -5.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[176].setRotationPoint(-42.5F, -10F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[177].setRotationPoint(-42.5F, -12F, -1F);

		bodyModel[178].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[178].setRotationPoint(-18F, -13F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[179].setRotationPoint(-18F, -15F, -9F);

		bodyModel[180].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[180].setRotationPoint(-19F, -20.5F, -7.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[181].setRotationPoint(-33.5F, -23F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[182].setRotationPoint(-33.32F, -22F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // glow commander
		bodyModel[183].setRotationPoint(-33.5F, -23F, 4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 215
		bodyModel[184].setRotationPoint(-33.32F, -22F, 4F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[185].setRotationPoint(-35.5F, -22.5F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[186].setRotationPoint(-34.5F, -22.25F, 0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[187].setRotationPoint(-34.5F, -22.25F, -1.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[188].setRotationPoint(-33F, -21.5F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 419
		bodyModel[189].setRotationPoint(-33.5F, -22F, 1.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 421
		bodyModel[190].setRotationPoint(-33.5F, -22F, -2.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 222
		bodyModel[191].setRotationPoint(-19F, -20.5F, 6.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		bodyModel[192].setRotationPoint(28F, -22.5F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[193].setRotationPoint(34F, -22F, -4F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 225
		bodyModel[194].setRotationPoint(38.5F, -21F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 0, 28, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -14F, 0F, 0F, -14F); // Box 226
		bodyModel[195].setRotationPoint(34.5F, -21F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 20, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, -10F, 0F); // Box 227
		bodyModel[196].setRotationPoint(34.5F, -21F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 18, 10, 0F); // Box 229
		bodyModel[197].setRotationPoint(34.5F, -18F, -5F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 230
		bodyModel[198].setRotationPoint(34.5F, -11F, 6F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 231
		bodyModel[199].setRotationPoint(34.5F, -11F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 20, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, -10F, 0F); // Box 232
		bodyModel[200].setRotationPoint(34.5F, -21F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[201].setRotationPoint(-44.5F, -8F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 237
		bodyModel[202].setRotationPoint(-44.5F, -4F, -11.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[203].setRotationPoint(-44.5F, -7F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 239
		bodyModel[204].setRotationPoint(-44.5F, -4F, 10.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[205].setRotationPoint(-44.5F, -7F, 9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[206].setRotationPoint(-44.5F, -8F, 8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[207].setRotationPoint(-41.51F, -8F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243
		bodyModel[208].setRotationPoint(-41.51F, -4F, 10.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 246
		bodyModel[209].setRotationPoint(-41.5F, -8F, 10.99F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[210].setRotationPoint(-48F, 4F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 281
		bodyModel[211].setRotationPoint(-48F, 6F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[212].setRotationPoint(-49F, 7F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[213].setRotationPoint(-49F, 7F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[214].setRotationPoint(-48F, 6F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, -2F, 1, 1, 7, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 285
		bodyModel[215].setRotationPoint(-48F, 4F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 414
		bodyModel[216].setRotationPoint(-46F, 5F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[217].setRotationPoint(-46F, 5F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[218].setRotationPoint(-41.51F, -8F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 256
		bodyModel[219].setRotationPoint(-41.51F, -4F, -11.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 8, 10, 0F); // Box 257
		bodyModel[220].setRotationPoint(44.5F, -8F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 258
		bodyModel[221].setRotationPoint(44.5F, -8F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[222].setRotationPoint(43.5F, -8F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[223].setRotationPoint(43.5F, -7F, 9F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 261
		bodyModel[224].setRotationPoint(43.5F, -8F, 7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[225].setRotationPoint(43.5F, -4F, 10.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 263
		bodyModel[226].setRotationPoint(43.5F, -8F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 264
		bodyModel[227].setRotationPoint(43.5F, -8F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[228].setRotationPoint(43.5F, -8F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 266
		bodyModel[229].setRotationPoint(43.5F, -4F, -11.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[230].setRotationPoint(43.5F, -7F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		bodyModel[231].setRotationPoint(40.51F, -4F, 10.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[232].setRotationPoint(40.51F, -8F, 9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 270
		bodyModel[233].setRotationPoint(40.51F, -4F, -11.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[234].setRotationPoint(40.51F, -8F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[235].setRotationPoint(-37.5F, -19.25F, -0.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[236].setRotationPoint(-37.5F, -20.25F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[237].setRotationPoint(-37.25F, -18.75F, -0.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[238].setRotationPoint(-37.5F, -21.25F, -0.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // rear emergency light
		bodyModel[239].setRotationPoint(41F, -17.01F, -1F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 277
		bodyModel[240].setRotationPoint(39.5F, -17.01F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[241].setRotationPoint(-38F, -8.5F, -7F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[242].setRotationPoint(-37.5F, -6.5F, -7F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[243].setRotationPoint(-32.5F, -13F, -3F);

		bodyModel[244].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[244].setRotationPoint(-32.6F, -12F, -5F);
		bodyModel[244].rotateAngleY = -0.38397244F;

		bodyModel[245].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[245].setRotationPoint(-31F, -14F, -5F);
		bodyModel[245].rotateAngleY = -0.38397244F;

		bodyModel[246].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[246].setRotationPoint(-30F, -16.25F, -4F);
		bodyModel[246].rotateAngleY = 0.78539816F;

		bodyModel[247].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[247].setRotationPoint(-30F, -16.25F, -4F);
		bodyModel[247].rotateAngleY = 0.78539816F;

		bodyModel[248].addBox(0F, 0F, 0F, 1, 18, 10, 0F); // Box 285
		bodyModel[248].setRotationPoint(36.5F, -18F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 42, 9, 1, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -21F, -4F, 0F, -21F, -4F, 0F, 0F, -4F, 0F); // Box 288
		bodyModel[249].setRotationPoint(7F, -20.5F, 6.25F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 9, 3, 0F); // Box 289
		bodyModel[250].setRotationPoint(-21F, -11F, -10F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 290
		bodyModel[251].setRotationPoint(-8F, 3F, 8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[252].setRotationPoint(-8F, 2F, 7F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 292
		bodyModel[253].setRotationPoint(-8F, 3F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 293
		bodyModel[254].setRotationPoint(-8F, 6F, 8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[255].setRotationPoint(-8F, 6F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 295
		bodyModel[256].setRotationPoint(-8F, 3F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[257].setRotationPoint(-8F, 2F, -11F);

		bodyModel[258].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 297
		bodyModel[258].setRotationPoint(8F, 3F, 8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[259].setRotationPoint(8F, 2F, 7F);

		bodyModel[260].addBox(0F, 0F, 0F, 6, 6, 16, 0F); // Box 299
		bodyModel[260].setRotationPoint(8F, 3F, -8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 300
		bodyModel[261].setRotationPoint(8F, 6F, 8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[262].setRotationPoint(8F, 6F, -11F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 302
		bodyModel[263].setRotationPoint(8F, 3F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[264].setRotationPoint(8F, 2F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[265].setRotationPoint(-19.5F, -4F, 11F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[266].setRotationPoint(-20.5F, -4F, 11F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[267].setRotationPoint(-20.5F, -2F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[268].setRotationPoint(-26.5F, -22F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[269].setRotationPoint(40F, -22F, -3.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[270].setRotationPoint(-40.5F, -13.5F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[271].setRotationPoint(-33.5F, -22.5F, -0.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[272].setRotationPoint(-11F, 1F, -10.75F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[273].setRotationPoint(-11F, 1F, 9.75F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 281
		bodyModel[274].setRotationPoint(-45.5F, 0F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 282
		bodyModel[275].setRotationPoint(-45.5F, 0F, -5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 283
		bodyModel[276].setRotationPoint(43.5F, 0F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 284
		bodyModel[277].setRotationPoint(43.5F, 0F, -5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 285
		bodyModel[278].setRotationPoint(43.5F, 0F, 5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[279].setRotationPoint(-44.75F, -2F, 4.75F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[280].setRotationPoint(-44.75F, -2F, -6.75F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[281].setRotationPoint(-45F, -2F, 4.75F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[282].setRotationPoint(-45F, -2F, -6.75F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[283].setRotationPoint(42.75F, -2F, -6.75F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[284].setRotationPoint(43F, -2F, -6.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[285].setRotationPoint(43F, -2F, 4.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[286].setRotationPoint(42.75F, -2F, 4.75F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // ditchlight glow
		bodyModel[287].setRotationPoint(-46.5F, -1.75F, -6.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // ditchlight glow
		bodyModel[288].setRotationPoint(-46.5F, -1.75F, 4.75F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[289].setRotationPoint(-46.25F, -1.75F, -6.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[290].setRotationPoint(-46.25F, -1.75F, 4.75F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[291].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[292].setRotationPoint(-13.5F, 1F, -10.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[293].setRotationPoint(-13.25F, 2.5F, -10.25F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[294].setRotationPoint(32F, -21F, -8.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[295].setRotationPoint(32F, -20F, -8.7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[296].setRotationPoint(32F, -19F, -8.7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[297].setRotationPoint(32.25F, -18.5F, -8.45F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 305
		bodyModel[298].setRotationPoint(39.5F, -21F, -6.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[299].setRotationPoint(39.5F, -21F, 5.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // glow commander
		bodyModel[300].setRotationPoint(39.75F, -23F, -6.25F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 308
		bodyModel[301].setRotationPoint(39.93F, -22F, -6.25F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // glow commander
		bodyModel[302].setRotationPoint(39.75F, -23F, 5.25F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 310
		bodyModel[303].setRotationPoint(39.93F, -22F, 5.25F);

		bodyModel[304].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[304].setRotationPoint(39.5F, -22.5F, 4.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 568
		bodyModel[305].setRotationPoint(39.5F, -21.75F, 5.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 569
		bodyModel[306].setRotationPoint(39F, -22.75F, 5.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 457 cull
		bodyModel[307].setRotationPoint(43.5F, 7F, -10F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 315
		bodyModel[308].setRotationPoint(-33.5F, -23.26F, -1.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 316
		bodyModel[309].setRotationPoint(-33.5F, -23.26F, 0.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 42, 9, 1, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -21F, -4F, 0F, -21F, -4F, 0F, 0F, -4F, 0F); // Box 317
		bodyModel[310].setRotationPoint(7F, -20.5F, -7.25F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[311].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[312].setRotationPoint(-28.5F, 2F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[313].setRotationPoint(26.5F, 2F, 7F);

		bodyModel[314].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[314].setRotationPoint(26.5F, 2F, -11F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[315].setRotationPoint(-28.5F, 4F, -1F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[316].setRotationPoint(26.5F, 4F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[317].setRotationPoint(-30F, -18F, 11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[318].setRotationPoint(-30F, -18F, -12F);
	}
	ModelBlombergBnew theTrucks2 = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blomber_phase5.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.7, -0.00, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.425, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.7, -0.00, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.425, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}