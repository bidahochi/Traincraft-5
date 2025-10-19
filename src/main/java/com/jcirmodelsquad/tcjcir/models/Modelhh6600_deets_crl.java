//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2025 - 16:44:35
// Last changed on: 17.10.2025 - 16:44:35

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelhh6600_deets_crl extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modelhh6600_deets_crl() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 488
		bodyModel[1] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 493
		bodyModel[2] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 494
		bodyModel[3] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 495
		bodyModel[4] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 496
		bodyModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 497
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 504
		bodyModel[7] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 488
		bodyModel[8] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 489
		bodyModel[9] = new ModelRendererTurbo(this, 21, 21, textureX, textureY); // Box 237
		bodyModel[10] = new ModelRendererTurbo(this, 21, 21, textureX, textureY); // Box 238
		bodyModel[11] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 239
		bodyModel[12] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 240
		bodyModel[13] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 241
		bodyModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 242
		bodyModel[15] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Box 243
		bodyModel[16] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 244
		bodyModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 245
		bodyModel[18] = new ModelRendererTurbo(this, 16, 8, textureX, textureY); // Box 249
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 251
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 252

		bodyModel[0].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 488
		bodyModel[0].setRotationPoint(-32F, 1.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 493
		bodyModel[1].setRotationPoint(-31F, 2.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 494
		bodyModel[2].setRotationPoint(-30F, 2F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 495
		bodyModel[3].setRotationPoint(-32F, 1.5F, 5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 496
		bodyModel[4].setRotationPoint(-31F, 2.5F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 497
		bodyModel[5].setRotationPoint(-30F, 2F, 5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 504
		bodyModel[6].setRotationPoint(-32.5F, 4F, -2.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 488
		bodyModel[7].setRotationPoint(-29.9F, -6F, -6.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 489
		bodyModel[8].setRotationPoint(-29.9F, -6F, 2.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 237
		bodyModel[9].setRotationPoint(28.9F, -6F, 2.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 238
		bodyModel[10].setRotationPoint(28.9F, -6F, -6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 239
		bodyModel[11].setRotationPoint(28F, 2F, 5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 240
		bodyModel[12].setRotationPoint(30F, 2.5F, 6F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 241
		bodyModel[13].setRotationPoint(31F, 1.5F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 242
		bodyModel[14].setRotationPoint(28F, 2F, -8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 243
		bodyModel[15].setRotationPoint(30F, 2.5F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 244
		bodyModel[16].setRotationPoint(31F, 1.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 245
		bodyModel[17].setRotationPoint(31.5F, 4F, 1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 249
		bodyModel[18].setRotationPoint(-25.8F, -19F, -3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 251
		bodyModel[19].setRotationPoint(24.8F, -11F, -5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 252
		bodyModel[20].setRotationPoint(24.8F, -11F, 2.5F);
	}
}