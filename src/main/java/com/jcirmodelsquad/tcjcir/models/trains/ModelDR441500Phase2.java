//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 23:40:24
// Last changed on: 21.08.2020 - 23:40:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

public class ModelDR441500Phase2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDR441500Phase2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[564];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 294, 88, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 446, 127, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 296, 113, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 330, 134, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 408, 134, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 446, 79, textureX, textureY); // Box 120
		bodyModel[7] = new ModelRendererTurbo(this, 443, 14, textureX, textureY); // Box 481
		bodyModel[8] = new ModelRendererTurbo(this, 301, 85, textureX, textureY); // Box 120
		bodyModel[9] = new ModelRendererTurbo(this, 301, 39, textureX, textureY); // Box 481
		bodyModel[10] = new ModelRendererTurbo(this, 247, 90, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 212, 96, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 266, 113, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 223, 113, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 271, 133, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 198, 113, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 266, 86, textureX, textureY); // Box 495
		bodyModel[17] = new ModelRendererTurbo(this, 223, 90, textureX, textureY); // Box 496
		bodyModel[18] = new ModelRendererTurbo(this, 198, 98, textureX, textureY); // Box 497
		bodyModel[19] = new ModelRendererTurbo(this, 494, 84, textureX, textureY); // Box 120
		bodyModel[20] = new ModelRendererTurbo(this, 468, 84, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 409, 140, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 409, 127, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 331, 140, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 331, 127, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 262, 126, textureX, textureY); // Box 114
		bodyModel[26] = new ModelRendererTurbo(this, 262, 123, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 262, 129, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 282, 127, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 309, 127, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 284, 71, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 300, 78, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 314, 66, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 284, 25, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 300, 32, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 314, 20, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 446, 22, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 382, 64, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 380, 71, textureX, textureY); // Rear side door L
		bodyModel[40] = new ModelRendererTurbo(this, 391, 70, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 377, 70, textureX, textureY); // Box 80
		bodyModel[42] = new ModelRendererTurbo(this, 470, 30, textureX, textureY); // Rear door
		bodyModel[43] = new ModelRendererTurbo(this, 487, 22, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 457, 10, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 477, 20, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 467, 10, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 477, 10, textureX, textureY); // Box 80
		bodyModel[48] = new ModelRendererTurbo(this, 71, 61, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 70, 68, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 471, 85, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 489, 100, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 471, 97, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 476, 2, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 461, 1, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[58] = new ModelRendererTurbo(this, 278, 62, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 278, 16, textureX, textureY); // Box 105
		bodyModel[60] = new ModelRendererTurbo(this, 311, 65, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 311, 19, textureX, textureY); // Box 108
		bodyModel[63] = new ModelRendererTurbo(this, 297, 19, textureX, textureY); // Box 109
		bodyModel[64] = new ModelRendererTurbo(this, 292, 65, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 300, 65, textureX, textureY); // Front side door L
		bodyModel[66] = new ModelRendererTurbo(this, 300, 19, textureX, textureY); // Front side door R
		bodyModel[67] = new ModelRendererTurbo(this, 90, 210, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 152, 222, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 181, 224, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 159, 217, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 160, 205, textureX, textureY); // Box 138
		bodyModel[74] = new ModelRendererTurbo(this, 151, 225, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 151, 218, textureX, textureY); // Box 141
		bodyModel[76] = new ModelRendererTurbo(this, 151, 203, textureX, textureY); // Box 146
		bodyModel[77] = new ModelRendererTurbo(this, 151, 198, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 501, 66, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 457, 66, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 494, 66, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 464, 66, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 473, 63, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 471, 72, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 505, 51, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[85] = new ModelRendererTurbo(this, 209, 75, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 207, 70, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 210, 78, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 208, 21, textureX, textureY); // Box 169
		bodyModel[89] = new ModelRendererTurbo(this, 206, 24, textureX, textureY); // Box 170
		bodyModel[90] = new ModelRendererTurbo(this, 209, 18, textureX, textureY); // Box 171
		bodyModel[91] = new ModelRendererTurbo(this, 189, 42, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 203, 61, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 203, 37, textureX, textureY); // Box 182
		bodyModel[94] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 159, 23, textureX, textureY); // Box 0 exhaust
		bodyModel[96] = new ModelRendererTurbo(this, 292, 19, textureX, textureY); // Box 252
		bodyModel[97] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 88
		bodyModel[98] = new ModelRendererTurbo(this, 60, 220, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 40, 210, textureX, textureY); // Box 389
		bodyModel[100] = new ModelRendererTurbo(this, 44, 205, textureX, textureY); // Box 389
		bodyModel[101] = new ModelRendererTurbo(this, 40, 204, textureX, textureY); // Box 197
		bodyModel[102] = new ModelRendererTurbo(this, 55, 188, textureX, textureY); // Box 389
		bodyModel[103] = new ModelRendererTurbo(this, 51, 214, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 59, 211, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 52, 210, textureX, textureY); // Box 389
		bodyModel[106] = new ModelRendererTurbo(this, 380, 193, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 385, 205, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 382, 186, textureX, textureY); // Box 394
		bodyModel[109] = new ModelRendererTurbo(this, 421, 186, textureX, textureY); // Box 394
		bodyModel[110] = new ModelRendererTurbo(this, 318, 216, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 326, 196, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 340, 204, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 343, 204, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 346, 204, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 352, 204, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 355, 204, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 358, 204, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 286, 184, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 297, 187, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 323, 210, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 308, 184, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 330, 184, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 341, 187, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 352, 184, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 394
		bodyModel[130] = new ModelRendererTurbo(this, 304, 168, textureX, textureY); // Box 394
		bodyModel[131] = new ModelRendererTurbo(this, 354, 179, textureX, textureY); // Box 394
		bodyModel[132] = new ModelRendererTurbo(this, 406, 225, textureX, textureY); // Box 394
		bodyModel[133] = new ModelRendererTurbo(this, 415, 231, textureX, textureY); // Box 394
		bodyModel[134] = new ModelRendererTurbo(this, 415, 224, textureX, textureY); // Box 394
		bodyModel[135] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 394
		bodyModel[136] = new ModelRendererTurbo(this, 393, 215, textureX, textureY); // Box 394
		bodyModel[137] = new ModelRendererTurbo(this, 427, 180, textureX, textureY); // Box 169
		bodyModel[138] = new ModelRendererTurbo(this, 442, 200, textureX, textureY); // Box 169
		bodyModel[139] = new ModelRendererTurbo(this, 442, 175, textureX, textureY); // Box 439
		bodyModel[140] = new ModelRendererTurbo(this, 439, 158, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 438, 166, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 438, 149, textureX, textureY); // Box 103
		bodyModel[143] = new ModelRendererTurbo(this, 381, 212, textureX, textureY); // Box 394
		bodyModel[144] = new ModelRendererTurbo(this, 381, 224, textureX, textureY); // Box 394
		bodyModel[145] = new ModelRendererTurbo(this, 422, 216, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 468, 208, textureX, textureY); // Box 394
		bodyModel[147] = new ModelRendererTurbo(this, 244, 220, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 244, 203, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 205, 229, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 309, 225, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 204, 222, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 206, 212, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 208, 218, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 208, 208, textureX, textureY); // Box 757
		bodyModel[155] = new ModelRendererTurbo(this, 197, 215, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 199, 209, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 190, 215, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 265, 171, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 267, 203, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 268, 208, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 228, 221, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 235, 214, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 194, 211, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 195, 223, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 235, 220, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 219, 220, textureX, textureY); // Box 471
		bodyModel[168] = new ModelRendererTurbo(this, 231, 207, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 222, 209, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 215, 202, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 215, 207, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 222, 199, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 265, 184, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 266, 194, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 288, 189, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 244, 237, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 279, 193, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 242, 192, textureX, textureY); // Box 394
		bodyModel[181] = new ModelRendererTurbo(this, 227, 190, textureX, textureY); // Box 394
		bodyModel[182] = new ModelRendererTurbo(this, 287, 167, textureX, textureY); // Box 394
		bodyModel[183] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 394
		bodyModel[184] = new ModelRendererTurbo(this, 274, 175, textureX, textureY); // Box 394
		bodyModel[185] = new ModelRendererTurbo(this, 495, 51, textureX, textureY, "lamp"); // backing light type 3
		bodyModel[186] = new ModelRendererTurbo(this, 500, 48, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[187] = new ModelRendererTurbo(this, 40, 169, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 88, 45, textureX, textureY); // Box 80
		bodyModel[189] = new ModelRendererTurbo(this, 81, 46, textureX, textureY); // Box 80
		bodyModel[190] = new ModelRendererTurbo(this, 66, 15, textureX, textureY); // Box 88
		bodyModel[191] = new ModelRendererTurbo(this, 68, 12, textureX, textureY); // Box 88
		bodyModel[192] = new ModelRendererTurbo(this, 66, 18, textureX, textureY); // Box 88
		bodyModel[193] = new ModelRendererTurbo(this, 76, 45, textureX, textureY); // Box 409 commander base
		bodyModel[194] = new ModelRendererTurbo(this, 76, 41, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[195] = new ModelRendererTurbo(this, 267, 123, textureX, textureY); // Box 565
		bodyModel[196] = new ModelRendererTurbo(this, 251, 187, textureX, textureY); // Box 0
		bodyModel[197] = new ModelRendererTurbo(this, 59, 216, textureX, textureY); // Box 0
		bodyModel[198] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 336
		bodyModel[199] = new ModelRendererTurbo(this, 346, 127, textureX, textureY); // Box 0
		bodyModel[200] = new ModelRendererTurbo(this, 346, 149, textureX, textureY); // Box 0
		bodyModel[201] = new ModelRendererTurbo(this, 333, 149, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 336, 154, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[203] = new ModelRendererTurbo(this, 393, 149, textureX, textureY); // Box 343
		bodyModel[204] = new ModelRendererTurbo(this, 396, 154, textureX, textureY); // Box 344
		bodyModel[205] = new ModelRendererTurbo(this, 421, 56, textureX, textureY); // Box 120
		bodyModel[206] = new ModelRendererTurbo(this, 396, 40, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[207] = new ModelRendererTurbo(this, 421, 42, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[208] = new ModelRendererTurbo(this, 380, 18, textureX, textureY); // Box 348
		bodyModel[209] = new ModelRendererTurbo(this, 380, 25, textureX, textureY); // Rear side door R
		bodyModel[210] = new ModelRendererTurbo(this, 394, 66, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 394, 20, textureX, textureY); // Box 62
		bodyModel[212] = new ModelRendererTurbo(this, 421, 39, textureX, textureY); // Box 481
		bodyModel[213] = new ModelRendererTurbo(this, 391, 24, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 377, 24, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 445, 72, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[216] = new ModelRendererTurbo(this, 442, 7, textureX, textureY); // Box 360
		bodyModel[217] = new ModelRendererTurbo(this, 361, 39, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 361, 7, textureX, textureY); // Box 343
		bodyModel[219] = new ModelRendererTurbo(this, 423, 206, textureX, textureY); // Box 169
		bodyModel[220] = new ModelRendererTurbo(this, 442, 242, textureX, textureY); // Box 169
		bodyModel[221] = new ModelRendererTurbo(this, 442, 239, textureX, textureY); // Box 169
		bodyModel[222] = new ModelRendererTurbo(this, 442, 232, textureX, textureY); // Box 347
		bodyModel[223] = new ModelRendererTurbo(this, 442, 229, textureX, textureY); // Box 348
		bodyModel[224] = new ModelRendererTurbo(this, 469, 234, textureX, textureY); // Box 169
		bodyModel[225] = new ModelRendererTurbo(this, 473, 243, textureX, textureY); // Box 169
		bodyModel[226] = new ModelRendererTurbo(this, 473, 229, textureX, textureY); // Box 351
		bodyModel[227] = new ModelRendererTurbo(this, 360, 50, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[228] = new ModelRendererTurbo(this, 314, 8, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[229] = new ModelRendererTurbo(this, 310, 40, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[230] = new ModelRendererTurbo(this, 335, 42, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[231] = new ModelRendererTurbo(this, 286, 222, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 286, 211, textureX, textureY); // Box 382
		bodyModel[233] = new ModelRendererTurbo(this, 181, 191, textureX, textureY); // Box 383
		bodyModel[234] = new ModelRendererTurbo(this, 158, 210, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 428, 231, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 488, 225, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 392, 225, textureX, textureY); // Box 394
		bodyModel[238] = new ModelRendererTurbo(this, 393, 228, textureX, textureY); // Box 394
		bodyModel[239] = new ModelRendererTurbo(this, 392, 212, textureX, textureY); // Box 394
		bodyModel[240] = new ModelRendererTurbo(this, 407, 230, textureX, textureY); // Box 394
		bodyModel[241] = new ModelRendererTurbo(this, 181, 216, textureX, textureY); // Box 394
		bodyModel[242] = new ModelRendererTurbo(this, 182, 221, textureX, textureY); // Box 394
		bodyModel[243] = new ModelRendererTurbo(this, 413, 216, textureX, textureY); // Box 394
		bodyModel[244] = new ModelRendererTurbo(this, 414, 221, textureX, textureY); // Box 394
		bodyModel[245] = new ModelRendererTurbo(this, 207, 66, textureX, textureY); // Box 182
		bodyModel[246] = new ModelRendererTurbo(this, 206, 29, textureX, textureY); // Box 402
		bodyModel[247] = new ModelRendererTurbo(this, 206, 33, textureX, textureY, "cull"); // Box 402 cull
		bodyModel[248] = new ModelRendererTurbo(this, 283, 65, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[249] = new ModelRendererTurbo(this, 283, 19, textureX, textureY, "cull"); // Box 346 cull
		bodyModel[250] = new ModelRendererTurbo(this, 278, 65, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[251] = new ModelRendererTurbo(this, 278, 19, textureX, textureY); // Box 348
		bodyModel[252] = new ModelRendererTurbo(this, 12, 59, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 17, 68, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 17, 51, textureX, textureY); // Box 88
		bodyModel[255] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 21, 47, textureX, textureY); // Box 336
		bodyModel[257] = new ModelRendererTurbo(this, 22, 44, textureX, textureY); // Box 355
		bodyModel[258] = new ModelRendererTurbo(this, 43, 61, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 47, 68, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 47, 58, textureX, textureY); // Box 358
		bodyModel[261] = new ModelRendererTurbo(this, 43, 50, textureX, textureY); // Box 0
		bodyModel[262] = new ModelRendererTurbo(this, 47, 79, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 43, 71, textureX, textureY); // Box 361
		bodyModel[264] = new ModelRendererTurbo(this, 47, 47, textureX, textureY); // Box 362
		bodyModel[265] = new ModelRendererTurbo(this, 47, 82, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 47, 44, textureX, textureY); // Box 364
		bodyModel[267] = new ModelRendererTurbo(this, 64, 55, textureX, textureY); // Box 363
		bodyModel[268] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 364
		bodyModel[269] = new ModelRendererTurbo(this, 62, 49, textureX, textureY); // Box 364
		bodyModel[270] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 384
		bodyModel[271] = new ModelRendererTurbo(this, 82, 216, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 87, 216, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 87, 202, textureX, textureY); // Box 396
		bodyModel[274] = new ModelRendererTurbo(this, 17, 204, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 60, 201, textureX, textureY); // Box 389
		bodyModel[276] = new ModelRendererTurbo(this, 23, 90, textureX, textureY); // Box 207
		bodyModel[277] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 529
		bodyModel[278] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 208
		bodyModel[279] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // Box 209
		bodyModel[280] = new ModelRendererTurbo(this, 3, 51, textureX, textureY); // Box 208
		bodyModel[281] = new ModelRendererTurbo(this, 3, 48, textureX, textureY); // Box 194
		bodyModel[282] = new ModelRendererTurbo(this, 6, 87, textureX, textureY); // Box 209
		bodyModel[283] = new ModelRendererTurbo(this, 273, 16, textureX, textureY); // Box 105
		bodyModel[284] = new ModelRendererTurbo(this, 273, 23, textureX, textureY); // Box 105
		bodyModel[285] = new ModelRendererTurbo(this, 22, 80, textureX, textureY); // Box 420
		bodyModel[286] = new ModelRendererTurbo(this, 273, 62, textureX, textureY); // Box 423
		bodyModel[287] = new ModelRendererTurbo(this, 4, 85, textureX, textureY); // Box 429
		bodyModel[288] = new ModelRendererTurbo(this, 34, 90, textureX, textureY); // Box 430
		bodyModel[289] = new ModelRendererTurbo(this, 45, 87, textureX, textureY); // Box 431
		bodyModel[290] = new ModelRendererTurbo(this, 268, 64, textureX, textureY); // Box 0
		bodyModel[291] = new ModelRendererTurbo(this, 268, 18, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 70, 27, textureX, textureY); // Box 88
		bodyModel[293] = new ModelRendererTurbo(this, 66, 24, textureX, textureY); // Box 88
		bodyModel[294] = new ModelRendererTurbo(this, 66, 33, textureX, textureY); // Box 88
		bodyModel[295] = new ModelRendererTurbo(this, 66, 30, textureX, textureY); // Box 88
		bodyModel[296] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 88
		bodyModel[297] = new ModelRendererTurbo(this, 57, 30, textureX, textureY); // Box 88
		bodyModel[298] = new ModelRendererTurbo(this, 199, 106, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 32, 126, textureX, textureY); // Box 103
		bodyModel[300] = new ModelRendererTurbo(this, 31, 122, textureX, textureY); // Box 103
		bodyModel[301] = new ModelRendererTurbo(this, 52, 122, textureX, textureY); // Box 103
		bodyModel[302] = new ModelRendererTurbo(this, 53, 126, textureX, textureY); // Box 103
		bodyModel[303] = new ModelRendererTurbo(this, 32, 130, textureX, textureY); // Box 103
		bodyModel[304] = new ModelRendererTurbo(this, 53, 130, textureX, textureY); // Box 103
		bodyModel[305] = new ModelRendererTurbo(this, 31, 134, textureX, textureY); // Box 103
		bodyModel[306] = new ModelRendererTurbo(this, 52, 134, textureX, textureY); // Box 103
		bodyModel[307] = new ModelRendererTurbo(this, 50, 140, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[308] = new ModelRendererTurbo(this, 50, 145, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[309] = new ModelRendererTurbo(this, 41, 145, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[310] = new ModelRendererTurbo(this, 34, 140, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[311] = new ModelRendererTurbo(this, 34, 145, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[312] = new ModelRendererTurbo(this, 2, 168, textureX, textureY); // Box 0
		bodyModel[313] = new ModelRendererTurbo(this, 2, 171, textureX, textureY); // Box 0
		bodyModel[314] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 0
		bodyModel[315] = new ModelRendererTurbo(this, 27, 168, textureX, textureY); // Box 0
		bodyModel[316] = new ModelRendererTurbo(this, 18, 169, textureX, textureY); // Box 496
		bodyModel[317] = new ModelRendererTurbo(this, 267, 128, textureX, textureY); // Box 565
		bodyModel[318] = new ModelRendererTurbo(this, 276, 128, textureX, textureY); // Box 506
		bodyModel[319] = new ModelRendererTurbo(this, 22, 178, textureX, textureY); // Box 496
		bodyModel[320] = new ModelRendererTurbo(this, 10, 175, textureX, textureY); // Box 0
		bodyModel[321] = new ModelRendererTurbo(this, 20, 175, textureX, textureY); // Box 496
		bodyModel[322] = new ModelRendererTurbo(this, 15, 175, textureX, textureY); // Box 496
		bodyModel[323] = new ModelRendererTurbo(this, 82, 168, textureX, textureY); // Box 444
		bodyModel[324] = new ModelRendererTurbo(this, 82, 171, textureX, textureY); // Box 445
		bodyModel[325] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 446
		bodyModel[326] = new ModelRendererTurbo(this, 51, 168, textureX, textureY); // Box 447
		bodyModel[327] = new ModelRendererTurbo(this, 64, 169, textureX, textureY); // Box 448
		bodyModel[328] = new ModelRendererTurbo(this, 64, 178, textureX, textureY); // Box 449
		bodyModel[329] = new ModelRendererTurbo(this, 76, 175, textureX, textureY); // Box 450
		bodyModel[330] = new ModelRendererTurbo(this, 64, 175, textureX, textureY); // Box 451
		bodyModel[331] = new ModelRendererTurbo(this, 71, 175, textureX, textureY); // Box 452
		bodyModel[332] = new ModelRendererTurbo(this, 344, 40, textureX, textureY, "lamp"); // Box 343 glow
		bodyModel[333] = new ModelRendererTurbo(this, 344, 57, textureX, textureY, "lamp"); // Box 454 glow
		bodyModel[334] = new ModelRendererTurbo(this, 35, 188, textureX, textureY); // Box 208
		bodyModel[335] = new ModelRendererTurbo(this, 24, 188, textureX, textureY); // Box 413
		bodyModel[336] = new ModelRendererTurbo(this, 39, 187, textureX, textureY); // Box 209
		bodyModel[337] = new ModelRendererTurbo(this, 14, 187, textureX, textureY); // Box 413
		bodyModel[338] = new ModelRendererTurbo(this, 14, 210, textureX, textureY); // Box 0
		bodyModel[339] = new ModelRendererTurbo(this, 14, 196, textureX, textureY); // Box 416
		bodyModel[340] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 529
		bodyModel[341] = new ModelRendererTurbo(this, 270, 74, textureX, textureY); // Box 429
		bodyModel[342] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Box 430
		bodyModel[343] = new ModelRendererTurbo(this, 273, 69, textureX, textureY); // Box 431
		bodyModel[344] = new ModelRendererTurbo(this, 58, 86, textureX, textureY); // Box 434
		bodyModel[345] = new ModelRendererTurbo(this, 62, 97, textureX, textureY); // Box 436
		bodyModel[346] = new ModelRendererTurbo(this, 270, 19, textureX, textureY); // Box 105
		bodyModel[347] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Box 438
		bodyModel[348] = new ModelRendererTurbo(this, 40, 220, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 48, 220, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 45, 220, textureX, textureY); // Box 0
		bodyModel[351] = new ModelRendererTurbo(this, 53, 218, textureX, textureY); // Box 0 steam gen panel
		bodyModel[352] = new ModelRendererTurbo(this, 40, 215, textureX, textureY); // Box 389
		bodyModel[353] = new ModelRendererTurbo(this, 56, 215, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 41, 207, textureX, textureY); // Box 389
		bodyModel[355] = new ModelRendererTurbo(this, 53, 202, textureX, textureY); // Box 0 steam gen panel
		bodyModel[356] = new ModelRendererTurbo(this, 53, 194, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 54, 181, textureX, textureY, "cull"); // Box 448 cull
		bodyModel[358] = new ModelRendererTurbo(this, 22, 181, textureX, textureY, "cull"); // Box 449 cull
		bodyModel[359] = new ModelRendererTurbo(this, 40, 155, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 27, 153, textureX, textureY); // Box 497
		bodyModel[361] = new ModelRendererTurbo(this, 51, 153, textureX, textureY); // Box 463
		bodyModel[362] = new ModelRendererTurbo(this, 38, 127, textureX, textureY); // Box 167
		bodyModel[363] = new ModelRendererTurbo(this, 45, 127, textureX, textureY); // Box 166
		bodyModel[364] = new ModelRendererTurbo(this, 45, 122, textureX, textureY); // Box 165
		bodyModel[365] = new ModelRendererTurbo(this, 38, 122, textureX, textureY); // Box 164
		bodyModel[366] = new ModelRendererTurbo(this, 51, 152, textureX, textureY); // Box 0
		bodyModel[367] = new ModelRendererTurbo(this, 46, 152, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 36, 152, textureX, textureY); // Box 430
		bodyModel[369] = new ModelRendererTurbo(this, 41, 152, textureX, textureY); // Box 431
		bodyModel[370] = new ModelRendererTurbo(this, 24, 126, textureX, textureY); // Box 430
		bodyModel[371] = new ModelRendererTurbo(this, 61, 126, textureX, textureY); // Box 433
		bodyModel[372] = new ModelRendererTurbo(this, 4, 128, textureX, textureY); // Box 497
		bodyModel[373] = new ModelRendererTurbo(this, 270, 28, textureX, textureY); // Box 435
		bodyModel[374] = new ModelRendererTurbo(this, 275, 28, textureX, textureY); // Box 436
		bodyModel[375] = new ModelRendererTurbo(this, 9, 157, textureX, textureY); // Box 437
		bodyModel[376] = new ModelRendererTurbo(this, 18, 157, textureX, textureY); // Box 438
		bodyModel[377] = new ModelRendererTurbo(this, 24, 122, textureX, textureY); // Box 430
		bodyModel[378] = new ModelRendererTurbo(this, 30, 102, textureX, textureY); // Box 208
		bodyModel[379] = new ModelRendererTurbo(this, 5, 118, textureX, textureY); // Box 438
		bodyModel[380] = new ModelRendererTurbo(this, 73, 128, textureX, textureY); // Box 445
		bodyModel[381] = new ModelRendererTurbo(this, 12, 126, textureX, textureY); // Box 497
		bodyModel[382] = new ModelRendererTurbo(this, 63, 45, textureX, textureY); // Box 457
		bodyModel[383] = new ModelRendererTurbo(this, 63, 37, textureX, textureY); // Box 458
		bodyModel[384] = new ModelRendererTurbo(this, 64, 42, textureX, textureY); // Box 459
		bodyModel[385] = new ModelRendererTurbo(this, 15, 112, textureX, textureY); // Box 209
		bodyModel[386] = new ModelRendererTurbo(this, 14, 112, textureX, textureY); // Box 209
		bodyModel[387] = new ModelRendererTurbo(this, 69, 112, textureX, textureY); // Box 468
		bodyModel[388] = new ModelRendererTurbo(this, 13, 120, textureX, textureY); // Box 209
		bodyModel[389] = new ModelRendererTurbo(this, 6, 114, textureX, textureY); // Box 209
		bodyModel[390] = new ModelRendererTurbo(this, 6, 122, textureX, textureY); // Box 209
		bodyModel[391] = new ModelRendererTurbo(this, 66, 120, textureX, textureY); // Box 472
		bodyModel[392] = new ModelRendererTurbo(this, 37, 114, textureX, textureY); // Box 430
		bodyModel[393] = new ModelRendererTurbo(this, 36, 110, textureX, textureY); // Box 430
		bodyModel[394] = new ModelRendererTurbo(this, 61, 122, textureX, textureY); // Box 459
		bodyModel[395] = new ModelRendererTurbo(this, 48, 114, textureX, textureY); // Box 460
		bodyModel[396] = new ModelRendererTurbo(this, 30, 106, textureX, textureY); // Box 208
		bodyModel[397] = new ModelRendererTurbo(this, 47, 110, textureX, textureY); // Box 465
		bodyModel[398] = new ModelRendererTurbo(this, 45, 102, textureX, textureY); // Box 466
		bodyModel[399] = new ModelRendererTurbo(this, 45, 106, textureX, textureY); // Box 467
		bodyModel[400] = new ModelRendererTurbo(this, 26, 114, textureX, textureY); // Box 209
		bodyModel[401] = new ModelRendererTurbo(this, 58, 112, textureX, textureY); // Box 470
		bodyModel[402] = new ModelRendererTurbo(this, 47, 114, textureX, textureY); // Box 471
		bodyModel[403] = new ModelRendererTurbo(this, 6, 101, textureX, textureY); // Box 209
		bodyModel[404] = new ModelRendererTurbo(this, 18, 103, textureX, textureY); // Box 209
		bodyModel[405] = new ModelRendererTurbo(this, 65, 101, textureX, textureY); // Box 480
		bodyModel[406] = new ModelRendererTurbo(this, 53, 103, textureX, textureY); // Box 481
		bodyModel[407] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 403
		bodyModel[408] = new ModelRendererTurbo(this, 40, 130, textureX, textureY); // Box 403
		bodyModel[409] = new ModelRendererTurbo(this, 38, 134, textureX, textureY); // Box 406
		bodyModel[410] = new ModelRendererTurbo(this, 40, 136, textureX, textureY); // Box 406
		bodyModel[411] = new ModelRendererTurbo(this, 50, 131, textureX, textureY); // Box 489
		bodyModel[412] = new ModelRendererTurbo(this, 45, 130, textureX, textureY); // Box 490
		bodyModel[413] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Box 491
		bodyModel[414] = new ModelRendererTurbo(this, 45, 136, textureX, textureY); // Box 492
		bodyModel[415] = new ModelRendererTurbo(this, 42, 140, textureX, textureY, "lamp"); // Box 186 headlight small top
		bodyModel[416] = new ModelRendererTurbo(this, 94, 128, textureX, textureY); // Box 103
		bodyModel[417] = new ModelRendererTurbo(this, 93, 124, textureX, textureY); // Box 103
		bodyModel[418] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 103
		bodyModel[419] = new ModelRendererTurbo(this, 101, 128, textureX, textureY); // Box 103
		bodyModel[420] = new ModelRendererTurbo(this, 94, 132, textureX, textureY); // Box 103
		bodyModel[421] = new ModelRendererTurbo(this, 101, 132, textureX, textureY); // Box 103
		bodyModel[422] = new ModelRendererTurbo(this, 93, 136, textureX, textureY); // Box 103
		bodyModel[423] = new ModelRendererTurbo(this, 100, 136, textureX, textureY); // Box 103
		bodyModel[424] = new ModelRendererTurbo(this, 104, 103, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[425] = new ModelRendererTurbo(this, 104, 108, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[426] = new ModelRendererTurbo(this, 95, 107, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[427] = new ModelRendererTurbo(this, 88, 103, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[428] = new ModelRendererTurbo(this, 88, 108, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[429] = new ModelRendererTurbo(this, 90, 157, textureX, textureY); // Box 430
		bodyModel[430] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 431
		bodyModel[431] = new ModelRendererTurbo(this, 90, 153, textureX, textureY); // Box 430
		bodyModel[432] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 433
		bodyModel[433] = new ModelRendererTurbo(this, 92, 139, textureX, textureY); // Box 403
		bodyModel[434] = new ModelRendererTurbo(this, 95, 138, textureX, textureY); // Box 403
		bodyModel[435] = new ModelRendererTurbo(this, 92, 142, textureX, textureY); // Box 406
		bodyModel[436] = new ModelRendererTurbo(this, 95, 142, textureX, textureY); // Box 406
		bodyModel[437] = new ModelRendererTurbo(this, 105, 139, textureX, textureY); // Box 489
		bodyModel[438] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 490
		bodyModel[439] = new ModelRendererTurbo(this, 105, 142, textureX, textureY); // Box 491
		bodyModel[440] = new ModelRendererTurbo(this, 100, 142, textureX, textureY); // Box 492
		bodyModel[441] = new ModelRendererTurbo(this, 96, 102, textureX, textureY, "lamp"); // Box 186 headlight small top
		bodyModel[442] = new ModelRendererTurbo(this, 90, 149, textureX, textureY); // Box 430
		bodyModel[443] = new ModelRendererTurbo(this, 90, 146, textureX, textureY); // Box 430
		bodyModel[444] = new ModelRendererTurbo(this, 95, 146, textureX, textureY); // Box 431
		bodyModel[445] = new ModelRendererTurbo(this, 105, 149, textureX, textureY); // Box 528
		bodyModel[446] = new ModelRendererTurbo(this, 105, 146, textureX, textureY); // Box 529
		bodyModel[447] = new ModelRendererTurbo(this, 100, 146, textureX, textureY); // Box 530
		bodyModel[448] = new ModelRendererTurbo(this, 105, 157, textureX, textureY); // Box 531
		bodyModel[449] = new ModelRendererTurbo(this, 100, 157, textureX, textureY); // Box 532
		bodyModel[450] = new ModelRendererTurbo(this, 93, 114, textureX, textureY); // Box 403
		bodyModel[451] = new ModelRendererTurbo(this, 100, 114, textureX, textureY); // Box 404
		bodyModel[452] = new ModelRendererTurbo(this, 100, 119, textureX, textureY); // Box 405
		bodyModel[453] = new ModelRendererTurbo(this, 93, 119, textureX, textureY); // Box 406
		bodyModel[454] = new ModelRendererTurbo(this, 94, 160, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 29, 150, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 59, 150, textureX, textureY); // Box 539
		bodyModel[457] = new ModelRendererTurbo(this, 11, 154, textureX, textureY, "lamp"); // Markerlight R type 1
		bodyModel[458] = new ModelRendererTurbo(this, 9, 150, textureX, textureY); // Box 216
		bodyModel[459] = new ModelRendererTurbo(this, 75, 154, textureX, textureY, "lamp"); // Markerlight L type 1
		bodyModel[460] = new ModelRendererTurbo(this, 74, 147, textureX, textureY, "lamp"); // Numberboard L type 1
		bodyModel[461] = new ModelRendererTurbo(this, 10, 147, textureX, textureY, "lamp"); // Numberboard R type 1
		bodyModel[462] = new ModelRendererTurbo(this, 73, 157, textureX, textureY); // Box 517
		bodyModel[463] = new ModelRendererTurbo(this, 64, 157, textureX, textureY); // Box 518
		bodyModel[464] = new ModelRendererTurbo(this, 73, 150, textureX, textureY); // Box 519
		bodyModel[465] = new ModelRendererTurbo(this, 18, 140, textureX, textureY); // Box 525
		bodyModel[466] = new ModelRendererTurbo(this, 17, 147, textureX, textureY, "lamp"); // Numberboard R type 2
		bodyModel[467] = new ModelRendererTurbo(this, 62, 140, textureX, textureY); // Box 524
		bodyModel[468] = new ModelRendererTurbo(this, 61, 147, textureX, textureY, "lamp"); // Numberboard L Type 2
		bodyModel[469] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 438
		bodyModel[470] = new ModelRendererTurbo(this, 1, 114, textureX, textureY); // Box 437
		bodyModel[471] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 60
		bodyModel[472] = new ModelRendererTurbo(this, 82, 114, textureX, textureY); // Box 532
		bodyModel[473] = new ModelRendererTurbo(this, 84, 101, textureX, textureY); // Box 533
		bodyModel[474] = new ModelRendererTurbo(this, 76, 37, textureX, textureY); // Box 364 prime base
		bodyModel[475] = new ModelRendererTurbo(this, 76, 29, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[476] = new ModelRendererTurbo(this, 85, 33, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[477] = new ModelRendererTurbo(this, 85, 29, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[478] = new ModelRendererTurbo(this, 76, 33, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[479] = new ModelRendererTurbo(this, 61, 21, textureX, textureY); // Box 88
		bodyModel[480] = new ModelRendererTurbo(this, 57, 15, textureX, textureY); // Box 88
		bodyModel[481] = new ModelRendererTurbo(this, 59, 12, textureX, textureY); // Box 88
		bodyModel[482] = new ModelRendererTurbo(this, 57, 18, textureX, textureY); // Box 88
		bodyModel[483] = new ModelRendererTurbo(this, 21, 154, textureX, textureY, "lamp"); // Box 353 markerlight
		bodyModel[484] = new ModelRendererTurbo(this, 65, 154, textureX, textureY, "lamp"); // Box 545 markerlight
		bodyModel[485] = new ModelRendererTurbo(this, 48, 21, textureX, textureY); // Box 364 prime base
		bodyModel[486] = new ModelRendererTurbo(this, 39, 12, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[487] = new ModelRendererTurbo(this, 48, 17, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[488] = new ModelRendererTurbo(this, 48, 12, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[489] = new ModelRendererTurbo(this, 39, 17, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[490] = new ModelRendererTurbo(this, 46, 25, textureX, textureY, "cull"); // Box 364 cull
		bodyModel[491] = new ModelRendererTurbo(this, 90, 169, textureX, textureY); // Box 497
		bodyModel[492] = new ModelRendererTurbo(this, 99, 169, textureX, textureY); // Box 497
		bodyModel[493] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 552
		bodyModel[494] = new ModelRendererTurbo(this, 162, 169, textureX, textureY); // Box 553
		bodyModel[495] = new ModelRendererTurbo(this, 148, 164, textureX, textureY); // Box 560
		bodyModel[496] = new ModelRendererTurbo(this, 134, 174, textureX, textureY); // Box 564
		bodyModel[497] = new ModelRendererTurbo(this, 70, 138, textureX, textureY, BoxName.ditch); // Box 443 ditchlight front a
		bodyModel[498] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 444
		bodyModel[499] = new ModelRendererTurbo(this, 14, 138, textureX, textureY, BoxName.ditch); // Box 445 ditchlight front a

		bodyModel[0].addBox(0F, 0F, 0F, 71, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-32.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(38.5F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(36.5F, 2F, -3.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Box 0
		bodyModel[3].setRotationPoint(-37.5F, 2F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[4].setRotationPoint(-20.5F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[5].setRotationPoint(21F, 2.5F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[6].setRotationPoint(34.5F, 2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[7].setRotationPoint(34.5F, 2F, 11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[8].setRotationPoint(-23.5F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[9].setRotationPoint(-23.5F, 2F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-35F, 0F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-37.5F, 0F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-35F, 0F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-37.5F, 0F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[14].setRotationPoint(-41.5F, 3F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-39.5F, 0F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 495
		bodyModel[16].setRotationPoint(-35F, 0F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F); // Box 496
		bodyModel[17].setRotationPoint(-37.5F, 0F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 497
		bodyModel[18].setRotationPoint(-39.5F, 0F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[19].setRotationPoint(38.5F, 2F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[20].setRotationPoint(38.5F, 2F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(22F, 2F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[22].setRotationPoint(22F, 2F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-19.5F, 2F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-19.5F, 2F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[25].setRotationPoint(-33.3F, 2.75F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[26].setRotationPoint(-33.3F, 2F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[27].setRotationPoint(-33.05F, 3F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[28].setRotationPoint(33.5F, 2F, -3.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[29].setRotationPoint(-38.28F, 2F, -3.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[30].setRotationPoint(-32.5F, 2F, -3.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-28.5F, -12F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-23.5F, -5F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 0
		bodyModel[33].setRotationPoint(-19.5F, -17F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 12, 1, 0F); // Box 60
		bodyModel[34].setRotationPoint(-28.5F, -12F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 61
		bodyModel[35].setRotationPoint(-23.5F, -5F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 62
		bodyModel[36].setRotationPoint(-19.5F, -17F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 0
		bodyModel[37].setRotationPoint(37.5F, -17F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(10.5F, -17F, -11F);

		bodyModel[39].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[39].setRotationPoint(14.5F, -12F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 79
		bodyModel[40].setRotationPoint(15F, -10F, -12F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 80
		bodyModel[41].setRotationPoint(10F, -10F, -12F);

		bodyModel[42].addBox(0F, 0F, -4F, 1, 15, 4, 0F); // Rear door
		bodyModel[42].setRotationPoint(37.5F, -15F, 2F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 0
		bodyModel[43].setRotationPoint(37.5F, -17F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(37.5F, -19F, -8.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 0
		bodyModel[45].setRotationPoint(37.5F, -17F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[46].setRotationPoint(37.5F, -19F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[47].setRotationPoint(37.5F, -19F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 62, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-23.5F, -22F, -2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 62, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-23.5F, -22F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 62, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[50].setRotationPoint(-23.5F, -22F, 2.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[51].setRotationPoint(38.5F, 0F, -5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[52].setRotationPoint(38.5F, 1F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[53].setRotationPoint(38.5F, 1F, 4F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[54].setRotationPoint(39.5F, 0F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(37.5F, -21F, -2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(37.5F, -21F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[57].setRotationPoint(37.5F, -21F, 2.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(-26.5F, -17F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[59].setRotationPoint(-26.5F, -17F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 79
		bodyModel[60].setRotationPoint(-19F, -15F, -12F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 80
		bodyModel[61].setRotationPoint(-24F, -15F, -12F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 108
		bodyModel[62].setRotationPoint(-19F, -15F, 11F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 18, 1, 0F); // Box 109
		bodyModel[63].setRotationPoint(-24F, -15F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-24.5F, -16F, -11F);

		bodyModel[65].addShapeBox(-4F, 0F, -0.5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door L
		bodyModel[65].setRotationPoint(-19.5F, -16F, -10F);

		bodyModel[66].addShapeBox(-4F, 0F, 0F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door R
		bodyModel[66].setRotationPoint(-19.5F, -16F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 5, 20, 0F); // Box 0
		bodyModel[67].setRotationPoint(-25.5F, -5F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[68].setRotationPoint(-19.5F, -17F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[69].setRotationPoint(-19.5F, -19F, -10F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 15, 10, 0F); // Box 0
		bodyModel[70].setRotationPoint(-19.5F, -20F, -5F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 21, 2, 0F); // Box 0
		bodyModel[71].setRotationPoint(-15.5F, -21F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[72].setRotationPoint(-19.5F, -21F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[73].setRotationPoint(-19.5F, -21F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, -0.5F, 0F, 0.42F, -0.5F); // Box 0
		bodyModel[74].setRotationPoint(-19.5F, -20.17F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.42F, -0.5F, 0F, 0.42F, -0.5F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 141
		bodyModel[75].setRotationPoint(-19.5F, -20.17F, 4.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[76].setRotationPoint(-19.5F, -17F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[77].setRotationPoint(-19.5F, -19F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(40F, -16F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(40F, -16F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[80].setRotationPoint(38.5F, -17F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[81].setRotationPoint(38.5F, -17F, -3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[82].setRotationPoint(38.5F, -17.5F, -3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(40F, -18F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[84].setRotationPoint(38.5F, -9F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.17F, 1F, 0F, -0.17F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[85].setRotationPoint(22.5F, -20F, -9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[86].setRotationPoint(22.5F, -20.5F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, -0.17F, 1F, -1F, -0.17F, 1F, -1F, 0.17F, 0F, -1F, 0.17F); // Box 0
		bodyModel[87].setRotationPoint(22.5F, -20F, -9.51F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -0.17F, 0F, 0F, -0.17F); // Box 169
		bodyModel[88].setRotationPoint(22.5F, -20F, 8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[89].setRotationPoint(22.5F, -20.5F, 5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0.17F, 1F, -1F, 0.17F, 1F, -1F, -0.17F, 0F, -1F, -0.17F); // Box 171
		bodyModel[90].setRotationPoint(22.5F, -20F, 9.51F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 0, 18, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9F, 0F, 0F, -9F); // Box 0
		bodyModel[91].setRotationPoint(22.5F, -22.01F, -4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, -0.65F, 0F, -12F, -0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F, 0F, 0.65F, 0F, -12F, 0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[92].setRotationPoint(22.5F, -22.01F, -4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, 0F, -2F, -12F, 0F, -2F, -12F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0.65F, 0F, 0F, 0.65F, 0F); // Box 182
		bodyModel[93].setRotationPoint(22.5F, -22.01F, 0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[94].setRotationPoint(-0.5F, -22.5F, -2F);

		bodyModel[95].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 exhaust
		bodyModel[95].setRotationPoint(-4.5F, -22F, 2.5F);
		bodyModel[95].rotateAngleX = -0.31415927F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[96].setRotationPoint(-24.5F, -16F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[97].setRotationPoint(-26.5F, -21F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-28.5F, -6F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[99].setRotationPoint(-28F, -11F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		bodyModel[100].setRotationPoint(-27.25F, -11.5F, 2.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[101].setRotationPoint(-28.5F, -14F, 3.3F);
		bodyModel[101].rotateAngleY = -1.22173048F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[102].setRotationPoint(-28.24F, -12.25F, 4.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[103].setRotationPoint(-27.85F, -10.75F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[104].setRotationPoint(-27.85F, -11.75F, 7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 389
		bodyModel[105].setRotationPoint(-27.73F, -11.5F, 6F);

		bodyModel[106].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[106].setRotationPoint(-0.5F, -4F, -3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-0.5F, -4F, -5.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[108].setRotationPoint(-0.5F, -4F, 3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[109].setRotationPoint(16.5F, -4F, 3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(-0.5F, -13F, -3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[111].setRotationPoint(0.3F, -15F, -2.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[112].setRotationPoint(0.6F, -15F, -3.83F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[113].setRotationPoint(2.98F, -15F, -3.83F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[114].setRotationPoint(5.36F, -15F, -3.83F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[115].setRotationPoint(7.71F, -15F, -3.83F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(10.08F, -15F, -3.83F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[117].setRotationPoint(12.46F, -15F, -3.83F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(14.84F, -15F, -3.83F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[119].setRotationPoint(17.22F, -15F, -3.83F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[120].setRotationPoint(0.3F, -17F, -3.83F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[121].setRotationPoint(2.68F, -17F, -3.83F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[122].setRotationPoint(-0.5F, -10F, -4.83F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[123].setRotationPoint(5.06F, -17F, -3.83F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[124].setRotationPoint(7.41F, -17F, -3.83F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[125].setRotationPoint(9.78F, -17F, -3.83F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[126].setRotationPoint(12.16F, -17F, -3.83F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[127].setRotationPoint(14.54F, -17F, -3.83F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[128].setRotationPoint(16.9F, -17F, -3.83F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, 0F, -4.37F, 0F, 0F, -4.37F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -4.37F, -1F, 0F, -4.37F, -1F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[129].setRotationPoint(-2.5F, -15F, 2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[130].setRotationPoint(-0.5F, -17F, 2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.63F, -0.25F, 0F, -0.63F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 394
		bodyModel[131].setRotationPoint(16.13F, -15F, 2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 394
		bodyModel[132].setRotationPoint(23.5F, -3.5F, 0F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[133].setRotationPoint(25.5F, -3F, -2.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[134].setRotationPoint(25.5F, -4F, -2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[135].setRotationPoint(21.5F, -5.5F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[136].setRotationPoint(21.5F, -6.5F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[137].setRotationPoint(22.5F, -19F, -8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[138].setRotationPoint(22.5F, -19F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[139].setRotationPoint(22.5F, -19F, 8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(22.5F, -21F, -2.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(22.5F, -21F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[142].setRotationPoint(22.5F, -21F, 2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[143].setRotationPoint(17F, -11F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[144].setRotationPoint(17F, -11F, -10F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 0
		bodyModel[145].setRotationPoint(34.9F, -4F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[146].setRotationPoint(35.5F, -19.75F, -6F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 0
		bodyModel[147].setRotationPoint(-7F, -5F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-7F, -9F, -6F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[149].setRotationPoint(-10F, -1F, -2.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-2F, -3.7F, 0F);
		bodyModel[150].rotateAngleX = -0.78539816F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[151].setRotationPoint(-10.5F, -2.3F, -2.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(-10.5F, -4.3F, -1.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-10.5F, -4.3F, -2.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[154].setRotationPoint(-10.5F, -4.3F, 1.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[155].setRotationPoint(-10.5F, -7.3F, -1F);

		bodyModel[156].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[156].setRotationPoint(-9.5F, -3.3F, 2F);
		bodyModel[156].rotateAngleX = -1.10828408F;

		bodyModel[157].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[157].setRotationPoint(-9.5F, -3.3F, -2F);
		bodyModel[157].rotateAngleX = 1.10828408F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[158].setRotationPoint(-10.85F, -7.5F, -0.7F);
		bodyModel[158].rotateAngleY = 0.78539816F;

		bodyModel[159].addShapeBox(0F, -0.5F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[159].setRotationPoint(-4.5F, -20.5F, 2.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[160].setRotationPoint(-7F, -11.21F, -4.79F);
		bodyModel[160].rotateAngleX = -0.78539816F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[161].setRotationPoint(-7F, -9.79F, -3.37F);
		bodyModel[161].rotateAngleX = -0.78539816F;

		bodyModel[162].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[162].setRotationPoint(-8F, -4F, -1F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[163].setRotationPoint(-8F, -6F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[164].setRotationPoint(-9.1F, -3.5F, 4F);
		bodyModel[164].rotateAngleY = -0.78539816F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[165].setRotationPoint(-8.4F, -3.5F, -4.7F);
		bodyModel[165].rotateAngleY = 0.78539816F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[166].setRotationPoint(-8F, -4F, 1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[167].setRotationPoint(-8F, -4F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[168].setRotationPoint(-8F, -9F, 1F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[169].setRotationPoint(-8F, -9F, -4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[170].setRotationPoint(-8F, -11.21F, -4.79F);
		bodyModel[170].rotateAngleX = -0.78539816F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[171].setRotationPoint(-8F, -9F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[172].setRotationPoint(-8F, -11F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[173].setRotationPoint(-8.5F, -2.99F, 0F);
		bodyModel[173].rotateAngleX = -0.78539816F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[174].setRotationPoint(-6.5F, -16F, 2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[175].setRotationPoint(-6.5F, -14F, 0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[176].setRotationPoint(-6.5F, -14F, 5.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[177].setRotationPoint(-6.51F, -16F, 0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[178].setRotationPoint(-7F, -1F, -6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[179].setRotationPoint(-4.51F, -12F, 0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[180].setRotationPoint(-7F, -15.37F, 4F);
		bodyModel[180].rotateAngleX = -0.78539816F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[181].setRotationPoint(-10F, -16.25F, 4F);
		bodyModel[181].rotateAngleX = -0.78539816F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[182].setRotationPoint(-2.5F, -17F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[183].setRotationPoint(-6.5F, -17F, -0.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		bodyModel[184].setRotationPoint(-6.5F, -15F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[185].setRotationPoint(38.5F, -9F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[186].setRotationPoint(38.5F, -20.5F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		bodyModel[187].setRotationPoint(-39F, 2F, -2F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[188].setRotationPoint(-15F, -24F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[189].setRotationPoint(-20F, -23F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[190].setRotationPoint(-28.5F, -22F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[191].setRotationPoint(-27F, -22F, 0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[192].setRotationPoint(-28F, -22F, -1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[193].setRotationPoint(-23F, -23F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[194].setRotationPoint(-23F, -24F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F); // Box 565
		bodyModel[195].setRotationPoint(-40F, 1F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[196].setRotationPoint(-2.49F, -16F, 0.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 0
		bodyModel[197].setRotationPoint(-28.17F, -9F, 8.12F);
		bodyModel[197].rotateAngleY = -0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 336
		bodyModel[198].setRotationPoint(-23.5F, -20F, 8F);

		bodyModel[199].addBox(0F, 0F, 0F, 15, 5, 16, 0F); // Box 0
		bodyModel[199].setRotationPoint(-5F, 2F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[200].setRotationPoint(-5F, 7F, -8F);

		bodyModel[201].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 0
		bodyModel[201].setRotationPoint(-3F, 3F, -9.59F);
		bodyModel[201].rotateAngleX = -0.78539816F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F); // Box 0 cull
		bodyModel[202].setRotationPoint(-1F, 2F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 343
		bodyModel[203].setRotationPoint(-3F, 3F, 9.59F);
		bodyModel[203].rotateAngleX = -0.78539816F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F); // Box 344
		bodyModel[204].setRotationPoint(-1F, 2F, 8F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[205].setRotationPoint(10.5F, 2F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[206].setRotationPoint(10F, 2F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[207].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 348
		bodyModel[208].setRotationPoint(10.5F, -17F, 10F);

		bodyModel[209].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear side door R
		bodyModel[209].setRotationPoint(14.5F, -12F, 10F);

		bodyModel[210].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 0
		bodyModel[210].setRotationPoint(14.5F, -17F, -11F);

		bodyModel[211].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 62
		bodyModel[211].setRotationPoint(14.5F, -17F, 10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[212].setRotationPoint(10.5F, 2F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 0
		bodyModel[213].setRotationPoint(14.5F, -10F, 11F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 0
		bodyModel[214].setRotationPoint(10.5F, -10F, 11F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 355 cull
		bodyModel[215].setRotationPoint(34.5F, -4.5F, -12F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 360
		bodyModel[216].setRotationPoint(34.5F, -4.5F, 11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, -5F, 0F); // Box 0
		bodyModel[217].setRotationPoint(22.5F, -15.01F, -11.01F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, -5F, 0F); // Box 343
		bodyModel[218].setRotationPoint(22.5F, -15.01F, 11.01F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[219].setRotationPoint(22.5F, -17F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[220].setRotationPoint(22.5F, -15F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[221].setRotationPoint(22.5F, -15F, -9.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[222].setRotationPoint(22.5F, -15F, 9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[223].setRotationPoint(22.5F, -15F, 8.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[224].setRotationPoint(22.5F, -15F, -3.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[225].setRotationPoint(22.5F, -15F, -6.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[226].setRotationPoint(22.5F, -15F, 3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0.02F, 0F, -5F, 0.02F); // Box 0 cull
		bodyModel[227].setRotationPoint(-1.5F, -15.01F, -11.01F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, 0F, 0.02F, -11F, 0F, 0.02F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.02F, -11F, -5F, 0.02F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 378 cull
		bodyModel[228].setRotationPoint(-1.5F, -15.01F, 10.01F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[229].setRotationPoint(-24F, 2F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[230].setRotationPoint(-19.5F, 2F, -11F);

		bodyModel[231].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 0
		bodyModel[231].setRotationPoint(-15.5F, -5F, -10F);

		bodyModel[232].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 382
		bodyModel[232].setRotationPoint(-15.5F, -5F, 5F);

		bodyModel[233].addBox(0F, 0F, 0F, 4, 21, 2, 0F); // Box 383
		bodyModel[233].setRotationPoint(-15.5F, -21F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 0
		bodyModel[234].setRotationPoint(-19.5F, -21F, -2.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 0
		bodyModel[235].setRotationPoint(36.78F, -7F, -9.5F);
		bodyModel[235].rotateAngleY = 0.78539816F;

		bodyModel[236].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[236].setRotationPoint(36.79F, -17.5F, -1F);
		bodyModel[236].rotateAngleZ = -0.78539816F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[237].setRotationPoint(21.5F, -7F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[238].setRotationPoint(21.5F, -5F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[239].setRotationPoint(20.5F, -8F, 4.5F);
		bodyModel[239].rotateAngleY = -0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[240].setRotationPoint(23.5F, -1F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 394
		bodyModel[241].setRotationPoint(-15.5F, -3.5F, 0F);
		bodyModel[241].rotateAngleX = -0.78539816F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[242].setRotationPoint(-15.5F, -1F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[243].setRotationPoint(24.5F, -6.66F, 0F);
		bodyModel[243].rotateAngleX = -0.78539816F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[244].setRotationPoint(24.5F, -4.5F, -0.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 182
		bodyModel[245].setRotationPoint(22.5F, -22F, 2.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 402
		bodyModel[246].setRotationPoint(22.5F, -22F, -4.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402 cull
		bodyModel[247].setRotationPoint(22.49F, -22.5F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F, -0.51F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, -0.5F, -0.51F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[248].setRotationPoint(-27.5F, -16F, -10.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F, -0.51F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, 0F, -0.51F, -0.01F, 0F); // Box 346 cull
		bodyModel[249].setRotationPoint(-27.5F, -16F, 9.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0.49F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0.49F, -0.01F, -0.5F); // Box 0 cull
		bodyModel[250].setRotationPoint(-28F, -16F, -10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0.49F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0.49F, -0.01F, 0F); // Box 348
		bodyModel[251].setRotationPoint(-28F, -16F, 9.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[252].setRotationPoint(-27.15F, -20F, -3.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.35F, 1.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(-27.15F, -20F, -9.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 88
		bodyModel[254].setRotationPoint(-27.15F, -20F, 3.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[255].setRotationPoint(-27.15F, -18F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, -0.5F, -0.35F, 0.5F, -0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[256].setRotationPoint(-27.15F, -18F, 9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, -1F, 0F, 0F, -1F, 0F, 0.05F, -0.5F, 0.5F, -0.35F, -0.5F, 0.5F, -0.35F, 0F, -1F, 0.09F, 0F, -1F); // Box 355
		bodyModel[257].setRotationPoint(-27.15F, -18F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[258].setRotationPoint(-23.5F, -21F, -2.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[259].setRotationPoint(-23.5F, -21F, -3.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[260].setRotationPoint(-23.5F, -21F, 2.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[261].setRotationPoint(-23.5F, -21F, -8.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[262].setRotationPoint(-23.5F, -19F, -9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 361
		bodyModel[263].setRotationPoint(-23.5F, -21F, 3.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 362
		bodyModel[264].setRotationPoint(-23.5F, -19F, 8.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 0
		bodyModel[265].setRotationPoint(-23.5F, -18F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.335F, 0.5F, 0F, -0.335F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 364
		bodyModel[266].setRotationPoint(-23.5F, -18F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.715F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, 0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.535F, 0F, 0F); // Box 363
		bodyModel[267].setRotationPoint(-24.5F, -22F, 2.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.715F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.675F, 0F, 0F); // Box 364
		bodyModel[268].setRotationPoint(-24.5F, -22F, -0.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-2F, -0.335F, 0F, 1F, -0.335F, 0F, 1F, -1.335F, 0F, -2F, -1.335F, 0F, -0.465F, 0F, 0F, 1F, 0F, 0F, 1F, 0.75F, 0F, -0.675F, 0.75F, 0F); // Box 364
		bodyModel[269].setRotationPoint(-25.5F, -22F, 3.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-2F, -1.335F, 0F, 1F, -1.335F, 0F, 1F, -0.335F, 0F, -2F, -0.335F, 0F, -0.675F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0F, 0F, -0.465F, 0F, 0F); // Box 384
		bodyModel[270].setRotationPoint(-25.5F, -22F, -6.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[271].setRotationPoint(-27F, -2.5F, -2F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 5, 8, 0F); // Box 0
		bodyModel[272].setRotationPoint(-28.5F, -5F, -10F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 5, 8, 0F); // Box 396
		bodyModel[273].setRotationPoint(-28.5F, -5F, 2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[274].setRotationPoint(-29.5F, -10F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[275].setRotationPoint(-28.5F, -6F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 1.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.15F, -0.1F, 0F, 1.15F, -0.1F, 0F); // Box 207
		bodyModel[276].setRotationPoint(-29.15F, -19F, -0.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.625F, 0F, 0F, -1.63F, 0F, 0F, -1.62F, 0F, 0F, 0.62F, 0F, 0F); // Box 529
		bodyModel[277].setRotationPoint(-28.15F, -17F, 10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1.35F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[278].setRotationPoint(-29.15F, -20F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, -1.5F, 0F, -1.6F, -1.5F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 1.5F, 0F, -0.6F, 1.5F, 0F); // Box 209
		bodyModel[279].setRotationPoint(-28.8F, -20F, 3.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, -0.5F, -1.05F, -0.5F, -0.5F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F); // Box 208
		bodyModel[280].setRotationPoint(-28.2F, -18.5F, 9.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[281].setRotationPoint(-28.15F, -18F, 10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, -0.85F, 1.525F, -0.5F, 0.85F, 1.525F, -0.5F); // Box 209
		bodyModel[282].setRotationPoint(-28.8F, -19F, 3.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.255F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F); // Box 105
		bodyModel[283].setRotationPoint(-27.5F, -17F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.985F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 105
		bodyModel[284].setRotationPoint(-29.5F, -12F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F, 0.09F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, -0.5F, 0.5F, 0.05F, -0.5F, 0.5F); // Box 420
		bodyModel[285].setRotationPoint(-27.15F, -18F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.255F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[286].setRotationPoint(-27.5F, -17F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 429
		bodyModel[287].setRotationPoint(-28.15F, -18F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.15F, -0.1F, 0F, -1.15F, -0.1F, 0F, -1.5F, -0.3F, -0.5F, 1.5F, -0.3F, -0.5F); // Box 430
		bodyModel[288].setRotationPoint(-29.15F, -19F, -3.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 1.525F, -0.5F, -0.85F, 1.525F, -0.5F, -1.5F, -0.1F, 0F, 1.5F, -0.1F, 0F); // Box 431
		bodyModel[289].setRotationPoint(-28.8F, -19F, -10.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[290].setRotationPoint(-28.5F, -16F, -12F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[291].setRotationPoint(-28.5F, -16F, 11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[292].setRotationPoint(-26.5F, -21F, 0.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[293].setRotationPoint(-28.5F, -22F, 0.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[294].setRotationPoint(-28F, -21F, -1.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[295].setRotationPoint(-28F, -22F, -1.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[296].setRotationPoint(-28F, -22F, -1.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[297].setRotationPoint(-28F, -23F, -1.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[298].setRotationPoint(-39F, 0F, -2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[299].setRotationPoint(-38F, -12.5F, 1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[300].setRotationPoint(-38F, -12.5F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[301].setRotationPoint(-38F, -12.5F, -2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[302].setRotationPoint(-38F, -12.5F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[303].setRotationPoint(-38F, -10.5F, 1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[304].setRotationPoint(-38F, -10.5F, -2F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[305].setRotationPoint(-38F, -9.5F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[306].setRotationPoint(-38F, -9.5F, -2F);

		bodyModel[307].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[307].setRotationPoint(-37.25F, -10.5F, 0F);

		bodyModel[308].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[308].setRotationPoint(-37.25F, -10.5F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[309].setRotationPoint(-37.25F, -11.75F, -1.25F);

		bodyModel[310].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[310].setRotationPoint(-37.25F, -10.5F, 0F);
		bodyModel[310].rotateAngleX = 1.57079633F;

		bodyModel[311].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[311].setRotationPoint(-37.25F, -10.5F, 0F);
		bodyModel[311].rotateAngleX = 1.57079633F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[312].setRotationPoint(-32.5F, 2F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[313].setRotationPoint(-32.5F, 2.5F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[314].setRotationPoint(-35F, 2F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, -1.25F, 0F, 0F); // Box 0
		bodyModel[315].setRotationPoint(-39F, 2F, 2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F, -0.71F, 0F, 0.285F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.14F, 0F, -1F); // Box 496
		bodyModel[316].setRotationPoint(-37.5F, 2F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[317].setRotationPoint(-40F, 1F, 0F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[318].setRotationPoint(-40F, 1F, -3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.645F, 0F, 0.355F, 0.265F, 0F, -0.435F, -0.28F, 0F, 0F, 0.18F, 0F, -1F, -0.565F, 0F, 0.43F, 0.265F, -1F, -0.435F, -0.28F, -1F, 0F, 0.215F, 0F, -1F); // Box 496
		bodyModel[319].setRotationPoint(-37.5F, 7F, 7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.065F, 0F, -0.375F, -0.17F, 0F, 0.33F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.065F, -1F, -0.375F, -0.17F, -1F, 0.33F, 0F, -0.5F, 0F); // Box 0
		bodyModel[320].setRotationPoint(-35F, 6F, 9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.71F, 0F, 0.285F, -0.1F, 0F, -1.235F, -0.38F, 0F, 1F, 0.14F, 0F, -1F, -0.645F, 0F, 0.355F, -0.1F, 0F, -1.235F, -0.38F, 0F, 1F, 0.18F, 0F, -1F); // Box 496
		bodyModel[321].setRotationPoint(-37.5F, 6F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.765F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.38F, 0F, -1F, 0.1F, 0F, 0.765F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.38F, 0F, -1F); // Box 496
		bodyModel[322].setRotationPoint(-35.5F, 6F, 9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 444
		bodyModel[323].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 445
		bodyModel[324].setRotationPoint(-32.5F, 2.5F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 446
		bodyModel[325].setRotationPoint(-35F, 2F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 447
		bodyModel[326].setRotationPoint(-39F, 2F, -7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0.14F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.71F, 0F, 0.285F); // Box 448
		bodyModel[327].setRotationPoint(-37.5F, 2F, -8F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.18F, 0F, -1F, -0.28F, 0F, 0F, 0.265F, 0F, -0.435F, -0.645F, 0F, 0.355F, 0.215F, 0F, -1F, -0.28F, -1F, 0F, 0.265F, -1F, -0.435F, -0.565F, 0F, 0.43F); // Box 449
		bodyModel[328].setRotationPoint(-37.5F, 7F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.17F, 0F, 0.33F, -0.065F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.17F, -1F, 0.33F, -0.065F, -1F, -0.375F, 0F, -0.5F, 0F); // Box 450
		bodyModel[329].setRotationPoint(-35F, 6F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.14F, 0F, -1F, -0.38F, 0F, 1F, -0.1F, 0F, -1.235F, -0.71F, 0F, 0.285F, 0.18F, 0F, -1F, -0.38F, 0F, 1F, -0.1F, 0F, -1.235F, -0.645F, 0F, 0.355F); // Box 451
		bodyModel[330].setRotationPoint(-37.5F, 6F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.38F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0.765F, 0.38F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.1F, 0F, 0.765F); // Box 452
		bodyModel[331].setRotationPoint(-35.5F, 6F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343 glow
		bodyModel[332].setRotationPoint(0.5F, -4.01F, 11.01F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 454 glow
		bodyModel[333].setRotationPoint(0.5F, -4.01F, -11.01F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F); // Box 208
		bodyModel[334].setRotationPoint(-30.65F, -13.1F, 0F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[335].setRotationPoint(-30.65F, -13.1F, -4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, -1.625F, -0.5F, -0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 1.625F, -0.5F, -0.65F, 1.625F, -0.5F); // Box 209
		bodyModel[336].setRotationPoint(-30.3F, -13.1F, 3.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.65F, -1.625F, -0.5F, 0.65F, -1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 1.625F, -0.5F, 0.65F, 1.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[337].setRotationPoint(-30.3F, -13.1F, -10.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.35F, -1.95F, 0F, -0.65F, -1.95F, 0F, -1.65F, 0.3F, 0F, 0.65F, 0.3F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.65F, 0F, 0F); // Box 0
		bodyModel[338].setRotationPoint(-29F, -13F, -10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.65F, 0.3F, 0F, -1.65F, 0.3F, 0F, -0.65F, -1.95F, 0F, -0.35F, -1.95F, 0F, 0.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F); // Box 416
		bodyModel[339].setRotationPoint(-29F, -13F, 0F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.625F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.46F, 0F, 0F); // Box 529
		bodyModel[340].setRotationPoint(-29.77F, -11F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[341].setRotationPoint(-32.5F, -9F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[342].setRotationPoint(-31.5F, -9F, -11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.985F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F); // Box 431
		bodyModel[343].setRotationPoint(-29.5F, -12F, -11F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0.62F, 0F, 0F, -1.62F, 0F, 0F, -1.63F, 0F, 0F, 1.625F, 0F, 0F); // Box 434
		bodyModel[344].setRotationPoint(-28.15F, -17F, -11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, 0.625F, 0F, 0F); // Box 436
		bodyModel[345].setRotationPoint(-29.77F, -11F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.075F, -0.5F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0.5F, 0F); // Box 105
		bodyModel[346].setRotationPoint(-27.5F, -16F, 11F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F); // Box 438
		bodyModel[347].setRotationPoint(-27.5F, -16F, -12F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[348].setRotationPoint(-28.5F, -9F, -8.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[349].setRotationPoint(-28.5F, -9F, -6.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[350].setRotationPoint(-27.5F, -9F, -7.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0 steam gen panel
		bodyModel[351].setRotationPoint(-29.5F, -12F, -5.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 389
		bodyModel[352].setRotationPoint(-27F, -9F, 2.27F);
		bodyModel[352].rotateAngleY = 0.78539816F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[353].setRotationPoint(-27.85F, -10F, 6.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[354].setRotationPoint(-27.65F, -12F, 2F);
		bodyModel[354].rotateAngleY = 0.34906585F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.73F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.83F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 0 steam gen panel
		bodyModel[355].setRotationPoint(-29.5F, -11F, 4F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[356].setRotationPoint(-28.5F, -12.5F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull
		bodyModel[357].setRotationPoint(-39.5F, 6.5F, -8F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 449 cull
		bodyModel[358].setRotationPoint(-39.5F, 6.5F, 3F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-1.115F, 0F, 0F, 1.115F, 0F, 0F, 1.115F, 0F, 0F, -1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[359].setRotationPoint(-39F, -8F, -2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 497
		bodyModel[360].setRotationPoint(-38.5F, -9F, 2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,-2.25F, 0F, 0F, 2.25F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 463
		bodyModel[361].setRotationPoint(-38.5F, -9F, -7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167
		bodyModel[362].setRotationPoint(-37F, -10.5F, 0F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[363].setRotationPoint(-37F, -10.5F, -2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[364].setRotationPoint(-37F, -12.5F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[365].setRotationPoint(-37F, -12.5F, 0F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[366].setRotationPoint(-37.75F, -9F, -2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 0
		bodyModel[367].setRotationPoint(-37.75F, -9F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[368].setRotationPoint(-37.75F, -9F, 1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 431
		bodyModel[369].setRotationPoint(-37.75F, -9F, 0F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[370].setRotationPoint(-37.75F, -10.5F, 1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[371].setRotationPoint(-37.75F, -10.5F, -2F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.1325F, -0.125F, 0F, -0.135F, -0.125F, 0F, 1.375F, -0.125F, 0F, -1.375F, -0.125F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 497
		bodyModel[372].setRotationPoint(-37.5F, -10F, 2F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[373].setRotationPoint(-32.5F, -9F, 10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[374].setRotationPoint(-31.5F, -9F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 437
		bodyModel[375].setRotationPoint(-35F, -9F, 10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-2.25F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, -1.25F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, -1F); // Box 438
		bodyModel[376].setRotationPoint(-37.5F, -9F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.61F, 0F, -0.5F, -0.61F, 0F, 0F, -0.03F, 0F, 0F, 1.41F, -0.5F, -1F, -0.61F, -0.5F, -1F, -0.61F, -0.5F, 0F, 1.41F, -0.5F, 0F); // Box 430
		bodyModel[377].setRotationPoint(-36.14F, -12F, 1F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.085F, 0F, 0F, -0.725F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.6F, 0F); // Box 208
		bodyModel[378].setRotationPoint(-35.75F, -13.1F, 0F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.525F, 0.125F, 0F, -0.05F, -0.1F, -2.19F, -0.44F, -2.25F, -0.03F, -0.375F, -1.875F, -3F, -1.525F, 1.75F, 0F, -0.05F, 1.75F, -2.19F, -0.5F, 1.75F, 0F, -0.25F, 1.75F, -3F); // Box 438
		bodyModel[379].setRotationPoint(-36.5F, -11.75F, 7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.375F, -0.125F, 0F, 1.375F, -0.125F, 0F, -0.135F, -0.125F, 0F, 0.135F, -0.125F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 445
		bodyModel[380].setRotationPoint(-37.5F, -10F, -7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -0.1175F, 1.525F, 0F, -1F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F); // Box 497
		bodyModel[381].setRotationPoint(-37.75F, -12.4F, 2F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -1F, 0F, -0.555F, -1F, 0F, 0.325F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0.175F, 1.25F, 0F); // Box 457
		bodyModel[382].setRotationPoint(-24.5F, -21F, 6.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.335F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.105F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[383].setRotationPoint(-24.5F, -19F, 9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.555F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -0.335F, -1.2F, 0F, 0.175F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0.105F, 0.5F, 0F); // Box 459
		bodyModel[384].setRotationPoint(-24.5F, -20F, 8.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -1.18F, -0.31F, 0F, -1.25F, -0.31F, -2.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 1.18F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[385].setRotationPoint(-33.55F, -12.9F, 3.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, -0.17F, -0.2F, 0F, -0.07F, -1.01F, 0F, 0.07F, 0.01F, 0.05F, 0F, 0.01F, 0.05F, 0.17F, -0.2F, 0F, 0.07F, -1.01F); // Box 209
		bodyModel[386].setRotationPoint(-33.55F, -11.72F, 9.2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.07F, -1.01F, 0.05F, -0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, -0.07F, 0.01F, 0F, 0.07F, -1.01F, 0.05F, 0.17F, -0.2F, 0.05F, 0F, 0.01F, 0F, 0.07F, 0.01F); // Box 468
		bodyModel[387].setRotationPoint(-33.55F, -11.72F, -10.2F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.2435F, 0F, 0.42F, -0.005F, 0F, 0.42F, -0.5615F, -0.5F, 0.005F, -0.685F, -0.5F, 0.005F, 0.2435F, 0F, 0.42F, 0.005F, 0F, 0.42F, 0.5615F, -0.5F, 0.005F, 0.685F, -0.5F); // Box 209
		bodyModel[388].setRotationPoint(-34.97F, -12.56F, 3.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.005F, -0.125F, 0F, 0.42F, -0.0015F, 0F, 0.42F, -0.35F, 0.19F, -1.42F, -0.35F, 0.19F, 0.005F, 0.1265F, 0F, 0.42F, 0.0015F, 0F, 0.42F, 0.35F, 0.19F, -1.42F, 0.35F, 0.19F); // Box 209
		bodyModel[389].setRotationPoint(-34.97F, -12F, 7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.0935F, 0F, -0.455F, -0.005F, 0F, -0.455F, -0.445F, -0.5F, -0.545F, -0.445F, -0.5F, 0F, 0.0935F, 0F, -0.455F, 0.004F, 0F, -0.455F, 0.445F, -0.5F, -0.545F, 0.445F, -0.5F); // Box 209
		bodyModel[390].setRotationPoint(-35.52F, -12.32F, 3.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.005F, -0.685F, -0.5F, 0.42F, -0.5615F, -0.5F, 0.42F, -0.005F, 0F, 0.005F, -0.2435F, 0F, 0.005F, 0.685F, -0.5F, 0.42F, 0.5615F, -0.5F, 0.42F, 0.005F, 0F, 0.005F, 0.2435F, 0F); // Box 472
		bodyModel[391].setRotationPoint(-34.97F, -12.56F, -7.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, 0.006F, -0.5F, -0.61F, 0.006F, -0.5F, -0.61F, -0.025F, 0F, -0.39F, -0.025F, 0F, 0F, -0.6F, -0.5F, -0.61F, -0.6F, -0.5F, -0.61F, -0.6F, 0F, -0.03F, -0.6F, 0F); // Box 430
		bodyModel[392].setRotationPoint(-36.14F, -12.4F, 1F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.094F, -0.5F, -1F, -0.094F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, -0.5F, -0.51F, -0.4F, -0.5F); // Box 430
		bodyModel[393].setRotationPoint(-36.75F, -12.5F, 0F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.03F, 0F, 0F, -0.61F, 0F, 0F, -0.61F, 0F, -0.5F, 0F, 0F, -0.5F, 1.41F, -0.5F, 0F, -0.61F, -0.5F, 0F, -0.61F, -0.5F, -1F, 1.41F, -0.5F, -1F); // Box 459
		bodyModel[394].setRotationPoint(-36.14F, -12F, -2F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.39F, -0.025F, 0F, -0.61F, -0.025F, 0F, -0.61F, 0.006F, -0.5F, -0.39F, 0.006F, -0.5F, -0.03F, -0.6F, 0F, -0.61F, -0.6F, 0F, -0.61F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 460
		bodyModel[395].setRotationPoint(-36.14F, -12.4F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, -0.5F, 0.3F, 0.085F, -0.5F, 0.45F, 0F, 0F, -0.2325F, -0.875F, 0F, 0F, 0.6F, -0.5F, 0.3F, 0F, -0.5F, 0.45F, 0F, 0F, -0.2325F, 0.875F, 0F); // Box 208
		bodyModel[396].setRotationPoint(-35.75F, -13.1F, 1.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.094F, -0.5F, 0F, -0.094F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.51F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 465
		bodyModel[397].setRotationPoint(-36.75F, -12.5F, -2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.725F, 0F, 0.3F, 0.085F, 0F, 0.1F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F); // Box 466
		bodyModel[398].setRotationPoint(-35.75F, -13.1F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.2325F, -0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0.085F, -0.5F, 0F, -0.725F, -0.5F, -0.2325F, 0.875F, 0F, 0.45F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0.6F, -0.5F); // Box 467
		bodyModel[399].setRotationPoint(-35.75F, -13.1F, -3.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.345F, 0F, 0.05F, 0F, 0F, -2F, -1.25F, -0.31F, 0F, -1.25F, -0.31F, 0F, 0.345F, 0F, 0.05F, 0F, 0F, -2F, 1.25F, -0.31F, 0F, 1.25F, -0.31F); // Box 209
		bodyModel[400].setRotationPoint(-33.55F, -12.9F, 3.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, 0.05F, -1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F, 0F, 1.25F, -0.31F, 0.05F, 1.18F, -0.31F, 0.05F, 0F, 0F, -2.05F, 0F, 0F); // Box 470
		bodyModel[401].setRotationPoint(-33.55F, -12.9F, -9.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1.25F, -0.31F, -2F, -1.25F, -0.31F, 0.05F, 0F, 0F, 0F, -0.345F, 0F, 0F, 1.25F, -0.31F, -2F, 1.25F, -0.31F, 0.05F, 0F, 0F, 0F, 0.345F, 0F); // Box 471
		bodyModel[402].setRotationPoint(-33.55F, -12.9F, -9.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, -1.625F, -0.5F, 0F, -1.55F, -0.5F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 1.625F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[403].setRotationPoint(-31.5F, -13.1F, 3.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.2F, 0F, -0.8F, 0F, 0F, -2F, -1.55F, -0.5F, 0F, -1.55F, -0.5F, 0F, 0.2F, 0F, -0.8F, 0F, 0F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F); // Box 209
		bodyModel[404].setRotationPoint(-31.5F, -13.1F, 3.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -0.15F, -1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 1.55F, -0.5F, -0.15F, 1.625F, -0.5F, -0.8F, 0F, 0F, -1.2F, 0F, 0F); // Box 480
		bodyModel[405].setRotationPoint(-31.5F, -13.1F, -10.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -1.55F, -0.5F, -2F, -1.55F, -0.5F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1.55F, -0.5F, -2F, 1.55F, -0.5F, -0.8F, 0F, 0F, 0F, 0.2F, 0F); // Box 481
		bodyModel[406].setRotationPoint(-31.5F, -13.1F, -10.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[407].setRotationPoint(-38.01F, -12.5F, 1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[408].setRotationPoint(-38.01F, -12.5F, 0F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[409].setRotationPoint(-38.01F, -10.5F, 1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[410].setRotationPoint(-38.01F, -9.5F, 0F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[411].setRotationPoint(-38.01F, -12.5F, -2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[412].setRotationPoint(-38.01F, -12.5F, -2F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[413].setRotationPoint(-38.01F, -10.5F, -2F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[414].setRotationPoint(-38.01F, -9.5F, -2F);

		bodyModel[415].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight small top
		bodyModel[415].setRotationPoint(-37.25F, -10.5F, 0F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[416].setRotationPoint(-38.69F, -7.5F, 1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[417].setRotationPoint(-38.69F, -7.5F, 0F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[418].setRotationPoint(-38.69F, -7.5F, -2F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[419].setRotationPoint(-38.69F, -7.5F, -2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[420].setRotationPoint(-38.69F, -5.5F, 1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[421].setRotationPoint(-38.69F, -5.5F, -2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[422].setRotationPoint(-38.69F, -4.5F, 0F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[423].setRotationPoint(-38.69F, -4.5F, -2F);

		bodyModel[424].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[424].setRotationPoint(-37.94F, -5.5F, 0F);

		bodyModel[425].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[425].setRotationPoint(-37.94F, -5.5F, 0F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[426].setRotationPoint(-37.94F, -6.75F, -1.25F);

		bodyModel[427].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[427].setRotationPoint(-37.94F, -5.5F, 0F);
		bodyModel[427].rotateAngleX = 1.57079633F;

		bodyModel[428].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[428].setRotationPoint(-37.94F, -5.5F, 0F);
		bodyModel[428].rotateAngleX = 1.57079633F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 430
		bodyModel[429].setRotationPoint(-38.44F, -4F, 1F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.07F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 431
		bodyModel[430].setRotationPoint(-38.44F, -4F, 0F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, -1F, 0.202F, 0F, -1F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[431].setRotationPoint(-38.44F, -5.5F, 1F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.202F, 0F, 0F, 0.202F, 0F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 433
		bodyModel[432].setRotationPoint(-38.44F, -5.5F, -2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[433].setRotationPoint(-38.7F, -7.5F, 1F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F); // Box 403
		bodyModel[434].setRotationPoint(-38.7F, -7.5F, 0F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[435].setRotationPoint(-38.7F, -5.5F, 1F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[436].setRotationPoint(-38.7F, -4.5F, 0F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 489
		bodyModel[437].setRotationPoint(-38.7F, -7.5F, -2F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 490
		bodyModel[438].setRotationPoint(-38.7F, -7.5F, -2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 491
		bodyModel[439].setRotationPoint(-38.7F, -5.5F, -2F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.15F, -0.85F, 0F, -0.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[440].setRotationPoint(-38.7F, -4.5F, -2F);

		bodyModel[441].addShapeBox(0F, -1F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight small top
		bodyModel[441].setRotationPoint(-37.94F, -5.5F, 0F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, -0.5F, 0.005F, -0.5F, -0.5F, 0.005F, -0.5F, 0F, -0.005F, -0.5F, 0F, 0.202F, 0F, -1F, -0.202F, 0F, -1F, -0.202F, 0F, 0F, 0.202F, 0F, 0F); // Box 430
		bodyModel[442].setRotationPoint(-38.03F, -7.5F, 1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 430
		bodyModel[443].setRotationPoint(-37.89F, -8F, 1F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[444].setRotationPoint(-38.02F, -8F, 0F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0.005F, -0.5F, -0.5F, -0.005F, -0.5F, -0.5F, 0.202F, 0F, 0F, -0.202F, 0F, 0F, -0.202F, 0F, -1F, 0.202F, 0F, -1F); // Box 528
		bodyModel[445].setRotationPoint(-38.03F, -7.5F, -2F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.005F, 0F, 0F, 0.005F, 0F, 0F, 0.005F, 0F, 0F, -0.005F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, -0.135F, 0F, 0F, 0.135F, 0F, 0F); // Box 529
		bodyModel[446].setRotationPoint(-37.89F, -8F, -2F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.135F, 0F, 0F, 0.135F, 0F, 0F, 0.135F, 0F, 0F, -0.135F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.07F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 530
		bodyModel[447].setRotationPoint(-38.02F, -8F, -1F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 531
		bodyModel[448].setRotationPoint(-38.44F, -4F, -2F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.07F, -0.5F, 0F, 0.145F, 0F, 0F, -0.145F, 0F, 0F, -0.145F, 0F, 0F, 0.145F, 0F, 0F); // Box 532
		bodyModel[449].setRotationPoint(-38.44F, -4F, -1F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[450].setRotationPoint(-37.49F, -7.5F, 0F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[451].setRotationPoint(-37.49F, -7.5F, -2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.96F, -0.5F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[452].setRotationPoint(-37.49F, -5.5F, -2F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406
		bodyModel[453].setRotationPoint(-37.49F, -5.5F, 0F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[454].setRotationPoint(-39F, -3F, -2F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[455].setRotationPoint(-39.7F, -7F, 3F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.97F, 0F, 0F, 0.97F, 0F, 0F, 0.97F, 0F, 0F, -0.97F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[456].setRotationPoint(-39.7F, -7F, -3F);

		bodyModel[457].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight R type 1
		bodyModel[457].setRotationPoint(-33.95F, -7.75F, 10.69F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.245F, -0.32F, 0F, -0.99F, -0.32F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0.035F, -0.32F, -0.5F, -0.99F, -0.32F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // Box 216
		bodyModel[458].setRotationPoint(-34.24F, -8.5F, 10F);

		bodyModel[459].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Markerlight L type 1
		bodyModel[459].setRotationPoint(-33.95F, -7.75F, -10.69F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard L type 1
		bodyModel[460].setRotationPoint(-33.25F, -8.25F, -11.04F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // Numberboard R type 1
		bodyModel[461].setRotationPoint(-33.25F, -8.25F, 10.99F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F); // Box 517
		bodyModel[462].setRotationPoint(-35F, -9F, -11F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-1.25F, 0F, -1F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, -2.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -1F, 0F, 0F); // Box 518
		bodyModel[463].setRotationPoint(-37.5F, -9F, -8F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.01F, -0.32F, 0F, -0.01F, -0.32F, 0F, -0.99F, 0F, 0F, 0.245F, 0F, -0.5F, -0.01F, -0.32F, -0.5F, -0.01F, -0.32F, -0.5F, -0.95F, 0F, -0.5F, 0.035F); // Box 519
		bodyModel[464].setRotationPoint(-34.24F, -8.5F, -11F);

		bodyModel[465].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, -0.17F, -0.15F, 0F, -0.17F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.17F, -0.41F, -0.125F, -0.17F, -0.4F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 525
		bodyModel[465].setRotationPoint(-36.65F, -9.87F, 7.02F);
		bodyModel[465].rotateAngleY = -0.47298423F;

		bodyModel[466].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.22F, -0.95F, -0.05F, -0.22F, -0.95F, -0.05F, -1.05F, 0F, -0.05F, -1.05F, 0F, -0.175F, -0.22F, -0.95F, -0.175F, -0.22F, -0.95F, -0.175F, -1.05F, 0F, -0.175F, -1.05F); // Numberboard R type 2
		bodyModel[466].setRotationPoint(-36.7F, -9.87F, 7.04F);
		bodyModel[466].rotateAngleY = -0.47298423F;

		bodyModel[467].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, -0.08F, 0F, 0F, -0.15F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.41F, -0.125F, -0.17F, 0F, -0.125F, -0.17F); // Box 524
		bodyModel[467].setRotationPoint(-36.65F, -9.87F, -7.02F);
		bodyModel[467].rotateAngleY = 0.47298423F;

		bodyModel[468].addShapeBox(0F, 0F, -2F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -1.22F, 0F, -0.05F, -1.22F, 0F, -0.175F, -0.05F, -0.95F, -0.175F, -0.05F, -0.95F, -0.175F, -1.22F, 0F, -0.175F, -1.22F); // Numberboard L Type 2
		bodyModel[468].setRotationPoint(-36.7F, -9.87F, -7.04F);
		bodyModel[468].rotateAngleY = 0.47298423F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.375F, 0F, 1F, -0.36F, 0F, -1.84F, -0.36F, 0F, 1.84F, -0.375F, 0F, -1F, -0.375F, -1F, 1F, -0.43F, -0.62F, -1.97F, -0.43F, -0.62F, 1.97F, -0.375F, -1F, -1F); // Box 438
		bodyModel[469].setRotationPoint(-36.51F, -9.88F, 8F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1.13F, 0F, 1.17F, 0.5F, 0F, 0.27F, 0.5F, 0F, -0.27F, -1.13F, 0F, -1.17F, -1.06F, -0.62F, 1.04F, 0.5F, -0.37F, 0F, 0.5F, -0.37F, 0F, -1.06F, -0.62F, -1.04F); // Box 437
		bodyModel[470].setRotationPoint(-35F, -9.88F, 11.01F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0.27F, 0.08F, 0F, 0.35F, 0.08F, 0F, -0.35F, 0F, 0F, -0.27F, 0F, -0.37F, 0F, 0.19F, -0.12F, 0F, 0.19F, -0.12F, 0F, 0F, -0.37F, 0F); // Box 60
		bodyModel[471].setRotationPoint(-31.5F, -9.88F, 11.01F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1.13F, 0F, -1.17F, 0.5F, 0F, -0.27F, 0.5F, 0F, 0.27F, -1.13F, 0F, 1.17F, -1.06F, -0.62F, -1.04F, 0.5F, -0.37F, 0F, 0.5F, -0.37F, 0F, -1.06F, -0.62F, 1.04F); // Box 532
		bodyModel[472].setRotationPoint(-35F, -9.88F, -11.01F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, -0.27F, 0.08F, 0F, -0.35F, 0.08F, 0F, 0.35F, 0F, 0F, 0.27F, 0F, -0.37F, 0F, 0.19F, -0.12F, 0F, 0.19F, -0.12F, 0F, 0F, -0.37F, 0F); // Box 533
		bodyModel[473].setRotationPoint(-31.5F, -9.88F, -11.01F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[474].setRotationPoint(-23.5F, -23F, -1F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[475].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[476].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[477].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[478].setRotationPoint(-23.5F, -23.5F, -1F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[479].setRotationPoint(-26.5F, -20.75F, 3.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[480].setRotationPoint(-28.5F, -21.75F, 3.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[481].setRotationPoint(-27.5F, -21.75F, 4.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[482].setRotationPoint(-28F, -21.75F, 2.5F);

		bodyModel[483].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 353 markerlight
		bodyModel[483].setRotationPoint(-36.72F, -6F, 7.02F);
		bodyModel[483].rotateAngleY = -0.47298423F;

		bodyModel[484].addShapeBox(-0.79F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F); // Box 545 markerlight
		bodyModel[484].setRotationPoint(-36.72F, -6F, -7.02F);
		bodyModel[484].rotateAngleY = 0.47298423F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[485].setRotationPoint(-27F, -20.5F, 6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[486].setRotationPoint(-27F, -21F, 6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[487].setRotationPoint(-27F, -21F, 6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[488].setRotationPoint(-27F, -21F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[489].setRotationPoint(-27F, -21F, 6F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 cull
		bodyModel[490].setRotationPoint(-27F, -19.5F, 5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, -0.3F, 0F, 0F); // Box 497
		bodyModel[491].setRotationPoint(-35.6F, 2F, 10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 497
		bodyModel[492].setRotationPoint(-36.2F, 2F, 8F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[493].setRotationPoint(-35.6F, 2F, -11F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[494].setRotationPoint(-36.2F, 2F, -10F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-1.2F, 0F, 0F, 0.7F, 0F, 0F, -2.6F, 0F, 0F, 2.1F, 0F, 0F, -1.7F, 0F, 0F, 0.7F, 0F, 0F, -2F, 0F, 0F, 1.6F, 0F, 0F); // Box 560
		bodyModel[495].setRotationPoint(-38F, 2F, -11F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,-1.2F, 0F, 0F, 1.2F, 0F, 0F, -2.1F, 0F, 0F, 2.1F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, -3.1F, 0F, 0F, 3.1F, 0F, 0F); // Box 564
		bodyModel[496].setRotationPoint(-37.5F, 6F, -11F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 ditchlight front a
		bodyModel[497].setRotationPoint(-39.75F, -0.25F, -6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[498].setRotationPoint(-39F, -0.25F, -6F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 ditchlight front a
		bodyModel[499].setRotationPoint(-39.75F, -0.25F, 4F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 7, 138, textureX, textureY); // Box 446
		bodyModel[501] = new ModelRendererTurbo(this, 1, 140, textureX, textureY); // Box 446
		bodyModel[502] = new ModelRendererTurbo(this, 81, 140, textureX, textureY); // Box 572
		bodyModel[503] = new ModelRendererTurbo(this, 17, 178, textureX, textureY); // Box 0
		bodyModel[504] = new ModelRendererTurbo(this, 69, 178, textureX, textureY); // Box 573
		bodyModel[505] = new ModelRendererTurbo(this, 276, 123, textureX, textureY); // Box 574
		bodyModel[506] = new ModelRendererTurbo(this, 148, 178, textureX, textureY); // Box 554
		bodyModel[507] = new ModelRendererTurbo(this, 95, 164, textureX, textureY); // Box 576
		bodyModel[508] = new ModelRendererTurbo(this, 109, 174, textureX, textureY); // Box 577
		bodyModel[509] = new ModelRendererTurbo(this, 95, 178, textureX, textureY); // Box 578
		bodyModel[510] = new ModelRendererTurbo(this, 73, 76, textureX, textureY); // Box 579
		bodyModel[511] = new ModelRendererTurbo(this, 3, 101, textureX, textureY); // Box 60
		bodyModel[512] = new ModelRendererTurbo(this, 1, 109, textureX, textureY); // Box 437
		bodyModel[513] = new ModelRendererTurbo(this, 72, 118, textureX, textureY); // Box 554
		bodyModel[514] = new ModelRendererTurbo(this, 61, 126, textureX, textureY); // Box 555
		bodyModel[515] = new ModelRendererTurbo(this, 77, 114, textureX, textureY); // Box 556
		bodyModel[516] = new ModelRendererTurbo(this, 73, 122, textureX, textureY); // Box 557
		bodyModel[517] = new ModelRendererTurbo(this, 76, 101, textureX, textureY); // Box 558
		bodyModel[518] = new ModelRendererTurbo(this, 76, 109, textureX, textureY); // Box 559
		bodyModel[519] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 560
		bodyModel[520] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 561
		bodyModel[521] = new ModelRendererTurbo(this, 4, 82, textureX, textureY); // Box 562
		bodyModel[522] = new ModelRendererTurbo(this, 64, 71, textureX, textureY); // Box 563
		bodyModel[523] = new ModelRendererTurbo(this, 62, 65, textureX, textureY); // Box 564
		bodyModel[524] = new ModelRendererTurbo(this, 63, 81, textureX, textureY); // Box 565
		bodyModel[525] = new ModelRendererTurbo(this, 63, 88, textureX, textureY); // Box 566
		bodyModel[526] = new ModelRendererTurbo(this, 64, 85, textureX, textureY); // Box 567
		bodyModel[527] = new ModelRendererTurbo(this, 63, 134, textureX, textureY); // Box 0
		bodyModel[528] = new ModelRendererTurbo(this, 57, 138, textureX, textureY, "lamp"); // Box 0 glow
		bodyModel[529] = new ModelRendererTurbo(this, 494, 60, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Box 567
		bodyModel[531] = new ModelRendererTurbo(this, 139, 97, textureX, textureY); // Box 532
		bodyModel[532] = new ModelRendererTurbo(this, 146, 97, textureX, textureY); // Box 533
		bodyModel[533] = new ModelRendererTurbo(this, 129, 86, textureX, textureY); // Box 529
		bodyModel[534] = new ModelRendererTurbo(this, 128, 98, textureX, textureY); // Box 554
		bodyModel[535] = new ModelRendererTurbo(this, 126, 88, textureX, textureY); // Box 554
		bodyModel[536] = new ModelRendererTurbo(this, 126, 93, textureX, textureY); // Box 554
		bodyModel[537] = new ModelRendererTurbo(this, 82, 86, textureX, textureY); // Box 545
		bodyModel[538] = new ModelRendererTurbo(this, 81, 98, textureX, textureY); // Box 546
		bodyModel[539] = new ModelRendererTurbo(this, 79, 88, textureX, textureY); // Box 547
		bodyModel[540] = new ModelRendererTurbo(this, 79, 93, textureX, textureY); // Box 548
		bodyModel[541] = new ModelRendererTurbo(this, 111, 95, textureX, textureY); // Box 555
		bodyModel[542] = new ModelRendererTurbo(this, 127, 79, textureX, textureY); // Box 445
		bodyModel[543] = new ModelRendererTurbo(this, 109, 88, textureX, textureY); // Box 555
		bodyModel[544] = new ModelRendererTurbo(this, 109, 81, textureX, textureY); // Box 555
		bodyModel[545] = new ModelRendererTurbo(this, 80, 79, textureX, textureY); // Box 572
		bodyModel[546] = new ModelRendererTurbo(this, 92, 88, textureX, textureY); // Box 573
		bodyModel[547] = new ModelRendererTurbo(this, 92, 81, textureX, textureY); // Box 574
		bodyModel[548] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 585
		bodyModel[549] = new ModelRendererTurbo(this, 82, 118, textureX, textureY); // Box 529
		bodyModel[550] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 480
		bodyModel[551] = new ModelRendererTurbo(this, 117, 81, textureX, textureY); // Box 480
		bodyModel[552] = new ModelRendererTurbo(this, 107, 81, textureX, textureY); // Box 481
		bodyModel[553] = new ModelRendererTurbo(this, 100, 81, textureX, textureY); // Box 557
		bodyModel[554] = new ModelRendererTurbo(this, 90, 81, textureX, textureY); // Box 559
		bodyModel[555] = new ModelRendererTurbo(this, 148, 95, textureX, textureY); // Box 533
		bodyModel[556] = new ModelRendererTurbo(this, 72, 97, textureX, textureY); // Box 563
		bodyModel[557] = new ModelRendererTurbo(this, 67, 97, textureX, textureY); // Box 564
		bodyModel[558] = new ModelRendererTurbo(this, 88, 81, textureX, textureY); // Box 565
		bodyModel[559] = new ModelRendererTurbo(this, 67, 95, textureX, textureY); // Box 566
		bodyModel[560] = new ModelRendererTurbo(this, 117, 111, textureX, textureY); // Box 88
		bodyModel[561] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 88
		bodyModel[562] = new ModelRendererTurbo(this, 115, 108, textureX, textureY); // Box 88
		bodyModel[563] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 88

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[500].setRotationPoint(-39F, -0.25F, 4F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446
		bodyModel[501].setRotationPoint(-38.25F, -0.75F, 3.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 572
		bodyModel[502].setRotationPoint(-38.25F, -0.75F, -6.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		bodyModel[503].setRotationPoint(-34F, 6F, 10.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 573
		bodyModel[504].setRotationPoint(-34F, 6F, -10.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[505].setRotationPoint(-40F, 1F, -3F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-3.3F, 0F, 0F, 3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, 3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[506].setRotationPoint(-39.6F, 2F, -11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,2.1F, 0F, 0F, -2.6F, 0F, 0F, 0.7F, 0F, 0F, -1.2F, 0F, 0F, 1.6F, 0F, 0F, -2F, 0F, 0F, 0.7F, 0F, 0F, -1.7F, 0F, 0F); // Box 576
		bodyModel[507].setRotationPoint(-38F, 2F, 0F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,2.1F, 0F, 0F, -2.1F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 3.1F, 0F, 0F, -3.1F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 577
		bodyModel[508].setRotationPoint(-37.5F, 6F, 0F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3.3F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.3F, 0F, 0F, -3.3F, 0F, 0F); // Box 578
		bodyModel[509].setRotationPoint(-39.6F, 2F, 0F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 579
		bodyModel[510].setRotationPoint(-23.5F, -20F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.55F, 0F, -0.15F, 0.48F, 0F, 0.19F, -2F, -2F, 0F, -1.75F, -2F, 0F, 1F, 0F, -0.9F, 1F, 0F, 0.19F, 1F, -2F, 0F, 1F, -2F); // Box 60
		bodyModel[511].setRotationPoint(-31.5F, -11F, 10F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.45F, 0F, 0.81F, 0.5F, -0.1F, 0F, 0.5F, -2.4F, -2F, -1.06F, -2.15F, -3.03F, -1.45F, 1.65F, 0.82F, 0.5F, 1.65F, 0F, 0.5F, 1.65F, -2F, -1F, 1.65F, -3F); // Box 437
		bodyModel[512].setRotationPoint(-35F, -11.65F, 10F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.375F, -1.875F, -2F, -0.44F, -2.25F, 0.97F, -0.05F, -0.1F, -3.19F, -1.525F, 0.125F, -1F, -0.25F, 1.75F, -2F, -0.5F, 1.75F, 1F, -0.05F, 1.75F, -3.19F, -1.525F, 1.75F, -1F); // Box 554
		bodyModel[513].setRotationPoint(-36.5F, -11.75F, -9F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1F, 1.525F, 0F, -0.1175F, 1.525F, 0F); // Box 555
		bodyModel[514].setRotationPoint(-37.75F, -12.4F, -7F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.42F, -0.35F, 0.19F, 0.42F, -0.35F, 0.19F, 0.42F, -0.0015F, 0F, 0.005F, -0.125F, 0F, -1.42F, 0.35F, 0.19F, 0.42F, 0.35F, 0.19F, 0.42F, 0.0015F, 0F, 0.005F, 0.1265F, 0F); // Box 556
		bodyModel[515].setRotationPoint(-34.97F, -12F, -9F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.545F, -0.445F, -0.5F, -0.455F, -0.445F, -0.5F, -0.455F, -0.005F, 0F, 0F, -0.0935F, 0F, -0.545F, 0.445F, -0.5F, -0.455F, 0.445F, -0.5F, -0.455F, 0.004F, 0F, 0F, 0.0935F, 0F); // Box 557
		bodyModel[516].setRotationPoint(-35.52F, -12.32F, -7.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1.75F, -2F, 0.19F, -2F, -2F, -0.15F, 0.48F, 0F, 0F, 0.55F, 0F, 0F, 1F, -2F, 0.19F, 1F, -2F, -0.9F, 1F, 0F, 0F, 1F, 0F); // Box 558
		bodyModel[517].setRotationPoint(-31.5F, -11F, -13F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.06F, -2.15F, -3.03F, 0.5F, -2.4F, -2F, 0.5F, -0.1F, 0F, -1.45F, 0F, 0.81F, -1F, 1.65F, -3F, 0.5F, 1.65F, -2F, 0.5F, 1.65F, 0F, -1.45F, 1.65F, 0.82F); // Box 559
		bodyModel[518].setRotationPoint(-35F, -11.65F, -13F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[519].setRotationPoint(-29.15F, -20F, -4F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.6F, -1.5F, 0F, 0.65F, -1.5F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -0.6F, 1.5F, 0F, 0.65F, 1.5F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[520].setRotationPoint(-28.8F, -20F, -9.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.05F, -0.5F, -0.5F, 0.05F, -0.5F, -0.5F, 0.05F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0.125F, -0.5F, 0.05F, 0.125F, -0.5F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[521].setRotationPoint(-28.2F, -18.5F, -10.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, -0.715F, 0F, 0F, 0.535F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.675F, 0F, 0F); // Box 563
		bodyModel[522].setRotationPoint(-24.5F, -22F, -3.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.715F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 564
		bodyModel[523].setRotationPoint(-24.5F, -22F, -2.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.555F, -1F, 0F, 0F, -1F, 0F, 0F, -0.335F, 0F, -1F, -0.335F, 0F, 0.175F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 0F, 0.325F, 0.75F, 0F); // Box 565
		bodyModel[524].setRotationPoint(-24.5F, -21F, -8.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, -0.5F, -0.335F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0.105F, -1.5F, -0.5F); // Box 566
		bodyModel[525].setRotationPoint(-24.5F, -19F, -11F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.335F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.555F, 0F, 0F, 0.105F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.175F, 0.25F, 0F); // Box 567
		bodyModel[526].setRotationPoint(-24.5F, -20F, -9.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[527].setRotationPoint(-39.25F, -2F, -1.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, -0.95F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 0 glow
		bodyModel[528].setRotationPoint(-39.3F, -2F, -1.5F);

		bodyModel[529].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[529].setRotationPoint(38.5F, -13F, 3.5F);

		bodyModel[530].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[530].setRotationPoint(38.5F, -13F, -3.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1.31F, 0F, -1.1F, 0.5F, 0F, -0.2675F, 0.5F, 0F, 0.2675F, -1.31F, 0F, 1.1F, -1.13F, 0F, -0.73F, 0.5F, 0F, 0.17F, 0.5F, 0F, -0.17F, -1.13F, 0F, 0.73F); // Box 532
		bodyModel[531].setRotationPoint(-35F, -10.88F, -10.57F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, -0.3975F, -0.04F, 0F, -0.445F, -0.04F, 0F, 0.445F, 0F, 0F, 0.3975F, 0F, 0F, 0.04F, 0.08F, 0F, -0.04F, 0.08F, 0F, 0.04F, 0F, 0F, -0.04F); // Box 533
		bodyModel[532].setRotationPoint(-31.5F, -10.88F, -10.7F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.955F, 0F, -0.63F, -0.18F, 0F, 1.84F, -0.18F, 0F, -1.84F, -0.955F, 0F, 0.63F, -0.375F, 0F, -0.63F, -0.36F, 0F, 2.21F, -0.36F, 0F, -2.21F, -0.375F, 0F, 0.63F); // Box 529
		bodyModel[533].setRotationPoint(-36.51F, -10.88F, -7.63F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.375F, -1.875F, -2F, -0.44F, -2.25F, 0.97F, -0.05F, -2.25F, -1.19F, -1.525F, -1.875F, 1F, -0.25F, 1.75F, -2F, -0.5F, 1.75F, 1F, -0.05F, 1.75F, -1.19F, -1.525F, 1.75F, 1F); // Box 554
		bodyModel[534].setRotationPoint(-36.5F, -11.75F, -9F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.55F, -2.25F, 0.95F, -0.44F, -2.25F, 0.97F, -0.05F, -0.1F, -3.19F, -1.525F, 0.125F, -1F, -2.55F, 1.25F, 0.95F, -0.44F, 1.25F, 0.97F, -0.05F, 1.25F, -3.19F, -2.55F, 1.25F, -3.95F); // Box 554
		bodyModel[535].setRotationPoint(-36.5F, -11.75F, -9F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.375F, -1.875F, -2F, -0.44F, -2.25F, 0.97F, -1.475F, 0.125F, -1F, -1.525F, 0.125F, -1F, -0.375F, 0.875F, -2F, -0.44F, 1.25F, 0.97F, -0.05F, 1.25F, -3.19F, -1.525F, 0.875F, -1F); // Box 554
		bodyModel[536].setRotationPoint(-36.5F, -11.75F, -9F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.955F, 0F, 0.63F, -0.18F, 0F, -1.84F, -0.18F, 0F, 1.84F, -0.955F, 0F, -0.63F, -0.375F, 0F, 0.63F, -0.36F, 0F, -2.21F, -0.36F, 0F, 2.21F, -0.375F, 0F, -0.63F); // Box 545
		bodyModel[537].setRotationPoint(-36.51F, -10.88F, 7.63F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.525F, -1.875F, 1F, -0.05F, -2.25F, -1.19F, -0.44F, -2.25F, 0.97F, -0.375F, -1.875F, -2F, -1.525F, 1.75F, 1F, -0.05F, 1.75F, -1.19F, -0.5F, 1.75F, 1F, -0.25F, 1.75F, -2F); // Box 546
		bodyModel[538].setRotationPoint(-36.5F, -11.75F, 8F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.525F, 0.125F, -1F, -0.05F, -0.1F, -3.19F, -0.44F, -2.25F, 0.97F, -2.55F, -2.25F, 0.95F, -2.95F, 1.25F, -3.19F, -0.05F, 1.25F, -3.19F, -0.44F, 1.25F, 0.97F, -2.55F, 1.25F, 0.95F); // Box 547
		bodyModel[539].setRotationPoint(-36.5F, -11.75F, 6F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.525F, 0.125F, -1F, -1.475F, 0.125F, -1F, -0.44F, -2.25F, 0.97F, -0.375F, -1.875F, -2F, -1.525F, 0.875F, -1F, -0.05F, 1.25F, -3.19F, -0.44F, 1.25F, 0.97F, -0.375F, 0.875F, -2F); // Box 548
		bodyModel[540].setRotationPoint(-36.5F, -11.75F, 6F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.625F, -1.525F, 0F, 0.775F, -1.525F, 0F, 0F, -0.9F, 0F, 0.8F, -0.9F, 0F, -0.625F, 0.525F, 0F, 0.775F, 0.525F, 0F, 0F, 0.525F, 0F, 0.8825F, 0.525F, 0F); // Box 555
		bodyModel[541].setRotationPoint(-36.75F, -11.4F, -7F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-1.695F, 0F, 0F, 1.695F, 0F, 0F, 0.065F, 0F, 0F, -0.065F, 0F, 0F, -1.115F, 0F, 0F, 1.115F, 0F, 0F, -0.31F, -0.61F, 0F, 0.31F, -0.61F, 0F); // Box 445
		bodyModel[542].setRotationPoint(-37.25F, -10.88F, -7F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.625F, -2.525F, 0F, -1F, -0.025F, -5F, -1F, -0.025F, 0F, -0.2F, -1.9F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1F, 0.9F, 0F, -0.2F, 0.9F, 0F); // Box 555
		bodyModel[543].setRotationPoint(-37.75F, -12.4F, -7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.625F, -2.525F, 0F, -0.225F, -0.525F, 0F, -1F, -0.025F, 0F, -2F, -0.025F, 0F, -1.625F, 1.525F, 0F, -0.225F, 1.525F, 0F, -1F, -0.975F, 0F, -2F, -0.975F, 0F); // Box 555
		bodyModel[544].setRotationPoint(-37.75F, -12.4F, -7F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-0.065F, 0F, 0F, 0.065F, 0F, 0F, 1.695F, 0F, 0F, -1.695F, 0F, 0F, 0.31F, -0.61F, 0F, -0.31F, -0.61F, 0F, 1.115F, 0F, 0F, -1.115F, 0F, 0F); // Box 572
		bodyModel[545].setRotationPoint(-37.25F, -10.88F, 2F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.2F, -1.9F, 0F, -1F, -0.025F, 0F, -1F, -0.025F, -5F, -1.625F, -2.525F, 0F, -0.2F, 0.9F, 0F, -1F, 0.9F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F); // Box 573
		bodyModel[546].setRotationPoint(-37.75F, -12.4F, 2F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-2F, -0.025F, 0F, -1F, -0.025F, 0F, -0.225F, -0.525F, 0F, -1.625F, -2.525F, 0F, -2F, -0.975F, 0F, -1F, -0.975F, 0F, -0.225F, 1.525F, 0F, -1.625F, 1.525F, 0F); // Box 574
		bodyModel[547].setRotationPoint(-37.75F, -12.4F, 2F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.8F, -0.9F, 0F, 0F, -0.9F, 0F, 0.775F, -1.525F, 0F, -0.625F, -1.525F, 0F, 0.8825F, 0.525F, 0F, 0F, 0.525F, 0F, 0.775F, 0.525F, 0F, -0.625F, 0.525F, 0F); // Box 585
		bodyModel[548].setRotationPoint(-36.75F, -11.4F, 2F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.375F, 0F, -1F, -0.36F, 0F, 1.84F, -0.36F, 0F, -1.84F, -0.375F, 0F, 1F, -0.375F, -1F, -1F, -0.43F, -0.62F, 1.97F, -0.43F, -0.62F, -1.97F, -0.375F, -1F, 1F); // Box 529
		bodyModel[549].setRotationPoint(-36.51F, -9.88F, -8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -1.575F, 0F, 0F, -1.615F, 0F, -0.3F, -0.875F, -0.025F, 0.3F, -0.835F, -0.025F, 0F, 1.575F, 0F, 0F, 1.615F, 0F, -0.3F, 0.875F, -0.025F, 0.3F, 0.835F, -0.025F); // Box 480
		bodyModel[550].setRotationPoint(-30.65F, -13.1F, -10F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.45F, -0.835F, -0.475F, -0.45F, -0.875F, -0.475F, -0.8F, 0.01F, 0F, -0.2F, 0.01F, 0F, 0.45F, 0.835F, -0.475F, -0.45F, 0.875F, -0.475F, -0.8F, -0.01F, 0F, -0.2F, -0.01F, 0F); // Box 480
		bodyModel[551].setRotationPoint(-30.5F, -13.1F, -7.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.45F, -0.835F, -0.475F, -1.45F, -0.835F, -0.475F, -0.8F, 0.01F, 0F, 0.8F, -0.16F, 0F, 0.45F, 0.835F, -0.475F, -1.45F, 0.835F, -0.475F, -0.8F, -0.01F, 0F, 0.8F, 0.16F, 0F); // Box 481
		bodyModel[552].setRotationPoint(-30.5F, -13.1F, -7.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.8F, -0.16F, 0F, -0.8F, 0.01F, 0F, -1.45F, -0.835F, -0.475F, 0.45F, -0.835F, -0.475F, 0.8F, 0.16F, 0F, -0.8F, -0.01F, 0F, -1.45F, 0.835F, -0.475F, 0.45F, 0.835F, -0.475F); // Box 557
		bodyModel[553].setRotationPoint(-30.5F, -13.1F, 3.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.2F, 0.01F, 0F, -0.8F, 0.01F, 0F, -0.45F, -0.875F, -0.475F, 0.45F, -0.835F, -0.475F, -0.2F, -0.01F, 0F, -0.8F, -0.01F, 0F, -0.45F, 0.875F, -0.475F, 0.45F, 0.835F, -0.475F); // Box 559
		bodyModel[554].setRotationPoint(-30.5F, -13.1F, 3.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.025F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0.025F, 0.25F, -0.1325F, -0.38F, 0.0285F, 0.1F, -0.38F, 0.005F, 0.1F, -0.38F, -0.005F, -0.1325F, -0.38F, -0.0285F); // Box 533
		bodyModel[555].setRotationPoint(-30.65F, -11.5F, -10.25F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1.31F, 0F, 1.1F, 0.5F, 0F, 0.2675F, 0.5F, 0F, -0.2675F, -1.31F, 0F, -1.1F, -1.13F, 0F, 0.73F, 0.5F, 0F, -0.17F, 0.5F, 0F, 0.17F, -1.13F, 0F, -0.73F); // Box 563
		bodyModel[556].setRotationPoint(-35F, -10.88F, 10.57F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0.3975F, -0.04F, 0F, 0.445F, -0.04F, 0F, -0.445F, 0F, 0F, -0.3975F, 0F, 0F, -0.04F, 0.08F, 0F, 0.04F, 0.08F, 0F, -0.04F, 0F, 0F, 0.04F); // Box 564
		bodyModel[557].setRotationPoint(-31.5F, -10.88F, 10.7F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.3F, -0.835F, -0.025F, -0.3F, -0.875F, -0.025F, 0F, -1.615F, 0F, 0F, -1.575F, 0F, 0.3F, 0.835F, -0.025F, -0.3F, 0.875F, -0.025F, 0F, 1.615F, 0F, 0F, 1.575F, 0F); // Box 565
		bodyModel[558].setRotationPoint(-30.65F, -13.1F, 7F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.025F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.025F, -0.25F, -0.1325F, -0.38F, -0.0285F, 0.1F, -0.38F, -0.005F, 0.1F, -0.38F, 0.005F, -0.1325F, -0.38F, 0.0285F); // Box 566
		bodyModel[559].setRotationPoint(-30.65F, -11.5F, 10.25F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[560].setRotationPoint(-33.75F, -13.25F, -0.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[561].setRotationPoint(-35.75F, -14.25F, -0.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[562].setRotationPoint(-34.75F, -14.25F, -1.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[563].setRotationPoint(-35.25F, -14.25F, 0.5F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.22, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.17, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}