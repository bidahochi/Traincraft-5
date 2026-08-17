//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.12.2023 - 17:08:44
// Last changed on: 22.12.2023 - 17:08:44

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;


public class ModelTwoBilTail extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTwoBilTail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[359];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 6, 313, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 67
		bodyModel[2] = new ModelRendererTurbo(this, 357, 379, textureX, textureY); // Box 100
		bodyModel[3] = new ModelRendererTurbo(this, 426, 146, textureX, textureY); // Box 100
		bodyModel[4] = new ModelRendererTurbo(this, 31, 291, textureX, textureY); // Box 100
		bodyModel[5] = new ModelRendererTurbo(this, 231, 327, textureX, textureY); // Box 100
		bodyModel[6] = new ModelRendererTurbo(this, 182, 180, textureX, textureY); // Box 100
		bodyModel[7] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 100
		bodyModel[8] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 100
		bodyModel[9] = new ModelRendererTurbo(this, 13, 207, textureX, textureY); // Box 100
		bodyModel[10] = new ModelRendererTurbo(this, 14, 181, textureX, textureY); // Box 100
		bodyModel[11] = new ModelRendererTurbo(this, 441, 254, textureX, textureY); // Box 100
		bodyModel[12] = new ModelRendererTurbo(this, 481, 254, textureX, textureY); // Box 100
		bodyModel[13] = new ModelRendererTurbo(this, 219, 283, textureX, textureY); // Box 100
		bodyModel[14] = new ModelRendererTurbo(this, 223, 240, textureX, textureY); // Box 100
		bodyModel[15] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 100
		bodyModel[16] = new ModelRendererTurbo(this, 445, 249, textureX, textureY); // Box 153
		bodyModel[17] = new ModelRendererTurbo(this, 224, 258, textureX, textureY); // Box 100
		bodyModel[18] = new ModelRendererTurbo(this, 169, 254, textureX, textureY); // Box 100
		bodyModel[19] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 100
		bodyModel[20] = new ModelRendererTurbo(this, 276, 214, textureX, textureY); // Box 182
		bodyModel[21] = new ModelRendererTurbo(this, 329, 373, textureX, textureY); // Box 153
		bodyModel[22] = new ModelRendererTurbo(this, 273, 374, textureX, textureY); // Box 153
		bodyModel[23] = new ModelRendererTurbo(this, 297, 374, textureX, textureY); // Box 153
		bodyModel[24] = new ModelRendererTurbo(this, 397, 148, textureX, textureY); // Box 153
		bodyModel[25] = new ModelRendererTurbo(this, 305, 374, textureX, textureY); // Box 153
		bodyModel[26] = new ModelRendererTurbo(this, 369, 374, textureX, textureY); // Box 153
		bodyModel[27] = new ModelRendererTurbo(this, 385, 374, textureX, textureY); // Box 153
		bodyModel[28] = new ModelRendererTurbo(this, 393, 374, textureX, textureY); // Box 153
		bodyModel[29] = new ModelRendererTurbo(this, 465, 374, textureX, textureY); // Box 153
		bodyModel[30] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 106
		bodyModel[31] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 106
		bodyModel[32] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 106
		bodyModel[33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 100
		bodyModel[34] = new ModelRendererTurbo(this, 209, 213, textureX, textureY); // Box 100
		bodyModel[35] = new ModelRendererTurbo(this, 241, 198, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 217, 194, textureX, textureY); // Box 100
		bodyModel[37] = new ModelRendererTurbo(this, 257, 216, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 365, 297, textureX, textureY); // Box 100
		bodyModel[39] = new ModelRendererTurbo(this, 399, 299, textureX, textureY); // Box 100
		bodyModel[40] = new ModelRendererTurbo(this, 427, 313, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 195, 194, textureX, textureY); // Box 100
		bodyModel[42] = new ModelRendererTurbo(this, 269, 249, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Passenger swing door right Top
		bodyModel[44] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Passenger swing door right Bottom
		bodyModel[45] = new ModelRendererTurbo(this, 319, 193, textureX, textureY); // Box 100
		bodyModel[46] = new ModelRendererTurbo(this, 414, 164, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 12, 193, textureX, textureY); // Box 100
		bodyModel[48] = new ModelRendererTurbo(this, 377, 256, textureX, textureY); // Box 100
		bodyModel[49] = new ModelRendererTurbo(this, 358, 257, textureX, textureY); // Box 100
		bodyModel[50] = new ModelRendererTurbo(this, 397, 259, textureX, textureY); // Box 100
		bodyModel[51] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 17, 173, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 385, 146, textureX, textureY); // Box 100
		bodyModel[54] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 352
		bodyModel[55] = new ModelRendererTurbo(this, 217, 298, textureX, textureY); // Box 352
		bodyModel[56] = new ModelRendererTurbo(this, 425, 298, textureX, textureY); // Box 352
		bodyModel[57] = new ModelRendererTurbo(this, 38, 301, textureX, textureY); // Box 352
		bodyModel[58] = new ModelRendererTurbo(this, 481, 298, textureX, textureY); // Box 352
		bodyModel[59] = new ModelRendererTurbo(this, 1, 247, textureX, textureY); // Box 352
		bodyModel[60] = new ModelRendererTurbo(this, 169, 370, textureX, textureY); // Box 352
		bodyModel[61] = new ModelRendererTurbo(this, 378, 188, textureX, textureY); // Box 100
		bodyModel[62] = new ModelRendererTurbo(this, 333, 309, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 292, 273, textureX, textureY); // Box 153
		bodyModel[64] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 100
		bodyModel[65] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 505, 158, textureX, textureY); // Box 102
		bodyModel[67] = new ModelRendererTurbo(this, 505, 158, textureX, textureY); // Box 102
		bodyModel[68] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 102
		bodyModel[69] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 102
		bodyModel[70] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 102
		bodyModel[71] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[74] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[78] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[79] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[81] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[82] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[83] = new ModelRendererTurbo(this, 121, 258, textureX, textureY); // Box 100
		bodyModel[84] = new ModelRendererTurbo(this, 163, 277, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 267, 283, textureX, textureY); // Box 100
		bodyModel[86] = new ModelRendererTurbo(this, 310, 247, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 100
		bodyModel[91] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 417, 254, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 100
		bodyModel[94] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 33, 230, textureX, textureY); // Driver swing door Top
		bodyModel[96] = new ModelRendererTurbo(this, 49, 230, textureX, textureY); // Driver swing door Bottom
		bodyModel[97] = new ModelRendererTurbo(this, 65, 229, textureX, textureY); // Driver swing door Top
		bodyModel[98] = new ModelRendererTurbo(this, 81, 229, textureX, textureY); // Driver swing door Bottom
		bodyModel[99] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Passenger swing door left Top
		bodyModel[102] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Passenger swing door left Bottom
		bodyModel[103] = new ModelRendererTurbo(this, 83, 263, textureX, textureY); // Box 100
		bodyModel[104] = new ModelRendererTurbo(this, 135, 277, textureX, textureY); // Box 100
		bodyModel[105] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[106] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[107] = new ModelRendererTurbo(this, 473, 147, textureX, textureY); // Box 23
		bodyModel[108] = new ModelRendererTurbo(this, 473, 147, textureX, textureY); // Box 23
		bodyModel[109] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[123] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[124] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[125] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[126] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[127] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[128] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 102
		bodyModel[129] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[130] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[131] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[132] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[133] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[134] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[135] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 102
		bodyModel[136] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[137] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[138] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[139] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[140] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[141] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 102
		bodyModel[142] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 102
		bodyModel[143] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[144] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[145] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[146] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 100
		bodyModel[147] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[148] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 102
		bodyModel[149] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 122
		bodyModel[150] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 122
		bodyModel[151] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 122
		bodyModel[152] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 122
		bodyModel[153] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 67
		bodyModel[154] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 122
		bodyModel[155] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 122
		bodyModel[156] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 122
		bodyModel[157] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 122
		bodyModel[158] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		bodyModel[159] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 122
		bodyModel[160] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 122
		bodyModel[161] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 122
		bodyModel[162] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 122
		bodyModel[163] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 153
		bodyModel[164] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 153
		bodyModel[165] = new ModelRendererTurbo(this, 198, 335, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[167] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[168] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[169] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[170] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[171] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[172] = new ModelRendererTurbo(this, 132, 216, textureX, textureY); // Box 67
		bodyModel[173] = new ModelRendererTurbo(this, 422, 189, textureX, textureY); // Box 153
		bodyModel[174] = new ModelRendererTurbo(this, 344, 243, textureX, textureY); // Box 67
		bodyModel[175] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[176] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[177] = new ModelRendererTurbo(this, 476, 198, textureX, textureY); // Box 67
		bodyModel[178] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 100
		bodyModel[179] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[180] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[181] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[182] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[183] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[184] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[185] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[186] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 100
		bodyModel[187] = new ModelRendererTurbo(this, 421, 1, textureX, textureY); // Box 100
		bodyModel[188] = new ModelRendererTurbo(this, 497, 205, textureX, textureY); // Box 182
		bodyModel[189] = new ModelRendererTurbo(this, 497, 205, textureX, textureY); // Box 182
		bodyModel[190] = new ModelRendererTurbo(this, 497, 205, textureX, textureY); // Box 182
		bodyModel[191] = new ModelRendererTurbo(this, 497, 205, textureX, textureY); // Box 182
		bodyModel[192] = new ModelRendererTurbo(this, 329, 152, textureX, textureY); // Box 102
		bodyModel[193] = new ModelRendererTurbo(this, 329, 152, textureX, textureY); // Box 102
		bodyModel[194] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[195] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[196] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[197] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[198] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[199] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[200] = new ModelRendererTurbo(this, 401, 199, textureX, textureY); // Box 100
		bodyModel[201] = new ModelRendererTurbo(this, 377, 243, textureX, textureY); // Passenger swing door left Top
		bodyModel[202] = new ModelRendererTurbo(this, 377, 243, textureX, textureY); // Passenger swing door left Top
		bodyModel[203] = new ModelRendererTurbo(this, 35, 392, textureX, textureY); // Box 304
		bodyModel[204] = new ModelRendererTurbo(this, 35, 392, textureX, textureY); // Box 304
		bodyModel[205] = new ModelRendererTurbo(this, 431, 447, textureX, textureY); // Box 304
		bodyModel[206] = new ModelRendererTurbo(this, 241, 418, textureX, textureY); // Box 304
		bodyModel[207] = new ModelRendererTurbo(this, 241, 418, textureX, textureY); // Box 304
		bodyModel[208] = new ModelRendererTurbo(this, 431, 447, textureX, textureY); // Box 304
		bodyModel[209] = new ModelRendererTurbo(this, 241, 418, textureX, textureY); // Box 304
		bodyModel[210] = new ModelRendererTurbo(this, 241, 418, textureX, textureY); // Box 304
		bodyModel[211] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[212] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[213] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[214] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[215] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[216] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[217] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[218] = new ModelRendererTurbo(this, 279, 419, textureX, textureY); // Box 35
		bodyModel[219] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[220] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[221] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[222] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[223] = new ModelRendererTurbo(this, 132, 478, textureX, textureY); // Box 23
		bodyModel[224] = new ModelRendererTurbo(this, 262, 478, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 14, 447, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 58, 457, textureX, textureY); // Box 22
		bodyModel[227] = new ModelRendererTurbo(this, 341, 472, textureX, textureY); // Box 97
		bodyModel[228] = new ModelRendererTurbo(this, 294, 461, textureX, textureY); // Box 53
		bodyModel[229] = new ModelRendererTurbo(this, 322, 483, textureX, textureY); // Box 53
		bodyModel[230] = new ModelRendererTurbo(this, 299, 483, textureX, textureY); // Box 53
		bodyModel[231] = new ModelRendererTurbo(this, 286, 479, textureX, textureY); // Box 53
		bodyModel[232] = new ModelRendererTurbo(this, 272, 480, textureX, textureY); // Box 34
		bodyModel[233] = new ModelRendererTurbo(this, 269, 463, textureX, textureY); // Box 34
		bodyModel[234] = new ModelRendererTurbo(this, 100, 449, textureX, textureY); // Box 92
		bodyModel[235] = new ModelRendererTurbo(this, 218, 462, textureX, textureY); // Box 93
		bodyModel[236] = new ModelRendererTurbo(this, 321, 449, textureX, textureY); // Box 34
		bodyModel[237] = new ModelRendererTurbo(this, 187, 503, textureX, textureY); // Box 29
		bodyModel[238] = new ModelRendererTurbo(this, 419, 499, textureX, textureY); // Box 30
		bodyModel[239] = new ModelRendererTurbo(this, 184, 452, textureX, textureY); // Box 33
		bodyModel[240] = new ModelRendererTurbo(this, 395, 463, textureX, textureY); // Box 34
		bodyModel[241] = new ModelRendererTurbo(this, 264, 460, textureX, textureY); // Box 34
		bodyModel[242] = new ModelRendererTurbo(this, 285, 460, textureX, textureY); // Box 34
		bodyModel[243] = new ModelRendererTurbo(this, 280, 455, textureX, textureY); // Box 34
		bodyModel[244] = new ModelRendererTurbo(this, 272, 456, textureX, textureY); // Box 34
		bodyModel[245] = new ModelRendererTurbo(this, 283, 462, textureX, textureY); // Box 34
		bodyModel[246] = new ModelRendererTurbo(this, 326, 457, textureX, textureY); // Box 34
		bodyModel[247] = new ModelRendererTurbo(this, 273, 463, textureX, textureY); // Box 34
		bodyModel[248] = new ModelRendererTurbo(this, 309, 484, textureX, textureY); // Box 34
		bodyModel[249] = new ModelRendererTurbo(this, 281, 471, textureX, textureY); // Box 34
		bodyModel[250] = new ModelRendererTurbo(this, 271, 470, textureX, textureY); // Box 34
		bodyModel[251] = new ModelRendererTurbo(this, 258, 467, textureX, textureY); // Box 34
		bodyModel[252] = new ModelRendererTurbo(this, 272, 480, textureX, textureY); // Box 34
		bodyModel[253] = new ModelRendererTurbo(this, 269, 463, textureX, textureY); // Box 34
		bodyModel[254] = new ModelRendererTurbo(this, 272, 480, textureX, textureY); // Box 34
		bodyModel[255] = new ModelRendererTurbo(this, 132, 478, textureX, textureY); // Box 23
		bodyModel[256] = new ModelRendererTurbo(this, 252, 492, textureX, textureY); // Box 93
		bodyModel[257] = new ModelRendererTurbo(this, 309, 453, textureX, textureY); // Box 93
		bodyModel[258] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[259] = new ModelRendererTurbo(this, 262, 478, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[261] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[262] = new ModelRendererTurbo(this, 14, 447, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 161, 452, textureX, textureY); // Wheel
		bodyModel[264] = new ModelRendererTurbo(this, 58, 457, textureX, textureY); // Box 22
		bodyModel[265] = new ModelRendererTurbo(this, 341, 472, textureX, textureY); // Box 97
		bodyModel[266] = new ModelRendererTurbo(this, 264, 485, textureX, textureY); // Box 34
		bodyModel[267] = new ModelRendererTurbo(this, 294, 461, textureX, textureY); // Box 53
		bodyModel[268] = new ModelRendererTurbo(this, 322, 483, textureX, textureY); // Box 53
		bodyModel[269] = new ModelRendererTurbo(this, 269, 463, textureX, textureY); // Box 34
		bodyModel[270] = new ModelRendererTurbo(this, 266, 474, textureX, textureY); // Box 34
		bodyModel[271] = new ModelRendererTurbo(this, 299, 483, textureX, textureY); // Box 53
		bodyModel[272] = new ModelRendererTurbo(this, 286, 479, textureX, textureY); // Box 53
		bodyModel[273] = new ModelRendererTurbo(this, 100, 449, textureX, textureY); // Box 92
		bodyModel[274] = new ModelRendererTurbo(this, 218, 462, textureX, textureY); // Box 93
		bodyModel[275] = new ModelRendererTurbo(this, 321, 449, textureX, textureY); // Box 34
		bodyModel[276] = new ModelRendererTurbo(this, 187, 503, textureX, textureY); // Box 29
		bodyModel[277] = new ModelRendererTurbo(this, 419, 499, textureX, textureY); // Box 30
		bodyModel[278] = new ModelRendererTurbo(this, 184, 452, textureX, textureY); // Box 33
		bodyModel[279] = new ModelRendererTurbo(this, 395, 463, textureX, textureY); // Box 34
		bodyModel[280] = new ModelRendererTurbo(this, 311, 463, textureX, textureY); // Box 304
		bodyModel[281] = new ModelRendererTurbo(this, 294, 473, textureX, textureY); // Box 304
		bodyModel[282] = new ModelRendererTurbo(this, 302, 441, textureX, textureY); // Box 304
		bodyModel[283] = new ModelRendererTurbo(this, 249, 485, textureX, textureY); // Box 93
		bodyModel[284] = new ModelRendererTurbo(this, 164, 463, textureX, textureY); // Box 93
		bodyModel[285] = new ModelRendererTurbo(this, 259, 478, textureX, textureY); // Box 93
		bodyModel[286] = new ModelRendererTurbo(this, 335, 450, textureX, textureY); // Box 304
		bodyModel[287] = new ModelRendererTurbo(this, 266, 480, textureX, textureY); // Box 93
		bodyModel[288] = new ModelRendererTurbo(this, 309, 453, textureX, textureY); // Box 93
		bodyModel[289] = new ModelRendererTurbo(this, 255, 468, textureX, textureY); // Box 93
		bodyModel[290] = new ModelRendererTurbo(this, 309, 453, textureX, textureY); // Box 93
		bodyModel[291] = new ModelRendererTurbo(this, 280, 466, textureX, textureY); // Box 93
		bodyModel[292] = new ModelRendererTurbo(this, 309, 453, textureX, textureY); // Box 93
		bodyModel[293] = new ModelRendererTurbo(this, 264, 460, textureX, textureY); // Box 34
		bodyModel[294] = new ModelRendererTurbo(this, 285, 460, textureX, textureY); // Box 34
		bodyModel[295] = new ModelRendererTurbo(this, 280, 455, textureX, textureY); // Box 34
		bodyModel[296] = new ModelRendererTurbo(this, 272, 456, textureX, textureY); // Box 34
		bodyModel[297] = new ModelRendererTurbo(this, 283, 462, textureX, textureY); // Box 34
		bodyModel[298] = new ModelRendererTurbo(this, 326, 457, textureX, textureY); // Box 34
		bodyModel[299] = new ModelRendererTurbo(this, 273, 463, textureX, textureY); // Box 34
		bodyModel[300] = new ModelRendererTurbo(this, 309, 484, textureX, textureY); // Box 34
		bodyModel[301] = new ModelRendererTurbo(this, 281, 471, textureX, textureY); // Box 34
		bodyModel[302] = new ModelRendererTurbo(this, 271, 470, textureX, textureY); // Box 34
		bodyModel[303] = new ModelRendererTurbo(this, 258, 467, textureX, textureY); // Box 34
		bodyModel[304] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 100
		bodyModel[305] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 100
		bodyModel[306] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 100
		bodyModel[307] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 100
		bodyModel[308] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 356
		bodyModel[309] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 357
		bodyModel[310] = new ModelRendererTurbo(this, 288, 455, textureX, textureY); // Box 33
		bodyModel[311] = new ModelRendererTurbo(this, 317, 469, textureX, textureY); // Box 33
		bodyModel[312] = new ModelRendererTurbo(this, 255, 452, textureX, textureY); // Box 33
		bodyModel[313] = new ModelRendererTurbo(this, 435, 480, textureX, textureY); // Box 33
		bodyModel[314] = new ModelRendererTurbo(this, 263, 453, textureX, textureY); // Box 33
		bodyModel[315] = new ModelRendererTurbo(this, 317, 469, textureX, textureY); // Box 350
		bodyModel[316] = new ModelRendererTurbo(this, 317, 469, textureX, textureY); // Box 351
		bodyModel[317] = new ModelRendererTurbo(this, 317, 469, textureX, textureY); // Box 352
		bodyModel[318] = new ModelRendererTurbo(this, 189, 441, textureX, textureY); // Box 58
		bodyModel[319] = new ModelRendererTurbo(this, 189, 441, textureX, textureY); // Box 405
		bodyModel[320] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Passenger swing door right Top
		bodyModel[321] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Passenger swing door right Bottom
		bodyModel[322] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Passenger swing door right Top
		bodyModel[323] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Passenger swing door right Bottom
		bodyModel[324] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Passenger swing door right Top
		bodyModel[325] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Passenger swing door right Bottom
		bodyModel[326] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Passenger swing door right Top
		bodyModel[327] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Passenger swing door right Bottom
		bodyModel[328] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[329] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 182
		bodyModel[330] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 355
		bodyModel[331] = new ModelRendererTurbo(this, 488, 205, textureX, textureY); // Box 356
		bodyModel[332] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Passenger swing door left Top
		bodyModel[333] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Passenger swing door left Bottom
		bodyModel[334] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Passenger swing door left Top
		bodyModel[335] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Passenger swing door left Bottom
		bodyModel[336] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Passenger swing door left Top
		bodyModel[337] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Passenger swing door left Bottom
		bodyModel[338] = new ModelRendererTurbo(this, 410, 145, textureX, textureY); // Box 364
		bodyModel[339] = new ModelRendererTurbo(this, 417, 156, textureX, textureY); // Box 365
		bodyModel[340] = new ModelRendererTurbo(this, 57, 261, textureX, textureY); // Box 102
		bodyModel[341] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[342] = new ModelRendererTurbo(this, 57, 261, textureX, textureY); // Box 102
		bodyModel[343] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 102
		bodyModel[344] = new ModelRendererTurbo(this, 57, 261, textureX, textureY); // Box 102
		bodyModel[345] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 102
		bodyModel[346] = new ModelRendererTurbo(this, 57, 261, textureX, textureY); // Box 102
		bodyModel[347] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 102
		bodyModel[348] = new ModelRendererTurbo(this, 276, 214, textureX, textureY); // Box 711
		bodyModel[349] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_349"); // Ceiling Lamp
		bodyModel[350] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_350"); // Ceiling Lamp
		bodyModel[351] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_351"); // Ceiling Lamp
		bodyModel[352] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_352"); // Ceiling Lamp
		bodyModel[353] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_353"); // Ceiling Lamp
		bodyModel[354] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_354"); // Ceiling Lamp
		bodyModel[355] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_355"); // Ceiling Lamp
		bodyModel[356] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_356"); // Ceiling Lamp
		bodyModel[357] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_357"); // Ceiling Lamp
		bodyModel[358] = new ModelRendererTurbo(this, 1, 197, textureX, textureY,"interior").setLightFixtureId("interior_body_358"); // Ceiling Lamp

		bodyModel[0].addBox(0F, 0F, 0F, 81, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-41.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 67
		bodyModel[1].setRotationPoint(40.5F, 2F, -0.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 100
		bodyModel[2].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[3].setRotationPoint(39.5F, -8F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 76, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[4].setRotationPoint(-42.5F, -19F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 76, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[5].setRotationPoint(-42.5F, -19F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 75, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 100
		bodyModel[6].setRotationPoint(-41.5F, -19F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 19, 20, 0F); // Box 100
		bodyModel[7].setRotationPoint(-42.5F, -19F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 75, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[8].setRotationPoint(-41.5F, -19F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 76, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[9].setRotationPoint(-42.5F, -21F, 3F);

		bodyModel[10].addBox(0F, 0F, 0F, 76, 2, 6, 0F); // Box 100
		bodyModel[10].setRotationPoint(-42.5F, -21F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[11].setRotationPoint(-41.5F, -8F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[12].setRotationPoint(-41.5F, -16F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[13].setRotationPoint(4.5F, -8F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[14].setRotationPoint(4.5F, -16F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[15].setRotationPoint(24F, -8F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 153
		bodyModel[16].setRotationPoint(39.5F, 0F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[17].setRotationPoint(-10.5F, -8F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[18].setRotationPoint(-10.5F, -16F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 19, 20, 0F); // Box 100
		bodyModel[19].setRotationPoint(24F, -19F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 65, 19, 1, 0F); // Box 182
		bodyModel[20].setRotationPoint(-41F, -19F, 0F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 153
		bodyModel[21].setRotationPoint(38.5F, -7F, 3F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 153
		bodyModel[22].setRotationPoint(38.5F, -7F, 6F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 153
		bodyModel[23].setRotationPoint(38.5F, -7F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 153
		bodyModel[24].setRotationPoint(36.5F, -8F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 153
		bodyModel[25].setRotationPoint(37F, -15F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 153
		bodyModel[26].setRotationPoint(37F, -10F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 153
		bodyModel[27].setRotationPoint(36.5F, -12F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 153
		bodyModel[28].setRotationPoint(36.5F, -9F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[29].setRotationPoint(37.5F, -15F, 9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 106
		bodyModel[30].setRotationPoint(40F, 1.01F, -7.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[31].setRotationPoint(-44.5F, 1F, -1F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 106
		bodyModel[32].setRotationPoint(40F, 1.01F, 5.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0.01F, -0.5F, -2.95F, 0F, -1.5F, -2.95F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[33].setRotationPoint(33.5F, -19F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -1F, -1.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[34].setRotationPoint(33.5F, -19F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[35].setRotationPoint(-42.5F, -16F, 10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[36].setRotationPoint(-42.5F, -8F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[37].setRotationPoint(-42.5F, -16F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[38].setRotationPoint(-42.5F, -8F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[39].setRotationPoint(-3F, -16F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(-3F, -8F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[41].setRotationPoint(9F, -16F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[42].setRotationPoint(9F, -8F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Passenger swing door right Top
		bodyModel[43].setRotationPoint(16F, -16F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Passenger swing door right Bottom
		bodyModel[44].setRotationPoint(16F, -8F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[45].setRotationPoint(21F, -16F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[46].setRotationPoint(21F, -8F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 76, 2, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[47].setRotationPoint(-42.5F, -21F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[48].setRotationPoint(39.75F, -16F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 100
		bodyModel[49].setRotationPoint(39.75F, -16F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[50].setRotationPoint(41.25F, -16F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F); // Box 100
		bodyModel[51].setRotationPoint(39.5F, -16F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[52].setRotationPoint(39.5F, -8F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[53].setRotationPoint(39.5F, -16F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 352
		bodyModel[54].setRotationPoint(41.5F, -16F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 352
		bodyModel[55].setRotationPoint(41.5F, -16F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 352
		bodyModel[56].setRotationPoint(40.5F, -16F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.75F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 352
		bodyModel[57].setRotationPoint(41.5F, -16F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 352
		bodyModel[58].setRotationPoint(40.5F, -16F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 352
		bodyModel[59].setRotationPoint(-43F, -16.5F, 10.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 352
		bodyModel[60].setRotationPoint(-43F, -16.5F, -11.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[61].setRotationPoint(-15F, -16F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[62].setRotationPoint(-15F, -8F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 0, 13, 0F); // Box 153
		bodyModel[63].setRotationPoint(40.25F, 0F, -6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[64].setRotationPoint(24F, -16F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[65].setRotationPoint(24F, -8F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F); // Box 102
		bodyModel[66].setRotationPoint(38.25F, -19F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F); // Box 102
		bodyModel[67].setRotationPoint(38.25F, -19F, 4F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		bodyModel[68].setRotationPoint(37.5F, -19F, -5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 102
		bodyModel[69].setRotationPoint(37.5F, -19F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 102
		bodyModel[70].setRotationPoint(40F, -19F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 102
		bodyModel[71].setRotationPoint(40F, -19F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[72].setRotationPoint(-19.5F, -21.5F, -1F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[73].setRotationPoint(-14.5F, -21.5F, -1F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[74].setRotationPoint(-9.5F, -21.5F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[75].setRotationPoint(-4.5F, -21.5F, -1F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[76].setRotationPoint(0.5F, -21.5F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[77].setRotationPoint(5.5F, -21.5F, -1F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[78].setRotationPoint(10.5F, -21.5F, -1F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[79].setRotationPoint(15.5F, -21.5F, -1F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[80].setRotationPoint(20.5F, -21.5F, -1F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[81].setRotationPoint(25.5F, -21.5F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[82].setRotationPoint(30.5F, -21.5F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[83].setRotationPoint(-29.5F, -8F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[84].setRotationPoint(-29.5F, -16F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[85].setRotationPoint(-27F, -16F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[86].setRotationPoint(-27F, -8F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[87].setRotationPoint(-34.5F, -21.5F, -1F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[88].setRotationPoint(-29.5F, -21.5F, -1F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 102
		bodyModel[89].setRotationPoint(-24.5F, -21.5F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[90].setRotationPoint(-36F, -16F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[91].setRotationPoint(-36F, -8F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[92].setRotationPoint(36.5F, -16F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[93].setRotationPoint(36.5F, -16F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[94].setRotationPoint(36.5F, -8F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Driver swing door Top
		bodyModel[95].setRotationPoint(32.5F, -16F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Driver swing door Bottom
		bodyModel[96].setRotationPoint(32.5F, -8F, 11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Driver swing door Top
		bodyModel[97].setRotationPoint(32.5F, -16F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Driver swing door Bottom
		bodyModel[98].setRotationPoint(32.5F, -8F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 100
		bodyModel[99].setRotationPoint(31.5F, -16F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(31.5F, -8F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Passenger swing door left Top
		bodyModel[101].setRotationPoint(18.5F, -16F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Passenger swing door left Bottom
		bodyModel[102].setRotationPoint(18.5F, -8F, -12F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[103].setRotationPoint(23.5F, -8F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 100
		bodyModel[104].setRotationPoint(23.5F, -16F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[105].setRotationPoint(-36F, -16F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[106].setRotationPoint(-36F, -8F, 10F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 23
		bodyModel[107].setRotationPoint(23.5F, 2F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 23
		bodyModel[108].setRotationPoint(-29.5F, 2F, -1F);

		bodyModel[109].addBox(0F, 0F, 0F, 21, 5, 6, 0F); // Box 0
		bodyModel[109].setRotationPoint(-13.5F, 1.5F, -3F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 0
		bodyModel[110].setRotationPoint(-10.5F, 2F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 0
		bodyModel[111].setRotationPoint(-10.5F, 2F, 9F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 0
		bodyModel[112].setRotationPoint(1.5F, 2F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[113].setRotationPoint(-10.5F, 6F, -9F);

		bodyModel[114].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 0
		bodyModel[114].setRotationPoint(-10.5F, 6F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1.5F, -1F, 0F); // Box 0
		bodyModel[115].setRotationPoint(-16.5F, 2F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1.5F, -1F, 0F); // Box 0
		bodyModel[116].setRotationPoint(-16.5F, 2F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[117].setRotationPoint(2.5F, 2F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[118].setRotationPoint(2.5F, 2F, 9F);

		bodyModel[119].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 0
		bodyModel[119].setRotationPoint(-10.5F, 6F, -10F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[120].setRotationPoint(1.5F, 6F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 0
		bodyModel[121].setRotationPoint(1.5F, 2F, -10F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 19, 9, 0F); // Box 100
		bodyModel[122].setRotationPoint(12F, -19F, 1F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[123].setRotationPoint(21F, -3F, 5.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[124].setRotationPoint(13F, -3F, 5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[125].setRotationPoint(21F, -4F, 1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[126].setRotationPoint(23F, -9F, 1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[127].setRotationPoint(13F, -4F, 1.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[128].setRotationPoint(13F, -9F, 1.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 19, 9, 0F); // Box 100
		bodyModel[129].setRotationPoint(0F, -19F, 1F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[130].setRotationPoint(9F, -3F, 5.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[131].setRotationPoint(1F, -3F, 5.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[132].setRotationPoint(9F, -4F, 1.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[133].setRotationPoint(11F, -9F, 1.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[134].setRotationPoint(1F, -4F, 1.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[135].setRotationPoint(1F, -9F, 1.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 19, 9, 0F); // Box 100
		bodyModel[136].setRotationPoint(-12F, -19F, 1F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[137].setRotationPoint(-3F, -3F, 5.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[138].setRotationPoint(-11F, -3F, 5.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[139].setRotationPoint(-3F, -4F, 1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[140].setRotationPoint(-1F, -9F, 1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[141].setRotationPoint(-11F, -4F, 1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[142].setRotationPoint(-11F, -9F, 1.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 19, 9, 0F); // Box 100
		bodyModel[143].setRotationPoint(-24F, -19F, 1F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[144].setRotationPoint(-15F, -3F, 5.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[145].setRotationPoint(-23F, -3F, 5.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 19, 9, 0F); // Box 100
		bodyModel[146].setRotationPoint(-36F, -19F, 1F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[147].setRotationPoint(-27F, -3F, 5.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 102
		bodyModel[148].setRotationPoint(-35F, -3F, 5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 122
		bodyModel[149].setRotationPoint(42F, 2F, -9.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F); // Box 122
		bodyModel[150].setRotationPoint(42F, 2F, -6.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[151].setRotationPoint(42F, 2.22044604925031E-16F, -9.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 122
		bodyModel[152].setRotationPoint(42F, 2.22044604925031E-16F, -6.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 67
		bodyModel[153].setRotationPoint(42F, 2.22044604925031E-16F, -7.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 122
		bodyModel[154].setRotationPoint(42F, 2F, 4.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F); // Box 122
		bodyModel[155].setRotationPoint(42F, 2F, 7.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[156].setRotationPoint(42F, 2.22044604925031E-16F, 4.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 122
		bodyModel[157].setRotationPoint(42F, 2.22044604925031E-16F, 7.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 67
		bodyModel[158].setRotationPoint(42F, 2.22044604925031E-16F, 6.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F); // Box 122
		bodyModel[159].setRotationPoint(-45F, 2F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[160].setRotationPoint(-45F, 2F, -2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 122
		bodyModel[161].setRotationPoint(-45F, 2.22044604925031E-16F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[162].setRotationPoint(-45F, 2.22044604925031E-16F, -2F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 153
		bodyModel[163].setRotationPoint(41F, -4F, 9F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 153
		bodyModel[164].setRotationPoint(41F, -4F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 81, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[165].setRotationPoint(-41.5F, 0F, -11F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[166].setRotationPoint(41.25F, -7F, -8.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[167].setRotationPoint(41.25F, -7F, -6.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[168].setRotationPoint(41.25F, -7F, -4.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[169].setRotationPoint(41.25F, -7F, 3.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[170].setRotationPoint(41.25F, -7F, 5.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[171].setRotationPoint(41.25F, -7F, 7.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 7, 17, 0F); // Box 67
		bodyModel[172].setRotationPoint(42.2F, -7F, -8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[173].setRotationPoint(40F, -13F, -2F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 7, 5, 0F); // Box 67
		bodyModel[174].setRotationPoint(42.55F, -7F, -2.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[175].setRotationPoint(42.05F, -7F, -2.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[176].setRotationPoint(42.05F, -7F, 1.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[177].setRotationPoint(42.05F, -7F, -0.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[178].setRotationPoint(36.5F, -8F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[179].setRotationPoint(-24F, -16F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[180].setRotationPoint(-24F, -8F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[181].setRotationPoint(-12F, -16F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[182].setRotationPoint(-12F, -8F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[183].setRotationPoint(0F, -16F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[184].setRotationPoint(0F, -8F, 10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[185].setRotationPoint(12F, -16F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[186].setRotationPoint(12F, -8F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[187].setRotationPoint(24F, -16F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 182
		bodyModel[188].setRotationPoint(-43.5F, -18F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 182
		bodyModel[189].setRotationPoint(-43.5F, -13F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 182
		bodyModel[190].setRotationPoint(-43.5F, -8F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 182
		bodyModel[191].setRotationPoint(-43.5F, -3F, -10F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 102
		bodyModel[192].setRotationPoint(-43.5F, -21.5F, -4F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 102
		bodyModel[193].setRotationPoint(-43.5F, -21.5F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 182
		bodyModel[194].setRotationPoint(-43.5F, -18F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 182
		bodyModel[195].setRotationPoint(-43.5F, -19F, -9.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.25F); // Box 182
		bodyModel[196].setRotationPoint(-43.5F, -20.5F, -8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
		bodyModel[197].setRotationPoint(-43.5F, -18F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
		bodyModel[198].setRotationPoint(-43.5F, -19F, 8.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, -4.5F, -0.5F, 0.5F, -4.5F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 182
		bodyModel[199].setRotationPoint(-43.5F, -20.5F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		bodyModel[200].setRotationPoint(-43F, -21F, -2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Passenger swing door left Top
		bodyModel[201].setRotationPoint(-15.5F, -16F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Passenger swing door left Top
		bodyModel[202].setRotationPoint(-34.5F, -16F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 304
		bodyModel[203].setRotationPoint(-35.5F, 4.95F, -10.75F);

		bodyModel[204].addBox(0F, 0F, 0F, 14, 1, 2, 0F); // Box 304
		bodyModel[204].setRotationPoint(-35.5F, 4.95F, 8.75F);

		bodyModel[205].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 304
		bodyModel[205].setRotationPoint(-37.5F, 7.5F, -8.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 304
		bodyModel[206].setRotationPoint(-37.5F, 6.5F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 304
		bodyModel[207].setRotationPoint(-21.5F, 6.5F, -8.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 304
		bodyModel[208].setRotationPoint(-37.5F, 7.5F, 7.75F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 304
		bodyModel[209].setRotationPoint(-37.5F, 6.5F, 8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 304
		bodyModel[210].setRotationPoint(-21.5F, 6.5F, 8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[211].setRotationPoint(-31.5F, 2F, 7.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[212].setRotationPoint(-31.5F, 2F, 8.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[213].setRotationPoint(-31.5F, 3F, 7.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[214].setRotationPoint(-31.5F, 3F, 8.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[215].setRotationPoint(-31.5F, 2F, -9.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[216].setRotationPoint(-31.5F, 2F, -8.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[217].setRotationPoint(-31.5F, 3F, -9.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[218].setRotationPoint(-31.5F, 3F, -8.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[219].setRotationPoint(-40.5F, 2F, 5.51F);
		bodyModel[219].rotateAngleY = -0.01745329F;

		bodyModel[220].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[220].setRotationPoint(-40.5F, 2F, -5.51F);
		bodyModel[220].rotateAngleY = -0.01745329F;

		bodyModel[221].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[221].setRotationPoint(-24.5F, 2F, 5.51F);
		bodyModel[221].rotateAngleY = -0.01745329F;

		bodyModel[222].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[222].setRotationPoint(-24.5F, 2F, -5.51F);
		bodyModel[222].rotateAngleY = -0.01745329F;

		bodyModel[223].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 23
		bodyModel[223].setRotationPoint(-30.5F, 2F, -2F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[224].setRotationPoint(-37F, 5.5F, -9F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[225].setRotationPoint(-21F, 5.5F, -9F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 4, 16, 0F); // Box 22
		bodyModel[226].setRotationPoint(-31.5F, 3F, -8F);

		bodyModel[227].addBox(0F, 0F, 0F, 24, 4, 10, 0F); // Box 97
		bodyModel[227].setRotationPoint(-40.5F, 4F, -5F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[228].setRotationPoint(-37.5F, 5F, -9.25F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[229].setRotationPoint(-37.5F, 5F, 7.25F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[230].setRotationPoint(-21.5F, 5F, -9.25F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[231].setRotationPoint(-21.5F, 5F, 7.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[232].setRotationPoint(-37F, 4.25F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[233].setRotationPoint(-21F, 4.25F, -10F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 92
		bodyModel[234].setRotationPoint(-16.5F, 2.75F, -9F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 93
		bodyModel[235].setRotationPoint(-41.5F, 2.75F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[236].setRotationPoint(-38F, 3.75F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 29
		bodyModel[237].setRotationPoint(-40.5F, 3.75F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		bodyModel[238].setRotationPoint(-40.5F, 2.75F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[239].setRotationPoint(-40.5F, 3.75F, -9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[240].setRotationPoint(-40.5F, 2.75F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[241].setRotationPoint(-40F, 3.5F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[242].setRotationPoint(-35F, 3.5F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[243].setRotationPoint(-22F, 3.75F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[244].setRotationPoint(-24F, 3.5F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[245].setRotationPoint(-19F, 3.5F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[246].setRotationPoint(-38F, 3.75F, 9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 34
		bodyModel[247].setRotationPoint(-40F, 3.5F, 9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 34
		bodyModel[248].setRotationPoint(-35F, 3.5F, 9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[249].setRotationPoint(-22F, 3.75F, 9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 34
		bodyModel[250].setRotationPoint(-24F, 3.5F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 34
		bodyModel[251].setRotationPoint(-19F, 3.5F, 9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[252].setRotationPoint(-37F, 4.25F, 9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[253].setRotationPoint(-21F, 4.25F, 9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[254].setRotationPoint(32F, 4.25F, 9F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 23
		bodyModel[255].setRotationPoint(22.5F, 2F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 93
		bodyModel[256].setRotationPoint(36.5F, 5.75F, 8.25F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 93
		bodyModel[257].setRotationPoint(32.75F, 7.75F, 9F);

		bodyModel[258].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[258].setRotationPoint(28.5F, 2F, -5.51F);
		bodyModel[258].rotateAngleY = -0.01745329F;

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[259].setRotationPoint(32F, 5.5F, -9F);

		bodyModel[260].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[260].setRotationPoint(28.5F, 2F, 5.51F);
		bodyModel[260].rotateAngleY = -0.01745329F;

		bodyModel[261].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[261].setRotationPoint(12.5F, 2F, -5.51F);
		bodyModel[261].rotateAngleY = -0.01745329F;

		bodyModel[262].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 0
		bodyModel[262].setRotationPoint(16F, 5.5F, -9F);

		bodyModel[263].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[263].setRotationPoint(12.5F, 2F, 5.51F);
		bodyModel[263].rotateAngleY = -0.01745329F;

		bodyModel[264].addBox(0F, 0F, 0F, 6, 4, 16, 0F); // Box 22
		bodyModel[264].setRotationPoint(21.5F, 3F, -8F);

		bodyModel[265].addBox(0F, 0F, 0F, 24, 4, 10, 0F); // Box 97
		bodyModel[265].setRotationPoint(12.5F, 4F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[266].setRotationPoint(32F, 4.25F, -9.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[267].setRotationPoint(31.5F, 5F, 7.25F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[268].setRotationPoint(31.5F, 5F, -9.25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[269].setRotationPoint(16F, 4.25F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 34
		bodyModel[270].setRotationPoint(16F, 4.25F, -9.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[271].setRotationPoint(15.5F, 5F, 7.25F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 53
		bodyModel[272].setRotationPoint(15.5F, 5F, -9.25F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 92
		bodyModel[273].setRotationPoint(11.5F, 2.75F, -9F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 93
		bodyModel[274].setRotationPoint(36.5F, 2.75F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[275].setRotationPoint(31F, 3.75F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 29
		bodyModel[276].setRotationPoint(12.5F, 3.75F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		bodyModel[277].setRotationPoint(12.5F, 2.75F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[278].setRotationPoint(12.5F, 3.75F, 8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[279].setRotationPoint(12.5F, 2.75F, 8F);

		bodyModel[280].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 304
		bodyModel[280].setRotationPoint(30F, 4.95F, 8.75F);

		bodyModel[281].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 304
		bodyModel[281].setRotationPoint(30F, 4.95F, -10.75F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 304
		bodyModel[282].setRotationPoint(21F, 4.95F, -9.75F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 93
		bodyModel[283].setRotationPoint(38.5F, 5.75F, 5F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 93
		bodyModel[284].setRotationPoint(37.5F, 3.75F, -9F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 93
		bodyModel[285].setRotationPoint(38.5F, 5.75F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[286].setRotationPoint(21F, 4.95F, 8.75F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 93
		bodyModel[287].setRotationPoint(11.5F, 5.75F, 8.25F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 93
		bodyModel[288].setRotationPoint(12.25F, 7.75F, 9F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 93
		bodyModel[289].setRotationPoint(36.5F, 5.75F, -9.25F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 93
		bodyModel[290].setRotationPoint(32.75F, 7.75F, -9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 93
		bodyModel[291].setRotationPoint(11.5F, 5.75F, -9.25F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 93
		bodyModel[292].setRotationPoint(12.25F, 7.75F, -9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 34
		bodyModel[293].setRotationPoint(34F, 3.5F, 9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 34
		bodyModel[294].setRotationPoint(29F, 3.5F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[295].setRotationPoint(15F, 3.75F, 9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 34
		bodyModel[296].setRotationPoint(18F, 3.5F, 9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F); // Box 34
		bodyModel[297].setRotationPoint(13F, 3.5F, 9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[298].setRotationPoint(31F, 3.75F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[299].setRotationPoint(34F, 3.5F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[300].setRotationPoint(29F, 3.5F, -10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[301].setRotationPoint(15F, 3.75F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 34
		bodyModel[302].setRotationPoint(18F, 3.5F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[303].setRotationPoint(13F, 3.5F, -10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0.05F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0.05F, 0F, 2F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 2F, -1F, 0F); // Box 100
		bodyModel[304].setRotationPoint(38.5F, -19F, -3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, -1.95F, 0F, 0F, -1.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[305].setRotationPoint(33.5F, -21F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0.05F, 0F, 1F, -3F, 0F, -0.5F, -3F, 0F, 2.5F, -1F, 0F, 2F, -1F, 0F, -0.25F, 1F, 0F, -1.75F, 1F, 0F, 3.75F, -1F, 0F); // Box 100
		bodyModel[306].setRotationPoint(38.5F, -19F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, -1.95F, 0F, -2.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F); // Box 100
		bodyModel[307].setRotationPoint(33.5F, -21F, 3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -2F, 0F, -2.5F, -3F, 0F, 0F, -1.95F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[308].setRotationPoint(33.5F, -21F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,2.5F, -1F, 0F, -0.5F, -3F, 0F, 1F, -3F, 0F, 0F, 0.05F, 0F, 3.75F, -1F, 0F, -1.75F, 1F, 0F, -0.25F, 1F, 0F, 2F, -1F, 0F); // Box 357
		bodyModel[309].setRotationPoint(38.5F, -19F, -10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 33
		bodyModel[310].setRotationPoint(17F, 7.75F, 9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[311].setRotationPoint(26F, 6.75F, 9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[312].setRotationPoint(23F, 6.75F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 33
		bodyModel[313].setRotationPoint(17F, 7.75F, -10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 33
		bodyModel[314].setRotationPoint(23F, 6.75F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-3F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -3F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350
		bodyModel[315].setRotationPoint(17F, 6.75F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-3F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -3F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 351
		bodyModel[316].setRotationPoint(17F, 6.75F, -10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.25F, -3F, -0.5F, -0.25F, -3F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 352
		bodyModel[317].setRotationPoint(26F, 6.75F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 58
		bodyModel[318].setRotationPoint(23F, 9F, 9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 405
		bodyModel[319].setRotationPoint(23F, 9F, -10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Passenger swing door right Top
		bodyModel[320].setRotationPoint(4F, -16F, 11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Passenger swing door right Bottom
		bodyModel[321].setRotationPoint(4F, -8F, 11F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Passenger swing door right Top
		bodyModel[322].setRotationPoint(-8F, -16F, 11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Passenger swing door right Bottom
		bodyModel[323].setRotationPoint(-8F, -8F, 11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Passenger swing door right Top
		bodyModel[324].setRotationPoint(-20F, -16F, 11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Passenger swing door right Bottom
		bodyModel[325].setRotationPoint(-20F, -8F, 11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Passenger swing door right Top
		bodyModel[326].setRotationPoint(-32F, -16F, 11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Passenger swing door right Bottom
		bodyModel[327].setRotationPoint(-32F, -8F, 11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 182
		bodyModel[328].setRotationPoint(-43.5F, -8F, 10.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
		bodyModel[329].setRotationPoint(-43.5F, -16F, 10.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 355
		bodyModel[330].setRotationPoint(-43.5F, -8F, -11.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 356
		bodyModel[331].setRotationPoint(-43.5F, -16F, -11.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Passenger swing door left Top
		bodyModel[332].setRotationPoint(-0.5F, -16F, -12F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Passenger swing door left Bottom
		bodyModel[333].setRotationPoint(-0.5F, -8F, -12F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Passenger swing door left Top
		bodyModel[334].setRotationPoint(-15.5F, -16F, -12F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Passenger swing door left Bottom
		bodyModel[335].setRotationPoint(-15.5F, -8F, -12F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Passenger swing door left Top
		bodyModel[336].setRotationPoint(-34.5F, -16F, -12F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Passenger swing door left Bottom
		bodyModel[337].setRotationPoint(-34.5F, -8F, -12F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 364
		bodyModel[338].setRotationPoint(36.5F, -9F, -8F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 365
		bodyModel[339].setRotationPoint(37.5F, -9F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[340].setRotationPoint(-15F, -4F, 1.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[341].setRotationPoint(-23F, -9F, 1.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[342].setRotationPoint(-23F, -4F, 1.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[343].setRotationPoint(-13F, -9F, 1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[344].setRotationPoint(-27F, -4F, 1.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[345].setRotationPoint(-35F, -9F, 1.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[346].setRotationPoint(-35F, -4F, 1.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[347].setRotationPoint(-25F, -9F, 1.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 711
		bodyModel[348].setRotationPoint(-42F, -19F, 0F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[349].setRotationPoint(18F, -19F, 4.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[350].setRotationPoint(18F, -19F, -5.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[351].setRotationPoint(6F, -19F, 4.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[352].setRotationPoint(6F, -19F, -5.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[353].setRotationPoint(-6F, -19F, 4.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[354].setRotationPoint(-6F, -19F, -5.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[355].setRotationPoint(-18F, -19F, 4.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[356].setRotationPoint(-18F, -19F, -5.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[357].setRotationPoint(-30F, -19F, 4.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ceiling Lamp
		bodyModel[358].setRotationPoint(-30F, -19F, -5.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
	}
}