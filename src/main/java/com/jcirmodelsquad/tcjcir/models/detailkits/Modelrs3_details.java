//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.07.2025 - 09:40:04
// Last changed on: 01.07.2025 - 09:40:04

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelrs3_details extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelrs3_details() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 12, 14, textureX, textureY); // Box 488
		bodyModel[1] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 493
		bodyModel[2] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 494
		bodyModel[3] = new ModelRendererTurbo(this, 12, 14, textureX, textureY); // Box 495
		bodyModel[4] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 496
		bodyModel[5] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 497
		bodyModel[6] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 504
		bodyModel[7] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Box 505
		bodyModel[8] = new ModelRendererTurbo(this, 26, 15, textureX, textureY); // Box 506
		bodyModel[9] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 507
		bodyModel[10] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 508
		bodyModel[11] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 509
		bodyModel[12] = new ModelRendererTurbo(this, 26, 15, textureX, textureY); // Box 510
		bodyModel[13] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 511
		bodyModel[14] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 512
		bodyModel[15] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 513
		bodyModel[16] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 488
		bodyModel[17] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 489
		bodyModel[18] = new ModelRendererTurbo(this, 13, 26, textureX, textureY); // Box 490
		bodyModel[19] = new ModelRendererTurbo(this, 13, 26, textureX, textureY); // Box 491

		bodyModel[0].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 488
		bodyModel[0].setRotationPoint(-39.5F, 1.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 493
		bodyModel[1].setRotationPoint(-38.5F, 2.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 494
		bodyModel[2].setRotationPoint(-37.5F, 2F, -8.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 495
		bodyModel[3].setRotationPoint(-39.5F, 1.5F, 5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 496
		bodyModel[4].setRotationPoint(-38.5F, 2.5F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 497
		bodyModel[5].setRotationPoint(-37.5F, 2F, 5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 504
		bodyModel[6].setRotationPoint(-40F, 4F, -2.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 505
		bodyModel[7].setRotationPoint(-33.5F, -14.5F, -3.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 506
		bodyModel[8].setRotationPoint(38.5F, 1.5F, 5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 507
		bodyModel[9].setRotationPoint(37.5F, 2.5F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 508
		bodyModel[10].setRotationPoint(35.5F, 2F, 5.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 509
		bodyModel[11].setRotationPoint(39F, 4F, 1.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 510
		bodyModel[12].setRotationPoint(38.5F, 1.5F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 511
		bodyModel[13].setRotationPoint(37.5F, 2.5F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 512
		bodyModel[14].setRotationPoint(35.5F, 2F, -8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 513
		bodyModel[15].setRotationPoint(32.5F, -14.5F, -3.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 488
		bodyModel[16].setRotationPoint(-37.4F, -7F, -6.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 489
		bodyModel[17].setRotationPoint(-37.38F, -7F, 2F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 490
		bodyModel[18].setRotationPoint(36.4F, -7F, 2.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 491
		bodyModel[19].setRotationPoint(36.4F, -7F, -6.5F);
	}
}