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

public class ModelPS52SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS52SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[525];

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
		bodyModel[3] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 257, 138, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 261, 148, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 139, 174, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 94, 173, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 72, 158, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[48] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[54] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[55] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[56] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[57] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[58] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[59] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[60] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[62] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[63] = new ModelRendererTurbo(this, 165, 159, textureX, textureY); // Box 38
		bodyModel[64] = new ModelRendererTurbo(this, 179, 158, textureX, textureY); // Box 38
		bodyModel[65] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 38
		bodyModel[66] = new ModelRendererTurbo(this, 165, 155, textureX, textureY); // Box 38
		bodyModel[67] = new ModelRendererTurbo(this, 183, 161, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 188, 169, textureX, textureY); // Box 41
		bodyModel[69] = new ModelRendererTurbo(this, 192, 160, textureX, textureY); // Box 41
		bodyModel[70] = new ModelRendererTurbo(this, 184, 160, textureX, textureY); // Box 41
		bodyModel[71] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 41
		bodyModel[72] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 41
		bodyModel[73] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[74] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[75] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[76] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[77] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[78] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[79] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[80] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[81] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[82] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[83] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[84] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[85] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[86] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[87] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[88] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[89] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[90] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[91] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[92] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[93] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[94] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[95] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[96] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[97] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[98] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[99] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[100] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[101] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[102] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[103] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[104] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[105] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[106] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[107] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[108] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[109] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[110] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[117] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[125] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[126] = new ModelRendererTurbo(this, 431, 18, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 437, 35, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 409, 2, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 430, 2, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 416, 1, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 423, 1, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[136] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[146] = new ModelRendererTurbo(this, 320, 17, textureX, textureY); // Box 128
		bodyModel[147] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 323, 59, textureX, textureY); // Box 190
		bodyModel[149] = new ModelRendererTurbo(this, 325, 55, textureX, textureY); // Box 191
		bodyModel[150] = new ModelRendererTurbo(this, 62, 59, textureX, textureY); // Box 190
		bodyModel[151] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 191
		bodyModel[152] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 190
		bodyModel[153] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[155] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[158] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[159] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[160] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[161] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 197, 361, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 178, 361, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 246, 361, textureX, textureY); // Box 38
		bodyModel[165] = new ModelRendererTurbo(this, 139, 361, textureX, textureY); // Box 38
		bodyModel[166] = new ModelRendererTurbo(this, 186, 361, textureX, textureY); // Box 38
		bodyModel[167] = new ModelRendererTurbo(this, 186, 374, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 169, 370, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 222, 370, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 173, 360, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 222, 360, textureX, textureY); // Box 38
		bodyModel[172] = new ModelRendererTurbo(this, 187, 363, textureX, textureY); // Box 38
		bodyModel[173] = new ModelRendererTurbo(this, 193, 346, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 208, 353, textureX, textureY); // Box 38
		bodyModel[175] = new ModelRendererTurbo(this, 145, 353, textureX, textureY); // Box 221
		bodyModel[176] = new ModelRendererTurbo(this, 138, 356, textureX, textureY); // Box 222
		bodyModel[177] = new ModelRendererTurbo(this, 240, 353, textureX, textureY); // Box 221
		bodyModel[178] = new ModelRendererTurbo(this, 253, 356, textureX, textureY); // Box 222
		bodyModel[179] = new ModelRendererTurbo(this, 104, 325, textureX, textureY); // Box 38
		bodyModel[180] = new ModelRendererTurbo(this, 85, 324, textureX, textureY); // Box 38
		bodyModel[181] = new ModelRendererTurbo(this, 88, 243, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 71, 243, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 6, 354, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 34, 349, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 25, 354, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 52, 328, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 43, 327, textureX, textureY); // Box 38
		bodyModel[188] = new ModelRendererTurbo(this, 63, 327, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 96, 354, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 72, 328, textureX, textureY); // Box 38
		bodyModel[191] = new ModelRendererTurbo(this, 18, 354, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 280, 243, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 192, 325, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 280, 350, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 297, 243, textureX, textureY); // Box 38
		bodyModel[196] = new ModelRendererTurbo(this, 311, 322, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 315, 354, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 340, 322, textureX, textureY); // Box 38
		bodyModel[199] = new ModelRendererTurbo(this, 362, 328, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 328, 325, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 281, 328, textureX, textureY); // Box 269
		bodyModel[202] = new ModelRendererTurbo(this, 293, 322, textureX, textureY); // Box 270
		bodyModel[203] = new ModelRendererTurbo(this, 378, 358, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 393, 358, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 105, 262, textureX, textureY); // Box 275
		bodyModel[206] = new ModelRendererTurbo(this, 107, 337, textureX, textureY); // Box 276
		bodyModel[207] = new ModelRendererTurbo(this, 193, 250, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 195, 343, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 193, 262, textureX, textureY); // Box 275
		bodyModel[210] = new ModelRendererTurbo(this, 195, 337, textureX, textureY); // Box 276
		bodyModel[211] = new ModelRendererTurbo(this, 195, 331, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[212] = new ModelRendererTurbo(this, 107, 331, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[213] = new ModelRendererTurbo(this, 288, 328, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 310, 354, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 326, 354, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 357, 328, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 72, 347, textureX, textureY); // Box 274
		bodyModel[218] = new ModelRendererTurbo(this, 91, 354, textureX, textureY); // Box 275
		bodyModel[219] = new ModelRendererTurbo(this, 19, 321, textureX, textureY); // Box 274
		bodyModel[220] = new ModelRendererTurbo(this, 38, 328, textureX, textureY); // Box 38
		bodyModel[221] = new ModelRendererTurbo(this, 13, 354, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 119, 274, textureX, textureY); // Seat part
		bodyModel[223] = new ModelRendererTurbo(this, 119, 284, textureX, textureY); // Seat part
		bodyModel[224] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Seat part
		bodyModel[225] = new ModelRendererTurbo(this, 99, 277, textureX, textureY); // Seat part
		bodyModel[226] = new ModelRendererTurbo(this, 99, 267, textureX, textureY); // Seat part
		bodyModel[227] = new ModelRendererTurbo(this, 110, 287, textureX, textureY); // Seat part
		bodyModel[228] = new ModelRendererTurbo(this, 110, 284, textureX, textureY); // Seat part
		bodyModel[229] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Seat part
		bodyModel[230] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Seat part
		bodyModel[231] = new ModelRendererTurbo(this, 119, 312, textureX, textureY); // Seat part
		bodyModel[232] = new ModelRendererTurbo(this, 119, 302, textureX, textureY); // Seat part
		bodyModel[233] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Seat part
		bodyModel[234] = new ModelRendererTurbo(this, 99, 295, textureX, textureY); // Seat part
		bodyModel[235] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Seat part
		bodyModel[236] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Seat part
		bodyModel[237] = new ModelRendererTurbo(this, 110, 315, textureX, textureY); // Seat part
		bodyModel[238] = new ModelRendererTurbo(this, 110, 312, textureX, textureY); // Seat part
		bodyModel[239] = new ModelRendererTurbo(this, 150, 274, textureX, textureY); // Seat part
		bodyModel[240] = new ModelRendererTurbo(this, 150, 284, textureX, textureY); // Seat part
		bodyModel[241] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Seat part
		bodyModel[242] = new ModelRendererTurbo(this, 130, 267, textureX, textureY); // Seat part
		bodyModel[243] = new ModelRendererTurbo(this, 141, 287, textureX, textureY); // Seat part
		bodyModel[244] = new ModelRendererTurbo(this, 141, 284, textureX, textureY); // Seat part
		bodyModel[245] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Seat part
		bodyModel[246] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Seat part
		bodyModel[247] = new ModelRendererTurbo(this, 150, 312, textureX, textureY); // Seat part
		bodyModel[248] = new ModelRendererTurbo(this, 150, 302, textureX, textureY); // Seat part
		bodyModel[249] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Seat part
		bodyModel[250] = new ModelRendererTurbo(this, 130, 295, textureX, textureY); // Seat part
		bodyModel[251] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Seat part
		bodyModel[252] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Seat part
		bodyModel[253] = new ModelRendererTurbo(this, 141, 315, textureX, textureY); // Seat part
		bodyModel[254] = new ModelRendererTurbo(this, 141, 312, textureX, textureY); // Seat part
		bodyModel[255] = new ModelRendererTurbo(this, 181, 274, textureX, textureY); // Seat part
		bodyModel[256] = new ModelRendererTurbo(this, 181, 284, textureX, textureY); // Seat part
		bodyModel[257] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Seat part
		bodyModel[258] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Seat part
		bodyModel[259] = new ModelRendererTurbo(this, 172, 287, textureX, textureY); // Seat part
		bodyModel[260] = new ModelRendererTurbo(this, 172, 284, textureX, textureY); // Seat part
		bodyModel[261] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Seat part
		bodyModel[262] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Seat part
		bodyModel[263] = new ModelRendererTurbo(this, 181, 312, textureX, textureY); // Seat part
		bodyModel[264] = new ModelRendererTurbo(this, 181, 302, textureX, textureY); // Seat part
		bodyModel[265] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Seat part
		bodyModel[266] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Seat part
		bodyModel[267] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Seat part
		bodyModel[268] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Seat part
		bodyModel[269] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Seat part
		bodyModel[270] = new ModelRendererTurbo(this, 172, 312, textureX, textureY); // Seat part
		bodyModel[271] = new ModelRendererTurbo(this, 130, 277, textureX, textureY); // Seat part
		bodyModel[272] = new ModelRendererTurbo(this, 161, 277, textureX, textureY); // Seat part
		bodyModel[273] = new ModelRendererTurbo(this, 99, 305, textureX, textureY); // Seat part
		bodyModel[274] = new ModelRendererTurbo(this, 130, 305, textureX, textureY); // Seat part
		bodyModel[275] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Seat part
		bodyModel[276] = new ModelRendererTurbo(this, 212, 274, textureX, textureY); // Seat part
		bodyModel[277] = new ModelRendererTurbo(this, 212, 284, textureX, textureY); // Seat part
		bodyModel[278] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Seat part
		bodyModel[279] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Seat part
		bodyModel[280] = new ModelRendererTurbo(this, 203, 287, textureX, textureY); // Seat part
		bodyModel[281] = new ModelRendererTurbo(this, 203, 284, textureX, textureY); // Seat part
		bodyModel[282] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Seat part
		bodyModel[283] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Seat part
		bodyModel[284] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Seat part
		bodyModel[285] = new ModelRendererTurbo(this, 212, 302, textureX, textureY); // Seat part
		bodyModel[286] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Seat part
		bodyModel[287] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Seat part
		bodyModel[288] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Seat part
		bodyModel[289] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Seat part
		bodyModel[290] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Seat part
		bodyModel[291] = new ModelRendererTurbo(this, 203, 312, textureX, textureY); // Seat part
		bodyModel[292] = new ModelRendererTurbo(this, 192, 277, textureX, textureY); // Seat part
		bodyModel[293] = new ModelRendererTurbo(this, 192, 305, textureX, textureY); // Seat part
		bodyModel[294] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Seat part
		bodyModel[295] = new ModelRendererTurbo(this, 243, 284, textureX, textureY); // Seat part
		bodyModel[296] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Seat part
		bodyModel[297] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Seat part
		bodyModel[298] = new ModelRendererTurbo(this, 234, 287, textureX, textureY); // Seat part
		bodyModel[299] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Seat part
		bodyModel[300] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Seat part
		bodyModel[301] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Seat part
		bodyModel[302] = new ModelRendererTurbo(this, 243, 312, textureX, textureY); // Seat part
		bodyModel[303] = new ModelRendererTurbo(this, 243, 302, textureX, textureY); // Seat part
		bodyModel[304] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Seat part
		bodyModel[305] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Seat part
		bodyModel[306] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Seat part
		bodyModel[307] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Seat part
		bodyModel[308] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Seat part
		bodyModel[309] = new ModelRendererTurbo(this, 234, 312, textureX, textureY); // Seat part
		bodyModel[310] = new ModelRendererTurbo(this, 223, 277, textureX, textureY); // Seat part
		bodyModel[311] = new ModelRendererTurbo(this, 223, 305, textureX, textureY); // Seat part
		bodyModel[312] = new ModelRendererTurbo(this, 274, 274, textureX, textureY); // Seat part
		bodyModel[313] = new ModelRendererTurbo(this, 274, 284, textureX, textureY); // Seat part
		bodyModel[314] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Seat part
		bodyModel[315] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Seat part
		bodyModel[316] = new ModelRendererTurbo(this, 265, 287, textureX, textureY); // Seat part
		bodyModel[317] = new ModelRendererTurbo(this, 265, 284, textureX, textureY); // Seat part
		bodyModel[318] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Seat part
		bodyModel[319] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Seat part
		bodyModel[320] = new ModelRendererTurbo(this, 274, 312, textureX, textureY); // Seat part
		bodyModel[321] = new ModelRendererTurbo(this, 274, 302, textureX, textureY); // Seat part
		bodyModel[322] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Seat part
		bodyModel[323] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Seat part
		bodyModel[324] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Seat part
		bodyModel[325] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Seat part
		bodyModel[326] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Seat part
		bodyModel[327] = new ModelRendererTurbo(this, 265, 312, textureX, textureY); // Seat part
		bodyModel[328] = new ModelRendererTurbo(this, 254, 277, textureX, textureY); // Seat part
		bodyModel[329] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Seat part
		bodyModel[330] = new ModelRendererTurbo(this, 337, 363, textureX, textureY); // Box 38
		bodyModel[331] = new ModelRendererTurbo(this, 331, 362, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 338, 353, textureX, textureY); // Box 38
		bodyModel[333] = new ModelRendererTurbo(this, 331, 353, textureX, textureY); // Box 38
		bodyModel[334] = new ModelRendererTurbo(this, 297, 352, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 297, 363, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 54, 366, textureX, textureY); // Box 397
		bodyModel[337] = new ModelRendererTurbo(this, 49, 366, textureX, textureY); // Box 398
		bodyModel[338] = new ModelRendererTurbo(this, 50, 352, textureX, textureY); // Box 399
		bodyModel[339] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 400
		bodyModel[340] = new ModelRendererTurbo(this, 65, 348, textureX, textureY); // Box 401
		bodyModel[341] = new ModelRendererTurbo(this, 49, 348, textureX, textureY); // Box 401
		bodyModel[342] = new ModelRendererTurbo(this, 378, 363, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 393, 363, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 378, 368, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 393, 368, textureX, textureY); // Box 38
		bodyModel[346] = new ModelRendererTurbo(this, 350, 362, textureX, textureY); // Folding seat
		bodyModel[347] = new ModelRendererTurbo(this, 152, 361, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 229, 361, textureX, textureY); // Box 38
		bodyModel[349] = new ModelRendererTurbo(this, 163, 383, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[350] = new ModelRendererTurbo(this, 168, 383, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[351] = new ModelRendererTurbo(this, 173, 383, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[352] = new ModelRendererTurbo(this, 178, 383, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[353] = new ModelRendererTurbo(this, 200, 386, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[354] = new ModelRendererTurbo(this, 205, 386, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[355] = new ModelRendererTurbo(this, 210, 386, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[356] = new ModelRendererTurbo(this, 215, 386, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[357] = new ModelRendererTurbo(this, 186, 388, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 281, 382, textureX, textureY); // Box 38
		bodyModel[359] = new ModelRendererTurbo(this, 294, 380, textureX, textureY); // Box 38
		bodyModel[360] = new ModelRendererTurbo(this, 303, 408, textureX, textureY); // Box 38
		bodyModel[361] = new ModelRendererTurbo(this, 304, 378, textureX, textureY); // Box 38
		bodyModel[362] = new ModelRendererTurbo(this, 345, 382, textureX, textureY); // Box 38
		bodyModel[363] = new ModelRendererTurbo(this, 366, 403, textureX, textureY); // Box 38
		bodyModel[364] = new ModelRendererTurbo(this, 322, 408, textureX, textureY); // Box 38
		bodyModel[365] = new ModelRendererTurbo(this, 326, 382, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 340, 382, textureX, textureY); // Box 38
		bodyModel[367] = new ModelRendererTurbo(this, 328, 409, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 329, 418, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 358, 408, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 349, 413, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 358, 422, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 349, 427, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 351, 422, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 92, 408, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 53, 382, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 40, 378, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 20, 408, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 34, 408, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 15, 408, textureX, textureY); // Box 38
		bodyModel[383] = new ModelRendererTurbo(this, 51, 405, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 40, 405, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 19, 383, textureX, textureY); // Box 38
		bodyModel[386] = new ModelRendererTurbo(this, 20, 390, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 27, 396, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 13, 401, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 20, 396, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 90, 383, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 72, 387, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 72, 379, textureX, textureY); // Box 38
		bodyModel[393] = new ModelRendererTurbo(this, 72, 393, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[394] = new ModelRendererTurbo(this, 85, 396, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 331, 358, textureX, textureY); // Box 401
		bodyModel[396] = new ModelRendererTurbo(this, 57, 349, textureX, textureY); // Box 401
		bodyModel[397] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[398] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[399] = new ModelRendererTurbo(this, 1, 329, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[400] = new ModelRendererTurbo(this, 1, 343, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[401] = new ModelRendererTurbo(this, 117, 250, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 119, 343, textureX, textureY); // Box 38
		bodyModel[403] = new ModelRendererTurbo(this, 332, 371, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 336, 372, textureX, textureY); // Box 38
		bodyModel[405] = new ModelRendererTurbo(this, 339, 372, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 342, 372, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 6, 324, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 26, 402, textureX, textureY); // Box 38
		bodyModel[409] = new ModelRendererTurbo(this, 29, 402, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 359, 353, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 423, 353, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[412] = new ModelRendererTurbo(this, 423, 370, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[413] = new ModelRendererTurbo(this, 406, 358, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 406, 363, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 406, 368, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 317, 380, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[418] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[419] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[420] = new ModelRendererTurbo(this, 437, 2, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 390, 9, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 362, 9, textureX, textureY); // Box 176
		bodyModel[423] = new ModelRendererTurbo(this, 458, 1, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 368, 50, textureX, textureY); // Box 128
		bodyModel[426] = new ModelRendererTurbo(this, 382, 69, textureX, textureY); // Box 128
		bodyModel[427] = new ModelRendererTurbo(this, 382, 45, textureX, textureY); // Box 185
		bodyModel[428] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 128
		bodyModel[429] = new ModelRendererTurbo(this, 15, 81, textureX, textureY); // Box 128
		bodyModel[430] = new ModelRendererTurbo(this, 15, 57, textureX, textureY); // Box 185
		bodyModel[431] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[432] = new ModelRendererTurbo(this, 72, 235, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 72, 227, textureX, textureY); // Box 128
		bodyModel[434] = new ModelRendererTurbo(this, 72, 194, textureX, textureY); // Box 192
		bodyModel[435] = new ModelRendererTurbo(this, 187, 356, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[436] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 72, 191, textureX, textureY); // Box 194
		bodyModel[438] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[440] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[442] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[443] = new ModelRendererTurbo(this, 72, 221, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 72, 199, textureX, textureY); // Box 177
		bodyModel[445] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[446] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[447] = new ModelRendererTurbo(this, 71, 205, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 2
		bodyModel[449] = new ModelRendererTurbo(this, 273, 151, textureX, textureY); // Box 2
		bodyModel[450] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[451] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[452] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[453] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[454] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[455] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[456] = new ModelRendererTurbo(this, 274, 138, textureX, textureY); // Box 24
		bodyModel[457] = new ModelRendererTurbo(this, 274, 141, textureX, textureY); // Box 25
		bodyModel[458] = new ModelRendererTurbo(this, 267, 138, textureX, textureY); // Box 26
		bodyModel[459] = new ModelRendererTurbo(this, 267, 141, textureX, textureY); // Box 27
		bodyModel[460] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[461] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[462] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[463] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[464] = new ModelRendererTurbo(this, 95, 403, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 95, 401, textureX, textureY); // Box 452
		bodyModel[466] = new ModelRendererTurbo(this, 110, 411, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 110, 405, textureX, textureY); // Box 462
		bodyModel[468] = new ModelRendererTurbo(this, 352, 382, textureX, textureY); // Box 38
		bodyModel[469] = new ModelRendererTurbo(this, 331, 379, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 292, 426, textureX, textureY); // Box 38
		bodyModel[471] = new ModelRendererTurbo(this, 292, 435, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 292, 444, textureX, textureY); // Box 38
		bodyModel[473] = new ModelRendererTurbo(this, 190, 417, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[474] = new ModelRendererTurbo(this, 111, 417, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[475] = new ModelRendererTurbo(this, 99, 429, textureX, textureY, "cull"); // Box 275 cull
		bodyModel[476] = new ModelRendererTurbo(this, 190, 429, textureX, textureY, "cull"); // Box 275 cull
		bodyModel[477] = new ModelRendererTurbo(this, 193, 426, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 114, 426, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 102, 438, textureX, textureY); // Box 275
		bodyModel[480] = new ModelRendererTurbo(this, 193, 438, textureX, textureY); // Box 275
		bodyModel[481] = new ModelRendererTurbo(this, 190, 422, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[482] = new ModelRendererTurbo(this, 111, 422, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[483] = new ModelRendererTurbo(this, 99, 434, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[484] = new ModelRendererTurbo(this, 190, 434, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[485] = new ModelRendererTurbo(this, 297, 432, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 297, 441, textureX, textureY); // Box 38
		bodyModel[487] = new ModelRendererTurbo(this, 297, 450, textureX, textureY); // Box 38
		bodyModel[488] = new ModelRendererTurbo(this, 292, 432, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 292, 441, textureX, textureY); // Box 38
		bodyModel[490] = new ModelRendererTurbo(this, 292, 450, textureX, textureY); // Box 38
		bodyModel[491] = new ModelRendererTurbo(this, 308, 432, textureX, textureY); // Box 38
		bodyModel[492] = new ModelRendererTurbo(this, 308, 441, textureX, textureY); // Box 38
		bodyModel[493] = new ModelRendererTurbo(this, 308, 450, textureX, textureY); // Box 38
		bodyModel[494] = new ModelRendererTurbo(this, 281, 426, textureX, textureY); // Box 38
		bodyModel[495] = new ModelRendererTurbo(this, 313, 426, textureX, textureY); // Box 38
		bodyModel[496] = new ModelRendererTurbo(this, 351, 416, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[497] = new ModelRendererTurbo(this, 351, 430, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[498] = new ModelRendererTurbo(this, 20, 402, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[499] = new ModelRendererTurbo(this, 361, 414, textureX, textureY); // Box 38

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[3].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[5].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[6].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[9].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[10].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[11].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(-26.5F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[15].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(53F, 4F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[18].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[19].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-55F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[21].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(33F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[23].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(-35F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[25].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[27].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[28].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[29].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[30].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[31].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[32].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[33].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[33].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[34].setRotationPoint(43F, 4F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[35].setRotationPoint(-45F, 4F, -1F);

		bodyModel[36].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[36].setRotationPoint(0.5F, 3F, 4.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[37].setRotationPoint(14.5F, 3F, 4.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[38].setRotationPoint(0.5F, 3F, -9.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[39].setRotationPoint(23.5F, 3F, 4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[40].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[41].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 2
		bodyModel[42].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[43].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[44].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[46].setRotationPoint(-24.5F, 3F, 7.75F);
		bodyModel[46].rotateAngleX = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[47].setRotationPoint(-24.51F, 3F, 7.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[48].setRotationPoint(-16.49F, 3F, 7.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[49].setRotationPoint(-15.5F, 3F, 7.75F);
		bodyModel[49].rotateAngleX = -0.78539816F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[50].setRotationPoint(-15.51F, 3F, 7.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[51].setRotationPoint(-7.49F, 3F, 7.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[52].setRotationPoint(-31F, 3F, 4.5F);
		bodyModel[52].rotateAngleZ = -0.78539816F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[53].setRotationPoint(-31.5F, 3F, 4.49F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[54].setRotationPoint(-31.5F, 3F, 9.51F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[55].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[55].rotateAngleX = -0.78539816F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[56].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[57].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[58].setRotationPoint(23.5F, 3F, -7.5F);
		bodyModel[58].rotateAngleX = -0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[59].setRotationPoint(23.49F, 3F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[60].setRotationPoint(29.51F, 3F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[61].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[62].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[63].setRotationPoint(15.25F, 4F, -10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[64].setRotationPoint(19.25F, 4F, -10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[65].setRotationPoint(18.25F, 4F, -10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[66].setRotationPoint(14.25F, 3.75F, -10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[67].setRotationPoint(15.55F, 4.2F, -10F);
		bodyModel[67].rotateAngleZ = -0.78539816F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[68].setRotationPoint(18.75F, 4.2F, -10F);
		bodyModel[68].rotateAngleZ = -0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[69].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[70].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[71].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[72].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[73].setRotationPoint(-16.5F, 3F, -7.75F);
		bodyModel[73].rotateAngleX = -0.78539816F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[74].setRotationPoint(-16.51F, 3F, -8.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[75].setRotationPoint(-12.49F, 3F, -8.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[76].setRotationPoint(-21F, 3F, -9.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[77].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[78].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[79].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[79].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[80].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[80].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[81].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[81].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[82].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[82].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[83].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[83].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[84].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[84].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[85].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[86].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[86].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[87].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[87].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[88].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[89].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[89].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[90].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[91].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[91].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[92].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[93].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[94].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[94].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[95].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[95].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[96].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[96].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[97].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[97].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[98].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[98].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[99].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[99].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[100].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[101].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[101].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[102].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[102].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[103].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[104].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[104].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[105].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[106].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[106].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[107].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[108].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[109].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[109].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[110].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[111].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[112].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[113].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[114].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[115].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[116].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[117].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[118].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[119].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[120].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[121].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[122].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[123].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[124].setRotationPoint(55.51F, -14F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[125].setRotationPoint(-61.49F, -14F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(63F, -14F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(63F, -14F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(63F, 1F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(63F, -15F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(63F, -16F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[135].setRotationPoint(63F, -16F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[136].setRotationPoint(-63F, -15F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-63F, 1F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[138].setRotationPoint(-63F, -14F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(-63F, -14F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[142].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[143].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[144].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[145].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[146].setRotationPoint(47.5F, -18F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[147].setRotationPoint(47.5F, -18.5F, 8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[148].setRotationPoint(42.5F, -18F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[149].setRotationPoint(42.5F, -18.5F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[150].setRotationPoint(-55.5F, -18F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[151].setRotationPoint(-55.5F, -18.5F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[152].setRotationPoint(42.5F, -18F, -11.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(56F, -6F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[154].setRotationPoint(61F, -6F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[156].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[157].setRotationPoint(56F, -6F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[158].setRotationPoint(61F, -6F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[159].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[160].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[161].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.35F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[161].setRotationPoint(48F, -20.75F, -4.5F);
		bodyModel[161].rotateAngleY = -0.78539816F;

		bodyModel[162].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[162].setRotationPoint(-3.5F, -15F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 38
		bodyModel[163].setRotationPoint(-3.5F, -15F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[164].setRotationPoint(2.5F, -15F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[165].setRotationPoint(-9.5F, -15F, 5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[166].setRotationPoint(-3.5F, -15F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 38
		bodyModel[167].setRotationPoint(-3.5F, -8F, -2F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 38
		bodyModel[168].setRotationPoint(-9.5F, -7F, 3F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 38
		bodyModel[169].setRotationPoint(2.5F, -7F, 3F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 38
		bodyModel[170].setRotationPoint(-9F, -15F, 4F);

		bodyModel[171].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 38
		bodyModel[171].setRotationPoint(3F, -15F, 4F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 6, 4, 0F); // Box 38
		bodyModel[172].setRotationPoint(-3F, -14F, -2F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 38
		bodyModel[173].setRotationPoint(-3.5F, -17F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[174].setRotationPoint(-3.5F, -17F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[175].setRotationPoint(-9.5F, -17F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[176].setRotationPoint(-9.5F, -17F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[177].setRotationPoint(2.5F, -17F, 3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[178].setRotationPoint(2.5F, -17F, 8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 39, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[179].setRotationPoint(-42.5F, -17F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 16, 5, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[180].setRotationPoint(-47.5F, -15F, 5F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[181].setRotationPoint(-43.5F, -15F, 3F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[182].setRotationPoint(-43.5F, -15F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 38
		bodyModel[183].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[184].setRotationPoint(-52.5F, -15F, -10F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[185].setRotationPoint(-55.5F, -15F, -5F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[186].setRotationPoint(-54F, -15F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[187].setRotationPoint(-55.5F, -15F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(-50F, -15F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 38
		bodyModel[189].setRotationPoint(-45.5F, -15F, -4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[190].setRotationPoint(-48.5F, -15F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 38
		bodyModel[191].setRotationPoint(-57.5F, -15F, -5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[192].setRotationPoint(36.5F, -15F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 39, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[193].setRotationPoint(-2.5F, -17F, -2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(37.5F, -15F, -9F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[195].setRotationPoint(36.5F, -15F, -10F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[196].setRotationPoint(45.5F, -15F, 3F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[197].setRotationPoint(41.5F, -15F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 38
		bodyModel[198].setRotationPoint(45.5F, -15F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-2.6F, 0F, -0.6F, 2.05F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, -0.6F, 2.05F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[200].setRotationPoint(45.5F, -15F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 269
		bodyModel[201].setRotationPoint(37.5F, -15F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,-1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 270
		bodyModel[202].setRotationPoint(39.5F, -15F, -4F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 38
		bodyModel[203].setRotationPoint(51.5F, -12F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[204].setRotationPoint(50.5F, -12F, -7F);

		bodyModel[205].addBox(0F, 0F, 0F, 39, 1, 3, 0F); // Box 275
		bodyModel[205].setRotationPoint(-42.5F, -14F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[206].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[207].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 38
		bodyModel[207].setRotationPoint(3.5F, -14F, 7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[208].setRotationPoint(3.5F, -13F, 9F);

		bodyModel[209].addBox(0F, 0F, 0F, 39, 1, 3, 0F); // Box 275
		bodyModel[209].setRotationPoint(-2.5F, -14F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[210].setRotationPoint(-2.5F, -13F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[211].setRotationPoint(-2.5F, -16.5F, -0.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[212].setRotationPoint(-42.5F, -16.5F, -0.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[213].setRotationPoint(39.5F, -15F, 2.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(40.5F, -15F, -5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[215].setRotationPoint(45.5F, -15F, -5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[216].setRotationPoint(50.5F, -15F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 274
		bodyModel[217].setRotationPoint(-46.5F, -15F, -3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[218].setRotationPoint(-46.5F, -15F, -3.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -1F, -2F, 0F, 0F); // Box 274
		bodyModel[219].setRotationPoint(-58.5F, -15F, -3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 38
		bodyModel[220].setRotationPoint(-56.5F, -15F, 5F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 38
		bodyModel[221].setRotationPoint(-58.5F, -15F, -3.5F);

		bodyModel[222].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[222].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[223].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[224].setRotationPoint(-36.5F, -3F, 7F);
		bodyModel[224].rotateAngleY = -3.14159265F;

		bodyModel[225].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[225].setRotationPoint(-36.5F, -3F, 7F);
		bodyModel[225].rotateAngleY = -3.14159265F;

		bodyModel[226].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[226].setRotationPoint(-36.5F, -8F, 7F);
		bodyModel[226].rotateAngleY = -3.14159265F;

		bodyModel[227].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[227].setRotationPoint(-36.5F, -4F, 7F);
		bodyModel[227].rotateAngleY = -3.14159265F;

		bodyModel[228].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[228].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[228].rotateAngleY = -3.14159265F;

		bodyModel[229].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[229].setRotationPoint(-36.5F, -4F, 7F);
		bodyModel[229].rotateAngleY = -3.14159265F;

		bodyModel[230].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[230].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[230].rotateAngleY = -3.14159265F;

		bodyModel[231].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[231].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[232].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[233].setRotationPoint(-36.5F, -3F, -7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[234].setRotationPoint(-36.5F, -8F, -7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[235].setRotationPoint(-36.5F, -4F, -7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[236].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[237].setRotationPoint(-36.5F, -4F, -7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[238].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[239].setRotationPoint(-25.5F, -5F, 7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[240].setRotationPoint(-25.5F, -5F, 7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[241].setRotationPoint(-25.5F, -3F, 7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[242].setRotationPoint(-25.5F, -8F, 7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[243].setRotationPoint(-25.5F, -4F, 7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[244].setRotationPoint(-25.5F, -5F, 7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[245].setRotationPoint(-25.5F, -4F, 7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[246].setRotationPoint(-25.5F, -5F, 7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[247].setRotationPoint(-25.5F, -5F, -7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[248].setRotationPoint(-25.5F, -5F, -7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[249].setRotationPoint(-25.5F, -3F, -7F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[250].setRotationPoint(-25.5F, -8F, -7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[251].setRotationPoint(-25.5F, -4F, -7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[252].setRotationPoint(-25.5F, -5F, -7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[253].setRotationPoint(-25.5F, -4F, -7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[254].setRotationPoint(-25.5F, -5F, -7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[255].setRotationPoint(-14.5F, -5F, 7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[256].setRotationPoint(-14.5F, -5F, 7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[257].setRotationPoint(-14.5F, -3F, 7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[258].setRotationPoint(-14.5F, -8F, 7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[259].setRotationPoint(-14.5F, -4F, 7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[260].setRotationPoint(-14.5F, -5F, 7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[261].setRotationPoint(-14.5F, -4F, 7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[262].setRotationPoint(-14.5F, -5F, 7F);
		bodyModel[262].rotateAngleY = -3.14159265F;

		bodyModel[263].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[263].setRotationPoint(-14.5F, -5F, -7F);
		bodyModel[263].rotateAngleY = -3.14159265F;

		bodyModel[264].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[264].setRotationPoint(-14.5F, -5F, -7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[265].setRotationPoint(-14.5F, -3F, -7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[266].setRotationPoint(-14.5F, -8F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[267].setRotationPoint(-14.5F, -4F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[268].setRotationPoint(-14.5F, -5F, -7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[269].setRotationPoint(-14.5F, -4F, -7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[270].setRotationPoint(-14.5F, -5F, -7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[271].setRotationPoint(-25.5F, -3F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[272].setRotationPoint(-14.5F, -3F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[273].setRotationPoint(-36.5F, -3F, -7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[274].setRotationPoint(-25.5F, -3F, -7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[275].setRotationPoint(-14.5F, -3F, -7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[276].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[277].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[278].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[279].setRotationPoint(8.5F, -8F, 7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[280].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[281].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[282].setRotationPoint(8.5F, -4F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[283].setRotationPoint(8.5F, -5F, 7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[284].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[285].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[286].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[287].setRotationPoint(8.5F, -8F, -7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[288].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[289].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[290].setRotationPoint(8.5F, -4F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[291].setRotationPoint(8.5F, -5F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[292].setRotationPoint(8.5F, -3F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[293].setRotationPoint(8.5F, -3F, -7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[294].setRotationPoint(19.5F, -5F, 7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[295].setRotationPoint(19.5F, -5F, 7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[296].setRotationPoint(19.5F, -3F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[297].setRotationPoint(19.5F, -8F, 7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[298].setRotationPoint(19.5F, -4F, 7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[299].setRotationPoint(19.5F, -5F, 7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[300].setRotationPoint(19.5F, -4F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[301].setRotationPoint(19.5F, -5F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[302].setRotationPoint(19.5F, -5F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[303].setRotationPoint(19.5F, -5F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[304].setRotationPoint(19.5F, -3F, -7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[305].setRotationPoint(19.5F, -8F, -7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[306].setRotationPoint(19.5F, -4F, -7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[307].setRotationPoint(19.5F, -5F, -7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[308].setRotationPoint(19.5F, -4F, -7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[309].setRotationPoint(19.5F, -5F, -7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[310].setRotationPoint(19.5F, -3F, 7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[311].setRotationPoint(19.5F, -3F, -7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[312].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[313].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[314].setRotationPoint(30.5F, -3F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[315].setRotationPoint(30.5F, -8F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[316].setRotationPoint(30.5F, -4F, 7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[317].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[318].setRotationPoint(30.5F, -4F, 7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[319].setRotationPoint(30.5F, -5F, 7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Seat part
		bodyModel[320].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Seat part
		bodyModel[321].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Seat part
		bodyModel[322].setRotationPoint(30.5F, -3F, -7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[323].setRotationPoint(30.5F, -8F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Seat part
		bodyModel[324].setRotationPoint(30.5F, -4F, -7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[325].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Seat part
		bodyModel[326].setRotationPoint(30.5F, -4F, -7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Seat part
		bodyModel[327].setRotationPoint(30.5F, -5F, -7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[328].setRotationPoint(30.5F, -3F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Seat part
		bodyModel[329].setRotationPoint(30.5F, -3F, -7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 38
		bodyModel[330].setRotationPoint(37.5F, -1F, 4F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[331].setRotationPoint(37.5F, -1F, 2F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 38
		bodyModel[332].setRotationPoint(37.5F, -3F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[333].setRotationPoint(37.5F, -3F, 2F);

		bodyModel[334].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 38
		bodyModel[334].setRotationPoint(43.5F, -6F, 7F);

		bodyModel[335].addBox(0F, 0F, 0F, 2, 7, 3, 0F); // Box 38
		bodyModel[335].setRotationPoint(43.5F, -6F, 3F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 397
		bodyModel[336].setRotationPoint(-46.5F, -1F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 398
		bodyModel[337].setRotationPoint(-46.5F, -1F, -4F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 399
		bodyModel[338].setRotationPoint(-47.5F, -3F, -10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[339].setRotationPoint(-47.5F, -3F, -4F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 401
		bodyModel[340].setRotationPoint(-48.85F, -6F, 1.8F);
		bodyModel[340].rotateAngleY = 0.30543262F;

		bodyModel[341].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 401
		bodyModel[341].setRotationPoint(-56.1F, -6F, 2.1F);
		bodyModel[341].rotateAngleY = -0.30543262F;

		bodyModel[342].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 38
		bodyModel[342].setRotationPoint(51.5F, -8F, -7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[343].setRotationPoint(50.5F, -8F, -7F);

		bodyModel[344].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 38
		bodyModel[344].setRotationPoint(51.5F, -4F, -7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[345].setRotationPoint(50.5F, -4F, -7F);

		bodyModel[346].addBox(-1F, 0F, 0F, 1, 3, 3, 0F); // Folding seat
		bodyModel[346].setRotationPoint(49.5F, -3F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[347].setRotationPoint(-8.5F, -15F, 5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[348].setRotationPoint(-0.5F, -15F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[349].setRotationPoint(-39.5F, -17F, -0.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[350].setRotationPoint(-29.5F, -17F, -0.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[351].setRotationPoint(-19.5F, -17F, -0.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[352].setRotationPoint(-9.5F, -17F, -0.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[353].setRotationPoint(2.5F, -17F, -0.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[354].setRotationPoint(12.5F, -17F, -0.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[355].setRotationPoint(22.5F, -17F, -0.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275 glow
		bodyModel[356].setRotationPoint(32.5F, -17F, -0.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 38
		bodyModel[357].setRotationPoint(-3.5F, -14F, -2F);

		bodyModel[358].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[358].setRotationPoint(37.5F, -15F, 3F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[359].setRotationPoint(41.5F, -15F, 0F);

		bodyModel[360].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[360].setRotationPoint(41.5F, -15F, -1F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[361].setRotationPoint(49.5F, -15F, 5F);

		bodyModel[362].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[362].setRotationPoint(53.5F, -15F, 3F);

		bodyModel[363].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 38
		bodyModel[363].setRotationPoint(53.5F, -15F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[364].setRotationPoint(49.5F, -15F, -1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 38
		bodyModel[365].setRotationPoint(49.5F, -15F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[366].setRotationPoint(52.5F, -15F, 3F);

		bodyModel[367].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 38
		bodyModel[367].setRotationPoint(37.5F, -3F, 4F);

		bodyModel[368].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 38
		bodyModel[368].setRotationPoint(37.5F, -1F, 4F);

		bodyModel[369].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[369].setRotationPoint(47.5F, -6F, 9F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[370].setRotationPoint(43.5F, -5F, 9F);

		bodyModel[371].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 38
		bodyModel[371].setRotationPoint(45.5F, -13F, 9F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[372].setRotationPoint(42.5F, -6F, 0F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[373].setRotationPoint(46.5F, -5F, 0F);

		bodyModel[374].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 38
		bodyModel[374].setRotationPoint(44.5F, -13F, 0F);

		bodyModel[375].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[375].setRotationPoint(-48.5F, -15F, -4F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[376].setRotationPoint(-48.5F, -15F, -3F);

		bodyModel[377].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[377].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[378].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[378].setRotationPoint(-55.5F, -15F, 0F);

		bodyModel[379].addBox(0F, 0F, 0F, 2, 16, 6, 0F); // Box 38
		bodyModel[379].setRotationPoint(-60.5F, -15F, 4F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,-1F, 0F, -0.25F, 0.5F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 38
		bodyModel[380].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[381].setRotationPoint(-55.5F, -15F, -0.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[382].setRotationPoint(-60.5F, -15F, -3.75F);

		bodyModel[383].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[383].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, 1F, 0F, -1F); // Box 38
		bodyModel[384].setRotationPoint(-57.5F, -15F, -6F);

		bodyModel[385].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 38
		bodyModel[385].setRotationPoint(-54.5F, -3F, 1F);

		bodyModel[386].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 38
		bodyModel[386].setRotationPoint(-54.5F, -1F, 2F);

		bodyModel[387].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[387].setRotationPoint(-56.5F, -6F, -10F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[388].setRotationPoint(-52.5F, -5F, -10F);

		bodyModel[389].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 38
		bodyModel[389].setRotationPoint(-54.5F, -13F, -10F);

		bodyModel[390].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 38
		bodyModel[390].setRotationPoint(-46.5F, -6F, -10F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 38
		bodyModel[391].setRotationPoint(-49.5F, -3F, -9F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 38
		bodyModel[392].setRotationPoint(-49.5F, -6F, -9F);

		bodyModel[393].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 38 cull
		bodyModel[393].setRotationPoint(-49.5F, -2F, -9F);

		bodyModel[394].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 38
		bodyModel[394].setRotationPoint(-49.5F, 0F, -9F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 401
		bodyModel[395].setRotationPoint(41.16F, -5F, -1.75F);
		bodyModel[395].rotateAngleY = 0.15271631F;

		bodyModel[396].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 401
		bodyModel[396].setRotationPoint(-50.5F, -5F, -10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[397].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[398].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[399].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176 glow
		bodyModel[399].setRotationPoint(-62F, -11.5F, 8F);
		bodyModel[399].rotateAngleX = -0.78539816F;

		bodyModel[400].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176 glow
		bodyModel[400].setRotationPoint(-62F, -11.5F, -8F);
		bodyModel[400].rotateAngleX = 0.78539816F;

		bodyModel[401].addBox(0F, 0F, 0F, 33, 1, 3, 0F); // Box 38
		bodyModel[401].setRotationPoint(-42.5F, -14F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[402].setRotationPoint(-42.5F, -13F, 9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 38
		bodyModel[403].setRotationPoint(40.5F, 0.99F, -4F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[404].setRotationPoint(45.5F, 0.99F, -4F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.4F, -1F, 0F, -0.4F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -0.55F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[405].setRotationPoint(46.5F, 0.99F, -3F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.8F, -1F, 0F, -0.8F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1F, 0F, -0.8F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[406].setRotationPoint(47.5F, 0.99F, -2F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[407].setRotationPoint(-60.5F, -15F, 5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.4F, 0F, -1F); // Box 38
		bodyModel[408].setRotationPoint(-57.5F, 0.99F, -2F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.8F, 0F, -1F); // Box 38
		bodyModel[409].setRotationPoint(-56.5F, 0.99F, -1F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[410].setRotationPoint(49.5F, -15F, -10F);

		bodyModel[411].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176 glow
		bodyModel[411].setRotationPoint(61.5F, -11.5F, 8F);
		bodyModel[411].rotateAngleX = -0.78539816F;

		bodyModel[412].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176 glow
		bodyModel[412].setRotationPoint(61.5F, -11.5F, -8F);
		bodyModel[412].rotateAngleX = 0.78539816F;

		bodyModel[413].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 38
		bodyModel[413].setRotationPoint(50.5F, -12F, -10F);

		bodyModel[414].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 38
		bodyModel[414].setRotationPoint(50.5F, -8F, -10F);

		bodyModel[415].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 38
		bodyModel[415].setRotationPoint(50.5F, -4F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 16, 3, 0F,-2.8F, 0F, -0.8F, 2.3F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, -0.8F, 2.3F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[416].setRotationPoint(49.5F, -15F, 2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[417].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[418].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[419].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[420].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[421].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[422].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[423].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[424].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[425].addBox(0F, 0F, 0F, 19, 2, 16, 0F); // Box 128
		bodyModel[425].setRotationPoint(36.5F, -17F, -8F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[426].setRotationPoint(36.5F, -17F, -10F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[427].setRotationPoint(36.5F, -17F, 8F);

		bodyModel[428].addBox(0F, 0F, 0F, 18, 2, 16, 0F); // Box 128
		bodyModel[428].setRotationPoint(-60.5F, -17F, -8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[429].setRotationPoint(-60.5F, -17F, -10F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[430].setRotationPoint(-60.5F, -17F, 8F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[431].setRotationPoint(-60.5F, -16F, 8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[432].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[433].setRotationPoint(-60.5F, -17F, -8.25F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 116, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[434].setRotationPoint(-60.5F, -17F, 5.25F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[435].setRotationPoint(-4.5F, -16.76F, 6.5F);
		bodyModel[435].rotateAngleX = -0.14835299F;

		bodyModel[436].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[436].setRotationPoint(-60.5F, -18F, -8.25F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[437].setRotationPoint(-60.5F, -18F, 7.25F);

		bodyModel[438].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[438].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[439].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[440].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[441].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[442].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[444].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[445].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[446].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[447].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[447].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[448].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[449].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[450].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[451].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[452].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[453].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[454].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[455].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[456].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[457].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[458].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[459].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[460].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[461].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[462].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[463].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[464].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[465].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[465].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 79, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[466].setRotationPoint(-42.5F, -11F, -9.9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 79, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[467].setRotationPoint(-42.5F, -11F, 9.9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.7F, 0F, 0.7F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.7F, 0F, 0.7F); // Box 38
		bodyModel[468].setRotationPoint(52.3F, -15F, 1.8F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 0, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.3F, 0F, -1.7F, -2.3F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 2.3F, 0F, -1.7F, -2.3F, 0F, -1.7F); // Box 38
		bodyModel[469].setRotationPoint(50.25F, -15F, 0.25F);

		bodyModel[470].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 38
		bodyModel[470].setRotationPoint(42.5F, -12F, -5F);

		bodyModel[471].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 38
		bodyModel[471].setRotationPoint(42.5F, -8F, -5F);

		bodyModel[472].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 38
		bodyModel[472].setRotationPoint(42.5F, -4F, -5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 38 cull
		bodyModel[473].setRotationPoint(3.51F, -14F, 7F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 38 cull
		bodyModel[474].setRotationPoint(-42.49F, -14F, 7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F,0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 cull
		bodyModel[475].setRotationPoint(-42.49F, -14F, -10F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F,0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 cull
		bodyModel[476].setRotationPoint(-2.49F, -14F, -10F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 36, 1, 0, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[477].setRotationPoint(3.51F, -13F, 9.99F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 36, 1, 0, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[478].setRotationPoint(-42.49F, -13F, 9.99F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 42, 1, 0, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[479].setRotationPoint(-42.49F, -13F, -9.99F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 42, 1, 0, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[480].setRotationPoint(-2.49F, -13F, -9.99F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 36, 0, 3, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 38 glow
		bodyModel[481].setRotationPoint(3.51F, -12.99F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 36, 0, 3, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 38 glow
		bodyModel[482].setRotationPoint(-42.49F, -12.99F, 7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 42, 0, 3, 0F,0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[483].setRotationPoint(-42.49F, -12.99F, -10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 42, 0, 3, 0F,0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -3.02F, 0F, -0.01F, -3.02F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[484].setRotationPoint(-2.49F, -12.99F, -10F);

		bodyModel[485].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[485].setRotationPoint(43.5F, -12F, -6F);

		bodyModel[486].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[486].setRotationPoint(43.5F, -8F, -6F);

		bodyModel[487].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		bodyModel[487].setRotationPoint(43.5F, -4F, -6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[488].setRotationPoint(42.5F, -12F, -6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[489].setRotationPoint(42.5F, -8F, -6F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[490].setRotationPoint(42.5F, -4F, -6F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[491].setRotationPoint(47.5F, -12F, -6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[492].setRotationPoint(47.5F, -8F, -6F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[493].setRotationPoint(47.5F, -4F, -6F);

		bodyModel[494].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[494].setRotationPoint(41.5F, -15F, -5F);

		bodyModel[495].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[495].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[496].setRotationPoint(45.5F, -2F, 9F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Box 38 cull
		bodyModel[497].setRotationPoint(44.5F, -2F, 0.01F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 38 cull
		bodyModel[498].setRotationPoint(-54.5F, -2F, -10F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[499].setRotationPoint(48.5F, -6F, 8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 358, 425, textureX, textureY); // Box 38
		bodyModel[501] = new ModelRendererTurbo(this, 27, 399, textureX, textureY); // Box 38
		bodyModel[502] = new ModelRendererTurbo(this, 363, 426, textureX, textureY); // Box 38
		bodyModel[503] = new ModelRendererTurbo(this, 358, 411, textureX, textureY); // Box 38
		bodyModel[504] = new ModelRendererTurbo(this, 32, 399, textureX, textureY); // Box 38
		bodyModel[505] = new ModelRendererTurbo(this, 63, 400, textureX, textureY); // Box 37
		bodyModel[506] = new ModelRendererTurbo(this, 65, 404, textureX, textureY); // Box 37
		bodyModel[507] = new ModelRendererTurbo(this, 63, 412, textureX, textureY); // Box 37
		bodyModel[508] = new ModelRendererTurbo(this, 98, 385, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[509] = new ModelRendererTurbo(this, 60, 80, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 60, 98, textureX, textureY); // Box 202
		bodyModel[511] = new ModelRendererTurbo(this, 57, 141, textureX, textureY); // Box 30
		bodyModel[512] = new ModelRendererTurbo(this, 57, 138, textureX, textureY); // Box 31
		bodyModel[513] = new ModelRendererTurbo(this, 68, 138, textureX, textureY); // Box 32
		bodyModel[514] = new ModelRendererTurbo(this, 66, 141, textureX, textureY); // Box 33
		bodyModel[515] = new ModelRendererTurbo(this, 57, 151, textureX, textureY); // Box 2
		bodyModel[516] = new ModelRendererTurbo(this, 57, 148, textureX, textureY); // Box 2
		bodyModel[517] = new ModelRendererTurbo(this, 68, 148, textureX, textureY); // Box 2
		bodyModel[518] = new ModelRendererTurbo(this, 66, 151, textureX, textureY); // Box 2
		bodyModel[519] = new ModelRendererTurbo(this, 62, 50, textureX, textureY); // Box 190
		bodyModel[520] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 191
		bodyModel[521] = new ModelRendererTurbo(this, 195, 260, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[522] = new ModelRendererTurbo(this, 119, 248, textureX, textureY, "lamp"); // Box 285 glow
		bodyModel[523] = new ModelRendererTurbo(this, 107, 260, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[524] = new ModelRendererTurbo(this, 195, 248, textureX, textureY, "lamp"); // Box 285 glow

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[500].setRotationPoint(42.5F, -6F, 1F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[501].setRotationPoint(-56.5F, -6F, -9F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[502].setRotationPoint(43.5F, -6F, 1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[503].setRotationPoint(47.5F, -6F, 8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[504].setRotationPoint(-55.5F, -6F, -9F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[505].setRotationPoint(-51.5F, -5F, -3F);

		bodyModel[506].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 37
		bodyModel[506].setRotationPoint(-50.5F, -5.5F, -2F);
		bodyModel[506].rotateAngleY = -0.78539816F;

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 37
		bodyModel[507].setRotationPoint(-51.5F, 0.5F, -3F);

		bodyModel[508].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 38 glow
		bodyModel[508].setRotationPoint(-43.51F, -13F, -10F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(-61F, -6F, -12F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[510].setRotationPoint(-61F, -6F, 11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[511].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[512].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[513].setRotationPoint(-57.25F, 3F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[514].setRotationPoint(-59F, 4F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[515].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[516].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[517].setRotationPoint(-57.25F, 3F, 10.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[518].setRotationPoint(-59F, 4F, 10.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[519].setRotationPoint(-59.5F, -18F, -11F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[520].setRotationPoint(-59.5F, -18.5F, -10F);

		bodyModel[521].addBox(0F, 0F, 0F, 39, 0, 1, 0F); // Box 275 glow
		bodyModel[521].setRotationPoint(-42.5F, -12.99F, -8.5F);

		bodyModel[522].addBox(0F, 0F, 0F, 33, 0, 1, 0F); // Box 285 glow
		bodyModel[522].setRotationPoint(-42.5F, -12.99F, 7.5F);

		bodyModel[523].addBox(0F, 0F, 0F, 39, 0, 1, 0F); // Box 275 glow
		bodyModel[523].setRotationPoint(-2.5F, -12.99F, -8.5F);

		bodyModel[524].addBox(0F, 0F, 0F, 33, 0, 1, 0F); // Box 285 glow
		bodyModel[524].setRotationPoint(3.5F, -12.99F, 7.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 525; i++)
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
		if(GetColor(entity)== 11 || GetColor(entity) == 14){ //add back in once Sue line skin is remade: ||GetColor(entity)==0
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 || GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_NKP_blue.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}