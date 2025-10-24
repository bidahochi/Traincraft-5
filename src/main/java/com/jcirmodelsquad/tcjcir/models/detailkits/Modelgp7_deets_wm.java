//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gp9 wm detail kit
// Model Creator: 
// Created on: 14.09.2025 - 15:26:47
// Last changed on: 14.09.2025 - 15:26:47

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class Modelgp7_deets_wm extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelgp7_deets_wm() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 350 wm chop nose
		bodyModel[1] = new ModelRendererTurbo(this, 31, 55, textureX, textureY); // Box 351 wm chop nose
		bodyModel[2] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 352 wm chop nose
		bodyModel[3] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 353 wm chop nose
		bodyModel[4] = new ModelRendererTurbo(this, 34, 31, textureX, textureY); // Box 357 wm chop nose marker light holder
		bodyModel[5] = new ModelRendererTurbo(this, 14, 51, textureX, textureY, "lamp"); // Box 117 numberboard front wm chop
		bodyModel[6] = new ModelRendererTurbo(this, 14, 51, textureX, textureY, "lamp"); // Box 118 numberboard front wm chop
		bodyModel[7] = new ModelRendererTurbo(this, 55, 52, textureX, textureY, "lamp"); // Box 215 headlight front wm chop
		bodyModel[8] = new ModelRendererTurbo(this, 55, 57, textureX, textureY); // Box 216 headlight holder wm chop
		bodyModel[9] = new ModelRendererTurbo(this, 55, 52, textureX, textureY, "lamp"); // Box 217 headlight front wm chop
		bodyModel[10] = new ModelRendererTurbo(this, 27, 55, textureX, textureY); // Box 190 sandcap wm chop nose
		bodyModel[11] = new ModelRendererTurbo(this, 45, 43, textureX, textureY, "lamp"); // Box 559 markerlight wm chop
		bodyModel[12] = new ModelRendererTurbo(this, 45, 43, textureX, textureY, "lamp"); // Box 559 markerlight wm chop
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 642 wm chop wall filler
		bodyModel[14] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 643 wm chop wall filler
		bodyModel[15] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 644 wm chop wall filler
		bodyModel[16] = new ModelRendererTurbo(this, 2, 8, textureX, textureY); // Box 645 wm chop wall filler
		bodyModel[17] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 646 wm horn
		bodyModel[18] = new ModelRendererTurbo(this, 3, 21, textureX, textureY); // Box 647 wm horn
		bodyModel[19] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 648 wm horn
		bodyModel[20] = new ModelRendererTurbo(this, 3, 18, textureX, textureY); // Box 649 wm horn
		bodyModel[21] = new ModelRendererTurbo(this, 5, 30, textureX, textureY); // Box 650 wm horn
		bodyModel[22] = new ModelRendererTurbo(this, 12, 21, textureX, textureY); // Box 651 wm horn
		bodyModel[23] = new ModelRendererTurbo(this, 50, 58, textureX, textureY); // Box 409 commander base
		bodyModel[24] = new ModelRendererTurbo(this, 50, 54, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[25] = new ModelRendererTurbo(this, 50, 58, textureX, textureY); // Box 409 commander base
		bodyModel[26] = new ModelRendererTurbo(this, 50, 54, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[27] = new ModelRendererTurbo(this, 50, 61, textureX, textureY, "cull"); // Box 656 cull beacon holder
		bodyModel[28] = new ModelRendererTurbo(this, 50, 61, textureX, textureY, "cull"); // Box 657 cull beacon holder
		bodyModel[29] = new ModelRendererTurbo(this, 23, 24, textureX, textureY); // Box 658 wm horn
		bodyModel[30] = new ModelRendererTurbo(this, 25, 18, textureX, textureY); // Box 659 wm horn
		bodyModel[31] = new ModelRendererTurbo(this, 27, 21, textureX, textureY); // Box 660 wm horn
		bodyModel[32] = new ModelRendererTurbo(this, 34, 21, textureX, textureY); // Box 661 wm horn
		bodyModel[33] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 662 wm horn
		bodyModel[34] = new ModelRendererTurbo(this, 27, 30, textureX, textureY); // Box 663 wm horn

		bodyModel[0].addBox(0F, 0F, 0F, 9, 2, 14, 0F); // Box 350 wm chop nose
		bodyModel[0].setRotationPoint(-31F, -14F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351 wm chop nose
		bodyModel[1].setRotationPoint(-34F, -14F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 352 wm chop nose
		bodyModel[2].setRotationPoint(-34F, -14F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353 wm chop nose
		bodyModel[3].setRotationPoint(-34F, -14F, 1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 357 wm chop nose marker light holder
		bodyModel[4].setRotationPoint(-32F, -13F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 numberboard front wm chop
		bodyModel[5].setRotationPoint(-31.55F, -11.5F, -6F);
		bodyModel[5].rotateAngleY = 0.46687557F;

		bodyModel[6].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 numberboard front wm chop
		bodyModel[6].setRotationPoint(-31.55F, -11.5F, 6F);
		bodyModel[6].rotateAngleY = -0.46687557F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front wm chop
		bodyModel[7].setRotationPoint(-35.25F, -13F, -1F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216 headlight holder wm chop
		bodyModel[8].setRotationPoint(-34.5F, -13F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front wm chop
		bodyModel[9].setRotationPoint(-35.25F, -11F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190 sandcap wm chop nose
		bodyModel[10].setRotationPoint(-32F, -14.5F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight wm chop
		bodyModel[11].setRotationPoint(-32F, -13F, -6.51F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight wm chop
		bodyModel[12].setRotationPoint(-32F, -13F, 6.51F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 642 wm chop wall filler
		bodyModel[13].setRotationPoint(-22F, -18F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 643 wm chop wall filler
		bodyModel[14].setRotationPoint(-22F, -19F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644 wm chop wall filler
		bodyModel[15].setRotationPoint(-22F, -19F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645 wm chop wall filler
		bodyModel[16].setRotationPoint(-22F, -19F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 646 wm horn
		bodyModel[17].setRotationPoint(-18F, -20.5F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 647 wm horn
		bodyModel[18].setRotationPoint(-16F, -21F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 648 wm horn
		bodyModel[19].setRotationPoint(-16F, -20F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 649 wm horn
		bodyModel[20].setRotationPoint(-17F, -21.25F, -5F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 650 wm horn
		bodyModel[21].setRotationPoint(-17F, -19.5F, -9F);

		bodyModel[22].addBox(0F, 0F, 0.75F, 1, 1, 4, 0F); // Box 651 wm horn
		bodyModel[22].setRotationPoint(-16F, -18.5F, -9F);
		bodyModel[22].rotateAngleX = 0.40142573F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[23].setRotationPoint(-16F, -18F, 9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[24].setRotationPoint(-16F, -19F, 9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[25].setRotationPoint(-16F, -18F, -10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[26].setRotationPoint(-16F, -19F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 656 cull beacon holder
		bodyModel[27].setRotationPoint(-16F, -17F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F); // Box 657 cull beacon holder
		bodyModel[28].setRotationPoint(-16F, -17F, 9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 658 wm horn
		bodyModel[29].setRotationPoint(-1F, -20.5F, -5.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 659 wm horn
		bodyModel[30].setRotationPoint(0F, -20.5F, -3.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 660 wm horn
		bodyModel[31].setRotationPoint(0F, -21F, -4.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 661 wm horn
		bodyModel[32].setRotationPoint(0F, -20F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 662 wm horn
		bodyModel[33].setRotationPoint(0F, -21F, -6.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 663 wm horn
		bodyModel[34].setRotationPoint(0F, -20.5F, -7.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
	}
}