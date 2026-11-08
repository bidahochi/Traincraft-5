//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flexicoil Cs (late)
// Model Creator: Bida
// Created on: 12.02.2022 - 19:29:09
// Last changed on: 12.02.2022 - 19:29:09

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBLW_commonwealth_c extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelBLW_commonwealth_c() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 0 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 1 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 4 axle
		bodyModel[3] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 3 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 4 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 5 axel
		bodyModel[6] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 9 axle
		bodyModel[7] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 10 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 111, 28, textureX, textureY); // Box 11 wheel
		bodyModel[9] = new ModelRendererTurbo(this, 106, 46, textureX, textureY); // Box 173 roller bearing
		bodyModel[10] = new ModelRendererTurbo(this, 106, 46, textureX, textureY); // Box 565 roller bearing
		bodyModel[11] = new ModelRendererTurbo(this, 106, 46, textureX, textureY); // Box 566 roller bearing
		bodyModel[12] = new ModelRendererTurbo(this, 107, 22, textureX, textureY); // Box 138 mount point
		bodyModel[13] = new ModelRendererTurbo(this, 12, 12, textureX, textureY,"cull"); // Box 14 cull sideframe
		bodyModel[14] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 70, 27, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 70, 27, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 59, 27, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 79, 21, textureX, textureY); // Box 137
		bodyModel[20] = new ModelRendererTurbo(this, 79, 28, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 10, 21, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 10, 27, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 10, 21, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 59, 27, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 10, 27, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 59, 27, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 44, 27, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 51, 23, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 46, 21, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 90, 41, textureX, textureY); // Box 184 late brake
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 59, 21, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 37, 28, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 24 friction bearing
		bodyModel[41] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 24 friction bearing
		bodyModel[42] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 24 friction bearing
		bodyModel[43] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 45 friction bearing
		bodyModel[44] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 46 friction bearing
		bodyModel[45] = new ModelRendererTurbo(this, 113, 46, textureX, textureY); // Box 47 friction bearing
		bodyModel[46] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 16, 21, textureX, textureY); // Box 160
		bodyModel[48] = new ModelRendererTurbo(this, 123, 60, textureX, textureY); // Box 182
		bodyModel[49] = new ModelRendererTurbo(this, 123, 55, textureX, textureY); // Box 183
		bodyModel[50] = new ModelRendererTurbo(this, 123, 55, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 123, 60, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 30, 24, textureX, textureY,"cull"); // Box 54 cull
		bodyModel[53] = new ModelRendererTurbo(this, 30, 24, textureX, textureY,"cull"); // Box 55 cull
		bodyModel[54] = new ModelRendererTurbo(this, 30, 24, textureX, textureY,"cull"); // Box 56 cull
		bodyModel[55] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 50, 5, textureX, textureY,"cull"); // Box 59 cull sideframe1
		bodyModel[58] = new ModelRendererTurbo(this, 30, 5, textureX, textureY,"cull"); // Box 60 cull sideframe1
		bodyModel[59] = new ModelRendererTurbo(this, 40, 3, textureX, textureY,"cull"); // Box 61 cull sideframe1
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 77, 4, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 77, 4, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 77, 12, textureX, textureY,"cull"); // Box 66 cull sideframe end
		bodyModel[65] = new ModelRendererTurbo(this, 1, 12, textureX, textureY,"cull"); // Box 67 cull sideframe end
		bodyModel[66] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 134
		bodyModel[68] = new ModelRendererTurbo(this, 103, 6, textureX, textureY); // Box 135
		bodyModel[69] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 103, 6, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 103, 6, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 62, 6, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 67, 3, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 97, 46, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 90, 46, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 100, 40, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 19, 24, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 12, 44, textureX, textureY,"cull"); // Box 83 cull sideframe
		bodyModel[81] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 59, 59, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 79, 53, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 79, 60, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 10, 53, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 10, 59, textureX, textureY); // Box 92
		bodyModel[90] = new ModelRendererTurbo(this, 10, 53, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 59, 59, textureX, textureY); // Box 94
		bodyModel[92] = new ModelRendererTurbo(this, 10, 59, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 59, 59, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 1, 38, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 1, 60, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 44, 59, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 51, 55, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 46, 53, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 90, 41, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 59, 53, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 38, 57, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 37, 60, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 109
		bodyModel[107] = new ModelRendererTurbo(this, 16, 53, textureX, textureY); // Box 110
		bodyModel[108] = new ModelRendererTurbo(this, 123, 60, textureX, textureY); // Box 111
		bodyModel[109] = new ModelRendererTurbo(this, 123, 55, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 123, 55, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 123, 60, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 30, 56, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 30, 56, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 30, 56, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 24, 36, textureX, textureY); // Box 119
		bodyModel[117] = new ModelRendererTurbo(this, 40, 35, textureX, textureY,"cull"); // Box 120 cull sideframe1
		bodyModel[118] = new ModelRendererTurbo(this, 30, 37, textureX, textureY,"cull"); // Box 121 cull sideframe1
		bodyModel[119] = new ModelRendererTurbo(this, 50, 37, textureX, textureY,"cull"); // Box 122 cull sideframe1
		bodyModel[120] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 124
		bodyModel[122] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 125
		bodyModel[123] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 126
		bodyModel[124] = new ModelRendererTurbo(this, 77, 44, textureX, textureY,"cull"); // Box 127 cull sideframe end
		bodyModel[125] = new ModelRendererTurbo(this, 1, 44, textureX, textureY,"cull"); // Box 128 cull sideframe end
		bodyModel[126] = new ModelRendererTurbo(this, 62, 38, textureX, textureY); // Box 129
		bodyModel[127] = new ModelRendererTurbo(this, 67, 35, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 16, 59, textureX, textureY); // Box 131
		bodyModel[129] = new ModelRendererTurbo(this, 97, 46, textureX, textureY); // Box 132
		bodyModel[130] = new ModelRendererTurbo(this, 90, 46, textureX, textureY); // Box 133
		bodyModel[131] = new ModelRendererTurbo(this, 100, 40, textureX, textureY); // Box 134
		bodyModel[132] = new ModelRendererTurbo(this, 19, 56, textureX, textureY); // Box 135
		bodyModel[133] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 133
		bodyModel[134] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 109, 43, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 84, 26, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 107, 36, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 92, 34, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 16, 3, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 16, 35, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 172
		bodyModel[149] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 173
		bodyModel[150] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 157
		bodyModel[155] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 158
		bodyModel[156] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 159
		bodyModel[157] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 160
		bodyModel[158] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 161
		bodyModel[159] = new ModelRendererTurbo(this, 88, 58, textureX, textureY); // Box 162
		bodyModel[160] = new ModelRendererTurbo(this, 22, 33, textureX, textureY); // Box 98
		bodyModel[161] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 161

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0 wheel
		bodyModel[0].setRotationPoint(-10F, 7F, -5.5F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1 wheel
		bodyModel[1].setRotationPoint(-1F, 7F, -5.5F);

		bodyModel[2].addBox(0F, 0F, -2F, 18, 2, 2, 0F); // Box 4 axle
		bodyModel[2].setRotationPoint(-11F, 6.01F, -9F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3 wheel
		bodyModel[3].setRotationPoint(-10F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4 wheel
		bodyModel[4].setRotationPoint(-1F, 7F, 5.5F);

		bodyModel[5].addBox(0F, 0F, -2F, 18, 2, 2, 0F); // Box 5 axel
		bodyModel[5].setRotationPoint(-2F, 6.01F, -9F);
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addBox(0F, 0F, -2F, 18, 2, 2, 0F); // Box 9 axle
		bodyModel[6].setRotationPoint(10F, 6.01F, -9F);
		bodyModel[6].rotateAngleY = 1.57079633F;

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10 wheel
		bodyModel[7].setRotationPoint(11F, 7F, -5.5F);

		bodyModel[8].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11 wheel
		bodyModel[8].setRotationPoint(11F, 7F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 173 roller bearing
		bodyModel[9].setRotationPoint(-11F, 6.01F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 565 roller bearing
		bodyModel[10].setRotationPoint(-2F, 6.01F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 18F, -0.25F, -0.25F, 18F); // Box 566 roller bearing
		bodyModel[11].setRotationPoint(10F, 6.01F, -9.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 138 mount point
		bodyModel[12].setRotationPoint(-2F, 3F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 28, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 14 cull sideframe
		bodyModel[13].setRotationPoint(-13.5F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 14
		bodyModel[14].setRotationPoint(-12F, 6F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F); // Box 15
		bodyModel[15].setRotationPoint(-12F, 8F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		bodyModel[16].setRotationPoint(-9F, 6F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 17
		bodyModel[17].setRotationPoint(-9F, 8F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 18
		bodyModel[18].setRotationPoint(-11F, 7.75F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2F, -0.25F); // Box 137
		bodyModel[19].setRotationPoint(-13.75F, 6F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 20
		bodyModel[20].setRotationPoint(-13.75F, 7.25F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 21
		bodyModel[21].setRotationPoint(12F, 6F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F); // Box 22
		bodyModel[22].setRotationPoint(9F, 8F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Box 23
		bodyModel[23].setRotationPoint(9F, 6F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 24
		bodyModel[24].setRotationPoint(10F, 7.75F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 25
		bodyModel[25].setRotationPoint(12F, 8F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[26].setRotationPoint(-2F, 7.75F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-13.5F, 2.5F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 29
		bodyModel[28].setRotationPoint(8.5F, 3F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[29].setRotationPoint(12.75F, 7.25F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.25F, -0.25F); // Box 31
		bodyModel[30].setRotationPoint(12.75F, 6F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(1F, 6F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -2F); // Box 33
		bodyModel[32].setRotationPoint(0F, 6F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, -0.5F, 0F, -1.5F); // Box 34
		bodyModel[33].setRotationPoint(-5F, 6F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 184 late brake
		bodyModel[34].setRotationPoint(-8F, 2F, -10F);
		bodyModel[34].rotateAngleX = -0.78539816F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(1.5F, 2.5F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 38
		bodyModel[36].setRotationPoint(-4F, 6F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[37].setRotationPoint(1F, 6F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[38].setRotationPoint(2.5F, 6F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 5, 8, 0F); // Box 41
		bodyModel[39].setRotationPoint(-5F, 3F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24 friction bearing
		bodyModel[40].setRotationPoint(-11F, 6.01F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24 friction bearing
		bodyModel[41].setRotationPoint(-2F, 6.01F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24 friction bearing
		bodyModel[42].setRotationPoint(10F, 6.01F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 45 friction bearing
		bodyModel[43].setRotationPoint(-11F, 6.01F, 8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 46 friction bearing
		bodyModel[44].setRotationPoint(-2F, 6.01F, 8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 47 friction bearing
		bodyModel[45].setRotationPoint(10F, 6.01F, 8.5F);

		bodyModel[46].addShapeBox(0F, 0.5F, 0.5F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 48
		bodyModel[46].setRotationPoint(-7F, 2F, -10F);
		bodyModel[46].rotateAngleX = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		bodyModel[47].setRotationPoint(-6.25F, 8.5F, -10.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 182
		bodyModel[48].setRotationPoint(6.75F, 7.75F, -5.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[49].setRotationPoint(6.75F, 4.75F, -5.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[50].setRotationPoint(-6.75F, 4.75F, -5.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 53
		bodyModel[51].setRotationPoint(-6.75F, 7.75F, -5.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 54 cull
		bodyModel[52].setRotationPoint(3F, 6F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 55 cull
		bodyModel[53].setRotationPoint(8F, 6F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 56 cull
		bodyModel[54].setRotationPoint(-8F, 6F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Box 57
		bodyModel[55].setRotationPoint(-3F, 4.25F, -9.55F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[56].setRotationPoint(-1F, 4.25F, -9.55F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -1F, -2F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0.5F, -2F); // Box 59 cull sideframe1
		bodyModel[57].setRotationPoint(-3.5F, 2F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, -0.5F, 0F, -2F); // Box 60 cull sideframe1
		bodyModel[58].setRotationPoint(-0.5F, 2F, -9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61 cull sideframe1
		bodyModel[59].setRotationPoint(-2F, 2F, -9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Box 62
		bodyModel[60].setRotationPoint(9F, 4.25F, -9.55F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F); // Box 63
		bodyModel[61].setRotationPoint(11F, 4.25F, -9.55F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Box 64
		bodyModel[62].setRotationPoint(-12F, 4.25F, -9.55F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F); // Box 65
		bodyModel[63].setRotationPoint(-10F, 4.25F, -9.55F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F); // Box 66 cull sideframe end
		bodyModel[64].setRotationPoint(-14.5F, 3F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, 0F, -1F, -2F); // Box 67 cull sideframe end
		bodyModel[65].setRotationPoint(14.5F, 3F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 5, 8, 0F); // Box 69
		bodyModel[66].setRotationPoint(4F, 3F, -4F);

		bodyModel[67].addBox(0F, 0F, -3F, 9, 4, 3, 0F); // Box 134
		bodyModel[67].setRotationPoint(-8.5F, 5F, -4.5F);
		bodyModel[67].rotateAngleY = 1.57079633F;

		bodyModel[68].addShapeBox(0F, 0F, -3F, 9, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[68].setRotationPoint(-11.5F, 6F, -4.5F);
		bodyModel[68].rotateAngleY = 1.57079633F;

		bodyModel[69].addBox(0F, 0F, -3F, 9, 4, 3, 0F); // Box 72
		bodyModel[69].setRotationPoint(0.5F, 5F, -4.5F);
		bodyModel[69].rotateAngleY = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, -3F, 9, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(-2.5F, 6F, -4.5F);
		bodyModel[70].rotateAngleY = 1.57079633F;

		bodyModel[71].addBox(0F, 0F, -3F, 9, 4, 3, 0F); // Box 74
		bodyModel[71].setRotationPoint(6.5F, 5F, -4.5F);
		bodyModel[71].rotateAngleY = 1.57079633F;

		bodyModel[72].addShapeBox(0F, 0F, -3F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 75
		bodyModel[72].setRotationPoint(9.5F, 6F, -4.5F);
		bodyModel[72].rotateAngleY = 1.57079633F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.5F); // Box 76
		bodyModel[73].setRotationPoint(3F, 8.5F, -9.25F);

		bodyModel[74].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F); // Box 77
		bodyModel[74].setRotationPoint(5.75F, 8.5F, -10.2F);
		bodyModel[74].rotateAngleY = 1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F); // Box 78
		bodyModel[75].setRotationPoint(-7.25F, 8.5F, -10.2F);
		bodyModel[75].rotateAngleY = 1.57079633F;

		bodyModel[76].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 79
		bodyModel[76].setRotationPoint(-3.5F, 7.5F, -10.25F);
		bodyModel[76].rotateAngleZ = 0.26179939F;

		bodyModel[77].addShapeBox(-1F, -4.5F, 0F, 2, 4, 1, 0F,-0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 80
		bodyModel[77].setRotationPoint(-3.5F, 7.5F, -10.25F);
		bodyModel[77].rotateAngleZ = 0.20943951F;

		bodyModel[78].addShapeBox(-1F, -5.25F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 81
		bodyModel[78].setRotationPoint(-3.5F, 7.5F, -10.25F);
		bodyModel[78].rotateAngleZ = 0.20943951F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.125F, -0.5F, 0F, 0.875F, 0.5F, 0F, 0.875F, -1F, 0F, 0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -1.125F, 0.5F, 0F, -1.125F, -1F, 0F, -0.375F, 0F); // Box 82
		bodyModel[79].setRotationPoint(-8F, 8.5F, -9.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 28, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 83 cull sideframe
		bodyModel[80].setRotationPoint(-13.5F, 3F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[81].setRotationPoint(-12F, 6F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 85
		bodyModel[82].setRotationPoint(-12F, 8F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[83].setRotationPoint(-9F, 6F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[84].setRotationPoint(-9F, 8F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[85].setRotationPoint(-11F, 7.75F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2F, -0.25F); // Box 89
		bodyModel[86].setRotationPoint(-13.75F, 6F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 90
		bodyModel[87].setRotationPoint(-13.75F, 7.25F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[88].setRotationPoint(12F, 6F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 92
		bodyModel[89].setRotationPoint(9F, 8F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[90].setRotationPoint(9F, 6F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[91].setRotationPoint(10F, 7.75F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[92].setRotationPoint(12F, 8F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[93].setRotationPoint(-2F, 7.75F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 97
		bodyModel[94].setRotationPoint(-13.5F, 2.5F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 98
		bodyModel[95].setRotationPoint(8.5F, 3F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 99
		bodyModel[96].setRotationPoint(12.75F, 7.25F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2.25F, -0.25F); // Box 100
		bodyModel[97].setRotationPoint(12.75F, 6F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(1F, 6F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 102
		bodyModel[99].setRotationPoint(0F, 6F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(-5F, 6F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 104
		bodyModel[101].setRotationPoint(-8F, 2F, 10F);
		bodyModel[101].rotateAngleX = -0.78539816F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[102].setRotationPoint(1.5F, 2.5F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[103].setRotationPoint(-4F, 6F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 107
		bodyModel[104].setRotationPoint(1F, 6F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[105].setRotationPoint(2.5F, 6F, 7F);

		bodyModel[106].addShapeBox(0F, 0.5F, 0.5F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 109
		bodyModel[106].setRotationPoint(-7F, 2F, 10F);
		bodyModel[106].rotateAngleX = -0.78539816F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		bodyModel[107].setRotationPoint(-6.25F, 8.5F, 9.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 111
		bodyModel[108].setRotationPoint(6.75F, 7.75F, 4.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[109].setRotationPoint(6.75F, 4.75F, 4.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[110].setRotationPoint(-6.75F, 4.75F, 4.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 114
		bodyModel[111].setRotationPoint(-6.75F, 7.75F, 4.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 115
		bodyModel[112].setRotationPoint(3F, 6F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 116
		bodyModel[113].setRotationPoint(8F, 6F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F); // Box 117
		bodyModel[114].setRotationPoint(-8F, 6F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 118
		bodyModel[115].setRotationPoint(-3F, 4.25F, 6.55F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[116].setRotationPoint(-1F, 4.25F, 6.55F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 120 cull sideframe1
		bodyModel[117].setRotationPoint(-3.5F, 2F, 4.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, -0.5F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 121 cull sideframe1
		bodyModel[118].setRotationPoint(-0.5F, 2F, 4.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122 cull sideframe1
		bodyModel[119].setRotationPoint(-2F, 2F, 4.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 123
		bodyModel[120].setRotationPoint(9F, 4.25F, 6.55F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[121].setRotationPoint(11F, 4.25F, 6.55F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 125
		bodyModel[122].setRotationPoint(-12F, 4.25F, 6.55F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[123].setRotationPoint(-10F, 4.25F, 6.55F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 127 cull sideframe end
		bodyModel[124].setRotationPoint(-14.5F, 3F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 128 cull sideframe end
		bodyModel[125].setRotationPoint(14.5F, 3F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.125F, 0.5F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -0.5F, 0F, -0.375F, 0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F); // Box 129
		bodyModel[126].setRotationPoint(3F, 8.5F, 8.25F);

		bodyModel[127].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0.1F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F); // Box 130
		bodyModel[127].setRotationPoint(5.75F, 8.5F, 5.2F);
		bodyModel[127].rotateAngleY = 1.57079633F;

		bodyModel[128].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0.1F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F); // Box 131
		bodyModel[128].setRotationPoint(-7.25F, 8.5F, 5.2F);
		bodyModel[128].rotateAngleY = 1.57079633F;

		bodyModel[129].addShapeBox(-1F, -1F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 132
		bodyModel[129].setRotationPoint(-3.5F, 7.5F, 8.25F);
		bodyModel[129].rotateAngleZ = 0.26179939F;

		bodyModel[130].addShapeBox(-1F, -4.5F, 0F, 2, 4, 1, 0F,-0.25F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 133
		bodyModel[130].setRotationPoint(-3.5F, 7.5F, 9.25F);
		bodyModel[130].rotateAngleZ = 0.20943951F;

		bodyModel[131].addShapeBox(-1F, -5.25F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 134
		bodyModel[131].setRotationPoint(-3.5F, 7.5F, 9.25F);
		bodyModel[131].rotateAngleZ = 0.20943951F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.125F, 0F, 0F, 0.875F, -1F, 0F, 0.875F, 0.5F, 0F, 0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -1.125F, -1F, 0F, -1.125F, 0.5F, 0F, -0.375F, -0.5F); // Box 135
		bodyModel[132].setRotationPoint(-8F, 8.5F, 8.25F);

		bodyModel[133].addShapeBox(0F, 0F, -1F, 8, 1, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[133].setRotationPoint(-14F, 7F, -4F);
		bodyModel[133].rotateAngleY = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[134].setRotationPoint(-14F, 3F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -2F, 2F, -0.5F, -2F, 2F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		bodyModel[135].setRotationPoint(-14F, 3F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, -1F, 8, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
		bodyModel[136].setRotationPoint(14F, 7F, -4F);
		bodyModel[136].rotateAngleY = 1.57079633F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 137
		bodyModel[137].setRotationPoint(14F, 3F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, -0.5F, -2F, 2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 138
		bodyModel[138].setRotationPoint(14F, 3F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.01F, 2F, 0F, -0.01F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, -0.01F, 2F, 0F, -0.01F); // Box 139
		bodyModel[139].setRotationPoint(-5F, 3F, 4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,2F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 140
		bodyModel[140].setRotationPoint(-5F, 3F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, -0.01F, -2F, 0F, -0.01F); // Box 141
		bodyModel[141].setRotationPoint(4F, 3F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, -0.01F, 2F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.01F, 2F, 0F, -0.01F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 142
		bodyModel[142].setRotationPoint(4F, 3F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 143
		bodyModel[143].setRotationPoint(-3F, 3.5F, -3F);

		bodyModel[144].addBox(0F, 0F, -4F, 6, 2, 4, 0F); // Box 144
		bodyModel[144].setRotationPoint(3F, 6.5F, -3F);
		bodyModel[144].rotateAngleY = 1.57079633F;

		bodyModel[145].addBox(0F, 0F, -3F, 6, 2, 3, 0F); // Box 145
		bodyModel[145].setRotationPoint(-6.1F, 6.5F, -3F);
		bodyModel[145].rotateAngleY = 1.57079633F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0.75F, -1F, 0F, 0.25F, -1F, 0F); // Box 146
		bodyModel[146].setRotationPoint(4.75F, 3F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, -1F, 0F, 0.75F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F); // Box 147
		bodyModel[147].setRotationPoint(4.75F, 3F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 172
		bodyModel[148].setRotationPoint(-10F, 4.25F, 7.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 173
		bodyModel[149].setRotationPoint(-13F, 4.25F, 7.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 151
		bodyModel[150].setRotationPoint(-1F, 4.25F, 7.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 152
		bodyModel[151].setRotationPoint(-4F, 4.25F, 7.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 153
		bodyModel[152].setRotationPoint(11F, 4.25F, 7.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 154
		bodyModel[153].setRotationPoint(8F, 4.25F, 7.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F); // Box 157
		bodyModel[154].setRotationPoint(-10F, 4.25F, -8.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F); // Box 158
		bodyModel[155].setRotationPoint(-13F, 4.25F, -8.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F); // Box 159
		bodyModel[156].setRotationPoint(-1F, 4.25F, -8.75F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F); // Box 160
		bodyModel[157].setRotationPoint(-4F, 4.25F, -8.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0.25F, 0F, -2F, 0.25F); // Box 161
		bodyModel[158].setRotationPoint(11F, 4.25F, -8.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, -3F, 0.25F); // Box 162
		bodyModel[159].setRotationPoint(8F, 4.25F, -8.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 98
		bodyModel[160].setRotationPoint(1.5F, 3F, 9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
		bodyModel[161].setRotationPoint(1.5F, 3F, -10F);
	}
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
	}
}