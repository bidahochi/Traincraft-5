//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.09.2021 - 17:52:22
// Last changed on: 26.09.2021 - 17:52:22

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelW_A11_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelW_A55 extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelW_A55() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[164];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 240, 0, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 280, 0, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 208, 67, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 185, 66, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 173, 118, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 337, 118, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 337, 123, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 325, 25, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 173, 118, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 129, 27, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 137, 35, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 204
		bodyModel[18] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // headlightcaselow
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY,"lamp"); // bulb4
		bodyModel[20] = new ModelRendererTurbo(this, 497, 25, textureX, textureY,"lamp"); // numberboard2
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 204
		bodyModel[22] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // headlightcaselow
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY,"lamp"); // bulb4
		bodyModel[24] = new ModelRendererTurbo(this, 497, 25, textureX, textureY,"lamp"); // numberboard2
		bodyModel[25] = new ModelRendererTurbo(this, 238, 96, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 305, 55, textureX, textureY); // Box 59
		bodyModel[27] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 62
		bodyModel[28] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 374, 96, textureX, textureY); // Box 67
		bodyModel[32] = new ModelRendererTurbo(this, 84, 49, textureX, textureY); // Box 72
		bodyModel[33] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 94
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 95
		bodyModel[35] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 96
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[37] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 98
		bodyModel[38] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 99
		bodyModel[39] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 106 CULL
		bodyModel[40] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 121
		bodyModel[41] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 90
		bodyModel[43] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 91
		bodyModel[44] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 92
		bodyModel[45] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 93
		bodyModel[46] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 151
		bodyModel[47] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 151
		bodyModel[48] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 151
		bodyModel[49] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 105
		bodyModel[51] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 106
		bodyModel[52] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 107
		bodyModel[53] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 108
		bodyModel[54] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 110
		bodyModel[56] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 111
		bodyModel[57] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 112
		bodyModel[58] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 113
		bodyModel[59] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 115
		bodyModel[61] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 116
		bodyModel[62] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 117
		bodyModel[63] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 118
		bodyModel[64] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 119
		bodyModel[65] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 120
		bodyModel[66] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 121
		bodyModel[67] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 122
		bodyModel[68] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 123
		bodyModel[69] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 124
		bodyModel[70] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 125
		bodyModel[71] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 126
		bodyModel[72] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 127
		bodyModel[73] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 129
		bodyModel[75] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 130
		bodyModel[76] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 131
		bodyModel[77] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		bodyModel[78] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 133
		bodyModel[79] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 134
		bodyModel[80] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 135
		bodyModel[81] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 136
		bodyModel[82] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 137
		bodyModel[83] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 138
		bodyModel[84] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 141
		bodyModel[87] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 142
		bodyModel[88] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 143
		bodyModel[89] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 149
		bodyModel[90] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 150
		bodyModel[91] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 151
		bodyModel[92] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 152
		bodyModel[93] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 153
		bodyModel[94] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 154
		bodyModel[95] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 155
		bodyModel[96] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 166 CULL
		bodyModel[97] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 154
		bodyModel[98] = new ModelRendererTurbo(this, 124, 44, textureX, textureY); // Box 153
		bodyModel[99] = new ModelRendererTurbo(this, 124, 44, textureX, textureY); // Box 154
		bodyModel[100] = new ModelRendererTurbo(this, 224, 0, textureX, textureY); // Box 164
		bodyModel[101] = new ModelRendererTurbo(this, 296, 0, textureX, textureY); // Box 165
		bodyModel[102] = new ModelRendererTurbo(this, 213, 61, textureX, textureY); // Box 392
		bodyModel[103] = new ModelRendererTurbo(this, 14, 95, textureX, textureY,"cull"); // Box 158 CULL
		bodyModel[104] = new ModelRendererTurbo(this, 14, 76, textureX, textureY,"cull"); // Box 163 CULL
		bodyModel[105] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 154
		bodyModel[106] = new ModelRendererTurbo(this, 60, 95, textureX, textureY,"cull"); // Box 158 CULL
		bodyModel[107] = new ModelRendererTurbo(this, 37, 95, textureX, textureY,"cull"); // Box 163 CULL
		bodyModel[108] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 175 CULL
		bodyModel[109] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 176 CULL
		bodyModel[110] = new ModelRendererTurbo(this, 329, 74, textureX, textureY); // Box 181
		bodyModel[111] = new ModelRendererTurbo(this, 473, 63, textureX, textureY); // Box 187
		bodyModel[112] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 188
		bodyModel[113] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 189
		bodyModel[114] = new ModelRendererTurbo(this, 473, 63, textureX, textureY); // Box 190
		bodyModel[115] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 191
		bodyModel[116] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 192
		bodyModel[117] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 193
		bodyModel[118] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 194
		bodyModel[119] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 195
		bodyModel[120] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 196
		bodyModel[121] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 197
		bodyModel[122] = new ModelRendererTurbo(this, 449, 80, textureX, textureY); // Box 200
		bodyModel[123] = new ModelRendererTurbo(this, 436, 80, textureX, textureY); // Box 201
		bodyModel[124] = new ModelRendererTurbo(this, 436, 80, textureX, textureY); // Box 202
		bodyModel[125] = new ModelRendererTurbo(this, 449, 80, textureX, textureY); // Box 203
		bodyModel[126] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 204
		bodyModel[127] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 209
		bodyModel[128] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 210
		bodyModel[129] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 211
		bodyModel[130] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 212
		bodyModel[131] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 213
		bodyModel[132] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 214
		bodyModel[133] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 215
		bodyModel[134] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 220
		bodyModel[135] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 221
		bodyModel[136] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 222
		bodyModel[137] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 223
		bodyModel[138] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 231
		bodyModel[139] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 232
		bodyModel[140] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 233
		bodyModel[141] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 235
		bodyModel[142] = new ModelRendererTurbo(this, 0, 55, textureX, textureY,"cull"); // Box 156 CULL
		bodyModel[143] = new ModelRendererTurbo(this, 0, 55, textureX, textureY,"cull"); // Box 157 CULL
		bodyModel[144] = new ModelRendererTurbo(this, 0, 49, textureX, textureY,"cull"); // Box 158 CULL
		bodyModel[145] = new ModelRendererTurbo(this, 0, 49, textureX, textureY,"cull"); // Box 159 CULL
		bodyModel[146] = new ModelRendererTurbo(this, 0, 49, textureX, textureY,"cull"); // Box 160 CULL
		bodyModel[147] = new ModelRendererTurbo(this, 0, 49, textureX, textureY,"cull"); // Box 161 CULL
		bodyModel[148] = new ModelRendererTurbo(this, 0, 55, textureX, textureY,"cull"); // Box 162 CULL
		bodyModel[149] = new ModelRendererTurbo(this, 0, 55, textureX, textureY,"cull"); // Box 163 CULL
		bodyModel[150] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 106 CULL
		bodyModel[151] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 166 CULL
		bodyModel[152] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 175 CULL
		bodyModel[153] = new ModelRendererTurbo(this, 473, 37, textureX, textureY,"cull"); // Box 176 CULL
		bodyModel[154] = new ModelRendererTurbo(this, 305, 55, textureX, textureY); // Box 254
		bodyModel[155] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 255
		bodyModel[156] = new ModelRendererTurbo(this, 213, 61, textureX, textureY); // Box 311
		bodyModel[157] = new ModelRendererTurbo(this, 116, 101, textureX, textureY); // Box 312
		bodyModel[158] = new ModelRendererTurbo(this, 116, 101, textureX, textureY); // Box 314
		bodyModel[159] = new ModelRendererTurbo(this, 3, 119, textureX, textureY); // Box 315
		bodyModel[160] = new ModelRendererTurbo(this, 3, 119, textureX, textureY); // Box 316
		bodyModel[161] = new ModelRendererTurbo(this, 3, 119, textureX, textureY); // Box 318
		bodyModel[162] = new ModelRendererTurbo(this, 3, 119, textureX, textureY); // Box 319
		bodyModel[163] = new ModelRendererTurbo(this, 3, 119, textureX, textureY); // Box 320

		bodyModel[0].addBox(0F, 0F, 0F, 78, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39F, 3F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 18, 7, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 7
		bodyModel[1].setRotationPoint(-40F, -16F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(-41F, -16F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 18, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 9
		bodyModel[3].setRotationPoint(39F, -16F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(40F, -16F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(-41F, 2F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(-42F, 2F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 76, 4, 5, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[7].setRotationPoint(-38F, -20F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 74, 3, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-37F, -19F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 74, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-37F, -19F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[10].setRotationPoint(-38F, -20F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-41F, -20F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 76, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-38F, -20F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[13].setRotationPoint(38F, -20F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, -1.4F, -3.75F, 0F, 1F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1.4F, 3F, 0F, 1F, 3F, 0F); // Box 35
		bodyModel[14].setRotationPoint(38F, -20F, 4F);

		bodyModel[15].addShapeBox(-44F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[15].setRotationPoint(-13F, -22F, -0.5F);
		bodyModel[15].rotateAngleZ = -0.03490659F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(13F, -22F, -0.5F);
		bodyModel[16].rotateAngleZ = 0.38397244F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 204
		bodyModel[17].setRotationPoint(-44F, -2F, -1F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // headlightcaselow
		bodyModel[18].setRotationPoint(-44.25F, -5F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb4
		bodyModel[19].setRotationPoint(-44.26F, -4.5F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F); // numberboard2
		bodyModel[20].setRotationPoint(-44F, -4.5F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[21].setRotationPoint(41F, -2F, -1F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // headlightcaselow
		bodyModel[22].setRotationPoint(41.25F, -5F, -1.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // bulb4
		bodyModel[23].setRotationPoint(43.26F, -4.5F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, 0F, 0.8F); // numberboard2
		bodyModel[24].setRotationPoint(41F, -4.5F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 60, 20, 1, 0F); // Box 57
		bodyModel[25].setRotationPoint(-30F, -16F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 59
		bodyModel[26].setRotationPoint(30F, -14.05F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 62
		bodyModel[27].setRotationPoint(-41F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[28].setRotationPoint(39F, 2F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[29].setRotationPoint(39F, 2F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[30].setRotationPoint(39F, 2F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 60, 20, 1, 0F); // Box 67
		bodyModel[31].setRotationPoint(-30F, -16F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 72
		bodyModel[32].setRotationPoint(-9F, 4F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 94
		bodyModel[33].setRotationPoint(-42F, -3F, 3.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 95
		bodyModel[34].setRotationPoint(-42F, 0F, 4F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 96
		bodyModel[35].setRotationPoint(41F, -3F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[36].setRotationPoint(40F, 0F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[37].setRotationPoint(-41.5F, -18F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[38].setRotationPoint(40.5F, -18F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 106 CULL
		bodyModel[39].setRotationPoint(29F, -16F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[40].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[41].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[42].setRotationPoint(-40F, -4F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[43].setRotationPoint(-40F, -4F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 92
		bodyModel[44].setRotationPoint(-40F, -4F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[45].setRotationPoint(-39F, -4F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 151
		bodyModel[46].setRotationPoint(-36F, -3F, -8F);
		bodyModel[46].rotateAngleY = -0.78539816F;

		bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 151
		bodyModel[47].setRotationPoint(-39F, -5F, -5F);
		bodyModel[47].rotateAngleY = -0.78539816F;

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 151
		bodyModel[48].setRotationPoint(-35.25F, -4F, -8F);
		bodyModel[48].rotateAngleY = -0.78539816F;

		bodyModel[49].addBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F); // Box 151
		bodyModel[49].setRotationPoint(-37.5F, -6F, -5F);
		bodyModel[49].rotateAngleY = 4.29350996F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[50].setRotationPoint(39F, -4F, 4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[51].setRotationPoint(39F, -4F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[52].setRotationPoint(39F, -4F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[53].setRotationPoint(36F, -4F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 109
		bodyModel[54].setRotationPoint(33F, -3F, 6F);
		bodyModel[54].rotateAngleY = -0.78539816F;

		bodyModel[55].addBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F); // Box 110
		bodyModel[55].setRotationPoint(34.5F, -4F, 6F);
		bodyModel[55].rotateAngleY = 3.4906585F;

		bodyModel[56].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 111
		bodyModel[56].setRotationPoint(39F, -5F, 3F);
		bodyModel[56].rotateAngleY = 2.35619449F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[57].setRotationPoint(-12.5F, -6F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[58].setRotationPoint(-12.5F, -6F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[59].setRotationPoint(-15.5F, -1F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[60].setRotationPoint(-15.5F, -1F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[61].setRotationPoint(-21.5F, -6F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[62].setRotationPoint(-21.5F, -6F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[63].setRotationPoint(-24.5F, -1F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[64].setRotationPoint(-24.5F, -1F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[65].setRotationPoint(23.5F, -6F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[66].setRotationPoint(23.5F, -6F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[67].setRotationPoint(20.5F, -1F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[68].setRotationPoint(20.5F, -1F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[69].setRotationPoint(14.5F, -6F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[70].setRotationPoint(14.5F, -6F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[71].setRotationPoint(11.5F, -1F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[72].setRotationPoint(11.5F, -1F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(11.5F, 0F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[74].setRotationPoint(11.5F, 0F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[75].setRotationPoint(11.5F, 0F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[76].setRotationPoint(11.5F, 0F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[77].setRotationPoint(20.5F, 0F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[78].setRotationPoint(20.5F, 0F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[79].setRotationPoint(20.5F, 0F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[80].setRotationPoint(20.5F, 0F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[81].setRotationPoint(-24.5F, 0F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[82].setRotationPoint(-24.5F, 0F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[83].setRotationPoint(-24.5F, 0F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[84].setRotationPoint(-24.5F, 0F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[85].setRotationPoint(-15.5F, 0F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[86].setRotationPoint(-15.5F, 0F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[87].setRotationPoint(-15.5F, 0F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[88].setRotationPoint(-15.5F, 0F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,1F, -1F, 0F, -1.4F, -3.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -1.4F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 149
		bodyModel[89].setRotationPoint(38F, -20F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0F, -0.4F, -2.75F, 0F, -1F, -3F, 0F, 1F, 0F, -2F, 1F, 2F, 0F, -0.4F, 2F, 0F, -1F, 2F, 0F, 1F, 2F, 0F); // Box 150
		bodyModel[90].setRotationPoint(38F, -19F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, -2F, -1F, -3F, 0F, -0.4F, -2.75F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F, -0.4F, 2F, 0F, 1F, 2F, 0F); // Box 151
		bodyModel[91].setRotationPoint(38F, -19F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1.4F, -3.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, -1.4F, 3F, 0F); // Box 152
		bodyModel[92].setRotationPoint(-41F, -20F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1.4F, -3.75F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.4F, 3F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 153
		bodyModel[93].setRotationPoint(-41F, -20F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, -2.75F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, -3F, 0F, -0.4F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 154
		bodyModel[94].setRotationPoint(-40F, -19F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, -3F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, -0.4F, -2.75F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.4F, 2F, 0F); // Box 155
		bodyModel[95].setRotationPoint(-40F, -19F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, 1F, 0F, 0F, 1F); // Box 166 CULL
		bodyModel[96].setRotationPoint(29F, 0F, -12F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 0, 21, 0F); // Box 154
		bodyModel[97].setRotationPoint(38.55F, 9.5F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[98].setRotationPoint(11F, -22F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[99].setRotationPoint(-15F, -22F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 18, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 164
		bodyModel[100].setRotationPoint(-40F, -16F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 18, 7, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 165
		bodyModel[101].setRotationPoint(39F, -16F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 392
		bodyModel[102].setRotationPoint(-22F, 4F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 158 CULL
		bodyModel[103].setRotationPoint(38.55F, 4F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 2F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 163 CULL
		bodyModel[104].setRotationPoint(38.55F, 4F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 0, 21, 0F); // Box 154
		bodyModel[105].setRotationPoint(-41.55F, 9.5F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 2F, -2.5F, 0F); // Box 158 CULL
		bodyModel[106].setRotationPoint(-39.55F, 4F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 163 CULL
		bodyModel[107].setRotationPoint(-39.55F, 4F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 175 CULL
		bodyModel[108].setRotationPoint(29F, -16F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, 6F, 0F, -1F, 0F, 0F, -1F); // Box 176 CULL
		bodyModel[109].setRotationPoint(29F, 0F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 181
		bodyModel[110].setRotationPoint(-15F, -21F, -2F);

		bodyModel[111].addBox(-2F, 0F, 0F, 4, 20, 1, 0F); // Box 187
		bodyModel[111].setRotationPoint(37F, -16F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 188
		bodyModel[112].setRotationPoint(35F, -16F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 189
		bodyModel[113].setRotationPoint(30F, -14.05F, -11F);

		bodyModel[114].addBox(-2F, 0F, 0F, 4, 20, 1, 0F); // Box 190
		bodyModel[114].setRotationPoint(-37F, -16F, 10F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 191
		bodyModel[115].setRotationPoint(-39F, -16F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 20, 5, 0F); // Box 192
		bodyModel[116].setRotationPoint(-29.5F, -17F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 193
		bodyModel[117].setRotationPoint(-29.5F, -17F, -5F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 20, 5, 0F); // Box 194
		bodyModel[118].setRotationPoint(-29.5F, -17F, 5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 20, 5, 0F); // Box 195
		bodyModel[119].setRotationPoint(28.5F, -17F, 5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 196
		bodyModel[120].setRotationPoint(28.5F, -17F, -5F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 20, 5, 0F); // Box 197
		bodyModel[121].setRotationPoint(28.5F, -17F, -10F);

		bodyModel[122].addBox(-2F, 0F, 0F, 5, 2, 1, 0F); // Box 200
		bodyModel[122].setRotationPoint(-33F, -16F, 10F);

		bodyModel[123].addBox(-2F, 0F, 0F, 5, 2, 1, 0F); // Box 201
		bodyModel[123].setRotationPoint(-33F, -16F, -11F);

		bodyModel[124].addBox(-2F, 0F, 0F, 5, 2, 1, 0F); // Box 202
		bodyModel[124].setRotationPoint(32F, -16F, -11F);

		bodyModel[125].addBox(-2F, 0F, 0F, 5, 2, 1, 0F); // Box 203
		bodyModel[125].setRotationPoint(32F, -16F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[126].setRotationPoint(-6.5F, 0F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[127].setRotationPoint(-6.5F, 0F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[128].setRotationPoint(-6.5F, -1F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[129].setRotationPoint(-3.5F, -6F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[130].setRotationPoint(-6.5F, 0F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[131].setRotationPoint(-6.5F, -1F, 2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[132].setRotationPoint(-3.5F, -6F, 2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[133].setRotationPoint(-6.5F, 0F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[134].setRotationPoint(2.5F, 0F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[135].setRotationPoint(2.5F, -1F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[136].setRotationPoint(5.5F, -6F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[137].setRotationPoint(2.5F, 0F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[138].setRotationPoint(2.5F, 0F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[139].setRotationPoint(2.5F, -1F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[140].setRotationPoint(5.5F, -6F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[141].setRotationPoint(2.5F, 0F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156 CULL
		bodyModel[142].setRotationPoint(30F, 7.01F, -12F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157 CULL
		bodyModel[143].setRotationPoint(30F, 4.01F, -11.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158 CULL
		bodyModel[144].setRotationPoint(30F, 7.01F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159 CULL
		bodyModel[145].setRotationPoint(30F, 4.01F, 9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 CULL
		bodyModel[146].setRotationPoint(-35F, 7.01F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 CULL
		bodyModel[147].setRotationPoint(-35F, 4.01F, 9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 CULL
		bodyModel[148].setRotationPoint(-35F, 7.01F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 163 CULL
		bodyModel[149].setRotationPoint(-35F, 4.01F, -11.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 106 CULL
		bodyModel[150].setRotationPoint(-36F, -16F, -12F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, 1F, 0F, 0F, 1F); // Box 166 CULL
		bodyModel[151].setRotationPoint(-36F, 0F, -12F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 175 CULL
		bodyModel[152].setRotationPoint(-36F, -16F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, 6F, 0F, -1F, 0F, 0F, -1F); // Box 176 CULL
		bodyModel[153].setRotationPoint(-36F, 0F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 254
		bodyModel[154].setRotationPoint(-35F, -14.05F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 255
		bodyModel[155].setRotationPoint(-35F, -14.05F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 311
		bodyModel[156].setRotationPoint(19F, 4F, -1.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 312
		bodyModel[157].setRotationPoint(-36F, 4F, -6F);
		bodyModel[157].rotateAngleZ = -0.76794487F;

		bodyModel[158].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 314
		bodyModel[158].setRotationPoint(36F, 4F, -6F);
		bodyModel[158].rotateAngleZ = -0.76794487F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 78, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 315
		bodyModel[159].setRotationPoint(-39F, 4F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 316
		bodyModel[160].setRotationPoint(-22F, 4F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 318
		bodyModel[161].setRotationPoint(-22F, 4F, 3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 319
		bodyModel[162].setRotationPoint(19F, 4F, 3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 320
		bodyModel[163].setRotationPoint(19F, 4F, -10F);
	}
	ModelW_A11_Truck bogie1 = new ModelW_A11_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if(GetColor(entity)==12345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/W_A11_truck.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(1.275, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/W_A11_truck.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(1.275, -0.0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}