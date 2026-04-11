//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.03.2024 - 13:29:07
// Last changed on: 28.03.2024 - 13:29:07

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeB;
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

import java.util.ArrayList;

public class ModelDD55 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelDD55() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[135];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 42
		bodyModel[13] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 43
		bodyModel[14] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 45
		bodyModel[15] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 66
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		bodyModel[26] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 75
		bodyModel[27] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 72
		bodyModel[64] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 76
		bodyModel[68] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 81
		bodyModel[72] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 82
		bodyModel[73] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 83
		bodyModel[74] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 84
		bodyModel[75] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 248
		bodyModel[88] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 250
		bodyModel[89] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 249
		bodyModel[90] = new ModelRendererTurbo(this, 241, 57, textureX, textureY, "lamp"); // HEADLAMP
		bodyModel[91] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 177, 89, textureX, textureY, "lamp"); // HEADLAMP
		bodyModel[93] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 314
		bodyModel[95] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 316
		bodyModel[96] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 445
		bodyModel[97] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 448
		bodyModel[98] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[99] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 453
		bodyModel[100] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 454
		bodyModel[101] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[102] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[103] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[104] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 128 weird lifting lugs
		bodyModel[105] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 153
		bodyModel[111] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 111
		bodyModel[115] = new ModelRendererTurbo(this, 241, 1, textureX, textureY, "lamp"); // Box 184 numberboard glow
		bodyModel[116] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 125
		bodyModel[117] = new ModelRendererTurbo(this, 121, 41, textureX, textureY, "lamp"); // Box 126 numberbruh
		bodyModel[118] = new ModelRendererTurbo(this, 193, 145, textureX, textureY, "lamp"); // Box 127 numberbruh
		bodyModel[119] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 89, 153, textureX, textureY, "lamp"); // Box 129 numberbruh
		bodyModel[121] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 131
		bodyModel[123] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 1, 204, textureX, textureY); // Box 67
		bodyModel[130] = new ModelRendererTurbo(this, 10, 200, textureX, textureY); // Box 70
		bodyModel[131] = new ModelRendererTurbo(this, 20, 203, textureX, textureY); // Box 67
		bodyModel[132] = new ModelRendererTurbo(this, 1, 213, textureX, textureY); // Box 67
		bodyModel[133] = new ModelRendererTurbo(this, 1, 195, textureX, textureY); // Box 70
		bodyModel[134] = new ModelRendererTurbo(this, 37, 203, textureX, textureY); // Box 120

		bodyModel[0].addBox(0F, 0F, 0F, 79, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[1].setRotationPoint(-40.5F, -9F, 9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 23
		bodyModel[2].setRotationPoint(-40.5F, -9F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(-40.5F, -11F, 9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[4].setRotationPoint(-40.5F, -11F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[5].setRotationPoint(-40.5F, -11F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(-40.5F, -10F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[7].setRotationPoint(-40.5F, -10F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 35
		bodyModel[8].setRotationPoint(-41F, -13F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[9].setRotationPoint(-40.5F, -11F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 39
		bodyModel[10].setRotationPoint(-40.5F, -10F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[11].setRotationPoint(-39.5F, -12F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[12].setRotationPoint(-39.5F, -12F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 43
		bodyModel[13].setRotationPoint(-39.5F, -11F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[14].setRotationPoint(-39.5F, -12F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[15].setRotationPoint(-39.5F, -12F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 8, 12, 1, 0F); // Box 49
		bodyModel[16].setRotationPoint(-38.5F, -10F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[17].setRotationPoint(-39.5F, -12F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[18].setRotationPoint(-30.5F, -10F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[19].setRotationPoint(-30.5F, -11F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[20].setRotationPoint(-30.5F, -12F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[21].setRotationPoint(-30.5F, -12F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[22].setRotationPoint(-30.5F, -12F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[23].setRotationPoint(-30.5F, -12F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[24].setRotationPoint(-30.5F, -11F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 69, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[25].setRotationPoint(-29.5F, -10F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 69, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[26].setRotationPoint(-29.5F, -10F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-40.5F, -11F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 45
		bodyModel[28].setRotationPoint(-40.5F, -11F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 46
		bodyModel[29].setRotationPoint(-40.5F, -12F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-40.5F, -12F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[31].setRotationPoint(-40.5F, -12F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[32].setRotationPoint(-29.5F, -17F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[33].setRotationPoint(-26.5F, -18F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[34].setRotationPoint(-26.5F, -19F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 41, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[35].setRotationPoint(-26.5F, -19F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-26.5F, -18F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 41, 1, 10, 0F); // Box 58
		bodyModel[37].setRotationPoint(-26.5F, -19F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 6, 18, 0F); // Box 52
		bodyModel[38].setRotationPoint(-41.5F, 2F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[39].setRotationPoint(-41.5F, 2F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 54
		bodyModel[40].setRotationPoint(-41.5F, 2F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 55
		bodyModel[41].setRotationPoint(-30.5F, -12.5F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(-28.5F, -18F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(-28.5F, -18F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(-28.5F, -19F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(-28.5F, -19F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(-28.5F, -19F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-28.5F, -18F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(-28.5F, -18F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-28.5F, -17F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-28.5F, -17F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-28.5F, -11F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[52].setRotationPoint(-28.5F, -11F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 66, 7, 1, 0F); // Box 69
		bodyModel[53].setRotationPoint(-26.5F, -17F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 66, 7, 1, 0F); // Box 70
		bodyModel[54].setRotationPoint(-26.5F, -17F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 19, 20, 0F); // Box 71
		bodyModel[55].setRotationPoint(38.5F, -17F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 72
		bodyModel[56].setRotationPoint(38.5F, -18F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 24, 4, 20, 0F); // Box 73
		bodyModel[57].setRotationPoint(-12.5F, 3F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(-39.5F, 3F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(-39.5F, 3F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 24, 2, 18, 0F); // Box 69
		bodyModel[60].setRotationPoint(-12.5F, 7F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[61].setRotationPoint(-12.5F, 7F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 24, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[62].setRotationPoint(-12.5F, 7F, 9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[63].setRotationPoint(-29.5F, -10F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[64].setRotationPoint(-29.5F, -11F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 4, 22, 0F); // Box 74
		bodyModel[65].setRotationPoint(37.5F, 3F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 12, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[66].setRotationPoint(-28.5F, -10F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 76
		bodyModel[67].setRotationPoint(-14.5F, -17F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 77
		bodyModel[68].setRotationPoint(-14.5F, -18F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 79
		bodyModel[69].setRotationPoint(-44.5F, 3F, -1.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 80
		bodyModel[70].setRotationPoint(39.5F, 3F, -1.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 81
		bodyModel[71].setRotationPoint(-27.5F, 3F, -2F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 82
		bodyModel[72].setRotationPoint(22.5F, 3F, -2F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 83
		bodyModel[73].setRotationPoint(-6.5F, 3F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 84
		bodyModel[74].setRotationPoint(-6.5F, 3F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[75].setRotationPoint(-2.5F, -8F, -13F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[76].setRotationPoint(-6.5F, -8F, -13F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[77].setRotationPoint(-6.5F, -8F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[78].setRotationPoint(-2.5F, -8F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[79].setRotationPoint(35.5F, -19F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(35.5F, -19F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[81].setRotationPoint(35.5F, -18F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[82].setRotationPoint(35.5F, -19F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[83].setRotationPoint(35.5F, -18F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 22, 3, 22, 0F); // Box 96
		bodyModel[84].setRotationPoint(14.5F, -20F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[85].setRotationPoint(-12.5F, -20F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 98
		bodyModel[86].setRotationPoint(-12.5F, -20F, 6F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[87].setRotationPoint(-25.5F, -21F, -1F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[88].setRotationPoint(-25F, -21F, 0.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[89].setRotationPoint(-23.5F, -20F, -0.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // HEADLAMP
		bodyModel[90].setRotationPoint(-41.25F, -13F, -1.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 35, 2, 0, 0F); // Box 103
		bodyModel[91].setRotationPoint(-20.5F, -21F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // HEADLAMP
		bodyModel[92].setRotationPoint(-41.25F, -8F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 105
		bodyModel[93].setRotationPoint(-41F, -8F, -1.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 314
		bodyModel[94].setRotationPoint(39.5F, -14F, -4F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 316
		bodyModel[95].setRotationPoint(39.5F, -14F, 3F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 445
		bodyModel[96].setRotationPoint(39.5F, -15F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448
		bodyModel[97].setRotationPoint(39.5F, 1F, -5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[98].setRotationPoint(39F, -12F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[99].setRotationPoint(39.5F, -14F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 454
		bodyModel[100].setRotationPoint(39.5F, -14F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[101].setRotationPoint(39.5F, -17F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[102].setRotationPoint(39.5F, -17F, -3F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128 weird lifting lugs
		bodyModel[103].setRotationPoint(39.5F, -17F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 weird lifting lugs
		bodyModel[104].setRotationPoint(39.5F, -17F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(41F, -13F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(41F, -13F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[107].setRotationPoint(40.5F, -14F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[108].setRotationPoint(40.5F, -14.5F, -3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(41F, -16F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[110].setRotationPoint(41F, -16F, 1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(41F, -16F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(41F, -14F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[113].setRotationPoint(40.5F, -14F, -4F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[114].setRotationPoint(-28.75F, -18.5F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 184 numberboard glow
		bodyModel[115].setRotationPoint(-28.76F, -18.5F, -9F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 125
		bodyModel[116].setRotationPoint(-28.75F, -18.5F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 126 numberbruh
		bodyModel[117].setRotationPoint(-28.76F, -18.5F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F); // Box 127 numberbruh
		bodyModel[118].setRotationPoint(-38.5F, -9.5F, -11.26F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 128
		bodyModel[119].setRotationPoint(-38.5F, -9.5F, -11.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F); // Box 129 numberbruh
		bodyModel[120].setRotationPoint(-38.5F, -9.5F, 10.26F);

		bodyModel[121].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 130
		bodyModel[121].setRotationPoint(-38.5F, -9.5F, 9.24999999999999F);

		bodyModel[122].addBox(0F, 0F, 1F, 1, 1, 2, 0F); // Box 131
		bodyModel[122].setRotationPoint(-11.5F, 2F, -12F);
		bodyModel[122].rotateAngleX = -0.48869219F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[123].setRotationPoint(-39.5F, -9F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(-40.5F, -11F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[125].setRotationPoint(-39.5F, -9F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 8, 12, 1, 0F); // Box 133
		bodyModel[126].setRotationPoint(-38.5F, -10F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 134
		bodyModel[127].setRotationPoint(-40.5F, -9F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[128].setRotationPoint(-39.5F, -11F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 5, 3, 0F); // Box 67
		bodyModel[129].setRotationPoint(-24.5F, -9F, -2F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 70
		bodyModel[130].setRotationPoint(-25.5F, -12F, 1F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 67
		bodyModel[131].setRotationPoint(-19.5F, -13F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 67
		bodyModel[132].setRotationPoint(-24.5F, -13F, -2F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 70
		bodyModel[133].setRotationPoint(-26.5F, -10F, 1F);

		bodyModel[134].addBox(0F, 0F, 0F, 12, 6, 20, 0F); // Box 120
		bodyModel[134].setRotationPoint(-26.5F, -4F, -10F);
	}

	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.27, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6546) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.27, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.15, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}