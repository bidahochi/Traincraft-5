//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41GT;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41TRV11;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPSATSF50SeatCoach_Observation extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSATSF50SeatCoach_Observation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[567];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 322, 135, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 46, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 293, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 57, 154, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 66, 154, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 54, 62, textureX, textureY); // Left step part
		bodyModel[13] = new ModelRendererTurbo(this, 52, 65, textureX, textureY); // Left step part
		bodyModel[14] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Left step part
		bodyModel[15] = new ModelRendererTurbo(this, 52, 71, textureX, textureY); // Left step part
		bodyModel[16] = new ModelRendererTurbo(this, 54, 77, textureX, textureY); // Left step part
		bodyModel[17] = new ModelRendererTurbo(this, 45, 79, textureX, textureY); // Left step part
		bodyModel[18] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Left step part
		bodyModel[19] = new ModelRendererTurbo(this, 46, 74, textureX, textureY); // Left step part
		bodyModel[20] = new ModelRendererTurbo(this, 63, 79, textureX, textureY); // Left step part
		bodyModel[21] = new ModelRendererTurbo(this, 63, 77, textureX, textureY); // Left step part
		bodyModel[22] = new ModelRendererTurbo(this, 64, 74, textureX, textureY); // Left step part
		bodyModel[23] = new ModelRendererTurbo(this, 54, 74, textureX, textureY); // Left step part
		bodyModel[24] = new ModelRendererTurbo(this, 50, 81, textureX, textureY); // Left step part
		bodyModel[25] = new ModelRendererTurbo(this, 57, 163, textureX, textureY); // Box 144
		bodyModel[26] = new ModelRendererTurbo(this, 66, 163, textureX, textureY); // Box 145
		bodyModel[27] = new ModelRendererTurbo(this, 54, 87, textureX, textureY); // Right step part
		bodyModel[28] = new ModelRendererTurbo(this, 52, 90, textureX, textureY); // Right step part
		bodyModel[29] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Right step part
		bodyModel[30] = new ModelRendererTurbo(this, 52, 96, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 54, 102, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 45, 100, textureX, textureY); // Right step part
		bodyModel[33] = new ModelRendererTurbo(this, 45, 98, textureX, textureY); // Right step part
		bodyModel[34] = new ModelRendererTurbo(this, 46, 95, textureX, textureY); // Right step part
		bodyModel[35] = new ModelRendererTurbo(this, 63, 100, textureX, textureY); // Right step part
		bodyModel[36] = new ModelRendererTurbo(this, 63, 98, textureX, textureY); // Right step part
		bodyModel[37] = new ModelRendererTurbo(this, 64, 95, textureX, textureY); // Right step part
		bodyModel[38] = new ModelRendererTurbo(this, 54, 99, textureX, textureY); // Right step part
		bodyModel[39] = new ModelRendererTurbo(this, 50, 106, textureX, textureY); // Right step part
		bodyModel[40] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[41] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[42] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[53] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[56] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[57] = new ModelRendererTurbo(this, 72, 227, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 72, 193, textureX, textureY); // Box 177
		bodyModel[59] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[61] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[62] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[63] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[66] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 72, 199, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[69] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 237, 148, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 235, 151, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[83] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[84] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[85] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[86] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[87] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 31
		bodyModel[88] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[89] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[90] = new ModelRendererTurbo(this, 237, 138, textureX, textureY); // Box 34
		bodyModel[91] = new ModelRendererTurbo(this, 235, 141, textureX, textureY); // Box 35
		bodyModel[92] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[93] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[94] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[95] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[96] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[98] = new ModelRendererTurbo(this, 63, 155, textureX, textureY); // Box 26
		bodyModel[99] = new ModelRendererTurbo(this, 64, 158, textureX, textureY); // Box 26
		bodyModel[100] = new ModelRendererTurbo(this, 54, 155, textureX, textureY); // Box 26
		bodyModel[101] = new ModelRendererTurbo(this, 55, 158, textureX, textureY); // Box 26
		bodyModel[102] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 140
		bodyModel[103] = new ModelRendererTurbo(this, 64, 167, textureX, textureY); // Box 141
		bodyModel[104] = new ModelRendererTurbo(this, 54, 164, textureX, textureY); // Box 142
		bodyModel[105] = new ModelRendererTurbo(this, 55, 167, textureX, textureY); // Box 143
		bodyModel[106] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 251, 157, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 251, 164, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 350, 167, textureX, textureY); // Box 283
		bodyModel[118] = new ModelRendererTurbo(this, 286, 170, textureX, textureY); // Box 41
		bodyModel[119] = new ModelRendererTurbo(this, 303, 171, textureX, textureY); // Box 41
		bodyModel[120] = new ModelRendererTurbo(this, 283, 171, textureX, textureY); // Box 41
		bodyModel[121] = new ModelRendererTurbo(this, 368, 155, textureX, textureY); // Box 544
		bodyModel[122] = new ModelRendererTurbo(this, 128, 1, textureX, textureY); // Box 205
		bodyModel[123] = new ModelRendererTurbo(this, 282, 106, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 309, 118, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 309, 122, textureX, textureY); // Box 174
		bodyModel[126] = new ModelRendererTurbo(this, 318, 109, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 337, 111, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 337, 117, textureX, textureY); // Box 161
		bodyModel[129] = new ModelRendererTurbo(this, 350, 114, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 359, 106, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 359, 113, textureX, textureY); // Box 163
		bodyModel[132] = new ModelRendererTurbo(this, 296, 321, textureX, textureY); // Box 38
		bodyModel[133] = new ModelRendererTurbo(this, 296, 286, textureX, textureY); // Box 156
		bodyModel[134] = new ModelRendererTurbo(this, 294, 68, textureX, textureY); // Box 38
		bodyModel[135] = new ModelRendererTurbo(this, 294, 87, textureX, textureY); // Box 175
		bodyModel[136] = new ModelRendererTurbo(this, 337, 72, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 312, 66, textureX, textureY); // Box 2
		bodyModel[138] = new ModelRendererTurbo(this, 303, 70, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 312, 86, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 303, 89, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 31
		bodyModel[142] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 31
		bodyModel[143] = new ModelRendererTurbo(this, 278, 138, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 239
		bodyModel[145] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 240
		bodyModel[146] = new ModelRendererTurbo(this, 278, 148, textureX, textureY); // Box 241
		bodyModel[147] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[148] = new ModelRendererTurbo(this, 269, 141, textureX, textureY); // Box 31
		bodyModel[149] = new ModelRendererTurbo(this, 285, 140, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 245 cull
		bodyModel[151] = new ModelRendererTurbo(this, 269, 151, textureX, textureY); // Box 246
		bodyModel[152] = new ModelRendererTurbo(this, 285, 150, textureX, textureY); // Box 247
		bodyModel[153] = new ModelRendererTurbo(this, 322, 86, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 352, 76, textureX, textureY); // Box 38
		bodyModel[155] = new ModelRendererTurbo(this, 296, 141, textureX, textureY); // Box 472
		bodyModel[156] = new ModelRendererTurbo(this, 421, 43, textureX, textureY); // Box 169
		bodyModel[157] = new ModelRendererTurbo(this, 426, 43, textureX, textureY); // Box 169
		bodyModel[158] = new ModelRendererTurbo(this, 419, 46, textureX, textureY); // Box 169
		bodyModel[159] = new ModelRendererTurbo(this, 416, 43, textureX, textureY); // Box 555
		bodyModel[160] = new ModelRendererTurbo(this, 426, 51, textureX, textureY); // Box 169
		bodyModel[161] = new ModelRendererTurbo(this, 416, 51, textureX, textureY); // Box 557
		bodyModel[162] = new ModelRendererTurbo(this, 421, 51, textureX, textureY); // Box 169
		bodyModel[163] = new ModelRendererTurbo(this, 432, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[164] = new ModelRendererTurbo(this, 435, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[165] = new ModelRendererTurbo(this, 430, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[166] = new ModelRendererTurbo(this, 429, 45, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[167] = new ModelRendererTurbo(this, 435, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[168] = new ModelRendererTurbo(this, 429, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[169] = new ModelRendererTurbo(this, 432, 49, textureX, textureY,"lamp"); // Box 555 rear light
		bodyModel[170] = new ModelRendererTurbo(this, 323, 71, textureX, textureY,"lamp"); // marker light glow
		bodyModel[171] = new ModelRendererTurbo(this, 323, 88, textureX, textureY,"lamp"); // marker light glow
		bodyModel[172] = new ModelRendererTurbo(this, 330, 74, textureX, textureY); // Box 38
		bodyModel[173] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 280
		bodyModel[175] = new ModelRendererTurbo(this, 323, 91, textureX, textureY); // Box 281
		bodyModel[176] = new ModelRendererTurbo(this, 93, 306, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[178] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[179] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[180] = new ModelRendererTurbo(this, 283, 266, textureX, textureY); // Right seat part
		bodyModel[181] = new ModelRendererTurbo(this, 270, 266, textureX, textureY); // Right seat part
		bodyModel[182] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[183] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[184] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[185] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[186] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[187] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[188] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[189] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[190] = new ModelRendererTurbo(this, 255, 266, textureX, textureY); // Right seat part
		bodyModel[191] = new ModelRendererTurbo(this, 242, 266, textureX, textureY); // Right seat part
		bodyModel[192] = new ModelRendererTurbo(this, 243, 344, textureX, textureY); // Left seat part
		bodyModel[193] = new ModelRendererTurbo(this, 256, 344, textureX, textureY); // Left seat part
		bodyModel[194] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[195] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[196] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[197] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[198] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[199] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[200] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[201] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[202] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[203] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[204] = new ModelRendererTurbo(this, 227, 266, textureX, textureY); // Right seat part
		bodyModel[205] = new ModelRendererTurbo(this, 214, 266, textureX, textureY); // Right seat part
		bodyModel[206] = new ModelRendererTurbo(this, 215, 344, textureX, textureY); // Left seat part
		bodyModel[207] = new ModelRendererTurbo(this, 228, 344, textureX, textureY); // Left seat part
		bodyModel[208] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[209] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[210] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[211] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[212] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[213] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[214] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[215] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[216] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[217] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[218] = new ModelRendererTurbo(this, 199, 266, textureX, textureY); // Right seat part
		bodyModel[219] = new ModelRendererTurbo(this, 186, 266, textureX, textureY); // Right seat part
		bodyModel[220] = new ModelRendererTurbo(this, 187, 344, textureX, textureY); // Left seat part
		bodyModel[221] = new ModelRendererTurbo(this, 200, 344, textureX, textureY); // Left seat part
		bodyModel[222] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[223] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[224] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[225] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[226] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[227] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[228] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[229] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[230] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[231] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[232] = new ModelRendererTurbo(this, 171, 266, textureX, textureY); // Right seat part
		bodyModel[233] = new ModelRendererTurbo(this, 158, 266, textureX, textureY); // Right seat part
		bodyModel[234] = new ModelRendererTurbo(this, 159, 344, textureX, textureY); // Left seat part
		bodyModel[235] = new ModelRendererTurbo(this, 172, 344, textureX, textureY); // Left seat part
		bodyModel[236] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[237] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[238] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[239] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[240] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[241] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[242] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[243] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[244] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[245] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[246] = new ModelRendererTurbo(this, 143, 266, textureX, textureY); // Right seat part
		bodyModel[247] = new ModelRendererTurbo(this, 130, 266, textureX, textureY); // Right seat part
		bodyModel[248] = new ModelRendererTurbo(this, 131, 344, textureX, textureY); // Left seat part test
		bodyModel[249] = new ModelRendererTurbo(this, 144, 344, textureX, textureY); // Left seat part test
		bodyModel[250] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[251] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[252] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[253] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[254] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[255] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[257] = new ModelRendererTurbo(this, 271, 344, textureX, textureY); // Left seat part
		bodyModel[258] = new ModelRendererTurbo(this, 284, 344, textureX, textureY); // Left seat part
		bodyModel[259] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[260] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[261] = new ModelRendererTurbo(this, 119, 311, textureX, textureY); // Box 128
		bodyModel[262] = new ModelRendererTurbo(this, 297, 3, textureX, textureY); // Box 128
		bodyModel[263] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 128
		bodyModel[264] = new ModelRendererTurbo(this, 230, 3, textureX, textureY); // Box 176
		bodyModel[265] = new ModelRendererTurbo(this, 135, 3, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 16, 196, textureX, textureY); // Box 128
		bodyModel[267] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 128
		bodyModel[268] = new ModelRendererTurbo(this, 22, 273, textureX, textureY); // Box 128
		bodyModel[269] = new ModelRendererTurbo(this, 3, 198, textureX, textureY); // Box 128
		bodyModel[270] = new ModelRendererTurbo(this, 69, 314, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 72, 319, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 71, 323, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 28, 229, textureX, textureY); // Box 340
		bodyModel[274] = new ModelRendererTurbo(this, 30, 233, textureX, textureY); // Box 41
		bodyModel[275] = new ModelRendererTurbo(this, 28, 253, textureX, textureY); // Box 340
		bodyModel[276] = new ModelRendererTurbo(this, 30, 257, textureX, textureY); // Box 41
		bodyModel[277] = new ModelRendererTurbo(this, 29, 241, textureX, textureY); // Box 340
		bodyModel[278] = new ModelRendererTurbo(this, 30, 245, textureX, textureY); // Box 41
		bodyModel[279] = new ModelRendererTurbo(this, 37, 253, textureX, textureY); // Box 340
		bodyModel[280] = new ModelRendererTurbo(this, 39, 257, textureX, textureY); // Box 41
		bodyModel[281] = new ModelRendererTurbo(this, 93, 357, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 96, 339, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 94, 373, textureX, textureY); // Boc 42
		bodyModel[284] = new ModelRendererTurbo(this, 95, 378, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[285] = new ModelRendererTurbo(this, 98, 344, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[286] = new ModelRendererTurbo(this, 41, 314, textureX, textureY); // Box 128
		bodyModel[287] = new ModelRendererTurbo(this, 30, 321, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 60, 327, textureX, textureY); // Box 340
		bodyModel[289] = new ModelRendererTurbo(this, 62, 331, textureX, textureY); // Box 41
		bodyModel[290] = new ModelRendererTurbo(this, 69, 327, textureX, textureY); // Box 340
		bodyModel[291] = new ModelRendererTurbo(this, 71, 331, textureX, textureY); // Box 41
		bodyModel[292] = new ModelRendererTurbo(this, 44, 249, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 46, 253, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 44, 261, textureX, textureY); // Right seat part
		bodyModel[295] = new ModelRendererTurbo(this, 78, 328, textureX, textureY); // Box 340
		bodyModel[296] = new ModelRendererTurbo(this, 79, 331, textureX, textureY); // Box 41
		bodyModel[297] = new ModelRendererTurbo(this, 37, 307, textureX, textureY); // Box 38
		bodyModel[298] = new ModelRendererTurbo(this, 52, 308, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 52, 314, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[300] = new ModelRendererTurbo(this, 58, 303, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 96, 303, textureX, textureY); // Box 402
		bodyModel[302] = new ModelRendererTurbo(this, 112, 303, textureX, textureY); // Box 402
		bodyModel[303] = new ModelRendererTurbo(this, 84, 323, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 86, 327, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 84, 335, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 103, 233, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[307] = new ModelRendererTurbo(this, 103, 239, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 93, 256, textureX, textureY); // Box 275
		bodyModel[309] = new ModelRendererTurbo(this, 93, 250, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[310] = new ModelRendererTurbo(this, 105, 246, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 95, 263, textureX, textureY); // Box 276
		bodyModel[312] = new ModelRendererTurbo(this, 94, 260, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[313] = new ModelRendererTurbo(this, 104, 243, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[314] = new ModelRendererTurbo(this, 72, 222, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 72, 215, textureX, textureY); // Box 128
		bodyModel[316] = new ModelRendererTurbo(this, 72, 219, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 72, 162, textureX, textureY); // Box 192
		bodyModel[318] = new ModelRendererTurbo(this, 72, 155, textureX, textureY); // Box 193
		bodyModel[319] = new ModelRendererTurbo(this, 72, 159, textureX, textureY); // Box 194
		bodyModel[320] = new ModelRendererTurbo(this, 20, 73, textureX, textureY); // Box 128
		bodyModel[321] = new ModelRendererTurbo(this, 23, 73, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Box 202
		bodyModel[323] = new ModelRendererTurbo(this, 25, 96, textureX, textureY); // Box 203
		bodyModel[324] = new ModelRendererTurbo(this, 335, 60, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 339, 42, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 332, 56, textureX, textureY); // Box 128
		bodyModel[327] = new ModelRendererTurbo(this, 330, 50, textureX, textureY); // Box 128
		bodyModel[328] = new ModelRendererTurbo(this, 322, 40, textureX, textureY); // Box 128
		bodyModel[329] = new ModelRendererTurbo(this, 303, 40, textureX, textureY); // Box 128
		bodyModel[330] = new ModelRendererTurbo(this, 299, 51, textureX, textureY); // Box 128
		bodyModel[331] = new ModelRendererTurbo(this, 298, 59, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 324, 59, textureX, textureY); // Box 128
		bodyModel[333] = new ModelRendererTurbo(this, 319, 52, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 311, 59, textureX, textureY); // Box 128
		bodyModel[335] = new ModelRendererTurbo(this, 310, 51, textureX, textureY); // Box 128
		bodyModel[336] = new ModelRendererTurbo(this, 335, 28, textureX, textureY); // Box 471
		bodyModel[337] = new ModelRendererTurbo(this, 334, 32, textureX, textureY); // Box 472
		bodyModel[338] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 473
		bodyModel[339] = new ModelRendererTurbo(this, 346, 50, textureX, textureY); // Box 128
		bodyModel[340] = new ModelRendererTurbo(this, 345, 56, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 299, 32, textureX, textureY); // Box 482
		bodyModel[342] = new ModelRendererTurbo(this, 298, 26, textureX, textureY); // Box 483
		bodyModel[343] = new ModelRendererTurbo(this, 324, 25, textureX, textureY); // Box 484
		bodyModel[344] = new ModelRendererTurbo(this, 319, 33, textureX, textureY); // Box 485
		bodyModel[345] = new ModelRendererTurbo(this, 311, 25, textureX, textureY); // Box 486
		bodyModel[346] = new ModelRendererTurbo(this, 310, 32, textureX, textureY); // Box 487
		bodyModel[347] = new ModelRendererTurbo(this, 346, 36, textureX, textureY); // Box 488
		bodyModel[348] = new ModelRendererTurbo(this, 345, 31, textureX, textureY); // Box 489
		bodyModel[349] = new ModelRendererTurbo(this, 353, 34, textureX, textureY); // Box 128
		bodyModel[350] = new ModelRendererTurbo(this, 362, 49, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 362, 46, textureX, textureY); // Box 494
		bodyModel[352] = new ModelRendererTurbo(this, 378, 37, textureX, textureY); // Box 128
		bodyModel[353] = new ModelRendererTurbo(this, 396, 45, textureX, textureY); // Box 128
		bodyModel[354] = new ModelRendererTurbo(this, 380, 45, textureX, textureY); // Box 498
		bodyModel[355] = new ModelRendererTurbo(this, 404, 40, textureX, textureY); // Box 128
		bodyModel[356] = new ModelRendererTurbo(this, 405, 48, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 405, 34, textureX, textureY); // Box 501
		bodyModel[358] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Box 128
		bodyModel[359] = new ModelRendererTurbo(this, 317, 281, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 299, 281, textureX, textureY); // Box 508
		bodyModel[361] = new ModelRendererTurbo(this, 49, 252, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 53, 234, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 50, 268, textureX, textureY); // Boc 42
		bodyModel[364] = new ModelRendererTurbo(this, 71, 257, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[365] = new ModelRendererTurbo(this, 69, 239, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[366] = new ModelRendererTurbo(this, 320, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[367] = new ModelRendererTurbo(this, 313, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[368] = new ModelRendererTurbo(this, 306, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[369] = new ModelRendererTurbo(this, 299, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[370] = new ModelRendererTurbo(this, 292, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[371] = new ModelRendererTurbo(this, 285, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[372] = new ModelRendererTurbo(this, 278, 356, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[373] = new ModelRendererTurbo(this, 232, 350, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 3, 216, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 6, 221, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 5, 225, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 118, 181, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 71, 183, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 118, 177, textureX, textureY); // Box 451
		bodyModel[380] = new ModelRendererTurbo(this, 71, 179, textureX, textureY); // Box 452
		bodyModel[381] = new ModelRendererTurbo(this, 321, 155, textureX, textureY); // Box 544
		bodyModel[382] = new ModelRendererTurbo(this, 369, 85, textureX, textureY,"lamp"); // Box 186 rearlight 2 glow
		bodyModel[383] = new ModelRendererTurbo(this, 357, 166, textureX, textureY); // Box 538
		bodyModel[384] = new ModelRendererTurbo(this, 418, 154, textureX, textureY); // Box 544
		bodyModel[385] = new ModelRendererTurbo(this, 407, 166, textureX, textureY); // Box 439
		bodyModel[386] = new ModelRendererTurbo(this, 385, 166, textureX, textureY); // Box 41
		bodyModel[387] = new ModelRendererTurbo(this, 382, 167, textureX, textureY); // Box 41
		bodyModel[388] = new ModelRendererTurbo(this, 404, 167, textureX, textureY); // Box 41
		bodyModel[389] = new ModelRendererTurbo(this, 396, 161, textureX, textureY); // Box 41
		bodyModel[390] = new ModelRendererTurbo(this, 393, 162, textureX, textureY); // Box 41
		bodyModel[391] = new ModelRendererTurbo(this, 415, 162, textureX, textureY); // Box 41
		bodyModel[392] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Box 41
		bodyModel[393] = new ModelRendererTurbo(this, 407, 157, textureX, textureY); // Box 41
		bodyModel[394] = new ModelRendererTurbo(this, 393, 157, textureX, textureY); // Box 41
		bodyModel[395] = new ModelRendererTurbo(this, 341, 166, textureX, textureY); // Box 283
		bodyModel[396] = new ModelRendererTurbo(this, 328, 166, textureX, textureY); // Box 41
		bodyModel[397] = new ModelRendererTurbo(this, 337, 167, textureX, textureY); // Box 41
		bodyModel[398] = new ModelRendererTurbo(this, 329, 167, textureX, textureY); // Box 41
		bodyModel[399] = new ModelRendererTurbo(this, 306, 160, textureX, textureY); // Box 544
		bodyModel[400] = new ModelRendererTurbo(this, 306, 166, textureX, textureY); // Box 41
		bodyModel[401] = new ModelRendererTurbo(this, 315, 167, textureX, textureY); // Box 41
		bodyModel[402] = new ModelRendererTurbo(this, 307, 167, textureX, textureY); // Box 41
		bodyModel[403] = new ModelRendererTurbo(this, 319, 166, textureX, textureY); // Box 283
		bodyModel[404] = new ModelRendererTurbo(this, 88, 138, textureX, textureY); // Box 41
		bodyModel[405] = new ModelRendererTurbo(this, 88, 148, textureX, textureY); // Box 2
		bodyModel[406] = new ModelRendererTurbo(this, 128, 16, textureX, textureY); // Box 128
		bodyModel[407] = new ModelRendererTurbo(this, 137, 16, textureX, textureY); // Box 128
		bodyModel[408] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 205
		bodyModel[409] = new ModelRendererTurbo(this, 242, 148, textureX, textureY); // Box 390
		bodyModel[410] = new ModelRendererTurbo(this, 250, 148, textureX, textureY); // Box 391
		bodyModel[411] = new ModelRendererTurbo(this, 244, 149, textureX, textureY); // Box 392
		bodyModel[412] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 393
		bodyModel[413] = new ModelRendererTurbo(this, 242, 138, textureX, textureY); // Box 472
		bodyModel[414] = new ModelRendererTurbo(this, 250, 138, textureX, textureY); // Box 473
		bodyModel[415] = new ModelRendererTurbo(this, 244, 139, textureX, textureY); // Box 474
		bodyModel[416] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 475
		bodyModel[417] = new ModelRendererTurbo(this, 322, 69, textureX, textureY); // Box 476
		bodyModel[418] = new ModelRendererTurbo(this, 133, 340, textureX, textureY); // Left seat part
		bodyModel[419] = new ModelRendererTurbo(this, 128, 340, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 132, 307, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 127, 307, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 145, 307, textureX, textureY); // Left seat part test
		bodyModel[423] = new ModelRendererTurbo(this, 146, 340, textureX, textureY); // Left seat part test
		bodyModel[424] = new ModelRendererTurbo(this, 132, 305, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 127, 304, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 132, 272, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 127, 272, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 145, 272, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 161, 340, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 156, 340, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 160, 307, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 155, 307, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 173, 307, textureX, textureY); // Left seat part test
		bodyModel[435] = new ModelRendererTurbo(this, 174, 340, textureX, textureY); // Left seat part test
		bodyModel[436] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 155, 304, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 160, 272, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 155, 272, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 173, 272, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 173, 305, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 189, 340, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 184, 340, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 188, 307, textureX, textureY); // Left seat part
		bodyModel[445] = new ModelRendererTurbo(this, 183, 307, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 201, 307, textureX, textureY); // Left seat part test
		bodyModel[447] = new ModelRendererTurbo(this, 202, 340, textureX, textureY); // Left seat part test
		bodyModel[448] = new ModelRendererTurbo(this, 188, 305, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 183, 304, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 188, 272, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 183, 272, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 201, 272, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 217, 340, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 212, 340, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 216, 307, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 211, 307, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 229, 307, textureX, textureY); // Left seat part test
		bodyModel[459] = new ModelRendererTurbo(this, 230, 340, textureX, textureY); // Left seat part test
		bodyModel[460] = new ModelRendererTurbo(this, 216, 305, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 211, 304, textureX, textureY); // Right seat part
		bodyModel[462] = new ModelRendererTurbo(this, 216, 272, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 211, 272, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 229, 272, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 229, 305, textureX, textureY); // Right seat part
		bodyModel[466] = new ModelRendererTurbo(this, 245, 340, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 240, 340, textureX, textureY); // Left seat part
		bodyModel[468] = new ModelRendererTurbo(this, 244, 307, textureX, textureY); // Left seat part
		bodyModel[469] = new ModelRendererTurbo(this, 239, 307, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 257, 307, textureX, textureY); // Left seat part test
		bodyModel[471] = new ModelRendererTurbo(this, 258, 340, textureX, textureY); // Left seat part test
		bodyModel[472] = new ModelRendererTurbo(this, 244, 305, textureX, textureY); // Right seat part
		bodyModel[473] = new ModelRendererTurbo(this, 239, 304, textureX, textureY); // Right seat part
		bodyModel[474] = new ModelRendererTurbo(this, 244, 272, textureX, textureY); // Right seat part
		bodyModel[475] = new ModelRendererTurbo(this, 239, 272, textureX, textureY); // Right seat part
		bodyModel[476] = new ModelRendererTurbo(this, 257, 272, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 273, 340, textureX, textureY); // Left seat part
		bodyModel[479] = new ModelRendererTurbo(this, 268, 340, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 272, 307, textureX, textureY); // Left seat part
		bodyModel[481] = new ModelRendererTurbo(this, 267, 307, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 285, 307, textureX, textureY); // Left seat part test
		bodyModel[483] = new ModelRendererTurbo(this, 286, 340, textureX, textureY); // Left seat part test
		bodyModel[484] = new ModelRendererTurbo(this, 272, 305, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 267, 304, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 272, 272, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 267, 272, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 285, 272, textureX, textureY); // Right seat part
		bodyModel[489] = new ModelRendererTurbo(this, 285, 305, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[491] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[492] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[493] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[494] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part test
		bodyModel[495] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part test
		bodyModel[496] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part test
		bodyModel[499] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part test

		bodyModel[0].addBox(0F, 0F, 0F, 104, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-52.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-57.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-56.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(55.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 3, 6, 0F); // Box 2
		bodyModel[4].setRotationPoint(52.5F, 3F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-59.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-57.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 105, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-52.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(40F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-42F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[10].setRotationPoint(-56.51F, 3F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[11].setRotationPoint(-52.49F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[12].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[13].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[13].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[14].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[14].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[15].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[16].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[16].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[17].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[17].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[18].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[19].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[19].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[20].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[20].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[21].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[22].setRotationPoint(-52.51F, 4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[23].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[24].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[24].setRotationPoint(-56.49F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[25].setRotationPoint(-56.51F, 3F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[26].setRotationPoint(-52.49F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[27].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[28].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[29].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[30].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[31].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[32].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[33].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[34].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[35].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[35].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[36].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[37].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[37].setRotationPoint(-52.51F, 4F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[38].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[39].setRotationPoint(-56.49F, 4F, 8F);

		bodyModel[40].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[40].setRotationPoint(-52.5F, 1F, -10.99F);

		bodyModel[41].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[41].setRotationPoint(-52.5F, 1F, 4.99F);

		bodyModel[42].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 38
		bodyModel[42].setRotationPoint(-52.5F, -15F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 104, 16, 1, 0F); // Box 128
		bodyModel[43].setRotationPoint(-52.5F, -15F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(-52.5F, -15F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[45].setRotationPoint(-52.5F, -15F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[46].setRotationPoint(-57.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[47].setRotationPoint(-57.5F, -15F, 3F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[48].setRotationPoint(-52.5F, -15F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[49].setRotationPoint(-57.5F, -15F, -3F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[50].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[51].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[52].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[52].setRotationPoint(-51.49F, -14F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(-57.5F, -20F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(-57.5F, -19F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[55].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 109, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[56].setRotationPoint(-57.5F, -19F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[57].setRotationPoint(-57.5F, -19F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 109, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[58].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[59].setRotationPoint(-57.5F, -16F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[60].setRotationPoint(-57.5F, -16F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[61].setRotationPoint(-57.5F, -7F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[62].setRotationPoint(-57.5F, -7F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-57.5F, -17F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-57.5F, -18F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[65].setRotationPoint(-57.5F, -18F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-57.5F, -16.25F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 109, 1, 14, 0F); // Box 128
		bodyModel[67].setRotationPoint(-57.5F, -18F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[68].setRotationPoint(-57.5F, 3F, 10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[69].setRotationPoint(-57.5F, 4F, 10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[70].setRotationPoint(-52.5F, 4F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[71].setRotationPoint(49.25F, 3F, 10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[72].setRotationPoint(50F, 4F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[73].setRotationPoint(50.5F, 3F, 10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[74].setRotationPoint(-50.25F, 3F, 10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[75].setRotationPoint(-52F, 4F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[76].setRotationPoint(30.75F, 3F, 10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[77].setRotationPoint(29F, 4F, 10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[78].setRotationPoint(-31.75F, 3F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[79].setRotationPoint(-31F, 4F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[80].setRotationPoint(-30.5F, 3F, 10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[81].setRotationPoint(-29.5F, 4F, 10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[82].setRotationPoint(-57.5F, 3F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[83].setRotationPoint(-57.5F, 4F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[84].setRotationPoint(-52.5F, 4F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[85].setRotationPoint(49.25F, 3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[86].setRotationPoint(50F, 4F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[87].setRotationPoint(50.5F, 3F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[88].setRotationPoint(-50.25F, 3F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[89].setRotationPoint(-52F, 4F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[90].setRotationPoint(30.75F, 3F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[91].setRotationPoint(29F, 4F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[92].setRotationPoint(-31.75F, 3F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[93].setRotationPoint(-31F, 4F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[94].setRotationPoint(-30.5F, 3F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 59, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[95].setRotationPoint(-29.5F, 4F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[96].setRotationPoint(-52.5F, 3F, 10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[97].setRotationPoint(-52.5F, 3F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[98].setRotationPoint(-52.5F, 3F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[99].setRotationPoint(-52.5F, 4F, -10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[100].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[101].setRotationPoint(-56.5F, 4F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[102].setRotationPoint(-52.5F, 3F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[103].setRotationPoint(-52.5F, 4F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[104].setRotationPoint(-56.5F, 3F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[105].setRotationPoint(-56.5F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(-59F, -15F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(-59F, 1F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(-59F, -14F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(-59F, -14F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(-59.5F, -14F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(-59.5F, -14F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(-59.5F, 1F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(-59.5F, -15F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 109, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[115].addBox(0F, 0F, 0F, 23, 2, 4, 0F); // Box 2
		bodyModel[115].setRotationPoint(5.5F, 4F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[116].setRotationPoint(5.5F, 6F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 283
		bodyModel[117].setRotationPoint(6.5F, 3F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[118].setRotationPoint(-7.5F, 4F, 0F);
		bodyModel[118].rotateAngleX = -0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[119].setRotationPoint(-7.51F, 4F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[120].setRotationPoint(-1.49F, 4F, -0.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 544
		bodyModel[121].setRotationPoint(8.5F, 3F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, 0.06F, 0.45F, 0F, 0.06F, 0.45F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[122].setRotationPoint(-46.5F, -18.15F, -10.69F);
		bodyModel[122].rotateAngleX = -0.41887902F;

		bodyModel[123].addBox(0F, 0F, 0F, 3, 2, 20, 0F); // Box 2
		bodyModel[123].setRotationPoint(51.5F, 1F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[124].setRotationPoint(51.5F, 1F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[125].setRotationPoint(51.5F, 1F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 2
		bodyModel[126].setRotationPoint(54.5F, 1F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[127].setRotationPoint(54.5F, 1F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 161
		bodyModel[128].setRotationPoint(54.5F, 1F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[129].setRotationPoint(56.5F, 1F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[130].setRotationPoint(56.5F, 1F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[131].setRotationPoint(56.5F, 1F, 3F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 38
		bodyModel[132].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 156
		bodyModel[133].setRotationPoint(51.5F, -15F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 38
		bodyModel[134].setRotationPoint(51.5F, -15F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 175
		bodyModel[135].setRotationPoint(51.5F, -15F, 10F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[136].setRotationPoint(56.5F, -15F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[137].setRotationPoint(55.5F, -15F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,-0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F, -0.55F, 0F, -0.15F, -0.45F, 0F, -3.15F, -1.15F, 0F, 2.7F, 0F, 0F, 0F); // Box 38
		bodyModel[138].setRotationPoint(53.95F, -15F, -10.15F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.55F); // Box 176
		bodyModel[139].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F, 0F, 0F, 0F, -1.15F, 0F, 2.7F, -0.45F, 0F, -3.15F, -0.55F, 0F, -0.15F); // Box 177
		bodyModel[140].setRotationPoint(53.95F, -15F, 9.15F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 31
		bodyModel[141].setRotationPoint(51.5F, 3F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F); // Box 31
		bodyModel[142].setRotationPoint(54.5F, 3F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[143].setRotationPoint(57F, 3F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[144].setRotationPoint(51.5F, 3F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 240
		bodyModel[145].setRotationPoint(54.5F, 3F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F); // Box 241
		bodyModel[146].setRotationPoint(57F, 3F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -1.4F, -0.55F, 0F, 0.85F, 0F, 0F, 0F); // Box 31 cull
		bodyModel[147].setRotationPoint(51.5F, 4F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1.4F, 0F, 2.3F, 0.25F, 0F, -0.6F, 0.3F, 0F, -0.4F, -1.4F, 0F, -3.3F, -1.8F, 0F, 2.6F, 0.55F, 0F, -0.15F); // Box 31
		bodyModel[148].setRotationPoint(54.5F, 4F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.9F, 0F, -0.3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, -0.6F, -1.9F, 0F, -0.3F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		bodyModel[149].setRotationPoint(57F, 4F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0.85F, -0.3F, 0F, -1.4F, 0F, 0F, -0.5F); // Box 245 cull
		bodyModel[150].setRotationPoint(51.5F, 4F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.25F, 0F, -0.6F, -1.4F, 0F, 2.3F, -1F, 0F, -3F, 0F, 0F, 0F, 0.55F, 0F, -0.15F, -1.8F, 0F, 2.6F, -1.4F, 0F, -3.3F, 0.3F, 0F, -0.4F); // Box 246
		bodyModel[151].setRotationPoint(54.5F, 4F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.9F, 0F, -0.3F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.9F, 0F, -0.3F, 1.3F, 0F, -0.6F); // Box 247
		bodyModel[152].setRotationPoint(57F, 4F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[153].setRotationPoint(48.5F, -2F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F); // Box 38
		bodyModel[154].setRotationPoint(57.51F, -4F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[155].setRotationPoint(55.65F, 6F, -7.1F);
		bodyModel[155].rotateAngleY = -0.28797933F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.02F, 0F, -0.3F, -0.5F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F); // Box 169
		bodyModel[156].setRotationPoint(56.05F, -17.65F, -0.35F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.02F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F); // Box 169
		bodyModel[157].setRotationPoint(56.05F, -17.65F, 0.35F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -1F, 0F, 0F, -1F, -0.3F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -1F, -0.3F, -0.4F, -1F); // Box 169
		bodyModel[158].setRotationPoint(56.55F, -17F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.35F, 0.15F, -0.65F, -0.35F, 0F, 0F, 0F, 0.02F, 0F, 0F, -0.5F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 555
		bodyModel[159].setRotationPoint(56.05F, -17.65F, -1.35F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.25F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.6F, 0F, 0F, -0.05F, 0F, 0F, -0.2F, -0.65F, -0.35F, -0.3F, -0.65F, -0.35F); // Box 169
		bodyModel[160].setRotationPoint(56.55F, -16.75F, 0.35F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.65F, -0.35F, -0.2F, -0.65F, -0.35F, -0.05F, 0F, 0F, -0.6F, 0F, 0F); // Box 557
		bodyModel[161].setRotationPoint(56.55F, -16.75F, -1.35F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.6F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F); // Box 169
		bodyModel[162].setRotationPoint(56.55F, -16.4F, -0.35F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[163].setRotationPoint(57.06F, -17.65F, -0.35F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.65F, -0.35F, -0.15F, -0.65F, -0.35F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F); // Box 555 rear light
		bodyModel[164].setRotationPoint(57.06F, -17.65F, 0.35F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.15F, -0.4F, 0F, 0.15F, -0.4F, 0F, 0.15F, -0.4F, -1F, -0.15F, -0.4F, -1F); // Box 555 rear light
		bodyModel[165].setRotationPoint(57.21F, -17F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,-0.15F, -0.65F, -0.35F, 0.15F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F); // Box 555 rear light
		bodyModel[166].setRotationPoint(57.06F, -17.65F, -1.35F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 555 rear light
		bodyModel[167].setRotationPoint(57.36F, -16.75F, 0.35F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 555 rear light
		bodyModel[168].setRotationPoint(57.36F, -16.75F, -1.35F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F); // Box 555 rear light
		bodyModel[169].setRotationPoint(57.36F, -16.4F, -0.35F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F); // marker light glow
		bodyModel[170].setRotationPoint(50.95F, -13.5F, -11.9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.45F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.85F, 0F, 0F, -0.45F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F); // marker light glow
		bodyModel[171].setRotationPoint(50.95F, -13.5F, 10.9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.65F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.65F); // Box 38
		bodyModel[172].setRotationPoint(52.05F, -13.75F, -12.15F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.65F, -0.43F, 0.25F, -0.85F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.65F, -0.43F, -0.25F, -0.85F); // Box 38
		bodyModel[173].setRotationPoint(51.05F, -13.75F, -12.15F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.65F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.65F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 280
		bodyModel[174].setRotationPoint(52.05F, -13.75F, 10.15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.43F, 0.25F, 0.15F, 0F, 0.25F, 0.35F, 0F, 0F, -1F, -1F, 0F, -1F, -0.43F, -0.25F, 0.15F, 0F, -0.25F, 0.35F, 0F, -0.75F, -1F, -1F, -0.75F, -1F); // Box 281
		bodyModel[175].setRotationPoint(51.05F, -13.75F, 11.15F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[176].setRotationPoint(-15.5F, -15F, -10F);

		bodyModel[177].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[177].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[178].setRotationPoint(46.5F, -8F, 7F);
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[179].setRotationPoint(45F, -1F, 5F);

		bodyModel[180].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[180].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[180].rotateAngleY = -3.14159265F;

		bodyModel[181].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[181].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[181].rotateAngleY = -3.14159265F;

		bodyModel[182].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[182].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[182].rotateAngleY = -3.14159265F;

		bodyModel[183].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[183].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[183].rotateAngleY = -3.14159265F;

		bodyModel[184].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[184].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[185].setRotationPoint(36.5F, -8F, 7F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[186].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[187].setRotationPoint(36.5F, -8F, -7F);
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[188].setRotationPoint(35F, -1F, 5F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[189].setRotationPoint(35F, -1F, -9F);

		bodyModel[190].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[190].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[190].rotateAngleY = -3.14159265F;

		bodyModel[191].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[191].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[191].rotateAngleY = -3.14159265F;

		bodyModel[192].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[192].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[192].rotateAngleY = -3.14159265F;

		bodyModel[193].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[193].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[193].rotateAngleY = -3.14159265F;

		bodyModel[194].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[194].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[194].rotateAngleY = -3.14159265F;

		bodyModel[195].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[195].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[195].rotateAngleY = -3.14159265F;

		bodyModel[196].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[196].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[197].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[198].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[199].setRotationPoint(26.5F, -8F, 7F);
		bodyModel[199].rotateAngleY = -3.14159265F;

		bodyModel[200].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[200].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[200].rotateAngleY = -3.14159265F;

		bodyModel[201].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[201].setRotationPoint(26.5F, -8F, -7F);
		bodyModel[201].rotateAngleY = -3.14159265F;

		bodyModel[202].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[202].setRotationPoint(25F, -1F, 5F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[203].setRotationPoint(25F, -1F, -9F);

		bodyModel[204].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[204].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[204].rotateAngleY = -3.14159265F;

		bodyModel[205].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[205].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[205].rotateAngleY = -3.14159265F;

		bodyModel[206].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[206].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[206].rotateAngleY = -3.14159265F;

		bodyModel[207].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[207].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[207].rotateAngleY = -3.14159265F;

		bodyModel[208].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[208].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[208].rotateAngleY = -3.14159265F;

		bodyModel[209].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[209].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[209].rotateAngleY = -3.14159265F;

		bodyModel[210].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[210].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[210].rotateAngleY = -3.14159265F;

		bodyModel[211].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[211].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[211].rotateAngleY = -3.14159265F;

		bodyModel[212].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[212].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[213].setRotationPoint(16.5F, -8F, 7F);
		bodyModel[213].rotateAngleY = -3.14159265F;

		bodyModel[214].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[214].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[214].rotateAngleY = -3.14159265F;

		bodyModel[215].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[215].setRotationPoint(16.5F, -8F, -7F);
		bodyModel[215].rotateAngleY = -3.14159265F;

		bodyModel[216].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[216].setRotationPoint(15F, -1F, 5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[217].setRotationPoint(15F, -1F, -9F);

		bodyModel[218].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[218].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[218].rotateAngleY = -3.14159265F;

		bodyModel[219].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[219].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[220].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[220].rotateAngleY = -3.14159265F;

		bodyModel[221].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[221].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[222].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[223].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[224].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[225].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[226].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[227].setRotationPoint(6.5F, -8F, 7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[228].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[229].setRotationPoint(6.5F, -8F, -7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[230].setRotationPoint(5F, -1F, 5F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[231].setRotationPoint(5F, -1F, -9F);

		bodyModel[232].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[232].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[233].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[234].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[235].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[236].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[237].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[238].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[239].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[240].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[241].setRotationPoint(-3.5F, -8F, 7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[242].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[243].setRotationPoint(-3.5F, -8F, -7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[244].setRotationPoint(-5F, -1F, 5F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[245].setRotationPoint(-5F, -1F, -9F);

		bodyModel[246].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[246].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[247].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part test
		bodyModel[248].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part test
		bodyModel[249].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[250].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[251].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[252].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[253].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[254].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(46.5F, -8F, -7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[256].setRotationPoint(45F, -1F, -9F);

		bodyModel[257].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[257].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part
		bodyModel[258].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[259].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[260].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[261].setRotationPoint(-14.5F, -7F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 37, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[262].setRotationPoint(-51.5F, -17F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[263].setRotationPoint(-51.5F, -18F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[264].setRotationPoint(-51.5F, -18F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 37, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[265].setRotationPoint(-51.5F, -16.25F, -10F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[266].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 128
		bodyModel[267].setRotationPoint(-51.5F, -15F, 4F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 128
		bodyModel[268].setRotationPoint(-32.5F, -15F, -10F);

		bodyModel[269].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 128
		bodyModel[269].setRotationPoint(-51.5F, -15F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[270].setRotationPoint(-50.36F, -2F, -10.28F);
		bodyModel[270].rotateAngleY = 0.78539816F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[271].setRotationPoint(-50.53F, -1F, -9.75F);
		bodyModel[271].rotateAngleY = 0.78539816F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[272].setRotationPoint(-49.83F, 0.5F, -9.75F);
		bodyModel[272].rotateAngleY = 0.78539816F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[273].setRotationPoint(-45.5F, -6F, 3F);

		bodyModel[274].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[274].setRotationPoint(-44.5F, -5F, 4F);
		bodyModel[274].rotateAngleY = -0.78539816F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[275].setRotationPoint(-45.5F, -6F, -10F);

		bodyModel[276].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[276].setRotationPoint(-44.5F, -5F, -9F);
		bodyModel[276].rotateAngleY = -0.78539816F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[277].setRotationPoint(-45.5F, -6F, -2F);

		bodyModel[278].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[278].setRotationPoint(-45F, -5F, -1F);
		bodyModel[278].rotateAngleY = -0.78539816F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[279].setRotationPoint(-43F, -6F, -10F);

		bodyModel[280].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[280].setRotationPoint(-42F, -5F, -9F);
		bodyModel[280].rotateAngleY = -0.78539816F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-37F, -3F, -9F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-34F, -6.5F, -9F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 2, 13, 0F); // Boc 42
		bodyModel[283].setRotationPoint(-36F, -1F, -9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[284].setRotationPoint(-36F, -5F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[285].setRotationPoint(-36F, -5F, 4F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[286].setRotationPoint(-27.5F, -15F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[287].setRotationPoint(-31.5F, -15F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[288].setRotationPoint(-26.5F, -6F, -10F);

		bodyModel[289].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[289].setRotationPoint(-25.5F, -5F, -9F);
		bodyModel[289].rotateAngleY = -0.78539816F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[290].setRotationPoint(-24F, -6F, -10F);

		bodyModel[291].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[291].setRotationPoint(-23F, -5F, -9F);
		bodyModel[291].rotateAngleY = -0.78539816F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[292].setRotationPoint(-39.5F, -5F, -3.5F);

		bodyModel[293].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[293].setRotationPoint(-38.5F, -5.5F, -2.5F);
		bodyModel[293].rotateAngleY = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[294].setRotationPoint(-39.5F, 0.5F, -3.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[295].setRotationPoint(-21.5F, -6F, -10F);

		bodyModel[296].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[296].setRotationPoint(-20.5F, -5F, -9.5F);
		bodyModel[296].rotateAngleY = -0.78539816F;

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 38
		bodyModel[297].setRotationPoint(-31.5F, -5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[298].setRotationPoint(-29.5F, -3F, 0.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[299].setRotationPoint(-29.5F, -2F, 0.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[300].setRotationPoint(-27.5F, -5F, 0.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[301].setRotationPoint(-18.5F, -15F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 402
		bodyModel[302].setRotationPoint(-18.5F, -15F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-22.5F, -5F, -3.5F);

		bodyModel[304].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[304].setRotationPoint(-21.5F, -5.5F, -2.5F);
		bodyModel[304].rotateAngleY = -0.78539816F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[305].setRotationPoint(-22.5F, 0.5F, -3.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 61, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[306].setRotationPoint(-9.5F, -14F, 7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 61, 0, 3, 0F,-0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[307].setRotationPoint(-9.5F, -13.01F, 7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 66, 0, 3, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 275
		bodyModel[308].setRotationPoint(-14.5F, -13.01F, -10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 66, 2, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 275 cull
		bodyModel[309].setRotationPoint(-14.5F, -14F, -10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[310].setRotationPoint(-9.5F, -13F, 9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[311].setRotationPoint(-14.5F, -13F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 66, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[312].setRotationPoint(-14.5F, -12.99F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 61, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[313].setRotationPoint(-9.5F, -12.99F, 7F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[314].setRotationPoint(-14.5F, -17F, -8.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 66, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[315].setRotationPoint(-14.5F, -16F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[316].setRotationPoint(-14.5F, -18F, -8.25F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 66, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[317].setRotationPoint(-14.5F, -17F, 5.25F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 66, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[318].setRotationPoint(-14.5F, -16F, 8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[319].setRotationPoint(-14.5F, -18F, 7.25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[320].setRotationPoint(-57F, -6F, -12F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[321].setRotationPoint(-52F, -6F, -12F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[322].setRotationPoint(-57F, -6F, 11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[323].setRotationPoint(-52F, -6F, 11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -1F, -0.55F, 1.25F, -0.15F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F); // Box 128
		bodyModel[324].setRotationPoint(51.5F, -16F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[325].setRotationPoint(56.5F, -16F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, -3F, -1.7F, 1.25F, 1.55F, 0.55F, 1.25F, -1.15F, 0F, 0F, 0F, -1F, 0F, -3F, -1.7F, 0F, 1.55F, 0.55F, 0F, -1.15F); // Box 128
		bodyModel[326].setRotationPoint(54.5F, -16F, -10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.7F, 1.25F, -0.55F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 1.25F, 0F, 0.7F, 0F, -0.55F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[327].setRotationPoint(56.5F, -16F, -7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[328].setRotationPoint(54.5F, -19F, -3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[329].setRotationPoint(51.5F, -20F, -3F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1F, 0F, -0.2F, -1F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[330].setRotationPoint(51.5F, -20F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1.75F, 0F, -0.55F, -1.75F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.55F, -0.25F, -0.85F, -2.2F, -0.25F, 0.35F, 0F, -0.25F, 0F); // Box 128
		bodyModel[331].setRotationPoint(51.5F, -19F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0.75F, 0F, -1.15F, -0.7F, -1.75F, 0.45F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0.75F, -0.25F, -1.15F, -0.7F, -0.25F, 0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[332].setRotationPoint(54.5F, -19F, -6F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -2F, -0.75F, -1F, -0.15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, -0.75F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[333].setRotationPoint(51.5F, -20F, -5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-1.65F, -1.75F, -0.5F, 0.5F, -1.75F, -3.2F, -1.55F, 0F, 1.8F, 0F, 0F, 0F, -1.65F, -0.25F, -0.5F, 0.5F, -0.25F, -3.2F, -1.55F, -0.25F, 1.8F, 0F, -0.25F, 0F); // Box 128
		bodyModel[334].setRotationPoint(52.3F, -19F, -9.65F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.8F, -1F, 0.65F, 1.25F, -1F, -1.15F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.25F, 0.65F, 1.25F, -0.25F, -1.15F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[335].setRotationPoint(51.5F, -20F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 1.25F, -1F, -0.55F, 1.25F, -0.15F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, -0.55F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 471
		bodyModel[336].setRotationPoint(51.5F, -16F, 9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0.55F, 1.25F, -1.15F, -1.7F, 1.25F, 1.55F, -1F, -1F, -3F, 0F, -1F, 0F, 0.55F, 0F, -1.15F, -1.7F, 0F, 1.55F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 472
		bodyModel[337].setRotationPoint(54.5F, -16F, 8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1.25F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0.7F, 1.25F, -0.55F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.7F, 0F, -0.55F); // Box 473
		bodyModel[338].setRotationPoint(56.5F, -16F, 3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.2F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.2F, -0.25F, -0.35F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[339].setRotationPoint(51.5F, -17F, -7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.55F, 0F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -0.85F, -2.2F, 0F, 0.35F, 0F, 0F, 0F); // Box 128
		bodyModel[340].setRotationPoint(51.5F, -17.25F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.2F, -1F, -0.35F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.35F, 0F, 0F, 0F); // Box 482
		bodyModel[341].setRotationPoint(51.5F, -20F, 3F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, -1.75F, -0.85F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -2.2F, -0.25F, 0.35F, -0.55F, -0.25F, -0.85F, 0F, -0.25F, 0F); // Box 483
		bodyModel[342].setRotationPoint(51.5F, -19F, 7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, -1.75F, 0.45F, 0.75F, 0F, -1.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0.45F, 0.75F, -0.25F, -1.15F); // Box 484
		bodyModel[343].setRotationPoint(54.5F, -19F, 3F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.15F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.15F, 0F, -0.25F, -2F); // Box 485
		bodyModel[344].setRotationPoint(51.5F, -20F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, -1.55F, 0F, 1.8F, 0.5F, -1.75F, -3.2F, -1.65F, -1.75F, -0.5F, 0F, -0.25F, 0F, -1.55F, -0.25F, 1.8F, 0.5F, -0.25F, -3.2F, -1.65F, -0.25F, -0.5F); // Box 486
		bodyModel[345].setRotationPoint(52.3F, -19F, 6.65F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, -1.15F, -0.8F, -1F, 0.65F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 1.25F, -0.25F, -1.15F, -0.8F, -0.25F, 0.65F); // Box 487
		bodyModel[346].setRotationPoint(51.5F, -20F, 3F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.2F, -0.25F, -0.35F, 0F, -0.25F, 0F); // Box 488
		bodyModel[347].setRotationPoint(51.5F, -17F, 3F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0.35F, -0.55F, 0F, -0.85F, 0F, 0F, 0F); // Box 489
		bodyModel[348].setRotationPoint(51.5F, -17.25F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0.3F, 0F, 0.25F, 0.3F); // Box 128
		bodyModel[349].setRotationPoint(51.5F, -16.25F, -9.15F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.55F, 0F, -0.85F, -0.55F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.25F, 0F, -0.55F, 0.25F, -0.85F, -0.55F, 0.25F, -0.15F, 0F, 0.25F, -0.15F); // Box 128
		bodyModel[350].setRotationPoint(51.5F, -16.25F, -10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.15F, -0.55F, 0F, -0.15F, -0.55F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0.25F, -0.15F, -0.55F, 0.25F, -0.15F, -0.55F, 0.25F, -0.85F, 0F, 0.25F, 0F); // Box 494
		bodyModel[351].setRotationPoint(51.5F, -16.25F, 9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, -0.1F, 0F, 0.25F, -0.1F); // Box 128
		bodyModel[352].setRotationPoint(53.95F, -16.25F, -6.45F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.15F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -0.15F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 128
		bodyModel[353].setRotationPoint(53.95F, -16.25F, -9.15F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.3F, -0.15F, 0F, -0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -0.15F, 0.25F, -0.3F, -2F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 498
		bodyModel[354].setRotationPoint(53.95F, -16.25F, 6.15F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[355].setRotationPoint(55.8F, -16.25F, -3F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.3F, 0.25F, -0.55F, 0F, 0.25F, -0.55F); // Box 128
		bodyModel[356].setRotationPoint(55.8F, -16.25F, -6.45F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.55F, -0.3F, 0F, -0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.55F, -0.3F, 0.25F, -0.55F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 501
		bodyModel[357].setRotationPoint(55.8F, -16.25F, 2.45F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[358].setRotationPoint(51.5F, -15F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[359].setRotationPoint(51.5F, -14.5F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 508
		bodyModel[360].setRotationPoint(51.5F, -14.5F, 3F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(-20F, -3F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-17F, -6.5F, -9F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 2, 13, 0F); // Boc 42
		bodyModel[363].setRotationPoint(-19F, -1F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[364].setRotationPoint(-19F, -5F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F); // Right seat part cull
		bodyModel[365].setRotationPoint(-19F, -5F, 4F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[366].setRotationPoint(53F, -15F, -0.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[367].setRotationPoint(39.5F, -16.5F, -0.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[368].setRotationPoint(29.5F, -16.5F, -0.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[369].setRotationPoint(19.5F, -16.5F, -0.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[370].setRotationPoint(9.5F, -16.5F, -0.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[371].setRotationPoint(-0.5F, -16.5F, -0.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[372].setRotationPoint(-10.5F, -16.5F, -0.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 66, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[373].setRotationPoint(-14.5F, -17F, -2F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[374].setRotationPoint(-30.36F, -2F, -10.28F);
		bodyModel[374].rotateAngleY = 0.78539816F;

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[375].setRotationPoint(-30.53F, -1F, -9.75F);
		bodyModel[375].rotateAngleY = 0.78539816F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[376].setRotationPoint(-29.83F, 0.5F, -9.75F);
		bodyModel[376].rotateAngleY = 0.78539816F;

		bodyModel[377].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[377].setRotationPoint(-23.5F, -13.5F, -11.01F);

		bodyModel[378].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[378].setRotationPoint(-49F, -2.5F, -11.01F);

		bodyModel[379].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[379].setRotationPoint(-23.5F, -13.5F, 11.01F);

		bodyModel[380].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[380].setRotationPoint(-49F, -2.5F, 11.01F);

		bodyModel[381].addBox(0F, 0F, 0F, 18, 5, 5, 0F); // Box 544
		bodyModel[381].setRotationPoint(-12.5F, 3F, 5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 rearlight 2 glow
		bodyModel[382].setRotationPoint(57.5F, -3F, -1F);

		bodyModel[383].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 538
		bodyModel[383].setRotationPoint(8.5F, 3F, -10F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 544
		bodyModel[384].setRotationPoint(25.5F, 3F, 2F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 3, 8, 0F); // Box 439
		bodyModel[385].setRotationPoint(25.5F, 3F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[386].setRotationPoint(17.5F, 2.75F, -4F);
		bodyModel[386].rotateAngleX = -0.78539816F;

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[387].setRotationPoint(17.49F, 3F, -4.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[388].setRotationPoint(24.51F, 3F, -4.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[389].setRotationPoint(17.5F, 2.75F, 4F);
		bodyModel[389].rotateAngleX = -0.78539816F;

		bodyModel[390].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[390].setRotationPoint(17.49F, 3F, 3.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[391].setRotationPoint(24.51F, 3F, 3.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[392].setRotationPoint(22F, 2.75F, 7.5F);
		bodyModel[392].rotateAngleX = -0.78539816F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[393].setRotationPoint(21.99F, 3F, 7F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[394].setRotationPoint(25.01F, 3F, 7F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 283
		bodyModel[395].setRotationPoint(2.5F, 3F, -9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[396].setRotationPoint(-0.5F, 2.75F, -8F);
		bodyModel[396].rotateAngleZ = -0.78539816F;

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[397].setRotationPoint(-1F, 3F, -8.01F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[398].setRotationPoint(-1F, 3F, -3.99F);

		bodyModel[399].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 544
		bodyModel[399].setRotationPoint(-22.5F, 3F, 8F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[400].setRotationPoint(-18.5F, 2.75F, -7F);
		bodyModel[400].rotateAngleZ = -0.78539816F;

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[401].setRotationPoint(-19F, 3F, -7.01F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[402].setRotationPoint(-19F, 3F, -2.99F);

		bodyModel[403].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 283
		bodyModel[403].setRotationPoint(-7.5F, 3F, -9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[404].setRotationPoint(-51.5F, 3F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[405].setRotationPoint(-51.5F, 3F, 10.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.06F, 0.45F, 0F, 0.06F, 0.45F, 0F, 0.09F, -0.75F, 0F, 0.09F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[406].setRotationPoint(-46.5F, -17.75F, 9.77F);
		bodyModel[406].rotateAngleX = 0.41887902F;

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.09F, 0.15F, 0F, -0.09F, 0.15F, 0F, -0.41F, -0.85F, 0F, -0.41F, -0.85F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.65F, 0F, -0.54F, -0.65F); // Box 128
		bodyModel[407].setRotationPoint(-46.5F, -17.5F, 9.89F);
		bodyModel[407].rotateAngleX = 0.41887902F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.41F, -0.85F, 0F, -0.41F, -0.85F, 0F, -0.09F, 0.15F, 0F, -0.09F, 0.15F, 0F, -0.54F, -0.65F, 0F, -0.54F, -0.65F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[408].setRotationPoint(-46.5F, -17.91F, -10.79F);
		bodyModel[408].rotateAngleX = -0.41887902F;

		bodyModel[409].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[409].setRotationPoint(48.5F, 3F, 11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[410].setRotationPoint(50.5F, 3F, 11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 392
		bodyModel[411].setRotationPoint(48.5F, 4.5F, 11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 393
		bodyModel[412].setRotationPoint(48.5F, 6F, 11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[413].setRotationPoint(48.5F, 3F, -12F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[414].setRotationPoint(50.5F, 3F, -12F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 474
		bodyModel[415].setRotationPoint(48.5F, 4.5F, -12F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 475
		bodyModel[416].setRotationPoint(48.5F, 6F, -12F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[417].setRotationPoint(48.5F, -2F, 11F);

		bodyModel[418].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[418].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[419].setRotationPoint(-3.5F, -4.5F, -7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[420].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[421].setRotationPoint(-3.5F, -4.5F, -7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[422].setRotationPoint(-3.5F, -4.1F, -7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[423].setRotationPoint(-3.5F, -4.1F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[424].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[425].setRotationPoint(-3.5F, -4.5F, 7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[426].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[427].setRotationPoint(-3.5F, -4.5F, 7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(-3.5F, -4.1F, 7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(-3.5F, -4.1F, 7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[431].setRotationPoint(6.5F, -4.5F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[433].setRotationPoint(6.5F, -4.5F, -7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[434].setRotationPoint(6.5F, -4.1F, -7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[435].setRotationPoint(6.5F, -4.1F, -7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[437].setRotationPoint(6.5F, -4.5F, 7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[438].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[439].setRotationPoint(6.5F, -4.5F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[440].setRotationPoint(6.5F, -4.1F, 7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[441].setRotationPoint(6.5F, -4.1F, 7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[443].setRotationPoint(16.5F, -4.5F, -7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[444].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[445].setRotationPoint(16.5F, -4.5F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[446].setRotationPoint(16.5F, -4.1F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[447].setRotationPoint(16.5F, -4.1F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[449].setRotationPoint(16.5F, -4.5F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[450].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[451].setRotationPoint(16.5F, -4.5F, 7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(16.5F, -4.1F, 7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[453].setRotationPoint(16.5F, -4.1F, 7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[455].setRotationPoint(26.5F, -4.5F, -7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[457].setRotationPoint(26.5F, -4.5F, -7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[458].setRotationPoint(26.5F, -4.1F, -7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[459].setRotationPoint(26.5F, -4.1F, -7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[460].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[461].setRotationPoint(26.5F, -4.5F, 7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[463].setRotationPoint(26.5F, -4.5F, 7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(26.5F, -4.1F, 7F);
		bodyModel[464].rotateAngleY = -3.14159265F;

		bodyModel[465].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[465].setRotationPoint(26.5F, -4.1F, 7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[466].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[467].setRotationPoint(36.5F, -4.5F, -7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[468].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[469].setRotationPoint(36.5F, -4.5F, -7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[470].setRotationPoint(36.5F, -4.1F, -7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[471].setRotationPoint(36.5F, -4.1F, -7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[472].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[473].setRotationPoint(36.5F, -4.5F, 7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[474].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[474].rotateAngleY = -3.14159265F;

		bodyModel[475].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[475].setRotationPoint(36.5F, -4.5F, 7F);
		bodyModel[475].rotateAngleY = -3.14159265F;

		bodyModel[476].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(36.5F, -4.1F, 7F);
		bodyModel[476].rotateAngleY = -3.14159265F;

		bodyModel[477].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[477].setRotationPoint(36.5F, -4.1F, 7F);
		bodyModel[477].rotateAngleY = -3.14159265F;

		bodyModel[478].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[478].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[478].rotateAngleY = -3.14159265F;

		bodyModel[479].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[479].setRotationPoint(46.5F, -4.5F, -7F);
		bodyModel[479].rotateAngleY = -3.14159265F;

		bodyModel[480].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Left seat part
		bodyModel[480].setRotationPoint(46.5F, -5F, -7F);
		bodyModel[480].rotateAngleY = -3.14159265F;

		bodyModel[481].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Left seat part
		bodyModel[481].setRotationPoint(46.5F, -4.5F, -7F);
		bodyModel[481].rotateAngleY = -3.14159265F;

		bodyModel[482].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[482].setRotationPoint(46.5F, -4.1F, -7F);
		bodyModel[482].rotateAngleY = -3.14159265F;

		bodyModel[483].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Left seat part test
		bodyModel[483].setRotationPoint(46.5F, -4.1F, -7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[484].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[485].setRotationPoint(46.5F, -4.5F, 7F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[486].setRotationPoint(46.5F, -5F, 7F);
		bodyModel[486].rotateAngleY = -3.14159265F;

		bodyModel[487].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[487].setRotationPoint(46.5F, -4.5F, 7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[488].setRotationPoint(46.5F, -4.1F, 7F);
		bodyModel[488].rotateAngleY = -3.14159265F;

		bodyModel[489].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[489].setRotationPoint(46.5F, -4.1F, 7F);
		bodyModel[489].rotateAngleY = -3.14159265F;

		bodyModel[490].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[490].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[491].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[491].rotateAngleY = -3.14159265F;

		bodyModel[492].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[492].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[493].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[494].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[495].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[496].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[498].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[499].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part test
		bodyModel[503] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part test
		bodyModel[504] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part test
		bodyModel[507] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part test
		bodyModel[508] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[509] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[510] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part test
		bodyModel[511] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part test
		bodyModel[512] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[513] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[514] = new ModelRendererTurbo(this, 71, 69, textureX, textureY); // Left side door
		bodyModel[515] = new ModelRendererTurbo(this, 71, 90, textureX, textureY); // Right side door
		bodyModel[516] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 38
		bodyModel[517] = new ModelRendererTurbo(this, 123, 1, textureX, textureY); // Box 190
		bodyModel[518] = new ModelRendererTurbo(this, 146, 1, textureX, textureY); // Box 190
		bodyModel[519] = new ModelRendererTurbo(this, 43, 146, textureX, textureY); // Box 2
		bodyModel[520] = new ModelRendererTurbo(this, 72, 151, textureX, textureY); // Box 2
		bodyModel[521] = new ModelRendererTurbo(this, 52, 144, textureX, textureY); // Box 191
		bodyModel[522] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 192
		bodyModel[523] = new ModelRendererTurbo(this, 21, 152, textureX, textureY); // Box 2
		bodyModel[524] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 2
		bodyModel[525] = new ModelRendererTurbo(this, 25, 158, textureX, textureY); // Box 2
		bodyModel[526] = new ModelRendererTurbo(this, 25, 141, textureX, textureY); // Box 193
		bodyModel[527] = new ModelRendererTurbo(this, 33, 152, textureX, textureY); // Box 194
		bodyModel[528] = new ModelRendererTurbo(this, 29, 147, textureX, textureY); // Box 195
		bodyModel[529] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 153
		bodyModel[531] = new ModelRendererTurbo(this, 318, 303, textureX, textureY); // Box 38
		bodyModel[532] = new ModelRendererTurbo(this, 317, 317, textureX, textureY); // Box 38
		bodyModel[533] = new ModelRendererTurbo(this, 318, 300, textureX, textureY); // Box 435
		bodyModel[534] = new ModelRendererTurbo(this, 299, 301, textureX, textureY); // Box 38
		bodyModel[535] = new ModelRendererTurbo(this, 316, 326, textureX, textureY); // Box 38
		bodyModel[536] = new ModelRendererTurbo(this, 308, 325, textureX, textureY); // Box 38
		bodyModel[537] = new ModelRendererTurbo(this, 308, 320, textureX, textureY); // Box 38
		bodyModel[538] = new ModelRendererTurbo(this, 299, 320, textureX, textureY); // Box 38
		bodyModel[539] = new ModelRendererTurbo(this, 301, 325, textureX, textureY); // Box 38
		bodyModel[540] = new ModelRendererTurbo(this, 301, 317, textureX, textureY); // Box 38
		bodyModel[541] = new ModelRendererTurbo(this, 317, 295, textureX, textureY); // Box 443
		bodyModel[542] = new ModelRendererTurbo(this, 308, 292, textureX, textureY); // Box 444
		bodyModel[543] = new ModelRendererTurbo(this, 308, 296, textureX, textureY); // Box 445
		bodyModel[544] = new ModelRendererTurbo(this, 299, 296, textureX, textureY); // Box 446
		bodyModel[545] = new ModelRendererTurbo(this, 301, 293, textureX, textureY); // Box 447
		bodyModel[546] = new ModelRendererTurbo(this, 301, 301, textureX, textureY); // Box 448
		bodyModel[547] = new ModelRendererTurbo(this, 327, 297, textureX, textureY, "cull"); // Box 275 cull
		bodyModel[548] = new ModelRendererTurbo(this, 327, 301, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[549] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Box 41
		bodyModel[550] = new ModelRendererTurbo(this, 35, 186, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 55, 284, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 79, 284, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 68, 284, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 66, 287, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 128, 324, textureX, textureY); // Left seat part test
		bodyModel[556] = new ModelRendererTurbo(this, 128, 289, textureX, textureY); // Right seat part
		bodyModel[557] = new ModelRendererTurbo(this, 156, 324, textureX, textureY); // Left seat part test
		bodyModel[558] = new ModelRendererTurbo(this, 156, 289, textureX, textureY); // Right seat part
		bodyModel[559] = new ModelRendererTurbo(this, 184, 324, textureX, textureY); // Left seat part test
		bodyModel[560] = new ModelRendererTurbo(this, 184, 289, textureX, textureY); // Right seat part
		bodyModel[561] = new ModelRendererTurbo(this, 212, 324, textureX, textureY); // Left seat part test
		bodyModel[562] = new ModelRendererTurbo(this, 240, 289, textureX, textureY); // Right seat part
		bodyModel[563] = new ModelRendererTurbo(this, 240, 324, textureX, textureY); // Left seat part test
		bodyModel[564] = new ModelRendererTurbo(this, 212, 289, textureX, textureY); // Right seat part
		bodyModel[565] = new ModelRendererTurbo(this, 268, 324, textureX, textureY); // Left seat part test
		bodyModel[566] = new ModelRendererTurbo(this, 268, 289, textureX, textureY); // Right seat part

		bodyModel[500].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[500].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[502].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[503].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[505].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[506].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[507].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[508].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[509].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[510].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[511].setRotationPoint(46.5F, -3F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[512].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[513].setRotationPoint(46.5F, -3F, 7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addShapeBox(-5F, 0F, -1F, 5, 15, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Left side door
		bodyModel[514].setRotationPoint(-52.49F, -14F, -10.5F);

		bodyModel[515].addShapeBox(-5F, 0F, 0F, 5, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Right side door
		bodyModel[515].setRotationPoint(-52.49F, -14F, 10.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[516].setRotationPoint(57.51F, -15F, -0.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.35F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F); // Box 190
		bodyModel[517].setRotationPoint(-49F, -18F, -10.56F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.35F, 0.25F, 0F, -0.35F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F); // Box 190
		bodyModel[518].setRotationPoint(-31F, -18F, -10.56F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[519].setRotationPoint(-57.5F, 3F, -10.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[520].setRotationPoint(-57.5F, 4F, -10.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[521].setRotationPoint(-57.5F, 3F, 4.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[522].setRotationPoint(-57.5F, 4F, 9.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[523].setRotationPoint(-57.5F, 4F, -10F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[524].setRotationPoint(-57.5F, 5F, -10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.06F, -0.4F, 0F, 0.06F, -0.4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.06F, -0.4F, 0F, -1.06F, -0.4F); // Box 2
		bodyModel[525].setRotationPoint(-57.5F, 5.5F, -10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 193
		bodyModel[526].setRotationPoint(-57.5F, 4F, 1.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		bodyModel[527].setRotationPoint(-57.5F, 5F, 5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.06F, -0.4F, -0.5F, 0.06F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.06F, -0.4F, -0.5F, -1.06F, -0.4F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[528].setRotationPoint(-57.5F, 5.5F, 9F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[529].setRotationPoint(-59.5F, -16F, -5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[530].setRotationPoint(-59.5F, -16F, 0F);

		bodyModel[531].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[531].setRotationPoint(55.5F, -5F, -3F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[532].setRotationPoint(55.5F, -5F, -4F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[533].setRotationPoint(55.5F, -5F, 3F);

		bodyModel[534].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 38
		bodyModel[534].setRotationPoint(54.5F, -5F, -4F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[535].setRotationPoint(55.5F, -5F, -6.45F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[536].setRotationPoint(54.5F, -5F, -8.45F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 38
		bodyModel[537].setRotationPoint(54.5F, -5F, -6.45F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 38
		bodyModel[538].setRotationPoint(54F, -5F, -7.35F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[539].setRotationPoint(54F, -5F, -8.35F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[540].setRotationPoint(54F, -5F, -5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[541].setRotationPoint(55.5F, -5F, 3.45F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 444
		bodyModel[542].setRotationPoint(54.5F, -5F, 6.45F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[543].setRotationPoint(54.5F, -5F, 3.45F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[544].setRotationPoint(54F, -5F, 4.35F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
		bodyModel[545].setRotationPoint(54F, -5F, 7.35F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[546].setRotationPoint(54F, -5F, 4F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.375F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.375F, 0.125F, -0.5F, -0.375F); // Box 275 cull
		bodyModel[547].setRotationPoint(54.75F, -7.25F, -0.75F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.385F, -0.01F, -0.385F, -0.885F, -0.01F, -0.385F, -0.885F, -0.01F, -0.885F, -0.385F, -0.01F, -0.885F, -0.13F, -0.75F, -0.13F, -0.63F, -0.75F, -0.13F, -0.63F, -0.75F, -0.63F, -0.13F, -0.75F, -0.63F); // Box 275 glow
		bodyModel[548].setRotationPoint(54.75F, -7.25F, -0.75F);

		bodyModel[549].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 41
		bodyModel[549].setRotationPoint(55.5F, -7F, 0F);
		bodyModel[549].rotateAngleY = -0.78539816F;

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[550].setRotationPoint(-47.5F, -15F, -3F);

		bodyModel[551].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[551].setRotationPoint(-45.5F, -15F, 5F);

		bodyModel[552].addBox(0F, 0F, 0F, 23, 16, 1, 0F); // Box 128
		bodyModel[552].setRotationPoint(-38.5F, -15F, 5F);

		bodyModel[553].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[553].setRotationPoint(-41.5F, -15F, 5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[554].setRotationPoint(-41.5F, -14F, 5.5F);

		bodyModel[555].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[555].setRotationPoint(-3.5F, -1F, -7F);
		bodyModel[555].rotateAngleY = -3.14159265F;

		bodyModel[556].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[556].setRotationPoint(-3.5F, -1F, 7F);
		bodyModel[556].rotateAngleY = -3.14159265F;

		bodyModel[557].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[557].setRotationPoint(6.5F, -1F, -7F);
		bodyModel[557].rotateAngleY = -3.14159265F;

		bodyModel[558].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[558].setRotationPoint(6.5F, -1F, 7F);
		bodyModel[558].rotateAngleY = -3.14159265F;

		bodyModel[559].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[559].setRotationPoint(16.5F, -1F, -7F);
		bodyModel[559].rotateAngleY = -3.14159265F;

		bodyModel[560].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[560].setRotationPoint(16.5F, -1F, 7F);
		bodyModel[560].rotateAngleY = -3.14159265F;

		bodyModel[561].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[561].setRotationPoint(26.5F, -1F, -7F);
		bodyModel[561].rotateAngleY = -3.14159265F;

		bodyModel[562].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[562].setRotationPoint(26.5F, -1F, 7F);
		bodyModel[562].rotateAngleY = -3.14159265F;

		bodyModel[563].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[563].setRotationPoint(36.5F, -1F, -7F);
		bodyModel[563].rotateAngleY = -3.14159265F;

		bodyModel[564].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[564].setRotationPoint(36.5F, -1F, 7F);
		bodyModel[564].rotateAngleY = -3.14159265F;

		bodyModel[565].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Left seat part test
		bodyModel[565].setRotationPoint(46.5F, -1F, -7F);
		bodyModel[565].rotateAngleY = -3.14159265F;

		bodyModel[566].addBox(2.5F, 0F, -2F, 1, 2, 4, 0F); // Right seat part
		bodyModel[566].setRotationPoint(46.5F, -1F, 7F);
		bodyModel[566].rotateAngleY = -3.14159265F;
	}
	ModelPS_Truck_41GT bogie1 = new ModelPS_Truck_41GT();
	ModelPS_Truck_41TRV11 bogie2 = new ModelPS_Truck_41TRV11();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 567; i++)
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
		if(GetColor(entity)==122345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-R-C-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if(GetColor(entity)==123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-TR_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.57, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.14, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}