//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M630/640W
// Model Creator: Prof_Binky
// Created on: 12.03.2022 - 22:32:26
// Last changed on: 12.03.2022 - 22:32:26

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelMLW_3axle_Hiad;
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

public class ModelM63XW extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelM63XW() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[367];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 227, 146, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 10, 112, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 5, 133, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 59, 142, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 61, 140, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Box 87
		bodyModel[8] = new ModelRendererTurbo(this, 66, 142, textureX, textureY); // Box 88
		bodyModel[9] = new ModelRendererTurbo(this, 60, 134, textureX, textureY); // Box 278
		bodyModel[10] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 279
		bodyModel[11] = new ModelRendererTurbo(this, 61, 140, textureX, textureY); // Box 301
		bodyModel[12] = new ModelRendererTurbo(this, 59, 142, textureX, textureY); // Box 302
		bodyModel[13] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Box 314
		bodyModel[14] = new ModelRendererTurbo(this, 66, 142, textureX, textureY); // Box 315
		bodyModel[15] = new ModelRendererTurbo(this, 265, 88, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 256, 88, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 239, 94, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 262, 83, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 258, 114, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 256, 110, textureX, textureY); // Box 205
		bodyModel[21] = new ModelRendererTurbo(this, 265, 112, textureX, textureY); // Box 206
		bodyModel[22] = new ModelRendererTurbo(this, 236, 120, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 235, 136, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 61, 128, textureX, textureY); // Box 70
		bodyModel[25] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 115
		bodyModel[26] = new ModelRendererTurbo(this, 223, 132, textureX, textureY); // Box 141
		bodyModel[27] = new ModelRendererTurbo(this, 457, 154, textureX, textureY); // Box 186
		bodyModel[28] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 187
		bodyModel[29] = new ModelRendererTurbo(this, 60, 134, textureX, textureY); // Box 188
		bodyModel[30] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 189
		bodyModel[31] = new ModelRendererTurbo(this, 61, 128, textureX, textureY); // Box 192
		bodyModel[32] = new ModelRendererTurbo(this, 462, 133, textureX, textureY); // Box 193
		bodyModel[33] = new ModelRendererTurbo(this, 55, 133, textureX, textureY); // Box 196
		bodyModel[34] = new ModelRendererTurbo(this, 67, 130, textureX, textureY); // Box 197
		bodyModel[35] = new ModelRendererTurbo(this, 67, 134, textureX, textureY); // Box 198
		bodyModel[36] = new ModelRendererTurbo(this, 67, 138, textureX, textureY); // Box 199
		bodyModel[37] = new ModelRendererTurbo(this, 67, 138, textureX, textureY); // Box 202
		bodyModel[38] = new ModelRendererTurbo(this, 507, 154, textureX, textureY); // Box 203
		bodyModel[39] = new ModelRendererTurbo(this, 67, 134, textureX, textureY); // Box 204
		bodyModel[40] = new ModelRendererTurbo(this, 67, 130, textureX, textureY); // Box 205
		bodyModel[41] = new ModelRendererTurbo(this, 68, 128, textureX, textureY); // Box 209
		bodyModel[42] = new ModelRendererTurbo(this, 446, 112, textureX, textureY); // Box 210
		bodyModel[43] = new ModelRendererTurbo(this, 448, 116, textureX, textureY); // Box 211
		bodyModel[44] = new ModelRendererTurbo(this, 446, 94, textureX, textureY); // Box 213
		bodyModel[45] = new ModelRendererTurbo(this, 450, 89, textureX, textureY); // Box 214
		bodyModel[46] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 427
		bodyModel[47] = new ModelRendererTurbo(this, 447, 132, textureX, textureY); // Box 428
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[49] = new ModelRendererTurbo(this, 449, 146, textureX, textureY); // Box 27
		bodyModel[50] = new ModelRendererTurbo(this, 60, 126, textureX, textureY); // Box 279
		bodyModel[51] = new ModelRendererTurbo(this, 61, 136, textureX, textureY); // Box 20
		bodyModel[52] = new ModelRendererTurbo(this, 61, 132, textureX, textureY); // Box 20
		bodyModel[53] = new ModelRendererTurbo(this, 67, 126, textureX, textureY); // Box 197
		bodyModel[54] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 68, 132, textureX, textureY); // Box 87
		bodyModel[56] = new ModelRendererTurbo(this, 68, 128, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 60, 126, textureX, textureY); // Box 189
		bodyModel[58] = new ModelRendererTurbo(this, 67, 126, textureX, textureY); // Box 205
		bodyModel[59] = new ModelRendererTurbo(this, 61, 136, textureX, textureY); // Box 301
		bodyModel[60] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 314
		bodyModel[61] = new ModelRendererTurbo(this, 61, 132, textureX, textureY); // Box 301
		bodyModel[62] = new ModelRendererTurbo(this, 68, 132, textureX, textureY); // Box 314
		bodyModel[63] = new ModelRendererTurbo(this, 277, 49, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 286, 42, textureX, textureY); // Box 496
		bodyModel[65] = new ModelRendererTurbo(this, 286, 29, textureX, textureY); // Box 497
		bodyModel[66] = new ModelRendererTurbo(this, 287, 36, textureX, textureY); // Box 498
		bodyModel[67] = new ModelRendererTurbo(this, 464, 38, textureX, textureY); // Box 490
		bodyModel[68] = new ModelRendererTurbo(this, 491, 1, textureX, textureY); // Box 502
		bodyModel[69] = new ModelRendererTurbo(this, 495, 12, textureX, textureY); // Box 503
		bodyModel[70] = new ModelRendererTurbo(this, 481, 26, textureX, textureY); // Box 504
		bodyModel[71] = new ModelRendererTurbo(this, 478, 12, textureX, textureY); // Box 156
		bodyModel[72] = new ModelRendererTurbo(this, 506, 25, textureX, textureY); // Box 158
		bodyModel[73] = new ModelRendererTurbo(this, 496, 23, textureX, textureY); // Box 159
		bodyModel[74] = new ModelRendererTurbo(this, 468, 18, textureX, textureY); // Box 160
		bodyModel[75] = new ModelRendererTurbo(this, 466, 20, textureX, textureY); // Box 161
		bodyModel[76] = new ModelRendererTurbo(this, 477, 12, textureX, textureY, "lamp"); // Box 162 headlight r
		bodyModel[77] = new ModelRendererTurbo(this, 477, 5, textureX, textureY, "lamp"); // Box 163 headlight r
		bodyModel[78] = new ModelRendererTurbo(this, 468, 25, textureX, textureY); // Box 1523
		bodyModel[79] = new ModelRendererTurbo(this, 471, 30, textureX, textureY, "lamp"); // Box 1526 markerlight
		bodyModel[80] = new ModelRendererTurbo(this, 503, 31, textureX, textureY, "lamp"); // Box 1527 markerlight
		bodyModel[81] = new ModelRendererTurbo(this, 462, 2, textureX, textureY, "lamp"); // Box 302 numberboard
		bodyModel[82] = new ModelRendererTurbo(this, 462, 2, textureX, textureY, "lamp"); // Box 303 numberboard
		bodyModel[83] = new ModelRendererTurbo(this, 471, 25, textureX, textureY); // Box 304
		bodyModel[84] = new ModelRendererTurbo(this, 495, 4, textureX, textureY); // Box 155
		bodyModel[85] = new ModelRendererTurbo(this, 478, 4, textureX, textureY); // Box 157
		bodyModel[86] = new ModelRendererTurbo(this, 343, 4, textureX, textureY); // Box 117
		bodyModel[87] = new ModelRendererTurbo(this, 421, 23, textureX, textureY); // Box 500
		bodyModel[88] = new ModelRendererTurbo(this, 496, 30, textureX, textureY); // Box 363
		bodyModel[89] = new ModelRendererTurbo(this, 410, 51, textureX, textureY); // Box 493 425 radiator bit
		bodyModel[90] = new ModelRendererTurbo(this, 461, 68, textureX, textureY); // Box 117
		bodyModel[91] = new ModelRendererTurbo(this, 461, 68, textureX, textureY); // Box 117
		bodyModel[92] = new ModelRendererTurbo(this, 234, 47, textureX, textureY); // Box 2 Air intake box
		bodyModel[93] = new ModelRendererTurbo(this, 254, 3, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 205, 11, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 244, 11, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 397, 34, textureX, textureY); // Box 236
		bodyModel[98] = new ModelRendererTurbo(this, 94, 163, textureX, textureY); // Box 245
		bodyModel[99] = new ModelRendererTurbo(this, 94, 135, textureX, textureY); // Box 247
		bodyModel[100] = new ModelRendererTurbo(this, 362, 23, textureX, textureY); // Box 501 dynamics
		bodyModel[101] = new ModelRendererTurbo(this, 119, 165, textureX, textureY); // Box 245
		bodyModel[102] = new ModelRendererTurbo(this, 414, 153, textureX, textureY); // Box 138 mount point
		bodyModel[103] = new ModelRendererTurbo(this, 262, 153, textureX, textureY); // Box 138 mount point
		bodyModel[104] = new ModelRendererTurbo(this, 272, 170, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 250, 177, textureX, textureY); // Box 14
		bodyModel[106] = new ModelRendererTurbo(this, 248, 172, textureX, textureY); // Box 14
		bodyModel[107] = new ModelRendererTurbo(this, 426, 177, textureX, textureY); // Box 14
		bodyModel[108] = new ModelRendererTurbo(this, 424, 172, textureX, textureY); // Box 14
		bodyModel[109] = new ModelRendererTurbo(this, 250, 169, textureX, textureY); // Box 14
		bodyModel[110] = new ModelRendererTurbo(this, 248, 164, textureX, textureY); // Box 14
		bodyModel[111] = new ModelRendererTurbo(this, 426, 169, textureX, textureY); // Box 14
		bodyModel[112] = new ModelRendererTurbo(this, 424, 164, textureX, textureY); // Box 14
		bodyModel[113] = new ModelRendererTurbo(this, 298, 151, textureX, textureY); // Box 23
		bodyModel[114] = new ModelRendererTurbo(this, 243, 158, textureX, textureY); // Box 14
		bodyModel[115] = new ModelRendererTurbo(this, 272, 154, textureX, textureY); // Box 14
		bodyModel[116] = new ModelRendererTurbo(this, 289, 173, textureX, textureY); // Box 14
		bodyModel[117] = new ModelRendererTurbo(this, 370, 154, textureX, textureY); // Box 14
		bodyModel[118] = new ModelRendererTurbo(this, 395, 173, textureX, textureY); // Box 14
		bodyModel[119] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 14
		bodyModel[120] = new ModelRendererTurbo(this, 387, 173, textureX, textureY); // Box 14
		bodyModel[121] = new ModelRendererTurbo(this, 408, 171, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 272, 165, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 302, 163, textureX, textureY); // Box 178 tank main
		bodyModel[125] = new ModelRendererTurbo(this, 282, 210, textureX, textureY); // Box 356
		bodyModel[126] = new ModelRendererTurbo(this, 284, 210, textureX, textureY); // Box 357
		bodyModel[127] = new ModelRendererTurbo(this, 247, 151, textureX, textureY); // Box 362 brake chain holder
		bodyModel[128] = new ModelRendererTurbo(this, 310, 163, textureX, textureY); // Box 374
		bodyModel[129] = new ModelRendererTurbo(this, 311, 165, textureX, textureY); // Box 375
		bodyModel[130] = new ModelRendererTurbo(this, 371, 165, textureX, textureY); // Box 376
		bodyModel[131] = new ModelRendererTurbo(this, 370, 163, textureX, textureY); // Box 377
		bodyModel[132] = new ModelRendererTurbo(this, 290, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[133] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[134] = new ModelRendererTurbo(this, 345, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[135] = new ModelRendererTurbo(this, 370, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[136] = new ModelRendererTurbo(this, 277, 182, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[137] = new ModelRendererTurbo(this, 395, 158, textureX, textureY); // Box 14
		bodyModel[138] = new ModelRendererTurbo(this, 246, 158, textureX, textureY); // Box 362 brake chain holder
		bodyModel[139] = new ModelRendererTurbo(this, 355, 201, textureX, textureY); // Box 383 BCOL moment
		bodyModel[140] = new ModelRendererTurbo(this, 397, 199, textureX, textureY); // Box 383 BCOL moment
		bodyModel[141] = new ModelRendererTurbo(this, 467, 218, textureX, textureY); // Box 494
		bodyModel[142] = new ModelRendererTurbo(this, 234, 31, textureX, textureY, "cull"); // Box 2 Air intake cull
		bodyModel[143] = new ModelRendererTurbo(this, 94, 153, textureX, textureY); // Box 206
		bodyModel[144] = new ModelRendererTurbo(this, 94, 125, textureX, textureY); // Box 206
		bodyModel[145] = new ModelRendererTurbo(this, 221, 124, textureX, textureY); // Box 186
		bodyModel[146] = new ModelRendererTurbo(this, 221, 152, textureX, textureY); // Box 186
		bodyModel[147] = new ModelRendererTurbo(this, 94, 117, textureX, textureY); // Box 206
		bodyModel[148] = new ModelRendererTurbo(this, 94, 145, textureX, textureY); // Box 206
		bodyModel[149] = new ModelRendererTurbo(this, 463, 205, textureX, textureY); // Box 494
		bodyModel[150] = new ModelRendererTurbo(this, 232, 63, textureX, textureY); // Box 261 dash 7 vents
		bodyModel[151] = new ModelRendererTurbo(this, 11, 186, textureX, textureY); // Box 4
		bodyModel[152] = new ModelRendererTurbo(this, 11, 198, textureX, textureY); // Box 4
		bodyModel[153] = new ModelRendererTurbo(this, 15, 176, textureX, textureY); // Box 449
		bodyModel[154] = new ModelRendererTurbo(this, 9, 211, textureX, textureY); // Box 132
		bodyModel[155] = new ModelRendererTurbo(this, 35, 211, textureX, textureY); // Box 133
		bodyModel[156] = new ModelRendererTurbo(this, 484, 187, textureX, textureY); // Box 132
		bodyModel[157] = new ModelRendererTurbo(this, 459, 187, textureX, textureY); // Box 133
		bodyModel[158] = new ModelRendererTurbo(this, 230, 47, textureX, textureY, "cull"); // Box 2 Air intake cull
		bodyModel[159] = new ModelRendererTurbo(this, 37, 226, textureX, textureY); // Box 132
		bodyModel[160] = new ModelRendererTurbo(this, 11, 226, textureX, textureY); // Box 133
		bodyModel[161] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[162] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[163] = new ModelRendererTurbo(this, 477, 166, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[164] = new ModelRendererTurbo(this, 485, 166, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[165] = new ModelRendererTurbo(this, 63, 61, textureX, textureY, BoxName.ditch); // Box 451 front ditchlight U
		bodyModel[166] = new ModelRendererTurbo(this, 63, 61, textureX, textureY, BoxName.ditch); // Box 454 front ditchlight U
		bodyModel[167] = new ModelRendererTurbo(this, 36, 40, textureX, textureY, "lamp"); // Box 449 front headlight N
		bodyModel[168] = new ModelRendererTurbo(this, 52, 54, textureX, textureY); // Box 238
		bodyModel[169] = new ModelRendererTurbo(this, 25, 48, textureX, textureY); // Box 35
		bodyModel[170] = new ModelRendererTurbo(this, 62, 52, textureX, textureY); // Box 55
		bodyModel[171] = new ModelRendererTurbo(this, 57, 51, textureX, textureY); // Box 35
		bodyModel[172] = new ModelRendererTurbo(this, 10, 52, textureX, textureY); // Box 55
		bodyModel[173] = new ModelRendererTurbo(this, 38, 74, textureX, textureY); // Box 74 door swing right
		bodyModel[174] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 84
		bodyModel[175] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 85
		bodyModel[176] = new ModelRendererTurbo(this, 52, 42, textureX, textureY); // Box 86
		bodyModel[177] = new ModelRendererTurbo(this, 8, 42, textureX, textureY); // Box 87
		bodyModel[178] = new ModelRendererTurbo(this, 44, 40, textureX, textureY); // Box 74
		bodyModel[179] = new ModelRendererTurbo(this, 26, 54, textureX, textureY); // Box 361
		bodyModel[180] = new ModelRendererTurbo(this, 29, 40, textureX, textureY, "lamp"); // Box 448 front headlight N
		bodyModel[181] = new ModelRendererTurbo(this, 117, 62, textureX, textureY); // Box 57 nose cope slope
		bodyModel[182] = new ModelRendererTurbo(this, 140, 62, textureX, textureY); // Box 58 nose cope slope
		bodyModel[183] = new ModelRendererTurbo(this, 49, 2, textureX, textureY); // box65
		bodyModel[184] = new ModelRendererTurbo(this, 96, 96, textureX, textureY); // Box 413 cs1
		bodyModel[185] = new ModelRendererTurbo(this, 110, 45, textureX, textureY); // Box 95
		bodyModel[186] = new ModelRendererTurbo(this, 46, 6, textureX, textureY); // Box 29
		bodyModel[187] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Box 32
		bodyModel[188] = new ModelRendererTurbo(this, 155, 48, textureX, textureY); // Box 314 door swing left
		bodyModel[189] = new ModelRendererTurbo(this, 180, 22, textureX, textureY); // Box 114
		bodyModel[190] = new ModelRendererTurbo(this, 180, 25, textureX, textureY); // Box 78
		bodyModel[191] = new ModelRendererTurbo(this, 178, 15, textureX, textureY, "cull"); // Box 481 cull
		bodyModel[192] = new ModelRendererTurbo(this, 90, 1, textureX, textureY); // Box 71
		bodyModel[193] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Box 55
		bodyModel[194] = new ModelRendererTurbo(this, 102, 18, textureX, textureY); // Box 74
		bodyModel[195] = new ModelRendererTurbo(this, 127, 1, textureX, textureY); // Box 94
		bodyModel[196] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		bodyModel[197] = new ModelRendererTurbo(this, 134, 11, textureX, textureY); // Box 96
		bodyModel[198] = new ModelRendererTurbo(this, 78, 11, textureX, textureY); // Box 97
		bodyModel[199] = new ModelRendererTurbo(this, 103, 24, textureX, textureY, "lamp"); // Box 137 numberboard cab
		bodyModel[200] = new ModelRendererTurbo(this, 119, 24, textureX, textureY, "lamp"); // Box 137 numberboard cab
		bodyModel[201] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 346 door swing right
		bodyModel[202] = new ModelRendererTurbo(this, 28, 26, textureX, textureY); // Box 350
		bodyModel[203] = new ModelRendererTurbo(this, 62, 86, textureX, textureY); // Box 355
		bodyModel[204] = new ModelRendererTurbo(this, 10, 86, textureX, textureY); // Box 356
		bodyModel[205] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Box 359
		bodyModel[206] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 360
		bodyModel[207] = new ModelRendererTurbo(this, 119, 19, textureX, textureY, "lamp"); // Box 703 glow marker lights
		bodyModel[208] = new ModelRendererTurbo(this, 107, 19, textureX, textureY, "lamp"); // Box 704 glow marker lights
		bodyModel[209] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 55
		bodyModel[210] = new ModelRendererTurbo(this, 63, 26, textureX, textureY); // Box 56
		bodyModel[211] = new ModelRendererTurbo(this, 190, 28, textureX, textureY); // Box 332
		bodyModel[212] = new ModelRendererTurbo(this, 190, 22, textureX, textureY); // Box 331
		bodyModel[213] = new ModelRendererTurbo(this, 197, 25, textureX, textureY); // Box 330
		bodyModel[214] = new ModelRendererTurbo(this, 188, 31, textureX, textureY); // Box 329
		bodyModel[215] = new ModelRendererTurbo(this, 188, 19, textureX, textureY); // Box 328
		bodyModel[216] = new ModelRendererTurbo(this, 186, 25, textureX, textureY); // Box 327
		bodyModel[217] = new ModelRendererTurbo(this, 166, 29, textureX, textureY); // Box 184 o2 generator
		bodyModel[218] = new ModelRendererTurbo(this, 73, 34, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[219] = new ModelRendererTurbo(this, 76, 29, textureX, textureY); // Box 5
		bodyModel[220] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // box64
		bodyModel[221] = new ModelRendererTurbo(this, 161, 20, textureX, textureY); // Box 439
		bodyModel[222] = new ModelRendererTurbo(this, 115, 95, textureX, textureY); // Box 412 cs1
		bodyModel[223] = new ModelRendererTurbo(this, 89, 87, textureX, textureY); // Box 86 cs1
		bodyModel[224] = new ModelRendererTurbo(this, 120, 89, textureX, textureY); // Box 476 cs1 radio
		bodyModel[225] = new ModelRendererTurbo(this, 180, 19, textureX, textureY); // Box 74
		bodyModel[226] = new ModelRendererTurbo(this, 100, 38, textureX, textureY, "cull"); // Box 406 cull backpannel
		bodyModel[227] = new ModelRendererTurbo(this, 167, 11, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[228] = new ModelRendererTurbo(this, 167, 11, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[229] = new ModelRendererTurbo(this, 167, 11, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[230] = new ModelRendererTurbo(this, 167, 11, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[231] = new ModelRendererTurbo(this, 94, 65, textureX, textureY, "cull"); // Box 406 hot plate cull
		bodyModel[232] = new ModelRendererTurbo(this, 167, 15, textureX, textureY); // Box 364 prime base
		bodyModel[233] = new ModelRendererTurbo(this, 61, 143, textureX, textureY); // Box 311
		bodyModel[234] = new ModelRendererTurbo(this, 55, 145, textureX, textureY); // Box 312
		bodyModel[235] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 313
		bodyModel[236] = new ModelRendererTurbo(this, 68, 106, textureX, textureY); // Box 369
		bodyModel[237] = new ModelRendererTurbo(this, 68, 104, textureX, textureY); // Box 370
		bodyModel[238] = new ModelRendererTurbo(this, 74, 104, textureX, textureY); // Box 371
		bodyModel[239] = new ModelRendererTurbo(this, 74, 111, textureX, textureY); // Box 372
		bodyModel[240] = new ModelRendererTurbo(this, 10, 112, textureX, textureY); // Box 376
		bodyModel[241] = new ModelRendererTurbo(this, 10, 105, textureX, textureY); // Box 378
		bodyModel[242] = new ModelRendererTurbo(this, 16, 107, textureX, textureY); // Box 379
		bodyModel[243] = new ModelRendererTurbo(this, 16, 105, textureX, textureY); // Box 380
		bodyModel[244] = new ModelRendererTurbo(this, 70, 143, textureX, textureY); // Box 381
		bodyModel[245] = new ModelRendererTurbo(this, 75, 145, textureX, textureY); // Box 382
		bodyModel[246] = new ModelRendererTurbo(this, 78, 145, textureX, textureY); // Box 383
		bodyModel[247] = new ModelRendererTurbo(this, 76, 142, textureX, textureY); // Box 13
		bodyModel[248] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 14
		bodyModel[249] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 374
		bodyModel[250] = new ModelRendererTurbo(this, 77, 134, textureX, textureY); // Box 375
		bodyModel[251] = new ModelRendererTurbo(this, 80, 142, textureX, textureY); // Box 384
		bodyModel[252] = new ModelRendererTurbo(this, 81, 138, textureX, textureY); // Box 385
		bodyModel[253] = new ModelRendererTurbo(this, 81, 134, textureX, textureY); // Box 386
		bodyModel[254] = new ModelRendererTurbo(this, 81, 130, textureX, textureY); // Box 387
		bodyModel[255] = new ModelRendererTurbo(this, 61, 143, textureX, textureY); // Box 311
		bodyModel[256] = new ModelRendererTurbo(this, 55, 145, textureX, textureY); // Box 312
		bodyModel[257] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 313
		bodyModel[258] = new ModelRendererTurbo(this, 70, 143, textureX, textureY); // Box 381
		bodyModel[259] = new ModelRendererTurbo(this, 75, 145, textureX, textureY); // Box 382
		bodyModel[260] = new ModelRendererTurbo(this, 78, 145, textureX, textureY); // Box 383
		bodyModel[261] = new ModelRendererTurbo(this, 76, 142, textureX, textureY); // Box 13
		bodyModel[262] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 14
		bodyModel[263] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 374
		bodyModel[264] = new ModelRendererTurbo(this, 77, 134, textureX, textureY); // Box 375
		bodyModel[265] = new ModelRendererTurbo(this, 80, 142, textureX, textureY); // Box 384
		bodyModel[266] = new ModelRendererTurbo(this, 81, 138, textureX, textureY); // Box 385
		bodyModel[267] = new ModelRendererTurbo(this, 81, 134, textureX, textureY); // Box 386
		bodyModel[268] = new ModelRendererTurbo(this, 81, 130, textureX, textureY); // Box 387
		bodyModel[269] = new ModelRendererTurbo(this, 221, 118, textureX, textureY); // Box 371
		bodyModel[270] = new ModelRendererTurbo(this, 221, 146, textureX, textureY); // Box 378
		bodyModel[271] = new ModelRendererTurbo(this, 216, 121, textureX, textureY); // Box 373
		bodyModel[272] = new ModelRendererTurbo(this, 216, 149, textureX, textureY); // Box 377
		bodyModel[273] = new ModelRendererTurbo(this, 77, 126, textureX, textureY); // Box 374
		bodyModel[274] = new ModelRendererTurbo(this, 81, 126, textureX, textureY); // Box 387
		bodyModel[275] = new ModelRendererTurbo(this, 77, 126, textureX, textureY); // Box 374
		bodyModel[276] = new ModelRendererTurbo(this, 81, 126, textureX, textureY); // Box 387
		bodyModel[277] = new ModelRendererTurbo(this, 119, 137, textureX, textureY); // Box 245
		bodyModel[278] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 117
		bodyModel[279] = new ModelRendererTurbo(this, 446, 231, textureX, textureY); // Box 494
		bodyModel[280] = new ModelRendererTurbo(this, 479, 231, textureX, textureY); // Box 494
		bodyModel[281] = new ModelRendererTurbo(this, 468, 13, textureX, textureY); // Box 238 sand cap
		bodyModel[282] = new ModelRendererTurbo(this, 467, 113, textureX, textureY); // Box 117
		bodyModel[283] = new ModelRendererTurbo(this, 467, 121, textureX, textureY); // Box 117
		bodyModel[284] = new ModelRendererTurbo(this, 456, 97, textureX, textureY); // Box 494
		bodyModel[285] = new ModelRendererTurbo(this, 456, 88, textureX, textureY); // Box 494
		bodyModel[286] = new ModelRendererTurbo(this, 333, 244, textureX, textureY); // Box 117
		bodyModel[287] = new ModelRendererTurbo(this, 333, 235, textureX, textureY); // Box 117
		bodyModel[288] = new ModelRendererTurbo(this, 322, 247, textureX, textureY); // Box 117
		bodyModel[289] = new ModelRendererTurbo(this, 322, 238, textureX, textureY); // Box 117
		bodyModel[290] = new ModelRendererTurbo(this, 111, 151, textureX, textureY); // Box 206
		bodyModel[291] = new ModelRendererTurbo(this, 94, 115, textureX, textureY); // Box 206
		bodyModel[292] = new ModelRendererTurbo(this, 4, 174, textureX, textureY); // Box 446
		bodyModel[293] = new ModelRendererTurbo(this, 35, 186, textureX, textureY); // Box 4
		bodyModel[294] = new ModelRendererTurbo(this, 35, 198, textureX, textureY); // Box 4
		bodyModel[295] = new ModelRendererTurbo(this, 35, 176, textureX, textureY); // Box 449
		bodyModel[296] = new ModelRendererTurbo(this, 46, 174, textureX, textureY); // Box 446
		bodyModel[297] = new ModelRendererTurbo(this, 207, 34, textureX, textureY); // Box 418
		bodyModel[298] = new ModelRendererTurbo(this, 198, 31, textureX, textureY); // Box 419
		bodyModel[299] = new ModelRendererTurbo(this, 196, 34, textureX, textureY); // Box 420
		bodyModel[300] = new ModelRendererTurbo(this, 198, 37, textureX, textureY); // Box 421
		bodyModel[301] = new ModelRendererTurbo(this, 163, 23, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[302] = new ModelRendererTurbo(this, 163, 23, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[303] = new ModelRendererTurbo(this, 163, 23, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[304] = new ModelRendererTurbo(this, 163, 23, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[305] = new ModelRendererTurbo(this, 161, 31, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[306] = new ModelRendererTurbo(this, 163, 27, textureX, textureY); // Box 428
		bodyModel[307] = new ModelRendererTurbo(this, 225, 203, textureX, textureY, "cull"); // Rear vents protetors cull
		bodyModel[308] = new ModelRendererTurbo(this, 235, 191, textureX, textureY, "cull"); // Rear vents protetors cull
		bodyModel[309] = new ModelRendererTurbo(this, 235, 197, textureX, textureY, "cull"); // Rear vents protetors cull
		bodyModel[310] = new ModelRendererTurbo(this, 176, 200, textureX, textureY, "cull"); // Rear vents protetors cull
		bodyModel[311] = new ModelRendererTurbo(this, 35, 118, textureX, textureY); // Box 455
		bodyModel[312] = new ModelRendererTurbo(this, 37, 99, textureX, textureY); // Box 226
		bodyModel[313] = new ModelRendererTurbo(this, 50, 104, textureX, textureY); // Box 228
		bodyModel[314] = new ModelRendererTurbo(this, 34, 104, textureX, textureY); // Box 229
		bodyModel[315] = new ModelRendererTurbo(this, 46, 100, textureX, textureY); // Box 230
		bodyModel[316] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 231
		bodyModel[317] = new ModelRendererTurbo(this, 28, 107, textureX, textureY); // Box 61
		bodyModel[318] = new ModelRendererTurbo(this, 56, 107, textureX, textureY); // Box 682
		bodyModel[319] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 708
		bodyModel[320] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 709
		bodyModel[321] = new ModelRendererTurbo(this, 61, 110, textureX, textureY, BoxName.ditch); // Box 359 front ditchlight L
		bodyModel[322] = new ModelRendererTurbo(this, 61, 115, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[323] = new ModelRendererTurbo(this, 61, 115, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[324] = new ModelRendererTurbo(this, 61, 110, textureX, textureY, BoxName.ditch); // Box 321 front ditchlight L
		bodyModel[325] = new ModelRendererTurbo(this, 46, 114, textureX, textureY); // Box 307
		bodyModel[326] = new ModelRendererTurbo(this, 28, 114, textureX, textureY); // Box 308
		bodyModel[327] = new ModelRendererTurbo(this, 50, 100, textureX, textureY); // Box 362
		bodyModel[328] = new ModelRendererTurbo(this, 53, 100, textureX, textureY); // Box 363
		bodyModel[329] = new ModelRendererTurbo(this, 31, 100, textureX, textureY); // Box 364
		bodyModel[330] = new ModelRendererTurbo(this, 34, 100, textureX, textureY); // Box 365
		bodyModel[331] = new ModelRendererTurbo(this, 405, 1, textureX, textureY); // Box 494
		bodyModel[332] = new ModelRendererTurbo(this, 469, 135, textureX, textureY); // Box 684
		bodyModel[333] = new ModelRendererTurbo(this, 497, 135, textureX, textureY); // Box 685
		bodyModel[334] = new ModelRendererTurbo(this, 493, 149, textureX, textureY); // Box 239
		bodyModel[335] = new ModelRendererTurbo(this, 500, 149, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[336] = new ModelRendererTurbo(this, 500, 149, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[337] = new ModelRendererTurbo(this, 493, 149, textureX, textureY); // Box 242
		bodyModel[338] = new ModelRendererTurbo(this, 476, 143, textureX, textureY); // Box 292
		bodyModel[339] = new ModelRendererTurbo(this, 468, 139, textureX, textureY); // Box 293
		bodyModel[340] = new ModelRendererTurbo(this, 488, 139, textureX, textureY); // Box 294
		bodyModel[341] = new ModelRendererTurbo(this, 478, 125, textureX, textureY); // Box 295
		bodyModel[342] = new ModelRendererTurbo(this, 491, 129, textureX, textureY); // Box 296
		bodyModel[343] = new ModelRendererTurbo(this, 484, 126, textureX, textureY); // Box 297
		bodyModel[344] = new ModelRendererTurbo(this, 478, 126, textureX, textureY); // Box 298
		bodyModel[345] = new ModelRendererTurbo(this, 475, 129, textureX, textureY); // Box 299
		bodyModel[346] = new ModelRendererTurbo(this, 472, 129, textureX, textureY); // Box 300
		bodyModel[347] = new ModelRendererTurbo(this, 472, 131, textureX, textureY); // Box 301
		bodyModel[348] = new ModelRendererTurbo(this, 469, 128, textureX, textureY); // Box 302
		bodyModel[349] = new ModelRendererTurbo(this, 497, 128, textureX, textureY); // Box 303
		bodyModel[350] = new ModelRendererTurbo(this, 494, 131, textureX, textureY); // Box 304
		bodyModel[351] = new ModelRendererTurbo(this, 494, 129, textureX, textureY); // Box 305
		bodyModel[352] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 114
		bodyModel[353] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 74
		bodyModel[354] = new ModelRendererTurbo(this, 146, 60, textureX, textureY); // Box 78
		bodyModel[355] = new ModelRendererTurbo(this, 145, 53, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[356] = new ModelRendererTurbo(this, 413, 195, textureX, textureY); // Box 374
		bodyModel[357] = new ModelRendererTurbo(this, 419, 193, textureX, textureY); // Box 375
		bodyModel[358] = new ModelRendererTurbo(this, 419, 193, textureX, textureY); // Box 376
		bodyModel[359] = new ModelRendererTurbo(this, 413, 195, textureX, textureY); // Box 377
		bodyModel[360] = new ModelRendererTurbo(this, 403, 189, textureX, textureY); // Box 378
		bodyModel[361] = new ModelRendererTurbo(this, 403, 183, textureX, textureY); // Box 379
		bodyModel[362] = new ModelRendererTurbo(this, 246, 183, textureX, textureY); // Box 384 fncc engine oil sump
		bodyModel[363] = new ModelRendererTurbo(this, 235, 183, textureX, textureY, "cull"); // Box 385 fncc engine oil sump cull
		bodyModel[364] = new ModelRendererTurbo(this, 163, 3, textureX, textureY, "lamp"); // Box 248 front headlight U
		bodyModel[365] = new ModelRendererTurbo(this, 163, 3, textureX, textureY, "lamp"); // Box 249 front headlight U
		bodyModel[366] = new ModelRendererTurbo(this, 166, 4, textureX, textureY); // Box 250

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-52F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-49F, 2.5F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 6
		bodyModel[2].setRotationPoint(-48F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 8
		bodyModel[3].setRotationPoint(-45F, -2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 13
		bodyModel[4].setRotationPoint(-48F, 7F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 14
		bodyModel[5].setRotationPoint(-48F, 4.75F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 20
		bodyModel[6].setRotationPoint(-48F, 6F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 87
		bodyModel[7].setRotationPoint(-48F, 6F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 88
		bodyModel[8].setRotationPoint(-48F, 7F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 278
		bodyModel[9].setRotationPoint(-48F, 2.5F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 279
		bodyModel[10].setRotationPoint(-48F, 0.25F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 301
		bodyModel[11].setRotationPoint(45F, 6F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 302
		bodyModel[12].setRotationPoint(45F, 7F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 314
		bodyModel[13].setRotationPoint(45F, 6F, 9F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 315
		bodyModel[14].setRotationPoint(45F, 7F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[15].setRotationPoint(-44F, -2F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 4
		bodyModel[16].setRotationPoint(-48F, -2F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 96, 1, 14, 0F); // Box 52
		bodyModel[17].setRotationPoint(-48F, -2F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[18].setRotationPoint(-45F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-45F, -2F, 9F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 205
		bodyModel[20].setRotationPoint(-48F, -2F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 206
		bodyModel[21].setRotationPoint(-44F, -2F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 96, 3, 12, 0F); // Box 23
		bodyModel[22].setRotationPoint(-48F, -1F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 96, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-48F, 2F, -6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[24].setRotationPoint(-48F, -0.75F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[25].setRotationPoint(-45F, 2F, -3F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 141
		bodyModel[26].setRotationPoint(-48F, 2F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 186
		bodyModel[27].setRotationPoint(45F, -2F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 187
		bodyModel[28].setRotationPoint(45F, 4.75F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 188
		bodyModel[29].setRotationPoint(45F, 2.5F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 189
		bodyModel[30].setRotationPoint(45F, 0.25F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[31].setRotationPoint(45F, -0.75F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 193
		bodyModel[32].setRotationPoint(48F, -2F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 196
		bodyModel[33].setRotationPoint(-45F, -2F, 9F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 197
		bodyModel[34].setRotationPoint(-48F, 0.25F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 198
		bodyModel[35].setRotationPoint(-48F, 2.5F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[36].setRotationPoint(-48F, 4.75F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 202
		bodyModel[37].setRotationPoint(45F, 4.75F, 9F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 9, 2, 0F); // Box 203
		bodyModel[38].setRotationPoint(45F, -2F, 9F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 204
		bodyModel[39].setRotationPoint(45F, 2.5F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 205
		bodyModel[40].setRotationPoint(45F, 0.25F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[41].setRotationPoint(45F, -0.75F, 9F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 210
		bodyModel[42].setRotationPoint(44F, -2F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[43].setRotationPoint(44F, -2F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 213
		bodyModel[44].setRotationPoint(44F, -2F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[45].setRotationPoint(44F, -2F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 427
		bodyModel[46].setRotationPoint(40F, 2F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 428
		bodyModel[47].setRotationPoint(45F, 2F, -3F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[48].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[49].setRotationPoint(48F, 2.5F, -2.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 279
		bodyModel[50].setRotationPoint(-48F, -2F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 20
		bodyModel[51].setRotationPoint(-48F, 3.75F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 20
		bodyModel[52].setRotationPoint(-48F, 1.5F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 197
		bodyModel[53].setRotationPoint(-48F, -2F, 9F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 87
		bodyModel[54].setRotationPoint(-48F, 3.75F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 87
		bodyModel[55].setRotationPoint(-48F, 1.5F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[56].setRotationPoint(-48F, -0.75F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 189
		bodyModel[57].setRotationPoint(45F, -2F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 205
		bodyModel[58].setRotationPoint(45F, -2F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 301
		bodyModel[59].setRotationPoint(45F, 3.75F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 314
		bodyModel[60].setRotationPoint(45F, 3.75F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 301
		bodyModel[61].setRotationPoint(45F, 1.5F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 314
		bodyModel[62].setRotationPoint(45F, 1.5F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 52, 20, 14, 0F); // Box 2
		bodyModel[63].setRotationPoint(-26F, -22F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[64].setRotationPoint(-26F, -23F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[65].setRotationPoint(-26F, -23F, 2F);

		bodyModel[66].addBox(0F, 0F, 0F, 52, 1, 4, 0F); // Box 498
		bodyModel[66].setRotationPoint(-26F, -23F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 490
		bodyModel[67].setRotationPoint(44F, -15F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 502
		bodyModel[68].setRotationPoint(44F, -23F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[69].setRotationPoint(44F, -22F, 1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		bodyModel[70].setRotationPoint(45F, -15F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[71].setRotationPoint(44F, -22F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[72].setRotationPoint(44F, -18F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 159
		bodyModel[73].setRotationPoint(44F, -18F, 1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[74].setRotationPoint(44F, -18F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 161
		bodyModel[75].setRotationPoint(44F, -18F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 headlight r
		bodyModel[76].setRotationPoint(45.25F, -20F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight r
		bodyModel[77].setRotationPoint(45.25F, -22F, -1F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 1523
		bodyModel[78].setRotationPoint(44F, -17F, -5F);

		bodyModel[79].addShapeBox(-1F, 0F, -0.5F, 2, 2, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 1526 markerlight
		bodyModel[79].setRotationPoint(45F, -17F, -6F);
		bodyModel[79].rotateAngleY = 0.78539816F;

		bodyModel[80].addShapeBox(-1F, 0F, -0.5F, 2, 2, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 1527 markerlight
		bodyModel[80].setRotationPoint(45F, -17F, 6F);
		bodyModel[80].rotateAngleY = -0.78539816F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, 0.75F, 2F, 0F, 0.75F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.75F, 0F, 0.75F, 2F, 0F, 0.75F); // Box 302 numberboard
		bodyModel[81].setRotationPoint(45F, -21F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, -6F, 1, 2, 5, 0F,2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, 0.75F, 0F, 0F, 0.75F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.1F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 303 numberboard
		bodyModel[82].setRotationPoint(45F, -21F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F); // Box 304
		bodyModel[83].setRotationPoint(44F, -17F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[84].setRotationPoint(44F, -23F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[85].setRotationPoint(44F, -23F, -7F);

		bodyModel[86].addBox(0F, 0F, 0F, 18, 3, 14, 0F); // Box 117
		bodyModel[86].setRotationPoint(26F, -22F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 500
		bodyModel[87].setRotationPoint(26F, -23.25F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[88].setRotationPoint(44F, -17F, 5F);

		bodyModel[89].addBox(0F, 0F, 0F, 18, 17, 15, 0F); // Box 493 425 radiator bit
		bodyModel[89].setRotationPoint(26F, -19F, -7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 117
		bodyModel[90].setRotationPoint(26F, -22F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 117
		bodyModel[91].setRotationPoint(41F, -22F, -8F);

		bodyModel[92].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 2 Air intake box
		bodyModel[92].setRotationPoint(-20F, -23F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-16F, -23.5F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 2
		bodyModel[94].setRotationPoint(-20F, -23.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 16, 5, 0, 0F,0F, -0.5F, 0F, -8.5F, -0.5F, 0F, -8.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -8.5F, -0.25F, 0F, -8.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[95].setRotationPoint(-14.75F, -23.5F, -8.01F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 5, 0, 0F,0F, -0.5F, 0F, -12.5F, -0.5F, 0F, -12.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -12.5F, -0.25F, 0F, -12.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[96].setRotationPoint(-18.75F, -23.5F, 8.01F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 236
		bodyModel[97].setRotationPoint(15F, -24F, -2F);

		bodyModel[98].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 245
		bodyModel[98].setRotationPoint(-26F, -6F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 247
		bodyModel[99].setRotationPoint(-26F, -6F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501 dynamics
		bodyModel[100].setRotationPoint(-1F, -24F, -2F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 245
		bodyModel[101].setRotationPoint(-18F, -4F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 138 mount point
		bodyModel[102].setRotationPoint(30.5F, 1.5F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 138 mount point
		bodyModel[103].setRotationPoint(-33.5F, 1.5F, -1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[104].setRotationPoint(-33.5F, -1F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[105].setRotationPoint(-30.5F, 2F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[106].setRotationPoint(-30.5F, 1F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[107].setRotationPoint(27.5F, 2F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[108].setRotationPoint(27.5F, 1F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[109].setRotationPoint(-30.5F, 2F, 7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[110].setRotationPoint(-30.5F, 1F, 5.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[111].setRotationPoint(27.5F, 2F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[112].setRotationPoint(27.5F, 1F, 5.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 36, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 23
		bodyModel[113].setRotationPoint(-18F, 2F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14
		bodyModel[114].setRotationPoint(-33.5F, 2F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 14
		bodyModel[115].setRotationPoint(-32.5F, -1F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[116].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 14
		bodyModel[117].setRotationPoint(31.5F, -1F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[118].setRotationPoint(31.5F, 2F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[119].setRotationPoint(-32.5F, 2F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[120].setRotationPoint(31.5F, 2F, 10F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[121].setRotationPoint(30.5F, -1F, -11.01F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[122].setRotationPoint(30.5F, -1F, 11.01F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[123].setRotationPoint(-34.5F, -1F, 11.01F);

		bodyModel[124].addBox(0F, 0F, 0F, 25, 6, 17, 0F); // Box 178 tank main
		bodyModel[124].setRotationPoint(-12.5F, 3F, -8.5F);

		bodyModel[125].addShapeBox(0F, -1.5F, -1.5F, 12, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356
		bodyModel[125].setRotationPoint(-12.5F, 1F, -8F);
		bodyModel[125].rotateAngleX = 0.78539816F;

		bodyModel[126].addShapeBox(0F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 357
		bodyModel[126].setRotationPoint(3.5F, 1F, -9F);
		bodyModel[126].rotateAngleX = 0.78539816F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 362 brake chain holder
		bodyModel[127].setRotationPoint(-40F, -1F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[128].setRotationPoint(0.5F, 3F, -10.75F);
		bodyModel[128].rotateAngleX = -0.17453293F;

		bodyModel[129].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[129].setRotationPoint(1F, 3F, -10.75F);
		bodyModel[129].rotateAngleX = -0.9424778F;

		bodyModel[130].addShapeBox(0F, -0.5F, -4F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[130].setRotationPoint(1F, 3F, 10.75F);
		bodyModel[130].rotateAngleX = 0.9424778F;

		bodyModel[131].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 377
		bodyModel[131].setRotationPoint(0.5F, 3F, 10.75F);
		bodyModel[131].rotateAngleX = 0.17453293F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 standard tank
		bodyModel[132].setRotationPoint(-12.5F, 4.5F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 standard tank
		bodyModel[133].setRotationPoint(2.5F, 4.5F, -10.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381 standard tank
		bodyModel[134].setRotationPoint(2.5F, 4.5F, 8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381 standard tank
		bodyModel[135].setRotationPoint(-12.5F, 4.5F, 8.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[136].setRotationPoint(-15.5F, -1F, -9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14
		bodyModel[137].setRotationPoint(30.5F, 2F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 362 brake chain holder
		bodyModel[138].setRotationPoint(-39F, -0.75F, -10.99F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383 BCOL moment
		bodyModel[139].setRotationPoint(2.5F, 4.5F, 8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383 BCOL moment
		bodyModel[140].setRotationPoint(8.5F, 6.5F, 8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 22, 12, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[141].setRotationPoint(29F, -14F, -7.51F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake cull
		bodyModel[142].setRotationPoint(-20F, -24F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 63, 8, 0, 0F); // Box 206
		bodyModel[143].setRotationPoint(-18F, -10F, 11F);

		bodyModel[144].addBox(0F, 0F, 0F, 63, 8, 0, 0F); // Box 206
		bodyModel[144].setRotationPoint(-18F, -10F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[145].setRotationPoint(45F, -10F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[146].setRotationPoint(45F, -10F, 10F);

		bodyModel[147].addBox(0F, 0F, 0F, 8, 7, 0, 0F); // Box 206
		bodyModel[147].setRotationPoint(-26F, -13F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 8, 7, 0, 0F); // Box 206
		bodyModel[148].setRotationPoint(-26F, -13F, 11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 24, 12, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[149].setRotationPoint(31F, -14F, 7.51F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 22, 10, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 261 dash 7 vents
		bodyModel[150].setRotationPoint(-18.5F, -23F, -7.01F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[151].setRotationPoint(-51F, 6F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[152].setRotationPoint(-51F, 7F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[153].setRotationPoint(-51F, 5F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[154].setRotationPoint(-50F, 5F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[155].setRotationPoint(-50F, 5F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[156].setRotationPoint(48F, 5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[157].setRotationPoint(48F, 5F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake cull
		bodyModel[158].setRotationPoint(-20F, -24F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[159].setRotationPoint(-50F, 6F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[160].setRotationPoint(-50F, 6F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[161].setRotationPoint(-48.5F, -0.5F, -4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[162].setRotationPoint(-48.5F, -0.5F, 2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[163].setRotationPoint(47.5F, -0.5F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[164].setRotationPoint(47.5F, -0.5F, 2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 451 front ditchlight U
		bodyModel[165].setRotationPoint(-45.5F, -8F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 454 front ditchlight U
		bodyModel[166].setRotationPoint(-45.5F, -8F, 6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 front headlight N
		bodyModel[167].setRotationPoint(-47.25F, -14F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[168].setRotationPoint(-44.5F, -16.75F, -7F);

		bodyModel[169].addShapeBox(0F, -1F, 0F, 8, 14, 10, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[169].setRotationPoint(-45.5F, -15F, -5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[170].setRotationPoint(-45F, -16F, -11F);

		bodyModel[171].addBox(0F, -1F, 0F, 7, 12, 22, 0F); // Box 35
		bodyModel[171].setRotationPoint(-44F, -13F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[172].setRotationPoint(-45F, -16F, 5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 74 door swing right
		bodyModel[173].setRotationPoint(-46F, -16F, -5F);
		bodyModel[173].rotateAngleY = 0.2443461F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 84
		bodyModel[174].setRotationPoint(-46.5F, -16F, -5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 85
		bodyModel[175].setRotationPoint(-46.5F, -16F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[176].setRotationPoint(-44F, -16F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[177].setRotationPoint(-44F, -16F, 5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 74
		bodyModel[178].setRotationPoint(-47F, -16F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 361
		bodyModel[179].setRotationPoint(-44.5F, -16.75F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 front headlight N
		bodyModel[180].setRotationPoint(-47.25F, -16F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F); // Box 57 nose cope slope
		bodyModel[181].setRotationPoint(-46.76F, -16F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 14, 11, 0F,-2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58 nose cope slope
		bodyModel[182].setRotationPoint(-46.76F, -16F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[183].setRotationPoint(-35F, -21.25F, -11.97F);
		bodyModel[183].rotateAngleX = -0.26179939F;

		bodyModel[184].addBox(0F, 0F, 0F, 6, 7, 2, 0F); // Box 413 cs1
		bodyModel[184].setRotationPoint(-37.6F, -14F, 4F);
		bodyModel[184].rotateAngleY = -0.59341195F;

		bodyModel[185].addBox(0F, 0F, 0F, 11, 5, 22, 0F); // Box 95
		bodyModel[185].setRotationPoint(-37F, -7F, -11F);

		bodyModel[186].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 29
		bodyModel[186].setRotationPoint(-37F, -21F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 32
		bodyModel[187].setRotationPoint(-37F, -21F, 10F);

		bodyModel[188].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 314 door swing left
		bodyModel[188].setRotationPoint(-26.5F, -21F, 7.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[189].setRotationPoint(-42.3F, -22F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[190].setRotationPoint(-42.05F, -21.5F, -0.25F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 481 cull
		bodyModel[191].setRotationPoint(-42.5F, -23F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 11, 2, 14, 0F); // Box 71
		bodyModel[192].setRotationPoint(-37F, -23F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 55
		bodyModel[193].setRotationPoint(-38F, -23F, 7F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 74
		bodyModel[194].setRotationPoint(-38F, -23F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[195].setRotationPoint(-37F, -23F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[196].setRotationPoint(-37F, -23F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 96
		bodyModel[197].setRotationPoint(-40F, -23F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 97
		bodyModel[198].setRotationPoint(-40F, -23F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 137 numberboard cab
		bodyModel[199].setRotationPoint(-38.1F, -23F, 7F);
		bodyModel[199].rotateAngleY = -0.25307274F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 137 numberboard cab
		bodyModel[200].setRotationPoint(-38.1F, -23F, -7F);
		bodyModel[200].rotateAngleY = 0.25307274F;

		bodyModel[201].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 346 door swing right
		bodyModel[201].setRotationPoint(-26.5F, -21F, -7.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[202].setRotationPoint(-38F, -21F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 355
		bodyModel[203].setRotationPoint(-45F, -14F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[204].setRotationPoint(-45F, -14F, 5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, 0F); // Box 359
		bodyModel[205].setRotationPoint(-38F, -21F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[206].setRotationPoint(-38F, -23F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 703 glow marker lights
		bodyModel[207].setRotationPoint(-37.2F, -21F, -10.5F);
		bodyModel[207].rotateAngleX = 0.41887902F;
		bodyModel[207].rotateAngleY = 0.2443461F;

		bodyModel[208].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 704 glow marker lights
		bodyModel[208].setRotationPoint(-37.2F, -21F, 10.5F);
		bodyModel[208].rotateAngleX = -0.41887902F;
		bodyModel[208].rotateAngleY = -0.2443461F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0.26F, 0F, 0F, -0.27F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0.26F, 0F, 0F, -0.27F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 55
		bodyModel[209].setRotationPoint(-38F, -22F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1F, -1.5F, 0F, 0F, -1.5F, 0F, -0.27F, 0F, 0F, 0.26F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F, -0.27F, 0F, 0F, 0.26F, 0F, 0F); // Box 56
		bodyModel[210].setRotationPoint(-38F, -22F, -11F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[211].setRotationPoint(-42.5F, -25.5F, -1F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[212].setRotationPoint(-42.5F, -25.5F, 0.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[213].setRotationPoint(-41.5F, -23.5F, -0.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[214].setRotationPoint(-43.5F, -24.25F, -1.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[215].setRotationPoint(-43F, -24.25F, 0.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[216].setRotationPoint(-44F, -24.5F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[217].setRotationPoint(-34.5F, -24.25F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[218].setRotationPoint(-35F, -20F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[219].setRotationPoint(-35F, -21F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[220].setRotationPoint(-35F, -21F, 11F);
		bodyModel[220].rotateAngleX = 0.26179939F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[221].setRotationPoint(-31F, -24F, -5F);

		bodyModel[222].addBox(0.5F, 0F, 0.5F, 3, 9, 2, 0F); // Box 412 cs1
		bodyModel[222].setRotationPoint(-32.5F, -16F, 0F);
		bodyModel[222].rotateAngleY = -0.19198622F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs1
		bodyModel[223].setRotationPoint(-37.6F, -16F, 4F);
		bodyModel[223].rotateAngleY = -0.59341195F;

		bodyModel[224].addShapeBox(-0.5F, 0F, 0.5F, 4, 2, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[224].setRotationPoint(-32.5F, -18F, 0F);
		bodyModel[224].rotateAngleY = -0.19198622F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[225].setRotationPoint(-42.3F, -23F, -0.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 406 cull backpannel
		bodyModel[226].setRotationPoint(-27F, -21F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[227].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[228].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[229].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[230].setRotationPoint(-38.5F, -24.5F, -1F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 406 hot plate cull
		bodyModel[231].setRotationPoint(-27F, -15F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[232].setRotationPoint(-38.5F, -24F, -1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 311
		bodyModel[233].setRotationPoint(-44F, -1F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[234].setRotationPoint(-43F, -1F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[235].setRotationPoint(-44F, -1F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 369
		bodyModel[236].setRotationPoint(-45F, -9F, -8F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 370
		bodyModel[237].setRotationPoint(-45F, -10F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 371
		bodyModel[238].setRotationPoint(-45F, -10F, -9F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 372
		bodyModel[239].setRotationPoint(-45F, -4F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 376
		bodyModel[240].setRotationPoint(-45F, -4F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 378
		bodyModel[241].setRotationPoint(-45F, -10F, 8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[242].setRotationPoint(-45F, -9F, 7F);

		bodyModel[243].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 380
		bodyModel[243].setRotationPoint(-45F, -10F, 7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[244].setRotationPoint(-44F, -1F, 9F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[245].setRotationPoint(-44F, -1F, 11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[246].setRotationPoint(-43F, -1F, 11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[247].setRotationPoint(-45F, 7F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[248].setRotationPoint(-45F, 4.75F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[249].setRotationPoint(-45F, 0.25F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[250].setRotationPoint(-45F, 2.5F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[251].setRotationPoint(-45F, 7F, 9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[252].setRotationPoint(-45F, 4.75F, 9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[253].setRotationPoint(-45F, 2.5F, 9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[254].setRotationPoint(-45F, 0.25F, 9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 311
		bodyModel[255].setRotationPoint(44F, -1F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 312
		bodyModel[256].setRotationPoint(42F, -1F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 313
		bodyModel[257].setRotationPoint(43F, -1F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 8, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[258].setRotationPoint(44F, -1F, 9F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 382
		bodyModel[259].setRotationPoint(43F, -1F, 11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 383
		bodyModel[260].setRotationPoint(42F, -1F, 11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[261].setRotationPoint(44F, 7F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[262].setRotationPoint(44F, 4.75F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 374
		bodyModel[263].setRotationPoint(44F, 0.25F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 375
		bodyModel[264].setRotationPoint(44F, 2.5F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[265].setRotationPoint(44F, 7F, 9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 385
		bodyModel[266].setRotationPoint(44F, 4.75F, 9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386
		bodyModel[267].setRotationPoint(44F, 2.5F, 9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		bodyModel[268].setRotationPoint(44F, 0.25F, 9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 371
		bodyModel[269].setRotationPoint(45F, -9F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 378
		bodyModel[270].setRotationPoint(45F, -9F, 9F);

		bodyModel[271].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 373
		bodyModel[271].setRotationPoint(45F, -10F, -11F);

		bodyModel[272].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 377
		bodyModel[272].setRotationPoint(45F, -10F, 9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[273].setRotationPoint(-45F, -2F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[274].setRotationPoint(-45F, -2F, 9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 374
		bodyModel[275].setRotationPoint(44F, -2F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		bodyModel[276].setRotationPoint(44F, -2F, 9F);

		bodyModel[277].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 245
		bodyModel[277].setRotationPoint(-18F, -4F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 12, 3, 16, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 117
		bodyModel[278].setRotationPoint(29F, -22F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 16, 24, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 494
		bodyModel[279].setRotationPoint(27F, -14F, 7.51F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 16, 24, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 494
		bodyModel[280].setRotationPoint(27F, -14F, -7.51F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238 sand cap
		bodyModel[281].setRotationPoint(44F, -23.5F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 117
		bodyModel[282].setRotationPoint(26F, -22F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 117
		bodyModel[283].setRotationPoint(26F, -22F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 18, 0, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 494
		bodyModel[284].setRotationPoint(26F, -22.01F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 18, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F); // Box 494
		bodyModel[285].setRotationPoint(26F, -22.01F, 7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 18, 5, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -3F, -0.01F, 0F, -3F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 117
		bodyModel[286].setRotationPoint(26F, -19F, -10.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 18, 5, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -3F, -0.01F, 0F, -3F); // Box 117
		bodyModel[287].setRotationPoint(26F, -19F, 7.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 117
		bodyModel[288].setRotationPoint(33F, -16F, -8.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[289].setRotationPoint(33F, -16F, 7.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[290].setRotationPoint(-18F, -10F, 11.01F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[291].setRotationPoint(-18F, -10F, -11.01F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[292].setRotationPoint(-51.5F, 4F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[293].setRotationPoint(-51F, 6F, 0F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[294].setRotationPoint(-51F, 7F, 0F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 449
		bodyModel[295].setRotationPoint(-51F, 5F, 2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[296].setRotationPoint(-51.5F, 4F, 2F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[297].setRotationPoint(0.5F, -23F, -6.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[298].setRotationPoint(-1F, -23.75F, -5.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[299].setRotationPoint(-2F, -24F, -6.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[300].setRotationPoint(-0.5F, -23.75F, -7.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[301].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[302].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[303].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[304].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[305].setRotationPoint(-34.5F, -23F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[306].setRotationPoint(-34F, -24F, 7.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vents protetors cull
		bodyModel[307].setRotationPoint(27F, -22.7F, -7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.05F, 0F, 1F, -0.05F); // Rear vents protetors cull
		bodyModel[308].setRotationPoint(27F, -22.7F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.05F, 0F, 1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vents protetors cull
		bodyModel[309].setRotationPoint(27F, -22.7F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 16, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vents protetors cull
		bodyModel[310].setRotationPoint(27F, -22.7F, -7.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 455
		bodyModel[311].setRotationPoint(-50F, -2F, -3F);

		bodyModel[312].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 226
		bodyModel[312].setRotationPoint(-50F, -10F, -3F);

		bodyModel[313].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[313].setRotationPoint(-49F, -10F, -7F);

		bodyModel[314].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 229
		bodyModel[314].setRotationPoint(-49F, -10F, 6F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 230
		bodyModel[315].setRotationPoint(-49F, -10F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[316].setRotationPoint(-49F, -10F, 3F);

		bodyModel[317].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 61
		bodyModel[317].setRotationPoint(-48F, -4F, 10F);

		bodyModel[318].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 682
		bodyModel[318].setRotationPoint(-48F, -4F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
		bodyModel[319].setRotationPoint(-48F, -10F, 8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[320].setRotationPoint(-48F, -10F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 front ditchlight L
		bodyModel[321].setRotationPoint(-49.25F, -2F, -9.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
		bodyModel[322].setRotationPoint(-49F, -2F, -9.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
		bodyModel[323].setRotationPoint(-49F, -2F, 7.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 front ditchlight L
		bodyModel[324].setRotationPoint(-49.25F, -2F, 7.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 307
		bodyModel[325].setRotationPoint(-50F, -2F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F); // Box 308
		bodyModel[326].setRotationPoint(-50F, -2F, 3F);

		bodyModel[327].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 362
		bodyModel[327].setRotationPoint(-49F, -10F, -8F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[328].setRotationPoint(-49F, -9F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[329].setRotationPoint(-49F, -9F, 7F);

		bodyModel[330].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 365
		bodyModel[330].setRotationPoint(-49F, -10F, 7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 18, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 494
		bodyModel[331].setRotationPoint(26F, -22.01F, -8F);

		bodyModel[332].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 684
		bodyModel[332].setRotationPoint(48F, -4F, 10F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 685
		bodyModel[333].setRotationPoint(48F, -4F, -11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[334].setRotationPoint(49F, -4F, -5.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[335].setRotationPoint(49.25F, -4F, -5.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[336].setRotationPoint(49.25F, -4F, 3.75F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[337].setRotationPoint(49F, -4F, 3.75F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 292
		bodyModel[338].setRotationPoint(48F, -2F, -3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 293
		bodyModel[339].setRotationPoint(48F, -2F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Box 294
		bodyModel[340].setRotationPoint(48F, -2F, 3F);

		bodyModel[341].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 295
		bodyModel[341].setRotationPoint(50F, -10F, -3F);

		bodyModel[342].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 296
		bodyModel[342].setRotationPoint(49F, -10F, -7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 297
		bodyModel[343].setRotationPoint(49F, -10F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[344].setRotationPoint(49F, -10F, 3F);

		bodyModel[345].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 299
		bodyModel[345].setRotationPoint(49F, -10F, 6F);

		bodyModel[346].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 300
		bodyModel[346].setRotationPoint(49F, -10F, 7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[347].setRotationPoint(49F, -9F, 7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 302
		bodyModel[348].setRotationPoint(48F, -10F, 8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[349].setRotationPoint(48F, -10F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 304
		bodyModel[350].setRotationPoint(49F, -9F, -8F);

		bodyModel[351].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 305
		bodyModel[351].setRotationPoint(49F, -10F, -8F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[352].setRotationPoint(-11.5F, 0.75F, 8.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[353].setRotationPoint(-11.5F, -0.25F, 8.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[354].setRotationPoint(-11.25F, 1.25F, 8.75F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[355].setRotationPoint(-11.5F, -1.25F, 8F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[356].setRotationPoint(7.5F, 3F, -10.75F);
		bodyModel[356].rotateAngleX = -0.17453293F;

		bodyModel[357].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[357].setRotationPoint(8F, 3F, -10.75F);
		bodyModel[357].rotateAngleX = -0.9424778F;

		bodyModel[358].addShapeBox(0F, -0.5F, -4F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[358].setRotationPoint(8F, 3F, 10.75F);
		bodyModel[358].rotateAngleX = 0.9424778F;

		bodyModel[359].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 377
		bodyModel[359].setRotationPoint(7.5F, 3F, 10.75F);
		bodyModel[359].rotateAngleX = 0.17453293F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 378
		bodyModel[360].setRotationPoint(-6.5F, 4.5F, -10.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[361].setRotationPoint(-6.5F, 4.5F, 8.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 9, 3, 4, 0F); // Box 384 fncc engine oil sump
		bodyModel[362].setRotationPoint(0F, -0.5F, 6F);

		bodyModel[363].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 385 fncc engine oil sump cull
		bodyModel[363].setRotationPoint(-4F, -1F, 6F);
		bodyModel[363].rotateAngleZ = -0.2443461F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 front headlight U
		bodyModel[364].setRotationPoint(-40.25F, -23.25F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 249 front headlight U
		bodyModel[365].setRotationPoint(-40.25F, -23.25F, -2F);

		bodyModel[366].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 250
		bodyModel[366].setRotationPoint(-40F, -23.25F, -2F);
	}
	ModelMLW_3axle_Hiad boger = new ModelMLW_3axle_Hiad();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity ,f5);

		if (GetColor(entity) == 6 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/MLW_3_axle_hiad_FNCC_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			boger.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			boger.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/MLW_3_axle_hiad_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			boger.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			boger.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/MLW_3_axle_hiad_Blacc.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			boger.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			boger.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}