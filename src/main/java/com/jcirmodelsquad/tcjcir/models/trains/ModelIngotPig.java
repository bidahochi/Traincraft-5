//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.11.2020 - 16:01:34
// Last changed on: 06.11.2020 - 16:01:34

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelIngotPig extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelIngotPig() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[34];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 3, 9, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 75, 18, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 43, 17, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 43, 17, textureX, textureY); // Box 62
		bodyModel[12] = new ModelRendererTurbo(this, 43, 17, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 95, 21, textureX, textureY); // Box 64 ingot
		bodyModel[14] = new ModelRendererTurbo(this, 95, 21, textureX, textureY); // Box 65 ingot
		bodyModel[15] = new ModelRendererTurbo(this, 95, 21, textureX, textureY); // Box 66 ingot
		bodyModel[16] = new ModelRendererTurbo(this, 8, 35, textureX, textureY); // Box 67
		bodyModel[17] = new ModelRendererTurbo(this, 8, 35, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 8, 35, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 8, 35, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Box 71
		bodyModel[21] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Box 72
		bodyModel[22] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Box 74
		bodyModel[24] = new ModelRendererTurbo(this, 11, 31, textureX, textureY); // Box 75
		bodyModel[25] = new ModelRendererTurbo(this, 11, 31, textureX, textureY); // Box 76
		bodyModel[26] = new ModelRendererTurbo(this, 11, 31, textureX, textureY); // Box 77
		bodyModel[27] = new ModelRendererTurbo(this, 11, 31, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 4, 57, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 33

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-21F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(18F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-12F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(8F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 36, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-18F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[5].setRotationPoint(8F, 2F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[6].setRotationPoint(-12F, 2F, 2F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 1
		bodyModel[7].setRotationPoint(-12F, 2F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 12
		bodyModel[8].setRotationPoint(8F, 2F, 2F);

		bodyModel[9].addBox(0F, 0F, 0F, 36, 2, 18, 0F); // Box 18
		bodyModel[9].setRotationPoint(-18F, 0F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 61
		bodyModel[10].setRotationPoint(-15F, -1F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 62
		bodyModel[11].setRotationPoint(7F, -1F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 63
		bodyModel[12].setRotationPoint(-4F, -1F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 13, 10, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64 ingot
		bodyModel[13].setRotationPoint(-14F, -14F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 13, 10, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65 ingot
		bodyModel[14].setRotationPoint(-3F, -14F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 13, 10, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66 ingot
		bodyModel[15].setRotationPoint(8F, -14F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[16].setRotationPoint(-15F, -2F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 68
		bodyModel[17].setRotationPoint(-8F, -2F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 69
		bodyModel[18].setRotationPoint(-8F, -2F, 6F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 70
		bodyModel[19].setRotationPoint(-15F, -2F, 6F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 71
		bodyModel[20].setRotationPoint(3F, -2F, 6F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 72
		bodyModel[21].setRotationPoint(-4F, -2F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 73
		bodyModel[22].setRotationPoint(3F, -2F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 74
		bodyModel[23].setRotationPoint(-4F, -2F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 75
		bodyModel[24].setRotationPoint(14F, -2F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 76
		bodyModel[25].setRotationPoint(7F, -2F, 6F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		bodyModel[26].setRotationPoint(14F, -2F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[27].setRotationPoint(7F, -2F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 28
		bodyModel[28].setRotationPoint(-17F, 2F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 29
		bodyModel[29].setRotationPoint(13F, 2F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 30
		bodyModel[30].setRotationPoint(13F, 2F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 31
		bodyModel[31].setRotationPoint(-17F, 2F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 14, 4, 0, 0F); // Box 32
		bodyModel[32].setRotationPoint(-7F, 2F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 14, 4, 0, 0F); // Box 33
		bodyModel[33].setRotationPoint(-7F, 2F, 9F);
	}
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();
	//modelSmallStraight track = new ModelSmallStraightTCTrack();
	private IModelCustom modelSmallStraight;


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
		if(GetColor(entity)==9345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-0.625,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(1.25,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		/*GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/models/track_normal.png"));
		GL11.glTranslated(-0.0,1.0,-0.0);
		GL11.glScalef(16f,16f,16f);
		track.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();*/

		/*GL11.glPushMatrix();
		modelSmallStraight = net.minecraftforge.client.model.AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));
		tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));

		GL11.glTranslated(-0.0,1.0,-0.0);
		GL11.glScalef(16f,16f,16f);


		GL11.glPopMatrix();*/
	}

	public ModelRendererTurbo ModelIngotPig[];
}