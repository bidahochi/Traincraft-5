//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.06.2020 - 20:41:53
// Last changed on: 09.06.2020 - 20:41:53

package com.jcirmodelsquad.tcjcir.models.trains;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelHighrailTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHighrailTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 33
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 42
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 44
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 58
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 59
		bodyModel[23] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 57
		bodyModel[25] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 58
		bodyModel[26] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 509
		bodyModel[27] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 510
		bodyModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 511
		bodyModel[29] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 81
		bodyModel[35] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 82
		bodyModel[36] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 12
		bodyModel[37] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 12
		bodyModel[38] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 12
		bodyModel[39] = new ModelRendererTurbo(this, 313, 25, textureX, textureY, "lamp"); // Box 38 light
		bodyModel[40] = new ModelRendererTurbo(this, 337, 25, textureX, textureY, "lamp"); // Box 38 light
		bodyModel[41] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 505
		bodyModel[44] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 93
		bodyModel[47] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 94
		bodyModel[48] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 95
		bodyModel[49] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 96
		bodyModel[50] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 97
		bodyModel[51] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 98
		bodyModel[52] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 99
		bodyModel[53] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 100
		bodyModel[54] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 101
		bodyModel[55] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 102
		bodyModel[56] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 103
		bodyModel[57] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 104
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 105
		bodyModel[59] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 106
		bodyModel[60] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 107
		bodyModel[61] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 108
		bodyModel[62] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 109
		bodyModel[63] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 110
		bodyModel[64] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 111
		bodyModel[65] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 112
		bodyModel[66] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		bodyModel[67] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 114
		bodyModel[68] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 115
		bodyModel[69] = new ModelRendererTurbo(this, 3, 45, textureX, textureY, "commander"); // Box 162 light
		bodyModel[70] = new ModelRendererTurbo(this, 3, 39, textureX, textureY); // Box 165

		bodyModel[0].addBox(0F, 0F, 0F, 14, 3, 16, 0F); // Box 1
		bodyModel[0].setRotationPoint(-4F, 3F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 13, 7, 3, 0F); // Box 4
		bodyModel[1].setRotationPoint(-3F, -4F, -8F);

		bodyModel[2].addBox(0F, 0F, -2F, 13, 7, 3, 0F); // Box 5
		bodyModel[2].setRotationPoint(-3F, -4F, 7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 9, 16, 0F); // Box 11
		bodyModel[3].setRotationPoint(-4F, -6F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[4].setRotationPoint(-13F, 3F, -8F);

		bodyModel[5].addShapeBox(0F, -14F, 0F, 9, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		bodyModel[5].setRotationPoint(-13F, 1F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		bodyModel[6].setRotationPoint(-13F, -13F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,-1F, -0.75F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -1F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 12
		bodyModel[7].setRotationPoint(-13F, -14F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(-13F, -13F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(-13F, -13F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-4F, -13F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-4F, -13F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 33
		bodyModel[12].setRotationPoint(-14F, -5F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[13].setRotationPoint(-12F, -6F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 42
		bodyModel[14].setRotationPoint(25F, -4F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[15].setRotationPoint(21F, 3F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // Box 47
		bodyModel[16].setRotationPoint(10F, 3F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 7, 3, 0F); // Box 50
		bodyModel[17].setRotationPoint(21F, -4F, -8F);

		bodyModel[18].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 51
		bodyModel[18].setRotationPoint(10F, 0F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 52
		bodyModel[19].setRotationPoint(10F, -4F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 57
		bodyModel[20].setRotationPoint(15F, 6F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 58
		bodyModel[21].setRotationPoint(12F, 3F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 59
		bodyModel[22].setRotationPoint(12F, 3F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 62
		bodyModel[23].setRotationPoint(-4F, -13F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 57
		bodyModel[24].setRotationPoint(-11F, 1F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 58
		bodyModel[25].setRotationPoint(-7F, -8F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 7, 3, 0F); // Box 509
		bodyModel[26].setRotationPoint(21F, -4F, 5F);

		bodyModel[27].addBox(0F, 0F, 0F, 11, 3, 1, 0F); // Box 510
		bodyModel[27].setRotationPoint(10F, 0F, 4F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 511
		bodyModel[28].setRotationPoint(10F, -4F, 4F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 7, 8, 0F); // Box 64
		bodyModel[29].setRotationPoint(-2F, -4F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 65
		bodyModel[30].setRotationPoint(0F, -5F, -3F);

		bodyModel[31].addBox(0F, 0F, 0F, 12, 6, 4, 0F); // Box 66
		bodyModel[31].setRotationPoint(6F, -3F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[32].setRotationPoint(0F, -6F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 70
		bodyModel[33].setRotationPoint(-13F, -13F, -7F);
		bodyModel[33].rotateAngleZ = -0.12217305F;

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 81
		bodyModel[34].setRotationPoint(13F, -5F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[35].setRotationPoint(13F, -6F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 14, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[36].setRotationPoint(-27F, -3F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 2, 16, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F); // Box 12
		bodyModel[37].setRotationPoint(-26F, -3F, -8F);
		bodyModel[37].rotateAngleZ = 0.15707963F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 12
		bodyModel[38].setRotationPoint(-26F, -3F, -8F);
		bodyModel[38].rotateAngleZ = 0.15707963F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 38 light
		bodyModel[39].setRotationPoint(-28F, -2F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 38 light
		bodyModel[40].setRotationPoint(-28F, -2F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 53
		bodyModel[41].setRotationPoint(-27F, 4F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 54
		bodyModel[42].setRotationPoint(-25F, 2F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 505
		bodyModel[43].setRotationPoint(-26F, -3F, 7F);
		bodyModel[43].rotateAngleZ = 0.15707963F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-28F, -2F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 4, 16, 0F); // Box 63
		bodyModel[45].setRotationPoint(-15F, 2F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 93
		bodyModel[46].setRotationPoint(-23F, 3F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 94
		bodyModel[47].setRotationPoint(-23F, 3F, 5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 95
		bodyModel[48].setRotationPoint(-20F, 6F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[49].setRotationPoint(-27F, 2F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 2, 16, 0F); // Box 97
		bodyModel[50].setRotationPoint(-13F, 4F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 98
		bodyModel[51].setRotationPoint(17F, 6F, 2F);

		bodyModel[52].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 99
		bodyModel[52].setRotationPoint(-19F, 6F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 100
		bodyModel[53].setRotationPoint(-31F, 8F, -6F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 101
		bodyModel[54].setRotationPoint(-32F, 7F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 102
		bodyModel[55].setRotationPoint(-32F, 7F, 6F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 103
		bodyModel[56].setRotationPoint(-31F, 5F, -5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 104
		bodyModel[57].setRotationPoint(-31F, 5F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F); // Box 105
		bodyModel[58].setRotationPoint(-31F, 3F, -8F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 106
		bodyModel[59].setRotationPoint(-29F, 3F, -5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 107
		bodyModel[60].setRotationPoint(-29F, 3F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.8F, 0F); // Box 108
		bodyModel[61].setRotationPoint(29F, 3F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 109
		bodyModel[62].setRotationPoint(28F, 7F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[63].setRotationPoint(29F, 5F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 111
		bodyModel[64].setRotationPoint(29F, 5F, -5F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 112
		bodyModel[65].setRotationPoint(28F, 7F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 113
		bodyModel[66].setRotationPoint(29F, 8F, -6F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 114
		bodyModel[67].setRotationPoint(26F, 3F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 115
		bodyModel[68].setRotationPoint(26F, 3F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 light
		bodyModel[69].setRotationPoint(-9.5F, -15.25F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[70].setRotationPoint(-9.32F, -14.25F, -0.5F);
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