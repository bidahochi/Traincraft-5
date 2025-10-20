//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ane be smokin that gud shid
// Model Creator: bida
// Created on: 17.09.2023 - 22:25:22
// Last changed on: 17.09.2023 - 22:25:22

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelane_slab_antenna extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public Modelane_slab_antenna() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 5, 4, textureX, textureY); // Box 631 ane radio slab
		bodyModel[1] = new ModelRendererTurbo(this, 5, 7, textureX, textureY); // Box 632 ane slab support
		bodyModel[2] = new ModelRendererTurbo(this, 47, 21, textureX, textureY, "lamp"); // Box 633 ane chop numberboard
		bodyModel[3] = new ModelRendererTurbo(this, 47, 21, textureX, textureY, "lamp"); // Box 634 ane chop numberboard
		bodyModel[4] = new ModelRendererTurbo(this, 28, 22, textureX, textureY, "cull"); // Box 635 cull ane antenna extras

		bodyModel[0].addBox(0F, 0F, 0F, 9, 1, 14, 0F); // Box 631 ane radio slab
		bodyModel[0].setRotationPoint(-31F, -19F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 14, 0F); // Box 632 ane slab support
		bodyModel[1].setRotationPoint(-31F, -18F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633 ane chop numberboard
		bodyModel[2].setRotationPoint(-22.2F, -18F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634 ane chop numberboard
		bodyModel[3].setRotationPoint(-22.2F, -18F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635 cull ane antenna extras
		bodyModel[4].setRotationPoint(-27.5F, -20F, -4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 5; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}