//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.05.2025 - 10:55:24
// Last changed on: 16.05.2025 - 10:55:24

package com.jcirmodelsquad.tcjcir.models.detailkits; //Path where the model is located


import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;

public class Modelb30_booster_bits extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelb30_booster_bits() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 221, 213, textureX, textureY); // Box 455 booster roof
		bodyModel[1] = new ModelRendererTurbo(this, 219, 205, textureX, textureY); // Box 456 booster roof
		bodyModel[2] = new ModelRendererTurbo(this, 221, 199, textureX, textureY); // Box 457 booster roof
		bodyModel[3] = new ModelRendererTurbo(this, 244, 206, textureX, textureY, "cull"); // Box 458 cull booster cab
		bodyModel[4] = new ModelRendererTurbo(this, 286, 209, textureX, textureY, "cull"); // Box 459 cull booster handrails
		bodyModel[5] = new ModelRendererTurbo(this, 286, 203, textureX, textureY); // Box 460 booster stairs
		bodyModel[6] = new ModelRendererTurbo(this, 295, 203, textureX, textureY); // Box 461 booster stairs
		bodyModel[7] = new ModelRendererTurbo(this, 300, 202, textureX, textureY); // Box 288 booster front gyralight mount
		bodyModel[8] = new ModelRendererTurbo(this, 316, 201, textureX, textureY, "lamp"); // Box 289 gyralight booster front R
		bodyModel[9] = new ModelRendererTurbo(this, 309, 201, textureX, textureY, "lamp"); // Box 290 gyralight booster front L
		bodyModel[10] = new ModelRendererTurbo(this, 282, 199, textureX, textureY); // Box 216 booster lightkit
		bodyModel[11] = new ModelRendererTurbo(this, 275, 201, textureX, textureY, "lamp"); // Box 215 headlight booster front 1
		bodyModel[12] = new ModelRendererTurbo(this, 275, 201, textureX, textureY, "lamp"); // Box 217 headlight booster front 2
		bodyModel[13] = new ModelRendererTurbo(this, 315, 212, textureX, textureY); // Box 414 booster ssw e gyra holdy rear
		bodyModel[14] = new ModelRendererTurbo(this, 316, 207, textureX, textureY, "lamp"); // Box 415 ssw e gyra reart booster
		bodyModel[15] = new ModelRendererTurbo(this, 316, 217, textureX, textureY, "cull"); // Box 416 cull booster ssw e gyra holdy front
		bodyModel[16] = new ModelRendererTurbo(this, 300, 220, textureX, textureY, "cull"); // Box 471 cull booster ratchet brake housing
		bodyModel[17] = new ModelRendererTurbo(this, 307, 220, textureX, textureY); // Box 43 booster ratchet brake
		bodyModel[18] = new ModelRendererTurbo(this, 308, 223, textureX, textureY); // Box 43 booster ratchet brake
		bodyModel[19] = new ModelRendererTurbo(this, 231, 219, textureX, textureY); // Box 388 numberboard booster HOLDER
		bodyModel[20] = new ModelRendererTurbo(this, 231, 219, textureX, textureY); // Box 389 numberboard booster HOLDER
		bodyModel[21] = new ModelRendererTurbo(this, 231, 227, textureX, textureY, "lamp"); // Box 388 numberboard booster
		bodyModel[22] = new ModelRendererTurbo(this, 231, 227, textureX, textureY, "lamp"); // Box 389 numberboard booster
		bodyModel[23] = new ModelRendererTurbo(this, 224, 222, textureX, textureY, "lamp"); // Box 307 glowey marker booster
		bodyModel[24] = new ModelRendererTurbo(this, 224, 222, textureX, textureY, "lamp"); // Box 308 glowey marker booster
		bodyModel[25] = new ModelRendererTurbo(this, 224, 227, textureX, textureY, "lamp"); // Box 307 glowey marker booster ssw
		bodyModel[26] = new ModelRendererTurbo(this, 224, 227, textureX, textureY, "lamp"); // Box 308 glowey marker booster ssw

		bodyModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455 booster roof
		bodyModel[0].setRotationPoint(-33F, -21F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 456 booster roof
		bodyModel[1].setRotationPoint(-33F, -21F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457 booster roof
		bodyModel[2].setRotationPoint(-33F, -21F, 3F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 15, 14, 0F); // Box 458 cull booster cab
		bodyModel[3].setRotationPoint(-33F, -20F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 459 cull booster handrails
		bodyModel[4].setRotationPoint(-33F, -13F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 460 booster stairs
		bodyModel[5].setRotationPoint(-37F, -3F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 461 booster stairs
		bodyModel[6].setRotationPoint(-37F, -5F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 288 booster front gyralight mount
		bodyModel[7].setRotationPoint(-39.25F, -20.25F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight booster front R
		bodyModel[8].setRotationPoint(-39.5F, -20.2F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight booster front L
		bodyModel[9].setRotationPoint(-39.5F, -20.2F, 0F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216 booster lightkit
		bodyModel[10].setRotationPoint(-38.5F, -18.25F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight booster front 1
		bodyModel[11].setRotationPoint(-39.25F, -18.25F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight booster front 2
		bodyModel[12].setRotationPoint(-39.25F, -16.25F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 414 booster ssw e gyra holdy rear
		bodyModel[13].setRotationPoint(-40.02F, -22.6F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415 ssw e gyra reart booster
		bodyModel[14].setRotationPoint(-40.02F, -22.6F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.05F, 0.3F, 0F, 0.05F, 0.3F, 0F, 0.05F, 0.3F, -0.5F, 0.05F, 0.3F, 0.5F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F); // Box 416 cull booster ssw e gyra holdy front
		bodyModel[15].setRotationPoint(-39.01F, -22.76F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 471 cull booster ratchet brake housing
		bodyModel[16].setRotationPoint(-36F, -13F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43 booster ratchet brake
		bodyModel[17].setRotationPoint(-35.5F, -12.5F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43 booster ratchet brake
		bodyModel[18].setRotationPoint(-35F, -10.5F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F); // Box 388 numberboard booster HOLDER
		bodyModel[19].setRotationPoint(-39.5F, -18F, 1.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 numberboard booster HOLDER
		bodyModel[20].setRotationPoint(-39.5F, -18F, -6.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F); // Box 388 numberboard booster
		bodyModel[21].setRotationPoint(-39.5F, -18F, 1.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.15F, -0.1F, -0.1F); // Box 389 numberboard booster
		bodyModel[22].setRotationPoint(-39.5F, -18F, -6.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker booster
		bodyModel[23].setRotationPoint(-38.85F, -14.7F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker booster
		bodyModel[24].setRotationPoint(-38.85F, -14.7F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 307 glowey marker booster ssw
		bodyModel[25].setRotationPoint(-38.25F, -18.7F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 glowey marker booster ssw
		bodyModel[26].setRotationPoint(-38.25F, -18.7F, 4F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

	}
}