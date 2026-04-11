//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: Prof_Binky
// Created on: 12.03.2022 - 22:32:26
// Last changed on: 12.03.2022 - 22:32:26

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelMLW_3axle_Hiad;
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

public class ModelM63X_round extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelM63X_round() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[322];

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
		bodyModel[63] = new ModelRendererTurbo(this, 219, 93, textureX, textureY, "cull"); // Box 455 cull
		bodyModel[64] = new ModelRendererTurbo(this, 443, 93, textureX, textureY, "cull"); // Box 259 cull
		bodyModel[65] = new ModelRendererTurbo(this, 239, 102, textureX, textureY); // Box 307
		bodyModel[66] = new ModelRendererTurbo(this, 447, 102, textureX, textureY); // Box 309
		bodyModel[67] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 25
		bodyModel[68] = new ModelRendererTurbo(this, 2, 80, textureX, textureY, "cull"); // Box 56 nose cull
		bodyModel[69] = new ModelRendererTurbo(this, 11, 71, textureX, textureY); // Box 26
		bodyModel[70] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Box 27
		bodyModel[71] = new ModelRendererTurbo(this, 21, 70, textureX, textureY); // Box 28
		bodyModel[72] = new ModelRendererTurbo(this, 17, 78, textureX, textureY); // Box 63
		bodyModel[73] = new ModelRendererTurbo(this, 29, 76, textureX, textureY); // Box 64
		bodyModel[74] = new ModelRendererTurbo(this, 29, 79, textureX, textureY); // Box 439
		bodyModel[75] = new ModelRendererTurbo(this, 76, 74, textureX, textureY); // Box 443
		bodyModel[76] = new ModelRendererTurbo(this, 71, 91, textureX, textureY); // Box 445
		bodyModel[77] = new ModelRendererTurbo(this, 71, 88, textureX, textureY); // Box 446
		bodyModel[78] = new ModelRendererTurbo(this, 25, 77, textureX, textureY); // Box 238
		bodyModel[79] = new ModelRendererTurbo(this, 0, 62, textureX, textureY, "lamp"); // Headlight front n lamp
		bodyModel[80] = new ModelRendererTurbo(this, 0, 67, textureX, textureY, "lamp"); // Headlight front n lamp
		bodyModel[81] = new ModelRendererTurbo(this, 53, 79, textureX, textureY); // Box 265
		bodyModel[82] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 95
		bodyModel[83] = new ModelRendererTurbo(this, 111, 60, textureX, textureY); // Box 129
		bodyModel[84] = new ModelRendererTurbo(this, 104, 53, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 102, 45, textureX, textureY); // Box 135
		bodyModel[86] = new ModelRendererTurbo(this, 86, 38, textureX, textureY); // Box 195 door swing left
		bodyModel[87] = new ModelRendererTurbo(this, 15, 19, textureX, textureY); // Box 29
		bodyModel[88] = new ModelRendererTurbo(this, 40, 19, textureX, textureY); // Box 32
		bodyModel[89] = new ModelRendererTurbo(this, 65, 39, textureX, textureY); // Box 406
		bodyModel[90] = new ModelRendererTurbo(this, 138, 60, textureX, textureY); // Box 416
		bodyModel[91] = new ModelRendererTurbo(this, 104, 38, textureX, textureY); // Box 57
		bodyModel[92] = new ModelRendererTurbo(this, 111, 34, textureX, textureY); // Box 58
		bodyModel[93] = new ModelRendererTurbo(this, 45, 52, textureX, textureY); // Box 295
		bodyModel[94] = new ModelRendererTurbo(this, 138, 34, textureX, textureY); // Box 297
		bodyModel[95] = new ModelRendererTurbo(this, 69, 32, textureX, textureY); // Box 298
		bodyModel[96] = new ModelRendererTurbo(this, 66, 48, textureX, textureY); // Box 299
		bodyModel[97] = new ModelRendererTurbo(this, 69, 40, textureX, textureY); // Box 300
		bodyModel[98] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box 71
		bodyModel[99] = new ModelRendererTurbo(this, 104, 64, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 104, 60, textureX, textureY); // Box 121
		bodyModel[101] = new ModelRendererTurbo(this, 26, 11, textureX, textureY, "lamp"); // Numberboard f glow
		bodyModel[102] = new ModelRendererTurbo(this, 14, 36, textureX, textureY); // Box 205
		bodyModel[103] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 206
		bodyModel[104] = new ModelRendererTurbo(this, 9, 37, textureX, textureY); // Box 207
		bodyModel[105] = new ModelRendererTurbo(this, 22, 11, textureX, textureY, "lamp"); // Classlights glow
		bodyModel[106] = new ModelRendererTurbo(this, 13, 32, textureX, textureY); // Box 224
		bodyModel[107] = new ModelRendererTurbo(this, 45, 32, textureX, textureY); // Box 225
		bodyModel[108] = new ModelRendererTurbo(this, 75, 163, textureX, textureY); // Box 253
		bodyModel[109] = new ModelRendererTurbo(this, 75, 135, textureX, textureY); // Box 254
		bodyModel[110] = new ModelRendererTurbo(this, 109, 29, textureX, textureY); // Box 225
		bodyModel[111] = new ModelRendererTurbo(this, 69, 6, textureX, textureY); // Box 234
		bodyModel[112] = new ModelRendererTurbo(this, 5, 44, textureX, textureY); // Box 315 door swing left
		bodyModel[113] = new ModelRendererTurbo(this, 41, 11, textureX, textureY, "lamp"); // Numberboard f glow
		bodyModel[114] = new ModelRendererTurbo(this, 104, 34, textureX, textureY); // Box 208
		bodyModel[115] = new ModelRendererTurbo(this, 104, 29, textureX, textureY); // Box 209 door swing left
		bodyModel[116] = new ModelRendererTurbo(this, 49, 11, textureX, textureY, "lamp"); // Classlights glow
		bodyModel[117] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 231
		bodyModel[118] = new ModelRendererTurbo(this, 53, 35, textureX, textureY); // Box 232
		bodyModel[119] = new ModelRendererTurbo(this, 62, 3, textureX, textureY); // Box 233
		bodyModel[120] = new ModelRendererTurbo(this, 109, 64, textureX, textureY); // Box 226
		bodyModel[121] = new ModelRendererTurbo(this, 134, 64, textureX, textureY); // Box 266 door swing left
		bodyModel[122] = new ModelRendererTurbo(this, 66, 91, textureX, textureY); // Box 445
		bodyModel[123] = new ModelRendererTurbo(this, 66, 88, textureX, textureY); // Box 446
		bodyModel[124] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Box 26
		bodyModel[125] = new ModelRendererTurbo(this, 277, 49, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 286, 42, textureX, textureY); // Box 496
		bodyModel[127] = new ModelRendererTurbo(this, 286, 29, textureX, textureY); // Box 497
		bodyModel[128] = new ModelRendererTurbo(this, 287, 36, textureX, textureY); // Box 498
		bodyModel[129] = new ModelRendererTurbo(this, 477, 12, textureX, textureY, "lamp"); // Headlight r lamp
		bodyModel[130] = new ModelRendererTurbo(this, 477, 5, textureX, textureY, "lamp"); // Headlight r lamp
		bodyModel[131] = new ModelRendererTurbo(this, 341, 2, textureX, textureY); // Box 117
		bodyModel[132] = new ModelRendererTurbo(this, 421, 23, textureX, textureY, "cull"); // Walkway cull
		bodyModel[133] = new ModelRendererTurbo(this, 410, 51, textureX, textureY); // Box 493 425 radiator bit
		bodyModel[134] = new ModelRendererTurbo(this, 464, 231, textureX, textureY); // Box 494
		bodyModel[135] = new ModelRendererTurbo(this, 489, 231, textureX, textureY); // Box 494
		bodyModel[136] = new ModelRendererTurbo(this, 461, 68, textureX, textureY); // Box 117
		bodyModel[137] = new ModelRendererTurbo(this, 461, 68, textureX, textureY); // Box 117
		bodyModel[138] = new ModelRendererTurbo(this, 405, 1, textureX, textureY); // Box 494
		bodyModel[139] = new ModelRendererTurbo(this, 234, 47, textureX, textureY); // Box 2 Air intake box
		bodyModel[140] = new ModelRendererTurbo(this, 254, 3, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 205, 11, textureX, textureY); // Box 2
		bodyModel[142] = new ModelRendererTurbo(this, 244, 11, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 397, 34, textureX, textureY); // Box 236
		bodyModel[145] = new ModelRendererTurbo(this, 94, 163, textureX, textureY); // Box 245
		bodyModel[146] = new ModelRendererTurbo(this, 94, 135, textureX, textureY); // Box 247
		bodyModel[147] = new ModelRendererTurbo(this, 362, 23, textureX, textureY); // Box 501 dynamics
		bodyModel[148] = new ModelRendererTurbo(this, 115, 165, textureX, textureY); // Box 245
		bodyModel[149] = new ModelRendererTurbo(this, 53, 44, textureX, textureY); // Box 195 door swing left
		bodyModel[150] = new ModelRendererTurbo(this, 87, 6, textureX, textureY); // Box 234
		bodyModel[151] = new ModelRendererTurbo(this, 115, 135, textureX, textureY); // Box 247
		bodyModel[152] = new ModelRendererTurbo(this, 414, 153, textureX, textureY); // Box 138 mount point
		bodyModel[153] = new ModelRendererTurbo(this, 262, 153, textureX, textureY); // Box 138 mount point
		bodyModel[154] = new ModelRendererTurbo(this, 272, 170, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 250, 177, textureX, textureY); // Box 14
		bodyModel[156] = new ModelRendererTurbo(this, 248, 172, textureX, textureY); // Box 14
		bodyModel[157] = new ModelRendererTurbo(this, 426, 177, textureX, textureY); // Box 14
		bodyModel[158] = new ModelRendererTurbo(this, 424, 172, textureX, textureY); // Box 14
		bodyModel[159] = new ModelRendererTurbo(this, 250, 169, textureX, textureY); // Box 14
		bodyModel[160] = new ModelRendererTurbo(this, 248, 164, textureX, textureY); // Box 14
		bodyModel[161] = new ModelRendererTurbo(this, 426, 169, textureX, textureY); // Box 14
		bodyModel[162] = new ModelRendererTurbo(this, 424, 164, textureX, textureY); // Box 14
		bodyModel[163] = new ModelRendererTurbo(this, 298, 151, textureX, textureY); // Box 23
		bodyModel[164] = new ModelRendererTurbo(this, 243, 158, textureX, textureY); // Box 14
		bodyModel[165] = new ModelRendererTurbo(this, 272, 154, textureX, textureY); // Box 14
		bodyModel[166] = new ModelRendererTurbo(this, 289, 173, textureX, textureY); // Box 14
		bodyModel[167] = new ModelRendererTurbo(this, 370, 154, textureX, textureY); // Box 14
		bodyModel[168] = new ModelRendererTurbo(this, 395, 173, textureX, textureY); // Box 14
		bodyModel[169] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 14
		bodyModel[170] = new ModelRendererTurbo(this, 387, 173, textureX, textureY); // Box 14
		bodyModel[171] = new ModelRendererTurbo(this, 408, 171, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 272, 165, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 302, 163, textureX, textureY); // Box 178 tank main
		bodyModel[175] = new ModelRendererTurbo(this, 282, 213, textureX, textureY); // Box 356
		bodyModel[176] = new ModelRendererTurbo(this, 284, 213, textureX, textureY); // Box 357
		bodyModel[177] = new ModelRendererTurbo(this, 247, 151, textureX, textureY); // Box 362 brake chain holder
		bodyModel[178] = new ModelRendererTurbo(this, 310, 163, textureX, textureY); // Box 374
		bodyModel[179] = new ModelRendererTurbo(this, 311, 165, textureX, textureY); // Box 375
		bodyModel[180] = new ModelRendererTurbo(this, 371, 165, textureX, textureY); // Box 376
		bodyModel[181] = new ModelRendererTurbo(this, 370, 163, textureX, textureY); // Box 377
		bodyModel[182] = new ModelRendererTurbo(this, 290, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[183] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[184] = new ModelRendererTurbo(this, 345, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[185] = new ModelRendererTurbo(this, 370, 187, textureX, textureY); // Box 381 standard tank
		bodyModel[186] = new ModelRendererTurbo(this, 277, 182, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[187] = new ModelRendererTurbo(this, 395, 158, textureX, textureY); // Box 14
		bodyModel[188] = new ModelRendererTurbo(this, 246, 158, textureX, textureY); // Box 362 brake chain holder
		bodyModel[189] = new ModelRendererTurbo(this, 290, 201, textureX, textureY); // Box 382 CP tank moment
		bodyModel[190] = new ModelRendererTurbo(this, 303, 201, textureX, textureY); // Box 382 CP tank moment
		bodyModel[191] = new ModelRendererTurbo(this, 301, 163, textureX, textureY); // Box 374
		bodyModel[192] = new ModelRendererTurbo(this, 302, 165, textureX, textureY); // Box 375
		bodyModel[193] = new ModelRendererTurbo(this, 344, 208, textureX, textureY, "cull"); // Box 178 CN rerailer cull
		bodyModel[194] = new ModelRendererTurbo(this, 355, 208, textureX, textureY, "cull"); // Box 178 CN rerailer cull
		bodyModel[195] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Box 356 CP tanks
		bodyModel[196] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Box 356 CP tanks
		bodyModel[197] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Box 356 CP tanks
		bodyModel[198] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 25
		bodyModel[199] = new ModelRendererTurbo(this, 69, 81, textureX, textureY); // Box 25
		bodyModel[200] = new ModelRendererTurbo(this, 70, 75, textureX, textureY); // Box 25
		bodyModel[201] = new ModelRendererTurbo(this, 59, 73, textureX, textureY); // Box 25
		bodyModel[202] = new ModelRendererTurbo(this, 310, 207, textureX, textureY); // Box 381 Quebecous moment
		bodyModel[203] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 381 Quebecous moment
		bodyModel[204] = new ModelRendererTurbo(this, 467, 218, textureX, textureY); // Box 494
		bodyModel[205] = new ModelRendererTurbo(this, 234, 31, textureX, textureY, "cull"); // Box 2 Air intake cull
		bodyModel[206] = new ModelRendererTurbo(this, 94, 153, textureX, textureY); // Box 206
		bodyModel[207] = new ModelRendererTurbo(this, 94, 125, textureX, textureY); // Box 206
		bodyModel[208] = new ModelRendererTurbo(this, 221, 124, textureX, textureY); // Box 186
		bodyModel[209] = new ModelRendererTurbo(this, 221, 152, textureX, textureY); // Box 186
		bodyModel[210] = new ModelRendererTurbo(this, 94, 117, textureX, textureY); // Box 206
		bodyModel[211] = new ModelRendererTurbo(this, 79, 122, textureX, textureY); // Box 206
		bodyModel[212] = new ModelRendererTurbo(this, 79, 150, textureX, textureY); // Box 206
		bodyModel[213] = new ModelRendererTurbo(this, 94, 145, textureX, textureY); // Box 206
		bodyModel[214] = new ModelRendererTurbo(this, 76, 150, textureX, textureY); // Box 186
		bodyModel[215] = new ModelRendererTurbo(this, 76, 124, textureX, textureY); // Box 186
		bodyModel[216] = new ModelRendererTurbo(this, 11, 123, textureX, textureY); // Box 186
		bodyModel[217] = new ModelRendererTurbo(this, 14, 105, textureX, textureY); // Box 186
		bodyModel[218] = new ModelRendererTurbo(this, 51, 123, textureX, textureY); // Box 186
		bodyModel[219] = new ModelRendererTurbo(this, 463, 142, textureX, textureY); // Box 186
		bodyModel[220] = new ModelRendererTurbo(this, 466, 124, textureX, textureY); // Box 186
		bodyModel[221] = new ModelRendererTurbo(this, 503, 142, textureX, textureY); // Box 186
		bodyModel[222] = new ModelRendererTurbo(this, 14, 119, textureX, textureY); // Box 186
		bodyModel[223] = new ModelRendererTurbo(this, 48, 119, textureX, textureY); // Box 186
		bodyModel[224] = new ModelRendererTurbo(this, 466, 138, textureX, textureY); // Box 186
		bodyModel[225] = new ModelRendererTurbo(this, 500, 138, textureX, textureY); // Box 186
		bodyModel[226] = new ModelRendererTurbo(this, 463, 205, textureX, textureY); // Box 494
		bodyModel[227] = new ModelRendererTurbo(this, 33, 86, textureX, textureY); // Box 238 QCM cap
		bodyModel[228] = new ModelRendererTurbo(this, 232, 63, textureX, textureY); // Box 261 dash 7 vents
		bodyModel[229] = new ModelRendererTurbo(this, 70, 3, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 62, 38, textureX, textureY); // Box 298
		bodyModel[231] = new ModelRendererTurbo(this, 62, 30, textureX, textureY); // Box 298
		bodyModel[232] = new ModelRendererTurbo(this, 139, 104, textureX, textureY); // Box 412 cs1
		bodyModel[233] = new ModelRendererTurbo(this, 122, 104, textureX, textureY); // Box 413 cs1
		bodyModel[234] = new ModelRendererTurbo(this, 122, 97, textureX, textureY); // Box 86 cs1
		bodyModel[235] = new ModelRendererTurbo(this, 151, 97, textureX, textureY); // Box 476 cs1 radio
		bodyModel[236] = new ModelRendererTurbo(this, 17, 145, textureX, textureY, BoxName.ditch); // Box 359 front ditchlight L
		bodyModel[237] = new ModelRendererTurbo(this, 10, 145, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[238] = new ModelRendererTurbo(this, 10, 145, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[239] = new ModelRendererTurbo(this, 17, 145, textureX, textureY, BoxName.ditch); // Box 321 front ditchlight L
		bodyModel[240] = new ModelRendererTurbo(this, 156, 23, textureX, textureY); // Box 114
		bodyModel[241] = new ModelRendererTurbo(this, 156, 20, textureX, textureY); // Box 74
		bodyModel[242] = new ModelRendererTurbo(this, 156, 26, textureX, textureY); // Box 78
		bodyModel[243] = new ModelRendererTurbo(this, 156, 16, textureX, textureY, "cull"); // Bell hang cull
		bodyModel[244] = new ModelRendererTurbo(this, 169, 26, textureX, textureY); // Box 331 M5
		bodyModel[245] = new ModelRendererTurbo(this, 169, 20, textureX, textureY); // Box 331 M5
		bodyModel[246] = new ModelRendererTurbo(this, 160, 13, textureX, textureY); // Box 330
		bodyModel[247] = new ModelRendererTurbo(this, 169, 29, textureX, textureY); // Box 331 M5
		bodyModel[248] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 331 M5
		bodyModel[249] = new ModelRendererTurbo(this, 167, 23, textureX, textureY); // Box 331 M5
		bodyModel[250] = new ModelRendererTurbo(this, 13, 211, textureX, textureY); // Box 132
		bodyModel[251] = new ModelRendererTurbo(this, 38, 211, textureX, textureY); // Box 133
		bodyModel[252] = new ModelRendererTurbo(this, 484, 187, textureX, textureY); // Box 132
		bodyModel[253] = new ModelRendererTurbo(this, 459, 187, textureX, textureY); // Box 133
		bodyModel[254] = new ModelRendererTurbo(this, 230, 47, textureX, textureY, "cull"); // Box 2 Air intake cull
		bodyModel[255] = new ModelRendererTurbo(this, 147, 15, textureX, textureY); // Box 439
		bodyModel[256] = new ModelRendererTurbo(this, 277, 6, textureX, textureY); // Box 2 Air intake box vent covers
		bodyModel[257] = new ModelRendererTurbo(this, 290, 8, textureX, textureY); // Box 2 Air intake box vent covers
		bodyModel[258] = new ModelRendererTurbo(this, 286, 0, textureX, textureY); // Box 2 Air intake box vent covers
		bodyModel[259] = new ModelRendererTurbo(this, 61, 80, textureX, textureY); // Box 43
		bodyModel[260] = new ModelRendererTurbo(this, 66, 80, textureX, textureY); // Box 43
		bodyModel[261] = new ModelRendererTurbo(this, 40, 163, textureX, textureY); // Box 361
		bodyModel[262] = new ModelRendererTurbo(this, 254, 17, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 244, 25, textureX, textureY); // Box 2
		bodyModel[264] = new ModelRendererTurbo(this, 147, 17, textureX, textureY); // Box 439
		bodyModel[265] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[266] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[267] = new ModelRendererTurbo(this, 477, 166, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[268] = new ModelRendererTurbo(this, 485, 166, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[269] = new ModelRendererTurbo(this, 32, 118, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[270] = new ModelRendererTurbo(this, 484, 137, textureX, textureY); // Not a ditchlight will not glow
		bodyModel[271] = new ModelRendererTurbo(this, 189, 1, textureX, textureY); // Box 330
		bodyModel[272] = new ModelRendererTurbo(this, 187, 10, textureX, textureY); // Box 329
		bodyModel[273] = new ModelRendererTurbo(this, 187, 4, textureX, textureY); // Box 328
		bodyModel[274] = new ModelRendererTurbo(this, 185, 7, textureX, textureY); // Box 327
		bodyModel[275] = new ModelRendererTurbo(this, 197, 33, textureX, textureY); // Box 2 CP vents
		bodyModel[276] = new ModelRendererTurbo(this, 189, 25, textureX, textureY); // Box 2 CP vents
		bodyModel[277] = new ModelRendererTurbo(this, 397, 28, textureX, textureY); // Box 438 CP M series details
		bodyModel[278] = new ModelRendererTurbo(this, 285, 14, textureX, textureY); // Box 2 Air intake CP moment
		bodyModel[279] = new ModelRendererTurbo(this, 277, 20, textureX, textureY); // Box 2 Air intake CP moment
		bodyModel[280] = new ModelRendererTurbo(this, 402, 0, textureX, textureY); // Box 438 CP M series details
		bodyModel[281] = new ModelRendererTurbo(this, 402, 9, textureX, textureY); // Box 438 CP M series details
		bodyModel[282] = new ModelRendererTurbo(this, 406, 18, textureX, textureY); // Box 438 CP M series details
		bodyModel[283] = new ModelRendererTurbo(this, 180, 1, textureX, textureY); // Box 329 CP M3
		bodyModel[284] = new ModelRendererTurbo(this, 178, 10, textureX, textureY); // Box 329 CP M3
		bodyModel[285] = new ModelRendererTurbo(this, 178, 4, textureX, textureY); // Box 329 CP M3
		bodyModel[286] = new ModelRendererTurbo(this, 176, 7, textureX, textureY); // Box 329 CP M3
		bodyModel[287] = new ModelRendererTurbo(this, 300, 12, textureX, textureY); // Box 438 CP M series details
		bodyModel[288] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 331 M5 QCM
		bodyModel[289] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 331 M5 QCM
		bodyModel[290] = new ModelRendererTurbo(this, 169, 10, textureX, textureY); // Box 331 M5 QCM
		bodyModel[291] = new ModelRendererTurbo(this, 169, 4, textureX, textureY); // Box 331 M5 QCM
		bodyModel[292] = new ModelRendererTurbo(this, 167, 7, textureX, textureY); // Box 331 M5 QCM
		bodyModel[293] = new ModelRendererTurbo(this, 40, 150, textureX, textureY); // Box 361 QCM plow
		bodyModel[294] = new ModelRendererTurbo(this, 396, 223, textureX, textureY); // Box 285
		bodyModel[295] = new ModelRendererTurbo(this, 423, 221, textureX, textureY); // Box 286
		bodyModel[296] = new ModelRendererTurbo(this, 395, 221, textureX, textureY); // Box 356
		bodyModel[297] = new ModelRendererTurbo(this, 395, 228, textureX, textureY); // Box 357
		bodyModel[298] = new ModelRendererTurbo(this, 411, 228, textureX, textureY); // Box 361
		bodyModel[299] = new ModelRendererTurbo(this, 411, 221, textureX, textureY); // Box 363
		bodyModel[300] = new ModelRendererTurbo(this, 403, 217, textureX, textureY); // Box 286
		bodyModel[301] = new ModelRendererTurbo(this, 468, 13, textureX, textureY); // Box 238 sand cap
		bodyModel[302] = new ModelRendererTurbo(this, 59, 231, textureX, textureY, "cull"); // Box 133 CP plow cull
		bodyModel[303] = new ModelRendererTurbo(this, 87, 231, textureX, textureY, "cull"); // Box 133 CP plow cull
		bodyModel[304] = new ModelRendererTurbo(this, 23, 7, textureX, textureY, "lamp"); // Classlights CN QCM glow
		bodyModel[305] = new ModelRendererTurbo(this, 50, 7, textureX, textureY, "lamp"); // Classlights CN QCM glow
		bodyModel[306] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 206
		bodyModel[307] = new ModelRendererTurbo(this, 94, 115, textureX, textureY); // Box 206
		bodyModel[308] = new ModelRendererTurbo(this, 86, 148, textureX, textureY); // Box 206
		bodyModel[309] = new ModelRendererTurbo(this, 79, 120, textureX, textureY); // Box 206
		bodyModel[310] = new ModelRendererTurbo(this, 102, 115, textureX, textureY); // Box 206
		bodyModel[311] = new ModelRendererTurbo(this, 13, 186, textureX, textureY); // Box 4
		bodyModel[312] = new ModelRendererTurbo(this, 13, 198, textureX, textureY); // Box 4
		bodyModel[313] = new ModelRendererTurbo(this, 2, 172, textureX, textureY); // Box 446
		bodyModel[314] = new ModelRendererTurbo(this, 40, 186, textureX, textureY); // Box 4
		bodyModel[315] = new ModelRendererTurbo(this, 40, 198, textureX, textureY); // Box 4
		bodyModel[316] = new ModelRendererTurbo(this, 55, 172, textureX, textureY); // Box 446
		bodyModel[317] = new ModelRendererTurbo(this, 40, 174, textureX, textureY); // Box 448
		bodyModel[318] = new ModelRendererTurbo(this, 17, 174, textureX, textureY); // Box 448
		bodyModel[319] = new ModelRendererTurbo(this, 17, 163, textureX, textureY); // Box 361
		bodyModel[320] = new ModelRendererTurbo(this, 17, 150, textureX, textureY); // Box 361 QCM plow
		bodyModel[321] = new ModelRendererTurbo(this, 176, 200, textureX, textureY, "cull"); // Rear vents protetors cull

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

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[18].setRotationPoint(-45F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
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

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[43].setRotationPoint(44F, -2F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 213
		bodyModel[44].setRotationPoint(44F, -2F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
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

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 455 cull
		bodyModel[63].setRotationPoint(-49F, -2F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 259 cull
		bodyModel[64].setRotationPoint(48F, -2F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 307
		bodyModel[65].setRotationPoint(-50F, -1.99F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 309
		bodyModel[66].setRotationPoint(48F, -1.99F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 25
		bodyModel[67].setRotationPoint(-45F, -14F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 56 nose cull
		bodyModel[68].setRotationPoint(-46F, -14F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[69].setRotationPoint(-45F, -15F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[70].setRotationPoint(-45F, -15F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 28
		bodyModel[71].setRotationPoint(-46F, -15F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[72].setRotationPoint(-46F, -15F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[73].setRotationPoint(-46F, -15F, 2F);

		bodyModel[74].addBox(0F, 0F, 0F, 5, 12, 13, 0F); // Box 439
		bodyModel[74].setRotationPoint(-45F, -14F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[75].setRotationPoint(-40F, -15F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 445
		bodyModel[76].setRotationPoint(-40.5F, -14F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[77].setRotationPoint(-40.5F, -15F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238
		bodyModel[78].setRotationPoint(-46F, -15.5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front n lamp
		bodyModel[79].setRotationPoint(-46.5F, -14.5F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front n lamp
		bodyModel[80].setRotationPoint(-46.5F, -12.5F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[81].setRotationPoint(-40F, -14F, 2F);

		bodyModel[82].addBox(0F, 0F, 0F, 17, 5, 22, 0F); // Box 95
		bodyModel[82].setRotationPoint(-43F, -7F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[83].setRotationPoint(-38F, -22F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[84].setRotationPoint(-38F, -24F, 3F);

		bodyModel[85].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[85].setRotationPoint(-39F, -24F, -3F);

		bodyModel[86].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 195 door swing left
		bodyModel[86].setRotationPoint(-26.5F, -21F, 7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 29
		bodyModel[87].setRotationPoint(-38F, -18F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 32
		bodyModel[88].setRotationPoint(-38F, -18F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 406
		bodyModel[89].setRotationPoint(-27F, -18F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[90].setRotationPoint(-27F, -22F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[91].setRotationPoint(-38F, -24F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[92].setRotationPoint(-38F, -22F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Box 295
		bodyModel[93].setRotationPoint(-27F, -21F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[94].setRotationPoint(-27F, -22F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[95].setRotationPoint(-27F, -23F, 3F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 299
		bodyModel[96].setRotationPoint(-28F, -23F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[97].setRotationPoint(-27F, -23F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[98].setRotationPoint(-39F, -24F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[99].setRotationPoint(-39F, -21F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[100].setRotationPoint(-39F, -22F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 1.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 1.1F, 0F, 0F); // Numberboard f glow
		bodyModel[101].setRotationPoint(-39.5F, -21.5F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 205
		bodyModel[102].setRotationPoint(-39F, -24F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, -1F, -1.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 206
		bodyModel[103].setRotationPoint(-40F, -24F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 207
		bodyModel[104].setRotationPoint(-40F, -24F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0.055F, 0F, 0F, -0.25F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.055F, 0F, 0F, -0.25F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F); // Classlights glow
		bodyModel[105].setRotationPoint(-39.52F, -22.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[106].setRotationPoint(-40F, -24F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 225
		bodyModel[107].setRotationPoint(-40F, -24F, 0F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 253
		bodyModel[108].setRotationPoint(-44F, -4.5F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 254
		bodyModel[109].setRotationPoint(-44F, -4.5F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[110].setRotationPoint(-38F, -21F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1.5F, -0.5F, 0F, 2F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[111].setRotationPoint(-39.5F, -23F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 door swing left
		bodyModel[112].setRotationPoint(-39F, -21F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1.1F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1.1F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Numberboard f glow
		bodyModel[113].setRotationPoint(-39.5F, -21.5F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[114].setRotationPoint(-39F, -22F, -10F);

		bodyModel[115].addShapeBox(0.5F, 0F, -3.5F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209 door swing left
		bodyModel[115].setRotationPoint(-39.5F, -21F, -7.5F);

		bodyModel[116].addShapeBox(0F, 0F, -4F, 1, 1, 3, 0F,0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F); // Classlights glow
		bodyModel[116].setRotationPoint(-39.52F, -22.5F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F); // Box 231
		bodyModel[117].setRotationPoint(-40F, -23F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 232
		bodyModel[118].setRotationPoint(-40F, -23F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,-0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.05F, 0F, 0F); // Box 233
		bodyModel[119].setRotationPoint(-40.5F, -23F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[120].setRotationPoint(-38F, -21F, 10F);

		bodyModel[121].addShapeBox(-0.5F, 0F, 2.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266 door swing left
		bodyModel[121].setRotationPoint(-26.5F, -21F, 7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 445
		bodyModel[122].setRotationPoint(-43.5F, -14F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[123].setRotationPoint(-43.5F, -15F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[124].setRotationPoint(-43F, -15F, -6F);

		bodyModel[125].addBox(0F, 0F, 0F, 52, 20, 14, 0F); // Box 2
		bodyModel[125].setRotationPoint(-26F, -22F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[126].setRotationPoint(-26F, -23F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[127].setRotationPoint(-26F, -23F, 2F);

		bodyModel[128].addBox(0F, 0F, 0F, 52, 1, 4, 0F); // Box 498
		bodyModel[128].setRotationPoint(-26F, -23F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight r lamp
		bodyModel[129].setRotationPoint(45.75F, -20.5F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight r lamp
		bodyModel[130].setRotationPoint(45.75F, -22.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 117
		bodyModel[131].setRotationPoint(26F, -22F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Walkway cull
		bodyModel[132].setRotationPoint(26F, -23.25F, -2F);

		bodyModel[133].addBox(0F, 0F, 0F, 18, 17, 15, 0F); // Box 493 425 radiator bit
		bodyModel[133].setRotationPoint(26F, -19F, -7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 24, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 494
		bodyModel[134].setRotationPoint(31F, -14F, 7.51F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 11, 24, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 494
		bodyModel[135].setRotationPoint(29F, -14F, -7.51F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 117
		bodyModel[136].setRotationPoint(26F, -22F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 117
		bodyModel[137].setRotationPoint(41F, -22F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 18, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 494
		bodyModel[138].setRotationPoint(26F, -22.01F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 2 Air intake box
		bodyModel[139].setRotationPoint(-20F, -23F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[140].setRotationPoint(-16F, -23.5F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 2
		bodyModel[141].setRotationPoint(-20F, -23.5F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 16, 5, 0, 0F,0F, -0.5F, 0F, -8.5F, -0.5F, 0F, -8.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -8.5F, -0.25F, 0F, -8.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[142].setRotationPoint(-14.75F, -23.5F, -8.01F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 24, 5, 0, 0F,0F, -0.5F, 0F, -12.5F, -0.5F, 0F, -12.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -12.5F, -0.25F, 0F, -12.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[143].setRotationPoint(-18.75F, -23.5F, 8.01F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 236
		bodyModel[144].setRotationPoint(15F, -24F, -2F);

		bodyModel[145].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 245
		bodyModel[145].setRotationPoint(-26F, -7F, 7F);

		bodyModel[146].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 247
		bodyModel[146].setRotationPoint(-26F, -7F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501 dynamics
		bodyModel[147].setRotationPoint(-1F, -24F, -2F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 245
		bodyModel[148].setRotationPoint(-20F, -5F, 7F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 14, 3, 0F); // Box 195 door swing left
		bodyModel[149].setRotationPoint(-39F, -21F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 2F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 234
		bodyModel[150].setRotationPoint(-39.5F, -23F, 2F);

		bodyModel[151].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 247
		bodyModel[151].setRotationPoint(-20F, -7F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 138 mount point
		bodyModel[152].setRotationPoint(30.5F, 1.5F, -1.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 138 mount point
		bodyModel[153].setRotationPoint(-33.5F, 1.5F, -1.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
		bodyModel[154].setRotationPoint(-33.5F, -1F, -11.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[155].setRotationPoint(-30.5F, 2F, -8.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[156].setRotationPoint(-30.5F, 1F, -8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[157].setRotationPoint(27.5F, 2F, -8.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[158].setRotationPoint(27.5F, 1F, -8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[159].setRotationPoint(-30.5F, 2F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[160].setRotationPoint(-30.5F, 1F, 5.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[161].setRotationPoint(27.5F, 2F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[162].setRotationPoint(27.5F, 1F, 5.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 36, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 23
		bodyModel[163].setRotationPoint(-18F, 2F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14
		bodyModel[164].setRotationPoint(-33.5F, 2F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 14
		bodyModel[165].setRotationPoint(-32.5F, -1F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[166].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 14
		bodyModel[167].setRotationPoint(31.5F, -1F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[168].setRotationPoint(31.5F, 2F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[169].setRotationPoint(-32.5F, 2F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[170].setRotationPoint(31.5F, 2F, 10F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[171].setRotationPoint(30.5F, -1F, -11.01F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[172].setRotationPoint(30.5F, -1F, 11.01F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 0
		bodyModel[173].setRotationPoint(-34.5F, -1F, 11.01F);

		bodyModel[174].addBox(0F, 0F, 0F, 25, 6, 17, 0F); // Box 178 tank main
		bodyModel[174].setRotationPoint(-12.5F, 3F, -8.5F);

		bodyModel[175].addShapeBox(0F, -1.5F, -1.5F, 12, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356
		bodyModel[175].setRotationPoint(-12.5F, 1F, -8F);
		bodyModel[175].rotateAngleX = 0.78539816F;

		bodyModel[176].addShapeBox(0F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 357
		bodyModel[176].setRotationPoint(3.5F, 1F, -9F);
		bodyModel[176].rotateAngleX = 0.78539816F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 362 brake chain holder
		bodyModel[177].setRotationPoint(-40F, -1F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[178].setRotationPoint(0.5F, 3F, -10.75F);
		bodyModel[178].rotateAngleX = -0.17453293F;

		bodyModel[179].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[179].setRotationPoint(1F, 3F, -10.75F);
		bodyModel[179].rotateAngleX = -0.9424778F;

		bodyModel[180].addShapeBox(0F, -0.5F, -4F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[180].setRotationPoint(1F, 3F, 10.75F);
		bodyModel[180].rotateAngleX = 0.9424778F;

		bodyModel[181].addBox(0F, 0F, -3F, 1, 1, 3, 0F); // Box 377
		bodyModel[181].setRotationPoint(0.5F, 3F, 10.75F);
		bodyModel[181].rotateAngleX = 0.17453293F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 standard tank
		bodyModel[182].setRotationPoint(-12.5F, 4.5F, -10.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 standard tank
		bodyModel[183].setRotationPoint(2.5F, 4.5F, -10.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381 standard tank
		bodyModel[184].setRotationPoint(2.5F, 4.5F, 8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381 standard tank
		bodyModel[185].setRotationPoint(-12.5F, 4.5F, 8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[186].setRotationPoint(-15.5F, -1F, -9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14
		bodyModel[187].setRotationPoint(30.5F, 2F, -11F);

		bodyModel[188].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 362 brake chain holder
		bodyModel[188].setRotationPoint(-39F, -0.75F, -10.99F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 382 CP tank moment
		bodyModel[189].setRotationPoint(-12.5F, 4.5F, -10.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 18, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 382 CP tank moment
		bodyModel[190].setRotationPoint(-5.5F, 4.5F, -10.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 374
		bodyModel[191].setRotationPoint(-8F, 3F, -10.75F);
		bodyModel[191].rotateAngleX = -0.17453293F;

		bodyModel[192].addShapeBox(0F, -0.5F, 1F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 375
		bodyModel[192].setRotationPoint(-7.5F, 3F, -10.75F);
		bodyModel[192].rotateAngleX = -0.9424778F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 178 CN rerailer cull
		bodyModel[193].setRotationPoint(9.5F, 3F, 8.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 178 CN rerailer cull
		bodyModel[194].setRotationPoint(-8.5F, 3F, 8.5F);

		bodyModel[195].addShapeBox(0F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356 CP tanks
		bodyModel[195].setRotationPoint(-2.5F, 1F, -8F);
		bodyModel[195].rotateAngleX = 0.78539816F;

		bodyModel[196].addShapeBox(0F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356 CP tanks
		bodyModel[196].setRotationPoint(9.5F, 1F, -8F);
		bodyModel[196].rotateAngleX = 0.78539816F;

		bodyModel[197].addShapeBox(0F, -1.5F, -1.5F, 10, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 356 CP tanks
		bodyModel[197].setRotationPoint(-18.5F, 1F, -8F);
		bodyModel[197].rotateAngleX = 0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[198].setRotationPoint(-42.25F, -13F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[199].setRotationPoint(-42.25F, -12F, -7F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 25
		bodyModel[200].setRotationPoint(-41.75F, -12.5F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[201].setRotationPoint(-42.75F, -13.5F, -7.01F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 Quebecous moment
		bodyModel[202].setRotationPoint(-12.5F, 4.5F, -10.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 381 Quebecous moment
		bodyModel[203].setRotationPoint(-3.5F, 4.5F, -10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 22, 12, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[204].setRotationPoint(29F, -14F, -14.51F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake cull
		bodyModel[205].setRotationPoint(-20F, -24F, -7F);

		bodyModel[206].addBox(0F, 0F, 0F, 63, 8, 0, 0F); // Box 206
		bodyModel[206].setRotationPoint(-18F, -10F, 11F);

		bodyModel[207].addBox(0F, 0F, 0F, 63, 8, 0, 0F); // Box 206
		bodyModel[207].setRotationPoint(-18F, -10F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[208].setRotationPoint(45F, -10F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[209].setRotationPoint(45F, -10F, 10F);

		bodyModel[210].addBox(0F, 0F, 0F, 12, 7, 0, 0F); // Box 206
		bodyModel[210].setRotationPoint(-26F, -14F, -11F);

		bodyModel[211].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 206
		bodyModel[211].setRotationPoint(-45F, -14F, -11F);

		bodyModel[212].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 206
		bodyModel[212].setRotationPoint(-45F, -14F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 206
		bodyModel[213].setRotationPoint(-26F, -14F, 11F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[214].setRotationPoint(-45F, -10F, 10F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 186
		bodyModel[215].setRotationPoint(-45F, -10F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,1F, 0F, -2F, -1F, 0F, -2F, -1F, -3F, 1F, 1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[216].setRotationPoint(-48F, -10F, -11F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 186
		bodyModel[217].setRotationPoint(-49F, -11F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,1F, -3F, 1F, -1F, -3F, 1F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[218].setRotationPoint(-48F, -10F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,-1F, 0F, -2F, 1F, 0F, -2F, 1F, -3F, 1F, -1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[219].setRotationPoint(48F, -10F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 186
		bodyModel[220].setRotationPoint(49F, -11F, -9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,-1F, -3F, 1F, 1F, -3F, 1F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[221].setRotationPoint(48F, -10F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		bodyModel[222].setRotationPoint(-49F, -9F, -9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[223].setRotationPoint(-49F, -9F, 8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		bodyModel[224].setRotationPoint(49F, -9F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[225].setRotationPoint(49F, -9F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 24, 12, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[226].setRotationPoint(31F, -14F, 14.51F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238 QCM cap
		bodyModel[227].setRotationPoint(-46F, -16.5F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 22, 10, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 261 dash 7 vents
		bodyModel[228].setRotationPoint(-18.5F, -23F, -7.01F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 14, 14, 0F); // Box 2
		bodyModel[229].setRotationPoint(-28F, -21F, -7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[230].setRotationPoint(-28F, -23F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[231].setRotationPoint(-28F, -23F, -7F);

		bodyModel[232].addBox(0.5F, 0F, 0.5F, 3, 9, 2, 0F); // Box 412 cs1
		bodyModel[232].setRotationPoint(-34F, -15F, 0F);
		bodyModel[232].rotateAngleY = -0.19198622F;

		bodyModel[233].addBox(0F, 0F, 0F, 6, 7, 2, 0F); // Box 413 cs1
		bodyModel[233].setRotationPoint(-39.1F, -13F, 4F);
		bodyModel[233].rotateAngleY = -0.59341195F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs1
		bodyModel[234].setRotationPoint(-39.1F, -15F, 4F);
		bodyModel[234].rotateAngleY = -0.59341195F;

		bodyModel[235].addShapeBox(-0.5F, 0F, 0.5F, 4, 2, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[235].setRotationPoint(-34F, -17F, 0F);
		bodyModel[235].rotateAngleY = -0.19198622F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 front ditchlight L
		bodyModel[236].setRotationPoint(-49.25F, -0.5F, -9F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
		bodyModel[237].setRotationPoint(-49F, -0.5F, -9F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
		bodyModel[238].setRotationPoint(-49F, -0.5F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 front ditchlight L
		bodyModel[239].setRotationPoint(-49.25F, -0.5F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[240].setRotationPoint(-43.5F, -22F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[241].setRotationPoint(-43.5F, -23F, -0.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[242].setRotationPoint(-43.25F, -21.5F, -0.25F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Bell hang cull
		bodyModel[243].setRotationPoint(-43.7F, -23F, -1F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[244].setRotationPoint(-43.25F, -24.5F, -1F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[245].setRotationPoint(-43.45F, -24.5F, 0F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[246].setRotationPoint(-42.45F, -23.5F, -0.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[247].setRotationPoint(-43.1F, -25.5F, -1.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[248].setRotationPoint(-43.25F, -25.5F, 0.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 331 M5
		bodyModel[249].setRotationPoint(-44F, -25.5F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[250].setRotationPoint(-50F, 5F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[251].setRotationPoint(-50F, 5F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[252].setRotationPoint(48F, 5F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[253].setRotationPoint(48F, 5F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake cull
		bodyModel[254].setRotationPoint(-20F, -24F, -7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[255].setRotationPoint(-34.5F, -25F, 0F);

		bodyModel[256].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2 Air intake box vent covers
		bodyModel[256].setRotationPoint(-19.5F, -24.5F, -2F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2 Air intake box vent covers
		bodyModel[257].setRotationPoint(-10.5F, -24.5F, -2F);

		bodyModel[258].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2 Air intake box vent covers
		bodyModel[258].setRotationPoint(-15F, -24.5F, -2F);

		bodyModel[259].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[259].setRotationPoint(-40F, -13.5F, -7.25F);
		bodyModel[259].rotateAngleY = -1.27409035F;

		bodyModel[260].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[260].setRotationPoint(-40F, -11.5F, -7.25F);
		bodyModel[260].rotateAngleY = -1.27409035F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361
		bodyModel[261].setRotationPoint(-51.5F, 3F, 2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 2
		bodyModel[262].setRotationPoint(-20F, -23.5F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 16, 5, 0, 0F,0F, -0.5F, 0F, -8.5F, -0.5F, 0F, -8.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -8.5F, -0.25F, 0F, -8.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[263].setRotationPoint(-18.75F, -23.5F, 8.01F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[264].setRotationPoint(-31.5F, -24F, 6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[265].setRotationPoint(-48.5F, -1.5F, -4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[266].setRotationPoint(-48.5F, -1.5F, 2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[267].setRotationPoint(47.5F, -1.5F, -4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[268].setRotationPoint(47.5F, -1.5F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[269].setRotationPoint(-49.51F, -5.5F, -5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Not a ditchlight will not glow
		bodyModel[270].setRotationPoint(48.51F, -5.5F, 3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330
		bodyModel[271].setRotationPoint(-39.45F, -24.5F, -0.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 329
		bodyModel[272].setRotationPoint(-40.1F, -25.5F, -1.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 328
		bodyModel[273].setRotationPoint(-40.25F, -25.5F, 0.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 327
		bodyModel[274].setRotationPoint(-41F, -25.5F, -0.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 2 CP vents
		bodyModel[275].setRotationPoint(-15.5F, -23.5F, -8.25F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 2 CP vents
		bodyModel[276].setRotationPoint(-19.5F, -23.5F, 7.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438 CP M series details
		bodyModel[277].setRotationPoint(15F, -25F, -2F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake CP moment
		bodyModel[278].setRotationPoint(-16F, -24.5F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Air intake CP moment
		bodyModel[279].setRotationPoint(-20F, -24.5F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438 CP M series details
		bodyModel[280].setRotationPoint(19F, -24.5F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 438 CP M series details
		bodyModel[281].setRotationPoint(19F, -24.5F, 2F);

		bodyModel[282].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 438 CP M series details
		bodyModel[282].setRotationPoint(19F, -24.5F, -2F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 329 CP M3
		bodyModel[283].setRotationPoint(11.55F, -23.5F, 3F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 329 CP M3
		bodyModel[284].setRotationPoint(10.9F, -24.5F, 2F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 329 CP M3
		bodyModel[285].setRotationPoint(10.75F, -24.5F, 4F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329 CP M3
		bodyModel[286].setRotationPoint(10F, -24.5F, 3F);

		bodyModel[287].addBox(0F, 0F, 0F, 13, 2, 14, 0F); // Box 438 CP M series details
		bodyModel[287].setRotationPoint(14F, -25F, -7F);

		bodyModel[288].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5 QCM
		bodyModel[288].setRotationPoint(-43.25F, -24F, -2.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5 QCM
		bodyModel[289].setRotationPoint(-43.45F, -24F, 1.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5 QCM
		bodyModel[290].setRotationPoint(-43.1F, -24.5F, -1.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5 QCM
		bodyModel[291].setRotationPoint(-43.25F, -24.5F, 0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 331 M5 QCM
		bodyModel[292].setRotationPoint(-44F, -24.5F, -0.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-1F, -4F, 0F, 0.5F, -4F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361 QCM plow
		bodyModel[293].setRotationPoint(-51.5F, -1F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 20, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 285
		bodyModel[294].setRotationPoint(45F, -22F, -6F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Box 286
		bodyModel[295].setRotationPoint(44F, -22F, -7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[296].setRotationPoint(44F, -23F, 2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 357
		bodyModel[297].setRotationPoint(45F, -23F, 2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[298].setRotationPoint(45F, -23F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[299].setRotationPoint(44F, -23F, -7F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 286
		bodyModel[300].setRotationPoint(44F, -23F, -2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 238 sand cap
		bodyModel[301].setRotationPoint(44F, -23.5F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 7, 10, 0F,-3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133 CP plow cull
		bodyModel[302].setRotationPoint(-51F, 2F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 7, 10, 0F,-0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 133 CP plow cull
		bodyModel[303].setRotationPoint(-51F, 2F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0.055F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, 0.055F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F); // Classlights CN QCM glow
		bodyModel[304].setRotationPoint(-39.52F, -22.5F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, -3F, 1, 1, 2, 0F,0.55F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F, 0.55F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.055F, 0F, 0F); // Classlights CN QCM glow
		bodyModel[305].setRotationPoint(-39.52F, -22.5F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, -1F, 0F, 0.375F, -1F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[306].setRotationPoint(-20F, -11F, 11.01F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, -1F, 0F, 0.375F, -1F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[307].setRotationPoint(-20F, -11F, -11.01F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 1.25F, 0F); // Box 206
		bodyModel[308].setRotationPoint(-45F, -11F, 11.01F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0F, 1.25F, 0F); // Box 206
		bodyModel[309].setRotationPoint(-45F, -11F, -11.01F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 3F, 0F, 0.375F, -1F, 0F, 0.375F, -1F, 0F, 0F, 3F, 0F, 0.375F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.375F, -3F, 0F); // Box 206
		bodyModel[310].setRotationPoint(-14F, -11F, -11.01F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[311].setRotationPoint(-51F, 6F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[312].setRotationPoint(-51F, 7F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[313].setRotationPoint(-51.5F, 4F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[314].setRotationPoint(-51F, 6F, 0F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[315].setRotationPoint(-51F, 7F, 0F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[316].setRotationPoint(-51.5F, 4F, 2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[317].setRotationPoint(-51F, 3F, 2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
		bodyModel[318].setRotationPoint(-51F, 3F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361
		bodyModel[319].setRotationPoint(-51.5F, 3F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -4F, 0F, -1F, -4F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361 QCM plow
		bodyModel[320].setRotationPoint(-51.5F, -1F, -10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 16, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vents protetors cull
		bodyModel[321].setRotationPoint(27F, -22.7F, -7.5F);
	}
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();
	ModelMLW_3axle_Hiad boger = new ModelMLW_3axle_Hiad();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity ,f5);

		if (GetColor(entity) == 6324 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/MLW_3_axle_hiad_FNCC_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.75F, 0.0F, 0F);
			boger.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.5F, 0.0F, 0);
			boger.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 11675 ) {
			//silver dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.8F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.6F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
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