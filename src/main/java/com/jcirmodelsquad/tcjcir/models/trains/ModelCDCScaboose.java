//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hi Cube 60'
// Model Creator: 
// Created on: 21.01.2019 - 11:01:10
// Last changed on: 21.01.2019 - 11:01:10

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruck_Small;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelCDCScaboose extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCDCScaboose() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[178];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 23, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 72, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 56, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 128, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 128, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 9, 132, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 16, 132, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 16, 132, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 9, 132, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 39, 135, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 39, 135, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 46, 18, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 23, 18, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 48, 188, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 2, 38, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 64, 181, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 64, 181, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 11, 208, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 3, 186, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 18, 195, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 9, 195, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 15, 171, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 0, 184, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 15, 179, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 27, 194, textureX, textureY,"cull"); // Box 62 STACK CULL
		bodyModel[49] = new ModelRendererTurbo(this, 21, 201, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 21, 201, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 68
		bodyModel[55] = new ModelRendererTurbo(this, 28, 171, textureX, textureY,"cull"); // Box 69 CULL
		bodyModel[56] = new ModelRendererTurbo(this, 43, 171, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 33, 185, textureX, textureY,"cull"); // Box 72 CULL
		bodyModel[59] = new ModelRendererTurbo(this, 43, 179, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 152, -5, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 145, 5, textureX, textureY); // Box 75
		bodyModel[62] = new ModelRendererTurbo(this, 66, 45, textureX, textureY); // Box 76
		bodyModel[63] = new ModelRendererTurbo(this, 66, 81, textureX, textureY); // Box 77
		bodyModel[64] = new ModelRendererTurbo(this, 66, 36, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 66, 55, textureX, textureY); // Box 79
		bodyModel[66] = new ModelRendererTurbo(this, 66, 72, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 66, 91, textureX, textureY); // Box 81
		bodyModel[68] = new ModelRendererTurbo(this, 66, 64, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 66, 68, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 101, 85, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 99, 75, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 99, 64, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 145, 5, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 176, 14, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 176, 14, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 154, 29, textureX, textureY,"cull"); // Box 81 CULL
		bodyModel[77] = new ModelRendererTurbo(this, 142, 35, textureX, textureY,"cull"); // Box 82 CULL
		bodyModel[78] = new ModelRendererTurbo(this, 142, 35, textureX, textureY,"cull"); // Box 84 CULL
		bodyModel[79] = new ModelRendererTurbo(this, 142, 35, textureX, textureY,"cull"); // Box 86 CULL
		bodyModel[80] = new ModelRendererTurbo(this, 145, 43, textureX, textureY,"cull"); // Box 88 CULL
		bodyModel[81] = new ModelRendererTurbo(this, 170, 35, textureX, textureY,"cull"); // Box 89CULL
		bodyModel[82] = new ModelRendererTurbo(this, 145, 43, textureX, textureY,"cull"); // Box 90CULL
		bodyModel[83] = new ModelRendererTurbo(this, 145, 43, textureX, textureY,"cull"); // Box 91CULL
		bodyModel[84] = new ModelRendererTurbo(this, 151, 49, textureX, textureY,"cull"); // Box 92 CULL
		bodyModel[85] = new ModelRendererTurbo(this, 152, 54, textureX, textureY,"cull"); // Box 94 CULL
		bodyModel[86] = new ModelRendererTurbo(this, 151, 49, textureX, textureY,"cull"); // Box 96 CULL
		bodyModel[87] = new ModelRendererTurbo(this, 152, 54, textureX, textureY,"cull"); // Box 97 CULL
		bodyModel[88] = new ModelRendererTurbo(this, 151, 49, textureX, textureY,"cull"); // Box 98 CULL
		bodyModel[89] = new ModelRendererTurbo(this, 151, 49, textureX, textureY,"cull"); // Box 99 CULL
		bodyModel[90] = new ModelRendererTurbo(this, 154, 25, textureX, textureY,"cull"); // Box 100 CULL
		bodyModel[91] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 101
		bodyModel[92] = new ModelRendererTurbo(this, 31, 96, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 31, 96, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 104
		bodyModel[95] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 105
		bodyModel[96] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 107
		bodyModel[98] = new ModelRendererTurbo(this, 31, 96, textureX, textureY); // Box 108
		bodyModel[99] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 109
		bodyModel[100] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 110
		bodyModel[101] = new ModelRendererTurbo(this, 31, 96, textureX, textureY); // Box 111
		bodyModel[102] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 112
		bodyModel[103] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 154, 25, textureX, textureY,"cull"); // Box 114 CULL
		bodyModel[105] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 147
		bodyModel[106] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 148
		bodyModel[107] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 149
		bodyModel[108] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 150
		bodyModel[109] = new ModelRendererTurbo(this, 127, 11, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 130, 6, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 130, 13, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 127, 11, textureX, textureY); // Box 119
		bodyModel[117] = new ModelRendererTurbo(this, 130, 6, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 130, 13, textureX, textureY); // Box 121
		bodyModel[119] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 124
		bodyModel[122] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 125
		bodyModel[123] = new ModelRendererTurbo(this, 127, 11, textureX, textureY); // Box 126
		bodyModel[124] = new ModelRendererTurbo(this, 130, 6, textureX, textureY); // Box 127
		bodyModel[125] = new ModelRendererTurbo(this, 130, 13, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 129
		bodyModel[127] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 122, 12, textureX, textureY); // Box 131
		bodyModel[129] = new ModelRendererTurbo(this, 122, 15, textureX, textureY); // Box 132
		bodyModel[130] = new ModelRendererTurbo(this, 127, 11, textureX, textureY); // Box 133
		bodyModel[131] = new ModelRendererTurbo(this, 130, 6, textureX, textureY); // Box 134
		bodyModel[132] = new ModelRendererTurbo(this, 130, 13, textureX, textureY); // Box 135
		bodyModel[133] = new ModelRendererTurbo(this, 155, 35, textureX, textureY,"cull"); // Box 136 CULL
		bodyModel[134] = new ModelRendererTurbo(this, 155, 17, textureX, textureY,"cull"); // Box 137 walkway grab CULL
		bodyModel[135] = new ModelRendererTurbo(this, 155, 35, textureX, textureY,"cull"); // Box 138 CULL
		bodyModel[136] = new ModelRendererTurbo(this, 155, 9, textureX, textureY,"cull"); // Box 139 CULL
		bodyModel[137] = new ModelRendererTurbo(this, 167, 0, textureX, textureY,"cull"); // Box 140 cupola grab CULL
		bodyModel[138] = new ModelRendererTurbo(this, 170, 7, textureX, textureY,"cull"); // Box 141 cupola grab CULL
		bodyModel[139] = new ModelRendererTurbo(this, 0, 144, textureX, textureY); // Box 51
		bodyModel[140] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 53
		bodyModel[141] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 55
		bodyModel[142] = new ModelRendererTurbo(this, 36, 132, textureX, textureY); // Box 199
		bodyModel[143] = new ModelRendererTurbo(this, 36, 138, textureX, textureY); // Box 200
		bodyModel[144] = new ModelRendererTurbo(this, 36, 138, textureX, textureY); // Box 201
		bodyModel[145] = new ModelRendererTurbo(this, 36, 140, textureX, textureY,"cull"); // Box 202 cull
		bodyModel[146] = new ModelRendererTurbo(this, 65, 140, textureX, textureY,"cull"); // Box 204 CULL
		bodyModel[147] = new ModelRendererTurbo(this, 0, 65, textureX, textureY,"cull"); // Box 156 CULL
		bodyModel[148] = new ModelRendererTurbo(this, 0, 65, textureX, textureY,"cull"); // Box 157 CULL
		bodyModel[149] = new ModelRendererTurbo(this, 0, 71, textureX, textureY,"cull"); // Box 158 CULL
		bodyModel[150] = new ModelRendererTurbo(this, 0, 71, textureX, textureY,"cull"); // Box 159 CULL
		bodyModel[151] = new ModelRendererTurbo(this, 0, 71, textureX, textureY,"cull"); // Box 160 CULL
		bodyModel[152] = new ModelRendererTurbo(this, 0, 71, textureX, textureY,"cull"); // Box 161 CULL
		bodyModel[153] = new ModelRendererTurbo(this, 0, 65, textureX, textureY,"cull"); // Box 162 CULL
		bodyModel[154] = new ModelRendererTurbo(this, 0, 65, textureX, textureY,"cull"); // Box 163 CULL
		bodyModel[155] = new ModelRendererTurbo(this, 122, 4, textureX, textureY); // Box 164
		bodyModel[156] = new ModelRendererTurbo(this, 122, 4, textureX, textureY); // Box 165
		bodyModel[157] = new ModelRendererTurbo(this, 122, 4, textureX, textureY); // Box 166
		bodyModel[158] = new ModelRendererTurbo(this, 122, 4, textureX, textureY); // Box 167
		bodyModel[159] = new ModelRendererTurbo(this, 176, 14, textureX, textureY); // Box 169
		bodyModel[160] = new ModelRendererTurbo(this, 176, 14, textureX, textureY); // Box 170
		bodyModel[161] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 168
		bodyModel[165] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 170
		bodyModel[166] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 171
		bodyModel[167] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 172
		bodyModel[168] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 173
		bodyModel[169] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 174
		bodyModel[170] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 175
		bodyModel[171] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 176
		bodyModel[172] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 177
		bodyModel[173] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 178
		bodyModel[174] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 179
		bodyModel[175] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 180
		bodyModel[176] = new ModelRendererTurbo(this, 122, 0, textureX, textureY); // Box 181
		bodyModel[177] = new ModelRendererTurbo(this, 152, -5, textureX, textureY); // Box 182

		bodyModel[0].addBox(0F, 0F, 0F, 56, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 48, 16, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-24F, -15F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16F, -22F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-16F, -22F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 56, 1, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(-28F, 2F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 56, 1, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(-28F, 2F, 1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-8F, 2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-20.5F, 2F, 2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 9
		bodyModel[8].setRotationPoint(-20.5F, 2F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 11
		bodyModel[9].setRotationPoint(-20F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[10].setRotationPoint(17.5F, 2F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 13
		bodyModel[11].setRotationPoint(17.5F, 2F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 14
		bodyModel[12].setRotationPoint(18F, 4F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(17.5F, 2F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(-20.5F, 2F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 22
		bodyModel[15].setRotationPoint(6F, 2F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 56, 1, 1, 0F); // Box 25
		bodyModel[16].setRotationPoint(-28F, 2F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 56, 1, 1, 0F); // Box 26
		bodyModel[17].setRotationPoint(-28F, 2F, 5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(-29F, 1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[19].setRotationPoint(28F, 1F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 48, 16, 1, 0F); // Box 29
		bodyModel[20].setRotationPoint(-24F, -15F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 17, 20, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(-24F, -16F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 17, 20, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[22].setRotationPoint(23F, -16F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 32
		bodyModel[23].setRotationPoint(-6F, -15F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 33
		bodyModel[24].setRotationPoint(-6F, -15F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 34
		bodyModel[25].setRotationPoint(-17F, -15F, 4F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 35
		bodyModel[26].setRotationPoint(-17F, -15F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 8, 18, 0F); // Box 36
		bodyModel[27].setRotationPoint(-17F, -23F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 8, 18, 0F); // Box 37
		bodyModel[28].setRotationPoint(-6F, -23F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 10, 9, 6, 0F); // Box 38
		bodyModel[29].setRotationPoint(-16F, -8F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 10, 9, 6, 0F); // Box 39
		bodyModel[30].setRotationPoint(-16F, -8F, 4F);

		bodyModel[31].addBox(0F, 0F, 0F, 18, 4, 6, 0F); // Box 40
		bodyModel[31].setRotationPoint(5F, -3F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 18, 4, 6, 0F); // Box 41
		bodyModel[32].setRotationPoint(5F, -3F, 4F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 42
		bodyModel[33].setRotationPoint(-16F, -11F, 4F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 43
		bodyModel[34].setRotationPoint(-16F, -11F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 44
		bodyModel[35].setRotationPoint(-9F, -11F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 45
		bodyModel[36].setRotationPoint(-9F, -11F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-7F, -15F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[38].setRotationPoint(-7F, -15F, 4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[39].setRotationPoint(-16F, -15F, 4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(-16F, -15F, -8F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 50
		bodyModel[41].setRotationPoint(-5F, -1F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 52
		bodyModel[42].setRotationPoint(-3F, -26F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 53
		bodyModel[43].setRotationPoint(-3F, -17F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 54
		bodyModel[44].setRotationPoint(-3.5F, -8F, -8.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 55
		bodyModel[45].setRotationPoint(-3F, -10F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(-3.5F, -4F, -8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 61
		bodyModel[47].setRotationPoint(-3F, -14F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 62 STACK CULL
		bodyModel[48].setRotationPoint(-2F, -26.8F, -9.5F);
		bodyModel[48].rotateAngleZ = -0.78539816F;

		bodyModel[49].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 63
		bodyModel[49].setRotationPoint(-23F, -3F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 64
		bodyModel[50].setRotationPoint(-23F, -3F, 4F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 65
		bodyModel[51].setRotationPoint(2.5F, -1F, -9.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 66
		bodyModel[52].setRotationPoint(3F, -3F, -9.75F);
		bodyModel[52].rotateAngleY = 0.01745329F;

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 67
		bodyModel[53].setRotationPoint(0.5F, -3F, -9.25F);
		bodyModel[53].rotateAngleY = -0.06981317F;

		bodyModel[54].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 68
		bodyModel[54].setRotationPoint(1.25F, -5F, -9F);
		bodyModel[54].rotateAngleY = 0.36651914F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 69 CULL
		bodyModel[55].setRotationPoint(4F, -5F, 4F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 1, 6, 0F); // Box 70
		bodyModel[56].setRotationPoint(-5F, -6F, 4F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 71
		bodyModel[57].setRotationPoint(-3F, -3F, 3.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 72 CULL
		bodyModel[58].setRotationPoint(-3F, -2F, 3.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[59].setRotationPoint(-3F, -8F, 3.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 74
		bodyModel[60].setRotationPoint(29F, -7F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 19, 4, 0F); // Box 75
		bodyModel[61].setRotationPoint(29.01F, -18F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 34, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 76
		bodyModel[62].setRotationPoint(-5F, -17F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 77
		bodyModel[63].setRotationPoint(-29F, -17F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.05F); // Box 78
		bodyModel[64].setRotationPoint(-5F, -16F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 34, 1, 7, 0F,0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 79
		bodyModel[65].setRotationPoint(-5F, -16F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.05F); // Box 80
		bodyModel[66].setRotationPoint(-29F, -16F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 81
		bodyModel[67].setRotationPoint(-29F, -16F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.02F, 0.1F, 0F, -0.02F, 0.1F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[68].setRotationPoint(-17F, -16F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -0.02F, 0.1F, 0F, -0.02F, 0.1F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F); // Box 70
		bodyModel[69].setRotationPoint(-17F, -16F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[70].setRotationPoint(-17.5F, -23F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 72
		bodyModel[71].setRotationPoint(-17.5F, -24F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.05F); // Box 73
		bodyModel[72].setRotationPoint(-17.5F, -23F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 19, 4, 0F); // Box 76
		bodyModel[73].setRotationPoint(-29.01F, -18F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 77
		bodyModel[74].setRotationPoint(27.75F, -7F, -5F);
		bodyModel[74].rotateAngleY = -0.78539816F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 0, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 78
		bodyModel[75].setRotationPoint(25.95F, -7F, -7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81 CULL
		bodyModel[76].setRotationPoint(-5F, -17.5F, -2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82 CULL
		bodyModel[77].setRotationPoint(-5F, -17.5F, -2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84 CULL
		bodyModel[78].setRotationPoint(5F, -17.5F, -2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86 CULL
		bodyModel[79].setRotationPoint(15F, -17.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88 CULL
		bodyModel[80].setRotationPoint(25F, -17.5F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89CULL
		bodyModel[81].setRotationPoint(-29F, -17.5F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90CULL
		bodyModel[82].setRotationPoint(-21F, -17.5F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91CULL
		bodyModel[83].setRotationPoint(-29F, -17.5F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92 CULL
		bodyModel[84].setRotationPoint(-19F, -17F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94 CULL
		bodyModel[85].setRotationPoint(-12F, -17F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96 CULL
		bodyModel[86].setRotationPoint(-7F, -17F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97 CULL
		bodyModel[87].setRotationPoint(-12F, -17F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98 CULL
		bodyModel[88].setRotationPoint(-7F, -17F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99 CULL
		bodyModel[89].setRotationPoint(-19F, -17F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100 CULL
		bodyModel[90].setRotationPoint(-19F, -17F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 101
		bodyModel[91].setRotationPoint(-6F, 2F, 7.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[92].setRotationPoint(-7F, 2.5F, -5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 14, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[93].setRotationPoint(-7F, 2.5F, 5.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[94].setRotationPoint(-13F, 2F, -5.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[95].setRotationPoint(-13F, 2F, 5.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 106
		bodyModel[96].setRotationPoint(7F, 2F, 5.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 107
		bodyModel[97].setRotationPoint(7F, 2F, -5.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 14, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[98].setRotationPoint(-7F, 2.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[99].setRotationPoint(-13F, 2F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 110
		bodyModel[100].setRotationPoint(7F, 2F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 14, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[101].setRotationPoint(-7F, 2.5F, 2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[102].setRotationPoint(-13F, 2F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 113
		bodyModel[103].setRotationPoint(7F, 2F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114 CULL
		bodyModel[104].setRotationPoint(-19F, -17F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[105].setRotationPoint(17.5F, 0.5F, 11.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 148
		bodyModel[106].setRotationPoint(22.5F, -5.5F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1.25F, 0.5F, 0F); // Box 149
		bodyModel[107].setRotationPoint(22.5F, -3.5F, 11.01F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[108].setRotationPoint(19.5F, 0.5F, 11.01F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[109].setRotationPoint(24.01F, -3.5F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 113
		bodyModel[110].setRotationPoint(24.01F, -5.5F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, -1F, 0F, 1.5F, -1F); // Box 114
		bodyModel[111].setRotationPoint(24.01F, -5.5F, 9F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 115
		bodyModel[112].setRotationPoint(17.5F, 0.5F, -11.01F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 116
		bodyModel[113].setRotationPoint(22.5F, -5.5F, -11.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1.25F, 0.5F, 0F); // Box 117
		bodyModel[114].setRotationPoint(22.5F, -3.5F, -11.01F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[115].setRotationPoint(19.5F, 0.5F, -11.01F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[116].setRotationPoint(24.01F, -3.5F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[117].setRotationPoint(24.01F, -5.5F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 121
		bodyModel[118].setRotationPoint(24.01F, -5.5F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 122
		bodyModel[119].setRotationPoint(-19.5F, 0.5F, -11.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 123
		bodyModel[120].setRotationPoint(-23.5F, -5.5F, -11.01F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 124
		bodyModel[121].setRotationPoint(-23.5F, -3.5F, -11.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 125
		bodyModel[122].setRotationPoint(-21.5F, 0.5F, -11.01F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[123].setRotationPoint(-24.01F, -3.5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[124].setRotationPoint(-24.01F, -5.5F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[125].setRotationPoint(-24.01F, -5.5F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 129
		bodyModel[126].setRotationPoint(-19.5F, 0.5F, 11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 130
		bodyModel[127].setRotationPoint(-23.5F, -5.5F, 11.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 131
		bodyModel[128].setRotationPoint(-23.5F, -3.5F, 11.01F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 132
		bodyModel[129].setRotationPoint(-21.5F, 0.5F, 11.01F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[130].setRotationPoint(-24.01F, -3.5F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
		bodyModel[131].setRotationPoint(-24.01F, -5.5F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, -1F, 0F, 1.5F, -1F); // Box 135
		bodyModel[132].setRotationPoint(-24.01F, -5.5F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136 CULL
		bodyModel[133].setRotationPoint(-28.75F, -17.5F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137 walkway grab CULL
		bodyModel[134].setRotationPoint(-28.75F, -17.5F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 138 CULL
		bodyModel[135].setRotationPoint(24.75F, -17.5F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139 CULL
		bodyModel[136].setRotationPoint(24.75F, -17.5F, 2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 140 cupola grab CULL
		bodyModel[137].setRotationPoint(-17F, -23.75F, -8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141 cupola grab CULL
		bodyModel[138].setRotationPoint(-17F, -23.75F, 3.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 51
		bodyModel[139].setRotationPoint(-32F, 3F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[140].setRotationPoint(-30F, 2F, -1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[141].setRotationPoint(-30F, 5F, -1.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 199
		bodyModel[142].setRotationPoint(25F, 3F, -1.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[143].setRotationPoint(29F, 2F, -1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[144].setRotationPoint(29F, 5F, -1.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202 cull
		bodyModel[145].setRotationPoint(-29.25F, 1.25F, 0F);
		bodyModel[145].rotateAngleZ = -0.61086524F;

		bodyModel[146].addShapeBox(-1F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204 CULL
		bodyModel[146].setRotationPoint(29.25F, 1.25F, -11F);
		bodyModel[146].rotateAngleZ = 0.61086524F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156 CULL
		bodyModel[147].setRotationPoint(24F, 4.5F, -11.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157 CULL
		bodyModel[148].setRotationPoint(24F, 1.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158 CULL
		bodyModel[149].setRotationPoint(24F, 4.5F, 9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159 CULL
		bodyModel[150].setRotationPoint(24F, 1.5F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 CULL
		bodyModel[151].setRotationPoint(-28F, 4.5F, 9.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 CULL
		bodyModel[152].setRotationPoint(-28F, 1.5F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 CULL
		bodyModel[153].setRotationPoint(-28F, 4.5F, -11.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 163 CULL
		bodyModel[154].setRotationPoint(-28F, 1.5F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 164
		bodyModel[155].setRotationPoint(29.01F, 2F, 3F);

		bodyModel[156].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 165
		bodyModel[156].setRotationPoint(29.01F, 2F, -8F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 166
		bodyModel[157].setRotationPoint(-29.01F, 2F, -8F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 167
		bodyModel[158].setRotationPoint(-29.01F, 2F, 3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 169
		bodyModel[159].setRotationPoint(-29.25F, -7F, 5F);
		bodyModel[159].rotateAngleY = -0.78539816F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 0, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 170
		bodyModel[160].setRotationPoint(-31.05F, -7F, 2.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[161].setRotationPoint(29F, -7F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 163
		bodyModel[162].setRotationPoint(29F, -7F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[163].setRotationPoint(29F, -6F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 168
		bodyModel[164].setRotationPoint(29F, -6F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
		bodyModel[165].setRotationPoint(29F, -7F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 171
		bodyModel[166].setRotationPoint(29F, -7F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[167].setRotationPoint(29F, -6F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 173
		bodyModel[168].setRotationPoint(29F, -6F, 6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		bodyModel[169].setRotationPoint(-29F, -7F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 175
		bodyModel[170].setRotationPoint(-29F, -7F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[171].setRotationPoint(-29F, -6F, 10F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 177
		bodyModel[172].setRotationPoint(-29F, -6F, 6F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 178
		bodyModel[173].setRotationPoint(-29F, -6F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[174].setRotationPoint(-29F, -7F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
		bodyModel[175].setRotationPoint(-29F, -7F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[176].setRotationPoint(-29F, -6F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 182
		bodyModel[177].setRotationPoint(-29F, -7F, -3F);
	}
	ModelFrictionTruck_Small bogie = new ModelFrictionTruck_Small();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.19, 0, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(1.19, 0, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}