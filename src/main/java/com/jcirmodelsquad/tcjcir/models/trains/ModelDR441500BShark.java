//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 23:40:24
// Last changed on: 21.08.2020 - 23:40:24

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
import train.common.enums.BoxName;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelDR441500BShark extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDR441500BShark() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[267];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 347, 127, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 294, 88, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 446, 127, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 296, 113, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 303, 139, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 423, 149, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 347, 154, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 442, 61, textureX, textureY); // Box 120
		bodyModel[9] = new ModelRendererTurbo(this, 441, 29, textureX, textureY); // Box 481
		bodyModel[10] = new ModelRendererTurbo(this, 250, 133, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 493, 87, textureX, textureY); // Box 120
		bodyModel[12] = new ModelRendererTurbo(this, 467, 87, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 445, 151, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 298, 127, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 325, 139, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 325, 129, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 263, 127, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 282, 127, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 325, 61, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 325, 54, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 325, 19, textureX, textureY); // Box 62
		bodyModel[25] = new ModelRendererTurbo(this, 325, 12, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 456, 23, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 428, 61, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Rear side door L
		bodyModel[29] = new ModelRendererTurbo(this, 450, 25, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 438, 25, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 451, 53, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 439, 53, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 477, 27, textureX, textureY); // Rear door
		bodyModel[34] = new ModelRendererTurbo(this, 488, 24, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 460, 10, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 477, 13, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 488, 10, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 453, 15, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 505, 15, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 75, 76, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 75, 50, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 71, 61, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 70, 68, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 88
		bodyModel[45] = new ModelRendererTurbo(this, 493, 68, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 471, 88, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 471, 47, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 463, 68, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 470, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[50] = new ModelRendererTurbo(this, 475, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[51] = new ModelRendererTurbo(this, 489, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[52] = new ModelRendererTurbo(this, 484, 54, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[53] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 489, 100, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 99
		bodyModel[56] = new ModelRendererTurbo(this, 476, 2, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 461, 1, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 143, 193, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 160, 217, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 148, 181, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 150, 188, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 150, 176, textureX, textureY); // Box 138
		bodyModel[64] = new ModelRendererTurbo(this, 505, 69, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 451, 69, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 500, 69, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 458, 69, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 473, 67, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 471, 60, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 482, 60, textureX, textureY); // Box 153
		bodyModel[71] = new ModelRendererTurbo(this, 479, 59, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 470, 76, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 505, 50, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[74] = new ModelRendererTurbo(this, 167, 45, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 165, 40, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 167, 11, textureX, textureY); // Box 169
		bodyModel[78] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 170
		bodyModel[79] = new ModelRendererTurbo(this, 168, 9, textureX, textureY); // Box 171
		bodyModel[80] = new ModelRendererTurbo(this, 310, 61, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 272, 44, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 145, 24, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 151, 35, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 151, 19, textureX, textureY); // Box 182
		bodyModel[85] = new ModelRendererTurbo(this, 108, 27, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 95, 23, textureX, textureY); // Box 0 exhaust
		bodyModel[87] = new ModelRendererTurbo(this, 202, 5, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 91, 27, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 94, 33, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 68, 24, textureX, textureY); // Box 88
		bodyModel[91] = new ModelRendererTurbo(this, 64, 27, textureX, textureY); // Box 88
		bodyModel[92] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 378
		bodyModel[93] = new ModelRendererTurbo(this, 68, 38, textureX, textureY); // Box 378
		bodyModel[94] = new ModelRendererTurbo(this, 380, 193, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 385, 205, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 382, 186, textureX, textureY); // Box 394
		bodyModel[97] = new ModelRendererTurbo(this, 421, 186, textureX, textureY); // Box 394
		bodyModel[98] = new ModelRendererTurbo(this, 318, 216, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 326, 196, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 340, 204, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 343, 204, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 346, 204, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 352, 204, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 355, 204, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 358, 204, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 286, 184, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 297, 187, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 323, 210, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 308, 184, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 330, 184, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 341, 187, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 352, 184, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 295, 174, textureX, textureY); // Box 394
		bodyModel[118] = new ModelRendererTurbo(this, 304, 170, textureX, textureY); // Box 394
		bodyModel[119] = new ModelRendererTurbo(this, 351, 179, textureX, textureY); // Box 394
		bodyModel[120] = new ModelRendererTurbo(this, 381, 224, textureX, textureY); // Box 394
		bodyModel[121] = new ModelRendererTurbo(this, 383, 222, textureX, textureY); // Box 394
		bodyModel[122] = new ModelRendererTurbo(this, 383, 215, textureX, textureY); // Box 394
		bodyModel[123] = new ModelRendererTurbo(this, 406, 223, textureX, textureY); // Box 394
		bodyModel[124] = new ModelRendererTurbo(this, 407, 220, textureX, textureY); // Box 394
		bodyModel[125] = new ModelRendererTurbo(this, 407, 212, textureX, textureY); // Box 394
		bodyModel[126] = new ModelRendererTurbo(this, 396, 225, textureX, textureY); // Box 394
		bodyModel[127] = new ModelRendererTurbo(this, 422, 210, textureX, textureY); // Box 169
		bodyModel[128] = new ModelRendererTurbo(this, 437, 233, textureX, textureY); // Box 169
		bodyModel[129] = new ModelRendererTurbo(this, 437, 202, textureX, textureY); // Box 439
		bodyModel[130] = new ModelRendererTurbo(this, 434, 185, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 433, 176, textureX, textureY); // Box 103
		bodyModel[133] = new ModelRendererTurbo(this, 470, 214, textureX, textureY); // Box 394
		bodyModel[134] = new ModelRendererTurbo(this, 470, 188, textureX, textureY); // Box 444
		bodyModel[135] = new ModelRendererTurbo(this, 486, 191, textureX, textureY); // Box 394
		bodyModel[136] = new ModelRendererTurbo(this, 499, 191, textureX, textureY); // Box 394
		bodyModel[137] = new ModelRendererTurbo(this, 501, 200, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 481, 176, textureX, textureY); // Box 394
		bodyModel[139] = new ModelRendererTurbo(this, 488, 212, textureX, textureY); // Box 394
		bodyModel[140] = new ModelRendererTurbo(this, 484, 200, textureX, textureY); // Box 394
		bodyModel[141] = new ModelRendererTurbo(this, 263, 213, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 244, 212, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 282, 212, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 244, 203, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 282, 203, textureX, textureY); // Box 691
		bodyModel[146] = new ModelRendererTurbo(this, 205, 229, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 309, 225, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 204, 222, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 206, 212, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 208, 218, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 208, 208, textureX, textureY); // Box 757
		bodyModel[152] = new ModelRendererTurbo(this, 197, 215, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 199, 209, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 190, 215, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 265, 171, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 266, 203, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 267, 208, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 228, 221, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 235, 214, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 194, 211, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 195, 223, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 235, 220, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 219, 220, textureX, textureY); // Box 471
		bodyModel[165] = new ModelRendererTurbo(this, 231, 207, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 222, 209, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 215, 202, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 215, 207, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 222, 199, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 265, 184, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 266, 194, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 288, 189, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 244, 221, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 282, 221, textureX, textureY); // Box 486
		bodyModel[177] = new ModelRendererTurbo(this, 279, 193, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 229, 190, textureX, textureY); // Box 394
		bodyModel[179] = new ModelRendererTurbo(this, 244, 192, textureX, textureY); // Box 394
		bodyModel[180] = new ModelRendererTurbo(this, 229, 181, textureX, textureY); // Box 394
		bodyModel[181] = new ModelRendererTurbo(this, 287, 167, textureX, textureY); // Box 394
		bodyModel[182] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 394
		bodyModel[183] = new ModelRendererTurbo(this, 274, 175, textureX, textureY); // Box 394
		bodyModel[184] = new ModelRendererTurbo(this, 495, 50, textureX, textureY, BoxName.lamp); // backing light type 3
		bodyModel[185] = new ModelRendererTurbo(this, 500, 47, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[186] = new ModelRendererTurbo(this, 69, 35, textureX, textureY); // Box 80
		bodyModel[187] = new ModelRendererTurbo(this, 72, 36, textureX, textureY); // Box 80
		bodyModel[188] = new ModelRendererTurbo(this, 272, 2, textureX, textureY); // Box 565
		bodyModel[189] = new ModelRendererTurbo(this, 310, 19, textureX, textureY); // Box 566
		bodyModel[190] = new ModelRendererTurbo(this, 75, 33, textureX, textureY); // Box 88
		bodyModel[191] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 88
		bodyModel[192] = new ModelRendererTurbo(this, 252, 187, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 257, 85, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 271, 61, textureX, textureY); // Box 0
		bodyModel[195] = new ModelRendererTurbo(this, 271, 54, textureX, textureY); // Box 0
		bodyModel[196] = new ModelRendererTurbo(this, 258, 29, textureX, textureY); // Box 563
		bodyModel[197] = new ModelRendererTurbo(this, 259, 71, textureX, textureY); // Box 564
		bodyModel[198] = new ModelRendererTurbo(this, 204, 19, textureX, textureY); // Box 565
		bodyModel[199] = new ModelRendererTurbo(this, 270, 19, textureX, textureY); // Box 566
		bodyModel[200] = new ModelRendererTurbo(this, 270, 23, textureX, textureY); // Front side door R
		bodyModel[201] = new ModelRendererTurbo(this, 268, 67, textureX, textureY); // Box 568
		bodyModel[202] = new ModelRendererTurbo(this, 256, 67, textureX, textureY); // Box 569
		bodyModel[203] = new ModelRendererTurbo(this, 267, 21, textureX, textureY); // Box 570
		bodyModel[204] = new ModelRendererTurbo(this, 255, 21, textureX, textureY); // Box 571
		bodyModel[205] = new ModelRendererTurbo(this, 281, 19, textureX, textureY); // Box 62
		bodyModel[206] = new ModelRendererTurbo(this, 271, 12, textureX, textureY); // Box 63
		bodyModel[207] = new ModelRendererTurbo(this, 124, 217, textureX, textureY); // Box 0
		bodyModel[208] = new ModelRendererTurbo(this, 44, 76, textureX, textureY); // Box 0
		bodyModel[209] = new ModelRendererTurbo(this, 44, 50, textureX, textureY); // Box 82
		bodyModel[210] = new ModelRendererTurbo(this, 40, 61, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 39, 68, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 39, 53, textureX, textureY); // Box 88
		bodyModel[213] = new ModelRendererTurbo(this, 225, 23, textureX, textureY); // Front door
		bodyModel[214] = new ModelRendererTurbo(this, 236, 20, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 237, 6, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 226, 9, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 209, 6, textureX, textureY); // Box 78
		bodyModel[218] = new ModelRendererTurbo(this, 254, 11, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 80
		bodyModel[220] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 201, 2, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 247, 2, textureX, textureY); // Box 103
		bodyModel[223] = new ModelRendererTurbo(this, 242, 46, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[224] = new ModelRendererTurbo(this, 252, 46, textureX, textureY, BoxName.lamp); // backing light type 3
		bodyModel[225] = new ModelRendererTurbo(this, 247, 43, textureX, textureY, BoxName.lamp); // backing light type 1
		bodyModel[226] = new ModelRendererTurbo(this, 211, 78, textureX, textureY); // Box 128
		bodyModel[227] = new ModelRendererTurbo(this, 218, 84, textureX, textureY); // Box 128
		bodyModel[228] = new ModelRendererTurbo(this, 219, 43, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 241, 78, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 237, 50, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[231] = new ModelRendererTurbo(this, 232, 50, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[232] = new ModelRendererTurbo(this, 219, 50, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[233] = new ModelRendererTurbo(this, 224, 50, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[234] = new ModelRendererTurbo(this, 236, 96, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 218, 96, textureX, textureY); // Box 99
		bodyModel[236] = new ModelRendererTurbo(this, 218, 96, textureX, textureY); // Box 99
		bodyModel[237] = new ModelRendererTurbo(this, 199, 79, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 253, 79, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 206, 79, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 248, 79, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 221, 63, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 230, 56, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 219, 56, textureX, textureY); // Box 153
		bodyModel[244] = new ModelRendererTurbo(this, 227, 55, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 218, 72, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 62, 187, textureX, textureY); // Box 394
		bodyModel[247] = new ModelRendererTurbo(this, 101, 189, textureX, textureY); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 80, 34, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 90, 205, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 80, 203, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 80, 30, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 114
		bodyModel[253] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 74
		bodyModel[254] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 78
		bodyModel[255] = new ModelRendererTurbo(this, 115, 211, textureX, textureY); // Box 394
		bodyModel[256] = new ModelRendererTurbo(this, 115, 223, textureX, textureY); // Box 444
		bodyModel[257] = new ModelRendererTurbo(this, 99, 221, textureX, textureY); // Box 394
		bodyModel[258] = new ModelRendererTurbo(this, 83, 212, textureX, textureY); // Box 197
		bodyModel[259] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 120
		bodyModel[260] = new ModelRendererTurbo(this, 215, 97, textureX, textureY); // Box 43
		bodyModel[261] = new ModelRendererTurbo(this, 235, 127, textureX, textureY); // Box 566
		bodyModel[262] = new ModelRendererTurbo(this, 235, 143, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 490, 67, textureX, textureY); // Box 128
		bodyModel[264] = new ModelRendererTurbo(this, 471, 67, textureX, textureY); // Box 567
		bodyModel[265] = new ModelRendererTurbo(this, 218, 76, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 238, 76, textureX, textureY); // Box 567

		bodyModel[0].addBox(0F, 0F, 0F, 15, 6, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[1].setRotationPoint(-29.5F, 0F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(34.5F, 2F, -3.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 70, 1, 12, 0F); // Box 0
		bodyModel[4].setRotationPoint(-34.5F, 2F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[5].setRotationPoint(-22.5F, 2.5F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(19F, 2.5F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[7].setRotationPoint(-7F, 8F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[8].setRotationPoint(31.5F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[9].setRotationPoint(31.5F, 2F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[10].setRotationPoint(-38.5F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[11].setRotationPoint(36.5F, 2F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[12].setRotationPoint(36.5F, 2F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[13].setRotationPoint(20F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(20F, 2.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[15].setRotationPoint(20F, 2.5F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-21.5F, 2.5F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-21.5F, 2.5F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(31.5F, 2F, -3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[20].setRotationPoint(-35.5F, 2F, -3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[21].setRotationPoint(-33.5F, 2F, -3.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 50, 14, 1, 0F); // Box 0
		bodyModel[22].setRotationPoint(-18.5F, -14F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 55, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-18.5F, -19F, -11F);

		bodyModel[24].addBox(0F, 0F, 0F, 55, 14, 1, 0F); // Box 62
		bodyModel[24].setRotationPoint(-18.5F, -14F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 55, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-18.5F, -19F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 14, 9, 0F); // Box 0
		bodyModel[26].setRotationPoint(35.5F, -14F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 0
		bodyModel[27].setRotationPoint(31.5F, -14F, -11F);

		bodyModel[28].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[28].setRotationPoint(35.5F, -12F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[29].setRotationPoint(35.5F, -7F, 11F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(31.5F, -7F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 79
		bodyModel[31].setRotationPoint(36F, -11F, -12F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 80
		bodyModel[32].setRotationPoint(31F, -11F, -12F);

		bodyModel[33].addBox(0F, 0F, -4F, 1, 15, 4, 0F); // Rear door
		bodyModel[33].setRotationPoint(35.5F, -15F, 2F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[34].setRotationPoint(35.5F, -14F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[35].setRotationPoint(35.5F, -19F, -8.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 0
		bodyModel[36].setRotationPoint(35.5F, -19F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[37].setRotationPoint(35.5F, -19F, 1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[38].setRotationPoint(35.5F, -19F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[39].setRotationPoint(35.5F, -19F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-27.5F, -20F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[41].setRotationPoint(-27.5F, -20F, 8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 64, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-27.5F, -22F, -2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(-27.5F, -22F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 64, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[44].setRotationPoint(-27.5F, -22F, 2.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[45].setRotationPoint(36.5F, -17F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[46].setRotationPoint(36.5F, 0F, -5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[47].setRotationPoint(36.5F, -18F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[48].setRotationPoint(36.5F, -17F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[49].setRotationPoint(36.5F, -19F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[50].setRotationPoint(36.5F, -19F, -4F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[51].setRotationPoint(36.5F, -19F, 4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[52].setRotationPoint(36.5F, -19F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[53].setRotationPoint(36.5F, 1F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[54].setRotationPoint(36.5F, 1F, 4F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[55].setRotationPoint(37.5F, 0F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(35.5F, -21F, -2.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(35.5F, -21F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[58].setRotationPoint(35.5F, -21F, 2.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 13, 10, 0F); // Box 0
		bodyModel[59].setRotationPoint(-21.5F, -20F, -5F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 7, 10, 0F); // Box 0
		bodyModel[60].setRotationPoint(-17.5F, -7F, -5F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 0
		bodyModel[61].setRotationPoint(-21.5F, -21F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[62].setRotationPoint(-21.5F, -21F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[63].setRotationPoint(-21.5F, -21F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(38F, -16F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(38F, -16F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[66].setRotationPoint(37.5F, -17F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[67].setRotationPoint(37.5F, -17F, -3.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[68].setRotationPoint(37.5F, -17.5F, -3.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(38F, -19F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[70].setRotationPoint(38F, -19F, 1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(38F, -19F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(38F, -17F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[73].setRotationPoint(36.5F, -9F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[74].setRotationPoint(18.5F, -20F, -9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[75].setRotationPoint(18.5F, -20.5F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[76].setRotationPoint(18.5F, -20F, -9.51F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[77].setRotationPoint(18.5F, -20F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[78].setRotationPoint(18.5F, -20.5F, 5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 171
		bodyModel[79].setRotationPoint(18.5F, -20F, 9.51F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[80].setRotationPoint(-11.5F, -10F, -11.01F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 84, 8, 1, 0F,0F, 0F, -1.2F, -44F, 0F, -1.2F, -44F, 0F, 1.22F, 0F, 0F, 1.22F, 0F, -4F, 0F, -44F, -4F, 0F, -44F, -4F, 0.02F, 0F, -4F, 0.02F); // Box 0
		bodyModel[81].setRotationPoint(-9.5F, -18F, -11.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 24, 0, 10, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5F, 0F, 0F, -5F); // Box 0
		bodyModel[82].setRotationPoint(18.5F, -22.01F, -2.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, -0.65F, 0F, -12F, -0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F, 0F, 0.65F, 0F, -12F, 0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[83].setRotationPoint(18.5F, -22.01F, -4.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, 0F, -2F, -12F, 0F, -2F, -12F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0.65F, 0F, 0F, 0.65F, 0F); // Box 182
		bodyModel[84].setRotationPoint(18.5F, -22.01F, 0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-2.5F, -22.5F, -2F);

		bodyModel[86].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 exhaust
		bodyModel[86].setRotationPoint(-6.5F, -22F, 2.5F);
		bodyModel[86].rotateAngleX = -0.31415927F;

		bodyModel[87].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 0
		bodyModel[87].setRotationPoint(33F, -21.58F, -4.5F);

		bodyModel[88].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 0
		bodyModel[88].setRotationPoint(-8.25F, -20.74F, -6.3F);
		bodyModel[88].rotateAngleX = 0.32288591F;

		bodyModel[89].addShapeBox(0F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[89].setRotationPoint(-8.25F, -20.42F, -7.25F);
		bodyModel[89].rotateAngleX = 0.32288591F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[90].setRotationPoint(-33.5F, -21.62F, 6.8F);
		bodyModel[90].rotateAngleX = -0.32288591F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[91].setRotationPoint(-35.5F, -21.94F, 5.85F);
		bodyModel[91].rotateAngleX = -0.32288591F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[92].setRotationPoint(-33.5F, -21.3F, -7.75F);
		bodyModel[92].rotateAngleX = 0.32288591F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[93].setRotationPoint(-33.5F, -21.62F, -6.8F);
		bodyModel[93].rotateAngleX = 0.32288591F;

		bodyModel[94].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[94].setRotationPoint(-2.5F, -4F, -3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-2.5F, -4F, -5.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[96].setRotationPoint(-2.5F, -4F, 3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[97].setRotationPoint(14.5F, -4F, 3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-2.5F, -13F, -3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[99].setRotationPoint(-1.7F, -15F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-1.4F, -15F, -3.83F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(0.98F, -15F, -3.83F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[102].setRotationPoint(3.36F, -15F, -3.83F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[103].setRotationPoint(5.71F, -15F, -3.83F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[104].setRotationPoint(8.08F, -15F, -3.83F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(10.46F, -15F, -3.83F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(12.84F, -15F, -3.83F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(15.22F, -15F, -3.83F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[108].setRotationPoint(-1.7F, -17F, -3.83F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[109].setRotationPoint(0.68F, -17F, -3.83F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[110].setRotationPoint(-2.5F, -10F, -4.83F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[111].setRotationPoint(3.06F, -17F, -3.83F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[112].setRotationPoint(5.41F, -17F, -3.83F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[113].setRotationPoint(7.78F, -17F, -3.83F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[114].setRotationPoint(10.16F, -17F, -3.83F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[115].setRotationPoint(12.54F, -17F, -3.83F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[116].setRotationPoint(14.9F, -17F, -3.83F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, 0F, -4.37F, 0F, 0F, -4.37F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -4.37F, -1F, 0F, -4.37F, -1F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[117].setRotationPoint(-4.5F, -15F, 2.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[118].setRotationPoint(-2.5F, -17F, 2.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.63F, -0.25F, 0F, -0.63F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 394
		bodyModel[119].setRotationPoint(14.13F, -15F, 2.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[120].setRotationPoint(16.5F, -4.75F, 0F);
		bodyModel[120].rotateAngleX = -0.78539816F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[121].setRotationPoint(18.5F, -5F, -2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[122].setRotationPoint(18.5F, -6F, -2.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[123].setRotationPoint(19.5F, -4.75F, -1.8F);
		bodyModel[123].rotateAngleX = -0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[124].setRotationPoint(21.5F, -5.5F, -4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[125].setRotationPoint(21.5F, -6.5F, -4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[126].setRotationPoint(19.5F, -3.3F, -3.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[127].setRotationPoint(18.5F, -19F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[128].setRotationPoint(18.5F, -19F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[129].setRotationPoint(18.5F, -19F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(18.5F, -21F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(18.5F, -21F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[132].setRotationPoint(18.5F, -21F, 2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[133].setRotationPoint(7.5F, -10F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 444
		bodyModel[134].setRotationPoint(7.5F, -9.5F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[135].setRotationPoint(24.5F, -7F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[136].setRotationPoint(30.5F, -7F, 9F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 0
		bodyModel[137].setRotationPoint(31.9F, -4F, 7.5F);
		bodyModel[137].rotateAngleY = -1.04719755F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[138].setRotationPoint(32.5F, -20F, -5F);

		bodyModel[139].addShapeBox(-1F, 0F, -1F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[139].setRotationPoint(25.5F, -10.5F, -4.5F);
		bodyModel[139].rotateAngleY = -0.78539816F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[140].setRotationPoint(28.5F, -7F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 9, 4, 0F); // Box 0
		bodyModel[141].setRotationPoint(-9F, -9F, -2F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 0
		bodyModel[142].setRotationPoint(-9F, -5F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 0
		bodyModel[143].setRotationPoint(-9F, -5F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-9F, -9F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[145].setRotationPoint(-9F, -9F, 2F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[146].setRotationPoint(-12F, -1F, -2.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[147].setRotationPoint(-4F, -3.7F, 0F);
		bodyModel[147].rotateAngleX = -0.78539816F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-12.5F, -2.3F, -2.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[149].setRotationPoint(-12.5F, -4.3F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-12.5F, -4.3F, -2.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[151].setRotationPoint(-12.5F, -4.3F, 1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[152].setRotationPoint(-12.5F, -7.3F, -1F);

		bodyModel[153].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[153].setRotationPoint(-11.5F, -3.3F, 2F);
		bodyModel[153].rotateAngleX = -1.10828408F;

		bodyModel[154].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[154].setRotationPoint(-11.5F, -3.3F, -2F);
		bodyModel[154].rotateAngleX = 1.10828408F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[155].setRotationPoint(-12.85F, -7.5F, -0.7F);
		bodyModel[155].rotateAngleY = 0.78539816F;

		bodyModel[156].addShapeBox(0F, -0.5F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[156].setRotationPoint(-6.5F, -20.5F, 2.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[157].setRotationPoint(-9F, -11.21F, -4.79F);
		bodyModel[157].rotateAngleX = -0.78539816F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[158].setRotationPoint(-9F, -9.79F, -3.37F);
		bodyModel[158].rotateAngleX = -0.78539816F;

		bodyModel[159].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[159].setRotationPoint(-10F, -4F, -1F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[160].setRotationPoint(-10F, -6F, 1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[161].setRotationPoint(-11.1F, -3.5F, 4F);
		bodyModel[161].rotateAngleY = -0.78539816F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[162].setRotationPoint(-10.4F, -3.5F, -4.7F);
		bodyModel[162].rotateAngleY = 0.78539816F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[163].setRotationPoint(-10F, -4F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[164].setRotationPoint(-10F, -4F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[165].setRotationPoint(-10F, -9F, 1F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[166].setRotationPoint(-10F, -9F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[167].setRotationPoint(-10F, -11.21F, -4.79F);
		bodyModel[167].rotateAngleX = -0.78539816F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[168].setRotationPoint(-10F, -9F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[169].setRotationPoint(-10F, -11F, -4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[170].setRotationPoint(-10.5F, -2.99F, 0F);
		bodyModel[170].rotateAngleX = -0.78539816F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[171].setRotationPoint(-8.5F, -16F, 2.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[172].setRotationPoint(-8.5F, -14F, 0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[173].setRotationPoint(-8.5F, -14F, 5.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[174].setRotationPoint(-8.51F, -16F, 0.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[175].setRotationPoint(-9F, -1F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 486
		bodyModel[176].setRotationPoint(-9F, -1F, 2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[177].setRotationPoint(-6.51F, -12F, 0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[178].setRotationPoint(-12F, -15.25F, 2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[179].setRotationPoint(-9F, -15.37F, 4F);
		bodyModel[179].rotateAngleX = -0.78539816F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[180].setRotationPoint(-12F, -16.25F, 4F);
		bodyModel[180].rotateAngleX = -0.78539816F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[181].setRotationPoint(-4.5F, -17F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[182].setRotationPoint(-8.5F, -17F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		bodyModel[183].setRotationPoint(-8.5F, -15F, -0.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[184].setRotationPoint(36.5F, -9F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[185].setRotationPoint(36.5F, -21F, -1F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[186].setRotationPoint(-36F, -24F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[187].setRotationPoint(-36F, -23F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 84, 8, 1, 0F,0F, 0F, 1.22F, -44F, 0F, 1.22F, -44F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -4F, 0.02F, -44F, -4F, 0.02F, -44F, -4F, 0F, 0F, -4F, 0F); // Box 565
		bodyModel[188].setRotationPoint(-9.5F, -18F, 10.01F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[189].setRotationPoint(-11.5F, -10F, 10.01F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[190].setRotationPoint(-33.5F, -23F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[191].setRotationPoint(-36.5F, -24F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[192].setRotationPoint(-4.49F, -16F, 0.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 7, 2, 22, 0F); // Box 0
		bodyModel[193].setRotationPoint(-36.5F, 0F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 0
		bodyModel[194].setRotationPoint(-36.5F, -14F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[195].setRotationPoint(-36.5F, -19F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[196].setRotationPoint(-35.5F, 2F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[197].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 14, 9, 0F); // Box 565
		bodyModel[198].setRotationPoint(-36.5F, -14F, 2F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 566
		bodyModel[199].setRotationPoint(-35.5F, -14F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Front side door R
		bodyModel[200].setRotationPoint(-35.5F, -12F, 10F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 568
		bodyModel[201].setRotationPoint(-31.5F, -7F, -12F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 569
		bodyModel[202].setRotationPoint(-35.5F, -7F, -12F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 570
		bodyModel[203].setRotationPoint(-31F, -11F, 11F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 12, 1, 0F); // Box 571
		bodyModel[204].setRotationPoint(-36F, -11F, 11F);

		bodyModel[205].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 62
		bodyModel[205].setRotationPoint(-31.5F, -14F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[206].setRotationPoint(-36.5F, -19F, 10F);

		bodyModel[207].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 0
		bodyModel[207].setRotationPoint(-24.5F, -7F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[208].setRotationPoint(-36.5F, -20F, -9.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[209].setRotationPoint(-36.5F, -20F, 8.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[210].setRotationPoint(-36.5F, -22F, -2.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[211].setRotationPoint(-36.5F, -22F, -8.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[212].setRotationPoint(-36.5F, -22F, 2.5F);

		bodyModel[213].addBox(-1F, 0F, -4F, 1, 15, 4, 0F); // Front door
		bodyModel[213].setRotationPoint(-35.5F, -15F, 2F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 0
		bodyModel[214].setRotationPoint(-36.5F, -14F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[215].setRotationPoint(-36.5F, -19F, -8.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 0
		bodyModel[216].setRotationPoint(-36.5F, -19F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[217].setRotationPoint(-36.5F, -19F, 1.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[218].setRotationPoint(-36.5F, -19F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[219].setRotationPoint(-36.5F, -19F, 8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[220].setRotationPoint(-36.5F, -21F, -2.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[221].setRotationPoint(-36.5F, -21F, -8.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[222].setRotationPoint(-36.5F, -21F, 2.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[223].setRotationPoint(-37F, -9F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[224].setRotationPoint(-37F, -9F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[225].setRotationPoint(-37F, -21F, -1F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[226].setRotationPoint(-37.5F, -17F, 3F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[227].setRotationPoint(-37.5F, 0F, -5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[228].setRotationPoint(-37.5F, -18F, -5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 17, 2, 0F); // Box 128
		bodyModel[229].setRotationPoint(-37.5F, -17F, -5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[230].setRotationPoint(-37.5F, -19F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[231].setRotationPoint(-37.5F, -19F, -4F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[232].setRotationPoint(-37.5F, -19F, 4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[233].setRotationPoint(-37.5F, -19F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[234].setRotationPoint(-37.5F, 1F, -5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[235].setRotationPoint(-37.5F, 1F, 4F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[236].setRotationPoint(-38.5F, 0F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[237].setRotationPoint(-38.5F, -16F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[238].setRotationPoint(-38.5F, -16F, -5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[239].setRotationPoint(-38F, -17F, 3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[240].setRotationPoint(-38F, -17F, -3.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[241].setRotationPoint(-38F, -17.5F, -3.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[242].setRotationPoint(-38.5F, -19F, -5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[243].setRotationPoint(-38.5F, -19F, 1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[244].setRotationPoint(-38.5F, -19F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[245].setRotationPoint(-38.5F, -17F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[246].setRotationPoint(-35.5F, -21F, -6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[247].setRotationPoint(-28.5F, -21.5F, 1.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.65F, 0.15F, 0F, -0.65F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[248].setRotationPoint(-30.5F, -22.5F, -4.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 7, 10, 5, 0F); // Box 0
		bodyModel[249].setRotationPoint(-28.15F, -9F, -3F);
		bodyModel[249].rotateAngleY = 1.04719755F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[250].setRotationPoint(-29.96F, -9F, -5.13F);
		bodyModel[250].rotateAngleY = 1.04719755F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, -0.4F, 0.075F, 0F, -0.4F, 0.075F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 0
		bodyModel[251].setRotationPoint(-28.5F, -22.5F, 1.75F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[252].setRotationPoint(-35.5F, 2.75F, 7.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[253].setRotationPoint(-35.5F, 2F, 7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[254].setRotationPoint(-35.25F, 3F, 7.75F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[255].setRotationPoint(-19.5F, -10F, 9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 444
		bodyModel[256].setRotationPoint(-19.5F, -9.5F, -10F);

		bodyModel[257].addShapeBox(-1F, 0F, -1F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[257].setRotationPoint(-33.5F, -10.5F, -8F);
		bodyModel[257].rotateAngleY = -0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[258].setRotationPoint(-31.5F, -7F, 8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[259].setRotationPoint(-36.5F, 2F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[260].setRotationPoint(-36.5F, 2F, 9F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0.02F, -3F, 0F, 0.02F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.02F, -3F, -7F, 0.02F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 566
		bodyModel[261].setRotationPoint(-11.5F, -11F, 10.01F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0.02F, 0F, -7F, 0.02F); // Box 0
		bodyModel[262].setRotationPoint(-11.5F, -11F, -11.01F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[263].setRotationPoint(37.5F, -13F, 3.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[264].setRotationPoint(37.5F, -13F, -3.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[265].setRotationPoint(-38.5F, -13F, 3.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[266].setRotationPoint(-38.5F, -13F, -3.5F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.59, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_EJ&EGreen.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.22, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.59, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}