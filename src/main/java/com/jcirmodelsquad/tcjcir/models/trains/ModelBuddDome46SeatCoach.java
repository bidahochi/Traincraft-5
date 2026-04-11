//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.passengerparts.*;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41CDO;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelBuddDome46SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBuddDome46SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[696];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY,"cull"); // Box 2 floor cull
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
		bodyModel[66] = new ModelRendererTurbo(this, 155, 41, textureX, textureY,"cull"); // Box 128 cull
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
		bodyModel[152] = new ModelRendererTurbo(this, 179, 107, textureX, textureY,"cull"); // Box 2 floor cull
		bodyModel[153] = new ModelRendererTurbo(this, 102, 134, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 305, 132, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 157, 105, textureX, textureY); // Box 2
		bodyModel[156] = new ModelRendererTurbo(this, 98, 106, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 98, 131, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 177, 195, textureX, textureY); // Box 2 step
		bodyModel[159] = new ModelRendererTurbo(this, 384, 242, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 188, 313, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 429, 283, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 179, 105, textureX, textureY,"cull"); // Box 2 step cull
		bodyModel[163] = new ModelRendererTurbo(this, 184, 285, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 461, 244, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 44, 150, textureX, textureY); // Box 2 step
		bodyModel[166] = new ModelRendererTurbo(this, 43, 139, textureX, textureY,"cull"); // Box 2 step cull
		bodyModel[167] = new ModelRendererTurbo(this, 89, 108, textureX, textureY); // Box 69
		bodyModel[168] = new ModelRendererTurbo(this, 253, 149, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 251, 152, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 32
		bodyModel[171] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 33
		bodyModel[172] = new ModelRendererTurbo(this, 72, 57, textureX, textureY); // Box 128
		bodyModel[173] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 169
		bodyModel[174] = new ModelRendererTurbo(this, 72, 208, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 177
		bodyModel[176] = new ModelRendererTurbo(this, 437, 174, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 448, 190, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 448, 168, textureX, textureY); // Box 176
		bodyModel[179] = new ModelRendererTurbo(this, 431, 196, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 72, 214, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 155, 57, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 155, 30, textureX, textureY); // Box 169
		bodyModel[183] = new ModelRendererTurbo(this, 234, 193, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 234, 187, textureX, textureY); // Box 177
		bodyModel[185] = new ModelRendererTurbo(this, 234, 199, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[186] = new ModelRendererTurbo(this, 234, 233, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 234, 239, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 234, 229, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 234, 219, textureX, textureY); // Box 192
		bodyModel[190] = new ModelRendererTurbo(this, 234, 225, textureX, textureY); // Box 193
		bodyModel[191] = new ModelRendererTurbo(this, 234, 215, textureX, textureY); // Box 194
		bodyModel[192] = new ModelRendererTurbo(this, 146, 364, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 492, 23, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 460, 23, textureX, textureY); // Box 176
		bodyModel[196] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 72, 249, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 72, 255, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 72, 243, textureX, textureY); // Box 192
		bodyModel[200] = new ModelRendererTurbo(this, 72, 239, textureX, textureY); // Box 193
		bodyModel[201] = new ModelRendererTurbo(this, 72, 234, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 72, 230, textureX, textureY); // Box 194
		bodyModel[203] = new ModelRendererTurbo(this, 110, 388, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 138, 394, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 138, 403, textureX, textureY); // Box 128
		bodyModel[206] = new ModelRendererTurbo(this, 287, 311, textureX, textureY); // Box 2
		bodyModel[207] = new ModelRendererTurbo(this, 223, 326, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[208] = new ModelRendererTurbo(this, 385, 236, textureX, textureY); // Box 2
		bodyModel[209] = new ModelRendererTurbo(this, 453, 236, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 406, 236, textureX, textureY); // Box 2
		bodyModel[211] = new ModelRendererTurbo(this, 74, 281, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 52, 259, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 55, 296, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 55, 287, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 180, 262, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 55, 105, textureX, textureY); // Box 2
		bodyModel[217] = new ModelRendererTurbo(this, 481, 242, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 210, 217, textureX, textureY,"cull"); // Box 128 stare roof cull
		bodyModel[219] = new ModelRendererTurbo(this, 171, 319, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 164, 331, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 460, 281, textureX, textureY); // Box 2
		bodyModel[222] = new ModelRendererTurbo(this, 480, 333, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 482, 295, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 482, 268, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 487, 314, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 490, 307, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 491, 300, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 492, 293, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 493, 286, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 475, 311, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 475, 284, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 486, 316, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 486, 289, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 487, 310, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 487, 283, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 475, 302, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 475, 275, textureX, textureY); // Box 0
		bodyModel[238] = new ModelRendererTurbo(this, 487, 301, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 487, 274, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 478, 293, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 478, 266, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 481, 318, textureX, textureY); // Box 2
		bodyModel[243] = new ModelRendererTurbo(this, 165, 317, textureX, textureY); // Box 2
		bodyModel[244] = new ModelRendererTurbo(this, 270, 306, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 283, 310, textureX, textureY); // Box 2
		bodyModel[246] = new ModelRendererTurbo(this, 270, 270, textureX, textureY); // Box 2
		bodyModel[247] = new ModelRendererTurbo(this, 389, 307, textureX, textureY); // Box 2
		bodyModel[248] = new ModelRendererTurbo(this, 365, 311, textureX, textureY); // Box 2
		bodyModel[249] = new ModelRendererTurbo(this, 389, 276, textureX, textureY); // Box 2
		bodyModel[250] = new ModelRendererTurbo(this, 365, 280, textureX, textureY); // Box 2
		bodyModel[251] = new ModelRendererTurbo(this, 346, 311, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 2
		bodyModel[253] = new ModelRendererTurbo(this, 306, 302, textureX, textureY); // Box 2
		bodyModel[254] = new ModelRendererTurbo(this, 306, 318, textureX, textureY); // Box 2
		bodyModel[255] = new ModelRendererTurbo(this, 306, 310, textureX, textureY); // Box 2
		bodyModel[256] = new ModelRendererTurbo(this, 396, 321, textureX, textureY); // Box 2
		bodyModel[257] = new ModelRendererTurbo(this, 414, 308, textureX, textureY); // Box 2
		bodyModel[258] = new ModelRendererTurbo(this, 412, 301, textureX, textureY); // Box 2
		bodyModel[259] = new ModelRendererTurbo(this, 410, 323, textureX, textureY); // Box 2
		bodyModel[260] = new ModelRendererTurbo(this, 410, 335, textureX, textureY); // Box 2
		bodyModel[261] = new ModelRendererTurbo(this, 410, 329, textureX, textureY); // Box 2
		bodyModel[262] = new ModelRendererTurbo(this, 178, 185, textureX, textureY); // Box 2 step
		bodyModel[263] = new ModelRendererTurbo(this, 353, 288, textureX, textureY); // Box 340
		bodyModel[264] = new ModelRendererTurbo(this, 337, 288, textureX, textureY); // Box 340
		bodyModel[265] = new ModelRendererTurbo(this, 346, 289, textureX, textureY); // Box 340
		bodyModel[266] = new ModelRendererTurbo(this, 236, 315, textureX, textureY); // Right seat part
		bodyModel[267] = new ModelRendererTurbo(this, 239, 309, textureX, textureY); // Right seat part
		bodyModel[268] = new ModelRendererTurbo(this, 225, 312, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[269] = new ModelRendererTurbo(this, 255, 312, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[270] = new ModelRendererTurbo(this, 236, 321, textureX, textureY); // Boc 42
		bodyModel[271] = new ModelRendererTurbo(this, 376, 283, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 379, 288, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 378, 292, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 337, 310, textureX, textureY); // Right seat part
		bodyModel[275] = new ModelRendererTurbo(this, 340, 304, textureX, textureY); // Right seat part
		bodyModel[276] = new ModelRendererTurbo(this, 329, 313, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[277] = new ModelRendererTurbo(this, 352, 313, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[278] = new ModelRendererTurbo(this, 337, 322, textureX, textureY); // Boc 42
		bodyModel[279] = new ModelRendererTurbo(this, 353, 300, textureX, textureY); // Box 340
		bodyModel[280] = new ModelRendererTurbo(this, 293, 302, textureX, textureY); // Box 340
		bodyModel[281] = new ModelRendererTurbo(this, 293, 313, textureX, textureY); // Box 340
		bodyModel[282] = new ModelRendererTurbo(this, 363, 299, textureX, textureY); // Box 340
		bodyModel[283] = new ModelRendererTurbo(this, 253, 283, textureX, textureY); // Box 38
		bodyModel[284] = new ModelRendererTurbo(this, 253, 289, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[285] = new ModelRendererTurbo(this, 259, 278, textureX, textureY); // Box 38
		bodyModel[286] = new ModelRendererTurbo(this, 236, 278, textureX, textureY); // Box 38
		bodyModel[287] = new ModelRendererTurbo(this, 236, 284, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[288] = new ModelRendererTurbo(this, 242, 273, textureX, textureY); // Box 38
		bodyModel[289] = new ModelRendererTurbo(this, 236, 295, textureX, textureY); // Box 38
		bodyModel[290] = new ModelRendererTurbo(this, 236, 301, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[291] = new ModelRendererTurbo(this, 242, 290, textureX, textureY); // Box 38
		bodyModel[292] = new ModelRendererTurbo(this, 259, 297, textureX, textureY); // Box 41
		bodyModel[293] = new ModelRendererTurbo(this, 231, 304, textureX, textureY); // Box 41
		bodyModel[294] = new ModelRendererTurbo(this, 231, 287, textureX, textureY); // Box 41
		bodyModel[295] = new ModelRendererTurbo(this, 298, 281, textureX, textureY); // Box 2
		bodyModel[296] = new ModelRendererTurbo(this, 254, 302, textureX, textureY); // Box 2
		bodyModel[297] = new ModelRendererTurbo(this, 219, 293, textureX, textureY); // Box 2
		bodyModel[298] = new ModelRendererTurbo(this, 290, 272, textureX, textureY); // Box 340
		bodyModel[299] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 340
		bodyModel[300] = new ModelRendererTurbo(this, 286, 291, textureX, textureY); // Box 340
		bodyModel[301] = new ModelRendererTurbo(this, 342, 287, textureX, textureY); // Box 340
		bodyModel[302] = new ModelRendererTurbo(this, 378, 280, textureX, textureY); // Box 2
		bodyModel[303] = new ModelRendererTurbo(this, 270, 281, textureX, textureY); // Box 2
		bodyModel[304] = new ModelRendererTurbo(this, 373, 286, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 430, 312, textureX, textureY); // Box 2
		bodyModel[306] = new ModelRendererTurbo(this, 434, 311, textureX, textureY); // Box 2
		bodyModel[307] = new ModelRendererTurbo(this, 127, 394, textureX, textureY); // Box 128
		bodyModel[308] = new ModelRendererTurbo(this, 117, 366, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 110, 379, textureX, textureY); // Box 2
		bodyModel[310] = new ModelRendererTurbo(this, 111, 366, textureX, textureY); // Box 2
		bodyModel[311] = new ModelRendererTurbo(this, 110, 355, textureX, textureY); // Box 2
		bodyModel[312] = new ModelRendererTurbo(this, 130, 368, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 168, 390, textureX, textureY); // Box 128
		bodyModel[314] = new ModelRendererTurbo(this, 161, 403, textureX, textureY); // Box 2
		bodyModel[315] = new ModelRendererTurbo(this, 162, 390, textureX, textureY); // Box 2
		bodyModel[316] = new ModelRendererTurbo(this, 181, 392, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 392, 218, textureX, textureY); // Box 2
		bodyModel[318] = new ModelRendererTurbo(this, 396, 229, textureX, textureY); // Box 2
		bodyModel[319] = new ModelRendererTurbo(this, 48, 334, textureX, textureY); // Box 2
		bodyModel[320] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 2
		bodyModel[321] = new ModelRendererTurbo(this, 20, 323, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 35, 321, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 381, 226, textureX, textureY); // Box 2
		bodyModel[324] = new ModelRendererTurbo(this, 375, 235, textureX, textureY); // Box 2
		bodyModel[325] = new ModelRendererTurbo(this, 380, 216, textureX, textureY); // Box 896
		bodyModel[326] = new ModelRendererTurbo(this, 463, 226, textureX, textureY); // Box 2
		bodyModel[327] = new ModelRendererTurbo(this, 481, 232, textureX, textureY); // Box 896
		bodyModel[328] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 128
		bodyModel[329] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Box 128
		bodyModel[330] = new ModelRendererTurbo(this, 1, 259, textureX, textureY); // Box 128
		bodyModel[331] = new ModelRendererTurbo(this, 205, 370, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 187, 372, textureX, textureY); // Conductor's desk
		bodyModel[333] = new ModelRendererTurbo(this, 210, 380, textureX, textureY); // Conductor's door
		bodyModel[334] = new ModelRendererTurbo(this, 188, 359, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 186, 380, textureX, textureY); // Conductor's seat
		bodyModel[336] = new ModelRendererTurbo(this, 171, 364, textureX, textureY); // Box 128
		bodyModel[337] = new ModelRendererTurbo(this, 217, 370, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 210, 370, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 463, 309, textureX, textureY); // Box 2
		bodyModel[340] = new ModelRendererTurbo(this, 171, 311, textureX, textureY); // Box 2
		bodyModel[341] = new ModelRendererTurbo(this, 124, 332, textureX, textureY); // Box 276
		bodyModel[342] = new ModelRendererTurbo(this, 122, 327, textureX, textureY); // Box 275
		bodyModel[343] = new ModelRendererTurbo(this, 104, 332, textureX, textureY); // Box 276
		bodyModel[344] = new ModelRendererTurbo(this, 102, 327, textureX, textureY); // Box 275
		bodyModel[345] = new ModelRendererTurbo(this, 134, 294, textureX, textureY); // Box 908
		bodyModel[346] = new ModelRendererTurbo(this, 132, 289, textureX, textureY); // Box 909
		bodyModel[347] = new ModelRendererTurbo(this, 115, 294, textureX, textureY); // Box 910
		bodyModel[348] = new ModelRendererTurbo(this, 113, 289, textureX, textureY); // Box 911
		bodyModel[349] = new ModelRendererTurbo(this, 175, 294, textureX, textureY); // Box 910
		bodyModel[350] = new ModelRendererTurbo(this, 173, 289, textureX, textureY); // Box 911
		bodyModel[351] = new ModelRendererTurbo(this, 102, 294, textureX, textureY); // Box 910
		bodyModel[352] = new ModelRendererTurbo(this, 100, 289, textureX, textureY); // Box 911
		bodyModel[353] = new ModelRendererTurbo(this, 91, 332, textureX, textureY); // Box 916
		bodyModel[354] = new ModelRendererTurbo(this, 89, 327, textureX, textureY); // Box 917
		bodyModel[355] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 275
		bodyModel[356] = new ModelRendererTurbo(this, 3, 398, textureX, textureY); // Box 276
		bodyModel[357] = new ModelRendererTurbo(this, 1, 364, textureX, textureY); // Box 920
		bodyModel[358] = new ModelRendererTurbo(this, 3, 369, textureX, textureY); // Box 921
		bodyModel[359] = new ModelRendererTurbo(this, 90, 364, textureX, textureY); // Box 920
		bodyModel[360] = new ModelRendererTurbo(this, 92, 369, textureX, textureY); // Box 921
		bodyModel[361] = new ModelRendererTurbo(this, 72, 393, textureX, textureY); // Box 924
		bodyModel[362] = new ModelRendererTurbo(this, 74, 398, textureX, textureY); // Box 925
		bodyModel[363] = new ModelRendererTurbo(this, 91, 393, textureX, textureY); // Box 924
		bodyModel[364] = new ModelRendererTurbo(this, 93, 398, textureX, textureY); // Box 925
		bodyModel[365] = new ModelRendererTurbo(this, 72, 388, textureX, textureY,"cull"); // Box 924 cull
		bodyModel[366] = new ModelRendererTurbo(this, 91, 388, textureX, textureY,"cull"); // Box 924 cull
		bodyModel[367] = new ModelRendererTurbo(this, 90, 359, textureX, textureY,"cull"); // Box 924 cull
		bodyModel[368] = new ModelRendererTurbo(this, 1, 372, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[369] = new ModelRendererTurbo(this, 3, 401, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[370] = new ModelRendererTurbo(this, 94, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[371] = new ModelRendererTurbo(this, 91, 335, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[372] = new ModelRendererTurbo(this, 91, 294, textureX, textureY); // Box 910
		bodyModel[373] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Box 911
		bodyModel[374] = new ModelRendererTurbo(this, 150, 268, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[375] = new ModelRendererTurbo(this, 85, 263, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[376] = new ModelRendererTurbo(this, 36, 343, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[377] = new ModelRendererTurbo(this, 45, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[378] = new ModelRendererTurbo(this, 23, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[379] = new ModelRendererTurbo(this, 1, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[380] = new ModelRendererTurbo(this, 49, 348, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[381] = new ModelRendererTurbo(this, 150, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[382] = new ModelRendererTurbo(this, 128, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[383] = new ModelRendererTurbo(this, 139, 277, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[384] = new ModelRendererTurbo(this, 172, 227, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[385] = new ModelRendererTurbo(this, 172, 236, textureX, textureY,"lamp"); // Box 950 glow
		bodyModel[386] = new ModelRendererTurbo(this, 169, 230, textureX, textureY); // Box 950
		bodyModel[387] = new ModelRendererTurbo(this, 108, 10, textureX, textureY); // Box 950
		bodyModel[388] = new ModelRendererTurbo(this, 319, 21, textureX, textureY); // Box 950
		bodyModel[389] = new ModelRendererTurbo(this, 108, 342, textureX, textureY,"cull"); // Box 275 NP cull
		bodyModel[390] = new ModelRendererTurbo(this, 118, 304, textureX, textureY,"cull"); // Box 909 NP cull
		bodyModel[391] = new ModelRendererTurbo(this, 108, 347, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[392] = new ModelRendererTurbo(this, 118, 309, textureX, textureY,"lamp"); // Box 909 glow
		bodyModel[393] = new ModelRendererTurbo(this, 17, 408, textureX, textureY,"cull"); // Box 275 NP cull
		bodyModel[394] = new ModelRendererTurbo(this, 9, 379, textureX, textureY,"cull"); // Box 909 NP cull
		bodyModel[395] = new ModelRendererTurbo(this, 17, 413, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[396] = new ModelRendererTurbo(this, 9, 384, textureX, textureY,"lamp"); // Box 909 glow
		bodyModel[397] = new ModelRendererTurbo(this, 370, 156, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 318, 156, textureX, textureY); // Box 2
		bodyModel[399] = new ModelRendererTurbo(this, 326, 149, textureX, textureY); // Box 2 cull test
		bodyModel[400] = new ModelRendererTurbo(this, 324, 152, textureX, textureY); // Box 2 cull test
		bodyModel[401] = new ModelRendererTurbo(this, 370, 145, textureX, textureY); // Box 29
		bodyModel[402] = new ModelRendererTurbo(this, 318, 145, textureX, textureY); // Box 35
		bodyModel[403] = new ModelRendererTurbo(this, 326, 138, textureX, textureY); // Box 41 cull test
		bodyModel[404] = new ModelRendererTurbo(this, 324, 141, textureX, textureY); // Box 39 cull test
		bodyModel[405] = new ModelRendererTurbo(this, 122, 156, textureX, textureY); // Box 2
		bodyModel[406] = new ModelRendererTurbo(this, 122, 145, textureX, textureY); // Box 33
		bodyModel[407] = new ModelRendererTurbo(this, 174, 156, textureX, textureY); // Box 2
		bodyModel[408] = new ModelRendererTurbo(this, 174, 145, textureX, textureY); // Box 37
		bodyModel[409] = new ModelRendererTurbo(this, 110, 149, textureX, textureY); // Box 2 cull test
		bodyModel[410] = new ModelRendererTurbo(this, 110, 138, textureX, textureY); // Box 41 cull test
		bodyModel[411] = new ModelRendererTurbo(this, 108, 152, textureX, textureY); // Box 2 cull test
		bodyModel[412] = new ModelRendererTurbo(this, 108, 141, textureX, textureY); // Box 39 cull test
		bodyModel[413] = new ModelRendererTurbo(this, 154, 149, textureX, textureY); // Box 2
		bodyModel[414] = new ModelRendererTurbo(this, 153, 152, textureX, textureY); // Box 2
		bodyModel[415] = new ModelRendererTurbo(this, 154, 138, textureX, textureY); // Box 36
		bodyModel[416] = new ModelRendererTurbo(this, 153, 141, textureX, textureY); // Box 37
		bodyModel[417] = new ModelRendererTurbo(this, 160, 149, textureX, textureY); // Box 2
		bodyModel[418] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 2
		bodyModel[419] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 160, 141, textureX, textureY); // Box 39
		bodyModel[421] = new ModelRendererTurbo(this, 318, 149, textureX, textureY); // Box 2
		bodyModel[422] = new ModelRendererTurbo(this, 317, 152, textureX, textureY); // Box 2
		bodyModel[423] = new ModelRendererTurbo(this, 318, 138, textureX, textureY); // Box 32
		bodyModel[424] = new ModelRendererTurbo(this, 317, 141, textureX, textureY); // Box 33
		bodyModel[425] = new ModelRendererTurbo(this, 258, 149, textureX, textureY); // Box 2
		bodyModel[426] = new ModelRendererTurbo(this, 258, 152, textureX, textureY); // Box 2
		bodyModel[427] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 258, 141, textureX, textureY); // Box 39
		bodyModel[429] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[430] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 412, 2, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[434] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[435] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[436] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[437] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[438] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[440] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[443] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 393, 63, textureX, textureY); // Box 128
		bodyModel[446] = new ModelRendererTurbo(this, 388, 89, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 388, 69, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 395, 55, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 396, 58, textureX, textureY); // Box 128
		bodyModel[450] = new ModelRendererTurbo(this, 404, 58, textureX, textureY); // Box 1004
		bodyModel[451] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 443, 16, textureX, textureY); // Box 153
		bodyModel[453] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[455] = new ModelRendererTurbo(this, 404, 138, textureX, textureY); // Box 2
		bodyModel[456] = new ModelRendererTurbo(this, 404, 151, textureX, textureY); // Box 192
		bodyModel[457] = new ModelRendererTurbo(this, 389, 138, textureX, textureY); // Box 2
		bodyModel[458] = new ModelRendererTurbo(this, 389, 150, textureX, textureY); // Box 191
		bodyModel[459] = new ModelRendererTurbo(this, 29, 151, textureX, textureY); // Box 2
		bodyModel[460] = new ModelRendererTurbo(this, 24, 152, textureX, textureY); // Box 2
		bodyModel[461] = new ModelRendererTurbo(this, 29, 139, textureX, textureY); // Box 191
		bodyModel[462] = new ModelRendererTurbo(this, 24, 139, textureX, textureY); // Box 192
		bodyModel[463] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 2
		bodyModel[464] = new ModelRendererTurbo(this, 393, 77, textureX, textureY); // Box 1020
		bodyModel[465] = new ModelRendererTurbo(this, 50, 65, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 45, 89, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 52, 57, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 61, 60, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 53, 60, textureX, textureY); // Box 1004
		bodyModel[471] = new ModelRendererTurbo(this, 48, 99, textureX, textureY); // Box 2
		bodyModel[472] = new ModelRendererTurbo(this, 48, 79, textureX, textureY); // Box 1020
		bodyModel[473] = new ModelRendererTurbo(this, 8, 88, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 153
		bodyModel[475] = new ModelRendererTurbo(this, 8, 83, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 378, 61, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 366, 61, textureX, textureY); // Box 153
		bodyModel[478] = new ModelRendererTurbo(this, 374, 60, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 360, 87, textureX, textureY); // Box 38
		bodyModel[480] = new ModelRendererTurbo(this, 363, 100, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 362, 96, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 248
		bodyModel[483] = new ModelRendererTurbo(this, 363, 70, textureX, textureY); // Box 250
		bodyModel[484] = new ModelRendererTurbo(this, 362, 73, textureX, textureY); // Box 252
		bodyModel[485] = new ModelRendererTurbo(this, 355, 86, textureX, textureY); // Box 38
		bodyModel[486] = new ModelRendererTurbo(this, 374, 102, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 365, 104, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 373, 96, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 372, 90, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 370, 82, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 374, 55, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 355, 66, textureX, textureY); // Box 247
		bodyModel[493] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 249
		bodyModel[494] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Box 251
		bodyModel[495] = new ModelRendererTurbo(this, 372, 76, textureX, textureY); // Box 253
		bodyModel[496] = new ModelRendererTurbo(this, 362, 92, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 360, 83, textureX, textureY); // Box 128
		bodyModel[498] = new ModelRendererTurbo(this, 362, 77, textureX, textureY); // Box 254
		bodyModel[499] = new ModelRendererTurbo(this, 365, 90, textureX, textureY); // Box 128

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

		bodyModel[158].addBox(0F, 0F, 0F, 6, 2, 7, 0F); // Box 2 step
		bodyModel[158].setRotationPoint(0.5F, 3F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 29, 1, 16, 0F); // Box 2
		bodyModel[159].setRotationPoint(-26.5F, -10F, -6F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 2
		bodyModel[160].setRotationPoint(-27.5F, -12F, -6F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 11, 16, 0F); // Box 2
		bodyModel[161].setRotationPoint(2.5F, -10F, -6F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 2 step cull
		bodyModel[162].setRotationPoint(2.5F, 1F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 2
		bodyModel[163].setRotationPoint(-27.5F, -18F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 2
		bodyModel[164].setRotationPoint(2.5F, -18F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 2 step
		bodyModel[165].setRotationPoint(-31.5F, 3F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 step cull
		bodyModel[166].setRotationPoint(-31.5F, 1F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 69
		bodyModel[167].setRotationPoint(-27.5F, 1F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[168].setRotationPoint(6.75F, 3F, 10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[169].setRotationPoint(5F, 4F, 10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[170].setRotationPoint(6.75F, 3F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[171].setRotationPoint(5F, 4F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[172].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[173].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[174].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[175].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[176].setRotationPoint(44.5F, -17F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[177].setRotationPoint(44.5F, -18F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[178].setRotationPoint(44.5F, -18F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 17, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[179].setRotationPoint(44.5F, -16.25F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 34, 1, 14, 0F); // Box 128
		bodyModel[180].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(3.5F, -19F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 58, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[182].setRotationPoint(3.5F, -19F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[183].setRotationPoint(3.5F, -19F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[184].setRotationPoint(3.5F, -19F, 3F);

		bodyModel[185].addBox(0F, 0F, 0F, 58, 1, 14, 0F); // Box 128 cull
		bodyModel[185].setRotationPoint(3.5F, -18F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[186].setRotationPoint(3.5F, -17F, -9.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -1.25F, 0F, 1.275F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, -1.25F); // Box 128
		bodyModel[187].setRotationPoint(3.5F, -16F, -10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[188].setRotationPoint(3.5F, -18F, -9.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[189].setRotationPoint(3.5F, -17F, 5.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		bodyModel[190].setRotationPoint(3.5F, -16F, 9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[191].setRotationPoint(3.5F, -18F, 7.25F);

		bodyModel[192].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 128
		bodyModel[192].setRotationPoint(50.5F, -15F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[193].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[194].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[195].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[196].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[197].setRotationPoint(-60.5F, -17F, -9.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -1.25F, 0F, 1.275F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, -1.25F); // Box 128
		bodyModel[198].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[199].setRotationPoint(-60.5F, -17F, 5.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		bodyModel[200].setRotationPoint(-60.5F, -16F, 9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[201].setRotationPoint(-60.5F, -18F, -9.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[202].setRotationPoint(-60.5F, -18F, 7.25F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[203].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 128
		bodyModel[204].setRotationPoint(51.5F, -10F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 128
		bodyModel[205].setRotationPoint(51.5F, -5F, -10F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 2
		bodyModel[206].setRotationPoint(-12.5F, -9F, -6F);

		bodyModel[207].addBox(0F, 0F, 0F, 29, 14, 1, 0F); // Box 2 cull
		bodyModel[207].setRotationPoint(-26.5F, -9F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		bodyModel[208].setRotationPoint(-27.5F, -12F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[209].setRotationPoint(-2.5F, -12F, -10F);

		bodyModel[210].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 2
		bodyModel[210].setRotationPoint(-21.5F, -12F, -10F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 16, 7, 0F); // Box 128
		bodyModel[211].setRotationPoint(-58.5F, -15F, 3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[212].setRotationPoint(-55.5F, -16.25F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[213].setRotationPoint(-60.5F, -5F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(-60.5F, -10F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[215].setRotationPoint(-32.5F, -17.25F, -10F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 2
		bodyModel[216].setRotationPoint(-27.5F, 3F, -10F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 2
		bodyModel[217].setRotationPoint(2.5F, -18F, 3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 stare roof cull
		bodyModel[218].setRotationPoint(3.5F, -20F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F); // Box 2
		bodyModel[219].setRotationPoint(-32.5F, -15F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F); // Box 2
		bodyModel[220].setRotationPoint(-32.5F, -6F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[221].setRotationPoint(9.5F, -17F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[222].setRotationPoint(11.5F, -5F, -5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[223].setRotationPoint(2.5F, -15F, -3F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[224].setRotationPoint(2.5F, -15F, 2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[225].setRotationPoint(3F, -1F, -2.94F);
		bodyModel[225].rotateAngleY = -0.16580628F;

		bodyModel[226].addBox(0F, -2F, 1F, 4, 2, 4, 0F); // Box 0
		bodyModel[226].setRotationPoint(3F, -1F, -2.94F);
		bodyModel[226].rotateAngleY = -0.16580628F;

		bodyModel[227].addShapeBox(0F, -4F, 1F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[227].setRotationPoint(3F, -0.75F, -2.94F);
		bodyModel[227].rotateAngleY = -0.16580628F;

		bodyModel[228].addShapeBox(0F, -6F, 1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[228].setRotationPoint(3F, -0.5F, -2.94F);
		bodyModel[228].rotateAngleY = -0.16580628F;

		bodyModel[229].addShapeBox(0F, -8F, 1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 0
		bodyModel[229].setRotationPoint(3F, -0.25F, -2.94F);
		bodyModel[229].rotateAngleY = -0.16580628F;

		bodyModel[230].addShapeBox(0F, -6F, 0F, 4, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 0
		bodyModel[230].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[230].rotateAngleY = -0.16580628F;

		bodyModel[231].addShapeBox(0F, -6F, 5F, 4, 7, 1, 0F,0.5F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F, 0.5F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[231].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[231].rotateAngleY = -0.16580628F;

		bodyModel[232].addBox(4F, -3F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[232].setRotationPoint(3F, 0F, -2.94F);
		bodyModel[232].rotateAngleY = -0.16580628F;

		bodyModel[233].addBox(4F, -3F, 5F, 1, 2, 1, 0F); // Box 0
		bodyModel[233].setRotationPoint(3F, 0F, -2.94F);
		bodyModel[233].rotateAngleY = -0.16580628F;

		bodyModel[234].addBox(4F, -6F, 0.5F, 1, 5, 0, 0F); // Box 0
		bodyModel[234].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[234].rotateAngleY = -0.16580628F;

		bodyModel[235].addBox(4F, -6F, 5.5F, 1, 5, 0, 0F); // Box 0
		bodyModel[235].setRotationPoint(3F, -2F, -2.94F);
		bodyModel[235].rotateAngleY = -0.16580628F;

		bodyModel[236].addShapeBox(0F, -12F, 0F, 4, 7, 1, 0F,-0.5F, 0F, -0.01F, -3.5F, 0F, -0.01F, -3.66F, 0F, 0.01F, -0.34F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.34F, 0F, 0F); // Box 0
		bodyModel[236].setRotationPoint(3F, -3F, -2.94F);
		bodyModel[236].rotateAngleY = -0.16580628F;

		bodyModel[237].addShapeBox(0F, -12F, 5F, 4, 7, 1, 0F,0.32F, 0F, 0.04F, -4.32F, 0F, 0.04F, -4.49F, 0F, -0.06F, 0.49F, 0F, -0.06F, 0.325F, 0F, 0.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.06F); // Box 0
		bodyModel[237].setRotationPoint(3F, -3F, -2.94F);
		bodyModel[237].rotateAngleY = -0.16580628F;

		bodyModel[238].addShapeBox(0.5F, -13F, 0.5F, 1, 8, 0, 0F,0.075F, -1F, 0.01F, -1.075F, 0F, 0.01F, -1.075F, 0F, -0.01F, 0.075F, -1F, -0.01F, -3.5F, 0F, 0.03F, 3.5F, 0F, 0.03F, 3.5F, 0F, -0.03F, -3.5F, 0F, -0.03F); // Box 0
		bodyModel[238].setRotationPoint(3F, -3F, -2.91F);
		bodyModel[238].rotateAngleY = -0.16580628F;

		bodyModel[239].addShapeBox(-0.5F, -13F, 5.5F, 1, 8, 0, 0F,-0.085F, -1F, 0F, -0.915F, 0F, 0F, -0.915F, 0F, 0F, -0.085F, -1F, 0F, -4.5F, 0F, -0.06F, 4.5F, 0F, -0.06F, 4.5F, 0F, 0.06F, -4.5F, 0F, 0.06F); // Box 0
		bodyModel[239].setRotationPoint(3F, -3F, -3F);
		bodyModel[239].rotateAngleY = -0.16580628F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[240].setRotationPoint(2.5F, -16F, -2.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[241].setRotationPoint(2.5F, -16F, 2.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 2
		bodyModel[242].setRotationPoint(12F, -17F, -5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[243].setRotationPoint(-32F, -17F, -5F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 14, 5, 0F); // Box 2
		bodyModel[244].setRotationPoint(-17.5F, -9F, -5F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 2
		bodyModel[245].setRotationPoint(-16.5F, -9F, -1F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 2
		bodyModel[246].setRotationPoint(-19.5F, -9F, 4F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 14, 5, 0F); // Box 2
		bodyModel[247].setRotationPoint(-7.5F, -9F, -5F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 2
		bodyModel[248].setRotationPoint(-11.5F, -9F, -1F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 14, 5, 0F); // Box 2
		bodyModel[249].setRotationPoint(-7.5F, -9F, 5F);

		bodyModel[250].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 2
		bodyModel[250].setRotationPoint(-11.5F, -9F, 5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 2
		bodyModel[251].setRotationPoint(-7.5F, -9F, -6F);

		bodyModel[252].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 2
		bodyModel[252].setRotationPoint(-11.5F, -9F, 0F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[253].setRotationPoint(-11.5F, -7F, -6F);

		bodyModel[254].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[254].setRotationPoint(-11.5F, 1F, -6F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 2
		bodyModel[255].setRotationPoint(-11.5F, -3F, -6F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 2
		bodyModel[256].setRotationPoint(-3.5F, -9F, -6F);

		bodyModel[257].addBox(0F, 0F, 0F, 5, 14, 1, 0F); // Box 2
		bodyModel[257].setRotationPoint(-2.5F, -9F, -1F);

		bodyModel[258].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 2
		bodyModel[258].setRotationPoint(-3.5F, 1F, 0F);

		bodyModel[259].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 2
		bodyModel[259].setRotationPoint(-2.5F, -7F, -6F);

		bodyModel[260].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 2
		bodyModel[260].setRotationPoint(-2.5F, 1F, -6F);

		bodyModel[261].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 2
		bodyModel[261].setRotationPoint(-2.5F, -3F, -6F);

		bodyModel[262].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 2 step
		bodyModel[262].setRotationPoint(1.5F, 3F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[263].setRotationPoint(0.5F, -2F, 8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[264].setRotationPoint(-6.5F, -2F, 8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[265].setRotationPoint(-3F, -2F, 9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[266].setRotationPoint(-26F, 1F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[267].setRotationPoint(-26F, -2.5F, -5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-0.01F, 0F, -1.01F, -0.5F, 0F, -1.01F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4.01F, -1.01F, -0.5F, -4.01F, -1.01F, -0.5F, -4.01F, 0F, -0.01F, -4.01F, 0F); // Right seat part cull
		bodyModel[268].setRotationPoint(-26.5F, 0F, -6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-0.01F, 0F, -1.01F, -0.5F, 0F, -1.01F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4.01F, -1.01F, -0.5F, -4.01F, -1.01F, -0.5F, -4.01F, 0F, -0.01F, -4.01F, 0F); // Right seat part cull
		bodyModel[269].setRotationPoint(-21F, 0F, -6F);

		bodyModel[270].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Boc 42
		bodyModel[270].setRotationPoint(-26.5F, 3F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[271].setRotationPoint(-11.11F, 2F, 7.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[272].setRotationPoint(-11F, 3F, 8.03F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[273].setRotationPoint(-11F, 4.5F, 7.53F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[274].setRotationPoint(-3F, 1F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.13F, 0F, 0F, -0.13F, 0F); // Right seat part
		bodyModel[275].setRotationPoint(-3F, -2.5F, -5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, -1.01F, -0.51F, 0F, -1.01F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, -4.01F, -1.01F, -0.51F, -4.01F, -1.01F, -0.51F, -4.01F, 0F, 0F, -4.01F, 0F); // Right seat part cull
		bodyModel[276].setRotationPoint(-3.5F, 0F, -6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, -4.01F, -1F, -0.51F, -4.01F, -1F, -0.51F, -4.01F, 0F, 0F, -4.01F, 0F); // Right seat part cull
		bodyModel[277].setRotationPoint(2F, 0F, -6F);

		bodyModel[278].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Boc 42
		bodyModel[278].setRotationPoint(-3.5F, 3F, -5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[279].setRotationPoint(0.5F, -2F, 2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[280].setRotationPoint(-14.5F, -2F, 6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[281].setRotationPoint(-14.5F, -2F, 1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[282].setRotationPoint(-11.5F, -2F, 1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[283].setRotationPoint(-22.5F, 1F, 6.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[284].setRotationPoint(-22.5F, 2F, 6.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[285].setRotationPoint(-22.5F, -1F, 6.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[286].setRotationPoint(-25.5F, 1F, 7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[287].setRotationPoint(-25.5F, 2F, 7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[288].setRotationPoint(-23.5F, -1F, 7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[289].setRotationPoint(-25.5F, 1F, 3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[290].setRotationPoint(-25.5F, 2F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[291].setRotationPoint(-23.5F, -1F, 3F);

		bodyModel[292].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[292].setRotationPoint(-21.5F, 2F, 8F);
		bodyModel[292].rotateAngleY = -0.78539816F;

		bodyModel[293].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[293].setRotationPoint(-24.5F, 2F, 4F);
		bodyModel[293].rotateAngleY = -0.78539816F;

		bodyModel[294].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[294].setRotationPoint(-24.5F, 2F, 8F);
		bodyModel[294].rotateAngleY = -0.78539816F;

		bodyModel[295].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[295].setRotationPoint(-18.5F, 1F, 5F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 2
		bodyModel[296].setRotationPoint(-21.5F, -1F, 5F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 2
		bodyModel[297].setRotationPoint(-26.5F, -1F, 2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[298].setRotationPoint(-18.5F, -2F, 9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[299].setRotationPoint(-18.5F, -2F, 8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 0, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[300].setRotationPoint(-14.5F, -2F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[301].setRotationPoint(-4.5F, -1.99F, 9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[302].setRotationPoint(-9.5F, -1F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 0, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -5.5F, 0.25F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -5.5F, 0.25F, 0F, -5.5F); // Box 2
		bodyModel[303].setRotationPoint(-16.9F, -9F, 0F);
		bodyModel[303].rotateAngleY = 0.43633231F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 2
		bodyModel[304].setRotationPoint(-6.75F, -9F, 0F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 14, 15, 0F); // Box 2
		bodyModel[305].setRotationPoint(-7.5F, -9F, -5F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 2
		bodyModel[306].setRotationPoint(-11.5F, -9F, 2F);

		bodyModel[307].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[307].setRotationPoint(51.5F, -15F, -4F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 128
		bodyModel[308].setRotationPoint(50.5F, -15F, 5F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[309].setRotationPoint(50.5F, -5F, 3F);

		bodyModel[310].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 2
		bodyModel[310].setRotationPoint(51F, -15F, 3F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 2
		bodyModel[311].setRotationPoint(50.5F, -15F, 3F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 16, 3, 0F); // Box 128
		bodyModel[312].setRotationPoint(51.5F, -15F, 7F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 128
		bodyModel[313].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[314].setRotationPoint(50.5F, -5F, -5F);

		bodyModel[315].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 2
		bodyModel[315].setRotationPoint(51F, -15F, -5F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 16, 3, 0F); // Box 128
		bodyModel[316].setRotationPoint(51.5F, -15F, -10F);

		bodyModel[317].addBox(0F, 0F, 0F, 29, 2, 8, 0F); // Box 2
		bodyModel[317].setRotationPoint(-26.5F, -12F, 2F);

		bodyModel[318].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 2
		bodyModel[318].setRotationPoint(-26.5F, -12F, -6F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 2
		bodyModel[319].setRotationPoint(-57.5F, -5F, -5F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 10, 2, 0F); // Box 2
		bodyModel[320].setRotationPoint(-57F, -15F, -5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 128
		bodyModel[321].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 128
		bodyModel[322].setRotationPoint(-57.5F, -15F, -10F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 2
		bodyModel[323].setRotationPoint(-27.5F, -20F, -3F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.15F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[324].setRotationPoint(-27.5F, -20F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0.15F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 896
		bodyModel[325].setRotationPoint(-27.5F, -20F, 3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1.7F, 0F, 0.15F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[326].setRotationPoint(2.5F, -20F, -10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 896
		bodyModel[327].setRotationPoint(2.5F, -20F, 3F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 128
		bodyModel[328].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 16, 7, 0F); // Box 128
		bodyModel[329].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[330].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[331].setRotationPoint(50.5F, -15F, 3F);

		bodyModel[332].addShapeBox(-2F, -1F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Conductor's desk
		bodyModel[332].setRotationPoint(55.5F, -4F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, -1F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Conductor's door
		bodyModel[333].setRotationPoint(51.5F, -5F, 4.01F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 38
		bodyModel[334].setRotationPoint(54.5F, -15F, 4F);

		bodyModel[335].addShapeBox(0F, -1F, 0F, 3, 1, 6, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F); // Conductor's seat
		bodyModel[335].setRotationPoint(50.5F, -2F, 4F);
		bodyModel[335].rotateAngleZ = -1.57079633F;

		bodyModel[336].addBox(0F, 0F, 0F, 0, 16, 7, 0F); // Box 128
		bodyModel[336].setRotationPoint(50.5F, -15F, 3F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[337].setRotationPoint(53.5F, -15F, 3F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 38
		bodyModel[338].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, -0.35F, 0F, 0F, 0F); // Box 2
		bodyModel[339].setRotationPoint(3.5F, -5F, -6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[340].setRotationPoint(-32.5F, -17F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[341].setRotationPoint(-49.5F, -13F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[342].setRotationPoint(-49.5F, -14F, -10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[343].setRotationPoint(-55.5F, -13F, -10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[344].setRotationPoint(-55.5F, -14F, -10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyModel[345].setRotationPoint(-49.5F, -13F, 9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[346].setRotationPoint(-49.5F, -14F, 7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[347].setRotationPoint(-55.5F, -13F, 9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[348].setRotationPoint(-55.5F, -14F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[349].setRotationPoint(-32.5F, -13F, 9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[350].setRotationPoint(-32.5F, -14F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[351].setRotationPoint(-58.5F, -13F, 9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[352].setRotationPoint(-58.5F, -14F, 7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 916
		bodyModel[353].setRotationPoint(-58.5F, -13F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		bodyModel[354].setRotationPoint(-58.5F, -14F, -10F);

		bodyModel[355].addBox(0F, 0F, 0F, 32, 1, 3, 0F); // Box 275
		bodyModel[355].setRotationPoint(12.5F, -14F, -10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[356].setRotationPoint(12.5F, -13F, -10F);

		bodyModel[357].addBox(0F, 0F, 0F, 41, 1, 3, 0F); // Box 920
		bodyModel[357].setRotationPoint(3.5F, -14F, 7F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[358].setRotationPoint(3.5F, -13F, 9F);

		bodyModel[359].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 920
		bodyModel[359].setRotationPoint(44.5F, -14F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[360].setRotationPoint(44.5F, -13F, 9F);

		bodyModel[361].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 924
		bodyModel[361].setRotationPoint(44.5F, -14F, -10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 925
		bodyModel[362].setRotationPoint(44.5F, -13F, -10F);

		bodyModel[363].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 924
		bodyModel[363].setRotationPoint(50.5F, -14F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 925
		bodyModel[364].setRotationPoint(50.5F, -13F, -10F);

		bodyModel[365].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 924 cull
		bodyModel[365].setRotationPoint(44.5F, -15F, -10F);

		bodyModel[366].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 924 cull
		bodyModel[366].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[367].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 924 cull
		bodyModel[367].setRotationPoint(44.5F, -15F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 47, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[368].setRotationPoint(3.5F, -12.99F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 43, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[369].setRotationPoint(12.5F, -12.99F, -10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 34, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[370].setRotationPoint(-61.5F, -12.99F, 7F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 26, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[371].setRotationPoint(-58.5F, -12.99F, -10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[372].setRotationPoint(-60.5F, -13F, 9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[373].setRotationPoint(-60.5F, -14F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[374].setRotationPoint(-32.5F, -14.99F, -10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 11, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[375].setRotationPoint(-60.5F, -14.99F, -10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 11, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[376].setRotationPoint(44.5F, -14.99F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[377].setRotationPoint(34F, -17F, -0.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[378].setRotationPoint(22F, -17F, -0.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[379].setRotationPoint(10F, -17F, -0.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[380].setRotationPoint(46F, -15F, -0.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[381].setRotationPoint(-36F, -17F, -0.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[382].setRotationPoint(-50F, -17F, -0.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[383].setRotationPoint(-43F, -17F, -0.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 38 glow
		bodyModel[384].setRotationPoint(-25.5F, -24F, -3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F); // Box 950 glow
		bodyModel[385].setRotationPoint(-25.5F, -24F, 2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 950
		bodyModel[386].setRotationPoint(-25.5F, -24F, -2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.245F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.245F, 0F, 0F, 0.005F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.005F, -0.5F, 0F); // Box 950
		bodyModel[387].setRotationPoint(-26.75F, -24F, -2F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.245F, 0F, 0F, -0.245F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0.005F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 950
		bodyModel[388].setRotationPoint(1.75F, -24F, -2F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, -1.01F, -1.02F, 0F, -1.01F, -1.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.01F, -1.02F, 0F, -1.01F, -1.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 NP cull
		bodyModel[389].setRotationPoint(-48.5F, -14F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -1.01F, 0F, 0F, -1.01F); // Box 909 NP cull
		bodyModel[390].setRotationPoint(-48.5F, -14F, 7F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 13, 0, 4, 0F,0F, 0F, -1.01F, -1.02F, 0F, -1.01F, -1.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.01F, -1.02F, 0F, -1.01F, -1.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[391].setRotationPoint(-48.5F, -12.99F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 13, 0, 4, 0F,0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0F, -1.02F, 0F, 0F, -1.02F, 0F, -1.01F, 0F, 0F, -1.01F); // Box 909 glow
		bodyModel[392].setRotationPoint(-48.5F, -12.99F, 7F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0F, -1.01F, -2.02F, 0F, -1.01F, -2.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.01F, -2.02F, 0F, -1.01F, -2.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 NP cull
		bodyModel[393].setRotationPoint(12.51F, -14F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -1.01F, 0F, 0F, -1.01F); // Box 909 NP cull
		bodyModel[394].setRotationPoint(3.51F, -14F, 7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 31, 0, 4, 0F,0F, 0F, -1.01F, -2.02F, 0F, -1.01F, -2.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.01F, -2.02F, 0F, -1.01F, -2.02F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[395].setRotationPoint(12.51F, -12.99F, -11F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 41, 0, 4, 0F,0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0F, -3.02F, 0F, 0F, -3.02F, 0F, -1.01F, 0F, 0F, -1.01F); // Box 909 glow
		bodyModel[396].setRotationPoint(3.51F, -12.99F, 7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[397].setRotationPoint(52.5F, 4F, 10.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[398].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[399].setRotationPoint(34.5F, 3F, 10.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[400].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 29
		bodyModel[401].setRotationPoint(52.5F, 4F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[402].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[403].setRotationPoint(34.5F, 3F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[404].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[405].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[406].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 2
		bodyModel[407].setRotationPoint(-35.5F, 4F, 10.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 37
		bodyModel[408].setRotationPoint(-35.5F, 4F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[409].setRotationPoint(-53.5F, 3F, 10.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[410].setRotationPoint(-53.5F, 3F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull test
		bodyModel[411].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39 cull test
		bodyModel[412].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[413].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[414].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[415].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[416].setRotationPoint(-35F, 4F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[417].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[418].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[419].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[420].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[421].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[422].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[423].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[424].setRotationPoint(33F, 4F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[425].setRotationPoint(6.5F, 3F, 10.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[426].setRotationPoint(5.5F, 4F, 10.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[427].setRotationPoint(6.5F, 3F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[428].setRotationPoint(5.5F, 4F, -11F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[429].setRotationPoint(62.5F, -15F, -4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[430].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[431].setRotationPoint(62.5F, -14F, -4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[432].setRotationPoint(62.5F, -14F, 3F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[433].setRotationPoint(63F, -14F, -5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[434].setRotationPoint(63F, -14F, 3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[435].setRotationPoint(63F, 1F, -5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[436].setRotationPoint(63F, -15F, -5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[437].setRotationPoint(-63F, -15F, -4F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[438].setRotationPoint(-63F, 1F, -4F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[439].setRotationPoint(-63F, -14F, -4F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[440].setRotationPoint(-63F, -14F, 3F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[441].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[442].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[444].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[445].setRotationPoint(61.5F, -19F, -4F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[446].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[447].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[448].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[449].setRotationPoint(61.5F, -20F, -4F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		bodyModel[450].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[451].setRotationPoint(63F, -16F, -5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[452].setRotationPoint(63F, -16F, 0F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[454].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[455].setRotationPoint(61F, 4F, -10.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[456].setRotationPoint(61F, 4F, 9.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[457].setRotationPoint(61F, 3F, -10.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[458].setRotationPoint(61F, 3F, 4.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[459].setRotationPoint(-61.5F, 3F, -10.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[460].setRotationPoint(-61.5F, 4F, -10.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[461].setRotationPoint(-61.5F, 3F, 4.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[462].setRotationPoint(-61.5F, 4F, 9.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[463].setRotationPoint(61.5F, 1F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		bodyModel[464].setRotationPoint(61.5F, 1F, 4F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[465].setRotationPoint(-62.5F, -19F, -4F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[466].setRotationPoint(-62.5F, -14F, -4F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[467].setRotationPoint(-62.5F, -14F, 3F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[468].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[469].setRotationPoint(-62.5F, -20F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		bodyModel[470].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[471].setRotationPoint(-62.5F, 1F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1020
		bodyModel[472].setRotationPoint(-62.5F, 1F, 4F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[474].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(-63.5F, -17F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[476].setRotationPoint(63F, -16F, -5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[477].setRotationPoint(63F, -16F, 1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[478].setRotationPoint(63F, -17F, -1F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[479].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[480].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[481].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[482].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[483].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[484].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[485].setRotationPoint(63F, -15F, -11F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[486].setRotationPoint(63F, -16F, -11F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[487].setRotationPoint(63F, 1F, -10F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[488].setRotationPoint(63F, -19F, -10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[489].setRotationPoint(63F, -20F, -7F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[490].setRotationPoint(63F, -20F, -3F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[491].setRotationPoint(63F, -19F, -1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[492].setRotationPoint(63F, -15F, 10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[493].setRotationPoint(63F, -16F, 9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[494].setRotationPoint(63F, -19F, 7F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[495].setRotationPoint(63F, -20F, 3F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[496].setRotationPoint(61.5F, -19.75F, -7F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[497].setRotationPoint(62.5F, -20F, -3F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 254
		bodyModel[498].setRotationPoint(61.5F, -19.75F, 4F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[499].setRotationPoint(62.5F, -20F, -4F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 365, 81, textureX, textureY); // Box 254
		bodyModel[501] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[502] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[503] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 12, 105, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 128
		bodyModel[508] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[510] = new ModelRendererTurbo(this, 8, 78, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[512] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[513] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[514] = new ModelRendererTurbo(this, 28, 70, textureX, textureY); // Box 250
		bodyModel[515] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[516] = new ModelRendererTurbo(this, 27, 73, textureX, textureY); // Box 252
		bodyModel[517] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[518] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 25, 83, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 27, 77, textureX, textureY); // Box 254
		bodyModel[521] = new ModelRendererTurbo(this, 30, 90, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 30, 81, textureX, textureY); // Box 254
		bodyModel[523] = new ModelRendererTurbo(this, 377, 50, textureX, textureY); // Box 264
		bodyModel[524] = new ModelRendererTurbo(this, 377, 47, textureX, textureY); // Box 264
		bodyModel[525] = new ModelRendererTurbo(this, 286, 44, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 286, 47, textureX, textureY); // Box 1069
		bodyModel[527] = new ModelRendererTurbo(this, 94, 179, textureX, textureY); // Box 41
		bodyModel[528] = new ModelRendererTurbo(this, 94, 161, textureX, textureY); // Box 1071
		bodyModel[529] = new ModelRendererTurbo(this, 99, 339, textureX, textureY); // Box 276
		bodyModel[530] = new ModelRendererTurbo(this, 103, 301, textureX, textureY); // Box 1073
		bodyModel[531] = new ModelRendererTurbo(this, 91, 339, textureX, textureY); // Box 276
		bodyModel[532] = new ModelRendererTurbo(this, 3, 405, textureX, textureY); // Box 276
		bodyModel[533] = new ModelRendererTurbo(this, 18, 376, textureX, textureY); // Box 1076
		bodyModel[534] = new ModelRendererTurbo(this, 74, 405, textureX, textureY); // Box 276
		bodyModel[535] = new ModelRendererTurbo(this, 3, 376, textureX, textureY); // Box 1076
		bodyModel[536] = new ModelRendererTurbo(this, 93, 405, textureX, textureY); // Box 276
		bodyModel[537] = new ModelRendererTurbo(this, 96, 301, textureX, textureY); // Box 1073
		bodyModel[538] = new ModelRendererTurbo(this, 101, 172, textureX, textureY); // Box 52
		bodyModel[539] = new ModelRendererTurbo(this, 124, 172, textureX, textureY); // Box 52
		bodyModel[540] = new ModelRendererTurbo(this, 171, 176, textureX, textureY); // Box 41
		bodyModel[541] = new ModelRendererTurbo(this, 180, 177, textureX, textureY); // Box 41
		bodyModel[542] = new ModelRendererTurbo(this, 172, 177, textureX, textureY); // Box 41
		bodyModel[543] = new ModelRendererTurbo(this, 184, 176, textureX, textureY); // Box 52
		bodyModel[544] = new ModelRendererTurbo(this, 147, 176, textureX, textureY); // Box 52
		bodyModel[545] = new ModelRendererTurbo(this, 158, 176, textureX, textureY); // Box 41
		bodyModel[546] = new ModelRendererTurbo(this, 167, 177, textureX, textureY); // Box 41
		bodyModel[547] = new ModelRendererTurbo(this, 159, 177, textureX, textureY); // Box 41
		bodyModel[548] = new ModelRendererTurbo(this, 195, 174, textureX, textureY); // Box 52
		bodyModel[549] = new ModelRendererTurbo(this, 128, 161, textureX, textureY); // Box 2
		bodyModel[550] = new ModelRendererTurbo(this, 151, 161, textureX, textureY); // Box 2
		bodyModel[551] = new ModelRendererTurbo(this, 166, 161, textureX, textureY); // Box 2
		bodyModel[552] = new ModelRendererTurbo(this, 377, 156, textureX, textureY); // Box 2
		bodyModel[553] = new ModelRendererTurbo(this, 325, 156, textureX, textureY,"cull"); // Box 2 cull test
		bodyModel[554] = new ModelRendererTurbo(this, 181, 156, textureX, textureY); // Box 2
		bodyModel[555] = new ModelRendererTurbo(this, 129, 156, textureX, textureY,"cull"); // Box 2 cull test
		bodyModel[556] = new ModelRendererTurbo(this, 105, 156, textureX, textureY); // Box 2
		bodyModel[557] = new ModelRendererTurbo(this, 384, 156, textureX, textureY); // Box 2
		bodyModel[558] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 1104
		bodyModel[559] = new ModelRendererTurbo(this, 325, 145, textureX, textureY); // Box 1105
		bodyModel[560] = new ModelRendererTurbo(this, 181, 145, textureX, textureY); // Box 1108
		bodyModel[561] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 1109
		bodyModel[562] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 1110
		bodyModel[563] = new ModelRendererTurbo(this, 384, 145, textureX, textureY); // Box 1111
		bodyModel[564] = new ModelRendererTurbo(this, 346, 106, textureX, textureY); // Right step part
		bodyModel[565] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[566] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Left step part
		bodyModel[567] = new ModelRendererTurbo(this, 350, 59, textureX, textureY); // Left step part
		bodyModel[568] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[569] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[570] = new ModelRendererTurbo(this, 389, 138, textureX, textureY); // Box 2
		bodyModel[571] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 2
		bodyModel[572] = new ModelRendererTurbo(this, 404, 155, textureX, textureY); // Box 2
		bodyModel[573] = new ModelRendererTurbo(this, 404, 142, textureX, textureY); // Box 1141
		bodyModel[574] = new ModelRendererTurbo(this, 24, 143, textureX, textureY); // Box 2
		bodyModel[575] = new ModelRendererTurbo(this, 24, 156, textureX, textureY); // Box 1141
		bodyModel[576] = new ModelRendererTurbo(this, 229, 167, textureX, textureY); // Box 41
		bodyModel[577] = new ModelRendererTurbo(this, 238, 168, textureX, textureY); // Box 41
		bodyModel[578] = new ModelRendererTurbo(this, 230, 168, textureX, textureY); // Box 41
		bodyModel[579] = new ModelRendererTurbo(this, 242, 166, textureX, textureY); // Box 2
		bodyModel[580] = new ModelRendererTurbo(this, 206, 163, textureX, textureY); // Box 2
		bodyModel[581] = new ModelRendererTurbo(this, 261, 163, textureX, textureY); // Box 2
		bodyModel[582] = new ModelRendererTurbo(this, 282, 163, textureX, textureY); // Box 2
		bodyModel[583] = new ModelRendererTurbo(this, 307, 163, textureX, textureY); // Box 2
		bodyModel[584] = new ModelRendererTurbo(this, 332, 166, textureX, textureY); // Box 2
		bodyModel[585] = new ModelRendererTurbo(this, 347, 163, textureX, textureY); // Box 2
		bodyModel[586] = new ModelRendererTurbo(this, 210, 265, textureX, textureY); // Box 38
		bodyModel[587] = new ModelRendererTurbo(this, 213, 259, textureX, textureY); // Box 462
		bodyModel[588] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[589] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[590] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[591] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[592] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 128
		bodyModel[593] = new ModelRendererTurbo(this, 62, 101, textureX, textureY); // Box 204
		bodyModel[594] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[595] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[596] = new ModelRendererTurbo(this, 65, 151, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[597] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[598] = new ModelRendererTurbo(this, 65, 138, textureX, textureY); // Box 31
		bodyModel[599] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 74, 156, textureX, textureY); // Box 205
		bodyModel[601] = new ModelRendererTurbo(this, 65, 149, textureX, textureY); // Box 31
		bodyModel[602] = new ModelRendererTurbo(this, 89, 138, textureX, textureY); // Box 32
		bodyModel[603] = new ModelRendererTurbo(this, 87, 141, textureX, textureY); // Box 33
		bodyModel[604] = new ModelRendererTurbo(this, 94, 141, textureX, textureY); // Box 30
		bodyModel[605] = new ModelRendererTurbo(this, 94, 138, textureX, textureY); // Box 31
		bodyModel[606] = new ModelRendererTurbo(this, 89, 149, textureX, textureY); // Box 2
		bodyModel[607] = new ModelRendererTurbo(this, 87, 152, textureX, textureY); // Box 2
		bodyModel[608] = new ModelRendererTurbo(this, 94, 152, textureX, textureY); // Box 2
		bodyModel[609] = new ModelRendererTurbo(this, 94, 149, textureX, textureY); // Box 2
		bodyModel[610] = new ModelRendererTurbo(this, 403, 39, textureX, textureY); // Box 128
		bodyModel[611] = new ModelRendererTurbo(this, 392, 40, textureX, textureY); // Box 128
		bodyModel[612] = new ModelRendererTurbo(this, 389, 44, textureX, textureY); // Box 128
		bodyModel[613] = new ModelRendererTurbo(this, 389, 46, textureX, textureY); // Box 128
		bodyModel[614] = new ModelRendererTurbo(this, 416, 40, textureX, textureY); // Box 1143
		bodyModel[615] = new ModelRendererTurbo(this, 427, 44, textureX, textureY); // Box 1144
		bodyModel[616] = new ModelRendererTurbo(this, 427, 46, textureX, textureY); // Box 1145
		bodyModel[617] = new ModelRendererTurbo(this, 323, 322, textureX, textureY); // Box 2
		bodyModel[618] = new ModelRendererTurbo(this, 74, 319, textureX, textureY); // Box 128
		bodyModel[619] = new ModelRendererTurbo(this, 55, 334, textureX, textureY); // Box 128
		bodyModel[620] = new ModelRendererTurbo(this, 55, 325, textureX, textureY); // Box 128
		bodyModel[621] = new ModelRendererTurbo(this, 475, 255, textureX, textureY); // Box 2
		bodyModel[622] = new ModelRendererTurbo(this, 478, 295, textureX, textureY); // Box 2
		bodyModel[623] = new ModelRendererTurbo(this, 477, 298, textureX, textureY); // Box 2
		bodyModel[624] = new ModelRendererTurbo(this, 478, 268, textureX, textureY); // Box 2
		bodyModel[625] = new ModelRendererTurbo(this, 477, 271, textureX, textureY); // Box 2
		bodyModel[626] = new ModelRendererTurbo(this, 161, 275, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[627] = new ModelRendererTurbo(this, 34, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[628] = new ModelRendererTurbo(this, 12, 351, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[629] = new ModelRendererTurbo(this, 31, 240, textureX, textureY); // Box 128
		bodyModel[630] = new ModelRendererTurbo(this, 6, 237, textureX, textureY); // Box 128
		bodyModel[631] = new ModelRendererTurbo(this, 17, 253, textureX, textureY); // Box 128
		bodyModel[632] = new ModelRendererTurbo(this, 17, 231, textureX, textureY); // Box 176
		bodyModel[633] = new ModelRendererTurbo(this, 42, 256, textureX, textureY); // Box 128
		bodyModel[634] = new ModelRendererTurbo(this, 42, 234, textureX, textureY); // Box 176
		bodyModel[635] = new ModelRendererTurbo(this, 102, 322, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[636] = new ModelRendererTurbo(this, 113, 284, textureX, textureY,"cull"); // Box 911 cull
		bodyModel[637] = new ModelRendererTurbo(this, 100, 284, textureX, textureY,"cull"); // Box 911 cull
		bodyModel[638] = new ModelRendererTurbo(this, 89, 284, textureX, textureY,"cull"); // Box 911 cull
		bodyModel[639] = new ModelRendererTurbo(this, 161, 272, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[640] = new ModelRendererTurbo(this, 89, 322, textureX, textureY,"cull"); // Box 917 cull
		bodyModel[641] = new ModelRendererTurbo(this, 448, 315, textureX, textureY); // Box 2
		bodyModel[642] = new ModelRendererTurbo(this, 467, 318, textureX, textureY); // Box 2
		bodyModel[643] = new ModelRendererTurbo(this, 157, 108, textureX, textureY); // Box 69
		bodyModel[644] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[645] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[646] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[647] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[648] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[649] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[650] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[651] = new ModelRendererTurbo(this, 361, 53, textureX, textureY); // Box 26
		bodyModel[652] = new ModelRendererTurbo(this, 347, 57, textureX, textureY); // Left step part
		bodyModel[653] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[654] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[655] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[656] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[657] = new ModelRendererTurbo(this, 352, 56, textureX, textureY); // Left step part
		bodyModel[658] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[659] = new ModelRendererTurbo(this, 345, 53, textureX, textureY); // Box 26
		bodyModel[660] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[661] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[662] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[663] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[664] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[665] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 1353
		bodyModel[666] = new ModelRendererTurbo(this, 338, 84, textureX, textureY); // Box 1354
		bodyModel[667] = new ModelRendererTurbo(this, 329, 88, textureX, textureY); // Box 1355
		bodyModel[668] = new ModelRendererTurbo(this, 327, 85, textureX, textureY); // Box 1356
		bodyModel[669] = new ModelRendererTurbo(this, 338, 82, textureX, textureY); // Box 1357
		bodyModel[670] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 1358
		bodyModel[671] = new ModelRendererTurbo(this, 338, 88, textureX, textureY); // Box 1359
		bodyModel[672] = new ModelRendererTurbo(this, 322, 88, textureX, textureY); // Box 1360
		bodyModel[673] = new ModelRendererTurbo(this, 355, 103, textureX, textureY); // Box 1361
		bodyModel[674] = new ModelRendererTurbo(this, 339, 103, textureX, textureY); // Box 1362
		bodyModel[675] = new ModelRendererTurbo(this, 324, 96, textureX, textureY); // Right step part
		bodyModel[676] = new ModelRendererTurbo(this, 338, 96, textureX, textureY); // Right step part
		bodyModel[677] = new ModelRendererTurbo(this, 324, 98, textureX, textureY); // Right step part
		bodyModel[678] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Right step part
		bodyModel[679] = new ModelRendererTurbo(this, 344, 109, textureX, textureY); // Right step part
		bodyModel[680] = new ModelRendererTurbo(this, 341, 107, textureX, textureY); // Right step part
		bodyModel[681] = new ModelRendererTurbo(this, 355, 107, textureX, textureY); // Right step part
		bodyModel[682] = new ModelRendererTurbo(this, 174, 251, textureX, textureY); // Box 38
		bodyModel[683] = new ModelRendererTurbo(this, 191, 256, textureX, textureY); // Box 38
		bodyModel[684] = new ModelRendererTurbo(this, 174, 249, textureX, textureY); // Box 451
		bodyModel[685] = new ModelRendererTurbo(this, 191, 254, textureX, textureY); // Box 452
		bodyModel[686] = new ModelRendererTurbo(this, 92, 319, textureX, textureY); // Box 916
		bodyModel[687] = new ModelRendererTurbo(this, 90, 314, textureX, textureY); // Box 917
		bodyModel[688] = new ModelRendererTurbo(this, 90, 309, textureX, textureY,"cull"); // Box 917 cull
		bodyModel[689] = new ModelRendererTurbo(this, 468, 299, textureX, textureY); // Box 2
		bodyModel[690] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 340
		bodyModel[691] = new ModelRendererTurbo(this, 347, 285, textureX, textureY); // Box 340
		bodyModel[692] = new ModelRendererTurbo(this, 356, 297, textureX, textureY); // Box 340
		bodyModel[693] = new ModelRendererTurbo(this, 257, 181, textureX, textureY); // Box 38
		bodyModel[694] = new ModelRendererTurbo(this, 208, 244, textureX, textureY); // Box 1322
		bodyModel[695] = new ModelRendererTurbo(this, 169, 294, textureX, textureY); // Box 911

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 254
		bodyModel[500].setRotationPoint(62.5F, -20F, 3F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[501].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[502].setRotationPoint(-63F, -15F, -11F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[503].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[504].setRotationPoint(-63F, -15F, -11F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[505].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[506].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[507].setRotationPoint(-63F, -19F, -10F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[508].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[509].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[510].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[511].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[512].setRotationPoint(-63F, -15F, 11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[513].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[514].setRotationPoint(-63F, -15F, 9F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[515].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[516].setRotationPoint(-63F, -19F, 7F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[517].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[518].setRotationPoint(-63F, -19.75F, -7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[519].setRotationPoint(-63F, -20F, -3F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 254
		bodyModel[520].setRotationPoint(-63F, -19.75F, 4F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[521].setRotationPoint(-63F, -20F, -4F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 254
		bodyModel[522].setRotationPoint(-63F, -20F, 3F);

		bodyModel[523].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 264
		bodyModel[523].setRotationPoint(54.5F, -19.75F, -5.85F);
		bodyModel[523].rotateAngleY = -0.78539816F;

		bodyModel[524].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 264
		bodyModel[524].setRotationPoint(54.5F, -20.4F, -5.85F);
		bodyModel[524].rotateAngleY = -0.78539816F;

		bodyModel[525].addShapeBox(0F, 0F, 0F, 51, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[525].setRotationPoint(8.5F, -21F, -3F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 45, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1069
		bodyModel[526].setRotationPoint(8.5F, -21F, 3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[527].setRotationPoint(-34F, 3F, -10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		bodyModel[528].setRotationPoint(-34F, 3F, 9F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[529].setRotationPoint(-56.5F, -10.5F, -10F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1073
		bodyModel[530].setRotationPoint(-58.5F, -10.5F, 9F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[531].setRotationPoint(-58.5F, -10.5F, -10F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[532].setRotationPoint(12.5F, -10.5F, -10F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1076
		bodyModel[533].setRotationPoint(3.5F, -10.5F, 9F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[534].setRotationPoint(44.5F, -10.5F, -10F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1076
		bodyModel[535].setRotationPoint(44.5F, -10.5F, 9F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
		bodyModel[536].setRotationPoint(50.5F, -10.5F, -10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1073
		bodyModel[537].setRotationPoint(-60.5F, -10.5F, 9F);

		bodyModel[538].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[538].setRotationPoint(10.5F, 3F, -9F);

		bodyModel[539].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[539].setRotationPoint(18.5F, 3F, -9F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[540].setRotationPoint(28.5F, 3.2F, -10F);
		bodyModel[540].rotateAngleZ = -0.78539816F;

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[541].setRotationPoint(28F, 3F, -5.99F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[542].setRotationPoint(28F, 3F, -10.01F);

		bodyModel[543].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 52
		bodyModel[543].setRotationPoint(30.5F, 3F, -9F);

		bodyModel[544].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 52
		bodyModel[544].setRotationPoint(27.5F, 3F, -9F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[545].setRotationPoint(32.5F, 3.2F, -10F);
		bodyModel[545].rotateAngleZ = -0.78539816F;

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[546].setRotationPoint(32F, 3F, -5.99F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[547].setRotationPoint(32F, 3F, -10.01F);

		bodyModel[548].addBox(0F, 0F, 0F, 14, 5, 5, 0F); // Box 52
		bodyModel[548].setRotationPoint(19.5F, 3F, -9F);

		bodyModel[549].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 2
		bodyModel[549].setRotationPoint(17.5F, 3F, 4F);

		bodyModel[550].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[550].setRotationPoint(24.5F, 3F, 4F);

		bodyModel[551].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[551].setRotationPoint(27.5F, 3F, 4F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[552].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[553].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[554].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[555].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[556].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[557].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		bodyModel[558].setRotationPoint(54.5F, 4F, -11.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		bodyModel[559].setRotationPoint(33.5F, 4F, -11.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		bodyModel[560].setRotationPoint(-33.5F, 4F, -11.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		bodyModel[561].setRotationPoint(-54.5F, 4F, -11.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1110
		bodyModel[562].setRotationPoint(-61.5F, 4F, -11.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		bodyModel[563].setRotationPoint(60.5F, 4F, -11.5F);

		bodyModel[564].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[564].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[565].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[565].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[566].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[566].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[567].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[567].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[568].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[569].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[570].setRotationPoint(61F, 4F, -10F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[571].setRotationPoint(-61.5F, 4F, -10F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[572].setRotationPoint(61F, 4F, 10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		bodyModel[573].setRotationPoint(61F, 4F, -11F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[574].setRotationPoint(-61.5F, 4F, 10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		bodyModel[575].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[576].setRotationPoint(25.5F, 3.2F, 5F);
		bodyModel[576].rotateAngleZ = -0.78539816F;

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[577].setRotationPoint(25F, 3F, 9.01F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[578].setRotationPoint(25F, 3F, 4.99F);

		bodyModel[579].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 2
		bodyModel[579].setRotationPoint(29.5F, 3F, 4F);

		bodyModel[580].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 2
		bodyModel[580].setRotationPoint(17.5F, 3F, 4F);

		bodyModel[581].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 2
		bodyModel[581].setRotationPoint(5.5F, 3F, 4F);

		bodyModel[582].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 2
		bodyModel[582].setRotationPoint(13.5F, 3F, 4F);

		bodyModel[583].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 2
		bodyModel[583].setRotationPoint(22.5F, 3F, 4F);

		bodyModel[584].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 2
		bodyModel[584].setRotationPoint(30.5F, 3F, 4F);

		bodyModel[585].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 2
		bodyModel[585].setRotationPoint(26.5F, 3F, 4F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 114, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[586].setRotationPoint(-58.5F, -10F, -9.9F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 111, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[587].setRotationPoint(-60.5F, -10F, 9.9F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[588].setRotationPoint(56F, -6F, -12F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[589].setRotationPoint(61F, -6F, -12F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[590].setRotationPoint(56F, -6F, 11F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[591].setRotationPoint(61F, -6F, 11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[592].setRotationPoint(-61.5F, -4.5F, -12F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[593].setRotationPoint(-61.5F, -4.5F, 11F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[594].setRotationPoint(-61.5F, -1F, -12F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[595].setRotationPoint(-61.5F, -1F, 11F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[596].setRotationPoint(-60.5F, 3F, 10.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[597].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[598].setRotationPoint(-60.5F, 5F, -11F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[599].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[600].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[601].setRotationPoint(-60.5F, 5F, 10.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[602].setRotationPoint(-55.25F, 3F, -11F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[603].setRotationPoint(-57F, 4F, -11F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[604].setRotationPoint(-56.5F, 4F, -11F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[605].setRotationPoint(-55.5F, 3F, -11F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[606].setRotationPoint(-55.25F, 3F, 10.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[607].setRotationPoint(-57F, 4F, 10.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[608].setRotationPoint(-56.5F, 4F, 10.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[609].setRotationPoint(-55.5F, 3F, 10.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 0, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[610].setRotationPoint(-58.5F, -24F, -3F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -3F, 1F, 0F); // Box 128
		bodyModel[611].setRotationPoint(-58.5F, -24F, 3F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 128
		bodyModel[612].setRotationPoint(-55.5F, -23F, 8F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 1.2F, -0.25F, 0F, -1.2F, -0.25F, 0F); // Box 128
		bodyModel[613].setRotationPoint(-55.5F, -22F, 9F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1143
		bodyModel[614].setRotationPoint(-58.5F, -24F, -8F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1144
		bodyModel[615].setRotationPoint(-55.5F, -23F, -9F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,-0.6F, 0F, -1F, 0.6F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1.2F, -0.25F, 0F, 1.2F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 1145
		bodyModel[616].setRotationPoint(-55.5F, -22F, -10F);

		bodyModel[617].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 2
		bodyModel[617].setRotationPoint(-6.5F, -11F, -10F);

		bodyModel[618].addBox(0F, 0F, 0F, 0, 16, 7, 0F); // Box 128
		bodyModel[618].setRotationPoint(-58.5F, -15F, -10F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[619].setRotationPoint(-60.5F, -5F, -10F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[620].setRotationPoint(-60.5F, -10F, -10F);

		bodyModel[621].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 2
		bodyModel[621].setRotationPoint(2.5F, -12F, -6F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[622].setRotationPoint(1.5F, -16F, -2.49F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[623].setRotationPoint(1.5F, -14F, -3F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[624].setRotationPoint(1.5F, -16F, 2.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[625].setRotationPoint(1.5F, -14F, 2F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[626].setRotationPoint(-29.5F, -17F, -1.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[627].setRotationPoint(26F, -17F, -0.5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[628].setRotationPoint(18F, -17F, -0.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[629].setRotationPoint(-55.5F, -17F, -7F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[630].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[631].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[632].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[633].setRotationPoint(-55.5F, -18F, -10F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[634].setRotationPoint(-55.5F, -18F, 7F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275 cull
		bodyModel[635].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911 cull
		bodyModel[636].setRotationPoint(-55.5F, -15F, 7F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911 cull
		bodyModel[637].setRotationPoint(-58.5F, -15F, 7F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911 cull
		bodyModel[638].setRotationPoint(-60.5F, -15F, 7F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[639].setRotationPoint(-31F, -15F, -0.5F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917 cull
		bodyModel[640].setRotationPoint(-58.5F, -15F, -10F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[641].setRotationPoint(9.5F, -5F, -10F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[642].setRotationPoint(11.5F, -17F, -10F);

		bodyModel[643].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 69
		bodyModel[643].setRotationPoint(2.5F, 1F, -6F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[644].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[645].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[646].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[647].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[648].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[648].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[649].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[649].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[650].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[650].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[651].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[652].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[652].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[653].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[654].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[655].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[656].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[657].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[657].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[658].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[658].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[659].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[660].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[660].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[661].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[661].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[662].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[662].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[663].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[663].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[664].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[664].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[665].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[666].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[667].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[668].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[669].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[670].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[671].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[672].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1361
		bodyModel[673].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1362
		bodyModel[674].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[675].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[675].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[676].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[676].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[677].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[677].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[678].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[678].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[679].addShapeBox(0F, 2F, 1F, 4, 0, 2, 0F,0F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.02F, -1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[679].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[680].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[680].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[681].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[681].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[682].addBox(0F, 0F, 0F, 113, 2, 0, 0F); // Box 38
		bodyModel[682].setRotationPoint(-57.5F, -14.5F, -11.01F);

		bodyModel[683].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 38
		bodyModel[683].setRotationPoint(-49F, -2.5F, -11.01F);

		bodyModel[684].addBox(0F, 0F, 0F, 113, 2, 0, 0F); // Box 451
		bodyModel[684].setRotationPoint(-57.5F, -14.5F, 11.01F);

		bodyModel[685].addBox(0F, 0F, 0F, 96, 1, 0, 0F); // Box 452
		bodyModel[685].setRotationPoint(-49F, -2.5F, 11.01F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 916
		bodyModel[686].setRotationPoint(-56.5F, -13F, -10F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		bodyModel[687].setRotationPoint(-56.5F, -14F, -10F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917 cull
		bodyModel[688].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F); // Box 2
		bodyModel[689].setRotationPoint(3.5F, -5F, -4F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[690].setRotationPoint(0.5F, -2F, 5F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[691].setRotationPoint(-3F, -3F, 9.99F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 2, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[692].setRotationPoint(-11.5F, -2F, 0F);

		bodyModel[693].addBox(0F, 0F, 0F, 95, 4, 1, 0F); // Box 38
		bodyModel[693].setRotationPoint(-45F, -10F, -11F);

		bodyModel[694].addBox(0F, 0F, 0F, 95, 4, 1, 0F); // Box 1322
		bodyModel[694].setRotationPoint(-55F, -10F, 10F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[695].setRotationPoint(-32.5F, -15F, 7F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	ModelPS_Truck_41CDO bogie2 = new ModelPS_Truck_41CDO();
	ModelBuddDomeLowerSeatsType1 SeatsL1 = new ModelBuddDomeLowerSeatsType1();
	ModelBuddDomeLowerSeatsType2 SeatsL2 = new ModelBuddDomeLowerSeatsType2();
	ModelBuddDomeUpperSeatsType1 SeatsU1 = new ModelBuddDomeUpperSeatsType1();
	ModelBuddDomeUpperSeatsType2 SeatsU2 = new ModelBuddDomeUpperSeatsType2();
	ModelBuddDomeUpperSeatsType3 SeatsU3 = new ModelBuddDomeUpperSeatsType3();
	ModelBuddDomeUpperSeatsType4 SeatsU4 = new ModelBuddDomeUpperSeatsType4();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 696; i++)
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
		if(GetColor(entity)==6||
				GetColor(entity)==12||
				GetColor(entity)==5||
				GetColor(entity)==16){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			if(GetColor(entity)==6){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Cyan.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==12){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_LightBlue.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==5){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Purple.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==16){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin16.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
		} else if(GetColor(entity)==2||
				GetColor(entity)==10||
				GetColor(entity)==14||
				GetColor(entity)==4||
				GetColor(entity)==0||
				GetColor(entity)==13||
				GetColor(entity)==17){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.75, -0.03, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			if(GetColor(entity)==2){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Green.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==10){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Lime.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==14){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Orange.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU2.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==4){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Blue.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU2.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==0){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Black.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU2.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==13){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Magenta.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==17){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin17.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU3.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
		}else if(GetColor(entity)==21){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_ATpurple.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(-2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(0, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin21.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(0, 0, 0, 0);
			GL11.glTranslated(0, 0, 0);
			SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

			GL11.glRotatef(0, 0, 0, 0);
			GL11.glTranslated(0, 0, 0);
			SeatsU4.render(entity, f, f1, f2, f3, f4, f5);//upper seats
			GL11.glPopMatrix();
		}else if(GetColor(entity)==123456){
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
			if(GetColor(entity)==8){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Grey.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==7){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_LightGrey.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==15){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_White.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==3){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Brown.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==11){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Yellow.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==1){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Red.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==9){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Pink.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==18){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin18.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL1.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==19){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin19.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU1.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
			else if(GetColor(entity)==20){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Budd_lightweight_Dome46SeatCoach_Skin20.png"));
				GL11.glPushMatrix();
				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsL2.render(entity, f, f1, f2, f3, f4, f5);//lower seats

				GL11.glRotatef(0, 0, 0, 0);
				GL11.glTranslated(0, 0, 0);
				SeatsU2.render(entity, f, f1, f2, f3, f4, f5);//upper seats
				GL11.glPopMatrix();
			}
		}
	}
}