//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.03.2021 - 09:50:18
// Last changed on: 16.03.2021 - 09:50:18

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGunderson89FootFlat extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelGunderson89FootFlat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 314, 16, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 21, 12, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 12, 12, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 301, 33, textureX, textureY); // Box 80
		bodyModel[10] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 83
		bodyModel[11] = new ModelRendererTurbo(this, 17, 34, textureX, textureY); // Box 84
		bodyModel[12] = new ModelRendererTurbo(this, 35, 21, textureX, textureY); // Box 85
		bodyModel[13] = new ModelRendererTurbo(this, 52, 20, textureX, textureY); // Box 86
		bodyModel[14] = new ModelRendererTurbo(this, 18, 24, textureX, textureY); // Box 87
		bodyModel[15] = new ModelRendererTurbo(this, 18, 21, textureX, textureY); // Box 88
		bodyModel[16] = new ModelRendererTurbo(this, 18, 27, textureX, textureY); // Box 89
		bodyModel[17] = new ModelRendererTurbo(this, 59, 20, textureX, textureY); // Box 90
		bodyModel[18] = new ModelRendererTurbo(this, 301, 17, textureX, textureY); // Box 91
		bodyModel[19] = new ModelRendererTurbo(this, 73, 21, textureX, textureY); // Box 92
		bodyModel[20] = new ModelRendererTurbo(this, 66, 21, textureX, textureY); // Box 93
		bodyModel[21] = new ModelRendererTurbo(this, 284, 16, textureX, textureY); // Box 94
		bodyModel[22] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 125
		bodyModel[23] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 126
		bodyModel[24] = new ModelRendererTurbo(this, 287, 44, textureX, textureY); // Box 127
		bodyModel[25] = new ModelRendererTurbo(this, 15, 38, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 314, 32, textureX, textureY); // Box 129
		bodyModel[27] = new ModelRendererTurbo(this, 284, 32, textureX, textureY); // Box 130
		bodyModel[28] = new ModelRendererTurbo(this, 220, 20, textureX, textureY); // Box 131
		bodyModel[29] = new ModelRendererTurbo(this, 227, 21, textureX, textureY); // Box 132
		bodyModel[30] = new ModelRendererTurbo(this, 199, 21, textureX, textureY); // Box 133
		bodyModel[31] = new ModelRendererTurbo(this, 206, 21, textureX, textureY); // Box 134
		bodyModel[32] = new ModelRendererTurbo(this, 244, 21, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 213, 20, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 30, 12, textureX, textureY); // Box 137
		bodyModel[35] = new ModelRendererTurbo(this, 39, 12, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 308, 52, textureX, textureY); // Box 141
		bodyModel[37] = new ModelRendererTurbo(this, 329, 46, textureX, textureY); // Box 173
		bodyModel[38] = new ModelRendererTurbo(this, 308, 46, textureX, textureY); // Box 174
		bodyModel[39] = new ModelRendererTurbo(this, 12, 8, textureX, textureY); // Box 205
		bodyModel[40] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 206
		bodyModel[41] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 207
		bodyModel[42] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // Box 208
		bodyModel[43] = new ModelRendererTurbo(this, 6, 40, textureX, textureY); // Box 209
		bodyModel[44] = new ModelRendererTurbo(this, 3, 40, textureX, textureY); // Box 210
		bodyModel[45] = new ModelRendererTurbo(this, 292, 10, textureX, textureY); // Box 211
		bodyModel[46] = new ModelRendererTurbo(this, 292, 26, textureX, textureY); // Box 212
		bodyModel[47] = new ModelRendererTurbo(this, 9, 40, textureX, textureY); // Box 213
		bodyModel[48] = new ModelRendererTurbo(this, 3, 36, textureX, textureY); // Box 214
		bodyModel[49] = new ModelRendererTurbo(this, 12, 43, textureX, textureY); // Box 215

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-71F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(67F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-50F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(46F, 5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(-67F, 3F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[5].setRotationPoint(-50F, 4F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 130, 1, 18, 0F); // Box 18
		bodyModel[6].setRotationPoint(-65F, 3F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[7].setRotationPoint(-67F, 4F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[8].setRotationPoint(-67F, 4F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 80
		bodyModel[9].setRotationPoint(65F, 3F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 120, 1, 2, 0F); // Box 83
		bodyModel[10].setRotationPoint(-60F, 3F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 120, 1, 2, 0F); // Box 84
		bodyModel[11].setRotationPoint(-60F, 3F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[12].setRotationPoint(-67F, 4F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 86
		bodyModel[13].setRotationPoint(-60F, 4F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 120, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[14].setRotationPoint(-60F, 4F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[15].setRotationPoint(-67F, 4F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 120, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[16].setRotationPoint(-60F, 4F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 90
		bodyModel[17].setRotationPoint(-60F, 4F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 91
		bodyModel[18].setRotationPoint(-67F, 3F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 92
		bodyModel[19].setRotationPoint(-67F, 3F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 93
		bodyModel[20].setRotationPoint(-67F, 3F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 94
		bodyModel[21].setRotationPoint(-67F, 3F, 2F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 125
		bodyModel[22].setRotationPoint(-50F, 4F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 126
		bodyModel[23].setRotationPoint(46F, 4F, 2F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 127
		bodyModel[24].setRotationPoint(46F, 4F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 130, 1, 4, 0F); // Box 128
		bodyModel[25].setRotationPoint(-65F, 4F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[26].setRotationPoint(65F, 3F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[27].setRotationPoint(65F, 3F, 2F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 131
		bodyModel[28].setRotationPoint(59F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[29].setRotationPoint(60F, 4F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 133
		bodyModel[30].setRotationPoint(65F, 3F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 134
		bodyModel[31].setRotationPoint(65F, 3F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[32].setRotationPoint(60F, 4F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 136
		bodyModel[33].setRotationPoint(59F, 4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[34].setRotationPoint(63F, 4F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[35].setRotationPoint(63F, 4F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 66, 2, 4, 0F); // Box 141
		bodyModel[36].setRotationPoint(-33F, 5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 173
		bodyModel[37].setRotationPoint(-39F, 5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[38].setRotationPoint(33F, 5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[39].setRotationPoint(-67F, 0F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[40].setRotationPoint(63F, 0F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[41].setRotationPoint(63F, 0F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[42].setRotationPoint(-67F, 0F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 209
		bodyModel[43].setRotationPoint(-62.5F, -1F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 210
		bodyModel[44].setRotationPoint(-60.5F, -1F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[45].setRotationPoint(-67F, 2F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[46].setRotationPoint(56F, 2F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		bodyModel[47].setRotationPoint(-61.5F, -1F, 9F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 214
		bodyModel[48].setRotationPoint(-62.5F, -3F, 9F);

		bodyModel[49].addBox(-0.5F, -0.5F, 0F, 1, 4, 0, 0F); // Box 215
		bodyModel[49].setRotationPoint(-61.5F, -2F, 10.1F);
		bodyModel[49].rotateAngleZ = -0.52359878F;
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(GetColor(entity)==3249){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-3.0,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(6.0,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}