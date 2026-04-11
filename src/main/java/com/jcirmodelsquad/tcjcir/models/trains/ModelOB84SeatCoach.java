//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41E;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelOB84SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOB84SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[680];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 60, 111, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 40, 126, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 339, 137, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 311, 138, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 49, 138, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 76, 138, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 310, 142, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 79, 69, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 79, 91, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 13, 60, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 13, 90, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 357, 94, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 357, 72, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 72, 50, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 72, 32, textureX, textureY); // Box 168
		bodyModel[18] = new ModelRendererTurbo(this, 390, 72, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 394, 110, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 406, 93, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 414, 93, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 399, 92, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 421, 92, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 405, 110, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 401, 80, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 27, 124, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 14, 152, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 8, 135, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 17, 135, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 24, 134, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 4, 122, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 370, 68, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 328, 126, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 51, 118, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 62, 135, textureX, textureY); // Trapdoor FL
		bodyModel[39] = new ModelRendererTurbo(this, 64, 121, textureX, textureY); // Trapdoor FR
		bodyModel[40] = new ModelRendererTurbo(this, 307, 118, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 304, 135, textureX, textureY); // Trapdoor RL
		bodyModel[42] = new ModelRendererTurbo(this, 302, 121, textureX, textureY); // Trapdoor RR
		bodyModel[43] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 45, 66, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 30, 81, textureX, textureY); // Vestibule door F
		bodyModel[46] = new ModelRendererTurbo(this, 30, 73, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 325, 66, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 325, 88, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 342, 81, textureX, textureY); // Vestibule door R
		bodyModel[50] = new ModelRendererTurbo(this, 5, 86, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 4, 55, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 379, 93, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 379, 71, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 398, 82, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 414, 82, textureX, textureY); // Box 153
		bodyModel[56] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 17, 124, textureX, textureY); // Box 153
		bodyModel[58] = new ModelRendererTurbo(this, 8, 95, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 8, 65, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 79, 65, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 79, 107, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 47, 117, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 6, 88, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 51, 139, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 56, 119, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 73, 58, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[72] = new ModelRendererTurbo(this, 73, 207, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 73, 216, textureX, textureY); // Box 177
		bodyModel[74] = new ModelRendererTurbo(this, 296, 317, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 335, 64, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 1, 255, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 1, 275, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 1, 268, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 298, 249, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 314, 245, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 314, 269, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 297, 275, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 297, 308, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 297, 310, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 342, 72, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 343, 74, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 342, 103, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 343, 105, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 30, 103, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 39, 66, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 30, 64, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 39, 105, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 65
		bodyModel[96] = new ModelRendererTurbo(this, 89, 234, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 394, 76, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 394, 98, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 374, 98, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 374, 76, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 326, 117, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 327, 119, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 331, 139, textureX, textureY); // Box 104
		bodyModel[107] = new ModelRendererTurbo(this, 311, 86, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 311, 64, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 65, 86, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 77, 159, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 311, 89, textureX, textureY); // Side door RR part
		bodyModel[113] = new ModelRendererTurbo(this, 311, 92, textureX, textureY); // Side door RR part
		bodyModel[114] = new ModelRendererTurbo(this, 308, 86, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 308, 64, textureX, textureY); // Box 120
		bodyModel[116] = new ModelRendererTurbo(this, 76, 86, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 76, 64, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Side door RL part
		bodyModel[119] = new ModelRendererTurbo(this, 311, 70, textureX, textureY); // Side door RL part
		bodyModel[120] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Side door FR part
		bodyModel[121] = new ModelRendererTurbo(this, 65, 92, textureX, textureY); // Side door FR part
		bodyModel[122] = new ModelRendererTurbo(this, 65, 67, textureX, textureY); // Side door FL part
		bodyModel[123] = new ModelRendererTurbo(this, 65, 70, textureX, textureY); // Side door FL part
		bodyModel[124] = new ModelRendererTurbo(this, 76, 108, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 76, 135, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 308, 108, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 308, 135, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 347, 48, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 357, 41, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 323, 58, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 334, 59, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 314, 58, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 368, 38, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 347, 23, textureX, textureY); // Box 147
		bodyModel[135] = new ModelRendererTurbo(this, 357, 33, textureX, textureY); // Box 148
		bodyModel[136] = new ModelRendererTurbo(this, 323, 18, textureX, textureY); // Box 149
		bodyModel[137] = new ModelRendererTurbo(this, 334, 19, textureX, textureY); // Box 150
		bodyModel[138] = new ModelRendererTurbo(this, 314, 18, textureX, textureY); // Box 151
		bodyModel[139] = new ModelRendererTurbo(this, 368, 30, textureX, textureY); // Box 152
		bodyModel[140] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 346, 33, textureX, textureY); // Box 154
		bodyModel[142] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 366, 47, textureX, textureY); // Box 128
		bodyModel[144] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 158
		bodyModel[145] = new ModelRendererTurbo(this, 315, 48, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 366, 22, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 315, 24, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 332, 49, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 332, 25, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 342, 49, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 342, 25, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 326, 41, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 315, 41, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 326, 34, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 315, 34, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 30, 40, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 154
		bodyModel[158] = new ModelRendererTurbo(this, 37, 41, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 37, 34, textureX, textureY); // Box 158
		bodyModel[160] = new ModelRendererTurbo(this, 53, 58, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 42, 59, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 52, 18, textureX, textureY); // Box 149
		bodyModel[164] = new ModelRendererTurbo(this, 41, 19, textureX, textureY); // Box 150
		bodyModel[165] = new ModelRendererTurbo(this, 63, 18, textureX, textureY); // Box 151
		bodyModel[166] = new ModelRendererTurbo(this, 4, 38, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 152
		bodyModel[168] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 4, 22, textureX, textureY); // Box 163
		bodyModel[170] = new ModelRendererTurbo(this, 19, 48, textureX, textureY); // Box 135
		bodyModel[171] = new ModelRendererTurbo(this, 15, 41, textureX, textureY); // Box 136
		bodyModel[172] = new ModelRendererTurbo(this, 19, 23, textureX, textureY); // Box 147
		bodyModel[173] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 148
		bodyModel[174] = new ModelRendererTurbo(this, 55, 48, textureX, textureY); // Box 128
		bodyModel[175] = new ModelRendererTurbo(this, 55, 24, textureX, textureY); // Box 164
		bodyModel[176] = new ModelRendererTurbo(this, 40, 49, textureX, textureY); // Box 128
		bodyModel[177] = new ModelRendererTurbo(this, 40, 25, textureX, textureY); // Box 166
		bodyModel[178] = new ModelRendererTurbo(this, 38, 49, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 168
		bodyModel[180] = new ModelRendererTurbo(this, 50, 41, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 61, 41, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 50, 34, textureX, textureY); // Box 171
		bodyModel[183] = new ModelRendererTurbo(this, 61, 34, textureX, textureY); // Box 172
		bodyModel[184] = new ModelRendererTurbo(this, 32, 152, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 63, 152, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 35, 151, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 32, 156, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 47, 148, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 38, 148, textureX, textureY); // Box 2
		bodyModel[194] = new ModelRendererTurbo(this, 39, 160, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 49, 151, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 40, 151, textureX, textureY); // Box 2
		bodyModel[197] = new ModelRendererTurbo(this, 18, 118, textureX, textureY); // Box 216
		bodyModel[198] = new ModelRendererTurbo(this, 44, 109, textureX, textureY); // Box 217
		bodyModel[199] = new ModelRendererTurbo(this, 44, 115, textureX, textureY); // Box 218
		bodyModel[200] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 219
		bodyModel[201] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 220
		bodyModel[202] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 221
		bodyModel[203] = new ModelRendererTurbo(this, 21, 117, textureX, textureY); // Box 222
		bodyModel[204] = new ModelRendererTurbo(this, 18, 122, textureX, textureY); // Box 223
		bodyModel[205] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Box 224
		bodyModel[206] = new ModelRendererTurbo(this, 24, 114, textureX, textureY); // Box 225
		bodyModel[207] = new ModelRendererTurbo(this, 24, 126, textureX, textureY); // Box 226
		bodyModel[208] = new ModelRendererTurbo(this, 35, 117, textureX, textureY); // Box 227
		bodyModel[209] = new ModelRendererTurbo(this, 26, 117, textureX, textureY); // Box 228
		bodyModel[210] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 330, 145, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 335, 152, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 335, 156, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 307, 151, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 304, 156, textureX, textureY); // Box 128
		bodyModel[218] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 319, 160, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 312, 151, textureX, textureY); // Box 2
		bodyModel[222] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 336, 116, textureX, textureY); // Box 216
		bodyModel[224] = new ModelRendererTurbo(this, 354, 113, textureX, textureY); // Box 217
		bodyModel[225] = new ModelRendererTurbo(this, 354, 119, textureX, textureY); // Box 218
		bodyModel[226] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Box 219
		bodyModel[227] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Box 220
		bodyModel[228] = new ModelRendererTurbo(this, 337, 109, textureX, textureY); // Box 221
		bodyModel[229] = new ModelRendererTurbo(this, 339, 115, textureX, textureY); // Box 222
		bodyModel[230] = new ModelRendererTurbo(this, 336, 120, textureX, textureY); // Box 223
		bodyModel[231] = new ModelRendererTurbo(this, 343, 112, textureX, textureY); // Box 224
		bodyModel[232] = new ModelRendererTurbo(this, 343, 118, textureX, textureY); // Box 225
		bodyModel[233] = new ModelRendererTurbo(this, 343, 130, textureX, textureY); // Box 226
		bodyModel[234] = new ModelRendererTurbo(this, 345, 115, textureX, textureY); // Box 227
		bodyModel[235] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 228
		bodyModel[236] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 128
		bodyModel[237] = new ModelRendererTurbo(this, 297, 159, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 89, 159, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 259, 155, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 84, 162, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 84, 159, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 112, 159, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 117, 162, textureX, textureY); // Box 128
		bodyModel[244] = new ModelRendererTurbo(this, 117, 159, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 77, 155, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 264, 159, textureX, textureY); // Box 128
		bodyModel[247] = new ModelRendererTurbo(this, 259, 162, textureX, textureY); // Box 128
		bodyModel[248] = new ModelRendererTurbo(this, 259, 159, textureX, textureY); // Box 128
		bodyModel[249] = new ModelRendererTurbo(this, 287, 159, textureX, textureY); // Box 128
		bodyModel[250] = new ModelRendererTurbo(this, 292, 162, textureX, textureY); // Box 128
		bodyModel[251] = new ModelRendererTurbo(this, 292, 159, textureX, textureY); // Box 128
		bodyModel[252] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 258
		bodyModel[253] = new ModelRendererTurbo(this, 122, 144, textureX, textureY); // Box 259
		bodyModel[254] = new ModelRendererTurbo(this, 297, 148, textureX, textureY); // Box 260
		bodyModel[255] = new ModelRendererTurbo(this, 89, 148, textureX, textureY); // Box 261
		bodyModel[256] = new ModelRendererTurbo(this, 77, 144, textureX, textureY); // Box 262
		bodyModel[257] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 263
		bodyModel[258] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 264
		bodyModel[259] = new ModelRendererTurbo(this, 112, 148, textureX, textureY); // Box 265
		bodyModel[260] = new ModelRendererTurbo(this, 117, 151, textureX, textureY); // Box 266
		bodyModel[261] = new ModelRendererTurbo(this, 117, 148, textureX, textureY); // Box 267
		bodyModel[262] = new ModelRendererTurbo(this, 259, 144, textureX, textureY); // Box 268
		bodyModel[263] = new ModelRendererTurbo(this, 264, 148, textureX, textureY); // Box 269
		bodyModel[264] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 270
		bodyModel[265] = new ModelRendererTurbo(this, 259, 148, textureX, textureY); // Box 271
		bodyModel[266] = new ModelRendererTurbo(this, 287, 148, textureX, textureY); // Box 272
		bodyModel[267] = new ModelRendererTurbo(this, 292, 151, textureX, textureY); // Box 273
		bodyModel[268] = new ModelRendererTurbo(this, 292, 148, textureX, textureY); // Box 274
		bodyModel[269] = new ModelRendererTurbo(this, 305, 5, textureX, textureY); // Box 128
		bodyModel[270] = new ModelRendererTurbo(this, 310, 2, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 310, 13, textureX, textureY); // Box 199
		bodyModel[272] = new ModelRendererTurbo(this, 294, 20, textureX, textureY); // Box 199
		bodyModel[273] = new ModelRendererTurbo(this, 296, 17, textureX, textureY); // Box 199
		bodyModel[274] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 199
		bodyModel[275] = new ModelRendererTurbo(this, 77, 17, textureX, textureY); // Box 199
		bodyModel[276] = new ModelRendererTurbo(this, 294, 1, textureX, textureY); // Box 280
		bodyModel[277] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 281
		bodyModel[278] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 282
		bodyModel[279] = new ModelRendererTurbo(this, 77, 7, textureX, textureY); // Box 283
		bodyModel[280] = new ModelRendererTurbo(this, 305, 23, textureX, textureY); // Box 285
		bodyModel[281] = new ModelRendererTurbo(this, 305, 4, textureX, textureY); // Box 286
		bodyModel[282] = new ModelRendererTurbo(this, 279, 20, textureX, textureY); // Box 199
		bodyModel[283] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 199
		bodyModel[284] = new ModelRendererTurbo(this, 279, 1, textureX, textureY); // Box 280
		bodyModel[285] = new ModelRendererTurbo(this, 281, 7, textureX, textureY); // Box 281
		bodyModel[286] = new ModelRendererTurbo(this, 86, 20, textureX, textureY); // Box 199
		bodyModel[287] = new ModelRendererTurbo(this, 88, 17, textureX, textureY); // Box 199
		bodyModel[288] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 294
		bodyModel[289] = new ModelRendererTurbo(this, 88, 7, textureX, textureY); // Box 295
		bodyModel[290] = new ModelRendererTurbo(this, 308, 77, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Box 128
		bodyModel[292] = new ModelRendererTurbo(this, 308, 99, textureX, textureY); // Box 202
		bodyModel[293] = new ModelRendererTurbo(this, 322, 99, textureX, textureY); // Box 203
		bodyModel[294] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 128
		bodyModel[295] = new ModelRendererTurbo(this, 76, 77, textureX, textureY); // Box 128
		bodyModel[296] = new ModelRendererTurbo(this, 62, 99, textureX, textureY); // Box 202
		bodyModel[297] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 203
		bodyModel[298] = new ModelRendererTurbo(this, 38, 154, textureX, textureY); // Box 2
		bodyModel[299] = new ModelRendererTurbo(this, 40, 157, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 225
		bodyModel[301] = new ModelRendererTurbo(this, 26, 123, textureX, textureY); // Box 228
		bodyModel[302] = new ModelRendererTurbo(this, 319, 154, textureX, textureY); // Box 2
		bodyModel[303] = new ModelRendererTurbo(this, 321, 157, textureX, textureY); // Box 2
		bodyModel[304] = new ModelRendererTurbo(this, 343, 124, textureX, textureY); // Box 225
		bodyModel[305] = new ModelRendererTurbo(this, 345, 127, textureX, textureY); // Box 228
		bodyModel[306] = new ModelRendererTurbo(this, 140, 169, textureX, textureY); // Box 2
		bodyModel[307] = new ModelRendererTurbo(this, 188, 169, textureX, textureY); // Box 2
		bodyModel[308] = new ModelRendererTurbo(this, 173, 171, textureX, textureY); // Box 2
		bodyModel[309] = new ModelRendererTurbo(this, 127, 171, textureX, textureY); // Box 2
		bodyModel[310] = new ModelRendererTurbo(this, 217, 174, textureX, textureY); // Box 2
		bodyModel[311] = new ModelRendererTurbo(this, 125, 165, textureX, textureY); // Box 41
		bodyModel[312] = new ModelRendererTurbo(this, 142, 165, textureX, textureY); // Box 41
		bodyModel[313] = new ModelRendererTurbo(this, 122, 165, textureX, textureY); // Box 41
		bodyModel[314] = new ModelRendererTurbo(this, 171, 159, textureX, textureY); // Box 316
		bodyModel[315] = new ModelRendererTurbo(this, 200, 159, textureX, textureY); // Box 317
		bodyModel[316] = new ModelRendererTurbo(this, 162, 159, textureX, textureY); // Box 52
		bodyModel[317] = new ModelRendererTurbo(this, 146, 162, textureX, textureY); // Box 41
		bodyModel[318] = new ModelRendererTurbo(this, 159, 162, textureX, textureY); // Box 41
		bodyModel[319] = new ModelRendererTurbo(this, 143, 162, textureX, textureY); // Box 41
		bodyModel[320] = new ModelRendererTurbo(this, 146, 159, textureX, textureY); // Box 41
		bodyModel[321] = new ModelRendererTurbo(this, 159, 159, textureX, textureY); // Box 41
		bodyModel[322] = new ModelRendererTurbo(this, 143, 159, textureX, textureY); // Box 41
		bodyModel[323] = new ModelRendererTurbo(this, 125, 159, textureX, textureY); // Box 41
		bodyModel[324] = new ModelRendererTurbo(this, 140, 159, textureX, textureY); // Box 41
		bodyModel[325] = new ModelRendererTurbo(this, 122, 159, textureX, textureY); // Box 41
		bodyModel[326] = new ModelRendererTurbo(this, 149, 197, textureX, textureY); // Box 2
		bodyModel[327] = new ModelRendererTurbo(this, 184, 202, textureX, textureY); // Box 2
		bodyModel[328] = new ModelRendererTurbo(this, 187, 197, textureX, textureY); // Box 2
		bodyModel[329] = new ModelRendererTurbo(this, 214, 204, textureX, textureY); // Box 2
		bodyModel[330] = new ModelRendererTurbo(this, 171, 159, textureX, textureY); // Box 316
		bodyModel[331] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 2
		bodyModel[332] = new ModelRendererTurbo(this, 143, 192, textureX, textureY); // Box 2
		bodyModel[333] = new ModelRendererTurbo(this, 115, 192, textureX, textureY); // Box 2
		bodyModel[334] = new ModelRendererTurbo(this, 121, 187, textureX, textureY); // Box 336
		bodyModel[335] = new ModelRendererTurbo(this, 143, 184, textureX, textureY); // Box 337
		bodyModel[336] = new ModelRendererTurbo(this, 115, 184, textureX, textureY); // Box 338
		bodyModel[337] = new ModelRendererTurbo(this, 154, 184, textureX, textureY); // Box 339
		bodyModel[338] = new ModelRendererTurbo(this, 189, 189, textureX, textureY); // Box 340
		bodyModel[339] = new ModelRendererTurbo(this, 209, 184, textureX, textureY); // Box 341
		bodyModel[340] = new ModelRendererTurbo(this, 192, 189, textureX, textureY); // Box 41
		bodyModel[341] = new ModelRendererTurbo(this, 202, 186, textureX, textureY); // Box 340
		bodyModel[342] = new ModelRendererTurbo(this, 196, 186, textureX, textureY); // Box 340
		bodyModel[343] = new ModelRendererTurbo(this, 202, 183, textureX, textureY); // Box 340
		bodyModel[344] = new ModelRendererTurbo(this, 196, 183, textureX, textureY); // Box 340
		bodyModel[345] = new ModelRendererTurbo(this, 121, 204, textureX, textureY); // Box 41
		bodyModel[346] = new ModelRendererTurbo(this, 136, 203, textureX, textureY); // Box 41
		bodyModel[347] = new ModelRendererTurbo(this, 141, 204, textureX, textureY); // Box 41
		bodyModel[348] = new ModelRendererTurbo(this, 116, 204, textureX, textureY); // Box 41
		bodyModel[349] = new ModelRendererTurbo(this, 143, 184, textureX, textureY); // Box 354
		bodyModel[350] = new ModelRendererTurbo(this, 126, 184, textureX, textureY); // Box 355
		bodyModel[351] = new ModelRendererTurbo(this, 126, 179, textureX, textureY); // Box 356
		bodyModel[352] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 356
		bodyModel[353] = new ModelRendererTurbo(this, 121, 182, textureX, textureY); // Box 356
		bodyModel[354] = new ModelRendererTurbo(this, 122, 179, textureX, textureY); // Box 356
		bodyModel[355] = new ModelRendererTurbo(this, 332, 286, textureX, textureY); // Box 128
		bodyModel[356] = new ModelRendererTurbo(this, 339, 286, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 361, 291, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 364, 296, textureX, textureY); // Box 38
		bodyModel[359] = new ModelRendererTurbo(this, 363, 300, textureX, textureY); // Box 38
		bodyModel[360] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 365
		bodyModel[361] = new ModelRendererTurbo(this, 339, 321, textureX, textureY); // Box 366
		bodyModel[362] = new ModelRendererTurbo(this, 364, 331, textureX, textureY); // Box 368
		bodyModel[363] = new ModelRendererTurbo(this, 363, 335, textureX, textureY); // Box 369
		bodyModel[364] = new ModelRendererTurbo(this, 361, 326, textureX, textureY); // Box 370
		bodyModel[365] = new ModelRendererTurbo(this, 343, 288, textureX, textureY); // Box 128
		bodyModel[366] = new ModelRendererTurbo(this, 82, 238, textureX, textureY); // Box 128
		bodyModel[367] = new ModelRendererTurbo(this, 82, 229, textureX, textureY); // Box 374
		bodyModel[368] = new ModelRendererTurbo(this, 346, 289, textureX, textureY); // Box 128
		bodyModel[369] = new ModelRendererTurbo(this, 341, 296, textureX, textureY); // Box 128
		bodyModel[370] = new ModelRendererTurbo(this, 353, 296, textureX, textureY); // Box 41
		bodyModel[371] = new ModelRendererTurbo(this, 343, 323, textureX, textureY); // Box 379
		bodyModel[372] = new ModelRendererTurbo(this, 346, 324, textureX, textureY); // Box 380
		bodyModel[373] = new ModelRendererTurbo(this, 341, 331, textureX, textureY); // Box 381
		bodyModel[374] = new ModelRendererTurbo(this, 353, 331, textureX, textureY); // Box 382
		bodyModel[375] = new ModelRendererTurbo(this, 320, 319, textureX, textureY, "lamp"); // Box 86 glow
		bodyModel[376] = new ModelRendererTurbo(this, 320, 284, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[377] = new ModelRendererTurbo(this, 90, 243, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[378] = new ModelRendererTurbo(this, 90, 249, textureX, textureY, "lamp"); // Box 386 glow
		bodyModel[379] = new ModelRendererTurbo(this, 324, 273, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[380] = new ModelRendererTurbo(this, 91, 266, textureX, textureY); // Box 386
		bodyModel[381] = new ModelRendererTurbo(this, 91, 255, textureX, textureY); // Box 391
		bodyModel[382] = new ModelRendererTurbo(this, 85, 346, textureX, textureY); // Box 386
		bodyModel[383] = new ModelRendererTurbo(this, 85, 339, textureX, textureY); // Box 393
		bodyModel[384] = new ModelRendererTurbo(this, 88, 262, textureX, textureY); // Box 386
		bodyModel[385] = new ModelRendererTurbo(this, 88, 251, textureX, textureY); // Box 395
		bodyModel[386] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[388] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[390] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[391] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[392] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[393] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[394] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[395] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[396] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[397] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[398] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[399] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[400] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[403] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[404] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[405] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[406] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[408] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[409] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[410] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[411] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[412] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[413] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[414] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[419] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[420] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[421] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[422] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[425] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[426] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[427] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[428] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[433] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[434] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[439] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[440] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[441] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[442] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[445] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[447] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[448] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[453] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[454] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[455] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[456] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[461] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[462] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part
		bodyModel[465] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part
		bodyModel[466] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[467] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[468] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[469] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[470] = new ModelRendererTurbo(this, 107, 286, textureX, textureY); // Right seat part
		bodyModel[471] = new ModelRendererTurbo(this, 117, 276, textureX, textureY); // Right seat part
		bodyModel[472] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[473] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 100, 297, textureX, textureY); // Boc 42
		bodyModel[475] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[476] = new ModelRendererTurbo(this, 104, 281, textureX, textureY); // Right seat part
		bodyModel[477] = new ModelRendererTurbo(this, 115, 299, textureX, textureY); // Right seat part
		bodyModel[478] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[479] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 104, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[481] = new ModelRendererTurbo(this, 115, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[482] = new ModelRendererTurbo(this, 115, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[483] = new ModelRendererTurbo(this, 104, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[484] = new ModelRendererTurbo(this, 79, 286, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 89, 276, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 79, 321, textureX, textureY); // Left seat part
		bodyModel[487] = new ModelRendererTurbo(this, 89, 311, textureX, textureY); // Left seat part
		bodyModel[488] = new ModelRendererTurbo(this, 72, 297, textureX, textureY); // Boc 42
		bodyModel[489] = new ModelRendererTurbo(this, 72, 332, textureX, textureY); // Box 638
		bodyModel[490] = new ModelRendererTurbo(this, 76, 281, textureX, textureY); // Right seat part
		bodyModel[491] = new ModelRendererTurbo(this, 87, 299, textureX, textureY); // Right seat part
		bodyModel[492] = new ModelRendererTurbo(this, 87, 334, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 76, 316, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 76, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[495] = new ModelRendererTurbo(this, 87, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[496] = new ModelRendererTurbo(this, 87, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[497] = new ModelRendererTurbo(this, 76, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[498] = new ModelRendererTurbo(this, 51, 286, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 61, 276, textureX, textureY); // Right seat part

		bodyModel[0].addBox(0F, 0F, 0F, 113, 2, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-56.5F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[1].setRotationPoint(-61.5F, 1F, -4F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 2
		bodyModel[3].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[4].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 2
		bodyModel[5].setRotationPoint(-61.5F, 3F, -4F);

		bodyModel[6].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(43F, 4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-45F, 4F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 113, 14, 1, 0F); // Box 38
		bodyModel[9].setRotationPoint(-56.5F, -13F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 113, 14, 1, 0F); // Box 128
		bodyModel[10].setRotationPoint(-56.5F, -13F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(-61.5F, -13F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(-61.5F, -13F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(60.5F, -13F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(60.5F, -13F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 115, 3, 6, 0F); // Box 128
		bodyModel[15].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[16].setRotationPoint(-57.5F, -20F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 168
		bodyModel[17].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[18].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[19].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(63F, -14F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(63F, -14F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(63F, 1F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(63F, -15F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-63F, -15F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[27].setRotationPoint(-63F, 1F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[28].setRotationPoint(-63F, -14F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-63F, -14F, 3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[30].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[31].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[32].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[33].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[34].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[35].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[36].setRotationPoint(60.5F, 1F, -4F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[37].setRotationPoint(-60.5F, 1F, -5F);

		bodyModel[38].addShapeBox(-4F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F); // Trapdoor FL
		bodyModel[38].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[39].addShapeBox(-4F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Trapdoor FR
		bodyModel[39].setRotationPoint(-56.5F, 1F, 5F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[40].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Trapdoor RL
		bodyModel[41].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Trapdoor RR
		bodyModel[42].setRotationPoint(56.5F, 1F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[43].setRotationPoint(-56.5F, -13F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(-56.5F, -13F, 3F);

		bodyModel[45].addShapeBox(-1F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door F
		bodyModel[45].setRotationPoint(-55.5F, -14F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[46].setRotationPoint(-56.5F, -15F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[47].setRotationPoint(55.5F, -13F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[48].setRotationPoint(55.5F, -13F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door R
		bodyModel[49].setRotationPoint(55.5F, -14F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-61.5F, -15F, 4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(60.5F, -15F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[54].setRotationPoint(63F, -16.5F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[55].setRotationPoint(63F, -16.5F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[56].setRotationPoint(-63.5F, -16.5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[57].setRotationPoint(-63.5F, -16.5F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-61.5F, -15F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[61].setRotationPoint(-56.5F, 1F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[63].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-61.5F, 1F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[68].setRotationPoint(-61.5F, 1F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 117, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 128
		bodyModel[70].setRotationPoint(-58.5F, -17F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 117, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 170
		bodyModel[71].setRotationPoint(-58.5F, -17F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 115, 2, 6, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-57.5F, -19F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 115, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[73].setRotationPoint(-57.5F, -19F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[74].setRotationPoint(47.5F, -13F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[75].setRotationPoint(47.5F, -13F, 3F);

		bodyModel[76].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 128
		bodyModel[76].setRotationPoint(47.5F, -15F, -3F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 2, 17, 0F); // Box 128
		bodyModel[77].setRotationPoint(-58.5F, -17F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-58.5F, -17F, -9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-58.5F, -17F, 8.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 11, 2, 17, 0F); // Box 128
		bodyModel[80].setRotationPoint(47.5F, -17F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(47.5F, -17F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(47.5F, -17F, 8.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(47.5F, -15F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(47.5F, -15F, 9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 86
		bodyModel[85].setRotationPoint(47.5F, -15F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[87].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(55.5F, -15F, 9F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 90
		bodyModel[89].setRotationPoint(55.5F, -15F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[90].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[91].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-56.5F, -15F, 9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[93].setRotationPoint(-56.5F, -15F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[94].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[95].setRotationPoint(-55.5F, -17F, -9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 103, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 97
		bodyModel[96].setRotationPoint(-55.5F, -17F, 7.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[97].setRotationPoint(48.5F, -15F, 3F);

		bodyModel[98].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 102
		bodyModel[98].setRotationPoint(48.5F, -15F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.46F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[100].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 128
		bodyModel[101].setRotationPoint(60.5F, -15F, -4F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 106
		bodyModel[102].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(60.5F, 1F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[105].setRotationPoint(60.5F, 1F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[106].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[107].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 112
		bodyModel[108].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[109].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 114
		bodyModel[110].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 128
		bodyModel[111].setRotationPoint(-56.5F, 3F, 9.5F);

		bodyModel[112].addShapeBox(-0.25F, 0F, 0.25F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.76F, 0F, 0F, -0.76F); // Side door RR part
		bodyModel[112].setRotationPoint(56.75F, -14F, 10.25F);

		bodyModel[113].addShapeBox(-0.25F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F); // Side door RR part
		bodyModel[113].setRotationPoint(56.75F, -13F, 10.25F);

		bodyModel[114].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[114].setRotationPoint(56.75F, -13F, 10.5F);

		bodyModel[115].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[115].setRotationPoint(56.75F, -13F, -10.5F);

		bodyModel[116].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[116].setRotationPoint(-56.5F, -13F, 10.5F);

		bodyModel[117].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[117].setRotationPoint(-56.5F, -13F, -10.5F);

		bodyModel[118].addShapeBox(-0.25F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door RL part
		bodyModel[118].setRotationPoint(56.75F, -14F, -10.25F);

		bodyModel[119].addShapeBox(-0.25F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door RL part
		bodyModel[119].setRotationPoint(56.75F, -13F, -10.25F);

		bodyModel[120].addShapeBox(-3.75F, 0F, -0.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Side door FR part
		bodyModel[120].setRotationPoint(-56.75F, -14F, 10.25F);

		bodyModel[121].addShapeBox(-3.75F, 0F, -0.5F, 4, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Side door FR part
		bodyModel[121].setRotationPoint(-56.75F, -13F, 10.25F);

		bodyModel[122].addShapeBox(-3.75F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door FL part
		bodyModel[122].setRotationPoint(-56.75F, -14F, -10.25F);

		bodyModel[123].addShapeBox(-3.75F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door FL part
		bodyModel[123].setRotationPoint(-56.75F, -13F, -10.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-57.25F, 1F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[125].setRotationPoint(-57.25F, 1F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(56.5F, 1F, 10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[127].setRotationPoint(56.5F, 1F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[128].setRotationPoint(58.5F, -17F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[129].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F); // Box 128
		bodyModel[130].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F); // Box 128
		bodyModel[131].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[132].setRotationPoint(58.5F, -17F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 128
		bodyModel[133].setRotationPoint(59.5F, -18.6F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[134].setRotationPoint(58.5F, -17F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[135].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F); // Box 149
		bodyModel[136].setRotationPoint(59F, -17F, 7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F); // Box 150
		bodyModel[137].setRotationPoint(59F, -17F, 8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[138].setRotationPoint(58.5F, -17F, 7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, -1F, -1.6F, 0F, -1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F); // Box 152
		bodyModel[139].setRotationPoint(59.5F, -18.6F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[140].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[141].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[142].setRotationPoint(58.5F, -17F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F); // Box 128
		bodyModel[143].setRotationPoint(59.04F, -17.8F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F); // Box 158
		bodyModel[144].setRotationPoint(58.5F, -17F, 3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[145].setRotationPoint(57.5F, -20F, -8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 163
		bodyModel[146].setRotationPoint(59.04F, -17.8F, 3.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[147].setRotationPoint(57.5F, -20F, 2.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F); // Box 128
		bodyModel[148].setRotationPoint(57.8F, -19.65F, -8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F); // Box 166
		bodyModel[149].setRotationPoint(57.8F, -19.65F, 3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F); // Box 128
		bodyModel[150].setRotationPoint(57.8F, -19.65F, -4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F); // Box 168
		bodyModel[151].setRotationPoint(57.8F, -19.65F, 3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[153].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[154].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[155].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[156].setRotationPoint(-59.5F, -17F, -4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[157].setRotationPoint(-59.5F, -17F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[158].setRotationPoint(-59.5F, -17F, -8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F); // Box 158
		bodyModel[159].setRotationPoint(-59.5F, -17F, 3.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F); // Box 128
		bodyModel[160].setRotationPoint(-61F, -17F, -10.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F); // Box 128
		bodyModel[161].setRotationPoint(-62F, -17F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[162].setRotationPoint(-59.04F, -17F, -10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F); // Box 149
		bodyModel[163].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F); // Box 150
		bodyModel[164].setRotationPoint(-62F, -17F, 8.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[165].setRotationPoint(-59.04F, -17F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, 1F, 0F, -1F, -1.6F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 128
		bodyModel[166].setRotationPoint(-62.5F, -18.6F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F); // Box 152
		bodyModel[167].setRotationPoint(-62.5F, -18.6F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F); // Box 128
		bodyModel[168].setRotationPoint(-62.04F, -17.8F, -8.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F); // Box 163
		bodyModel[169].setRotationPoint(-62.04F, -17.8F, 3.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[170].setRotationPoint(-61.5F, -17F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[171].setRotationPoint(-61.5F, -17F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F); // Box 147
		bodyModel[172].setRotationPoint(-61.5F, -17F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[173].setRotationPoint(-61.5F, -17F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 128
		bodyModel[174].setRotationPoint(-59.5F, -20F, -8.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F); // Box 164
		bodyModel[175].setRotationPoint(-59.5F, -20F, 2.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F); // Box 128
		bodyModel[176].setRotationPoint(-59.8F, -19.65F, -8.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F); // Box 166
		bodyModel[177].setRotationPoint(-59.8F, -19.65F, 3.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 128
		bodyModel[178].setRotationPoint(-59.8F, -19.65F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 168
		bodyModel[179].setRotationPoint(-59.8F, -19.65F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.975F, 0F, 0F, 0F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[181].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[182].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 172
		bodyModel[183].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[184].setRotationPoint(-60.5F, 3F, 9.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[185].setRotationPoint(-56.5F, 3F, 5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[186].setRotationPoint(-56.5F, 3F, 8.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[187].setRotationPoint(-56.5F, 3F, 9.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[188].setRotationPoint(-56.5F, 6F, 9.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[189].setRotationPoint(-60.5F, 3F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[190].setRotationPoint(-60.5F, 3F, 8.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[191].setRotationPoint(-60.5F, 6F, 9.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[192].setRotationPoint(-60.5F, 2.5F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[193].setRotationPoint(-60.5F, 4F, 6.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[194].setRotationPoint(-60.5F, 7F, 8.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[195].setRotationPoint(-60.5F, 2.5F, 6.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[196].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[197].setRotationPoint(-60.5F, 3F, -10.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[198].setRotationPoint(-56.5F, 3F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[199].setRotationPoint(-56.5F, 3F, -10.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[200].setRotationPoint(-56.5F, 3F, -10.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[201].setRotationPoint(-56.5F, 6F, -10.75F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[202].setRotationPoint(-60.5F, 3F, -8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[203].setRotationPoint(-60.5F, 3F, -10.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[204].setRotationPoint(-60.5F, 6F, -10.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[205].setRotationPoint(-60.5F, 2.5F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[206].setRotationPoint(-60.5F, 4F, -8.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[207].setRotationPoint(-60.5F, 7F, -10.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[208].setRotationPoint(-60.5F, 2.5F, -6.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[209].setRotationPoint(-60.5F, 4F, -7.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[210].setRotationPoint(56.5F, 3F, 9.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[211].setRotationPoint(60.5F, 3F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[212].setRotationPoint(60.5F, 3F, 8.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[213].setRotationPoint(60.5F, 3F, 9.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[214].setRotationPoint(60.5F, 6F, 9.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[215].setRotationPoint(56.5F, 3F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[216].setRotationPoint(56.5F, 3F, 8.25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[217].setRotationPoint(56.5F, 6F, 9.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[218].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[219].setRotationPoint(56.5F, 4F, 6.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[220].setRotationPoint(56.5F, 7F, 8.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[221].setRotationPoint(56.5F, 2.5F, 6.25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[222].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[223].setRotationPoint(56.5F, 3F, -10.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[224].setRotationPoint(60.5F, 3F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[225].setRotationPoint(60.5F, 3F, -10.25F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[226].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[227].setRotationPoint(60.5F, 6F, -10.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[228].setRotationPoint(56.5F, 3F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[229].setRotationPoint(56.5F, 3F, -10.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[230].setRotationPoint(56.5F, 6F, -10.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[231].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[232].setRotationPoint(56.5F, 4F, -8.25F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[233].setRotationPoint(56.5F, 7F, -10.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[234].setRotationPoint(56.5F, 2.5F, -6.25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[235].setRotationPoint(56.5F, 4F, -7.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[236].setRotationPoint(-33.5F, 3F, 9.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[237].setRotationPoint(54.5F, 3F, 9.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[238].setRotationPoint(-54F, 3F, 9.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[239].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[240].setRotationPoint(-54.5F, 3.5F, 9.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[241].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[242].setRotationPoint(-35F, 3F, 9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[243].setRotationPoint(-34.5F, 3.5F, 9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[244].setRotationPoint(-34F, 3F, 9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[245].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[246].setRotationPoint(34F, 3F, 9.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[247].setRotationPoint(33.5F, 3.5F, 9.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[248].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[249].setRotationPoint(53F, 3F, 9.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[250].setRotationPoint(53.5F, 3.5F, 9.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[251].setRotationPoint(54F, 3F, 9.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 258
		bodyModel[252].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[253].setRotationPoint(-33.5F, 3F, -10.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[254].setRotationPoint(54.5F, 3F, -10.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 261
		bodyModel[255].setRotationPoint(-54F, 3F, -10.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[256].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[257].setRotationPoint(-54.5F, 3.5F, -10.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 264
		bodyModel[258].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 265
		bodyModel[259].setRotationPoint(-35F, 3F, -10.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 266
		bodyModel[260].setRotationPoint(-34.5F, 3.5F, -10.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 267
		bodyModel[261].setRotationPoint(-34F, 3F, -10.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[262].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 269
		bodyModel[263].setRotationPoint(34F, 3F, -10.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[264].setRotationPoint(33.5F, 3.5F, -10.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 271
		bodyModel[265].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 272
		bodyModel[266].setRotationPoint(53F, 3F, -10.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 273
		bodyModel[267].setRotationPoint(53.5F, 3.5F, -10.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 274
		bodyModel[268].setRotationPoint(54F, 3F, -10.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[269].setRotationPoint(48.5F, -20.25F, -3F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[270].setRotationPoint(48.5F, -20.25F, -4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 199
		bodyModel[271].setRotationPoint(48.5F, -20.25F, 3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[272].setRotationPoint(45.5F, -20.25F, 6.25F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[273].setRotationPoint(45.5F, -20.25F, 5.75F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[274].setRotationPoint(-53.5F, -20.25F, 6.25F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[275].setRotationPoint(-53.5F, -20.25F, 5.75F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[276].setRotationPoint(45.5F, -20.25F, -9.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[277].setRotationPoint(45.5F, -20.25F, -6.75F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[278].setRotationPoint(-53.5F, -20.25F, -9.25F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[279].setRotationPoint(-53.5F, -20.25F, -6.75F);

		bodyModel[280].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.03F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F); // Box 285
		bodyModel[280].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[280].rotateAngleY = 0.78539816F;

		bodyModel[281].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.03F, 0F); // Box 286
		bodyModel[281].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[281].rotateAngleY = -0.78539816F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[282].setRotationPoint(39.5F, -20.25F, 6.25F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[283].setRotationPoint(39.5F, -20.25F, 5.75F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[284].setRotationPoint(39.5F, -20.25F, -9.25F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[285].setRotationPoint(39.5F, -20.25F, -6.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[286].setRotationPoint(-49.5F, -20.25F, 6.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[287].setRotationPoint(-49.5F, -20.25F, 5.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 294
		bodyModel[288].setRotationPoint(-49.5F, -20.25F, -9.25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 295
		bodyModel[289].setRotationPoint(-49.5F, -20.25F, -6.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[291].setRotationPoint(60.5F, -6F, -12F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[292].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[293].setRotationPoint(60.5F, -6F, 11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[294].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[295].setRotationPoint(-56.5F, -6F, -12F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[296].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[297].setRotationPoint(-56.5F, -6F, 11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[298].setRotationPoint(-60.5F, 5.5F, 7.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[299].setRotationPoint(-60.5F, 5.5F, 8.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[300].setRotationPoint(-60.5F, 5.5F, -9.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[301].setRotationPoint(-60.5F, 5.5F, -8.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[302].setRotationPoint(56.5F, 5.5F, 7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[303].setRotationPoint(56.5F, 5.5F, 8.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[304].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[305].setRotationPoint(56.5F, 5.5F, -8.75F);

		bodyModel[306].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 2
		bodyModel[306].setRotationPoint(13.5F, 3F, 4.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 2
		bodyModel[307].setRotationPoint(-0.5F, 3F, 4.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[308].setRotationPoint(8.5F, 3F, 7.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[309].setRotationPoint(29.5F, 3F, 7.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 2
		bodyModel[310].setRotationPoint(-5.5F, 3F, 9.49F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[311].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[311].rotateAngleX = -0.78539816F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[312].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[313].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[314].setRotationPoint(-0.5F, 3F, -9.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 317
		bodyModel[315].setRotationPoint(-5.5F, 3F, -9.49F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[316].setRotationPoint(11.5F, 3F, -9.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 41
		bodyModel[317].setRotationPoint(16.5F, 3.34F, -7F);
		bodyModel[317].rotateAngleX = -0.78539816F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[318].setRotationPoint(16.49F, 3F, -7.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[319].setRotationPoint(21.51F, 3F, -7.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[320].setRotationPoint(16.5F, 3.34F, -9F);
		bodyModel[320].rotateAngleX = -0.78539816F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 41
		bodyModel[321].setRotationPoint(16.49F, 3F, -9.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 41
		bodyModel[322].setRotationPoint(21.51F, 3F, -9.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[323].setRotationPoint(23.5F, 2.75F, -8.6F);
		bodyModel[323].rotateAngleX = -0.78539816F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[324].setRotationPoint(23.49F, 3F, -9.1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[325].setRotationPoint(28.51F, 3F, -9.1F);

		bodyModel[326].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 2
		bodyModel[326].setRotationPoint(2.5F, 3F, 4.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 2
		bodyModel[327].setRotationPoint(-1.5F, 3F, 9.49F);

		bodyModel[328].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 2
		bodyModel[328].setRotationPoint(-25.5F, 3F, 4.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[329].setRotationPoint(-27.5F, 3F, 8.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 316
		bodyModel[330].setRotationPoint(8.5F, 3F, -9.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 8, 2, 5, 0F); // Box 2
		bodyModel[331].setRotationPoint(23.5F, 5F, 3.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 2
		bodyModel[332].setRotationPoint(25F, 3F, 3.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 2
		bodyModel[333].setRotationPoint(30F, 3F, 3.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 8, 2, 5, 0F); // Box 336
		bodyModel[334].setRotationPoint(23.5F, 5F, -8.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 337
		bodyModel[335].setRotationPoint(25F, 3F, -8.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 338
		bodyModel[336].setRotationPoint(30F, 3F, -8.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 339
		bodyModel[337].setRotationPoint(2.5F, 3F, -9.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 340
		bodyModel[338].setRotationPoint(-1.5F, 3F, -9.49F);

		bodyModel[339].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 341
		bodyModel[339].setRotationPoint(-25.5F, 3F, -9.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[340].setRotationPoint(-15.5F, 4F, -8.07F);
		bodyModel[340].rotateAngleX = -0.78539816F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[341].setRotationPoint(-14.5F, 3F, -9.49F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[342].setRotationPoint(-11.5F, 3F, -9.49F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[343].setRotationPoint(-14.5F, 3F, -6.65F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[344].setRotationPoint(-11.5F, 3F, -6.65F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F); // Box 41
		bodyModel[345].setRotationPoint(25.5F, 5.5F, 9F);
		bodyModel[345].rotateAngleX = -0.78539816F;

		bodyModel[346].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F); // Box 41
		bodyModel[346].setRotationPoint(27.5F, 3F, 9F);
		bodyModel[346].rotateAngleY = -0.78539816F;

		bodyModel[347].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.5F); // Box 41
		bodyModel[347].setRotationPoint(25.5F, 5.85F, 8.5F);
		bodyModel[347].rotateAngleZ = 0.78539816F;

		bodyModel[348].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[348].setRotationPoint(30.8F, 5.85F, 8.5F);
		bodyModel[348].rotateAngleZ = 0.78539816F;

		bodyModel[349].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 354
		bodyModel[349].setRotationPoint(25.5F, 5.85F, -9.5F);
		bodyModel[349].rotateAngleZ = 0.78539816F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F); // Box 355
		bodyModel[350].setRotationPoint(25.5F, 6.2F, -9.71F);
		bodyModel[350].rotateAngleX = 0.78539816F;

		bodyModel[351].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F); // Box 356
		bodyModel[351].setRotationPoint(32F, 3F, -9F);
		bodyModel[351].rotateAngleY = -0.78539816F;

		bodyModel[352].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 356
		bodyModel[352].setRotationPoint(32.6F, 5.45F, -7.75F);
		bodyModel[352].rotateAngleY = -0.78539816F;

		bodyModel[353].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[353].setRotationPoint(32.6F, 4.95F, -7.75F);
		bodyModel[353].rotateAngleY = -0.78539816F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 356
		bodyModel[354].setRotationPoint(32.25F, 3F, -7.75F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[355].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[356].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[357].setRotationPoint(54.05F, -2F, 9.95F);
		bodyModel[357].rotateAngleY = -2.35619449F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[358].setRotationPoint(54.4F, -1F, 9.6F);
		bodyModel[358].rotateAngleY = -2.35619449F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[359].setRotationPoint(54.05F, 0.5F, 9.95F);
		bodyModel[359].rotateAngleY = -2.35619449F;

		bodyModel[360].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 365
		bodyModel[360].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[361].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 366
		bodyModel[361].setRotationPoint(53.5F, -15F, -5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[362].setRotationPoint(53.15F, -1F, -8.35F);
		bodyModel[362].rotateAngleY = -0.78539816F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[363].setRotationPoint(52.45F, 0.5F, -8.35F);
		bodyModel[363].rotateAngleY = -0.78539816F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[364].setRotationPoint(51.55F, -2F, -8.9F);
		bodyModel[364].rotateAngleY = -0.78539816F;

		bodyModel[365].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 128
		bodyModel[365].setRotationPoint(48.5F, -8.5F, 5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[366].setRotationPoint(-55.5F, -15F, 9.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[367].setRotationPoint(-55.5F, -15F, -10.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[368].setRotationPoint(48.5F, -6F, 5F);

		bodyModel[369].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 128
		bodyModel[369].setRotationPoint(48.5F, -2.4F, 5F);
		bodyModel[369].rotateAngleZ = 1.04719755F;

		bodyModel[370].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[370].setRotationPoint(49.75F, -5F, 7.5F);
		bodyModel[370].rotateAngleY = -0.78539816F;

		bodyModel[371].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 379
		bodyModel[371].setRotationPoint(48.5F, -8.5F, -10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[372].setRotationPoint(48.5F, -6F, -10F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 381
		bodyModel[373].setRotationPoint(48.5F, -2.4F, -10F);
		bodyModel[373].rotateAngleZ = 1.04719755F;

		bodyModel[374].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[374].setRotationPoint(49.75F, -5F, -7.5F);
		bodyModel[374].rotateAngleY = -0.78539816F;

		bodyModel[375].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 86 glow
		bodyModel[375].setRotationPoint(51.5F, -14.99F, -7.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[376].setRotationPoint(51.5F, -14.99F, 6.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 103, 0, 1, 0F); // Box 384 glow
		bodyModel[377].setRotationPoint(-55.5F, -16.99F, -5F);

		bodyModel[378].addBox(0F, 0F, 0F, 103, 0, 1, 0F); // Box 386 glow
		bodyModel[378].setRotationPoint(-55.5F, -16.99F, 4F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[379].setRotationPoint(52F, -13.99F, -0.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 103, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 386
		bodyModel[380].setRotationPoint(-55.5F, -14F, 9.66F);
		bodyModel[380].rotateAngleX = 0.16580628F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 103, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 391
		bodyModel[381].setRotationPoint(-55.5F, -14F, -9.66F);
		bodyModel[381].rotateAngleX = -0.16580628F;

		bodyModel[382].addShapeBox(0F, 0F, -3F, 103, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 386
		bodyModel[382].setRotationPoint(-55.5F, -11.98F, 10F);
		bodyModel[382].rotateAngleX = -0.34906585F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 103, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 393
		bodyModel[383].setRotationPoint(-55.5F, -11.98F, -10F);
		bodyModel[383].rotateAngleX = 0.34906585F;

		bodyModel[384].addShapeBox(0F, 0F, -3F, 103, 0, 3, 0F,0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[384].setRotationPoint(-55.5F, -14F, 9.66F);
		bodyModel[384].rotateAngleX = 0.38135444F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 103, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F); // Box 395
		bodyModel[385].setRotationPoint(-55.5F, -14F, -9.66F);
		bodyModel[385].rotateAngleX = -0.38135444F;

		bodyModel[386].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[386].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[387].setRotationPoint(43.5F, -8F, 7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[388].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[389].setRotationPoint(43.5F, -8F, -7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[390].setRotationPoint(42F, -1F, 5F);

		bodyModel[391].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[391].setRotationPoint(42F, -1F, -9F);

		bodyModel[392].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[392].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[393].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[394].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[395].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[396].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[397].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[398].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[399].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[400].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[401].setRotationPoint(33.5F, -8F, 7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[402].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[403].setRotationPoint(33.5F, -8F, -7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[404].setRotationPoint(32F, -1F, 5F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[405].setRotationPoint(32F, -1F, -9F);

		bodyModel[406].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[407].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[408].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[409].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[410].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[411].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[412].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[413].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[414].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[415].setRotationPoint(23.5F, -8F, 7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[416].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(23.5F, -8F, -7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[418].setRotationPoint(22F, -1F, 5F);

		bodyModel[419].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[419].setRotationPoint(22F, -1F, -9F);

		bodyModel[420].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[420].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[421].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[422].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[423].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[424].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[425].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[426].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[427].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[428].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(13.5F, -8F, 7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[430].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(13.5F, -8F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[432].setRotationPoint(12F, -1F, 5F);

		bodyModel[433].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[433].setRotationPoint(12F, -1F, -9F);

		bodyModel[434].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[435].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[436].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[438].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[439].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[440].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[441].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[442].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[443].setRotationPoint(3.5F, -8F, 7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[444].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[445].setRotationPoint(3.5F, -8F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[446].setRotationPoint(2F, -1F, 5F);

		bodyModel[447].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[447].setRotationPoint(2F, -1F, -9F);

		bodyModel[448].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[451].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[452].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[453].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[454].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[455].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[456].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(-6.5F, -8F, 7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[458].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(-6.5F, -8F, -7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[460].setRotationPoint(-8F, -1F, 5F);

		bodyModel[461].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[461].setRotationPoint(-8F, -1F, -9F);

		bodyModel[462].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[462].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[463].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[464].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[464].rotateAngleY = -3.14159265F;

		bodyModel[465].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[465].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[466].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[467].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[468].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[469].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[470].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[471].setRotationPoint(-16.5F, -8F, 7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[472].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(-16.5F, -8F, -7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[474].setRotationPoint(-18F, -1F, 5F);

		bodyModel[475].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[475].setRotationPoint(-18F, -1F, -9F);

		bodyModel[476].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[476].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[476].rotateAngleY = -3.14159265F;

		bodyModel[477].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[477].setRotationPoint(-16.5F, -3F, 7F);
		bodyModel[477].rotateAngleY = -3.14159265F;

		bodyModel[478].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[478].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[478].rotateAngleY = -3.14159265F;

		bodyModel[479].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[479].setRotationPoint(-16.5F, -3F, -7F);
		bodyModel[479].rotateAngleY = -3.14159265F;

		bodyModel[480].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[480].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[480].rotateAngleY = -3.14159265F;

		bodyModel[481].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[481].setRotationPoint(-16.5F, -5F, 7F);
		bodyModel[481].rotateAngleY = -3.14159265F;

		bodyModel[482].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[482].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[482].rotateAngleY = -3.14159265F;

		bodyModel[483].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[483].setRotationPoint(-16.5F, -5F, -7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[485].setRotationPoint(-26.5F, -8F, 7F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[486].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[486].rotateAngleY = -3.14159265F;

		bodyModel[487].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[487].setRotationPoint(-26.5F, -8F, -7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[488].setRotationPoint(-28F, -1F, 5F);

		bodyModel[489].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[489].setRotationPoint(-28F, -1F, -9F);

		bodyModel[490].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[490].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[491].setRotationPoint(-26.5F, -3F, 7F);
		bodyModel[491].rotateAngleY = -3.14159265F;

		bodyModel[492].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[493].setRotationPoint(-26.5F, -3F, -7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[494].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[495].setRotationPoint(-26.5F, -5F, 7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[496].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[497].setRotationPoint(-26.5F, -5F, -7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[498].setRotationPoint(-36.5F, -3F, 7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[499].setRotationPoint(-36.5F, -8F, 7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 51, 321, textureX, textureY); // Left seat part
		bodyModel[501] = new ModelRendererTurbo(this, 61, 311, textureX, textureY); // Left seat part
		bodyModel[502] = new ModelRendererTurbo(this, 44, 297, textureX, textureY); // Boc 42
		bodyModel[503] = new ModelRendererTurbo(this, 44, 332, textureX, textureY); // Box 638
		bodyModel[504] = new ModelRendererTurbo(this, 48, 281, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 59, 299, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 59, 334, textureX, textureY); // Left seat part
		bodyModel[507] = new ModelRendererTurbo(this, 48, 316, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 48, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[509] = new ModelRendererTurbo(this, 59, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[510] = new ModelRendererTurbo(this, 59, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[511] = new ModelRendererTurbo(this, 48, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[512] = new ModelRendererTurbo(this, 23, 286, textureX, textureY); // Right seat part
		bodyModel[513] = new ModelRendererTurbo(this, 33, 276, textureX, textureY); // Right seat part
		bodyModel[514] = new ModelRendererTurbo(this, 23, 321, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 33, 311, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 16, 297, textureX, textureY); // Boc 42
		bodyModel[517] = new ModelRendererTurbo(this, 16, 332, textureX, textureY); // Box 638
		bodyModel[518] = new ModelRendererTurbo(this, 20, 281, textureX, textureY); // Right seat part
		bodyModel[519] = new ModelRendererTurbo(this, 31, 299, textureX, textureY); // Right seat part
		bodyModel[520] = new ModelRendererTurbo(this, 31, 334, textureX, textureY); // Left seat part
		bodyModel[521] = new ModelRendererTurbo(this, 20, 316, textureX, textureY); // Left seat part
		bodyModel[522] = new ModelRendererTurbo(this, 20, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[523] = new ModelRendererTurbo(this, 31, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[524] = new ModelRendererTurbo(this, 31, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[525] = new ModelRendererTurbo(this, 20, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[526] = new ModelRendererTurbo(this, 382, 78, textureX, textureY); // Rear gate closed
		bodyModel[527] = new ModelRendererTurbo(this, 379, 83, textureX, textureY); // Rear gate open
		bodyModel[528] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Front gate closed
		bodyModel[529] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Front gate open
		bodyModel[530] = new ModelRendererTurbo(this, 305, 20, textureX, textureY); // Box 285
		bodyModel[531] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 286
		bodyModel[532] = new ModelRendererTurbo(this, 91, 353, textureX, textureY); // Box 38
		bodyModel[533] = new ModelRendererTurbo(this, 91, 359, textureX, textureY); // Box 462
		bodyModel[534] = new ModelRendererTurbo(this, 229, 376, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 229, 403, textureX, textureY); // Box 537
		bodyModel[536] = new ModelRendererTurbo(this, 231, 371, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 231, 398, textureX, textureY); // Box 539
		bodyModel[538] = new ModelRendererTurbo(this, 239, 368, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 241, 367, textureX, textureY); // Box 128
		bodyModel[540] = new ModelRendererTurbo(this, 236, 369, textureX, textureY); // Box 128
		bodyModel[541] = new ModelRendererTurbo(this, 241, 394, textureX, textureY); // Box 543
		bodyModel[542] = new ModelRendererTurbo(this, 236, 396, textureX, textureY); // Box 544
		bodyModel[543] = new ModelRendererTurbo(this, 239, 395, textureX, textureY); // Box 545
		bodyModel[544] = new ModelRendererTurbo(this, 88, 266, textureX, textureY); // Box 386
		bodyModel[545] = new ModelRendererTurbo(this, 82, 346, textureX, textureY); // Box 386
		bodyModel[546] = new ModelRendererTurbo(this, 85, 262, textureX, textureY); // Box 386
		bodyModel[547] = new ModelRendererTurbo(this, 88, 255, textureX, textureY); // Box 549
		bodyModel[548] = new ModelRendererTurbo(this, 82, 339, textureX, textureY); // Box 550
		bodyModel[549] = new ModelRendererTurbo(this, 85, 251, textureX, textureY); // Box 551
		bodyModel[550] = new ModelRendererTurbo(this, 192, 407, textureX, textureY); // Box 492
		bodyModel[551] = new ModelRendererTurbo(this, 195, 397, textureX, textureY); // Box 493
		bodyModel[552] = new ModelRendererTurbo(this, 172, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[553] = new ModelRendererTurbo(this, 191, 414, textureX, textureY); // Box 498
		bodyModel[554] = new ModelRendererTurbo(this, 210, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[555] = new ModelRendererTurbo(this, 195, 404, textureX, textureY); // Box 492
		bodyModel[556] = new ModelRendererTurbo(this, 192, 380, textureX, textureY); // Box 526
		bodyModel[557] = new ModelRendererTurbo(this, 195, 370, textureX, textureY); // Box 527
		bodyModel[558] = new ModelRendererTurbo(this, 195, 377, textureX, textureY); // Box 532
		bodyModel[559] = new ModelRendererTurbo(this, 191, 387, textureX, textureY); // Box 533
		bodyModel[560] = new ModelRendererTurbo(this, 172, 373, textureX, textureY,"cull"); // Box 660 cull
		bodyModel[561] = new ModelRendererTurbo(this, 210, 373, textureX, textureY,"cull"); // Box 661 cull
		bodyModel[562] = new ModelRendererTurbo(this, 135, 407, textureX, textureY); // Box 492
		bodyModel[563] = new ModelRendererTurbo(this, 138, 397, textureX, textureY); // Box 493
		bodyModel[564] = new ModelRendererTurbo(this, 115, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[565] = new ModelRendererTurbo(this, 134, 414, textureX, textureY); // Box 498
		bodyModel[566] = new ModelRendererTurbo(this, 153, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[567] = new ModelRendererTurbo(this, 138, 404, textureX, textureY); // Box 492
		bodyModel[568] = new ModelRendererTurbo(this, 135, 380, textureX, textureY); // Box 526
		bodyModel[569] = new ModelRendererTurbo(this, 138, 370, textureX, textureY); // Box 527
		bodyModel[570] = new ModelRendererTurbo(this, 138, 377, textureX, textureY); // Box 532
		bodyModel[571] = new ModelRendererTurbo(this, 134, 387, textureX, textureY); // Box 533
		bodyModel[572] = new ModelRendererTurbo(this, 115, 373, textureX, textureY,"cull"); // Box 660 cull
		bodyModel[573] = new ModelRendererTurbo(this, 153, 373, textureX, textureY,"cull"); // Box 661 cull
		bodyModel[574] = new ModelRendererTurbo(this, 78, 407, textureX, textureY); // Box 492
		bodyModel[575] = new ModelRendererTurbo(this, 81, 397, textureX, textureY); // Box 493
		bodyModel[576] = new ModelRendererTurbo(this, 58, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[577] = new ModelRendererTurbo(this, 77, 414, textureX, textureY); // Box 498
		bodyModel[578] = new ModelRendererTurbo(this, 96, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[579] = new ModelRendererTurbo(this, 81, 404, textureX, textureY); // Box 492
		bodyModel[580] = new ModelRendererTurbo(this, 78, 380, textureX, textureY); // Box 526
		bodyModel[581] = new ModelRendererTurbo(this, 81, 370, textureX, textureY); // Box 527
		bodyModel[582] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 532
		bodyModel[583] = new ModelRendererTurbo(this, 77, 387, textureX, textureY); // Box 533
		bodyModel[584] = new ModelRendererTurbo(this, 58, 373, textureX, textureY,"cull"); // Box 660 cull
		bodyModel[585] = new ModelRendererTurbo(this, 96, 373, textureX, textureY,"cull"); // Box 661 cull
		bodyModel[586] = new ModelRendererTurbo(this, 21, 407, textureX, textureY); // Box 492
		bodyModel[587] = new ModelRendererTurbo(this, 24, 397, textureX, textureY); // Box 493
		bodyModel[588] = new ModelRendererTurbo(this, 1, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[589] = new ModelRendererTurbo(this, 20, 414, textureX, textureY); // Box 498
		bodyModel[590] = new ModelRendererTurbo(this, 39, 400, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[591] = new ModelRendererTurbo(this, 24, 404, textureX, textureY); // Box 492
		bodyModel[592] = new ModelRendererTurbo(this, 21, 380, textureX, textureY); // Box 526
		bodyModel[593] = new ModelRendererTurbo(this, 24, 370, textureX, textureY); // Box 527
		bodyModel[594] = new ModelRendererTurbo(this, 24, 377, textureX, textureY); // Box 532
		bodyModel[595] = new ModelRendererTurbo(this, 20, 387, textureX, textureY); // Box 533
		bodyModel[596] = new ModelRendererTurbo(this, 1, 373, textureX, textureY,"cull"); // Box 660 cull
		bodyModel[597] = new ModelRendererTurbo(this, 39, 373, textureX, textureY,"cull"); // Box 661 cull
		bodyModel[598] = new ModelRendererTurbo(this, 167, 365, textureX, textureY); // Right seat part
		bodyModel[599] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Right seat part
		bodyModel[600] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // Right seat part
		bodyModel[601] = new ModelRendererTurbo(this, 167, 392, textureX, textureY); // Right seat part
		bodyModel[602] = new ModelRendererTurbo(this, 169, 396, textureX, textureY); // Right seat part
		bodyModel[603] = new ModelRendererTurbo(this, 167, 404, textureX, textureY); // Right seat part
		bodyModel[604] = new ModelRendererTurbo(this, 110, 365, textureX, textureY); // Right seat part
		bodyModel[605] = new ModelRendererTurbo(this, 112, 369, textureX, textureY); // Right seat part
		bodyModel[606] = new ModelRendererTurbo(this, 110, 377, textureX, textureY); // Right seat part
		bodyModel[607] = new ModelRendererTurbo(this, 110, 392, textureX, textureY); // Right seat part
		bodyModel[608] = new ModelRendererTurbo(this, 112, 396, textureX, textureY); // Right seat part
		bodyModel[609] = new ModelRendererTurbo(this, 110, 404, textureX, textureY); // Right seat part
		bodyModel[610] = new ModelRendererTurbo(this, 53, 365, textureX, textureY); // Right seat part
		bodyModel[611] = new ModelRendererTurbo(this, 55, 369, textureX, textureY); // Right seat part
		bodyModel[612] = new ModelRendererTurbo(this, 53, 377, textureX, textureY); // Right seat part
		bodyModel[613] = new ModelRendererTurbo(this, 53, 392, textureX, textureY); // Right seat part
		bodyModel[614] = new ModelRendererTurbo(this, 55, 396, textureX, textureY); // Right seat part
		bodyModel[615] = new ModelRendererTurbo(this, 53, 404, textureX, textureY); // Right seat part
		bodyModel[616] = new ModelRendererTurbo(this, 90, 422, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[617] = new ModelRendererTurbo(this, 90, 428, textureX, textureY, "lamp"); // Box 386 glow
		bodyModel[618] = new ModelRendererTurbo(this, 90, 419, textureX, textureY); // Box 384
		bodyModel[619] = new ModelRendererTurbo(this, 90, 425, textureX, textureY); // Box 386
		bodyModel[620] = new ModelRendererTurbo(this, 109, 197, textureX, textureY); // Box 341
		bodyModel[621] = new ModelRendererTurbo(this, 219, 202, textureX, textureY); // Box 41
		bodyModel[622] = new ModelRendererTurbo(this, 240, 200, textureX, textureY); // Box 41
		bodyModel[623] = new ModelRendererTurbo(this, 218, 200, textureX, textureY); // Box 41
		bodyModel[624] = new ModelRendererTurbo(this, 114, 185, textureX, textureY); // Box 627
		bodyModel[625] = new ModelRendererTurbo(this, 88, 258, textureX, textureY); // Box 384
		bodyModel[626] = new ModelRendererTurbo(this, 301, 263, textureX, textureY); // Box 128
		bodyModel[627] = new ModelRendererTurbo(this, 25, 264, textureX, textureY); // Box 128
		bodyModel[628] = new ModelRendererTurbo(this, 242, 474, textureX, textureY); // Box 128
		bodyModel[629] = new ModelRendererTurbo(this, 242, 445, textureX, textureY); // Box 128
		bodyModel[630] = new ModelRendererTurbo(this, 224, 458, textureX, textureY); // Box 128
		bodyModel[631] = new ModelRendererTurbo(this, 225, 460, textureX, textureY); // Box 128
		bodyModel[632] = new ModelRendererTurbo(this, 225, 472, textureX, textureY); // Box 94
		bodyModel[633] = new ModelRendererTurbo(this, 226, 474, textureX, textureY); // Box 95
		bodyModel[634] = new ModelRendererTurbo(this, 234, 470, textureX, textureY); // Box 128
		bodyModel[635] = new ModelRendererTurbo(this, 222, 450, textureX, textureY); // Box 128
		bodyModel[636] = new ModelRendererTurbo(this, 226, 470, textureX, textureY); // Box 128
		bodyModel[637] = new ModelRendererTurbo(this, 225, 456, textureX, textureY); // Box 80
		bodyModel[638] = new ModelRendererTurbo(this, 51, 430, textureX, textureY); // Right seat part
		bodyModel[639] = new ModelRendererTurbo(this, 61, 420, textureX, textureY); // Right seat part
		bodyModel[640] = new ModelRendererTurbo(this, 51, 465, textureX, textureY); // Left seat part
		bodyModel[641] = new ModelRendererTurbo(this, 61, 455, textureX, textureY); // Left seat part
		bodyModel[642] = new ModelRendererTurbo(this, 44, 441, textureX, textureY); // Boc 42
		bodyModel[643] = new ModelRendererTurbo(this, 44, 476, textureX, textureY); // Box 638
		bodyModel[644] = new ModelRendererTurbo(this, 48, 425, textureX, textureY); // Right seat part
		bodyModel[645] = new ModelRendererTurbo(this, 59, 443, textureX, textureY); // Right seat part
		bodyModel[646] = new ModelRendererTurbo(this, 59, 478, textureX, textureY); // Left seat part
		bodyModel[647] = new ModelRendererTurbo(this, 48, 460, textureX, textureY); // Left seat part
		bodyModel[648] = new ModelRendererTurbo(this, 48, 419, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[649] = new ModelRendererTurbo(this, 59, 437, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[650] = new ModelRendererTurbo(this, 59, 472, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[651] = new ModelRendererTurbo(this, 48, 454, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[652] = new ModelRendererTurbo(this, 23, 430, textureX, textureY); // Right seat part
		bodyModel[653] = new ModelRendererTurbo(this, 33, 420, textureX, textureY); // Right seat part
		bodyModel[654] = new ModelRendererTurbo(this, 23, 465, textureX, textureY); // Left seat part
		bodyModel[655] = new ModelRendererTurbo(this, 33, 455, textureX, textureY); // Left seat part
		bodyModel[656] = new ModelRendererTurbo(this, 16, 441, textureX, textureY); // Boc 42
		bodyModel[657] = new ModelRendererTurbo(this, 16, 476, textureX, textureY); // Box 638
		bodyModel[658] = new ModelRendererTurbo(this, 20, 425, textureX, textureY); // Right seat part
		bodyModel[659] = new ModelRendererTurbo(this, 31, 443, textureX, textureY); // Right seat part
		bodyModel[660] = new ModelRendererTurbo(this, 31, 478, textureX, textureY); // Left seat part
		bodyModel[661] = new ModelRendererTurbo(this, 20, 460, textureX, textureY); // Left seat part
		bodyModel[662] = new ModelRendererTurbo(this, 20, 419, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[663] = new ModelRendererTurbo(this, 31, 437, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[664] = new ModelRendererTurbo(this, 31, 472, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[665] = new ModelRendererTurbo(this, 20, 454, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[666] = new ModelRendererTurbo(this, 428, 67, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[667] = new ModelRendererTurbo(this, 428, 70, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[668] = new ModelRendererTurbo(this, 19, 4, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[669] = new ModelRendererTurbo(this, 19, 7, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[670] = new ModelRendererTurbo(this, 428, 89, textureX, textureY,"cull"); // Box 685 cull
		bodyModel[671] = new ModelRendererTurbo(this, 428, 92, textureX, textureY,"cull"); // Box 686 cull
		bodyModel[672] = new ModelRendererTurbo(this, 30, 4, textureX, textureY,"cull"); // Box 687 cull
		bodyModel[673] = new ModelRendererTurbo(this, 30, 7, textureX, textureY,"cull"); // Box 688 cull
		bodyModel[674] = new ModelRendererTurbo(this, 16, 162, textureX, textureY); // Box 128
		bodyModel[675] = new ModelRendererTurbo(this, 418, 110, textureX, textureY); // Box 128
		bodyModel[676] = new ModelRendererTurbo(this, 1, 78, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[677] = new ModelRendererTurbo(this, 1, 73, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[678] = new ModelRendererTurbo(this, 379, 111, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[679] = new ModelRendererTurbo(this, 379, 106, textureX, textureY, "lamp"); // Box 1208 makrerlight twO

		bodyModel[500].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[500].setRotationPoint(-36.5F, -3F, -7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[501].setRotationPoint(-36.5F, -8F, -7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[502].setRotationPoint(-38F, -1F, 5F);

		bodyModel[503].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[503].setRotationPoint(-38F, -1F, -9F);

		bodyModel[504].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(-36.5F, -3F, 7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[505].setRotationPoint(-36.5F, -3F, 7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[506].setRotationPoint(-36.5F, -3F, -7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(-36.5F, -3F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[508].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[509].setRotationPoint(-36.5F, -5F, 7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[510].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[511].setRotationPoint(-36.5F, -5F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[512].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[513].setRotationPoint(-46.5F, -8F, 7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[514].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[515].setRotationPoint(-46.5F, -8F, -7F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[516].setRotationPoint(-48F, -1F, 5F);

		bodyModel[517].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[517].setRotationPoint(-48F, -1F, -9F);

		bodyModel[518].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[518].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[518].rotateAngleY = -3.14159265F;

		bodyModel[519].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[519].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[519].rotateAngleY = -3.14159265F;

		bodyModel[520].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[520].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[520].rotateAngleY = -3.14159265F;

		bodyModel[521].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[521].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[521].rotateAngleY = -3.14159265F;

		bodyModel[522].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[522].setRotationPoint(-46.5F, -5F, 7F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[523].setRotationPoint(-46.5F, -5F, 7F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[524].setRotationPoint(-46.5F, -5F, -7F);
		bodyModel[524].rotateAngleY = -3.14159265F;

		bodyModel[525].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[525].setRotationPoint(-46.5F, -5F, -7F);
		bodyModel[525].rotateAngleY = -3.14159265F;

		bodyModel[526].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[526].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[527].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[528].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[529].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[530].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[530].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[530].rotateAngleY = 0.78539816F;

		bodyModel[531].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[531].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[531].rotateAngleY = -0.78539816F;

		bodyModel[532].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[532].setRotationPoint(-55.5F, -11F, -9.9F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[533].setRotationPoint(-55.5F, -11F, 9.9F);

		bodyModel[534].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 128
		bodyModel[534].setRotationPoint(-31.5F, -7F, 3F);

		bodyModel[535].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 537
		bodyModel[535].setRotationPoint(-31.5F, -7F, -10F);

		bodyModel[536].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 128
		bodyModel[536].setRotationPoint(-31.5F, -17F, 3F);

		bodyModel[537].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 539
		bodyModel[537].setRotationPoint(-31.5F, -17F, -4F);

		bodyModel[538].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 128
		bodyModel[538].setRotationPoint(-31F, -15F, 4F);

		bodyModel[539].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 128
		bodyModel[539].setRotationPoint(-31F, -17F, 4F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[540].setRotationPoint(-31F, -17F, 8F);

		bodyModel[541].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 543
		bodyModel[541].setRotationPoint(-31F, -17F, -8F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[542].setRotationPoint(-31F, -17F, -10F);

		bodyModel[543].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 545
		bodyModel[543].setRotationPoint(-31F, -15F, -10F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.01F, 0.05F, 0F); // Box 386
		bodyModel[544].setRotationPoint(-31F, -14F, 9.66F);
		bodyModel[544].rotateAngleX = 0.16580628F;

		bodyModel[545].addShapeBox(0F, 0F, -3F, 1, 0, 6, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.01F, 0F, -3F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.01F, 0F, -3F); // Box 386
		bodyModel[545].setRotationPoint(-31F, -11.98F, 10F);
		bodyModel[545].rotateAngleX = -0.34906585F;

		bodyModel[546].addShapeBox(0F, 0F, -3F, 1, 0, 3, 0F,-0.01F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 386
		bodyModel[546].setRotationPoint(-31F, -14F, 9.66F);
		bodyModel[546].rotateAngleX = 0.38135444F;

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.01F, 0.05F, 0F); // Box 549
		bodyModel[547].setRotationPoint(-31F, -14F, -9.66F);
		bodyModel[547].rotateAngleX = -0.16580628F;

		bodyModel[548].addShapeBox(0F, 0F, -3F, 1, 0, 6, 0F,-0.01F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 550
		bodyModel[548].setRotationPoint(-31F, -11.98F, -10F);
		bodyModel[548].rotateAngleX = 0.34906585F;

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.325F, -0.01F, 0F, -0.325F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.325F, -0.01F, 0F, -0.325F); // Box 551
		bodyModel[549].setRotationPoint(-31F, -14F, -9.66F);
		bodyModel[549].rotateAngleX = -0.38135444F;

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[550].setRotationPoint(-36.5F, -3F, -8F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[551].setRotationPoint(-36.5F, -7F, -9F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[552].setRotationPoint(-37F, -4.5F, -9F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[553].setRotationPoint(-36.5F, -1.5F, -9.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[554].setRotationPoint(-32.5F, -4.5F, -9F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[555].setRotationPoint(-36.5F, -2.5F, -9F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[556].setRotationPoint(-36.5F, -3F, 4F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[557].setRotationPoint(-36.5F, -7F, 8F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[558].setRotationPoint(-36.5F, -2.5F, 8F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 533
		bodyModel[559].setRotationPoint(-36.5F, -1.5F, 8.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 660 cull
		bodyModel[560].setRotationPoint(-37F, -4.5F, 1F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 661 cull
		bodyModel[561].setRotationPoint(-32.5F, -4.5F, 1F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[562].setRotationPoint(-42.5F, -3F, -8F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[563].setRotationPoint(-42.5F, -7F, -9F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[564].setRotationPoint(-43F, -4.5F, -9F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[565].setRotationPoint(-42.5F, -1.5F, -9.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[566].setRotationPoint(-38.5F, -4.5F, -9F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[567].setRotationPoint(-42.5F, -2.5F, -9F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[568].setRotationPoint(-42.5F, -3F, 4F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[569].setRotationPoint(-42.5F, -7F, 8F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[570].setRotationPoint(-42.5F, -2.5F, 8F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 533
		bodyModel[571].setRotationPoint(-42.5F, -1.5F, 8.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 660 cull
		bodyModel[572].setRotationPoint(-43F, -4.5F, 1F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 661 cull
		bodyModel[573].setRotationPoint(-38.5F, -4.5F, 1F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[574].setRotationPoint(-48.5F, -3F, -8F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[575].setRotationPoint(-48.5F, -7F, -9F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[576].setRotationPoint(-49F, -4.5F, -9F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[577].setRotationPoint(-48.5F, -1.5F, -9.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[578].setRotationPoint(-44.5F, -4.5F, -9F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[579].setRotationPoint(-48.5F, -2.5F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[580].setRotationPoint(-48.5F, -3F, 4F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[581].setRotationPoint(-48.5F, -7F, 8F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[582].setRotationPoint(-48.5F, -2.5F, 8F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 533
		bodyModel[583].setRotationPoint(-48.5F, -1.5F, 8.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 660 cull
		bodyModel[584].setRotationPoint(-49F, -4.5F, 1F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 661 cull
		bodyModel[585].setRotationPoint(-44.5F, -4.5F, 1F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[586].setRotationPoint(-54.5F, -3F, -8F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[587].setRotationPoint(-54.5F, -7F, -9F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[588].setRotationPoint(-55F, -4.5F, -9F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 498
		bodyModel[589].setRotationPoint(-54.5F, -1.5F, -9.5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[590].setRotationPoint(-50.5F, -4.5F, -9F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[591].setRotationPoint(-54.5F, -2.5F, -9F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[592].setRotationPoint(-54.5F, -3F, 4F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 527
		bodyModel[593].setRotationPoint(-54.5F, -7F, 8F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[594].setRotationPoint(-54.5F, -2.5F, 8F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 533
		bodyModel[595].setRotationPoint(-54.5F, -1.5F, 8.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 660 cull
		bodyModel[596].setRotationPoint(-55F, -4.5F, 1F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 661 cull
		bodyModel[597].setRotationPoint(-50.5F, -4.5F, 1F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[598].setRotationPoint(-38.5F, -5F, 2.5F);

		bodyModel[599].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[599].setRotationPoint(-37.5F, -5.5F, 3.5F);
		bodyModel[599].rotateAngleY = -0.78539816F;

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[600].setRotationPoint(-38.5F, 0.5F, 2.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[601].setRotationPoint(-38.5F, -5F, -4.5F);

		bodyModel[602].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[602].setRotationPoint(-37.5F, -5.5F, -3.5F);
		bodyModel[602].rotateAngleY = -0.78539816F;

		bodyModel[603].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[603].setRotationPoint(-38.5F, 0.5F, -4.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[604].setRotationPoint(-44.5F, -5F, 2.5F);

		bodyModel[605].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[605].setRotationPoint(-43.5F, -5.5F, 3.5F);
		bodyModel[605].rotateAngleY = -0.78539816F;

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[606].setRotationPoint(-44.5F, 0.5F, 2.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[607].setRotationPoint(-44.5F, -5F, -4.5F);

		bodyModel[608].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[608].setRotationPoint(-43.5F, -5.5F, -3.5F);
		bodyModel[608].rotateAngleY = -0.78539816F;

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[609].setRotationPoint(-44.5F, 0.5F, -4.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[610].setRotationPoint(-50.5F, -5F, 2.5F);

		bodyModel[611].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[611].setRotationPoint(-49.5F, -5.5F, 3.5F);
		bodyModel[611].rotateAngleY = -0.78539816F;

		bodyModel[612].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[612].setRotationPoint(-50.5F, 0.5F, 2.5F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[613].setRotationPoint(-50.5F, -5F, -4.5F);

		bodyModel[614].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[614].setRotationPoint(-49.5F, -5.5F, -3.5F);
		bodyModel[614].rotateAngleY = -0.78539816F;

		bodyModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[615].setRotationPoint(-50.5F, 0.5F, -4.5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384 glow
		bodyModel[616].setRotationPoint(-55.5F, -16.5F, -5F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[617].setRotationPoint(-55.5F, -16.5F, 4F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384
		bodyModel[618].setRotationPoint(-55.5F, -17F, -5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386
		bodyModel[619].setRotationPoint(-55.5F, -17F, 4F);

		bodyModel[620].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 341
		bodyModel[620].setRotationPoint(31.5F, 3F, 6.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[621].setRotationPoint(-19.5F, 2.75F, 7.4F);
		bodyModel[621].rotateAngleX = -0.78539816F;

		bodyModel[622].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[622].setRotationPoint(-19.51F, 3F, 6.9F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[623].setRotationPoint(-10.49F, 3F, 6.9F);

		bodyModel[624].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 627
		bodyModel[624].setRotationPoint(31.5F, 3F, -9.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 384
		bodyModel[625].setRotationPoint(-55.5F, -17F, -1F);

		bodyModel[626].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 128
		bodyModel[626].setRotationPoint(47.49F, -16F, -3F);

		bodyModel[627].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 128
		bodyModel[627].setRotationPoint(-55.49F, -16F, -3F);

		bodyModel[628].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[628].setRotationPoint(-36.5F, -13F, -10F);

		bodyModel[629].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[629].setRotationPoint(-36.5F, -13F, 3F);

		bodyModel[630].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[630].setRotationPoint(-36.5F, -15F, 3F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[631].setRotationPoint(-36.5F, -15F, 9F);

		bodyModel[632].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[632].setRotationPoint(-36.5F, -15F, -9F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[633].setRotationPoint(-36.5F, -15F, -10F);

		bodyModel[634].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[634].setRotationPoint(-36.5F, -15F, -3F);

		bodyModel[635].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[635].setRotationPoint(-36.5F, -17F, -8.5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[636].setRotationPoint(-36.5F, -17F, -9.5F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[637].setRotationPoint(-36.5F, -17F, 8.5F);

		bodyModel[638].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[638].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[638].rotateAngleY = -3.14159265F;

		bodyModel[639].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[639].setRotationPoint(-40.5F, -8F, 7F);
		bodyModel[639].rotateAngleY = -3.14159265F;

		bodyModel[640].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[640].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[640].rotateAngleY = -3.14159265F;

		bodyModel[641].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[641].setRotationPoint(-40.5F, -8F, -7F);
		bodyModel[641].rotateAngleY = -3.14159265F;

		bodyModel[642].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[642].setRotationPoint(-42F, -1F, 5F);

		bodyModel[643].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[643].setRotationPoint(-42F, -1F, -9F);

		bodyModel[644].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[644].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[644].rotateAngleY = -3.14159265F;

		bodyModel[645].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[645].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[645].rotateAngleY = -3.14159265F;

		bodyModel[646].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[646].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[646].rotateAngleY = -3.14159265F;

		bodyModel[647].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[647].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[647].rotateAngleY = -3.14159265F;

		bodyModel[648].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[648].setRotationPoint(-40.5F, -5F, 7F);
		bodyModel[648].rotateAngleY = -3.14159265F;

		bodyModel[649].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[649].setRotationPoint(-40.5F, -5F, 7F);
		bodyModel[649].rotateAngleY = -3.14159265F;

		bodyModel[650].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[650].setRotationPoint(-40.5F, -5F, -7F);
		bodyModel[650].rotateAngleY = -3.14159265F;

		bodyModel[651].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[651].setRotationPoint(-40.5F, -5F, -7F);
		bodyModel[651].rotateAngleY = -3.14159265F;

		bodyModel[652].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[652].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[652].rotateAngleY = -3.14159265F;

		bodyModel[653].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[653].setRotationPoint(-50.5F, -8F, 7F);
		bodyModel[653].rotateAngleY = -3.14159265F;

		bodyModel[654].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[654].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[654].rotateAngleY = -3.14159265F;

		bodyModel[655].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[655].setRotationPoint(-50.5F, -8F, -7F);
		bodyModel[655].rotateAngleY = -3.14159265F;

		bodyModel[656].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[656].setRotationPoint(-52F, -1F, 5F);

		bodyModel[657].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[657].setRotationPoint(-52F, -1F, -9F);

		bodyModel[658].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[658].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[658].rotateAngleY = -3.14159265F;

		bodyModel[659].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[659].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[659].rotateAngleY = -3.14159265F;

		bodyModel[660].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[660].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[660].rotateAngleY = -3.14159265F;

		bodyModel[661].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[661].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[661].rotateAngleY = -3.14159265F;

		bodyModel[662].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[662].setRotationPoint(-50.5F, -5F, 7F);
		bodyModel[662].rotateAngleY = -3.14159265F;

		bodyModel[663].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[663].setRotationPoint(-50.5F, -5F, 7F);
		bodyModel[663].rotateAngleY = -3.14159265F;

		bodyModel[664].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[664].setRotationPoint(-50.5F, -5F, -7F);
		bodyModel[664].rotateAngleY = -3.14159265F;

		bodyModel[665].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[665].setRotationPoint(-50.5F, -5F, -7F);
		bodyModel[665].rotateAngleY = -3.14159265F;

		bodyModel[666].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[666].setRotationPoint(56.5F, -14F, 10F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[667].setRotationPoint(56.5F, -13F, 9.99F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[668].setRotationPoint(-60.5F, -14F, 10F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[669].setRotationPoint(-60.5F, -13F, 9.99F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 685 cull
		bodyModel[670].setRotationPoint(56.5F, -14F, -11F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 686 cull
		bodyModel[671].setRotationPoint(56.5F, -13F, -10.99F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 687 cull
		bodyModel[672].setRotationPoint(-60.5F, -14F, -11F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 688 cull
		bodyModel[673].setRotationPoint(-60.5F, -13F, -10.99F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[674].setRotationPoint(-63.5F, 1F, -4F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[675].setRotationPoint(63F, 1F, -4F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[676].setRotationPoint(-61.72F, -15F, -9.5F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[677].setRotationPoint(-61.72F, -15F, 7.5F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.1F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[678].setRotationPoint(61.22F, -15F, -9.5F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[679].setRotationPoint(61.22F, -15F, 7.5F);
	}
	ModelPS_Truck_41E bogie1 = new ModelPS_Truck_41E();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 680; i++)
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
		if(GetColor(entity)==10||GetColor(entity)==0
				||GetColor(entity)==15||GetColor(entity)==3
				||GetColor(entity)==15||GetColor(entity)==20
				||GetColor(entity)==21||GetColor(entity)==22
				||GetColor(entity)==23||GetColor(entity)==24
				||GetColor(entity)==25||GetColor(entity)==26
				||GetColor(entity)==27){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-E_truck_black_roller.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-E_truck_black.png"));
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