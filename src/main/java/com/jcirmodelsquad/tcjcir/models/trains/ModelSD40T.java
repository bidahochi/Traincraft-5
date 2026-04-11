//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.06.2022 - 19:40:49
// Last changed on: 19.06.2022 - 19:40:49

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
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

public class ModelSD40T extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40T() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[471];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 258, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 314, 29, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[4] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[6] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[7] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[8] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[9] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 98
		bodyModel[12] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 266, 76, textureX, textureY); // Box 159
		bodyModel[19] = new ModelRendererTurbo(this, 370, 170, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 407, 178, textureX, textureY); // Box 246
		bodyModel[21] = new ModelRendererTurbo(this, 462, 114, textureX, textureY); // Box 266
		bodyModel[22] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[23] = new ModelRendererTurbo(this, 366, 146, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 406, 150, textureX, textureY); // Box 179
		bodyModel[25] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[33] = new ModelRendererTurbo(this, 365, 178, textureX, textureY); // Box 201
		bodyModel[34] = new ModelRendererTurbo(this, 417, 140, textureX, textureY); // Box 202
		bodyModel[35] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[36] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[40] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[41] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[42] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[43] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[44] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[45] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[46] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[48] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[49] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[50] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 271
		bodyModel[51] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 274
		bodyModel[52] = new ModelRendererTurbo(this, 97, 136, textureX, textureY); // Box 258
		bodyModel[53] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[54] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[55] = new ModelRendererTurbo(this, 96, 125, textureX, textureY); // Box 265
		bodyModel[56] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[57] = new ModelRendererTurbo(this, 105, 125, textureX, textureY); // Box 267
		bodyModel[58] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[59] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[60] = new ModelRendererTurbo(this, 304, 38, textureX, textureY); // Box 270
		bodyModel[61] = new ModelRendererTurbo(this, 292, 55, textureX, textureY); // Box 271
		bodyModel[62] = new ModelRendererTurbo(this, 292, 50, textureX, textureY); // Box 272
		bodyModel[63] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[64] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[65] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[66] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[67] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[68] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[69] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[70] = new ModelRendererTurbo(this, 415, 169, textureX, textureY); // Box 288
		bodyModel[71] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[72] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[73] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[74] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[75] = new ModelRendererTurbo(this, 299, 25, textureX, textureY); // Box 308
		bodyModel[76] = new ModelRendererTurbo(this, 288, 25, textureX, textureY); // Box 309
		bodyModel[77] = new ModelRendererTurbo(this, 306, 15, textureX, textureY); // Box 310
		bodyModel[78] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[79] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[80] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[81] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[82] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[83] = new ModelRendererTurbo(this, 198, 136, textureX, textureY); // Box 316
		bodyModel[84] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[85] = new ModelRendererTurbo(this, 84, 45, textureX, textureY); // Box 43
		bodyModel[86] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[87] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[88] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[89] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[90] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[91] = new ModelRendererTurbo(this, 75, 61, textureX, textureY); // Box 346 cover
		bodyModel[92] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[99] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[100] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[101] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[102] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 384
		bodyModel[103] = new ModelRendererTurbo(this, 156, 32, textureX, textureY); // Box 385
		bodyModel[104] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 386
		bodyModel[105] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 387
		bodyModel[106] = new ModelRendererTurbo(this, 255, 12, textureX, textureY); // Box 389
		bodyModel[107] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 390
		bodyModel[108] = new ModelRendererTurbo(this, 257, 15, textureX, textureY); // Box 391
		bodyModel[109] = new ModelRendererTurbo(this, 257, 5, textureX, textureY, BoxName.commander); // Box 162 commander beacon
		bodyModel[110] = new ModelRendererTurbo(this, 256, 9, textureX, textureY); // Box 165
		bodyModel[111] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[113] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[114] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[115] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[116] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front a
		bodyModel[117] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front a
		bodyModel[118] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[119] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear a
		bodyModel[120] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 241ditchlight rear a
		bodyModel[121] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[122] = new ModelRendererTurbo(this, 249, 19, textureX, textureY); // Box 409
		bodyModel[123] = new ModelRendererTurbo(this, 250, 15, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[124] = new ModelRendererTurbo(this, 253, 47, textureX, textureY); // Box 415
		bodyModel[125] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight front b
		bodyModel[126] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 417
		bodyModel[127] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight front b
		bodyModel[128] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 419
		bodyModel[129] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box64
		bodyModel[130] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box65
		bodyModel[131] = new ModelRendererTurbo(this, 73, 12, textureX, textureY); // Box 350
		bodyModel[132] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 351
		bodyModel[133] = new ModelRendererTurbo(this, 175, 44, textureX, textureY); // Box 336
		bodyModel[134] = new ModelRendererTurbo(this, 184, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[135] = new ModelRendererTurbo(this, 172, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[136] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[137] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[138] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[139] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[140] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[141] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[142] = new ModelRendererTurbo(this, 260, 47, textureX, textureY); // Box 439
		bodyModel[143] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 451
		bodyModel[144] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 452
		bodyModel[145] = new ModelRendererTurbo(this, 348, 189, textureX, textureY); // Box 326
		bodyModel[146] = new ModelRendererTurbo(this, 348, 186, textureX, textureY); // Box 327
		bodyModel[147] = new ModelRendererTurbo(this, 348, 183, textureX, textureY); // Box 329
		bodyModel[148] = new ModelRendererTurbo(this, 348, 180, textureX, textureY); // Box 330
		bodyModel[149] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, BoxName.commander); // Box 340 commander beacon
		bodyModel[150] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[151] = new ModelRendererTurbo(this, 250, 27, textureX, textureY); // Box 369
		bodyModel[152] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[153] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[154] = new ModelRendererTurbo(this, 260, 49, textureX, textureY); // Box 372
		bodyModel[155] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[156] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[157] = new ModelRendererTurbo(this, 442, 137, textureX, textureY); // Box 364
		bodyModel[158] = new ModelRendererTurbo(this, 190, 193, textureX, textureY); // Box 365
		bodyModel[159] = new ModelRendererTurbo(this, 190, 198, textureX, textureY); // Box 366
		bodyModel[160] = new ModelRendererTurbo(this, 338, 189, textureX, textureY); // Box 372
		bodyModel[161] = new ModelRendererTurbo(this, 357, 169, textureX, textureY); // Box 373
		bodyModel[162] = new ModelRendererTurbo(this, 338, 186, textureX, textureY); // Box 374
		bodyModel[163] = new ModelRendererTurbo(this, 338, 183, textureX, textureY); // Box 375
		bodyModel[164] = new ModelRendererTurbo(this, 338, 180, textureX, textureY); // Box 376
		bodyModel[165] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 448
		bodyModel[166] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 449
		bodyModel[167] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[168] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[169] = new ModelRendererTurbo(this, 478, 102, textureX, textureY); // Box 381 sp mount
		bodyModel[170] = new ModelRendererTurbo(this, 476, 94, textureX, textureY); // Box 31 sp mount
		bodyModel[171] = new ModelRendererTurbo(this, 491, 102, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[172] = new ModelRendererTurbo(this, 471, 102, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[173] = new ModelRendererTurbo(this, 471, 108, textureX, textureY, "lamp"); // Box 386 lamp rear
		bodyModel[174] = new ModelRendererTurbo(this, 491, 108, textureX, textureY, "lamp"); // Box 387lamp rear
		bodyModel[175] = new ModelRendererTurbo(this, 484, 90, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[176] = new ModelRendererTurbo(this, 487, 96, textureX, textureY); // Box 389 sp mount
		bodyModel[177] = new ModelRendererTurbo(this, 405, 159, textureX, textureY); // Box 390
		bodyModel[178] = new ModelRendererTurbo(this, 367, 159, textureX, textureY); // Box 391
		bodyModel[179] = new ModelRendererTurbo(this, 471, 92, textureX, textureY); // Box 392
		bodyModel[180] = new ModelRendererTurbo(this, 491, 92, textureX, textureY); // Box 393
		bodyModel[181] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 42
		bodyModel[182] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[183] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[184] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48 lamp
		bodyModel[185] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp drgw
		bodyModel[186] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp drgw
		bodyModel[187] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[188] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 298
		bodyModel[189] = new ModelRendererTurbo(this, 26, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[190] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[191] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[192] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp
		bodyModel[193] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp
		bodyModel[194] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp gyralight
		bodyModel[195] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[196] = new ModelRendererTurbo(this, 405, 247, textureX, textureY); // Box 20
		bodyModel[197] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 297
		bodyModel[198] = new ModelRendererTurbo(this, 475, 76, textureX, textureY); // Box 298 drgw mount
		bodyModel[199] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 299 lamp drgw rear
		bodyModel[200] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 300 lamp drgw rear
		bodyModel[201] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[202] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[203] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 303
		bodyModel[204] = new ModelRendererTurbo(this, 179, 31, textureX, textureY, "cull"); // Box 304
		bodyModel[205] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 305
		bodyModel[206] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 306
		bodyModel[207] = new ModelRendererTurbo(this, 221, 35, textureX, textureY); // Box 307
		bodyModel[208] = new ModelRendererTurbo(this, 223, 32, textureX, textureY); // Box 308
		bodyModel[209] = new ModelRendererTurbo(this, 230, 31, textureX, textureY); // Box 309
		bodyModel[210] = new ModelRendererTurbo(this, 223, 29, textureX, textureY); // Box 310
		bodyModel[211] = new ModelRendererTurbo(this, 482, 75, textureX, textureY); // Box 313 drgw mount
		bodyModel[212] = new ModelRendererTurbo(this, 471, 144, textureX, textureY); // Box 314
		bodyModel[213] = new ModelRendererTurbo(this, 208, 23, textureX, textureY); // Box 320
		bodyModel[214] = new ModelRendererTurbo(this, 208, 20, textureX, textureY); // Box 321
		bodyModel[215] = new ModelRendererTurbo(this, 205, 15, textureX, textureY); // Box 323
		bodyModel[216] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 324
		bodyModel[217] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 272
		bodyModel[218] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 273
		bodyModel[219] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 275
		bodyModel[220] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 276
		bodyModel[221] = new ModelRendererTurbo(this, 347, 176, textureX, textureY); // Box 329
		bodyModel[222] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Box 330
		bodyModel[223] = new ModelRendererTurbo(this, 338, 176, textureX, textureY); // Box 331
		bodyModel[224] = new ModelRendererTurbo(this, 338, 178, textureX, textureY); // Box 332
		bodyModel[225] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 333
		bodyModel[226] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 334
		bodyModel[227] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 335
		bodyModel[228] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 336
		bodyModel[229] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 337 ditchlight rear b
		bodyModel[230] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 338
		bodyModel[231] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 339
		bodyModel[232] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 340 ditchlight rear b
		bodyModel[233] = new ModelRendererTurbo(this, 196, 15, textureX, textureY); // Box 341
		bodyModel[234] = new ModelRendererTurbo(this, 198, 18, textureX, textureY); // Box 342
		bodyModel[235] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[236] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[237] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[238] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[239] = new ModelRendererTurbo(this, 15, 214, textureX, textureY); // Box 340
		bodyModel[240] = new ModelRendererTurbo(this, 22, 213, textureX, textureY); // Box 341
		bodyModel[241] = new ModelRendererTurbo(this, 65, 214, textureX, textureY); // Box 342
		bodyModel[242] = new ModelRendererTurbo(this, 156, 203, textureX, textureY); // Box 299 big radiator
		bodyModel[243] = new ModelRendererTurbo(this, 157, 185, textureX, textureY); // Box 300 big radiator
		bodyModel[244] = new ModelRendererTurbo(this, 186, 177, textureX, textureY); // Box 306
		bodyModel[245] = new ModelRendererTurbo(this, 185, 211, textureX, textureY); // Box 308
		bodyModel[246] = new ModelRendererTurbo(this, 16, 203, textureX, textureY, "cull"); // Box 304 vent cull
		bodyModel[247] = new ModelRendererTurbo(this, 15, 238, textureX, textureY, "cull"); // Box 305 vent cull
		bodyModel[248] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[249] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[250] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[251] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[252] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[253] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[254] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[255] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[256] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[257] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[258] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[259] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[260] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[261] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[262] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[263] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[264] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[265] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[266] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[267] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[268] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[269] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[270] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[271] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[272] = new ModelRendererTurbo(this, 321, 239, textureX, textureY); // Box 352
		bodyModel[273] = new ModelRendererTurbo(this, 322, 221, textureX, textureY); // Box 353
		bodyModel[274] = new ModelRendererTurbo(this, 322, 230, textureX, textureY); // Box 354
		bodyModel[275] = new ModelRendererTurbo(this, 345, 239, textureX, textureY); // Box 355
		bodyModel[276] = new ModelRendererTurbo(this, 346, 229, textureX, textureY); // Box 356
		bodyModel[277] = new ModelRendererTurbo(this, 346, 219, textureX, textureY); // Box 357
		bodyModel[278] = new ModelRendererTurbo(this, 368, 227, textureX, textureY); // Box 358
		bodyModel[279] = new ModelRendererTurbo(this, 366, 232, textureX, textureY); // Box 359
		bodyModel[280] = new ModelRendererTurbo(this, 366, 224, textureX, textureY); // Box 360
		bodyModel[281] = new ModelRendererTurbo(this, 371, 224, textureX, textureY); // Box 361
		bodyModel[282] = new ModelRendererTurbo(this, 394, 235, textureX, textureY, "lamp"); // Box 365 lamp snoot
		bodyModel[283] = new ModelRendererTurbo(this, 394, 230, textureX, textureY, "lamp"); // Box 366 lamp snoot
		bodyModel[284] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[285] = new ModelRendererTurbo(this, 406, 241, textureX, textureY); // Box 368
		bodyModel[286] = new ModelRendererTurbo(this, 408, 231, textureX, textureY, "lamp"); // Box 369 lamp sp gyralight snoot
		bodyModel[287] = new ModelRendererTurbo(this, 408, 226, textureX, textureY, "lamp"); // Box 370 lamp sp snoot
		bodyModel[288] = new ModelRendererTurbo(this, 408, 236, textureX, textureY, "lamp"); // Box 371 lamp sp snoot
		bodyModel[289] = new ModelRendererTurbo(this, 384, 224, textureX, textureY); // Box 384
		bodyModel[290] = new ModelRendererTurbo(this, 377, 221, textureX, textureY); // Box 385
		bodyModel[291] = new ModelRendererTurbo(this, 377, 224, textureX, textureY); // Box 386
		bodyModel[292] = new ModelRendererTurbo(this, 384, 210, textureX, textureY); // Box 387
		bodyModel[293] = new ModelRendererTurbo(this, 101, 220, textureX, textureY); // Box 23
		bodyModel[294] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 116
		bodyModel[295] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[296] = new ModelRendererTurbo(this, 268, 194, textureX, textureY); // Box 409
		bodyModel[297] = new ModelRendererTurbo(this, 88, 235, textureX, textureY); // Box 63
		bodyModel[298] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[299] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[300] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[301] = new ModelRendererTurbo(this, 380, 65, textureX, textureY); // Box 198
		bodyModel[302] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 199
		bodyModel[303] = new ModelRendererTurbo(this, 462, 114, textureX, textureY); // Box 389
		bodyModel[304] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[305] = new ModelRendererTurbo(this, 372, 114, textureX, textureY); // Box 113
		bodyModel[306] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[307] = new ModelRendererTurbo(this, 268, 194, textureX, textureY); // Box 408
		bodyModel[308] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[309] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[310] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[311] = new ModelRendererTurbo(this, 368, 110, textureX, textureY); // Box 195
		bodyModel[312] = new ModelRendererTurbo(this, 353, 110, textureX, textureY); // Box 197
		bodyModel[313] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 200
		bodyModel[314] = new ModelRendererTurbo(this, 383, 65, textureX, textureY); // Box 201
		bodyModel[315] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[316] = new ModelRendererTurbo(this, 245, 73, textureX, textureY); // Box 4
		bodyModel[317] = new ModelRendererTurbo(this, 452, 73, textureX, textureY); // Box 203
		bodyModel[318] = new ModelRendererTurbo(this, 120, 51, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[319] = new ModelRendererTurbo(this, 120, 51, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[320] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[321] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[322] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[323] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[324] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[325] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[326] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[327] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[328] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[329] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[330] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[331] = new ModelRendererTurbo(this, 185, 154, textureX, textureY); // Box 564
		bodyModel[332] = new ModelRendererTurbo(this, 188, 166, textureX, textureY); // Box 565
		bodyModel[333] = new ModelRendererTurbo(this, 180, 150, textureX, textureY); // Box 566
		bodyModel[334] = new ModelRendererTurbo(this, 187, 161, textureX, textureY); // Box 567
		bodyModel[335] = new ModelRendererTurbo(this, 186, 156, textureX, textureY); // Box 568
		bodyModel[336] = new ModelRendererTurbo(this, 187, 161, textureX, textureY); // Box 569
		bodyModel[337] = new ModelRendererTurbo(this, 188, 166, textureX, textureY); // Box 570
		bodyModel[338] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[339] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[340] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[341] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[342] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 576
		bodyModel[343] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 577
		bodyModel[344] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[345] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[346] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[347] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[348] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box 563
		bodyModel[349] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 575
		bodyModel[350] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 436
		bodyModel[351] = new ModelRendererTurbo(this, 325, 137, textureX, textureY); // Box 437
		bodyModel[352] = new ModelRendererTurbo(this, 330, 142, textureX, textureY); // Box 438
		bodyModel[353] = new ModelRendererTurbo(this, 325, 142, textureX, textureY); // Box 439
		bodyModel[354] = new ModelRendererTurbo(this, 136, 147, textureX, textureY); // Box 438
		bodyModel[355] = new ModelRendererTurbo(this, 123, 149, textureX, textureY); // Box 439
		bodyModel[356] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[357] = new ModelRendererTurbo(this, 333, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[358] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[359] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[360] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 446
		bodyModel[361] = new ModelRendererTurbo(this, 252, 32, textureX, textureY); // Box 447
		bodyModel[362] = new ModelRendererTurbo(this, 267, 47, textureX, textureY); // Box 448
		bodyModel[363] = new ModelRendererTurbo(this, 267, 49, textureX, textureY); // Box 449
		bodyModel[364] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 450
		bodyModel[365] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[366] = new ModelRendererTurbo(this, 192, 60, textureX, textureY); // Box 284
		bodyModel[367] = new ModelRendererTurbo(this, 129, 92, textureX, textureY, "cull"); // Box 1087 cull
		bodyModel[368] = new ModelRendererTurbo(this, 131, 87, textureX, textureY); // Box 1088
		bodyModel[369] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[370] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[371] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[372] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[373] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[374] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[375] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[376] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[377] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[378] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[379] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[380] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[381] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[382] = new ModelRendererTurbo(this, 173, 57, textureX, textureY); // Box 184 o2 generator
		bodyModel[383] = new ModelRendererTurbo(this, 269, 12, textureX, textureY); // Box 421 prime base
		bodyModel[384] = new ModelRendererTurbo(this, 269, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[385] = new ModelRendererTurbo(this, 269, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[386] = new ModelRendererTurbo(this, 269, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[387] = new ModelRendererTurbo(this, 269, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[388] = new ModelRendererTurbo(this, 262, 17, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[389] = new ModelRendererTurbo(this, 57, 119, textureX, textureY); // Box 443
		bodyModel[390] = new ModelRendererTurbo(this, 57, 110, textureX, textureY); // Box 444
		bodyModel[391] = new ModelRendererTurbo(this, 60, 103, textureX, textureY); // Box 445
		bodyModel[392] = new ModelRendererTurbo(this, 60, 112, textureX, textureY); // Box 446
		bodyModel[393] = new ModelRendererTurbo(this, 33, 120, textureX, textureY); // Box 447
		bodyModel[394] = new ModelRendererTurbo(this, 80, 74, textureX, textureY); // Box 448
		bodyModel[395] = new ModelRendererTurbo(this, 124, 61, textureX, textureY); // Box 449
		bodyModel[396] = new ModelRendererTurbo(this, 122, 64, textureX, textureY); // Box 450
		bodyModel[397] = new ModelRendererTurbo(this, 75, 73, textureX, textureY); // Box 451
		bodyModel[398] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 303
		bodyModel[399] = new ModelRendererTurbo(this, 112, 96, textureX, textureY); // Box 304
		bodyModel[400] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 305
		bodyModel[401] = new ModelRendererTurbo(this, 112, 101, textureX, textureY); // Box 836
		bodyModel[402] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[403] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[404] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[405] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 312
		bodyModel[406] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 313
		bodyModel[407] = new ModelRendererTurbo(this, 169, 5, textureX, textureY, BoxName.commander); // Box 315 glow commander beacon
		bodyModel[408] = new ModelRendererTurbo(this, 174, 2, textureX, textureY); // Box 316
		bodyModel[409] = new ModelRendererTurbo(this, 179, 9, textureX, textureY); // Box 455
		bodyModel[410] = new ModelRendererTurbo(this, 179, 9, textureX, textureY); // Box 456
		bodyModel[411] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 457
		bodyModel[412] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 458
		bodyModel[413] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[414] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[415] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[416] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[417] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[418] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[419] = new ModelRendererTurbo(this, 266, 51, textureX, textureY); // Box 465
		bodyModel[420] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 355
		bodyModel[421] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[422] = new ModelRendererTurbo(this, 30, 214, textureX, textureY); // Box 544
		bodyModel[423] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[424] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[425] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[426] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[427] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[428] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[429] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[430] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[431] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[432] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[433] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[434] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[435] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[436] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[437] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[438] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[439] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[440] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[441] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[442] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Box 421 prime base
		bodyModel[443] = new ModelRendererTurbo(this, 200, 44, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[444] = new ModelRendererTurbo(this, 200, 44, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[445] = new ModelRendererTurbo(this, 200, 44, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[446] = new ModelRendererTurbo(this, 200, 44, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[447] = new ModelRendererTurbo(this, 207, 6, textureX, textureY); // Box 448
		bodyModel[448] = new ModelRendererTurbo(this, 215, 3, textureX, textureY); // Box 449
		bodyModel[449] = new ModelRendererTurbo(this, 208, 3, textureX, textureY); // Box 450
		bodyModel[450] = new ModelRendererTurbo(this, 203, 2, textureX, textureY); // Box 451
		bodyModel[451] = new ModelRendererTurbo(this, 211, 49, textureX, textureY); // Box 81
		bodyModel[452] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 82
		bodyModel[453] = new ModelRendererTurbo(this, 216, 46, textureX, textureY); // Box 83
		bodyModel[454] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 84
		bodyModel[455] = new ModelRendererTurbo(this, 225, 46, textureX, textureY); // Box 85
		bodyModel[456] = new ModelRendererTurbo(this, 225, 40, textureX, textureY); // Box 361
		bodyModel[457] = new ModelRendererTurbo(this, 113, 114, textureX, textureY); // Box 1203
		bodyModel[458] = new ModelRendererTurbo(this, 144, 55, textureX, textureY); // Box 459
		bodyModel[459] = new ModelRendererTurbo(this, 133, 52, textureX, textureY); // Box 460
		bodyModel[460] = new ModelRendererTurbo(this, 69, 73, textureX, textureY); // Box 461
		bodyModel[461] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 4
		bodyModel[462] = new ModelRendererTurbo(this, 174, 13, textureX, textureY); // Box 421 prime base
		bodyModel[463] = new ModelRendererTurbo(this, 173, 17, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[464] = new ModelRendererTurbo(this, 173, 17, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[465] = new ModelRendererTurbo(this, 173, 17, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[466] = new ModelRendererTurbo(this, 173, 17, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[467] = new ModelRendererTurbo(this, 50, 75, textureX, textureY, "cull"); // Box 467 drgw light cull
		bodyModel[468] = new ModelRendererTurbo(this, 59, 75, textureX, textureY, "lamp"); // Box 468 lamp drgw
		bodyModel[469] = new ModelRendererTurbo(this, 59, 80, textureX, textureY, "lamp"); // Box 469 lamp drgw
		bodyModel[470] = new ModelRendererTurbo(this, 253, 49, textureX, textureY); // Box 470

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 43, 2, 4, 0F); // Box 36
		bodyModel[1].setRotationPoint(-19F, -2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 64, 21, 14, 0F); // Box 34
		bodyModel[2].setRotationPoint(-19F, -21F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[3].setRotationPoint(-45F, 1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[4].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[5].setRotationPoint(-45F, 1F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[6].setRotationPoint(-45F, 5F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[7].setRotationPoint(-45F, 5F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[8].setRotationPoint(-49F, -1F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[9].setRotationPoint(-49F, -1F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[10].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[11].setRotationPoint(-53.01F, 0F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-52F, 6F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[13].setRotationPoint(-52F, 7F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[14].setRotationPoint(-52F, 6F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[15].setRotationPoint(-52.5F, 3F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-52F, 7F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-50F, 2.5F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 159
		bodyModel[18].setRotationPoint(-44F, 0F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[19].setRotationPoint(48.01F, 0F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 246
		bodyModel[20].setRotationPoint(48.02F, 2F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 266
		bodyModel[21].setRotationPoint(44F, 0F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[22].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 80
		bodyModel[23].setRotationPoint(50.01F, -8F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[24].setRotationPoint(50F, 0F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(48F, 6F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(48F, 3F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[27].setRotationPoint(48F, 7F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(48F, 6F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(48.5F, 3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(48F, 7F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[31].setRotationPoint(48F, 2.5F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[32].setRotationPoint(-31F, -4F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 201
		bodyModel[33].setRotationPoint(48.02F, 2F, 9F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202
		bodyModel[34].setRotationPoint(48F, 0F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[35].setRotationPoint(48.01F, 7F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[36].setRotationPoint(-33F, -21F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(-33F, -21F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(-33F, -21F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[39].setRotationPoint(-33.5F, -21F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[40].setRotationPoint(-33.5F, -19F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[41].setRotationPoint(48.01F, 8F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[42].setRotationPoint(-49F, 8F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[43].setRotationPoint(-49F, 7F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[44].setRotationPoint(-38F, -4F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[45].setRotationPoint(-38F, -4F, 7F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[46].setRotationPoint(-45F, -8F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[47].setRotationPoint(-45F, -6F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[48].setRotationPoint(-45F, -6F, 10.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[49].setRotationPoint(-45F, -8F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[50].setRotationPoint(-49F, 1F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[51].setRotationPoint(-49F, 3F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 258
		bodyModel[52].setRotationPoint(-45F, -8F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[53].setRotationPoint(-37F, -12F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[54].setRotationPoint(-41F, -8F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[55].setRotationPoint(-45F, -8F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[56].setRotationPoint(-41F, -8F, 11F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 267
		bodyModel[57].setRotationPoint(-37F, -12F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[58].setRotationPoint(-51F, 0F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[59].setRotationPoint(-51F, 0F, 0F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[60].setRotationPoint(-19F, -10F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[61].setRotationPoint(-16F, -13F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[62].setRotationPoint(-16F, -15F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[63].setRotationPoint(-17F, -22F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[64].setRotationPoint(-8F, -22.5F, -2.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[65].setRotationPoint(-9F, -21.5F, -4F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[66].setRotationPoint(-3F, -22F, -3F);

		bodyModel[67].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[67].setRotationPoint(4F, -22F, -3F);

		bodyModel[68].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[68].setRotationPoint(-18F, -20.5F, -7.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[69].setRotationPoint(-18F, -20.5F, 6.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 288
		bodyModel[70].setRotationPoint(44F, 1F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 291
		bodyModel[71].setRotationPoint(-14F, -8F, 11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[72].setRotationPoint(-50F, 0F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[73].setRotationPoint(-50F, 0F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[74].setRotationPoint(-50F, 0F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[75].setRotationPoint(-19F, -21F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[76].setRotationPoint(-9F, -21F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[77].setRotationPoint(-19F, -21F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[78].setRotationPoint(-9F, -21F, 7F);

		bodyModel[79].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 312
		bodyModel[79].setRotationPoint(-16F, -10F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[80].setRotationPoint(-18F, -12F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[81].setRotationPoint(-19F, -12F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[82].setRotationPoint(23F, -10F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[83].setRotationPoint(25F, -8F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[84].setRotationPoint(12F, -22F, -1F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[85].setRotationPoint(-41F, -13F, -7F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[86].setRotationPoint(-40F, -13F, -6F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[87].setRotationPoint(-40F, -13F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[88].setRotationPoint(-39.5F, -8.5F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[89].setRotationPoint(-39F, -6.5F, -7F);

		bodyModel[90].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[90].setRotationPoint(-38F, -13F, -7F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[91].setRotationPoint(-40F, -9F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[92].setRotationPoint(-3F, -21F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[93].setRotationPoint(-3F, -21F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[94].setRotationPoint(-8F, -21F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(10F, -21F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[96].setRotationPoint(10F, -21F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[97].setRotationPoint(-8F, -21F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[98].setRotationPoint(-39F, -11F, -7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[99].setRotationPoint(12F, -22.5F, -6F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[100].setRotationPoint(11F, -23.5F, -5.75F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[101].setRotationPoint(10F, -23.5F, -4.25F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[102].setRotationPoint(-33.75F, -23F, -1.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[103].setRotationPoint(-32.25F, -23F, -0.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[104].setRotationPoint(-33F, -23F, 0.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[105].setRotationPoint(-32F, -22.5F, -0.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[106].setRotationPoint(-30F, -22F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[107].setRotationPoint(-30F, -22F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[108].setRotationPoint(-30F, -22F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[109].setRotationPoint(-29.5F, -24F, -8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[110].setRotationPoint(-29.32F, -23F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[111].setRotationPoint(-15F, 2.75F, -10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[112].setRotationPoint(-15F, 1.75F, -10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[113].setRotationPoint(-14.75F, 3.25F, -10.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[114].setRotationPoint(-49F, -2F, 4.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[115].setRotationPoint(-49F, -2F, -6.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[116].setRotationPoint(-49.25F, -2F, 4.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[117].setRotationPoint(-49.25F, -2F, -6.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[118].setRotationPoint(49F, -2F, -6.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[119].setRotationPoint(49.25F, -2F, -6.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241ditchlight rear a
		bodyModel[120].setRotationPoint(49.25F, -2F, 4.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[121].setRotationPoint(49F, -2F, 4.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[122].setRotationPoint(-30.32F, -22F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[123].setRotationPoint(-30.5F, -23F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[124].setRotationPoint(-27F, -22F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight front b
		bodyModel[125].setRotationPoint(-49.75F, 1F, -5.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[126].setRotationPoint(-49.5F, 1F, -5.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight front b
		bodyModel[127].setRotationPoint(-49.75F, 1F, 3.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[128].setRotationPoint(-49.5F, 1F, 3.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[129].setRotationPoint(-28.5F, -18F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[130].setRotationPoint(-28.5F, -18F, -12F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[131].setRotationPoint(-28F, -16F, -12F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[132].setRotationPoint(-28F, -16F, 11F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[133].setRotationPoint(-33F, -23F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[134].setRotationPoint(-33.75F, -23F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[135].setRotationPoint(-33.75F, -23F, -2F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[136].setRotationPoint(3.5F, -22.5F, -8.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[137].setRotationPoint(4.5F, -22.25F, -7.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[138].setRotationPoint(4F, -22.25F, -9.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[139].setRotationPoint(6F, -21.5F, -8.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[140].setRotationPoint(5F, -23.5F, -7.75F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[141].setRotationPoint(5F, -23.5F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[142].setRotationPoint(-15F, -23F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[143].setRotationPoint(-49F, 3F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[144].setRotationPoint(-49F, 1F, 7F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[145].setRotationPoint(44F, 8F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[146].setRotationPoint(44F, 5.5F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[147].setRotationPoint(44F, 3F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 330
		bodyModel[148].setRotationPoint(44F, 0F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander beacon
		bodyModel[149].setRotationPoint(-26.5F, -23F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[150].setRotationPoint(-26.32F, -22F, -0.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[151].setRotationPoint(-20F, -23F, 2F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[152].setRotationPoint(-20F, -23F, 2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[153].setRotationPoint(-20F, -23F, 6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[154].setRotationPoint(-20F, -24F, 4F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[155].setRotationPoint(-17F, -23F, 6F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[156].setRotationPoint(-17F, -23F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 364
		bodyModel[157].setRotationPoint(49F, 0F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[158].setRotationPoint(21F, -21F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[159].setRotationPoint(21F, -21F, 7F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 372
		bodyModel[160].setRotationPoint(44F, 5.5F, 9F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 373
		bodyModel[161].setRotationPoint(44F, 1F, 9F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 374
		bodyModel[162].setRotationPoint(44F, 3F, 9F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 375
		bodyModel[163].setRotationPoint(44F, 0F, 9F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 376
		bodyModel[164].setRotationPoint(44F, 8F, 9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[165].setRotationPoint(48F, 4F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 449
		bodyModel[166].setRotationPoint(48F, 4F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[167].setRotationPoint(-52F, 4F, 2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[168].setRotationPoint(-52F, 4F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[169].setRotationPoint(44F, -22F, -2F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[170].setRotationPoint(46F, -20F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[171].setRotationPoint(46.25F, -20F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[172].setRotationPoint(46.25F, -20F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[173].setRotationPoint(45.25F, -18F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[174].setRotationPoint(45.25F, -18F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[175].setRotationPoint(46.25F, -22F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[176].setRotationPoint(46F, -22F, -1F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 390
		bodyModel[177].setRotationPoint(48F, -8F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 391
		bodyModel[178].setRotationPoint(48F, -8F, 11F);

		bodyModel[179].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 392
		bodyModel[179].setRotationPoint(45F, -16F, -6.25F);
		bodyModel[179].rotateAngleY = -0.36651914F;

		bodyModel[180].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 393
		bodyModel[180].setRotationPoint(45F, -16F, 6.25F);
		bodyModel[180].rotateAngleY = 0.36651914F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[181].setRotationPoint(-44F, -8F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[182].setRotationPoint(-44F, -8F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[183].setRotationPoint(-44F, -10F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48 lamp
		bodyModel[184].setRotationPoint(-42.98F, -13F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp drgw
		bodyModel[185].setRotationPoint(-44F, -10F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp drgw
		bodyModel[186].setRotationPoint(-44F, -12F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[187].setRotationPoint(-44F, -13F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[188].setRotationPoint(-44F, -10F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[189].setRotationPoint(-44F, -13F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[190].setRotationPoint(-44F, -13F, 1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[191].setRotationPoint(-44F, -13F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp
		bodyModel[192].setRotationPoint(-43.75F, -12F, -2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp
		bodyModel[193].setRotationPoint(-43.75F, -12F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp gyralight
		bodyModel[194].setRotationPoint(-43.75F, -14F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[195].setRotationPoint(-42.98F, -14F, -1.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[196].setRotationPoint(-46.15F, -13F, -2F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 297
		bodyModel[197].setRotationPoint(-29F, -23F, 0F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 298 drgw mount
		bodyModel[198].setRotationPoint(45F, -21F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 299 lamp drgw rear
		bodyModel[199].setRotationPoint(45.25F, -21F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 300 lamp drgw rear
		bodyModel[200].setRotationPoint(45.25F, -19F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[201].setRotationPoint(-32.32F, -22F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[202].setRotationPoint(-32.5F, -23F, -0.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 303
		bodyModel[203].setRotationPoint(-30.5F, -23F, 2.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 304
		bodyModel[204].setRotationPoint(-30.25F, -22.5F, 2.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 305
		bodyModel[205].setRotationPoint(-31.25F, -23F, 3.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 306
		bodyModel[206].setRotationPoint(-32F, -23F, 1.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 307
		bodyModel[207].setRotationPoint(14F, -23F, -1.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 308
		bodyModel[208].setRotationPoint(15.5F, -23F, -0.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 309
		bodyModel[209].setRotationPoint(15.75F, -22.5F, -0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 310
		bodyModel[210].setRotationPoint(14.75F, -23F, 0.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 313 drgw mount
		bodyModel[211].setRotationPoint(43.5F, -21.5F, -1.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 314
		bodyModel[212].setRotationPoint(48F, 7F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[213].setRotationPoint(-30F, -22.5F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[214].setRotationPoint(-30F, -23.5F, -6F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 323
		bodyModel[215].setRotationPoint(-29.5F, -24F, -5.75F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 324
		bodyModel[216].setRotationPoint(-29.5F, -23F, -3.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[217].setRotationPoint(-49F, 8F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[218].setRotationPoint(-49F, 5F, -10F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[219].setRotationPoint(-49F, 7F, -9F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[220].setRotationPoint(-49F, 4F, -8F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 329
		bodyModel[221].setRotationPoint(44F, 7F, -9F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 330
		bodyModel[222].setRotationPoint(44F, 4.5F, -9F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 331
		bodyModel[223].setRotationPoint(44F, 4.5F, 9F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[224].setRotationPoint(44F, 7F, 9F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 333
		bodyModel[225].setRotationPoint(-49F, 7F, 9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[226].setRotationPoint(-49F, 8F, 9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[227].setRotationPoint(-49F, 5F, 8F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 336
		bodyModel[228].setRotationPoint(-49F, 4F, 8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ditchlight rear b
		bodyModel[229].setRotationPoint(47.75F, 2F, 3.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 338
		bodyModel[230].setRotationPoint(47.5F, 2F, 3.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		bodyModel[231].setRotationPoint(47.5F, 2F, -5.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340 ditchlight rear b
		bodyModel[232].setRotationPoint(47.75F, 2F, -5.75F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341
		bodyModel[233].setRotationPoint(43F, -23.5F, 5.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 342
		bodyModel[234].setRotationPoint(43.5F, -22.5F, 5.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[235].setRotationPoint(13F, -19.5F, 7.7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[236].setRotationPoint(13F, -20.5F, 7.7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[237].setRotationPoint(13.25F, -19F, 7.95F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[238].setRotationPoint(13F, -21.5F, 6.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 340
		bodyModel[239].setRotationPoint(25F, -9F, -7F);

		bodyModel[240].addBox(0F, 0F, 0F, 19, 0, 14, 0F); // Box 341
		bodyModel[240].setRotationPoint(25F, -9F, -7F);

		bodyModel[241].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 342
		bodyModel[241].setRotationPoint(44F, -9F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 52, 1, 6, 0F,-0.25F, 1F, 0F, -29.25F, 1F, 0F, -29.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, -1F, 0F, -29.25F, -1F, 0F, -29.25F, 0F, 0.8F, -0.25F, 0F, 0.8F); // Box 299 big radiator
		bodyModel[242].setRotationPoint(21F, -21.75F, 0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 52, 1, 6, 0F,-0.25F, 0F, 0.8F, -29.25F, 0F, 0.8F, -29.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.8F, -29.25F, 0F, 0.8F, -29.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 300 big radiator
		bodyModel[243].setRotationPoint(21F, -21.75F, -6.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[244].setRotationPoint(21F, -22F, -7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[245].setRotationPoint(21F, -22F, 1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 304 vent cull
		bodyModel[246].setRotationPoint(25F, -8.5F, 6.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 305 vent cull
		bodyModel[247].setRotationPoint(25F, -8.5F, -7.25F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[248].setRotationPoint(-30F, -13F, 3F);

		bodyModel[249].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[249].setRotationPoint(-30.1F, -12F, 1F);
		bodyModel[249].rotateAngleY = -0.38397244F;

		bodyModel[250].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[250].setRotationPoint(-28.5F, -14F, 1F);
		bodyModel[250].rotateAngleY = -0.38397244F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[251].setRotationPoint(-30F, -22F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[252].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[253].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[254].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[255].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[256].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[257].setRotationPoint(-28F, -17F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[258].setRotationPoint(-28F, -18F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[259].setRotationPoint(-25F, -28F, 6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[260].setRotationPoint(-25F, -28F, 8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[261].setRotationPoint(-25F, -27F, 5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[262].setRotationPoint(-25F, -27F, 8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[263].setRotationPoint(-25F, -25F, 7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[264].setRotationPoint(-25F, -25F, 5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[265].setRotationPoint(-25F, -25F, -8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[266].setRotationPoint(-25F, -25F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[267].setRotationPoint(-25F, -27F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[268].setRotationPoint(-25F, -27F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[269].setRotationPoint(-25F, -28F, -8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[270].setRotationPoint(-25F, -28F, -9F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[271].setRotationPoint(-21F, -20F, -6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[272].setRotationPoint(-47F, -8F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[273].setRotationPoint(-47F, -10F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[274].setRotationPoint(-47F, -10F, 1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[275].setRotationPoint(-47F, -8F, 0F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[276].setRotationPoint(-47F, -13F, 1F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[277].setRotationPoint(-47F, -13F, -7F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 13, 13, 0F); // Box 358
		bodyModel[278].setRotationPoint(-44F, -13F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 359
		bodyModel[279].setRotationPoint(-45.98F, -13F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[280].setRotationPoint(-47F, -13F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 361
		bodyModel[281].setRotationPoint(-47F, -13F, 0F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 365 lamp snoot
		bodyModel[282].setRotationPoint(-47F, -10F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 366 lamp snoot
		bodyModel[283].setRotationPoint(-47F, -12F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[284].setRotationPoint(-43.15F, -13F, -2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 368 
		bodyModel[285].setRotationPoint(-45.98F, -14F, -1.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 369 lamp sp gyralight snoot
		bodyModel[286].setRotationPoint(-46.75F, -14F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 370 lamp sp snoot
		bodyModel[287].setRotationPoint(-46.75F, -12F, 0F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371 lamp sp snoot
		bodyModel[288].setRotationPoint(-46.75F, -12F, -2F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[289].setRotationPoint(-32F, -22.5F, 7F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[290].setRotationPoint(-31F, -22.5F, 5F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[291].setRotationPoint(-31.25F, -22.5F, 6F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[292].setRotationPoint(-30.25F, -22F, 6F);

		bodyModel[293].addBox(0F, 0F, 0F, 97, 2, 12, 0F); // Box 23
		bodyModel[293].setRotationPoint(-49F, 1F, -6F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[294].setRotationPoint(-14F, 1F, -11F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[295].setRotationPoint(-31.5F, 3F, -2F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[296].setRotationPoint(-31F, 1F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 97, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[297].setRotationPoint(-49F, 3F, -6.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[298].setRotationPoint(-31F, 2F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[299].setRotationPoint(-30F, 2F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[300].setRotationPoint(-44F, 1F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[301].setRotationPoint(-14F, 1F, 11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[302].setRotationPoint(-44F, 1F, 11F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 389
		bodyModel[303].setRotationPoint(44F, 0F, 7F);

		bodyModel[304].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Box 170
		bodyModel[304].setRotationPoint(-49F, 0F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[305].setRotationPoint(14F, 1F, -11F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[306].setRotationPoint(27.5F, 3F, -2F);

		bodyModel[307].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[307].setRotationPoint(28F, 1F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[308].setRotationPoint(28F, 2F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[309].setRotationPoint(29F, 2F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[310].setRotationPoint(28F, 2F, 6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[311].setRotationPoint(29F, 2F, 9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[312].setRotationPoint(13F, 1F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 30, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[313].setRotationPoint(14F, 1F, 11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[314].setRotationPoint(13F, 1F, 11F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[315].setRotationPoint(-15F, 0.75F, -10.9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[316].setRotationPoint(-49F, 3F, -2.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[317].setRotationPoint(43F, 3F, -2.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[318].setRotationPoint(-31.05F, -19.5F, -6F);
		bodyModel[318].rotateAngleY = 0.38397244F;

		bodyModel[319].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[319].setRotationPoint(-31.05F, -19.5F, 6F);
		bodyModel[319].rotateAngleY = -0.38397244F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[320].setRotationPoint(-41.65F, -12F, -6.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[321].setRotationPoint(-41.65F, -12F, 4.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[322].setRotationPoint(-44.65F, -12F, -6.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[323].setRotationPoint(-44.65F, -12F, 4.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[324].setRotationPoint(-8F, 3F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[325].setRotationPoint(-8F, 2F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[326].setRotationPoint(-8F, 6F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[327].setRotationPoint(-8F, 6F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[328].setRotationPoint(-8F, 2F, 8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[329].setRotationPoint(-8F, 6F, 9F);

		bodyModel[330].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[330].setRotationPoint(-8F, 2F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[331].setRotationPoint(8F, 6F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[332].setRotationPoint(8F, 6F, -11F);

		bodyModel[333].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[333].setRotationPoint(8F, 3F, -11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[334].setRotationPoint(8F, 2F, -11F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[335].setRotationPoint(8F, 2F, -8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[336].setRotationPoint(8F, 2F, 8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[337].setRotationPoint(8F, 6F, 9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[338].setRotationPoint(-12F, 6F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[339].setRotationPoint(-12F, 6F, -11F);

		bodyModel[340].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[340].setRotationPoint(-12F, 3F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[341].setRotationPoint(-12F, 2F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[342].setRotationPoint(-12F, 6F, 9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[343].setRotationPoint(-12F, 2F, 8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[344].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[345].setRotationPoint(-7F, 2F, -11.25F);
		bodyModel[345].rotateAngleX = 1.02974426F;

		bodyModel[346].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[346].setRotationPoint(-7F, 2F, 11.25F);
		bodyModel[346].rotateAngleX = 1.02974426F;
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[347].setRotationPoint(-4.5F, 1.3F, -9.5F);
		bodyModel[347].rotateAngleX = 0.78539816F;

		bodyModel[348].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[348].setRotationPoint(-4.5F, 1.3F, 9.5F);
		bodyModel[348].rotateAngleX = 0.78539816F;

		bodyModel[349].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[349].setRotationPoint(-12F, 2F, -8F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[350].setRotationPoint(-11F, 2F, -11.25F);
		bodyModel[350].rotateAngleX = 1.02974426F;

		bodyModel[351].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[351].setRotationPoint(-11F, 2F, 11.25F);
		bodyModel[351].rotateAngleX = 1.02974426F;
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[352].setRotationPoint(10.75F, 2F, -11.25F);
		bodyModel[352].rotateAngleX = 1.02974426F;

		bodyModel[353].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[353].setRotationPoint(10.75F, 2F, 11.25F);
		bodyModel[353].rotateAngleX = 1.02974426F;
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[354].setRotationPoint(-52F, 5F, 0F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[355].setRotationPoint(-52F, 5F, -10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[356].setRotationPoint(-49.5F, -4F, -4.75F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[357].setRotationPoint(-49.75F, -4F, -4.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[358].setRotationPoint(49F, -4F, 2.75F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[359].setRotationPoint(49.25F, -4F, 2.75F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 446
		bodyModel[360].setRotationPoint(-13.5F, -22.5F, 2.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 447
		bodyModel[361].setRotationPoint(-13.5F, -22.5F, -6.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[362].setRotationPoint(-13F, -23.5F, -4.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[363].setRotationPoint(-13F, -23.5F, 4.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[364].setRotationPoint(-21.75F, -24F, 5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[365].setRotationPoint(-33F, -17F, -1F);

		bodyModel[366].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[366].setRotationPoint(-29F, -19.5F, -9F);
		bodyModel[366].rotateAngleX = -0.9250245F;
		bodyModel[366].rotateAngleY = 0.01745329F;
		bodyModel[366].rotateAngleZ = -0.01745329F;

		bodyModel[367].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087 cull
		bodyModel[367].setRotationPoint(-28F, -17F, -13F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[368].setRotationPoint(-28F, -18F, -13F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[369].setRotationPoint(-49F, -8F, -6F);

		bodyModel[370].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[370].setRotationPoint(-49F, -8F, -8F);

		bodyModel[371].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[371].setRotationPoint(-50F, -8F, -4F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[372].setRotationPoint(-49F, -8F, 4F);

		bodyModel[373].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[373].setRotationPoint(-49F, -8F, 6F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[374].setRotationPoint(-49.01F, -7F, -8F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[375].setRotationPoint(-49.01F, -7F, 7F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[376].setRotationPoint(-49F, -8F, 9F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[377].setRotationPoint(-50.5F, -3F, -2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[378].setRotationPoint(-50.5F, -4F, -2F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[379].setRotationPoint(-49F, -8F, -8F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[380].setRotationPoint(-27.5F, -16.25F, 2F);
		bodyModel[380].rotateAngleY = 0.78539816F;

		bodyModel[381].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[381].setRotationPoint(-27.5F, -16.25F, 2F);
		bodyModel[381].rotateAngleY = 0.78539816F;

		bodyModel[382].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[382].setRotationPoint(-27.5F, -22.75F, -4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[383].setRotationPoint(-32F, -24F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[384].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[385].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[386].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[387].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[388].setRotationPoint(-32F, -23F, -1F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 443
		bodyModel[389].setRotationPoint(-50F, -8F, -7F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 444
		bodyModel[390].setRotationPoint(-50F, -8F, 7F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 0, 8, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[391].setRotationPoint(-51F, -8F, -7F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[392].setRotationPoint(-51F, -8F, 0F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[393].setRotationPoint(-50.7F, -8F, -2F);

		bodyModel[394].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 448
		bodyModel[394].setRotationPoint(-43F, -13F, -7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[395].setRotationPoint(-42.5F, -8.5F, -7F);

		bodyModel[396].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 450
		bodyModel[396].setRotationPoint(-42F, -6.5F, -7F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 451
		bodyModel[397].setRotationPoint(-44F, -13F, -7F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[398].setRotationPoint(-17F, -4F, 11F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[399].setRotationPoint(-18F, -2F, 7F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[400].setRotationPoint(-19F, -4F, 11F);

		bodyModel[401].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[401].setRotationPoint(-19F, -4F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[402].setRotationPoint(-19F, -12F, 11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[403].setRotationPoint(-18F, -12F, 11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[404].setRotationPoint(-15F, -8F, 11F);

		bodyModel[405].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 312
		bodyModel[405].setRotationPoint(-26F, -23.5F, -0.5F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 313
		bodyModel[406].setRotationPoint(-26F, -23.5F, 0.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow commander beacon
		bodyModel[407].setRotationPoint(-25.97F, -25.5F, -0.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[408].setRotationPoint(-25.82F, -24.5F, -0.5F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 455
		bodyModel[409].setRotationPoint(44F, -23.5F, -0.5F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 456
		bodyModel[410].setRotationPoint(44F, -23.5F, 0.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 457
		bodyModel[411].setRotationPoint(44.03F, -25.5F, -0.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 458
		bodyModel[412].setRotationPoint(44.18F, -24.5F, -0.5F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[413].setRotationPoint(-39F, -4F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[414].setRotationPoint(-40F, -4F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[415].setRotationPoint(-40F, -4F, 11F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[416].setRotationPoint(-39F, -4F, 11F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[417].setRotationPoint(-39F, -2F, -11F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[418].setRotationPoint(-39F, -2F, 7F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[419].setRotationPoint(-22.25F, -22F, 4F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 355
		bodyModel[420].setRotationPoint(-40F, -12F, -7.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[421].setRotationPoint(-42F, -13.5F, -1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 544
		bodyModel[422].setRotationPoint(-44.5F, -13.5F, -0.5F);

		bodyModel[423].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[423].setRotationPoint(-30.5F, -18F, -10.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[424].setRotationPoint(-20F, -18F, -11F);

		bodyModel[425].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[425].setRotationPoint(-30F, -18F, 10F);

		bodyModel[426].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[426].setRotationPoint(-30F, -18F, -11F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[427].setRotationPoint(-31F, -18F, -7F);

		bodyModel[428].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[428].setRotationPoint(-19.5F, -18F, 10.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[429].setRotationPoint(-31F, -21F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[430].setRotationPoint(-20F, -21F, -11F);

		bodyModel[431].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[431].setRotationPoint(-31F, -21F, -7F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[432].setRotationPoint(-20F, -21F, -7F);

		bodyModel[433].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[433].setRotationPoint(-30F, -21F, -7F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[434].setRotationPoint(-30F, -21F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[435].setRotationPoint(-30F, -21F, 7F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[436].setRotationPoint(-20F, -21F, 7F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[437].setRotationPoint(-31F, -21F, 7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[438].setRotationPoint(-45F, 0F, 7F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[439].setRotationPoint(-45F, 0F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[440].setRotationPoint(-31F, 2F, 6F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[441].setRotationPoint(-30F, 2F, 9F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[442].setRotationPoint(-26F, -22F, -1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[443].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[444].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[445].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[446].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[447].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 448
		bodyModel[447].setRotationPoint(-14F, -24F, 1.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 449
		bodyModel[448].setRotationPoint(-12.5F, -24F, 2.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 450
		bodyModel[449].setRotationPoint(-13.25F, -24F, 3.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 451
		bodyModel[450].setRotationPoint(-12.25F, -23.5F, 2.5F);

		bodyModel[451].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[451].setRotationPoint(-4F, -22.5F, -7F);

		bodyModel[452].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[452].setRotationPoint(-4F, -22.5F, -3F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[453].setRotationPoint(-5F, -23F, -6F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[454].setRotationPoint(-5F, -23F, -4F);

		bodyModel[455].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[455].setRotationPoint(-5F, -23F, -5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[456].setRotationPoint(-3.5F, -22.5F, -6F);

		bodyModel[457].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[457].setRotationPoint(-37F, -8F, 7F);

		bodyModel[458].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 459
		bodyModel[458].setRotationPoint(-42.5F, -11F, -7.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 460
		bodyModel[459].setRotationPoint(-43.5F, -12F, -7.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 461
		bodyModel[460].setRotationPoint(-43F, -9F, -7F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[461].setRotationPoint(-52F, 3F, 2F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[462].setRotationPoint(-32F, -22F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[463].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[464].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[465].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[466].setRotationPoint(-32F, -22.5F, -1F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 467 drgw light cull
		bodyModel[467].setRotationPoint(-44.5F, -12.5F, -1F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 468 lamp drgw
		bodyModel[468].setRotationPoint(-45F, -12F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 469 lamp drgw
		bodyModel[469].setRotationPoint(-45F, -10F, -1F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[470].setRotationPoint(-24F, -22F, -5F);
	}
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6 ||GetColor(entity) == 19) {
			//silvaaahhh
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.7F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9||GetColor(entity) == 5 ) {
			//dark grey dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c_dash2_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.7F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1||GetColor(entity) == 8
				||GetColor(entity) == 13||GetColor(entity) == 11
				||GetColor(entity) == 17) {
			//sp dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_C_dash2_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.7F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.85F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.7F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}