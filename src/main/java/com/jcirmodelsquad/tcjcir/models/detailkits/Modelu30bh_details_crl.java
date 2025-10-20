//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2025 - 14:19:51
// Last changed on: 17.10.2025 - 14:19:51

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelu30bh_details_crl extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelu30bh_details_crl() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 44, 31, textureX, textureY); // Box 326
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 327
		bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 122
		bodyModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 345
		bodyModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 346
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 348
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 349
		bodyModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 350
		bodyModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 352
		bodyModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 353
		bodyModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 354
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 355
		bodyModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 356
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 357
		bodyModel[17] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 358
		bodyModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 359
		bodyModel[19] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 360
		bodyModel[20] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 361
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 362
		bodyModel[22] = new ModelRendererTurbo(this, 39, 21, textureX, textureY); // Box 326
		bodyModel[23] = new ModelRendererTurbo(this, 35, 31, textureX, textureY); // Box 327

		bodyModel[0].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 326
		bodyModel[0].setRotationPoint(38F, -15F, -7.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 327
		bodyModel[1].setRotationPoint(38F, -15F, 4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[2].setRotationPoint(-44.5F, 1F, 4.75F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 106
		bodyModel[3].setRotationPoint(-44F, 2.01F, 5.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(-44.5F, 1F, -8.75F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 13
		bodyModel[5].setRotationPoint(-44F, 2.01F, -7.75F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[6].setRotationPoint(43.5F, 1F, -8.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[7].setRotationPoint(43.5F, 1F, 4.75F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 348
		bodyModel[8].setRotationPoint(42F, 2.01F, 5.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 349
		bodyModel[9].setRotationPoint(42F, 2.01F, -7.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[10].setRotationPoint(-42.5F, -5F, -6.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[11].setRotationPoint(-43F, -5.25F, -6.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[12].setRotationPoint(-42.75F, -4.25F, -6.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[13].setRotationPoint(-42.5F, -5F, 3.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[14].setRotationPoint(-43F, -5.25F, 4.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[15].setRotationPoint(-42.75F, -4.25F, 4.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[16].setRotationPoint(41.5F, -5F, -6.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[17].setRotationPoint(42F, -5.25F, -6.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[18].setRotationPoint(42.75F, -4.25F, -6.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[19].setRotationPoint(42.75F, -4.25F, 4.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[20].setRotationPoint(42F, -5.25F, 4.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[21].setRotationPoint(41.5F, -5F, 3.75F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 326
		bodyModel[22].setRotationPoint(-39F, -13F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 327
		bodyModel[23].setRotationPoint(-39F, -13F, -5F);
	}
}