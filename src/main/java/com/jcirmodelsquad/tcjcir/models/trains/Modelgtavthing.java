//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.09.2020 - 19:42:46
// Last changed on: 25.09.2020 - 19:42:46

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergB;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeB;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Modelgtavthing extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelgtavthing() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[234];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 114
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 163
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 166
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 168
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 169
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 246
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 247
		bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 259
		bodyModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 262
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 263
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 266
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 271
		bodyModel[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 272
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 273
		bodyModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 274
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 275
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 276
		bodyModel[22] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 271
		bodyModel[23] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 272
		bodyModel[24] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 273
		bodyModel[25] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 274
		bodyModel[26] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 275
		bodyModel[27] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 276
		bodyModel[28] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 246
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 247
		bodyModel[31] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 164
		bodyModel[32] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 259
		bodyModel[33] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 261
		bodyModel[34] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 262
		bodyModel[35] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 263
		bodyModel[36] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 264
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 265
		bodyModel[38] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 266
		bodyModel[39] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 261
		bodyModel[42] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 19
		bodyModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 31
		bodyModel[44] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 185, 25, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_46"); // Box 115 liveryimg 2
		bodyModel[47] = new ModelRendererTurbo(this, 201, 25, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_47"); // Box 116 liveryimg 2
		bodyModel[48] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // box64
		bodyModel[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // box65
		bodyModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[51] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 45
		bodyModel[52] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 98
		bodyModel[57] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 176
		bodyModel[63] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 178
		bodyModel[64] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 179
		bodyModel[65] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 188
		bodyModel[66] = new ModelRendererTurbo(this, 353, 17, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[67] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 243
		bodyModel[68] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 244
		bodyModel[69] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 249
		bodyModel[70] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 250
		bodyModel[71] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 239
		bodyModel[72] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[73] = new ModelRendererTurbo(this, 393, 17, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[74] = new ModelRendererTurbo(this, 401, 17, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[75] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 198
		bodyModel[76] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 234
		bodyModel[77] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 236
		bodyModel[78] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 237
		bodyModel[79] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 144
		bodyModel[81] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 145
		bodyModel[82] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 147
		bodyModel[83] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 148
		bodyModel[84] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 61
		bodyModel[85] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 81
		bodyModel[86] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 81
		bodyModel[87] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 174
		bodyModel[88] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 191
		bodyModel[89] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 4
		bodyModel[90] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 4
		bodyModel[91] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 4
		bodyModel[93] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 4
		bodyModel[94] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 4
		bodyModel[95] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 74
		bodyModel[99] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
		bodyModel[100] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 9
		bodyModel[101] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 10
		bodyModel[102] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 15
		bodyModel[103] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 21
		bodyModel[104] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 48
		bodyModel[105] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 43
		bodyModel[106] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 44
		bodyModel[107] = new ModelRendererTurbo(this, 233, 33, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_107"); // Box 117 liveryimg 2
		bodyModel[108] = new ModelRendererTurbo(this, 489, 33, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_108"); // Box 118 liveryimg 2
		bodyModel[109] = new ModelRendererTurbo(this, 409, 17, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[110] = new ModelRendererTurbo(this, 137, 25, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[111] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 201
		bodyModel[112] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 314 door swing right
		bodyModel[113] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 315 door swing right
		bodyModel[114] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 489
		bodyModel[115] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 281
		bodyModel[116] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 288
		bodyModel[117] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 316
		bodyModel[118] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 273
		bodyModel[119] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 285
		bodyModel[120] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 286
		bodyModel[121] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 276
		bodyModel[122] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 277
		bodyModel[123] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 273
		bodyModel[124] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 274
		bodyModel[125] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 302
		bodyModel[126] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 303
		bodyModel[127] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 304
		bodyModel[128] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 293
		bodyModel[129] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 384
		bodyModel[130] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 385
		bodyModel[131] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 386
		bodyModel[132] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 387
		bodyModel[133] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 423 AC
		bodyModel[134] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 11
		bodyModel[135] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 210
		bodyModel[136] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 211
		bodyModel[137] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 219
		bodyModel[138] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 220
		bodyModel[139] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 221
		bodyModel[140] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 222
		bodyModel[141] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 223
		bodyModel[142] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 224
		bodyModel[143] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 243
		bodyModel[144] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 244
		bodyModel[145] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 245
		bodyModel[146] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 36
		bodyModel[147] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 271
		bodyModel[148] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 272
		bodyModel[149] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 313
		bodyModel[150] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 314
		bodyModel[151] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 315
		bodyModel[152] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 316
		bodyModel[153] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 270
		bodyModel[154] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 300
		bodyModel[155] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 305
		bodyModel[156] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 348
		bodyModel[157] = new ModelRendererTurbo(this, 193, 33, textureX, textureY, "lamp"); // Box 349 lamp
		bodyModel[158] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 352
		bodyModel[159] = new ModelRendererTurbo(this, 473, 33, textureX, textureY, "lamp"); // Box 355 lamp
		bodyModel[160] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 114
		bodyModel[161] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 74
		bodyModel[162] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 78
		bodyModel[163] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 245
		bodyModel[164] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 86
		bodyModel[165] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 87
		bodyModel[166] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 86
		bodyModel[167] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 510
		bodyModel[168] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 511
		bodyModel[169] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 512
		bodyModel[170] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 513
		bodyModel[171] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 350
		bodyModel[172] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 351
		bodyModel[173] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 352
		bodyModel[174] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 353
		bodyModel[175] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 354
		bodyModel[176] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 355
		bodyModel[177] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 356
		bodyModel[178] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 357
		bodyModel[179] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 358
		bodyModel[180] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 359
		bodyModel[181] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 360
		bodyModel[182] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 448
		bodyModel[183] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 449
		bodyModel[184] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 364
		bodyModel[185] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 365
		bodyModel[186] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 366
		bodyModel[187] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 367
		bodyModel[188] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 368
		bodyModel[189] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 369
		bodyModel[190] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 370
		bodyModel[191] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 371
		bodyModel[192] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 372
		bodyModel[193] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 373
		bodyModel[194] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 374
		bodyModel[195] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 375
		bodyModel[196] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 376
		bodyModel[197] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 377
		bodyModel[198] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 378
		bodyModel[199] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 379
		bodyModel[200] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 380
		bodyModel[201] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 381
		bodyModel[202] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 382
		bodyModel[203] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 383
		bodyModel[204] = new ModelRendererTurbo(this, 281, 49, textureX, textureY, "lamp"); // Box 384 lamp
		bodyModel[205] = new ModelRendererTurbo(this, 353, 49, textureX, textureY, "lamp"); // Box 386 lamp
		bodyModel[206] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 387
		bodyModel[207] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 388
		bodyModel[208] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 389
		bodyModel[209] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 390
		bodyModel[210] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 391
		bodyModel[211] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 392
		bodyModel[212] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 393
		bodyModel[213] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 394
		bodyModel[214] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 395
		bodyModel[215] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 396
		bodyModel[216] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 397
		bodyModel[217] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 398
		bodyModel[218] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 399
		bodyModel[219] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 400
		bodyModel[220] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 401
		bodyModel[221] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 402
		bodyModel[222] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 403
		bodyModel[223] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 404
		bodyModel[224] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 405
		bodyModel[225] = new ModelRendererTurbo(this, 473, 33, textureX, textureY, "lamp"); // Box 406 lamp
		bodyModel[226] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 407
		bodyModel[227] = new ModelRendererTurbo(this, 385, 17, textureX, textureY, "lamp"); // Box 408 lamp
		bodyModel[228] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 409
		bodyModel[229] = new ModelRendererTurbo(this, 353, 17, textureX, textureY, "lamp"); // Box 410 lamp
		bodyModel[230] = new ModelRendererTurbo(this, 193, 33, textureX, textureY, "lamp"); // Box 411 lamp
		bodyModel[231] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 412
		bodyModel[232] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 413
		bodyModel[233] = new ModelRendererTurbo(this, 103, 104, textureX, textureY); // Box 414

		bodyModel[0].addBox(0F, 0F, 0F, 70, 1, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-36F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[1].setRotationPoint(-37F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 70, 2, 14, 0F); // Box 114
		bodyModel[2].setRotationPoint(-36F, 1F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 163
		bodyModel[3].setRotationPoint(-26F, 1.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 166
		bodyModel[4].setRotationPoint(21F, 1.5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[5].setRotationPoint(-25F, 1F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[6].setRotationPoint(22F, 1F, -10.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[7].setRotationPoint(-41.01F, 0F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[8].setRotationPoint(-41F, 2F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[9].setRotationPoint(-41F, 2F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[10].setRotationPoint(-37F, 1F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[11].setRotationPoint(-37F, 0F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[12].setRotationPoint(-38F, 0F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-37F, 3F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-37F, 3F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[15].setRotationPoint(-41F, 0F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[16].setRotationPoint(-41F, 0F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[17].setRotationPoint(-41F, 7F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[18].setRotationPoint(-41F, 4F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[19].setRotationPoint(-41F, 2F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[20].setRotationPoint(-41F, 6F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[21].setRotationPoint(-41F, 3F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[22].setRotationPoint(-41F, 0F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[23].setRotationPoint(-41F, 7F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[24].setRotationPoint(-41F, 4F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[25].setRotationPoint(-41F, 2F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[26].setRotationPoint(-41F, 6F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[27].setRotationPoint(-41F, 3F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[28].setRotationPoint(39.01F, 0F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[29].setRotationPoint(39.02F, 2F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[30].setRotationPoint(39.02F, 2F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[31].setRotationPoint(34F, 1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[32].setRotationPoint(34F, 1F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[33].setRotationPoint(34F, 0F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[34].setRotationPoint(34F, 0F, 7F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[35].setRotationPoint(34F, 0F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[36].setRotationPoint(34F, 3F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[37].setRotationPoint(34F, 3F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[38].setRotationPoint(36F, 0F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(-41F, 2F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(34F, 2F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[41].setRotationPoint(-37F, 0F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 12, 21, 14, 0F); // Box 19
		bodyModel[42].setRotationPoint(-18F, -21F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[43].setRotationPoint(36.25F, -18F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 19, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[44].setRotationPoint(35F, -19F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[45].setRotationPoint(35F, -19F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[46].setRotationPoint(35.45F, -15.5F, -6F);
		bodyModel[46].rotateAngleY = -0.41887902F;

		bodyModel[47].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[47].setRotationPoint(35.45F, -15.5F, 6F);
		bodyModel[47].rotateAngleY = 0.41887902F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[48].setRotationPoint(-26F, -18F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[49].setRotationPoint(-26F, -18F, -12F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[50].setRotationPoint(-35F, -2F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[51].setRotationPoint(-35F, -4F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[52].setRotationPoint(-34F, -4F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[53].setRotationPoint(-41F, -2F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[54].setRotationPoint(-41F, -2F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[55].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[56].setRotationPoint(-44F, 0F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[57].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[58].setRotationPoint(39.02F, -2F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[59].setRotationPoint(39.02F, -2F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[60].setRotationPoint(39.02F, -8F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[61].setRotationPoint(39.02F, -8F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[62].setRotationPoint(-15F, -10F, -11.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[63].setRotationPoint(-35F, -4F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[64].setRotationPoint(40F, 0F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[65].setRotationPoint(-42F, -2F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[66].setRotationPoint(-42.25F, -2F, -5.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 243
		bodyModel[67].setRotationPoint(35F, -8F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[68].setRotationPoint(35F, -7F, 10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[69].setRotationPoint(35F, -7F, -11.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 250
		bodyModel[70].setRotationPoint(35F, -8F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[71].setRotationPoint(39F, -2F, -5.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[72].setRotationPoint(39.25F, -2F, -5.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[73].setRotationPoint(37.5F, -18F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[74].setRotationPoint(37.5F, -18F, 0F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 198
		bodyModel[75].setRotationPoint(35F, -19.5F, -0.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[76].setRotationPoint(40F, -8F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[77].setRotationPoint(39F, -8F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[78].setRotationPoint(39F, -8F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-41F, -8F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[80].setRotationPoint(-41F, -8F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[81].setRotationPoint(-42F, -8F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[82].setRotationPoint(-41F, -8F, 3F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[83].setRotationPoint(-41F, -8F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[84].setRotationPoint(-37F, -10F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[85].setRotationPoint(-37F, -10F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[86].setRotationPoint(-37F, -8F, -11.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[87].setRotationPoint(-34F, -11F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[88].setRotationPoint(-36F, -9F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[89].setRotationPoint(-44F, 6F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[90].setRotationPoint(-44F, 3F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[91].setRotationPoint(-44F, 7F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[92].setRotationPoint(-44F, 6F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[93].setRotationPoint(-44.5F, 3F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[94].setRotationPoint(-44F, 7F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(-42F, 2.5F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[96].setRotationPoint(39F, 2.5F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[97].setRotationPoint(-14F, 2F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[98].setRotationPoint(-14F, 1F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[99].setRotationPoint(-13.75F, 2.5F, -10.25F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[100].setRotationPoint(-29F, -18F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 10
		bodyModel[101].setRotationPoint(-28F, -18F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 15
		bodyModel[102].setRotationPoint(-29F, -18F, 6F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[103].setRotationPoint(-19F, -18F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[104].setRotationPoint(-31F, -21F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[105].setRotationPoint(-31F, -21F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[106].setRotationPoint(-31F, -21F, 1F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[107].setRotationPoint(-29.05F, -19.5F, -6F);
		bodyModel[107].rotateAngleY = 0.38397244F;

		bodyModel[108].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[108].setRotationPoint(-29.05F, -19.5F, 6F);
		bodyModel[108].rotateAngleY = -0.38397244F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[109].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[110].setRotationPoint(-31.5F, -19F, -1F);

		bodyModel[111].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[111].setRotationPoint(-29F, -4F, -11F);

		bodyModel[112].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[112].setRotationPoint(-18.5F, -18F, 10.5F);

		bodyModel[113].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[113].setRotationPoint(-28.5F, -18F, -10.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 23, 3, 20, 0F); // Box 489
		bodyModel[114].setRotationPoint(-12F, 1F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[115].setRotationPoint(-12F, 4F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[116].setRotationPoint(-12F, 4F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 23, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[117].setRotationPoint(-12F, 4F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[118].setRotationPoint(-16F, -22F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 285
		bodyModel[119].setRotationPoint(-17F, -20.5F, -7.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 286
		bodyModel[120].setRotationPoint(-17F, -20.5F, 6.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 276
		bodyModel[121].setRotationPoint(26F, -21F, -3.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 277
		bodyModel[122].setRotationPoint(18F, -21F, -3.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 16, 4, 1, 0F); // Box 273
		bodyModel[123].setRotationPoint(17.5F, -18F, 6.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 274
		bodyModel[124].setRotationPoint(-5.5F, -20.5F, -2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[125].setRotationPoint(-42F, 0F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[126].setRotationPoint(-42F, 0F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[127].setRotationPoint(-42F, 0F, -6F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[128].setRotationPoint(-32F, -12F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[129].setRotationPoint(-31.5F, -22.5F, -1.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[130].setRotationPoint(-30F, -23F, -0.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[131].setRotationPoint(-30.75F, -22.5F, 0.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[132].setRotationPoint(-29.75F, -22.5F, -0.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 423 AC
		bodyModel[133].setRotationPoint(-26F, -22.5F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[134].setRotationPoint(-29F, -21F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[135].setRotationPoint(-19F, -21F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[136].setRotationPoint(-29F, -21F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[137].setRotationPoint(-19F, -21F, -7F);

		bodyModel[138].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 220
		bodyModel[138].setRotationPoint(-28F, -21F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[139].setRotationPoint(-28F, -21F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[140].setRotationPoint(-28F, -21F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[141].setRotationPoint(-19F, -21F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[142].setRotationPoint(-29F, -21F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[143].setRotationPoint(39F, 0F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[144].setRotationPoint(39F, 0F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 245
		bodyModel[145].setRotationPoint(39F, 0F, 5F);

		bodyModel[146].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 36
		bodyModel[146].setRotationPoint(-18F, -2F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[147].setRotationPoint(-16F, -13F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[148].setRotationPoint(-16F, -15F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[149].setRotationPoint(-17F, -12F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[150].setRotationPoint(-18F, -12F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[151].setRotationPoint(17F, -10F, -11F);

		bodyModel[152].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[152].setRotationPoint(19F, -8F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 270
		bodyModel[153].setRotationPoint(-18F, -10F, -10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[154].setRotationPoint(-36F, -2F, 7F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 305
		bodyModel[155].setRotationPoint(-18F, -4F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[156].setRotationPoint(-41.5F, 1F, -5.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 lamp
		bodyModel[157].setRotationPoint(-41.75F, 1F, -5.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352
		bodyModel[158].setRotationPoint(38.5F, 1F, -5.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 lamp
		bodyModel[159].setRotationPoint(38.75F, 1F, -5.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[160].setRotationPoint(-33F, -19F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[161].setRotationPoint(-33F, -20F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[162].setRotationPoint(-32.75F, -18.5F, -0.25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[163].setRotationPoint(-33F, -21F, -0.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[164].setRotationPoint(-28.1F, -12F, -5F);
		bodyModel[164].rotateAngleY = -0.38397244F;

		bodyModel[165].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[165].setRotationPoint(-28F, -13F, -4F);

		bodyModel[166].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[166].setRotationPoint(-27F, -14F, -5F);
		bodyModel[166].rotateAngleY = -0.38397244F;

		bodyModel[167].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[167].setRotationPoint(-41F, 6F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[168].setRotationPoint(-41F, 6F, 10F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[169].setRotationPoint(39F, 6F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[170].setRotationPoint(39F, 6F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // Box 350
		bodyModel[171].setRotationPoint(-18F, -2F, 7F);

		bodyModel[172].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 351
		bodyModel[172].setRotationPoint(-15F, -10F, 11.01F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 352
		bodyModel[173].setRotationPoint(-18F, -12F, 11.02F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[174].setRotationPoint(-17F, -12F, 11.02F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[175].setRotationPoint(17F, -10F, 11.02F);

		bodyModel[176].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 355
		bodyModel[176].setRotationPoint(19F, -8F, 11.02F);

		bodyModel[177].addBox(0F, 0F, 0F, 41, 19, 14, 0F); // Box 356
		bodyModel[177].setRotationPoint(-6F, -19F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[178].setRotationPoint(-6F, -21F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[179].setRotationPoint(-6F, -21F, 6F);

		bodyModel[180].addBox(0F, 0F, 0F, 16, 4, 1, 0F); // Box 359
		bodyModel[180].setRotationPoint(17.5F, -18F, -7.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 360
		bodyModel[181].setRotationPoint(4F, -21F, -3.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[182].setRotationPoint(-44F, 4F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[183].setRotationPoint(-44F, 4F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[184].setRotationPoint(-26F, -22.5F, 3F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 365
		bodyModel[185].setRotationPoint(-37F, -10F, 9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 366
		bodyModel[186].setRotationPoint(-37F, -8F, 10.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 367
		bodyModel[187].setRotationPoint(-37F, -10F, 11F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 368
		bodyModel[188].setRotationPoint(-36F, -9F, 11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[189].setRotationPoint(-34F, -11F, 11F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 370
		bodyModel[190].setRotationPoint(-32F, -12F, 11F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 371
		bodyModel[191].setRotationPoint(-29F, -18F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 372
		bodyModel[192].setRotationPoint(-29F, -18F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[193].setRotationPoint(-29F, -18F, 0F);

		bodyModel[194].addBox(0F, 0F, 0F, 9, 13, 2, 0F); // Box 374
		bodyModel[194].setRotationPoint(-38F, -13F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[195].setRotationPoint(-39F, -13F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,-2F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[196].setRotationPoint(-38F, -13F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 7, 11, 6, 0F); // Box 377
		bodyModel[197].setRotationPoint(-36F, -11F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[198].setRotationPoint(-38F, -13F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[199].setRotationPoint(-39F, -13F, -7F);

		bodyModel[200].addBox(0F, 0F, 0F, 7, 11, 6, 0F); // Box 380
		bodyModel[200].setRotationPoint(-36F, -11F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 381
		bodyModel[201].setRotationPoint(-38F, -13F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 382
		bodyModel[202].setRotationPoint(-38F, -13F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 383
		bodyModel[203].setRotationPoint(-39F, -13F, 1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 384 lamp
		bodyModel[204].setRotationPoint(-38.5F, -10.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 lamp
		bodyModel[205].setRotationPoint(-38.5F, -12.5F, -1F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // Box 387
		bodyModel[206].setRotationPoint(-29F, -13F, -6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[207].setRotationPoint(39.01F, -8F, -10F);
		bodyModel[207].rotateAngleY = -3.14159265F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[208].setRotationPoint(39.01F, -8F, 11F);
		bodyModel[208].rotateAngleY = -3.14159265F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[209].setRotationPoint(-41.01F, -8F, -10F);
		bodyModel[209].rotateAngleY = -3.14159265F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[210].setRotationPoint(-41.01F, -8F, 11F);
		bodyModel[210].rotateAngleY = -3.14159265F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 13, 6, 0F,-2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 2F, 2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 392
		bodyModel[211].setRotationPoint(-38.02F, -13F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F); // Box 393
		bodyModel[212].setRotationPoint(-38.03F, -13F, 1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 394
		bodyModel[213].setRotationPoint(35F, 7F, 9F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[214].setRotationPoint(35F, 6F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 396
		bodyModel[215].setRotationPoint(35F, 4F, 8F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 397
		bodyModel[216].setRotationPoint(35F, 3F, 8F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 398
		bodyModel[217].setRotationPoint(35F, 2F, 7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 399
		bodyModel[218].setRotationPoint(36F, 0F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[219].setRotationPoint(35F, 6F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[220].setRotationPoint(35F, 7F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[221].setRotationPoint(35F, 4F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 403
		bodyModel[222].setRotationPoint(35F, 3F, -8F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 404
		bodyModel[223].setRotationPoint(35F, 2F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[224].setRotationPoint(36F, 0F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 406 lamp
		bodyModel[225].setRotationPoint(38.75F, 1F, 3.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 407
		bodyModel[226].setRotationPoint(38.5F, 1F, 3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 408 lamp
		bodyModel[227].setRotationPoint(39.25F, -2F, 3.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 409
		bodyModel[228].setRotationPoint(39F, -2F, 3.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 410 lamp
		bodyModel[229].setRotationPoint(-42.25F, -2F, 3.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 lamp
		bodyModel[230].setRotationPoint(-41.75F, 1F, 3.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[231].setRotationPoint(-41.5F, 1F, 3.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[232].setRotationPoint(-42F, -2F, 3.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 4, 17, 2, 0F); // Box 414
		bodyModel[233].setRotationPoint(-4F, -20F, 6F);
	}
	ModelBlombergB theTrucks = new ModelBlombergB();
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelBlombergBnew theTrucks2 = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

//man i love being lazy sometimes
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8888) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, 0.11, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.85, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.6, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.0, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

	public ModelRendererTurbo Modelgtavthing[];

}