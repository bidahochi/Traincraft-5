//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2025 - 16:06:15
// Last changed on: 17.10.2025 - 16:06:15

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelhbc1c_deets_crl extends ModelConverter //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public Modelhbc1c_deets_crl() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 345
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 346
		bodyModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 348
		bodyModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 349
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 302
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 303
		bodyModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 304
		bodyModel[7] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 305

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[0].setRotationPoint(33.5F, 1F, -8.75F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[1].setRotationPoint(33.5F, 1F, 4.75F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 348
		bodyModel[2].setRotationPoint(32F, 2.01F, 5.75F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 349
		bodyModel[3].setRotationPoint(32F, 2.01F, -7.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[4].setRotationPoint(-34.5F, 1F, 4.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[5].setRotationPoint(-34.5F, 1F, -8.75F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 304
		bodyModel[6].setRotationPoint(-34F, 2.01F, -7.75F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 305
		bodyModel[7].setRotationPoint(-34F, 2.01F, 5.75F);
	}
}