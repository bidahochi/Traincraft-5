//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: class74_detail_kit
// Model Creator: 
// Created on: 30.04.2024 - 21:38:48
// Last changed on: 30.04.2024 - 21:38:48

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;
import train.common.enums.BoxName;

public class Modelclass74_deets extends ModelConverter //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelclass74_deets() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 10, textureX, textureY); // Box 336 americano headlight cube
		bodyModel[1] = new ModelRendererTurbo(this, 17, 12, textureX, textureY, BoxName.lamp); // Box 337 Front headlight
		bodyModel[2] = new ModelRendererTurbo(this, 17, 12, textureX, textureY, BoxName.lamp); // Box 338 Front headlight
		bodyModel[3] = new ModelRendererTurbo(this, 40, 12, textureX, textureY, BoxName.lamp); // Box 479 markerlight
		bodyModel[4] = new ModelRendererTurbo(this, 40, 12, textureX, textureY, BoxName.lamp); // Box 480 markerlight
		bodyModel[5] = new ModelRendererTurbo(this, 6, 6, textureX, textureY); // Box 364 prime base
		bodyModel[6] = new ModelRendererTurbo(this, 6, 2, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[7] = new ModelRendererTurbo(this, 6, 2, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[8] = new ModelRendererTurbo(this, 6, 2, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[9] = new ModelRendererTurbo(this, 6, 2, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[10] = new ModelRendererTurbo(this, 6, 28, textureX, textureY); // Box 364 prime base
		bodyModel[11] = new ModelRendererTurbo(this, 6, 24, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[12] = new ModelRendererTurbo(this, 6, 24, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[13] = new ModelRendererTurbo(this, 6, 24, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[14] = new ModelRendererTurbo(this, 6, 24, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[15] = new ModelRendererTurbo(this, 33, 12, textureX, textureY, BoxName.ditch); // Box 359 ditchlight f down3
		bodyModel[16] = new ModelRendererTurbo(this, 24, 12, textureX, textureY, BoxName.ditch); // Box 360 ditchlight cull
		bodyModel[17] = new ModelRendererTurbo(this, 24, 12, textureX, textureY, BoxName.ditch); // Box 361 ditchlight cull
		bodyModel[18] = new ModelRendererTurbo(this, 33, 12, textureX, textureY, BoxName.ditch); // Box 362 ditchlight f down3
		bodyModel[19] = new ModelRendererTurbo(this, 4, 17, textureX, textureY); // Box 336 americano headlight cube
		bodyModel[20] = new ModelRendererTurbo(this, 17, 19, textureX, textureY, BoxName.lamp); // Box 337 Front headlight
		bodyModel[21] = new ModelRendererTurbo(this, 17, 19, textureX, textureY, BoxName.lamp); // Box 338 Front headlight
		bodyModel[22] = new ModelRendererTurbo(this, 40, 19, textureX, textureY, BoxName.lamp); // Box 479 markerlight
		bodyModel[23] = new ModelRendererTurbo(this, 40, 19, textureX, textureY, BoxName.lamp); // Box 480 markerlight
		bodyModel[24] = new ModelRendererTurbo(this, 33, 19, textureX, textureY, BoxName.ditch); // Box 359 ditchlight f down3
		bodyModel[25] = new ModelRendererTurbo(this, 24, 19, textureX, textureY, BoxName.ditch); // Box 360 ditchlight cull
		bodyModel[26] = new ModelRendererTurbo(this, 24, 19, textureX, textureY, BoxName.ditch); // Box 361 ditchlight cull
		bodyModel[27] = new ModelRendererTurbo(this, 33, 19, textureX, textureY, BoxName.ditch); // Box 362 ditchlight f down3
		bodyModel[28] = new ModelRendererTurbo(this, 2, 47, textureX, textureY); // Box 282
		bodyModel[29] = new ModelRendererTurbo(this, 15, 50, textureX, textureY); // Box 283
		bodyModel[30] = new ModelRendererTurbo(this, 2, 34, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 15, 37, textureX, textureY); // Box 322
		bodyModel[32] = new ModelRendererTurbo(this, 8, 24, textureX, textureY); // Box 361
		bodyModel[33] = new ModelRendererTurbo(this, 19, 26, textureX, textureY); // Box 362
		bodyModel[34] = new ModelRendererTurbo(this, 41, 37, textureX, textureY); // Box 512
		bodyModel[35] = new ModelRendererTurbo(this, 28, 34, textureX, textureY); // Box 513
		bodyModel[36] = new ModelRendererTurbo(this, 28, 47, textureX, textureY); // Box 514
		bodyModel[37] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 515
		bodyModel[38] = new ModelRendererTurbo(this, 45, 26, textureX, textureY); // Box 517
		bodyModel[39] = new ModelRendererTurbo(this, 34, 24, textureX, textureY); // Box 519

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 americano headlight cube
		bodyModel[0].setRotationPoint(-31.5F, -19F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front headlight
		bodyModel[1].setRotationPoint(-32.25F, -19F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front headlight
		bodyModel[2].setRotationPoint(-32.25F, -19F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.625F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F); // Box 479 markerlight
		bodyModel[3].setRotationPoint(-32.55F, -10F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 480 markerlight
		bodyModel[4].setRotationPoint(-32.55F, -10F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[5].setRotationPoint(-28F, -21F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[6].setRotationPoint(-28F, -21.5F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[7].setRotationPoint(-28F, -21.5F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[8].setRotationPoint(-28F, -21.5F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[9].setRotationPoint(-28F, -21.5F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[10].setRotationPoint(26F, -21F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[11].setRotationPoint(26F, -21.5F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[12].setRotationPoint(26F, -21.5F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[13].setRotationPoint(26F, -21.5F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[14].setRotationPoint(26F, -21.5F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f down3
		bodyModel[15].setRotationPoint(-33.75F, 1F, -7.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 ditchlight cull
		bodyModel[16].setRotationPoint(-33.5F, 1F, -7.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361 ditchlight cull
		bodyModel[17].setRotationPoint(-33.5F, 1F, 5.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 ditchlight f down3
		bodyModel[18].setRotationPoint(-33.75F, 1F, 5.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 americano headlight cube
		bodyModel[19].setRotationPoint(29.5F, -19F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front headlight
		bodyModel[20].setRotationPoint(30.75F, -19F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front headlight
		bodyModel[21].setRotationPoint(30.75F, -19F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 479 markerlight
		bodyModel[22].setRotationPoint(31.55F, -10F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.625F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 480 markerlight
		bodyModel[23].setRotationPoint(31.55F, -10F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f down3
		bodyModel[24].setRotationPoint(33.25F, 1F, -7.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 360 ditchlight cull
		bodyModel[25].setRotationPoint(31.5F, 1F, -7.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 361 ditchlight cull
		bodyModel[26].setRotationPoint(31.5F, 1F, 5.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 ditchlight f down3
		bodyModel[27].setRotationPoint(33.25F, 1F, 5.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[28].setRotationPoint(-35.5F, 7F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[29].setRotationPoint(-35.5F, 7F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(-34.5F, 5F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[31].setRotationPoint(-34.5F, 5F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 361
		bodyModel[32].setRotationPoint(-34.5F, 4F, 2F);

		bodyModel[33].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 362
		bodyModel[33].setRotationPoint(-34.5F, 4F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 512
		bodyModel[34].setRotationPoint(33.5F, 5F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 513
		bodyModel[35].setRotationPoint(33.5F, 5F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 514
		bodyModel[36].setRotationPoint(34.5F, 7F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 515
		bodyModel[37].setRotationPoint(34.5F, 7F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[38].setRotationPoint(33.5F, 4F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[39].setRotationPoint(33.5F, 4F, -8F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
	}
}