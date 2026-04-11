//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.12.2020 - 20:02:59
// Last changed on: 27.12.2020 - 20:02:59

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
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

public class ModelGP38dash9W extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP38dash9W() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[272];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 114
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 163
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 166
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 168
		bodyModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 169
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 246
		bodyModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 274
		bodyModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 164
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 259
		bodyModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 261
		bodyModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 262
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 263
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 264
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 265
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 266
		bodyModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 19
		bodyModel[21] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[25] = new ModelRendererTurbo(this, 81, 9, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[26] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 98
		bodyModel[27] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 61
		bodyModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 81
		bodyModel[32] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 255
		bodyModel[35] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 256
		bodyModel[36] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 38R
		bodyModel[37] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 176
		bodyModel[38] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 179
		bodyModel[39] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 243
		bodyModel[40] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 244
		bodyModel[41] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 249
		bodyModel[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 250
		bodyModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 239
		bodyModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[46] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 242
		bodyModel[47] = new ModelRendererTurbo(this, 153, 9, textureX, textureY, "lamp"); // Box 247 lamp rear
		bodyModel[48] = new ModelRendererTurbo(this, 401, 9, textureX, textureY, "lamp"); // Box 248 lamp rear
		bodyModel[49] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 234
		bodyModel[50] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 236
		bodyModel[51] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 237
		bodyModel[52] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 4
		bodyModel[53] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 489
		bodyModel[63] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 278
		bodyModel[64] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 281
		bodyModel[65] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 288
		bodyModel[66] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 315
		bodyModel[67] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 316
		bodyModel[68] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 273
		bodyModel[69] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 285
		bodyModel[70] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 286
		bodyModel[71] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 276
		bodyModel[72] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 277
		bodyModel[73] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 297
		bodyModel[74] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 299
		bodyModel[75] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 272
		bodyModel[76] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 273
		bodyModel[77] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 274
		bodyModel[78] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 275
		bodyModel[79] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 302
		bodyModel[80] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 303
		bodyModel[81] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 304
		bodyModel[82] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 268 anticlimber
		bodyModel[83] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 269anticlimber
		bodyModel[84] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 369
		bodyModel[85] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 370
		bodyModel[86] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 371
		bodyModel[87] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 372
		bodyModel[88] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 373
		bodyModel[89] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 374
		bodyModel[90] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 19
		bodyModel[91] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 334
		bodyModel[92] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 36
		bodyModel[96] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 271
		bodyModel[97] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 272
		bodyModel[98] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 313
		bodyModel[99] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 314
		bodyModel[100] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 315
		bodyModel[101] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 316
		bodyModel[102] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 270
		bodyModel[103] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 271
		bodyModel[104] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 272
		bodyModel[105] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 273
		bodyModel[106] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 274
		bodyModel[107] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 303
		bodyModel[108] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 304
		bodyModel[109] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 305
		bodyModel[110] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 306
		bodyModel[111] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 307
		bodyModel[112] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 74
		bodyModel[114] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 78
		bodyModel[115] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 245
		bodyModel[116] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 338
		bodyModel[117] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 339
		bodyModel[118] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 340
		bodyModel[119] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 341
		bodyModel[120] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "cull"); // Box 352 cull
		bodyModel[121] = new ModelRendererTurbo(this, 209, 33, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[122] = new ModelRendererTurbo(this, 321, 33, textureX, textureY, BoxName.ditch); // Box 354 ditchlight rear
		bodyModel[123] = new ModelRendererTurbo(this, 417, 33, textureX, textureY, BoxName.ditch); // Box 355 ditchlight rear
		bodyModel[124] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 361
		bodyModel[125] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 365
		bodyModel[126] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 366
		bodyModel[127] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 367
		bodyModel[128] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 368
		bodyModel[129] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 369
		bodyModel[130] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 477 extra stacc
		bodyModel[131] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 478 extra stacc
		bodyModel[132] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 479 extra stacc
		bodyModel[133] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 480 extra stacc
		bodyModel[134] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 510
		bodyModel[135] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 511
		bodyModel[136] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 512
		bodyModel[137] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 513
		bodyModel[138] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 351 sandcap
		bodyModel[139] = new ModelRendererTurbo(this, 1, 57, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[140] = new ModelRendererTurbo(this, 193, 57, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[141] = new ModelRendererTurbo(this, 209, 57, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[142] = new ModelRendererTurbo(this, 289, 57, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[143] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 367
		bodyModel[144] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 368
		bodyModel[145] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 369
		bodyModel[146] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 370
		bodyModel[147] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 371
		bodyModel[148] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 372
		bodyModel[149] = new ModelRendererTurbo(this, 457, 33, textureX, textureY, "lamp"); // Box 376 glow
		bodyModel[150] = new ModelRendererTurbo(this, 249, 41, textureX, textureY, "lamp"); // Box 377 glow
		bodyModel[151] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 408
		bodyModel[152] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 409
		bodyModel[153] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 515
		bodyModel[154] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 518
		bodyModel[155] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 519
		bodyModel[156] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 399
		bodyModel[157] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 400
		bodyModel[158] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 401
		bodyModel[159] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 402
		bodyModel[160] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 403
		bodyModel[161] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 404
		bodyModel[162] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 405
		bodyModel[163] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 406
		bodyModel[164] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 407
		bodyModel[165] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 408
		bodyModel[166] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 409
		bodyModel[167] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 410
		bodyModel[168] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 164
		bodyModel[169] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 3
		bodyModel[170] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 247
		bodyModel[171] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 259
		bodyModel[172] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 262
		bodyModel[173] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 263
		bodyModel[174] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 264
		bodyModel[175] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 265
		bodyModel[176] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 266
		bodyModel[177] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 271
		bodyModel[178] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 272
		bodyModel[179] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 273
		bodyModel[180] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 274
		bodyModel[181] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 275
		bodyModel[182] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 276
		bodyModel[183] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 271
		bodyModel[184] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 272
		bodyModel[185] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 273
		bodyModel[186] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 275
		bodyModel[187] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 276
		bodyModel[188] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 4
		bodyModel[189] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 261
		bodyModel[190] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 61
		bodyModel[191] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 63
		bodyModel[192] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 4
		bodyModel[193] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 78
		bodyModel[194] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 188
		bodyModel[195] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[196] = new ModelRendererTurbo(this, 465, 73, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[197] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 80
		bodyModel[198] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 144
		bodyModel[199] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 145
		bodyModel[200] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 147
		bodyModel[201] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 148
		bodyModel[202] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 4
		bodyModel[204] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 4
		bodyModel[205] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 4
		bodyModel[206] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 4
		bodyModel[207] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 4
		bodyModel[208] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 2
		bodyModel[209] = new ModelRendererTurbo(this, 489, 73, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[210] = new ModelRendererTurbo(this, 497, 73, textureX, textureY, BoxName.ditch); // Box 349 ditchlight front
		bodyModel[211] = new ModelRendererTurbo(this, 9, 81, textureX, textureY, BoxName.ditch); // Box 350 ditchlight front
		bodyModel[212] = new ModelRendererTurbo(this, 33, 81, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[213] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 516
		bodyModel[214] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 517
		bodyModel[215] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 72
		bodyModel[216] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 190
		bodyModel[217] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 316
		bodyModel[218] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 11
		bodyModel[219] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 211
		bodyModel[220] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 48
		bodyModel[221] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 43
		bodyModel[222] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 44
		bodyModel[223] = new ModelRendererTurbo(this, 129, 17, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[224] = new ModelRendererTurbo(this, 225, 65, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[225] = new ModelRendererTurbo(this, 65, 81, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[226] = new ModelRendererTurbo(this, 177, 81, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[227] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 220
		bodyModel[228] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 221
		bodyModel[229] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 222
		bodyModel[230] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 224
		bodyModel[231] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 42
		bodyModel[232] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 45
		bodyModel[233] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 42
		bodyModel[234] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 42
		bodyModel[235] = new ModelRendererTurbo(this, 345, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[236] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[237] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 345
		bodyModel[238] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 410
		bodyModel[239] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 350
		bodyModel[240] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // t
		bodyModel[241] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 72
		bodyModel[242] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // t
		bodyModel[243] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 72
		bodyModel[244] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 42
		bodyModel[245] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 42
		bodyModel[246] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 87
		bodyModel[247] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 345
		bodyModel[248] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 42
		bodyModel[249] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 87
		bodyModel[250] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 45
		bodyModel[251] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 45
		bodyModel[252] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 345
		bodyModel[253] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 318
		bodyModel[254] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 318
		bodyModel[255] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Front door
		bodyModel[256] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 72
		bodyModel[257] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 72
		bodyModel[258] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 72
		bodyModel[259] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 72
		bodyModel[260] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 42
		bodyModel[261] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 42
		bodyModel[262] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 42
		bodyModel[263] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 350
		bodyModel[264] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 210
		bodyModel[265] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 223
		bodyModel[266] = new ModelRendererTurbo(this, 81, 89, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[267] = new ModelRendererTurbo(this, 89, 89, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[268] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Light mount
		bodyModel[269] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 412 cs
		bodyModel[270] = new ModelRendererTurbo(this, 252, 116, textureX, textureY); // Box 413 cs
		bodyModel[271] = new ModelRendererTurbo(this, 274, 120, textureX, textureY); // Box 86 cs

		bodyModel[0].addBox(0F, 0F, 0F, 76, 1, 4, 0F); // Box 1
		bodyModel[0].setRotationPoint(-36F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 76, 3, 14, 0F); // Box 114
		bodyModel[1].setRotationPoint(-36F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[2].setRotationPoint(-24F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[3].setRotationPoint(27F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[4].setRotationPoint(-23F, 2F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[5].setRotationPoint(28F, 2F, -10.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[6].setRotationPoint(-41F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[7].setRotationPoint(-41F, 2F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(45.01F, 0F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(45.02F, 2F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(45.02F, 2F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[11].setRotationPoint(40F, 1F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[12].setRotationPoint(40F, 1F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[13].setRotationPoint(40F, 0F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[14].setRotationPoint(40F, 0F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[15].setRotationPoint(40F, 0F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[16].setRotationPoint(40F, 3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[17].setRotationPoint(40F, 3F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[18].setRotationPoint(42F, 0F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[19].setRotationPoint(40F, 2F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 53, 21, 14, 0F); // Box 19
		bodyModel[20].setRotationPoint(-12F, -21F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[21].setRotationPoint(42.25F, -18F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(41F, -21F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(41F, -21F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[24].setRotationPoint(41.45F, -15.5F, -6F);
		bodyModel[24].rotateAngleY = -0.41887902F;

		bodyModel[25].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[25].setRotationPoint(41.45F, -15.5F, 6F);
		bodyModel[25].rotateAngleY = 0.41887902F;

		bodyModel[26].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[26].setRotationPoint(-44F, 0F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[27].setRotationPoint(45F, 3F, -1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[28].setRotationPoint(45.02F, -2F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[29].setRotationPoint(45.02F, -2F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[30].setRotationPoint(45.02F, -8F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[31].setRotationPoint(45.02F, -8F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[32].setRotationPoint(2F, 0.5F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[33].setRotationPoint(2F, 1.5F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[34].setRotationPoint(2F, 1.5F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[35].setRotationPoint(2F, 0.5F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[36].setRotationPoint(-6F, -8F, 11.01F);

		bodyModel[37].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[37].setRotationPoint(-9F, -10F, -11.01F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[38].setRotationPoint(46F, 0F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[39].setRotationPoint(41F, -8F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[40].setRotationPoint(41F, -7F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[41].setRotationPoint(41F, -7F, -11.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[42].setRotationPoint(41F, -8F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[43].setRotationPoint(44.5F, -2F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[44].setRotationPoint(44.75F, -2F, -6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[45].setRotationPoint(44.75F, -2F, 4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[46].setRotationPoint(44.5F, -2F, 4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp rear
		bodyModel[47].setRotationPoint(43.5F, -18F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp rear
		bodyModel[48].setRotationPoint(43.5F, -18F, 0F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[49].setRotationPoint(46F, -8F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[50].setRotationPoint(45F, -8F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[51].setRotationPoint(45F, -8F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[52].setRotationPoint(45F, 6F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(45F, 5F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[54].setRotationPoint(45F, 7F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[55].setRotationPoint(45F, 6F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(45.5F, 5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(45F, 7F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[58].setRotationPoint(45F, 2.5F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[59].setRotationPoint(-8F, 2F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[60].setRotationPoint(-8F, 1F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[61].setRotationPoint(-7.75F, 2.5F, -10.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 15, 3, 22, 0F); // Box 489
		bodyModel[62].setRotationPoint(-2F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[63].setRotationPoint(-2F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[64].setRotationPoint(-2F, 6F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[65].setRotationPoint(-2F, 6F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[66].setRotationPoint(-2F, 2F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[67].setRotationPoint(-2F, 6F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[68].setRotationPoint(-11F, -22F, -6F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[69].setRotationPoint(-11F, -20.5F, -7.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[70].setRotationPoint(-11F, -20.5F, 6.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[71].setRotationPoint(32F, -22.5F, -3F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[72].setRotationPoint(24F, -22.5F, -3F);

		bodyModel[73].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 297
		bodyModel[73].setRotationPoint(31F, -19.5F, -7.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 299
		bodyModel[74].setRotationPoint(31F, -19.5F, 6.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 272
		bodyModel[75].setRotationPoint(21.5F, -19.5F, -7.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 273
		bodyModel[76].setRotationPoint(21.5F, -19.5F, 6.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[77].setRotationPoint(4.5F, -22F, -2.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275
		bodyModel[78].setRotationPoint(17.5F, -22F, -2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[79].setRotationPoint(-42F, 0F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[80].setRotationPoint(-42F, 0F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[81].setRotationPoint(-42F, 0F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[82].setRotationPoint(-43F, 0F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[83].setRotationPoint(-43F, 0F, 0F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[84].setRotationPoint(-12.5F, -23F, 2F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[85].setRotationPoint(-12.5F, -23F, 2F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[86].setRotationPoint(-12.5F, -23F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[87].setRotationPoint(-12.5F, -24F, 4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[88].setRotationPoint(-9.5F, -23F, 6F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[89].setRotationPoint(-9.5F, -23F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[90].setRotationPoint(-1F, 2F, -11.5F);
		bodyModel[90].rotateAngleX = 0.87266463F;

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[91].setRotationPoint(-1F, 3.5F, 8.75F);
		bodyModel[91].rotateAngleX = 0.87266463F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[92].setRotationPoint(45F, 0F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[93].setRotationPoint(45F, 0F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 245
		bodyModel[94].setRotationPoint(45F, 0F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 36
		bodyModel[95].setRotationPoint(-12F, -2F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[96].setRotationPoint(-10F, -13F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[97].setRotationPoint(-10F, -15F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[98].setRotationPoint(-11F, -12F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[99].setRotationPoint(-12F, -12F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[100].setRotationPoint(23F, -10F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[101].setRotationPoint(25F, -8F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[102].setRotationPoint(-12F, -10F, -10.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[103].setRotationPoint(20.5F, -23.25F, 0.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[104].setRotationPoint(20F, -23.25F, -1.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 273
		bodyModel[105].setRotationPoint(22F, -22.5F, -0.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 274
		bodyModel[106].setRotationPoint(19.5F, -23.5F, -0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[107].setRotationPoint(-8F, -4F, 11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 304
		bodyModel[108].setRotationPoint(-8F, -2F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 305
		bodyModel[109].setRotationPoint(-12F, -4F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 306
		bodyModel[110].setRotationPoint(-12F, -12F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[111].setRotationPoint(-10F, -12F, 11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[112].setRotationPoint(5.5F, -19F, -8.7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[113].setRotationPoint(5.5F, -20F, -8.7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[114].setRotationPoint(5.75F, -18.5F, -8.45F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[115].setRotationPoint(5.5F, -21F, -8.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[116].setRotationPoint(-8F, -24.25F, -1.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[117].setRotationPoint(-8.5F, -24.5F, -0.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[118].setRotationPoint(-7.5F, -24.25F, 0.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 341
		bodyModel[119].setRotationPoint(-6F, -23.5F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[120].setRotationPoint(44.5F, 1F, -5.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[121].setRotationPoint(44.5F, 1F, 3.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear
		bodyModel[122].setRotationPoint(44.75F, 1F, 3.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear
		bodyModel[123].setRotationPoint(44.75F, 1F, -5.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 361
		bodyModel[124].setRotationPoint(-6F, 3F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[125].setRotationPoint(-6F, 6F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[126].setRotationPoint(-6F, 6F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 367
		bodyModel[127].setRotationPoint(-6F, 6F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[128].setRotationPoint(-6F, 2F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[129].setRotationPoint(-6F, 2F, 7F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 477 extra stacc
		bodyModel[130].setRotationPoint(17.5F, -24F, -2.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 478 extra stacc
		bodyModel[131].setRotationPoint(4.5F, -24F, -2.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 479 extra stacc
		bodyModel[132].setRotationPoint(13.5F, -24F, -2.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 480 extra stacc
		bodyModel[133].setRotationPoint(8.5F, -24F, -2.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[134].setRotationPoint(-41F, 6F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[135].setRotationPoint(-41F, 6F, 10F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[136].setRotationPoint(45F, 6F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[137].setRotationPoint(45F, 6F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[138].setRotationPoint(40.5F, -21.5F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[139].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[140].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[141].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[142].setRotationPoint(-23.5F, -22.5F, -1F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 367
		bodyModel[143].setRotationPoint(13F, 3F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[144].setRotationPoint(13F, 6F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[145].setRotationPoint(13F, 2F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[146].setRotationPoint(13F, 6F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[147].setRotationPoint(13F, 6F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[148].setRotationPoint(13F, 2F, 7F);

		bodyModel[149].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 glow
		bodyModel[149].setRotationPoint(42.1F, -13F, 5.5F);
		bodyModel[149].rotateAngleY = 0.43633231F;

		bodyModel[150].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 glow
		bodyModel[150].setRotationPoint(42.1F, -13F, -5.5F);
		bodyModel[150].rotateAngleY = -0.43633231F;

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 408
		bodyModel[151].setRotationPoint(27.5F, 1F, -10.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 409
		bodyModel[152].setRotationPoint(-23.5F, 1F, -10.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 76, 1, 4, 0F); // Box 515
		bodyModel[153].setRotationPoint(-36F, 0F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[154].setRotationPoint(45.01F, -8F, 11F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[155].setRotationPoint(45.01F, -8F, -10F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[156].setRotationPoint(41F, 7F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[157].setRotationPoint(41F, 6F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[158].setRotationPoint(41F, 4F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 402
		bodyModel[159].setRotationPoint(41F, 3F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 403
		bodyModel[160].setRotationPoint(41F, 2F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[161].setRotationPoint(42F, 0F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 405
		bodyModel[162].setRotationPoint(41F, 7F, 9F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 406
		bodyModel[163].setRotationPoint(41F, 6F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 407
		bodyModel[164].setRotationPoint(41F, 4F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 408
		bodyModel[165].setRotationPoint(41F, 2F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
		bodyModel[166].setRotationPoint(42F, 0F, 7F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 410
		bodyModel[167].setRotationPoint(41F, 3F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[168].setRotationPoint(-37F, 1F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[169].setRotationPoint(-41.01F, 0F, -9F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[170].setRotationPoint(-41F, 2F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[171].setRotationPoint(-37F, 1F, 7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[172].setRotationPoint(-37F, 0F, 7F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[173].setRotationPoint(-38F, 0F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[174].setRotationPoint(-37F, 3F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[175].setRotationPoint(-37F, 3F, 7F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[176].setRotationPoint(-41F, 0F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[177].setRotationPoint(-41F, 0F, -8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[178].setRotationPoint(-41F, 7F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[179].setRotationPoint(-41F, 4F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[180].setRotationPoint(-41F, 2F, -9F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[181].setRotationPoint(-41F, 6F, -9F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[182].setRotationPoint(-41F, 3F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[183].setRotationPoint(-41F, 0F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[184].setRotationPoint(-41F, 7F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[185].setRotationPoint(-41F, 4F, 8F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[186].setRotationPoint(-41F, 6F, 9F);

		bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[187].setRotationPoint(-41F, 3F, 8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[188].setRotationPoint(-41F, 2F, -3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[189].setRotationPoint(-37F, 0F, -11F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[190].setRotationPoint(-41F, -2F, 10F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[191].setRotationPoint(-41F, -2F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[192].setRotationPoint(-45F, 3F, -1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[193].setRotationPoint(-41.5F, -2F, 4.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[194].setRotationPoint(-41.5F, -2F, -6.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[195].setRotationPoint(-41.75F, -2F, 4.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[196].setRotationPoint(-41.75F, -2F, -6.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[197].setRotationPoint(-41F, -8F, -7F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[198].setRotationPoint(-41F, -8F, -8F);

		bodyModel[199].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[199].setRotationPoint(-42F, -8F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[200].setRotationPoint(-41F, -8F, 3F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[201].setRotationPoint(-41F, -8F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[202].setRotationPoint(-44F, 6F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[203].setRotationPoint(-44F, 5F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[204].setRotationPoint(-44F, 7F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[205].setRotationPoint(-44F, 6F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[206].setRotationPoint(-44.5F, 5F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[207].setRotationPoint(-44F, 7F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[208].setRotationPoint(-42F, 2.5F, -2F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[209].setRotationPoint(-41.5F, 1F, -5.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front
		bodyModel[210].setRotationPoint(-41.75F, 1F, -5.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front
		bodyModel[211].setRotationPoint(-41.75F, 1F, 3.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[212].setRotationPoint(-41.5F, 1F, 3.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[213].setRotationPoint(-41.01F, -8F, -10F);
		bodyModel[213].rotateAngleY = -3.14159265F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[214].setRotationPoint(-41.01F, -8F, 11F);
		bodyModel[214].rotateAngleY = -3.14159265F;

		bodyModel[215].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 72
		bodyModel[215].setRotationPoint(-24F, -18F, 10F);

		bodyModel[216].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 190
		bodyModel[216].setRotationPoint(-24F, -18F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[217].setRotationPoint(-27F, -4F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F); // Box 11
		bodyModel[218].setRotationPoint(-27F, -21F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 211
		bodyModel[219].setRotationPoint(-26F, -21F, -7F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 48
		bodyModel[220].setRotationPoint(-28F, -21F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F); // Box 43
		bodyModel[221].setRotationPoint(-28F, -21F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 44
		bodyModel[222].setRotationPoint(-28F, -21F, 1F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[223].setRotationPoint(-26.1F, -20.5F, -7F);
		bodyModel[223].rotateAngleY = 0.27925268F;

		bodyModel[224].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[224].setRotationPoint(-26.1F, -20.5F, 7F);
		bodyModel[224].rotateAngleY = -0.27925268F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 186 lamp
		bodyModel[225].setRotationPoint(-28.5F, -21.25F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 187 lamp
		bodyModel[226].setRotationPoint(-28.5F, -19.75F, -1F);

		bodyModel[227].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 220
		bodyModel[227].setRotationPoint(-24F, -21F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[228].setRotationPoint(-24F, -21F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[229].setRotationPoint(-24F, -21F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.905F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 224
		bodyModel[230].setRotationPoint(-27F, -21F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[231].setRotationPoint(-38F, -10F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[232].setRotationPoint(-38F, -10F, 2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.335F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[233].setRotationPoint(-37F, -13F, 6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F); // Box 42
		bodyModel[234].setRotationPoint(-37F, -13F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[235].setRotationPoint(-26.25F, -19.5F, 7.5F);
		bodyModel[235].rotateAngleY = -0.2443461F;

		bodyModel[236].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[236].setRotationPoint(-26.25F, -19.5F, -7.5F);
		bodyModel[236].rotateAngleY = 0.2443461F;

		bodyModel[237].addBox(0F, 0F, 0F, 8, 10, 22, 0F); // Box 345
		bodyModel[237].setRotationPoint(-35F, -10F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410
		bodyModel[238].setRotationPoint(-23.5F, -22F, -1F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[239].setRotationPoint(-24F, -16F, -12F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // t
		bodyModel[240].setRotationPoint(-17F, -18F, 10F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[241].setRotationPoint(-13F, -18F, 10F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // t
		bodyModel[242].setRotationPoint(-17F, -18F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 14, 21, 0F); // Box 72
		bodyModel[243].setRotationPoint(-13F, -18F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[244].setRotationPoint(-38.5F, -13F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[245].setRotationPoint(-38.5F, -13F, -2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 87
		bodyModel[246].setRotationPoint(-25F, -18F, 0F);

		bodyModel[247].addBox(0F, 0F, 0F, 8, 3, 12, 0F); // Box 345
		bodyModel[247].setRotationPoint(-35F, -13F, -6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[248].setRotationPoint(-35F, -13F, 6F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 87
		bodyModel[249].setRotationPoint(-25F, -18F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F); // Box 45
		bodyModel[250].setRotationPoint(-38F, -13F, 2F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[251].setRotationPoint(-38F, -13F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[252].setRotationPoint(-37.5F, -13F, -2F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[253].setRotationPoint(-35F, -13.25F, 6.5F);
		bodyModel[253].rotateAngleX = -0.54105207F;

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[254].setRotationPoint(-35F, -12.65F, -7.5F);
		bodyModel[254].rotateAngleX = 0.54105207F;

		bodyModel[255].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Front door
		bodyModel[255].setRotationPoint(-38F, -11F, -2F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[256].setRotationPoint(-27F, -10F, 10F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[257].setRotationPoint(-27F, -10F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[258].setRotationPoint(-27F, -18F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[259].setRotationPoint(-27F, -18F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[260].setRotationPoint(-38.5F, -1F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[261].setRotationPoint(-38.5F, -1F, -2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[262].setRotationPoint(-35F, -13F, -11F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[263].setRotationPoint(-24F, -16F, 11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[264].setRotationPoint(-13F, -21F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[265].setRotationPoint(-13F, -21F, 7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176 lamp
		bodyModel[266].setRotationPoint(-38.5F, -10.25F, -0.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 177 lamp
		bodyModel[267].setRotationPoint(-38.5F, -8.5F, -0.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Light mount
		bodyModel[268].setRotationPoint(-38.25F, -10.6F, -1F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412 cs
		bodyModel[269].setRotationPoint(-27F, -13F, -3F);

		bodyModel[270].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413 cs
		bodyModel[270].setRotationPoint(-27.1F, -12F, -5F);
		bodyModel[270].rotateAngleY = -0.38397244F;

		bodyModel[271].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[271].setRotationPoint(-25.5F, -14F, -5F);
		bodyModel[271].rotateAngleY = -0.38397244F;
	}
	ModelBlombergBnew theTrucc = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 623) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.01, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.2, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}