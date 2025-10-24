//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.05.2025 - 18:52:11
// Last changed on: 03.05.2025 - 18:52:11

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class ModelEvansCoilCar_Covers extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEvansCoilCar_Covers() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[184];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 115, 54, textureX, textureY, "cull"); // Box 11 cull
		bodyModel[1] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 16, 27, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 16, 40, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 48, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[5] = new ModelRendererTurbo(this, 27, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[6] = new ModelRendererTurbo(this, 83, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[7] = new ModelRendererTurbo(this, 83, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[8] = new ModelRendererTurbo(this, 78, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[9] = new ModelRendererTurbo(this, 78, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[10] = new ModelRendererTurbo(this, 32, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[11] = new ModelRendererTurbo(this, 32, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[12] = new ModelRendererTurbo(this, 5, 54, textureX, textureY, "cull"); // Box 11 Cull
		bodyModel[13] = new ModelRendererTurbo(this, 127, 14, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 126, 27, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 126, 40, textureX, textureY); // Box 13
		bodyModel[16] = new ModelRendererTurbo(this, 156, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[17] = new ModelRendererTurbo(this, 186, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[18] = new ModelRendererTurbo(this, 186, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[19] = new ModelRendererTurbo(this, 191, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[20] = new ModelRendererTurbo(this, 191, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[21] = new ModelRendererTurbo(this, 135, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[22] = new ModelRendererTurbo(this, 135, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[23] = new ModelRendererTurbo(this, 140, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[24] = new ModelRendererTurbo(this, 140, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[25] = new ModelRendererTurbo(this, 21, 81, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 21, 79, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 131, 80, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 131, 81, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 82, 8, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 87, 36, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 105, 36, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 104, 8, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 108, 105, textureX, textureY); // Box 13 GTW mega coil stuff
		bodyModel[34] = new ModelRendererTurbo(this, 108, 96, textureX, textureY); // Box 13  GTW mega coil stuff
		bodyModel[35] = new ModelRendererTurbo(this, 120, 103, textureX, textureY); // Box 19
		bodyModel[36] = new ModelRendererTurbo(this, 15, 123, textureX, textureY); // Box 13
		bodyModel[37] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 13
		bodyModel[38] = new ModelRendererTurbo(this, 9, 104, textureX, textureY); // Box 19
		bodyModel[39] = new ModelRendererTurbo(this, 135, 139, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[40] = new ModelRendererTurbo(this, 175, 139, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[41] = new ModelRendererTurbo(this, 55, 140, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[42] = new ModelRendererTurbo(this, 14, 140, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[43] = new ModelRendererTurbo(this, 37, 7, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[44] = new ModelRendererTurbo(this, 37, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[45] = new ModelRendererTurbo(this, 67, 7, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[46] = new ModelRendererTurbo(this, 67, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[47] = new ModelRendererTurbo(this, 145, 7, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[48] = new ModelRendererTurbo(this, 175, 7, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[49] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[50] = new ModelRendererTurbo(this, 175, 1, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[51] = new ModelRendererTurbo(this, 129, 139, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[52] = new ModelRendererTurbo(this, 129, 147, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[53] = new ModelRendererTurbo(this, 79, 148, textureX, textureY, "cull"); // Box 64 cull
		bodyModel[54] = new ModelRendererTurbo(this, 27, 4, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[55] = new ModelRendererTurbo(this, 126, 121, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 126, 93, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 95, 139, textureX, textureY); // Box 80  GTW mega coil stuff
		bodyModel[58] = new ModelRendererTurbo(this, 217, 83, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[59] = new ModelRendererTurbo(this, 219, 105, textureX, textureY, "cull"); // Box 64 cull GTW mega coil stuff
		bodyModel[60] = new ModelRendererTurbo(this, 219, 96, textureX, textureY, "cull"); // Box 64 cull GTW mega coil stuff
		bodyModel[61] = new ModelRendererTurbo(this, 219, 96, textureX, textureY); // Box 74 Hook thing  GTW mega coil stuff
		bodyModel[62] = new ModelRendererTurbo(this, 219, 62, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[63] = new ModelRendererTurbo(this, 131, 162, textureX, textureY, "cull"); // Box 94 round coil brace cull
		bodyModel[64] = new ModelRendererTurbo(this, 79, 140, textureX, textureY, "cull"); // Box 95 cull
		bodyModel[65] = new ModelRendererTurbo(this, 211, 170, textureX, textureY); // Box 13
		bodyModel[66] = new ModelRendererTurbo(this, 193, 170, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 187, 185, textureX, textureY); // Box 19
		bodyModel[68] = new ModelRendererTurbo(this, 196, 170, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 223, 185, textureX, textureY); // Box 19
		bodyModel[70] = new ModelRendererTurbo(this, 135, 170, textureX, textureY); // Box 13
		bodyModel[71] = new ModelRendererTurbo(this, 153, 170, textureX, textureY); // Box 13
		bodyModel[72] = new ModelRendererTurbo(this, 129, 186, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 138, 170, textureX, textureY); // Box 20
		bodyModel[74] = new ModelRendererTurbo(this, 166, 185, textureX, textureY); // Box 19
		bodyModel[75] = new ModelRendererTurbo(this, 71, 162, textureX, textureY); // Box 13
		bodyModel[76] = new ModelRendererTurbo(this, 53, 162, textureX, textureY); // Box 13
		bodyModel[77] = new ModelRendererTurbo(this, 47, 179, textureX, textureY); // Box 19
		bodyModel[78] = new ModelRendererTurbo(this, 56, 161, textureX, textureY); // Box 20
		bodyModel[79] = new ModelRendererTurbo(this, 83, 179, textureX, textureY); // Box 19
		bodyModel[80] = new ModelRendererTurbo(this, 26, 162, textureX, textureY); // Box 13
		bodyModel[81] = new ModelRendererTurbo(this, 8, 162, textureX, textureY); // Box 13
		bodyModel[82] = new ModelRendererTurbo(this, 2, 178, textureX, textureY); // Box 19
		bodyModel[83] = new ModelRendererTurbo(this, 11, 161, textureX, textureY); // Box 20
		bodyModel[84] = new ModelRendererTurbo(this, 38, 179, textureX, textureY); // Box 19
		bodyModel[85] = new ModelRendererTurbo(this, 256, 182, textureX, textureY); // Box 123
		bodyModel[86] = new ModelRendererTurbo(this, 233, 182, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 232, 169, textureX, textureY); // Box 13
		bodyModel[88] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 13
		bodyModel[89] = new ModelRendererTurbo(this, 275, 179, textureX, textureY); // Box 129
		bodyModel[90] = new ModelRendererTurbo(this, 275, 167, textureX, textureY); // Box 129
		bodyModel[91] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 266, 167, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 122, 168, textureX, textureY); // Box 123
		bodyModel[94] = new ModelRendererTurbo(this, 122, 178, textureX, textureY); // Box 123
		bodyModel[95] = new ModelRendererTurbo(this, 109, 187, textureX, textureY); // Box 13
		bodyModel[96] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 13
		bodyModel[97] = new ModelRendererTurbo(this, 103, 178, textureX, textureY); // Box 129
		bodyModel[98] = new ModelRendererTurbo(this, 103, 166, textureX, textureY); // Box 129
		bodyModel[99] = new ModelRendererTurbo(this, 94, 178, textureX, textureY); // Box 129
		bodyModel[100] = new ModelRendererTurbo(this, 94, 166, textureX, textureY); // Box 129
		bodyModel[101] = new ModelRendererTurbo(this, 263, 14, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[102] = new ModelRendererTurbo(this, 263, 40, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[103] = new ModelRendererTurbo(this, 263, 1, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[104] = new ModelRendererTurbo(this, 263, 27, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[105] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[106] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[107] = new ModelRendererTurbo(this, 265, 66, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[108] = new ModelRendererTurbo(this, 265, 61, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[109] = new ModelRendererTurbo(this, 263, 14, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[110] = new ModelRendererTurbo(this, 263, 40, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[111] = new ModelRendererTurbo(this, 263, 1, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[112] = new ModelRendererTurbo(this, 263, 27, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[113] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[114] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[115] = new ModelRendererTurbo(this, 265, 66, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[116] = new ModelRendererTurbo(this, 265, 61, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[117] = new ModelRendererTurbo(this, 228, 14, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[118] = new ModelRendererTurbo(this, 230, 40, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[119] = new ModelRendererTurbo(this, 230, 1, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[120] = new ModelRendererTurbo(this, 228, 27, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[121] = new ModelRendererTurbo(this, 209, 2, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[122] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[123] = new ModelRendererTurbo(this, 210, 15, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[124] = new ModelRendererTurbo(this, 209, 28, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[125] = new ModelRendererTurbo(this, 228, 14, textureX, textureY); // Box 2 she coil on my gon till i...
		bodyModel[126] = new ModelRendererTurbo(this, 230, 40, textureX, textureY); // Box 3 she coil on my gon till i...
		bodyModel[127] = new ModelRendererTurbo(this, 230, 1, textureX, textureY); // Box 4 she coil on my gon till i...
		bodyModel[128] = new ModelRendererTurbo(this, 228, 27, textureX, textureY); // Box 5 she coil on my gon till i...
		bodyModel[129] = new ModelRendererTurbo(this, 209, 2, textureX, textureY); // Box 6 she coil on my gon till i...
		bodyModel[130] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 7 she coil on my gon till i...
		bodyModel[131] = new ModelRendererTurbo(this, 210, 15, textureX, textureY); // Box 8 she coil on my gon till i...
		bodyModel[132] = new ModelRendererTurbo(this, 209, 28, textureX, textureY); // Box 9 she coil on my gon till i...
		bodyModel[133] = new ModelRendererTurbo(this, 36, 147, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[134] = new ModelRendererTurbo(this, 211, 138, textureX, textureY); // Box 74 Hook thing
		bodyModel[135] = new ModelRendererTurbo(this, 62, 147, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[136] = new ModelRendererTurbo(this, 62, 141, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[137] = new ModelRendererTurbo(this, 36, 141, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[138] = new ModelRendererTurbo(this, 182, 139, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[139] = new ModelRendererTurbo(this, 157, 145, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[140] = new ModelRendererTurbo(this, 182, 145, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[141] = new ModelRendererTurbo(this, 157, 139, textureX, textureY, "cull"); // Box 74 Hook thing cull
		bodyModel[142] = new ModelRendererTurbo(this, 19, 85, textureX, textureY); // Box 13
		bodyModel[143] = new ModelRendererTurbo(this, 19, 132, textureX, textureY); // Box 13
		bodyModel[144] = new ModelRendererTurbo(this, 201, 138, textureX, textureY); // Box 74 Hook thing
		bodyModel[145] = new ModelRendererTurbo(this, 27, 140, textureX, textureY); // Box 74 Hook thing
		bodyModel[146] = new ModelRendererTurbo(this, 22, 140, textureX, textureY); // Box 74 Hook thing
		bodyModel[147] = new ModelRendererTurbo(this, 196, 138, textureX, textureY); // Box 74 Hook thing
		bodyModel[148] = new ModelRendererTurbo(this, 206, 138, textureX, textureY); // Box 74 Hook thing
		bodyModel[149] = new ModelRendererTurbo(this, 17, 140, textureX, textureY); // Box 74 Hook thing
		bodyModel[150] = new ModelRendererTurbo(this, 12, 140, textureX, textureY); // Box 74 Hook thing
		bodyModel[151] = new ModelRendererTurbo(this, 130, 130, textureX, textureY); // Box 13
		bodyModel[152] = new ModelRendererTurbo(this, 129, 84, textureX, textureY); // Box 13
		bodyModel[153] = new ModelRendererTurbo(this, 241, 101, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[154] = new ModelRendererTurbo(this, 258, 83, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[155] = new ModelRendererTurbo(this, 253, 83, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[156] = new ModelRendererTurbo(this, 241, 95, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[157] = new ModelRendererTurbo(this, 251, 95, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[158] = new ModelRendererTurbo(this, 248, 83, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[159] = new ModelRendererTurbo(this, 242, 83, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[160] = new ModelRendererTurbo(this, 251, 101, textureX, textureY); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[161] = new ModelRendererTurbo(this, 112, 80, textureX, textureY); // Box 13 GTW mega coil stuff
		bodyModel[162] = new ModelRendererTurbo(this, 112, 89, textureX, textureY); // Box 13  GTW mega coil stuff
		bodyModel[163] = new ModelRendererTurbo(this, 166, 176, textureX, textureY); // Box 13
		bodyModel[164] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 13
		bodyModel[165] = new ModelRendererTurbo(this, 83, 170, textureX, textureY); // Box 13
		bodyModel[166] = new ModelRendererTurbo(this, 47, 170, textureX, textureY); // Box 13
		bodyModel[167] = new ModelRendererTurbo(this, 238, 180, textureX, textureY); // Box 13
		bodyModel[168] = new ModelRendererTurbo(this, 247, 180, textureX, textureY); // Box 13
		bodyModel[169] = new ModelRendererTurbo(this, 113, 166, textureX, textureY); // Box 13
		bodyModel[170] = new ModelRendererTurbo(this, 113, 176, textureX, textureY); // Box 13
		bodyModel[171] = new ModelRendererTurbo(this, 223, 176, textureX, textureY); // Box 13
		bodyModel[172] = new ModelRendererTurbo(this, 187, 176, textureX, textureY); // Box 13
		bodyModel[173] = new ModelRendererTurbo(this, 38, 170, textureX, textureY); // Box 13
		bodyModel[174] = new ModelRendererTurbo(this, 2, 169, textureX, textureY); // Box 13
		bodyModel[175] = new ModelRendererTurbo(this, 275, 167, textureX, textureY); // Box 175
		bodyModel[176] = new ModelRendererTurbo(this, 227, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[177] = new ModelRendererTurbo(this, 227, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[178] = new ModelRendererTurbo(this, 227, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[179] = new ModelRendererTurbo(this, 227, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[180] = new ModelRendererTurbo(this, 240, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[181] = new ModelRendererTurbo(this, 240, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[182] = new ModelRendererTurbo(this, 240, 125, textureX, textureY, "cull"); // Conrail A-arms cull
		bodyModel[183] = new ModelRendererTurbo(this, 240, 125, textureX, textureY, "cull"); // Conrail A-arms cull

		bodyModel[0].addBox(0F, 0F, 0F, 37, 7, 17, 0F); // Box 11 cull
		bodyModel[0].setRotationPoint(-37.5F, -7.25F, -8.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 37, 6, 5, 0F); // Box 13
		bodyModel[1].setRotationPoint(0.5F, -13.25F, -2.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 37, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[2].setRotationPoint(0.5F, -13.25F, 2.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 37, 6, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(0.5F, -13.25F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 74 Hook thing cull
		bodyModel[4].setRotationPoint(16F, -17F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[5].setRotationPoint(29.5F, -15F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[6].setRotationPoint(7.5F, -14F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[7].setRotationPoint(7.5F, -15F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[8].setRotationPoint(29.5F, -14F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74 Hook thing cull
		bodyModel[9].setRotationPoint(29.5F, -15F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[10].setRotationPoint(7.5F, -14F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74 Hook thing cull
		bodyModel[11].setRotationPoint(7.5F, -15F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 37, 7, 17, 0F); // Box 11 Cull
		bodyModel[12].setRotationPoint(0.5F, -7.25F, -8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 37, 6, 5, 0F); // Box 13
		bodyModel[13].setRotationPoint(-37.5F, -13.25F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 37, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[14].setRotationPoint(-37.5F, -13.25F, 2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 37, 6, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[15].setRotationPoint(-37.5F, -13.25F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 74 Hook thing cull
		bodyModel[16].setRotationPoint(-22F, -17F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[17].setRotationPoint(-8.5F, -14F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[18].setRotationPoint(-8.5F, -15F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[19].setRotationPoint(-30.5F, -14F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[20].setRotationPoint(-30.5F, -15F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[21].setRotationPoint(-8.5F, -14F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74 Hook thing cull
		bodyModel[22].setRotationPoint(-8.5F, -15F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[23].setRotationPoint(-30.5F, -14F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 74 Hook thing cull
		bodyModel[24].setRotationPoint(-30.5F, -15F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 34
		bodyModel[25].setRotationPoint(0.5F, -4F, 8.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 34
		bodyModel[26].setRotationPoint(0.5F, -4F, -9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 34
		bodyModel[27].setRotationPoint(-37.5F, -4F, 8.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 34
		bodyModel[28].setRotationPoint(-37.5F, -4F, -9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 0, 19, 0F); // Box 38
		bodyModel[29].setRotationPoint(0F, -4F, -9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 0, 17, 0F); // Box 38
		bodyModel[30].setRotationPoint(37F, -4F, -8.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 0, 17, 0F); // Box 38
		bodyModel[31].setRotationPoint(-38F, -4F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 0, 19, 0F); // Box 38
		bodyModel[32].setRotationPoint(-1F, -4F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13 GTW mega coil stuff
		bodyModel[33].setRotationPoint(-0.5F, -13.25F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13  GTW mega coil stuff
		bodyModel[34].setRotationPoint(-0.5F, -13.25F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 37, 5, 12, 0F); // Box 19
		bodyModel[35].setRotationPoint(-37.5F, -11.25F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[36].setRotationPoint(0.5F, -13.25F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[37].setRotationPoint(0.5F, -13.25F, 0F);

		bodyModel[38].addBox(0F, 0F, 0F, 37, 5, 12, 0F); // Box 19
		bodyModel[38].setRotationPoint(0.5F, -11.25F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing cull
		bodyModel[39].setRotationPoint(-30.5F, -14F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing cull
		bodyModel[40].setRotationPoint(-8.5F, -14F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing cull
		bodyModel[41].setRotationPoint(7.5F, -14F, -9F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing cull
		bodyModel[42].setRotationPoint(29.5F, -14F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[43].setRotationPoint(29.5F, -14F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[44].setRotationPoint(7.5F, -14F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[45].setRotationPoint(29.5F, -14F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[46].setRotationPoint(7.5F, -14F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[47].setRotationPoint(-8.5F, -14F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[48].setRotationPoint(-30.5F, -14F, 4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[49].setRotationPoint(-8.5F, -14F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[50].setRotationPoint(-30.5F, -14F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 64 cull
		bodyModel[51].setRotationPoint(-22F, -17F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64 cull
		bodyModel[52].setRotationPoint(-22F, -17F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 64 cull
		bodyModel[53].setRotationPoint(16F, -17F, 0F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 74 Hook thing cull
		bodyModel[54].setRotationPoint(29.5F, -14F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[55].setRotationPoint(-37.5F, -13.25F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[56].setRotationPoint(-37.5F, -13.25F, 0F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 6, 17, 0F); // Box 80  GTW mega coil stuff
		bodyModel[57].setRotationPoint(-0.5F, -6.25F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 74 Hook thing cull
		bodyModel[58].setRotationPoint(-3F, -17F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 64 cull GTW mega coil stuff
		bodyModel[59].setRotationPoint(-3F, -17F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64 cull GTW mega coil stuff
		bodyModel[60].setRotationPoint(-3F, -17F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing  GTW mega coil stuff
		bodyModel[61].setRotationPoint(18.5F, -14F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[62].setRotationPoint(-19.5F, -14F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 61, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 94 round coil brace cull
		bodyModel[63].setRotationPoint(-30.5F, -14F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95 cull
		bodyModel[64].setRotationPoint(16F, -17F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.85F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[65].setRotationPoint(36.5F, -13.25F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, -0.85F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[66].setRotationPoint(36.5F, -13.25F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[67].setRotationPoint(36.5F, -6.25F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[68].setRotationPoint(36.5F, -11.25F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[69].setRotationPoint(36.5F, -6.25F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.85F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 13
		bodyModel[70].setRotationPoint(0.5F, -13.25F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.85F, -2F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 13
		bodyModel[71].setRotationPoint(0.5F, -13.25F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[72].setRotationPoint(0.5F, -6.25F, 5.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[73].setRotationPoint(0.5F, -11.25F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[74].setRotationPoint(0.5F, -6.25F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.85F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[75].setRotationPoint(-1.5F, -13.25F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, -0.85F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[76].setRotationPoint(-1.5F, -13.25F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[77].setRotationPoint(-1.5F, -6.25F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[78].setRotationPoint(-1.5F, -11.25F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[79].setRotationPoint(-1.5F, -6.25F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.85F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 13
		bodyModel[80].setRotationPoint(-37.5F, -13.25F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.85F, -2F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 13
		bodyModel[81].setRotationPoint(-37.5F, -13.25F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[82].setRotationPoint(-37.5F, -6.25F, 5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[83].setRotationPoint(-37.5F, -11.25F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[84].setRotationPoint(-37.5F, -6.25F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 123
		bodyModel[85].setRotationPoint(18.5F, -6.25F, -9.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 123
		bodyModel[86].setRotationPoint(18.5F, -6.25F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 13
		bodyModel[87].setRotationPoint(18.5F, -14.25F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[88].setRotationPoint(18.5F, -14.25F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[89].setRotationPoint(27.5F, -8.25F, -9.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[90].setRotationPoint(27.5F, -8.25F, 6.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[91].setRotationPoint(9.5F, -8.25F, -9.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[92].setRotationPoint(9.5F, -8.25F, 6.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 123
		bodyModel[93].setRotationPoint(-19.5F, -6.25F, -9.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 123
		bodyModel[94].setRotationPoint(-19.5F, -6.25F, 8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 13
		bodyModel[95].setRotationPoint(-19.5F, -14.25F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[96].setRotationPoint(-19.5F, -14.25F, -7F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[97].setRotationPoint(-10.5F, -8.25F, -9.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[98].setRotationPoint(-10.5F, -8.25F, 6.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[99].setRotationPoint(-28.5F, -8.25F, -9.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 129
		bodyModel[100].setRotationPoint(-28.5F, -8.25F, 6.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[101].setRotationPoint(-34F, -14F, -3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[102].setRotationPoint(-34F, -9F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[103].setRotationPoint(-34F, -9F, 3.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[104].setRotationPoint(-34F, -2F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[105].setRotationPoint(-34F, -9F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[106].setRotationPoint(-34F, -9F, 1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[107].setRotationPoint(-34F, -4F, 1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[108].setRotationPoint(-34F, -4F, -3.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[109].setRotationPoint(-22F, -14F, -3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[110].setRotationPoint(-22F, -9F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[111].setRotationPoint(-22F, -9F, 3.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[112].setRotationPoint(-22F, -2F, -3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[113].setRotationPoint(-22F, -9F, -3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[114].setRotationPoint(-22F, -9F, 1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[115].setRotationPoint(-22F, -4F, 1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[116].setRotationPoint(-22F, -4F, -3.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[117].setRotationPoint(12F, -14F, -3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[118].setRotationPoint(12F, -9F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[119].setRotationPoint(12F, -9F, 3.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[120].setRotationPoint(12F, -2F, -3.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[121].setRotationPoint(12F, -9F, -3.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[122].setRotationPoint(12F, -9F, 1.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[123].setRotationPoint(12F, -4F, 1.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[124].setRotationPoint(12F, -4F, -3.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 2 she coil on my gon till i...
		bodyModel[125].setRotationPoint(24F, -14F, -3.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 3 she coil on my gon till i...
		bodyModel[126].setRotationPoint(24F, -9F, -8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 7, 5, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 she coil on my gon till i...
		bodyModel[127].setRotationPoint(24F, -9F, 3.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 5 she coil on my gon till i...
		bodyModel[128].setRotationPoint(24F, -2F, -3.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6 she coil on my gon till i...
		bodyModel[129].setRotationPoint(24F, -9F, -3.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7 she coil on my gon till i...
		bodyModel[130].setRotationPoint(24F, -9F, 1.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8 she coil on my gon till i...
		bodyModel[131].setRotationPoint(24F, -4F, 1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 she coil on my gon till i...
		bodyModel[132].setRotationPoint(24F, -4F, -3.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[133].setRotationPoint(29.5F, -14F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing
		bodyModel[134].setRotationPoint(-30.5F, -15F, -10.22F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[135].setRotationPoint(7.5F, -14F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[136].setRotationPoint(29.5F, -14F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[137].setRotationPoint(7.5F, -14F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[138].setRotationPoint(-8.5F, -14F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing cull
		bodyModel[139].setRotationPoint(-30.5F, -14F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[140].setRotationPoint(-8.5F, -14F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing cull
		bodyModel[141].setRotationPoint(-30.5F, -14F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 37, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[142].setRotationPoint(0.5F, -11.25F, 6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 37, 5, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[143].setRotationPoint(0.5F, -11.25F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing
		bodyModel[144].setRotationPoint(-8.5F, -15F, -10.22F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing
		bodyModel[145].setRotationPoint(7.5F, -15F, -10.22F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing
		bodyModel[146].setRotationPoint(29.5F, -15F, -10.22F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing
		bodyModel[147].setRotationPoint(-30.5F, -15F, 9.22F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing
		bodyModel[148].setRotationPoint(-8.5F, -15F, 9.22F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing
		bodyModel[149].setRotationPoint(7.5F, -15F, 9.22F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing
		bodyModel[150].setRotationPoint(29.5F, -15F, 9.22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 37, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[151].setRotationPoint(-37.5F, -11.25F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 37, 5, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[152].setRotationPoint(-37.5F, -11.25F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[153].setRotationPoint(18.5F, -14F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[154].setRotationPoint(18.5F, -15F, -10.22F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[155].setRotationPoint(18.5F, -15F, 9.22F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[156].setRotationPoint(-19.5F, -14F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[157].setRotationPoint(-19.5F, -14F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 2F, 0.01F, 0F, 2F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[158].setRotationPoint(-19.5F, -15F, -10.22F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[159].setRotationPoint(-19.5F, -15F, 9.22F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 4F, 0F, -0.01F, 4F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 74 Hook thing GTW mega coil stuff
		bodyModel[160].setRotationPoint(18.5F, -14F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13 GTW mega coil stuff
		bodyModel[161].setRotationPoint(-0.5F, -11.25F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13  GTW mega coil stuff
		bodyModel[162].setRotationPoint(-0.5F, -11.25F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.85F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F); // Box 13
		bodyModel[163].setRotationPoint(0.5F, -11.25F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.85F, 0F, -3F, -0.475F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F); // Box 13
		bodyModel[164].setRotationPoint(0.5F, -11.25F, 6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[165].setRotationPoint(-1.5F, -11.25F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -3F, -0.85F, 0F, -3F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[166].setRotationPoint(-1.5F, -11.25F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[167].setRotationPoint(18.5F, -12.25F, 6.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[168].setRotationPoint(18.5F, -12.25F, -9.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[169].setRotationPoint(-19.5F, -12.25F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[170].setRotationPoint(-19.5F, -12.25F, -9.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[171].setRotationPoint(36.5F, -11.25F, 6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -3F, -0.85F, 0F, -3F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[172].setRotationPoint(36.5F, -11.25F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.85F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.475F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.475F, 0F, 0F); // Box 13
		bodyModel[173].setRotationPoint(-37.5F, -11.25F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.85F, 0F, -3F, -0.475F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.475F, 0F, -0.5F); // Box 13
		bodyModel[174].setRotationPoint(-37.5F, -11.25F, 6F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 175
		bodyModel[175].setRotationPoint(27.5F, -8.25F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Conrail A-arms cull
		bodyModel[176].setRotationPoint(5.5F, -13F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Conrail A-arms cull
		bodyModel[177].setRotationPoint(27.5F, -13F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Conrail A-arms cull
		bodyModel[178].setRotationPoint(5.5F, -13F, 8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Conrail A-arms cull
		bodyModel[179].setRotationPoint(27.5F, -13F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Conrail A-arms cull
		bodyModel[180].setRotationPoint(-32.5F, -13F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Conrail A-arms cull
		bodyModel[181].setRotationPoint(-10.5F, -13F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Conrail A-arms cull
		bodyModel[182].setRotationPoint(-32.5F, -13F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Conrail A-arms cull
		bodyModel[183].setRotationPoint(-10.5F, -13F, 8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
	}
}

//wowie