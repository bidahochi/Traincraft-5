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

public class ModelOBBAR52SeatCoach_Dinette extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOBBAR52SeatCoach_Dinette() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[665];

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
		bodyModel[111] = new ModelRendererTurbo(this, 311, 89, textureX, textureY); // Side door RR part
		bodyModel[112] = new ModelRendererTurbo(this, 311, 92, textureX, textureY); // Side door RR part
		bodyModel[113] = new ModelRendererTurbo(this, 308, 86, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 308, 64, textureX, textureY); // Box 120
		bodyModel[115] = new ModelRendererTurbo(this, 76, 86, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 76, 64, textureX, textureY); // Box 120
		bodyModel[117] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Side door RL part
		bodyModel[118] = new ModelRendererTurbo(this, 311, 70, textureX, textureY); // Side door RL part
		bodyModel[119] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Side door FR part
		bodyModel[120] = new ModelRendererTurbo(this, 65, 92, textureX, textureY); // Side door FR part
		bodyModel[121] = new ModelRendererTurbo(this, 65, 67, textureX, textureY); // Side door FL part
		bodyModel[122] = new ModelRendererTurbo(this, 65, 70, textureX, textureY); // Side door FL part
		bodyModel[123] = new ModelRendererTurbo(this, 76, 108, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 76, 135, textureX, textureY); // Box 130
		bodyModel[125] = new ModelRendererTurbo(this, 308, 108, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 308, 135, textureX, textureY); // Box 130
		bodyModel[127] = new ModelRendererTurbo(this, 347, 48, textureX, textureY); // Box 135
		bodyModel[128] = new ModelRendererTurbo(this, 357, 41, textureX, textureY); // Box 136
		bodyModel[129] = new ModelRendererTurbo(this, 323, 58, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 334, 59, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 314, 58, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 368, 38, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 347, 23, textureX, textureY); // Box 147
		bodyModel[134] = new ModelRendererTurbo(this, 357, 33, textureX, textureY); // Box 148
		bodyModel[135] = new ModelRendererTurbo(this, 323, 18, textureX, textureY); // Box 149
		bodyModel[136] = new ModelRendererTurbo(this, 334, 19, textureX, textureY); // Box 150
		bodyModel[137] = new ModelRendererTurbo(this, 314, 18, textureX, textureY); // Box 151
		bodyModel[138] = new ModelRendererTurbo(this, 368, 30, textureX, textureY); // Box 152
		bodyModel[139] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 346, 33, textureX, textureY); // Box 154
		bodyModel[141] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 366, 47, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 315, 48, textureX, textureY); // Box 128
		bodyModel[145] = new ModelRendererTurbo(this, 366, 22, textureX, textureY); // Box 163
		bodyModel[146] = new ModelRendererTurbo(this, 315, 24, textureX, textureY); // Box 164
		bodyModel[147] = new ModelRendererTurbo(this, 332, 49, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 332, 25, textureX, textureY); // Box 166
		bodyModel[149] = new ModelRendererTurbo(this, 342, 49, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 342, 25, textureX, textureY); // Box 168
		bodyModel[151] = new ModelRendererTurbo(this, 326, 41, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 315, 41, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 326, 34, textureX, textureY); // Box 171
		bodyModel[154] = new ModelRendererTurbo(this, 315, 34, textureX, textureY); // Box 172
		bodyModel[155] = new ModelRendererTurbo(this, 30, 40, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 154
		bodyModel[157] = new ModelRendererTurbo(this, 37, 41, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 37, 34, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 53, 58, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 42, 59, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 52, 18, textureX, textureY); // Box 149
		bodyModel[163] = new ModelRendererTurbo(this, 41, 19, textureX, textureY); // Box 150
		bodyModel[164] = new ModelRendererTurbo(this, 63, 18, textureX, textureY); // Box 151
		bodyModel[165] = new ModelRendererTurbo(this, 4, 38, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 152
		bodyModel[167] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 4, 22, textureX, textureY); // Box 163
		bodyModel[169] = new ModelRendererTurbo(this, 19, 48, textureX, textureY); // Box 135
		bodyModel[170] = new ModelRendererTurbo(this, 15, 41, textureX, textureY); // Box 136
		bodyModel[171] = new ModelRendererTurbo(this, 19, 23, textureX, textureY); // Box 147
		bodyModel[172] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 148
		bodyModel[173] = new ModelRendererTurbo(this, 55, 48, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 55, 24, textureX, textureY); // Box 164
		bodyModel[175] = new ModelRendererTurbo(this, 40, 49, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 40, 25, textureX, textureY); // Box 166
		bodyModel[177] = new ModelRendererTurbo(this, 38, 49, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 168
		bodyModel[179] = new ModelRendererTurbo(this, 50, 41, textureX, textureY); // Box 128
		bodyModel[180] = new ModelRendererTurbo(this, 61, 41, textureX, textureY); // Box 128
		bodyModel[181] = new ModelRendererTurbo(this, 50, 34, textureX, textureY); // Box 171
		bodyModel[182] = new ModelRendererTurbo(this, 61, 34, textureX, textureY); // Box 172
		bodyModel[183] = new ModelRendererTurbo(this, 32, 152, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 63, 152, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 35, 151, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 32, 156, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 47, 148, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 38, 148, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 39, 160, textureX, textureY); // Box 2
		bodyModel[194] = new ModelRendererTurbo(this, 49, 151, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 40, 151, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 18, 118, textureX, textureY); // Box 216
		bodyModel[197] = new ModelRendererTurbo(this, 44, 109, textureX, textureY); // Box 217
		bodyModel[198] = new ModelRendererTurbo(this, 44, 115, textureX, textureY); // Box 218
		bodyModel[199] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 219
		bodyModel[200] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 220
		bodyModel[201] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 221
		bodyModel[202] = new ModelRendererTurbo(this, 21, 117, textureX, textureY); // Box 222
		bodyModel[203] = new ModelRendererTurbo(this, 18, 122, textureX, textureY); // Box 223
		bodyModel[204] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Box 224
		bodyModel[205] = new ModelRendererTurbo(this, 24, 114, textureX, textureY); // Box 225
		bodyModel[206] = new ModelRendererTurbo(this, 24, 126, textureX, textureY); // Box 226
		bodyModel[207] = new ModelRendererTurbo(this, 35, 117, textureX, textureY); // Box 227
		bodyModel[208] = new ModelRendererTurbo(this, 26, 117, textureX, textureY); // Box 228
		bodyModel[209] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 128
		bodyModel[210] = new ModelRendererTurbo(this, 330, 145, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 335, 152, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 335, 156, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 307, 151, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 304, 156, textureX, textureY); // Box 128
		bodyModel[217] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 319, 160, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 312, 151, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 2
		bodyModel[222] = new ModelRendererTurbo(this, 336, 116, textureX, textureY); // Box 216
		bodyModel[223] = new ModelRendererTurbo(this, 354, 113, textureX, textureY); // Box 217
		bodyModel[224] = new ModelRendererTurbo(this, 354, 119, textureX, textureY); // Box 218
		bodyModel[225] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Box 219
		bodyModel[226] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Box 220
		bodyModel[227] = new ModelRendererTurbo(this, 337, 109, textureX, textureY); // Box 221
		bodyModel[228] = new ModelRendererTurbo(this, 339, 115, textureX, textureY); // Box 222
		bodyModel[229] = new ModelRendererTurbo(this, 336, 120, textureX, textureY); // Box 223
		bodyModel[230] = new ModelRendererTurbo(this, 343, 112, textureX, textureY); // Box 224
		bodyModel[231] = new ModelRendererTurbo(this, 343, 118, textureX, textureY); // Box 225
		bodyModel[232] = new ModelRendererTurbo(this, 343, 130, textureX, textureY); // Box 226
		bodyModel[233] = new ModelRendererTurbo(this, 345, 115, textureX, textureY); // Box 227
		bodyModel[234] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 228
		bodyModel[235] = new ModelRendererTurbo(this, 305, 5, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 310, 2, textureX, textureY); // Box 128
		bodyModel[237] = new ModelRendererTurbo(this, 310, 13, textureX, textureY); // Box 199
		bodyModel[238] = new ModelRendererTurbo(this, 305, 23, textureX, textureY); // Box 285
		bodyModel[239] = new ModelRendererTurbo(this, 305, 4, textureX, textureY); // Box 286
		bodyModel[240] = new ModelRendererTurbo(this, 279, 20, textureX, textureY); // Box 199
		bodyModel[241] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 199
		bodyModel[242] = new ModelRendererTurbo(this, 279, 1, textureX, textureY); // Box 280
		bodyModel[243] = new ModelRendererTurbo(this, 281, 7, textureX, textureY); // Box 281
		bodyModel[244] = new ModelRendererTurbo(this, 86, 20, textureX, textureY); // Box 199
		bodyModel[245] = new ModelRendererTurbo(this, 88, 17, textureX, textureY); // Box 199
		bodyModel[246] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 294
		bodyModel[247] = new ModelRendererTurbo(this, 88, 7, textureX, textureY); // Box 295
		bodyModel[248] = new ModelRendererTurbo(this, 308, 77, textureX, textureY); // Box 128
		bodyModel[249] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Box 128
		bodyModel[250] = new ModelRendererTurbo(this, 308, 99, textureX, textureY); // Box 202
		bodyModel[251] = new ModelRendererTurbo(this, 322, 99, textureX, textureY); // Box 203
		bodyModel[252] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 128
		bodyModel[253] = new ModelRendererTurbo(this, 76, 77, textureX, textureY); // Box 128
		bodyModel[254] = new ModelRendererTurbo(this, 62, 99, textureX, textureY); // Box 202
		bodyModel[255] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 203
		bodyModel[256] = new ModelRendererTurbo(this, 38, 154, textureX, textureY); // Box 2
		bodyModel[257] = new ModelRendererTurbo(this, 40, 157, textureX, textureY); // Box 2
		bodyModel[258] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 225
		bodyModel[259] = new ModelRendererTurbo(this, 26, 123, textureX, textureY); // Box 228
		bodyModel[260] = new ModelRendererTurbo(this, 319, 154, textureX, textureY); // Box 2
		bodyModel[261] = new ModelRendererTurbo(this, 321, 157, textureX, textureY); // Box 2
		bodyModel[262] = new ModelRendererTurbo(this, 343, 124, textureX, textureY); // Box 225
		bodyModel[263] = new ModelRendererTurbo(this, 345, 127, textureX, textureY); // Box 228
		bodyModel[264] = new ModelRendererTurbo(this, 125, 165, textureX, textureY); // Box 41
		bodyModel[265] = new ModelRendererTurbo(this, 142, 165, textureX, textureY); // Box 41
		bodyModel[266] = new ModelRendererTurbo(this, 122, 165, textureX, textureY); // Box 41
		bodyModel[267] = new ModelRendererTurbo(this, 149, 197, textureX, textureY); // Box 2
		bodyModel[268] = new ModelRendererTurbo(this, 184, 202, textureX, textureY); // Box 2
		bodyModel[269] = new ModelRendererTurbo(this, 187, 197, textureX, textureY); // Box 2
		bodyModel[270] = new ModelRendererTurbo(this, 214, 204, textureX, textureY); // Box 2
		bodyModel[271] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 2
		bodyModel[272] = new ModelRendererTurbo(this, 143, 192, textureX, textureY); // Box 2
		bodyModel[273] = new ModelRendererTurbo(this, 115, 192, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 121, 187, textureX, textureY); // Box 336
		bodyModel[275] = new ModelRendererTurbo(this, 143, 184, textureX, textureY); // Box 337
		bodyModel[276] = new ModelRendererTurbo(this, 115, 184, textureX, textureY); // Box 338
		bodyModel[277] = new ModelRendererTurbo(this, 154, 184, textureX, textureY); // Box 339
		bodyModel[278] = new ModelRendererTurbo(this, 189, 189, textureX, textureY); // Box 340
		bodyModel[279] = new ModelRendererTurbo(this, 209, 184, textureX, textureY); // Box 341
		bodyModel[280] = new ModelRendererTurbo(this, 192, 189, textureX, textureY); // Box 41
		bodyModel[281] = new ModelRendererTurbo(this, 202, 186, textureX, textureY); // Box 340
		bodyModel[282] = new ModelRendererTurbo(this, 196, 186, textureX, textureY); // Box 340
		bodyModel[283] = new ModelRendererTurbo(this, 202, 183, textureX, textureY); // Box 340
		bodyModel[284] = new ModelRendererTurbo(this, 196, 183, textureX, textureY); // Box 340
		bodyModel[285] = new ModelRendererTurbo(this, 121, 204, textureX, textureY); // Box 41
		bodyModel[286] = new ModelRendererTurbo(this, 136, 203, textureX, textureY); // Box 41
		bodyModel[287] = new ModelRendererTurbo(this, 141, 204, textureX, textureY); // Box 41
		bodyModel[288] = new ModelRendererTurbo(this, 116, 204, textureX, textureY); // Box 41
		bodyModel[289] = new ModelRendererTurbo(this, 143, 184, textureX, textureY); // Box 354
		bodyModel[290] = new ModelRendererTurbo(this, 126, 184, textureX, textureY); // Box 355
		bodyModel[291] = new ModelRendererTurbo(this, 126, 179, textureX, textureY); // Box 356
		bodyModel[292] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 356
		bodyModel[293] = new ModelRendererTurbo(this, 121, 182, textureX, textureY); // Box 356
		bodyModel[294] = new ModelRendererTurbo(this, 122, 179, textureX, textureY); // Box 356
		bodyModel[295] = new ModelRendererTurbo(this, 332, 286, textureX, textureY); // Box 128
		bodyModel[296] = new ModelRendererTurbo(this, 339, 286, textureX, textureY); // Box 128
		bodyModel[297] = new ModelRendererTurbo(this, 361, 291, textureX, textureY); // Box 38
		bodyModel[298] = new ModelRendererTurbo(this, 364, 296, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 363, 300, textureX, textureY); // Box 38
		bodyModel[300] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 365
		bodyModel[301] = new ModelRendererTurbo(this, 339, 321, textureX, textureY); // Box 366
		bodyModel[302] = new ModelRendererTurbo(this, 364, 331, textureX, textureY); // Box 368
		bodyModel[303] = new ModelRendererTurbo(this, 363, 335, textureX, textureY); // Box 369
		bodyModel[304] = new ModelRendererTurbo(this, 361, 326, textureX, textureY); // Box 370
		bodyModel[305] = new ModelRendererTurbo(this, 343, 288, textureX, textureY); // Box 128
		bodyModel[306] = new ModelRendererTurbo(this, 82, 238, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 82, 229, textureX, textureY); // Box 374
		bodyModel[308] = new ModelRendererTurbo(this, 346, 289, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 341, 296, textureX, textureY); // Box 128
		bodyModel[310] = new ModelRendererTurbo(this, 353, 296, textureX, textureY); // Box 41
		bodyModel[311] = new ModelRendererTurbo(this, 343, 323, textureX, textureY); // Box 379
		bodyModel[312] = new ModelRendererTurbo(this, 346, 324, textureX, textureY); // Box 380
		bodyModel[313] = new ModelRendererTurbo(this, 341, 331, textureX, textureY); // Box 381
		bodyModel[314] = new ModelRendererTurbo(this, 353, 331, textureX, textureY); // Box 382
		bodyModel[315] = new ModelRendererTurbo(this, 320, 319, textureX, textureY, "lamp"); // Box 86 glow
		bodyModel[316] = new ModelRendererTurbo(this, 320, 284, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[317] = new ModelRendererTurbo(this, 90, 243, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[318] = new ModelRendererTurbo(this, 90, 249, textureX, textureY, "lamp"); // Box 386 glow
		bodyModel[319] = new ModelRendererTurbo(this, 324, 273, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[320] = new ModelRendererTurbo(this, 91, 266, textureX, textureY); // Box 386
		bodyModel[321] = new ModelRendererTurbo(this, 91, 255, textureX, textureY); // Box 391
		bodyModel[322] = new ModelRendererTurbo(this, 85, 346, textureX, textureY); // Box 386
		bodyModel[323] = new ModelRendererTurbo(this, 85, 339, textureX, textureY); // Box 393
		bodyModel[324] = new ModelRendererTurbo(this, 88, 262, textureX, textureY); // Box 386
		bodyModel[325] = new ModelRendererTurbo(this, 88, 251, textureX, textureY); // Box 395
		bodyModel[326] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[327] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[328] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[331] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[332] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[337] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[338] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[339] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[340] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[341] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[342] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[343] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[345] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[346] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[348] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[349] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[350] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[351] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[352] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[353] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[354] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[357] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[358] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[359] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[360] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[363] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[364] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[365] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[366] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[367] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[368] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[372] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[373] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[374] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[377] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[378] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[379] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[380] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[381] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[382] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[385] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[387] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[388] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[389] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[391] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[392] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[393] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[394] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[395] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[396] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part
		bodyModel[399] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part
		bodyModel[400] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[401] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[402] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part
		bodyModel[405] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part
		bodyModel[406] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[407] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[408] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[409] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[410] = new ModelRendererTurbo(this, 79, 286, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 89, 276, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 79, 321, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 89, 311, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 72, 297, textureX, textureY); // Boc 42
		bodyModel[415] = new ModelRendererTurbo(this, 72, 332, textureX, textureY); // Box 638
		bodyModel[416] = new ModelRendererTurbo(this, 76, 281, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 87, 299, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 87, 334, textureX, textureY); // Left seat part
		bodyModel[419] = new ModelRendererTurbo(this, 76, 316, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 76, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[421] = new ModelRendererTurbo(this, 87, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[422] = new ModelRendererTurbo(this, 87, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[423] = new ModelRendererTurbo(this, 76, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[424] = new ModelRendererTurbo(this, 51, 286, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 61, 276, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 51, 321, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 61, 311, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 44, 297, textureX, textureY); // Boc 42
		bodyModel[429] = new ModelRendererTurbo(this, 44, 332, textureX, textureY); // Box 638
		bodyModel[430] = new ModelRendererTurbo(this, 48, 281, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 59, 299, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 59, 334, textureX, textureY); // Left seat part
		bodyModel[433] = new ModelRendererTurbo(this, 48, 316, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 48, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[435] = new ModelRendererTurbo(this, 59, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[436] = new ModelRendererTurbo(this, 59, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[437] = new ModelRendererTurbo(this, 48, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[438] = new ModelRendererTurbo(this, 23, 286, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 33, 276, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 23, 321, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 33, 311, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 16, 297, textureX, textureY); // Boc 42
		bodyModel[443] = new ModelRendererTurbo(this, 16, 332, textureX, textureY); // Box 638
		bodyModel[444] = new ModelRendererTurbo(this, 20, 281, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 31, 299, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 31, 334, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 20, 316, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 20, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[449] = new ModelRendererTurbo(this, 31, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[450] = new ModelRendererTurbo(this, 31, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[451] = new ModelRendererTurbo(this, 20, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[452] = new ModelRendererTurbo(this, 382, 78, textureX, textureY); // Rear gate closed
		bodyModel[453] = new ModelRendererTurbo(this, 379, 83, textureX, textureY); // Rear gate open
		bodyModel[454] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Front gate closed
		bodyModel[455] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Front gate open
		bodyModel[456] = new ModelRendererTurbo(this, 305, 20, textureX, textureY); // Box 285
		bodyModel[457] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 286
		bodyModel[458] = new ModelRendererTurbo(this, 91, 353, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 91, 359, textureX, textureY); // Box 462
		bodyModel[460] = new ModelRendererTurbo(this, 242, 474, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 242, 445, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 224, 458, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 225, 460, textureX, textureY); // Box 128
		bodyModel[464] = new ModelRendererTurbo(this, 225, 472, textureX, textureY); // Box 94
		bodyModel[465] = new ModelRendererTurbo(this, 226, 474, textureX, textureY); // Box 95
		bodyModel[466] = new ModelRendererTurbo(this, 348, 474, textureX, textureY); // Box 128
		bodyModel[467] = new ModelRendererTurbo(this, 348, 445, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 330, 458, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 331, 460, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 331, 472, textureX, textureY); // Box 94
		bodyModel[471] = new ModelRendererTurbo(this, 332, 474, textureX, textureY); // Box 95
		bodyModel[472] = new ModelRendererTurbo(this, 21, 456, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 21, 427, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 3, 440, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 4, 442, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 4, 454, textureX, textureY); // Box 94
		bodyModel[477] = new ModelRendererTurbo(this, 5, 456, textureX, textureY); // Box 95
		bodyModel[478] = new ModelRendererTurbo(this, 122, 405, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 122, 376, textureX, textureY); // Box 128
		bodyModel[480] = new ModelRendererTurbo(this, 104, 389, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 105, 391, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 105, 403, textureX, textureY); // Box 94
		bodyModel[483] = new ModelRendererTurbo(this, 106, 405, textureX, textureY); // Box 95
		bodyModel[484] = new ModelRendererTurbo(this, 242, 405, textureX, textureY); // Box 128
		bodyModel[485] = new ModelRendererTurbo(this, 242, 376, textureX, textureY); // Box 128
		bodyModel[486] = new ModelRendererTurbo(this, 224, 389, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 225, 391, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 225, 403, textureX, textureY); // Box 94
		bodyModel[489] = new ModelRendererTurbo(this, 226, 405, textureX, textureY); // Box 95
		bodyModel[490] = new ModelRendererTurbo(this, 234, 470, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 222, 450, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 226, 470, textureX, textureY); // Box 128
		bodyModel[493] = new ModelRendererTurbo(this, 225, 456, textureX, textureY); // Box 80
		bodyModel[494] = new ModelRendererTurbo(this, 13, 452, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 1, 432, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 5, 452, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 4, 438, textureX, textureY); // Box 80
		bodyModel[498] = new ModelRendererTurbo(this, 340, 470, textureX, textureY); // Box 128
		bodyModel[499] = new ModelRendererTurbo(this, 328, 450, textureX, textureY); // Box 128

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

		bodyModel[111].addShapeBox(-0.25F, 0F, 0.25F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.76F, 0F, 0F, -0.76F); // Side door RR part
		bodyModel[111].setRotationPoint(56.75F, -14F, 10.25F);

		bodyModel[112].addShapeBox(-0.25F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F); // Side door RR part
		bodyModel[112].setRotationPoint(56.75F, -13F, 10.25F);

		bodyModel[113].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[113].setRotationPoint(56.75F, -13F, 10.5F);

		bodyModel[114].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[114].setRotationPoint(56.75F, -13F, -10.5F);

		bodyModel[115].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[115].setRotationPoint(-56.5F, -13F, 10.5F);

		bodyModel[116].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[116].setRotationPoint(-56.5F, -13F, -10.5F);

		bodyModel[117].addShapeBox(-0.25F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door RL part
		bodyModel[117].setRotationPoint(56.75F, -14F, -10.25F);

		bodyModel[118].addShapeBox(-0.25F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door RL part
		bodyModel[118].setRotationPoint(56.75F, -13F, -10.25F);

		bodyModel[119].addShapeBox(-3.75F, 0F, -0.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Side door FR part
		bodyModel[119].setRotationPoint(-56.75F, -14F, 10.25F);

		bodyModel[120].addShapeBox(-3.75F, 0F, -0.5F, 4, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Side door FR part
		bodyModel[120].setRotationPoint(-56.75F, -13F, 10.25F);

		bodyModel[121].addShapeBox(-3.75F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door FL part
		bodyModel[121].setRotationPoint(-56.75F, -14F, -10.25F);

		bodyModel[122].addShapeBox(-3.75F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door FL part
		bodyModel[122].setRotationPoint(-56.75F, -13F, -10.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-57.25F, 1F, 10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[124].setRotationPoint(-57.25F, 1F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(56.5F, 1F, 10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[126].setRotationPoint(56.5F, 1F, -10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[127].setRotationPoint(58.5F, -17F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[128].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F); // Box 128
		bodyModel[129].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F); // Box 128
		bodyModel[130].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[131].setRotationPoint(58.5F, -17F, -10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 128
		bodyModel[132].setRotationPoint(59.5F, -18.6F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[133].setRotationPoint(58.5F, -17F, 4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[134].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F); // Box 149
		bodyModel[135].setRotationPoint(59F, -17F, 7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F); // Box 150
		bodyModel[136].setRotationPoint(59F, -17F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[137].setRotationPoint(58.5F, -17F, 7.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, -1F, -1.6F, 0F, -1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F); // Box 152
		bodyModel[138].setRotationPoint(59.5F, -18.6F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[139].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[140].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[141].setRotationPoint(58.5F, -17F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F); // Box 128
		bodyModel[142].setRotationPoint(59.04F, -17.8F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F); // Box 158
		bodyModel[143].setRotationPoint(58.5F, -17F, 3.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[144].setRotationPoint(57.5F, -20F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 163
		bodyModel[145].setRotationPoint(59.04F, -17.8F, 3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[146].setRotationPoint(57.5F, -20F, 2.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F); // Box 128
		bodyModel[147].setRotationPoint(57.8F, -19.65F, -8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F); // Box 166
		bodyModel[148].setRotationPoint(57.8F, -19.65F, 3.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F); // Box 128
		bodyModel[149].setRotationPoint(57.8F, -19.65F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F); // Box 168
		bodyModel[150].setRotationPoint(57.8F, -19.65F, 3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[151].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[153].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[154].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[155].setRotationPoint(-59.5F, -17F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[156].setRotationPoint(-59.5F, -17F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[157].setRotationPoint(-59.5F, -17F, -8.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F); // Box 158
		bodyModel[158].setRotationPoint(-59.5F, -17F, 3.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F); // Box 128
		bodyModel[159].setRotationPoint(-61F, -17F, -10.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F); // Box 128
		bodyModel[160].setRotationPoint(-62F, -17F, -10.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[161].setRotationPoint(-59.04F, -17F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F); // Box 149
		bodyModel[162].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F); // Box 150
		bodyModel[163].setRotationPoint(-62F, -17F, 8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[164].setRotationPoint(-59.04F, -17F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, 1F, 0F, -1F, -1.6F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 128
		bodyModel[165].setRotationPoint(-62.5F, -18.6F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F); // Box 152
		bodyModel[166].setRotationPoint(-62.5F, -18.6F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F); // Box 128
		bodyModel[167].setRotationPoint(-62.04F, -17.8F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F); // Box 163
		bodyModel[168].setRotationPoint(-62.04F, -17.8F, 3.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[169].setRotationPoint(-61.5F, -17F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[170].setRotationPoint(-61.5F, -17F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F); // Box 147
		bodyModel[171].setRotationPoint(-61.5F, -17F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[172].setRotationPoint(-61.5F, -17F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 128
		bodyModel[173].setRotationPoint(-59.5F, -20F, -8.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F); // Box 164
		bodyModel[174].setRotationPoint(-59.5F, -20F, 2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F); // Box 128
		bodyModel[175].setRotationPoint(-59.8F, -19.65F, -8.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F); // Box 166
		bodyModel[176].setRotationPoint(-59.8F, -19.65F, 3.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 128
		bodyModel[177].setRotationPoint(-59.8F, -19.65F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 168
		bodyModel[178].setRotationPoint(-59.8F, -19.65F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.975F, 0F, 0F, 0F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[179].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[180].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[181].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 172
		bodyModel[182].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[183].setRotationPoint(-60.5F, 3F, 9.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[184].setRotationPoint(-56.5F, 3F, 5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[185].setRotationPoint(-56.5F, 3F, 8.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[186].setRotationPoint(-56.5F, 3F, 9.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[187].setRotationPoint(-56.5F, 6F, 9.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[188].setRotationPoint(-60.5F, 3F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[189].setRotationPoint(-60.5F, 3F, 8.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[190].setRotationPoint(-60.5F, 6F, 9.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[191].setRotationPoint(-60.5F, 2.5F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[192].setRotationPoint(-60.5F, 4F, 6.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[193].setRotationPoint(-60.5F, 7F, 8.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[194].setRotationPoint(-60.5F, 2.5F, 6.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[195].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[196].setRotationPoint(-60.5F, 3F, -10.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[197].setRotationPoint(-56.5F, 3F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[198].setRotationPoint(-56.5F, 3F, -10.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[199].setRotationPoint(-56.5F, 3F, -10.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[200].setRotationPoint(-56.5F, 6F, -10.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[201].setRotationPoint(-60.5F, 3F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[202].setRotationPoint(-60.5F, 3F, -10.25F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[203].setRotationPoint(-60.5F, 6F, -10.75F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[204].setRotationPoint(-60.5F, 2.5F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[205].setRotationPoint(-60.5F, 4F, -8.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[206].setRotationPoint(-60.5F, 7F, -10.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[207].setRotationPoint(-60.5F, 2.5F, -6.25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[208].setRotationPoint(-60.5F, 4F, -7.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[209].setRotationPoint(56.5F, 3F, 9.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[210].setRotationPoint(60.5F, 3F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[211].setRotationPoint(60.5F, 3F, 8.25F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[212].setRotationPoint(60.5F, 3F, 9.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[213].setRotationPoint(60.5F, 6F, 9.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[214].setRotationPoint(56.5F, 3F, 5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[215].setRotationPoint(56.5F, 3F, 8.25F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[216].setRotationPoint(56.5F, 6F, 9.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[217].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[218].setRotationPoint(56.5F, 4F, 6.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[219].setRotationPoint(56.5F, 7F, 8.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[220].setRotationPoint(56.5F, 2.5F, 6.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[221].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[222].setRotationPoint(56.5F, 3F, -10.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[223].setRotationPoint(60.5F, 3F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[224].setRotationPoint(60.5F, 3F, -10.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[225].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[226].setRotationPoint(60.5F, 6F, -10.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[227].setRotationPoint(56.5F, 3F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[228].setRotationPoint(56.5F, 3F, -10.25F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[229].setRotationPoint(56.5F, 6F, -10.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[230].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[231].setRotationPoint(56.5F, 4F, -8.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[232].setRotationPoint(56.5F, 7F, -10.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[233].setRotationPoint(56.5F, 2.5F, -6.25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[234].setRotationPoint(56.5F, 4F, -7.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[235].setRotationPoint(48.5F, -20.25F, -3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[236].setRotationPoint(48.5F, -20.25F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 199
		bodyModel[237].setRotationPoint(48.5F, -20.25F, 3F);

		bodyModel[238].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.03F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F); // Box 285
		bodyModel[238].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[238].rotateAngleY = 0.78539816F;

		bodyModel[239].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.03F, 0F); // Box 286
		bodyModel[239].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[239].rotateAngleY = -0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[240].setRotationPoint(39.5F, -20.25F, 6.25F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[241].setRotationPoint(39.5F, -20.25F, 5.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[242].setRotationPoint(39.5F, -20.25F, -9.25F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[243].setRotationPoint(39.5F, -20.25F, -6.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[244].setRotationPoint(-49.5F, -20.25F, 6.25F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[245].setRotationPoint(-49.5F, -20.25F, 5.75F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 294
		bodyModel[246].setRotationPoint(-49.5F, -20.25F, -9.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 295
		bodyModel[247].setRotationPoint(-49.5F, -20.25F, -6.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[248].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[249].setRotationPoint(60.5F, -6F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[250].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[251].setRotationPoint(60.5F, -6F, 11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[252].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[253].setRotationPoint(-56.5F, -6F, -12F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[254].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[255].setRotationPoint(-56.5F, -6F, 11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[256].setRotationPoint(-60.5F, 5.5F, 7.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[257].setRotationPoint(-60.5F, 5.5F, 8.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[258].setRotationPoint(-60.5F, 5.5F, -9.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[259].setRotationPoint(-60.5F, 5.5F, -8.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[260].setRotationPoint(56.5F, 5.5F, 7.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[261].setRotationPoint(56.5F, 5.5F, 8.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[262].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[263].setRotationPoint(56.5F, 5.5F, -8.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[264].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[264].rotateAngleX = -0.78539816F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[265].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[266].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 2
		bodyModel[267].setRotationPoint(2.5F, 3F, 4.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 2
		bodyModel[268].setRotationPoint(-1.5F, 3F, 9.49F);

		bodyModel[269].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 2
		bodyModel[269].setRotationPoint(-25.5F, 3F, 4.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[270].setRotationPoint(-27.5F, 3F, 8.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 8, 2, 5, 0F); // Box 2
		bodyModel[271].setRotationPoint(23.5F, 5F, 3.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 2
		bodyModel[272].setRotationPoint(25F, 3F, 3.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 2
		bodyModel[273].setRotationPoint(30F, 3F, 3.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 8, 2, 5, 0F); // Box 336
		bodyModel[274].setRotationPoint(23.5F, 5F, -8.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 337
		bodyModel[275].setRotationPoint(25F, 3F, -8.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 338
		bodyModel[276].setRotationPoint(30F, 3F, -8.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 339
		bodyModel[277].setRotationPoint(2.5F, 3F, -9.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 340
		bodyModel[278].setRotationPoint(-1.5F, 3F, -9.49F);

		bodyModel[279].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 341
		bodyModel[279].setRotationPoint(-25.5F, 3F, -9.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[280].setRotationPoint(-15.5F, 4F, -8.07F);
		bodyModel[280].rotateAngleX = -0.78539816F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[281].setRotationPoint(-14.5F, 3F, -9.49F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[282].setRotationPoint(-11.5F, 3F, -9.49F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[283].setRotationPoint(-14.5F, 3F, -6.65F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 340
		bodyModel[284].setRotationPoint(-11.5F, 3F, -6.65F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F); // Box 41
		bodyModel[285].setRotationPoint(25.5F, 5.5F, 9F);
		bodyModel[285].rotateAngleX = -0.78539816F;

		bodyModel[286].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F); // Box 41
		bodyModel[286].setRotationPoint(27.5F, 3F, 9F);
		bodyModel[286].rotateAngleY = -0.78539816F;

		bodyModel[287].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.5F); // Box 41
		bodyModel[287].setRotationPoint(25.5F, 5.85F, 8.5F);
		bodyModel[287].rotateAngleZ = 0.78539816F;

		bodyModel[288].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.85F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 41
		bodyModel[288].setRotationPoint(30.8F, 5.85F, 8.5F);
		bodyModel[288].rotateAngleZ = 0.78539816F;

		bodyModel[289].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.85F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 354
		bodyModel[289].setRotationPoint(25.5F, 5.85F, -9.5F);
		bodyModel[289].rotateAngleZ = 0.78539816F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F); // Box 355
		bodyModel[290].setRotationPoint(25.5F, 6.2F, -9.71F);
		bodyModel[290].rotateAngleX = 0.78539816F;

		bodyModel[291].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0.2F, -0.25F); // Box 356
		bodyModel[291].setRotationPoint(32F, 3F, -9F);
		bodyModel[291].rotateAngleY = -0.78539816F;

		bodyModel[292].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 356
		bodyModel[292].setRotationPoint(32.6F, 5.45F, -7.75F);
		bodyModel[292].rotateAngleY = -0.78539816F;

		bodyModel[293].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[293].setRotationPoint(32.6F, 4.95F, -7.75F);
		bodyModel[293].rotateAngleY = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 356
		bodyModel[294].setRotationPoint(32.25F, 3F, -7.75F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[295].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[296].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[297].setRotationPoint(54.05F, -2F, 9.95F);
		bodyModel[297].rotateAngleY = -2.35619449F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[298].setRotationPoint(54.4F, -1F, 9.6F);
		bodyModel[298].rotateAngleY = -2.35619449F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[299].setRotationPoint(54.05F, 0.5F, 9.95F);
		bodyModel[299].rotateAngleY = -2.35619449F;

		bodyModel[300].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 365
		bodyModel[300].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 366
		bodyModel[301].setRotationPoint(53.5F, -15F, -5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[302].setRotationPoint(53.15F, -1F, -8.35F);
		bodyModel[302].rotateAngleY = -0.78539816F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[303].setRotationPoint(52.45F, 0.5F, -8.35F);
		bodyModel[303].rotateAngleY = -0.78539816F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[304].setRotationPoint(51.55F, -2F, -8.9F);
		bodyModel[304].rotateAngleY = -0.78539816F;

		bodyModel[305].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 128
		bodyModel[305].setRotationPoint(48.5F, -8.5F, 5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[306].setRotationPoint(-55.5F, -15F, 9.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[307].setRotationPoint(-55.5F, -15F, -10.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[308].setRotationPoint(48.5F, -6F, 5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 128
		bodyModel[309].setRotationPoint(48.5F, -2.4F, 5F);
		bodyModel[309].rotateAngleZ = 1.04719755F;

		bodyModel[310].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[310].setRotationPoint(49.75F, -5F, 7.5F);
		bodyModel[310].rotateAngleY = -0.78539816F;

		bodyModel[311].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 379
		bodyModel[311].setRotationPoint(48.5F, -8.5F, -10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[312].setRotationPoint(48.5F, -6F, -10F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 381
		bodyModel[313].setRotationPoint(48.5F, -2.4F, -10F);
		bodyModel[313].rotateAngleZ = 1.04719755F;

		bodyModel[314].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[314].setRotationPoint(49.75F, -5F, -7.5F);
		bodyModel[314].rotateAngleY = -0.78539816F;

		bodyModel[315].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 86 glow
		bodyModel[315].setRotationPoint(51.5F, -14.99F, -7.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[316].setRotationPoint(51.5F, -14.99F, 6.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 103, 0, 1, 0F); // Box 384 glow
		bodyModel[317].setRotationPoint(-55.5F, -16.99F, -5F);

		bodyModel[318].addBox(0F, 0F, 0F, 103, 0, 1, 0F); // Box 386 glow
		bodyModel[318].setRotationPoint(-55.5F, -16.99F, 4F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[319].setRotationPoint(52F, -13.99F, -0.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 103, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 386
		bodyModel[320].setRotationPoint(-55.5F, -14F, 9.66F);
		bodyModel[320].rotateAngleX = 0.16580628F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 103, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 391
		bodyModel[321].setRotationPoint(-55.5F, -14F, -9.66F);
		bodyModel[321].rotateAngleX = -0.16580628F;

		bodyModel[322].addShapeBox(0F, 0F, -3F, 103, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 386
		bodyModel[322].setRotationPoint(-55.5F, -11.98F, 10F);
		bodyModel[322].rotateAngleX = -0.34906585F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 103, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 393
		bodyModel[323].setRotationPoint(-55.5F, -11.98F, -10F);
		bodyModel[323].rotateAngleX = 0.34906585F;

		bodyModel[324].addShapeBox(0F, 0F, -3F, 103, 0, 3, 0F,0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[324].setRotationPoint(-55.5F, -14F, 9.66F);
		bodyModel[324].rotateAngleX = 0.38135444F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 103, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F); // Box 395
		bodyModel[325].setRotationPoint(-55.5F, -14F, -9.66F);
		bodyModel[325].rotateAngleX = -0.38135444F;

		bodyModel[326].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[326].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[327].setRotationPoint(43.5F, -8F, 7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[328].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[329].setRotationPoint(43.5F, -8F, -7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[330].setRotationPoint(42F, -1F, 5F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[331].setRotationPoint(42F, -1F, -9F);

		bodyModel[332].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[332].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[334].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[335].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[336].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[337].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[338].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[339].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[340].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[341].setRotationPoint(33.5F, -8F, 7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[342].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(33.5F, -8F, -7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[344].setRotationPoint(32F, -1F, 5F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[345].setRotationPoint(32F, -1F, -9F);

		bodyModel[346].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[346].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[347].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[348].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[349].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[350].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[351].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[352].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[353].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[354].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[355].setRotationPoint(23.5F, -8F, 7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[356].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[357].setRotationPoint(23.5F, -8F, -7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[358].setRotationPoint(22F, -1F, 5F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[359].setRotationPoint(22F, -1F, -9F);

		bodyModel[360].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[360].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(23.5F, -3F, 7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[362].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[363].setRotationPoint(23.5F, -3F, -7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[364].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[365].setRotationPoint(23.5F, -5F, 7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[366].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[367].setRotationPoint(23.5F, -5F, -7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[368].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(13.5F, -8F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[370].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[371].setRotationPoint(13.5F, -8F, -7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[372].setRotationPoint(12F, -1F, 5F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[373].setRotationPoint(12F, -1F, -9F);

		bodyModel[374].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[374].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[375].setRotationPoint(13.5F, -3F, 7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[376].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[377].setRotationPoint(13.5F, -3F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[378].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[379].setRotationPoint(13.5F, -5F, 7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[380].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[381].setRotationPoint(13.5F, -5F, -7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[382].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[383].setRotationPoint(3.5F, -8F, 7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[384].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[385].setRotationPoint(3.5F, -8F, -7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[386].setRotationPoint(2F, -1F, 5F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[387].setRotationPoint(2F, -1F, -9F);

		bodyModel[388].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[388].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[389].setRotationPoint(3.5F, -3F, 7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[390].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[391].setRotationPoint(3.5F, -3F, -7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[392].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[393].setRotationPoint(3.5F, -5F, 7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[394].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[395].setRotationPoint(3.5F, -5F, -7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[396].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(-6.5F, -8F, 7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[398].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[399].setRotationPoint(-6.5F, -8F, -7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[400].setRotationPoint(-8F, -1F, 5F);

		bodyModel[401].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[401].setRotationPoint(-8F, -1F, -9F);

		bodyModel[402].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[403].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[404].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[405].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[406].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[407].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[408].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[409].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[410].setRotationPoint(-30.5F, -3F, 7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[411].setRotationPoint(-30.5F, -8F, 7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[412].setRotationPoint(-30.5F, -3F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[413].setRotationPoint(-30.5F, -8F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[414].setRotationPoint(-32F, -1F, 5F);

		bodyModel[415].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[415].setRotationPoint(-32F, -1F, -9F);

		bodyModel[416].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[416].setRotationPoint(-30.5F, -3F, 7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[417].setRotationPoint(-30.5F, -3F, 7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[418].setRotationPoint(-30.5F, -3F, -7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[419].setRotationPoint(-30.5F, -3F, -7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[420].setRotationPoint(-30.5F, -5F, 7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[421].setRotationPoint(-30.5F, -5F, 7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[422].setRotationPoint(-30.5F, -5F, -7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[423].setRotationPoint(-30.5F, -5F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[424].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[425].setRotationPoint(-40.5F, -8F, 7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[426].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(-40.5F, -8F, -7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[428].setRotationPoint(-42F, -1F, 5F);

		bodyModel[429].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[429].setRotationPoint(-42F, -1F, -9F);

		bodyModel[430].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[430].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[431].setRotationPoint(-40.5F, -3F, 7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[432].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[433].setRotationPoint(-40.5F, -3F, -7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[434].setRotationPoint(-40.5F, -5F, 7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[435].setRotationPoint(-40.5F, -5F, 7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[436].setRotationPoint(-40.5F, -5F, -7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[437].setRotationPoint(-40.5F, -5F, -7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[438].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(-50.5F, -8F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[440].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-50.5F, -8F, -7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[442].setRotationPoint(-52F, -1F, 5F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[443].setRotationPoint(-52F, -1F, -9F);

		bodyModel[444].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[445].setRotationPoint(-50.5F, -3F, 7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(-50.5F, -3F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[448].setRotationPoint(-50.5F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[449].setRotationPoint(-50.5F, -5F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[450].setRotationPoint(-50.5F, -5F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[451].setRotationPoint(-50.5F, -5F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[452].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[453].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[454].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[455].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[456].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[456].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[456].rotateAngleY = 0.78539816F;

		bodyModel[457].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[457].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[457].rotateAngleY = -0.78539816F;

		bodyModel[458].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[458].setRotationPoint(-55.5F, -11F, -9.99F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[459].setRotationPoint(-55.5F, -11F, 9.99F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[460].setRotationPoint(-36.5F, -13F, -10F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[461].setRotationPoint(-36.5F, -13F, 3F);

		bodyModel[462].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[462].setRotationPoint(-36.5F, -15F, 3F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[463].setRotationPoint(-36.5F, -15F, 9F);

		bodyModel[464].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[464].setRotationPoint(-36.5F, -15F, -9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[465].setRotationPoint(-36.5F, -15F, -10F);

		bodyModel[466].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[466].setRotationPoint(-16.5F, -13F, -10F);

		bodyModel[467].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[467].setRotationPoint(-16.5F, -13F, 3F);

		bodyModel[468].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[468].setRotationPoint(-16.5F, -15F, 3F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[469].setRotationPoint(-16.5F, -15F, 9F);

		bodyModel[470].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[470].setRotationPoint(-16.5F, -15F, -9F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[471].setRotationPoint(-16.5F, -15F, -10F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[472].setRotationPoint(-26.5F, -13F, -10F);

		bodyModel[473].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[473].setRotationPoint(-26.5F, -13F, 3F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[474].setRotationPoint(-26.5F, -15F, 3F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(-26.5F, -15F, 9F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[476].setRotationPoint(-26.5F, -15F, -9F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[477].setRotationPoint(-26.5F, -15F, -10F);

		bodyModel[478].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[478].setRotationPoint(-6.5F, -13F, -10F);

		bodyModel[479].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[479].setRotationPoint(-6.5F, -13F, 3F);

		bodyModel[480].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[480].setRotationPoint(-6.5F, -15F, 3F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[481].setRotationPoint(-6.5F, -15F, 9F);

		bodyModel[482].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[482].setRotationPoint(-6.5F, -15F, -9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[483].setRotationPoint(-6.5F, -15F, -10F);

		bodyModel[484].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[484].setRotationPoint(13.5F, -13F, -10F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[485].setRotationPoint(13.5F, -13F, 3F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[486].setRotationPoint(13.5F, -15F, 3F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[487].setRotationPoint(13.5F, -15F, 9F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[488].setRotationPoint(13.5F, -15F, -9F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[489].setRotationPoint(13.5F, -15F, -10F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[490].setRotationPoint(-36.5F, -15F, -3F);

		bodyModel[491].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[491].setRotationPoint(-36.5F, -17F, -8.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[492].setRotationPoint(-36.5F, -17F, -9.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[493].setRotationPoint(-36.5F, -17F, 8.5F);

		bodyModel[494].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[494].setRotationPoint(-26.5F, -15F, -3F);

		bodyModel[495].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[495].setRotationPoint(-26.5F, -17F, -8.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[496].setRotationPoint(-26.5F, -17F, -9.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[497].setRotationPoint(-26.5F, -17F, 8.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[498].setRotationPoint(-16.5F, -15F, -3F);

		bodyModel[499].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[499].setRotationPoint(-16.5F, -17F, -8.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 332, 470, textureX, textureY); // Box 128
		bodyModel[501] = new ModelRendererTurbo(this, 331, 456, textureX, textureY); // Box 80
		bodyModel[502] = new ModelRendererTurbo(this, 114, 401, textureX, textureY); // Box 128
		bodyModel[503] = new ModelRendererTurbo(this, 102, 381, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 105, 387, textureX, textureY); // Box 80
		bodyModel[506] = new ModelRendererTurbo(this, 234, 401, textureX, textureY); // Box 128
		bodyModel[507] = new ModelRendererTurbo(this, 222, 381, textureX, textureY); // Box 128
		bodyModel[508] = new ModelRendererTurbo(this, 226, 401, textureX, textureY); // Box 128
		bodyModel[509] = new ModelRendererTurbo(this, 225, 387, textureX, textureY); // Box 80
		bodyModel[510] = new ModelRendererTurbo(this, 170, 416, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 171, 407, textureX, textureY); // Box 94
		bodyModel[512] = new ModelRendererTurbo(this, 172, 409, textureX, textureY); // Box 95
		bodyModel[513] = new ModelRendererTurbo(this, 171, 398, textureX, textureY); // Box 128
		bodyModel[514] = new ModelRendererTurbo(this, 172, 400, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 187, 420, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 186, 407, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 183, 412, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 203, 393, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 203, 382, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 187, 398, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 196, 398, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 202, 394, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[523] = new ModelRendererTurbo(this, 202, 394, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[524] = new ModelRendererTurbo(this, 139, 399, textureX, textureY); // Box 38
		bodyModel[525] = new ModelRendererTurbo(this, 140, 398, textureX, textureY); // Box 38
		bodyModel[526] = new ModelRendererTurbo(this, 139, 370, textureX, textureY); // Box 279
		bodyModel[527] = new ModelRendererTurbo(this, 140, 369, textureX, textureY); // Box 280
		bodyModel[528] = new ModelRendererTurbo(this, 166, 370, textureX, textureY); // Box 279
		bodyModel[529] = new ModelRendererTurbo(this, 167, 369, textureX, textureY); // Box 280
		bodyModel[530] = new ModelRendererTurbo(this, 156, 372, textureX, textureY); // Right seat part
		bodyModel[531] = new ModelRendererTurbo(this, 156, 401, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 142, 391, textureX, textureY); // Boc 42
		bodyModel[533] = new ModelRendererTurbo(this, 142, 420, textureX, textureY); // Box 638
		bodyModel[534] = new ModelRendererTurbo(this, 143, 380, textureX, textureY); // Right seat part
		bodyModel[535] = new ModelRendererTurbo(this, 153, 391, textureX, textureY); // Right seat part
		bodyModel[536] = new ModelRendererTurbo(this, 153, 420, textureX, textureY); // Left seat part
		bodyModel[537] = new ModelRendererTurbo(this, 143, 409, textureX, textureY); // Left seat part
		bodyModel[538] = new ModelRendererTurbo(this, 172, 384, textureX, textureY); // Right seat part
		bodyModel[539] = new ModelRendererTurbo(this, 183, 372, textureX, textureY); // Right seat part
		bodyModel[540] = new ModelRendererTurbo(this, 169, 391, textureX, textureY); // Boc 42
		bodyModel[541] = new ModelRendererTurbo(this, 170, 380, textureX, textureY); // Right seat part
		bodyModel[542] = new ModelRendererTurbo(this, 180, 391, textureX, textureY); // Right seat part
		bodyModel[543] = new ModelRendererTurbo(this, 70, 404, textureX, textureY); // Box 492
		bodyModel[544] = new ModelRendererTurbo(this, 74, 398, textureX, textureY); // Box 493
		bodyModel[545] = new ModelRendererTurbo(this, 56, 406, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[546] = new ModelRendererTurbo(this, 79, 406, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[547] = new ModelRendererTurbo(this, 70, 412, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[548] = new ModelRendererTurbo(this, 70, 375, textureX, textureY); // Box 572
		bodyModel[549] = new ModelRendererTurbo(this, 74, 369, textureX, textureY); // Box 573
		bodyModel[550] = new ModelRendererTurbo(this, 56, 377, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[551] = new ModelRendererTurbo(this, 79, 377, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[552] = new ModelRendererTurbo(this, 24, 404, textureX, textureY); // Box 492
		bodyModel[553] = new ModelRendererTurbo(this, 28, 398, textureX, textureY); // Box 493
		bodyModel[554] = new ModelRendererTurbo(this, 10, 406, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[555] = new ModelRendererTurbo(this, 33, 406, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[556] = new ModelRendererTurbo(this, 24, 412, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[557] = new ModelRendererTurbo(this, 24, 375, textureX, textureY); // Box 572
		bodyModel[558] = new ModelRendererTurbo(this, 28, 369, textureX, textureY); // Box 573
		bodyModel[559] = new ModelRendererTurbo(this, 33, 377, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[560] = new ModelRendererTurbo(this, 10, 377, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[561] = new ModelRendererTurbo(this, 24, 383, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[562] = new ModelRendererTurbo(this, 70, 383, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[563] = new ModelRendererTurbo(this, 52, 371, textureX, textureY); // Right seat part
		bodyModel[564] = new ModelRendererTurbo(this, 54, 375, textureX, textureY); // Right seat part
		bodyModel[565] = new ModelRendererTurbo(this, 52, 383, textureX, textureY); // Right seat part
		bodyModel[566] = new ModelRendererTurbo(this, 52, 400, textureX, textureY); // Right seat part
		bodyModel[567] = new ModelRendererTurbo(this, 54, 404, textureX, textureY); // Right seat part
		bodyModel[568] = new ModelRendererTurbo(this, 52, 412, textureX, textureY); // Right seat part
		bodyModel[569] = new ModelRendererTurbo(this, 52, 462, textureX, textureY); // Box 492
		bodyModel[570] = new ModelRendererTurbo(this, 56, 456, textureX, textureY); // Box 493
		bodyModel[571] = new ModelRendererTurbo(this, 38, 464, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[572] = new ModelRendererTurbo(this, 61, 464, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[573] = new ModelRendererTurbo(this, 52, 470, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[574] = new ModelRendererTurbo(this, 52, 433, textureX, textureY); // Box 572
		bodyModel[575] = new ModelRendererTurbo(this, 56, 427, textureX, textureY); // Box 573
		bodyModel[576] = new ModelRendererTurbo(this, 38, 435, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[577] = new ModelRendererTurbo(this, 61, 435, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[578] = new ModelRendererTurbo(this, 52, 441, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[579] = new ModelRendererTurbo(this, 7, 371, textureX, textureY); // Right seat part
		bodyModel[580] = new ModelRendererTurbo(this, 9, 375, textureX, textureY); // Right seat part
		bodyModel[581] = new ModelRendererTurbo(this, 7, 383, textureX, textureY); // Right seat part
		bodyModel[582] = new ModelRendererTurbo(this, 7, 400, textureX, textureY); // Right seat part
		bodyModel[583] = new ModelRendererTurbo(this, 9, 404, textureX, textureY); // Right seat part
		bodyModel[584] = new ModelRendererTurbo(this, 7, 412, textureX, textureY); // Right seat part
		bodyModel[585] = new ModelRendererTurbo(this, 88, 258, textureX, textureY); // Box 384
		bodyModel[586] = new ModelRendererTurbo(this, 190, 473, textureX, textureY); // Box 492
		bodyModel[587] = new ModelRendererTurbo(this, 194, 467, textureX, textureY); // Box 493
		bodyModel[588] = new ModelRendererTurbo(this, 176, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[589] = new ModelRendererTurbo(this, 199, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[590] = new ModelRendererTurbo(this, 190, 481, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[591] = new ModelRendererTurbo(this, 190, 444, textureX, textureY); // Box 572
		bodyModel[592] = new ModelRendererTurbo(this, 194, 438, textureX, textureY); // Box 573
		bodyModel[593] = new ModelRendererTurbo(this, 176, 446, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[594] = new ModelRendererTurbo(this, 199, 446, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[595] = new ModelRendererTurbo(this, 144, 473, textureX, textureY); // Box 492
		bodyModel[596] = new ModelRendererTurbo(this, 148, 467, textureX, textureY); // Box 493
		bodyModel[597] = new ModelRendererTurbo(this, 130, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[598] = new ModelRendererTurbo(this, 153, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[599] = new ModelRendererTurbo(this, 144, 481, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[600] = new ModelRendererTurbo(this, 144, 444, textureX, textureY); // Box 572
		bodyModel[601] = new ModelRendererTurbo(this, 148, 438, textureX, textureY); // Box 573
		bodyModel[602] = new ModelRendererTurbo(this, 130, 446, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[603] = new ModelRendererTurbo(this, 153, 446, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[604] = new ModelRendererTurbo(this, 144, 452, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[605] = new ModelRendererTurbo(this, 190, 452, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[606] = new ModelRendererTurbo(this, 172, 440, textureX, textureY); // Right seat part
		bodyModel[607] = new ModelRendererTurbo(this, 174, 444, textureX, textureY); // Right seat part
		bodyModel[608] = new ModelRendererTurbo(this, 172, 452, textureX, textureY); // Right seat part
		bodyModel[609] = new ModelRendererTurbo(this, 172, 469, textureX, textureY); // Right seat part
		bodyModel[610] = new ModelRendererTurbo(this, 174, 473, textureX, textureY); // Right seat part
		bodyModel[611] = new ModelRendererTurbo(this, 172, 481, textureX, textureY); // Right seat part
		bodyModel[612] = new ModelRendererTurbo(this, 98, 473, textureX, textureY); // Box 492
		bodyModel[613] = new ModelRendererTurbo(this, 102, 467, textureX, textureY); // Box 493
		bodyModel[614] = new ModelRendererTurbo(this, 84, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[615] = new ModelRendererTurbo(this, 107, 475, textureX, textureY,"cull"); // Box 495 cull
		bodyModel[616] = new ModelRendererTurbo(this, 98, 481, textureX, textureY,"cull"); // Box 493 cull
		bodyModel[617] = new ModelRendererTurbo(this, 98, 444, textureX, textureY); // Box 572
		bodyModel[618] = new ModelRendererTurbo(this, 102, 438, textureX, textureY); // Box 573
		bodyModel[619] = new ModelRendererTurbo(this, 84, 446, textureX, textureY,"cull"); // Box 574 cull
		bodyModel[620] = new ModelRendererTurbo(this, 107, 446, textureX, textureY,"cull"); // Box 575 cull
		bodyModel[621] = new ModelRendererTurbo(this, 98, 452, textureX, textureY,"cull"); // Box 576 cull
		bodyModel[622] = new ModelRendererTurbo(this, 126, 440, textureX, textureY); // Right seat part
		bodyModel[623] = new ModelRendererTurbo(this, 128, 444, textureX, textureY); // Right seat part
		bodyModel[624] = new ModelRendererTurbo(this, 126, 452, textureX, textureY); // Right seat part
		bodyModel[625] = new ModelRendererTurbo(this, 126, 469, textureX, textureY); // Right seat part
		bodyModel[626] = new ModelRendererTurbo(this, 128, 473, textureX, textureY); // Right seat part
		bodyModel[627] = new ModelRendererTurbo(this, 126, 481, textureX, textureY); // Right seat part
		bodyModel[628] = new ModelRendererTurbo(this, 280, 445, textureX, textureY); // Box 128
		bodyModel[629] = new ModelRendererTurbo(this, 284, 436, textureX, textureY); // Box 94
		bodyModel[630] = new ModelRendererTurbo(this, 293, 420, textureX, textureY); // Box 95
		bodyModel[631] = new ModelRendererTurbo(this, 284, 418, textureX, textureY); // Box 128
		bodyModel[632] = new ModelRendererTurbo(this, 293, 416, textureX, textureY); // Box 128
		bodyModel[633] = new ModelRendererTurbo(this, 259, 449, textureX, textureY); // Box 128
		bodyModel[634] = new ModelRendererTurbo(this, 258, 444, textureX, textureY); // Box 128
		bodyModel[635] = new ModelRendererTurbo(this, 255, 436, textureX, textureY); // Box 128
		bodyModel[636] = new ModelRendererTurbo(this, 260, 422, textureX, textureY); // Box 128
		bodyModel[637] = new ModelRendererTurbo(this, 260, 411, textureX, textureY); // Box 128
		bodyModel[638] = new ModelRendererTurbo(this, 286, 427, textureX, textureY); // Box 128
		bodyModel[639] = new ModelRendererTurbo(this, 279, 427, textureX, textureY); // Box 128
		bodyModel[640] = new ModelRendererTurbo(this, 275, 412, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[641] = new ModelRendererTurbo(this, 269, 412, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[642] = new ModelRendererTurbo(this, 267, 468, textureX, textureY); // Box 38
		bodyModel[643] = new ModelRendererTurbo(this, 268, 467, textureX, textureY); // Box 38
		bodyModel[644] = new ModelRendererTurbo(this, 298, 468, textureX, textureY); // Box 38
		bodyModel[645] = new ModelRendererTurbo(this, 299, 467, textureX, textureY); // Box 38
		bodyModel[646] = new ModelRendererTurbo(this, 298, 439, textureX, textureY); // Box 279
		bodyModel[647] = new ModelRendererTurbo(this, 299, 438, textureX, textureY); // Box 280
		bodyModel[648] = new ModelRendererTurbo(this, 273, 482, textureX, textureY); // Left seat part
		bodyModel[649] = new ModelRendererTurbo(this, 284, 470, textureX, textureY); // Left seat part
		bodyModel[650] = new ModelRendererTurbo(this, 270, 489, textureX, textureY); // Box 638
		bodyModel[651] = new ModelRendererTurbo(this, 281, 489, textureX, textureY); // Left seat part
		bodyModel[652] = new ModelRendererTurbo(this, 271, 478, textureX, textureY); // Left seat part
		bodyModel[653] = new ModelRendererTurbo(this, 304, 453, textureX, textureY); // Right seat part
		bodyModel[654] = new ModelRendererTurbo(this, 315, 441, textureX, textureY); // Right seat part
		bodyModel[655] = new ModelRendererTurbo(this, 304, 482, textureX, textureY); // Left seat part
		bodyModel[656] = new ModelRendererTurbo(this, 315, 470, textureX, textureY); // Left seat part
		bodyModel[657] = new ModelRendererTurbo(this, 301, 460, textureX, textureY); // Boc 42
		bodyModel[658] = new ModelRendererTurbo(this, 301, 488, textureX, textureY); // Box 638
		bodyModel[659] = new ModelRendererTurbo(this, 302, 449, textureX, textureY); // Right seat part
		bodyModel[660] = new ModelRendererTurbo(this, 312, 460, textureX, textureY); // Right seat part
		bodyModel[661] = new ModelRendererTurbo(this, 312, 489, textureX, textureY); // Left seat part
		bodyModel[662] = new ModelRendererTurbo(this, 302, 478, textureX, textureY); // Left seat part
		bodyModel[663] = new ModelRendererTurbo(this, 145, 384, textureX, textureY); // Right seat part
		bodyModel[664] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Left seat part

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[500].setRotationPoint(-16.5F, -17F, -9.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[501].setRotationPoint(-16.5F, -17F, 8.5F);

		bodyModel[502].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[502].setRotationPoint(-6.5F, -15F, -3F);

		bodyModel[503].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[503].setRotationPoint(-6.5F, -17F, -8.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[504].setRotationPoint(-6.5F, -17F, -9.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[505].setRotationPoint(-6.5F, -17F, 8.5F);

		bodyModel[506].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[506].setRotationPoint(13.5F, -15F, -3F);

		bodyModel[507].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[507].setRotationPoint(13.5F, -17F, -8.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[508].setRotationPoint(13.5F, -17F, -9.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[509].setRotationPoint(13.5F, -17F, 8.5F);

		bodyModel[510].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[510].setRotationPoint(3.5F, -13F, -10F);

		bodyModel[511].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[511].setRotationPoint(3.5F, -15F, -9F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[512].setRotationPoint(3.5F, -15F, -10F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[513].setRotationPoint(3.5F, -17F, -8.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[514].setRotationPoint(3.5F, -17F, -9.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[515].setRotationPoint(4.5F, -15F, -4F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[516].setRotationPoint(4.5F, -17F, -9.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[517].setRotationPoint(4.5F, -17F, -7.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[518].setRotationPoint(10.5F, -6F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[519].setRotationPoint(10.5F, -15F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[520].setRotationPoint(4.5F, -6F, -10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[521].setRotationPoint(8.5F, -6F, -5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[522].setRotationPoint(7F, -14.99F, -7.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[523].setRotationPoint(10.5F, -10.99F, -9F);

		bodyModel[524].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 38
		bodyModel[524].setRotationPoint(-5.5F, -5F, -10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[525].setRotationPoint(-4F, -4F, -4.5F);

		bodyModel[526].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 279
		bodyModel[526].setRotationPoint(-5.5F, -5F, 4F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[527].setRotationPoint(-4F, -4F, 4F);

		bodyModel[528].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 279
		bodyModel[528].setRotationPoint(4.5F, -5F, 4F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[529].setRotationPoint(6F, -4F, 4F);

		bodyModel[530].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[530].setRotationPoint(0.5F, -8F, 7F);
		bodyModel[530].rotateAngleY = -3.14159265F;

		bodyModel[531].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0.5F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Left seat part
		bodyModel[531].setRotationPoint(0.5F, -8F, -7F);
		bodyModel[531].rotateAngleY = -3.14159265F;

		bodyModel[532].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[532].setRotationPoint(-1F, -1F, 5F);

		bodyModel[533].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[533].setRotationPoint(-1F, -1F, -9F);

		bodyModel[534].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[534].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[534].rotateAngleY = -3.14159265F;

		bodyModel[535].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[535].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[535].rotateAngleY = -3.14159265F;

		bodyModel[536].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[536].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[536].rotateAngleY = -3.14159265F;

		bodyModel[537].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[537].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[537].rotateAngleY = -3.14159265F;

		bodyModel[538].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[538].setRotationPoint(10.5F, -3F, 7F);
		bodyModel[538].rotateAngleY = -3.14159265F;

		bodyModel[539].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[539].setRotationPoint(10.5F, -8F, 7F);
		bodyModel[539].rotateAngleY = -3.14159265F;

		bodyModel[540].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[540].setRotationPoint(9F, -1F, 5F);

		bodyModel[541].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[541].setRotationPoint(10.5F, -3F, 7F);
		bodyModel[541].rotateAngleY = -3.14159265F;

		bodyModel[542].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[542].setRotationPoint(10.5F, -3F, 7F);
		bodyModel[542].rotateAngleY = -3.14159265F;

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[543].setRotationPoint(-12.5F, -3F, -9F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[544].setRotationPoint(-12.5F, -7F, -9F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[545].setRotationPoint(-13F, -4.5F, -9.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[546].setRotationPoint(-9F, -4.5F, -9.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[547].setRotationPoint(-12.5F, -1F, -8.75F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[548].setRotationPoint(-12.5F, -3F, 4F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[549].setRotationPoint(-12.5F, -7F, 8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[550].setRotationPoint(-13F, -4.5F, -0.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[551].setRotationPoint(-9F, -4.5F, -0.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[552].setRotationPoint(-18F, -3F, -9F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[553].setRotationPoint(-18F, -7F, -9F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[554].setRotationPoint(-18.5F, -4.5F, -9.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[555].setRotationPoint(-14.5F, -4.5F, -9.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[556].setRotationPoint(-18F, -1F, -8.75F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[557].setRotationPoint(-18F, -3F, 4F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[558].setRotationPoint(-18F, -7F, 8F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[559].setRotationPoint(-18.5F, -4.5F, -0.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[560].setRotationPoint(-14.5F, -4.5F, -0.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[561].setRotationPoint(-18F, -1F, 7.75F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[562].setRotationPoint(-12.5F, -1F, 7.75F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[563].setRotationPoint(-14.25F, -5F, 2.5F);

		bodyModel[564].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[564].setRotationPoint(-13.25F, -5.5F, 3.5F);
		bodyModel[564].rotateAngleY = -0.78539816F;

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[565].setRotationPoint(-14.25F, 0.5F, 2.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[566].setRotationPoint(-14.25F, -5F, -4.5F);

		bodyModel[567].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[567].setRotationPoint(-13.25F, -5.5F, -3.5F);
		bodyModel[567].rotateAngleY = -0.78539816F;

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[568].setRotationPoint(-14.25F, 0.5F, -4.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[569].setRotationPoint(-23.5F, -3F, -9F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[570].setRotationPoint(-23.5F, -7F, -9F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[571].setRotationPoint(-24F, -4.5F, -9.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[572].setRotationPoint(-20F, -4.5F, -9.5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[573].setRotationPoint(-23.5F, -1F, -8.75F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[574].setRotationPoint(-23.5F, -3F, 4F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[575].setRotationPoint(-23.5F, -7F, 8F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[576].setRotationPoint(-24F, -4.5F, -0.5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[577].setRotationPoint(-20F, -4.5F, -0.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[578].setRotationPoint(-23.5F, -1F, 7.75F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[579].setRotationPoint(-19.75F, -5F, 2.5F);

		bodyModel[580].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[580].setRotationPoint(-18.75F, -5.5F, 3.5F);
		bodyModel[580].rotateAngleY = -0.78539816F;

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[581].setRotationPoint(-19.75F, 0.5F, 2.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[582].setRotationPoint(-19.75F, -5F, -4.5F);

		bodyModel[583].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[583].setRotationPoint(-18.75F, -5.5F, -3.5F);
		bodyModel[583].rotateAngleY = -0.78539816F;

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[584].setRotationPoint(-19.75F, 0.5F, -4.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 103, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 384
		bodyModel[585].setRotationPoint(-55.5F, -17F, -1F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[586].setRotationPoint(-42.5F, -3F, -9F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[587].setRotationPoint(-42.5F, -7F, -9F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[588].setRotationPoint(-43F, -4.5F, -9.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[589].setRotationPoint(-39F, -4.5F, -9.5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[590].setRotationPoint(-42.5F, -1F, -8.75F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[591].setRotationPoint(-42.5F, -3F, 4F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[592].setRotationPoint(-42.5F, -7F, 8F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[593].setRotationPoint(-43F, -4.5F, -0.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[594].setRotationPoint(-39F, -4.5F, -0.5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[595].setRotationPoint(-48F, -3F, -9F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[596].setRotationPoint(-48F, -7F, -9F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[597].setRotationPoint(-48.5F, -4.5F, -9.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[598].setRotationPoint(-44.5F, -4.5F, -9.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[599].setRotationPoint(-48F, -1F, -8.75F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[600].setRotationPoint(-48F, -3F, 4F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[601].setRotationPoint(-48F, -7F, 8F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[602].setRotationPoint(-48.5F, -4.5F, -0.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[603].setRotationPoint(-44.5F, -4.5F, -0.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[604].setRotationPoint(-48F, -1F, 7.75F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[605].setRotationPoint(-42.5F, -1F, 7.75F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[606].setRotationPoint(-44.25F, -5F, 2.5F);

		bodyModel[607].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[607].setRotationPoint(-43.25F, -5.5F, 3.5F);
		bodyModel[607].rotateAngleY = -0.78539816F;

		bodyModel[608].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[608].setRotationPoint(-44.25F, 0.5F, 2.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[609].setRotationPoint(-44.25F, -5F, -4.5F);

		bodyModel[610].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[610].setRotationPoint(-43.25F, -5.5F, -3.5F);
		bodyModel[610].rotateAngleY = -0.78539816F;

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[611].setRotationPoint(-44.25F, 0.5F, -4.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[612].setRotationPoint(-53.5F, -3F, -9F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[613].setRotationPoint(-53.5F, -7F, -9F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[614].setRotationPoint(-54F, -4.5F, -9.5F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F); // Box 495 cull
		bodyModel[615].setRotationPoint(-50F, -4.5F, -9.5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 493 cull
		bodyModel[616].setRotationPoint(-53.5F, -1F, -8.75F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[617].setRotationPoint(-53.5F, -3F, 4F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[618].setRotationPoint(-53.5F, -7F, 8F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -4.5F, -5.5F, -0.5F, -4.5F, -5.5F, -0.5F, -4.5F, -0.3F, 0F, -4.5F, -0.3F); // Box 574 cull
		bodyModel[619].setRotationPoint(-54F, -4.5F, -0.5F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,-0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -4.5F, -5.5F, 0F, -4.5F, -5.5F, 0F, -4.5F, -0.3F, -0.5F, -4.5F, -0.3F); // Box 575 cull
		bodyModel[620].setRotationPoint(-50F, -4.5F, -0.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 576 cull
		bodyModel[621].setRotationPoint(-53.5F, -1F, 7.75F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[622].setRotationPoint(-49.75F, -5F, 2.5F);

		bodyModel[623].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[623].setRotationPoint(-48.75F, -5.5F, 3.5F);
		bodyModel[623].rotateAngleY = -0.78539816F;

		bodyModel[624].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[624].setRotationPoint(-49.75F, 0.5F, 2.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[625].setRotationPoint(-49.75F, -5F, -4.5F);

		bodyModel[626].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[626].setRotationPoint(-48.75F, -5.5F, -3.5F);
		bodyModel[626].rotateAngleY = -0.78539816F;

		bodyModel[627].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[627].setRotationPoint(-49.75F, 0.5F, -4.5F);

		bodyModel[628].addBox(0F, 0F, 1F, 1, 14, 7, 0F); // Box 128
		bodyModel[628].setRotationPoint(-26.5F, -13F, 2F);

		bodyModel[629].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[629].setRotationPoint(-26.5F, -15F, 3F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[630].setRotationPoint(-26.5F, -15F, 9F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[631].setRotationPoint(-26.5F, -17F, 3F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[632].setRotationPoint(-26.5F, -17F, 8.5F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[633].setRotationPoint(-35.5F, -15F, 3F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[634].setRotationPoint(-35.5F, -17F, 7.5F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[635].setRotationPoint(-35.5F, -17F, 3F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[636].setRotationPoint(-35.5F, -6F, 4F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[637].setRotationPoint(-35.5F, -15F, 4F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[638].setRotationPoint(-29.5F, -6F, 9F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[639].setRotationPoint(-32.5F, -6F, 4F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[640].setRotationPoint(-30F, -14.99F, 6.5F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 glow
		bodyModel[641].setRotationPoint(-33.5F, -10.99F, 5F);

		bodyModel[642].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 38
		bodyModel[642].setRotationPoint(-35.5F, -5F, -10F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[643].setRotationPoint(-34F, -4F, -4.5F);

		bodyModel[644].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 38
		bodyModel[644].setRotationPoint(-25.5F, -5F, -10F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[645].setRotationPoint(-24F, -4F, -4.5F);

		bodyModel[646].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 279
		bodyModel[646].setRotationPoint(-25.5F, -5F, 4F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 280
		bodyModel[647].setRotationPoint(-24F, -4F, 4F);

		bodyModel[648].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[648].setRotationPoint(-29.5F, -3F, -7F);
		bodyModel[648].rotateAngleY = -3.14159265F;

		bodyModel[649].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0.5F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Left seat part
		bodyModel[649].setRotationPoint(-29.5F, -8F, -7F);
		bodyModel[649].rotateAngleY = -3.14159265F;

		bodyModel[650].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[650].setRotationPoint(-31F, -1F, -9F);

		bodyModel[651].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[651].setRotationPoint(-29.5F, -3F, -7F);
		bodyModel[651].rotateAngleY = -3.14159265F;

		bodyModel[652].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[652].setRotationPoint(-29.5F, -3F, -7F);
		bodyModel[652].rotateAngleY = -3.14159265F;

		bodyModel[653].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[653].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[653].rotateAngleY = -3.14159265F;

		bodyModel[654].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, -0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[654].setRotationPoint(-19.5F, -8F, 7F);
		bodyModel[654].rotateAngleY = -3.14159265F;

		bodyModel[655].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[655].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[655].rotateAngleY = -3.14159265F;

		bodyModel[656].addShapeBox(-2.5F, 0F, -3F, 1, 5, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.02F, 0.5F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F); // Left seat part
		bodyModel[656].setRotationPoint(-19.5F, -8F, -7F);
		bodyModel[656].rotateAngleY = -3.14159265F;

		bodyModel[657].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[657].setRotationPoint(-21F, -1F, 5F);

		bodyModel[658].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[658].setRotationPoint(-21F, -1F, -9F);

		bodyModel[659].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[659].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[659].rotateAngleY = -3.14159265F;

		bodyModel[660].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[660].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[660].rotateAngleY = -3.14159265F;

		bodyModel[661].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[661].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[661].rotateAngleY = -3.14159265F;

		bodyModel[662].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[662].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[662].rotateAngleY = -3.14159265F;

		bodyModel[663].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[663].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[663].rotateAngleY = -3.14159265F;

		bodyModel[664].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[664].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[664].rotateAngleY = -3.14159265F;
	}
	ModelPS_Truck_41E bogie1 = new ModelPS_Truck_41E();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 665; i++)
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