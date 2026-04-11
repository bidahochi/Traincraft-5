//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GM6C
// Model Creator: bidahochi
// Created on: 27.01.2024 - 14:15:13
// Last changed on: 27.01.2024 - 14:15:13

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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
public class ModelGM6C_V2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGM6C_V2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[286];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 136, 108, textureX, textureY); // Box 227
		bodyModel[1] = new ModelRendererTurbo(this, 138, 112, textureX, textureY); // Box 226
		bodyModel[2] = new ModelRendererTurbo(this, 454, 111, textureX, textureY); // Box 225
		bodyModel[3] = new ModelRendererTurbo(this, 201, 92, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 200, 86, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 452, 101, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 201, 92, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 200, 86, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 138, 103, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 224, 84, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 198, 84, textureX, textureY); // Box 170
		bodyModel[11] = new ModelRendererTurbo(this, 224, 110, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 223, 127, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 218, 128, textureX, textureY); // Box 163
		bodyModel[14] = new ModelRendererTurbo(this, 186, 113, textureX, textureY); // Box 409
		bodyModel[15] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 129
		bodyModel[16] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 130
		bodyModel[17] = new ModelRendererTurbo(this, 218, 128, textureX, textureY); // Box 166
		bodyModel[18] = new ModelRendererTurbo(this, 186, 113, textureX, textureY); // Box 408
		bodyModel[19] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 192
		bodyModel[20] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 194
		bodyModel[21] = new ModelRendererTurbo(this, 214, 143, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 475, 103, textureX, textureY); // Box 203
		bodyModel[23] = new ModelRendererTurbo(this, 162, 95, textureX, textureY, "cull"); // Box 268 anticlimber cull
		bodyModel[24] = new ModelRendererTurbo(this, 132, 95, textureX, textureY, "cull"); // Box 269 anticlimber cull
		bodyModel[25] = new ModelRendererTurbo(this, 136, 89, textureX, textureY, "cull"); // Box 92 anticlimber cull
		bodyModel[26] = new ModelRendererTurbo(this, 450, 76, textureX, textureY, "cull"); // Box 54 anticlimber cull
		bodyModel[27] = new ModelRendererTurbo(this, 477, 83, textureX, textureY, "cull"); // Box 55 anticlimber cull
		bodyModel[28] = new ModelRendererTurbo(this, 447, 83, textureX, textureY, "cull"); // Box 56 anticlimber cull
		bodyModel[29] = new ModelRendererTurbo(this, 87, 140, textureX, textureY); // Box 22
		bodyModel[30] = new ModelRendererTurbo(this, 137, 140, textureX, textureY); // Box 23
		bodyModel[31] = new ModelRendererTurbo(this, 122, 145, textureX, textureY); // Box 24
		bodyModel[32] = new ModelRendererTurbo(this, 172, 145, textureX, textureY); // Box 25
		bodyModel[33] = new ModelRendererTurbo(this, 468, 139, textureX, textureY); // Box 1163
		bodyModel[34] = new ModelRendererTurbo(this, 439, 139, textureX, textureY); // Box 1164
		bodyModel[35] = new ModelRendererTurbo(this, 482, 136, textureX, textureY); // Box 1165
		bodyModel[36] = new ModelRendererTurbo(this, 453, 136, textureX, textureY); // Box 1166
		bodyModel[37] = new ModelRendererTurbo(this, 179, 114, textureX, textureY); // Box 143
		bodyModel[38] = new ModelRendererTurbo(this, 138, 115, textureX, textureY); // Box 61
		bodyModel[39] = new ModelRendererTurbo(this, 176, 115, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 179, 112, textureX, textureY); // Box 363
		bodyModel[41] = new ModelRendererTurbo(this, 135, 112, textureX, textureY); // Box 870
		bodyModel[42] = new ModelRendererTurbo(this, 135, 114, textureX, textureY); // Box 559
		bodyModel[43] = new ModelRendererTurbo(this, 165, 108, textureX, textureY); // Box 432
		bodyModel[44] = new ModelRendererTurbo(this, 141, 108, textureX, textureY); // Box 433
		bodyModel[45] = new ModelRendererTurbo(this, 152, 107, textureX, textureY); // Box 434
		bodyModel[46] = new ModelRendererTurbo(this, 162, 96, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 59, 55, textureX, textureY); // Box 345
		bodyModel[48] = new ModelRendererTurbo(this, 148, 96, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 135, 125, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 179, 125, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 78, 78, textureX, textureY); // Box 352
		bodyModel[52] = new ModelRendererTurbo(this, 56, 78, textureX, textureY); // Box 355
		bodyModel[53] = new ModelRendererTurbo(this, 56, 98, textureX, textureY); // Box 93
		bodyModel[54] = new ModelRendererTurbo(this, 79, 98, textureX, textureY); // Box 94
		bodyModel[55] = new ModelRendererTurbo(this, 101, 80, textureX, textureY, "lamp"); // Box 547 headlight nose
		bodyModel[56] = new ModelRendererTurbo(this, 101, 85, textureX, textureY, "lamp"); // Box 548 headlight nose
		bodyModel[57] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 353
		bodyModel[58] = new ModelRendererTurbo(this, 57, 87, textureX, textureY); // Box 354
		bodyModel[59] = new ModelRendererTurbo(this, 99, 91, textureX, textureY); // Box 296 nose cover
		bodyModel[60] = new ModelRendererTurbo(this, 105, 91, textureX, textureY); // Box 299 nose cover
		bodyModel[61] = new ModelRendererTurbo(this, 100, 103, textureX, textureY); // Box 48
		bodyModel[62] = new ModelRendererTurbo(this, 122, 31, textureX, textureY); // Box 52 door swing right
		bodyModel[63] = new ModelRendererTurbo(this, 156, 17, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 206, 34, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 133, 34, textureX, textureY); // Box 190
		bodyModel[66] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 313 dual control stands moment
		bodyModel[67] = new ModelRendererTurbo(this, 195, 31, textureX, textureY); // Box 314 door swing right
		bodyModel[68] = new ModelRendererTurbo(this, 113, 34, textureX, textureY); // Box 105 dual control stands moment
		bodyModel[69] = new ModelRendererTurbo(this, 77, 34, textureX, textureY); // Box 106 dual control stands moment
		bodyModel[70] = new ModelRendererTurbo(this, 66, 31, textureX, textureY); // Box 107
		bodyModel[71] = new ModelRendererTurbo(this, 56, 57, textureX, textureY); // Box 43
		bodyModel[72] = new ModelRendererTurbo(this, 38, 57, textureX, textureY); // Box 44
		bodyModel[73] = new ModelRendererTurbo(this, 145, 52, textureX, textureY); // Box 116
		bodyModel[74] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 117
		bodyModel[75] = new ModelRendererTurbo(this, 140, 56, textureX, textureY); // Box 118
		bodyModel[76] = new ModelRendererTurbo(this, 158, 58, textureX, textureY); // Box 119
		bodyModel[77] = new ModelRendererTurbo(this, 122, 58, textureX, textureY); // Box 120
		bodyModel[78] = new ModelRendererTurbo(this, 129, 7, textureX, textureY); // Box 121
		bodyModel[79] = new ModelRendererTurbo(this, 103, 20, textureX, textureY); // Box 122
		bodyModel[80] = new ModelRendererTurbo(this, 103, 23, textureX, textureY); // Box 123
		bodyModel[81] = new ModelRendererTurbo(this, 129, 28, textureX, textureY); // Box 124
		bodyModel[82] = new ModelRendererTurbo(this, 117, 28, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 116, 29, textureX, textureY); // Box 129
		bodyModel[84] = new ModelRendererTurbo(this, 117, 14, textureX, textureY); // Box 130
		bodyModel[85] = new ModelRendererTurbo(this, 116, 15, textureX, textureY); // Box 131
		bodyModel[86] = new ModelRendererTurbo(this, 183, 15, textureX, textureY); // box64
		bodyModel[87] = new ModelRendererTurbo(this, 116, 12, textureX, textureY); // Box 127
		bodyModel[88] = new ModelRendererTurbo(this, 52, 74, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[89] = new ModelRendererTurbo(this, 52, 69, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[90] = new ModelRendererTurbo(this, 51, 56, textureX, textureY); // Box 48
		bodyModel[91] = new ModelRendererTurbo(this, 51, 52, textureX, textureY); // Box 133
		bodyModel[92] = new ModelRendererTurbo(this, 83, 59, textureX, textureY, "lamp"); // Box 198 numberboard
		bodyModel[93] = new ModelRendererTurbo(this, 83, 59, textureX, textureY, "lamp"); // Box 199 numberboard
		bodyModel[94] = new ModelRendererTurbo(this, 264, 48, textureX, textureY); // Box 34
		bodyModel[95] = new ModelRendererTurbo(this, 448, 25, textureX, textureY); // Box 188
		bodyModel[96] = new ModelRendererTurbo(this, 439, 29, textureX, textureY); // Box 189
		bodyModel[97] = new ModelRendererTurbo(this, 422, 25, textureX, textureY); // Box 190
		bodyModel[98] = new ModelRendererTurbo(this, 270, 27, textureX, textureY); // Box 34
		bodyModel[99] = new ModelRendererTurbo(this, 314, 10, textureX, textureY); // Box 186
		bodyModel[100] = new ModelRendererTurbo(this, 366, 13, textureX, textureY); // Box 276
		bodyModel[101] = new ModelRendererTurbo(this, 340, 13, textureX, textureY); // Box 277
		bodyModel[102] = new ModelRendererTurbo(this, 422, 55, textureX, textureY); // Box 100
		bodyModel[103] = new ModelRendererTurbo(this, 422, 48, textureX, textureY); // Box 238
		bodyModel[104] = new ModelRendererTurbo(this, 334, 21, textureX, textureY); // Box 169
		bodyModel[105] = new ModelRendererTurbo(this, 384, 27, textureX, textureY); // Box 170
		bodyModel[106] = new ModelRendererTurbo(this, 445, 20, textureX, textureY, "lamp"); // Box 187 headlight rear
		bodyModel[107] = new ModelRendererTurbo(this, 445, 20, textureX, textureY, "lamp"); // Box 186 headlight rear
		bodyModel[108] = new ModelRendererTurbo(this, 439, 16, textureX, textureY); // Box 133
		bodyModel[109] = new ModelRendererTurbo(this, 437, 21, textureX, textureY, "lamp"); // Box 260 numberboard
		bodyModel[110] = new ModelRendererTurbo(this, 437, 21, textureX, textureY, "lamp"); // Box 261 numberboard
		bodyModel[111] = new ModelRendererTurbo(this, 452, 91, textureX, textureY); // Box 80
		bodyModel[112] = new ModelRendererTurbo(this, 447, 113, textureX, textureY); // Box 390
		bodyModel[113] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 391
		bodyModel[114] = new ModelRendererTurbo(this, 464, 85, textureX, textureY); // Box 181
		bodyModel[115] = new ModelRendererTurbo(this, 478, 85, textureX, textureY); // Box 182
		bodyModel[116] = new ModelRendererTurbo(this, 258, 17, textureX, textureY); // Box 160
		bodyModel[117] = new ModelRendererTurbo(this, 260, 23, textureX, textureY); // Box 161
		bodyModel[118] = new ModelRendererTurbo(this, 266, 32, textureX, textureY); // Box 222
		bodyModel[119] = new ModelRendererTurbo(this, 243, 10, textureX, textureY); // Box 190
		bodyModel[120] = new ModelRendererTurbo(this, 245, 6, textureX, textureY); // Box 191
		bodyModel[121] = new ModelRendererTurbo(this, 435, 20, textureX, textureY, "lamp"); // Box 71 markerlight rear
		bodyModel[122] = new ModelRendererTurbo(this, 435, 20, textureX, textureY, "lamp"); // Box 1208 makrerlight rear
		bodyModel[123] = new ModelRendererTurbo(this, 216, 182, textureX, textureY); // Box 196
		bodyModel[124] = new ModelRendererTurbo(this, 229, 111, textureX, textureY); // Box 197
		bodyModel[125] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 198
		bodyModel[126] = new ModelRendererTurbo(this, 251, 187, textureX, textureY); // Box 176
		bodyModel[127] = new ModelRendererTurbo(this, 259, 188, textureX, textureY); // Box 200
		bodyModel[128] = new ModelRendererTurbo(this, 229, 116, textureX, textureY); // Box 201
		bodyModel[129] = new ModelRendererTurbo(this, 251, 203, textureX, textureY); // Box 202
		bodyModel[130] = new ModelRendererTurbo(this, 254, 202, textureX, textureY); // Box 203
		bodyModel[131] = new ModelRendererTurbo(this, 259, 204, textureX, textureY); // Box 204
		bodyModel[132] = new ModelRendererTurbo(this, 216, 172, textureX, textureY); // Box 205
		bodyModel[133] = new ModelRendererTurbo(this, 185, 176, textureX, textureY); // Box 206
		bodyModel[134] = new ModelRendererTurbo(this, 180, 177, textureX, textureY); // Box 207
		bodyModel[135] = new ModelRendererTurbo(this, 180, 167, textureX, textureY); // Box 208
		bodyModel[136] = new ModelRendererTurbo(this, 185, 166, textureX, textureY); // Box 209
		bodyModel[137] = new ModelRendererTurbo(this, 192, 168, textureX, textureY); // Box 210
		bodyModel[138] = new ModelRendererTurbo(this, 217, 168, textureX, textureY); // Box 211
		bodyModel[139] = new ModelRendererTurbo(this, 217, 170, textureX, textureY); // Box 212
		bodyModel[140] = new ModelRendererTurbo(this, 217, 180, textureX, textureY); // Box 213
		bodyModel[141] = new ModelRendererTurbo(this, 217, 178, textureX, textureY); // Box 214
		bodyModel[142] = new ModelRendererTurbo(this, 192, 178, textureX, textureY); // Box 215
		bodyModel[143] = new ModelRendererTurbo(this, 282, 143, textureX, textureY); // Box 216
		bodyModel[144] = new ModelRendererTurbo(this, 309, 143, textureX, textureY); // Box 217
		bodyModel[145] = new ModelRendererTurbo(this, 309, 145, textureX, textureY); // Box 218
		bodyModel[146] = new ModelRendererTurbo(this, 282, 145, textureX, textureY); // Box 219
		bodyModel[147] = new ModelRendererTurbo(this, 205, 178, textureX, textureY); // Box 221
		bodyModel[148] = new ModelRendererTurbo(this, 230, 177, textureX, textureY); // Box 222
		bodyModel[149] = new ModelRendererTurbo(this, 235, 179, textureX, textureY); // Box 223
		bodyModel[150] = new ModelRendererTurbo(this, 502, 113, textureX, textureY); // Box 224
		bodyModel[151] = new ModelRendererTurbo(this, 216, 182, textureX, textureY); // Box 225
		bodyModel[152] = new ModelRendererTurbo(this, 217, 180, textureX, textureY); // Box 226
		bodyModel[153] = new ModelRendererTurbo(this, 217, 178, textureX, textureY); // Box 227
		bodyModel[154] = new ModelRendererTurbo(this, 230, 166, textureX, textureY); // Box 228
		bodyModel[155] = new ModelRendererTurbo(this, 235, 168, textureX, textureY); // Box 229
		bodyModel[156] = new ModelRendererTurbo(this, 205, 168, textureX, textureY); // Box 230
		bodyModel[157] = new ModelRendererTurbo(this, 216, 172, textureX, textureY); // Box 231
		bodyModel[158] = new ModelRendererTurbo(this, 217, 170, textureX, textureY); // Box 232
		bodyModel[159] = new ModelRendererTurbo(this, 217, 168, textureX, textureY); // Box 233
		bodyModel[160] = new ModelRendererTurbo(this, 416, 82, textureX, textureY); // Box 234
		bodyModel[161] = new ModelRendererTurbo(this, 186, 137, textureX, textureY, "cull"); // Box 386 cull mounter cover
		bodyModel[162] = new ModelRendererTurbo(this, 186, 137, textureX, textureY, "cull"); // Box 386 cull mounter cover
		bodyModel[163] = new ModelRendererTurbo(this, 148, 74, textureX, textureY); // Box 384
		bodyModel[164] = new ModelRendererTurbo(this, 148, 71, textureX, textureY); // Box 385
		bodyModel[165] = new ModelRendererTurbo(this, 148, 68, textureX, textureY); // Box 386
		bodyModel[166] = new ModelRendererTurbo(this, 158, 71, textureX, textureY); // Box 387
		bodyModel[167] = new ModelRendererTurbo(this, 123, 67, textureX, textureY); // Box 239
		bodyModel[168] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 439
		bodyModel[169] = new ModelRendererTurbo(this, 138, 66, textureX, textureY); // Box 394
		bodyModel[170] = new ModelRendererTurbo(this, 128, 85, textureX, textureY); // Box 364 prime base
		bodyModel[171] = new ModelRendererTurbo(this, 128, 81, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[172] = new ModelRendererTurbo(this, 128, 81, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[173] = new ModelRendererTurbo(this, 128, 81, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[174] = new ModelRendererTurbo(this, 128, 81, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[175] = new ModelRendererTurbo(this, 123, 76, textureX, textureY); // Box 401
		bodyModel[176] = new ModelRendererTurbo(this, 138, 75, textureX, textureY); // Box 402
		bodyModel[177] = new ModelRendererTurbo(this, 272, 26, textureX, textureY); // Box 226
		bodyModel[178] = new ModelRendererTurbo(this, 267, 26, textureX, textureY); // Box 404
		bodyModel[179] = new ModelRendererTurbo(this, 342, 145, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[180] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 20
		bodyModel[181] = new ModelRendererTurbo(this, 39, 125, textureX, textureY); // Box 21
		bodyModel[182] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 20
		bodyModel[183] = new ModelRendererTurbo(this, 39, 125, textureX, textureY); // Box 21
		bodyModel[184] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 20
		bodyModel[185] = new ModelRendererTurbo(this, 39, 125, textureX, textureY); // Box 21
		bodyModel[186] = new ModelRendererTurbo(this, 44, 125, textureX, textureY); // Box 21
		bodyModel[187] = new ModelRendererTurbo(this, 39, 132, textureX, textureY); // Box 20
		bodyModel[188] = new ModelRendererTurbo(this, 39, 125, textureX, textureY); // Box 21
		bodyModel[189] = new ModelRendererTurbo(this, 2, 119, textureX, textureY, "cull"); // Box 34 cull wirebit
		bodyModel[190] = new ModelRendererTurbo(this, 4, 126, textureX, textureY); // Box 21
		bodyModel[191] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 418
		bodyModel[192] = new ModelRendererTurbo(this, 26, 125, textureX, textureY); // Box 419
		bodyModel[193] = new ModelRendererTurbo(this, 49, 126, textureX, textureY); // Box 420
		bodyModel[194] = new ModelRendererTurbo(this, 101, 98, textureX, textureY, "lamp"); // Box 71 markerlight front
		bodyModel[195] = new ModelRendererTurbo(this, 101, 98, textureX, textureY, "lamp"); // Box 1208 makrerlight front
		bodyModel[196] = new ModelRendererTurbo(this, 353, 144, textureX, textureY); // Box 562
		bodyModel[197] = new ModelRendererTurbo(this, 353, 149, textureX, textureY); // Box 563
		bodyModel[198] = new ModelRendererTurbo(this, 180, 64, textureX, textureY); // Box 332 h6 horn
		bodyModel[199] = new ModelRendererTurbo(this, 178, 58, textureX, textureY); // Box 331 h6 horn
		bodyModel[200] = new ModelRendererTurbo(this, 187, 61, textureX, textureY); // Box 330 h6 horn
		bodyModel[201] = new ModelRendererTurbo(this, 168, 64, textureX, textureY); // Box 329 h6 horn
		bodyModel[202] = new ModelRendererTurbo(this, 168, 58, textureX, textureY); // Box 328 h6 horn
		bodyModel[203] = new ModelRendererTurbo(this, 166, 61, textureX, textureY); // Box 327 h6 horn
		bodyModel[204] = new ModelRendererTurbo(this, 180, 61, textureX, textureY); // Box 431 h6 horn
		bodyModel[205] = new ModelRendererTurbo(this, 177, 72, textureX, textureY); // Box 330
		bodyModel[206] = new ModelRendererTurbo(this, 168, 75, textureX, textureY); // Box 329
		bodyModel[207] = new ModelRendererTurbo(this, 168, 69, textureX, textureY); // Box 328
		bodyModel[208] = new ModelRendererTurbo(this, 166, 72, textureX, textureY); // Box 327
		bodyModel[209] = new ModelRendererTurbo(this, 257, 150, textureX, textureY); // Box 78
		bodyModel[210] = new ModelRendererTurbo(this, 257, 147, textureX, textureY); // Box 74
		bodyModel[211] = new ModelRendererTurbo(this, 257, 147, textureX, textureY); // Box 114
		bodyModel[212] = new ModelRendererTurbo(this, 256, 143, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[213] = new ModelRendererTurbo(this, 112, 79, textureX, textureY); // Box 443 gyra 4head casing
		bodyModel[214] = new ModelRendererTurbo(this, 112, 73, textureX, textureY, "lamp"); // Box 444 gyra 4head
		bodyModel[215] = new ModelRendererTurbo(this, 112, 73, textureX, textureY, "lamp"); // Box 445 gyra 4head
		bodyModel[216] = new ModelRendererTurbo(this, 253, 67, textureX, textureY); // Box 1251 sandcap
		bodyModel[217] = new ModelRendererTurbo(this, 253, 63, textureX, textureY, "cull"); // Box 221 sandcap cull box
		bodyModel[218] = new ModelRendererTurbo(this, 450, 67, textureX, textureY); // Box 1251 sandcap
		bodyModel[219] = new ModelRendererTurbo(this, 450, 63, textureX, textureY, "cull"); // Box 221 sandcap cull box
		bodyModel[220] = new ModelRendererTurbo(this, 244, 67, textureX, textureY); // Box 1251 sandcap
		bodyModel[221] = new ModelRendererTurbo(this, 244, 63, textureX, textureY, "cull"); // Box 221 sandcap cull box
		bodyModel[222] = new ModelRendererTurbo(this, 440, 67, textureX, textureY); // Box 1251 sandcap
		bodyModel[223] = new ModelRendererTurbo(this, 440, 63, textureX, textureY, "cull"); // Box 221 sandcap cull box
		bodyModel[224] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 4
		bodyModel[225] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 448
		bodyModel[226] = new ModelRendererTurbo(this, 150, 138, textureX, textureY); // Box 322
		bodyModel[227] = new ModelRendererTurbo(this, 163, 137, textureX, textureY); // Box 323
		bodyModel[228] = new ModelRendererTurbo(this, 124, 135, textureX, textureY); // Box 445
		bodyModel[229] = new ModelRendererTurbo(this, 174, 135, textureX, textureY); // Box 446
		bodyModel[230] = new ModelRendererTurbo(this, 125, 110, textureX, textureY); // Box 396
		bodyModel[231] = new ModelRendererTurbo(this, 117, 110, textureX, textureY); // Box 397
		bodyModel[232] = new ModelRendererTurbo(this, 125, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[233] = new ModelRendererTurbo(this, 117, 115, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[234] = new ModelRendererTurbo(this, 125, 120, textureX, textureY, BoxName.ditch); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[235] = new ModelRendererTurbo(this, 117, 120, textureX, textureY, BoxName.ditch); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[236] = new ModelRendererTurbo(this, 437, 106, textureX, textureY); // Box 392
		bodyModel[237] = new ModelRendererTurbo(this, 437, 121, textureX, textureY); // Box 393
		bodyModel[238] = new ModelRendererTurbo(this, 437, 111, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[239] = new ModelRendererTurbo(this, 437, 126, textureX, textureY); // Box 395 not a ditchlight will not glow
		bodyModel[240] = new ModelRendererTurbo(this, 437, 131, textureX, textureY, BoxName.ditch); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[241] = new ModelRendererTurbo(this, 437, 116, textureX, textureY, BoxName.ditch); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[242] = new ModelRendererTurbo(this, 250, 144, textureX, textureY); // Box 297
		bodyModel[243] = new ModelRendererTurbo(this, 303, 155, textureX, textureY); // Box 304
		bodyModel[244] = new ModelRendererTurbo(this, 310, 150, textureX, textureY); // Box 305
		bodyModel[245] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 298
		bodyModel[246] = new ModelRendererTurbo(this, 346, 171, textureX, textureY); // Box 299
		bodyModel[247] = new ModelRendererTurbo(this, 339, 155, textureX, textureY); // Box 251
		bodyModel[248] = new ModelRendererTurbo(this, 260, 49, textureX, textureY); // Box 36
		bodyModel[249] = new ModelRendererTurbo(this, 401, 20, textureX, textureY); // Box 298
		bodyModel[250] = new ModelRendererTurbo(this, 401, 20, textureX, textureY); // Box 220
		bodyModel[251] = new ModelRendererTurbo(this, 293, 17, textureX, textureY); // Box 221
		bodyModel[252] = new ModelRendererTurbo(this, 310, 17, textureX, textureY); // Box 223
		bodyModel[253] = new ModelRendererTurbo(this, 310, 10, textureX, textureY); // Box 224
		bodyModel[254] = new ModelRendererTurbo(this, 293, 10, textureX, textureY); // Box 225
		bodyModel[255] = new ModelRendererTurbo(this, 271, 204, textureX, textureY); // Box 316
		bodyModel[256] = new ModelRendererTurbo(this, 408, 204, textureX, textureY); // Box 261
		bodyModel[257] = new ModelRendererTurbo(this, 408, 188, textureX, textureY); // Box 262
		bodyModel[258] = new ModelRendererTurbo(this, 271, 188, textureX, textureY); // Box 263
		bodyModel[259] = new ModelRendererTurbo(this, 444, 113, textureX, textureY); // Box 264
		bodyModel[260] = new ModelRendererTurbo(this, 183, 19, textureX, textureY); // Box 265
		bodyModel[261] = new ModelRendererTurbo(this, 256, 72, textureX, textureY, "cull"); // Box 266 cull handbrake enclouserure
		bodyModel[262] = new ModelRendererTurbo(this, 248, 73, textureX, textureY); // Box 43
		bodyModel[263] = new ModelRendererTurbo(this, 251, 73, textureX, textureY); // Box 43
		bodyModel[264] = new ModelRendererTurbo(this, 9, 13, textureX, textureY); // Box 412 cs
		bodyModel[265] = new ModelRendererTurbo(this, 21, 13, textureX, textureY); // Box 413 cs
		bodyModel[266] = new ModelRendererTurbo(this, 7, 5, textureX, textureY); // Box 86 cs
		bodyModel[267] = new ModelRendererTurbo(this, 2, 26, textureX, textureY); // Box 531 cs
		bodyModel[268] = new ModelRendererTurbo(this, 34, 4, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[269] = new ModelRendererTurbo(this, 37, 11, textureX, textureY); // Box 307 spedo
		bodyModel[270] = new ModelRendererTurbo(this, 7, 42, textureX, textureY); // Box 412 cs
		bodyModel[271] = new ModelRendererTurbo(this, 21, 42, textureX, textureY); // Box 413 cs
		bodyModel[272] = new ModelRendererTurbo(this, 7, 34, textureX, textureY); // Box 86 cs
		bodyModel[273] = new ModelRendererTurbo(this, 2, 55, textureX, textureY); // Box 531 cs
		bodyModel[274] = new ModelRendererTurbo(this, 34, 33, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[275] = new ModelRendererTurbo(this, 37, 40, textureX, textureY); // Box 307 spedo
		bodyModel[276] = new ModelRendererTurbo(this, 463, 105, textureX, textureY); // Box 276
		bodyModel[277] = new ModelRendererTurbo(this, 196, 58, textureX, textureY); // Box 277
		bodyModel[278] = new ModelRendererTurbo(this, 196, 64, textureX, textureY); // Box 278
		bodyModel[279] = new ModelRendererTurbo(this, 198, 61, textureX, textureY); // Box 279
		bodyModel[280] = new ModelRendererTurbo(this, 205, 61, textureX, textureY); // Box 280
		bodyModel[281] = new ModelRendererTurbo(this, 53, 125, textureX, textureY); // Box 281
		bodyModel[282] = new ModelRendererTurbo(this, 50, 18, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[283] = new ModelRendererTurbo(this, 52, 13, textureX, textureY); // Box 5
		bodyModel[284] = new ModelRendererTurbo(this, 74, 18, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[285] = new ModelRendererTurbo(this, 76, 13, textureX, textureY); // Box 5

		bodyModel[0].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[0].setRotationPoint(-47F, 7F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[1].setRotationPoint(-47F, 8F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[2].setRotationPoint(47F, 8F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(47F, 2.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[4].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 3
		bodyModel[5].setRotationPoint(47F, 1F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[7].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47F, 1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 84, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-42F, -0.5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[10].setRotationPoint(-47F, -0.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 94, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		bodyModel[11].setRotationPoint(-47F, 0.5F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[12].setRotationPoint(-47F, 3F, -6.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[13].setRotationPoint(-30F, 3F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 409
		bodyModel[14].setRotationPoint(-29F, 1F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[15].setRotationPoint(-29F, 2F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[16].setRotationPoint(-29F, 2F, 6F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[17].setRotationPoint(26F, 3F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 408
		bodyModel[18].setRotationPoint(27F, 1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[19].setRotationPoint(27F, 2F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[20].setRotationPoint(27F, 2F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-47F, 2.5F, -2.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[22].setRotationPoint(42F, 2.5F, -2.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 268 anticlimber cull
		bodyModel[23].setRotationPoint(-50F, -0.5F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 269 anticlimber cull
		bodyModel[24].setRotationPoint(-50F, -0.5F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92 anticlimber cull
		bodyModel[25].setRotationPoint(-49F, -0.5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54 anticlimber cull
		bodyModel[26].setRotationPoint(47F, -0.5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55 anticlimber cull
		bodyModel[27].setRotationPoint(49F, -0.5F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56 anticlimber cull
		bodyModel[28].setRotationPoint(49F, -0.5F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[29].setRotationPoint(-51F, 7F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[30].setRotationPoint(-51F, 7F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[31].setRotationPoint(-50F, 6F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[32].setRotationPoint(-50F, 6F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[33].setRotationPoint(50F, 7F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[34].setRotationPoint(50F, 7F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[35].setRotationPoint(49F, 6F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[36].setRotationPoint(49F, 6F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[37].setRotationPoint(-47F, -8.5F, -8F);
		bodyModel[37].rotateAngleY = -3.14159265F;

		bodyModel[38].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 61
		bodyModel[38].setRotationPoint(-47F, -1.5F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 63
		bodyModel[39].setRotationPoint(-47F, -1.5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[40].setRotationPoint(-48.01F, -7.5F, -8F);
		bodyModel[40].rotateAngleY = 0.19198622F;

		bodyModel[41].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[41].setRotationPoint(-48.01F, -7.5F, 8F);
		bodyModel[41].rotateAngleY = -0.19198622F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,-1F, 0F, -1F, 1F, 0F, -1F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[42].setRotationPoint(-47F, -8.5F, 9F);
		bodyModel[42].rotateAngleY = -3.14159265F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 432
		bodyModel[43].setRotationPoint(-48.5F, -8.5F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[44].setRotationPoint(-48.5F, -8.5F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[45].setRotationPoint(-49F, -8.5F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F); // Box 86
		bodyModel[46].setRotationPoint(-49F, -0.5F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 8, 14, 0F); // Box 345
		bodyModel[47].setRotationPoint(-44F, -8.5F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F, 0F); // Box 88
		bodyModel[48].setRotationPoint(-49F, -0.5F, 5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[49].setRotationPoint(-47F, 4F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[50].setRotationPoint(-47F, 4F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[51].setRotationPoint(-47F, -8.5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[52].setRotationPoint(-47F, -8.5F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 93
		bodyModel[53].setRotationPoint(-47F, -3.5F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[54].setRotationPoint(-47F, -3.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose
		bodyModel[55].setRotationPoint(-46.9F, -7.5F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose
		bodyModel[56].setRotationPoint(-46.9F, -5.5F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[57].setRotationPoint(-47F, -7.5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[58].setRotationPoint(-47F, -7.5F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[59].setRotationPoint(-47F, -7.5F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[60].setRotationPoint(-47F, -7.5F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[61].setRotationPoint(-45.98F, -7.5F, -1F);

		bodyModel[62].addBox(-0.5F, 0F, -0.5F, 1, 16, 4, 0F); // Box 52 door swing right
		bodyModel[62].setRotationPoint(-37.5F, -16.5F, -10.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 16, 18, 0F); // Box 70
		bodyModel[63].setRotationPoint(-27F, -16.5F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 10, 16, 1, 0F); // Box 72
		bodyModel[64].setRotationPoint(-37F, -16.5F, 10F);

		bodyModel[65].addBox(0F, 0F, 0F, 10, 16, 1, 0F); // Box 190
		bodyModel[65].setRotationPoint(-37F, -16.5F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 313 dual control stands moment
		bodyModel[66].setRotationPoint(-40F, -16.5F, -6F);

		bodyModel[67].addBox(-0.5F, 0F, -3.5F, 1, 16, 4, 0F); // Box 314 door swing right
		bodyModel[67].setRotationPoint(-26.5F, -16.5F, 10.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 105 dual control stands moment
		bodyModel[68].setRotationPoint(-40F, -16.5F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 106 dual control stands moment
		bodyModel[69].setRotationPoint(-40F, -16.5F, 6F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 107
		bodyModel[70].setRotationPoint(-38F, -16.5F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[71].setRotationPoint(-42F, -17.5F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[72].setRotationPoint(-42F, -17.5F, 1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[73].setRotationPoint(-42F, -22.5F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117
		bodyModel[74].setRotationPoint(-42F, -22.5F, 1F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 118
		bodyModel[75].setRotationPoint(-42F, -22.5F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[76].setRotationPoint(-40F, -22.5F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[77].setRotationPoint(-40F, -22.5F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 121
		bodyModel[78].setRotationPoint(-38F, -17.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[79].setRotationPoint(-38F, -17.5F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[80].setRotationPoint(-38F, -17.5F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 124
		bodyModel[81].setRotationPoint(-38F, -17.5F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-39F, -17.5F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, -1F, 1, 0, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[83].setRotationPoint(-39F, -17.5F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[84].setRotationPoint(-39F, -17.5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, -1F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 131
		bodyModel[85].setRotationPoint(-39F, -17.5F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[86].setRotationPoint(-35F, -14.5F, 11F);

		bodyModel[87].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 127
		bodyModel[87].setRotationPoint(-40F, -17.5F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[88].setRotationPoint(-42.3F, -15.5F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[89].setRotationPoint(-42.3F, -17.5F, -1F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[90].setRotationPoint(-42F, -17.5F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[91].setRotationPoint(-42F, -13.5F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.66F, 0F, 0F); // Box 198 numberboard
		bodyModel[92].setRotationPoint(-41.9F, -16F, 1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1.66F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.66F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 numberboard
		bodyModel[93].setRotationPoint(-41.9F, -16F, -6.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 71, 17, 14, 0F); // Box 34
		bodyModel[94].setRotationPoint(-26F, -17.5F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[95].setRotationPoint(45F, -22.5F, 1F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 189
		bodyModel[96].setRotationPoint(45F, -22.5F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[97].setRotationPoint(45F, -22.5F, -7F);

		bodyModel[98].addBox(0F, 0F, 0F, 24, 5, 14, 0F); // Box 34
		bodyModel[98].setRotationPoint(-7F, -22.5F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[99].setRotationPoint(17F, -22.5F, -7F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 276
		bodyModel[100].setRotationPoint(27F, -22.5F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 277
		bodyModel[101].setRotationPoint(20F, -22.5F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 28, 4, 2, 0F,0F, -0.5F, 0F, -14F, -0.5F, 0F, -14F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -14F, -0.75F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[102].setRotationPoint(20F, -20.5F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 28, 4, 2, 0F,0F, 0.75F, 0F, -14F, 0.75F, 0F, -14F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 238
		bodyModel[103].setRotationPoint(20F, -20.5F, 7F);

		bodyModel[104].addBox(0F, 0F, 0F, 17, 4, 14, 0F); // Box 169
		bodyModel[104].setRotationPoint(17F, -21.5F, -7F);

		bodyModel[105].addBox(0F, 0F, 0F, 11, 5, 14, 0F); // Box 170
		bodyModel[105].setRotationPoint(34F, -22.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight rear
		bodyModel[106].setRotationPoint(46.3F, -18.5F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight rear
		bodyModel[107].setRotationPoint(46.3F, -20.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[108].setRotationPoint(45F, -16.5F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, -1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260 numberboard
		bodyModel[109].setRotationPoint(45.9F, -21F, -6.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.66F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.66F, 0F, 0F, 1F, 0F, 0F); // Box 261 numberboard
		bodyModel[110].setRotationPoint(45.9F, -21F, 1.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 80
		bodyModel[111].setRotationPoint(49.01F, -8.5F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 390
		bodyModel[112].setRotationPoint(47F, -8.5F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 391
		bodyModel[113].setRotationPoint(47F, -8.5F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F); // Box 181
		bodyModel[114].setRotationPoint(49F, -0.5F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F); // Box 182
		bodyModel[115].setRotationPoint(49F, -0.5F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		bodyModel[116].setRotationPoint(-26F, -17.5F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
		bodyModel[117].setRotationPoint(-26F, -17.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[118].setRotationPoint(-14F, -22.5F, -7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 190
		bodyModel[119].setRotationPoint(-26F, -17.5F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 191
		bodyModel[120].setRotationPoint(-26F, -17.5F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear
		bodyModel[121].setRotationPoint(44.55F, -18.5F, -6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear
		bodyModel[122].setRotationPoint(44.55F, -18.5F, 4.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 196
		bodyModel[123].setRotationPoint(-47F, 8F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 197
		bodyModel[124].setRotationPoint(-43F, -0.5F, 9F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 198
		bodyModel[125].setRotationPoint(-42.51F, -8.5F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[126].setRotationPoint(-42.51F, -7.5F, 10.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 200
		bodyModel[127].setRotationPoint(-42.5F, -8.5F, 11.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 201
		bodyModel[128].setRotationPoint(-43F, -0.5F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 202
		bodyModel[129].setRotationPoint(-42.51F, -7.5F, -11.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 203
		bodyModel[130].setRotationPoint(-42.51F, -8.5F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 204
		bodyModel[131].setRotationPoint(-42.5F, -8.5F, -11.01F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 205
		bodyModel[132].setRotationPoint(-47F, 8F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 206
		bodyModel[133].setRotationPoint(-43F, 1F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 207
		bodyModel[134].setRotationPoint(-43F, 1F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 208
		bodyModel[135].setRotationPoint(-43F, 1F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 209
		bodyModel[136].setRotationPoint(-43F, 1F, -10F);

		bodyModel[137].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 210
		bodyModel[137].setRotationPoint(-47F, 1F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 211
		bodyModel[138].setRotationPoint(-47F, 3F, -9F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 212
		bodyModel[139].setRotationPoint(-47F, 6F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 213
		bodyModel[140].setRotationPoint(-47F, 6F, 8F);

		bodyModel[141].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 214
		bodyModel[141].setRotationPoint(-47F, 3F, 8F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 215
		bodyModel[142].setRotationPoint(-47F, 1F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 216
		bodyModel[143].setRotationPoint(-42F, 1F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 217
		bodyModel[144].setRotationPoint(29F, 1F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 218
		bodyModel[145].setRotationPoint(29F, 1F, 11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 219
		bodyModel[146].setRotationPoint(-42F, 1F, 11F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 221
		bodyModel[147].setRotationPoint(42F, 1F, 10F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 222
		bodyModel[148].setRotationPoint(42F, 1F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 223
		bodyModel[149].setRotationPoint(41F, 1F, 11F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 224
		bodyModel[150].setRotationPoint(46F, -8.5F, 11F);

		bodyModel[151].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 225
		bodyModel[151].setRotationPoint(42F, 8F, 9F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 226
		bodyModel[152].setRotationPoint(43F, 6F, 9F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 227
		bodyModel[153].setRotationPoint(43F, 3F, 9F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 228
		bodyModel[154].setRotationPoint(42F, 1F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 229
		bodyModel[155].setRotationPoint(41F, 1F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 7, 0, 0F); // Box 230
		bodyModel[156].setRotationPoint(42F, 1F, -10F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 231
		bodyModel[157].setRotationPoint(42F, 8F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 232
		bodyModel[158].setRotationPoint(43F, 6F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 233
		bodyModel[159].setRotationPoint(43F, 3F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 234
		bodyModel[160].setRotationPoint(42F, -0.5F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 cull mounter cover
		bodyModel[161].setRotationPoint(-29F, 2F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 cull mounter cover
		bodyModel[162].setRotationPoint(27F, 2F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[163].setRotationPoint(-40F, -19F, 7.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 385
		bodyModel[164].setRotationPoint(-38.25F, -19F, 8.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 386
		bodyModel[165].setRotationPoint(-39.5F, -19F, 9.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[166].setRotationPoint(-38F, -18.5F, 8.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 239
		bodyModel[167].setRotationPoint(-41F, -22.5F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[168].setRotationPoint(-40F, -23.5F, -7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 2F, 0F, -0.125F, -2F, 0F, -0.125F, -2F, 0F, -0.125F, 2F, 0F, -0.125F); // Box 394
		bodyModel[169].setRotationPoint(-36F, -22.5F, -8.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[170].setRotationPoint(-39F, -23.5F, 6.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[171].setRotationPoint(-39F, -24F, 6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[172].setRotationPoint(-39F, -24F, 6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[173].setRotationPoint(-39F, -24F, 6.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[174].setRotationPoint(-39F, -24F, 6.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 401
		bodyModel[175].setRotationPoint(-41F, -22.5F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 2F, 0F, -0.125F, -2F, 0F, -0.125F, -2F, 0F, -0.125F, 2F, 0F, -0.125F); // Box 402
		bodyModel[176].setRotationPoint(-36F, -22.5F, 7.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 226
		bodyModel[177].setRotationPoint(-7F, -21.5F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[178].setRotationPoint(-7F, -20.5F, 8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[179].setRotationPoint(-15F, 1F, 8.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 20
		bodyModel[180].setRotationPoint(-17F, -18.5F, 6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[181].setRotationPoint(-17F, -20.5F, 6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 20
		bodyModel[182].setRotationPoint(-24F, -18.5F, 6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[183].setRotationPoint(-24F, -20.5F, 6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 20
		bodyModel[184].setRotationPoint(-31F, -18.5F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[185].setRotationPoint(-31F, -20.5F, 6F);

		bodyModel[186].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 21
		bodyModel[186].setRotationPoint(-36.5F, -19.25F, 6F);
		bodyModel[186].rotateAngleX = 0.34906585F;
		bodyModel[186].rotateAngleY = -0.26179939F;
		bodyModel[186].rotateAngleZ = 2.00712864F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 20
		bodyModel[187].setRotationPoint(-10F, -18.5F, 6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[188].setRotationPoint(-10F, -20.5F, 6F);

		bodyModel[189].addBox(0F, -1F, -4F, 25, 1, 4, 0F); // Box 34 cull wirebit
		bodyModel[189].setRotationPoint(-32.99F, -20.5F, 6.5F);
		bodyModel[189].rotateAngleX = 0.38397244F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[190].setRotationPoint(-10F, -20.5F, 1.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 418
		bodyModel[191].setRotationPoint(-13F, -20F, 1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 419
		bodyModel[192].setRotationPoint(-13F, -21F, 1.5F);

		bodyModel[193].addBox(-0.5F, -3F, -0.5F, 1, 3, 0, 0F); // Box 420
		bodyModel[193].setRotationPoint(-36.5F, -19.25F, 6.5F);
		bodyModel[193].rotateAngleX = 0.34906585F;
		bodyModel[193].rotateAngleY = -0.26179939F;
		bodyModel[193].rotateAngleZ = 2.49582083F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight front
		bodyModel[194].setRotationPoint(-44.65F, -7F, -6.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight front
		bodyModel[195].setRotationPoint(-44.65F, -7F, 4.5F);

		bodyModel[196].addShapeBox(0F, -1F, -1F, 17, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[196].setRotationPoint(-4F, 1.5F, -9.5F);
		bodyModel[196].rotateAngleX = 0.78539816F;

		bodyModel[197].addShapeBox(0F, -1F, -1F, 17, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[197].setRotationPoint(-4F, 1.5F, 9.5F);
		bodyModel[197].rotateAngleX = 0.78539816F;

		bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332 h6 horn
		bodyModel[198].setRotationPoint(-31F, -20F, -10.6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331 h6 horn
		bodyModel[199].setRotationPoint(-32F, -20F, -8.4F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330 h6 horn
		bodyModel[200].setRotationPoint(-30F, -18.25F, -9.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329 h6 horn
		bodyModel[201].setRotationPoint(-32F, -18.75F, -10.6F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328 h6 horn
		bodyModel[202].setRotationPoint(-31.5F, -18.75F, -8.4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 327 h6 horn
		bodyModel[203].setRotationPoint(-32.5F, -19.25F, -9.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 431 h6 horn
		bodyModel[204].setRotationPoint(-31F, -20.5F, -9.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[205].setRotationPoint(-19F, -18F, -9.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[206].setRotationPoint(-21F, -18.75F, -10.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[207].setRotationPoint(-20.5F, -18.75F, -8.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[208].setRotationPoint(-21.5F, -19F, -9.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[209].setRotationPoint(-13.25F, 3.25F, -10.05F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[210].setRotationPoint(-13.5F, 1.75F, -10.3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[211].setRotationPoint(-13.5F, 2.75F, -10.3F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[212].setRotationPoint(-13.5F, 0.75F, -10.7F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 443 gyra 4head casing
		bodyModel[213].setRotationPoint(-42.5F, -19.5F, -2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 444 gyra 4head
		bodyModel[214].setRotationPoint(-42.6F, -19.5F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 gyra 4head
		bodyModel[215].setRotationPoint(-42.6F, -19.5F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 1251 sandcap
		bodyModel[216].setRotationPoint(-21F, -14F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 sandcap cull box
		bodyModel[217].setRotationPoint(-21F, -15.5F, -7F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 1251 sandcap
		bodyModel[218].setRotationPoint(42F, -14F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 sandcap cull box
		bodyModel[219].setRotationPoint(42F, -15.5F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251 sandcap
		bodyModel[220].setRotationPoint(-21F, -14F, 5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 221 sandcap cull box
		bodyModel[221].setRotationPoint(-21F, -15.5F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251 sandcap
		bodyModel[222].setRotationPoint(42F, -14F, 5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 221 sandcap cull box
		bodyModel[223].setRotationPoint(42F, -15.5F, 5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[224].setRotationPoint(-50F, 6F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[225].setRotationPoint(-50F, 4F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[226].setRotationPoint(-50F, 6F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[227].setRotationPoint(-50F, 4F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 445
		bodyModel[228].setRotationPoint(-50F, 3F, 2F);

		bodyModel[229].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[229].setRotationPoint(-50F, 3F, -8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[230].setRotationPoint(-49F, -2.5F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[231].setRotationPoint(-49F, -2.5F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[232].setRotationPoint(-49.25F, -2.5F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[233].setRotationPoint(-49.25F, -2.5F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[234].setRotationPoint(-49.25F, -2.6F, -5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[235].setRotationPoint(-49.25F, -2.6F, 3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[236].setRotationPoint(48F, -2.5F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[237].setRotationPoint(48F, -2.5F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[238].setRotationPoint(48.25F, -2.5F, -5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 not a ditchlight will not glow
		bodyModel[239].setRotationPoint(48.25F, -2.5F, 3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[240].setRotationPoint(48.25F, -2.6F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[241].setRotationPoint(48.25F, -2.6F, -5F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 5, 20, 0F); // Box 297
		bodyModel[242].setRotationPoint(-11.5F, 3.25F, -10F);

		bodyModel[243].addBox(0F, 0F, 0F, 12, 4, 10, 0F); // Box 304
		bodyModel[243].setRotationPoint(-5F, 4.25F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[244].setRotationPoint(-5F, 3.25F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 11, 5, 8, 0F); // Box 298
		bodyModel[245].setRotationPoint(-5F, 3.25F, 2F);

		bodyModel[246].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 299
		bodyModel[246].setRotationPoint(7F, 3.25F, 2F);

		bodyModel[247].addBox(0F, 0F, 0F, 12, 1, 7, 0F); // Box 251
		bodyModel[247].setRotationPoint(-5F, 3.25F, -7F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 36
		bodyModel[248].setRotationPoint(-26F, -7.5F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 298
		bodyModel[249].setRotationPoint(35F, -21.5F, -7.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 220
		bodyModel[250].setRotationPoint(35F, -21.5F, 6.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 221
		bodyModel[251].setRotationPoint(-6F, -21.5F, -7.75F);

		bodyModel[252].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 223
		bodyModel[252].setRotationPoint(1.5F, -21.5F, -7.75F);

		bodyModel[253].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 224
		bodyModel[253].setRotationPoint(1.5F, -21.5F, 6.75F);

		bodyModel[254].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 225
		bodyModel[254].setRotationPoint(-6F, -21.5F, 6.75F);

		bodyModel[255].addBox(0F, 0F, 0F, 68, 8, 0, 0F); // Box 316
		bodyModel[255].setRotationPoint(-26F, -8.5F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 261
		bodyModel[256].setRotationPoint(42F, -8.5F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 14, 0, 0F); // Box 262
		bodyModel[257].setRotationPoint(42F, -8.5F, 11F);

		bodyModel[258].addBox(0F, 0F, 0F, 68, 8, 0, 0F); // Box 263
		bodyModel[258].setRotationPoint(-26F, -8.5F, 11F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 264
		bodyModel[259].setRotationPoint(46F, -8.5F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, -1F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		bodyModel[260].setRotationPoint(-35F, -14.5F, -11F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 266 cull handbrake enclouserure
		bodyModel[261].setRotationPoint(-13F, -8.5F, 6F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[262].setRotationPoint(-12F, -6.5F, 6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[263].setRotationPoint(-12.5F, -8.5F, 6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[264].setRotationPoint(-32.8F, -10.5F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[265].setRotationPoint(-39.5F, -8.5F, 2F);
		bodyModel[265].rotateAngleY = -0.45378561F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[266].setRotationPoint(-39.5F, -10.5F, 2F);
		bodyModel[266].rotateAngleY = -0.45378561F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[267].setRotationPoint(-39.5F, -4.5F, 2F);
		bodyModel[267].rotateAngleY = -0.45378561F;

		bodyModel[268].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[268].setRotationPoint(-36F, -12.75F, 2F);
		bodyModel[268].rotateAngleY = 0.78539816F;

		bodyModel[269].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[269].setRotationPoint(-36F, -12.75F, 2F);
		bodyModel[269].rotateAngleY = 0.78539816F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[270].setRotationPoint(-33.2F, -10.5F, 0F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[271].setRotationPoint(-26.5F, -8.5F, -2F);
		bodyModel[271].rotateAngleY = -3.59537826F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[272].setRotationPoint(-26.5F, -10.5F, -2F);
		bodyModel[272].rotateAngleY = -3.59537826F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[273].setRotationPoint(-26.5F, -4.5F, -2F);
		bodyModel[273].rotateAngleY = -3.59537826F;

		bodyModel[274].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[274].setRotationPoint(-29F, -12.75F, -3F);
		bodyModel[274].rotateAngleY = 3.92699082F;

		bodyModel[275].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[275].setRotationPoint(-29F, -12.75F, -3F);
		bodyModel[275].rotateAngleY = 3.92699082F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 276
		bodyModel[276].setRotationPoint(47F, -0.48F, -2F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 277
		bodyModel[277].setRotationPoint(43F, -21F, 7.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[278].setRotationPoint(43F, -19F, 7.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 279
		bodyModel[279].setRotationPoint(43F, -20F, 8F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 280
		bodyModel[280].setRotationPoint(43F, -20F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 281
		bodyModel[281].setRotationPoint(-9F, -21.5F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[282].setRotationPoint(-35F, -12.5F, 10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[283].setRotationPoint(-35F, -13.5F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[284].setRotationPoint(-35F, -12.5F, -15F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[285].setRotationPoint(-35F, -13.5F, -13F);
	}
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6 || GetColor(entity) == 15
				|| GetColor(entity) == 1348) {
			//silver dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 12) {
			//conrail can eat my dick
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}