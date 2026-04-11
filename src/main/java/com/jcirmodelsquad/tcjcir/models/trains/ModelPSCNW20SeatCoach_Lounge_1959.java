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

public class ModelPSCNW20SeatCoach_Lounge_1959 extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCNW20SeatCoach_Lounge_1959() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[584];

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
		bodyModel[168] = new ModelRendererTurbo(this, 393, 52, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 382, 52, textureX, textureY); // Box 153
		bodyModel[170] = new ModelRendererTurbo(this, 16, 115, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 5, 115, textureX, textureY); // Box 153
		bodyModel[172] = new ModelRendererTurbo(this, 12, 114, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 389, 51, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[177] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[178] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 62, 101, textureX, textureY); // Box 204
		bodyModel[180] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[182] = new ModelRendererTurbo(this, 320, 20, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 319, 16, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 320, 1, textureX, textureY); // Box 278
		bodyModel[185] = new ModelRendererTurbo(this, 319, 6, textureX, textureY); // Box 279
		bodyModel[186] = new ModelRendererTurbo(this, 76, 1, textureX, textureY); // Box 278
		bodyModel[187] = new ModelRendererTurbo(this, 75, 6, textureX, textureY); // Box 279
		bodyModel[188] = new ModelRendererTurbo(this, 112, 155, textureX, textureY); // Box 52
		bodyModel[189] = new ModelRendererTurbo(this, 160, 174, textureX, textureY); // Box 283
		bodyModel[190] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 284
		bodyModel[191] = new ModelRendererTurbo(this, 147, 172, textureX, textureY); // Box 41
		bodyModel[192] = new ModelRendererTurbo(this, 162, 173, textureX, textureY); // Box 41
		bodyModel[193] = new ModelRendererTurbo(this, 144, 173, textureX, textureY); // Box 41
		bodyModel[194] = new ModelRendererTurbo(this, 147, 160, textureX, textureY); // Box 41
		bodyModel[195] = new ModelRendererTurbo(this, 166, 156, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 144, 156, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 147, 155, textureX, textureY); // Box 41
		bodyModel[198] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 144, 161, textureX, textureY); // Box 41
		bodyModel[200] = new ModelRendererTurbo(this, 179, 172, textureX, textureY); // Box 283
		bodyModel[201] = new ModelRendererTurbo(this, 190, 175, textureX, textureY); // Box 41
		bodyModel[202] = new ModelRendererTurbo(this, 195, 182, textureX, textureY); // Box 41
		bodyModel[203] = new ModelRendererTurbo(this, 195, 172, textureX, textureY); // Box 41
		bodyModel[204] = new ModelRendererTurbo(this, 198, 172, textureX, textureY); // Box 283
		bodyModel[205] = new ModelRendererTurbo(this, 203, 173, textureX, textureY); // Box 283
		bodyModel[206] = new ModelRendererTurbo(this, 205, 172, textureX, textureY); // Box 283
		bodyModel[207] = new ModelRendererTurbo(this, 169, 155, textureX, textureY); // Box 304
		bodyModel[208] = new ModelRendererTurbo(this, 201, 156, textureX, textureY); // Box 41
		bodyModel[209] = new ModelRendererTurbo(this, 214, 157, textureX, textureY); // Box 41
		bodyModel[210] = new ModelRendererTurbo(this, 198, 157, textureX, textureY); // Box 41
		bodyModel[211] = new ModelRendererTurbo(this, 217, 155, textureX, textureY); // Box 304
		bodyModel[212] = new ModelRendererTurbo(this, 221, 167, textureX, textureY); // Box 41
		bodyModel[213] = new ModelRendererTurbo(this, 238, 168, textureX, textureY); // Box 41
		bodyModel[214] = new ModelRendererTurbo(this, 218, 168, textureX, textureY); // Box 41
		bodyModel[215] = new ModelRendererTurbo(this, 246, 173, textureX, textureY); // Box 283
		bodyModel[216] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 207, 270, textureX, textureY); // Box 38
		bodyModel[218] = new ModelRendererTurbo(this, 195, 298, textureX, textureY); // Box 38
		bodyModel[219] = new ModelRendererTurbo(this, 424, 52, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 438, 71, textureX, textureY); // Box 128
		bodyModel[221] = new ModelRendererTurbo(this, 438, 47, textureX, textureY); // Box 185
		bodyModel[222] = new ModelRendererTurbo(this, 1, 244, textureX, textureY); // Box 128
		bodyModel[223] = new ModelRendererTurbo(this, 15, 263, textureX, textureY); // Box 128
		bodyModel[224] = new ModelRendererTurbo(this, 15, 239, textureX, textureY); // Box 185
		bodyModel[225] = new ModelRendererTurbo(this, 176, 250, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[226] = new ModelRendererTurbo(this, 177, 244, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[227] = new ModelRendererTurbo(this, 177, 255, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[228] = new ModelRendererTurbo(this, 270, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[229] = new ModelRendererTurbo(this, 263, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[230] = new ModelRendererTurbo(this, 256, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[231] = new ModelRendererTurbo(this, 249, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[232] = new ModelRendererTurbo(this, 242, 247, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[233] = new ModelRendererTurbo(this, 127, 263, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 170, 298, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 21, 289, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 53, 303, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 55, 268, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 146, 272, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 50, 268, textureX, textureY); // Box 38
		bodyModel[241] = new ModelRendererTurbo(this, 86, 268, textureX, textureY); // Box 38
		bodyModel[242] = new ModelRendererTurbo(this, 60, 268, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 75, 268, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 483, 297, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 458, 303, textureX, textureY); // Box 38
		bodyModel[246] = new ModelRendererTurbo(this, 458, 312, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Box 38
		bodyModel[248] = new ModelRendererTurbo(this, 441, 286, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[249] = new ModelRendererTurbo(this, 6, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[250] = new ModelRendererTurbo(this, 3, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[251] = new ModelRendererTurbo(this, 0, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[252] = new ModelRendererTurbo(this, 28, 291, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[253] = new ModelRendererTurbo(this, 192, 258, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 192, 264, textureX, textureY); // Box 462
		bodyModel[255] = new ModelRendererTurbo(this, 67, 297, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 462
		bodyModel[257] = new ModelRendererTurbo(this, 472, 330, textureX, textureY); // Box 368
		bodyModel[258] = new ModelRendererTurbo(this, 471, 334, textureX, textureY); // Box 369
		bodyModel[259] = new ModelRendererTurbo(this, 469, 325, textureX, textureY); // Box 370
		bodyModel[260] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 379
		bodyModel[261] = new ModelRendererTurbo(this, 456, 325, textureX, textureY); // Box 380
		bodyModel[262] = new ModelRendererTurbo(this, 459, 330, textureX, textureY); // Box 382
		bodyModel[263] = new ModelRendererTurbo(this, 466, 241, textureX, textureY); // Box 462
		bodyModel[264] = new ModelRendererTurbo(this, 479, 322, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 464, 333, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[266] = new ModelRendererTurbo(this, 176, 239, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[267] = new ModelRendererTurbo(this, 65, 159, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[268] = new ModelRendererTurbo(this, 65, 157, textureX, textureY); // Box 31
		bodyModel[269] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[270] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[271] = new ModelRendererTurbo(this, 188, 329, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 188, 326, textureX, textureY); // Box 589
		bodyModel[273] = new ModelRendererTurbo(this, 151, 258, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 9, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[275] = new ModelRendererTurbo(this, 85, 292, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[276] = new ModelRendererTurbo(this, 149, 303, textureX, textureY); // Box 38
		bodyModel[277] = new ModelRendererTurbo(this, 12, 268, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[278] = new ModelRendererTurbo(this, 184, 272, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 184, 281, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 73, 290, textureX, textureY); // Box 38
		bodyModel[281] = new ModelRendererTurbo(this, 163, 303, textureX, textureY); // Box 38
		bodyModel[282] = new ModelRendererTurbo(this, 109, 1, textureX, textureY); // Box 278
		bodyModel[283] = new ModelRendererTurbo(this, 108, 6, textureX, textureY); // Box 279
		bodyModel[284] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[285] = new ModelRendererTurbo(this, 328, 164, textureX, textureY); // Box 2
		bodyModel[286] = new ModelRendererTurbo(this, 328, 176, textureX, textureY); // Box 2
		bodyModel[287] = new ModelRendererTurbo(this, 321, 167, textureX, textureY); // Box 2
		bodyModel[288] = new ModelRendererTurbo(this, 330, 167, textureX, textureY); // Box 2
		bodyModel[289] = new ModelRendererTurbo(this, 328, 170, textureX, textureY); // Box 2
		bodyModel[290] = new ModelRendererTurbo(this, 330, 173, textureX, textureY); // Box 2
		bodyModel[291] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 339, 173, textureX, textureY); // Box 128
		bodyModel[293] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 128
		bodyModel[294] = new ModelRendererTurbo(this, 325, 173, textureX, textureY); // Box 128
		bodyModel[295] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 628
		bodyModel[296] = new ModelRendererTurbo(this, 328, 148, textureX, textureY); // Box 629
		bodyModel[297] = new ModelRendererTurbo(this, 328, 160, textureX, textureY); // Box 630
		bodyModel[298] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 631
		bodyModel[299] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 632
		bodyModel[300] = new ModelRendererTurbo(this, 328, 154, textureX, textureY); // Box 633
		bodyModel[301] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 634
		bodyModel[302] = new ModelRendererTurbo(this, 339, 150, textureX, textureY); // Box 635
		bodyModel[303] = new ModelRendererTurbo(this, 339, 157, textureX, textureY); // Box 636
		bodyModel[304] = new ModelRendererTurbo(this, 321, 150, textureX, textureY); // Box 638
		bodyModel[305] = new ModelRendererTurbo(this, 325, 157, textureX, textureY); // Box 639
		bodyModel[306] = new ModelRendererTurbo(this, 77, 20, textureX, textureY); // Box 228
		bodyModel[307] = new ModelRendererTurbo(this, 76, 17, textureX, textureY); // Box 228
		bodyModel[308] = new ModelRendererTurbo(this, 441, 262, textureX, textureY); // Box 38
		bodyModel[309] = new ModelRendererTurbo(this, 120, 268, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 111, 268, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 348, 270, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 348, 299, textureX, textureY); // Left seat part
		bodyModel[313] = new ModelRendererTurbo(this, 337, 299, textureX, textureY); // Left seat part
		bodyModel[314] = new ModelRendererTurbo(this, 348, 277, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 353, 280, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 355, 277, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 348, 280, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 362, 277, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 335, 289, textureX, textureY); // Boc 42
		bodyModel[320] = new ModelRendererTurbo(this, 348, 285, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 353, 288, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 355, 285, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 348, 288, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 362, 285, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 348, 306, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 353, 309, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 355, 306, textureX, textureY); // Left seat part
		bodyModel[328] = new ModelRendererTurbo(this, 348, 309, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 362, 306, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 348, 314, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 353, 317, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 355, 314, textureX, textureY); // Left seat part
		bodyModel[333] = new ModelRendererTurbo(this, 348, 317, textureX, textureY); // Left seat part
		bodyModel[334] = new ModelRendererTurbo(this, 335, 318, textureX, textureY); // Boc 42
		bodyModel[335] = new ModelRendererTurbo(this, 333, 309, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[336] = new ModelRendererTurbo(this, 333, 280, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[337] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 362, 314, textureX, textureY); // Left seat part
		bodyModel[339] = new ModelRendererTurbo(this, 384, 270, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 384, 299, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 384, 277, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 389, 280, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 391, 277, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 384, 280, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 398, 277, textureX, textureY); // Right seat part
		bodyModel[346] = new ModelRendererTurbo(this, 371, 289, textureX, textureY); // Boc 42
		bodyModel[347] = new ModelRendererTurbo(this, 384, 285, textureX, textureY); // Right seat part
		bodyModel[348] = new ModelRendererTurbo(this, 389, 288, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 391, 285, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 384, 288, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 398, 285, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 384, 306, textureX, textureY); // Left seat part
		bodyModel[353] = new ModelRendererTurbo(this, 389, 309, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 391, 306, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 384, 309, textureX, textureY); // Left seat part
		bodyModel[356] = new ModelRendererTurbo(this, 398, 306, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 384, 314, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 389, 317, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 391, 314, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 384, 317, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 398, 314, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 371, 318, textureX, textureY); // Boc 42
		bodyModel[363] = new ModelRendererTurbo(this, 369, 309, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[364] = new ModelRendererTurbo(this, 369, 280, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[365] = new ModelRendererTurbo(this, 373, 270, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 373, 299, textureX, textureY); // Left seat part
		bodyModel[367] = new ModelRendererTurbo(this, 420, 270, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 409, 270, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 420, 299, textureX, textureY); // Left seat part
		bodyModel[370] = new ModelRendererTurbo(this, 409, 299, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 420, 277, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 425, 280, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 427, 277, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 420, 280, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 434, 277, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 407, 289, textureX, textureY); // Boc 42
		bodyModel[377] = new ModelRendererTurbo(this, 420, 285, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 427, 285, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 420, 288, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 434, 285, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 420, 306, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 425, 309, textureX, textureY); // Left seat part
		bodyModel[383] = new ModelRendererTurbo(this, 427, 306, textureX, textureY); // Left seat part
		bodyModel[384] = new ModelRendererTurbo(this, 420, 309, textureX, textureY); // Left seat part
		bodyModel[385] = new ModelRendererTurbo(this, 434, 306, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 420, 314, textureX, textureY); // Left seat part
		bodyModel[387] = new ModelRendererTurbo(this, 425, 317, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 427, 314, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 420, 317, textureX, textureY); // Left seat part
		bodyModel[390] = new ModelRendererTurbo(this, 434, 314, textureX, textureY); // Left seat part
		bodyModel[391] = new ModelRendererTurbo(this, 407, 318, textureX, textureY); // Boc 42
		bodyModel[392] = new ModelRendererTurbo(this, 405, 309, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[393] = new ModelRendererTurbo(this, 405, 280, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[394] = new ModelRendererTurbo(this, 425, 288, textureX, textureY); // Right seat part
		bodyModel[395] = new ModelRendererTurbo(this, 49, 343, textureX, textureY); // Right seat part
		bodyModel[396] = new ModelRendererTurbo(this, 51, 347, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 49, 355, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 181, 407, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 190, 416, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 156, 408, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 137, 424, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[402] = new ModelRendererTurbo(this, 156, 428, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[403] = new ModelRendererTurbo(this, 155, 419, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 129, 407, textureX, textureY); // Box 38
		bodyModel[405] = new ModelRendererTurbo(this, 137, 416, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 104, 408, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 85, 424, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[408] = new ModelRendererTurbo(this, 104, 428, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[409] = new ModelRendererTurbo(this, 103, 419, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 181, 440, textureX, textureY); // Box 870
		bodyModel[411] = new ModelRendererTurbo(this, 190, 449, textureX, textureY); // Box 871
		bodyModel[412] = new ModelRendererTurbo(this, 156, 441, textureX, textureY); // Box 872
		bodyModel[413] = new ModelRendererTurbo(this, 137, 457, textureX, textureY,"cull"); // Box 873 cull
		bodyModel[414] = new ModelRendererTurbo(this, 156, 461, textureX, textureY,"cull"); // Box 874 cull
		bodyModel[415] = new ModelRendererTurbo(this, 155, 452, textureX, textureY); // Box 875
		bodyModel[416] = new ModelRendererTurbo(this, 181, 473, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 190, 482, textureX, textureY); // Box 38
		bodyModel[418] = new ModelRendererTurbo(this, 156, 474, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 137, 490, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[420] = new ModelRendererTurbo(this, 156, 494, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[421] = new ModelRendererTurbo(this, 155, 485, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 46, 433, textureX, textureY); // Right seat part
		bodyModel[423] = new ModelRendererTurbo(this, 48, 437, textureX, textureY); // Right seat part
		bodyModel[424] = new ModelRendererTurbo(this, 46, 445, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 392, 376, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 394, 380, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 392, 388, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 401, 376, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 403, 380, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 401, 388, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 392, 392, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 394, 396, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 392, 404, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 401, 392, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 403, 396, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 401, 404, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 441, 288, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[438] = new ModelRendererTurbo(this, 39, 428, textureX, textureY); // Box 38
		bodyModel[439] = new ModelRendererTurbo(this, 39, 431, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[440] = new ModelRendererTurbo(this, 39, 423, textureX, textureY); // Box 915
		bodyModel[441] = new ModelRendererTurbo(this, 39, 426, textureX, textureY,"lamp"); // Box 916 glow
		bodyModel[442] = new ModelRendererTurbo(this, 11, 416, textureX, textureY); // Box 915
		bodyModel[443] = new ModelRendererTurbo(this, 44, 410, textureX, textureY); // Box 915
		bodyModel[444] = new ModelRendererTurbo(this, 43, 411, textureX, textureY); // Box 915
		bodyModel[445] = new ModelRendererTurbo(this, 45, 409, textureX, textureY); // Box 915
		bodyModel[446] = new ModelRendererTurbo(this, 72, 410, textureX, textureY); // Box 915
		bodyModel[447] = new ModelRendererTurbo(this, 71, 411, textureX, textureY); // Box 915
		bodyModel[448] = new ModelRendererTurbo(this, 73, 409, textureX, textureY); // Box 915
		bodyModel[449] = new ModelRendererTurbo(this, 58, 410, textureX, textureY); // Box 915
		bodyModel[450] = new ModelRendererTurbo(this, 57, 411, textureX, textureY); // Box 915
		bodyModel[451] = new ModelRendererTurbo(this, 59, 409, textureX, textureY); // Box 915
		bodyModel[452] = new ModelRendererTurbo(this, 51, 410, textureX, textureY); // Box 915
		bodyModel[453] = new ModelRendererTurbo(this, 50, 411, textureX, textureY); // Box 915
		bodyModel[454] = new ModelRendererTurbo(this, 52, 409, textureX, textureY); // Box 915
		bodyModel[455] = new ModelRendererTurbo(this, 65, 410, textureX, textureY); // Box 915
		bodyModel[456] = new ModelRendererTurbo(this, 64, 411, textureX, textureY); // Box 915
		bodyModel[457] = new ModelRendererTurbo(this, 66, 409, textureX, textureY); // Box 915
		bodyModel[458] = new ModelRendererTurbo(this, 410, 376, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 412, 380, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 410, 388, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 410, 392, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 412, 396, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 410, 404, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 221, 362, textureX, textureY); // Box 492
		bodyModel[465] = new ModelRendererTurbo(this, 225, 356, textureX, textureY); // Box 493
		bodyModel[466] = new ModelRendererTurbo(this, 210, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[467] = new ModelRendererTurbo(this, 232, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[468] = new ModelRendererTurbo(this, 180, 362, textureX, textureY); // Box 492
		bodyModel[469] = new ModelRendererTurbo(this, 184, 356, textureX, textureY); // Box 493
		bodyModel[470] = new ModelRendererTurbo(this, 169, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[471] = new ModelRendererTurbo(this, 191, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[472] = new ModelRendererTurbo(this, 139, 362, textureX, textureY); // Box 492
		bodyModel[473] = new ModelRendererTurbo(this, 143, 356, textureX, textureY); // Box 493
		bodyModel[474] = new ModelRendererTurbo(this, 128, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[475] = new ModelRendererTurbo(this, 150, 361, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[476] = new ModelRendererTurbo(this, 221, 338, textureX, textureY); // Box 563
		bodyModel[477] = new ModelRendererTurbo(this, 225, 332, textureX, textureY); // Box 564
		bodyModel[478] = new ModelRendererTurbo(this, 210, 337, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[479] = new ModelRendererTurbo(this, 232, 337, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[480] = new ModelRendererTurbo(this, 180, 338, textureX, textureY); // Box 568
		bodyModel[481] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 569
		bodyModel[482] = new ModelRendererTurbo(this, 169, 337, textureX, textureY,"cull"); // Box 570 cull
		bodyModel[483] = new ModelRendererTurbo(this, 191, 337, textureX, textureY,"cull"); // Box 571 cull
		bodyModel[484] = new ModelRendererTurbo(this, 139, 338, textureX, textureY); // Box 572
		bodyModel[485] = new ModelRendererTurbo(this, 143, 332, textureX, textureY); // Box 573
		bodyModel[486] = new ModelRendererTurbo(this, 128, 337, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[487] = new ModelRendererTurbo(this, 150, 337, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[488] = new ModelRendererTurbo(this, 318, 356, textureX, textureY); // Box 492
		bodyModel[489] = new ModelRendererTurbo(this, 322, 350, textureX, textureY); // Box 493
		bodyModel[490] = new ModelRendererTurbo(this, 307, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[491] = new ModelRendererTurbo(this, 329, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[492] = new ModelRendererTurbo(this, 303, 308, textureX, textureY); // Box 492
		bodyModel[493] = new ModelRendererTurbo(this, 307, 302, textureX, textureY); // Box 493
		bodyModel[494] = new ModelRendererTurbo(this, 292, 307, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[495] = new ModelRendererTurbo(this, 314, 307, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[496] = new ModelRendererTurbo(this, 262, 308, textureX, textureY); // Box 492
		bodyModel[497] = new ModelRendererTurbo(this, 266, 302, textureX, textureY); // Box 493
		bodyModel[498] = new ModelRendererTurbo(this, 251, 307, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[499] = new ModelRendererTurbo(this, 273, 307, textureX, textureY,"cull"); // Box 495 cull

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

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[168].setRotationPoint(61F, -16F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[169].setRotationPoint(61F, -16F, 1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[170].setRotationPoint(-61.5F, -16F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[171].setRotationPoint(-61.5F, -16F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[172].setRotationPoint(-61.5F, -15.8F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		bodyModel[173].setRotationPoint(61F, -15.8F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[174].setRotationPoint(54F, -6F, -12F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[175].setRotationPoint(59F, -6F, -12F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[176].setRotationPoint(54F, -6F, 11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[177].setRotationPoint(59F, -6F, 11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(-59.5F, -4.5F, -12F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[179].setRotationPoint(-59.5F, -4.5F, 11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(-59.5F, -1F, -12F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[181].setRotationPoint(-59.5F, -1F, 11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(50.75F, -18F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[183].setRotationPoint(50.75F, -18.5F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[184].setRotationPoint(50.75F, -18F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[185].setRotationPoint(50.75F, -18.5F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[186].setRotationPoint(-50.25F, -18F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[187].setRotationPoint(-50.25F, -18.5F, -10F);

		bodyModel[188].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[188].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[189].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 283
		bodyModel[189].setRotationPoint(11.5F, 3F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[190].setRotationPoint(27.5F, 3F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[191].setRotationPoint(19.5F, 2.75F, 9.4F);
		bodyModel[191].rotateAngleX = -0.78539816F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[192].setRotationPoint(19.49F, 3F, 8.9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[193].setRotationPoint(24.51F, 3F, 8.9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[194].setRotationPoint(-0.5F, 2.75F, -9.4F);
		bodyModel[194].rotateAngleX = -0.78539816F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[195].setRotationPoint(-0.51F, 3F, -9.9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[196].setRotationPoint(6.51F, 3F, -9.9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[197].setRotationPoint(-0.5F, 2.75F, -6.9F);
		bodyModel[197].rotateAngleX = -0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[198].setRotationPoint(-0.51F, 3F, -7.4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[199].setRotationPoint(6.51F, 3F, -7.4F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 283
		bodyModel[200].setRotationPoint(9.5F, 3F, 6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[201].setRotationPoint(6.5F, 2.75F, 6F);
		bodyModel[201].rotateAngleZ = -0.78539816F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[202].setRotationPoint(6F, 3F, 5.99F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[203].setRotationPoint(6F, 3F, 10.01F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 283
		bodyModel[204].setRotationPoint(2.5F, 3F, 9F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 283
		bodyModel[205].setRotationPoint(0.5F, 3F, 8F);

		bodyModel[206].addBox(0F, 0F, 0F, 15, 5, 5, 0F); // Box 283
		bodyModel[206].setRotationPoint(-15.5F, 3F, 5F);

		bodyModel[207].addBox(0F, 0F, 0F, 9, 5, 5, 0F); // Box 304
		bodyModel[207].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[208].setRotationPoint(-20.5F, 2.75F, -9.4F);
		bodyModel[208].rotateAngleX = -0.78539816F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[209].setRotationPoint(-20.51F, 3F, -9.9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[210].setRotationPoint(-16.49F, 3F, -9.9F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 304
		bodyModel[211].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[212].setRotationPoint(-31.5F, 4F, 0F);
		bodyModel[212].rotateAngleX = -0.78539816F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[213].setRotationPoint(-31.51F, 4F, -0.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[214].setRotationPoint(-25.49F, 4F, -0.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 283
		bodyModel[215].setRotationPoint(-26.5F, 3F, 5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[216].setRotationPoint(38.5F, -15F, -10F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[217].setRotationPoint(-19.5F, -15F, 3F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[218].setRotationPoint(-19.5F, -15F, -10F);

		bodyModel[219].addBox(0F, 0F, 0F, 15, 2, 16, 0F); // Box 128
		bodyModel[219].setRotationPoint(38.5F, -17F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[220].setRotationPoint(38.5F, -17F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[221].setRotationPoint(38.5F, -17F, 8F);

		bodyModel[222].addBox(0F, 0F, 0F, 40, 2, 16, 0F); // Box 128
		bodyModel[222].setRotationPoint(-58.5F, -17F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 40, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[223].setRotationPoint(-58.5F, -17F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 40, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[224].setRotationPoint(-58.5F, -17F, 8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[225].setRotationPoint(-18.5F, -14F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 57, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[226].setRotationPoint(-18.5F, -12.99F, 7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 57, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 glow
		bodyModel[227].setRotationPoint(-18.5F, -12.99F, -9.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[228].setRotationPoint(-12F, -17F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[229].setRotationPoint(-1.5F, -17F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[230].setRotationPoint(9F, -17F, -0.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[231].setRotationPoint(19.5F, -17F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[232].setRotationPoint(30F, -17F, -0.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 38
		bodyModel[233].setRotationPoint(-25.5F, -15F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 38
		bodyModel[234].setRotationPoint(-24.5F, -15F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[235].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[236].setRotationPoint(-58.5F, -15F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[237].setRotationPoint(-54.5F, -15F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[238].setRotationPoint(-54.5F, -15F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[239].setRotationPoint(-29.5F, -15F, 5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[240].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[241].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[241].setRotationPoint(-44.5F, -15F, 5F);

		bodyModel[242].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[242].setRotationPoint(-54.5F, -15F, 5F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[243].setRotationPoint(-48.5F, -15F, 5F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 16, 7, 0F); // Box 38
		bodyModel[244].setRotationPoint(44.5F, -15F, -10F);

		bodyModel[245].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[245].setRotationPoint(39.5F, -11F, -10F);

		bodyModel[246].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[246].setRotationPoint(39.5F, -5F, -10F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[247].setRotationPoint(47.5F, -15F, -4F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[248].setRotationPoint(46F, -14.99F, -0.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[249].setRotationPoint(-43F, -14.99F, 7.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[250].setRotationPoint(-51F, -14.99F, 7.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[251].setRotationPoint(-57.5F, -14.99F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 13, 0, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 384 glow
		bodyModel[252].setRotationPoint(-53F, -14.99F, -8.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 57, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[253].setRotationPoint(-18.5F, -11F, -9.9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 57, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[254].setRotationPoint(-18.5F, -11F, 9.9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 14, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[255].setRotationPoint(-53.5F, -11F, -9.9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 34, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[256].setRotationPoint(-58.5F, -11F, 9.9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[257].setRotationPoint(51.15F, -1F, -8.35F);
		bodyModel[257].rotateAngleY = -0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[258].setRotationPoint(50.45F, 0.5F, -8.35F);
		bodyModel[258].rotateAngleY = -0.78539816F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[259].setRotationPoint(49.55F, -2F, -8.9F);
		bodyModel[259].rotateAngleY = -0.78539816F;

		bodyModel[260].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 379
		bodyModel[260].setRotationPoint(47.5F, -8.5F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[261].setRotationPoint(47.5F, -6F, -7F);

		bodyModel[262].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[262].setRotationPoint(48.25F, -5F, -5.5F);
		bodyModel[262].rotateAngleY = -0.78539816F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 14, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[263].setRotationPoint(39.5F, -11F, 9.9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[264].setRotationPoint(47.5F, -11F, -9.9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[265].setRotationPoint(48.5F, -2F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38 cull
		bodyModel[266].setRotationPoint(-18.5F, -14F, 7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[267].setRotationPoint(-59.5F, 3F, 10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[268].setRotationPoint(-59.5F, 5F, 10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[269].setRotationPoint(-59.5F, 3F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[270].setRotationPoint(-59.5F, 5F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[271].setRotationPoint(-18.5F, -13.99F, -9.99F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 57, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 589
		bodyModel[272].setRotationPoint(-18.5F, -13.99F, 9.99F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[273].setRotationPoint(-29.5F, -15F, -2F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[274].setRotationPoint(-35F, -14.99F, 7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 0, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 384 glow
		bodyModel[275].setRotationPoint(-36F, -14.99F, -8.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[276].setRotationPoint(-28.5F, -15F, -2F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[277].setRotationPoint(-22F, -14.99F, -0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[278].setRotationPoint(-23.5F, -11F, 3F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[279].setRotationPoint(-23.5F, -5F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[280].setRotationPoint(-37.5F, -11F, -9.9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[281].setRotationPoint(-26.5F, -15F, -3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 278
		bodyModel[282].setRotationPoint(-27.25F, -18F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 279
		bodyModel[283].setRotationPoint(-27.25F, -18.5F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[284].setRotationPoint(54.5F, 2.5F, 5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[285].setRotationPoint(54.5F, 4F, 6.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F); // Box 2
		bodyModel[286].setRotationPoint(54.5F, 7F, 9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[287].setRotationPoint(54.5F, 2.5F, 6.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[288].setRotationPoint(54.5F, 4F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[289].setRotationPoint(54.5F, 5.5F, 8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[290].setRotationPoint(54.5F, 5.5F, 9.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[291].setRotationPoint(58.49F, 3F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[292].setRotationPoint(58.49F, 3F, 9.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[293].setRotationPoint(54.51F, 3F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 128
		bodyModel[294].setRotationPoint(54.51F, 3F, 9.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[295].setRotationPoint(54.5F, 2.5F, -7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[296].setRotationPoint(54.5F, 4F, -8.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 630
		bodyModel[297].setRotationPoint(54.5F, 7F, -11.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[298].setRotationPoint(54.5F, 2.5F, -6.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[299].setRotationPoint(54.5F, 4F, -8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[300].setRotationPoint(54.5F, 5.5F, -10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[301].setRotationPoint(54.5F, 5.5F, -9.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[302].setRotationPoint(58.49F, 3F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[303].setRotationPoint(58.49F, 3F, -11.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[304].setRotationPoint(54.51F, 3F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[305].setRotationPoint(54.51F, 3F, -11.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[306].setRotationPoint(-27.5F, -20.6F, 3.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.15F, -0.25F, -0.15F, 0.35F, -0.25F, -0.15F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0.2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 228
		bodyModel[307].setRotationPoint(-28.1F, -20.6F, 3F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[308].setRotationPoint(38.5F, -15F, 3F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[309].setRotationPoint(-30.5F, -15F, 5F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 38
		bodyModel[310].setRotationPoint(-33.5F, -15F, 5F);

		bodyModel[311].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[312].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[312].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[313].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[313].setRotationPoint(13.5F, -8F, -7F);

		bodyModel[314].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[314].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[315].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[315].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[316].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[317].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[317].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[318].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[318].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[319].setRotationPoint(12F, 0F, 4F);

		bodyModel[320].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[321].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[321].setRotationPoint(13.5F, -3F, 7F);

		bodyModel[322].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[322].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[323].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[323].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[324].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(13.5F, -4F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[326].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[326].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[327].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[327].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[328].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[328].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[329].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[329].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[331].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[331].setRotationPoint(13.5F, -3F, -7F);

		bodyModel[332].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[332].setRotationPoint(13.5F, -5F, -7F);

		bodyModel[333].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[333].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[334].setRotationPoint(12F, 0F, -10F);

		bodyModel[335].addShapeBox(-0.5F, 0F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part cull
		bodyModel[335].setRotationPoint(13.5F, -4.5F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, -3F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part cull
		bodyModel[336].setRotationPoint(13.5F, -4.5F, 7F);

		bodyModel[337].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[337].setRotationPoint(13.5F, -8F, 7F);

		bodyModel[338].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[338].setRotationPoint(13.5F, -4F, -7F);

		bodyModel[339].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(24F, -3F, 7F);

		bodyModel[340].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(24F, -3F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[341].setRotationPoint(24F, -5F, 7F);

		bodyModel[342].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[342].setRotationPoint(24F, -3F, 7F);

		bodyModel[343].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(24F, -5F, 7F);

		bodyModel[344].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[344].setRotationPoint(24F, -4.5F, 7F);

		bodyModel[345].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[345].setRotationPoint(24F, -4F, 7F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[346].setRotationPoint(22.5F, 0F, 4F);

		bodyModel[347].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[347].setRotationPoint(24F, -5F, 7F);

		bodyModel[348].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[348].setRotationPoint(24F, -3F, 7F);

		bodyModel[349].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(24F, -5F, 7F);

		bodyModel[350].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[350].setRotationPoint(24F, -4.5F, 7F);

		bodyModel[351].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[351].setRotationPoint(24F, -4F, 7F);

		bodyModel[352].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[352].setRotationPoint(24F, -5F, -7F);

		bodyModel[353].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[353].setRotationPoint(24F, -3F, -7F);

		bodyModel[354].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[354].setRotationPoint(24F, -5F, -7F);

		bodyModel[355].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[355].setRotationPoint(24F, -4.5F, -7F);

		bodyModel[356].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[356].setRotationPoint(24F, -4F, -7F);

		bodyModel[357].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[357].setRotationPoint(24F, -5F, -7F);

		bodyModel[358].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[358].setRotationPoint(24F, -3F, -7F);

		bodyModel[359].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(24F, -5F, -7F);

		bodyModel[360].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[360].setRotationPoint(24F, -4.5F, -7F);

		bodyModel[361].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[361].setRotationPoint(24F, -4F, -7F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[362].setRotationPoint(22.5F, 0F, -10F);

		bodyModel[363].addShapeBox(-0.5F, 0F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part cull
		bodyModel[363].setRotationPoint(24F, -4.5F, -7F);

		bodyModel[364].addShapeBox(0F, 0F, -3F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part cull
		bodyModel[364].setRotationPoint(24F, -4.5F, 7F);

		bodyModel[365].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(24F, -8F, 7F);

		bodyModel[366].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[366].setRotationPoint(24F, -8F, -7F);

		bodyModel[367].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[367].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(34.5F, -8F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[369].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[370].setRotationPoint(34.5F, -8F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[372].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(34.5F, -4.5F, 7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[375].setRotationPoint(34.5F, -4F, 7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[376].setRotationPoint(33F, 0F, 4F);

		bodyModel[377].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(34.5F, -4.5F, 7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[380].setRotationPoint(34.5F, -4F, 7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[381].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[382].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[383].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addShapeBox(1.5F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[384].setRotationPoint(34.5F, -4.5F, -7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[385].setRotationPoint(34.5F, -4F, -7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[386].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[387].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[388].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(1.5F, 0F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Left seat part
		bodyModel[389].setRotationPoint(34.5F, -4.5F, -7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[390].setRotationPoint(34.5F, -4F, -7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[391].setRotationPoint(33F, 0F, -10F);

		bodyModel[392].addShapeBox(-0.5F, 0F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part cull
		bodyModel[392].setRotationPoint(34.5F, -4.5F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addShapeBox(0F, 0F, -3F, 1, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part cull
		bodyModel[393].setRotationPoint(34.5F, -4.5F, 7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[394].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[395].setRotationPoint(-49.5F, -5F, -3.5F);

		bodyModel[396].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[396].setRotationPoint(-48.5F, -5.5F, -2.5F);
		bodyModel[396].rotateAngleY = -0.78539816F;

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[397].setRotationPoint(-49.5F, 0.5F, -3.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[398].setRotationPoint(-33.5F, -5F, -10F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[399].setRotationPoint(-32F, -4F, -5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38
		bodyModel[400].setRotationPoint(-37.5F, -3F, -9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -0.5F, -4F, -4F); // Box 38 cull
		bodyModel[401].setRotationPoint(-38F, -7F, -9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38 cull
		bodyModel[402].setRotationPoint(-37.5F, -2F, -9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[403].setRotationPoint(-37.5F, -0.5F, -9F);

		bodyModel[404].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[404].setRotationPoint(-42.5F, -5F, -10F);

		bodyModel[405].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[405].setRotationPoint(-41F, -4F, -5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38
		bodyModel[406].setRotationPoint(-46.5F, -3F, -9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -0.5F, -4F, -4F); // Box 38 cull
		bodyModel[407].setRotationPoint(-47F, -7F, -9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38 cull
		bodyModel[408].setRotationPoint(-46.5F, -2F, -9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[409].setRotationPoint(-46.5F, -0.5F, -9F);

		bodyModel[410].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 870
		bodyModel[410].setRotationPoint(-33.5F, -5F, 3F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 871
		bodyModel[411].setRotationPoint(-32F, -4F, 4F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -4F, -1F, -4F, -4F, -1F, 0F, 0F, -1F, 0F); // Box 872
		bodyModel[412].setRotationPoint(-37.5F, -3F, 1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, -0.5F, -4F, 0F); // Box 873 cull
		bodyModel[413].setRotationPoint(-38F, -7F, 1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -4F, -1F, -4F, -4F, -1F, 0F, 0F, -1F, 0F); // Box 874 cull
		bodyModel[414].setRotationPoint(-37.5F, -2F, 1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[415].setRotationPoint(-37.5F, -0.5F, 1F);

		bodyModel[416].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 38
		bodyModel[416].setRotationPoint(-51.5F, -5F, -10F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 38
		bodyModel[417].setRotationPoint(-50F, -4F, -5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38
		bodyModel[418].setRotationPoint(-55.5F, -3F, -9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -0.5F, -4F, -4F); // Box 38 cull
		bodyModel[419].setRotationPoint(-56F, -7F, -9F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -4F, 0F, -1F, -4F); // Box 38 cull
		bodyModel[420].setRotationPoint(-55.5F, -2F, -9F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 9, 0, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F); // Box 38
		bodyModel[421].setRotationPoint(-55.5F, -0.5F, -9F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[422].setRotationPoint(-49F, -5F, 2.25F);

		bodyModel[423].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[423].setRotationPoint(-48F, -5.5F, 3.25F);
		bodyModel[423].rotateAngleY = -0.78539816F;

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[424].setRotationPoint(-49F, 0.5F, 2.25F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[425].setRotationPoint(-10.6F, -5F, 2.5F);

		bodyModel[426].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[426].setRotationPoint(-9.6F, -5.5F, 3.5F);
		bodyModel[426].rotateAngleY = -0.78539816F;

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[427].setRotationPoint(-10.6F, 0.5F, 2.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(4.5F, -5F, 2.5F);

		bodyModel[429].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[429].setRotationPoint(5.5F, -5.5F, 3.5F);
		bodyModel[429].rotateAngleY = -0.78539816F;

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[430].setRotationPoint(4.5F, 0.5F, 2.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[431].setRotationPoint(-14F, -5F, -4.5F);

		bodyModel[432].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[432].setRotationPoint(-13F, -5.5F, -3.5F);
		bodyModel[432].rotateAngleY = -0.78539816F;

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[433].setRotationPoint(-14F, 0.5F, -4.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(-0.6F, -5F, -4.5F);

		bodyModel[435].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[435].setRotationPoint(0.4F, -5.5F, -3.5F);
		bodyModel[435].rotateAngleY = -0.78539816F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[436].setRotationPoint(-0.6F, 0.5F, -4.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 384 glow
		bodyModel[437].setRotationPoint(43F, -14.99F, 6.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[438].setRotationPoint(-53.5F, -11F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 22, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[439].setRotationPoint(-53.5F, -9.99F, -10F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		bodyModel[440].setRotationPoint(-53.5F, -11F, 9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 22, 0, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916 glow
		bodyModel[441].setRotationPoint(-53.5F, -9.99F, 9F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 43, 0, 5, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -2F, 0F, 0F, -2F); // Box 915
		bodyModel[442].setRotationPoint(-53.5F, -13F, 7.17F);
		bodyModel[442].rotateAngleX = -0.34906585F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[443].setRotationPoint(-53.5F, -14F, 7.15F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.02F, -0.15F, 0F, 0.02F, -0.15F); // Box 915
		bodyModel[444].setRotationPoint(-53.5F, -13F, 7.15F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[445].setRotationPoint(-53.5F, -14F, 6.65F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[446].setRotationPoint(-31.5F, -14F, 7.15F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.02F, -0.15F, 0F, 0.02F, -0.15F); // Box 915
		bodyModel[447].setRotationPoint(-31.5F, -13F, 7.15F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[448].setRotationPoint(-31.5F, -14F, 6.65F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[449].setRotationPoint(-42.5F, -14F, 7.15F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.02F, -0.15F, 0F, 0.02F, -0.15F); // Box 915
		bodyModel[450].setRotationPoint(-42.5F, -13F, 7.15F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[451].setRotationPoint(-42.5F, -14F, 6.65F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[452].setRotationPoint(-47.75F, -14F, 7.15F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.02F, -0.15F, 0F, 0.02F, -0.15F); // Box 915
		bodyModel[453].setRotationPoint(-47.75F, -13F, 7.15F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[454].setRotationPoint(-47.75F, -14F, 6.65F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[455].setRotationPoint(-37.25F, -14F, 7.15F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.02F, -0.15F, 0F, 0.02F, -0.15F); // Box 915
		bodyModel[456].setRotationPoint(-37.25F, -13F, 7.15F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 915
		bodyModel[457].setRotationPoint(-37.25F, -14F, 6.65F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[458].setRotationPoint(29.5F, -5F, 2.5F);

		bodyModel[459].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[459].setRotationPoint(30.5F, -5.5F, 3.5F);
		bodyModel[459].rotateAngleY = -0.78539816F;

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[460].setRotationPoint(29.5F, 0.5F, 2.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[461].setRotationPoint(24.5F, -5F, -4.5F);

		bodyModel[462].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[462].setRotationPoint(25.5F, -5.5F, -3.5F);
		bodyModel[462].rotateAngleY = -0.78539816F;

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[463].setRotationPoint(24.5F, 0.5F, -4.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[464].setRotationPoint(-4F, -3F, -9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[465].setRotationPoint(-4F, -7F, -9F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[466].setRotationPoint(-4.45F, -4.5F, -9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[467].setRotationPoint(-0.550000000000001F, -4.5F, -9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[468].setRotationPoint(-9F, -3F, -9F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[469].setRotationPoint(-9F, -7F, -9F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[470].setRotationPoint(-9.45F, -4.5F, -9F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[471].setRotationPoint(-5.55F, -4.5F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[472].setRotationPoint(-14F, -3F, -9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[473].setRotationPoint(-14F, -7F, -9F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[474].setRotationPoint(-14.45F, -4.5F, -9F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[475].setRotationPoint(-10.55F, -4.5F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[476].setRotationPoint(-4F, -3F, 4F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[477].setRotationPoint(-4F, -7F, 8F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[478].setRotationPoint(-4.45F, -4.5F, 1F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[479].setRotationPoint(-0.550000000000001F, -4.5F, 1F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[480].setRotationPoint(-9F, -3F, 4F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[481].setRotationPoint(-9F, -7F, 8F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 570 cull
		bodyModel[482].setRotationPoint(-9.45F, -4.5F, 1F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 571 cull
		bodyModel[483].setRotationPoint(-5.55F, -4.5F, 1F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[484].setRotationPoint(-14F, -3F, 4F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[485].setRotationPoint(-14F, -7F, 8F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 574 cull
		bodyModel[486].setRotationPoint(-14.45F, -4.5F, 1F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 575 cull
		bodyModel[487].setRotationPoint(-10.55F, -4.5F, 1F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[488].setRotationPoint(11F, -3F, -9F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[489].setRotationPoint(11F, -7F, -9F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[490].setRotationPoint(10.55F, -4.5F, -9F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[491].setRotationPoint(14.45F, -4.5F, -9F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[492].setRotationPoint(6F, -3F, -9F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[493].setRotationPoint(6F, -7F, -9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[494].setRotationPoint(5.55F, -4.5F, -9F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[495].setRotationPoint(9.45F, -4.5F, -9F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[496].setRotationPoint(1F, -3F, -9F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[497].setRotationPoint(1F, -7F, -9F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[498].setRotationPoint(0.550000000000001F, -4.5F, -9F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[499].setRotationPoint(4.45F, -4.5F, -9F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 318, 332, textureX, textureY); // Box 563
		bodyModel[501] = new ModelRendererTurbo(this, 322, 326, textureX, textureY); // Box 564
		bodyModel[502] = new ModelRendererTurbo(this, 307, 331, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[503] = new ModelRendererTurbo(this, 329, 331, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[504] = new ModelRendererTurbo(this, 303, 279, textureX, textureY); // Box 568
		bodyModel[505] = new ModelRendererTurbo(this, 307, 273, textureX, textureY); // Box 569
		bodyModel[506] = new ModelRendererTurbo(this, 292, 278, textureX, textureY,"cull"); // Box 570 cull
		bodyModel[507] = new ModelRendererTurbo(this, 314, 278, textureX, textureY,"cull"); // Box 571 cull
		bodyModel[508] = new ModelRendererTurbo(this, 262, 279, textureX, textureY); // Box 572
		bodyModel[509] = new ModelRendererTurbo(this, 266, 273, textureX, textureY); // Box 573
		bodyModel[510] = new ModelRendererTurbo(this, 251, 278, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[511] = new ModelRendererTurbo(this, 273, 278, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[512] = new ModelRendererTurbo(this, 359, 356, textureX, textureY); // Box 492
		bodyModel[513] = new ModelRendererTurbo(this, 363, 350, textureX, textureY); // Box 493
		bodyModel[514] = new ModelRendererTurbo(this, 348, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[515] = new ModelRendererTurbo(this, 370, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[516] = new ModelRendererTurbo(this, 359, 332, textureX, textureY); // Box 563
		bodyModel[517] = new ModelRendererTurbo(this, 363, 326, textureX, textureY); // Box 564
		bodyModel[518] = new ModelRendererTurbo(this, 348, 331, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[519] = new ModelRendererTurbo(this, 370, 331, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[520] = new ModelRendererTurbo(this, 400, 356, textureX, textureY); // Box 492
		bodyModel[521] = new ModelRendererTurbo(this, 404, 350, textureX, textureY); // Box 493
		bodyModel[522] = new ModelRendererTurbo(this, 389, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[523] = new ModelRendererTurbo(this, 411, 355, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[524] = new ModelRendererTurbo(this, 400, 332, textureX, textureY); // Box 563
		bodyModel[525] = new ModelRendererTurbo(this, 404, 326, textureX, textureY); // Box 564
		bodyModel[526] = new ModelRendererTurbo(this, 389, 331, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[527] = new ModelRendererTurbo(this, 411, 331, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[528] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Box 492
		bodyModel[529] = new ModelRendererTurbo(this, 445, 363, textureX, textureY); // Box 493
		bodyModel[530] = new ModelRendererTurbo(this, 430, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[531] = new ModelRendererTurbo(this, 452, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[532] = new ModelRendererTurbo(this, 441, 345, textureX, textureY); // Box 563
		bodyModel[533] = new ModelRendererTurbo(this, 445, 339, textureX, textureY); // Box 564
		bodyModel[534] = new ModelRendererTurbo(this, 430, 344, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[535] = new ModelRendererTurbo(this, 452, 344, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[536] = new ModelRendererTurbo(this, 482, 369, textureX, textureY); // Box 492
		bodyModel[537] = new ModelRendererTurbo(this, 486, 363, textureX, textureY); // Box 493
		bodyModel[538] = new ModelRendererTurbo(this, 471, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[539] = new ModelRendererTurbo(this, 493, 368, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[540] = new ModelRendererTurbo(this, 482, 345, textureX, textureY); // Box 563
		bodyModel[541] = new ModelRendererTurbo(this, 486, 339, textureX, textureY); // Box 564
		bodyModel[542] = new ModelRendererTurbo(this, 471, 344, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[543] = new ModelRendererTurbo(this, 493, 344, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[544] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 563
		bodyModel[545] = new ModelRendererTurbo(this, 445, 387, textureX, textureY); // Box 564
		bodyModel[546] = new ModelRendererTurbo(this, 430, 392, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[547] = new ModelRendererTurbo(this, 452, 392, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[548] = new ModelRendererTurbo(this, 482, 393, textureX, textureY); // Box 563
		bodyModel[549] = new ModelRendererTurbo(this, 486, 387, textureX, textureY); // Box 564
		bodyModel[550] = new ModelRendererTurbo(this, 471, 392, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[551] = new ModelRendererTurbo(this, 493, 392, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[552] = new ModelRendererTurbo(this, 133, 389, textureX, textureY); // Box 563
		bodyModel[553] = new ModelRendererTurbo(this, 137, 383, textureX, textureY); // Box 564
		bodyModel[554] = new ModelRendererTurbo(this, 122, 388, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[555] = new ModelRendererTurbo(this, 144, 388, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[556] = new ModelRendererTurbo(this, 174, 389, textureX, textureY); // Box 563
		bodyModel[557] = new ModelRendererTurbo(this, 178, 383, textureX, textureY); // Box 564
		bodyModel[558] = new ModelRendererTurbo(this, 163, 388, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[559] = new ModelRendererTurbo(this, 185, 388, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[560] = new ModelRendererTurbo(this, 66, 456, textureX, textureY); // Box 563
		bodyModel[561] = new ModelRendererTurbo(this, 70, 450, textureX, textureY); // Box 564
		bodyModel[562] = new ModelRendererTurbo(this, 55, 455, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[563] = new ModelRendererTurbo(this, 77, 455, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[564] = new ModelRendererTurbo(this, 107, 456, textureX, textureY); // Box 563
		bodyModel[565] = new ModelRendererTurbo(this, 111, 450, textureX, textureY); // Box 564
		bodyModel[566] = new ModelRendererTurbo(this, 96, 455, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[567] = new ModelRendererTurbo(this, 118, 455, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[568] = new ModelRendererTurbo(this, 25, 456, textureX, textureY); // Box 563
		bodyModel[569] = new ModelRendererTurbo(this, 29, 450, textureX, textureY); // Box 564
		bodyModel[570] = new ModelRendererTurbo(this, 14, 455, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[571] = new ModelRendererTurbo(this, 36, 455, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[572] = new ModelRendererTurbo(this, 12, 480, textureX, textureY); // Box 563
		bodyModel[573] = new ModelRendererTurbo(this, 16, 474, textureX, textureY); // Box 564
		bodyModel[574] = new ModelRendererTurbo(this, 1, 479, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[575] = new ModelRendererTurbo(this, 23, 479, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[576] = new ModelRendererTurbo(this, 57, 364, textureX, textureY); // Box 563
		bodyModel[577] = new ModelRendererTurbo(this, 62, 355, textureX, textureY); // Box 564
		bodyModel[578] = new ModelRendererTurbo(this, 58, 343, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[579] = new ModelRendererTurbo(this, 57, 370, textureX, textureY,"cull"); // Box 566 cull
		bodyModel[580] = new ModelRendererTurbo(this, 58, 325, textureX, textureY); // Box 563
		bodyModel[581] = new ModelRendererTurbo(this, 62, 316, textureX, textureY); // Box 564
		bodyModel[582] = new ModelRendererTurbo(this, 58, 304, textureX, textureY,"cull"); // Box 565 cull
		bodyModel[583] = new ModelRendererTurbo(this, 58, 331, textureX, textureY,"cull"); // Box 566 cull

		bodyModel[500].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[500].setRotationPoint(11F, -3F, 4F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[501].setRotationPoint(11F, -7F, 8F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[502].setRotationPoint(10.55F, -4.5F, 1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[503].setRotationPoint(14.45F, -4.5F, 1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[504].setRotationPoint(6F, -3F, 4F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[505].setRotationPoint(6F, -7F, 8F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 570 cull
		bodyModel[506].setRotationPoint(5.55F, -4.5F, 1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 571 cull
		bodyModel[507].setRotationPoint(9.45F, -4.5F, 1F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[508].setRotationPoint(1F, -3F, 4F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[509].setRotationPoint(1F, -7F, 8F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 574 cull
		bodyModel[510].setRotationPoint(0.550000000000001F, -4.5F, 1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 575 cull
		bodyModel[511].setRotationPoint(4.45F, -4.5F, 1F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[512].setRotationPoint(16F, -3F, -9F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[513].setRotationPoint(16F, -7F, -9F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[514].setRotationPoint(15.55F, -4.5F, -9F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[515].setRotationPoint(19.45F, -4.5F, -9F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[516].setRotationPoint(16F, -3F, 4F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[517].setRotationPoint(16F, -7F, 8F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[518].setRotationPoint(15.55F, -4.5F, 1F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[519].setRotationPoint(19.45F, -4.5F, 1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[520].setRotationPoint(21F, -3F, -9F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[521].setRotationPoint(21F, -7F, -9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[522].setRotationPoint(20.55F, -4.5F, -9F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[523].setRotationPoint(24.45F, -4.5F, -9F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[524].setRotationPoint(21F, -3F, 4F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[525].setRotationPoint(21F, -7F, 8F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[526].setRotationPoint(20.55F, -4.5F, 1F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[527].setRotationPoint(24.45F, -4.5F, 1F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[528].setRotationPoint(26F, -3F, -9F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[529].setRotationPoint(26F, -7F, -9F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[530].setRotationPoint(25.55F, -4.5F, -9F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[531].setRotationPoint(29.45F, -4.5F, -9F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[532].setRotationPoint(26F, -3F, 4F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[533].setRotationPoint(26F, -7F, 8F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[534].setRotationPoint(25.55F, -4.5F, 1F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[535].setRotationPoint(29.45F, -4.5F, 1F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[536].setRotationPoint(31F, -3F, -9F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[537].setRotationPoint(31F, -7F, -9F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[538].setRotationPoint(30.55F, -4.5F, -9F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F); // Box 495 cull
		bodyModel[539].setRotationPoint(34.45F, -4.5F, -9F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[540].setRotationPoint(31F, -3F, 4F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[541].setRotationPoint(31F, -7F, 8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[542].setRotationPoint(30.55F, -4.5F, 1F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[543].setRotationPoint(34.45F, -4.5F, 1F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[544].setRotationPoint(42F, -3F, 4F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[545].setRotationPoint(42F, -7F, 8F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[546].setRotationPoint(41.55F, -4.5F, 1F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[547].setRotationPoint(45.45F, -4.5F, 1F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[548].setRotationPoint(47F, -3F, 4F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[549].setRotationPoint(47F, -7F, 8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[550].setRotationPoint(46.55F, -4.5F, 1F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[551].setRotationPoint(50.45F, -4.5F, 1F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[552].setRotationPoint(-43.5F, -3F, 0F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[553].setRotationPoint(-43.5F, -7F, 4F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[554].setRotationPoint(-43.95F, -4.5F, -3F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[555].setRotationPoint(-40.05F, -4.5F, -3F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[556].setRotationPoint(-38.5F, -3F, 0F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[557].setRotationPoint(-38.5F, -7F, 4F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[558].setRotationPoint(-38.95F, -4.5F, -3F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[559].setRotationPoint(-35.05F, -4.5F, -3F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[560].setRotationPoint(-47.5F, -3F, 4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[561].setRotationPoint(-47.5F, -7F, 8F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[562].setRotationPoint(-47.95F, -4.5F, 1F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[563].setRotationPoint(-44.05F, -4.5F, 1F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[564].setRotationPoint(-42.5F, -3F, 4F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[565].setRotationPoint(-42.5F, -7F, 8F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[566].setRotationPoint(-42.95F, -4.5F, 1F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[567].setRotationPoint(-39.05F, -4.5F, 1F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[568].setRotationPoint(-52.5F, -3F, 4F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[569].setRotationPoint(-52.5F, -7F, 8F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[570].setRotationPoint(-52.95F, -4.5F, 1F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[571].setRotationPoint(-49.05F, -4.5F, 1F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[572].setRotationPoint(-57.5F, -3F, 4F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[573].setRotationPoint(-57.5F, -7F, 8F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 565 cull
		bodyModel[574].setRotationPoint(-57.95F, -4.5F, 1F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 566 cull
		bodyModel[575].setRotationPoint(-54.05F, -4.5F, 1F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[576].setRotationPoint(-54F, -3F, -7F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[577].setRotationPoint(-54F, -7F, -7F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 565 cull
		bodyModel[578].setRotationPoint(-54F, -4.5F, -3.05F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, -4F, -4.5F, -0.5F, -4F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 566 cull
		bodyModel[579].setRotationPoint(-54F, -4.5F, -7.95F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[580].setRotationPoint(-54F, -3F, -2F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[581].setRotationPoint(-54F, -7F, -2F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 565 cull
		bodyModel[582].setRotationPoint(-54F, -4.5F, 1.95F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, -4F, -4.5F, -0.5F, -4F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 566 cull
		bodyModel[583].setRotationPoint(-54F, -4.5F, -2.95F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 584; i++)
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