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
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Model1912WoodBoxcar extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Model1912WoodBoxcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[72];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 45, 115, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 93, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 21, 138, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 42, 138, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 63, 138, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 81, 142, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 54, 142, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 142, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 148, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 41, 148, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 0, 122, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 70, 125, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 70, 125, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 70, 115, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 47, 46, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 108, 64, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 108, 50, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 38, 46, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 72, 46, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 82, 150, textureX, textureY); // Box 51
		bodyModel[31] = new ModelRendererTurbo(this, 12, 52, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 118, 117, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 25, 115, textureX, textureY); // Box 69
		bodyModel[37] = new ModelRendererTurbo(this, 25, 123, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 0, 51, textureX, textureY); // Box 71
		bodyModel[39] = new ModelRendererTurbo(this, 118, 115, textureX, textureY); // Box 72
		bodyModel[40] = new ModelRendererTurbo(this, 97, 54, textureX, textureY); // Box 87
		bodyModel[41] = new ModelRendererTurbo(this, 97, 47, textureX, textureY); // Box 90
		bodyModel[42] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 93
		bodyModel[44] = new ModelRendererTurbo(this, 12, 46, textureX, textureY); // Box 94
		bodyModel[45] = new ModelRendererTurbo(this, 7, 46, textureX, textureY); // Box 95
		bodyModel[46] = new ModelRendererTurbo(this, 12, 49, textureX, textureY); // Box 96
		bodyModel[47] = new ModelRendererTurbo(this, 7, 49, textureX, textureY); // Box 97
		bodyModel[48] = new ModelRendererTurbo(this, 0, 93, textureX, textureY); // Box 98
		bodyModel[49] = new ModelRendererTurbo(this, 0, 96, textureX, textureY); // Box 102
		bodyModel[50] = new ModelRendererTurbo(this, 7, 93, textureX, textureY); // Box 103
		bodyModel[51] = new ModelRendererTurbo(this, 7, 96, textureX, textureY); // Box 104
		bodyModel[52] = new ModelRendererTurbo(this, 119, 0, textureX, textureY); // Box 105
		bodyModel[53] = new ModelRendererTurbo(this, 119, 3, textureX, textureY); // Box 106
		bodyModel[54] = new ModelRendererTurbo(this, 119, 9, textureX, textureY); // Box 107
		bodyModel[55] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 108
		bodyModel[56] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 109
		bodyModel[57] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 110
		bodyModel[58] = new ModelRendererTurbo(this, 114, 127, textureX, textureY); // Box 113
		bodyModel[59] = new ModelRendererTurbo(this, 114, 127, textureX, textureY); // Box 114
		bodyModel[60] = new ModelRendererTurbo(this, 133, 127, textureX, textureY); // Box 115
		bodyModel[61] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 116
		bodyModel[62] = new ModelRendererTurbo(this, 42, 121, textureX, textureY); // Box 321
		bodyModel[63] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 322
		bodyModel[64] = new ModelRendererTurbo(this, 0, 107, textureX, textureY); // Box 323
		bodyModel[65] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Box 321
		bodyModel[66] = new ModelRendererTurbo(this, 9, 107, textureX, textureY); // Box 322
		bodyModel[67] = new ModelRendererTurbo(this, 9, 107, textureX, textureY); // Box 323
		bodyModel[68] = new ModelRendererTurbo(this, 140, 72, textureX, textureY); // Box 160
		bodyModel[69] = new ModelRendererTurbo(this, 140, 68, textureX, textureY); // Box 161
		bodyModel[70] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 165
		bodyModel[71] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 166

		bodyModel[0].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 1
		bodyModel[0].setRotationPoint(-28F, 3F, -3F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(28F, 2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 4
		bodyModel[2].setRotationPoint(-30F, 2F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 56, 1, 20, 0F); // Box 5
		bodyModel[3].setRotationPoint(-28F, 2F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 6
		bodyModel[4].setRotationPoint(-28F, 3F, 1F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 7
		bodyModel[5].setRotationPoint(20F, 3F, 1F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 8
		bodyModel[6].setRotationPoint(20F, 3F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-20F, 3F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-20F, 3F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(9F, 3F, 1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(9F, 3F, -3F);

		bodyModel[11].addBox(0F, 0F, 0F, 18, 3, 2, 0F); // Box 13
		bodyModel[11].setRotationPoint(-9F, 3F, 1F);

		bodyModel[12].addBox(0F, 0F, 0F, 18, 3, 2, 0F); // Box 14
		bodyModel[12].setRotationPoint(-9F, 3F, -3F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 17
		bodyModel[13].setRotationPoint(20F, 3F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 20
		bodyModel[14].setRotationPoint(-23F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-22F, 3F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 22
		bodyModel[16].setRotationPoint(8F, 3F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 23
		bodyModel[17].setRotationPoint(8F, 3F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-9F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-9F, 3F, 3F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 26
		bodyModel[20].setRotationPoint(-2F, 3F, 5F);
		bodyModel[20].rotateAngleX = -0.78539816F;

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 27
		bodyModel[21].setRotationPoint(-4F, 3.75F, 5F);
		bodyModel[21].rotateAngleX = -0.78539816F;

		bodyModel[22].addBox(0F, 0F, 0F, 58, 21, 1, 0F); // Box 28
		bodyModel[22].setRotationPoint(-29F, -19F, -10.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 58, 21, 1, 0F); // Box 29
		bodyModel[23].setRotationPoint(-29F, -19F, 9.75F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Box 30
		bodyModel[24].setRotationPoint(-30F, -19F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Box 31
		bodyModel[25].setRotationPoint(29F, -19F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 61, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-30.5F, -21F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 61, 2, 11, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-30.5F, -21F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 14, 20, 1, 0F); // Box 48
		bodyModel[28].setRotationPoint(-7F, -18.5F, 10.15F);

		bodyModel[29].addBox(0F, 0F, 0F, 14, 20, 1, 0F); // Box 49
		bodyModel[29].setRotationPoint(-7F, -18.5F, -11.15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[30].setRotationPoint(-31.5F, -18F, 2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 52
		bodyModel[31].setRotationPoint(-31.5F, -17.99F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(-31.5F, -17.99F, 3F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 26, 1, 0F); // Box 54
		bodyModel[33].setRotationPoint(-31F, -21.5F, 3.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 67
		bodyModel[34].setRotationPoint(-28.5F, -2F, 10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 68
		bodyModel[35].setRotationPoint(-28F, 2F, 10.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 69
		bodyModel[36].setRotationPoint(28F, 3F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 70
		bodyModel[37].setRotationPoint(-30F, 3F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 71
		bodyModel[38].setRotationPoint(25F, 2F, -10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 72
		bodyModel[39].setRotationPoint(23.5F, -2F, -11.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 87
		bodyModel[40].setRotationPoint(-31F, -5.5F, -3F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 90
		bodyModel[41].setRotationPoint(29F, -5.5F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[42].setRotationPoint(29F, -5.5F, 3F);

		bodyModel[43].addBox(0F, 0F, 0F, 64, 0, 3, 0F); // Box 93
		bodyModel[43].setRotationPoint(-32F, -21.05F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 94
		bodyModel[44].setRotationPoint(-32F, -20.99F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 95
		bodyModel[45].setRotationPoint(-32F, -20.99F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[46].setRotationPoint(30F, -20.99F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[47].setRotationPoint(30F, -20.99F, 1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[48].setRotationPoint(28F, 2F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[49].setRotationPoint(28F, 2F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[50].setRotationPoint(-30F, 2F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[51].setRotationPoint(-30F, 2F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 105
		bodyModel[52].setRotationPoint(-7.5F, -18.75F, 10.25F);

		bodyModel[53].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 106
		bodyModel[53].setRotationPoint(-7.5F, 1.25F, 10.25F);

		bodyModel[54].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 107
		bodyModel[54].setRotationPoint(-20.5F, 1.25F, -11.25F);

		bodyModel[55].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 108
		bodyModel[55].setRotationPoint(-20.5F, -18.75F, -11.25F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 109
		bodyModel[56].setRotationPoint(-32F, -21.5F, 2.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 110
		bodyModel[57].setRotationPoint(29F, -5.5F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 113
		bodyModel[58].setRotationPoint(-22F, 3F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 114
		bodyModel[59].setRotationPoint(21F, 3F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[60].setRotationPoint(21F, 3F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 116
		bodyModel[61].setRotationPoint(-30F, 3.5F, 3.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 321
		bodyModel[62].setRotationPoint(28F, 2F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[63].setRotationPoint(30F, 1F, -1.5F);
		bodyModel[63].rotateAngleZ = -0.03490659F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 323
		bodyModel[64].setRotationPoint(30F, 4F, -1.5F);
		bodyModel[64].rotateAngleZ = -0.03490659F;

		bodyModel[65].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 321
		bodyModel[65].setRotationPoint(-34F, 2F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[66].setRotationPoint(-31F, 1F, -1.5F);
		bodyModel[66].rotateAngleZ = -0.03490659F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 323
		bodyModel[67].setRotationPoint(-31F, 4F, -1.5F);
		bodyModel[67].rotateAngleZ = -0.03490659F;

		bodyModel[68].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Box 160
		bodyModel[68].setRotationPoint(-30.1F, 2.5F, 0F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Box 161
		bodyModel[69].setRotationPoint(30.1F, 2.5F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[70].setRotationPoint(-30F, -5.5F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 166
		bodyModel[71].setRotationPoint(-30F, -5.5F, -11F);
	}
	ModelFrictionTruck_Small bogie = new ModelFrictionTruck_Small();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(GetColor(entity)==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish_small.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.34,-0.06,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.68,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}