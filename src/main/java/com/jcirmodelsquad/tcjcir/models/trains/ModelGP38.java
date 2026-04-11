//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP38-39-40
// Model Creator: Bida
// Created on: 28.02.2022 - 07:22:48
// Last changed on: 28.02.2022 - 07:22:48

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelGP38 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP38() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[554];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 headlight sp front b
		bodyModel[1] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 headlight sp front a
		bodyModel[2] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 headlight front gyralight sp red
		bodyModel[3] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[4] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 17, 102, textureX, textureY); // Box 352
		bodyModel[6] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[7] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[8] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[9] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[10] = new ModelRendererTurbo(this, 10, 56, textureX, textureY, "lamp"); // Box 362 markerlight glow
		bodyModel[11] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "lamp"); // Box 363 markerlight glow
		bodyModel[12] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[13] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[14] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[15] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[16] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[17] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[20] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 266, 92, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[23] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[25] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[26] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[27] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[28] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[29] = new ModelRendererTurbo(this, 46, 136, textureX, textureY); // Box 143
		bodyModel[30] = new ModelRendererTurbo(this, 13, 137, textureX, textureY); // Box 61
		bodyModel[31] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[34] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[35] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[36] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[37] = new ModelRendererTurbo(this, 14, 137, textureX, textureY); // Box 226
		bodyModel[38] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[39] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 271
		bodyModel[40] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[41] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[42] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[43] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[44] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[45] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[46] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[47] = new ModelRendererTurbo(this, 374, 148, textureX, textureY); // Box 261
		bodyModel[48] = new ModelRendererTurbo(this, 392, 148, textureX, textureY); // Box 262
		bodyModel[49] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[50] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[51] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[54] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[55] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[56] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[57] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[58] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 204
		bodyModel[59] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[60] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[61] = new ModelRendererTurbo(this, 370, 180, textureX, textureY); // Box 225
		bodyModel[62] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 301
		bodyModel[63] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[64] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[65] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[66] = new ModelRendererTurbo(this, 284, 107, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 283, 70, textureX, textureY); // Box 112
		bodyModel[68] = new ModelRendererTurbo(this, 363, 114, textureX, textureY); // Box 113
		bodyModel[69] = new ModelRendererTurbo(this, 357, 114, textureX, textureY); // Box 116
		bodyModel[70] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[71] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[72] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[73] = new ModelRendererTurbo(this, 104, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[74] = new ModelRendererTurbo(this, 93, 45, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[75] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front up 1
		bodyModel[76] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front up 2
		bodyModel[77] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[78] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[79] = new ModelRendererTurbo(this, 2, 45, textureX, textureY); // Box 43
		bodyModel[80] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[81] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[82] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[83] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[84] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 nose brake cover
		bodyModel[85] = new ModelRendererTurbo(this, 106, 54, textureX, textureY); // Box 355
		bodyModel[86] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[87] = new ModelRendererTurbo(this, 261, 74, textureX, textureY); // Box 163
		bodyModel[88] = new ModelRendererTurbo(this, 405, 113, textureX, textureY); // Box 166
		bodyModel[89] = new ModelRendererTurbo(this, 429, 94, textureX, textureY); // Box 408
		bodyModel[90] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 409
		bodyModel[91] = new ModelRendererTurbo(this, 326, 29, textureX, textureY); // Box 19 the hooh
		bodyModel[92] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[93] = new ModelRendererTurbo(this, 461, 85, textureX, textureY); // Box 40
		bodyModel[94] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 41
		bodyModel[95] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[96] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[97] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear 2 beam
		bodyModel[98] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear 2 beam
		bodyModel[99] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[100] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[101] = new ModelRendererTurbo(this, 268, 9, textureX, textureY); // Box 264 gp38 filter box
		bodyModel[102] = new ModelRendererTurbo(this, 460, 150, textureX, textureY); // Box 297 vent 2 part f
		bodyModel[103] = new ModelRendererTurbo(this, 460, 150, textureX, textureY); // Box 299 vent 2 part e
		bodyModel[104] = new ModelRendererTurbo(this, 420, 150, textureX, textureY); // Box 272 vent 2 part f
		bodyModel[105] = new ModelRendererTurbo(this, 420, 150, textureX, textureY); // Box 273 vent 2 part e
		bodyModel[106] = new ModelRendererTurbo(this, 397, 15, textureX, textureY); // Box 101
		bodyModel[107] = new ModelRendererTurbo(this, 420, 15, textureX, textureY); // Box 104
		bodyModel[108] = new ModelRendererTurbo(this, 354, 15, textureX, textureY); // Box 105 dynamics special
		bodyModel[109] = new ModelRendererTurbo(this, 397, 22, textureX, textureY); // Box 284
		bodyModel[110] = new ModelRendererTurbo(this, 354, 22, textureX, textureY); // Box 285 dynamics special
		bodyModel[111] = new ModelRendererTurbo(this, 420, 22, textureX, textureY); // Box 286
		bodyModel[112] = new ModelRendererTurbo(this, 317, 116, textureX, textureY); // Box 36
		bodyModel[113] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[114] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[115] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[116] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 351 sandcap
		bodyModel[117] = new ModelRendererTurbo(this, 264, 123, textureX, textureY); // Box 63
		bodyModel[118] = new ModelRendererTurbo(this, 264, 76, textureX, textureY); // Box 170
		bodyModel[119] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[120] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[121] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[122] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[123] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[124] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[125] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[126] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[127] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[128] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[129] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[130] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[131] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[132] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[133] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[134] = new ModelRendererTurbo(this, 285, 114, textureX, textureY); // Box 129
		bodyModel[135] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 130
		bodyModel[136] = new ModelRendererTurbo(this, 282, 114, textureX, textureY); // Box 133
		bodyModel[137] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 134
		bodyModel[138] = new ModelRendererTurbo(this, 300, 114, textureX, textureY); // Box 192
		bodyModel[139] = new ModelRendererTurbo(this, 297, 114, textureX, textureY); // Box 193
		bodyModel[140] = new ModelRendererTurbo(this, 443, 65, textureX, textureY); // Box 194
		bodyModel[141] = new ModelRendererTurbo(this, 440, 65, textureX, textureY); // Box 195
		bodyModel[142] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[143] = new ModelRendererTurbo(this, 360, 114, textureX, textureY); // Box 197
		bodyModel[144] = new ModelRendererTurbo(this, 368, 67, textureX, textureY); // Box 198
		bodyModel[145] = new ModelRendererTurbo(this, 323, 67, textureX, textureY); // Box 199
		bodyModel[146] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 200
		bodyModel[147] = new ModelRendererTurbo(this, 371, 67, textureX, textureY); // Box 201
		bodyModel[148] = new ModelRendererTurbo(this, 248, 81, textureX, textureY); // Box 4
		bodyModel[149] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[150] = new ModelRendererTurbo(this, 242, 156, textureX, textureY); // Box 489
		bodyModel[151] = new ModelRendererTurbo(this, 218, 213, textureX, textureY); // Box 278
		bodyModel[152] = new ModelRendererTurbo(this, 219, 218, textureX, textureY); // Box 281
		bodyModel[153] = new ModelRendererTurbo(this, 246, 182, textureX, textureY); // Box 288
		bodyModel[154] = new ModelRendererTurbo(this, 304, 213, textureX, textureY); // Box 315
		bodyModel[155] = new ModelRendererTurbo(this, 305, 218, textureX, textureY); // Box 316
		bodyModel[156] = new ModelRendererTurbo(this, 256, 172, textureX, textureY); // Box 19
		bodyModel[157] = new ModelRendererTurbo(this, 248, 138, textureX, textureY); // Box 559
		bodyModel[158] = new ModelRendererTurbo(this, 300, 172, textureX, textureY); // Box 560
		bodyModel[159] = new ModelRendererTurbo(this, 220, 208, textureX, textureY); // Box 562
		bodyModel[160] = new ModelRendererTurbo(this, 306, 208, textureX, textureY); // Box 563
		bodyModel[161] = new ModelRendererTurbo(this, 301, 186, textureX, textureY); // Box 564
		bodyModel[162] = new ModelRendererTurbo(this, 329, 198, textureX, textureY); // Box 565
		bodyModel[163] = new ModelRendererTurbo(this, 297, 160, textureX, textureY); // Box 566
		bodyModel[164] = new ModelRendererTurbo(this, 328, 193, textureX, textureY); // Box 567
		bodyModel[165] = new ModelRendererTurbo(this, 297, 140, textureX, textureY); // Box 568
		bodyModel[166] = new ModelRendererTurbo(this, 328, 166, textureX, textureY); // Box 569
		bodyModel[167] = new ModelRendererTurbo(this, 329, 160, textureX, textureY); // Box 570
		bodyModel[168] = new ModelRendererTurbo(this, 215, 186, textureX, textureY); // Box 571
		bodyModel[169] = new ModelRendererTurbo(this, 219, 198, textureX, textureY); // Box 572
		bodyModel[170] = new ModelRendererTurbo(this, 211, 160, textureX, textureY); // Box 573
		bodyModel[171] = new ModelRendererTurbo(this, 218, 193, textureX, textureY); // Box 574
		bodyModel[172] = new ModelRendererTurbo(this, 223, 140, textureX, textureY); // Box 575
		bodyModel[173] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 576
		bodyModel[174] = new ModelRendererTurbo(this, 218, 166, textureX, textureY); // Box 577
		bodyModel[175] = new ModelRendererTurbo(this, 17, 187, textureX, textureY); // Box 811
		bodyModel[176] = new ModelRendererTurbo(this, 373, 150, textureX, textureY); // Box 812
		bodyModel[177] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 44
		bodyModel[178] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 45
		bodyModel[179] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 56
		bodyModel[180] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 178
		bodyModel[181] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 61
		bodyModel[182] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[183] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[184] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 174
		bodyModel[185] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 176
		bodyModel[186] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[187] = new ModelRendererTurbo(this, 100, 136, textureX, textureY); // Box 191
		bodyModel[188] = new ModelRendererTurbo(this, 99, 125, textureX, textureY); // Box 227
		bodyModel[189] = new ModelRendererTurbo(this, 105, 139, textureX, textureY); // Box 293
		bodyModel[190] = new ModelRendererTurbo(this, 97, 123, textureX, textureY); // Box 258
		bodyModel[191] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 300
		bodyModel[192] = new ModelRendererTurbo(this, 475, 3, textureX, textureY); // Box 276 gp38/39 fan
		bodyModel[193] = new ModelRendererTurbo(this, 456, 6, textureX, textureY); // Box 277 gp38/39 fan
		bodyModel[194] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[195] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[196] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[197] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[198] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[199] = new ModelRendererTurbo(this, 461, 51, textureX, textureY); // Box 274 gp38 exhaust
		bodyModel[200] = new ModelRendererTurbo(this, 497, 51, textureX, textureY); // Box 275 gp38 exhaust
		bodyModel[201] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 278
		bodyModel[202] = new ModelRendererTurbo(this, 497, 42, textureX, textureY); // Box 477 gp38 stack extension
		bodyModel[203] = new ModelRendererTurbo(this, 461, 42, textureX, textureY); // Box 478 gp38 stack extension
		bodyModel[204] = new ModelRendererTurbo(this, 487, 47, textureX, textureY); // Box 479 gp38 extra stacc
		bodyModel[205] = new ModelRendererTurbo(this, 471, 47, textureX, textureY); // Box 480 gp38 extra stacc
		bodyModel[206] = new ModelRendererTurbo(this, 471, 40, textureX, textureY); // Box 365 gp38 arr stacc
		bodyModel[207] = new ModelRendererTurbo(this, 487, 40, textureX, textureY); // Box 366 gp38 arr stack
		bodyModel[208] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[209] = new ModelRendererTurbo(this, 420, 139, textureX, textureY); // Box 847 vent 1 part f
		bodyModel[210] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274 gp39/40 exhaust
		bodyModel[211] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[212] = new ModelRendererTurbo(this, 420, 139, textureX, textureY); // Box 850 vent 1 part e
		bodyModel[213] = new ModelRendererTurbo(this, 470, 66, textureX, textureY, "lamp"); // Box 851  headlight rear canadurr
		bodyModel[214] = new ModelRendererTurbo(this, 469, 71, textureX, textureY); // Box 852 canadurr mounting
		bodyModel[215] = new ModelRendererTurbo(this, 415, 6, textureX, textureY); // Box 853 gp40 fan
		bodyModel[216] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 854 gp40 fan
		bodyModel[217] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 855 gp40 fan
		bodyModel[218] = new ModelRendererTurbo(this, 102, 125, textureX, textureY); // Box 38R
		bodyModel[219] = new ModelRendererTurbo(this, 112, 136, textureX, textureY); // Box 176
		bodyModel[220] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[221] = new ModelRendererTurbo(this, 407, 161, textureX, textureY); // Box 244
		bodyModel[222] = new ModelRendererTurbo(this, 367, 161, textureX, textureY); // Box 249
		bodyModel[223] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[224] = new ModelRendererTurbo(this, 112, 134, textureX, textureY); // Box 313
		bodyModel[225] = new ModelRendererTurbo(this, 177, 134, textureX, textureY); // Box 315
		bodyModel[226] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 316
		bodyModel[227] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[228] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[229] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[230] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[231] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[232] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[233] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[234] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 308
		bodyModel[235] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 309
		bodyModel[236] = new ModelRendererTurbo(this, 307, 15, textureX, textureY); // Box 310
		bodyModel[237] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[238] = new ModelRendererTurbo(this, 82, 2, textureX, textureY); // box64
		bodyModel[239] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // box65
		bodyModel[240] = new ModelRendererTurbo(this, 382, 22, textureX, textureY); // Box 879 dynamics short
		bodyModel[241] = new ModelRendererTurbo(this, 382, 15, textureX, textureY); // Box 880 dynamics short
		bodyModel[242] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 881
		bodyModel[243] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 882
		bodyModel[244] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412 cs
		bodyModel[245] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413 cs
		bodyModel[246] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86 cs
		bodyModel[247] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[248] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307 spedo
		bodyModel[249] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[250] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[251] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[252] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[253] = new ModelRendererTurbo(this, 41, 207, textureX, textureY, "cull"); // Box 450 cull
		bodyModel[254] = new ModelRendererTurbo(this, 7, 207, textureX, textureY, "cull"); // Box 451 cull
		bodyModel[255] = new ModelRendererTurbo(this, 11, 168, textureX, textureY); // Box 452
		bodyModel[256] = new ModelRendererTurbo(this, 368, 200, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[257] = new ModelRendererTurbo(this, 367, 200, textureX, textureY); // Box 454
		bodyModel[258] = new ModelRendererTurbo(this, 392, 200, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[259] = new ModelRendererTurbo(this, 382, 219, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[260] = new ModelRendererTurbo(this, 26, 204, textureX, textureY, "cull"); // Box 339 cull
		bodyModel[261] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 78
		bodyModel[262] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 188
		bodyModel[263] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front a
		bodyModel[264] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front a
		bodyModel[265] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 239
		bodyModel[266] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear a
		bodyModel[267] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear a
		bodyModel[268] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 242
		bodyModel[269] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268 anticlimber
		bodyModel[270] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269anticlimber
		bodyModel[271] = new ModelRendererTurbo(this, 184, 50, textureX, textureY, "cull"); // Box 369 cull
		bodyModel[272] = new ModelRendererTurbo(this, 149, 35, textureX, textureY); // Box 372
		bodyModel[273] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 250
		bodyModel[274] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 251 ditchlight front b
		bodyModel[275] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 252 ditchlight front b
		bodyModel[276] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 253
		bodyModel[277] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 254
		bodyModel[278] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 255
		bodyModel[279] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear b
		bodyModel[280] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 257 ditchlight rear b
		bodyModel[281] = new ModelRendererTurbo(this, 222, 43, textureX, textureY); // Box 338
		bodyModel[282] = new ModelRendererTurbo(this, 220, 40, textureX, textureY); // Box 339
		bodyModel[283] = new ModelRendererTurbo(this, 222, 37, textureX, textureY); // Box 340
		bodyModel[284] = new ModelRendererTurbo(this, 231, 39, textureX, textureY); // Box 341
		bodyModel[285] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 348 cull
		bodyModel[286] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 349 ditchlight front c
		bodyModel[287] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 350 ditchlight front c
		bodyModel[288] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 351 cull
		bodyModel[289] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 352 cull
		bodyModel[290] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[291] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 354 ditchlight rear c
		bodyModel[292] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 355 ditchlight rear c
		bodyModel[293] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[294] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[295] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[296] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[297] = new ModelRendererTurbo(this, 410, 186, textureX, textureY); // Box 399
		bodyModel[298] = new ModelRendererTurbo(this, 409, 180, textureX, textureY); // Box 400
		bodyModel[299] = new ModelRendererTurbo(this, 76, 124, textureX, textureY); // Box 401
		bodyModel[300] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 402
		bodyModel[301] = new ModelRendererTurbo(this, 236, 27, textureX, textureY); // Box 327
		bodyModel[302] = new ModelRendererTurbo(this, 238, 24, textureX, textureY); // Box 328
		bodyModel[303] = new ModelRendererTurbo(this, 238, 30, textureX, textureY); // Box 329
		bodyModel[304] = new ModelRendererTurbo(this, 247, 27, textureX, textureY); // Box 330
		bodyModel[305] = new ModelRendererTurbo(this, 255, 24, textureX, textureY); // Box 271
		bodyModel[306] = new ModelRendererTurbo(this, 255, 30, textureX, textureY); // Box 272
		bodyModel[307] = new ModelRendererTurbo(this, 264, 27, textureX, textureY); // Box 273
		bodyModel[308] = new ModelRendererTurbo(this, 253, 27, textureX, textureY); // Box 274
		bodyModel[309] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[310] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[311] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[312] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[313] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 361
		bodyModel[314] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 362
		bodyModel[315] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 363
		bodyModel[316] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 364
		bodyModel[317] = new ModelRendererTurbo(this, 265, 15, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[318] = new ModelRendererTurbo(this, 229, 26, textureX, textureY); // Box 403
		bodyModel[319] = new ModelRendererTurbo(this, 222, 27, textureX, textureY); // Box 404
		bodyModel[320] = new ModelRendererTurbo(this, 220, 24, textureX, textureY); // Box 405
		bodyModel[321] = new ModelRendererTurbo(this, 222, 30, textureX, textureY); // Box 406
		bodyModel[322] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 352
		bodyModel[323] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 353 lamp front arr
		bodyModel[324] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 354 lamp front arr
		bodyModel[325] = new ModelRendererTurbo(this, 191, 42, textureX, textureY); // Box 284
		bodyModel[326] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[327] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[328] = new ModelRendererTurbo(this, 129, 75, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[329] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[330] = new ModelRendererTurbo(this, 129, 91, textureX, textureY, "cull"); // Box 1087 cull aww
		bodyModel[331] = new ModelRendererTurbo(this, 131, 86, textureX, textureY); // Box 1088
		bodyModel[332] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 327
		bodyModel[333] = new ModelRendererTurbo(this, 238, 34, textureX, textureY); // Box 328
		bodyModel[334] = new ModelRendererTurbo(this, 238, 46, textureX, textureY); // Box 329
		bodyModel[335] = new ModelRendererTurbo(this, 247, 40, textureX, textureY); // Box 330
		bodyModel[336] = new ModelRendererTurbo(this, 240, 37, textureX, textureY); // Box 331
		bodyModel[337] = new ModelRendererTurbo(this, 240, 43, textureX, textureY); // Box 332
		bodyModel[338] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 1095
		bodyModel[339] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 1096
		bodyModel[340] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 1097
		bodyModel[341] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 1098
		bodyModel[342] = new ModelRendererTurbo(this, 220, 33, textureX, textureY); // Box 894
		bodyModel[343] = new ModelRendererTurbo(this, 229, 33, textureX, textureY); // Box 895
		bodyModel[344] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[345] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[346] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[347] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[348] = new ModelRendererTurbo(this, 375, 7, textureX, textureY); // Box 317
		bodyModel[349] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 421 prime base
		bodyModel[350] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[351] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[352] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[353] = new ModelRendererTurbo(this, 175, 5, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[354] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[355] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[356] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[357] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[358] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[359] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[360] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[361] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[362] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[363] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[364] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[365] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[366] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[367] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[368] = new ModelRendererTurbo(this, 256, 12, textureX, textureY); // Box 421 prime base
		bodyModel[369] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[370] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[371] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[372] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[373] = new ModelRendererTurbo(this, 76, 79, textureX, textureY); // Box 382hh
		bodyModel[374] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[375] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[376] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f hh
		bodyModel[377] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f hh
		bodyModel[378] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[379] = new ModelRendererTurbo(this, 77, 69, textureX, textureY, "lamp"); // Box 350 numberboard hh
		bodyModel[380] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 numberboard hh
		bodyModel[381] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 354
		bodyModel[382] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 355
		bodyModel[383] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 356
		bodyModel[384] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 357
		bodyModel[385] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 22
		bodyModel[386] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 23
		bodyModel[387] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 24
		bodyModel[388] = new ModelRendererTurbo(this, 38, 195, textureX, textureY); // Box 25
		bodyModel[389] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[390] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 4
		bodyModel[391] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[392] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 4
		bodyModel[393] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[394] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[395] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 280
		bodyModel[396] = new ModelRendererTurbo(this, 40, 160, textureX, textureY); // Box 285
		bodyModel[397] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[398] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[399] = new ModelRendererTurbo(this, 456, 191, textureX, textureY); // Box 1165
		bodyModel[400] = new ModelRendererTurbo(this, 409, 188, textureX, textureY); // Box 1166
		bodyModel[401] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 1167
		bodyModel[402] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 1168
		bodyModel[403] = new ModelRendererTurbo(this, 441, 165, textureX, textureY); // Box 1169
		bodyModel[404] = new ModelRendererTurbo(this, 426, 163, textureX, textureY); // Box 1170
		bodyModel[405] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 1171
		bodyModel[406] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 1172
		bodyModel[407] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 1173
		bodyModel[408] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 1174
		bodyModel[409] = new ModelRendererTurbo(this, 479, 71, textureX, textureY); // Box 381 sp mount
		bodyModel[410] = new ModelRendererTurbo(this, 479, 64, textureX, textureY); // Box 31 sp mount
		bodyModel[411] = new ModelRendererTurbo(this, 476, 63, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[412] = new ModelRendererTurbo(this, 476, 63, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[413] = new ModelRendererTurbo(this, 476, 58, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[414] = new ModelRendererTurbo(this, 483, 59, textureX, textureY); // Box 389 sp mount
		bodyModel[415] = new ModelRendererTurbo(this, 256, 16, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[416] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[417] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[418] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[419] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[420] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[421] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[422] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[423] = new ModelRendererTurbo(this, 172, 23, textureX, textureY); // Box 342
		bodyModel[424] = new ModelRendererTurbo(this, 172, 20, textureX, textureY); // Box 343
		bodyModel[425] = new ModelRendererTurbo(this, 170, 26, textureX, textureY); // Box 344
		bodyModel[426] = new ModelRendererTurbo(this, 179, 23, textureX, textureY); // Box 345
		bodyModel[427] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 484
		bodyModel[428] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 485
		bodyModel[429] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 486
		bodyModel[430] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 487
		bodyModel[431] = new ModelRendererTurbo(this, 165, 51, textureX, textureY); // Box 184 o2 generator
		bodyModel[432] = new ModelRendererTurbo(this, 161, 91, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[433] = new ModelRendererTurbo(this, 149, 30, textureX, textureY); // Box 450
		bodyModel[434] = new ModelRendererTurbo(this, 494, 68, textureX, textureY); // Box 470
		bodyModel[435] = new ModelRendererTurbo(this, 494, 63, textureX, textureY, "lamp"); // Box 471 headlight rear SCREWY
		bodyModel[436] = new ModelRendererTurbo(this, 494, 63, textureX, textureY, "lamp"); // Box 472 headlight rear SCRWEWY TWOWOEE
		bodyModel[437] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Box 1203
		bodyModel[438] = new ModelRendererTurbo(this, 219, 12, textureX, textureY); // Box 409 commander base
		bodyModel[439] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[440] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[441] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[442] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[443] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[444] = new ModelRendererTurbo(this, 501, 88, textureX, textureY, "lamp"); // Box 376 markerlight
		bodyModel[445] = new ModelRendererTurbo(this, 463, 88, textureX, textureY, "lamp"); // Box 377 markerlight
		bodyModel[446] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[447] = new ModelRendererTurbo(this, 454, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[448] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 1217
		bodyModel[449] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 1218
		bodyModel[450] = new ModelRendererTurbo(this, 154, 14, textureX, textureY); // Box 114
		bodyModel[451] = new ModelRendererTurbo(this, 154, 11, textureX, textureY); // Box 74
		bodyModel[452] = new ModelRendererTurbo(this, 154, 17, textureX, textureY); // Box 78
		bodyModel[453] = new ModelRendererTurbo(this, 154, 8, textureX, textureY); // Box 470
		bodyModel[454] = new ModelRendererTurbo(this, 154, 8, textureX, textureY); // Box 471
		bodyModel[455] = new ModelRendererTurbo(this, 152, 5, textureX, textureY); // Box 472
		bodyModel[456] = new ModelRendererTurbo(this, 213, 14, textureX, textureY); // Box 514
		bodyModel[457] = new ModelRendererTurbo(this, 213, 11, textureX, textureY); // Box 515
		bodyModel[458] = new ModelRendererTurbo(this, 213, 17, textureX, textureY); // Box 516
		bodyModel[459] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 517
		bodyModel[460] = new ModelRendererTurbo(this, 211, 5, textureX, textureY); // Box 518
		bodyModel[461] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 519
		bodyModel[462] = new ModelRendererTurbo(this, 206, 22, textureX, textureY); // Box 1231
		bodyModel[463] = new ModelRendererTurbo(this, 197, 16, textureX, textureY); // Box 1232
		bodyModel[464] = new ModelRendererTurbo(this, 195, 22, textureX, textureY); // Box 1233
		bodyModel[465] = new ModelRendererTurbo(this, 197, 28, textureX, textureY); // Box 1234
		bodyModel[466] = new ModelRendererTurbo(this, 199, 19, textureX, textureY); // Box 1235
		bodyModel[467] = new ModelRendererTurbo(this, 199, 25, textureX, textureY); // Box 1236
		bodyModel[468] = new ModelRendererTurbo(this, 94, 75, textureX, textureY); // Box 1250
		bodyModel[469] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[470] = new ModelRendererTurbo(this, 264, 38, textureX, textureY); // Box 1252
		bodyModel[471] = new ModelRendererTurbo(this, 255, 46, textureX, textureY); // Box 1253
		bodyModel[472] = new ModelRendererTurbo(this, 253, 40, textureX, textureY); // Box 1254
		bodyModel[473] = new ModelRendererTurbo(this, 255, 34, textureX, textureY); // Box 1255
		bodyModel[474] = new ModelRendererTurbo(this, 257, 37, textureX, textureY); // Box 1256
		bodyModel[475] = new ModelRendererTurbo(this, 257, 43, textureX, textureY); // Box 1257
		bodyModel[476] = new ModelRendererTurbo(this, 265, 42, textureX, textureY); // Box 1258
		bodyModel[477] = new ModelRendererTurbo(this, 250, 12, textureX, textureY); // Box 409 commander base
		bodyModel[478] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[479] = new ModelRendererTurbo(this, 149, 28, textureX, textureY); // Box 448
		bodyModel[480] = new ModelRendererTurbo(this, 152, 25, textureX, textureY); // Box 446
		bodyModel[481] = new ModelRendererTurbo(this, 449, 30, textureX, textureY); // Box 196 winterization hatch
		bodyModel[482] = new ModelRendererTurbo(this, 205, 5, textureX, textureY); // Box 1264
		bodyModel[483] = new ModelRendererTurbo(this, 206, 9, textureX, textureY); // Box 1265
		bodyModel[484] = new ModelRendererTurbo(this, 206, 12, textureX, textureY); // Box 1266
		bodyModel[485] = new ModelRendererTurbo(this, 206, 15, textureX, textureY); // Box 1267
		bodyModel[486] = new ModelRendererTurbo(this, 266, 12, textureX, textureY); // Box 409 commander base
		bodyModel[487] = new ModelRendererTurbo(this, 266, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[488] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[489] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[490] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[491] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[492] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[493] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[494] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[495] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[496] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[497] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[498] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[499] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 headlight sp front b
		bodyModel[0].setRotationPoint(-38.75F, -12F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 headlight sp front a
		bodyModel[1].setRotationPoint(-38.75F, -12F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 headlight front gyralight sp red
		bodyModel[2].setRotationPoint(-38.75F, -14F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[3].setRotationPoint(-37.98F, -14F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(-38.15F, -13F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[5].setRotationPoint(-39F, -8F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[6].setRotationPoint(-39F, -10F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[7].setRotationPoint(-39F, -10F, 1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[8].setRotationPoint(-39F, -13F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[9].setRotationPoint(-39F, -13F, -7F);

		bodyModel[10].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[10].setRotationPoint(-36.9F, -11.5F, -5.5F);
		bodyModel[10].rotateAngleY = 0.43633231F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363 markerlight glow
		bodyModel[11].setRotationPoint(-36.9F, -11.5F, 5.5F);
		bodyModel[11].rotateAngleY = -0.43633231F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[12].setRotationPoint(-39F, -8F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[13].setRotationPoint(-39F, -11F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[14].setRotationPoint(-39F, -13F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[15].setRotationPoint(-39F, -12F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[16].setRotationPoint(-39F, -10F, -1F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[17].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[19].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[20].setRotationPoint(40F, 2.5F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 80, 2, 12, 0F); // Box 23
		bodyModel[21].setRotationPoint(-40F, 1F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[22].setRotationPoint(-36F, 1F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[23].setRotationPoint(-40F, 0F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[24].setRotationPoint(-36F, 1F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[25].setRotationPoint(-36F, 0F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[26].setRotationPoint(-36F, 5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[27].setRotationPoint(-36F, 5F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[28].setRotationPoint(-36F, 0F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[29].setRotationPoint(-40F, -8F, -8F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[30].setRotationPoint(-40F, -1F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[31].setRotationPoint(-40F, -1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[32].setRotationPoint(-40F, -8F, -6F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[33].setRotationPoint(-40F, -8F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[34].setRotationPoint(-41F, -8F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[35].setRotationPoint(-40F, -8F, 4F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[36].setRotationPoint(-40F, -8F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 226
		bodyModel[37].setRotationPoint(-40F, 8F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[38].setRotationPoint(-40F, 7F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[39].setRotationPoint(-40F, 1F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[40].setRotationPoint(-40F, 3F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[41].setRotationPoint(-41F, 0F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[42].setRotationPoint(-41F, 0F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[43].setRotationPoint(-41F, 0F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[44].setRotationPoint(40F, 0F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[45].setRotationPoint(35F, 1F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[46].setRotationPoint(35F, 1F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[47].setRotationPoint(35F, 0F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[48].setRotationPoint(35F, 0F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[49].setRotationPoint(35F, 5F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[50].setRotationPoint(35F, 5F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[51].setRotationPoint(40F, -1F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[52].setRotationPoint(40F, -1F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[53].setRotationPoint(40F, -8F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[54].setRotationPoint(40F, -8F, 6F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[55].setRotationPoint(41F, -8F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[56].setRotationPoint(40F, -8F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[57].setRotationPoint(40F, 0F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[58].setRotationPoint(40F, 0F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[59].setRotationPoint(40F, -8F, 4F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[60].setRotationPoint(40F, 7F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 18, 0F); // Box 225
		bodyModel[61].setRotationPoint(40F, 8F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[62].setRotationPoint(40F, 0F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[63].setRotationPoint(-37.98F, -13F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[64].setRotationPoint(-39F, -13F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[65].setRotationPoint(-39F, -13F, -1F);

		bodyModel[66].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 0
		bodyModel[66].setRotationPoint(-35F, 0F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 70, 1, 4, 0F); // Box 112
		bodyModel[67].setRotationPoint(-35F, 0F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[68].setRotationPoint(13F, 1F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[69].setRotationPoint(-13F, 1F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[70].setRotationPoint(-30F, -21F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[71].setRotationPoint(-30F, -21F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[72].setRotationPoint(-30F, -21F, 1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[73].setRotationPoint(-28.05F, -19.5F, -6F);
		bodyModel[73].rotateAngleY = 0.38397244F;

		bodyModel[74].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[74].setRotationPoint(-28.05F, -19.5F, 6F);
		bodyModel[74].rotateAngleY = -0.38397244F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front up 1
		bodyModel[75].setRotationPoint(-30.5F, -21F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front up 2
		bodyModel[76].setRotationPoint(-30.5F, -19F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[77].setRotationPoint(-27F, -21F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[78].setRotationPoint(-18F, -20F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 43
		bodyModel[79].setRotationPoint(-34F, -13F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[80].setRotationPoint(-36F, -13F, -6F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[81].setRotationPoint(-36F, -13F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[82].setRotationPoint(-35.5F, -8.5F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[83].setRotationPoint(-35F, -6.5F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 nose brake cover
		bodyModel[84].setRotationPoint(-36F, -9F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[85].setRotationPoint(-35F, -12F, -7.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[86].setRotationPoint(-34F, -11F, -7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[87].setRotationPoint(-25.5F, 3F, -2F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[88].setRotationPoint(21.5F, 3F, -2F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[89].setRotationPoint(22F, 1F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[90].setRotationPoint(-25F, 1F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 52, 21, 14, 0F); // Box 19 the hooh
		bodyModel[91].setRotationPoint(-16F, -21F, -7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[92].setRotationPoint(37.25F, -19F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[93].setRotationPoint(36F, -21F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[94].setRotationPoint(36F, -21F, 0F);

		bodyModel[95].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[95].setRotationPoint(36.45F, -16.5F, -6F);
		bodyModel[95].rotateAngleY = -0.41887902F;

		bodyModel[96].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[96].setRotationPoint(36.45F, -16.5F, 6F);
		bodyModel[96].rotateAngleY = 0.41887902F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear 2 beam
		bodyModel[97].setRotationPoint(38.5F, -19F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear 2 beam
		bodyModel[98].setRotationPoint(38.5F, -19F, 0F);

		bodyModel[99].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 285
		bodyModel[99].setRotationPoint(-15F, -20.5F, -7.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 5, 1, 0F); // Box 286
		bodyModel[100].setRotationPoint(-15F, -20.5F, 6.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 264 gp38 filter box
		bodyModel[101].setRotationPoint(-8F, -22F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 297 vent 2 part f
		bodyModel[102].setRotationPoint(25.75F, -19.5F, -7.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 299 vent 2 part e
		bodyModel[103].setRotationPoint(25.75F, -19.5F, 6.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 272 vent 2 part f
		bodyModel[104].setRotationPoint(16.25F, -20.5F, -7.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, -1F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 273 vent 2 part e
		bodyModel[105].setRotationPoint(16.25F, -20.5F, 6.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[106].setRotationPoint(3F, -21F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[107].setRotationPoint(12F, -21F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105 dynamics special
		bodyModel[108].setRotationPoint(-6F, -21F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[109].setRotationPoint(3F, -21F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 285 dynamics special
		bodyModel[110].setRotationPoint(-6F, -21F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[111].setRotationPoint(12F, -21F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 36, 2, 4, 0F); // Box 36
		bodyModel[112].setRotationPoint(-16F, -2F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[113].setRotationPoint(-15F, -13F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[114].setRotationPoint(-15F, -15F, -9F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[115].setRotationPoint(-16F, -10F, -10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[116].setRotationPoint(35.5F, -21.5F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 80, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[117].setRotationPoint(-40F, 3F, -6.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 80, 1, 14, 0F); // Box 170
		bodyModel[118].setRotationPoint(-40F, 0F, -7F);

		bodyModel[119].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[119].setRotationPoint(-27.5F, -18F, -10.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[120].setRotationPoint(-17F, -18F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[121].setRotationPoint(-27F, -18F, 10F);

		bodyModel[122].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[122].setRotationPoint(-27F, -18F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[123].setRotationPoint(-28F, -18F, -7F);

		bodyModel[124].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[124].setRotationPoint(-16.5F, -18F, 10.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[125].setRotationPoint(-28F, -4F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[126].setRotationPoint(-28F, -21F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[127].setRotationPoint(-17F, -21F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[128].setRotationPoint(-28F, -21F, -7F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[129].setRotationPoint(-17F, -21F, -7F);

		bodyModel[130].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[130].setRotationPoint(-27F, -21F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[131].setRotationPoint(-27F, -21F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[132].setRotationPoint(-17F, -21F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[133].setRotationPoint(-28F, -21F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[134].setRotationPoint(-25F, 2F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[135].setRotationPoint(-25F, 2F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[136].setRotationPoint(-24F, 2F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[137].setRotationPoint(-24F, 2F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[138].setRotationPoint(22F, 2F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[139].setRotationPoint(23F, 2F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[140].setRotationPoint(22F, 2F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[141].setRotationPoint(23F, 2F, 9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[142].setRotationPoint(-35F, 1F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[143].setRotationPoint(12F, 1F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[144].setRotationPoint(-13F, 1F, 11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[145].setRotationPoint(-35F, 1F, 11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[146].setRotationPoint(13F, 1F, 11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[147].setRotationPoint(12F, 1F, 11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[148].setRotationPoint(-40F, 3F, -2.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[149].setRotationPoint(35F, 3F, -2.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[150].setRotationPoint(-8F, 3F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[151].setRotationPoint(-8F, 2F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[152].setRotationPoint(-8F, 6F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[153].setRotationPoint(-8F, 6F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[154].setRotationPoint(-8F, 2F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[155].setRotationPoint(-8F, 6F, 9F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[156].setRotationPoint(-6F, 2F, -11.25F);
		bodyModel[156].rotateAngleX = 1.02974426F;

		bodyModel[157].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[157].setRotationPoint(-8F, 2F, -8F);

		bodyModel[158].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[158].setRotationPoint(-6F, 2F, 11.25F);
		bodyModel[158].rotateAngleX = 1.02974426F;
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[159].setRotationPoint(-3F, 1.3F, -9.5F);
		bodyModel[159].rotateAngleX = 0.78539816F;

		bodyModel[160].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[160].setRotationPoint(-3F, 1.3F, 9.5F);
		bodyModel[160].rotateAngleX = 0.78539816F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[161].setRotationPoint(8F, 6F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[162].setRotationPoint(8F, 6F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[163].setRotationPoint(8F, 3F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[164].setRotationPoint(8F, 2F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[165].setRotationPoint(8F, 2F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[166].setRotationPoint(8F, 2F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[167].setRotationPoint(8F, 6F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[168].setRotationPoint(-12F, 6F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[169].setRotationPoint(-12F, 6F, -11F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[170].setRotationPoint(-12F, 3F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[171].setRotationPoint(-12F, 2F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[172].setRotationPoint(-12F, 2F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[173].setRotationPoint(-12F, 6F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[174].setRotationPoint(-12F, 2F, 8F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 811
		bodyModel[175].setRotationPoint(-37F, 1F, -7F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 812
		bodyModel[176].setRotationPoint(36F, 1F, -7F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 44
		bodyModel[177].setRotationPoint(-34F, -2F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 45
		bodyModel[178].setRotationPoint(-34F, -4F, 7F);

		bodyModel[179].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 56
		bodyModel[179].setRotationPoint(-33F, -4F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[180].setRotationPoint(-34F, -4F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 61
		bodyModel[181].setRotationPoint(-36F, -10F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[182].setRotationPoint(-36F, -10F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[183].setRotationPoint(-36F, -8F, -11.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[184].setRotationPoint(-33F, -11F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[185].setRotationPoint(-36F, -10F, 10.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[186].setRotationPoint(-36F, -12F, 9F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 191
		bodyModel[187].setRotationPoint(-34F, -9F, -11.01F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 227
		bodyModel[188].setRotationPoint(-34F, -11F, 11F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[189].setRotationPoint(-31F, -12F, -11F);

		bodyModel[190].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 258
		bodyModel[190].setRotationPoint(-36F, -12F, 11F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 300
		bodyModel[191].setRotationPoint(-35F, -2F, 7F);

		bodyModel[192].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276 gp38/39 fan
		bodyModel[192].setRotationPoint(27.25F, -22.25F, -3F);

		bodyModel[193].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277 gp38/39 fan
		bodyModel[193].setRotationPoint(18.75F, -22.25F, -3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[194].setRotationPoint(-30F, -17F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[195].setRotationPoint(-14F, -4F, 11F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[196].setRotationPoint(-15F, -2F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[197].setRotationPoint(-16F, -4F, 11F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[198].setRotationPoint(-16F, -4F, 7F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp38 exhaust
		bodyModel[199].setRotationPoint(-0.5F, -22F, -2.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 275 gp38 exhaust
		bodyModel[200].setRotationPoint(12.5F, -22F, -2.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[201].setRotationPoint(4F, -22F, -3F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 477 gp38 stack extension
		bodyModel[202].setRotationPoint(12.5F, -24F, -2.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 478 gp38 stack extension
		bodyModel[203].setRotationPoint(-0.5F, -24F, -2.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 479 gp38 extra stacc
		bodyModel[204].setRotationPoint(8.5F, -24F, -2.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 480 gp38 extra stacc
		bodyModel[205].setRotationPoint(3.5F, -24F, -2.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 365 gp38 arr stacc
		bodyModel[206].setRotationPoint(2F, -22F, -2.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 366 gp38 arr stack
		bodyModel[207].setRotationPoint(10F, -22F, -2.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[208].setRotationPoint(-15F, -22F, -5.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 847 vent 1 part f
		bodyModel[209].setRotationPoint(17F, -20.5F, -7.25F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp39/40 exhaust
		bodyModel[210].setRotationPoint(-6F, -22.5F, -2.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[211].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 850 vent 1 part e
		bodyModel[212].setRotationPoint(17F, -20.5F, 6.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 851  headlight rear canadurr
		bodyModel[213].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 852 canadurr mounting
		bodyModel[214].setRotationPoint(37.25F, -18F, -1F);

		bodyModel[215].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 853 gp40 fan
		bodyModel[215].setRotationPoint(23F, -22.25F, -3F);

		bodyModel[216].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 854 gp40 fan
		bodyModel[216].setRotationPoint(29.5F, -22.25F, -3F);

		bodyModel[217].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 855 gp40 fan
		bodyModel[217].setRotationPoint(16.5F, -22.25F, -3F);

		bodyModel[218].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 38R
		bodyModel[218].setRotationPoint(-11F, -8F, 11F);

		bodyModel[219].addBox(0F, 0F, 0F, 32, 8, 0, 0F); // Box 176
		bodyModel[219].setRotationPoint(-14F, -10F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[220].setRotationPoint(36F, -8F, 9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[221].setRotationPoint(36F, -7F, 10.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[222].setRotationPoint(36F, -7F, -11.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[223].setRotationPoint(36F, -8F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[224].setRotationPoint(-16F, -12F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[225].setRotationPoint(18F, -10F, -11F);

		bodyModel[226].addBox(0F, 0F, 0F, 16, 8, 0, 0F); // Box 316
		bodyModel[226].setRotationPoint(20F, -8F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[227].setRotationPoint(-16F, -12F, 11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[228].setRotationPoint(-15F, -12F, 11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[229].setRotationPoint(-12F, -8F, 11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[230].setRotationPoint(-40.01F, -7F, -8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[231].setRotationPoint(-40.01F, -7F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[232].setRotationPoint(40.01F, -7F, 7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[233].setRotationPoint(40.01F, -7F, -8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[234].setRotationPoint(-16F, -21F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[235].setRotationPoint(-7F, -21F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[236].setRotationPoint(-16F, -21F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[237].setRotationPoint(-7F, -21F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[238].setRotationPoint(-25F, -18F, 11F);
		bodyModel[238].rotateAngleX = 0.26179939F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[239].setRotationPoint(-25F, -18.25F, -11.97F);
		bodyModel[239].rotateAngleX = -0.26179939F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 879 dynamics short
		bodyModel[240].setRotationPoint(-2F, -21F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 880 dynamics short
		bodyModel[241].setRotationPoint(-2F, -21F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		bodyModel[242].setRotationPoint(0F, -21F, -9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 882
		bodyModel[243].setRotationPoint(0F, -21F, 7F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412 cs
		bodyModel[244].setRotationPoint(-27F, -13F, 3F);

		bodyModel[245].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413 cs
		bodyModel[245].setRotationPoint(-27.1F, -12F, 1F);
		bodyModel[245].rotateAngleY = -0.38397244F;

		bodyModel[246].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[246].setRotationPoint(-25.5F, -14F, 1F);
		bodyModel[246].rotateAngleY = -0.38397244F;

		bodyModel[247].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[247].setRotationPoint(-24.5F, -16.25F, 2F);
		bodyModel[247].rotateAngleY = 0.78539816F;

		bodyModel[248].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[248].setRotationPoint(-24.5F, -16.25F, 2F);
		bodyModel[248].rotateAngleY = 0.78539816F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[249].setRotationPoint(-14.5F, 2.75F, -10.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[250].setRotationPoint(-14.5F, 1.75F, -10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[251].setRotationPoint(-14.25F, 3.25F, -10.25F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[252].setRotationPoint(-14.5F, 0.75F, -10.9F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 450 cull
		bodyModel[253].setRotationPoint(-42F, 7F, -9F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 451 cull
		bodyModel[254].setRotationPoint(-42F, 7F, 3F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 452
		bodyModel[255].setRotationPoint(-43F, 9F, -9F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 453 cull
		bodyModel[256].setRotationPoint(40F, 7F, 3F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 454
		bodyModel[257].setRotationPoint(40F, 9F, -9F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 455 cull
		bodyModel[258].setRotationPoint(40F, 7F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[259].setRotationPoint(40F, 8F, -2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cull
		bodyModel[260].setRotationPoint(-42F, 8F, -2F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[261].setRotationPoint(-40.5F, -2F, 4.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[262].setRotationPoint(-40.5F, -2F, -6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[263].setRotationPoint(-40.75F, -2F, 4.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[264].setRotationPoint(-40.75F, -2F, -6.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[265].setRotationPoint(39.5F, -2F, -6.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[266].setRotationPoint(39.75F, -2F, -6.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear a
		bodyModel[267].setRotationPoint(39.75F, -2F, 4.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[268].setRotationPoint(39.5F, -2F, 4.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 anticlimber
		bodyModel[269].setRotationPoint(-42F, 0F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269anticlimber
		bodyModel[270].setRotationPoint(-42F, 0F, 0F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 369 cull
		bodyModel[271].setRotationPoint(-17.5F, -23F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[272].setRotationPoint(-17.5F, -24F, 4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[273].setRotationPoint(-40.5F, 0F, 6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 251 ditchlight front b
		bodyModel[274].setRotationPoint(-40.75F, 0F, 6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 252 ditchlight front b
		bodyModel[275].setRotationPoint(-40.75F, 0F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[276].setRotationPoint(-40.5F, 0F, -8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[277].setRotationPoint(39.5F, 0F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255
		bodyModel[278].setRotationPoint(39.5F, 0F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 256 ditchlight rear b
		bodyModel[279].setRotationPoint(39.75F, 0F, -8F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 ditchlight rear b
		bodyModel[280].setRotationPoint(39.75F, 0F, 6F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 338
		bodyModel[281].setRotationPoint(-13F, -24.25F, -1.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 339
		bodyModel[282].setRotationPoint(-13.5F, -24.5F, -0.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 340
		bodyModel[283].setRotationPoint(-12.5F, -24.25F, 0.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 341
		bodyModel[284].setRotationPoint(-11F, -23.5F, -0.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348 cull
		bodyModel[285].setRotationPoint(-40.5F, 1F, -5.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 ditchlight front c
		bodyModel[286].setRotationPoint(-40.75F, 1F, -5.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 ditchlight front c
		bodyModel[287].setRotationPoint(-40.75F, 1F, 3.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351 cull
		bodyModel[288].setRotationPoint(-40.5F, 1F, 3.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352 cull
		bodyModel[289].setRotationPoint(39.5F, 1F, -5.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353 cull
		bodyModel[290].setRotationPoint(39.5F, 1F, 3.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight rear c
		bodyModel[291].setRotationPoint(39.75F, 1F, 3.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight rear c
		bodyModel[292].setRotationPoint(39.75F, 1F, -5.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[293].setRotationPoint(-32F, -19F, -0.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[294].setRotationPoint(-32F, -20F, -0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[295].setRotationPoint(-31.75F, -18.5F, -0.25F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[296].setRotationPoint(-32F, -21F, -0.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[297].setRotationPoint(40F, -5F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[298].setRotationPoint(40.5F, -4.5F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[299].setRotationPoint(-41F, -5F, -5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[300].setRotationPoint(-41.5F, -4.5F, -5F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[301].setRotationPoint(17F, -22.5F, -5.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[302].setRotationPoint(18F, -22.25F, -4.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[303].setRotationPoint(17.5F, -22.25F, -6.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[304].setRotationPoint(19.5F, -21.5F, -5.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[305].setRotationPoint(15.5F, -23.25F, 0.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[306].setRotationPoint(15F, -23.25F, -1.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 273
		bodyModel[307].setRotationPoint(17F, -22.5F, -0.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 274
		bodyModel[308].setRotationPoint(14.5F, -23.5F, -0.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[309].setRotationPoint(0.5F, -19F, -8.7F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[310].setRotationPoint(0.5F, -20F, -8.7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[311].setRotationPoint(0.75F, -18.5F, -8.45F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[312].setRotationPoint(0.5F, -21F, -8.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[313].setRotationPoint(26F, -22.5F, -6.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[314].setRotationPoint(24F, -23.5F, -4.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[315].setRotationPoint(25F, -23.5F, -6.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[316].setRotationPoint(26F, -23.5F, -5.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378 cull
		bodyModel[317].setRotationPoint(15F, -21F, 7F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 403
		bodyModel[318].setRotationPoint(35F, -22.5F, -5F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404
		bodyModel[319].setRotationPoint(35F, -23.5F, -4.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 405
		bodyModel[320].setRotationPoint(33F, -23.5F, -3.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[321].setRotationPoint(34F, -23.5F, -5.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 352
		bodyModel[322].setRotationPoint(-30F, -23F, -2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lamp front arr
		bodyModel[323].setRotationPoint(-30.25F, -23F, -2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 lamp front arr
		bodyModel[324].setRotationPoint(-30.25F, -23F, 0F);

		bodyModel[325].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 284
		bodyModel[325].setRotationPoint(-26F, -19.5F, -9F);
		bodyModel[325].rotateAngleX = -0.9250245F;
		bodyModel[325].rotateAngleY = 0.01745329F;
		bodyModel[325].rotateAngleZ = -0.01745329F;

		bodyModel[326].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[326].setRotationPoint(-25F, -16F, -12F);

		bodyModel[327].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[327].setRotationPoint(-25F, -16F, 11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[328].setRotationPoint(-25F, -17F, 10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[329].setRotationPoint(-25F, -18F, 10F);

		bodyModel[330].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		bodyModel[330].setRotationPoint(-25F, -17F, -13F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[331].setRotationPoint(-25F, -18F, -13F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[332].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[333].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[334].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[335].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[336].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[337].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1095
		bodyModel[338].setRotationPoint(-28.5F, -21.5F, -0.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1096
		bodyModel[339].setRotationPoint(-30F, -22.25F, 0.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1097
		bodyModel[340].setRotationPoint(-31F, -22.5F, -0.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1098
		bodyModel[341].setRotationPoint(-30.5F, -22.25F, -1.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[342].setRotationPoint(31.5F, -23F, 4.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[343].setRotationPoint(31.5F, -22F, 4.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[344].setRotationPoint(-3F, -19.5F, 7.7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[345].setRotationPoint(-3F, -20.5F, 7.7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[346].setRotationPoint(-2.75F, -19F, 7.95F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[347].setRotationPoint(-3F, -21.5F, 6.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[348].setRotationPoint(15F, -22F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[349].setRotationPoint(-23F, -22F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[350].setRotationPoint(-23F, -22.5F, -1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[351].setRotationPoint(-23F, -22.5F, -1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[352].setRotationPoint(-23F, -22.5F, -1F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[353].setRotationPoint(-23F, -22.5F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[354].setRotationPoint(-27F, -22F, 7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[355].setRotationPoint(-27F, -22.5F, 7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[356].setRotationPoint(-27F, -22.5F, 7F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[357].setRotationPoint(-27F, -22.5F, 7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[358].setRotationPoint(-27F, -22.5F, 7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[359].setRotationPoint(-27.5F, -21F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[360].setRotationPoint(-27.5F, -21.5F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[361].setRotationPoint(-27F, -22.5F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[362].setRotationPoint(-27F, -23F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[363].setRotationPoint(-27F, -23F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[364].setRotationPoint(-27F, -23F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[365].setRotationPoint(-27F, -23F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[366].setRotationPoint(-28.5F, -23F, -3.5F);

		bodyModel[367].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[367].setRotationPoint(-27.5F, -23F, -3.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[368].setRotationPoint(-29F, -24F, -1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[369].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[370].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[371].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[372].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[373].addBox(0F, 0F, 0F, 8, 8, 14, 0F); // Box 382hh
		bodyModel[373].setRotationPoint(-36F, -21F, -7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[374].setRotationPoint(-39F, -21F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[375].setRotationPoint(-39F, -21F, 0F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f hh
		bodyModel[376].setRotationPoint(-39.5F, -19F, 0F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f hh
		bodyModel[377].setRotationPoint(-39.5F, -19F, -2F);

		bodyModel[378].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[378].setRotationPoint(-39.25F, -19F, -2F);

		bodyModel[379].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 numberboard hh
		bodyModel[379].setRotationPoint(-36.5F, -16.5F, 6F);
		bodyModel[379].rotateAngleY = -0.40142573F;

		bodyModel[380].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 numberboard hh
		bodyModel[380].setRotationPoint(-36.5F, -16.5F, -6F);
		bodyModel[380].rotateAngleY = 0.40142573F;

		bodyModel[381].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[381].setRotationPoint(-38.5F, -22.5F, -5.5F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[382].setRotationPoint(-37.5F, -22.25F, -4.5F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[383].setRotationPoint(-38F, -22.25F, -6.5F);

		bodyModel[384].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[384].setRotationPoint(-36F, -21.5F, -5.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[385].setRotationPoint(-44F, 7F, 0F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[386].setRotationPoint(-44F, 7F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[387].setRotationPoint(-43F, 6F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[388].setRotationPoint(-43F, 6F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[389].setRotationPoint(-43F, 6F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 1F, -1.5F, 1F, 1F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[390].setRotationPoint(-43F, 3F, 2F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[391].setRotationPoint(-43F, 6F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 1F, -0.5F, 1F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[392].setRotationPoint(-43.5F, 3F, -10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[393].setRotationPoint(-43F, 4F, 2F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[394].setRotationPoint(-43F, 4F, -10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[395].setRotationPoint(-43F, 5F, 2F);

		bodyModel[396].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[396].setRotationPoint(-43F, 5F, -8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[397].setRotationPoint(43F, 7F, 0F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[398].setRotationPoint(43F, 7F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[399].setRotationPoint(42F, 6F, 0F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[400].setRotationPoint(42F, 6F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 1167
		bodyModel[401].setRotationPoint(40F, 6F, -10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[402].setRotationPoint(40F, 6F, 0F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1169
		bodyModel[403].setRotationPoint(42F, 5F, 2F);

		bodyModel[404].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[404].setRotationPoint(42F, 5F, -8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 1171
		bodyModel[405].setRotationPoint(40F, 4F, -10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1172
		bodyModel[406].setRotationPoint(40F, 4F, 2F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 1F, -1F, 1F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 1173
		bodyModel[407].setRotationPoint(40F, 3F, 2F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 1F, -2F, 1F, 1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 1174
		bodyModel[408].setRotationPoint(40.5F, 3F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 381 sp mount
		bodyModel[409].setRotationPoint(38.25F, -23F, -2F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[410].setRotationPoint(39.25F, -21F, -2F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[411].setRotationPoint(39.5F, -21F, -2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[412].setRotationPoint(39.5F, -21F, 0F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[413].setRotationPoint(39.5F, -23F, -1F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[414].setRotationPoint(39.25F, -23F, -1F);

		bodyModel[415].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[415].setRotationPoint(-29F, -23F, -1F);

		bodyModel[416].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[416].setRotationPoint(-25.5F, -23F, -6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[417].setRotationPoint(-26.5F, -23F, -6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 363
		bodyModel[418].setRotationPoint(-26.5F, -22F, -6F);

		bodyModel[419].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[419].setRotationPoint(-25.5F, -23F, 2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[420].setRotationPoint(-26.5F, -23F, 2F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 366
		bodyModel[421].setRotationPoint(-26.5F, -22F, 2F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[422].setRotationPoint(-24F, -23F, 0F);

		bodyModel[423].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[423].setRotationPoint(-26F, -23F, -0.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[424].setRotationPoint(-26.75F, -22.5F, 0.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[425].setRotationPoint(-27.5F, -22.5F, -1.5F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[426].setRotationPoint(-25.75F, -22.5F, -0.5F);

		bodyModel[427].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 484
		bodyModel[427].setRotationPoint(-28F, -23.5F, 3.5F);

		bodyModel[428].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 485
		bodyModel[428].setRotationPoint(-28.75F, -23F, 4.5F);

		bodyModel[429].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[429].setRotationPoint(-29.5F, -23F, 2.5F);

		bodyModel[430].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[430].setRotationPoint(-27.75F, -23F, 3.5F);

		bodyModel[431].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[431].setRotationPoint(-24.5F, -22.75F, -4F);

		bodyModel[432].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[432].setRotationPoint(-19F, -23F, -2.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[433].setRotationPoint(-18F, -24F, 0F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 470
		bodyModel[434].setRotationPoint(38.5F, -20F, -1F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 471 headlight rear SCREWY
		bodyModel[435].setRotationPoint(38.75F, -20F, -1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 472 headlight rear SCRWEWY TWOWOEE
		bodyModel[436].setRotationPoint(38.75F, -18F, -1F);

		bodyModel[437].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 1203
		bodyModel[437].setRotationPoint(-33F, -8F, 7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[438].setRotationPoint(-22F, -22F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[439].setRotationPoint(-22F, -23F, -0.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[440].setRotationPoint(-36.65F, -12F, -6.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[441].setRotationPoint(-36.65F, -12F, 4.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[442].setRotationPoint(35.65F, -12F, -6.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[443].setRotationPoint(35.65F, -12F, 4.5F);

		bodyModel[444].addBox(-1F, 0F, 0F, 1, 1, 1, 0F); // Box 376 markerlight
		bodyModel[444].setRotationPoint(37F, -13F, 5.5F);
		bodyModel[444].rotateAngleY = 0.43633231F;

		bodyModel[445].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 377 markerlight
		bodyModel[445].setRotationPoint(37F, -13F, -5.5F);
		bodyModel[445].rotateAngleY = -0.43633231F;

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[446].setRotationPoint(35.65F, -20F, -6.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[447].setRotationPoint(35.65F, -20F, 4.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1217
		bodyModel[448].setRotationPoint(-37F, -23.5F, -6F);

		bodyModel[449].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1218
		bodyModel[449].setRotationPoint(-37F, -23.5F, -4.75F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[450].setRotationPoint(-40.5F, -21.5F, -0.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[451].setRotationPoint(-40.5F, -22.5F, -0.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[452].setRotationPoint(-40.25F, -21F, -0.25F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470
		bodyModel[453].setRotationPoint(-41F, -22.5F, -1F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 471
		bodyModel[454].setRotationPoint(-41F, -22.5F, 1F);

		bodyModel[455].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 472
		bodyModel[455].setRotationPoint(-41F, -22.5F, -1F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 514
		bodyModel[456].setRotationPoint(39.5F, -21.5F, -0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[457].setRotationPoint(39.5F, -22.5F, -0.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 516
		bodyModel[458].setRotationPoint(39.25F, -21F, -0.25F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 517
		bodyModel[459].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[460].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 518
		bodyModel[460].setRotationPoint(39F, -22.5F, -1F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 519
		bodyModel[461].setRotationPoint(39F, -22.5F, 1F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1231
		bodyModel[462].setRotationPoint(35F, -21.5F, 4.5F);

		bodyModel[463].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1232
		bodyModel[463].setRotationPoint(34.5F, -22.25F, 5.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1233
		bodyModel[464].setRotationPoint(34.5F, -22.5F, 4.5F);

		bodyModel[465].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1234
		bodyModel[465].setRotationPoint(35F, -22.25F, 3.5F);

		bodyModel[466].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1235
		bodyModel[466].setRotationPoint(35F, -23.5F, 5.25F);

		bodyModel[467].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1236
		bodyModel[467].setRotationPoint(35F, -23.5F, 4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1250
		bodyModel[468].setRotationPoint(-37F, -21.5F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[469].setRotationPoint(-37F, -13.5F, -1F);

		bodyModel[470].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1252
		bodyModel[470].setRotationPoint(0F, -22.5F, -1F);

		bodyModel[471].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1253
		bodyModel[471].setRotationPoint(0F, -22.5F, -2F);

		bodyModel[472].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1254
		bodyModel[472].setRotationPoint(-2.5F, -23.5F, -0.5F);

		bodyModel[473].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1255
		bodyModel[473].setRotationPoint(-0.5F, -22.5F, 1F);

		bodyModel[474].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1256
		bodyModel[474].setRotationPoint(-1F, -23.5F, 0.5F);

		bodyModel[475].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 1257
		bodyModel[475].setRotationPoint(-1F, -23.5F, -1.5F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1258
		bodyModel[476].setRotationPoint(0F, -21.5F, -0.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[477].setRotationPoint(-33F, -22F, -0.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[478].setRotationPoint(-33F, -23F, -0.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[479].setRotationPoint(-22F, -22F, 0F);

		bodyModel[480].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[480].setRotationPoint(-20F, -23F, 3F);

		bodyModel[481].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[481].setRotationPoint(17F, -23F, -3.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1264
		bodyModel[482].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		bodyModel[483].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 1266
		bodyModel[484].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1267
		bodyModel[485].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[486].setRotationPoint(15.5F, -22F, 6.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[487].setRotationPoint(15.5F, -23F, 6.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[488].setRotationPoint(-23F, -28F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[489].setRotationPoint(-23F, -28F, 8F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[490].setRotationPoint(-23F, -27F, 5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[491].setRotationPoint(-23F, -27F, 8F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[492].setRotationPoint(-23F, -25F, 7F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[493].setRotationPoint(-23F, -25F, 5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[494].setRotationPoint(-23F, -25F, -8F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[495].setRotationPoint(-23F, -25F, -10F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[496].setRotationPoint(-23F, -27F, -9F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[497].setRotationPoint(-23F, -27F, -8F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[498].setRotationPoint(-23F, -28F, -8F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[499].setRotationPoint(-23F, -28F, -9F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[501] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[502] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[503] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[504] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[505] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[506] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[507] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[508] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[509] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 546
		bodyModel[510] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[511] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[512] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[513] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[514] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[515] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[516] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[517] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 554
		bodyModel[518] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[519] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[520] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[521] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[522] = new ModelRendererTurbo(this, 16, 136, textureX, textureY); // Box 559
		bodyModel[523] = new ModelRendererTurbo(this, 402, 168, textureX, textureY); // Box 560
		bodyModel[524] = new ModelRendererTurbo(this, 372, 168, textureX, textureY); // Box 561
		bodyModel[525] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[526] = new ModelRendererTurbo(this, 227, 21, textureX, textureY); // Box 415
		bodyModel[527] = new ModelRendererTurbo(this, 273, 114, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[528] = new ModelRendererTurbo(this, 279, 45, textureX, textureY); // Box 130
		bodyModel[529] = new ModelRendererTurbo(this, 281, 42, textureX, textureY); // Box 131
		bodyModel[530] = new ModelRendererTurbo(this, 279, 58, textureX, textureY); // Box 132
		bodyModel[531] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 314
		bodyModel[532] = new ModelRendererTurbo(this, 431, 24, textureX, textureY); // Box 532
		bodyModel[533] = new ModelRendererTurbo(this, 431, 24, textureX, textureY); // Box 533
		bodyModel[534] = new ModelRendererTurbo(this, 269, 31, textureX, textureY); // Box 409 commander base
		bodyModel[535] = new ModelRendererTurbo(this, 269, 27, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[536] = new ModelRendererTurbo(this, 499, 73, textureX, textureY, "lamp"); // Box 536 numberboard rear cswr
		bodyModel[537] = new ModelRendererTurbo(this, 499, 73, textureX, textureY, "lamp"); // Box 537 numberboard rear cswr
		bodyModel[538] = new ModelRendererTurbo(this, 440, 22, textureX, textureY); // Box 538 dynamics longy
		bodyModel[539] = new ModelRendererTurbo(this, 440, 15, textureX, textureY); // Box 539 dynamics longy
		bodyModel[540] = new ModelRendererTurbo(this, 48, 128, textureX, textureY); // Box 540
		bodyModel[541] = new ModelRendererTurbo(this, 14, 128, textureX, textureY); // Box 541
		bodyModel[542] = new ModelRendererTurbo(this, 370, 161, textureX, textureY); // Box 542
		bodyModel[543] = new ModelRendererTurbo(this, 404, 161, textureX, textureY); // Box 543
		bodyModel[544] = new ModelRendererTurbo(this, 237, 56, textureX, textureY, "cull"); // Box 389 support cull
		bodyModel[545] = new ModelRendererTurbo(this, 246, 56, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[546] = new ModelRendererTurbo(this, 248, 53, textureX, textureY); // Box 409 commander base
		bodyModel[547] = new ModelRendererTurbo(this, 248, 49, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[548] = new ModelRendererTurbo(this, 239, 53, textureX, textureY); // Box 409 commander base
		bodyModel[549] = new ModelRendererTurbo(this, 239, 49, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[550] = new ModelRendererTurbo(this, 219, 19, textureX, textureY); // Box 409 commander base csx
		bodyModel[551] = new ModelRendererTurbo(this, 219, 15, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx
		bodyModel[552] = new ModelRendererTurbo(this, 219, 19, textureX, textureY); // Box 409 commander base csx
		bodyModel[553] = new ModelRendererTurbo(this, 219, 15, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx

		bodyModel[500].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[500].setRotationPoint(-40F, 8F, -11F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[501].setRotationPoint(-40F, 5F, -10F);

		bodyModel[502].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[502].setRotationPoint(-40F, 7F, -9F);

		bodyModel[503].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[503].setRotationPoint(-40F, 4F, -8F);

		bodyModel[504].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[504].setRotationPoint(36F, 4F, -8F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[505].setRotationPoint(36F, 5F, -10F);

		bodyModel[506].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[506].setRotationPoint(36F, 7F, -9F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[507].setRotationPoint(36F, 8F, -11F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[508].setRotationPoint(36F, 3F, -9F);

		bodyModel[509].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[509].setRotationPoint(36F, 1F, -8F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[510].setRotationPoint(-40F, 3F, 7F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[511].setRotationPoint(-40F, 1F, 7F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[512].setRotationPoint(-40F, 5F, 8F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[513].setRotationPoint(-40F, 8F, 9F);

		bodyModel[514].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[514].setRotationPoint(-40F, 7F, 9F);

		bodyModel[515].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[515].setRotationPoint(-40F, 4F, 8F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[516].setRotationPoint(36F, 3F, 7F);

		bodyModel[517].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[517].setRotationPoint(36F, 1F, 7F);

		bodyModel[518].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[518].setRotationPoint(36F, 4F, 8F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[519].setRotationPoint(36F, 5F, 8F);

		bodyModel[520].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[520].setRotationPoint(36F, 7F, 9F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[521].setRotationPoint(36F, 8F, 9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[522].setRotationPoint(-40F, -8F, 9F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[523].setRotationPoint(40F, -8F, 9F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[524].setRotationPoint(40F, -8F, -8F);
		bodyModel[524].rotateAngleY = -3.14159265F;

		bodyModel[525].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[525].setRotationPoint(-27F, -11F, -4F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[526].setRotationPoint(-20.5F, -22F, -5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[527].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[528].addShapeBox(3F, 0F, 0F, 8, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[528].setRotationPoint(-18F, -14F, -10F);

		bodyModel[529].addShapeBox(3F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[529].setRotationPoint(-18F, -15F, -8F);

		bodyModel[530].addShapeBox(3F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[530].setRotationPoint(-18F, -5F, -10F);

		bodyModel[531].addShapeBox(3F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[531].setRotationPoint(-18F, -4F, -11F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 532
		bodyModel[532].setRotationPoint(3F, -23F, -9F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 533
		bodyModel[533].setRotationPoint(3F, -23F, 9F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[534].setRotationPoint(-18.5F, -22F, -0.5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[535].setRotationPoint(-18.5F, -23F, -0.5F);

		bodyModel[536].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536 numberboard rear cswr
		bodyModel[536].setRotationPoint(36.45F, -20.5F, 6F);
		bodyModel[536].rotateAngleY = 0.41887902F;

		bodyModel[537].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537 numberboard rear cswr
		bodyModel[537].setRotationPoint(36.45F, -20.5F, -6F);
		bodyModel[537].rotateAngleY = -0.41887902F;

		bodyModel[538].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 538 dynamics longy
		bodyModel[538].setRotationPoint(-5F, -21F, -9F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 539 dynamics longy
		bodyModel[539].setRotationPoint(-5F, -21F, 7F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 540
		bodyModel[540].setRotationPoint(-36F, -3F, -11.5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 541
		bodyModel[541].setRotationPoint(-36F, -3F, 10.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[542].setRotationPoint(36F, -3F, -11.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[543].setRotationPoint(36F, -3F, 10.5F);

		bodyModel[544].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 389 support cull
		bodyModel[544].setRotationPoint(-25.5F, -21.5F, -9F);

		bodyModel[545].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 356 support cull
		bodyModel[545].setRotationPoint(-25.5F, -21.5F, 7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[546].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[547].setRotationPoint(-25F, -23.5F, 7.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[548].setRotationPoint(-25F, -22.5F, -8.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[549].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[550].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[550].setRotationPoint(-22.5F, -20.25F, -9.5F);
		bodyModel[550].rotateAngleX = 0.64577182F;

		bodyModel[551].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[551].setRotationPoint(-22.5F, -20.25F, -9.5F);
		bodyModel[551].rotateAngleX = 0.64577182F;

		bodyModel[552].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[552].setRotationPoint(-22.5F, -20.25F, 9.5F);
		bodyModel[552].rotateAngleX = -0.64577182F;

		bodyModel[553].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[553].setRotationPoint(-22.5F, -20.25F, 9.5F);
		bodyModel[553].rotateAngleX = -0.64577182F;
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 18 || GetColor(entity) == 26
				|| GetColor(entity) == 27 || GetColor(entity) == 28) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14321){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 ||GetColor(entity) == 22
		|| GetColor(entity) == 23){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 36 ||GetColor(entity) == 37
				||GetColor(entity) == 38 ||GetColor(entity) == 40){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.47, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.93, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}