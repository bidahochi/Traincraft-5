//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.03.2021 - 09:50:18
// Last changed on: 16.03.2021 - 09:50:18

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

public class ModelGunderson89FootAutorack extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGunderson89FootAutorack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 314, 16, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 301, 33, textureX, textureY); // Box 80
		bodyModel[8] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 83
		bodyModel[9] = new ModelRendererTurbo(this, 17, 34, textureX, textureY); // Box 84
		bodyModel[10] = new ModelRendererTurbo(this, 35, 21, textureX, textureY); // Box 85
		bodyModel[11] = new ModelRendererTurbo(this, 52, 20, textureX, textureY); // Box 86
		bodyModel[12] = new ModelRendererTurbo(this, 18, 24, textureX, textureY); // Box 87
		bodyModel[13] = new ModelRendererTurbo(this, 18, 21, textureX, textureY); // Box 88
		bodyModel[14] = new ModelRendererTurbo(this, 18, 27, textureX, textureY); // Box 89
		bodyModel[15] = new ModelRendererTurbo(this, 59, 20, textureX, textureY); // Box 90
		bodyModel[16] = new ModelRendererTurbo(this, 301, 17, textureX, textureY); // Box 91
		bodyModel[17] = new ModelRendererTurbo(this, 73, 21, textureX, textureY); // Box 92
		bodyModel[18] = new ModelRendererTurbo(this, 66, 21, textureX, textureY); // Box 93
		bodyModel[19] = new ModelRendererTurbo(this, 284, 16, textureX, textureY); // Box 94
		bodyModel[20] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 125
		bodyModel[21] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 126
		bodyModel[22] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 127
		bodyModel[23] = new ModelRendererTurbo(this, 15, 38, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 314, 32, textureX, textureY); // Box 129
		bodyModel[25] = new ModelRendererTurbo(this, 284, 32, textureX, textureY); // Box 130
		bodyModel[26] = new ModelRendererTurbo(this, 220, 20, textureX, textureY); // Box 131
		bodyModel[27] = new ModelRendererTurbo(this, 227, 21, textureX, textureY); // Box 132
		bodyModel[28] = new ModelRendererTurbo(this, 199, 21, textureX, textureY); // Box 133
		bodyModel[29] = new ModelRendererTurbo(this, 206, 21, textureX, textureY); // Box 134
		bodyModel[30] = new ModelRendererTurbo(this, 244, 21, textureX, textureY); // Box 135
		bodyModel[31] = new ModelRendererTurbo(this, 213, 20, textureX, textureY); // Box 136
		bodyModel[32] = new ModelRendererTurbo(this, 308, 52, textureX, textureY); // Box 141
		bodyModel[33] = new ModelRendererTurbo(this, 329, 46, textureX, textureY); // Box 173
		bodyModel[34] = new ModelRendererTurbo(this, 308, 46, textureX, textureY); // Box 174
		bodyModel[35] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 211
		bodyModel[36] = new ModelRendererTurbo(this, 292, 26, textureX, textureY); // Box 212
		bodyModel[37] = new ModelRendererTurbo(this, 3, 36, textureX, textureY); // Box 214
		bodyModel[38] = new ModelRendererTurbo(this, 12, 43, textureX, textureY); // Box 215
		bodyModel[39] = new ModelRendererTurbo(this, 262, 30, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 262, 34, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 277, 28, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 277, 33, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 262, 22, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 275, 17, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 262, 26, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 275, 23, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 13, 171, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 13, 221, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 4, 139, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 13, 166, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 11, 159, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 11, 209, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 13, 216, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 29, 123, textureX, textureY, "cull"); // Box 68 cull
		bodyModel[55] = new ModelRendererTurbo(this, 18, 123, textureX, textureY, "cull"); // Box 69 cull
		bodyModel[56] = new ModelRendererTurbo(this, 6, 169, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 6, 219, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 308, 210, textureX, textureY); // Box 314 A door swing left
		bodyModel[59] = new ModelRendererTurbo(this, 349, 210, textureX, textureY); // Box 182 A door swing right
		bodyModel[60] = new ModelRendererTurbo(this, 370, 216, textureX, textureY); // Box 182 A door swing right
		bodyModel[61] = new ModelRendererTurbo(this, 301, 216, textureX, textureY); // Box 314 A door swing left
		bodyModel[62] = new ModelRendererTurbo(this, 339, 244, textureX, textureY); // Box 182 A door swing right
		bodyModel[63] = new ModelRendererTurbo(this, 322, 244, textureX, textureY); // Box 314 A door swing left
		bodyModel[64] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 7, 164, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 341, 208, textureX, textureY); // Box 182 A door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 320, 208, textureX, textureY); // Box 314 A door swing left
		bodyModel[68] = new ModelRendererTurbo(this, 361, 213, textureX, textureY); // Box 182 A door swing right
		bodyModel[69] = new ModelRendererTurbo(this, 368, 212, textureX, textureY); // Box 182 A door swing right
		bodyModel[70] = new ModelRendererTurbo(this, 301, 212, textureX, textureY); // Box 314 A door swing left
		bodyModel[71] = new ModelRendererTurbo(this, 271, 206, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 273, 214, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 308, 213, textureX, textureY); // Box 314 A door swing left
		bodyModel[74] = new ModelRendererTurbo(this, 271, 156, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 273, 164, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 1, 206, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 7, 214, textureX, textureY); // Box 93
		bodyModel[78] = new ModelRendererTurbo(this, 272, 219, textureX, textureY); // Box 94
		bodyModel[79] = new ModelRendererTurbo(this, 272, 169, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 349, 165, textureX, textureY); // Box 314 B door swing left
		bodyModel[81] = new ModelRendererTurbo(this, 308, 165, textureX, textureY); // Box 182 B door swing right
		bodyModel[82] = new ModelRendererTurbo(this, 301, 171, textureX, textureY); // Box 182 B door swing right
		bodyModel[83] = new ModelRendererTurbo(this, 370, 171, textureX, textureY); // Box 314 B door swing left
		bodyModel[84] = new ModelRendererTurbo(this, 322, 199, textureX, textureY); // Box 182 B door swing right
		bodyModel[85] = new ModelRendererTurbo(this, 339, 199, textureX, textureY); // Box 314 B door swing left
		bodyModel[86] = new ModelRendererTurbo(this, 320, 163, textureX, textureY); // Box 182 B door swing right
		bodyModel[87] = new ModelRendererTurbo(this, 341, 163, textureX, textureY); // Box 314 B door swing left
		bodyModel[88] = new ModelRendererTurbo(this, 308, 168, textureX, textureY); // Box 182 B door swing right
		bodyModel[89] = new ModelRendererTurbo(this, 301, 167, textureX, textureY); // Box 182 B door swing right
		bodyModel[90] = new ModelRendererTurbo(this, 368, 167, textureX, textureY); // Box 314 B door swing left
		bodyModel[91] = new ModelRendererTurbo(this, 361, 168, textureX, textureY); // Box 314 B door swing left
		bodyModel[92] = new ModelRendererTurbo(this, 40, 123, textureX, textureY, "cull"); // Box 68 cull
		bodyModel[93] = new ModelRendererTurbo(this, 7, 123, textureX, textureY, "cull"); // Box 69 cull
		bodyModel[94] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 110
		bodyModel[95] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 111
		bodyModel[96] = new ModelRendererTurbo(this, 51, 127, textureX, textureY); // Box 112
		bodyModel[97] = new ModelRendererTurbo(this, 51, 127, textureX, textureY); // Box 113
		bodyModel[98] = new ModelRendererTurbo(this, -18, 65, textureX, textureY); // Box 114 bi level
		bodyModel[99] = new ModelRendererTurbo(this, -18, 86, textureX, textureY); // Box 115 tri level
		bodyModel[100] = new ModelRendererTurbo(this, -18, 86, textureX, textureY); // Box 116 tri level

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-71F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(67F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-50F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(46F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 13
		bodyModel[4].setRotationPoint(-67F, 3F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[5].setRotationPoint(-50F, 4F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 130, 1, 18, 0F); // Box 18
		bodyModel[6].setRotationPoint(-65F, 3F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 80
		bodyModel[7].setRotationPoint(65F, 3F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 120, 1, 2, 0F); // Box 83
		bodyModel[8].setRotationPoint(-60F, 3F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 120, 1, 2, 0F); // Box 84
		bodyModel[9].setRotationPoint(-60F, 3F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[10].setRotationPoint(-67F, 4F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 86
		bodyModel[11].setRotationPoint(-67F, 4F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 120, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[12].setRotationPoint(-60F, 4F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[13].setRotationPoint(-67F, 4F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 120, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[14].setRotationPoint(-60F, 4F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 90
		bodyModel[15].setRotationPoint(-67F, 4F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 91
		bodyModel[16].setRotationPoint(-67F, 3F, -2F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bodyModel[17].setRotationPoint(-66F, 4F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[18].setRotationPoint(-66F, 4F, 8F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 94
		bodyModel[19].setRotationPoint(-67F, 3F, 2F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 125
		bodyModel[20].setRotationPoint(-50F, 4F, 2F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 126
		bodyModel[21].setRotationPoint(46F, 4F, 2F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 127
		bodyModel[22].setRotationPoint(46F, 4F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 130, 1, 4, 0F); // Box 128
		bodyModel[23].setRotationPoint(-65F, 4F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 129
		bodyModel[24].setRotationPoint(65F, 3F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 130
		bodyModel[25].setRotationPoint(65F, 3F, 2F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 131
		bodyModel[26].setRotationPoint(66F, 4F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[27].setRotationPoint(60F, 4F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 133
		bodyModel[28].setRotationPoint(64F, 4F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 134
		bodyModel[29].setRotationPoint(64F, 4F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[30].setRotationPoint(60F, 4F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 136
		bodyModel[31].setRotationPoint(66F, 4F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 66, 2, 4, 0F); // Box 141
		bodyModel[32].setRotationPoint(-33F, 5F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 173
		bodyModel[33].setRotationPoint(-39F, 5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[34].setRotationPoint(33F, 5F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[35].setRotationPoint(-67F, 2F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[36].setRotationPoint(56F, 2F, -2F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 214
		bodyModel[37].setRotationPoint(-59.5F, -3F, 10.5F);

		bodyModel[38].addBox(-0.5F, -0.5F, 0F, 1, 4, 0, 0F); // Box 215
		bodyModel[38].setRotationPoint(-58.5F, -2F, 11.51F);
		bodyModel[38].rotateAngleZ = -0.52359878F;

		bodyModel[39].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 50
		bodyModel[39].setRotationPoint(-65F, 3F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 51
		bodyModel[40].setRotationPoint(-65F, 3F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 52
		bodyModel[41].setRotationPoint(-67F, 3F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 53
		bodyModel[42].setRotationPoint(-67F, 3F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 54
		bodyModel[43].setRotationPoint(60F, 3F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 55
		bodyModel[44].setRotationPoint(65F, 3F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 56
		bodyModel[45].setRotationPoint(60F, 3F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 57
		bodyModel[46].setRotationPoint(65F, 3F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 128, 31, 1, 0F); // Box 58
		bodyModel[47].setRotationPoint(-64F, -28F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 128, 31, 1, 0F); // Box 60
		bodyModel[48].setRotationPoint(-64F, -28F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 134, 1, 14, 0F); // Box 61
		bodyModel[49].setRotationPoint(-67F, -33F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 128, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[50].setRotationPoint(-64F, -31F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 128, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[51].setRotationPoint(-64F, -33F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 128, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[52].setRotationPoint(-64F, -33F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 128, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[53].setRotationPoint(-64F, -31F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 68 cull
		bodyModel[54].setRotationPoint(-64F, -5F, 10.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 69 cull
		bodyModel[55].setRotationPoint(-64F, -5F, -11.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[56].setRotationPoint(-65F, -30F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[57].setRotationPoint(-65F, -30F, 9F);

		bodyModel[58].addBox(-1.5F, 0F, -9.5F, 1, 31, 9, 0F); // Box 314 A door swing left
		bodyModel[58].setRotationPoint(-65.5F, -29F, 9.5F);

		bodyModel[59].addBox(-1.5F, 0F, 0.5F, 1, 31, 9, 0F); // Box 182 A door swing right
		bodyModel[59].setRotationPoint(-65.5F, -29F, -9.5F);

		bodyModel[60].addShapeBox(-1.5F, 0F, -0.5F, 2, 33, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 A door swing right
		bodyModel[60].setRotationPoint(-65.5F, -30F, -9.5F);

		bodyModel[61].addShapeBox(-1.5F, 0F, -0.5F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 314 A door swing left
		bodyModel[61].setRotationPoint(-65.5F, -30F, 9.5F);

		bodyModel[62].addBox(-1.5F, 0F, 0.5F, 1, 1, 7, 0F); // Box 182 A door swing right
		bodyModel[62].setRotationPoint(-65.5F, 2F, -9.5F);

		bodyModel[63].addBox(-1.5F, 0F, -7.5F, 1, 1, 7, 0F); // Box 314 A door swing left
		bodyModel[63].setRotationPoint(-65.5F, 2F, 9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.35F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[64].setRotationPoint(-67F, -33F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 80
		bodyModel[65].setRotationPoint(-65F, -31F, -11F);

		bodyModel[66].addBox(-1.5F, -3F, 2.5F, 1, 3, 7, 0F); // Box 182 A door swing right
		bodyModel[66].setRotationPoint(-65.5F, -29F, -9.5F);

		bodyModel[67].addBox(-1.5F, -3F, -9.5F, 1, 3, 7, 0F); // Box 314 A door swing left
		bodyModel[67].setRotationPoint(-65.5F, -29F, 9.5F);

		bodyModel[68].addShapeBox(-1.5F, -3F, 0.5F, 2, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 182 A door swing right
		bodyModel[68].setRotationPoint(-65.5F, -29F, -9.5F);

		bodyModel[69].addShapeBox(-1.5F, -1F, -0.5F, 3, 1, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 182 A door swing right
		bodyModel[69].setRotationPoint(-65.5F, -30F, -9.5F);

		bodyModel[70].addShapeBox(-1.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 314 A door swing left
		bodyModel[70].setRotationPoint(-65.5F, -31F, 9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2.35F, 1F, 0F); // Box 87
		bodyModel[71].setRotationPoint(-67F, -33F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 88
		bodyModel[72].setRotationPoint(-65F, -31F, 10F);

		bodyModel[73].addShapeBox(-1.5F, -3F, -2.5F, 2, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 A door swing left
		bodyModel[73].setRotationPoint(-65.5F, -29F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2.35F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
		bodyModel[74].setRotationPoint(64F, -33F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[75].setRotationPoint(64F, -31F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.35F, 1F, 0F, 0F, 1F, 0F); // Box 92
		bodyModel[76].setRotationPoint(64F, -33F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[77].setRotationPoint(64F, -31F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[78].setRotationPoint(63F, -30F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[79].setRotationPoint(63F, -30F, -10F);

		bodyModel[80].addBox(0.5F, 0F, -9.5F, 1, 31, 9, 0F); // Box 314 B door swing left
		bodyModel[80].setRotationPoint(65.5F, -29F, 9.5F);

		bodyModel[81].addBox(0.5F, 0F, 0.5F, 1, 31, 9, 0F); // Box 182 B door swing right
		bodyModel[81].setRotationPoint(65.5F, -29F, -9.5F);

		bodyModel[82].addShapeBox(-0.5F, 0F, -0.5F, 2, 33, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 B door swing right
		bodyModel[82].setRotationPoint(65.5F, -30F, -9.5F);

		bodyModel[83].addShapeBox(-0.5F, 0F, -0.5F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314 B door swing left
		bodyModel[83].setRotationPoint(65.5F, -30F, 9.5F);

		bodyModel[84].addBox(0.5F, 0F, 0.5F, 1, 1, 7, 0F); // Box 182 B door swing right
		bodyModel[84].setRotationPoint(65.5F, 2F, -9.5F);

		bodyModel[85].addBox(0.5F, 0F, -7.5F, 1, 1, 7, 0F); // Box 314 B door swing left
		bodyModel[85].setRotationPoint(65.5F, 2F, 9.5F);

		bodyModel[86].addBox(0.5F, -3F, 2.5F, 1, 3, 7, 0F); // Box 182 B door swing right
		bodyModel[86].setRotationPoint(65.5F, -29F, -9.5F);

		bodyModel[87].addBox(0.5F, -3F, -9.5F, 1, 3, 7, 0F); // Box 314 B door swing left
		bodyModel[87].setRotationPoint(65.5F, -29F, 9.5F);

		bodyModel[88].addShapeBox(-0.5F, -3F, 0.5F, 2, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 182 B door swing right
		bodyModel[88].setRotationPoint(65.5F, -29F, -9.5F);

		bodyModel[89].addShapeBox(-1.5F, -1F, -0.5F, 3, 1, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 182 B door swing right
		bodyModel[89].setRotationPoint(65.5F, -30F, -9.5F);

		bodyModel[90].addShapeBox(-1.5F, 0F, -0.5F, 3, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314 B door swing left
		bodyModel[90].setRotationPoint(65.5F, -31F, 9.5F);

		bodyModel[91].addShapeBox(-0.5F, -3F, -2.5F, 2, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 B door swing left
		bodyModel[91].setRotationPoint(65.5F, -29F, 9.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 68 cull
		bodyModel[92].setRotationPoint(60F, -5F, 10.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Box 69 cull
		bodyModel[93].setRotationPoint(60F, -5F, -11.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 110
		bodyModel[94].setRotationPoint(-67F, 4F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[95].setRotationPoint(-67F, 4F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 112
		bodyModel[96].setRotationPoint(67F, 4F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[97].setRotationPoint(67F, 4F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 126, 0, 20, 0F); // Box 114 bi level
		bodyModel[98].setRotationPoint(-63F, -16F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 126, 0, 20, 0F); // Box 115 tri level
		bodyModel[99].setRotationPoint(-63F, -21F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 126, 0, 20, 0F); // Box 116 tri level
		bodyModel[100].setRotationPoint(-63F, -8F, -10F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(GetColor(entity)==3249){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-3.0,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(6.0,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}
}