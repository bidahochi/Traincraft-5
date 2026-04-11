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

public class ModelBuddCBQDome50SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddCBQDome50SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[794];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY, "cull"); // Box 2 floor cull
		bodyModel[1] = new ModelRendererTurbo(this, 340, 106, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 377, 126, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 60, 113, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 14, 127, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 194, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 101, 161, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 234, 175, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 234, 173, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 254, 173, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 194, 162, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 184, 161, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 189, 161, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 203, 162, textureX, textureY); // Box 38
		bodyModel[18] = new ModelRendererTurbo(this, 180, 167, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 193, 167, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 189, 166, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 181, 166, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 202, 166, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 194, 166, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[25] = new ModelRendererTurbo(this, 329, 92, textureX, textureY); // Right step part
		bodyModel[26] = new ModelRendererTurbo(this, 327, 95, textureX, textureY); // Right step part
		bodyModel[27] = new ModelRendererTurbo(this, 329, 98, textureX, textureY); // Right step part
		bodyModel[28] = new ModelRendererTurbo(this, 324, 93, textureX, textureY); // Right step part
		bodyModel[29] = new ModelRendererTurbo(this, 338, 93, textureX, textureY); // Right step part
		bodyModel[30] = new ModelRendererTurbo(this, 329, 102, textureX, textureY); // Right step part
		bodyModel[31] = new ModelRendererTurbo(this, 327, 105, textureX, textureY); // Right step part
		bodyModel[32] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[33] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[34] = new ModelRendererTurbo(this, 310, 69, textureX, textureY); // Left side door
		bodyModel[35] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 310, 90, textureX, textureY); // Right side door
		bodyModel[42] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[50] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[51] = new ModelRendererTurbo(this, 72, 41, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 72, 51, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 72, 35, textureX, textureY); // Box 168
		bodyModel[54] = new ModelRendererTurbo(this, 72, 62, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[56] = new ModelRendererTurbo(this, 216, 8, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 99, 15, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 156, 20, textureX, textureY); // Box 38
		bodyModel[59] = new ModelRendererTurbo(this, 285, 13, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 154, 14, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 214, 1, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 156, 11, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 283, 7, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 214, 17, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 285, 4, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 155, 41, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[67] = new ModelRendererTurbo(this, 155, 51, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 155, 35, textureX, textureY); // Box 168
		bodyModel[69] = new ModelRendererTurbo(this, 155, 62, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 155, 26, textureX, textureY); // Box 170
		bodyModel[71] = new ModelRendererTurbo(this, 311, 33, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 86, 9, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 79, 14, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 123, 9, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 136, 14, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 99, 1, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 123, 2, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 86, 2, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 70, 22, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 70, 18, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 86, 19, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 123, 19, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 79, 21, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 70, 14, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 70, 10, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 80, 8, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 143, 22, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 143, 18, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 136, 21, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 143, 14, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 143, 10, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 137, 8, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 144, 4, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 137, 5, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 371, 19, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 371, 11, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 371, 7, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 362, 4, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 372, 1, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 362, 1, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 282, 40, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 282, 36, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 291, 39, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 282, 32, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 282, 28, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 292, 26, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 283, 22, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 292, 23, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 342, 8, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 361, 10, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 298, 27, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 291, 32, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 350, 5, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 298, 37, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 309, 23, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 298, 20, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 342, 1, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 369, 149, textureX, textureY); // Box 2
		bodyModel[123] = new ModelRendererTurbo(this, 369, 152, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 74, 152, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 74, 149, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 101, 149, textureX, textureY); // Box 2
		bodyModel[127] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 169, 149, textureX, textureY); // Box 2
		bodyModel[129] = new ModelRendererTurbo(this, 169, 152, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 174, 149, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 176, 152, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 369, 138, textureX, textureY); // Box 28
		bodyModel[133] = new ModelRendererTurbo(this, 369, 141, textureX, textureY); // Box 29
		bodyModel[134] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[135] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[136] = new ModelRendererTurbo(this, 102, 138, textureX, textureY); // Box 32
		bodyModel[137] = new ModelRendererTurbo(this, 101, 141, textureX, textureY); // Box 33
		bodyModel[138] = new ModelRendererTurbo(this, 169, 138, textureX, textureY); // Box 36
		bodyModel[139] = new ModelRendererTurbo(this, 169, 141, textureX, textureY); // Box 37
		bodyModel[140] = new ModelRendererTurbo(this, 174, 138, textureX, textureY); // Box 38
		bodyModel[141] = new ModelRendererTurbo(this, 176, 141, textureX, textureY); // Box 39
		bodyModel[142] = new ModelRendererTurbo(this, 384, 149, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 384, 152, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 375, 149, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 377, 152, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 384, 138, textureX, textureY); // Box 24
		bodyModel[147] = new ModelRendererTurbo(this, 384, 141, textureX, textureY); // Box 25
		bodyModel[148] = new ModelRendererTurbo(this, 375, 138, textureX, textureY); // Box 26
		bodyModel[149] = new ModelRendererTurbo(this, 377, 141, textureX, textureY); // Box 27
		bodyModel[150] = new ModelRendererTurbo(this, 78, 109, textureX, textureY); // Box 2
		bodyModel[151] = new ModelRendererTurbo(this, 35, 131, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 179, 107, textureX, textureY, "cull"); // Box 2 floor cull
		bodyModel[153] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 305, 132, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 157, 105, textureX, textureY); // Box 2
		bodyModel[156] = new ModelRendererTurbo(this, 98, 106, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 98, 131, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 384, 242, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 188, 313, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 429, 283, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 179, 105, textureX, textureY, "cull"); // Box 2 step cull
		bodyModel[162] = new ModelRendererTurbo(this, 184, 285, textureX, textureY); // Box 2
		bodyModel[163] = new ModelRendererTurbo(this, 461, 244, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 44, 150, textureX, textureY); // Box 2 step
		bodyModel[165] = new ModelRendererTurbo(this, 43, 139, textureX, textureY, "cull"); // Box 2 step cull
		bodyModel[166] = new ModelRendererTurbo(this, 89, 108, textureX, textureY); // Box 69
		bodyModel[167] = new ModelRendererTurbo(this, 253, 149, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 251, 152, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 32
		bodyModel[170] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 33
		bodyModel[171] = new ModelRendererTurbo(this, 72, 57, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 169
		bodyModel[173] = new ModelRendererTurbo(this, 72, 208, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 177
		bodyModel[175] = new ModelRendererTurbo(this, 437, 174, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 448, 190, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 448, 168, textureX, textureY); // Box 176
		bodyModel[178] = new ModelRendererTurbo(this, 431, 196, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 72, 214, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 155, 57, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 155, 30, textureX, textureY); // Box 169
		bodyModel[182] = new ModelRendererTurbo(this, 234, 193, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 234, 187, textureX, textureY); // Box 177
		bodyModel[184] = new ModelRendererTurbo(this, 234, 199, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[185] = new ModelRendererTurbo(this, 234, 233, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 234, 239, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 234, 229, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 234, 219, textureX, textureY); // Box 192
		bodyModel[189] = new ModelRendererTurbo(this, 234, 225, textureX, textureY); // Box 193
		bodyModel[190] = new ModelRendererTurbo(this, 234, 215, textureX, textureY); // Box 194
		bodyModel[191] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 492, 23, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 460, 23, textureX, textureY); // Box 176
		bodyModel[194] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 72, 249, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 72, 255, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 72, 243, textureX, textureY); // Box 192
		bodyModel[198] = new ModelRendererTurbo(this, 72, 239, textureX, textureY); // Box 193
		bodyModel[199] = new ModelRendererTurbo(this, 72, 234, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 72, 230, textureX, textureY); // Box 194
		bodyModel[201] = new ModelRendererTurbo(this, 307, 286, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 223, 326, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[203] = new ModelRendererTurbo(this, 385, 236, textureX, textureY); // Box 2
		bodyModel[204] = new ModelRendererTurbo(this, 453, 236, textureX, textureY); // Box 2
		bodyModel[205] = new ModelRendererTurbo(this, 406, 236, textureX, textureY); // Box 2
		bodyModel[206] = new ModelRendererTurbo(this, 55, 105, textureX, textureY); // Box 2
		bodyModel[207] = new ModelRendererTurbo(this, 481, 242, textureX, textureY); // Box 2
		bodyModel[208] = new ModelRendererTurbo(this, 210, 217, textureX, textureY, "cull"); // Box 128 stare roof cull
		bodyModel[209] = new ModelRendererTurbo(this, 171, 319, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 164, 331, textureX, textureY); // Box 2
		bodyModel[211] = new ModelRendererTurbo(this, 460, 281, textureX, textureY); // Box 2
		bodyModel[212] = new ModelRendererTurbo(this, 480, 333, textureX, textureY); // Box 2
		bodyModel[213] = new ModelRendererTurbo(this, 482, 295, textureX, textureY); // Box 2
		bodyModel[214] = new ModelRendererTurbo(this, 482, 268, textureX, textureY); // Box 2
		bodyModel[215] = new ModelRendererTurbo(this, 487, 314, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 490, 307, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 491, 300, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 492, 293, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 493, 286, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 475, 311, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 475, 284, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 486, 316, textureX, textureY); // Box 0
		bodyModel[223] = new ModelRendererTurbo(this, 486, 289, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 487, 310, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 487, 283, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 475, 302, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 475, 275, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 487, 301, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 487, 274, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 478, 293, textureX, textureY); // Box 2
		bodyModel[231] = new ModelRendererTurbo(this, 478, 266, textureX, textureY); // Box 2
		bodyModel[232] = new ModelRendererTurbo(this, 481, 318, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 165, 317, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 289, 296, textureX, textureY); // Box 2
		bodyModel[235] = new ModelRendererTurbo(this, 368, 301, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 330, 281, textureX, textureY); // Box 2
		bodyModel[237] = new ModelRendererTurbo(this, 363, 290, textureX, textureY); // Box 2
		bodyModel[238] = new ModelRendererTurbo(this, 381, 295, textureX, textureY); // Box 2
		bodyModel[239] = new ModelRendererTurbo(this, 390, 287, textureX, textureY); // Box 2
		bodyModel[240] = new ModelRendererTurbo(this, 390, 303, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 390, 295, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 178, 185, textureX, textureY); // Box 2 step
		bodyModel[243] = new ModelRendererTurbo(this, 336, 286, textureX, textureY); // Box 340
		bodyModel[244] = new ModelRendererTurbo(this, 207, 291, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 207, 297, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[246] = new ModelRendererTurbo(this, 213, 288, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 278, 276, textureX, textureY); // Box 2
		bodyModel[248] = new ModelRendererTurbo(this, 334, 283, textureX, textureY); // Box 340
		bodyModel[249] = new ModelRendererTurbo(this, 399, 312, textureX, textureY); // Box 2
		bodyModel[250] = new ModelRendererTurbo(this, 261, 290, textureX, textureY); // Box 2
		bodyModel[251] = new ModelRendererTurbo(this, 117, 366, textureX, textureY); // Box 128
		bodyModel[252] = new ModelRendererTurbo(this, 110, 379, textureX, textureY); // Box 2
		bodyModel[253] = new ModelRendererTurbo(this, 111, 366, textureX, textureY); // Box 2
		bodyModel[254] = new ModelRendererTurbo(this, 428, 356, textureX, textureY); // Right seat part
		bodyModel[255] = new ModelRendererTurbo(this, 446, 343, textureX, textureY); // Right seat part
		bodyModel[256] = new ModelRendererTurbo(this, 447, 353, textureX, textureY); // Boc 42
		bodyModel[257] = new ModelRendererTurbo(this, 433, 350, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 433, 366, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 433, 363, textureX, textureY); // Right seat part
		bodyModel[260] = new ModelRendererTurbo(this, 428, 363, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 433, 347, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 428, 352, textureX, textureY); // Right seat part
		bodyModel[263] = new ModelRendererTurbo(this, 446, 363, textureX, textureY); // Right seat part
		bodyModel[264] = new ModelRendererTurbo(this, 446, 353, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 130, 368, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 292, 356, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 310, 343, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 311, 353, textureX, textureY); // Boc 42
		bodyModel[269] = new ModelRendererTurbo(this, 297, 350, textureX, textureY); // Right seat part
		bodyModel[270] = new ModelRendererTurbo(this, 297, 366, textureX, textureY); // Right seat part
		bodyModel[271] = new ModelRendererTurbo(this, 297, 363, textureX, textureY); // Right seat part
		bodyModel[272] = new ModelRendererTurbo(this, 292, 363, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 297, 347, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 292, 352, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 310, 363, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 310, 353, textureX, textureY); // Right seat part
		bodyModel[277] = new ModelRendererTurbo(this, 292, 386, textureX, textureY); // Right seat part
		bodyModel[278] = new ModelRendererTurbo(this, 310, 373, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 311, 383, textureX, textureY); // Boc 42
		bodyModel[280] = new ModelRendererTurbo(this, 297, 380, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 297, 396, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 297, 393, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 292, 393, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 292, 382, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 310, 393, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 310, 383, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 394, 356, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 412, 343, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 413, 353, textureX, textureY); // Boc 42
		bodyModel[291] = new ModelRendererTurbo(this, 399, 350, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 399, 363, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 394, 363, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 399, 347, textureX, textureY); // Right seat part
		bodyModel[295] = new ModelRendererTurbo(this, 394, 352, textureX, textureY); // Right seat part
		bodyModel[296] = new ModelRendererTurbo(this, 412, 353, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 399, 366, textureX, textureY); // Right seat part
		bodyModel[298] = new ModelRendererTurbo(this, 412, 363, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 392, 218, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 396, 229, textureX, textureY); // Box 2
		bodyModel[301] = new ModelRendererTurbo(this, 360, 356, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 378, 343, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 379, 353, textureX, textureY); // Boc 42
		bodyModel[304] = new ModelRendererTurbo(this, 365, 350, textureX, textureY); // Right seat part
		bodyModel[305] = new ModelRendererTurbo(this, 365, 363, textureX, textureY); // Right seat part
		bodyModel[306] = new ModelRendererTurbo(this, 360, 363, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 365, 347, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 360, 352, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 378, 353, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 365, 366, textureX, textureY); // Right seat part
		bodyModel[311] = new ModelRendererTurbo(this, 378, 363, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 326, 356, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 344, 343, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Boc 42
		bodyModel[315] = new ModelRendererTurbo(this, 331, 350, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 331, 363, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 326, 363, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 331, 347, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 326, 352, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 344, 353, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 331, 366, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 344, 363, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 394, 386, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 412, 373, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 413, 383, textureX, textureY); // Boc 42
		bodyModel[326] = new ModelRendererTurbo(this, 399, 380, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 399, 393, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 394, 393, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 399, 377, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 394, 382, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 412, 383, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 399, 396, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 412, 393, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 360, 386, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 378, 373, textureX, textureY); // Right seat part
		bodyModel[336] = new ModelRendererTurbo(this, 379, 383, textureX, textureY); // Boc 42
		bodyModel[337] = new ModelRendererTurbo(this, 365, 380, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 365, 393, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 360, 393, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 365, 377, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 360, 382, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 378, 383, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 365, 396, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 378, 393, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 326, 386, textureX, textureY); // Right seat part
		bodyModel[346] = new ModelRendererTurbo(this, 344, 373, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 345, 383, textureX, textureY); // Boc 42
		bodyModel[348] = new ModelRendererTurbo(this, 331, 380, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 331, 393, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 326, 393, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 331, 377, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 326, 382, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 344, 383, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 331, 396, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 344, 393, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 258, 356, textureX, textureY); // Right seat part
		bodyModel[357] = new ModelRendererTurbo(this, 276, 343, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 277, 353, textureX, textureY); // Boc 42
		bodyModel[359] = new ModelRendererTurbo(this, 263, 350, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 263, 366, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 263, 363, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 258, 363, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 263, 347, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 258, 352, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 276, 363, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 276, 353, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 258, 386, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 276, 373, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 277, 383, textureX, textureY); // Boc 42
		bodyModel[370] = new ModelRendererTurbo(this, 263, 380, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 263, 396, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 263, 393, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 258, 393, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 263, 377, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 258, 382, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 276, 393, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 276, 383, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 27, 334, textureX, textureY); // Box 2
		bodyModel[379] = new ModelRendererTurbo(this, 28, 321, textureX, textureY); // Box 2
		bodyModel[380] = new ModelRendererTurbo(this, 1, 323, textureX, textureY); // Box 128
		bodyModel[381] = new ModelRendererTurbo(this, 14, 321, textureX, textureY); // Box 128
		bodyModel[382] = new ModelRendererTurbo(this, 381, 226, textureX, textureY); // Box 2
		bodyModel[383] = new ModelRendererTurbo(this, 375, 235, textureX, textureY); // Box 2
		bodyModel[384] = new ModelRendererTurbo(this, 380, 216, textureX, textureY); // Box 896
		bodyModel[385] = new ModelRendererTurbo(this, 463, 226, textureX, textureY); // Box 2
		bodyModel[386] = new ModelRendererTurbo(this, 481, 232, textureX, textureY); // Box 896
		bodyModel[387] = new ModelRendererTurbo(this, 1, 259, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 144, 399, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 126, 401, textureX, textureY); // Conductor's desk
		bodyModel[390] = new ModelRendererTurbo(this, 149, 409, textureX, textureY); // Conductor's door
		bodyModel[391] = new ModelRendererTurbo(this, 127, 388, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 125, 409, textureX, textureY); // Conductor's seat
		bodyModel[393] = new ModelRendererTurbo(this, 110, 393, textureX, textureY); // Box 128
		bodyModel[394] = new ModelRendererTurbo(this, 156, 399, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 149, 399, textureX, textureY); // Box 38
		bodyModel[396] = new ModelRendererTurbo(this, 463, 309, textureX, textureY); // Box 2
		bodyModel[397] = new ModelRendererTurbo(this, 171, 311, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 110, 332, textureX, textureY); // Box 276
		bodyModel[399] = new ModelRendererTurbo(this, 108, 327, textureX, textureY); // Box 275
		bodyModel[400] = new ModelRendererTurbo(this, 134, 294, textureX, textureY); // Box 908
		bodyModel[401] = new ModelRendererTurbo(this, 132, 289, textureX, textureY); // Box 909
		bodyModel[402] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 275
		bodyModel[403] = new ModelRendererTurbo(this, 3, 398, textureX, textureY); // Box 276
		bodyModel[404] = new ModelRendererTurbo(this, 1, 364, textureX, textureY); // Box 920
		bodyModel[405] = new ModelRendererTurbo(this, 3, 369, textureX, textureY); // Box 921
		bodyModel[406] = new ModelRendererTurbo(this, 72, 388, textureX, textureY, "cull"); // Box 924 cull
		bodyModel[407] = new ModelRendererTurbo(this, 90, 359, textureX, textureY, "cull"); // Box 924 cull
		bodyModel[408] = new ModelRendererTurbo(this, 1, 372, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[409] = new ModelRendererTurbo(this, 3, 401, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[410] = new ModelRendererTurbo(this, 101, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[411] = new ModelRendererTurbo(this, 97, 335, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[412] = new ModelRendererTurbo(this, 85, 263, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[413] = new ModelRendererTurbo(this, 36, 343, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[414] = new ModelRendererTurbo(this, 45, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[415] = new ModelRendererTurbo(this, 1, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[416] = new ModelRendererTurbo(this, 49, 348, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[417] = new ModelRendererTurbo(this, 150, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[418] = new ModelRendererTurbo(this, 128, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[419] = new ModelRendererTurbo(this, 139, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[420] = new ModelRendererTurbo(this, 172, 227, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[421] = new ModelRendererTurbo(this, 172, 236, textureX, textureY,"lamp"); // Box 950 glow
		bodyModel[422] = new ModelRendererTurbo(this, 169, 230, textureX, textureY); // Box 950
		bodyModel[423] = new ModelRendererTurbo(this, 108, 10, textureX, textureY); // Box 950
		bodyModel[424] = new ModelRendererTurbo(this, 319, 21, textureX, textureY); // Box 950
		bodyModel[425] = new ModelRendererTurbo(this, 370, 156, textureX, textureY); // Box 2
		bodyModel[426] = new ModelRendererTurbo(this, 318, 156, textureX, textureY); // Box 2
		bodyModel[427] = new ModelRendererTurbo(this, 326, 149, textureX, textureY); // Box 2 cull test
		bodyModel[428] = new ModelRendererTurbo(this, 324, 152, textureX, textureY); // Box 2 cull test
		bodyModel[429] = new ModelRendererTurbo(this, 370, 145, textureX, textureY); // Box 29
		bodyModel[430] = new ModelRendererTurbo(this, 318, 145, textureX, textureY); // Box 35
		bodyModel[431] = new ModelRendererTurbo(this, 326, 138, textureX, textureY); // Box 41 cull test
		bodyModel[432] = new ModelRendererTurbo(this, 324, 141, textureX, textureY); // Box 39 cull test
		bodyModel[433] = new ModelRendererTurbo(this, 122, 156, textureX, textureY); // Box 2
		bodyModel[434] = new ModelRendererTurbo(this, 122, 145, textureX, textureY); // Box 33
		bodyModel[435] = new ModelRendererTurbo(this, 174, 156, textureX, textureY); // Box 2
		bodyModel[436] = new ModelRendererTurbo(this, 174, 145, textureX, textureY); // Box 37
		bodyModel[437] = new ModelRendererTurbo(this, 110, 149, textureX, textureY); // Box 2 cull test
		bodyModel[438] = new ModelRendererTurbo(this, 110, 138, textureX, textureY); // Box 41 cull test
		bodyModel[439] = new ModelRendererTurbo(this, 108, 152, textureX, textureY); // Box 2 cull test
		bodyModel[440] = new ModelRendererTurbo(this, 108, 141, textureX, textureY); // Box 39 cull test
		bodyModel[441] = new ModelRendererTurbo(this, 154, 149, textureX, textureY); // Box 2
		bodyModel[442] = new ModelRendererTurbo(this, 153, 152, textureX, textureY); // Box 2
		bodyModel[443] = new ModelRendererTurbo(this, 154, 138, textureX, textureY); // Box 36
		bodyModel[444] = new ModelRendererTurbo(this, 153, 141, textureX, textureY); // Box 37
		bodyModel[445] = new ModelRendererTurbo(this, 160, 149, textureX, textureY); // Box 2
		bodyModel[446] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 2
		bodyModel[447] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 160, 141, textureX, textureY); // Box 39
		bodyModel[449] = new ModelRendererTurbo(this, 318, 149, textureX, textureY); // Box 2
		bodyModel[450] = new ModelRendererTurbo(this, 317, 152, textureX, textureY); // Box 2
		bodyModel[451] = new ModelRendererTurbo(this, 318, 138, textureX, textureY); // Box 32
		bodyModel[452] = new ModelRendererTurbo(this, 317, 141, textureX, textureY); // Box 33
		bodyModel[453] = new ModelRendererTurbo(this, 258, 149, textureX, textureY); // Box 2
		bodyModel[454] = new ModelRendererTurbo(this, 258, 152, textureX, textureY); // Box 2
		bodyModel[455] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 258, 141, textureX, textureY); // Box 39
		bodyModel[457] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[459] = new ModelRendererTurbo(this, 412, 2, textureX, textureY); // Box 128
		bodyModel[460] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[471] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[472] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 393, 63, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 388, 89, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 388, 69, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 395, 55, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 396, 58, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 404, 58, textureX, textureY); // Box 1004
		bodyModel[479] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[480] = new ModelRendererTurbo(this, 443, 16, textureX, textureY); // Box 153
		bodyModel[481] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[483] = new ModelRendererTurbo(this, 404, 138, textureX, textureY); // Box 2
		bodyModel[484] = new ModelRendererTurbo(this, 404, 151, textureX, textureY); // Box 192
		bodyModel[485] = new ModelRendererTurbo(this, 389, 138, textureX, textureY); // Box 2
		bodyModel[486] = new ModelRendererTurbo(this, 389, 150, textureX, textureY); // Box 191
		bodyModel[487] = new ModelRendererTurbo(this, 29, 151, textureX, textureY); // Box 2
		bodyModel[488] = new ModelRendererTurbo(this, 24, 152, textureX, textureY); // Box 2
		bodyModel[489] = new ModelRendererTurbo(this, 29, 139, textureX, textureY); // Box 191
		bodyModel[490] = new ModelRendererTurbo(this, 24, 139, textureX, textureY); // Box 192
		bodyModel[491] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 2
		bodyModel[492] = new ModelRendererTurbo(this, 393, 77, textureX, textureY); // Box 1020
		bodyModel[493] = new ModelRendererTurbo(this, 50, 65, textureX, textureY); // Box 128
		bodyModel[494] = new ModelRendererTurbo(this, 45, 89, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 52, 57, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 61, 60, textureX, textureY); // Box 128
		bodyModel[498] = new ModelRendererTurbo(this, 53, 60, textureX, textureY); // Box 1004
		bodyModel[499] = new ModelRendererTurbo(this, 48, 99, textureX, textureY); // Box 2

		bodyModel[0].addBox(0F, 0F, 0F, 35, 2, 22, 0F); // Box 2 floor cull
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F); // Box 2
		bodyModel[3].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[4].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 53, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(3.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(43F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-45F, 4F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[10].setRotationPoint(6.5F, 3F, 4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[11].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[11].rotateAngleX = -0.78539816F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[12].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[13].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 38
		bodyModel[14].setRotationPoint(19.25F, 5F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -0.875F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.875F, 0F); // Box 38
		bodyModel[15].setRotationPoint(17.25F, 5F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[16].setRotationPoint(18.25F, 5F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.75F, 0F, -0.25F, -1.375F, 0F, -0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[17].setRotationPoint(22.25F, 4.75F, 8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[18].setRotationPoint(18.55F, 5.2F, 4.5F);
		bodyModel[18].rotateAngleZ = -0.78539816F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[19].setRotationPoint(21.75F, 5.2F, 4.5F);
		bodyModel[19].rotateAngleZ = -0.78539816F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[20].setRotationPoint(18.05F, 3F, 8.51F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[21].setRotationPoint(18.05F, 3F, 4.49F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[22].setRotationPoint(21.25F, 3F, 8.51F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[23].setRotationPoint(21.25F, 3F, 4.49F);

		bodyModel[24].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[24].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[25].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[26].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[26].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[27].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[27].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[28].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[29].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[30].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[31].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[32].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[33].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[34].addShapeBox(0F, 0F, -1F, 5, 15, 1, 0F,0F, 0F, -0.5F, -1.02F, 0F, -0.5F, -1.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.02F, 0F, -0.5F, -1.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[34].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[35].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[36].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[37].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[38].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[39].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[40].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[41].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[42].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[43].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[44].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[45].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[46].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[47].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[48].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[49].setRotationPoint(55.51F, -14F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[50].setRotationPoint(-61.49F, -14F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 34, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[51].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[53].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[54].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[55].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 27, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[56].setRotationPoint(-25.5F, -25F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 128
		bodyModel[57].setRotationPoint(-26.5F, -24F, -3F);

		bodyModel[58].addBox(0F, 0F, 0F, 27, 4, 1, 0F); // Box 38
		bodyModel[58].setRotationPoint(-25.5F, -19F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 27, 4, 1, 0F); // Box 128
		bodyModel[59].setRotationPoint(-25.5F, -19F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-25.5F, -23F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-25.5F, -24F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[62].setRotationPoint(-25.5F, -24F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[63].setRotationPoint(-25.5F, -23F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-25.5F, -24F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-25.5F, -24F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 58, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128 cull
		bodyModel[66].setRotationPoint(3.5F, -20F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(3.5F, -20F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[68].setRotationPoint(3.5F, -20F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 58, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[69].setRotationPoint(3.5F, -16F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 58, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[70].setRotationPoint(3.5F, -16F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(1.5F, -24F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 2F, 1F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-26.5F, -24F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(-26.5F, -23F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(-26.5F, -24F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-26.5F, -23F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[76].setRotationPoint(-26.5F, -25F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.375F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-26.5F, -24F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.375F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-26.5F, -24F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(-28.5F, -17F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-28.5F, -17F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-28.5F, -20F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-28.5F, -20F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(-28.5F, -19F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F); // Box 128
		bodyModel[84].setRotationPoint(-28.5F, -19F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 128
		bodyModel[85].setRotationPoint(-28.5F, -19F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 2F, 0F, 0F, 2F, 0.375F, 0F, -2.25F, -1.375F, 0F, -2.25F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.34F, 0F, -0.67F, 0F, 0F, -1F); // Box 128
		bodyModel[86].setRotationPoint(-27.5F, -23F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -1.375F, 0F, -2.25F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6675F, 0F, -0.6675F); // Box 128
		bodyModel[87].setRotationPoint(-27.5F, -23F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.375F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.25F); // Box 128
		bodyModel[88].setRotationPoint(-26.5F, -24F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[89].setRotationPoint(-28.5F, -17F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-28.5F, -17F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(-28.5F, -19F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-28.5F, -19F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, -1F, -3F, -0.25F, -1F, -3F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-28.5F, -19F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1.375F, 0F, -2.25F, 0.375F, 0F, -2.25F, 0F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, -1F, -0.34F, 0F, -0.67F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-27.5F, -23F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1.375F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F, -0.6675F, 0F, -0.6675F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-27.5F, -23F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-26.5F, -24F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(1.5F, -17F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(1.5F, -17F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(3.5F, -19F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, 0F); // Box 128
		bodyModel[100].setRotationPoint(1.5F, -19F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -3F, -0.25F, -1F); // Box 128
		bodyModel[101].setRotationPoint(1.5F, -19F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 2F, -1.375F, 0F, -2.25F, 0.375F, 0F, -2.25F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.34F, 0F, -0.67F); // Box 128
		bodyModel[102].setRotationPoint(2.5F, -23F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 2F, -1.375F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.6675F, 0F, -0.6675F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(1.5F, -23F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(1.5F, -24F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(1.5F, -17F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(1.5F, -17F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(3.5F, -19F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(1.5F, -19F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F); // Box 128
		bodyModel[109].setRotationPoint(1.5F, -19F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.375F, 0F, -2.25F, -1.375F, 0F, -2.25F, -1F, 0F, 2F, 0F, 0F, 2F, -0.34F, 0F, -0.67F, 0F, 0F, -1F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(2.5F, -23F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -2F, -1.375F, 0F, -2.25F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.6675F, 0F, -0.6675F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(1.5F, -23F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.375F, 0F, -1F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(1.5F, -24F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 128
		bodyModel[113].setRotationPoint(1.5F, -24F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(1.5F, -23F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(1.5F, -24F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(1.5F, -23F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 128
		bodyModel[117].setRotationPoint(3.5F, -20F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(3.5F, -20F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[119].setRotationPoint(1.5F, -25F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[120].setRotationPoint(1.5F, -24F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, -0.375F, 1F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(1.5F, -24F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[122].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[123].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[124].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[125].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[126].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[127].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[128].setRotationPoint(-32.75F, 3F, 10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[129].setRotationPoint(-32F, 4F, 10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[130].setRotationPoint(-31.5F, 3F, 10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[131].setRotationPoint(-30.5F, 4F, 10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[132].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[133].setRotationPoint(53F, 4F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[134].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[135].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[136].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[137].setRotationPoint(-55F, 4F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[138].setRotationPoint(-32.75F, 3F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[139].setRotationPoint(-32F, 4F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[140].setRotationPoint(-31.5F, 3F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[141].setRotationPoint(-30.5F, 4F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[142].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[143].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[144].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[145].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[146].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[147].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[148].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[149].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 29, 1, 20, 0F); // Box 2
		bodyModel[150].setRotationPoint(-26.5F, 5F, -10F);

		bodyModel[151].addBox(0F, 0F, 0F, 29, 1, 4, 0F); // Box 2
		bodyModel[151].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 54, 2, 22, 0F); // Box 2 floor cull
		bodyModel[152].setRotationPoint(2.5F, 1F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 29, 2, 1, 0F); // Box 2
		bodyModel[153].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 29, 2, 1, 0F); // Box 2
		bodyModel[154].setRotationPoint(-26.5F, 1F, 10F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 2
		bodyModel[155].setRotationPoint(2.5F, 3F, -10F);

		bodyModel[156].addBox(0F, 0F, 0F, 29, 2, 0, 0F); // Box 2
		bodyModel[156].setRotationPoint(-26.5F, 3F, -10F);

		bodyModel[157].addBox(0F, 0F, 0F, 29, 2, 0, 0F); // Box 2
		bodyModel[157].setRotationPoint(-26.5F, 3F, 10F);

		bodyModel[158].addBox(0F, 0F, 0F, 29, 1, 16, 0F); // Box 2
		bodyModel[158].setRotationPoint(-26.5F, -10F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 2
		bodyModel[159].setRotationPoint(-27.5F, -12F, -6F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 11, 16, 0F); // Box 2
		bodyModel[160].setRotationPoint(2.5F, -10F, -6F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 2 step cull
		bodyModel[161].setRotationPoint(2.5F, 1F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 2
		bodyModel[162].setRotationPoint(-27.5F, -18F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 2
		bodyModel[163].setRotationPoint(2.5F, -18F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 2 step
		bodyModel[164].setRotationPoint(-31.5F, 3F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 step cull
		bodyModel[165].setRotationPoint(-31.5F, 1F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 69
		bodyModel[166].setRotationPoint(-27.5F, 1F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[167].setRotationPoint(6.75F, 3F, 10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[168].setRotationPoint(5F, 4F, 10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[169].setRotationPoint(6.75F, 3F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[170].setRotationPoint(5F, 4F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[172].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[173].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[174].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[175].setRotationPoint(44.5F, -17F, -7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[176].setRotationPoint(44.5F, -18F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[177].setRotationPoint(44.5F, -18F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 17, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[178].setRotationPoint(44.5F, -16.25F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 34, 1, 14, 0F); // Box 128
		bodyModel[179].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(3.5F, -19F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[181].setRotationPoint(3.5F, -19F, 7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[182].setRotationPoint(3.5F, -19F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[183].setRotationPoint(3.5F, -19F, 3F);

		bodyModel[184].addBox(0F, 0F, 0F, 58, 1, 14, 0F); // Box 128 cull
		bodyModel[184].setRotationPoint(3.5F, -18F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[185].setRotationPoint(3.5F, -17F, -9.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -1.25F, 0F, 1.275F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, -1.25F); // Box 128
		bodyModel[186].setRotationPoint(3.5F, -16F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[187].setRotationPoint(3.5F, -18F, -9.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[188].setRotationPoint(3.5F, -17F, 5.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		bodyModel[189].setRotationPoint(3.5F, -16F, 9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[190].setRotationPoint(3.5F, -18F, 7.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[191].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[192].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[193].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[194].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[195].setRotationPoint(-60.5F, -17F, -9.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -1.25F, 0F, 1.275F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, -1.25F); // Box 128
		bodyModel[196].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[197].setRotationPoint(-60.5F, -17F, 5.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		bodyModel[198].setRotationPoint(-60.5F, -16F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[199].setRotationPoint(-60.5F, -18F, -9.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[200].setRotationPoint(-60.5F, -18F, 7.25F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 2
		bodyModel[201].setRotationPoint(-9.5F, -9F, 0F);

		bodyModel[202].addBox(0F, 0F, 0F, 24, 14, 1, 0F); // Box 2 cull
		bodyModel[202].setRotationPoint(-26.5F, -9F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[203].setRotationPoint(-27.5F, -12F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[204].setRotationPoint(-2.5F, -12F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 2
		bodyModel[205].setRotationPoint(-21.5F, -12F, -10F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 2
		bodyModel[206].setRotationPoint(-27.5F, 3F, -10F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 2
		bodyModel[207].setRotationPoint(2.5F, -18F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 stare roof cull
		bodyModel[208].setRotationPoint(3.5F, -20F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F); // Box 2
		bodyModel[209].setRotationPoint(-32.5F, -15F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F); // Box 2
		bodyModel[210].setRotationPoint(-32.5F, -6F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[211].setRotationPoint(9.5F, -17F, -10F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[212].setRotationPoint(11.5F, -5F, -5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[213].setRotationPoint(2.5F, -15F, -3F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[214].setRotationPoint(2.5F, -15F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[215].setRotationPoint(3F, -1F, -2.94F);
		bodyModel[215].rotateAngleY = -0.16580628F;

		bodyModel[216].addBox(0F, -2F, 1F, 4, 2, 4, 0F); // Box 0
		bodyModel[216].setRotationPoint(3F, -1F, -2.94F);
		bodyModel[216].rotateAngleY = -0.16580628F;

		bodyModel[217].addShapeBox(0F, -4F, 1F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[217].setRotationPoint(3F, -0.75F, -2.94F);
		bodyModel[217].rotateAngleY = -0.16580628F;

		bodyModel[218].addShapeBox(0F, -6F, 1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[218].setRotationPoint(3F, -0.5F, -2.94F);
		bodyModel[218].rotateAngleY = -0.16580628F;

		bodyModel[219].addShapeBox(0F, -8F, 1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 0
		bodyModel[219].setRotationPoint(3F, -0.25F, -2.94F);
		bodyModel[219].rotateAngleY = -0.16580628F;

		bodyModel[220].addShapeBox(0F, -6F, 0F, 4, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 0
		bodyModel[220].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[220].rotateAngleY = -0.16580628F;

		bodyModel[221].addShapeBox(0F, -6F, 5F, 4, 7, 1, 0F,0.5F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F, 0.5F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[221].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[221].rotateAngleY = -0.16580628F;

		bodyModel[222].addBox(4F, -3F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[222].setRotationPoint(3F, 0F, -2.94F);
		bodyModel[222].rotateAngleY = -0.16580628F;

		bodyModel[223].addBox(4F, -3F, 5F, 1, 2, 1, 0F); // Box 0
		bodyModel[223].setRotationPoint(3F, 0F, -2.94F);
		bodyModel[223].rotateAngleY = -0.16580628F;

		bodyModel[224].addBox(4F, -6F, 0.5F, 1, 5, 0, 0F); // Box 0
		bodyModel[224].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[224].rotateAngleY = -0.16580628F;

		bodyModel[225].addBox(4F, -6F, 5.5F, 1, 5, 0, 0F); // Box 0
		bodyModel[225].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[225].rotateAngleY = -0.16580628F;

		bodyModel[226].addShapeBox(0F, -12F, 0F, 4, 7, 1, 0F,-0.5F, 0F, -0.01F, -3.5F, 0F, -0.01F, -3.66F, 0F, 0.01F, -0.34F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 0
		bodyModel[226].setRotationPoint(3F, -3F, -2.94F);
		bodyModel[226].rotateAngleY = -0.16580628F;

		bodyModel[227].addShapeBox(0F, -12F, 5F, 4, 7, 1, 0F,0.32F, 0F, 0.04F, -4.32F, 0F, 0.04F, -4.49F, 0F, -0.06F, 0.49F, 0F, -0.06F, 0.325F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[227].setRotationPoint(3F, -3F, -2.94F);
		bodyModel[227].rotateAngleY = -0.16580628F;

		bodyModel[228].addShapeBox(0.5F, -13F, 0.5F, 1, 8, 0, 0F,0.075F, -1F, 0.01F, -1.075F, 0F, 0.01F, -1.075F, 0F, -0.01F, 0.075F, -1F, -0.01F, -3.5F, 0F, 0.03F, 3.5F, 0F, 0.03F, 3.5F, 0F, -0.03F, -3.5F, 0F, -0.03F); // Box 0
		bodyModel[228].setRotationPoint(3F, -3F, -2.91F);
		bodyModel[228].rotateAngleY = -0.16580628F;

		bodyModel[229].addShapeBox(-0.5F, -13F, 5.5F, 1, 8, 0, 0F,-0.085F, -1F, 0F, -0.915F, 0F, 0F, -0.915F, 0F, 0F, -0.085F, -1F, 0F, -4.5F, 0F, -0.06F, 4.5F, 0F, -0.06F, 4.5F, 0F, 0.06F, -4.5F, 0F, 0.06F); // Box 0
		bodyModel[229].setRotationPoint(3F, -3F, -3F);
		bodyModel[229].rotateAngleY = -0.16580628F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[230].setRotationPoint(2.5F, -16F, -2.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[231].setRotationPoint(2.5F, -16F, 2.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 2
		bodyModel[232].setRotationPoint(12F, -17F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[233].setRotationPoint(-32F, -17F, -5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 2
		bodyModel[234].setRotationPoint(-13.5F, -9F, -5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 14, 10, 0F); // Box 2
		bodyModel[235].setRotationPoint(-1.5F, -9F, 0F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 2
		bodyModel[236].setRotationPoint(-5.5F, -9F, -5F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 2
		bodyModel[237].setRotationPoint(-2.5F, -9F, -6F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 2
		bodyModel[238].setRotationPoint(-0.5F, -9F, 0F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[239].setRotationPoint(-1.5F, -7F, -6F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[240].setRotationPoint(-1.5F, 1F, -6F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[241].setRotationPoint(-1.5F, -3F, -6F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 2 step
		bodyModel[242].setRotationPoint(1.5F, 3F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[243].setRotationPoint(-4F, -2F, 8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[244].setRotationPoint(-24.5F, 1F, -4.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[245].setRotationPoint(-24.5F, 2F, -4.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[246].setRotationPoint(-24.5F, -1F, -4.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 2
		bodyModel[247].setRotationPoint(-12.5F, -1F, -5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[248].setRotationPoint(-4.5F, -1.99F, 8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[249].setRotationPoint(0.5F, -1F, 1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[250].setRotationPoint(-16.75F, -9F, -5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 128
		bodyModel[251].setRotationPoint(50.5F, -15F, 5F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[252].setRotationPoint(50.5F, -5F, 3F);

		bodyModel[253].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 2
		bodyModel[253].setRotationPoint(51F, -15F, 3F);

		bodyModel[254].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[254].setRotationPoint(9F, -3F, 7F);

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[255].setRotationPoint(9F, -8F, 7F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[256].setRotationPoint(10.5F, -1F, 9F);
		bodyModel[256].rotateAngleY = 3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[257].setRotationPoint(9F, -3F, 7F);

		bodyModel[258].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[258].setRotationPoint(9F, -3F, 7F);

		bodyModel[259].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[259].setRotationPoint(9F, -5F, 7F);

		bodyModel[260].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[260].setRotationPoint(9F, -4.5F, 7F);

		bodyModel[261].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(9F, -5F, 7F);

		bodyModel[262].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[262].setRotationPoint(9F, -4.5F, 7F);

		bodyModel[263].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[263].setRotationPoint(9F, -4.1F, 7F);

		bodyModel[264].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(9F, -4.1F, 7F);

		bodyModel[265].addBox(0F, 0F, 0F, 4, 16, 3, 0F); // Box 128
		bodyModel[265].setRotationPoint(51.5F, -15F, 7F);

		bodyModel[266].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[266].setRotationPoint(-34F, -3F, 7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[267].setRotationPoint(-34F, -8F, 7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[268].setRotationPoint(-35.5F, -1F, 5F);

		bodyModel[269].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[269].setRotationPoint(-34F, -3F, 7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[270].setRotationPoint(-34F, -3F, 7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[271].setRotationPoint(-34F, -5F, 7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[272].setRotationPoint(-34F, -4.5F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[273].setRotationPoint(-34F, -5F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[274].setRotationPoint(-34F, -4.5F, 7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[275].setRotationPoint(-34F, -4.1F, 7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[276].setRotationPoint(-34F, -4.1F, 7F);
		bodyModel[276].rotateAngleY = -3.14159265F;

		bodyModel[277].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[277].setRotationPoint(-38F, -3F, -7F);
		bodyModel[277].rotateAngleY = -3.14159265F;

		bodyModel[278].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-38F, -8F, -7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[279].setRotationPoint(-39.5F, -1F, -9F);

		bodyModel[280].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[280].setRotationPoint(-38F, -3F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-38F, -3F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-38F, -5F, -7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[283].setRotationPoint(-38F, -4.5F, -7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(-38F, -5F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[285].setRotationPoint(-38F, -4.5F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[286].setRotationPoint(-38F, -4.1F, -7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(-38F, -4.1F, -7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[288].setRotationPoint(-2F, -16F, 6F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(-2F, -21F, 6F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[290].setRotationPoint(-3.5F, -14F, 4F);

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(-2F, -16F, 6F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[292].setRotationPoint(-2F, -18F, 6F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[293].setRotationPoint(-2F, -17.5F, 6F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[294].setRotationPoint(-2F, -18F, 6F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[295].setRotationPoint(-2F, -17.5F, 6F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-2F, -17.1F, 6F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[297].setRotationPoint(-2F, -16F, 6F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[298].setRotationPoint(-2F, -17.1F, 6F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addBox(0F, 0F, 0F, 29, 2, 8, 0F); // Box 2
		bodyModel[299].setRotationPoint(-26.5F, -12F, 2F);

		bodyModel[300].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 2
		bodyModel[300].setRotationPoint(-26.5F, -12F, -6F);

		bodyModel[301].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-11F, -16F, 6F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[302].setRotationPoint(-11F, -21F, 6F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[303].setRotationPoint(-12.5F, -14F, 4F);

		bodyModel[304].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[304].setRotationPoint(-11F, -16F, 6F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[305].setRotationPoint(-11F, -18F, 6F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[306].setRotationPoint(-11F, -17.5F, 6F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-11F, -18F, 6F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[308].setRotationPoint(-11F, -17.5F, 6F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(-11F, -17.1F, 6F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[310].setRotationPoint(-11F, -16F, 6F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(-11F, -17.1F, 6F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[312].setRotationPoint(-20F, -16F, 6F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(-20F, -21F, 6F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[314].setRotationPoint(-21.5F, -14F, 4F);

		bodyModel[315].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(-20F, -16F, 6F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(-20F, -18F, 6F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[317].setRotationPoint(-20F, -17.5F, 6F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[318].setRotationPoint(-20F, -18F, 6F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[319].setRotationPoint(-20F, -17.5F, 6F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-20F, -17.1F, 6F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(-20F, -16F, 6F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[322].setRotationPoint(-20F, -17.1F, 6F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[323].setRotationPoint(-2F, -16F, -6F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[324].setRotationPoint(-2F, -21F, -6F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[325].setRotationPoint(-3.5F, -14F, -8F);

		bodyModel[326].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[326].setRotationPoint(-2F, -16F, -6F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(-2F, -18F, -6F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[328].setRotationPoint(-2F, -17.5F, -6F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(-2F, -18F, -6F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[330].setRotationPoint(-2F, -17.5F, -6F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(-2F, -17.1F, -6F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[332].setRotationPoint(-2F, -16F, -6F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(-2F, -17.1F, -6F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[334].setRotationPoint(-11F, -16F, -6F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[335].setRotationPoint(-11F, -21F, -6F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[336].setRotationPoint(-12.5F, -14F, -8F);

		bodyModel[337].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[337].setRotationPoint(-11F, -16F, -6F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-11F, -18F, -6F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[339].setRotationPoint(-11F, -17.5F, -6F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[340].setRotationPoint(-11F, -18F, -6F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[341].setRotationPoint(-11F, -17.5F, -6F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[342].setRotationPoint(-11F, -17.1F, -6F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-11F, -16F, -6F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[344].setRotationPoint(-11F, -17.1F, -6F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[345].setRotationPoint(-20F, -16F, -6F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[346].setRotationPoint(-20F, -21F, -6F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[347].setRotationPoint(-21.5F, -14F, -8F);

		bodyModel[348].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[348].setRotationPoint(-20F, -16F, -6F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(-20F, -18F, -6F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[350].setRotationPoint(-20F, -17.5F, -6F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[351].setRotationPoint(-20F, -18F, -6F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[352].setRotationPoint(-20F, -17.5F, -6F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[353].setRotationPoint(-20F, -17.1F, -6F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[354].setRotationPoint(-20F, -16F, -6F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[355].setRotationPoint(-20F, -17.1F, -6F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[356].setRotationPoint(-45F, -3F, 7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[357].setRotationPoint(-45F, -8F, 7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[358].setRotationPoint(-46.5F, -1F, 5F);

		bodyModel[359].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[359].setRotationPoint(-45F, -3F, 7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[360].setRotationPoint(-45F, -3F, 7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(-45F, -5F, 7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[362].setRotationPoint(-45F, -4.5F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-45F, -5F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[364].setRotationPoint(-45F, -4.5F, 7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[365].setRotationPoint(-45F, -4.1F, 7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(-45F, -4.1F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[367].setRotationPoint(-49F, -3F, -7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(-49F, -8F, -7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[369].setRotationPoint(-50.5F, -1F, -9F);

		bodyModel[370].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[370].setRotationPoint(-49F, -3F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(-49F, -3F, -7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[372].setRotationPoint(-49F, -5F, -7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[373].setRotationPoint(-49F, -4.5F, -7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(-49F, -5F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[375].setRotationPoint(-49F, -4.5F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[376].setRotationPoint(-49F, -4.1F, -7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(-49F, -4.1F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[378].setRotationPoint(-57.5F, -5F, -5F);

		bodyModel[379].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 2
		bodyModel[379].setRotationPoint(-57F, -15F, -5F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 128
		bodyModel[380].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 128
		bodyModel[381].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[382].setRotationPoint(-27.5F, -20F, -3F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.15F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[383].setRotationPoint(-27.5F, -20F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0.15F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 896
		bodyModel[384].setRotationPoint(-27.5F, -20F, 3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1.7F, 0F, 0.15F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[385].setRotationPoint(2.5F, -20F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 896
		bodyModel[386].setRotationPoint(2.5F, -20F, 3F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[387].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[388].setRotationPoint(50.5F, -15F, -4F);

		bodyModel[389].addShapeBox(-2F, -1F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Conductor's desk
		bodyModel[389].setRotationPoint(55.5F, -4F, -10F);

		bodyModel[390].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Conductor's door
		bodyModel[390].setRotationPoint(51.5F, -5F, -2.99F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[391].setRotationPoint(54.5F, -15F, -10F);

		bodyModel[392].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F); // Conductor's seat
		bodyModel[392].setRotationPoint(50.5F, -2F, -10F);
		bodyModel[392].rotateAngleZ = -1.57079633F;

		bodyModel[393].addBox(0F, 0F, 0F, 0, 16, 7, 0F); // Box 128
		bodyModel[393].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[394].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[394].setRotationPoint(53.5F, -15F, -4F);

		bodyModel[395].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[395].setRotationPoint(51.5F, -15F, -4F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, -0.35F, 0F, 0F, 0F); // Box 2
		bodyModel[396].setRotationPoint(3.5F, -5F, -6F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[397].setRotationPoint(-32.5F, -17F, -10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[398].setRotationPoint(-56.5F, -13F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[399].setRotationPoint(-56.5F, -14F, -10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyModel[400].setRotationPoint(-56.5F, -13F, 9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[401].setRotationPoint(-56.5F, -14F, 7F);

		bodyModel[402].addBox(0F, 0F, 0F, 38, 1, 3, 0F); // Box 275
		bodyModel[402].setRotationPoint(12.5F, -14F, -10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[403].setRotationPoint(12.5F, -13F, -10F);

		bodyModel[404].addBox(0F, 0F, 0F, 47, 1, 3, 0F); // Box 920
		bodyModel[404].setRotationPoint(3.5F, -14F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[405].setRotationPoint(3.5F, -13F, 9F);

		bodyModel[406].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 924 cull
		bodyModel[406].setRotationPoint(44.5F, -15F, -10F);

		bodyModel[407].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 924 cull
		bodyModel[407].setRotationPoint(44.5F, -15F, 7F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 47, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[408].setRotationPoint(3.5F, -12.99F, 7F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 38, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[409].setRotationPoint(12.5F, -12.99F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 29, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[410].setRotationPoint(-56.5F, -12.99F, 7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 24, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[411].setRotationPoint(-56.5F, -12.99F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 5, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[412].setRotationPoint(-60.5F, -14.99F, -10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 11, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[413].setRotationPoint(44.5F, -14.99F, -10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[414].setRotationPoint(34F, -17F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[415].setRotationPoint(10F, -17F, -0.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[416].setRotationPoint(46F, -15F, -0.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[417].setRotationPoint(-36F, -17F, -0.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[418].setRotationPoint(-50F, -17F, -0.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[419].setRotationPoint(-43F, -17F, -0.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 38 glow
		bodyModel[420].setRotationPoint(-25.5F, -24F, -3F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F); // Box 950 glow
		bodyModel[421].setRotationPoint(-25.5F, -24F, 2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 950
		bodyModel[422].setRotationPoint(-25.5F, -24F, -2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.245F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.245F, 0F, 0F, 0.005F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.005F, -0.5F, 0F); // Box 950
		bodyModel[423].setRotationPoint(-26.75F, -24F, -2F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.245F, 0F, 0F, -0.245F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 950
		bodyModel[424].setRotationPoint(1.75F, -24F, -2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[425].setRotationPoint(52.5F, 4F, 10.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[426].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[427].setRotationPoint(34.5F, 3F, 10.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[428].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 29
		bodyModel[429].setRotationPoint(52.5F, 4F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[430].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[431].setRotationPoint(34.5F, 3F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[432].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[433].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[434].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[435].setRotationPoint(-35.5F, 4F, 10.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 37
		bodyModel[436].setRotationPoint(-35.5F, 4F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[437].setRotationPoint(-53.5F, 3F, 10.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[438].setRotationPoint(-53.5F, 3F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[439].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[440].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[441].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[442].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[443].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[444].setRotationPoint(-35F, 4F, -11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[445].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[446].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[447].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[448].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[449].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[450].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[451].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[452].setRotationPoint(33F, 4F, -11F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[453].setRotationPoint(6.5F, 3F, 10.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[454].setRotationPoint(5.5F, 4F, 10.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[455].setRotationPoint(6.5F, 3F, -11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[456].setRotationPoint(5.5F, 4F, -11F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[457].setRotationPoint(62.5F, -15F, -4F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[458].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[459].setRotationPoint(62.5F, -14F, -4F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[460].setRotationPoint(62.5F, -14F, 3F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(63F, -14F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[462].setRotationPoint(63F, -14F, 3F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[463].setRotationPoint(63F, 1F, -5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[464].setRotationPoint(63F, -15F, -5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[465].setRotationPoint(-63F, -15F, -4F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[466].setRotationPoint(-63F, 1F, -4F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[467].setRotationPoint(-63F, -14F, -4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[468].setRotationPoint(-63F, -14F, 3F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[469].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[470].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[471].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[472].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(61.5F, -19F, -4F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[474].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[476].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[477].setRotationPoint(61.5F, -20F, -4F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		bodyModel[478].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[479].setRotationPoint(63F, -16F, -5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[480].setRotationPoint(63F, -16F, 0F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[481].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[482].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[483].setRotationPoint(61F, 4F, -10.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[484].setRotationPoint(61F, 4F, 9.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[485].setRotationPoint(61F, 3F, -10.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[486].setRotationPoint(61F, 3F, 4.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[487].setRotationPoint(-61.5F, 3F, -10.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[488].setRotationPoint(-61.5F, 4F, -10.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[489].setRotationPoint(-61.5F, 3F, 4.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[490].setRotationPoint(-61.5F, 4F, 9.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[491].setRotationPoint(61.5F, 1F, -11F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		bodyModel[492].setRotationPoint(61.5F, 1F, 4F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[493].setRotationPoint(-62.5F, -19F, -4F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[494].setRotationPoint(-62.5F, -14F, -4F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[495].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[496].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[497].setRotationPoint(-62.5F, -20F, -4F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		bodyModel[498].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[499].setRotationPoint(-62.5F, 1F, -11F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 48, 79, textureX, textureY); // Box 1020
		bodyModel[501] = new ModelRendererTurbo(this, 8, 88, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 153
		bodyModel[503] = new ModelRendererTurbo(this, 8, 83, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 378, 61, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 366, 61, textureX, textureY); // Box 153
		bodyModel[506] = new ModelRendererTurbo(this, 374, 60, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 360, 87, textureX, textureY); // Box 38
		bodyModel[508] = new ModelRendererTurbo(this, 363, 100, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 362, 96, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[511] = new ModelRendererTurbo(this, 363, 70, textureX, textureY); // Box 250
		bodyModel[512] = new ModelRendererTurbo(this, 362, 73, textureX, textureY); // Box 252
		bodyModel[513] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[514] = new ModelRendererTurbo(this, 374, 102, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 365, 104, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 373, 96, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 372, 90, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 370, 82, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 374, 55, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[521] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 249
		bodyModel[522] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Box 251
		bodyModel[523] = new ModelRendererTurbo(this, 372, 76, textureX, textureY); // Box 253
		bodyModel[524] = new ModelRendererTurbo(this, 362, 92, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 360, 83, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 362, 77, textureX, textureY); // Box 254
		bodyModel[527] = new ModelRendererTurbo(this, 365, 90, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 365, 81, textureX, textureY); // Box 254
		bodyModel[529] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[530] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[531] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 12, 105, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 8, 78, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[540] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[541] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[542] = new ModelRendererTurbo(this, 28, 70, textureX, textureY); // Box 250
		bodyModel[543] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[544] = new ModelRendererTurbo(this, 27, 73, textureX, textureY); // Box 252
		bodyModel[545] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[546] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 25, 83, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 27, 77, textureX, textureY); // Box 254
		bodyModel[549] = new ModelRendererTurbo(this, 30, 90, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 30, 81, textureX, textureY); // Box 254
		bodyModel[551] = new ModelRendererTurbo(this, 94, 179, textureX, textureY); // Box 41
		bodyModel[552] = new ModelRendererTurbo(this, 94, 161, textureX, textureY); // Box 1071
		bodyModel[553] = new ModelRendererTurbo(this, 99, 339, textureX, textureY); // Box 276
		bodyModel[554] = new ModelRendererTurbo(this, 103, 301, textureX, textureY); // Box 1073
		bodyModel[555] = new ModelRendererTurbo(this, 3, 405, textureX, textureY); // Box 276
		bodyModel[556] = new ModelRendererTurbo(this, 3, 376, textureX, textureY); // Box 1076
		bodyModel[557] = new ModelRendererTurbo(this, 101, 172, textureX, textureY); // Box 52
		bodyModel[558] = new ModelRendererTurbo(this, 124, 172, textureX, textureY); // Box 52
		bodyModel[559] = new ModelRendererTurbo(this, 171, 176, textureX, textureY); // Box 41
		bodyModel[560] = new ModelRendererTurbo(this, 180, 177, textureX, textureY); // Box 41
		bodyModel[561] = new ModelRendererTurbo(this, 172, 177, textureX, textureY); // Box 41
		bodyModel[562] = new ModelRendererTurbo(this, 184, 176, textureX, textureY); // Box 52
		bodyModel[563] = new ModelRendererTurbo(this, 147, 176, textureX, textureY); // Box 52
		bodyModel[564] = new ModelRendererTurbo(this, 158, 176, textureX, textureY); // Box 41
		bodyModel[565] = new ModelRendererTurbo(this, 167, 177, textureX, textureY); // Box 41
		bodyModel[566] = new ModelRendererTurbo(this, 159, 177, textureX, textureY); // Box 41
		bodyModel[567] = new ModelRendererTurbo(this, 128, 161, textureX, textureY); // Box 2
		bodyModel[568] = new ModelRendererTurbo(this, 151, 161, textureX, textureY); // Box 2
		bodyModel[569] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 2
		bodyModel[570] = new ModelRendererTurbo(this, 377, 156, textureX, textureY); // Box 2
		bodyModel[571] = new ModelRendererTurbo(this, 325, 156, textureX, textureY, "cull"); // Box 2 cull test
		bodyModel[572] = new ModelRendererTurbo(this, 181, 156, textureX, textureY); // Box 2
		bodyModel[573] = new ModelRendererTurbo(this, 129, 156, textureX, textureY, "cull"); // Box 2 cull test
		bodyModel[574] = new ModelRendererTurbo(this, 105, 156, textureX, textureY); // Box 2
		bodyModel[575] = new ModelRendererTurbo(this, 384, 156, textureX, textureY); // Box 2
		bodyModel[576] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 1104
		bodyModel[577] = new ModelRendererTurbo(this, 325, 145, textureX, textureY); // Box 1105
		bodyModel[578] = new ModelRendererTurbo(this, 181, 145, textureX, textureY); // Box 1108
		bodyModel[579] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 1109
		bodyModel[580] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 1110
		bodyModel[581] = new ModelRendererTurbo(this, 384, 145, textureX, textureY); // Box 1111
		bodyModel[582] = new ModelRendererTurbo(this, 346, 106, textureX, textureY); // Right step part
		bodyModel[583] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[584] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Left step part
		bodyModel[585] = new ModelRendererTurbo(this, 350, 59, textureX, textureY); // Left step part
		bodyModel[586] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[587] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[588] = new ModelRendererTurbo(this, 389, 138, textureX, textureY); // Box 2
		bodyModel[589] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 2
		bodyModel[590] = new ModelRendererTurbo(this, 404, 155, textureX, textureY); // Box 2
		bodyModel[591] = new ModelRendererTurbo(this, 404, 142, textureX, textureY); // Box 1141
		bodyModel[592] = new ModelRendererTurbo(this, 24, 143, textureX, textureY); // Box 2
		bodyModel[593] = new ModelRendererTurbo(this, 24, 156, textureX, textureY); // Box 1141
		bodyModel[594] = new ModelRendererTurbo(this, 210, 265, textureX, textureY); // Box 38
		bodyModel[595] = new ModelRendererTurbo(this, 206, 259, textureX, textureY); // Box 462
		bodyModel[596] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[597] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[598] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[599] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[600] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[601] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[602] = new ModelRendererTurbo(this, 65, 151, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[603] = new ModelRendererTurbo(this, 65, 140, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[604] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[605] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[606] = new ModelRendererTurbo(this, 74, 156, textureX, textureY); // Box 205
		bodyModel[607] = new ModelRendererTurbo(this, 65, 149, textureX, textureY); // Box 31
		bodyModel[608] = new ModelRendererTurbo(this, 89, 138, textureX, textureY); // Box 32
		bodyModel[609] = new ModelRendererTurbo(this, 87, 141, textureX, textureY); // Box 33
		bodyModel[610] = new ModelRendererTurbo(this, 94, 141, textureX, textureY); // Box 30
		bodyModel[611] = new ModelRendererTurbo(this, 94, 138, textureX, textureY); // Box 31
		bodyModel[612] = new ModelRendererTurbo(this, 89, 149, textureX, textureY); // Box 2
		bodyModel[613] = new ModelRendererTurbo(this, 87, 152, textureX, textureY); // Box 2
		bodyModel[614] = new ModelRendererTurbo(this, 94, 152, textureX, textureY); // Box 2
		bodyModel[615] = new ModelRendererTurbo(this, 94, 149, textureX, textureY); // Box 2
		bodyModel[616] = new ModelRendererTurbo(this, 475, 255, textureX, textureY); // Box 2
		bodyModel[617] = new ModelRendererTurbo(this, 478, 295, textureX, textureY); // Box 2
		bodyModel[618] = new ModelRendererTurbo(this, 477, 298, textureX, textureY); // Box 2
		bodyModel[619] = new ModelRendererTurbo(this, 478, 268, textureX, textureY); // Box 2
		bodyModel[620] = new ModelRendererTurbo(this, 477, 271, textureX, textureY); // Box 2
		bodyModel[621] = new ModelRendererTurbo(this, 161, 275, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[622] = new ModelRendererTurbo(this, 34, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[623] = new ModelRendererTurbo(this, 12, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[624] = new ModelRendererTurbo(this, 6, 237, textureX, textureY); // Box 128
		bodyModel[625] = new ModelRendererTurbo(this, 17, 253, textureX, textureY); // Box 128
		bodyModel[626] = new ModelRendererTurbo(this, 17, 231, textureX, textureY); // Box 176
		bodyModel[627] = new ModelRendererTurbo(this, 428, 416, textureX, textureY); // Right seat part
		bodyModel[628] = new ModelRendererTurbo(this, 446, 403, textureX, textureY); // Right seat part
		bodyModel[629] = new ModelRendererTurbo(this, 447, 413, textureX, textureY); // Boc 42
		bodyModel[630] = new ModelRendererTurbo(this, 433, 410, textureX, textureY); // Right seat part
		bodyModel[631] = new ModelRendererTurbo(this, 433, 426, textureX, textureY); // Right seat part
		bodyModel[632] = new ModelRendererTurbo(this, 433, 423, textureX, textureY); // Right seat part
		bodyModel[633] = new ModelRendererTurbo(this, 428, 412, textureX, textureY); // Right seat part
		bodyModel[634] = new ModelRendererTurbo(this, 433, 407, textureX, textureY); // Right seat part
		bodyModel[635] = new ModelRendererTurbo(this, 428, 423, textureX, textureY); // Right seat part
		bodyModel[636] = new ModelRendererTurbo(this, 446, 423, textureX, textureY); // Right seat part
		bodyModel[637] = new ModelRendererTurbo(this, 446, 413, textureX, textureY); // Right seat part
		bodyModel[638] = new ModelRendererTurbo(this, 428, 446, textureX, textureY); // Right seat part
		bodyModel[639] = new ModelRendererTurbo(this, 446, 433, textureX, textureY); // Right seat part
		bodyModel[640] = new ModelRendererTurbo(this, 447, 443, textureX, textureY); // Boc 42
		bodyModel[641] = new ModelRendererTurbo(this, 433, 440, textureX, textureY); // Right seat part
		bodyModel[642] = new ModelRendererTurbo(this, 433, 456, textureX, textureY); // Right seat part
		bodyModel[643] = new ModelRendererTurbo(this, 433, 453, textureX, textureY); // Right seat part
		bodyModel[644] = new ModelRendererTurbo(this, 428, 453, textureX, textureY); // Right seat part
		bodyModel[645] = new ModelRendererTurbo(this, 433, 437, textureX, textureY); // Right seat part
		bodyModel[646] = new ModelRendererTurbo(this, 428, 442, textureX, textureY); // Right seat part
		bodyModel[647] = new ModelRendererTurbo(this, 446, 453, textureX, textureY); // Right seat part
		bodyModel[648] = new ModelRendererTurbo(this, 446, 443, textureX, textureY); // Right seat part
		bodyModel[649] = new ModelRendererTurbo(this, 394, 416, textureX, textureY); // Right seat part
		bodyModel[650] = new ModelRendererTurbo(this, 412, 403, textureX, textureY); // Right seat part
		bodyModel[651] = new ModelRendererTurbo(this, 413, 413, textureX, textureY); // Boc 42
		bodyModel[652] = new ModelRendererTurbo(this, 399, 426, textureX, textureY); // Right seat part
		bodyModel[653] = new ModelRendererTurbo(this, 399, 410, textureX, textureY); // Right seat part
		bodyModel[654] = new ModelRendererTurbo(this, 399, 423, textureX, textureY); // Right seat part
		bodyModel[655] = new ModelRendererTurbo(this, 394, 423, textureX, textureY); // Right seat part
		bodyModel[656] = new ModelRendererTurbo(this, 399, 407, textureX, textureY); // Right seat part
		bodyModel[657] = new ModelRendererTurbo(this, 394, 412, textureX, textureY); // Right seat part
		bodyModel[658] = new ModelRendererTurbo(this, 412, 423, textureX, textureY); // Right seat part
		bodyModel[659] = new ModelRendererTurbo(this, 412, 413, textureX, textureY); // Right seat part
		bodyModel[660] = new ModelRendererTurbo(this, 394, 446, textureX, textureY); // Right seat part
		bodyModel[661] = new ModelRendererTurbo(this, 412, 433, textureX, textureY); // Right seat part
		bodyModel[662] = new ModelRendererTurbo(this, 413, 443, textureX, textureY); // Boc 42
		bodyModel[663] = new ModelRendererTurbo(this, 399, 440, textureX, textureY); // Right seat part
		bodyModel[664] = new ModelRendererTurbo(this, 399, 456, textureX, textureY); // Right seat part
		bodyModel[665] = new ModelRendererTurbo(this, 399, 453, textureX, textureY); // Right seat part
		bodyModel[666] = new ModelRendererTurbo(this, 394, 453, textureX, textureY); // Right seat part
		bodyModel[667] = new ModelRendererTurbo(this, 399, 437, textureX, textureY); // Right seat part
		bodyModel[668] = new ModelRendererTurbo(this, 394, 442, textureX, textureY); // Right seat part
		bodyModel[669] = new ModelRendererTurbo(this, 412, 453, textureX, textureY); // Right seat part
		bodyModel[670] = new ModelRendererTurbo(this, 412, 443, textureX, textureY); // Right seat part
		bodyModel[671] = new ModelRendererTurbo(this, 378, 403, textureX, textureY); // Right seat part
		bodyModel[672] = new ModelRendererTurbo(this, 379, 413, textureX, textureY); // Boc 42
		bodyModel[673] = new ModelRendererTurbo(this, 365, 426, textureX, textureY); // Right seat part
		bodyModel[674] = new ModelRendererTurbo(this, 365, 410, textureX, textureY); // Right seat part
		bodyModel[675] = new ModelRendererTurbo(this, 365, 407, textureX, textureY); // Right seat part
		bodyModel[676] = new ModelRendererTurbo(this, 360, 412, textureX, textureY); // Right seat part
		bodyModel[677] = new ModelRendererTurbo(this, 365, 423, textureX, textureY); // Right seat part
		bodyModel[678] = new ModelRendererTurbo(this, 360, 423, textureX, textureY); // Right seat part
		bodyModel[679] = new ModelRendererTurbo(this, 378, 413, textureX, textureY); // Right seat part
		bodyModel[680] = new ModelRendererTurbo(this, 378, 423, textureX, textureY); // Right seat part
		bodyModel[681] = new ModelRendererTurbo(this, 360, 446, textureX, textureY); // Right seat part
		bodyModel[682] = new ModelRendererTurbo(this, 378, 433, textureX, textureY); // Right seat part
		bodyModel[683] = new ModelRendererTurbo(this, 379, 443, textureX, textureY); // Boc 42
		bodyModel[684] = new ModelRendererTurbo(this, 365, 440, textureX, textureY); // Right seat part
		bodyModel[685] = new ModelRendererTurbo(this, 365, 456, textureX, textureY); // Right seat part
		bodyModel[686] = new ModelRendererTurbo(this, 365, 453, textureX, textureY); // Right seat part
		bodyModel[687] = new ModelRendererTurbo(this, 360, 453, textureX, textureY); // Right seat part
		bodyModel[688] = new ModelRendererTurbo(this, 365, 437, textureX, textureY); // Right seat part
		bodyModel[689] = new ModelRendererTurbo(this, 360, 442, textureX, textureY); // Right seat part
		bodyModel[690] = new ModelRendererTurbo(this, 378, 453, textureX, textureY); // Right seat part
		bodyModel[691] = new ModelRendererTurbo(this, 378, 443, textureX, textureY); // Right seat part
		bodyModel[692] = new ModelRendererTurbo(this, 448, 315, textureX, textureY); // Box 2
		bodyModel[693] = new ModelRendererTurbo(this, 467, 318, textureX, textureY); // Box 2
		bodyModel[694] = new ModelRendererTurbo(this, 157, 108, textureX, textureY); // Box 69
		bodyModel[695] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[696] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[697] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[698] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[699] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[700] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[701] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[702] = new ModelRendererTurbo(this, 361, 53, textureX, textureY); // Box 26
		bodyModel[703] = new ModelRendererTurbo(this, 347, 57, textureX, textureY); // Left step part
		bodyModel[704] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[705] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[706] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[707] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[708] = new ModelRendererTurbo(this, 352, 56, textureX, textureY); // Left step part
		bodyModel[709] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[710] = new ModelRendererTurbo(this, 345, 53, textureX, textureY); // Box 26
		bodyModel[711] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[712] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[713] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[714] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[715] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[716] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 1353
		bodyModel[717] = new ModelRendererTurbo(this, 338, 84, textureX, textureY); // Box 1354
		bodyModel[718] = new ModelRendererTurbo(this, 329, 88, textureX, textureY); // Box 1355
		bodyModel[719] = new ModelRendererTurbo(this, 327, 85, textureX, textureY); // Box 1356
		bodyModel[720] = new ModelRendererTurbo(this, 338, 82, textureX, textureY); // Box 1357
		bodyModel[721] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 1358
		bodyModel[722] = new ModelRendererTurbo(this, 338, 88, textureX, textureY); // Box 1359
		bodyModel[723] = new ModelRendererTurbo(this, 322, 88, textureX, textureY); // Box 1360
		bodyModel[724] = new ModelRendererTurbo(this, 355, 103, textureX, textureY); // Box 1361
		bodyModel[725] = new ModelRendererTurbo(this, 339, 103, textureX, textureY); // Box 1362
		bodyModel[726] = new ModelRendererTurbo(this, 324, 96, textureX, textureY); // Right step part
		bodyModel[727] = new ModelRendererTurbo(this, 338, 96, textureX, textureY); // Right step part
		bodyModel[728] = new ModelRendererTurbo(this, 324, 98, textureX, textureY); // Right step part
		bodyModel[729] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Right step part
		bodyModel[730] = new ModelRendererTurbo(this, 344, 109, textureX, textureY); // Right step part
		bodyModel[731] = new ModelRendererTurbo(this, 341, 107, textureX, textureY); // Right step part
		bodyModel[732] = new ModelRendererTurbo(this, 355, 107, textureX, textureY); // Right step part
		bodyModel[733] = new ModelRendererTurbo(this, 174, 251, textureX, textureY); // Box 38
		bodyModel[734] = new ModelRendererTurbo(this, 191, 256, textureX, textureY); // Box 38
		bodyModel[735] = new ModelRendererTurbo(this, 174, 249, textureX, textureY); // Box 451
		bodyModel[736] = new ModelRendererTurbo(this, 191, 254, textureX, textureY); // Box 452
		bodyModel[737] = new ModelRendererTurbo(this, 99, 327, textureX, textureY, "cull"); // Box 917 cull
		bodyModel[738] = new ModelRendererTurbo(this, 468, 299, textureX, textureY); // Box 2
		bodyModel[739] = new ModelRendererTurbo(this, 338, 281, textureX, textureY); // Box 340
		bodyModel[740] = new ModelRendererTurbo(this, 257, 181, textureX, textureY); // Box 38
		bodyModel[741] = new ModelRendererTurbo(this, 208, 244, textureX, textureY); // Box 1322
		bodyModel[742] = new ModelRendererTurbo(this, 360, 416, textureX, textureY); // Right seat part
		bodyModel[743] = new ModelRendererTurbo(this, 44, 296, textureX, textureY); // Box 1233
		bodyModel[744] = new ModelRendererTurbo(this, 45, 283, textureX, textureY); // Box 1234
		bodyModel[745] = new ModelRendererTurbo(this, 31, 283, textureX, textureY); // Box 1235
		bodyModel[746] = new ModelRendererTurbo(this, 123, 289, textureX, textureY); // Box 1236
		bodyModel[747] = new ModelRendererTurbo(this, 0, 293, textureX, textureY); // Conductor's desk
		bodyModel[748] = new ModelRendererTurbo(this, 7, 297, textureX, textureY); // Hostes's door
		bodyModel[749] = new ModelRendererTurbo(this, 0, 297, textureX, textureY); // Box 38
		bodyModel[750] = new ModelRendererTurbo(this, 14, 283, textureX, textureY); // Box 38
		bodyModel[751] = new ModelRendererTurbo(this, 1, 285, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[752] = new ModelRendererTurbo(this, 7, 282, textureX, textureY); // Box 38
		bodyModel[753] = new ModelRendererTurbo(this, 405, 299, textureX, textureY); // Box 2
		bodyModel[754] = new ModelRendererTurbo(this, 391, 312, textureX, textureY); // Box 38
		bodyModel[755] = new ModelRendererTurbo(this, 394, 317, textureX, textureY); // Box 38
		bodyModel[756] = new ModelRendererTurbo(this, 393, 322, textureX, textureY); // Box 38
		bodyModel[757] = new ModelRendererTurbo(this, 320, 286, textureX, textureY); // Box 340
		bodyModel[758] = new ModelRendererTurbo(this, 318, 283, textureX, textureY); // Box 340
		bodyModel[759] = new ModelRendererTurbo(this, 322, 281, textureX, textureY); // Box 340
		bodyModel[760] = new ModelRendererTurbo(this, 286, 308, textureX, textureY); // Box 2
		bodyModel[761] = new ModelRendererTurbo(this, 291, 297, textureX, textureY); // Box 38
		bodyModel[762] = new ModelRendererTurbo(this, 294, 302, textureX, textureY); // Box 38
		bodyModel[763] = new ModelRendererTurbo(this, 293, 307, textureX, textureY); // Box 38
		bodyModel[764] = new ModelRendererTurbo(this, 299, 280, textureX, textureY); // Box 2
		bodyModel[765] = new ModelRendererTurbo(this, 275, 283, textureX, textureY); // Box 38
		bodyModel[766] = new ModelRendererTurbo(this, 275, 289, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[767] = new ModelRendererTurbo(this, 281, 280, textureX, textureY); // Box 38
		bodyModel[768] = new ModelRendererTurbo(this, 292, 280, textureX, textureY); // Box 2
		bodyModel[769] = new ModelRendererTurbo(this, 262, 299, textureX, textureY); // Box 2
		bodyModel[770] = new ModelRendererTurbo(this, 277, 297, textureX, textureY); // Box 38
		bodyModel[771] = new ModelRendererTurbo(this, 280, 302, textureX, textureY); // Box 38
		bodyModel[772] = new ModelRendererTurbo(this, 279, 307, textureX, textureY); // Box 38
		bodyModel[773] = new ModelRendererTurbo(this, 264, 277, textureX, textureY); // Box 2
		bodyModel[774] = new ModelRendererTurbo(this, 257, 280, textureX, textureY); // Box 2
		bodyModel[775] = new ModelRendererTurbo(this, 227, 296, textureX, textureY); // Box 2
		bodyModel[776] = new ModelRendererTurbo(this, 224, 291, textureX, textureY); // Box 38
		bodyModel[777] = new ModelRendererTurbo(this, 224, 297, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[778] = new ModelRendererTurbo(this, 230, 288, textureX, textureY); // Box 38
		bodyModel[779] = new ModelRendererTurbo(this, 207, 274, textureX, textureY); // Box 38
		bodyModel[780] = new ModelRendererTurbo(this, 207, 280, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[781] = new ModelRendererTurbo(this, 213, 271, textureX, textureY); // Box 38
		bodyModel[782] = new ModelRendererTurbo(this, 224, 274, textureX, textureY); // Box 38
		bodyModel[783] = new ModelRendererTurbo(this, 224, 280, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[784] = new ModelRendererTurbo(this, 230, 271, textureX, textureY); // Box 38
		bodyModel[785] = new ModelRendererTurbo(this, 241, 279, textureX, textureY); // Folding sink part R
		bodyModel[786] = new ModelRendererTurbo(this, 241, 285, textureX, textureY); // Box 128
		bodyModel[787] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Folding sink part R
		bodyModel[788] = new ModelRendererTurbo(this, 243, 291, textureX, textureY); // Box 128
		bodyModel[789] = new ModelRendererTurbo(this, 248, 294, textureX, textureY); // Folding sink part R
		bodyModel[790] = new ModelRendererTurbo(this, 248, 300, textureX, textureY); // Box 128
		bodyModel[791] = new ModelRendererTurbo(this, 248, 289, textureX, textureY); // Folding sink part R
		bodyModel[792] = new ModelRendererTurbo(this, 250, 306, textureX, textureY); // Box 128
		bodyModel[793] = new ModelRendererTurbo(this, 182, 189, textureX, textureY); // Box 2

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1020
		bodyModel[500].setRotationPoint(-62.5F, 1F, 4F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[501].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[502].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[503].setRotationPoint(-63.5F, -17F, -1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[504].setRotationPoint(63F, -16F, -5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[505].setRotationPoint(63F, -16F, 1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[506].setRotationPoint(63F, -17F, -1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[507].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[508].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[510].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[511].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[512].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[513].setRotationPoint(63F, -15F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[514].setRotationPoint(63F, -16F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[515].setRotationPoint(63F, 1F, -10F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[516].setRotationPoint(63F, -19F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[517].setRotationPoint(63F, -20F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[518].setRotationPoint(63F, -20F, -3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[519].setRotationPoint(63F, -19F, -1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[520].setRotationPoint(63F, -15F, 10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[521].setRotationPoint(63F, -16F, 9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[522].setRotationPoint(63F, -19F, 7F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[523].setRotationPoint(63F, -20F, 3F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[524].setRotationPoint(61.5F, -19.75F, -7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[525].setRotationPoint(62.5F, -20F, -3F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 254
		bodyModel[526].setRotationPoint(61.5F, -19.75F, 4F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[527].setRotationPoint(62.5F, -20F, -4F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 254
		bodyModel[528].setRotationPoint(62.5F, -20F, 3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[529].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[530].setRotationPoint(-63F, -15F, -11F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[531].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[532].setRotationPoint(-63F, -15F, -11F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[533].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[535].setRotationPoint(-63F, -19F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[536].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[537].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[538].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[539].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[540].setRotationPoint(-63F, -15F, 11F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[541].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[542].setRotationPoint(-63F, -15F, 9F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[543].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[544].setRotationPoint(-63F, -19F, 7F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[545].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[546].setRotationPoint(-63F, -19.75F, -7F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[547].setRotationPoint(-63F, -20F, -3F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 254
		bodyModel[548].setRotationPoint(-63F, -19.75F, 4F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[549].setRotationPoint(-63F, -20F, -4F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 254
		bodyModel[550].setRotationPoint(-63F, -20F, 3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[551].setRotationPoint(-34F, 3F, -10F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		bodyModel[552].setRotationPoint(-34F, 3F, 9F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[553].setRotationPoint(-56.5F, -10.5F, -10F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1073
		bodyModel[554].setRotationPoint(-56.5F, -10.5F, 9F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[555].setRotationPoint(12.5F, -10.5F, -10F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1076
		bodyModel[556].setRotationPoint(3.5F, -10.5F, 9F);

		bodyModel[557].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[557].setRotationPoint(10.5F, 3F, -9F);

		bodyModel[558].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[558].setRotationPoint(18.5F, 3F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[559].setRotationPoint(28.5F, 3.2F, -10F);
		bodyModel[559].rotateAngleZ = -0.78539816F;

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[560].setRotationPoint(28F, 3F, -5.99F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[561].setRotationPoint(28F, 3F, -10.01F);

		bodyModel[562].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 52
		bodyModel[562].setRotationPoint(30.5F, 3F, -9F);

		bodyModel[563].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 52
		bodyModel[563].setRotationPoint(27.5F, 3F, -9F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[564].setRotationPoint(32.5F, 3.2F, -10F);
		bodyModel[564].rotateAngleZ = -0.78539816F;

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[565].setRotationPoint(32F, 3F, -5.99F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[566].setRotationPoint(32F, 3F, -10.01F);

		bodyModel[567].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 2
		bodyModel[567].setRotationPoint(17.5F, 3F, 4F);

		bodyModel[568].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[568].setRotationPoint(24.5F, 3F, 4F);

		bodyModel[569].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[569].setRotationPoint(27.5F, 3F, 4F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[570].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[571].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[572].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[573].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[574].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[575].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		bodyModel[576].setRotationPoint(54.5F, 4F, -11.5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		bodyModel[577].setRotationPoint(33.5F, 4F, -11.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		bodyModel[578].setRotationPoint(-33.5F, 4F, -11.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		bodyModel[579].setRotationPoint(-54.5F, 4F, -11.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1110
		bodyModel[580].setRotationPoint(-61.5F, 4F, -11.5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		bodyModel[581].setRotationPoint(60.5F, 4F, -11.5F);

		bodyModel[582].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[582].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[583].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[583].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[584].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[584].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[585].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[585].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[586].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[587].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[588].setRotationPoint(61F, 4F, -10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[589].setRotationPoint(-61.5F, 4F, -10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[590].setRotationPoint(61F, 4F, 10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		bodyModel[591].setRotationPoint(61F, 4F, -11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[592].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		bodyModel[593].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 107, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[594].setRotationPoint(-56.5F, -10F, -9.9F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 111, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[595].setRotationPoint(-60.5F, -10F, 9.9F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[596].setRotationPoint(56F, -6F, -12F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[597].setRotationPoint(61F, -6F, -12F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[598].setRotationPoint(56F, -6F, 11F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[599].setRotationPoint(61F, -6F, 11F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[600].setRotationPoint(-61.5F, -1F, -12F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[601].setRotationPoint(-61.5F, -1F, 11F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[602].setRotationPoint(-60.5F, 3F, 10.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[603].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[604].setRotationPoint(-60.5F, 5F, -11F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[605].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[606].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[607].setRotationPoint(-60.5F, 5F, 10.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[608].setRotationPoint(-55.25F, 3F, -11F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[609].setRotationPoint(-57F, 4F, -11F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[610].setRotationPoint(-56.5F, 4F, -11F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[611].setRotationPoint(-55.5F, 3F, -11F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[612].setRotationPoint(-55.25F, 3F, 10.5F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[613].setRotationPoint(-57F, 4F, 10.5F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[614].setRotationPoint(-56.5F, 4F, 10.5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[615].setRotationPoint(-55.5F, 3F, 10.5F);

		bodyModel[616].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 2
		bodyModel[616].setRotationPoint(2.5F, -12F, -6F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[617].setRotationPoint(1.5F, -16F, -2.49F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[618].setRotationPoint(1.5F, -14F, -3F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[619].setRotationPoint(1.5F, -16F, 2.5F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[620].setRotationPoint(1.5F, -14F, 2F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[621].setRotationPoint(-29.5F, -17F, -1.5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[622].setRotationPoint(26F, -17F, -0.5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[623].setRotationPoint(18F, -17F, -0.5F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[624].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[625].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[626].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[627].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[627].setRotationPoint(40F, -3F, 7F);
		bodyModel[627].rotateAngleY = -3.14159265F;

		bodyModel[628].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[628].setRotationPoint(40F, -8F, 7F);
		bodyModel[628].rotateAngleY = -3.14159265F;

		bodyModel[629].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[629].setRotationPoint(38.5F, -1F, 5F);

		bodyModel[630].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[630].setRotationPoint(40F, -3F, 7F);
		bodyModel[630].rotateAngleY = -3.14159265F;

		bodyModel[631].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[631].setRotationPoint(40F, -3F, 7F);
		bodyModel[631].rotateAngleY = -3.14159265F;

		bodyModel[632].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[632].setRotationPoint(40F, -5F, 7F);
		bodyModel[632].rotateAngleY = -3.14159265F;

		bodyModel[633].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[633].setRotationPoint(40F, -4.5F, 7F);
		bodyModel[633].rotateAngleY = -3.14159265F;

		bodyModel[634].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[634].setRotationPoint(40F, -5F, 7F);
		bodyModel[634].rotateAngleY = -3.14159265F;

		bodyModel[635].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[635].setRotationPoint(40F, -4.5F, 7F);
		bodyModel[635].rotateAngleY = -3.14159265F;

		bodyModel[636].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[636].setRotationPoint(40F, -4.1F, 7F);
		bodyModel[636].rotateAngleY = -3.14159265F;

		bodyModel[637].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[637].setRotationPoint(40F, -4.1F, 7F);
		bodyModel[637].rotateAngleY = -3.14159265F;

		bodyModel[638].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[638].setRotationPoint(40F, -3F, -7F);
		bodyModel[638].rotateAngleY = -3.14159265F;

		bodyModel[639].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[639].setRotationPoint(40F, -8F, -7F);
		bodyModel[639].rotateAngleY = -3.14159265F;

		bodyModel[640].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[640].setRotationPoint(38.5F, -1F, -9F);

		bodyModel[641].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[641].setRotationPoint(40F, -3F, -7F);
		bodyModel[641].rotateAngleY = -3.14159265F;

		bodyModel[642].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[642].setRotationPoint(40F, -3F, -7F);
		bodyModel[642].rotateAngleY = -3.14159265F;

		bodyModel[643].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[643].setRotationPoint(40F, -5F, -7F);
		bodyModel[643].rotateAngleY = -3.14159265F;

		bodyModel[644].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[644].setRotationPoint(40F, -4.5F, -7F);
		bodyModel[644].rotateAngleY = -3.14159265F;

		bodyModel[645].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[645].setRotationPoint(40F, -5F, -7F);
		bodyModel[645].rotateAngleY = -3.14159265F;

		bodyModel[646].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[646].setRotationPoint(40F, -4.5F, -7F);
		bodyModel[646].rotateAngleY = -3.14159265F;

		bodyModel[647].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[647].setRotationPoint(40F, -4.1F, -7F);
		bodyModel[647].rotateAngleY = -3.14159265F;

		bodyModel[648].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[648].setRotationPoint(40F, -4.1F, -7F);
		bodyModel[648].rotateAngleY = -3.14159265F;

		bodyModel[649].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[649].setRotationPoint(30F, -3F, 7F);
		bodyModel[649].rotateAngleY = -3.14159265F;

		bodyModel[650].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[650].setRotationPoint(30F, -8F, 7F);
		bodyModel[650].rotateAngleY = -3.14159265F;

		bodyModel[651].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[651].setRotationPoint(28.5F, -1F, 5F);

		bodyModel[652].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[652].setRotationPoint(30F, -3F, 7F);
		bodyModel[652].rotateAngleY = -3.14159265F;

		bodyModel[653].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[653].setRotationPoint(30F, -3F, 7F);
		bodyModel[653].rotateAngleY = -3.14159265F;

		bodyModel[654].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[654].setRotationPoint(30F, -5F, 7F);
		bodyModel[654].rotateAngleY = -3.14159265F;

		bodyModel[655].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[655].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[655].rotateAngleY = -3.14159265F;

		bodyModel[656].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[656].setRotationPoint(30F, -5F, 7F);
		bodyModel[656].rotateAngleY = -3.14159265F;

		bodyModel[657].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[657].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[657].rotateAngleY = -3.14159265F;

		bodyModel[658].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[658].setRotationPoint(30F, -4.1F, 7F);
		bodyModel[658].rotateAngleY = -3.14159265F;

		bodyModel[659].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[659].setRotationPoint(30F, -4.1F, 7F);
		bodyModel[659].rotateAngleY = -3.14159265F;

		bodyModel[660].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[660].setRotationPoint(30F, -3F, -7F);
		bodyModel[660].rotateAngleY = -3.14159265F;

		bodyModel[661].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[661].setRotationPoint(30F, -8F, -7F);
		bodyModel[661].rotateAngleY = -3.14159265F;

		bodyModel[662].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[662].setRotationPoint(28.5F, -1F, -9F);

		bodyModel[663].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[663].setRotationPoint(30F, -3F, -7F);
		bodyModel[663].rotateAngleY = -3.14159265F;

		bodyModel[664].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[664].setRotationPoint(30F, -3F, -7F);
		bodyModel[664].rotateAngleY = -3.14159265F;

		bodyModel[665].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[665].setRotationPoint(30F, -5F, -7F);
		bodyModel[665].rotateAngleY = -3.14159265F;

		bodyModel[666].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[666].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[666].rotateAngleY = -3.14159265F;

		bodyModel[667].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[667].setRotationPoint(30F, -5F, -7F);
		bodyModel[667].rotateAngleY = -3.14159265F;

		bodyModel[668].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[668].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[668].rotateAngleY = -3.14159265F;

		bodyModel[669].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[669].setRotationPoint(30F, -4.1F, -7F);
		bodyModel[669].rotateAngleY = -3.14159265F;

		bodyModel[670].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[670].setRotationPoint(30F, -4.1F, -7F);
		bodyModel[670].rotateAngleY = -3.14159265F;

		bodyModel[671].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[671].setRotationPoint(20F, -8F, 7F);
		bodyModel[671].rotateAngleY = -3.14159265F;

		bodyModel[672].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[672].setRotationPoint(18.5F, -1F, 5F);

		bodyModel[673].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[673].setRotationPoint(20F, -3F, 7F);
		bodyModel[673].rotateAngleY = -3.14159265F;

		bodyModel[674].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[674].setRotationPoint(20F, -3F, 7F);
		bodyModel[674].rotateAngleY = -3.14159265F;

		bodyModel[675].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[675].setRotationPoint(20F, -5F, 7F);
		bodyModel[675].rotateAngleY = -3.14159265F;

		bodyModel[676].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[676].setRotationPoint(20F, -4.5F, 7F);
		bodyModel[676].rotateAngleY = -3.14159265F;

		bodyModel[677].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[677].setRotationPoint(20F, -5F, 7F);
		bodyModel[677].rotateAngleY = -3.14159265F;

		bodyModel[678].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[678].setRotationPoint(20F, -4.5F, 7F);
		bodyModel[678].rotateAngleY = -3.14159265F;

		bodyModel[679].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[679].setRotationPoint(20F, -4.1F, 7F);
		bodyModel[679].rotateAngleY = -3.14159265F;

		bodyModel[680].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[680].setRotationPoint(20F, -4.1F, 7F);
		bodyModel[680].rotateAngleY = -3.14159265F;

		bodyModel[681].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[681].setRotationPoint(20F, -3F, -7F);
		bodyModel[681].rotateAngleY = -3.14159265F;

		bodyModel[682].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[682].setRotationPoint(20F, -8F, -7F);
		bodyModel[682].rotateAngleY = -3.14159265F;

		bodyModel[683].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[683].setRotationPoint(18.5F, -1F, -9F);

		bodyModel[684].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[684].setRotationPoint(20F, -3F, -7F);
		bodyModel[684].rotateAngleY = -3.14159265F;

		bodyModel[685].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part
		bodyModel[685].setRotationPoint(20F, -3F, -7F);
		bodyModel[685].rotateAngleY = -3.14159265F;

		bodyModel[686].addShapeBox(-3F, 0F, 2F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[686].setRotationPoint(20F, -5F, -7F);
		bodyModel[686].rotateAngleY = -3.14159265F;

		bodyModel[687].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[687].setRotationPoint(20F, -4.5F, -7F);
		bodyModel[687].rotateAngleY = -3.14159265F;

		bodyModel[688].addShapeBox(-3F, 0F, -3F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Right seat part
		bodyModel[688].setRotationPoint(20F, -5F, -7F);
		bodyModel[688].rotateAngleY = -3.14159265F;

		bodyModel[689].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.05F, -0.03F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.05F, -0.03F, -0.5F, 0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F); // Right seat part
		bodyModel[689].setRotationPoint(20F, -4.5F, -7F);
		bodyModel[689].rotateAngleY = -3.14159265F;

		bodyModel[690].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[690].setRotationPoint(20F, -4.1F, -7F);
		bodyModel[690].rotateAngleY = -3.14159265F;

		bodyModel[691].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Right seat part
		bodyModel[691].setRotationPoint(20F, -4.1F, -7F);
		bodyModel[691].rotateAngleY = -3.14159265F;

		bodyModel[692].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[692].setRotationPoint(9.5F, -5F, -10F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[693].setRotationPoint(11.5F, -17F, -10F);

		bodyModel[694].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 69
		bodyModel[694].setRotationPoint(2.5F, 1F, -6F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[695].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[696].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[697].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[698].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[699].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[699].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[700].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[700].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[701].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[701].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[702].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[703].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[703].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[704].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[705].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[706].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[707].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[708].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[708].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[709].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[709].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[710].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[711].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[711].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[712].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[712].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[713].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[713].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[714].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[714].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[715].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[715].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[716].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[717].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[718].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[719].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[720].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[721].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[722].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[723].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1361
		bodyModel[724].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[725].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1362
		bodyModel[725].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[726].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[726].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[727].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[727].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[728].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[728].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[729].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[729].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[730].addShapeBox(0F, 2F, 1F, 4, 0, 2, 0F,0F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.02F, -1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[730].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[731].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[731].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[732].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[732].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[733].addBox(0F, 0F, 0F, 113, 2, 0, 0F); // Box 38
		bodyModel[733].setRotationPoint(-57.5F, -14.5F, -11.01F);

		bodyModel[734].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[734].setRotationPoint(-49F, -2.5F, -11.01F);

		bodyModel[735].addBox(0F, 0F, 0F, 113, 2, 0, 0F); // Box 451
		bodyModel[735].setRotationPoint(-57.5F, -14.5F, 11.01F);

		bodyModel[736].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[736].setRotationPoint(-49F, -2.5F, 11.01F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917 cull
		bodyModel[737].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F); // Box 2
		bodyModel[738].setRotationPoint(3.5F, -5F, -4F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[739].setRotationPoint(-4F, -3F, 9.99F);

		bodyModel[740].addBox(0F, 0F, 0F, 95, 4, 1, 0F); // Box 38
		bodyModel[740].setRotationPoint(-45F, -10F, -11F);

		bodyModel[741].addBox(0F, 0F, 0F, 95, 4, 1, 0F); // Box 1322
		bodyModel[741].setRotationPoint(-55F, -10F, 10F);

		bodyModel[742].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[742].setRotationPoint(20F, -3F, 7F);
		bodyModel[742].rotateAngleY = -3.14159265F;

		bodyModel[743].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 1233
		bodyModel[743].setRotationPoint(-57.5F, -5F, 3F);

		bodyModel[744].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 1234
		bodyModel[744].setRotationPoint(-57F, -15F, 3F);

		bodyModel[745].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 1235
		bodyModel[745].setRotationPoint(-57.5F, -15F, 5F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1236
		bodyModel[746].setRotationPoint(-56.5F, -15F, 7F);

		bodyModel[747].addShapeBox(-2F, -1F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Conductor's desk
		bodyModel[747].setRotationPoint(-58.5F, -4F, 4F);

		bodyModel[748].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.02F, 0F, 0F, -0.02F); // Hostes's door
		bodyModel[748].setRotationPoint(-59F, -5F, 4.01F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[749].setRotationPoint(-60.5F, -5F, 3F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[750].setRotationPoint(-60F, -3F, 7F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[751].setRotationPoint(-60F, -2F, 7F);

		bodyModel[752].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[752].setRotationPoint(-60F, -5F, 9F);

		bodyModel[753].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 2
		bodyModel[753].setRotationPoint(-0.5F, -4F, -6F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[754].setRotationPoint(-0.75F, 2F, 6.5F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[755].setRotationPoint(0.75F, 3F, 7F);

		bodyModel[756].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[756].setRotationPoint(0.25F, 4.5F, 7F);

		bodyModel[757].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[757].setRotationPoint(-8F, -2F, 8F);

		bodyModel[758].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[758].setRotationPoint(-8.5F, -1.99F, 8F);

		bodyModel[759].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[759].setRotationPoint(-8F, -3F, 9.99F);

		bodyModel[760].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[760].setRotationPoint(-12.5F, -1F, 1F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[761].setRotationPoint(-13.25F, 2F, 6.5F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[762].setRotationPoint(-11.75F, 3F, 7F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[763].setRotationPoint(-12.25F, 4.5F, 7F);

		bodyModel[764].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 2
		bodyModel[764].setRotationPoint(-12.5F, -9F, 0F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[765].setRotationPoint(-12F, 1F, -3F);

		bodyModel[766].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[766].setRotationPoint(-12F, 2F, -3F);

		bodyModel[767].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[767].setRotationPoint(-12F, -1F, -1F);

		bodyModel[768].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 2
		bodyModel[768].setRotationPoint(-9.5F, -9F, -5F);

		bodyModel[769].addBox(0F, 0F, 0F, 1, 14, 12, 0F); // Box 2
		bodyModel[769].setRotationPoint(-17.5F, -9F, -2F);

		bodyModel[770].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 38
		bodyModel[770].setRotationPoint(-17F, 2F, 6.5F);

		bodyModel[771].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[771].setRotationPoint(-15.5F, 3F, 7F);

		bodyModel[772].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[772].setRotationPoint(-16F, 4.5F, 7F);

		bodyModel[773].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 2
		bodyModel[773].setRotationPoint(-14.5F, -9F, -5F);

		bodyModel[774].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 2
		bodyModel[774].setRotationPoint(-16.5F, -9F, -2F);

		bodyModel[775].addBox(0F, 0F, 0F, 2, 14, 15, 0F); // Box 2
		bodyModel[775].setRotationPoint(-26.5F, -9F, -5F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[776].setRotationPoint(-21.5F, 1F, -4.5F);

		bodyModel[777].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[777].setRotationPoint(-21.5F, 2F, -4.5F);

		bodyModel[778].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[778].setRotationPoint(-21.5F, -1F, -4.5F);

		bodyModel[779].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[779].setRotationPoint(-24.5F, 1F, 7F);

		bodyModel[780].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[780].setRotationPoint(-24.5F, 2F, 7F);

		bodyModel[781].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[781].setRotationPoint(-24.5F, -1F, 9F);

		bodyModel[782].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[782].setRotationPoint(-21.5F, 1F, 7F);

		bodyModel[783].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[783].setRotationPoint(-21.5F, 2F, 7F);

		bodyModel[784].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[784].setRotationPoint(-21.5F, -1F, 9F);

		bodyModel[785].addShapeBox(-0.2F, -2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F); // Folding sink part R
		bodyModel[785].setRotationPoint(-18.31F, 0F, 4.5F);

		bodyModel[786].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[786].setRotationPoint(-18.51F, 0F, 4.5F);

		bodyModel[787].addShapeBox(-0.2F, -3F, 0F, 1, 1, 3, 0F,-0.3F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Folding sink part R
		bodyModel[787].setRotationPoint(-18.31F, 0F, 4.5F);

		bodyModel[788].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[788].setRotationPoint(-18.01F, 2F, 5.75F);

		bodyModel[789].addShapeBox(-0.2F, -2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F); // Folding sink part R
		bodyModel[789].setRotationPoint(-18.31F, 0F, -0.5F);

		bodyModel[790].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[790].setRotationPoint(-18.51F, 0F, -0.5F);

		bodyModel[791].addShapeBox(-0.2F, -3F, 0F, 1, 1, 3, 0F,-0.3F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Folding sink part R
		bodyModel[791].setRotationPoint(-18.31F, 0F, -0.5F);

		bodyModel[792].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[792].setRotationPoint(-18.01F, 2F, 0.75F);

		bodyModel[793].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 2
		bodyModel[793].setRotationPoint(1.5F, 3F, -6F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 794; i++)
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
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