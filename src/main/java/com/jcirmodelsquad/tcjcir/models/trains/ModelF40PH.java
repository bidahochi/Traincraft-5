//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.01.2020 - 14:02:00
// Last changed on: 15.01.2020 - 14:02:00

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

public class ModelF40PH extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF40PH() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[231];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 163
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 166
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 168
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 169
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 246
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 247
		bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 263
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 246
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 247
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 164
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 259
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 261
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 262
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 263
		bodyModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 264
		bodyModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 265
		bodyModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 266
		bodyModel[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 292
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 292
		bodyModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY, "lamp"); // Box 115 liveryimg 2
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY, "lamp"); // Box 116 liveryimg 2
		bodyModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 5
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 143
		bodyModel[32] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 80
		bodyModel[36] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 81
		bodyModel[37] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 86
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 255
		bodyModel[40] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 256
		bodyModel[41] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 179
		bodyModel[42] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 249
		bodyModel[43] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 250
		bodyModel[44] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 239
		bodyModel[45] = new ModelRendererTurbo(this, 473, 1, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[46] = new ModelRendererTurbo(this, 481, 1, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 242
		bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[50] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 234
		bodyModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 236
		bodyModel[52] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 237
		bodyModel[53] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[63] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 4
		bodyModel[65] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 48
		bodyModel[71] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 43
		bodyModel[72] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 44
		bodyModel[73] = new ModelRendererTurbo(this, 89, 25, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[74] = new ModelRendererTurbo(this, 377, 17, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[75] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 201
		bodyModel[76] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 489
		bodyModel[77] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 278
		bodyModel[78] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 281
		bodyModel[79] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 288
		bodyModel[80] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 315
		bodyModel[81] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 316
		bodyModel[82] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 11
		bodyModel[83] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 210
		bodyModel[84] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 211
		bodyModel[85] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 220
		bodyModel[86] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 221
		bodyModel[87] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 222
		bodyModel[88] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 223
		bodyModel[89] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 224
		bodyModel[90] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 19
		bodyModel[91] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 334
		bodyModel[92] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 246
		bodyModel[96] = new ModelRendererTurbo(this, 353, 1, textureX, textureY, "lamp"); // Box 247 glow
		bodyModel[97] = new ModelRendererTurbo(this, 393, 1, textureX, textureY, "lamp"); // Box 248 glow
		bodyModel[98] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 249
		bodyModel[99] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 254
		bodyModel[100] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 255
		bodyModel[101] = new ModelRendererTurbo(this, 281, 17, textureX, textureY, "lamp"); // Box 256 lamp
		bodyModel[102] = new ModelRendererTurbo(this, 401, 17, textureX, textureY, "lamp"); // Box 257 lamp
		bodyModel[103] = new ModelRendererTurbo(this, 9, 9, textureX, textureY, "lamp"); // Box 334 glow
		bodyModel[104] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 335
		bodyModel[105] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 361
		bodyModel[106] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 365
		bodyModel[107] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 366
		bodyModel[108] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 367
		bodyModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 368
		bodyModel[110] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 369
		bodyModel[111] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 86
		bodyModel[112] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 87
		bodyModel[113] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 86
		bodyModel[114] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 498
		bodyModel[115] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 499
		bodyModel[116] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 500
		bodyModel[117] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 501
		bodyModel[118] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 502
		bodyModel[119] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 503
		bodyModel[120] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 504
		bodyModel[121] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 505
		bodyModel[122] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 506
		bodyModel[123] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 507
		bodyModel[124] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 508
		bodyModel[125] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 509
		bodyModel[126] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 510
		bodyModel[127] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 511
		bodyModel[128] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 512
		bodyModel[129] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 513
		bodyModel[130] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 6
		bodyModel[132] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 36
		bodyModel[133] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 37
		bodyModel[134] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 38
		bodyModel[135] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 39
		bodyModel[136] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 40
		bodyModel[137] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
		bodyModel[138] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 42
		bodyModel[139] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 359
		bodyModel[140] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 1
		bodyModel[141] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 55
		bodyModel[142] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 56
		bodyModel[143] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 57
		bodyModel[144] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 58
		bodyModel[145] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 81
		bodyModel[146] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 82
		bodyModel[147] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 83
		bodyModel[148] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 85
		bodyModel[149] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 182
		bodyModel[150] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 50
		bodyModel[151] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 52
		bodyModel[152] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 80
		bodyModel[153] = new ModelRendererTurbo(this, 185, 25, textureX, textureY, "lamp"); // Box 55 glow
		bodyModel[154] = new ModelRendererTurbo(this, 217, 25, textureX, textureY, "lamp"); // Box 56 glow
		bodyModel[155] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 9
		bodyModel[156] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 10
		bodyModel[157] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 21
		bodyModel[158] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 314 door swing right
		bodyModel[159] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 385
		bodyModel[160] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 26
		bodyModel[161] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 27
		bodyModel[162] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 182
		bodyModel[163] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 183
		bodyModel[164] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 185
		bodyModel[165] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 186
		bodyModel[166] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 187
		bodyModel[167] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 188
		bodyModel[168] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 189
		bodyModel[169] = new ModelRendererTurbo(this, 393, 49, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[170] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 191
		bodyModel[171] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 192
		bodyModel[172] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 193
		bodyModel[173] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 194
		bodyModel[174] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 64
		bodyModel[175] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 65
		bodyModel[176] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 66
		bodyModel[177] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 67
		bodyModel[178] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 89
		bodyModel[179] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 207
		bodyModel[180] = new ModelRendererTurbo(this, 401, 49, textureX, textureY, "lamp"); // Box 294 lamp
		bodyModel[181] = new ModelRendererTurbo(this, 505, 49, textureX, textureY, "lamp"); // Box 301 lamp
		bodyModel[182] = new ModelRendererTurbo(this, 121, 57, textureX, textureY, "lamp"); // Box 187 lamp VIA
		bodyModel[183] = new ModelRendererTurbo(this, 161, 57, textureX, textureY, "lamp"); // Box 188 lamp
		bodyModel[184] = new ModelRendererTurbo(this, 201, 57, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[185] = new ModelRendererTurbo(this, 225, 49, textureX, textureY, "lamp"); // Box 190 glow
		bodyModel[186] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 191
		bodyModel[187] = new ModelRendererTurbo(this, 289, 49, textureX, textureY, "lamp"); // Box 192 glow
		bodyModel[188] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 193
		bodyModel[189] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // box64
		bodyModel[190] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // box65
		bodyModel[191] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 80
		bodyModel[192] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 81
		bodyModel[193] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 82
		bodyModel[194] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 83
		bodyModel[195] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 200
		bodyModel[196] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 201
		bodyModel[197] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 202
		bodyModel[198] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 203
		bodyModel[199] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 484
		bodyModel[200] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 485
		bodyModel[201] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 486
		bodyModel[202] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 487
		bodyModel[203] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 484
		bodyModel[204] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 485
		bodyModel[205] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 486
		bodyModel[206] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 487
		bodyModel[207] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 390
		bodyModel[208] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 358
		bodyModel[209] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 40
		bodyModel[210] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 40
		bodyModel[211] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 390
		bodyModel[212] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 484
		bodyModel[213] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 485
		bodyModel[214] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 486
		bodyModel[215] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 487
		bodyModel[216] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 250
		bodyModel[217] = new ModelRendererTurbo(this, 377, 81, textureX, textureY, "lamp"); // Box 251 lamp
		bodyModel[218] = new ModelRendererTurbo(this, 385, 81, textureX, textureY, "lamp"); // Box 252 lamp
		bodyModel[219] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 253
		bodyModel[220] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 390
		bodyModel[221] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 358
		bodyModel[222] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 89
		bodyModel[223] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 207
		bodyModel[224] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 80
		bodyModel[225] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 83
		bodyModel[226] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 114
		bodyModel[227] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 74
		bodyModel[228] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 78
		bodyModel[229] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 245
		bodyModel[230] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 52

		bodyModel[0].addBox(0F, 0F, 0F, 74, 2, 14, 0F); // Box 114
		bodyModel[0].setRotationPoint(-40F, 1F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 163
		bodyModel[1].setRotationPoint(-26F, 1.5F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 166
		bodyModel[2].setRotationPoint(21F, 1.5F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[3].setRotationPoint(-25F, 1F, -10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[4].setRotationPoint(22F, 1F, -10.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[5].setRotationPoint(-41.01F, 0F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[6].setRotationPoint(-41F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[7].setRotationPoint(-41F, 2F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 263
		bodyModel[8].setRotationPoint(-41F, 0F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[9].setRotationPoint(39.01F, 0F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[10].setRotationPoint(39.02F, 2F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[11].setRotationPoint(39.02F, 2F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[12].setRotationPoint(34F, 1F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[13].setRotationPoint(34F, 1F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[14].setRotationPoint(34F, 0F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[15].setRotationPoint(34F, 0F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 263
		bodyModel[16].setRotationPoint(34F, 0F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[17].setRotationPoint(34F, 3F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[18].setRotationPoint(34F, 3F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[19].setRotationPoint(36F, 0F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[20].setRotationPoint(35F, 6F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 292
		bodyModel[21].setRotationPoint(35F, 6F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[22].setRotationPoint(-41F, 2F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[23].setRotationPoint(34F, 2F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[24].setRotationPoint(35.25F, -18F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 19, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(34F, -18F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(34F, -18F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2
		bodyModel[27].setRotationPoint(34.45F, -17.5F, -10F);
		bodyModel[27].rotateAngleY = -0.41887902F;

		bodyModel[28].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2
		bodyModel[28].setRotationPoint(34.45F, -17.5F, 10F);
		bodyModel[28].rotateAngleY = 0.41887902F;

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[29].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[30].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[31].setRotationPoint(39.01F, -8F, -8F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[32].setRotationPoint(39.02F, -2F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[33].setRotationPoint(39.01F, -8F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[34].setRotationPoint(39.02F, -2F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[35].setRotationPoint(39.02F, -8F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[36].setRotationPoint(39.02F, -8F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[37].setRotationPoint(-7F, 0.5F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[38].setRotationPoint(-7F, 1.5F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[39].setRotationPoint(-7F, 1.5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[40].setRotationPoint(-7F, 0.5F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 179
		bodyModel[41].setRotationPoint(40F, 0F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[42].setRotationPoint(34.5F, -7F, -11.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 250
		bodyModel[43].setRotationPoint(34.5F, -1F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[44].setRotationPoint(39F, -2F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[45].setRotationPoint(39.25F, -2F, -5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[46].setRotationPoint(39.25F, -2F, 3.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[47].setRotationPoint(39F, -2F, 3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[48].setRotationPoint(36.5F, -18F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[49].setRotationPoint(36.5F, -18F, 0F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[50].setRotationPoint(40F, -8F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[51].setRotationPoint(39F, -8F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[52].setRotationPoint(39F, -8F, 3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(-44F, 6F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[54].setRotationPoint(-44F, 5F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[55].setRotationPoint(-44F, 7F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(-44F, 6F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(-44.5F, 5F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[58].setRotationPoint(-44F, 7F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(39F, 6F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[60].setRotationPoint(39F, 5F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[61].setRotationPoint(39F, 7F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[62].setRotationPoint(39F, 6F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[63].setRotationPoint(39.5F, 5F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[64].setRotationPoint(39F, 7F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[65].setRotationPoint(-42F, 2.5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[66].setRotationPoint(39F, 2.5F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[67].setRotationPoint(-14F, 2F, -10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-14F, 1F, -10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[69].setRotationPoint(-13.75F, 2.5F, -10.25F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 48
		bodyModel[70].setRotationPoint(-32F, -21F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[71].setRotationPoint(-32F, -21F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[72].setRotationPoint(-32F, -21F, 2F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[73].setRotationPoint(-30.05F, -20.5F, -7F);
		bodyModel[73].rotateAngleY = 0.38397244F;

		bodyModel[74].addBox(0F, 0F, -5F, 0, 2, 4, 0F); // Box 118 liveryimg 2
		bodyModel[74].setRotationPoint(-30.05F, -20.5F, 7F);
		bodyModel[74].rotateAngleY = -0.38397244F;

		bodyModel[75].addBox(0F, 0F, 0F, 11, 4, 22, 0F); // Box 201
		bodyModel[75].setRotationPoint(-29F, -4F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[76].setRotationPoint(-11F, 3F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[77].setRotationPoint(-11F, 2F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[78].setRotationPoint(-11F, 6F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[79].setRotationPoint(-11F, 6F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[80].setRotationPoint(-11F, 2F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[81].setRotationPoint(-11F, 6F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[82].setRotationPoint(-30F, -21F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 53, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[83].setRotationPoint(-19F, -21F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[84].setRotationPoint(-30F, -21F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 220
		bodyModel[85].setRotationPoint(-29F, -21F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[86].setRotationPoint(-29F, -21F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[87].setRotationPoint(-29F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 53, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[88].setRotationPoint(-19F, -21F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 224
		bodyModel[89].setRotationPoint(-30F, -21F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[90].setRotationPoint(-10F, 2F, -11.5F);
		bodyModel[90].rotateAngleX = 0.87266463F;

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[91].setRotationPoint(-9F, 3.5F, 8.75F);
		bodyModel[91].rotateAngleX = 0.87266463F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[92].setRotationPoint(39F, 0F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[93].setRotationPoint(39F, 0F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 245
		bodyModel[94].setRotationPoint(39F, 0F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 246
		bodyModel[95].setRotationPoint(-23.85F, -21F, 8.5F);
		bodyModel[95].rotateAngleX = -0.62831853F;

		bodyModel[96].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 247 glow
		bodyModel[96].setRotationPoint(-24F, -21F, 8.5F);
		bodyModel[96].rotateAngleX = -0.62831853F;

		bodyModel[97].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 248 glow
		bodyModel[97].setRotationPoint(-24F, -21F, -8.5F);
		bodyModel[97].rotateAngleX = 0.62831853F;

		bodyModel[98].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 249
		bodyModel[98].setRotationPoint(-23.85F, -21F, -8.5F);
		bodyModel[98].rotateAngleX = 0.62831853F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[99].setRotationPoint(38.5F, 0F, 6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[100].setRotationPoint(38.5F, 0F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 lamp
		bodyModel[101].setRotationPoint(38.75F, 0F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 lamp
		bodyModel[102].setRotationPoint(38.75F, 0F, 6F);

		bodyModel[103].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 glow
		bodyModel[103].setRotationPoint(-29F, -22F, 5.5F);

		bodyModel[104].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 335
		bodyModel[104].setRotationPoint(-28.85F, -22F, 5.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 5, 3, 22, 0F); // Box 361
		bodyModel[105].setRotationPoint(5.25F, 3F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[106].setRotationPoint(5.25F, 6F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[107].setRotationPoint(5.25F, 6F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 367
		bodyModel[108].setRotationPoint(5.25F, 6F, 9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[109].setRotationPoint(5.25F, 2F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[110].setRotationPoint(5.25F, 2F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[111].setRotationPoint(-28.1F, -12F, -5F);
		bodyModel[111].rotateAngleY = -0.38397244F;

		bodyModel[112].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[112].setRotationPoint(-28F, -13F, -4F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 86
		bodyModel[113].setRotationPoint(-27F, -14F, -5F);
		bodyModel[113].rotateAngleY = -0.38397244F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 498
		bodyModel[114].setRotationPoint(35F, 7F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 499
		bodyModel[115].setRotationPoint(35F, 6F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 500
		bodyModel[116].setRotationPoint(35F, 4F, 8F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 501
		bodyModel[117].setRotationPoint(35F, 3F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 502
		bodyModel[118].setRotationPoint(35F, 2F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 503
		bodyModel[119].setRotationPoint(36F, 0F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 504
		bodyModel[120].setRotationPoint(35F, 6F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[121].setRotationPoint(36F, 0F, -8F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 506
		bodyModel[122].setRotationPoint(35F, 2F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[123].setRotationPoint(35F, 4F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[124].setRotationPoint(35F, 7F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 509
		bodyModel[125].setRotationPoint(35F, 3F, -8F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 510
		bodyModel[126].setRotationPoint(-41F, 6F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 511
		bodyModel[127].setRotationPoint(-41F, 6F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 512
		bodyModel[128].setRotationPoint(39F, 6F, 10F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 513
		bodyModel[129].setRotationPoint(39F, 6F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 52, 18, 4, 0F); // Box 2
		bodyModel[130].setRotationPoint(-18F, -18F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 52, 18, 4, 0F); // Box 6
		bodyModel[131].setRotationPoint(-18F, -18F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 36
		bodyModel[132].setRotationPoint(23F, -22F, -4F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 37
		bodyModel[133].setRotationPoint(13F, -22F, -4F);

		bodyModel[134].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 38
		bodyModel[134].setRotationPoint(3F, -22F, -4F);

		bodyModel[135].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 39
		bodyModel[135].setRotationPoint(-15F, -22F, -4F);

		bodyModel[136].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 40
		bodyModel[136].setRotationPoint(-27F, -22F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[137].setRotationPoint(-27F, -22F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[138].setRotationPoint(-27F, -22F, 4F);

		bodyModel[139].addBox(0F, 0F, 0F, 52, 21, 14, 0F); // Box 359
		bodyModel[139].setRotationPoint(-18F, -21F, -7F);

		bodyModel[140].addBox(0F, 0F, 0F, 11, 11, 22, 0F); // Box 1
		bodyModel[140].setRotationPoint(-40F, -11F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 55
		bodyModel[141].setRotationPoint(-42F, -11F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 56
		bodyModel[142].setRotationPoint(-42F, -11F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,-2F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[143].setRotationPoint(-42F, -13F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 58
		bodyModel[144].setRotationPoint(-42F, -13F, 0F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[145].setRotationPoint(-32.5F, -21.6F, -3.04F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 82
		bodyModel[146].setRotationPoint(-32.5F, -21.6F, 2.05F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 83
		bodyModel[147].setRotationPoint(-33.5F, -22.6F, -1.8F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 85
		bodyModel[148].setRotationPoint(-34.5F, -22.6F, -0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 182
		bodyModel[149].setRotationPoint(-33.5F, -22.6F, 0.800000000000001F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 50
		bodyModel[150].setRotationPoint(-41F, -3F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 52
		bodyModel[151].setRotationPoint(-42.5F, -10F, -1F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 80
		bodyModel[152].setRotationPoint(-31.5F, -21.6F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 55 glow
		bodyModel[153].setRotationPoint(-30F, -19.25F, 7.25F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 56 glow
		bodyModel[154].setRotationPoint(-30F, -19.25F, -8.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 9
		bodyModel[155].setRotationPoint(-29F, -18F, 10F);

		bodyModel[156].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 10
		bodyModel[156].setRotationPoint(-29F, -18F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 14, 17, 0F); // Box 21
		bodyModel[157].setRotationPoint(-19F, -18F, -10F);

		bodyModel[158].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[158].setRotationPoint(-18.5F, -18F, 10.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 75, 1, 22, 0F); // Box 385
		bodyModel[159].setRotationPoint(-41F, 0F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 26
		bodyModel[160].setRotationPoint(-42F, 0F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[161].setRotationPoint(-42F, 0F, 0F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 21, 8, 0F); // Box 182
		bodyModel[162].setRotationPoint(34F, -21F, -4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, -1F, -3F, 0F, 0.72F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.72F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[163].setRotationPoint(34F, -21F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0.72F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.72F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[164].setRotationPoint(34F, -21F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.27F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[165].setRotationPoint(34F, -21F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, -1.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[166].setRotationPoint(34F, -21F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 188
		bodyModel[167].setRotationPoint(34.5F, -7F, 10.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 189
		bodyModel[168].setRotationPoint(34.5F, -1F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[169].setRotationPoint(-32.5F, -20.5F, -1F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 191
		bodyModel[170].setRotationPoint(-19F, -20F, -7F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 192
		bodyModel[171].setRotationPoint(-31F, -12F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[172].setRotationPoint(-31F, -18F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[173].setRotationPoint(-31F, -18F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[174].setRotationPoint(34.25F, -15F, 9.25F);

		bodyModel[175].addShapeBox(0F, 0F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[175].setRotationPoint(34.25F, -13F, 11.25F);

		bodyModel[176].addShapeBox(0F, 0F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[176].setRotationPoint(34.25F, -13F, -8.25F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[177].setRotationPoint(34.25F, -15F, -10.25F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 89
		bodyModel[178].setRotationPoint(-17F, 1F, 11F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 207
		bodyModel[179].setRotationPoint(-17F, 1F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp
		bodyModel[180].setRotationPoint(-43F, -8F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp
		bodyModel[181].setRotationPoint(-43F, -10F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp VIA
		bodyModel[182].setRotationPoint(-43F, -6F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 188 lamp
		bodyModel[183].setRotationPoint(-42F, -2F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[184].setRotationPoint(-42F, -2F, -9F);

		bodyModel[185].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 190 glow
		bodyModel[185].setRotationPoint(-29F, -22F, 0.5F);

		bodyModel[186].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 191
		bodyModel[186].setRotationPoint(-28.85F, -22F, 0.5F);

		bodyModel[187].addShapeBox(0F, -1F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 192 glow
		bodyModel[187].setRotationPoint(-29F, -22F, -4.5F);

		bodyModel[188].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 193
		bodyModel[188].setRotationPoint(-28.85F, -22F, -4.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[189].setRotationPoint(-26F, -18F, 11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[190].setRotationPoint(-26F, -18F, -12F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 80
		bodyModel[191].setRotationPoint(-18F, -15F, -11.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 81
		bodyModel[192].setRotationPoint(-12F, -15F, -11.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 82
		bodyModel[193].setRotationPoint(-12F, -15F, 10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 83
		bodyModel[194].setRotationPoint(-18F, -15F, 10.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 200
		bodyModel[195].setRotationPoint(-2F, -15F, -11.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 201
		bodyModel[196].setRotationPoint(4F, -15F, -11.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 202
		bodyModel[197].setRotationPoint(4F, -15F, 10.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 203
		bodyModel[198].setRotationPoint(-2F, -15F, 10.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[199].setRotationPoint(-31F, -22.75F, 4.2F);

		bodyModel[200].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[200].setRotationPoint(-31.75F, -22.25F, 5.2F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[201].setRotationPoint(-32.5F, -22.25F, 3.2F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[202].setRotationPoint(-30.75F, -22.25F, 4.2F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[203].setRotationPoint(-31F, -22.75F, -5.2F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[204].setRotationPoint(-31.75F, -22.25F, -4.2F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[205].setRotationPoint(-32.5F, -22.25F, -6.2F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[206].setRotationPoint(-30.75F, -22.25F, -5.2F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 390
		bodyModel[207].setRotationPoint(-25.5F, -22F, -6F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 358
		bodyModel[208].setRotationPoint(-25.5F, -22F, 6F);

		bodyModel[209].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Box 40
		bodyModel[209].setRotationPoint(-27F, -22F, -4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 14, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[210].setRotationPoint(-2F, -22F, -5F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 390
		bodyModel[211].setRotationPoint(-11.5F, -23F, -3F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[212].setRotationPoint(-5F, -22.75F, 0.2F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[213].setRotationPoint(-5.75F, -22.25F, 1.2F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[214].setRotationPoint(-6.5F, -22.25F, -0.8F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[215].setRotationPoint(-4.75F, -22.25F, 0.2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[216].setRotationPoint(-41.5F, 1F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 lamp
		bodyModel[217].setRotationPoint(-41.75F, 1F, 6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 lamp
		bodyModel[218].setRotationPoint(-41.75F, 1F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[219].setRotationPoint(-41.5F, 1F, -8F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 390
		bodyModel[220].setRotationPoint(-27.5F, -20.5F, -9F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 358
		bodyModel[221].setRotationPoint(-27.5F, -20.5F, 9F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 89
		bodyModel[222].setRotationPoint(-40F, 1F, 11F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 207
		bodyModel[223].setRotationPoint(-40F, 1F, -11F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 80
		bodyModel[224].setRotationPoint(-28F, -17F, -12F);

		bodyModel[225].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 83
		bodyModel[225].setRotationPoint(-28F, -17F, 11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[226].setRotationPoint(-34F, -19F, -0.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[227].setRotationPoint(-34F, -20F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[228].setRotationPoint(-33.75F, -18.5F, -0.25F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[229].setRotationPoint(-34F, -21F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 52
		bodyModel[230].setRotationPoint(-42.5F, -6F, -1F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderLocomotiveModelWithoutBeacon(bodyModel, entity ,f5);


		if (GetColor(entity) == 80) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.25, 0);
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}