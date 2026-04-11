//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
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

public class ModelSD45dash2B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD45dash2B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[243];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 112
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 164
		bodyModel[8] = new ModelRendererTurbo(this, 249, 86, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 259
		bodyModel[12] = new ModelRendererTurbo(this, 72, 46, textureX, textureY); // Box 262
		bodyModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 261
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 138, 11, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 60, 59, textureX, textureY); // Box 98
		bodyModel[22] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 197
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 144
		bodyModel[25] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 145
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 147
		bodyModel[27] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 148
		bodyModel[28] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 159
		bodyModel[30] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 246
		bodyModel[32] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 164
		bodyModel[33] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 259
		bodyModel[34] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 261
		bodyModel[35] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 262
		bodyModel[36] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 264
		bodyModel[37] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 265
		bodyModel[38] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 266
		bodyModel[39] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 5
		bodyModel[41] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[42] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 80
		bodyModel[46] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 179
		bodyModel[48] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 234
		bodyModel[49] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 236
		bodyModel[50] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 193
		bodyModel[52] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 316
		bodyModel[53] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 201
		bodyModel[54] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 202
		bodyModel[55] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 204
		bodyModel[56] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 206
		bodyModel[57] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 207
		bodyModel[58] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 225
		bodyModel[59] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 226
		bodyModel[60] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 227
		bodyModel[61] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 229
		bodyModel[62] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 230
		bodyModel[63] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 231
		bodyModel[64] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 232
		bodyModel[65] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 233
		bodyModel[66] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 234
		bodyModel[67] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 235
		bodyModel[68] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 236
		bodyModel[69] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 255
		bodyModel[72] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 256
		bodyModel[73] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 241
		bodyModel[74] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 242
		bodyModel[75] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 243
		bodyModel[76] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 244
		bodyModel[77] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 245
		bodyModel[78] = new ModelRendererTurbo(this, 240, 132, textureX, textureY); // Box 246
		bodyModel[79] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 271
		bodyModel[82] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 272
		bodyModel[83] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 274
		bodyModel[85] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 277
		bodyModel[86] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 278
		bodyModel[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 258
		bodyModel[88] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 259
		bodyModel[89] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 260
		bodyModel[90] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 261
		bodyModel[91] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 262
		bodyModel[92] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 268
		bodyModel[93] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 269
		bodyModel[94] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 270
		bodyModel[95] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 271
		bodyModel[96] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 272
		bodyModel[97] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 273
		bodyModel[98] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 274
		bodyModel[99] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 275
		bodyModel[100] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 276
		bodyModel[101] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 277
		bodyModel[102] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 278
		bodyModel[103] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 279
		bodyModel[104] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 280
		bodyModel[105] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 281
		bodyModel[106] = new ModelRendererTurbo(this, 124, 47, textureX, textureY); // Box 282
		bodyModel[107] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 285
		bodyModel[108] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 286
		bodyModel[109] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 287
		bodyModel[110] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 288
		bodyModel[111] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 289
		bodyModel[112] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 290
		bodyModel[113] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 291
		bodyModel[114] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 292
		bodyModel[115] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 293
		bodyModel[116] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 294
		bodyModel[117] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[118] = new ModelRendererTurbo(this, 503, 3, textureX, textureY); // Box 296
		bodyModel[119] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 297
		bodyModel[120] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 298
		bodyModel[121] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 299
		bodyModel[122] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 300
		bodyModel[123] = new ModelRendererTurbo(this, 11, 17, textureX, textureY); // Box 301
		bodyModel[124] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 302
		bodyModel[125] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 303
		bodyModel[126] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 304
		bodyModel[127] = new ModelRendererTurbo(this, 305, 65, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[128] = new ModelRendererTurbo(this, 105, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[129] = new ModelRendererTurbo(this, 257, 65, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[130] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 312
		bodyModel[131] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 313
		bodyModel[132] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 314
		bodyModel[133] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 315
		bodyModel[134] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 316
		bodyModel[135] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 317
		bodyModel[136] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 43
		bodyModel[137] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 43
		bodyModel[138] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 43
		bodyModel[139] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 345
		bodyModel[140] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 346 cover
		bodyModel[141] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 100
		bodyModel[142] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 101
		bodyModel[143] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 102
		bodyModel[144] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 103
		bodyModel[145] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 104
		bodyModel[146] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 105
		bodyModel[147] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 114
		bodyModel[148] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 74
		bodyModel[149] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 78
		bodyModel[150] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 78
		bodyModel[151] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 193, 105, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[153] = new ModelRendererTurbo(this, 465, 105, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[154] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 239
		bodyModel[155] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[156] = new ModelRendererTurbo(this, 137, 113, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[157] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 242
		bodyModel[158] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 411
		bodyModel[159] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 412
		bodyModel[160] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 413
		bodyModel[161] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 414
		bodyModel[162] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 87
		bodyModel[163] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 451
		bodyModel[164] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 452
		bodyModel[165] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 453
		bodyModel[166] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 454
		bodyModel[167] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 455
		bodyModel[168] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 456
		bodyModel[169] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 319
		bodyModel[170] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 320
		bodyModel[171] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 321
		bodyModel[172] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 322
		bodyModel[173] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 323
		bodyModel[174] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 324
		bodyModel[175] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 325
		bodyModel[176] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 326
		bodyModel[177] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 327
		bodyModel[178] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 328
		bodyModel[179] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 329
		bodyModel[180] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 330
		bodyModel[181] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[182] = new ModelRendererTurbo(this, 97, 57, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[183] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 19
		bodyModel[184] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 334
		bodyModel[185] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 335
		bodyModel[186] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 336
		bodyModel[187] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 337
		bodyModel[188] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 338
		bodyModel[189] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 339
		bodyModel[190] = new ModelRendererTurbo(this, 49, 129, textureX, textureY, BoxName.commander); // Box 340 commander beacon
		bodyModel[191] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 341
		bodyModel[192] = new ModelRendererTurbo(this, 134, 107, textureX, textureY); // Box 629
		bodyModel[193] = new ModelRendererTurbo(this, 144, 107, textureX, textureY); // Box 630
		bodyModel[194] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 726
		bodyModel[195] = new ModelRendererTurbo(this, 164, 107, textureX, textureY); // Box 727
		bodyModel[196] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 376
		bodyModel[197] = new ModelRendererTurbo(this, 17, 107, textureX, textureY); // Box 377
		bodyModel[198] = new ModelRendererTurbo(this, 65, 128, textureX, textureY); // Box 378
		bodyModel[199] = new ModelRendererTurbo(this, 124, 128, textureX, textureY); // Box 379
		bodyModel[200] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 380
		bodyModel[201] = new ModelRendererTurbo(this, 124, 137, textureX, textureY); // Box 381
		bodyModel[202] = new ModelRendererTurbo(this, 341, 125, textureX, textureY); // Box 382
		bodyModel[203] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 43
		bodyModel[204] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 43
		bodyModel[205] = new ModelRendererTurbo(this, 269, 129, textureX, textureY); // Box 370
		bodyModel[206] = new ModelRendererTurbo(this, 411, 129, textureX, textureY); // Box 371
		bodyModel[207] = new ModelRendererTurbo(this, 126, 136, textureX, textureY); // Box 372
		bodyModel[208] = new ModelRendererTurbo(this, 2, 145, textureX, textureY); // Box 373
		bodyModel[209] = new ModelRendererTurbo(this, 54, 156, textureX, textureY); // Box 374
		bodyModel[210] = new ModelRendererTurbo(this, 509, 37, textureX, textureY); // Box 375
		bodyModel[211] = new ModelRendererTurbo(this, 40, 136, textureX, textureY); // Box 376
		bodyModel[212] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 377
		bodyModel[213] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 378
		bodyModel[214] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 379
		bodyModel[215] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 380
		bodyModel[216] = new ModelRendererTurbo(this, 2, 156, textureX, textureY); // Box 383
		bodyModel[217] = new ModelRendererTurbo(this, 2, 166, textureX, textureY); // Box 384
		bodyModel[218] = new ModelRendererTurbo(this, 147, 165, textureX, textureY); // Box 385
		bodyModel[219] = new ModelRendererTurbo(this, 148, 155, textureX, textureY); // Box 386
		bodyModel[220] = new ModelRendererTurbo(this, 190, 153, textureX, textureY); // Box 387
		bodyModel[221] = new ModelRendererTurbo(this, 188, 163, textureX, textureY); // Box 388
		bodyModel[222] = new ModelRendererTurbo(this, 123, 154, textureX, textureY); // Box 351
		bodyModel[223] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 352
		bodyModel[224] = new ModelRendererTurbo(this, 103, 154, textureX, textureY); // Box 353
		bodyModel[225] = new ModelRendererTurbo(this, 50, 141, textureX, textureY, "lamp"); // Box 215 lamp
		bodyModel[226] = new ModelRendererTurbo(this, 119, 151, textureX, textureY); // Box 216
		bodyModel[227] = new ModelRendererTurbo(this, 50, 146, textureX, textureY, "lamp"); // Box 217 lamp
		bodyModel[228] = new ModelRendererTurbo(this, 59, 145, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[229] = new ModelRendererTurbo(this, 70, 145, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[230] = new ModelRendererTurbo(this, 163, 129, textureX, textureY); // Box 190
		bodyModel[231] = new ModelRendererTurbo(this, 172, 129, textureX, textureY); // Box 402
		bodyModel[232] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 403
		bodyModel[233] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 404
		bodyModel[234] = new ModelRendererTurbo(this, 146, 172, textureX, textureY); // Box 405
		bodyModel[235] = new ModelRendererTurbo(this, 191, 156, textureX, textureY); // Box 406
		bodyModel[236] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 407
		bodyModel[237] = new ModelRendererTurbo(this, 213, 158, textureX, textureY); // Box 237
		bodyModel[238] = new ModelRendererTurbo(this, 213, 147, textureX, textureY); // Box 238
		bodyModel[239] = new ModelRendererTurbo(this, 59, 148, textureX, textureY, "lamp"); // Box 239 liveryimg 3
		bodyModel[240] = new ModelRendererTurbo(this, 70, 148, textureX, textureY, "lamp"); // Box 240 liveryimg 3
		bodyModel[241] = new ModelRendererTurbo(this, 236, 154, textureX, textureY); // Box 241
		bodyModel[242] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 242

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(40.5F, -27F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(40.5F, -27F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-20.5F, -8F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 61, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-20.5F, -27F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 112
		bodyModel[6].setRotationPoint(-8F, -3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[7].setRotationPoint(-43.5F, -4F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47.51F, -6F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(-47.5F, -4F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(-47.5F, -4F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[11].setRotationPoint(-43.5F, -4F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[12].setRotationPoint(-43.5F, -6F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-43.5F, -1F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-43.5F, -1F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[15].setRotationPoint(-43.5F, -6F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[16].setRotationPoint(-47.51F, -14F, -8F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[17].setRotationPoint(-47.51F, -14F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(-47.5F, -8F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[19].setRotationPoint(-47.5F, -8F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[20].setRotationPoint(-51.5F, -2F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[21].setRotationPoint(-51.51F, -6F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[22].setRotationPoint(-47.5F, -6F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(-47.5F, -14F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[24].setRotationPoint(-47.5F, -14F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[25].setRotationPoint(-48.5F, -14F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[26].setRotationPoint(-47.5F, -14F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[27].setRotationPoint(-47.5F, -14F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[28].setRotationPoint(-48.5F, -2.5F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[29].setRotationPoint(-42.5F, -6F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[30].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[31].setRotationPoint(46.51F, -4F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[32].setRotationPoint(41.5F, -4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[33].setRotationPoint(41.5F, -4F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[34].setRotationPoint(41.5F, -6F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[35].setRotationPoint(41.5F, -6F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[36].setRotationPoint(41.5F, -1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[37].setRotationPoint(41.5F, -1F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[38].setRotationPoint(43.5F, -6F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(41.5F, -4F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[40].setRotationPoint(46.5F, -2F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[41].setRotationPoint(46.5F, -14F, -8F);
		bodyModel[41].rotateAngleY = -3.14159265F;

		bodyModel[42].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[42].setRotationPoint(46.51F, -8F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(46.5F, -14F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[44].setRotationPoint(46.51F, -8F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[45].setRotationPoint(46.51F, -14F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[46].setRotationPoint(46.51F, -14F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[47].setRotationPoint(47.5F, -6F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[48].setRotationPoint(47.49F, -14F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[49].setRotationPoint(46.49F, -14F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[50].setRotationPoint(46.5F, -2.5F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[51].setRotationPoint(-47.5F, -4F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[52].setRotationPoint(-32.5F, -10F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 201
		bodyModel[53].setRotationPoint(46.51F, -4F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[54].setRotationPoint(46.5F, -6F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[55].setRotationPoint(46.5F, -6F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[56].setRotationPoint(46.49F, -14F, 4F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[57].setRotationPoint(46.5F, 1F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[58].setRotationPoint(46.5F, 2F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[59].setRotationPoint(-47.5F, 2F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[60].setRotationPoint(-47.5F, 1F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[61].setRotationPoint(-42.5F, -5F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[62].setRotationPoint(-42.5F, -5F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[63].setRotationPoint(11.5F, -5F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[64].setRotationPoint(11.5F, -5F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 233
		bodyModel[65].setRotationPoint(-8F, -3F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[66].setRotationPoint(-8F, 1F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 235
		bodyModel[67].setRotationPoint(-8F, -3F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		bodyModel[68].setRotationPoint(-8F, 1F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[69].setRotationPoint(-5.5F, -5F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[70].setRotationPoint(-5.5F, -4F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[71].setRotationPoint(-5.5F, -4F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[72].setRotationPoint(-5.5F, -5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[73].setRotationPoint(-12.5F, -5F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[74].setRotationPoint(-12.5F, -5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[75].setRotationPoint(10.5F, -5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[76].setRotationPoint(10.5F, -5F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[77].setRotationPoint(-39.5F, -10F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[78].setRotationPoint(-39.5F, -10F, 7F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[79].setRotationPoint(-43.5F, -14F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[80].setRotationPoint(-43.5F, -12F, -11.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[81].setRotationPoint(-47.5F, -5F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 272
		bodyModel[82].setRotationPoint(-47.5F, 2F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 273
		bodyModel[83].setRotationPoint(-47.5F, -1F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[84].setRotationPoint(-47.5F, -3F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[85].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[86].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 258
		bodyModel[87].setRotationPoint(-43.5F, -14F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 259
		bodyModel[88].setRotationPoint(-41.5F, -13F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 260
		bodyModel[89].setRotationPoint(-35.5F, -18F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[90].setRotationPoint(-39.5F, -14F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 262
		bodyModel[91].setRotationPoint(-34.5F, -17F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[92].setRotationPoint(-49.5F, -6F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[93].setRotationPoint(-49.5F, -6F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[94].setRotationPoint(-20.5F, -16F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[95].setRotationPoint(-17.5F, -19F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[96].setRotationPoint(-17.5F, -21F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[97].setRotationPoint(-18.5F, -28F, -6F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[98].setRotationPoint(-9.5F, -28.5F, -2.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[99].setRotationPoint(-10.5F, -27.5F, -4F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[100].setRotationPoint(31.5F, -28.5F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[101].setRotationPoint(23.5F, -28.5F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[102].setRotationPoint(-4.5F, -28F, -3F);

		bodyModel[103].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[103].setRotationPoint(15.5F, -28.5F, -3F);

		bodyModel[104].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[104].setRotationPoint(2.5F, -28F, -3F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[105].setRotationPoint(-40.5F, -10F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[106].setRotationPoint(-41.5F, -10F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[107].setRotationPoint(-19.5F, -26.5F, -7.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[108].setRotationPoint(-19.5F, -26.5F, 6.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[109].setRotationPoint(42.5F, -12F, -11.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[110].setRotationPoint(42.5F, -14F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[111].setRotationPoint(42.5F, -12F, 10.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[112].setRotationPoint(42.5F, -14F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 291
		bodyModel[113].setRotationPoint(-15.5F, -14F, 11F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[114].setRotationPoint(-20.5F, -10F, 7F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[115].setRotationPoint(-18.5F, -10F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[116].setRotationPoint(-17.5F, -10F, 11F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[117].setRotationPoint(-20.5F, -18F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[118].setRotationPoint(-19.5F, -16F, 11F);

		bodyModel[119].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 297
		bodyModel[119].setRotationPoint(27F, -26.5F, -7.25F);

		bodyModel[120].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 298
		bodyModel[120].setRotationPoint(13.5F, -26.5F, -7.25F);

		bodyModel[121].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 299
		bodyModel[121].setRotationPoint(27F, -26.5F, 6.25F);

		bodyModel[122].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 300
		bodyModel[122].setRotationPoint(13.5F, -26.5F, 6.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[123].setRotationPoint(46.5F, -6F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[124].setRotationPoint(-48.5F, -6F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[125].setRotationPoint(-48.5F, -6F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[126].setRotationPoint(-48.5F, -6F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[127].setRotationPoint(41.75F, -25F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[128].setRotationPoint(43F, -25F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[129].setRotationPoint(43F, -25F, 0F);

		bodyModel[130].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 312
		bodyModel[130].setRotationPoint(-17.5F, -16F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[131].setRotationPoint(-19.5F, -18F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[132].setRotationPoint(-20.5F, -18F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[133].setRotationPoint(19.5F, -16F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 21, 8, 0, 0F); // Box 316
		bodyModel[134].setRotationPoint(21.5F, -14F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[135].setRotationPoint(10.5F, -28F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[136].setRotationPoint(-42.5F, -19F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[137].setRotationPoint(-41.5F, -19F, -6F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[138].setRotationPoint(-41.5F, -19F, -7F);

		bodyModel[139].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[139].setRotationPoint(-39.5F, -19F, -7F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[140].setRotationPoint(-41.5F, -15F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[141].setRotationPoint(-4.5F, -27F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[142].setRotationPoint(-4.5F, -27F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[143].setRotationPoint(-9.5F, -27F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[144].setRotationPoint(8.5F, -27F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[145].setRotationPoint(8.5F, -27F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[146].setRotationPoint(-9.5F, -27F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[147].setRotationPoint(-13.5F, -3F, -10.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[148].setRotationPoint(-13.5F, -4F, -10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[149].setRotationPoint(-13.25F, -2.5F, -10.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[150].setRotationPoint(-47.5F, -8F, 4.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[151].setRotationPoint(-47.5F, -8F, -6.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[152].setRotationPoint(-47.75F, -8F, 4.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[153].setRotationPoint(-47.75F, -8F, -6.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[154].setRotationPoint(45.5F, -8F, -6.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[155].setRotationPoint(45.75F, -8F, -6.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[156].setRotationPoint(45.75F, -8F, 4.75F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[157].setRotationPoint(45.5F, -8F, 4.75F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[158].setRotationPoint(-28.5F, -4F, -11F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[159].setRotationPoint(-28.5F, -4F, 7F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[160].setRotationPoint(25.5F, -4F, 7F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[161].setRotationPoint(25.5F, -4F, -11F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[162].setRotationPoint(-32.5F, -19F, -4F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[163].setRotationPoint(-47.5F, -3F, 7F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[164].setRotationPoint(-47.5F, -5F, 7F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 453
		bodyModel[165].setRotationPoint(-47.5F, -1F, 8F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 454
		bodyModel[166].setRotationPoint(-47.5F, 2F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[167].setRotationPoint(-43.5F, 2F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[168].setRotationPoint(-43.5F, -1F, 9F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 319
		bodyModel[169].setRotationPoint(42.5F, 2F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[170].setRotationPoint(41.5F, 2F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 321
		bodyModel[171].setRotationPoint(41.5F, -1F, 9F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 322
		bodyModel[172].setRotationPoint(42.5F, -1F, 8F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 323
		bodyModel[173].setRotationPoint(42.5F, -3F, 7F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 324
		bodyModel[174].setRotationPoint(42.5F, -5F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 325
		bodyModel[175].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[176].setRotationPoint(42.5F, 2F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[177].setRotationPoint(42.5F, -1F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 328
		bodyModel[178].setRotationPoint(41.5F, -1F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[179].setRotationPoint(42.5F, -3F, -9F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 330
		bodyModel[180].setRotationPoint(42.5F, -5F, -8F);

		bodyModel[181].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[181].setRotationPoint(40.95F, -22F, -6F);
		bodyModel[181].rotateAngleY = -0.41887902F;

		bodyModel[182].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[182].setRotationPoint(40.95F, -22F, 6F);
		bodyModel[182].rotateAngleY = 0.41887902F;

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[183].setRotationPoint(-8F, -4F, -11.5F);
		bodyModel[183].rotateAngleX = 0.87266463F;

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[184].setRotationPoint(-8F, -2.5F, 8.75F);
		bodyModel[184].rotateAngleX = 0.87266463F;

		bodyModel[185].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 335
		bodyModel[185].setRotationPoint(-11F, -3F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[186].setRotationPoint(-11F, 1F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[187].setRotationPoint(-11F, -3F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[188].setRotationPoint(-11F, 1F, 8F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 339
		bodyModel[189].setRotationPoint(-11F, -3F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander beacon
		bodyModel[190].setRotationPoint(-27F, -29F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[191].setRotationPoint(-26.82F, -28F, -0.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[192].setRotationPoint(-26.5F, -2F, -1F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[193].setRotationPoint(-33.5F, -2F, -1F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[194].setRotationPoint(30.5F, -2F, -1F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[195].setRotationPoint(23.5F, -2F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[196].setRotationPoint(8.5F, -27F, -9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[197].setRotationPoint(8.5F, -27F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[198].setRotationPoint(13.5F, -27F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[199].setRotationPoint(39.5F, -27F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[200].setRotationPoint(13.5F, -27F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 381
		bodyModel[201].setRotationPoint(39.5F, -27F, 7F);

		bodyModel[202].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[202].setRotationPoint(-42.5F, -27F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[203].setRotationPoint(-41F, -14.5F, -7F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[204].setRotationPoint(-40.5F, -12.5F, -7F);

		bodyModel[205].addBox(0F, 0F, 0F, 12, 21, 1, 0F); // Box 370
		bodyModel[205].setRotationPoint(-32.5F, -27F, -7F);

		bodyModel[206].addBox(0F, 0F, 0F, 12, 21, 1, 0F); // Box 371
		bodyModel[206].setRotationPoint(-32.5F, -27F, 6F);

		bodyModel[207].addBox(0F, 0F, 0F, 12, 1, 13, 0F); // Box 372
		bodyModel[207].setRotationPoint(-32.5F, -27F, -6F);

		bodyModel[208].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 373
		bodyModel[208].setRotationPoint(-32.5F, -18F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 374
		bodyModel[209].setRotationPoint(-35.5F, -18F, 11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		bodyModel[210].setRotationPoint(-43.5F, -12F, 10.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 376
		bodyModel[211].setRotationPoint(-43.5F, -14F, 9F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 377
		bodyModel[212].setRotationPoint(-41.5F, -13F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 378
		bodyModel[213].setRotationPoint(-40.5F, -10F, 11F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 379
		bodyModel[214].setRotationPoint(-43.5F, -14F, 11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[215].setRotationPoint(-39.5F, -14F, 11F);

		bodyModel[216].addBox(0F, 0F, 0F, 24, 8, 0, 0F); // Box 383
		bodyModel[216].setRotationPoint(-39.5F, -14F, 11F);

		bodyModel[217].addBox(0F, 0F, 0F, 24, 8, 0, 0F); // Box 384
		bodyModel[217].setRotationPoint(-39.5F, -14F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 385
		bodyModel[218].setRotationPoint(-42.5F, -27F, 7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[219].setRotationPoint(-42.5F, -27F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[220].setRotationPoint(-27.5F, -27F, -9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F); // Box 388
		bodyModel[221].setRotationPoint(-27.5F, -27F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[222].setRotationPoint(-45.5F, -27F, -7F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 352
		bodyModel[223].setRotationPoint(-45.5F, -27F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[224].setRotationPoint(-45.5F, -27F, 1F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 lamp
		bodyModel[225].setRotationPoint(-46.75F, -26F, -1F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216
		bodyModel[226].setRotationPoint(-46F, -26F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 lamp
		bodyModel[227].setRotationPoint(-46.75F, -24F, -1F);

		bodyModel[228].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[228].setRotationPoint(-43.01F, -24.5F, -6F);
		bodyModel[228].rotateAngleY = 0.4712389F;

		bodyModel[229].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[229].setRotationPoint(-43.01F, -24.5F, 6F);
		bodyModel[229].rotateAngleY = -0.4712389F;

		bodyModel[230].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[230].setRotationPoint(-44F, -27.5F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 402
		bodyModel[231].setRotationPoint(40F, -27.5F, -1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[232].setRotationPoint(-45.5F, -27F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 404
		bodyModel[233].setRotationPoint(-45.5F, -27F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[234].setRotationPoint(-43.5F, -27F, -9F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 406
		bodyModel[235].setRotationPoint(-43.51F, -27F, -7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 407
		bodyModel[236].setRotationPoint(-43.5F, -27F, 7F);

		bodyModel[237].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 237
		bodyModel[237].setRotationPoint(-41.5F, -28F, -3F);

		bodyModel[238].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 238
		bodyModel[238].setRotationPoint(-34.5F, -28F, -3F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 239 liveryimg 3
		bodyModel[239].setRotationPoint(-43.01F, -23.5F, -6F);
		bodyModel[239].rotateAngleY = 0.4712389F;

		bodyModel[240].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 240 liveryimg 3
		bodyModel[240].setRotationPoint(-43.01F, -23.5F, 6F);
		bodyModel[240].rotateAngleY = -0.4712389F;

		bodyModel[241].addBox(0F, 0F, 0F, 11, 2, 4, 0F); // Box 241
		bodyModel[241].setRotationPoint(-31.5F, -8F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 242
		bodyModel[242].setRotationPoint(-33.5F, -16F, -11F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 154453) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2F, -0.32F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.95F, -0.32F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public ModelRendererTurbo SD45dash2Model[];

}