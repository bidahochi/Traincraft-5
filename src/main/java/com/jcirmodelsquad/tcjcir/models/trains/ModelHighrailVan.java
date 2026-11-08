//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.06.2020 - 20:41:53
// Last changed on: 09.06.2020 - 20:41:53

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelHighrailVan extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHighrailVan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[72];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 51
		bodyModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 52
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 57
		bodyModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 58
		bodyModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
		bodyModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 62
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 57
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 58
		bodyModel[23] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 509
		bodyModel[24] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 70
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 12
		bodyModel[26] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 12
		bodyModel[27] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 369, 1, textureX, textureY, "lamp"); // Box 38 light
		bodyModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY, "lamp"); // Box 38 light
		bodyModel[30] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 54
		bodyModel[32] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 505
		bodyModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 93
		bodyModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 94
		bodyModel[37] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 95
		bodyModel[38] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 96
		bodyModel[39] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 97
		bodyModel[40] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 98
		bodyModel[41] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 101
		bodyModel[44] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 102
		bodyModel[45] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 103
		bodyModel[46] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 104
		bodyModel[47] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 105
		bodyModel[48] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 106
		bodyModel[49] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 107
		bodyModel[50] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 108
		bodyModel[51] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 109
		bodyModel[52] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 110
		bodyModel[53] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 111
		bodyModel[54] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 112
		bodyModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 114
		bodyModel[57] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 115
		bodyModel[58] = new ModelRendererTurbo(this, 241, 9, textureX, textureY, "commander"); // Box 162 light
		bodyModel[59] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 165
		bodyModel[60] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 76

		bodyModel[0].addBox(0F, 0F, 0F, 14, 3, 16, 0F); // Box 1
		bodyModel[0].setRotationPoint(-4F, 3F, -8F);

		bodyModel[1].addBox(0F, 0F, -2F, 13, 16, 1, 0F); // Box 5
		bodyModel[1].setRotationPoint(-3F, -13F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 9, 16, 0F); // Box 11
		bodyModel[2].setRotationPoint(-4F, -6F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[3].setRotationPoint(-13F, 3F, -8F);

		bodyModel[4].addShapeBox(0F, -14F, 0F, 9, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		bodyModel[4].setRotationPoint(-13F, 1F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		bodyModel[5].setRotationPoint(-13F, -13F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,-1F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 12
		bodyModel[6].setRotationPoint(-13F, -14F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(-13F, -13F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(-13F, -13F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(-4F, -13F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-4F, -13F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[11].setRotationPoint(-14F, -5F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[12].setRotationPoint(-12F, -6F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[13].setRotationPoint(21F, 3F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // Box 47
		bodyModel[14].setRotationPoint(10F, 3F, -5F);

		bodyModel[15].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 51
		bodyModel[15].setRotationPoint(10F, 2F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 52
		bodyModel[16].setRotationPoint(10F, 1F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 57
		bodyModel[17].setRotationPoint(15F, 6F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 58
		bodyModel[18].setRotationPoint(12F, 3F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 59
		bodyModel[19].setRotationPoint(12F, 3F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 62
		bodyModel[20].setRotationPoint(-4F, -13F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 57
		bodyModel[21].setRotationPoint(-11F, 1F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 58
		bodyModel[22].setRotationPoint(-7F, -8F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 509
		bodyModel[23].setRotationPoint(21F, -13F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 70
		bodyModel[24].setRotationPoint(-13F, -13F, -7F);
		bodyModel[24].rotateAngleZ = -0.12217305F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[25].setRotationPoint(-27F, -3F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F); // Box 12
		bodyModel[26].setRotationPoint(-26F, -3F, -8F);
		bodyModel[26].rotateAngleZ = 0.15707963F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 12
		bodyModel[27].setRotationPoint(-26F, -3F, -8F);
		bodyModel[27].rotateAngleZ = 0.15707963F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 38 light
		bodyModel[28].setRotationPoint(-28F, -2F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 38 light
		bodyModel[29].setRotationPoint(-28F, -2F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 53
		bodyModel[30].setRotationPoint(-27F, 4F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 54
		bodyModel[31].setRotationPoint(-25F, 2F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 505
		bodyModel[32].setRotationPoint(-26F, -3F, 7F);
		bodyModel[32].rotateAngleZ = 0.15707963F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 62
		bodyModel[33].setRotationPoint(-28F, -2F, -4F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 4, 16, 0F); // Box 63
		bodyModel[34].setRotationPoint(-15F, 2F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 93
		bodyModel[35].setRotationPoint(-23F, 3F, -7F);

		bodyModel[36].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 94
		bodyModel[36].setRotationPoint(-23F, 3F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 95
		bodyModel[37].setRotationPoint(-20F, 6F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[38].setRotationPoint(-27F, 2F, -8F);

		bodyModel[39].addBox(0F, 0F, 0F, 9, 2, 16, 0F); // Box 97
		bodyModel[39].setRotationPoint(-13F, 4F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 98
		bodyModel[40].setRotationPoint(17F, 6F, 2F);

		bodyModel[41].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 99
		bodyModel[41].setRotationPoint(-19F, 6F, -1F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 100
		bodyModel[42].setRotationPoint(-31F, 8F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 101
		bodyModel[43].setRotationPoint(-32F, 7F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 102
		bodyModel[44].setRotationPoint(-32F, 7F, 6F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 103
		bodyModel[45].setRotationPoint(-31F, 5F, -5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 104
		bodyModel[46].setRotationPoint(-31F, 5F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F); // Box 105
		bodyModel[47].setRotationPoint(-31F, 3F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 106
		bodyModel[48].setRotationPoint(-29F, 3F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 107
		bodyModel[49].setRotationPoint(-29F, 3F, 4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F); // Box 108
		bodyModel[50].setRotationPoint(29F, 3F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 109
		bodyModel[51].setRotationPoint(28F, 7F, 6F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[52].setRotationPoint(29F, 5F, 4F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 111
		bodyModel[53].setRotationPoint(29F, 5F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 112
		bodyModel[54].setRotationPoint(28F, 7F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 113
		bodyModel[55].setRotationPoint(29F, 8F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 114
		bodyModel[56].setRotationPoint(26F, 3.05F, -5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 115
		bodyModel[57].setRotationPoint(26F, 3.05F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 light
		bodyModel[58].setRotationPoint(-9.5F, -15.25F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[59].setRotationPoint(-9.32F, -14.25F, -0.5F);

		bodyModel[60].addBox(0F, 0F, -2F, 11, 14, 1, 0F); // Box 71
		bodyModel[60].setRotationPoint(10F, -13F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 72
		bodyModel[61].setRotationPoint(21F, -13F, 7F);

		bodyModel[62].addBox(0F, 0F, -2F, 13, 16, 1, 0F); // Box 74
		bodyModel[62].setRotationPoint(-3F, -13F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 29, 1, 16, 0F); // Box 76
		bodyModel[63].setRotationPoint(-3F, -14F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 17, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 67
		bodyModel[64].setRotationPoint(25F, -13F, -7F);

		bodyModel[65].addBox(-1F, 0F, 0F, 1, 2, 3, 0F); // Box 68
		bodyModel[65].setRotationPoint(22F, 1F, -7F);

		bodyModel[66].addBox(-1F, 0F, 0F, 1, 2, 3, 0F); // Box 69
		bodyModel[66].setRotationPoint(10F, 1F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 72
		bodyModel[67].setRotationPoint(10F, 2F, 4F);

		bodyModel[68].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 73
		bodyModel[68].setRotationPoint(10F, 1F, 4F);

		bodyModel[69].addBox(0F, 0F, -2F, 11, 14, 1, 0F); // Box 74
		bodyModel[69].setRotationPoint(10F, -13F, 9F);

		bodyModel[70].addBox(-1F, 0F, 0F, 1, 2, 3, 0F); // Box 75
		bodyModel[70].setRotationPoint(22F, 1F, 4F);

		bodyModel[71].addBox(-1F, 0F, 0F, 1, 2, 3, 0F); // Box 76
		bodyModel[71].setRotationPoint(10F, 1F, 4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
			}
			m.render(f5);
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}
		}
	}
}