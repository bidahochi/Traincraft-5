//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:  fncc snow service bits
// Model Creator: biba
// Created on: 13.12.2023 - 20:40:35
// Last changed on: 13.12.2023 - 20:40:35

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelfncc_snow_bits extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public Modelfncc_snow_bits() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 56, textureX, textureY); // Box 547 fncc snow service bit
		bodyModel[1] = new ModelRendererTurbo(this, 2, 49, textureX, textureY); // Box 548 fncc snow service bit
		bodyModel[2] = new ModelRendererTurbo(this, 16, 49, textureX, textureY); // Box 549 fncc snow service bit
		bodyModel[3] = new ModelRendererTurbo(this, 38, 49, textureX, textureY); // Box 550 fncc snow service bit
		bodyModel[4] = new ModelRendererTurbo(this, 73, 43, textureX, textureY, "cull"); // Box 551 cull fncc snow service bit
		bodyModel[5] = new ModelRendererTurbo(this, 7, 25, textureX, textureY); // Box 552 fncc snow service bit
		bodyModel[6] = new ModelRendererTurbo(this, 5, 32, textureX, textureY); // Box 553 fncc snow service bit
		bodyModel[7] = new ModelRendererTurbo(this, 1, 30, textureX, textureY, "lamp"); // Box 554 gyra front fncc snow service bit
		bodyModel[8] = new ModelRendererTurbo(this, 1, 30, textureX, textureY, "lamp"); // Box 555 gyra front fncc snow service bit
		bodyModel[9] = new ModelRendererTurbo(this, 35, 33, textureX, textureY); // Box 556 fncc snow service bit
		bodyModel[10] = new ModelRendererTurbo(this, 25, 31, textureX, textureY); // Box 557 fncc snow service bit
		bodyModel[11] = new ModelRendererTurbo(this, 25, 35, textureX, textureY); // Box 558 fncc snow service bit
		bodyModel[12] = new ModelRendererTurbo(this, 16, 16, textureX, textureY); // Box 559 fncc snow service bit
		bodyModel[13] = new ModelRendererTurbo(this, 16, 23, textureX, textureY); // Box 560 fncc snow service bit
		bodyModel[14] = new ModelRendererTurbo(this, 9, 19, textureX, textureY); // Box 711 fncc snow service bit
		bodyModel[15] = new ModelRendererTurbo(this, 9, 19, textureX, textureY); // Box 712 fncc snow service bit
		bodyModel[16] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 713 fncc snow service bit
		bodyModel[17] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 714 fncc snow service bit
		bodyModel[18] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 715 fncc snow service bit
		bodyModel[19] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 716 fncc snow service bit
		bodyModel[20] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 717 fncc snow service bit
		bodyModel[21] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 718 fncc snow service bit

		bodyModel[0].addBox(0F, 0F, 0F, 58, 2, 3, 0F); // Box 547 fncc snow service bit
		bodyModel[0].setRotationPoint(-33F, -23F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 548 fncc snow service bit
		bodyModel[1].setRotationPoint(-36F, -23F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549 fncc snow service bit
		bodyModel[2].setRotationPoint(-36F, -23F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550 fncc snow service bit
		bodyModel[3].setRotationPoint(25F, -23F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 551 cull fncc snow service bit
		bodyModel[4].setRotationPoint(14.5F, -23.75F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552 fncc snow service bit
		bodyModel[5].setRotationPoint(40.25F, -21F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553 fncc snow service bit
		bodyModel[6].setRotationPoint(-43.25F, -21F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 554 gyra front fncc snow service bit
		bodyModel[7].setRotationPoint(-43.5F, -21F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 555 gyra front fncc snow service bit
		bodyModel[8].setRotationPoint(-43.5F, -21F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 556 fncc snow service bit
		bodyModel[9].setRotationPoint(-33F, -24F, 3F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 557 fncc snow service bit
		bodyModel[10].setRotationPoint(-37F, -22.5F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 558 fncc snow service bit
		bodyModel[11].setRotationPoint(-37F, -21.5F, 3F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 559 fncc snow service bit
		bodyModel[12].setRotationPoint(-42F, -23.5F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560 fncc snow service bit
		bodyModel[13].setRotationPoint(-41F, -18.5F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711 fncc snow service bit
		bodyModel[14].setRotationPoint(-44F, 8F, -4.5F);
		bodyModel[14].rotateAngleY = 0.36651914F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712 fncc snow service bit
		bodyModel[15].setRotationPoint(-44F, 8F, 4.5F);
		bodyModel[15].rotateAngleY = -0.36651914F;

		bodyModel[16].addBox(1F, -5F, 0F, 1, 5, 2, 0F); // Box 713 fncc snow service bit
		bodyModel[16].setRotationPoint(-44F, 8F, 4.5F);
		bodyModel[16].rotateAngleY = -0.36651914F;

		bodyModel[17].addBox(1F, -5F, -2F, 1, 5, 2, 0F); // Box 714 fncc snow service bit
		bodyModel[17].setRotationPoint(-44F, 8F, -4.5F);
		bodyModel[17].rotateAngleY = 0.36651914F;

		bodyModel[18].addBox(-2F, -5F, 0F, 1, 5, 2, 0F); // Box 715 fncc snow service bit
		bodyModel[18].setRotationPoint(44F, 8F, 4.5F);
		bodyModel[18].rotateAngleY = 0.36651914F;

		bodyModel[19].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716 fncc snow service bit
		bodyModel[19].setRotationPoint(44F, 8F, 4.5F);
		bodyModel[19].rotateAngleY = 0.36651914F;

		bodyModel[20].addBox(-2F, -5F, -2F, 1, 5, 2, 0F); // Box 717 fncc snow service bit
		bodyModel[20].setRotationPoint(44F, 8F, -4.5F);
		bodyModel[20].rotateAngleY = -0.36651914F;

		bodyModel[21].addShapeBox(-1F, 0F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718 fncc snow service bit
		bodyModel[21].setRotationPoint(44F, 8F, -4.5F);
		bodyModel[21].rotateAngleY = -0.36651914F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 22; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}