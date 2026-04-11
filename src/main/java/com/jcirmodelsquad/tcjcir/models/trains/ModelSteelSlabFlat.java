//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.11.2020 - 00:45:07
// Last changed on: 10.11.2020 - 00:45:07

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSteelSlabFlat extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelSteelSlabFlat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 238, 86, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 238, 86, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 105, 80, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 46, 18, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 56, 18, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 56, 18, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 46, 18, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 35
		bodyModel[12] = new ModelRendererTurbo(this, 115, 44, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 67
		bodyModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 68
		bodyModel[15] = new ModelRendererTurbo(this, 181, 26, textureX, textureY); // Box 69
		bodyModel[16] = new ModelRendererTurbo(this, 51, 62, textureX, textureY); // Box 70
		bodyModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 71
		bodyModel[18] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 72
		bodyModel[19] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 103
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 164
		bodyModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 195
		bodyModel[22] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 196
		bodyModel[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 197
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 198
		bodyModel[25] = new ModelRendererTurbo(this, 180, 33, textureX, textureY); // Box 199
		bodyModel[26] = new ModelRendererTurbo(this, 88, 36, textureX, textureY); // Box 200
		bodyModel[27] = new ModelRendererTurbo(this, 11, 58, textureX, textureY); // Box 201
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 202
		bodyModel[29] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 203
		bodyModel[30] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 264
		bodyModel[31] = new ModelRendererTurbo(this, 115, 61, textureX, textureY); // Box 265
		bodyModel[32] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 266
		bodyModel[33] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 267
		bodyModel[34] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 268
		bodyModel[35] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 269
		bodyModel[36] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 270
		bodyModel[37] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 271
		bodyModel[38] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 272
		bodyModel[39] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 273
		bodyModel[40] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 274
		bodyModel[41] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 275
		bodyModel[42] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 276
		bodyModel[43] = new ModelRendererTurbo(this, 174, 3, textureX, textureY); // Box 277
		bodyModel[44] = new ModelRendererTurbo(this, 139, 12, textureX, textureY); // Box 278
		bodyModel[45] = new ModelRendererTurbo(this, 0, 84, textureX, textureY); // Box 280 load 1
		bodyModel[46] = new ModelRendererTurbo(this, 3, 85, textureX, textureY); // Box 281 load 2
		bodyModel[47] = new ModelRendererTurbo(this, 0, 85, textureX, textureY); // Box 282 load 3
		bodyModel[48] = new ModelRendererTurbo(this, 1, 84, textureX, textureY); // Box 283 load 4
		bodyModel[49] = new ModelRendererTurbo(this, 3, 85, textureX, textureY); // Box 284 load 5

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-32F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(29F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-23F, 4F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(19F, 4F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-29F, 2F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 56, 1, 18, 0F); // Box 18
		bodyModel[5].setRotationPoint(-28F, 2F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 28
		bodyModel[6].setRotationPoint(-27F, 5F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 29
		bodyModel[7].setRotationPoint(23F, 5F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 30
		bodyModel[8].setRotationPoint(23F, 5F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 31
		bodyModel[9].setRotationPoint(-27F, 5F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 34
		bodyModel[10].setRotationPoint(-27F, 4F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 35
		bodyModel[11].setRotationPoint(13F, 4F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 54, 1, 12, 0F); // Box 36
		bodyModel[12].setRotationPoint(-27F, 3F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[13].setRotationPoint(-13F, 4F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 68
		bodyModel[14].setRotationPoint(7F, 4F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 69
		bodyModel[15].setRotationPoint(-7F, 6F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 3, 12, 0F); // Box 70
		bodyModel[16].setRotationPoint(-7F, 4F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 71
		bodyModel[17].setRotationPoint(-28F, 3F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 72
		bodyModel[18].setRotationPoint(27F, 3F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 103
		bodyModel[19].setRotationPoint(-27F, 4F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 164
		bodyModel[20].setRotationPoint(13F, 4F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 195
		bodyModel[21].setRotationPoint(-28F, 3F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 196
		bodyModel[22].setRotationPoint(-28F, 3F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 197
		bodyModel[23].setRotationPoint(7F, 4F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[24].setRotationPoint(-13F, 4F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 199
		bodyModel[25].setRotationPoint(-7F, 6F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 200
		bodyModel[26].setRotationPoint(-13F, 4F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[27].setRotationPoint(7F, 4F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 202
		bodyModel[28].setRotationPoint(27F, 3F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 203
		bodyModel[29].setRotationPoint(27F, 3F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 264
		bodyModel[30].setRotationPoint(28F, 2F, -2F);

		bodyModel[31].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 265
		bodyModel[31].setRotationPoint(-26F, 0F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 266
		bodyModel[32].setRotationPoint(-25F, 1F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 267
		bodyModel[33].setRotationPoint(24F, 1F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 268
		bodyModel[34].setRotationPoint(20F, 1F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 269
		bodyModel[35].setRotationPoint(-21F, 1F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 270
		bodyModel[36].setRotationPoint(-17F, 1F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 271
		bodyModel[37].setRotationPoint(16F, 1F, -8F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 272
		bodyModel[38].setRotationPoint(-13F, 1F, -8F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 273
		bodyModel[39].setRotationPoint(12F, 1F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 274
		bodyModel[40].setRotationPoint(8F, 1F, -8F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 275
		bodyModel[41].setRotationPoint(-9F, 1F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 276
		bodyModel[42].setRotationPoint(-5F, 1F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 277
		bodyModel[43].setRotationPoint(4F, 1F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 278
		bodyModel[44].setRotationPoint(-1F, 1F, -8F);

		bodyModel[45].addBox(0F, 0F, 0F, 38, 2, 12, 0F); // Box 280 load 1
		bodyModel[45].setRotationPoint(-19F, -2F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 30, 1, 11, 0F); // Box 281 load 2
		bodyModel[46].setRotationPoint(-15F, -3F, -5.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 31, 1, 12, 0F); // Box 282 load 3
		bodyModel[47].setRotationPoint(-15.5F, -4F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 31, 2, 12, 0F); // Box 283 load 4
		bodyModel[48].setRotationPoint(-14.5F, -6F, -6F);

		bodyModel[49].addBox(0F, 0F, 0F, 30, 1, 11, 0F); // Box 284 load 5
		bodyModel[49].setRotationPoint(-15F, -7F, -5.5F);
	}
	Model70TonTruckEarly bogie2 = new Model70TonTruckEarly();
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
		GL11.glTranslated(-1.3,0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.6,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public ModelRendererTurbo ModelSteelSlabFlat[];
}