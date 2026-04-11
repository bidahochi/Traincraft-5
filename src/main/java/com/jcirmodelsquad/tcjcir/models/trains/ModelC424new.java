//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: C424-425
// Model Creator: Bidah
// Created on: 22.05.2022 - 22:34:30
// Last changed on: 22.05.2022 - 22:34:30

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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
import train.common.api.Locomotive;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelC424new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelC424new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[403];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 238, 127, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[3] = new ModelRendererTurbo(this, 450, 127, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 10, 112, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 5, 135, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 59, 142, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 61, 140, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Box 87
		bodyModel[10] = new ModelRendererTurbo(this, 66, 142, textureX, textureY); // Box 88
		bodyModel[11] = new ModelRendererTurbo(this, 11, 145, textureX, textureY); // Box 132
		bodyModel[12] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 133
		bodyModel[13] = new ModelRendererTurbo(this, 60, 136, textureX, textureY); // Box 278
		bodyModel[14] = new ModelRendererTurbo(this, 60, 134, textureX, textureY); // Box 279
		bodyModel[15] = new ModelRendererTurbo(this, 61, 140, textureX, textureY); // Box 301
		bodyModel[16] = new ModelRendererTurbo(this, 59, 142, textureX, textureY); // Box 302
		bodyModel[17] = new ModelRendererTurbo(this, 68, 140, textureX, textureY); // Box 314
		bodyModel[18] = new ModelRendererTurbo(this, 66, 142, textureX, textureY); // Box 315
		bodyModel[19] = new ModelRendererTurbo(this, 463, 164, textureX, textureY); // Box 307
		bodyModel[20] = new ModelRendererTurbo(this, 485, 164, textureX, textureY); // Box 308
		bodyModel[21] = new ModelRendererTurbo(this, 277, 91, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 261, 93, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 274, 90, textureX, textureY); // Box 66
		bodyModel[25] = new ModelRendererTurbo(this, 259, 114, textureX, textureY); // Box 67
		bodyModel[26] = new ModelRendererTurbo(this, 264, 117, textureX, textureY); // Box 205
		bodyModel[27] = new ModelRendererTurbo(this, 277, 113, textureX, textureY); // Box 206
		bodyModel[28] = new ModelRendererTurbo(this, 386, 124, textureX, textureY); // Box 201
		bodyModel[29] = new ModelRendererTurbo(this, 343, 85, textureX, textureY); // Box 245
		bodyModel[30] = new ModelRendererTurbo(this, 326, 81, textureX, textureY); // Box 246
		bodyModel[31] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 62
		bodyModel[32] = new ModelRendererTurbo(this, 259, 130, textureX, textureY); // Box 23
		bodyModel[33] = new ModelRendererTurbo(this, 258, 146, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 317, 121, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 328, 121, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 69
		bodyModel[37] = new ModelRendererTurbo(this, 263, 91, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 8, 130, textureX, textureY); // Box 71
		bodyModel[39] = new ModelRendererTurbo(this, 7, 133, textureX, textureY); // Box 72
		bodyModel[40] = new ModelRendererTurbo(this, 236, 92, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[41] = new ModelRendererTurbo(this, 256, 134, textureX, textureY); // Box 115
		bodyModel[42] = new ModelRendererTurbo(this, 245, 130, textureX, textureY); // Box 141
		bodyModel[43] = new ModelRendererTurbo(this, 256, 125, textureX, textureY); // Box 141
		bodyModel[44] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 386, 124, textureX, textureY); // Box 318
		bodyModel[46] = new ModelRendererTurbo(this, 281, 119, textureX, textureY); // Box 179
		bodyModel[47] = new ModelRendererTurbo(this, 351, 81, textureX, textureY); // Box 180
		bodyModel[48] = new ModelRendererTurbo(this, 360, 121, textureX, textureY); // Box 181
		bodyModel[49] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 182
		bodyModel[50] = new ModelRendererTurbo(this, 360, 125, textureX, textureY); // Box 183
		bodyModel[51] = new ModelRendererTurbo(this, 360, 81, textureX, textureY); // Box 184
		bodyModel[52] = new ModelRendererTurbo(this, 351, 85, textureX, textureY); // Box 185
		bodyModel[53] = new ModelRendererTurbo(this, 457, 154, textureX, textureY); // Box 186
		bodyModel[54] = new ModelRendererTurbo(this, 60, 138, textureX, textureY); // Box 187
		bodyModel[55] = new ModelRendererTurbo(this, 60, 136, textureX, textureY); // Box 188
		bodyModel[56] = new ModelRendererTurbo(this, 60, 134, textureX, textureY); // Box 189
		bodyModel[57] = new ModelRendererTurbo(this, 460, 149, textureX, textureY); // Box 190
		bodyModel[58] = new ModelRendererTurbo(this, 459, 152, textureX, textureY); // Box 191
		bodyModel[59] = new ModelRendererTurbo(this, 429, 91, textureX, textureY); // Box 192
		bodyModel[60] = new ModelRendererTurbo(this, 462, 131, textureX, textureY); // Box 193
		bodyModel[61] = new ModelRendererTurbo(this, 55, 135, textureX, textureY); // Box 196
		bodyModel[62] = new ModelRendererTurbo(this, 67, 134, textureX, textureY); // Box 197
		bodyModel[63] = new ModelRendererTurbo(this, 67, 136, textureX, textureY); // Box 198
		bodyModel[64] = new ModelRendererTurbo(this, 67, 138, textureX, textureY); // Box 199
		bodyModel[65] = new ModelRendererTurbo(this, 55, 133, textureX, textureY); // Box 200
		bodyModel[66] = new ModelRendererTurbo(this, 54, 130, textureX, textureY); // Box 201
		bodyModel[67] = new ModelRendererTurbo(this, 67, 138, textureX, textureY); // Box 202
		bodyModel[68] = new ModelRendererTurbo(this, 507, 154, textureX, textureY); // Box 203
		bodyModel[69] = new ModelRendererTurbo(this, 67, 136, textureX, textureY); // Box 204
		bodyModel[70] = new ModelRendererTurbo(this, 67, 134, textureX, textureY); // Box 205
		bodyModel[71] = new ModelRendererTurbo(this, 506, 149, textureX, textureY); // Box 206
		bodyModel[72] = new ModelRendererTurbo(this, 507, 152, textureX, textureY); // Box 207
		bodyModel[73] = new ModelRendererTurbo(this, 266, 115, textureX, textureY); // Box 208
		bodyModel[74] = new ModelRendererTurbo(this, 426, 115, textureX, textureY); // Box 209
		bodyModel[75] = new ModelRendererTurbo(this, 422, 117, textureX, textureY); // Box 210
		bodyModel[76] = new ModelRendererTurbo(this, 435, 114, textureX, textureY); // Box 211
		bodyModel[77] = new ModelRendererTurbo(this, 425, 93, textureX, textureY); // Box 213
		bodyModel[78] = new ModelRendererTurbo(this, 420, 90, textureX, textureY); // Box 214
		bodyModel[79] = new ModelRendererTurbo(this, 314, 161, textureX, textureY); // Box 178 tank main
		bodyModel[80] = new ModelRendererTurbo(this, 316, 184, textureX, textureY); // Box 385 tank main
		bodyModel[81] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 14, 92, textureX, textureY); // Box 25
		bodyModel[83] = new ModelRendererTurbo(this, 1, 80, textureX, textureY); // Box 56
		bodyModel[84] = new ModelRendererTurbo(this, 14, 73, textureX, textureY); // Box 26
		bodyModel[85] = new ModelRendererTurbo(this, 44, 73, textureX, textureY); // Box 27
		bodyModel[86] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 28
		bodyModel[87] = new ModelRendererTurbo(this, 25, 80, textureX, textureY); // Box 63
		bodyModel[88] = new ModelRendererTurbo(this, 39, 80, textureX, textureY); // Box 64
		bodyModel[89] = new ModelRendererTurbo(this, 111, 60, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 104, 53, textureX, textureY); // Box 132
		bodyModel[91] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 135
		bodyModel[92] = new ModelRendererTurbo(this, 86, 38, textureX, textureY); // Box 195 door swing left
		bodyModel[93] = new ModelRendererTurbo(this, 14, 21, textureX, textureY); // Box 29
		bodyModel[94] = new ModelRendererTurbo(this, 39, 21, textureX, textureY); // Box 32
		bodyModel[95] = new ModelRendererTurbo(this, 65, 39, textureX, textureY); // Box 406
		bodyModel[96] = new ModelRendererTurbo(this, 136, 60, textureX, textureY); // Box 416
		bodyModel[97] = new ModelRendererTurbo(this, 104, 38, textureX, textureY); // Box 57
		bodyModel[98] = new ModelRendererTurbo(this, 111, 34, textureX, textureY); // Box 58
		bodyModel[99] = new ModelRendererTurbo(this, 45, 52, textureX, textureY); // Box 295
		bodyModel[100] = new ModelRendererTurbo(this, 136, 34, textureX, textureY); // Box 297
		bodyModel[101] = new ModelRendererTurbo(this, 69, 32, textureX, textureY); // Box 298
		bodyModel[102] = new ModelRendererTurbo(this, 68, 48, textureX, textureY); // Box 299
		bodyModel[103] = new ModelRendererTurbo(this, 69, 40, textureX, textureY); // Box 300
		bodyModel[104] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 315 door swing left
		bodyModel[105] = new ModelRendererTurbo(this, 37, 35, textureX, textureY); // Box 71
		bodyModel[106] = new ModelRendererTurbo(this, 5, 23, textureX, textureY, "lamp"); // Box 87 headlight front vertical
		bodyModel[107] = new ModelRendererTurbo(this, 5, 28, textureX, textureY, "lamp"); // Box 88 headlight front vertical
		bodyModel[108] = new ModelRendererTurbo(this, 104, 64, textureX, textureY); // Box 120
		bodyModel[109] = new ModelRendererTurbo(this, 104, 60, textureX, textureY); // Box 121
		bodyModel[110] = new ModelRendererTurbo(this, 282, 45, textureX, textureY); // Box 2 hood
		bodyModel[111] = new ModelRendererTurbo(this, 308, 11, textureX, textureY); // Box 496
		bodyModel[112] = new ModelRendererTurbo(this, 308, 24, textureX, textureY); // Box 497
		bodyModel[113] = new ModelRendererTurbo(this, 309, 18, textureX, textureY); // Box 498
		bodyModel[114] = new ModelRendererTurbo(this, 464, 38, textureX, textureY); // Box 490
		bodyModel[115] = new ModelRendererTurbo(this, 491, 1, textureX, textureY); // Box 502
		bodyModel[116] = new ModelRendererTurbo(this, 495, 12, textureX, textureY); // Box 503
		bodyModel[117] = new ModelRendererTurbo(this, 481, 26, textureX, textureY); // Box 504
		bodyModel[118] = new ModelRendererTurbo(this, 478, 12, textureX, textureY); // Box 156
		bodyModel[119] = new ModelRendererTurbo(this, 506, 25, textureX, textureY); // Box 158
		bodyModel[120] = new ModelRendererTurbo(this, 496, 23, textureX, textureY); // Box 159
		bodyModel[121] = new ModelRendererTurbo(this, 468, 18, textureX, textureY); // Box 160
		bodyModel[122] = new ModelRendererTurbo(this, 466, 20, textureX, textureY); // Box 161
		bodyModel[123] = new ModelRendererTurbo(this, 477, 12, textureX, textureY, "lamp"); // Box 162 headlight r
		bodyModel[124] = new ModelRendererTurbo(this, 477, 5, textureX, textureY, "lamp"); // Box 163 headlight r
		bodyModel[125] = new ModelRendererTurbo(this, 468, 25, textureX, textureY); // Box 1523
		bodyModel[126] = new ModelRendererTurbo(this, 464, 26, textureX, textureY, "lamp"); // Box 1526 markerlight
		bodyModel[127] = new ModelRendererTurbo(this, 503, 31, textureX, textureY, "lamp"); // Box 1527 markerlight
		bodyModel[128] = new ModelRendererTurbo(this, 463, 3, textureX, textureY, "lamp"); // Box 302 numberboard
		bodyModel[129] = new ModelRendererTurbo(this, 463, 3, textureX, textureY, "lamp"); // Box 303 numberboard
		bodyModel[130] = new ModelRendererTurbo(this, 471, 25, textureX, textureY); // Box 304
		bodyModel[131] = new ModelRendererTurbo(this, 495, 4, textureX, textureY); // Box 155
		bodyModel[132] = new ModelRendererTurbo(this, 478, 4, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 424, 20, textureX, textureY); // Box 117
		bodyModel[134] = new ModelRendererTurbo(this, 424, 52, textureX, textureY); // Box 494
		bodyModel[135] = new ModelRendererTurbo(this, 422, 26, textureX, textureY, "cull"); // Box 500 cull
		bodyModel[136] = new ModelRendererTurbo(this, 410, 67, textureX, textureY); // Box 493 424 radiator compartment
		bodyModel[137] = new ModelRendererTurbo(this, 430, 125, textureX, textureY); // Box 426
		bodyModel[138] = new ModelRendererTurbo(this, 430, 134, textureX, textureY); // Box 427
		bodyModel[139] = new ModelRendererTurbo(this, 439, 130, textureX, textureY); // Box 428
		bodyModel[140] = new ModelRendererTurbo(this, 287, 16, textureX, textureY); // Box 230
		bodyModel[141] = new ModelRendererTurbo(this, 290, 24, textureX, textureY); // Box 231
		bodyModel[142] = new ModelRendererTurbo(this, 290, 11, textureX, textureY); // Box 232
		bodyModel[143] = new ModelRendererTurbo(this, 390, 16, textureX, textureY); // Box 233
		bodyModel[144] = new ModelRendererTurbo(this, 388, 11, textureX, textureY); // Box 234
		bodyModel[145] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 235
		bodyModel[146] = new ModelRendererTurbo(this, 394, 40, textureX, textureY); // Box 236 stack
		bodyModel[147] = new ModelRendererTurbo(this, 394, 35, textureX, textureY); // Box 438 brc stack
		bodyModel[148] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 439
		bodyModel[149] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 442
		bodyModel[150] = new ModelRendererTurbo(this, 51, 103, textureX, textureY); // Box 443
		bodyModel[151] = new ModelRendererTurbo(this, 94, 128, textureX, textureY); // Box 70
		bodyModel[152] = new ModelRendererTurbo(this, 60, 103, textureX, textureY); // Box 445
		bodyModel[153] = new ModelRendererTurbo(this, 37, 101, textureX, textureY); // Box 446
		bodyModel[154] = new ModelRendererTurbo(this, 37, 89, textureX, textureY); // Box 43
		bodyModel[155] = new ModelRendererTurbo(this, 37, 92, textureX, textureY); // Box 43
		bodyModel[156] = new ModelRendererTurbo(this, 41, 34, textureX, textureY); // Box 194 backbit for vertical headlight
		bodyModel[157] = new ModelRendererTurbo(this, 33, 37, textureX, textureY, "lamp"); // Box 117 numberboard f
		bodyModel[158] = new ModelRendererTurbo(this, 33, 37, textureX, textureY, "lamp"); // Box 197 numberboard f
		bodyModel[159] = new ModelRendererTurbo(this, 9, 33, textureX, textureY, "lamp"); // Box 284 headlight front horizontal
		bodyModel[160] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "lamp"); // Box 285 headlight front horizontal
		bodyModel[161] = new ModelRendererTurbo(this, 26, 41, textureX, textureY); // Box 204 backbit for horizontal headlight
		bodyModel[162] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 205
		bodyModel[163] = new ModelRendererTurbo(this, 51, 39, textureX, textureY); // Box 206
		bodyModel[164] = new ModelRendererTurbo(this, 10, 44, textureX, textureY); // Box 207
		bodyModel[165] = new ModelRendererTurbo(this, 104, 34, textureX, textureY); // Box 208
		bodyModel[166] = new ModelRendererTurbo(this, 104, 29, textureX, textureY); // Box 209 door swing left
		bodyModel[167] = new ModelRendererTurbo(this, 163, 54, textureX, textureY); // Box 114
		bodyModel[168] = new ModelRendererTurbo(this, 163, 54, textureX, textureY); // Box 74
		bodyModel[169] = new ModelRendererTurbo(this, 163, 57, textureX, textureY); // Box 78
		bodyModel[170] = new ModelRendererTurbo(this, 161, 50, textureX, textureY, "cull"); // Box 875 cull bell holder
		bodyModel[171] = new ModelRendererTurbo(this, 12, 39, textureX, textureY, "lamp"); // Box 216 classlights
		bodyModel[172] = new ModelRendererTurbo(this, 53, 34, textureX, textureY, "lamp"); // Box 217 classlights
		bodyModel[173] = new ModelRendererTurbo(this, 152, 46, textureX, textureY); // Box 327
		bodyModel[174] = new ModelRendererTurbo(this, 154, 43, textureX, textureY); // Box 328
		bodyModel[175] = new ModelRendererTurbo(this, 154, 49, textureX, textureY); // Box 329
		bodyModel[176] = new ModelRendererTurbo(this, 163, 47, textureX, textureY); // Box 330
		bodyModel[177] = new ModelRendererTurbo(this, 145, 44, textureX, textureY); // Box 331
		bodyModel[178] = new ModelRendererTurbo(this, 145, 47, textureX, textureY); // Box 332
		bodyModel[179] = new ModelRendererTurbo(this, 16, 34, textureX, textureY); // Box 224
		bodyModel[180] = new ModelRendererTurbo(this, 25, 34, textureX, textureY); // Box 225
		bodyModel[181] = new ModelRendererTurbo(this, 163, 34, textureX, textureY); // Box 226
		bodyModel[182] = new ModelRendererTurbo(this, 154, 31, textureX, textureY); // Box 227
		bodyModel[183] = new ModelRendererTurbo(this, 152, 37, textureX, textureY); // Box 228
		bodyModel[184] = new ModelRendererTurbo(this, 154, 34, textureX, textureY); // Box 229
		bodyModel[185] = new ModelRendererTurbo(this, 161, 38, textureX, textureY, "cull"); // Box 230 cull horn holder
		bodyModel[186] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 231
		bodyModel[187] = new ModelRendererTurbo(this, 59, 37, textureX, textureY); // Box 232
		bodyModel[188] = new ModelRendererTurbo(this, 78, 15, textureX, textureY); // Box 233
		bodyModel[189] = new ModelRendererTurbo(this, 64, 16, textureX, textureY); // Box 234
		bodyModel[190] = new ModelRendererTurbo(this, 78, 136, textureX, textureY); // Box 236 steppe
		bodyModel[191] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 237
		bodyModel[192] = new ModelRendererTurbo(this, 104, 135, textureX, textureY); // Box 238
		bodyModel[193] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 240
		bodyModel[194] = new ModelRendererTurbo(this, 68, 69, textureX, textureY); // Box 241
		bodyModel[195] = new ModelRendererTurbo(this, 92, 73, textureX, textureY); // Box 242
		bodyModel[196] = new ModelRendererTurbo(this, 108, 159, textureX, textureY); // Box 243
		bodyModel[197] = new ModelRendererTurbo(this, 108, 166, textureX, textureY); // Box 244
		bodyModel[198] = new ModelRendererTurbo(this, 123, 164, textureX, textureY); // Box 245
		bodyModel[199] = new ModelRendererTurbo(this, 90, 166, textureX, textureY); // Box 246
		bodyModel[200] = new ModelRendererTurbo(this, 116, 136, textureX, textureY); // Box 247
		bodyModel[201] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 238
		bodyModel[202] = new ModelRendererTurbo(this, 6, 82, textureX, textureY, "lamp"); // Box 448 headlight front n
		bodyModel[203] = new ModelRendererTurbo(this, 6, 87, textureX, textureY, "lamp"); // Box 449 headlight front n
		bodyModel[204] = new ModelRendererTurbo(this, 16, 87, textureX, textureY, "lamp"); // Box 451 headlight front rock
		bodyModel[205] = new ModelRendererTurbo(this, 16, 87, textureX, textureY, "lamp"); // Box 454 headlight front rock
		bodyModel[206] = new ModelRendererTurbo(this, 78, 163, textureX, textureY); // Box 253
		bodyModel[207] = new ModelRendererTurbo(this, 85, 135, textureX, textureY); // Box 254
		bodyModel[208] = new ModelRendererTurbo(this, 118, 163, textureX, textureY); // Box 255
		bodyModel[209] = new ModelRendererTurbo(this, 109, 29, textureX, textureY); // Box 225
		bodyModel[210] = new ModelRendererTurbo(this, 109, 64, textureX, textureY); // Box 226
		bodyModel[211] = new ModelRendererTurbo(this, 370, 161, textureX, textureY); // Box 563
		bodyModel[212] = new ModelRendererTurbo(this, 399, 161, textureX, textureY); // Box 229
		bodyModel[213] = new ModelRendererTurbo(this, 390, 168, textureX, textureY); // Box 230
		bodyModel[214] = new ModelRendererTurbo(this, 351, 121, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[215] = new ModelRendererTurbo(this, 280, 168, textureX, textureY); // Box 355
		bodyModel[216] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 356
		bodyModel[217] = new ModelRendererTurbo(this, 302, 161, textureX, textureY); // Box 357
		bodyModel[218] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 114
		bodyModel[219] = new ModelRendererTurbo(this, 146, 57, textureX, textureY); // Box 74
		bodyModel[220] = new ModelRendererTurbo(this, 146, 60, textureX, textureY); // Box 78
		bodyModel[221] = new ModelRendererTurbo(this, 145, 53, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[222] = new ModelRendererTurbo(this, 281, 86, textureX, textureY); // Box 362
		bodyModel[223] = new ModelRendererTurbo(this, 496, 30, textureX, textureY); // Box 363
		bodyModel[224] = new ModelRendererTurbo(this, 425, 14, textureX, textureY); // Box 493 425 radiator bit
		bodyModel[225] = new ModelRendererTurbo(this, 433, 11, textureX, textureY); // Box 251 425 radiator bit
		bodyModel[226] = new ModelRendererTurbo(this, 425, 58, textureX, textureY); // Box 493 425 radiator bit
		bodyModel[227] = new ModelRendererTurbo(this, 433, 64, textureX, textureY); // Box 251 425 radiator bit
		bodyModel[228] = new ModelRendererTurbo(this, 290, 187, textureX, textureY); // Box 564
		bodyModel[229] = new ModelRendererTurbo(this, 316, 170, textureX, textureY); // Box 370
		bodyModel[230] = new ModelRendererTurbo(this, 376, 170, textureX, textureY); // Box 371
		bodyModel[231] = new ModelRendererTurbo(this, 317, 173, textureX, textureY); // Box 372
		bodyModel[232] = new ModelRendererTurbo(this, 377, 173, textureX, textureY); // Box 373
		bodyModel[233] = new ModelRendererTurbo(this, 322, 168, textureX, textureY); // Box 374
		bodyModel[234] = new ModelRendererTurbo(this, 324, 172, textureX, textureY); // Box 375
		bodyModel[235] = new ModelRendererTurbo(this, 370, 172, textureX, textureY); // Box 376
		bodyModel[236] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 377
		bodyModel[237] = new ModelRendererTurbo(this, 280, 179, textureX, textureY); // Box 378
		bodyModel[238] = new ModelRendererTurbo(this, 390, 179, textureX, textureY); // Box 379
		bodyModel[239] = new ModelRendererTurbo(this, 368, 187, textureX, textureY); // Box 380
		bodyModel[240] = new ModelRendererTurbo(this, 314, 195, textureX, textureY); // Box 381
		bodyModel[241] = new ModelRendererTurbo(this, 295, 195, textureX, textureY); // Box 382
		bodyModel[242] = new ModelRendererTurbo(this, 387, 195, textureX, textureY); // Box 383
		bodyModel[243] = new ModelRendererTurbo(this, 368, 195, textureX, textureY); // Box 384
		bodyModel[244] = new ModelRendererTurbo(this, 430, 92, textureX, textureY, "cull"); // Box 259 cull
		bodyModel[245] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 261 tank extra
		bodyModel[246] = new ModelRendererTurbo(this, 294, 168, textureX, textureY); // Box 262 tank extra
		bodyModel[247] = new ModelRendererTurbo(this, 149, 79, textureX, textureY); // Box 413 cs
		bodyModel[248] = new ModelRendererTurbo(this, 167, 73, textureX, textureY); // Box 327 cs
		bodyModel[249] = new ModelRendererTurbo(this, 140, 81, textureX, textureY); // Box 328 cs
		bodyModel[250] = new ModelRendererTurbo(this, 140, 71, textureX, textureY); // Box 263 cs
		bodyModel[251] = new ModelRendererTurbo(this, 140, 67, textureX, textureY, "cull"); // Box 264 cs cull
		bodyModel[252] = new ModelRendererTurbo(this, 55, 80, textureX, textureY); // Box 265
		bodyModel[253] = new ModelRendererTurbo(this, 132, 64, textureX, textureY); // Box 266 door swing left
		bodyModel[254] = new ModelRendererTurbo(this, 351, 1, textureX, textureY); // Box 501 dynamics
		bodyModel[255] = new ModelRendererTurbo(this, 313, 2, textureX, textureY); // Box 268
		bodyModel[256] = new ModelRendererTurbo(this, 188, 58, textureX, textureY); // Box 327
		bodyModel[257] = new ModelRendererTurbo(this, 190, 55, textureX, textureY); // Box 328
		bodyModel[258] = new ModelRendererTurbo(this, 190, 61, textureX, textureY); // Box 329
		bodyModel[259] = new ModelRendererTurbo(this, 199, 58, textureX, textureY); // Box 330
		bodyModel[260] = new ModelRendererTurbo(this, 40, 10, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[261] = new ModelRendererTurbo(this, 42, 5, textureX, textureY); // Box 5
		bodyModel[262] = new ModelRendererTurbo(this, 18, 5, textureX, textureY); // Box 304
		bodyModel[263] = new ModelRendererTurbo(this, 16, 10, textureX, textureY, "cull"); // Box 311 cull
		bodyModel[264] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // box64
		bodyModel[265] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // box65
		bodyModel[266] = new ModelRendererTurbo(this, 62, 2, textureX, textureY); // Box 184 o2 generator
		bodyModel[267] = new ModelRendererTurbo(this, 173, 49, textureX, textureY); // Box 278
		bodyModel[268] = new ModelRendererTurbo(this, 173, 46, textureX, textureY); // Box 279
		bodyModel[269] = new ModelRendererTurbo(this, 171, 43, textureX, textureY); // Box 280
		bodyModel[270] = new ModelRendererTurbo(this, 182, 46, textureX, textureY); // Box 281
		bodyModel[271] = new ModelRendererTurbo(this, 140, 20, textureX, textureY); // Box 446
		bodyModel[272] = new ModelRendererTurbo(this, 79, 168, textureX, textureY); // Box 285 geeman cube
		bodyModel[273] = new ModelRendererTurbo(this, 173, 58, textureX, textureY); // Box 286
		bodyModel[274] = new ModelRendererTurbo(this, 171, 55, textureX, textureY); // Box 287
		bodyModel[275] = new ModelRendererTurbo(this, 173, 61, textureX, textureY); // Box 288
		bodyModel[276] = new ModelRendererTurbo(this, 182, 58, textureX, textureY); // Box 289
		bodyModel[277] = new ModelRendererTurbo(this, 150, 20, textureX, textureY); // Box 290
		bodyModel[278] = new ModelRendererTurbo(this, 158, 23, textureX, textureY); // Box 409 commander base
		bodyModel[279] = new ModelRendererTurbo(this, 158, 19, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[280] = new ModelRendererTurbo(this, 153, 23, textureX, textureY); // Box 293beacon base
		bodyModel[281] = new ModelRendererTurbo(this, 153, 19, textureX, textureY, "commander"); // Box 294 commander beacon
		bodyModel[282] = new ModelRendererTurbo(this, 163, 23, textureX, textureY); // Box 295
		bodyModel[283] = new ModelRendererTurbo(this, 163, 19, textureX, textureY, "commander"); // Box 296 commander beacon
		bodyModel[284] = new ModelRendererTurbo(this, 143, 20, textureX, textureY); // Box 287
		bodyModel[285] = new ModelRendererTurbo(this, 173, 37, textureX, textureY); // Box 292
		bodyModel[286] = new ModelRendererTurbo(this, 175, 34, textureX, textureY); // Box 293
		bodyModel[287] = new ModelRendererTurbo(this, 179, 37, textureX, textureY); // Box 294
		bodyModel[288] = new ModelRendererTurbo(this, 173, 31, textureX, textureY); // Box 295
		bodyModel[289] = new ModelRendererTurbo(this, 190, 46, textureX, textureY); // Box 319
		bodyModel[290] = new ModelRendererTurbo(this, 199, 46, textureX, textureY); // Box 320
		bodyModel[291] = new ModelRendererTurbo(this, 190, 43, textureX, textureY); // Box 321
		bodyModel[292] = new ModelRendererTurbo(this, 192, 49, textureX, textureY); // Box 322
		bodyModel[293] = new ModelRendererTurbo(this, 407, 32, textureX, textureY); // Box 304
		bodyModel[294] = new ModelRendererTurbo(this, 254, 31, textureX, textureY, "cull"); // Box 305 cull hood reverse bit
		bodyModel[295] = new ModelRendererTurbo(this, 248, 16, textureX, textureY); // Box 306 im special intake
		bodyModel[296] = new ModelRendererTurbo(this, 255, 101, textureX, textureY); // Box 307
		bodyModel[297] = new ModelRendererTurbo(this, 435, 101, textureX, textureY); // Box 309
		bodyModel[298] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[299] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[300] = new ModelRendererTurbo(this, 477, 164, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[301] = new ModelRendererTurbo(this, 485, 164, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[302] = new ModelRendererTurbo(this, 476, 88, textureX, textureY); // Box 494
		bodyModel[303] = new ModelRendererTurbo(this, 476, 69, textureX, textureY); // Box 494
		bodyModel[304] = new ModelRendererTurbo(this, 341, 121, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[305] = new ModelRendererTurbo(this, 124, 153, textureX, textureY); // Box 206
		bodyModel[306] = new ModelRendererTurbo(this, 118, 126, textureX, textureY); // Box 206
		bodyModel[307] = new ModelRendererTurbo(this, 227, 125, textureX, textureY); // Box 186
		bodyModel[308] = new ModelRendererTurbo(this, 221, 152, textureX, textureY); // Box 186
		bodyModel[309] = new ModelRendererTurbo(this, 239, 60, textureX, textureY); // Box 305
		bodyModel[310] = new ModelRendererTurbo(this, 239, 69, textureX, textureY); // Box 305
		bodyModel[311] = new ModelRendererTurbo(this, 83, 16, textureX, textureY); // Box 234
		bodyModel[312] = new ModelRendererTurbo(this, 109, 127, textureX, textureY); // Box 206
		bodyModel[313] = new ModelRendererTurbo(this, 79, 122, textureX, textureY); // Box 206
		bodyModel[314] = new ModelRendererTurbo(this, 79, 150, textureX, textureY); // Box 206
		bodyModel[315] = new ModelRendererTurbo(this, 115, 155, textureX, textureY); // Box 206
		bodyModel[316] = new ModelRendererTurbo(this, 259, 52, textureX, textureY, "cull"); // Box 305 snow cover cull
		bodyModel[317] = new ModelRendererTurbo(this, 259, 56, textureX, textureY, "cull"); // Box 305 snow cover cull
		bodyModel[318] = new ModelRendererTurbo(this, 76, 150, textureX, textureY); // Box 186
		bodyModel[319] = new ModelRendererTurbo(this, 86, 148, textureX, textureY); // Box 206
		bodyModel[320] = new ModelRendererTurbo(this, 76, 122, textureX, textureY); // Box 186
		bodyModel[321] = new ModelRendererTurbo(this, 79, 120, textureX, textureY); // Box 206
		bodyModel[322] = new ModelRendererTurbo(this, 87, 120, textureX, textureY); // Box 206
		bodyModel[323] = new ModelRendererTurbo(this, 119, 153, textureX, textureY); // Box 206
		bodyModel[324] = new ModelRendererTurbo(this, 113, 125, textureX, textureY); // Box 206
		bodyModel[325] = new ModelRendererTurbo(this, 11, 123, textureX, textureY); // Box 186
		bodyModel[326] = new ModelRendererTurbo(this, 14, 105, textureX, textureY); // Box 186
		bodyModel[327] = new ModelRendererTurbo(this, 14, 119, textureX, textureY); // Box 186
		bodyModel[328] = new ModelRendererTurbo(this, 51, 123, textureX, textureY); // Box 186
		bodyModel[329] = new ModelRendererTurbo(this, 48, 119, textureX, textureY); // Box 186
		bodyModel[330] = new ModelRendererTurbo(this, 463, 142, textureX, textureY); // Box 186
		bodyModel[331] = new ModelRendererTurbo(this, 466, 124, textureX, textureY); // Box 186
		bodyModel[332] = new ModelRendererTurbo(this, 503, 142, textureX, textureY); // Box 186
		bodyModel[333] = new ModelRendererTurbo(this, 466, 138, textureX, textureY); // Box 186
		bodyModel[334] = new ModelRendererTurbo(this, 500, 138, textureX, textureY); // Box 186
		bodyModel[335] = new ModelRendererTurbo(this, 137, 20, textureX, textureY); // Box 345
		bodyModel[336] = new ModelRendererTurbo(this, 2, 190, textureX, textureY); // Box 282
		bodyModel[337] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 283
		bodyModel[338] = new ModelRendererTurbo(this, 2, 178, textureX, textureY); // Box 4
		bodyModel[339] = new ModelRendererTurbo(this, 4, 167, textureX, textureY); // Box 448
		bodyModel[340] = new ModelRendererTurbo(this, 17, 181, textureX, textureY); // Box 322
		bodyModel[341] = new ModelRendererTurbo(this, 19, 170, textureX, textureY); // Box 323
		bodyModel[342] = new ModelRendererTurbo(this, 4, 157, textureX, textureY); // Box 280
		bodyModel[343] = new ModelRendererTurbo(this, 19, 159, textureX, textureY); // Box 285
		bodyModel[344] = new ModelRendererTurbo(this, 449, 102, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[345] = new ModelRendererTurbo(this, 237, 102, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[346] = new ModelRendererTurbo(this, 169, 18, textureX, textureY, "prime1"); // Box 6 PRIME5-1
		bodyModel[347] = new ModelRendererTurbo(this, 169, 18, textureX, textureY, "prime3"); // Box 7 PRIME5-3
		bodyModel[348] = new ModelRendererTurbo(this, 169, 18, textureX, textureY, "prime2"); // Box 8 PRIME5-2
		bodyModel[349] = new ModelRendererTurbo(this, 169, 18, textureX, textureY, "prime4"); // Box 9 PRIME5-4
		bodyModel[350] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 428 prime base
		bodyModel[351] = new ModelRendererTurbo(this, 19, 159, textureX, textureY); // Box 361
		bodyModel[352] = new ModelRendererTurbo(this, 430, 145, textureX, textureY); // Box 362
		bodyModel[353] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, "ditch"); // Box 621 low ditchlight f
		bodyModel[354] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[355] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, "ditch"); // Box 623 low ditchlight f
		bodyModel[356] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[357] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, "ditch"); // Box 625 low ditchlight r
		bodyModel[358] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, "ditch"); // Box 626 low ditchlight r
		bodyModel[359] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[360] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[361] = new ModelRendererTurbo(this, 465, 176, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[362] = new ModelRendererTurbo(this, 487, 176, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[363] = new ModelRendererTurbo(this, 478, 176, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[364] = new ModelRendererTurbo(this, 47, 158, textureX, textureY, "cull"); // Box 453 cull
		bodyModel[365] = new ModelRendererTurbo(this, 47, 173, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[366] = new ModelRendererTurbo(this, 49, 167, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[367] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 24
		bodyModel[368] = new ModelRendererTurbo(this, 17, 206, textureX, textureY); // Box 25
		bodyModel[369] = new ModelRendererTurbo(this, 31, 157, textureX, textureY, "ditch"); // Box 621 low ditchlight f2
		bodyModel[370] = new ModelRendererTurbo(this, 31, 162, textureX, textureY); // Box 622
		bodyModel[371] = new ModelRendererTurbo(this, 31, 157, textureX, textureY, "ditch"); // Box 621 low ditchlight f2
		bodyModel[372] = new ModelRendererTurbo(this, 31, 162, textureX, textureY); // Box 622
		bodyModel[373] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 78
		bodyModel[374] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 188
		bodyModel[375] = new ModelRendererTurbo(this, 1, 155, textureX, textureY, "ditch"); // Box 189 ditchlight f
		bodyModel[376] = new ModelRendererTurbo(this, 1, 155, textureX, textureY, "ditch"); // Box 190 ditchlight f
		bodyModel[377] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 78
		bodyModel[378] = new ModelRendererTurbo(this, 444, 175, textureX, textureY); // Box 188
		bodyModel[379] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, "ditch"); // Box 189 ditchlight r
		bodyModel[380] = new ModelRendererTurbo(this, 451, 175, textureX, textureY, "ditch"); // Box 190 ditchlight r
		bodyModel[381] = new ModelRendererTurbo(this, 250, 211, textureX, textureY); // Box 391
		bodyModel[382] = new ModelRendererTurbo(this, 237, 208, textureX, textureY); // Box 392
		bodyModel[383] = new ModelRendererTurbo(this, 237, 196, textureX, textureY); // Box 393
		bodyModel[384] = new ModelRendererTurbo(this, 250, 198, textureX, textureY); // Box 394
		bodyModel[385] = new ModelRendererTurbo(this, 252, 187, textureX, textureY); // Box 395
		bodyModel[386] = new ModelRendererTurbo(this, 252, 176, textureX, textureY); // Box 396
		bodyModel[387] = new ModelRendererTurbo(this, 239, 184, textureX, textureY); // Box 397
		bodyModel[388] = new ModelRendererTurbo(this, 239, 174, textureX, textureY); // Box 398
		bodyModel[389] = new ModelRendererTurbo(this, 178, 22, textureX, textureY); // Box 389 CNW walks into a bar and goes ding
		bodyModel[390] = new ModelRendererTurbo(this, 199, 34, textureX, textureY); // Box 226
		bodyModel[391] = new ModelRendererTurbo(this, 190, 31, textureX, textureY); // Box 227
		bodyModel[392] = new ModelRendererTurbo(this, 188, 37, textureX, textureY); // Box 228
		bodyModel[393] = new ModelRendererTurbo(this, 190, 34, textureX, textureY); // Box 229
		bodyModel[394] = new ModelRendererTurbo(this, 190, 24, textureX, textureY); // Box 394
		bodyModel[395] = new ModelRendererTurbo(this, 190, 21, textureX, textureY); // Box 395
		bodyModel[396] = new ModelRendererTurbo(this, 190, 27, textureX, textureY); // Box 396
		bodyModel[397] = new ModelRendererTurbo(this, 197, 24, textureX, textureY); // Box 397
		bodyModel[398] = new ModelRendererTurbo(this, 134, 137, textureX, textureY); // Box 398 ph3 battery boxes
		bodyModel[399] = new ModelRendererTurbo(this, 167, 137, textureX, textureY); // Box 399 ph3 battery box
		bodyModel[400] = new ModelRendererTurbo(this, 6, 71, textureX, textureY); // Box 336 fncc gyra housing top
		bodyModel[401] = new ModelRendererTurbo(this, 3, 70, textureX, textureY, "prime1"); // Box 337 Front Gyralight L top
		bodyModel[402] = new ModelRendererTurbo(this, 3, 70, textureX, textureY, "prime1"); // Box 338 Front Gyralight R top

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43.5F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-40.5F, 2.5F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[2].setRotationPoint(40.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[3].setRotationPoint(39.5F, 2.5F, -2.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 6
		bodyModel[4].setRotationPoint(-39.5F, -1F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 8
		bodyModel[5].setRotationPoint(-36.5F, 1F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 13
		bodyModel[6].setRotationPoint(-39.5F, 8F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 14
		bodyModel[7].setRotationPoint(-39.5F, 5.75F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 20
		bodyModel[8].setRotationPoint(-39.5F, 7F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 87
		bodyModel[9].setRotationPoint(-39.5F, 7F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 88
		bodyModel[10].setRotationPoint(-39.5F, 8F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[11].setRotationPoint(-41.5F, 6F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[12].setRotationPoint(-41.5F, 6F, 0F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 278
		bodyModel[13].setRotationPoint(-39.5F, 3.5F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 279
		bodyModel[14].setRotationPoint(-39.5F, 1.25F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 301
		bodyModel[15].setRotationPoint(36.5F, 7F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 302
		bodyModel[16].setRotationPoint(36.5F, 8F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 314
		bodyModel[17].setRotationPoint(36.5F, 7F, 9F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 315
		bodyModel[18].setRotationPoint(36.5F, 8F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[19].setRotationPoint(39.5F, 6F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[20].setRotationPoint(39.5F, 6F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 69, 1, 4, 0F); // Box 0
		bodyModel[21].setRotationPoint(-34.5F, -1F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 4
		bodyModel[22].setRotationPoint(-39.5F, -1F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 79, 1, 14, 0F); // Box 52
		bodyModel[23].setRotationPoint(-39.5F, -1F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[24].setRotationPoint(-35.5F, -1F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		bodyModel[25].setRotationPoint(-35.5F, -1F, 9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 205
		bodyModel[26].setRotationPoint(-39.5F, -1F, 7F);

		bodyModel[27].addBox(0F, 0F, 0F, 69, 1, 4, 0F); // Box 206
		bodyModel[27].setRotationPoint(-34.5F, -1F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[28].setRotationPoint(-24.5F, 3F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 245
		bodyModel[29].setRotationPoint(-23.5F, 0F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
		bodyModel[30].setRotationPoint(-24F, 0F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[31].setRotationPoint(-24F, 2.5F, -6.75F);

		bodyModel[32].addBox(0F, 0F, 0F, 79, 3, 12, 0F); // Box 23
		bodyModel[32].setRotationPoint(-39.5F, 0F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 79, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[33].setRotationPoint(-39.5F, 3F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 67
		bodyModel[34].setRotationPoint(-24F, 0F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[35].setRotationPoint(-24F, 2.5F, 5.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 69
		bodyModel[36].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 70
		bodyModel[37].setRotationPoint(-39.5F, 0F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[38].setRotationPoint(-36.5F, -1F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[39].setRotationPoint(-39.5F, -1F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 455 cull
		bodyModel[40].setRotationPoint(-40.5F, -1F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[41].setRotationPoint(-37.5F, 5F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 141
		bodyModel[42].setRotationPoint(-39.5F, 3F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 141
		bodyModel[43].setRotationPoint(-37.5F, 3F, -3F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 53
		bodyModel[44].setRotationPoint(-23.5F, 0F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
		bodyModel[45].setRotationPoint(20.5F, 3F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 179
		bodyModel[46].setRotationPoint(-34.5F, 0F, 11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[47].setRotationPoint(21F, 2.5F, -6.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[48].setRotationPoint(21F, 2.5F, 5.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F); // Box 182
		bodyModel[49].setRotationPoint(21F, 0F, 6F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 183
		bodyModel[50].setRotationPoint(21.5F, 0F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 184
		bodyModel[51].setRotationPoint(21F, 0F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 185
		bodyModel[52].setRotationPoint(21.5F, 0F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 186
		bodyModel[53].setRotationPoint(36.5F, 1F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 187
		bodyModel[54].setRotationPoint(36.5F, 5.75F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 188
		bodyModel[55].setRotationPoint(36.5F, 3.5F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 189
		bodyModel[56].setRotationPoint(36.5F, 1.25F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[57].setRotationPoint(36.5F, -1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[58].setRotationPoint(39.5F, -1F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 192
		bodyModel[59].setRotationPoint(35.5F, 0F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 193
		bodyModel[60].setRotationPoint(39.5F, -1F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 196
		bodyModel[61].setRotationPoint(-36.5F, 1F, 9F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 197
		bodyModel[62].setRotationPoint(-39.5F, 1.25F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 198
		bodyModel[63].setRotationPoint(-39.5F, 3.5F, 9F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[64].setRotationPoint(-39.5F, 5.75F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[65].setRotationPoint(-39.5F, -1F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[66].setRotationPoint(-36.5F, -1F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 202
		bodyModel[67].setRotationPoint(36.5F, 5.75F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 203
		bodyModel[68].setRotationPoint(36.5F, 1F, 9F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 204
		bodyModel[69].setRotationPoint(36.5F, 3.5F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 205
		bodyModel[70].setRotationPoint(36.5F, 1.25F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[71].setRotationPoint(36.5F, -1F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[72].setRotationPoint(39.5F, -1F, 9F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 208
		bodyModel[73].setRotationPoint(-39.5F, 0F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 209
		bodyModel[74].setRotationPoint(35.5F, 0F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 210
		bodyModel[75].setRotationPoint(34.5F, -1F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[76].setRotationPoint(34.5F, -1F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 213
		bodyModel[77].setRotationPoint(34.5F, -1F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[78].setRotationPoint(34.5F, -1F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 19, 5, 17, 0F); // Box 178 tank main
		bodyModel[79].setRotationPoint(-9.5F, 3F, -8.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 17, 1, 17, 0F); // Box 385 tank main
		bodyModel[80].setRotationPoint(-8.5F, 8F, -8.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 11, 5, 22, 0F); // Box 95
		bodyModel[81].setRotationPoint(-28.5F, -6F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 12, 14, 0F); // Box 25
		bodyModel[82].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 56
		bodyModel[83].setRotationPoint(-37.5F, -13F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[84].setRotationPoint(-36.5F, -14F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[85].setRotationPoint(-36.5F, -14F, 2F);

		bodyModel[86].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 28
		bodyModel[86].setRotationPoint(-37.5F, -14F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[87].setRotationPoint(-37.5F, -14F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[88].setRotationPoint(-37.5F, -14F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[89].setRotationPoint(-28.5F, -21F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[90].setRotationPoint(-29.5F, -23F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[91].setRotationPoint(-30.5F, -23F, -3F);

		bodyModel[92].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 195 door swing left
		bodyModel[92].setRotationPoint(-18F, -20F, 7.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 29
		bodyModel[93].setRotationPoint(-29.5F, -17F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 32
		bodyModel[94].setRotationPoint(-29.5F, -17F, 10F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 406
		bodyModel[95].setRotationPoint(-18.5F, -17F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[96].setRotationPoint(-18.5F, -21F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[97].setRotationPoint(-29.5F, -23F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[98].setRotationPoint(-28.5F, -21F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Box 295
		bodyModel[99].setRotationPoint(-18.5F, -20F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[100].setRotationPoint(-18.5F, -21F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[101].setRotationPoint(-18.5F, -22F, 3F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 299
		bodyModel[102].setRotationPoint(-18.5F, -22F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[103].setRotationPoint(-18.5F, -22F, -8F);

		bodyModel[104].addShapeBox(0.5F, 0F, -3.5F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, 1.1F, 0F, 0F); // Box 315 door swing left
		bodyModel[104].setRotationPoint(-30F, -20F, -7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 22, 11, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[105].setRotationPoint(-29.5F, -23F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 87 headlight front vertical
		bodyModel[106].setRotationPoint(-33.25F, -22.25F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 88 headlight front vertical
		bodyModel[107].setRotationPoint(-33.25F, -20.25F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.274F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.274F, 0F, -1F, 0.274F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[108].setRotationPoint(-29.5F, -20F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.82F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.272F, -1F, 0F, 0.82F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.272F, 0F, 0F); // Box 121
		bodyModel[109].setRotationPoint(-29.5F, -21F, 8F);

		bodyModel[110].addBox(0F, 0F, 0F, 53, 20, 14, 0F); // Box 2 hood
		bodyModel[110].setRotationPoint(-17.5F, -21F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 37, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[111].setRotationPoint(-17.5F, -22F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 37, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[112].setRotationPoint(-17.5F, -22F, 2F);

		bodyModel[113].addBox(0F, 0F, 0F, 37, 1, 4, 0F); // Box 498
		bodyModel[113].setRotationPoint(-17.5F, -22F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 490
		bodyModel[114].setRotationPoint(35.5F, -14F, -7F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 502
		bodyModel[115].setRotationPoint(35.5F, -22F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[116].setRotationPoint(35.5F, -21F, 1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		bodyModel[117].setRotationPoint(36.5F, -14F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[118].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[119].setRotationPoint(35.5F, -17F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 159
		bodyModel[120].setRotationPoint(35.5F, -17F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[121].setRotationPoint(35.5F, -17F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 161
		bodyModel[122].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 headlight r
		bodyModel[123].setRotationPoint(36.75F, -19F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight r
		bodyModel[124].setRotationPoint(36.75F, -21F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 1523
		bodyModel[125].setRotationPoint(35.5F, -16F, -5F);

		bodyModel[126].addShapeBox(-1F, 0F, -0.5F, 2, 2, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 1526 markerlight
		bodyModel[126].setRotationPoint(36.5F, -16F, -6F);
		bodyModel[126].rotateAngleY = 0.78539816F;

		bodyModel[127].addShapeBox(-1F, 0F, -0.5F, 2, 2, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 1527 markerlight
		bodyModel[127].setRotationPoint(36.5F, -16F, 6F);
		bodyModel[127].rotateAngleY = -0.78539816F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -1.65F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -1.65F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 302 numberboard
		bodyModel[128].setRotationPoint(36.5F, -20F, 1.5F);

		bodyModel[129].addShapeBox(0F, 0F, -6F, 1, 2, 5, 0F,2F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 303 numberboard
		bodyModel[129].setRotationPoint(36.5F, -20F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F); // Box 304
		bodyModel[130].setRotationPoint(35.5F, -16F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[131].setRotationPoint(35.5F, -22F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[132].setRotationPoint(35.5F, -22F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[133].setRotationPoint(19.5F, -21F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 494
		bodyModel[134].setRotationPoint(19.5F, -21F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 500 cull
		bodyModel[135].setRotationPoint(19.5F, -22.25F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 493 424 radiator compartment
		bodyModel[136].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 426
		bodyModel[137].setRotationPoint(36.5F, 3F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 427
		bodyModel[138].setRotationPoint(36.5F, 5F, -3F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 428
		bodyModel[139].setRotationPoint(37.5F, 3F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 230
		bodyModel[140].setRotationPoint(-15.5F, -22.5F, -2F);

		bodyModel[141].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 231
		bodyModel[141].setRotationPoint(-15.5F, -22.5F, 2F);
		bodyModel[141].rotateAngleX = -0.19198622F;

		bodyModel[142].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 232
		bodyModel[142].setRotationPoint(-15.5F, -22.5F, -2F);
		bodyModel[142].rotateAngleX = 0.19198622F;

		bodyModel[143].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 233
		bodyModel[143].setRotationPoint(10.5F, -22.5F, -2F);

		bodyModel[144].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 234
		bodyModel[144].setRotationPoint(10.5F, -22.5F, -2F);
		bodyModel[144].rotateAngleX = 0.19198622F;

		bodyModel[145].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 235
		bodyModel[145].setRotationPoint(10.5F, -22.5F, 2F);
		bodyModel[145].rotateAngleX = -0.19198622F;

		bodyModel[146].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 236 stack
		bodyModel[146].setRotationPoint(12F, -22.75F, -1.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438 brc stack
		bodyModel[147].setRotationPoint(12F, -23.75F, -1.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // Box 439
		bodyModel[148].setRotationPoint(-32.5F, -13F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[149].setRotationPoint(-32.5F, -14F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F,0F, -0.6F, 0F, -0.25F, -0.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[150].setRotationPoint(-31.5F, -14F, -5F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 70
		bodyModel[151].setRotationPoint(-30.5F, -6F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[152].setRotationPoint(-32.5F, -13F, -7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[153].setRotationPoint(-32.5F, -14F, -7F);

		bodyModel[154].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[154].setRotationPoint(-31.5F, -13.5F, -6.25F);
		bodyModel[154].rotateAngleY = -1.27409035F;

		bodyModel[155].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[155].setRotationPoint(-31.5F, -11.5F, -6.25F);
		bodyModel[155].rotateAngleY = -1.27409035F;

		bodyModel[156].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 194 backbit for vertical headlight
		bodyModel[156].setRotationPoint(-32.22F, -23F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.15F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.15F, 0F, 0F); // Box 117 numberboard f
		bodyModel[157].setRotationPoint(-30.9F, -20.5F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1.15F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1.15F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 197 numberboard f
		bodyModel[158].setRotationPoint(-30.9F, -20.5F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight front horizontal
		bodyModel[159].setRotationPoint(-32.25F, -20.5F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 headlight front horizontal
		bodyModel[160].setRotationPoint(-32.25F, -20.5F, 0F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 204 backbit for horizontal headlight
		bodyModel[161].setRotationPoint(-31.95F, -23F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 205
		bodyModel[162].setRotationPoint(-29.5F, -23F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.181F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, -1.18F, -1.5F, 0F, 0.181F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.18F, 0.5F, 0F); // Box 206
		bodyModel[163].setRotationPoint(-31.5F, -23F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.18F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, 0.181F, 0F, 0F, -1.18F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.181F, 0.5F, 0F); // Box 207
		bodyModel[164].setRotationPoint(-31.5F, -23F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.272F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.82F, 0.5F, 0F, 0.272F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.82F, 0F, 0F); // Box 208
		bodyModel[165].setRotationPoint(-29.5F, -21F, -10F);

		bodyModel[166].addShapeBox(0.5F, 0F, -3.5F, 1, 3, 1, 0F,0.274F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.274F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.274F, 0F, 0F); // Box 209 door swing left
		bodyModel[166].setRotationPoint(-30F, -20F, -7.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[167].setRotationPoint(-33.98F, -21.5F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[168].setRotationPoint(-33.98F, -22.5F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[169].setRotationPoint(-33.73F, -21F, -0.25F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 875 cull bell holder
		bodyModel[170].setRotationPoint(-33.98F, -22.5F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0.055F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.85F, 0F, 0F, 0.055F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.85F, 0F, 0F); // Box 216 classlights
		bodyModel[171].setRotationPoint(-30.92F, -21.5F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,0.85F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F, 0.85F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F); // Box 217 classlights
		bodyModel[172].setRotationPoint(-30.92F, -21.5F, 7F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[173].setRotationPoint(-36F, -24.5F, -0.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[174].setRotationPoint(-35F, -24.25F, 0.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[175].setRotationPoint(-35.5F, -24.25F, -1.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[176].setRotationPoint(-33.5F, -23.5F, -0.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[177].setRotationPoint(-34.5F, -25.5F, 0.25F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[178].setRotationPoint(-34.5F, -25.5F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[179].setRotationPoint(-31.5F, -23.01F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.825F, 0F, 0F); // Box 225
		bodyModel[180].setRotationPoint(-31.5F, -23.01F, 0F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 226
		bodyModel[181].setRotationPoint(-33.5F, -22.5F, -0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227
		bodyModel[182].setRotationPoint(-35.5F, -23.25F, 0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 228
		bodyModel[183].setRotationPoint(-36F, -23.25F, -1.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 229
		bodyModel[184].setRotationPoint(-35F, -23.5F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F); // Box 230 cull horn holder
		bodyModel[185].setRotationPoint(-33.95F, -21.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.18F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.181F, -0.5F, 0F, -1.18F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.181F, 0F, 0F); // Box 231
		bodyModel[186].setRotationPoint(-31.5F, -22F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.181F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.18F, -0.5F, 0F, 0.181F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.18F, 0F, 0F); // Box 232
		bodyModel[187].setRotationPoint(-31.5F, -22F, 3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F); // Box 233
		bodyModel[188].setRotationPoint(-31F, -22F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F); // Box 234
		bodyModel[189].setRotationPoint(-31F, -22F, 2F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 236 steppe
		bodyModel[190].setRotationPoint(-33.5F, -6F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 237
		bodyModel[191].setRotationPoint(-33.5F, -4F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 238
		bodyModel[192].setRotationPoint(-31.5F, -6F, -11F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 240
		bodyModel[193].setRotationPoint(-33.5F, -6F, 7F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 5, 14, 0F); // Box 241
		bodyModel[194].setRotationPoint(-32.5F, -6F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 242
		bodyModel[195].setRotationPoint(-29.5F, -6F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[196].setRotationPoint(-15.5F, -6F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[197].setRotationPoint(-15.5F, -4F, 7F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 245
		bodyModel[198].setRotationPoint(-17.5F, -6F, 7F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 246
		bodyModel[199].setRotationPoint(-33.5F, -4F, 7F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 247
		bodyModel[200].setRotationPoint(-17.5F, -6F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[201].setRotationPoint(-37.5F, -14.5F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 448 headlight front n
		bodyModel[202].setRotationPoint(-38F, -13.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 449 headlight front n
		bodyModel[203].setRotationPoint(-38F, -11.5F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 451 headlight front rock
		bodyModel[204].setRotationPoint(-38F, -7F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 454 headlight front rock
		bodyModel[205].setRotationPoint(-38F, -7F, 4F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 253
		bodyModel[206].setRotationPoint(-35F, -4F, 7F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 254
		bodyModel[207].setRotationPoint(-35F, -4F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 255
		bodyModel[208].setRotationPoint(-14F, -4F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[209].setRotationPoint(-28.5F, -20F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[210].setRotationPoint(-28.5F, -20F, 10F);

		bodyModel[211].addShapeBox(0F, -1.5F, -1.5F, 11, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[211].setRotationPoint(-12F, 1.3F, 9F);
		bodyModel[211].rotateAngleX = 0.78539816F;

		bodyModel[212].addShapeBox(0F, -1.5F, -1.5F, 11, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 229
		bodyModel[212].setRotationPoint(1F, 1.3F, 9F);
		bodyModel[212].rotateAngleX = 0.78539816F;

		bodyModel[213].addShapeBox(0F, -1.5F, -1.5F, 12, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 230
		bodyModel[213].setRotationPoint(-6F, 1.3F, 9F);
		bodyModel[213].rotateAngleX = 0.78539816F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[214].setRotationPoint(-9F, 0F, 8.5F);

		bodyModel[215].addShapeBox(0F, -1.5F, -1.5F, 12, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 355
		bodyModel[215].setRotationPoint(-6F, 1.3F, -9F);
		bodyModel[215].rotateAngleX = 0.78539816F;

		bodyModel[216].addShapeBox(0F, -1.5F, -1.5F, 11, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356
		bodyModel[216].setRotationPoint(-12F, 1.3F, -9F);
		bodyModel[216].rotateAngleX = 0.78539816F;

		bodyModel[217].addShapeBox(0F, -1.5F, -1.5F, 11, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 357
		bodyModel[217].setRotationPoint(1F, 1.3F, -9F);
		bodyModel[217].rotateAngleX = 0.78539816F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[218].setRotationPoint(-16.5F, 1.75F, 8.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[219].setRotationPoint(-16.5F, 0.75F, 8.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[220].setRotationPoint(-16.25F, 2.25F, 8.75F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[221].setRotationPoint(-16.5F, -0.25F, 8F);

		bodyModel[222].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 362
		bodyModel[222].setRotationPoint(-32F, 0F, -10F);
		bodyModel[222].rotateAngleZ = -0.31415927F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[223].setRotationPoint(35.5F, -16F, 5F);

		bodyModel[224].addBox(0F, 0F, 0F, 16, 4, 1, 0F); // Box 493 425 radiator bit
		bodyModel[224].setRotationPoint(19.5F, -18F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 251 425 radiator bit
		bodyModel[225].setRotationPoint(24.5F, -14F, -8F);

		bodyModel[226].addBox(0F, 0F, 0F, 16, 4, 1, 0F); // Box 493 425 radiator bit
		bodyModel[226].setRotationPoint(19.5F, -18F, 7F);

		bodyModel[227].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 251 425 radiator bit
		bodyModel[227].setRotationPoint(24.5F, -14F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 564
		bodyModel[228].setRotationPoint(-9.5F, 4.5F, -10.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 370
		bodyModel[229].setRotationPoint(-0.5F, 3F, -10.75F);
		bodyModel[229].rotateAngleX = -0.17453293F;

		bodyModel[230].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 371
		bodyModel[230].setRotationPoint(-0.5F, 3F, 10.75F);
		bodyModel[230].rotateAngleX = 0.17453293F;

		bodyModel[231].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[231].setRotationPoint(0F, 3F, -10.75F);
		bodyModel[231].rotateAngleX = -0.9424778F;

		bodyModel[232].addShapeBox(0F, -0.5F, -4F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 373
		bodyModel[232].setRotationPoint(0F, 3F, 10.75F);
		bodyModel[232].rotateAngleX = 0.9424778F;

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[233].setRotationPoint(7.5F, 3F, -10.75F);
		bodyModel[233].rotateAngleX = -0.17453293F;

		bodyModel[234].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[234].setRotationPoint(8F, 3F, -10.75F);
		bodyModel[234].rotateAngleX = -0.9424778F;

		bodyModel[235].addShapeBox(0F, -0.5F, -4F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[235].setRotationPoint(8F, 3F, 10.75F);
		bodyModel[235].rotateAngleX = 0.9424778F;

		bodyModel[236].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 377
		bodyModel[236].setRotationPoint(7.5F, 3F, 10.75F);
		bodyModel[236].rotateAngleX = 0.17453293F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 378
		bodyModel[237].setRotationPoint(-6.5F, 4.5F, -10.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[238].setRotationPoint(-6.5F, 4.5F, 8.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[239].setRotationPoint(-9.5F, 4.5F, 8.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381
		bodyModel[240].setRotationPoint(-8.5F, 4.5F, -10.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 382
		bodyModel[241].setRotationPoint(1.5F, 4.5F, -10.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[242].setRotationPoint(1.5F, 4.5F, 8.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[243].setRotationPoint(-8.5F, 4.5F, 8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 259 cull
		bodyModel[244].setRotationPoint(39.5F, -1F, -8F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 261 tank extra
		bodyModel[245].setRotationPoint(-9.5F, 8F, -8.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 262 tank extra
		bodyModel[246].setRotationPoint(8.5F, 8F, -8.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 8, 8, 3, 0F); // Box 413 cs
		bodyModel[247].setRotationPoint(-31F, -13F, 1F);
		bodyModel[247].rotateAngleY = -0.4712389F;

		bodyModel[248].addBox(5F, 0F, 0F, 3, 2, 3, 0F); // Box 327 cs
		bodyModel[248].setRotationPoint(-31F, -15F, 1F);
		bodyModel[248].rotateAngleY = -0.4712389F;

		bodyModel[249].addShapeBox(0F, 0F, 3F, 3, 8, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328 cs
		bodyModel[249].setRotationPoint(-31F, -13F, 1F);
		bodyModel[249].rotateAngleY = -0.4712389F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 263 cs
		bodyModel[250].setRotationPoint(-31F, -15F, 1F);
		bodyModel[250].rotateAngleY = -0.4712389F;

		bodyModel[251].addShapeBox(0F, 0F, 3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264 cs cull
		bodyModel[251].setRotationPoint(-31F, -15F, 1F);
		bodyModel[251].rotateAngleY = -0.4712389F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[252].setRotationPoint(-31.5F, -13F, 2F);

		bodyModel[253].addShapeBox(-0.5F, 0F, 2.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266 door swing left
		bodyModel[253].setRotationPoint(-18F, -20F, 7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501 dynamics
		bodyModel[254].setRotationPoint(-6.5F, -23F, -3F);

		bodyModel[255].addBox(0F, 0F, 0F, 15, 1, 7, 0F); // Box 268
		bodyModel[255].setRotationPoint(-6.5F, -22F, -3.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[256].setRotationPoint(3F, -23F, -6.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[257].setRotationPoint(4F, -22.75F, -5.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[258].setRotationPoint(3.5F, -22.75F, -7.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[259].setRotationPoint(5.5F, -22F, -6.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[260].setRotationPoint(-26.5F, -17F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[261].setRotationPoint(-26.5F, -18F, 10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[262].setRotationPoint(-26.5F, -18F, -13F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[263].setRotationPoint(-26.5F, -17F, -15F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[264].setRotationPoint(-27F, -17F, 11F);
		bodyModel[264].rotateAngleX = 0.43633231F;

		bodyModel[265].addShapeBox(0F, 0F, -1F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[265].setRotationPoint(-27F, -17F, -11F);
		bodyModel[265].rotateAngleX = -0.43633231F;

		bodyModel[266].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[266].setRotationPoint(-26.5F, -24.75F, -4F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[267].setRotationPoint(-33F, -24.5F, -1.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[268].setRotationPoint(-32F, -24.5F, -0.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[269].setRotationPoint(-34F, -24.5F, 0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 281
		bodyModel[270].setRotationPoint(-31F, -23.5F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[271].setRotationPoint(-30F, -25F, 0F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 285 geeman cube
		bodyModel[272].setRotationPoint(-31F, -3F, 7F);

		bodyModel[273].addBox(-1.5F, 0F, -0.5F, 3, 1, 1, 0F); // Box 286
		bodyModel[273].setRotationPoint(-23F, -21.5F, -10.25F);
		bodyModel[273].rotateAngleX = 0.61086524F;

		bodyModel[274].addBox(-3.5F, 0F, 0.5F, 4, 1, 1, 0F); // Box 287
		bodyModel[274].setRotationPoint(-23F, -21.5F, -10.25F);
		bodyModel[274].rotateAngleX = 0.61086524F;

		bodyModel[275].addBox(-2.5F, 0F, -1.5F, 3, 1, 1, 0F); // Box 288
		bodyModel[275].setRotationPoint(-23F, -21.5F, -10.25F);
		bodyModel[275].rotateAngleX = 0.61086524F;

		bodyModel[276].addBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F); // Box 289
		bodyModel[276].setRotationPoint(-23F, -21.5F, -10.25F);
		bodyModel[276].rotateAngleX = 0.61086524F;

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 290
		bodyModel[277].setRotationPoint(-19F, -25F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[278].setRotationPoint(-24F, -24F, -0.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[279].setRotationPoint(-24F, -25F, -0.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 293beacon base
		bodyModel[280].setRotationPoint(-31.5F, -24F, -0.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 294 commander beacon
		bodyModel[281].setRotationPoint(-31.5F, -25F, -0.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 295
		bodyModel[282].setRotationPoint(36F, -23F, -0.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 296 commander beacon
		bodyModel[283].setRotationPoint(36F, -24F, -0.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[284].setRotationPoint(-24.5F, -23F, 6F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 292
		bodyModel[285].setRotationPoint(-31.5F, -23F, 7F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[286].setRotationPoint(-30.5F, -22.5F, 8F);

		bodyModel[287].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 294
		bodyModel[287].setRotationPoint(-29.55F, -21F, 10F);
		bodyModel[287].rotateAngleX = -0.48869219F;

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[288].setRotationPoint(-30.5F, -22F, 9F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 319
		bodyModel[289].setRotationPoint(7.5F, -25F, -0.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 320
		bodyModel[290].setRotationPoint(9.5F, -24F, -0.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 321
		bodyModel[291].setRotationPoint(7.5F, -24.5F, 0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 322
		bodyModel[292].setRotationPoint(8.5F, -24.5F, -1.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 17, 1, 17, 0F,-0.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 304
		bodyModel[293].setRotationPoint(19.5F, -22F, -8.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 6, 4, 14, 0F); // Box 305 cull hood reverse bit
		bodyModel[294].setRotationPoint(-14.5F, -20F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 306 im special intake
		bodyModel[295].setRotationPoint(-14.5F, -20F, -5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[296].setRotationPoint(-40.5F, -1.01F, -2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[297].setRotationPoint(39.5F, -1.01F, -2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[298].setRotationPoint(-40F, -0.5F, -4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[299].setRotationPoint(-40F, -0.5F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[300].setRotationPoint(39F, -0.5F, -4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[301].setRotationPoint(39F, -0.5F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 16, 18, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 494
		bodyModel[302].setRotationPoint(19.5F, -12F, 7.01F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 16, 18, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 494
		bodyModel[303].setRotationPoint(19.5F, -12F, -7.01F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[304].setRotationPoint(-14.5F, 0F, 8.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 48, 8, 0, 0F); // Box 206
		bodyModel[305].setRotationPoint(-11.5F, -9F, 11F);

		bodyModel[306].addBox(0F, 0F, 0F, 54, 8, 0, 0F); // Box 206
		bodyModel[306].setRotationPoint(-17.5F, -9F, -11F);

		bodyModel[307].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 186
		bodyModel[307].setRotationPoint(36.5F, -9F, -11F);

		bodyModel[308].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 186
		bodyModel[308].setRotationPoint(36.5F, -9F, 10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 12, 8, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -4F, 0F); // Box 305
		bodyModel[309].setRotationPoint(-14.5F, -20F, -7.01F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 12, 8, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, -4F, 0F); // Box 305
		bodyModel[310].setRotationPoint(-14.5F, -20F, 7.01F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-2F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[311].setRotationPoint(-31F, -22F, -10F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 7, 0, 0F); // Box 206
		bodyModel[312].setRotationPoint(-17.5F, -13F, -11F);

		bodyModel[313].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 206
		bodyModel[313].setRotationPoint(-36.5F, -13F, -11F);

		bodyModel[314].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 206
		bodyModel[314].setRotationPoint(-36.5F, -13F, 11F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 7, 0, 0F); // Box 206
		bodyModel[315].setRotationPoint(-17.5F, -13F, 11F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 snow cover cull
		bodyModel[316].setRotationPoint(-14.5F, -20F, -8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 305 snow cover cull
		bodyModel[317].setRotationPoint(-14.5F, -20F, 7F);

		bodyModel[318].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 186
		bodyModel[318].setRotationPoint(-36.5F, -9F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 1.25F, 0F); // Box 206
		bodyModel[319].setRotationPoint(-36.5F, -10F, 11.01F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 186
		bodyModel[320].setRotationPoint(-36.5F, -9F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 1.25F, 0F); // Box 206
		bodyModel[321].setRotationPoint(-36.5F, -10F, -11.01F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.25F, -1F, 0F, 0F, 1F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 1F, 0F); // Box 206
		bodyModel[322].setRotationPoint(-33.5F, -10F, -11.01F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, -1F, 0F, 0.375F, -1F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[323].setRotationPoint(-13.5F, -10F, 11.01F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, -1F, 0F, 0.375F, -1F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[324].setRotationPoint(-13.5F, -10F, -11.01F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,1F, -1F, -2F, -1F, -1F, -2F, -1F, -4F, 1F, 1F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[325].setRotationPoint(-39.5F, -10F, -11F);

		bodyModel[326].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 186
		bodyModel[326].setRotationPoint(-40.5F, -10F, -9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		bodyModel[327].setRotationPoint(-40.5F, -8F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,1F, -4F, 1F, -1F, -4F, 1F, -1F, -1F, -2F, 1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[328].setRotationPoint(-39.5F, -10F, 10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[329].setRotationPoint(-40.5F, -8F, 8F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,-1F, -1F, -2F, 1F, -1F, -2F, 1F, -4F, 1F, -1F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[330].setRotationPoint(39.5F, -10F, -11F);

		bodyModel[331].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 186
		bodyModel[331].setRotationPoint(40.5F, -10F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,-1F, -4F, 1F, 1F, -4F, 1F, 1F, -1F, -2F, -1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[332].setRotationPoint(39.5F, -10F, 10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		bodyModel[333].setRotationPoint(40.5F, -8F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[334].setRotationPoint(40.5F, -8F, 8F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 345
		bodyModel[335].setRotationPoint(-30F, -25F, -3F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[336].setRotationPoint(-43.5F, 7F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[337].setRotationPoint(-43.5F, 7F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[338].setRotationPoint(-42.5F, 6F, 0F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[339].setRotationPoint(-42.5F, 4F, 2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[340].setRotationPoint(-42.5F, 6F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[341].setRotationPoint(-42.5F, 4F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[342].setRotationPoint(-42.5F, 3F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[343].setRotationPoint(-42.5F, 3F, -8F);

		bodyModel[344].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[344].setRotationPoint(40F, -1.1F, 2F);
		bodyModel[344].rotateAngleY = -3.14159265F;
		bodyModel[344].rotateAngleZ = -1.48352986F;

		bodyModel[345].addBox(-3F, 0F, 0F, 3, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[345].setRotationPoint(-40F, -1.1F, -2F);
		bodyModel[345].rotateAngleZ = -1.48352986F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[346].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[347].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[348].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[349].setRotationPoint(-32F, -24.5F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[350].setRotationPoint(-32F, -24F, -1F);

		bodyModel[351].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 361
		bodyModel[351].setRotationPoint(-42.5F, 9F, -10F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 362
		bodyModel[352].setRotationPoint(39.5F, 9F, -10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[353].setRotationPoint(-40.25F, 1F, -6.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[354].setRotationPoint(-40F, 1F, -6.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[355].setRotationPoint(-40.25F, 1F, 4.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[356].setRotationPoint(-40F, 1F, 4.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[357].setRotationPoint(39.25F, 1F, -6.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[358].setRotationPoint(39.25F, 1F, 4.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[359].setRotationPoint(39F, 1F, 4.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[360].setRotationPoint(39F, 1F, -6.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453 cull
		bodyModel[361].setRotationPoint(39.5F, 7F, 3F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455 cull
		bodyModel[362].setRotationPoint(39.5F, 7F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[363].setRotationPoint(39.5F, 8F, -2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453 cull
		bodyModel[364].setRotationPoint(-41.5F, 7F, 3F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455 cull
		bodyModel[365].setRotationPoint(-41.5F, 7F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[366].setRotationPoint(-41.5F, 8F, -2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[367].setRotationPoint(-42.5F, 6F, 0F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[368].setRotationPoint(-42.5F, 6F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f2
		bodyModel[369].setRotationPoint(-40.25F, 0.5F, -8.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[370].setRotationPoint(-40F, 0.5F, -8.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f2
		bodyModel[371].setRotationPoint(-40.25F, 0.5F, 6.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[372].setRotationPoint(-40F, 0.5F, 6.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[373].setRotationPoint(-40.5F, -3F, 4.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[374].setRotationPoint(-40.5F, -3F, -6.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[375].setRotationPoint(-40.75F, -3F, 4.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[376].setRotationPoint(-40.75F, -3F, -6.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 78
		bodyModel[377].setRotationPoint(39.5F, -3F, 4.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		bodyModel[378].setRotationPoint(39.5F, -3F, -6.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 189 ditchlight r
		bodyModel[379].setRotationPoint(39.75F, -3F, 4.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight r
		bodyModel[380].setRotationPoint(39.75F, -3F, -6.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 391
		bodyModel[381].setRotationPoint(42.5F, 7F, 0F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 392
		bodyModel[382].setRotationPoint(42.5F, 7F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 393
		bodyModel[383].setRotationPoint(41.5F, 6F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 394
		bodyModel[384].setRotationPoint(41.5F, 6F, 0F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 395
		bodyModel[385].setRotationPoint(41.5F, 4F, 2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 396
		bodyModel[386].setRotationPoint(41.5F, 3F, 2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[387].setRotationPoint(41.5F, 4F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[388].setRotationPoint(41.5F, 3F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 389 CNW walks into a bar and goes ding
		bodyModel[389].setRotationPoint(-16.5F, -19F, -8F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 226
		bodyModel[390].setRotationPoint(-30F, -22.75F, -6.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227
		bodyModel[391].setRotationPoint(-32F, -23.75F, -5.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 228
		bodyModel[392].setRotationPoint(-32.5F, -23.25F, -7.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 229
		bodyModel[393].setRotationPoint(-30.5F, -23.75F, -6.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 394
		bodyModel[394].setRotationPoint(-33F, -24.75F, 2F);

		bodyModel[395].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 395
		bodyModel[395].setRotationPoint(-33.5F, -24.75F, 3F);

		bodyModel[396].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 396
		bodyModel[396].setRotationPoint(-33.5F, -24.25F, 1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[397].setRotationPoint(-32.5F, -23.75F, 2F);

		bodyModel[398].addBox(0F, 0F, 0F, 11, 3, 5, 0F); // Box 398 ph3 battery boxes
		bodyModel[398].setRotationPoint(9.5F, 0F, -11F);

		bodyModel[399].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 399 ph3 battery box
		bodyModel[399].setRotationPoint(24.5F, 0F, -11F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 fncc gyra housing top
		bodyModel[400].setRotationPoint(-37.75F, -13.5F, -2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L top
		bodyModel[401].setRotationPoint(-38.5F, -13.5F, 0F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R top
		bodyModel[402].setRotationPoint(-38.5F, -13.5F, -2F);
	}
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_DarkGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9||GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.4, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.8, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}