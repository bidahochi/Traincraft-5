//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.08.2025 - 10:15:04
// Last changed on: 08.08.2025 - 10:15:04

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSP_B50 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelSP_B50() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[200];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 15, 2, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 187, 77, textureX, textureY); // Box 10 frame of the boose
		bodyModel[3] = new ModelRendererTurbo(this, 348, 87, textureX, textureY); // Box 87
		bodyModel[4] = new ModelRendererTurbo(this, 363, 90, textureX, textureY); // Box 88
		bodyModel[5] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 88
		bodyModel[6] = new ModelRendererTurbo(this, 163, 74, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 163, 74, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 174, 76, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 191, 69, textureX, textureY); // Box cull steel skirt
		bodyModel[10] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box kbrake bits
		bodyModel[11] = new ModelRendererTurbo(this, 9, 48, textureX, textureY); // Box ab and k bits
		bodyModel[12] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box ab and k bits
		bodyModel[13] = new ModelRendererTurbo(this, 7, 49, textureX, textureY); // Box ab and k bits
		bodyModel[14] = new ModelRendererTurbo(this, 46, 6, textureX, textureY); // Box kbrake bits
		bodyModel[15] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box ab and k bits
		bodyModel[16] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Box ab and k bits
		bodyModel[17] = new ModelRendererTurbo(this, 80, 5, textureX, textureY); // Box ab and k bits
		bodyModel[18] = new ModelRendererTurbo(this, 150, 87, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 173, 84, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 334, 16, textureX, textureY); // Box 104
		bodyModel[22] = new ModelRendererTurbo(this, 112, 31, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[23] = new ModelRendererTurbo(this, 251, 25, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[24] = new ModelRendererTurbo(this, 251, 31, textureX, textureY); // Box 216
		bodyModel[25] = new ModelRendererTurbo(this, 193, 107, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 192, 63, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 192, 66, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 47, 86, textureX, textureY); // Box 55
		bodyModel[29] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 102
		bodyModel[30] = new ModelRendererTurbo(this, 395, 69, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[31] = new ModelRendererTurbo(this, 307, 42, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 297, 42, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 246, 107, textureX, textureY); // Box 50
		bodyModel[34] = new ModelRendererTurbo(this, 97, 107, textureX, textureY); // Box 51
		bodyModel[35] = new ModelRendererTurbo(this, 44, 107, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 340, 50, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 386, 31, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 351, 50, textureX, textureY); // Box 135
		bodyModel[41] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 136
		bodyModel[42] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 137
		bodyModel[43] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 138
		bodyModel[44] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 139
		bodyModel[45] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 140
		bodyModel[46] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 146
		bodyModel[47] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 147
		bodyModel[48] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 148
		bodyModel[49] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 153
		bodyModel[52] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 154
		bodyModel[53] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 155
		bodyModel[54] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 156
		bodyModel[55] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 157
		bodyModel[56] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 158
		bodyModel[57] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 159
		bodyModel[58] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 160
		bodyModel[59] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 161
		bodyModel[60] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 162
		bodyModel[61] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 163
		bodyModel[62] = new ModelRendererTurbo(this, 362, 50, textureX, textureY); // Box 164
		bodyModel[63] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 165
		bodyModel[64] = new ModelRendererTurbo(this, 340, 31, textureX, textureY); // Box 166
		bodyModel[65] = new ModelRendererTurbo(this, 372, 50, textureX, textureY); // Box 167
		bodyModel[66] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 168
		bodyModel[67] = new ModelRendererTurbo(this, 395, 69, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[68] = new ModelRendererTurbo(this, 395, 69, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[69] = new ModelRendererTurbo(this, 395, 69, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[70] = new ModelRendererTurbo(this, 351, 50, textureX, textureY); // Box 172
		bodyModel[71] = new ModelRendererTurbo(this, 386, 31, textureX, textureY); // Box 173
		bodyModel[72] = new ModelRendererTurbo(this, 340, 50, textureX, textureY); // Box 174
		bodyModel[73] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 175
		bodyModel[74] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 176
		bodyModel[75] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 177
		bodyModel[76] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 178
		bodyModel[77] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 179
		bodyModel[78] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 180
		bodyModel[79] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 181
		bodyModel[80] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 182
		bodyModel[81] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 183
		bodyModel[82] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 184
		bodyModel[83] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 185
		bodyModel[84] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 186
		bodyModel[85] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 187
		bodyModel[86] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 188
		bodyModel[87] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 189
		bodyModel[88] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 190
		bodyModel[89] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 191
		bodyModel[90] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 192
		bodyModel[91] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 193
		bodyModel[92] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 194
		bodyModel[93] = new ModelRendererTurbo(this, 329, 43, textureX, textureY); // Box 195
		bodyModel[94] = new ModelRendererTurbo(this, 363, 31, textureX, textureY); // Box 196
		bodyModel[95] = new ModelRendererTurbo(this, 329, 50, textureX, textureY); // Box 197
		bodyModel[96] = new ModelRendererTurbo(this, 329, 31, textureX, textureY); // Box 198
		bodyModel[97] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 199
		bodyModel[98] = new ModelRendererTurbo(this, 362, 50, textureX, textureY); // Box 200
		bodyModel[99] = new ModelRendererTurbo(this, 340, 31, textureX, textureY); // Box 201
		bodyModel[100] = new ModelRendererTurbo(this, 372, 50, textureX, textureY); // Box 202
		bodyModel[101] = new ModelRendererTurbo(this, 211, 38, textureX, textureY); // Box 70
		bodyModel[102] = new ModelRendererTurbo(this, 41, 65, textureX, textureY, "cull"); // Box cull trainline hoes
		bodyModel[103] = new ModelRendererTurbo(this, 27, 69, textureX, textureY, "cull"); // Box cull trainline hoes
		bodyModel[104] = new ModelRendererTurbo(this, 333, 90, textureX, textureY); // Box 209
		bodyModel[105] = new ModelRendererTurbo(this, 318, 93, textureX, textureY); // Box 210
		bodyModel[106] = new ModelRendererTurbo(this, 236, 41, textureX, textureY); // Box 221
		bodyModel[107] = new ModelRendererTurbo(this, 302, 42, textureX, textureY); // Box 226
		bodyModel[108] = new ModelRendererTurbo(this, 24, 86, textureX, textureY); // Box 242
		bodyModel[109] = new ModelRendererTurbo(this, 207, 41, textureX, textureY); // Box 243
		bodyModel[110] = new ModelRendererTurbo(this, 162, 38, textureX, textureY); // Box 244
		bodyModel[111] = new ModelRendererTurbo(this, 255, 41, textureX, textureY); // Box 245
		bodyModel[112] = new ModelRendererTurbo(this, 386, 65, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[113] = new ModelRendererTurbo(this, 191, 73, textureX, textureY); // Box 248
		bodyModel[114] = new ModelRendererTurbo(this, 283, 38, textureX, textureY); // Box 51
		bodyModel[115] = new ModelRendererTurbo(this, 260, 38, textureX, textureY); // Box 250
		bodyModel[116] = new ModelRendererTurbo(this, 348, 64, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[117] = new ModelRendererTurbo(this, 406, 75, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[118] = new ModelRendererTurbo(this, 377, 65, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[119] = new ModelRendererTurbo(this, 395, 75, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[120] = new ModelRendererTurbo(this, 368, 65, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[121] = new ModelRendererTurbo(this, 337, 64, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[122] = new ModelRendererTurbo(this, 359, 65, textureX, textureY, "cull"); // Box cull ladders
		bodyModel[123] = new ModelRendererTurbo(this, 453, 102, textureX, textureY); // Box 260
		bodyModel[124] = new ModelRendererTurbo(this, 14, 74, textureX, textureY, "cull"); // Box cull brake steppies
		bodyModel[125] = new ModelRendererTurbo(this, 415, 105, textureX, textureY); // Box 265
		bodyModel[126] = new ModelRendererTurbo(this, 336, 104, textureX, textureY); // Box 267
		bodyModel[127] = new ModelRendererTurbo(this, 299, 106, textureX, textureY); // Box 268
		bodyModel[128] = new ModelRendererTurbo(this, 9, 63, textureX, textureY); // Box 222
		bodyModel[129] = new ModelRendererTurbo(this, 75, 94, textureX, textureY, "cull"); // Box cull stoppers
		bodyModel[130] = new ModelRendererTurbo(this, 70, 94, textureX, textureY, "cull"); // Box cull stoppers
		bodyModel[131] = new ModelRendererTurbo(this, 80, 101, textureX, textureY, "cull"); // Box cull door catchers
		bodyModel[132] = new ModelRendererTurbo(this, 113, 2, textureX, textureY); // Box 275
		bodyModel[133] = new ModelRendererTurbo(this, 334, 3, textureX, textureY); // Box 276
		bodyModel[134] = new ModelRendererTurbo(this, 113, 13, textureX, textureY); // Box 277
		bodyModel[135] = new ModelRendererTurbo(this, 114, 24, textureX, textureY); // Box 278
		bodyModel[136] = new ModelRendererTurbo(this, 80, 104, textureX, textureY, "cull"); // Box cull door catchers
		bodyModel[137] = new ModelRendererTurbo(this, 428, 79, textureX, textureY, "cull"); // Box cull destboards
		bodyModel[138] = new ModelRendererTurbo(this, 417, 79, textureX, textureY, "cull"); // Box cull destboards
		bodyModel[139] = new ModelRendererTurbo(this, 81, 93, textureX, textureY, "cull"); // Box cull door rollers
		bodyModel[140] = new ModelRendererTurbo(this, 81, 97, textureX, textureY, "cull"); // Box cull door rollers
		bodyModel[141] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 223
		bodyModel[142] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 294
		bodyModel[143] = new ModelRendererTurbo(this, 60, 56, textureX, textureY); // Box ab brake bits
		bodyModel[144] = new ModelRendererTurbo(this, 43, 50, textureX, textureY); // Box ab brake bits
		bodyModel[145] = new ModelRendererTurbo(this, 28, 50, textureX, textureY); // Box ab brake bits
		bodyModel[146] = new ModelRendererTurbo(this, 42, 55, textureX, textureY); // Box ab brake bits
		bodyModel[147] = new ModelRendererTurbo(this, 63, 49, textureX, textureY, "cull"); // Box cull ab brake bits
		bodyModel[148] = new ModelRendererTurbo(this, 52, 50, textureX, textureY, "cull"); // Box cull ab brake holder
		bodyModel[149] = new ModelRendererTurbo(this, 22, 2, textureX, textureY); // Box ab brake bits
		bodyModel[150] = new ModelRendererTurbo(this, 46, 4, textureX, textureY); // Box kbrake bits
		bodyModel[151] = new ModelRendererTurbo(this, 51, 56, textureX, textureY, "cull"); // Box cull kbrake holder
		bodyModel[152] = new ModelRendererTurbo(this, 6, 64, textureX, textureY); // Box 308
		bodyModel[153] = new ModelRendererTurbo(this, 14, 68, textureX, textureY, "cull"); // Box cull brake steppies
		bodyModel[154] = new ModelRendererTurbo(this, 23, 67, textureX, textureY); // Box 310
		bodyModel[155] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 87
		bodyModel[156] = new ModelRendererTurbo(this, 18, 50, textureX, textureY); // Box 72
		bodyModel[157] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 189
		bodyModel[158] = new ModelRendererTurbo(this, 74, 3, textureX, textureY); // Box 314
		bodyModel[159] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 315
		bodyModel[160] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 316
		bodyModel[161] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 317
		bodyModel[162] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 318
		bodyModel[163] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 319
		bodyModel[164] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 320
		bodyModel[165] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 321
		bodyModel[166] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 322
		bodyModel[167] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 323
		bodyModel[168] = new ModelRendererTurbo(this, 44, 27, textureX, textureY); // Box 324
		bodyModel[169] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 325
		bodyModel[170] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 326
		bodyModel[171] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 327
		bodyModel[172] = new ModelRendererTurbo(this, 74, 3, textureX, textureY); // Box 328
		bodyModel[173] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 329
		bodyModel[174] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 330
		bodyModel[175] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 331
		bodyModel[176] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 332
		bodyModel[177] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 333
		bodyModel[178] = new ModelRendererTurbo(this, 86, 23, textureX, textureY); // Box 334
		bodyModel[179] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 335
		bodyModel[180] = new ModelRendererTurbo(this, 44, 27, textureX, textureY); // Box 336
		bodyModel[181] = new ModelRendererTurbo(this, 292, 42, textureX, textureY); // Box 195
		bodyModel[182] = new ModelRendererTurbo(this, 275, 42, textureX, textureY); // Box 196
		bodyModel[183] = new ModelRendererTurbo(this, 265, 42, textureX, textureY); // Box 197
		bodyModel[184] = new ModelRendererTurbo(this, 270, 42, textureX, textureY); // Box 198
		bodyModel[185] = new ModelRendererTurbo(this, 260, 42, textureX, textureY); // Box 199
		bodyModel[186] = new ModelRendererTurbo(this, 197, 42, textureX, textureY); // Box 200
		bodyModel[187] = new ModelRendererTurbo(this, 187, 42, textureX, textureY); // Box 201
		bodyModel[188] = new ModelRendererTurbo(this, 231, 42, textureX, textureY); // Box 202
		bodyModel[189] = new ModelRendererTurbo(this, 221, 42, textureX, textureY); // Box 203
		bodyModel[190] = new ModelRendererTurbo(this, 202, 42, textureX, textureY); // Box 204
		bodyModel[191] = new ModelRendererTurbo(this, 192, 42, textureX, textureY); // Box 205
		bodyModel[192] = new ModelRendererTurbo(this, 226, 42, textureX, textureY); // Box 206
		bodyModel[193] = new ModelRendererTurbo(this, 216, 42, textureX, textureY); // Box 207
		bodyModel[194] = new ModelRendererTurbo(this, 36, 8, textureX, textureY); // Box 196
		bodyModel[195] = new ModelRendererTurbo(this, 14, 8, textureX, textureY); // Box 197
		bodyModel[196] = new ModelRendererTurbo(this, 134, 39, textureX, textureY, "cull"); // Box cull walkway ends
		bodyModel[197] = new ModelRendererTurbo(this, 117, 37, textureX, textureY, "cull"); // Box cull walkway ends
		bodyModel[198] = new ModelRendererTurbo(this, 3, 14, textureX, textureY, "cull"); // Box cull
		bodyModel[199] = new ModelRendererTurbo(this, 1, 24, textureX, textureY, "cull"); // Box cull

		bodyModel[0].addBox(-3F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-32F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(32F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 64, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[2].setRotationPoint(-32F, 3F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 87
		bodyModel[3].setRotationPoint(-24.5F, 3F, 2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[4].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 88
		bodyModel[5].setRotationPoint(6F, 3F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-7F, 3F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 11
		bodyModel[7].setRotationPoint(6F, 3F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 12
		bodyModel[8].setRotationPoint(-7F, 3F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 62, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull steel skirt
		bodyModel[9].setRotationPoint(-31F, 3F, -10F);

		bodyModel[10].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box kbrake bits
		bodyModel[10].setRotationPoint(-2F, 6F, -3F);
		bodyModel[10].rotateAngleX = -0.78539816F;

		bodyModel[11].addBox(-0.5F, 0F, -4F, 1, 0, 7, 0F); // Box ab and k bits
		bodyModel[11].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[11].rotateAngleY = -0.52359878F;

		bodyModel[12].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box ab and k bits
		bodyModel[12].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[12].rotateAngleY = -0.52359878F;

		bodyModel[13].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box ab and k bits
		bodyModel[13].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[13].rotateAngleY = -0.26179939F;

		bodyModel[14].addBox(-0.5F, 0F, 0F, 16, 0, 1, 0F); // Box kbrake bits
		bodyModel[14].setRotationPoint(-22F, 8.01F, -0.5F);
		bodyModel[14].rotateAngleY = 0.13962634F;
		bodyModel[14].rotateAngleZ = 0.12217305F;

		bodyModel[15].addBox(0F, 0F, 0F, 19, 0, 8, 0F); // Box ab and k bits
		bodyModel[15].setRotationPoint(-10F, 6F, -3.5F);

		bodyModel[16].addBox(-1F, 0F, -1.5F, 15, 0, 1, 0F); // Box ab and k bits
		bodyModel[16].setRotationPoint(6F, 6.01F, -0.5F);
		bodyModel[16].rotateAngleY = 0.17453293F;
		bodyModel[16].rotateAngleZ = -0.12217305F;

		bodyModel[17].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box ab and k bits
		bodyModel[17].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[17].rotateAngleY = -0.26179939F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 23
		bodyModel[18].setRotationPoint(-31F, -17.5F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 24
		bodyModel[19].setRotationPoint(30F, -17.5F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 62, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-31F, 2F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 104
		bodyModel[21].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 65, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[22].setRotationPoint(-32.5F, -19F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[23].setRotationPoint(-32.5F, -18F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box 216
		bodyModel[24].setRotationPoint(31.5F, -18F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 25, 19, 1, 0F); // Box 31
		bodyModel[25].setRotationPoint(-30F, -16.5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[26].setRotationPoint(-31F, -17F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 34
		bodyModel[27].setRotationPoint(-31F, -17F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[28].setRotationPoint(-5F, -16F, -11.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[29].setRotationPoint(-5.5F, -16F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull ladders
		bodyModel[30].setRotationPoint(-30.75F, 3F, -9.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 45
		bodyModel[31].setRotationPoint(-24.5F, -16F, -10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 46
		bodyModel[32].setRotationPoint(-15F, -16F, -10.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 25, 19, 1, 0F); // Box 50
		bodyModel[33].setRotationPoint(5F, -16.5F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 25, 19, 1, 0F); // Box 51
		bodyModel[34].setRotationPoint(-30F, -16.5F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 25, 19, 1, 0F); // Box 63
		bodyModel[35].setRotationPoint(5F, -16.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-31.98F, -15.5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-31.98F, -15.5F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 49
		bodyModel[38].setRotationPoint(-31.98F, -13.75F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 108
		bodyModel[39].setRotationPoint(-31.98F, -13.75F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 135
		bodyModel[40].setRotationPoint(-31.98F, -15.5F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 136
		bodyModel[41].setRotationPoint(-31.98F, -13F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 137
		bodyModel[42].setRotationPoint(-31.98F, -13F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 138
		bodyModel[43].setRotationPoint(-31.98F, -13F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 139
		bodyModel[44].setRotationPoint(-31.98F, -11.25F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 140
		bodyModel[45].setRotationPoint(-31.98F, -11.25F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 146
		bodyModel[46].setRotationPoint(-31.98F, -10.5F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 147
		bodyModel[47].setRotationPoint(-31.98F, -10.5F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 148
		bodyModel[48].setRotationPoint(-31.98F, -10.5F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 151
		bodyModel[49].setRotationPoint(-31.98F, -2.5F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 152
		bodyModel[50].setRotationPoint(-31.98F, -2.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 153
		bodyModel[51].setRotationPoint(-31.98F, -3.25F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 154
		bodyModel[52].setRotationPoint(-31.98F, -5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 155
		bodyModel[53].setRotationPoint(-31.98F, -5.75F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 156
		bodyModel[54].setRotationPoint(-31.98F, -7.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 157
		bodyModel[55].setRotationPoint(-31.98F, -7.5F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 158
		bodyModel[56].setRotationPoint(-31.98F, -5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 159
		bodyModel[57].setRotationPoint(-31.98F, -5F, 5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 160
		bodyModel[58].setRotationPoint(-31.98F, -5.75F, 5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 161
		bodyModel[59].setRotationPoint(-31.98F, -7.5F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 162
		bodyModel[60].setRotationPoint(-31.98F, -3.25F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 163
		bodyModel[61].setRotationPoint(-31.98F, -2.5F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F); // Box 164
		bodyModel[62].setRotationPoint(-31.98F, 0F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F); // Box 165
		bodyModel[63].setRotationPoint(-31.98F, -0.75F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 166
		bodyModel[64].setRotationPoint(-31.98F, 0F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F); // Box 167
		bodyModel[65].setRotationPoint(-31.98F, 0F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[66].setRotationPoint(-31.98F, -0.75F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull ladders
		bodyModel[67].setRotationPoint(-30.75F, 3F, 8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull ladders
		bodyModel[68].setRotationPoint(27.75F, 3F, 8.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull ladders
		bodyModel[69].setRotationPoint(27.75F, 3F, -9.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 172
		bodyModel[70].setRotationPoint(30.98F, -15.5F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 173
		bodyModel[71].setRotationPoint(30.98F, -15.5F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 174
		bodyModel[72].setRotationPoint(30.98F, -15.5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[73].setRotationPoint(30.98F, -13.75F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 176
		bodyModel[74].setRotationPoint(30.98F, -13F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 177
		bodyModel[75].setRotationPoint(30.98F, -13F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 178
		bodyModel[76].setRotationPoint(30.98F, -13F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 179
		bodyModel[77].setRotationPoint(30.98F, -13.75F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 180
		bodyModel[78].setRotationPoint(30.98F, -11.25F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[79].setRotationPoint(30.98F, -11.25F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 182
		bodyModel[80].setRotationPoint(30.98F, -10.5F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 183
		bodyModel[81].setRotationPoint(30.98F, -10.5F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 184
		bodyModel[82].setRotationPoint(30.98F, -10.5F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 185
		bodyModel[83].setRotationPoint(30.98F, -7.5F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 186
		bodyModel[84].setRotationPoint(30.98F, -7.5F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 187
		bodyModel[85].setRotationPoint(30.98F, -7.5F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[86].setRotationPoint(30.98F, -5.75F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 189
		bodyModel[87].setRotationPoint(30.98F, -5.75F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 190
		bodyModel[88].setRotationPoint(30.98F, -5F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 191
		bodyModel[89].setRotationPoint(30.98F, -5F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 192
		bodyModel[90].setRotationPoint(30.98F, -5F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193
		bodyModel[91].setRotationPoint(30.98F, -3.25F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 194
		bodyModel[92].setRotationPoint(30.98F, -3.25F, 5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 195
		bodyModel[93].setRotationPoint(30.98F, -2.5F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 196
		bodyModel[94].setRotationPoint(30.98F, -2.5F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 197
		bodyModel[95].setRotationPoint(30.98F, -2.5F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		bodyModel[96].setRotationPoint(30.98F, -0.75F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 199
		bodyModel[97].setRotationPoint(30.98F, -0.75F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 200
		bodyModel[98].setRotationPoint(30.98F, 0F, 5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 201
		bodyModel[99].setRotationPoint(30.98F, 0F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.375F, 0F, 0F, -0.125F, 0F); // Box 202
		bodyModel[100].setRotationPoint(30.98F, 0F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 70
		bodyModel[101].setRotationPoint(-6F, -17F, -11.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0.5F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull trainline hoes
		bodyModel[102].setRotationPoint(-32.5F, 4.5F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull trainline hoes
		bodyModel[103].setRotationPoint(29.5F, 4.5F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 209
		bodyModel[104].setRotationPoint(21.5F, 3F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[105].setRotationPoint(21.5F, 3F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221
		bodyModel[106].setRotationPoint(5F, -16F, -10.5F);

		bodyModel[107].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 226
		bodyModel[107].setRotationPoint(-23.75F, -16F, -10.5F);
		bodyModel[107].rotateAngleZ = 0.40142573F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 242
		bodyModel[108].setRotationPoint(-5F, -16F, 10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 243
		bodyModel[109].setRotationPoint(4.5F, -16F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[110].setRotationPoint(-17F, -17F, 10.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 245
		bodyModel[111].setRotationPoint(-6F, -16F, 9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull ladders
		bodyModel[112].setRotationPoint(-30.5F, -16F, -10.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 62, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[113].setRotationPoint(-31F, 3F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[114].setRotationPoint(-5F, 2F, -10.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[115].setRotationPoint(-5F, 2F, 9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 19, 3, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box cull ladders
		bodyModel[116].setRotationPoint(-32F, -16F, 6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box cull ladders
		bodyModel[117].setRotationPoint(-32F, -5F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull ladders
		bodyModel[118].setRotationPoint(-30.5F, -16F, 9.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box cull ladders
		bodyModel[119].setRotationPoint(30F, -5F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull ladders
		bodyModel[120].setRotationPoint(27.5F, -16F, 9.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 19, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box cull ladders
		bodyModel[121].setRotationPoint(30F, -16F, -9.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box cull ladders
		bodyModel[122].setRotationPoint(27.5F, -16F, -10.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 1, 20, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 260
		bodyModel[123].setRotationPoint(-30.25F, -4F, -10.01F);
		bodyModel[123].rotateAngleZ = -0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, -0.5F, 0F); // Box cull brake steppies
		bodyModel[124].setRotationPoint(-33.5F, -14F, 2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 265
		bodyModel[125].setRotationPoint(-31F, -11.75F, -10.01F);
		bodyModel[125].rotateAngleZ = 0.65449847F;

		bodyModel[126].addShapeBox(-9F, 0F, 0F, 9, 1, 20, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, -0.25F, 0F, 0.02F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, -0.25F, 0F, 0.02F); // Box 267
		bodyModel[126].setRotationPoint(30.25F, -4F, -10.01F);
		bodyModel[126].rotateAngleZ = 0.78539816F;

		bodyModel[127].addShapeBox(-8F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 268
		bodyModel[127].setRotationPoint(31F, -11.75F, -10.01F);
		bodyModel[127].rotateAngleZ = -0.65449847F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 222
		bodyModel[128].setRotationPoint(-32.5F, -20.5F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull stoppers
		bodyModel[129].setRotationPoint(14.25F, -14F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box cull stoppers
		bodyModel[130].setRotationPoint(-15.25F, -14F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull door catchers
		bodyModel[131].setRotationPoint(-4.5F, 3F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 63, 2, 8, 0F,0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[132].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 63, 2, 10, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 276
		bodyModel[133].setRotationPoint(-31.5F, -19F, 0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 63, 2, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 277
		bodyModel[134].setRotationPoint(-31.5F, -19F, 2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 63, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[135].setRotationPoint(-31.5F, -18.5F, -2.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull door catchers
		bodyModel[136].setRotationPoint(-13.5F, 3F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboards
		bodyModel[137].setRotationPoint(-31.75F, -9.75F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull destboards
		bodyModel[138].setRotationPoint(30.75F, -10F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box cull door rollers
		bodyModel[139].setRotationPoint(-4F, -17F, -11.3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull door rollers
		bodyModel[140].setRotationPoint(-4F, -17F, 10.3F);

		bodyModel[141].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[141].setRotationPoint(-32F, -20F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[142].setRotationPoint(-32F, 3.5F, 3.5F);

		bodyModel[143].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box ab brake bits
		bodyModel[143].setRotationPoint(-4F, 6F, 4F);
		bodyModel[143].rotateAngleX = -0.78539816F;

		bodyModel[144].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box ab brake bits
		bodyModel[144].setRotationPoint(-6F, 6F, 4F);
		bodyModel[144].rotateAngleX = -0.78539816F;

		bodyModel[145].addShapeBox(0F, -1F, -1F, 5, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box ab brake bits
		bodyModel[145].setRotationPoint(7.5F, 5.5F, -6.5F);
		bodyModel[145].rotateAngleX = -0.78539816F;

		bodyModel[146].addShapeBox(0F, -1F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box ab brake bits
		bodyModel[146].setRotationPoint(7.5F, 4F, 7.5F);

		bodyModel[147].addShapeBox(0F, -1F, -1F, 3, 3, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box cull ab brake bits
		bodyModel[147].setRotationPoint(-4.5F, 4F, 4F);

		bodyModel[148].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box cull ab brake holder
		bodyModel[148].setRotationPoint(8.5F, 4F, -6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box ab brake bits
		bodyModel[149].setRotationPoint(8.5F, 5.5F, -6.5F);

		bodyModel[150].addBox(-0.5F, 0F, 0F, 14, 0, 1, 0F); // Box kbrake bits
		bodyModel[150].setRotationPoint(-22F, 8.01F, -0.5F);
		bodyModel[150].rotateAngleY = -0.19198622F;
		bodyModel[150].rotateAngleZ = 0.15707963F;

		bodyModel[151].addShapeBox(0F, -1F, -1F, 3, 3, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box cull kbrake holder
		bodyModel[151].setRotationPoint(-1.5F, 4F, -2.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 20, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 308
		bodyModel[152].setRotationPoint(-32.5F, -15.5F, 3.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, -0.5F, 0F); // Box cull brake steppies
		bodyModel[153].setRotationPoint(-33.5F, -10F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 310
		bodyModel[154].setRotationPoint(-32F, -17F, 2.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[155].setRotationPoint(-33F, -16.5F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[156].setRotationPoint(-33.01F, -18F, 1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[157].setRotationPoint(-32F, -16F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 314
		bodyModel[158].setRotationPoint(-32F, -14.5F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 315
		bodyModel[159].setRotationPoint(-32F, -11.5F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 316
		bodyModel[160].setRotationPoint(-32F, -13F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 317
		bodyModel[161].setRotationPoint(-32F, -10F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 318
		bodyModel[162].setRotationPoint(-32F, -1.5F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 319
		bodyModel[163].setRotationPoint(-32F, -3F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 320
		bodyModel[164].setRotationPoint(-32F, -4.5F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 321
		bodyModel[165].setRotationPoint(-32F, -6F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 322
		bodyModel[166].setRotationPoint(-32F, -7.5F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 323
		bodyModel[167].setRotationPoint(-32F, 0F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 324
		bodyModel[168].setRotationPoint(-32F, 1.5F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 325
		bodyModel[169].setRotationPoint(31F, -10F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 326
		bodyModel[170].setRotationPoint(31F, -11.5F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 327
		bodyModel[171].setRotationPoint(31F, -13F, -9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 328
		bodyModel[172].setRotationPoint(31F, -14.5F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 329
		bodyModel[173].setRotationPoint(31F, -16F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 330
		bodyModel[174].setRotationPoint(31F, -7.5F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 331
		bodyModel[175].setRotationPoint(31F, -4.5F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 332
		bodyModel[176].setRotationPoint(31F, -6F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 333
		bodyModel[177].setRotationPoint(31F, -3F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 334
		bodyModel[178].setRotationPoint(31F, -1.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 335
		bodyModel[179].setRotationPoint(31F, 0F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 336
		bodyModel[180].setRotationPoint(31F, 1.5F, -9F);

		bodyModel[181].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 195
		bodyModel[181].setRotationPoint(-14.25F, -16F, -10.5F);
		bodyModel[181].rotateAngleZ = 0.40142573F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[182].setRotationPoint(-24.5F, -16F, 9.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[183].setRotationPoint(-15F, -16F, 9.5F);

		bodyModel[184].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 198
		bodyModel[184].setRotationPoint(-23.75F, -16F, 9.5F);
		bodyModel[184].rotateAngleZ = 0.40142573F;

		bodyModel[185].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 199
		bodyModel[185].setRotationPoint(-14.25F, -16F, 9.5F);
		bodyModel[185].rotateAngleZ = 0.40142573F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 200
		bodyModel[186].setRotationPoint(14F, -16F, 9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 201
		bodyModel[187].setRotationPoint(23.5F, -16F, 9.5F);

		bodyModel[188].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 202
		bodyModel[188].setRotationPoint(14.25F, -16F, -10.5F);
		bodyModel[188].rotateAngleZ = -0.40142573F;

		bodyModel[189].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1.25F, -0.5F, 0F, 1.25F, -0.5F); // Box 203
		bodyModel[189].setRotationPoint(23.75F, -16F, -10.5F);
		bodyModel[189].rotateAngleZ = -0.40142573F;

		bodyModel[190].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 204
		bodyModel[190].setRotationPoint(14.25F, -16F, 9.5F);
		bodyModel[190].rotateAngleZ = -0.40142573F;

		bodyModel[191].addShapeBox(-0.25F, 1F, 0F, 1, 19, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.5F, -0.5F, 1.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 205
		bodyModel[191].setRotationPoint(23.75F, -16F, 9.5F);
		bodyModel[191].rotateAngleZ = -0.40142573F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F); // Box 206
		bodyModel[192].setRotationPoint(14F, -16F, -10.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F); // Box 207
		bodyModel[193].setRotationPoint(23.5F, -16F, -10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Box 196
		bodyModel[194].setRotationPoint(-32.5F, 2F, 0F);
		bodyModel[194].rotateAngleY = -0.13962634F;

		bodyModel[195].addBox(0F, 0F, -10F, 0, 3, 10, 0F); // Box 197
		bodyModel[195].setRotationPoint(32.5F, 2F, 0F);
		bodyModel[195].rotateAngleY = -0.13962634F;

		bodyModel[196].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box cull walkway ends
		bodyModel[196].setRotationPoint(-30.5F, -19F, 2F);
		bodyModel[196].rotateAngleX = -0.10471976F;

		bodyModel[197].addBox(0F, 0F, -8F, 4, 1, 8, 0F); // Box cull walkway ends
		bodyModel[197].setRotationPoint(26.5F, -19F, -2F);
		bodyModel[197].rotateAngleX = 0.10471976F;

		bodyModel[198].addShapeBox(-3F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[198].setRotationPoint(-28F, 3F, -4F);

		bodyModel[199].addShapeBox(-3F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[199].setRotationPoint(33F, 3F, -4F);
	}
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 200; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.45,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.87,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}