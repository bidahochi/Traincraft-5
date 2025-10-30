//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2025 - 16:06:15
// Last changed on: 17.10.2025 - 16:06:15

package com.jcirmodelsquad.tcjcir.models.passengerparts; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFourCorHeadboard extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelFourCorHeadboard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1106
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1107

		bodyModel[0].addBox(0F, 0F, 0F, 32, 1, 0, 0F); // Box 1106
		bodyModel[0].setRotationPoint(-16F, -18F, 9.75F);

		bodyModel[1].addBox(0F, 0F, 0F, 32, 1, 0, 0F); // Box 1107
		bodyModel[1].setRotationPoint(-16F, -18F, -9.75F);
	}
}