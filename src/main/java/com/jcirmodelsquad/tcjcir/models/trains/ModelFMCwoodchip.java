//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.05.2026 - 11:14:41
// Last changed on: 10.05.2026 - 11:14:41

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFMCwoodchip extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFMCwoodchip() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[154];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 23, 130, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 204, 132, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 204, 132, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 147, 29, textureX, textureY); // Box 95
		bodyModel[6] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 95
		bodyModel[7] = new ModelRendererTurbo(this, 49, 54, textureX, textureY); // Box 95
		bodyModel[8] = new ModelRendererTurbo(this, 286, 97, textureX, textureY); // Box 95
		bodyModel[9] = new ModelRendererTurbo(this, 49, 78, textureX, textureY); // Box 95
		bodyModel[10] = new ModelRendererTurbo(this, 286, 84, textureX, textureY); // Box 95
		bodyModel[11] = new ModelRendererTurbo(this, 56, 78, textureX, textureY); // Box 95
		bodyModel[12] = new ModelRendererTurbo(this, 217, 84, textureX, textureY); // Box 95
		bodyModel[13] = new ModelRendererTurbo(this, 140, 29, textureX, textureY); // Box 95
		bodyModel[14] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 95
		bodyModel[15] = new ModelRendererTurbo(this, 49, 29, textureX, textureY); // Box 95
		bodyModel[16] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[17] = new ModelRendererTurbo(this, 140, 78, textureX, textureY); // Box 95
		bodyModel[18] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[19] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 56, 29, textureX, textureY); // Box 95
		bodyModel[21] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 95
		bodyModel[22] = new ModelRendererTurbo(this, 217, 84, textureX, textureY); // Box 95
		bodyModel[23] = new ModelRendererTurbo(this, 133, 78, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 91, 29, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 63, 29, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 16, 63, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 16, 60, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 98, 29, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 95
		bodyModel[30] = new ModelRendererTurbo(this, 77, 29, textureX, textureY); // Box 95
		bodyModel[31] = new ModelRendererTurbo(this, 70, 29, textureX, textureY); // Box 95
		bodyModel[32] = new ModelRendererTurbo(this, 126, 29, textureX, textureY); // Box 95
		bodyModel[33] = new ModelRendererTurbo(this, 119, 29, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 112, 29, textureX, textureY); // Box 95
		bodyModel[35] = new ModelRendererTurbo(this, 105, 29, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 16, 57, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 16, 54, textureX, textureY); // Box 36
		bodyModel[38] = new ModelRendererTurbo(this, 133, 29, textureX, textureY); // Box 95
		bodyModel[39] = new ModelRendererTurbo(this, 35, 69, textureX, textureY); // Box 36
		bodyModel[40] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 36
		bodyModel[41] = new ModelRendererTurbo(this, 5, 139, textureX, textureY, "cull"); // top edge stiffener and placard cull
		bodyModel[42] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 95
		bodyModel[43] = new ModelRendererTurbo(this, 265, 84, textureX, textureY); // Box 95
		bodyModel[44] = new ModelRendererTurbo(this, 147, 78, textureX, textureY); // Box 95
		bodyModel[45] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[46] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[47] = new ModelRendererTurbo(this, 126, 78, textureX, textureY); // Box 95
		bodyModel[48] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[49] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 119, 78, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[52] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[53] = new ModelRendererTurbo(this, 112, 78, textureX, textureY); // Box 95
		bodyModel[54] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[56] = new ModelRendererTurbo(this, 105, 78, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[58] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[59] = new ModelRendererTurbo(this, 98, 78, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[61] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // Box 95
		bodyModel[63] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[65] = new ModelRendererTurbo(this, 84, 78, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[67] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 77, 78, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[70] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 70, 78, textureX, textureY); // Box 95
		bodyModel[72] = new ModelRendererTurbo(this, 244, 97, textureX, textureY); // Box 95
		bodyModel[73] = new ModelRendererTurbo(this, 244, 84, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 63, 78, textureX, textureY); // Box 95
		bodyModel[75] = new ModelRendererTurbo(this, 15, 15, textureX, textureY); // Box 36
		bodyModel[76] = new ModelRendererTurbo(this, 15, 12, textureX, textureY); // Box 36
		bodyModel[77] = new ModelRendererTurbo(this, 15, 9, textureX, textureY); // Box 36
		bodyModel[78] = new ModelRendererTurbo(this, 15, 6, textureX, textureY); // Box 36
		bodyModel[79] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 36
		bodyModel[80] = new ModelRendererTurbo(this, 34, 18, textureX, textureY); // Box 36
		bodyModel[81] = new ModelRendererTurbo(this, 30, 104, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 337, 83, textureX, textureY, "cull"); // ladder cull
		bodyModel[83] = new ModelRendererTurbo(this, 337, 71, textureX, textureY, "cull"); // ladder cull
		bodyModel[84] = new ModelRendererTurbo(this, 15, 75, textureX, textureY); // Box 72
		bodyModel[85] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 27, 74, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 37, 75, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 350, 71, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 14, 21, textureX, textureY); // end brake wheel stuff 1
		bodyModel[90] = new ModelRendererTurbo(this, 14, 23, textureX, textureY); // end brake wheel stuff 4
		bodyModel[91] = new ModelRendererTurbo(this, 27, 22, textureX, textureY); // end brake wheel stuff 2
		bodyModel[92] = new ModelRendererTurbo(this, 29, 31, textureX, textureY); // end brake wheel stuff 3
		bodyModel[93] = new ModelRendererTurbo(this, 261, 3, textureX, textureY); // End Door
		bodyModel[94] = new ModelRendererTurbo(this, 219, 3, textureX, textureY); // End Door
		bodyModel[95] = new ModelRendererTurbo(this, 254, 44, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 239, 44, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 249, 44, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 244, 44, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 303, 25, textureX, textureY); // Box 92
		bodyModel[100] = new ModelRendererTurbo(this, 304, 48, textureX, textureY); // Box 92
		bodyModel[101] = new ModelRendererTurbo(this, 295, 44, textureX, textureY); // Box 98
		bodyModel[102] = new ModelRendererTurbo(this, 280, 44, textureX, textureY); // Box 98
		bodyModel[103] = new ModelRendererTurbo(this, 290, 44, textureX, textureY); // Box 98
		bodyModel[104] = new ModelRendererTurbo(this, 285, 44, textureX, textureY); // Box 98
		bodyModel[105] = new ModelRendererTurbo(this, 348, 25, textureX, textureY); // Box 92
		bodyModel[106] = new ModelRendererTurbo(this, 349, 48, textureX, textureY); // Box 92
		bodyModel[107] = new ModelRendererTurbo(this, 348, 2, textureX, textureY); // Box 92
		bodyModel[108] = new ModelRendererTurbo(this, 269, 44, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 269, 44, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 227, 49, textureX, textureY, "cull"); // end ladder cull
		bodyModel[111] = new ModelRendererTurbo(this, 13, 32, textureX, textureY, "cull"); // brake platform cull
		bodyModel[112] = new ModelRendererTurbo(this, 228, 44, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 228, 44, textureX, textureY); // Box 112
		bodyModel[114] = new ModelRendererTurbo(this, 268, 49, textureX, textureY, "cull"); // end ladder cull
		bodyModel[115] = new ModelRendererTurbo(this, 279, 68, textureX, textureY); // Box 112
		bodyModel[116] = new ModelRendererTurbo(this, 238, 68, textureX, textureY); // Box 112
		bodyModel[117] = new ModelRendererTurbo(this, 9, 125, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 193, 126, textureX, textureY); // Box 317
		bodyModel[119] = new ModelRendererTurbo(this, 180, 125, textureX, textureY); // Box 318
		bodyModel[120] = new ModelRendererTurbo(this, 18, 129, textureX, textureY); // Box 286
		bodyModel[121] = new ModelRendererTurbo(this, 18, 129, textureX, textureY); // Box 287
		bodyModel[122] = new ModelRendererTurbo(this, 160, 125, textureX, textureY); // Box 118
		bodyModel[123] = new ModelRendererTurbo(this, 171, 125, textureX, textureY); // Box 119
		bodyModel[124] = new ModelRendererTurbo(this, 149, 125, textureX, textureY); // Box 196
		bodyModel[125] = new ModelRendererTurbo(this, 221, 133, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 216, 124, textureX, textureY, "cull"); // Box 131 cull
		bodyModel[127] = new ModelRendererTurbo(this, 205, 124, textureX, textureY, "cull"); // Box 132 cull
		bodyModel[128] = new ModelRendererTurbo(this, 26, 82, textureX, textureY); // Box 133
		bodyModel[129] = new ModelRendererTurbo(this, 217, 134, textureX, textureY, "cull"); // Box 134 cull
		bodyModel[130] = new ModelRendererTurbo(this, 290, 67, textureX, textureY, "cull"); // Box 15 cut bar support cull
		bodyModel[131] = new ModelRendererTurbo(this, 277, 76, textureX, textureY); // Box 81
		bodyModel[132] = new ModelRendererTurbo(this, 251, 67, textureX, textureY, "cull"); // Box 15 cut bar support cull
		bodyModel[133] = new ModelRendererTurbo(this, 235, 76, textureX, textureY); // Box 81
		bodyModel[134] = new ModelRendererTurbo(this, 63, 125, textureX, textureY); // Box 130
		bodyModel[135] = new ModelRendererTurbo(this, 140, 125, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[136] = new ModelRendererTurbo(this, 140, 125, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[137] = new ModelRendererTurbo(this, 22, 81, textureX, textureY); // Box 132 Ratchet brake
		bodyModel[138] = new ModelRendererTurbo(this, 303, 2, textureX, textureY); // Box 92
		bodyModel[139] = new ModelRendererTurbo(this, 350, 71, textureX, textureY); // Box 92
		bodyModel[140] = new ModelRendererTurbo(this, 350, 71, textureX, textureY); // Box 92
		bodyModel[141] = new ModelRendererTurbo(this, 350, 71, textureX, textureY); // Box 92
		bodyModel[142] = new ModelRendererTurbo(this, 320, 97, textureX, textureY, "cull"); // stirrup cull
		bodyModel[143] = new ModelRendererTurbo(this, 338, 97, textureX, textureY, "cull"); // stirrup cull
		bodyModel[144] = new ModelRendererTurbo(this, 329, 97, textureX, textureY, "cull"); // stirrup cull
		bodyModel[145] = new ModelRendererTurbo(this, 311, 97, textureX, textureY, "cull"); // stirrup cull
		bodyModel[146] = new ModelRendererTurbo(this, 311, 71, textureX, textureY, "cull"); // ladder cull
		bodyModel[147] = new ModelRendererTurbo(this, 324, 71, textureX, textureY, "cull"); // Box 155 cull ladder
		bodyModel[148] = new ModelRendererTurbo(this, 37, 43, textureX, textureY); // end brake wheel stuff 1
		bodyModel[149] = new ModelRendererTurbo(this, 34, 45, textureX, textureY); // end brake wheel stuff 4
		bodyModel[150] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // end brake wheel stuff 2
		bodyModel[151] = new ModelRendererTurbo(this, 13, 40, textureX, textureY, "cull"); // brake platform cull
		bodyModel[152] = new ModelRendererTurbo(this, 213, 123, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[153] = new ModelRendererTurbo(this, 16, 85, textureX, textureY); // Box 153

		bodyModel[0].addBox(0F, 0F, 0F, 85, 2, 5, 0F); // Box 52
		bodyModel[0].setRotationPoint(-42.5F, 3F, -2.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-45.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[2].setRotationPoint(42.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[3].setRotationPoint(30.5F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(30.5F, 5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[5].setRotationPoint(41.5F, -19F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 83, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		bodyModel[6].setRotationPoint(-41.5F, -19F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 83, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 95
		bodyModel[7].setRotationPoint(-41.5F, -19F, 9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[8].setRotationPoint(41.5F, 3F, -11.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[9].setRotationPoint(41.5F, -19F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[10].setRotationPoint(41.5F, 3F, 2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[11].setRotationPoint(32F, -19F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[12].setRotationPoint(30.5F, 3F, 2.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[13].setRotationPoint(32F, -19F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[14].setRotationPoint(30.5F, 3F, -11.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[15].setRotationPoint(-42.5F, -19F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[16].setRotationPoint(-26.5F, 3F, -11.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[17].setRotationPoint(-33F, -19F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[18].setRotationPoint(-26.5F, 3F, 2.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[19].setRotationPoint(-34.5F, 5F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[20].setRotationPoint(-33F, -19F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[21].setRotationPoint(-34.5F, 3F, -11.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[22].setRotationPoint(-34.5F, 3F, 2.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[23].setRotationPoint(-26.5F, -19F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[24].setRotationPoint(-5.5F, -19F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[25].setRotationPoint(-26.5F, -19F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[26].setRotationPoint(-41.5F, -5F, 9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[27].setRotationPoint(-41.5F, -12F, 9.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[28].setRotationPoint(-0.5F, -19F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[29].setRotationPoint(-10.5F, -19F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[30].setRotationPoint(-15.5F, -19F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[31].setRotationPoint(-20.5F, -19F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[32].setRotationPoint(19.5F, -19F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[33].setRotationPoint(14.5F, -19F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[34].setRotationPoint(9.5F, -19F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[35].setRotationPoint(4.5F, -19F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(26.5F, -5F, 9.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[37].setRotationPoint(26.5F, -12F, 9.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[38].setRotationPoint(25.5F, -19F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[39].setRotationPoint(20.5F, -8.5F, 9.63F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[40].setRotationPoint(-25.5F, -8.5F, 9.63F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 85, 22, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F); // top edge stiffener and placard cull
		bodyModel[41].setRotationPoint(-42.5F, -19.01F, -11.01F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[42].setRotationPoint(-42.5F, 3F, -11.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[43].setRotationPoint(-42.5F, 3F, 2.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[44].setRotationPoint(-42.5F, -19F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[45].setRotationPoint(-20.5F, 3F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[46].setRotationPoint(-20.5F, 3F, 2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[47].setRotationPoint(-20.5F, -19F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[48].setRotationPoint(-15.5F, 3F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[49].setRotationPoint(-15.5F, 3F, 2.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[50].setRotationPoint(-15.5F, -19F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[51].setRotationPoint(-10.5F, 3F, -11.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[52].setRotationPoint(-10.5F, 3F, 2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[53].setRotationPoint(-10.5F, -19F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[54].setRotationPoint(-5.5F, 3F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[55].setRotationPoint(-5.5F, 3F, 2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[56].setRotationPoint(-5.5F, -19F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[57].setRotationPoint(-0.5F, 3F, -11.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[58].setRotationPoint(-0.5F, 3F, 2.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[59].setRotationPoint(-0.5F, -19F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[60].setRotationPoint(4.5F, 3F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[61].setRotationPoint(4.5F, 3F, 2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[62].setRotationPoint(4.5F, -19F, 9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[63].setRotationPoint(9.5F, 3F, -11.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[64].setRotationPoint(9.5F, 3F, 2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[65].setRotationPoint(9.5F, -19F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[66].setRotationPoint(14.5F, 3F, -11.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[67].setRotationPoint(14.5F, 3F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[68].setRotationPoint(14.5F, -19F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[69].setRotationPoint(19.5F, 3F, -11.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[70].setRotationPoint(19.5F, 3F, 2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[71].setRotationPoint(19.5F, -19F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[72].setRotationPoint(25.5F, 3F, -11.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 95
		bodyModel[73].setRotationPoint(25.5F, 3F, 2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 22, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[74].setRotationPoint(25.5F, -19F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[75].setRotationPoint(26.5F, -5F, -10.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[76].setRotationPoint(26.5F, -12F, -10.75F);

		bodyModel[77].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[77].setRotationPoint(-41.5F, -5F, -10.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 36
		bodyModel[78].setRotationPoint(-41.5F, -12F, -10.75F);

		bodyModel[79].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[79].setRotationPoint(-25.5F, -8.5F, -10.63F);

		bodyModel[80].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 36
		bodyModel[80].setRotationPoint(20.5F, -8.5F, -10.63F);

		bodyModel[81].addBox(0F, 0F, 0F, 83, 1, 17, 0F); // Box 83
		bodyModel[81].setRotationPoint(-41.5F, 2F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // ladder cull
		bodyModel[82].setRotationPoint(39F, -5F, 9.01F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // ladder cull
		bodyModel[83].setRotationPoint(-42F, -5F, -11.01F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[84].setRotationPoint(-38.5F, -3.5F, 11.25F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[85].setRotationPoint(-37F, -2F, 10.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[86].setRotationPoint(-38F, -3.5F, 9.49F);

		bodyModel[87].addFlexTrapezoid(0F, 0F, 0F, 0, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[87].setRotationPoint(-36.5F, -1F, 9.49F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[88].setRotationPoint(-26.5F, -19F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // end brake wheel stuff 1
		bodyModel[89].setRotationPoint(-43.75F, -18F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // end brake wheel stuff 4
		bodyModel[90].setRotationPoint(-43.75F, -16.5F, 3.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // end brake wheel stuff 2
		bodyModel[91].setRotationPoint(-42.99F, -18F, 2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 22, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // end brake wheel stuff 3
		bodyModel[92].setRotationPoint(-43.49F, -15.5F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // End Door
		bodyModel[93].setRotationPoint(41F, -19F, -9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, -0.95F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F); // End Door
		bodyModel[94].setRotationPoint(-41.5F, -19F, -9.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[95].setRotationPoint(-42.5F, -18F, -7F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[96].setRotationPoint(-42.5F, -18F, 6F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[97].setRotationPoint(-42.5F, -18F, -3F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[98].setRotationPoint(-42.5F, -18F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,-0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F); // Box 92
		bodyModel[99].setRotationPoint(-42.5F, -12F, -10.8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.5F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F); // Box 92
		bodyModel[100].setRotationPoint(-42.5F, -5F, -10.15F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[101].setRotationPoint(41.5F, -18F, 6F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[102].setRotationPoint(41.5F, -18F, -7F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[103].setRotationPoint(41.5F, -18F, 2F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 98
		bodyModel[104].setRotationPoint(41.5F, -18F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 92
		bodyModel[105].setRotationPoint(41.5F, -12F, -10.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 92
		bodyModel[106].setRotationPoint(41.5F, -5F, -9.85F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[107].setRotationPoint(41.5F, -19F, -10.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[108].setRotationPoint(42.5F, 3.5F, -10.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[109].setRotationPoint(42.5F, 3.5F, 6.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 19, 4, 0F); // end ladder cull
		bodyModel[110].setRotationPoint(42F, -18F, -10.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // brake platform cull
		bodyModel[111].setRotationPoint(-44.51F, -15F, 2F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[112].setRotationPoint(-43.5F, 3.5F, 6.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[113].setRotationPoint(-43.5F, 3.5F, -10.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 19, 4, 0F); // end ladder cull
		bodyModel[114].setRotationPoint(-43F, -18F, 6.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[115].setRotationPoint(42.5F, 1F, 6.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 112
		bodyModel[116].setRotationPoint(-43.5F, 1F, -10.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 26, 0, 1, 0F); // Box 122
		bodyModel[117].setRotationPoint(-32.5F, 5.5F, 9.49F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[118].setRotationPoint(1.5F, 5.5F, 6.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[119].setRotationPoint(0.5F, 3.5F, 6.5F);

		bodyModel[120].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 286
		bodyModel[120].setRotationPoint(2.5F, 5F, -6.5F);
		bodyModel[120].rotateAngleX = -0.78539816F;
		bodyModel[120].rotateAngleY = -1.57079633F;

		bodyModel[121].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[121].setRotationPoint(2.5F, 5F, -4.5F);
		bodyModel[121].rotateAngleX = -0.78539816F;
		bodyModel[121].rotateAngleY = -1.57079633F;

		bodyModel[122].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[122].setRotationPoint(-3.5F, 6.1F, 5F);
		bodyModel[122].rotateAngleX = -0.78539816F;

		bodyModel[123].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[123].setRotationPoint(-5.5F, 6.1F, 5F);
		bodyModel[123].rotateAngleX = -0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, -4F, 1, 0, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[124].setRotationPoint(-7.5F, 5.51F, 9.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 130
		bodyModel[125].setRotationPoint(-7.5F, 6F, 4.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F); // Box 131 cull
		bodyModel[126].setRotationPoint(2F, 3F, -8.51F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 132 cull
		bodyModel[127].setRotationPoint(-3F, 3.01F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 133
		bodyModel[128].setRotationPoint(-36.5F, 3F, 9.49F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134 cull
		bodyModel[129].setRotationPoint(-20.5F, 4F, 9.25F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[130].setRotationPoint(42.53F, 3F, -10.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[131].setRotationPoint(42.51F, 5F, -11F);
		bodyModel[131].rotateAngleY = 1.41371669F;

		bodyModel[132].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[132].setRotationPoint(-43.53F, 3F, 8.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[133].setRotationPoint(-42.51F, 5F, 11F);
		bodyModel[133].rotateAngleY = -1.72787596F;

		bodyModel[134].addBox(0F, 0F, 0F, 38, 1, 0, 0F); // Box 130
		bodyModel[134].setRotationPoint(-43.5F, 5F, 4.01F);
		bodyModel[134].rotateAngleY = 0.02617994F;
		bodyModel[134].rotateAngleZ = -0.01745329F;

		bodyModel[135].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 126 cull
		bodyModel[135].setRotationPoint(-9F, 3F, 6F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 126 cull
		bodyModel[136].setRotationPoint(-9F, 3F, 8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132 Ratchet brake
		bodyModel[137].setRotationPoint(-37F, -2F, 10.5F);
		bodyModel[137].rotateAngleY = 0.01745329F;
		bodyModel[137].rotateAngleZ = -0.29670597F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[138].setRotationPoint(-42.5F, -19F, -10.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[139].setRotationPoint(9.5F, -19F, -9.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[140].setRotationPoint(25.5F, -19F, -9.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 92
		bodyModel[141].setRotationPoint(-10.5F, -19F, -9.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // stirrup cull
		bodyModel[142].setRotationPoint(-41.99F, 2.01F, -10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // stirrup cull
		bodyModel[143].setRotationPoint(-41.99F, 2.01F, 9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // stirrup cull
		bodyModel[144].setRotationPoint(38.99F, 2.01F, 9.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // stirrup cull
		bodyModel[145].setRotationPoint(38.99F, 2.01F, -10.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.55F, 0F, 0F, -1.55F); // ladder cull
		bodyModel[146].setRotationPoint(39F, -18.99F, -11.01F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 22, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155 cull ladder
		bodyModel[147].setRotationPoint(-42F, -18.99F, 8.01F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // end brake wheel stuff 1
		bodyModel[148].setRotationPoint(-43.75F, -5F, 2F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // end brake wheel stuff 4
		bodyModel[149].setRotationPoint(-43.75F, -3.5F, 3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // end brake wheel stuff 2
		bodyModel[150].setRotationPoint(-42.99F, -5F, 2.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // brake platform cull
		bodyModel[151].setRotationPoint(-44.51F, -2F, 2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 cull
		bodyModel[152].setRotationPoint(-36.51F, 3F, 9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 153
		bodyModel[153].setRotationPoint(-36.48F, 5F, 9.46F);
		bodyModel[153].rotateAngleZ = 0.78539816F;
	}
	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(((AbstractTrains) entity).getColor() == 17 || ((AbstractTrains) entity).getColor() == 16 || ((AbstractTrains) entity).getColor() == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-2.03,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.07,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}