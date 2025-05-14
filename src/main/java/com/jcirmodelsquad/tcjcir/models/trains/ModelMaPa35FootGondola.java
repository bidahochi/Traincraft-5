///This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 18.11.2021 - 11:29:10
// Last changed on: 18.11.2021 - 11:29:10

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruck_Small;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelMaPa35FootGondola extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelMaPa35FootGondola() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[108];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 35
		bodyModel[4] = new ModelRendererTurbo(this, 47, 23, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 37
		bodyModel[6] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 13, 51, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 194
		bodyModel[13] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 195
		bodyModel[14] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 26, 23, textureX, textureY,"cull"); // Box 54 CULL
		bodyModel[21] = new ModelRendererTurbo(this, 26, 23, textureX, textureY,"cull"); // Box 55 CULL
		bodyModel[22] = new ModelRendererTurbo(this, 35, 23, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 35, 23, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 26, 30, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 104
		bodyModel[38] = new ModelRendererTurbo(this, 55, 51, textureX, textureY); // Box 286
		bodyModel[39] = new ModelRendererTurbo(this, 66, 51, textureX, textureY); // Box 287
		bodyModel[40] = new ModelRendererTurbo(this, 93, 53, textureX, textureY); // Box 196
		bodyModel[41] = new ModelRendererTurbo(this, 85, 53, textureX, textureY); // Box 197
		bodyModel[42] = new ModelRendererTurbo(this, 85, 51, textureX, textureY); // Box 198
		bodyModel[43] = new ModelRendererTurbo(this, 102, 52, textureX, textureY); // Box 199
		bodyModel[44] = new ModelRendererTurbo(this, 102, 52, textureX, textureY); // Box 200
		bodyModel[45] = new ModelRendererTurbo(this, 95, 53, textureX, textureY); // Box 201
		bodyModel[46] = new ModelRendererTurbo(this, 85, 51, textureX, textureY); // Box 202
		bodyModel[47] = new ModelRendererTurbo(this, 85, 51, textureX, textureY); // Box 203
		bodyModel[48] = new ModelRendererTurbo(this, 85, 51, textureX, textureY); // Box 204
		bodyModel[49] = new ModelRendererTurbo(this, 73, 26, textureX, textureY); // Box 222
		bodyModel[50] = new ModelRendererTurbo(this, 73, 26, textureX, textureY); // Box 223
		bodyModel[51] = new ModelRendererTurbo(this, 92, 23, textureX, textureY,"cull"); // Box 118 CULL
		bodyModel[52] = new ModelRendererTurbo(this, 73, 23, textureX, textureY); // Box 119
		bodyModel[53] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 120
		bodyModel[54] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 121
		bodyModel[55] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 123
		bodyModel[57] = new ModelRendererTurbo(this, 94, 23, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 13, 51, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 94, 23, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 38, 51, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 13, 51, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 38, 51, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 13, 51, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 97, 45, textureX, textureY,"cull"); // Box 73 CULL
		bodyModel[71] = new ModelRendererTurbo(this, 122, 45, textureX, textureY,"cull"); // Box 74 CULL
		bodyModel[72] = new ModelRendererTurbo(this, 122, 45, textureX, textureY,"cull"); // Box 75 CULL
		bodyModel[73] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 200
		bodyModel[74] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 201
		bodyModel[75] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 85
		bodyModel[77] = new ModelRendererTurbo(this, 86, 22, textureX, textureY); // Box 202
		bodyModel[78] = new ModelRendererTurbo(this, 43, 22, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 122, 45, textureX, textureY,"cull"); // Box 88 CULL
		bodyModel[80] = new ModelRendererTurbo(this, 97, 45, textureX, textureY,"cull"); // Box 89 CULL
		bodyModel[81] = new ModelRendererTurbo(this, 122, 45, textureX, textureY,"cull"); // Box 90 CULL
		bodyModel[82] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 152
		bodyModel[83] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 94
		bodyModel[86] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 99
		bodyModel[91] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 104
		bodyModel[96] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 105
		bodyModel[97] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 107
		bodyModel[99] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 110
		bodyModel[102] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 111
		bodyModel[103] = new ModelRendererTurbo(this, 116, 0, textureX, textureY); // Box 112
		bodyModel[104] = new ModelRendererTurbo(this, 116, 0, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 120, 10, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 120, 10, textureX, textureY); // Box 115
		bodyModel[107] = new ModelRendererTurbo(this, 115, 25, textureX, textureY); // Box 116

		bodyModel[0].addBox(0F, 0F, 0F, 47, 1, 21, 0F); // Box 76
		bodyModel[0].setRotationPoint(-23.5F, 1F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[1].setRotationPoint(-13.25F, 2.62F, 9.3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 33
		bodyModel[2].setRotationPoint(-19.5F, 2.62F, 9.3F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // Box 35
		bodyModel[3].setRotationPoint(-25.5F, 1F, -10.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // Box 36
		bodyModel[4].setRotationPoint(23.5F, 1F, -10.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 41, 2, 1, 0F); // Box 37
		bodyModel[5].setRotationPoint(-20.5F, 2F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 41, 2, 1, 0F); // Box 38
		bodyModel[6].setRotationPoint(-20.5F, 2F, 9F);

		bodyModel[7].addBox(0F, 0F, 0F, 47, 2, 1, 0F); // Box 39
		bodyModel[7].setRotationPoint(-23.5F, 1.5F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 47, 2, 1, 0F); // Box 40
		bodyModel[8].setRotationPoint(-23.5F, 1.5F, 3F);

		bodyModel[9].addBox(0F, 0F, 0F, 47, 2, 1, 0F); // Box 41
		bodyModel[9].setRotationPoint(-23.5F, 1.5F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 47, 2, 1, 0F); // Box 42
		bodyModel[10].setRotationPoint(-23.5F, 1.5F, -4F);

		bodyModel[11].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 43
		bodyModel[11].setRotationPoint(-15.5F, 2F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[12].setRotationPoint(-18.5F, 2F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[13].setRotationPoint(-18.5F, 2F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 47
		bodyModel[14].setRotationPoint(15.5F, 2F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[15].setRotationPoint(15.5F, 2F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[16].setRotationPoint(-23.5F, 2F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		bodyModel[17].setRotationPoint(-23.5F, 2F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[18].setRotationPoint(20.5F, 2F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[19].setRotationPoint(20.5F, 2F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54 CULL
		bodyModel[20].setRotationPoint(23.5F, 3F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55 CULL
		bodyModel[21].setRotationPoint(-25.5F, 3F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 56
		bodyModel[22].setRotationPoint(-18F, 4.5F, -1F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 57
		bodyModel[23].setRotationPoint(16F, 4.5F, -1F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 58
		bodyModel[24].setRotationPoint(-29.5F, 3F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 61
		bodyModel[25].setRotationPoint(-6.75F, 2.62F, 9.3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 79
		bodyModel[26].setRotationPoint(18.5F, 2.62F, 9.3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 82
		bodyModel[27].setRotationPoint(12.25F, 2.62F, 9.3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 83
		bodyModel[28].setRotationPoint(5.75F, 2.62F, 9.3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 85
		bodyModel[29].setRotationPoint(-0.5F, 2.62F, 9.3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 90
		bodyModel[30].setRotationPoint(-13.25F, 2.62F, -11.3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
		bodyModel[31].setRotationPoint(-19.5F, 2.62F, -11.3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 94
		bodyModel[32].setRotationPoint(-6.75F, 2.62F, -11.3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 96
		bodyModel[33].setRotationPoint(18.5F, 2.62F, -11.3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 99
		bodyModel[34].setRotationPoint(12.25F, 2.62F, -11.3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 100
		bodyModel[35].setRotationPoint(5.75F, 2.62F, -11.3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 102
		bodyModel[36].setRotationPoint(-0.5F, 2.62F, -11.3F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 104
		bodyModel[37].setRotationPoint(25.5F, 3F, -1.5F);

		bodyModel[38].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[38].setRotationPoint(-3F, 6F, -2F);
		bodyModel[38].rotateAngleX = -0.78539816F;

		bodyModel[39].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[39].setRotationPoint(0F, 6F, -2F);
		bodyModel[39].rotateAngleX = -0.78539816F;

		bodyModel[40].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[40].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[40].rotateAngleY = -0.52359878F;

		bodyModel[41].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 197
		bodyModel[41].setRotationPoint(-2F, 3.5F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[42].setRotationPoint(-9.5F, 6F, -2.5F);

		bodyModel[43].addBox(-0.5F, -1F, -0.5F, 1, 4, 1, 0F); // Box 199
		bodyModel[43].setRotationPoint(-8F, 3.01F, 0F);
		bodyModel[43].rotateAngleY = -0.52359878F;

		bodyModel[44].addBox(-0.5F, -1F, -0.5F, 1, 4, 1, 0F); // Box 200
		bodyModel[44].setRotationPoint(6F, 3.01F, 0F);
		bodyModel[44].rotateAngleY = -0.26179939F;

		bodyModel[45].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[45].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[45].rotateAngleY = -0.26179939F;

		bodyModel[46].addBox(-8.5F, 0F, 2F, 10, 0, 1, 0F); // Box 202
		bodyModel[46].setRotationPoint(-8F, 6.01F, -0.5F);
		bodyModel[46].rotateAngleY = 0.2268928F;
		bodyModel[46].rotateAngleZ = 0.05235988F;

		bodyModel[47].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[47].setRotationPoint(-8F, 6F, 0F);

		bodyModel[48].addBox(-1F, 0F, -1.5F, 12, 0, 1, 0F); // Box 204
		bodyModel[48].setRotationPoint(6F, 6.01F, -0.5F);
		bodyModel[48].rotateAngleY = 0.17453293F;
		bodyModel[48].rotateAngleZ = -0.05235988F;

		bodyModel[49].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 222
		bodyModel[49].setRotationPoint(-25F, -5F, 4.5F);

		bodyModel[50].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[50].setRotationPoint(-24.5F, -4.5F, 4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118 CULL
		bodyModel[51].setRotationPoint(-25F, 3.01F, 4.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 119
		bodyModel[52].setRotationPoint(-25F, 3F, 4.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 120
		bodyModel[53].setRotationPoint(-23.5F, 2F, -10.05F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 121
		bodyModel[54].setRotationPoint(-23.5F, 2F, 10.05F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 122
		bodyModel[55].setRotationPoint(20.5F, 2F, 10.05F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 123
		bodyModel[56].setRotationPoint(20.5F, 2F, -10.05F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 57
		bodyModel[57].setRotationPoint(-4.5F, 2F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 58
		bodyModel[58].setRotationPoint(4.5F, 2F, -2F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 59
		bodyModel[59].setRotationPoint(3.5F, 2F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 60
		bodyModel[60].setRotationPoint(-3.5F, 2F, -2F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 61
		bodyModel[61].setRotationPoint(-18.5F, 2F, -2F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 62
		bodyModel[62].setRotationPoint(15.5F, 2F, -2F);

		bodyModel[63].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 63
		bodyModel[63].setRotationPoint(4.5F, 2F, 1F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // Box 64
		bodyModel[64].setRotationPoint(-3.5F, 2F, 1F);

		bodyModel[65].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 65
		bodyModel[65].setRotationPoint(-15.5F, 2F, 1F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 66
		bodyModel[66].setRotationPoint(-23.5F, 2F, 1F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 67
		bodyModel[67].setRotationPoint(-23.5F, 2F, -2F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 68
		bodyModel[68].setRotationPoint(18.5F, 2F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 69
		bodyModel[69].setRotationPoint(18.5F, 2F, 1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73 CULL
		bodyModel[70].setRotationPoint(-4.5F, 5F, 3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 74 CULL
		bodyModel[71].setRotationPoint(-10.5F, 2.5F, 3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 75 CULL
		bodyModel[72].setRotationPoint(4.5F, 2.5F, 3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[73].setRotationPoint(25.5F, 2F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[74].setRotationPoint(25.5F, 5F, -1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[75].setRotationPoint(-26.5F, 2F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 85
		bodyModel[76].setRotationPoint(-26.5F, 5F, -1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[77].setRotationPoint(-25.5F, 1.25F, -1F);
		bodyModel[77].rotateAngleZ = -0.6981317F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[78].setRotationPoint(25.5F, 1.25F, -10F);
		bodyModel[78].rotateAngleZ = 0.6981317F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 88 CULL
		bodyModel[79].setRotationPoint(-10.5F, 2.5F, -6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89 CULL
		bodyModel[80].setRotationPoint(-4.5F, 5F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Box 90 CULL
		bodyModel[81].setRotationPoint(4.5F, 2.5F, -6.5F);

		bodyModel[82].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[82].setRotationPoint(22F, 1F, -7.5F);

		bodyModel[83].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[83].setRotationPoint(12.25F, 5F, 10F);

		bodyModel[84].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[84].setRotationPoint(5.75F, 5F, 10F);

		bodyModel[85].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[85].setRotationPoint(-0.5F, 5F, 10F);

		bodyModel[86].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[86].setRotationPoint(-13.25F, 5F, 10F);

		bodyModel[87].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[87].setRotationPoint(-6.75F, 5F, 10F);

		bodyModel[88].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[88].setRotationPoint(-19.5F, 5F, 10F);

		bodyModel[89].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 98
		bodyModel[89].setRotationPoint(18.5F, 5F, -11F);

		bodyModel[90].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 99
		bodyModel[90].setRotationPoint(12.25F, 5F, -11F);

		bodyModel[91].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 100
		bodyModel[91].setRotationPoint(5.75F, 5F, -11F);

		bodyModel[92].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[92].setRotationPoint(-0.5F, 5F, -11F);

		bodyModel[93].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		bodyModel[93].setRotationPoint(-13.25F, 5F, -11F);

		bodyModel[94].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[94].setRotationPoint(-6.75F, 5F, -11F);

		bodyModel[95].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		bodyModel[95].setRotationPoint(-19.5F, 5F, -11F);

		bodyModel[96].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[96].setRotationPoint(22F, 1F, 6.5F);

		bodyModel[97].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[97].setRotationPoint(-23F, 1F, 6.5F);

		bodyModel[98].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[98].setRotationPoint(-23F, 1F, -7.5F);

		bodyModel[99].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[99].setRotationPoint(-23F, 1F, 1.5F);

		bodyModel[100].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[100].setRotationPoint(-23F, 1F, -2.5F);

		bodyModel[101].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[101].setRotationPoint(22F, 1F, 1.5F);

		bodyModel[102].addShapeBox(0F, -8F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[102].setRotationPoint(22F, 1F, -2.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 45, 8, 1, 0F); // Box 112
		bodyModel[103].setRotationPoint(-22.5F, -7F, -10.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 45, 8, 1, 0F); // Box 113
		bodyModel[104].setRotationPoint(-22.5F, -7F, 9.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 8, 19, 0F); // Box 114
		bodyModel[105].setRotationPoint(-22.5F, -7F, -9.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 8, 19, 0F); // Box 115
		bodyModel[106].setRotationPoint(21.5F, -7F, -9.5F);

		bodyModel[107].addShapeBox(0F, -12F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[107].setRotationPoint(18.5F, 5F, 10F);
	}
	ModelFrictionTruck_Small bogie = new ModelFrictionTruck_Small();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 108; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.09,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.18,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}