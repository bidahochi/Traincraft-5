//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.06.2023 - 12:47:51
// Last changed on: 28.06.2023 - 12:47:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelWPShops600Series extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelWPShops600Series() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[239];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 15, 2, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 110, 40, textureX, textureY); // Box 10 frame of the boose
		bodyModel[3] = new ModelRendererTurbo(this, 121, 50, textureX, textureY); // Box 73
		bodyModel[4] = new ModelRendererTurbo(this, 107, 47, textureX, textureY); // Box 73
		bodyModel[5] = new ModelRendererTurbo(this, 197, 47, textureX, textureY); // Box 194
		bodyModel[6] = new ModelRendererTurbo(this, 211, 50, textureX, textureY); // Box 195
		bodyModel[7] = new ModelRendererTurbo(this, 93, 26, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 104, 20, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 231, 26, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 83, 16, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 18, 50, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 19, 44, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 24, 44, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 24, 48, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 27, 60, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 28, 54, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 28, 49, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 18, 70, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 19, 64, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 24, 64, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 27, 80, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 29, 67, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 73, 14, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 27, 106, textureX, textureY, "cull"); // Box 55 cull
		bodyModel[29] = new ModelRendererTurbo(this, 14, 106, textureX, textureY); // Box 1
		bodyModel[30] = new ModelRendererTurbo(this, 3, 86, textureX, textureY); // Box 56
		bodyModel[31] = new ModelRendererTurbo(this, 40, 107, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 102, 73, textureX, textureY); // Box 104
		bodyModel[33] = new ModelRendererTurbo(this, 102, 60, textureX, textureY); // Box 105
		bodyModel[34] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 71, 67, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 87, 52, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 80, 67, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 70, 54, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 80, 64, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 277, 85, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 266, 85, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 258, 71, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 266, 82, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 277, 82, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 28, 74, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 28, 69, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 29, 71, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 29, 76, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 556
		bodyModel[52] = new ModelRendererTurbo(this, 52, 74, textureX, textureY); // Box 557
		bodyModel[53] = new ModelRendererTurbo(this, 46, 75, textureX, textureY); // Box 558
		bodyModel[54] = new ModelRendererTurbo(this, 58, 76, textureX, textureY); // Box 559
		bodyModel[55] = new ModelRendererTurbo(this, 122, 16, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 122, 18, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 147, 50, textureX, textureY); // Box 154
		bodyModel[58] = new ModelRendererTurbo(this, 72, 32, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 135, 48, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 178, 50, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 72, 32, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 160, 106, textureX, textureY); // Box 105
		bodyModel[66] = new ModelRendererTurbo(this, 147, 106, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 134, 106, textureX, textureY); // Box 107
		bodyModel[68] = new ModelRendererTurbo(this, 136, 86, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 18, 50, textureX, textureY); // Box 109
		bodyModel[70] = new ModelRendererTurbo(this, 29, 51, textureX, textureY); // Box 110
		bodyModel[71] = new ModelRendererTurbo(this, 28, 49, textureX, textureY); // Box 111
		bodyModel[72] = new ModelRendererTurbo(this, 28, 54, textureX, textureY); // Box 112
		bodyModel[73] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 113
		bodyModel[74] = new ModelRendererTurbo(this, 27, 60, textureX, textureY); // Box 114
		bodyModel[75] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 115
		bodyModel[76] = new ModelRendererTurbo(this, 19, 44, textureX, textureY); // Box 116
		bodyModel[77] = new ModelRendererTurbo(this, 24, 44, textureX, textureY); // Box 117
		bodyModel[78] = new ModelRendererTurbo(this, 24, 48, textureX, textureY); // Box 118
		bodyModel[79] = new ModelRendererTurbo(this, 73, 23, textureX, textureY); // Box 119
		bodyModel[80] = new ModelRendererTurbo(this, 63, 21, textureX, textureY); // Box 120
		bodyModel[81] = new ModelRendererTurbo(this, 19, 64, textureX, textureY); // Box 121
		bodyModel[82] = new ModelRendererTurbo(this, 24, 64, textureX, textureY); // Box 122
		bodyModel[83] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 123
		bodyModel[84] = new ModelRendererTurbo(this, 28, 69, textureX, textureY); // Box 124
		bodyModel[85] = new ModelRendererTurbo(this, 29, 67, textureX, textureY); // Box 125
		bodyModel[86] = new ModelRendererTurbo(this, 29, 71, textureX, textureY); // Box 126
		bodyModel[87] = new ModelRendererTurbo(this, 28, 74, textureX, textureY); // Box 127
		bodyModel[88] = new ModelRendererTurbo(this, 29, 76, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 27, 80, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 18, 70, textureX, textureY); // Box 130
		bodyModel[91] = new ModelRendererTurbo(this, 394, 81, textureX, textureY); // Box 524 chimney
		bodyModel[92] = new ModelRendererTurbo(this, 394, 76, textureX, textureY); // Box 132 chimney
		bodyModel[93] = new ModelRendererTurbo(this, 393, 84, textureX, textureY); // Box 133 chimney
		bodyModel[94] = new ModelRendererTurbo(this, 392, 72, textureX, textureY); // Box 240 chimney
		bodyModel[95] = new ModelRendererTurbo(this, 232, 6, textureX, textureY); // Box 135
		bodyModel[96] = new ModelRendererTurbo(this, 373, 26, textureX, textureY); // Box 88
		bodyModel[97] = new ModelRendererTurbo(this, 87, 107, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 373, 26, textureX, textureY); // Box 145
		bodyModel[99] = new ModelRendererTurbo(this, 383, 26, textureX, textureY); // Box 147
		bodyModel[100] = new ModelRendererTurbo(this, 388, 26, textureX, textureY); // Box 148
		bodyModel[101] = new ModelRendererTurbo(this, 396, 26, textureX, textureY); // Box 152
		bodyModel[102] = new ModelRendererTurbo(this, 107, 10, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[103] = new ModelRendererTurbo(this, 383, 26, textureX, textureY); // Box 165
		bodyModel[104] = new ModelRendererTurbo(this, 378, 26, textureX, textureY); // Box 166
		bodyModel[105] = new ModelRendererTurbo(this, 388, 26, textureX, textureY); // Box 167
		bodyModel[106] = new ModelRendererTurbo(this, 378, 26, textureX, textureY); // Box 169
		bodyModel[107] = new ModelRendererTurbo(this, 393, 26, textureX, textureY); // Box 180
		bodyModel[108] = new ModelRendererTurbo(this, 220, 107, textureX, textureY); // Box 142
		bodyModel[109] = new ModelRendererTurbo(this, 173, 107, textureX, textureY); // Box 143
		bodyModel[110] = new ModelRendererTurbo(this, 197, 102, textureX, textureY); // Box 144
		bodyModel[111] = new ModelRendererTurbo(this, 253, 87, textureX, textureY); // Box 147
		bodyModel[112] = new ModelRendererTurbo(this, 221, 87, textureX, textureY); // Box 148
		bodyModel[113] = new ModelRendererTurbo(this, 202, 87, textureX, textureY); // Box 149
		bodyModel[114] = new ModelRendererTurbo(this, 232, 91, textureX, textureY); // Box 150
		bodyModel[115] = new ModelRendererTurbo(this, 230, 87, textureX, textureY); // Box 151
		bodyModel[116] = new ModelRendererTurbo(this, 278, 53, textureX, textureY); // Box 152
		bodyModel[117] = new ModelRendererTurbo(this, 273, 53, textureX, textureY); // Box 153
		bodyModel[118] = new ModelRendererTurbo(this, 64, 102, textureX, textureY); // Box 154
		bodyModel[119] = new ModelRendererTurbo(this, 87, 87, textureX, textureY); // Box 155
		bodyModel[120] = new ModelRendererTurbo(this, 119, 87, textureX, textureY); // Box 156
		bodyModel[121] = new ModelRendererTurbo(this, 126, 87, textureX, textureY); // Box 157
		bodyModel[122] = new ModelRendererTurbo(this, 98, 91, textureX, textureY); // Box 158
		bodyModel[123] = new ModelRendererTurbo(this, 95, 87, textureX, textureY); // Box 159
		bodyModel[124] = new ModelRendererTurbo(this, 283, 53, textureX, textureY); // Box 160
		bodyModel[125] = new ModelRendererTurbo(this, 288, 53, textureX, textureY); // Box 161
		bodyModel[126] = new ModelRendererTurbo(this, 477, 46, textureX, textureY); // Box 316
		bodyModel[127] = new ModelRendererTurbo(this, 462, 26, textureX, textureY); // Box 166 handrail
		bodyModel[128] = new ModelRendererTurbo(this, 469, 46, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 222
		bodyModel[130] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 223
		bodyModel[131] = new ModelRendererTurbo(this, 458, 35, textureX, textureY); // Box 167 handrail
		bodyModel[132] = new ModelRendererTurbo(this, 477, 33, textureX, textureY); // Box 168
		bodyModel[133] = new ModelRendererTurbo(this, 469, 33, textureX, textureY); // Box 169
		bodyModel[134] = new ModelRendererTurbo(this, 289, 104, textureX, textureY); // Box 170
		bodyModel[135] = new ModelRendererTurbo(this, 318, 119, textureX, textureY, "cull"); // Box 171 cull ladder top
		bodyModel[136] = new ModelRendererTurbo(this, 298, 113, textureX, textureY, "cull"); // Box 173 cull ladder top
		bodyModel[137] = new ModelRendererTurbo(this, 280, 104, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 311, 115, textureX, textureY, "cull"); // Box 175
		bodyModel[139] = new ModelRendererTurbo(this, 298, 107, textureX, textureY, "cull"); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 477, 3, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 462, -4, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 469, 3, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 378, 4, textureX, textureY); // Box 180
		bodyModel[144] = new ModelRendererTurbo(this, 378, 4, textureX, textureY); // Box 181
		bodyModel[145] = new ModelRendererTurbo(this, 388, 4, textureX, textureY); // Box 182
		bodyModel[146] = new ModelRendererTurbo(this, 383, 4, textureX, textureY); // Box 183
		bodyModel[147] = new ModelRendererTurbo(this, 396, 4, textureX, textureY); // Box 184
		bodyModel[148] = new ModelRendererTurbo(this, 388, 4, textureX, textureY); // Box 185
		bodyModel[149] = new ModelRendererTurbo(this, 373, 4, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 383, 4, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 373, 4, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 393, 4, textureX, textureY); // Box 189
		bodyModel[153] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 190
		bodyModel[154] = new ModelRendererTurbo(this, 52, 74, textureX, textureY); // Box 191
		bodyModel[155] = new ModelRendererTurbo(this, 46, 75, textureX, textureY); // Box 192
		bodyModel[156] = new ModelRendererTurbo(this, 58, 76, textureX, textureY); // Box 193
		bodyModel[157] = new ModelRendererTurbo(this, 46, 73, textureX, textureY); // Box 194
		bodyModel[158] = new ModelRendererTurbo(this, 55, 74, textureX, textureY); // Box 195
		bodyModel[159] = new ModelRendererTurbo(this, 49, 75, textureX, textureY); // Box 196
		bodyModel[160] = new ModelRendererTurbo(this, 58, 74, textureX, textureY); // Box 197
		bodyModel[161] = new ModelRendererTurbo(this, 49, 75, textureX, textureY); // Box 198
		bodyModel[162] = new ModelRendererTurbo(this, 55, 74, textureX, textureY); // Box 199
		bodyModel[163] = new ModelRendererTurbo(this, 58, 74, textureX, textureY); // Box 200
		bodyModel[164] = new ModelRendererTurbo(this, 46, 73, textureX, textureY); // Box 201
		bodyModel[165] = new ModelRendererTurbo(this, 477, 16, textureX, textureY); // Box 202
		bodyModel[166] = new ModelRendererTurbo(this, 469, 16, textureX, textureY); // Box 203
		bodyModel[167] = new ModelRendererTurbo(this, 458, 5, textureX, textureY); // Box 204
		bodyModel[168] = new ModelRendererTurbo(this, 400, 85, textureX, textureY); // Import Box106
		bodyModel[169] = new ModelRendererTurbo(this, 416, 47, textureX, textureY, "cull"); // Box 207 cull partition
		bodyModel[170] = new ModelRendererTurbo(this, 293, 47, textureX, textureY); // Box 209
		bodyModel[171] = new ModelRendererTurbo(this, 388, 51, textureX, textureY); // Box 210
		bodyModel[172] = new ModelRendererTurbo(this, 377, 51, textureX, textureY); // Box 211
		bodyModel[173] = new ModelRendererTurbo(this, 335, 47, textureX, textureY, "cull"); // Box 213 cull partition
		bodyModel[174] = new ModelRendererTurbo(this, 348, 47, textureX, textureY); // Box 214
		bodyModel[175] = new ModelRendererTurbo(this, 362, 92, textureX, textureY, "cull"); // Box 54 cull
		bodyModel[176] = new ModelRendererTurbo(this, 357, 84, textureX, textureY); // Box 54
		bodyModel[177] = new ModelRendererTurbo(this, 343, 111, textureX, textureY); // Box 217
		bodyModel[178] = new ModelRendererTurbo(this, 361, 104, textureX, textureY); // Box 218
		bodyModel[179] = new ModelRendererTurbo(this, 359, 97, textureX, textureY); // Box 221
		bodyModel[180] = new ModelRendererTurbo(this, 403, 47, textureX, textureY); // Box 222
		bodyModel[181] = new ModelRendererTurbo(this, 308, 47, textureX, textureY); // Box 223
		bodyModel[182] = new ModelRendererTurbo(this, 362, 79, textureX, textureY, "cull"); // Box 224  cull
		bodyModel[183] = new ModelRendererTurbo(this, 357, 71, textureX, textureY); // Box 225
		bodyModel[184] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Box 226
		bodyModel[185] = new ModelRendererTurbo(this, 329, 79, textureX, textureY); // Box 227
		bodyModel[186] = new ModelRendererTurbo(this, 291, 71, textureX, textureY); // Box 228
		bodyModel[187] = new ModelRendererTurbo(this, 296, 79, textureX, textureY); // Box 229
		bodyModel[188] = new ModelRendererTurbo(this, 372, 112, textureX, textureY); // Box 230
		bodyModel[189] = new ModelRendererTurbo(this, 356, 104, textureX, textureY); // Box 231
		bodyModel[190] = new ModelRendererTurbo(this, 366, 104, textureX, textureY); // Box 232
		bodyModel[191] = new ModelRendererTurbo(this, 286, 84, textureX, textureY, "cull"); // chair cullNoName
		bodyModel[192] = new ModelRendererTurbo(this, 289, 90, textureX, textureY, "cull"); // chair cull
		bodyModel[193] = new ModelRendererTurbo(this, 303, 84, textureX, textureY); // Box 238
		bodyModel[194] = new ModelRendererTurbo(this, 306, 90, textureX, textureY); // Box 239
		bodyModel[195] = new ModelRendererTurbo(this, 307, 99, textureX, textureY); // Box 240
		bodyModel[196] = new ModelRendererTurbo(this, 324, 99, textureX, textureY); // Box 241
		bodyModel[197] = new ModelRendererTurbo(this, 320, 84, textureX, textureY); // Box 242
		bodyModel[198] = new ModelRendererTurbo(this, 323, 90, textureX, textureY); // Box 243
		bodyModel[199] = new ModelRendererTurbo(this, 341, 96, textureX, textureY); // Box 244
		bodyModel[200] = new ModelRendererTurbo(this, 337, 84, textureX, textureY); // Box 245
		bodyModel[201] = new ModelRendererTurbo(this, 340, 90, textureX, textureY); // Box 246
		bodyModel[202] = new ModelRendererTurbo(this, 290, 99, textureX, textureY); // Box 247
		bodyModel[203] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 286
		bodyModel[204] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 287
		bodyModel[205] = new ModelRendererTurbo(this, -2, 38, textureX, textureY); // Box 196
		bodyModel[206] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 198
		bodyModel[207] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 199
		bodyModel[208] = new ModelRendererTurbo(this, -3, 38, textureX, textureY); // Box 201
		bodyModel[209] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 202
		bodyModel[210] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 203
		bodyModel[211] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 204
		bodyModel[212] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 200
		bodyModel[213] = new ModelRendererTurbo(this, 107, 17, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[214] = new ModelRendererTurbo(this, 100, 19, textureX, textureY, "cull"); // Box 216
		bodyModel[215] = new ModelRendererTurbo(this, 70, 11, textureX, textureY); // Box 217
		bodyModel[216] = new ModelRendererTurbo(this, 75, 11, textureX, textureY); // Box 218
		bodyModel[217] = new ModelRendererTurbo(this, 70, 11, textureX, textureY); // Box 219
		bodyModel[218] = new ModelRendererTurbo(this, 75, 11, textureX, textureY); // Box 220
		bodyModel[219] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 401 gyra glow
		bodyModel[220] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 400 sp E gyra box
		bodyModel[221] = new ModelRendererTurbo(this, 128, 1, textureX, textureY); // Box 221
		bodyModel[222] = new ModelRendererTurbo(this, 137, 1, textureX, textureY, "lamp"); // Box 222 gyra glow
		bodyModel[223] = new ModelRendererTurbo(this, 394, 111, textureX, textureY); // Box 300
		bodyModel[224] = new ModelRendererTurbo(this, 448, 111, textureX, textureY); // Box 224
		bodyModel[225] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 225
		bodyModel[226] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 226
		bodyModel[227] = new ModelRendererTurbo(this, 154, 1, textureX, textureY); // Box 373 get yo long ass antennae out of the caption
		bodyModel[228] = new ModelRendererTurbo(this, 160, 6, textureX, textureY); // Box 373
		bodyModel[229] = new ModelRendererTurbo(this, 157, 6, textureX, textureY); // Box 373
		bodyModel[230] = new ModelRendererTurbo(this, 79, 73, textureX, textureY); // Box 153
		bodyModel[231] = new ModelRendererTurbo(this, 159, 51, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[232] = new ModelRendererTurbo(this, 164, 51, textureX, textureY); // Box 170
		bodyModel[233] = new ModelRendererTurbo(this, 159, 51, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[234] = new ModelRendererTurbo(this, 164, 51, textureX, textureY); // Box 172
		bodyModel[235] = new ModelRendererTurbo(this, 159, 51, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[236] = new ModelRendererTurbo(this, 164, 51, textureX, textureY); // Box 174
		bodyModel[237] = new ModelRendererTurbo(this, 159, 51, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[238] = new ModelRendererTurbo(this, 164, 51, textureX, textureY); // Box 176

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-34F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(31F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 62, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[2].setRotationPoint(-31F, 3F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[3].setRotationPoint(-19.5F, 3F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[4].setRotationPoint(-19.5F, 3F, 2F);

		bodyModel[5].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[5].setRotationPoint(19.5F, 3F, -9F);

		bodyModel[6].addShapeBox(-3F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[6].setRotationPoint(19.5F, 3F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 10
		bodyModel[7].setRotationPoint(-31F, 2F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 54, 1, 18, 0F); // Box 11
		bodyModel[8].setRotationPoint(-27F, 2F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 12
		bodyModel[9].setRotationPoint(27F, 2F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-32F, 2F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[11].setRotationPoint(-27F, 3F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[12].setRotationPoint(-31F, 3F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-31F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-31F, 6F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-31F, 8F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-31F, 5.5F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(-31F, 3.5F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-31F, 2.5F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-31F, 3.5F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-31F, 5.5F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-27F, 3F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[22].setRotationPoint(-31F, 3F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-31F, 3F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(-31F, 6F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(-31F, 8F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-31F, 2.5F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-32F, 2F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 55 cull
		bodyModel[28].setRotationPoint(-27F, -13F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		bodyModel[29].setRotationPoint(-27F, -13F, -2.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 56
		bodyModel[30].setRotationPoint(-27F, -16F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 42
		bodyModel[31].setRotationPoint(-27F, -16F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		bodyModel[32].setRotationPoint(-31.5F, -18F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 105
		bodyModel[33].setRotationPoint(-31.5F, -18F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(-30F, -15F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[35].setRotationPoint(-30F, -15F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-31F, -15.5F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-31F, -16F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[38].setRotationPoint(-31F, -15.5F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(-31F, -16F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(-27F, -13F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[41].setRotationPoint(27F, -15F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[42].setRotationPoint(27F, -15.5F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[43].setRotationPoint(27F, -16F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 64
		bodyModel[44].setRotationPoint(27F, -15.5F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[45].setRotationPoint(27F, -16F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[46].setRotationPoint(27F, -15F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 67
		bodyModel[47].setRotationPoint(-31F, 5.5F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[48].setRotationPoint(-31F, 3.5F, 5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[49].setRotationPoint(-31F, 3.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[50].setRotationPoint(-31F, 5.5F, 7.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 556
		bodyModel[51].setRotationPoint(-22F, 3F, -9.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 557
		bodyModel[52].setRotationPoint(-27F, -6F, -9.01F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 558
		bodyModel[53].setRotationPoint(-27F, -2F, -9.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 559
		bodyModel[54].setRotationPoint(-25F, 3F, -9.01F);

		bodyModel[55].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 75
		bodyModel[55].setRotationPoint(-27F, 3F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 54, 1, 0, 0F); // Box 76
		bodyModel[56].setRotationPoint(-27F, 3F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 154
		bodyModel[57].setRotationPoint(-11F, 3F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[58].setRotationPoint(4F, 3F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[59].setRotationPoint(-5F, 3F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[60].setRotationPoint(-11F, 3F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 91
		bodyModel[61].setRotationPoint(9F, 3F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[62].setRotationPoint(9F, 3F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[63].setRotationPoint(-24F, 3F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[64].setRotationPoint(23F, 3F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[65].setRotationPoint(26F, -13F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[66].setRotationPoint(26F, -13F, -2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 107
		bodyModel[67].setRotationPoint(26F, -13F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 108
		bodyModel[68].setRotationPoint(26F, -16F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 109
		bodyModel[69].setRotationPoint(27F, 3F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[70].setRotationPoint(27F, 3.5F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[71].setRotationPoint(27F, 3.5F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[72].setRotationPoint(27F, 5.5F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[73].setRotationPoint(27F, 5.5F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[74].setRotationPoint(27F, 8F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[75].setRotationPoint(27F, 2.5F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[76].setRotationPoint(31F, 3F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[77].setRotationPoint(31F, 3F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[78].setRotationPoint(31F, 6F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[79].setRotationPoint(31F, 2F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[80].setRotationPoint(31F, 2F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[81].setRotationPoint(31F, 3F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[82].setRotationPoint(31F, 3F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[83].setRotationPoint(31F, 6F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[84].setRotationPoint(27F, 3.5F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[85].setRotationPoint(27F, 2.5F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[86].setRotationPoint(27F, 3.5F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 127
		bodyModel[87].setRotationPoint(27F, 5.5F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[88].setRotationPoint(27F, 5.5F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[89].setRotationPoint(27F, 8F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[90].setRotationPoint(27F, 3F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 524 chimney
		bodyModel[91].setRotationPoint(6.5F, -18F, -6.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 132 chimney
		bodyModel[92].setRotationPoint(6.5F, -21F, -6.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133 chimney
		bodyModel[93].setRotationPoint(6.5F, -17F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 240 chimney
		bodyModel[94].setRotationPoint(6.25F, -21.5F, -6.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 135
		bodyModel[95].setRotationPoint(-26F, -16F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[96].setRotationPoint(-18.75F, -16F, -9.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 143
		bodyModel[97].setRotationPoint(5F, -16F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[98].setRotationPoint(-11.5F, -16F, -9.5F);

		bodyModel[99].addShapeBox(-0.5F, 0.25F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 147
		bodyModel[99].setRotationPoint(-4.75F, -16F, -9.5F);
		bodyModel[99].rotateAngleZ = -0.27925268F;

		bodyModel[100].addShapeBox(-0.25F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 148
		bodyModel[100].setRotationPoint(5F, -16F, -9.5F);
		bodyModel[100].rotateAngleZ = 0.27925268F;

		bodyModel[101].addShapeBox(-0.5F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[101].setRotationPoint(-26.5F, -16F, -9.02F);
		bodyModel[101].rotateAngleZ = 0.34906585F;

		bodyModel[102].addBox(0F, 0F, 0F, 65, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[102].setRotationPoint(-32.5F, -18F, -2F);

		bodyModel[103].addShapeBox(-0.5F, 0.25F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 165
		bodyModel[103].setRotationPoint(-11.75F, -16F, -9.5F);
		bodyModel[103].rotateAngleZ = -0.27925268F;

		bodyModel[104].addShapeBox(-0.5F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 166
		bodyModel[104].setRotationPoint(11.5F, -16F, -9.5F);

		bodyModel[105].addShapeBox(-0.25F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 167
		bodyModel[105].setRotationPoint(12F, -16F, -9.5F);
		bodyModel[105].rotateAngleZ = 0.27925268F;

		bodyModel[106].addShapeBox(-0.5F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[106].setRotationPoint(18.75F, -16F, -9.5F);

		bodyModel[107].addShapeBox(-0.5F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[107].setRotationPoint(26.5F, -16F, -9.02F);
		bodyModel[107].rotateAngleZ = -0.34906585F;

		bodyModel[108].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 142
		bodyModel[108].setRotationPoint(-27F, -16F, 8F);

		bodyModel[109].addBox(0F, 0F, 0F, 22, 18, 1, 0F); // Box 143
		bodyModel[109].setRotationPoint(5F, -16F, 8F);

		bodyModel[110].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Box 144
		bodyModel[110].setRotationPoint(-5F, -16F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 147
		bodyModel[111].setRotationPoint(-5.5F, -12F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[112].setRotationPoint(4.5F, -12F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[113].setRotationPoint(-4.5F, 2F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[114].setRotationPoint(-4.5F, -12F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 151
		bodyModel[115].setRotationPoint(-5.5F, -13F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[116].setRotationPoint(-5F, -13F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[117].setRotationPoint(4F, -13F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Box 154
		bodyModel[118].setRotationPoint(-5F, -16F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[119].setRotationPoint(-5.5F, -12F, -13F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[120].setRotationPoint(4.5F, -12F, -13F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[121].setRotationPoint(-4.5F, 2F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		bodyModel[122].setRotationPoint(-4.5F, -12F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[123].setRotationPoint(-5.5F, -13F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[124].setRotationPoint(-5F, -13F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[125].setRotationPoint(4F, -13F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 316
		bodyModel[126].setRotationPoint(-31F, -6F, -7F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 8, 14, 0F); // Box 166 handrail
		bodyModel[127].setRotationPoint(-31F, -6F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 164
		bodyModel[128].setRotationPoint(-31F, -6F, 4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 222
		bodyModel[129].setRotationPoint(-32F, -6.5F, 3F);

		bodyModel[130].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[130].setRotationPoint(-31.5F, -6F, 3F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 167 handrail
		bodyModel[131].setRotationPoint(-27.01F, -6F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 168
		bodyModel[132].setRotationPoint(-27.01F, -6F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 169
		bodyModel[133].setRotationPoint(-27.01F, -6F, 6F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 19, 4, 0F); // Box 170
		bodyModel[134].setRotationPoint(-31.51F, -17F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171 cull ladder top
		bodyModel[135].setRotationPoint(-31.51F, -20F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.5F, 4.7F, 0F, 0.5F, 4.7F, 0F, 0F, 0.2F, 0F); // Box 173 cull ladder top
		bodyModel[136].setRotationPoint(-30.51F, -21F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 19, 4, 0F); // Box 174
		bodyModel[137].setRotationPoint(31.51F, -17F, 3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 175
		bodyModel[138].setRotationPoint(30.51F, -20F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.5F, 0F, 0.5F, 4.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 4.7F, 0F); // Box 176
		bodyModel[139].setRotationPoint(26.51F, -21F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 177
		bodyModel[140].setRotationPoint(31F, -6F, 4F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 8, 14, 0F); // Box 178
		bodyModel[141].setRotationPoint(31F, -6F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 179
		bodyModel[142].setRotationPoint(31F, -6F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[143].setRotationPoint(-18.75F, -16F, 8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[144].setRotationPoint(-11.5F, -16F, 8.5F);

		bodyModel[145].addShapeBox(-0.5F, 0.25F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		bodyModel[145].setRotationPoint(-4.75F, -16F, 8.5F);
		bodyModel[145].rotateAngleZ = -0.27925268F;

		bodyModel[146].addShapeBox(-0.25F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 183
		bodyModel[146].setRotationPoint(5F, -16F, 8.5F);
		bodyModel[146].rotateAngleZ = 0.27925268F;

		bodyModel[147].addShapeBox(-0.5F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[147].setRotationPoint(-26.5F, -16F, 9.02F);
		bodyModel[147].rotateAngleZ = 0.34906585F;

		bodyModel[148].addShapeBox(-0.5F, 0.25F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185
		bodyModel[148].setRotationPoint(-11.75F, -16F, 8.5F);
		bodyModel[148].rotateAngleZ = -0.27925268F;

		bodyModel[149].addShapeBox(-0.5F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[149].setRotationPoint(11.5F, -16F, 8.5F);

		bodyModel[150].addShapeBox(-0.25F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 187
		bodyModel[150].setRotationPoint(12F, -16F, 8.5F);
		bodyModel[150].rotateAngleZ = 0.27925268F;

		bodyModel[151].addShapeBox(-0.5F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[151].setRotationPoint(18.75F, -16F, 8.5F);

		bodyModel[152].addShapeBox(-0.5F, 0F, 0F, 1, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[152].setRotationPoint(26.5F, -16F, 9.02F);
		bodyModel[152].rotateAngleZ = -0.34906585F;

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 190
		bodyModel[153].setRotationPoint(-22F, 3F, 9.01F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 191
		bodyModel[154].setRotationPoint(-27F, -6F, 9.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 192
		bodyModel[155].setRotationPoint(-27F, -2F, 9.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 193
		bodyModel[156].setRotationPoint(-25F, 3F, 9.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 194
		bodyModel[157].setRotationPoint(21F, 3F, -9.01F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 195
		bodyModel[158].setRotationPoint(26F, -6F, -9.01F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 196
		bodyModel[159].setRotationPoint(26F, -2F, -9.01F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[160].setRotationPoint(22F, 3F, -9.01F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 198
		bodyModel[161].setRotationPoint(26F, -2F, 9.01F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 199
		bodyModel[162].setRotationPoint(26F, -6F, 9.01F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[163].setRotationPoint(22F, 3F, 9.01F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 201
		bodyModel[164].setRotationPoint(21F, 3F, 9.01F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 202
		bodyModel[165].setRotationPoint(27.01F, -6F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 203
		bodyModel[166].setRotationPoint(27.01F, -6F, -9F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 204
		bodyModel[167].setRotationPoint(27.01F, -6F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[168].setRotationPoint(6F, -6F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 cull partition
		bodyModel[169].setRotationPoint(4.5F, -15F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[170].setRotationPoint(-26F, -15F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[171].setRotationPoint(-24F, -15F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[172].setRotationPoint(-18F, -15F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213 cull partition
		bodyModel[173].setRotationPoint(-5.5F, -15F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 9, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[174].setRotationPoint(-13.5F, -15F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54 cull
		bodyModel[175].setRotationPoint(-26F, -1F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[176].setRotationPoint(-26F, -2F, 2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[177].setRotationPoint(-16F, -7F, 4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[178].setRotationPoint(-16F, -6F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[179].setRotationPoint(-15F, -5F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[180].setRotationPoint(11.5F, -15F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[181].setRotationPoint(4.5F, -15F, 3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 224  cull
		bodyModel[182].setRotationPoint(-26F, -15F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[183].setRotationPoint(-26F, -12F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[184].setRotationPoint(16F, -12F, -8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 227
		bodyModel[185].setRotationPoint(16F, -15F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[186].setRotationPoint(16F, -2F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[187].setRotationPoint(16F, -1F, -4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[188].setRotationPoint(21F, -5F, 3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[189].setRotationPoint(21F, -6F, 2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[190].setRotationPoint(22F, -7F, 2.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // chair cullNoName
		bodyModel[191].setRotationPoint(17F, -2F, 3.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // chair cull
		bodyModel[192].setRotationPoint(17F, -6F, 3.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[193].setRotationPoint(-2F, -2F, 5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[194].setRotationPoint(-2F, -6F, 5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[195].setRotationPoint(-1F, -1F, 6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[196].setRotationPoint(-1F, -1F, -8.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[197].setRotationPoint(-2F, -2F, -9.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[198].setRotationPoint(1F, -6F, -9.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[199].setRotationPoint(-13.5F, -1F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[200].setRotationPoint(-14.5F, -2F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[201].setRotationPoint(-14.5F, -6F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[202].setRotationPoint(18F, -1F, 4.5F);

		bodyModel[203].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[203].setRotationPoint(-3F, 6F, -2F);
		bodyModel[203].rotateAngleX = -0.78539816F;

		bodyModel[204].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[204].setRotationPoint(0F, 6F, -2F);
		bodyModel[204].rotateAngleX = -0.78539816F;

		bodyModel[205].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[205].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[205].rotateAngleY = -0.52359878F;

		bodyModel[206].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[206].setRotationPoint(-9.5F, 6F, -2.5F);

		bodyModel[207].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[207].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[207].rotateAngleY = -0.52359878F;

		bodyModel[208].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[208].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[208].rotateAngleY = -0.26179939F;

		bodyModel[209].addBox(-0.5F, 0F, 0F, 13, 0, 1, 0F); // Box 202
		bodyModel[209].setRotationPoint(-19F, 7.01F, -0.5F);
		bodyModel[209].rotateAngleY = 0.17453293F;
		bodyModel[209].rotateAngleZ = 0.08726646F;

		bodyModel[210].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[210].setRotationPoint(-8F, 6F, 0F);

		bodyModel[211].addBox(-1F, 0F, -1.5F, 13, 0, 1, 0F); // Box 204
		bodyModel[211].setRotationPoint(6F, 6.01F, -0.5F);
		bodyModel[211].rotateAngleY = 0.17453293F;
		bodyModel[211].rotateAngleZ = -0.05235988F;

		bodyModel[212].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[212].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[212].rotateAngleY = -0.26179939F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[213].setRotationPoint(-32.5F, -17F, -2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box 216
		bodyModel[214].setRotationPoint(31.5F, -17F, -2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[215].setRotationPoint(-31.75F, -6F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[216].setRotationPoint(-31.75F, -6F, 2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[217].setRotationPoint(30.75F, -6F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[218].setRotationPoint(30.75F, -6F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 gyra glow
		bodyModel[219].setRotationPoint(-33.1F, -16.5F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 sp E gyra box
		bodyModel[220].setRotationPoint(-33F, -16.5F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 221
		bodyModel[221].setRotationPoint(31F, -16.5F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 222 gyra glow
		bodyModel[222].setRotationPoint(32.1F, -16.5F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 26, 16, 0, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -13F, -8F, 0F, -13F, -8F, 0F, 0F, -8F, 0F); // Box 300
		bodyModel[223].setRotationPoint(-19F, -13F, -9.51F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 26, 16, 0, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -13F, -8F, 0F); // Box 224
		bodyModel[224].setRotationPoint(-7F, -13F, 9.51F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 225
		bodyModel[225].setRotationPoint(31F, -6.5F, -4F);

		bodyModel[226].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 226
		bodyModel[226].setRotationPoint(33.5F, -6F, -2F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 373 get yo long ass antennae out of the caption
		bodyModel[227].setRotationPoint(12F, -23.5F, 6F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[228].setRotationPoint(-12.25F, -19F, 5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[229].setRotationPoint(-12.25F, -19F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[230].setRotationPoint(-10.5F, 4F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[231].setRotationPoint(-27.25F, -14F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[232].setRotationPoint(-26.75F, -14F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[233].setRotationPoint(-27.25F, -14F, 9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[234].setRotationPoint(-26.75F, -14F, 9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[235].setRotationPoint(26.25F, -14F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[236].setRotationPoint(26.75F, -14F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[237].setRotationPoint(26.25F, -14F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[238].setRotationPoint(26.75F, -14F, -10F);
	}
	ModelCabooseTruck2 theTrucks2 = new ModelCabooseTruck2();
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1467|| GetColor(entity) == 1567){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver_generator.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
		}
			GL11.glPushMatrix();
			GL11.glScalef(1,1,1f);
			GL11.glTranslated(-1.15,-0.0,-0.0);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.15,-0.0,0.00);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
	}
}