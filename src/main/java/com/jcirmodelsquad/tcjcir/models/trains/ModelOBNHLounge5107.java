//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


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

public class ModelOBNHLounge5107 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOBNHLounge5107() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[677];

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
		bodyModel[124] = new ModelRendererTurbo(this, 76, 183, textureX, textureY, "cull"); // Box 130 cull
		bodyModel[125] = new ModelRendererTurbo(this, 347, 48, textureX, textureY); // Box 135
		bodyModel[126] = new ModelRendererTurbo(this, 357, 41, textureX, textureY); // Box 136
		bodyModel[127] = new ModelRendererTurbo(this, 323, 58, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 334, 59, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 314, 58, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 368, 38, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 347, 23, textureX, textureY); // Box 147
		bodyModel[132] = new ModelRendererTurbo(this, 357, 33, textureX, textureY); // Box 148
		bodyModel[133] = new ModelRendererTurbo(this, 323, 18, textureX, textureY); // Box 149
		bodyModel[134] = new ModelRendererTurbo(this, 334, 19, textureX, textureY); // Box 150
		bodyModel[135] = new ModelRendererTurbo(this, 314, 18, textureX, textureY); // Box 151
		bodyModel[136] = new ModelRendererTurbo(this, 368, 30, textureX, textureY); // Box 152
		bodyModel[137] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 346, 33, textureX, textureY); // Box 154
		bodyModel[139] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 366, 47, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 315, 48, textureX, textureY); // Box 128
		bodyModel[143] = new ModelRendererTurbo(this, 366, 22, textureX, textureY); // Box 163
		bodyModel[144] = new ModelRendererTurbo(this, 315, 24, textureX, textureY); // Box 164
		bodyModel[145] = new ModelRendererTurbo(this, 332, 49, textureX, textureY); // Box 128
		bodyModel[146] = new ModelRendererTurbo(this, 332, 25, textureX, textureY); // Box 166
		bodyModel[147] = new ModelRendererTurbo(this, 342, 49, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 342, 25, textureX, textureY); // Box 168
		bodyModel[149] = new ModelRendererTurbo(this, 326, 41, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 315, 41, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 326, 34, textureX, textureY); // Box 171
		bodyModel[152] = new ModelRendererTurbo(this, 315, 34, textureX, textureY); // Box 172
		bodyModel[153] = new ModelRendererTurbo(this, 30, 40, textureX, textureY); // Box 128
		bodyModel[154] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 37, 41, textureX, textureY); // Box 128
		bodyModel[156] = new ModelRendererTurbo(this, 37, 34, textureX, textureY); // Box 158
		bodyModel[157] = new ModelRendererTurbo(this, 53, 58, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 42, 59, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 52, 18, textureX, textureY); // Box 149
		bodyModel[161] = new ModelRendererTurbo(this, 41, 19, textureX, textureY); // Box 150
		bodyModel[162] = new ModelRendererTurbo(this, 63, 18, textureX, textureY); // Box 151
		bodyModel[163] = new ModelRendererTurbo(this, 4, 38, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 152
		bodyModel[165] = new ModelRendererTurbo(this, 4, 47, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 4, 22, textureX, textureY); // Box 163
		bodyModel[167] = new ModelRendererTurbo(this, 19, 48, textureX, textureY); // Box 135
		bodyModel[168] = new ModelRendererTurbo(this, 15, 41, textureX, textureY); // Box 136
		bodyModel[169] = new ModelRendererTurbo(this, 19, 23, textureX, textureY); // Box 147
		bodyModel[170] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 148
		bodyModel[171] = new ModelRendererTurbo(this, 55, 48, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 55, 24, textureX, textureY); // Box 164
		bodyModel[173] = new ModelRendererTurbo(this, 40, 49, textureX, textureY); // Box 128
		bodyModel[174] = new ModelRendererTurbo(this, 40, 25, textureX, textureY); // Box 166
		bodyModel[175] = new ModelRendererTurbo(this, 38, 49, textureX, textureY); // Box 128
		bodyModel[176] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 168
		bodyModel[177] = new ModelRendererTurbo(this, 50, 41, textureX, textureY); // Box 128
		bodyModel[178] = new ModelRendererTurbo(this, 61, 41, textureX, textureY); // Box 128
		bodyModel[179] = new ModelRendererTurbo(this, 50, 34, textureX, textureY); // Box 171
		bodyModel[180] = new ModelRendererTurbo(this, 61, 34, textureX, textureY); // Box 172
		bodyModel[181] = new ModelRendererTurbo(this, 32, 152, textureX, textureY); // Box 128
		bodyModel[182] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 128
		bodyModel[183] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 128
		bodyModel[184] = new ModelRendererTurbo(this, 63, 152, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 35, 151, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 32, 156, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 47, 148, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 38, 148, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 39, 160, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 49, 151, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 40, 151, textureX, textureY); // Box 2
		bodyModel[194] = new ModelRendererTurbo(this, 18, 118, textureX, textureY); // Box 216
		bodyModel[195] = new ModelRendererTurbo(this, 44, 109, textureX, textureY); // Box 217
		bodyModel[196] = new ModelRendererTurbo(this, 44, 115, textureX, textureY); // Box 218
		bodyModel[197] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 219
		bodyModel[198] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 220
		bodyModel[199] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 221
		bodyModel[200] = new ModelRendererTurbo(this, 21, 117, textureX, textureY); // Box 222
		bodyModel[201] = new ModelRendererTurbo(this, 18, 122, textureX, textureY); // Box 223
		bodyModel[202] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Box 224
		bodyModel[203] = new ModelRendererTurbo(this, 24, 114, textureX, textureY); // Box 225
		bodyModel[204] = new ModelRendererTurbo(this, 24, 126, textureX, textureY); // Box 226
		bodyModel[205] = new ModelRendererTurbo(this, 35, 117, textureX, textureY); // Box 227
		bodyModel[206] = new ModelRendererTurbo(this, 26, 117, textureX, textureY); // Box 228
		bodyModel[207] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 128
		bodyModel[208] = new ModelRendererTurbo(this, 330, 145, textureX, textureY); // Box 128
		bodyModel[209] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 128
		bodyModel[210] = new ModelRendererTurbo(this, 335, 152, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 335, 156, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 307, 151, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 304, 156, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 2
		bodyModel[216] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 2
		bodyModel[217] = new ModelRendererTurbo(this, 319, 160, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 312, 151, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 336, 116, textureX, textureY); // Box 216
		bodyModel[221] = new ModelRendererTurbo(this, 354, 113, textureX, textureY); // Box 217
		bodyModel[222] = new ModelRendererTurbo(this, 354, 119, textureX, textureY); // Box 218
		bodyModel[223] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Box 219
		bodyModel[224] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Box 220
		bodyModel[225] = new ModelRendererTurbo(this, 337, 109, textureX, textureY); // Box 221
		bodyModel[226] = new ModelRendererTurbo(this, 339, 115, textureX, textureY); // Box 222
		bodyModel[227] = new ModelRendererTurbo(this, 336, 120, textureX, textureY); // Box 223
		bodyModel[228] = new ModelRendererTurbo(this, 343, 112, textureX, textureY); // Box 224
		bodyModel[229] = new ModelRendererTurbo(this, 343, 118, textureX, textureY); // Box 225
		bodyModel[230] = new ModelRendererTurbo(this, 343, 130, textureX, textureY); // Box 226
		bodyModel[231] = new ModelRendererTurbo(this, 345, 115, textureX, textureY); // Box 227
		bodyModel[232] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 228
		bodyModel[233] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 128
		bodyModel[234] = new ModelRendererTurbo(this, 297, 159, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 89, 159, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 84, 162, textureX, textureY); // Box 128
		bodyModel[237] = new ModelRendererTurbo(this, 84, 159, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 112, 159, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 117, 162, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 117, 159, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 264, 159, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 259, 162, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 259, 159, textureX, textureY); // Box 128
		bodyModel[244] = new ModelRendererTurbo(this, 287, 159, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 292, 162, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 292, 159, textureX, textureY); // Box 128
		bodyModel[247] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 258
		bodyModel[248] = new ModelRendererTurbo(this, 122, 144, textureX, textureY); // Box 259
		bodyModel[249] = new ModelRendererTurbo(this, 297, 148, textureX, textureY); // Box 260
		bodyModel[250] = new ModelRendererTurbo(this, 89, 148, textureX, textureY); // Box 261
		bodyModel[251] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 263
		bodyModel[252] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 264
		bodyModel[253] = new ModelRendererTurbo(this, 112, 148, textureX, textureY); // Box 265
		bodyModel[254] = new ModelRendererTurbo(this, 117, 151, textureX, textureY); // Box 266
		bodyModel[255] = new ModelRendererTurbo(this, 117, 148, textureX, textureY); // Box 267
		bodyModel[256] = new ModelRendererTurbo(this, 264, 148, textureX, textureY); // Box 269
		bodyModel[257] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 270
		bodyModel[258] = new ModelRendererTurbo(this, 259, 148, textureX, textureY); // Box 271
		bodyModel[259] = new ModelRendererTurbo(this, 287, 148, textureX, textureY); // Box 272
		bodyModel[260] = new ModelRendererTurbo(this, 292, 151, textureX, textureY); // Box 273
		bodyModel[261] = new ModelRendererTurbo(this, 292, 148, textureX, textureY); // Box 274
		bodyModel[262] = new ModelRendererTurbo(this, 294, 20, textureX, textureY); // Box 199
		bodyModel[263] = new ModelRendererTurbo(this, 296, 17, textureX, textureY); // Box 199
		bodyModel[264] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 199
		bodyModel[265] = new ModelRendererTurbo(this, 77, 17, textureX, textureY); // Box 199
		bodyModel[266] = new ModelRendererTurbo(this, 294, 1, textureX, textureY); // Box 280
		bodyModel[267] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 281
		bodyModel[268] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 282
		bodyModel[269] = new ModelRendererTurbo(this, 77, 7, textureX, textureY); // Box 283
		bodyModel[270] = new ModelRendererTurbo(this, 305, 23, textureX, textureY); // Box 285
		bodyModel[271] = new ModelRendererTurbo(this, 305, 4, textureX, textureY); // Box 286
		bodyModel[272] = new ModelRendererTurbo(this, 321, 143, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[273] = new ModelRendererTurbo(this, 2, 162, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[274] = new ModelRendererTurbo(this, 38, 154, textureX, textureY); // Box 2
		bodyModel[275] = new ModelRendererTurbo(this, 40, 157, textureX, textureY); // Box 2
		bodyModel[276] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 225
		bodyModel[277] = new ModelRendererTurbo(this, 26, 123, textureX, textureY); // Box 228
		bodyModel[278] = new ModelRendererTurbo(this, 319, 154, textureX, textureY); // Box 2
		bodyModel[279] = new ModelRendererTurbo(this, 321, 157, textureX, textureY); // Box 2
		bodyModel[280] = new ModelRendererTurbo(this, 343, 124, textureX, textureY); // Box 225
		bodyModel[281] = new ModelRendererTurbo(this, 345, 127, textureX, textureY); // Box 228
		bodyModel[282] = new ModelRendererTurbo(this, 140, 173, textureX, textureY); // Box 2
		bodyModel[283] = new ModelRendererTurbo(this, 183, 169, textureX, textureY); // Box 2
		bodyModel[284] = new ModelRendererTurbo(this, 168, 171, textureX, textureY); // Box 2
		bodyModel[285] = new ModelRendererTurbo(this, 127, 176, textureX, textureY); // Box 2
		bodyModel[286] = new ModelRendererTurbo(this, 124, 170, textureX, textureY); // Box 41
		bodyModel[287] = new ModelRendererTurbo(this, 109, 171, textureX, textureY, "cull"); // Box 41 cull
		bodyModel[288] = new ModelRendererTurbo(this, 171, 159, textureX, textureY); // Box 316
		bodyModel[289] = new ModelRendererTurbo(this, 223, 159, textureX, textureY, "cull"); // Box 317 cull
		bodyModel[290] = new ModelRendererTurbo(this, 162, 159, textureX, textureY); // Box 52
		bodyModel[291] = new ModelRendererTurbo(this, 143, 170, textureX, textureY); // Box 41
		bodyModel[292] = new ModelRendererTurbo(this, 143, 167, textureX, textureY, "cull"); // Box 41 cull
		bodyModel[293] = new ModelRendererTurbo(this, 143, 164, textureX, textureY); // Box 41
		bodyModel[294] = new ModelRendererTurbo(this, 143, 161, textureX, textureY, "cull"); // Box 41 cull
		bodyModel[295] = new ModelRendererTurbo(this, 125, 165, textureX, textureY); // Box 41
		bodyModel[296] = new ModelRendererTurbo(this, 110, 167, textureX, textureY, "cull"); // Box 41 cull
		bodyModel[297] = new ModelRendererTurbo(this, 171, 159, textureX, textureY); // Box 316
		bodyModel[298] = new ModelRendererTurbo(this, 332, 286, textureX, textureY); // Box 128
		bodyModel[299] = new ModelRendererTurbo(this, 339, 286, textureX, textureY); // Box 128
		bodyModel[300] = new ModelRendererTurbo(this, 361, 291, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 364, 296, textureX, textureY); // Box 38
		bodyModel[302] = new ModelRendererTurbo(this, 363, 300, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 365
		bodyModel[304] = new ModelRendererTurbo(this, 339, 321, textureX, textureY); // Box 366
		bodyModel[305] = new ModelRendererTurbo(this, 364, 331, textureX, textureY); // Box 368
		bodyModel[306] = new ModelRendererTurbo(this, 363, 335, textureX, textureY); // Box 369
		bodyModel[307] = new ModelRendererTurbo(this, 361, 326, textureX, textureY); // Box 370
		bodyModel[308] = new ModelRendererTurbo(this, 343, 288, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 82, 238, textureX, textureY); // Box 128
		bodyModel[310] = new ModelRendererTurbo(this, 82, 229, textureX, textureY); // Box 374
		bodyModel[311] = new ModelRendererTurbo(this, 346, 289, textureX, textureY); // Box 128
		bodyModel[312] = new ModelRendererTurbo(this, 341, 296, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 353, 296, textureX, textureY); // Box 41
		bodyModel[314] = new ModelRendererTurbo(this, 343, 323, textureX, textureY); // Box 379
		bodyModel[315] = new ModelRendererTurbo(this, 346, 324, textureX, textureY); // Box 380
		bodyModel[316] = new ModelRendererTurbo(this, 341, 331, textureX, textureY); // Box 381
		bodyModel[317] = new ModelRendererTurbo(this, 353, 331, textureX, textureY); // Box 382
		bodyModel[318] = new ModelRendererTurbo(this, 320, 319, textureX, textureY, "lamp"); // Box 86 glow
		bodyModel[319] = new ModelRendererTurbo(this, 320, 284, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[320] = new ModelRendererTurbo(this, 324, 273, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[321] = new ModelRendererTurbo(this, 98, 285, textureX, textureY, "cull"); // Box 393 cull
		bodyModel[322] = new ModelRendererTurbo(this, 111, 279, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[323] = new ModelRendererTurbo(this, 382, 78, textureX, textureY); // Rear gate closed
		bodyModel[324] = new ModelRendererTurbo(this, 379, 83, textureX, textureY); // Rear gate open
		bodyModel[325] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Front gate closed
		bodyModel[326] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Front gate open
		bodyModel[327] = new ModelRendererTurbo(this, 305, 20, textureX, textureY); // Box 285
		bodyModel[328] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 286
		bodyModel[329] = new ModelRendererTurbo(this, 101, 269, textureX, textureY); // Box 38
		bodyModel[330] = new ModelRendererTurbo(this, 96, 243, textureX, textureY); // Box 462
		bodyModel[331] = new ModelRendererTurbo(this, 33, 304, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 33, 333, textureX, textureY); // Box 537
		bodyModel[333] = new ModelRendererTurbo(this, 43, 282, textureX, textureY); // Box 543
		bodyModel[334] = new ModelRendererTurbo(this, 266, 326, textureX, textureY); // Box 492
		bodyModel[335] = new ModelRendererTurbo(this, 270, 320, textureX, textureY); // Box 493
		bodyModel[336] = new ModelRendererTurbo(this, 255, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[337] = new ModelRendererTurbo(this, 266, 333, textureX, textureY); // Box 498
		bodyModel[338] = new ModelRendererTurbo(this, 277, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[339] = new ModelRendererTurbo(this, 266, 297, textureX, textureY); // Box 526
		bodyModel[340] = new ModelRendererTurbo(this, 270, 291, textureX, textureY); // Box 527
		bodyModel[341] = new ModelRendererTurbo(this, 266, 304, textureX, textureY); // Box 533
		bodyModel[342] = new ModelRendererTurbo(this, 255, 301, textureX, textureY, "cull"); // Box 660 cull
		bodyModel[343] = new ModelRendererTurbo(this, 277, 301, textureX, textureY, "cull"); // Box 661 cull
		bodyModel[344] = new ModelRendererTurbo(this, 225, 326, textureX, textureY); // Box 492
		bodyModel[345] = new ModelRendererTurbo(this, 229, 320, textureX, textureY); // Box 493
		bodyModel[346] = new ModelRendererTurbo(this, 214, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[347] = new ModelRendererTurbo(this, 225, 333, textureX, textureY); // Box 498
		bodyModel[348] = new ModelRendererTurbo(this, 236, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[349] = new ModelRendererTurbo(this, 448, 359, textureX, textureY); // Box 526
		bodyModel[350] = new ModelRendererTurbo(this, 452, 353, textureX, textureY); // Box 527
		bodyModel[351] = new ModelRendererTurbo(this, 448, 366, textureX, textureY); // Box 533
		bodyModel[352] = new ModelRendererTurbo(this, 437, 363, textureX, textureY, "cull"); // Box 660 cull
		bodyModel[353] = new ModelRendererTurbo(this, 459, 363, textureX, textureY, "cull"); // Box 661 cull
		bodyModel[354] = new ModelRendererTurbo(this, 184, 326, textureX, textureY); // Box 492
		bodyModel[355] = new ModelRendererTurbo(this, 188, 320, textureX, textureY); // Box 493
		bodyModel[356] = new ModelRendererTurbo(this, 173, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[357] = new ModelRendererTurbo(this, 184, 333, textureX, textureY); // Box 498
		bodyModel[358] = new ModelRendererTurbo(this, 195, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[359] = new ModelRendererTurbo(this, 407, 359, textureX, textureY); // Box 526
		bodyModel[360] = new ModelRendererTurbo(this, 411, 353, textureX, textureY); // Box 527
		bodyModel[361] = new ModelRendererTurbo(this, 407, 366, textureX, textureY); // Box 533
		bodyModel[362] = new ModelRendererTurbo(this, 396, 363, textureX, textureY, "cull"); // Box 660 cull
		bodyModel[363] = new ModelRendererTurbo(this, 418, 363, textureX, textureY, "cull"); // Box 661 cull
		bodyModel[364] = new ModelRendererTurbo(this, 143, 326, textureX, textureY); // Box 492
		bodyModel[365] = new ModelRendererTurbo(this, 147, 320, textureX, textureY); // Box 493
		bodyModel[366] = new ModelRendererTurbo(this, 132, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[367] = new ModelRendererTurbo(this, 143, 333, textureX, textureY); // Box 498
		bodyModel[368] = new ModelRendererTurbo(this, 154, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[369] = new ModelRendererTurbo(this, 254, 293, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 256, 297, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 251, 322, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 253, 326, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 251, 334, textureX, textureY); // Right seat part
		bodyModel[375] = new ModelRendererTurbo(this, 433, 355, textureX, textureY); // Right seat part
		bodyModel[376] = new ModelRendererTurbo(this, 435, 359, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 433, 367, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 210, 322, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 212, 326, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 210, 334, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 349, 453, textureX, textureY); // Right seat part
		bodyModel[382] = new ModelRendererTurbo(this, 351, 457, textureX, textureY); // Right seat part
		bodyModel[383] = new ModelRendererTurbo(this, 349, 465, textureX, textureY); // Right seat part
		bodyModel[384] = new ModelRendererTurbo(this, 169, 322, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 171, 326, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 169, 334, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 219, 173, textureX, textureY); // Box 41
		bodyModel[388] = new ModelRendererTurbo(this, 220, 169, textureX, textureY); // Box 41
		bodyModel[389] = new ModelRendererTurbo(this, 98, 253, textureX, textureY); // Box 384
		bodyModel[390] = new ModelRendererTurbo(this, 56, 395, textureX, textureY); // Box 128
		bodyModel[391] = new ModelRendererTurbo(this, 14, 363, textureX, textureY); // Box 128
		bodyModel[392] = new ModelRendererTurbo(this, 19, 356, textureX, textureY); // Box 128
		bodyModel[393] = new ModelRendererTurbo(this, 14, 359, textureX, textureY); // Box 128
		bodyModel[394] = new ModelRendererTurbo(this, 56, 391, textureX, textureY); // Box 95
		bodyModel[395] = new ModelRendererTurbo(this, 1, 379, textureX, textureY); // Box 128
		bodyModel[396] = new ModelRendererTurbo(this, 25, 258, textureX, textureY); // Box 128
		bodyModel[397] = new ModelRendererTurbo(this, 41, 278, textureX, textureY); // Box 128
		bodyModel[398] = new ModelRendererTurbo(this, 41, 254, textureX, textureY); // Box 80
		bodyModel[399] = new ModelRendererTurbo(this, 428, 67, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[400] = new ModelRendererTurbo(this, 428, 70, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[401] = new ModelRendererTurbo(this, 19, 4, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[402] = new ModelRendererTurbo(this, 19, 7, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[403] = new ModelRendererTurbo(this, 428, 89, textureX, textureY, "cull"); // Box 685 cull
		bodyModel[404] = new ModelRendererTurbo(this, 428, 92, textureX, textureY, "cull"); // Box 686 cull
		bodyModel[405] = new ModelRendererTurbo(this, 30, 4, textureX, textureY, "cull"); // Box 687 cull
		bodyModel[406] = new ModelRendererTurbo(this, 30, 7, textureX, textureY, "cull"); // Box 688 cull
		bodyModel[407] = new ModelRendererTurbo(this, 207, 169, textureX, textureY); // Box 41
		bodyModel[408] = new ModelRendererTurbo(this, 208, 165, textureX, textureY); // Box 41
		bodyModel[409] = new ModelRendererTurbo(this, 102, 326, textureX, textureY); // Box 492
		bodyModel[410] = new ModelRendererTurbo(this, 106, 320, textureX, textureY); // Box 493
		bodyModel[411] = new ModelRendererTurbo(this, 91, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[412] = new ModelRendererTurbo(this, 102, 333, textureX, textureY); // Box 498
		bodyModel[413] = new ModelRendererTurbo(this, 113, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[414] = new ModelRendererTurbo(this, 61, 326, textureX, textureY); // Box 492
		bodyModel[415] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 493
		bodyModel[416] = new ModelRendererTurbo(this, 50, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[417] = new ModelRendererTurbo(this, 61, 333, textureX, textureY); // Box 498
		bodyModel[418] = new ModelRendererTurbo(this, 72, 330, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[419] = new ModelRendererTurbo(this, 449, 388, textureX, textureY); // Box 492
		bodyModel[420] = new ModelRendererTurbo(this, 453, 382, textureX, textureY); // Box 493
		bodyModel[421] = new ModelRendererTurbo(this, 438, 392, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[422] = new ModelRendererTurbo(this, 449, 395, textureX, textureY); // Box 498
		bodyModel[423] = new ModelRendererTurbo(this, 460, 392, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[424] = new ModelRendererTurbo(this, 128, 322, textureX, textureY); // Right seat part
		bodyModel[425] = new ModelRendererTurbo(this, 130, 326, textureX, textureY); // Right seat part
		bodyModel[426] = new ModelRendererTurbo(this, 128, 334, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 87, 322, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 89, 326, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 87, 334, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 99, 302, textureX, textureY); // Box 492
		bodyModel[431] = new ModelRendererTurbo(this, 103, 293, textureX, textureY); // Box 493
		bodyModel[432] = new ModelRendererTurbo(this, 119, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[433] = new ModelRendererTurbo(this, 118, 296, textureX, textureY); // Box 498
		bodyModel[434] = new ModelRendererTurbo(this, 99, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[435] = new ModelRendererTurbo(this, 139, 302, textureX, textureY); // Box 492
		bodyModel[436] = new ModelRendererTurbo(this, 143, 293, textureX, textureY); // Box 493
		bodyModel[437] = new ModelRendererTurbo(this, 159, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[438] = new ModelRendererTurbo(this, 158, 296, textureX, textureY); // Box 498
		bodyModel[439] = new ModelRendererTurbo(this, 139, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[440] = new ModelRendererTurbo(this, 178, 302, textureX, textureY); // Box 492
		bodyModel[441] = new ModelRendererTurbo(this, 182, 293, textureX, textureY); // Box 493
		bodyModel[442] = new ModelRendererTurbo(this, 197, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[443] = new ModelRendererTurbo(this, 197, 296, textureX, textureY); // Box 498
		bodyModel[444] = new ModelRendererTurbo(this, 178, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[445] = new ModelRendererTurbo(this, 216, 302, textureX, textureY); // Box 492
		bodyModel[446] = new ModelRendererTurbo(this, 220, 293, textureX, textureY); // Box 493
		bodyModel[447] = new ModelRendererTurbo(this, 236, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[448] = new ModelRendererTurbo(this, 235, 296, textureX, textureY); // Box 498
		bodyModel[449] = new ModelRendererTurbo(this, 217, 308, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[450] = new ModelRendererTurbo(this, 3, 361, textureX, textureY); // Box 128
		bodyModel[451] = new ModelRendererTurbo(this, 61, 381, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 26, 382, textureX, textureY); // Box 128
		bodyModel[453] = new ModelRendererTurbo(this, 31, 380, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 35, 377, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 128
		bodyModel[456] = new ModelRendererTurbo(this, 22, 397, textureX, textureY); // Box 128
		bodyModel[457] = new ModelRendererTurbo(this, 25, 388, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 39, 397, textureX, textureY); // Box 128
		bodyModel[459] = new ModelRendererTurbo(this, 35, 392, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[460] = new ModelRendererTurbo(this, 14, 387, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[461] = new ModelRendererTurbo(this, 51, 380, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 53, 377, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 299, 463, textureX, textureY); // Box 128 drop seat
		bodyModel[464] = new ModelRendererTurbo(this, 310, 463, textureX, textureY); // Box 128 drop seat
		bodyModel[465] = new ModelRendererTurbo(this, 321, 463, textureX, textureY); // Box 128 drop seat
		bodyModel[466] = new ModelRendererTurbo(this, 301, 458, textureX, textureY, "cull"); // Box 128 cull
		bodyModel[467] = new ModelRendererTurbo(this, 312, 454, textureX, textureY); // Box 462 curtain piece
		bodyModel[468] = new ModelRendererTurbo(this, 358, 445, textureX, textureY); // Box 526
		bodyModel[469] = new ModelRendererTurbo(this, 354, 469, textureX, textureY); // Box 526
		bodyModel[470] = new ModelRendererTurbo(this, 361, 434, textureX, textureY); // Box 527
		bodyModel[471] = new ModelRendererTurbo(this, 332, 445, textureX, textureY); // Box 526
		bodyModel[472] = new ModelRendererTurbo(this, 321, 469, textureX, textureY); // Box 526
		bodyModel[473] = new ModelRendererTurbo(this, 335, 434, textureX, textureY); // Box 527
		bodyModel[474] = new ModelRendererTurbo(this, 331, 439, textureX, textureY, "cull"); // Box 527 cull
		bodyModel[475] = new ModelRendererTurbo(this, 357, 439, textureX, textureY, "cull"); // Box 527 cull
		bodyModel[476] = new ModelRendererTurbo(this, 331, 442, textureX, textureY); // Box 527
		bodyModel[477] = new ModelRendererTurbo(this, 357, 442, textureX, textureY); // Box 527
		bodyModel[478] = new ModelRendererTurbo(this, 360, 361, textureX, textureY); // Box 526
		bodyModel[479] = new ModelRendererTurbo(this, 373, 378, textureX, textureY); // Box 526
		bodyModel[480] = new ModelRendererTurbo(this, 327, 353, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[481] = new ModelRendererTurbo(this, 372, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[482] = new ModelRendererTurbo(this, 357, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[483] = new ModelRendererTurbo(this, 366, 367, textureX, textureY); // Box 526
		bodyModel[484] = new ModelRendererTurbo(this, 374, 374, textureX, textureY); // Box 526
		bodyModel[485] = new ModelRendererTurbo(this, 368, 372, textureX, textureY); // Box 526
		bodyModel[486] = new ModelRendererTurbo(this, 357, 367, textureX, textureY); // Box 526
		bodyModel[487] = new ModelRendererTurbo(this, 359, 372, textureX, textureY); // Box 526
		bodyModel[488] = new ModelRendererTurbo(this, 343, 378, textureX, textureY); // Box 526
		bodyModel[489] = new ModelRendererTurbo(this, 342, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[490] = new ModelRendererTurbo(this, 327, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[491] = new ModelRendererTurbo(this, 344, 375, textureX, textureY); // Box 526
		bodyModel[492] = new ModelRendererTurbo(this, 338, 372, textureX, textureY); // Box 526
		bodyModel[493] = new ModelRendererTurbo(this, 329, 372, textureX, textureY); // Box 526
		bodyModel[494] = new ModelRendererTurbo(this, 373, 400, textureX, textureY); // Box 526
		bodyModel[495] = new ModelRendererTurbo(this, 372, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[496] = new ModelRendererTurbo(this, 357, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[497] = new ModelRendererTurbo(this, 374, 397, textureX, textureY); // Box 526
		bodyModel[498] = new ModelRendererTurbo(this, 368, 394, textureX, textureY); // Box 526
		bodyModel[499] = new ModelRendererTurbo(this, 359, 394, textureX, textureY); // Box 526

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

		bodyModel[124].addShapeBox(0F, 0F, 0F, 115, 1, 21, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130 cull
		bodyModel[124].setRotationPoint(-57.25F, 1F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[125].setRotationPoint(58.5F, -17F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[126].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F); // Box 128
		bodyModel[127].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F); // Box 128
		bodyModel[128].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[129].setRotationPoint(58.5F, -17F, -10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 128
		bodyModel[130].setRotationPoint(59.5F, -18.6F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[131].setRotationPoint(58.5F, -17F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[132].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F); // Box 149
		bodyModel[133].setRotationPoint(59F, -17F, 7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F); // Box 150
		bodyModel[134].setRotationPoint(59F, -17F, 8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[135].setRotationPoint(58.5F, -17F, 7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, -1F, -1.6F, 0F, -1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F); // Box 152
		bodyModel[136].setRotationPoint(59.5F, -18.6F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[137].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[138].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[139].setRotationPoint(58.5F, -17F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F); // Box 128
		bodyModel[140].setRotationPoint(59.04F, -17.8F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F); // Box 158
		bodyModel[141].setRotationPoint(58.5F, -17F, 3.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[142].setRotationPoint(57.5F, -20F, -8.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 163
		bodyModel[143].setRotationPoint(59.04F, -17.8F, 3.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[144].setRotationPoint(57.5F, -20F, 2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F); // Box 128
		bodyModel[145].setRotationPoint(57.8F, -19.65F, -8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F); // Box 166
		bodyModel[146].setRotationPoint(57.8F, -19.65F, 3.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F); // Box 128
		bodyModel[147].setRotationPoint(57.8F, -19.65F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F); // Box 168
		bodyModel[148].setRotationPoint(57.8F, -19.65F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[149].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[151].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[152].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[153].setRotationPoint(-59.5F, -17F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[154].setRotationPoint(-59.5F, -17F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[155].setRotationPoint(-59.5F, -17F, -8.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F); // Box 158
		bodyModel[156].setRotationPoint(-59.5F, -17F, 3.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F); // Box 128
		bodyModel[157].setRotationPoint(-61F, -17F, -10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F); // Box 128
		bodyModel[158].setRotationPoint(-62F, -17F, -10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[159].setRotationPoint(-59.04F, -17F, -10.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F); // Box 149
		bodyModel[160].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F); // Box 150
		bodyModel[161].setRotationPoint(-62F, -17F, 8.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[162].setRotationPoint(-59.04F, -17F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, 1F, 0F, -1F, -1.6F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 128
		bodyModel[163].setRotationPoint(-62.5F, -18.6F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F); // Box 152
		bodyModel[164].setRotationPoint(-62.5F, -18.6F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F); // Box 128
		bodyModel[165].setRotationPoint(-62.04F, -17.8F, -8.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F); // Box 163
		bodyModel[166].setRotationPoint(-62.04F, -17.8F, 3.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[167].setRotationPoint(-61.5F, -17F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[168].setRotationPoint(-61.5F, -17F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F); // Box 147
		bodyModel[169].setRotationPoint(-61.5F, -17F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[170].setRotationPoint(-61.5F, -17F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 128
		bodyModel[171].setRotationPoint(-59.5F, -20F, -8.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F); // Box 164
		bodyModel[172].setRotationPoint(-59.5F, -20F, 2.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F); // Box 128
		bodyModel[173].setRotationPoint(-59.8F, -19.65F, -8.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F); // Box 166
		bodyModel[174].setRotationPoint(-59.8F, -19.65F, 3.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 128
		bodyModel[175].setRotationPoint(-59.8F, -19.65F, -4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 168
		bodyModel[176].setRotationPoint(-59.8F, -19.65F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.975F, 0F, 0F, 0F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[177].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[178].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[179].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 172
		bodyModel[180].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[181].setRotationPoint(-60.5F, 3F, 9.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[182].setRotationPoint(-56.5F, 3F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[183].setRotationPoint(-56.5F, 3F, 8.25F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[184].setRotationPoint(-56.5F, 3F, 9.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[185].setRotationPoint(-56.5F, 6F, 9.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[186].setRotationPoint(-60.5F, 3F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[187].setRotationPoint(-60.5F, 3F, 8.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[188].setRotationPoint(-60.5F, 6F, 9.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[189].setRotationPoint(-60.5F, 2.5F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[190].setRotationPoint(-60.5F, 4F, 6.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[191].setRotationPoint(-60.5F, 7F, 8.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[192].setRotationPoint(-60.5F, 2.5F, 6.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[193].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[194].setRotationPoint(-60.5F, 3F, -10.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[195].setRotationPoint(-56.5F, 3F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[196].setRotationPoint(-56.5F, 3F, -10.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[197].setRotationPoint(-56.5F, 3F, -10.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[198].setRotationPoint(-56.5F, 6F, -10.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[199].setRotationPoint(-60.5F, 3F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[200].setRotationPoint(-60.5F, 3F, -10.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[201].setRotationPoint(-60.5F, 6F, -10.75F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[202].setRotationPoint(-60.5F, 2.5F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[203].setRotationPoint(-60.5F, 4F, -8.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[204].setRotationPoint(-60.5F, 7F, -10.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[205].setRotationPoint(-60.5F, 2.5F, -6.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[206].setRotationPoint(-60.5F, 4F, -7.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[207].setRotationPoint(56.5F, 3F, 9.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[208].setRotationPoint(60.5F, 3F, 5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[209].setRotationPoint(60.5F, 3F, 8.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[210].setRotationPoint(60.5F, 3F, 9.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[211].setRotationPoint(60.5F, 6F, 9.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[212].setRotationPoint(56.5F, 3F, 5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[213].setRotationPoint(56.5F, 3F, 8.25F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[214].setRotationPoint(56.5F, 6F, 9.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[215].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[216].setRotationPoint(56.5F, 4F, 6.25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[217].setRotationPoint(56.5F, 7F, 8.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[218].setRotationPoint(56.5F, 2.5F, 6.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[219].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[220].setRotationPoint(56.5F, 3F, -10.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[221].setRotationPoint(60.5F, 3F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[222].setRotationPoint(60.5F, 3F, -10.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[223].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[224].setRotationPoint(60.5F, 6F, -10.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[225].setRotationPoint(56.5F, 3F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[226].setRotationPoint(56.5F, 3F, -10.25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[227].setRotationPoint(56.5F, 6F, -10.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[228].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[229].setRotationPoint(56.5F, 4F, -8.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[230].setRotationPoint(56.5F, 7F, -10.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[231].setRotationPoint(56.5F, 2.5F, -6.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[232].setRotationPoint(56.5F, 4F, -7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[233].setRotationPoint(-33.5F, 3F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[234].setRotationPoint(54.5F, 3F, 9.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[235].setRotationPoint(-54F, 3F, 9.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[236].setRotationPoint(-54.5F, 3.5F, 9.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[237].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[238].setRotationPoint(-35F, 3F, 9.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[239].setRotationPoint(-34.5F, 3.5F, 9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[240].setRotationPoint(-34F, 3F, 9.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[241].setRotationPoint(34F, 3F, 9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[242].setRotationPoint(33.5F, 3.5F, 9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[243].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[244].setRotationPoint(53F, 3F, 9.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[245].setRotationPoint(53.5F, 3.5F, 9.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[246].setRotationPoint(54F, 3F, 9.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 258
		bodyModel[247].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[248].setRotationPoint(-33.5F, 3F, -10.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[249].setRotationPoint(54.5F, 3F, -10.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 261
		bodyModel[250].setRotationPoint(-54F, 3F, -10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[251].setRotationPoint(-54.5F, 3.5F, -10.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 264
		bodyModel[252].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 265
		bodyModel[253].setRotationPoint(-35F, 3F, -10.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 266
		bodyModel[254].setRotationPoint(-34.5F, 3.5F, -10.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 267
		bodyModel[255].setRotationPoint(-34F, 3F, -10.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 269
		bodyModel[256].setRotationPoint(34F, 3F, -10.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[257].setRotationPoint(33.5F, 3.5F, -10.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 271
		bodyModel[258].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 272
		bodyModel[259].setRotationPoint(53F, 3F, -10.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 273
		bodyModel[260].setRotationPoint(53.5F, 3.5F, -10.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 274
		bodyModel[261].setRotationPoint(54F, 3F, -10.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[262].setRotationPoint(45.5F, -20.25F, 6.25F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[263].setRotationPoint(45.5F, -20.25F, 5.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[264].setRotationPoint(-53.5F, -20.25F, 6.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[265].setRotationPoint(-53.5F, -20.25F, 5.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[266].setRotationPoint(45.5F, -20.25F, -9.25F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[267].setRotationPoint(45.5F, -20.25F, -6.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[268].setRotationPoint(-53.5F, -20.25F, -9.25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[269].setRotationPoint(-53.5F, -20.25F, -6.75F);

		bodyModel[270].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.03F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F); // Box 285
		bodyModel[270].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[270].rotateAngleY = 0.78539816F;

		bodyModel[271].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.55F, 0F, 0F, 0.3F, 0F, 0F, 0.03F, 0F); // Box 286
		bodyModel[271].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[271].rotateAngleY = -0.78539816F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[272].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[273].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[274].setRotationPoint(-60.5F, 5.5F, 7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[275].setRotationPoint(-60.5F, 5.5F, 8.75F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[276].setRotationPoint(-60.5F, 5.5F, -9.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[277].setRotationPoint(-60.5F, 5.5F, -8.75F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[278].setRotationPoint(56.5F, 5.5F, 7.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[279].setRotationPoint(56.5F, 5.5F, 8.75F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[280].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[281].setRotationPoint(56.5F, 5.5F, -8.75F);

		bodyModel[282].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 2
		bodyModel[282].setRotationPoint(13.5F, 3F, 4.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 2
		bodyModel[283].setRotationPoint(-0.5F, 3F, 4.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[284].setRotationPoint(8.5F, 3F, 7.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[285].setRotationPoint(29.5F, 3F, 7.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[286].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[286].rotateAngleX = -0.78539816F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Box 41 cull
		bodyModel[287].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[288].setRotationPoint(-0.5F, 3F, -9.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 4, 19, 0F); // Box 317 cull
		bodyModel[289].setRotationPoint(-5.5F, 3F, -9.49F);

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[290].setRotationPoint(11.5F, 3F, -9.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 41
		bodyModel[291].setRotationPoint(16.5F, 3.34F, -7F);
		bodyModel[291].rotateAngleX = -0.78539816F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.02F, 0.4F, 0F, 0.02F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41 cull
		bodyModel[292].setRotationPoint(16.49F, 3F, -7.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[293].setRotationPoint(16.5F, 3.34F, -9F);
		bodyModel[293].rotateAngleX = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.02F, 0.25F, 0F, 0.02F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 41 cull
		bodyModel[294].setRotationPoint(16.49F, 3F, -9.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[295].setRotationPoint(23.5F, 2.75F, -8.6F);
		bodyModel[295].rotateAngleX = -0.78539816F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41 cull
		bodyModel[296].setRotationPoint(23.49F, 3F, -9.1F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 316
		bodyModel[297].setRotationPoint(8.5F, 3F, -9.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[298].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[299].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[300].setRotationPoint(54.05F, -2F, 9.95F);
		bodyModel[300].rotateAngleY = -2.35619449F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[301].setRotationPoint(54.4F, -1F, 9.6F);
		bodyModel[301].rotateAngleY = -2.35619449F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[302].setRotationPoint(54.05F, 0.5F, 9.95F);
		bodyModel[302].rotateAngleY = -2.35619449F;

		bodyModel[303].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 365
		bodyModel[303].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 366
		bodyModel[304].setRotationPoint(53.5F, -15F, -5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[305].setRotationPoint(53.15F, -1F, -8.35F);
		bodyModel[305].rotateAngleY = -0.78539816F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[306].setRotationPoint(52.45F, 0.5F, -8.35F);
		bodyModel[306].rotateAngleY = -0.78539816F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[307].setRotationPoint(51.55F, -2F, -8.9F);
		bodyModel[307].rotateAngleY = -0.78539816F;

		bodyModel[308].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 128
		bodyModel[308].setRotationPoint(48.5F, -8.5F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[309].setRotationPoint(-55.5F, -15F, 9.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[310].setRotationPoint(-55.5F, -15F, -10.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[311].setRotationPoint(48.5F, -6F, 5F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 128
		bodyModel[312].setRotationPoint(48.5F, -2.4F, 5F);
		bodyModel[312].rotateAngleZ = 1.04719755F;

		bodyModel[313].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[313].setRotationPoint(49.75F, -5F, 7.5F);
		bodyModel[313].rotateAngleY = -0.78539816F;

		bodyModel[314].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 379
		bodyModel[314].setRotationPoint(48.5F, -8.5F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[315].setRotationPoint(48.5F, -6F, -10F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 381
		bodyModel[316].setRotationPoint(48.5F, -2.4F, -10F);
		bodyModel[316].rotateAngleZ = 1.04719755F;

		bodyModel[317].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[317].setRotationPoint(49.75F, -5F, -7.5F);
		bodyModel[317].rotateAngleY = -0.78539816F;

		bodyModel[318].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 86 glow
		bodyModel[318].setRotationPoint(51.5F, -14.99F, -7.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[319].setRotationPoint(51.5F, -14.99F, 6.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[320].setRotationPoint(52F, -13.99F, -0.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 92, 1, 4, 0F,0F, 0F, -0.335F, -0.01F, 0F, -0.335F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.17F, -0.01F, 0F, -0.17F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull
		bodyModel[321].setRotationPoint(-44.5F, -14F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, -3F, 79, 1, 4, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.17F, 0F, 0F, -0.17F); // Box 386 cull
		bodyModel[322].setRotationPoint(-31.5F, -14F, 9F);
		bodyModel[322].rotateAngleX = 0.00872665F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[323].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[324].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[325].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[326].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[327].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[327].setRotationPoint(55F, -19.65F, 7.5F);
		bodyModel[327].rotateAngleY = 0.78539816F;

		bodyModel[328].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[328].setRotationPoint(55F, -19.65F, -7.5F);
		bodyModel[328].rotateAngleY = -0.78539816F;

		bodyModel[329].addShapeBox(0F, 0F, 0F, 93, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[329].setRotationPoint(-45.5F, -11F, -9.9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 98, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[330].setRotationPoint(-50.5F, -11F, 9.9F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 128
		bodyModel[331].setRotationPoint(8.5F, -7F, 3F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 537
		bodyModel[332].setRotationPoint(8.5F, -7F, -10F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 543
		bodyModel[333].setRotationPoint(9F, -15F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[334].setRotationPoint(41.5F, -3F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[335].setRotationPoint(41.5F, -7F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[336].setRotationPoint(41F, -4.5F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[337].setRotationPoint(41.5F, -2F, -9.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[338].setRotationPoint(45.5F, -4.5F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[339].setRotationPoint(41.5F, -3F, 4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[340].setRotationPoint(41.5F, -7F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 533
		bodyModel[341].setRotationPoint(41.5F, -2F, 8.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 660 cull
		bodyModel[342].setRotationPoint(41F, -4.5F, 1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -4F, -0.5F, -4.5F, -4F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 661 cull
		bodyModel[343].setRotationPoint(45.5F, -4.5F, 1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[344].setRotationPoint(35.5F, -3F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[345].setRotationPoint(35.5F, -7F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[346].setRotationPoint(35F, -4.5F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[347].setRotationPoint(35.5F, -2F, -9.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[348].setRotationPoint(39.5F, -4.5F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[349].setRotationPoint(2.5F, -3F, 4F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[350].setRotationPoint(2.5F, -7F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 533
		bodyModel[351].setRotationPoint(2.5F, -2F, 8.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 660 cull
		bodyModel[352].setRotationPoint(2F, -4.5F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 661 cull
		bodyModel[353].setRotationPoint(6.5F, -4.5F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[354].setRotationPoint(29.5F, -3F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[355].setRotationPoint(29.5F, -7F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[356].setRotationPoint(29F, -4.5F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[357].setRotationPoint(29.5F, -2F, -9.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[358].setRotationPoint(33.5F, -4.5F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[359].setRotationPoint(-3.5F, -3F, 4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[360].setRotationPoint(-3.5F, -7F, 8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 533
		bodyModel[361].setRotationPoint(-3.5F, -2F, 8.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 660 cull
		bodyModel[362].setRotationPoint(-4F, -4.5F, 5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 661 cull
		bodyModel[363].setRotationPoint(0.5F, -4.5F, 5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[364].setRotationPoint(23.5F, -3F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[365].setRotationPoint(23.5F, -7F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[366].setRotationPoint(23F, -4.5F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[367].setRotationPoint(23.5F, -2F, -9.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[368].setRotationPoint(27.5F, -4.5F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[369].setRotationPoint(39.5F, -5F, 2.5F);

		bodyModel[370].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[370].setRotationPoint(40.5F, -5.5F, 3.5F);
		bodyModel[370].rotateAngleY = -0.78539816F;

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[371].setRotationPoint(39.5F, 0.5F, 2.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[372].setRotationPoint(39.5F, -5F, -4.5F);

		bodyModel[373].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[373].setRotationPoint(40.5F, -5.5F, -3.5F);
		bodyModel[373].rotateAngleY = -0.78539816F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[374].setRotationPoint(39.5F, 0.5F, -4.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[375].setRotationPoint(0.5F, -5F, 2.5F);

		bodyModel[376].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[376].setRotationPoint(1.5F, -5.5F, 3.5F);
		bodyModel[376].rotateAngleY = -0.78539816F;

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[377].setRotationPoint(0.5F, 0.5F, 2.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[378].setRotationPoint(33.5F, -5F, -4.5F);

		bodyModel[379].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[379].setRotationPoint(34.5F, -5.5F, -3.5F);
		bodyModel[379].rotateAngleY = -0.78539816F;

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[380].setRotationPoint(33.5F, 0.5F, -4.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[381].setRotationPoint(-11F, -5F, 3.5F);

		bodyModel[382].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[382].setRotationPoint(-10F, -5.5F, 4.5F);
		bodyModel[382].rotateAngleY = -0.78539816F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[383].setRotationPoint(-11F, 0.5F, 3.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[384].setRotationPoint(27.5F, -5F, -4.5F);

		bodyModel[385].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[385].setRotationPoint(28.5F, -5.5F, -3.5F);
		bodyModel[385].rotateAngleY = -0.78539816F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[386].setRotationPoint(27.5F, 0.5F, -4.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[387].setRotationPoint(-24.5F, 2.75F, 7.4F);
		bodyModel[387].rotateAngleX = -0.78539816F;

		bodyModel[388].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[388].setRotationPoint(-24.51F, 3F, 6.9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 93, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 384
		bodyModel[389].setRotationPoint(-45.5F, -17F, -1F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 128
		bodyModel[390].setRotationPoint(-46.5F, -13F, -10F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 128
		bodyModel[391].setRotationPoint(-51.5F, -13F, 9F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[392].setRotationPoint(-51.5F, -15F, 3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[393].setRotationPoint(-51.5F, -15F, 9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[394].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[395].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 128
		bodyModel[395].setRotationPoint(-55.5F, -15F, -3F);

		bodyModel[396].addBox(0F, 0F, 0F, 10, 2, 17, 0F); // Box 128
		bodyModel[396].setRotationPoint(-55.5F, -17F, -8.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[397].setRotationPoint(-55.5F, -17F, -9.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[398].setRotationPoint(-55.5F, -17F, 8.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[399].setRotationPoint(56.5F, -14F, 10F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[400].setRotationPoint(56.5F, -13F, 9.99F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[401].setRotationPoint(-60.5F, -14F, 10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[402].setRotationPoint(-60.5F, -13F, 9.99F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 685 cull
		bodyModel[403].setRotationPoint(56.5F, -14F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 686 cull
		bodyModel[404].setRotationPoint(56.5F, -13F, -10.99F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 687 cull
		bodyModel[405].setRotationPoint(-60.5F, -14F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 688 cull
		bodyModel[406].setRotationPoint(-60.5F, -13F, -10.99F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[407].setRotationPoint(-10.5F, 2.75F, 7.4F);
		bodyModel[407].rotateAngleX = -0.78539816F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0.02F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[408].setRotationPoint(-10.51F, 3F, 6.9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[409].setRotationPoint(17.5F, -3F, -9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[410].setRotationPoint(17.5F, -7F, -9F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[411].setRotationPoint(17F, -4.5F, -9F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[412].setRotationPoint(17.5F, -2F, -9.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[413].setRotationPoint(21.5F, -4.5F, -9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[414].setRotationPoint(11.5F, -3F, -9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[415].setRotationPoint(11.5F, -7F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[416].setRotationPoint(11F, -4.5F, -9F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[417].setRotationPoint(11.5F, -2F, -9.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[418].setRotationPoint(15.5F, -4.5F, -9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[419].setRotationPoint(2.5F, -3F, -9F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[420].setRotationPoint(2.5F, -7F, -9F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[421].setRotationPoint(2F, -4.5F, -9F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[422].setRotationPoint(2.5F, -2F, -9.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -4F, 0F, -4.5F, -4F); // Box 495 cull
		bodyModel[423].setRotationPoint(6.5F, -4.5F, -9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[424].setRotationPoint(21.5F, -5F, -4.5F);

		bodyModel[425].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[425].setRotationPoint(22.5F, -5.5F, -3.5F);
		bodyModel[425].rotateAngleY = -0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[426].setRotationPoint(21.5F, 0.5F, -4.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[427].setRotationPoint(15.5F, -5F, -4.5F);

		bodyModel[428].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[428].setRotationPoint(16.5F, -5.5F, -3.5F);
		bodyModel[428].rotateAngleY = -0.78539816F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[429].setRotationPoint(15.5F, 0.5F, -4.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[430].setRotationPoint(10.5F, -3F, 5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 493
		bodyModel[431].setRotationPoint(10F, -7F, 5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[432].setRotationPoint(10.5F, -4.5F, 4.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 498
		bodyModel[433].setRotationPoint(10.5F, -2F, 5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[434].setRotationPoint(10.5F, -4.5F, 9F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[435].setRotationPoint(18.5F, -3F, 5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 493
		bodyModel[436].setRotationPoint(18F, -7F, 5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[437].setRotationPoint(18.5F, -4.5F, 4.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 498
		bodyModel[438].setRotationPoint(18.5F, -2F, 5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[439].setRotationPoint(18.5F, -4.5F, 9F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[440].setRotationPoint(26.5F, -3F, 5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 493
		bodyModel[441].setRotationPoint(26F, -7F, 5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[442].setRotationPoint(26.5F, -4.5F, 4.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 498
		bodyModel[443].setRotationPoint(26.5F, -2F, 5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[444].setRotationPoint(26.5F, -4.5F, 9F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[445].setRotationPoint(34.5F, -3F, 5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 493
		bodyModel[446].setRotationPoint(34F, -7F, 5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[447].setRotationPoint(34.5F, -4.5F, 4.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F); // Box 498
		bodyModel[448].setRotationPoint(34.5F, -2F, 5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, -4F, -4.5F, 0F, -4F, -4.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 495 cull
		bodyModel[449].setRotationPoint(34.5F, -4.5F, 9F);

		bodyModel[450].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 128
		bodyModel[450].setRotationPoint(-55.5F, -15F, 3F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 16, 13, 0F); // Box 128
		bodyModel[451].setRotationPoint(-46.5F, -15F, -9F);

		bodyModel[452].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[452].setRotationPoint(-50.5F, -15F, 3F);

		bodyModel[453].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 128
		bodyModel[453].setRotationPoint(-50.5F, -15F, 4F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[454].setRotationPoint(-50.5F, -15F, 9F);

		bodyModel[455].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 128
		bodyModel[455].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[456].setRotationPoint(-55.5F, -6F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[457].setRotationPoint(-55.5F, -15F, -8F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[458].setRotationPoint(-48.5F, -6F, -10F);

		bodyModel[459].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 384 glow
		bodyModel[459].setRotationPoint(-53.5F, -14.99F, -7F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[460].setRotationPoint(-53F, -13.99F, -0.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(-47.95F, -7F, -3F);
		bodyModel[461].rotateAngleY = 0.78539816F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[462].setRotationPoint(-48.45F, -6F, -0.68F);

		bodyModel[463].addBox(0F, 0F, -1F, 4, 4, 1, 0F); // Box 128 drop seat
		bodyModel[463].setRotationPoint(-29.5F, -5F, 10F);

		bodyModel[464].addBox(0F, 0F, -1F, 4, 4, 1, 0F); // Box 128 drop seat
		bodyModel[464].setRotationPoint(-25F, -5F, 10F);

		bodyModel[465].addBox(0F, 0F, -1F, 4, 4, 1, 0F); // Box 128 drop seat
		bodyModel[465].setRotationPoint(-20.5F, -5F, 10F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0.01F, -0.1F, 0F, 0.01F, -0.1F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 128 cull
		bodyModel[466].setRotationPoint(-29.5F, -5F, 9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462 curtain piece
		bodyModel[467].setRotationPoint(-22.5F, -5F, 9.9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[468].setRotationPoint(-9.5F, -3F, 5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526
		bodyModel[469].setRotationPoint(-9.5F, -2F, 5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527
		bodyModel[470].setRotationPoint(-9.5F, -7F, 8.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[471].setRotationPoint(-14.5F, -3F, 5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526
		bodyModel[472].setRotationPoint(-14.5F, -2F, 5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527
		bodyModel[473].setRotationPoint(-14.5F, -7F, 8.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527 cull
		bodyModel[474].setRotationPoint(-14.5F, -4F, 8.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527 cull
		bodyModel[475].setRotationPoint(-9.5F, -4F, 8.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -3.98F, 0F, 0F, -3.98F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, 0F, -3.98F, 0F, 0F, -3.98F, 0F, -0.49F, 0F, 0F, -0.49F); // Box 527
		bodyModel[476].setRotationPoint(-14.51F, -3F, 8.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -3.98F, 0F, 0F, -3.98F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.98F, 0F, 0F, -3.98F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 527
		bodyModel[477].setRotationPoint(-9.51F, -3F, 8.5F);

		bodyModel[478].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[478].setRotationPoint(-3.5F, -5F, -4F);
		bodyModel[478].rotateAngleY = 0.78539816F;

		bodyModel[479].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[479].setRotationPoint(-1F, -3F, -1.5F);
		bodyModel[479].rotateAngleY = -0.78539816F;

		bodyModel[480].addShapeBox(-2F, 0F, -2F, 8, 5, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526 cull
		bodyModel[480].setRotationPoint(-3.5F, -4F, -4F);
		bodyModel[480].rotateAngleY = 0.78539816F;

		bodyModel[481].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[481].setRotationPoint(-1F, -2F, -1.5F);
		bodyModel[481].rotateAngleY = -0.78539816F;

		bodyModel[482].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[482].setRotationPoint(-1F, -7F, -1.5F);
		bodyModel[482].rotateAngleY = -0.78539816F;

		bodyModel[483].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[483].setRotationPoint(-1F, -5F, -1.5F);
		bodyModel[483].rotateAngleY = -0.78539816F;

		bodyModel[484].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[484].setRotationPoint(-1F, -3F, -1.5F);
		bodyModel[484].rotateAngleY = -0.78539816F;

		bodyModel[485].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[485].setRotationPoint(-1F, -4.5F, -1.5F);
		bodyModel[485].rotateAngleY = -0.78539816F;

		bodyModel[486].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[486].setRotationPoint(-1F, -5F, -1.5F);
		bodyModel[486].rotateAngleY = -0.78539816F;

		bodyModel[487].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[487].setRotationPoint(-1F, -4.5F, -1.5F);
		bodyModel[487].rotateAngleY = -0.78539816F;

		bodyModel[488].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[488].setRotationPoint(-6F, -3F, -1.5F);
		bodyModel[488].rotateAngleY = 0.78539816F;

		bodyModel[489].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[489].setRotationPoint(-6F, -2F, -1.5F);
		bodyModel[489].rotateAngleY = 0.78539816F;

		bodyModel[490].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[490].setRotationPoint(-6F, -7F, -1.5F);
		bodyModel[490].rotateAngleY = 0.78539816F;

		bodyModel[491].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[491].setRotationPoint(-6F, -3F, -1.5F);
		bodyModel[491].rotateAngleY = 0.78539816F;

		bodyModel[492].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[492].setRotationPoint(-6F, -4.5F, -1.5F);
		bodyModel[492].rotateAngleY = 0.78539816F;

		bodyModel[493].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[493].setRotationPoint(-6F, -4.5F, -1.5F);
		bodyModel[493].rotateAngleY = 0.78539816F;

		bodyModel[494].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[494].setRotationPoint(-1F, -3F, -6.5F);
		bodyModel[494].rotateAngleY = -2.35619449F;

		bodyModel[495].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[495].setRotationPoint(-1F, -2F, -6.5F);
		bodyModel[495].rotateAngleY = -2.35619449F;

		bodyModel[496].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[496].setRotationPoint(-1F, -7F, -6.5F);
		bodyModel[496].rotateAngleY = -2.35619449F;

		bodyModel[497].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[497].setRotationPoint(-1F, -3F, -6.5F);
		bodyModel[497].rotateAngleY = -2.35619449F;

		bodyModel[498].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[498].setRotationPoint(-1F, -4.5F, -6.5F);
		bodyModel[498].rotateAngleY = -2.35619449F;

		bodyModel[499].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[499].setRotationPoint(-1F, -4.5F, -6.5F);
		bodyModel[499].rotateAngleY = -2.35619449F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 343, 400, textureX, textureY); // Box 526
		bodyModel[501] = new ModelRendererTurbo(this, 342, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[502] = new ModelRendererTurbo(this, 327, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[503] = new ModelRendererTurbo(this, 344, 397, textureX, textureY); // Box 526
		bodyModel[504] = new ModelRendererTurbo(this, 338, 394, textureX, textureY); // Box 526
		bodyModel[505] = new ModelRendererTurbo(this, 329, 394, textureX, textureY); // Box 526
		bodyModel[506] = new ModelRendererTurbo(this, 291, 361, textureX, textureY); // Box 526
		bodyModel[507] = new ModelRendererTurbo(this, 304, 378, textureX, textureY); // Box 526
		bodyModel[508] = new ModelRendererTurbo(this, 258, 353, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[509] = new ModelRendererTurbo(this, 303, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[510] = new ModelRendererTurbo(this, 288, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[511] = new ModelRendererTurbo(this, 305, 375, textureX, textureY); // Box 526
		bodyModel[512] = new ModelRendererTurbo(this, 299, 372, textureX, textureY); // Box 526
		bodyModel[513] = new ModelRendererTurbo(this, 290, 372, textureX, textureY); // Box 526
		bodyModel[514] = new ModelRendererTurbo(this, 274, 378, textureX, textureY); // Box 526
		bodyModel[515] = new ModelRendererTurbo(this, 273, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[516] = new ModelRendererTurbo(this, 258, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[517] = new ModelRendererTurbo(this, 275, 375, textureX, textureY); // Box 526
		bodyModel[518] = new ModelRendererTurbo(this, 269, 372, textureX, textureY); // Box 526
		bodyModel[519] = new ModelRendererTurbo(this, 260, 372, textureX, textureY); // Box 526
		bodyModel[520] = new ModelRendererTurbo(this, 304, 400, textureX, textureY); // Box 526
		bodyModel[521] = new ModelRendererTurbo(this, 303, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[522] = new ModelRendererTurbo(this, 288, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[523] = new ModelRendererTurbo(this, 305, 397, textureX, textureY); // Box 526
		bodyModel[524] = new ModelRendererTurbo(this, 299, 394, textureX, textureY); // Box 526
		bodyModel[525] = new ModelRendererTurbo(this, 290, 394, textureX, textureY); // Box 526
		bodyModel[526] = new ModelRendererTurbo(this, 274, 400, textureX, textureY); // Box 526
		bodyModel[527] = new ModelRendererTurbo(this, 273, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[528] = new ModelRendererTurbo(this, 258, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[529] = new ModelRendererTurbo(this, 275, 397, textureX, textureY); // Box 526
		bodyModel[530] = new ModelRendererTurbo(this, 269, 394, textureX, textureY); // Box 526
		bodyModel[531] = new ModelRendererTurbo(this, 260, 394, textureX, textureY); // Box 526
		bodyModel[532] = new ModelRendererTurbo(this, 222, 361, textureX, textureY); // Box 526
		bodyModel[533] = new ModelRendererTurbo(this, 235, 378, textureX, textureY); // Box 526
		bodyModel[534] = new ModelRendererTurbo(this, 189, 353, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[535] = new ModelRendererTurbo(this, 234, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[536] = new ModelRendererTurbo(this, 219, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[537] = new ModelRendererTurbo(this, 236, 375, textureX, textureY); // Box 526
		bodyModel[538] = new ModelRendererTurbo(this, 230, 372, textureX, textureY); // Box 526
		bodyModel[539] = new ModelRendererTurbo(this, 221, 372, textureX, textureY); // Box 526
		bodyModel[540] = new ModelRendererTurbo(this, 205, 378, textureX, textureY); // Box 526
		bodyModel[541] = new ModelRendererTurbo(this, 204, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[542] = new ModelRendererTurbo(this, 189, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[543] = new ModelRendererTurbo(this, 206, 375, textureX, textureY); // Box 526
		bodyModel[544] = new ModelRendererTurbo(this, 200, 372, textureX, textureY); // Box 526
		bodyModel[545] = new ModelRendererTurbo(this, 191, 372, textureX, textureY); // Box 526
		bodyModel[546] = new ModelRendererTurbo(this, 235, 400, textureX, textureY); // Box 526
		bodyModel[547] = new ModelRendererTurbo(this, 234, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[548] = new ModelRendererTurbo(this, 219, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[549] = new ModelRendererTurbo(this, 236, 397, textureX, textureY); // Box 526
		bodyModel[550] = new ModelRendererTurbo(this, 230, 394, textureX, textureY); // Box 526
		bodyModel[551] = new ModelRendererTurbo(this, 221, 394, textureX, textureY); // Box 526
		bodyModel[552] = new ModelRendererTurbo(this, 205, 400, textureX, textureY); // Box 526
		bodyModel[553] = new ModelRendererTurbo(this, 204, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[554] = new ModelRendererTurbo(this, 189, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[555] = new ModelRendererTurbo(this, 206, 397, textureX, textureY); // Box 526
		bodyModel[556] = new ModelRendererTurbo(this, 200, 394, textureX, textureY); // Box 526
		bodyModel[557] = new ModelRendererTurbo(this, 191, 394, textureX, textureY); // Box 526
		bodyModel[558] = new ModelRendererTurbo(this, 89, 351, textureX, textureY); // Box 526
		bodyModel[559] = new ModelRendererTurbo(this, 165, 378, textureX, textureY); // Box 526
		bodyModel[560] = new ModelRendererTurbo(this, 164, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[561] = new ModelRendererTurbo(this, 149, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[562] = new ModelRendererTurbo(this, 166, 375, textureX, textureY); // Box 526
		bodyModel[563] = new ModelRendererTurbo(this, 160, 372, textureX, textureY); // Box 526
		bodyModel[564] = new ModelRendererTurbo(this, 151, 372, textureX, textureY); // Box 526
		bodyModel[565] = new ModelRendererTurbo(this, 166, 400, textureX, textureY); // Box 526
		bodyModel[566] = new ModelRendererTurbo(this, 165, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[567] = new ModelRendererTurbo(this, 150, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[568] = new ModelRendererTurbo(this, 167, 397, textureX, textureY); // Box 526
		bodyModel[569] = new ModelRendererTurbo(this, 161, 394, textureX, textureY); // Box 526
		bodyModel[570] = new ModelRendererTurbo(this, 152, 394, textureX, textureY); // Box 526
		bodyModel[571] = new ModelRendererTurbo(this, 105, 378, textureX, textureY); // Box 526
		bodyModel[572] = new ModelRendererTurbo(this, 104, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[573] = new ModelRendererTurbo(this, 89, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[574] = new ModelRendererTurbo(this, 106, 375, textureX, textureY); // Box 526
		bodyModel[575] = new ModelRendererTurbo(this, 100, 372, textureX, textureY); // Box 526
		bodyModel[576] = new ModelRendererTurbo(this, 91, 372, textureX, textureY); // Box 526
		bodyModel[577] = new ModelRendererTurbo(this, 106, 400, textureX, textureY); // Box 526
		bodyModel[578] = new ModelRendererTurbo(this, 105, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[579] = new ModelRendererTurbo(this, 90, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[580] = new ModelRendererTurbo(this, 107, 397, textureX, textureY); // Box 526
		bodyModel[581] = new ModelRendererTurbo(this, 101, 394, textureX, textureY); // Box 526
		bodyModel[582] = new ModelRendererTurbo(this, 92, 394, textureX, textureY); // Box 526
		bodyModel[583] = new ModelRendererTurbo(this, 135, 378, textureX, textureY); // Box 526
		bodyModel[584] = new ModelRendererTurbo(this, 134, 384, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[585] = new ModelRendererTurbo(this, 119, 379, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[586] = new ModelRendererTurbo(this, 136, 375, textureX, textureY); // Box 526
		bodyModel[587] = new ModelRendererTurbo(this, 130, 372, textureX, textureY); // Box 526
		bodyModel[588] = new ModelRendererTurbo(this, 121, 372, textureX, textureY); // Box 526
		bodyModel[589] = new ModelRendererTurbo(this, 136, 400, textureX, textureY); // Box 526
		bodyModel[590] = new ModelRendererTurbo(this, 135, 406, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[591] = new ModelRendererTurbo(this, 120, 401, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[592] = new ModelRendererTurbo(this, 137, 397, textureX, textureY); // Box 526
		bodyModel[593] = new ModelRendererTurbo(this, 131, 394, textureX, textureY); // Box 526
		bodyModel[594] = new ModelRendererTurbo(this, 122, 394, textureX, textureY); // Box 526
		bodyModel[595] = new ModelRendererTurbo(this, 115, 349, textureX, textureY, "cull"); // Box 526 cull
		bodyModel[596] = new ModelRendererTurbo(this, 102, 357, textureX, textureY); // Box 526
		bodyModel[597] = new ModelRendererTurbo(this, 89, 359, textureX, textureY); // Box 526
		bodyModel[598] = new ModelRendererTurbo(this, 387, 395, textureX, textureY); // Right seat part
		bodyModel[599] = new ModelRendererTurbo(this, 389, 399, textureX, textureY); // Right seat part
		bodyModel[600] = new ModelRendererTurbo(this, 387, 407, textureX, textureY); // Right seat part
		bodyModel[601] = new ModelRendererTurbo(this, 318, 395, textureX, textureY); // Right seat part
		bodyModel[602] = new ModelRendererTurbo(this, 320, 399, textureX, textureY); // Right seat part
		bodyModel[603] = new ModelRendererTurbo(this, 318, 407, textureX, textureY); // Right seat part
		bodyModel[604] = new ModelRendererTurbo(this, 249, 395, textureX, textureY); // Right seat part
		bodyModel[605] = new ModelRendererTurbo(this, 251, 399, textureX, textureY); // Right seat part
		bodyModel[606] = new ModelRendererTurbo(this, 249, 407, textureX, textureY); // Right seat part
		bodyModel[607] = new ModelRendererTurbo(this, 180, 395, textureX, textureY); // Right seat part
		bodyModel[608] = new ModelRendererTurbo(this, 182, 399, textureX, textureY); // Right seat part
		bodyModel[609] = new ModelRendererTurbo(this, 180, 407, textureX, textureY); // Right seat part
		bodyModel[610] = new ModelRendererTurbo(this, 359, 376, textureX, textureY); // Box 526
		bodyModel[611] = new ModelRendererTurbo(this, 366, 389, textureX, textureY); // Box 526
		bodyModel[612] = new ModelRendererTurbo(this, 357, 389, textureX, textureY); // Box 526
		bodyModel[613] = new ModelRendererTurbo(this, 359, 398, textureX, textureY); // Box 526
		bodyModel[614] = new ModelRendererTurbo(this, 336, 367, textureX, textureY); // Box 526
		bodyModel[615] = new ModelRendererTurbo(this, 327, 367, textureX, textureY); // Box 526
		bodyModel[616] = new ModelRendererTurbo(this, 329, 376, textureX, textureY); // Box 526
		bodyModel[617] = new ModelRendererTurbo(this, 336, 389, textureX, textureY); // Box 526
		bodyModel[618] = new ModelRendererTurbo(this, 327, 389, textureX, textureY); // Box 526
		bodyModel[619] = new ModelRendererTurbo(this, 329, 398, textureX, textureY); // Box 526
		bodyModel[620] = new ModelRendererTurbo(this, 297, 367, textureX, textureY); // Box 526
		bodyModel[621] = new ModelRendererTurbo(this, 288, 367, textureX, textureY); // Box 526
		bodyModel[622] = new ModelRendererTurbo(this, 290, 376, textureX, textureY); // Box 526
		bodyModel[623] = new ModelRendererTurbo(this, 297, 389, textureX, textureY); // Box 526
		bodyModel[624] = new ModelRendererTurbo(this, 288, 389, textureX, textureY); // Box 526
		bodyModel[625] = new ModelRendererTurbo(this, 290, 398, textureX, textureY); // Box 526
		bodyModel[626] = new ModelRendererTurbo(this, 267, 367, textureX, textureY); // Box 526
		bodyModel[627] = new ModelRendererTurbo(this, 258, 367, textureX, textureY); // Box 526
		bodyModel[628] = new ModelRendererTurbo(this, 260, 376, textureX, textureY); // Box 526
		bodyModel[629] = new ModelRendererTurbo(this, 267, 389, textureX, textureY); // Box 526
		bodyModel[630] = new ModelRendererTurbo(this, 258, 389, textureX, textureY); // Box 526
		bodyModel[631] = new ModelRendererTurbo(this, 260, 398, textureX, textureY); // Box 526
		bodyModel[632] = new ModelRendererTurbo(this, 228, 367, textureX, textureY); // Box 526
		bodyModel[633] = new ModelRendererTurbo(this, 219, 367, textureX, textureY); // Box 526
		bodyModel[634] = new ModelRendererTurbo(this, 221, 376, textureX, textureY); // Box 526
		bodyModel[635] = new ModelRendererTurbo(this, 219, 389, textureX, textureY); // Box 526
		bodyModel[636] = new ModelRendererTurbo(this, 228, 389, textureX, textureY); // Box 526
		bodyModel[637] = new ModelRendererTurbo(this, 221, 398, textureX, textureY); // Box 526
		bodyModel[638] = new ModelRendererTurbo(this, 198, 367, textureX, textureY); // Box 526
		bodyModel[639] = new ModelRendererTurbo(this, 189, 367, textureX, textureY); // Box 526
		bodyModel[640] = new ModelRendererTurbo(this, 191, 376, textureX, textureY); // Box 526
		bodyModel[641] = new ModelRendererTurbo(this, 198, 389, textureX, textureY); // Box 526
		bodyModel[642] = new ModelRendererTurbo(this, 189, 389, textureX, textureY); // Box 526
		bodyModel[643] = new ModelRendererTurbo(this, 191, 398, textureX, textureY); // Box 526
		bodyModel[644] = new ModelRendererTurbo(this, 158, 367, textureX, textureY); // Box 526
		bodyModel[645] = new ModelRendererTurbo(this, 149, 367, textureX, textureY); // Box 526
		bodyModel[646] = new ModelRendererTurbo(this, 151, 376, textureX, textureY); // Box 526
		bodyModel[647] = new ModelRendererTurbo(this, 159, 389, textureX, textureY); // Box 526
		bodyModel[648] = new ModelRendererTurbo(this, 150, 389, textureX, textureY); // Box 526
		bodyModel[649] = new ModelRendererTurbo(this, 152, 398, textureX, textureY); // Box 526
		bodyModel[650] = new ModelRendererTurbo(this, 98, 367, textureX, textureY); // Box 526
		bodyModel[651] = new ModelRendererTurbo(this, 89, 367, textureX, textureY); // Box 526
		bodyModel[652] = new ModelRendererTurbo(this, 91, 376, textureX, textureY); // Box 526
		bodyModel[653] = new ModelRendererTurbo(this, 99, 389, textureX, textureY); // Box 526
		bodyModel[654] = new ModelRendererTurbo(this, 90, 389, textureX, textureY); // Box 526
		bodyModel[655] = new ModelRendererTurbo(this, 92, 398, textureX, textureY); // Box 526
		bodyModel[656] = new ModelRendererTurbo(this, 128, 367, textureX, textureY); // Box 526
		bodyModel[657] = new ModelRendererTurbo(this, 119, 367, textureX, textureY); // Box 526
		bodyModel[658] = new ModelRendererTurbo(this, 121, 376, textureX, textureY); // Box 526
		bodyModel[659] = new ModelRendererTurbo(this, 129, 389, textureX, textureY); // Box 526
		bodyModel[660] = new ModelRendererTurbo(this, 120, 389, textureX, textureY); // Box 526
		bodyModel[661] = new ModelRendererTurbo(this, 122, 398, textureX, textureY); // Box 526
		bodyModel[662] = new ModelRendererTurbo(this, 305, 411, textureX, textureY); // Box 526
		bodyModel[663] = new ModelRendererTurbo(this, 236, 411, textureX, textureY); // Box 526
		bodyModel[664] = new ModelRendererTurbo(this, 167, 411, textureX, textureY); // Box 526
		bodyModel[665] = new ModelRendererTurbo(this, 141, 348, textureX, textureY); // Box 526
		bodyModel[666] = new ModelRendererTurbo(this, 81, 258, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[667] = new ModelRendererTurbo(this, 43, 292, textureX, textureY); // Box 543
		bodyModel[668] = new ModelRendererTurbo(this, 69, 292, textureX, textureY); // Box 672
		bodyModel[669] = new ModelRendererTurbo(this, 39, 387, textureX, textureY, "lamp"); // Box 384 glow
		bodyModel[670] = new ModelRendererTurbo(this, 7, 335, textureX, textureY); // Box 543
		bodyModel[671] = new ModelRendererTurbo(this, 100, 437, textureX, textureY,"lamp"); // Box 393 glow
		bodyModel[672] = new ModelRendererTurbo(this, 113, 434, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[673] = new ModelRendererTurbo(this, 57, 359, textureX, textureY); // Box 526
		bodyModel[674] = new ModelRendererTurbo(this, 57, 352, textureX, textureY); // Box 526
		bodyModel[675] = new ModelRendererTurbo(this, 70, 359, textureX, textureY); // Box 526
		bodyModel[676] = new ModelRendererTurbo(this, 70, 352, textureX, textureY); // Box 526

		bodyModel[500].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[500].setRotationPoint(-6F, -3F, -6.5F);
		bodyModel[500].rotateAngleY = 2.35619449F;

		bodyModel[501].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[501].setRotationPoint(-6F, -2F, -6.5F);
		bodyModel[501].rotateAngleY = 2.35619449F;

		bodyModel[502].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[502].setRotationPoint(-6F, -7F, -6.5F);
		bodyModel[502].rotateAngleY = 2.35619449F;

		bodyModel[503].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[503].setRotationPoint(-6F, -3F, -6.5F);
		bodyModel[503].rotateAngleY = 2.35619449F;

		bodyModel[504].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[504].setRotationPoint(-6F, -4.5F, -6.5F);
		bodyModel[504].rotateAngleY = 2.35619449F;

		bodyModel[505].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[505].setRotationPoint(-6F, -4.5F, -6.5F);
		bodyModel[505].rotateAngleY = 2.35619449F;

		bodyModel[506].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[506].setRotationPoint(-14.5F, -5F, -4F);
		bodyModel[506].rotateAngleY = 0.78539816F;

		bodyModel[507].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[507].setRotationPoint(-12F, -3F, -1.5F);
		bodyModel[507].rotateAngleY = -0.78539816F;

		bodyModel[508].addShapeBox(-2F, 0F, -2F, 8, 5, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526 cull
		bodyModel[508].setRotationPoint(-14.5F, -4F, -4F);
		bodyModel[508].rotateAngleY = 0.78539816F;

		bodyModel[509].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[509].setRotationPoint(-12F, -2F, -1.5F);
		bodyModel[509].rotateAngleY = -0.78539816F;

		bodyModel[510].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[510].setRotationPoint(-12F, -7F, -1.5F);
		bodyModel[510].rotateAngleY = -0.78539816F;

		bodyModel[511].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[511].setRotationPoint(-12F, -3F, -1.5F);
		bodyModel[511].rotateAngleY = -0.78539816F;

		bodyModel[512].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[512].setRotationPoint(-12F, -4.5F, -1.5F);
		bodyModel[512].rotateAngleY = -0.78539816F;

		bodyModel[513].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[513].setRotationPoint(-12F, -4.5F, -1.5F);
		bodyModel[513].rotateAngleY = -0.78539816F;

		bodyModel[514].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[514].setRotationPoint(-17F, -3F, -1.5F);
		bodyModel[514].rotateAngleY = 0.78539816F;

		bodyModel[515].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[515].setRotationPoint(-17F, -2F, -1.5F);
		bodyModel[515].rotateAngleY = 0.78539816F;

		bodyModel[516].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[516].setRotationPoint(-17F, -7F, -1.5F);
		bodyModel[516].rotateAngleY = 0.78539816F;

		bodyModel[517].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[517].setRotationPoint(-17F, -3F, -1.5F);
		bodyModel[517].rotateAngleY = 0.78539816F;

		bodyModel[518].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[518].setRotationPoint(-17F, -4.5F, -1.5F);
		bodyModel[518].rotateAngleY = 0.78539816F;

		bodyModel[519].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[519].setRotationPoint(-17F, -4.5F, -1.5F);
		bodyModel[519].rotateAngleY = 0.78539816F;

		bodyModel[520].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[520].setRotationPoint(-12F, -3F, -6.5F);
		bodyModel[520].rotateAngleY = -2.35619449F;

		bodyModel[521].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[521].setRotationPoint(-12F, -2F, -6.5F);
		bodyModel[521].rotateAngleY = -2.35619449F;

		bodyModel[522].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[522].setRotationPoint(-12F, -7F, -6.5F);
		bodyModel[522].rotateAngleY = -2.35619449F;

		bodyModel[523].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[523].setRotationPoint(-12F, -3F, -6.5F);
		bodyModel[523].rotateAngleY = -2.35619449F;

		bodyModel[524].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[524].setRotationPoint(-12F, -4.5F, -6.5F);
		bodyModel[524].rotateAngleY = -2.35619449F;

		bodyModel[525].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[525].setRotationPoint(-12F, -4.5F, -6.5F);
		bodyModel[525].rotateAngleY = -2.35619449F;

		bodyModel[526].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[526].setRotationPoint(-17F, -3F, -6.5F);
		bodyModel[526].rotateAngleY = 2.35619449F;

		bodyModel[527].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[527].setRotationPoint(-17F, -2F, -6.5F);
		bodyModel[527].rotateAngleY = 2.35619449F;

		bodyModel[528].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[528].setRotationPoint(-17F, -7F, -6.5F);
		bodyModel[528].rotateAngleY = 2.35619449F;

		bodyModel[529].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[529].setRotationPoint(-17F, -3F, -6.5F);
		bodyModel[529].rotateAngleY = 2.35619449F;

		bodyModel[530].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[530].setRotationPoint(-17F, -4.5F, -6.5F);
		bodyModel[530].rotateAngleY = 2.35619449F;

		bodyModel[531].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[531].setRotationPoint(-17F, -4.5F, -6.5F);
		bodyModel[531].rotateAngleY = 2.35619449F;

		bodyModel[532].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[532].setRotationPoint(-25.5F, -5F, -4F);
		bodyModel[532].rotateAngleY = 0.78539816F;

		bodyModel[533].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[533].setRotationPoint(-23F, -3F, -1.5F);
		bodyModel[533].rotateAngleY = -0.78539816F;

		bodyModel[534].addShapeBox(-2F, 0F, -2F, 8, 5, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526 cull
		bodyModel[534].setRotationPoint(-25.5F, -4F, -4F);
		bodyModel[534].rotateAngleY = 0.78539816F;

		bodyModel[535].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[535].setRotationPoint(-23F, -2F, -1.5F);
		bodyModel[535].rotateAngleY = -0.78539816F;

		bodyModel[536].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[536].setRotationPoint(-23F, -7F, -1.5F);
		bodyModel[536].rotateAngleY = -0.78539816F;

		bodyModel[537].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[537].setRotationPoint(-23F, -3F, -1.5F);
		bodyModel[537].rotateAngleY = -0.78539816F;

		bodyModel[538].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[538].setRotationPoint(-23F, -4.5F, -1.5F);
		bodyModel[538].rotateAngleY = -0.78539816F;

		bodyModel[539].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[539].setRotationPoint(-23F, -4.5F, -1.5F);
		bodyModel[539].rotateAngleY = -0.78539816F;

		bodyModel[540].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[540].setRotationPoint(-28F, -3F, -1.5F);
		bodyModel[540].rotateAngleY = 0.78539816F;

		bodyModel[541].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[541].setRotationPoint(-28F, -2F, -1.5F);
		bodyModel[541].rotateAngleY = 0.78539816F;

		bodyModel[542].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[542].setRotationPoint(-28F, -7F, -1.5F);
		bodyModel[542].rotateAngleY = 0.78539816F;

		bodyModel[543].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[543].setRotationPoint(-28F, -3F, -1.5F);
		bodyModel[543].rotateAngleY = 0.78539816F;

		bodyModel[544].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[544].setRotationPoint(-28F, -4.5F, -1.5F);
		bodyModel[544].rotateAngleY = 0.78539816F;

		bodyModel[545].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[545].setRotationPoint(-28F, -4.5F, -1.5F);
		bodyModel[545].rotateAngleY = 0.78539816F;

		bodyModel[546].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[546].setRotationPoint(-23F, -3F, -6.5F);
		bodyModel[546].rotateAngleY = -2.35619449F;

		bodyModel[547].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[547].setRotationPoint(-23F, -2F, -6.5F);
		bodyModel[547].rotateAngleY = -2.35619449F;

		bodyModel[548].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[548].setRotationPoint(-23F, -7F, -6.5F);
		bodyModel[548].rotateAngleY = -2.35619449F;

		bodyModel[549].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[549].setRotationPoint(-23F, -3F, -6.5F);
		bodyModel[549].rotateAngleY = -2.35619449F;

		bodyModel[550].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[550].setRotationPoint(-23F, -4.5F, -6.5F);
		bodyModel[550].rotateAngleY = -2.35619449F;

		bodyModel[551].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[551].setRotationPoint(-23F, -4.5F, -6.5F);
		bodyModel[551].rotateAngleY = -2.35619449F;

		bodyModel[552].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[552].setRotationPoint(-28F, -3F, -6.5F);
		bodyModel[552].rotateAngleY = 2.35619449F;

		bodyModel[553].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[553].setRotationPoint(-28F, -2F, -6.5F);
		bodyModel[553].rotateAngleY = 2.35619449F;

		bodyModel[554].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[554].setRotationPoint(-28F, -7F, -6.5F);
		bodyModel[554].rotateAngleY = 2.35619449F;

		bodyModel[555].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[555].setRotationPoint(-28F, -3F, -6.5F);
		bodyModel[555].rotateAngleY = 2.35619449F;

		bodyModel[556].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[556].setRotationPoint(-28F, -4.5F, -6.5F);
		bodyModel[556].rotateAngleY = 2.35619449F;

		bodyModel[557].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[557].setRotationPoint(-28F, -4.5F, -6.5F);
		bodyModel[557].rotateAngleY = 2.35619449F;

		bodyModel[558].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[558].setRotationPoint(-39.5F, -5F, -5F);

		bodyModel[559].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[559].setRotationPoint(-34F, -3F, 0.5F);
		bodyModel[559].rotateAngleY = -0.78539816F;

		bodyModel[560].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[560].setRotationPoint(-34F, -2F, 0.5F);
		bodyModel[560].rotateAngleY = -0.78539816F;

		bodyModel[561].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[561].setRotationPoint(-34F, -7F, 0.5F);
		bodyModel[561].rotateAngleY = -0.78539816F;

		bodyModel[562].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[562].setRotationPoint(-34F, -3F, 0.5F);
		bodyModel[562].rotateAngleY = -0.78539816F;

		bodyModel[563].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[563].setRotationPoint(-34F, -4.5F, 0.5F);
		bodyModel[563].rotateAngleY = -0.78539816F;

		bodyModel[564].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[564].setRotationPoint(-34F, -4.5F, 0.5F);
		bodyModel[564].rotateAngleY = -0.78539816F;

		bodyModel[565].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[565].setRotationPoint(-34F, -3F, -4.5F);
		bodyModel[565].rotateAngleY = -2.35619449F;

		bodyModel[566].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[566].setRotationPoint(-34F, -2F, -4.5F);
		bodyModel[566].rotateAngleY = -2.35619449F;

		bodyModel[567].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[567].setRotationPoint(-34F, -7F, -4.5F);
		bodyModel[567].rotateAngleY = -2.35619449F;

		bodyModel[568].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[568].setRotationPoint(-34F, -3F, -4.5F);
		bodyModel[568].rotateAngleY = -2.35619449F;

		bodyModel[569].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[569].setRotationPoint(-34F, -4.5F, -4.5F);
		bodyModel[569].rotateAngleY = -2.35619449F;

		bodyModel[570].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[570].setRotationPoint(-34F, -4.5F, -4.5F);
		bodyModel[570].rotateAngleY = -2.35619449F;

		bodyModel[571].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[571].setRotationPoint(-42F, -3F, 0.5F);
		bodyModel[571].rotateAngleY = 0.78539816F;

		bodyModel[572].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[572].setRotationPoint(-42F, -2F, 0.5F);
		bodyModel[572].rotateAngleY = 0.78539816F;

		bodyModel[573].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[573].setRotationPoint(-42F, -7F, 0.5F);
		bodyModel[573].rotateAngleY = 0.78539816F;

		bodyModel[574].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[574].setRotationPoint(-42F, -3F, 0.5F);
		bodyModel[574].rotateAngleY = 0.78539816F;

		bodyModel[575].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[575].setRotationPoint(-42F, -4.5F, 0.5F);
		bodyModel[575].rotateAngleY = 0.78539816F;

		bodyModel[576].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[576].setRotationPoint(-42F, -4.5F, 0.5F);
		bodyModel[576].rotateAngleY = 0.78539816F;

		bodyModel[577].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[577].setRotationPoint(-42F, -3F, -4.5F);
		bodyModel[577].rotateAngleY = 2.35619449F;

		bodyModel[578].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[578].setRotationPoint(-42F, -2F, -4.5F);
		bodyModel[578].rotateAngleY = 2.35619449F;

		bodyModel[579].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[579].setRotationPoint(-42F, -7F, -4.5F);
		bodyModel[579].rotateAngleY = 2.35619449F;

		bodyModel[580].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[580].setRotationPoint(-42F, -3F, -4.5F);
		bodyModel[580].rotateAngleY = 2.35619449F;

		bodyModel[581].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[581].setRotationPoint(-42F, -4.5F, -4.5F);
		bodyModel[581].rotateAngleY = 2.35619449F;

		bodyModel[582].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[582].setRotationPoint(-42F, -4.5F, -4.5F);
		bodyModel[582].rotateAngleY = 2.35619449F;

		bodyModel[583].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[583].setRotationPoint(-38F, -3F, 2.5F);

		bodyModel[584].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[584].setRotationPoint(-38F, -2F, 2.5F);

		bodyModel[585].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[585].setRotationPoint(-38F, -7F, 2.5F);

		bodyModel[586].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[586].setRotationPoint(-38F, -3F, 2.5F);

		bodyModel[587].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[587].setRotationPoint(-38F, -4.5F, 2.5F);

		bodyModel[588].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[588].setRotationPoint(-38F, -4.5F, 2.5F);

		bodyModel[589].addShapeBox(-1.5F, 0F, -1.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		bodyModel[589].setRotationPoint(-38F, -3F, -6.5F);
		bodyModel[589].rotateAngleY = 3.14159265F;

		bodyModel[590].addShapeBox(-1.5F, 0F, -1.5F, 6, 3, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[590].setRotationPoint(-38F, -2F, -6.5F);
		bodyModel[590].rotateAngleY = 3.14159265F;

		bodyModel[591].addShapeBox(-1.5F, 0F, 1.5F, 6, 8, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526 cull
		bodyModel[591].setRotationPoint(-38F, -7F, -6.5F);
		bodyModel[591].rotateAngleY = 3.14159265F;

		bodyModel[592].addShapeBox(-2F, 0F, 0.5F, 4, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F); // Box 526
		bodyModel[592].setRotationPoint(-38F, -3F, -6.5F);
		bodyModel[592].rotateAngleY = 3.14159265F;

		bodyModel[593].addShapeBox(-2F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[593].setRotationPoint(-38F, -4.5F, -6.5F);
		bodyModel[593].rotateAngleY = 3.14159265F;

		bodyModel[594].addShapeBox(1.5F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -1.5F, -0.5F, -0.49F, -1.5F, -0.5F, -0.49F, 1F, 0F, -0.49F, 1F); // Box 526
		bodyModel[594].setRotationPoint(-38F, -4.5F, -6.5F);
		bodyModel[594].rotateAngleY = 3.14159265F;

		bodyModel[595].addShapeBox(-2F, 0F, -2F, 8, 5, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 526 cull
		bodyModel[595].setRotationPoint(-38F, -4F, -2F);
		bodyModel[595].rotateAngleY = 0.78539816F;

		bodyModel[596].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 526
		bodyModel[596].setRotationPoint(-36.5F, -5F, -5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 526
		bodyModel[597].setRotationPoint(-42.5F, -5F, -5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[598].setRotationPoint(0F, -5F, -5F);

		bodyModel[599].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[599].setRotationPoint(1F, -5.5F, -4F);
		bodyModel[599].rotateAngleY = -0.78539816F;

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[600].setRotationPoint(0F, 0.5F, -5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[601].setRotationPoint(-10F, -5F, -5F);

		bodyModel[602].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[602].setRotationPoint(-9F, -5.5F, -4F);
		bodyModel[602].rotateAngleY = -0.78539816F;

		bodyModel[603].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[603].setRotationPoint(-10F, 0.5F, -5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[604].setRotationPoint(-21F, -5F, -5F);

		bodyModel[605].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[605].setRotationPoint(-20F, -5.5F, -4F);
		bodyModel[605].rotateAngleY = -0.78539816F;

		bodyModel[606].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[606].setRotationPoint(-21F, 0.5F, -5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Right seat part
		bodyModel[607].setRotationPoint(-32F, -5F, -4F);

		bodyModel[608].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Right seat part
		bodyModel[608].setRotationPoint(-31F, -5.5F, -3F);
		bodyModel[608].rotateAngleY = -0.78539816F;

		bodyModel[609].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Right seat part
		bodyModel[609].setRotationPoint(-32F, 0.5F, -4F);

		bodyModel[610].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[610].setRotationPoint(-1F, -5F, -1.5F);
		bodyModel[610].rotateAngleY = -0.78539816F;

		bodyModel[611].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[611].setRotationPoint(-1F, -5F, -6.5F);
		bodyModel[611].rotateAngleY = -2.35619449F;

		bodyModel[612].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[612].setRotationPoint(-1F, -5F, -6.5F);
		bodyModel[612].rotateAngleY = -2.35619449F;

		bodyModel[613].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[613].setRotationPoint(-1F, -5F, -6.5F);
		bodyModel[613].rotateAngleY = -2.35619449F;

		bodyModel[614].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[614].setRotationPoint(-6F, -5F, -1.5F);
		bodyModel[614].rotateAngleY = 0.78539816F;

		bodyModel[615].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[615].setRotationPoint(-6F, -5F, -1.5F);
		bodyModel[615].rotateAngleY = 0.78539816F;

		bodyModel[616].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[616].setRotationPoint(-6F, -5F, -1.5F);
		bodyModel[616].rotateAngleY = 0.78539816F;

		bodyModel[617].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[617].setRotationPoint(-6F, -5F, -6.5F);
		bodyModel[617].rotateAngleY = 2.35619449F;

		bodyModel[618].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[618].setRotationPoint(-6F, -5F, -6.5F);
		bodyModel[618].rotateAngleY = 2.35619449F;

		bodyModel[619].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[619].setRotationPoint(-6F, -5F, -6.5F);
		bodyModel[619].rotateAngleY = 2.35619449F;

		bodyModel[620].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[620].setRotationPoint(-12F, -5F, -1.5F);
		bodyModel[620].rotateAngleY = -0.78539816F;

		bodyModel[621].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[621].setRotationPoint(-12F, -5F, -1.5F);
		bodyModel[621].rotateAngleY = -0.78539816F;

		bodyModel[622].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[622].setRotationPoint(-12F, -5F, -1.5F);
		bodyModel[622].rotateAngleY = -0.78539816F;

		bodyModel[623].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[623].setRotationPoint(-12F, -5F, -6.5F);
		bodyModel[623].rotateAngleY = -2.35619449F;

		bodyModel[624].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[624].setRotationPoint(-12F, -5F, -6.5F);
		bodyModel[624].rotateAngleY = -2.35619449F;

		bodyModel[625].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[625].setRotationPoint(-12F, -5F, -6.5F);
		bodyModel[625].rotateAngleY = -2.35619449F;

		bodyModel[626].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[626].setRotationPoint(-17F, -5F, -1.5F);
		bodyModel[626].rotateAngleY = 0.78539816F;

		bodyModel[627].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[627].setRotationPoint(-17F, -5F, -1.5F);
		bodyModel[627].rotateAngleY = 0.78539816F;

		bodyModel[628].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[628].setRotationPoint(-17F, -5F, -1.5F);
		bodyModel[628].rotateAngleY = 0.78539816F;

		bodyModel[629].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[629].setRotationPoint(-17F, -5F, -6.5F);
		bodyModel[629].rotateAngleY = 2.35619449F;

		bodyModel[630].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[630].setRotationPoint(-17F, -5F, -6.5F);
		bodyModel[630].rotateAngleY = 2.35619449F;

		bodyModel[631].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[631].setRotationPoint(-17F, -5F, -6.5F);
		bodyModel[631].rotateAngleY = 2.35619449F;

		bodyModel[632].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[632].setRotationPoint(-23F, -5F, -1.5F);
		bodyModel[632].rotateAngleY = -0.78539816F;

		bodyModel[633].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[633].setRotationPoint(-23F, -5F, -1.5F);
		bodyModel[633].rotateAngleY = -0.78539816F;

		bodyModel[634].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[634].setRotationPoint(-23F, -5F, -1.5F);
		bodyModel[634].rotateAngleY = -0.78539816F;

		bodyModel[635].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[635].setRotationPoint(-23F, -5F, -6.5F);
		bodyModel[635].rotateAngleY = -2.35619449F;

		bodyModel[636].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[636].setRotationPoint(-23F, -5F, -6.5F);
		bodyModel[636].rotateAngleY = -2.35619449F;

		bodyModel[637].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[637].setRotationPoint(-23F, -5F, -6.5F);
		bodyModel[637].rotateAngleY = -2.35619449F;

		bodyModel[638].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[638].setRotationPoint(-28F, -5F, -1.5F);
		bodyModel[638].rotateAngleY = 0.78539816F;

		bodyModel[639].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[639].setRotationPoint(-28F, -5F, -1.5F);
		bodyModel[639].rotateAngleY = 0.78539816F;

		bodyModel[640].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[640].setRotationPoint(-28F, -5F, -1.5F);
		bodyModel[640].rotateAngleY = 0.78539816F;

		bodyModel[641].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[641].setRotationPoint(-28F, -5F, -6.5F);
		bodyModel[641].rotateAngleY = 2.35619449F;

		bodyModel[642].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[642].setRotationPoint(-28F, -5F, -6.5F);
		bodyModel[642].rotateAngleY = 2.35619449F;

		bodyModel[643].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[643].setRotationPoint(-28F, -5F, -6.5F);
		bodyModel[643].rotateAngleY = 2.35619449F;

		bodyModel[644].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[644].setRotationPoint(-34F, -5F, 0.5F);
		bodyModel[644].rotateAngleY = -0.78539816F;

		bodyModel[645].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[645].setRotationPoint(-34F, -5F, 0.5F);
		bodyModel[645].rotateAngleY = -0.78539816F;

		bodyModel[646].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[646].setRotationPoint(-34F, -5F, 0.5F);
		bodyModel[646].rotateAngleY = -0.78539816F;

		bodyModel[647].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[647].setRotationPoint(-34F, -5F, -4.5F);
		bodyModel[647].rotateAngleY = -2.35619449F;

		bodyModel[648].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[648].setRotationPoint(-34F, -5F, -4.5F);
		bodyModel[648].rotateAngleY = -2.35619449F;

		bodyModel[649].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[649].setRotationPoint(-34F, -5F, -4.5F);
		bodyModel[649].rotateAngleY = -2.35619449F;

		bodyModel[650].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[650].setRotationPoint(-42F, -5F, 0.5F);
		bodyModel[650].rotateAngleY = 0.78539816F;

		bodyModel[651].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[651].setRotationPoint(-42F, -5F, 0.5F);
		bodyModel[651].rotateAngleY = 0.78539816F;

		bodyModel[652].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[652].setRotationPoint(-42F, -5F, 0.5F);
		bodyModel[652].rotateAngleY = 0.78539816F;

		bodyModel[653].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[653].setRotationPoint(-42F, -5F, -4.5F);
		bodyModel[653].rotateAngleY = 2.35619449F;

		bodyModel[654].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[654].setRotationPoint(-42F, -5F, -4.5F);
		bodyModel[654].rotateAngleY = 2.35619449F;

		bodyModel[655].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[655].setRotationPoint(-42F, -5F, -4.5F);
		bodyModel[655].rotateAngleY = 2.35619449F;

		bodyModel[656].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[656].setRotationPoint(-38F, -5F, 2.5F);

		bodyModel[657].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[657].setRotationPoint(-38F, -5F, 2.5F);

		bodyModel[658].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[658].setRotationPoint(-38F, -5F, 2.5F);

		bodyModel[659].addShapeBox(-2F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[659].setRotationPoint(-38F, -5F, -6.5F);
		bodyModel[659].rotateAngleY = -3.14159265F;

		bodyModel[660].addShapeBox(1.5F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 526
		bodyModel[660].setRotationPoint(-38F, -5F, -6.5F);
		bodyModel[660].rotateAngleY = -3.14159265F;

		bodyModel[661].addShapeBox(-2F, 0F, 1.5F, 4, 1, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F, -0.51F); // Box 526
		bodyModel[661].setRotationPoint(-38F, -5F, -6.5F);
		bodyModel[661].rotateAngleY = -3.14159265F;

		bodyModel[662].addShapeBox(-5.5F, 0F, -5.5F, 22, 0, 22, 0F,0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F, 0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F); // Box 526
		bodyModel[662].setRotationPoint(-3.5F, -0.75F, -4F);
		bodyModel[662].rotateAngleY = 0.78539816F;

		bodyModel[663].addShapeBox(-5.5F, 0F, -5.5F, 22, 0, 22, 0F,0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F, 0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F); // Box 526
		bodyModel[663].setRotationPoint(-14.5F, -0.75F, -4F);
		bodyModel[663].rotateAngleY = 0.78539816F;

		bodyModel[664].addShapeBox(-5.5F, 0F, -5.5F, 22, 0, 22, 0F,0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F, 0.035F, 0F, 0.035F, -10.965F, 0F, 0.035F, -10.965F, 0F, -10.965F, 0.035F, 0F, -10.965F); // Box 526
		bodyModel[664].setRotationPoint(-25.5F, -0.75F, -4F);
		bodyModel[664].rotateAngleY = 0.78539816F;

		bodyModel[665].addShapeBox(0F, 0F, 0F, 6, 0, 26, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -13F, 0F, 0F, -13F); // Box 526
		bodyModel[665].setRotationPoint(-39.5F, -0.75F, -8.5F);

		bodyModel[666].addBox(0F, 0F, 0F, 103, 0, 10, 0F); // Box 384 glow
		bodyModel[666].setRotationPoint(-55.5F, -16.99F, -5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 0, 2, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[667].setRotationPoint(9F, -17F, -10F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 0, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 672
		bodyModel[668].setRotationPoint(9F, -17F, 3F);

		bodyModel[669].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[669].setRotationPoint(-48.5F, -13.99F, 4F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 0, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[670].setRotationPoint(-45.49F, -17F, -9F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 92, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 393 glow
		bodyModel[671].setRotationPoint(-44.5F, -12.99F, -9F);

		bodyModel[672].addShapeBox(0F, 0F, -3F, 79, 0, 2, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 386 glow
		bodyModel[672].setRotationPoint(-31.5F, -12.99F, 10F);
		bodyModel[672].rotateAngleX = 0.00872665F;

		bodyModel[673].addShapeBox(-1.5F, 0F, -1.5F, 6, 0, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 526
		bodyModel[673].setRotationPoint(-42F, -0.75F, -4.5F);
		bodyModel[673].rotateAngleY = 2.35619449F;

		bodyModel[674].addShapeBox(-1.5F, 0F, -1.5F, 6, 0, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 526
		bodyModel[674].setRotationPoint(-42F, -0.75F, 0.5F);
		bodyModel[674].rotateAngleY = 0.78539816F;

		bodyModel[675].addShapeBox(-1.5F, 0F, -1.5F, 6, 0, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 526
		bodyModel[675].setRotationPoint(-34F, -0.75F, -4.5F);
		bodyModel[675].rotateAngleY = -2.35619449F;

		bodyModel[676].addShapeBox(-1.5F, 0F, -1.5F, 6, 0, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F); // Box 526
		bodyModel[676].setRotationPoint(-34F, -0.75F, 0.5F);
		bodyModel[676].rotateAngleY = -0.78539816F;
	}
	ModelPS_Truck_41CDO bogie1 = new ModelPS_Truck_41CDO();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 677; i++)
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
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-CDO_truck_black.png"));
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