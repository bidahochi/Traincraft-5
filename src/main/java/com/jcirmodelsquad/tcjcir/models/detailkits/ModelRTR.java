//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RTR
// Model Creator: biba
// Created on: 06.10.2023 - 21:28:08
// Last changed on: 06.10.2023 - 21:28:08

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelRTR extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRTR() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 558 wall back
		bodyModel[1] = new ModelRendererTurbo(this, 257, 3, textureX, textureY); // Box 559 frontflap
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 560 frontflap
		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 561 frontflap
		bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 562 backflap
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 563 backflap
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 564 backflap
		bodyModel[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 565 roof
		bodyModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 566 roof
		bodyModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 567
		bodyModel[10] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 568
		bodyModel[11] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 569
		bodyModel[12] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 570
		bodyModel[13] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 571
		bodyModel[14] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 572
		bodyModel[15] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 573
		bodyModel[16] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 574
		bodyModel[17] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 575
		bodyModel[18] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 576
		bodyModel[19] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 577
		bodyModel[20] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 578
		bodyModel[21] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 579
		bodyModel[22] = new ModelRendererTurbo(this, 17, 221, textureX, textureY); // Box 557 wall front

		bodyModel[0].addBox(0F, 0F, 0F, 124, 45, 0, 0F); // Box 558 wall back
		bodyModel[0].setRotationPoint(-62F, -33F, 14F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 45, 8, 0F); // Box 559 frontflap
		bodyModel[1].setRotationPoint(-63F, -33F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 0, 45, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 560 frontflap
		bodyModel[2].setRotationPoint(-63F, -33F, 4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 45, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561 frontflap
		bodyModel[3].setRotationPoint(-63F, -33F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 45, 10, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562 backflap
		bodyModel[4].setRotationPoint(63F, -33F, -14F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 45, 8, 0F); // Box 563 backflap
		bodyModel[5].setRotationPoint(63F, -33F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 45, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 564 backflap
		bodyModel[6].setRotationPoint(63F, -33F, 4F);

		bodyModel[7].addBox(0F, 0F, 0F, 124, 0, 28, 0F); // Box 565 roof
		bodyModel[7].setRotationPoint(-62F, -33.01F, -14F);

		bodyModel[8].addBox(0F, 0F, 0F, 124, 0, 28, 0F); // Box 566 roof
		bodyModel[8].setRotationPoint(-62F, 12.01F, -14F);

		bodyModel[9].addBox(0F, 0F, 0F, 29, 19, 26, 0F); // Box 567
		bodyModel[9].setRotationPoint(-61F, -33F, -13F);

		bodyModel[10].addBox(0F, 0F, 0F, 27, 1, 26, 0F); // Box 568
		bodyModel[10].setRotationPoint(-61F, 9F, -13F);

		bodyModel[11].addBox(0F, 0F, 0F, 27, 1, 26, 0F); // Box 569
		bodyModel[11].setRotationPoint(34F, 9F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 17, 26, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[12].setRotationPoint(43F, -8F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 571
		bodyModel[13].setRotationPoint(43F, -24F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 17, 26, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[14].setRotationPoint(-61F, -8F, -13F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 4, 26, 0F); // Box 573
		bodyModel[15].setRotationPoint(-61F, -14F, -13F);

		bodyModel[16].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 574
		bodyModel[16].setRotationPoint(-59F, -10F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 575
		bodyModel[17].setRotationPoint(51F, -10F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 18, 4, 26, 0F); // Box 576
		bodyModel[18].setRotationPoint(-32F, -33F, -13F);

		bodyModel[19].addBox(0F, 0F, 0F, 75, 9, 26, 0F); // Box 577
		bodyModel[19].setRotationPoint(-14F, -33F, -13F);

		bodyModel[20].addBox(0F, 0F, 0F, 26, 1, 26, 0F); // Box 578
		bodyModel[20].setRotationPoint(-13F, 9F, -13F);

		bodyModel[21].addBox(0F, 0F, 0F, 122, 2, 26, 0F); // Box 579
		bodyModel[21].setRotationPoint(-61F, 10F, -13F);

		bodyModel[22].addBox(0F, 0F, 0F, 124, 45, 0, 0F); // Box 557 wall front
		bodyModel[22].setRotationPoint(-62F, -33F, -14F);
	}
}