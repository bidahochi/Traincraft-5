//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C2H;
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

public class ModelSD40dash2B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40dash2B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[380];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 256, 129, textureX, textureY); // Box 112
		bodyModel[7] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[8] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[11] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[13] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[14] = new ModelRendererTurbo(this, 44, 135, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 14, 135, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 98
		bodyModel[20] = new ModelRendererTurbo(this, 35, 103, textureX, textureY); // Box 197
		bodyModel[21] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 41, 135, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[24] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 38, 160, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[34] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 392, 148, textureX, textureY); // Box 164
		bodyModel[36] = new ModelRendererTurbo(this, 374, 148, textureX, textureY); // Box 259
		bodyModel[37] = new ModelRendererTurbo(this, 399, 152, textureX, textureY); // Box 261
		bodyModel[38] = new ModelRendererTurbo(this, 367, 152, textureX, textureY); // Box 262
		bodyModel[39] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 264
		bodyModel[40] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 265
		bodyModel[41] = new ModelRendererTurbo(this, 371, 150, textureX, textureY); // Box 266
		bodyModel[42] = new ModelRendererTurbo(this, 448, 71, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 400, 166, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 370, 166, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 397, 168, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 377, 168, textureX, textureY); // Box 81
		bodyModel[50] = new ModelRendererTurbo(this, 406, 150, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[52] = new ModelRendererTurbo(this, 397, 164, textureX, textureY); // Box 236
		bodyModel[53] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 439, 165, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 247, 82, textureX, textureY); // Box 193
		bodyModel[61] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[62] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[63] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 204
		bodyModel[64] = new ModelRendererTurbo(this, 373, 164, textureX, textureY); // Box 206
		bodyModel[65] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[66] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[67] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[68] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[69] = new ModelRendererTurbo(this, 268, 108, textureX, textureY); // Box 229
		bodyModel[70] = new ModelRendererTurbo(this, 270, 70, textureX, textureY); // Box 230
		bodyModel[71] = new ModelRendererTurbo(this, 378, 70, textureX, textureY); // Box 231
		bodyModel[72] = new ModelRendererTurbo(this, 370, 108, textureX, textureY); // Box 232
		bodyModel[73] = new ModelRendererTurbo(this, 308, 158, textureX, textureY); // Box 233
		bodyModel[74] = new ModelRendererTurbo(this, 308, 165, textureX, textureY); // Box 234
		bodyModel[75] = new ModelRendererTurbo(this, 309, 130, textureX, textureY); // Box 235
		bodyModel[76] = new ModelRendererTurbo(this, 309, 138, textureX, textureY); // Box 236
		bodyModel[77] = new ModelRendererTurbo(this, 272, 121, textureX, textureY); // Box 86
		bodyModel[78] = new ModelRendererTurbo(this, 272, 125, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 272, 156, textureX, textureY); // Box 255
		bodyModel[80] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 256
		bodyModel[81] = new ModelRendererTurbo(this, 333, 110, textureX, textureY); // Box 241
		bodyModel[82] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 242
		bodyModel[83] = new ModelRendererTurbo(this, 371, 68, textureX, textureY); // Box 243
		bodyModel[84] = new ModelRendererTurbo(this, 363, 110, textureX, textureY); // Box 244
		bodyModel[85] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[86] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[87] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[88] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[89] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[90] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[91] = new ModelRendererTurbo(this, 88, 132, textureX, textureY); // Box 271
		bodyModel[92] = new ModelRendererTurbo(this, 86, 146, textureX, textureY); // Box 272
		bodyModel[93] = new ModelRendererTurbo(this, 86, 141, textureX, textureY); // Box 273
		bodyModel[94] = new ModelRendererTurbo(this, 86, 136, textureX, textureY); // Box 274
		bodyModel[95] = new ModelRendererTurbo(this, 97, 136, textureX, textureY); // Box 258
		bodyModel[96] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[97] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[98] = new ModelRendererTurbo(this, 96, 125, textureX, textureY); // Box 265
		bodyModel[99] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[100] = new ModelRendererTurbo(this, 105, 125, textureX, textureY); // Box 267
		bodyModel[101] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[102] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[103] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[104] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[105] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[106] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[107] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[108] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[109] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[110] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[111] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[112] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[113] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[114] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[115] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[116] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[117] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[118] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[119] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[120] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 287
		bodyModel[121] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 288
		bodyModel[122] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 289
		bodyModel[123] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 290
		bodyModel[124] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[125] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 292
		bodyModel[126] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 293
		bodyModel[127] = new ModelRendererTurbo(this, 128, 107, textureX, textureY); // Box 294
		bodyModel[128] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[129] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[130] = new ModelRendererTurbo(this, 436, 22, textureX, textureY); // Box 297
		bodyModel[131] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 298
		bodyModel[132] = new ModelRendererTurbo(this, 436, 15, textureX, textureY); // Box 299
		bodyModel[133] = new ModelRendererTurbo(this, 413, 15, textureX, textureY); // Box 300
		bodyModel[134] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 301
		bodyModel[135] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[136] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[137] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[138] = new ModelRendererTurbo(this, 478, 84, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[139] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[140] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[141] = new ModelRendererTurbo(this, 308, 25, textureX, textureY); // Box 308
		bodyModel[142] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 309
		bodyModel[143] = new ModelRendererTurbo(this, 306, 15, textureX, textureY); // Box 310
		bodyModel[144] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[145] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[146] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[147] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[148] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[149] = new ModelRendererTurbo(this, 192, 136, textureX, textureY); // Box 316
		bodyModel[150] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[151] = new ModelRendererTurbo(this, 482, 81, textureX, textureY); // Box 318
		bodyModel[152] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[153] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 42
		bodyModel[154] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[155] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[156] = new ModelRendererTurbo(this, 10, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[157] = new ModelRendererTurbo(this, 84, 45, textureX, textureY); // Box 43
		bodyModel[158] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[159] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[160] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[161] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[162] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[163] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[164] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[165] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[166] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[167] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[168] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[169] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[170] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 cnw bELL
		bodyModel[171] = new ModelRendererTurbo(this, 106, 54, textureX, textureY); // Box 355
		bodyModel[172] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[173] = new ModelRendererTurbo(this, 232, 54, textureX, textureY); // Box 367
		bodyModel[174] = new ModelRendererTurbo(this, 234, 59, textureX, textureY); // Box 368
		bodyModel[175] = new ModelRendererTurbo(this, 244, 59, textureX, textureY); // Box 369
		bodyModel[176] = new ModelRendererTurbo(this, 244, 57, textureX, textureY); // Box 370
		bodyModel[177] = new ModelRendererTurbo(this, 234, 57, textureX, textureY); // Box 371
		bodyModel[178] = new ModelRendererTurbo(this, 244, 52, textureX, textureY); // Box 372
		bodyModel[179] = new ModelRendererTurbo(this, 234, 52, textureX, textureY); // Box 373
		bodyModel[180] = new ModelRendererTurbo(this, 232, 45, textureX, textureY); // Box 374
		bodyModel[181] = new ModelRendererTurbo(this, 234, 48, textureX, textureY); // Box 375
		bodyModel[182] = new ModelRendererTurbo(this, 244, 48, textureX, textureY); // Box 376
		bodyModel[183] = new ModelRendererTurbo(this, 237, 48, textureX, textureY); // Box 377
		bodyModel[184] = new ModelRendererTurbo(this, 237, 57, textureX, textureY); // Box 378
		bodyModel[185] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[186] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[187] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[188] = new ModelRendererTurbo(this, 172, 22, textureX, textureY); // Box 383
		bodyModel[189] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 384
		bodyModel[190] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 385
		bodyModel[191] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 386
		bodyModel[192] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 387
		bodyModel[193] = new ModelRendererTurbo(this, 208, 53, textureX, textureY); // Box 388
		bodyModel[194] = new ModelRendererTurbo(this, 255, 12, textureX, textureY); // Box 389
		bodyModel[195] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 390
		bodyModel[196] = new ModelRendererTurbo(this, 257, 15, textureX, textureY); // Box 391
		bodyModel[197] = new ModelRendererTurbo(this, 257, 5, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[198] = new ModelRendererTurbo(this, 256, 9, textureX, textureY); // Box 165
		bodyModel[199] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[200] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[201] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[203] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[204] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f
		bodyModel[205] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f
		bodyModel[206] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[207] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[208] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[209] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[210] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[211] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[212] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[213] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[214] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[215] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, "lamp"); // Box 410 glow
		bodyModel[216] = new ModelRendererTurbo(this, 340, 108, textureX, textureY); // Box 411
		bodyModel[217] = new ModelRendererTurbo(this, 342, 70, textureX, textureY); // Box 412
		bodyModel[218] = new ModelRendererTurbo(this, 362, 70, textureX, textureY); // Box 413
		bodyModel[219] = new ModelRendererTurbo(this, 354, 108, textureX, textureY); // Box 414
		bodyModel[220] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[221] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight f
		bodyModel[222] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[223] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight f
		bodyModel[224] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[225] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[226] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[227] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[228] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[229] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[230] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[231] = new ModelRendererTurbo(this, 196, 9, textureX, textureY); // Box 894
		bodyModel[232] = new ModelRendererTurbo(this, 198, 12, textureX, textureY); // Box 895
		bodyModel[233] = new ModelRendererTurbo(this, 196, 3, textureX, textureY); // Box 202
		bodyModel[234] = new ModelRendererTurbo(this, 487, 83, textureX, textureY, "lamp"); // Box 438 headlight r o canada
		bodyModel[235] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 439
		bodyModel[236] = new ModelRendererTurbo(this, 38, 98, textureX, textureY); // Box 440
		bodyModel[237] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 441
		bodyModel[238] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 442
		bodyModel[239] = new ModelRendererTurbo(this, 446, 98, textureX, textureY); // Box 443
		bodyModel[240] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 444
		bodyModel[241] = new ModelRendererTurbo(this, 449, 101, textureX, textureY); // Box 445
		bodyModel[242] = new ModelRendererTurbo(this, 330, 123, textureX, textureY); // Box 450 extended tank
		bodyModel[243] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[244] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 452
		bodyModel[245] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[246] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[247] = new ModelRendererTurbo(this, 501, 80, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[248] = new ModelRendererTurbo(this, 457, 80, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[249] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 19
		bodyModel[250] = new ModelRendererTurbo(this, 272, 116, textureX, textureY); // Box 334
		bodyModel[251] = new ModelRendererTurbo(this, 257, 124, textureX, textureY); // Box 335
		bodyModel[252] = new ModelRendererTurbo(this, 257, 131, textureX, textureY); // Box 336
		bodyModel[253] = new ModelRendererTurbo(this, 233, 122, textureX, textureY); // Box 337
		bodyModel[254] = new ModelRendererTurbo(this, 236, 131, textureX, textureY); // Box 338
		bodyModel[255] = new ModelRendererTurbo(this, 236, 124, textureX, textureY); // Box 339
		bodyModel[256] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[257] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[258] = new ModelRendererTurbo(this, 303, 114, textureX, textureY); // Box 629
		bodyModel[259] = new ModelRendererTurbo(this, 293, 114, textureX, textureY); // Box 630
		bodyModel[260] = new ModelRendererTurbo(this, 405, 123, textureX, textureY); // Box 726
		bodyModel[261] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 727
		bodyModel[262] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 382
		bodyModel[263] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[264] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[265] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f
		bodyModel[266] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f
		bodyModel[267] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[268] = new ModelRendererTurbo(this, 123, 85, textureX, textureY, "lamp"); // Box 350 liveryimg 3 glow
		bodyModel[269] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 liveryimg 3 glow
		bodyModel[270] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[271] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 354
		bodyModel[272] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 355
		bodyModel[273] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 356
		bodyModel[274] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 357
		bodyModel[275] = new ModelRendererTurbo(this, 253, 51, textureX, textureY); // Box 369
		bodyModel[276] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[277] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[278] = new ModelRendererTurbo(this, 260, 56, textureX, textureY); // Box 372
		bodyModel[279] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[280] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[281] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[282] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[283] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[284] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[285] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[286] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 298
		bodyModel[287] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[288] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[289] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[290] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[291] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[292] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[293] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[294] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[295] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[296] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[297] = new ModelRendererTurbo(this, 307, 152, textureX, textureY); // Box 278
		bodyModel[298] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 315
		bodyModel[299] = new ModelRendererTurbo(this, 256, 118, textureX, textureY); // Box 382
		bodyModel[300] = new ModelRendererTurbo(this, 234, 118, textureX, textureY); // Box 383
		bodyModel[301] = new ModelRendererTurbo(this, 501, 88, textureX, textureY, "lamp"); // Box 384 markerlight glow
		bodyModel[302] = new ModelRendererTurbo(this, 463, 88, textureX, textureY, "lamp"); // Box 385 markerlight glow
		bodyModel[303] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[304] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[305] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 388 ditchlight r
		bodyModel[306] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 389 ditchlight r
		bodyModel[307] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 446
		bodyModel[308] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 447
		bodyModel[309] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[310] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[311] = new ModelRendererTurbo(this, 86, 136, textureX, textureY); // Box 396
		bodyModel[312] = new ModelRendererTurbo(this, 88, 132, textureX, textureY); // Box 397
		bodyModel[313] = new ModelRendererTurbo(this, 86, 141, textureX, textureY); // Box 398
		bodyModel[314] = new ModelRendererTurbo(this, 86, 146, textureX, textureY); // Box 399
		bodyModel[315] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 400
		bodyModel[316] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 401
		bodyModel[317] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 402
		bodyModel[318] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 403
		bodyModel[319] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 395
		bodyModel[320] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 396
		bodyModel[321] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 397
		bodyModel[322] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 398
		bodyModel[323] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[324] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[325] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[326] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[327] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[328] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[329] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 414
		bodyModel[330] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 415
		bodyModel[331] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r
		bodyModel[332] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r
		bodyModel[333] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[334] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[335] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[336] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[337] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[338] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[339] = new ModelRendererTurbo(this, 71, 134, textureX, textureY); // Box 396
		bodyModel[340] = new ModelRendererTurbo(this, 71, 134, textureX, textureY); // Box 397
		bodyModel[341] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 398
		bodyModel[342] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 399
		bodyModel[343] = new ModelRendererTurbo(this, 88, 144, textureX, textureY); // Box 400
		bodyModel[344] = new ModelRendererTurbo(this, 88, 139, textureX, textureY); // Box 401
		bodyModel[345] = new ModelRendererTurbo(this, 89, 134, textureX, textureY); // Box 402
		bodyModel[346] = new ModelRendererTurbo(this, 89, 134, textureX, textureY); // Box 403
		bodyModel[347] = new ModelRendererTurbo(this, 88, 139, textureX, textureY); // Box 404
		bodyModel[348] = new ModelRendererTurbo(this, 88, 144, textureX, textureY); // Box 405
		bodyModel[349] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[350] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[351] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[352] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[353] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[354] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[355] = new ModelRendererTurbo(this, 449, 30, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[356] = new ModelRendererTurbo(this, 288, 19, textureX, textureY); // Box 418
		bodyModel[357] = new ModelRendererTurbo(this, 290, 29, textureX, textureY); // Box 419
		bodyModel[358] = new ModelRendererTurbo(this, 140, 80, textureX, textureY); // Box 420
		bodyModel[359] = new ModelRendererTurbo(this, 125, 145, textureX, textureY); // Box 421
		bodyModel[360] = new ModelRendererTurbo(this, 125, 116, textureX, textureY); // Box 422
		bodyModel[361] = new ModelRendererTurbo(this, 150, 116, textureX, textureY); // Box 423
		bodyModel[362] = new ModelRendererTurbo(this, 155, 145, textureX, textureY); // Box 424
		bodyModel[363] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 425
		bodyModel[364] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 426
		bodyModel[365] = new ModelRendererTurbo(this, 234, 32, textureX, textureY, "cull"); // Box 427 cull
		bodyModel[366] = new ModelRendererTurbo(this, 355, 171, textureX, textureY); // Box 418
		bodyModel[367] = new ModelRendererTurbo(this, 403, 171, textureX, textureY); // Box 419
		bodyModel[368] = new ModelRendererTurbo(this, 234, 32, textureX, textureY); // Box 430
		bodyModel[369] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 431
		bodyModel[370] = new ModelRendererTurbo(this, 222, 32, textureX, textureY); // Box 432
		bodyModel[371] = new ModelRendererTurbo(this, 224, 35, textureX, textureY); // Box 433
		bodyModel[372] = new ModelRendererTurbo(this, 190, 81, textureX, textureY); // Box 434
		bodyModel[373] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 435
		bodyModel[374] = new ModelRendererTurbo(this, 221, 81, textureX, textureY); // Box 436
		bodyModel[375] = new ModelRendererTurbo(this, 221, 87, textureX, textureY); // Box 437
		bodyModel[376] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 438
		bodyModel[377] = new ModelRendererTurbo(this, 179, 87, textureX, textureY); // Box 439
		bodyModel[378] = new ModelRendererTurbo(this, 180, 72, textureX, textureY); // Box 440
		bodyModel[379] = new ModelRendererTurbo(this, 154, 72, textureX, textureY); // Box 441

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, 0F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(37.5F, -21F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-17.5F, -2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-17.5F, -21F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 112
		bodyModel[6].setRotationPoint(-8F, 3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[7].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47.51F, 0F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[9].setRotationPoint(-43.5F, 2F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[10].setRotationPoint(-43.5F, 0F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[11].setRotationPoint(-43.5F, 5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[12].setRotationPoint(-43.5F, 5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[13].setRotationPoint(-43.5F, 0F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[14].setRotationPoint(-47.51F, -8F, -8F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-47.51F, -8F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-47.5F, -2F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-47.5F, -2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[18].setRotationPoint(-51.5F, 3F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[19].setRotationPoint(-51.51F, 0F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[20].setRotationPoint(-47.5F, 0F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(-47.5F, -8F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[22].setRotationPoint(-47.5F, -8F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[23].setRotationPoint(-48.5F, -8F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[24].setRotationPoint(-47.5F, -8F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[25].setRotationPoint(-47.5F, -8F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-50.5F, 7F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(-50.5F, 6F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[28].setRotationPoint(-50.5F, 8F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-50.5F, 7F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(-51F, 6F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-50.5F, 8F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(-48.5F, 2.5F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[33].setRotationPoint(-42.5F, 0F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[34].setRotationPoint(46.5F, 0F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[35].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[36].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[37].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[38].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[39].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[40].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[41].setRotationPoint(43.5F, 0F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(41.5F, 2F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[43].setRotationPoint(46.5F, 3F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[44].setRotationPoint(46.5F, -8F, -8F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(46.51F, -2F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(46.5F, -8F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(46.51F, -2F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[48].setRotationPoint(46.51F, -8F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[49].setRotationPoint(46.51F, -8F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[50].setRotationPoint(47.5F, 0F, -2F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[51].setRotationPoint(47.49F, -8F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[52].setRotationPoint(46.49F, -8F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(46.5F, 7F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[54].setRotationPoint(46.5F, 6F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[55].setRotationPoint(46.5F, 8F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(46.5F, 7F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(47F, 6F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[58].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[59].setRotationPoint(46.5F, 2.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[60].setRotationPoint(-47.5F, 2F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[61].setRotationPoint(-29.5F, -4F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[62].setRotationPoint(46.5F, 0F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[63].setRotationPoint(46.5F, 0F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[64].setRotationPoint(46.49F, -8F, 4F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[65].setRotationPoint(46.5F, 7F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[66].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[67].setRotationPoint(-47.5F, 8F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[68].setRotationPoint(-47.5F, 7F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[69].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[70].setRotationPoint(-42.5F, 1F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[71].setRotationPoint(11.5F, 1F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[72].setRotationPoint(11.5F, 1F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 233
		bodyModel[73].setRotationPoint(-8F, 3F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[74].setRotationPoint(-8F, 6F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 235
		bodyModel[75].setRotationPoint(-8F, 3F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 236
		bodyModel[76].setRotationPoint(-8F, 6F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[77].setRotationPoint(-5.5F, 0.5F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[78].setRotationPoint(-5.5F, 1.5F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[79].setRotationPoint(-5.5F, 1.5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[80].setRotationPoint(-5.5F, 0.5F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[81].setRotationPoint(-12.5F, 1F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[82].setRotationPoint(-12.5F, 1F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[83].setRotationPoint(10.5F, 1F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[84].setRotationPoint(10.5F, 1F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[85].setRotationPoint(-36.5F, -4F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[86].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[87].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[88].setRotationPoint(-43.5F, -6F, -11.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[89].setRotationPoint(-43.5F, -6F, 10.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[90].setRotationPoint(-43.5F, -8F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[91].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[92].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[93].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[94].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 258
		bodyModel[95].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[96].setRotationPoint(-35.5F, -12F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[97].setRotationPoint(-39.5F, -8F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[98].setRotationPoint(-43.5F, -8F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[99].setRotationPoint(-39.5F, -8F, 11F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 267
		bodyModel[100].setRotationPoint(-35.5F, -12F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[101].setRotationPoint(-49.5F, 0F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[102].setRotationPoint(-49.5F, 0F, 0F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[103].setRotationPoint(-17.5F, -10F, -7F);
		bodyModel[103].rotateAngleY = -1.57079633F;

		bodyModel[104].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[104].setRotationPoint(-14.5F, -13F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[105].setRotationPoint(-14.5F, -15F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[106].setRotationPoint(-15.5F, -22F, -6F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[107].setRotationPoint(-6.5F, -22.5F, -2.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[108].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[109].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[109].setRotationPoint(30.5F, -22F, -3F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[110].setRotationPoint(23.5F, -22F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[111].setRotationPoint(-1.5F, -22F, -3F);

		bodyModel[112].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[112].setRotationPoint(16.5F, -22F, -3F);

		bodyModel[113].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[113].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[114].setRotationPoint(-37.5F, -4F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[115].setRotationPoint(-38.5F, -4F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[116].setRotationPoint(-38.5F, -4F, 11F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[117].setRotationPoint(-37.5F, -4F, 11F);

		bodyModel[118].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[118].setRotationPoint(-16.5F, -20.5F, -7.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[119].setRotationPoint(-16.5F, -20.5F, 6.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[120].setRotationPoint(42.5F, -6F, -11.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[121].setRotationPoint(42.5F, -8F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[122].setRotationPoint(42.5F, -6F, 10.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[123].setRotationPoint(42.5F, -8F, 9F);

		bodyModel[124].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[124].setRotationPoint(-13.5F, -8F, 11F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[125].setRotationPoint(-17.5F, -4F, 7F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[126].setRotationPoint(-15.5F, -4F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[127].setRotationPoint(-14.5F, -4F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[128].setRotationPoint(-17.5F, -12F, 11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[129].setRotationPoint(-16.5F, -10F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 297
		bodyModel[130].setRotationPoint(27F, -19.5F, -7.25F);

		bodyModel[131].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 298
		bodyModel[131].setRotationPoint(16.5F, -19.5F, -7.25F);

		bodyModel[132].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 299
		bodyModel[132].setRotationPoint(27F, -19.5F, 6.25F);

		bodyModel[133].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 300
		bodyModel[133].setRotationPoint(16.5F, -19.5F, 6.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[134].setRotationPoint(46.5F, 0F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[135].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[136].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[137].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[138].setRotationPoint(38.75F, -19F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[139].setRotationPoint(40F, -19F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[140].setRotationPoint(40F, -19F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[141].setRotationPoint(-17.5F, -21F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[142].setRotationPoint(-7.5F, -21F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[143].setRotationPoint(-17.5F, -21F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[144].setRotationPoint(-7.5F, -21F, 7F);

		bodyModel[145].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[145].setRotationPoint(-14.5F, -10F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[146].setRotationPoint(-16.5F, -12F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[147].setRotationPoint(-17.5F, -12F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[148].setRotationPoint(21.5F, -10F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[149].setRotationPoint(23.5F, -8F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[150].setRotationPoint(13.5F, -22F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[151].setRotationPoint(37F, -21.5F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[152].setRotationPoint(-39.5F, -13.5F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[153].setRotationPoint(-42.5F, -8F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[154].setRotationPoint(-42.5F, -8F, 0F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[155].setRotationPoint(-40.4F, -11.5F, 5.5F);
		bodyModel[155].rotateAngleY = -0.43633231F;

		bodyModel[156].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[156].setRotationPoint(-40.4F, -11.5F, -5.5F);
		bodyModel[156].rotateAngleY = 0.43633231F;

		bodyModel[157].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[157].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[158].setRotationPoint(-38.5F, -13F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[159].setRotationPoint(-38.5F, -13F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[160].setRotationPoint(-38F, -8.5F, -7F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[161].setRotationPoint(-37.5F, -6.5F, -7F);

		bodyModel[162].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[162].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[163].setRotationPoint(-38.5F, -9F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[164].setRotationPoint(-1.5F, -21F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[165].setRotationPoint(-1.5F, -21F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[166].setRotationPoint(-6.5F, -21F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[167].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[168].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[169].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[170].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[171].setRotationPoint(-38.5F, -12F, -7.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[172].setRotationPoint(-37.5F, -11F, -7.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 367
		bodyModel[173].setRotationPoint(-26.5F, -22F, -6.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 368
		bodyModel[174].setRotationPoint(-26.5F, -22F, -6.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 369
		bodyModel[175].setRotationPoint(-21.5F, -22F, -6.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 370
		bodyModel[176].setRotationPoint(-21.5F, -22F, -4.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 371
		bodyModel[177].setRotationPoint(-26.5F, -22F, -4.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 372
		bodyModel[178].setRotationPoint(-21.5F, -22F, 4.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 373
		bodyModel[179].setRotationPoint(-26.5F, -22F, 4.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 374
		bodyModel[180].setRotationPoint(-26.5F, -22F, 4.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 375
		bodyModel[181].setRotationPoint(-26.5F, -22F, 6.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 376
		bodyModel[182].setRotationPoint(-21.5F, -22F, 6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[183].setRotationPoint(-26.5F, -23F, 5.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[184].setRotationPoint(-23.5F, -23F, -5.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[185].setRotationPoint(13.5F, -22.5F, -7F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[186].setRotationPoint(12.5F, -23.5F, -6.75F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[187].setRotationPoint(11.5F, -23.5F, -5.25F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[188].setRotationPoint(-31F, -21.5F, -0.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[189].setRotationPoint(-32.5F, -23F, -1.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[190].setRotationPoint(-31F, -23F, -0.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[191].setRotationPoint(-31.75F, -23F, 0.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[192].setRotationPoint(-30.75F, -22.5F, -0.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 388
		bodyModel[193].setRotationPoint(-26.5F, -22.5F, 0F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[194].setRotationPoint(-28.5F, -22F, -6.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[195].setRotationPoint(-28.5F, -22F, -6.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[196].setRotationPoint(-28.5F, -22F, -4.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 light
		bodyModel[197].setRotationPoint(-28F, -24F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[198].setRotationPoint(-27.82F, -23F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[199].setRotationPoint(-13.5F, 3F, -10.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[200].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[201].setRotationPoint(-13.25F, 3.5F, -10.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[202].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[203].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[204].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[205].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[206].setRotationPoint(45.5F, -2F, -6.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[207].setRotationPoint(45.75F, -2F, -6.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[208].setRotationPoint(45.75F, -2F, 4.75F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[209].setRotationPoint(45.5F, -2F, 4.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[210].setRotationPoint(-17.5F, -19F, -8.7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[211].setRotationPoint(-17.5F, -20F, -8.7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[212].setRotationPoint(-17.25F, -18.5F, -8.45F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[213].setRotationPoint(-17.5F, -21F, -8.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[214].setRotationPoint(-28.82F, -22F, -0.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow
		bodyModel[215].setRotationPoint(-29F, -23F, -0.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[216].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[217].setRotationPoint(-28.5F, 2F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[218].setRotationPoint(25.5F, 2F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[219].setRotationPoint(25.5F, 2F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[220].setRotationPoint(-22.5F, -22F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f
		bodyModel[221].setRotationPoint(-48.25F, 1F, -5.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[222].setRotationPoint(-48F, 1F, -5.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f
		bodyModel[223].setRotationPoint(-48.25F, 1F, 3.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[224].setRotationPoint(-48F, 1F, 3.75F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[225].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[226].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[227].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[228].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[229].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[230].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[231].setRotationPoint(34.5F, -23F, 4.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[232].setRotationPoint(34.5F, -22F, 4.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[233].setRotationPoint(35.5F, -23.5F, 3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight r o canada
		bodyModel[234].setRotationPoint(40F, -19F, -1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[235].setRotationPoint(-13.5F, -23F, -3F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 440
		bodyModel[236].setRotationPoint(-43.5F, -7F, -2F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[237].setRotationPoint(-44F, -6.5F, -0.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 442
		bodyModel[238].setRotationPoint(-44F, -7.5F, -1.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 443
		bodyModel[239].setRotationPoint(42F, -7.5F, -1.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[240].setRotationPoint(41F, -6.5F, -0.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 445
		bodyModel[241].setRotationPoint(40.5F, -7F, -2F);

		bodyModel[242].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[242].setRotationPoint(-11F, 1F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[243].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[244].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[245].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[246].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[247].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[247].setRotationPoint(37.95F, -16F, -6F);
		bodyModel[247].rotateAngleY = -0.41887902F;

		bodyModel[248].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[248].setRotationPoint(37.95F, -16F, 6F);
		bodyModel[248].rotateAngleY = 0.41887902F;

		bodyModel[249].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[249].setRotationPoint(-8F, 2F, -11.5F);
		bodyModel[249].rotateAngleX = 0.87266463F;

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[250].setRotationPoint(-8F, 3.5F, 8.75F);
		bodyModel[250].rotateAngleX = 0.87266463F;

		bodyModel[251].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 335
		bodyModel[251].setRotationPoint(-11F, 3F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[252].setRotationPoint(-11F, 6F, -11F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[253].setRotationPoint(-11F, 3F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[254].setRotationPoint(-11F, 6F, 8F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 339
		bodyModel[255].setRotationPoint(-11F, 3F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[256].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[257].setRotationPoint(-24.82F, -22F, -0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[258].setRotationPoint(-26.5F, 4F, -1F);

		bodyModel[259].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[259].setRotationPoint(-33.5F, 4F, -1F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[260].setRotationPoint(30.5F, 4F, -1F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[261].setRotationPoint(23.5F, 4F, -1F);

		bodyModel[262].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[262].setRotationPoint(-39.5F, -21F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[263].setRotationPoint(-42.5F, -21F, -7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[264].setRotationPoint(-42.5F, -21F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f
		bodyModel[265].setRotationPoint(-43F, -19F, 0F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f
		bodyModel[266].setRotationPoint(-43F, -19F, -2F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[267].setRotationPoint(-42.75F, -19F, -2F);

		bodyModel[268].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 liveryimg 3 glow
		bodyModel[268].setRotationPoint(-40F, -16F, 6F);
		bodyModel[268].rotateAngleY = -0.40142573F;

		bodyModel[269].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 liveryimg 3 glow
		bodyModel[269].setRotationPoint(-40F, -16F, -6F);
		bodyModel[269].rotateAngleY = 0.40142573F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[270].setRotationPoint(-39.5F, -21.5F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[271].setRotationPoint(-42F, -23F, -5.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[272].setRotationPoint(-41F, -22.75F, -4.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[273].setRotationPoint(-41.5F, -22.75F, -6.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[274].setRotationPoint(-39.5F, -22F, -5.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[275].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[276].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[277].setRotationPoint(-18.5F, -23F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[278].setRotationPoint(-18.5F, -24F, 4F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[279].setRotationPoint(-15.5F, -23F, 6F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[280].setRotationPoint(-15.5F, -23F, 2F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[281].setRotationPoint(-42.5F, -10F, 1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[282].setRotationPoint(-41.48F, -13F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[283].setRotationPoint(-42.5F, -10F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[284].setRotationPoint(-42.5F, -12F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[285].setRotationPoint(-42.5F, -13F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[286].setRotationPoint(-42.5F, -10F, -7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[287].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[288].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[289].setRotationPoint(-42.5F, -11F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[290].setRotationPoint(-42.5F, -13F, 1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[291].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[292].setRotationPoint(-42.25F, -12F, -2F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[293].setRotationPoint(-42.25F, -12F, 0F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[294].setRotationPoint(-42.25F, -14F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[295].setRotationPoint(-41.48F, -14F, -1.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[296].setRotationPoint(-41.65F, -13F, -2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[297].setRotationPoint(-8F, 2F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[298].setRotationPoint(-8F, 2F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[299].setRotationPoint(-11F, 2F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[300].setRotationPoint(-11F, 2F, 7F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[301].setRotationPoint(37.4F, -13.5F, -5.5F);
		bodyModel[301].rotateAngleY = -0.43633231F;

		bodyModel[302].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[302].setRotationPoint(37.4F, -13.5F, 5.5F);
		bodyModel[302].rotateAngleY = 0.43633231F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[303].setRotationPoint(46F, 1F, 3.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[304].setRotationPoint(46F, 1F, -5.75F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r
		bodyModel[305].setRotationPoint(46.25F, 1F, -5.75F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r
		bodyModel[306].setRotationPoint(46.25F, 1F, 3.75F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[307].setRotationPoint(-51F, 4F, -10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[308].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[309].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[310].setRotationPoint(-50.5F, 5F, -10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[311].setRotationPoint(42.5F, 3F, -9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[312].setRotationPoint(43.5F, 1F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[313].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[314].setRotationPoint(42.5F, 8F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		bodyModel[315].setRotationPoint(42.5F, 8F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 401
		bodyModel[316].setRotationPoint(42.5F, 5F, 8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[317].setRotationPoint(42.5F, 3F, 7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[318].setRotationPoint(43.5F, 1F, 7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[319].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[320].setRotationPoint(46.5F, 5F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[321].setRotationPoint(47F, 4F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[322].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[323].setRotationPoint(-37.5F, -2F, -11F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[324].setRotationPoint(-37.5F, -2F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[325].setRotationPoint(-48.5F, -3F, -5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[326].setRotationPoint(-48.5F, -3F, 3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[327].setRotationPoint(-48.75F, -3F, -5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[328].setRotationPoint(-48.75F, -3F, 3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[329].setRotationPoint(46.5F, -3F, 3F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[330].setRotationPoint(46.5F, -3F, -5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r
		bodyModel[331].setRotationPoint(46.75F, -3F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r
		bodyModel[332].setRotationPoint(46.75F, -3F, 3F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[333].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[334].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[335].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[336].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[337].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[337].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[338].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[339].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[340].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 397
		bodyModel[340].setRotationPoint(43.5F, 2F, 7F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 398
		bodyModel[341].setRotationPoint(42.5F, 4F, 8F);

		bodyModel[342].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 399
		bodyModel[342].setRotationPoint(42.5F, 7F, 9F);

		bodyModel[343].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[343].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[344].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[344].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[345].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 403
		bodyModel[346].setRotationPoint(43.5F, 2F, -7F);

		bodyModel[347].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 404
		bodyModel[347].setRotationPoint(42.5F, 4F, -8F);

		bodyModel[348].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 405
		bodyModel[348].setRotationPoint(42.5F, 7F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[349].setRotationPoint(-28.5F, -22F, 4.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[350].setRotationPoint(-28.5F, -22.5F, 4.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[351].setRotationPoint(-28.5F, -22.5F, 4.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[352].setRotationPoint(-28.5F, -22.5F, 4.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[353].setRotationPoint(-28.5F, -22.5F, 4.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[354].setRotationPoint(-29F, -21F, 4.5F);

		bodyModel[355].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[355].setRotationPoint(15F, -22.5F, -3.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[356].setRotationPoint(-17.5F, -21F, 11F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[357].setRotationPoint(-17.5F, -21F, -7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(0F, 0F, 0F, 12, 21, 14, 0F); // Box 420
		bodyModel[358].setRotationPoint(-29.5F, -21F, -7F);

		bodyModel[359].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 421
		bodyModel[359].setRotationPoint(-29.5F, -12F, -11F);

		bodyModel[360].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 422
		bodyModel[360].setRotationPoint(-29.5F, -12F, 11F);

		bodyModel[361].addBox(0F, 0F, 0F, 26, 8, 0, 0F); // Box 423
		bodyModel[361].setRotationPoint(-39.5F, -8F, 11F);

		bodyModel[362].addBox(0F, 0F, 0F, 23, 8, 0, 0F); // Box 424
		bodyModel[362].setRotationPoint(-39.5F, -8F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 425
		bodyModel[363].setRotationPoint(-16.5F, -10F, -11F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[364].setRotationPoint(-36.5F, -23F, 0F);

		bodyModel[365].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 427 cull
		bodyModel[365].setRotationPoint(-24.5F, -22.5F, -5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[366].setRotationPoint(46.5F, 0F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[367].setRotationPoint(46.5F, 0F, -7F);

		bodyModel[368].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[368].setRotationPoint(-26.5F, -22F, -3.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 431
		bodyModel[369].setRotationPoint(-28F, -22.75F, -2.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 432
		bodyModel[370].setRotationPoint(-29F, -23F, -3.5F);

		bodyModel[371].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 433
		bodyModel[371].setRotationPoint(-28.5F, -22.75F, -4.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[372].setRotationPoint(-22.5F, -21F, 9F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[373].setRotationPoint(-35.5F, -21F, 9F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 436
		bodyModel[374].setRotationPoint(-17.5F, -21F, 9F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 437
		bodyModel[375].setRotationPoint(-17.5F, -21F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 438
		bodyModel[376].setRotationPoint(-22.5F, -21F, -7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 439
		bodyModel[377].setRotationPoint(-35.5F, -21F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 440
		bodyModel[378].setRotationPoint(-22.5F, -22F, 3F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 441
		bodyModel[379].setRotationPoint(-29.5F, -22F, 3F);
		bodyModel[379].rotateAngleY = -3.14159265F;
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15435) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
		} else if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.975F, 0.01F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.9F, 0.01F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}