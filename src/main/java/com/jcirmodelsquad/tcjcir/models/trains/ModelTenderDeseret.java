//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.01.2024 - 06:26:58
// Last changed on: 19.01.2024 - 06:26:58

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTenderTruck3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelTenderDeseret extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelTenderDeseret() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 254
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 125
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 542
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 543
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 544
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 211
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 581
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 583
		bodyModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 584
		bodyModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 675
		bodyModel[11] = new ModelRendererTurbo(this, 497, 1, textureX, textureY, "cull"); // Box 52 cull steppy
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY, "cull"); // Box 53 cull steppy
		bodyModel[13] = new ModelRendererTurbo(this, 337, 9, textureX, textureY, "cull"); // Box 54 cull steppy
		bodyModel[14] = new ModelRendererTurbo(this, 345, 9, textureX, textureY, "cull"); // Box 54 cull steppy
		bodyModel[15] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 361, 9, textureX, textureY, "cull"); // Box 57
		bodyModel[17] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 58
		bodyModel[18] = new ModelRendererTurbo(this, 385, 9, textureX, textureY, "cull"); // Box 59
		bodyModel[19] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 548
		bodyModel[20] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 549
		bodyModel[21] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 550
		bodyModel[22] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 551
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 584
		bodyModel[24] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 585
		bodyModel[25] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 586
		bodyModel[26] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 552
		bodyModel[27] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 555
		bodyModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 579
		bodyModel[29] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 580
		bodyModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 559
		bodyModel[31] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 560
		bodyModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 561
		bodyModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 409, 9, textureX, textureY, "marker").setLightFixtureId("marker_body_34"); // Box 410 glow marker
		bodyModel[35] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 594
		bodyModel[36] = new ModelRendererTurbo(this, 441, 9, textureX, textureY, "marker").setLightFixtureId("marker_body_36"); // Box 595 glow marker
		bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 659
		bodyModel[38] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "cull"); // Box 660
		bodyModel[39] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 670
		bodyModel[40] = new ModelRendererTurbo(this, 193, 17, textureX, textureY, "cull"); // Box 175 cull
		bodyModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[42] = new ModelRendererTurbo(this, 313, 25, textureX, textureY, "cull"); // Box cull top grabs
		bodyModel[43] = new ModelRendererTurbo(this, 137, 17, textureX, textureY, "cull"); // Box cull coupler cut bar
		bodyModel[44] = new ModelRendererTurbo(this, 161, 25, textureX, textureY, "cull"); // Box cull coupler cut bar
		bodyModel[45] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 613
		bodyModel[48] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 351, 31, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 367, 38, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 351, 31, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 367, 38, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 215, 6, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 208, 6, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 124
		bodyModel[58] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 216

		bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[0].setRotationPoint(-27F, 2.5F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[1].setRotationPoint(-27F, 4.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 52, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 125
		bodyModel[2].setRotationPoint(-27F, 1.75F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 542
		bodyModel[3].setRotationPoint(-29F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 543
		bodyModel[4].setRotationPoint(25.5F, 3F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 544
		bodyModel[5].setRotationPoint(25F, 1.75F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[6].setRotationPoint(26F, 2.75F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 581
		bodyModel[7].setRotationPoint(-27F, 4.5F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 52, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[8].setRotationPoint(-27F, 2.5F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[9].setRotationPoint(-27F, 2.5F, -7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 53, 2, 4, 0F); // Box 675
		bodyModel[10].setRotationPoint(-27F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52 cull steppy
		bodyModel[11].setRotationPoint(-27F, 1.75F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 53 cull steppy
		bodyModel[12].setRotationPoint(-27F, 4.75F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54 cull steppy
		bodyModel[13].setRotationPoint(-27F, 1.75F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 54 cull steppy
		bodyModel[14].setRotationPoint(-27F, 4.75F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[15].setRotationPoint(23F, 1.75F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 57
		bodyModel[16].setRotationPoint(23F, 4.75F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[17].setRotationPoint(23F, 1.75F, 9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 59
		bodyModel[18].setRotationPoint(23F, 4.75F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 548
		bodyModel[19].setRotationPoint(-25F, -17.25F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[20].setRotationPoint(-24F, -17.25F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 550
		bodyModel[21].setRotationPoint(-25F, -17.25F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[22].setRotationPoint(-24F, -17.25F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 44, 19, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[23].setRotationPoint(-22F, -17.25F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 22, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 585
		bodyModel[24].setRotationPoint(22F, -20.25F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 44, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[25].setRotationPoint(-22F, -20.25F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 552
		bodyModel[26].setRotationPoint(-24F, -20.25F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[27].setRotationPoint(-24F, -20.25F, 10F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 579
		bodyModel[28].setRotationPoint(13.5F, -21F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 580
		bodyModel[29].setRotationPoint(-16.5F, -21F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 0, 14, 0F); // Box 559
		bodyModel[30].setRotationPoint(-27.5F, -1.5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[31].setRotationPoint(-27.5F, -1.5F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 561
		bodyModel[32].setRotationPoint(-27.5F, -1.5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(21.25F, -22F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[34].setRotationPoint(21.3F, -22.25F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[35].setRotationPoint(21.3F, -22F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 595 glow marker
		bodyModel[36].setRotationPoint(21.35F, -22.25F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 659
		bodyModel[37].setRotationPoint(22.5F, -11F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 660
		bodyModel[38].setRotationPoint(22.75F, -11F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[39].setRotationPoint(-29F, 0F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 25, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 cull
		bodyModel[40].setRotationPoint(23F, -24F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[41].setRotationPoint(22F, -24F, 3F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box cull top grabs
		bodyModel[42].setRotationPoint(-21.5F, -24F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box cull coupler cut bar
		bodyModel[43].setRotationPoint(25F, 0F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box cull coupler cut bar
		bodyModel[44].setRotationPoint(25F, 0F, 0F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 45
		bodyModel[45].setRotationPoint(-24F, -14F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 0, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(23F, -12F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 16, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[47].setRotationPoint(-25.25F, -16F, -10.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 16, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[48].setRotationPoint(-25.25F, -16F, 10.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 18, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 49
		bodyModel[49].setRotationPoint(22.25F, -18F, -10.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 18, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 50
		bodyModel[50].setRotationPoint(22.25F, -18F, 10.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 7, 15, 0F); // Box 2
		bodyModel[51].setRotationPoint(26.1F, 2F, -7.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 0, 15, 0F); // Box 2
		bodyModel[52].setRotationPoint(26.1F, 9F, -7.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 15, 0F); // Box 53
		bodyModel[53].setRotationPoint(26.1F, 2F, -7.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 0, 15, 0F); // Box 54
		bodyModel[54].setRotationPoint(26.1F, 9F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-27.5F, 0F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyModel[56].setRotationPoint(-27.5F, 0F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[57].setRotationPoint(-17F, 4.5F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 216
		bodyModel[58].setRotationPoint(12F, 4.5F, -2F);
	}
	ModelTenderTruck3 truck = new ModelTenderTruck3();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(ModelRendererTurbo m :bodyModel) {
			if((m.boxName.equals("lamp") || m.boxName.equals("marker"))){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/wp_threeaxletendertruck.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.95F, 0.0F, 0F);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.875F, 0.0F, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}