//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 4ED-172T
// Model Creator: Bida
// Created on: 30.12.2021 - 20:16:09
// Last changed on: 30.12.2021 - 20:16:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.detailkits.Model4ed_172_deets_crl;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBM750;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.Modelgolftruck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Model4ED172T extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Model4ED172T() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[353];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 250, 177, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 250, 177, textureX, textureY); // Box 261
		bodyModel[2] = new ModelRendererTurbo(this, 258, 178, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 258, 178, textureX, textureY); // Box 336
		bodyModel[4] = new ModelRendererTurbo(this, 18, 116, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 59, 141, textureX, textureY); // Box 135
		bodyModel[6] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 582
		bodyModel[7] = new ModelRendererTurbo(this, 91, 98, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 83, 142, textureX, textureY); // Box 70
		bodyModel[9] = new ModelRendererTurbo(this, 72, 98, textureX, textureY); // Box 79
		bodyModel[10] = new ModelRendererTurbo(this, 15, 141, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 231, 120, textureX, textureY); // Box 184
		bodyModel[12] = new ModelRendererTurbo(this, 238, 137, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 73, 136, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 73, 133, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 72, 125, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 240, 112, textureX, textureY); // Box 7
		bodyModel[17] = new ModelRendererTurbo(this, 79, 106, textureX, textureY); // Box 78
		bodyModel[18] = new ModelRendererTurbo(this, 79, 99, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 75, 139, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 75, 129, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 240, 104, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 86, 106, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 86, 99, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 86, 139, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 84, 136, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 86, 129, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 84, 133, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 83, 125, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 266, 168, textureX, textureY); // Box 193
		bodyModel[30] = new ModelRendererTurbo(this, 24, 131, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 53, 142, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 17, 142, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 111, 116, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 117, 131, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 110, 142, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 108, 141, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 146, 142, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 152, 141, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 247, 168, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 72, 110, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 79, 118, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 79, 111, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 86, 111, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 86, 118, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 91, 110, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 352, 112, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 352, 104, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 283, 153, textureX, textureY); // Box 247
		bodyModel[49] = new ModelRendererTurbo(this, 266, 168, textureX, textureY); // Box 557
		bodyModel[50] = new ModelRendererTurbo(this, 247, 153, textureX, textureY); // Box 561
		bodyModel[51] = new ModelRendererTurbo(this, 285, 157, textureX, textureY); // Box 352
		bodyModel[52] = new ModelRendererTurbo(this, 283, 160, textureX, textureY); // Box 353
		bodyModel[53] = new ModelRendererTurbo(this, 285, 164, textureX, textureY); // Box 354
		bodyModel[54] = new ModelRendererTurbo(this, 247, 160, textureX, textureY); // Box 381
		bodyModel[55] = new ModelRendererTurbo(this, 295, 153, textureX, textureY); // Box 437
		bodyModel[56] = new ModelRendererTurbo(this, 266, 168, textureX, textureY); // Box 438
		bodyModel[57] = new ModelRendererTurbo(this, 297, 157, textureX, textureY); // Box 439
		bodyModel[58] = new ModelRendererTurbo(this, 297, 164, textureX, textureY); // Box 440
		bodyModel[59] = new ModelRendererTurbo(this, 295, 160, textureX, textureY); // Box 441
		bodyModel[60] = new ModelRendererTurbo(this, 292, 102, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 292, 111, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 315, 156, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 378, 154, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 378, 163, textureX, textureY); // Box 55
		bodyModel[65] = new ModelRendererTurbo(this, 324, 184, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 179, 28, textureX, textureY); // Box 9
		bodyModel[67] = new ModelRendererTurbo(this, 104, 28, textureX, textureY); // Box 10
		bodyModel[68] = new ModelRendererTurbo(this, 129, 11, textureX, textureY); // Box 21
		bodyModel[69] = new ModelRendererTurbo(this, 168, 25, textureX, textureY); // Box 314 door swing right
		bodyModel[70] = new ModelRendererTurbo(this, 93, 25, textureX, textureY); // Box 315 door swing right
		bodyModel[71] = new ModelRendererTurbo(this, 126, 56, textureX, textureY); // Box 344
		bodyModel[72] = new ModelRendererTurbo(this, 54, 11, textureX, textureY); // Box 15
		bodyModel[73] = new ModelRendererTurbo(this, 242, 49, textureX, textureY); // Box 293
		bodyModel[74] = new ModelRendererTurbo(this, 178, 108, textureX, textureY); // Box 191
		bodyModel[75] = new ModelRendererTurbo(this, 275, 2, textureX, textureY); // Box 359
		bodyModel[76] = new ModelRendererTurbo(this, 275, 14, textureX, textureY); // Box 360
		bodyModel[77] = new ModelRendererTurbo(this, 128, 67, textureX, textureY); // Box 215
		bodyModel[78] = new ModelRendererTurbo(this, 346, 60, textureX, textureY); // Box 216
		bodyModel[79] = new ModelRendererTurbo(this, 382, 49, textureX, textureY); // Box 217
		bodyModel[80] = new ModelRendererTurbo(this, 84, 64, textureX, textureY); // Box 53
		bodyModel[81] = new ModelRendererTurbo(this, 99, 68, textureX, textureY); // Box 54
		bodyModel[82] = new ModelRendererTurbo(this, 106, 64, textureX, textureY); // Box 235
		bodyModel[83] = new ModelRendererTurbo(this, 434, 61, textureX, textureY); // Box 221
		bodyModel[84] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 222
		bodyModel[85] = new ModelRendererTurbo(this, 419, 57, textureX, textureY); // Box 223
		bodyModel[86] = new ModelRendererTurbo(this, 138, 169, textureX, textureY, "cull"); // Box 296 cull
		bodyModel[87] = new ModelRendererTurbo(this, 135, 198, textureX, textureY); // Box 280
		bodyModel[88] = new ModelRendererTurbo(this, 127, 185, textureX, textureY); // Box 281
		bodyModel[89] = new ModelRendererTurbo(this, 131, 169, textureX, textureY, "cull"); // Box 282 cull
		bodyModel[90] = new ModelRendererTurbo(this, 143, 199, textureX, textureY); // Box 191
		bodyModel[91] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 231
		bodyModel[92] = new ModelRendererTurbo(this, 29, 117, textureX, textureY); // Box 66
		bodyModel[93] = new ModelRendererTurbo(this, 30, 121, textureX, textureY); // Box 67
		bodyModel[94] = new ModelRendererTurbo(this, 40, 121, textureX, textureY); // Box 68
		bodyModel[95] = new ModelRendererTurbo(this, 32, 121, textureX, textureY); // Box 235
		bodyModel[96] = new ModelRendererTurbo(this, 59, 133, textureX, textureY); // Box 236
		bodyModel[97] = new ModelRendererTurbo(this, 59, 126, textureX, textureY); // Box 298
		bodyModel[98] = new ModelRendererTurbo(this, 15, 126, textureX, textureY); // Box 238
		bodyModel[99] = new ModelRendererTurbo(this, 15, 133, textureX, textureY); // Box 239
		bodyModel[100] = new ModelRendererTurbo(this, 47, 123, textureX, textureY); // Box 240
		bodyModel[101] = new ModelRendererTurbo(this, 56, 126, textureX, textureY); // Box 241
		bodyModel[102] = new ModelRendererTurbo(this, 18, 126, textureX, textureY); // Box 242
		bodyModel[103] = new ModelRendererTurbo(this, 21, 123, textureX, textureY); // Box 243
		bodyModel[104] = new ModelRendererTurbo(this, 122, 117, textureX, textureY); // Box 244
		bodyModel[105] = new ModelRendererTurbo(this, 123, 121, textureX, textureY); // Box 245
		bodyModel[106] = new ModelRendererTurbo(this, 133, 121, textureX, textureY); // Box 246
		bodyModel[107] = new ModelRendererTurbo(this, 125, 121, textureX, textureY); // Box 247
		bodyModel[108] = new ModelRendererTurbo(this, 114, 123, textureX, textureY); // Box 248
		bodyModel[109] = new ModelRendererTurbo(this, 108, 126, textureX, textureY); // Box 249
		bodyModel[110] = new ModelRendererTurbo(this, 111, 126, textureX, textureY); // Box 250
		bodyModel[111] = new ModelRendererTurbo(this, 108, 133, textureX, textureY); // Box 251
		bodyModel[112] = new ModelRendererTurbo(this, 149, 126, textureX, textureY); // Box 252
		bodyModel[113] = new ModelRendererTurbo(this, 140, 123, textureX, textureY); // Box 253
		bodyModel[114] = new ModelRendererTurbo(this, 152, 126, textureX, textureY); // Box 254
		bodyModel[115] = new ModelRendererTurbo(this, 152, 133, textureX, textureY); // Box 255
		bodyModel[116] = new ModelRendererTurbo(this, 258, 199, textureX, textureY); // Box 256
		bodyModel[117] = new ModelRendererTurbo(this, 232, 169, textureX, textureY, "cull"); // Box 257 cull
		bodyModel[118] = new ModelRendererTurbo(this, 258, 185, textureX, textureY); // Box 258
		bodyModel[119] = new ModelRendererTurbo(this, 239, 169, textureX, textureY, "cull"); // Box 259 cull
		bodyModel[120] = new ModelRendererTurbo(this, 136, 186, textureX, textureY); // Box 260
		bodyModel[121] = new ModelRendererTurbo(this, 172, 199, textureX, textureY); // Box 264
		bodyModel[122] = new ModelRendererTurbo(this, 193, 71, textureX, textureY); // Box 265
		bodyModel[123] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 266
		bodyModel[124] = new ModelRendererTurbo(this, 155, 199, textureX, textureY); // Box 267
		bodyModel[125] = new ModelRendererTurbo(this, 172, 186, textureX, textureY); // Box 270
		bodyModel[126] = new ModelRendererTurbo(this, 155, 186, textureX, textureY); // Box 271
		bodyModel[127] = new ModelRendererTurbo(this, 144, 197, textureX, textureY); // Box 272
		bodyModel[128] = new ModelRendererTurbo(this, 148, 199, textureX, textureY); // Box 273
		bodyModel[129] = new ModelRendererTurbo(this, 54, 17, textureX, textureY); // Box 48
		bodyModel[130] = new ModelRendererTurbo(this, 51, 9, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[131] = new ModelRendererTurbo(this, 51, 9, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[132] = new ModelRendererTurbo(this, 49, 9, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[133] = new ModelRendererTurbo(this, 59, 9, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[134] = new ModelRendererTurbo(this, 178, 85, textureX, textureY); // Box 285
		bodyModel[135] = new ModelRendererTurbo(this, 106, 49, textureX, textureY); // Box 286
		bodyModel[136] = new ModelRendererTurbo(this, 99, 53, textureX, textureY); // Box 287
		bodyModel[137] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 288
		bodyModel[138] = new ModelRendererTurbo(this, 180, 7, textureX, textureY); // Box 404
		bodyModel[139] = new ModelRendererTurbo(this, 150, 1, textureX, textureY); // Box 405
		bodyModel[140] = new ModelRendererTurbo(this, 174, 13, textureX, textureY); // Box 407
		bodyModel[141] = new ModelRendererTurbo(this, 112, 6, textureX, textureY); // Box 408
		bodyModel[142] = new ModelRendererTurbo(this, 209, 15, textureX, textureY); // Box 439
		bodyModel[143] = new ModelRendererTurbo(this, 220, 15, textureX, textureY); // Box 441
		bodyModel[144] = new ModelRendererTurbo(this, 220, 9, textureX, textureY); // Box 443
		bodyModel[145] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 444
		bodyModel[146] = new ModelRendererTurbo(this, 164, 14, textureX, textureY); // Box 145
		bodyModel[147] = new ModelRendererTurbo(this, 151, 8, textureX, textureY); // Box 146
		bodyModel[148] = new ModelRendererTurbo(this, 173, 14, textureX, textureY); // Box 147
		bodyModel[149] = new ModelRendererTurbo(this, 181, 2, textureX, textureY); // Box 148
		bodyModel[150] = new ModelRendererTurbo(this, 210, 2, textureX, textureY); // Box 149
		bodyModel[151] = new ModelRendererTurbo(this, 219, 2, textureX, textureY); // Box 150
		bodyModel[152] = new ModelRendererTurbo(this, 157, 114, textureX, textureY); // Box 195
		bodyModel[153] = new ModelRendererTurbo(this, 157, 102, textureX, textureY); // Box 196
		bodyModel[154] = new ModelRendererTurbo(this, 161, 110, textureX, textureY); // Box 197
		bodyModel[155] = new ModelRendererTurbo(this, 208, 108, textureX, textureY); // Box 198
		bodyModel[156] = new ModelRendererTurbo(this, 217, 108, textureX, textureY, "lamp"); // Box 186 Headlight Front nose
		bodyModel[157] = new ModelRendererTurbo(this, 217, 113, textureX, textureY, "lamp"); // Box 187 Headlight Front nose
		bodyModel[158] = new ModelRendererTurbo(this, 222, 56, textureX, textureY); // Box 48
		bodyModel[159] = new ModelRendererTurbo(this, 227, 58, textureX, textureY); // Box 43
		bodyModel[160] = new ModelRendererTurbo(this, 220, 48, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[161] = new ModelRendererTurbo(this, 220, 48, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[162] = new ModelRendererTurbo(this, 211, 58, textureX, textureY); // Box 175
		bodyModel[163] = new ModelRendererTurbo(this, 223, 38, textureX, textureY, "lamp"); // Box 186 Headlight Front hh
		bodyModel[164] = new ModelRendererTurbo(this, 223, 43, textureX, textureY, "lamp"); // Box 187 Headlight Front hh
		bodyModel[165] = new ModelRendererTurbo(this, 58, 19, textureX, textureY); // Box 212
		bodyModel[166] = new ModelRendererTurbo(this, 44, 19, textureX, textureY); // Box 213
		bodyModel[167] = new ModelRendererTurbo(this, 279, 10, textureX, textureY); // Box 214
		bodyModel[168] = new ModelRendererTurbo(this, 93, 3, textureX, textureY); // Box 215
		bodyModel[169] = new ModelRendererTurbo(this, 135, 97, textureX, textureY); // Box 216
		bodyModel[170] = new ModelRendererTurbo(this, 139, 93, textureX, textureY); // Box 217
		bodyModel[171] = new ModelRendererTurbo(this, 135, 85, textureX, textureY); // Box 218
		bodyModel[172] = new ModelRendererTurbo(this, 366, 10, textureX, textureY); // Box 219
		bodyModel[173] = new ModelRendererTurbo(this, 362, 14, textureX, textureY); // Box 220
		bodyModel[174] = new ModelRendererTurbo(this, 362, 2, textureX, textureY); // Box 221
		bodyModel[175] = new ModelRendererTurbo(this, 436, 29, textureX, textureY); // Box 48
		bodyModel[176] = new ModelRendererTurbo(this, 425, 31, textureX, textureY); // Box 43
		bodyModel[177] = new ModelRendererTurbo(this, 434, 21, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[178] = new ModelRendererTurbo(this, 434, 21, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[179] = new ModelRendererTurbo(this, 441, 31, textureX, textureY); // Box 175
		bodyModel[180] = new ModelRendererTurbo(this, 437, 11, textureX, textureY, "lamp"); // Box 186 Headlight rear
		bodyModel[181] = new ModelRendererTurbo(this, 437, 16, textureX, textureY, "lamp"); // Box 187 Headlight rear
		bodyModel[182] = new ModelRendererTurbo(this, 172, 197, textureX, textureY); // Box 229
		bodyModel[183] = new ModelRendererTurbo(this, 172, 195, textureX, textureY); // Box 230
		bodyModel[184] = new ModelRendererTurbo(this, 331, 48, textureX, textureY); // Box 231
		bodyModel[185] = new ModelRendererTurbo(this, 346, 60, textureX, textureY); // Box 232
		bodyModel[186] = new ModelRendererTurbo(this, 331, 54, textureX, textureY); // Box 233
		bodyModel[187] = new ModelRendererTurbo(this, 369, 38, textureX, textureY); // Box 234
		bodyModel[188] = new ModelRendererTurbo(this, 373, 33, textureX, textureY); // Box 235
		bodyModel[189] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 236
		bodyModel[190] = new ModelRendererTurbo(this, 324, 30, textureX, textureY, "cull"); // Box 247 cull
		bodyModel[191] = new ModelRendererTurbo(this, 324, 39, textureX, textureY, "cull"); // Box 248 cull
		bodyModel[192] = new ModelRendererTurbo(this, 293, 27, textureX, textureY); // Box 249
		bodyModel[193] = new ModelRendererTurbo(this, 304, 38, textureX, textureY); // Box 250
		bodyModel[194] = new ModelRendererTurbo(this, 302, 30, textureX, textureY); // Box 251
		bodyModel[195] = new ModelRendererTurbo(this, 304, 24, textureX, textureY); // Box 252
		bodyModel[196] = new ModelRendererTurbo(this, 156, 97, textureX, textureY); // Box 253 sandcap
		bodyModel[197] = new ModelRendererTurbo(this, 433, 56, textureX, textureY); // Box 254
		bodyModel[198] = new ModelRendererTurbo(this, 327, 154, textureX, textureY); // Box 255
		bodyModel[199] = new ModelRendererTurbo(this, 327, 154, textureX, textureY); // Box 256
		bodyModel[200] = new ModelRendererTurbo(this, 327, 158, textureX, textureY); // Box 257
		bodyModel[201] = new ModelRendererTurbo(this, 327, 158, textureX, textureY); // Box 258
		bodyModel[202] = new ModelRendererTurbo(this, 223, 66, textureX, textureY); // Box 259
		bodyModel[203] = new ModelRendererTurbo(this, 216, 66, textureX, textureY, "lamp"); // Box 260 gryalight front
		bodyModel[204] = new ModelRendererTurbo(this, 230, 66, textureX, textureY, "lamp"); // Box 261 gyralight front
		bodyModel[205] = new ModelRendererTurbo(this, 437, 39, textureX, textureY); // Box 262
		bodyModel[206] = new ModelRendererTurbo(this, 430, 39, textureX, textureY, "lamp"); // Box 263 gyralight rear
		bodyModel[207] = new ModelRendererTurbo(this, 444, 39, textureX, textureY, "lamp"); // Box 264 gyralight rear
		bodyModel[208] = new ModelRendererTurbo(this, 228, 49, textureX, textureY, "lamp"); // Box 266 markerlight
		bodyModel[209] = new ModelRendererTurbo(this, 228, 49, textureX, textureY, "lamp"); // Box 267 markerlight
		bodyModel[210] = new ModelRendererTurbo(this, 442, 22, textureX, textureY, "lamp"); // Box 266 markerlight
		bodyModel[211] = new ModelRendererTurbo(this, 442, 22, textureX, textureY, "lamp"); // Box 267 markerlight
		bodyModel[212] = new ModelRendererTurbo(this, 178, 115, textureX, textureY); // Box 270 sandcap short
		bodyModel[213] = new ModelRendererTurbo(this, 55, 5, textureX, textureY, "lamp"); // Box 266 markerlight
		bodyModel[214] = new ModelRendererTurbo(this, 55, 5, textureX, textureY, "lamp"); // Box 267 markerlight
		bodyModel[215] = new ModelRendererTurbo(this, 54, 54, textureX, textureY); // Box 299
		bodyModel[216] = new ModelRendererTurbo(this, 65, 54, textureX, textureY); // Box 300
		bodyModel[217] = new ModelRendererTurbo(this, 54, 50, textureX, textureY); // Box 301
		bodyModel[218] = new ModelRendererTurbo(this, 65, 50, textureX, textureY); // Box 302
		bodyModel[219] = new ModelRendererTurbo(this, 75, 139, textureX, textureY); // Box 238
		bodyModel[220] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 239
		bodyModel[221] = new ModelRendererTurbo(this, 73, 136, textureX, textureY); // Box 240
		bodyModel[222] = new ModelRendererTurbo(this, 73, 133, textureX, textureY); // Box 241
		bodyModel[223] = new ModelRendererTurbo(this, 75, 129, textureX, textureY); // Box 242
		bodyModel[224] = new ModelRendererTurbo(this, 72, 125, textureX, textureY); // Box 243
		bodyModel[225] = new ModelRendererTurbo(this, 86, 129, textureX, textureY); // Box 244
		bodyModel[226] = new ModelRendererTurbo(this, 84, 133, textureX, textureY); // Box 245
		bodyModel[227] = new ModelRendererTurbo(this, 83, 125, textureX, textureY); // Box 246
		bodyModel[228] = new ModelRendererTurbo(this, 84, 136, textureX, textureY); // Box 247
		bodyModel[229] = new ModelRendererTurbo(this, 86, 139, textureX, textureY); // Box 248
		bodyModel[230] = new ModelRendererTurbo(this, 83, 142, textureX, textureY); // Box 249
		bodyModel[231] = new ModelRendererTurbo(this, 320, 155, textureX, textureY); // Box 250
		bodyModel[232] = new ModelRendererTurbo(this, 320, 159, textureX, textureY); // Box 251
		bodyModel[233] = new ModelRendererTurbo(this, 56, 58, textureX, textureY); // Box 252
		bodyModel[234] = new ModelRendererTurbo(this, 65, 58, textureX, textureY); // Box 253
		bodyModel[235] = new ModelRendererTurbo(this, 50, 62, textureX, textureY); // Box 184 o2 generator
		bodyModel[236] = new ModelRendererTurbo(this, 54, 79, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[237] = new ModelRendererTurbo(this, 61, 77, textureX, textureY); // Box 308
		bodyModel[238] = new ModelRendererTurbo(this, 56, 81, textureX, textureY); // Box 279
		bodyModel[239] = new ModelRendererTurbo(this, 56, 78, textureX, textureY); // Box 258
		bodyModel[240] = new ModelRendererTurbo(this, 36, 84, textureX, textureY); // Box 409 commander base
		bodyModel[241] = new ModelRendererTurbo(this, 36, 80, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[242] = new ModelRendererTurbo(this, 42, 79, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[243] = new ModelRendererTurbo(this, 42, 79, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[244] = new ModelRendererTurbo(this, 42, 79, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[245] = new ModelRendererTurbo(this, 42, 79, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[246] = new ModelRendererTurbo(this, 42, 83, textureX, textureY); // Box 428 prime base
		bodyModel[247] = new ModelRendererTurbo(this, 70, 78, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[248] = new ModelRendererTurbo(this, 73, 76, textureX, textureY); // Box 425
		bodyModel[249] = new ModelRendererTurbo(this, 40, 72, textureX, textureY); // Box 418
		bodyModel[250] = new ModelRendererTurbo(this, 31, 69, textureX, textureY); // Box 419
		bodyModel[251] = new ModelRendererTurbo(this, 29, 72, textureX, textureY); // Box 420
		bodyModel[252] = new ModelRendererTurbo(this, 31, 75, textureX, textureY); // Box 421
		bodyModel[253] = new ModelRendererTurbo(this, 46, 61, textureX, textureY); // Box 786
		bodyModel[254] = new ModelRendererTurbo(this, 37, 58, textureX, textureY); // Box 787
		bodyModel[255] = new ModelRendererTurbo(this, 35, 61, textureX, textureY); // Box 788
		bodyModel[256] = new ModelRendererTurbo(this, 37, 64, textureX, textureY); // Box 789
		bodyModel[257] = new ModelRendererTurbo(this, 40, 48, textureX, textureY); // Box 427
		bodyModel[258] = new ModelRendererTurbo(this, 40, 51, textureX, textureY); // Box 428
		bodyModel[259] = new ModelRendererTurbo(this, 40, 54, textureX, textureY); // Box 429
		bodyModel[260] = new ModelRendererTurbo(this, 49, 51, textureX, textureY); // Box 430
		bodyModel[261] = new ModelRendererTurbo(this, 22, 82, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[262] = new ModelRendererTurbo(this, 0, 147, textureX, textureY); // Box 50
		bodyModel[263] = new ModelRendererTurbo(this, 25, 147, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[264] = new ModelRendererTurbo(this, 34, 150, textureX, textureY, "cull"); // Box 287 cull
		bodyModel[265] = new ModelRendererTurbo(this, 118, 147, textureX, textureY, "cull"); // Box 288 cull
		bodyModel[266] = new ModelRendererTurbo(this, 93, 147, textureX, textureY); // Box 289
		bodyModel[267] = new ModelRendererTurbo(this, 127, 150, textureX, textureY, "cull"); // Box 290 cull
		bodyModel[268] = new ModelRendererTurbo(this, 7, 168, textureX, textureY); // Box 282
		bodyModel[269] = new ModelRendererTurbo(this, 7, 181, textureX, textureY); // Box 283
		bodyModel[270] = new ModelRendererTurbo(this, 20, 166, textureX, textureY); // Box 4
		bodyModel[271] = new ModelRendererTurbo(this, 33, 165, textureX, textureY); // Box 448
		bodyModel[272] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 322
		bodyModel[273] = new ModelRendererTurbo(this, 33, 178, textureX, textureY); // Box 323
		bodyModel[274] = new ModelRendererTurbo(this, 44, 163, textureX, textureY); // Box 280
		bodyModel[275] = new ModelRendererTurbo(this, 44, 176, textureX, textureY); // Box 285
		bodyModel[276] = new ModelRendererTurbo(this, 7, 194, textureX, textureY); // Box 525
		bodyModel[277] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 526
		bodyModel[278] = new ModelRendererTurbo(this, 57, 168, textureX, textureY); // Box 301
		bodyModel[279] = new ModelRendererTurbo(this, 57, 194, textureX, textureY); // Box 302
		bodyModel[280] = new ModelRendererTurbo(this, 70, 179, textureX, textureY); // Box 303
		bodyModel[281] = new ModelRendererTurbo(this, 70, 192, textureX, textureY); // Box 304
		bodyModel[282] = new ModelRendererTurbo(this, 57, 181, textureX, textureY); // Box 305
		bodyModel[283] = new ModelRendererTurbo(this, 70, 166, textureX, textureY); // Box 306
		bodyModel[284] = new ModelRendererTurbo(this, 83, 165, textureX, textureY); // Box 307
		bodyModel[285] = new ModelRendererTurbo(this, 94, 163, textureX, textureY); // Box 308
		bodyModel[286] = new ModelRendererTurbo(this, 83, 178, textureX, textureY); // Box 309
		bodyModel[287] = new ModelRendererTurbo(this, 94, 176, textureX, textureY); // Box 310
		bodyModel[288] = new ModelRendererTurbo(this, 33, 109, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[289] = new ModelRendererTurbo(this, 126, 109, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[290] = new ModelRendererTurbo(this, 15, 108, textureX, textureY); // Box 188
		bodyModel[291] = new ModelRendererTurbo(this, 22, 105, textureX, textureY); // Box 190 mu plug
		bodyModel[292] = new ModelRendererTurbo(this, 22, 110, textureX, textureY); // Box 190 mu plug
		bodyModel[293] = new ModelRendererTurbo(this, 15, 118, textureX, textureY); // Box 188
		bodyModel[294] = new ModelRendererTurbo(this, 22, 115, textureX, textureY); // Box 190 mu plug
		bodyModel[295] = new ModelRendererTurbo(this, 22, 120, textureX, textureY); // Box 190 mu plug
		bodyModel[296] = new ModelRendererTurbo(this, 108, 118, textureX, textureY); // Box 188
		bodyModel[297] = new ModelRendererTurbo(this, 115, 115, textureX, textureY); // Box 190 mu plug
		bodyModel[298] = new ModelRendererTurbo(this, 115, 120, textureX, textureY); // Box 190 mu plug
		bodyModel[299] = new ModelRendererTurbo(this, 108, 108, textureX, textureY); // Box 188
		bodyModel[300] = new ModelRendererTurbo(this, 115, 105, textureX, textureY); // Box 190 mu plug
		bodyModel[301] = new ModelRendererTurbo(this, 115, 110, textureX, textureY); // Box 190 mu plug
		bodyModel[302] = new ModelRendererTurbo(this, 207, 92, textureX, textureY); // Box 277
		bodyModel[303] = new ModelRendererTurbo(this, 212, 91, textureX, textureY); // Box 355 brakewheel
		bodyModel[304] = new ModelRendererTurbo(this, 247, 24, textureX, textureY); // Box 311 dynamic brakes
		bodyModel[305] = new ModelRendererTurbo(this, 212, 31, textureX, textureY); // Box 312 dynamic brakes
		bodyModel[306] = new ModelRendererTurbo(this, 212, 24, textureX, textureY); // Box 313 dynamic brakes
		bodyModel[307] = new ModelRendererTurbo(this, 180, 44, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[308] = new ModelRendererTurbo(this, 166, 44, textureX, textureY); // Box 5
		bodyModel[309] = new ModelRendererTurbo(this, 115, 44, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[310] = new ModelRendererTurbo(this, 133, 44, textureX, textureY); // Box 5
		bodyModel[311] = new ModelRendererTurbo(this, 107, 25, textureX, textureY); // Box 123
		bodyModel[312] = new ModelRendererTurbo(this, 182, 25, textureX, textureY); // Box 311
		bodyModel[313] = new ModelRendererTurbo(this, 291, 168, textureX, textureY); // Box 313 boger mounter
		bodyModel[314] = new ModelRendererTurbo(this, 291, 168, textureX, textureY); // Box 315 boger mounter
		bodyModel[315] = new ModelRendererTurbo(this, 25, 23, textureX, textureY); // Box 316 cs
		bodyModel[316] = new ModelRendererTurbo(this, 12, 15, textureX, textureY); // Box 317 cs hh
		bodyModel[317] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 318 cs hh
		bodyModel[318] = new ModelRendererTurbo(this, 12, 29, textureX, textureY); // Box 319 cs
		bodyModel[319] = new ModelRendererTurbo(this, 25, 23, textureX, textureY); // Box 320 cs
		bodyModel[320] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 321 cs radio
		bodyModel[321] = new ModelRendererTurbo(this, 362, 48, textureX, textureY); // Box 186
		bodyModel[322] = new ModelRendererTurbo(this, 375, 55, textureX, textureY); // Box 323
		bodyModel[323] = new ModelRendererTurbo(this, 375, 55, textureX, textureY); // Box 324
		bodyModel[324] = new ModelRendererTurbo(this, 362, 48, textureX, textureY); // Box 325
		bodyModel[325] = new ModelRendererTurbo(this, 12, 43, textureX, textureY); // Box 325 cs lh
		bodyModel[326] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 326 cs lh
		bodyModel[327] = new ModelRendererTurbo(this, 50, 135, textureX, textureY, "cull"); // Box 327 cull anticlimber
		bodyModel[328] = new ModelRendererTurbo(this, 143, 135, textureX, textureY, "cull"); // Box 328 cull anticlimber
		bodyModel[329] = new ModelRendererTurbo(this, 322, 23, textureX, textureY); // Box 184 emd repower stack
		bodyModel[330] = new ModelRendererTurbo(this, 322, 23, textureX, textureY); // Box 185 emd repower stack
		bodyModel[331] = new ModelRendererTurbo(this, 8, 115, textureX, textureY); // Box 621 low ditchlight f
		bodyModel[332] = new ModelRendererTurbo(this, 8, 120, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[333] = new ModelRendererTurbo(this, 8, 115, textureX, textureY); // Box 623 low ditchlight f
		bodyModel[334] = new ModelRendererTurbo(this, 8, 120, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[335] = new ModelRendererTurbo(this, 101, 115, textureX, textureY); // Box 621 low ditchlight r
		bodyModel[336] = new ModelRendererTurbo(this, 101, 120, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[337] = new ModelRendererTurbo(this, 101, 115, textureX, textureY); // Box 623 low ditchlight r
		bodyModel[338] = new ModelRendererTurbo(this, 101, 120, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[339] = new ModelRendererTurbo(this, 75, 53, textureX, textureY); // Box 114 bell
		bodyModel[340] = new ModelRendererTurbo(this, 75, 53, textureX, textureY); // Box 74 bell
		bodyModel[341] = new ModelRendererTurbo(this, 75, 56, textureX, textureY); // Box 78 bell
		bodyModel[342] = new ModelRendererTurbo(this, 73, 48, textureX, textureY, "cull"); // Box 470 Nose bell hang cull
		bodyModel[343] = new ModelRendererTurbo(this, 78, 22, textureX, textureY, "cull"); // Box 470 cull cab overhang beacon holder
		bodyModel[344] = new ModelRendererTurbo(this, 425, 26, textureX, textureY, "cull"); // Box 470 cull cab overhang beacon holder
		bodyModel[345] = new ModelRendererTurbo(this, 80, 19, textureX, textureY); // Box 409 commander base
		bodyModel[346] = new ModelRendererTurbo(this, 80, 15, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[347] = new ModelRendererTurbo(this, 427, 23, textureX, textureY); // Box 409 commander base
		bodyModel[348] = new ModelRendererTurbo(this, 427, 19, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[349] = new ModelRendererTurbo(this, 27, 61, textureX, textureY); // Box 349 tbea horn
		bodyModel[350] = new ModelRendererTurbo(this, 18, 64, textureX, textureY); // Box 350 tbea horn
		bodyModel[351] = new ModelRendererTurbo(this, 16, 61, textureX, textureY); // Box 351 tbea horn
		bodyModel[352] = new ModelRendererTurbo(this, 18, 58, textureX, textureY); // Box 352 tbea horn


		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-44.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[1].setRotationPoint(41.5F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[2].setRotationPoint(41F, 3F, -2.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[3].setRotationPoint(-42F, 3F, -2.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 4
		bodyModel[4].setRotationPoint(-41F, 0F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 135
		bodyModel[5].setRotationPoint(-41F, 6.5F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 582
		bodyModel[6].setRotationPoint(-41F, 8.5F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[7].setRotationPoint(-37F, 0F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 70
		bodyModel[8].setRotationPoint(-41F, 8.5F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[9].setRotationPoint(-37F, 0F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-41F, 6.5F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 82, 3, 12, 0F); // Box 184
		bodyModel[11].setRotationPoint(-41F, 0F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 74, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[12].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 13
		bodyModel[13].setRotationPoint(-41F, 6F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 14
		bodyModel[14].setRotationPoint(-41F, 3.5F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 15
		bodyModel[15].setRotationPoint(-41F, 1F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 17, 1, 5, 0F); // Box 7
		bodyModel[16].setRotationPoint(-37F, 0F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[17].setRotationPoint(-37F, 6F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-37F, 0F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 19
		bodyModel[19].setRotationPoint(-41F, 6.5F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 20
		bodyModel[20].setRotationPoint(-41F, 3F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 17, 1, 5, 0F); // Box 21
		bodyModel[21].setRotationPoint(-37F, 0F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-37F, 6F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-37F, 0F, 6F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 24
		bodyModel[24].setRotationPoint(-41F, 6.5F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 25
		bodyModel[25].setRotationPoint(-41F, 6F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 26
		bodyModel[26].setRotationPoint(-41F, 3F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 27
		bodyModel[27].setRotationPoint(-41F, 3.5F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 28
		bodyModel[28].setRotationPoint(-41F, 1F, 4F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 193
		bodyModel[29].setRotationPoint(-41F, 3F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 30
		bodyModel[30].setRotationPoint(-41F, 8F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-41F, 8F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-41F, 8F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 33
		bodyModel[33].setRotationPoint(41F, 0F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 1, 14, 0F); // Box 34
		bodyModel[34].setRotationPoint(41F, 8F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(41F, 8F, -10F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(41F, 6.5F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[37].setRotationPoint(41F, 8F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 38
		bodyModel[38].setRotationPoint(41F, 6.5F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 39
		bodyModel[39].setRotationPoint(36F, 3F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[40].setRotationPoint(37F, 0F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 53
		bodyModel[41].setRotationPoint(37F, 6F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[42].setRotationPoint(37F, 0F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[43].setRotationPoint(37F, 0F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[44].setRotationPoint(37F, 6F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[45].setRotationPoint(37F, 0F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 20, 1, 5, 0F); // Box 58
		bodyModel[46].setRotationPoint(17F, 0F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 20, 1, 5, 0F); // Box 59
		bodyModel[47].setRotationPoint(17F, 0F, 6F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 247
		bodyModel[48].setRotationPoint(-25F, 1F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 557
		bodyModel[49].setRotationPoint(-24F, 1F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 561
		bodyModel[50].setRotationPoint(-19.5F, 0F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 352
		bodyModel[51].setRotationPoint(-24F, 3F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 353
		bodyModel[52].setRotationPoint(-25F, 1F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 354
		bodyModel[53].setRotationPoint(-24F, 3F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 381
		bodyModel[54].setRotationPoint(-19.5F, 0F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 437
		bodyModel[55].setRotationPoint(21F, 1F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 438
		bodyModel[56].setRotationPoint(22F, 1F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 439
		bodyModel[57].setRotationPoint(22F, 3F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 440
		bodyModel[58].setRotationPoint(22F, 3F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 441
		bodyModel[59].setRotationPoint(21F, 1F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 22, 2, 5, 0F); // Box 72
		bodyModel[60].setRotationPoint(-5F, 0F, 6F);

		bodyModel[61].addBox(0F, 0F, 0F, 22, 2, 5, 0F); // Box 73
		bodyModel[61].setRotationPoint(-5F, 0F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 20, 4, 22, 0F); // Box 0
		bodyModel[62].setRotationPoint(-10F, 3.25F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0
		bodyModel[63].setRotationPoint(-10F, 7.25F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 55
		bodyModel[64].setRotationPoint(-10F, 7.25F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[65].setRotationPoint(-10F, 7.25F, -6.25F);

		bodyModel[66].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 9
		bodyModel[66].setRotationPoint(-27F, -19F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 10
		bodyModel[67].setRotationPoint(-27F, -19F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 21
		bodyModel[68].setRotationPoint(-16F, -19F, -11F);

		bodyModel[69].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[69].setRotationPoint(-15.5F, -19F, 10.5F);

		bodyModel[70].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[70].setRotationPoint(-27.5F, -19F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 23, 5, 22, 0F); // Box 344
		bodyModel[71].setRotationPoint(-28F, -5F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 15
		bodyModel[72].setRotationPoint(-28F, -19F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 37, 20, 14, 0F); // Box 293
		bodyModel[73].setRotationPoint(-15F, -20F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 191
		bodyModel[74].setRotationPoint(-35F, -13F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[75].setRotationPoint(-15F, -21F, 1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[76].setRotationPoint(-15F, -21F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 215
		bodyModel[77].setRotationPoint(-33F, -5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[78].setRotationPoint(22F, -16F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 20, 14, 0F); // Box 217
		bodyModel[79].setRotationPoint(32F, -20F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[80].setRotationPoint(-36F, -13F, 1F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 13, 2, 0F); // Box 54
		bodyModel[81].setRotationPoint(-36F, -13F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[82].setRotationPoint(-36F, -13F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 221
		bodyModel[83].setRotationPoint(35F, -20F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[84].setRotationPoint(35F, -20F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[85].setRotationPoint(35F, -20F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 296 cull
		bodyModel[86].setRotationPoint(-37.5F, -8F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[87].setRotationPoint(-37.5F, -7F, -11.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[88].setRotationPoint(-37.5F, -7F, 10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 282 cull
		bodyModel[89].setRotationPoint(-37.5F, -8F, 9F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 191
		bodyModel[90].setRotationPoint(-37F, -8F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 231
		bodyModel[91].setRotationPoint(-35F, -2.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[92].setRotationPoint(-42F, 0F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[93].setRotationPoint(-42F, 0F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[94].setRotationPoint(-42F, 0F, -6F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 235
		bodyModel[95].setRotationPoint(-42F, -8F, -3F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 236
		bodyModel[96].setRotationPoint(-41F, -2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[97].setRotationPoint(-41F, -8F, -10F);
		bodyModel[97].rotateAngleY = -3.14159265F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[98].setRotationPoint(-41F, -8F, 11F);
		bodyModel[98].rotateAngleY = -3.14159265F;

		bodyModel[99].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 239
		bodyModel[99].setRotationPoint(-41F, -2F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 240
		bodyModel[100].setRotationPoint(-41F, -8F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 241
		bodyModel[101].setRotationPoint(-41F, -8F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 242
		bodyModel[102].setRotationPoint(-41F, -8F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[103].setRotationPoint(-41F, -8F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[104].setRotationPoint(41F, 0F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[105].setRotationPoint(41F, 0F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[106].setRotationPoint(41F, 0F, 4F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 247
		bodyModel[107].setRotationPoint(42F, -8F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 248
		bodyModel[108].setRotationPoint(41F, -8F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[109].setRotationPoint(41F, -8F, -10F);
		bodyModel[109].rotateAngleY = -3.14159265F;

		bodyModel[110].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 250
		bodyModel[110].setRotationPoint(41F, -8F, -8F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 251
		bodyModel[111].setRotationPoint(41F, -2F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 252
		bodyModel[112].setRotationPoint(41F, -8F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[113].setRotationPoint(41F, -8F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[114].setRotationPoint(41F, -8F, 11F);
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 255
		bodyModel[115].setRotationPoint(41F, -2F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 256
		bodyModel[116].setRotationPoint(37.5F, -7F, -11.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 257 cull
		bodyModel[117].setRotationPoint(36.5F, -8F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 258
		bodyModel[118].setRotationPoint(37.5F, -7F, 10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 259 cull
		bodyModel[119].setRotationPoint(36.5F, -8F, 9F);

		bodyModel[120].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 260
		bodyModel[120].setRotationPoint(-37F, -8F, 11F);

		bodyModel[121].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 264
		bodyModel[121].setRotationPoint(-3F, -8F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 265
		bodyModel[122].setRotationPoint(-5F, -2.5F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 266
		bodyModel[123].setRotationPoint(-5F, -2.5F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 267
		bodyModel[124].setRotationPoint(-15F, -13F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 270
		bodyModel[125].setRotationPoint(-3F, -8F, 11F);

		bodyModel[126].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 271
		bodyModel[126].setRotationPoint(-15F, -13F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-0.75F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5F, 0F, -1F, 5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 5F, 0F); // Box 272
		bodyModel[127].setRotationPoint(-36F, -13F, -11.01F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 273
		bodyModel[128].setRotationPoint(-31F, -13F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[129].setRotationPoint(-29F, -22F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.9F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[130].setRotationPoint(-29F, -21F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, -0.9F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[131].setRotationPoint(-29F, -21F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[132].setRotationPoint(-29.15F, -22F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[133].setRotationPoint(-29.15F, -20F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 7, 7, 14, 0F); // Box 285
		bodyModel[134].setRotationPoint(-35F, -20F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[135].setRotationPoint(-36F, -20F, -7F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 287
		bodyModel[136].setRotationPoint(-36F, -20F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 288
		bodyModel[137].setRotationPoint(-36F, -20F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 404
		bodyModel[138].setRotationPoint(-27F, -22F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[139].setRotationPoint(-27F, -22F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Box 407
		bodyModel[140].setRotationPoint(-28F, -22F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 408
		bodyModel[141].setRotationPoint(-28F, -21F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[142].setRotationPoint(-28F, -22F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[143].setRotationPoint(-16F, -22F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[144].setRotationPoint(-16F, -22F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[145].setRotationPoint(-28F, -22F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[146].setRotationPoint(-28F, -21F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[147].setRotationPoint(-27F, -21F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[148].setRotationPoint(-16F, -21F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 148
		bodyModel[149].setRotationPoint(-27F, -21F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[150].setRotationPoint(-28F, -21F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[151].setRotationPoint(-16F, -21F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 195
		bodyModel[152].setRotationPoint(-35F, -14F, -7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[153].setRotationPoint(-35F, -14F, 1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 197
		bodyModel[154].setRotationPoint(-35F, -14F, -1F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 198
		bodyModel[155].setRotationPoint(-36.25F, -13F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front nose
		bodyModel[156].setRotationPoint(-36.4F, -13F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front nose
		bodyModel[157].setRotationPoint(-36.4F, -11F, -1F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[158].setRotationPoint(-36.25F, -21.1F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
		bodyModel[159].setRotationPoint(-36.25F, -20.1F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.9F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[160].setRotationPoint(-36.25F, -20.1F, -6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, -0.9F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[161].setRotationPoint(-36.25F, -20.1F, 1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[162].setRotationPoint(-36.25F, -20.1F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front hh
		bodyModel[163].setRotationPoint(-36.4F, -21.1F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front hh
		bodyModel[164].setRotationPoint(-36.4F, -19.1F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 212
		bodyModel[165].setRotationPoint(-29F, -21F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 213
		bodyModel[166].setRotationPoint(-29F, -21F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[167].setRotationPoint(-15F, -21F, -1F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 215
		bodyModel[168].setRotationPoint(-16F, -21F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 216
		bodyModel[169].setRotationPoint(-35F, -21F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 217
		bodyModel[170].setRotationPoint(-35F, -21F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[171].setRotationPoint(-35F, -21F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[172].setRotationPoint(32F, -21F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[173].setRotationPoint(32F, -21F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[174].setRotationPoint(32F, -21F, 1F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[175].setRotationPoint(34.25F, -21.1F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
		bodyModel[176].setRotationPoint(34.25F, -20.1F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[177].setRotationPoint(35.25F, -20.1F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.9F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[178].setRotationPoint(35.25F, -20.1F, 1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[179].setRotationPoint(34.25F, -20.1F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight rear
		bodyModel[180].setRotationPoint(35.4F, -21.1F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight rear
		bodyModel[181].setRotationPoint(35.4F, -19.1F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0.25F, 0F, 0F); // Box 229
		bodyModel[182].setRotationPoint(-7F, -13F, -11.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0.25F, 0F, 0F); // Box 230
		bodyModel[183].setRotationPoint(-7F, -13F, 11.01F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 231
		bodyModel[184].setRotationPoint(22F, -20F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 10, 16, 7, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[185].setRotationPoint(22F, -16F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[186].setRotationPoint(22F, -20F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 234
		bodyModel[187].setRotationPoint(22F, -22F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[188].setRotationPoint(22F, -22F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 236
		bodyModel[189].setRotationPoint(22F, -22F, 1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 21, 6, 1, 0F,-0.02F, 0F, 0F, -11.02F, 0F, 0F, -11.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -3F, 0F, -11.02F, -3F, 0F, -11.02F, -3F, 0F, -0.02F, -3F, 0F); // Box 247 cull
		bodyModel[190].setRotationPoint(22F, -19F, -7.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 21, 6, 1, 0F,-0.02F, 0F, 0F, -11.02F, 0F, 0F, -11.02F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -3F, 0F, -11.02F, -3F, 0F, -11.02F, -3F, 0F, -0.02F, -3F, 0F); // Box 248 cull
		bodyModel[191].setRotationPoint(22F, -19F, 6.25F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 249
		bodyModel[192].setRotationPoint(14F, -21.75F, -2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 250
		bodyModel[193].setRotationPoint(13.5F, -21.5F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[194].setRotationPoint(13.5F, -21.5F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[195].setRotationPoint(13.5F, -21.5F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 253 sandcap
		bodyModel[196].setRotationPoint(-34F, -21.5F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 254
		bodyModel[197].setRotationPoint(32.5F, -21.5F, -1F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 255
		bodyModel[198].setRotationPoint(-4F, 2.15F, -11.15F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F); // Box 256
		bodyModel[199].setRotationPoint(-4F, 2.15F, -9.15F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 257
		bodyModel[200].setRotationPoint(-4F, 2.15F, 9.15F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[201].setRotationPoint(-4F, 2.15F, 7.15F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 259
		bodyModel[202].setRotationPoint(-36.25F, -17.1F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 260 gryalight front
		bodyModel[203].setRotationPoint(-36.4F, -17.1F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 261 gyralight front
		bodyModel[204].setRotationPoint(-36.4F, -15.1F, -1F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 262
		bodyModel[205].setRotationPoint(35.25F, -17.1F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 263 gyralight rear
		bodyModel[206].setRotationPoint(35.4F, -17.1F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 264 gyralight rear
		bodyModel[207].setRotationPoint(35.4F, -15.1F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F); // Box 266 markerlight
		bodyModel[208].setRotationPoint(-35.1F, -20F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.175F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F); // Box 267 markerlight
		bodyModel[209].setRotationPoint(-35.1F, -20F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F); // Box 266 markerlight
		bodyModel[210].setRotationPoint(34.1F, -20F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0.175F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F); // Box 267 markerlight
		bodyModel[211].setRotationPoint(34.1F, -20F, 6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 270 sandcap short
		bodyModel[212].setRotationPoint(-35F, -13.85F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F); // Box 266 markerlight
		bodyModel[213].setRotationPoint(-28.1F, -21F, -7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, -0.125F, -0.05F); // Box 267 markerlight
		bodyModel[214].setRotationPoint(-28.1F, -21F, 6F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299
		bodyModel[215].setRotationPoint(-14F, -21.75F, -5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[216].setRotationPoint(-14F, -20.75F, -5F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[217].setRotationPoint(-33F, -21.75F, 4F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[218].setRotationPoint(-30F, -20.75F, 4F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 238
		bodyModel[219].setRotationPoint(37F, 6.5F, -8F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 239
		bodyModel[220].setRotationPoint(37F, 8.5F, -11F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 240
		bodyModel[221].setRotationPoint(37F, 6F, -8F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 241
		bodyModel[222].setRotationPoint(37F, 3.5F, -8F);

		bodyModel[223].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 242
		bodyModel[223].setRotationPoint(37F, 3F, -6F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 243
		bodyModel[224].setRotationPoint(37F, 1F, -7F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 244
		bodyModel[225].setRotationPoint(37F, 3F, 6F);

		bodyModel[226].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 245
		bodyModel[226].setRotationPoint(37F, 3.5F, 6F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 246
		bodyModel[227].setRotationPoint(37F, 1F, 4F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 247
		bodyModel[228].setRotationPoint(37F, 6F, 6F);

		bodyModel[229].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 248
		bodyModel[229].setRotationPoint(37F, 6.5F, 8F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 249
		bodyModel[230].setRotationPoint(37F, 8.5F, 8F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 250
		bodyModel[231].setRotationPoint(-2.75F, 2.75F, -11.05F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 251
		bodyModel[232].setRotationPoint(-2.75F, 2.75F, 10.05F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 252
		bodyModel[233].setRotationPoint(33F, -21.75F, 5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 253
		bodyModel[234].setRotationPoint(33F, -20.75F, 5F);

		bodyModel[235].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[235].setRotationPoint(-22.5F, -23.5F, -4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 418 cull platform atsf
		bodyModel[236].setRotationPoint(-28F, -23.5F, -2.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[237].setRotationPoint(-27F, -24.5F, 0F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[238].setRotationPoint(-26F, -24F, 0F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 258
		bodyModel[239].setRotationPoint(-28.75F, -24F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[240].setRotationPoint(-27.5F, -23F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[241].setRotationPoint(-27.5F, -24F, -0.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[242].setRotationPoint(-23F, -23.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[243].setRotationPoint(-23F, -23.5F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[244].setRotationPoint(-23F, -23.5F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[245].setRotationPoint(-23F, -23.5F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[246].setRotationPoint(-23F, -23F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[247].setRotationPoint(-26F, -22.5F, 3.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[248].setRotationPoint(-26F, -23.5F, 5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[249].setRotationPoint(10.5F, -21F, -6.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[250].setRotationPoint(9F, -21.75F, -5.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[251].setRotationPoint(8F, -22F, -6.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[252].setRotationPoint(9.5F, -21.75F, -7.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[253].setRotationPoint(-11.5F, -21F, 4.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[254].setRotationPoint(-12F, -21.75F, 5.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[255].setRotationPoint(-14F, -22F, 4.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[256].setRotationPoint(-13F, -21.75F, 3.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[257].setRotationPoint(-20F, -23.5F, -1.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[258].setRotationPoint(-19F, -23.5F, -0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[259].setRotationPoint(-20F, -23.5F, 0.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[260].setRotationPoint(-18.5F, -22.5F, -0.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[261].setRotationPoint(-33F, -21F, -6F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 50
		bodyModel[262].setRotationPoint(-44F, 9F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 456 cull
		bodyModel[263].setRotationPoint(-42F, 7F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 287 cull
		bodyModel[264].setRotationPoint(-42F, 7F, 3F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 288 cull
		bodyModel[265].setRotationPoint(41F, 7F, -9F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 289
		bodyModel[266].setRotationPoint(41F, 9F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 290 cull
		bodyModel[267].setRotationPoint(41F, 7F, 3F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[268].setRotationPoint(-45F, 7F, 0F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[269].setRotationPoint(-45F, 7F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[270].setRotationPoint(-44F, 6F, 0F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[271].setRotationPoint(-44F, 5F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[272].setRotationPoint(-44F, 6F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[273].setRotationPoint(-44F, 5F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[274].setRotationPoint(-44F, 4F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[275].setRotationPoint(-44F, 4F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 525
		bodyModel[276].setRotationPoint(-44F, 6F, 0F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[277].setRotationPoint(-44F, 6F, -10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 301
		bodyModel[278].setRotationPoint(44F, 7F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 302
		bodyModel[279].setRotationPoint(43F, 6F, 0F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[280].setRotationPoint(43F, 6F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 304
		bodyModel[281].setRotationPoint(43F, 6F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 305
		bodyModel[282].setRotationPoint(44F, 7F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 306
		bodyModel[283].setRotationPoint(43F, 6F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 307
		bodyModel[284].setRotationPoint(43F, 5F, 2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 308
		bodyModel[285].setRotationPoint(43F, 4F, 2F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[286].setRotationPoint(43F, 5F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[287].setRotationPoint(43F, 4F, -8F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[288].setRotationPoint(-42.5F, -3F, -2F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[289].setRotationPoint(41.5F, -3F, -2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[290].setRotationPoint(-41.4F, -4F, -5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[291].setRotationPoint(-41.65F, -4F, -5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[292].setRotationPoint(-41.65F, -2F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[293].setRotationPoint(-41.4F, -4F, 3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[294].setRotationPoint(-41.65F, -4F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[295].setRotationPoint(-41.65F, -2F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[296].setRotationPoint(40.4F, -4F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[297].setRotationPoint(40.65F, -4F, -5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[298].setRotationPoint(40.65F, -2F, -5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[299].setRotationPoint(40.4F, -4F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[300].setRotationPoint(40.65F, -4F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[301].setRotationPoint(40.65F, -2F, 3F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[302].setRotationPoint(-32F, -10F, 6.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[303].setRotationPoint(-34F, -12F, 7.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 12, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 dynamic brakes
		bodyModel[304].setRotationPoint(-2F, -20F, -7.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 24, 6, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -12F, -3F, 0F, -12F, -3F, 0F, 0F, -3F, 0F); // Box 312 dynamic brakes
		bodyModel[305].setRotationPoint(-2F, -20F, 7.51F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 24, 6, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -12F, -3F, 0F, -12F, -3F, 0F, 0F, -3F, 0F); // Box 313 dynamic brakes
		bodyModel[306].setRotationPoint(-2F, -20F, -7.51F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[307].setRotationPoint(-24.5F, -18F, 10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[308].setRotationPoint(-24.5F, -19F, 10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[309].setRotationPoint(-24.5F, -18F, -15F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[310].setRotationPoint(-24.5F, -19F, -13F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[311].setRotationPoint(-26F, -19F, -11F);
		bodyModel[311].rotateAngleX = -0.61086524F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[312].setRotationPoint(-26F, -19F, 11F);
		bodyModel[312].rotateAngleX = 0.61086524F;

		bodyModel[313].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 313 boger mounter
		bodyModel[313].setRotationPoint(-25F, 2.5F, -2F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 315 boger mounter
		bodyModel[314].setRotationPoint(21F, 2.5F, -2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 316 cs
		bodyModel[315].setRotationPoint(-25F, -12F, 4F);
		bodyModel[315].rotateAngleY = 0.52359878F;

		bodyModel[316].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 317 cs hh
		bodyModel[316].setRotationPoint(-27.75F, -21F, 4F);
		bodyModel[316].rotateAngleY = -0.64577182F;

		bodyModel[317].addShapeBox(0.5F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 318 cs hh
		bodyModel[317].setRotationPoint(-27.75F, -14F, 4F);
		bodyModel[317].rotateAngleY = -0.64577182F;

		bodyModel[318].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 319 cs
		bodyModel[318].setRotationPoint(-24F, -12F, 2F);

		bodyModel[319].addShapeBox(0F, 2F, 0F, 1, 5, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 320 cs
		bodyModel[319].setRotationPoint(-25F, -12F, 4F);
		bodyModel[319].rotateAngleY = 0.52359878F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 321 cs radio
		bodyModel[320].setRotationPoint(-23F, -14F, 2F);

		bodyModel[321].addShapeBox(0F, 0F, -5F, 5, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 186
		bodyModel[321].setRotationPoint(22F, -18.75F, -1F);
		bodyModel[321].rotateAngleX = 0.38397244F;

		bodyModel[322].addShapeBox(0F, 0F, -5F, 5, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 323
		bodyModel[322].setRotationPoint(27F, -18.75F, -1F);
		bodyModel[322].rotateAngleX = 0.38397244F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 324
		bodyModel[323].setRotationPoint(27F, -18.75F, 1F);
		bodyModel[323].rotateAngleX = -0.38397244F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 325
		bodyModel[324].setRotationPoint(22F, -18.75F, 1F);
		bodyModel[324].rotateAngleX = -0.38397244F;

		bodyModel[325].addBox(-4F, -9F, 0F, 4, 2, 2, 0F); // Box 325 cs lh
		bodyModel[325].setRotationPoint(-27.75F, -21F, 4F);
		bodyModel[325].rotateAngleY = -0.64577182F;
		bodyModel[325].rotateAngleZ = 3.14159265F;

		bodyModel[326].addShapeBox(0.5F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 326 cs lh
		bodyModel[326].setRotationPoint(-27.75F, -15F, 4F);
		bodyModel[326].rotateAngleY = -0.64577182F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 327 cull anticlimber
		bodyModel[327].setRotationPoint(-43F, 0F, -6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 328 cull anticlimber
		bodyModel[328].setRotationPoint(41F, 0F, -6F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 184 emd repower stack
		bodyModel[329].setRotationPoint(-2F, -23F, -1.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 185 emd repower stack
		bodyModel[330].setRotationPoint(10F, -23F, -1.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[331].setRotationPoint(-41.75F, 0.5F, -8.1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[332].setRotationPoint(-41.5F, 0.5F, -8.1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[333].setRotationPoint(-41.75F, 0.5F, 6.1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[334].setRotationPoint(-41.5F, 0.5F, 6.1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight r
		bodyModel[335].setRotationPoint(41.25F, 0.5F, -8.1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[336].setRotationPoint(41F, 0.5F, -8.1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight r
		bodyModel[337].setRotationPoint(41.25F, 0.5F, 6.1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[338].setRotationPoint(41F, 0.5F, 6.1F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114 bell
		bodyModel[339].setRotationPoint(-37.75F, -22F, -0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 bell
		bodyModel[340].setRotationPoint(-37.75F, -23F, -0.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 bell
		bodyModel[341].setRotationPoint(-37.5F, -21.5F, -0.25F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470 Nose bell hang cull
		bodyModel[342].setRotationPoint(-38.25F, -23F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470 cull cab overhang beacon holder
		bodyModel[343].setRotationPoint(-31F, -22F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 470 cull cab overhang beacon holder
		bodyModel[344].setRotationPoint(36.25F, -21.1F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[345].setRotationPoint(-30.5F, -23F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[346].setRotationPoint(-30.5F, -24F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[347].setRotationPoint(36.75F, -22.1F, -0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[348].setRotationPoint(36.75F, -23.1F, -0.5F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 349 tbea horn
		bodyModel[349].setRotationPoint(30.5F, -22F, 3.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 350 tbea horn
		bodyModel[350].setRotationPoint(29F, -22.75F, 2.5F);

		bodyModel[351].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 351 tbea horn
		bodyModel[351].setRotationPoint(28F, -23F, 3.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 352 tbea horn
		bodyModel[352].setRotationPoint(30F, -22.75F, 4.5F);
	}
	ModelTypeBnew theB = new ModelTypeBnew();
	Modelgolftruck theG = new Modelgolftruck();
	ModelBM750 theThirdRail = new ModelBM750();
	Model4ed_172_deets_crl theDeets = new Model4ed_172_deets_crl();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 334) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_DarkGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 439||GetColor(entity) == 326){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 18||GetColor(entity) == 19||GetColor(entity) == 20){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/bm750_dc_3rd_rail.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theThirdRail.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theThirdRail.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			if (((AbstractTrains) entity).getColor() == 18) {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/4ed_deets_ccrl.png"));
				GL11.glPushMatrix();
				theDeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}else if (((AbstractTrains) entity).getColor() == 19){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/4ed_deets_nse.png"));
				GL11.glPushMatrix();
				theDeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}else if (((AbstractTrains) entity).getColor() == 20){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/4ed_deets_ser.png"));
				GL11.glPushMatrix();
				theDeets.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}

		} else if (GetColor(entity) == 6 || GetColor(entity) == 9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/golftruck2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theG.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theG.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 8){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/golftruck2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theG.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theG.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.43, -0.00, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.87, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

}