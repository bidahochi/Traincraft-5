//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPSCNW1DR_22SeatParlor extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCNW1DR_22SeatParlor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[638];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 131, 172, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 74, 166, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 74, 177, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[16] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[17] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[18] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[19] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[20] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[21] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[22] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[23] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[24] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[25] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[26] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[27] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[28] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[29] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[30] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[33] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[34] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[35] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[36] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[37] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[38] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[39] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[40] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[41] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[42] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[43] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[44] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[45] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[46] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[47] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[53] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[61] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[62] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[66] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[67] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 72, 221, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[71] = new ModelRendererTurbo(this, 72, 199, textureX, textureY); // Box 177
		bodyModel[72] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[74] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[75] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[76] = new ModelRendererTurbo(this, 437, 2, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 391, 9, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[79] = new ModelRendererTurbo(this, 458, 1, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 72, 205, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 72, 227, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 72, 235, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 72, 194, textureX, textureY); // Box 192
		bodyModel[86] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[87] = new ModelRendererTurbo(this, 72, 191, textureX, textureY); // Box 194
		bodyModel[88] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[102] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[103] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[104] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[105] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[106] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[107] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[108] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[109] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[110] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[111] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[112] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[113] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[114] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[115] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[116] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[118] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[120] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[121] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[122] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[123] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[124] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[126] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[127] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[128] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 310, 146, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 295, 144, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 277, 152, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 282, 145, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 282, 152, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 277, 156, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 190
		bodyModel[151] = new ModelRendererTurbo(this, 291, 169, textureX, textureY); // Box 191
		bodyModel[152] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 192
		bodyModel[153] = new ModelRendererTurbo(this, 278, 170, textureX, textureY); // Box 193
		bodyModel[154] = new ModelRendererTurbo(this, 278, 177, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 273, 181, textureX, textureY); // Box 195
		bodyModel[156] = new ModelRendererTurbo(this, 30, 144, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 41, 142, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 69, 150, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 56, 150, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 69, 154, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 30, 171, textureX, textureY); // Box 190
		bodyModel[163] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 191
		bodyModel[164] = new ModelRendererTurbo(this, 69, 177, textureX, textureY); // Box 192
		bodyModel[165] = new ModelRendererTurbo(this, 56, 170, textureX, textureY); // Box 193
		bodyModel[166] = new ModelRendererTurbo(this, 56, 177, textureX, textureY); // Box 194
		bodyModel[167] = new ModelRendererTurbo(this, 69, 181, textureX, textureY); // Box 195
		bodyModel[168] = new ModelRendererTurbo(this, 360, 86, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 363, 103, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 362, 97, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 361, 91, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 359, 83, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[174] = new ModelRendererTurbo(this, 363, 67, textureX, textureY); // Box 250
		bodyModel[175] = new ModelRendererTurbo(this, 362, 72, textureX, textureY); // Box 252
		bodyModel[176] = new ModelRendererTurbo(this, 361, 77, textureX, textureY); // Box 254
		bodyModel[177] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[178] = new ModelRendererTurbo(this, 374, 102, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 373, 96, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 372, 90, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 370, 82, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 389, 45, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 397, 46, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[186] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 249
		bodyModel[187] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Box 251
		bodyModel[188] = new ModelRendererTurbo(this, 372, 76, textureX, textureY); // Box 253
		bodyModel[189] = new ModelRendererTurbo(this, 383, 46, textureX, textureY); // Box 255
		bodyModel[190] = new ModelRendererTurbo(this, 393, 52, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 383, 52, textureX, textureY); // Box 153
		bodyModel[192] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[201] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[203] = new ModelRendererTurbo(this, 16, 115, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 6, 115, textureX, textureY); // Box 153
		bodyModel[205] = new ModelRendererTurbo(this, 12, 108, textureX, textureY); // Box 128
		bodyModel[206] = new ModelRendererTurbo(this, 20, 109, textureX, textureY); // Box 128
		bodyModel[207] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[208] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[209] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[210] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[211] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[212] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[213] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[214] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[215] = new ModelRendererTurbo(this, 6, 109, textureX, textureY); // Box 255
		bodyModel[216] = new ModelRendererTurbo(this, 12, 114, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 389, 51, textureX, textureY); // Box 128
		bodyModel[218] = new ModelRendererTurbo(this, 402, 54, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 378, 54, textureX, textureY); // Box 259
		bodyModel[220] = new ModelRendererTurbo(this, 396, 52, textureX, textureY); // Box 128
		bodyModel[221] = new ModelRendererTurbo(this, 378, 52, textureX, textureY); // Box 261
		bodyModel[222] = new ModelRendererTurbo(this, 19, 115, textureX, textureY); // Box 128
		bodyModel[223] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 261
		bodyModel[224] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[226] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[227] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[228] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 62, 101, textureX, textureY); // Box 204
		bodyModel[230] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[232] = new ModelRendererTurbo(this, 320, 20, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 319, 16, textureX, textureY); // Box 128
		bodyModel[234] = new ModelRendererTurbo(this, 309, 20, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 308, 16, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 309, 1, textureX, textureY); // Box 270
		bodyModel[237] = new ModelRendererTurbo(this, 308, 6, textureX, textureY); // Box 271
		bodyModel[238] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 270
		bodyModel[239] = new ModelRendererTurbo(this, 86, 6, textureX, textureY); // Box 271
		bodyModel[240] = new ModelRendererTurbo(this, 320, 1, textureX, textureY); // Box 278
		bodyModel[241] = new ModelRendererTurbo(this, 319, 6, textureX, textureY); // Box 279
		bodyModel[242] = new ModelRendererTurbo(this, 76, 1, textureX, textureY); // Box 278
		bodyModel[243] = new ModelRendererTurbo(this, 75, 6, textureX, textureY); // Box 279
		bodyModel[244] = new ModelRendererTurbo(this, 112, 155, textureX, textureY); // Box 52
		bodyModel[245] = new ModelRendererTurbo(this, 160, 174, textureX, textureY); // Box 283
		bodyModel[246] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 284
		bodyModel[247] = new ModelRendererTurbo(this, 147, 172, textureX, textureY); // Box 41
		bodyModel[248] = new ModelRendererTurbo(this, 162, 173, textureX, textureY); // Box 41
		bodyModel[249] = new ModelRendererTurbo(this, 144, 173, textureX, textureY); // Box 41
		bodyModel[250] = new ModelRendererTurbo(this, 147, 160, textureX, textureY); // Box 41
		bodyModel[251] = new ModelRendererTurbo(this, 166, 156, textureX, textureY); // Box 41
		bodyModel[252] = new ModelRendererTurbo(this, 144, 156, textureX, textureY); // Box 41
		bodyModel[253] = new ModelRendererTurbo(this, 147, 155, textureX, textureY); // Box 41
		bodyModel[254] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 41
		bodyModel[255] = new ModelRendererTurbo(this, 144, 161, textureX, textureY); // Box 41
		bodyModel[256] = new ModelRendererTurbo(this, 179, 172, textureX, textureY); // Box 283
		bodyModel[257] = new ModelRendererTurbo(this, 190, 175, textureX, textureY); // Box 41
		bodyModel[258] = new ModelRendererTurbo(this, 195, 182, textureX, textureY); // Box 41
		bodyModel[259] = new ModelRendererTurbo(this, 195, 172, textureX, textureY); // Box 41
		bodyModel[260] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box 283
		bodyModel[261] = new ModelRendererTurbo(this, 203, 173, textureX, textureY); // Box 283
		bodyModel[262] = new ModelRendererTurbo(this, 205, 172, textureX, textureY); // Box 283
		bodyModel[263] = new ModelRendererTurbo(this, 169, 155, textureX, textureY); // Box 304
		bodyModel[264] = new ModelRendererTurbo(this, 201, 156, textureX, textureY); // Box 41
		bodyModel[265] = new ModelRendererTurbo(this, 214, 157, textureX, textureY); // Box 41
		bodyModel[266] = new ModelRendererTurbo(this, 198, 157, textureX, textureY); // Box 41
		bodyModel[267] = new ModelRendererTurbo(this, 217, 155, textureX, textureY); // Box 304
		bodyModel[268] = new ModelRendererTurbo(this, 221, 167, textureX, textureY); // Box 41
		bodyModel[269] = new ModelRendererTurbo(this, 238, 168, textureX, textureY); // Box 41
		bodyModel[270] = new ModelRendererTurbo(this, 218, 168, textureX, textureY); // Box 41
		bodyModel[271] = new ModelRendererTurbo(this, 246, 173, textureX, textureY); // Box 283
		bodyModel[272] = new ModelRendererTurbo(this, 25, 117, textureX, textureY); // Box 128
		bodyModel[273] = new ModelRendererTurbo(this, 1, 117, textureX, textureY); // Box 259
		bodyModel[274] = new ModelRendererTurbo(this, 441, 262, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 38
		bodyModel[276] = new ModelRendererTurbo(this, 207, 270, textureX, textureY); // Box 38
		bodyModel[277] = new ModelRendererTurbo(this, 195, 298, textureX, textureY); // Box 38
		bodyModel[278] = new ModelRendererTurbo(this, 424, 52, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 438, 71, textureX, textureY); // Box 128
		bodyModel[280] = new ModelRendererTurbo(this, 438, 47, textureX, textureY); // Box 185
		bodyModel[281] = new ModelRendererTurbo(this, 1, 244, textureX, textureY); // Box 128
		bodyModel[282] = new ModelRendererTurbo(this, 15, 263, textureX, textureY); // Box 128
		bodyModel[283] = new ModelRendererTurbo(this, 15, 239, textureX, textureY); // Box 185
		bodyModel[284] = new ModelRendererTurbo(this, 176, 250, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[285] = new ModelRendererTurbo(this, 177, 244, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[286] = new ModelRendererTurbo(this, 177, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[287] = new ModelRendererTurbo(this, 270, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[288] = new ModelRendererTurbo(this, 263, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[289] = new ModelRendererTurbo(this, 256, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[290] = new ModelRendererTurbo(this, 249, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[291] = new ModelRendererTurbo(this, 242, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[292] = new ModelRendererTurbo(this, 127, 263, textureX, textureY); // Box 38
		bodyModel[293] = new ModelRendererTurbo(this, 116, 289, textureX, textureY); // Box 38
		bodyModel[294] = new ModelRendererTurbo(this, 170, 298, textureX, textureY); // Box 38
		bodyModel[295] = new ModelRendererTurbo(this, 21, 289, textureX, textureY); // Box 38
		bodyModel[296] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 38
		bodyModel[297] = new ModelRendererTurbo(this, 111, 303, textureX, textureY); // Box 38
		bodyModel[298] = new ModelRendererTurbo(this, 121, 268, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 53, 303, textureX, textureY); // Box 38
		bodyModel[300] = new ModelRendererTurbo(this, 55, 268, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 146, 272, textureX, textureY); // Box 38
		bodyModel[302] = new ModelRendererTurbo(this, 50, 268, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 86, 268, textureX, textureY); // Box 38
		bodyModel[304] = new ModelRendererTurbo(this, 60, 268, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 75, 268, textureX, textureY); // Box 38
		bodyModel[306] = new ModelRendererTurbo(this, 483, 297, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 458, 303, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 458, 312, textureX, textureY); // Box 38
		bodyModel[309] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 458, 268, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 501, 266, textureX, textureY); // Box 38
		bodyModel[312] = new ModelRendererTurbo(this, 489, 266, textureX, textureY); // Box 38
		bodyModel[313] = new ModelRendererTurbo(this, 498, 269, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 441, 286, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[315] = new ModelRendererTurbo(this, 6, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[316] = new ModelRendererTurbo(this, 3, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[317] = new ModelRendererTurbo(this, 0, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[318] = new ModelRendererTurbo(this, 28, 291, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[319] = new ModelRendererTurbo(this, 192, 258, textureX, textureY); // Box 38
		bodyModel[320] = new ModelRendererTurbo(this, 192, 264, textureX, textureY); // Box 462
		bodyModel[321] = new ModelRendererTurbo(this, 67, 297, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 462
		bodyModel[323] = new ModelRendererTurbo(this, 499, 253, textureX, textureY); // Box 38
		bodyModel[324] = new ModelRendererTurbo(this, 504, 258, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 503, 262, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 472, 330, textureX, textureY); // Box 368
		bodyModel[327] = new ModelRendererTurbo(this, 471, 334, textureX, textureY); // Box 369
		bodyModel[328] = new ModelRendererTurbo(this, 469, 325, textureX, textureY); // Box 370
		bodyModel[329] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 379
		bodyModel[330] = new ModelRendererTurbo(this, 456, 325, textureX, textureY); // Box 380
		bodyModel[331] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 339
		bodyModel[332] = new ModelRendererTurbo(this, 490, 251, textureX, textureY); // Box 340
		bodyModel[333] = new ModelRendererTurbo(this, 480, 251, textureX, textureY); // Box 339
		bodyModel[334] = new ModelRendererTurbo(this, 479, 255, textureX, textureY); // Box 340
		bodyModel[335] = new ModelRendererTurbo(this, 491, 258, textureX, textureY); // Box 41
		bodyModel[336] = new ModelRendererTurbo(this, 459, 330, textureX, textureY); // Box 382
		bodyModel[337] = new ModelRendererTurbo(this, 485, 260, textureX, textureY); // Box 41
		bodyModel[338] = new ModelRendererTurbo(this, 466, 241, textureX, textureY); // Box 462
		bodyModel[339] = new ModelRendererTurbo(this, 479, 322, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 478, 263, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[341] = new ModelRendererTurbo(this, 464, 333, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[342] = new ModelRendererTurbo(this, 496, 261, textureX, textureY); // Box 347
		bodyModel[343] = new ModelRendererTurbo(this, 441, 254, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 454, 254, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 454, 260, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[346] = new ModelRendererTurbo(this, 458, 246, textureX, textureY); // Box 38
		bodyModel[347] = new ModelRendererTurbo(this, 471, 263, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[348] = new ModelRendererTurbo(this, 72, 376, textureX, textureY); // Box 492
		bodyModel[349] = new ModelRendererTurbo(this, 77, 393, textureX, textureY); // Box 493
		bodyModel[350] = new ModelRendererTurbo(this, 58, 380, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[351] = new ModelRendererTurbo(this, 88, 380, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[352] = new ModelRendererTurbo(this, 73, 383, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[353] = new ModelRendererTurbo(this, 74, 348, textureX, textureY); // Box 492
		bodyModel[354] = new ModelRendererTurbo(this, 102, 354, textureX, textureY); // Box 493
		bodyModel[355] = new ModelRendererTurbo(this, 91, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[356] = new ModelRendererTurbo(this, 91, 342, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[357] = new ModelRendererTurbo(this, 89, 354, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[358] = new ModelRendererTurbo(this, 75, 310, textureX, textureY); // Box 492
		bodyModel[359] = new ModelRendererTurbo(this, 103, 316, textureX, textureY); // Box 493
		bodyModel[360] = new ModelRendererTurbo(this, 91, 330, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[361] = new ModelRendererTurbo(this, 92, 304, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[362] = new ModelRendererTurbo(this, 90, 316, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[363] = new ModelRendererTurbo(this, 69, 318, textureX, textureY); // Box 492
		bodyModel[364] = new ModelRendererTurbo(this, 53, 316, textureX, textureY); // Box 493
		bodyModel[365] = new ModelRendererTurbo(this, 58, 330, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[366] = new ModelRendererTurbo(this, 58, 304, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[367] = new ModelRendererTurbo(this, 56, 316, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[368] = new ModelRendererTurbo(this, 69, 356, textureX, textureY); // Box 492
		bodyModel[369] = new ModelRendererTurbo(this, 53, 354, textureX, textureY); // Box 493
		bodyModel[370] = new ModelRendererTurbo(this, 58, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[371] = new ModelRendererTurbo(this, 58, 342, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[372] = new ModelRendererTurbo(this, 56, 354, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[373] = new ModelRendererTurbo(this, 495, 227, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 176, 239, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[375] = new ModelRendererTurbo(this, 65, 159, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[376] = new ModelRendererTurbo(this, 65, 157, textureX, textureY); // Box 31
		bodyModel[377] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[378] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[379] = new ModelRendererTurbo(this, 188, 329, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 188, 326, textureX, textureY); // Box 589
		bodyModel[381] = new ModelRendererTurbo(this, 151, 258, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 9, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[383] = new ModelRendererTurbo(this, 85, 292, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[384] = new ModelRendererTurbo(this, 115, 341, textureX, textureY); // Box 492
		bodyModel[385] = new ModelRendererTurbo(this, 180, 342, textureX, textureY); // Box 492
		bodyModel[386] = new ModelRendererTurbo(this, 177, 353, textureX, textureY); // Box 492
		bodyModel[387] = new ModelRendererTurbo(this, 153, 340, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 173, 344, textureX, textureY,"lamp"); // Box 492 glow
		bodyModel[389] = new ModelRendererTurbo(this, 172, 328, textureX, textureY); // Box 492
		bodyModel[390] = new ModelRendererTurbo(this, 176, 322, textureX, textureY); // Box 493
		bodyModel[391] = new ModelRendererTurbo(this, 155, 322, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[392] = new ModelRendererTurbo(this, 188, 332, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[393] = new ModelRendererTurbo(this, 173, 334, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[394] = new ModelRendererTurbo(this, 98, 1, textureX, textureY); // Box 270
		bodyModel[395] = new ModelRendererTurbo(this, 97, 6, textureX, textureY); // Box 271
		bodyModel[396] = new ModelRendererTurbo(this, 149, 303, textureX, textureY); // Box 38
		bodyModel[397] = new ModelRendererTurbo(this, 12, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[398] = new ModelRendererTurbo(this, 184, 272, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 184, 281, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 73, 290, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 156, 303, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 163, 303, textureX, textureY); // Box 38
		bodyModel[403] = new ModelRendererTurbo(this, 117, 321, textureX, textureY); // Box 492
		bodyModel[404] = new ModelRendererTurbo(this, 173, 340, textureX, textureY); // Box 492
		bodyModel[405] = new ModelRendererTurbo(this, 190, 354, textureX, textureY,"lamp"); // Box 492 glow
		bodyModel[406] = new ModelRendererTurbo(this, 190, 350, textureX, textureY); // Box 492
		bodyModel[407] = new ModelRendererTurbo(this, 166, 344, textureX, textureY,"lamp"); // Box 492 glow
		bodyModel[408] = new ModelRendererTurbo(this, 166, 340, textureX, textureY); // Box 492
		bodyModel[409] = new ModelRendererTurbo(this, 166, 352, textureX, textureY,"lamp"); // Box 492 glow
		bodyModel[410] = new ModelRendererTurbo(this, 166, 348, textureX, textureY); // Box 492
		bodyModel[411] = new ModelRendererTurbo(this, 322, 352, textureX, textureY); // Left seat part
		bodyModel[412] = new ModelRendererTurbo(this, 294, 352, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 301, 348, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 294, 361, textureX, textureY); // Left seat part
		bodyModel[415] = new ModelRendererTurbo(this, 294, 358, textureX, textureY); // Left seat part
		bodyModel[416] = new ModelRendererTurbo(this, 320, 361, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 320, 358, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 307, 361, textureX, textureY); // Left seat part
		bodyModel[419] = new ModelRendererTurbo(this, 357, 352, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 329, 352, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 336, 348, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 329, 361, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 329, 358, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 355, 361, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 355, 358, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 342, 361, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 392, 352, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 364, 352, textureX, textureY); // Left seat part
		bodyModel[429] = new ModelRendererTurbo(this, 371, 348, textureX, textureY); // Left seat part
		bodyModel[430] = new ModelRendererTurbo(this, 364, 361, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 364, 358, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 390, 361, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 390, 358, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 377, 361, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 259, 308, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 287, 308, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 266, 304, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 285, 317, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 285, 314, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 259, 317, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 259, 314, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 272, 317, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 294, 308, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 322, 308, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 301, 304, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 320, 317, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 320, 314, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 294, 317, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 294, 314, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 307, 317, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 329, 308, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 357, 308, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 336, 304, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 355, 317, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 355, 314, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 329, 317, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 329, 314, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 342, 317, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 364, 308, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 392, 308, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 390, 317, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 390, 314, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 364, 317, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 364, 314, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 371, 304, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 377, 317, textureX, textureY); // Right seat part
		bodyModel[467] = new ModelRendererTurbo(this, 252, 352, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 224, 352, textureX, textureY); // Left seat part
		bodyModel[469] = new ModelRendererTurbo(this, 231, 348, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 224, 361, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 224, 358, textureX, textureY); // Left seat part
		bodyModel[472] = new ModelRendererTurbo(this, 250, 361, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 250, 358, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 237, 361, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 287, 352, textureX, textureY); // Left seat part
		bodyModel[476] = new ModelRendererTurbo(this, 259, 352, textureX, textureY); // Left seat part
		bodyModel[477] = new ModelRendererTurbo(this, 266, 348, textureX, textureY); // Left seat part
		bodyModel[478] = new ModelRendererTurbo(this, 259, 361, textureX, textureY); // Left seat part
		bodyModel[479] = new ModelRendererTurbo(this, 259, 358, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 285, 361, textureX, textureY); // Left seat part
		bodyModel[481] = new ModelRendererTurbo(this, 285, 358, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 272, 361, textureX, textureY); // Left seat part
		bodyModel[483] = new ModelRendererTurbo(this, 224, 308, textureX, textureY); // Right seat part
		bodyModel[484] = new ModelRendererTurbo(this, 252, 308, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 231, 304, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 235, 288, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 224, 317, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 250, 314, textureX, textureY); // Right seat part
		bodyModel[489] = new ModelRendererTurbo(this, 250, 317, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 224, 314, textureX, textureY); // Right seat part
		bodyModel[491] = new ModelRendererTurbo(this, 237, 317, textureX, textureY); // Right seat part
		bodyModel[492] = new ModelRendererTurbo(this, 236, 298, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 254, 302, textureX, textureY); // Right seat part
		bodyModel[494] = new ModelRendererTurbo(this, 224, 302, textureX, textureY); // Right seat part
		bodyModel[495] = new ModelRendererTurbo(this, 236, 311, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 270, 288, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 271, 298, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 289, 302, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 259, 302, textureX, textureY); // Right seat part

		bodyModel[0].addBox(0F, 0F, 0F, 114, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-59.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(58.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(54.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(57.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[4].setRotationPoint(54.5F, 3F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-61.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-59.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 109, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-54.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(42F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-44F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[10].setRotationPoint(27.5F, 3F, 3F);

		bodyModel[11].addBox(0F, 0F, 0F, 25, 4, 6, 0F); // Box 2
		bodyModel[11].setRotationPoint(7.5F, 4F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(7.5F, 8F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[13].setRotationPoint(58.51F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[14].setRotationPoint(54.49F, 3F, -9F);

		bodyModel[15].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[15].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[16].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[17].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[17].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[18].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[18].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[19].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[19].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[20].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[20].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[21].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[22].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[23].setRotationPoint(58.49F, 4F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[24].setRotationPoint(58.49F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[25].setRotationPoint(58.49F, 4F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[26].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[27].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[27].setRotationPoint(54.51F, 4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[28].setRotationPoint(58.51F, 3F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[29].setRotationPoint(54.49F, 3F, 8F);

		bodyModel[30].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[30].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[31].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[32].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[33].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[33].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[34].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[35].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[35].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[36].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[37].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[37].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[38].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[38].setRotationPoint(58.49F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[39].setRotationPoint(58.49F, 4F, 8F);

		bodyModel[40].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[40].setRotationPoint(58.49F, 4F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[41].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[42].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[42].setRotationPoint(54.51F, 4F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[43].setRotationPoint(54.5F, 1F, -10.99F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[44].setRotationPoint(54.5F, 1F, 4.99F);

		bodyModel[45].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[45].setRotationPoint(54.51F, -14F, -10.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 114, 16, 1, 0F); // Box 38
		bodyModel[46].setRotationPoint(-59.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 114, 16, 1, 0F); // Box 128
		bodyModel[47].setRotationPoint(-59.5F, -15F, 10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[48].setRotationPoint(53.5F, -15F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[49].setRotationPoint(53.5F, -15F, 3F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[50].setRotationPoint(58.5F, -15F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[51].setRotationPoint(58.5F, -15F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[52].setRotationPoint(54.51F, -14F, 10.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[53].setRotationPoint(-59.5F, -15F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[54].setRotationPoint(-59.5F, -15F, 3F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[55].setRotationPoint(53.5F, -15F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[56].setRotationPoint(58.5F, -15F, -3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[57].setRotationPoint(-59.5F, -15F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[58].setRotationPoint(54.5F, -15F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[59].setRotationPoint(54.5F, -15F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[60].setRotationPoint(53.51F, -14F, 3F);

		bodyModel[61].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[61].setRotationPoint(-58.49F, -14F, -3F);

		bodyModel[62].addBox(0F, 0F, 0F, 119, 2, 6, 0F); // Box 128
		bodyModel[62].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-59.5F, -20F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-59.5F, -19F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[65].setRotationPoint(-59.5F, -20F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 119, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[66].setRotationPoint(-59.5F, -19F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[67].setRotationPoint(-59.5F, -17F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[68].setRotationPoint(-59.5F, -18F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(-59.5F, -19F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[70].setRotationPoint(-59.5F, -18F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 119, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[71].setRotationPoint(-59.5F, -19F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 119, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[72].setRotationPoint(-59.5F, -16F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 119, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[73].setRotationPoint(-59.5F, -16F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[74].setRotationPoint(59.5F, -7F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[75].setRotationPoint(59.5F, -7F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[76].setRotationPoint(53.5F, -17F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[77].setRotationPoint(53.5F, -18F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[78].setRotationPoint(53.5F, -18F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[79].setRotationPoint(53.5F, -16.25F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-59.5F, -16.25F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 119, 1, 14, 0F); // Box 128
		bodyModel[81].setRotationPoint(-59.5F, -18F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 112, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[82].setRotationPoint(-58.5F, -17F, -8.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 112, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[83].setRotationPoint(-58.5F, -16F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 112, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[84].setRotationPoint(-58.5F, -18F, -8.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 112, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[85].setRotationPoint(-58.5F, -17F, 5.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 112, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[86].setRotationPoint(-58.5F, -16F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 112, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[87].setRotationPoint(-58.5F, -18F, 7.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[88].setRotationPoint(58.5F, 3F, 10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[89].setRotationPoint(58.5F, 4F, 10.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[90].setRotationPoint(53.5F, 4F, 10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[91].setRotationPoint(51.25F, 3F, 10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[92].setRotationPoint(52F, 4F, 10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[93].setRotationPoint(-59.5F, 4F, 10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[94].setRotationPoint(-59.5F, 3F, 10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[95].setRotationPoint(-52.25F, 3F, 10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[96].setRotationPoint(-54F, 4F, 10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[97].setRotationPoint(33.75F, 3F, 10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[98].setRotationPoint(32F, 4F, 10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[99].setRotationPoint(-34.75F, 3F, 10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[100].setRotationPoint(-34F, 4F, 10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[101].setRotationPoint(-33.5F, 3F, 10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[102].setRotationPoint(-32.5F, 4F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[103].setRotationPoint(58.5F, 3F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[104].setRotationPoint(58.5F, 4F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[105].setRotationPoint(53.5F, 4F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[106].setRotationPoint(51.25F, 3F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[107].setRotationPoint(52F, 4F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[108].setRotationPoint(-59.5F, 4F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[109].setRotationPoint(-59.5F, 3F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[110].setRotationPoint(-52.25F, 3F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[111].setRotationPoint(-54F, 4F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[112].setRotationPoint(33.75F, 3F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[113].setRotationPoint(32F, 4F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[114].setRotationPoint(-34.75F, 3F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[115].setRotationPoint(-34F, 4F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[116].setRotationPoint(-33.5F, 3F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[117].setRotationPoint(-32.5F, 4F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[118].setRotationPoint(52.5F, 3F, 10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[119].setRotationPoint(52.5F, 3F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[120].setRotationPoint(54.5F, 3F, -10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[121].setRotationPoint(54.5F, 4F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[122].setRotationPoint(58.5F, 3F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[123].setRotationPoint(58.5F, 4F, -10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[124].setRotationPoint(54.5F, 3F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[125].setRotationPoint(54.5F, 4F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[126].setRotationPoint(58.5F, 3F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[127].setRotationPoint(58.5F, 4F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(59.5F, -15F, -4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(59.5F, 1F, -4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(59.5F, -14F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(59.5F, -14F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(61F, -14F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(61F, -14F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(61F, 1F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[135].setRotationPoint(61F, -15F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-61F, -15F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-61F, 1F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(-61F, -14F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(-61F, -14F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(-61.5F, -14F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(-61.5F, -14F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-61.5F, 1F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-61.5F, -15F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[144].setRotationPoint(59F, 4F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[145].setRotationPoint(59F, 3F, -10.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[146].setRotationPoint(59F, 4F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[147].setRotationPoint(59F, 4F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[148].setRotationPoint(59F, 5F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[149].setRotationPoint(59F, 5.5F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[150].setRotationPoint(59F, 4F, 1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[151].setRotationPoint(59F, 3F, 4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[152].setRotationPoint(59F, 4F, 9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[153].setRotationPoint(59F, 4F, 5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[154].setRotationPoint(59F, 5F, 5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[155].setRotationPoint(59F, 5.5F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[156].setRotationPoint(-59.5F, 4F, -5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[157].setRotationPoint(-59.5F, 3F, -10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[158].setRotationPoint(-59.5F, 4F, -10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[159].setRotationPoint(-59.5F, 4F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[160].setRotationPoint(-59.5F, 5F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[161].setRotationPoint(-59.5F, 5.5F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[162].setRotationPoint(-59.5F, 4F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[163].setRotationPoint(-59.5F, 3F, 4.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[164].setRotationPoint(-59.5F, 4F, 9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[165].setRotationPoint(-59.5F, 4F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[166].setRotationPoint(-59.5F, 5F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[167].setRotationPoint(-59.5F, 5.5F, 9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[168].setRotationPoint(59.5F, -15F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[169].setRotationPoint(59.5F, -15F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(59.5F, -19F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(59.5F, -20F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(59.5F, -20F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[173].setRotationPoint(59.5F, -15F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[174].setRotationPoint(59.5F, -15F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[175].setRotationPoint(59.5F, -19F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[176].setRotationPoint(59.5F, -20F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[177].setRotationPoint(61F, -15F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[178].setRotationPoint(61F, -16F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(61F, 1F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(61F, -19F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(61F, -20F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(61F, -20F, -3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[183].setRotationPoint(61F, -19F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[184].setRotationPoint(61F, -18.75F, -5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[185].setRotationPoint(61F, -15F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[186].setRotationPoint(61F, -16F, 9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[187].setRotationPoint(61F, -19F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[188].setRotationPoint(61F, -20F, 3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[189].setRotationPoint(61F, -18.75F, 4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[190].setRotationPoint(61F, -16F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[191].setRotationPoint(61F, -16F, 1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[192].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[193].setRotationPoint(-61F, -15F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[194].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[195].setRotationPoint(-61F, -15F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[196].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[197].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[198].setRotationPoint(-61F, -19F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[199].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[200].setRotationPoint(-61F, -20F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[201].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[202].setRotationPoint(-61F, -20F, -3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[203].setRotationPoint(-61.5F, -16F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[204].setRotationPoint(-61.5F, -16F, 1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[205].setRotationPoint(-61.5F, -19F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[206].setRotationPoint(-61.5F, -18.75F, -5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[207].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[208].setRotationPoint(-61F, -15F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[209].setRotationPoint(-61.5F, -16F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[210].setRotationPoint(-61F, -15F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[211].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[212].setRotationPoint(-61F, -19F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[213].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[214].setRotationPoint(-61F, -20F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[215].setRotationPoint(-61.5F, -18.75F, 4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[216].setRotationPoint(-61.5F, -15.8F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[217].setRotationPoint(61F, -15.8F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[218].setRotationPoint(61F, -16F, -5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[219].setRotationPoint(61F, -16F, 4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[220].setRotationPoint(61.5F, -7F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[221].setRotationPoint(61.5F, -7F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[222].setRotationPoint(-61.5F, -7F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[223].setRotationPoint(-61.5F, -7F, 5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[224].setRotationPoint(54F, -6F, -12F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[225].setRotationPoint(59F, -6F, -12F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[226].setRotationPoint(54F, -6F, 11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[227].setRotationPoint(59F, -6F, 11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[228].setRotationPoint(-59.5F, -4.5F, -12F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[229].setRotationPoint(-59.5F, -4.5F, 11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[230].setRotationPoint(-59.5F, -1F, -12F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[231].setRotationPoint(-59.5F, -1F, 11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[232].setRotationPoint(50.75F, -18F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[233].setRotationPoint(50.75F, -18.5F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[234].setRotationPoint(50.5F, -18F, 10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[235].setRotationPoint(50.5F, -18.5F, 8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 270
		bodyModel[236].setRotationPoint(50.5F, -18F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 271
		bodyModel[237].setRotationPoint(50.5F, -18.5F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 270
		bodyModel[238].setRotationPoint(-47F, -18F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 271
		bodyModel[239].setRotationPoint(-47F, -18.5F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[240].setRotationPoint(50.75F, -18F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[241].setRotationPoint(50.75F, -18.5F, -10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[242].setRotationPoint(-50.25F, -18F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[243].setRotationPoint(-50.25F, -18.5F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[244].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 283
		bodyModel[245].setRotationPoint(11.5F, 3F, 5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[246].setRotationPoint(27.5F, 3F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[247].setRotationPoint(19.5F, 2.75F, 9.4F);
		bodyModel[247].rotateAngleX = -0.78539816F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[248].setRotationPoint(19.49F, 3F, 8.9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[249].setRotationPoint(24.51F, 3F, 8.9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[250].setRotationPoint(-0.5F, 2.75F, -9.4F);
		bodyModel[250].rotateAngleX = -0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[251].setRotationPoint(-0.51F, 3F, -9.9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[252].setRotationPoint(6.51F, 3F, -9.9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[253].setRotationPoint(-0.5F, 2.75F, -6.9F);
		bodyModel[253].rotateAngleX = -0.78539816F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[254].setRotationPoint(-0.51F, 3F, -7.4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[255].setRotationPoint(6.51F, 3F, -7.4F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 283
		bodyModel[256].setRotationPoint(9.5F, 3F, 6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[257].setRotationPoint(6.5F, 2.75F, 6F);
		bodyModel[257].rotateAngleZ = -0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[258].setRotationPoint(6F, 3F, 5.99F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[259].setRotationPoint(6F, 3F, 10.01F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 283
		bodyModel[260].setRotationPoint(2.5F, 3F, 9F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 283
		bodyModel[261].setRotationPoint(0.5F, 3F, 8F);

		bodyModel[262].addBox(0F, 0F, 0F, 15, 5, 5, 0F); // Box 283
		bodyModel[262].setRotationPoint(-15.5F, 3F, 5F);

		bodyModel[263].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 304
		bodyModel[263].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[264].setRotationPoint(-20.5F, 2.75F, -9.4F);
		bodyModel[264].rotateAngleX = -0.78539816F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[265].setRotationPoint(-20.51F, 3F, -9.9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[266].setRotationPoint(-16.49F, 3F, -9.9F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 304
		bodyModel[267].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[268].setRotationPoint(-31.5F, 4F, 0F);
		bodyModel[268].rotateAngleX = -0.78539816F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[269].setRotationPoint(-31.51F, 4F, -0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[270].setRotationPoint(-25.49F, 4F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 283
		bodyModel[271].setRotationPoint(-26.5F, 3F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[272].setRotationPoint(-61.5F, -16F, -5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[273].setRotationPoint(-61.5F, -16F, 4F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[274].setRotationPoint(38.5F, -15F, 3F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[275].setRotationPoint(38.5F, -15F, -10F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[276].setRotationPoint(-19.5F, -15F, 3F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[277].setRotationPoint(-19.5F, -15F, -10F);

		bodyModel[278].addBox(0F, 0F, 0F, 15, 2, 16, 0F); // Box 128
		bodyModel[278].setRotationPoint(38.5F, -17F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[279].setRotationPoint(38.5F, -17F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[280].setRotationPoint(38.5F, -17F, 8F);

		bodyModel[281].addBox(0F, 0F, 0F, 40, 2, 16, 0F); // Box 128
		bodyModel[281].setRotationPoint(-58.5F, -17F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 40, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[282].setRotationPoint(-58.5F, -17F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 40, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[283].setRotationPoint(-58.5F, -17F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[284].setRotationPoint(-18.5F, -14F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 57, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[285].setRotationPoint(-18.5F, -12.99F, 7.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 57, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[286].setRotationPoint(-18.5F, -12.99F, -9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[287].setRotationPoint(-12F, -17F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[288].setRotationPoint(-1.5F, -17F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[289].setRotationPoint(9F, -17F, -0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[290].setRotationPoint(19.5F, -17F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[291].setRotationPoint(30F, -17F, -0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 38
		bodyModel[292].setRotationPoint(-25.5F, -15F, 3F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[293].setRotationPoint(-38.5F, -15F, -10F);

		bodyModel[294].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 38
		bodyModel[294].setRotationPoint(-24.5F, -15F, -10F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[295].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[296].setRotationPoint(-58.5F, -15F, -10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[297].setRotationPoint(-39.5F, -15F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[298].setRotationPoint(-39.5F, -15F, 4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[299].setRotationPoint(-54.5F, -15F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[300].setRotationPoint(-54.5F, -15F, 4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[301].setRotationPoint(-29.5F, -15F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[302].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[303].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 38
		bodyModel[303].setRotationPoint(-44.5F, -15F, 5F);

		bodyModel[304].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[304].setRotationPoint(-54.5F, -15F, 5F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[305].setRotationPoint(-48.5F, -15F, 5F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[306].setRotationPoint(44.5F, -15F, -10F);

		bodyModel[307].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[307].setRotationPoint(39.5F, -11F, -10F);

		bodyModel[308].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[308].setRotationPoint(39.5F, -5F, -10F);

		bodyModel[309].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[309].setRotationPoint(47.5F, -15F, -4F);

		bodyModel[310].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 38
		bodyModel[310].setRotationPoint(39.5F, -15F, 3F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[311].setRotationPoint(46F, -15F, 4F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[312].setRotationPoint(48F, -15F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 38
		bodyModel[313].setRotationPoint(47F, -15F, 7F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[314].setRotationPoint(46F, -14.99F, -0.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[315].setRotationPoint(-43F, -14.99F, 7.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[316].setRotationPoint(-51F, -14.99F, 7.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[317].setRotationPoint(-57.5F, -14.99F, -0.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 13, 0, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 384 glow
		bodyModel[318].setRotationPoint(-53F, -14.99F, -8.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 57, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[319].setRotationPoint(-18.5F, -11F, -9.9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 57, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[320].setRotationPoint(-18.5F, -11F, 9.9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 14, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[321].setRotationPoint(-53.5F, -11F, -9.9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 34, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[322].setRotationPoint(-58.5F, -11F, 9.9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[323].setRotationPoint(52.05F, -2F, 9.95F);
		bodyModel[323].rotateAngleY = -2.35619449F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[324].setRotationPoint(52.4F, -1F, 9.6F);
		bodyModel[324].rotateAngleY = -2.35619449F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[325].setRotationPoint(52.05F, 0.5F, 9.95F);
		bodyModel[325].rotateAngleY = -2.35619449F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[326].setRotationPoint(51.15F, -1F, -8.35F);
		bodyModel[326].rotateAngleY = -0.78539816F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[327].setRotationPoint(50.45F, 0.5F, -8.35F);
		bodyModel[327].rotateAngleY = -0.78539816F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[328].setRotationPoint(49.55F, -2F, -8.9F);
		bodyModel[328].rotateAngleY = -0.78539816F;

		bodyModel[329].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 379
		bodyModel[329].setRotationPoint(47.5F, -8.5F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[330].setRotationPoint(47.5F, -6F, -7F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 339
		bodyModel[331].setRotationPoint(47F, -8.5F, 4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[332].setRotationPoint(47F, -6F, 4F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 339
		bodyModel[333].setRotationPoint(47F, -8.5F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[334].setRotationPoint(46F, -6F, 7F);

		bodyModel[335].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[335].setRotationPoint(47.75F, -5F, 5.5F);
		bodyModel[335].rotateAngleY = -0.78539816F;

		bodyModel[336].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[336].setRotationPoint(48.25F, -5F, -5.5F);
		bodyModel[336].rotateAngleY = -0.78539816F;

		bodyModel[337].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[337].setRotationPoint(47.25F, -5F, 8.5F);
		bodyModel[337].rotateAngleY = -0.78539816F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 14, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[338].setRotationPoint(39.5F, -11F, 9.9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 6, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[339].setRotationPoint(47.5F, -11F, -9.9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[340].setRotationPoint(45F, -2F, 9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[341].setRotationPoint(48.5F, -2F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, -0.5F, -0.01F, -0.01F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 347
		bodyModel[342].setRotationPoint(48.5F, -2F, 4F);

		bodyModel[343].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 38
		bodyModel[343].setRotationPoint(39.5F, -6F, 4F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[344].setRotationPoint(41.5F, -3F, 6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[345].setRotationPoint(41.5F, -2F, 6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[346].setRotationPoint(43.5F, -6F, 6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[347].setRotationPoint(42.5F, -4F, 9.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[348].setRotationPoint(-49F, -3F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.11F, 0F, -0.5F, 0.11F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F); // Box 493
		bodyModel[349].setRotationPoint(-48.5F, -7F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.37F, 0F, -0.3F, -0.23F, 0F, -0.3F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.37F, -4.5F, -0.3F, -0.23F, -4.5F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[350].setRotationPoint(-48.96F, -4.5F, -8.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.23F, 0F, -0.3F, -0.37F, 0F, -0.3F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.23F, -4.5F, -0.3F, -0.37F, -4.5F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[351].setRotationPoint(-45.04F, -4.5F, -8.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[352].setRotationPoint(-48.5F, -2F, -8.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 492
		bodyModel[353].setRotationPoint(-44.02F, -3F, -8.44F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.11F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F); // Box 493
		bodyModel[354].setRotationPoint(-40.02F, -7F, -7.94F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.3F, 0F, -0.23F, -4.5F, 0F, -0.6F, -4.5F, 0F, 0.1F, -0.3F, 0F, -0.37F, -0.3F, -4.5F, -0.23F, -4.5F, -4.5F, -0.6F, -4.5F, -4.5F, 0.1F, -0.3F, -4.5F, -0.37F); // Box 495 cull
		bodyModel[355].setRotationPoint(-43.33F, -4.5F, -8.64F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.3F, 0F, -0.37F, -4.5F, 0F, 0.1F, -4.5F, 0F, -0.6F, -0.3F, 0F, -0.23F, -0.3F, -4.5F, -0.37F, -4.5F, -4.5F, 0.1F, -4.5F, -4.5F, -0.6F, -0.3F, -4.5F, -0.23F); // Box 495 cull
		bodyModel[356].setRotationPoint(-43.35F, -4.5F, -3.25F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F); // Box 493 cull
		bodyModel[357].setRotationPoint(-40.27F, -2F, -7.94F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 492
		bodyModel[358].setRotationPoint(-44.02F, -3F, -2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.11F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F); // Box 493
		bodyModel[359].setRotationPoint(-40.02F, -7F, -1.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.3F, 0F, -0.23F, -4.5F, 0F, -0.6F, -4.5F, 0F, 0.1F, -0.3F, 0F, -0.37F, -0.3F, -4.5F, -0.23F, -4.5F, -4.5F, -0.6F, -4.5F, -4.5F, 0.1F, -0.3F, -4.5F, -0.37F); // Box 495 cull
		bodyModel[360].setRotationPoint(-43.33F, -4.5F, -2.2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.3F, 0F, -0.37F, -4.5F, 0F, 0.1F, -4.5F, 0F, -0.6F, -0.3F, 0F, -0.23F, -0.3F, -4.5F, -0.37F, -4.5F, -4.5F, 0.1F, -4.5F, -4.5F, -0.6F, -0.3F, -4.5F, -0.23F); // Box 495 cull
		bodyModel[361].setRotationPoint(-43.35F, -4.5F, 3.19F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F); // Box 493 cull
		bodyModel[362].setRotationPoint(-40.27F, -2F, -1.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 492
		bodyModel[363].setRotationPoint(-54F, -3F, -2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0.11F, -0.5F, 0F, 0.11F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F); // Box 493
		bodyModel[364].setRotationPoint(-54F, -7F, -1.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.5F, 0F, -0.6F, -4.3F, 0F, -0.23F, -4.3F, 0F, -0.37F, -0.5F, 0F, 0.1F, -0.5F, -4.5F, -0.6F, -4.3F, -4.5F, -0.23F, -4.3F, -4.5F, -0.37F, -0.5F, -4.5F, 0.1F); // Box 495 cull
		bodyModel[365].setRotationPoint(-53.69F, -4.5F, -2.2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.5F, 0F, 0.1F, -4.3F, 0F, -0.37F, -4.3F, 0F, -0.23F, -0.5F, 0F, -0.6F, -0.5F, -4.5F, 0.1F, -4.3F, -4.5F, -0.37F, -4.3F, -4.5F, -0.23F, -0.5F, -4.5F, -0.6F); // Box 495 cull
		bodyModel[366].setRotationPoint(-53.71F, -4.5F, 3.19F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F); // Box 493 cull
		bodyModel[367].setRotationPoint(-54.25F, -2F, -1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 492
		bodyModel[368].setRotationPoint(-54F, -3F, -8.44F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0.11F, -0.5F, 0F, 0.11F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.11F, 0F, 0F, 0.11F, 0F, 0F, 0F); // Box 493
		bodyModel[369].setRotationPoint(-54F, -7F, -7.94F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.5F, 0F, -0.6F, -4.3F, 0F, -0.23F, -4.3F, 0F, -0.37F, -0.5F, 0F, 0.1F, -0.5F, -4.5F, -0.6F, -4.3F, -4.5F, -0.23F, -4.3F, -4.5F, -0.37F, -0.5F, -4.5F, 0.1F); // Box 495 cull
		bodyModel[370].setRotationPoint(-53.69F, -4.5F, -8.64F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,-0.5F, 0F, 0.1F, -4.3F, 0F, -0.37F, -4.3F, 0F, -0.23F, -0.5F, 0F, -0.6F, -0.5F, -4.5F, 0.1F, -4.3F, -4.5F, -0.37F, -4.3F, -4.5F, -0.23F, -0.5F, -4.5F, -0.6F); // Box 495 cull
		bodyModel[371].setRotationPoint(-53.71F, -4.5F, -3.25F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F); // Box 493 cull
		bodyModel[372].setRotationPoint(-54.25F, -2F, -7.94F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[373].setRotationPoint(48F, -15F, 4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 cull
		bodyModel[374].setRotationPoint(-18.5F, -14F, 7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[375].setRotationPoint(-59.5F, 3F, 10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[376].setRotationPoint(-59.5F, 5F, 10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[377].setRotationPoint(-59.5F, 3F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[378].setRotationPoint(-59.5F, 5F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[379].setRotationPoint(-18.5F, -13.99F, -9.99F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 589
		bodyModel[380].setRotationPoint(-18.5F, -13.99F, 9.99F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[381].setRotationPoint(-29.5F, -15F, -10F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[382].setRotationPoint(-35F, -14.99F, 7.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 5, 0, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 384 glow
		bodyModel[383].setRotationPoint(-36F, -14.99F, -8.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[384].setRotationPoint(-37.5F, -3F, -10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[385].setRotationPoint(-26.5F, -8F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[386].setRotationPoint(-26.5F, -3F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[387].setRotationPoint(-30.5F, -15F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492 glow
		bodyModel[388].setRotationPoint(-30.5F, -14F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[389].setRotationPoint(-33.5F, -3F, -9.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.14F, 0F, -0.5F, 0.14F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.14F, 0F, 0F, 0.14F, 0F, 0F); // Box 493
		bodyModel[390].setRotationPoint(-33F, -7F, -9.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,-0.34F, 0F, -0.3F, -0.26F, 0F, -0.3F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, -0.34F, -4.5F, -0.3F, -0.26F, -4.5F, -0.3F, -0.5F, -4.5F, -4.5F, 0F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[391].setRotationPoint(-33.46F, -4.5F, -9F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 10, 7, 0F,-0.26F, 0F, -0.3F, -0.34F, 0F, -0.3F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.26F, -4.5F, -0.3F, -0.34F, -4.5F, -0.3F, 0F, -4.5F, -4.5F, -0.5F, -4.5F, -4.5F); // Box 495 cull
		bodyModel[392].setRotationPoint(-30.55F, -4.5F, -9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[393].setRotationPoint(-33F, -2F, -9.25F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 270
		bodyModel[394].setRotationPoint(-27.5F, -18F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 271
		bodyModel[395].setRotationPoint(-27.5F, -18.5F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[396].setRotationPoint(-28.5F, -15F, -2F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[397].setRotationPoint(-22F, -14.99F, -0.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[398].setRotationPoint(-23.5F, -11F, 3F);

		bodyModel[399].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[399].setRotationPoint(-23.5F, -5F, 3F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[400].setRotationPoint(-37.5F, -11F, -9.9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 38
		bodyModel[401].setRotationPoint(-28.5F, -15F, -1F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[402].setRotationPoint(-26.5F, -15F, -3F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 4, 15, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[403].setRotationPoint(-37.5F, -7F, -10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0.02F, 0F, 0.01F, 0.02F); // Box 492
		bodyModel[404].setRotationPoint(-30.5F, -14.01F, -8.01F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492 glow
		bodyModel[405].setRotationPoint(-25.5F, -14F, -8.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0.02F, 0F, 0.01F, 0.02F); // Box 492
		bodyModel[406].setRotationPoint(-25.5F, -14.01F, -8.51F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492 glow
		bodyModel[407].setRotationPoint(-37.5F, -10F, -6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0.02F, 0F, 0.01F, 0.02F); // Box 492
		bodyModel[408].setRotationPoint(-37.5F, -10.01F, -6.01F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492 glow
		bodyModel[409].setRotationPoint(-37.5F, -10F, -1F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0.02F, 0F, 0.01F, 0.02F); // Box 492
		bodyModel[410].setRotationPoint(-37.5F, -10.01F, -1.01F);

		bodyModel[411].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[411].setRotationPoint(10F, -5F, -6.4F);
		bodyModel[411].rotateAngleY = -4.71238898F;

		bodyModel[412].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[412].setRotationPoint(10F, -5F, -6.4F);
		bodyModel[412].rotateAngleY = -4.71238898F;

		bodyModel[413].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[413].setRotationPoint(10F, -3F, -6.4F);
		bodyModel[413].rotateAngleY = -4.71238898F;

		bodyModel[414].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[414].setRotationPoint(10F, -4F, -6.4F);
		bodyModel[414].rotateAngleY = -4.71238898F;

		bodyModel[415].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[415].setRotationPoint(10F, -5F, -6.4F);
		bodyModel[415].rotateAngleY = -4.71238898F;

		bodyModel[416].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[416].setRotationPoint(10F, -4F, -6.4F);
		bodyModel[416].rotateAngleY = -4.71238898F;

		bodyModel[417].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(10F, -5F, -6.4F);
		bodyModel[417].rotateAngleY = -4.71238898F;

		bodyModel[418].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[418].setRotationPoint(10F, -1F, -6.4F);
		bodyModel[418].rotateAngleY = -3.92699082F;

		bodyModel[419].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[419].setRotationPoint(20.5F, -5F, -6.4F);
		bodyModel[419].rotateAngleY = -4.71238898F;

		bodyModel[420].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[420].setRotationPoint(20.5F, -5F, -6.4F);
		bodyModel[420].rotateAngleY = -4.71238898F;

		bodyModel[421].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[421].setRotationPoint(20.5F, -3F, -6.4F);
		bodyModel[421].rotateAngleY = -4.71238898F;

		bodyModel[422].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[422].setRotationPoint(20.5F, -4F, -6.4F);
		bodyModel[422].rotateAngleY = -4.71238898F;

		bodyModel[423].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[423].setRotationPoint(20.5F, -5F, -6.4F);
		bodyModel[423].rotateAngleY = -4.71238898F;

		bodyModel[424].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[424].setRotationPoint(20.5F, -4F, -6.4F);
		bodyModel[424].rotateAngleY = -4.71238898F;

		bodyModel[425].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(20.5F, -5F, -6.4F);
		bodyModel[425].rotateAngleY = -4.71238898F;

		bodyModel[426].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[426].setRotationPoint(20.5F, -1F, -6.4F);
		bodyModel[426].rotateAngleY = -3.92699082F;

		bodyModel[427].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[427].setRotationPoint(31F, -5F, -6.4F);
		bodyModel[427].rotateAngleY = -4.71238898F;

		bodyModel[428].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[428].setRotationPoint(31F, -5F, -6.4F);
		bodyModel[428].rotateAngleY = -4.71238898F;

		bodyModel[429].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[429].setRotationPoint(31F, -3F, -6.4F);
		bodyModel[429].rotateAngleY = -4.71238898F;

		bodyModel[430].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[430].setRotationPoint(31F, -4F, -6.4F);
		bodyModel[430].rotateAngleY = -4.71238898F;

		bodyModel[431].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(31F, -5F, -6.4F);
		bodyModel[431].rotateAngleY = -4.71238898F;

		bodyModel[432].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[432].setRotationPoint(31F, -4F, -6.4F);
		bodyModel[432].rotateAngleY = -4.71238898F;

		bodyModel[433].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[433].setRotationPoint(31F, -5F, -6.4F);
		bodyModel[433].rotateAngleY = -4.71238898F;

		bodyModel[434].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[434].setRotationPoint(31F, -1F, -6.4F);
		bodyModel[434].rotateAngleY = -3.92699082F;

		bodyModel[435].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[435].setRotationPoint(-0.5F, -5F, 6.4F);
		bodyModel[435].rotateAngleY = -1.57079633F;

		bodyModel[436].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[436].setRotationPoint(-0.5F, -5F, 6.4F);
		bodyModel[436].rotateAngleY = -1.57079633F;

		bodyModel[437].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[437].setRotationPoint(-0.5F, -3F, 6.4F);
		bodyModel[437].rotateAngleY = -1.57079633F;

		bodyModel[438].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[438].setRotationPoint(-0.5F, -4F, 6.4F);
		bodyModel[438].rotateAngleY = -1.57079633F;

		bodyModel[439].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(-0.5F, -5F, 6.4F);
		bodyModel[439].rotateAngleY = -1.57079633F;

		bodyModel[440].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[440].setRotationPoint(-0.5F, -4F, 6.4F);
		bodyModel[440].rotateAngleY = -1.57079633F;

		bodyModel[441].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[441].setRotationPoint(-0.5F, -5F, 6.4F);
		bodyModel[441].rotateAngleY = -1.57079633F;

		bodyModel[442].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[442].setRotationPoint(-0.5F, -1F, 6.4F);
		bodyModel[442].rotateAngleY = -0.78539816F;

		bodyModel[443].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[443].setRotationPoint(10F, -5F, 6.4F);
		bodyModel[443].rotateAngleY = -1.57079633F;

		bodyModel[444].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[444].setRotationPoint(10F, -5F, 6.4F);
		bodyModel[444].rotateAngleY = -1.57079633F;

		bodyModel[445].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[445].setRotationPoint(10F, -3F, 6.4F);
		bodyModel[445].rotateAngleY = -1.57079633F;

		bodyModel[446].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[446].setRotationPoint(10F, -4F, 6.4F);
		bodyModel[446].rotateAngleY = -1.57079633F;

		bodyModel[447].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[447].setRotationPoint(10F, -5F, 6.4F);
		bodyModel[447].rotateAngleY = -1.57079633F;

		bodyModel[448].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[448].setRotationPoint(10F, -4F, 6.4F);
		bodyModel[448].rotateAngleY = -1.57079633F;

		bodyModel[449].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(10F, -5F, 6.4F);
		bodyModel[449].rotateAngleY = -1.57079633F;

		bodyModel[450].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[450].setRotationPoint(10F, -1F, 6.4F);
		bodyModel[450].rotateAngleY = -0.78539816F;

		bodyModel[451].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[451].setRotationPoint(20.5F, -5F, 6.4F);
		bodyModel[451].rotateAngleY = -1.57079633F;

		bodyModel[452].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[452].setRotationPoint(20.5F, -5F, 6.4F);
		bodyModel[452].rotateAngleY = -1.57079633F;

		bodyModel[453].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[453].setRotationPoint(20.5F, -3F, 6.4F);
		bodyModel[453].rotateAngleY = -1.57079633F;

		bodyModel[454].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[454].setRotationPoint(20.5F, -4F, 6.4F);
		bodyModel[454].rotateAngleY = -1.57079633F;

		bodyModel[455].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[455].setRotationPoint(20.5F, -5F, 6.4F);
		bodyModel[455].rotateAngleY = -1.57079633F;

		bodyModel[456].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[456].setRotationPoint(20.5F, -4F, 6.4F);
		bodyModel[456].rotateAngleY = -1.57079633F;

		bodyModel[457].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(20.5F, -5F, 6.4F);
		bodyModel[457].rotateAngleY = -1.57079633F;

		bodyModel[458].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[458].setRotationPoint(20.5F, -1F, 6.4F);
		bodyModel[458].rotateAngleY = -0.78539816F;

		bodyModel[459].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[459].setRotationPoint(31F, -5F, 6.4F);
		bodyModel[459].rotateAngleY = -1.57079633F;

		bodyModel[460].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[460].setRotationPoint(31F, -5F, 6.4F);
		bodyModel[460].rotateAngleY = -1.57079633F;

		bodyModel[461].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[461].setRotationPoint(31F, -4F, 6.4F);
		bodyModel[461].rotateAngleY = -1.57079633F;

		bodyModel[462].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(31F, -5F, 6.4F);
		bodyModel[462].rotateAngleY = -1.57079633F;

		bodyModel[463].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[463].setRotationPoint(31F, -4F, 6.4F);
		bodyModel[463].rotateAngleY = -1.57079633F;

		bodyModel[464].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(31F, -5F, 6.4F);
		bodyModel[464].rotateAngleY = -1.57079633F;

		bodyModel[465].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[465].setRotationPoint(31F, -3F, 6.4F);
		bodyModel[465].rotateAngleY = -1.57079633F;

		bodyModel[466].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[466].setRotationPoint(31F, -1F, 6.4F);
		bodyModel[466].rotateAngleY = -0.78539816F;

		bodyModel[467].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[467].setRotationPoint(-11F, -5F, -6.4F);
		bodyModel[467].rotateAngleY = -4.71238898F;

		bodyModel[468].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[468].setRotationPoint(-11F, -5F, -6.4F);
		bodyModel[468].rotateAngleY = -4.71238898F;

		bodyModel[469].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[469].setRotationPoint(-11F, -3F, -6.4F);
		bodyModel[469].rotateAngleY = -4.71238898F;

		bodyModel[470].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[470].setRotationPoint(-11F, -4F, -6.4F);
		bodyModel[470].rotateAngleY = -4.71238898F;

		bodyModel[471].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[471].setRotationPoint(-11F, -5F, -6.4F);
		bodyModel[471].rotateAngleY = -4.71238898F;

		bodyModel[472].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[472].setRotationPoint(-11F, -4F, -6.4F);
		bodyModel[472].rotateAngleY = -4.71238898F;

		bodyModel[473].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(-11F, -5F, -6.4F);
		bodyModel[473].rotateAngleY = -4.71238898F;

		bodyModel[474].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[474].setRotationPoint(-11F, -1F, -6.4F);
		bodyModel[474].rotateAngleY = -3.92699082F;

		bodyModel[475].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Left seat part
		bodyModel[475].setRotationPoint(-0.5F, -5F, -6.4F);
		bodyModel[475].rotateAngleY = -4.71238898F;

		bodyModel[476].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Left seat part
		bodyModel[476].setRotationPoint(-0.5F, -5F, -6.4F);
		bodyModel[476].rotateAngleY = -4.71238898F;

		bodyModel[477].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[477].setRotationPoint(-0.5F, -3F, -6.4F);
		bodyModel[477].rotateAngleY = -4.71238898F;

		bodyModel[478].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Left seat part
		bodyModel[478].setRotationPoint(-0.5F, -4F, -6.4F);
		bodyModel[478].rotateAngleY = -4.71238898F;

		bodyModel[479].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[479].setRotationPoint(-0.5F, -5F, -6.4F);
		bodyModel[479].rotateAngleY = -4.71238898F;

		bodyModel[480].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Left seat part
		bodyModel[480].setRotationPoint(-0.5F, -4F, -6.4F);
		bodyModel[480].rotateAngleY = -4.71238898F;

		bodyModel[481].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[481].setRotationPoint(-0.5F, -5F, -6.4F);
		bodyModel[481].rotateAngleY = -4.71238898F;

		bodyModel[482].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Left seat part
		bodyModel[482].setRotationPoint(-0.5F, -1F, -6.4F);
		bodyModel[482].rotateAngleY = -3.92699082F;

		bodyModel[483].addBox(0F, 0F, -3F, 2, 4, 1, 0F); // Right seat part
		bodyModel[483].setRotationPoint(-11F, -5F, 6.4F);
		bodyModel[483].rotateAngleY = -1.57079633F;

		bodyModel[484].addBox(0F, 0F, 2F, 2, 4, 1, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-11F, -5F, 6.4F);
		bodyModel[484].rotateAngleY = -1.57079633F;

		bodyModel[485].addShapeBox(-3F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[485].setRotationPoint(-11F, -3F, 6.4F);
		bodyModel[485].rotateAngleY = -1.57079633F;

		bodyModel[486].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[486].setRotationPoint(-11F, -8F, 6.4F);
		bodyModel[486].rotateAngleY = -1.57079633F;

		bodyModel[487].addBox(-3F, 0F, 2F, 3, 3, 1, 0F); // Right seat part
		bodyModel[487].setRotationPoint(-11F, -4F, 6.4F);
		bodyModel[487].rotateAngleY = -1.57079633F;

		bodyModel[488].addShapeBox(-3F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[488].setRotationPoint(-11F, -5F, 6.4F);
		bodyModel[488].rotateAngleY = -1.57079633F;

		bodyModel[489].addBox(-3F, 0F, -3F, 3, 3, 1, 0F); // Right seat part
		bodyModel[489].setRotationPoint(-11F, -4F, 6.4F);
		bodyModel[489].rotateAngleY = -1.57079633F;

		bodyModel[490].addShapeBox(-3F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[490].setRotationPoint(-11F, -5F, 6.4F);
		bodyModel[490].rotateAngleY = -1.57079633F;

		bodyModel[491].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Right seat part
		bodyModel[491].setRotationPoint(-11F, -1F, 6.4F);
		bodyModel[491].rotateAngleY = -0.78539816F;

		bodyModel[492].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(-11F, -4F, 6.4F);
		bodyModel[492].rotateAngleY = -1.57079633F;

		bodyModel[493].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[493].setRotationPoint(-11F, -4.5F, 6.4F);
		bodyModel[493].rotateAngleY = -1.57079633F;

		bodyModel[494].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[494].setRotationPoint(-11F, -4.5F, 6.4F);
		bodyModel[494].rotateAngleY = -1.57079633F;

		bodyModel[495].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[495].setRotationPoint(-11F, -1.5F, 6.4F);
		bodyModel[495].rotateAngleY = -1.57079633F;

		bodyModel[496].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[496].setRotationPoint(-0.5F, -8F, 6.4F);
		bodyModel[496].rotateAngleY = -1.57079633F;

		bodyModel[497].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(-0.5F, -4F, 6.4F);
		bodyModel[497].rotateAngleY = -1.57079633F;

		bodyModel[498].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[498].setRotationPoint(-0.5F, -4.5F, 6.4F);
		bodyModel[498].rotateAngleY = -1.57079633F;

		bodyModel[499].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[499].setRotationPoint(-0.5F, -4.5F, 6.4F);
		bodyModel[499].rotateAngleY = -1.57079633F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 271, 311, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 305, 288, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 306, 298, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 324, 302, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 294, 302, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 306, 311, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 340, 288, textureX, textureY); // Right seat part
		bodyModel[507] = new ModelRendererTurbo(this, 341, 298, textureX, textureY); // Right seat part
		bodyModel[508] = new ModelRendererTurbo(this, 359, 302, textureX, textureY); // Right seat part
		bodyModel[509] = new ModelRendererTurbo(this, 329, 302, textureX, textureY); // Right seat part
		bodyModel[510] = new ModelRendererTurbo(this, 341, 311, textureX, textureY); // Right seat part
		bodyModel[511] = new ModelRendererTurbo(this, 375, 288, textureX, textureY); // Right seat part
		bodyModel[512] = new ModelRendererTurbo(this, 376, 298, textureX, textureY); // Right seat part
		bodyModel[513] = new ModelRendererTurbo(this, 394, 302, textureX, textureY); // Right seat part
		bodyModel[514] = new ModelRendererTurbo(this, 364, 302, textureX, textureY); // Right seat part
		bodyModel[515] = new ModelRendererTurbo(this, 376, 311, textureX, textureY); // Right seat part
		bodyModel[516] = new ModelRendererTurbo(this, 235, 332, textureX, textureY); // Left seat part
		bodyModel[517] = new ModelRendererTurbo(this, 236, 342, textureX, textureY); // Left seat part
		bodyModel[518] = new ModelRendererTurbo(this, 224, 346, textureX, textureY); // Left seat part
		bodyModel[519] = new ModelRendererTurbo(this, 254, 346, textureX, textureY); // Left seat part
		bodyModel[520] = new ModelRendererTurbo(this, 236, 355, textureX, textureY); // Left seat part
		bodyModel[521] = new ModelRendererTurbo(this, 259, 346, textureX, textureY); // Left seat part
		bodyModel[522] = new ModelRendererTurbo(this, 289, 346, textureX, textureY); // Left seat part
		bodyModel[523] = new ModelRendererTurbo(this, 271, 355, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 294, 346, textureX, textureY); // Left seat part
		bodyModel[525] = new ModelRendererTurbo(this, 324, 346, textureX, textureY); // Left seat part
		bodyModel[526] = new ModelRendererTurbo(this, 306, 355, textureX, textureY); // Left seat part
		bodyModel[527] = new ModelRendererTurbo(this, 270, 332, textureX, textureY); // Left seat part
		bodyModel[528] = new ModelRendererTurbo(this, 271, 342, textureX, textureY); // Left seat part
		bodyModel[529] = new ModelRendererTurbo(this, 305, 332, textureX, textureY); // Left seat part
		bodyModel[530] = new ModelRendererTurbo(this, 306, 342, textureX, textureY); // Left seat part
		bodyModel[531] = new ModelRendererTurbo(this, 340, 332, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 341, 342, textureX, textureY); // Left seat part
		bodyModel[533] = new ModelRendererTurbo(this, 329, 346, textureX, textureY); // Left seat part
		bodyModel[534] = new ModelRendererTurbo(this, 359, 346, textureX, textureY); // Left seat part
		bodyModel[535] = new ModelRendererTurbo(this, 341, 355, textureX, textureY); // Left seat part
		bodyModel[536] = new ModelRendererTurbo(this, 375, 332, textureX, textureY); // Left seat part
		bodyModel[537] = new ModelRendererTurbo(this, 376, 342, textureX, textureY); // Left seat part
		bodyModel[538] = new ModelRendererTurbo(this, 364, 346, textureX, textureY); // Left seat part
		bodyModel[539] = new ModelRendererTurbo(this, 394, 346, textureX, textureY); // Left seat part
		bodyModel[540] = new ModelRendererTurbo(this, 376, 355, textureX, textureY); // Left seat part
		bodyModel[541] = new ModelRendererTurbo(this, 56, 208, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 49, 212, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 1, 208, textureX, textureY); // Box 551
		bodyModel[544] = new ModelRendererTurbo(this, 16, 212, textureX, textureY); // Box 552
		bodyModel[545] = new ModelRendererTurbo(this, 29, 218, textureX, textureY); // Box 128
		bodyModel[546] = new ModelRendererTurbo(this, 38, 191, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 46, 207, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 25, 192, textureX, textureY); // Box 128
		bodyModel[549] = new ModelRendererTurbo(this, 29, 184, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 38, 186, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 45, 186, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 38, 206, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 25, 205, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 48, 200, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 55, 199, textureX, textureY); // Box 128
		bodyModel[556] = new ModelRendererTurbo(this, 20, 207, textureX, textureY); // Box 564
		bodyModel[557] = new ModelRendererTurbo(this, 28, 186, textureX, textureY); // Box 565
		bodyModel[558] = new ModelRendererTurbo(this, 21, 186, textureX, textureY); // Box 566
		bodyModel[559] = new ModelRendererTurbo(this, 22, 206, textureX, textureY); // Box 567
		bodyModel[560] = new ModelRendererTurbo(this, 18, 200, textureX, textureY); // Box 568
		bodyModel[561] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 569
		bodyModel[562] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 2
		bodyModel[563] = new ModelRendererTurbo(this, 27, 165, textureX, textureY); // Box 2
		bodyModel[564] = new ModelRendererTurbo(this, 16, 165, textureX, textureY); // Box 572
		bodyModel[565] = new ModelRendererTurbo(this, 48, 163, textureX, textureY); // Box 128
		bodyModel[566] = new ModelRendererTurbo(this, 43, 155, textureX, textureY); // Box 2
		bodyModel[567] = new ModelRendererTurbo(this, 1, 164, textureX, textureY); // Box 575
		bodyModel[568] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 576
		bodyModel[569] = new ModelRendererTurbo(this, 48, 165, textureX, textureY); // Box 128
		bodyModel[570] = new ModelRendererTurbo(this, 35, 158, textureX, textureY); // Box 2
		bodyModel[571] = new ModelRendererTurbo(this, 22, 156, textureX, textureY); // Box 2
		bodyModel[572] = new ModelRendererTurbo(this, 38, 166, textureX, textureY); // Box 2
		bodyModel[573] = new ModelRendererTurbo(this, 43, 165, textureX, textureY); // Box 2
		bodyModel[574] = new ModelRendererTurbo(this, 50, 169, textureX, textureY); // Box 2
		bodyModel[575] = new ModelRendererTurbo(this, 1, 167, textureX, textureY); // Box 583
		bodyModel[576] = new ModelRendererTurbo(this, 14, 158, textureX, textureY); // Box 584
		bodyModel[577] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 585
		bodyModel[578] = new ModelRendererTurbo(this, 11, 167, textureX, textureY); // Box 586
		bodyModel[579] = new ModelRendererTurbo(this, 6, 167, textureX, textureY); // Box 587
		bodyModel[580] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 588
		bodyModel[581] = new ModelRendererTurbo(this, 50, 187, textureX, textureY); // Box 128
		bodyModel[582] = new ModelRendererTurbo(this, 1, 172, textureX, textureY); // Box 128
		bodyModel[583] = new ModelRendererTurbo(this, 8, 182, textureX, textureY); // Box 128
		bodyModel[584] = new ModelRendererTurbo(this, 1, 182, textureX, textureY); // Box 128
		bodyModel[585] = new ModelRendererTurbo(this, 41, 58, textureX, textureY); // Box 128
		bodyModel[586] = new ModelRendererTurbo(this, 32, 58, textureX, textureY,"lamp"); // Box 128 tailsign glow
		bodyModel[587] = new ModelRendererTurbo(this, 36, 55, textureX, textureY); // Box 128
		bodyModel[588] = new ModelRendererTurbo(this, 29, 55, textureX, textureY,"lamp"); // Box 128 rear light glow
		bodyModel[589] = new ModelRendererTurbo(this, 109, 1, textureX, textureY); // Box 278
		bodyModel[590] = new ModelRendererTurbo(this, 108, 6, textureX, textureY); // Box 279
		bodyModel[591] = new ModelRendererTurbo(this, 56, 86, textureX, textureY); // Box 169
		bodyModel[592] = new ModelRendererTurbo(this, 61, 86, textureX, textureY,"lamp"); // Box 169 marker lens LF
		bodyModel[593] = new ModelRendererTurbo(this, 51, 86, textureX, textureY,"lamp"); // Box 169 marker lens LR
		bodyModel[594] = new ModelRendererTurbo(this, 56, 66, textureX, textureY); // Box 548
		bodyModel[595] = new ModelRendererTurbo(this, 51, 66, textureX, textureY,"lamp"); // Box 549 marker lens RF
		bodyModel[596] = new ModelRendererTurbo(this, 61, 66, textureX, textureY,"lamp"); // Box 547 marker lens LR
		bodyModel[597] = new ModelRendererTurbo(this, 67, 99, textureX, textureY); // Box 204
		bodyModel[598] = new ModelRendererTurbo(this, 67, 95, textureX, textureY); // Box 204 marker lense
		bodyModel[599] = new ModelRendererTurbo(this, 65, 92, textureX, textureY,"lamp"); // Box 204 marker lens
		bodyModel[600] = new ModelRendererTurbo(this, 65, 88, textureX, textureY,"lamp"); // Box 204 marker lens
		bodyModel[601] = new ModelRendererTurbo(this, 66, 85, textureX, textureY); // Box 204 marker lense
		bodyModel[602] = new ModelRendererTurbo(this, 67, 80, textureX, textureY); // Box 617
		bodyModel[603] = new ModelRendererTurbo(this, 67, 76, textureX, textureY); // Box 618
		bodyModel[604] = new ModelRendererTurbo(this, 65, 73, textureX, textureY,"lamp"); // Box 619 marker lens
		bodyModel[605] = new ModelRendererTurbo(this, 65, 69, textureX, textureY,"lamp"); // Box 620 marker lens
		bodyModel[606] = new ModelRendererTurbo(this, 66, 66, textureX, textureY); // Box 621
		bodyModel[607] = new ModelRendererTurbo(this, 16, 190, textureX, textureY); // Box 128
		bodyModel[608] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[609] = new ModelRendererTurbo(this, 328, 164, textureX, textureY); // Box 2
		bodyModel[610] = new ModelRendererTurbo(this, 328, 176, textureX, textureY); // Box 2
		bodyModel[611] = new ModelRendererTurbo(this, 321, 167, textureX, textureY); // Box 2
		bodyModel[612] = new ModelRendererTurbo(this, 330, 167, textureX, textureY); // Box 2
		bodyModel[613] = new ModelRendererTurbo(this, 328, 170, textureX, textureY); // Box 2
		bodyModel[614] = new ModelRendererTurbo(this, 330, 173, textureX, textureY); // Box 2
		bodyModel[615] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 128
		bodyModel[616] = new ModelRendererTurbo(this, 339, 173, textureX, textureY); // Box 128
		bodyModel[617] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 128
		bodyModel[618] = new ModelRendererTurbo(this, 325, 173, textureX, textureY); // Box 128
		bodyModel[619] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 628
		bodyModel[620] = new ModelRendererTurbo(this, 328, 148, textureX, textureY); // Box 629
		bodyModel[621] = new ModelRendererTurbo(this, 328, 160, textureX, textureY); // Box 630
		bodyModel[622] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 631
		bodyModel[623] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 632
		bodyModel[624] = new ModelRendererTurbo(this, 328, 154, textureX, textureY); // Box 633
		bodyModel[625] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 634
		bodyModel[626] = new ModelRendererTurbo(this, 339, 150, textureX, textureY); // Box 635
		bodyModel[627] = new ModelRendererTurbo(this, 339, 157, textureX, textureY); // Box 636
		bodyModel[628] = new ModelRendererTurbo(this, 321, 150, textureX, textureY); // Box 638
		bodyModel[629] = new ModelRendererTurbo(this, 325, 157, textureX, textureY); // Box 639
		bodyModel[630] = new ModelRendererTurbo(this, 77, 20, textureX, textureY); // Box 228
		bodyModel[631] = new ModelRendererTurbo(this, 76, 17, textureX, textureY); // Box 228
		bodyModel[632] = new ModelRendererTurbo(this, 49, 343, textureX, textureY); // Right seat part
		bodyModel[633] = new ModelRendererTurbo(this, 51, 347, textureX, textureY); // Right seat part
		bodyModel[634] = new ModelRendererTurbo(this, 49, 355, textureX, textureY); // Right seat part
		bodyModel[635] = new ModelRendererTurbo(this, 110, 340, textureX, textureY); // Right seat part
		bodyModel[636] = new ModelRendererTurbo(this, 112, 344, textureX, textureY); // Right seat part
		bodyModel[637] = new ModelRendererTurbo(this, 110, 352, textureX, textureY); // Right seat part

		bodyModel[500].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[500].setRotationPoint(-0.5F, -1.5F, 6.4F);
		bodyModel[500].rotateAngleY = -1.57079633F;

		bodyModel[501].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(10F, -8F, 6.4F);
		bodyModel[501].rotateAngleY = -1.57079633F;

		bodyModel[502].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(10F, -4F, 6.4F);
		bodyModel[502].rotateAngleY = -1.57079633F;

		bodyModel[503].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[503].setRotationPoint(10F, -4.5F, 6.4F);
		bodyModel[503].rotateAngleY = -1.57079633F;

		bodyModel[504].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(10F, -4.5F, 6.4F);
		bodyModel[504].rotateAngleY = -1.57079633F;

		bodyModel[505].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[505].setRotationPoint(10F, -1.5F, 6.4F);
		bodyModel[505].rotateAngleY = -1.57079633F;

		bodyModel[506].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[506].setRotationPoint(20.5F, -8F, 6.4F);
		bodyModel[506].rotateAngleY = -1.57079633F;

		bodyModel[507].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[507].setRotationPoint(20.5F, -4F, 6.4F);
		bodyModel[507].rotateAngleY = -1.57079633F;

		bodyModel[508].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[508].setRotationPoint(20.5F, -4.5F, 6.4F);
		bodyModel[508].rotateAngleY = -1.57079633F;

		bodyModel[509].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[509].setRotationPoint(20.5F, -4.5F, 6.4F);
		bodyModel[509].rotateAngleY = -1.57079633F;

		bodyModel[510].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[510].setRotationPoint(20.5F, -1.5F, 6.4F);
		bodyModel[510].rotateAngleY = -1.57079633F;

		bodyModel[511].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Right seat part
		bodyModel[511].setRotationPoint(31F, -8F, 6.4F);
		bodyModel[511].rotateAngleY = -1.57079633F;

		bodyModel[512].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[512].setRotationPoint(31F, -4F, 6.4F);
		bodyModel[512].rotateAngleY = -1.57079633F;

		bodyModel[513].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[513].setRotationPoint(31F, -4.5F, 6.4F);
		bodyModel[513].rotateAngleY = -1.57079633F;

		bodyModel[514].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[514].setRotationPoint(31F, -4.5F, 6.4F);
		bodyModel[514].rotateAngleY = -1.57079633F;

		bodyModel[515].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Right seat part
		bodyModel[515].setRotationPoint(31F, -1.5F, 6.4F);
		bodyModel[515].rotateAngleY = -1.57079633F;

		bodyModel[516].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[516].setRotationPoint(-11F, -8F, -6.4F);
		bodyModel[516].rotateAngleY = -4.71238898F;

		bodyModel[517].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[517].setRotationPoint(-11F, -4F, -6.4F);
		bodyModel[517].rotateAngleY = -4.71238898F;

		bodyModel[518].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[518].setRotationPoint(-11F, -4.5F, -6.4F);
		bodyModel[518].rotateAngleY = -4.71238898F;

		bodyModel[519].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[519].setRotationPoint(-11F, -4.5F, -6.4F);
		bodyModel[519].rotateAngleY = -4.71238898F;

		bodyModel[520].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[520].setRotationPoint(-11F, -1.5F, -6.4F);
		bodyModel[520].rotateAngleY = -4.71238898F;

		bodyModel[521].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[521].setRotationPoint(-0.5F, -4.5F, -6.4F);
		bodyModel[521].rotateAngleY = -4.71238898F;

		bodyModel[522].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[522].setRotationPoint(-0.5F, -4.5F, -6.4F);
		bodyModel[522].rotateAngleY = -4.71238898F;

		bodyModel[523].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[523].setRotationPoint(-0.5F, -1.5F, -6.4F);
		bodyModel[523].rotateAngleY = -4.71238898F;

		bodyModel[524].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[524].setRotationPoint(10F, -4.5F, -6.4F);
		bodyModel[524].rotateAngleY = -4.71238898F;

		bodyModel[525].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[525].setRotationPoint(10F, -4.5F, -6.4F);
		bodyModel[525].rotateAngleY = -4.71238898F;

		bodyModel[526].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[526].setRotationPoint(10F, -1.5F, -6.4F);
		bodyModel[526].rotateAngleY = -4.71238898F;

		bodyModel[527].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[527].setRotationPoint(-0.5F, -8F, -6.4F);
		bodyModel[527].rotateAngleY = -4.71238898F;

		bodyModel[528].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[528].setRotationPoint(-0.5F, -4F, -6.4F);
		bodyModel[528].rotateAngleY = -4.71238898F;

		bodyModel[529].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[529].setRotationPoint(10F, -8F, -6.4F);
		bodyModel[529].rotateAngleY = -4.71238898F;

		bodyModel[530].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[530].setRotationPoint(10F, -4F, -6.4F);
		bodyModel[530].rotateAngleY = -4.71238898F;

		bodyModel[531].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[531].setRotationPoint(20.5F, -8F, -6.4F);
		bodyModel[531].rotateAngleY = -4.71238898F;

		bodyModel[532].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[532].setRotationPoint(20.5F, -4F, -6.4F);
		bodyModel[532].rotateAngleY = -4.71238898F;

		bodyModel[533].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[533].setRotationPoint(20.5F, -4.5F, -6.4F);
		bodyModel[533].rotateAngleY = -4.71238898F;

		bodyModel[534].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[534].setRotationPoint(20.5F, -4.5F, -6.4F);
		bodyModel[534].rotateAngleY = -4.71238898F;

		bodyModel[535].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[535].setRotationPoint(20.5F, -1.5F, -6.4F);
		bodyModel[535].rotateAngleY = -4.71238898F;

		bodyModel[536].addShapeBox(-3F, 0F, -2.5F, 1, 4, 5, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, 0.03F, 0F, -0.13F, -0.3F, 0F, -0.13F, -0.3F, 0F, 0.1F, 0.03F, 0F); // Left seat part
		bodyModel[536].setRotationPoint(31F, -8F, -6.4F);
		bodyModel[536].rotateAngleY = -4.71238898F;

		bodyModel[537].addShapeBox(-3F, 0F, -2F, 1, 1, 4, 0F,0.1F, -0.03F, 0F, -0.13F, 0.3F, 0F, -0.13F, 0.3F, 0F, 0.1F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[537].setRotationPoint(31F, -4F, -6.4F);
		bodyModel[537].rotateAngleY = -4.71238898F;

		bodyModel[538].addShapeBox(2F, 0F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[538].setRotationPoint(31F, -4.5F, -6.4F);
		bodyModel[538].rotateAngleY = -4.71238898F;

		bodyModel[539].addShapeBox(2F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[539].setRotationPoint(31F, -4.5F, -6.4F);
		bodyModel[539].rotateAngleY = -4.71238898F;

		bodyModel[540].addShapeBox(2.01F, 0F, -2F, 1, 1, 4, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.49F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, -0.49F, -0.5F, 0.01F); // Left seat part
		bodyModel[540].setRotationPoint(31F, -1.5F, -6.4F);
		bodyModel[540].rotateAngleY = -4.71238898F;

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[541].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[542].setRotationPoint(-60.5F, -15F, -5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 551
		bodyModel[543].setRotationPoint(-60.5F, -15F, 5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 18, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 552
		bodyModel[544].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[545].setRotationPoint(-60.5F, -15F, -3F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[546].setRotationPoint(-60.5F, 1F, -3F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.08F, -1F, 0F, -0.92F, -1F, 0F, -0.92F, 1.25F, -1F, 0F, 1.25F, -1F, -0.08F, 0F, 0F, -0.92F, 0F, 0F, -0.92F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[547].setRotationPoint(-59.58F, -16F, -11F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 128
		bodyModel[548].setRotationPoint(-60.5F, -19F, -5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[549].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[550].setRotationPoint(-60.5F, -20F, -5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.67F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.67F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 128
		bodyModel[551].setRotationPoint(-60.5F, -19.5F, -7F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.92F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.92F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[552].setRotationPoint(-60.5F, -17.25F, -10F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[553].setRotationPoint(-60.5F, -17.25F, -5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.67F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.67F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 128
		bodyModel[554].setRotationPoint(-60.5F, -19F, -7F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.92F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.67F, 0F, 0F, -0.92F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.67F, -0.25F, 0F); // Box 128
		bodyModel[555].setRotationPoint(-60.5F, -19F, -10F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.92F, 1.25F, -1F, -0.92F, -1F, 0F, -0.08F, -1F, 0F, 0F, 0F, -1F, -0.92F, 0F, -1F, -0.92F, 0F, 0F, -0.08F, 0F, 0F); // Box 564
		bodyModel[556].setRotationPoint(-59.58F, -16F, 9F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 565
		bodyModel[557].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.67F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.67F, -0.5F, 0F); // Box 566
		bodyModel[558].setRotationPoint(-60.5F, -19.5F, 5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.92F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.92F, 0.25F, 0F); // Box 567
		bodyModel[559].setRotationPoint(-60.5F, -17.25F, 5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.67F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.67F, -0.25F, 0F); // Box 568
		bodyModel[560].setRotationPoint(-60.5F, -19F, 5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.67F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.92F, -1.75F, 0F, -0.67F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.92F, -0.25F, 0F); // Box 569
		bodyModel[561].setRotationPoint(-60.5F, -19F, 7F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[562].setRotationPoint(-60F, 3F, -5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[563].setRotationPoint(-60F, 4F, -5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[564].setRotationPoint(-60F, 4F, 1F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.04F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, -0.5F, 0F, 0F, -0.5F, -0.04F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[565].setRotationPoint(-59.54F, 3F, -11F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.96F, 0F, -0.5F, 0.46F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.96F, 0F, -0.5F, 0.46F, 0F, -0.5F); // Box 2
		bodyModel[566].setRotationPoint(-59.54F, 3F, -10.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, 0F, -0.04F, 0F, 0F); // Box 575
		bodyModel[567].setRotationPoint(-59.54F, 3F, 10F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.46F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.46F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[568].setRotationPoint(-59.54F, 3F, 4.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.04F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[569].setRotationPoint(-59.54F, 4F, -11F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.42F, 0F, 0F, -0.08F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.08F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[570].setRotationPoint(-60F, 4F, -10F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.42F, 0F, 0F, -0.08F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.42F, -0.5F, 0F, -0.08F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[571].setRotationPoint(-60F, 5F, -10F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, -0.05F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[572].setRotationPoint(-59.63F, 5.5F, -10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.54F, 0F, 0F, -0.58F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[573].setRotationPoint(-59.5F, 4F, -10.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, -0.5F, 0.04F, 0F, -0.5F, 0F, 0F, 0F, -0.96F, 0F, 0F, -0.96F, 0F, -0.5F, 0.04F, 0F, -0.5F); // Box 2
		bodyModel[574].setRotationPoint(-59.54F, 4F, -10.5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 583
		bodyModel[575].setRotationPoint(-59.54F, 4F, 10F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.08F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.08F, 0F, 0F, -0.42F, 0F, 0F); // Box 584
		bodyModel[576].setRotationPoint(-60F, 4F, 5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.08F, 0F, 0F, -0.42F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.08F, -0.5F, 0F, -0.42F, -0.5F, 0F); // Box 585
		bodyModel[577].setRotationPoint(-60F, 5F, 5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.45F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 586
		bodyModel[578].setRotationPoint(-59.63F, 5.5F, 9F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.54F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 587
		bodyModel[579].setRotationPoint(-59.5F, 4F, 9.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.04F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F, 0.04F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.96F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[580].setRotationPoint(-59.54F, 4F, 9.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[581].setRotationPoint(-61.5F, 1F, -4F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[582].setRotationPoint(-61F, -15F, -4F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[583].setRotationPoint(-61F, -14F, -4F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[584].setRotationPoint(-61F, -14F, 3F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[585].setRotationPoint(-60F, -3F, -2F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 tailsign glow
		bodyModel[586].setRotationPoint(-60.01F, -3F, -2F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[587].setRotationPoint(-60.5F, -8F, -1.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 rear light glow
		bodyModel[588].setRotationPoint(-60.51F, -8F, -1.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[589].setRotationPoint(-27.25F, -18F, -11F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[590].setRotationPoint(-27.25F, -18.5F, -10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 169
		bodyModel[591].setRotationPoint(-54F, -13F, 11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, 0F, 0F, -1F); // Box 169 marker lens LF
		bodyModel[592].setRotationPoint(-53F, -13F, 11F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, -0.5F, -1F); // Box 169 marker lens LR
		bodyModel[593].setRotationPoint(-54.25F, -13F, 11F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 548
		bodyModel[594].setRotationPoint(-54F, -13F, -12F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 549 marker lens RF
		bodyModel[595].setRotationPoint(-53F, -13F, -12F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 547 marker lens LR
		bodyModel[596].setRotationPoint(-54.25F, -13F, -12F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 204
		bodyModel[597].setRotationPoint(-59.5F, -9F, 11F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 204 marker lense
		bodyModel[598].setRotationPoint(-59.5F, -10.5F, 11.25F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 204 marker lens
		bodyModel[599].setRotationPoint(-59.75F, -10.5F, 11.25F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 204 marker lens
		bodyModel[600].setRotationPoint(-59.5F, -10.5F, 11F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 204 marker lense
		bodyModel[601].setRotationPoint(-59.25F, -11F, 11.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[602].setRotationPoint(-59.5F, -9F, -12F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 618
		bodyModel[603].setRotationPoint(-59.5F, -10.5F, -12.25F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 619 marker lens
		bodyModel[604].setRotationPoint(-59.75F, -10.5F, -12.25F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 620 marker lens
		bodyModel[605].setRotationPoint(-59.5F, -10.5F, -13F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[606].setRotationPoint(-59.25F, -11F, -12.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[607].setRotationPoint(-61F, 1F, -4F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[608].setRotationPoint(54.5F, 2.5F, 5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[609].setRotationPoint(54.5F, 4F, 6.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F); // Box 2
		bodyModel[610].setRotationPoint(54.5F, 7F, 9.5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[611].setRotationPoint(54.5F, 2.5F, 6.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[612].setRotationPoint(54.5F, 4F, 8F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[613].setRotationPoint(54.5F, 5.5F, 8F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[614].setRotationPoint(54.5F, 5.5F, 9.5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[615].setRotationPoint(58.49F, 3F, 5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[616].setRotationPoint(58.49F, 3F, 9.5F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[617].setRotationPoint(54.51F, 3F, 5F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[618].setRotationPoint(54.51F, 3F, 9.5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[619].setRotationPoint(54.5F, 2.5F, -7F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[620].setRotationPoint(54.5F, 4F, -8.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 630
		bodyModel[621].setRotationPoint(54.5F, 7F, -11.5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[622].setRotationPoint(54.5F, 2.5F, -6.5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[623].setRotationPoint(54.5F, 4F, -8F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[624].setRotationPoint(54.5F, 5.5F, -10F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[625].setRotationPoint(54.5F, 5.5F, -9.5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[626].setRotationPoint(58.49F, 3F, -9F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[627].setRotationPoint(58.49F, 3F, -11.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[628].setRotationPoint(54.51F, 3F, -9F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[629].setRotationPoint(54.51F, 3F, -11.5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[630].setRotationPoint(-27.5F, -20.6F, 3.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.15F, -0.25F, -0.15F, 0.35F, -0.25F, -0.15F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0.2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 228
		bodyModel[631].setRotationPoint(-28.1F, -20.6F, 3F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[632].setRotationPoint(-49.5F, -5F, -3.25F);

		bodyModel[633].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[633].setRotationPoint(-48.5F, -5.5F, -2.25F);
		bodyModel[633].rotateAngleY = -0.78539816F;

		bodyModel[634].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[634].setRotationPoint(-49.5F, 0.5F, -3.25F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[635].setRotationPoint(-45.5F, -5F, -3.25F);

		bodyModel[636].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[636].setRotationPoint(-44.5F, -5.5F, -2.25F);
		bodyModel[636].rotateAngleY = -0.78539816F;

		bodyModel[637].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[637].setRotationPoint(-45.5F, 0.5F, -3.25F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 638; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.38, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.69, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.38, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}