//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PFE R-70-20 Mech Reefer
// Model Creator: bidahochi
// Created on: 30.09.2023 - 21:05:06
// Last changed on: 30.09.2023 - 21:05:06

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelR70Reefer extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelR70Reefer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[208];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 22, 15, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 203, 2, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 11, 5, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 178, 15, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 6, 187, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 41, 147, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 41, 102, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 12, 243, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 12, 214, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 9, 237, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 9, 217, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 10, 48, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 42
		bodyModel[17] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 174
		bodyModel[18] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 175
		bodyModel[19] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 176
		bodyModel[20] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 177
		bodyModel[21] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 178
		bodyModel[22] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 179
		bodyModel[23] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 180
		bodyModel[24] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 181
		bodyModel[25] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 182
		bodyModel[26] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 183
		bodyModel[27] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 184
		bodyModel[28] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 185
		bodyModel[29] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 186
		bodyModel[30] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 187
		bodyModel[31] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 188
		bodyModel[32] = new ModelRendererTurbo(this, 63, 70, textureX, textureY); // Box 189
		bodyModel[33] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 190
		bodyModel[34] = new ModelRendererTurbo(this, 62, 75, textureX, textureY); // Box 191
		bodyModel[35] = new ModelRendererTurbo(this, 59, 50, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 20, 181, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 20, 137, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 192, 181, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 192, 137, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 36, 48, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 183, 48, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 205, 48, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 171, 75, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 187, 75, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 168, 50, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 25, 181, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 34, 51, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 16, 55, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 4, 54, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 13, 54, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 5, 58, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 6, 58, textureX, textureY, "cull"); // Box 76 cull crossover
		bodyModel[74] = new ModelRendererTurbo(this, 241, 48, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 216, 46, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[76] = new ModelRendererTurbo(this, 231, 58, textureX, textureY, "cull"); // Box 79 cull crossover
		bodyModel[77] = new ModelRendererTurbo(this, 201, 51, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 206, 54, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 35, 54, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 109, 102, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 217, 96, textureX, textureY); // Box 85 door right
		bodyModel[82] = new ModelRendererTurbo(this, 109, 147, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 226, 211, textureX, textureY); // Box 99
		bodyModel[84] = new ModelRendererTurbo(this, 221, 211, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 216, 211, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 211, 211, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 206, 211, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 201, 211, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 236, 211, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 231, 211, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 251, 211, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 246, 211, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 241, 211, textureX, textureY); // Box 97
		bodyModel[94] = new ModelRendererTurbo(this, 50, 133, textureX, textureY); // Box 130
		bodyModel[95] = new ModelRendererTurbo(this, 49, 96, textureX, textureY); // Box 131
		bodyModel[96] = new ModelRendererTurbo(this, 89, 99, textureX, textureY); // Box 100
		bodyModel[97] = new ModelRendererTurbo(this, 164, 102, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 164, 147, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 164, 116, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 164, 161, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 204, 112, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[102] = new ModelRendererTurbo(this, 230, 46, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[103] = new ModelRendererTurbo(this, 204, 157, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[104] = new ModelRendererTurbo(this, 30, 114, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[105] = new ModelRendererTurbo(this, 30, 159, textureX, textureY, "cull"); // Box 105 ladder cull
		bodyModel[106] = new ModelRendererTurbo(this, 21, 46, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[107] = new ModelRendererTurbo(this, 35, 46, textureX, textureY, "cull"); // Box 78 ladder cull
		bodyModel[108] = new ModelRendererTurbo(this, 164, 171, textureX, textureY); // Box 115
		bodyModel[109] = new ModelRendererTurbo(this, 231, 234, textureX, textureY); // Box 117
		bodyModel[110] = new ModelRendererTurbo(this, 236, 234, textureX, textureY); // Box 118
		bodyModel[111] = new ModelRendererTurbo(this, 241, 234, textureX, textureY); // Box 119
		bodyModel[112] = new ModelRendererTurbo(this, 246, 234, textureX, textureY); // Box 120
		bodyModel[113] = new ModelRendererTurbo(this, 251, 234, textureX, textureY); // Box 121
		bodyModel[114] = new ModelRendererTurbo(this, 226, 234, textureX, textureY); // Box 122
		bodyModel[115] = new ModelRendererTurbo(this, 221, 234, textureX, textureY); // Box 123
		bodyModel[116] = new ModelRendererTurbo(this, 216, 234, textureX, textureY); // Box 124
		bodyModel[117] = new ModelRendererTurbo(this, 211, 234, textureX, textureY); // Box 125
		bodyModel[118] = new ModelRendererTurbo(this, 206, 234, textureX, textureY); // Box 126
		bodyModel[119] = new ModelRendererTurbo(this, 201, 234, textureX, textureY); // Box 127
		bodyModel[120] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 89, 174, textureX, textureY); // Box 129
		bodyModel[122] = new ModelRendererTurbo(this, 89, 144, textureX, textureY); // Box 130
		bodyModel[123] = new ModelRendererTurbo(this, 179, 104, textureX, textureY); // Box 131 mesh
		bodyModel[124] = new ModelRendererTurbo(this, 179, 149, textureX, textureY); // Box 132 mesh
		bodyModel[125] = new ModelRendererTurbo(this, 204, 129, textureX, textureY, "cull"); // Box 133 ladder cull
		bodyModel[126] = new ModelRendererTurbo(this, 193, 129, textureX, textureY, "cull"); // Box 134 ladder cull
		bodyModel[127] = new ModelRendererTurbo(this, 204, 174, textureX, textureY, "cull"); // Box 133 ladder cull
		bodyModel[128] = new ModelRendererTurbo(this, 193, 174, textureX, textureY, "cull"); // Box 134 ladder cull
		bodyModel[129] = new ModelRendererTurbo(this, 30, 129, textureX, textureY, "cull"); // Box 133 ladder cull
		bodyModel[130] = new ModelRendererTurbo(this, 30, 174, textureX, textureY, "cull"); // Box 133 ladder cull
		bodyModel[131] = new ModelRendererTurbo(this, 139, 30, textureX, textureY); // Box 139
		bodyModel[132] = new ModelRendererTurbo(this, 139, 19, textureX, textureY); // Box 140
		bodyModel[133] = new ModelRendererTurbo(this, 164, 171, textureX, textureY); // Box 141
		bodyModel[134] = new ModelRendererTurbo(this, 128, 129, textureX, textureY, "cull"); // Box 143 ladder cull
		bodyModel[135] = new ModelRendererTurbo(this, 76, 174, textureX, textureY, "cull"); // Box 143 ladder cull
		bodyModel[136] = new ModelRendererTurbo(this, 12, 37, textureX, textureY); // Box 286
		bodyModel[137] = new ModelRendererTurbo(this, 12, 37, textureX, textureY); // Box 287
		bodyModel[138] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 302
		bodyModel[139] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Box 148
		bodyModel[140] = new ModelRendererTurbo(this, 31, 24, textureX, textureY); // Box 149
		bodyModel[141] = new ModelRendererTurbo(this, 11, 24, textureX, textureY); // Box 150
		bodyModel[142] = new ModelRendererTurbo(this, 11, 13, textureX, textureY); // Box 151
		bodyModel[143] = new ModelRendererTurbo(this, 167, 24, textureX, textureY); // Box 152
		bodyModel[144] = new ModelRendererTurbo(this, 167, 13, textureX, textureY); // Box 153
		bodyModel[145] = new ModelRendererTurbo(this, 187, 24, textureX, textureY); // Box 154
		bodyModel[146] = new ModelRendererTurbo(this, 187, 13, textureX, textureY); // Box 155
		bodyModel[147] = new ModelRendererTurbo(this, 50, 13, textureX, textureY); // Box 156
		bodyModel[148] = new ModelRendererTurbo(this, 50, 24, textureX, textureY); // Box 157
		bodyModel[149] = new ModelRendererTurbo(this, 125, 13, textureX, textureY); // Box 158
		bodyModel[150] = new ModelRendererTurbo(this, 125, 24, textureX, textureY); // Box 159
		bodyModel[151] = new ModelRendererTurbo(this, 62, 40, textureX, textureY); // Box 317
		bodyModel[152] = new ModelRendererTurbo(this, 58, 35, textureX, textureY); // Box 318
		bodyModel[153] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 118
		bodyModel[154] = new ModelRendererTurbo(this, 35, 35, textureX, textureY); // Box 119
		bodyModel[155] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 129
		bodyModel[156] = new ModelRendererTurbo(this, 24, 35, textureX, textureY); // Box 196
		bodyModel[157] = new ModelRendererTurbo(this, 35, 41, textureX, textureY); // Box 199
		bodyModel[158] = new ModelRendererTurbo(this, 49, 35, textureX, textureY); // Box 122
		bodyModel[159] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 123
		bodyModel[160] = new ModelRendererTurbo(this, 32, 13, textureX, textureY); // Box 124
		bodyModel[161] = new ModelRendererTurbo(this, 44, 41, textureX, textureY); // Box 126
		bodyModel[162] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 202
		bodyModel[163] = new ModelRendererTurbo(this, 43, 46, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 125
		bodyModel[165] = new ModelRendererTurbo(this, 217, 120, textureX, textureY); // Box 174 door right
		bodyModel[166] = new ModelRendererTurbo(this, 217, 120, textureX, textureY); // Box 175 door right
		bodyModel[167] = new ModelRendererTurbo(this, 222, 120, textureX, textureY); // Box 176 door right
		bodyModel[168] = new ModelRendererTurbo(this, 222, 120, textureX, textureY); // Box 177 door right
		bodyModel[169] = new ModelRendererTurbo(this, 225, 123, textureX, textureY); // Box 178 door right
		bodyModel[170] = new ModelRendererTurbo(this, 222, 120, textureX, textureY); // Box 179 door right
		bodyModel[171] = new ModelRendererTurbo(this, 222, 120, textureX, textureY); // Box 180 door right
		bodyModel[172] = new ModelRendererTurbo(this, 232, 123, textureX, textureY); // Box 181 door right
		bodyModel[173] = new ModelRendererTurbo(this, 225, 132, textureX, textureY); // Box 182 door right
		bodyModel[174] = new ModelRendererTurbo(this, 222, 123, textureX, textureY); // Box 183 door right
		bodyModel[175] = new ModelRendererTurbo(this, 222, 123, textureX, textureY); // Box 184 door right
		bodyModel[176] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 185 door right handle
		bodyModel[177] = new ModelRendererTurbo(this, 217, 148, textureX, textureY); // Box 186 door left
		bodyModel[178] = new ModelRendererTurbo(this, 217, 172, textureX, textureY); // Box 187 door left
		bodyModel[179] = new ModelRendererTurbo(this, 222, 172, textureX, textureY); // Box 188 door left
		bodyModel[180] = new ModelRendererTurbo(this, 222, 175, textureX, textureY); // Box 189 door left
		bodyModel[181] = new ModelRendererTurbo(this, 222, 172, textureX, textureY); // Box 190 door left
		bodyModel[182] = new ModelRendererTurbo(this, 217, 172, textureX, textureY); // Box 191 door left
		bodyModel[183] = new ModelRendererTurbo(this, 222, 175, textureX, textureY); // Box 192 door left
		bodyModel[184] = new ModelRendererTurbo(this, 225, 175, textureX, textureY); // Box 193 door left
		bodyModel[185] = new ModelRendererTurbo(this, 222, 172, textureX, textureY); // Box 194 door left
		bodyModel[186] = new ModelRendererTurbo(this, 232, 175, textureX, textureY); // Box 195 door left
		bodyModel[187] = new ModelRendererTurbo(this, 225, 184, textureX, textureY); // Box 196 door left
		bodyModel[188] = new ModelRendererTurbo(this, 233, 181, textureX, textureY); // Box 197 door left
		bodyModel[189] = new ModelRendererTurbo(this, 222, 172, textureX, textureY); // Box 198 door left
		bodyModel[190] = new ModelRendererTurbo(this, 89, 178, textureX, textureY); // Box 199
		bodyModel[191] = new ModelRendererTurbo(this, 89, 141, textureX, textureY); // Box 200
		bodyModel[192] = new ModelRendererTurbo(this, 91, 60, textureX, textureY); // Box 201
		bodyModel[193] = new ModelRendererTurbo(this, 153, 88, textureX, textureY); // Box 202
		bodyModel[194] = new ModelRendererTurbo(this, 114, 70, textureX, textureY); // Box 203
		bodyModel[195] = new ModelRendererTurbo(this, 135, 77, textureX, textureY); // Box 204
		bodyModel[196] = new ModelRendererTurbo(this, 114, 40, textureX, textureY); // Box 205
		bodyModel[197] = new ModelRendererTurbo(this, 91, 35, textureX, textureY); // Box 206
		bodyModel[198] = new ModelRendererTurbo(this, 135, 69, textureX, textureY); // Box 207
		bodyModel[199] = new ModelRendererTurbo(this, 178, 89, textureX, textureY); // Box 208
		bodyModel[200] = new ModelRendererTurbo(this, 3, 8, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[201] = new ModelRendererTurbo(this, 19, -4, textureX, textureY); // Box 210
		bodyModel[202] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 80
		bodyModel[203] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 212
		bodyModel[204] = new ModelRendererTurbo(this, 201, 8, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[205] = new ModelRendererTurbo(this, 189, -4, textureX, textureY); // Box 214
		bodyModel[206] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 215
		bodyModel[207] = new ModelRendererTurbo(this, 170, 1, textureX, textureY); // Box 216

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-33F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(46F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 92, 2, 5, 0F); // Box 0
		bodyModel[2].setRotationPoint(-46F, 3F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(-50F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(29F, 5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 82, 1, 20, 0F); // Box 1
		bodyModel[5].setRotationPoint(-41F, 2F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 32, 25, 1, 0F); // Box 3
		bodyModel[6].setRotationPoint(-41F, -21F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 32, 25, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-41F, -21F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-42F, -22F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-42F, -22F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 84, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-42F, -23F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 84, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-42F, -23F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 84, 1, 12, 0F); // Box 13
		bodyModel[12].setRotationPoint(-42F, -23F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 14
		bodyModel[13].setRotationPoint(-42F, -21F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 40
		bodyModel[14].setRotationPoint(-43F, -1.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 41
		bodyModel[15].setRotationPoint(-43F, -1.5F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 42
		bodyModel[16].setRotationPoint(-43F, -1.5F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 174
		bodyModel[17].setRotationPoint(-43F, -4.5F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 175
		bodyModel[18].setRotationPoint(-43F, -4.5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 176
		bodyModel[19].setRotationPoint(-43F, -4.5F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 177
		bodyModel[20].setRotationPoint(-43F, -7.5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 178
		bodyModel[21].setRotationPoint(-43F, -7.5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 179
		bodyModel[22].setRotationPoint(-43F, -7.5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 180
		bodyModel[23].setRotationPoint(-43F, -10.5F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 181
		bodyModel[24].setRotationPoint(-43F, -10.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 182
		bodyModel[25].setRotationPoint(-43F, -10.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 183
		bodyModel[26].setRotationPoint(-43F, -13.5F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 184
		bodyModel[27].setRotationPoint(-43F, -13.5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 185
		bodyModel[28].setRotationPoint(-43F, -13.5F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 186
		bodyModel[29].setRotationPoint(-43F, -16.5F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 187
		bodyModel[30].setRotationPoint(-43F, -16.5F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 188
		bodyModel[31].setRotationPoint(-43F, -16.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 189
		bodyModel[32].setRotationPoint(-43F, -19.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 190
		bodyModel[33].setRotationPoint(-43F, -19.5F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 191
		bodyModel[34].setRotationPoint(-43F, -19.5F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 36
		bodyModel[35].setRotationPoint(-42.25F, -21.5F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-42F, 3F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 38
		bodyModel[37].setRotationPoint(-42F, 3F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		bodyModel[38].setRotationPoint(41F, 3F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40
		bodyModel[39].setRotationPoint(41F, 3F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 41
		bodyModel[40].setRotationPoint(-42F, -22F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 42
		bodyModel[41].setRotationPoint(41F, -22F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 43
		bodyModel[42].setRotationPoint(41F, -21F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 44
		bodyModel[43].setRotationPoint(42F, -10.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 45
		bodyModel[44].setRotationPoint(42F, -10.5F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 46
		bodyModel[45].setRotationPoint(42F, -10.5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[46].setRotationPoint(42F, -7.5F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 48
		bodyModel[47].setRotationPoint(42F, -7.5F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 49
		bodyModel[48].setRotationPoint(42F, -7.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 50
		bodyModel[49].setRotationPoint(42F, -4.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 51
		bodyModel[50].setRotationPoint(42F, -4.5F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 52
		bodyModel[51].setRotationPoint(42F, -4.5F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[52].setRotationPoint(42F, -1.5F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 54
		bodyModel[53].setRotationPoint(42F, -1.5F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 55
		bodyModel[54].setRotationPoint(42F, -1.5F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 56
		bodyModel[55].setRotationPoint(42F, -13.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[56].setRotationPoint(42F, -13.5F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[57].setRotationPoint(42F, -13.5F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[58].setRotationPoint(42F, -16.5F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[59].setRotationPoint(42F, -16.5F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[60].setRotationPoint(42F, -16.5F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 62
		bodyModel[61].setRotationPoint(42F, -19.5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 63
		bodyModel[62].setRotationPoint(42F, -19.5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 64
		bodyModel[63].setRotationPoint(42F, -19.5F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 65
		bodyModel[64].setRotationPoint(41.25F, -21.5F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[65].setRotationPoint(-41F, 4F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 82, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
		bodyModel[66].setRotationPoint(-41F, 4F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 70
		bodyModel[67].setRotationPoint(-43F, -8F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[68].setRotationPoint(-44.51F, -6F, 2F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[69].setRotationPoint(-44.5F, -4.5F, 3.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[70].setRotationPoint(-43.5F, -6F, 2.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 132
		bodyModel[71].setRotationPoint(-44F, -3.5F, 4F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 75
		bodyModel[72].setRotationPoint(-42.51F, -7F, -5F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 76 cull crossover
		bodyModel[73].setRotationPoint(-44.5F, 1F, -5F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 77
		bodyModel[74].setRotationPoint(43.51F, -7F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[75].setRotationPoint(42F, -10F, 6F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 79 cull crossover
		bodyModel[76].setRotationPoint(42.5F, 1F, -5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 81
		bodyModel[77].setRotationPoint(42F, -8F, -6F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Box 82
		bodyModel[78].setRotationPoint(42.5F, -1F, -5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Box 83
		bodyModel[79].setRotationPoint(-42.5F, -1F, -5F);

		bodyModel[80].addBox(0F, 0F, 0F, 26, 25, 1, 0F); // Box 84
		bodyModel[80].setRotationPoint(9F, -21F, 10F);

		bodyModel[81].addBox(0F, 0F, 0F, 18, 22, 1, 0F); // Box 85 door right
		bodyModel[81].setRotationPoint(-9F, -20F, 10.25F);

		bodyModel[82].addBox(0F, 0F, 0F, 26, 25, 1, 0F); // Box 86
		bodyModel[82].setRotationPoint(9F, -21F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[83].setRotationPoint(-12F, -18F, 10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[84].setRotationPoint(-16F, -18F, 10.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[85].setRotationPoint(-21F, -18F, 10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[86].setRotationPoint(-26F, -18F, 10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(-31F, -18F, 10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[88].setRotationPoint(-36F, -18F, 10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[89].setRotationPoint(15F, -18F, 10.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[90].setRotationPoint(11F, -18F, 10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[91].setRotationPoint(30F, -18F, 10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(25F, -18F, 10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[93].setRotationPoint(20F, -18F, 10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[94].setRotationPoint(-28F, 3F, 10.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[95].setRotationPoint(-28F, -21F, 10.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 100
		bodyModel[96].setRotationPoint(-9F, -21F, 10F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 101
		bodyModel[97].setRotationPoint(35F, -21F, 10F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 102
		bodyModel[98].setRotationPoint(35F, -21F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 103
		bodyModel[99].setRotationPoint(35F, 3F, 10F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 104
		bodyModel[100].setRotationPoint(35F, 3F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[101].setRotationPoint(37.5F, -11F, 10.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[102].setRotationPoint(42F, -10F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[103].setRotationPoint(37.5F, -11F, -11.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[104].setRotationPoint(-41.5F, -10F, 10.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 ladder cull
		bodyModel[105].setRotationPoint(-41.5F, -10F, -11.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[106].setRotationPoint(-43F, -10F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 ladder cull
		bodyModel[107].setRotationPoint(-43F, -10F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 115
		bodyModel[108].setRotationPoint(29F, -9F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 117
		bodyModel[109].setRotationPoint(11F, -18F, -11.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 118
		bodyModel[110].setRotationPoint(15F, -18F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 119
		bodyModel[111].setRotationPoint(20F, -18F, -11.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 120
		bodyModel[112].setRotationPoint(25F, -18F, -11.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 121
		bodyModel[113].setRotationPoint(30F, -18F, -11.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 122
		bodyModel[114].setRotationPoint(-12F, -18F, -11.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 123
		bodyModel[115].setRotationPoint(-16F, -18F, -11.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 124
		bodyModel[116].setRotationPoint(-21F, -18F, -11.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 125
		bodyModel[117].setRotationPoint(-26F, -18F, -11.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 126
		bodyModel[118].setRotationPoint(-31F, -18F, -11.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 127
		bodyModel[119].setRotationPoint(-36F, -18F, -11.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 128
		bodyModel[120].setRotationPoint(-9F, 2F, 10F);

		bodyModel[121].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 129
		bodyModel[121].setRotationPoint(-9F, 2F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 130
		bodyModel[122].setRotationPoint(-9F, -21F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 12, 24, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -12F, 0F); // Box 131 mesh
		bodyModel[123].setRotationPoint(35F, -9F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 24, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -12F, 0F); // Box 132 mesh
		bodyModel[124].setRotationPoint(35F, -9F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133 ladder cull
		bodyModel[125].setRotationPoint(37.5F, 4.5F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134 ladder cull
		bodyModel[126].setRotationPoint(33.5F, 4.5F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133 ladder cull
		bodyModel[127].setRotationPoint(37.5F, 4.5F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134 ladder cull
		bodyModel[128].setRotationPoint(33.5F, 4.5F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 133 ladder cull
		bodyModel[129].setRotationPoint(-41.5F, 4.5F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 133 ladder cull
		bodyModel[130].setRotationPoint(-41.5F, 4.5F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 139
		bodyModel[131].setRotationPoint(12F, 3F, 5F);

		bodyModel[132].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 140
		bodyModel[132].setRotationPoint(12F, 3F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 141
		bodyModel[133].setRotationPoint(29F, 3F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 143 ladder cull
		bodyModel[134].setRotationPoint(5.5F, 4.5F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 143 ladder cull
		bodyModel[135].setRotationPoint(-11.5F, 4.5F, -11F);

		bodyModel[136].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[136].setRotationPoint(-24F, 5.5F, -6.5F);
		bodyModel[136].rotateAngleX = -0.78539816F;

		bodyModel[137].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[137].setRotationPoint(-21F, 5.5F, -6.5F);
		bodyModel[137].rotateAngleX = -0.78539816F;

		bodyModel[138].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 302
		bodyModel[138].setRotationPoint(-22.5F, 3F, -7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 148
		bodyModel[139].setRotationPoint(-26F, 2.5F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[140].setRotationPoint(-26F, 2.5F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[141].setRotationPoint(-37F, 2.5F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 151
		bodyModel[142].setRotationPoint(-37F, 2.5F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[143].setRotationPoint(25F, 2.5F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 153
		bodyModel[144].setRotationPoint(25F, 2.5F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[145].setRotationPoint(36F, 2.5F, 2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 155
		bodyModel[146].setRotationPoint(36F, 2.5F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 156
		bodyModel[147].setRotationPoint(-12F, 2.5F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[148].setRotationPoint(-12F, 2.5F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 158
		bodyModel[149].setRotationPoint(11F, 2.5F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[150].setRotationPoint(11F, 2.5F, 2F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[151].setRotationPoint(-15.5F, 5F, -8.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[152].setRotationPoint(-16.5F, 3F, -8.5F);

		bodyModel[153].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[153].setRotationPoint(-15F, 5F, 4F);
		bodyModel[153].rotateAngleX = -0.78539816F;

		bodyModel[154].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[154].setRotationPoint(-17F, 5F, 4F);
		bodyModel[154].rotateAngleX = -0.78539816F;

		bodyModel[155].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[155].setRotationPoint(-15.5F, 3F, 3F);

		bodyModel[156].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[156].setRotationPoint(-18F, 5.51F, 0F);
		bodyModel[156].rotateAngleY = -0.31415927F;

		bodyModel[157].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[157].setRotationPoint(-18F, 5.5F, 0F);
		bodyModel[157].rotateAngleY = -0.31415927F;

		bodyModel[158].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[158].setRotationPoint(21F, 5.51F, 0F);
		bodyModel[158].rotateAngleY = -0.10471976F;

		bodyModel[159].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 123
		bodyModel[159].setRotationPoint(21F, 5.5F, 0F);
		bodyModel[159].rotateAngleY = -0.10471976F;

		bodyModel[160].addBox(-0.5F, 0F, 0F, 1, 0, 39, 0F); // Box 124
		bodyModel[160].setRotationPoint(-18F, 5.51F, 0F);
		bodyModel[160].rotateAngleY = -1.57079633F;

		bodyModel[161].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[161].setRotationPoint(19F, 4.75F, -2.25F);

		bodyModel[162].addBox(-14.5F, -0.75F, -0.5F, 15, 0, 1, 0F); // Box 202
		bodyModel[162].setRotationPoint(-19F, 6.26F, -3.5F);
		bodyModel[162].rotateAngleY = -0.17453293F;
		bodyModel[162].rotateAngleZ = 0.08726646F;

		bodyModel[163].addBox(-11.5F, -0.75F, -0.5F, 12, 0, 1, 0F); // Box 128
		bodyModel[163].setRotationPoint(21.5F, 6.26F, 3.5F);
		bodyModel[163].rotateAngleY = -3.40339204F;
		bodyModel[163].rotateAngleZ = 0.08726646F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 31, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[164].setRotationPoint(-43.25F, 3.5F, 4F);
		bodyModel[164].rotateAngleZ = -0.01745329F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 door right
		bodyModel[165].setRotationPoint(-9F, -20F, 10.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 door right
		bodyModel[166].setRotationPoint(8F, -20F, 10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 176 door right
		bodyModel[167].setRotationPoint(-8F, -13F, 10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 177 door right
		bodyModel[168].setRotationPoint(-8F, -5F, 10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[169].setRotationPoint(-1F, -12F, 10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[170].setRotationPoint(-8F, -19F, 10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180 door right
		bodyModel[171].setRotationPoint(-8F, 1F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181 door right
		bodyModel[172].setRotationPoint(-2F, -4F, 10.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 182 door right
		bodyModel[173].setRotationPoint(-5F, -3F, 11.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 22, 0, 0F); // Box 183 door right
		bodyModel[174].setRotationPoint(-6F, -20F, 11.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 22, 0, 0F); // Box 184 door right
		bodyModel[175].setRotationPoint(5F, -20F, 11.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[176].setRotationPoint(0.5F, -3F, 11.51F);
		bodyModel[176].rotateAngleZ = -2.04203522F;

		bodyModel[177].addBox(0F, 0F, 0F, 18, 22, 1, 0F); // Box 186 door left
		bodyModel[177].setRotationPoint(-9F, -20F, -11.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 187 door left
		bodyModel[178].setRotationPoint(-9F, -20F, -11.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 188 door left
		bodyModel[179].setRotationPoint(-8F, -13F, -11.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 22, 0, 0F); // Box 189 door left
		bodyModel[180].setRotationPoint(-6F, -20F, -11.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 190 door left
		bodyModel[181].setRotationPoint(-8F, -19F, -11.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 191 door left
		bodyModel[182].setRotationPoint(8F, -20F, -11.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 22, 0, 0F); // Box 192 door left
		bodyModel[183].setRotationPoint(5F, -20F, -11.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 193 door left
		bodyModel[184].setRotationPoint(-1F, -12F, -11.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 194 door left
		bodyModel[185].setRotationPoint(-8F, -5F, -11.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 195 door left
		bodyModel[186].setRotationPoint(-2F, -4F, -11.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 196 door left
		bodyModel[187].setRotationPoint(-5F, -3F, -11.5F);

		bodyModel[188].addBox(-4F, 0F, 0F, 4, 1, 0, 0F); // Box 197 door left
		bodyModel[188].setRotationPoint(-0.5F, -3F, -11.51F);
		bodyModel[188].rotateAngleZ = 2.04203522F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 198 door left
		bodyModel[189].setRotationPoint(-8F, 1F, -11.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		bodyModel[190].setRotationPoint(-10F, 3F, -11.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[191].setRotationPoint(-10F, -21F, -11.75F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 201
		bodyModel[192].setRotationPoint(32F, -11F, -10F);

		bodyModel[193].addBox(0F, 0F, 0F, 5, 6, 7, 0F); // Box 202
		bodyModel[193].setRotationPoint(36F, -6F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 203
		bodyModel[194].setRotationPoint(36F, 0F, 2F);

		bodyModel[195].addBox(0F, 0F, 0F, 8, 13, 4, 0F); // Box 204
		bodyModel[195].setRotationPoint(33F, -11F, -2F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Box 205
		bodyModel[196].setRotationPoint(37F, -22F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 5F, -1F, 0F); // Box 206
		bodyModel[197].setRotationPoint(37F, -14F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[198].setRotationPoint(33F, -14F, -2F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 8, 4, 0F); // Box 208
		bodyModel[199].setRotationPoint(38F, -22F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[200].setRotationPoint(-43F, 3F, 5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 210
		bodyModel[201].setRotationPoint(-43F, 4.5F, 5F);

		bodyModel[202].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[202].setRotationPoint(-47.5F, 4.5F, 0.5F);
		bodyModel[202].rotateAngleY = 1.04719755F;

		bodyModel[203].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 212
		bodyModel[203].setRotationPoint(-43F, 4.5F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[204].setRotationPoint(42F, 3F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 214
		bodyModel[205].setRotationPoint(43F, 4.5F, -10F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[206].setRotationPoint(43F, 4.5F, -11F);

		bodyModel[207].addBox(-9F, 0F, 0F, 9, 1, 0, 0F); // Box 216
		bodyModel[207].setRotationPoint(47.5F, 4.5F, -0.5F);
		bodyModel[207].rotateAngleY = 1.04719755F;
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		if(GetColor(entity)==6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.0,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.0,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}