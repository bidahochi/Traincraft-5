//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.06.2022 - 23:21:38
// Last changed on: 02.06.2022 - 23:21:38

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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

public class ModelSD45dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD45dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[566];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[8] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[9] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[10] = new ModelRendererTurbo(this, 46, 137, textureX, textureY); // Box 143
		bodyModel[11] = new ModelRendererTurbo(this, 16, 137, textureX, textureY); // Box 62
		bodyModel[12] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 98
		bodyModel[16] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 80
		bodyModel[17] = new ModelRendererTurbo(this, 41, 135, textureX, textureY); // Box 144
		bodyModel[18] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[19] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 147
		bodyModel[20] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 148
		bodyModel[21] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 38, 160, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[29] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 392, 148, textureX, textureY); // Box 164
		bodyModel[31] = new ModelRendererTurbo(this, 374, 148, textureX, textureY); // Box 259
		bodyModel[32] = new ModelRendererTurbo(this, 399, 152, textureX, textureY); // Box 261
		bodyModel[33] = new ModelRendererTurbo(this, 367, 152, textureX, textureY); // Box 262
		bodyModel[34] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[35] = new ModelRendererTurbo(this, 402, 168, textureX, textureY); // Box 143
		bodyModel[36] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 372, 168, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 397, 168, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 377, 168, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 406, 150, textureX, textureY); // Box 179
		bodyModel[42] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[43] = new ModelRendererTurbo(this, 397, 164, textureX, textureY); // Box 236
		bodyModel[44] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 439, 165, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 424, 163, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[52] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[55] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[56] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[57] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[58] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[59] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 204
		bodyModel[60] = new ModelRendererTurbo(this, 373, 164, textureX, textureY); // Box 206
		bodyModel[61] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[62] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[63] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[64] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[65] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[66] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[67] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[68] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[69] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[70] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[71] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[72] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[73] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[74] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[75] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[76] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[77] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[78] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[79] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[80] = new ModelRendererTurbo(this, 87, 103, textureX, textureY); // Box 246
		bodyModel[81] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[83] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 176
		bodyModel[84] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[85] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 271
		bodyModel[86] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 272
		bodyModel[87] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 273
		bodyModel[88] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 274
		bodyModel[89] = new ModelRendererTurbo(this, 95, 136, textureX, textureY); // Box 258
		bodyModel[90] = new ModelRendererTurbo(this, 102, 136, textureX, textureY); // Box 260
		bodyModel[91] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[92] = new ModelRendererTurbo(this, 94, 125, textureX, textureY); // Box 267
		bodyModel[93] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[94] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[95] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[96] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[97] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[98] = new ModelRendererTurbo(this, 302, 1, textureX, textureY); // Box 273
		bodyModel[99] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[100] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[101] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[102] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[103] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[104] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[105] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[106] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[107] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[108] = new ModelRendererTurbo(this, 331, 22, textureX, textureY); // Box 285
		bodyModel[109] = new ModelRendererTurbo(this, 331, 15, textureX, textureY); // Box 286
		bodyModel[110] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 287
		bodyModel[111] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 288
		bodyModel[112] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 289
		bodyModel[113] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 290
		bodyModel[114] = new ModelRendererTurbo(this, 117, 125, textureX, textureY); // Box 291
		bodyModel[115] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 292
		bodyModel[116] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 293
		bodyModel[117] = new ModelRendererTurbo(this, 128, 107, textureX, textureY); // Box 294
		bodyModel[118] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[119] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[120] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 301
		bodyModel[121] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[122] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[123] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[124] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[126] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[127] = new ModelRendererTurbo(this, 300, 25, textureX, textureY); // Box 308
		bodyModel[128] = new ModelRendererTurbo(this, 289, 20, textureX, textureY); // Box 309
		bodyModel[129] = new ModelRendererTurbo(this, 296, 15, textureX, textureY); // Box 310
		bodyModel[130] = new ModelRendererTurbo(this, 289, 11, textureX, textureY); // Box 311
		bodyModel[131] = new ModelRendererTurbo(this, 115, 136, textureX, textureY); // Box 312
		bodyModel[132] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[133] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[134] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[135] = new ModelRendererTurbo(this, 196, 136, textureX, textureY); // Box 316
		bodyModel[136] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[137] = new ModelRendererTurbo(this, 482, 81, textureX, textureY); // Box 318
		bodyModel[138] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[139] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 320 ptc forehead
		bodyModel[140] = new ModelRendererTurbo(this, 145, 50, textureX, textureY); // Box 321 ptc forehead
		bodyModel[141] = new ModelRendererTurbo(this, 119, 50, textureX, textureY); // Box 322 ptc forehead
		bodyModel[142] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 42
		bodyModel[143] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[144] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 43
		bodyModel[145] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[146] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[147] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[148] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[149] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[150] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[151] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[152] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[153] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[154] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[155] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[156] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[157] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 cnw bELL
		bodyModel[158] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[159] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[160] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[161] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[162] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[163] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[164] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[165] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[166] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[167] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[168] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[169] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 384
		bodyModel[170] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 385
		bodyModel[171] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 386
		bodyModel[172] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 387
		bodyModel[173] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[174] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[175] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[176] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[177] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[178] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f
		bodyModel[179] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f
		bodyModel[180] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[181] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[182] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[183] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[184] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[185] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[186] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[187] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[188] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[189] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 glow commander
		bodyModel[190] = new ModelRendererTurbo(this, 250, 51, textureX, textureY); // Box 415
		bodyModel[191] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 416 ditchlight f
		bodyModel[192] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[193] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, BoxName.ditch); // Box 418 ditchlight f
		bodyModel[194] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[195] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[196] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[197] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[198] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[199] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[200] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[201] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[202] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[203] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[204] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[205] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[206] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[207] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[208] = new ModelRendererTurbo(this, 196, 9, textureX, textureY); // Box 894
		bodyModel[209] = new ModelRendererTurbo(this, 198, 12, textureX, textureY); // Box 895
		bodyModel[210] = new ModelRendererTurbo(this, 196, 3, textureX, textureY); // Box 202
		bodyModel[211] = new ModelRendererTurbo(this, 487, 83, textureX, textureY, "lamp"); // Box 438 headlight o canada
		bodyModel[212] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 439
		bodyModel[213] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 451
		bodyModel[214] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 452
		bodyModel[215] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 453
		bodyModel[216] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 454
		bodyModel[217] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, BoxName.commander); // Box 340 glow commander
		bodyModel[218] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[219] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 382
		bodyModel[220] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[221] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[222] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f
		bodyModel[223] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f
		bodyModel[224] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[225] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 350 liveryimg 3 glow
		bodyModel[226] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 liveryimg 3 glow
		bodyModel[227] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[228] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 354
		bodyModel[229] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 355
		bodyModel[230] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 356
		bodyModel[231] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 357
		bodyModel[232] = new ModelRendererTurbo(this, 253, 51, textureX, textureY); // Box 369
		bodyModel[233] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[234] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[235] = new ModelRendererTurbo(this, 260, 56, textureX, textureY); // Box 372
		bodyModel[236] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[237] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[238] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[239] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[240] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[241] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[242] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[243] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[244] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[245] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[246] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[247] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[248] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[249] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[250] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[251] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[252] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[253] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[254] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[255] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 388 ditchlight r
		bodyModel[256] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, BoxName.ditch); // Box 389 ditchlight r
		bodyModel[257] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 446
		bodyModel[258] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 447
		bodyModel[259] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[260] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[261] = new ModelRendererTurbo(this, 63, 7, textureX, textureY); // Box 394 awvr window
		bodyModel[262] = new ModelRendererTurbo(this, 53, 2, textureX, textureY); // Box 394 awvr window
		bodyModel[263] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 396
		bodyModel[264] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 397
		bodyModel[265] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 398
		bodyModel[266] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 399
		bodyModel[267] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 400
		bodyModel[268] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 401
		bodyModel[269] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 402
		bodyModel[270] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 403
		bodyModel[271] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 395
		bodyModel[272] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 396
		bodyModel[273] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 397
		bodyModel[274] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 398
		bodyModel[275] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[276] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[277] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[278] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[279] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[280] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[281] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 414
		bodyModel[282] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 415
		bodyModel[283] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 416 ditchlight r
		bodyModel[284] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, BoxName.ditch); // Box 417 ditchlight r
		bodyModel[285] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[286] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[287] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[288] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[289] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 394
		bodyModel[290] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 395
		bodyModel[291] = new ModelRendererTurbo(this, 73, 134, textureX, textureY); // Box 396
		bodyModel[292] = new ModelRendererTurbo(this, 73, 134, textureX, textureY); // Box 397
		bodyModel[293] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 398
		bodyModel[294] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 399
		bodyModel[295] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 400
		bodyModel[296] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 401
		bodyModel[297] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 402
		bodyModel[298] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 403
		bodyModel[299] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 404
		bodyModel[300] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 405
		bodyModel[301] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[302] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[303] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[304] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[305] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[306] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[307] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[308] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[309] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[310] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[311] = new ModelRendererTurbo(this, 133, 70, textureX, textureY); // Box 5
		bodyModel[312] = new ModelRendererTurbo(this, 462, 28, textureX, textureY); // Box 196 winterization hatch
		bodyModel[313] = new ModelRendererTurbo(this, 355, 171, textureX, textureY); // Box 418
		bodyModel[314] = new ModelRendererTurbo(this, 403, 171, textureX, textureY); // Box 419
		bodyModel[315] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[316] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[317] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[318] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[319] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[320] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[321] = new ModelRendererTurbo(this, 208, 12, textureX, textureY); // Box 421 prime base
		bodyModel[322] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[323] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[324] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[325] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[326] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[327] = new ModelRendererTurbo(this, 175, 5, textureX, textureY); // Box 287
		bodyModel[328] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 288
		bodyModel[329] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 289
		bodyModel[330] = new ModelRendererTurbo(this, 114, 58, textureX, textureY); // Box 43
		bodyModel[331] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 298
		bodyModel[332] = new ModelRendererTurbo(this, 485, 13, textureX, textureY); // Box 376
		bodyModel[333] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 377
		bodyModel[334] = new ModelRendererTurbo(this, 459, 19, textureX, textureY); // Box 378
		bodyModel[335] = new ModelRendererTurbo(this, 500, 10, textureX, textureY); // Box 379
		bodyModel[336] = new ModelRendererTurbo(this, 459, 1, textureX, textureY); // Box 380
		bodyModel[337] = new ModelRendererTurbo(this, 474, 10, textureX, textureY); // Box 381
		bodyModel[338] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 394
		bodyModel[339] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 395
		bodyModel[340] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 396
		bodyModel[341] = new ModelRendererTurbo(this, 267, 12, textureX, textureY); // Box 397
		bodyModel[342] = new ModelRendererTurbo(this, 269, 8, textureX, textureY); // Box 399
		bodyModel[343] = new ModelRendererTurbo(this, 250, 1, textureX, textureY, BoxName.commander); // Box 340 glow commander
		bodyModel[344] = new ModelRendererTurbo(this, 249, 5, textureX, textureY); // Box 341
		bodyModel[345] = new ModelRendererTurbo(this, 260, 20, textureX, textureY); // Box 114
		bodyModel[346] = new ModelRendererTurbo(this, 260, 17, textureX, textureY); // Box 74
		bodyModel[347] = new ModelRendererTurbo(this, 260, 23, textureX, textureY); // Box 78
		bodyModel[348] = new ModelRendererTurbo(this, 258, 12, textureX, textureY); // Box 877
		bodyModel[349] = new ModelRendererTurbo(this, 260, 8, textureX, textureY); // Box 332
		bodyModel[350] = new ModelRendererTurbo(this, 260, 8, textureX, textureY); // Box 333
		bodyModel[351] = new ModelRendererTurbo(this, 269, 8, textureX, textureY); // Box 399
		bodyModel[352] = new ModelRendererTurbo(this, 232, 43, textureX, textureY); // Box 369
		bodyModel[353] = new ModelRendererTurbo(this, 234, 51, textureX, textureY); // Box 370
		bodyModel[354] = new ModelRendererTurbo(this, 234, 48, textureX, textureY); // Box 371
		bodyModel[355] = new ModelRendererTurbo(this, 237, 48, textureX, textureY); // Box 372
		bodyModel[356] = new ModelRendererTurbo(this, 244, 48, textureX, textureY); // Box 373
		bodyModel[357] = new ModelRendererTurbo(this, 244, 51, textureX, textureY); // Box 374
		bodyModel[358] = new ModelRendererTurbo(this, 221, 32, textureX, textureY); // Box 327
		bodyModel[359] = new ModelRendererTurbo(this, 223, 26, textureX, textureY); // Box 328
		bodyModel[360] = new ModelRendererTurbo(this, 223, 38, textureX, textureY); // Box 329
		bodyModel[361] = new ModelRendererTurbo(this, 232, 32, textureX, textureY); // Box 330
		bodyModel[362] = new ModelRendererTurbo(this, 225, 29, textureX, textureY); // Box 331
		bodyModel[363] = new ModelRendererTurbo(this, 225, 35, textureX, textureY); // Box 332
		bodyModel[364] = new ModelRendererTurbo(this, 171, 22, textureX, textureY); // Box 371
		bodyModel[365] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 371
		bodyModel[366] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[367] = new ModelRendererTurbo(this, 250, 53, textureX, textureY); // Box 415
		bodyModel[368] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 384
		bodyModel[369] = new ModelRendererTurbo(this, 239, 32, textureX, textureY); // Box 385
		bodyModel[370] = new ModelRendererTurbo(this, 239, 29, textureX, textureY); // Box 386
		bodyModel[371] = new ModelRendererTurbo(this, 246, 31, textureX, textureY); // Box 387
		bodyModel[372] = new ModelRendererTurbo(this, 251, 32, textureX, textureY); // Box 327
		bodyModel[373] = new ModelRendererTurbo(this, 253, 26, textureX, textureY); // Box 328
		bodyModel[374] = new ModelRendererTurbo(this, 253, 38, textureX, textureY); // Box 329
		bodyModel[375] = new ModelRendererTurbo(this, 262, 32, textureX, textureY); // Box 330
		bodyModel[376] = new ModelRendererTurbo(this, 255, 29, textureX, textureY); // Box 331
		bodyModel[377] = new ModelRendererTurbo(this, 255, 35, textureX, textureY); // Box 332
		bodyModel[378] = new ModelRendererTurbo(this, 267, 35, textureX, textureY); // Box 384
		bodyModel[379] = new ModelRendererTurbo(this, 269, 32, textureX, textureY); // Box 385
		bodyModel[380] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Box 386
		bodyModel[381] = new ModelRendererTurbo(this, 276, 32, textureX, textureY); // Box 387
		bodyModel[382] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 373
		bodyModel[383] = new ModelRendererTurbo(this, 216, 20, textureX, textureY); // Box 421 prime base
		bodyModel[384] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[385] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[386] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[387] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[388] = new ModelRendererTurbo(this, 182, 21, textureX, textureY); // Box 374
		bodyModel[389] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 320
		bodyModel[390] = new ModelRendererTurbo(this, 200, 18, textureX, textureY); // Box 321
		bodyModel[391] = new ModelRendererTurbo(this, 197, 13, textureX, textureY); // Box 323
		bodyModel[392] = new ModelRendererTurbo(this, 197, 17, textureX, textureY); // Box 324
		bodyModel[393] = new ModelRendererTurbo(this, 250, 15, textureX, textureY, BoxName.commander); // Box 340 glow commander
		bodyModel[394] = new ModelRendererTurbo(this, 249, 19, textureX, textureY); // Box 341
		bodyModel[395] = new ModelRendererTurbo(this, 168, 56, textureX, textureY); // Box 384
		bodyModel[396] = new ModelRendererTurbo(this, 170, 53, textureX, textureY); // Box 385
		bodyModel[397] = new ModelRendererTurbo(this, 170, 50, textureX, textureY); // Box 386
		bodyModel[398] = new ModelRendererTurbo(this, 177, 52, textureX, textureY); // Box 387
		bodyModel[399] = new ModelRendererTurbo(this, 197, 43, textureX, textureY); // Box 384
		bodyModel[400] = new ModelRendererTurbo(this, 197, 40, textureX, textureY); // Box 385
		bodyModel[401] = new ModelRendererTurbo(this, 197, 37, textureX, textureY); // Box 386
		bodyModel[402] = new ModelRendererTurbo(this, 204, 40, textureX, textureY); // Box 387
		bodyModel[403] = new ModelRendererTurbo(this, 171, 25, textureX, textureY); // Box 373
		bodyModel[404] = new ModelRendererTurbo(this, 168, 25, textureX, textureY); // Box 373
		bodyModel[405] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[406] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[407] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[408] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[409] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[410] = new ModelRendererTurbo(this, 180, 145, textureX, textureY); // Box 359 atsf 5700
		bodyModel[411] = new ModelRendererTurbo(this, 477, 47, textureX, textureY); // Box 381 sp mount
		bodyModel[412] = new ModelRendererTurbo(this, 478, 40, textureX, textureY); // Box 31 sp mount
		bodyModel[413] = new ModelRendererTurbo(this, 490, 46, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[414] = new ModelRendererTurbo(this, 497, 46, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[415] = new ModelRendererTurbo(this, 497, 51, textureX, textureY, "lamp"); // Box 386 lamp rear
		bodyModel[416] = new ModelRendererTurbo(this, 490, 51, textureX, textureY, "lamp"); // Box 387lamp rear
		bodyModel[417] = new ModelRendererTurbo(this, 490, 41, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[418] = new ModelRendererTurbo(this, 485, 38, textureX, textureY); // Box 389 sp mount
		bodyModel[419] = new ModelRendererTurbo(this, 430, 101, textureX, textureY); // Box 34
		bodyModel[420] = new ModelRendererTurbo(this, 406, 115, textureX, textureY); // Box 34
		bodyModel[421] = new ModelRendererTurbo(this, 443, 135, textureX, textureY); // Box 34
		bodyModel[422] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 356
		bodyModel[423] = new ModelRendererTurbo(this, 443, 132, textureX, textureY); // Box 34
		bodyModel[424] = new ModelRendererTurbo(this, 451, 132, textureX, textureY); // Box 34
		bodyModel[425] = new ModelRendererTurbo(this, 461, 130, textureX, textureY); // Box 34
		bodyModel[426] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 34
		bodyModel[427] = new ModelRendererTurbo(this, 469, 99, textureX, textureY); // Box 34
		bodyModel[428] = new ModelRendererTurbo(this, 464, 53, textureX, textureY); // Box 34
		bodyModel[429] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[430] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[431] = new ModelRendererTurbo(this, 180, 166, textureX, textureY); // Box 497
		bodyModel[432] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[433] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[434] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[435] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[436] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[437] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 cull
		bodyModel[438] = new ModelRendererTurbo(this, 394, 208, textureX, textureY, "cull"); // Box 380 cull round ear
		bodyModel[439] = new ModelRendererTurbo(this, 392, 237, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[440] = new ModelRendererTurbo(this, 396, 230, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[441] = new ModelRendererTurbo(this, 454, 208, textureX, textureY, "cull"); // Box 380 cull round ear
		bodyModel[442] = new ModelRendererTurbo(this, 452, 237, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[443] = new ModelRendererTurbo(this, 456, 230, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[444] = new ModelRendererTurbo(this, 454, 217, textureX, textureY, "cull"); // Box 380 cull angle ear
		bodyModel[445] = new ModelRendererTurbo(this, 454, 224, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[446] = new ModelRendererTurbo(this, 394, 217, textureX, textureY, "cull"); // Box 380 cull angle ear
		bodyModel[447] = new ModelRendererTurbo(this, 394, 224, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[448] = new ModelRendererTurbo(this, 178, 241, textureX, textureY); // Box 23
		bodyModel[449] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 63
		bodyModel[450] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[451] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 4
		bodyModel[452] = new ModelRendererTurbo(this, 449, 72, textureX, textureY); // Box 203
		bodyModel[453] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 116
		bodyModel[454] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[455] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 409
		bodyModel[456] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[457] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[458] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[459] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[460] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[461] = new ModelRendererTurbo(this, 380, 65, textureX, textureY); // Box 198
		bodyModel[462] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 199
		bodyModel[463] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[464] = new ModelRendererTurbo(this, 253, 114, textureX, textureY); // Box 113
		bodyModel[465] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[466] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 408
		bodyModel[467] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[468] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[469] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[470] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // Box 195
		bodyModel[471] = new ModelRendererTurbo(this, 353, 110, textureX, textureY); // Box 197
		bodyModel[472] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 200
		bodyModel[473] = new ModelRendererTurbo(this, 383, 65, textureX, textureY); // Box 201
		bodyModel[474] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[475] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[476] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[477] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box 563
		bodyModel[478] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[479] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[480] = new ModelRendererTurbo(this, 465, 76, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[481] = new ModelRendererTurbo(this, 491, 76, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[482] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[483] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[484] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[485] = new ModelRendererTurbo(this, 450, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[486] = new ModelRendererTurbo(this, 51, 78, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[487] = new ModelRendererTurbo(this, 51, 78, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[488] = new ModelRendererTurbo(this, 476, 72, textureX, textureY, "lamp"); // Box 532 numberboard rear high
		bodyModel[489] = new ModelRendererTurbo(this, 476, 72, textureX, textureY, "lamp"); // Box 533 numberboard high rear
		bodyModel[490] = new ModelRendererTurbo(this, 173, 57, textureX, textureY); // Box 184 o2 generator
		bodyModel[491] = new ModelRendererTurbo(this, 56, 41, textureX, textureY); // Box 133
		bodyModel[492] = new ModelRendererTurbo(this, 306, 213, textureX, textureY); // Box 297 vent 2 part f
		bodyModel[493] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Box 299 vent 2 part e
		bodyModel[494] = new ModelRendererTurbo(this, 306, 213, textureX, textureY); // Box 272 vent 2 part f
		bodyModel[495] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Box 273 vent 2 part e
		bodyModel[496] = new ModelRendererTurbo(this, 190, 202, textureX, textureY); // Box 847 vent 1 part f
		bodyModel[497] = new ModelRendererTurbo(this, 190, 213, textureX, textureY); // Box 850 vent 1 part e
		bodyModel[498] = new ModelRendererTurbo(this, 101, 223, textureX, textureY); // Box 313
		bodyModel[499] = new ModelRendererTurbo(this, 83, 234, textureX, textureY); // Box 105

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(41.5F, -21F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[2].setRotationPoint(41.5F, -21F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 43, 2, 4, 0F); // Box 36
		bodyModel[3].setRotationPoint(-20.5F, -2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 56, 21, 14, 0F); // Box 34
		bodyModel[4].setRotationPoint(-20.5F, -21F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[6].setRotationPoint(-47.51F, 0F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[7].setRotationPoint(-43.5F, 2F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[8].setRotationPoint(-43.5F, 0F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[9].setRotationPoint(-43.5F, 0F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[10].setRotationPoint(-47.51F, -8F, -8F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[11].setRotationPoint(-47.51F, -8F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[12].setRotationPoint(-47.5F, -2F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[13].setRotationPoint(-47.5F, -2F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[14].setRotationPoint(-51.5F, 3F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[15].setRotationPoint(-51.51F, 0F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[16].setRotationPoint(-47.5F, -8F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[17].setRotationPoint(-47.5F, -8F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[18].setRotationPoint(-48.5F, -8F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[19].setRotationPoint(-47.5F, -8F, 4F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[20].setRotationPoint(-47.5F, -8F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-50.5F, 6F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[22].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[23].setRotationPoint(-50.5F, 7F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-50.5F, 6F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(-51F, 5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-50.5F, 7F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[27].setRotationPoint(-48.5F, 2.5F, -2F);

		bodyModel[28].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[28].setRotationPoint(-42.5F, 0F, 7F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[29].setRotationPoint(46.51F, 0F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[30].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[31].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[32].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[33].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[34].setRotationPoint(46.5F, 3F, -1.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[35].setRotationPoint(46.5F, -8F, -8F);
		bodyModel[35].rotateAngleY = -3.14159265F;

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[36].setRotationPoint(46.51F, -2F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[37].setRotationPoint(46.5F, -8F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[38].setRotationPoint(46.51F, -2F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[39].setRotationPoint(46.51F, -8F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[40].setRotationPoint(46.51F, -8F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[41].setRotationPoint(47.5F, 0F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[42].setRotationPoint(47.49F, -8F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[43].setRotationPoint(46.49F, -8F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[44].setRotationPoint(46.5F, 6F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[45].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[46].setRotationPoint(46.5F, 7F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[47].setRotationPoint(46.5F, 6F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[48].setRotationPoint(47F, 5F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[49].setRotationPoint(46.5F, 7F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[50].setRotationPoint(46.5F, 2.5F, -2F);

		bodyModel[51].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[51].setRotationPoint(-32F, -18F, -10.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[52].setRotationPoint(-21.5F, -18F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[53].setRotationPoint(-31.5F, -18F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[54].setRotationPoint(-31.5F, -18F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[55].setRotationPoint(-32.5F, -18F, -7F);

		bodyModel[56].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[56].setRotationPoint(-21F, -18F, 10.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[57].setRotationPoint(-32.5F, -4F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[58].setRotationPoint(46.5F, 0F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[59].setRotationPoint(46.5F, 0F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[60].setRotationPoint(46.49F, -8F, 4F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[61].setRotationPoint(46.51F, 7F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[62].setRotationPoint(-32.5F, -21F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[63].setRotationPoint(-21.5F, -21F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[64].setRotationPoint(-32.5F, -21F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[65].setRotationPoint(-34.5F, -21F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[66].setRotationPoint(-34.5F, -21F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[67].setRotationPoint(-34.5F, -21F, 1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[68].setRotationPoint(-35F, -21F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[69].setRotationPoint(-35F, -19F, -1F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[70].setRotationPoint(-21.5F, -21F, -7F);

		bodyModel[71].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[71].setRotationPoint(-31.5F, -21F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[72].setRotationPoint(-31.5F, -21F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[73].setRotationPoint(-31.5F, -21F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[74].setRotationPoint(-21.5F, -21F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[75].setRotationPoint(-32.5F, -21F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[76].setRotationPoint(46.51F, 8F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[77].setRotationPoint(-47.5F, 8F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[78].setRotationPoint(-47.5F, 7F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[79].setRotationPoint(-39.5F, -4F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 246
		bodyModel[80].setRotationPoint(-40.5F, -4F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[81].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[82].setRotationPoint(-43.5F, -6F, -11.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[83].setRotationPoint(-43.5F, -10F, 10.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[84].setRotationPoint(-43.5F, -12F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[85].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[86].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[87].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[88].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 258
		bodyModel[89].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[90].setRotationPoint(-38.5F, -12F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[91].setRotationPoint(-40.5F, -8F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 267
		bodyModel[92].setRotationPoint(-43.5F, -12F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[93].setRotationPoint(-49.5F, 0F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[94].setRotationPoint(-49.5F, 0F, 0F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[95].setRotationPoint(-20.5F, -10F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[96].setRotationPoint(-16F, -13F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[97].setRotationPoint(-16F, -15F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[98].setRotationPoint(-17.5F, -22F, -6F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[99].setRotationPoint(-6.5F, -22.5F, -2.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[100].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[101].setRotationPoint(33.5F, -22F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[102].setRotationPoint(26.5F, -22F, -3F);

		bodyModel[103].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[103].setRotationPoint(-1.5F, -22F, -3F);

		bodyModel[104].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[104].setRotationPoint(19.5F, -22F, -3F);

		bodyModel[105].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[105].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[106].setRotationPoint(-40.5F, -4F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[107].setRotationPoint(-41.5F, -4F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 285
		bodyModel[108].setRotationPoint(-18.5F, -20.5F, -7.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 286
		bodyModel[109].setRotationPoint(-18.5F, -20.5F, 6.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[110].setRotationPoint(42.5F, -6F, -11.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[111].setRotationPoint(42.5F, -8F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[112].setRotationPoint(42.5F, -6F, 10.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[113].setRotationPoint(42.5F, -8F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 291
		bodyModel[114].setRotationPoint(-16.5F, -8F, 11F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[115].setRotationPoint(-20.5F, -4F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[116].setRotationPoint(-18.5F, -4F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[117].setRotationPoint(-17.5F, -4F, 11F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[118].setRotationPoint(-20.5F, -12F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[119].setRotationPoint(-19.5F, -10F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[120].setRotationPoint(46.5F, 0F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[121].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[122].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[123].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[124].setRotationPoint(42.75F, -18F, -2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[125].setRotationPoint(44F, -18F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[126].setRotationPoint(44F, -18F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[127].setRotationPoint(-20.5F, -21F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[128].setRotationPoint(-7.5F, -21F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[129].setRotationPoint(-20.5F, -21F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[130].setRotationPoint(-7.5F, -21F, 7F);

		bodyModel[131].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 312
		bodyModel[131].setRotationPoint(-17.5F, -10F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[132].setRotationPoint(-19.5F, -12F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[133].setRotationPoint(-20.5F, -12F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[134].setRotationPoint(22.5F, -10F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 18, 8, 0, 0F); // Box 316
		bodyModel[135].setRotationPoint(24.5F, -8F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[136].setRotationPoint(12.5F, -22F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[137].setRotationPoint(41F, -21.5F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[138].setRotationPoint(-42.5F, -13.5F, -0.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[139].setRotationPoint(-36.5F, -21F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[140].setRotationPoint(-37.5F, -21F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[141].setRotationPoint(-37.5F, -21F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[142].setRotationPoint(-45.5F, -8F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[143].setRotationPoint(-45.5F, -8F, 0F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 43
		bodyModel[144].setRotationPoint(-42.5F, -13F, -6F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[145].setRotationPoint(-41.5F, -13F, -6F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[146].setRotationPoint(-41.5F, -13F, -7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[147].setRotationPoint(-41F, -8.5F, -7F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[148].setRotationPoint(-40.5F, -6.5F, -7F);

		bodyModel[149].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[149].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[150].setRotationPoint(-41.5F, -9F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[151].setRotationPoint(-1.5F, -21F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[152].setRotationPoint(-1.5F, -21F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[153].setRotationPoint(-6.5F, -21F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[154].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[155].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[156].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[157].setRotationPoint(-45.5F, -12.5F, -1F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[158].setRotationPoint(-40.5F, -11F, -7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[159].setRotationPoint(-36.5F, -19F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[160].setRotationPoint(-36.5F, -20F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[161].setRotationPoint(-36.25F, -18.5F, -0.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[162].setRotationPoint(-36.5F, -21F, -0.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[163].setRotationPoint(-29.5F, -23F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[164].setRotationPoint(-30.5F, -23F, 2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[165].setRotationPoint(-30.5F, -22F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[166].setRotationPoint(13.5F, -22.5F, -7F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[167].setRotationPoint(12.5F, -23.5F, -6.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[168].setRotationPoint(11.5F, -23.5F, -5.25F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[169].setRotationPoint(-35.5F, -23F, -1.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[170].setRotationPoint(-34F, -23F, -0.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[171].setRotationPoint(-34.75F, -23F, 0.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[172].setRotationPoint(-33.75F, -22.5F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[173].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[174].setRotationPoint(-13.5F, 1F, -10.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[175].setRotationPoint(-13.25F, 2.5F, -10.25F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[176].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[177].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[178].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[179].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[180].setRotationPoint(45.5F, -2F, -6.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[181].setRotationPoint(45.75F, -2F, -6.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[182].setRotationPoint(45.75F, -2F, 4.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[183].setRotationPoint(45.5F, -2F, 4.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[184].setRotationPoint(-19.5F, -19F, -8.7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[185].setRotationPoint(-19.5F, -20F, -8.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[186].setRotationPoint(-19.25F, -18.5F, -8.45F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[187].setRotationPoint(-19.5F, -21F, -8.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[188].setRotationPoint(-33.82F, -22F, -0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[189].setRotationPoint(-34F, -23F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[190].setRotationPoint(-28.5F, -22F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f
		bodyModel[191].setRotationPoint(-48.25F, 1F, -5.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[192].setRotationPoint(-48F, 1F, -5.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f
		bodyModel[193].setRotationPoint(-48.25F, 1F, 3.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[194].setRotationPoint(-48F, 1F, 3.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[195].setRotationPoint(-30F, -18F, 11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[196].setRotationPoint(-30F, -18F, -12F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[197].setRotationPoint(-30.5F, -16F, -12F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[198].setRotationPoint(-30.5F, -16F, 11F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[199].setRotationPoint(-34.5F, -23F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[200].setRotationPoint(-35.25F, -23F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[201].setRotationPoint(-35.25F, -23F, -2F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[202].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[203].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[204].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[205].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[206].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[207].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[208].setRotationPoint(39.5F, -23F, 4.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[209].setRotationPoint(39.5F, -22F, 4.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[210].setRotationPoint(40.5F, -23.5F, 3.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight o canada
		bodyModel[211].setRotationPoint(44F, -18F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[212].setRotationPoint(-15.5F, -23F, -3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[213].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[214].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[215].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[216].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[217].setRotationPoint(-28F, -23F, -0.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[218].setRotationPoint(-27.82F, -22F, -0.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[219].setRotationPoint(-42.5F, -21F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[220].setRotationPoint(-45.5F, -21F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[221].setRotationPoint(-45.5F, -21F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f
		bodyModel[222].setRotationPoint(-46F, -19F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f
		bodyModel[223].setRotationPoint(-46F, -19F, -2F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[224].setRotationPoint(-45.75F, -19F, -2F);

		bodyModel[225].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 liveryimg 3 glow
		bodyModel[225].setRotationPoint(-43F, -16F, 6F);
		bodyModel[225].rotateAngleY = -0.40142573F;

		bodyModel[226].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 liveryimg 3 glow
		bodyModel[226].setRotationPoint(-43F, -16F, -6F);
		bodyModel[226].rotateAngleY = 0.40142573F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[227].setRotationPoint(-42.5F, -21.5F, -0.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[228].setRotationPoint(-45F, -23F, -5.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[229].setRotationPoint(-44F, -22.75F, -4.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[230].setRotationPoint(-44.5F, -22.75F, -6.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[231].setRotationPoint(-42.5F, -22F, -5.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[232].setRotationPoint(-20.5F, -23F, 2F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[233].setRotationPoint(-20.5F, -23F, 2F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[234].setRotationPoint(-20.5F, -23F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[235].setRotationPoint(-20.5F, -24F, 4F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[236].setRotationPoint(-17.5F, -23F, 6F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[237].setRotationPoint(-17.5F, -23F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[238].setRotationPoint(-45.5F, -10F, 1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[239].setRotationPoint(-44.48F, -13F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[240].setRotationPoint(-45.5F, -10F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[241].setRotationPoint(-45.5F, -12F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[242].setRotationPoint(-45.5F, -13F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[243].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[244].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[245].setRotationPoint(-45.5F, -11F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[246].setRotationPoint(-45.5F, -13F, 1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[247].setRotationPoint(-45.5F, -13F, -7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[248].setRotationPoint(-45.25F, -12F, -2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[249].setRotationPoint(-45.25F, -12F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[250].setRotationPoint(-45.25F, -14F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[251].setRotationPoint(-44.48F, -14F, -1.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[252].setRotationPoint(-44.65F, -13F, -2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[253].setRotationPoint(46F, 1F, 3.75F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[254].setRotationPoint(46F, 1F, -5.75F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r
		bodyModel[255].setRotationPoint(46.25F, 1F, -5.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r
		bodyModel[256].setRotationPoint(46.25F, 1F, 3.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[257].setRotationPoint(-51F, 3F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[258].setRotationPoint(-50.5F, 3F, 2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[259].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[260].setRotationPoint(-50.5F, 4F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[261].setRotationPoint(-33.5F, -17F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[262].setRotationPoint(-33.5F, -17F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[263].setRotationPoint(42.5F, 3F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[264].setRotationPoint(43.5F, 1F, -8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[265].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[266].setRotationPoint(42.5F, 8F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		bodyModel[267].setRotationPoint(42.5F, 8F, 9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 401
		bodyModel[268].setRotationPoint(42.5F, 5F, 8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[269].setRotationPoint(42.5F, 3F, 7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[270].setRotationPoint(43.5F, 1F, 7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[271].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[272].setRotationPoint(46.5F, 4F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[273].setRotationPoint(47F, 3F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[274].setRotationPoint(46.5F, 3F, 2F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[275].setRotationPoint(-40.5F, -2F, -11F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[276].setRotationPoint(-41.5F, -2F, 7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[277].setRotationPoint(-48.5F, -3F, -5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[278].setRotationPoint(-48.5F, -3F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[279].setRotationPoint(-48.75F, -3F, -5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[280].setRotationPoint(-48.75F, -3F, 3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[281].setRotationPoint(46.5F, -3F, 3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[282].setRotationPoint(46.5F, -3F, -5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r
		bodyModel[283].setRotationPoint(46.75F, -3F, -5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r
		bodyModel[284].setRotationPoint(46.75F, -3F, 3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[285].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[286].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[287].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[288].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[289].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[290].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[291].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 397
		bodyModel[292].setRotationPoint(43.5F, 2F, 7F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 398
		bodyModel[293].setRotationPoint(42.5F, 4F, 8F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 399
		bodyModel[294].setRotationPoint(42.5F, 7F, 9F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[295].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[296].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[297].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 403
		bodyModel[298].setRotationPoint(43.5F, 2F, -7F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 404
		bodyModel[299].setRotationPoint(42.5F, 4F, -8F);

		bodyModel[300].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 405
		bodyModel[300].setRotationPoint(42.5F, 7F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[301].setRotationPoint(-31.5F, -22F, 7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[302].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[303].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[304].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[305].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[306].setRotationPoint(-32F, -21F, 7F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[307].setRotationPoint(-31.5F, -13F, -3F);

		bodyModel[308].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[308].setRotationPoint(-31.6F, -12F, -5F);
		bodyModel[308].rotateAngleY = -0.38397244F;

		bodyModel[309].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[309].setRotationPoint(-30F, -14F, -5F);
		bodyModel[309].rotateAngleY = -0.38397244F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[310].setRotationPoint(-29.5F, -17F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[311].setRotationPoint(-29.5F, -18F, 10F);

		bodyModel[312].addBox(0F, 0F, 0F, 13, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[312].setRotationPoint(13F, -22.5F, -3.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[313].setRotationPoint(46.5F, 0F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[314].setRotationPoint(46.5F, 0F, -7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[315].setRotationPoint(-32F, -21.5F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[316].setRotationPoint(-31.5F, -22.5F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[317].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[318].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[319].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[320].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[321].setRotationPoint(-33.5F, -22F, -1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[322].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[323].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[324].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[325].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[326].setRotationPoint(-14F, 2.5F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[327].setRotationPoint(-14F, 1F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[328].setRotationPoint(-14F, 2F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[329].setRotationPoint(-13.5F, 2.5F, -10.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 43
		bodyModel[330].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[331].setRotationPoint(-45.5F, -10F, -7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[332].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[333].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[334].setRotationPoint(16.5F, -21F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[335].setRotationPoint(40.5F, -21F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[336].setRotationPoint(16.5F, -21F, 7F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 381
		bodyModel[337].setRotationPoint(40.5F, -21F, 7F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[338].setRotationPoint(45F, -23F, -0.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[339].setRotationPoint(45F, -22F, -0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[340].setRotationPoint(44.75F, -21.5F, -0.25F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 397
		bodyModel[341].setRotationPoint(44.75F, -23.51F, -1.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[342].setRotationPoint(43F, -23F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[343].setRotationPoint(-43F, -23F, 3.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[344].setRotationPoint(-42.82F, -22F, 3.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[345].setRotationPoint(-47F, -22F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[346].setRotationPoint(-47F, -23F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[347].setRotationPoint(-46.75F, -21.5F, -0.25F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[348].setRotationPoint(-46.75F, -23.51F, -1.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[349].setRotationPoint(-46F, -23F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[350].setRotationPoint(-46F, -23F, 1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[351].setRotationPoint(43F, -23F, 1F);

		bodyModel[352].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[352].setRotationPoint(-24.5F, -23F, -5F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[353].setRotationPoint(-24.5F, -23F, -5F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[354].setRotationPoint(-24.5F, -23F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[355].setRotationPoint(-24.5F, -24F, -3F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[356].setRotationPoint(-21.5F, -23F, -1F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[357].setRotationPoint(-21.5F, -23F, -5F);

		bodyModel[358].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[358].setRotationPoint(-29F, -22.25F, -1.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[359].setRotationPoint(-28F, -22.25F, -0.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[360].setRotationPoint(-26.5F, -22.25F, 0.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[361].setRotationPoint(-26.5F, -21.5F, -0.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[362].setRotationPoint(-27.5F, -23.25F, 0.25F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[363].setRotationPoint(-26.5F, -23.25F, -1F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[364].setRotationPoint(-36.5F, -23F, 2F);

		bodyModel[365].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[365].setRotationPoint(-39.5F, -23F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[366].setRotationPoint(-25.5F, -22F, -5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[367].setRotationPoint(-28.5F, -22F, 0F);

		bodyModel[368].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[368].setRotationPoint(-34F, -22.5F, 7F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[369].setRotationPoint(-33F, -22.5F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[370].setRotationPoint(-33.25F, -22.5F, 6F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[371].setRotationPoint(-32.25F, -22F, 6F);

		bodyModel[372].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[372].setRotationPoint(-36.25F, -22.5F, -1.5F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[373].setRotationPoint(-34.25F, -22.25F, 0.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[374].setRotationPoint(-33.75F, -23.25F, -0.5F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[375].setRotationPoint(-33.75F, -21.5F, -0.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[376].setRotationPoint(-34.75F, -23.5F, 0.25F);

		bodyModel[377].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[377].setRotationPoint(-33.75F, -23.5F, -1F);

		bodyModel[378].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[378].setRotationPoint(-31.5F, -22.5F, 2.5F);

		bodyModel[379].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[379].setRotationPoint(-30F, -22.5F, 3.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[380].setRotationPoint(-30.75F, -22.5F, 4.5F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[381].setRotationPoint(-29.75F, -22F, 3.5F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[382].setRotationPoint(-23.5F, -23F, 0F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[383].setRotationPoint(-32.5F, -22F, -4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[384].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[385].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[386].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[387].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[388].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374
		bodyModel[388].setRotationPoint(-16.5F, -23.5F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[389].setRotationPoint(-30F, -22.5F, -0.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[390].setRotationPoint(-30F, -23.5F, -0.5F);

		bodyModel[391].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 323
		bodyModel[391].setRotationPoint(-31.25F, -24F, -1.75F);
		bodyModel[391].rotateAngleY = -0.78539816F;

		bodyModel[392].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 324
		bodyModel[392].setRotationPoint(-31.25F, -23F, -1.75F);
		bodyModel[392].rotateAngleY = -0.78539816F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[393].setRotationPoint(-22F, -23F, -0.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[394].setRotationPoint(-21.82F, -22F, -0.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[395].setRotationPoint(-23.25F, -23F, -1.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[396].setRotationPoint(-24F, -23F, -0.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[397].setRotationPoint(-23F, -23F, 0.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[398].setRotationPoint(-23F, -22.5F, -0.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 384
		bodyModel[399].setRotationPoint(24.75F, -23.75F, -1.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[400].setRotationPoint(25.25F, -23.75F, -0.5F);

		bodyModel[401].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[401].setRotationPoint(24.5F, -23.75F, 0.5F);

		bodyModel[402].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[402].setRotationPoint(25.5F, -22.75F, -0.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[403].setRotationPoint(-27F, -23F, 5F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[404].setRotationPoint(-27F, -23F, -5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[405].setRotationPoint(-28.5F, -22F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[406].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[407].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[408].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[409].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 359 atsf 5700
		bodyModel[410].setRotationPoint(-21F, -11F, -11.05F);

		bodyModel[411].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[411].setRotationPoint(43F, -22.75F, -2F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[412].setRotationPoint(45F, -20.75F, -2F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[413].setRotationPoint(45.25F, -20.75F, -2F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[414].setRotationPoint(45.25F, -20.75F, 0F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[415].setRotationPoint(44.25F, -18.75F, 0F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[416].setRotationPoint(44.25F, -18.75F, -2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[417].setRotationPoint(45.25F, -22.75F, -1F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[418].setRotationPoint(45F, -22.75F, -1F);

		bodyModel[419].addBox(0F, 0F, 0F, 5, 11, 14, 0F); // Box 34
		bodyModel[419].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[420].addBox(0F, 0F, 0F, 5, 10, 13, 0F); // Box 34
		bodyModel[420].setRotationPoint(35.5F, -10F, -7F);

		bodyModel[421].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 34
		bodyModel[421].setRotationPoint(35.5F, -2F, 6F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[422].setRotationPoint(37.5F, -8F, 5.75F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[423].setRotationPoint(35.5F, -3F, 6F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[424].setRotationPoint(39.5F, -3F, 6F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[425].setRotationPoint(39.5F, -10F, 6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[426].setRotationPoint(35.5F, -10F, 6F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 34
		bodyModel[427].setRotationPoint(40.5F, -21F, -7F);

		bodyModel[428].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 34
		bodyModel[428].setRotationPoint(35.5F, -10F, 6F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[429].setRotationPoint(-33F, -23F, -3.5F);

		bodyModel[430].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[430].setRotationPoint(-32F, -23F, -3.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 497
		bodyModel[431].setRotationPoint(-21F, -11F, 11.05F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[432].setRotationPoint(17.5F, -20.35F, 7.95F);
		bodyModel[432].rotateAngleX = -0.31415927F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[433].setRotationPoint(17.5F, -20.05F, -8.95F);
		bodyModel[433].rotateAngleX = 0.31415927F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[434].setRotationPoint(25.5F, -20.35F, 7.95F);
		bodyModel[434].rotateAngleX = -0.31415927F;

		bodyModel[435].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[435].setRotationPoint(25.5F, -20.05F, -8.95F);
		bodyModel[435].rotateAngleX = 0.31415927F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[436].setRotationPoint(33.5F, -20.35F, 7.95F);
		bodyModel[436].rotateAngleX = -0.31415927F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 cull
		bodyModel[437].setRotationPoint(33.5F, -20.05F, -8.95F);
		bodyModel[437].rotateAngleX = 0.31415927F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 24, 5, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -2F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull round ear
		bodyModel[438].setRotationPoint(16.5F, -20.75F, 8.1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 24, 13, 5, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[439].setRotationPoint(16.5F, -15.75F, 6.1F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[440].setRotationPoint(16.5F, -20.75F, 7.1F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 24, 5, 3, 0F,0.25F, -2F, -0.5F, 0.15F, -2F, -0.5F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull round ear
		bodyModel[441].setRotationPoint(16.5F, -20.75F, -11.1F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 24, 13, 5, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[442].setRotationPoint(16.5F, -15.75F, -11.1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[443].setRotationPoint(16.5F, -20.75F, -8.1F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F,0.25F, 0F, -2.5F, 0.15F, 0F, -2.5F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull angle ear
		bodyModel[444].setRotationPoint(16.5F, -20.75F, -11.1F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[445].setRotationPoint(16.5F, -17.75F, -11.1F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull angle ear
		bodyModel[446].setRotationPoint(16.5F, -20.75F, 7.9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[447].setRotationPoint(16.5F, -17.75F, 7.9F);

		bodyModel[448].addBox(0F, 0F, 0F, 94, 2, 12, 0F); // Box 23
		bodyModel[448].setRotationPoint(-47.5F, 1F, -6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[449].setRotationPoint(-47.5F, 3F, -6.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 94, 1, 14, 0F); // Box 170
		bodyModel[450].setRotationPoint(-47.5F, 0F, -7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[451].setRotationPoint(-47.5F, 3F, -2.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[452].setRotationPoint(41.5F, 3F, -2.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[453].setRotationPoint(-13.5F, 1F, -11F);

		bodyModel[454].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[454].setRotationPoint(-30F, 3F, -2F);

		bodyModel[455].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[455].setRotationPoint(-29.5F, 1F, -11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[456].setRotationPoint(-29.5F, 2F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[457].setRotationPoint(-29.5F, 2F, 6F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[458].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[459].setRotationPoint(-28.5F, 2F, 9F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[460].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[461].setRotationPoint(-13.5F, 1F, 11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[462].setRotationPoint(-42.5F, 1F, 11F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[463].setRotationPoint(-15.5F, 1F, 8.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[464].setRotationPoint(12.5F, 1F, -11F);

		bodyModel[465].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[465].setRotationPoint(25F, 3F, -2F);

		bodyModel[466].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[466].setRotationPoint(25.5F, 1F, -11F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[467].setRotationPoint(25.5F, 2F, -10F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[468].setRotationPoint(26.5F, 2F, -11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[469].setRotationPoint(25.5F, 2F, 6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[470].setRotationPoint(26.5F, 2F, 9F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[471].setRotationPoint(11.5F, 1F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[472].setRotationPoint(12.5F, 1F, 11F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[473].setRotationPoint(11.5F, 1F, 11F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[474].setRotationPoint(-7.5F, 2F, -11.25F);
		bodyModel[474].rotateAngleX = 1.02974426F;

		bodyModel[475].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[475].setRotationPoint(-7.5F, 2F, 11.25F);
		bodyModel[475].rotateAngleX = 1.02974426F;
		bodyModel[475].rotateAngleY = -3.14159265F;

		bodyModel[476].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[476].setRotationPoint(-3.5F, 1.3F, -9.5F);
		bodyModel[476].rotateAngleX = 0.78539816F;

		bodyModel[477].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[477].setRotationPoint(-3.5F, 1.3F, 9.5F);
		bodyModel[477].rotateAngleX = 0.78539816F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[478].setRotationPoint(-43.15F, -12F, -6.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[479].setRotationPoint(-43.15F, -12F, 4.5F);

		bodyModel[480].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[480].setRotationPoint(41.95F, -15.5F, -6F);
		bodyModel[480].rotateAngleY = -0.41887902F;

		bodyModel[481].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[481].setRotationPoint(41.95F, -15.5F, 6F);
		bodyModel[481].rotateAngleY = 0.41887902F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[482].setRotationPoint(41.15F, -12F, -6.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[483].setRotationPoint(41.15F, -12F, 4.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[484].setRotationPoint(41.15F, -18F, -6.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[485].setRotationPoint(41.15F, -18F, 4.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[486].setRotationPoint(-32.55F, -19.5F, -6F);
		bodyModel[486].rotateAngleY = 0.38397244F;

		bodyModel[487].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[487].setRotationPoint(-32.55F, -19.5F, 6F);
		bodyModel[487].rotateAngleY = -0.38397244F;

		bodyModel[488].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532 numberboard rear high
		bodyModel[488].setRotationPoint(41.95F, -20.5F, -6F);
		bodyModel[488].rotateAngleY = -0.41887902F;

		bodyModel[489].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533 numberboard high rear
		bodyModel[489].setRotationPoint(41.95F, -20.5F, 6F);
		bodyModel[489].rotateAngleY = 0.41887902F;

		bodyModel[490].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[490].setRotationPoint(-28.5F, -22.75F, -4F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[491].setRotationPoint(-34.5F, -17F, -1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, 0F, -5F, 0F); // Box 297 vent 2 part f
		bodyModel[492].setRotationPoint(30.75F, -20.5F, -7.25F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, -9.25F, 0F, 0F, -9.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9.25F, -5F, 0F, -9.25F, -5F, 0F, 0F, -5F, 0F); // Box 299 vent 2 part e
		bodyModel[493].setRotationPoint(30.75F, -20.5F, 6.25F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, 0F, -4F, 0F); // Box 272 vent 2 part f
		bodyModel[494].setRotationPoint(20.5F, -21.5F, -7.25F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, -1F, 0F, -9.25F, -1F, 0F, -9.25F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -9.25F, -4F, 0F, -9.25F, -4F, 0F, 0F, -4F, 0F); // Box 273 vent 2 part e
		bodyModel[495].setRotationPoint(20.5F, -21.5F, 6.25F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 847 vent 1 part f
		bodyModel[496].setRotationPoint(21F, -21.5F, -7.25F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, -1F, 0F, -18F, -1F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, -4F, 0F); // Box 850 vent 1 part e
		bodyModel[497].setRotationPoint(21F, -21.5F, 6.25F);

		bodyModel[498].addBox(0F, 0F, 0F, 1, 17, 12, 0F); // Box 313
		bodyModel[498].setRotationPoint(-34.5F, -21F, -6F);

		bodyModel[499].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 105
		bodyModel[499].setRotationPoint(-34.5F, -21F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 92, 234, textureX, textureY); // Box 106
		bodyModel[501] = new ModelRendererTurbo(this, 104, 228, textureX, textureY, "lamp"); // Box 48 lamp
		bodyModel[502] = new ModelRendererTurbo(this, 83, 212, textureX, textureY); // Box 43
		bodyModel[503] = new ModelRendererTurbo(this, 83, 223, textureX, textureY); // Box 44
		bodyModel[504] = new ModelRendererTurbo(this, 105, 214, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[505] = new ModelRendererTurbo(this, 105, 219, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[506] = new ModelRendererTurbo(this, 104, 224, textureX, textureY); // Box 133
		bodyModel[507] = new ModelRendererTurbo(this, 118, 227, textureX, textureY, "lamp"); // Box 198 numberboard
		bodyModel[508] = new ModelRendererTurbo(this, 118, 219, textureX, textureY, "lamp"); // Box 199 numberboard
		bodyModel[509] = new ModelRendererTurbo(this, 53, 239, textureX, textureY); // Box 536
		bodyModel[510] = new ModelRendererTurbo(this, 70, 234, textureX, textureY); // Box 537
		bodyModel[511] = new ModelRendererTurbo(this, 70, 242, textureX, textureY); // Box 538
		bodyModel[512] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[513] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[514] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[515] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[516] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[517] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[518] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[519] = new ModelRendererTurbo(this, 279, 164, textureX, textureY); // Box 564
		bodyModel[520] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 565
		bodyModel[521] = new ModelRendererTurbo(this, 275, 160, textureX, textureY); // Box 566
		bodyModel[522] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 567
		bodyModel[523] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 568
		bodyModel[524] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 569
		bodyModel[525] = new ModelRendererTurbo(this, 307, 176, textureX, textureY); // Box 570
		bodyModel[526] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[527] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[528] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[529] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[530] = new ModelRendererTurbo(this, 231, 151, textureX, textureY); // Box 575
		bodyModel[531] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 576
		bodyModel[532] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 577
		bodyModel[533] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[534] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[535] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[536] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[537] = new ModelRendererTurbo(this, 104, 37, textureX, textureY); // Box 355 brakewheel
		bodyModel[538] = new ModelRendererTurbo(this, 122, 69, textureX, textureY); // Box 355 brakewheel
		bodyModel[539] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[540] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[541] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[542] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[543] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[544] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[545] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[546] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[547] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[548] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[549] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[550] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[551] = new ModelRendererTurbo(this, 275, 206, textureX, textureY, "cull"); // Box 297 vent 2 part ef cull
		bodyModel[552] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Box 388
		bodyModel[553] = new ModelRendererTurbo(this, 263, 29, textureX, textureY); // Box 330
		bodyModel[554] = new ModelRendererTurbo(this, 448, 22, textureX, textureY); // Box 376
		bodyModel[555] = new ModelRendererTurbo(this, 439, 22, textureX, textureY); // Box 376
		bodyModel[556] = new ModelRendererTurbo(this, 448, 15, textureX, textureY); // Box 556
		bodyModel[557] = new ModelRendererTurbo(this, 439, 15, textureX, textureY); // Box 557
		bodyModel[558] = new ModelRendererTurbo(this, 393, 182, textureX, textureY, "cull"); // Box 546 cull
		bodyModel[559] = new ModelRendererTurbo(this, 398, 181, textureX, textureY); // Box 546
		bodyModel[560] = new ModelRendererTurbo(this, 29, 195, textureX, textureY, "cull"); // Box 567 cull
		bodyModel[561] = new ModelRendererTurbo(this, -5, 195, textureX, textureY); // Box 567
		bodyModel[562] = new ModelRendererTurbo(this, 218, 28, textureX, textureY); // Box 409 commander base csx
		bodyModel[563] = new ModelRendererTurbo(this, 218, 24, textureX, textureY); // Box 410 commander beacon csx
		bodyModel[564] = new ModelRendererTurbo(this, 218, 28, textureX, textureY); // Box 409 commander base csx
		bodyModel[565] = new ModelRendererTurbo(this, 218, 24, textureX, textureY); // Box 410 commander beacon csx

		bodyModel[500].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 106
		bodyModel[500].setRotationPoint(-34.5F, -21F, 6F);

		bodyModel[501].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[501].setRotationPoint(-36.5F, -21F, -1F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[502].setRotationPoint(-36.5F, -21F, -7F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[503].setRotationPoint(-36.5F, -21F, 1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[504].setRotationPoint(-37F, -21F, -1F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[505].setRotationPoint(-37F, -19F, -1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[506].setRotationPoint(-36.5F, -17F, -1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.66F, 0F, 0F); // Box 198 numberboard
		bodyModel[507].setRotationPoint(-36.35F, -19.5F, 1.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1.66F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.66F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 numberboard
		bodyModel[508].setRotationPoint(-36.35F, -19.5F, -6.5F);

		bodyModel[509].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 536
		bodyModel[509].setRotationPoint(-33.5F, -21F, -6F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 537
		bodyModel[510].setRotationPoint(-34.5F, -21F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 538
		bodyModel[511].setRotationPoint(-34.5F, -21F, 7F);

		bodyModel[512].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[512].setRotationPoint(-8F, 3F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[513].setRotationPoint(-8F, 2F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[514].setRotationPoint(-8F, 6F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[515].setRotationPoint(-8F, 6F, -9F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[516].setRotationPoint(-8F, 2F, 8F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[517].setRotationPoint(-8F, 6F, 9F);

		bodyModel[518].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[518].setRotationPoint(-8F, 2F, -8F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[519].setRotationPoint(8F, 6F, -9F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[520].setRotationPoint(8F, 6F, -11F);

		bodyModel[521].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[521].setRotationPoint(8F, 3F, -11F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[522].setRotationPoint(8F, 2F, -11F);

		bodyModel[523].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[523].setRotationPoint(8F, 2F, -8F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[524].setRotationPoint(8F, 2F, 8F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[525].setRotationPoint(8F, 6F, 9F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[526].setRotationPoint(-12F, 6F, -9F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[527].setRotationPoint(-12F, 6F, -11F);

		bodyModel[528].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[528].setRotationPoint(-12F, 3F, -11F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[529].setRotationPoint(-12F, 2F, -11F);

		bodyModel[530].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[530].setRotationPoint(-12F, 2F, -8F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[531].setRotationPoint(-12F, 6F, 9F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[532].setRotationPoint(-12F, 2F, 8F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[533].setRotationPoint(-43.5F, 5F, -11F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[534].setRotationPoint(-43.5F, 5F, 7F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[535].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[536].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[537].setRotationPoint(-42.5F, -13F, -7.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[538].setRotationPoint(35.5F, -10F, 6.75F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[539].setRotationPoint(-28F, -28F, 6F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[540].setRotationPoint(-28F, -28F, 8F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[541].setRotationPoint(-28F, -27F, 5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[542].setRotationPoint(-28F, -27F, 8F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[543].setRotationPoint(-28F, -25F, 7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[544].setRotationPoint(-28F, -25F, 5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[545].setRotationPoint(-28F, -25F, -8F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[546].setRotationPoint(-28F, -25F, -10F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[547].setRotationPoint(-28F, -27F, -9F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[548].setRotationPoint(-28F, -27F, -8F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[549].setRotationPoint(-28F, -28F, -8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[550].setRotationPoint(-28F, -28F, -9F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 297 vent 2 part ef cull
		bodyModel[551].setRotationPoint(30.25F, -20F, -7.01F);

		bodyModel[552].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 388
		bodyModel[552].setRotationPoint(-29.5F, -22.5F, -5F);

		bodyModel[553].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 330
		bodyModel[553].setRotationPoint(-33.5F, -23F, 0F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[554].setRotationPoint(13.5F, -21F, -9F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 376
		bodyModel[555].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 556
		bodyModel[556].setRotationPoint(13.5F, -21F, 7F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 557
		bodyModel[557].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[558].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 546 cull
		bodyModel[558].setRotationPoint(46.5F, 6F, -9F);

		bodyModel[559].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 546
		bodyModel[559].setRotationPoint(48.5F, 8F, -9F);

		bodyModel[560].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 567 cull
		bodyModel[560].setRotationPoint(-49.5F, 6F, -9F);

		bodyModel[561].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 567
		bodyModel[561].setRotationPoint(-51.5F, 8F, -9F);

		bodyModel[562].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[562].setRotationPoint(-27F, -20.25F, -9.5F);
		bodyModel[562].rotateAngleX = 0.64577182F;

		bodyModel[563].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[563].setRotationPoint(-27F, -20.25F, -9.5F);
		bodyModel[563].rotateAngleX = 0.64577182F;

		bodyModel[564].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[564].setRotationPoint(-27F, -20.25F, 9.5F);
		bodyModel[564].rotateAngleX = -0.64577182F;

		bodyModel[565].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[565].setRotationPoint(-27F, -20.25F, 9.5F);
		bodyModel[565].rotateAngleX = -0.64577182F;

	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 9 ) {
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8 ) {
			//sp regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 27565
				||GetColor(entity) == 26 ||GetColor(entity) == 27
				||GetColor(entity) == 28 ||GetColor(entity) == 29) {

			//black dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 21
				||GetColor(entity) == 22 ||GetColor(entity) == 23
				||GetColor(entity) == 24 ) {
			//silver dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 25 ) {
			//beansniuff dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2_late_-2_beansnifgren.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}//Skin25 aka BNSF H1 needs BNSF H1 -2 trucks
}