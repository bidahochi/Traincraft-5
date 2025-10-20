//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: cf7_ears
// Model Creator: 
// Created on: 04.03.2025 - 18:42:51
// Last changed on: 04.03.2025 - 18:42:51

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelCF7_ANE_Antennae extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCF7_ANE_Antennae() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 459, 172, textureX, textureY); // Box 285
		bodyModel[1] = new ModelRendererTurbo(this, 472, 172, textureX, textureY); // Box 286
		bodyModel[2] = new ModelRendererTurbo(this, 473, 166, textureX, textureY); // Box 287
		bodyModel[3] = new ModelRendererTurbo(this, 468, 168, textureX, textureY); // Box 288
		bodyModel[4] = new ModelRendererTurbo(this, 468, 165, textureX, textureY); // Box 289
		bodyModel[5] = new ModelRendererTurbo(this, 475, 162, textureX, textureY); // Box 290
		bodyModel[6] = new ModelRendererTurbo(this, 498, 172, textureX, textureY); // Box 393
		bodyModel[7] = new ModelRendererTurbo(this, 486, 166, textureX, textureY); // Box 394
		bodyModel[8] = new ModelRendererTurbo(this, 485, 172, textureX, textureY); // Box 395
		bodyModel[9] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 396
		bodyModel[10] = new ModelRendererTurbo(this, 497, 165, textureX, textureY); // Box 397
		bodyModel[11] = new ModelRendererTurbo(this, 488, 162, textureX, textureY); // Box 398

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -1F, 1F, 1F, 0F, 1F, 1F); // Box 285
		bodyModel[0].setRotationPoint(-19F, -26F, 7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[1].setRotationPoint(-19F, -26F, 5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[2].setRotationPoint(-19F, -28F, 5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[3].setRotationPoint(-19F, -28F, 8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[4].setRotationPoint(-19F, -29F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[5].setRotationPoint(-19F, -29F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 1F, 1F, -1F, 1F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[6].setRotationPoint(-19F, -26F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[7].setRotationPoint(-19F, -28F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[8].setRotationPoint(-19F, -26F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[9].setRotationPoint(-19F, -28F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[10].setRotationPoint(-19F, -29F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[11].setRotationPoint(-19F, -29F, -8F);
	}
}